package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_C_invoice_header_v 
{
 
@XendraTable(Name="C_Invoice_Header_v",Description="Invoice Print View",Help="",
TableName="C_Invoice_Header_v",AccessLevel="1",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=0,
LoadSeq=150,IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=true,IsChangeLog=false,
IsView=true,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="4465b958-a42f-1cda-0109-1f3ab5603bdd",Synchronized="2017-08-16 12:36:37.0")
/** TableName=C_Invoice_Header_v */
public static final String Table_Name="C_Invoice_Header_v";

@XendraTrl(Identifier="91bc3684-9f4f-6773-a796-754305286fb0")
public static String es_PE_COLUMN_Address1_Name="Calle";

@XendraColumn(AD_Element_ID="25535414-be76-de81-69b4-106e2150a04a",ColumnName="Address1",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="91bc3684-9f4f-6773-a796-754305286fb0",
Synchronized="2017-08-26 19:41:26.0")
/** Column name Address1 */
public static final String COLUMNNAME_Address1 = "Address1";

@XendraTrl(Identifier="7cf35a17-9a30-71f2-7cf3-2fe6da6e1532")
public static String es_PE_COLUMN_Address2_Name="Colonía";

@XendraColumn(AD_Element_ID="a3cd6592-3282-7ed0-953e-16e24d22cc17",ColumnName="Address2",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7cf35a17-9a30-71f2-7cf3-2fe6da6e1532",
Synchronized="2017-08-26 19:41:26.0")
/** Column name Address2 */
public static final String COLUMNNAME_Address2 = "Address2";

@XendraTrl(Identifier="e6f70d99-def8-369f-8157-d096b0ad5171")
public static String es_PE_COLUMN_AD_Language_Name="Lenguaje";

@XendraColumn(AD_Element_ID="d542d9da-4627-0da8-89af-5797f22de434",ColumnName="AD_Language",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=5,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e6f70d99-def8-369f-8157-d096b0ad5171",
Synchronized="2017-08-26 19:41:26.0")
/** Column name AD_Language */
public static final String COLUMNNAME_AD_Language = "AD_Language";

@XendraTrl(Identifier="9119d7a9-621a-040a-5cfb-b646b632a300")
public static String es_PE_COLUMN_AmtInWords_Name="Cant. En Palabras";

@XendraColumn(AD_Element_ID="ddaf5eb4-cdab-73ef-508f-3ddb605f61aa",ColumnName="AmtInWords",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9119d7a9-621a-040a-5cfb-b646b632a300",
Synchronized="2017-08-26 19:41:26.0")
/** Column name AmtInWords */
public static final String COLUMNNAME_AmtInWords = "AmtInWords";

@XendraTrl(Identifier="c3941e4c-1d74-4c21-d01c-a5ff921d1a6a")
public static String es_PE_COLUMN_amtinwordstax_Name="amtinwordstax";

@XendraColumn(AD_Element_ID="a05b66f4-8b88-cc9b-0d07-6bd251e0cb34",ColumnName="amtinwordstax",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c3941e4c-1d74-4c21-d01c-a5ff921d1a6a",
Synchronized="2017-08-26 19:41:26.0")
/** Column name amtinwordstax */
public static final String COLUMNNAME_amtinwordstax = "amtinwordstax";

@XendraTrl(Identifier="d8ed2ded-e11d-d6ba-981d-4b038600c4f9")
public static String es_PE_COLUMN_BPContactGreeting_Name="Saludo contacto del socio";

@XendraColumn(AD_Element_ID="9608741c-630d-2930-a3bc-a4a519ef9414",ColumnName="BPContactGreeting",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d8ed2ded-e11d-d6ba-981d-4b038600c4f9",
Synchronized="2017-08-26 19:41:26.0")
/** Column name BPContactGreeting */
public static final String COLUMNNAME_BPContactGreeting = "BPContactGreeting";

@XendraTrl(Identifier="d21fbf1c-3ae5-c87f-c774-42b89b9d5cd6")
public static String es_PE_COLUMN_BPGreeting_Name="Saludo socio";

@XendraColumn(AD_Element_ID="cea04988-9d86-a00b-7acc-d37746923aa9",ColumnName="BPGreeting",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d21fbf1c-3ae5-c87f-c774-42b89b9d5cd6",
Synchronized="2017-08-26 19:41:26.0")
/** Column name BPGreeting */
public static final String COLUMNNAME_BPGreeting = "BPGreeting";

@XendraTrl(Identifier="1fe92893-432f-e21b-c26a-8afb11765b60")
public static String es_PE_COLUMN_BPTaxID_Name="RFC";

@XendraColumn(AD_Element_ID="90e9afca-7a20-4a24-163b-eb364d2a8328",ColumnName="BPTaxID",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1fe92893-432f-e21b-c26a-8afb11765b60",
Synchronized="2017-08-26 19:41:26.0")
/** Column name BPTaxID */
public static final String COLUMNNAME_BPTaxID = "BPTaxID";

@XendraTrl(Identifier="be1c033a-7ce6-73e6-b766-f9d67fda1219")
public static String es_PE_COLUMN_BPValue_Name="Llave de Búsqueda de Socio";

@XendraColumn(AD_Element_ID="0d9db12b-0134-d1de-907a-41b078f69e71",ColumnName="BPValue",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="be1c033a-7ce6-73e6-b766-f9d67fda1219",
Synchronized="2017-08-26 19:41:26.0")
/** Column name BPValue */
public static final String COLUMNNAME_BPValue = "BPValue";

@XendraTrl(Identifier="5728aab6-ea6d-e0e3-d432-e4d669b70c98")
public static String es_PE_COLUMN_C_Activity_ID_Name="Tipo de Gasto";

@XendraColumn(AD_Element_ID="bfeadbb3-d866-26e3-8eee-3e2fdf0ff753",ColumnName="C_Activity_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5728aab6-ea6d-e0e3-d432-e4d669b70c98",
Synchronized="2017-08-26 19:41:26.0")
/** Column name C_Activity_ID */
public static final String COLUMNNAME_C_Activity_ID = "C_Activity_ID";

@XendraTrl(Identifier="1eb0fa88-b665-cc9e-57f5-7e0e39cd383a")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Socio de Negocio";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1eb0fa88-b665-cc9e-57f5-7e0e39cd383a",
Synchronized="2017-08-26 19:41:26.0")
/** Column name C_BPartner_ID */
public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";

@XendraTrl(Identifier="4159e6b0-a238-17ad-5aa4-cb4be3f001c3")
public static String es_PE_COLUMN_C_Campaign_ID_Name="Campaña";

@XendraColumn(AD_Element_ID="6cf08e31-d355-ee38-9c0b-bee20b3ea5b6",ColumnName="C_Campaign_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4159e6b0-a238-17ad-5aa4-cb4be3f001c3",
Synchronized="2017-08-26 19:41:26.0")
/** Column name C_Campaign_ID */
public static final String COLUMNNAME_C_Campaign_ID = "C_Campaign_ID";

@XendraTrl(Identifier="8e3c24cf-7e49-3d42-27bd-71c966349332")
public static String es_PE_COLUMN_C_Charge_ID_Name="Cargo";

@XendraColumn(AD_Element_ID="d7e2fc48-a26e-4ded-ea44-fe15849a7883",ColumnName="C_Charge_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8e3c24cf-7e49-3d42-27bd-71c966349332",
Synchronized="2017-08-26 19:41:26.0")
/** Column name C_Charge_ID */
public static final String COLUMNNAME_C_Charge_ID = "C_Charge_ID";

@XendraTrl(Identifier="fb988e6f-2eee-f83a-d981-4a2b26adf6b0")
public static String es_PE_COLUMN_C_Currency_ID_Name="Moneda";

@XendraColumn(AD_Element_ID="8daec488-bca2-50fe-f9de-abf0cba2a34a",ColumnName="C_Currency_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fb988e6f-2eee-f83a-d981-4a2b26adf6b0",
Synchronized="2017-08-26 19:41:26.0")
/** Column name C_Currency_ID */
public static final String COLUMNNAME_C_Currency_ID = "C_Currency_ID";

@XendraTrl(Identifier="5f2a7f5c-08ee-fa69-a0d9-6a7cc35e0f53")
public static String es_PE_COLUMN_C_DocType_ID_Name="Tipo de Documento";

@XendraColumn(AD_Element_ID="099a4147-1a72-cdd0-81e0-8bdbc8c0b883",ColumnName="C_DocType_ID",
AD_Reference_ID=13,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5f2a7f5c-08ee-fa69-a0d9-6a7cc35e0f53",
Synchronized="2017-08-26 19:41:26.0")
/** Column name C_DocType_ID */
public static final String COLUMNNAME_C_DocType_ID = "C_DocType_ID";

@XendraTrl(Identifier="324e5059-1481-b49f-5f64-c92e9a578524")
public static String es_PE_COLUMN_ChargeAmt_Name="Total de Cargo";

@XendraColumn(AD_Element_ID="0700d401-01bb-8f19-a508-aa47155ba852",ColumnName="ChargeAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="324e5059-1481-b49f-5f64-c92e9a578524",
Synchronized="2017-08-26 19:41:26.0")
/** Column name ChargeAmt */
public static final String COLUMNNAME_ChargeAmt = "ChargeAmt";

@XendraTrl(Identifier="8e72c732-115f-4a49-21bd-bf8d076202ae")
public static String es_PE_COLUMN_C_Invoice_ID_Name="Factura";

@XendraColumn(AD_Element_ID="e526ea57-1bdf-9871-fd57-0df3c1f9dd42",ColumnName="C_Invoice_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8e72c732-115f-4a49-21bd-bf8d076202ae",
Synchronized="2017-08-26 19:41:26.0")
/** Column name C_Invoice_ID */
public static final String COLUMNNAME_C_Invoice_ID = "C_Invoice_ID";

@XendraTrl(Identifier="43cb18b9-0778-acfc-2d81-da0fc58a9396")
public static String es_PE_COLUMN_City_Name="Ciudad";

@XendraColumn(AD_Element_ID="968cd06b-d53d-9f3f-cbd5-d393f09a0264",ColumnName="City",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="43cb18b9-0778-acfc-2d81-da0fc58a9396",
Synchronized="2017-08-26 19:41:26.0")
/** Column name City */
public static final String COLUMNNAME_City = "City";

@XendraTrl(Identifier="9baec6d7-b94c-44f5-7c0b-d3f4eae9a7dd")
public static String es_PE_COLUMN_C_Location_ID_Name="Localización / Dirección";

@XendraColumn(AD_Element_ID="e66e22a8-535b-2af2-6efb-aa600959a885",ColumnName="C_Location_ID",
AD_Reference_ID=21,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9baec6d7-b94c-44f5-7c0b-d3f4eae9a7dd",
Synchronized="2017-08-26 19:41:26.0")
/** Column name C_Location_ID */
public static final String COLUMNNAME_C_Location_ID = "C_Location_ID";

@XendraTrl(Identifier="64d1dbaa-f14b-db88-4f35-fa6d5b06842c")
public static String es_PE_COLUMN_ContactName_Name="Nombre del Contacto";

@XendraColumn(AD_Element_ID="09dc9eae-5f2a-936f-d673-7d269b49db5a",ColumnName="ContactName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="64d1dbaa-f14b-db88-4f35-fa6d5b06842c",
Synchronized="2017-08-26 19:41:26.0")
/** Column name ContactName */
public static final String COLUMNNAME_ContactName = "ContactName";

@XendraTrl(Identifier="d9783a79-a9f7-e62a-5cf6-85f75579fb5f")
public static String es_PE_COLUMN_C_Order_ID_Name="Orden de Venta";

@XendraColumn(AD_Element_ID="cc846c60-90b8-6aad-9d07-b5d0c0328787",ColumnName="C_Order_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d9783a79-a9f7-e62a-5cf6-85f75579fb5f",
Synchronized="2017-08-26 19:41:26.0")
/** Column name C_Order_ID */
public static final String COLUMNNAME_C_Order_ID = "C_Order_ID";

@XendraTrl(Identifier="4d728e92-6c02-2afd-99e0-e54d806156f6")
public static String es_PE_COLUMN_CountryName_Name="País";

@XendraColumn(AD_Element_ID="2be32141-0ab9-4334-ff66-308e074f7617",ColumnName="CountryName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4d728e92-6c02-2afd-99e0-e54d806156f6",
Synchronized="2017-08-26 19:41:26.0")
/** Column name CountryName */
public static final String COLUMNNAME_CountryName = "CountryName";

@XendraTrl(Identifier="5c974e75-ff48-57e7-2b83-04dd1875ce74")
public static String es_PE_COLUMN_C_Project_ID_Name="Proyecto";

@XendraColumn(AD_Element_ID="16ff5dcc-9178-73dd-e618-e88bd79d573b",ColumnName="C_Project_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5c974e75-ff48-57e7-2b83-04dd1875ce74",
Synchronized="2017-08-26 19:41:26.0")
/** Column name C_Project_ID */
public static final String COLUMNNAME_C_Project_ID = "C_Project_ID";

@XendraTrl(Identifier="7e8eb8ab-d422-0a38-89c9-879707a5885a")
public static String es_PE_COLUMN_Currency_Desc_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7e8eb8ab-d422-0a38-89c9-879707a5885a",
Synchronized="2017-08-26 19:41:26.0")
/** Column name Currency_Desc */
public static final String COLUMNNAME_Currency_Desc = "Currency_Desc";

@XendraTrl(Identifier="d1e91cd3-ace6-a9ac-6ffa-d0681063def0")
public static String es_PE_COLUMN_CurSymbol_Name="Símbolo";

@XendraColumn(AD_Element_ID="a6544ce7-4bd1-7f2a-84da-823b8e61f86e",ColumnName="CurSymbol",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d1e91cd3-ace6-a9ac-6ffa-d0681063def0",
Synchronized="2017-08-26 19:41:26.0")
/** Column name CurSymbol */
public static final String COLUMNNAME_CurSymbol = "CurSymbol";

@XendraTrl(Identifier="eb7d40a4-2c95-4963-3473-6b0744d7b35c")
public static String es_PE_COLUMN_DateInvoiced_Name="Fecha de Facturación";

@XendraColumn(AD_Element_ID="5e3c1a65-f97d-82ed-a21c-bc730ca3c080",ColumnName="DateInvoiced",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="eb7d40a4-2c95-4963-3473-6b0744d7b35c",
Synchronized="2017-08-26 19:41:26.0")
/** Column name DateInvoiced */
public static final String COLUMNNAME_DateInvoiced = "DateInvoiced";

@XendraTrl(Identifier="712676a5-c8f9-08ec-61d0-b7047988a3d4")
public static String es_PE_COLUMN_DateOrdered_Name="Fecha de la Orden";

@XendraColumn(AD_Element_ID="c265ae59-eec5-5c6b-26ee-1090bf37ce26",ColumnName="DateOrdered",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="712676a5-c8f9-08ec-61d0-b7047988a3d4",
Synchronized="2017-08-26 19:41:26.0")
/** Column name DateOrdered */
public static final String COLUMNNAME_DateOrdered = "DateOrdered";

@XendraTrl(Identifier="78bebe93-25cd-e668-12c2-09b1ff290941")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="78bebe93-25cd-e668-12c2-09b1ff290941",
Synchronized="2017-08-26 19:41:26.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";

@XendraTrl(Identifier="153d2e16-c507-67a9-e132-158f53e10050")
public static String es_PE_COLUMN_DocStatus_Name="Estado del Documento";

@XendraColumn(AD_Element_ID="e73fa537-3438-bd01-dfd4-f0f080a28c55",ColumnName="DocStatus",
AD_Reference_ID=17,AD_Reference_Value_ID="7627125d-fefe-e6bc-bb7d-4a6c772172dc",AD_Val_Rule_ID="",
FieldLength=2,DefaultValue="DR",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="153d2e16-c507-67a9-e132-158f53e10050",Synchronized="2017-08-26 19:41:26.0")
/** Column name DocStatus */
public static final String COLUMNNAME_DocStatus = "DocStatus";

@XendraTrl(Identifier="3fc40c31-f31a-8af9-6d2a-c5aeeebadf5e")
public static String es_PE_COLUMN_DocumentNo_Name="No. del Documento";

@XendraColumn(AD_Element_ID="e3ca6e28-702a-2722-d941-b2072a0de9cb",ColumnName="DocumentNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3fc40c31-f31a-8af9-6d2a-c5aeeebadf5e",
Synchronized="2017-08-26 19:41:26.0")
/** Column name DocumentNo */
public static final String COLUMNNAME_DocumentNo = "DocumentNo";

@XendraTrl(Identifier="090268f9-b687-7d77-91b7-e15ba45035b9")
public static String es_PE_COLUMN_DocumentType_Name="Tipo de Documento";

@XendraColumn(AD_Element_ID="c2cb07e3-e836-9e40-b0a6-af292c74b93f",ColumnName="DocumentType",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="090268f9-b687-7d77-91b7-e15ba45035b9",
Synchronized="2017-08-26 19:41:26.0")
/** Column name DocumentType */
public static final String COLUMNNAME_DocumentType = "DocumentType";

@XendraTrl(Identifier="d7f8f70d-a459-886a-d0db-615abbcebedf")
public static String es_PE_COLUMN_DocumentTypeNote_Name="Nota del tipo de documento";

@XendraColumn(AD_Element_ID="6df999b2-5b9f-d1d9-ed95-56231279f820",ColumnName="DocumentTypeNote",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d7f8f70d-a459-886a-d0db-615abbcebedf",
Synchronized="2017-08-26 19:41:26.0")
/** Column name DocumentTypeNote */
public static final String COLUMNNAME_DocumentTypeNote = "DocumentTypeNote";

@XendraTrl(Identifier="679dc541-eb35-ea10-6c2d-e96fa7c24eb4")
public static String es_PE_COLUMN_DueDate_Name="Fecha de Vencimiento";

@XendraColumn(AD_Element_ID="37bdf028-bb21-2699-2840-6730e99633c6",ColumnName="DueDate",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="679dc541-eb35-ea10-6c2d-e96fa7c24eb4",
Synchronized="2017-08-26 19:41:26.0")
/** Column name DueDate */
public static final String COLUMNNAME_DueDate = "DueDate";

@XendraTrl(Identifier="6ef48e26-545e-bfde-5861-b5301bf32988")
public static String es_PE_COLUMN_DUNS_Name="DUNS";

@XendraColumn(AD_Element_ID="c0901ff5-fdb0-6e42-8eb2-bcb69b132f2b",ColumnName="DUNS",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=11,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6ef48e26-545e-bfde-5861-b5301bf32988",
Synchronized="2017-08-26 19:41:26.0")
/** Column name DUNS */
public static final String COLUMNNAME_DUNS = "DUNS";

@XendraTrl(Identifier="14c6ba7d-f1bd-f09a-0634-07c2d03271b2")
public static String es_PE_COLUMN_Fact_ID_Name="ID Asiento Contable (por documento)";

@XendraColumn(AD_Element_ID="20f6c8ee-0151-735b-7a03-2006e09d8eb0",ColumnName="Fact_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="14c6ba7d-f1bd-f09a-0634-07c2d03271b2",
Synchronized="2017-08-26 19:41:27.0")
/** Column name Fact_ID */
public static final String COLUMNNAME_Fact_ID = "Fact_ID";

@XendraTrl(Identifier="79d14a89-4622-2310-4e8b-9edef5649196")
public static String es_PE_COLUMN_GrandTotal_Name="Gran Total";

@XendraColumn(AD_Element_ID="ffd614c2-6ff8-c9c6-71bf-44f369675711",ColumnName="GrandTotal",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="79d14a89-4622-2310-4e8b-9edef5649196",
Synchronized="2017-08-26 19:41:27.0")
/** Column name GrandTotal */
public static final String COLUMNNAME_GrandTotal = "GrandTotal";

@XendraTrl(Identifier="9d1c8042-0881-a2c3-1fd6-53d197e4b8c7")
public static String es_PE_COLUMN_InOutsDocs_Name="inoutsdocs";

@XendraColumn(AD_Element_ID="a484f83a-025d-275c-7176-17dda1b63500",ColumnName="InOutsDocs",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2147483647,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="9d1c8042-0881-a2c3-1fd6-53d197e4b8c7",
Synchronized="2017-08-26 19:41:27.0")
/** Column name InOutsDocs */
public static final String COLUMNNAME_InOutsDocs = "InOutsDocs";

@XendraTrl(Identifier="968e119b-e4d9-d0a8-1e3a-b765ef8cc434")
public static String es_PE_COLUMN_IsPaid_Name="Pagado";

@XendraColumn(AD_Element_ID="a4a2359a-ebb8-dca1-8077-df35f747271c",ColumnName="IsPaid",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="968e119b-e4d9-d0a8-1e3a-b765ef8cc434",
Synchronized="2017-08-26 19:41:27.0")
/** Column name IsPaid */
public static final String COLUMNNAME_IsPaid = "IsPaid";

@XendraTrl(Identifier="6dc8f00c-0b09-6dbb-413d-0ee1068f3f8a")
public static String es_PE_COLUMN_IsSOTrx_Name="Transacción de Ventas";

@XendraColumn(AD_Element_ID="4084b69f-a51d-5676-4d8c-395a13e6b2df",ColumnName="IsSOTrx",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6dc8f00c-0b09-6dbb-413d-0ee1068f3f8a",
Synchronized="2017-08-26 19:41:27.0")
/** Column name IsSOTrx */
public static final String COLUMNNAME_IsSOTrx = "IsSOTrx";

@XendraTrl(Identifier="fdb6af08-2ffd-e4b3-5ac4-928c06ff65e4")
public static String es_PE_COLUMN_IsTaxIncluded_Name="Impuesto Incluido en el Precio";

@XendraColumn(AD_Element_ID="eb0a6d55-2fff-a462-20b8-744571a3fe60",ColumnName="IsTaxIncluded",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fdb6af08-2ffd-e4b3-5ac4-928c06ff65e4",
Synchronized="2017-08-26 19:41:27.0")
/** Column name IsTaxIncluded */
public static final String COLUMNNAME_IsTaxIncluded = "IsTaxIncluded";

@XendraTrl(Identifier="4f43b9de-9938-4a6a-f445-3e405b4fc78f")
public static String es_PE_COLUMN_M_PriceList_ID_Name="Lista de Precios";

@XendraColumn(AD_Element_ID="652afdd3-9ff1-082d-5831-6aad828e0e09",ColumnName="M_PriceList_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4f43b9de-9938-4a6a-f445-3e405b4fc78f",
Synchronized="2017-08-26 19:41:27.0")
/** Column name M_PriceList_ID */
public static final String COLUMNNAME_M_PriceList_ID = "M_PriceList_ID";

@XendraTrl(Identifier="64eed8fb-82d1-1cce-1933-b3a26649d26c")
public static String es_PE_COLUMN_NAICS_Name="NAICS/SIC";

@XendraColumn(AD_Element_ID="8b0097fc-5337-5edd-c357-34f7861b14b7",ColumnName="NAICS",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=6,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="64eed8fb-82d1-1cce-1933-b3a26649d26c",
Synchronized="2017-08-26 19:41:27.0")
/** Column name NAICS */
public static final String COLUMNNAME_NAICS = "NAICS";

@XendraTrl(Identifier="0611112e-38d2-b7ce-f11d-f81cbf2ab88e")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0611112e-38d2-b7ce-f11d-f81cbf2ab88e",
Synchronized="2017-08-26 19:41:27.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";

@XendraTrl(Identifier="c8d97067-5f55-573a-7475-e7f7c5dfff3c")
public static String es_PE_COLUMN_Name2_Name="Nombre 2";

@XendraColumn(AD_Element_ID="afe4eb43-576b-b3f0-6f41-91106bd959fd",ColumnName="Name2",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c8d97067-5f55-573a-7475-e7f7c5dfff3c",
Synchronized="2017-08-26 19:41:27.0")
/** Column name Name2 */
public static final String COLUMNNAME_Name2 = "Name2";

@XendraTrl(Identifier="8fbfc100-b274-02e9-f996-ca9ea20ec4a7")
public static String es_PE_COLUMN_NetAmt_Name="netamt";

@XendraColumn(AD_Element_ID="8c799284-5f55-ced2-1ed5-6eb215a55931",ColumnName="NetAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8fbfc100-b274-02e9-f996-ca9ea20ec4a7",
Synchronized="2017-08-26 19:41:27.0")
/** Column name NetAmt */
public static final String COLUMNNAME_NetAmt = "NetAmt";

@XendraTrl(Identifier="3f20fbdf-fdaa-0b1e-0815-7372464ac504")
public static String es_PE_COLUMN_Org_Location_ID_Name="Localización de Org.";

@XendraColumn(AD_Element_ID="e5141e90-40af-c248-1a98-a24a709a1146",ColumnName="Org_Location_ID",
AD_Reference_ID=21,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3f20fbdf-fdaa-0b1e-0815-7372464ac504",
Synchronized="2017-08-26 19:41:27.0")
/** Column name Org_Location_ID */
public static final String COLUMNNAME_Org_Location_ID = "Org_Location_ID";

@XendraTrl(Identifier="ee8910f6-e771-1a41-e7c8-2e366811cd81")
public static String es_PE_COLUMN_PaymentTerm_Name="Término de pago";

@XendraColumn(AD_Element_ID="75701f55-d9c8-a0d9-161f-15f3673b8f24",ColumnName="PaymentTerm",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ee8910f6-e771-1a41-e7c8-2e366811cd81",
Synchronized="2017-08-26 19:41:27.0")
/** Column name PaymentTerm */
public static final String COLUMNNAME_PaymentTerm = "PaymentTerm";

@XendraTrl(Identifier="1917d643-bece-fa8d-1dc4-68ed2ce1baa8")
public static String es_PE_COLUMN_PaymentTermNote_Name="Nota del Término de Pago";

@XendraColumn(AD_Element_ID="6dc13f7c-04a0-d8d5-98f5-946aefa73231",ColumnName="PaymentTermNote",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1917d643-bece-fa8d-1dc4-68ed2ce1baa8",
Synchronized="2017-08-26 19:41:27.0")
/** Column name PaymentTermNote */
public static final String COLUMNNAME_PaymentTermNote = "PaymentTermNote";

@XendraTrl(Identifier="e56751ba-a854-818d-34e4-61af44a2a39b")
public static String es_PE_COLUMN_Phone_Name="Teléfono";

@XendraColumn(AD_Element_ID="4842df23-a82d-d921-7e1e-5869844caceb",ColumnName="Phone",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e56751ba-a854-818d-34e4-61af44a2a39b",
Synchronized="2017-08-26 19:41:27.0")
/** Column name Phone */
public static final String COLUMNNAME_Phone = "Phone";

@XendraTrl(Identifier="cd3126f0-c7b6-1233-394f-2d67f4a2af3e")
public static String es_PE_COLUMN_POReference_Name="Referencia de Orden de Socio";

@XendraColumn(AD_Element_ID="c3de7eea-53b7-a810-0260-1bcb037a2967",ColumnName="POReference",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cd3126f0-c7b6-1233-394f-2d67f4a2af3e",
Synchronized="2017-08-26 19:41:27.0")
/** Column name POReference */
public static final String COLUMNNAME_POReference = "POReference";

@XendraTrl(Identifier="736326ce-f77b-3a70-b71f-c0533efda01f")
public static String es_PE_COLUMN_Postal_Name="Código Postal";

@XendraColumn(AD_Element_ID="b91ba048-ef4f-31e3-3865-fa3cff649df8",ColumnName="Postal",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="736326ce-f77b-3a70-b71f-c0533efda01f",
Synchronized="2017-08-26 19:41:27.0")
/** Column name Postal */
public static final String COLUMNNAME_Postal = "Postal";

@XendraTrl(Identifier="238e44e7-232d-461e-360f-ae761cfada1f")
public static String es_PE_COLUMN_Rate_Name="Rate";

@XendraColumn(AD_Element_ID="3eb861a4-ab06-c590-06e1-f57223b55231",ColumnName="Rate",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="238e44e7-232d-461e-360f-ae761cfada1f",
Synchronized="2017-08-26 19:41:27.0")
/** Column name Rate */
public static final String COLUMNNAME_Rate = "Rate";

@XendraTrl(Identifier="3ccc4f31-b3ed-d5ea-ed91-e97f39006eb1")
public static String es_PE_COLUMN_RefDocumentNo_Name="No. del Documento";

@XendraColumn(AD_Element_ID="e3ca6e28-702a-2722-d941-b2072a0de9cb",ColumnName="DocumentNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3ccc4f31-b3ed-d5ea-ed91-e97f39006eb1",
Synchronized="2017-08-26 19:41:27.0")
/** Column name RefDocumentNo */
public static final String COLUMNNAME_RefDocumentNo = "RefDocumentNo";

@XendraTrl(Identifier="4c9a269d-98e5-55ee-6ef2-ac13552f0d8c")
public static String es_PE_COLUMN_ReferenceNo_Name="No. de Referencia";

@XendraColumn(AD_Element_ID="87d37906-4977-97f1-29f1-85a654abe404",ColumnName="ReferenceNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4c9a269d-98e5-55ee-6ef2-ac13552f0d8c",
Synchronized="2017-08-26 19:41:27.0")
/** Column name ReferenceNo */
public static final String COLUMNNAME_ReferenceNo = "ReferenceNo";

@XendraTrl(Identifier="dcb7186e-3ed8-2852-b860-db828a034fe5")
public static String es_PE_COLUMN_Ref_Invoice_ID_Name="Factura";

@XendraColumn(AD_Element_ID="e526ea57-1bdf-9871-fd57-0df3c1f9dd42",ColumnName="C_Invoice_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="7fd6a4ea-911e-151b-68bf-3a86cc5f06e3",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="dcb7186e-3ed8-2852-b860-db828a034fe5",Synchronized="2017-08-26 19:41:27.0")
/** Column name Ref_Invoice_ID */
public static final String COLUMNNAME_Ref_Invoice_ID = "Ref_Invoice_ID";

@XendraTrl(Identifier="d6d0d39b-d55e-dac8-6af5-f59b24d724dc")
public static String es_PE_COLUMN_RefSerial_Name="Serie del Documento";

@XendraColumn(AD_Element_ID="56277733-3963-25db-320e-99e754ca1e9c",ColumnName="Serial",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d6d0d39b-d55e-dac8-6af5-f59b24d724dc",
Synchronized="2017-08-26 19:41:27.0")
/** Column name RefSerial */
public static final String COLUMNNAME_RefSerial = "RefSerial";

@XendraTrl(Identifier="37c0edde-cf15-6684-29b2-43c77c450429")
public static String es_PE_COLUMN_SalesRep_ID_Name="Agente Cía";

@XendraColumn(AD_Element_ID="197a9c3a-ff10-c291-d65f-5e05a36d3710",ColumnName="SalesRep_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="15251147-a1b6-4a83-a3a5-2d3ae7db69d9",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="37c0edde-cf15-6684-29b2-43c77c450429",Synchronized="2017-08-26 19:41:27.0")
/** Column name SalesRep_ID */
public static final String COLUMNNAME_SalesRep_ID = "SalesRep_ID";

@XendraTrl(Identifier="f64e8fb3-0fd6-151c-f57c-757e1db74fd0")
public static String es_PE_COLUMN_SalesRep_Name_Name="Consultor de Ventas";

@XendraColumn(AD_Element_ID="11799fe0-e8c4-fd92-4a8d-73e2f5c087e5",ColumnName="SalesRep_Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f64e8fb3-0fd6-151c-f57c-757e1db74fd0",
Synchronized="2017-08-26 19:41:27.0")
/** Column name SalesRep_Name */
public static final String COLUMNNAME_SalesRep_Name = "SalesRep_Name";

@XendraTrl(Identifier="49dd1526-aa5b-2d57-6ec2-912b73f0e76b")
public static String es_PE_COLUMN_Serial_Name="Serie del Documento";

@XendraColumn(AD_Element_ID="56277733-3963-25db-320e-99e754ca1e9c",ColumnName="Serial",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="49dd1526-aa5b-2d57-6ec2-912b73f0e76b",
Synchronized="2017-08-26 19:41:27.0")
/** Column name Serial */
public static final String COLUMNNAME_Serial = "Serial";

@XendraTrl(Identifier="39145956-76ec-cb71-83eb-a11476840c76")
public static String es_PE_COLUMN_Tax_Name="tax";

@XendraColumn(AD_Element_ID="0fb0148e-7b48-50d6-29a3-4199cb75c18d",ColumnName="Tax",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="39145956-76ec-cb71-83eb-a11476840c76",
Synchronized="2017-08-26 19:41:27.0")
/** Column name Tax */
public static final String COLUMNNAME_Tax = "Tax";

@XendraTrl(Identifier="12d96cdb-0270-2bd4-5bbd-528f75aaa5c1")
public static String es_PE_COLUMN_TaxAlias_Name="Tax Alias";

@XendraColumn(AD_Element_ID="31eceab6-8ef8-6542-3944-c20c06ae504c",ColumnName="TaxAlias",
AD_Reference_ID=17,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=3,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="12d96cdb-0270-2bd4-5bbd-528f75aaa5c1",
Synchronized="2017-08-26 19:41:27.0")
/** Column name TaxAlias */
public static final String COLUMNNAME_TaxAlias = "TaxAlias";

@XendraTrl(Identifier="3e446ad1-6cc5-eabb-1d64-51b116e64756")
public static String es_PE_COLUMN_TaxID_Name="RFC";

@XendraColumn(AD_Element_ID="e0a9d0f7-835b-4f80-4c13-bff62213e232",ColumnName="TaxID",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3e446ad1-6cc5-eabb-1d64-51b116e64756",
Synchronized="2017-08-26 19:41:27.0")
/** Column name TaxID */
public static final String COLUMNNAME_TaxID = "TaxID";

@XendraTrl(Identifier="e761b606-893a-08e8-b4c2-3c3734f6e745")
public static String es_PE_COLUMN_taxname_Name="taxname";

@XendraColumn(AD_Element_ID="1fc17bf9-4f7f-8dd5-b7a2-77a80a5aee7e",ColumnName="taxname",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e761b606-893a-08e8-b4c2-3c3734f6e745",
Synchronized="2017-08-26 19:41:27.0")
/** Column name taxname */
public static final String COLUMNNAME_taxname = "taxname";

@XendraTrl(Identifier="8092444e-8865-0348-9bad-1e2b9d6b05cf")
public static String es_PE_COLUMN_Title_Name="Título";

@XendraColumn(AD_Element_ID="05a7b975-a2e2-1303-e323-2e3fdda7ebd3",ColumnName="Title",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8092444e-8865-0348-9bad-1e2b9d6b05cf",
Synchronized="2017-08-26 19:41:27.0")
/** Column name Title */
public static final String COLUMNNAME_Title = "Title";

@XendraTrl(Identifier="0157cce2-0c80-7f69-f46e-41c15ed795e0")
public static String es_PE_COLUMN_TotalLines_Name="Total de Líneas";

@XendraColumn(AD_Element_ID="b1a5a695-e900-bbfd-4380-df29c5444a9a",ColumnName="TotalLines",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0157cce2-0c80-7f69-f46e-41c15ed795e0",
Synchronized="2017-08-26 19:41:27.0")
/** Column name TotalLines */
public static final String COLUMNNAME_TotalLines = "TotalLines";
	@XendraView(Identifier="4465b958-a42f-1cda-0109-1f3ab5603bdd",
Synchronized="2013-07-09 19:02:34.0",
Name="c_invoice_header_v",
Owner="xendra",
Extension="")
	public static final String Identifier = "4465b958-a42f-1cda-0109-1f3ab5603bdd";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-07-09 19:02:34.0");
	sb.appendln("@Identifier=4465b958-a42f-1cda-0109-1f3ab5603bdd");
	sb.appendln("@comment=Invoice Print View");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT i.ad_client_id, i.ad_org_id, i.isactive, i.created, i.createdby, i.updated, i.updatedby, 'en_US'::character varying AS ad_language, i.c_invoice_id, i.issotrx, i.serial, i.documentno, i.docstatus, i.c_doctype_id, i.c_bpartner_id, bp.value AS bpvalue, bp.taxid AS bptaxid, bp.naics, bp.duns, oi.c_location_id AS org_location_id, oi.taxid, dt.printname AS documenttype, dt.documentnote AS documenttypenote, i.c_order_id, i.salesrep_id, COALESCE(ubp.name, u.name) AS salesrep_name, i.dateinvoiced, bpg.greeting AS bpgreeting, bp.name, bp.name2, bpcg.greeting AS bpcontactgreeting, bpc.title, bpc.phone, NULLIF((bpc.name)::text, (bp.name)::text) AS contactname, bpl.c_location_id, bp.referenceno, ((l.postal)::text || (l.postal_add)::text) AS postal, i.description, i.poreference, i.dateordered, i.c_currency_id, pt.name AS paymentterm, pt.documentnote AS paymenttermnote, i.c_charge_id, i.chargeamt, i.totallines, i.grandtotal, i.grandtotal AS amtinwords, i.m_pricelist_id, i.istaxincluded, i.c_campaign_id, i.c_project_id, i.c_activity_id, i.ispaid, l.address1, l.address2, l.city, ctry.name AS countryname, cur.description AS currency_desc, cur.cursymbol, ref.serial AS refserial, ref.documentno AS refdocumentno, ref.c_invoice_id AS ref_invoice_id, paymenttermduedate(i.c_paymentterm_id, (i.dateinvoiced)::timestamp with time zone) AS duedate, i.fact_id, getnetamtbyinvoice(i.c_invoice_id) AS netamt, gettaxbyinvoice(i.c_invoice_id) AS tax, gettaxbyinvoice(i.c_invoice_id) AS amtinwordstax, getinoutbyinvoice(i.c_invoice_id) AS inoutsdocs, tax.taxalias, tax.rate, tax.name AS taxname FROM ((((((((((((((((c_invoice i JOIN c_doctype dt ON ((i.c_doctype_id = dt.c_doctype_id))) JOIN c_paymentterm pt ON ((i.c_paymentterm_id = pt.c_paymentterm_id))) JOIN c_bpartner bp ON ((i.c_bpartner_id = bp.c_bpartner_id))) LEFT JOIN c_greeting bpg ON ((bp.c_greeting_id = bpg.c_greeting_id))) JOIN c_bpartner_location bpl ON ((i.c_bpartner_location_id = bpl.c_bpartner_location_id))) JOIN c_location l ON ((bpl.c_location_id = l.c_location_id))) LEFT JOIN ad_user bpc ON ((i.ad_user_id = bpc.ad_user_id))) LEFT JOIN c_greeting bpcg ON ((bpc.c_greeting_id = bpcg.c_greeting_id))) JOIN ad_orginfo oi ON ((i.ad_org_id = oi.ad_org_id))) LEFT JOIN ad_user u ON ((i.salesrep_id = u.ad_user_id))) LEFT JOIN c_bpartner ubp ON ((u.c_bpartner_id = ubp.c_bpartner_id))) LEFT JOIN c_country ctry ON ((l.c_country_id = ctry.c_country_id))) JOIN c_currency cur ON ((i.c_currency_id = cur.c_currency_id))) LEFT JOIN c_invoice ref ON ((i.ref_invoice_id = ref.c_invoice_id))) JOIN c_invoicetax itax ON ((i.c_invoice_id = itax.c_invoice_id))) JOIN c_tax tax ON ((tax.c_tax_id = itax.c_tax_id)));");
	return sb.toString();
}
}
