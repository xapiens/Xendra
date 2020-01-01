package org.xendra.ruleeditor.wizard.newsession;

import java.lang.reflect.Method;
import java.util.List;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JPanel;

import org.columba.core.gui.base.LabelWithMnemonic;
import org.columba.core.gui.base.MultiLineLabel;
import org.columba.core.gui.base.WizardTextField;
import org.compiere.model.persistence.X_AD_Rule;
import org.compiere.util.Util;
import org.compiere.util.ValueNamePair;
import org.xendra.Constants;
import org.xendra.ruleeditor.util.ResourceLoader;

import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;

public class RuleType extends AbstractStep {
	protected DataModel data;
	protected JComboBox cbRuleType;	

	public RuleType(DataModel data) {
		super(ResourceLoader.getString("dialog", "newrulewizard", "identity"),
				ResourceLoader.getString("dialog", "newrulewizard",   "identity_description"));
		this.data = data;		
		setCanGoNext(true);
	}
	
	@Override
	protected JComponent createComponent() {
		JComponent component = new JPanel();
		component.setLayout(new BoxLayout(component, BoxLayout.Y_AXIS));
		component.add(new MultiLineLabel(ResourceLoader.getString("dialog", "newrulewizard", "identity_text")));
		component.add(Box.createVerticalStrut(40));		

		WizardTextField middlePanel = new WizardTextField();

		Method method = null;

		LabelWithMnemonic typeLabel = new LabelWithMnemonic(ResourceLoader.getString("dialog", "newrulewizard", "type"));
		cbRuleType = new JComboBox();
		typeLabel.setLabelFor(cbRuleType);               
		List<ValueNamePair> nplist = Util.RefList("c30f8c29-bd66-4674-9c29-dd0e2bb96611");
		for (ValueNamePair np:nplist)
		{
			cbRuleType.addItem(np);
		}
//		cbRuleType.addItem("regla");
//		cbRuleType.addItem("regla2");
		try {
			method = cbRuleType.getClass().getMethod("getSelectedItem", null);
		} catch (NoSuchMethodException nsme) {
		}

		data.registerDataLookup(X_AD_Rule.COLUMNNAME_RuleType,new DefaultDataLookup(cbRuleType, method, null));        
		middlePanel.addTextField(cbRuleType);
		middlePanel.addEmptyExample();
		component.add(middlePanel);

		return component;
	}

	@Override
	public void prepareRendering() {
		// TODO Auto-generated method stub	
	}

}
