package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_Ad_window_vt 
{
 	@XendraView(Identifier="47056755-51e4-2972-b662-20227b47d9b7",
Synchronized="2013-07-09 19:02:34.0",
Name="ad_window_vt",
Owner="xendra",
Extension="")
	public static final String Identifier = "47056755-51e4-2972-b662-20227b47d9b7";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-07-09 19:02:34.0");
	sb.appendln("@Identifier=47056755-51e4-2972-b662-20227b47d9b7");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT trl.ad_language, bt.ad_window_id, trl.name, trl.description, trl.help, bt.windowtype, bt.ad_color_id, bt.ad_image_id, bt.isactive, bt.winwidth, bt.winheight, bt.issotrx FROM (ad_window bt JOIN ad_window_trl trl ON ((bt.ad_window_id = trl.ad_window_id))) WHERE (bt.isactive = 'Y'::bpchar);");
	return sb.toString();
}
}
