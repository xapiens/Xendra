package org.xendra.modeleditor.model;

import com.l2fprod.common.beans.BaseBeanInfo;

public class PluginBeanBeanInfo extends BaseBeanInfo {
	public PluginBeanBeanInfo() {
		super(PluginBean.class);
		addProperty("name").setCategory("General");		
	}
}
