package org.xendra.efact.wizard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Method;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.columba.core.gui.base.LabelWithMnemonic;
import org.columba.core.gui.base.MultiLineLabel;
import org.columba.core.gui.base.WizardTextField;
import org.compiere.grid.ed.VLookup;
import org.compiere.model.MBPartner;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_C_BP_DocType;
import org.compiere.model.persistence.X_C_BPartner;
import org.compiere.model.persistence.X_C_BPartner_Certificate;
import org.compiere.model.persistence.X_C_Invoice;
import org.compiere.util.Env;
import org.xendra.efact.util.ResourceLoader;

import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;

public class BPartnerStep extends AbstractStep implements ActionListener {
	private VLookup BPartner = VLookup.create(X_C_Invoice.Table_Name, X_C_Invoice.COLUMNNAME_C_BPartner_ID, 0);
	protected DataModel data;
	public BPartnerStep(DataModel data) {
		super(ResourceLoader.getString("dialog", "efactwizard", "create"),
				ResourceLoader.getString("dialog", "efactwizard", "create_description"));
		this.data = data;
		setCanGoNext(false);		
	}
	@Override
	public void prepareRendering() {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (BPartner.getValue() != null) {
			setCanGoNext(true);
		}		
	}

	@Override
	protected JComponent createComponent() {
		JComponent component = new JPanel();
		component.setLayout(new BoxLayout(component, BoxLayout.Y_AXIS));
		component.add(new MultiLineLabel(ResourceLoader.getString("dialog", "efactwizard", "create_text")));
		component.add(Box.createVerticalStrut(40));

		Method method = null;
		LabelWithMnemonic partnerLabel = new LabelWithMnemonic(ResourceLoader.getString("dialog", "efactwizard", "partner"));		
		BPartner.addActionListener(this);

		X_C_BPartner_Certificate pc = new Query(Env.getCtx(), X_C_BPartner_Certificate.Table_Name, "", null)
				.first();
		if (pc != null) {
			BPartner.setValue(pc.getC_BPartner_ID());
		}
		partnerLabel.setLabelFor(BPartner);

		try {			
			method = BPartner.getClass().getMethod("getValue", null);			
		} 
		catch (NoSuchMethodException nsme) {}		
		data.registerDataLookup(X_C_Invoice.COLUMNNAME_C_BPartner_ID,new DefaultDataLookup(BPartner, method, null));

		WizardTextField middlePanel = new WizardTextField();
		middlePanel.addLabel(partnerLabel);
		middlePanel.addTextField(BPartner);
		middlePanel.addExample(new JLabel(ResourceLoader.getString("dialog", "efactwizard", "pickpartner")));
		component.add(middlePanel);		

		return component;
	}
}
