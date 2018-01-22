package org.xendra.material;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.logging.Level;

import org.compiere.model.MClient;
import org.compiere.model.MPeriod;
import org.compiere.model.MTable;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Column;
import org.compiere.model.persistence.X_AD_Table;
import org.compiere.model.persistence.X_A_Machine;
import org.compiere.model.persistence.X_C_DocType;
import org.compiere.model.persistence.X_C_Period;
import org.compiere.model.persistence.X_M_MaterialPolicy;
import org.compiere.model.persistence.X_M_Product;
import org.compiere.model.persistence.X_M_Transaction;
import org.compiere.model.reference.REF_M_TransactionTransactionType;
import org.compiere.util.CLogger;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.compiere.util.Trx;
import org.xendra.Constants;
import org.xendra.common.Lock;
import org.xendra.cost.Cost;
import org.xendra.utils.Rotdash;

//with test as (select m_transaction_id, 
//case when m_inventoryline_id > 0 then 
//(select docstatus from m_inventory i join m_inventoryline il on i.m_inventory_id = il.m_inventory_id AND il.m_inventoryline_id = m_transaction.m_inventoryline_id)
//when m_inoutline_id > 0 then
//(select docstatus from m_inout io join m_inoutline iol on io.m_inout_id = iol.m_inout_id AND iol.m_inoutline_id = m_transaction.m_inoutline_id)
//when m_movementline_id > 0 then
//(select docstatus from m_movement m join m_movementline ml on m.m_movement_id = ml.m_movement_id AND ml.m_movementline_id = m_transaction.m_movementline_id)
//end as docstatus from m_transaction)
//update m_transaction set docstatus = test.docstatus from test where m_transaction.m_transaction_id = test.m_transaction_id

public class MaterialPolicy extends X_M_MaterialPolicy implements Runnable {	
	// start
	public static MaterialPolicy get(MClient client, int frequencystart) {
		MaterialPolicy mp = null;
		if (policies.containsKey(client.getAD_Client_ID()))
			mp = policies.get(client.getAD_Client_ID());		
		mp = new MaterialPolicy(Env.getCtx(), client.getM_MaterialPolicy_ID(), null);
		mp.setClient(client);
		mp.setFrequencyStartAt(frequencystart);
		String error = mp.configure();
		if (error.length() > 0)
		{
			System.out.println(String.format("ERROR:%s", error));
			return null;
		}
		policies.put(client.getAD_Client_ID(), mp);
		return mp;
	}

	private int m_frequencystart = 23;

	private void setFrequencyStartAt(int frequencystart) {
		if (frequencystart == 0)
			frequencystart = 23;
		m_frequencystart = frequencystart;		
	}

	private void setClient(MClient client) {
		m_client = client;		
	}

	public void setManager(MaterialManager kernel) {
		m_manager = kernel;		
	}

	public MaterialPolicy(Properties ctx, int M_MaterialPolicy_ID,	String trxName) {
		super(ctx, M_MaterialPolicy_ID, trxName);
	}

	private List<CommandStatus> streams = new ArrayList<CommandStatus>();
	private boolean m_configure = false;
	private List<String> dtiocost = new ArrayList<String>();
	private List<String> dtonlycost = new ArrayList<String>();
	private List<String> dtonlyio = new ArrayList<String>();
	private MClient m_client = null;
	private List<X_C_DocType> doctypes = new ArrayList<X_C_DocType>();	 
	private List<Vector> startpoints = null;
	private List<Vector> tablestocost = new ArrayList<Vector>();
	private boolean start = false;
	private boolean end = false;
	float count = 0;
	float counttotal = 0;
	float percent = 0;
	float periodpercent = 0;
	int percentpoint = 0;
	private MaterialManager m_manager;
	private MPeriod m_periodFrom;
	private MPeriod m_periodTo;	
	private HashMap sqlcommands = new HashMap();
	protected final Lock lock = new Lock("policy");
	X_A_Machine machine = Env.getServerMaterial();
	private MPeriod currentperiod;
	private List<MPeriod> Periods = null;
	private List<Integer> periodids = new ArrayList<Integer>();	
	private List<Integer> products = new ArrayList<Integer>();
	private static HashMap<Integer, MaterialPolicy> policies = new HashMap();
	protected CLogger	log = CLogger.getCLogger(getClass());
	//private String m_policystatus;

	@Override
	public void run() {
		startpoints = new ArrayList<Vector>();			
		List<Integer> listperiods = new ArrayList<Integer>();
		HashMap<Integer, Integer> periodids = new HashMap<Integer, Integer>();		
		while (true)
		{
			Rotdash rotdash = Rotdash.getInstance();
			updatestorage();
			synchronize();
			List<MPeriod> periods = getPeriods();
			for (MPeriod period:periods)
			{				
				rotdash.setMessage(String.format("Search products in %s %s", m_client.getName() ,period.getName()));
				//m_manager.setPolicyMsg("costing "+period.getName());
				if (!listperiods.contains(period.getC_Period_ID()))
					listperiods.add(period.getC_Period_ID());
				periodids.put(period.getC_Period_ID(), updateCost(doctypes, period));
			}						
			//rotdash.setPercent(0);
			float record = 1;
			//rotdash.setMessage(String.format("processing products %s", m_client.getName()));
			String error = "";
			Iterator it = products.iterator();
			while (it.hasNext())
			{
				Integer M_Product_ID = (Integer) it.next();			
				StockWorker sw = new StockWorker();
				sw.addProperty(Constants.COLUMNNAME_AD_Client_ID, m_client.getAD_Client_ID());
				sw.addProperty(X_M_Product.COLUMNNAME_M_Product_ID,M_Product_ID);
				sw.addProperty(X_C_Period.COLUMNNAME_C_Period_ID, listperiods);			
				sw.setMachine(machine);
				sw.setCommand(StockWorker.Product);
				error = sw.Pull();
				if (error.length() > 0)
				{
					rotdash.setMessage(error);
					rotdash.setPercent(0);
					break;
				}
				else
				{		
					int percent =  (int) ((record / products.size())*100);
					rotdash.setPercent(percent);
				}
				record ++;				
				it.remove();
			}
			rotdash.stop();
			if (error.length() == 0)
			{
				updatestorage();
				long now = System.currentTimeMillis();
				Calendar cal0 = Calendar.getInstance();
				cal0.setTime(new Timestamp(now));
				cal0.set(Calendar.HOUR_OF_DAY, m_frequencystart);
				cal0.set(Calendar.MINUTE, 0);
				cal0.set(Calendar.SECOND, 0);
				cal0.set(Calendar.MILLISECOND, 0);
				long next = cal0.getTimeInMillis();
				if (next < now)
				{
					cal0.add(Calendar.DATE, 1);
					next = cal0.getTimeInMillis();
				}
				long m_sleepMS = next - now;
				try {
					log.log(Level.WARNING, String.format("material policy %s suspend", this.getName()));
					Thread.sleep(m_sleepMS);					
					log.log(Level.WARNING, String.format("material policy %s start", this.getName()));
				} catch (InterruptedException e) {
					e.printStackTrace();
				}							
			}
		}
	}

	//	@Override
	//	public void run() {					
	//		updatestorage();
	//		synchronize();
	//		startpoints = new ArrayList<Vector>();
	//		List<MPeriod> periods = getPeriods();		
	//		List<Integer> listperiods = new ArrayList<Integer>();
	//		HashMap<Integer, Integer> periodids = new HashMap<Integer, Integer>();
	//		Rotdash rotdash = Rotdash.getInstance();
	//		for (MPeriod period:periods)
	//		{				
	//			rotdash.setMessage(String.format("Search products in %s %s", m_client.getName() ,period.getName()));
	//			m_manager.setPolicyMsg("costing "+period.getName());
	//			listperiods.add(period.getC_Period_ID());
	//			periodids.put(period.getC_Period_ID(), updateCost(doctypes, period));
	//		}				
	//		rotdash.setPercent(0);
	//		float record = 1;
	//		//rotdash.setMessage(String.format("processing products %s", m_client.getName()));
	//		String error = "";
	//		Iterator it = products.iterator();
	//		while (it.hasNext())
	//		{
	//			Integer M_Product_ID = (Integer) it.next();			
	//			StockWorker sw = new StockWorker();
	//			sw.addProperty(Constants.COLUMNNAME_AD_Client_ID, m_client.getAD_Client_ID());
	//			sw.addProperty(X_M_Product.COLUMNNAME_M_Product_ID,M_Product_ID);
	//			sw.addProperty(X_C_Period.COLUMNNAME_C_Period_ID, listperiods);			
	//			sw.setMachine(machine);
	//			sw.setCommand(StockWorker.Product);
	//			error = sw.Pull();
	//			if (error.length() > 0)
	//			{
	//				rotdash.setMessage(error);
	//				rotdash.setPercent(0);
	//				break;
	//			}
	//			else
	//			{		
	//				int percent =  (int) ((record / products.size())*100);
	//				rotdash.setPercent(percent);
	//			}
	//			record ++;				
	//			it.remove();
	//		}
	//		rotdash.stop();
	//		if (error.length() == 0)
	//		{
	//			updatestorage();
	//			long now = System.currentTimeMillis();
	//			Calendar cal0 = Calendar.getInstance();
	//			cal0.setTime(new Timestamp(now));
	//			cal0.set(Calendar.HOUR_OF_DAY, m_frequencystart);
	//			cal0.set(Calendar.MINUTE, 0);
	//			cal0.set(Calendar.SECOND, 0);
	//			cal0.set(Calendar.MILLISECOND, 0);
	//			long next = cal0.getTimeInMillis();
	//			if (next < now)
	//			{
	//				cal0.add(Calendar.DATE, 1);
	//				next = cal0.getTimeInMillis();
	//			}
	//			long m_sleepMS = next - now;
	//			try {
	//				Thread.sleep(m_sleepMS);
	//			} catch (InterruptedException e) {
	//				e.printStackTrace();
	//			}							
	//			m_frequencystart = 1;
	//			end = true;
	//			while (true)
	//			{					
	////				synchronized(lock) {
	////					while (periodids.size() == 0)
	////					{
	////						try {						
	////							lock.wait();
	////						} catch(Exception e) {}  // ignored on purpose
	////					}
	////				}
	//				try {
	//					Thread.sleep(1000);
	//				} catch (InterruptedException e) {
	//					e.printStackTrace();
	//				}
	//				//for (Integer period:periodids)
	//				Iterator keys = periodids.keySet().iterator();
	//				while (keys.hasNext())				
	//				{
	//					Integer period = (Integer) keys.next();					
	//					Integer hash = (Integer) periodids.get(period);					
	//					//Map.Entry map = keys.get
	//					//String key = (String)keys.next();		
	//					if (currentperiod == null)
	//					{
	//						currentperiod = new MPeriod(Env.getCtx(), period, null);
	//					}
	//					else if (period < currentperiod.getC_Period_ID())
	//					{
	//						currentperiod = new MPeriod(Env.getCtx(), period, null);
	//					}
	//				}
	//				//periodids.clear();			
	//				while (currentperiod != null)
	//				{
	//					System.out.println(currentperiod.getC_Period_ID());
	//					if (currentperiod.getC_Period_ID() == 1000526)
	//						System.out.println("X");
	//					int hash = updateCost(doctypes, currentperiod);
	//					int phash = periodids.get(currentperiod.getC_Period_ID());
	//					Timestamp startdate = currentperiod.getEndDate();
	//					Calendar cal = Calendar.getInstance();
	//					cal.setTime(startdate);
	//					cal.add(Calendar.DATE, 1);
	//					cal.set(Calendar.MILLISECOND, 0);
	//					startdate = new Timestamp(cal.getTime().getTime());
	//					currentperiod = new Query(Env.getCtx(), X_C_Period.Table_Name, "startdate = ?", null)
	//					.setParameters(startdate).first();				
	//				}			
	//				Rotdash.getInstance().end();
	//				log.log(Level.WARNING, String.format("activado material policy %s", this.getName()));
	//
	//			}
	//		}
	//	}

	private void synchronize() {
		if (isSynchronized())
		{
			try {
				Rotdash rotdash = Rotdash.getInstance();				
				int no = 0;
				rotdash.setMessage(String.format("Synchronizing Transaction"));
				no = DB.executeUpdate(String.format("UPDATE m_transaction set processed = 'N', seqno = null,errormsg = null WHERE AD_Client_ID = %d", m_client.getAD_Client_ID()), null);
				no = DB.executeUpdate(String.format("UPDATE m_transaction set c_period_id = (SELECT c_period_id from c_period where movementdate between startdate and enddate and ad_client_id = %d) where c_period_id isnull AND AD_Client_ID = %d",m_client.getAD_Client_ID(), m_client.getAD_Client_ID()), null);
				rotdash.setMessage(String.format("Synchronizing CostCalc"));
				no = DB.executeUpdate(String.format("DELETE FROM M_COSTCALC where ad_client_id = %d", m_client.getAD_Client_ID()), null);
				rotdash.setMessage(String.format("Synchronizing StorageMonthly"));
				no = DB.executeUpdate(String.format("DELETE FROM M_STORAGEMONTHLY where ad_client_id = %d", m_client.getAD_Client_ID()), null);
				rotdash.setMessage(String.format("Synchronizing Product Costing"));
				no = DB.executeUpdate(String.format("DELETE FROM M_PRODUCT_COSTING where ad_client_id = %d", m_client.getAD_Client_ID()), null);
				rotdash.stop();
				setSynchronized(false);
				save();
			}
			catch (Exception e)
			{

			}
		}
	}

	private void updatestorage() {
		if (isSynchStorage())
		{
			try {
				float records = DB.getSQLValue(null, "SELECT count(*) FROM m_transaction_diff_v");
				//records = 0;
				if (records > 0)
				{
					Rotdash rotdash = Rotdash.getInstance();
					rotdash.setMessage(String.format("fix inconsistent in storage"));
					StringBuilder sql = new StringBuilder("SELECT ")
					.append(String.format("%s", X_M_Transaction.COLUMNNAME_M_Product_ID))
					.append("  FROM m_transaction_diff_v");
					PreparedStatement pstmt = DB.prepareStatement(sql.toString(), null);
					ResultSet rs = pstmt.executeQuery();
					float record = 0;
					while (rs.next())
					{
						int M_Product_ID = rs.getInt(1);
						m_manager.storageupdate(M_Product_ID);
						StockWorker sw = new StockWorker();
						int percent =  (int) ((record / records)*100);
						rotdash.setPercent(percent);
						record++;
					}	
					if (pstmt != null)
						pstmt.close();
					if (rs != null)
						rs.close();
					rotdash.stop();
				}
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}							
		}
	}

	private int updateCost(List<X_C_DocType> doctypes, MPeriod period) {
		int hash = startcost(period);
		try
		{									
			PreparedStatement pstmt = null;
			ResultSet rs = null;				
			StringBuilder sql = new StringBuilder("SELECT DISTINCT M_Product_ID ")
			.append(" FROM m_transaction  WHERE c_period_id = ? AND processed='N' AND AD_Client_ID = ? ");
			pstmt = DB.prepareStatement(sql.toString(), null);
			pstmt.setInt(1, period.getC_Period_ID());
			pstmt.setInt(2, m_client.getAD_Client_ID());
			rs = pstmt.executeQuery();
			while (rs.next())
			{
				int M_Product_ID = rs.getInt(1);
				if (!products.contains(M_Product_ID))
					products.add(M_Product_ID);
			}
			//
			if (pstmt != null)
				pstmt.close();
			if (rs != null)
				rs.close();			
			//			
		}			
		catch (Exception e)
		{
			e.printStackTrace();

		}			
		return hash;
	}

	private String addDocTypeString(String pre, List<String> docs)
	{
		StringBuilder str = new StringBuilder(pre);
		for (String dbt:docs)
		{
			if (str.length() > 0)
				str.append(",");
			str.append(String.format("'%s'", dbt));
		}		
		return str.toString();
	}

	private void fill(List<String> dtiocost2, String key) {
		String keyname = (String) getProperties().get(key);
		if (keyname != null)
		{
			StringTokenizer tok = new StringTokenizer(keyname,",");
			while (tok.hasMoreTokens()) {
				String t = tok.nextToken();
				dtiocost2.add(t);
			}
		}		
	}

	private String configure() {
		HashMap properties = getProperties();
		String error = "";
		if (properties == null || properties.size() == 0)
		{
			error = "PropertiesList invalid";
			return error;
		}
		StringTokenizer tok;
		try {			
			fill(dtiocost, "dtiocost");
			fill(dtonlycost, "dtonlycost");
			fill(dtonlyio, "dtonlyio");
			List<X_C_DocType> doctypelist = new Query(Env.getCtx(), X_C_DocType.Table_Name, "AD_Client_ID = ? AND IsActive='Y'", null)
			.setParameters(m_client.getAD_Client_ID())
			.list();
			for (X_C_DocType doctype:doctypelist)
			{
				if (dtiocost.contains(doctype.getDocBaseType()))
				{
					doctypes.add(doctype);
					doctype.setTransactionType(REF_M_TransactionTransactionType.MovementAndCost);
					doctype.save();					
				}
				else if (dtonlycost.contains(doctype.getDocBaseType()))
				{
					doctypes.add(doctype);
					doctype.setTransactionType(REF_M_TransactionTransactionType.OnlyCost);
					doctype.save();					
				}
				else if (dtonlyio.contains(doctype.getDocBaseType()))
				{
					doctypes.add(doctype);
					doctype.setTransactionType(REF_M_TransactionTransactionType.OnlyMovement);
					doctype.save();
				}
				else
				{
					doctype.setTransactionType(null);
					doctype.save();
				}
			}
			//			String sqliocost = getsql(dtiocost, REF_M_TransactionTransactionType.MovementAndCost);
			//			String sqlonlycost = getsql(dtonlycost,REF_M_TransactionTransactionType.OnlyCost);
			//			String sqlonlyio = getsql(dtonlyio, REF_M_TransactionTransactionType.OnlyMovement);
			//			setDocType(doctypelist, dtiocost, "dtiocost");
			//			setDocType(doctypelist, dtonlycost, "dtonlycost");
			//			setDocType(doctypelist, dtonlyio, "dtonlyio");
			//			String str = "";
			//			str = addDocTypeString(str, dtiocost);
			//			str = addDocTypeString(str, dtonlyio);
			//			str = addDocTypeString(str, dtonlycost);
			//			String where = String.format("DocBaseType in (%s) AND IsActive='Y'",str);
			//			doctypes = new Query(Env.getCtx(), X_C_DocType.Table_Name, where, null).list();
			//			if (doctypes.size() == 0)
			//			{
			//				System.out.println("necesita definir que tipos de documentos estan afectos a costo");
			//			}
			//
			// sql
			String seqnoorder = (String) properties.get("seqno");
			String docadjust = (String) properties.get("adjust");
			if (seqnoorder == null)
				seqnoorder =  "movementdate,line";
			//			UpdateSeqNo = new StringBuilder("with test as (select rank() over (partition by m_product_id ")
			//			.append("order by ").append(seqnoorder).append(") as seqno,")
			//			.append("m_transaction_id from m_transaction where m_product_id = ? order by ").append(seqnoorder).append(")")
			//			.append("update m_transaction set seqno = test.seqno from test ")
			//			.append("where test.m_transaction_id = m_transaction.m_transaction_id and docstatus = 'CO' AND COALESCE(m_transaction.seqno,0) = 0");			
			//
			String tbls = (String) properties.get("tables");
			tok = new StringTokenizer(tbls,",");
			List<MTable> tables = new ArrayList<MTable>();
			List<String> dates = new ArrayList<String>();
			while (tok.hasMoreTokens()) {
				String t = tok.nextToken();
				MTable table = MTable.get(Env.getCtx(), t);
				tables.add(table);
			}
			String date = (String) properties.get("dates");
			tok = new StringTokenizer(date,",");
			while (tok.hasMoreTokens()) {
				String t = tok.nextToken();
				dates.add(t);
			}
			int i = 0;
			for (MTable table:tables)
			{
				String t = dates.get(i);
				Vector costitem = new Vector();
				costitem.add(table);
				costitem.add(t);
				tablestocost.add(costitem);
				i++;
			}
			m_configure = true;
			return error;
		}
		catch (Exception e)
		{
			error = e.getMessage();
			return error;
		}
	}

	private int startcost(MPeriod period) {
		int hash = 0;
		// primero todos los registros que correspondan al m_transaction
		String str = getText("docbasetype");
		float percentperiodtotal = 0;
		float percentperiod = 0;
		for (Vector costelement:tablestocost)
		{
			String childtable = "";
			String sqlcount = new String("SELECT COUNT(*) FROM ");
			MTable table = (MTable) costelement.get(0);
			String date = (String) costelement.get(1);
			X_AD_Column column = new Query(Env.getCtx(), X_AD_Column.Table_Name, String.format("columnname = '%s_ID' AND isparent = 'Y'", table.getTableName()), null)
			.first();
			if (column != null)
			{
				X_AD_Table tablechild = new Query(Env.getCtx(), X_AD_Table.Table_Name, "AD_Table_ID = ?", null)
				.setParameters(column.getAD_Table_ID()).first();
				if (tablechild != null)
				{
					// en el caso de que se haya eliminado registros en el m_transaction y que ya esten procesadas
					// esto lo encuentra y marca como no procesado y hacia adelante resetea para reprocesamiento				
					StringBuffer sqlfilter = new StringBuffer(tablechild.getTableName()).append(" zzchild ")
							.append(" JOIN "+table.getTableName()).append(String.format(" zz on zz.%s_ID=zzchild.%s_ID ",table.getTableName(), table.getTableName()))
							.append(" JOIN C_PERIOD p on zz."+date+"::date BETWEEN p.startdate AND p.enddate AND p.c_period_id = ? ")														
							.append(" JOIN C_DocType dt on zz.c_doctype_id = dt.c_doctype_id AND docbasetype in (").append(str).append(")")
							.append(" AND zz.AD_Client_ID=? AND zz.Processed='Y'")
							.append(" AND zz.iscosted = 'Y'")
							.append(" AND zz.DocStatus in ('CO','CL') AND zz.IsActive='Y'")
							.append(String.format(" AND NOT EXISTS( SELECT 1 FROM m_transaction t WHERE zzchild.%s_ID = t.%s_ID )",tablechild.getTableName(), tablechild.getTableName()));					
					int count = DB.getSQLValue(null, String.format("%s %s",sqlcount, sqlfilter), 
							period.getC_Period_ID(), 
							m_client.getAD_Client_ID());
					if (count > 0)
					{
						PreparedStatement pstmt = null;
						try
						{
							pstmt = DB.prepareStatement(String.format("%s %s", String.format("SELECT M_Product_ID, zz.%s_ID from ", table.getTableName()), sqlfilter), null);
							pstmt.setInt(1, period.getC_Period_ID());
							pstmt.setInt(2, m_client.getAD_Client_ID());
							ResultSet rs = pstmt.executeQuery();
							while (rs.next())
							{							
								int ProductID = rs.getInt(X_M_Product.COLUMNNAME_M_Product_ID);
								int ID = rs.getInt(String.format("%s_ID",table.getTableName()));								
								int no = DB.executeUpdate(String.format("UPDATE %s set iscosted = 'N' where %s_id = %s", table.getTableName(), table.getTableName(), ID), null);
								if (no == 1)
								{								
									MaterialManager.resetproduct(period.getC_Period_ID(), 
															     m_periodTo.getC_Period_ID(),
															     m_client.getAD_Client_ID(), 
															     ProductID);
								}
							}
							rs.close();						
						}
						catch (Exception e)
						{
							e.printStackTrace();
						}
						finally {
							DB.close(pstmt);
						}									
					}
				}								
			}			
			//select * from ad_column where columnname = 'M_Production_ID' AND isparent = 'Y'			
			// es importante considerar el ::date de lo contrario no considerara las fechas limites del periodo en su totalidad
			// por la hora.						
			StringBuffer sqlfilter = new StringBuffer(table.getTableName()).append(" zz ")
					.append(" JOIN C_PERIOD p on zz."+date+"::date BETWEEN p.startdate AND p.enddate AND p.c_period_id = ? ")
					.append(" JOIN C_DocType dt on zz.c_doctype_id = dt.c_doctype_id AND docbasetype in (").append(str).append(")")
					.append(" AND zz.AD_Client_ID=?")
					.append(" AND zz.Processed='Y' AND COALESCE(zz.IsCosted,'N')='N' AND zz.DocStatus in ('CO','CL','VO') AND zz.IsActive='Y'");			
			//.append(" ORDER BY zz."+date);		
			//String sqlcount = 
			//m_manager.setPolicyMsg(table.getTableName());
			//StringBuffer sql = new StringBuffer ("SELECT ").append("dt.transactiontype,").append(" * FROM ").append(sqlfilter).append(" ORDER BY zz."+date);
			StringBuffer sql = new StringBuffer ("SELECT * FROM ").append(sqlfilter).append(" ORDER BY zz."+date);
			//
			int countError = 0;
			count = 0;
			PreparedStatement pstmt = null;
			try
			{
				pstmt = DB.prepareStatement(String.format("%s %s", sqlcount, sqlfilter), null);
				pstmt.setInt(1, period.getC_Period_ID());
				pstmt.setInt(2, m_client.getAD_Client_ID());
				ResultSet rs = pstmt.executeQuery();
				if (rs.next())
				{
					counttotal = rs.getInt(1);
				}
				rs.close();
				hash += (int) counttotal;
				if (counttotal == 0)
				{
					log.finer(getName() + ": " + table.getTableName() + " - no work");
					//m_manager.setPolicyMsgln("(no records found)");
					percentperiod++;
					percentperiodtotal = (percentperiod /  tablestocost.size()) * 100;					
					continue;
				}
				//
				pstmt = DB.prepareStatement(sql.toString(), null);
				pstmt.setInt(1, period.getC_Period_ID());
				pstmt.setInt(2, m_client.getAD_Client_ID());
				rs = pstmt.executeQuery();				
				Trx m_trx = Trx.get(Trx.createTrxName("AcctProcess"), true);
				Rotdash rotdash = Rotdash.getInstance();
				while (rs.next())
				{
					count++;
					boolean ok = true;
					try
					{
						Cost doc = Cost.get (m_client.getAD_Client_ID(), period, table.getAD_Table_ID(), rs, m_trx.getTrxName());
						if (doc == null)
						{
							log.severe(getName() + ": No Doc for " + table.getTableName());
							ok = false;
						}
						else
						{
							//log.log(Level.INFO, "Posting document " + doc.get_ID() + " of table " + doc.get_TableName());
							String error ="";
							//reset(table.getTableName(), doc.get_ID(), m_trx.getTrxName());
							error = doc.post(true, true);   //  post no force/repost			
							if (error != null)
							{
								log.log(Level.INFO, error);
								m_trx.rollback();
							}
							else
							{
								m_trx.commit();								
								for (Vector startpoint:doc.getstartpoints())
								{
									startpoints.add(startpoint);
								}
							}
							ok = error == null;
							if (!ok)
								countError++;							
						}
					}
					catch (Exception e)
					{
						//log.log(Level.SEVERE, getName() + ": " + table.getTableName(), e);
						e.printStackTrace();
						m_trx.rollback();
						ok = false;
					}
					percent = ( count / counttotal ) * 100;
					if (Math.round(percent) != percentpoint)
						rotdash.setPercent(Math.round(percent));	
					percentpoint = Math.round(percent);					
					if (percent == 100)
						System.out.println("");					
				}
				m_trx.close();
				rs.close();
				rotdash.stop();
			}
			catch (Exception e)
			{
				log.log(Level.SEVERE, sql.toString(), e);
			}
			finally {
				DB.close(pstmt);
			}									
			percentperiod++;
			percentperiodtotal = (percentperiod /  tablestocost.size()) * 100;			
		}
		if (startpoints.size() > 0)
		{
			for (Vector point:startpoints)
			{						
				Integer locator = (Integer) point.get(0);
				Timestamp date = (Timestamp) point.get(1);
				System.out.println("locator:"+locator);
				String movementdate = new SimpleDateFormat("yyyy/MM/dd").format(date);
				String sqlstart = String.format("UPDATE xendra.M_Transaction set IsActive = 'N' WHERE AD_Client_ID = %d AND C_Period_ID = %d  AND M_Locator_ID = %d AND MovementDate <= '%s' AND  COALESCE(inventorytype,'') != 'I' ", m_client.getAD_Client_ID(), period.getC_Period_ID(),locator, movementdate);
				int no = DB.executeUpdate(sqlstart, null);							
				System.out.println(no);
			}									
		}	
		return hash;
	}

	private String getText(String key) {
		String command = "";
		if (sqlcommands.containsKey(key))
			command = (String) sqlcommands.get(key);
		else if (key.equals("docbasetype")) 
		{
			StringBuilder str = new StringBuilder();
			for (String dbt:dtiocost)
			{
				if (str.length() > 0)
					str.append(",");
				str.append(String.format("'%s'", dbt));
			}					
			for (String dbt:dtonlycost)
			{
				if (str.length() > 0)
					str.append(",");
				str.append(String.format("'%s'", dbt));
			}
			for (String dbt:dtonlyio)
			{
				if (str.length() > 0)
					str.append(",");
				str.append(String.format("'%s'",dbt));
			}
			command = str.toString();
			sqlcommands.put("docbasetype", command);
		}
		else if (key.equals("sqlin"))
		{
			String sqlin = " CASE ";
			String sqliocost = getsql(dtiocost, REF_M_TransactionTransactionType.MovementAndCost);
			String sqlonlycost = getsql(dtonlycost,REF_M_TransactionTransactionType.OnlyCost);
			String sqlonlyio = getsql(dtonlyio, REF_M_TransactionTransactionType.OnlyMovement);
			sqlin += sqliocost;			
			if (sqlonlycost.length() > 0)
				sqlin += sqlonlycost;
			if (sqlonlyio.length() > 0)
				sqlin += sqlonlyio;
			if (sqlin.length() > 0)
				sqlin += " END as "+X_M_Transaction.COLUMNNAME_TransactionType+",";
			else
				sqlin = "'' as tt,";					
			command = sqlin;
			sqlcommands.put("sqlin", command);
		}
		return command;
	}

	private String getsql(List<String> dt, String tt) {
		String sql = "";
		if (dt != null && dt.size() > 0)
		{				
			for (String dbt:dt)
			{
				if (sql.length() > 0)
					sql += ",";
				else
					sql = "WHEN docbasetype in (";
				sql += "'"+dbt+"'";
			}
			sql +=") THEN "+String.format("'%s' ", tt);
		}
		return sql;
	}
	/**
	 * 	Reset Accounting Table and update count
	 *	@param TableName table
	 */
	private void reset (String TableName, int Record_ID, String trxName)
	{
		String sql = "UPDATE " + TableName
				+ " SET IsCosted ='N' WHERE "+TableName + "_ID =" + Record_ID
				+ " AND (IsCosted NOT IN ('Y','N') OR IsCosted IS NULL) AND Processed='Y'";
		int invalid = DB.executeUpdate(sql, trxName);
		if (invalid != 0)
			log.fine(TableName + " - Invalid=" + invalid);		
	}	//	reset	

	public List<MPeriod> getPeriods() {
		if (m_periodFrom == null)
		{
			MPeriod periodFrom = new Query(getCtx(), X_C_Period.Table_Name, "date(?) BETWEEN startdate AND enddate AND AD_Client_ID = ?", null)
			.setParameters(getStartDate(), m_client.getAD_Client_ID()).setOrderBy("C_Period_ID").first();
			log.log(Level.WARNING, String.format("%s periodo inicio %s", getName(), periodFrom.getName()));
			m_periodFrom = periodFrom;
		}		
		MPeriod periodTo = new Query(getCtx(), X_C_Period.Table_Name, "date(?) BETWEEN startdate AND enddate AND AD_Client_ID = ?", null)
		.setParameters(new Timestamp(System.currentTimeMillis()), m_client.getAD_Client_ID()).setOrderBy("C_Period_ID").first();
		log.log(Level.WARNING, String.format("%s periodo  termino %s", getName(), periodTo.getName()));
		if (m_periodTo == null)
		{
			m_periodTo = periodTo;
			//periodTo = new Query(getCtx(), X_C_Period.Table_Name, "enddate = (select max(enddate) from c_period where ad_client_ID = ?)", null)
			//.setParameters(m_client.getAD_Client_ID()).setOrderBy("C_Period_ID").first();
		}
		if (!periodTo.equals(m_periodTo))
		{
			Periods = new Query(getCtx(), X_C_Period.Table_Name, "startdate >= ? AND enddate <= ? AND AD_Client_ID = ?", null)
			.setParameters(m_periodFrom.getStartDate(), periodTo.getEndDate(), m_client.getAD_Client_ID())				
			.setOrderBy("startdate")
			.list();			
			m_periodTo = periodTo;
		}
		if (Periods == null)
		{
			if ( m_periodFrom != null || m_periodTo != null ||  !periodTo.equals(m_periodTo) )
			{
				Periods = new Query(getCtx(), X_C_Period.Table_Name, "startdate >= ? AND enddate <= ? AND AD_Client_ID = ?", null)
				.setParameters(m_periodFrom.getStartDate(), periodTo.getEndDate(), m_client.getAD_Client_ID())				
				.setOrderBy("startdate")
				.list();

				m_periodTo = periodTo;
			}
		}
		return Periods;
	}

	public void add(StockWorker sw) {		
		int C_Period_ID = sw.getIntProperty(X_C_Period.COLUMNNAME_C_Period_ID);		
		if (C_Period_ID > 0)
		{	
			if (!periodids.contains(C_Period_ID))			
				periodids.add(C_Period_ID);
			if (!end)
				return;
			synchronized(lock) {					
				lock.notifyAll();
			}
		}
	}

	//public void register(OutputStream os) {
	public void register(CommandStatus commandStatus) {
		streams.add(commandStatus);
		//streams.add(os);	
	}
	public void printstatus(String text)
	{		
		try {
			for (CommandStatus status:streams)
			{
				//String policystatus = String.format("%s\n", text);
				CostMap cm = new CostMap();
				cm.setAD_Client_ID(1000027);
				status.os.writeObject(cm);
				//status.os.write(policystatus.getBytes());
				//status.os.flush();
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
