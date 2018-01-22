package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Boewiz0 
{
 
@XendraFunction(Name="boewiz",Output="setof record",Owner="postgres",Language="plpgsql",
Identifier="e0fc95c8-5cf7-e606-3299-3996c63e5c55",
Arguments="nroboeitems numeric, amtto numeric, amtfrom numeric, rate numeric, dref timestamp without time zone, betweendays numeric, OUT seq integer, OUT gen timestamp without time zone, OUT amount numeric, OUT due timestamp without time zone",
Extension="",Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "e0fc95c8-5cf7-e606-3299-3996c63e5c55";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("DECLARE");
	sb.appendln(" quote NUMERIC;");
	sb.appendln(" totalacum NUMERIC;");
	sb.appendln(" totalto NUMERIC;");
	sb.appendln(" newdate timestamp;");
	sb.appendln(" BEGIN");
	sb.appendln("IF amtto > 0 THEN");
	sb.appendln("       totalacum := 0;");
	sb.appendln("       quote := round (amtto / nroboeitems,2);       ");
	sb.appendln("       newdate := dref + ( cast('1 day' as interval) * betweendays );");
	sb.appendln("       FOR i IN 1..nroboeitems LOOP");
	sb.appendln("		seq := i;");
	sb.appendln("		Gen := dref;                    ");
	sb.appendln("		Due := newdate;");
	sb.appendln("		newdate:= newdate + ( cast('1 day' as interval) * betweendays );          ");
	sb.appendln("		totalacum := totalacum + quote;               ");
	sb.appendln("        IF i = nroboeitems THEN");
	sb.appendln("			if totalacum = amtfrom THEN");
	sb.appendln("				amount := quote;");
	sb.appendln("			ELSE				");
	sb.appendln("				IF  (totalacum < amtfrom ) then");
	sb.appendln("					amount := quote + (amtfrom - totalacum );");
	sb.appendln("				ELSE");
	sb.appendln("					amount := quote - (amtfrom - totalacum );");
	sb.appendln("				END IF;            ");
	sb.appendln("			END IF;");
	sb.appendln("		ELSE");
	sb.appendln("			amount := quote;");
	sb.appendln("		END IF;          ");
	sb.appendln("        RETURN NEXT;");
	sb.appendln("       END LOOP;       ");
	sb.appendln("END IF;");
	sb.appendln("RETURN;");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=e0fc95c8-5cf7-e606-3299-3996c63e5c55");
	return sb.toString();
}
}
