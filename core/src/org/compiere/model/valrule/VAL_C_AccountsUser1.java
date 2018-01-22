package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_AccountsUser1 implements ValRule 
{
 	@XendraValRule(Name="C_Accounts User1",
		AD_Val_Rule_ID=138,
		Description="based on C_AcctSchema_ID",
		Type="S",
		EntityType="D",
		Identifier="997febad-70ed-4f83-f0d4-a1dbf24bdcfa",
		Synchronized="2012-01-17 10:35:28.0")
	public static final String Identifier = "997febad-70ed-4f83-f0d4-a1dbf24bdcfa";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("EXISTS (SELECT * FROM C_AcctSchema_Element ae WHERE C_ElementValue.C_Element_ID=ae.C_Element_ID AND ae.ElementType='U1' AND ae.C_AcctSchema_ID=@C_AcctSchema_ID@)");
	return sb.toString();
}
}
