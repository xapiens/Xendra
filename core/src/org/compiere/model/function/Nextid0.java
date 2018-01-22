package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Nextid0 
{
 
@XendraFunction(Name="nextid",Output="integer",Owner="xendra",Language="plpgsql",
Identifier="e0261306-f8e7-7949-c2ee-04f72f2ab394",
Arguments="p_ad_sequence_id integer, p_system character varying, OUT o_nextid integer",
Extension="",Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "e0261306-f8e7-7949-c2ee-04f72f2ab394";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("/*************************************************************************");
	sb.appendln("* The contents of this file are subject to the Compiere License.  You may");
	sb.appendln("* obtain a copy of the License at    http://www.compiere.org/license.html");
	sb.appendln("* Software is on an  \"AS IS\" basis,  WITHOUT WARRANTY OF ANY KIND, either");
	sb.appendln("* express or implied. See the License for details. Code: Compiere ERP+CRM");
	sb.appendln("* Copyright (C) 1999-2005 Jorg Janke, ComPiere, Inc. All Rights Reserved.");
	sb.appendln("*");
	sb.appendln("* converted to postgreSQL by Karsten Thiemann (Schaeffer AG),");
	sb.appendln("* kthiemann@xendra.org");
	sb.appendln("*************************************************************************");
	sb.appendln("***");
	sb.appendln("* Title: Get Next ID - no Commit");
	sb.appendln("* Description: Returns the next id of the sequence.");
	sb.appendln("* Test:");
	sb.appendln("* select * from nextid((select ad_sequence_id from ad_sequence where name = 'Test')::Integer, 'Y'::Varchar);");
	sb.appendln("*");
	sb.appendln("************************************************************************/");
	sb.appendln("BEGIN");
	sb.appendln("    IF (p_System = 'Y') THEN");
	sb.appendln("RAISE NOTICE 'system';");
	sb.appendln("        SELECT CurrentNextSys");
	sb.appendln("            INTO o_NextID");
	sb.appendln("        FROM AD_Sequence");
	sb.appendln("        WHERE AD_Sequence_ID=p_AD_Sequence_ID;");
	sb.appendln("        --");
	sb.appendln("        UPDATE AD_Sequence");
	sb.appendln("          SET CurrentNextSys = CurrentNextSys + IncrementNo");
	sb.appendln("        WHERE AD_Sequence_ID=p_AD_Sequence_ID;");
	sb.appendln("    ELSE");
	sb.appendln("        SELECT CurrentNext");
	sb.appendln("            INTO o_NextID");
	sb.appendln("        FROM AD_Sequence");
	sb.appendln("        WHERE AD_Sequence_ID=p_AD_Sequence_ID;");
	sb.appendln("        --");
	sb.appendln("        UPDATE AD_Sequence");
	sb.appendln("          SET CurrentNext = CurrentNext + IncrementNo");
	sb.appendln("        WHERE AD_Sequence_ID=p_AD_Sequence_ID;");
	sb.appendln("    END IF;");
	sb.appendln("    --");
	sb.appendln("EXCEPTION");
	sb.appendln("    WHEN  OTHERS THEN");
	sb.appendln("    RAISE NOTICE '%',SQLERRM;");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=e0261306-f8e7-7949-c2ee-04f72f2ab394");
	return sb.toString();
}
}
