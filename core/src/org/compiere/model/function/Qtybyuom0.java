package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Qtybyuom0 
{
 
@XendraFunction(Name="qtybyuom",Output="numeric",Owner="xendra",Language="plpgsql",
Identifier="904a59d6-3ce3-16d3-8f03-53649e61dbe5",
Arguments="p_product_id numeric, p_warehouse_id numeric, p_uom_id numeric",Extension="",
Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "904a59d6-3ce3-16d3-8f03-53649e61dbe5";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("declare qty NUMERIC;");
	sb.appendln("declare uom NUMERIC;");
	sb.appendln("declare count_uom NUMERIC;");
	sb.appendln("BEGIN");
	sb.appendln("IF p_UOM_ID = 0  THEN");
	sb.appendln("    SELECT COUNT(C_UOM_TO_ID) INTO count_uom  FROM C_UOM_CONVERSION  WHERE C_UOM_CONVERSION.M_Product_ID = p_Product_ID;");
	sb.appendln("    if count_uom = 0 THEN ");
	sb.appendln("  Qty := 0;");
	sb.appendln("Return Qty;");
	sb.appendln("    ELSE");
	sb.appendln("        SELECT MAX(C_UOM_TO_ID) INTO uom FROM C_UOM_CONVERSION  WHERE C_UOM_CONVERSION.M_Product_ID = p_Product_ID;");
	sb.appendln("    END IF;");
	sb.appendln("ELSE");
	sb.appendln("    UOM = p_UOM_ID;");
	sb.appendln("END IF;");
	sb.appendln("-- hacemos trunc porque en una conversion no acepta decimales como resultado, 1/2 frasco? 1/2 tubo?");
	sb.appendln("SELECT TRUNC(bomQtyAvailable(p_Product_ID,p_Warehouse_ID,0) / COALESCE(uc.dividerate,uc.dividerate,1),0) into QTY");
	sb.appendln(" FROM C_UOM_Conversion uc WHERE uc.m_product_id = p_Product_ID AND");
	sb.appendln(" uc.C_UOM_TO_ID = UOM;");
	sb.appendln("return QTY;");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=904a59d6-3ce3-16d3-8f03-53649e61dbe5");
	return sb.toString();
}
}
