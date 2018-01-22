package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Getdocumentnodatafromrecordid0 
{
 
@XendraFunction(Name="getdocumentnodatafromrecordid",Output="record",Owner="xendra",
Language="plpgsql",Identifier="857d1311-a61b-e904-de0d-7d96ba8d0ae6",
Arguments="p_client_id numeric, p_org_id numeric, p_tablename character varying, p_record_id numeric, OUT docnro character varying, OUT serie character varying, OUT doctype numeric, OUT docname character varying",
Extension="",Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "857d1311-a61b-e904-de0d-7d96ba8d0ae6";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("/*************************************************************************");
	sb.appendln(" * The contents of this file are subject to the Compiere License.  You may");
	sb.appendln(" * obtain a copy of the License at    http://www.compiere.org/license.html");
	sb.appendln(" * Software is on an  \"AS IS\" basis,  WITHOUT WARRANTY OF ANY KIND, either");
	sb.appendln(" * express or implied. See the License for details. Code: Compiere ERP+CRM");
	sb.appendln(" * Copyright (C) 1999-2001 Jorg Janke, ComPiere, Inc. All Rights Reserved.");
	sb.appendln(" *");
	sb.appendln(" * created by Carlos Arana,");
	sb.appendln(" * carana@gmail.com");
	sb.appendln(" *************************************************************************");
	sb.appendln(" ***");
	sb.appendln(" * Description:");
	sb.appendln(" *         Otene la info del tipo de documento , numero de documento , nombre documento y serie");
	sb.appendln(" *         De existir para una determinada tabla y record_id");
	sb.appendln(" *");
	sb.appendln(" *");
	sb.appendln(" *  Retorna :");
	sb.appendln(" *            serial La serie del documento habitualmente para facturas.");
	sb.appendln(" *            docnro el campo documentno del registro buscado");
	sb.appendln(" *          doctype el tipo de documento para la tabla y record_id indicado");
	sb.appendln(" *          docname el nombre del documento para el tipo de documento encontrado.");
	sb.appendln(" *");
	sb.appendln(" ************************************************************************/");
	sb.appendln("BEGIN");
	sb.appendln("    if (upper(p_tablename)  = 'M_INOUT')");
	sb.appendln("    then       ");
	sb.appendln("        select documentno,c_doctype_id,(select name from c_doctype_trl dt where dt.c_doctype_id = i.c_doctype_id) from m_inout i");
	sb.appendln("            where m_inout_id = p_record_id");
	sb.appendln("            into docnro,doctype,docname ;");
	sb.appendln("    elseif(upper(p_tablename) = 'C_INVOICE')");
	sb.appendln("    then");
	sb.appendln("        select serial,documentno,c_doctype_id,(select name from c_doctype_trl dt where dt.c_doctype_id = i.c_doctype_id) from c_invoice i");
	sb.appendln("            where c_invoice_id = p_record_id");
	sb.appendln("            into serie,docnro,doctype,docname ;");
	sb.appendln("    elseif(upper(p_tablename) = 'C_BOESTATEMENT')");
	sb.appendln("    then");
	sb.appendln("        select documentno,c_doctype_id,(select name from c_doctype_trl dt where dt.c_doctype_id = i.c_doctype_id) from c_boestatement i");
	sb.appendln("            where c_boestatement_id = p_record_id");
	sb.appendln("            into docnro,doctype,docname ;");
	sb.appendln("    elseif(upper(p_tablename) = 'M_MOVEMENT')");
	sb.appendln("    then");
	sb.appendln("        select documentno,c_doctype_id,(select name from c_doctype_trl dt where dt.c_doctype_id = i.c_doctype_id) from m_movement i");
	sb.appendln("            where m_movement_id = p_record_id");
	sb.appendln("            into docnro,doctype,docname ;");
	sb.appendln("    elseif(upper(p_tablename) = 'C_RETENTIONSTATEMENT')");
	sb.appendln("    then");
	sb.appendln("            select r.documentno,-1,'Retencion',* from C_retentionstatement c");
	sb.appendln("                join c_retention r on r.c_retention_id = c.c_retention_id");
	sb.appendln("            where c_retentionstatement_id = p_record_id");
	sb.appendln("            into docnro,doctype,docname ;");
	sb.appendln("    elseif(upper(p_tablename) = 'C_CASH')");
	sb.appendln("    then");
	sb.appendln("        select p.documentno,p.c_doctype_id,(select name from c_doctype_trl dt where dt.c_doctype_id = p.c_doctype_id) from C_cash c");
	sb.appendln("            left join c_payment p on p.c_payment_id= c.c_payment_id");
	sb.appendln("            where c.c_cash_id = p_record_id");
	sb.appendln("            into docnro,doctype,docname ;");
	sb.appendln("    elseif(upper(p_tablename) = 'C_PERCEPTION')");
	sb.appendln("    then");
	sb.appendln("        select documentno,c_doctype_id,(select name from c_doctype_trl dt where dt.c_doctype_id = i.c_doctype_id) from c_perception i");
	sb.appendln("            where c_perception_id = p_record_id");
	sb.appendln("            into docnro,doctype,docname ;");
	sb.appendln("    elseif(upper(p_tablename) = 'C_ALLOCATIONHDR')");
	sb.appendln("    then");
	sb.appendln("        select documentno,-1,'Asignacion' from c_allocationhdr i");
	sb.appendln("            where c_allocationhdr_id = p_record_id");
	sb.appendln("            into docnro,doctype,docname ;");
	sb.appendln("    elseif(upper(p_tablename) = 'GL_JOURNAL')");
	sb.appendln("    then");
	sb.appendln("        select documentno,c_doctype_id,(select name from c_doctype_trl dt where dt.c_doctype_id = i.c_doctype_id) from gl_journal i");
	sb.appendln("            where gl_journal_id = p_record_id");
	sb.appendln("            into docnro,doctype,docname ;");
	sb.appendln("    elseif(upper(p_tablename) = 'C_PAYMENT')");
	sb.appendln("    then");
	sb.appendln("        select documentno,c_doctype_id,(select name from c_doctype_trl dt where dt.c_doctype_id = i.c_doctype_id) from c_payment i");
	sb.appendln("            where c_payment_id = p_record_id");
	sb.appendln("            into docnro,doctype,docname ;");
	sb.appendln("    end if;");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=857d1311-a61b-e904-de0d-7d96ba8d0ae6");
	return sb.toString();
}
}
