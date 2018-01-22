package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_ProjectLineOfProjectNotIssued implements ValRule 
{
 	@XendraValRule(Name="C_ProjectLine of Project not Issued",
		AD_Val_Rule_ID=175,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="f81ebc2b-4a0e-2844-b76d-bb6dd1dc7840",
		Synchronized="2012-09-19 17:23:37.0")
	public static final String Identifier = "f81ebc2b-4a0e-2844-b76d-bb6dd1dc7840";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("C_ProjectLine.C_Project_ID=@C_Project_ID@ AND C_ProjectLine.C_ProjectIssue_ID IS NULL");
	return sb.toString();
}
}
