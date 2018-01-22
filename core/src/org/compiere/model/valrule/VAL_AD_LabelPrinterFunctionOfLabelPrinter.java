package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_AD_LabelPrinterFunctionOfLabelPrinter implements ValRule 
{
 	@XendraValRule(Name="AD_LabelPrinterFunction of LabelPrinter",
		AD_Val_Rule_ID=182,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="d058de22-5420-c76d-9c1b-41c5a6de8c85",
		Synchronized="2012-01-17 10:35:29.0")
	public static final String Identifier = "d058de22-5420-c76d-9c1b-41c5a6de8c85";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("AD_LabelPrinterFunction.AD_LabelPrinter_ID=@AD_LabelPrinter_ID@");
	return sb.toString();
}
}
