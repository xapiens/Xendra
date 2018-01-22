package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_DocTypeSO implements ValRule 
{
 	@XendraValRule(Name="C_DocType SO",
		AD_Val_Rule_ID=207,
		Description="Document Tpe for sales orders",
		Type="S",
		EntityType="D",
		Identifier="0785f4b6-808a-aff3-1298-78656b038446",
		Synchronized="2012-01-17 10:35:21.0")
	public static final String Identifier = "0785f4b6-808a-aff3-1298-78656b038446";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("C_DocType.DocBaseType='SOO'");
	return sb.toString();
}
}
