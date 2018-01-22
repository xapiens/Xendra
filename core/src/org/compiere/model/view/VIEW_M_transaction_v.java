package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_M_transaction_v 
{
 
@XendraTable(Name="M_Transaction_v",Description="",Help="",TableName="M_Transaction_v",
AccessLevel="3",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=0,LoadSeq=150,IsSecurityEnabled=false,
IsDeleteable=false,IsHighVolume=true,IsChangeLog=false,IsView=true,PO_Window_ID="",
ID="org.xendra.material",Identifier="f9738c52-97a7-dcb7-bf5d-850dcc01912c",
Synchronized="2017-08-16 12:38:14.0")
/** TableName=M_Transaction_v */
public static final String Table_Name="M_Transaction_v";

@XendraTrl(Identifier="10e775c9-9cd6-10ad-49bb-91f82fd0f353")
public static String es_PE_COLUMN_C_Project_ID_Name="Proyecto";

@XendraColumn(AD_Element_ID="16ff5dcc-9178-73dd-e618-e88bd79d573b",ColumnName="C_Project_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="10e775c9-9cd6-10ad-49bb-91f82fd0f353",
Synchronized="2017-08-16 12:38:14.0")
/** Column name C_Project_ID */
public static final String COLUMNNAME_C_Project_ID = "C_Project_ID";

@XendraTrl(Identifier="ac313c5f-421a-903b-96a8-1369be4fff88")
public static String es_PE_COLUMN_C_ProjectIssue_ID_Name="Asunto del Proyecto";

@XendraColumn(AD_Element_ID="6c6aa911-79e0-a8ca-00de-c0e2aa4fd667",ColumnName="C_ProjectIssue_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ac313c5f-421a-903b-96a8-1369be4fff88",
Synchronized="2017-08-16 12:38:14.0")
/** Column name C_ProjectIssue_ID */
public static final String COLUMNNAME_C_ProjectIssue_ID = "C_ProjectIssue_ID";

@XendraTrl(Identifier="e49dcd7a-b288-6c8b-10a4-badd197da800")
public static String es_PE_COLUMN_M_AttributeSetInstance_ID_Name="Instancia del Conjunto de Atributos";

@XendraColumn(AD_Element_ID="137807f2-3c52-e193-3ceb-f10b819cf955",
ColumnName="M_AttributeSetInstance_ID",AD_Reference_ID=35,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="e49dcd7a-b288-6c8b-10a4-badd197da800",Synchronized="2017-08-16 12:38:14.0")
/** Column name M_AttributeSetInstance_ID */
public static final String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";

@XendraTrl(Identifier="157bff43-7e3d-d5bc-b95a-517c40157c78")
public static String es_PE_COLUMN_M_InOut_ID_Name="Entrega / Recibo";

@XendraColumn(AD_Element_ID="5c1a0edf-01a0-832e-098b-d49510db71db",ColumnName="M_InOut_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="157bff43-7e3d-d5bc-b95a-517c40157c78",
Synchronized="2017-08-16 12:38:14.0")
/** Column name M_InOut_ID */
public static final String COLUMNNAME_M_InOut_ID = "M_InOut_ID";

@XendraTrl(Identifier="30c49095-51d3-2182-72f1-276b3ecd96ff")
public static String es_PE_COLUMN_M_InOutLine_ID_Name="Línea Entrega / Recibo";

@XendraColumn(AD_Element_ID="a4d9928e-fbec-fd6c-b061-d3dbbd7de02c",ColumnName="M_InOutLine_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="30c49095-51d3-2182-72f1-276b3ecd96ff",
Synchronized="2017-08-16 12:38:14.0")
/** Column name M_InOutLine_ID */
public static final String COLUMNNAME_M_InOutLine_ID = "M_InOutLine_ID";

@XendraTrl(Identifier="ed796e00-7cad-4ec6-8bb1-f606f23c007f")
public static String es_PE_COLUMN_M_Inventory_ID_Name="Inventario Físico";

@XendraColumn(AD_Element_ID="0e8f85f3-fbb2-f347-b412-2f2218e14665",ColumnName="M_Inventory_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ed796e00-7cad-4ec6-8bb1-f606f23c007f",
Synchronized="2017-08-16 12:38:14.0")
/** Column name M_Inventory_ID */
public static final String COLUMNNAME_M_Inventory_ID = "M_Inventory_ID";

@XendraTrl(Identifier="d33af8fb-d44f-060f-b7e8-e89135df7e32")
public static String es_PE_COLUMN_M_InventoryLine_ID_Name="Línea de Inventario Físico";

@XendraColumn(AD_Element_ID="2c5571d8-3b1f-8721-db52-cae644155140",ColumnName="M_InventoryLine_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d33af8fb-d44f-060f-b7e8-e89135df7e32",
Synchronized="2017-08-16 12:38:14.0")
/** Column name M_InventoryLine_ID */
public static final String COLUMNNAME_M_InventoryLine_ID = "M_InventoryLine_ID";

@XendraTrl(Identifier="03978fab-e40f-d054-e019-2f5fadf88adc")
public static String es_PE_COLUMN_M_Locator_ID_Name="Ubicación";

@XendraColumn(AD_Element_ID="67f044ce-2864-93f9-fd0d-320945150933",ColumnName="M_Locator_ID",
AD_Reference_ID=31,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="03978fab-e40f-d054-e019-2f5fadf88adc",
Synchronized="2017-08-16 12:38:14.0")
/** Column name M_Locator_ID */
public static final String COLUMNNAME_M_Locator_ID = "M_Locator_ID";

@XendraTrl(Identifier="9da15278-e118-3361-215b-66dab5e9c01f")
public static String es_PE_COLUMN_M_Movement_ID_Name="Movimiento";

@XendraColumn(AD_Element_ID="38464e21-16a7-4ca4-2d20-bfa901cb61fb",ColumnName="M_Movement_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9da15278-e118-3361-215b-66dab5e9c01f",
Synchronized="2017-08-16 12:38:14.0")
/** Column name M_Movement_ID */
public static final String COLUMNNAME_M_Movement_ID = "M_Movement_ID";

@XendraTrl(Identifier="05afee9e-9d75-d79e-53df-a1bc630b9045")
public static String es_PE_COLUMN_M_MovementLine_ID_Name="Línea del Movimiento";

@XendraColumn(AD_Element_ID="45800ec7-b982-e856-179e-390dd2305e2e",ColumnName="M_MovementLine_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="05afee9e-9d75-d79e-53df-a1bc630b9045",
Synchronized="2017-08-16 12:38:14.0")
/** Column name M_MovementLine_ID */
public static final String COLUMNNAME_M_MovementLine_ID = "M_MovementLine_ID";

@XendraTrl(Identifier="3ad680fd-a439-f737-8255-9aff781f54e6")
public static String es_PE_COLUMN_MovementDate_Name="Fecha de Movimiento";

@XendraColumn(AD_Element_ID="7a907f01-8525-820d-22d4-98b06d4b902b",ColumnName="MovementDate",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3ad680fd-a439-f737-8255-9aff781f54e6",
Synchronized="2017-08-16 12:38:14.0")
/** Column name MovementDate */
public static final String COLUMNNAME_MovementDate = "MovementDate";

@XendraTrl(Identifier="a3842b47-85dc-0d4d-1b04-529444c8473b")
public static String es_PE_COLUMN_MovementQty_Name="Cantidad del Movimiento";

@XendraColumn(AD_Element_ID="36c2f62a-1d3b-a3ff-a433-9fc2eec47380",ColumnName="MovementQty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a3842b47-85dc-0d4d-1b04-529444c8473b",
Synchronized="2017-08-16 12:38:14.0")
/** Column name MovementQty */
public static final String COLUMNNAME_MovementQty = "MovementQty";

@XendraTrl(Identifier="df2efe8e-dd4c-915e-9465-6a05166ea891")
public static String es_PE_COLUMN_MovementType_Name="Tipo de Movimiento";

@XendraColumn(AD_Element_ID="6deba235-3003-eca1-becf-5fd99b19b2a9",ColumnName="MovementType",
AD_Reference_ID=17,AD_Reference_Value_ID="0455b4db-004d-594c-a505-3e493bfda9ad",AD_Val_Rule_ID="",
FieldLength=2,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="df2efe8e-dd4c-915e-9465-6a05166ea891",Synchronized="2017-08-16 12:38:14.0")
/** Column name MovementType */
public static final String COLUMNNAME_MovementType = "MovementType";

@XendraTrl(Identifier="3422593f-aef0-9228-fc6d-6453f5d73e21")
public static String es_PE_COLUMN_M_Product_ID_Name="Producto";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3422593f-aef0-9228-fc6d-6453f5d73e21",
Synchronized="2017-08-16 12:38:14.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";

@XendraTrl(Identifier="43079aa6-ffe5-d1cd-bf12-8402c350487f")
public static String es_PE_COLUMN_M_Production_ID_Name="Producción";

@XendraColumn(AD_Element_ID="9c8dd82c-e2c6-2b73-d9f8-045652e10cb9",ColumnName="M_Production_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="43079aa6-ffe5-d1cd-bf12-8402c350487f",
Synchronized="2017-08-16 12:38:14.0")
/** Column name M_Production_ID */
public static final String COLUMNNAME_M_Production_ID = "M_Production_ID";

@XendraTrl(Identifier="e43b101a-f1ba-f77b-d054-3e086c158600")
public static String es_PE_COLUMN_M_ProductionLine_ID_Name="Línea de Producción";

@XendraColumn(AD_Element_ID="cd41491f-514d-42fd-aaf9-36308e165c0b",
ColumnName="M_ProductionLine_ID",AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="e43b101a-f1ba-f77b-d054-3e086c158600",Synchronized="2017-08-16 12:38:14.0")
/** Column name M_ProductionLine_ID */
public static final String COLUMNNAME_M_ProductionLine_ID = "M_ProductionLine_ID";
/** Column name M_Transaction_ID */
public static final String COLUMNNAME_M_Transaction_ID = "M_Transaction_ID";
	@XendraView(Identifier="f9738c52-97a7-dcb7-bf5d-850dcc01912c",
Synchronized="2013-07-09 19:02:34.0",
Name="m_transaction_v",
Owner="xendra",
Extension="")
	public static final String Identifier = "f9738c52-97a7-dcb7-bf5d-850dcc01912c";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-07-09 19:02:34.0");
	sb.appendln("@Identifier=f9738c52-97a7-dcb7-bf5d-850dcc01912c");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT t.m_transaction_id, t.ad_client_id, t.ad_org_id, t.isactive, t.created, t.createdby, t.updated, t.updatedby, t.movementtype, t.m_locator_id, t.m_product_id, t.movementdate, t.movementqty, t.m_inventoryline_id, i.m_inventory_id, t.m_movementline_id, m.m_movement_id, t.m_inoutline_id, io.m_inout_id, t.m_productionline_id, pp.m_production_id, t.c_projectissue_id, pi.c_project_id, t.m_attributesetinstance_id FROM ((((((m_transaction t LEFT JOIN m_inoutline io ON (((t.m_inoutline_id = io.m_inoutline_id) AND (t.m_attributesetinstance_id = io.m_attributesetinstance_id)))) LEFT JOIN m_movementline m ON (((t.m_movementline_id = m.m_movementline_id) AND (t.m_attributesetinstance_id = m.m_attributesetinstance_id)))) LEFT JOIN m_inventoryline i ON (((t.m_inventoryline_id = i.m_inventoryline_id) AND (t.m_attributesetinstance_id = i.m_attributesetinstance_id)))) LEFT JOIN c_projectissue pi ON (((t.c_projectissue_id = pi.c_projectissue_id) AND (t.m_attributesetinstance_id = pi.m_attributesetinstance_id)))) LEFT JOIN m_productionline pl ON (((t.m_productionline_id = pl.m_productionline_id) AND (t.m_attributesetinstance_id = pl.m_attributesetinstance_id)))) LEFT JOIN m_productionplan pp ON ((pl.m_productionplan_id = pp.m_productionplan_id)));");
	return sb.toString();
}
}
