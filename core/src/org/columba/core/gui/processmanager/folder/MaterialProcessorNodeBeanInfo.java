package org.columba.core.gui.processmanager.folder;

import org.columba.core.gui.processmanager.MachineEditor;
import org.compiere.grid.ed.VDate;
import org.compiere.model.persistence.X_AD_Process;
import org.compiere.model.persistence.X_AD_Scheduler;
import org.compiere.model.persistence.X_M_MaterialProcessor;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.xendra.Constants;
import org.xendra.controls.CalendarPropertyEditor;
import org.xendra.controls.XendraServerEditor;

import com.l2fprod.common.beans.BaseBeanInfo;
import com.l2fprod.common.beans.ExtendedPropertyDescriptor;

public class MaterialProcessorNodeBeanInfo extends BaseBeanInfo {
	public MaterialProcessorNodeBeanInfo() {
		super(MaterialProcessorNode.class);
		ExtendedPropertyDescriptor m = addProperty("A_Machine_ID");
		m.setCategory("General");
		m.setPropertyTableRendererClass(MachineEditor.CellRenderer.class);
		m.setPropertyEditorClass(MachineEditor.class);
		
		ExtendedPropertyDescriptor nr = addProperty(X_M_MaterialProcessor.COLUMNNAME_DateNextRun);
		nr.setCategory("General");
		nr.setDisplayName(Msg.translate(Env.getCtx(), X_AD_Scheduler.COLUMNNAME_DateNextRun));
		nr.setPropertyEditorClass(CalendarPropertyEditor.class);
		//
		ExtendedPropertyDescriptor lr = addProperty(X_M_MaterialProcessor.COLUMNNAME_DateLastRun);
		lr.setCategory(Constants.General);
		lr.setDisplayName(Msg.translate(Env.getCtx(), X_AD_Scheduler.COLUMNNAME_DateLastRun));
		lr.setPropertyEditorClass(CalendarPropertyEditor.class);
				
		ExtendedPropertyDescriptor i = addProperty(X_M_MaterialProcessor.COLUMNNAME_Identifier);
		i.setName(X_M_MaterialProcessor.COLUMNNAME_Name);
		i.setCategory("General");
		i.setPropertyEditorClass(XendraServerEditor.class);
		i.setPropertyTableRendererClass(XendraServerEditor.CellRenderer.class);
	}
}
