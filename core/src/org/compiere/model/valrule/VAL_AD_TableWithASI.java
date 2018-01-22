package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_AD_TableWithASI implements ValRule 
{
 	@XendraValRule(Name="AD_Table with ASI",
		AD_Val_Rule_ID=239,
		Description="Tables with updateable column Attribute Set Instance",
		Type="S",
		EntityType="D",
		Identifier="06bca08f-53c7-71de-fdf9-9f713ddda6a4",
		Synchronized="2012-01-17 10:35:43.0")
	public static final String Identifier = "06bca08f-53c7-71de-fdf9-9f713ddda6a4";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("EXISTS (SELECT * FROM AD_Column c WHERE AD_Table.AD_Table_ID=c.AD_Table_ID  AND c.ColumnName='M_AttributeSetInstance_ID'  AND c.IsUpdateable='Y') AND AD_Table.IsView='N'");
	return sb.toString();
}
}
