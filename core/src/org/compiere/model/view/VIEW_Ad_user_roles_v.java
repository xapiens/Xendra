package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_Ad_user_roles_v 
{
 	@XendraView(Identifier="786e2d51-5a6f-b516-fe11-87a10c48ffbd",
Synchronized="2013-07-09 19:02:34.0",
Name="ad_user_roles_v",
Owner="xendra",
Extension="")
	public static final String Identifier = "786e2d51-5a6f-b516-fe11-87a10c48ffbd";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-07-09 19:02:34.0");
	sb.appendln("@Identifier=786e2d51-5a6f-b516-fe11-87a10c48ffbd");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT u.name, r.name AS rolename FROM ((ad_user_roles ur JOIN ad_user u ON ((ur.ad_user_id = u.ad_user_id))) JOIN ad_role r ON ((ur.ad_role_id = r.ad_role_id)));");
	return sb.toString();
}
}
