package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_BPartnerTrx implements ValRule 
{
 	@XendraValRule(Name="C_BPartner (Trx)",
		AD_Val_Rule_ID=230,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="06fdbbe9-e1c4-3ee4-4a9d-73d1a990cc42",
		Synchronized="2012-01-17 10:35:42.0")
	public static final String Identifier = "06fdbbe9-e1c4-3ee4-4a9d-73d1a990cc42";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("C_BPartner.IsActive='Y' AND C_BPartner.IsSummary='N'");
	return sb.toString();
}
}
