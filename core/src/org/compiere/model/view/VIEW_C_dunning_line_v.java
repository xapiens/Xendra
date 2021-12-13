package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_C_dunning_line_v 
{
 
@XendraTable(Name="C_Dunning_Line_v",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Dunning Letter Lines",Help="",
TableName="C_Dunning_Line_v",AccessLevel="3",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=0,LoadSeq=150,
IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=true,IsChangeLog=false,IsView=true,
PO_Window_ID="",ID="org.xendra.commercial",Identifier="251fd17f-6fce-7396-10bd-6c871da27bdf",
Synchronized="2020-03-03 21:36:53.0")
/** TableName=C_Dunning_Line_v */
public static final String Table_Name="C_Dunning_Line_v";

@XendraTrl(Identifier="4ae3c308-9703-6355-e3cf-757a5a249a32")
public static String es_PE_COLUMN_AD_Language_Name="Lenguaje";

@XendraColumn(AD_Element_ID="d542d9da-4627-0da8-89af-5797f22de434",ColumnName="AD_Language",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=5,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4ae3c308-9703-6355-e3cf-757a5a249a32",
Synchronized="2020-03-03 21:36:52.0")
/** Column name AD_Language */
public static final String COLUMNNAME_AD_Language = "AD_Language";

@XendraTrl(Identifier="dff7364b-1e54-f9c4-9913-7220ece8cdf5")
public static String es_PE_COLUMN_AD_OrgTrx_ID_Name="Organización de la Trans.";

@XendraColumn(AD_Element_ID="b4180358-67aa-fe55-0409-6367a60e0a2e",ColumnName="AD_OrgTrx_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="c51c396d-3026-2c1f-b979-24961a8cd969",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="dff7364b-1e54-f9c4-9913-7220ece8cdf5",Synchronized="2020-03-03 21:36:52.0")
/** Column name AD_OrgTrx_ID */
public static final String COLUMNNAME_AD_OrgTrx_ID = "AD_OrgTrx_ID";

@XendraTrl(Identifier="31d000cb-d1ff-7c24-d88a-69a63f295f08")
public static String es_PE_COLUMN_Amt_Name="Total";

@XendraColumn(AD_Element_ID="42827f15-aceb-2f14-cc38-b4a7c6022136",ColumnName="Amt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="31d000cb-d1ff-7c24-d88a-69a63f295f08",
Synchronized="2020-03-03 21:36:52.0")
/** Column name Amt */
public static final String COLUMNNAME_Amt = "Amt";

@XendraTrl(Identifier="f0c4e264-c3bd-482b-c3d2-6e67f3d8ceef")
public static String es_PE_COLUMN_AmtInWords_Name="Cant. En Palabras";

@XendraColumn(AD_Element_ID="ddaf5eb4-cdab-73ef-508f-3ddb605f61aa",ColumnName="AmtInWords",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f0c4e264-c3bd-482b-c3d2-6e67f3d8ceef",
Synchronized="2020-03-03 21:36:52.0")
/** Column name AmtInWords */
public static final String COLUMNNAME_AmtInWords = "AmtInWords";

@XendraTrl(Identifier="022daeed-bc6e-86d0-54f4-0b67469727d4")
public static String es_PE_COLUMN_C_Activity_ID_Name="Tipo de Gasto";

@XendraColumn(AD_Element_ID="bfeadbb3-d866-26e3-8eee-3e2fdf0ff753",ColumnName="C_Activity_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="022daeed-bc6e-86d0-54f4-0b67469727d4",
Synchronized="2020-03-03 21:36:52.0")
/** Column name C_Activity_ID */
public static final String COLUMNNAME_C_Activity_ID = "C_Activity_ID";

@XendraTrl(Identifier="810654e2-f5b0-37ab-e28c-60646177b6fc")
public static String es_PE_COLUMN_C_Campaign_ID_Name="Campaña";

@XendraColumn(AD_Element_ID="6cf08e31-d355-ee38-9c0b-bee20b3ea5b6",ColumnName="C_Campaign_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="810654e2-f5b0-37ab-e28c-60646177b6fc",
Synchronized="2020-03-03 21:36:52.0")
/** Column name C_Campaign_ID */
public static final String COLUMNNAME_C_Campaign_ID = "C_Campaign_ID";

@XendraTrl(Identifier="e282c792-0261-0e50-79dd-4548572a9fc6")
public static String es_PE_COLUMN_C_Charge_ID_Name="Cargo";

@XendraColumn(AD_Element_ID="d7e2fc48-a26e-4ded-ea44-fe15849a7883",ColumnName="C_Charge_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e282c792-0261-0e50-79dd-4548572a9fc6",
Synchronized="2020-03-03 21:36:52.0")
/** Column name C_Charge_ID */
public static final String COLUMNNAME_C_Charge_ID = "C_Charge_ID";

@XendraTrl(Identifier="e4802163-92fa-fed8-cd6d-c3740784eb3e")
public static String es_PE_COLUMN_C_ConversionType_ID_Name="Tipo de Moneda";

@XendraColumn(AD_Element_ID="66f5d039-c94d-0957-487b-eb3118bd7719",
ColumnName="C_ConversionType_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="e4802163-92fa-fed8-cd6d-c3740784eb3e",Synchronized="2020-03-03 21:36:52.0")
/** Column name C_ConversionType_ID */
public static final String COLUMNNAME_C_ConversionType_ID = "C_ConversionType_ID";

@XendraTrl(Identifier="84446a50-0542-527b-c4aa-6e4cfb11ae6d")
public static String es_PE_COLUMN_C_Currency_ID_Name="Moneda";

@XendraColumn(AD_Element_ID="8daec488-bca2-50fe-f9de-abf0cba2a34a",ColumnName="C_Currency_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="84446a50-0542-527b-c4aa-6e4cfb11ae6d",
Synchronized="2020-03-03 21:36:52.0")
/** Column name C_Currency_ID */
public static final String COLUMNNAME_C_Currency_ID = "C_Currency_ID";

@XendraTrl(Identifier="080cc7ca-f0f4-ef39-cb0b-2be06b6d674d")
public static String es_PE_COLUMN_C_DocType_ID_Name="Tipo de Documento";

@XendraColumn(AD_Element_ID="099a4147-1a72-cdd0-81e0-8bdbc8c0b883",ColumnName="C_DocType_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="080cc7ca-f0f4-ef39-cb0b-2be06b6d674d",
Synchronized="2020-03-03 21:36:52.0")
/** Column name C_DocType_ID */
public static final String COLUMNNAME_C_DocType_ID = "C_DocType_ID";

@XendraTrl(Identifier="ae490124-f89c-5301-6b8d-b12c562e2e0b")
public static String es_PE_COLUMN_C_DunningRunEntry_ID_Name="Entrada de secuencial de Morosidad";

@XendraColumn(AD_Element_ID="048e9391-6a02-5770-5236-20f13b1a6cdc",
ColumnName="C_DunningRunEntry_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="ae490124-f89c-5301-6b8d-b12c562e2e0b",Synchronized="2020-03-03 21:36:52.0")
/** Column name C_DunningRunEntry_ID */
public static final String COLUMNNAME_C_DunningRunEntry_ID = "C_DunningRunEntry_ID";
/** Column name C_DunningRunLine_ID */
public static final String COLUMNNAME_C_DunningRunLine_ID = "C_DunningRunLine_ID";

@XendraTrl(Identifier="725505ce-7a03-d55c-5ea5-c82970782c3e")
public static String es_PE_COLUMN_ChargeAmt_Name="Total de Cargo";

@XendraColumn(AD_Element_ID="0700d401-01bb-8f19-a508-aa47155ba852",ColumnName="ChargeAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="725505ce-7a03-d55c-5ea5-c82970782c3e",
Synchronized="2020-03-03 21:36:52.0")
/** Column name ChargeAmt */
public static final String COLUMNNAME_ChargeAmt = "ChargeAmt";

@XendraTrl(Identifier="57c2666a-543f-a4cb-10de-1dc34375f40c")
public static String es_PE_COLUMN_C_Invoice_ID_Name="Factura";

@XendraColumn(AD_Element_ID="e526ea57-1bdf-9871-fd57-0df3c1f9dd42",ColumnName="C_Invoice_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="57c2666a-543f-a4cb-10de-1dc34375f40c",
Synchronized="2020-03-03 21:36:53.0")
/** Column name C_Invoice_ID */
public static final String COLUMNNAME_C_Invoice_ID = "C_Invoice_ID";

@XendraTrl(Identifier="9ceaac1b-6116-add3-52f2-55ddaebb826b")
public static String es_PE_COLUMN_ConvertedAmt_Name="Total Convertido";

@XendraColumn(AD_Element_ID="6b6925fc-75bd-914f-a973-fc059d2b2f46",ColumnName="ConvertedAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9ceaac1b-6116-add3-52f2-55ddaebb826b",
Synchronized="2020-03-03 21:36:53.0")
/** Column name ConvertedAmt */
public static final String COLUMNNAME_ConvertedAmt = "ConvertedAmt";

@XendraTrl(Identifier="33409851-2f77-45d9-cef9-e7a5951fd9e5")
public static String es_PE_COLUMN_C_Project_ID_Name="Proyecto";

@XendraColumn(AD_Element_ID="16ff5dcc-9178-73dd-e618-e88bd79d573b",ColumnName="C_Project_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="33409851-2f77-45d9-cef9-e7a5951fd9e5",
Synchronized="2020-03-03 21:36:53.0")
/** Column name C_Project_ID */
public static final String COLUMNNAME_C_Project_ID = "C_Project_ID";

@XendraTrl(Identifier="653ee1d5-8f30-0339-a35d-2cb6c1a920ad")
public static String es_PE_COLUMN_DateAcct_Name="Fecha de Aplicación CG";

@XendraColumn(AD_Element_ID="034727d0-e80f-fadf-3d4f-2d8d37b75669",ColumnName="DateAcct",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="653ee1d5-8f30-0339-a35d-2cb6c1a920ad",
Synchronized="2020-03-03 21:36:53.0")
/** Column name DateAcct */
public static final String COLUMNNAME_DateAcct = "DateAcct";

@XendraTrl(Identifier="5332f8ae-66df-91d6-b61e-df65e822c0d6")
public static String es_PE_COLUMN_DateInvoiced_Name="Fecha de Facturación";

@XendraColumn(AD_Element_ID="5e3c1a65-f97d-82ed-a21c-bc730ca3c080",ColumnName="DateInvoiced",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5332f8ae-66df-91d6-b61e-df65e822c0d6",
Synchronized="2020-03-03 21:36:53.0")
/** Column name DateInvoiced */
public static final String COLUMNNAME_DateInvoiced = "DateInvoiced";

@XendraTrl(Identifier="13ac3476-b7e9-d7e7-b1c0-f3bd1a3aaec0")
public static String es_PE_COLUMN_DateOrdered_Name="Fecha de la Orden";

@XendraColumn(AD_Element_ID="c265ae59-eec5-5c6b-26ee-1090bf37ce26",ColumnName="DateOrdered",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="13ac3476-b7e9-d7e7-b1c0-f3bd1a3aaec0",
Synchronized="2020-03-03 21:36:53.0")
/** Column name DateOrdered */
public static final String COLUMNNAME_DateOrdered = "DateOrdered";

@XendraTrl(Identifier="a281998a-4292-007b-a71e-51cad882ac1e")
public static String es_PE_COLUMN_DateTrx_Name="Fecha de la Transacción";

@XendraColumn(AD_Element_ID="3700288f-61dd-2021-b833-cf804ceed1e9",ColumnName="DateTrx",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a281998a-4292-007b-a71e-51cad882ac1e",
Synchronized="2020-03-03 21:36:53.0")
/** Column name DateTrx */
public static final String COLUMNNAME_DateTrx = "DateTrx";

@XendraTrl(Identifier="81a8fb54-51a5-1ff1-a13b-ae1e3ab11e67")
public static String es_PE_COLUMN_DaysDue_Name="Días de Vencimiento";

@XendraColumn(AD_Element_ID="64acd2e4-02d1-dcb5-c65f-a18bd0b91443",ColumnName="DaysDue",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="81a8fb54-51a5-1ff1-a13b-ae1e3ab11e67",
Synchronized="2020-03-03 21:36:53.0")
/** Column name DaysDue */
public static final String COLUMNNAME_DaysDue = "DaysDue";

@XendraTrl(Identifier="94163168-d6ce-3a8e-9e45-d8539c0c92d6")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="94163168-d6ce-3a8e-9e45-d8539c0c92d6",
Synchronized="2020-03-03 21:36:53.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";

@XendraTrl(Identifier="86a3102a-c5e8-9356-97bf-11360d267f15")
public static String es_PE_COLUMN_DiscountAmt_Name="Total del Descuento";

@XendraColumn(AD_Element_ID="351290a4-6d07-13cb-9132-459358217d86",ColumnName="DiscountAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="86a3102a-c5e8-9356-97bf-11360d267f15",
Synchronized="2020-03-03 21:36:53.0")
/** Column name DiscountAmt */
public static final String COLUMNNAME_DiscountAmt = "DiscountAmt";

@XendraTrl(Identifier="fcd2e292-f1e1-ec0a-1bf2-bcd4c8cff6a7")
public static String es_PE_COLUMN_DocStatus_Name="Estado del Documento";

@XendraColumn(AD_Element_ID="e73fa537-3438-bd01-dfd4-f0f080a28c55",ColumnName="DocStatus",
AD_Reference_ID=17,AD_Reference_Value_ID="7627125d-fefe-e6bc-bb7d-4a6c772172dc",AD_Val_Rule_ID="",
FieldLength=2,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="fcd2e292-f1e1-ec0a-1bf2-bcd4c8cff6a7",Synchronized="2020-03-03 21:36:53.0")
/** Column name DocStatus */
public static final String COLUMNNAME_DocStatus = "DocStatus";

@XendraTrl(Identifier="0649d28d-a401-e683-a5ad-eb44f164004f")
public static String es_PE_COLUMN_DocumentNo_Name="No. del Documento";

@XendraColumn(AD_Element_ID="e3ca6e28-702a-2722-d941-b2072a0de9cb",ColumnName="DocumentNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0649d28d-a401-e683-a5ad-eb44f164004f",
Synchronized="2020-03-03 21:36:53.0")
/** Column name DocumentNo */
public static final String COLUMNNAME_DocumentNo = "DocumentNo";

@XendraTrl(Identifier="eda7b517-6c01-8dc2-05c6-7cac570e1e7b")
public static String es_PE_COLUMN_DocumentType_Name="Tipo de Documento";

@XendraColumn(AD_Element_ID="c2cb07e3-e836-9e40-b0a6-af292c74b93f",ColumnName="DocumentType",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="eda7b517-6c01-8dc2-05c6-7cac570e1e7b",
Synchronized="2020-03-03 21:36:53.0")
/** Column name DocumentType */
public static final String COLUMNNAME_DocumentType = "DocumentType";

@XendraTrl(Identifier="94ae5a4d-7c75-f10b-266b-eb32ecfcc47d")
public static String es_PE_COLUMN_FeeAmt_Name="Total de Tarifa";

@XendraColumn(AD_Element_ID="9c6f3b0a-0969-f64c-7214-c03efd2f8112",ColumnName="FeeAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="94ae5a4d-7c75-f10b-266b-eb32ecfcc47d",
Synchronized="2020-03-03 21:36:53.0")
/** Column name FeeAmt */
public static final String COLUMNNAME_FeeAmt = "FeeAmt";

@XendraTrl(Identifier="1e0a7b02-d364-29b4-5db0-59b0546fcee8")
public static String es_PE_COLUMN_GrandTotal_Name="Gran Total";

@XendraColumn(AD_Element_ID="ffd614c2-6ff8-c9c6-71bf-44f369675711",ColumnName="GrandTotal",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1e0a7b02-d364-29b4-5db0-59b0546fcee8",
Synchronized="2020-03-03 21:36:53.0")
/** Column name GrandTotal */
public static final String COLUMNNAME_GrandTotal = "GrandTotal";

@XendraTrl(Identifier="f0c60d6c-65f5-f687-861d-39869c431b44")
public static String es_PE_COLUMN_InterestAmt_Name="Total del Interés";

@XendraColumn(AD_Element_ID="94999794-0276-6683-3826-7546d7f35a50",ColumnName="InterestAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f0c60d6c-65f5-f687-861d-39869c431b44",
Synchronized="2020-03-03 21:36:53.0")
/** Column name InterestAmt */
public static final String COLUMNNAME_InterestAmt = "InterestAmt";

@XendraTrl(Identifier="21cbc4b0-a81e-2333-2540-0de0c5349a2d")
public static String es_PE_COLUMN_IsAllocated_Name="Asignado";

@XendraColumn(AD_Element_ID="9e224a32-8f75-7921-819b-e891efaf4226",ColumnName="IsAllocated",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="21cbc4b0-a81e-2333-2540-0de0c5349a2d",
Synchronized="2020-03-03 21:36:53.0")
/** Column name IsAllocated */
public static final String COLUMNNAME_IsAllocated = "IsAllocated";

@XendraTrl(Identifier="9d297543-2f96-3b5f-d56b-0203c68609a6")
public static String es_PE_COLUMN_IsInDispute_Name="En Negociación";

@XendraColumn(AD_Element_ID="4d75c777-0a61-61e6-1a19-413ad176740e",ColumnName="IsInDispute",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9d297543-2f96-3b5f-d56b-0203c68609a6",
Synchronized="2020-03-03 21:36:53.0")
/** Column name IsInDispute */
public static final String COLUMNNAME_IsInDispute = "IsInDispute";

@XendraTrl(Identifier="d0dbcb6e-b4bc-513f-2001-79c9863462b0")
public static String es_PE_COLUMN_IsPaid_Name="Pagado";

@XendraColumn(AD_Element_ID="a4a2359a-ebb8-dca1-8077-df35f747271c",ColumnName="IsPaid",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d0dbcb6e-b4bc-513f-2001-79c9863462b0",
Synchronized="2020-03-03 21:36:53.0")
/** Column name IsPaid */
public static final String COLUMNNAME_IsPaid = "IsPaid";

@XendraTrl(Identifier="b5fc92a2-e129-659a-ba65-dfa1b9b4c68f")
public static String es_PE_COLUMN_IsSOTrx_Name="Transacción de Ventas";

@XendraColumn(AD_Element_ID="4084b69f-a51d-5676-4d8c-395a13e6b2df",ColumnName="IsSOTrx",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b5fc92a2-e129-659a-ba65-dfa1b9b4c68f",
Synchronized="2020-03-03 21:36:53.0")
/** Column name IsSOTrx */
public static final String COLUMNNAME_IsSOTrx = "IsSOTrx";

@XendraTrl(Identifier="d0211935-a371-32d1-10ee-e5585c7269f3")
public static String es_PE_COLUMN_M_PriceList_ID_Name="Lista de Precios";

@XendraColumn(AD_Element_ID="652afdd3-9ff1-082d-5831-6aad828e0e09",ColumnName="M_PriceList_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d0211935-a371-32d1-10ee-e5585c7269f3",
Synchronized="2020-03-03 21:36:53.0")
/** Column name M_PriceList_ID */
public static final String COLUMNNAME_M_PriceList_ID = "M_PriceList_ID";

@XendraTrl(Identifier="1c789c93-d41c-dfd0-2625-9d7d2b65355f")
public static String es_PE_COLUMN_PaymentTerm_Name="Término de pago";

@XendraColumn(AD_Element_ID="75701f55-d9c8-a0d9-161f-15f3673b8f24",ColumnName="PaymentTerm",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1c789c93-d41c-dfd0-2625-9d7d2b65355f",
Synchronized="2020-03-03 21:36:53.0")
/** Column name PaymentTerm */
public static final String COLUMNNAME_PaymentTerm = "PaymentTerm";

@XendraTrl(Identifier="dfe27cbd-d177-ab0e-5970-cff03f019cc5")
public static String es_PE_COLUMN_POReference_Name="Referencia de Orden de Socio";

@XendraColumn(AD_Element_ID="c3de7eea-53b7-a810-0260-1bcb037a2967",ColumnName="POReference",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="dfe27cbd-d177-ab0e-5970-cff03f019cc5",
Synchronized="2020-03-03 21:36:53.0")
/** Column name POReference */
public static final String COLUMNNAME_POReference = "POReference";

@XendraTrl(Identifier="197bab32-609c-8518-a974-4afc1ad5a7e2")
public static String es_PE_COLUMN_TenderType_Name="Tipo de Pago";

@XendraColumn(AD_Element_ID="a11558e0-04b1-3a6f-e53e-dd508c5dfc1c",ColumnName="TenderType",
AD_Reference_ID=17,AD_Reference_Value_ID="99d2e48b-10ce-666f-5675-0a893b4e12aa",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="197bab32-609c-8518-a974-4afc1ad5a7e2",Synchronized="2020-03-03 21:36:53.0")
/** Column name TenderType */
public static final String COLUMNNAME_TenderType = "TenderType";

@XendraTrl(Identifier="312ade3e-7ffd-b9a1-5428-6b0ec733f614")
public static String es_PE_COLUMN_TimesDunned_Name="Veces Realizado";

@XendraColumn(AD_Element_ID="abd9f37b-566d-4dfd-9dfb-0fa9954a81d1",ColumnName="TimesDunned",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="312ade3e-7ffd-b9a1-5428-6b0ec733f614",
Synchronized="2020-03-03 21:36:53.0")
/** Column name TimesDunned */
public static final String COLUMNNAME_TimesDunned = "TimesDunned";

@XendraTrl(Identifier="dfd5b789-eb86-2425-134a-8f76e55dd574")
public static String es_PE_COLUMN_TotalAmt_Name="Total Total";

@XendraColumn(AD_Element_ID="c413def6-435d-8c44-d0d5-90526042b2e0",ColumnName="TotalAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="dfd5b789-eb86-2425-134a-8f76e55dd574",
Synchronized="2020-03-03 21:36:53.0")
/** Column name TotalAmt */
public static final String COLUMNNAME_TotalAmt = "TotalAmt";

@XendraTrl(Identifier="beefe09c-bae0-58ab-d082-67a03c9f40f1")
public static String es_PE_COLUMN_TotalLines_Name="Total de Líneas";

@XendraColumn(AD_Element_ID="b1a5a695-e900-bbfd-4380-df29c5444a9a",ColumnName="TotalLines",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="beefe09c-bae0-58ab-d082-67a03c9f40f1",
Synchronized="2020-03-03 21:36:53.0")
/** Column name TotalLines */
public static final String COLUMNNAME_TotalLines = "TotalLines";

@XendraTrl(Identifier="66158447-c72c-3336-44c7-ee9b25779fee")
public static String es_PE_COLUMN_User1_ID_Name="Usuario 1";

@XendraColumn(AD_Element_ID="07453e74-aadd-d9c9-e543-837a6fdb3094",ColumnName="User1_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="5a2fe161-044f-67cb-3791-6d615980cabb",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="66158447-c72c-3336-44c7-ee9b25779fee",Synchronized="2020-03-03 21:36:53.0")
/** Column name User1_ID */
public static final String COLUMNNAME_User1_ID = "User1_ID";

@XendraTrl(Identifier="82ee782e-42df-ded8-6023-df0c9af73c7c")
public static String es_PE_COLUMN_User2_ID_Name="Usuario 2";

@XendraColumn(AD_Element_ID="1b668c90-6743-20a2-df62-576857d72c06",ColumnName="User2_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="6a357ab2-7bb6-fce4-ffee-8bdd855a77fc",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="82ee782e-42df-ded8-6023-df0c9af73c7c",Synchronized="2020-03-03 21:36:53.0")
/** Column name User2_ID */
public static final String COLUMNNAME_User2_ID = "User2_ID";
	@XendraView(Identifier="251fd17f-6fce-7396-10bd-6c871da27bdf",
Synchronized="2013-07-09 19:02:34.0",
Name="c_dunning_line_v",
Owner="xendra",
Extension="")
	public static final String Identifier = "251fd17f-6fce-7396-10bd-6c871da27bdf";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-07-09 19:02:34.0");
	sb.appendln("@Identifier=251fd17f-6fce-7396-10bd-6c871da27bdf");
	sb.appendln("@comment=Dunning Letter Lines");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT drl.ad_client_id, drl.ad_org_id, drl.isactive, drl.created, drl.createdby, drl.updated, drl.updatedby, 'en_US'::character varying AS ad_language, drl.c_dunningrunline_id, drl.c_dunningrunentry_id, drl.amt, drl.convertedamt, drl.daysdue, drl.timesdunned, drl.interestamt, drl.feeamt, drl.totalamt, drl.c_invoice_id, COALESCE(i.issotrx, p.isreceipt) AS issotrx, COALESCE(i.documentno, p.documentno) AS documentno, COALESCE(i.docstatus, p.docstatus) AS docstatus, COALESCE(i.dateinvoiced, p.datetrx) AS datetrx, COALESCE(i.c_doctype_id, p.c_doctype_id) AS c_doctype_id, COALESCE(dt.printname, dtp.printname) AS documenttype, COALESCE(i.description, p.description) AS description, COALESCE(i.c_currency_id, p.c_currency_id) AS c_currency_id, COALESCE(i.c_campaign_id, p.c_campaign_id) AS c_campaign_id, COALESCE(i.c_project_id, p.c_project_id) AS c_project_id, COALESCE(i.c_activity_id, p.c_activity_id) AS c_activity_id, COALESCE(i.user1_id, p.user1_id) AS user1_id, COALESCE(i.user2_id, p.user2_id) AS user2_id, COALESCE(i.dateacct, p.dateacct) AS dateacct, COALESCE(i.c_conversiontype_id, i.c_conversiontype_id) AS c_conversiontype_id, COALESCE(i.ad_orgtrx_id, p.ad_orgtrx_id) AS ad_orgtrx_id, i.poreference, i.dateordered, i.dateinvoiced, i.isindispute, pt.name AS paymentterm, i.c_charge_id, i.chargeamt, i.totallines, i.grandtotal, i.grandtotal AS amtinwords, i.m_pricelist_id, i.ispaid, p.isallocated, p.tendertype, p.discountamt FROM (((((c_dunningrunline drl LEFT JOIN c_invoice i ON ((drl.c_invoice_id = i.c_invoice_id))) LEFT JOIN c_doctype dt ON ((i.c_doctype_id = dt.c_doctype_id))) LEFT JOIN c_paymentterm pt ON ((i.c_paymentterm_id = pt.c_paymentterm_id))) LEFT JOIN c_payment p ON ((drl.c_payment_id = p.c_payment_id))) LEFT JOIN c_doctype dtp ON ((p.c_doctype_id = dtp.c_doctype_id)));");
	return sb.toString();
}
}
