package org.columba.core.gui.processmanager;

import org.compiere.model.persistence.X_A_MachineServer;
import org.compiere.model.persistence.X_M_MaterialProcessor;
import org.xendra.controls.MessageServerEditor;

import com.l2fprod.common.beans.BaseBeanInfo;
import com.l2fprod.common.beans.ExtendedPropertyDescriptor;

public class MSServerBeanBeanInfo extends BaseBeanInfo {
	public MSServerBeanBeanInfo() {
		super(MSServerBean.class);
		ExtendedPropertyDescriptor m = addProperty("A_Machine_ID");
		m.setCategory("General");
		m.setPropertyTableRendererClass(MachineEditor.CellRenderer.class);
		m.setPropertyEditorClass(MachineEditor.class);				
		addProperty("port").setCategory("General");
		addProperty("Alias").setCategory("General");
		addProperty("IsDefault").setCategory("General");
		ExtendedPropertyDescriptor i = addProperty(X_A_MachineServer.COLUMNNAME_Identifier);
		i.setName(X_M_MaterialProcessor.COLUMNNAME_Name);
		i.setCategory("General");
		i.setPropertyEditorClass(MessageServerEditor.class);
		i.setPropertyTableRendererClass(MessageServerEditor.CellRenderer.class);		
	}
}
