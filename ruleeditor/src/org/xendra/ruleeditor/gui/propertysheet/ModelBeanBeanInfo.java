package org.xendra.ruleeditor.gui.propertysheet;

import com.l2fprod.common.beans.BaseBeanInfo;
import com.l2fprod.common.beans.ExtendedPropertyDescriptor;

public class ModelBeanBeanInfo extends BaseBeanInfo {
	public ModelBeanBeanInfo() {
		super(ModelBean.class);
		addProperty("name").setCategory("General");
		addProperty("Classname").setCategory("General");
		ExtendedPropertyDescriptor e = addProperty("filter");
		e.setCategory("General");			
		e.setPropertyEditorClass(FilterEditor.class);
		e.setPropertyTableRendererClass(FilterEditor.CellRenderer.class);
		
	}
}
