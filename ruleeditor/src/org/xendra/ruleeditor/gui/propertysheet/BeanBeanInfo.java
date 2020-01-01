package org.xendra.ruleeditor.gui.propertysheet;

import org.compiere.model.persistence.X_AD_Process;
import org.xendra.Constants;
import org.xendra.ruleeditor.gui.propertysheet.PropertySheetPage.BehaviorEditor;
import org.xendra.ruleeditor.gui.propertysheet.PropertySheetPage.ProcessingMode;
import org.xendra.ruleeditor.gui.propertysheet.PropertySheetPage.RuleTypeEditor;

import com.l2fprod.common.beans.BaseBeanInfo;

public class BeanBeanInfo extends BaseBeanInfo {
	public BeanBeanInfo() {
		super(Bean.class);			
		addProperty(Constants.XML_ATTRIBUTE_CATEGORY).setCategory("General");
		addProperty("isdefault").setCategory("General");
		addProperty("packagename").setCategory("General");
		addProperty(Constants.XML_ATTRIBUTE_NAME).setCategory("General");
		addProperty(Constants.XML_ATTRIBUTE_QUEUENAME).setCategory("General");
		addProperty(X_AD_Process.COLUMNNAME_RuleType).setCategory("General")
			.setPropertyEditorClass(RuleTypeEditor.class);
		addProperty(Constants.XML_ATTRIBUTE_DOCBASETYPE).setCategory("Document")
			.setPropertyEditorClass(DocBaseTypePropertyEditor.class);
		addProperty(Constants.XML_ATTRIBUTE_DOCSUBTYPE).setCategory("Document");
		addProperty(Constants.XML_ATTRIBUTE_ENTRYPOINT).setCategory("RealTime");
		addProperty(Constants.XML_ATTRIBUTE_EQUALSBEHAVIOR).setCategory("General").setPropertyEditorClass(BehaviorEditor.class);
		addProperty(Constants.XML_ATTRIBUTE_QUEUELISTENERCLASS).setCategory("General");
		addProperty(Constants.XML_ATTRIBUTE_EVENTPROCESSINGMODE).setCategory("General").setPropertyEditorClass(ProcessingMode.class);
		addProperty("synchro").setCategory("General");
	}
}	
