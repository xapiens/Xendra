package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_C_payselection_check_v 
{
 
@XendraTable(Name="C_PaySelection_Check_v",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Check Print View",Help="",
TableName="C_PaySelection_Check_v",AccessLevel="1",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=0,
LoadSeq=150,IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=true,IsChangeLog=false,
IsView=true,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="e1201fd2-c940-e36d-9123-a03ea3856edd",Synchronized="2020-03-03 21:37:25.0")
/** TableName=C_PaySelection_Check_v */
public static final String Table_Name="C_PaySelection_Check_v";

@XendraTrl(Identifier="b7390fec-8ae0-078a-f341-fb4194bd6125")
public static String es_PE_COLUMN_AD_Language_Name="Lenguaje";

@XendraColumn(AD_Element_ID="d542d9da-4627-0da8-89af-5797f22de434",ColumnName="AD_Language",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=5,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b7390fec-8ae0-078a-f341-fb4194bd6125",
Synchronized="2020-03-03 21:37:24.0")
/** Column name AD_Language */
public static final String COLUMNNAME_AD_Language = "AD_Language";

@XendraTrl(Identifier="d8350512-4178-0179-8558-6642eb0fd7b9")
public static String es_PE_COLUMN_Alias_Name="Alias";

@XendraColumn(AD_Element_ID="eb2b55b1-1094-cce9-62c7-fbcb31313519",ColumnName="Alias",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d8350512-4178-0179-8558-6642eb0fd7b9",
Synchronized="2020-03-03 21:37:24.0")
/** Column name Alias */
public static final String COLUMNNAME_Alias = "Alias";

@XendraTrl(Identifier="8900cf88-0474-8664-17b1-10c79b7c51f7")
public static String es_PE_COLUMN_AmtInWords_Name="Cant. En Palabras";

@XendraColumn(AD_Element_ID="ddaf5eb4-cdab-73ef-508f-3ddb605f61aa",ColumnName="AmtInWords",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8900cf88-0474-8664-17b1-10c79b7c51f7",
Synchronized="2020-03-03 21:37:24.0")
/** Column name AmtInWords */
public static final String COLUMNNAME_AmtInWords = "AmtInWords";

@XendraTrl(Identifier="00dd0d49-0fdc-695e-4129-09acfdeb61ea")
public static String es_PE_COLUMN_BPGreeting_Name="Saludo socio";

@XendraColumn(AD_Element_ID="cea04988-9d86-a00b-7acc-d37746923aa9",ColumnName="BPGreeting",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="00dd0d49-0fdc-695e-4129-09acfdeb61ea",
Synchronized="2020-03-03 21:37:24.0")
/** Column name BPGreeting */
public static final String COLUMNNAME_BPGreeting = "BPGreeting";

@XendraTrl(Identifier="1bb319e0-7645-f8a3-fbd5-6ec8beebbab9")
public static String es_PE_COLUMN_BPTaxID_Name="RFC";

@XendraColumn(AD_Element_ID="90e9afca-7a20-4a24-163b-eb364d2a8328",ColumnName="BPTaxID",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1bb319e0-7645-f8a3-fbd5-6ec8beebbab9",
Synchronized="2020-03-03 21:37:24.0")
/** Column name BPTaxID */
public static final String COLUMNNAME_BPTaxID = "BPTaxID";

@XendraTrl(Identifier="7bc13e5d-31ef-9ea3-d9cc-c38908e0afbd")
public static String es_PE_COLUMN_BPValue_Name="Llave de Búsqueda de Socio";

@XendraColumn(AD_Element_ID="0d9db12b-0134-d1de-907a-41b078f69e71",ColumnName="BPValue",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7bc13e5d-31ef-9ea3-d9cc-c38908e0afbd",
Synchronized="2020-03-03 21:37:24.0")
/** Column name BPValue */
public static final String COLUMNNAME_BPValue = "BPValue";

@XendraTrl(Identifier="e6ad3d0f-f455-d5a2-5470-9e0541cc265a")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Socio de Negocio";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e6ad3d0f-f455-d5a2-5470-9e0541cc265a",
Synchronized="2020-03-03 21:37:24.0")
/** Column name C_BPartner_ID */
public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";

@XendraTrl(Identifier="bfc08e3c-7233-23a1-ac76-32ab9a037e30")
public static String es_PE_COLUMN_C_DocType_ID_Name="Tipo de Documento";

@XendraColumn(AD_Element_ID="099a4147-1a72-cdd0-81e0-8bdbc8c0b883",ColumnName="C_DocType_ID",
AD_Reference_ID=13,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bfc08e3c-7233-23a1-ac76-32ab9a037e30",
Synchronized="2020-03-03 21:37:24.0")
/** Column name C_DocType_ID */
public static final String COLUMNNAME_C_DocType_ID = "C_DocType_ID";

@XendraTrl(Identifier="1cee6c74-7c24-5d5a-d2fc-3f44ed132883")
public static String es_PE_COLUMN_C_Location_ID_Name="Localización / Dirección";

@XendraColumn(AD_Element_ID="e66e22a8-535b-2af2-6efb-aa600959a885",ColumnName="C_Location_ID",
AD_Reference_ID=21,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1cee6c74-7c24-5d5a-d2fc-3f44ed132883",
Synchronized="2020-03-03 21:37:25.0")
/** Column name C_Location_ID */
public static final String COLUMNNAME_C_Location_ID = "C_Location_ID";
/** Column name C_PaySelectionCheck_ID */
public static final String COLUMNNAME_C_PaySelectionCheck_ID = "C_PaySelectionCheck_ID";

@XendraTrl(Identifier="dfdd021a-f3e9-084a-3bcf-ae044d882b4c")
public static String es_PE_COLUMN_C_PaySelection_ID_Name="Selección de Pago";

@XendraColumn(AD_Element_ID="79f02f46-d5fc-1851-93df-8e77a06c5431",ColumnName="C_PaySelection_ID",
AD_Reference_ID=13,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="dfdd021a-f3e9-084a-3bcf-ae044d882b4c",
Synchronized="2020-03-03 21:37:25.0")
/** Column name C_PaySelection_ID */
public static final String COLUMNNAME_C_PaySelection_ID = "C_PaySelection_ID";

@XendraTrl(Identifier="aa7dc50f-2316-5baa-73d3-6a43f3c6f87d")
public static String es_PE_COLUMN_DeferredDate_Name="DeferredDate";

@XendraColumn(AD_Element_ID="3b5c426e-3ab0-925f-c1c8-045daa0a5b58",ColumnName="DeferredDate",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="aa7dc50f-2316-5baa-73d3-6a43f3c6f87d",
Synchronized="2020-03-03 21:37:25.0")
/** Column name DeferredDate */
public static final String COLUMNNAME_DeferredDate = "DeferredDate";

@XendraTrl(Identifier="2e3ae2de-26dd-fef5-82ce-e55fe601667b")
public static String es_PE_COLUMN_DocumentNo_Name="No. del Documento";

@XendraColumn(AD_Element_ID="e3ca6e28-702a-2722-d941-b2072a0de9cb",ColumnName="DocumentNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2e3ae2de-26dd-fef5-82ce-e55fe601667b",
Synchronized="2020-03-03 21:37:25.0")
/** Column name DocumentNo */
public static final String COLUMNNAME_DocumentNo = "DocumentNo";

@XendraTrl(Identifier="59cefb5d-bd13-4005-fdda-4ca940e59d69")
public static String es_PE_COLUMN_DUNS_Name="DUNS";

@XendraColumn(AD_Element_ID="c0901ff5-fdb0-6e42-8eb2-bcb69b132f2b",ColumnName="DUNS",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=11,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="59cefb5d-bd13-4005-fdda-4ca940e59d69",
Synchronized="2020-03-03 21:37:25.0")
/** Column name DUNS */
public static final String COLUMNNAME_DUNS = "DUNS";

@XendraTrl(Identifier="a188eaf5-daf1-2b56-930f-0004fa17a9e2")
public static String es_PE_COLUMN_NAICS_Name="NAICS/SIC";

@XendraColumn(AD_Element_ID="8b0097fc-5337-5edd-c357-34f7861b14b7",ColumnName="NAICS",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=6,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a188eaf5-daf1-2b56-930f-0004fa17a9e2",
Synchronized="2020-03-03 21:37:25.0")
/** Column name NAICS */
public static final String COLUMNNAME_NAICS = "NAICS";

@XendraTrl(Identifier="8a4e4c73-bb80-ccab-28b8-70ec9885772d")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8a4e4c73-bb80-ccab-28b8-70ec9885772d",
Synchronized="2020-03-03 21:37:25.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";

@XendraTrl(Identifier="cd7269ea-75f4-c864-c2a6-3448ddab5cf1")
public static String es_PE_COLUMN_Name2_Name="Nombre 2";

@XendraColumn(AD_Element_ID="afe4eb43-576b-b3f0-6f41-91106bd959fd",ColumnName="Name2",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cd7269ea-75f4-c864-c2a6-3448ddab5cf1",
Synchronized="2020-03-03 21:37:25.0")
/** Column name Name2 */
public static final String COLUMNNAME_Name2 = "Name2";

@XendraTrl(Identifier="f9649766-544d-4546-3d1c-80d49843d39b")
public static String es_PE_COLUMN_Org_Location_ID_Name="Localización de Org.";

@XendraColumn(AD_Element_ID="e5141e90-40af-c248-1a98-a24a709a1146",ColumnName="Org_Location_ID",
AD_Reference_ID=21,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f9649766-544d-4546-3d1c-80d49843d39b",
Synchronized="2020-03-03 21:37:25.0")
/** Column name Org_Location_ID */
public static final String COLUMNNAME_Org_Location_ID = "Org_Location_ID";

@XendraTrl(Identifier="6521ce5b-45f9-6942-eb0a-87ecf4f65613")
public static String es_PE_COLUMN_PayAmt_Name="Total del Pago";

@XendraColumn(AD_Element_ID="9e9a0ba1-2d71-67e7-e0f1-0309fd537c8b",ColumnName="PayAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6521ce5b-45f9-6942-eb0a-87ecf4f65613",
Synchronized="2020-03-03 21:37:25.0")
/** Column name PayAmt */
public static final String COLUMNNAME_PayAmt = "PayAmt";

@XendraTrl(Identifier="d04670b7-1f94-4b5e-28ea-5272e5fd142b")
public static String es_PE_COLUMN_PayDate_Name="Fecha de Pago";

@XendraColumn(AD_Element_ID="02e177f7-1ba9-0c09-c018-450de6d5502d",ColumnName="PayDate",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d04670b7-1f94-4b5e-28ea-5272e5fd142b",
Synchronized="2020-03-03 21:37:25.0")
/** Column name PayDate */
public static final String COLUMNNAME_PayDate = "PayDate";

@XendraTrl(Identifier="7f654ab7-d76b-8617-3969-5cf085de9439")
public static String es_PE_COLUMN_PaymentRule_Name="Regla de Pago";

@XendraColumn(AD_Element_ID="5074db21-c657-2d23-63dc-80f0c5f2d4cc",ColumnName="PaymentRule",
AD_Reference_ID=17,AD_Reference_Value_ID="ac003b85-a929-cc48-3def-1a8f7b1adc7b",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="7f654ab7-d76b-8617-3969-5cf085de9439",Synchronized="2020-03-03 21:37:25.0")
/** Column name PaymentRule */
public static final String COLUMNNAME_PaymentRule = "PaymentRule";

@XendraTrl(Identifier="d9512a46-b47c-5b9f-f947-68e47aa2055a")
public static String es_PE_COLUMN_POReference_Name="Referencia de Orden de Socio";

@XendraColumn(AD_Element_ID="c3de7eea-53b7-a810-0260-1bcb037a2967",ColumnName="POReference",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d9512a46-b47c-5b9f-f947-68e47aa2055a",
Synchronized="2020-03-03 21:37:25.0")
/** Column name POReference */
public static final String COLUMNNAME_POReference = "POReference";

@XendraTrl(Identifier="b6dcc6a9-c551-7ee2-30fc-ee104e4f8749")
public static String es_PE_COLUMN_Qty_Name="Cantidad";

@XendraColumn(AD_Element_ID="c9d74a25-87c5-9592-5660-4f397607dad3",ColumnName="Qty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b6dcc6a9-c551-7ee2-30fc-ee104e4f8749",
Synchronized="2020-03-03 21:37:25.0")
/** Column name Qty */
public static final String COLUMNNAME_Qty = "Qty";

@XendraTrl(Identifier="8cab4f4e-5cea-030d-acd0-7da2a7a1d5ca")
public static String es_PE_COLUMN_ReferenceNo_Name="No. de Referencia";

@XendraColumn(AD_Element_ID="87d37906-4977-97f1-29f1-85a654abe404",ColumnName="ReferenceNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8cab4f4e-5cea-030d-acd0-7da2a7a1d5ca",
Synchronized="2020-03-03 21:37:25.0")
/** Column name ReferenceNo */
public static final String COLUMNNAME_ReferenceNo = "ReferenceNo";

@XendraTrl(Identifier="7b8f9569-a5ea-bf1a-31cf-03f339531709")
public static String es_PE_COLUMN_TaxID_Name="RFC";

@XendraColumn(AD_Element_ID="e0a9d0f7-835b-4f80-4c13-bff62213e232",ColumnName="TaxID",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7b8f9569-a5ea-bf1a-31cf-03f339531709",
Synchronized="2020-03-03 21:37:25.0")
/** Column name TaxID */
public static final String COLUMNNAME_TaxID = "TaxID";
	@XendraView(Identifier="e1201fd2-c940-e36d-9123-a03ea3856edd",
Synchronized="2013-07-09 19:02:34.0",
Name="c_payselection_check_v",
Owner="xendra",
Extension="")
	public static final String Identifier = "e1201fd2-c940-e36d-9123-a03ea3856edd";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-07-09 19:02:34.0");
	sb.appendln("@Identifier=e1201fd2-c940-e36d-9123-a03ea3856edd");
	sb.appendln("@comment=Check Print View");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT psc.ad_client_id, psc.ad_org_id, 'en_US'::character varying AS ad_language, psc.c_payselection_id, psc.c_payselectioncheck_id, oi.c_location_id AS org_location_id, oi.taxid, 0 AS c_doctype_id, bp.c_bpartner_id, bp.value AS bpvalue, bp.taxid AS bptaxid, bp.naics, bp.duns, bpg.greeting AS bpgreeting, bp.name, bp.name2, bpartnerremitlocation(bp.c_bpartner_id) AS c_location_id, bp.referenceno, bp.poreference, ps.paydate, p.deferreddate, p.alias, psc.payamt, psc.payamt AS amtinwords, psc.qty, psc.paymentrule, psc.documentno FROM (((((c_payselectioncheck psc JOIN c_payselection ps ON ((psc.c_payselection_id = ps.c_payselection_id))) JOIN c_bpartner bp ON ((psc.c_bpartner_id = bp.c_bpartner_id))) LEFT JOIN c_payment p ON ((psc.c_payment_id = p.c_payment_id))) LEFT JOIN c_greeting bpg ON ((bp.c_greeting_id = bpg.c_greeting_id))) JOIN ad_orginfo oi ON ((psc.ad_org_id = oi.ad_org_id)));");
	return sb.toString();
}
}
