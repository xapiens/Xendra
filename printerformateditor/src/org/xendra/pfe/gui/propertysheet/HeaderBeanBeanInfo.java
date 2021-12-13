package org.xendra.pfe.gui.propertysheet;

import org.compiere.model.persistence.X_AD_Column;
import org.xendra.controls.TableEditor;

import com.l2fprod.common.beans.BaseBeanInfo;
import com.l2fprod.common.beans.ExtendedPropertyDescriptor;

public class HeaderBeanBeanInfo extends BaseBeanInfo {
	public HeaderBeanBeanInfo() {
		super(HeaderBean.class);
		addProperty(X_AD_Column.COLUMNNAME_Name).setCategory("General");		
		//ExtendedPropertyDescriptor e = addProperty("Value");
		//e.setCategory("General");			
		//e.setPropertyEditorClass(PreviewEditor.class);
		//e.setPropertyTableRendererClass(PreviewEditor.CellRenderer.class);
		ExtendedPropertyDescriptor t = addProperty("Value");
		t.setCategory("General");
		t.setPropertyEditorClass(TableEditor.class);
		t.setPropertyTableRendererClass(TableEditor.CellRenderer.class);		
	}
}
