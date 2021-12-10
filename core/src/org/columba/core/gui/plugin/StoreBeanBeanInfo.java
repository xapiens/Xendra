package org.columba.core.gui.plugin;

import com.l2fprod.common.beans.BaseBeanInfo;

public class StoreBeanBeanInfo extends BaseBeanInfo {
	public StoreBeanBeanInfo() {
		super(StoreBean.class);			
		addProperty("alias").setCategory("General");
		addProperty("pkcs12").setCategory("General");
		addProperty("certificate").setCategory("General");
		addProperty("publicurl").setCategory("General");
		addProperty("privateurl").setCategory("General");
	}
}
