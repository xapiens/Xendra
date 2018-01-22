package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Bpartnerremitlocation0 
{
 
@XendraFunction(Name="bpartnerremitlocation",Output="numeric",Owner="xendra",Language="plpgsql",
Identifier="83ed1a9b-14ab-7260-2668-e2e017cb39ee",Arguments="p_c_bpartner_id numeric",Extension="",
Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "83ed1a9b-14ab-7260-2668-e2e017cb39ee";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("DECLARE");
	sb.appendln("v_C_Location_ID NUMERIC := NULL;");
	sb.appendln("l RECORD;");
	sb.appendln("BEGIN");
	sb.appendln("FOR l IN");
	sb.appendln("SELECT IsRemitTo, C_Location_ID");
	sb.appendln("FROM C_BPartner_Location");
	sb.appendln("WHERE C_BPartner_ID=p_C_BPartner_ID");
	sb.appendln("ORDER BY IsRemitTo DESC");
	sb.appendln("LOOP");
	sb.appendln("IF (v_C_Location_ID IS NULL) THEN");
	sb.appendln("v_C_Location_ID := l.C_Location_ID;");
	sb.appendln("END IF;");
	sb.appendln("END LOOP;");
	sb.appendln("RETURN v_C_Location_ID;");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=83ed1a9b-14ab-7260-2668-e2e017cb39ee");
	return sb.toString();
}
}
