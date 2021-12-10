package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_Alldiffdocuments 
{
 	@XendraView(Identifier="8253bd29-7a9e-6da4-6b3d-f13f442b8d58",
Synchronized="2020-02-12 14:07:34.0",
Name="alldiffdocuments",
Owner="xendra",
Extension="")
	public static final String Identifier = "8253bd29-7a9e-6da4-6b3d-f13f442b8d58";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2020-02-12 14:07:34.0");
	sb.appendln("@Identifier=8253bd29-7a9e-6da4-6b3d-f13f442b8d58");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT v.master_id AS ad_table_id, v.parent_id AS record_id, v.ad_client_id, 0 AS ad_org_id, v.created, v.createdby, v.updated, v.updatedby, v.m_product_id, v.line, v.movementdate, v.documentno, v.movementtype, v.qtyinput, v.qtyoutput, v.qtysource, v.signe, ol.c_currency_id, v.linenetamt, v.linenetamt AS costed, fa.amtacctdr FROM (((((alldocuments v LEFT JOIN m_inoutline iol ON ((((v.ad_table_id = (320)::numeric) AND (v.record_id = iol.m_inoutline_id)) AND (v.m_product_id = iol.m_product_id)))) LEFT JOIN c_orderline ol ON ((iol.c_orderline_id = ol.c_orderline_id))) LEFT JOIN m_inout io ON ((iol.m_inout_id = io.m_inout_id))) LEFT JOIN fact_acct fa ON (((((fa.ad_table_id = (319)::numeric) AND (fa.record_id = io.m_inout_id)) AND (fa.m_product_id = iol.m_product_id)) AND (fa.amtacctdr > (0)::numeric)))) JOIN m_materialpolicy mp ON ((mp.ad_client_id = v.ad_client_id))) WHERE (v.m_productionplan_id IS NULL) UNION ALL SELECT v.master_id AS ad_table_id, v.parent_id AS record_id, v.ad_client_id, 0 AS ad_org_id, v.created, v.createdby, v.updated, v.updatedby, v.m_product_id, v.line, v.movementdate, v.documentno, v.movementtype, v.qtyinput, v.qtyoutput, v.qtysource, v.signe, fa.c_currency_id, round((pp.incost * pp.productionqty), 2) AS linenetamt, round((pp.incost * pp.productionqty), 2) AS costed, fa.amtacctdr FROM ((((alldocuments v LEFT JOIN m_productionplan pp ON (((pp.m_productionplan_id = v.m_productionplan_id) AND (v.m_product_id = pp.m_product_id)))) LEFT JOIN m_production p ON ((pp.m_production_id = p.m_production_id))) LEFT JOIN fact_acct fa ON (((((fa.ad_table_id = (325)::numeric) AND (fa.record_id = p.m_production_id)) AND (fa.m_product_id = pp.m_product_id)) AND (fa.amtacctdr > (0)::numeric)))) JOIN m_materialpolicy mp ON ((mp.ad_client_id = v.ad_client_id))) WHERE (NOT (v.m_productionplan_id IS NULL));");
	return sb.toString();
}
}
