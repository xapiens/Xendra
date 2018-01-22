package org.columba.core.gui.statusbar.process;

import com.l2fprod.common.beans.BaseBeanInfo;

public class XSServerBeanBeanInfo extends BaseBeanInfo {
	public XSServerBeanBeanInfo() {
		super(XSServerBean.class);
		addProperty("enabled").setCategory("General");
	}
}
