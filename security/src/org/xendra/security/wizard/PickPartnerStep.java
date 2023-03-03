package org.xendra.security.wizard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Method;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.columba.core.gui.base.LabelWithMnemonic;
import org.columba.core.gui.base.MultiLineLabel;
import org.columba.core.gui.base.WizardTextField;
import org.compiere.grid.ed.VLookup;
import org.compiere.model.MBPartner;
import org.compiere.model.persistence.X_C_Invoice;
import org.xendra.security.util.ResourceLoader;

import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;

public class PickPartnerStep extends AbstractStep implements ActionListener {
	protected DataModel data;
	private VLookup BPartner = VLookup.create(X_C_Invoice.Table_Name, X_C_Invoice.COLUMNNAME_C_BPartner_ID, 0);
	public PickPartnerStep(DataModel data) {
		super(ResourceLoader.getString("dialog", "partnerwizard", "create"),
				ResourceLoader.getString("dialog", "partnerwizard", "create_description"));
		this.data = data;
		setCanGoNext(false);
	}

	public PickPartnerStep(MBPartner p, DataModel data) {
		super(ResourceLoader.getString("dialog", "partnerwizard", "create"),
				ResourceLoader.getString("dialog", "partnerwizard", "create_description"));
		this.data = data;
		BPartner.setValue(p.getC_BPartner_ID());
		setCanGoNext(false);
	}

	protected JComponent createComponent() {
		JComponent component = new JPanel();
		component.setLayout(new BoxLayout(component, BoxLayout.Y_AXIS));
		component.add(new MultiLineLabel(ResourceLoader.getString("dialog", "partnerwizard", "create_text")));
		component.add(Box.createVerticalStrut(40));
		
		Method method = null;
		LabelWithMnemonic partnerLabel = new LabelWithMnemonic(ResourceLoader.getString("dialog", "partnerwizard", "partner"));		
		BPartner.addActionListener(this);
		partnerLabel.setLabelFor(BPartner);

		try {			
			method = BPartner.getClass().getMethod("getValue", null);			
		} 
		catch (NoSuchMethodException nsme) {}		
		data.registerDataLookup(X_C_Invoice.COLUMNNAME_C_BPartner_ID,new DefaultDataLookup(BPartner, method, null));
		
		WizardTextField middlePanel = new WizardTextField();
		middlePanel.addLabel(partnerLabel);
		middlePanel.addTextField(BPartner);
		middlePanel.addExample(new JLabel(ResourceLoader.getString("dialog", "partnerwizard", "pickpartner")));
		component.add(middlePanel);		

		return component;
	}

	@Override
	public void prepareRendering() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {		
		if (BPartner.getValue() != null) {
			setCanGoNext(true);
		}
	}


}
