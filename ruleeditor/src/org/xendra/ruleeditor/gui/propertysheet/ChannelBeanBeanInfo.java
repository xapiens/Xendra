package org.xendra.ruleeditor.gui.propertysheet;

import org.compiere.model.persistence.X_AD_MessageFormat;
import org.xendra.Constants;
import org.xendra.ruleeditor.gui.propertysheet.PropertySheetPage.MessageFormatEditor;

import com.l2fprod.common.beans.BaseBeanInfo;

public class ChannelBeanBeanInfo extends BaseBeanInfo {
	public ChannelBeanBeanInfo() {
		super(ChannelBean.class);
		addProperty("name").setCategory("General");
		addProperty(X_AD_MessageFormat.COLUMNNAME_AD_MessageFormat_ID).setCategory("General")
		.setPropertyEditorClass(MessageFormatEditor.class);
		addProperty(Constants.XML_ATTRIBUTE_SESSIONNAME).setCategory("General");
	}

}
