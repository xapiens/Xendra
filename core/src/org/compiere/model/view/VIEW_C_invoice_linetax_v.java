package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_C_invoice_linetax_v 
{
 
@XendraTable(Name="C_Invoice_LineTax_v",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Invoice Print View",Help="",
TableName="C_Invoice_LineTax_v",AccessLevel="3",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=0,
LoadSeq=150,IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=true,IsChangeLog=false,
IsView=true,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="20053cb9-7ef9-76dd-12d5-ea6d6785c3f8",Synchronized="2020-03-03 21:37:04.0")
/** TableName=C_Invoice_LineTax_v */
public static final String Table_Name="C_Invoice_LineTax_v";

@XendraTrl(Identifier="67f163aa-aa0b-ac85-1c63-8f6fc7121076")
public static String es_PE_COLUMN_AD_Language_Name="Lenguaje";

@XendraColumn(AD_Element_ID="d542d9da-4627-0da8-89af-5797f22de434",ColumnName="AD_Language",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=5,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="67f163aa-aa0b-ac85-1c63-8f6fc7121076",
Synchronized="2020-03-03 21:37:03.0")
/** Column name AD_Language */
public static final String COLUMNNAME_AD_Language = "AD_Language";

@XendraTrl(Identifier="5503af1e-587f-95f5-18c1-c2278cf8ec56")
public static String es_PE_COLUMN_C_Activity_ID_Name="Tipo de Gasto";

@XendraColumn(AD_Element_ID="bfeadbb3-d866-26e3-8eee-3e2fdf0ff753",ColumnName="C_Activity_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5503af1e-587f-95f5-18c1-c2278cf8ec56",
Synchronized="2020-03-03 21:37:03.0")
/** Column name C_Activity_ID */
public static final String COLUMNNAME_C_Activity_ID = "C_Activity_ID";

@XendraTrl(Identifier="30a6df13-6a6c-1d1a-26ee-3bd22124598a")
public static String es_PE_COLUMN_C_Campaign_ID_Name="Campaña";

@XendraColumn(AD_Element_ID="6cf08e31-d355-ee38-9c0b-bee20b3ea5b6",ColumnName="C_Campaign_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="30a6df13-6a6c-1d1a-26ee-3bd22124598a",
Synchronized="2020-03-03 21:37:03.0")
/** Column name C_Campaign_ID */
public static final String COLUMNNAME_C_Campaign_ID = "C_Campaign_ID";

@XendraTrl(Identifier="3c888fb8-281e-f829-a081-13317ae216f5")
public static String es_PE_COLUMN_C_Invoice_ID_Name="Factura";

@XendraColumn(AD_Element_ID="e526ea57-1bdf-9871-fd57-0df3c1f9dd42",ColumnName="C_Invoice_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3c888fb8-281e-f829-a081-13317ae216f5",
Synchronized="2020-03-03 21:37:03.0")
/** Column name C_Invoice_ID */
public static final String COLUMNNAME_C_Invoice_ID = "C_Invoice_ID";
/** Column name C_InvoiceLine_ID */
public static final String COLUMNNAME_C_InvoiceLine_ID = "C_InvoiceLine_ID";

@XendraTrl(Identifier="fc3d38b7-3b08-4ab0-cc16-9cad115ebadf")
public static String es_PE_COLUMN_C_Project_ID_Name="Proyecto";

@XendraColumn(AD_Element_ID="16ff5dcc-9178-73dd-e618-e88bd79d573b",ColumnName="C_Project_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fc3d38b7-3b08-4ab0-cc16-9cad115ebadf",
Synchronized="2020-03-03 21:37:03.0")
/** Column name C_Project_ID */
public static final String COLUMNNAME_C_Project_ID = "C_Project_ID";

@XendraTrl(Identifier="32b5cce1-1117-ae3a-143e-262b4385b6e1")
public static String es_PE_COLUMN_C_ProjectPhase_ID_Name="Fase del Proyecto";

@XendraColumn(AD_Element_ID="ba6e5aab-8337-208a-03da-5712e50d4da9",ColumnName="C_ProjectPhase_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="32b5cce1-1117-ae3a-143e-262b4385b6e1",
Synchronized="2020-03-03 21:37:03.0")
/** Column name C_ProjectPhase_ID */
public static final String COLUMNNAME_C_ProjectPhase_ID = "C_ProjectPhase_ID";

@XendraTrl(Identifier="856cb7ac-5cb9-17fb-f08f-35b9be3333c7")
public static String es_PE_COLUMN_C_ProjectTask_ID_Name="Tarea del Proyecto";

@XendraColumn(AD_Element_ID="1b2d7a20-215c-4f56-6077-83adcead0920",ColumnName="C_ProjectTask_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="856cb7ac-5cb9-17fb-f08f-35b9be3333c7",
Synchronized="2020-03-03 21:37:03.0")
/** Column name C_ProjectTask_ID */
public static final String COLUMNNAME_C_ProjectTask_ID = "C_ProjectTask_ID";

@XendraTrl(Identifier="e6e99c5f-49d0-2b31-0ce7-020e16c1d367")
public static String es_PE_COLUMN_C_Tax_ID_Name="Impuesto";

@XendraColumn(AD_Element_ID="38ff24fc-b68c-51a9-60f8-ef2a1f060de2",ColumnName="C_Tax_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e6e99c5f-49d0-2b31-0ce7-020e16c1d367",
Synchronized="2020-03-03 21:37:03.0")
/** Column name C_Tax_ID */
public static final String COLUMNNAME_C_Tax_ID = "C_Tax_ID";

@XendraTrl(Identifier="8ef51439-2a24-2f98-337e-728d7a1c7d4e")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8ef51439-2a24-2f98-337e-728d7a1c7d4e",
Synchronized="2020-03-03 21:37:03.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";

@XendraTrl(Identifier="07944ecf-3846-5591-bc21-71ff28648506")
public static String es_PE_COLUMN_Discount_Name="% Descuento";

@XendraColumn(AD_Element_ID="3d8e2bac-29ff-f758-dd80-f9b4107077e6",ColumnName="Discount",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="07944ecf-3846-5591-bc21-71ff28648506",
Synchronized="2020-03-03 21:37:03.0")
/** Column name Discount */
public static final String COLUMNNAME_Discount = "Discount";

@XendraTrl(Identifier="d7464988-4f83-ca44-f1bc-f43d21f40fc5")
public static String es_PE_COLUMN_DocumentNote_Name="Nota de Documento";

@XendraColumn(AD_Element_ID="facce503-36ce-65e5-ad96-c872503feb2e",ColumnName="DocumentNote",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d7464988-4f83-ca44-f1bc-f43d21f40fc5",
Synchronized="2020-03-03 21:37:03.0")
/** Column name DocumentNote */
public static final String COLUMNNAME_DocumentNote = "DocumentNote";

@XendraTrl(Identifier="19420522-1877-c14e-f47f-644844397214")
public static String es_PE_COLUMN_GuaranteeDate_Name="Fecha de Garantía";

@XendraColumn(AD_Element_ID="2956aa9d-0dfd-6e86-af9b-584f4c7eca21",ColumnName="GuaranteeDate",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="19420522-1877-c14e-f47f-644844397214",
Synchronized="2020-03-03 21:37:03.0")
/** Column name GuaranteeDate */
public static final String COLUMNNAME_GuaranteeDate = "GuaranteeDate";

@XendraTrl(Identifier="5e19df02-8915-fd4a-8d0c-ee104d9c0a6e")
public static String es_PE_COLUMN_ImageURL_Name="URL de la Imagen";

@XendraColumn(AD_Element_ID="fe037607-f5d9-d969-d6e5-eb1f94c10e5e",ColumnName="ImageURL",
AD_Reference_ID=40,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=120,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5e19df02-8915-fd4a-8d0c-ee104d9c0a6e",
Synchronized="2020-03-03 21:37:03.0")
/** Column name ImageURL */
public static final String COLUMNNAME_ImageURL = "ImageURL";

@XendraTrl(Identifier="eb6b4d35-dc37-141e-7ba1-3b88634d263f")
public static String es_PE_COLUMN_Line_Name="No. Línea";

@XendraColumn(AD_Element_ID="986ef077-61da-f9cf-1c6d-aefe3a35113b",ColumnName="Line",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="eb6b4d35-dc37-141e-7ba1-3b88634d263f",
Synchronized="2020-03-03 21:37:03.0")
/** Column name Line */
public static final String COLUMNNAME_Line = "Line";

@XendraTrl(Identifier="f7a1dbf1-d4f8-8741-75b1-eb6987e64f14")
public static String es_PE_COLUMN_LineNetAmt_Name="Neto de Línea";

@XendraColumn(AD_Element_ID="ba57a535-4ae3-c6eb-74ec-3dcb0973d6f6",ColumnName="LineNetAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f7a1dbf1-d4f8-8741-75b1-eb6987e64f14",
Synchronized="2020-03-03 21:37:03.0")
/** Column name LineNetAmt */
public static final String COLUMNNAME_LineNetAmt = "LineNetAmt";

@XendraTrl(Identifier="097cd795-b6a9-a0e9-c7dc-fe0f32ecf631")
public static String es_PE_COLUMN_LineTotalAmt_Name="Total de la Línea";

@XendraColumn(AD_Element_ID="582be6fc-dd62-5c60-3398-a0f8435f0670",ColumnName="LineTotalAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="097cd795-b6a9-a0e9-c7dc-fe0f32ecf631",
Synchronized="2020-03-03 21:37:03.0")
/** Column name LineTotalAmt */
public static final String COLUMNNAME_LineTotalAmt = "LineTotalAmt";

@XendraTrl(Identifier="c33c6285-1a83-ee6a-b782-fe59e8f9a09d")
public static String es_PE_COLUMN_Lot_Name="No. Lote";

@XendraColumn(AD_Element_ID="e8a3022e-4a91-6f2a-e27c-3739825075c7",ColumnName="Lot",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c33c6285-1a83-ee6a-b782-fe59e8f9a09d",
Synchronized="2020-03-03 21:37:03.0")
/** Column name Lot */
public static final String COLUMNNAME_Lot = "Lot";

@XendraTrl(Identifier="1e102b46-6848-2e4b-d4ba-3af32c09aa70")
public static String es_PE_COLUMN_M_AttributeSet_ID_Name="Conjunto de Atributos";

@XendraColumn(AD_Element_ID="8debe7a4-548a-6126-d8aa-196f184678c2",ColumnName="M_AttributeSet_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1e102b46-6848-2e4b-d4ba-3af32c09aa70",
Synchronized="2020-03-03 21:37:03.0")
/** Column name M_AttributeSet_ID */
public static final String COLUMNNAME_M_AttributeSet_ID = "M_AttributeSet_ID";

@XendraTrl(Identifier="0c5c018b-2286-fbd6-bdaa-96a942dfddbd")
public static String es_PE_COLUMN_M_AttributeSetInstance_ID_Name="Instancia del Conjunto de Atributos";

@XendraColumn(AD_Element_ID="137807f2-3c52-e193-3ceb-f10b819cf955",
ColumnName="M_AttributeSetInstance_ID",AD_Reference_ID=35,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,
IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",
IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0c5c018b-2286-fbd6-bdaa-96a942dfddbd",
Synchronized="2020-03-03 21:37:03.0")
/** Column name M_AttributeSetInstance_ID */
public static final String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";

@XendraTrl(Identifier="bfd7f1e6-b601-3d58-59a7-b6d226aafb9d")
public static String es_PE_COLUMN_M_Lot_ID_Name="Lote";

@XendraColumn(AD_Element_ID="e1d8c1a9-7ee8-36d2-d9da-fcf63a007dbb",ColumnName="M_Lot_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bfd7f1e6-b601-3d58-59a7-b6d226aafb9d",
Synchronized="2020-03-03 21:37:03.0")
/** Column name M_Lot_ID */
public static final String COLUMNNAME_M_Lot_ID = "M_Lot_ID";

@XendraTrl(Identifier="2824f42f-ca8a-16cb-6fb5-8ad493b5017a")
public static String es_PE_COLUMN_M_Product_ID_Name="Product";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2824f42f-ca8a-16cb-6fb5-8ad493b5017a",
Synchronized="2020-03-03 21:37:03.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";

@XendraTrl(Identifier="703955c5-e71f-fcf4-05e9-ed41578cf210")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="703955c5-e71f-fcf4-05e9-ed41578cf210",
Synchronized="2020-03-03 21:37:03.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";

@XendraTrl(Identifier="0770dd63-abba-6c48-d97d-5da3f84142e0")
public static String es_PE_COLUMN_PriceActual_Name="Precio Actual";

@XendraColumn(AD_Element_ID="8ee15d33-8f4b-598f-dc4c-9d67f968a13c",ColumnName="PriceActual",
AD_Reference_ID=37,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0770dd63-abba-6c48-d97d-5da3f84142e0",
Synchronized="2020-03-03 21:37:03.0")
/** Column name PriceActual */
public static final String COLUMNNAME_PriceActual = "PriceActual";

@XendraTrl(Identifier="5f89c4a8-74bd-8914-97e0-16367a62632b")
public static String es_PE_COLUMN_PriceEntered_Name="Precio";

@XendraColumn(AD_Element_ID="c0a272c7-da17-7089-b9a4-6aeab9e222ef",ColumnName="PriceEntered",
AD_Reference_ID=37,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5f89c4a8-74bd-8914-97e0-16367a62632b",
Synchronized="2020-03-03 21:37:03.0")
/** Column name PriceEntered */
public static final String COLUMNNAME_PriceEntered = "PriceEntered";

@XendraTrl(Identifier="8034a853-b218-5c22-fb02-faea6cbc7631")
public static String es_PE_COLUMN_PriceEnteredList_Name="Lista de Precios";

@XendraColumn(AD_Element_ID="ea5ee89b-10bd-f8e6-5861-d5551054efc3",ColumnName="PriceEnteredList",
AD_Reference_ID=37,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8034a853-b218-5c22-fb02-faea6cbc7631",
Synchronized="2020-03-03 21:37:03.0")
/** Column name PriceEnteredList */
public static final String COLUMNNAME_PriceEnteredList = "PriceEnteredList";

@XendraTrl(Identifier="138de8fc-aa85-69a5-57cb-b94b2591bd52")
public static String es_PE_COLUMN_PriceList_Name="Precio de Lista";

@XendraColumn(AD_Element_ID="0f6529f2-0ceb-0583-6c50-c04e6542c99b",ColumnName="PriceList",
AD_Reference_ID=37,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="138de8fc-aa85-69a5-57cb-b94b2591bd52",
Synchronized="2020-03-03 21:37:04.0")
/** Column name PriceList */
public static final String COLUMNNAME_PriceList = "PriceList";

@XendraTrl(Identifier="0a6636d3-30a1-f62e-fbda-0a087dd1cd50")
public static String es_PE_COLUMN_ProductDescription_Name="Descripción de Producto";

@XendraColumn(AD_Element_ID="4ad0f18d-ece5-98e0-8e0b-f239dcf795af",ColumnName="ProductDescription",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0a6636d3-30a1-f62e-fbda-0a087dd1cd50",
Synchronized="2020-03-03 21:37:04.0")
/** Column name ProductDescription */
public static final String COLUMNNAME_ProductDescription = "ProductDescription";

@XendraTrl(Identifier="e31f4272-4a0e-3aca-f161-411053e0cada")
public static String es_PE_COLUMN_ProductValue_Name="Sólo Valor de Producto";

@XendraColumn(AD_Element_ID="3c72be08-8fa7-5282-1e16-ddcbc46035d8",ColumnName="ProductValue",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e31f4272-4a0e-3aca-f161-411053e0cada",
Synchronized="2020-03-03 21:37:04.0")
/** Column name ProductValue */
public static final String COLUMNNAME_ProductValue = "ProductValue";

@XendraTrl(Identifier="8d81cea3-f89e-976a-3685-a827c759d6ed")
public static String es_PE_COLUMN_QtyEntered_Name="Cantidad";

@XendraColumn(AD_Element_ID="70a37b06-986d-bf01-1ef9-23e214211841",ColumnName="QtyEntered",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8d81cea3-f89e-976a-3685-a827c759d6ed",
Synchronized="2020-03-03 21:37:04.0")
/** Column name QtyEntered */
public static final String COLUMNNAME_QtyEntered = "QtyEntered";

@XendraTrl(Identifier="28e1a64f-2102-c73e-f077-416b1f5f20b5")
public static String es_PE_COLUMN_QtyInvoiced_Name="Cantidad Facturada";

@XendraColumn(AD_Element_ID="406c1301-33f0-3d6a-3fbc-b0cf44ccc5b3",ColumnName="QtyInvoiced",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="28e1a64f-2102-c73e-f077-416b1f5f20b5",
Synchronized="2020-03-03 21:37:04.0")
/** Column name QtyInvoiced */
public static final String COLUMNNAME_QtyInvoiced = "QtyInvoiced";

@XendraTrl(Identifier="845f2bad-c814-bdfd-ad44-3d4a278027b7")
public static String es_PE_COLUMN_ResourceDescription_Name="Descripción de Recursos";

@XendraColumn(AD_Element_ID="52f87021-2c77-d142-5725-43c886429dde",
ColumnName="ResourceDescription",AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=255,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="845f2bad-c814-bdfd-ad44-3d4a278027b7",Synchronized="2020-03-03 21:37:04.0")
/** Column name ResourceDescription */
public static final String COLUMNNAME_ResourceDescription = "ResourceDescription";

@XendraTrl(Identifier="25d16cca-c3b0-397c-7036-210ccb2a6201")
public static String es_PE_COLUMN_SerNo_Name="No. de Serie";

@XendraColumn(AD_Element_ID="9aac6ac8-a553-7ad4-9bc7-40f85e011f4b",ColumnName="SerNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="25d16cca-c3b0-397c-7036-210ccb2a6201",
Synchronized="2020-03-03 21:37:04.0")
/** Column name SerNo */
public static final String COLUMNNAME_SerNo = "SerNo";

@XendraTrl(Identifier="ef248440-df2d-d0d0-ab68-629263462eec")
public static String es_PE_COLUMN_SKU_Name="UM Almacenamiento";

@XendraColumn(AD_Element_ID="f473a6ed-4a3f-b6fd-5b0f-06d49c1e65e2",ColumnName="SKU",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ef248440-df2d-d0d0-ab68-629263462eec",
Synchronized="2020-03-03 21:37:04.0")
/** Column name SKU */
public static final String COLUMNNAME_SKU = "SKU";

@XendraTrl(Identifier="d9c088e1-943c-a4c9-b334-7f1cba3ad34e")
public static String es_PE_COLUMN_TaxAmt_Name="Total del Impuesto";

@XendraColumn(AD_Element_ID="462941e1-a196-170f-fd16-84da06ba50ea",ColumnName="TaxAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d9c088e1-943c-a4c9-b334-7f1cba3ad34e",
Synchronized="2020-03-03 21:37:04.0")
/** Column name TaxAmt */
public static final String COLUMNNAME_TaxAmt = "TaxAmt";

@XendraTrl(Identifier="dd0e2da6-3555-b6e3-325e-980a8429da68")
public static String es_PE_COLUMN_TaxIndicator_Name="Identificador de Impuesto";

@XendraColumn(AD_Element_ID="099119b1-a377-e966-4537-2f056d06fb9d",ColumnName="TaxIndicator",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="dd0e2da6-3555-b6e3-325e-980a8429da68",
Synchronized="2020-03-03 21:37:04.0")
/** Column name TaxIndicator */
public static final String COLUMNNAME_TaxIndicator = "TaxIndicator";

@XendraTrl(Identifier="16c61236-e8d8-a353-1ea2-4f3cdbf57f6b")
public static String es_PE_COLUMN_UOMSymbol_Name="Símbolo";

@XendraColumn(AD_Element_ID="ccb82b4f-2e57-da9a-16a8-8fd48d94adf5",ColumnName="UOMSymbol",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="16c61236-e8d8-a353-1ea2-4f3cdbf57f6b",
Synchronized="2020-03-03 21:37:04.0")
/** Column name UOMSymbol */
public static final String COLUMNNAME_UOMSymbol = "UOMSymbol";

@XendraTrl(Identifier="4610be4d-0f81-b5e8-e184-aa97e1c7bdfe")
public static String es_PE_COLUMN_UPC_Name="UPC/EAN";

@XendraColumn(AD_Element_ID="9e36272a-ec41-b187-d531-cec50070c612",ColumnName="UPC",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4610be4d-0f81-b5e8-e184-aa97e1c7bdfe",
Synchronized="2020-03-03 21:37:04.0")
/** Column name UPC */
public static final String COLUMNNAME_UPC = "UPC";
	@XendraView(Identifier="20053cb9-7ef9-76dd-12d5-ea6d6785c3f8",
Synchronized="2013-07-09 19:02:34.0",
Name="c_invoice_linetax_v",
Owner="xendra",
Extension="")
	public static final String Identifier = "20053cb9-7ef9-76dd-12d5-ea6d6785c3f8";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-07-09 19:02:34.0");
	sb.appendln("@Identifier=20053cb9-7ef9-76dd-12d5-ea6d6785c3f8");
	sb.appendln("@comment=Invoice Print View");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("(((SELECT il.ad_client_id, il.ad_org_id, il.isactive, il.created, il.createdby, il.updated, il.updatedby, 'en_US'::text AS ad_language, il.c_invoice_id, il.c_invoiceline_id, il.c_tax_id, il.taxamt, il.linetotalamt, t.taxindicator, il.line, p.m_product_id, CASE WHEN ((il.qtyinvoiced <> (0)::numeric) OR (il.m_product_id IS NOT NULL)) THEN il.qtyinvoiced ELSE NULL::numeric END AS qtyinvoiced, CASE WHEN ((il.qtyentered <> (0)::numeric) OR (il.m_product_id IS NOT NULL)) THEN il.qtyentered ELSE NULL::numeric END AS qtyentered, CASE WHEN ((il.qtyentered <> (0)::numeric) OR (il.m_product_id IS NOT NULL)) THEN uom.uomsymbol ELSE NULL::character varying END AS uomsymbol, COALESCE(c.name, (((p.name)::text || (productattribute(il.m_attributesetinstance_id))::text))::character varying, il.description) AS name, CASE WHEN (COALESCE(c.name, p.name) IS NOT NULL) THEN il.description ELSE NULL::character varying END AS description, p.documentnote, p.upc, p.sku, COALESCE(pp.vendorproductno, p.value) AS productvalue, ra.description AS resourcedescription, CASE WHEN ((i.isdiscountprinted = 'Y'::bpchar) AND (il.pricelist <> (0)::numeric)) THEN il.pricelist ELSE NULL::numeric END AS pricelist, CASE WHEN (((i.isdiscountprinted = 'Y'::bpchar) AND (il.pricelist <> (0)::numeric)) AND (il.qtyentered <> (0)::numeric)) THEN ((il.pricelist * il.qtyinvoiced) / il.qtyentered) ELSE NULL::numeric END AS priceenteredlist, CASE WHEN (((i.isdiscountprinted = 'Y'::bpchar) AND (il.pricelist > il.priceactual)) AND (il.pricelist <> (0)::numeric)) THEN (((il.pricelist - il.priceactual) / il.pricelist) * (100)::numeric) ELSE NULL::numeric END AS discount, CASE WHEN ((il.priceactual <> (0)::numeric) OR (il.m_product_id IS NOT NULL)) THEN il.priceactual ELSE NULL::numeric END AS priceactual, CASE WHEN ((il.priceentered <> (0)::numeric) OR (il.m_product_id IS NOT NULL)) THEN il.priceentered ELSE NULL::numeric END AS priceentered, CASE WHEN ((il.linenetamt <> (0)::numeric) OR (il.m_product_id IS NOT NULL)) THEN il.linenetamt ELSE NULL::numeric END AS linenetamt, il.m_attributesetinstance_id, asi.m_attributeset_id, asi.serno, asi.lot, asi.m_lot_id, asi.guaranteedate, p.description AS productdescription, p.imageurl, il.c_campaign_id, il.c_project_id, il.c_activity_id, il.c_projectphase_id, il.c_projecttask_id FROM ((((((((c_invoiceline il JOIN c_uom uom ON ((il.c_uom_id = uom.c_uom_id))) JOIN c_invoice i ON ((il.c_invoice_id = i.c_invoice_id))) LEFT JOIN c_tax t ON ((il.c_tax_id = t.c_tax_id))) LEFT JOIN m_product p ON ((il.m_product_id = p.m_product_id))) LEFT JOIN c_charge c ON ((il.c_charge_id = c.c_charge_id))) LEFT JOIN c_bpartner_product pp ON (((il.m_product_id = pp.m_product_id) AND (i.c_bpartner_id = pp.c_bpartner_id)))) LEFT JOIN s_resourceassignment ra ON ((il.s_resourceassignment_id = ra.s_resourceassignment_id))) LEFT JOIN m_attributesetinstance asi ON ((il.m_attributesetinstance_id = asi.m_attributesetinstance_id))) UNION SELECT il.ad_client_id, il.ad_org_id, il.isactive, il.created, il.createdby, il.updated, il.updatedby, 'en_US'::text AS ad_language, il.c_invoice_id, il.c_invoiceline_id, il.c_tax_id, il.taxamt, il.linetotalamt, t.taxindicator, (il.line + (b.line / (100)::numeric)) AS line, p.m_product_id, (il.qtyinvoiced * b.bomqty) AS qtyinvoiced, (il.qtyentered * b.bomqty) AS qtyentered, uom.uomsymbol, p.name, b.description, p.documentnote, p.upc, p.sku, p.value AS productvalue, NULL::character varying AS resourcedescription, NULL::numeric AS pricelist, NULL::numeric AS priceenteredlist, NULL::numeric AS discount, NULL::numeric AS priceactual, NULL::numeric AS priceentered, NULL::numeric AS linenetamt, il.m_attributesetinstance_id, asi.m_attributeset_id, asi.serno, asi.lot, asi.m_lot_id, asi.guaranteedate, p.description AS productdescription, p.imageurl, il.c_campaign_id, il.c_project_id, il.c_activity_id, il.c_projectphase_id, il.c_projecttask_id FROM ((((((m_product_bom b JOIN c_invoiceline il ON ((b.m_product_id = il.m_product_id))) JOIN m_product bp ON (((((bp.m_product_id = il.m_product_id) AND (bp.isbom = 'Y'::bpchar)) AND (bp.isverified = 'Y'::bpchar)) AND (bp.isinvoiceprintdetails = 'Y'::bpchar)))) JOIN m_product p ON ((b.m_productbom_id = p.m_product_id))) JOIN c_uom uom ON ((p.c_uom_id = uom.c_uom_id))) LEFT JOIN c_tax t ON ((il.c_tax_id = t.c_tax_id))) LEFT JOIN m_attributesetinstance asi ON ((il.m_attributesetinstance_id = asi.m_attributesetinstance_id)))) UNION SELECT il.ad_client_id, il.ad_org_id, il.isactive, il.created, il.createdby, il.updated, il.updatedby, 'en_US'::text AS ad_language, il.c_invoice_id, il.c_invoiceline_id, NULL::numeric AS c_tax_id, NULL::numeric AS taxamt, NULL::numeric AS linetotalamt, NULL::character varying AS taxindicator, il.line, NULL::numeric AS m_product_id, NULL::numeric AS qtyinvoiced, NULL::numeric AS qtyentered, NULL::character varying AS uomsymbol, il.description AS name, NULL::character varying AS description, NULL::character varying AS documentnote, NULL::character varying AS upc, NULL::character varying AS sku, NULL::character varying AS productvalue, NULL::character varying AS resourcedescription, NULL::numeric AS pricelist, NULL::numeric AS priceenteredlist, NULL::numeric AS discount, NULL::numeric AS priceactual, NULL::numeric AS priceentered, NULL::numeric AS linenetamt, NULL::numeric AS m_attributesetinstance_id, NULL::numeric AS m_attributeset_id, NULL::character varying AS serno, NULL::character varying AS lot, NULL::numeric AS m_lot_id, NULL::timestamp without time zone AS guaranteedate, NULL::character varying AS productdescription, NULL::character varying AS imageurl, NULL::numeric AS c_campaign_id, NULL::numeric AS c_project_id, NULL::numeric AS c_activity_id, NULL::numeric AS c_projectphase_id, NULL::numeric AS c_projecttask_id FROM c_invoiceline il WHERE (il.c_uom_id IS NULL)) UNION SELECT c_invoice.ad_client_id, c_invoice.ad_org_id, c_invoice.isactive, c_invoice.created, c_invoice.createdby, c_invoice.updated, c_invoice.updatedby, 'en_US'::text AS ad_language, c_invoice.c_invoice_id, NULL::numeric AS c_invoiceline_id, NULL::numeric AS c_tax_id, NULL::numeric AS taxamt, NULL::numeric AS linetotalamt, NULL::character varying AS taxindicator, 9998 AS line, NULL::numeric AS m_product_id, NULL::numeric AS qtyinvoiced, NULL::numeric AS qtyentered, NULL::character varying AS uomsymbol, NULL::character varying AS name, NULL::character varying AS description, NULL::character varying AS documentnote, NULL::character varying AS upc, NULL::character varying AS sku, NULL::character varying AS productvalue, NULL::character varying AS resourcedescription, NULL::numeric AS pricelist, NULL::numeric AS priceenteredlist, NULL::numeric AS discount, NULL::numeric AS priceactual, NULL::numeric AS priceentered, NULL::numeric AS linenetamt, NULL::numeric AS m_attributesetinstance_id, NULL::numeric AS m_attributeset_id, NULL::character varying AS serno, NULL::character varying AS lot, NULL::numeric AS m_lot_id, NULL::timestamp without time zone AS guaranteedate, NULL::character varying AS productdescription, NULL::character varying AS imageurl, NULL::numeric AS c_campaign_id, NULL::numeric AS c_project_id, NULL::numeric AS c_activity_id, NULL::numeric AS c_projectphase_id, NULL::numeric AS c_projecttask_id FROM c_invoice) UNION SELECT it.ad_client_id, it.ad_org_id, it.isactive, it.created, it.createdby, it.updated, it.updatedby, 'en_US'::text AS ad_language, it.c_invoice_id, NULL::numeric AS c_invoiceline_id, it.c_tax_id, NULL::numeric AS taxamt, NULL::numeric AS linetotalamt, t.taxindicator, 9999 AS line, NULL::numeric AS m_product_id, NULL::numeric AS qtyinvoiced, NULL::numeric AS qtyentered, NULL::character varying AS uomsymbol, t.name, NULL::character varying AS description, NULL::character varying AS documentnote, NULL::character varying AS upc, NULL::character varying AS sku, NULL::character varying AS productvalue, NULL::character varying AS resourcedescription, NULL::numeric AS pricelist, NULL::numeric AS priceenteredlist, NULL::numeric AS discount, CASE WHEN (it.istaxincluded = 'Y'::bpchar) THEN it.taxamt ELSE it.taxbaseamt END AS priceactual, CASE WHEN (it.istaxincluded = 'Y'::bpchar) THEN it.taxamt ELSE it.taxbaseamt END AS priceentered, CASE WHEN (it.istaxincluded = 'Y'::bpchar) THEN NULL::numeric ELSE it.taxamt END AS linenetamt, NULL::numeric AS m_attributesetinstance_id, NULL::numeric AS m_attributeset_id, NULL::character varying AS serno, NULL::character varying AS lot, NULL::numeric AS m_lot_id, NULL::timestamp without time zone AS guaranteedate, NULL::character varying AS productdescription, NULL::character varying AS imageurl, NULL::numeric AS c_campaign_id, NULL::numeric AS c_project_id, NULL::numeric AS c_activity_id, NULL::numeric AS c_projectphase_id, NULL::numeric AS c_projecttask_id FROM (c_invoicetax it JOIN c_tax t ON ((it.c_tax_id = t.c_tax_id)));");
	return sb.toString();
}
}
