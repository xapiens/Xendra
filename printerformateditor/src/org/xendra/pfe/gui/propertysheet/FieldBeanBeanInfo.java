package org.xendra.pfe.gui.propertysheet;

import org.compiere.model.persistence.X_AD_Column;

import com.l2fprod.common.beans.BaseBeanInfo;

public class FieldBeanBeanInfo extends BaseBeanInfo {
	public FieldBeanBeanInfo() {
		super(FieldBean.class);
		addProperty(X_AD_Column.COLUMNNAME_Name).setCategory("General");		
		addProperty("Value").setCategory("General");
	}
}
