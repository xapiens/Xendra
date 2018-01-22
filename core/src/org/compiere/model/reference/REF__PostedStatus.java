package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF__PostedStatus implements Reference 
{
 	@XendraRefItem(Name="Posting Error",
		Value="E",
		Description="",
		Identifier="36605707-f214-61c0-7e61-1732bbbd37a5")
	/** Posting Error = E */
	public static final String PostingError = "E";
	@XendraRefItem(Name="Not Posted",
		Value="N",
		Description="",
		Identifier="e6eb9ec0-bd25-792c-4d2f-4506086aefa1")
	/** Not Posted = N */
	public static final String NotPosted = "N";
	@XendraRefItem(Name="Posted",
		Value="Y",
		Description="",
		Identifier="5470e901-41d4-04e5-3bb2-4bd872223ea9")
	/** Posted = Y */
	public static final String Posted = "Y";
	@XendraRefItem(Name="Not Balanced",
		Value="b",
		Description="",
		Identifier="1c33521b-396c-87ba-15d1-7fc57558aa98")
	/** Not Balanced = b */
	public static final String NotBalanced = "b";
	@XendraRefItem(Name="Not Convertible (no rate)",
		Value="c",
		Description="",
		Identifier="4b732e89-8743-7f71-899b-22f745fc1f53")
	/** Not Convertible (no rate) = c */
	public static final String NotConvertibleNoRate = "c";
	@XendraRefItem(Name="Period Closed",
		Value="p",
		Description="",
		Identifier="a92caf70-856a-1423-57ff-88dd5f13be32")
	/** Period Closed = p */
	public static final String PeriodClosed = "p";
	@XendraRefItem(Name="Post Prepared",
		Value="y",
		Description="",
		Identifier="7a97fef6-22b2-4724-9e4f-a26c355c9a0f")
	/** Post Prepared = y */
	public static final String PostPrepared = "y";
	@XendraRefItem(Name="Invalid Account",
		Value="i",
		Description="",
		Identifier="c51604a4-5871-a1e2-68d8-f056f1f6cec0")
	/** Invalid Account = i */
	public static final String InvalidAccount = "i";
	@XendraRef(Name="_Posted Status",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="c",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="d2b659dd-6c8c-baf3-fc71-0ee997273154")
	public static final String Identifier = "d2b659dd-6c8c-baf3-fc71-0ee997273154";

}
