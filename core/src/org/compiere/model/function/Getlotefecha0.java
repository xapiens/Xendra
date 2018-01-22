package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Getlotefecha0 
{
 
@XendraFunction(Name="getlotefecha",Output="date",Owner="xendra",Language="plpgsql",
Identifier="fb77d2a1-76aa-9f42-f644-33f4a070c41c",Arguments="p_attributesetinstance_id numeric",
Extension="",Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "fb77d2a1-76aa-9f42-f644-33f4a070c41c";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("DECLARE vencimiento date;");
	sb.appendln("BEGIN");
	sb.appendln("SELECT coalesce(guaranteedate,guaranteedate,'01/01/2012'::timestamp) into vencimiento FROM m_attributesetinstance where m_attributesetinstance_id = p_attributesetinstance_id;");
	sb.appendln("RETURN vencimiento;");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=fb77d2a1-76aa-9f42-f644-33f4a070c41c");
	return sb.toString();
}
}
