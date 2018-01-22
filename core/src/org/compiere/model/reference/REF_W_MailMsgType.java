package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_W_MailMsgType implements Reference 
{
 	@XendraRefItem(Name="Subscribe",
		Value="LS",
		Description="",
		Identifier="f22c6dd7-56cf-a41c-161d-5c61d834e711")
	/** Subscribe = LS */
	public static final String Subscribe = "LS";
	@XendraRefItem(Name="UnSubscribe",
		Value="LU",
		Description="",
		Identifier="405801ce-f6de-7558-50e1-9068c18ad788")
	/** UnSubscribe = LU */
	public static final String UnSubscribe = "LU";
	@XendraRefItem(Name="User Account",
		Value="UA",
		Description="",
		Identifier="ed8f8e8f-de4f-7592-3005-e0118b2b4020")
	/** User Account = UA */
	public static final String UserAccount = "UA";
	@XendraRefItem(Name="Request",
		Value="WR",
		Description="",
		Identifier="9bb8d008-2c6d-6f25-020c-771938c3fa66")
	/** Request = WR */
	public static final String Request = "WR";
	@XendraRefItem(Name="Order Acknowledgement",
		Value="OA",
		Description="",
		Identifier="e08201a2-d24c-8f0d-8d0d-e095a34d9c0c")
	/** Order Acknowledgement = OA */
	public static final String OrderAcknowledgement = "OA";
	@XendraRefItem(Name="Payment Acknowledgement",
		Value="PA",
		Description="",
		Identifier="71a88bb1-fe2c-401c-615f-09f1e3cdf966")
	/** Payment Acknowledgement = PA */
	public static final String PaymentAcknowledgement = "PA";
	@XendraRefItem(Name="Payment Error",
		Value="PE",
		Description="",
		Identifier="458606ac-3b31-c7d7-819d-e2b0b60bbd68")
	/** Payment Error = PE */
	public static final String PaymentError = "PE";
	@XendraRefItem(Name="User Verification",
		Value="UV",
		Description="",
		Identifier="df089c3f-b385-7e31-1d08-7d0d71509932")
	/** User Verification = UV */
	public static final String UserVerification = "UV";
	@XendraRefItem(Name="User Password",
		Value="UP",
		Description="",
		Identifier="19e6649d-066b-4606-8f38-2b64ca8ac503")
	/** User Password = UP */
	public static final String UserPassword = "UP";
	@XendraRef(Name="W_MailMsg Type",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="738f4b78-ea64-b3f0-1d8f-e975090d8848")
	public static final String Identifier = "738f4b78-ea64-b3f0-1d8f-e975090d8848";

}
