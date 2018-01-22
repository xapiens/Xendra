package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Getwarehousenamefromlocator0 
{
 
@XendraFunction(Name="getwarehousenamefromlocator",Output="character varying",Owner="xendra",
Language="plpgsql",Identifier="5619f07e-1bb6-7155-a901-c768e926dc3d",
Arguments="pm_locator_id numeric",Extension="",Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "5619f07e-1bb6-7155-a901-c768e926dc3d";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("DECLARE");
	sb.appendln("    v_name VARCHAR(2000) := '';");
	sb.appendln("BEGIN");
	sb.appendln("    SELECT war.name INTO v_name from m_locator loc");
	sb.appendln("    JOIN xendra.m_warehouse war ON  war.m_warehouse_id = loc.m_warehouse_id");
	sb.appendln("    WHERE loc.m_locator_id = pm_locator_id;");
	sb.appendln("    --");
	sb.appendln("    RETURN v_name;");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=5619f07e-1bb6-7155-a901-c768e926dc3d");
	return sb.toString();
}
}
