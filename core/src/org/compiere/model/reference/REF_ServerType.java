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
	@XendraRefItem(Name="Xendrian Server",
		Value="XS",
		Description="",
		Identifier="407ea95c-ff6c-46e7-9315-50f6c56a4138")
	/** Xendrian Server = XS */
	public static final String XendrianServer = "XS";
	@XendraRefItem(Name="Replication Server",
		Value="RR",
		Description="",
		Identifier="31952b79-5156-403b-bd90-8ff9cacc0646")
	/** Replication Server = RR */
	public static final String ReplicationServer = "RR";
	@XendraRefItem(Name="Material Server",
		Value="MM",
		Description="",
		Identifier="62df232f-46e8-4966-93c2-eeb688e156aa")
	/** Material Server = MM */
	public static final String MaterialServer = "MM";
	@XendraRefItem(Name="Transference Server",
		Value="TR",
		Description="",
		Identifier="26d7df0a-48c6-4c7c-8041-64ab122d1f98")
	/** Transference Server = TR */
	public static final String TransferenceServer = "TR";
	@XendraRef(Name="Server Type",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2017-05-21 16:59:35.626",
		Extension="",
		Identifier="a8ab0df9-7482-42bb-877a-13029372964f")
	public static final String Identifier = "a8ab0df9-7482-42bb-877a-13029372964f";

}
