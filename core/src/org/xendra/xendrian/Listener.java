package org.xendra.xendrian;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Properties;
import java.util.Vector;
import java.util.logging.Level;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageListener;
import javax.jms.Queue;
import javax.jms.Session;
import javax.naming.InitialContext;

import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_MessageFormat;
import org.compiere.model.persistence.X_AD_Process;
import org.compiere.model.persistence.X_AD_Rule;
import org.compiere.util.CLogger;
import org.compiere.util.Env;
import org.compiere.util.Util;
import org.xendra.common.Lock;

public class Listener implements IListener, Runnable {
	private static CLogger 		log = CLogger.getCLogger (Listener.class);
	private String queuename;
	private String listenerclass;
	private String m_tag;
	private int m_AD_Rule_ID;
	private int m_AD_MessageFormat_ID;
	private InitialContext ic;
	private Connection m_connection;
	private Session session;
	private MessageConsumer consumer;
	protected final Lock lock = new Lock("listener");
	
	public Listener(Object key, HashMap properties, String tag) {
		queuename = (String) key;
		listenerclass = (String) properties.get(X_AD_Process.COLUMNNAME_Classname);
		m_AD_Rule_ID = (int) properties.get(X_AD_Rule.COLUMNNAME_AD_Rule_ID);
		m_AD_MessageFormat_ID = (int) properties.get(X_AD_MessageFormat.COLUMNNAME_AD_MessageFormat_ID);
		m_tag = tag;
	}

	@Override
	public void run() {
		boolean forever = false;
		try {			
			String error = bootstrap();
			if (error.length() == 0)
			{
				forever = true;
				Thread.currentThread().setName("Listener for "+queuename);
			}
			else
			{
				log.log(Level.WARNING, error);
			}
			while (forever)
			{
				synchronized(lock) {
						try {						
							lock.wait();
						} catch(Exception e) {}  // ignored on purpose					
				}				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public String bootstrap() {
		String error = "";		
		log.log(Level.WARNING, String.format("start listening for %s", queuename));
		Properties props = new Properties();
		props.put("java.naming.factory.initial", "org.jnp.interfaces.NamingContextFactory");
		String url = Util.getMessageProtocol().concat(Env.getMachine().getName()).concat(":").concat(String.valueOf(Util.getAppsPort()));			
		props.put("java.naming.provider.url", url);
		props.put("java.naming.factory.url.pkgs", "org.jboss.naming:org.jnp.interfaces");
		log.log(Level.WARNING, String.format("trying to connect to %s...", url));
		try {
			ic = new InitialContext(props);
			ConnectionFactory cf = (ConnectionFactory) ic.lookup("/ConnectionFactory");			
			m_connection = cf.createConnection();
			m_connection.start();
			m_connection.setExceptionListener(new ExampleListener(this));
			session = m_connection.createSession(false, Session.CLIENT_ACKNOWLEDGE);
			Queue queue = (Queue) ic.lookup(queuename);
			consumer = session.createConsumer(queue);					
			Class<?> clazz = Class.forName(listenerclass);		
			log.log(Level.WARNING, String.format("start instance of %s", listenerclass));
			Constructor<?> constructor = clazz.getDeclaredConstructor(new Class[]{Integer.class, Integer.class, String.class});					
			MessageListener ml = (MessageListener) constructor.newInstance(new Object[] {m_AD_MessageFormat_ID, m_AD_Rule_ID, m_tag});			
			consumer.setMessageListener(ml);
			log.log(Level.WARNING, String.format("Sucessfully connect to %s",ml.toString()));
		}
		catch (Exception e)
		{			
			if (e.getClass().getName().equals("javax.naming.NameNotFoundException")) {
				X_AD_MessageFormat mf = new Query(Env.getCtx(), X_AD_MessageFormat.Table_Name, "AD_MessageFormat_ID = ?", null)
					.setParameters(m_AD_MessageFormat_ID).first();
				//mf.setIsActive(false);
				//mf.save();			
				error = String.format("not bound to %s", mf.getQueueName());
			}
			else {
				error = e.getMessage();
			}
			e.printStackTrace();			
		}
		return error;
	}

	@Override
	public void log(String message) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void close() {
		try {
			if (m_connection != null)
				m_connection.close();
			if (ic != null)
				ic.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}		
	}

	@Override
	public Session getSession() {
		return session;
	}

}
