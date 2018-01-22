package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_ElementValueASET implements ValRule 
{
 	@XendraValRule(Name="C_ElementValue AS/ET",
		AD_Val_Rule_ID=253,
		Description="Current Accounting Schema - Record contains ElementType",
		Type="S",
		EntityType="D",
		Identifier="d49082d7-f1d7-405b-9ef5-2a69b1cb9262",
		Synchronized="2015-07-22 09:30:48.0")
	public static final String Identifier = "d49082d7-f1d7-405b-9ef5-2a69b1cb9262";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("C_ElementValue.C_Element_ID IN ");
	sb.append("(SELECT C_Element_ID FROM C_AcctSchema_Element  WHERE C_AcctSchema_ID=@C_AcctSchema_ID@ AND ElementType='@ElementType@')");
	return sb.toString();
}
}
