package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Drop_client0 
{
 
@XendraFunction(Name="drop_client",Output="integer",Owner="xendra",Language="plpgsql",
Identifier="1374911b-17d2-a349-66ab-e303b0aab8a3",Arguments="client_id integer",Extension="",
Synchronized="2017-11-29 01:27:28.0")
	public static final String Identifier = "1374911b-17d2-a349-66ab-e303b0aab8a3";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("DECLARE ");
	sb.appendln("    --schema_name text := $1; ");
	sb.appendln("    --c_id integer := $2; ");
	sb.appendln("    _TABLEID NUMERIC := 0;    ");
	sb.appendln("    r_table RECORD; ");
	sb.appendln("    _found NUMERIC := 0;");
	sb.appendln("    ERRORS BOOLEAN := true;");
	sb.appendln("    --tableexception text := '';");
	sb.appendln("    _SQLERRM text := '';");
	sb.appendln("    _tableexception  text[];");
	sb.appendln("BEGIN ");
	sb.appendln("    --RAISE NOTICE 'Setting search_path=%', schema_name; ");
	sb.appendln("    --EXECUTE 'SET search_path=' || db_name; ");
	sb.appendln("    RAISE NOTICE 'Deleting Client Where AD_Client_ID=%', client_id; ");
	sb.appendln("    RAISE NOTICE 'Disable triggers and constraints';");
	sb.appendln("    --update pg_trigger set tgenabled = 'D' where oid in ( ");
	sb.appendln("    --    select tr.oid from pg_class cl, pg_trigger tr, pg_namespace ns ");
	sb.appendln("    --        where tr.tgrelid = cl.oid ");
	sb.appendln("    --            and  cl.relnamespace = ns.oid ");
	sb.appendln("    --            and ns.nspname = (SELECT current_database()));  ");
	sb.appendln("    SET CONSTRAINTS ALL DEFERRED;    ");
	sb.appendln("    WHILE ERRORS LOOP");
	sb.appendln("    BEGIN");
	sb.appendln("    RAISE NOTICE 'Removing records belonging to client %', client_id;     ");
	sb.appendln("    IF (array_length(_tableexception, 1) > 0) THEN    ");
	sb.appendln("	for i in array_lower(_tableexception, 1)..array_upper(_tableexception, 1) loop");
	sb.appendln("	EXECUTE 'DELETE FROM ' || _tableexception[i] || ' WHERE AD_CLIENT_ID = ' || client_id;");
	sb.appendln("	end loop;	");
	sb.appendln("	--tableexception := betweendoublequotes(_SQLERRM,1);");
	sb.appendln("	--EXECUTE 'DELETE FROM ' || tableexception || ' WHERE AD_CLIENT_ID = ' || client_id;");
	sb.appendln("    END IF;");
	sb.appendln("    FOR r_table IN ");
	sb.appendln("        SELECT tablename, 'AD_Client_ID' AS columnname");
	sb.appendln("            FROM AD_TABLE a");
	sb.appendln("            WHERE a.isview = 'N'");
	sb.appendln("                AND EXISTS (");
	sb.appendln("                    SELECT ad_column_id");
	sb.appendln("                        FROM AD_COLUMN c");
	sb.appendln("                        WHERE a.ad_table_id = c.ad_table_id");
	sb.appendln("                        AND UPPER (c.columnname) = 'AD_CLIENT_ID')");
	sb.appendln("	        -- TODO Assure that the table is really a table in database");
	sb.appendln("	        -- AND EXISTS (SELECT 1 FROM user_objects dbo WHERE UPPER(dbo.object_name)=UPPER(a.TableName) AND dbo.object_type='TABLE')");
	sb.appendln("        UNION");
	sb.appendln("        SELECT tablename, columnname");
	sb.appendln("            FROM AD_COLUMN c, AD_TABLE t");
	sb.appendln("            WHERE ad_reference_value_id = 129");
	sb.appendln("                AND UPPER (columnname) <> 'AD_CLIENT_ID'");
	sb.appendln("                AND t.ad_table_id = c.ad_table_id");
	sb.appendln("                -- TODO Assure that the table is really a table in database");
	sb.appendln("                -- AND EXISTS (SELECT 1 FROM user_objects dbo WHERE UPPER(dbo.object_name)=UPPER(t.TableName) AND dbo.object_type='TABLE')");
	sb.appendln("    LOOP ");
	sb.appendln("        RAISE NOTICE 'Removing items from table - %', r_table.tablename; ");
	sb.appendln("        BEGIN");
	sb.appendln("        EXECUTE 'DELETE FROM ' || r_table.tablename || ' WHERE ' || r_table.columnname || ' = ' || client_id;");
	sb.appendln("        EXCEPTION WHEN OTHERS THEN");
	sb.appendln("		SELECT AD_TABLE_ID INTO _TABLEID FROM AD_TABLE  WHERE TABLENAME = r_table.tablename;");
	sb.appendln("		IF _TABLEID > 0 THEN");
	sb.appendln("			SELECT count(*) into _found FROM INFORMATION_SCHEMA.views ");
	sb.appendln("				WHERE table_schema = ANY (current_schemas(false)) AND table_name = LOWER(r_table.tablename);			");
	sb.appendln("			IF _found > 0 THEN");
	sb.appendln("				UPDATE AD_TABLE SET ISVIEW = 'Y' WHERE AD_TABLE_ID = _TABLEID;				");
	sb.appendln("			ELSE");
	sb.appendln("				DELETE FROM AD_TABLE WHERE AD_TABLE_ID = _TABLEID;");
	sb.appendln("				DELETE FROM AD_COLUMN WHERE AD_TABLE_ID = _TABLEID;");
	sb.appendln("			END IF;");
	sb.appendln("		END IF;");
	sb.appendln("        END;");
	sb.appendln("    END LOOP; ");
	sb.appendln("    RAISE NOTICE 'Enable triggers & constraints'; ");
	sb.appendln("    --update pg_trigger set tgenabled = 'O' where oid in ( ");
	sb.appendln("    --    select tr.oid from pg_class cl, pg_trigger tr, pg_namespace ns ");
	sb.appendln("    --        where tr.tgrelid = cl.oid ");
	sb.appendln("    --            and  cl.relnamespace = ns.oid ");
	sb.appendln("    --            and ns.nspname = (SELECT current_database())); ");
	sb.appendln("    SET CONSTRAINTS ALL IMMEDIATE;    ");
	sb.appendln("    ERRORS := FALSE;");
	sb.appendln("    EXCEPTION WHEN OTHERS THEN     ");
	sb.appendln("	_SQLERRM = SQLERRM;");
	sb.appendln("	RAISE NOTICE '% %', SQLERRM, SQLSTATE;");
	sb.appendln("	--NOTICE:  update or delete on table \"ad_user\" violates foreign key constraint \"aduser_adwfeventaudit\" on table \"ad_wf_eventaudit\" 23503");
	sb.appendln("	IF SQLSTATE = '23503'::text THEN	");
	sb.appendln("	    SET CONSTRAINTS ALL DEFERRED;      ");
	sb.appendln("	--select betweendoublequotes('update or delete on table \"ad_user\" violates foreign key constraint \"aduser_adwfeventaudit\" on table \"ad_wf_eventaudit\"',3)	");
	sb.appendln("	_tableexception := array_append(_tableexception,betweendoublequotes(_SQLERRM,3));");
	sb.appendln("	_tableexception := array_append(_tableexception,betweendoublequotes(_SQLERRM,1));");
	sb.appendln("	END IF;");
	sb.appendln("    END;           ");
	sb.appendln("    END LOOP;");
	sb.appendln("    RAISE NOTICE 'Done'; ");
	sb.appendln("    RETURN 1; ");
	sb.appendln("END; ");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2017-11-29 01:27:28.0");
	sb.appendln("@Identifier=1374911b-17d2-a349-66ab-e303b0aab8a3");
	return sb.toString();
}
}
