package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_C_boeopen_v 
{
 	@XendraView(Identifier="3005030a-e0a5-5fbb-ff32-c7f0ccedcac7",
Synchronized="2013-07-09 19:02:34.0",
Name="c_boeopen_v",
Owner="xendra",
Extension="")
	public static final String Identifier = "3005030a-e0a5-5fbb-ff32-c7f0ccedcac7";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-07-09 19:02:34.0");
	sb.appendln("@Identifier=3005030a-e0a5-5fbb-ff32-c7f0ccedcac7");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT b.ad_client_id, b.ad_org_id, b.dateboe, b.c_bpartner_id, b.documentno, b.grandtotal, p.salesrep_id, boeopen(b.c_boe_id) AS boeopen FROM (c_boe b JOIN c_bpartner p ON ((b.c_bpartner_id = p.c_bpartner_id))) WHERE (((b.issotrx = 'Y'::bpchar) AND (b.ispaid = 'N'::bpchar)) AND (NOT (boeopen(b.c_boe_id) = (0)::numeric)));");
	return sb.toString();
}
}
