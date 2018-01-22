package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_DocTypeMaterialInventory implements ValRule 
{
 	@XendraValRule(Name="C_DocType Material Inventory",
		AD_Val_Rule_ID=209,
		Description="Document Type Physical Inventory",
		Type="S",
		EntityType="D",
		Identifier="1fa9d307-259c-57fb-38a4-ee982d81be31",
		Synchronized="2012-01-17 10:35:24.0")
	public static final String Identifier = "1fa9d307-259c-57fb-38a4-ee982d81be31";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("C_DocType.DocBaseType='MMI'");
	return sb.toString();
}
}
