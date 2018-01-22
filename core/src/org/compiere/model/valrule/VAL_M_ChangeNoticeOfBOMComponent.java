package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_M_ChangeNoticeOfBOMComponent implements ValRule 
{
 	@XendraValRule(Name="M_ChangeNotice of BOM Component",
		AD_Val_Rule_ID=225,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="84c50ceb-3e0a-0b39-96e8-ecc476add07b",
		Synchronized="2012-01-17 10:33:40.0")
	public static final String Identifier = "84c50ceb-3e0a-0b39-96e8-ecc476add07b";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("EXISTS (SELECT * FROM M_BOM b WHERE b.M_Product_ID=@M_ProductBOM_ID@ AND b.M_ChangeNotice_ID=M_ChangeNotice.M_ChangeNotice_ID)");
	return sb.toString();
}
}
