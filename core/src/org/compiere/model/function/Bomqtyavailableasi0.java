package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Bomqtyavailableasi0 
{
 
@XendraFunction(Name="bomqtyavailableasi",Output="numeric",Owner="xendra",Language="plpgsql",
Identifier="6e769ade-7050-e2ab-4720-68b853970a30",
Arguments="product_id numeric, attributesetinstance_id numeric, warehouse_id numeric, locator_id numeric",
Extension="",Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "6e769ade-7050-e2ab-4720-68b853970a30";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("BEGIN");
	sb.appendln("RETURN bomQtyOnHandASI(Product_ID, AttributeSetInstance_ID, Warehouse_ID, Locator_ID) -");
	sb.appendln("       bomQtyReservedASI(Product_ID, AttributeSetInstance_ID, Warehouse_ID, Locator_ID);");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=6e769ade-7050-e2ab-4720-68b853970a30");
	return sb.toString();
}
}
