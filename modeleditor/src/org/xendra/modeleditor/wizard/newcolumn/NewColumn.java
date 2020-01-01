package org.xendra.modeleditor.wizard.newcolumn;

import java.util.HashMap;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.columba.core.gui.base.MultiLineLabel;
import org.compiere.model.persistence.X_AD_Column;
import org.xendra.modeleditor.util.ResourceLoader;
import org.xendra.modeleditor.wizard.common.components;

import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;

public class NewColumn extends AbstractStep { 
	protected DataModel data;	
	protected JTextField columnName;
	private HashMap values = new HashMap();

	public NewColumn(DataModel data) {		
		super(ResourceLoader.getString("dialog", "newcolumnwizard", "identity"),
				ResourceLoader.getString("dialog", "newcolumnwizard",   "identity_description"));
		this.data = data;		
	}

	public HashMap getControls() {
		return values;
	}
	
	@Override
	protected JComponent createComponent() {
		JComponent component = new JPanel();
		component.setLayout(new BoxLayout(component, BoxLayout.Y_AXIS));
		component.add(new MultiLineLabel(ResourceLoader.getString("dialog", "newcolumnwizard", "identity_text")));
		component.add(Box.createVerticalStrut(40));		
		components.getInstance().setControls(getControls());
		components.getInstance().setData(data);
		values.put(X_AD_Column.COLUMNNAME_Name, components.getInstance().createName(component, data));
		values.put(X_AD_Column.COLUMNNAME_AD_Element_ID, components.getInstance().createElement(component, data));
		values.put(X_AD_Column.COLUMNNAME_EntityType, components.getInstance().createEntityType(component, data));				
		values.put(X_AD_Column.COLUMNNAME_AD_Reference_ID, components.getInstance().createReference(component, data)); 							
		values.put(X_AD_Column.COLUMNNAME_AD_Reference_Value_ID, components.getInstance().createReferenceValue(component, data));
		values.put(X_AD_Column.COLUMNNAME_FieldLength, components.getInstance().createFieldLength(component, data));
		values.put(X_AD_Column.COLUMNNAME_Version, components.getInstance().createVersion(component, data));
		return component;		
	}

	@Override
	public void prepareRendering() {
		// TODO Auto-generated method stub	
	}
}
