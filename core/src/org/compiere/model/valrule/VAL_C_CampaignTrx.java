package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_CampaignTrx implements ValRule 
{
 	@XendraValRule(Name="C_Campaign (Trx)",
		AD_Val_Rule_ID=236,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="8e0d532d-2e55-9877-ef0b-a5950455e031",
		Synchronized="2012-01-17 10:35:37.0")
	public static final String Identifier = "8e0d532d-2e55-9877-ef0b-a5950455e031";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("C_Campaign.IsActive='Y' AND C_Campaign.IsSummary='N'");
	return sb.toString();
}
}
