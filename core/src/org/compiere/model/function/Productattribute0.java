package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Productattribute0 
{
 
@XendraFunction(Name="productattribute",Output="character varying",Owner="xendra",
Language="plpgsql",Identifier="8962a5ae-147b-36d7-24e2-2227da715850",
Arguments="p_m_attributesetinstance_id numeric",Extension="",Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "8962a5ae-147b-36d7-24e2-2227da715850";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("/*************************************************************************");
	sb.appendln(" * The contents of this file are subject to the Compiere License.  You may");
	sb.appendln(" * obtain a copy of the License at    http://www.compiere.org/license.html ");
	sb.appendln(" * Software is on an  \"AS IS\" basis,  WITHOUT WARRANTY OF ANY KIND, either ");
	sb.appendln(" * express or implied. See the License for details. Code: Compiere ERP+CRM");
	sb.appendln(" * Copyright (C) 1999-2001 Jorg Janke, ComPiere, Inc. All Rights Reserved.");
	sb.appendln(" *");
	sb.appendln(" * converted to postgreSQL by Karsten Thiemann (Schaeffer AG), ");
	sb.appendln(" * kthiemann@adempiere.org");
	sb.appendln(" *************************************************************************");
	sb.appendln(" * Title: Return Instance Attribute Info");
	sb.appendln(" * Description:");
	sb.appendln(" *  ");
	sb.appendln(" * Test:");
	sb.appendln("    SELECT ProductAttribute (M_AttributeSetInstance_ID) ");
	sb.appendln("    FROM M_InOutLine WHERE M_AttributeSetInstance_ID > 0");
	sb.appendln("    --");
	sb.appendln("    SELECT p.Name");
	sb.appendln("    FROM C_InvoiceLine il LEFT OUTER JOIN M_Product p ON (il.M_Product_ID=p.M_Product_ID);");
	sb.appendln("    SELECT p.Name || ProductAttribute (il.M_AttributeSetInstance_ID) ");
	sb.appendln("    FROM C_InvoiceLine il LEFT OUTER JOIN M_Product p ON (il.M_Product_ID=p.M_Product_ID);");
	sb.appendln(" ************************************************************************/");
	sb.appendln("DECLARE");
	sb.appendln("    v_Name          VARCHAR(2000) := '';");
	sb.appendln("    v_NameAdd       VARCHAR(2000) := '';");
	sb.appendln("    --");
	sb.appendln("    v_Lot           M_AttributeSetInstance.Lot%TYPE;");
	sb.appendln("    v_LotStart      M_AttributeSet.LotCharSOverwrite%TYPE;");
	sb.appendln("    v_LotEnd        M_AttributeSet.LotCharEOverwrite%TYPE;");
	sb.appendln("    v_SerNo         M_AttributeSetInstance.SerNo%TYPE;");
	sb.appendln("    v_SerNoStart    M_AttributeSet.SerNoCharSOverwrite%TYPE;");
	sb.appendln("    v_SerNoEnd      M_AttributeSet.SerNoCharEOverwrite%TYPE;");
	sb.appendln("    v_GuaranteeDate M_AttributeSetInstance.GuaranteeDate%TYPE;");
	sb.appendln("    r   RECORD;");
	sb.appendln("BEGIN");
	sb.appendln("    --  Get Product Attribute Set Instance");
	sb.appendln("    IF (p_M_AttributeSetInstance_ID > 0) THEN");
	sb.appendln("        SELECT asi.Lot, asi.SerNo, asi.GuaranteeDate,");
	sb.appendln("            COALESCE(a.SerNoCharSOverwrite, '#'::CHAR(1)), COALESCE(a.SerNoCharEOverwrite, ''::CHAR(1)),");
	sb.appendln("            COALESCE(a.LotCharSOverwrite, '«'::CHAR(1)), COALESCE(a.LotCharEOverwrite, '»'::CHAR(1))");
	sb.appendln("          INTO v_Lot, v_SerNo, v_GuaranteeDate,");
	sb.appendln("            v_SerNoStart, v_SerNoEnd, v_LotStart, v_LotEnd");
	sb.appendln("        FROM M_AttributeSetInstance asi");
	sb.appendln("          INNER JOIN M_AttributeSet a ON (asi.M_AttributeSet_ID=a.M_AttributeSet_ID)");
	sb.appendln("        WHERE asi.M_AttributeSetInstance_ID=p_M_AttributeSetInstance_ID;");
	sb.appendln("        --");
	sb.appendln("        IF (v_SerNo IS NOT NULL) THEN");
	sb.appendln("            v_NameAdd := v_NameAdd || v_SerNoStart || v_SerNo || v_SerNoEnd || ' ';");
	sb.appendln("        END IF;");
	sb.appendln("        IF (v_Lot IS NOT NULL) THEN");
	sb.appendln("            v_NameAdd := v_NameAdd || v_LotStart || v_Lot || v_LotEnd || ' ';");
	sb.appendln("        END IF;");
	sb.appendln("        IF (v_GuaranteeDate IS NOT NULL) THEN");
	sb.appendln("            v_NameAdd := v_NameAdd || v_GuaranteeDate || ' ';");
	sb.appendln("        END IF;");
	sb.appendln("        --");
	sb.appendln("       FOR r IN");
	sb.appendln("	     SELECT ai.Value, a.Name");
	sb.appendln("	        FROM M_AttributeInstance ai");
	sb.appendln("	        INNER JOIN M_Attribute a ON (ai.M_Attribute_ID=a.M_Attribute_ID AND a.IsInstanceAttribute='Y')");
	sb.appendln("        	WHERE ai.M_AttributeSetInstance_ID=p_M_AttributeSetInstance_ID");
	sb.appendln("    	LOOP");
	sb.appendln("            v_NameAdd := v_NameAdd || r.Name || ':' || r.Value || ' ';");
	sb.appendln("        END LOOP;");
	sb.appendln("        --");
	sb.appendln("        IF (LENGTH(v_NameAdd) > 0) THEN");
	sb.appendln("            v_Name := v_Name || ' (' || TRIM(v_NameAdd) || ')';");
	sb.appendln("	ELSE ");
	sb.appendln("	    v_Name := NULL;");
	sb.appendln("        END IF;");
	sb.appendln("    END IF;");
	sb.appendln("    RETURN v_Name;    ");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=8962a5ae-147b-36d7-24e2-2227da715850");
	return sb.toString();
}
}
