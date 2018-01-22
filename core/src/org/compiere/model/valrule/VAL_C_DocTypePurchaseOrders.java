package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_DocTypePurchaseOrders implements ValRule 
{
 	@XendraValRule(Name="C_DocType Purchase Orders",
		AD_Val_Rule_ID=1000007,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="414bc984-a505-7a92-1bb2-cb6bbdf3fb10",
		Synchronized="2012-01-17 10:33:52.0")
	public static final String Identifier = "414bc984-a505-7a92-1bb2-cb6bbdf3fb10";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("C_DocType.DocBaseType IN ('SOO', 'POO') AND C_DocType.IsSOTrx='@IsSOTrx@'");
	return sb.toString();
}
}
