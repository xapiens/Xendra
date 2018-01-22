package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_C_rfqresponseline_v 
{
 
@XendraTable(Name="C_RfQResponseLine_v",Description="",Help="",TableName="C_RfQResponseLine_v",
AccessLevel="3",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=0,LoadSeq=150,IsSecurityEnabled=false,
IsDeleteable=false,IsHighVolume=true,IsChangeLog=false,IsView=true,PO_Window_ID="",
ID="org.xendra.commercial",Identifier="e8b859dc-62f1-04ea-b795-4e1a45769ae1",
Synchronized="2017-08-16 12:37:09.0")
/** TableName=C_RfQResponseLine_v */
public static final String Table_Name="C_RfQResponseLine_v";

@XendraTrl(Identifier="f9914b66-baea-078a-de91-64032b49f103")
public static String es_PE_COLUMN_AD_Language_Name="Lenguaje";

@XendraColumn(AD_Element_ID="d542d9da-4627-0da8-89af-5797f22de434",ColumnName="AD_Language",
AD_Reference_ID=18,AD_Reference_Value_ID="136e26cd-6ffa-f76c-1e63-cce5ed2025b9",AD_Val_Rule_ID="",
FieldLength=5,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="f9914b66-baea-078a-de91-64032b49f103",Synchronized="2017-08-26 19:41:31.0")
/** Column name AD_Language */
public static final String COLUMNNAME_AD_Language = "AD_Language";

@XendraTrl(Identifier="cb456b1c-4a88-4b5a-43c8-62e6b93bcce5")
public static String es_PE_COLUMN_BenchmarkPrice_Name="Precio Prueba patrón";

@XendraColumn(AD_Element_ID="952d2ebb-b4b4-6959-e9a0-9ecae843eaad",ColumnName="BenchmarkPrice",
AD_Reference_ID=37,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cb456b1c-4a88-4b5a-43c8-62e6b93bcce5",
Synchronized="2017-08-16 12:37:09.0")
/** Column name BenchmarkPrice */
public static final String COLUMNNAME_BenchmarkPrice = "BenchmarkPrice";

@XendraTrl(Identifier="83a0200f-505e-b269-1120-4c4e83f83955")
public static String es_PE_COLUMN_C_RfQLine_ID_Name="Línea SPC (RfQ)";

@XendraColumn(AD_Element_ID="aec09b62-5630-9404-c995-62b10762d39c",ColumnName="C_RfQLine_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="83a0200f-505e-b269-1120-4c4e83f83955",
Synchronized="2017-08-16 12:37:09.0")
/** Column name C_RfQLine_ID */
public static final String COLUMNNAME_C_RfQLine_ID = "C_RfQLine_ID";

@XendraTrl(Identifier="ad2c4e97-300d-550e-e1c4-f642dd712de4")
public static String es_PE_COLUMN_C_RfQLineQty_ID_Name="Cantidad Línea SPC (RfQ)";

@XendraColumn(AD_Element_ID="0b965a1c-169a-5f4d-8d6b-307365dac356",ColumnName="C_RfQLineQty_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ad2c4e97-300d-550e-e1c4-f642dd712de4",
Synchronized="2017-08-16 12:37:09.0")
/** Column name C_RfQLineQty_ID */
public static final String COLUMNNAME_C_RfQLineQty_ID = "C_RfQLineQty_ID";

@XendraTrl(Identifier="5999bea2-ae82-4a43-3dc2-08b88cb2b899")
public static String es_PE_COLUMN_C_RfQResponse_ID_Name="Respuesta SPC (RfQ)";

@XendraColumn(AD_Element_ID="b7d78b5a-511a-1743-401f-ca73179542cf",ColumnName="C_RfQResponse_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5999bea2-ae82-4a43-3dc2-08b88cb2b899",
Synchronized="2017-08-16 12:37:09.0")
/** Column name C_RfQResponse_ID */
public static final String COLUMNNAME_C_RfQResponse_ID = "C_RfQResponse_ID";
/** Column name C_RfQResponseLine_ID */
public static final String COLUMNNAME_C_RfQResponseLine_ID = "C_RfQResponseLine_ID";

@XendraTrl(Identifier="128794a2-905c-fe19-ef0e-11a1633352f0")
public static String es_PE_COLUMN_C_RfQResponseLineQty_ID_Name="Cantidad Línea Respuesta SPC (RfQ)";

@XendraColumn(AD_Element_ID="d78e27c0-ac1c-ea0a-9b1e-495c115dbc68",
ColumnName="C_RfQResponseLineQty_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="128794a2-905c-fe19-ef0e-11a1633352f0",Synchronized="2017-08-16 12:37:09.0")
/** Column name C_RfQResponseLineQty_ID */
public static final String COLUMNNAME_C_RfQResponseLineQty_ID = "C_RfQResponseLineQty_ID";

@XendraTrl(Identifier="faefc3d0-db41-ef46-4633-7a7d5f3eac65")
public static String es_PE_COLUMN_C_UOM_ID_Name="UM";

@XendraColumn(AD_Element_ID="d0345019-4fcc-44c8-4fd1-e38e3b4adeed",ColumnName="C_UOM_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="faefc3d0-db41-ef46-4633-7a7d5f3eac65",
Synchronized="2017-08-16 12:37:09.0")
/** Column name C_UOM_ID */
public static final String COLUMNNAME_C_UOM_ID = "C_UOM_ID";

@XendraTrl(Identifier="8d55424d-2f4a-06f9-f211-2aa2956c39ec")
public static String es_PE_COLUMN_DateWorkStart_Name="Inicia el Trabajo";

@XendraColumn(AD_Element_ID="eacd3b09-4768-e18d-b651-2ec68cc53f56",ColumnName="DateWorkStart",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8d55424d-2f4a-06f9-f211-2aa2956c39ec",
Synchronized="2017-08-16 12:37:09.0")
/** Column name DateWorkStart */
public static final String COLUMNNAME_DateWorkStart = "DateWorkStart";

@XendraTrl(Identifier="533e9951-ccad-0921-bf10-7b0e1ff8e1c4")
public static String es_PE_COLUMN_DeliveryDays_Name="Días de Entrega";

@XendraColumn(AD_Element_ID="be6b99df-af16-3107-0958-5fe3af220ffc",ColumnName="DeliveryDays",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="533e9951-ccad-0921-bf10-7b0e1ff8e1c4",
Synchronized="2017-08-16 12:37:09.0")
/** Column name DeliveryDays */
public static final String COLUMNNAME_DeliveryDays = "DeliveryDays";

@XendraTrl(Identifier="4ebda040-fa2a-f6bd-bf28-a108faa7120d")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4ebda040-fa2a-f6bd-bf28-a108faa7120d",
Synchronized="2017-08-16 12:37:09.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";

@XendraTrl(Identifier="ba8c3890-3fbc-cc0d-184c-0d19131c0eec")
public static String es_PE_COLUMN_Discount_Name="% Descuento";

@XendraColumn(AD_Element_ID="3d8e2bac-29ff-f758-dd80-f9b4107077e6",ColumnName="Discount",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ba8c3890-3fbc-cc0d-184c-0d19131c0eec",
Synchronized="2017-08-16 12:37:09.0")
/** Column name Discount */
public static final String COLUMNNAME_Discount = "Discount";

@XendraTrl(Identifier="1d076416-04ce-c3c9-077a-5ae2c20c576a")
public static String es_PE_COLUMN_DocumentNote_Name="Nota de Documento";

@XendraColumn(AD_Element_ID="facce503-36ce-65e5-ad96-c872503feb2e",ColumnName="DocumentNote",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1d076416-04ce-c3c9-077a-5ae2c20c576a",
Synchronized="2017-08-16 12:37:09.0")
/** Column name DocumentNote */
public static final String COLUMNNAME_DocumentNote = "DocumentNote";

@XendraTrl(Identifier="cbea0721-fbf8-e456-6ddf-74799e0a510b")
public static String es_PE_COLUMN_Help_Name="Ayuda";

@XendraColumn(AD_Element_ID="a6fda582-56f9-6bb7-8436-285ce4f8de3f",ColumnName="Help",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cbea0721-fbf8-e456-6ddf-74799e0a510b",
Synchronized="2017-08-16 12:37:09.0")
/** Column name Help */
public static final String COLUMNNAME_Help = "Help";

@XendraTrl(Identifier="9a326125-e6f5-47e6-92d8-f2aa968977f8")
public static String es_PE_COLUMN_Line_Name="No. Línea";

@XendraColumn(AD_Element_ID="986ef077-61da-f9cf-1c6d-aefe3a35113b",ColumnName="Line",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9a326125-e6f5-47e6-92d8-f2aa968977f8",
Synchronized="2017-08-16 12:37:09.0")
/** Column name Line */
public static final String COLUMNNAME_Line = "Line";

@XendraTrl(Identifier="5cacfe26-0034-0323-67e7-86e98c404a84")
public static String es_PE_COLUMN_M_AttributeSetInstance_ID_Name="Instancia del Conjunto de Atributos";

@XendraColumn(AD_Element_ID="137807f2-3c52-e193-3ceb-f10b819cf955",
ColumnName="M_AttributeSetInstance_ID",AD_Reference_ID=35,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,
IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",
IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5cacfe26-0034-0323-67e7-86e98c404a84",
Synchronized="2017-08-16 12:37:09.0")
/** Column name M_AttributeSetInstance_ID */
public static final String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";

@XendraTrl(Identifier="0e4fe44e-ccf1-aba4-95bd-7af4bc35adfa")
public static String es_PE_COLUMN_M_Product_ID_Name="Producto";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0e4fe44e-ccf1-aba4-95bd-7af4bc35adfa",
Synchronized="2017-08-16 12:37:09.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";

@XendraTrl(Identifier="44ee6170-5982-ed23-afcd-9fd78907c491")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="44ee6170-5982-ed23-afcd-9fd78907c491",
Synchronized="2017-08-16 12:37:09.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";

@XendraTrl(Identifier="7d4c04e0-efd5-c382-64b0-5546ab98c4ab")
public static String es_PE_COLUMN_Price_Name="Precio";

@XendraColumn(AD_Element_ID="aafaa7a6-6897-fb14-1b29-1dc3b61047b9",ColumnName="Price",
AD_Reference_ID=37,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7d4c04e0-efd5-c382-64b0-5546ab98c4ab",
Synchronized="2017-08-16 12:37:09.0")
/** Column name Price */
public static final String COLUMNNAME_Price = "Price";

@XendraTrl(Identifier="8af417fa-6487-71fc-0043-efa6752e81e2")
public static String es_PE_COLUMN_ProductValue_Name="Sólo Valor de Producto";

@XendraColumn(AD_Element_ID="3c72be08-8fa7-5282-1e16-ddcbc46035d8",ColumnName="ProductValue",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8af417fa-6487-71fc-0043-efa6752e81e2",
Synchronized="2017-08-16 12:37:09.0")
/** Column name ProductValue */
public static final String COLUMNNAME_ProductValue = "ProductValue";

@XendraTrl(Identifier="ccce5272-9559-4c3f-f789-50881d02cee5")
public static String es_PE_COLUMN_Qty_Name="Cantidad";

@XendraColumn(AD_Element_ID="c9d74a25-87c5-9592-5660-4f397607dad3",ColumnName="Qty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ccce5272-9559-4c3f-f789-50881d02cee5",
Synchronized="2017-08-16 12:37:09.0")
/** Column name Qty */
public static final String COLUMNNAME_Qty = "Qty";

@XendraTrl(Identifier="d3d6ffd7-1bf4-f281-7d9d-47682b423157")
public static String es_PE_COLUMN_SKU_Name="UM Almacenamiento";

@XendraColumn(AD_Element_ID="f473a6ed-4a3f-b6fd-5b0f-06d49c1e65e2",ColumnName="SKU",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d3d6ffd7-1bf4-f281-7d9d-47682b423157",
Synchronized="2017-08-16 12:37:09.0")
/** Column name SKU */
public static final String COLUMNNAME_SKU = "SKU";

@XendraTrl(Identifier="10b99f4d-3452-e31f-2d84-974280e81425")
public static String es_PE_COLUMN_UOMSymbol_Name="Símbolo";

@XendraColumn(AD_Element_ID="ccb82b4f-2e57-da9a-16a8-8fd48d94adf5",ColumnName="UOMSymbol",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="10b99f4d-3452-e31f-2d84-974280e81425",
Synchronized="2017-08-16 12:37:09.0")
/** Column name UOMSymbol */
public static final String COLUMNNAME_UOMSymbol = "UOMSymbol";

@XendraTrl(Identifier="21c68376-abf9-8899-426a-c48e251b3e2f")
public static String es_PE_COLUMN_UPC_Name="UPC/EAN";

@XendraColumn(AD_Element_ID="9e36272a-ec41-b187-d531-cec50070c612",ColumnName="UPC",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="21c68376-abf9-8899-426a-c48e251b3e2f",
Synchronized="2017-08-16 12:37:09.0")
/** Column name UPC */
public static final String COLUMNNAME_UPC = "UPC";
	@XendraView(Identifier="e8b859dc-62f1-04ea-b795-4e1a45769ae1",
Synchronized="2013-07-09 19:02:34.0",
Name="c_rfqresponseline_v",
Owner="xendra",
Extension="")
	public static final String Identifier = "e8b859dc-62f1-04ea-b795-4e1a45769ae1";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-07-09 19:02:34.0");
	sb.appendln("@Identifier=e8b859dc-62f1-04ea-b795-4e1a45769ae1");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT rrl.c_rfqresponse_id, rrl.c_rfqresponseline_id, rrl.c_rfqline_id, rq.c_rfqresponselineqty_id, rq.c_rfqlineqty_id, rrl.ad_client_id, rrl.ad_org_id, rrl.isactive, rrl.created, rrl.createdby, rrl.updated, rrl.updatedby, 'en_US'::character varying AS ad_language, rl.line, rl.m_product_id, rl.m_attributesetinstance_id, COALESCE(((p.name)::text || (productattribute(rl.m_attributesetinstance_id))::text), (rl.description)::text) AS name, CASE WHEN (p.name IS NOT NULL) THEN rl.description ELSE NULL::character varying END AS description, p.documentnote, p.upc, p.sku, p.value AS productvalue, rl.help, rl.dateworkstart, rl.deliverydays, q.c_uom_id, uom.uomsymbol, q.benchmarkprice, q.qty, rq.price, rq.discount FROM (((((c_rfqresponselineqty rq JOIN c_rfqlineqty q ON ((rq.c_rfqlineqty_id = q.c_rfqlineqty_id))) JOIN c_uom uom ON ((q.c_uom_id = uom.c_uom_id))) JOIN c_rfqresponseline rrl ON ((rq.c_rfqresponseline_id = rrl.c_rfqresponseline_id))) JOIN c_rfqline rl ON ((rrl.c_rfqline_id = rl.c_rfqline_id))) LEFT JOIN m_product p ON ((rl.m_product_id = p.m_product_id))) WHERE ((((rq.isactive = 'Y'::bpchar) AND (q.isactive = 'Y'::bpchar)) AND (rrl.isactive = 'Y'::bpchar)) AND (rl.isactive = 'Y'::bpchar));");
	return sb.toString();
}
}
