package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_ServerType implements Reference 
{
 	@XendraRefItem(Name="Web Server",
		Value="WW",
		Description="",
		Identifier="92588e2c-d562-4ca5-b802-abd385393c61")
	/** Web Server = WW */
	public static final String WebServer = "WW";
	@XendraRefItem(Name="Material Server",
		Value="MM",
		Description="",
		Identifier="62df232f-46e8-4966-93c2-eeb688e156aa")
	/** Material Server = MM */
	public static final String MaterialServer = "MM";
	@XendraRefItem(Name="Message Server",
		Value="MS",
		Description="",
		Identifier="939cd177-cb4e-4dff-8cb9-84bca56d1731")
	/** Message Server = MS */
	public static final String MessageServer = "MS";
	@XendraRefItem(Name="Replication Server",
		Value="RS",
		Description="",
		Identifier="ed0bf178-9657-4160-8579-0d3f96bc4171")
	/** Replication Server = RS */
	public static final String ReplicationServer = "RS";
	@XendraRef(Name="Server Type",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2018-08-22 23:45:40.869",
		Extension="",
		Identifier="a8ab0df9-7482-42bb-877a-13029372964f")
	public static final String Identifier = "a8ab0df9-7482-42bb-877a-13029372964f";

}
