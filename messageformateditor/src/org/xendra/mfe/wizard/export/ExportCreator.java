package org.xendra.mfe.wizard.export;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.logging.Level;

import org.compiere.model.persistence.X_AD_Table_Access;
import org.compiere.util.CLogger;
import org.jdom.Document;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;
import org.xendra.model.AbstractFolder;

import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.WizardModelEvent;
import net.javaprog.ui.wizard.WizardModelListener;

public class ExportCreator implements WizardModelListener {
	private static CLogger 		log = CLogger.getCLogger(ExportCreator.class);
	private DataModel data;
	//private AbstractFolder node;
	private AbstractFolder parent;
	public ExportCreator(DataModel data, AbstractFolder parent) {
		this.parent = parent;
		this.data = data;
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
	public void wizardFinished(WizardModelEvent e) {
		AbstractFolder message = null;
		String filedir = (String) data.getData(X_AD_Table_Access.COLUMNNAME_IsCanExport);
		if (parent.getNode().getName().equals("message")) {
			message = parent;
		} else {
			message = (AbstractFolder) parent.getParent();		
			while (!message.getNode().getName().equals("message")) {
				message = ((AbstractFolder) message.getParent());
				if (message.getNode().getName().equals("message")) {
					break;
				}
			}			
		}
		if (message.getNode().getName().equals("message")) {
			Document doc = new Document();
			doc = message.export(doc, null);
			XMLOutputter xmOut = new XMLOutputter(Format.getPrettyFormat()); 
			try {
				String newfile = String.format("%s%s%s.xml", filedir, File.separator ,message.getName());
				File fileout = new File(newfile);
				if (fileout.exists()) {
					fileout.delete();
				}				
				Writer fw = new OutputStreamWriter(new FileOutputStream(fileout, false), "UTF-8");
				fw.write(xmOut.outputString(doc));
				fw.flush ();
				fw.close ();
				float size = fileout.length();
				size /= 1024;
				log.log(Level.WARNING, String.format("%s - %s kB", fileout.getAbsolutePath(), size));
			} catch (Exception ex) {
				ex.printStackTrace();
			}							
		}
	}

	@Override
	public void wizardModelChanged(WizardModelEvent e) {
		// TODO Auto-generated method stub		
	}
}
