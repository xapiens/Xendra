package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_Rv_carding 
{
 
@XendraTable(Name="rv_carding",AD_Package_ID="1b3656e5-71c7-1296-994e-9b2c4549c7fd",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",TableName="rv_carding",
AccessLevel="4",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=0,LoadSeq=0,IsSecurityEnabled=false,
IsDeleteable=false,IsHighVolume=false,IsChangeLog=false,IsView=true,PO_Window_ID="",
ID="org.xendra.standard",Identifier="113fa24f-7e6e-4886-b71f-f57fd383bf31",
Synchronized="2020-03-03 21:39:47.0")
/** TableName=rv_carding */
public static final String Table_Name="rv_carding";

@XendraTrl(Identifier="a5c93f84-411b-4d65-91a3-131e9643afa5")
public static String es_PE_COLUMN_C_DocType_ID_Name="Document Type";

@XendraColumn(AD_Element_ID="099a4147-1a72-cdd0-81e0-8bdbc8c0b883",ColumnName="C_DocType_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a5c93f84-411b-4d65-91a3-131e9643afa5",
Synchronized="2020-03-03 21:39:47.0")
/** Column name C_DocType_ID */
public static final String COLUMNNAME_C_DocType_ID = "C_DocType_ID";

@XendraTrl(Identifier="c629b11b-46ab-40eb-9a5e-3d338825d852")
public static String es_PE_COLUMN_DocumentNo_Name="Document No";

@XendraColumn(AD_Element_ID="e3ca6e28-702a-2722-d941-b2072a0de9cb",ColumnName="DocumentNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c629b11b-46ab-40eb-9a5e-3d338825d852",
Synchronized="2020-03-03 21:39:47.0")
/** Column name DocumentNo */
public static final String COLUMNNAME_DocumentNo = "DocumentNo";

@XendraTrl(Identifier="7d59192e-fa6a-4b86-a900-64952f9e015c")
public static String es_PE_COLUMN_MovementDate_Name="Movement Date";

@XendraColumn(AD_Element_ID="7a907f01-8525-820d-22d4-98b06d4b902b",ColumnName="MovementDate",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7d59192e-fa6a-4b86-a900-64952f9e015c",
Synchronized="2020-03-03 21:39:47.0")
/** Column name MovementDate */
public static final String COLUMNNAME_MovementDate = "MovementDate";

@XendraTrl(Identifier="acf9dd52-7e73-4b0e-9e39-e6bb8c39bf58")
public static String es_PE_COLUMN_M_Product_ID_Name="Product";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="acf9dd52-7e73-4b0e-9e39-e6bb8c39bf58",
Synchronized="2020-03-03 21:39:47.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";

@XendraTrl(Identifier="b486c5d0-4e09-4e98-ab80-8bde1525d754")
public static String es_PE_COLUMN_M_Warehouse_ID_Name="Warehouse";

@XendraColumn(AD_Element_ID="402045cd-baa5-aeaf-b148-a921dffb7821",ColumnName="M_Warehouse_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b486c5d0-4e09-4e98-ab80-8bde1525d754",
Synchronized="2020-03-03 21:39:47.0")
/** Column name M_Warehouse_ID */
public static final String COLUMNNAME_M_Warehouse_ID = "M_Warehouse_ID";

@XendraTrl(Identifier="dea5eb58-0abd-4087-a6a8-67d5d2648ba3")
public static String es_PE_COLUMN_PriceActual_Name="Unit Price";

@XendraColumn(AD_Element_ID="8ee15d33-8f4b-598f-dc4c-9d67f968a13c",ColumnName="PriceActual",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="dea5eb58-0abd-4087-a6a8-67d5d2648ba3",
Synchronized="2020-03-03 21:39:47.0")
/** Column name PriceActual */
public static final String COLUMNNAME_PriceActual = "PriceActual";

@XendraTrl(Identifier="08f75e71-4900-4ec8-9aef-bbf168616542")
public static String es_PE_COLUMN_QtySource_Name="QtySource";

@XendraColumn(AD_Element_ID="7b714dd7-94b2-ea8c-a460-44cf2b400f35",ColumnName="QtySource",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="08f75e71-4900-4ec8-9aef-bbf168616542",
Synchronized="2020-03-03 21:39:47.0")
/** Column name QtySource */
public static final String COLUMNNAME_QtySource = "QtySource";
	@XendraView(Identifier="5e25e5d1-2cc8-7d17-8441-39b40b8689d5",
Synchronized="2017-01-12 10:36:34.0",
Name="rv_carding",
Owner="xendra",
Extension="")
	public static final String Identifier = "5e25e5d1-2cc8-7d17-8441-39b40b8689d5";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2017-01-12 10:36:34.0");
	sb.appendln("@Identifier=5e25e5d1-2cc8-7d17-8441-39b40b8689d5");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT mc.ad_client_id, mc.ad_org_id, mc.m_product_id, mc.movementdate, mc.m_warehouse_id, mc.qtysource, mc.c_doctype_id, mc.documentno, CASE WHEN (mc.priceactual = (0)::numeric) THEN getaveragecost(mc.ad_client_id, sc.m_costelement_id, mc.m_product_id, mc.movementdate, true) ELSE mc.priceactual END AS priceactual FROM (m_carding mc JOIN c_acctschema sc ON ((mc.ad_client_id = sc.ad_client_id)));");
	return sb.toString();
}
}
