package org.xendra.efact.model;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

import org.columba.core.gui.menu.MenuXMLDecoder;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

public class Providers {
	private static final String PROVIDERS = "providers";
	private static final String PROVIDER = "provider";
	private static final Logger LOG = Logger
			.getLogger("org.xendra.efact.providers");

	public List<Provider> getProviders(InputStream is) {
		List<Provider> providers = new ArrayList<Provider>();
		Document doc = retrieveDocument(is);

		Element root = doc.getRootElement();
		if (!root.getName().equals(Providers.PROVIDERS)) {
			LOG.severe("root element <providers> expected");
			return null;
		}
		Iterator it = root.getChildren().listIterator();
		while (it.hasNext()) {
			Element e = (Element) it.next();
			if (e.getName().equals(Providers.PROVIDER)) {
				Provider p = new Provider(e);				
				providers.add(p);
			}
		}		
		return providers;				
	}
	private Document retrieveDocument(InputStream is) {
		SAXBuilder builder = new SAXBuilder();
		builder.setIgnoringElementContentWhitespace(true);
		Document doc = null;
		try {
			doc = builder.build(is);
		} catch (JDOMException e) {
			LOG.severe(e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			LOG.severe(e.getMessage());
			e.printStackTrace();
		}
		return doc;
	}	
}


