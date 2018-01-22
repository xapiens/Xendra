package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_AD_SysConfigConfigurationLevel implements Reference 
{
 	@XendraRefItem(Name="Client",
		Value="C",
		Description="Allowed system and client configuration",
		Identifier="314e2c52-b082-0dc3-1323-06df7f35ebe4")
	/** Client = C */
	public static final String Client = "C";
	@XendraRefItem(Name="Organization",
		Value="O",
		Description="Allowed system, client and organization configuration",
		Identifier="36b58fe6-0df9-c011-5e53-ad347958032e")
	/** Organization = O */
	public static final String Organization = "O";
	@XendraRefItem(Name="System",
		Value="S",
		Description="Just allowed system configuration",
		Identifier="7ab9edb5-6935-396c-b935-4e041fb5f1f9")
	/** System = S */
	public static final String System = "S";
	@XendraRef(Name="AD_SysConfig ConfigurationLevel",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="Configuration Level",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="457c7edc-dcc7-84ca-cff6-775cac78f43e")
	public static final String Identifier = "457c7edc-dcc7-84ca-cff6-775cac78f43e";

}
