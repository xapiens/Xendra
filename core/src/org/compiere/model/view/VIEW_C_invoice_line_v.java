package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_C_invoice_line_v 
{
 
@XendraTable(Name="C_Invoice_Line_v",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Invoice Print View",Help="",
TableName="C_Invoice_Line_v",AccessLevel="3",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=0,LoadSeq=0,
IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=true,IsChangeLog=false,IsView=true,
PO_Window_ID="",ID="org.xendra.commercial",Identifier="ed6666de-2859-5555-bfa5-1418be41c537",
Synchronized="2020-03-03 21:37:05.0")
/** TableName=C_Invoice_Line_v */
public static final String Table_Name="C_Invoice_Line_v";

@XendraTrl(Identifier="1bfb7ff1-942a-5515-dd72-ab0cd388a97f")
public static String es_PE_COLUMN_AD_Language_Name="Lenguaje";

@XendraColumn(AD_Element_ID="d542d9da-4627-0da8-89af-5797f22de434",ColumnName="AD_Language",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=5,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1bfb7ff1-942a-5515-dd72-ab0cd388a97f",
Synchronized="2020-03-03 21:37:04.0")
/** Column name AD_Language */
public static final String COLUMNNAME_AD_Language = "AD_Language";

@XendraTrl(Identifier="e39fb729-d7ed-54d4-328d-0ac8d53d1209")
public static String es_PE_COLUMN_C_Activity_ID_Name="Tipo de Gasto";

@XendraColumn(AD_Element_ID="bfeadbb3-d866-26e3-8eee-3e2fdf0ff753",ColumnName="C_Activity_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e39fb729-d7ed-54d4-328d-0ac8d53d1209",
Synchronized="2020-03-03 21:37:04.0")
/** Column name C_Activity_ID */
public static final String COLUMNNAME_C_Activity_ID = "C_Activity_ID";

@XendraTrl(Identifier="400e4f81-99a1-1267-7fd8-20e65b80c82e")
public static String es_PE_COLUMN_C_Campaign_ID_Name="Campaña";

@XendraColumn(AD_Element_ID="6cf08e31-d355-ee38-9c0b-bee20b3ea5b6",ColumnName="C_Campaign_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="400e4f81-99a1-1267-7fd8-20e65b80c82e",
Synchronized="2020-03-03 21:37:04.0")
/** Column name C_Campaign_ID */
public static final String COLUMNNAME_C_Campaign_ID = "C_Campaign_ID";

@XendraTrl(Identifier="28955752-89b2-fb99-6080-d6a026bd0d2c")
public static String es_PE_COLUMN_C_Invoice_ID_Name="Factura";

@XendraColumn(AD_Element_ID="e526ea57-1bdf-9871-fd57-0df3c1f9dd42",ColumnName="C_Invoice_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="28955752-89b2-fb99-6080-d6a026bd0d2c",
Synchronized="2020-03-03 21:37:04.0")
/** Column name C_Invoice_ID */
public static final String COLUMNNAME_C_Invoice_ID = "C_Invoice_ID";
/** Column name C_InvoiceLine_ID */
public static final String COLUMNNAME_C_InvoiceLine_ID = "C_InvoiceLine_ID";

@XendraTrl(Identifier="566e59fe-b945-5739-9a12-75bc4a9874a5")
public static String es_PE_COLUMN_C_Project_ID_Name="Proyecto";

@XendraColumn(AD_Element_ID="16ff5dcc-9178-73dd-e618-e88bd79d573b",ColumnName="C_Project_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="566e59fe-b945-5739-9a12-75bc4a9874a5",
Synchronized="2020-03-03 21:37:04.0")
/** Column name C_Project_ID */
public static final String COLUMNNAME_C_Project_ID = "C_Project_ID";

@XendraTrl(Identifier="ef69dabb-78ad-7f3f-887c-7be98d82d755")
public static String es_PE_COLUMN_C_ProjectPhase_ID_Name="Fase del Proyecto";

@XendraColumn(AD_Element_ID="ba6e5aab-8337-208a-03da-5712e50d4da9",ColumnName="C_ProjectPhase_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ef69dabb-78ad-7f3f-887c-7be98d82d755",
Synchronized="2020-03-03 21:37:04.0")
/** Column name C_ProjectPhase_ID */
public static final String COLUMNNAME_C_ProjectPhase_ID = "C_ProjectPhase_ID";

@XendraTrl(Identifier="4087840a-83ca-54b3-2b3b-e7b7f7584f7c")
public static String es_PE_COLUMN_C_ProjectTask_ID_Name="Tarea del Proyecto";

@XendraColumn(AD_Element_ID="1b2d7a20-215c-4f56-6077-83adcead0920",ColumnName="C_ProjectTask_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4087840a-83ca-54b3-2b3b-e7b7f7584f7c",
Synchronized="2020-03-03 21:37:04.0")
/** Column name C_ProjectTask_ID */
public static final String COLUMNNAME_C_ProjectTask_ID = "C_ProjectTask_ID";

@XendraTrl(Identifier="25b9dba1-9c39-1ef5-24f0-b37c948d70b7")
public static String es_PE_COLUMN_C_Tax_ID_Name="Impuesto";

@XendraColumn(AD_Element_ID="38ff24fc-b68c-51a9-60f8-ef2a1f060de2",ColumnName="C_Tax_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="25b9dba1-9c39-1ef5-24f0-b37c948d70b7",
Synchronized="2020-03-03 21:37:04.0")
/** Column name C_Tax_ID */
public static final String COLUMNNAME_C_Tax_ID = "C_Tax_ID";

@XendraTrl(Identifier="d213c18e-6d43-c671-d0f8-4aa3d9e410c5")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d213c18e-6d43-c671-d0f8-4aa3d9e410c5",
Synchronized="2020-03-03 21:37:04.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";

@XendraTrl(Identifier="e03affa1-7604-e6ed-041a-7c22fa9f17f2")
public static String es_PE_COLUMN_Discount_Name="% Descuento";

@XendraColumn(AD_Element_ID="3d8e2bac-29ff-f758-dd80-f9b4107077e6",ColumnName="Discount",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e03affa1-7604-e6ed-041a-7c22fa9f17f2",
Synchronized="2020-03-03 21:37:04.0")
/** Column name Discount */
public static final String COLUMNNAME_Discount = "Discount";

@XendraTrl(Identifier="1ab7fb98-03f1-da51-aa32-50160146b696")
public static String es_PE_COLUMN_DocumentNote_Name="Nota de Documento";

@XendraColumn(AD_Element_ID="facce503-36ce-65e5-ad96-c872503feb2e",ColumnName="DocumentNote",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1ab7fb98-03f1-da51-aa32-50160146b696",
Synchronized="2020-03-03 21:37:04.0")
/** Column name DocumentNote */
public static final String COLUMNNAME_DocumentNote = "DocumentNote";

@XendraTrl(Identifier="576d831a-b91f-294e-fb81-53c914f2548c")
public static String es_PE_COLUMN_GuaranteeDate_Name="Fecha de Garantía";

@XendraColumn(AD_Element_ID="2956aa9d-0dfd-6e86-af9b-584f4c7eca21",ColumnName="GuaranteeDate",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="576d831a-b91f-294e-fb81-53c914f2548c",
Synchronized="2020-03-03 21:37:04.0")
/** Column name GuaranteeDate */
public static final String COLUMNNAME_GuaranteeDate = "GuaranteeDate";

@XendraTrl(Identifier="5eba0f50-6f95-c4f9-5f77-116539e6cf50")
public static String es_PE_COLUMN_ImageURL_Name="URL de la Imagen";

@XendraColumn(AD_Element_ID="fe037607-f5d9-d969-d6e5-eb1f94c10e5e",ColumnName="ImageURL",
AD_Reference_ID=40,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=120,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5eba0f50-6f95-c4f9-5f77-116539e6cf50",
Synchronized="2020-03-03 21:37:04.0")
/** Column name ImageURL */
public static final String COLUMNNAME_ImageURL = "ImageURL";

@XendraTrl(Identifier="4fea0bd3-78fa-741a-84c0-b637d5b495ad")
public static String es_PE_COLUMN_Line_Name="No. Línea";

@XendraColumn(AD_Element_ID="986ef077-61da-f9cf-1c6d-aefe3a35113b",ColumnName="Line",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4fea0bd3-78fa-741a-84c0-b637d5b495ad",
Synchronized="2020-03-03 21:37:04.0")
/** Column name Line */
public static final String COLUMNNAME_Line = "Line";

@XendraTrl(Identifier="887a7ef6-f1b7-504b-e615-cb61c2040089")
public static String es_PE_COLUMN_LineNetAmt_Name="Neto de Línea";

@XendraColumn(AD_Element_ID="ba57a535-4ae3-c6eb-74ec-3dcb0973d6f6",ColumnName="LineNetAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="887a7ef6-f1b7-504b-e615-cb61c2040089",
Synchronized="2020-03-03 21:37:04.0")
/** Column name LineNetAmt */
public static final String COLUMNNAME_LineNetAmt = "LineNetAmt";

@XendraTrl(Identifier="5b02ea72-14ef-e9cb-7e3d-9d19a3070cfc")
public static String es_PE_COLUMN_LineTotalAmt_Name="Total de la Línea";

@XendraColumn(AD_Element_ID="582be6fc-dd62-5c60-3398-a0f8435f0670",ColumnName="LineTotalAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5b02ea72-14ef-e9cb-7e3d-9d19a3070cfc",
Synchronized="2020-03-03 21:37:04.0")
/** Column name LineTotalAmt */
public static final String COLUMNNAME_LineTotalAmt = "LineTotalAmt";

@XendraTrl(Identifier="772240f8-edd4-af7d-17fe-efe12dd9999c")
public static String es_PE_COLUMN_Lot_Name="No. Lote";

@XendraColumn(AD_Element_ID="e8a3022e-4a91-6f2a-e27c-3739825075c7",ColumnName="Lot",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="772240f8-edd4-af7d-17fe-efe12dd9999c",
Synchronized="2020-03-03 21:37:04.0")
/** Column name Lot */
public static final String COLUMNNAME_Lot = "Lot";

@XendraTrl(Identifier="4dfbf9e9-27e5-6f4b-e43c-9d986dc5a4cd")
public static String es_PE_COLUMN_M_AttributeSet_ID_Name="Conjunto de Atributos";

@XendraColumn(AD_Element_ID="8debe7a4-548a-6126-d8aa-196f184678c2",ColumnName="M_AttributeSet_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4dfbf9e9-27e5-6f4b-e43c-9d986dc5a4cd",
Synchronized="2020-03-03 21:37:04.0")
/** Column name M_AttributeSet_ID */
public static final String COLUMNNAME_M_AttributeSet_ID = "M_AttributeSet_ID";

@XendraTrl(Identifier="859ea7fb-f07f-9cf3-1c51-a321bd90ef9c")
public static String es_PE_COLUMN_M_AttributeSetInstance_ID_Name="Instancia del Conjunto de Atributos";

@XendraColumn(AD_Element_ID="137807f2-3c52-e193-3ceb-f10b819cf955",
ColumnName="M_AttributeSetInstance_ID",AD_Reference_ID=35,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,
IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",
IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="859ea7fb-f07f-9cf3-1c51-a321bd90ef9c",
Synchronized="2020-03-03 21:37:04.0")
/** Column name M_AttributeSetInstance_ID */
public static final String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";

@XendraTrl(Identifier="8a90ba6a-553c-8ed0-01fe-3f8b17826043")
public static String es_PE_COLUMN_M_Lot_ID_Name="Lote";

@XendraColumn(AD_Element_ID="e1d8c1a9-7ee8-36d2-d9da-fcf63a007dbb",ColumnName="M_Lot_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8a90ba6a-553c-8ed0-01fe-3f8b17826043",
Synchronized="2020-03-03 21:37:04.0")
/** Column name M_Lot_ID */
public static final String COLUMNNAME_M_Lot_ID = "M_Lot_ID";

@XendraTrl(Identifier="e970032e-8d48-fa7d-d96b-ca8b50f5aad6")
public static String es_PE_COLUMN_M_Product_ID_Name="Product";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e970032e-8d48-fa7d-d96b-ca8b50f5aad6",
Synchronized="2020-03-03 21:37:04.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";

@XendraTrl(Identifier="9e956ba5-2381-45bb-7ef1-51173afaedda")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9e956ba5-2381-45bb-7ef1-51173afaedda",
Synchronized="2020-03-03 21:37:04.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";

@XendraTrl(Identifier="94ac4c50-4143-e8a0-40a7-95fcaf5f4394")
public static String es_PE_COLUMN_PriceActual_Name="Precio Actual";

@XendraColumn(AD_Element_ID="8ee15d33-8f4b-598f-dc4c-9d67f968a13c",ColumnName="PriceActual",
AD_Reference_ID=37,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="94ac4c50-4143-e8a0-40a7-95fcaf5f4394",
Synchronized="2020-03-03 21:37:04.0")
/** Column name PriceActual */
public static final String COLUMNNAME_PriceActual = "PriceActual";

@XendraTrl(Identifier="57b896a0-858c-d782-7647-ff04bc98f459")
public static String es_PE_COLUMN_PriceEntered_Name="Precio";

@XendraColumn(AD_Element_ID="c0a272c7-da17-7089-b9a4-6aeab9e222ef",ColumnName="PriceEntered",
AD_Reference_ID=37,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="57b896a0-858c-d782-7647-ff04bc98f459",
Synchronized="2020-03-03 21:37:04.0")
/** Column name PriceEntered */
public static final String COLUMNNAME_PriceEntered = "PriceEntered";

@XendraTrl(Identifier="2efed49b-7c6f-bd1a-ef1b-939a925c8694")
public static String es_PE_COLUMN_PriceEnteredList_Name="Lista de Precios";

@XendraColumn(AD_Element_ID="ea5ee89b-10bd-f8e6-5861-d5551054efc3",ColumnName="PriceEnteredList",
AD_Reference_ID=37,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2efed49b-7c6f-bd1a-ef1b-939a925c8694",
Synchronized="2020-03-03 21:37:04.0")
/** Column name PriceEnteredList */
public static final String COLUMNNAME_PriceEnteredList = "PriceEnteredList";

@XendraTrl(Identifier="b9d3b984-79b2-ccca-3725-21ea126b9c63")
public static String es_PE_COLUMN_PriceList_Name="Precio de Lista";

@XendraColumn(AD_Element_ID="0f6529f2-0ceb-0583-6c50-c04e6542c99b",ColumnName="PriceList",
AD_Reference_ID=37,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b9d3b984-79b2-ccca-3725-21ea126b9c63",
Synchronized="2020-03-03 21:37:04.0")
/** Column name PriceList */
public static final String COLUMNNAME_PriceList = "PriceList";

@XendraTrl(Identifier="03988319-64a2-90b3-3170-d6389a6e76f8")
public static String es_PE_COLUMN_ProductDescription_Name="Descripción de Producto";

@XendraColumn(AD_Element_ID="4ad0f18d-ece5-98e0-8e0b-f239dcf795af",ColumnName="ProductDescription",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="03988319-64a2-90b3-3170-d6389a6e76f8",
Synchronized="2020-03-03 21:37:04.0")
/** Column name ProductDescription */
public static final String COLUMNNAME_ProductDescription = "ProductDescription";

@XendraTrl(Identifier="f9fe6cf9-7eef-13f4-e5cd-08f7f7989b83")
public static String es_PE_COLUMN_ProductValue_Name="Sólo Valor de Producto";

@XendraColumn(AD_Element_ID="3c72be08-8fa7-5282-1e16-ddcbc46035d8",ColumnName="ProductValue",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f9fe6cf9-7eef-13f4-e5cd-08f7f7989b83",
Synchronized="2020-03-03 21:37:04.0")
/** Column name ProductValue */
public static final String COLUMNNAME_ProductValue = "ProductValue";

@XendraTrl(Identifier="b458a810-afe7-8422-df44-6e441d845a17")
public static String es_PE_COLUMN_QtyEntered_Name="Cantidad";

@XendraColumn(AD_Element_ID="70a37b06-986d-bf01-1ef9-23e214211841",ColumnName="QtyEntered",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b458a810-afe7-8422-df44-6e441d845a17",
Synchronized="2020-03-03 21:37:04.0")
/** Column name QtyEntered */
public static final String COLUMNNAME_QtyEntered = "QtyEntered";

@XendraTrl(Identifier="83ddca5d-20e6-d88b-c8fa-0173e2121973")
public static String es_PE_COLUMN_QtyInvoiced_Name="Cantidad Facturada";

@XendraColumn(AD_Element_ID="406c1301-33f0-3d6a-3fbc-b0cf44ccc5b3",ColumnName="QtyInvoiced",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="83ddca5d-20e6-d88b-c8fa-0173e2121973",
Synchronized="2020-03-03 21:37:04.0")
/** Column name QtyInvoiced */
public static final String COLUMNNAME_QtyInvoiced = "QtyInvoiced";

@XendraTrl(Identifier="7ffb1df5-02a7-25d0-cacd-8610465294e8")
public static String es_PE_COLUMN_ResourceDescription_Name="Descripción de Recursos";

@XendraColumn(AD_Element_ID="52f87021-2c77-d142-5725-43c886429dde",
ColumnName="ResourceDescription",AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=255,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="7ffb1df5-02a7-25d0-cacd-8610465294e8",Synchronized="2020-03-03 21:37:04.0")
/** Column name ResourceDescription */
public static final String COLUMNNAME_ResourceDescription = "ResourceDescription";

@XendraTrl(Identifier="e42ebca4-1749-3c9c-0b93-8bafcd511ae0")
public static String es_PE_COLUMN_SerNo_Name="No. de Serie";

@XendraColumn(AD_Element_ID="9aac6ac8-a553-7ad4-9bc7-40f85e011f4b",ColumnName="SerNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e42ebca4-1749-3c9c-0b93-8bafcd511ae0",
Synchronized="2020-03-03 21:37:05.0")
/** Column name SerNo */
public static final String COLUMNNAME_SerNo = "SerNo";

@XendraTrl(Identifier="097d32a3-855c-de89-69d1-d235b3df837e")
public static String es_PE_COLUMN_SKU_Name="UM Almacenamiento";

@XendraColumn(AD_Element_ID="f473a6ed-4a3f-b6fd-5b0f-06d49c1e65e2",ColumnName="SKU",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="097d32a3-855c-de89-69d1-d235b3df837e",
Synchronized="2020-03-03 21:37:05.0")
/** Column name SKU */
public static final String COLUMNNAME_SKU = "SKU";

@XendraTrl(Identifier="c5d4e011-03de-3ccd-d26c-1d0360856f3b")
public static String es_PE_COLUMN_TaxAmt_Name="Total del Impuesto";

@XendraColumn(AD_Element_ID="462941e1-a196-170f-fd16-84da06ba50ea",ColumnName="TaxAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c5d4e011-03de-3ccd-d26c-1d0360856f3b",
Synchronized="2020-03-03 21:37:05.0")
/** Column name TaxAmt */
public static final String COLUMNNAME_TaxAmt = "TaxAmt";

@XendraTrl(Identifier="719edbac-0c3c-8c2d-852e-951c20f7409e")
public static String es_PE_COLUMN_TaxIndicator_Name="Identificador de Impuesto";

@XendraColumn(AD_Element_ID="099119b1-a377-e966-4537-2f056d06fb9d",ColumnName="TaxIndicator",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="719edbac-0c3c-8c2d-852e-951c20f7409e",
Synchronized="2020-03-03 21:37:05.0")
/** Column name TaxIndicator */
public static final String COLUMNNAME_TaxIndicator = "TaxIndicator";

@XendraTrl(Identifier="1a3e7e6f-9a06-1068-d79e-f24565811c94")
public static String es_PE_COLUMN_UOMSymbol_Name="Símbolo";

@XendraColumn(AD_Element_ID="ccb82b4f-2e57-da9a-16a8-8fd48d94adf5",ColumnName="UOMSymbol",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1a3e7e6f-9a06-1068-d79e-f24565811c94",
Synchronized="2020-03-03 21:37:05.0")
/** Column name UOMSymbol */
public static final String COLUMNNAME_UOMSymbol = "UOMSymbol";

@XendraTrl(Identifier="c7cbc93e-4338-60a5-b995-6407b3c9377e")
public static String es_PE_COLUMN_UPC_Name="UPC/EAN";

@XendraColumn(AD_Element_ID="9e36272a-ec41-b187-d531-cec50070c612",ColumnName="UPC",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c7cbc93e-4338-60a5-b995-6407b3c9377e",
Synchronized="2020-03-03 21:37:05.0")
/** Column name UPC */
public static final String COLUMNNAME_UPC = "UPC";
	@XendraView(Identifier="ed6666de-2859-5555-bfa5-1418be41c537",
Synchronized="2013-07-09 19:02:34.0",
Name="c_invoice_line_v",
Owner="xendra",
Extension="")
	public static final String Identifier = "ed6666de-2859-5555-bfa5-1418be41c537";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-07-09 19:02:34.0");
	sb.appendln("@Identifier=ed6666de-2859-5555-bfa5-1418be41c537");
	sb.appendln("@comment=Invoice Print View");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("(SELECT il.ad_client_id, il.ad_org_id, il.isactive, il.created, il.createdby, il.updated, il.updatedby, 'en_US'::text AS ad_language, il.c_invoice_id, il.c_invoiceline_id, il.c_tax_id, il.taxamt, il.linetotalamt, t.taxindicator, il.line, p.m_product_id, CASE WHEN ((il.qtyinvoiced <> (0)::numeric) OR (il.m_product_id IS NOT NULL)) THEN il.qtyinvoiced ELSE NULL::numeric END AS qtyinvoiced, CASE WHEN ((il.qtyentered <> (0)::numeric) OR (il.m_product_id IS NOT NULL)) THEN il.qtyentered ELSE NULL::numeric END AS qtyentered, CASE WHEN ((il.qtyentered <> (0)::numeric) OR (il.m_product_id IS NOT NULL)) THEN uom.uomsymbol ELSE NULL::character varying END AS uomsymbol, COALESCE(c.name, (((p.name)::text || (productattribute(il.m_attributesetinstance_id))::text))::character varying, il.description) AS name, CASE WHEN (COALESCE(c.name, p.name) IS NOT NULL) THEN il.description ELSE NULL::character varying END AS description, p.documentnote, p.upc, p.sku, COALESCE(pp.vendorproductno, p.value) AS productvalue, ra.description AS resourcedescription, CASE WHEN ((i.isdiscountprinted = 'Y'::bpchar) AND (il.pricelist <> (0)::numeric)) THEN il.pricelist ELSE NULL::numeric END AS pricelist, CASE WHEN (((i.isdiscountprinted = 'Y'::bpchar) AND (il.pricelist <> (0)::numeric)) AND (il.qtyentered <> (0)::numeric)) THEN ((il.pricelist * il.qtyinvoiced) / il.qtyentered) ELSE NULL::numeric END AS priceenteredlist, CASE WHEN (((i.isdiscountprinted = 'Y'::bpchar) AND (il.pricelist > il.priceactual)) AND (il.pricelist <> (0)::numeric)) THEN (((il.pricelist - il.priceactual) / il.pricelist) * (100)::numeric) ELSE NULL::numeric END AS discount, CASE WHEN ((il.priceactual <> (0)::numeric) OR (il.m_product_id IS NOT NULL)) THEN il.priceactual ELSE NULL::numeric END AS priceactual, CASE WHEN ((il.priceentered <> (0)::numeric) OR (il.m_product_id IS NOT NULL)) THEN il.priceentered ELSE NULL::numeric END AS priceentered, CASE WHEN ((il.linenetamt <> (0)::numeric) OR (il.m_product_id IS NOT NULL)) THEN il.linenetamt ELSE NULL::numeric END AS linenetamt, il.m_attributesetinstance_id, asi.m_attributeset_id, asi.serno, asi.lot, asi.m_lot_id, asi.guaranteedate, p.description AS productdescription, p.imageurl, il.c_campaign_id, il.c_project_id, il.c_activity_id, il.c_projectphase_id, il.c_projecttask_id FROM ((((((((c_invoiceline il JOIN c_uom uom ON ((il.c_uom_id = uom.c_uom_id))) JOIN c_invoice i ON ((il.c_invoice_id = i.c_invoice_id))) LEFT JOIN c_tax t ON ((il.c_tax_id = t.c_tax_id))) LEFT JOIN m_product p ON ((il.m_product_id = p.m_product_id))) LEFT JOIN c_charge c ON ((il.c_charge_id = c.c_charge_id))) LEFT JOIN c_bpartner_product pp ON (((il.m_product_id = pp.m_product_id) AND (i.c_bpartner_id = pp.c_bpartner_id)))) LEFT JOIN s_resourceassignment ra ON ((il.s_resourceassignment_id = ra.s_resourceassignment_id))) LEFT JOIN m_attributesetinstance asi ON ((il.m_attributesetinstance_id = asi.m_attributesetinstance_id))) UNION SELECT il.ad_client_id, il.ad_org_id, il.isactive, il.created, il.createdby, il.updated, il.updatedby, 'en_US'::text AS ad_language, il.c_invoice_id, il.c_invoiceline_id, il.c_tax_id, il.taxamt, il.linetotalamt, t.taxindicator, (il.line + (b.line / (100)::numeric)) AS line, p.m_product_id, (il.qtyinvoiced * b.bomqty) AS qtyinvoiced, (il.qtyentered * b.bomqty) AS qtyentered, uom.uomsymbol, p.name, b.description, p.documentnote, p.upc, p.sku, p.value AS productvalue, NULL::character varying AS resourcedescription, NULL::numeric AS pricelist, NULL::numeric AS priceenteredlist, NULL::numeric AS discount, NULL::numeric AS priceactual, NULL::numeric AS priceentered, NULL::numeric AS linenetamt, il.m_attributesetinstance_id, asi.m_attributeset_id, asi.serno, asi.lot, asi.m_lot_id, asi.guaranteedate, p.description AS productdescription, p.imageurl, il.c_campaign_id, il.c_project_id, il.c_activity_id, il.c_projectphase_id, il.c_projecttask_id FROM ((((((m_product_bom b JOIN c_invoiceline il ON ((b.m_product_id = il.m_product_id))) JOIN m_product bp ON (((((bp.m_product_id = il.m_product_id) AND (bp.isbom = 'Y'::bpchar)) AND (bp.isverified = 'Y'::bpchar)) AND (bp.isinvoiceprintdetails = 'Y'::bpchar)))) JOIN m_product p ON ((b.m_productbom_id = p.m_product_id))) JOIN c_uom uom ON ((p.c_uom_id = uom.c_uom_id))) LEFT JOIN c_tax t ON ((il.c_tax_id = t.c_tax_id))) LEFT JOIN m_attributesetinstance asi ON ((il.m_attributesetinstance_id = asi.m_attributesetinstance_id)))) UNION SELECT il.ad_client_id, il.ad_org_id, il.isactive, il.created, il.createdby, il.updated, il.updatedby, 'en_US'::text AS ad_language, il.c_invoice_id, il.c_invoiceline_id, NULL::numeric AS c_tax_id, NULL::numeric AS taxamt, NULL::numeric AS linetotalamt, NULL::character varying AS taxindicator, il.line, NULL::numeric AS m_product_id, NULL::numeric AS qtyinvoiced, NULL::numeric AS qtyentered, NULL::character varying AS uomsymbol, il.description AS name, NULL::character varying AS description, NULL::character varying AS documentnote, NULL::character varying AS upc, NULL::character varying AS sku, NULL::character varying AS productvalue, NULL::character varying AS resourcedescription, NULL::numeric AS pricelist, NULL::numeric AS priceenteredlist, NULL::numeric AS discount, NULL::numeric AS priceactual, NULL::numeric AS priceentered, NULL::numeric AS linenetamt, NULL::numeric AS m_attributesetinstance_id, NULL::numeric AS m_attributeset_id, NULL::character varying AS serno, NULL::character varying AS lot, NULL::numeric AS m_lot_id, NULL::timestamp without time zone AS guaranteedate, NULL::character varying AS productdescription, NULL::character varying AS imageurl, NULL::numeric AS c_campaign_id, NULL::numeric AS c_project_id, NULL::numeric AS c_activity_id, NULL::numeric AS c_projectphase_id, NULL::numeric AS c_projecttask_id FROM c_invoiceline il WHERE (il.c_uom_id IS NULL);");
	return sb.toString();
}
}
