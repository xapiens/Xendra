package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Instr2 
{
 
@XendraFunction(Name="instr",Output="integer",Owner="xendra",Language="plpgsql",
Identifier="326d9bf9-ef64-3d2a-268f-4a8195690753",
Arguments="string character varying, string_to_search character varying, beg_index integer, occur_index integer",
Extension="",Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "326d9bf9-ef64-3d2a-268f-4a8195690753";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("DECLARE");
	sb.appendln("    pos integer NOT NULL DEFAULT 0;");
	sb.appendln("    occur_number integer NOT NULL DEFAULT 0;");
	sb.appendln("    temp_str varchar;");
	sb.appendln("    beg integer;");
	sb.appendln("    i integer;");
	sb.appendln("    length integer;");
	sb.appendln("    ss_length integer;");
	sb.appendln("BEGIN");
	sb.appendln("    IF beg_index > 0 THEN");
	sb.appendln("        beg := beg_index;");
	sb.appendln("        temp_str := substring(string FROM beg_index);");
	sb.appendln("        FOR i IN 1..occur_index LOOP");
	sb.appendln("            pos := position(string_to_search IN temp_str);");
	sb.appendln("            IF i = 1 THEN");
	sb.appendln("                beg := beg + pos - 1;");
	sb.appendln("            ELSE");
	sb.appendln("                beg := beg + pos;");
	sb.appendln("            END IF;");
	sb.appendln("            temp_str := substring(string FROM beg + 1);");
	sb.appendln("        END LOOP;");
	sb.appendln("        IF pos = 0 THEN");
	sb.appendln("            RETURN 0;");
	sb.appendln("        ELSE");
	sb.appendln("            RETURN beg;");
	sb.appendln("        END IF;");
	sb.appendln("    ELSE");
	sb.appendln("        ss_length := char_length(string_to_search);");
	sb.appendln("        length := char_length(string);");
	sb.appendln("        beg := length + beg_index - ss_length + 2;");
	sb.appendln("        WHILE beg > 0 LOOP");
	sb.appendln("            temp_str := substring(string FROM beg FOR ss_length);");
	sb.appendln("            pos := position(string_to_search IN temp_str);");
	sb.appendln("            IF pos > 0 THEN");
	sb.appendln("                occur_number := occur_number + 1;");
	sb.appendln("                IF occur_number = occur_index THEN");
	sb.appendln("                    RETURN beg;");
	sb.appendln("                END IF;");
	sb.appendln("            END IF;");
	sb.appendln("            beg := beg - 1;");
	sb.appendln("        END LOOP;");
	sb.appendln("        RETURN 0;");
	sb.appendln("    END IF;");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=326d9bf9-ef64-3d2a-268f-4a8195690753");
	return sb.toString();
}
}
