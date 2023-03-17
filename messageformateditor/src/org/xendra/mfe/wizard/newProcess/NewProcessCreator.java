package org.xendra.mfe.wizard.newProcess;

import java.math.BigDecimal;

import org.columba.api.plugin.IExtension;
import org.columba.api.plugin.IExtensionHandler;
import org.columba.api.plugin.PluginHandlerNotFoundException;
import org.columba.core.gui.dialog.ErrorDialog;
import org.columba.core.plugin.PluginManager;
import org.compiere.model.persistence.X_AD_MessageFormat;
import org.compiere.model.persistence.X_AD_Process;
import org.compiere.model.persistence.X_AD_Scheduler;
import org.compiere.util.Util;
import org.jdom.Element;
import org.xendra.mfe.plugin.IExtensionHandlerKeys;
import org.xendra.model.AbstractFolder;

import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.WizardModelEvent;
import net.javaprog.ui.wizard.WizardModelListener;

public class NewProcessCreator implements WizardModelListener {
	private DataModel data;
	private AbstractFolder parent;
	public NewProcessCreator(DataModel data, AbstractFolder node) {
		this.data = data;
		parent = node;		
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
		String value = (String) data.getData(X_AD_Process.COLUMNNAME_Value);
		String accesslevel = (String) data.getData(X_AD_Process.COLUMNNAME_AccessLevel);
		String frequencytype = (String) data.getData(X_AD_Scheduler.COLUMNNAME_FrequencyType);
		BigDecimal frequency = (BigDecimal) data.getData(X_AD_Scheduler.COLUMNNAME_Frequency);
		BigDecimal keeplogdays = (BigDecimal) data.getData(X_AD_Scheduler.COLUMNNAME_KeepLogDays);
		String name = (String) data.getData(X_AD_Process.COLUMNNAME_Name);
		String queuename = (String) data.getData(X_AD_MessageFormat.COLUMNNAME_QueueName);

		Element process = new Element("process");
		process.setAttribute(X_AD_Process.COLUMNNAME_Value, value);
		process.setAttribute(X_AD_Process.COLUMNNAME_AccessLevel,accesslevel);
		process.setAttribute(X_AD_Scheduler.COLUMNNAME_FrequencyType,frequencytype);
		process.setAttribute(X_AD_Scheduler.COLUMNNAME_Frequency,frequency.toString());
		process.setAttribute(X_AD_Scheduler.COLUMNNAME_KeepLogDays,keeplogdays.toString());
		process.setAttribute(X_AD_Process.COLUMNNAME_Name,name);
		process.setAttribute(X_AD_MessageFormat.COLUMNNAME_QueueName,queuename);
		process.setAttribute(X_AD_Process.COLUMNNAME_Identifier, Util.getUUID());
		Object[] args = { process };
		IExtensionHandler handler = null;
		try {
			handler = PluginManager.getInstance().getExtensionHandler(IExtensionHandlerKeys.ORG_XENDRA_MFE_FOLDER);
		} catch (PluginHandlerNotFoundException ex) {
			ErrorDialog.createDialog(ex.getMessage(),  ex);
		}
		AbstractFolder folder = null;			
		try {
			IExtension extension = handler.getExtension(process.getName());
			folder = (AbstractFolder) extension.instanciateExtension(args);
			parent.add(folder);
			parent.getNode().addContent(process);			
		} catch (Exception ex) {
			ex.printStackTrace();
		}												
	}

	@Override
	public void wizardModelChanged(WizardModelEvent e) {
		// TODO Auto-generated method stub
	}
}
