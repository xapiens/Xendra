package org.xendra.material;

import info.monitorenter.gui.chart.Chart2D;
import info.monitorenter.gui.chart.IAxis;
import info.monitorenter.gui.chart.IAxisScalePolicy;
import info.monitorenter.gui.chart.ITrace2D;
import info.monitorenter.gui.chart.axis.AAxis;
import info.monitorenter.gui.chart.axis.AxisLinear;
import info.monitorenter.gui.chart.labelformatters.LabelFormatterDate;
import info.monitorenter.gui.chart.labelformatters.LabelFormatterNumber;
import info.monitorenter.gui.chart.traces.Trace2DSorted;

import java.io.OutputStream;
import java.math.BigDecimal;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.logging.Level;
import java.util.Properties;

import org.compiere.model.MClient;
import org.compiere.model.MDocType;
import org.compiere.model.MPeriod;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Table;
import org.compiere.model.persistence.X_A_Machine;
import org.compiere.model.persistence.X_A_MachineServer;
import org.compiere.model.persistence.X_C_Order;
import org.compiere.model.persistence.X_C_Period;
import org.compiere.model.persistence.X_M_CostCalc;
import org.compiere.model.persistence.X_M_CostElement;
import org.compiere.model.persistence.X_M_InOut;
import org.compiere.model.persistence.X_M_InOutLine;
import org.compiere.model.persistence.X_M_Product;
import org.compiere.model.persistence.X_M_Product_Costing;
import org.compiere.model.persistence.X_M_Production;
import org.compiere.model.persistence.X_M_ProductionLine;
import org.compiere.model.persistence.X_M_ProductionPlan;
import org.compiere.model.persistence.X_M_StorageElement;
import org.compiere.model.persistence.X_M_StorageMonthly;
import org.compiere.model.persistence.X_M_Transaction;
import org.compiere.model.persistence.X_M_TransactionPeriod;
import org.compiere.model.reference.REF_ServerType;
import org.compiere.server.XendraServer;
import org.compiere.util.CLogger;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.xendra.Constants;
import org.xendra.common.Lock;
import org.xendra.cost.Cost;


public class MaterialManager implements Runnable {
	/**	The Servers				*/
	private ArrayList<XendraServer>	m_servers = new ArrayList<XendraServer>();
	private HashMap costelements = new HashMap();
	private HashMap storageelements = new HashMap();
	private Properties		m_ctx = Env.getCtx();
	private HashMap globalresults = new HashMap();
	private HashMap products = new HashMap();
	private Chart2D globalchart;
	private static HashMap m_materialpolicy = new HashMap();
	//final ITrace2D global = new Trace2DLtd(12);
	final ITrace2D global = new Trace2DSorted();
	private static MaterialManager instance;
	private static Lock mmlock = new Lock("mm");
	private static CLogger 	log = CLogger.getCLogger(MaterialManager.class);
	//private static Thread lpdThread;	
	private int size = 10;
	protected final Lock lock;
	//private String m_policymsg;
	private StockQueue queue = new StockQueue();
	//private MClient m_client;	


	//public MaterialManager(MClient client) {
	public MaterialManager() {
		lock = new Lock("queue");
		synchronized(lock) {
			//m_client = client;
			//Env.setContext(Env.getCtx(), "#AD_Client_ID", m_client.getAD_Client_ID());
			List<X_M_CostElement> ce = new Query(Env.getCtx(), X_M_CostElement.Table_Name, "IsActive = 'Y'", null)
			.list();
			int ces = 0;
			for (X_M_CostElement costelement:ce)
			{
				String calcfunction = (String) costelement.getProperties().get("function");
				if (calcfunction != null)
				{
					costelements.put(costelement.getM_CostElement_ID(), calcfunction);
					ces++;
				}
			}
			List<X_M_StorageElement> se = new Query(Env.getCtx(), X_M_StorageElement.Table_Name, "IsActive = 'Y'", null)			
			.list();
			for (X_M_StorageElement storageelement:se)
			{
				String calcfunction = (String) storageelement.getProperties().get("function");
				if (calcfunction != null)
				{
					storageelements.put(storageelement.getM_StorageElement_ID(), calcfunction);
				}			
			}
		}
	}

	public static MaterialManager getInstance() {
		synchronized(mmlock) {
			if (instance == null)
			{			
				instance = new MaterialManager();
				Thread manager = new Thread(instance);
				manager.setName("MaterialManager");
				manager.start();						
				log.log(Level.WARNING, "starting Material Manager");
				//				X_A_MachineServer ms = new Query(Env.getCtx(), X_A_MachineServer.Table_Name, "servertype = ? ", null)
				//				.setParameters(REF_ServerType.MaterialServer).first();
				//
				//				if (ms == null)
				//				{
				//					ms = new X_A_MachineServer(Env.getCtx(), 0, null);
				//					ms.setServerType(REF_ServerType.MaterialServer);
				//				}
				//
				//				if (ms.getA_Machine_ID() != Env.getMachine().getA_Machine_ID())
				//				{
				//					ms.setA_Machine_ID(Env.getMachine().getA_Machine_ID());
				//					ms.save();
				//				}
			}		
		}
		return instance;
	}

	public MaterialPolicy getPolicy(int AD_Client_ID) {
		return (MaterialPolicy) m_materialpolicy.get(AD_Client_ID);
	}

	public static MaterialManager get(MClient client, int frequencystart) {
		if (client.getM_MaterialPolicy_ID() == 0)
		{
			log.log(Level.WARNING, String.format("ERROR: %s no tiene seleccionado su politica de material", client.getName()));			
			return null;
		}		
		X_A_Machine machine = Env.getServerMaterial();
		try 
		{
			Socket socket = new Socket();
			socket.connect(new InetSocketAddress(machine.getName(), Constants.materialport), 1000);
			socket.close();
		}
		catch (Exception e)
		{
			log.log(Level.WARNING, String.format("ERROR: no existe conexion al servidor %s", machine.getName()));
			return null;
		}		
		MaterialPolicy materialpolicy = MaterialPolicy.get(client, frequencystart);
		if (materialpolicy == null)
		{
			log.log(Level.WARNING, String.format("ERROR: %s no tiene Material Policy definido", client.getName()));
			return null;
		}
		if (!m_materialpolicy.containsKey(client.getAD_Client_ID()))
		{
			materialpolicy.setManager(instance);
			m_materialpolicy.put(client.getAD_Client_ID(), materialpolicy);			
			Thread policy = new Thread(materialpolicy);
			policy.setName(String.format("MaterialPolicy %s",client.getName()));
			log.log(Level.WARNING, String.format("agregando material policy para %s", client.getName()));
			policy.start();							
		}				
		return instance;
	}

	@Override
	public void run() {
		while (true) {
			synchronized(lock) {
				// start spin lock
				while(0 == queue.getsize()) {
					try {
						lock.wait();
						//Thread.sleep(1000);
					} catch(InterruptedException e) {}  // ignored on purpose
				}
				try {		
					QueuedStockJob currentJob = queue.getNextJob();
					if (currentJob.getStockWorker().getCommand().equals(StockWorker.Product))
					{
						if(process(currentJob)) {
							queue.remove(currentJob.getJobId());
						}										
						else
						{
							queue.remove(currentJob.getJobId());
							//QueuedStockJob qsj = new QueuedStockJob();
							StockWorker sw = currentJob.getStockWorker();
							int proc = sw.getIntProperty(X_M_Transaction.COLUMNNAME_Processed);
							proc++;
							if (proc < 5)
							{
								sw.addProperty(X_M_Transaction.COLUMNNAME_Processed, proc);
								queue.add(sw);
							}
						}
					}
					else if (currentJob.getStockWorker().getCommand().equals(StockWorker.Document))					
					{
						if(processDocument(currentJob)) {
							queue.remove(currentJob.getJobId());
						}																				
					}
					//					else if (currentJob.getStockWorker().getCommand().equals(StockWorker.EndOfPeriod))
					//					{
					//						if (EndofPeriod(currentJob)) {
					//							queue.remove(currentJob.getJobId());
					//						}
					//					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			} // end synchronized
		}
	}

	private boolean processDocument(QueuedStockJob currentJob) {
		try {
			StockWorker sw = currentJob.getStockWorker();
			int AD_Client_ID = sw.getIntProperty(Constants.COLUMNNAME_AD_Client_ID);
			int AD_Table_ID = sw.getIntProperty(X_AD_Table.COLUMNNAME_AD_Table_ID);
			String DocStatus = sw.getStringProperty(X_C_Order.COLUMNNAME_DocStatus);
			if (AD_Table_ID == X_M_InOut.Table_ID)
			{
				int M_InOut_ID = sw.getIntProperty(X_M_InOut.COLUMNNAME_M_InOut_ID);
				X_M_InOut io = new Query(Env.getCtx(), X_M_InOut.Table_Name, "M_InOut_ID = ?", null)
				.setParameters(M_InOut_ID).first();
				int intents = 0;
				while (!io.getDocStatus().equals(DocStatus) && intents < 10)
				{
					try {
						Thread.sleep(1000);
						io.load(null);
						intents++;
					} catch (Exception e) {
						e.printStackTrace();
					}				
				}
				if (io.getDocStatus().equals(DocStatus))
				{
					List<Integer> periods = sw.getListProperty(X_C_Period.COLUMNNAME_C_Period_ID);
					List<X_M_InOutLine> lines = new Query(Env.getCtx(), X_M_InOutLine.Table_Name, "M_InOut_ID = ?", null)
					.setParameters(io.getM_InOut_ID()).list();					
					Integer trxcount = 0;					
					for (X_M_InOutLine line:lines)
					{
						X_M_Transaction t = new Query(Env.getCtx(), X_M_Transaction.Table_Name, "M_InOutLine_ID = ?", null)
						.setParameters(line.getM_InOutLine_ID()).first();
						if (t != null)
						{
							trxcount++;
							if (t.isProcessed())
							{
								t.setProcessed(false);
								t.save();
							}
						}
					}
					if (trxcount != lines.size())
					{
						MPeriod period = MPeriod.get(Env.getCtx(), io.getMovementDate(), 0, AD_Client_ID);
						Cost.postImmediate (AD_Client_ID, period, X_M_InOut.Table_ID, io.getM_InOut_ID(), false, null);								
					}
					for (X_M_InOutLine line:lines)
					{

						if (periods.size() > 1)
						{
							reset(line.getM_Product_ID(), periods);
						}
						StockWorker sw2 = new StockWorker();
						sw2.addProperty(Constants.COLUMNNAME_AD_Client_ID, AD_Client_ID);
						sw2.addProperty(X_M_Transaction.COLUMNNAME_C_Period_ID,  periods);
						sw2.addProperty(X_M_Transaction.COLUMNNAME_M_Product_ID, line.getM_Product_ID());					
						QueuedStockJob qs = new QueuedStockJob(1, sw2);
						process(qs);						
					}					
				}
			}
			else if (AD_Table_ID == X_M_Production.Table_ID)
			{
				int M_Production_ID = sw.getIntProperty(X_M_Production.COLUMNNAME_M_Production_ID);
				X_M_Production io = new Query(Env.getCtx(), X_M_Production.Table_Name, "M_Production_ID = ?", null)				
				.setParameters(M_Production_ID).first();								
				//MPeriod period = MPeriod.get(Env.getCtx(), io.getMovementDate(), 0);
				//Cost.postImmediate (m_client, period, X_M_Production.Table_ID, io.getM_Production_ID(), false, null);				
				int intents = 0;
				while (!io.getDocStatus().equals(DocStatus) && intents < 10)
				{
					try {
						Thread.sleep(1000);
						intents++;
					} catch (Exception e) {
						e.printStackTrace();
					}				
				}				
				if (io.getDocStatus().equals(DocStatus))
				{
					List<Integer> periods = sw.getListProperty(X_C_Period.COLUMNNAME_C_Period_ID);
					List<X_M_ProductionPlan> plans = new Query(Env.getCtx(), X_M_ProductionPlan.Table_Name, "M_Production_ID = ?", null)
					.setParameters(io.getM_Production_ID()).list();
					for (X_M_ProductionPlan plan:plans)
					{
						Integer trxcount = 0;			
						List<X_M_ProductionLine> lines = new Query(Env.getCtx(), X_M_ProductionLine.Table_Name, "M_ProductionPlan_ID = ?", null)
						.setParameters(plan.getM_ProductionPlan_ID()).list();
						for (X_M_ProductionLine line:lines)
						{
							X_M_Transaction t = new Query(Env.getCtx(), X_M_Transaction.Table_Name, "M_ProductionLine_ID = ?", null)
							.setParameters(line.getM_ProductionLine_ID()).first();
							if (t != null)
							{
								trxcount++;
								if (t.isProcessed())
								{
									t.setProcessed(false);
									t.save();
								}
							}
						}					
						if (trxcount != lines.size())
						{
							MPeriod period = MPeriod.get(Env.getCtx(), io.getMovementDate(), 0);
							Cost.postImmediate (AD_Client_ID, period, X_M_Production.Table_ID, io.getM_Production_ID(), false, null);								
						}
						for (X_M_ProductionLine line:lines)
						{
							if (periods.size() > 1)
							{
								reset(line.getM_Product_ID(), periods);
							}
							StockWorker sw2 = new StockWorker();
							sw2.addProperty(Constants.COLUMNNAME_AD_Client_ID, AD_Client_ID);
							sw2.addProperty(X_M_Transaction.COLUMNNAME_C_Period_ID,  periods);
							sw2.addProperty(X_M_Transaction.COLUMNNAME_M_Product_ID, line.getM_Product_ID());					
							QueuedStockJob qs = new QueuedStockJob(1, sw2);
							process(qs);							
						}
					}
				}				
			}			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return true;
	}

	private void reset(Integer M_Product_ID, List<Integer> periods)
	{
		Integer[] params = new Integer[periods.size()+1];
		params[0] = M_Product_ID;
		int x = 1;
		for (Integer period:periods)
		{
			params[x] = period;
			x++;
		}
		String strperiods = "";
		for (Integer period:periods)
		{
			if (strperiods.length() > 0)
				strperiods += ",";
			strperiods += "?";			
		}
		String where = String.format("M_Product_ID = ? AND C_Period_ID IN (%s)",strperiods);
		List<X_M_Transaction> transactions = new Query(Env.getCtx(), X_M_Transaction.Table_Name, where , null)
		.setClient_ID()
		.setParameters(params).list();
		//.setParameters(M_Product_ID, periodids).list();
		for (X_M_Transaction transaction:transactions)
		{
			transaction.setProcessed(false);
			transaction.save();
		}
		//
		List<X_M_CostCalc> listcostcalc = new Query(Env.getCtx(), X_M_CostCalc.Table_Name, where, null)
		.setClient_ID()
		.setParameters(params).list();
		for (X_M_CostCalc costcalc:listcostcalc)
		{
			costcalc.delete(true);				
		}

		List<X_M_StorageMonthly> storagemonthly =  new Query(Env.getCtx(), X_M_StorageMonthly.Table_Name, where, null)
		.setClient_ID()
		.setParameters(params).list();
		for (X_M_StorageMonthly sm:storagemonthly)
		{
			sm.delete(true);
		}

		List<X_M_Product_Costing> pcs = new Query(Env.getCtx(), X_M_Product_Costing.Table_Name, where, null)
		.setClient_ID()
		.setParameters(params).list();
		for (X_M_Product_Costing pc:pcs)
		{
			pc.delete(true);
		}								
	}
	// Search for the last Period of the list of product for each product
	// in case the last period is equal to the period to close, does nothing
	// in case the last period is different, copy the values to the current period.
	//	private boolean EndofPeriod(QueuedStockJob currentJob) {
	//		StockWorker sw = currentJob.getStockWorker();
	//		int C_Period_ID = sw.getIntProperty(X_C_Period.COLUMNNAME_C_Period_ID);
	//		int count = sw.getIntProperty("count");
	//		int sameperiod = 0;
	//		MPeriod period = MPeriod.get(Env.getCtx(), C_Period_ID);
	//		Iterator it = products.entrySet().iterator();
	//		while (it.hasNext())
	//		{
	//			Map.Entry map = (Entry) it.next();
	//			Integer Product_ID = (Integer) map.getKey();
	//			Integer Period_ID = (Integer) map.getValue();
	//			if (Period_ID.equals(C_Period_ID))
	//			{
	//				sameperiod++;
	//				continue;
	//			}
	//			String where = "C_Period_ID = ? AND M_Product_ID = ?";
	//			X_M_Product_Costing pc = new Query(Env.getCtx(), X_M_Product_Costing.Table_Name, where, null)
	//			.setParameters(Period_ID, Product_ID).first();
	//
	//			X_M_Product_Costing newpc = new Query(Env.getCtx(), X_M_Product_Costing.Table_Name, where, null)
	//			.setParameters(C_Period_ID, Product_ID).first();
	//			if (newpc == null)
	//			{
	//				newpc = new X_M_Product_Costing(Env.getCtx(), 0, null);			
	//				if (pc != null)
	//				{
	//					newpc.copyValues(pc, newpc);				
	//				}
	//				newpc.setC_Period_ID(period.getC_Period_ID());
	//				newpc.setPriceLastInv(BigDecimal.ZERO);
	//				newpc.setPriceLastPO(BigDecimal.ZERO);
	//				newpc.setTotalInvAmt(BigDecimal.ZERO);
	//				newpc.setTotalInvQty(BigDecimal.ZERO);				
	//				newpc.save();
	//			}								
	//		}
	//		try {
	//			// get the signature after the process
	//			PreparedStatement pstmt = null;
	//			ResultSet rs = null;						
	//			pstmt = DB.prepareStatement(sql.PRODUCTCOSTINGDIFF, null);
	//			pstmt.setInt(1, C_Period_ID);
	//			pstmt.setInt(2, C_Period_ID);
	//			rs = pstmt.executeQuery();
	//			while (rs.next())
	//			{
	//				int M_Product_ID = rs.getInt(1);			
	//				// TODO
	//				// funcion que calcularia el product_costing
	//			}	
	//			if (pstmt != null)
	//				pstmt.close();
	//			if (rs != null)
	//				rs.close();
	//		}
	//		catch (Exception e)
	//		{
	//			e.printStackTrace();
	//		}				
	//		if (sameperiod != count)
	//		{
	//			System.out.println("X");
	//		}
	//		return true;
	//	}

	private boolean process(QueuedStockJob currentJob) {
		boolean ok = true;
		try {
			StockWorker sw = currentJob.getStockWorker();
			Integer M_Product_ID = sw.getIntProperty(X_M_Product.COLUMNNAME_M_Product_ID);
			Iterator it = costelements.entrySet().iterator();
			while (it.hasNext())
			{
				Map.Entry map = (Entry) it.next();
				Integer M_CostElement_ID = (Integer) map.getKey();
				String function = (String) map.getValue();
				if (!callCostProcedure(M_CostElement_ID, function, currentJob))
					throw new Exception();
			}
			it = storageelements.entrySet().iterator();
			while (it.hasNext())
			{
				Map.Entry map = (Entry) it.next();
				Integer M_StorageElement_ID = (Integer) map.getKey();
				String function = (String) map.getValue();
				if (!callStorageProcedure(M_StorageElement_ID, function, currentJob))
					throw new Exception();
			}	
		}
		catch (Exception e)
		{
			ok = false;
		}
		return ok;
	}

	private boolean callStorageProcedure(Integer M_StorageElement_ID, String function, QueuedStockJob job) {
		boolean ok = true;
		try {
			StockWorker sw = job.getStockWorker();
			List<Integer> periods = sw.getListProperty(X_C_Period.COLUMNNAME_C_Period_ID);
			for (Integer period:periods)
			{
				CallableStatement stmt = null;
				try {
					stmt = DB.prepareCall(function, ResultSet.CONCUR_READ_ONLY, null);
					//stmt.setInt(1, sw.getIntProperty(X_C_Period.COLUMNNAME_C_Period_ID));
					stmt.setInt(1, period);
					stmt.setInt(2, sw.getIntProperty(X_M_Product.COLUMNNAME_M_Product_ID));
					stmt.setInt(3, sw.getIntProperty(Constants.COLUMNNAME_AD_Client_ID));			
					stmt.execute();
					stmt.close();
				}
				catch (Exception e)
				{
					if (stmt != null)
						stmt.close();				
					throw new Exception();
				}
			}
		}
		catch (Exception e)
		{
			ok = false;
		}
		return ok;
	}

	private boolean callCostProcedure(Integer M_CostElement_ID, String function, QueuedStockJob job) {
		boolean ok = true;
		try {			
			StockWorker sw = job.getStockWorker();
			int pid = sw.getIntProperty(X_M_Product.COLUMNNAME_M_Product_ID);			
			boolean reset = sw.getBooleanProperty(Constants.RESET);
			List<Integer> periods = sw.getListProperty(X_C_Period.COLUMNNAME_C_Period_ID);
			if (reset)
			{
				resetproduct(periods.get(0),periods.get(periods.size()-1),
						sw.getIntProperty(Constants.COLUMNNAME_AD_Client_ID),
						sw.getIntProperty(X_M_Product.COLUMNNAME_M_Product_ID));
			}															
			for (Integer period:periods)
			{
				int state = 0;
				CallableStatement stmt = null;
				try {
					stmt = DB.prepareCall(function, ResultSet.CONCUR_READ_ONLY, null);
					stmt.setInt(2, sw.getIntProperty(Constants.COLUMNNAME_AD_Client_ID));
					stmt.setInt(3, sw.getIntProperty(X_M_Product.COLUMNNAME_M_Product_ID));
					stmt.setInt(4, M_CostElement_ID);
					//stmt.setInt(5, sw.getIntProperty(X_C_Period.COLUMNNAME_C_Period_ID));
					stmt.setInt(5, period);
					stmt.registerOutParameter(1, java.sql.Types.INTEGER);
					stmt.execute();
					state = stmt.getInt(1);
					stmt.close();
				}
				catch (Exception e)
				{
					if (stmt != null)
						stmt.close();				
					throw new Exception();
				}
			}
		}		
		catch (Exception e)
		{
			ok = false;
		}	
		return ok;
	}

	public static void resetproduct(int C_Period_From, int C_Period_To,  int AD_Client_ID, int M_Product_ID) {
		try {
			CallableStatement stmt = null;
			String function = "{call resetcostproduct(?, ?, ?, ?)}";
			stmt = DB.prepareCall(function, ResultSet.CONCUR_READ_ONLY, null);
			stmt.setInt(1, C_Period_From);
			stmt.setInt(2, C_Period_To);
			stmt.setInt(3, AD_Client_ID);
			stmt.setInt(4, M_Product_ID);
			stmt.execute();
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		//		List<X_M_Transaction> transactions = new Query(Env.getCtx(), X_M_Transaction.Table_Name, "M_Product_ID = ? AND C_Period_ID = ?", null)
		//		.setClient_ID()
		//		.setParameters(M_Product_ID, C_Period_ID).list();
		//		for (X_M_Transaction transaction:transactions)
		//		{
		//			transaction.setProcessed(false);
		//			transaction.save();
		//		}
		//		//
		//		List<X_M_CostCalc> listcostcalc = new Query(Env.getCtx(), X_M_CostCalc.Table_Name, "M_Product_ID = ? AND C_Period_ID = ?", null)
		//		.setClient_ID()
		//		.setParameters(M_Product_ID, C_Period_ID).list();
		//		for (X_M_CostCalc costcalc:listcostcalc)
		//		{
		//			costcalc.delete(true);				
		//		}
		//
		//		List<X_M_StorageMonthly> storagemonthly =  new Query(Env.getCtx(), X_M_StorageMonthly.Table_Name, "M_Product_ID = ? AND C_Period_ID = ?", null)
		//		.setClient_ID()
		//		.setParameters(M_Product_ID, C_Period_ID).list();
		//		for (X_M_StorageMonthly sm:storagemonthly)
		//		{
		//			sm.delete(true);
		//		}
		//
		//		List<X_M_Product_Costing> pcs = new Query(Env.getCtx(), X_M_Product_Costing.Table_Name, "M_Product_ID = ? AND C_Period_ID = ?", null)
		//		.setClient_ID()
		//		.setParameters(M_Product_ID, C_Period_ID).list();
		//		for (X_M_Product_Costing pc:pcs)
		//		{
		//			pc.delete(true);
		//		}								
	}

	public void setglobalpoint(Timestamp pos, BigDecimal Amount)
	{		
		if (Amount.compareTo(BigDecimal.ZERO) > 0)
		{
			globalresults.put(pos, Amount);
			updateglobal();
		}
	}

	public void setglobal(Chart2D chart) {		
		IAxis< ? > xAxis = chart.getAxisX();
		//xAxis.setFormatter(new LabelFormatterDate(new SimpleDateFormat("HH:mm:ss")));
		xAxis.setFormatter(new LabelFormatterDate(new SimpleDateFormat("yyyy-MM-dd")));		
		AAxis<IAxisScalePolicy> yAxis = new AxisLinear<IAxisScalePolicy>();
		NumberFormat format = new DecimalFormat("#");
		format.setMaximumIntegerDigits(3);
		yAxis.setFormatter(new LabelFormatterNumber(format));		
		chart.setAxisXBottom(yAxis, 0);
		chart.addTrace(global);
		updateglobal();
		globalchart = chart;
	}
	public void updateglobal()
	{
		global.removeAllPoints();
		Iterator iter = globalresults.entrySet().iterator();
		while (iter.hasNext())
		{
			Map.Entry map = (Entry) iter.next();
			Timestamp position = (Timestamp) map.getKey();			
			BigDecimal value = (BigDecimal) map.getValue();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			String date = sdf.format(position);
			System.out.println(String.format(" %s %s", date, value));
			global.addPoint(position.getTime(), value.doubleValue());			
		}		
	}
	//	public Lock getLock()
	//	{
	//		return lock;
	//	}	
	public int getQueueSize() {
		return size;
	}
	public void setQueueSize(int size) {
		this.size = size;
	}
	//	public void setPolicyMsg(String msg) {
	//		m_policymsg += msg ;		
	//	}	
	//	public void setPolicyMsgln(String msg) {
	//		m_policymsg += msg + "\n";		
	//	}
	public void add(StockWorker sw) {
		synchronized(lock) {
			queue.add(sw);			
			lock.notifyAll();
		}
	}

	public void EndofPeriod(StockWorker sw) {
		synchronized(lock) {
			queue.add(sw);			
			lock.notifyAll();
		}		
	}	

	public void wakeupPolicy() {		

	}
	//public boolean signatureChanged(Integer C_Period_ID, Integer M_Product_ID, String trxName) {
	public boolean signatureChanged(int AD_Client_ID, Integer C_Period_ID, Integer M_Product_ID) {
		//String error = "";
		boolean changed = false;
		String signature = "";

		String dbsignature = "";

		X_M_TransactionPeriod tp = new Query(Env.getCtx(), X_M_TransactionPeriod.Table_Name, "C_Period_ID = ? AND M_Product_ID = ?", null)
		.setParameters(C_Period_ID, M_Product_ID).first();
		if (tp != null) // has movement
		{
			StringBuilder sql = new StringBuilder()
			.append("SELECT md5(sum(movementqty)::character varying || SUM(CASE WHEN docstatus = 'CO' or docstatus = 'CL' then 1 else 0 end)::character varying)") 
			.append(" FROM m_transaction WHERE c_period_id = ?  AND AD_Client_ID = ? AND M_Product_ID = ? ")
			.append(" GROUP BY M_Product_ID ");
			dbsignature = DB.getSQLValueString(null, sql.toString(), C_Period_ID, AD_Client_ID, M_Product_ID );
			if (dbsignature == null)
				dbsignature = "";

			signature = tp.getSignature();
			if (signature.compareTo(dbsignature) != 0)
			{
				changed = resetProductFrom(C_Period_ID, M_Product_ID);
				//				changed = true;
				tp.setSignature(dbsignature);
				tp.save();				
				//				int NextPeriod = C_Period_ID;
				//				tp.setSignature(dbsignature);
				//				tp.save();
				//				String qry = String.format("%s=? AND %s=? ", X_M_Transaction.COLUMNNAME_C_Period_ID, X_M_Transaction.COLUMNNAME_M_Product_ID);				
				//				while (NextPeriod > 0)
				//				{
				//					List<X_M_Transaction> list = new Query(Env.getCtx(), X_M_Transaction.Table_Name, qry, null).setClient_ID()
				//							.setParameters(NextPeriod, M_Product_ID).list();
				//
				//					for (X_M_Transaction trx:list)
				//					{
				//						trx.setProcessed(false);
				//						trx.save();
				//						//
				//						qry = String.format("%s = ? AND %s = ?", X_M_Product_Costing.COLUMNNAME_C_Period_ID, X_M_Product_Costing.COLUMNNAME_M_Product_ID);
				//						X_M_Product_Costing pc = new Query(Env.getCtx(), X_M_Product_Costing.Table_Name, qry, null)
				//						.setParameters(trx.getC_Period_ID(), trx.getM_Product_ID()).first();
				//						if (pc != null)
				//							pc.delete(true);
				//						//
				//						qry = String.format("%s = ? AND %s = ?", X_M_CostCalc.COLUMNNAME_C_Period_ID, X_M_CostCalc.COLUMNNAME_M_Product_ID);
				//						X_M_CostCalc cc = new Query(Env.getCtx(), X_M_CostCalc.Table_Name, qry, null)
				//						.setParameters(trx.getC_Period_ID(), trx.getM_Product_ID()).first();
				//						if (cc != null)
				//							cc.delete(true);
				//						//
				//						List<X_M_StorageMonthly> smlist = new Query(Env.getCtx(), X_M_StorageMonthly.Table_Name, qry, null)
				//						.setParameters(trx.getC_Period_ID(), trx.getM_Product_ID()).list();
				//						
				//						for (X_M_StorageMonthly sm:smlist)
				//						{
				//							sm.delete(true);
				//						}
				//					}
				//					Timestamp startdate = period.getEndDate();
				//					Calendar cal = Calendar.getInstance();
				//					cal.setTime(startdate);
				//					cal.add(Calendar.DATE, 1);
				//					cal.set(Calendar.MILLISECOND, 0);
				//					startdate = new Timestamp(cal.getTime().getTime());
				//					period = new Query(Env.getCtx(), X_C_Period.Table_Name, "startdate = ?", null)
				//						.setParameters(startdate).first();
				//					NextPeriod = 0;
				//					if (period != null)
				//					{
				//						NextPeriod = period.getC_Period_ID();
				//					}
				//				}				
				//				StockWorker sw = new StockWorker();
				//				sw.setCommand(StockWorker.UpdateStorage);
				//				sw.addProperty(X_C_Period.COLUMNNAME_C_Period_ID, C_Period_ID);
				//				materialpolicy.add(sw);
			}
		}								
		if (tp == null && dbsignature.length() > 0)
		{
			tp = new X_M_TransactionPeriod(Env.getCtx(), 0, null);
			tp.setC_Period_ID(C_Period_ID);
			tp.setM_Product_ID(M_Product_ID);
			tp.setSignature(dbsignature);
			tp.save();
		}
		return changed;
	}
	public boolean storageupdate(int M_Product_ID) {
		String sql = String.format("SELECT xendra.storageupdate(0,0,0,%d)", M_Product_ID);
		int no = DB.getSQLValue(null, sql);
		return true;
	}
	public boolean resetProductFrom(int C_Period_ID, int M_Product_ID) {

		X_C_Period period = new Query(Env.getCtx(), X_C_Period.Table_Name, "C_Period_ID = ?", null)
		.setParameters(C_Period_ID).first();

		int NextPeriod = C_Period_ID;
		String qry = String.format("%s=? AND %s=? ", X_M_Transaction.COLUMNNAME_C_Period_ID, X_M_Transaction.COLUMNNAME_M_Product_ID);				
		while (NextPeriod > 0)
		{
			List<X_M_Transaction> list = new Query(Env.getCtx(), X_M_Transaction.Table_Name, qry, null).setClient_ID()
					.setParameters(NextPeriod, M_Product_ID).list();

			for (X_M_Transaction trx:list)
			{
				trx.setProcessed(false);
				trx.save();
				//
				qry = String.format("%s = ? AND %s = ?", X_M_Product_Costing.COLUMNNAME_C_Period_ID, X_M_Product_Costing.COLUMNNAME_M_Product_ID);
				X_M_Product_Costing pc = new Query(Env.getCtx(), X_M_Product_Costing.Table_Name, qry, null)
				.setParameters(trx.getC_Period_ID(), trx.getM_Product_ID()).first();
				if (pc != null)
					pc.delete(true);
				//
				qry = String.format("%s = ? AND %s = ?", X_M_CostCalc.COLUMNNAME_C_Period_ID, X_M_CostCalc.COLUMNNAME_M_Product_ID);
				X_M_CostCalc cc = new Query(Env.getCtx(), X_M_CostCalc.Table_Name, qry, null)
				.setParameters(trx.getC_Period_ID(), trx.getM_Product_ID()).first();
				if (cc != null)
					cc.delete(true);
				//
				List<X_M_StorageMonthly> smlist = new Query(Env.getCtx(), X_M_StorageMonthly.Table_Name, qry, null)
				.setParameters(trx.getC_Period_ID(), trx.getM_Product_ID()).list();

				for (X_M_StorageMonthly sm:smlist)
				{
					sm.delete(true);
				}
			}
			Timestamp startdate = period.getEndDate();
			Calendar cal = Calendar.getInstance();
			cal.setTime(startdate);
			cal.add(Calendar.DATE, 1);
			cal.set(Calendar.MILLISECOND, 0);
			startdate = new Timestamp(cal.getTime().getTime());
			period = new Query(Env.getCtx(), X_C_Period.Table_Name, "startdate = ?", null)
			.setParameters(startdate).first();
			NextPeriod = 0;
			if (period != null)
			{
				NextPeriod = period.getC_Period_ID();
			}
		}				
		StockWorker sw = new StockWorker();
		sw.setCommand(StockWorker.UpdateStorage);
		sw.addProperty(X_C_Period.COLUMNNAME_C_Period_ID, C_Period_ID);
		//materialpolicy.add(sw);		
		return true;
	}

	//public void register(OutputStream os) {
	public void register(CommandStatus commandStatus) {
		Iterator iter = m_materialpolicy.keySet().iterator();
		while (iter.hasNext())
		{
			Integer AD_Client_ID = (Integer) iter.next();
			MaterialPolicy mp = (MaterialPolicy) m_materialpolicy.get(AD_Client_ID);
			mp.register(commandStatus);
		}
	}
}
