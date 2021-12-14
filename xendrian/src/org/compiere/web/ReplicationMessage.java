package org.compiere.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
import javax.jms.QueueSession;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.compiere.db.CConnection;
import org.compiere.model.PO;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Table;
import org.compiere.model.persistence.X_A_Machine;
import org.compiere.model.persistence.X_A_MachineServer;
import org.compiere.model.persistence.X_A_Xendrian_Message;
import org.compiere.model.persistence.X_A_Xendrian_Replication;
import org.compiere.model.reference.REF_ReplicationType;
import org.compiere.model.reference.REF_ServerType;
import org.compiere.util.CLogger;
import org.compiere.util.Env;
import org.compiere.util.Util;
import org.hornetq.api.core.Message;
import org.hornetq.api.core.TransportConfiguration;
import org.hornetq.api.core.client.ClientProducer;
import org.hornetq.api.core.client.ClientSession;
import org.hornetq.api.core.client.SendAcknowledgementHandler;
import org.hornetq.api.jms.HornetQJMSClient;
import org.hornetq.api.jms.HornetQJMSConstants;
import org.hornetq.api.jms.JMSFactoryType;
import org.hornetq.core.remoting.impl.netty.NettyConnectorFactory;
import org.hornetq.core.remoting.impl.netty.TransportConstants;
import org.hornetq.jms.client.HornetQConnectionFactory;
import org.hornetq.jms.client.HornetQSession;
import org.xendra.Constants;
import org.xendra.replication.ReplicationEngine;
import org.xendra.utils.Rotdash;

public class ReplicationMessage implements Runnable {
	protected CLogger	log = CLogger.getCLogger(getClass());
	String m_table;
	String m_query;
	String m_destination;
	public ReplicationMessage(String tableName, String query, String destination) {
		m_table = tableName;
		m_query = query;
		m_destination = destination;
	}

	@Override
	public void run() {		
		int retrys = 10;
		String alias = "";
		Rotdash rotdash = Rotdash.getInstance();
		X_A_Machine machine = new Query(Env.getCtx(), X_A_Machine.Table_Name, "name = ?", null)
			.setParameters(m_destination).first();
		if (machine != null) {
			String where = "properties->'A_Machine_ID'  = ? AND servertype = ?";
			X_A_MachineServer ms = new Query(Env.getCtx(), X_A_MachineServer.Table_Name, where, null)
			.setParameters(String.valueOf(machine.getA_Machine_ID()), REF_ServerType.MessageServer).first();
			if (ms != null) {
				HashMap props = ms.getProperties();
				if (props.containsKey("Alias")) {
					alias = props.get("Alias").toString();
				}
			}
		}
		boolean usealias = false;
		while (retrys > 0) {
			try {
				Queue queue = HornetQJMSClient.createQueue("reference");
				Map<String, Object> connectionParams = new HashMap<String, Object>();
				connectionParams.put(TransportConstants.PORT_PROP_NAME, 5445);
				if (!usealias) {
					connectionParams.put(TransportConstants.HOST_PROP_NAME, m_destination);
					log.warning(String.format("try to connect to %s", m_destination));
				}
				else {
					connectionParams.put(TransportConstants.HOST_PROP_NAME, alias);
					log.warning(String.format("try to connect to %s", alias));
				}
				TransportConfiguration transportConfiguration = 
						new TransportConfiguration(NettyConnectorFactory.class.getName(),connectionParams);
				ConnectionFactory factory = (ConnectionFactory) HornetQJMSClient.createConnectionFactoryWithoutHA(JMSFactoryType.CF, transportConfiguration);
				System.out.println("debug: " + factory.getClass());
				Connection connection = factory.createConnection();
				Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
				MessageProducer producer = session.createProducer(queue);
				if (m_query.length() == 0) {
					m_query = "IsActive = 'Y'";
				}
				String err = "";
				String identifier = Util.getUUID();
				ReplicationEngine r = new ReplicationEngine();
				List<PO> pos = new Query(Env.getCtx(), m_table, m_query , null).list();
				for (PO po:pos) {					
					err = r.processtable(po, 0);
				}
				if (err.length() == 0) {
					String msg = r.build();
					if (msg != null && msg.length() > 0) {
						TextMessage request = session.createTextMessage(msg);
						request.setStringProperty(X_A_Xendrian_Message.COLUMNNAME_Identifier, identifier);
						producer.send(request);
					}
				}														
				producer.close();
				session.close();
				connection.close();
				retrys = 0;
			}
			catch ( Throwable e ) {
				e.printStackTrace();
				retrys --;
				if (alias.length() > 0 && alias.compareTo(m_destination) != 0) {
					usealias = true;
				} else {
					usealias = false;
				}
				log.log(Level.WARNING, String.format("%s attempts", retrys));				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}		//	1 sec
			}
			finally {
				rotdash.stop();
			}		
		}		
	}

}
