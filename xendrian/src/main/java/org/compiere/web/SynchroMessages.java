package org.compiere.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_MessageFormat;
import org.compiere.model.persistence.X_A_Machine;
import org.compiere.model.persistence.X_A_Xendrian_Message;
import org.compiere.util.CLogger;
import org.compiere.util.Env;
import org.hornetq.api.core.Message;
import org.hornetq.api.core.TransportConfiguration;
import org.hornetq.api.core.client.SendAcknowledgementHandler;
import org.hornetq.api.jms.HornetQJMSClient;
import org.hornetq.api.jms.JMSFactoryType;
import org.hornetq.core.remoting.impl.netty.NettyConnectorFactory;
import org.hornetq.core.remoting.impl.netty.TransportConstants;
import org.xendra.utils.Rotdash;

public class SynchroMessages implements Runnable, SendAcknowledgementHandler {
	protected CLogger	log = CLogger.getCLogger(getClass());
	private X_A_Machine m_remote;
	private String m_queuename;
	private String m_remotequeue;
	private X_AD_MessageFormat m_messageformat;
	public SynchroMessages(X_A_Machine remote, String remotequeue, X_AD_MessageFormat messageformat) {
		m_remote = remote;		
		m_remotequeue = remotequeue;
		m_messageformat = messageformat;
	}
	@Override
	public void run() {
		int retrys = 10;
		Rotdash rotdash = Rotdash.getInstance();
		while (retrys > 0) {
			try {
				Queue queue = HornetQJMSClient.createQueue(m_remotequeue);
				Map<String, Object> connectionParams = new HashMap<String, Object>();
				connectionParams.put(TransportConstants.PORT_PROP_NAME, 5445);
				connectionParams.put(TransportConstants.HOST_PROP_NAME, m_remote);
				TransportConfiguration transportConfiguration = 
						new TransportConfiguration(NettyConnectorFactory.class.getName(),connectionParams);
				ConnectionFactory factory = (ConnectionFactory) HornetQJMSClient.createConnectionFactoryWithoutHA(JMSFactoryType.CF, transportConfiguration);
				Connection connection = factory.createConnection();
				Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
				MessageProducer producer = session.createProducer(queue);
				List<X_A_Xendrian_Message> messages = new Query(Env.getCtx(), X_A_Xendrian_Message.Table_Name, "AD_Process_ID = ?", null)
				.setParameters(m_messageformat.getAD_Rule_ID()).list();
				MessageProducer sender = session.createProducer(queue);				
				rotdash.start();						
				for (X_A_Xendrian_Message message:messages) {

					TextMessage request = session.createTextMessage(message.getMessage());
					request.setStringProperty(X_A_Xendrian_Message.COLUMNNAME_Identifier, message.getIdentifier());								
					sender.send(request);								
				}				
				rotdash.stop();
				producer.close();
				session.close();
				connection.close();
				retrys = 0;
			}
			catch ( Throwable e ) {
				e.printStackTrace();
				retrys --;
				log.log(Level.WARNING, String.format("%s attempts", retrys));				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}		//	1 sec
			}
			finally {
				rotdash.stop();
			}		
		}
	}

	@Override
	public void sendAcknowledged(Message arg0) {
		// TODO Auto-generated method stub

	}

}
