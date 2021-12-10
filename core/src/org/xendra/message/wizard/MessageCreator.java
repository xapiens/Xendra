package org.xendra.message.wizard;

import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.WizardModelEvent;
import net.javaprog.ui.wizard.WizardModelListener;

public class MessageCreator implements WizardModelListener {

	private DataModel data;
	private boolean m_ok = true;

	public MessageCreator(DataModel data) {
		this.data = data;
	}
	@Override
	public void wizardFinished(WizardModelEvent e) {
		
	}	
	@Override
	public void stepShown(WizardModelEvent arg0) {
	}
	@Override
	public void wizardCanceled(WizardModelEvent arg0) {
		m_ok  = false;
	}
	@Override
	public void wizardModelChanged(WizardModelEvent arg0) {
	}
	public DataModel getData()
	{
		return this.data;
	}
	public boolean isOk() {
		return m_ok;
	}
}
