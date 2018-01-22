package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_DocTypeRequisition implements ValRule 
{
 	@XendraValRule(Name="C_DocType Requisition",
		AD_Val_Rule_ID=259,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="f897b6e2-5b91-fa67-a18b-528694a66000",
		Synchronized="2012-01-17 10:34:09.0")
	public static final String Identifier = "f897b6e2-5b91-fa67-a18b-528694a66000";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("C_DocType.DocBaseType = 'POR'");
	return sb.toString();
}
}
