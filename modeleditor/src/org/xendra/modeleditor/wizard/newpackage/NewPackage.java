package org.xendra.modeleditor.wizard.newpackage;

import java.util.HashMap;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.columba.core.gui.base.MultiLineLabel;
import org.compiere.model.persistence.X_AD_Package;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.xendra.modeleditor.util.ResourceLoader;
import org.xendra.modeleditor.wizard.common.components;

import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;

public class NewPackage extends AbstractStep {
	protected DataModel data;
	protected JTextField packageName;
	private HashMap values = new HashMap();	
	
	public NewPackage(DataModel data) {
		super(Msg.translate(Env.getCtx(), X_AD_Package.COLUMNNAME_AD_Package_ID),
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
		component.add(new MultiLineLabel(ResourceLoader.getString("dialog", "newpackagewizard", "identity_text")));
		component.add(Box.createVerticalStrut(40));		
		components.getInstance().setControls(getControls());
		components.getInstance().setData(data);
		values.put(X_AD_Package.COLUMNNAME_AD_Plugin_ID, components.getInstance().createPlugin(component, data));
		values.put(X_AD_Package.COLUMNNAME_Name, components.getInstance().createName(component, data));
		return component;
	}	
	
	@Override
	public void prepareRendering() {
		// TODO Auto-generated method stub	
	}			
}
