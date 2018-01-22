package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_Ad_tab_v 
{
 	@XendraView(Identifier="22203350-d1a1-e25e-a533-810cb52e66ef",
Synchronized="2017-04-04 12:25:34.0",
Name="ad_tab_v",
Owner="xendra",
Extension="")
	public static final String Identifier = "22203350-d1a1-e25e-a533-810cb52e66ef";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2017-04-04 12:25:34.0");
	sb.appendln("@Identifier=22203350-d1a1-e25e-a533-810cb52e66ef");
	sb.appendln("@comment=Tab within a Window ");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT t.ad_tab_id, t.ad_window_id, t.ad_table_id, t.name, t.description, t.help, t.seqno, t.issinglerow, t.hastree, t.isinfotab, tbl.replicationtype, tbl.tablename, tbl.accesslevel, tbl.issecurityenabled, tbl.isdeleteable, tbl.ishighvolume, tbl.isview, 'N'::character(1) AS hasassociation, t.istranslationtab, t.isreadonly, t.ad_image_id, t.tablevel, t.whereclause, t.orderbyclause, t.commitwarning, t.readonlylogic, t.displaylogic, t.ad_column_id, t.ad_process_id, t.issorttab, t.isinsertrecord, t.isadvancedtab, t.ad_columnsortorder_id, t.ad_columnsortyesno_id, t.included_tab_id, t.parent_column_id, tbl.ad_rule_id FROM (ad_tab t JOIN ad_table tbl ON ((t.ad_table_id = tbl.ad_table_id))) WHERE ((t.isactive = 'Y'::bpchar) AND (tbl.isactive = 'Y'::bpchar));");
	return sb.toString();
}
}
