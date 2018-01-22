package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Existdocument0 
{
 
@XendraFunction(Name="existdocument",Output="boolean",Owner="postgres",Language="plpgsql",
Identifier="dcf7d045-6d78-7861-5f18-a66f2de678db",Arguments="tableid numeric, recordid numeric",
Extension="",Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "dcf7d045-6d78-7861-5f18-a66f2de678db";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("DECLARE");
	sb.appendln("    qry CHARACTER VARYING;");
	sb.appendln("    nametable CHARACTER VARYING;");
	sb.appendln("    ExistDoc Boolean;");
	sb.appendln("    row RECORD;");
	sb.appendln("BEGIN");
	sb.appendln("    ExistDoc := false;");
	sb.appendln("    SELECT tablename into nametable from ad_table t where t.ad_table_id = TableID;");
	sb.appendln("    if FOUND then");
	sb.appendln("qry := 'SELECT '|| nametable || '_ID FROM ' || nametable || ' WHERE ' || nametable || '_ID=' || RecordID;");
	sb.appendln("FOR row IN EXECUTE qry LOOP");
	sb.appendln("ExistDoc := true;");
	sb.appendln("END LOOP; ");
	sb.appendln("    END IF;");
	sb.appendln("    RETURN ExistDoc;");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=dcf7d045-6d78-7861-5f18-a66f2de678db");
	return sb.toString();
}
}
