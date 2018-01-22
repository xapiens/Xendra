package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Calcstoragemonthly0 
{
 
@XendraFunction(Name="calcstoragemonthly",Output="void",Owner="xendra",Language="plpgsql",
Identifier="edca0cab-e37d-a844-b2af-f282b0f50c77",
Arguments="p_period_id numeric, p_product_id numeric, p_client_id numeric",Extension="",
Synchronized="2016-12-01 11:06:28.0")
	public static final String Identifier = "edca0cab-e37d-a844-b2af-f282b0f50c77";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("DECLARE");
	sb.appendln("ar record;");
	sb.appendln("_storagedatelastrun timestamp;");
	sb.appendln("_found INTEGER := 0;");
	sb.appendln("BEGIN");
	sb.appendln("DELETE FROM M_STORAGEMONTHLY WHERE C_period_id = p_period_id AND M_product_ID = p_product_id;");
	sb.appendln("FOR ar in ");
	sb.appendln("WITH ");
	sb.appendln("     previous as ");
	sb.appendln("	(SELECT ");
	sb.appendln("	 M_Locator_ID,");
	sb.appendln("	 M_ATTRIBUTESETINSTANCE_ID,");
	sb.appendln("	 SUM(movementqty) as prevqtyonhand,");
	sb.appendln("	 max(case when m_inventoryline_id > 0 then movementdate else null end) as previnventory");
	sb.appendln("	 FROM m_transaction where  ");
	sb.appendln("	  m_product_id = p_product_id");
	sb.appendln("	  AND C_PERIOD_ID < p_period_id");
	sb.appendln("	  AND AD_Client_ID = p_client_id");
	sb.appendln("	  GROUP BY ");
	sb.appendln("	  M_Locator_ID,");
	sb.appendln("	  M_ATTRIBUTESETINSTANCE_ID),");
	sb.appendln("      actual as");
	sb.appendln("         (SELECT AD_Client_ID,");
	sb.appendln("		 AD_Org_ID, ");
	sb.appendln("		 c_period_id,                 ");
	sb.appendln("		 m_locator_id,");
	sb.appendln("		 m_product_id,");
	sb.appendln("		 m_attributesetinstance_id,");
	sb.appendln("		 sum(movementqty) as qtyonhand,");
	sb.appendln("		 max(movementdate) as movementdate,");
	sb.appendln("		 max(case when m_inventoryline_id > 0 then movementdate else null end) as lastinventory");
	sb.appendln("		 from m_transaction WHERE c_period_id = p_period_id AND m_product_id = p_product_id AND AD_Client_ID = p_client_id	 ");
	sb.appendln("		 GROUP BY ad_client_id, ad_org_id, c_period_id, M_Locator_ID, M_PRODUCT_ID, M_ATTRIBUTESETINSTANCE_ID)");
	sb.appendln("       SELECT a.ad_client_id, a.ad_org_id, c_period_id,a.m_locator_id,l.m_warehouse_id, m_product_id, ");
	sb.appendln("       a.m_attributesetinstance_id,");
	sb.appendln("       CASE WHEN p.previnventory isnull THEN a.lastinventory ELSE p.previnventory END as datelastinventory,");
	sb.appendln("       COALESCE(prevqtyonhand,0)+COALESCE(qtyonhand,0) as qtyonhand, movementdate");
	sb.appendln("       FROM actual a left outer join previous p on a.m_attributesetinstance_id = p.m_attributesetinstance_id ");
	sb.appendln("       AND a.m_locator_id = p.m_locator_id  ");
	sb.appendln("       join M_LOCATOR l on l.m_locator_id = a.m_locator_id       				");
	sb.appendln("LOOP");
	sb.appendln("  UPDATE m_storagemonthly set qtyonhand = ar.qtyonhand, ");
	sb.appendln("    errormsg = CASE WHEN ar.qtyonhand < 0 then 'stock negativo' end,");
	sb.appendln("    M_Warehouse_ID = ar.M_Warehouse_ID");
	sb.appendln("    WHERE AD_Client_ID = ar.AD_Client_ID");
	sb.appendln("    AND m_product_id = ar.m_product_id ");
	sb.appendln("    AND C_Period_ID = ar.c_period_id			");
	sb.appendln("    AND m_attributesetinstance_id = ar.m_attributesetinstance_id 		");
	sb.appendln("    AND m_locator_id = ar.m_locator_id;		");
	sb.appendln("  GET DIAGNOSTICS _found = ROW_COUNT;");
	sb.appendln("  IF _found = 0 THEN");
	sb.appendln("    INSERT into m_storagemonthly ( ad_client_id, ad_org_id, created, CREATEDBY, updated, updatedby, isactive,");
	sb.appendln("				c_period_id, m_locator_id, m_warehouse_id, m_product_id, m_attributesetinstance_id, ");
	sb.appendln("				errormsg, qtyonhand, datelastrun) 				");
	sb.appendln("			values ( ar.ad_client_id, ar.ad_org_id, now(), 0, now(),0,'Y', ");
	sb.appendln("				 p_period_id,  ar.m_locator_id, ar.m_warehouse_id, ar.m_product_id, ar.m_attributesetinstance_id,");
	sb.appendln("				 CASE WHEN ar.qtyonhand < 0 then 'stock negativo' END,ar.qtyonhand, ar.movementdate);   ");
	sb.appendln("  END IF;																											");
	sb.appendln("END LOOP;");
	sb.appendln(" RETURN;");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2016-12-01 11:06:28.0");
	sb.appendln("@Identifier=edca0cab-e37d-a844-b2af-f282b0f50c77");
	return sb.toString();
}
}
