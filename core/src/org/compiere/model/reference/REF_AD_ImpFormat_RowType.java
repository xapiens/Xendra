package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_AD_ImpFormat_RowType implements Reference 
{
 	@XendraRefItem(Name="String",
		Value="S",
		Description="",
		Identifier="2bbf1dd8-ab5d-b90f-8d34-836b7e0f5b8f")
	/** String = S */
	public static final String String = "S";
	@XendraRefItem(Name="Number",
		Value="N",
		Description="",
		Identifier="1a9b3db8-e3f1-5dcb-4c1e-add2a1b3c177")
	/** Number = N */
	public static final String Number = "N";
	@XendraRefItem(Name="Date",
		Value="D",
		Description="",
		Identifier="b81dd042-c941-5c79-cb30-121773215e50")
	/** Date = D */
	public static final String Date = "D";
	@XendraRefItem(Name="Constant",
		Value="C",
		Description="",
		Identifier="851dde51-aa3b-1f7e-5f77-5724242652b7")
	/** Constant = C */
	public static final String Constant = "C";
	@XendraRef(Name="AD_ImpFormat_Row Type",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="L",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="581876b5-c8de-c960-e396-a6cb7c8d52a1")
	public static final String Identifier = "581876b5-c8de-c960-e396-a6cb7c8d52a1";

}
