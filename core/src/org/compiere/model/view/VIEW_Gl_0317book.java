package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_Gl_0317book 
{
 
@XendraTable(Name="GL_0317Book",AD_Package_ID="2ac04657-d663-47c2-4ec1-927ad71f1e96",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",TableName="GL_0317Book",
AccessLevel="3",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=0,LoadSeq=0,IsSecurityEnabled=false,
IsDeleteable=false,IsHighVolume=false,IsChangeLog=false,IsView=true,PO_Window_ID="",
ID="org.xendra.accounting",Identifier="c14add02-a8ba-4608-806f-3d8ffceeeb14",
Synchronized="2020-03-03 21:37:53.0")
/** TableName=GL_0317Book */
public static final String Table_Name="GL_0317Book";

@XendraTrl(Identifier="ed4f0e38-f61e-48e0-91b7-7b4132b83e2e")
public static String es_PE_COLUMN_activo_b_Name="activo_b";

@XendraColumn(AD_Element_ID="3556d920-576f-4241-8590-9bc7a4d0210a",ColumnName="activo_b",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ed4f0e38-f61e-48e0-91b7-7b4132b83e2e",
Synchronized="2020-03-03 21:37:53.0")
/** Column name activo_b */
public static final String COLUMNNAME_activo_b = "activo_b";

@XendraTrl(Identifier="fa127771-330d-4f80-b9d7-f1ddb8d72a58")
public static String es_PE_COLUMN_DateAcct_Name="Account Date";

@XendraColumn(AD_Element_ID="034727d0-e80f-fadf-3d4f-2d8d37b75669",ColumnName="DateAcct",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fa127771-330d-4f80-b9d7-f1ddb8d72a58",
Synchronized="2020-03-03 21:37:53.0")
/** Column name DateAcct */
public static final String COLUMNNAME_DateAcct = "DateAcct";

@XendraTrl(Identifier="1922198e-91ef-4d8e-beec-843d053ff503")
public static String es_PE_COLUMN_debe_f_Name="debe_f";

@XendraColumn(AD_Element_ID="02f4df82-5a08-48f3-957b-a038332436c2",ColumnName="debe_f",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1922198e-91ef-4d8e-beec-843d053ff503",
Synchronized="2020-03-03 21:37:53.0")
/** Column name debe_f */
public static final String COLUMNNAME_debe_f = "debe_f";

@XendraTrl(Identifier="ace4eb68-76b9-4fc7-8cd7-6d8f07cc14ee")
public static String es_PE_COLUMN_debe_i_Name="debe_i";

@XendraColumn(AD_Element_ID="4f1203a4-12ef-4e1b-bdd5-b964090ab8f9",ColumnName="debe_i",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ace4eb68-76b9-4fc7-8cd7-6d8f07cc14ee",
Synchronized="2020-03-03 21:37:53.0")
/** Column name debe_i */
public static final String COLUMNNAME_debe_i = "debe_i";

@XendraTrl(Identifier="b2f5b14b-1935-4b5e-aa2b-a7cf7942c3b1")
public static String es_PE_COLUMN_debe_m_Name="debe_m";

@XendraColumn(AD_Element_ID="2b7a636e-42c8-43d4-b57a-7136824d4874",ColumnName="debe_m",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b2f5b14b-1935-4b5e-aa2b-a7cf7942c3b1",
Synchronized="2020-03-03 21:37:53.0")
/** Column name debe_m */
public static final String COLUMNNAME_debe_m = "debe_m";

@XendraTrl(Identifier="01bb4e18-e186-4f59-9c04-d57193747181")
public static String es_PE_COLUMN_gasto_rn_Name="gasto_rn";

@XendraColumn(AD_Element_ID="aef3a34e-7913-4bb3-acac-28de06975140",ColumnName="gasto_rn",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="01bb4e18-e186-4f59-9c04-d57193747181",
Synchronized="2020-03-03 21:37:53.0")
/** Column name gasto_rn */
public static final String COLUMNNAME_gasto_rn = "gasto_rn";

@XendraTrl(Identifier="321bdae7-8583-42eb-916d-8b71c512d7c4")
public static String es_PE_COLUMN_haber_f_Name="haber_f";

@XendraColumn(AD_Element_ID="f955299e-2761-46ec-8e46-0b0d783ab2ca",ColumnName="haber_f",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="321bdae7-8583-42eb-916d-8b71c512d7c4",
Synchronized="2020-03-03 21:37:53.0")
/** Column name haber_f */
public static final String COLUMNNAME_haber_f = "haber_f";

@XendraTrl(Identifier="08c5efa9-3e0f-4e95-9021-5ef2e4501b44")
public static String es_PE_COLUMN_haber_i_Name="haber_i";

@XendraColumn(AD_Element_ID="ef9be9e8-b0dc-44d8-94d5-00e67b23861a",ColumnName="haber_i",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="08c5efa9-3e0f-4e95-9021-5ef2e4501b44",
Synchronized="2020-03-03 21:37:53.0")
/** Column name haber_i */
public static final String COLUMNNAME_haber_i = "haber_i";

@XendraTrl(Identifier="ccb6309d-2f31-4a6f-97da-4c2cceda238d")
public static String es_PE_COLUMN_haber_m_Name="haber_m";

@XendraColumn(AD_Element_ID="ce8394dd-e61a-4e8f-bf70-42b6bc815f52",ColumnName="haber_m",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ccb6309d-2f31-4a6f-97da-4c2cceda238d",
Synchronized="2020-03-03 21:37:53.0")
/** Column name haber_m */
public static final String COLUMNNAME_haber_m = "haber_m";

@XendraTrl(Identifier="35fd1120-b111-4268-9b6e-ac54c56b0756")
public static String es_PE_COLUMN_ingreso_rn_Name="ingreso_rn";

@XendraColumn(AD_Element_ID="b8f83c73-7abc-4061-bdc1-eb18df8ff0d4",ColumnName="ingreso_rn",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="35fd1120-b111-4268-9b6e-ac54c56b0756",
Synchronized="2020-03-03 21:37:53.0")
/** Column name ingreso_rn */
public static final String COLUMNNAME_ingreso_rn = "ingreso_rn";

@XendraTrl(Identifier="1559ce6b-973b-4fce-82d4-bcc229347df4")
public static String es_PE_COLUMN_nameacct_Name="nameacct";

@XendraColumn(AD_Element_ID="685af745-82ee-4361-b373-91e48892eecb",ColumnName="nameacct",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1559ce6b-973b-4fce-82d4-bcc229347df4",
Synchronized="2020-03-03 21:37:53.0")
/** Column name nameacct */
public static final String COLUMNNAME_nameacct = "nameacct";

@XendraTrl(Identifier="0dcfb47b-b262-4e6d-bed7-dfdb4b640554")
public static String es_PE_COLUMN_pasivo_b_Name="pasivo_b";

@XendraColumn(AD_Element_ID="de3cbccd-9be1-48de-b732-18e778567c31",ColumnName="pasivo_b",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0dcfb47b-b262-4e6d-bed7-dfdb4b640554",
Synchronized="2020-03-03 21:37:53.0")
/** Column name pasivo_b */
public static final String COLUMNNAME_pasivo_b = "pasivo_b";

@XendraTrl(Identifier="f0c8b8e5-3d12-4352-9034-6630348f6f7f")
public static String es_PE_COLUMN_valueacct_Name="valueacct";

@XendraColumn(AD_Element_ID="81c4da9e-290e-4bcc-9882-e6c6d1401f0e",ColumnName="valueacct",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f0c8b8e5-3d12-4352-9034-6630348f6f7f",
Synchronized="2020-03-03 21:37:53.0")
/** Column name valueacct */
public static final String COLUMNNAME_valueacct = "valueacct";
	@XendraView(Identifier="1d1d43cf-8764-4764-915f-573b83159e14",
Synchronized="2016-10-08 14:04:04.0",
Name="gl_0317book",
Owner="xendra",
Extension="")
	public static final String Identifier = "1d1d43cf-8764-4764-915f-573b83159e14";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2016-10-08 14:04:04.0");
	sb.appendln("@Identifier=1d1d43cf-8764-4764-915f-573b83159e14");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT foo.ad_client_id, foo.ad_org_id, foo.dateacct, foo.valueacct, foo.nameacct, foo.debe_i, foo.haber_i, foo.debe_m, foo.haber_m, foo.debe_f, foo.haber_f, foo.activo_b, foo.pasivo_b, foo.gasto_rn, foo.ingreso_rn FROM ((((SELECT f.ad_org_id, ev.value AS valueacct, ev.name AS nameacct, f.dateacct, f.c_period_id, f.ad_client_id, f.amtacctdr AS debe_i, f.amtacctcr AS haber_i, 0 AS debe_m, 0 AS haber_m, 0 AS debe_f, 0 AS haber_f, 0 AS activo_b, 0 AS pasivo_b, 0 AS gasto_rn, 0 AS ingreso_rn FROM (fact_acct f JOIN c_elementvalue ev ON ((f.account_id = ev.c_elementvalue_id))) WHERE ((f.isopendocument)::text = 'Y'::text) UNION ALL SELECT f.ad_org_id, ev.value AS valueacct, ev.name AS nameacct, f.dateacct, f.c_period_id, f.ad_client_id, 0 AS debe_i, 0 AS haber_i, f.amtacctdr AS debe_m, f.amtacctcr AS haber_m, 0 AS debe_f, 0 AS haber_f, 0 AS activo_b, 0 AS pasivo_b, 0 AS gasto_rn, 0 AS ingreso_rn FROM (fact_acct f JOIN c_elementvalue ev ON ((f.account_id = ev.c_elementvalue_id))) WHERE ((f.isopendocument)::text = 'N'::text)) UNION ALL SELECT f.ad_org_id, ev.value AS valueacct, ev.name AS nameacct, f.dateacct, f.c_period_id, f.ad_client_id, 0 AS debe_i, 0 AS haber_i, 0 AS debe_m, 0 AS haber_m, f.amtacctdr AS debe_f, f.amtacctcr AS haber_f, 0 AS activo_b, 0 AS pasivo_b, 0 AS gasto_rn, 0 AS ingreso_rn FROM (fact_acct f JOIN c_elementvalue ev ON ((f.account_id = ev.c_elementvalue_id)))) UNION ALL SELECT f.ad_org_id, ev.value AS valueacct, ev.name AS nameacct, f.dateacct, f.c_period_id, f.ad_client_id, 0 AS debe_i, 0 AS haber_i, 0 AS debe_m, 0 AS haber_m, 0 AS debe_f, 0 AS haber_f, f.amtacctdr AS activo_b, f.amtacctcr AS pasivo_b, 0 AS gasto_rn, 0 AS ingreso_rn FROM (fact_acct f JOIN c_elementvalue ev ON ((f.account_id = ev.c_elementvalue_id))) WHERE (ev.c_subject_id > (0)::numeric)) UNION ALL SELECT f.ad_org_id, ev.value AS valueacct, ev.name AS nameacct, f.dateacct, f.c_period_id, f.ad_client_id, 0 AS debe_i, 0 AS haber_i, 0 AS debe_m, 0 AS haber_m, 0 AS debe_f, 0 AS haber_f, 0 AS activo_b, 0 AS pasivo_b, f.amtacctdr AS gasto_rn, f.amtacctcr AS ingreso_rn FROM (fact_acct f JOIN c_elementvalue ev ON ((f.account_id = ev.c_elementvalue_id))) WHERE (ev.egpn_c_subject_id > (0)::numeric)) foo;");
	return sb.toString();
}
}
