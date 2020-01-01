package org.xendra.modeleditor.model;

import com.l2fprod.common.beans.BaseBeanInfo;

public class PackageBeanBeanInfo extends BaseBeanInfo {
	public PackageBeanBeanInfo() {
		super(PackageBean.class);
		addProperty("name").setCategory("General");		
	}
}
