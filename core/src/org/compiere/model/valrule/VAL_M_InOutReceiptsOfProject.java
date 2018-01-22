package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_M_InOutReceiptsOfProject implements ValRule 
{
 	@XendraValRule(Name="M_InOut Receipts of Project",
		AD_Val_Rule_ID=178,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="68ed1db0-d8a8-489d-68f7-24376550e553",
		Synchronized="2012-09-19 17:23:37.0")
	public static final String Identifier = "68ed1db0-d8a8-489d-68f7-24376550e553";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("(M_InOut.C_Project_ID IS NULL OR M_InOut.C_Project_ID=@C_Project_ID@) AND M_InOut.Processed='Y' AND M_InOut.IsSOTrx='N'");
	return sb.toString();
}
}
