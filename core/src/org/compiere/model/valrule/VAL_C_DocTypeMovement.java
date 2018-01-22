package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_DocTypeMovement implements ValRule 
{
 	@XendraValRule(Name="C_DocType Movement",
		AD_Val_Rule_ID=201,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="715d788b-8fd0-aeef-92fb-c287a525d0e2",
		Synchronized="2012-01-17 10:34:18.0")
	public static final String Identifier = "715d788b-8fd0-aeef-92fb-c287a525d0e2";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("C_DocType.DocBaseType='MMM'");
	return sb.toString();
}
}
