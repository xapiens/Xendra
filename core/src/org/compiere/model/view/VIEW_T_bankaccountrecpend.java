package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_T_bankaccountrecpend 
{
 
@XendraTable(Name="T_BankAccountRecPend",AD_Package_ID="1b3656e5-71c7-1296-994e-9b2c4549c7fd",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="T_BankAccountRecPend",AccessLevel="3",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=0,
LoadSeq=0,IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=true,IsChangeLog=false,
IsView=true,PO_Window_ID="",ID="org.xendra.standard",
Identifier="2e9e10fe-d744-2ffe-ee53-bdd67b1e1ae2",Synchronized="2020-03-03 21:40:20.0")
/** TableName=T_BankAccountRecPend */
public static final String Table_Name="T_BankAccountRecPend";

@XendraTrl(Identifier="87a89ba6-9767-4ce6-d1c0-4de1cf63038b")
public static String es_PE_COLUMN_AD_PInstance_ID_Name="Process Instance";

@XendraColumn(AD_Element_ID="a293ee40-db79-24cc-fb47-781657ecb499",ColumnName="AD_PInstance_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="87a89ba6-9767-4ce6-d1c0-4de1cf63038b",
Synchronized="2020-03-03 21:40:20.0")
/** Column name AD_PInstance_ID */
public static final String COLUMNNAME_AD_PInstance_ID = "AD_PInstance_ID";

@XendraTrl(Identifier="e8c52356-e84e-b2ac-b90a-87c522b12e49")
public static String es_PE_COLUMN_C_BankStatement_ID_Name="Bank Statement";

@XendraColumn(AD_Element_ID="8105d871-aa63-d678-57d6-1450c5b5d3d4",ColumnName="C_BankStatement_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e8c52356-e84e-b2ac-b90a-87c522b12e49",
Synchronized="2020-03-03 21:40:20.0")
/** Column name C_BankStatement_ID */
public static final String COLUMNNAME_C_BankStatement_ID = "C_BankStatement_ID";

@XendraTrl(Identifier="12e91f83-7117-22c9-a0d3-d8224bd4b99d")
public static String es_PE_COLUMN_C_Payment_ID_Name="Payment";

@XendraColumn(AD_Element_ID="3ded5658-968e-94c5-207b-eed6f6a7bb43",ColumnName="C_Payment_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="12e91f83-7117-22c9-a0d3-d8224bd4b99d",
Synchronized="2020-03-03 21:40:20.0")
/** Column name C_Payment_ID */
public static final String COLUMNNAME_C_Payment_ID = "C_Payment_ID";

@XendraTrl(Identifier="b7d22a71-1f66-f2fb-d2b8-66cac5a10bf5")
public static String es_PE_COLUMN_DateTrx_Name="Transaction Date";

@XendraColumn(AD_Element_ID="3700288f-61dd-2021-b833-cf804ceed1e9",ColumnName="DateTrx",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b7d22a71-1f66-f2fb-d2b8-66cac5a10bf5",
Synchronized="2020-03-03 21:40:20.0")
/** Column name DateTrx */
public static final String COLUMNNAME_DateTrx = "DateTrx";

@XendraTrl(Identifier="43d70934-c1b5-5888-e348-35ff504a6f18")
public static String es_PE_COLUMN_IsPending_Name="Is Pending";

@XendraColumn(AD_Element_ID="b2466c07-fd3d-4808-a657-12a0a7de7070",ColumnName="IsPending",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="43d70934-c1b5-5888-e348-35ff504a6f18",
Synchronized="2020-03-03 21:40:20.0")
/** Column name IsPending */
public static final String COLUMNNAME_IsPending = "IsPending";

@XendraTrl(Identifier="8f8adb4e-6574-7c12-e0b3-d02dc51aad0f")
public static String es_PE_COLUMN_IsPrevious_Name="Is Previous";

@XendraColumn(AD_Element_ID="c5634e4a-f62b-35ff-8a2d-5b0c2b75a79f",ColumnName="IsPrevious",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8f8adb4e-6574-7c12-e0b3-d02dc51aad0f",
Synchronized="2020-03-03 21:40:20.0")
/** Column name IsPrevious */
public static final String COLUMNNAME_IsPrevious = "IsPrevious";

@XendraTrl(Identifier="29f487ef-a490-4c7f-0764-d305a8df8291")
public static String es_PE_COLUMN_IsReconciled_Name="Reconciled";

@XendraColumn(AD_Element_ID="86d77140-27dd-ed64-2c3f-5dd26190df54",ColumnName="IsReconciled",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="29f487ef-a490-4c7f-0764-d305a8df8291",
Synchronized="2020-03-03 21:40:20.0")
/** Column name IsReconciled */
public static final String COLUMNNAME_IsReconciled = "IsReconciled";

@XendraTrl(Identifier="e66adbb2-f904-e452-5063-97f3afb08650")
public static String es_PE_COLUMN_PayAmt_Name="Payment amount";

@XendraColumn(AD_Element_ID="9e9a0ba1-2d71-67e7-e0f1-0309fd537c8b",ColumnName="PayAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e66adbb2-f904-e452-5063-97f3afb08650",
Synchronized="2020-03-03 21:40:20.0")
/** Column name PayAmt */
public static final String COLUMNNAME_PayAmt = "PayAmt";
	@XendraView(Identifier="2e9e10fe-d744-2ffe-ee53-bdd67b1e1ae2",
Synchronized="2013-07-09 19:02:34.0",
Name="t_bankaccountrecpend",
Owner="xendra",
Extension="")
	public static final String Identifier = "2e9e10fe-d744-2ffe-ee53-bdd67b1e1ae2";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-07-09 19:02:34.0");
	sb.appendln("@Identifier=2e9e10fe-d744-2ffe-ee53-bdd67b1e1ae2");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT t_bankaccountreconciliation.ad_pinstance_id, t_bankaccountreconciliation.ad_client_id, t_bankaccountreconciliation.ad_org_id, t_bankaccountreconciliation.created, t_bankaccountreconciliation.createdby, t_bankaccountreconciliation.updated, t_bankaccountreconciliation.updatedby, t_bankaccountreconciliation.isactive, t_bankaccountreconciliation.c_payment_id, t_bankaccountreconciliation.payamt, t_bankaccountreconciliation.datetrx, t_bankaccountreconciliation.isprevious, t_bankaccountreconciliation.ispending, t_bankaccountreconciliation.c_bankstatement_id, t_bankaccountreconciliation.isreconciled FROM t_bankaccountreconciliation WHERE (t_bankaccountreconciliation.ispending = 'Y'::bpchar);");
	return sb.toString();
}
}
