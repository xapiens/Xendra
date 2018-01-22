package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_M_PriceListBase implements ValRule 
{
 	@XendraValRule(Name="M_PriceList Base",
		AD_Val_Rule_ID=132,
		Description="Base Pricelists need to have same currency",
		Type="S",
		EntityType="D",
		Identifier="c4d39c49-c115-f950-dd1c-74ac50b224bd",
		Synchronized="2012-01-17 10:34:43.0")
	public static final String Identifier = "c4d39c49-c115-f950-dd1c-74ac50b224bd";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("M_PriceList.C_Currency_ID=@C_Currency_ID@");
	return sb.toString();
}
}
