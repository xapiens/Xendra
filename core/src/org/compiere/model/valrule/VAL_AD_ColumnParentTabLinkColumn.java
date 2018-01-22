package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_AD_ColumnParentTabLinkColumn implements ValRule 
{
 	@XendraValRule(Name="AD_Column (Parent tab link column)",
		AD_Val_Rule_ID=52056,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="d736c9db-20af-3ddc-4fce-973e4186cd43",
		Synchronized="2012-01-17 10:35:10.0")
	public static final String Identifier = "d736c9db-20af-3ddc-4fce-973e4186cd43";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("/* attempt to get the columns in the parent tab");
	sb.append("table */");
	sb.append("AD_Column.AD_Table_ID IN (SELECT t.AD_Table_ID FROM AD_Tab t");
	sb.append("                                                  WHERE");
	sb.append("t.AD_Window_ID = @AD_Window_ID@");
	sb.append("                                AND t.TabLevel = @TabLevel@-1");
	sb.append("               AND t.SeqNo < @SeqNo@");
	sb.append("               AND NOT EXISTS (SELECT 1 FROM AD_Tab t2");
	sb.append("                                                     where");
	sb.append("t2.AD_Window_ID=t.AD_Window_ID");
	sb.append("                                                     AND t2.TabLevel");
	sb.append("= t.TabLevel");
	sb.append("               AND t2.SeqNo < @SeqNo@");
	sb.append("                                                    AND t2.SeqNo >");
	sb.append("t.SeqNo) )");
	return sb.toString();
}
}
