package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Getlote0 
{
 
@XendraFunction(Name="getlote",Output="character",Owner="xendra",Language="plpgsql",
Identifier="2f870f15-8850-16d2-62b1-84b79e273439",Arguments="p_attributesetinstance_id numeric",
Extension="",Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "2f870f15-8850-16d2-62b1-84b79e273439";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("DECLARE lote CHARACTER(40);");
	sb.appendln("BEGIN");
	sb.appendln("SELECT coalesce(lot,lot,' ') into lote FROM m_attributesetinstance where m_attributesetinstance_id = p_attributesetinstance_id;");
	sb.appendln("RETURN lote;");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=2f870f15-8850-16d2-62b1-84b79e273439");
	return sb.toString();
}
}
