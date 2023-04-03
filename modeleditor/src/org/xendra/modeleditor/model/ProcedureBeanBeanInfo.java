package org.xendra.modeleditor.model;

import org.compiere.model.MFunction;
import org.compiere.model.persistence.X_AD_Function;

import com.l2fprod.common.beans.BaseBeanInfo;

public class ProcedureBeanBeanInfo extends BaseBeanInfo {
	public ProcedureBeanBeanInfo() {
		super(ProcedureBean.class);
		addProperty(X_AD_Function.COLUMNNAME_Name).setCategory("General");
		addProperty(X_AD_Function.COLUMNNAME_Comments).setCategory("General");
		addProperty(X_AD_Function.COLUMNNAME_Output).setCategory("General");
		addProperty(X_AD_Function.COLUMNNAME_Owner).setCategory("General");
		addProperty(X_AD_Function.COLUMNNAME_Language).setCategory("General");
		addProperty(X_AD_Function.COLUMNNAME_Arguments).setCategory("General");
		addProperty(X_AD_Function.COLUMNNAME_Code).setCategory("General");
		addProperty(X_AD_Function.COLUMNNAME_Synchronized).setCategory("General");
		addProperty(MFunction.COLUMNNAME_Identifier).setCategory("General");
	}
}
