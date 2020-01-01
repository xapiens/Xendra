package org.xendra.modeleditor.model;


import org.compiere.model.persistence.X_AD_Column;
import org.xendra.controls.CalendarPropertyEditor;
import org.xendra.modeleditor.gui.propertysheet.PropertySheetPage.EntityTypeEditor;
import org.xendra.modeleditor.gui.propertysheet.ColumnDeveloperEditor;
import org.xendra.modeleditor.gui.propertysheet.PropertySheetPage;
import org.xendra.modeleditor.gui.propertysheet.ValRuleEditor;
import org.xendra.modeleditor.gui.propertysheet.PropertySheetPage.ProcessEditor;
import org.xendra.modeleditor.gui.propertysheet.PropertySheetPage.ReferenceEditor;
import org.xendra.modeleditor.gui.propertysheet.PropertySheetPage.ReferenceValueEditor;
import org.xendra.modeleditor.gui.propertysheet.ValRuleEditor.CellRenderer;
import org.xendra.modeleditor.model.ColumnBean;

import com.l2fprod.common.beans.BaseBeanInfo;
import com.l2fprod.common.beans.ExtendedPropertyDescriptor;


public class ColumnBeanBeanInfo extends BaseBeanInfo {
	public ColumnBeanBeanInfo() {
		super(ColumnBean.class);			
		addProperty(X_AD_Column.COLUMNNAME_Name).setCategory("General");
		addProperty(X_AD_Column.COLUMNNAME_Description).setCategory("General");
		addProperty(X_AD_Column.COLUMNNAME_Help).setCategory("General");
		addProperty(X_AD_Column.COLUMNNAME_EntityType).setCategory("General")
			.setPropertyEditorClass(EntityTypeEditor.class);
		addProperty(X_AD_Column.COLUMNNAME_ColumnName).setCategory("General");
		addProperty(X_AD_Column.COLUMNNAME_AD_Reference_ID).setCategory("General")		
			.setPropertyEditorClass(ReferenceEditor.class);
		addProperty(X_AD_Column.COLUMNNAME_AD_Reference_Value_ID).setCategory("General")
			.setPropertyEditorClass(ReferenceValueEditor.class);

		ExtendedPropertyDescriptor vre = addProperty(X_AD_Column.COLUMNNAME_AD_Val_Rule_ID);
		vre.setCategory("General");			
		vre.setPropertyEditorClass(ValRuleEditor.class);
		vre.setPropertyTableRendererClass(ValRuleEditor.CellRenderer.class);
		
		addProperty(X_AD_Column.COLUMNNAME_FieldLength).setCategory("General");
		addProperty(X_AD_Column.COLUMNNAME_DefaultValue).setCategory("General");
		addProperty(X_AD_Column.COLUMNNAME_IsKey).setCategory("General");
		addProperty(X_AD_Column.COLUMNNAME_IsParent).setCategory("General");
		addProperty(X_AD_Column.COLUMNNAME_IsMandatory).setCategory("General");
		addProperty(X_AD_Column.COLUMNNAME_IsUpdateable).setCategory("General");
		addProperty(X_AD_Column.COLUMNNAME_ReadOnlyLogic).setCategory("General");
		addProperty(X_AD_Column.COLUMNNAME_IsIdentifier).setCategory("General");
		addProperty(X_AD_Column.COLUMNNAME_SeqNo).setCategory("General");
		addProperty(X_AD_Column.COLUMNNAME_IsTranslated).setCategory("General");
		addProperty(X_AD_Column.COLUMNNAME_Callout).setCategory("General");
		addProperty(X_AD_Column.COLUMNNAME_VFormat).setCategory("General");
		addProperty(X_AD_Column.COLUMNNAME_ValueMin).setCategory("General");
		addProperty(X_AD_Column.COLUMNNAME_ValueMax).setCategory("General");
		addProperty(X_AD_Column.COLUMNNAME_IsSelectionColumn).setCategory("General");
		addProperty(X_AD_Column.COLUMNNAME_AD_Process_ID).setCategory("General")
			.setPropertyEditorClass(ProcessEditor.class);
		addProperty(X_AD_Column.COLUMNNAME_IsAlwaysUpdateable).setCategory("General");
		addProperty(X_AD_Column.COLUMNNAME_ColumnSQL).setCategory("General");
		addProperty(X_AD_Column.COLUMNNAME_FormatPattern).setCategory("General");
		addProperty(X_AD_Column.COLUMNNAME_IsAllowLogging).setCategory("General");
		addProperty(X_AD_Column.COLUMNNAME_MandatoryLogic).setCategory("General");
		addProperty(X_AD_Column.COLUMNNAME_InfoFactoryClass).setCategory("General");
		addProperty(X_AD_Column.COLUMNNAME_Synchronized).setCategory("General")
			.setPropertyEditorClass(CalendarPropertyEditor.class);
		
		ExtendedPropertyDescriptor e = addProperty(X_AD_Column.COLUMNNAME_AD_Column_ID);
		e.setCategory("Developer");			
		e.setPropertyEditorClass(ColumnDeveloperEditor.class);
		e.setPropertyTableRendererClass(ColumnDeveloperEditor.CellRenderer.class);

	}
}	
