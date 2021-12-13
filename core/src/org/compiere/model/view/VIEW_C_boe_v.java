package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;
import org.compiere.util.KeyNamePair;

public class VIEW_C_boe_v 
{
 
@XendraTable(Name="C_BOE_v",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",TableName="C_BOE_v",
AccessLevel="3",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=0,LoadSeq=150,IsSecurityEnabled=false,
IsDeleteable=false,IsHighVolume=false,IsChangeLog=false,IsView=true,PO_Window_ID="",
ID="org.xendra.commercial",Identifier="ab228f1e-a12c-13e6-2277-382e8b1e6489",
Synchronized="2020-03-03 21:36:32.0")
/** TableName=C_BOE_v */
public static final String Table_Name="C_BOE_v";

@XendraTrl(Identifier="f1c04881-9907-9069-11a8-b37d07f2e050")
public static String es_PE_COLUMN_AmtInWords_Name="Amt in Words";

@XendraColumn(AD_Element_ID="ddaf5eb4-cdab-73ef-508f-3ddb605f61aa",ColumnName="AmtInWords",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=400,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f1c04881-9907-9069-11a8-b37d07f2e050",
Synchronized="2020-03-03 21:36:31.0")
/** Column name AmtInWords */
public static final String COLUMNNAME_AmtInWords = "AmtInWords";

@XendraTrl(Identifier="20225025-6a99-37f4-0ed6-1f23b7931361")
public static String es_PE_COLUMN_BOENo_Name="No de Letra Bco";

@XendraColumn(AD_Element_ID="091eac4c-3fde-7aa3-8516-77e9681245bb",ColumnName="BOENo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="20225025-6a99-37f4-0ed6-1f23b7931361",
Synchronized="2020-03-03 21:36:31.0")
/** Column name BOENo */
public static final String COLUMNNAME_BOENo = "BOENo";

@XendraTrl(Identifier="edc6e86a-73a6-8434-a613-9022dd5c694a")
public static String es_PE_COLUMN_C_BankAccount_ID_Name="Cuenta Bancaria";

@XendraColumn(AD_Element_ID="5a03bc67-316f-bd8c-9e68-b009ad1b290b",ColumnName="C_BankAccount_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="edc6e86a-73a6-8434-a613-9022dd5c694a",
Synchronized="2020-03-03 21:36:31.0")
/** Column name C_BankAccount_ID */
public static final String COLUMNNAME_C_BankAccount_ID = "C_BankAccount_ID";

@XendraTrl(Identifier="1bceeba1-7ff1-944d-0f3e-7463b2591f79")
public static String es_PE_COLUMN_C_BOEGroup_ID_Name="C_BOEGroup";

@XendraColumn(AD_Element_ID="98c77de4-f7aa-4c1b-a5ce-a1b48433fb79",ColumnName="C_BOEGroup_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1bceeba1-7ff1-944d-0f3e-7463b2591f79",
Synchronized="2020-03-03 21:36:31.0")
/** Column name C_BOEGroup_ID */
public static final String COLUMNNAME_C_BOEGroup_ID = "C_BOEGroup_ID";

@XendraTrl(Identifier="5c7922ab-dafd-e8eb-f0d9-73eee4bc5c57")
public static String es_PE_COLUMN_C_BOE_ID_Name="Letra de Cambio";

@XendraColumn(AD_Element_ID="7dfa9e28-2055-cea9-fa94-b5ebdac44420",ColumnName="C_BOE_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5c7922ab-dafd-e8eb-f0d9-73eee4bc5c57",
Synchronized="2020-03-03 21:36:31.0")
/** Column name C_BOE_ID */
public static final String COLUMNNAME_C_BOE_ID = "C_BOE_ID";

@XendraTrl(Identifier="98dd7f92-c971-b1fa-b50e-e309de953498")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Socio de Negocio";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="98dd7f92-c971-b1fa-b50e-e309de953498",
Synchronized="2020-03-03 21:36:31.0")
/** Column name C_BPartner_ID */
public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";

@XendraTrl(Identifier="ef6f4910-bc25-0886-f94a-f5b4593bd7cd")
public static String es_PE_COLUMN_C_BPartner_Location_ID_Name="Dirección del Socio del Negocio";

@XendraColumn(AD_Element_ID="0dab7dc6-2832-26dc-2462-cba2d40235f2",
ColumnName="C_BPartner_Location_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="ef6f4910-bc25-0886-f94a-f5b4593bd7cd",Synchronized="2020-03-03 21:36:31.0")
/** Column name C_BPartner_Location_ID */
public static final String COLUMNNAME_C_BPartner_Location_ID = "C_BPartner_Location_ID";

@XendraTrl(Identifier="9ed0acba-6046-775c-0f79-4927895c28ca")
public static String es_PE_COLUMN_C_ConversionType_ID_Name="Tipo de Moneda";

@XendraColumn(AD_Element_ID="66f5d039-c94d-0957-487b-eb3118bd7719",
ColumnName="C_ConversionType_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="9ed0acba-6046-775c-0f79-4927895c28ca",Synchronized="2020-03-03 21:36:31.0")
/** Column name C_ConversionType_ID */
public static final String COLUMNNAME_C_ConversionType_ID = "C_ConversionType_ID";

@XendraTrl(Identifier="26d3e5d2-51dd-efc6-a371-22771a57672e")
public static String es_PE_COLUMN_C_Currency_ID_Name="Moneda";

@XendraColumn(AD_Element_ID="8daec488-bca2-50fe-f9de-abf0cba2a34a",ColumnName="C_Currency_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="26d3e5d2-51dd-efc6-a371-22771a57672e",
Synchronized="2020-03-03 21:36:31.0")
/** Column name C_Currency_ID */
public static final String COLUMNNAME_C_Currency_ID = "C_Currency_ID";

@XendraTrl(Identifier="c9b66512-0bb5-ddf6-781d-59b7f8bd138f")
public static String es_PE_COLUMN_C_DocType_ID_Name="Tipo de Documento";

@XendraColumn(AD_Element_ID="099a4147-1a72-cdd0-81e0-8bdbc8c0b883",ColumnName="C_DocType_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c9b66512-0bb5-ddf6-781d-59b7f8bd138f",
Synchronized="2020-03-03 21:36:31.0")
/** Column name C_DocType_ID */
public static final String COLUMNNAME_C_DocType_ID = "C_DocType_ID";

@XendraTrl(Identifier="c6b614ba-dfd9-6ff7-36bf-ffb5ff0d08ed")
public static String es_PE_COLUMN_C_DocTypeTarget_ID_Name="Tipo Documento Destino";

@XendraColumn(AD_Element_ID="6dee1e94-d5bf-ba0d-a64a-25cdb5fd9515",ColumnName="C_DocTypeTarget_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c6b614ba-dfd9-6ff7-36bf-ffb5ff0d08ed",
Synchronized="2020-03-03 21:36:31.0")
/** Column name C_DocTypeTarget_ID */
public static final String COLUMNNAME_C_DocTypeTarget_ID = "C_DocTypeTarget_ID";

@XendraTrl(Identifier="a3d1ece5-a25e-5532-534d-fdc76e00078a")
public static String es_PE_COLUMN_C_Payment_ID_Name="Pago";

@XendraColumn(AD_Element_ID="3ded5658-968e-94c5-207b-eed6f6a7bb43",ColumnName="C_Payment_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a3d1ece5-a25e-5532-534d-fdc76e00078a",
Synchronized="2020-03-03 21:36:31.0")
/** Column name C_Payment_ID */
public static final String COLUMNNAME_C_Payment_ID = "C_Payment_ID";

@XendraTrl(Identifier="cef266cd-6eb3-3c32-f6b9-39f05426eecf")
public static String es_PE_COLUMN_C_Project_ID_Name="Proyecto";

@XendraColumn(AD_Element_ID="16ff5dcc-9178-73dd-e618-e88bd79d573b",ColumnName="C_Project_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cef266cd-6eb3-3c32-f6b9-39f05426eecf",
Synchronized="2020-03-03 21:36:31.0")
/** Column name C_Project_ID */
public static final String COLUMNNAME_C_Project_ID = "C_Project_ID";

@XendraTrl(Identifier="752e0aff-550c-8d91-385b-6f55e5a1bddf")
public static String es_PE_COLUMN_Currency_Desc_Name="Currency_Desc";

@XendraColumn(AD_Element_ID="b2b70cf4-91fc-92bd-a433-9436b1810c70",ColumnName="Currency_Desc",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="752e0aff-550c-8d91-385b-6f55e5a1bddf",
Synchronized="2020-03-03 21:36:31.0")
/** Column name Currency_Desc */
public static final String COLUMNNAME_Currency_Desc = "Currency_Desc";

@XendraTrl(Identifier="84505aaa-4f79-d54f-20e4-5456887fc157")
public static String es_PE_COLUMN_CurSymbol_Name="Símbolo";

@XendraColumn(AD_Element_ID="a6544ce7-4bd1-7f2a-84da-823b8e61f86e",ColumnName="CurSymbol",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="84505aaa-4f79-d54f-20e4-5456887fc157",
Synchronized="2020-03-03 21:36:31.0")
/** Column name CurSymbol */
public static final String COLUMNNAME_CurSymbol = "CurSymbol";

@XendraTrl(Identifier="5f224413-fb71-1aa8-0d29-68501cbbe0fd")
public static String es_PE_COLUMN_DateAcct_Name="Fecha de Aplicación CG";

@XendraColumn(AD_Element_ID="034727d0-e80f-fadf-3d4f-2d8d37b75669",ColumnName="DateAcct",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5f224413-fb71-1aa8-0d29-68501cbbe0fd",
Synchronized="2020-03-03 21:36:31.0")
/** Column name DateAcct */
public static final String COLUMNNAME_DateAcct = "DateAcct";

@XendraTrl(Identifier="c1492db2-69fa-0cdc-46ef-1592dd1cd72a")
public static String es_PE_COLUMN_DateBOE_Name="Fecha de la Letra de Cambio";

@XendraColumn(AD_Element_ID="ca3fdb3d-2d28-4b77-a7fa-22bc925a41e1",ColumnName="DateBOE",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c1492db2-69fa-0cdc-46ef-1592dd1cd72a",
Synchronized="2020-03-03 21:36:31.0")
/** Column name DateBOE */
public static final String COLUMNNAME_DateBOE = "DateBOE";

@XendraTrl(Identifier="3701e762-434a-b234-5a82-0cd34b6b060d")
public static String es_PE_COLUMN_DateStatusBOE_Name="Fecha del Estado de la letra de cambio";

@XendraColumn(AD_Element_ID="79aaa829-9ecf-78d3-22fa-4bb8761d8889",ColumnName="DateStatusBOE",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3701e762-434a-b234-5a82-0cd34b6b060d",
Synchronized="2020-03-03 21:36:31.0")
/** Column name DateStatusBOE */
public static final String COLUMNNAME_DateStatusBOE = "DateStatusBOE";

@XendraTrl(Identifier="17a00f7c-66da-f3f5-0878-44494d516ddd")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="17a00f7c-66da-f3f5-0878-44494d516ddd",
Synchronized="2020-03-03 21:36:31.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";

@XendraTrl(Identifier="837247da-ceda-644f-349e-50bd48d7fef6")
public static String es_PE_COLUMN_DocAction_Name="Acción en el Documento";

@XendraColumn(AD_Element_ID="d4b9075b-18e5-ebbb-5565-d217a7e531cb",ColumnName="DocAction",
AD_Reference_ID=17,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="837247da-ceda-644f-349e-50bd48d7fef6",
Synchronized="2020-03-03 21:36:31.0")
/** Column name DocAction */
public static final String COLUMNNAME_DocAction = "DocAction";

@XendraTrl(Identifier="2d8cece5-41ee-471a-8a0b-131ac77c5f58")
public static String es_PE_COLUMN_DocStatus_Name="Estado del Documento";

@XendraColumn(AD_Element_ID="e73fa537-3438-bd01-dfd4-f0f080a28c55",ColumnName="DocStatus",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2d8cece5-41ee-471a-8a0b-131ac77c5f58",
Synchronized="2020-03-03 21:36:31.0")
/** Column name DocStatus */
public static final String COLUMNNAME_DocStatus = "DocStatus";

@XendraTrl(Identifier="67ce2b7f-07fa-f6cb-9595-89a1df6ae385")
public static String es_PE_COLUMN_DocumentInvoice_Name="documentinvoice";

@XendraColumn(AD_Element_ID="8b557db4-2877-7c48-2716-1f1df0cfb35a",ColumnName="DocumentInvoice",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="67ce2b7f-07fa-f6cb-9595-89a1df6ae385",
Synchronized="2020-03-03 21:36:31.0")
/** Column name DocumentInvoice */
public static final String COLUMNNAME_DocumentInvoice = "DocumentInvoice";

@XendraTrl(Identifier="6b4caa3c-c923-7cdc-e58c-d571b27b7180")
public static String es_PE_COLUMN_DocumentNo_Name="No. del Documento";

@XendraColumn(AD_Element_ID="e3ca6e28-702a-2722-d941-b2072a0de9cb",ColumnName="DocumentNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6b4caa3c-c923-7cdc-e58c-d571b27b7180",
Synchronized="2020-03-03 21:36:31.0")
/** Column name DocumentNo */
public static final String COLUMNNAME_DocumentNo = "DocumentNo";

@XendraTrl(Identifier="a7e7054e-4ed1-6c00-5067-40a8a715a175")
public static String es_PE_COLUMN_DueDate_Name="Fecha de Vencimiento";

@XendraColumn(AD_Element_ID="37bdf028-bb21-2699-2840-6730e99633c6",ColumnName="DueDate",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a7e7054e-4ed1-6c00-5067-40a8a715a175",
Synchronized="2020-03-03 21:36:31.0")
/** Column name DueDate */
public static final String COLUMNNAME_DueDate = "DueDate";

@XendraTrl(Identifier="c322291c-b693-1d50-05ea-4253e979a68f")
public static String es_PE_COLUMN_Fax_Name="Fax";

@XendraColumn(AD_Element_ID="8a02a423-cb7b-6c2f-8be1-1423aec1ba37",ColumnName="Fax",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c322291c-b693-1d50-05ea-4253e979a68f",
Synchronized="2020-03-03 21:36:31.0")
/** Column name Fax */
public static final String COLUMNNAME_Fax = "Fax";

@XendraTrl(Identifier="34b04fd4-4373-fbb7-5173-fda60daacf7b")
public static String es_PE_COLUMN_GrandTotal_Name="Gran Total";

@XendraColumn(AD_Element_ID="ffd614c2-6ff8-c9c6-71bf-44f369675711",ColumnName="GrandTotal",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="34b04fd4-4373-fbb7-5173-fda60daacf7b",
Synchronized="2020-03-03 21:36:31.0")
/** Column name GrandTotal */
public static final String COLUMNNAME_GrandTotal = "GrandTotal";

@XendraTrl(Identifier="6f2b1fe3-c67c-f19d-d5d5-c537cef6107e")
public static String es_PE_COLUMN_Guarantor_ID_Name="Garante";

@XendraColumn(AD_Element_ID="b66e5d12-c647-ca0a-6667-1fce3c535ef4",ColumnName="Guarantor_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="3e4406f7-96ab-1533-375a-4f34b79f0576",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="6f2b1fe3-c67c-f19d-d5d5-c537cef6107e",Synchronized="2020-03-03 21:36:31.0")
/** Column name Guarantor_ID */
public static final String COLUMNNAME_Guarantor_ID = "Guarantor_ID";

@XendraTrl(Identifier="ddd0ee67-da50-2ec9-2fb7-886e05a76324")
public static String es_PE_COLUMN_IsAllocated_Name="Asignado";

@XendraColumn(AD_Element_ID="9e224a32-8f75-7921-819b-e891efaf4226",ColumnName="IsAllocated",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ddd0ee67-da50-2ec9-2fb7-886e05a76324",
Synchronized="2020-03-03 21:36:31.0")
/** Column name IsAllocated */
public static final String COLUMNNAME_IsAllocated = "IsAllocated";

@XendraTrl(Identifier="a76df4de-fe4d-2e42-e617-9e4694c4ccb6")
public static String es_PE_COLUMN_IsPaid_Name="Pagado";

@XendraColumn(AD_Element_ID="a4a2359a-ebb8-dca1-8077-df35f747271c",ColumnName="IsPaid",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a76df4de-fe4d-2e42-e617-9e4694c4ccb6",
Synchronized="2020-03-03 21:36:31.0")
/** Column name IsPaid */
public static final String COLUMNNAME_IsPaid = "IsPaid";

@XendraTrl(Identifier="895983c5-3bfb-8362-5a3c-9d758a564eb2")
public static String es_PE_COLUMN_IsRefinanced_Name="isrefinanced";

@XendraColumn(AD_Element_ID="f3df7fcf-af1a-bf6c-479f-d9a445eac4cd",ColumnName="IsRefinanced",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="895983c5-3bfb-8362-5a3c-9d758a564eb2",
Synchronized="2020-03-03 21:36:31.0")
/** Column name IsRefinanced */
public static final String COLUMNNAME_IsRefinanced = "IsRefinanced";

@XendraTrl(Identifier="08db1415-f0ba-9039-aa54-ca26005a5016")
public static String es_PE_COLUMN_IsSOTrx_Name="Transacción de Ventas";

@XendraColumn(AD_Element_ID="4084b69f-a51d-5676-4d8c-395a13e6b2df",ColumnName="IsSOTrx",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="08db1415-f0ba-9039-aa54-ca26005a5016",
Synchronized="2020-03-03 21:36:31.0")
/** Column name IsSOTrx */
public static final String COLUMNNAME_IsSOTrx = "IsSOTrx";

@XendraTrl(Identifier="dba9d340-0f1b-8014-71bf-850969b611f8")
public static String es_PE_COLUMN_Multiplier_Name="Multiplicador";

@XendraColumn(AD_Element_ID="a8f92b23-52e0-3d54-20c6-36744b23c68c",ColumnName="Multiplier",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="dba9d340-0f1b-8014-71bf-850969b611f8",
Synchronized="2020-03-03 21:36:31.0")
/** Column name Multiplier */
public static final String COLUMNNAME_Multiplier = "Multiplier";

@XendraTrl(Identifier="e0e45ee6-6dbf-2283-62d1-a6cfba735af3")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e0e45ee6-6dbf-2283-62d1-a6cfba735af3",
Synchronized="2020-03-03 21:36:31.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";

@XendraTrl(Identifier="1a798868-4335-6fda-d256-71396bb1f707")
public static String es_PE_COLUMN_Phone_Name="Teléfono";

@XendraColumn(AD_Element_ID="4842df23-a82d-d921-7e1e-5869844caceb",ColumnName="Phone",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1a798868-4335-6fda-d256-71396bb1f707",
Synchronized="2020-03-03 21:36:31.0")
/** Column name Phone */
public static final String COLUMNNAME_Phone = "Phone";

@XendraTrl(Identifier="b6931c8f-7ffb-4e4c-a2f2-b1622fa6f306")
public static String es_PE_COLUMN_Phone2_Name="Teléfono 2";

@XendraColumn(AD_Element_ID="619d752b-db65-e4fd-b230-313afdd72a83",ColumnName="Phone2",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b6931c8f-7ffb-4e4c-a2f2-b1622fa6f306",
Synchronized="2020-03-03 21:36:31.0")
/** Column name Phone2 */
public static final String COLUMNNAME_Phone2 = "Phone2";

@XendraTrl(Identifier="b7e8c7de-7f5b-7d62-c20b-295fb0b47fae")
public static String es_PE_COLUMN_Processed_Name="Procesado";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b7e8c7de-7f5b-7d62-c20b-295fb0b47fae",
Synchronized="2020-03-03 21:36:31.0")
/** Column name Processed */
public static final String COLUMNNAME_Processed = "Processed";

@XendraTrl(Identifier="8fbe8494-0e19-f55a-a44a-3bbb45e330e7")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8fbe8494-0e19-f55a-a44a-3bbb45e330e7",
Synchronized="2020-03-03 21:36:31.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";

@XendraTrl(Identifier="4085fc19-7904-2d3b-e416-a0542200a408")
public static String es_PE_COLUMN_R_Amount_Name="r_amount";

@XendraColumn(AD_Element_ID="f2f4326d-a98c-202c-3c1b-3a5f98af0af8",ColumnName="R_Amount",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4085fc19-7904-2d3b-e416-a0542200a408",
Synchronized="2020-03-03 21:36:31.0")
/** Column name R_Amount */
public static final String COLUMNNAME_R_Amount = "R_Amount";

@XendraTrl(Identifier="ea34b617-0406-d6cd-c7d9-1b97dbef20de")
public static String es_PE_COLUMN_R_DateBOE_Name="r_dateboe";

@XendraColumn(AD_Element_ID="43214b0e-134f-3094-de33-560a7912aebf",ColumnName="R_DateBOE",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ea34b617-0406-d6cd-c7d9-1b97dbef20de",
Synchronized="2020-03-03 21:36:31.0")
/** Column name R_DateBOE */
public static final String COLUMNNAME_R_DateBOE = "R_DateBOE";

@XendraTrl(Identifier="13433189-9703-199b-c41d-ee091287487d")
public static String es_PE_COLUMN_R_DocumentNo_Name="r_documentno";

@XendraColumn(AD_Element_ID="8b1dbb8c-1008-fdae-6f93-2368cc144ef7",ColumnName="R_DocumentNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="13433189-9703-199b-c41d-ee091287487d",
Synchronized="2020-03-03 21:36:31.0")
/** Column name R_DocumentNo */
public static final String COLUMNNAME_R_DocumentNo = "R_DocumentNo";

@XendraTrl(Identifier="b7444457-85fa-8840-be90-82f6c7410559")
public static String es_PE_COLUMN_R_DueDate_Name="r_duedate";

@XendraColumn(AD_Element_ID="28dbce96-e45b-c88c-3c68-be09bebee102",ColumnName="R_DueDate",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b7444457-85fa-8840-be90-82f6c7410559",
Synchronized="2020-03-03 21:36:31.0")
/** Column name R_DueDate */
public static final String COLUMNNAME_R_DueDate = "R_DueDate";

@XendraTrl(Identifier="00d16d4b-036c-fe86-c170-fbcd1ad36d77")
public static String es_PE_COLUMN_Refinance_Name="refinance";

@XendraColumn(AD_Element_ID="3bf55bd8-a0bc-1104-28f7-3bf3b9c2f4df",ColumnName="Refinance",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="00d16d4b-036c-fe86-c170-fbcd1ad36d77",
Synchronized="2020-03-03 21:36:31.0")
/** Column name Refinance */
public static final String COLUMNNAME_Refinance = "Refinance";

@XendraTrl(Identifier="5afb04cc-8ec9-b161-361a-2fe14d0c0740")
public static String es_PE_COLUMN_RefinanceDays_Name="refinancedays";

@XendraColumn(AD_Element_ID="e2eee0d1-bad5-2cf5-9837-0e0b562b177b",ColumnName="RefinanceDays",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5afb04cc-8ec9-b161-361a-2fe14d0c0740",
Synchronized="2020-03-03 21:36:31.0")
/** Column name RefinanceDays */
public static final String COLUMNNAME_RefinanceDays = "RefinanceDays";

@XendraTrl(Identifier="6a1587c4-94b1-db25-7237-5c3b7cff5848")
public static String es_PE_COLUMN_RefinanceDoc_Name="refinancedoc";

@XendraColumn(AD_Element_ID="5711f562-61b7-08be-6702-ab51489a6b46",ColumnName="RefinanceDoc",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6a1587c4-94b1-db25-7237-5c3b7cff5848",
Synchronized="2020-03-03 21:36:31.0")
/** Column name RefinanceDoc */
public static final String COLUMNNAME_RefinanceDoc = "RefinanceDoc";

@XendraTrl(Identifier="7360a819-287b-e14b-15c9-591d22703af3")
public static String es_PE_COLUMN_RetentionAmt_Name="retentionamt";

@XendraColumn(AD_Element_ID="03fc1388-a28c-38a5-c629-d7254fef0614",ColumnName="RetentionAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7360a819-287b-e14b-15c9-591d22703af3",
Synchronized="2020-03-03 21:36:32.0")
/** Column name RetentionAmt */
public static final String COLUMNNAME_RetentionAmt = "RetentionAmt";

@XendraTrl(Identifier="a32e8f83-d4dd-5d1c-e06f-27514f9d46cf")
public static String es_PE_COLUMN_StatusDate_Name="STATUSDATE";

@XendraColumn(AD_Element_ID="f4c6dc34-fa65-aa81-84cf-3e2d06a1583f",ColumnName="StatusDate",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a32e8f83-d4dd-5d1c-e06f-27514f9d46cf",
Synchronized="2020-03-03 21:36:32.0")
/** Column name StatusDate */
public static final String COLUMNNAME_StatusDate = "StatusDate";

@XendraTrl(Identifier="a72e9a85-0be6-cfde-1823-d03adabc05f5")
public static String es_PE_COLUMN_TaxID_Name="RFC";

@XendraColumn(AD_Element_ID="e0a9d0f7-835b-4f80-4c13-bff62213e232",ColumnName="TaxID",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a72e9a85-0be6-cfde-1823-d03adabc05f5",
Synchronized="2020-03-03 21:36:32.0")
/** Column name TaxID */
public static final String COLUMNNAME_TaxID = "TaxID";

@XendraTrl(Identifier="21563fe1-055b-613a-74e5-44a8a3d661c0")
public static String es_PE_COLUMN_Value_Name="Clave de Búsqueda";

@XendraColumn(AD_Element_ID="e75e100c-9b41-a643-2cb3-46eeced683d8",ColumnName="Value",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="21563fe1-055b-613a-74e5-44a8a3d661c0",
Synchronized="2020-03-03 21:36:32.0")
/** Column name Value */
public static final String COLUMNNAME_Value = "Value";
	@XendraView(Identifier="ab228f1e-a12c-13e6-2277-382e8b1e6489",
Synchronized="2013-07-09 19:02:34.0",
Name="c_boe_v",
Owner="xendra",
Extension="")
	public static final String Identifier = "ab228f1e-a12c-13e6-2277-382e8b1e6489";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-07-09 19:02:34.0");
	sb.appendln("@Identifier=ab228f1e-a12c-13e6-2277-382e8b1e6489");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT (SELECT c_invoice.documentno FROM c_invoice WHERE (c_invoice.c_invoice_id IN (SELECT max(c_boeline.c_invoice_id) AS max FROM c_boeline WHERE (c_boeline.c_boeline_id IN (SELECT c_boeline.c_boeline_id FROM c_boeline WHERE (c_boeline.c_boe_id = b.c_boe_id)))))) AS documentinvoice, b.ad_client_id, b.ad_org_id, b.c_boe_id, b.c_bpartner_id, b.c_bpartner_location_id, b.c_currency_id, b.c_doctype_id, b.created, b.createdby, b.description, b.documentno, b.duedate, b.grandtotal, b.isactive, b.updated, b.updatedby, b.issotrx, b.guarantor_id, b.c_bankaccount_id, b.processed, b.boeno, b.ispaid, b.dateacct, b.docaction, b.dateboe, b.datestatusboe, b.c_doctypetarget_id, b.docstatus, b.c_boegroup_id, b.processing, b.c_project_id, b.c_conversiontype_id, b.c_payment_id, b.statusdate, b.isallocated, b.refinance, b.isrefinanced, b.refinancedoc, b.refinancedays, b.retentionamt, bp.value, bp.taxid, (SELECT bpl.name FROM c_bpartner_location bpl WHERE (bpl.c_bpartner_id = b.c_bpartner_id) LIMIT 1) AS name, (SELECT bpl.phone FROM c_bpartner_location bpl WHERE (bpl.c_bpartner_id = b.c_bpartner_id) LIMIT 1) AS phone, (SELECT bpl.phone2 FROM c_bpartner_location bpl WHERE (bpl.c_bpartner_id = b.c_bpartner_id) LIMIT 1) AS phone2, (SELECT bpl.fax FROM c_bpartner_location bpl WHERE (bpl.c_bpartner_id = b.c_bpartner_id) LIMIT 1) AS fax, cur.description AS currency_desc, cur.cursymbol, b.r_dateboe, b.r_amount, b.r_documentno, b.r_duedate, 1 AS multiplier FROM ((c_boe b LEFT JOIN c_bpartner bp ON ((bp.c_bpartner_id = b.c_bpartner_id))) JOIN c_currency cur ON ((b.c_currency_id = cur.c_currency_id)));");
	return sb.toString();
}
}
