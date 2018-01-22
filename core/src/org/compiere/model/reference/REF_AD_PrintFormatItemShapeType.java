package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_AD_PrintFormatItemShapeType implements Reference 
{
 	@XendraRefItem(Name="Rectangle 3D",
		Value="3",
		Description="",
		Identifier="0729ef35-7635-fcb2-4b29-c7547e35f645")
	/** Rectangle 3D = 3 */
	public static final String Rectangle3D = "3";
	@XendraRefItem(Name="Oval",
		Value="O",
		Description="",
		Identifier="74317974-8375-9b54-5301-a6deb92b4f6d")
	/** Oval = O */
	public static final String Oval = "O";
	@XendraRefItem(Name="Round Rectangle",
		Value="R",
		Description="",
		Identifier="40ba583a-ae0c-c224-b866-e1ae818adeb9")
	/** Round Rectangle = R */
	public static final String RoundRectangle = "R";
	@XendraRefItem(Name="Normal Rectangle",
		Value="N",
		Description="",
		Identifier="0087a33c-b551-267c-9720-d66ebfec4fc0")
	/** Normal Rectangle = N */
	public static final String NormalRectangle = "N";
	@XendraRef(Name="AD_PrintFormatItem ShapeType",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="f652eb70-a549-44dd-d525-16c3e901732e")
	public static final String Identifier = "f652eb70-a549-44dd-d525-16c3e901732e";

}
