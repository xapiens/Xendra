package org.columba.core.xml;

import java.io.IOException;
import java.io.InputStream;

import org.compiere.util.CLogger;
import org.jdom.Document;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

public class XMLCoreParser {
	private static String error = ""; 
	private static final CLogger LOG = CLogger.getCLogger("org.columba.core.xml");	
	// retrieve JDom Document from inputstream
	public static Document retrieveDocument(InputStream is) {
		error = "";
		SAXBuilder builder = new SAXBuilder();
		builder.setIgnoringElementContentWhitespace(true);
		builder.setValidation(false);
		Document doc = null;
		try {
			doc = builder.build(is);
		} catch (JDOMException e) {
			LOG.severe(e.getMessage());
			error = e.getMessage();
			e.printStackTrace();
		} catch (IOException e) {
			LOG.severe(e.getMessage());
			error = e.getMessage();
			e.printStackTrace();
		}
		return doc;
	}
	
	public static String getError() {
		return error;
	}
}
