package org.xendra.rules.messages;

import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import org.compiere.model.Query;
import org.compiere.model.persistence.X_A_Xendrian_Message;
import org.compiere.util.DB;
import org.compiere.util.Env;

public class transfermessageListener implements MessageListener {

	private Integer m_AD_MessageFormat_ID;
	private Integer m_AD_Rule_ID;
	private String m_tag;	
	public transfermessageListener(Integer AD_Rule_ID) {
		m_AD_Rule_ID = AD_Rule_ID;
	}
	public transfermessageListener(Integer AD_MessageFormat_ID, Integer AD_Rule_ID, String tag) {
		m_AD_MessageFormat_ID = AD_MessageFormat_ID;
		m_AD_Rule_ID = AD_Rule_ID;
		m_tag = tag;
	}
	
	@Override
	public void onMessage(final Message m) {		
		Runnable task = new Runnable() {				
			public void run() {
				try {
					TextMessage mt = (TextMessage) m;
					String xml = mt.getText();
					String identifier = mt.getStringProperty(X_A_Xendrian_Message.COLUMNNAME_Identifier);
					X_A_Xendrian_Message msqueue = new Query(Env.getCtx(), X_A_Xendrian_Message.Table_Name, "identifier = ?" , null)
						.setParameters(identifier).first();
					if (msqueue == null)
					{
						X_A_Xendrian_Message queue = new X_A_Xendrian_Message(Env.getCtx(), 0, null);
						queue.setMessage(xml);
						queue.setIdentifier(identifier);
						queue.setAD_Process_ID(m_AD_Rule_ID);
						if (queue.save())
						{
							m.acknowledge();
							if (m_tag.length() > 0)
								DB.executeUpdate(String.format("NOTIFY %s",m_tag), null);
						}
					}
					else
					{
						m.acknowledge();
						if (m_tag.length() > 0)
							DB.executeUpdate(String.format("NOTIFY %s",m_tag), null);						
					}
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}		
			}
		};
		new Thread(task).start();
	}
}