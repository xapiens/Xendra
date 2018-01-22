package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_AD_PrintFormatType implements Reference 
{
 	@XendraRefItem(Name="Image",
		Value="I",
		Description="",
		Identifier="783b6516-8d25-ab3d-5a22-f7a05f035c45")
	/** Image = I */
	public static final String Image = "I";
	@XendraRefItem(Name="Rectangle",
		Value="R",
		Description="",
		Identifier="ccb7308b-a83b-d431-b2d8-c23fc0b41b7a")
	/** Rectangle = R */
	public static final String Rectangle = "R";
	@XendraRefItem(Name="Line",
		Value="L",
		Description="",
		Identifier="0109104e-eeba-b8bb-429b-95e49707b6e2")
	/** Line = L */
	public static final String Line = "L";
	@XendraRefItem(Name="Accounting",
		Value="A",
		Description="",
		Identifier="0688a9a9-bfc9-cd2f-b602-a2e3c392058f")
	/** Accounting = A */
	public static final String Accounting = "A";
	@XendraRefItem(Name="Field",
		Value="F",
		Description="",
		Identifier="6bb5eda1-36fb-6d02-6e6c-a0965b9aeca2")
	/** Field = F */
	public static final String Field = "F";
	@XendraRefItem(Name="Text",
		Value="T",
		Description="",
		Identifier="23168e7b-6877-81f0-646d-ad25faffd00e")
	/** Text = T */
	public static final String Text = "T";
	@XendraRefItem(Name="Print Format",
		Value="P",
		Description="",
		Identifier="abeeacd6-386f-e3ee-9db7-ab52ff32ca6b")
	/** Print Format = P */
	public static final String PrintFormat = "P";
	@XendraRef(Name="AD_Print Format Type",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="2bbb460d-a29d-781b-abc2-94cfb11721a3")
	public static final String Identifier = "2bbb460d-a29d-781b-abc2-94cfb11721a3";

}
