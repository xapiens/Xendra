package org.xendra.ruleeditor.gui.propertysheet;

import org.compiere.model.persistence.X_AD_Rule;
import org.xendra.Constants;

import com.l2fprod.common.beans.BaseBeanInfo;

public class RuleBeanBeanInfo extends BaseBeanInfo {
	public RuleBeanBeanInfo() {
		super(RuleBean.class);
		addProperty(Constants.XML_ATTRIBUTE_NAME).setCategory("General");
		addProperty(X_AD_Rule.COLUMNNAME_Lockout).setCategory("General");
		addProperty(Constants.XML_ATTRIBUTE_SESSIONNAME).setCategory("General");
	}
}
