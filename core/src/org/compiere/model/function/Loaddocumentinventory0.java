package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Loaddocumentinventory0 
{
 
@XendraFunction(Name="loaddocumentinventory",Output="void",Owner="xendra",Language="plpgsql",
Identifier="20f7b9f3-a14f-17c3-2586-b1db14960260",Arguments="id numeric, p_period_id numeric",
Extension="",Synchronized="2019-04-15 11:28:28.0")
	public static final String Identifier = "20f7b9f3-a14f-17c3-2586-b1db14960260";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("DECLARE");
	sb.appendln(" ar record;");
	sb.appendln(" _iscostable boolean;");
	sb.appendln(" _count	INTEGER := 0;");
	sb.appendln(" _ad_table_id numeric;");
	sb.appendln(" CARDING xendra.m_transaction%ROWTYPE;");
	sb.appendln("BEGIN    ");
	sb.appendln("	for ar in select i.ad_client_id, i.ad_org_id,i.createdby, i.updatedby, i.isactive, ");
	sb.appendln("		i.documentno,i.c_doctype_id,i.m_warehouse_id,il.identifier, ");
	sb.appendln("		il.m_inventoryline_id, il.m_attributesetinstance_id, i.ad_org_id, ");
	sb.appendln("		i.docstatus,il.m_product_id, il.m_locator_id, i.movementdate, il.line,");
	sb.appendln("		il.InventoryType, il.QtyCount, QtyBook, il.QtyInternalUse,");
	sb.appendln("		CASE WHEN il.inventorytype = 'D' then QtyCount - QtyBook ");
	sb.appendln("		     WHEN il.inventorytype = 'I' then QtyCount");
	sb.appendln("		ELSE QtyInternalUse END AS Qty, dt.transactiontype, il.line		");
	sb.appendln("		from m_inventoryline il join m_inventory i on i.m_inventory_id = il.m_inventory_id ");
	sb.appendln("		join c_doctype dt on i.c_doctype_id = dt.c_doctype_id");
	sb.appendln("		LEFT JOIN  m_transaction t on t.m_inventoryline_id = il.m_inventoryline_id		");
	sb.appendln("		WHERE i.m_inventory_id = id AND t.m_inventoryline_id ISNULL");
	sb.appendln("	LOOP");
	sb.appendln("		SELECT CASE WHEN iscostable='Y' THEN true else false END into _iscostable FROM m_product p ");
	sb.appendln("		WHERE p.m_product_id = ar.m_product_id;");
	sb.appendln("		if not _iscostable then");
	sb.appendln("			continue;");
	sb.appendln("		end if;				");
	sb.appendln("		carding.DocumentNo := ar.documentno;");
	sb.appendln("		carding.c_doctype_id := ar.c_doctype_id;");
	sb.appendln("		carding.m_warehouse_id := ar.m_warehouse_id;");
	sb.appendln("		carding.m_locator_id := ar.m_locator_id;");
	sb.appendln("		carding.m_product_id := ar.m_product_id;");
	sb.appendln("		carding.line := ar.line;");
	sb.appendln("		carding.movementdate := ar.movementdate;		");
	sb.appendln("		carding.movementqty := ar.qty;");
	sb.appendln("		carding.m_inventoryline_id := ar.m_inventoryline_id;			");
	sb.appendln("		carding.inventorytype := ar.inventorytype;");
	sb.appendln("		if (ar.m_attributesetinstance_id > 0) then");
	sb.appendln("			select count(*) into _count from m_attributesetinstance ");
	sb.appendln("				where m_attributesetinstance_id=ar.m_attributesetinstance_id;				");
	sb.appendln("			carding.m_attributesetinstance_id = ar.m_attributesetinstance_id;");
	sb.appendln("			if _count = 0 then");
	sb.appendln("				carding.errormsg := 'AttributeSetInstance bad reference';");
	sb.appendln("			end if;				");
	sb.appendln("		else");
	sb.appendln("			carding.m_attributesetinstance_id = 0;");
	sb.appendln("		end if;						");
	sb.appendln("		carding.ad_org_id := ar.ad_org_id;");
	sb.appendln("		select ad_table_id into _ad_table_id from ad_table t where  t.tablename = 'M_Inventory';");
	sb.appendln("		carding.ad_table_id := _ad_table_id;			");
	sb.appendln("		carding.c_period_id := p_period_id;");
	sb.appendln("		carding.record_id := id;			");
	sb.appendln("		carding.docstatus := ar.docstatus;			");
	sb.appendln("		carding.identifier := ar.identifier;");
	sb.appendln("		if ar.Qty >= 0 then");
	sb.appendln("			carding.movementtype = 'I+';");
	sb.appendln("			carding.qtyinput := ar.qty;");
	sb.appendln("			carding.qtyoutput := 0;");
	sb.appendln("		else");
	sb.appendln("			carding.movementtype = 'I-';				");
	sb.appendln("			carding.qtyoutput := ar.qty * -1;");
	sb.appendln("			carding.qtyinput := 0;");
	sb.appendln("		end if;");
	sb.appendln("		carding.m_transaction_id := nextval('m_transaction_seq');");
	sb.appendln("		carding.ad_client_id := ar.ad_client_id;");
	sb.appendln("		carding.ad_org_id := ar.ad_org_id;");
	sb.appendln("		carding.isactive := ar.isactive;");
	sb.appendln("		carding.created := now();");
	sb.appendln("		carding.createdby := ar.createdby;");
	sb.appendln("		carding.updated := now();");
	sb.appendln("		carding.updatedby := ar.updatedby;	");
	sb.appendln("		carding.transactiontype := ar.transactiontype;");
	sb.appendln("		carding.seqno := ar.line;");
	sb.appendln("		carding.identifier := ar.identifier;");
	sb.appendln("		carding.processed = 'N';");
	sb.appendln("		insert into m_transaction select (x).* from (select carding as x) ss;");
	sb.appendln("		IF ar.inventorytype = 'I' then");
	sb.appendln("		   UPDATE xendra.M_Transaction set IsActive = 'N' WHERE AD_Client_ID = ar.AD_Client_ID					");
	sb.appendln("			AND M_Warehouse_ID = ar.m_warehouse_id AND MovementDate <= ar.movementdate");
	sb.appendln("			AND M_Product_ID = ar.M_Product_ID");
	sb.appendln("			AND COALESCE(inventorytype,'') != 'I';				");
	sb.appendln("		END IF;										");
	sb.appendln("	end loop;");
	sb.appendln("	update m_inventory set iscosted = 'Y' where m_inventory_id = id;");
	sb.appendln("END");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2019-04-15 11:28:28.0");
	sb.appendln("@Identifier=20f7b9f3-a14f-17c3-2586-b1db14960260");
	return sb.toString();
}
}
