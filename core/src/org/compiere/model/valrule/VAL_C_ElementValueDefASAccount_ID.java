package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_ElementValueDefASAccount_ID implements ValRule 
{
 	@XendraValRule(Name="C_ElementValue Def.AS Account_ID",
		AD_Val_Rule_ID=122,
		Description="Default Accounting Schema",
		Type="S",
		EntityType="D",
		Identifier="c40abe5d-8b9b-8737-44a1-f6ceab05c3bd",
		Synchronized="2012-01-17 10:34:31.0")
	public static final String Identifier = "c40abe5d-8b9b-8737-44a1-f6ceab05c3bd";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("C_ElementValue.C_Element_ID IN ");
	sb.append("(SELECT C_Element_ID FROM C_AcctSchema_Element  WHERE C_AcctSchema_ID=@$C_AcctSchema_ID@ AND ElementType='AC')");
	return sb.toString();
}
}
