package org.xendra.pfe.gui.propertysheet;

import org.compiere.model.persistence.X_C_PrinterDocumentFormat;
import org.xendra.pfe.gui.propertysheet.PropertySheetPage.EntityTypeEditor;
import org.xendra.pfe.gui.propertysheet.PropertySheetPage.FormatTypeEditor;
import org.xendra.pfe.gui.propertysheet.PropertySheetPage.PrinterDriverEditor;

import com.l2fprod.common.beans.BaseBeanInfo;

public class FormatInvBeanBeanInfo extends BaseBeanInfo {
	public FormatInvBeanBeanInfo() {
		super(FormatInvBean.class);
		addProperty(X_C_PrinterDocumentFormat.COLUMNNAME_C_PrinterFormatType)
			.setCategory("General").setPropertyEditorClass(FormatTypeEditor.class);
		addProperty(X_C_PrinterDocumentFormat.COLUMNNAME_EntityType)
			.setCategory("General").setPropertyEditorClass(EntityTypeEditor.class);
		addProperty(X_C_PrinterDocumentFormat.COLUMNNAME_Lockout)
			.setCategory("General");
		addProperty(X_C_PrinterDocumentFormat.COLUMNNAME_Name)
			.setCategory("General");
		addProperty("Lines").setCategory("Page");
		addProperty("Columns").setCategory("Page");
		addProperty(X_C_PrinterDocumentFormat.COLUMNNAME_A_PrinterDriver_ID)
			.setCategory("General").setPropertyEditorClass(PrinterDriverEditor.class);
		addProperty("Header").setCategory("General");
		addProperty("Child").setCategory("General");		
	}
}
