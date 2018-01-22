package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_Package_Releases implements Reference 
{
 	@XendraRefItem(Name="Release 2.5.2a",
		Value="Release 2.5.2a",
		Description="Release 2.5.2a",
		Identifier="f013acfa-ea12-b0da-0ac3-4a014641201f")
	/** Release 2.5.2a = Release 2.5.2a */
	public static final String Release252a = "Release 2.5.2a";
	@XendraRefItem(Name="Release 2.5.2b",
		Value="Release 2.5.2b",
		Description="Release 2.5.2b",
		Identifier="f2769a5f-2f48-e888-d810-9e3d0c8fb02d")
	/** Release 2.5.2b = Release 2.5.2b */
	public static final String Release252b = "Release 2.5.2b";
	@XendraRefItem(Name="Release 2.5.2c",
		Value="Release 2.5.2c",
		Description="Release 2.5.2c",
		Identifier="1823ecf3-6e5e-faef-5488-d99eb13f47d4")
	/** Release 2.5.2c = Release 2.5.2c */
	public static final String Release252c = "Release 2.5.2c";
	@XendraRefItem(Name="Release 2.5.2d",
		Value="Release 2.5.2d",
		Description="Release 2.5.2d",
		Identifier="9f8ae1ce-cb39-8f23-3eb5-17b46ce8010a")
	/** Release 2.5.2d = Release 2.5.2d */
	public static final String Release252d = "Release 2.5.2d";
	@XendraRefItem(Name="Release 2.5.2e",
		Value="Release 2.5.2e",
		Description="Release 2.5.2e",
		Identifier="97d98ba0-0040-703b-cefa-a72937815209")
	/** Release 2.5.2e = Release 2.5.2e */
	public static final String Release252e = "Release 2.5.2e";
	@XendraRefItem(Name="Release 2.5.3a",
		Value="Release 2.5.3a",
		Description="Release 2.5.3a",
		Identifier="ad05d910-867f-19c5-2196-320ad6b7892b")
	/** Release 2.5.3a = Release 2.5.3a */
	public static final String Release253a = "Release 2.5.3a";
	@XendraRefItem(Name="Release 2.5.3b",
		Value="Release 2.5.3b",
		Description="Release 2.5.3b",
		Identifier="4784b11b-2336-4ab3-4ae8-1b4041d2c88f")
	/** Release 2.5.3b = Release 2.5.3b */
	public static final String Release253b = "Release 2.5.3b";
	@XendraRefItem(Name="No specific release",
		Value="all",
		Description="No specific release",
		Identifier="f057c10f-adfa-11c9-36a0-eba14e173393")
	/** No specific release = all */
	public static final String NoSpecificRelease = "all";
	@XendraRef(Name="Package_Releases",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="List of Package Releases",
		Help="Indicates what release the package is for.  Entering no specific release indicates the package is for all releases.",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="1043bc6a-7c23-336e-1d7e-62cae5f4280a")
	public static final String Identifier = "1043bc6a-7c23-336e-1d7e-62cae5f4280a";

}
