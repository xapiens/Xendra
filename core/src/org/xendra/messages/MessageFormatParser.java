package org.xendra.messages;

import java.io.InputStream;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Iterator;
import org.columba.core.xml.XMLCoreParser;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_MessageFormat;
import org.compiere.model.persistence.X_AD_Plugin;
import org.compiere.model.persistence.X_AD_Process;
import org.compiere.model.persistence.X_AD_Process_Machine;
import org.compiere.model.persistence.X_AD_Rule;
import org.compiere.model.persistence.X_AD_Scheduler;
import org.compiere.model.reference.REF_AD_SchedulerType;
import org.compiere.model.reference.REF_RuleType;
import org.compiere.util.Env;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.output.XMLOutputter;
import org.xendra.Constants;
import org.xendra.rules.RuleXMLParser;

public class MessageFormatParser  extends XMLCoreParser {
	private X_AD_Plugin m_plugin;
	private boolean force = false;
	public MessageFormatParser(X_AD_Plugin plugin) {
		m_plugin = plugin;
	}

	public void parserFormat(InputStream is) {
		try {
			Document doc = retrieveDocument(is);
			Element parent = doc.getRootElement();
			Iterator iterator = parent.getChildren().listIterator();
			Element extensionXmlElement;
			String Identifier = parent.getAttributeValue(Constants.XML_ATTRIBUTE_IDENTIFIER);
			String sync = parent.getAttributeValue(Constants.XML_ATTRIBUTE_SYNCHRONIZED);
			String queuename = parent.getAttributeValue(X_AD_MessageFormat.COLUMNNAME_QueueName);
			Integer AD_Rule_ID  = 0;
			Timestamp kiebasesync = null;
			if (sync != null)
				kiebasesync = Timestamp.valueOf(sync);
			if (kiebasesync == null)
				kiebasesync = new Timestamp(System.currentTimeMillis());			
			String name = parent.getAttributeValue(Constants.XML_ATTRIBUTE_NAME);			
			while (iterator.hasNext()) {
				extensionXmlElement = (Element) iterator.next();							
				if (extensionXmlElement.getName().equals("process")) {
					String procvalue = extensionXmlElement.getAttributeValue(X_AD_Process.COLUMNNAME_Value);
					String classname = extensionXmlElement.getAttributeValue(Constants.XML_ATTRIBUTE_CLASS);
					if (classname == null)
						classname = "";
					String accesslevel = extensionXmlElement.getAttributeValue(X_AD_Process.COLUMNNAME_AccessLevel);
					String frequencytype = extensionXmlElement.getAttributeValue(X_AD_Scheduler.COLUMNNAME_FrequencyType);
					BigDecimal frequency = new BigDecimal(extensionXmlElement.getAttributeValue(X_AD_Scheduler.COLUMNNAME_Frequency).toString());
					BigDecimal keeplogdays = new BigDecimal(extensionXmlElement.getAttributeValue(X_AD_Scheduler.COLUMNNAME_KeepLogDays).toString());
					String procname = extensionXmlElement.getAttributeValue(X_AD_Process.COLUMNNAME_Name);
					queuename = extensionXmlElement.getAttributeValue(X_AD_MessageFormat.COLUMNNAME_QueueName);					
					String procid = extensionXmlElement.getAttributeValue(X_AD_Process.COLUMNNAME_Identifier);
					String ruleid = extensionXmlElement.getAttributeValue(X_AD_Rule.COLUMNNAME_AD_Rule_ID);
					//
					X_AD_Process process = new Query(Env.getCtx(), X_AD_Process.Table_Name, "identifier = ? ", null)
					.setParameters(procid).first();
					if (process == null) {
						if (classname != null) {
							process = new Query(Env.getCtx(), X_AD_Process.Table_Name, "classname = ? ", null)
							.setParameters(classname).first();
							if (process != null) {
								process.setIdentifier(procid);
								process.save();
							}
						}
					}
					if (process == null) {
						process = new X_AD_Process(Env.getCtx(), 0, null);
					}
					if (process.getSynchronized() == null ||process.getSynchronized().compareTo(kiebasesync) != 0 ||  force) {						
						process.setIsServerProcess(true);
						process.setID(m_plugin.getID());
						process.setIdentifier(procid);
						process.setName(procname);
						process.setValue(procvalue);
						process.setIsReport(false);
						process.setAccessLevel(accesslevel);
						if (classname.length() > 0)
							process.setClassname(classname);	
						process.setRuleType(REF_RuleType.Listener);
						if (ruleid.length() > 0) {
							X_AD_Rule rule = new Query(Env.getCtx(), X_AD_Rule.Table_Name, "Identifier = ?", null)
							.setParameters(ruleid).first();
							if (rule != null) {
								AD_Rule_ID = rule.getAD_Rule_ID();
								process.setAD_Rule_ID(rule.getAD_Rule_ID());							
							}
						}
						process.setSynchronized(kiebasesync);
						process.save();
					}
					//
					X_AD_Process_Machine pm = new Query(Env.getCtx(), X_AD_Process_Machine.Table_Name, "A_Machine_ID = ? AND AD_Process_ID = ?" , null)
					.setParameters(Env.getMachine().getA_Machine_ID(), process.getAD_Process_ID()).first();
					if (pm == null)
					{
						pm = new X_AD_Process_Machine(Env.getCtx(), 0, null);
						pm.setA_Machine_ID(Env.getMachine().getA_Machine_ID());
						pm.setAD_Process_ID(process.getAD_Process_ID());
						pm.save();
					}					
					//
					X_AD_Scheduler scheduler = new Query(Env.getCtx(), X_AD_Scheduler.Table_Name, "AD_Process_ID = ?", null)
					.setParameters(process.getAD_Process_ID()).first();
					if (scheduler == null) {
						scheduler = new X_AD_Scheduler(Env.getCtx(), 0, null);
					}
					if (scheduler.getSynchronized() == null || scheduler.getSynchronized().compareTo(kiebasesync) != 0 || force)
					{						
						scheduler.setName(procname);
						scheduler.setAD_Process_ID(process.getAD_Process_ID());
						scheduler.setFrequencyType(frequencytype);
						scheduler.setFrequency(frequency.intValue());
						scheduler.setSupervisor_ID(100);
						scheduler.setKeepLogDays(keeplogdays.intValue());
						scheduler.setScheduleType(REF_AD_SchedulerType.Frequency);						
						//scheduler.setTag(tag);
						scheduler.setSynchronized(kiebasesync);
						scheduler.save();
					}						
				}
			}
			String typecontainer  = parent.getName();
			X_AD_MessageFormat rulecontainer = new Query(Env.getCtx(), X_AD_MessageFormat.Table_Name, "Identifier = ?", null)
			.setParameters(Identifier).first();	
			if (rulecontainer != null)
			{
				if (rulecontainer.isLockout() && !force)
				{
					return;
				}								
			}
			if (AD_Rule_ID > 0) {
				if (rulecontainer != null)
					rulecontainer.setSynchronized(null);
			}
			if (rulecontainer == null || rulecontainer.getSynchronized() == null || rulecontainer.getSynchronized().compareTo(kiebasesync) != 0 || force) {
				if (rulecontainer == null) {
					rulecontainer = new X_AD_MessageFormat(Env.getCtx(), 0, null);
					rulecontainer.setID(m_plugin.getID());						
					rulecontainer.setIdentifier(Identifier);
					rulecontainer.setAD_Plugin_ID(m_plugin.getAD_Plugin_ID());
					rulecontainer.setName(name);
					rulecontainer.setLockout(true);
				}
				XMLOutputter xmOut = new XMLOutputter();			
				rulecontainer.setFormat(xmOut.outputString(doc));
				rulecontainer.setAD_Rule_ID(AD_Rule_ID);
				rulecontainer.setQueueName(queuename);
				rulecontainer.setSynchronized(kiebasesync);
				rulecontainer.save();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public MessageFormatParser setForce(boolean force) {
		this.force = force; 
		return this;
	}

}
