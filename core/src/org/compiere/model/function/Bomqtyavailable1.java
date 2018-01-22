package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Bomqtyavailable1 
{
 
@XendraFunction(Name="bomqtyavailable",Output="numeric",Owner="xendra",Language="plpgsql",
Identifier="48a5944d-2358-a334-4650-8734d70e24dc",
Arguments="product_id numeric, warehouse_id numeric, locator_id numeric",Extension="",
Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "48a5944d-2358-a334-4650-8734d70e24dc";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("BEGIN");
	sb.appendln("RETURN bomQtyOnHand(Product_ID, Warehouse_ID, Locator_ID) - bomQtyReserved(Product_ID, Warehouse_ID, Locator_ID);");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=48a5944d-2358-a334-4650-8734d70e24dc");
	return sb.toString();
}
}
