package org.columba.core.gui.processmanager.folder;

import org.compiere.model.persistence.X_M_MaterialProcessorLog;

import com.l2fprod.common.beans.BaseBeanInfo;

public class MaterialProcessorLogNodeBeanInfo extends BaseBeanInfo {
	public MaterialProcessorLogNodeBeanInfo() {
		super(MaterialProcessorLogNode.class);
		addProperty(X_M_MaterialProcessorLog.COLUMNNAME_Summary).setCategory("General");
	}
}
