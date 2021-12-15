package org.xendra.transferbackup;

import java.net.InetAddress;
import java.sql.Timestamp;
import java.util.List;

import org.compiere.db.CConnection;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_A_Xendrian_Message;
import org.compiere.model.persistence.X_A_Migration_Message;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;
import org.compiere.util.DB;
import org.compiere.util.Env;

public class ResendMessages extends SvrProcess {

	private String p_Address;
	private Integer p_RuleID;
	private Timestamp p_DateFrom;
	private String p_Name;
	private String p_user;
	private String p_pwd;

	protected void prepare() {
		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++)
		{
			String name = para[i].getParameterName();
			if (para[i].getParameter() == null)
				;
			else if (name.equals("Address"))
				p_Address = (String) para[i].getParameter();
			else if (name.equals("DatabaseName"))
				p_Name = (String) para[i].getParameter();
			else if (name.equals("AD_Rule_ID"))
				p_RuleID = (Integer) para[i].getParameterAsInt();
			else if (name.equals("Date1"))
				p_DateFrom = (Timestamp) para[i].getParameter();
			else if (name.equals("username"))
				p_user = (String) para[i].getParameter();
			else if (name.equals("password"))
				p_pwd = (String) para[i].getParameter();
		}		
	}

	protected String doIt() throws Exception {
		int x = 0;
		InetAddress inet = InetAddress.getByName(p_Address);
		if (inet.isReachable(5000))
		{
			CConnection oldcc = CConnection.get();												
			CConnection m_cc = CConnection.get(p_Address,oldcc.getDbPort(),p_Name,p_user,p_pwd);
			DB.setDBTarget(m_cc);
			List<X_A_Xendrian_Message> messages = new Query(Env.getCtx(), X_A_Xendrian_Message.Table_Name, "AD_Process_ID = ? AND created >= ? ", null)
			.setParameters(p_RuleID, p_DateFrom).list();
			if (messages != null)
			{
				DB.setDBTarget(oldcc);
				//
				
				for (X_A_Xendrian_Message message:messages)
				{
					X_A_Migration_Message msg = new Query(Env.getCtx(), X_A_Migration_Message.Table_Name, "identifier = ?", null).setParameters(message.getIdentifier()).first();
					if (msg == null)
					{
						X_A_Migration_Message newmsg = new X_A_Migration_Message(Env.getCtx(), 0, null);					
						newmsg.setMessage(message.getMessage());
						newmsg.setAD_Process_ID(message.getAD_Process_ID());
						newmsg.setIdentifier(message.getIdentifier());
						newmsg.setProcessed(false);
						newmsg.save();
						x++;
					}					
				}
			}
			else
				DB.setDBTarget(oldcc);
		}
		System.out.println(x);
		return null;
	}
	
//	protected String doIt() throws Exception {
//		int x = 0;
//		InetAddress inet = InetAddress.getByName(p_Address);
//		if (inet.isReachable(5000))
//		{
//			CConnection oldcc = CConnection.get();												
//			CConnection m_cc = CConnection.get(p_Address,oldcc.getDbPort(),p_Name,p_user,p_pwd);
//			DB.setDBTarget(m_cc);
//			List<X_A_Xendrian_Message> messages = new Query(Env.getCtx(), X_A_Xendrian_Message.Table_Name, "AD_Process_ID = ? AND created >= ? ", null)
//			.setParameters(p_RuleID, p_DateFrom).list();
//			if (messages != null)
//			{
//				DB.setDBTarget(oldcc);
//				//
//				
//				for (X_A_Xendrian_Message message:messages)
//				{
//					X_A_Xendrian_Message msg = new Query(Env.getCtx(), X_A_Xendrian_Message.Table_Name, "identifier = ?", null).setParameters(message.getIdentifier()).first();
//					if (msg == null)
//					{
//						X_A_Xendrian_Message newmsg = new X_A_Xendrian_Message(Env.getCtx(), 0, null);					
//						newmsg.setMessage(message.getMessage());
//						newmsg.setAD_Process_ID(message.getAD_Process_ID());
//						newmsg.setIdentifier(message.getIdentifier());
//						newmsg.setProcessed(false);
//						newmsg.save();
//						x++;
//					}					
//				}
//			}
//			else
//				DB.setDBTarget(oldcc);
//		}
//		System.out.println(x);
//		return null;
//	}
}