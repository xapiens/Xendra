package org.columba.core.gui.processmanager;

import com.l2fprod.common.beans.BaseBeanInfo;
import com.l2fprod.common.beans.ExtendedPropertyDescriptor;

public class UpdateServerBeanBeanInfo extends BaseBeanInfo {
	public UpdateServerBeanBeanInfo() {
		super(UpdateServerBean.class);
		ExtendedPropertyDescriptor m = addProperty("A_Machine_ID");
		m.setCategory("General");
		m.setPropertyTableRendererClass(MachineEditor.CellRenderer.class);
		m.setPropertyEditorClass(MachineEditor.class);				
		addProperty("port").setCategory("General");
		addProperty("enabled").setCategory("General");				
	}
}
