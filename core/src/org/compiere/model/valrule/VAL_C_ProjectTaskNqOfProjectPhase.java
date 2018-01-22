package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_ProjectTaskNqOfProjectPhase implements ValRule 
{
 	@XendraValRule(Name="C_ProjectTask (nq) of ProjectPhase",
		AD_Val_Rule_ID=263,
		Description="Not qualified",
		Type="S",
		EntityType="D",
		Identifier="53906434-74e2-0844-02ba-0367c21ac60c",
		Synchronized="2012-01-17 10:35:37.0")
	public static final String Identifier = "53906434-74e2-0844-02ba-0367c21ac60c";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("C_ProjectPhase_ID=@C_ProjectPhase_ID@");
	return sb.toString();
}
}
