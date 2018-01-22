package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Update_sequences0 
{
 
@XendraFunction(Name="update_sequences",Output="void",Owner="xendra",Language="plpgsql",
Identifier="f9e4140c-9e35-81dc-5621-ee131568e695",Arguments="",Extension="",
Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "f9e4140c-9e35-81dc-5621-ee131568e695";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("-- TODO: Currently not inserting new sequences");
	sb.appendln("DECLARE");
	sb.appendln("   cmdsys           VARCHAR (1000);");
	sb.appendln("   cmdnosys         VARCHAR (1000);");
	sb.appendln("   cmdseq           VARCHAR (1000);");
	sb.appendln("   cmdupd           VARCHAR (1000);");
	sb.appendln("   currentnextsys   NUMERIC (10);");
	sb.appendln("   currentnext      NUMERIC (10);");
	sb.appendln("   currentseqsys    NUMERIC (10);");
	sb.appendln("   currentseq       NUMERIC (10);");
	sb.appendln("   ok               BOOLEAN;");
	sb.appendln("   r                RECORD;");
	sb.appendln("BEGIN");
	sb.appendln("   FOR r IN (SELECT   tablename");
	sb.appendln("                 FROM AD_TABLE t");
	sb.appendln("                WHERE EXISTS (");
	sb.appendln("                         SELECT 1");
	sb.appendln("                           FROM AD_COLUMN c");
	sb.appendln("                          WHERE t.ad_table_id = c.ad_table_id");
	sb.appendln("                            AND c.columnname = t.tablename || '_ID')");
	sb.appendln("             ORDER BY 1)");
	sb.appendln("   LOOP");
	sb.appendln("      cmdsys :=");
	sb.appendln("            'SELECT  MAX ('");
	sb.appendln("         || r.tablename");
	sb.appendln("         || '_id) as currentnextsys FROM '");
	sb.appendln("         || r.tablename");
	sb.appendln("         || ' where '");
	sb.appendln("         || r.tablename");
	sb.appendln("         || '_id<1000000';");
	sb.appendln("      ok := true;");
	sb.appendln("      BEGIN");
	sb.appendln("         EXECUTE cmdsys INTO currentnextsys;");
	sb.appendln("      EXCEPTION");
	sb.appendln("         WHEN OTHERS");
	sb.appendln("         THEN");
	sb.appendln("            ok := false;");
	sb.appendln("      END;");
	sb.appendln("    IF ok THEN");
	sb.appendln("      IF currentnextsys IS NULL");
	sb.appendln("      THEN");
	sb.appendln("         currentnextsys := 0;");
	sb.appendln("      END IF;");
	sb.appendln("      SELECT INTO currentnextsys CASE SIGN (currentnextsys - 50000)");
	sb.appendln("                     WHEN -1 THEN 50000");
	sb.appendln("                     ELSE coalesce (currentnextsys + 1, 50000)");
	sb.appendln("                     END;");
	sb.appendln("      cmdnosys :=");
	sb.appendln("            'SELECT  MAX ('");
	sb.appendln("         || r.tablename");
	sb.appendln("         || '_id) as currentnext FROM '");
	sb.appendln("         || r.tablename");
	sb.appendln("         || ' where '");
	sb.appendln("         || r.tablename");
	sb.appendln("         || '_id>=1000000';");
	sb.appendln("      EXECUTE cmdnosys INTO currentnext;");
	sb.appendln("      IF currentnext IS NULL");
	sb.appendln("      THEN");
	sb.appendln("         currentnext := 0;");
	sb.appendln("      END IF;");
	sb.appendln("      SELECT INTO currentnext CASE SIGN (currentnext - 1000000)");
	sb.appendln("                     WHEN -1 THEN 1000000");
	sb.appendln("                     ELSE coalesce (currentnext + 1, 1000000)");
	sb.appendln("                     END ;");
	sb.appendln("      cmdseq :=");
	sb.appendln("            'SELECT currentnext, currentnextsys FROM AD_Sequence '");
	sb.appendln("         || 'WHERE Name = '''");
	sb.appendln("         || r.tablename");
	sb.appendln("         || ''' AND istableid = ''Y''';");
	sb.appendln("      EXECUTE cmdseq INTO currentseq, currentseqsys;");
	sb.appendln("      IF currentnextsys <> currentseqsys OR currentnext <> currentseq");
	sb.appendln("      THEN");
	sb.appendln("         cmdupd :=");
	sb.appendln("               'update ad_sequence set currentnextsys = '");
	sb.appendln("            || currentnextsys");
	sb.appendln("            || ', currentnext='");
	sb.appendln("            || currentnext");
	sb.appendln("            || ' where name='''");
	sb.appendln("            || r.tablename");
	sb.appendln("            || ''' and istableid=''Y''';");
	sb.appendln("         EXECUTE cmdupd;");
	sb.appendln("      END IF;");
	sb.appendln("    END IF;");
	sb.appendln("   END LOOP;");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=f9e4140c-9e35-81dc-5621-ee131568e695");
	return sb.toString();
}
}
