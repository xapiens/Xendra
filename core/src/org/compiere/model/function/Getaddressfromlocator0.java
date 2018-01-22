package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Getaddressfromlocator0 
{
 
@XendraFunction(Name="getaddressfromlocator",Output="character varying",Owner="xendra",
Language="plpgsql",Identifier="83d27812-4842-3b07-f581-94ad4121adae",
Arguments="pm_locator_id numeric",Extension="",Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "83d27812-4842-3b07-f581-94ad4121adae";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("DECLARE");
	sb.appendln("	v_address VARCHAR(2000) := '';");
	sb.appendln("BEGIN");
	sb.appendln("	SELECT coalesce(cloc.address1,'') || ' ' || coalesce(cloc.address2,'') || ' ' || coalesce(cloc.city,'') INTO v_address from  xendra.m_locator loc");
	sb.appendln("	JOIN xendra.m_warehouse war ON loc.m_warehouse_id = war.m_warehouse_id");
	sb.appendln("	JOIN xendra.c_location cloc ON war.c_location_id = cloc.c_location_id");
	sb.appendln("	WHERE loc.m_locator_id = pm_locator_id;");
	sb.appendln("	--");
	sb.appendln("	RETURN v_address;");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=83d27812-4842-3b07-f581-94ad4121adae");
	return sb.toString();
}
}
