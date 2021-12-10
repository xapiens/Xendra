package org.columba.core.gui.processmanager.folder;

import org.columba.core.gui.processmanager.MachineEditor;
import org.columba.core.gui.processmanager.ServerSheetPage.ProcessEditor;
import org.columba.core.gui.processmanager.ServerSheetPage.RuleEditor;
import org.compiere.model.persistence.X_AD_Process;
import org.compiere.model.persistence.X_AD_Rule;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.xendra.controls.ProcessRunNowEditor;

import com.l2fprod.common.beans.BaseBeanInfo;
import com.l2fprod.common.beans.ExtendedPropertyDescriptor;

public class ProcessNodeBeanInfo extends BaseBeanInfo {
	public ProcessNodeBeanInfo() {
		super(ProcessNode.class);
		ExtendedPropertyDescriptor m = addProperty("A_Machine_ID");
		m.setCategory("General");
		m.setPropertyTableRendererClass(MachineEditor.CellRenderer.class);
		m.setPropertyEditorClass(MachineEditor.class);
		ExtendedPropertyDescriptor p = addProperty("AD_Process_ID");
		p.setCategory("General");				
		p.setName(Msg.translate(Env.getCtx(), X_AD_Process.COLUMNNAME_AD_Process_ID));
		p.setPropertyEditorClass(ProcessRunNowEditor.class);
		p.setPropertyTableRendererClass(ProcessNode.CellProcessRenderer.class);
		//p.setReadOnly();
		ExtendedPropertyDescriptor r = addProperty("AD_Rule_ID");
		r.setName(Msg.translate(Env.getCtx(), X_AD_Rule.COLUMNNAME_AD_Rule_ID));
		r.setCategory("General");			
		r.setPropertyEditorClass(RuleEditor.class);
		r.setPropertyTableRendererClass(ProcessNode.CellRuleRenderer.class);				
	}
}
