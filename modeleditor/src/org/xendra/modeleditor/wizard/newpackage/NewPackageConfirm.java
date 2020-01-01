package org.xendra.modeleditor.wizard.newpackage;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.columba.core.gui.base.MultiLineLabel;
import org.columba.core.gui.base.WizardTextField;
import org.compiere.model.persistence.X_AD_Plugin;
import org.compiere.swing.CTextField;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.xendra.modeleditor.util.ResourceLoader;
import org.xendra.modeleditor.wizard.common.components;

import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.miginfocom.swing.MigLayout;

public class NewPackageConfirm extends AbstractStep {
	protected DataModel data;
	protected JLabel name = new JLabel();
	public NewPackageConfirm(DataModel data) {		
		super(ResourceLoader.getString("dialog", "newpackageconfirmwizard", "identity"),
				ResourceLoader.getString("dialog", "newpackageconfirmwizard",   "identity_description"));
		this.data = data;		
		setCanGoNext(true);
	}	
	@Override
	public void prepareRendering() {
		CTextField textname = (CTextField) components.getInstance().getControls().get(X_AD_Plugin.COLUMNNAME_Name);
		name.setText(textname.getText());
	}
	@Override
	protected JComponent createComponent() {
		JComponent component = new JPanel();
		component.setLayout(new BoxLayout(component, BoxLayout.Y_AXIS));
		component.add(new MultiLineLabel(ResourceLoader.getString("dialog", "newtablewizard", "identity_text")));
		component.add(Box.createVerticalStrut(40));
		WizardTextField textfield = new WizardTextField();		
		textfield.addLabel(new JLabel(Msg.translate(Env.getCtx(), X_AD_Plugin.COLUMNNAME_Description)));
		JPanel pan = new JPanel();
		pan.setLayout(new MigLayout());
		pan.add(new JLabel(Msg.translate(Env.getCtx(), X_AD_Plugin.COLUMNNAME_Name)));
		pan.add(name, "wrap");
		textfield.addTextField(pan);			
		textfield.addExample(new JLabel("explication"));	
		component.add(textfield);
		return component;				
	}
	
}
