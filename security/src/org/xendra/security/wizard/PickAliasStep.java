package org.xendra.security.wizard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Method;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;

import org.columba.core.gui.base.LabelWithMnemonic;
import org.columba.core.gui.base.MultiLineLabel;
import org.columba.core.gui.base.WizardTextField;
import org.compiere.model.MBPartner;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_C_BPartner_Certificate;
import org.compiere.swing.CCheckBox;
import org.compiere.swing.CTextField;
import org.compiere.util.Env;
import org.xendra.security.util.ResourceLoader;
import org.xendra.security.api.SecurityConstants;

import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;

public class PickAliasStep extends AbstractStep implements ActionListener {
	protected DataModel data;
	protected CTextField name = new CTextField(20);
	private JButton test = new JButton("test");
	private CCheckBox passok = new CCheckBox();
	public PickAliasStep(DataModel data) {
		super(ResourceLoader.getString("dialog", "partnerwizard", "alias"),
				ResourceLoader.getString("dialog", "partnerwizard", "alias_description"));
		this.data = data;
		setCanGoNext(false);
	}	
	public PickAliasStep(MBPartner p, DataModel data) {
		super(ResourceLoader.getString("dialog", "partnerwizard", "file"),
				ResourceLoader.getString("dialog", "partnerwizard", "file_description"));
		X_C_BPartner_Certificate pc = new Query(Env.getCtx(), X_C_BPartner_Certificate.Table_Name, "C_BPartner_ID = ?", null)
					.setParameters(p.getC_BPartner_ID()).first();
		//
		String alias = (String) pc.getProperties().get(SecurityConstants.ALIASKEY);
		if (alias == null)
			alias = "";
		name.setText(alias);
		this.data = data;
		setCanGoNext(false);
	}

	protected JComponent createComponent() {
		JComponent component = new JPanel();
		component.setLayout(new BoxLayout(component, BoxLayout.Y_AXIS));
		component.add(new MultiLineLabel(ResourceLoader.getString("dialog", "partnerwizard", "identity_text")));
		component.add(Box.createVerticalStrut(40));

		WizardTextField POSListPanel = new WizardTextField();
		LabelWithMnemonic typeLabel = new LabelWithMnemonic(ResourceLoader.getString("dialog", "partnerwizard", "alias"));
		typeLabel.setLabelFor(name);
		name.setText("alias");
		test.addActionListener(this);
		Method method = null;
		try {
			method = name.getClass().getMethod("getText", null);
			
		} catch (NoSuchMethodException nsme) {
		}
		data.registerDataLookup(SecurityConstants.ALIASKEY,new DefaultDataLookup(name, method, null));        
		POSListPanel.addTextField(name);
		POSListPanel.addEmptyExample();
		component.add(POSListPanel);
		component.add(test);
		component.add(passok);
		return component;
	}
	public void prepareRendering() {
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(test)) {
			test();
		}		
	}
	private void setoff() {
		passok.setSelected(false);
	}	
	private void test() {
		setoff();
		if (name.getText().length() > 0) {			
			passok.setSelected(true);
		}
		if (passok.isSelected()) {
			setCanGoNext(true);
		} else {
			setCanGoNext(false);
		}		
	}	
}
