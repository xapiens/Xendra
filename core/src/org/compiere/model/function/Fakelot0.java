package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Fakelot0 
{
 
@XendraFunction(Name="fakelot",Output="text",Owner="xendra",Language="plpgsql",
Identifier="5501397f-0b1b-9fbf-ac47-1731f684611e",Arguments="p_product_id numeric",Extension="",
Synchronized="2018-03-17 19:55:28.0")
	public static final String Identifier = "5501397f-0b1b-9fbf-ac47-1731f684611e";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("declare");
	sb.appendln("_lot text;");
	sb.appendln("begin  ");
	sb.appendln("  select substr(to_char(coalesce(guaranteedate,null::date),'DD/MM/YYYY') || ' <'||trim(lot)||'> '||repeat(' ', 20),0,30) ");
	sb.appendln("  into _lot");
	sb.appendln("  from m_attributesetinstance where m_attributesetinstance_id = ");
	sb.appendln("	(SELECT max(m_attributesetinstance_id) from m_storage where m_product_id = p_product_id);");
	sb.appendln("  _lot := COALESCE(_lot,repeat(' ', 30));");
	sb.appendln("  return _lot;");
	sb.appendln("end  ");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2018-03-17 19:55:28.0");
	sb.appendln("@Identifier=5501397f-0b1b-9fbf-ac47-1731f684611e");
	return sb.toString();
}
}
