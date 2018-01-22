package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_AD_PrintGraphType implements Reference 
{
 	@XendraRefItem(Name="Pie Chart",
		Value="P",
		Description="",
		Identifier="bdf9476f-b7f8-6b35-6f76-418508d241f7")
	/** Pie Chart = P */
	public static final String PieChart = "P";
	@XendraRefItem(Name="Line Chart",
		Value="L",
		Description="",
		Identifier="2874a414-8a68-0c54-305b-926b0590361a")
	/** Line Chart = L */
	public static final String LineChart = "L";
	@XendraRefItem(Name="Bar Chart",
		Value="B",
		Description="",
		Identifier="02afa9d0-9b44-faa4-ba13-94268fdcae33")
	/** Bar Chart = B */
	public static final String BarChart = "B";
	@XendraRef(Name="AD_Print Graph Type",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="f1311cf5-4684-8892-1973-42da3caae6f9")
	public static final String Identifier = "f1311cf5-4684-8892-1973-42da3caae6f9";

}
