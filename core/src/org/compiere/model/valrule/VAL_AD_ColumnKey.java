package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_AD_ColumnKey implements ValRule 
{
 	@XendraValRule(Name="AD_Column Key",
		AD_Val_Rule_ID=254,
		Description="Key Columns",
		Type="S",
		EntityType="D",
		Identifier="eca0a2af-aff7-ae4b-93e6-78f917fed31a",
		Synchronized="2012-01-17 10:34:04.0")
	public static final String Identifier = "eca0a2af-aff7-ae4b-93e6-78f917fed31a";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("AD_Column.IsKey='Y' AND AD_Column.IsActive='Y'");
	return sb.toString();
}
}
