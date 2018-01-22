package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_OrderLineOfOrder implements ValRule 
{
 	@XendraValRule(Name="C_OrderLine of Order",
		AD_Val_Rule_ID=203,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="b27829f4-05b7-228b-deee-80c566a951f4",
		Synchronized="2012-01-17 10:35:24.0")
	public static final String Identifier = "b27829f4-05b7-228b-deee-80c566a951f4";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("C_OrderLine.C_Order_ID=@C_Order_ID@");
	return sb.toString();
}
}
