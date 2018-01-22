package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_DocTypePO implements ValRule 
{
 	@XendraValRule(Name="C_DocType PO ",
		AD_Val_Rule_ID=206,
		Description="Document Tpe for purchase orders",
		Type="S",
		EntityType="D",
		Identifier="80cf0380-0180-036f-04f3-c7aac4d5a5bb",
		Synchronized="2012-09-19 17:23:37.0")
	public static final String Identifier = "80cf0380-0180-036f-04f3-c7aac4d5a5bb";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("C_DocType.DocBaseType='POO'");
	return sb.toString();
}
}
