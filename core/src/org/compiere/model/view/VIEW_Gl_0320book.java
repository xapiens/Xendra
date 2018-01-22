package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_Gl_0320book 
{
 
@XendraTable(Name="GL_0320Book",Description="",Help="",TableName="GL_0320Book",AccessLevel="3",
AD_Window_ID="",AD_Val_Rule_ID="",IsKey=0,LoadSeq=0,IsSecurityEnabled=false,IsDeleteable=false,
IsHighVolume=false,IsChangeLog=false,IsView=true,PO_Window_ID="",ID="org.xendra.accounting",
Identifier="0539d3b9-afef-45b6-a49d-2970f3626ca4",Synchronized="2017-08-16 12:37:23.0")
/** TableName=GL_0320Book */
public static final String Table_Name="GL_0320Book";

@XendraTrl(Identifier="57e3030d-e805-4ea2-b989-40c102d758c2")
public static String es_PE_COLUMN_AmtAcctCr_Name="Accounted Credit";

@XendraColumn(AD_Element_ID="945e7d70-99b5-5eaf-31ef-c5f460f7626c",ColumnName="AmtAcctCr",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="57e3030d-e805-4ea2-b989-40c102d758c2",
Synchronized="2017-08-16 12:37:22.0")
/** Column name AmtAcctCr */
public static final String COLUMNNAME_AmtAcctCr = "AmtAcctCr";

@XendraTrl(Identifier="147ac8db-7c19-45f1-9dd0-241684a6d756")
public static String es_PE_COLUMN_AmtAcctDr_Name="Accounted Debit";

@XendraColumn(AD_Element_ID="67410612-76a4-c113-8594-305f58926372",ColumnName="AmtAcctDr",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="147ac8db-7c19-45f1-9dd0-241684a6d756",
Synchronized="2017-08-16 12:37:22.0")
/** Column name AmtAcctDr */
public static final String COLUMNNAME_AmtAcctDr = "AmtAcctDr";

@XendraTrl(Identifier="def7d4a0-b199-4156-ae77-2e7711ca0d9e")
public static String es_PE_COLUMN_C_Period_ID_Name="Period";

@XendraColumn(AD_Element_ID="8f295c04-0eb4-a8f3-829f-cc6a6bd1df1e",ColumnName="C_Period_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="def7d4a0-b199-4156-ae77-2e7711ca0d9e",
Synchronized="2017-08-16 12:37:23.0")
/** Column name C_Period_ID */
public static final String COLUMNNAME_C_Period_ID = "C_Period_ID";

@XendraTrl(Identifier="90e18266-b8d8-4b17-be58-89ee50935a72")
public static String es_PE_COLUMN_DateAcct_Name="Account Date";

@XendraColumn(AD_Element_ID="034727d0-e80f-fadf-3d4f-2d8d37b75669",ColumnName="DateAcct",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="90e18266-b8d8-4b17-be58-89ee50935a72",
Synchronized="2017-08-16 12:37:23.0")
/** Column name DateAcct */
public static final String COLUMNNAME_DateAcct = "DateAcct";

@XendraTrl(Identifier="cae0389f-0a27-48f4-8d34-93ae5f55ef14")
public static String es_PE_COLUMN_nameacct_Name="nameacct";

@XendraColumn(AD_Element_ID="685af745-82ee-4361-b373-91e48892eecb",ColumnName="nameacct",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cae0389f-0a27-48f4-8d34-93ae5f55ef14",
Synchronized="2017-08-16 12:37:23.0")
/** Column name nameacct */
public static final String COLUMNNAME_nameacct = "nameacct";

@XendraTrl(Identifier="58ed2a9e-1cfb-4db9-a6c8-149340644044")
public static String es_PE_COLUMN_Subject_Name="Subject";

@XendraColumn(AD_Element_ID="63bfabf2-dc90-74a1-d263-1c960c7a71bd",ColumnName="Subject",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="58ed2a9e-1cfb-4db9-a6c8-149340644044",
Synchronized="2017-08-16 12:37:23.0")
/** Column name Subject */
public static final String COLUMNNAME_Subject = "Subject";

@XendraTrl(Identifier="f103c8a1-f072-4b05-8cf4-1fd57e6f1744")
public static String es_PE_COLUMN_TaxID_Name="Tax ID";

@XendraColumn(AD_Element_ID="e0a9d0f7-835b-4f80-4c13-bff62213e232",ColumnName="TaxID",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f103c8a1-f072-4b05-8cf4-1fd57e6f1744",
Synchronized="2017-08-16 12:37:23.0")
/** Column name TaxID */
public static final String COLUMNNAME_TaxID = "TaxID";

@XendraTrl(Identifier="9e4da39b-b6ea-44b3-a535-c7653bb6d657")
public static String es_PE_COLUMN_valueacct_Name="valueacct";

@XendraColumn(AD_Element_ID="81c4da9e-290e-4bcc-9882-e6c6d1401f0e",ColumnName="valueacct",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9e4da39b-b6ea-44b3-a535-c7653bb6d657",
Synchronized="2017-08-16 12:37:23.0")
/** Column name valueacct */
public static final String COLUMNNAME_valueacct = "valueacct";
	@XendraView(Identifier="246924a9-7bf9-436b-ac80-db1ce92ac0e7",
Synchronized="2016-10-08 14:04:04.0",
Name="gl_0320book",
Owner="xendra",
Extension="")
	public static final String Identifier = "246924a9-7bf9-436b-ac80-db1ce92ac0e7";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2016-10-08 14:04:04.0");
	sb.appendln("@Identifier=246924a9-7bf9-436b-ac80-db1ce92ac0e7");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT ev.value AS valueacct, ev.name AS nameacct, s.taxid, s.value AS subject, f.dateacct, f.c_period_id, f.ad_client_id, f.ad_org_id, f.amtacctdr, f.amtacctcr FROM ((fact_acct f JOIN c_elementvalue ev ON ((f.account_id = ev.c_elementvalue_id))) JOIN c_subject s ON ((ev.egpf_c_subject_id = s.c_subject_id))) WHERE (COALESCE(ev.egpf_c_subject_id, (0)::numeric) > (0)::numeric);");
	return sb.toString();
}
}
