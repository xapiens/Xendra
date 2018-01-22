package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Instr1 
{
 
@XendraFunction(Name="instr",Output="integer",Owner="xendra",Language="plpgsql",
Identifier="839d99a4-abd0-5167-0a47-d9500646316e",
Arguments="string character varying, string_to_search character varying, beg_index integer",
Extension="",Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "839d99a4-abd0-5167-0a47-d9500646316e";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("DECLARE");
	sb.appendln("    pos integer NOT NULL DEFAULT 0;");
	sb.appendln("    temp_str varchar;");
	sb.appendln("    beg integer;");
	sb.appendln("    length integer;");
	sb.appendln("    ss_length integer;");
	sb.appendln("BEGIN");
	sb.appendln("    IF beg_index > 0 THEN");
	sb.appendln("        temp_str := substring(string FROM beg_index);");
	sb.appendln("        pos := position(string_to_search IN temp_str);");
	sb.appendln("        IF pos = 0 THEN");
	sb.appendln("            RETURN 0;");
	sb.appendln("        ELSE");
	sb.appendln("            RETURN pos + beg_index - 1;");
	sb.appendln("        END IF;");
	sb.appendln("    ELSE");
	sb.appendln("        ss_length := char_length(string_to_search);");
	sb.appendln("        length := char_length(string);");
	sb.appendln("        beg := length + beg_index - ss_length + 2;");
	sb.appendln("        WHILE beg > 0 LOOP");
	sb.appendln("            temp_str := substring(string FROM beg FOR ss_length);");
	sb.appendln("            pos := position(string_to_search IN temp_str);");
	sb.appendln("            IF pos > 0 THEN");
	sb.appendln("                RETURN beg;");
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
	sb.appendln("@Identifier=839d99a4-abd0-5167-0a47-d9500646316e");
	return sb.toString();
}
}
