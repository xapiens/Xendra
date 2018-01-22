package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_M_LotOfAttributeSetInstance implements ValRule 
{
 	@XendraValRule(Name="M_Lot of AttributeSetInstance",
		AD_Val_Rule_ID=184,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="b1d7408a-6943-bebd-cdad-3bb7d92bd74e",
		Synchronized="2012-01-17 10:34:31.0")
	public static final String Identifier = "b1d7408a-6943-bebd-cdad-3bb7d92bd74e";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("M_Lot.M_Product_ID IN ");
	sb.append("(SELECT M_Product_ID FROM M_Product WHERE M_AttributeSet_ID=@M_AttributeSet_ID@)");
	return sb.toString();
}
}
