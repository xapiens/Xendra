package org.columba.core.gui.statusbar.process;

import org.columba.core.gui.statusbar.process.ServerProperties.ClientEditor;
import org.compiere.model.persistence.X_AD_Org;
import org.xendra.Constants;
import com.l2fprod.common.beans.BaseBeanInfo;

public class WebServerBeanBeanInfo extends BaseBeanInfo {

	public WebServerBeanBeanInfo() {
		super(WebServerBean.class);
		addProperty("port").setCategory("General");
		addProperty("secureport").setCategory("General");
		addProperty("certificate").setCategory("General");
		addProperty("AD_Client_ID").setCategory("General")
		.setPropertyEditorClass(ClientEditor.class);
		addProperty("enabled").setCategory("General");		
	}	
}