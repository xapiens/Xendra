package org.xendra.ruleeditor.gui.propertysheet;

import com.l2fprod.common.beans.BaseBeanInfo;

public class GroupBeanBeanInfo extends BaseBeanInfo {
	public GroupBeanBeanInfo() {
		super(GroupBean.class);
		addProperty("name").setCategory("General");
	}
}
