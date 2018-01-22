package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_ElementValueASAccount_IDActive implements ValRule 
{
 	@XendraValRule(Name="C_ElementValue AS Account_ID (active)",
		AD_Val_Rule_ID=252,
		Description="Selected Accounting Schema",
		Type="S",
		EntityType="D",
		Identifier="2f455adf-339e-7ef0-6b19-0a540bcca416",
		Synchronized="2012-01-17 10:35:27.0")
	public static final String Identifier = "2f455adf-339e-7ef0-6b19-0a540bcca416";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("EXISTS (SELECT * FROM C_AcctSchema_Element ae WHERE C_ElementValue.C_Element_ID=ae.C_Element_ID AND ae.ElementType='AC' AND ae.C_AcctSchema_ID=@C_AcctSchema_ID@) AND C_ElementValue.IsActive='Y'");
	return sb.toString();
}
}
