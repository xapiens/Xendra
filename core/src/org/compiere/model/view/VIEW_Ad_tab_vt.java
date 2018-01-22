package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_Ad_tab_vt 
{
 	@XendraView(Identifier="e36c7266-764c-5d9e-a8dc-b5bf548e1550",
Synchronized="2017-04-04 12:26:34.0",
Name="ad_tab_vt",
Owner="xendra",
Extension="")
	public static final String Identifier = "e36c7266-764c-5d9e-a8dc-b5bf548e1550";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2017-04-04 12:26:34.0");
	sb.appendln("@Identifier=e36c7266-764c-5d9e-a8dc-b5bf548e1550");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT trl.ad_language, t.ad_tab_id, t.ad_window_id, t.ad_table_id, trl.name, trl.description, trl.help, t.seqno, t.issinglerow, t.hastree, t.isinfotab, tbl.replicationtype, tbl.tablename, tbl.accesslevel, tbl.issecurityenabled, tbl.isdeleteable, tbl.ishighvolume, tbl.isview, 'N'::character(1) AS hasassociation, t.istranslationtab, t.isreadonly, t.ad_image_id, t.tablevel, t.whereclause, t.orderbyclause, trl.commitwarning, t.readonlylogic, t.displaylogic, t.ad_column_id, t.ad_process_id, t.issorttab, t.isinsertrecord, t.isadvancedtab, t.ad_columnsortorder_id, t.ad_columnsortyesno_id, t.included_tab_id, t.parent_column_id, tbl.ad_rule_id FROM ((ad_tab t JOIN ad_table tbl ON ((t.ad_table_id = tbl.ad_table_id))) JOIN ad_tab_trl trl ON ((t.ad_tab_id = trl.ad_tab_id))) WHERE ((t.isactive = 'Y'::bpchar) AND (tbl.isactive = 'Y'::bpchar));");
	return sb.toString();
}
}
