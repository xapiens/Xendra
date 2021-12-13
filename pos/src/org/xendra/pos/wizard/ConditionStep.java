
package org.xendra.pos.wizard;

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
import org.compiere.model.MPOS;
import org.compiere.model.Machine;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_C_Order;
import org.compiere.model.persistence.X_C_POS;
import org.compiere.util.Env;
import org.xendra.pos.util.ResourceLoader;

import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;

public class ConditionStep extends AbstractStep implements ActionListener  {
	protected DataModel data;	
	
	private VLookup deliveryRule;
	private VLookup cashTerm;
	private VLookup paymentTerm;
	
	public ConditionStep(DataModel data) {
		super(ResourceLoader.getString("dialog", "machinewizard", "conditions"),
				ResourceLoader.getString("dialog", "machinewizard",   "conditions_description"));
		this.data = data;
		setCanGoNext(false);
	}

	protected JComponent createComponent() {
		JComponent component = new JPanel();
		component.setLayout(new BoxLayout(component, BoxLayout.Y_AXIS));
		component.add(new MultiLineLabel(ResourceLoader.getString("dialog", "machinewizard","conditions_text")));
		component.add(Box.createVerticalStrut(40));

		deliveryRule = VLookup.create(X_C_POS.Table_Name, X_C_POS.COLUMNNAME_DeliveryRule, 0);
		cashTerm = VLookup.create(X_C_POS.Table_Name, X_C_POS.COLUMNNAME_Cash_C_PaymentTerm_ID, 0);
		paymentTerm = VLookup.create(X_C_POS.Table_Name, X_C_POS.COLUMNNAME_Credit_C_PaymentTerm_ID, 0);
	
		Machine machine = Env.getMachine();
		Integer C_POS_ID = machine.getIntProperty(X_C_POS.COLUMNNAME_C_POS_ID);
		if (C_POS_ID > 0) {
			MPOS posmodel = new Query(Env.getCtx(), X_C_POS.Table_Name, "C_POS_ID = ?", null).setParameters(C_POS_ID).first();
			if (posmodel != null)
			{
				deliveryRule.setValue(posmodel.getDeliveryRule());
				cashTerm.setValue(posmodel.getCash_C_PaymentTerm_ID());
				paymentTerm.setValue(posmodel.getCredit_C_PaymentTerm_ID());
			}			
		}
		
		WizardTextField middlePanel = new WizardTextField();		
		Method method = null;		
		
		try {
			method = deliveryRule.getClass().getMethod("getValue", null);
		} 
		catch (NoSuchMethodException nsme) {}
		LabelWithMnemonic conditionLabel = new LabelWithMnemonic(ResourceLoader.getString("dialog", "machinewizard", "conditions"));
		deliveryRule.addActionListener(this);
		conditionLabel.setLabelFor(deliveryRule);				
		data.registerDataLookup(X_C_Order.COLUMNNAME_DeliveryRule,new DefaultDataLookup(deliveryRule, method, null));
		middlePanel.addLabel(conditionLabel);
		middlePanel.addTextField(deliveryRule);
		middlePanel.addEmptyExample();
		component.add(middlePanel);
		//
		WizardTextField cash = new WizardTextField();
		Method methodcash = null;
		try {
			methodcash = cashTerm.getClass().getMethod("getValue", null);
		}
		catch (NoSuchMethodException nsme) {}
		LabelWithMnemonic cashLabel = new LabelWithMnemonic(ResourceLoader.getString("dialog","machinewizard", "condition_cash"));
		cashTerm.addActionListener(this);
		cashLabel.setLabelFor(cashTerm);
		data.registerDataLookup(X_C_POS.COLUMNNAME_Cash_C_PaymentTerm_ID, new DefaultDataLookup(cashTerm, methodcash, null));
		cash.addLabel(cashLabel);
		cash.addTextField(cashTerm);
		cash.addEmptyExample();
		component.add(cash);
		//
		WizardTextField credit = new WizardTextField();
		Method methodcredit = null;
		try {
			methodcredit  = paymentTerm.getClass().getMethod("getValue", null);
		}
		catch (NoSuchMethodException nsme) {}
		
		LabelWithMnemonic creditLabel = new LabelWithMnemonic(ResourceLoader.getString("dialog", "machinewizard", "condition_credit"));
		paymentTerm.addActionListener(this);
		creditLabel.setLabelFor(paymentTerm);				
		data.registerDataLookup(X_C_POS.COLUMNNAME_Credit_C_PaymentTerm_ID,new DefaultDataLookup(paymentTerm, methodcredit, null));
		credit.addLabel(creditLabel);
		credit.addTextField(paymentTerm);
		credit.addEmptyExample();
		component.add(credit);
		//
		return component;
	}
	
	public void prepareRendering() {
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (deliveryRule.getValue() != null) {
			setCanGoNext(true);
		}
		if (cashTerm.getValue() != null) {
			setCanGoNext(true);
		}
		if (paymentTerm.getValue() != null) {
			setCanGoNext(true);
		}		
	}	
}
