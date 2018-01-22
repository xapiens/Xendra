package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_BPartnerTrx implements Reference 
{
 	@XendraRefTable(TableRef="C_BPartner",
		KeyRef="C_BPartner_ID",
		DisplayRef="Name",
		IsValueDisplayed=true,
		WhereClause="C_BPartner.IsSummary='N' AND C_BPartner.IsActive='Y'",
		OrderByClause="",
		Identifier="119c8b42-bfd4-a7e9-e179-d85e5d60003e")
	@XendraRef(Name="C_BPartner (Trx)",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="Business Partner selection (no Summary)",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:35:31.0",
		Extension="",
		Identifier="ed87c3fe-720d-c26d-0166-b5178b65db41")
	public static final String Identifier = "ed87c3fe-720d-c26d-0166-b5178b65db41";

}
