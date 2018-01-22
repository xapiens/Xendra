package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Getparentaccount0 
{
 
@XendraFunction(Name="getparentaccount",Output="integer",Owner="xendra",Language="plpgsql",
Identifier="01bfdbc1-6288-52ba-9a5f-4970874112d1",Arguments="p_account_id numeric",Extension="",
Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "01bfdbc1-6288-52ba-9a5f-4970874112d1";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("DECLARE");
	sb.appendln("    ADClientID NUMERIC;");
	sb.appendln("BEGIN");
	sb.appendln("SELECT AD_Client_ID into ADClientID");
	sb.appendln("FROM C_ElementValue WHERE C_ElementValue_ID = p_Account_ID;");
	sb.appendln("RETURN getParent(p_Account_ID, 'EV'::text, ADClientID);");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=01bfdbc1-6288-52ba-9a5f-4970874112d1");
	return sb.toString();
}
}
