package org.xendra.replication.messages;

import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_A_Xendrian_Replication;
import org.compiere.model.reference.REF_ReplicationType;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.compiere.util.Trx;

public class replmessageListener implements MessageListener {

	private Integer m_AD_MessageFormat_ID;
	private Integer m_AD_Rule_ID;
	private String m_tag;	

	public replmessageListener(Integer AD_MessageFormat_ID, Integer AD_Rule_ID, String tag) {
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
					String identifier = mt.getStringProperty(X_A_Xendrian_Replication.COLUMNNAME_Identifier);
					X_A_Xendrian_Replication queue = new Query(Env.getCtx(), X_A_Xendrian_Replication.Table_Name, "identifier = ?" , null)
					.setParameters(identifier).first();
					if (queue == null)
					{
						queue = new X_A_Xendrian_Replication(Env.getCtx(), 0, null);
						queue.setIdentifier(identifier);
					} else {
						queue.setProcessed(false);
						queue.setErrorMsg("");						
					}
					queue.setMessage(xml);
					queue.setReplicationType(REF_ReplicationType.Reference);
					if (queue.save()) {
						try {
							m.acknowledge();
						} catch (Exception e) {}
					}
					if (m_tag.length() > 0)
						DB.executeUpdate(String.format("NOTIFY %s",m_tag), null);					
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
