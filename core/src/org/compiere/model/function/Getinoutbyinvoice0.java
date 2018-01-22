package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Getinoutbyinvoice0 
{
 
@XendraFunction(Name="getinoutbyinvoice",Output="character varying",Owner="xendra",
Language="plpgsql",Identifier="751ed18e-9d26-a14d-ce35-755f35ec10c4",
Arguments="pc_invoice_id numeric",Extension="",Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "751ed18e-9d26-a14d-ce35-755f35ec10c4";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("DECLARE");
	sb.appendln("	v_inoutdocs CHARACTER VARYING;");
	sb.appendln("	pe RECORD;");
	sb.appendln("BEGIN");
	sb.appendln("	v_inoutdocs :='';");
	sb.appendln("	FOR pe IN");
	sb.appendln("		SELECT DISTINCT io.documentno from m_inout io ");
	sb.appendln("			JOIN m_inoutline ioline  ON io.m_inout_id = ioline.m_inout_id ");
	sb.appendln("			AND ioline.m_inoutline_id ");
	sb.appendln("			IN (SELECT m_inoutline_id FROM ");
	sb.appendln("				c_invoiceline il JOIN c_invoice i ON i.c_invoice_id = il.c_invoice_id  AND i.c_invoice_id = pc_invoice_id) ");
	sb.appendln("	LOOP");
	sb.appendln("	 v_inoutdocs := v_inoutdocs || ' ' || pe.documentno ;");
	sb.appendln("	 --v_inoutdocs := pe.documentno;");
	sb.appendln("	END LOOP;");
	sb.appendln("	--");
	sb.appendln("	RETURN v_inoutdocs;");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=751ed18e-9d26-a14d-ce35-755f35ec10c4");
	return sb.toString();
}
}
