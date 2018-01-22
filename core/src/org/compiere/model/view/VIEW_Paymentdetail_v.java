package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_Paymentdetail_v 
{
 	@XendraView(Identifier="9130ff9b-e69e-29ab-3f8f-03b108a2f52f",
Synchronized="2013-07-09 19:02:34.0",
Name="paymentdetail_v",
Owner="xendra",
Extension="")
	public static final String Identifier = "9130ff9b-e69e-29ab-3f8f-03b108a2f52f";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-07-09 19:02:34.0");
	sb.appendln("@Identifier=9130ff9b-e69e-29ab-3f8f-03b108a2f52f");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT p.ad_client_id, p.ad_org_id, p.isreceipt, p.c_bankaccount_id, p.documentno, p.datetrx, p.c_bpartner_id, p.c_currency_id, pl.c_charge_id, pl.c_invoice_id, pl.payamt FROM (c_payment p JOIN c_paymentline pl ON ((p.c_payment_id = pl.c_payment_id)));");
	return sb.toString();
}
}
