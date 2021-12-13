package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_C_project_details_v 
{
 
@XendraTable(Name="C_Project_Details_v",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Project Print View",Help="",
TableName="C_Project_Details_v",AccessLevel="1",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=0,
LoadSeq=150,IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=true,IsChangeLog=false,
IsView=true,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="c1da5c8b-ef85-ea1b-ecec-485b27042f22",Synchronized="2020-03-03 21:37:31.0")
/** TableName=C_Project_Details_v */
public static final String Table_Name="C_Project_Details_v";

@XendraTrl(Identifier="bbe27bae-cc14-b873-0e75-03aa06ee0476")
public static String es_PE_COLUMN_AD_Language_Name="Lenguaje";

@XendraColumn(AD_Element_ID="d542d9da-4627-0da8-89af-5797f22de434",ColumnName="AD_Language",
AD_Reference_ID=18,AD_Reference_Value_ID="136e26cd-6ffa-f76c-1e63-cce5ed2025b9",AD_Val_Rule_ID="",
FieldLength=5,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="bbe27bae-cc14-b873-0e75-03aa06ee0476",Synchronized="2020-03-03 21:37:31.0")
/** Column name AD_Language */
public static final String COLUMNNAME_AD_Language = "AD_Language";

@XendraTrl(Identifier="74759ca1-8870-53a3-57ca-fb7dc2d5ff4d")
public static String es_PE_COLUMN_CommittedAmt_Name="Total Comprometido";

@XendraColumn(AD_Element_ID="f000c6dd-f023-d000-0be4-e67375a2a641",ColumnName="CommittedAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="74759ca1-8870-53a3-57ca-fb7dc2d5ff4d",
Synchronized="2020-03-03 21:37:31.0")
/** Column name CommittedAmt */
public static final String COLUMNNAME_CommittedAmt = "CommittedAmt";

@XendraTrl(Identifier="10e83003-a083-212a-2945-f95102fa04a5")
public static String es_PE_COLUMN_CommittedQty_Name="Cantidad Cometida";

@XendraColumn(AD_Element_ID="ca943d4f-7852-e710-d8eb-028f698c75a5",ColumnName="CommittedQty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="10e83003-a083-212a-2945-f95102fa04a5",
Synchronized="2020-03-03 21:37:31.0")
/** Column name CommittedQty */
public static final String COLUMNNAME_CommittedQty = "CommittedQty";

@XendraTrl(Identifier="3c58a320-257e-5525-25ea-10e494112799")
public static String es_PE_COLUMN_C_Project_ID_Name="Proyecto";

@XendraColumn(AD_Element_ID="16ff5dcc-9178-73dd-e618-e88bd79d573b",ColumnName="C_Project_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3c58a320-257e-5525-25ea-10e494112799",
Synchronized="2020-03-03 21:37:31.0")
/** Column name C_Project_ID */
public static final String COLUMNNAME_C_Project_ID = "C_Project_ID";
/** Column name C_ProjectLine_ID */
public static final String COLUMNNAME_C_ProjectLine_ID = "C_ProjectLine_ID";

@XendraTrl(Identifier="b616b5c2-741b-8d95-c165-0f4b51bfffcc")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b616b5c2-741b-8d95-c165-0f4b51bfffcc",
Synchronized="2020-03-03 21:37:31.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";

@XendraTrl(Identifier="2724e42b-88f9-eae1-8204-4431e822b084")
public static String es_PE_COLUMN_DocumentNote_Name="Nota de Documento";

@XendraColumn(AD_Element_ID="facce503-36ce-65e5-ad96-c872503feb2e",ColumnName="DocumentNote",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2724e42b-88f9-eae1-8204-4431e822b084",
Synchronized="2020-03-03 21:37:31.0")
/** Column name DocumentNote */
public static final String COLUMNNAME_DocumentNote = "DocumentNote";

@XendraTrl(Identifier="0e0c8326-bf1c-e057-85b2-b06e95bdab5d")
public static String es_PE_COLUMN_InvoicedAmt_Name="Cuenta Facturada";

@XendraColumn(AD_Element_ID="e31ccacf-d322-b66d-1d03-702dced2cbb8",ColumnName="InvoicedAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0e0c8326-bf1c-e057-85b2-b06e95bdab5d",
Synchronized="2020-03-03 21:37:31.0")
/** Column name InvoicedAmt */
public static final String COLUMNNAME_InvoicedAmt = "InvoicedAmt";

@XendraTrl(Identifier="bc02ae7b-5522-b40a-1c26-12a0284d5dc1")
public static String es_PE_COLUMN_InvoicedQty_Name="Cantidad Facturada";

@XendraColumn(AD_Element_ID="2b11e63f-05c2-ba1b-c83e-4ba51253ea7f",ColumnName="InvoicedQty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bc02ae7b-5522-b40a-1c26-12a0284d5dc1",
Synchronized="2020-03-03 21:37:31.0")
/** Column name InvoicedQty */
public static final String COLUMNNAME_InvoicedQty = "InvoicedQty";

@XendraTrl(Identifier="b2992bc3-3f31-d873-cdd2-47ecd8dd5194")
public static String es_PE_COLUMN_Line_Name="No. Línea";

@XendraColumn(AD_Element_ID="986ef077-61da-f9cf-1c6d-aefe3a35113b",ColumnName="Line",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b2992bc3-3f31-d873-cdd2-47ecd8dd5194",
Synchronized="2020-03-03 21:37:31.0")
/** Column name Line */
public static final String COLUMNNAME_Line = "Line";

@XendraTrl(Identifier="e08b5c27-6263-c6d4-2b72-269d1b1077d4")
public static String es_PE_COLUMN_M_Product_Category_ID_Name="Categoría del Producto";

@XendraColumn(AD_Element_ID="80d3e0bb-473b-67d4-42d5-1d776006a69c",
ColumnName="M_Product_Category_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="e08b5c27-6263-c6d4-2b72-269d1b1077d4",Synchronized="2020-03-03 21:37:31.0")
/** Column name M_Product_Category_ID */
public static final String COLUMNNAME_M_Product_Category_ID = "M_Product_Category_ID";

@XendraTrl(Identifier="9e82f177-b6e2-dd36-387f-37ebaec17d0e")
public static String es_PE_COLUMN_M_Product_ID_Name="Producto";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9e82f177-b6e2-dd36-387f-37ebaec17d0e",
Synchronized="2020-03-03 21:37:31.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";

@XendraTrl(Identifier="28d7a93f-ce6b-1b2b-e05c-0c220782db6f")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="28d7a93f-ce6b-1b2b-e05c-0c220782db6f",
Synchronized="2020-03-03 21:37:31.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";

@XendraTrl(Identifier="bc1f55e8-a41c-00c2-e4e7-1ef47683f2bd")
public static String es_PE_COLUMN_PlannedAmt_Name="Total Planeado";

@XendraColumn(AD_Element_ID="7d2e668d-1293-27b7-a5ff-85f836dc7388",ColumnName="PlannedAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bc1f55e8-a41c-00c2-e4e7-1ef47683f2bd",
Synchronized="2020-03-03 21:37:31.0")
/** Column name PlannedAmt */
public static final String COLUMNNAME_PlannedAmt = "PlannedAmt";

@XendraTrl(Identifier="32150b6b-52b4-adbb-5d76-0a67926c510d")
public static String es_PE_COLUMN_PlannedMarginAmt_Name="Margen Planeado";

@XendraColumn(AD_Element_ID="413b1b88-7cf5-d00d-2f30-730014b2fce9",ColumnName="PlannedMarginAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="32150b6b-52b4-adbb-5d76-0a67926c510d",
Synchronized="2020-03-03 21:37:31.0")
/** Column name PlannedMarginAmt */
public static final String COLUMNNAME_PlannedMarginAmt = "PlannedMarginAmt";

@XendraTrl(Identifier="e5c301c9-dcc5-4266-db19-d0917dd26631")
public static String es_PE_COLUMN_PlannedPrice_Name="Precio Planeado";

@XendraColumn(AD_Element_ID="f723b5b6-4855-6bc4-a4a2-1b8952564718",ColumnName="PlannedPrice",
AD_Reference_ID=37,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e5c301c9-dcc5-4266-db19-d0917dd26631",
Synchronized="2020-03-03 21:37:31.0")
/** Column name PlannedPrice */
public static final String COLUMNNAME_PlannedPrice = "PlannedPrice";

@XendraTrl(Identifier="c1fe6b00-14b5-785b-89e2-e15f75644474")
public static String es_PE_COLUMN_PlannedQty_Name="Cantidad Planeada";

@XendraColumn(AD_Element_ID="d4461654-1565-2b21-28c4-41673a75f16b",ColumnName="PlannedQty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c1fe6b00-14b5-785b-89e2-e15f75644474",
Synchronized="2020-03-03 21:37:31.0")
/** Column name PlannedQty */
public static final String COLUMNNAME_PlannedQty = "PlannedQty";

@XendraTrl(Identifier="9273a670-2279-5de6-f3a9-db15fcb850ef")
public static String es_PE_COLUMN_ProductValue_Name="Sólo Valor de Producto";

@XendraColumn(AD_Element_ID="3c72be08-8fa7-5282-1e16-ddcbc46035d8",ColumnName="ProductValue",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9273a670-2279-5de6-f3a9-db15fcb850ef",
Synchronized="2020-03-03 21:37:31.0")
/** Column name ProductValue */
public static final String COLUMNNAME_ProductValue = "ProductValue";

@XendraTrl(Identifier="d6e1f632-71d6-6ebd-0e8c-d2ff0469dfa7")
public static String es_PE_COLUMN_SKU_Name="UM Almacenamiento";

@XendraColumn(AD_Element_ID="f473a6ed-4a3f-b6fd-5b0f-06d49c1e65e2",ColumnName="SKU",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d6e1f632-71d6-6ebd-0e8c-d2ff0469dfa7",
Synchronized="2020-03-03 21:37:31.0")
/** Column name SKU */
public static final String COLUMNNAME_SKU = "SKU";

@XendraTrl(Identifier="677f5ef1-0756-4f9e-96d6-80a8c08d0f97")
public static String es_PE_COLUMN_UPC_Name="UPC/EAN";

@XendraColumn(AD_Element_ID="9e36272a-ec41-b187-d531-cec50070c612",ColumnName="UPC",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="677f5ef1-0756-4f9e-96d6-80a8c08d0f97",
Synchronized="2020-03-03 21:37:31.0")
/** Column name UPC */
public static final String COLUMNNAME_UPC = "UPC";
	@XendraView(Identifier="c1da5c8b-ef85-ea1b-ecec-485b27042f22",
Synchronized="2013-07-09 19:02:34.0",
Name="c_project_details_v",
Owner="xendra",
Extension="")
	public static final String Identifier = "c1da5c8b-ef85-ea1b-ecec-485b27042f22";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-07-09 19:02:34.0");
	sb.appendln("@Identifier=c1da5c8b-ef85-ea1b-ecec-485b27042f22");
	sb.appendln("@comment=Project Print View");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT pl.ad_client_id, pl.ad_org_id, pl.isactive, pl.created, pl.createdby, pl.updated, pl.updatedby, 'en_US'::character varying AS ad_language, pj.c_project_id, pl.c_projectline_id, pl.line, pl.plannedqty, pl.plannedprice, pl.plannedamt, pl.plannedmarginamt, pl.committedamt, pl.m_product_id, COALESCE(p.name, pl.description) AS name, CASE WHEN (p.name IS NOT NULL) THEN pl.description ELSE NULL::character varying END AS description, p.documentnote, p.upc, p.sku, p.value AS productvalue, pl.m_product_category_id, pl.invoicedamt, pl.invoicedqty, pl.committedqty FROM ((c_projectline pl JOIN c_project pj ON ((pl.c_project_id = pj.c_project_id))) LEFT JOIN m_product p ON ((pl.m_product_id = p.m_product_id))) WHERE (pl.isprinted = 'Y'::bpchar);");
	return sb.toString();
}
}
