package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_C_payselection_remittance_v 
{
 
@XendraTable(Name="C_PaySelection_Remittance_v",
AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Checl/Remittance View",Help="",
TableName="C_PaySelection_Remittance_v",AccessLevel="1",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=0,
LoadSeq=150,IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=true,IsChangeLog=false,
IsView=true,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="5fb7ab04-a7dc-1339-388a-c095ea2aa0fc",Synchronized="2020-03-03 21:37:25.0")
/** TableName=C_PaySelection_Remittance_v */
public static final String Table_Name="C_PaySelection_Remittance_v";

@XendraTrl(Identifier="28008fa7-16d3-5f56-074a-d726d1ac1b5c")
public static String es_PE_COLUMN_AD_Language_Name="Lenguaje";

@XendraColumn(AD_Element_ID="d542d9da-4627-0da8-89af-5797f22de434",ColumnName="AD_Language",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=5,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="28008fa7-16d3-5f56-074a-d726d1ac1b5c",
Synchronized="2020-03-03 21:37:25.0")
/** Column name AD_Language */
public static final String COLUMNNAME_AD_Language = "AD_Language";

@XendraTrl(Identifier="01987608-8e10-ea74-7b59-d4c2d85f87f5")
public static String es_PE_COLUMN_AmtInWords_Name="Cant. En Palabras";

@XendraColumn(AD_Element_ID="ddaf5eb4-cdab-73ef-508f-3ddb605f61aa",ColumnName="AmtInWords",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="01987608-8e10-ea74-7b59-d4c2d85f87f5",
Synchronized="2020-03-03 21:37:25.0")
/** Column name AmtInWords */
public static final String COLUMNNAME_AmtInWords = "AmtInWords";

@XendraTrl(Identifier="04792428-f17e-994b-4a42-b78e706580a4")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Socio de Negocio";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="04792428-f17e-994b-4a42-b78e706580a4",
Synchronized="2020-03-03 21:37:25.0")
/** Column name C_BPartner_ID */
public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";

@XendraTrl(Identifier="4d433a07-af42-56eb-9ce7-aba739fe2769")
public static String es_PE_COLUMN_C_PaySelectionCheck_ID_Name="Revisión de Selección de Pago";

@XendraColumn(AD_Element_ID="4b03e117-2aa0-f847-ea99-82dcc040d3ff",
ColumnName="C_PaySelectionCheck_ID",AD_Reference_ID=13,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="4d433a07-af42-56eb-9ce7-aba739fe2769",Synchronized="2020-03-03 21:37:25.0")
/** Column name C_PaySelectionCheck_ID */
public static final String COLUMNNAME_C_PaySelectionCheck_ID = "C_PaySelectionCheck_ID";

@XendraTrl(Identifier="cd0ee892-aa12-4ae1-ba9e-456bffb7bd0b")
public static String es_PE_COLUMN_C_PaySelection_ID_Name="Selección de Pago";

@XendraColumn(AD_Element_ID="79f02f46-d5fc-1851-93df-8e77a06c5431",ColumnName="C_PaySelection_ID",
AD_Reference_ID=13,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cd0ee892-aa12-4ae1-ba9e-456bffb7bd0b",
Synchronized="2020-03-03 21:37:25.0")
/** Column name C_PaySelection_ID */
public static final String COLUMNNAME_C_PaySelection_ID = "C_PaySelection_ID";
/** Column name C_PaySelectionLine_ID */
public static final String COLUMNNAME_C_PaySelectionLine_ID = "C_PaySelectionLine_ID";

@XendraTrl(Identifier="22b15a13-d654-bc6d-cd70-e25b8f2aaa11")
public static String es_PE_COLUMN_DateInvoiced_Name="Fecha de Facturación";

@XendraColumn(AD_Element_ID="5e3c1a65-f97d-82ed-a21c-bc730ca3c080",ColumnName="DateInvoiced",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="22b15a13-d654-bc6d-cd70-e25b8f2aaa11",
Synchronized="2020-03-03 21:37:25.0")
/** Column name DateInvoiced */
public static final String COLUMNNAME_DateInvoiced = "DateInvoiced";

@XendraTrl(Identifier="cb253ac4-7b3c-5dc2-bbde-c866745b37e9")
public static String es_PE_COLUMN_DifferenceAmt_Name="Diferencia monto";

@XendraColumn(AD_Element_ID="62840044-943e-7971-69a5-7954e25dfe29",ColumnName="DifferenceAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cb253ac4-7b3c-5dc2-bbde-c866745b37e9",
Synchronized="2020-03-03 21:37:25.0")
/** Column name DifferenceAmt */
public static final String COLUMNNAME_DifferenceAmt = "DifferenceAmt";

@XendraTrl(Identifier="8eb4e521-c887-d6c2-117b-3398ec5aec21")
public static String es_PE_COLUMN_DiscountAmt_Name="Total del Descuento";

@XendraColumn(AD_Element_ID="351290a4-6d07-13cb-9132-459358217d86",ColumnName="DiscountAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8eb4e521-c887-d6c2-117b-3398ec5aec21",
Synchronized="2020-03-03 21:37:25.0")
/** Column name DiscountAmt */
public static final String COLUMNNAME_DiscountAmt = "DiscountAmt";

@XendraTrl(Identifier="4a3ac16e-e223-ff73-d54f-7ed07e2eb5dd")
public static String es_PE_COLUMN_DocumentNo_Name="No. del Documento";

@XendraColumn(AD_Element_ID="e3ca6e28-702a-2722-d941-b2072a0de9cb",ColumnName="DocumentNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4a3ac16e-e223-ff73-d54f-7ed07e2eb5dd",
Synchronized="2020-03-03 21:37:25.0")
/** Column name DocumentNo */
public static final String COLUMNNAME_DocumentNo = "DocumentNo";

@XendraTrl(Identifier="1bd893d0-00ec-42a9-27bb-e1fe87fa382a")
public static String es_PE_COLUMN_GrandTotal_Name="Gran Total";

@XendraColumn(AD_Element_ID="ffd614c2-6ff8-c9c6-71bf-44f369675711",ColumnName="GrandTotal",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1bd893d0-00ec-42a9-27bb-e1fe87fa382a",
Synchronized="2020-03-03 21:37:25.0")
/** Column name GrandTotal */
public static final String COLUMNNAME_GrandTotal = "GrandTotal";

@XendraTrl(Identifier="b3b2ea00-8ecb-8226-a57c-64e177b2db49")
public static String es_PE_COLUMN_Line_Name="No. Línea";

@XendraColumn(AD_Element_ID="986ef077-61da-f9cf-1c6d-aefe3a35113b",ColumnName="Line",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b3b2ea00-8ecb-8226-a57c-64e177b2db49",
Synchronized="2020-03-03 21:37:25.0")
/** Column name Line */
public static final String COLUMNNAME_Line = "Line";

@XendraTrl(Identifier="4bb7f378-7d93-8fde-b661-2d86f1d775ff")
public static String es_PE_COLUMN_OpenAmt_Name="Total Abierto";

@XendraColumn(AD_Element_ID="89a287e4-b72d-e4d4-2a42-90bcfde3d1ae",ColumnName="OpenAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4bb7f378-7d93-8fde-b661-2d86f1d775ff",
Synchronized="2020-03-03 21:37:25.0")
/** Column name OpenAmt */
public static final String COLUMNNAME_OpenAmt = "OpenAmt";

@XendraTrl(Identifier="617acd9b-e0c4-80bc-ff7a-5b58fafb283a")
public static String es_PE_COLUMN_PayAmt_Name="Total del Pago";

@XendraColumn(AD_Element_ID="9e9a0ba1-2d71-67e7-e0f1-0309fd537c8b",ColumnName="PayAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="617acd9b-e0c4-80bc-ff7a-5b58fafb283a",
Synchronized="2020-03-03 21:37:25.0")
/** Column name PayAmt */
public static final String COLUMNNAME_PayAmt = "PayAmt";

@XendraTrl(Identifier="67a8b9d5-ec95-4840-3dd3-a40270897845")
public static String es_PE_COLUMN_PaymentRule_Name="Regla de Pago";

@XendraColumn(AD_Element_ID="5074db21-c657-2d23-63dc-80f0c5f2d4cc",ColumnName="PaymentRule",
AD_Reference_ID=17,AD_Reference_Value_ID="ac003b85-a929-cc48-3def-1a8f7b1adc7b",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="67a8b9d5-ec95-4840-3dd3-a40270897845",Synchronized="2020-03-03 21:37:25.0")
/** Column name PaymentRule */
public static final String COLUMNNAME_PaymentRule = "PaymentRule";
	@XendraView(Identifier="5fb7ab04-a7dc-1339-388a-c095ea2aa0fc",
Synchronized="2013-07-09 19:02:34.0",
Name="c_payselection_remittance_v",
Owner="xendra",
Extension="")
	public static final String Identifier = "5fb7ab04-a7dc-1339-388a-c095ea2aa0fc";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-07-09 19:02:34.0");
	sb.appendln("@Identifier=5fb7ab04-a7dc-1339-388a-c095ea2aa0fc");
	sb.appendln("@comment=Checl/Remittance View");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT psl.ad_client_id, psl.ad_org_id, 'en_US'::character varying AS ad_language, psl.c_payselection_id, psl.c_payselectionline_id, psl.c_payselectioncheck_id, psl.paymentrule, psl.line, psl.openamt, psl.payamt, psl.discountamt, psl.differenceamt, i.c_bpartner_id, i.documentno, i.dateinvoiced, i.grandtotal, i.grandtotal AS amtinwords FROM (c_payselectionline psl JOIN c_invoice i ON ((psl.c_invoice_id = i.c_invoice_id)));");
	return sb.toString();
}
}
