package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_AccountsUser2 implements ValRule 
{
 	@XendraValRule(Name="C_Accounts User2",
		AD_Val_Rule_ID=139,
		Description="based on C_AcctSchema_ID",
		Type="S",
		EntityType="D",
		Identifier="4e086170-a6ca-53a8-ab04-5259dc6daa54",
		Synchronized="2012-01-17 10:35:28.0")
	public static final String Identifier = "4e086170-a6ca-53a8-ab04-5259dc6daa54";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("EXISTS (SELECT * FROM C_AcctSchema_Element ae WHERE C_ElementValue.C_Element_ID=ae.C_Element_ID AND ae.ElementType='U2' AND ae.C_AcctSchema_ID=@C_AcctSchema_ID@)");
	return sb.toString();
}
}
