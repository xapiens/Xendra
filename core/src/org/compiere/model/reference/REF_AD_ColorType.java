package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_AD_ColorType implements Reference 
{
 	@XendraRefItem(Name="Normal (Flat)",
		Value="F",
		Description="",
		Identifier="e0cbb20a-56dc-8341-9d8a-5acb46bd4c71")
	/** Normal (Flat) = F */
	public static final String NormalFlat = "F";
	@XendraRefItem(Name="Gradient",
		Value="G",
		Description="",
		Identifier="036fc926-b4f2-9d3b-858e-1b5c54b39006")
	/** Gradient = G */
	public static final String Gradient = "G";
	@XendraRefItem(Name="Line",
		Value="L",
		Description="",
		Identifier="dfc0c4e1-fdc7-5d89-f2d1-e3de6b9a2504")
	/** Line = L */
	public static final String Line = "L";
	@XendraRefItem(Name="Texture (Picture)",
		Value="T",
		Description="",
		Identifier="9b3ab131-dc45-3e39-a534-e189dd0f45b2")
	/** Texture (Picture) = T */
	public static final String TexturePicture = "T";
	@XendraRef(Name="AD_Color Type",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="e845bde3-ac75-7195-ec6f-8e3e8fa53abd")
	public static final String Identifier = "e845bde3-ac75-7195-ec6f-8e3e8fa53abd";

}
