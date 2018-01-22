package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_MachinePrinterOptions implements ValRule 
{
 	@XendraValRule(Name="Machine Printer Options",
		AD_Val_Rule_ID=1000026,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="e7648a4a-75c7-454d-81be-cb06accd3cd2",
		Synchronized="2016-07-08 07:57:14.243")
	public static final String Identifier = "e7648a4a-75c7-454d-81be-cb06accd3cd2";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("(EXISTS (SELECT * FROM A_Machine p ");
	sb.append("	WHERE A_MachinePrinter.A_Machine_ID=p.A_Machine_ID AND @A_MACHINE_ID@=p.A_Machine_ID))");
	return sb.toString();
}
}
