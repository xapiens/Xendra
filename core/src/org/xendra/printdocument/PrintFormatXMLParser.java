package org.xendra.printdocument;

import java.io.InputStream;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.columba.core.xml.XMLCoreParser;
import org.compiere.model.MTable;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_C_PrinterDocumentFormat;
import org.compiere.util.Env;
import org.compiere.util.Ini;
import org.jdom.Attribute;
import org.jdom.Document;
import org.jdom.Element;
import org.xendra.Constants;

public class PrintFormatXMLParser extends XMLCoreParser {
	private static final java.util.logging.Logger LOG = java.util.logging.Logger.getLogger("org.xendra.printdocument");
	
	public void parseFormat(InputStream is) {		
		Document doc = retrieveDocument(is);
		Element parent = doc.getRootElement();
		String Identifier = parent.getAttributeValue(Constants.XML_ATTRIBUTE_IDENTIFIER);
		String FormatType  = parent.getAttributeValue(Constants.XML_ATTRIBUTE_CATEGORY);
		String name = parent.getAttributeValue(Constants.XML_ATTRIBUTE_NAME);
		String sync = parent.getAttributeValue(Constants.XML_ATTRIBUTE_SYNCHRONIZED);
		Timestamp formatsync = null;
		if (sync != null)
			formatsync = Timestamp.valueOf(sync);		
		X_C_PrinterDocumentFormat spdf = new Query(Env.getCtx(), X_C_PrinterDocumentFormat.Table_Name, "Identifier = ?", null)
		.setParameters(Identifier).first();

		if (spdf == null || spdf.getSynchronized() == null || spdf.getSynchronized().compareTo(formatsync) != 0 )
		{
			if (spdf == null)
			{
				spdf = new X_C_PrinterDocumentFormat(Env.getCtx(), 0, null);
				spdf.setC_PrinterFormatType(FormatType);
				spdf.setIdentifier(Identifier);				
			}							
			if (spdf.isLockout())
			{
				return;
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
	}

}
