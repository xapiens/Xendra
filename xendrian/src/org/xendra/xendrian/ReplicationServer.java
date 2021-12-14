package org.xendra.xendrian;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;
import org.compiere.model.PO;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_ReplicationTable;
import org.compiere.model.persistence.X_AD_Table;
import org.compiere.model.persistence.X_A_Machine;
import org.compiere.util.CLogger;
import org.compiere.util.Env;
import org.hornetq.api.core.TransportConfiguration;
import org.hornetq.api.jms.HornetQJMSClient;
import org.hornetq.api.jms.JMSFactoryType;
import org.hornetq.core.remoting.impl.netty.NettyConnectorFactory;
import org.hornetq.core.remoting.impl.netty.TransportConstants;
import org.xendra.replication.ReplicationEngine;

public class ReplicationServer extends Thread {

	private Queue queue = HornetQJMSClient.createQueue("merge");
	private static CLogger 		log = CLogger.getCLogger (ReplicationServer.class);
	private X_A_Machine host;
	private ConnectionFactory factory;
	private Connection connection;
	private Session session;
	@Override
	public void run() {
		Initialize();
		while (true) {					
			List<X_AD_ReplicationTable> rtables = new Query(Env.getCtx(), X_AD_ReplicationTable.Table_Name, "Processed = 'N'", null).setLimit(1000).list();
			for (X_AD_ReplicationTable rtable:rtables) {
				ReplicationEngine r = new ReplicationEngine();
				X_AD_Table t = new Query(Env.getCtx(), X_AD_Table.Table_Name, "AD_Table_ID = ?", null).setParameters(rtable.getAD_Table_ID()).first();
				PO po = new Query(Env.getCtx(), t.getTableName(), String.format("Identifier = ?"), null).setParameters(rtable.getTableIdentifier()).first();
				try {
					if (po == null) {
						rtable.setErrorMsg(String.format("%s identifier %s not found",t.getTableName(), rtable.getTableIdentifier()));
						rtable.setProcessed(true);
						rtable.save();
						continue;
					}
					String err = r.processtable(po, 0);
					if (err.length() == 0) {
						String msg = r.build();
						if (msg != null && msg.length() > 0) {													
							err = SendMessage(msg, "merge");
 							//sleep(5000); // wait 5 seconds for each record to replicate for not saturate the clients
							if (err.length() > 0) {
								rtable.setErrorMsg(err);
								rtable.save();								
							} else {
								rtable.setProcessed(true);
								rtable.save();
							}
						}
					} else {
						rtable.setErrorMsg(err);
						rtable.save();
					}									
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			try {
				log.warning("sleeping 2 minutes");
				sleep(1000*60*2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}	
	}
	private void Initialize() {
		host = Env.getMessageHost();			
		Map<String, Object> connectionParams = new HashMap<String, Object>();
		connectionParams.put(TransportConstants.PORT_PROP_NAME, 5445);
		connectionParams.put(TransportConstants.HOST_PROP_NAME, host.getName());	
		TransportConfiguration transportConfiguration = 
				new TransportConfiguration(NettyConnectorFactory.class.getName(),connectionParams);
		factory = (ConnectionFactory) HornetQJMSClient.createConnectionFactoryWithoutHA(JMSFactoryType.CF, transportConfiguration);
	}

	public String SendMessage(String msg, String queuename) {
		String error = "";
		try {
			//if (queue == null) {
			//	queue = HornetQJMSClient.createQueue(queuename);				
			//}
			while (createconnection().length() > 0) {
				sleep(1000);
			}
			MessageProducer sender = session.createProducer(queue);
			TextMessage request = session.createTextMessage(msg);
			sender.send(request);
			sender.close();
			session.close();
			connection.close();			
		}
		catch (Exception e)
		{
			error = e.getMessage();
		}
		return error;
	}
	
	private String createconnection() {
		String err = "";
		try {
			connection = factory.createConnection();
			session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
		} catch (Exception e) {
			err = e.getMessage();
		}
		return err;
	}	
}
