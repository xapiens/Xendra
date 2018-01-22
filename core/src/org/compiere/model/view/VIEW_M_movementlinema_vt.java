package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_M_movementlinema_vt 
{
 	@XendraView(Identifier="5f576ffa-996d-47eb-8ded-a0a059d2202f",
Synchronized="2013-07-09 19:02:34.0",
Name="m_movementlinema_vt",
Owner="xendra",
Extension="")
	public static final String Identifier = "5f576ffa-996d-47eb-8ded-a0a059d2202f";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-07-09 19:02:34.0");
	sb.appendln("@Identifier=5f576ffa-996d-47eb-8ded-a0a059d2202f");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT m.ad_client_id, m.ad_org_id, m.isactive, m.created, m.createdby, m.updated, m.updatedby, l.m_movement_id, m.m_movementline_id, l.line, l.m_product_id, m.m_attributesetinstance_id, m.movementqty, l.m_locator_id, l.m_locatorto_id FROM (m_movementlinema m JOIN m_movementline l ON ((m.m_movementline_id = l.m_movementline_id))) UNION SELECT m_movementline.ad_client_id, m_movementline.ad_org_id, m_movementline.isactive, m_movementline.created, m_movementline.createdby, m_movementline.updated, m_movementline.updatedby, m_movementline.m_movement_id, m_movementline.m_movementline_id, m_movementline.line, m_movementline.m_product_id, m_movementline.m_attributesetinstance_id, m_movementline.movementqty, m_movementline.m_locator_id, m_movementline.m_locatorto_id FROM m_movementline;");
	return sb.toString();
}
}
