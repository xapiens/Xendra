package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_DocTypeMaterialDifference implements ValRule 
{
 	@XendraValRule(Name="C_DocType Material Difference",
		AD_Val_Rule_ID=204,
		Description="Document Type Material Shipments and Receipts for Split Differnce",
		Type="S",
		EntityType="D",
		Identifier="866fc58e-64cf-49ec-1bca-67fbef3f5cc0",
		Synchronized="2012-01-17 10:35:08.0")
	public static final String Identifier = "866fc58e-64cf-49ec-1bca-67fbef3f5cc0";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("C_DocType.DocBaseType='@DocBaseType@'");
	return sb.toString();
}
}
