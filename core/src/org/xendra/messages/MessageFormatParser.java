package org.xendra.messages;

import java.io.InputStream;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Iterator;
import org.columba.core.xml.XMLCoreParser;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_MessageFormat;
import org.compiere.util.Env;
import org.jdom.Document;
import org.jdom.Element;
import org.xendra.Constants;

public class MessageFormatParser  extends XMLCoreParser {
	private String m_id;
	public MessageFormatParser(String id) {
		m_id = id;
	}

	public void parserFormat(InputStream is) {
		try {
			Document doc = retrieveDocument(is);
			Element parent = doc.getRootElement();
			String Identifier = parent.getAttributeValue(Constants.XML_ATTRIBUTE_IDENTIFIER);
			String sync = parent.getAttributeValue(Constants.XML_ATTRIBUTE_SYNCHRONIZED);
			String name = parent.getAttributeValue(Constants.XML_ATTRIBUTE_NAME);
			String typecontainer  = parent.getName();
			Timestamp kiebasesync = null;
			if (sync != null)
				kiebasesync = Timestamp.valueOf(sync);
			X_AD_MessageFormat rulecontainer = new Query(Env.getCtx(), X_AD_MessageFormat.Table_Name, "Identifier = ?", null)
			.setParameters(Identifier).first();	
			if (rulecontainer != null)
			{
				if (rulecontainer.isLockout())
				{
					return;
				}								
			}
			if (rulecontainer == null || rulecontainer.getSynchronized() == null || rulecontainer.getSynchronized().compareTo(kiebasesync) != 0) {
				if (rulecontainer == null) {
					rulecontainer = new X_AD_MessageFormat(Env.getCtx(), 0, null);
					rulecontainer.setID(m_id);						
					rulecontainer.setIdentifier(Identifier);						
					rulecontainer.setName(name);
				}									
			}
			Iterator iterator = parent.getChildren().listIterator();
			Element extensionXmlElement;
			while (iterator.hasNext()) {
				extensionXmlElement = (Element) iterator.next();
				String type  = extensionXmlElement.getName();
				if (type == "map") {
					//HashMap props = rulecontainer.getProperties();
					HashMap props = new HashMap();
					Iterator mapiter = extensionXmlElement.getChildren().listIterator();
					while (mapiter.hasNext()) {
						Element mapelement = (Element) mapiter.next();
						String mapelemname = mapelement.getName();
						if (mapelemname == "condition") {
							String condname = mapelement.getAttributeValue("id");
							//String condvalue = mapelement.getAttributeValue("value").replaceAll("'", "''");;
							String condvalue = mapelement.getAttributeValue("value");
							props.put(String.format("CONDITION_%s", condname), condvalue);
						} else if (mapelemname == "class") {
							String classname = mapelement.getAttributeValue("name");
							String clazzname = mapelement.getAttributeValue("clazzname");
							String methodname = mapelement.getAttributeValue("methodname");
							if (methodname == null)
								methodname = "";
							props.put(String.format("CLASS_%s", classname), String.format("varname=%s, clazzname=%s, methodname=%s", classname, clazzname, methodname));
						} else if (mapelemname == "field") {
							String area = mapelement.getAttributeValue("area");
							String fieldname = mapelement.getAttributeValue("name");
							String value = mapelement.getAttributeValue("value");
							if (value != null) {
								//value = value.replaceAll("'", "''");								
							}
							String printname = mapelement.getAttributeValue("printname");
							if (printname != null) {
								//printname = printname.replaceAll("'", "''");;
							}
							String condition = mapelement.getAttributeValue("condition");
							if (condition != null) {
								//condition = condition.replaceAll("'", "''");;							
							}
							props.put(String.format("FIELD_%s",fieldname), String.format("area=%s, value=%s, printname=%s, condition=%s", area, value, printname, condition));
						}
					}			
					rulecontainer.setProperties(props);
					rulecontainer.setSynchronized(kiebasesync);
					rulecontainer.save();
				} else if (type == "message") {
					rulecontainer.setFormat(extensionXmlElement.getText());
					rulecontainer.save();
				}
			}				
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
