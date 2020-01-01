package org.xendra.ruleeditor.wizard.newrgroup;

import java.lang.reflect.Method;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.columba.core.gui.base.MultiLineLabel;
import org.columba.core.gui.base.WizardTextField;
import org.compiere.model.persistence.X_C_GroupDoc;
import org.xendra.Constants;
import org.xendra.ruleeditor.util.ResourceLoader;

import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;
import net.javaprog.ui.wizard.AbstractStep;

public class newGroup extends AbstractStep {

	public newGroup(DataModel data) {
		super(ResourceLoader.getString("dialog", "newgroupwizard","identity"),
				ResourceLoader.getString("dialog", "newgroupwizard","identity_description"));
		this.data = data;
		setCanGoNext(true);
	}
	
	protected DataModel data;
	protected JTextField groupName;
	@Override
	public void prepareRendering() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected JComponent createComponent() {
		JComponent component = new JPanel();
		component.setLayout(new BoxLayout(component, BoxLayout.Y_AXIS));
		component.add(new MultiLineLabel(ResourceLoader.getString("dialog", "newgroupwizard","identify_text")));
		component.add(Box.createVerticalStrut(40));
		
		WizardTextField middlePanel = new WizardTextField();
		Method method = null;
		groupName = new JTextField();
		try {
			method = groupName.getClass().getMethod("getText", null);
		} catch (NoSuchMethodException nsme) {}
		data.registerDataLookup(X_C_GroupDoc.COLUMNNAME_C_GroupDoc_ID, new DefaultDataLookup(groupName, method, null));
		middlePanel.addTextField(groupName);
		middlePanel.addEmptyExample();
		component.add(middlePanel);
		
		return component;		
	}


}
