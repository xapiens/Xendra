package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Gettaxvalue0 
{
 
@XendraFunction(Name="gettaxvalue",Output="numeric",Owner="xendra",Language="plpgsql",
Identifier="3b8c860e-478a-031f-97af-dadedb5ee3f6",
Arguments="p_c_doctype_id numeric, p_c_invoice_id numeric, p_taxalias character, p_type character",
Extension="",Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "3b8c860e-478a-031f-97af-dadedb5ee3f6";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("DECLARE");
	sb.appendln("    taxvalue numeric;");
	sb.appendln("    m_ref_invoice_id numeric;");
	sb.appendln("    m_docbasetype VARCHAR;");
	sb.appendln("    m_dateinvoiced timestamp;");
	sb.appendln("    m_c_conversiontype_id numeric;");
	sb.appendln(" BEGIN");
	sb.appendln("    -- obtenemos el ID de referencia de la factura por si es una Nota de Credito u otro documento que referencia a otro, ya que la diferencia");
	sb.appendln("    -- de cambio solo debe considerarse en el documento original.");
	sb.appendln("    SELECT ref_invoice_id into m_ref_invoice_id from c_invoice i where i.c_invoice_id = p_c_invoice_id;");
	sb.appendln("    if (m_ref_invoice_id is not null) then");
	sb.appendln("	SELECT dateinvoiced, c_conversiontype_id into m_dateinvoiced, m_c_conversiontype_id from c_invoice i where i.c_invoice_id = m_ref_invoice_id;");
	sb.appendln("	if m_dateinvoiced is null or m_c_conversiontype_id is null then ");
	sb.appendln("		SELECT dateinvoiced, c_conversiontype_id into m_dateinvoiced, m_c_conversiontype_id from c_invoice i where i.c_invoice_id = p_c_invoice_id;");
	sb.appendln("	end if;");
	sb.appendln("    else");
	sb.appendln("	SELECT dateinvoiced, c_conversiontype_id into m_dateinvoiced, m_c_conversiontype_id from c_invoice i where i.c_invoice_id = p_c_invoice_id;");
	sb.appendln("    end if;");
	sb.appendln("    SELECT docbasetype into m_docbasetype from c_doctype ");
	sb.appendln("	where c_doctype_id = (select i.c_doctype_id from c_invoice i where i.c_invoice_id = p_c_invoice_id); ");
	sb.appendln("    if (m_docbasetype is not null) then");
	sb.appendln("    --RAISE NOTICE 'c_currency_id %', i.c_currency_id;");
	sb.appendln("        SELECT currencyconvert(");
	sb.appendln("        CASE WHEN p_type = 'BASE' THEN");
	sb.appendln("		gettaxbaseamtbyinvoice(p_taxalias, p_c_Invoice_ID) ");
	sb.appendln("	ELSE");
	sb.appendln("		gettaxamtbyinvoice(p_taxalias, p_c_Invoice_ID) ");
	sb.appendln("	END,");
	sb.appendln("        i.C_Currency_ID, 308, m_dateinvoiced, m_c_conversiontype_id,");
	sb.appendln("        i.AD_Client_ID, i.AD_Org_ID) * CASE WHEN m_docbasetype in ('APC','ARC') THEN -1 ELSE 1 END into taxvalue");
	sb.appendln("        FROM  c_invoice i where i.c_invoice_id = p_c_invoice_id    ;              ");
	sb.appendln("    else");
	sb.appendln("	RAISE NOTICE 'docbasetype = null';");
	sb.appendln("    end if;");
	sb.appendln("    RETURN taxvalue;");
	sb.appendln(" END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=3b8c860e-478a-031f-97af-dadedb5ee3f6");
	return sb.toString();
}
}
