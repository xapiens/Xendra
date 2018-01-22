package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Table_name2id0 
{
 
@XendraFunction(Name="table_name2id",Output="numeric",Owner="xendra",Language="plpgsql",
Identifier="5b2915c6-29bd-ba44-6b99-2d9808e4ac4d",Arguments="p_name character varying",
Extension="",Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "5b2915c6-29bd-ba44-6b99-2d9808e4ac4d";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("DECLARE");
	sb.appendln("	p_AD_Table_ID	NUMERIC(10);");
	sb.appendln("BEGIN");
	sb.appendln("	p_AD_Table_ID:=0;");
	sb.appendln("	SELECT");
	sb.appendln("		AD_Table_ID INTO p_AD_Table_ID");
	sb.appendln("	FROM");
	sb.appendln("		AD_Table");
	sb.appendln("	WHERE");
	sb.appendln("		UPPER(trim(TableName))=UPPER(trim(p_name));");
	sb.appendln("	RETURN p_AD_Table_ID;");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=5b2915c6-29bd-ba44-6b99-2d9808e4ac4d");
	return sb.toString();
}
}
