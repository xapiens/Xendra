package org.xendra.mfe.model;


import com.l2fprod.common.beans.BaseBeanInfo;

public class SectionBeanBeanInfo extends BaseBeanInfo {
	public SectionBeanBeanInfo() {
		super(SectionBean.class);
		addProperty("name").setCategory("General");
		addProperty("parent").setCategory("General");
		addProperty("sequence").setCategory("General");
	}
}
