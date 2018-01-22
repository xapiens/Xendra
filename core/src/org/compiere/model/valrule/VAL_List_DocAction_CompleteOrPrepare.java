package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_List_DocAction_CompleteOrPrepare implements ValRule 
{
 	@XendraValRule(Name="List - DocAction - Complete or Prepare",
		AD_Val_Rule_ID=219,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="3d654c9a-accb-f5d6-0b9b-a8cba1bc5414",
		Synchronized="2012-09-19 17:23:37.0")
	public static final String Identifier = "3d654c9a-accb-f5d6-0b9b-a8cba1bc5414";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("AD_Ref_List.Value IN ('CO','PR')");
	return sb.toString();
}
}
