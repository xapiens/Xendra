package org.xendra.mfe.model;

import org.xendra.controls.TableColumnEditor;
import org.xendra.controls.TableEditor;

import com.l2fprod.common.beans.BaseBeanInfo;
import com.l2fprod.common.beans.ExtendedPropertyDescriptor;

public class FieldBeanBeanInfo extends BaseBeanInfo {
	public FieldBeanBeanInfo() {
		super(FieldBean.class);
		addProperty("key").setCategory("General");
		addProperty("name").setCategory("General");
		addProperty("area").setCategory("General");
		addProperty("mandatory").setCategory("General");
		addProperty("sequence").setCategory("General");
		ExtendedPropertyDescriptor e = addProperty("columnid");
		e.setCategory("General");			
		e.setPropertyEditorClass(TableColumnEditor.class);
		e.setPropertyTableRendererClass(TableColumnEditor.CellRenderer.class);
		ExtendedPropertyDescriptor t = addProperty("tableid");
		t.setCategory("General");
		t.setPropertyEditorClass(TableEditor.class);
		t.setPropertyTableRendererClass(TableEditor.CellRenderer.class);
	}
}
