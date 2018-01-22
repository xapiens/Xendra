package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_M_inoutlinema_vt 
{
 	@XendraView(Identifier="191426ad-743f-7e2f-9036-fc59a86b24a2",
Synchronized="2013-07-09 19:02:34.0",
Name="m_inoutlinema_vt",
Owner="xendra",
Extension="")
	public static final String Identifier = "191426ad-743f-7e2f-9036-fc59a86b24a2";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-07-09 19:02:34.0");
	sb.appendln("@Identifier=191426ad-743f-7e2f-9036-fc59a86b24a2");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT m.ad_client_id, m.ad_org_id, m.isactive, m.created, m.createdby, m.updated, m.updatedby, l.m_inout_id, m.m_inoutline_id, l.line, l.m_product_id, m.m_attributesetinstance_id, m.movementqty, l.m_locator_id FROM (m_inoutlinema m JOIN m_inoutline l ON ((m.m_inoutline_id = l.m_inoutline_id))) UNION SELECT m_inoutline.ad_client_id, m_inoutline.ad_org_id, m_inoutline.isactive, m_inoutline.created, m_inoutline.createdby, m_inoutline.updated, m_inoutline.updatedby, m_inoutline.m_inout_id, m_inoutline.m_inoutline_id, m_inoutline.line, m_inoutline.m_product_id, m_inoutline.m_attributesetinstance_id, m_inoutline.movementqty, m_inoutline.m_locator_id FROM m_inoutline;");
	return sb.toString();
}
}
