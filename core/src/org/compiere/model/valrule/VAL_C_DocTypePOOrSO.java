package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_DocTypePOOrSO implements ValRule 
{
 	@XendraValRule(Name="C_DocType PO or SO",
		AD_Val_Rule_ID=133,
		Description="Document Tpe for orders",
		Type="S",
		EntityType="D",
		Identifier="7f96faec-0030-579b-d3ba-81411d3e1924",
		Synchronized="2012-01-17 10:33:39.0")
	public static final String Identifier = "7f96faec-0030-579b-d3ba-81411d3e1924";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("C_DocType.DocBaseType IN ('SOO', 'POO') AND C_DocType.IsSOTrx='@IsSOTrx@' AND (C_DocType.AD_Org_ID IN (SELECT AD_Org_ID FROM AD_Org WHERE AD_Org_ID=@AD_Org_ID@) OR C_DocType.AD_Org_ID =0)");
	return sb.toString();
}
}
