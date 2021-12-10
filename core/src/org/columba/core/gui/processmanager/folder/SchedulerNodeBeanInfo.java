package org.columba.core.gui.processmanager.folder;

import org.columba.core.gui.processmanager.ServerSheetPage.FrequencyTypeEditor;
import org.compiere.model.persistence.X_AD_Scheduler;
import org.compiere.util.Env;
import org.compiere.util.Msg;


import com.l2fprod.common.beans.BaseBeanInfo;

public class SchedulerNodeBeanInfo extends BaseBeanInfo {
	public SchedulerNodeBeanInfo() {
		super(SchedulerNode.class);
		addProperty("datenextrun").setCategory("General").setName(Msg.translate(Env.getCtx(), X_AD_Scheduler.COLUMNNAME_DateNextRun));
		addProperty("datelastrun").setCategory("General").setName(Msg.translate(Env.getCtx(), X_AD_Scheduler.COLUMNNAME_DateLastRun));
		addProperty("FrequencyType").setCategory("General").setPropertyEditorClass(FrequencyTypeEditor.class);
		addProperty("Frequency").setCategory("General");
		addProperty(X_AD_Scheduler.COLUMNNAME_FrequencyStartAt).setCategory("General");
		addProperty("Tag").setCategory("General");		
	}
}
