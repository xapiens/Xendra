package org.xendra.modeleditor.model;

import org.compiere.model.persistence.X_AD_Tab;
import org.xendra.modeleditor.gui.propertysheet.TableEditor;

import com.l2fprod.common.beans.BaseBeanInfo;

public class TabBeanBeanInfo extends BaseBeanInfo {
	public TabBeanBeanInfo() {
		super(TabBean.class);
		addProperty(X_AD_Tab.COLUMNNAME_Name).setCategory("General");
		addProperty(X_AD_Tab.COLUMNNAME_AD_Table_ID).setCategory("General")
		.setPropertyEditorClass(TableEditor.class);		
	}
}
