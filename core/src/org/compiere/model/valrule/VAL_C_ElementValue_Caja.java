package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_ElementValue_Caja implements ValRule 
{
 	@XendraValRule(Name="C_ElementValue_Caja",
		AD_Val_Rule_ID=1000011,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="feae4d00-c7ae-4f57-a7fb-a32b751cf3af",
		Synchronized="2015-07-22 09:30:48.0")
	public static final String Identifier = "feae4d00-c7ae-4f57-a7fb-a32b751cf3af";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("EXISTS (SELECT * FROM C_AcctSchema_Element ae WHERE 	C_ElementValue.C_Element_ID=ae.C_Element_ID AND ae.ElementType='AC' AND 	ae.C_AcctSchema_ID=@C_AcctSchema_ID@) AND C_ElementValue.IsActive='Y' AND 	C_ElementValue.IsSummary='N' AND C_ElementValue.Value like '10%' AND 	C_ElementValue.IsBankAccount='N'");
	return sb.toString();
}
}
