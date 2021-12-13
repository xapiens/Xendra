package org.xendra.pfe.wizard.imp;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

import org.compiere.apps.ADialog;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Plugin;
import org.compiere.model.persistence.X_AD_Table_Access;
import org.compiere.util.Env;
import org.jdom.Document;
import org.jdom.input.SAXBuilder;

import org.xendra.model.AbstractFolder;
import org.xendra.printdocument.PrintFormatXMLParser;

import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.WizardModelEvent;
import net.javaprog.ui.wizard.WizardModelListener;

public class ImportCreator implements WizardModelListener {
	private AbstractFolder f;
	private DataModel data;
	public ImportCreator(DataModel data, AbstractFolder f) {
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
		String file = (String) data.getData(X_AD_Table_Access.COLUMNNAME_IsCanExport);
		String pluginid = f.getNode().getAttributeValue("uid");
		X_AD_Plugin plugin = new Query(Env.getCtx(), X_AD_Plugin.Table_Name, "AD_Plugin_ID = ?", null)
			.setParameters(Integer.valueOf(pluginid)).first();
		File fileout = new File(file);
		if (fileout.exists()) {
			try {
				SAXBuilder builder = new SAXBuilder();
				builder.setIgnoringElementContentWhitespace(true);
				builder.setValidation(false);
				Document doc = null;
				BufferedInputStream is = new BufferedInputStream(new FileInputStream(fileout));
				PrintFormatXMLParser pfp = new PrintFormatXMLParser(plugin);
				String error = pfp.parseFormat(is);
				if (error.length() > 0) {
					ADialog.info(0, null, error);
				}
			}  catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void wizardModelChanged(WizardModelEvent e) {
		// TODO Auto-generated method stub
		
	}

}
