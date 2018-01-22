package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_R_MailText_ID 
{
 	@XendraElement(AD_Element_ID=1515,
		ColumnName="R_MailText_ID",
		EntityType="D",
		Name="Mail Template",
		PrintName="Mail Template",
		Description="Text templates for mailings",
		Help="The Mail Template indicates the mail template for return messages. Mail text can include variables.  The priority of parsing is User/Contact, Business Partner and then the underlying business object (like Request, Dunning, Workflow object).<br> So, @Name@ would resolve into the User NAME (if user is defined defined), then Business Partner NAME (if business partner is defined) and then the Name of the business object if it has a Name.<br> For Multi-Lingual systems, the template is translated based on the Business Partner's language selection.",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="02b75e55-f80b-d8c7-5f34-dfc8b6205e3e",
		Synchronized="2012-07-11 00:00:00.0")
	public static final String Identifier = "02b75e55-f80b-d8c7-5f34-dfc8b6205e3e";

}
