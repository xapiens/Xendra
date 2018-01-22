package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_C_rfqresponselineqty_v 
{
 
@XendraTable(Name="C_RfQResponseLineQty_v",Description="",Help="",
TableName="C_RfQResponseLineQty_v",AccessLevel="3",
AD_Window_ID="00321465-3813-5160-b116-f76e77af89f6",AD_Val_Rule_ID="",IsKey=0,LoadSeq=150,
IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=true,IsChangeLog=false,IsView=true,
PO_Window_ID="",ID="org.xendra.commercial",Identifier="c212ebb0-61a4-53d2-ad1b-923cac8b9715",
Synchronized="2017-08-16 12:37:09.0")
/** TableName=C_RfQResponseLineQty_v */
public static final String Table_Name="C_RfQResponseLineQty_v";

@XendraTrl(Identifier="485f8f4a-c06c-cace-0a8d-ac9822622fb6")
public static String es_PE_COLUMN_AD_Language_Name="Lenguaje";

@XendraColumn(AD_Element_ID="d542d9da-4627-0da8-89af-5797f22de434",ColumnName="AD_Language",
AD_Reference_ID=18,AD_Reference_Value_ID="136e26cd-6ffa-f76c-1e63-cce5ed2025b9",AD_Val_Rule_ID="",
FieldLength=5,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="485f8f4a-c06c-cace-0a8d-ac9822622fb6",Synchronized="2017-08-16 12:37:09.0")
/** Column name AD_Language */
public static final String COLUMNNAME_AD_Language = "AD_Language";

@XendraTrl(Identifier="ec6cb053-e08d-9635-58b1-ff98998cc4ac")
public static String es_PE_COLUMN_C_RfQLineQty_ID_Name="Cantidad Línea SPC (RfQ)";

@XendraColumn(AD_Element_ID="0b965a1c-169a-5f4d-8d6b-307365dac356",ColumnName="C_RfQLineQty_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ec6cb053-e08d-9635-58b1-ff98998cc4ac",
Synchronized="2017-08-16 12:37:09.0")
/** Column name C_RfQLineQty_ID */
public static final String COLUMNNAME_C_RfQLineQty_ID = "C_RfQLineQty_ID";

@XendraTrl(Identifier="ec6f32ac-050c-6ff3-7c80-46828a6cbe0f")
public static String es_PE_COLUMN_C_RfQResponseLine_ID_Name="Línea Respuesta SPC (RfQ)";

@XendraColumn(AD_Element_ID="e9dada94-ac8d-3082-c345-8d3967bffa06",
ColumnName="C_RfQResponseLine_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="ec6f32ac-050c-6ff3-7c80-46828a6cbe0f",Synchronized="2017-08-16 12:37:09.0")
/** Column name C_RfQResponseLine_ID */
public static final String COLUMNNAME_C_RfQResponseLine_ID = "C_RfQResponseLine_ID";
/** Column name C_RfQResponseLineQty_ID */
public static final String COLUMNNAME_C_RfQResponseLineQty_ID = "C_RfQResponseLineQty_ID";

@XendraTrl(Identifier="80c6fc0b-baac-f2d0-3454-a08b5251e69e")
public static String es_PE_COLUMN_C_UOM_ID_Name="UM";

@XendraColumn(AD_Element_ID="d0345019-4fcc-44c8-4fd1-e38e3b4adeed",ColumnName="C_UOM_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="80c6fc0b-baac-f2d0-3454-a08b5251e69e",
Synchronized="2017-08-16 12:37:09.0")
/** Column name C_UOM_ID */
public static final String COLUMNNAME_C_UOM_ID = "C_UOM_ID";

@XendraTrl(Identifier="8ee18756-476c-d286-d7bf-037f04d02f6e")
public static String es_PE_COLUMN_Discount_Name="% Descuento";

@XendraColumn(AD_Element_ID="3d8e2bac-29ff-f758-dd80-f9b4107077e6",ColumnName="Discount",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8ee18756-476c-d286-d7bf-037f04d02f6e",
Synchronized="2017-08-16 12:37:09.0")
/** Column name Discount */
public static final String COLUMNNAME_Discount = "Discount";

@XendraTrl(Identifier="9b37e87b-03e7-cf25-0fb8-5815c81ead70")
public static String es_PE_COLUMN_Price_Name="Precio";

@XendraColumn(AD_Element_ID="aafaa7a6-6897-fb14-1b29-1dc3b61047b9",ColumnName="Price",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9b37e87b-03e7-cf25-0fb8-5815c81ead70",
Synchronized="2017-08-16 12:37:09.0")
/** Column name Price */
public static final String COLUMNNAME_Price = "Price";

@XendraTrl(Identifier="b45e9686-92dd-1565-8c7a-b5cc4a67ee95")
public static String es_PE_COLUMN_Qty_Name="Cantidad";

@XendraColumn(AD_Element_ID="c9d74a25-87c5-9592-5660-4f397607dad3",ColumnName="Qty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b45e9686-92dd-1565-8c7a-b5cc4a67ee95",
Synchronized="2017-08-16 12:37:09.0")
/** Column name Qty */
public static final String COLUMNNAME_Qty = "Qty";

@XendraTrl(Identifier="87d38332-ca5f-8752-a4aa-b8e84fd458d5")
public static String es_PE_COLUMN_UOMSymbol_Name="Símbolo";

@XendraColumn(AD_Element_ID="ccb82b4f-2e57-da9a-16a8-8fd48d94adf5",ColumnName="UOMSymbol",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="87d38332-ca5f-8752-a4aa-b8e84fd458d5",
Synchronized="2017-08-16 12:37:09.0")
/** Column name UOMSymbol */
public static final String COLUMNNAME_UOMSymbol = "UOMSymbol";
	@XendraView(Identifier="c212ebb0-61a4-53d2-ad1b-923cac8b9715",
Synchronized="2013-07-09 19:02:34.0",
Name="c_rfqresponselineqty_v",
Owner="xendra",
Extension="")
	public static final String Identifier = "c212ebb0-61a4-53d2-ad1b-923cac8b9715";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-07-09 19:02:34.0");
	sb.appendln("@Identifier=c212ebb0-61a4-53d2-ad1b-923cac8b9715");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT rq.c_rfqresponseline_id, rq.c_rfqresponselineqty_id, rq.c_rfqlineqty_id, rq.ad_client_id, rq.ad_org_id, rq.isactive, rq.created, rq.createdby, rq.updated, rq.updatedby, 'en_US'::character varying AS ad_language, q.c_uom_id, uom.uomsymbol, q.qty, rq.price, rq.discount FROM ((c_rfqresponselineqty rq JOIN c_rfqlineqty q ON ((rq.c_rfqlineqty_id = q.c_rfqlineqty_id))) JOIN c_uom uom ON ((q.c_uom_id = uom.c_uom_id))) WHERE ((rq.isactive = 'Y'::bpchar) AND (q.isactive = 'Y'::bpchar));");
	return sb.toString();
}
}
