package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_AD_ImpFormatFormatType implements Reference 
{
 	@XendraRefItem(Name="Comma Separated",
		Value="C",
		Description="",
		Identifier="6f892855-bae3-4bf3-203a-91c1792a1756")
	/** Comma Separated = C */
	public static final String CommaSeparated = "C";
	@XendraRefItem(Name="Tab Separated",
		Value="T",
		Description="",
		Identifier="61736d7b-8af2-310e-c0c9-a9d619471af6")
	/** Tab Separated = T */
	public static final String TabSeparated = "T";
	@XendraRefItem(Name="XML",
		Value="X",
		Description="",
		Identifier="8636ff83-cca0-f84d-65c7-842de4253362")
	/** XML = X */
	public static final String XML = "X";
	@XendraRefItem(Name="Fixed Position",
		Value="F",
		Description="",
		Identifier="7b88f87d-3d0e-77b5-02e4-c65087380252")
	/** Fixed Position = F */
	public static final String FixedPosition = "F";
	@XendraRef(Name="AD_ImpFormat FormatType",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="L",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="230ed9ba-8dc2-8494-a554-d81e665fc924")
	public static final String Identifier = "230ed9ba-8dc2-8494-a554-d81e665fc924";

}
