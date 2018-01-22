package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_M_movementlinema_v 
{
 
@XendraTable(Name="M_MovementLineMA_v",Description="",Help="",TableName="M_MovementLineMA_v",
AccessLevel="3",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=0,LoadSeq=150,IsSecurityEnabled=false,
IsDeleteable=false,IsHighVolume=true,IsChangeLog=false,IsView=true,PO_Window_ID="",
ID="org.xendra.material",Identifier="efac7332-6dd3-c94e-f5b8-566b5b1ea71d",
Synchronized="2017-08-16 12:37:59.0")
/** TableName=M_MovementLineMA_v */
public static final String Table_Name="M_MovementLineMA_v";

@XendraTrl(Identifier="e459403e-4cf9-4681-ae2e-197a4adadc2f")
public static String es_PE_FIELD_Movement_LineNo_Name="No. Línea";

@XendraTrl(Identifier="e459403e-4cf9-4681-ae2e-197a4adadc2f")
public static String es_PE_FIELD_Movement_LineNo_Description="No. Línea único para este documento";

@XendraTrl(Identifier="e459403e-4cf9-4681-ae2e-197a4adadc2f")
public static String es_PE_FIELD_Movement_LineNo_Help="Indica el No. Línea para un documento. También controlará el orden de despliegue de las líneas dentro de un documento";

@XendraField(AD_Column_ID="Line",IsCentrallyMaintained=true,
AD_Tab_ID="c1f590f5-b241-56e8-ae4a-68b22308cbf1",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-09-19 16:06:16.0",
Identifier="e459403e-4cf9-4681-ae2e-197a4adadc2f")
public static final String FIELDNAME_Movement_LineNo="e459403e-4cf9-4681-ae2e-197a4adadc2f";

@XendraTrl(Identifier="45d2bb0c-4833-4766-8c3d-eff3ff2a6c85")
public static String es_PE_COLUMN_Line_Name="Line No";

@XendraColumn(AD_Element_ID="986ef077-61da-f9cf-1c6d-aefe3a35113b",ColumnName="Line",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="45d2bb0c-4833-4766-8c3d-eff3ff2a6c85",
Synchronized="2017-08-16 12:37:59.0")
/** Column name Line */
public static final String COLUMNNAME_Line = "Line";

@XendraTrl(Identifier="7af4e300-c3b8-43f5-be2e-23e319c88929")
public static String es_PE_FIELD_Movement_AttributeSetInstance_Name="Instancia del Conjunto de Atributos";

@XendraTrl(Identifier="7af4e300-c3b8-43f5-be2e-23e319c88929")
public static String es_PE_FIELD_Movement_AttributeSetInstance_Description="Instancia del conjunto de atributos del producto";

@XendraTrl(Identifier="7af4e300-c3b8-43f5-be2e-23e319c88929")
public static String es_PE_FIELD_Movement_AttributeSetInstance_Help="Valor actual de Instancia del conjunto de atributos del producto";

@XendraField(AD_Column_ID="M_AttributeSetInstance_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c1f590f5-b241-56e8-ae4a-68b22308cbf1",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-09-19 16:06:16.0",
Identifier="7af4e300-c3b8-43f5-be2e-23e319c88929")
public static final String FIELDNAME_Movement_AttributeSetInstance="7af4e300-c3b8-43f5-be2e-23e319c88929";

@XendraTrl(Identifier="2cc889ff-9796-1cf4-e9fb-ed4080dd3684")
public static String es_PE_COLUMN_M_AttributeSetInstance_ID_Name="Instancia del Conjunto de Atributos";

@XendraColumn(AD_Element_ID="137807f2-3c52-e193-3ceb-f10b819cf955",
ColumnName="M_AttributeSetInstance_ID",AD_Reference_ID=35,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,
IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",Version="0",
IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2cc889ff-9796-1cf4-e9fb-ed4080dd3684",
Synchronized="2017-08-16 12:37:59.0")
/** Column name M_AttributeSetInstance_ID */
public static final String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";

@XendraTrl(Identifier="bfbbd341-b0e4-458d-9caf-aec430b5a115")
public static String es_PE_FIELD_Movement_Locator_Name="Ubicación";

@XendraTrl(Identifier="bfbbd341-b0e4-458d-9caf-aec430b5a115")
public static String es_PE_FIELD_Movement_Locator_Description="Ubicación de Almacén";

@XendraTrl(Identifier="bfbbd341-b0e4-458d-9caf-aec430b5a115")
public static String es_PE_FIELD_Movement_Locator_Help="El ID de la ubicación indica en que parte del almacén se localiza el producto";

@XendraField(AD_Column_ID="M_Locator_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c1f590f5-b241-56e8-ae4a-68b22308cbf1",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-09-19 16:06:16.0",
Identifier="bfbbd341-b0e4-458d-9caf-aec430b5a115")
public static final String FIELDNAME_Movement_Locator="bfbbd341-b0e4-458d-9caf-aec430b5a115";

@XendraTrl(Identifier="c404277a-a08f-405c-b323-d7a973fe4e49")
public static String es_PE_COLUMN_M_Locator_ID_Name="Locator";

@XendraColumn(AD_Element_ID="67f044ce-2864-93f9-fd0d-320945150933",ColumnName="M_Locator_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c404277a-a08f-405c-b323-d7a973fe4e49",
Synchronized="2017-08-16 12:37:59.0")
/** Column name M_Locator_ID */
public static final String COLUMNNAME_M_Locator_ID = "M_Locator_ID";

@XendraTrl(Identifier="12e90603-5b15-48df-bca5-07763d3d702d")
public static String es_PE_FIELD_Movement_LocatorTo_Name="A Ubicación";

@XendraTrl(Identifier="12e90603-5b15-48df-bca5-07763d3d702d")
public static String es_PE_FIELD_Movement_LocatorTo_Description="Ubicación a la que se mueve el inventario.";

@XendraTrl(Identifier="12e90603-5b15-48df-bca5-07763d3d702d")
public static String es_PE_FIELD_Movement_LocatorTo_Help="La Ubicación A indica la ubicación a donde el inventario está siendo movido.";

@XendraField(AD_Column_ID="M_LocatorTo_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c1f590f5-b241-56e8-ae4a-68b22308cbf1",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-09-19 16:06:16.0",
Identifier="12e90603-5b15-48df-bca5-07763d3d702d")
public static final String FIELDNAME_Movement_LocatorTo="12e90603-5b15-48df-bca5-07763d3d702d";

@XendraTrl(Identifier="33ad8ea1-dc5e-40eb-93a0-f0c66f56d9e3")
public static String es_PE_COLUMN_M_LocatorTo_ID_Name="Locator To";

@XendraColumn(AD_Element_ID="29ad8776-f5f4-1c02-068c-d8c4538fa8be",ColumnName="M_LocatorTo_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="33ad8ea1-dc5e-40eb-93a0-f0c66f56d9e3",
Synchronized="2017-08-16 12:37:59.0")
/** Column name M_LocatorTo_ID */
public static final String COLUMNNAME_M_LocatorTo_ID = "M_LocatorTo_ID";

@XendraTrl(Identifier="6e1afa74-a6fb-43d7-adb5-79da8e44d3e2")
public static String es_PE_FIELD_Movement_InventoryMove_Name="Movimiento";

@XendraTrl(Identifier="6e1afa74-a6fb-43d7-adb5-79da8e44d3e2")
public static String es_PE_FIELD_Movement_InventoryMove_Description="Movimiento de inventario";

@XendraTrl(Identifier="6e1afa74-a6fb-43d7-adb5-79da8e44d3e2")
public static String es_PE_FIELD_Movement_InventoryMove_Help="El Movimiento de Inventario identifica únicamente un grupo de líneas de movimiento";

@XendraField(AD_Column_ID="M_Movement_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c1f590f5-b241-56e8-ae4a-68b22308cbf1",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-09-19 16:06:16.0",
Identifier="6e1afa74-a6fb-43d7-adb5-79da8e44d3e2")
public static final String FIELDNAME_Movement_InventoryMove="6e1afa74-a6fb-43d7-adb5-79da8e44d3e2";

@XendraTrl(Identifier="96510122-0a7a-4e1d-86a3-a46e11f6477d")
public static String es_PE_COLUMN_M_Movement_ID_Name="Inventory Move";

@XendraColumn(AD_Element_ID="38464e21-16a7-4ca4-2d20-bfa901cb61fb",ColumnName="M_Movement_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="96510122-0a7a-4e1d-86a3-a46e11f6477d",
Synchronized="2017-08-16 12:37:59.0")
/** Column name M_Movement_ID */
public static final String COLUMNNAME_M_Movement_ID = "M_Movement_ID";

@XendraTrl(Identifier="97084d0b-8e91-4ae2-b1ff-7cac31a44648")
public static String es_PE_FIELD_Movement_MoveLine_Name="Línea del Movimiento";

@XendraTrl(Identifier="97084d0b-8e91-4ae2-b1ff-7cac31a44648")
public static String es_PE_FIELD_Movement_MoveLine_Description="Línea del documento de movimiento de inventario";

@XendraTrl(Identifier="97084d0b-8e91-4ae2-b1ff-7cac31a44648")
public static String es_PE_FIELD_Movement_MoveLine_Help="La línea del movimiento indica la linea del documento de movimiento de inventario (si aplica) para esta transacción.";

@XendraField(AD_Column_ID="M_MovementLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c1f590f5-b241-56e8-ae4a-68b22308cbf1",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-09-19 16:06:16.0",
Identifier="97084d0b-8e91-4ae2-b1ff-7cac31a44648")
public static final String FIELDNAME_Movement_MoveLine="97084d0b-8e91-4ae2-b1ff-7cac31a44648";

@XendraTrl(Identifier="ad247b12-53ed-4591-9cb3-2f58729df864")
public static String es_PE_COLUMN_M_MovementLine_ID_Name="Move Line";

@XendraColumn(AD_Element_ID="45800ec7-b982-e856-179e-390dd2305e2e",ColumnName="M_MovementLine_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ad247b12-53ed-4591-9cb3-2f58729df864",
Synchronized="2017-08-16 12:37:59.0")
/** Column name M_MovementLine_ID */
public static final String COLUMNNAME_M_MovementLine_ID = "M_MovementLine_ID";

@XendraTrl(Identifier="a10e7176-5462-4d1c-98cf-db395d7f0e5e")
public static String es_PE_FIELD_Movement_MovementQuantity_Name="Cantidad del Movimiento";

@XendraTrl(Identifier="a10e7176-5462-4d1c-98cf-db395d7f0e5e")
public static String es_PE_FIELD_Movement_MovementQuantity_Description="Cantidad de un producto movido";

@XendraTrl(Identifier="a10e7176-5462-4d1c-98cf-db395d7f0e5e")
public static String es_PE_FIELD_Movement_MovementQuantity_Help="La Cantidad del Movimiento indica la cantidad de un producto que ha sido movido";

@XendraField(AD_Column_ID="MovementQty",IsCentrallyMaintained=true,
AD_Tab_ID="c1f590f5-b241-56e8-ae4a-68b22308cbf1",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=131089,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-09-19 16:06:16.0",
Identifier="a10e7176-5462-4d1c-98cf-db395d7f0e5e")
public static final String FIELDNAME_Movement_MovementQuantity="a10e7176-5462-4d1c-98cf-db395d7f0e5e";

@XendraTrl(Identifier="8fcbb27b-62ec-4493-a21c-756a984487a1")
public static String es_PE_COLUMN_MovementQty_Name="Movement Quantity";

@XendraColumn(AD_Element_ID="36c2f62a-1d3b-a3ff-a433-9fc2eec47380",ColumnName="MovementQty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8fcbb27b-62ec-4493-a21c-756a984487a1",
Synchronized="2017-08-16 12:37:59.0")
/** Column name MovementQty */
public static final String COLUMNNAME_MovementQty = "MovementQty";

@XendraTrl(Identifier="f11b81b3-6806-48f8-9ccb-cec4b92bc0f2")
public static String es_PE_FIELD_Movement_Product_Name="Producto";

@XendraTrl(Identifier="f11b81b3-6806-48f8-9ccb-cec4b92bc0f2")
public static String es_PE_FIELD_Movement_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="f11b81b3-6806-48f8-9ccb-cec4b92bc0f2")
public static String es_PE_FIELD_Movement_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c1f590f5-b241-56e8-ae4a-68b22308cbf1",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-09-19 16:06:16.0",
Identifier="f11b81b3-6806-48f8-9ccb-cec4b92bc0f2")
public static final String FIELDNAME_Movement_Product="f11b81b3-6806-48f8-9ccb-cec4b92bc0f2";

@XendraTrl(Identifier="dd4e8527-a5f5-44c2-8f5f-df99400ee087")
public static String es_PE_COLUMN_M_Product_ID_Name="Product";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="dd4e8527-a5f5-44c2-8f5f-df99400ee087",
Synchronized="2017-08-16 12:37:59.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
	@XendraView(Identifier="efac7332-6dd3-c94e-f5b8-566b5b1ea71d",
Synchronized="2013-07-09 19:02:34.0",
Name="m_movementlinema_v",
Owner="xendra",
Extension="")
	public static final String Identifier = "efac7332-6dd3-c94e-f5b8-566b5b1ea71d";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-07-09 19:02:34.0");
	sb.appendln("@Identifier=efac7332-6dd3-c94e-f5b8-566b5b1ea71d");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT m.ad_client_id, m.ad_org_id, m.isactive, m.created, m.createdby, m.updated, m.updatedby, l.m_movement_id, m.m_movementline_id, l.line, l.m_product_id, m.m_attributesetinstance_id, m.movementqty, l.m_locator_id, l.m_locatorto_id FROM (m_movementlinema m JOIN m_movementline l ON ((m.m_movementline_id = l.m_movementline_id))) UNION SELECT m_movementline.ad_client_id, m_movementline.ad_org_id, m_movementline.isactive, m_movementline.created, m_movementline.createdby, m_movementline.updated, m_movementline.updatedby, m_movementline.m_movement_id, m_movementline.m_movementline_id, m_movementline.line, m_movementline.m_product_id, m_movementline.m_attributesetinstance_id, m_movementline.movementqty, m_movementline.m_locator_id, m_movementline.m_locatorto_id FROM m_movementline;");
	return sb.toString();
}
}
