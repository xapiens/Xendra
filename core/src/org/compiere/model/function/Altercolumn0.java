package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Altercolumn0 
{
 
@XendraFunction(Name="altercolumn",Output="void",Owner="xendra",Language="plpgsql",
Identifier="cf97edbb-ce6b-5607-76fb-698b6bb9fcc1",
Arguments="tablename name, columnname name, datatype name, nullclause character varying, defaultclause character varying",
Extension="",Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "cf97edbb-ce6b-5607-76fb-698b6bb9fcc1";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("declare");
	sb.appendln("   command text;");
	sb.appendln("   viewtext text[];");
	sb.appendln("   viewname name[];");
	sb.appendln("   dropviews name[];");
	sb.appendln("   i int;");
	sb.appendln("   j int;");
	sb.appendln("   v record;");
	sb.appendln("   sqltype       text;");
	sb.appendln("   sqltype_short text;");
	sb.appendln("   typename name;");
	sb.appendln("begin");
	sb.appendln("   if datatype is not null then");
	sb.appendln("select pg_type.typname, format_type(pg_type.oid, pg_attribute.atttypmod)");
	sb.appendln("        into typename, sqltype");
	sb.appendln("        from pg_class, pg_attribute, pg_type");
	sb.appendln("        where relname = lower(tablename)");
	sb.appendln("        and relkind = 'r'");
	sb.appendln("        and pg_class.oid = pg_attribute.attrelid");
	sb.appendln("        and attname = lower(columnname)");
	sb.appendln("        and atttypid = pg_type.oid;");
	sb.appendln("        sqltype_short := sqltype;");
	sb.appendln("        if typename = 'numeric' then");
	sb.appendln("   sqltype_short := replace(sqltype, ',0', '');");
	sb.appendln("        elsif strpos(sqltype,'character varying') = 1 then");
	sb.appendln("   sqltype_short := replace(sqltype, 'character varying', 'varchar');");
	sb.appendln("        elsif sqltype = 'timestamp without time zone' then");
	sb.appendln("           sqltype_short := 'timestamp';");
	sb.appendln("        end if;");
	sb.appendln("        if lower(datatype) <> sqltype and lower(datatype) <> sqltype_short then");
	sb.appendln("i := 0;");
	sb.appendln("for v in select a.relname, a.oid");
	sb.appendln("from pg_class a, pg_depend b, pg_depend c, pg_class d, pg_attribute e");
	sb.appendln("where a.oid = b.refobjid");
	sb.appendln("and b.objid = c.objid");
	sb.appendln("and b.refobjid <> c.refobjid");
	sb.appendln("and b.deptype = 'n'");
	sb.appendln("and c.refobjid = d.oid");
	sb.appendln("and d.relname = lower(tablename)");
	sb.appendln("and d.relkind = 'r'");
	sb.appendln("and d.oid = e.attrelid");
	sb.appendln("and e.attname = lower(columnname)");
	sb.appendln("and c.refobjsubid = e.attnum");
	sb.appendln("and a.relkind = 'v'");
	sb.appendln("loop");
	sb.appendln("    i := i + 1;");
	sb.appendln("    viewtext[i] := pg_get_viewdef(v.oid);");
	sb.appendln("    viewname[i] := v.relname;");
	sb.appendln("end loop;");
	sb.appendln("if i > 0 then");
	sb.appendln("   begin");
	sb.appendln("     for j in 1 .. i loop");
	sb.appendln("        command := 'drop view ' || viewname[j];");
	sb.appendln("        execute command;");
	sb.appendln("        dropviews[j] := viewname[j];");
	sb.appendln("     end loop;");
	sb.appendln("                     exception");
	sb.appendln("                        when others then");
	sb.appendln("                          i := array_upper(dropviews, 1);");
	sb.appendln("                          if i > 0 then");
	sb.appendln("                             for j in 1 .. i loop");
	sb.appendln("                                command := 'create or replace view ' || dropviews[j] || ' as ' || viewtext[j];");
	sb.appendln("                execute command;");
	sb.appendln("                             end loop;");
	sb.appendln("                          end if;");
	sb.appendln("                          raise exception 'Failed to recreate dependent view';");
	sb.appendln("                   end;");
	sb.appendln("end if;");
	sb.appendln("command := 'alter table ' || lower(tablename) || ' alter column ' || lower(columnname) || ' type ' || lower(datatype);");
	sb.appendln("execute command;");
	sb.appendln("                i := array_upper(dropviews, 1);");
	sb.appendln("if i > 0 then");
	sb.appendln("   for j in 1 .. i loop");
	sb.appendln("     command := 'create or replace view ' || dropviews[j] || ' as ' || viewtext[j];");
	sb.appendln("     execute command;");
	sb.appendln("   end loop;");
	sb.appendln("end if;");
	sb.appendln("        end if;");
	sb.appendln("   end if;");
	sb.appendln("   if defaultclause is not null then");
	sb.appendln("       if lower(defaultclause) = 'null' then");
	sb.appendln("          command := 'alter table ' || lower(tablename) || ' alter column ' || lower(columnname) || ' drop default ';");
	sb.appendln("       else");
	sb.appendln("  command := 'alter table ' || lower(tablename) || ' alter column ' || lower(columnname) || ' set default ''' || defaultclause || '''';");
	sb.appendln("       end if;");
	sb.appendln("       execute command;");
	sb.appendln("   end if;");
	sb.appendln("   if nullclause is not null then");
	sb.appendln("      if lower(nullclause) = 'not null' then");
	sb.appendln("          command := 'alter table ' || lower(tablename) || ' alter column ' || lower(columnname) || ' set not null';");
	sb.appendln("          execute command;");
	sb.appendln("      elsif lower(nullclause) = 'null' then");
	sb.appendln("          command := 'alter table ' || lower(tablename) || ' alter column ' || lower(columnname) || ' drop not null';");
	sb.appendln("          execute command;");
	sb.appendln("      end if;");
	sb.appendln("   end if;");
	sb.appendln("end;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=cf97edbb-ce6b-5607-76fb-698b6bb9fcc1");
	return sb.toString();
}
}
