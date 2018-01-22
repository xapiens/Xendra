package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_DocTypeOrders implements ValRule 
{
 	@XendraValRule(Name="C_DocType Orders",
		AD_Val_Rule_ID=172,
		Description="Document Tpe for SO+PO ",
		Type="S",
		EntityType="D",
		Identifier="c413f4f5-83b1-ead3-73ab-5dce071e3c20",
		Synchronized="2012-01-17 10:34:47.0")
	public static final String Identifier = "c413f4f5-83b1-ead3-73ab-5dce071e3c20";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("C_DocType.DocBaseType IN ('SOO', 'POO')");
	return sb.toString();
}
}
