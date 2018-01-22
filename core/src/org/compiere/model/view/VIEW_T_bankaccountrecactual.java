package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_T_bankaccountrecactual 
{
 	@XendraView(Identifier="d6f525b9-18b3-d046-9011-a24f87a8988c",
Synchronized="2013-07-09 19:02:34.0",
Name="t_bankaccountrecactual",
Owner="xendra",
Extension="")
	public static final String Identifier = "d6f525b9-18b3-d046-9011-a24f87a8988c";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-07-09 19:02:34.0");
	sb.appendln("@Identifier=d6f525b9-18b3-d046-9011-a24f87a8988c");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT t_bankaccountreconciliation.ad_pinstance_id, t_bankaccountreconciliation.ad_client_id, t_bankaccountreconciliation.ad_org_id, t_bankaccountreconciliation.created, t_bankaccountreconciliation.createdby, t_bankaccountreconciliation.updated, t_bankaccountreconciliation.updatedby, t_bankaccountreconciliation.isactive, t_bankaccountreconciliation.c_payment_id, t_bankaccountreconciliation.payamt, t_bankaccountreconciliation.datetrx, t_bankaccountreconciliation.isprevious, t_bankaccountreconciliation.ispending, t_bankaccountreconciliation.c_bankstatement_id, t_bankaccountreconciliation.isreconciled FROM t_bankaccountreconciliation WHERE ((t_bankaccountreconciliation.isprevious = 'N'::bpchar) AND (t_bankaccountreconciliation.ispending = 'N'::bpchar));");
	return sb.toString();
}
}
