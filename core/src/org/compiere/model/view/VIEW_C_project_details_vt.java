package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_C_project_details_vt 
{
 	@XendraView(Identifier="cc4b9916-603d-024e-1749-cb261c523539",
Synchronized="2013-07-09 19:02:34.0",
Name="c_project_details_vt",
Owner="xendra",
Extension="")
	public static final String Identifier = "cc4b9916-603d-024e-1749-cb261c523539";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-07-09 19:02:34.0");
	sb.appendln("@Identifier=cc4b9916-603d-024e-1749-cb261c523539");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT pl.ad_client_id, pl.ad_org_id, pl.isactive, pl.created, pl.createdby, pl.updated, pl.updatedby, l.ad_language, pj.c_project_id, pl.c_projectline_id, pl.line, pl.plannedqty, pl.plannedprice, pl.plannedamt, pl.plannedmarginamt, pl.committedamt, pl.m_product_id, COALESCE(p.name, pl.description) AS name, CASE WHEN (p.name IS NOT NULL) THEN pl.description ELSE NULL::character varying END AS description, p.documentnote, p.upc, p.sku, p.value AS productvalue, pl.m_product_category_id, pl.invoicedamt, pl.invoicedqty, pl.committedqty FROM (((c_projectline pl JOIN c_project pj ON ((pl.c_project_id = pj.c_project_id))) LEFT JOIN m_product p ON ((pl.m_product_id = p.m_product_id))) JOIN ad_language l ON ((l.issystemlanguage = 'Y'::bpchar))) WHERE (pl.isprinted = 'Y'::bpchar);");
	return sb.toString();
}
}
