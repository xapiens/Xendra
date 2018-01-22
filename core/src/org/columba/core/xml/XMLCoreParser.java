package org.columba.core.xml;

import java.io.IOException;
import java.io.InputStream;

import org.jdom.Document;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

public class XMLCoreParser {
	private static final java.util.logging.Logger LOG = java.util.logging.Logger.getLogger("org.columba.core.xml");
	// retrieve JDom Document from inputstream
	public static Document retrieveDocument(InputStream is) {
		SAXBuilder builder = new SAXBuilder();
		builder.setIgnoringElementContentWhitespace(true);
		builder.setValidation(false);
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
