package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_M_WarehouseOrg implements ValRule 
{
 	@XendraValRule(Name="M_Warehouse Org",
		AD_Val_Rule_ID=189,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="04acc0b0-f57d-0e15-af5b-80249f6e7906",
		Synchronized="2012-01-17 10:35:25.0")
	public static final String Identifier = "04acc0b0-f57d-0e15-af5b-80249f6e7906";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("M_Warehouse.AD_Org_ID=@AD_Org_ID@");
	return sb.toString();
}
}
