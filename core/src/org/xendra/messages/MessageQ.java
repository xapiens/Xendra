package org.xendra.messages;

import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
import javax.jms.QueueSession;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.compiere.db.CConnection;
import org.compiere.model.MMessageFormat;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_MessageFormat;
import org.compiere.model.persistence.X_A_Machine;
import org.compiere.model.persistence.X_A_Xendrian_Message;
import org.compiere.model.persistence.X_M_Inventory;
import org.compiere.model.persistence.X_M_Movement;
import org.compiere.util.Env;
import org.compiere.util.Util;
import org.hornetq.api.core.Message;
import org.hornetq.api.core.client.ClientSession;
import org.hornetq.api.core.client.SendAcknowledgementHandler;
import org.hornetq.jms.client.HornetQSession;
import org.kie.api.runtime.Channel;
import org.xendra.Constants;

public class MessageQ implements Channel, SendAcknowledgementHandler {

	private MMessageFormat m_format;
	private Queue queue;
	private ClientSession coreSession;
	@Override
	public void send(Object po) {
		if (m_format != null) {
			m_format.startMessage();
			String error = m_format.Analyze(po);
			m_format.ValidateMessage();
			if (error.length() == 0) {
				try {
					QueueConnectionFactory cf = null;			
					//X_A_Machine machine = Env.getMessageHost(Env.getMachine());
					//X_A_Machine machine = Env.getMessageHost(Env.getMachine());
					queue = (Queue) CConnection.get().lookup("192.168.7.10", m_format.getQueueName());
					cf = (QueueConnectionFactory) CConnection.get().lookup(	"192.168.7.10", Constants.QConnectionFactory);
					QueueConnection connection = cf.createQueueConnection();
					connection.start();
					QueueSession session = connection.createQueueSession(false,	Session.AUTO_ACKNOWLEDGE);
					coreSession = ((HornetQSession) session).getCoreSession();
					coreSession.setSendAcknowledgementHandler(this);
					String id = Util.getUUID();

					TextMessage request = session.createTextMessage(m_format.getValidMessage());
					request.setStringProperty(X_A_Xendrian_Message.COLUMNNAME_Identifier, id);
					MessageProducer sender = null;
					sender = session.createProducer(queue);
					sender.send(request);
					connection.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else {
				System.out.println(error);
			}
		}
	}

	public void setMessageFormat(MMessageFormat format) {
		m_format = format;
	}

	public static void main(String[] args) {
		org.compiere.Xendra.startup(true);
		Integer mid = 1000278;
		X_M_Inventory m = new Query(Env.getCtx(), X_M_Inventory.Table_Name, "M_Inventory_ID = ?", null)
		.setParameters(mid).first();
		Integer mfid = 1000019;
		MMessageFormat f = new Query(Env.getCtx(), X_AD_MessageFormat.Table_Name, "AD_MessageFormat_ID = ?", null)
		.setParameters(mfid).first();
		MessageQ q = new MessageQ();
		q.setMessageFormat(f);
		q.send(m);
	}

	@Override
	public void sendAcknowledged(Message arg0) {
		// TODO Auto-generated method stub

	}
}
