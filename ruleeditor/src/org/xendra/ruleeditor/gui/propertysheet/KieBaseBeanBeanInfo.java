package org.xendra.ruleeditor.gui.propertysheet;

import org.compiere.model.persistence.X_AD_Process;
import org.compiere.model.persistence.X_AD_Rule;
import org.xendra.Constants;
import org.xendra.ruleeditor.gui.propertysheet.PropertySheetPage.BehaviorEditor;
import org.xendra.ruleeditor.gui.propertysheet.PropertySheetPage.DocBaseTypeEditor;
import org.xendra.ruleeditor.gui.propertysheet.PropertySheetPage.DocSubTypeEditor;
import org.xendra.ruleeditor.gui.propertysheet.PropertySheetPage.GroupEditor;
import org.xendra.ruleeditor.gui.propertysheet.PropertySheetPage.ProcessingMode;
import org.xendra.ruleeditor.gui.propertysheet.PropertySheetPage.RuleTypeEditor;

import com.l2fprod.common.beans.BaseBeanInfo;

public class KieBaseBeanBeanInfo extends BaseBeanInfo {
	public KieBaseBeanBeanInfo() {
		super(KieBaseBean.class);
		addProperty(Constants.XML_ATTRIBUTE_CATEGORY).setCategory("General");
		addProperty(Constants.XML_ATTRIBUTE_AGENDA).setCategory("General");
		addProperty("isdefault").setCategory("General");
		addProperty("packagename").setCategory("General");
		addProperty(Constants.XML_ATTRIBUTE_NAME).setCategory("General");
		addProperty(Constants.XML_ATTRIBUTE_SESSIONNAME).setCategory("General");
		addProperty(Constants.XML_ATTRIBUTE_QUEUENAME).setCategory("General");
		addProperty(X_AD_Process.COLUMNNAME_RuleType).setCategory("General")
			.setPropertyEditorClass(RuleTypeEditor.class);
		addProperty(Constants.XML_ATTRIBUTE_DOCBASETYPE).setCategory("Document")
			.setPropertyEditorClass(DocBaseTypeEditor.class);
		addProperty(Constants.XML_ATTRIBUTE_DOCSUBTYPE).setCategory("Document")
			.setPropertyEditorClass(DocSubTypeEditor.class);
		addProperty(Constants.XML_ATTRIBUTE_ENTRYPOINT).setCategory("RealTime");
		addProperty(Constants.XML_ATTRIBUTE_EQUALSBEHAVIOR).setCategory("General").setPropertyEditorClass(BehaviorEditor.class);
		addProperty(Constants.XML_ATTRIBUTE_QUEUELISTENERCLASS).setCategory("General");
		addProperty(Constants.XML_ATTRIBUTE_EVENTPROCESSINGMODE).setCategory("General").setPropertyEditorClass(ProcessingMode.class);
		addProperty(Constants.XML_ATTRIBUTE_GROUP).setCategory("General").setPropertyEditorClass(GroupEditor.class);
		addProperty("synchronize").setCategory("General");
		addProperty(X_AD_Rule.COLUMNNAME_Lockout).setCategory("General");
	}
}
