package org.xendra.modeleditor.wizard.newtab;

import java.util.HashMap;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.columba.core.gui.base.MultiLineLabel;
import org.compiere.model.persistence.X_AD_Tab;
import org.xendra.modeleditor.util.ResourceLoader;
import org.xendra.modeleditor.wizard.common.components;

import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;

public class NewTab extends AbstractStep {
	protected DataModel data;
	protected JTextField tabName;
	private HashMap values = new HashMap();		
	public NewTab(DataModel data) {
		super(ResourceLoader.getString("dialog", "newtabwizard", "identity"),
				ResourceLoader.getString("dialog", "newtawizard",   "identity_description"));
		this.data = data;				
		setCanGoNext(true);
	}
	
	public HashMap getControls() {
		return values;
	}
	
	@Override
	protected JComponent createComponent() {
		JComponent component = new JPanel();
		component.setLayout(new BoxLayout(component, BoxLayout.Y_AXIS));
		component.add(new MultiLineLabel(ResourceLoader.getString("dialog", "newtabwizard", "identity_text")));
		component.add(Box.createVerticalStrut(40));		
		components.getInstance().setControls(getControls());
		components.getInstance().setData(data);		
		values.put(X_AD_Tab.COLUMNNAME_Name, components.getInstance().createName(component, data));		
		values.put(X_AD_Tab.COLUMNNAME_AD_Table_ID, components.getInstance().createTable(component, data));
		values.put(X_AD_Tab.COLUMNNAME_Description, components.getInstance().createDescription(component, data));
		values.put(X_AD_Tab.COLUMNNAME_Help, components.getInstance().createHelp(component, data));
		values.put(X_AD_Tab.COLUMNNAME_EntityType, components.getInstance().createEntityType(component, data));
		return component;				
	}
	
	@Override
	public void prepareRendering() {
		// TODO Auto-generated method stub	
	}	
}
