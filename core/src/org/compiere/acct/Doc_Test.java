package org.compiere.acct;

import java.awt.EventQueue;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.compiere.apps.AEnv;
import org.compiere.apps.ALogin;
import org.compiere.model.MAcctSchema;
import org.compiere.util.CLogger;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.compiere.util.Splash;
import org.compiere.util.Trx;

public class Doc_Test {
	private static CLogger log = CLogger.getCLogger(Doc_Test.class);
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {			
			
			public void run() {
				try {
					org.compiere.Xendra.startup(true);
					Splash splash = Splash.getSplash();
					ALogin login = new ALogin(splash);
					if (!login.initLogin())		//	no automatic login
					{
						//	Center the window
						try
						{
							AEnv.showCenterScreen(login);	//	HTML load errors
						}
						catch (Exception ex)
						{
							log.severe(ex.toString());
						}
						if (!login.isConnected() || !login.isOKpressed())
							AEnv.exit(1);
					}										
					//
					Doc_Test test = new Doc_Test();
					//test.validateAllocation(1000037,1000089,"1064715");
					test.validateAllocation(1000037,1000089,"1069075");
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.exit(0);
		   }
	    });		
	}
	
	private MAcctSchema[] m_ass = MAcctSchema.getClientAcctSchema(Env.getCtx(), Env.getAD_Client_ID(Env.getCtx()));
	
	private void validateAllocation(int AD_Client_ID, int AD_Org_ID, String allocationid) {
		int AD_Table_ID = Doc.documentsTableID[1];
		String TableName = Doc.documentsTableName[1];

		StringBuffer sql = new StringBuffer ("SELECT * FROM ").append(TableName)
		.append(" WHERE DocumentNo=?");
		//
		int count = 0;
		int countError = 0;
		PreparedStatement pstmt = null;
		try
		{
			pstmt = DB.prepareStatement(sql.toString(), null);
			pstmt.setString(1, allocationid);
			ResultSet rs = pstmt.executeQuery();
			Trx m_trx = Trx.get(Trx.createTrxName("AcctProcess"), true);
			while (rs.next())
			{
				count++;
				boolean ok = true;
				Doc doc = Doc.get (m_ass, AD_Table_ID, rs, m_trx.getTrxName());
				if (doc == null)
				{
					// error
				}
				else
				{
					String error ="";
					error = doc.post(true, true);   //  post no force/repost
				}
			}
			m_trx.close();
			rs.close();			
		}		
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}