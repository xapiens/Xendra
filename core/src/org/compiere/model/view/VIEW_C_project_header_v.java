package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_C_project_header_v 
{
 
@XendraTable(Name="C_Project_Header_v",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Project Print View",Help="",
TableName="C_Project_Header_v",AccessLevel="1",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=0,
LoadSeq=150,IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=true,IsChangeLog=false,
IsView=true,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="cf6a8b59-de37-e847-255f-1df77808cfb5",Synchronized="2020-03-03 21:37:32.0")
/** TableName=C_Project_Header_v */
public static final String Table_Name="C_Project_Header_v";

@XendraTrl(Identifier="95e4d953-999f-f1ec-e172-31973438d1bb")
public static String es_PE_COLUMN_AD_Language_Name="Lenguaje";

@XendraColumn(AD_Element_ID="d542d9da-4627-0da8-89af-5797f22de434",ColumnName="AD_Language",
AD_Reference_ID=18,AD_Reference_Value_ID="136e26cd-6ffa-f76c-1e63-cce5ed2025b9",AD_Val_Rule_ID="",
FieldLength=5,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="95e4d953-999f-f1ec-e172-31973438d1bb",Synchronized="2020-03-03 21:37:32.0")
/** Column name AD_Language */
public static final String COLUMNNAME_AD_Language = "AD_Language";

@XendraTrl(Identifier="2a786dd2-189c-69e6-89b7-723223c3c468")
public static String es_PE_COLUMN_BPContactGreeting_Name="Saludo contacto del socio";

@XendraColumn(AD_Element_ID="9608741c-630d-2930-a3bc-a4a519ef9414",ColumnName="BPContactGreeting",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2a786dd2-189c-69e6-89b7-723223c3c468",
Synchronized="2020-03-03 21:37:32.0")
/** Column name BPContactGreeting */
public static final String COLUMNNAME_BPContactGreeting = "BPContactGreeting";

@XendraTrl(Identifier="167cdec1-7f8d-9780-b440-90f4e98a4031")
public static String es_PE_COLUMN_BPGreeting_Name="Saludo socio";

@XendraColumn(AD_Element_ID="cea04988-9d86-a00b-7acc-d37746923aa9",ColumnName="BPGreeting",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="167cdec1-7f8d-9780-b440-90f4e98a4031",
Synchronized="2020-03-03 21:37:32.0")
/** Column name BPGreeting */
public static final String COLUMNNAME_BPGreeting = "BPGreeting";

@XendraTrl(Identifier="9a3274f0-2918-f38c-1e96-7cd99f0af27a")
public static String es_PE_COLUMN_BPTaxID_Name="RFC";

@XendraColumn(AD_Element_ID="90e9afca-7a20-4a24-163b-eb364d2a8328",ColumnName="BPTaxID",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9a3274f0-2918-f38c-1e96-7cd99f0af27a",
Synchronized="2020-03-03 21:37:32.0")
/** Column name BPTaxID */
public static final String COLUMNNAME_BPTaxID = "BPTaxID";

@XendraTrl(Identifier="78b540e5-eb96-4004-7fc8-8d2329f06a72")
public static String es_PE_COLUMN_BPValue_Name="Llave de Búsqueda de Socio";

@XendraColumn(AD_Element_ID="0d9db12b-0134-d1de-907a-41b078f69e71",ColumnName="BPValue",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="78b540e5-eb96-4004-7fc8-8d2329f06a72",
Synchronized="2020-03-03 21:37:32.0")
/** Column name BPValue */
public static final String COLUMNNAME_BPValue = "BPValue";

@XendraTrl(Identifier="9766eb21-8cb3-cfa8-8ae7-a97747f2876b")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Socio de Negocio";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9766eb21-8cb3-cfa8-8ae7-a97747f2876b",
Synchronized="2020-03-03 21:37:32.0")
/** Column name C_BPartner_ID */
public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";

@XendraTrl(Identifier="be9414d8-a4c1-4471-7e27-ee7f503eefcf")
public static String es_PE_COLUMN_C_Campaign_ID_Name="Campaña";

@XendraColumn(AD_Element_ID="6cf08e31-d355-ee38-9c0b-bee20b3ea5b6",ColumnName="C_Campaign_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="be9414d8-a4c1-4471-7e27-ee7f503eefcf",
Synchronized="2020-03-03 21:37:32.0")
/** Column name C_Campaign_ID */
public static final String COLUMNNAME_C_Campaign_ID = "C_Campaign_ID";

@XendraTrl(Identifier="51651018-585c-a058-ccdf-c2096b55776a")
public static String es_PE_COLUMN_C_Currency_ID_Name="Moneda";

@XendraColumn(AD_Element_ID="8daec488-bca2-50fe-f9de-abf0cba2a34a",ColumnName="C_Currency_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="51651018-585c-a058-ccdf-c2096b55776a",
Synchronized="2020-03-03 21:37:32.0")
/** Column name C_Currency_ID */
public static final String COLUMNNAME_C_Currency_ID = "C_Currency_ID";

@XendraTrl(Identifier="d13e1c46-aea1-2349-dd12-377e6e66bb33")
public static String es_PE_COLUMN_C_Location_ID_Name="Localización / Dirección";

@XendraColumn(AD_Element_ID="e66e22a8-535b-2af2-6efb-aa600959a885",ColumnName="C_Location_ID",
AD_Reference_ID=21,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d13e1c46-aea1-2349-dd12-377e6e66bb33",
Synchronized="2020-03-03 21:37:32.0")
/** Column name C_Location_ID */
public static final String COLUMNNAME_C_Location_ID = "C_Location_ID";

@XendraTrl(Identifier="52756149-41b7-3e63-c800-0c6ffc6209aa")
public static String es_PE_COLUMN_CommittedAmt_Name="Total Comprometido";

@XendraColumn(AD_Element_ID="f000c6dd-f023-d000-0be4-e67375a2a641",ColumnName="CommittedAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="52756149-41b7-3e63-c800-0c6ffc6209aa",
Synchronized="2020-03-03 21:37:32.0")
/** Column name CommittedAmt */
public static final String COLUMNNAME_CommittedAmt = "CommittedAmt";

@XendraTrl(Identifier="36346f17-fe49-fa43-a4f6-a418f044a836")
public static String es_PE_COLUMN_CommittedQty_Name="Cantidad Cometida";

@XendraColumn(AD_Element_ID="ca943d4f-7852-e710-d8eb-028f698c75a5",ColumnName="CommittedQty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="36346f17-fe49-fa43-a4f6-a418f044a836",
Synchronized="2020-03-03 21:37:32.0")
/** Column name CommittedQty */
public static final String COLUMNNAME_CommittedQty = "CommittedQty";

@XendraTrl(Identifier="647d7379-6997-9d1c-e1d9-5ff4624646c8")
public static String es_PE_COLUMN_ContactName_Name="Nombre del Contacto";

@XendraColumn(AD_Element_ID="09dc9eae-5f2a-936f-d673-7d269b49db5a",ColumnName="ContactName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="647d7379-6997-9d1c-e1d9-5ff4624646c8",
Synchronized="2020-03-03 21:37:32.0")
/** Column name ContactName */
public static final String COLUMNNAME_ContactName = "ContactName";

@XendraTrl(Identifier="dadecaf8-5bd6-c73b-98e3-c1487a908255")
public static String es_PE_COLUMN_C_Phase_ID_Name="Fase Estándar";

@XendraColumn(AD_Element_ID="3ef98f9c-ae28-3183-566b-a77d4b8d6048",ColumnName="C_Phase_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="dadecaf8-5bd6-c73b-98e3-c1487a908255",
Synchronized="2020-03-03 21:37:32.0")
/** Column name C_Phase_ID */
public static final String COLUMNNAME_C_Phase_ID = "C_Phase_ID";
/** Column name C_Project_ID */
public static final String COLUMNNAME_C_Project_ID = "C_Project_ID";

@XendraTrl(Identifier="fec5a6fe-2612-3b22-364c-6e162d03ca4a")
public static String es_PE_COLUMN_C_ProjectType_ID_Name="Tipo de Proyecto";

@XendraColumn(AD_Element_ID="f000bb9d-562b-51bf-8de1-feef472fc4a8",ColumnName="C_ProjectType_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fec5a6fe-2612-3b22-364c-6e162d03ca4a",
Synchronized="2020-03-03 21:37:32.0")
/** Column name C_ProjectType_ID */
public static final String COLUMNNAME_C_ProjectType_ID = "C_ProjectType_ID";

@XendraTrl(Identifier="1916f1c9-3400-e522-7a42-9943be6c4fa2")
public static String es_PE_COLUMN_DateContract_Name="Fecha del Contrato";

@XendraColumn(AD_Element_ID="ce3190cf-e72c-3977-d4ee-710171d76278",ColumnName="DateContract",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1916f1c9-3400-e522-7a42-9943be6c4fa2",
Synchronized="2020-03-03 21:37:32.0")
/** Column name DateContract */
public static final String COLUMNNAME_DateContract = "DateContract";

@XendraTrl(Identifier="e1cf9b61-b34d-6780-c06c-77727a9ac998")
public static String es_PE_COLUMN_DateFinish_Name="Fecha de Terminación";

@XendraColumn(AD_Element_ID="123012c4-c542-828c-e6d5-b2af9a985af9",ColumnName="DateFinish",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e1cf9b61-b34d-6780-c06c-77727a9ac998",
Synchronized="2020-03-03 21:37:32.0")
/** Column name DateFinish */
public static final String COLUMNNAME_DateFinish = "DateFinish";

@XendraTrl(Identifier="8152f93d-99b6-a427-97e6-2f25f0dfbd3d")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8152f93d-99b6-a427-97e6-2f25f0dfbd3d",
Synchronized="2020-03-03 21:37:32.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";

@XendraTrl(Identifier="1346439d-6580-a02f-bda3-e572db47f968")
public static String es_PE_COLUMN_DUNS_Name="DUNS";

@XendraColumn(AD_Element_ID="c0901ff5-fdb0-6e42-8eb2-bcb69b132f2b",ColumnName="DUNS",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=11,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1346439d-6580-a02f-bda3-e572db47f968",
Synchronized="2020-03-03 21:37:32.0")
/** Column name DUNS */
public static final String COLUMNNAME_DUNS = "DUNS";

@XendraTrl(Identifier="e429ff3d-600f-78db-804c-e191be6ae903")
public static String es_PE_COLUMN_InvoicedAmt_Name="Cuenta Facturada";

@XendraColumn(AD_Element_ID="e31ccacf-d322-b66d-1d03-702dced2cbb8",ColumnName="InvoicedAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e429ff3d-600f-78db-804c-e191be6ae903",
Synchronized="2020-03-03 21:37:32.0")
/** Column name InvoicedAmt */
public static final String COLUMNNAME_InvoicedAmt = "InvoicedAmt";

@XendraTrl(Identifier="b46f8403-ada4-7bb3-c4b9-fdec5f1d7cb1")
public static String es_PE_COLUMN_InvoicedQty_Name="Cantidad Facturada";

@XendraColumn(AD_Element_ID="2b11e63f-05c2-ba1b-c83e-4ba51253ea7f",ColumnName="InvoicedQty",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b46f8403-ada4-7bb3-c4b9-fdec5f1d7cb1",
Synchronized="2020-03-03 21:37:32.0")
/** Column name InvoicedQty */
public static final String COLUMNNAME_InvoicedQty = "InvoicedQty";

@XendraTrl(Identifier="adb9b414-8a3d-bd1e-56cd-23379db11367")
public static String es_PE_COLUMN_IsCommitCeiling_Name="Compromiso Límite";

@XendraColumn(AD_Element_ID="84c4bef6-505f-8908-6191-e90cf9f12db7",ColumnName="IsCommitCeiling",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="adb9b414-8a3d-bd1e-56cd-23379db11367",
Synchronized="2020-03-03 21:37:32.0")
/** Column name IsCommitCeiling */
public static final String COLUMNNAME_IsCommitCeiling = "IsCommitCeiling";

@XendraTrl(Identifier="983f16fe-3255-1e0a-703d-f3607cf7a11c")
public static String es_PE_COLUMN_IsCommitment_Name="Compromiso";

@XendraColumn(AD_Element_ID="e0c9e636-57f7-2a34-a052-ade381b66d1b",ColumnName="IsCommitment",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="983f16fe-3255-1e0a-703d-f3607cf7a11c",
Synchronized="2020-03-03 21:37:32.0")
/** Column name IsCommitment */
public static final String COLUMNNAME_IsCommitment = "IsCommitment";

@XendraTrl(Identifier="6e1cc095-dbea-7dfb-9d65-a9f061ba6f29")
public static String es_PE_COLUMN_IsSummary_Name="Entidad Acumulada";

@XendraColumn(AD_Element_ID="0ecd1d56-9e2b-8778-7b05-92730d811ad4",ColumnName="IsSummary",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6e1cc095-dbea-7dfb-9d65-a9f061ba6f29",
Synchronized="2020-03-03 21:37:32.0")
/** Column name IsSummary */
public static final String COLUMNNAME_IsSummary = "IsSummary";

@XendraTrl(Identifier="1928090b-7223-a921-dfff-f3c37be319bc")
public static String es_PE_COLUMN_M_PriceList_Version_ID_Name="Versión de Lista de Precios";

@XendraColumn(AD_Element_ID="6c31f4d5-58fe-0b61-33f1-e2549c3f35f6",
ColumnName="M_PriceList_Version_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="1928090b-7223-a921-dfff-f3c37be319bc",Synchronized="2020-03-03 21:37:32.0")
/** Column name M_PriceList_Version_ID */
public static final String COLUMNNAME_M_PriceList_Version_ID = "M_PriceList_Version_ID";

@XendraTrl(Identifier="8b17a666-a2fd-d138-1ba0-736e8324950b")
public static String es_PE_COLUMN_M_Warehouse_ID_Name="Almacén";

@XendraColumn(AD_Element_ID="402045cd-baa5-aeaf-b148-a921dffb7821",ColumnName="M_Warehouse_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8b17a666-a2fd-d138-1ba0-736e8324950b",
Synchronized="2020-03-03 21:37:32.0")
/** Column name M_Warehouse_ID */
public static final String COLUMNNAME_M_Warehouse_ID = "M_Warehouse_ID";

@XendraTrl(Identifier="97b9e5b4-086f-94f5-ad86-902937f2a232")
public static String es_PE_COLUMN_NAICS_Name="NAICS/SIC";

@XendraColumn(AD_Element_ID="8b0097fc-5337-5edd-c357-34f7861b14b7",ColumnName="NAICS",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=6,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="97b9e5b4-086f-94f5-ad86-902937f2a232",
Synchronized="2020-03-03 21:37:32.0")
/** Column name NAICS */
public static final String COLUMNNAME_NAICS = "NAICS";

@XendraTrl(Identifier="114b98a5-fab6-e092-de19-dd16342279b8")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="114b98a5-fab6-e092-de19-dd16342279b8",
Synchronized="2020-03-03 21:37:32.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";

@XendraTrl(Identifier="7cfa5968-890d-6cf9-8441-96cd9e33c7e9")
public static String es_PE_COLUMN_Name2_Name="Nombre 2";

@XendraColumn(AD_Element_ID="afe4eb43-576b-b3f0-6f41-91106bd959fd",ColumnName="Name2",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7cfa5968-890d-6cf9-8441-96cd9e33c7e9",
Synchronized="2020-03-03 21:37:32.0")
/** Column name Name2 */
public static final String COLUMNNAME_Name2 = "Name2";

@XendraTrl(Identifier="ef666522-a7c1-dcc3-cfe5-3d4457440138")
public static String es_PE_COLUMN_Note_Name="Nota";

@XendraColumn(AD_Element_ID="5fea140b-6b26-b544-b237-3b3fa64ae1c6",ColumnName="Note",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ef666522-a7c1-dcc3-cfe5-3d4457440138",
Synchronized="2020-03-03 21:37:32.0")
/** Column name Note */
public static final String COLUMNNAME_Note = "Note";

@XendraTrl(Identifier="7d830496-2bca-291d-2a02-831f04b47505")
public static String es_PE_COLUMN_Org_Location_ID_Name="Localización de Org.";

@XendraColumn(AD_Element_ID="e5141e90-40af-c248-1a98-a24a709a1146",ColumnName="Org_Location_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="69189951-7109-d2c7-f034-b4660d43b572",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="7d830496-2bca-291d-2a02-831f04b47505",Synchronized="2020-03-03 21:37:32.0")
/** Column name Org_Location_ID */
public static final String COLUMNNAME_Org_Location_ID = "Org_Location_ID";

@XendraTrl(Identifier="3206ce3e-c226-f7c7-04d6-534fa3399f10")
public static String es_PE_COLUMN_PaymentTerm_Name="Término de pago";

@XendraColumn(AD_Element_ID="75701f55-d9c8-a0d9-161f-15f3673b8f24",ColumnName="PaymentTerm",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3206ce3e-c226-f7c7-04d6-534fa3399f10",
Synchronized="2020-03-03 21:37:32.0")
/** Column name PaymentTerm */
public static final String COLUMNNAME_PaymentTerm = "PaymentTerm";

@XendraTrl(Identifier="f3121fea-ec36-00f4-ab4c-725013131ab3")
public static String es_PE_COLUMN_PaymentTermNote_Name="Nota del Término de Pago";

@XendraColumn(AD_Element_ID="6dc13f7c-04a0-d8d5-98f5-946aefa73231",ColumnName="PaymentTermNote",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f3121fea-ec36-00f4-ab4c-725013131ab3",
Synchronized="2020-03-03 21:37:32.0")
/** Column name PaymentTermNote */
public static final String COLUMNNAME_PaymentTermNote = "PaymentTermNote";

@XendraTrl(Identifier="ed529ac5-088f-143f-b0a6-be63cac67150")
public static String es_PE_COLUMN_Phone_Name="Teléfono";

@XendraColumn(AD_Element_ID="4842df23-a82d-d921-7e1e-5869844caceb",ColumnName="Phone",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ed529ac5-088f-143f-b0a6-be63cac67150",
Synchronized="2020-03-03 21:37:32.0")
/** Column name Phone */
public static final String COLUMNNAME_Phone = "Phone";

@XendraTrl(Identifier="86f8e72b-9db9-5aaa-61c7-1c1e9e07da01")
public static String es_PE_COLUMN_PlannedAmt_Name="Total Planeado";

@XendraColumn(AD_Element_ID="7d2e668d-1293-27b7-a5ff-85f836dc7388",ColumnName="PlannedAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="86f8e72b-9db9-5aaa-61c7-1c1e9e07da01",
Synchronized="2020-03-03 21:37:32.0")
/** Column name PlannedAmt */
public static final String COLUMNNAME_PlannedAmt = "PlannedAmt";

@XendraTrl(Identifier="4e49d7bf-ae45-4ae1-ad2b-071e5d1e5dd7")
public static String es_PE_COLUMN_PlannedMarginAmt_Name="Margen Planeado";

@XendraColumn(AD_Element_ID="413b1b88-7cf5-d00d-2f30-730014b2fce9",ColumnName="PlannedMarginAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4e49d7bf-ae45-4ae1-ad2b-071e5d1e5dd7",
Synchronized="2020-03-03 21:37:32.0")
/** Column name PlannedMarginAmt */
public static final String COLUMNNAME_PlannedMarginAmt = "PlannedMarginAmt";

@XendraTrl(Identifier="6f7acc37-6915-ac67-3bdf-6d82253bb0d2")
public static String es_PE_COLUMN_PlannedQty_Name="Cantidad Planeada";

@XendraColumn(AD_Element_ID="d4461654-1565-2b21-28c4-41673a75f16b",ColumnName="PlannedQty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6f7acc37-6915-ac67-3bdf-6d82253bb0d2",
Synchronized="2020-03-03 21:37:32.0")
/** Column name PlannedQty */
public static final String COLUMNNAME_PlannedQty = "PlannedQty";

@XendraTrl(Identifier="cc0809ab-0911-8e27-c533-68f1b4135108")
public static String es_PE_COLUMN_POReference_Name="Referencia de Orden de Socio";

@XendraColumn(AD_Element_ID="c3de7eea-53b7-a810-0260-1bcb037a2967",ColumnName="POReference",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cc0809ab-0911-8e27-c533-68f1b4135108",
Synchronized="2020-03-03 21:37:32.0")
/** Column name POReference */
public static final String COLUMNNAME_POReference = "POReference";

@XendraTrl(Identifier="c592091c-ded5-98d5-d014-ac0f7043b4fd")
public static String es_PE_COLUMN_ProjectBalanceAmt_Name="Balance del Proyecto";

@XendraColumn(AD_Element_ID="8a6387e4-15c1-1b85-4ece-473f6e2cbddd",ColumnName="ProjectBalanceAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c592091c-ded5-98d5-d014-ac0f7043b4fd",
Synchronized="2020-03-03 21:37:32.0")
/** Column name ProjectBalanceAmt */
public static final String COLUMNNAME_ProjectBalanceAmt = "ProjectBalanceAmt";

@XendraTrl(Identifier="b0058195-5ac1-6487-43db-1398fc53ffb9")
public static String es_PE_COLUMN_ProjectCategory_Name="Categoría del Proyecto";

@XendraColumn(AD_Element_ID="57d9003e-8bd3-6171-c498-5ddff97037fd",ColumnName="ProjectCategory",
AD_Reference_ID=17,AD_Reference_Value_ID="dd876d4c-6a7f-9d8e-4f7c-480645f3079a",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="b0058195-5ac1-6487-43db-1398fc53ffb9",Synchronized="2020-03-03 21:37:32.0")
/** Column name ProjectCategory */
public static final String COLUMNNAME_ProjectCategory = "ProjectCategory";

@XendraTrl(Identifier="342caa81-dc0f-62f9-2c1f-a3fd10740047")
public static String es_PE_COLUMN_ProjectName_Name="Proyecto";

@XendraColumn(AD_Element_ID="57141b31-594c-8c42-32db-d3fc5a246148",ColumnName="ProjectName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="342caa81-dc0f-62f9-2c1f-a3fd10740047",
Synchronized="2020-03-03 21:37:32.0")
/** Column name ProjectName */
public static final String COLUMNNAME_ProjectName = "ProjectName";

@XendraTrl(Identifier="3eb4cb48-262e-c98c-963c-459379eb6236")
public static String es_PE_COLUMN_ProjectPhaseName_Name="Fase del proyecto";

@XendraColumn(AD_Element_ID="bc38ad0c-31d5-0cce-c46e-d1844045f3ee",ColumnName="ProjectPhaseName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3eb4cb48-262e-c98c-963c-459379eb6236",
Synchronized="2020-03-03 21:37:32.0")
/** Column name ProjectPhaseName */
public static final String COLUMNNAME_ProjectPhaseName = "ProjectPhaseName";

@XendraTrl(Identifier="f6a1fae7-0d4c-de44-2182-8408fb3e4c4b")
public static String es_PE_COLUMN_ProjectTypeName_Name="Tipo de Proyecto";

@XendraColumn(AD_Element_ID="1c92df2a-b11a-c588-c8a3-934a66ee35d8",ColumnName="ProjectTypeName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f6a1fae7-0d4c-de44-2182-8408fb3e4c4b",
Synchronized="2020-03-03 21:37:32.0")
/** Column name ProjectTypeName */
public static final String COLUMNNAME_ProjectTypeName = "ProjectTypeName";

@XendraTrl(Identifier="6b57c132-ebaa-a902-3cd9-1b70b1ea50aa")
public static String es_PE_COLUMN_ReferenceNo_Name="No. de Referencia";

@XendraColumn(AD_Element_ID="87d37906-4977-97f1-29f1-85a654abe404",ColumnName="ReferenceNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6b57c132-ebaa-a902-3cd9-1b70b1ea50aa",
Synchronized="2020-03-03 21:37:32.0")
/** Column name ReferenceNo */
public static final String COLUMNNAME_ReferenceNo = "ReferenceNo";

@XendraTrl(Identifier="4b6f551e-c1dd-061f-2476-abc52292754c")
public static String es_PE_COLUMN_SalesRep_ID_Name="Agente Cía";

@XendraColumn(AD_Element_ID="197a9c3a-ff10-c291-d65f-5e05a36d3710",ColumnName="SalesRep_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="606fce88-e8f3-4df6-0617-746fb6a85b2b",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="4b6f551e-c1dd-061f-2476-abc52292754c",Synchronized="2020-03-03 21:37:32.0")
/** Column name SalesRep_ID */
public static final String COLUMNNAME_SalesRep_ID = "SalesRep_ID";

@XendraTrl(Identifier="7701cfa9-eee0-c094-c608-85fb8e8e82e1")
public static String es_PE_COLUMN_SalesRep_Name_Name="Consultor de Ventas";

@XendraColumn(AD_Element_ID="11799fe0-e8c4-fd92-4a8d-73e2f5c087e5",ColumnName="SalesRep_Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7701cfa9-eee0-c094-c608-85fb8e8e82e1",
Synchronized="2020-03-03 21:37:32.0")
/** Column name SalesRep_Name */
public static final String COLUMNNAME_SalesRep_Name = "SalesRep_Name";

@XendraTrl(Identifier="2e73b591-2a84-b5fd-d09e-25273bb513b7")
public static String es_PE_COLUMN_TaxID_Name="RFC";

@XendraColumn(AD_Element_ID="e0a9d0f7-835b-4f80-4c13-bff62213e232",ColumnName="TaxID",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2e73b591-2a84-b5fd-d09e-25273bb513b7",
Synchronized="2020-03-03 21:37:32.0")
/** Column name TaxID */
public static final String COLUMNNAME_TaxID = "TaxID";

@XendraTrl(Identifier="38d52ee4-dfdb-f905-7600-64e36fa71fa3")
public static String es_PE_COLUMN_Title_Name="Título";

@XendraColumn(AD_Element_ID="05a7b975-a2e2-1303-e323-2e3fdda7ebd3",ColumnName="Title",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="38d52ee4-dfdb-f905-7600-64e36fa71fa3",
Synchronized="2020-03-03 21:37:32.0")
/** Column name Title */
public static final String COLUMNNAME_Title = "Title";

@XendraTrl(Identifier="fe437306-f82f-b2d1-38e0-12fa8fcc53d2")
public static String es_PE_COLUMN_Value_Name="Clave de Búsqueda";

@XendraColumn(AD_Element_ID="e75e100c-9b41-a643-2cb3-46eeced683d8",ColumnName="Value",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fe437306-f82f-b2d1-38e0-12fa8fcc53d2",
Synchronized="2020-03-03 21:37:32.0")
/** Column name Value */
public static final String COLUMNNAME_Value = "Value";
	@XendraView(Identifier="cf6a8b59-de37-e847-255f-1df77808cfb5",
Synchronized="2013-07-09 19:02:34.0",
Name="c_project_header_v",
Owner="xendra",
Extension="")
	public static final String Identifier = "cf6a8b59-de37-e847-255f-1df77808cfb5";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-07-09 19:02:34.0");
	sb.appendln("@Identifier=cf6a8b59-de37-e847-255f-1df77808cfb5");
	sb.appendln("@comment=Project Print View");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT p.ad_client_id, p.ad_org_id, p.isactive, p.created, p.createdby, p.updated, p.updatedby, 'en_US'::character varying AS ad_language, p.c_project_id, p.value, p.name AS projectname, p.description, p.note, p.issummary, p.projectcategory, oi.c_location_id AS org_location_id, oi.taxid, p.c_projecttype_id, pjt.name AS projecttypename, p.c_phase_id, pjp.name AS projectphasename, p.salesrep_id, COALESCE(ubp.name, u.name) AS salesrep_name, p.c_bpartner_id, bp.value AS bpvalue, bp.taxid AS bptaxid, bp.naics, bp.duns, bpg.greeting AS bpgreeting, bp.name, bp.name2, bpcg.greeting AS bpcontactgreeting, bpc.title, bpc.phone, NULLIF((bpc.name)::text, (bp.name)::text) AS contactname, bpl.c_location_id, bp.referenceno, pt.name AS paymentterm, pt.documentnote AS paymenttermnote, p.poreference, p.c_currency_id, p.m_pricelist_version_id, p.c_campaign_id, p.plannedamt, p.plannedqty, p.plannedmarginamt, p.invoicedamt, p.invoicedqty, p.projectbalanceamt, p.iscommitment, p.committedamt, p.committedqty, p.datecontract, p.datefinish, p.iscommitceiling, p.m_warehouse_id FROM (((((((((((c_project p LEFT JOIN c_bpartner bp ON ((p.c_bpartner_id = bp.c_bpartner_id))) JOIN ad_orginfo oi ON ((p.ad_org_id = oi.ad_org_id))) LEFT JOIN c_projecttype pjt ON ((p.c_projecttype_id = pjt.c_projecttype_id))) LEFT JOIN c_phase pjp ON ((p.c_phase_id = pjp.c_phase_id))) LEFT JOIN ad_user u ON ((p.salesrep_id = u.ad_user_id))) LEFT JOIN c_bpartner ubp ON ((u.c_bpartner_id = ubp.c_bpartner_id))) LEFT JOIN c_greeting bpg ON ((bp.c_greeting_id = bpg.c_greeting_id))) LEFT JOIN ad_user bpc ON ((p.ad_user_id = bpc.ad_user_id))) LEFT JOIN c_greeting bpcg ON ((bpc.c_greeting_id = bpcg.c_greeting_id))) LEFT JOIN c_bpartner_location bpl ON ((p.c_bpartner_location_id = bpl.c_bpartner_location_id))) LEFT JOIN c_paymentterm pt ON ((p.c_paymentterm_id = pt.c_paymentterm_id)));");
	return sb.toString();
}
}
