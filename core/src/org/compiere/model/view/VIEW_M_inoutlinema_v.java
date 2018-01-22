package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_M_inoutlinema_v 
{
 
@XendraTable(Name="M_InOutLineMA_v",Description="",Help="",TableName="M_InOutLineMA_v",
AccessLevel="3",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=0,LoadSeq=150,IsSecurityEnabled=false,
IsDeleteable=false,IsHighVolume=true,IsChangeLog=false,IsView=true,PO_Window_ID="",
ID="org.xendra.material",Identifier="ca187305-cdeb-81d6-9f59-ddff4987fb0f",
Synchronized="2017-08-16 12:37:54.0")
/** TableName=M_InOutLineMA_v */
public static final String Table_Name="M_InOutLineMA_v";

@XendraTrl(Identifier="8b61931b-75aa-4968-b1df-608b38cc8abb")
public static String es_PE_FIELD_ShipmentReceipt_LineNo_Name="No. Línea";

@XendraTrl(Identifier="8b61931b-75aa-4968-b1df-608b38cc8abb")
public static String es_PE_FIELD_ShipmentReceipt_LineNo_Description="No. Línea único para este documento";

@XendraTrl(Identifier="8b61931b-75aa-4968-b1df-608b38cc8abb")
public static String es_PE_FIELD_ShipmentReceipt_LineNo_Help="Indica el No. Línea para un documento. También controlará el orden de despliegue de las líneas dentro de un documento";

@XendraField(AD_Column_ID="Line",IsCentrallyMaintained=true,
AD_Tab_ID="20f61026-efcf-1aef-3737-fefbfc003362",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-09-19 16:06:16.0",
Identifier="8b61931b-75aa-4968-b1df-608b38cc8abb")
public static final String FIELDNAME_ShipmentReceipt_LineNo="8b61931b-75aa-4968-b1df-608b38cc8abb";

@XendraTrl(Identifier="b11de682-f598-4efe-8e19-1369ffbbdbc1")
public static String es_PE_COLUMN_Line_Name="Line No";

@XendraColumn(AD_Element_ID="986ef077-61da-f9cf-1c6d-aefe3a35113b",ColumnName="Line",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b11de682-f598-4efe-8e19-1369ffbbdbc1",
Synchronized="2017-08-16 12:37:54.0")
/** Column name Line */
public static final String COLUMNNAME_Line = "Line";

@XendraTrl(Identifier="3fa70b6e-abcb-48d1-8fe6-7a736356c6c6")
public static String es_PE_FIELD_ShipmentReceipt_AttributeSetInstance_Name="Instancia del Conjunto de Atributos";

@XendraTrl(Identifier="3fa70b6e-abcb-48d1-8fe6-7a736356c6c6")
public static String es_PE_FIELD_ShipmentReceipt_AttributeSetInstance_Description="Instancia del conjunto de atributos del producto";

@XendraTrl(Identifier="3fa70b6e-abcb-48d1-8fe6-7a736356c6c6")
public static String es_PE_FIELD_ShipmentReceipt_AttributeSetInstance_Help="Valor actual de Instancia del conjunto de atributos del producto";

@XendraField(AD_Column_ID="M_AttributeSetInstance_ID",IsCentrallyMaintained=true,
AD_Tab_ID="20f61026-efcf-1aef-3737-fefbfc003362",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-09-19 16:06:16.0",
Identifier="3fa70b6e-abcb-48d1-8fe6-7a736356c6c6")
public static final String FIELDNAME_ShipmentReceipt_AttributeSetInstance="3fa70b6e-abcb-48d1-8fe6-7a736356c6c6";

@XendraTrl(Identifier="07477560-c3db-4598-9a1a-2f595e07538d")
public static String es_PE_COLUMN_M_AttributeSetInstance_ID_Name="Attribute Set Instance";

@XendraColumn(AD_Element_ID="137807f2-3c52-e193-3ceb-f10b819cf955",
ColumnName="M_AttributeSetInstance_ID",AD_Reference_ID=35,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,
IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",Version="0",
IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="07477560-c3db-4598-9a1a-2f595e07538d",
Synchronized="2017-08-16 12:37:54.0")
/** Column name M_AttributeSetInstance_ID */
public static final String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";

@XendraTrl(Identifier="03380413-ed12-4b60-a652-356f91d3c3ea")
public static String es_PE_FIELD_ShipmentReceipt_ShipmentReceipt_Name="Entrega / Recibo";

@XendraTrl(Identifier="03380413-ed12-4b60-a652-356f91d3c3ea")
public static String es_PE_FIELD_ShipmentReceipt_ShipmentReceipt_Description="Entrega ó documento de recibo";

@XendraTrl(Identifier="03380413-ed12-4b60-a652-356f91d3c3ea")
public static String es_PE_FIELD_ShipmentReceipt_ShipmentReceipt_Help="La ID de Entrega / Recibo indica el documento único para esta entrega ó recibo";

@XendraField(AD_Column_ID="M_InOut_ID",IsCentrallyMaintained=true,
AD_Tab_ID="20f61026-efcf-1aef-3737-fefbfc003362",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-09-19 16:06:16.0",
Identifier="03380413-ed12-4b60-a652-356f91d3c3ea")
public static final String FIELDNAME_ShipmentReceipt_ShipmentReceipt="03380413-ed12-4b60-a652-356f91d3c3ea";

@XendraTrl(Identifier="a8951fab-f573-44fb-bb05-25a33ad3aed1")
public static String es_PE_COLUMN_M_InOut_ID_Name="Shipment/Receipt";

@XendraColumn(AD_Element_ID="5c1a0edf-01a0-832e-098b-d49510db71db",ColumnName="M_InOut_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a8951fab-f573-44fb-bb05-25a33ad3aed1",
Synchronized="2017-08-16 12:37:54.0")
/** Column name M_InOut_ID */
public static final String COLUMNNAME_M_InOut_ID = "M_InOut_ID";

@XendraTrl(Identifier="97560a5c-95b1-40d5-a741-9334e7878679")
public static String es_PE_FIELD_ShipmentReceipt_ShipmentReceiptLine_Name="Línea Entrega / Recibo";

@XendraTrl(Identifier="97560a5c-95b1-40d5-a741-9334e7878679")
public static String es_PE_FIELD_ShipmentReceipt_ShipmentReceiptLine_Description="Línea de entrega ó documento de recibo.";

@XendraTrl(Identifier="97560a5c-95b1-40d5-a741-9334e7878679")
public static String es_PE_FIELD_ShipmentReceipt_ShipmentReceiptLine_Help="La línea de Entrega / Recibo indica una línea única en un documento de entrega / recibo";

@XendraField(AD_Column_ID="M_InOutLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="20f61026-efcf-1aef-3737-fefbfc003362",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-09-19 16:06:16.0",
Identifier="97560a5c-95b1-40d5-a741-9334e7878679")
public static final String FIELDNAME_ShipmentReceipt_ShipmentReceiptLine="97560a5c-95b1-40d5-a741-9334e7878679";

@XendraTrl(Identifier="7e3dd3f1-5055-45ca-8e19-976d46bbd7b0")
public static String es_PE_COLUMN_M_InOutLine_ID_Name="Shipment/Receipt Line";

@XendraColumn(AD_Element_ID="a4d9928e-fbec-fd6c-b061-d3dbbd7de02c",ColumnName="M_InOutLine_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7e3dd3f1-5055-45ca-8e19-976d46bbd7b0",
Synchronized="2017-08-16 12:37:54.0")
/** Column name M_InOutLine_ID */
public static final String COLUMNNAME_M_InOutLine_ID = "M_InOutLine_ID";

@XendraTrl(Identifier="6b51192a-245c-406b-8fa6-e63cfacad734")
public static String es_PE_FIELD_ShipmentReceipt_Locator_Name="Ubicación";

@XendraTrl(Identifier="6b51192a-245c-406b-8fa6-e63cfacad734")
public static String es_PE_FIELD_ShipmentReceipt_Locator_Description="Ubicación de Almacén";

@XendraTrl(Identifier="6b51192a-245c-406b-8fa6-e63cfacad734")
public static String es_PE_FIELD_ShipmentReceipt_Locator_Help="El ID de la ubicación indica en que parte del almacén se localiza el producto";

@XendraField(AD_Column_ID="M_Locator_ID",IsCentrallyMaintained=true,
AD_Tab_ID="20f61026-efcf-1aef-3737-fefbfc003362",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-09-19 16:06:16.0",
Identifier="6b51192a-245c-406b-8fa6-e63cfacad734")
public static final String FIELDNAME_ShipmentReceipt_Locator="6b51192a-245c-406b-8fa6-e63cfacad734";

@XendraTrl(Identifier="521f7d11-bd8f-42fd-a6b1-50bb01ec95f9")
public static String es_PE_COLUMN_M_Locator_ID_Name="Locator";

@XendraColumn(AD_Element_ID="67f044ce-2864-93f9-fd0d-320945150933",ColumnName="M_Locator_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="521f7d11-bd8f-42fd-a6b1-50bb01ec95f9",
Synchronized="2017-08-16 12:37:54.0")
/** Column name M_Locator_ID */
public static final String COLUMNNAME_M_Locator_ID = "M_Locator_ID";

@XendraTrl(Identifier="d14772c2-8803-490c-90b7-c6a16371ca60")
public static String es_PE_FIELD_ShipmentReceipt_MovementQuantity_Name="Cantidad del Movimiento";

@XendraTrl(Identifier="d14772c2-8803-490c-90b7-c6a16371ca60")
public static String es_PE_FIELD_ShipmentReceipt_MovementQuantity_Description="Cantidad de un producto movido";

@XendraTrl(Identifier="d14772c2-8803-490c-90b7-c6a16371ca60")
public static String es_PE_FIELD_ShipmentReceipt_MovementQuantity_Help="La Cantidad del Movimiento indica la cantidad de un producto que ha sido movido";

@XendraField(AD_Column_ID="MovementQty",IsCentrallyMaintained=true,
AD_Tab_ID="20f61026-efcf-1aef-3737-fefbfc003362",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=131089,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-09-19 16:06:16.0",
Identifier="d14772c2-8803-490c-90b7-c6a16371ca60")
public static final String FIELDNAME_ShipmentReceipt_MovementQuantity="d14772c2-8803-490c-90b7-c6a16371ca60";

@XendraTrl(Identifier="50a69c8e-9b2e-4b3f-86c9-670a694726e6")
public static String es_PE_COLUMN_MovementQty_Name="Movement Quantity";

@XendraColumn(AD_Element_ID="36c2f62a-1d3b-a3ff-a433-9fc2eec47380",ColumnName="MovementQty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="50a69c8e-9b2e-4b3f-86c9-670a694726e6",
Synchronized="2017-08-16 12:37:54.0")
/** Column name MovementQty */
public static final String COLUMNNAME_MovementQty = "MovementQty";

@XendraTrl(Identifier="59d0efed-94c9-4807-826b-14e74fd31e76")
public static String es_PE_FIELD_ShipmentReceipt_Product_Name="Producto";

@XendraTrl(Identifier="59d0efed-94c9-4807-826b-14e74fd31e76")
public static String es_PE_FIELD_ShipmentReceipt_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="59d0efed-94c9-4807-826b-14e74fd31e76")
public static String es_PE_FIELD_ShipmentReceipt_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="20f61026-efcf-1aef-3737-fefbfc003362",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-09-19 16:06:16.0",
Identifier="59d0efed-94c9-4807-826b-14e74fd31e76")
public static final String FIELDNAME_ShipmentReceipt_Product="59d0efed-94c9-4807-826b-14e74fd31e76";

@XendraTrl(Identifier="2abb7f74-6499-4c3d-bd39-fbb3c566107c")
public static String es_PE_COLUMN_M_Product_ID_Name="Product";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2abb7f74-6499-4c3d-bd39-fbb3c566107c",
Synchronized="2017-08-16 12:37:54.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
	@XendraView(Identifier="ca187305-cdeb-81d6-9f59-ddff4987fb0f",
Synchronized="2013-07-09 19:02:34.0",
Name="m_inoutlinema_v",
Owner="xendra",
Extension="")
	public static final String Identifier = "ca187305-cdeb-81d6-9f59-ddff4987fb0f";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-07-09 19:02:34.0");
	sb.appendln("@Identifier=ca187305-cdeb-81d6-9f59-ddff4987fb0f");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT m.ad_client_id, m.ad_org_id, m.isactive, m.created, m.createdby, m.updated, m.updatedby, l.m_inout_id, m.m_inoutline_id, l.line, l.m_product_id, m.m_attributesetinstance_id, m.movementqty, l.m_locator_id FROM (m_inoutlinema m JOIN m_inoutline l ON ((m.m_inoutline_id = l.m_inoutline_id))) UNION SELECT m_inoutline.ad_client_id, m_inoutline.ad_org_id, m_inoutline.isactive, m_inoutline.created, m_inoutline.createdby, m_inoutline.updated, m_inoutline.updatedby, m_inoutline.m_inout_id, m_inoutline.m_inoutline_id, m_inoutline.line, m_inoutline.m_product_id, m_inoutline.m_attributesetinstance_id, m_inoutline.movementqty, m_inoutline.m_locator_id FROM m_inoutline;");
	return sb.toString();
}
}
