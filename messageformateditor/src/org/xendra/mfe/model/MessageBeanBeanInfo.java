package org.xendra.mfe.model;


import org.compiere.model.persistence.X_AD_MessageFormat;

import com.l2fprod.common.beans.BaseBeanInfo;

public class MessageBeanBeanInfo extends BaseBeanInfo {
	public MessageBeanBeanInfo() {
		super(MessageBean.class);
		addProperty("name").setCategory("General");
		addProperty(X_AD_MessageFormat.COLUMNNAME_QueueName).setCategory("General");
		addProperty("lockout").setCategory("General");
	}
}
