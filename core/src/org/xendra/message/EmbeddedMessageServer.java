package org.xendra.message;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
import javax.jms.QueueSession;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.compiere.db.CConnection;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_A_Machine;
import org.compiere.util.Env;
import org.hornetq.api.core.client.ClientSession;
import org.hornetq.core.config.impl.FileConfiguration;
import org.hornetq.core.server.HornetQServer;
import org.hornetq.jms.client.HornetQSession;
import org.hornetq.jms.server.impl.JMSServerManagerImpl;
import org.hornetq.core.server.HornetQServers;
import org.hornetq.core.settings.impl.AddressSettings;
import org.xendra.Constants;
import org.xendra.printdocument.PrintConstants;
import org.xendra.printdocument.PrintWorker;

public class EmbeddedMessageServer  {

	private static EmbeddedMessageServer m_server;
	private JMSServerManagerImpl jmsServerManager;
	private HornetQServer server;	
	//private ClientSession coreSession;
	private String m_host = "";
	public EmbeddedMessageServer()
	{
		// 19/09/2014
		// por alguna razon, que aun desconozco, el embebido no funciona. 
		// Embedded();
	}
	
	public void Embedded()
	{
		try
		{			
			FileConfiguration configuration  = new FileConfiguration(); 
			configuration.setConfigurationUrl("hornetq-configuration.xml");			
			configuration.start();
			Map<String, AddressSettings> map = new HashMap<String, AddressSettings>();
			map = configuration.getAddressesSettings();
			server = HornetQServers.newHornetQServer(configuration);			
			server.start();						
			if (server.isStarted())
			{
				jmsServerManager = new JMSServerManagerImpl(server, "hornetq-jms.xml");
				jmsServerManager.start();
				if (jmsServerManager.isStarted())
				{
					System.out.println("Inicializado Xendra HornetQ Embebido");
				}
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();			
		}
		finally 
		{

		}				
	}

	public static EmbeddedMessageServer getInstance() {
		if (m_server == null)
			m_server = new EmbeddedMessageServer();
		return m_server;
	}

	public int getPort() {		
		return 1099;
	}
    
	public String Test(String host, String queuename) {
		String error = "";
		System.out.println("iniciando test "+host+" "+queuename);
		try 
		{			
			Queue queue = (Queue) CConnection.get().lookup(host,queuename);
			QueueConnectionFactory cf = null;
			cf = (QueueConnectionFactory) CConnection.get().lookup(host, Constants.QConnectionFactory);
			QueueConnection connection = cf.createQueueConnection();
			connection.start();
			QueueSession session = connection.createQueueSession(false, Session.AUTO_ACKNOWLEDGE);
			ClientSession coreSession = ((HornetQSession)session).getCoreSession();
			//coreSession.setSendAcknowledgementHandler(this);
			connection.close();
			m_host = host;
		}
		catch (Exception e)
		{			
			System.out.println("error en test "+host+" "+queuename);
			error = e.getMessage();
			if (error == null)
				error = e.getCause().toString();
			if (error == null)
				error = "error";
		}
		System.out.println("test terminado"+host+" "+queuename);		
		return error;
	}

	public String SendMessage(String queuename, String message) {
		String error = "";
		try 
		{
			Queue queue = (Queue) CConnection.get().lookup(m_host, queuename);
			QueueConnectionFactory cf = (QueueConnectionFactory) CConnection.get().lookup(m_host, Constants.QConnectionFactory);
			QueueConnection connection = cf.createQueueConnection();
			connection.start();
			Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
			MessageProducer producer = session.createProducer(queue);			
			TextMessage message2 = session.createTextMessage();
			message2.setText(message);
			producer.send(message2);			
			connection.close();
		}
		catch (Exception e)
		{			
			error = e.getMessage();
		}
		return error;				
	}
}
