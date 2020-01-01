package org.xendra.modeleditor.wizard.newwindow;

import java.util.HashMap;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.columba.core.gui.base.MultiLineLabel;
import org.compiere.model.persistence.X_AD_Window;
import org.xendra.modeleditor.util.ResourceLoader;
import org.xendra.modeleditor.wizard.common.components;

import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;

public class NewWindow extends AbstractStep {
	protected DataModel data;
	protected JTextField windowName;
	private HashMap values = new HashMap();
	private String Id;
	private Integer AD_Plugin_ID;	
	public NewWindow(DataModel data, String Id, Integer AD_Plugin_ID) {
		super(ResourceLoader.getString("dialog", "newwindowwizard", "identity"),
				ResourceLoader.getString("dialog", "newwindowwizard",   "identity_description"));
		this.data = data;		
		this.Id = Id;
		this.AD_Plugin_ID = AD_Plugin_ID;
		setCanGoNext(true);
		
	}
	
	public HashMap getControls() {
		return values;
	}
	

	@Override
	protected JComponent createComponent() {
		JComponent component = new JPanel();
		component.setLayout(new BoxLayout(component, BoxLayout.Y_AXIS));
		component.add(new MultiLineLabel(ResourceLoader.getString("dialog", "newwindowwizard", "identity_text")));
		component.add(Box.createVerticalStrut(40));
		components.getInstance().setControls(getControls());
		components.getInstance().setData(data);		
		values.put(X_AD_Window.COLUMNNAME_ID, components.getInstance().createId(component, data, Id));
		values.put(X_AD_Window.COLUMNNAME_AD_Plugin_ID, components.getInstance().createPlugin(component, data));
		values.put(X_AD_Window.COLUMNNAME_Name, components.getInstance().createName(component, data));		
		values.put(X_AD_Window.COLUMNNAME_Description, components.getInstance().createDescription(component, data));
		values.put(X_AD_Window.COLUMNNAME_Help, components.getInstance().createHelp(component, data));
		values.put(X_AD_Window.COLUMNNAME_EntityType, components.getInstance().createEntityType(component, data));
		return component;
	}
	
	@Override
	public void prepareRendering() {
		// TODO Auto-generated method stub	
	}		
}
