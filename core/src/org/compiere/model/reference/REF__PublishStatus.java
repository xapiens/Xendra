package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF__PublishStatus implements Reference 
{
 	@XendraRefItem(Name="Released",
		Value="R",
		Description="",
		Identifier="05253b0f-21a8-c977-917b-e994ec25ccba")
	/** Released = R */
	public static final String Released = "R";
	@XendraRefItem(Name="Test",
		Value="T",
		Description="",
		Identifier="d2787662-cebc-b013-5d12-f7ac7d377983")
	/** Test = T */
	public static final String Test = "T";
	@XendraRefItem(Name="Under Revision",
		Value="U",
		Description="",
		Identifier="9ea98cb4-c975-1b04-8d62-7113a2d4f6fb")
	/** Under Revision = U */
	public static final String UnderRevision = "U";
	@XendraRefItem(Name="Void",
		Value="V",
		Description="",
		Identifier="61eae5e7-98a9-4dd4-9091-79816859a635")
	/** Void = V */
	public static final String Void = "V";
	@XendraRef(Name="_PublishStatus",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="Publication Status",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="500006fa-6215-9c7e-9fb1-23609093d16b")
	public static final String Identifier = "500006fa-6215-9c7e-9fb1-23609093d16b";

}
