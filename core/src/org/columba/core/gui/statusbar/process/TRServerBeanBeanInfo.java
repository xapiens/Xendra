package org.columba.core.gui.statusbar.process;

import com.l2fprod.common.beans.BaseBeanInfo;

public class TRServerBeanBeanInfo  extends BaseBeanInfo {

	public TRServerBeanBeanInfo() {
		super(TRServerBean.class);
		addProperty("port").setCategory("General");
	}

}
