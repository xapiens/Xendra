package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_AD_Package_Type implements Reference 
{
 	@XendraRefItem(Name="Remote Transfer",
		Value="R",
		Description="This type of transfer will transfer objects to another Adempiere installation accessible by network.",
		Identifier="daa41dcf-a8fc-4809-9b24-5523857e65e1")
	/** Remote Transfer = R */
	public static final String RemoteTransfer = "R";
	@XendraRefItem(Name="Local Transfer",
		Value="L",
		Description="This type of transfer will transfer objects to the same Adempiere instance",
		Identifier="e86a1883-3627-161a-a60b-9f69e6cfaf0a")
	/** Local Transfer = L */
	public static final String LocalTransfer = "L";
	@XendraRefItem(Name="XML File",
		Value="X",
		Description="This type of transfer will create a XML file ",
		Identifier="d4330d5e-3f63-26d3-25f1-9f24e5faa76b")
	/** XML File = X */
	public static final String XMLFile = "X";
	@XendraRef(Name="AD_Package_Type",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="Defines the type of packages available",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="558a73a3-b187-3f3b-d96c-de71e7c6f1e0")
	public static final String Identifier = "558a73a3-b187-3f3b-d96c-de71e7c6f1e0";

}
