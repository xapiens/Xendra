package org.xendra.ruleeditor.wizard.newform;

import javax.swing.ListModel;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Form;
import org.compiere.util.Env;
import org.compiere.util.KeyNamePair;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.WizardModelEvent;
import net.javaprog.ui.wizard.WizardModelListener;

public class NewFormCreator implements WizardModelListener {
	private DataModel data;
	private Integer m_parentid;
	public NewFormCreator(DataModel data, Integer m_parentid) {
		this.data = data;
		this.m_parentid = m_parentid;		
	}
	@Override
	public void wizardFinished(WizardModelEvent e) {
		ListModel l  = (ListModel) data.getData(X_AD_Form.COLUMNNAME_AD_Form_ID);
		for (int i=0; i < l.getSize(); i++) {
			KeyNamePair kp = (KeyNamePair) l.getElementAt(i);
			X_AD_Form form = new Query(Env.getCtx(), X_AD_Form.Table_Name, "AD_Form_ID = ?", null)
				.setParameters(kp.getKey()).first();
			form.setAD_Plugin_ID(m_parentid);
			form.save();
		}		
	}
	@Override
	public void stepShown(WizardModelEvent e) {
	}
	@Override
	public void wizardCanceled(WizardModelEvent e) {
	}
	@Override
	public void wizardModelChanged(WizardModelEvent e) {
	}
}
