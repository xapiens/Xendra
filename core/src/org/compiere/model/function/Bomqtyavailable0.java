package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Bomqtyavailable0 
{
 
@XendraFunction(Name="bomqtyavailable",Output="numeric",Owner="xendra",Language="plpgsql",
Identifier="35d41a4a-43ec-b96c-b528-9d0d798f9d54",
Arguments="product_id numeric, attributesetinstance_id numeric, warehouse_id numeric, locator_id numeric",
Extension="",Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "35d41a4a-43ec-b96c-b528-9d0d798f9d54";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("BEGIN");
	sb.appendln("RETURN bomQtyOnHand(Product_ID, Attributesetinstance_id, Warehouse_ID, Locator_ID)");
	sb.appendln("- bomQtyReserved(Product_ID, Attributesetinstance_id, Warehouse_ID, Locator_ID);");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=35d41a4a-43ec-b96c-b528-9d0d798f9d54");
	return sb.toString();
}
}
