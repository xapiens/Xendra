package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_UOMProductOptionsBonificacion implements ValRule 
{
 	@XendraValRule(Name="C_UOM Product Options bonificacion",
		AD_Val_Rule_ID=1000016,
		Description="",
		Type="S",
		EntityType="U",
		Identifier="8bb3c8c7-5dc5-4f67-969b-6408e26b7176",
		Synchronized="2015-07-22 09:30:48.0")
	public static final String Identifier = "8bb3c8c7-5dc5-4f67-969b-6408e26b7176";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("(EXISTS (SELECT * FROM C_UOM uu WHERE C_UOM.C_UOM_ID=uu.C_UOM_ID AND IsDefault='Y' AND @$M_Product_ID@=0)");
	sb.append("OR EXISTS (SELECT * FROM M_Product p WHERE C_UOM.C_UOM_ID=p.C_UOM_ID AND @M_Product_ID@=p.M_Product_ID)");
	sb.append("OR EXISTS (SELECT * FROM M_Product p INNER JOIN C_UOM_Conversion c ON (p.C_UOM_ID=c.C_UOM_ID AND p.M_Product_ID=c.M_Product_ID) WHERE C_UOM.C_UOM_ID=c.C_UOM_TO_ID AND @M_Product_ID@=p.M_Product_ID))");
	return sb.toString();
}
}
