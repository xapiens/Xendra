package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_C_dunning_header_v 
{
 
@XendraTable(Name="C_Dunning_Header_v",Description="Dunning Letter",Help="",
TableName="C_Dunning_Header_v",AccessLevel="3",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=0,
LoadSeq=150,IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=true,IsChangeLog=false,
IsView=true,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="0210ef8d-3bd9-46a1-1afa-d83946be2519",Synchronized="2017-08-16 12:36:29.0")
/** TableName=C_Dunning_Header_v */
public static final String Table_Name="C_Dunning_Header_v";

@XendraTrl(Identifier="fe95af64-f2ae-ca16-10a2-30d7fce0926e")
public static String es_PE_COLUMN_AD_Language_Name="Lenguaje";

@XendraColumn(AD_Element_ID="d542d9da-4627-0da8-89af-5797f22de434",ColumnName="AD_Language",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=5,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fe95af64-f2ae-ca16-10a2-30d7fce0926e",
Synchronized="2017-08-26 19:41:24.0")
/** Column name AD_Language */
public static final String COLUMNNAME_AD_Language = "AD_Language";

@XendraTrl(Identifier="88ea89b2-6819-85a9-5f0f-97a8347f6ffd")
public static String es_PE_COLUMN_Amt_Name="Total";

@XendraColumn(AD_Element_ID="42827f15-aceb-2f14-cc38-b4a7c6022136",ColumnName="Amt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="88ea89b2-6819-85a9-5f0f-97a8347f6ffd",
Synchronized="2017-08-26 19:41:24.0")
/** Column name Amt */
public static final String COLUMNNAME_Amt = "Amt";

@XendraTrl(Identifier="00a587c7-1bf8-eb49-f0ed-f5077610be56")
public static String es_PE_COLUMN_BPContactGreeting_Name="Saludo contacto del socio";

@XendraColumn(AD_Element_ID="9608741c-630d-2930-a3bc-a4a519ef9414",ColumnName="BPContactGreeting",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="00a587c7-1bf8-eb49-f0ed-f5077610be56",
Synchronized="2017-08-26 19:41:24.0")
/** Column name BPContactGreeting */
public static final String COLUMNNAME_BPContactGreeting = "BPContactGreeting";

@XendraTrl(Identifier="6c92c19d-2489-1c04-6b52-a60737e36f18")
public static String es_PE_COLUMN_BPGreeting_Name="Saludo socio";

@XendraColumn(AD_Element_ID="cea04988-9d86-a00b-7acc-d37746923aa9",ColumnName="BPGreeting",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6c92c19d-2489-1c04-6b52-a60737e36f18",
Synchronized="2017-08-26 19:41:24.0")
/** Column name BPGreeting */
public static final String COLUMNNAME_BPGreeting = "BPGreeting";

@XendraTrl(Identifier="4176b38e-65ac-c80f-6c2e-80354547ddd3")
public static String es_PE_COLUMN_BPTaxID_Name="RFC";

@XendraColumn(AD_Element_ID="90e9afca-7a20-4a24-163b-eb364d2a8328",ColumnName="BPTaxID",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4176b38e-65ac-c80f-6c2e-80354547ddd3",
Synchronized="2017-08-26 19:41:24.0")
/** Column name BPTaxID */
public static final String COLUMNNAME_BPTaxID = "BPTaxID";

@XendraTrl(Identifier="1fe33422-cd45-3d45-5482-cd6071c55aad")
public static String es_PE_COLUMN_BPValue_Name="Llave de Búsqueda de Socio";

@XendraColumn(AD_Element_ID="0d9db12b-0134-d1de-907a-41b078f69e71",ColumnName="BPValue",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1fe33422-cd45-3d45-5482-cd6071c55aad",
Synchronized="2017-08-26 19:41:24.0")
/** Column name BPValue */
public static final String COLUMNNAME_BPValue = "BPValue";

@XendraTrl(Identifier="0fbd85d2-46bb-847e-b4ae-625e52ae30c1")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Socio de Negocio";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0fbd85d2-46bb-847e-b4ae-625e52ae30c1",
Synchronized="2017-08-26 19:41:24.0")
/** Column name C_BPartner_ID */
public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
/** Column name C_DunningRunEntry_ID */
public static final String COLUMNNAME_C_DunningRunEntry_ID = "C_DunningRunEntry_ID";

@XendraTrl(Identifier="f6de7ba8-0b63-af9c-1d28-5077d61f4ef9")
public static String es_PE_COLUMN_C_DunningRun_ID_Name="Secuencial de Morosidad";

@XendraColumn(AD_Element_ID="5db17723-521d-2ae6-5eb2-8d12faa1417a",ColumnName="C_DunningRun_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f6de7ba8-0b63-af9c-1d28-5077d61f4ef9",
Synchronized="2017-08-26 19:41:24.0")
/** Column name C_DunningRun_ID */
public static final String COLUMNNAME_C_DunningRun_ID = "C_DunningRun_ID";

@XendraTrl(Identifier="c720ff5a-b09a-6a46-74b2-2e7cd230f54e")
public static String es_PE_COLUMN_C_Location_ID_Name="Localización / Dirección";

@XendraColumn(AD_Element_ID="e66e22a8-535b-2af2-6efb-aa600959a885",ColumnName="C_Location_ID",
AD_Reference_ID=21,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c720ff5a-b09a-6a46-74b2-2e7cd230f54e",
Synchronized="2017-08-26 19:41:24.0")
/** Column name C_Location_ID */
public static final String COLUMNNAME_C_Location_ID = "C_Location_ID";

@XendraTrl(Identifier="c4209819-24a3-84c0-d72f-354f69b7c46c")
public static String es_PE_COLUMN_ContactName_Name="Nombre del Contacto";

@XendraColumn(AD_Element_ID="09dc9eae-5f2a-936f-d673-7d269b49db5a",ColumnName="ContactName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c4209819-24a3-84c0-d72f-354f69b7c46c",
Synchronized="2017-08-26 19:41:24.0")
/** Column name ContactName */
public static final String COLUMNNAME_ContactName = "ContactName";

@XendraTrl(Identifier="051e5b01-9dda-658a-9505-ed4a67558408")
public static String es_PE_COLUMN_DocumentNote_Name="Nota de Documento";

@XendraColumn(AD_Element_ID="facce503-36ce-65e5-ad96-c872503feb2e",ColumnName="DocumentNote",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="051e5b01-9dda-658a-9505-ed4a67558408",
Synchronized="2017-08-26 19:41:24.0")
/** Column name DocumentNote */
public static final String COLUMNNAME_DocumentNote = "DocumentNote";

@XendraTrl(Identifier="12253993-baa3-5ee1-8fa9-98ba119fbed4")
public static String es_PE_COLUMN_DunningDate_Name="Fecha de Morosidad";

@XendraColumn(AD_Element_ID="4347cb24-107c-4f42-c933-9e198b56fdce",ColumnName="DunningDate",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="12253993-baa3-5ee1-8fa9-98ba119fbed4",
Synchronized="2017-08-26 19:41:24.0")
/** Column name DunningDate */
public static final String COLUMNNAME_DunningDate = "DunningDate";

@XendraTrl(Identifier="c2c8d55d-394f-32c5-a1dc-fade5ef5e9bb")
public static String es_PE_COLUMN_DUNS_Name="DUNS";

@XendraColumn(AD_Element_ID="c0901ff5-fdb0-6e42-8eb2-bcb69b132f2b",ColumnName="DUNS",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=11,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c2c8d55d-394f-32c5-a1dc-fade5ef5e9bb",
Synchronized="2017-08-26 19:41:24.0")
/** Column name DUNS */
public static final String COLUMNNAME_DUNS = "DUNS";

@XendraTrl(Identifier="024d88ce-ba08-e13d-8724-cebeca91daae")
public static String es_PE_COLUMN_NAICS_Name="NAICS/SIC";

@XendraColumn(AD_Element_ID="8b0097fc-5337-5edd-c357-34f7861b14b7",ColumnName="NAICS",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=6,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="024d88ce-ba08-e13d-8724-cebeca91daae",
Synchronized="2017-08-26 19:41:24.0")
/** Column name NAICS */
public static final String COLUMNNAME_NAICS = "NAICS";

@XendraTrl(Identifier="ab8499c7-3f5b-4edd-92d4-1c7c2928db58")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ab8499c7-3f5b-4edd-92d4-1c7c2928db58",
Synchronized="2017-08-26 19:41:24.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";

@XendraTrl(Identifier="9cdcb8ab-9d3b-9976-401a-f47038dfa846")
public static String es_PE_COLUMN_Name2_Name="Nombre 2";

@XendraColumn(AD_Element_ID="afe4eb43-576b-b3f0-6f41-91106bd959fd",ColumnName="Name2",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9cdcb8ab-9d3b-9976-401a-f47038dfa846",
Synchronized="2017-08-26 19:41:24.0")
/** Column name Name2 */
public static final String COLUMNNAME_Name2 = "Name2";

@XendraTrl(Identifier="e97ffdbf-7cf9-543b-9d1a-7d4935ebfdfc")
public static String es_PE_COLUMN_Note_Name="Nota";

@XendraColumn(AD_Element_ID="5fea140b-6b26-b544-b237-3b3fa64ae1c6",ColumnName="Note",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e97ffdbf-7cf9-543b-9d1a-7d4935ebfdfc",
Synchronized="2017-08-26 19:41:24.0")
/** Column name Note */
public static final String COLUMNNAME_Note = "Note";

@XendraTrl(Identifier="d45939b5-5d4a-fdac-e672-c8b88c84c463")
public static String es_PE_COLUMN_Org_Location_ID_Name="Localización de Org.";

@XendraColumn(AD_Element_ID="e5141e90-40af-c248-1a98-a24a709a1146",ColumnName="Org_Location_ID",
AD_Reference_ID=21,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d45939b5-5d4a-fdac-e672-c8b88c84c463",
Synchronized="2017-08-26 19:41:24.0")
/** Column name Org_Location_ID */
public static final String COLUMNNAME_Org_Location_ID = "Org_Location_ID";

@XendraTrl(Identifier="d7f4a74b-0856-21a8-6eef-a58a43f8e19b")
public static String es_PE_COLUMN_Phone_Name="Teléfono";

@XendraColumn(AD_Element_ID="4842df23-a82d-d921-7e1e-5869844caceb",ColumnName="Phone",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d7f4a74b-0856-21a8-6eef-a58a43f8e19b",
Synchronized="2017-08-26 19:41:24.0")
/** Column name Phone */
public static final String COLUMNNAME_Phone = "Phone";

@XendraTrl(Identifier="0541f95a-3876-e5f5-9876-e100bd8af3f2")
public static String es_PE_COLUMN_Postal_Name="Código Postal";

@XendraColumn(AD_Element_ID="b91ba048-ef4f-31e3-3865-fa3cff649df8",ColumnName="Postal",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0541f95a-3876-e5f5-9876-e100bd8af3f2",
Synchronized="2017-08-26 19:41:24.0")
/** Column name Postal */
public static final String COLUMNNAME_Postal = "Postal";

@XendraTrl(Identifier="f4ed9d49-45c1-f630-1c1b-6bde5835d388")
public static String es_PE_COLUMN_PrintName_Name="Nombre a ser Impreso";

@XendraColumn(AD_Element_ID="83f7d1df-e4e7-adff-3bda-43555a334585",ColumnName="PrintName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f4ed9d49-45c1-f630-1c1b-6bde5835d388",
Synchronized="2017-08-26 19:41:24.0")
/** Column name PrintName */
public static final String COLUMNNAME_PrintName = "PrintName";

@XendraTrl(Identifier="18e24c69-79f6-f4f9-fac1-a3fc7b711de0")
public static String es_PE_COLUMN_Qty_Name="Cantidad";

@XendraColumn(AD_Element_ID="c9d74a25-87c5-9592-5660-4f397607dad3",ColumnName="Qty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="18e24c69-79f6-f4f9-fac1-a3fc7b711de0",
Synchronized="2017-08-26 19:41:24.0")
/** Column name Qty */
public static final String COLUMNNAME_Qty = "Qty";

@XendraTrl(Identifier="b89ea731-faf8-c6ef-fe44-a28a71e3dd1e")
public static String es_PE_COLUMN_ReferenceNo_Name="No. de Referencia";

@XendraColumn(AD_Element_ID="87d37906-4977-97f1-29f1-85a654abe404",ColumnName="ReferenceNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b89ea731-faf8-c6ef-fe44-a28a71e3dd1e",
Synchronized="2017-08-26 19:41:24.0")
/** Column name ReferenceNo */
public static final String COLUMNNAME_ReferenceNo = "ReferenceNo";

@XendraTrl(Identifier="7fc05241-90ea-d97e-eec0-f07fecd74c78")
public static String es_PE_COLUMN_SalesRep_ID_Name="Agente Cía";

@XendraColumn(AD_Element_ID="197a9c3a-ff10-c291-d65f-5e05a36d3710",ColumnName="SalesRep_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="15251147-a1b6-4a83-a3a5-2d3ae7db69d9",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="7fc05241-90ea-d97e-eec0-f07fecd74c78",Synchronized="2017-08-26 19:41:24.0")
/** Column name SalesRep_ID */
public static final String COLUMNNAME_SalesRep_ID = "SalesRep_ID";

@XendraTrl(Identifier="c57ac336-91ce-a09c-4d8c-4910c70ee355")
public static String es_PE_COLUMN_SalesRep_Name_Name="Consultor de Ventas";

@XendraColumn(AD_Element_ID="11799fe0-e8c4-fd92-4a8d-73e2f5c087e5",ColumnName="SalesRep_Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c57ac336-91ce-a09c-4d8c-4910c70ee355",
Synchronized="2017-08-26 19:41:24.0")
/** Column name SalesRep_Name */
public static final String COLUMNNAME_SalesRep_Name = "SalesRep_Name";

@XendraTrl(Identifier="87cf4184-5cce-43ed-a4a5-9a5cda5e9a99")
public static String es_PE_COLUMN_TaxID_Name="RFC";

@XendraColumn(AD_Element_ID="e0a9d0f7-835b-4f80-4c13-bff62213e232",ColumnName="TaxID",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="87cf4184-5cce-43ed-a4a5-9a5cda5e9a99",
Synchronized="2017-08-26 19:41:24.0")
/** Column name TaxID */
public static final String COLUMNNAME_TaxID = "TaxID";

@XendraTrl(Identifier="4d98c87f-7b03-5340-ac02-0cc7a33b59ef")
public static String es_PE_COLUMN_Title_Name="Título";

@XendraColumn(AD_Element_ID="05a7b975-a2e2-1303-e323-2e3fdda7ebd3",ColumnName="Title",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4d98c87f-7b03-5340-ac02-0cc7a33b59ef",
Synchronized="2017-08-26 19:41:24.0")
/** Column name Title */
public static final String COLUMNNAME_Title = "Title";
	@XendraView(Identifier="0210ef8d-3bd9-46a1-1afa-d83946be2519",
Synchronized="2013-07-09 19:02:34.0",
Name="c_dunning_header_v",
Owner="xendra",
Extension="")
	public static final String Identifier = "0210ef8d-3bd9-46a1-1afa-d83946be2519";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-07-09 19:02:34.0");
	sb.appendln("@Identifier=0210ef8d-3bd9-46a1-1afa-d83946be2519");
	sb.appendln("@comment=Dunning Letter");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT dr.ad_client_id, dr.ad_org_id, dr.isactive, dr.created, dr.createdby, dr.updated, dr.updatedby, 'en_US'::character varying AS ad_language, dr.c_dunningrun_id, dre.c_dunningrunentry_id, dr.dunningdate, dl.printname, dl.note AS documentnote, dre.c_bpartner_id, bp.value AS bpvalue, bp.taxid AS bptaxid, bp.naics, bp.duns, oi.c_location_id AS org_location_id, oi.taxid, dre.salesrep_id, COALESCE(ubp.name, u.name) AS salesrep_name, bpg.greeting AS bpgreeting, bp.name, bp.name2, bpcg.greeting AS bpcontactgreeting, bpc.title, bpc.phone, NULLIF((bpc.name)::text, (bp.name)::text) AS contactname, bpl.c_location_id, bp.referenceno, ((l.postal)::text || (l.postal_add)::text) AS postal, dre.amt, dre.qty, dre.note FROM (((((((((((c_dunningrun dr JOIN c_dunninglevel dl ON ((dr.c_dunninglevel_id = dl.c_dunninglevel_id))) JOIN c_dunningrunentry dre ON ((dr.c_dunningrun_id = dre.c_dunningrun_id))) JOIN c_bpartner bp ON ((dre.c_bpartner_id = bp.c_bpartner_id))) LEFT JOIN c_greeting bpg ON ((bp.c_greeting_id = bpg.c_greeting_id))) JOIN c_bpartner_location bpl ON ((dre.c_bpartner_location_id = bpl.c_bpartner_location_id))) JOIN c_location l ON ((bpl.c_location_id = l.c_location_id))) LEFT JOIN ad_user bpc ON ((dre.ad_user_id = bpc.ad_user_id))) LEFT JOIN c_greeting bpcg ON ((bpc.c_greeting_id = bpcg.c_greeting_id))) JOIN ad_orginfo oi ON ((dr.ad_org_id = oi.ad_org_id))) LEFT JOIN ad_user u ON ((dre.salesrep_id = u.ad_user_id))) LEFT JOIN c_bpartner ubp ON ((u.c_bpartner_id = ubp.c_bpartner_id)));");
	return sb.toString();
}
}
