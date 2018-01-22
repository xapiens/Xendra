package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_Rv_allocation 
{
 	@XendraView(Identifier="9c9725b4-7150-47f9-5ad2-fe40393e9a98",
Synchronized="2013-07-09 19:02:34.0",
Name="rv_allocation",
Owner="xendra",
Extension="")
	public static final String Identifier = "9c9725b4-7150-47f9-5ad2-fe40393e9a98";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-07-09 19:02:34.0");
	sb.appendln("@Identifier=9c9725b4-7150-47f9-5ad2-fe40393e9a98");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT h.c_allocationhdr_id, h.ad_client_id, h.ad_org_id, h.isactive, h.created, h.createdby, h.updated, h.updatedby, h.documentno, h.description, h.datetrx, h.dateacct, h.c_currency_id, h.approvalamt, h.ismanual, h.docstatus, h.docaction, h.processed, l.c_allocationline_id, l.c_invoice_id, l.c_bpartner_id, l.c_order_id, l.c_payment_id, l.c_cashline_id, l.amount, l.discountamt, l.writeoffamt, l.overunderamt FROM (c_allocationhdr h JOIN c_allocationline l ON ((h.c_allocationhdr_id = l.c_allocationhdr_id)));");
	return sb.toString();
}
}
