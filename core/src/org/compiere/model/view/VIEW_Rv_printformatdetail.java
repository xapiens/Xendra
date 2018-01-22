package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_Rv_printformatdetail 
{
 	@XendraView(Identifier="774b1095-6e71-6c90-2bf0-88000c65322d",
Synchronized="2013-07-09 19:02:34.0",
Name="rv_printformatdetail",
Owner="xendra",
Extension="")
	public static final String Identifier = "774b1095-6e71-6c90-2bf0-88000c65322d";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-07-09 19:02:34.0");
	sb.appendln("@Identifier=774b1095-6e71-6c90-2bf0-88000c65322d");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT f.ad_client_id, f.ad_org_id, i.isactive, i.created, i.createdby, i.updated, i.updatedby, f.ad_printformat_id, f.name, f.description, f.istablebased, f.isform, f.ad_table_id, f.ad_reportview_id, f.ad_printpaper_id, f.ad_printcolor_id AS default_ad_printcolor_id, f.ad_printfont_id AS default_ad_printfont_id, f.isstandardheaderfooter, f.ad_printtableformat_id, f.headermargin, f.footermargin, f.printername, f.isdefault, i.ad_printformatitem_id, i.name AS itemname, i.printname, i.printnamesuffix, i.isprinted, i.printareatype, i.seqno, i.printformattype, i.ad_column_id, i.ad_printformatchild_id, i.imageisattached, i.imageurl, i.isrelativeposition, i.isnextline, i.xspace, i.yspace, i.xposition, i.yposition, i.maxwidth, i.isheightoneline, i.maxheight, i.isfixedwidth, i.issetnlposition, i.issuppressnull, i.belowcolumn, i.fieldalignmenttype, i.linealignmenttype, i.ad_printcolor_id, i.ad_printfont_id, i.isorderby, i.sortno, i.isgroupby, i.ispagebreak, i.isnextpage, i.issummarized, i.isaveraged, i.iscounted, i.ismincalc, i.ismaxcalc, i.isvariancecalc, i.isdeviationcalc, i.isrunningtotal, i.runningtotallines, i.ad_printgraph_id FROM (ad_printformat f JOIN ad_printformatitem i ON ((f.ad_printformat_id = i.ad_printformat_id)));");
	return sb.toString();
}
}
