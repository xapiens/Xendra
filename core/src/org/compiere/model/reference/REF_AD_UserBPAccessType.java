package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_AD_UserBPAccessType implements Reference 
{
 	@XendraRefItem(Name="Business Documents",
		Value="B",
		Description="",
		Identifier="4972f614-57bd-50bf-3521-d8eeea622918")
	/** Business Documents = B */
	public static final String BusinessDocuments = "B";
	@XendraRefItem(Name="Requests",
		Value="R",
		Description="",
		Identifier="befbfb4b-aa00-b8dd-f986-2ddfe71106c3")
	/** Requests = R */
	public static final String Requests = "R";
	@XendraRefItem(Name="Assets, Download",
		Value="A",
		Description="",
		Identifier="6d828476-b563-f2b3-ab81-5a67f32b83e0")
	/** Assets, Download = A */
	public static final String AssetsDownload = "A";
	@XendraRef(Name="AD_User BP AccessType",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="b91997d1-0b55-305c-e3a9-787eb5f609e8")
	public static final String Identifier = "b91997d1-0b55-305c-e3a9-787eb5f609e8";

}
