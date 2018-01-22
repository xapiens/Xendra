package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_AD_ClientTrxSecurityValidation implements ValRule 
{
 	@XendraValRule(Name="AD_Client Trx Security validation",
		AD_Val_Rule_ID=129,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="0eb528d2-4867-16b7-32fc-0fa55bdb42c6",
		Synchronized="2012-07-12 00:00:00.0")
	public static final String Identifier = "0eb528d2-4867-16b7-32fc-0fa55bdb42c6";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("AD_Client.AD_Client_ID <> 0");
	return sb.toString();
}
}
