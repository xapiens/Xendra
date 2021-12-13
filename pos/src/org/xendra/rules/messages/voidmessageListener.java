package org.xendra.rules.messages;

import java.io.StringReader;
import java.util.Properties;

import javax.jms.Destination;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.MessageProducer;
import javax.jms.TextMessage;

import org.compiere.model.persistence.X_C_Invoice;
import org.compiere.util.Env;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.xendra.pos.Transaction;
import org.xendra.rules.model.SalesPolicyRequest;

public class voidmessageListener implements MessageListener {

	private Integer m_AD_MessageFormat_ID;
	private Integer m_AD_Rule_ID;

	public voidmessageListener(Integer AD_MessageFormat_ID, Integer AD_Rule_ID) {
		m_AD_MessageFormat_ID = AD_MessageFormat_ID;
		m_AD_Rule_ID = AD_Rule_ID;
	}
	
	@Override
	public void onMessage(Message message) {
		try {									
			System.out.println("anulacion...");
			String m_voidMsg = "Ok.";
			Destination replyDestination = message.getJMSReplyTo();
			Integer C_Invoice_ID = message.getIntProperty(X_C_Invoice.COLUMNNAME_C_Invoice_ID);
			String identifier = message.getStringProperty(X_C_Invoice.COLUMNNAME_Identifier);
			String properties  = message.getStringProperty("Properties");
			Properties p = Env.SetXMLToProperties(properties);
			Integer C_Order_ID = Transaction.voidTransaction(p, C_Invoice_ID, identifier);
			if (C_Order_ID == 0)
			{
				m_voidMsg = Transaction.getVoidMssg();
			}				
			message.acknowledge();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}		
	}
}
