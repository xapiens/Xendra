package org.xendra.modeleditor.model;

import org.compiere.model.persistence.X_AD_Table;
import org.xendra.controls.CalendarPropertyEditor;
import org.xendra.modeleditor.gui.propertysheet.PropertySheetPage;
import org.xendra.modeleditor.gui.propertysheet.TableDeveloperEditor;
import org.xendra.modeleditor.gui.propertysheet.ValRuleEditor;
import org.xendra.modeleditor.gui.propertysheet.PropertySheetPage.AccessLevelEditor;
import org.xendra.modeleditor.gui.propertysheet.PropertySheetPage.EntityTypeEditor;
import org.xendra.modeleditor.gui.propertysheet.PropertySheetPage.ReplicationEditor;
import org.xendra.modeleditor.gui.propertysheet.PropertySheetPage.WindowEditor;
import org.xendra.modeleditor.gui.propertysheet.TableDeveloperEditor.CellRenderer;

import com.l2fprod.common.beans.BaseBeanInfo;
import com.l2fprod.common.beans.ExtendedPropertyDescriptor;

public class TableBeanBeanInfo extends BaseBeanInfo {
	public TableBeanBeanInfo() {		
		super(TableBean.class);
		addProperty(X_AD_Table.COLUMNNAME_Name).setCategory("General");
		addProperty(X_AD_Table.COLUMNNAME_Description).setCategory("General");
		addProperty(X_AD_Table.COLUMNNAME_Help).setCategory("General");		
		addProperty(X_AD_Table.COLUMNNAME_TableName).setCategory("General");
		addProperty(X_AD_Table.COLUMNNAME_AccessLevel).setCategory("General")
			.setPropertyEditorClass(AccessLevelEditor.class);	
		addProperty(X_AD_Table.COLUMNNAME_EntityType).setCategory("General")
			.setPropertyEditorClass(EntityTypeEditor.class);
		addProperty(X_AD_Table.COLUMNNAME_AD_Window_ID).setCategory("General")
			.setPropertyEditorClass(WindowEditor.class);
		addProperty(X_AD_Table.COLUMNNAME_AD_Val_Rule_ID).setCategory("General")
			.setPropertyEditorClass(ValRuleEditor.class);
		addProperty(X_AD_Table.COLUMNNAME_LoadSeq).setCategory("General");
		addProperty(X_AD_Table.COLUMNNAME_IsSecurityEnabled).setCategory("General");
		addProperty(X_AD_Table.COLUMNNAME_IsDeleteable).setCategory("General");
		addProperty(X_AD_Table.COLUMNNAME_IsHighVolume).setCategory("General");
		addProperty(X_AD_Table.COLUMNNAME_IsChangeLog).setCategory("General");
		addProperty(X_AD_Table.COLUMNNAME_ReplicationType).setCategory("General")
			.setPropertyEditorClass(ReplicationEditor.class);
		addProperty(X_AD_Table.COLUMNNAME_PO_Window_ID).setCategory("General")
			.setPropertyEditorClass(WindowEditor.class);
		addProperty(X_AD_Table.COLUMNNAME_Synchronized).setCategory("General")
			.setPropertyEditorClass(CalendarPropertyEditor.class);
		addProperty(X_AD_Table.COLUMNNAME_ID).setCategory("General");
		//
		ExtendedPropertyDescriptor e = addProperty(X_AD_Table.COLUMNNAME_AD_Table_ID);
			e.setCategory("Developer");			
			e.setPropertyEditorClass(TableDeveloperEditor.class);
			e.setPropertyTableRendererClass(TableDeveloperEditor.CellRenderer.class);
	}
}