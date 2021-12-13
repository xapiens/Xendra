package org.xendra.rules;

import java.io.InputStream;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.columba.core.xml.XMLCoreParser;
import org.compiere.model.MColumn;
import org.compiere.model.MTable;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Column;
import org.compiere.model.persistence.X_AD_MessageFormat;
import org.compiere.model.persistence.X_AD_Plugin;
import org.compiere.model.persistence.X_AD_Process;
import org.compiere.model.persistence.X_AD_Process_Machine;
import org.compiere.model.persistence.X_AD_Rule;
import org.compiere.model.persistence.X_AD_Scheduler;
import org.compiere.model.persistence.X_AD_Table;
import org.compiere.model.persistence.X_C_DocType;
import org.compiere.model.reference.REF_AD_SchedulerType;
import org.compiere.model.reference.REF_RuleType;
import org.compiere.util.CLogger;
import org.compiere.util.Env;
import org.jdom.Document;
import org.jdom.Element;
import org.xendra.Constants;
import org.xendra.printdocument.PrintFormatXMLParser;

public class RuleXMLParser extends XMLCoreParser {
	private static final CLogger LOG = CLogger.getCLogger("org.xendra.rules");
	private X_AD_Plugin plugin = null;
	private boolean force = false;
	public RuleXMLParser(X_AD_Plugin plugin) {
		this.plugin = plugin;
	}
	public void parseGroups(InputStream is) {
		try {
			Document doc = retrieveDocument(is);
			Element parent = doc.getRootElement();
			Iterator iterator = parent.getChildren().listIterator();
			Element extensionXmlElement;
			while (iterator.hasNext()) {
				extensionXmlElement = (Element) iterator.next();
				String identifier = extensionXmlElement.getAttributeValue(Constants.XML_ATTRIBUTE_IDENTIFIER);
				String name = extensionXmlElement.getAttributeValue(Constants.XML_ATTRIBUTE_NAME);
				String sync = extensionXmlElement.getAttributeValue(Constants.XML_ATTRIBUTE_SYNCHRONIZED);
				X_AD_Rule rule = new Query(Env.getCtx(), X_AD_Rule.Table_Name, "Identifier = ?", null)
				.setParameters(identifier).first();
				if (rule == null) {
					rule = new X_AD_Rule(Env.getCtx(), 0, null);
					rule.setName(name);
					rule.setIdentifier(identifier);
					rule.setAD_Plugin_ID(plugin.getAD_Plugin_ID());
					Timestamp tsync = Timestamp.valueOf(sync);
					rule.setSynchronized(tsync);
					HashMap map = new HashMap();
					map.put(Constants.XML_ATTRIBUTE_TYPE, "group");
					rule.setProperties(map);
					rule.save();
				}														
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public String parseFormat(InputStream is) {
		String error = "";
		try {			
			Document doc = retrieveDocument(is);
			Element parent = doc.getRootElement();
			String sessionname = parent.getAttributeValue(Constants.XML_ATTRIBUTE_SESSIONNAME);
			String Identifier = parent.getAttributeValue(Constants.XML_ATTRIBUTE_IDENTIFIER);
			String sync = parent.getAttributeValue(Constants.XML_ATTRIBUTE_SYNCHRONIZED);
			String typecontainer  = parent.getName();
			if (typecontainer == null)
				throw new Exception("type is mandatory");

			Timestamp kiebasesync = null;
			if (sync != null)
			{
				try {
					kiebasesync = Timestamp.valueOf(sync);
				} catch (Exception e) {
					kiebasesync = new Timestamp(System.currentTimeMillis());
				}
			}
			X_AD_Rule rulecontainer = new Query(Env.getCtx(), X_AD_Rule.Table_Name, "Identifier = ?", null)
			.setParameters(Identifier).first();	
			if (rulecontainer != null)
			{
				if (rulecontainer.isLockout() && !force)
				{
					throw new Exception("rule is locked");
				}								
			}
			if (rulecontainer == null || rulecontainer.getSynchronized() == null || rulecontainer.getSynchronized().compareTo(kiebasesync) != 0 || force)
			{
				if (typecontainer.equals("kiebase"))
				{
					if (rulecontainer == null)
					{
						rulecontainer = new X_AD_Rule(Env.getCtx(), 0, null);											
						rulecontainer.setIdentifier(Identifier);
					}	
					rulecontainer.setID(plugin.getID());
					rulecontainer.setAD_Plugin_ID(plugin.getAD_Plugin_ID());
					if (sessionname == null)
						throw new Exception("Session Name is mandatory");							
					String name = parent.getAttributeValue(Constants.XML_ATTRIBUTE_NAME);
					String agenda = parent.getAttributeValue(Constants.XML_ATTRIBUTE_AGENDA);
					if (agenda == null)
						throw new Exception("agenda is mandatory");
					String isdefault = parent.getAttributeValue(Constants.XML_ATTRIBUTE_DEFAULT);
					if (isdefault == null)
						isdefault = "false";		
					String packagename = parent.getAttributeValue(Constants.XML_ATTRIBUTE_PACKAGE);
					if (packagename == null)
						throw new Exception("packagename is obligatory");
					HashMap<String, String> props = new HashMap();
					String QueueName = parent.getAttributeValue(Constants.XML_ATTRIBUTE_QUEUENAME);
					if (QueueName != null) {
						props.put(Constants.XML_ATTRIBUTE_QUEUENAME, QueueName);
					}
					String ruletype = parent.getAttributeValue(Constants.XML_ATTRIBUTE_RULETYPE);
					if (ruletype == null || ruletype.length() == 0) 
						ruletype = REF_RuleType.JSR94RuleEngineAPI;
					rulecontainer.setRuleType(ruletype);
					String idgroup = parent.getAttributeValue(Constants.XML_ATTRIBUTE_GROUP);
					String group = "";
					if (idgroup != null) {
						X_AD_Rule g = new Query(Env.getCtx(), X_AD_Rule.Table_Name, "Identifier = ?", null)
						.setParameters(idgroup).first();
						if (g != null) {
							group = String.valueOf(g.getAD_Rule_ID());							
						}					
					}
					props.put(Constants.XML_ATTRIBUTE_GROUP, group);
					String EntryPoint = parent.getAttributeValue(Constants.XML_ATTRIBUTE_ENTRYPOINT);											
					if (EntryPoint != null)
						props.put(Constants.XML_ATTRIBUTE_ENTRYPOINT, EntryPoint);
					String EqualsBehavior = parent.getAttributeValue(Constants.XML_ATTRIBUTE_EQUALSBEHAVIOR);
					if (EqualsBehavior != null)
						props.put(Constants.XML_ATTRIBUTE_EQUALSBEHAVIOR, EqualsBehavior);					
					String queuelistenerclass = parent.getAttributeValue(Constants.XML_ATTRIBUTE_QUEUELISTENERCLASS);
					if (queuelistenerclass != null)	
						props.put(Constants.XML_ATTRIBUTE_QUEUELISTENERCLASS, queuelistenerclass);									
					String EventProcessingMode = parent.getAttributeValue(Constants.XML_ATTRIBUTE_EVENTPROCESSINGMODE);
					if (EventProcessingMode != null)
						props.put(Constants.XML_ATTRIBUTE_EVENTPROCESSINGMODE, EventProcessingMode);					
					props.put(Constants.XML_ATTRIBUTE_TYPE, typecontainer);
					props.put(Constants.XML_ATTRIBUTE_AGENDA, agenda);
					props.put(Constants.XML_ATTRIBUTE_DEFAULT, isdefault);
					props.put(Constants.XML_ATTRIBUTE_PACKAGE, packagename);
					props.put(Constants.XML_ATTRIBUTE_SESSIONNAME, sessionname);					
					rulecontainer.setName(name);
					rulecontainer.setProperties(props);			
					if (kiebasesync != null)
						rulecontainer.setSynchronized(kiebasesync);
					if (rulecontainer.save())
					{
					}
				}
				else if (typecontainer.equals("model")) {
					System.out.println("X");
				}
				else if (typecontainer.equals("listen"))
				{
					if (rulecontainer == null)
					{
						rulecontainer = new X_AD_Rule(Env.getCtx(), 0, null);					
						rulecontainer.setID(plugin.getID());
						rulecontainer.setIdentifier(Identifier);
					}					
					HashMap<String, String> props = new HashMap();
					String name = parent.getAttributeValue(Constants.XML_ATTRIBUTE_NAME);
					String packagename = parent.getAttributeValue(Constants.XML_ATTRIBUTE_PACKAGE);
					if (packagename == null)
						throw new Exception("packagename is obligatory");
					props.put(Constants.XML_ATTRIBUTE_TYPE, typecontainer);
					props.put(Constants.XML_ATTRIBUTE_PACKAGE, packagename);
					String QueueName = parent.getAttributeValue(Constants.XML_ATTRIBUTE_QUEUENAME);			
					if (QueueName == null)
						throw new Exception("queuename is obligatory");
					props.put(Constants.XML_ATTRIBUTE_QUEUENAME, QueueName);
					String queuelistenerclass = parent.getAttributeValue(Constants.XML_ATTRIBUTE_QUEUELISTENERCLASS);
					if (queuelistenerclass != null)	
						props.put(Constants.XML_ATTRIBUTE_QUEUELISTENERCLASS, queuelistenerclass);
					rulecontainer.setRuleType(REF_RuleType.Listener);
					rulecontainer.setName(name);
					rulecontainer.setProperties(props);			
					if (kiebasesync != null)
						rulecontainer.setSynchronized(kiebasesync);
					if (rulecontainer.save())
					{}				
				}				
			} 								
			Iterator iterator = parent.getChildren().listIterator();
			Element extensionXmlElement;
			while (iterator.hasNext()) {
				extensionXmlElement = (Element) iterator.next();
				String id = extensionXmlElement.getAttributeValue(Constants.XML_ATTRIBUTE_IDENTIFIER);
				String extsync = extensionXmlElement.getAttributeValue(Constants.XML_ATTRIBUTE_SYNCHRONIZED);
				Timestamp extlastsync = null;
				if (extsync != null) {
					try {
						extlastsync = Timestamp.valueOf(extsync);
					} catch (Exception e) {
						extlastsync = new Timestamp(System.currentTimeMillis());
					} 					
				} else {
					extlastsync = new Timestamp(System.currentTimeMillis());
				}
				String type  = extensionXmlElement.getName();
				if (type == "doctype")
				{
					String DocBaseType = extensionXmlElement.getAttributeValue(Constants.XML_ATTRIBUTE_DOCBASETYPE);
					if (DocBaseType != null)
					{
						HashMap map = rulecontainer.getProperties();
						map.put(Constants.XML_ATTRIBUTE_DOCBASETYPE, DocBaseType);
						String DocSubType = extensionXmlElement.getAttributeValue(Constants.XML_ATTRIBUTE_DOCSUBTYPE);
						if (DocSubType == null)
							DocSubType = "";
						map.put(Constants.XML_ATTRIBUTE_DOCSUBTYPE, DocSubType);
						rulecontainer.setProperties(map);
						rulecontainer.save();
						List<X_C_DocType> doctypes = new Query(Env.getCtx(), X_C_DocType.Table_Name, "DocBaseType = ?", null)
						.setParameters(DocBaseType).list();
						for (X_C_DocType doctype:doctypes)
						{
							if (DocSubType.equals(doctype.getDocSubType()))
							{
								doctype.setAD_Rule_ID(rulecontainer.getAD_Rule_ID());
								doctype.save();
							}
							else 
							{
								if (DocSubType.length() == 0)
								{
									doctype.setAD_Rule_ID(rulecontainer.getAD_Rule_ID());
									doctype.save();
								}
							}
						}
					}					
				}
				else if (type == "field")
				{
					String tablename = extensionXmlElement.getAttributeValue(X_AD_Table.COLUMNNAME_TableName);
					String columnname = extensionXmlElement.getAttributeValue(X_AD_Column.COLUMNNAME_ColumnName);
					String agenda = extensionXmlElement.getAttributeValue(X_AD_Column.COLUMNNAME_Agenda);
					MTable table = new Query(Env.getCtx(), X_AD_Table.Table_Name, "tablename = ?", null)
					.setParameters(tablename).first();
					if (table != null)
					{
						MColumn column = new Query(Env.getCtx(), X_AD_Column.Table_Name, "AD_Table_ID = ? AND columnname = ?", null)
						.setParameters(table.getAD_Table_ID(), columnname).first();
						if (column != null)
						{
							column.setAgenda(agenda);
							column.setAD_Rule_ID(rulecontainer.getAD_Rule_ID());
							column.save();
						}
					}
				}
				else if (type == "rule")
				{
					String name  = extensionXmlElement.getAttributeValue(Constants.XML_ATTRIBUTE_NAME);
					String QueueName = parent.getAttributeValue(Constants.XML_ATTRIBUTE_QUEUENAME);		
					String sessname = parent.getAttributeValue(Constants.XML_ATTRIBUTE_SESSIONNAME);
					String elementname = name;
					if (elementname.lastIndexOf("/") > 0)
						elementname.substring(elementname.lastIndexOf("/") + 1);
					X_AD_Rule rule = new Query(Env.getCtx(), X_AD_Rule.Table_Name, "Identifier = ?", null)
					.setParameters(id).first();
					if (rule == null)
					{
						HashMap<String, String>  props = new HashMap();
						props.put(Constants.XML_ATTRIBUTE_NAME, name);
						props.put(Constants.XML_ATTRIBUTE_TYPE, type);
						props.put(Constants.XML_ATTRIBUTE_SESSIONNAME, sessname);						
						rule = new X_AD_Rule(Env.getCtx(), 0, null);
						//rule.setID(m_id);
						rule.setID(plugin.getID());
						rule.setIdentifier(id);					
						if (QueueName != null)
						{				
							props.put(Constants.XML_ATTRIBUTE_QUEUENAME, QueueName);
							rule.setRuleType(REF_RuleType.Listener);
						}
						else
						{
							rule.setRuleType(REF_RuleType.JSR94RuleEngineAPI);
						}				
						rule.setName(elementname);
						rule.setProperties(props);				
						if (extensionXmlElement.getName().equals("rule"))
							rule.setScript(extensionXmlElement.getText());
						rule.setParent_ID(rulecontainer.getAD_Rule_ID());
						rule.setAD_Plugin_ID(plugin.getAD_Plugin_ID());
						rule.setSynchronized(extlastsync);
						if (!rule.save())
						{
							throw new Exception(String.format("rule %s can't be saved", elementname));
						}
					}
					else if (kiebasesync != null)
					{
						if (rule.getSynchronized() == null || rule.getSynchronized().compareTo(extlastsync) != 0 || force)
						{
							HashMap<String, String>  props = new HashMap();
							props.put(Constants.XML_ATTRIBUTE_NAME, name);
							props.put(Constants.XML_ATTRIBUTE_TYPE, type);
							props.put(Constants.XML_ATTRIBUTE_SESSIONNAME, sessionname);						
							if (QueueName != null)
							{				
								props.put(Constants.XML_ATTRIBUTE_QUEUENAME, QueueName);
								rule.setRuleType(REF_RuleType.Listener);
							}
							else
							{
								rule.setRuleType(REF_RuleType.JSR94RuleEngineAPI);
							}				
							rule.setName(elementname);
							rule.setProperties(props);											
							if (extensionXmlElement.getName().equals("rule"))
								rule.setScript(extensionXmlElement.getText());
							rule.setSynchronized(extlastsync);
							if (!rule.save())
							{
								throw new Exception(String.format("rule %s can't be saved", elementname));
							}
						}
					}										
				}
				else if (type.equals("channel")) {
					String channelid = extensionXmlElement.getAttributeValue(Constants.XML_ATTRIBUTE_IDENTIFIER);
					X_AD_Rule rule = new Query(Env.getCtx(), X_AD_Rule.Table_Name, "Identifier = ?", null)
					.setParameters(channelid).first();
					String modelsync = extensionXmlElement.getAttributeValue(Constants.XML_ATTRIBUTE_SYNCHRONIZED);
					Timestamp modellastsync = new Timestamp(System.currentTimeMillis());
					if (modelsync != null) {
						try {
							Timestamp t = Timestamp.valueOf(modelsync);
							modellastsync = t;
						} catch (Exception e) {

						} 					
					} 										
					if (rule == null || rule.getSynchronized() == null || rule.getSynchronized().compareTo(modellastsync) != 0 || force) {
						if (rule == null) {
							rule = new X_AD_Rule(Env.getCtx(), 0, null);
							rule.setID(plugin.getID());
							rule.setRuleType(REF_RuleType.Channel);
							rule.setIdentifier(channelid);
							rule.setParent_ID(rulecontainer.getAD_Rule_ID());
						}
						String channelname = extensionXmlElement.getAttributeValue(Constants.XML_ATTRIBUTE_NAME);
						rule.setName(channelname);
						HashMap properties = new HashMap();
						properties.put(Constants.XML_ATTRIBUTE_SESSIONNAME, sessionname);
						String msgid = extensionXmlElement.getAttributeValue(X_AD_MessageFormat.COLUMNNAME_AD_MessageFormat_ID);
						if (msgid == null) {
							msgid = "";
						}
						if (msgid.length() > 0) {
							X_AD_MessageFormat format = new Query(Env.getCtx(), X_AD_MessageFormat.Table_Name, "Identifier = ?", null)
							.setParameters(msgid).first();
							if (format != null) {
								properties.put(X_AD_MessageFormat.COLUMNNAME_AD_MessageFormat_ID, format.getAD_MessageFormat_ID());								
							}														
						}
						properties.put(Constants.XML_ATTRIBUTE_NAME, channelname);
						properties.put("type","channel");
						rule.setProperties(properties);
						rule.setAD_Plugin_ID(plugin.getAD_Plugin_ID());
						rule.setSynchronized(modellastsync);
						rule.save();
					}
				}
				else if (type == "model") {
					String modelid = extensionXmlElement.getAttributeValue(Constants.XML_ATTRIBUTE_IDENTIFIER);
					X_AD_Rule rule = new Query(Env.getCtx(), X_AD_Rule.Table_Name, "Identifier = ?", null)
					.setParameters(modelid).first();
					String modelsync = extensionXmlElement.getAttributeValue(Constants.XML_ATTRIBUTE_SYNCHRONIZED);
					Timestamp modellastsync = new Timestamp(System.currentTimeMillis());
					if (modelsync != null) {
						try {
							Timestamp t = Timestamp.valueOf(modelsync);
							modellastsync = t;
						} catch (Exception e) {

						} 					
					} 					
					if (rule == null || rule.getSynchronized() == null || rule.getSynchronized().compareTo(modellastsync) != 0 || force) {
						if (rule == null) {
							rule = new X_AD_Rule(Env.getCtx(), 0, null);
							rule.setID(plugin.getID());
							rule.setRuleType(REF_RuleType.Model);
							rule.setIdentifier(modelid);
							rule.setParent_ID(rulecontainer.getAD_Rule_ID());
						}					
						String modelname = extensionXmlElement.getAttributeValue(Constants.XML_ATTRIBUTE_NAME);
						rule.setName(modelname);
						HashMap properties = new HashMap();
						String tablename = extensionXmlElement.getAttributeValue(X_AD_Table.COLUMNNAME_AD_Table_ID);
						X_AD_Table t = new Query(Env.getCtx(), X_AD_Table.Table_Name, "identifier = ?", null)
						.setParameters(tablename).first();
						properties.put(X_AD_Table.COLUMNNAME_AD_Table_ID, t.getAD_Table_ID());					
						String Classname = extensionXmlElement.getAttributeValue(X_AD_Process.COLUMNNAME_Classname);
						properties.put(X_AD_Process.COLUMNNAME_Classname, Classname);
						properties.put("type","model");
						rule.setProperties(properties);
						rule.setAD_Plugin_ID(plugin.getAD_Plugin_ID());
						rule.setSynchronized(modellastsync);
						rule.save();
					}					
				}
				else if (type == "process")
				{
					String procname = extensionXmlElement.getAttributeValue(Constants.XML_ATTRIBUTE_NAME);
					String procvalue = extensionXmlElement.getAttributeValue(Constants.XML_ATTRIBUTE_VALUE);
					String proctype = extensionXmlElement.getAttributeValue(Constants.XML_ATTRIBUTE_TYPE);
					String classname = extensionXmlElement.getAttributeValue(Constants.XML_ATTRIBUTE_CLASS);
					String procid = extensionXmlElement.getAttributeValue(Constants.XML_ATTRIBUTE_IDENTIFIER);
					String accesslevel = extensionXmlElement.getAttributeValue(Constants.XML_ATTRIBUTE_ACCESSLEVEL);
					String frequencytype = extensionXmlElement.getAttributeValue(Constants.XML_ATTRIBUTE_FREQUENCYTYPE);
					String frequency = extensionXmlElement.getAttributeValue(Constants.XML_ATTRIBUTE_FREQUENCY);
					String tag = extensionXmlElement.getAttributeValue(Constants.XML_ATTRIBUTE_TAG);
					if (tag == null)
						tag = "";
					String messageid = extensionXmlElement.getAttributeValue(X_AD_MessageFormat.COLUMNNAME_AD_MessageFormat_ID);
					if (messageid == null)
						messageid = "";
					String freqstartat = extensionXmlElement.getAttributeValue(Constants.XML_ATTRIBUTE_FREQUENCY_STARTAT);
					String keeplogdays = extensionXmlElement.getAttributeValue(Constants.XML_ATTRIBUTE_KEEPLOGDAYS);
					String ruleid = extensionXmlElement.getAttributeValue(X_AD_Rule.COLUMNNAME_AD_Rule_ID);
					if (ruleid == null) {
						ruleid = "";
					}
					String procsync = extensionXmlElement.getAttributeValue(Constants.XML_ATTRIBUTE_SYNCHRONIZED);
					Timestamp proclastsync = null;
					if (procsync != null)
						proclastsync = Timestamp.valueOf(extsync);
					else
						proclastsync = new Timestamp(System.currentTimeMillis());										
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
					if (process.getSynchronized() == null ||process.getSynchronized().compareTo(proclastsync) != 0) {						
						process.setIsServerProcess(true);
						//process.setID(m_id);
						process.setID(plugin.getID());
						process.setIdentifier(procid);
						process.setName(procname);
						process.setValue(procvalue);
						process.setIsReport(false);
						process.setAccessLevel(accesslevel);
						if (classname.length() > 0)
							process.setClassname(classname);	
						process.setRuleType(proctype);
						if (ruleid.length() > 0) {
							X_AD_Rule r = new Query(Env.getCtx(), X_AD_Rule.Table_Name, "Identifier = ?", null)
							.setParameters(ruleid).first();
							if (r != null) {
								process.setAD_Rule_ID(r.getAD_Rule_ID());								
							}
						} else if (rulecontainer != null) {
							process.setAD_Rule_ID(rulecontainer.getAD_Rule_ID());
						}
						if (messageid.length() > 0) {
							X_AD_MessageFormat mf = new Query(Env.getCtx(), X_AD_MessageFormat.Table_Name, "Identifier = ?", null)
							.setParameters(messageid).first();
							if (mf != null) {
								mf.setAD_Rule_ID(process.getAD_Rule_ID());
								mf.save();
							}
						}
						process.setSynchronized(proclastsync);
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
					if (scheduler.getSynchronized() == null || scheduler.getSynchronized().compareTo(proclastsync) != 0)
					{						
						scheduler.setName(procname);
						scheduler.setAD_Process_ID(process.getAD_Process_ID());
						scheduler.setFrequencyType(frequencytype);
						scheduler.setFrequency(Integer.valueOf(frequency));
						if (freqstartat != null) {
							Integer startat = Integer.valueOf(freqstartat);
							scheduler.setFrequencyStartAt(startat);
						}
						scheduler.setSupervisor_ID(100);
						scheduler.setKeepLogDays(Integer.valueOf(keeplogdays));
						scheduler.setScheduleType(REF_AD_SchedulerType.Frequency);						
						scheduler.setTag(tag);
						scheduler.setSynchronized(proclastsync);
						scheduler.save();
					}
				}				
			}
		} catch (Exception e) {
			error = e.getMessage();
		}
		return error;
	}
	public RuleXMLParser setForce(boolean force) {
		this.force = force; 
		return this;
	}

}
