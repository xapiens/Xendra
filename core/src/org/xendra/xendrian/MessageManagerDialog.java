package org.xendra.xendrian;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.jms.Queue;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
import javax.jms.QueueSession;
import javax.jms.Session;
import javax.management.MBeanServerConnection;
import javax.management.MBeanServerInvocationHandler;
import javax.management.ObjectName;
import javax.management.remote.JMXConnector;
import javax.management.remote.JMXConnectorFactory;
import javax.management.remote.JMXServiceURL;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import net.miginfocom.swing.MigLayout;

import org.columba.api.command.IWorkerStatusChangeListener;
import org.columba.api.command.WorkerStatusChangedEvent;
import org.compiere.db.CConnection;
import org.compiere.swing.CTabbedPane;
import org.compiere.util.Util;
import org.hornetq.api.core.management.MessageCounterInfo;
import org.hornetq.api.core.management.ObjectNameBuilder;
import org.hornetq.api.jms.management.JMSQueueControl;
import org.xendra.Constants;

public class MessageManagerDialog extends JDialog implements ActionListener, IWorkerStatusChangeListener {
	private static final String JMX_URL = "service:jmx:rmi:///jndi/rmi://"+Util.getLocalHostName()+":3000/jmxrmi";
	private static MessageManagerDialog instance;
	private MessageManager mm;
	private JButton btnexit; 
	private CTabbedPane maintab;
	public MessageManagerDialog(MessageManager messageManager) {
		super((JFrame) null, "Message Manager", false);
		mm = messageManager;
		initComponents();
		pack();
		setLocationRelativeTo(null);				
	}

	private void initComponents() {		
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new MigLayout());
		mainPanel.setBorder(BorderFactory.createEmptyBorder(12, 12, 12, 12));		
		btnexit = new JButton("Exit");
		btnexit.addActionListener(this);
		maintab = new CTabbedPane(JTabbedPane.TOP);
		try {
			QueueConnectionFactory cf = null;
			List<String> queues = new ArrayList<String>();
			queues.add(Constants.QPOSQUEUE);
			queues.add(Constants.QPOPQUEUE);
			queues.add(Constants.QTRANSFERQUEUE);
			//queues.add(Constants.QCONFIRMQUEUE);
			queues.add(Constants.QREPLICATIONMERGEQUEUE);
			queues.add(Constants.QREPLICATIONREFERENCEQUEUE);
			cf = (QueueConnectionFactory) CConnection.get().lookup(Util.getLocalHostName(),	Constants.QConnectionFactory);
			for (String queuename:queues)
			{
				Queue queue = null;
				try {
					queue = (Queue) CConnection.get().lookup(Util.getLocalHostName(), queuename);
				}
				catch (Exception e)
				{
					continue;
				}
				ObjectName on = ObjectNameBuilder.DEFAULT.getJMSQueueObjectName(queue.getQueueName());
				JMXConnector connector =
						JMXConnectorFactory.connect(new JMXServiceURL(JMX_URL), new HashMap<String, Object>());
				MBeanServerConnection mbsc = connector.getMBeanServerConnection();
				JMSQueueControl queueControl = MBeanServerInvocationHandler.newProxyInstance(mbsc,
						on,
						JMSQueueControl.class,
						false);
				String counters = queueControl.listMessageCounter();
				MessageCounterInfo counter = MessageCounterInfo.fromJSON(counters);
				String msg = String.format("%s",queuename); 
				msg += String.format("   %s message(s) added to the queue (since last sample: %s)%n",   counter.getCount(), counter.getCountDelta());
				msg += String.format("   %s message(s) in the queue (since last sample: %s)%n", counter.getDepth(), counter.getDepthDelta());
				msg += String.format("   last message added at %s%n%n", counter.getLastAddTimestamp());
				mainPanel.add(new JLabel(msg),"wrap");
			}
			mainPanel.add(btnexit);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}		
		getContentPane().add(mainPanel);
	}

	@Override
	public void workerStatusChanged(WorkerStatusChangedEvent e) {
				
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(btnexit))
		{
			this.dispose();
		}
	}

	public static MessageManagerDialog createInstance(MessageManager messageManager) {
		//if (instance == null) {
			instance = new MessageManagerDialog(messageManager);
		//}
		if (!instance.isVisible()) {
			instance.update();
			instance.pack();
			instance.setVisible(true);
		}
		instance.toFront();

		return instance;		
	}

	private void update() {
		
	}
}
