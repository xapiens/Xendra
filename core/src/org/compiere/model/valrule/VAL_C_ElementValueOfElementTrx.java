package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_ElementValueOfElementTrx implements ValRule 
{
 	@XendraValRule(Name="C_ElementValue of Element (Trx)",
		AD_Val_Rule_ID=237,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="2e77b9a6-8702-c07f-5e59-ee69d0bb97ab",
		Synchronized="2012-01-17 10:34:04.0")
	public static final String Identifier = "2e77b9a6-8702-c07f-5e59-ee69d0bb97ab";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("C_ElementValue.C_Element_ID=@C_Element_ID@ AND C_ElementValue.IsActive='Y' AND C_ElementValue.IsSummary='N'");
	return sb.toString();
}
}
