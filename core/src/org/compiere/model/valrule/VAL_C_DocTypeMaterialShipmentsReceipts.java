package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_DocTypeMaterialShipmentsReceipts implements ValRule 
{
 	@XendraValRule(Name="C_DocType Material Shipments/Receipts",
		AD_Val_Rule_ID=125,
		Description="Document Type Material Shipments and Receipts",
		Type="S",
		EntityType="D",
		Identifier="dd6fc25f-c92c-fb01-6714-8c13e0ee2cde",
		Synchronized="2012-01-17 10:35:08.0")
	public static final String Identifier = "dd6fc25f-c92c-fb01-6714-8c13e0ee2cde";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("C_DocType.DocBaseType IN ('MMR', 'MMS', 'MMV','MMC')");
	return sb.toString();
}
}
