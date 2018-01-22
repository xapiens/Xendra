package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_AD_ClientAutoArchive implements Reference 
{
 	@XendraRefItem(Name="None",
		Value="N",
		Description="",
		Identifier="f020143e-13b4-fcc7-1045-58366f3478c6")
	/** None = N */
	public static final String None = "N";
	@XendraRefItem(Name="All (Reports, Documents)",
		Value="1",
		Description="",
		Identifier="7642837c-1cfc-fa5e-02e6-4692637c37fb")
	/** All (Reports, Documents) = 1 */
	public static final String AllReportsDocuments = "1";
	@XendraRefItem(Name="Documents",
		Value="2",
		Description="",
		Identifier="d4bea1b6-9d4b-a3e5-284b-2e82f9175969")
	/** Documents = 2 */
	public static final String Documents = "2";
	@XendraRefItem(Name="External Documents",
		Value="3",
		Description="",
		Identifier="637d4cc2-a05c-57b8-80e5-d7fbbb37b210")
	/** External Documents = 3 */
	public static final String ExternalDocuments = "3";
	@XendraRef(Name="AD_Client AutoArchive",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="7c64cce5-d006-536a-f6ff-cd5b5852d0aa")
	public static final String Identifier = "7c64cce5-d006-536a-f6ff-cd5b5852d0aa";

}
