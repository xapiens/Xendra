package org.xendra.replication;

import java.util.List;

import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
import javax.jms.QueueSession;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.xml.transform.TransformerFactory;

import org.compiere.db.CConnection;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_A_Machine;
import org.compiere.model.persistence.X_A_Xendrian_Replication;
import org.compiere.model.reference.REF_ReplicationType;
import org.compiere.util.Env;
import org.hornetq.api.core.client.ClientSession;
import org.hornetq.jms.client.HornetQSession;
import org.xendra.Constants;
import org.xendra.xendrian.FormatMessage;

public class Utilities {	
	//private static String m_host = "";
	//private static Hashtable hosts = new Hashtable();	
	private static TransformerFactory tFactory = TransformerFactory.newInstance();
	public static String SendMessage(String msg, String queuename) {
		String error = "";
		//if (m_host == null)
		error = TestQueue(queuename);
		if (error.length() == 0)
		{
			try {
				QueueConnectionFactory cf = null;
				Queue queue = (Queue) CConnection.get().lookup(Env.getServerReplication().getName(), queuename);
				cf = (QueueConnectionFactory) CConnection.get().lookup(Env.getServerReplication().getName(),	Constants.QConnectionFactory);
				QueueConnection connection = cf.createQueueConnection();
				connection.start();
				QueueSession session = connection.createQueueSession(false,	Session.AUTO_ACKNOWLEDGE);
				TextMessage request = session.createTextMessage(msg);
				MessageProducer sender = null;
				sender = session.createProducer(queue);
				sender.send(request);
				connection.close();
			}
			catch (Exception e)
			{
				error = e.getMessage();
			}
		}
		return error;
	}
	public static void SendMessage(FormatMessage s,String queuename) {
		String msg = s.getMessage();
		//String id = s.getProperty(Constants.HEADER, Constants.ID);
		SendMessage(msg, queuename);
		//			
	}
	public static String TestQueue(String queuename) {
		String error = "error";
//		if (m_host != null && m_host.length() > 0)
//		{
//			error = Test(m_host, queuename);
//			if (error.length() == 0)
//				return error;
//		}		
//		error = Test(Util.getLocalHostName(), queuename);
//		if (error.length() == 0)
//		{
//			m_host = Util.getLocalHostName();
//			return error;
//		}		
		X_A_Machine machine = Env.getServerReplication();
		if (machine != null)
		{
			error = Test(machine.getName(), queuename);
//			if (error.length() == 0)
//			{
//				m_host = machine.getName();
//				return error;
//			}
		}
		return error;
	}

	public static String Test(String host, String queuename) {
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
			connection.close();
			//m_host = host;
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

	public static void sendMessage(String identifier, String QueueName, String rmsg) {
		String query = "identifier = ? ";
		X_A_Xendrian_Replication repl = new Query(Env.getCtx(), X_A_Xendrian_Replication.Table_Name, query, null)
			.setParameters(identifier)
			.first();
		if (repl == null)
		{
			repl = new X_A_Xendrian_Replication(Env.getCtx(), 0, null);
			repl.setIdentifier(identifier);
		}
		repl.setMessage(rmsg);
		repl.setReplicationType(REF_ReplicationType.Merge);
		repl.setProcessed(false);
		repl.save();				
		
		String error = TestQueue(QueueName);
		
		if (error.length() == 0)
		{
			SendMessage(QueueName);
		}											
	}
	
	private static void SendMessage(String QueueName) {
		String query = "Processed = 'N' AND ReplicationType = ? ";
		
		List<X_A_Xendrian_Replication> repllist = new Query(Env.getCtx(), X_A_Xendrian_Replication.Table_Name, query, null)
		.setParameters(REF_ReplicationType.Merge)
		.list();
		
		for (X_A_Xendrian_Replication replication:repllist)
		{
			if (replication.getMessage().length() > 0)
			{
				SendMessage(replication.getMessage(), QueueName);
			}
			replication.setProcessed(true);
			replication.save();			
		}
	}
}
