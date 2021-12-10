package org.columba.core.gui.processmanager.folder;

import org.compiere.model.persistence.X_AD_Scheduler;
import org.compiere.util.Env;
import org.compiere.util.Msg;

import com.l2fprod.common.beans.BaseBeanInfo;

public class ServerProcessNodeBeanInfo extends BaseBeanInfo {
	public ServerProcessNodeBeanInfo() {
		super(ServerProcessNode.class);
		addProperty("datenextrun").setCategory("General").setName(Msg.translate(Env.getCtx(), X_AD_Scheduler.COLUMNNAME_DateNextRun));
		addProperty("datelastrun").setCategory("General").setName(Msg.translate(Env.getCtx(), X_AD_Scheduler.COLUMNNAME_DateLastRun));		
	}
}
