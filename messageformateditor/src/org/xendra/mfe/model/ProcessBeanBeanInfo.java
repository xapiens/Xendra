package org.xendra.mfe.model;

import org.columba.core.gui.processmanager.ServerSheetPage.RuleEditor;
import org.compiere.model.persistence.X_AD_MessageFormat;
import org.compiere.model.persistence.X_AD_Process;
import org.compiere.model.persistence.X_AD_Scheduler;

import com.l2fprod.common.beans.BaseBeanInfo;

public class ProcessBeanBeanInfo extends BaseBeanInfo{
	public ProcessBeanBeanInfo() {
		super(ProcessBean.class);
		addProperty(X_AD_Process.COLUMNNAME_Value).setCategory("General");
		addProperty(X_AD_Process.COLUMNNAME_AccessLevel).setCategory("General");
		addProperty(X_AD_Scheduler.COLUMNNAME_FrequencyType).setCategory("General");
		addProperty(X_AD_Scheduler.COLUMNNAME_Frequency).setCategory("General");
		addProperty(X_AD_Scheduler.COLUMNNAME_KeepLogDays).setCategory("General");
		addProperty(X_AD_Process.COLUMNNAME_Name).setCategory("General");
		addProperty(X_AD_MessageFormat.COLUMNNAME_QueueName).setCategory("General");
		addProperty(X_AD_MessageFormat.COLUMNNAME_AD_Rule_ID).setCategory("General")
		.setPropertyEditorClass(RuleEditor.class);		
		addProperty(X_AD_Process.COLUMNNAME_Identifier).setCategory("General");
	}
}
