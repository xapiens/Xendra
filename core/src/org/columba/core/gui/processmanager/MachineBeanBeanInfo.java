package org.columba.core.gui.processmanager;

import org.compiere.model.persistence.X_A_Machine;

import com.l2fprod.common.beans.BaseBeanInfo;
import com.l2fprod.common.propertysheet.DefaultProperty;

public class MachineBeanBeanInfo extends BaseBeanInfo {
	public MachineBeanBeanInfo() {
		super(MachineBean.class);
		addProperty("trash").setCategory("Directory");
		addProperty("plugins").setCategory("Directory");
		addProperty("reports").setCategory("Directory");
		addProperty("xendrian").setCategory("Directory");
		addProperty("installed").setCategory("Directory");
		addProperty("replication").setCategory("Directory");		
		addProperty("xendrastore").setCategory("Directory");		
		addProperty("Name").setCategory("General");
		addProperty(X_A_Machine.COLUMNNAME_Mac_Address).setCategory("General");		
		addProperty(X_A_Machine.COLUMNNAME_Lockout).setCategory("General");
		
	}
    static class NoReadWriteProperty extends DefaultProperty {
        public void readFromObject(Object object) {
        }
        public void writeToObject(Object object) {
        }
      }	
}
