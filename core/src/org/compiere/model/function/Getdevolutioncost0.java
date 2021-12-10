package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Getdevolutioncost0 
{
 
@XendraFunction(Name="getdevolutioncost",Output="numeric",Owner="xendra",Language="plpgsql",
Identifier="41cbfddd-a3bd-9659-a621-8d202964f836",
Arguments="ad_client_id numeric, costelement_id numeric, inoutline_id numeric, m_product_id numeric, movementdate timestamp without time zone",
Extension="",Synchronized="2020-02-13 16:04:22.0")
	public static final String Identifier = "41cbfddd-a3bd-9659-a621-8d202964f836";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("DECLARE");
	sb.appendln(" _newCost NUMERIC := 0;");
	sb.appendln(" inout_id NUMERIC;");
	sb.appendln(" _returndate TIMESTAMP;");
	sb.appendln("BEGIN");
	sb.appendln("    SELECT m_inout_id into inout_id ");
	sb.appendln("	FROM m_inoutline ");
	sb.appendln("	WHERE m_inoutline_id = inoutline_id;");
	sb.appendln("    inout_id := COALESCE(inout_id,0);");
	sb.appendln("    IF inout_id > 0 THEN ");
	sb.appendln("      _returndate := xendra.getiocostdate(inoutline_id,'+');");
	sb.appendln("     _returndate := COALESCE(_returndate,movementdate);");
	sb.appendln("     _newCost := xendra.getaveragecost(AD_Client_ID,								     ");
	sb.appendln("				      costelement_id,");
	sb.appendln("				      M_Product_ID,");
	sb.appendln("				      _returndate, false); 	");
	sb.appendln("    END IF;");
	sb.appendln("    return _newCost;");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2020-02-13 16:04:22.0");
	sb.appendln("@Identifier=41cbfddd-a3bd-9659-a621-8d202964f836");
	return sb.toString();
}
}
