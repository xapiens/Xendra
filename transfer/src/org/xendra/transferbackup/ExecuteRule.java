package org.xendra.transferbackup;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.MessageConsumer;
import javax.jms.MessageListener;
import javax.jms.Queue;
import javax.jms.Session;
import javax.naming.InitialContext;

import org.compiere.model.MProcess;
import org.compiere.model.MRule;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Process;
import org.compiere.model.persistence.X_AD_Rule;
import org.compiere.model.reference.REF_RuleType;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;
import org.compiere.util.Env;
import org.compiere.util.Util;
import org.kie.api.conf.EqualityBehaviorOption;
import org.kie.api.conf.EventProcessingOption;
import org.kie.api.runtime.rule.EntryPoint;

public class ExecuteRule extends SvrProcess {
	
	HashMap <String, String> sessionEntrypoints = new HashMap<String, String>();
	Map <String, EntryPoint> Entrypoints = new HashMap<String, EntryPoint>();
	HashMap <String, String> sessionqueues = new HashMap<String, String>();
	HashMap <String, String> queueslisteners = new HashMap<String, String>();
	Hashtable queueprocess = new Hashtable();
	private InitialContext ic = null;
	private List<MessageConsumer> consumers = new ArrayList<MessageConsumer>();
	private Connection connection;
	private Session session;
	private int	p_Process_ID = 0;
	@Override
	protected void prepare() {
		for (ProcessInfoParameter para:getParameter())
		{
			String name = para.getParameterName();
			if (name.equals(X_AD_Process.COLUMNNAME_AD_Process_ID))
			{
				p_Process_ID = para.getParameterAsInt();
			}
		}
	}

	@Override
	protected String doIt() throws Exception {
		MProcess process = MProcess.get(Env.getCtx(), getProcessInfo().getAD_Process_ID());
		MRule startrule = MRule.get(Env.getCtx(), process.getAD_Rule_ID());
		if (startrule.getRuleType().equals(REF_RuleType.Listener))
		{
			List<MRule> rules = new Query(Env.getCtx(), X_AD_Rule.Table_Name,"AD_Rule_ID = ? OR Parent_ID = ?", null)
				.setParameters(startrule.getAD_Rule_ID(), startrule.getAD_Rule_ID()).list();
			
			HashMap properties = new HashMap();
			//List<Vector> rules = new ArrayList<Vector>();			
			List<String> sessions = new ArrayList<String>();				
			
			for (MRule rule:rules)
			{
				properties = (HashMap) rule.getProperties();
				String type = (String) properties.get("type");				
				if (type.equals("kiebase"))
				{
					String name = rule.getName();
					String entrypoint = (String) properties.get("EntryPoint");										
					if (entrypoint != null && entrypoint.length() > 0)
					{
						if (!sessionEntrypoints.containsKey(name))
							sessionEntrypoints.put(name, entrypoint);
					}
					String queuename = (String) properties.get("queuename");
					if (queuename != null && queuename.length() > 0)
					{
						if (!sessionqueues.containsKey(name))
						{
							sessionqueues.put(name, queuename);
							//queueprocess.put(name, AD_Process_ID);
						}
					}						
					String queuelistenerclass = (String) properties.get("queuelistenerclass");
					if (queuelistenerclass != null && queuelistenerclass.length() > 0)
					{
						if (!queueslisteners.containsKey(queuename))
							queueslisteners.put(queuename, queuelistenerclass);
					}					
					boolean isdefault = Boolean.valueOf((String)properties.get("default"));
					//"type"=>"kiebase", "package"=>"org.xendra.rules.messages", "EqualsBehavior"=>"EQUALITY", "EventProcessingMode"=>"STREAM",SessionName=>rulesKS/
					String m_package = (String) properties.get("package");
					String m_sessionname = (String) properties.get("SessionName");
					sessions.add(m_sessionname);
					String m_EqualsBehavior = (String) properties.get("EqualsBehavior");
					EqualityBehaviorOption equalbehavopt = EqualityBehaviorOption.EQUALITY ;
					EventProcessingOption evtprocopt = EventProcessingOption.CLOUD;
					if (m_EqualsBehavior.equals("EQUALITY"))
						equalbehavopt = EqualityBehaviorOption.EQUALITY;
					else if (m_EqualsBehavior.equals("IDENTITY"))
						equalbehavopt = EqualityBehaviorOption.IDENTITY;
					String m_EventProcessingMode = (String) properties.get("EventProcessingMode");
					if (m_EventProcessingMode.equals("STREAM"))
						evtprocopt = EventProcessingOption.STREAM;
					else if (m_EventProcessingMode.equals("CLOUD"))
						evtprocopt = EventProcessingOption.CLOUD;										
				}
			}
			Properties props = new Properties();
			props.put("java.naming.factory.initial", "org.jnp.interfaces.NamingContextFactory");
			String url = Util.getMessageProtocol().concat(Util.getLocalHostName()).concat(":").concat(String.valueOf(Util.getAppsPort()));			
			props.put("java.naming.provider.url", url);
			props.put("java.naming.factory.url.pkgs", "org.jboss.naming:org.jnp.interfaces");
			
			ic = new InitialContext(props);
			ConnectionFactory cf = (ConnectionFactory) ic.lookup("/ConnectionFactory");
			connection = cf.createConnection();
			//connection.setExceptionListener(new ExampleListener(this));
			connection.start();
			session = connection.createSession(false, Session.CLIENT_ACKNOWLEDGE);

			for (String key : getQueues().keySet()) {
				String queuename = getQueues().get(key);
				//Integer AD_Process_ID = (Integer) getProcess().get(key);
				Queue pos = (Queue) ic.lookup(queuename);
				MessageConsumer consumer = session.createConsumer(pos);					
				String listenerclass = getQueuesListenersclass().get(queuename);
				if (listenerclass != null && listenerclass.length() > 0)
				{
					Class<?> clazz = Class.forName(listenerclass);
					Constructor<?> constructor = clazz.getDeclaredConstructor(new Class[]{Integer.class});					
					MessageListener ml = (MessageListener) constructor.newInstance(new Object[] {p_Process_ID});
					consumer.setMessageListener(ml);
					System.out.println("encontrado listener "+ml.toString());
				}
				consumers.add(consumer);
			}			
		}
		return null;
	}

	public HashMap<String, String> getQueues() {
		return sessionqueues;
	}
	public HashMap<String, String> getQueuesListenersclass() {
		return queueslisteners;
	}	
//	public Hashtable getProcess() {
//		return queueprocess;
//	}
}
