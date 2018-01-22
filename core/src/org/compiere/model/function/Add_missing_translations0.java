package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Add_missing_translations0 
{
 
@XendraFunction(Name="add_missing_translations",Output="void",Owner="xendra",Language="plpgsql",
Identifier="9c49144f-0833-3347-83e6-a122c308e5ab",Arguments="",Extension="",
Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "9c49144f-0833-3347-83e6-a122c308e5ab";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("DECLARE");
	sb.appendln("   ins        VARCHAR (2000);");
	sb.appendln("   sel        VARCHAR (2000);");
	sb.appendln("   inssel     VARCHAR (4001);");
	sb.appendln("   table_id   NUMERIC;");
	sb.appendln("   t       RECORD;");
	sb.appendln("   c       RECORD;");
	sb.appendln("BEGIN");
	sb.appendln("   FOR t IN (SELECT ad_table_id,");
	sb.appendln("                    SUBSTR (tablename, 1, LENGTH (tablename) - 4) as tablename");
	sb.appendln("               FROM AD_TABLE");
	sb.appendln("              WHERE tablename LIKE '%_Trl' AND isactive = 'Y'");
	sb.appendln("                    AND isview = 'N')");
	sb.appendln("   LOOP");
	sb.appendln("      ins :=");
	sb.appendln("            'INSERT INTO '");
	sb.appendln("         || t.tablename");
	sb.appendln("         || '_TRL ('");
	sb.appendln("         || 'ad_language,ad_client_id,ad_org_id,created,createdby,updated,updatedby,isactive,istranslated,'");
	sb.appendln("         || t.tablename");
	sb.appendln("         || '_id';");
	sb.appendln("      sel :=");
	sb.appendln("            'SELECT l.ad_language,t.ad_client_id,t.ad_org_id,t.created,t.createdby,t.updated,t.updatedby,t.isactive,''N'' as istranslated,'");
	sb.appendln("         || t.tablename");
	sb.appendln("         || '_id';");
	sb.appendln("      SELECT ad_table_id");
	sb.appendln("        INTO table_id");
	sb.appendln("        FROM AD_TABLE");
	sb.appendln("       WHERE tablename = t.tablename;");
	sb.appendln("      FOR c IN (SELECT   col.columnname");
	sb.appendln("                    FROM AD_COLUMN col INNER JOIN AD_TABLE tab");
	sb.appendln("                         ON (col.ad_table_id = tab.ad_table_id)");
	sb.appendln("                   WHERE col.ad_table_id = table_id");
	sb.appendln("                     AND col.istranslated = 'Y'");
	sb.appendln("                     AND col.isactive = 'Y'");
	sb.appendln("                ORDER BY 1)");
	sb.appendln("      LOOP");
	sb.appendln("         ins := TRIM (ins) || ',' || TRIM (c.columnname);");
	sb.appendln("         sel := TRIM (sel) || ',t.' || TRIM (c.columnname);");
	sb.appendln("      END LOOP;");
	sb.appendln("      ins := TRIM (ins) || ')';");
	sb.appendln("      sel :=");
	sb.appendln("            TRIM (sel)");
	sb.appendln("         || ' from '");
	sb.appendln("         || t.tablename");
	sb.appendln("         || ' t, ad_language l WHERE l.issystemlanguage=''Y'' AND NOT EXISTS (SELECT 1 FROM '");
	sb.appendln("         || t.tablename");
	sb.appendln("         || '_TRL b WHERE b.'");
	sb.appendln("         || t.tablename");
	sb.appendln("         || '_id=t.'");
	sb.appendln("         || t.tablename");
	sb.appendln("         || '_id AND b.AD_LANGUAGE=l.AD_LANGUAGE)';");
	sb.appendln("      inssel := TRIM (ins) || ' ' || TRIM (sel);");
	sb.appendln("      EXECUTE inssel;");
	sb.appendln("   END LOOP;");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=9c49144f-0833-3347-83e6-a122c308e5ab");
	return sb.toString();
}
}
