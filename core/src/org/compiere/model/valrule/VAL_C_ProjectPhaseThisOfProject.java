package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_ProjectPhaseThisOfProject implements ValRule 
{
 	@XendraValRule(Name="C_ProjectPhase (this) of Project",
		AD_Val_Rule_ID=165,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="da3e27d3-eb4b-f867-a599-6db31fbeddf1",
		Synchronized="2012-01-17 10:35:29.0")
	public static final String Identifier = "da3e27d3-eb4b-f867-a599-6db31fbeddf1";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("C_ProjectPhase.C_Project_ID=@C_Project_ID@");
	return sb.toString();
}
}
