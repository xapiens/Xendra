package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_T_bankaccountrecprev 
{
 
@XendraTable(Name="T_BankAccountRecPrev",Description="",Help="",TableName="T_BankAccountRecPrev",
AccessLevel="3",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=0,LoadSeq=0,IsSecurityEnabled=false,
IsDeleteable=false,IsHighVolume=true,IsChangeLog=false,IsView=true,PO_Window_ID="",
ID="org.xendra.standard",Identifier="c1d8b8fa-b64c-303d-9a1e-ca6e226eb132",
Synchronized="2017-08-16 12:38:53.0")
/** TableName=T_BankAccountRecPrev */
public static final String Table_Name="T_BankAccountRecPrev";

@XendraTrl(Identifier="df69ad0b-05aa-55e2-e55f-301b98a9f47e")
public static String es_PE_COLUMN_AD_PInstance_ID_Name="Process Instance";

@XendraColumn(AD_Element_ID="a293ee40-db79-24cc-fb47-781657ecb499",ColumnName="AD_PInstance_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="df69ad0b-05aa-55e2-e55f-301b98a9f47e",
Synchronized="2017-08-16 12:38:53.0")
/** Column name AD_PInstance_ID */
public static final String COLUMNNAME_AD_PInstance_ID = "AD_PInstance_ID";

@XendraTrl(Identifier="883596ef-8258-cb2a-f11d-6e88e28f3aa1")
public static String es_PE_COLUMN_C_BankStatement_ID_Name="Bank Statement";

@XendraColumn(AD_Element_ID="8105d871-aa63-d678-57d6-1450c5b5d3d4",ColumnName="C_BankStatement_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="883596ef-8258-cb2a-f11d-6e88e28f3aa1",
Synchronized="2017-08-16 12:38:53.0")
/** Column name C_BankStatement_ID */
public static final String COLUMNNAME_C_BankStatement_ID = "C_BankStatement_ID";

@XendraTrl(Identifier="1896fbff-61a5-ff62-f366-0e8d473d6eb0")
public static String es_PE_COLUMN_C_Payment_ID_Name="Payment";

@XendraColumn(AD_Element_ID="3ded5658-968e-94c5-207b-eed6f6a7bb43",ColumnName="C_Payment_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1896fbff-61a5-ff62-f366-0e8d473d6eb0",
Synchronized="2017-08-16 12:38:53.0")
/** Column name C_Payment_ID */
public static final String COLUMNNAME_C_Payment_ID = "C_Payment_ID";

@XendraTrl(Identifier="702437ab-5ec8-2e43-4aa9-c086251d102b")
public static String es_PE_COLUMN_DateTrx_Name="Transaction Date";

@XendraColumn(AD_Element_ID="3700288f-61dd-2021-b833-cf804ceed1e9",ColumnName="DateTrx",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="702437ab-5ec8-2e43-4aa9-c086251d102b",
Synchronized="2017-08-16 12:38:53.0")
/** Column name DateTrx */
public static final String COLUMNNAME_DateTrx = "DateTrx";

@XendraTrl(Identifier="24e66393-935e-fb09-51b1-b8256b89c1ba")
public static String es_PE_COLUMN_IsPending_Name="Is Pending";

@XendraColumn(AD_Element_ID="b2466c07-fd3d-4808-a657-12a0a7de7070",ColumnName="IsPending",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="24e66393-935e-fb09-51b1-b8256b89c1ba",
Synchronized="2017-08-16 12:38:53.0")
/** Column name IsPending */
public static final String COLUMNNAME_IsPending = "IsPending";

@XendraTrl(Identifier="b35e1065-833e-1428-9872-4fca8596ca5e")
public static String es_PE_COLUMN_IsPrevious_Name="Is Previous";

@XendraColumn(AD_Element_ID="c5634e4a-f62b-35ff-8a2d-5b0c2b75a79f",ColumnName="IsPrevious",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b35e1065-833e-1428-9872-4fca8596ca5e",
Synchronized="2017-08-16 12:38:53.0")
/** Column name IsPrevious */
public static final String COLUMNNAME_IsPrevious = "IsPrevious";

@XendraTrl(Identifier="626d78d3-889e-cb41-213b-30b490582e34")
public static String es_PE_COLUMN_IsReconciled_Name="Reconciled";

@XendraColumn(AD_Element_ID="86d77140-27dd-ed64-2c3f-5dd26190df54",ColumnName="IsReconciled",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="626d78d3-889e-cb41-213b-30b490582e34",
Synchronized="2017-08-16 12:38:53.0")
/** Column name IsReconciled */
public static final String COLUMNNAME_IsReconciled = "IsReconciled";

@XendraTrl(Identifier="f2f3f8a6-dffb-9402-947e-6ede12294e4e")
public static String es_PE_COLUMN_PayAmt_Name="Payment amount";

@XendraColumn(AD_Element_ID="9e9a0ba1-2d71-67e7-e0f1-0309fd537c8b",ColumnName="PayAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f2f3f8a6-dffb-9402-947e-6ede12294e4e",
Synchronized="2017-08-16 12:38:53.0")
/** Column name PayAmt */
public static final String COLUMNNAME_PayAmt = "PayAmt";
	@XendraView(Identifier="c1d8b8fa-b64c-303d-9a1e-ca6e226eb132",
Synchronized="2013-07-09 19:02:34.0",
Name="t_bankaccountrecprev",
Owner="xendra",
Extension="")
	public static final String Identifier = "c1d8b8fa-b64c-303d-9a1e-ca6e226eb132";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-07-09 19:02:34.0");
	sb.appendln("@Identifier=c1d8b8fa-b64c-303d-9a1e-ca6e226eb132");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT t_bankaccountreconciliation.ad_pinstance_id, t_bankaccountreconciliation.ad_client_id, t_bankaccountreconciliation.ad_org_id, t_bankaccountreconciliation.created, t_bankaccountreconciliation.createdby, t_bankaccountreconciliation.updated, t_bankaccountreconciliation.updatedby, t_bankaccountreconciliation.isactive, t_bankaccountreconciliation.c_payment_id, t_bankaccountreconciliation.payamt, t_bankaccountreconciliation.datetrx, t_bankaccountreconciliation.isprevious, t_bankaccountreconciliation.ispending, t_bankaccountreconciliation.c_bankstatement_id, t_bankaccountreconciliation.isreconciled FROM t_bankaccountreconciliation WHERE (t_bankaccountreconciliation.isprevious = 'Y'::bpchar);");
	return sb.toString();
}
}
