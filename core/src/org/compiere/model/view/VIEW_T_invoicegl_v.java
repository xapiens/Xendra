package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_T_invoicegl_v 
{
 
@XendraTable(Name="T_InvoiceGL_v",Description="Gain/Loss",Help="",TableName="T_InvoiceGL_v",
AccessLevel="3",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=0,LoadSeq=150,IsSecurityEnabled=false,
IsDeleteable=false,IsHighVolume=true,IsChangeLog=false,IsView=true,PO_Window_ID="",
ID="org.xendra.standard",Identifier="b81a9cdd-071e-a04f-aebd-e059bc1d209d",
Synchronized="2017-08-16 12:38:56.0")
/** TableName=T_InvoiceGL_v */
public static final String Table_Name="T_InvoiceGL_v";

@XendraTrl(Identifier="28164110-373f-bf99-dce1-e4f272f073d9")
public static String es_PE_COLUMN_Account_ID_Name="Cuenta";

@XendraColumn(AD_Element_ID="80f1c2b7-bd3e-7c80-0596-67c2f7ca3812",ColumnName="Account_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="c63c37c4-7a13-09ab-5af8-48da1b35609d",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="28164110-373f-bf99-dce1-e4f272f073d9",Synchronized="2017-08-16 12:38:56.0")
/** Column name Account_ID */
public static final String COLUMNNAME_Account_ID = "Account_ID";

@XendraTrl(Identifier="6e75be45-fa44-fa55-f6d6-47457eb138f9")
public static String es_PE_COLUMN_AD_OrgTrx_ID_Name="Organización de la Trans.";

@XendraColumn(AD_Element_ID="b4180358-67aa-fe55-0409-6367a60e0a2e",ColumnName="AD_OrgTrx_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="c51c396d-3026-2c1f-b979-24961a8cd969",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="6e75be45-fa44-fa55-f6d6-47457eb138f9",Synchronized="2017-08-16 12:38:56.0")
/** Column name AD_OrgTrx_ID */
public static final String COLUMNNAME_AD_OrgTrx_ID = "AD_OrgTrx_ID";

@XendraTrl(Identifier="7eda1384-67c5-e54e-522f-a6461fee0ef0")
public static String es_PE_COLUMN_AD_PInstance_ID_Name="Instancia del Proceso";

@XendraColumn(AD_Element_ID="a293ee40-db79-24cc-fb47-781657ecb499",ColumnName="AD_PInstance_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7eda1384-67c5-e54e-522f-a6461fee0ef0",
Synchronized="2017-08-16 12:38:56.0")
/** Column name AD_PInstance_ID */
public static final String COLUMNNAME_AD_PInstance_ID = "AD_PInstance_ID";

@XendraTrl(Identifier="23092494-50dd-9c69-8956-e32c0b4e1def")
public static String es_PE_COLUMN_AD_User_ID_Name="Usuario";

@XendraColumn(AD_Element_ID="abdf8dee-d3cd-73ec-c758-683e907797f4",ColumnName="AD_User_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="23092494-50dd-9c69-8956-e32c0b4e1def",
Synchronized="2017-08-16 12:38:56.0")
/** Column name AD_User_ID */
public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";

@XendraTrl(Identifier="9abc4165-161a-2bf4-cd9d-45051ba07a34")
public static String es_PE_COLUMN_AmtAcctBalance_Name="Balance Contable";

@XendraColumn(AD_Element_ID="37a156c9-083d-471f-c206-06304dffb44b",ColumnName="AmtAcctBalance",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9abc4165-161a-2bf4-cd9d-45051ba07a34",
Synchronized="2017-08-16 12:38:56.0")
/** Column name AmtAcctBalance */
public static final String COLUMNNAME_AmtAcctBalance = "AmtAcctBalance";

@XendraTrl(Identifier="c5131290-292d-4e1a-942c-1b17a59df824")
public static String es_PE_COLUMN_AmtAcctCr_Name="Crédito Contabilizado";

@XendraColumn(AD_Element_ID="945e7d70-99b5-5eaf-31ef-c5f460f7626c",ColumnName="AmtAcctCr",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c5131290-292d-4e1a-942c-1b17a59df824",
Synchronized="2017-08-16 12:38:56.0")
/** Column name AmtAcctCr */
public static final String COLUMNNAME_AmtAcctCr = "AmtAcctCr";

@XendraTrl(Identifier="00c89aca-7ecf-c232-fdab-5384a06ec5f1")
public static String es_PE_COLUMN_AmtAcctDr_Name="Débito Contabilizado";

@XendraColumn(AD_Element_ID="67410612-76a4-c113-8594-305f58926372",ColumnName="AmtAcctDr",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="00c89aca-7ecf-c232-fdab-5384a06ec5f1",
Synchronized="2017-08-16 12:38:56.0")
/** Column name AmtAcctDr */
public static final String COLUMNNAME_AmtAcctDr = "AmtAcctDr";

@XendraTrl(Identifier="15f180a4-e67c-b780-328e-505e462b2145")
public static String es_PE_COLUMN_AmtAcctOpenBalance_Name="Acct Open Balance";

@XendraColumn(AD_Element_ID="db9de99d-2a00-9adf-98b0-7642af7a4b55",ColumnName="AmtAcctOpenBalance",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="15f180a4-e67c-b780-328e-505e462b2145",
Synchronized="2017-08-16 12:38:56.0")
/** Column name AmtAcctOpenBalance */
public static final String COLUMNNAME_AmtAcctOpenBalance = "AmtAcctOpenBalance";

@XendraTrl(Identifier="3cda3a07-46f9-8e5e-72a4-eab13af5c0df")
public static String es_PE_COLUMN_AmtAcctOpenCr_Name="Acct Open Cr";

@XendraColumn(AD_Element_ID="d0e5fa59-c133-01e6-9a8e-9c39468c9a85",ColumnName="AmtAcctOpenCr",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3cda3a07-46f9-8e5e-72a4-eab13af5c0df",
Synchronized="2017-08-16 12:38:56.0")
/** Column name AmtAcctOpenCr */
public static final String COLUMNNAME_AmtAcctOpenCr = "AmtAcctOpenCr";

@XendraTrl(Identifier="47d7700a-3d68-6423-b6f5-0114fef0840d")
public static String es_PE_COLUMN_AmtAcctOpenDr_Name="Acct Open Dr";

@XendraColumn(AD_Element_ID="afeb643f-9e94-cf42-5234-65cd0469d6da",ColumnName="AmtAcctOpenDr",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="47d7700a-3d68-6423-b6f5-0114fef0840d",
Synchronized="2017-08-16 12:38:56.0")
/** Column name AmtAcctOpenDr */
public static final String COLUMNNAME_AmtAcctOpenDr = "AmtAcctOpenDr";

@XendraTrl(Identifier="4e5776ca-ce45-fa45-20d6-ed9cfc7e3627")
public static String es_PE_COLUMN_AmtRevalCr_Name="Importe de CXC Revaluado";

@XendraColumn(AD_Element_ID="cbde817c-44df-f0f5-6e8f-851786191d2a",ColumnName="AmtRevalCr",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4e5776ca-ce45-fa45-20d6-ed9cfc7e3627",
Synchronized="2017-08-16 12:38:56.0")
/** Column name AmtRevalCr */
public static final String COLUMNNAME_AmtRevalCr = "AmtRevalCr";

@XendraTrl(Identifier="8cea5a62-e1bd-586e-96b1-3a4797c44de0")
public static String es_PE_COLUMN_AmtRevalCrDiff_Name="Diferencia de CXC Revaluado";

@XendraColumn(AD_Element_ID="3fdaaf89-40f2-6879-9473-4ac32915eaeb",ColumnName="AmtRevalCrDiff",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8cea5a62-e1bd-586e-96b1-3a4797c44de0",
Synchronized="2017-08-16 12:38:56.0")
/** Column name AmtRevalCrDiff */
public static final String COLUMNNAME_AmtRevalCrDiff = "AmtRevalCrDiff";

@XendraTrl(Identifier="ebded26a-62be-3c5d-d74a-367694518f67")
public static String es_PE_COLUMN_AmtRevalDr_Name="Importe de CXP Revaluado";

@XendraColumn(AD_Element_ID="5c004382-c809-e061-8936-716213937bcd",ColumnName="AmtRevalDr",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ebded26a-62be-3c5d-d74a-367694518f67",
Synchronized="2017-08-16 12:38:56.0")
/** Column name AmtRevalDr */
public static final String COLUMNNAME_AmtRevalDr = "AmtRevalDr";

@XendraTrl(Identifier="8dd80e20-eba0-395c-257b-f59a26dae523")
public static String es_PE_COLUMN_AmtRevalDrDiff_Name="Diferencia de CXP Revaluado";

@XendraColumn(AD_Element_ID="123c0f4c-fc8c-bd4b-20c2-7469f4dea729",ColumnName="AmtRevalDrDiff",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8dd80e20-eba0-395c-257b-f59a26dae523",
Synchronized="2017-08-16 12:38:56.0")
/** Column name AmtRevalDrDiff */
public static final String COLUMNNAME_AmtRevalDrDiff = "AmtRevalDrDiff";

@XendraTrl(Identifier="16809bae-a66a-940f-b5d9-dd63e8034d8f")
public static String es_PE_COLUMN_AmtSourceBalance_Name="Monto Fuente del Balance";

@XendraColumn(AD_Element_ID="7eefe83d-05f1-c92d-30cf-e7ecd0e6f5e0",ColumnName="AmtSourceBalance",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="16809bae-a66a-940f-b5d9-dd63e8034d8f",
Synchronized="2017-08-16 12:38:56.0")
/** Column name AmtSourceBalance */
public static final String COLUMNNAME_AmtSourceBalance = "AmtSourceBalance";

@XendraTrl(Identifier="b30a1f68-f02c-3269-582d-b5bfea8d3af3")
public static String es_PE_COLUMN_AmtSourceCr_Name="Abono";

@XendraColumn(AD_Element_ID="37fc9554-00eb-5046-f770-46b9f63a1166",ColumnName="AmtSourceCr",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b30a1f68-f02c-3269-582d-b5bfea8d3af3",
Synchronized="2017-08-16 12:38:56.0")
/** Column name AmtSourceCr */
public static final String COLUMNNAME_AmtSourceCr = "AmtSourceCr";

@XendraTrl(Identifier="adc5df94-ea54-b588-0c36-decec672cca2")
public static String es_PE_COLUMN_AmtSourceDr_Name="Cargo";

@XendraColumn(AD_Element_ID="83234cfc-e73c-2419-af3c-afb9356f1f68",ColumnName="AmtSourceDr",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="adc5df94-ea54-b588-0c36-decec672cca2",
Synchronized="2017-08-16 12:38:56.0")
/** Column name AmtSourceDr */
public static final String COLUMNNAME_AmtSourceDr = "AmtSourceDr";

@XendraTrl(Identifier="20c86dd1-2240-8cb0-6784-1728e0b8ad7b")
public static String es_PE_COLUMN_APAR_Name="CP - CC";

@XendraColumn(AD_Element_ID="8eb4c1f0-0d7d-766b-777b-afa3aa6b74ef",ColumnName="APAR",
AD_Reference_ID=17,AD_Reference_Value_ID="f7f54ef7-c97e-a561-fa1c-241fadd391d4",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="20c86dd1-2240-8cb0-6784-1728e0b8ad7b",Synchronized="2017-08-16 12:38:56.0")
/** Column name APAR */
public static final String COLUMNNAME_APAR = "APAR";

@XendraTrl(Identifier="22c7aad6-d2d3-44db-3f2a-89a8188174af")
public static String es_PE_COLUMN_C_AcctSchema_ID_Name="Esquema Contable";

@XendraColumn(AD_Element_ID="561c9a32-9b35-9c1a-fabc-8abf7f2bb4ae",ColumnName="C_AcctSchema_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="22c7aad6-d2d3-44db-3f2a-89a8188174af",
Synchronized="2017-08-16 12:38:56.0")
/** Column name C_AcctSchema_ID */
public static final String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";

@XendraTrl(Identifier="3d62077b-0219-c9ef-64d4-8fbf970d7b73")
public static String es_PE_COLUMN_C_Activity_ID_Name="Tipo de Gasto";

@XendraColumn(AD_Element_ID="bfeadbb3-d866-26e3-8eee-3e2fdf0ff753",ColumnName="C_Activity_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3d62077b-0219-c9ef-64d4-8fbf970d7b73",
Synchronized="2017-08-16 12:38:56.0")
/** Column name C_Activity_ID */
public static final String COLUMNNAME_C_Activity_ID = "C_Activity_ID";

@XendraTrl(Identifier="19d6e67c-2c7a-0234-17aa-546c49a00eaa")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Socio de Negocio";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="19d6e67c-2c7a-0234-17aa-546c49a00eaa",
Synchronized="2017-08-16 12:38:56.0")
/** Column name C_BPartner_ID */
public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";

@XendraTrl(Identifier="649dafb3-5465-c3e5-2850-96473b11771e")
public static String es_PE_COLUMN_C_BPartner_Location_ID_Name="Dirección del Socio del Negocio";

@XendraColumn(AD_Element_ID="0dab7dc6-2832-26dc-2462-cba2d40235f2",
ColumnName="C_BPartner_Location_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="649dafb3-5465-c3e5-2850-96473b11771e",Synchronized="2017-08-16 12:38:56.0")
/** Column name C_BPartner_Location_ID */
public static final String COLUMNNAME_C_BPartner_Location_ID = "C_BPartner_Location_ID";

@XendraTrl(Identifier="dc4c8f0a-43a7-9233-4bc6-c4c48b788274")
public static String es_PE_COLUMN_C_Campaign_ID_Name="Campaña";

@XendraColumn(AD_Element_ID="6cf08e31-d355-ee38-9c0b-bee20b3ea5b6",ColumnName="C_Campaign_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="dc4c8f0a-43a7-9233-4bc6-c4c48b788274",
Synchronized="2017-08-16 12:38:56.0")
/** Column name C_Campaign_ID */
public static final String COLUMNNAME_C_Campaign_ID = "C_Campaign_ID";

@XendraTrl(Identifier="350e35b5-899e-70d9-f691-26992db252e7")
public static String es_PE_COLUMN_C_ConversionType_ID_Name="Tipo de Moneda";

@XendraColumn(AD_Element_ID="66f5d039-c94d-0957-487b-eb3118bd7719",
ColumnName="C_ConversionType_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="350e35b5-899e-70d9-f691-26992db252e7",Synchronized="2017-08-16 12:38:56.0")
/** Column name C_ConversionType_ID */
public static final String COLUMNNAME_C_ConversionType_ID = "C_ConversionType_ID";

@XendraTrl(Identifier="f3bcbc01-58b1-89d5-c577-fddad7488b6a")
public static String es_PE_COLUMN_C_ConversionTypeReval_ID_Name="Tipo de Conversión de Revaluación";

@XendraColumn(AD_Element_ID="7e9d71c9-6e00-10e1-dfed-d7296154356a",
ColumnName="C_ConversionTypeReval_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="41dda287-7ecf-a6d1-d177-b35716a62768",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="f3bcbc01-58b1-89d5-c577-fddad7488b6a",
Synchronized="2017-08-16 12:38:56.0")
/** Column name C_ConversionTypeReval_ID */
public static final String COLUMNNAME_C_ConversionTypeReval_ID = "C_ConversionTypeReval_ID";

@XendraTrl(Identifier="0ef9d979-10af-da6a-2f9f-4f94b3a4b83e")
public static String es_PE_COLUMN_C_Currency_ID_Name="Moneda";

@XendraColumn(AD_Element_ID="8daec488-bca2-50fe-f9de-abf0cba2a34a",ColumnName="C_Currency_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0ef9d979-10af-da6a-2f9f-4f94b3a4b83e",
Synchronized="2017-08-16 12:38:56.0")
/** Column name C_Currency_ID */
public static final String COLUMNNAME_C_Currency_ID = "C_Currency_ID";

@XendraTrl(Identifier="f8a86778-e3dc-899d-58b0-a3cdd2b4ab08")
public static String es_PE_COLUMN_C_DocType_ID_Name="Tipo de Documento";

@XendraColumn(AD_Element_ID="099a4147-1a72-cdd0-81e0-8bdbc8c0b883",ColumnName="C_DocType_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f8a86778-e3dc-899d-58b0-a3cdd2b4ab08",
Synchronized="2017-08-16 12:38:56.0")
/** Column name C_DocType_ID */
public static final String COLUMNNAME_C_DocType_ID = "C_DocType_ID";

@XendraTrl(Identifier="befff867-29df-9886-0c11-2bfbdff27dfd")
public static String es_PE_COLUMN_C_DocTypeReval_ID_Name="Revaloración Tipo del Documento";

@XendraColumn(AD_Element_ID="3ecc8896-3763-01dc-2721-99f7f4768ea5",ColumnName="C_DocTypeReval_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="f06eaf85-a231-e1cf-ebf8-59d002c13ab4",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="befff867-29df-9886-0c11-2bfbdff27dfd",Synchronized="2017-08-16 12:38:56.0")
/** Column name C_DocTypeReval_ID */
public static final String COLUMNNAME_C_DocTypeReval_ID = "C_DocTypeReval_ID";

@XendraTrl(Identifier="5cacaf0e-885b-6c0d-3079-134c0cedcada")
public static String es_PE_COLUMN_C_Invoice_ID_Name="Factura";

@XendraColumn(AD_Element_ID="e526ea57-1bdf-9871-fd57-0df3c1f9dd42",ColumnName="C_Invoice_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5cacaf0e-885b-6c0d-3079-134c0cedcada",
Synchronized="2017-08-16 12:38:56.0")
/** Column name C_Invoice_ID */
public static final String COLUMNNAME_C_Invoice_ID = "C_Invoice_ID";

@XendraTrl(Identifier="8bf2354a-9f63-7bee-a017-c0cc4e6b2f90")
public static String es_PE_COLUMN_C_LocFrom_ID_Name="Desde Localización";

@XendraColumn(AD_Element_ID="5c54374e-b27b-3cd4-f5a8-8705436152bc",ColumnName="C_LocFrom_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="69189951-7109-d2c7-f034-b4660d43b572",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="8bf2354a-9f63-7bee-a017-c0cc4e6b2f90",Synchronized="2017-08-16 12:38:56.0")
/** Column name C_LocFrom_ID */
public static final String COLUMNNAME_C_LocFrom_ID = "C_LocFrom_ID";

@XendraTrl(Identifier="9abe93f0-5cf2-7a41-b069-96c433b78754")
public static String es_PE_COLUMN_C_LocTo_ID_Name="A Localización";

@XendraColumn(AD_Element_ID="531e981d-5722-db37-a6eb-54ec21b60a90",ColumnName="C_LocTo_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="69189951-7109-d2c7-f034-b4660d43b572",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="9abe93f0-5cf2-7a41-b069-96c433b78754",Synchronized="2017-08-16 12:38:56.0")
/** Column name C_LocTo_ID */
public static final String COLUMNNAME_C_LocTo_ID = "C_LocTo_ID";

@XendraTrl(Identifier="4bf3ca31-df90-9d71-4731-c3b73576d81b")
public static String es_PE_COLUMN_C_Order_ID_Name="Orden de Venta";

@XendraColumn(AD_Element_ID="cc846c60-90b8-6aad-9d07-b5d0c0328787",ColumnName="C_Order_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4bf3ca31-df90-9d71-4731-c3b73576d81b",
Synchronized="2017-08-16 12:38:56.0")
/** Column name C_Order_ID */
public static final String COLUMNNAME_C_Order_ID = "C_Order_ID";

@XendraTrl(Identifier="94c76b3d-b26a-d1f8-534e-a3c3049d6553")
public static String es_PE_COLUMN_C_PaymentTerm_ID_Name="Término de Pago";

@XendraColumn(AD_Element_ID="9b2224b8-8020-a83c-2d1e-ea35741c781a",ColumnName="C_PaymentTerm_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="94c76b3d-b26a-d1f8-534e-a3c3049d6553",
Synchronized="2017-08-16 12:38:56.0")
/** Column name C_PaymentTerm_ID */
public static final String COLUMNNAME_C_PaymentTerm_ID = "C_PaymentTerm_ID";

@XendraTrl(Identifier="bfaa63de-6f47-6e05-a6f3-2efdc30ba747")
public static String es_PE_COLUMN_C_Period_ID_Name="Período";

@XendraColumn(AD_Element_ID="8f295c04-0eb4-a8f3-829f-cc6a6bd1df1e",ColumnName="C_Period_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bfaa63de-6f47-6e05-a6f3-2efdc30ba747",
Synchronized="2017-08-16 12:38:56.0")
/** Column name C_Period_ID */
public static final String COLUMNNAME_C_Period_ID = "C_Period_ID";

@XendraTrl(Identifier="aa223906-6fff-4a59-7c98-65e4580a3239")
public static String es_PE_COLUMN_C_Project_ID_Name="Proyecto";

@XendraColumn(AD_Element_ID="16ff5dcc-9178-73dd-e618-e88bd79d573b",ColumnName="C_Project_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="aa223906-6fff-4a59-7c98-65e4580a3239",
Synchronized="2017-08-16 12:38:56.0")
/** Column name C_Project_ID */
public static final String COLUMNNAME_C_Project_ID = "C_Project_ID";

@XendraTrl(Identifier="06a6133d-a09b-bbd6-e425-1200da67ec45")
public static String es_PE_COLUMN_C_SalesRegion_ID_Name="Región de Ventas";

@XendraColumn(AD_Element_ID="26b40f06-df79-27f7-adb4-8ae6c5a1c9b8",ColumnName="C_SalesRegion_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="06a6133d-a09b-bbd6-e425-1200da67ec45",
Synchronized="2017-08-16 12:38:56.0")
/** Column name C_SalesRegion_ID */
public static final String COLUMNNAME_C_SalesRegion_ID = "C_SalesRegion_ID";

@XendraTrl(Identifier="17ba9879-d76e-500b-b7a1-78b369a00a27")
public static String es_PE_COLUMN_C_Tax_ID_Name="Impuesto";

@XendraColumn(AD_Element_ID="38ff24fc-b68c-51a9-60f8-ef2a1f060de2",ColumnName="C_Tax_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="17ba9879-d76e-500b-b7a1-78b369a00a27",
Synchronized="2017-08-16 12:38:56.0")
/** Column name C_Tax_ID */
public static final String COLUMNNAME_C_Tax_ID = "C_Tax_ID";

@XendraTrl(Identifier="5e4edc38-2fa7-7a62-baf4-f08d82e2ade0")
public static String es_PE_COLUMN_C_UOM_ID_Name="UM";

@XendraColumn(AD_Element_ID="d0345019-4fcc-44c8-4fd1-e38e3b4adeed",ColumnName="C_UOM_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5e4edc38-2fa7-7a62-baf4-f08d82e2ade0",
Synchronized="2017-08-16 12:38:56.0")
/** Column name C_UOM_ID */
public static final String COLUMNNAME_C_UOM_ID = "C_UOM_ID";

@XendraTrl(Identifier="22d9e3f8-8012-bc18-146b-ba1e626fc302")
public static String es_PE_COLUMN_DateAcct_Name="Fecha de Aplicación CG";

@XendraColumn(AD_Element_ID="034727d0-e80f-fadf-3d4f-2d8d37b75669",ColumnName="DateAcct",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="22d9e3f8-8012-bc18-146b-ba1e626fc302",
Synchronized="2017-08-16 12:38:56.0")
/** Column name DateAcct */
public static final String COLUMNNAME_DateAcct = "DateAcct";

@XendraTrl(Identifier="2295b920-634d-79e6-da42-d843668c22ed")
public static String es_PE_COLUMN_DateInvoiced_Name="Fecha de Facturación";

@XendraColumn(AD_Element_ID="5e3c1a65-f97d-82ed-a21c-bc730ca3c080",ColumnName="DateInvoiced",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2295b920-634d-79e6-da42-d843668c22ed",
Synchronized="2017-08-16 12:38:56.0")
/** Column name DateInvoiced */
public static final String COLUMNNAME_DateInvoiced = "DateInvoiced";

@XendraTrl(Identifier="25aa0e6a-63f7-a9f2-7189-475fab2f1cc2")
public static String es_PE_COLUMN_DateReval_Name="Fecha de Revaluación";

@XendraColumn(AD_Element_ID="85941f8b-52f4-3ebb-455b-e36bb69b0d47",ColumnName="DateReval",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="25aa0e6a-63f7-a9f2-7189-475fab2f1cc2",
Synchronized="2017-08-16 12:38:56.0")
/** Column name DateReval */
public static final String COLUMNNAME_DateReval = "DateReval";

@XendraTrl(Identifier="6a703752-c050-d283-b740-6b923e4eedd2")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6a703752-c050-d283-b740-6b923e4eedd2",
Synchronized="2017-08-16 12:38:56.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";

@XendraTrl(Identifier="df24cf18-2036-2356-f6b4-4d60d58e6b99")
public static String es_PE_COLUMN_DocStatus_Name="Estado del Documento";

@XendraColumn(AD_Element_ID="e73fa537-3438-bd01-dfd4-f0f080a28c55",ColumnName="DocStatus",
AD_Reference_ID=17,AD_Reference_Value_ID="7627125d-fefe-e6bc-bb7d-4a6c772172dc",AD_Val_Rule_ID="",
FieldLength=2,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="df24cf18-2036-2356-f6b4-4d60d58e6b99",Synchronized="2017-08-16 12:38:56.0")
/** Column name DocStatus */
public static final String COLUMNNAME_DocStatus = "DocStatus";

@XendraTrl(Identifier="6f37eefb-601a-5fb0-577d-dd0ccb55e134")
public static String es_PE_COLUMN_DocumentNo_Name="No. del Documento";

@XendraColumn(AD_Element_ID="e3ca6e28-702a-2722-d941-b2072a0de9cb",ColumnName="DocumentNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6f37eefb-601a-5fb0-577d-dd0ccb55e134",
Synchronized="2017-08-16 12:38:56.0")
/** Column name DocumentNo */
public static final String COLUMNNAME_DocumentNo = "DocumentNo";

@XendraTrl(Identifier="891037c3-8036-8803-9334-4c45d2987e96")
public static String es_PE_COLUMN_Fact_Acct_ID_Name="Hecho Contable";

@XendraColumn(AD_Element_ID="c1839793-0346-4c78-96ff-8f7942ce0082",ColumnName="Fact_Acct_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="891037c3-8036-8803-9334-4c45d2987e96",
Synchronized="2017-08-16 12:38:56.0")
/** Column name Fact_Acct_ID */
public static final String COLUMNNAME_Fact_Acct_ID = "Fact_Acct_ID";

@XendraTrl(Identifier="2f1873cd-2632-b4d2-0256-e8e765604f62")
public static String es_PE_COLUMN_GL_Budget_ID_Name="Presupuesto";

@XendraColumn(AD_Element_ID="202442f1-5c47-451c-a68b-6c32567592ad",ColumnName="GL_Budget_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2f1873cd-2632-b4d2-0256-e8e765604f62",
Synchronized="2017-08-16 12:38:56.0")
/** Column name GL_Budget_ID */
public static final String COLUMNNAME_GL_Budget_ID = "GL_Budget_ID";

@XendraTrl(Identifier="f4c8c9eb-e053-216f-aa73-1d51887cb7c9")
public static String es_PE_COLUMN_GL_Category_ID_Name="Categoría CG";

@XendraColumn(AD_Element_ID="b3063a1c-d28b-42fc-2d1b-27037b4d6514",ColumnName="GL_Category_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f4c8c9eb-e053-216f-aa73-1d51887cb7c9",
Synchronized="2017-08-16 12:38:56.0")
/** Column name GL_Category_ID */
public static final String COLUMNNAME_GL_Category_ID = "GL_Category_ID";

@XendraTrl(Identifier="66f662e3-382b-277c-6e64-be9194247a61")
public static String es_PE_COLUMN_GrandTotal_Name="Gran Total";

@XendraColumn(AD_Element_ID="ffd614c2-6ff8-c9c6-71bf-44f369675711",ColumnName="GrandTotal",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="66f662e3-382b-277c-6e64-be9194247a61",
Synchronized="2017-08-16 12:38:56.0")
/** Column name GrandTotal */
public static final String COLUMNNAME_GrandTotal = "GrandTotal";

@XendraTrl(Identifier="e590d8ca-7c7b-1ccb-2e59-cd5e3be85d77")
public static String es_PE_COLUMN_IsAllCurrencies_Name="Incluir Todas las Monédas";

@XendraColumn(AD_Element_ID="032ac3b1-b41a-b558-93e0-602474e94be5",ColumnName="IsAllCurrencies",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e590d8ca-7c7b-1ccb-2e59-cd5e3be85d77",
Synchronized="2017-08-16 12:38:56.0")
/** Column name IsAllCurrencies */
public static final String COLUMNNAME_IsAllCurrencies = "IsAllCurrencies";

@XendraTrl(Identifier="cd7d1270-cd2c-3029-79fd-ada807910a01")
public static String es_PE_COLUMN_IsSelfService_Name="Auto-Servicio";

@XendraColumn(AD_Element_ID="8f201030-f9ab-66d2-f4de-7209f41f2af8",ColumnName="IsSelfService",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cd7d1270-cd2c-3029-79fd-ada807910a01",
Synchronized="2017-08-16 12:38:56.0")
/** Column name IsSelfService */
public static final String COLUMNNAME_IsSelfService = "IsSelfService";

@XendraTrl(Identifier="ff1640a1-585c-c3ba-f950-1585f547329b")
public static String es_PE_COLUMN_IsSOTrx_Name="Transacción de Ventas";

@XendraColumn(AD_Element_ID="4084b69f-a51d-5676-4d8c-395a13e6b2df",ColumnName="IsSOTrx",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ff1640a1-585c-c3ba-f950-1585f547329b",
Synchronized="2017-08-16 12:38:56.0")
/** Column name IsSOTrx */
public static final String COLUMNNAME_IsSOTrx = "IsSOTrx";

@XendraTrl(Identifier="b0a47e63-4405-d07b-49aa-99fefe9ead36")
public static String es_PE_COLUMN_IsTaxIncluded_Name="Impuesto Incluido en el Precio";

@XendraColumn(AD_Element_ID="eb0a6d55-2fff-a462-20b8-744571a3fe60",ColumnName="IsTaxIncluded",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b0a47e63-4405-d07b-49aa-99fefe9ead36",
Synchronized="2017-08-16 12:38:56.0")
/** Column name IsTaxIncluded */
public static final String COLUMNNAME_IsTaxIncluded = "IsTaxIncluded";

@XendraTrl(Identifier="7953f50a-8490-25f9-43d3-fae0a5aec8e3")
public static String es_PE_COLUMN_M_Locator_ID_Name="Ubicación";

@XendraColumn(AD_Element_ID="67f044ce-2864-93f9-fd0d-320945150933",ColumnName="M_Locator_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7953f50a-8490-25f9-43d3-fae0a5aec8e3",
Synchronized="2017-08-16 12:38:56.0")
/** Column name M_Locator_ID */
public static final String COLUMNNAME_M_Locator_ID = "M_Locator_ID";

@XendraTrl(Identifier="409c7214-7d16-9374-8bed-7fdb57b253d3")
public static String es_PE_COLUMN_OpenAmt_Name="Total Abierto";

@XendraColumn(AD_Element_ID="89a287e4-b72d-e4d4-2a42-90bcfde3d1ae",ColumnName="OpenAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="409c7214-7d16-9374-8bed-7fdb57b253d3",
Synchronized="2017-08-16 12:38:56.0")
/** Column name OpenAmt */
public static final String COLUMNNAME_OpenAmt = "OpenAmt";

@XendraTrl(Identifier="230584fe-7ca2-80e1-f58a-58925be3f1c8")
public static String es_PE_COLUMN_Percent_Name="Porcentaje";

@XendraColumn(AD_Element_ID="a70b0c31-700a-d879-f313-b31531c93f04",ColumnName="Percent",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="230584fe-7ca2-80e1-f58a-58925be3f1c8",
Synchronized="2017-08-16 12:38:56.0")
/** Column name Percent */
public static final String COLUMNNAME_Percent = "Percent";

@XendraTrl(Identifier="b7e3d369-b82a-f98e-f2ed-5e77c6d3b244")
public static String es_PE_COLUMN_PostingType_Name="Tipo de Aplicación";

@XendraColumn(AD_Element_ID="465cd8dd-d2b8-aa76-fc18-7f8df439b182",ColumnName="PostingType",
AD_Reference_ID=17,AD_Reference_Value_ID="1ad48d23-2ec9-09d0-cb68-38688c5e6ce0",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="b7e3d369-b82a-f98e-f2ed-5e77c6d3b244",Synchronized="2017-08-16 12:38:56.0")
/** Column name PostingType */
public static final String COLUMNNAME_PostingType = "PostingType";

@XendraTrl(Identifier="6f6e7b32-2a45-ac99-327f-378c566d196f")
public static String es_PE_COLUMN_Qty_Name="Cantidad";

@XendraColumn(AD_Element_ID="c9d74a25-87c5-9592-5660-4f397607dad3",ColumnName="Qty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6f6e7b32-2a45-ac99-327f-378c566d196f",
Synchronized="2017-08-16 12:38:56.0")
/** Column name Qty */
public static final String COLUMNNAME_Qty = "Qty";

@XendraTrl(Identifier="d1c48a1c-166e-2349-f9a1-7b56ca3c27da")
public static String es_PE_COLUMN_SalesRep_ID_Name="Agente Cía";

@XendraColumn(AD_Element_ID="197a9c3a-ff10-c291-d65f-5e05a36d3710",ColumnName="SalesRep_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="15251147-a1b6-4a83-a3a5-2d3ae7db69d9",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="d1c48a1c-166e-2349-f9a1-7b56ca3c27da",Synchronized="2017-08-16 12:38:56.0")
/** Column name SalesRep_ID */
public static final String COLUMNNAME_SalesRep_ID = "SalesRep_ID";

@XendraTrl(Identifier="6cf24614-c724-05bb-1694-dc580d5c15b8")
public static String es_PE_COLUMN_User1_ID_Name="Usuario 1";

@XendraColumn(AD_Element_ID="07453e74-aadd-d9c9-e543-837a6fdb3094",ColumnName="User1_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="5a2fe161-044f-67cb-3791-6d615980cabb",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="6cf24614-c724-05bb-1694-dc580d5c15b8",Synchronized="2017-08-16 12:38:56.0")
/** Column name User1_ID */
public static final String COLUMNNAME_User1_ID = "User1_ID";

@XendraTrl(Identifier="509215d7-bd1e-4fe9-902d-a155f421ed6c")
public static String es_PE_COLUMN_User2_ID_Name="Usuario 2";

@XendraColumn(AD_Element_ID="1b668c90-6743-20a2-df62-576857d72c06",ColumnName="User2_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="6a357ab2-7bb6-fce4-ffee-8bdd855a77fc",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="509215d7-bd1e-4fe9-902d-a155f421ed6c",Synchronized="2017-08-16 12:38:56.0")
/** Column name User2_ID */
public static final String COLUMNNAME_User2_ID = "User2_ID";
	@XendraView(Identifier="b81a9cdd-071e-a04f-aebd-e059bc1d209d",
Synchronized="2013-07-09 19:02:34.0",
Name="t_invoicegl_v",
Owner="xendra",
Extension="")
	public static final String Identifier = "b81a9cdd-071e-a04f-aebd-e059bc1d209d";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-07-09 19:02:34.0");
	sb.appendln("@Identifier=b81a9cdd-071e-a04f-aebd-e059bc1d209d");
	sb.appendln("@comment=Gain/Loss");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT i.ad_client_id, i.ad_org_id, i.isactive, i.created, i.createdby, i.updated, i.updatedby, i.c_invoice_id, i.issotrx, i.documentno, i.docstatus, i.c_doctype_id, i.c_order_id, i.description, i.salesrep_id, i.dateinvoiced, i.dateacct, i.c_paymentterm_id, i.c_bpartner_id, i.c_bpartner_location_id, i.ad_user_id, i.isselfservice, i.c_currency_id, i.c_conversiontype_id, i.grandtotal, i.istaxincluded, i.c_campaign_id, i.c_project_id, i.c_activity_id, i.ad_orgtrx_id, i.user1_id, i.user2_id, fa.c_locfrom_id, fa.c_locto_id, fa.c_salesregion_id, fa.fact_acct_id, fa.c_acctschema_id, fa.account_id, fa.c_period_id, fa.gl_category_id, fa.gl_budget_id, fa.c_tax_id, fa.m_locator_id, fa.postingtype, fa.amtsourcedr, fa.amtsourcecr, fa.amtacctdr, fa.amtacctcr, fa.c_uom_id, fa.qty, gl.ad_pinstance_id, gl.apar, gl.openamt, gl.percent, gl.amtrevaldr, gl.amtrevalcr, gl.datereval, gl.c_conversiontypereval_id, gl.amtsourcebalance, gl.amtacctbalance, gl.c_doctypereval_id, gl.amtrevaldrdiff, gl.amtrevalcrdiff, gl.isallcurrencies, ((fa.amtacctdr * gl.percent) / (100)::numeric) AS amtacctopendr, ((fa.amtacctcr * gl.percent) / (100)::numeric) AS amtacctopencr, (((fa.amtacctdr - fa.amtacctcr) * gl.percent) / (100)::numeric) AS amtacctopenbalance FROM ((t_invoicegl gl JOIN c_invoice i ON ((gl.c_invoice_id = i.c_invoice_id))) JOIN fact_acct fa ON ((gl.fact_acct_id = fa.fact_acct_id)));");
	return sb.toString();
}
}
