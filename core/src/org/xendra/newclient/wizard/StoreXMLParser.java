package org.xendra.newclient.wizard;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.columba.core.xml.XMLCoreParser;
import org.jdom.Document;
import org.jdom.Element;
import org.xendra.Constants;

public class StoreXMLParser extends XMLCoreParser {
	List<String> urls = new ArrayList<String>();
	public List<String> parseFormat(InputStream is) {
		try {			
			Document doc = retrieveDocument(is);
			Element parent = doc.getRootElement();
			Iterator iterator = parent.getChildren().listIterator();
			Element extensionXmlElement;
			while (iterator.hasNext()) {
				extensionXmlElement = (Element) iterator.next();
				String url = extensionXmlElement.getAttributeValue("url");
				urls.add(url);				
			}
		} catch (Exception e) {
			
		}
		return urls;
	}
}
