package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Namebyuom0 
{
 
@XendraFunction(Name="namebyuom",Output="character varying",Owner="xendra",Language="plpgsql",
Identifier="19c5c3de-7706-c3c2-a332-316e19bb7e2e",
Arguments="p_product_id numeric, c_uom_id numeric",Extension="",
Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "19c5c3de-7706-c3c2-a332-316e19bb7e2e";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("DECLARE UOM NUMERIC;");
	sb.appendln("DECLARE nameuom character varying;");
	sb.appendln("BEGIN");
	sb.appendln("IF C_UOM_ID = 0  THEN");
	sb.appendln("    SELECT MAX(C_UOM_TO_ID) INTO UOM FROM C_UOM_CONVERSION  WHERE C_UOM_CONVERSION.M_Product_ID = p_Product_ID;");
	sb.appendln("ELSE");
	sb.appendln("    UOM = C_UOM_ID;");
	sb.appendln("END IF;");
	sb.appendln("SELECT NAME INTO nameuom from c_UOM where c_UOM.C_UOM_ID = uom;");
	sb.appendln("return nameuom;");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=19c5c3de-7706-c3c2-a332-316e19bb7e2e");
	return sb.toString();
}
}
