package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_ShowHelpList implements Reference 
{
 	@XendraRefItem(Name="Ask user (for future use)",
		Value="A",
		Description="",
		Identifier="f52c96b3-b3ba-0037-2b20-ae233412483d")
	/** Ask user (for future use) = A */
	public static final String AskUserForFutureUse = "A";
	@XendraRefItem(Name="Don't show help",
		Value="N",
		Description="",
		Identifier="80d2dfef-7b53-38bb-a4f0-33c4bca6db4e")
	/** Don't show help = N */
	public static final String DonTShowHelp = "N";
	@XendraRefItem(Name="Show Help",
		Value="Y",
		Description="",
		Identifier="9f9a9798-5932-7021-070b-65c8144e3c80")
	/** Show Help = Y */
	public static final String ShowHelp = "Y";
	@XendraRef(Name="ShowHelp List",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="0d4825d0-6fd5-6ec1-a8d6-fd86c63ea82a")
	public static final String Identifier = "0d4825d0-6fd5-6ec1-a8d6-fd86c63ea82a";

}
