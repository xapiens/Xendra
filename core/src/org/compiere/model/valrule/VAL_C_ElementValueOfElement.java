package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_ElementValueOfElement implements ValRule 
{
 	@XendraValRule(Name="C_ElementValue of Element",
		AD_Val_Rule_ID=183,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="19695f17-9691-4d51-9ecd-4a886465dd3b",
		Synchronized="2015-07-22 09:30:47.0")
	public static final String Identifier = "19695f17-9691-4d51-9ecd-4a886465dd3b";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("C_ElementValue.C_Element_ID=@C_Element_ID@");
	return sb.toString();
}
}
