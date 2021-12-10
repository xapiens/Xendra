package org.columba.core.gui.processmanager.folder;

import org.columba.core.gui.processmanager.ServerSheetPage.CostElementEditor;
import org.compiere.model.persistence.X_AD_Process;
import org.compiere.model.persistence.X_M_MaterialPolicy;
import org.xendra.controls.CalendarPropertyEditor;
import org.xendra.controls.ProcessRunNowEditor;

import com.l2fprod.common.beans.BaseBeanInfo;
import com.l2fprod.common.beans.editor.JCalendarDatePropertyEditor;

public class MaterialPolicyNodeBeanInfo extends BaseBeanInfo {
	public MaterialPolicyNodeBeanInfo() {
		super(MaterialPolicyNode.class);
		addProperty(X_M_MaterialPolicy.COLUMNNAME_StartDate).setCategory("General")
		.setPropertyEditorClass(CalendarPropertyEditor.class);
		addProperty(X_M_MaterialPolicy.COLUMNNAME_Synchronized).setCategory("General");
		addProperty(X_M_MaterialPolicy.COLUMNNAME_M_CostElement_ID).setCategory("General")		
		.setPropertyEditorClass(CostElementEditor.class);
		addProperty(X_M_MaterialPolicy.COLUMNNAME_Name).setCategory("General");
		addProperty(X_AD_Process.COLUMNNAME_AD_Process_ID).setCategory("General")
		.setPropertyEditorClass(ProcessRunNowEditor.class);
	}

}
