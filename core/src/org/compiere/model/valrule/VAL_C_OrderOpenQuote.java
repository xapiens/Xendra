package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_OrderOpenQuote implements ValRule 
{
 	@XendraValRule(Name="C_Order Open Quote",
		AD_Val_Rule_ID=179,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="f6f7270b-0ce8-db12-1057-6805e0e210e6",
		Synchronized="2012-09-19 17:23:37.0")
	public static final String Identifier = "f6f7270b-0ce8-db12-1057-6805e0e210e6";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("C_Order.DocStatus='IP' AND C_DocType_ID IN ");
	sb.append("(SELECT C_DocType_ID FROM C_DocType WHERE DocSubType IN ('OB','ON'))");
	return sb.toString();
}
}
