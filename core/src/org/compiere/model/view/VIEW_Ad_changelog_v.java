package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_Ad_changelog_v 
{
 	@XendraView(Identifier="28030d9f-be87-6649-8df8-1018f1fa1d45",
Synchronized="2013-07-09 19:02:34.0",
Name="ad_changelog_v",
Owner="xendra",
Extension="")
	public static final String Identifier = "28030d9f-be87-6649-8df8-1018f1fa1d45";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-07-09 19:02:34.0");
	sb.appendln("@Identifier=28030d9f-be87-6649-8df8-1018f1fa1d45");
	sb.appendln("@comment=Log of data changes");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT l.ad_session_id, l.ad_changelog_id, t.tablename, l.record_id, c.columnname, l.oldvalue, l.newvalue, u.name, l.created FROM (((ad_changelog l JOIN ad_table t ON ((l.ad_table_id = t.ad_table_id))) JOIN ad_column c ON ((l.ad_column_id = c.ad_column_id))) JOIN ad_user u ON ((l.createdby = u.ad_user_id))) ORDER BY l.ad_session_id, l.ad_changelog_id, t.tablename, l.record_id, c.columnname;");
	return sb.toString();
}
}
