package org.xendra.messages;

import org.compiere.model.Query;
import org.compiere.model.persistence.X_A_Xendrian_Message;
import org.compiere.util.Env;

public class ParseMessagefromFormat {	
	public static void main(String[] args) {
		try {
			org.compiere.Xendra.startupEnvironment(false);
			X_A_Xendrian_Message m = new Query(Env.getCtx(), X_A_Xendrian_Message.Table_Name, "a_xendrian_message_id = ?", null)
			.setParameters(1000045)
			.first();			
			MessageProcessor p = MessageProcessor.getInstance();
			p.setMessage("'x",m, null);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
