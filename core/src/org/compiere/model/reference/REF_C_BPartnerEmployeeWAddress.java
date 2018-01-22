package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_BPartnerEmployeeWAddress implements Reference 
{
 	@XendraRefTable(TableRef="C_BPartner",
		KeyRef="C_BPartner_ID",
		DisplayRef="Name",
		IsValueDisplayed=false,
		WhereClause="C_BPartner.IsEmployee='Y' AND EXISTS (SELECT * FROM C_BPartner_Location l WHERE C_BPartner.C_BPartner_ID=l.C_BPartner_ID AND l.C_Location_ID IS NOT NULL) AND EXISTS (SELECT * FROM AD_User u WHERE C_BPartner.C_BPartner_ID=u.C_BPartner_ID)",
		OrderByClause="",
		Identifier="c1967813-24f9-0f92-bca7-47ca8dd48a66")
	@XendraRef(Name="C_BPartner Employee w Address",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="Business Partners who are Employee and have addresses",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:35:04.0",
		Extension="",
		Identifier="ceb38c30-de7a-46bb-35b0-014c0684ff8d")
	public static final String Identifier = "ceb38c30-de7a-46bb-35b0-014c0684ff8d";

}
