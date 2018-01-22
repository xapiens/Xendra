package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_AD_WF_NodeEMailRecipient implements Reference 
{
 	@XendraRefItem(Name="Document Owner",
		Value="D",
		Description="",
		Identifier="8859388d-2db3-352d-0a36-2a3b03c3f49f")
	/** Document Owner = D */
	public static final String DocumentOwner = "D";
	@XendraRefItem(Name="Document Business Partner",
		Value="B",
		Description="",
		Identifier="291b686f-ef0f-3f1b-e51f-441176c5a035")
	/** Document Business Partner = B */
	public static final String DocumentBusinessPartner = "B";
	@XendraRefItem(Name="WF Responsible",
		Value="R",
		Description="",
		Identifier="027c8993-76b6-7035-3378-b656c9735deb")
	/** WF Responsible = R */
	public static final String WFResponsible = "R";
	@XendraRef(Name="AD_WF_Node EMailRecipient",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="2dfcfdc2-fe65-78db-4afa-de529d641aa1")
	public static final String Identifier = "2dfcfdc2-fe65-78db-4afa-de529d641aa1";

}
