package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_Ad_field_vt 
{
 	@XendraView(Identifier="08c5c535-f7ed-efa2-afbe-ba511c302d24",
Synchronized="2016-08-24 07:11:34.0",
Name="ad_field_vt",
Owner="xendra",
Extension="")
	public static final String Identifier = "08c5c535-f7ed-efa2-afbe-ba511c302d24";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2016-08-24 07:11:34.0");
	sb.appendln("@Identifier=08c5c535-f7ed-efa2-afbe-ba511c302d24");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT trl.ad_language, t.ad_window_id, f.ad_tab_id, f.ad_field_id, tbl.ad_table_id, f.ad_column_id, trl.name, trl.description, trl.help, f.isdisplayed, f.displaylogic, f.displaylength, f.seqno, f.sortno, f.issameline, f.isheading, f.isfieldonly, f.isreadonly, f.isencrypted AS isencryptedfield, f.obscuretype, c.columnname, c.columnsql, c.fieldlength, c.vformat, COALESCE(f.defaultvalue, c.defaultvalue) AS defaultvalue, c.iskey, c.isparent, COALESCE(f.ismandatory, c.ismandatory) AS ismandatory, c.isidentifier, c.istranslated, COALESCE(f.ad_reference_value_id, c.ad_reference_value_id) AS ad_reference_value_id, c.callout, c.agenda, c.ad_rule_id, COALESCE(f.ad_reference_id, c.ad_reference_id) AS ad_reference_id, COALESCE(f.ad_val_rule_id, c.ad_val_rule_id) AS ad_val_rule_id, c.ad_process_id, c.isalwaysupdateable, c.readonlylogic, c.mandatorylogic, c.isupdateable, c.isencrypted AS isencryptedcolumn, c.isselectioncolumn, tbl.tablename, c.valuemin, c.valuemax, fgt.name AS fieldgroup, vr.code AS validationcode, f.included_tab_id, fg.fieldgrouptype, fg.iscollapsedbydefault, COALESCE(f.infofactoryclass, c.infofactoryclass) AS infofactoryclass, c.isautocomplete, f.hideinlistview, f.preferredwidth FROM ((((((((ad_field f JOIN ad_field_trl trl ON ((f.ad_field_id = trl.ad_field_id))) JOIN ad_tab t ON ((f.ad_tab_id = t.ad_tab_id))) LEFT JOIN ad_fieldgroup fg ON ((f.ad_fieldgroup_id = fg.ad_fieldgroup_id))) LEFT JOIN ad_fieldgroup_trl fgt ON (((f.ad_fieldgroup_id = fgt.ad_fieldgroup_id) AND ((trl.ad_language)::text = (fgt.ad_language)::text)))) LEFT JOIN ad_column c ON ((f.ad_column_id = c.ad_column_id))) JOIN ad_table tbl ON ((c.ad_table_id = tbl.ad_table_id))) JOIN ad_reference r ON ((c.ad_reference_id = r.ad_reference_id))) LEFT JOIN ad_val_rule vr ON ((vr.ad_val_rule_id = COALESCE(f.ad_val_rule_id, c.ad_val_rule_id)))) WHERE ((f.isactive = 'Y'::bpchar) AND (c.isactive = 'Y'::bpchar));");
	return sb.toString();
}
}
