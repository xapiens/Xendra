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
import org.compiere.model.Machine;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_C_POS;
import org.compiere.model.persistence.X_C_Payment;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.xendra.pos.util.ResourceLoader;
import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;

public class PaymentStep extends AbstractStep implements ActionListener {
	protected DataModel data;
	private VLookup doctype;
	public PaymentStep(DataModel data) {
		super(ResourceLoader.getString("dialog", "machinewizard", "payment"),
				ResourceLoader.getString("dialog", "machinewizard", "payment_description"));
		this.data = data;
		setCanGoNext(false);		
	}
	protected JComponent createComponent() {
		JComponent component = new JPanel();
		component.setLayout(new BoxLayout(component, BoxLayout.Y_AXIS));
		component.add(new MultiLineLabel(ResourceLoader.getString("dialog", "machinewizard", "payment_text")));
		component.add(Box.createVerticalStrut(40));
		
		Method methoddoctype = null;
		
		LabelWithMnemonic doctypeLabel = new LabelWithMnemonic(Msg.translate(Env.getCtx(), X_C_Payment.COLUMNNAME_C_DocType_ID));
		doctype = VLookup.create(X_C_Payment.Table_Name, X_C_Payment.COLUMNNAME_C_DocType_ID, 0);
		doctype.addActionListener(this);
		doctypeLabel.setLabelFor(doctype);
		//
		Machine machine = Env.getMachine();
		Integer C_POS_ID = machine.getIntProperty(X_C_POS.COLUMNNAME_C_POS_ID);
		if (C_POS_ID > 0) {
			X_C_POS pos = new Query(Env.getCtx(), X_C_POS.Table_Name, "C_POS_ID = ?", null)
				.setParameters(C_POS_ID).first();
			if (pos != null) {
				if (pos.getPayment_C_DocType_ID() > 0) {					
					doctype.setValue(pos.getPayment_C_DocType_ID());
				}				
			}
		}		
		try {			
			methoddoctype = doctype.getClass().getMethod("getValue", null);
		} 
		catch (NoSuchMethodException nsme) {}		

		WizardTextField credit = new WizardTextField();		
		data.registerDataLookup(X_C_POS.COLUMNNAME_Payment_C_DocType_ID,new DefaultDataLookup(doctype, methoddoctype, null));
		credit.addLabel(doctypeLabel);
		credit.addTextField(doctype);
		credit.addEmptyExample();
		component.add(credit);				
		return component;
	}
	public void prepareRendering() {
	}

	@Override
	public void actionPerformed(ActionEvent e) {		
		if (doctype.getValue() != null) {
			setCanGoNext(true);
		}
	}	
}
