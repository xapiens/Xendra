package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_GLCategoryType implements Reference 
{
 	@XendraRefItem(Name="Manual",
		Value="M",
		Description="",
		Identifier="d715368a-eeba-638a-d41c-fe33b0973afc")
	/** Manual = M */
	public static final String Manual = "M";
	@XendraRefItem(Name="Import",
		Value="I",
		Description="",
		Identifier="da64dd9d-6bb2-662c-a0e3-7cf7b5d8f1ff")
	/** Import = I */
	public static final String Import = "I";
	@XendraRefItem(Name="Document",
		Value="D",
		Description="",
		Identifier="1861d514-d107-d54a-e30f-96bcb9ba0d89")
	/** Document = D */
	public static final String Document = "D";
	@XendraRefItem(Name="System generated",
		Value="S",
		Description="",
		Identifier="7b73a16a-ff5d-12a4-1b92-25ea534fb2b4")
	/** System generated = S */
	public static final String SystemGenerated = "S";
	@XendraRef(Name="GL Category Type",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="453b465e-17b3-d547-8f5d-504a0b898d77")
	public static final String Identifier = "453b465e-17b3-d547-8f5d-504a0b898d77";

}
