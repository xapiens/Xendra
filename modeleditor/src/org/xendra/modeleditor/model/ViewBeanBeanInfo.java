package org.xendra.modeleditor.model;

import org.compiere.model.persistence.X_AD_View;

import com.l2fprod.common.beans.BaseBeanInfo;

public class ViewBeanBeanInfo extends BaseBeanInfo {
	public ViewBeanBeanInfo() {
		super(ViewBean.class);
		addProperty(X_AD_View.COLUMNNAME_Name).setCategory("General");
		addProperty(X_AD_View.COLUMNNAME_Comments).setCategory("General");
		addProperty(X_AD_View.COLUMNNAME_Owner).setCategory("General");
		addProperty(X_AD_View.COLUMNNAME_Definition).setCategory("General");
		addProperty(X_AD_View.COLUMNNAME_Identifier).setCategory("General");
		addProperty(X_AD_View.COLUMNNAME_Synchronized).setCategory("General");
	}
}
