package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_M_LocatorOfWarehouse implements ValRule 
{
 	@XendraValRule(Name="M_Locator of Warehouse",
		AD_Val_Rule_ID=127,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="67c484dc-284d-a4ad-b352-8a8b313f4190",
		Synchronized="2012-01-17 10:35:24.0")
	public static final String Identifier = "67c484dc-284d-a4ad-b352-8a8b313f4190";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("M_Locator.M_Warehouse_ID=@M_Warehouse_ID@");
	return sb.toString();
}
}
