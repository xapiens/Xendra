package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_AD_PrintLabelLineType implements Reference 
{
 	@XendraRefItem(Name="Field",
		Value="F",
		Description="",
		Identifier="4cecc1e4-80c2-1207-bae5-29491cb95c95")
	/** Field = F */
	public static final String Field = "F";
	@XendraRefItem(Name="Text",
		Value="T",
		Description="",
		Identifier="5a086a2a-dc31-7208-794b-d8af0972ae04")
	/** Text = T */
	public static final String Text = "T";
	@XendraRef(Name="AD_Print Label Line Type",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="15f6fee1-f96a-305c-8322-4fa07ae1266a")
	public static final String Identifier = "15f6fee1-f96a-305c-8322-4fa07ae1266a";

}
