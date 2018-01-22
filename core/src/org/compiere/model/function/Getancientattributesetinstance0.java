package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Getancientattributesetinstance0 
{
 
@XendraFunction(Name="getancientattributesetinstance",Output="numeric",Owner="xendra",
Language="plpgsql",Identifier="b4a2d4f4-4920-1357-924e-e3e3c0504e11",
Arguments="warehouse_id numeric, product_id numeric, qty numeric, pad_org_id numeric",Extension="",
Synchronized="2017-06-21 08:49:28.0")
	public static final String Identifier = "b4a2d4f4-4920-1357-924e-e3e3c0504e11";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("DECLARE");
	sb.appendln("       v_AttributeSetInstance_ID numeric := 0;");
	sb.appendln("BEGIN");
	sb.appendln("	SELECT s.M_AttributeSetInstance_ID INTO v_AttributeSetInstance_ID");
	sb.appendln("               FROM M_Storage s ");
	sb.appendln("               INNER JOIN M_Locator l ON (s.M_Locator_ID=l.M_Locator_ID)");
	sb.appendln("               INNER JOIN M_Product p ON (s.M_Product_ID=p.M_Product_ID)");
	sb.appendln("               LEFT OUTER JOIN M_AttributeSetInstance asi ON (s.M_AttributeSetInstance_ID=asi.M_AttributeSetInstance_ID)");
	sb.appendln("               WHERE l.M_Warehouse_ID=warehouse_id ");
	sb.appendln("               AND s.M_Product_ID=product_id");
	sb.appendln("	       AND (s.QtyOnHand-COALESCE(s.qtyreserved,0)) >= qty ");
	sb.appendln("	       AND s.AD_Org_ID IN (0,pAD_Org_ID)");
	sb.appendln("	       ORDER BY l.priorityno DESC, asi.guaranteedate DESC;");
	sb.appendln("       v_AttributeSetInstance_ID := COALESCE(v_AttributeSetInstance_ID, 0);");
	sb.appendln("       RETURN v_AttributeSetInstance_ID;");
	sb.appendln("END");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2017-06-21 08:49:28.0");
	sb.appendln("@Identifier=b4a2d4f4-4920-1357-924e-e3e3c0504e11");
	return sb.toString();
}
}
