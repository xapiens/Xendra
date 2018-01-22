package org.columba.core.gui.statusbar.process;

import org.compiere.model.persistence.X_A_Machine;

import com.l2fprod.common.beans.BaseBeanInfo;

public class MachineBeanBeanInfo extends BaseBeanInfo {
	public MachineBeanBeanInfo() {
		super(MachineBean.class);
		addProperty("trash").setCategory("Directory");
		addProperty("plugins").setCategory("Directory");
		addProperty("reports").setCategory("Directory");
		addProperty("xendrian").setCategory("Directory");
		addProperty("installed").setCategory("Directory");
		addProperty("replication").setCategory("Directory");		
		addProperty("store").setCategory("Directory");		
		addProperty("Name").setCategory("General");
		addProperty(X_A_Machine.COLUMNNAME_Lockout).setCategory("General");
		
	}
}
