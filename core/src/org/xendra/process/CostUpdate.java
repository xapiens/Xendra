package org.xendra.process;

import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;

import org.adempiere.util.ProcessUtil;
import org.compiere.model.MClient;
import org.compiere.model.MCostCalc;
import org.compiere.model.MCostElement;
import org.compiere.model.MCurrency;
import org.compiere.model.MInvoice;
import org.compiere.model.MInvoiceLine;
import org.compiere.model.MPInstance;
import org.compiere.model.MPeriod;
import org.compiere.model.MProduct;
import org.compiere.model.MStorage;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Client;
import org.compiere.model.persistence.X_AD_Process;
import org.compiere.model.persistence.X_AD_WF_Node;
import org.compiere.model.persistence.X_A_Machine;
import org.compiere.model.persistence.X_C_Invoice;
import org.compiere.model.persistence.X_C_PaySelection;
import org.compiere.model.persistence.X_C_Period;
import org.compiere.model.persistence.X_M_CostCalc;
import org.compiere.model.persistence.X_M_InOut;
import org.compiere.model.persistence.X_M_MaterialPolicy;
import org.compiere.model.persistence.X_M_Movement;
import org.compiere.model.persistence.X_M_Product;
import org.compiere.model.persistence.X_M_Product_Costing;
import org.compiere.model.persistence.X_M_StorageMonthly;
import org.compiere.model.persistence.X_M_Transaction;
import org.compiere.model.reference.REF_C_AcctSchemaCostingMethod;
import org.compiere.model.reference.REF_WF_Start_FinishMode;
import org.compiere.process.ProcessInfo;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;
import org.compiere.util.DB;
import org.compiere.util.DisplayType;
import org.compiere.util.Env;
import org.compiere.util.Ini;
import org.compiere.util.Language;
import org.compiere.util.Trx;
import org.xendra.Constants;
import org.xendra.cost.CostAverageCalc;
import org.xendra.cost.ICostCalcMethod;
import org.xendra.material.MaterialPolicy;
import org.xendra.material.StockWorker;
import org.xendra.annotations.XendraProcess;

public class CostUpdate extends SvrProcess {
	private int M_Product_ID;
	private int C_Invoice_ID = 0;
	private int M_Movement_ID = 0;
	private int M_InOut_ID = 0;
	private int M_Product_Brand_ID = 0;
	private int M_Product_Group_ID = 0;
	private int M_Product_Category_ID = 0;
	/** Last Summary */
	private StringBuffer m_summary = new StringBuffer();
	private boolean calculateCost = false;
	private boolean calculateStock = false;
	private boolean ForcePeriod = false;
	private boolean FromBeginning = false;
	private Timestamp dateFrom = null;
	private MClient m_client;
	private int AD_Org_ID;
	
	protected void prepare() {
		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++)
		{
			String name = para[i].getParameterName();
			if (para[i].getParameter() == null)
				;
			else if (name.equals(X_M_Product.COLUMNNAME_M_Product_ID))
				M_Product_ID = para[i].getParameterAsInt();
			else if (name.equals("IsCalculateCost"))
				calculateCost = "Y".equals(para[i].getParameter());
			else if (name.equals("IsCalculateStock"))
				calculateStock = "Y".equals(para[i].getParameter());
			else if (name.equals("IsForcePeriod"))
				ForcePeriod = "Y".equals(para[i].getParameter());
			else if (name.equals("IsFromBeginning"))
				FromBeginning = "Y".equals(para[i].getParameter());
			else if (name.equals("DateFrom"))
				dateFrom = (Timestamp) para[i].getParameter();
			else if (name.equals(X_C_Invoice.COLUMNNAME_C_Invoice_ID))
				C_Invoice_ID = para[i].getParameterAsInt();
			else if (name.equals(X_M_Movement.COLUMNNAME_M_Movement_ID))
				M_Movement_ID = para[i].getParameterAsInt();
			else if (name.equals(X_M_InOut.COLUMNNAME_M_InOut_ID))
				M_InOut_ID = para[i].getParameterAsInt();
			else if (name.equals(X_M_Product.COLUMNNAME_M_Product_Brand_ID))
				M_Product_Brand_ID = para[i].getParameterAsInt();
			else if (name.equals(X_M_Product.COLUMNNAME_M_Product_Group_ID))
				M_Product_Group_ID = para[i].getParameterAsInt();
			else if (name.equals(X_M_Product.COLUMNNAME_M_Product_Category_ID))
				M_Product_Category_ID = para[i].getParameterAsInt();
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}
	}
	
	protected String doIt() throws Exception {		
		String error = "";
		try {
			X_A_Machine machine = Env.getServerMaterial();		
			if (machine == null)
				throw new Exception("MaterialServer not defined");
			else
			{
				addLog(String.format("Try to connect to %s", machine.getName()));
				StockWorker sw = new StockWorker();
				sw.setMachine(machine);
				sw.setCommand(StockWorker.IsAlive);
				error = sw.Pull();		
				if (error.length() > 0)
				{
					addLog(error);
					throw new Exception(error);
				}
				else
				{
					addLog("Sucessfully");
				}
			}
			//addLog(0, null, BigDecimal.ZERO, "@Updated@ @M_Product_Category_ID@");					
			m_client = MClient.get(Env.getCtx(), getAD_Client_ID());
			X_M_MaterialPolicy mp = new Query(Env.getCtx(), X_M_MaterialPolicy.Table_Name, "AD_Client_ID = ?", null)
			.setParameters(m_client.getAD_Client_ID()).first();
			if (mp == null)
				throw new Exception(String.format("@M_MaterialPolicy_ID@ not defined to @AD_Client_ID@", m_client.getName()));
			dateFrom = mp.getStartDate();
			addLog(String.format("@M_CostCalc_ID@ from %s", dateFrom));
			if (calculateStock)
			{
				error = stockcalculate();
			}
			if (calculateCost)
			{
				error = costcalculate();
			}
		}
		catch (Exception e)
		{
			error = e.getMessage();
		}
		return error;
	}

	private String stockcalculate() {
		CallableStatement stmt = null;
		BigDecimal no = BigDecimal.ZERO;
		try {
			stmt = DB.prepareCall("{ ?= call stockupdate(?,?,?,?,?,?,?,?) }", ResultSet.CONCUR_READ_ONLY, null);
			stmt.setInt(2, M_Product_Brand_ID);
			stmt.setInt(3, M_Product_Group_ID);
			stmt.setInt(4, M_Product_Category_ID);
			stmt.setInt(5, C_Invoice_ID);
			stmt.setInt(6, M_Movement_ID);
			stmt.setInt(7, M_InOut_ID);
			stmt.setInt(8, M_Product_ID);
			stmt.setTimestamp(9, dateFrom);
			stmt.registerOutParameter(1, java.sql.Types.NUMERIC);
			stmt.execute();
			no = stmt.getBigDecimal(1); 
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return String.format("%s procesado(s)",no);
	}

	private String costcalculate() {
		ArrayList<Integer> products = new ArrayList<Integer>();
		String error = "";
		try {
			if (C_Invoice_ID > 0)
			{
				String where = "C_Invoice_ID = ?";
				MInvoice invoice = new Query(Env.getCtx(), X_C_Invoice.Table_Name, where, null)
				.setParameters(C_Invoice_ID).first();
				if (invoice != null)
				{
					MInvoiceLine[] lines = invoice.getLines();
					for (MInvoiceLine line:lines)
					{
						if (!products.contains(line.getM_Product_ID()))
						{
							products.add(line.getM_Product_ID());
						}
					}
				}
			}
			else if (M_Product_Brand_ID > 0)
			{
				String where = "M_Product_Brand_ID = ? AND IsActive='Y'";
				List<MProduct> productList = new Query(Env.getCtx(), X_M_Product.Table_Name, where, null)
				.setParameters(M_Product_Brand_ID)
				.list();
				for (MProduct product:productList)
				{

					if (!products.contains(product.getM_Product_ID()))
					{
						products.add(product.getM_Product_ID());
					}
				}
			}
			else if (M_Product_Group_ID > 0)
			{
				String where = "M_Product_Group_ID = ? AND IsActive='Y'";
				List<MProduct> productList = new Query(Env.getCtx(), X_M_Product.Table_Name, where, null)
				.setParameters(M_Product_Group_ID)
				.list();
				for (MProduct product:productList)
				{

					if (!products.contains(product.getM_Product_ID()))
					{
						products.add(product.getM_Product_ID());
					}
				}							
			}
			else if (M_Product_Category_ID > 0)
			{
				String where = "M_Product_Category_ID = ? AND IsActive='Y'";
				List<MProduct> productList = new Query(Env.getCtx(), X_M_Product.Table_Name, where, null)
				.setParameters(M_Product_Category_ID)
				.list();
				for (MProduct product:productList)
				{

					if (!products.contains(product.getM_Product_ID()))
					{
						products.add(product.getM_Product_ID());
					}
				}														
			}
			else
			{
				products.add(M_Product_ID);
			}
			if (products != null && products.size() > 0) {
				X_A_Machine machine = Env.getServerMaterial();
				List<MPeriod> periods = getPeriods();
				List<Integer> periodids = new ArrayList<Integer>();
				for (MPeriod period:periods)
				{
					periodids.add(period.getC_Period_ID());
//					for (int product:products)
//					{
//						resetproduct(period.getC_Period_ID(), product);
//					}
				}
				for (int product:products)
				{
					StockWorker sw = new StockWorker();
					sw.setMachine(machine);
					sw.setCommand(StockWorker.Product);
					sw.addProperty(Constants.COLUMNNAME_AD_Client_ID, Env.getAD_Client_ID(Env.getCtx()));
					sw.addProperty(X_M_Transaction.COLUMNNAME_C_Period_ID, periodids);
					sw.addProperty(X_M_Transaction.COLUMNNAME_M_Product_ID, product);
					sw.addProperty(Constants.RESET, true);
					//sw.addProperty(X_AD_WF_Node.COLUMNNAME_StartMode, REF_WF_Start_FinishMode.Manual);
					error = sw.Pull();
					if (error.length() == 0)
					{
						MProduct p = MProduct.get(Env.getCtx(), product, get_TrxName());
						addLog(String.format("%s %s",p.getValue(), p.getName()));						
					}
				}
			}
		} catch (Exception e) {
			log.log(Level.SEVERE, "Error preparing the cost calculator ", e);
		} finally {
		}		
		return null;
	}
	

	private List<MPeriod> getPeriods() {
		List<MPeriod> Periods = null;
		MPeriod periodFrom = new Query(getCtx(), X_C_Period.Table_Name, "date(?) BETWEEN startdate AND enddate AND AD_Client_ID = ?", null)
		.setParameters(dateFrom, m_client.getAD_Client_ID()).setOrderBy("C_Period_ID").first();

		MPeriod periodTo = new Query(getCtx(), X_C_Period.Table_Name, "date(?) BETWEEN startdate AND enddate AND AD_Client_ID = ?", null)
		.setParameters(new Timestamp(System.currentTimeMillis()), m_client.getAD_Client_ID()).setOrderBy("C_Period_ID").first();
		
		if (periodTo == null)
		{
			periodTo = new Query(getCtx(), X_C_Period.Table_Name, "enddate = (select max(enddate) from c_period where ad_client_ID = ?) and ad_client_ID = ?", null)
			.setParameters(m_client.getAD_Client_ID(), m_client.getAD_Client_ID()).setOrderBy("C_Period_ID").first();
		}

		if ( periodFrom != null || periodTo != null )
		{
			Periods = new Query(getCtx(), X_C_Period.Table_Name, "startdate >= ? AND enddate <= ?  AND AD_Client_ID = ?", null)
			.setParameters(periodFrom.getStartDate(), periodTo.getEndDate(), m_client.getAD_Client_ID())
			.setOrderBy("C_Period_ID")
			.list();
		}
		return Periods;
	}

	
	public static void main(String args[]) {
		org.compiere.Xendra.startup(false);
		Env.setContext(Env.getCtx(), "#Date", new Timestamp(System.currentTimeMillis()));
		String langName = Ini.getProperty(Ini.P_LANGUAGE);
		Language language = Language.getLanguage(langName);
		Env.setContext(Env.getCtx(), Env.LANGUAGE, language.getAD_Language());

		Env.setContext(Env.getCtx(), "#AD_Client_ID", 1000027);
		
		CostUpdate rr = new CostUpdate();
		ProcessInfo pi = new ProcessInfo ("CostUpdate", 0 /* Process ID */, /* Table_ID*/ 0, 0 /* record_ID */);
		pi.setAD_User_ID (Env.getAD_User_ID(Env.getCtx()));
		pi.setAD_Client_ID (Env.getAD_Client_ID(Env.getCtx()));			
		Vector<ProcessInfoParameter> tabParams = new Vector<ProcessInfoParameter>();
		//
		ProcessInfoParameter pip;
		// "7755155000131" "REACTOR ALPHA LXI 36/40W 220V 60HZ" 1018584
		pip = new ProcessInfoParameter(X_M_Product.COLUMNNAME_M_Product_ID, 1018605 , null, null, null);
		tabParams.add(pip);		
		
		pip = new ProcessInfoParameter("IsCalculateStock", "Y", null, null, null);
		tabParams.add(pip);
		
		pip = new ProcessInfoParameter("IsCalculateCost", "Y", null, null, null);
		tabParams.add(pip);		
		//			
		pi.setParameter(tabParams.toArray(new ProcessInfoParameter[]{}));			
		rr.startProcess(Env.getCtx(), pi, null);					
	}
}