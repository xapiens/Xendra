package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_M_InOutReceipts implements ValRule 
{
 	@XendraValRule(Name="M_InOut Receipts",
		AD_Val_Rule_ID=233,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="282a7dd4-c219-6d9c-8540-9cd810db9dc6",
		Synchronized="2012-01-17 10:34:54.0")
	public static final String Identifier = "282a7dd4-c219-6d9c-8540-9cd810db9dc6";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("M_InOut.IsSOTrx='N'");
	return sb.toString();
}
}
