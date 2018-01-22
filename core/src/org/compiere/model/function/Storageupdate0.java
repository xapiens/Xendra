package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Storageupdate0 
{
 
@XendraFunction(Name="storageupdate",Output="numeric",Owner="xendra",Language="plpgsql",
Identifier="ca1fdf5a-3ae5-e340-ebbf-3d30e23ad4c9",
Arguments="invoice_id numeric, movement_id numeric, inout_id numeric, product_id numeric",
Extension="",Synchronized="2016-12-01 18:02:28.0")
	public static final String Identifier = "ca1fdf5a-3ae5-e340-ebbf-3d30e23ad4c9";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("DECLARE");
	sb.appendln("_found NUMERIC := 0;");
	sb.appendln("product Numeric[];");
	sb.appendln("BEGIN");
	sb.appendln("IF Invoice_ID > 0 then");
	sb.appendln("	select array(select distinct m_product_id from xendra.c_invoiceline where c_invoice_id = invoice_id) into product;");
	sb.appendln("ELSIF Movement_ID > 0 then");
	sb.appendln("	select array(select distinct m_product_id from xendra.m_movementline where m_movement_id = movement_id) into product;");
	sb.appendln("ELSIF InOut_ID > 0 then");
	sb.appendln("	select array(select distinct m_product_id from xendra.m_inoutline where m_inout_id = inout_id) into product;");
	sb.appendln("ELSIF Product_ID > 0 THEN");
	sb.appendln("	product := array_append(product, Product_ID);");
	sb.appendln("END IF;");
	sb.appendln("if product isnull then");
	sb.appendln("	return _found;");
	sb.appendln("end if;");
	sb.appendln("with ");
	sb.appendln("delprevious as (");
	sb.appendln("	DELETE FROM xendra.M_Storage where M_Product_ID = any (product)");
	sb.appendln("),");
	sb.appendln("newstorage as (SELECT c.m_product_id, c.m_locator_id, c.m_attributesetinstance_id, ");
	sb.appendln("c.ad_client_id, c.ad_org_id, sum(c.movementqty)  as qtyonhand,");
	sb.appendln("max(movementdate) as datelastrun,");
	sb.appendln("max(CASE WHEN m_inventoryline_id > 0 THEN movementdate ELSE null::timestamp END) AS datelastinventory");
	sb.appendln("from ");
	sb.appendln("xendra.m_transaction c join xendra.m_locator l on c.m_locator_id = l.m_locator_id ");
	sb.appendln("JOIN m_materialpolicy mp ON c.ad_client_id = mp.ad_client_id");
	sb.appendln("where c.m_product_id = any (product) AND c.movementdate >= mp.startdate AND c.docstatus in ('CL','CO')");
	sb.appendln("group by c.ad_client_id, c.ad_org_id, c.m_locator_id,c.m_attributesetinstance_id, c.m_product_id)");
	sb.appendln("insert into xendra.m_storage (createdby, created, updatedby, updated, ");
	sb.appendln("	isactive, m_storage_id, ");
	sb.appendln("	ad_client_id, ad_org_id, m_locator_id, ");
	sb.appendln("	m_product_id, m_attributesetinstance_id, ");
	sb.appendln("	datelastrun, datelastinventory,");
	sb.appendln("	qtyonhand,qtyreserved,qtyordered)  ");
	sb.appendln("	SELECT 100,now(), 100,now(), ");
	sb.appendln("	'Y'::bpchar, nextval('xendra.m_storage_seq'),");
	sb.appendln("	r.ad_client_id, r.ad_org_id, r.m_locator_id,");
	sb.appendln("	r.m_product_id, r.m_attributesetinstance_id,  ");
	sb.appendln("	r.datelastrun, r.datelastinventory,");
	sb.appendln("	r.qtyonhand,0,0 FROM newstorage r;");
	sb.appendln("GET DIAGNOSTICS _found = ROW_COUNT;	");
	sb.appendln("RETURN _found;");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2016-12-01 18:02:28.0");
	sb.appendln("@Identifier=ca1fdf5a-3ae5-e340-ebbf-3d30e23ad4c9");
	return sb.toString();
}
}
