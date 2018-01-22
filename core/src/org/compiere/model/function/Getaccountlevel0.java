package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Getaccountlevel0 
{
 
@XendraFunction(Name="getaccountlevel",Output="integer",Owner="xendra",Language="plpgsql",
Identifier="8ad06c25-535f-d312-3047-2f8dadd8e645",Arguments="p_account_id numeric",Extension="",
Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "8ad06c25-535f-d312-3047-2f8dadd8e645";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("DECLARE");
	sb.appendln("    ADClientID 	NUMERIC;");
	sb.appendln("BEGIN");
	sb.appendln("	SELECT	AD_Client_ID into ADClientID");
	sb.appendln("			FROM C_ElementValue WHERE C_ElementValue_ID = p_Account_ID;");
	sb.appendln("	RETURN getLevel(p_Account_ID, 'EV'::text, ADClientID);");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=8ad06c25-535f-d312-3047-2f8dadd8e645");
	return sb.toString();
}
}
