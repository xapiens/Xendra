package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Create_index_if_not_exists0 
{
 
@XendraFunction(Name="create_index_if_not_exists",Output="void",Owner="xendra",Language="plpgsql",
Identifier="56a0c3d8-5b7b-4877-9a50-48c25fabe8cf",
Arguments="t_name text, i_name text, index_sql text",Extension="",
Synchronized="2015-10-28 10:56:44.0")
	public static final String Identifier = "56a0c3d8-5b7b-4877-9a50-48c25fabe8cf";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("DECLARE");
	sb.appendln("  full_index_name varchar;");
	sb.appendln("  schema_name varchar;");
	sb.appendln("BEGIN");
	sb.appendln("full_index_name = t_name || '_' || i_name;");
	sb.appendln("schema_name = 'xendra';");
	sb.appendln("IF NOT EXISTS (");
	sb.appendln("    SELECT 1");
	sb.appendln("    FROM   pg_class c");
	sb.appendln("    JOIN   pg_namespace n ON n.oid = c.relnamespace");
	sb.appendln("    WHERE  c.relname = full_index_name");
	sb.appendln("    AND    n.nspname = schema_name");
	sb.appendln("    ) THEN");
	sb.appendln("    execute 'CREATE INDEX ' || full_index_name || ' ON ' || schema_name || '.' || t_name || ' ' || index_sql;");
	sb.appendln("END IF;");
	sb.appendln("END");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2015-10-28 10:56:44.0");
	sb.appendln("@Identifier=56a0c3d8-5b7b-4877-9a50-48c25fabe8cf");
	return sb.toString();
}
}
