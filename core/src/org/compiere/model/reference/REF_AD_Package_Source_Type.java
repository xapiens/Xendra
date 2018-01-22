package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_AD_Package_Source_Type implements Reference 
{
 	@XendraRefItem(Name="File",
		Value="File",
		Description="Package is file based",
		Identifier="e4edfe19-0206-148d-21fe-357578ddcad9")
	/** File = File */
	public static final String File = "File";
	@XendraRefItem(Name="WebService",
		Value="WS",
		Description="Package is available via WebService",
		Identifier="605e2078-153a-fb77-d92a-668bcd2dc4b5")
	/** WebService = WS */
	public static final String WebService = "WS";
	@XendraRef(Name="AD_Package_Source_Type",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="List of package source types",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="cc2dcf4b-6782-1ded-f505-0964c16d83bf")
	public static final String Identifier = "cc2dcf4b-6782-1ded-f505-0964c16d83bf";

}
