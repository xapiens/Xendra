package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_Qtyonhand 
{
 
@XendraTable(Name="QtyOnHand",Description="",Help="",TableName="QtyOnHand",AccessLevel="3",
AD_Window_ID="",AD_Val_Rule_ID="",IsKey=0,LoadSeq=0,IsSecurityEnabled=false,IsDeleteable=false,
IsHighVolume=true,IsChangeLog=false,IsView=true,PO_Window_ID="",ID="org.xendra.standard",
Identifier="68138833-2594-9108-dfd0-847833a0c1f9",Synchronized="2017-08-16 12:38:20.0")
/** TableName=QtyOnHand */
public static final String Table_Name="QtyOnHand";

@XendraTrl(Identifier="ab6363e8-c6b0-6b6a-e242-55b41a1dd38e")
public static String es_PE_COLUMN_a_Name="a";

@XendraColumn(AD_Element_ID="16785432-31ef-14f5-dc9f-54d2281df686",ColumnName="a",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ab6363e8-c6b0-6b6a-e242-55b41a1dd38e",
Synchronized="2017-08-16 12:38:19.0")
/** Column name a */
public static final String COLUMNNAME_a = "a";

@XendraTrl(Identifier="6b8d225d-b2ed-f9da-49d8-b14849ca0440")
public static String es_PE_COLUMN_b_Name="b";

@XendraColumn(AD_Element_ID="4d68e30d-109f-93f5-32df-895ed23db5ad",ColumnName="b",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6b8d225d-b2ed-f9da-49d8-b14849ca0440",
Synchronized="2017-08-16 12:38:19.0")
/** Column name b */
public static final String COLUMNNAME_b = "b";

@XendraTrl(Identifier="b7d67965-8e62-2f58-4e4e-90d4d4b1e618")
public static String es_PE_COLUMN_c_Name="c";

@XendraColumn(AD_Element_ID="d644b3d9-eb86-f57c-9721-3136d396f7c5",ColumnName="c",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b7d67965-8e62-2f58-4e4e-90d4d4b1e618",
Synchronized="2017-08-16 12:38:19.0")
/** Column name c */
public static final String COLUMNNAME_c = "c";

@XendraTrl(Identifier="40074062-6919-3e2a-334c-97aa1ce20160")
public static String es_PE_COLUMN_d_Name="d";

@XendraColumn(AD_Element_ID="093dd4c4-5823-ec2f-6634-716ad28e9182",ColumnName="d",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="40074062-6919-3e2a-334c-97aa1ce20160",
Synchronized="2017-08-16 12:38:19.0")
/** Column name d */
public static final String COLUMNNAME_d = "d";

@XendraTrl(Identifier="dbde6749-9c25-6c9a-741b-9d59dcbbd751")
public static String es_PE_COLUMN_e_Name="e";

@XendraColumn(AD_Element_ID="efcc6a5c-97f4-5fb5-7f29-f8fad545e298",ColumnName="e",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="dbde6749-9c25-6c9a-741b-9d59dcbbd751",
Synchronized="2017-08-16 12:38:19.0")
/** Column name e */
public static final String COLUMNNAME_e = "e";

@XendraTrl(Identifier="a860c1c8-c53f-1039-6d8b-17e98ab91fc6")
public static String es_PE_COLUMN_f_Name="f";

@XendraColumn(AD_Element_ID="56514e8b-c444-b136-0eeb-4d31c392284f",ColumnName="f",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a860c1c8-c53f-1039-6d8b-17e98ab91fc6",
Synchronized="2017-08-16 12:38:19.0")
/** Column name f */
public static final String COLUMNNAME_f = "f";

@XendraTrl(Identifier="9a6283cd-9ad4-c88d-d8a1-923df8c49cc6")
public static String es_PE_COLUMN_g_Name="g";

@XendraColumn(AD_Element_ID="d53b7b12-d389-1379-479d-cb266f9dc19a",ColumnName="g",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9a6283cd-9ad4-c88d-d8a1-923df8c49cc6",
Synchronized="2017-08-16 12:38:19.0")
/** Column name g */
public static final String COLUMNNAME_g = "g";

@XendraTrl(Identifier="9e448525-edea-5b5a-d26a-701290732b98")
public static String es_PE_COLUMN_h_Name="h";

@XendraColumn(AD_Element_ID="b0870b44-a077-e585-7604-f20579b95b20",ColumnName="h",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9e448525-edea-5b5a-d26a-701290732b98",
Synchronized="2017-08-16 12:38:19.0")
/** Column name h */
public static final String COLUMNNAME_h = "h";

@XendraTrl(Identifier="75247d53-7b18-3ba0-ec4d-6b2b0d114575")
public static String es_PE_COLUMN_i_Name="i";

@XendraColumn(AD_Element_ID="e25d6ff5-b004-f3d8-527b-dad491c49039",ColumnName="i",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="75247d53-7b18-3ba0-ec4d-6b2b0d114575",
Synchronized="2017-08-16 12:38:19.0")
/** Column name i */
public static final String COLUMNNAME_i = "i";

@XendraTrl(Identifier="c3d4980b-c084-d697-db1d-939c7482676a")
public static String es_PE_COLUMN_j_Name="j";

@XendraColumn(AD_Element_ID="deef696e-7089-4238-f005-d30c111ce09c",ColumnName="j",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c3d4980b-c084-d697-db1d-939c7482676a",
Synchronized="2017-08-16 12:38:19.0")
/** Column name j */
public static final String COLUMNNAME_j = "j";

@XendraTrl(Identifier="6c37554e-d4bc-8ffc-3e2d-bbf30f3b66c3")
public static String es_PE_COLUMN_k_Name="k";

@XendraColumn(AD_Element_ID="0ba0f81a-39c4-7162-eb52-b79a5ef2857f",ColumnName="k",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6c37554e-d4bc-8ffc-3e2d-bbf30f3b66c3",
Synchronized="2017-08-16 12:38:19.0")
/** Column name k */
public static final String COLUMNNAME_k = "k";

@XendraTrl(Identifier="9992953a-61ab-d15f-3aac-30156eeec57f")
public static String es_PE_COLUMN_l_Name="l";

@XendraColumn(AD_Element_ID="9d936129-5e37-2920-3b1e-f4035fc54786",ColumnName="l",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9992953a-61ab-d15f-3aac-30156eeec57f",
Synchronized="2017-08-16 12:38:19.0")
/** Column name l */
public static final String COLUMNNAME_l = "l";

@XendraTrl(Identifier="fe31289b-d6dc-bfa4-280f-df7263686202")
public static String es_PE_COLUMN_m_Name="m";

@XendraColumn(AD_Element_ID="4aba33cb-064e-ef9a-ff73-b9522140ae46",ColumnName="m",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fe31289b-d6dc-bfa4-280f-df7263686202",
Synchronized="2017-08-16 12:38:19.0")
/** Column name m */
public static final String COLUMNNAME_m = "m";

@XendraTrl(Identifier="06bb498c-8362-c5d1-297e-5b9c3f2f5230")
public static String es_PE_COLUMN_M_Product_ID_Name="Product";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="06bb498c-8362-c5d1-297e-5b9c3f2f5230",
Synchronized="2017-08-16 12:38:19.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";

@XendraTrl(Identifier="bd5d3943-b803-e05d-a399-2f3b77b624e1")
public static String es_PE_COLUMN_n_Name="n";

@XendraColumn(AD_Element_ID="c796e8c3-c754-e665-352d-cdee72d028fc",ColumnName="n",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bd5d3943-b803-e05d-a399-2f3b77b624e1",
Synchronized="2017-08-16 12:38:19.0")
/** Column name n */
public static final String COLUMNNAME_n = "n";

@XendraTrl(Identifier="685b0a3e-ecec-bb97-f445-02804a957c74")
public static String es_PE_COLUMN_o_Name="o";

@XendraColumn(AD_Element_ID="56a72713-aef6-25a5-3604-a4ee7dd9b80e",ColumnName="o",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="685b0a3e-ecec-bb97-f445-02804a957c74",
Synchronized="2017-08-16 12:38:19.0")
/** Column name o */
public static final String COLUMNNAME_o = "o";

@XendraTrl(Identifier="d49e430e-5b0c-f267-b28d-f599d58b55bb")
public static String es_PE_COLUMN_p_Name="p";

@XendraColumn(AD_Element_ID="aa73a594-748b-93f9-7207-31ed658d1b1e",ColumnName="p",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d49e430e-5b0c-f267-b28d-f599d58b55bb",
Synchronized="2017-08-16 12:38:19.0")
/** Column name p */
public static final String COLUMNNAME_p = "p";

@XendraTrl(Identifier="ba6d1657-c5c3-e23e-bee2-fc6ffdf41bf8")
public static String es_PE_COLUMN_q_Name="q";

@XendraColumn(AD_Element_ID="b23f916a-5781-1daf-4947-4be0156b3cc9",ColumnName="q",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ba6d1657-c5c3-e23e-bee2-fc6ffdf41bf8",
Synchronized="2017-08-16 12:38:19.0")
/** Column name q */
public static final String COLUMNNAME_q = "q";

@XendraTrl(Identifier="29b71b68-b14c-8327-c40a-64eb09c2d266")
public static String es_PE_COLUMN_r_Name="r";

@XendraColumn(AD_Element_ID="fc7106d0-d1ee-8730-2b24-615ae66d14ec",ColumnName="r",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="29b71b68-b14c-8327-c40a-64eb09c2d266",
Synchronized="2017-08-16 12:38:19.0")
/** Column name r */
public static final String COLUMNNAME_r = "r";

@XendraTrl(Identifier="29e4a352-5283-cc0d-c9ce-83f4a0a1d390")
public static String es_PE_COLUMN_s_Name="s";

@XendraColumn(AD_Element_ID="93c3121a-2f3d-eafc-ba3a-ba840e667fcc",ColumnName="s",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="29e4a352-5283-cc0d-c9ce-83f4a0a1d390",
Synchronized="2017-08-16 12:38:19.0")
/** Column name s */
public static final String COLUMNNAME_s = "s";

@XendraTrl(Identifier="fc7285dc-0fad-17f4-fb69-a62b3a0f4133")
public static String es_PE_COLUMN_t_Name="t";

@XendraColumn(AD_Element_ID="428d248e-207a-07b2-341a-b035d26be716",ColumnName="t",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fc7285dc-0fad-17f4-fb69-a62b3a0f4133",
Synchronized="2017-08-16 12:38:19.0")
/** Column name t */
public static final String COLUMNNAME_t = "t";

@XendraTrl(Identifier="b18ce4b2-b9d0-7d9b-3a5a-486d892e6b19")
public static String es_PE_COLUMN_u_Name="u";

@XendraColumn(AD_Element_ID="df43f8e7-57c8-273b-0210-6ed21ef8dc78",ColumnName="u",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b18ce4b2-b9d0-7d9b-3a5a-486d892e6b19",
Synchronized="2017-08-16 12:38:19.0")
/** Column name u */
public static final String COLUMNNAME_u = "u";

@XendraTrl(Identifier="a157ec9e-01a6-8050-858e-2f2b7a77ae96")
public static String es_PE_COLUMN_v_Name="v";

@XendraColumn(AD_Element_ID="d4bce056-2e00-f3aa-e9bd-40b3b5219e41",ColumnName="v",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a157ec9e-01a6-8050-858e-2f2b7a77ae96",
Synchronized="2017-08-16 12:38:19.0")
/** Column name v */
public static final String COLUMNNAME_v = "v";

@XendraTrl(Identifier="57161fc4-ab11-eb53-8ac7-bfa7d6f7415f")
public static String es_PE_COLUMN_w_Name="w";

@XendraColumn(AD_Element_ID="9dacdba1-2bda-975c-83f3-377845f0aa50",ColumnName="w",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="57161fc4-ab11-eb53-8ac7-bfa7d6f7415f",
Synchronized="2017-08-16 12:38:20.0")
/** Column name w */
public static final String COLUMNNAME_w = "w";

@XendraTrl(Identifier="644ef391-b275-5a00-2641-357c3bef379f")
public static String es_PE_COLUMN_X_Name="Aisle (X)";

@XendraColumn(AD_Element_ID="c3c6ff0a-ca8d-218c-5162-6fda8fc182e7",ColumnName="X",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="644ef391-b275-5a00-2641-357c3bef379f",
Synchronized="2017-08-16 12:38:20.0")
/** Column name X */
public static final String COLUMNNAME_X = "X";

@XendraTrl(Identifier="1a15e029-29a0-e806-1d1f-3923259a59c9")
public static String es_PE_COLUMN_Y_Name="Bin (Y)";

@XendraColumn(AD_Element_ID="1bd4acc9-4368-301e-254c-862fd2d7d43b",ColumnName="Y",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1a15e029-29a0-e806-1d1f-3923259a59c9",
Synchronized="2017-08-16 12:38:20.0")
/** Column name Y */
public static final String COLUMNNAME_Y = "Y";

@XendraTrl(Identifier="651d37a3-905f-cf19-f7e3-abf7a013c57b")
public static String es_PE_COLUMN_Z_Name="Level (Z)";

@XendraColumn(AD_Element_ID="26f6808c-c825-8dcd-13eb-90b1876a3317",ColumnName="Z",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="651d37a3-905f-cf19-f7e3-abf7a013c57b",
Synchronized="2017-08-16 12:38:20.0")
/** Column name Z */
public static final String COLUMNNAME_Z = "Z";
	@XendraView(Identifier="68138833-2594-9108-dfd0-847833a0c1f9",
Synchronized="2014-05-30 23:35:34.0",
Name="qtyonhand",
Owner="xendra",
Extension="tablefunc")
	public static final String Identifier = "68138833-2594-9108-dfd0-847833a0c1f9";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2014-05-30 23:35:34.0");
	sb.appendln("@Extension=tablefunc");
	sb.appendln("@Identifier=68138833-2594-9108-dfd0-847833a0c1f9");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT qty.m_product_id, qty.a, qty.b, qty.c, qty.d, qty.e, qty.f FROM crosstab('select p.m_product_id, w.warbasetype,sum(s.qtyonhand) from m_storage s LEFT OUTER JOIN m_locator l ON s.m_locator_id = l.m_locator_id JOIN m_warehouse w ON l.m_warehouse_id = w.m_warehouse_id LEFT OUTER JOIN m_product p ON s.m_product_id = p.m_product_id  GROUP BY 1,2 ORDER BY 1'::text, 'SELECT DISTINCT warbasetype from m_warehouse ORDER BY 1  '::text) qty(m_product_id numeric(10,0), a numeric(10,0), b numeric(10,0), c numeric(10,0), d numeric(10,0), e numeric(10,0), f numeric(10,0), g numeric(10,0), h numeric(10,0), i numeric(10,0)) ORDER BY qty.m_product_id;");
	return sb.toString();
}
}
