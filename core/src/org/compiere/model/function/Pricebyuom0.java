package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Pricebyuom0 
{
 
@XendraFunction(Name="pricebyuom",Output="numeric",Owner="xendra",Language="plpgsql",
Identifier="9e5a501e-a83d-064f-31e6-1fbbe44deb29",
Arguments="p_product_id numeric, p_pricelist_version_id numeric, p_uom_id numeric",Extension="",
Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "9e5a501e-a83d-064f-31e6-1fbbe44deb29";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("declare price NUMERIC;");
	sb.appendln("DECLARE UOM NUMERIC;");
	sb.appendln("BEGIN");
	sb.appendln("IF p_UOM_ID = 0  THEN");
	sb.appendln("    SELECT MAX(C_UOM_TO_ID) INTO UOM FROM C_UOM_CONVERSION  WHERE C_UOM_CONVERSION.M_Product_ID = p_Product_ID;");
	sb.appendln("ELSE");
	sb.appendln("    UOM = p_UOM_ID;");
	sb.appendln("END IF;");
	sb.appendln("SELECT bomPriceList(p_Product_ID,p_pricelist_version_id) *COALESCE(uc.dividerate,uc.dividerate,1) into price");
	sb.appendln(" FROM C_UOM_Conversion uc WHERE uc.m_product_id = p_Product_ID AND");
	sb.appendln(" uc.C_UOM_TO_ID = UOM;");
	sb.appendln("return price;");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=9e5a501e-a83d-064f-31e6-1fbbe44deb29");
	return sb.toString();
}
}
