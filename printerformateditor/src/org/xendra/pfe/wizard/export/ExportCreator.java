package org.xendra.pfe.wizard.export;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Iterator;
import java.util.logging.Level;

import org.compiere.model.MPrinterDocumentFormat;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Table_Access;
import org.compiere.util.CLogger;
import org.compiere.util.Env;
import org.jdom.Element;
import org.xendra.Constants;
import org.xendra.model.AbstractFolder;

import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.WizardModelEvent;
import net.javaprog.ui.wizard.WizardModelListener;

public class ExportCreator implements WizardModelListener {
	private String filedir;
	private DataModel data;
	private AbstractFolder f;
	private static CLogger 		log = CLogger.getCLogger(ExportCreator.class);
	public ExportCreator(DataModel data, AbstractFolder f) {
		this.data = data;
		this.f = f;
	}

	@Override
	public void stepShown(WizardModelEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void wizardCanceled(WizardModelEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void wizardFinished(WizardModelEvent evt) {
		Element e = f.getNode();
		String uid = e.getAttributeValue("uid");
		MPrinterDocumentFormat df = new Query(Env.getCtx(), MPrinterDocumentFormat.Table_Name, "C_PrinterDocumentFormat_ID = ?", null)
			.setParameters(Integer.valueOf(uid)).first();
		StringBuilder parent = new StringBuilder();
		parent.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
		parent.append(String.format("<printdocumentformat %s=\"%s\" ",Constants.XML_ATTRIBUTE_NAME,df.getName()));
		parent.append(String.format("%s=\"%s\" ",Constants.XML_ATTRIBUTE_CATEGORY, df.getC_PrinterFormatType()));
		parent.append(String.format("%s=\"%s\" ",MPrinterDocumentFormat.COLUMNNAME_Identifier, df.getIdentifier()));
		parent.append(String.format("%s=\"%s\" ",MPrinterDocumentFormat.COLUMNNAME_Synchronized, new Timestamp(System.currentTimeMillis())));
		parent.append(String.format(">\n"));
		parent.append(String.format("<properties "));
		HashMap properties = df.getProperties();
		Iterator keys = properties.keySet().iterator();
		while (keys.hasNext())
		{
			String key = (String)keys.next();
			String content = (String) properties.get(key);
			parent.append(String.format("%s=\"%s\" \n",key, content));
		}																	
		parent.append(String.format("/>\n"));
		parent.append(String.format("<format>\n"));
		parent.append(String.format("<![CDATA[\n"));
		parent.append(df.getFormat());
		parent.append(String.format("]]>"));
		parent.append(String.format("</format>"));
		parent.append(String.format("<source>\n"));
		parent.append(String.format("<![CDATA[\n"));
		parent.append(df.getSource());
		parent.append(String.format("]]>"));
		parent.append(String.format("</source>"));		
		parent.append(String.format("</printdocumentformat>"));
		
		filedir = (String) data.getData(X_AD_Table_Access.COLUMNNAME_IsCanExport);
		String filename = String.format("%s.xml", f.getName());
		String newfile = String.format("%s%s%s", filedir, File.separator ,filename);
		File fileout = new File(newfile);
		if (fileout.exists()) {
			fileout.delete();
		}
		try {
			Writer fw = new OutputStreamWriter(new FileOutputStream(fileout, false), "UTF-8");
			fw.write(parent.toString());
			fw.flush ();
			fw.close ();
			float size = fileout.length();
			size /= 1024;
			log.log(Level.WARNING, String.format("%s - %s kB", fileout.getAbsolutePath(), size));
		} catch (Exception ex) {
			ex.printStackTrace();
		}				
	}

	@Override
	public void wizardModelChanged(WizardModelEvent e) {
		// TODO Auto-generated method stub

	}

}
