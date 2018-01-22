package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_M_ProductOperationOfProduct implements ValRule 
{
 	@XendraValRule(Name="M_ProductOperation of Product",
		AD_Val_Rule_ID=223,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="9501a740-0981-4eb8-f484-e202cef6a216",
		Synchronized="2012-01-17 10:33:40.0")
	public static final String Identifier = "9501a740-0981-4eb8-f484-e202cef6a216";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("M_ProductOperation.M_Product_ID=@M_Product_ID@");
	return sb.toString();
}
}
