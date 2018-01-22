package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_C_rfqresponselineqty_vt 
{
 	@XendraView(Identifier="6ac2c905-f5a7-726b-95cd-a59008affc29",
Synchronized="2013-07-09 19:02:34.0",
Name="c_rfqresponselineqty_vt",
Owner="xendra",
Extension="")
	public static final String Identifier = "6ac2c905-f5a7-726b-95cd-a59008affc29";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-07-09 19:02:34.0");
	sb.appendln("@Identifier=6ac2c905-f5a7-726b-95cd-a59008affc29");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT rq.c_rfqresponseline_id, rq.c_rfqresponselineqty_id, rq.c_rfqlineqty_id, rq.ad_client_id, rq.ad_org_id, rq.isactive, rq.created, rq.createdby, rq.updated, rq.updatedby, l.ad_language, q.c_uom_id, uom.uomsymbol, q.qty, rq.price, rq.discount FROM (((c_rfqresponselineqty rq JOIN c_rfqlineqty q ON ((rq.c_rfqlineqty_id = q.c_rfqlineqty_id))) JOIN c_uom uom ON ((q.c_uom_id = uom.c_uom_id))) JOIN ad_language l ON ((l.issystemlanguage = 'Y'::bpchar))) WHERE ((rq.isactive = 'Y'::bpchar) AND (q.isactive = 'Y'::bpchar));");
	return sb.toString();
}
}
