package org.xendra.modeleditor.wizard.newplugin;

import java.util.HashMap;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.columba.core.gui.base.MultiLineLabel;
import org.compiere.model.persistence.X_AD_Plugin;
import org.compiere.model.persistence.X_AD_Table;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.xendra.modeleditor.util.ResourceLoader;
import org.xendra.modeleditor.wizard.common.components;

import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;

public class NewPlugin extends AbstractStep {
	protected DataModel data;
	protected JTextField pluginName;
	private HashMap values = new HashMap();
	
	public NewPlugin(DataModel data) {
		super(Msg.translate(Env.getCtx(), X_AD_Plugin.COLUMNNAME_AD_Plugin_ID),
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
		values.put(X_AD_Plugin.COLUMNNAME_Name, components.getInstance().createName(component, data));
		values.put(X_AD_Plugin.COLUMNNAME_Description, components.getInstance().createDescription(component, data));
		values.put(X_AD_Plugin.COLUMNNAME_CategoryName, components.getInstance().createCategoryName(component, data));
		values.put(X_AD_Plugin.COLUMNNAME_Folder, components.getInstance().createFolder(component, data));
		values.put(X_AD_Table.COLUMNNAME_AccessLevel, components.getInstance().createAccessLevel(component, data));
		return component;
	}
	
	@Override
	public void prepareRendering() {
		// TODO Auto-generated method stub	
	}		
}
