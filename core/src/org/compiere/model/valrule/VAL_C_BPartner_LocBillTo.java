package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_BPartner_LocBillTo implements ValRule 
{
 	@XendraValRule(Name="C_BPartner_Loc BillTo",
		AD_Val_Rule_ID=200,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="3b3664f5-7792-d41b-d8c1-1ed3b015f0c1",
		Synchronized="2012-01-17 10:35:40.0")
	public static final String Identifier = "3b3664f5-7792-d41b-d8c1-1ed3b015f0c1";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("C_BPartner_Location.C_BPartner_ID=@C_BPartner_ID@ AND C_BPartner_Location.IsBillTo='Y' AND C_BPartner_Location.IsActive='Y'");
	return sb.toString();
}
}
