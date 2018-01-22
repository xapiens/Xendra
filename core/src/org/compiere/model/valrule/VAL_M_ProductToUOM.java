package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_M_ProductToUOM implements ValRule 
{
 	@XendraValRule(Name="M_Product To UOM",
		AD_Val_Rule_ID=216,
		Description="Product with UOM Relation",
		Type="S",
		EntityType="D",
		Identifier="83bf206e-05af-c117-3914-eacd96b20477",
		Synchronized="2012-09-19 17:23:37.0")
	public static final String Identifier = "83bf206e-05af-c117-3914-eacd96b20477";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("M_Product.IsSummary='N' AND EXISTS (SELECT * FROM M_Product pp WHERE pp.M_Product_ID=@M_Product_ID@ AND EXISTS (SELECT * FROM C_UOM_Conversion c WHERE M_Product.C_UOM_ID=c.C_UOM_To_ID AND pp.C_UOM_ID=c.C_UOM_ID) )");
	return sb.toString();
}
}
