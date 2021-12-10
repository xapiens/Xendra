package org.columba.core.gui.processmanager.folder;

import org.compiere.model.persistence.X_AD_Scheduler_Para;
import org.xendra.controls.SchedulerParamDefaultEditor;

import com.l2fprod.common.beans.BaseBeanInfo;
import com.l2fprod.common.beans.ExtendedPropertyDescriptor;

public class SchedulerParaNodeBeanInfo extends BaseBeanInfo {
	public SchedulerParaNodeBeanInfo() {
		super(SchedulerParaNode.class);
		addProperty("Name").setCategory("General");
		addProperty("Description").setCategory("General");
		ExtendedPropertyDescriptor p = addProperty(X_AD_Scheduler_Para.COLUMNNAME_ParameterDefault);
		p.setCategory("General");			
		p.setPropertyEditorClass(SchedulerParamDefaultEditor.class);
		p.setPropertyTableRendererClass(SchedulerParamDefaultEditor.CellRenderer.class);
	}
}
