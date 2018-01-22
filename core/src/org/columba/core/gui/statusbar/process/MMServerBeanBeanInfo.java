package org.columba.core.gui.statusbar.process;

import com.l2fprod.common.beans.BaseBeanInfo;

public class MMServerBeanBeanInfo  extends BaseBeanInfo {

	public MMServerBeanBeanInfo() {
		super(MMServerBean.class);
		addProperty("port").setCategory("General");
		addProperty("enabled").setCategory("General");
	}

}
