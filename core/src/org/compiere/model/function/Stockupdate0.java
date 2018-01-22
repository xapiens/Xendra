package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Stockupdate0 
{
 
@XendraFunction(Name="stockupdate",Output="numeric",Owner="xendra",Language="plpgsql",
Identifier="2f96ef0b-f111-6ae1-9fdb-5077987f33f0",
Arguments="product_brand_id numeric, product_group_id numeric, product_category_id numeric, invoice_id numeric, movement_id numeric, inout_id numeric, product_id numeric, fromdate timestamp without time zone",
Extension="",Synchronized="2016-11-07 09:40:28.0")
	public static final String Identifier = "2f96ef0b-f111-6ae1-9fdb-5077987f33f0";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("DECLARE");
	sb.appendln("_found NUMERIC := 0;");
	sb.appendln("product Numeric[];");
	sb.appendln("BEGIN");
	sb.appendln("IF Product_Brand_ID > 0  THEN");
	sb.appendln("	select array(select m_product_id from xendra.m_product where m_product_brand_id = product_brand_id) into product;");
	sb.appendln("ELSIF Product_Group_ID > 0 then");
	sb.appendln("	select array(select m_product_id from xendra.m_product where m_product_group_id = product_group_id) into product;");
	sb.appendln("ELSIF Product_Category_ID > 0 then");
	sb.appendln("	select array(select m_product_id from xendra.m_product where m_product_category_id = product_category_id) into product;");
	sb.appendln("ELSIF Invoice_ID > 0 then");
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
	sb.appendln("with delprevious as (");
	sb.appendln("	DELETE FROM xendra.M_Storage where M_Product_ID = any (product)");
	sb.appendln("),newstorage as (select c.m_product_id, c.m_locator_id, c.m_attributesetinstance_id, c.ad_client_id, c.ad_org_id, sum(c.qtysource)  as qtyonhand from ");
	sb.appendln("xendra.m_carding c join xendra.m_locator l on c.m_locator_id = l.m_locator_id where c.m_product_id = any (product)");
	sb.appendln("AND CASE WHEN FromDate ISNULL then true else movementdate >= FromDate END");
	sb.appendln("group by c.ad_client_id, c.ad_org_id, c.m_locator_id,c.m_attributesetinstance_id, c.m_product_id)");
	sb.appendln("insert into xendra.m_storage (createdby, created, updatedby, updated, isactive, m_storage_id, ad_client_id, ad_org_id, ");
	sb.appendln("	m_locator_id, m_attributesetinstance_id, m_product_id, qtyonhand,qtyreserved,qtyordered)  ");
	sb.appendln("	SELECT 100,now(), 100,now(), 'Y'::bpchar, nextval('xendra.m_storage_seq'),");
	sb.appendln("	r.ad_client_id, r.ad_org_id, ");
	sb.appendln("	r.m_locator_id, r.m_attributesetinstance_id, r.m_product_id, r.qtyonhand,0,0 FROM newstorage r;");
	sb.appendln("GET DIAGNOSTICS _found = ROW_COUNT;	");
	sb.appendln("RETURN _found;");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2016-11-07 09:40:28.0");
	sb.appendln("@Identifier=2f96ef0b-f111-6ae1-9fdb-5077987f33f0");
	return sb.toString();
}
}
