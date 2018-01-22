package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_C_payselection_remittance_vt 
{
 	@XendraView(Identifier="f6a81a16-2ff7-631b-e8e4-46c63ebe12a9",
Synchronized="2013-07-09 19:02:34.0",
Name="c_payselection_remittance_vt",
Owner="xendra",
Extension="")
	public static final String Identifier = "f6a81a16-2ff7-631b-e8e4-46c63ebe12a9";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-07-09 19:02:34.0");
	sb.appendln("@Identifier=f6a81a16-2ff7-631b-e8e4-46c63ebe12a9");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT psl.ad_client_id, psl.ad_org_id, l.ad_language, psl.c_payselection_id, psl.c_payselectionline_id, psl.c_payselectioncheck_id, psl.paymentrule, psl.line, psl.openamt, psl.payamt, psl.discountamt, psl.differenceamt, i.c_bpartner_id, i.documentno, i.dateinvoiced, i.grandtotal, i.grandtotal AS amtinwords FROM ((c_payselectionline psl JOIN c_invoice i ON ((psl.c_invoice_id = i.c_invoice_id))) JOIN ad_language l ON ((l.issystemlanguage = 'Y'::bpchar)));");
	return sb.toString();
}
}
