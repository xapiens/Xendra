package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_BPartnerEmployee implements Reference 
{
 	@XendraRefTable(TableRef="C_BPartner",
		KeyRef="C_BPartner_ID",
		DisplayRef="Name",
		IsValueDisplayed=false,
		WhereClause="C_BPartner.IsEmployee='Y'",
		OrderByClause="",
		Identifier="9b9578f9-547f-4217-8aa1-63659cbde2ae")
	@XendraRef(Name="C_BPartner Employee",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="Business Partners who are Employee",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-09-19 17:23:37.0",
		Extension="",
		Identifier="0765a0fc-1442-7d49-8568-fe0fac51b08a")
	public static final String Identifier = "0765a0fc-1442-7d49-8568-fe0fac51b08a";

}
