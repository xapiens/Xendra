package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_EndType implements Reference 
{
 	@XendraRefItem(Name="Forever",
		Value="0",
		Description="",
		Identifier="b53fc9fa-7467-4744-a8d7-737d667d4a39")
	/** Forever = 0 */
	public static final String Forever = "0";
	@XendraRefItem(Name="MaxOcurrences",
		Value="1",
		Description="",
		Identifier="0773a370-6a54-43f8-8cd3-d0beec9f0d48")
	/** MaxOcurrences = 1 */
	public static final String MaxOcurrences = "1";
	@XendraRefItem(Name="EndDate",
		Value="2",
		Description="",
		Identifier="536c6667-4cc5-49ec-952e-9c062a2ffd62")
	/** EndDate = 2 */
	public static final String EndDate = "2";
	@XendraRef(Name="EndType",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2017-09-14 12:32:57.35",
		Extension="",
		Identifier="f7439b44-7ed8-44f9-a2ec-4885b13e4c30")
	public static final String Identifier = "f7439b44-7ed8-44f9-a2ec-4885b13e4c30";

}
