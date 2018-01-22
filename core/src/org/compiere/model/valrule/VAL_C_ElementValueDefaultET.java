package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_ElementValueDefaultET implements ValRule 
{
 	@XendraValRule(Name="C_ElementValue Default ET",
		AD_Val_Rule_ID=258,
		Description="Default Accounting Schema - Record contains ElementType",
		Type="S",
		EntityType="D",
		Identifier="5fb736b0-241b-e452-6294-10968baddd7c",
		Synchronized="2012-01-17 10:34:49.0")
	public static final String Identifier = "5fb736b0-241b-e452-6294-10968baddd7c";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("C_ElementValue.C_Element_ID IN ");
	sb.append("(SELECT C_Element_ID FROM C_AcctSchema_Element  WHERE C_AcctSchema_ID=@$C_AcctSchema_ID@ AND ElementType='@ElementType@')");
	return sb.toString();
}
}
