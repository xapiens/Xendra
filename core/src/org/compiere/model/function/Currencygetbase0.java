package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Currencygetbase0 
{
 
@XendraFunction(Name="currencygetbase",Output="integer",Owner="xendra",Language="plpgsql",
Identifier="a25dff91-7730-2aae-f2ed-228b86a47e9d",Arguments="p_ad_client_id numeric",Extension="",
Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "a25dff91-7730-2aae-f2ed-228b86a47e9d";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("DECLARE");
	sb.appendln("    CCurrencyID NUMERIC;");
	sb.appendln("BEGIN");
	sb.appendln("SELECT C_Currency_ID into CCurrencyID");
	sb.appendln("FROM AD_ClientInfo ci INNER JOIN C_AcctSchema ac ON ( ci.C_AcctSchema1_ID=ac.C_AcctSchema_ID)  ");
	sb.appendln("WHERE ci.AD_Client_ID = p_AD_Client_ID;");
	sb.appendln("RETURN CCurrencyID;");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=a25dff91-7730-2aae-f2ed-228b86a47e9d");
	return sb.toString();
}
}
