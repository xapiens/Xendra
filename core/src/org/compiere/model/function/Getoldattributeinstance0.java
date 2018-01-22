package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Getoldattributeinstance0 
{
 
@XendraFunction(Name="getoldattributeinstance",Output="numeric",Owner="xendra",Language="plpgsql",
Identifier="b738c6cb-0971-f8bb-5e5b-b485b874e56c",
Arguments="warehouse_id numeric, product_id numeric, client_id numeric, org_id numeric",
Extension="",Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "b738c6cb-0971-f8bb-5e5b-b485b874e56c";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("DECLARE");
	sb.appendln("       v_AttributeSetInstance_ID numeric := 0;");
	sb.appendln("       v_count numeric := 0;");
	sb.appendln("BEGIN");
	sb.appendln("       SELECT COUNT(*) into v_count");
	sb.appendln("               FROM M_Storage s INNER JOIN M_Locator l ON (s.M_Locator_ID=l.M_Locator_ID)");
	sb.appendln("                               INNER JOIN M_Product p ON (s.M_Product_ID=p.M_Product_ID)");
	sb.appendln("                               LEFT OUTER JOIN M_AttributeSetInstance asi ON");
	sb.appendln("(s.M_AttributeSetInstance_ID=asi.M_AttributeSetInstance_ID)");
	sb.appendln("               WHERE l.M_Warehouse_ID=warehouse_id AND s.M_Product_ID=product_id");
	sb.appendln("AND s.QtyOnHand > 0 AND s.AD_Org_ID = org_id AND s.AD_Client_ID = client_id;");
	sb.appendln("       IF v_count > 0 THEN");
	sb.appendln("       SELECT s.M_AttributeSetInstance_ID INTO v_AttributeSetInstance_ID");
	sb.appendln("               FROM M_Storage s INNER JOIN M_Locator l ON (s.M_Locator_ID=l.M_Locator_ID)");
	sb.appendln("                               INNER JOIN M_Product p ON (s.M_Product_ID=p.M_Product_ID)");
	sb.appendln("                               LEFT OUTER JOIN M_AttributeSetInstance asi ON");
	sb.appendln("(s.M_AttributeSetInstance_ID=asi.M_AttributeSetInstance_ID)");
	sb.appendln("               WHERE l.M_Warehouse_ID=warehouse_id AND s.M_Product_ID=product_id");
	sb.appendln("AND s.QtyOnHand > 0 AND s.AD_Org_ID = org_id AND s.AD_Client_ID = client_id ORDER BY asi.GuaranteeDate, s.QtyOnHand;");
	sb.appendln("       END IF;");
	sb.appendln("       RETURN v_AttributeSetInstance_ID;");
	sb.appendln("END");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=b738c6cb-0971-f8bb-5e5b-b485b874e56c");
	return sb.toString();
}
}
