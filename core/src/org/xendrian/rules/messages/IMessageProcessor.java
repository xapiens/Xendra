package org.xendrian.rules.messages;

import org.compiere.model.persistence.X_A_Xendrian_Message;

public interface IMessageProcessor {
	public String setMessage(String m);
	public void setXendrianMessage(X_A_Xendrian_Message m);
	public X_A_Xendrian_Message getXendrianMessage();
	public String getMessage();
}
