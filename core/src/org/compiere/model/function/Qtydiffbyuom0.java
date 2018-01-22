package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Qtydiffbyuom0 
{
 
@XendraFunction(Name="qtydiffbyuom",Output="numeric",Owner="xendra",Language="plpgsql",
Identifier="795806ff-a509-d5d9-aa9f-d0e38d6b6260",
Arguments="p_product_id numeric, p_warehouse_id numeric, p_uom_id numeric",Extension="",
Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "795806ff-a509-d5d9-aa9f-d0e38d6b6260";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("declare QTYTOTAL NUMERIC;");
	sb.appendln("declare QTY NUMERIC;");
	sb.appendln("declare uom NUMERIC;");
	sb.appendln("DECLARE v_rate NUMERIC;");
	sb.appendln("BEGIN");
	sb.appendln("IF p_UOM_ID = 0  THEN");
	sb.appendln("    SELECT MAX(C_UOM_TO_ID) INTO uom FROM C_UOM_CONVERSION  WHERE C_UOM_CONVERSION.M_Product_ID = p_Product_ID;");
	sb.appendln("ELSE");
	sb.appendln("    UOM = p_UOM_ID;");
	sb.appendln("END IF;");
	sb.appendln("if UOM > 0 THEN ");
	sb.appendln("-- hacemos trunc porque en una conversion no acepta decimales como resultado, 1/2 frasco? 1/2 tubo?");
	sb.appendln("SELECT TRUNC(bomQtyAvailable(p_Product_ID,p_Warehouse_ID,0) / COALESCE(uc.dividerate,uc.dividerate,1),0),");
	sb.appendln("COALESCE(uc.dividerate,uc.dividerate,1) into QTYTOTAL,v_rate  ");
	sb.appendln("FROM C_UOM_Conversion uc WHERE uc.m_product_id = p_Product_ID AND uc.C_UOM_TO_ID = UOM;");
	sb.appendln("QTY :=  bomQtyAvailable(p_Product_ID,p_Warehouse_ID,0) - ( QTYTOTAL * v_RATE);");
	sb.appendln("ELSE");
	sb.appendln("QTY := bomQtyAvailable(p_Product_ID,p_Warehouse_ID,0);");
	sb.appendln("END IF;");
	sb.appendln("return QTY;");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=795806ff-a509-d5d9-aa9f-d0e38d6b6260");
	return sb.toString();
}
}
