package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Mayorfactoruoc0 
{
 
@XendraFunction(Name="mayorfactoruoc",Output="numeric",Owner="xendra",Language="plpgsql",
Identifier="1db2de5d-fde5-fbb4-7261-c3e3795f8277",Arguments="p_product_id numeric",Extension="",
Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "1db2de5d-fde5-fbb4-7261-c3e3795f8277";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("DECLARE rate numeric;");
	sb.appendln("DECLARE p_uom_id NUMERIC;");
	sb.appendln("BEGIN");
	sb.appendln("SELECT MAX(c_uom_to_id) into p_uom_id FROM C_UOM_CONVERSION WHERE C_UOM_Conversion.m_product_id = p_product_id;");
	sb.appendln("SELECT COALESCE(uc.dividerate,uc.dividerate,1) into rate ");
	sb.appendln("FROM c_uom_conversion uc WHERE uc.m_product_id = p_Product_ID and uc.c_uom_to_id = p_uom_id;");
	sb.appendln("RETURN rate;");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=1db2de5d-fde5-fbb4-7261-c3e3795f8277");
	return sb.toString();
}
}
