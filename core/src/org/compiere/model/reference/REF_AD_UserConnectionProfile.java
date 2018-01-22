package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_AD_UserConnectionProfile implements Reference 
{
 	@XendraRefItem(Name="VPN",
		Value="V",
		Description="",
		Identifier="6a3f4bff-0c30-a670-fcac-31abde0f3e8d")
	/** VPN = V */
	public static final String VPN = "V";
	@XendraRefItem(Name="LAN",
		Value="L",
		Description="",
		Identifier="30f55c83-5f0f-5d7d-f190-17ec568cd349")
	/** LAN = L */
	public static final String LAN = "L";
	@XendraRefItem(Name="Terminal Server",
		Value="T",
		Description="",
		Identifier="ea5c98ee-287e-62c3-8076-23a30d154c65")
	/** Terminal Server = T */
	public static final String TerminalServer = "T";
	@XendraRefItem(Name="WAN",
		Value="W",
		Description="",
		Identifier="bfbed00e-3de6-0355-ed72-e7a8be5f285d")
	/** WAN = W */
	public static final String WAN = "W";
	@XendraRef(Name="AD_User ConnectionProfile",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="474037d5-3cef-9c8c-8e15-a0704cbfdc86")
	public static final String Identifier = "474037d5-3cef-9c8c-8e15-a0704cbfdc86";

}
