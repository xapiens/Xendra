package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Getreferencevalue0 
{
 
@XendraFunction(Name="getreferencevalue",Output="character",Owner="xendra",Language="plpgsql",
Identifier="d2a2fb5c-a8db-2144-f46e-6c87ea300564",
Arguments="preferencename character, preferencevalue character",Extension="",
Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "d2a2fb5c-a8db-2144-f46e-6c87ea300564";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln(" DECLARE");
	sb.appendln("    refdescrip varchar;");
	sb.appendln(" BEGIN");
	sb.appendln("    SELECT coalesce(reftrl.name,refl.name) into refdescrip FROM xendra.ad_ref_list_trl reftrl");
	sb.appendln("    JOIN xendra.ad_ref_list refl on reftrl.ad_ref_list_id = refl.ad_ref_list_id");
	sb.appendln("    JOIN xendra.ad_reference ree on refl.ad_reference_id = ree.ad_reference_id");
	sb.appendln("    WHERE ree.name = preferencename");
	sb.appendln("    AND refl.value = preferencevalue;");
	sb.appendln("    return refdescrip;");
	sb.appendln(" END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=d2a2fb5c-a8db-2144-f46e-6c87ea300564");
	return sb.toString();
}
}
