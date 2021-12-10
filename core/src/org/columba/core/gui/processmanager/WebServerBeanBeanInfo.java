package org.columba.core.gui.processmanager;

import org.columba.core.gui.processmanager.ServerSheetPage.ClientEditor;
import com.l2fprod.common.beans.BaseBeanInfo;
import com.l2fprod.common.beans.ExtendedPropertyDescriptor;

public class WebServerBeanBeanInfo extends BaseBeanInfo {

	public WebServerBeanBeanInfo() {
		super(WebServerBean.class);
		ExtendedPropertyDescriptor m = addProperty("A_Machine_ID");
		m.setCategory("General");
		m.setPropertyTableRendererClass(MachineEditor.CellRenderer.class);
		m.setPropertyEditorClass(MachineEditor.class);				
		addProperty("port").setCategory("General");
		addProperty("secureport").setCategory("General");
		addProperty("certificate").setCategory("General");
		addProperty("IsDefault").setCategory("General");
		addProperty("AD_Client_ID").setCategory("General")
		.setPropertyEditorClass(ClientEditor.class);
		addProperty("enabled").setCategory("General");
		addProperty("Synchronized").setCategory("Update");
	}	
}