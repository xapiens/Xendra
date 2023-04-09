package org.xendra.material;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Vector;
import java.util.logging.Level;

import org.compiere.model.MProduct;
import org.compiere.model.persistence.X_C_OrderLine;
import org.compiere.model.persistence.X_M_Product;
import org.compiere.process.ProcessInfo;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.util.CLogger;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.compiere.util.Ini;
import org.compiere.util.Language;
import org.xendra.Constants;
import org.xendra.common.Lock;
import org.xendra.process.CostUpdate;
import org.xendra.util.SelectPO;

public class MaterialServer implements Runnable {
	private static MaterialServer INSTANCE = null;
	private static Lock mslock = new Lock("ms");	
	private static CLogger 	log = CLogger.getCLogger(MaterialServer.class);
	private int m_AD_Client_ID;

	public MaterialServer(int AD_Client_ID) {
		m_AD_Client_ID = AD_Client_ID;
	}


	@Override 
	public void run() {
		try {
			//MaterialServer ms = MaterialServer.getInstance();		
			String sql = "with products as (select distinct m_product_id from c_orderline)\n"
					+ "select c.m_product_id, count(*) from m_carding c join products p  on c.m_product_id = p.m_product_id where c.iscosted = 'N' group by c.m_product_id order by 2 desc\n";
			String materialsql = "{call xendra.materialcostproduct(?,?)}";				
			PreparedStatement pstmt = null;
			try
			{
				//pstmt = DB.prepareStatement(sql.toString(), null);
				pstmt = DB.prepareStatement(sql, 
						ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY, null);

				ResultSet rs = pstmt.executeQuery();
				float percent = 0;
				float rows = 0;
				float currentrow = 1;
				if (rs.last()) {
					rows = rs.getRow();
					rs.beforeFirst();
				}
				while (rs.next()) {        
					int M_Product_ID = rs.getInt(X_M_Product.COLUMNNAME_M_Product_ID);
					MProduct p = MProduct.get(Env.getCtx(), M_Product_ID, null);
					System.out.println(p.getName());
					try {
						CallableStatement cstmt = DB.prepareCall(materialsql, ResultSet.CONCUR_UPDATABLE, null);
						cstmt.setInt(1, m_AD_Client_ID);
						cstmt.setInt(2, M_Product_ID);                		
						cstmt.executeUpdate();
						cstmt.close();
					} catch (Exception e) {
						e.printStackTrace();
					}            
					percent = (currentrow / rows) * 100;
					System.out.println(String.format("%f%%",percent));
					currentrow++;
				}
				rs.close();
				pstmt.close();
				pstmt = null;

			} catch (Exception e) {
				pstmt = null;
				e.printStackTrace();
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	public void run2() {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(Constants.materialport);			
			while(true) {
				Socket connection = serverSocket.accept();
				//Runnable connectionHandler = new ConnectionHandler(connection);
				//new Thread(connectionHandler).start();
			}
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			if(null != serverSocket) {
				try { serverSocket.close(); }
				catch(IOException e) {}
			}
		}		
	}

	/**
	 * This class is a singleton.  
	 * @param printserver 
	 * @return the only instance of LPD.
	 */
	public static MaterialServer getInstance(int AD_Client_ID) {
		synchronized(mslock) {
			if (INSTANCE == null)
			{
				log.log(Level.WARNING, "starting Material Server");
				INSTANCE = new MaterialServer(AD_Client_ID); 
				Thread thread = new Thread(INSTANCE);
				thread.setName("MaterialServer");
				thread.start();											
			}
		}
		return INSTANCE;
	}

	public static void main(String args[]) {
		org.compiere.Xendra.startup(false);
		Env.setContext(Env.getCtx(), "#Date", new Timestamp(System.currentTimeMillis()));
		String langName = Ini.getProperty(Ini.P_LANGUAGE);
		Language language = Language.getLanguage(langName);
		Env.setContext(Env.getCtx(), Env.LANGUAGE, language.getAD_Language());

		Env.setContext(Env.getCtx(), "#AD_Client_ID", 1000038);
		MaterialServer ms = MaterialServer.getInstance(1000038);
		ms.run();
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