package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_AcctSchemaValidation implements ValRule 
{
 	@XendraValRule(Name="C_AcctSchema validation",
		AD_Val_Rule_ID=106,
		Description="Validated AcctSchema (Client)",
		Type="S",
		EntityType="D",
		Identifier="9565d178-55f8-482e-8634-8d71bf23a262",
		Synchronized="2015-07-22 09:30:47.0")
	public static final String Identifier = "9565d178-55f8-482e-8634-8d71bf23a262";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("C_AcctSchema.AD_Client_ID=@AD_Client_ID@");
	return sb.toString();
}
}
