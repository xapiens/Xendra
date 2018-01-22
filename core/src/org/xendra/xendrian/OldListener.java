package org.xendra.xendrian;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import java.util.Vector;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.MessageConsumer;
import javax.jms.MessageListener;
import javax.jms.Queue;
import javax.jms.Session;
import javax.naming.InitialContext;

import org.compiere.model.MRule;
import org.compiere.util.Env;
import org.compiere.util.Util;
import org.kie.api.conf.EqualityBehaviorOption;
import org.kie.api.conf.EventProcessingOption;
import org.xendra.xendrian.ExampleListener;

public class OldListener implements Runnable, IRulesServices {
	private MessageConsumer consumer;
	private String queuename;
	private String listenerclass;
	private String m_error = "";
	private List<MRule> m_rules;
	private int m_AD_Rule_ID;
	private MessageListener ml;
	private InitialContext ic;
	private Connection m_connection;
	private Session session;
	//private int m_tListeners;
	//
	public OldListener() {
		//m_tListeners = tListeners; 
	}
	public OldListener(List<MRule> rules, int AD_Rule_ID) {			
		m_rules = rules;
		m_AD_Rule_ID = AD_Rule_ID;
		//bootstrap();
	}
	public String getMessageError()
	{
		return m_error;
	}
	public void run() {
		boolean forever = false;
		try {			
//			while (Env.getlistener().keySet().size() != m_tListeners)
//			{
//				Thread.sleep(1000);
//			}			
			String error = bootstrap();
			if (error.length() == 0)
				forever = true;
			else
			{
				System.out.println("cancelando instancia de Listener:");
				System.out.println(error);
			}
			while (forever)
			{
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	@Override
	public void log(String message) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String bootstrap() {
		String error = "";
		System.out.println("iniciando bootstrap de Listener - version 2");
		Properties props = new Properties();
		props.put("java.naming.factory.initial", "org.jnp.interfaces.NamingContextFactory");
		String url = Util.getMessageProtocol().concat(Util.getLocalHostName()).concat(":").concat(String.valueOf(Util.getAppsPort()));			
		props.put("java.naming.provider.url", url);
		props.put("java.naming.factory.url.pkgs", "org.jboss.naming:org.jnp.interfaces");
		try {
			ic = new InitialContext(props);
			ConnectionFactory cf = (ConnectionFactory) ic.lookup("/ConnectionFactory");
			m_connection = cf.createConnection();
			//m_connection.setExceptionListener(new ExampleListener(this));
			m_connection.start();				
			session = m_connection.createSession(false, Session.CLIENT_ACKNOWLEDGE);
			//Session session = connection.createSession(false, Session.CLIENT_ACKNOWLEDGE);
			//Session session = m_connection.createSession(false, Session.CLIENT_ACKNOWLEDGE);
			for (Object key : Env.getlistener().keySet()) {
				String queuename = (String) key;
				Vector vector = (Vector) Env.getlistener().get(key);
				String listenerclass = (String) vector.firstElement();
				int m_AD_Rule_ID = (int) vector.lastElement();
				Queue queue = (Queue) ic.lookup(queuename);
				consumer = session.createConsumer(queue);					
				Class<?> clazz = Class.forName(listenerclass);
				System.out.println("deployando "+listenerclass);
				Constructor<?> constructor = clazz.getDeclaredConstructor(new Class[]{IRulesServices.class, Integer.class});					
				ml = (MessageListener) constructor.newInstance(new Object[] {this, m_AD_Rule_ID});
				consumer.setMessageListener(ml);
				System.out.println("encontrado listener "+ml.toString());
			}		
		} catch (Exception e) {
			e.printStackTrace();
			error = e.getMessage();
		}		
		return error;
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
//	@Override
	public Session getSession() {
		return session;
	}
}