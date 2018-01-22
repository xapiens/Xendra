package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_ElementValueASAccount_ID implements ValRule 
{
 	@XendraValRule(Name="C_ElementValue AS Account_ID",
		AD_Val_Rule_ID=137,
		Description="Account based on AcctSchema",
		Type="S",
		EntityType="D",
		Identifier="4528dfb0-0d6a-4594-84e4-a4c00711e9c2",
		Synchronized="2015-07-22 09:30:48.0")
	public static final String Identifier = "4528dfb0-0d6a-4594-84e4-a4c00711e9c2";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("EXISTS (SELECT * FROM C_AcctSchema_Element ae WHERE C_ElementValue.C_Element_ID=ae.C_Element_ID AND ae.ElementType='AC' AND ae.C_AcctSchema_ID=@C_AcctSchema_ID@)");
	return sb.toString();
}
}
