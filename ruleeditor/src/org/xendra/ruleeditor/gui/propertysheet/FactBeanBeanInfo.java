package org.xendra.ruleeditor.gui.propertysheet;

import org.compiere.model.persistence.X_AD_Menu;
import org.compiere.model.persistence.X_AD_Process;
import org.xendra.ruleeditor.gui.propertysheet.PropertySheetPage.MenuActionEditor;
import org.xendra.ruleeditor.gui.propertysheet.PropertySheetPage.RuleTypeEditor;

import com.l2fprod.common.beans.BaseBeanInfo;

public class FactBeanBeanInfo extends BaseBeanInfo {
	public FactBeanBeanInfo() {
		super(FactBean.class);
		addProperty("name").setCategory("General");
		addProperty(X_AD_Menu.COLUMNNAME_Action).setCategory("General")
		.setPropertyEditorClass(MenuActionEditor.class);		
	}
}
