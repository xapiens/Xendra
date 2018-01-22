package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Getwarehousevaluefromlocator0 
{
 
@XendraFunction(Name="getwarehousevaluefromlocator",Output="character varying",Owner="xendra",
Language="plpgsql",Identifier="1cdf3e1a-a9ee-3411-2df9-d30ea377e9a5",
Arguments="pm_locator_id numeric",Extension="",Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "1cdf3e1a-a9ee-3411-2df9-d30ea377e9a5";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("DECLARE");
	sb.appendln("    v_value VARCHAR(2000) := '';");
	sb.appendln("BEGIN");
	sb.appendln("    SELECT war.value INTO v_value from m_locator loc");
	sb.appendln("    JOIN xendra.m_warehouse war ON  war.m_warehouse_id = loc.m_warehouse_id");
	sb.appendln("    WHERE loc.m_locator_id = pm_locator_id;");
	sb.appendln("    --");
	sb.appendln("    RETURN v_value;");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=1cdf3e1a-a9ee-3411-2df9-d30ea377e9a5");
	return sb.toString();
}
}
