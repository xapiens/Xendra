package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_PA_MeasureType implements Reference 
{
 	@XendraRefItem(Name="Request",
		Value="Q",
		Description="",
		Identifier="a0cb418d-038c-6ad1-9fb8-d94fff193963")
	/** Request = Q */
	public static final String Request = "Q";
	@XendraRefItem(Name="Project",
		Value="P",
		Description="",
		Identifier="15e3454d-e115-b55c-06bb-c5344c8c08b2")
	/** Project = P */
	public static final String Project = "P";
	@XendraRefItem(Name="User defined",
		Value="U",
		Description="",
		Identifier="85fdd6a0-451a-5b72-447c-0be70d3669a3")
	/** User defined = U */
	public static final String UserDefined = "U";
	@XendraRefItem(Name="Ratio",
		Value="R",
		Description="",
		Identifier="8f666c70-8114-ad14-49e1-12176e9e8451")
	/** Ratio = R */
	public static final String Ratio = "R";
	@XendraRefItem(Name="Manual",
		Value="M",
		Description="Manual Entry",
		Identifier="cd0a90b2-06ef-be48-a377-bf0d6185b286")
	/** Manual = M */
	public static final String Manual = "M";
	@XendraRefItem(Name="Calculated",
		Value="C",
		Description="",
		Identifier="c2f39bc8-591a-9a12-6f6b-e27719d7c722")
	/** Calculated = C */
	public static final String Calculated = "C";
	@XendraRefItem(Name="Achievements",
		Value="A",
		Description="",
		Identifier="93b4cb18-4ad1-9510-ee2d-452f27d621ac")
	/** Achievements = A */
	public static final String Achievements = "A";
	@XendraRef(Name="PA_Measure Type",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="a4edf16f-cf34-ee95-53c0-01e19e781b26")
	public static final String Identifier = "a4edf16f-cf34-ee95-53c0-01e19e781b26";

}
