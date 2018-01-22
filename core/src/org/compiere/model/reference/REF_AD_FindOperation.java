package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_AD_FindOperation implements Reference 
{
 	@XendraRefItem(Name=" =",
		Value="==",
		Description="",
		Identifier="ccae32b2-9bee-27bb-ffa2-1ad3e0ec433e")
	/**  = = == */
	public static final String Eq = "==";
	@XendraRefItem(Name=">=",
		Value=">=",
		Description="",
		Identifier="e1e4ca35-2bc8-d189-5f38-207f9fbedf68")
	/** >= = >= */
	public static final String GtEq = ">=";
	@XendraRefItem(Name="!=",
		Value="!=",
		Description="",
		Identifier="5120fe4d-ae6f-621d-a84e-5a019ca77475")
	/** != = != */
	public static final String NotEq = "!=";
	@XendraRefItem(Name=">",
		Value=">>",
		Description="",
		Identifier="d0e0039d-102c-2864-7850-f2308ce60ce1")
	/** > = >> */
	public static final String Gt = ">>";
	@XendraRefItem(Name="<",
		Value="<<",
		Description="",
		Identifier="17af084d-2a12-0e54-e4b2-5c3a96885d36")
	/** < = << */
	public static final String Le = "<<";
	@XendraRefItem(Name=" ~",
		Value="~~",
		Description="",
		Identifier="3367e136-b452-5f55-d065-a83b562397fb")
	/**  ~ = ~~ */
	public static final String Like = "~~";
	@XendraRefItem(Name="<=",
		Value="<=",
		Description="",
		Identifier="27785f75-fdf4-3a5a-95d5-3bd3e5bc6e79")
	/** <= = <= */
	public static final String LeEq = "<=";
	@XendraRefItem(Name="|<x>|",
		Value="AB",
		Description="",
		Identifier="b37ebee4-4113-821d-55a6-ffeaf16ace63")
	/** |<x>| = AB */
	public static final String X = "AB";
	@XendraRefItem(Name="sql",
		Value="SQ",
		Description="",
		Identifier="508822af-86d9-4a52-9b55-c414105cde6d")
	/** sql = SQ */
	public static final String Sql = "SQ";
	@XendraRef(Name="AD_Find Operation",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="CC",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="68e96930-8512-7806-25cd-2cce2a5d79e9")
	public static final String Identifier = "68e96930-8512-7806-25cd-2cce2a5d79e9";

}
