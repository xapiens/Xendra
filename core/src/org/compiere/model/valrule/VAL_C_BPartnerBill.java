package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_BPartnerBill implements ValRule 
{
 	@XendraValRule(Name="C_BPartner Bill",
		AD_Val_Rule_ID=192,
		Description="Ship BP - or - all if not SO - or - Related BP",
		Type="S",
		EntityType="D",
		Identifier="415cb456-38aa-1ff7-d8b8-e6d00b4a73ae",
		Synchronized="2012-01-17 10:33:38.0")
	public static final String Identifier = "415cb456-38aa-1ff7-d8b8-e6d00b4a73ae";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("C_BPartner.IsSummary='N'  AND (C_BPartner.C_BPartner_ID=@C_BPartner_ID@");
	sb.append("OR EXISTS (SELECT * FROM C_BP_Relation r WHERE C_BPartner.C_BPartner_ID=r.C_BPartnerRelation_ID ");
	sb.append("AND r.C_BPartner_ID=@C_BPartner_ID@ AND r.IsBillTo='Y'))");
	return sb.toString();
}
}
