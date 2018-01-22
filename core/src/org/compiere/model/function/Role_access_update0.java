package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Role_access_update0 
{
 
@XendraFunction(Name="role_access_update",Output="void",Owner="xendra",Language="plpgsql",
Identifier="4b780545-1709-762a-4d56-6e5d7d14df33",Arguments="",Extension="",
Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "4b780545-1709-762a-4d56-6e5d7d14df33";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("DECLARE");
	sb.appendln("   roleaccesslevel      VARCHAR (200);");
	sb.appendln("   roleaccesslevelwin   VARCHAR (200);");
	sb.appendln("   sqlins               VARCHAR (2000);");
	sb.appendln("   r                    RECORD;");
	sb.appendln("BEGIN");
	sb.appendln("   FOR r IN (SELECT   ad_role_id, userlevel, NAME");
	sb.appendln("                 FROM AD_ROLE");
	sb.appendln("                WHERE ismanual = 'N'");
	sb.appendln("             ORDER BY ad_role_id)");
	sb.appendln("   LOOP");
	sb.appendln("      DELETE FROM AD_WINDOW_ACCESS");
	sb.appendln("            WHERE ad_role_id = r.ad_role_id;");
	sb.appendln("      DELETE FROM AD_PROCESS_ACCESS");
	sb.appendln("            WHERE ad_role_id = r.ad_role_id;");
	sb.appendln("      DELETE FROM AD_FORM_ACCESS");
	sb.appendln("            WHERE ad_role_id = r.ad_role_id;");
	sb.appendln("      DELETE FROM AD_WORKFLOW_ACCESS");
	sb.appendln("            WHERE ad_role_id = r.ad_role_id;");
	sb.appendln("      IF r.userlevel = 'S  '                                        -- system");
	sb.appendln("      THEN");
	sb.appendln("         roleaccesslevel := '(''4'',''7'',''6'')';");
	sb.appendln("         roleaccesslevelwin := roleaccesslevel;");
	sb.appendln("      ELSIF r.userlevel = ' C '                                      -- client");
	sb.appendln("      THEN");
	sb.appendln("         roleaccesslevel := '(''7'',''6'',''3'',''2'')';");
	sb.appendln("         roleaccesslevelwin := roleaccesslevel;");
	sb.appendln("      ELSIF r.userlevel = ' CO'                                -- client + org");
	sb.appendln("      THEN");
	sb.appendln("         roleaccesslevel := '(''7'',''6'',''3'',''2'',''1'')';");
	sb.appendln("         roleaccesslevelwin := roleaccesslevel;");
	sb.appendln("      ELSE                                                    -- org or others");
	sb.appendln("         roleaccesslevel := '(''3'',''1'',''7'')';");
	sb.appendln("         roleaccesslevelwin :=");
	sb.appendln("                        roleaccesslevel || ' AND w.Name NOT LIKE ''%(all)%''';");
	sb.appendln("      END IF;");
	sb.appendln("      sqlins :=");
	sb.appendln("            'INSERT INTO AD_Window_Access (AD_Window_ID, AD_Role_ID, AD_Client_ID,AD_Org_ID,IsActive,Created,CreatedBy,Updated,UpdatedBy,IsReadWrite) SELECT DISTINCT w.AD_Window_ID, '");
	sb.appendln("         || r.ad_role_id");
	sb.appendln("         || ',0,0,''Y'', Current_Timestamp,0, Current_Timestamp,0,''Y'' FROM AD_Window w INNER JOIN AD_Tab t ON (w.AD_Window_ID=t.AD_Window_ID) INNER JOIN AD_Table tt ON (t.AD_Table_ID=tt.AD_Table_ID) WHERE t.SeqNo=(SELECT MIN(SeqNo) FROM AD_Tab xt WHERE xt.AD_Window_ID=w.AD_Window_ID)AND tt.AccessLevel IN '");
	sb.appendln("         || roleaccesslevelwin;");
	sb.appendln("      EXECUTE sqlins;");
	sb.appendln("      sqlins :=");
	sb.appendln("            'INSERT INTO AD_Process_Access (AD_Process_ID, AD_Role_ID, AD_Client_ID,AD_Org_ID,IsActive,Created,CreatedBy,Updated,UpdatedBy,IsReadWrite) SELECT DISTINCT p.AD_Process_ID, '");
	sb.appendln("         || r.ad_role_id");
	sb.appendln("         || ',0,0,''Y'', Current_Timestamp,0, Current_Timestamp,0,''Y'' FROM AD_Process p WHERE AccessLevel IN '");
	sb.appendln("         || roleaccesslevel;");
	sb.appendln("      EXECUTE sqlins;");
	sb.appendln("      sqlins :=");
	sb.appendln("            'INSERT INTO AD_Form_Access (AD_Form_ID, AD_Role_ID, AD_Client_ID,AD_Org_ID,IsActive,Created,CreatedBy,Updated,UpdatedBy,IsReadWrite) SELECT f.AD_Form_ID, '");
	sb.appendln("         || r.ad_role_id");
	sb.appendln("         || ',0,0,''Y'', Current_Timestamp,0, Current_Timestamp,0,''Y'' FROM AD_Form f WHERE AccessLevel IN '");
	sb.appendln("         || roleaccesslevel;");
	sb.appendln("      EXECUTE sqlins;");
	sb.appendln("      sqlins :=");
	sb.appendln("            'INSERT INTO AD_WorkFlow_Access (AD_WorkFlow_ID, AD_Role_ID, AD_Client_ID,AD_Org_ID,IsActive,Created,CreatedBy,Updated,UpdatedBy,IsReadWrite) SELECT w.AD_WorkFlow_ID, '");
	sb.appendln("         || r.ad_role_id");
	sb.appendln("         || ',0,0,''Y'', Current_Timestamp,0, Current_Timestamp,0,''Y'' FROM AD_WorkFlow w WHERE AccessLevel IN '");
	sb.appendln("         || roleaccesslevel;");
	sb.appendln("      EXECUTE sqlins;");
	sb.appendln("   END LOOP;");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=4b780545-1709-762a-4d56-6e5d7d14df33");
	return sb.toString();
}
}
