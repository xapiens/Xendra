package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Gettree0 
{
 
@XendraFunction(Name="gettree",Output="integer",Owner="xendra",Language="plpgsql",
Identifier="2cc46a54-3328-ac6f-3bcd-4d8ef486c380",Arguments="p_client_id numeric, p_treetype text",
Extension="",Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "2cc46a54-3328-ac6f-3bcd-4d8ef486c380";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("DECLARE");
	sb.appendln("    ADTreeID NUMERIC;");
	sb.appendln("BEGIN");
	sb.appendln("SELECT AD_Tree_ID into ADTreeID");
	sb.appendln("FROM AD_Tree ");
	sb.appendln("WHERE AD_Client_ID = p_Client_ID AND TreeType = p_TreeType;");
	sb.appendln("RETURN ADTreeID;");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=2cc46a54-3328-ac6f-3bcd-4d8ef486c380");
	return sb.toString();
}
}
