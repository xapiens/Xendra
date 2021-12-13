package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_C_invoice_subtotal_v 
{
 
@XendraTable(Name="C_Invoice_Subtotal_v",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Invoice Print View",Help="",
TableName="C_Invoice_Subtotal_v",AccessLevel="3",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=0,
LoadSeq=0,IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=true,IsChangeLog=false,
IsView=true,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="dad899f5-e075-2f11-ec59-c885c66b2f03",Synchronized="2020-03-03 21:37:06.0")
/** TableName=C_Invoice_Subtotal_v */
public static final String Table_Name="C_Invoice_Subtotal_v";

@XendraTrl(Identifier="fb72fabf-0590-4a58-b625-7255ba9f5a54")
public static String es_PE_COLUMN_AD_Language_Name="Lenguaje";

@XendraColumn(AD_Element_ID="d542d9da-4627-0da8-89af-5797f22de434",ColumnName="AD_Language",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=5,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fb72fabf-0590-4a58-b625-7255ba9f5a54",
Synchronized="2020-03-03 21:37:06.0")
/** Column name AD_Language */
public static final String COLUMNNAME_AD_Language = "AD_Language";

@XendraTrl(Identifier="cc7e4ec6-80b0-fc40-61d0-a2ed10bce8fe")
public static String es_PE_COLUMN_C_Activity_ID_Name="Tipo de Gasto";

@XendraColumn(AD_Element_ID="bfeadbb3-d866-26e3-8eee-3e2fdf0ff753",ColumnName="C_Activity_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cc7e4ec6-80b0-fc40-61d0-a2ed10bce8fe",
Synchronized="2020-03-03 21:37:06.0")
/** Column name C_Activity_ID */
public static final String COLUMNNAME_C_Activity_ID = "C_Activity_ID";

@XendraTrl(Identifier="57608cf5-3955-f76d-49ba-c16e121595d8")
public static String es_PE_COLUMN_C_Campaign_ID_Name="Campaña";

@XendraColumn(AD_Element_ID="6cf08e31-d355-ee38-9c0b-bee20b3ea5b6",ColumnName="C_Campaign_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="57608cf5-3955-f76d-49ba-c16e121595d8",
Synchronized="2020-03-03 21:37:06.0")
/** Column name C_Campaign_ID */
public static final String COLUMNNAME_C_Campaign_ID = "C_Campaign_ID";

@XendraTrl(Identifier="b16c412a-e9e2-df64-636b-0dd29f7306ce")
public static String es_PE_COLUMN_C_Invoice_ID_Name="Factura";

@XendraColumn(AD_Element_ID="e526ea57-1bdf-9871-fd57-0df3c1f9dd42",ColumnName="C_Invoice_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b16c412a-e9e2-df64-636b-0dd29f7306ce",
Synchronized="2020-03-03 21:37:06.0")
/** Column name C_Invoice_ID */
public static final String COLUMNNAME_C_Invoice_ID = "C_Invoice_ID";
/** Column name C_InvoiceLine_ID */
public static final String COLUMNNAME_C_InvoiceLine_ID = "C_InvoiceLine_ID";

@XendraTrl(Identifier="3a40e6f1-85e0-6b9a-e7fb-e1efed98a61f")
public static String es_PE_COLUMN_C_Project_ID_Name="Proyecto";

@XendraColumn(AD_Element_ID="16ff5dcc-9178-73dd-e618-e88bd79d573b",ColumnName="C_Project_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3a40e6f1-85e0-6b9a-e7fb-e1efed98a61f",
Synchronized="2020-03-03 21:37:06.0")
/** Column name C_Project_ID */
public static final String COLUMNNAME_C_Project_ID = "C_Project_ID";

@XendraTrl(Identifier="62737336-d03c-7eb6-a12d-30be875f92c8")
public static String es_PE_COLUMN_C_ProjectPhase_ID_Name="Fase del Proyecto";

@XendraColumn(AD_Element_ID="ba6e5aab-8337-208a-03da-5712e50d4da9",ColumnName="C_ProjectPhase_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="62737336-d03c-7eb6-a12d-30be875f92c8",
Synchronized="2020-03-03 21:37:06.0")
/** Column name C_ProjectPhase_ID */
public static final String COLUMNNAME_C_ProjectPhase_ID = "C_ProjectPhase_ID";

@XendraTrl(Identifier="773db4f4-5220-102e-ff91-5be1ef8c3d42")
public static String es_PE_COLUMN_C_ProjectTask_ID_Name="Tarea del Proyecto";

@XendraColumn(AD_Element_ID="1b2d7a20-215c-4f56-6077-83adcead0920",ColumnName="C_ProjectTask_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="773db4f4-5220-102e-ff91-5be1ef8c3d42",
Synchronized="2020-03-03 21:37:06.0")
/** Column name C_ProjectTask_ID */
public static final String COLUMNNAME_C_ProjectTask_ID = "C_ProjectTask_ID";

@XendraTrl(Identifier="6cf6bf31-28d9-a5ad-003c-c5943598005f")
public static String es_PE_COLUMN_C_Tax_ID_Name="Impuesto";

@XendraColumn(AD_Element_ID="38ff24fc-b68c-51a9-60f8-ef2a1f060de2",ColumnName="C_Tax_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6cf6bf31-28d9-a5ad-003c-c5943598005f",
Synchronized="2020-03-03 21:37:06.0")
/** Column name C_Tax_ID */
public static final String COLUMNNAME_C_Tax_ID = "C_Tax_ID";

@XendraTrl(Identifier="ea10cd6d-3a18-ca15-b75d-3bcb74f2809e")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ea10cd6d-3a18-ca15-b75d-3bcb74f2809e",
Synchronized="2020-03-03 21:37:06.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";

@XendraTrl(Identifier="1f5c808c-cd1d-6da8-1f32-71de770ef31e")
public static String es_PE_COLUMN_Discount_Name="% Descuento";

@XendraColumn(AD_Element_ID="3d8e2bac-29ff-f758-dd80-f9b4107077e6",ColumnName="Discount",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1f5c808c-cd1d-6da8-1f32-71de770ef31e",
Synchronized="2020-03-03 21:37:06.0")
/** Column name Discount */
public static final String COLUMNNAME_Discount = "Discount";

@XendraTrl(Identifier="9eb101c3-b39c-b1fd-2f5d-f87d479e45d9")
public static String es_PE_COLUMN_DocumentNote_Name="Nota de Documento";

@XendraColumn(AD_Element_ID="facce503-36ce-65e5-ad96-c872503feb2e",ColumnName="DocumentNote",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9eb101c3-b39c-b1fd-2f5d-f87d479e45d9",
Synchronized="2020-03-03 21:37:06.0")
/** Column name DocumentNote */
public static final String COLUMNNAME_DocumentNote = "DocumentNote";

@XendraTrl(Identifier="c0f27f06-ca17-a805-24dc-d15d76d7bc6a")
public static String es_PE_COLUMN_GuaranteeDate_Name="Fecha de Garantía";

@XendraColumn(AD_Element_ID="2956aa9d-0dfd-6e86-af9b-584f4c7eca21",ColumnName="GuaranteeDate",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c0f27f06-ca17-a805-24dc-d15d76d7bc6a",
Synchronized="2020-03-03 21:37:06.0")
/** Column name GuaranteeDate */
public static final String COLUMNNAME_GuaranteeDate = "GuaranteeDate";

@XendraTrl(Identifier="c5bcb33d-e13d-53f8-9d85-307e953ad261")
public static String es_PE_COLUMN_ImageURL_Name="URL de la Imagen";

@XendraColumn(AD_Element_ID="fe037607-f5d9-d969-d6e5-eb1f94c10e5e",ColumnName="ImageURL",
AD_Reference_ID=40,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=120,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c5bcb33d-e13d-53f8-9d85-307e953ad261",
Synchronized="2020-03-03 21:37:06.0")
/** Column name ImageURL */
public static final String COLUMNNAME_ImageURL = "ImageURL";

@XendraTrl(Identifier="efa6669c-e437-f957-447b-028383317f78")
public static String es_PE_COLUMN_Line_Name="No. Línea";

@XendraColumn(AD_Element_ID="986ef077-61da-f9cf-1c6d-aefe3a35113b",ColumnName="Line",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="efa6669c-e437-f957-447b-028383317f78",
Synchronized="2020-03-03 21:37:06.0")
/** Column name Line */
public static final String COLUMNNAME_Line = "Line";

@XendraTrl(Identifier="5f507699-3719-e2d5-ea85-a5a1bff1c07e")
public static String es_PE_COLUMN_LineNetAmt_Name="Neto de Línea";

@XendraColumn(AD_Element_ID="ba57a535-4ae3-c6eb-74ec-3dcb0973d6f6",ColumnName="LineNetAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5f507699-3719-e2d5-ea85-a5a1bff1c07e",
Synchronized="2020-03-03 21:37:06.0")
/** Column name LineNetAmt */
public static final String COLUMNNAME_LineNetAmt = "LineNetAmt";

@XendraTrl(Identifier="db66de16-d66c-09af-66bd-63c4c5c8bedf")
public static String es_PE_COLUMN_LineTotalAmt_Name="Total de la Línea";

@XendraColumn(AD_Element_ID="582be6fc-dd62-5c60-3398-a0f8435f0670",ColumnName="LineTotalAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="db66de16-d66c-09af-66bd-63c4c5c8bedf",
Synchronized="2020-03-03 21:37:06.0")
/** Column name LineTotalAmt */
public static final String COLUMNNAME_LineTotalAmt = "LineTotalAmt";

@XendraTrl(Identifier="bb050bd5-7a7c-1be9-d287-156687093c8e")
public static String es_PE_COLUMN_Lot_Name="No. Lote";

@XendraColumn(AD_Element_ID="e8a3022e-4a91-6f2a-e27c-3739825075c7",ColumnName="Lot",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bb050bd5-7a7c-1be9-d287-156687093c8e",
Synchronized="2020-03-03 21:37:06.0")
/** Column name Lot */
public static final String COLUMNNAME_Lot = "Lot";

@XendraTrl(Identifier="a6209dee-adea-c916-5eb8-c058a27cd482")
public static String es_PE_COLUMN_M_AttributeSet_ID_Name="Conjunto de Atributos";

@XendraColumn(AD_Element_ID="8debe7a4-548a-6126-d8aa-196f184678c2",ColumnName="M_AttributeSet_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a6209dee-adea-c916-5eb8-c058a27cd482",
Synchronized="2020-03-03 21:37:06.0")
/** Column name M_AttributeSet_ID */
public static final String COLUMNNAME_M_AttributeSet_ID = "M_AttributeSet_ID";

@XendraTrl(Identifier="748cee6f-d04d-9050-de76-4f8cee97059f")
public static String es_PE_COLUMN_M_AttributeSetInstance_ID_Name="Instancia del Conjunto de Atributos";

@XendraColumn(AD_Element_ID="137807f2-3c52-e193-3ceb-f10b819cf955",
ColumnName="M_AttributeSetInstance_ID",AD_Reference_ID=35,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,
IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",
IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="748cee6f-d04d-9050-de76-4f8cee97059f",
Synchronized="2020-03-03 21:37:06.0")
/** Column name M_AttributeSetInstance_ID */
public static final String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";

@XendraTrl(Identifier="ac6a85a1-6c29-861e-73c5-e22f7e359861")
public static String es_PE_COLUMN_M_Lot_ID_Name="Lote";

@XendraColumn(AD_Element_ID="e1d8c1a9-7ee8-36d2-d9da-fcf63a007dbb",ColumnName="M_Lot_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ac6a85a1-6c29-861e-73c5-e22f7e359861",
Synchronized="2020-03-03 21:37:06.0")
/** Column name M_Lot_ID */
public static final String COLUMNNAME_M_Lot_ID = "M_Lot_ID";

@XendraTrl(Identifier="e81c0c68-836c-2687-f906-e89ae5c70e9f")
public static String es_PE_COLUMN_M_Product_ID_Name="Product";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2147483647,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="e81c0c68-836c-2687-f906-e89ae5c70e9f",
Synchronized="2020-03-03 21:37:06.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";

@XendraTrl(Identifier="232963bd-7aca-907b-9950-0b019c74a284")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="232963bd-7aca-907b-9950-0b019c74a284",
Synchronized="2020-03-03 21:37:06.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";

@XendraTrl(Identifier="d8149475-6774-4e75-e682-03d7fb0432dd")
public static String es_PE_COLUMN_PriceActual_Name="Precio Actual";

@XendraColumn(AD_Element_ID="8ee15d33-8f4b-598f-dc4c-9d67f968a13c",ColumnName="PriceActual",
AD_Reference_ID=37,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d8149475-6774-4e75-e682-03d7fb0432dd",
Synchronized="2020-03-03 21:37:06.0")
/** Column name PriceActual */
public static final String COLUMNNAME_PriceActual = "PriceActual";

@XendraTrl(Identifier="920402b7-73e6-1857-5ef4-a2ca08d90a65")
public static String es_PE_COLUMN_PriceEntered_Name="Precio";

@XendraColumn(AD_Element_ID="c0a272c7-da17-7089-b9a4-6aeab9e222ef",ColumnName="PriceEntered",
AD_Reference_ID=37,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="920402b7-73e6-1857-5ef4-a2ca08d90a65",
Synchronized="2020-03-03 21:37:06.0")
/** Column name PriceEntered */
public static final String COLUMNNAME_PriceEntered = "PriceEntered";

@XendraTrl(Identifier="b4c2e919-19b8-c96c-1f0f-b5509b946b05")
public static String es_PE_COLUMN_PriceEnteredList_Name="Lista de Precios";

@XendraColumn(AD_Element_ID="ea5ee89b-10bd-f8e6-5861-d5551054efc3",ColumnName="PriceEnteredList",
AD_Reference_ID=37,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b4c2e919-19b8-c96c-1f0f-b5509b946b05",
Synchronized="2020-03-03 21:37:06.0")
/** Column name PriceEnteredList */
public static final String COLUMNNAME_PriceEnteredList = "PriceEnteredList";

@XendraTrl(Identifier="617fab25-96b7-5b47-a7a8-21c1d59124f4")
public static String es_PE_COLUMN_PriceList_Name="Precio de Lista";

@XendraColumn(AD_Element_ID="0f6529f2-0ceb-0583-6c50-c04e6542c99b",ColumnName="PriceList",
AD_Reference_ID=37,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="617fab25-96b7-5b47-a7a8-21c1d59124f4",
Synchronized="2020-03-03 21:37:06.0")
/** Column name PriceList */
public static final String COLUMNNAME_PriceList = "PriceList";

@XendraTrl(Identifier="8907bcb7-68e5-914c-4b10-fa5d175ae98a")
public static String es_PE_COLUMN_ProductDescription_Name="Descripción de Producto";

@XendraColumn(AD_Element_ID="4ad0f18d-ece5-98e0-8e0b-f239dcf795af",ColumnName="ProductDescription",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8907bcb7-68e5-914c-4b10-fa5d175ae98a",
Synchronized="2020-03-03 21:37:06.0")
/** Column name ProductDescription */
public static final String COLUMNNAME_ProductDescription = "ProductDescription";

@XendraTrl(Identifier="f1cca5ae-84c3-3f01-b037-7f92be296bb0")
public static String es_PE_COLUMN_ProductValue_Name="Sólo Valor de Producto";

@XendraColumn(AD_Element_ID="3c72be08-8fa7-5282-1e16-ddcbc46035d8",ColumnName="ProductValue",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f1cca5ae-84c3-3f01-b037-7f92be296bb0",
Synchronized="2020-03-03 21:37:06.0")
/** Column name ProductValue */
public static final String COLUMNNAME_ProductValue = "ProductValue";

@XendraTrl(Identifier="e71cad3d-2dec-8c5f-1f8f-81da9c68e46b")
public static String es_PE_COLUMN_QtyEntered_Name="Cantidad";

@XendraColumn(AD_Element_ID="70a37b06-986d-bf01-1ef9-23e214211841",ColumnName="QtyEntered",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e71cad3d-2dec-8c5f-1f8f-81da9c68e46b",
Synchronized="2020-03-03 21:37:06.0")
/** Column name QtyEntered */
public static final String COLUMNNAME_QtyEntered = "QtyEntered";

@XendraTrl(Identifier="ba797513-60a8-0498-e7be-e38944c7f2ed")
public static String es_PE_COLUMN_QtyInvoiced_Name="Cantidad Facturada";

@XendraColumn(AD_Element_ID="406c1301-33f0-3d6a-3fbc-b0cf44ccc5b3",ColumnName="QtyInvoiced",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ba797513-60a8-0498-e7be-e38944c7f2ed",
Synchronized="2020-03-03 21:37:06.0")
/** Column name QtyInvoiced */
public static final String COLUMNNAME_QtyInvoiced = "QtyInvoiced";

@XendraTrl(Identifier="3a54605e-f379-5a01-30a7-c63fabbbabd8")
public static String es_PE_COLUMN_ResourceDescription_Name="Descripción de Recursos";

@XendraColumn(AD_Element_ID="52f87021-2c77-d142-5725-43c886429dde",
ColumnName="ResourceDescription",AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=255,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="3a54605e-f379-5a01-30a7-c63fabbbabd8",Synchronized="2020-03-03 21:37:06.0")
/** Column name ResourceDescription */
public static final String COLUMNNAME_ResourceDescription = "ResourceDescription";

@XendraTrl(Identifier="f27958eb-0707-cf21-c448-2bfdb7547b63")
public static String es_PE_COLUMN_SerNo_Name="No. de Serie";

@XendraColumn(AD_Element_ID="9aac6ac8-a553-7ad4-9bc7-40f85e011f4b",ColumnName="SerNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f27958eb-0707-cf21-c448-2bfdb7547b63",
Synchronized="2020-03-03 21:37:06.0")
/** Column name SerNo */
public static final String COLUMNNAME_SerNo = "SerNo";

@XendraTrl(Identifier="5e6106da-707b-d66c-2567-d966ccf77da7")
public static String es_PE_COLUMN_SKU_Name="UM Almacenamiento";

@XendraColumn(AD_Element_ID="f473a6ed-4a3f-b6fd-5b0f-06d49c1e65e2",ColumnName="SKU",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5e6106da-707b-d66c-2567-d966ccf77da7",
Synchronized="2020-03-03 21:37:06.0")
/** Column name SKU */
public static final String COLUMNNAME_SKU = "SKU";

@XendraTrl(Identifier="c25abe43-9ec3-38f3-c736-9c0c483f4a42")
public static String es_PE_COLUMN_TaxAmt_Name="Total del Impuesto";

@XendraColumn(AD_Element_ID="462941e1-a196-170f-fd16-84da06ba50ea",ColumnName="TaxAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c25abe43-9ec3-38f3-c736-9c0c483f4a42",
Synchronized="2020-03-03 21:37:06.0")
/** Column name TaxAmt */
public static final String COLUMNNAME_TaxAmt = "TaxAmt";

@XendraTrl(Identifier="d12bd210-a879-4e4b-9b53-696212badb69")
public static String es_PE_COLUMN_TaxIndicator_Name="Identificador de Impuesto";

@XendraColumn(AD_Element_ID="099119b1-a377-e966-4537-2f056d06fb9d",ColumnName="TaxIndicator",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d12bd210-a879-4e4b-9b53-696212badb69",
Synchronized="2020-03-03 21:37:06.0")
/** Column name TaxIndicator */
public static final String COLUMNNAME_TaxIndicator = "TaxIndicator";

@XendraTrl(Identifier="d2d5dae7-ccee-cfc2-f132-9e8574711309")
public static String es_PE_COLUMN_Unknown_Name="unknown";

@XendraColumn(AD_Element_ID="2aa91b07-203c-ffc0-75c9-4f3366866d5c",ColumnName="Unknown",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2147483647,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="d2d5dae7-ccee-cfc2-f132-9e8574711309",
Synchronized="2020-03-03 21:37:06.0")
/** Column name Unknown */
public static final String COLUMNNAME_Unknown = "Unknown";

@XendraTrl(Identifier="495c665c-9e58-fd23-4fe1-a16f7a7826ee")
public static String es_PE_COLUMN_UOMSymbol_Name="Símbolo";

@XendraColumn(AD_Element_ID="ccb82b4f-2e57-da9a-16a8-8fd48d94adf5",ColumnName="UOMSymbol",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="495c665c-9e58-fd23-4fe1-a16f7a7826ee",
Synchronized="2020-03-03 21:37:06.0")
/** Column name UOMSymbol */
public static final String COLUMNNAME_UOMSymbol = "UOMSymbol";

@XendraTrl(Identifier="fab15cb1-3d7e-2d3c-379c-d910d866de35")
public static String es_PE_COLUMN_UPC_Name="UPC/EAN";

@XendraColumn(AD_Element_ID="9e36272a-ec41-b187-d531-cec50070c612",ColumnName="UPC",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fab15cb1-3d7e-2d3c-379c-d910d866de35",
Synchronized="2020-03-03 21:37:06.0")
/** Column name UPC */
public static final String COLUMNNAME_UPC = "UPC";
	@XendraView(Identifier="dad899f5-e075-2f11-ec59-c885c66b2f03",
Synchronized="2013-07-09 19:02:34.0",
Name="c_invoice_subtotal_v",
Owner="xendra",
Extension="")
	public static final String Identifier = "dad899f5-e075-2f11-ec59-c885c66b2f03";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-07-09 19:02:34.0");
	sb.appendln("@Identifier=dad899f5-e075-2f11-ec59-c885c66b2f03");
	sb.appendln("@comment=Invoice Print View");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT c_invoice_line_v.ad_client_id, c_invoice_line_v.ad_org_id, c_invoice_line_v.isactive, max(c_invoice_line_v.created) AS created, max(c_invoice_line_v.createdby) AS createdby, max(c_invoice_line_v.updated) AS updated, max(c_invoice_line_v.updatedby) AS updatedby, c_invoice_line_v.ad_language, c_invoice_line_v.c_invoice_id, NULL::unknown AS c_invoiceline_id, NULL::unknown AS c_tax_id, NULL::unknown AS taxamt, NULL::unknown AS linetotalamt, NULL::unknown AS taxindicator, NULL::unknown AS line, NULL::unknown AS m_product_id, NULL::unknown AS qtyinvoiced, NULL::unknown AS qtyentered, NULL::unknown AS uomsymbol, NULL::unknown AS name, 'Sub Total' AS description, NULL::unknown AS documentnote, NULL::unknown AS upc, NULL::unknown AS sku, NULL::unknown AS productvalue, NULL::unknown AS resourcedescription, NULL::unknown AS pricelist, NULL::unknown AS priceenteredlist, NULL::unknown AS discount, NULL::unknown AS priceactual, NULL::unknown AS priceentered, sum(c_invoice_line_v.linenetamt) AS linenetamt, NULL::unknown AS m_attributesetinstance_id, NULL::unknown AS m_attributeset_id, NULL::unknown AS serno, NULL::unknown AS lot, NULL::unknown AS m_lot_id, NULL::unknown AS guaranteedate, NULL::unknown AS productdescription, NULL::unknown AS imageurl, NULL::unknown AS c_campaign_id, NULL::unknown AS c_project_id, NULL::unknown AS c_activity_id, NULL::unknown AS c_projectphase_id, NULL::unknown AS c_projecttask_id, NULL::unknown AS unknown FROM c_invoice_line_v GROUP BY c_invoice_line_v.c_invoice_id, c_invoice_line_v.ad_client_id, c_invoice_line_v.ad_org_id, c_invoice_line_v.isactive, c_invoice_line_v.ad_language;");
	return sb.toString();
}
}
