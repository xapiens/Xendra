package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Getcurrencysourcebydocumentno0 
{
 
@XendraFunction(Name="getcurrencysourcebydocumentno",Output="numeric",Owner="xendra",
Language="plpgsql",Identifier="5c81988d-e447-a6c5-7ce8-322aed95cf27",
Arguments="p_serial character varying, p_invoicedocumentno character varying",Extension="",
Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "5c81988d-e447-a6c5-7ce8-322aed95cf27";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("DECLARE ");
	sb.appendln("v_Currency_ID NUMERIC;");
	sb.appendln("v_documentNo CHARACTER VARYING;");
	sb.appendln("BEGIN");
	sb.appendln("v_documentno := COALESCE(p_serial, '') || COALESCE(p_invoicedocumentno, '');");
	sb.appendln("v_Currency_ID := 0;");
	sb.appendln("SELECT C_currency_ID into v_Currency_ID from fact_acct where COALESCE(serial,'') || COALESCE(invoicedocumentno, '') = v_documentno order by datetrx limit 1;");
	sb.appendln("RETURN v_Currency_ID;");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=5c81988d-e447-a6c5-7ce8-322aed95cf27");
	return sb.toString();
}
}
