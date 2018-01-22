package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_ElementValueSumary implements ValRule 
{
 	@XendraValRule(Name="C_ElementValueSumary",
		AD_Val_Rule_ID=1000009,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="38eb6712-9420-d18c-e9b3-5812a7180c14",
		Synchronized="2012-09-19 17:23:37.0")
	public static final String Identifier = "38eb6712-9420-d18c-e9b3-5812a7180c14";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("EXISTS (SELECT * FROM C_AcctSchema_Element ae WHERE C_ElementValue.C_Element_ID=ae.C_Element_ID AND ae.ElementType='AC' AND ae.C_AcctSchema_ID=@C_AcctSchema_ID@) AND C_ElementValue.IsActive='Y' AND C_ElementValue.IsSummary='N'");
	return sb.toString();
}
}
