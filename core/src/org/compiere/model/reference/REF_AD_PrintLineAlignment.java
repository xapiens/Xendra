package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_AD_PrintLineAlignment implements Reference 
{
 	@XendraRefItem(Name="None",
		Value="X",
		Description="",
		Identifier="0e678c50-e7f6-d66c-ae68-601225ee0515")
	/** None = X */
	public static final String None = "X";
	@XendraRefItem(Name="Leading (left)",
		Value="L",
		Description="",
		Identifier="18f1c9f1-6dbb-7d90-04b3-b0719bb95579")
	/** Leading (left) = L */
	public static final String LeadingLeft = "L";
	@XendraRefItem(Name="Center",
		Value="C",
		Description="",
		Identifier="3e5c89ec-fc2a-618b-2d73-8eecf73db4e8")
	/** Center = C */
	public static final String Center = "C";
	@XendraRefItem(Name="Trailing (right)",
		Value="T",
		Description="",
		Identifier="bb5334d2-c569-3b87-ad48-b86e2ceb3267")
	/** Trailing (right) = T */
	public static final String TrailingRight = "T";
	@XendraRef(Name="AD_Print Line Alignment",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="58707b2f-9b1e-53e8-780d-9283d9b20f7c")
	public static final String Identifier = "58707b2f-9b1e-53e8-780d-9283d9b20f7c";

}
