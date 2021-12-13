package org.xendra.printdocument;

import java.io.InputStream;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Iterator;
import org.columba.core.xml.XMLCoreParser;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Plugin;
import org.compiere.model.persistence.X_C_PrinterDocumentFormat;
import org.compiere.util.CLogger;
import org.compiere.util.Env;
import org.jdom.Attribute;
import org.jdom.Document;
import org.jdom.Element;
import org.xendra.Constants;

public class PrintFormatXMLParser extends XMLCoreParser {
	private static final CLogger LOG = CLogger.getCLogger("org.xendra.printdocument");
	X_AD_Plugin plugin;
	private boolean force = false;
	public PrintFormatXMLParser(X_AD_Plugin plugin) {
		this.plugin = plugin;
	}

	public String parseFormat(InputStream is) {
		String error = "";
		try {
			Document doc = retrieveDocument(is);
			if (doc == null) {			
				throw new Exception(getError());
			}
			Element parent = doc.getRootElement();
			String Identifier = parent.getAttributeValue(Constants.XML_ATTRIBUTE_IDENTIFIER);
			String FormatType  = parent.getAttributeValue(Constants.XML_ATTRIBUTE_CATEGORY);
			String name = parent.getAttributeValue(Constants.XML_ATTRIBUTE_NAME);
			String sync = parent.getAttributeValue(Constants.XML_ATTRIBUTE_SYNCHRONIZED);
			Timestamp formatsync = null;
			if (sync != null)
				formatsync = Timestamp.valueOf(sync);
			if (sync == null)
				formatsync = new Timestamp(System.currentTimeMillis());
			X_C_PrinterDocumentFormat spdf = new Query(Env.getCtx(), X_C_PrinterDocumentFormat.Table_Name, "Identifier = ?", null)
			.setParameters(Identifier).first();

			if (spdf == null || spdf.getSynchronized() == null || spdf.getSynchronized().compareTo(formatsync) != 0 )
			{
				if (spdf == null)
				{
					spdf = new X_C_PrinterDocumentFormat(Env.getCtx(), 0, null);
					spdf.setC_PrinterFormatType(FormatType);
					//spdf.setName(name);
					spdf.setIdentifier(Identifier);				
					spdf.setAD_Plugin_ID(plugin.getAD_Plugin_ID());
				}							
				if (spdf.isLockout() && !force)
				{
					throw new Exception(String.format("formato %s esta bloqueado", spdf.getName()));
				}
				spdf.setName(name);
				Iterator iterator = parent.getChildren().listIterator();
				Element extensionXmlElement;
				while (iterator.hasNext()) {
					extensionXmlElement = (Element) iterator.next();
					if (extensionXmlElement.getName().equals("format"))
					{
						spdf.setFormat(extensionXmlElement.getText());
					}
					else if(extensionXmlElement.getName().equals("source")) {
						spdf.setSource(extensionXmlElement.getText());
					}
					else if(extensionXmlElement.getName().equals("properties"))
					{
						HashMap map = new HashMap();
						Iterator properties = extensionXmlElement.getAttributes().listIterator();
						while (properties.hasNext())
						{
							Attribute property = (Attribute) properties.next();						
							map.put(property.getName(), property.getValue());
						}
						if (map.size() > 0)
						{
							spdf.setProperties(map);
						}
					}
				}
				spdf.setSynchronized(formatsync);
				spdf.setLockout(true);
				spdf.save();
			}
		} catch (Exception e) {
			error = e.getMessage();
		}
		return error;
	}

	public PrintFormatXMLParser setForce(boolean force) {
		this.force = force; 
		return this;
	}

}
