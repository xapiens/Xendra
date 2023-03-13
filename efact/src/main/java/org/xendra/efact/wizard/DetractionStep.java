package org.xendra.efact.wizard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Method;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JPanel;

import org.columba.core.gui.base.LabelWithMnemonic;
import org.columba.core.gui.base.MultiLineLabel;
import org.columba.core.gui.base.WizardTextField;
import org.compiere.grid.ed.VLookup;
import org.compiere.model.persistence.X_C_Payment;
import org.xendra.efact.util.ResourceLoader;

import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;

public class DetractionStep extends AbstractStep implements ActionListener {
	protected DataModel data;
	VLookup BankAccount = VLookup.create(X_C_Payment.Table_Name, X_C_Payment.COLUMNNAME_C_BankAccount_ID, 0);
	public DetractionStep(DataModel data) {
		super(ResourceLoader.getString("dialog", "efactwizard", "retention"),
				ResourceLoader.getString("dialog", "efactwizard", "retention_description"));
		this.data = data;
		setCanGoNext(false);
	}

	@Override
	public void prepareRendering() {
		if (BankAccount.getValue() != null) {
			setCanGoNext(true);
		}
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (BankAccount.getValue() != null) {
			setCanGoNext(true);
		}				
	}

	@Override
	protected JComponent createComponent() {
		JComponent component = new JPanel();
		component.setLayout(new BoxLayout(component, BoxLayout.Y_AXIS));
		component.add(new MultiLineLabel(ResourceLoader.getString("dialog", "efactwizard", "retention_text")));
		component.add(Box.createVerticalStrut(40));		
		LabelWithMnemonic typeLabel = new LabelWithMnemonic(ResourceLoader.getString("dialog", "efactwizard", "account"));
		BankAccount.addActionListener(this);
		typeLabel.setLabelFor(BankAccount);		
		WizardTextField middlePanel = new WizardTextField();
		Method method = null;				
		try {
			method = BankAccount.getClass().getMethod("getValue", null);
		} catch (NoSuchMethodException nsme) {}
		data.registerDataLookup(X_C_Payment.COLUMNNAME_C_BankAccount_ID, new DefaultDataLookup(BankAccount, method, null));
		middlePanel.addTextField(BankAccount);
		middlePanel.addEmptyExample();
		component.add(middlePanel);
		return component;
	}
}
