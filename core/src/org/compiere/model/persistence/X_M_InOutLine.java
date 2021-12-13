/******************************************************************************
 * Product: Xendra ERP & CRM Smart Business Solution                          *
 * Copyright (C) 1999-2007 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software. you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY  without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
package org.compiere.model.persistence;

/** Generated Model - DO NOT CHANGE */
import org.compiere.model.*;
import java.util.*;
import java.sql.*;
import java.math.*;
import org.xendra.annotations.*;
import org.compiere.util.*;
/** Generated Model for M_InOutLine
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_InOutLine extends PO
{
/** Standard Constructor
@param ctx context
@param M_InOutLine_ID id
@param trxName transaction
*/
public X_M_InOutLine (Properties ctx, int M_InOutLine_ID, String trxName)
{
super (ctx, M_InOutLine_ID, trxName);
/** if (M_InOutLine_ID == 0)
{
setC_UOM_ID (0);	
// @#C_UOM_ID@
setIsDescription (false);	
// N
setIsInvoiced (false);	
// N
setLine (0);	
// @SQL=SELECT COALESCE(MAX(Line),0)+10 AS DefaultValue FROM M_InOutLine WHERE M_InOut_ID=@M_InOut_ID@
setM_AttributeSetInstance_ID (0);
setM_InOut_ID (0);
setM_InOutLine_ID (0);
setM_Locator_ID (0);	
// @M_Locator_ID@
setMovementQty (Env.ZERO);	
// 1
setProcessed (false);	
// N
setQtyEntered (Env.ZERO);	
// 1
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_M_InOutLine (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=320 */
public static int Table_ID=MTable.getTable_ID("M_InOutLine");

@XendraTrl(Identifier="e10d7b88-9639-97e1-c65a-c064a3e16e64")
public static String es_PE_TAB_ShipmentLine_Description="Ìtem de la Entrega";

@XendraTrl(Identifier="e10d7b88-9639-97e1-c65a-c064a3e16e64")
public static String es_PE_TAB_ShipmentLine_Help="La pestaña Ìtem de la Entrega define cada ítem en una entrega.";

@XendraTrl(Identifier="e10d7b88-9639-97e1-c65a-c064a3e16e64")
public static String es_PE_TAB_ShipmentLine_Name="Ìtem de la Entrega";

@XendraTab(Name="Shipment Line",Description="Shipment Line",
Help="The Shipment Line Tab defines the individual items in a Shipment.",
AD_Window_ID="e6e007b8-22d0-0418-baa2-2de7b38251fb",SeqNo=20,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="@Processed@=Y",
DisplayLogic="",IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="e10d7b88-9639-97e1-c65a-c064a3e16e64",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_ShipmentLine="e10d7b88-9639-97e1-c65a-c064a3e16e64";

@XendraTrl(Identifier="db93a6dc-a6d3-5694-f203-389b98b1e2ec")
public static String es_PE_TAB_ReceiptLine_Description="Ìtem de la Entrega";

@XendraTrl(Identifier="db93a6dc-a6d3-5694-f203-389b98b1e2ec")
public static String es_PE_TAB_ReceiptLine_Help="La pestaña Ìtem de la Entrega define cada ítem en una entrega.";

@XendraTrl(Identifier="db93a6dc-a6d3-5694-f203-389b98b1e2ec")
public static String es_PE_TAB_ReceiptLine_Name="Ìtem del Recibo";
@XendraTab(Name="Receipt Line",
Description="Shipment Line",
Help="The Shipment Line Tab defines the individual items in a Shipment.",
AD_Window_ID="6856bd55-6f78-c775-449b-ef4aa2d1e170",SeqNo=20,TabLevel=1,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="@Processed@=Y",
DisplayLogic="",IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="db93a6dc-a6d3-5694-f203-389b98b1e2ec",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_ReceiptLine="db93a6dc-a6d3-5694-f203-389b98b1e2ec";

@XendraTrl(Identifier="823cf386-a30d-b331-d95d-7c1998f4733c")
public static String es_PE_TABLE_M_InOutLine_Name="Línea Entrega / Recibo";

@XendraTable(Name="Shipment/Receipt Line",AD_Package_ID="2809ac2d-7d43-20f8-05f0-a478f2e50204",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",
Description="Line on Shipment or Receipt document",Help="",TableName="M_InOutLine",AccessLevel="1",
AD_Window_ID="e6e007b8-22d0-0418-baa2-2de7b38251fb",AD_Val_Rule_ID="",IsKey=1,LoadSeq=120,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="6856bd55-6f78-c775-449b-ef4aa2d1e170",ID="org.xendra.material",
Identifier="823cf386-a30d-b331-d95d-7c1998f4733c",Synchronized="2020-11-02 17:51:49.0")
/** TableName=M_InOutLine */
public static final String Table_Name="M_InOutLine";


@XendraIndex(Name="m_inoutline_product",Identifier="8fd8015d-1732-2666-790b-4f4cd43cb2d4",
Column_Names="m_product_id",IsUnique="false",
TableIdentifier="8fd8015d-1732-2666-790b-4f4cd43cb2d4",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_m_inoutline_product = "8fd8015d-1732-2666-790b-4f4cd43cb2d4";


@XendraIndex(Name="m_inoutline_orderline",Identifier="1b204d66-7993-2b25-b842-e2c1eab45b36",
Column_Names="c_orderline_id",IsUnique="false",
TableIdentifier="1b204d66-7993-2b25-b842-e2c1eab45b36",Synchronized="2016-05-25 19:03:58.0")
public static final String INDEXNAME_m_inoutline_orderline = "1b204d66-7993-2b25-b842-e2c1eab45b36";


@XendraIndex(Name="m_inoutline_carding",Identifier="f57000ef-3330-6887-9fc9-93ba6b36446c",
Column_Names="m_inout_id, (COALESCE(iscosted, 'N'::character varying)), isactive",IsUnique="false",
TableIdentifier="f57000ef-3330-6887-9fc9-93ba6b36446c",Synchronized="2014-06-03 23:07:58.0")
public static final String INDEXNAME_m_inoutline_carding = "f57000ef-3330-6887-9fc9-93ba6b36446c";


@XendraIndex(Name="m_inoutline_inout",Identifier="b5609c64-17a3-4510-8737-efa71e243b1c",
Column_Names="m_inout_id",IsUnique="false",TableIdentifier="b5609c64-17a3-4510-8737-efa71e243b1c",
Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_m_inoutline_inout = "b5609c64-17a3-4510-8737-efa71e243b1c";


@XendraIndex(Name="m_inoutline_identifier",Identifier="1d8245b7-c190-480a-ac95-ebeb3eb68fb4",
Column_Names="identifier",IsUnique="false",TableIdentifier="1d8245b7-c190-480a-ac95-ebeb3eb68fb4",
Synchronized="2020-11-02 17:51:49.0")
public static final String INDEXNAME_m_inoutline_identifier = "1d8245b7-c190-480a-ac95-ebeb3eb68fb4";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_InOutLine");

protected BigDecimal accessLevel = BigDecimal.valueOf(1);
/** AccessLevel
@return 1 - Org 
*/
protected int get_AccessLevel()
{
return accessLevel.intValue();
}
/** Load Meta Data
@param ctx context
@return PO Info
*/
protected POInfo initPO (Properties ctx)
{
  if (Table_ID == 0)
    Table_ID = MTable.getTable_ID("M_InOutLine");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_InOutLine[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Trx Organization.
@param AD_OrgTrx_ID Performing or initiating organization */
public void setAD_OrgTrx_ID (int AD_OrgTrx_ID)
{
if (AD_OrgTrx_ID <= 0) set_Value (COLUMNNAME_AD_OrgTrx_ID, null);
 else 
set_Value (COLUMNNAME_AD_OrgTrx_ID, Integer.valueOf(AD_OrgTrx_ID));
}
/** Get Trx Organization.
@return Performing or initiating organization */
public int getAD_OrgTrx_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_OrgTrx_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="8d6006d1-cca1-f9fa-a86b-896a71d1d195")
public static String es_PE_FIELD_ShipmentLine_TrxOrganization_Name="Organización de la Trans.";

@XendraTrl(Identifier="8d6006d1-cca1-f9fa-a86b-896a71d1d195")
public static String es_PE_FIELD_ShipmentLine_TrxOrganization_Description="Organización que inicia ó ejecuta la transacción";

@XendraTrl(Identifier="8d6006d1-cca1-f9fa-a86b-896a71d1d195")
public static String es_PE_FIELD_ShipmentLine_TrxOrganization_Help="La organización que inicia ó ejecuta la transacción (para otra organización). La organización poseedora puede no ser la organización de la transacción en un ambiente de buró de servicio; con servicios centralizados y transacciones inter- organización.";

@XendraField(AD_Column_ID="AD_OrgTrx_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e10d7b88-9639-97e1-c65a-c064a3e16e64",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@$Element_OT@=Y",DisplayLength=10,IsReadOnly=false,SeqNo=190,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="8d6006d1-cca1-f9fa-a86b-896a71d1d195")
public static final String FIELDNAME_ShipmentLine_TrxOrganization="8d6006d1-cca1-f9fa-a86b-896a71d1d195";

@XendraTrl(Identifier="7c1f9d5b-3e41-a7ed-6c1f-e3f43d159c58")
public static String es_PE_FIELD_ReceiptLine_TrxOrganization_Name="Organización de la Trans.";

@XendraTrl(Identifier="7c1f9d5b-3e41-a7ed-6c1f-e3f43d159c58")
public static String es_PE_FIELD_ReceiptLine_TrxOrganization_Description="Organización que inicia ó ejecuta la transacción";

@XendraTrl(Identifier="7c1f9d5b-3e41-a7ed-6c1f-e3f43d159c58")
public static String es_PE_FIELD_ReceiptLine_TrxOrganization_Help="La organización que inicia ó ejecuta la transacción (para otra organización). La organización poseedora puede no ser la organización de la transacción en un ambiente de buró de servicio; con servicios centralizados y transacciones inter- organización.";

@XendraField(AD_Column_ID="AD_OrgTrx_ID",IsCentrallyMaintained=true,
AD_Tab_ID="db93a6dc-a6d3-5694-f203-389b98b1e2ec",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@$Element_OT@=Y",DisplayLength=10,IsReadOnly=false,SeqNo=190,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="7c1f9d5b-3e41-a7ed-6c1f-e3f43d159c58")
public static final String FIELDNAME_ReceiptLine_TrxOrganization="7c1f9d5b-3e41-a7ed-6c1f-e3f43d159c58";

@XendraTrl(Identifier="42eb99bd-2755-bea6-2724-10fefb06fd8f")
public static String es_PE_COLUMN_AD_OrgTrx_ID_Name="Organización de la Trans.";

@XendraColumn(AD_Element_ID="b4180358-67aa-fe55-0409-6367a60e0a2e",ColumnName="AD_OrgTrx_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="54e78591-f7f4-c613-ea27-e64b3dac5198",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="42eb99bd-2755-bea6-2724-10fefb06fd8f",Synchronized="2020-03-03 21:38:26.0")
/** Column name AD_OrgTrx_ID */
public static final String COLUMNNAME_AD_OrgTrx_ID = "AD_OrgTrx_ID";
/** Set Activity.
@param C_Activity_ID Business Activity */
public void setC_Activity_ID (int C_Activity_ID)
{
if (C_Activity_ID <= 0) set_Value (COLUMNNAME_C_Activity_ID, null);
 else 
set_Value (COLUMNNAME_C_Activity_ID, Integer.valueOf(C_Activity_ID));
}
/** Get Activity.
@return Business Activity */
public int getC_Activity_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Activity_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="5b9b29cd-a440-bc01-a445-fb12d1f226b1")
public static String es_PE_FIELD_ShipmentLine_Activity_Name="Tipo de Gasto";

@XendraTrl(Identifier="5b9b29cd-a440-bc01-a445-fb12d1f226b1")
public static String es_PE_FIELD_ShipmentLine_Activity_Description="Actividad de Negocio";

@XendraTrl(Identifier="5b9b29cd-a440-bc01-a445-fb12d1f226b1")
public static String es_PE_FIELD_ShipmentLine_Activity_Help="Las actividades indican tareas que son ejecutadas en el curso de un negocio; las actividades son usadas para el costeo por actividad (ABC)";

@XendraField(AD_Column_ID="C_Activity_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e10d7b88-9639-97e1-c65a-c064a3e16e64",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@$Element_AY@='Y'",DisplayLength=10,IsReadOnly=false,SeqNo=180,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="5b9b29cd-a440-bc01-a445-fb12d1f226b1")
public static final String FIELDNAME_ShipmentLine_Activity="5b9b29cd-a440-bc01-a445-fb12d1f226b1";

@XendraTrl(Identifier="cdd86099-f4c9-f596-98ba-eeb1fd0d3419")
public static String es_PE_FIELD_ReceiptLine_Activity_Name="Tipo de Gasto";

@XendraTrl(Identifier="cdd86099-f4c9-f596-98ba-eeb1fd0d3419")
public static String es_PE_FIELD_ReceiptLine_Activity_Description="Actividad de Negocio";

@XendraTrl(Identifier="cdd86099-f4c9-f596-98ba-eeb1fd0d3419")
public static String es_PE_FIELD_ReceiptLine_Activity_Help="Las actividades indican tareas que son ejecutadas en el curso de un negocio; las actividades son usadas para el costeo por actividad (ABC)";

@XendraField(AD_Column_ID="C_Activity_ID",IsCentrallyMaintained=true,
AD_Tab_ID="db93a6dc-a6d3-5694-f203-389b98b1e2ec",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@$Element_AY@='Y'",DisplayLength=10,IsReadOnly=false,SeqNo=180,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="cdd86099-f4c9-f596-98ba-eeb1fd0d3419")
public static final String FIELDNAME_ReceiptLine_Activity="cdd86099-f4c9-f596-98ba-eeb1fd0d3419";

@XendraTrl(Identifier="5d8c32cd-055b-03c9-6af3-347a5d7ccabe")
public static String es_PE_COLUMN_C_Activity_ID_Name="Tipo de Gasto";

@XendraColumn(AD_Element_ID="bfeadbb3-d866-26e3-8eee-3e2fdf0ff753",ColumnName="C_Activity_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="079b2687-77a7-3004-9b77-18ca68ffe4fc",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="5d8c32cd-055b-03c9-6af3-347a5d7ccabe",Synchronized="2020-03-03 21:38:26.0")
/** Column name C_Activity_ID */
public static final String COLUMNNAME_C_Activity_ID = "C_Activity_ID";
/** Set Campaign.
@param C_CampaignBonus_ID Campaign */
public void setC_CampaignBonus_ID (int C_CampaignBonus_ID)
{
if (C_CampaignBonus_ID <= 0) set_Value (COLUMNNAME_C_CampaignBonus_ID, null);
 else 
set_Value (COLUMNNAME_C_CampaignBonus_ID, Integer.valueOf(C_CampaignBonus_ID));
}
/** Get Campaign.
@return Campaign */
public int getC_CampaignBonus_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_CampaignBonus_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="7d2a2756-e5c5-5c91-1a1b-55ebb68e5117")
public static String es_PE_FIELD_ShipmentLine_Campaign_Name="Camp.Bonificacion";

@XendraField(AD_Column_ID="C_CampaignBonus_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e10d7b88-9639-97e1-c65a-c064a3e16e64",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=250,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7d2a2756-e5c5-5c91-1a1b-55ebb68e5117")
public static final String FIELDNAME_ShipmentLine_Campaign="7d2a2756-e5c5-5c91-1a1b-55ebb68e5117";

@XendraTrl(Identifier="2aa08150-d4b2-e325-3303-2c6b008ca7ce")
public static String es_PE_COLUMN_C_CampaignBonus_ID_Name="Campaign";

@XendraColumn(AD_Element_ID="a5f39b6e-5196-25a2-48dd-348f1075c264",ColumnName="C_CampaignBonus_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2aa08150-d4b2-e325-3303-2c6b008ca7ce",
Synchronized="2020-03-03 21:38:26.0")
/** Column name C_CampaignBonus_ID */
public static final String COLUMNNAME_C_CampaignBonus_ID = "C_CampaignBonus_ID";
/** Set C_CampaignDiscount_ID.
@param C_CampaignDiscount_ID C_CampaignDiscount_ID */
public void setC_CampaignDiscount_ID (int C_CampaignDiscount_ID)
{
if (C_CampaignDiscount_ID <= 0) set_Value (COLUMNNAME_C_CampaignDiscount_ID, null);
 else 
set_Value (COLUMNNAME_C_CampaignDiscount_ID, Integer.valueOf(C_CampaignDiscount_ID));
}
/** Get C_CampaignDiscount_ID.
@return C_CampaignDiscount_ID */
public int getC_CampaignDiscount_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_CampaignDiscount_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="3288ab22-d7fc-a557-c16b-10cd01bc73a7")
public static String es_PE_FIELD_ShipmentLine_C_CampaignDiscount_ID_Name="Camp.Descuento";

@XendraField(AD_Column_ID="C_CampaignDiscount_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e10d7b88-9639-97e1-c65a-c064a3e16e64",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=260,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3288ab22-d7fc-a557-c16b-10cd01bc73a7")
public static final String FIELDNAME_ShipmentLine_C_CampaignDiscount_ID="3288ab22-d7fc-a557-c16b-10cd01bc73a7";

@XendraTrl(Identifier="216c4131-24ac-bda1-d73c-c24e782c156b")
public static String es_PE_COLUMN_C_CampaignDiscount_ID_Name="C_CampaignDiscount_ID";

@XendraColumn(AD_Element_ID="e2aa5f05-083c-4f10-c01d-1ec55801a24f",
ColumnName="C_CampaignDiscount_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="216c4131-24ac-bda1-d73c-c24e782c156b",Synchronized="2020-03-03 21:38:27.0")
/** Column name C_CampaignDiscount_ID */
public static final String COLUMNNAME_C_CampaignDiscount_ID = "C_CampaignDiscount_ID";
/** Set Campaign.
@param C_Campaign_ID Marketing Campaign */
public void setC_Campaign_ID (int C_Campaign_ID)
{
if (C_Campaign_ID <= 0) set_Value (COLUMNNAME_C_Campaign_ID, null);
 else 
set_Value (COLUMNNAME_C_Campaign_ID, Integer.valueOf(C_Campaign_ID));
}
/** Get Campaign.
@return Marketing Campaign */
public int getC_Campaign_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Campaign_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="c3cc0daa-82ca-1ef6-4a2f-32925fbdee4e")
public static String es_PE_FIELD_ShipmentLine_Campaign2_Name="Campaña";

@XendraTrl(Identifier="c3cc0daa-82ca-1ef6-4a2f-32925fbdee4e")
public static String es_PE_FIELD_ShipmentLine_Campaign2_Description="Campaña de Mercadeo";

@XendraTrl(Identifier="c3cc0daa-82ca-1ef6-4a2f-32925fbdee4e")
public static String es_PE_FIELD_ShipmentLine_Campaign2_Help="La Campaña define un programa de mercadotecnia único. Los proyectos pueden estar asociados con una campaña de mercadotecnia única. Usted puede entonces reportar basado en una campaña específica";

@XendraField(AD_Column_ID="C_Campaign_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e10d7b88-9639-97e1-c65a-c064a3e16e64",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@$Element_MC@='Y'",DisplayLength=10,IsReadOnly=false,SeqNo=270,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="c3cc0daa-82ca-1ef6-4a2f-32925fbdee4e")
public static final String FIELDNAME_ShipmentLine_Campaign2="c3cc0daa-82ca-1ef6-4a2f-32925fbdee4e";

@XendraTrl(Identifier="7e449354-b02b-27a7-e33e-c7ab4d66a5fe")
public static String es_PE_FIELD_ReceiptLine_Campaign_Name="Campaña";

@XendraTrl(Identifier="7e449354-b02b-27a7-e33e-c7ab4d66a5fe")
public static String es_PE_FIELD_ReceiptLine_Campaign_Description="Campaña de Mercadeo";

@XendraTrl(Identifier="7e449354-b02b-27a7-e33e-c7ab4d66a5fe")
public static String es_PE_FIELD_ReceiptLine_Campaign_Help="La Campaña define un programa de mercadotecnia único. Los proyectos pueden estar asociados con una campaña de mercadotecnia única. Usted puede entonces reportar basado en una campaña específica";

@XendraField(AD_Column_ID="C_Campaign_ID",IsCentrallyMaintained=true,
AD_Tab_ID="db93a6dc-a6d3-5694-f203-389b98b1e2ec",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@$Element_MC@='Y'",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="7e449354-b02b-27a7-e33e-c7ab4d66a5fe")
public static final String FIELDNAME_ReceiptLine_Campaign="7e449354-b02b-27a7-e33e-c7ab4d66a5fe";

@XendraTrl(Identifier="d6d192a1-c752-8837-4fa8-4466f8db7ff6")
public static String es_PE_COLUMN_C_Campaign_ID_Name="Campaña";

@XendraColumn(AD_Element_ID="6cf08e31-d355-ee38-9c0b-bee20b3ea5b6",ColumnName="C_Campaign_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="8e0d532d-2e55-9877-ef0b-a5950455e031",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="d6d192a1-c752-8837-4fa8-4466f8db7ff6",Synchronized="2020-03-03 21:38:27.0")
/** Column name C_Campaign_ID */
public static final String COLUMNNAME_C_Campaign_ID = "C_Campaign_ID";
/** Set Charge.
@param C_Charge_ID Additional document charges */
public void setC_Charge_ID (int C_Charge_ID)
{
if (C_Charge_ID <= 0) set_Value (COLUMNNAME_C_Charge_ID, null);
 else 
set_Value (COLUMNNAME_C_Charge_ID, Integer.valueOf(C_Charge_ID));
}
/** Get Charge.
@return Additional document charges */
public int getC_Charge_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Charge_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="27d3523e-dd13-ab32-ad26-f5b9db2387fe")
public static String es_PE_FIELD_ShipmentLine_Charge_Name="Cargo";

@XendraTrl(Identifier="27d3523e-dd13-ab32-ad26-f5b9db2387fe")
public static String es_PE_FIELD_ShipmentLine_Charge_Description="Cargos adicionales del documento";

@XendraTrl(Identifier="27d3523e-dd13-ab32-ad26-f5b9db2387fe")
public static String es_PE_FIELD_ShipmentLine_Charge_Help="El cargo indica un tipo de cargo (manejo; despacho; reposición)";

@XendraField(AD_Column_ID="C_Charge_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e10d7b88-9639-97e1-c65a-c064a3e16e64",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@C_Charge_ID@!0",DisplayLength=14,IsReadOnly=false,SeqNo=90,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="27d3523e-dd13-ab32-ad26-f5b9db2387fe")
public static final String FIELDNAME_ShipmentLine_Charge="27d3523e-dd13-ab32-ad26-f5b9db2387fe";

@XendraTrl(Identifier="5eec9395-f639-e1b2-b2dc-584d44b72e0f")
public static String es_PE_FIELD_ReceiptLine_Charge_Name="Cargo";

@XendraTrl(Identifier="5eec9395-f639-e1b2-b2dc-584d44b72e0f")
public static String es_PE_FIELD_ReceiptLine_Charge_Description="Cargos adicionales del documento";

@XendraTrl(Identifier="5eec9395-f639-e1b2-b2dc-584d44b72e0f")
public static String es_PE_FIELD_ReceiptLine_Charge_Help="El cargo indica un tipo de cargo (manejo; despacho; reposición)";

@XendraField(AD_Column_ID="C_Charge_ID",IsCentrallyMaintained=true,
AD_Tab_ID="db93a6dc-a6d3-5694-f203-389b98b1e2ec",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@C_Charge_ID@!0",DisplayLength=14,IsReadOnly=false,SeqNo=90,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="5eec9395-f639-e1b2-b2dc-584d44b72e0f")
public static final String FIELDNAME_ReceiptLine_Charge="5eec9395-f639-e1b2-b2dc-584d44b72e0f";

@XendraTrl(Identifier="756f020d-af20-d2ba-edb9-6aaeac345819")
public static String es_PE_COLUMN_C_Charge_ID_Name="Cargo";

@XendraColumn(AD_Element_ID="d7e2fc48-a26e-4ded-ea44-fe15849a7883",ColumnName="C_Charge_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="756f020d-af20-d2ba-edb9-6aaeac345819",
Synchronized="2020-03-03 21:38:27.0")
/** Column name C_Charge_ID */
public static final String COLUMNNAME_C_Charge_ID = "C_Charge_ID";
/** Set Confirmed Quantity.
@param ConfirmedQty Confirmation of a received quantity */
public void setConfirmedQty (BigDecimal ConfirmedQty)
{
set_Value (COLUMNNAME_ConfirmedQty, ConfirmedQty);
}
/** Get Confirmed Quantity.
@return Confirmation of a received quantity */
public BigDecimal getConfirmedQty() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_ConfirmedQty);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="5c71f003-3fa3-53a4-2c0e-00a6cfa62480")
public static String es_PE_FIELD_ShipmentLine_ConfirmedQuantity_Name="Cantidad Confirmada";

@XendraTrl(Identifier="5c71f003-3fa3-53a4-2c0e-00a6cfa62480")
public static String es_PE_FIELD_ShipmentLine_ConfirmedQuantity_Description="Confirmación de la cantidad recibida";

@XendraTrl(Identifier="5c71f003-3fa3-53a4-2c0e-00a6cfa62480")
public static String es_PE_FIELD_ShipmentLine_ConfirmedQuantity_Help="Confirmación de la cantidad recibida";

@XendraField(AD_Column_ID="ConfirmedQty",IsCentrallyMaintained=true,
AD_Tab_ID="e10d7b88-9639-97e1-c65a-c064a3e16e64",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=160,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5c71f003-3fa3-53a4-2c0e-00a6cfa62480")
public static final String FIELDNAME_ShipmentLine_ConfirmedQuantity="5c71f003-3fa3-53a4-2c0e-00a6cfa62480";

@XendraTrl(Identifier="32586e74-95fb-1ce3-ca2d-1643dc2c9328")
public static String es_PE_FIELD_ReceiptLine_ConfirmedQuantity_Name="Cantidad Confirmada";

@XendraTrl(Identifier="32586e74-95fb-1ce3-ca2d-1643dc2c9328")
public static String es_PE_FIELD_ReceiptLine_ConfirmedQuantity_Description="Confirmación de la cantidad recibida";

@XendraTrl(Identifier="32586e74-95fb-1ce3-ca2d-1643dc2c9328")
public static String es_PE_FIELD_ReceiptLine_ConfirmedQuantity_Help="Confirmación de la cantidad recibida";

@XendraField(AD_Column_ID="ConfirmedQty",IsCentrallyMaintained=true,
AD_Tab_ID="db93a6dc-a6d3-5694-f203-389b98b1e2ec",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=160,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="32586e74-95fb-1ce3-ca2d-1643dc2c9328")
public static final String FIELDNAME_ReceiptLine_ConfirmedQuantity="32586e74-95fb-1ce3-ca2d-1643dc2c9328";

@XendraTrl(Identifier="f7c1d513-8448-445a-f033-2c10e628d0f5")
public static String es_PE_COLUMN_ConfirmedQty_Name="Cantidad Confirmada";

@XendraColumn(AD_Element_ID="e612ae07-ebb5-65be-fcbd-a37419fb113f",ColumnName="ConfirmedQty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f7c1d513-8448-445a-f033-2c10e628d0f5",
Synchronized="2020-03-03 21:38:27.0")
/** Column name ConfirmedQty */
public static final String COLUMNNAME_ConfirmedQty = "ConfirmedQty";
/** Set Sales Order Line.
@param C_OrderLine_ID Sales Order Line */
public void setC_OrderLine_ID (int C_OrderLine_ID)
{
if (C_OrderLine_ID <= 0) set_ValueNoCheck (COLUMNNAME_C_OrderLine_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_C_OrderLine_ID, Integer.valueOf(C_OrderLine_ID));
}
/** Get Sales Order Line.
@return Sales Order Line */
public int getC_OrderLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_OrderLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="49d553f2-f673-ddf2-190c-18c741ecd215")
public static String es_PE_FIELD_ShipmentLine_SalesOrderLine_Name="Orden de venta";

@XendraTrl(Identifier="49d553f2-f673-ddf2-190c-18c741ecd215")
public static String es_PE_FIELD_ShipmentLine_SalesOrderLine_Description="Orden de venta";

@XendraTrl(Identifier="49d553f2-f673-ddf2-190c-18c741ecd215")
public static String es_PE_FIELD_ShipmentLine_SalesOrderLine_Help="La línea de orden de venta es un identificador único para una línea en una orden.";

@XendraField(AD_Column_ID="C_OrderLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e10d7b88-9639-97e1-c65a-c064a3e16e64",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="49d553f2-f673-ddf2-190c-18c741ecd215")
public static final String FIELDNAME_ShipmentLine_SalesOrderLine="49d553f2-f673-ddf2-190c-18c741ecd215";

@XendraTrl(Identifier="067cd162-ce86-9558-ed16-b94368d7f64d")
public static String es_PE_FIELD_ReceiptLine_PurchaseOrderLine_Name="Item";

@XendraTrl(Identifier="067cd162-ce86-9558-ed16-b94368d7f64d")
public static String es_PE_FIELD_ReceiptLine_PurchaseOrderLine_Description="Item de orden de compra";

@XendraTrl(Identifier="067cd162-ce86-9558-ed16-b94368d7f64d")
public static String es_PE_FIELD_ReceiptLine_PurchaseOrderLine_Help="Identificador único para una línea en una orden.";

@XendraField(AD_Column_ID="C_OrderLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="db93a6dc-a6d3-5694-f203-389b98b1e2ec",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@C_OrderLine_ID@!0",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="067cd162-ce86-9558-ed16-b94368d7f64d")
public static final String FIELDNAME_ReceiptLine_PurchaseOrderLine="067cd162-ce86-9558-ed16-b94368d7f64d";

@XendraTrl(Identifier="697f1873-9e66-1013-8385-ac6abe320022")
public static String es_PE_COLUMN_C_OrderLine_ID_Name="Línea";

@XendraColumn(AD_Element_ID="a94fbec0-0ef5-0f6c-033d-8286782321b0",ColumnName="C_OrderLine_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="b27829f4-05b7-228b-deee-80c566a951f4",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="org.compiere.model.CalloutInOut.orderLine",VFormat="",ValueMin="",ValueMax="",Version="1",
IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="697f1873-9e66-1013-8385-ac6abe320022",
Synchronized="2020-03-03 21:38:27.0")
/** Column name C_OrderLine_ID */
public static final String COLUMNNAME_C_OrderLine_ID = "C_OrderLine_ID";
/** Set Project.
@param C_Project_ID Financial Project */
public void setC_Project_ID (int C_Project_ID)
{
if (C_Project_ID <= 0) set_Value (COLUMNNAME_C_Project_ID, null);
 else 
set_Value (COLUMNNAME_C_Project_ID, Integer.valueOf(C_Project_ID));
}
/** Get Project.
@return Financial Project */
public int getC_Project_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Project_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="3f6cf26b-b080-6add-39dd-b6f724d8bbb2")
public static String es_PE_FIELD_ShipmentLine_Project_Name="Proyecto";

@XendraTrl(Identifier="3f6cf26b-b080-6add-39dd-b6f724d8bbb2")
public static String es_PE_FIELD_ShipmentLine_Project_Description="Identifica un proyecto único";

@XendraTrl(Identifier="3f6cf26b-b080-6add-39dd-b6f724d8bbb2")
public static String es_PE_FIELD_ShipmentLine_Project_Help="La ID de un proyecto es un identificador definido por el usuario para un proyecto";

@XendraField(AD_Column_ID="C_Project_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e10d7b88-9639-97e1-c65a-c064a3e16e64",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@$Element_PJ@=Y",DisplayLength=10,IsReadOnly=false,SeqNo=220,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="3f6cf26b-b080-6add-39dd-b6f724d8bbb2")
public static final String FIELDNAME_ShipmentLine_Project="3f6cf26b-b080-6add-39dd-b6f724d8bbb2";

@XendraTrl(Identifier="3cb46f60-962b-13e9-69fb-a1b60e4dd8c1")
public static String es_PE_FIELD_ReceiptLine_Project_Name="Proyecto";

@XendraTrl(Identifier="3cb46f60-962b-13e9-69fb-a1b60e4dd8c1")
public static String es_PE_FIELD_ReceiptLine_Project_Description="Identifica un proyecto único";

@XendraTrl(Identifier="3cb46f60-962b-13e9-69fb-a1b60e4dd8c1")
public static String es_PE_FIELD_ReceiptLine_Project_Help="La ID de un proyecto es un identificador definido por el usuario para un proyecto";

@XendraField(AD_Column_ID="C_Project_ID",IsCentrallyMaintained=true,
AD_Tab_ID="db93a6dc-a6d3-5694-f203-389b98b1e2ec",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@$Element_PJ@=Y",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3cb46f60-962b-13e9-69fb-a1b60e4dd8c1")
public static final String FIELDNAME_ReceiptLine_Project="3cb46f60-962b-13e9-69fb-a1b60e4dd8c1";

@XendraTrl(Identifier="cc903757-dc18-8830-248f-8359807c680e")
public static String es_PE_COLUMN_C_Project_ID_Name="Proyecto";

@XendraColumn(AD_Element_ID="16ff5dcc-9178-73dd-e618-e88bd79d573b",ColumnName="C_Project_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="961cbc99-cc24-46df-b94e-37fe139285bf",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="cc903757-dc18-8830-248f-8359807c680e",Synchronized="2020-03-03 21:38:27.0")
/** Column name C_Project_ID */
public static final String COLUMNNAME_C_Project_ID = "C_Project_ID";
/** Set Project Phase.
@param C_ProjectPhase_ID Phase of a Project */
public void setC_ProjectPhase_ID (int C_ProjectPhase_ID)
{
if (C_ProjectPhase_ID <= 0) set_Value (COLUMNNAME_C_ProjectPhase_ID, null);
 else 
set_Value (COLUMNNAME_C_ProjectPhase_ID, Integer.valueOf(C_ProjectPhase_ID));
}
/** Get Project Phase.
@return Phase of a Project */
public int getC_ProjectPhase_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_ProjectPhase_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="53d11bb5-3117-088f-c5d9-912c4178c40e")
public static String es_PE_FIELD_ShipmentLine_ProjectPhase_Name="Fase del Proyecto";

@XendraTrl(Identifier="53d11bb5-3117-088f-c5d9-912c4178c40e")
public static String es_PE_FIELD_ShipmentLine_ProjectPhase_Description="Fase del Proyecto";

@XendraField(AD_Column_ID="C_ProjectPhase_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e10d7b88-9639-97e1-c65a-c064a3e16e64",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@$Element_PJ@=Y",DisplayLength=10,IsReadOnly=false,SeqNo=230,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="53d11bb5-3117-088f-c5d9-912c4178c40e")
public static final String FIELDNAME_ShipmentLine_ProjectPhase="53d11bb5-3117-088f-c5d9-912c4178c40e";

@XendraTrl(Identifier="bb279893-3a74-dd67-5e4b-20f8c3f54737")
public static String es_PE_FIELD_ReceiptLine_ProjectPhase_Name="Fase del Proyecto";

@XendraTrl(Identifier="bb279893-3a74-dd67-5e4b-20f8c3f54737")
public static String es_PE_FIELD_ReceiptLine_ProjectPhase_Description="Fase del Proyecto";

@XendraField(AD_Column_ID="C_ProjectPhase_ID",IsCentrallyMaintained=true,
AD_Tab_ID="db93a6dc-a6d3-5694-f203-389b98b1e2ec",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@$Element_PJ@=Y",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bb279893-3a74-dd67-5e4b-20f8c3f54737")
public static final String FIELDNAME_ReceiptLine_ProjectPhase="bb279893-3a74-dd67-5e4b-20f8c3f54737";

@XendraTrl(Identifier="2e57023a-1a03-713c-9b81-7283fc0e071b")
public static String es_PE_COLUMN_C_ProjectPhase_ID_Name="Fase del Proyecto";

@XendraColumn(AD_Element_ID="ba6e5aab-8337-208a-03da-5712e50d4da9",ColumnName="C_ProjectPhase_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="69e5a46c-92d0-8660-9d0d-a7f1b354e9b9",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="2e57023a-1a03-713c-9b81-7283fc0e071b",Synchronized="2020-03-03 21:38:27.0")
/** Column name C_ProjectPhase_ID */
public static final String COLUMNNAME_C_ProjectPhase_ID = "C_ProjectPhase_ID";
/** Set Project Task.
@param C_ProjectTask_ID Actual Project Task in a Phase */
public void setC_ProjectTask_ID (int C_ProjectTask_ID)
{
if (C_ProjectTask_ID <= 0) set_Value (COLUMNNAME_C_ProjectTask_ID, null);
 else 
set_Value (COLUMNNAME_C_ProjectTask_ID, Integer.valueOf(C_ProjectTask_ID));
}
/** Get Project Task.
@return Actual Project Task in a Phase */
public int getC_ProjectTask_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_ProjectTask_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f100ee57-1822-cfff-7512-21eda820661a")
public static String es_PE_FIELD_ShipmentLine_ProjectTask_Name="Tarea del Proyecto";

@XendraTrl(Identifier="f100ee57-1822-cfff-7512-21eda820661a")
public static String es_PE_FIELD_ShipmentLine_ProjectTask_Description="Actual tarea en la fase del proyecto.";

@XendraTrl(Identifier="f100ee57-1822-cfff-7512-21eda820661a")
public static String es_PE_FIELD_ShipmentLine_ProjectTask_Help="Una tarea de proyecto en una fase de proyecto representa el trabajo real.";

@XendraField(AD_Column_ID="C_ProjectTask_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e10d7b88-9639-97e1-c65a-c064a3e16e64",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@$Element_PJ@=Y",DisplayLength=10,IsReadOnly=false,SeqNo=240,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="f100ee57-1822-cfff-7512-21eda820661a")
public static final String FIELDNAME_ShipmentLine_ProjectTask="f100ee57-1822-cfff-7512-21eda820661a";

@XendraTrl(Identifier="1c63acb7-2152-351b-3937-ce5fa90f75ee")
public static String es_PE_FIELD_ReceiptLine_ProjectTask_Name="Tarea del Proyecto";

@XendraTrl(Identifier="1c63acb7-2152-351b-3937-ce5fa90f75ee")
public static String es_PE_FIELD_ReceiptLine_ProjectTask_Description="Actual tarea en la fase del proyecto.";

@XendraTrl(Identifier="1c63acb7-2152-351b-3937-ce5fa90f75ee")
public static String es_PE_FIELD_ReceiptLine_ProjectTask_Help="Una tarea de proyecto en una fase de proyecto representa el trabajo real.";

@XendraField(AD_Column_ID="C_ProjectTask_ID",IsCentrallyMaintained=true,
AD_Tab_ID="db93a6dc-a6d3-5694-f203-389b98b1e2ec",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@$Element_PJ@=Y",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1c63acb7-2152-351b-3937-ce5fa90f75ee")
public static final String FIELDNAME_ReceiptLine_ProjectTask="1c63acb7-2152-351b-3937-ce5fa90f75ee";

@XendraTrl(Identifier="15e5ccbc-88f6-4f2c-810c-084e05d14b32")
public static String es_PE_COLUMN_C_ProjectTask_ID_Name="Tarea del Proyecto";

@XendraColumn(AD_Element_ID="1b2d7a20-215c-4f56-6077-83adcead0920",ColumnName="C_ProjectTask_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="53906434-74e2-0844-02ba-0367c21ac60c",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="15e5ccbc-88f6-4f2c-810c-084e05d14b32",Synchronized="2020-03-03 21:38:27.0")
/** Column name C_ProjectTask_ID */
public static final String COLUMNNAME_C_ProjectTask_ID = "C_ProjectTask_ID";
/** Set UOM.
@param C_UOM_ID Unit of Measure */
public void setC_UOM_ID (int C_UOM_ID)
{
if (C_UOM_ID < 1) throw new IllegalArgumentException ("C_UOM_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_UOM_ID, Integer.valueOf(C_UOM_ID));
}
/** Get UOM.
@return Unit of Measure */
public int getC_UOM_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_UOM_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="54ebf74b-bdb2-47b7-fa08-0f5fa3c10481")
public static String es_PE_FIELD_ShipmentLine_UOM_Name="UM";

@XendraTrl(Identifier="54ebf74b-bdb2-47b7-fa08-0f5fa3c10481")
public static String es_PE_FIELD_ShipmentLine_UOM_Description="Unidad de Medida";

@XendraTrl(Identifier="54ebf74b-bdb2-47b7-fa08-0f5fa3c10481")
public static String es_PE_FIELD_ShipmentLine_UOM_Help="La UM define una unidad de medida única no monetaria";

@XendraField(AD_Column_ID="C_UOM_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e10d7b88-9639-97e1-c65a-c064a3e16e64",AD_FieldGroup_ID="Quantities",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="54ebf74b-bdb2-47b7-fa08-0f5fa3c10481")
public static final String FIELDNAME_ShipmentLine_UOM="54ebf74b-bdb2-47b7-fa08-0f5fa3c10481";

@XendraTrl(Identifier="de984f60-4a78-d866-a6b3-021c1862b5f6")
public static String es_PE_FIELD_ReceiptLine_UOM_Name="UM";

@XendraTrl(Identifier="de984f60-4a78-d866-a6b3-021c1862b5f6")
public static String es_PE_FIELD_ReceiptLine_UOM_Description="Unidad de Medida";

@XendraTrl(Identifier="de984f60-4a78-d866-a6b3-021c1862b5f6")
public static String es_PE_FIELD_ReceiptLine_UOM_Help="La UM define una unidad de medida única no monetaria";

@XendraField(AD_Column_ID="C_UOM_ID",IsCentrallyMaintained=true,
AD_Tab_ID="db93a6dc-a6d3-5694-f203-389b98b1e2ec",AD_FieldGroup_ID="Quantities",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="de984f60-4a78-d866-a6b3-021c1862b5f6")
public static final String FIELDNAME_ReceiptLine_UOM="de984f60-4a78-d866-a6b3-021c1862b5f6";

@XendraTrl(Identifier="488615ba-4a85-77c9-a6e1-8cf485f76fd9")
public static String es_PE_COLUMN_C_UOM_ID_Name="UM";

@XendraColumn(AD_Element_ID="d0345019-4fcc-44c8-4fd1-e38e3b4adeed",ColumnName="C_UOM_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="107d46fd-952f-7ad3-6b0d-c74906c7b323",
FieldLength=22,DefaultValue="@#C_UOM_ID@",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="org.compiere.model.CalloutInOut.qty",VFormat="",ValueMin="",ValueMax="",Version="1",
IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="488615ba-4a85-77c9-a6e1-8cf485f76fd9",
Synchronized="2020-03-03 21:38:27.0")
/** Column name C_UOM_ID */
public static final String COLUMNNAME_C_UOM_ID = "C_UOM_ID";
/** Set Description.
@param Description Optional short DESCRIPTION of the record */
public void setDescription (String Description)
{
set_Value (COLUMNNAME_Description, Description);
}
/** Get Description.
@return Optional short DESCRIPTION of the record */
public String getDescription() 
{
String value = (String)get_Value(COLUMNNAME_Description);
if (value == null)
  return "";
if (value.contains("\""))
  value = value.replaceAll("\"","'");
if (value.contains("\n"))
  value = value.replaceAll("\n"," ");
if (value.contains(";"))
  value = value.replaceAll(";",":");
return value;
}

@XendraTrl(Identifier="08383f99-691c-866b-aac3-9c2e383f72f8")
public static String es_PE_FIELD_ShipmentLine_Description_Name="Observación";

@XendraTrl(Identifier="08383f99-691c-866b-aac3-9c2e383f72f8")
public static String es_PE_FIELD_ShipmentLine_Description_Description="Descripción corta opcional del registro";

@XendraTrl(Identifier="08383f99-691c-866b-aac3-9c2e383f72f8")
public static String es_PE_FIELD_ShipmentLine_Description_Help="Una descripción esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="e10d7b88-9639-97e1-c65a-c064a3e16e64",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="08383f99-691c-866b-aac3-9c2e383f72f8")
public static final String FIELDNAME_ShipmentLine_Description="08383f99-691c-866b-aac3-9c2e383f72f8";

@XendraTrl(Identifier="e8b4d24f-b8ec-ef08-a3ef-96c19f59b38c")
public static String es_PE_FIELD_ReceiptLine_Description_Name="Observación";

@XendraTrl(Identifier="e8b4d24f-b8ec-ef08-a3ef-96c19f59b38c")
public static String es_PE_FIELD_ReceiptLine_Description_Description="Descripción corta opcional del registro";

@XendraTrl(Identifier="e8b4d24f-b8ec-ef08-a3ef-96c19f59b38c")
public static String es_PE_FIELD_ReceiptLine_Description_Help="Una descripción esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="db93a6dc-a6d3-5694-f203-389b98b1e2ec",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e8b4d24f-b8ec-ef08-a3ef-96c19f59b38c")
public static final String FIELDNAME_ReceiptLine_Description="e8b4d24f-b8ec-ef08-a3ef-96c19f59b38c";

@XendraTrl(Identifier="5954e436-efb8-dc4f-27b3-126e2469aa64")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=true,ColumnSQL="",
IsAllowLogging=false,Identifier="5954e436-efb8-dc4f-27b3-126e2469aa64",
Synchronized="2020-03-03 21:38:27.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Identifier.
@param Identifier Identifier */
public void setIdentifier (String Identifier)
{
if (Identifier != null && Identifier.length() > 36)
{
log.warning("Length > 36 - truncated");
Identifier = Identifier.substring(0,35);
}
set_Value (COLUMNNAME_Identifier, Identifier);
}
/** Get Identifier.
@return Identifier */
public String getIdentifier() 
{
String value = (String)get_Value(COLUMNNAME_Identifier);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="90d664f3-1d19-41f8-9860-06d5ffd131db")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="90d664f3-1d19-41f8-9860-06d5ffd131db",
Synchronized="2020-03-03 21:38:27.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set IsCosted.
@param IsCosted IsCosted */
public void setIsCosted (boolean IsCosted)
{
set_Value (COLUMNNAME_IsCosted, Boolean.valueOf(IsCosted));
}
/** Get IsCosted.
@return IsCosted */
public boolean isCosted() 
{
Object oo = get_Value(COLUMNNAME_IsCosted);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="394a2dd5-4891-35af-b249-3c679431edd0")
public static String es_PE_COLUMN_IsCosted_Name="IsCosted";

@XendraColumn(AD_Element_ID="1d2cca33-7933-6933-e8cd-036ca4cb806e",ColumnName="IsCosted",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="394a2dd5-4891-35af-b249-3c679431edd0",
Synchronized="2020-03-03 21:38:27.0")
/** Column name IsCosted */
public static final String COLUMNNAME_IsCosted = "IsCosted";
/** Set Description Only.
@param IsDescription if true, the line is just DESCRIPTION and no transaction */
public void setIsDescription (boolean IsDescription)
{
set_Value (COLUMNNAME_IsDescription, Boolean.valueOf(IsDescription));
}
/** Get Description Only.
@return if true, the line is just DESCRIPTION and no transaction */
public boolean isDescription() 
{
Object oo = get_Value(COLUMNNAME_IsDescription);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="7192f2b9-0ae2-b530-07d1-d7f9d441ef48")
public static String es_PE_FIELD_ShipmentLine_DescriptionOnly_Name="Sólo Descripción";

@XendraTrl(Identifier="7192f2b9-0ae2-b530-07d1-d7f9d441ef48")
public static String es_PE_FIELD_ShipmentLine_DescriptionOnly_Description="Si es verdad, la línea es descripción justa y ninguna transacción.";

@XendraTrl(Identifier="7192f2b9-0ae2-b530-07d1-d7f9d441ef48")
public static String es_PE_FIELD_ShipmentLine_DescriptionOnly_Help="Si una línea es descripción solamente, Ej. el inventario del producto no se corrige. No se crea ningunas transacciones de la contabilidad y la cantidad ó los totales no se incluye en el documento. Esto para incluir líneas de detalle de descripción, Ej. para una orden de trabajo.";

@XendraField(AD_Column_ID="IsDescription",IsCentrallyMaintained=true,
AD_Tab_ID="e10d7b88-9639-97e1-c65a-c064a3e16e64",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7192f2b9-0ae2-b530-07d1-d7f9d441ef48")
public static final String FIELDNAME_ShipmentLine_DescriptionOnly="7192f2b9-0ae2-b530-07d1-d7f9d441ef48";

@XendraTrl(Identifier="f2da9f67-c6a1-f89f-85ce-c9b4b53bdea0")
public static String es_PE_FIELD_ReceiptLine_DescriptionOnly_Name="Sólo Descripción";

@XendraTrl(Identifier="f2da9f67-c6a1-f89f-85ce-c9b4b53bdea0")
public static String es_PE_FIELD_ReceiptLine_DescriptionOnly_Description="Si es verdad, la línea es descripción justa y ninguna transacción.";

@XendraTrl(Identifier="f2da9f67-c6a1-f89f-85ce-c9b4b53bdea0")
public static String es_PE_FIELD_ReceiptLine_DescriptionOnly_Help="Si una línea es descripción solamente, Ej. el inventario del producto no se corrige. No se crea ningunas transacciones de la contabilidad y la cantidad ó los totales no se incluye en el documento. Esto para incluir líneas de detalle de descripción, Ej. para una orden de trabajo.";

@XendraField(AD_Column_ID="IsDescription",IsCentrallyMaintained=true,
AD_Tab_ID="db93a6dc-a6d3-5694-f203-389b98b1e2ec",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f2da9f67-c6a1-f89f-85ce-c9b4b53bdea0")
public static final String FIELDNAME_ReceiptLine_DescriptionOnly="f2da9f67-c6a1-f89f-85ce-c9b4b53bdea0";

@XendraTrl(Identifier="67779ee4-c22b-a205-ae91-cc134516dfd8")
public static String es_PE_COLUMN_IsDescription_Name="Sólo Descripción";

@XendraColumn(AD_Element_ID="bd7f450d-a061-1b08-60d8-19c8943042f0",ColumnName="IsDescription",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="67779ee4-c22b-a205-ae91-cc134516dfd8",
Synchronized="2020-03-03 21:38:27.0")
/** Column name IsDescription */
public static final String COLUMNNAME_IsDescription = "IsDescription";
/** Set Invoiced.
@param IsInvoiced Is this invoiced? */
public void setIsInvoiced (boolean IsInvoiced)
{
set_Value (COLUMNNAME_IsInvoiced, Boolean.valueOf(IsInvoiced));
}
/** Get Invoiced.
@return Is this invoiced? */
public boolean isInvoiced() 
{
Object oo = get_Value(COLUMNNAME_IsInvoiced);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="6c512105-c37b-7018-9d30-0e28e0582982")
public static String es_PE_FIELD_ShipmentLine_Invoiced_Name="Facturado";

@XendraField(AD_Column_ID="IsInvoiced",IsCentrallyMaintained=true,
AD_Tab_ID="e10d7b88-9639-97e1-c65a-c064a3e16e64",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6c512105-c37b-7018-9d30-0e28e0582982")
public static final String FIELDNAME_ShipmentLine_Invoiced="6c512105-c37b-7018-9d30-0e28e0582982";

@XendraTrl(Identifier="0c581995-ad89-3446-67e0-ad7694d0118c")
public static String es_PE_FIELD_ReceiptLine_Invoiced_Name="Facturado";

@XendraField(AD_Column_ID="IsInvoiced",IsCentrallyMaintained=true,
AD_Tab_ID="db93a6dc-a6d3-5694-f203-389b98b1e2ec",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0c581995-ad89-3446-67e0-ad7694d0118c")
public static final String FIELDNAME_ReceiptLine_Invoiced="0c581995-ad89-3446-67e0-ad7694d0118c";

@XendraTrl(Identifier="6adb728b-9f81-2b4a-ffa6-c789768d8ee3")
public static String es_PE_COLUMN_IsInvoiced_Name="Facturado";

@XendraColumn(AD_Element_ID="a685c688-064e-aa25-7a8b-2b0273e958c1",ColumnName="IsInvoiced",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6adb728b-9f81-2b4a-ffa6-c789768d8ee3",
Synchronized="2020-03-03 21:38:27.0")
/** Column name IsInvoiced */
public static final String COLUMNNAME_IsInvoiced = "IsInvoiced";
/** Set Line No.
@param Line Unique line for this document */
public void setLine (int Line)
{
set_Value (COLUMNNAME_Line, Integer.valueOf(Line));
}
/** Get Line No.
@return Unique line for this document */
public int getLine() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Line);
if (ii == null) return 0;
return ii.intValue();
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getLine()));
}

@XendraTrl(Identifier="2495d61a-9225-34f3-9b1b-696e05d042e8")
public static String es_PE_FIELD_ShipmentLine_LineNo_Name="No. Ítem";

@XendraTrl(Identifier="2495d61a-9225-34f3-9b1b-696e05d042e8")
public static String es_PE_FIELD_ShipmentLine_LineNo_Description="No. Línea único para este documento";

@XendraTrl(Identifier="2495d61a-9225-34f3-9b1b-696e05d042e8")
public static String es_PE_FIELD_ShipmentLine_LineNo_Help="Indica el No. Línea para un documento. También controlará el orden de despliegue de las líneas dentro de un documento";

@XendraField(AD_Column_ID="Line",IsCentrallyMaintained=true,
AD_Tab_ID="e10d7b88-9639-97e1-c65a-c064a3e16e64",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=50,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2495d61a-9225-34f3-9b1b-696e05d042e8")
public static final String FIELDNAME_ShipmentLine_LineNo="2495d61a-9225-34f3-9b1b-696e05d042e8";

@XendraTrl(Identifier="17575bb4-30b0-1897-fc29-7188a11b122c")
public static String es_PE_FIELD_ReceiptLine_LineNo_Name="No. Ítem";

@XendraTrl(Identifier="17575bb4-30b0-1897-fc29-7188a11b122c")
public static String es_PE_FIELD_ReceiptLine_LineNo_Description="No. Línea único para este documento";

@XendraTrl(Identifier="17575bb4-30b0-1897-fc29-7188a11b122c")
public static String es_PE_FIELD_ReceiptLine_LineNo_Help="Indica el No. Línea para un documento. También controlará el orden de despliegue de las líneas dentro de un documento";

@XendraField(AD_Column_ID="Line",IsCentrallyMaintained=true,
AD_Tab_ID="db93a6dc-a6d3-5694-f203-389b98b1e2ec",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=50,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="17575bb4-30b0-1897-fc29-7188a11b122c")
public static final String FIELDNAME_ReceiptLine_LineNo="17575bb4-30b0-1897-fc29-7188a11b122c";

@XendraTrl(Identifier="ad7a14cd-bd0a-5b68-2f08-579c2fbf01d6")
public static String es_PE_COLUMN_Line_Name="No. Línea";

@XendraColumn(AD_Element_ID="986ef077-61da-f9cf-1c6d-aefe3a35113b",ColumnName="Line",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="@SQL=SELECT COALESCE(MAX(Line),0)+10 AS DefaultValue FROM M_InOutLine WHERE M_InOut_ID=@M_InOut_ID@",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ad7a14cd-bd0a-5b68-2f08-579c2fbf01d6",
Synchronized="2020-03-03 21:38:27.0")
/** Column name Line */
public static final String COLUMNNAME_Line = "Line";
/** Set Attribute Set Instance.
@param M_AttributeSetInstance_ID Product Attribute Set Instance */
public void setM_AttributeSetInstance_ID (int M_AttributeSetInstance_ID)
{
if (M_AttributeSetInstance_ID < 0) throw new IllegalArgumentException ("M_AttributeSetInstance_ID is mandatory.");
set_Value (COLUMNNAME_M_AttributeSetInstance_ID, Integer.valueOf(M_AttributeSetInstance_ID));
}
/** Get Attribute Set Instance.
@return Product Attribute Set Instance */
public int getM_AttributeSetInstance_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_AttributeSetInstance_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="c5f43f97-9ba0-85ee-c2e9-93e71c45c7ea")
public static String es_PE_FIELD_ShipmentLine_AttributeSetInstance_Name="Lote - Serie";

@XendraTrl(Identifier="c5f43f97-9ba0-85ee-c2e9-93e71c45c7ea")
public static String es_PE_FIELD_ShipmentLine_AttributeSetInstance_Description="Instancia del conjunto de atributos del producto";

@XendraTrl(Identifier="c5f43f97-9ba0-85ee-c2e9-93e71c45c7ea")
public static String es_PE_FIELD_ShipmentLine_AttributeSetInstance_Help="Valor actual de Instancia del conjunto de atributos del producto";

@XendraField(AD_Column_ID="M_AttributeSetInstance_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e10d7b88-9639-97e1-c65a-c064a3e16e64",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c5f43f97-9ba0-85ee-c2e9-93e71c45c7ea")
public static final String FIELDNAME_ShipmentLine_AttributeSetInstance="c5f43f97-9ba0-85ee-c2e9-93e71c45c7ea";

@XendraTrl(Identifier="c7148901-2650-6681-0c33-6314c9f72699")
public static String es_PE_FIELD_ReceiptLine_AttributeSetInstance_Name="Lote - Vencimiento";

@XendraTrl(Identifier="c7148901-2650-6681-0c33-6314c9f72699")
public static String es_PE_FIELD_ReceiptLine_AttributeSetInstance_Description="Instancia del conjunto de atributos del producto";

@XendraTrl(Identifier="c7148901-2650-6681-0c33-6314c9f72699")
public static String es_PE_FIELD_ReceiptLine_AttributeSetInstance_Help="Valor actual de Instancia del conjunto de atributos del producto";

@XendraField(AD_Column_ID="M_AttributeSetInstance_ID",IsCentrallyMaintained=true,
AD_Tab_ID="db93a6dc-a6d3-5694-f203-389b98b1e2ec",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c7148901-2650-6681-0c33-6314c9f72699")
public static final String FIELDNAME_ReceiptLine_AttributeSetInstance="c7148901-2650-6681-0c33-6314c9f72699";

@XendraTrl(Identifier="05e6d36f-2b3b-217b-75c4-7307f8e714ec")
public static String es_PE_COLUMN_M_AttributeSetInstance_ID_Name="Instancia del Conjunto de Atributos";

@XendraColumn(AD_Element_ID="137807f2-3c52-e193-3ceb-f10b819cf955",
ColumnName="M_AttributeSetInstance_ID",AD_Reference_ID=35,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="org.compiere.model.CalloutInOut.asi",VFormat="",ValueMin="",ValueMax="",Version="1",
IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="05e6d36f-2b3b-217b-75c4-7307f8e714ec",
Synchronized="2020-03-03 21:38:27.0")
/** Column name M_AttributeSetInstance_ID */
public static final String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";
/** Set Shipment/Receipt.
@param M_InOut_ID Material Shipment Document */
public void setM_InOut_ID (int M_InOut_ID)
{
if (M_InOut_ID < 1) throw new IllegalArgumentException ("M_InOut_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_InOut_ID, Integer.valueOf(M_InOut_ID));
}
/** Get Shipment/Receipt.
@return Material Shipment Document */
public int getM_InOut_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_InOut_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="18579fd5-4342-4ee5-ca3f-f7ff78fa36f1")
public static String es_PE_FIELD_ShipmentLine_ShipmentReceipt_Name="Entrega / Recibo";

@XendraTrl(Identifier="18579fd5-4342-4ee5-ca3f-f7ff78fa36f1")
public static String es_PE_FIELD_ShipmentLine_ShipmentReceipt_Description="Entrega / Recibo";

@XendraTrl(Identifier="18579fd5-4342-4ee5-ca3f-f7ff78fa36f1")
public static String es_PE_FIELD_ShipmentLine_ShipmentReceipt_Help="La ID de Entrega / Recibo indica el documento único para esta entrega ó recibo";

@XendraField(AD_Column_ID="M_InOut_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e10d7b88-9639-97e1-c65a-c064a3e16e64",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="18579fd5-4342-4ee5-ca3f-f7ff78fa36f1")
public static final String FIELDNAME_ShipmentLine_ShipmentReceipt="18579fd5-4342-4ee5-ca3f-f7ff78fa36f1";

@XendraTrl(Identifier="0591799d-0d4c-b1c8-acc7-c1fc47bb860a")
public static String es_PE_FIELD_ReceiptLine_Receipt_Name="Entrega / Recibo";

@XendraTrl(Identifier="0591799d-0d4c-b1c8-acc7-c1fc47bb860a")
public static String es_PE_FIELD_ReceiptLine_Receipt_Description="Entrega ó documento de recibo";

@XendraTrl(Identifier="0591799d-0d4c-b1c8-acc7-c1fc47bb860a")
public static String es_PE_FIELD_ReceiptLine_Receipt_Help="La ID de Entrega / Recibo indica el documento único para esta entrega ó recibo";

@XendraField(AD_Column_ID="M_InOut_ID",IsCentrallyMaintained=true,
AD_Tab_ID="db93a6dc-a6d3-5694-f203-389b98b1e2ec",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0591799d-0d4c-b1c8-acc7-c1fc47bb860a")
public static final String FIELDNAME_ReceiptLine_Receipt="0591799d-0d4c-b1c8-acc7-c1fc47bb860a";

@XendraTrl(Identifier="b6ab7dd6-94b4-61d6-16c7-195d90b73e92")
public static String es_PE_COLUMN_M_InOut_ID_Name="Entrega / Recibo";

@XendraColumn(AD_Element_ID="5c1a0edf-01a0-832e-098b-d49510db71db",ColumnName="M_InOut_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=4,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b6ab7dd6-94b4-61d6-16c7-195d90b73e92",
Synchronized="2020-03-03 21:38:27.0")
/** Column name M_InOut_ID */
public static final String COLUMNNAME_M_InOut_ID = "M_InOut_ID";
/** Set Shipment/Receipt Line.
@param M_InOutLine_ID Line on Shipment or Receipt document */
public void setM_InOutLine_ID (int M_InOutLine_ID)
{
if (M_InOutLine_ID < 1) throw new IllegalArgumentException ("M_InOutLine_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_InOutLine_ID, Integer.valueOf(M_InOutLine_ID));
}
/** Get Shipment/Receipt Line.
@return Line on Shipment or Receipt document */
public int getM_InOutLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_InOutLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="eb9a16f0-3777-c46c-94cb-55a49dfc9607")
public static String es_PE_FIELD_ShipmentLine_ShipmentReceiptLine_Name="Item Entrega / Recibo";

@XendraTrl(Identifier="eb9a16f0-3777-c46c-94cb-55a49dfc9607")
public static String es_PE_FIELD_ShipmentLine_ShipmentReceiptLine_Description="Item de entrega ó documento de recibo.";

@XendraTrl(Identifier="eb9a16f0-3777-c46c-94cb-55a49dfc9607")
public static String es_PE_FIELD_ShipmentLine_ShipmentReceiptLine_Help="Indica un Item único en un documento de entrega / recibo";

@XendraField(AD_Column_ID="M_InOutLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e10d7b88-9639-97e1-c65a-c064a3e16e64",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="eb9a16f0-3777-c46c-94cb-55a49dfc9607")
public static final String FIELDNAME_ShipmentLine_ShipmentReceiptLine="eb9a16f0-3777-c46c-94cb-55a49dfc9607";

@XendraTrl(Identifier="aec7490b-c1c8-db7a-1faa-a4b146f06689")
public static String es_PE_FIELD_ReceiptLine_ReceiptLine_Name="Item Entrega / Recibo";

@XendraTrl(Identifier="aec7490b-c1c8-db7a-1faa-a4b146f06689")
public static String es_PE_FIELD_ReceiptLine_ReceiptLine_Description="Item de entrega ó documento de recibo.";

@XendraTrl(Identifier="aec7490b-c1c8-db7a-1faa-a4b146f06689")
public static String es_PE_FIELD_ReceiptLine_ReceiptLine_Help="Indica un Item único en un documento de entrega / recibo";

@XendraField(AD_Column_ID="M_InOutLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="db93a6dc-a6d3-5694-f203-389b98b1e2ec",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="aec7490b-c1c8-db7a-1faa-a4b146f06689")
public static final String FIELDNAME_ReceiptLine_ReceiptLine="aec7490b-c1c8-db7a-1faa-a4b146f06689";
/** Column name M_InOutLine_ID */
public static final String COLUMNNAME_M_InOutLine_ID = "M_InOutLine_ID";
/** Set Locator.
@param M_Locator_ID Warehouse Locator */
public void setM_Locator_ID (int M_Locator_ID)
{
if (M_Locator_ID < 1) throw new IllegalArgumentException ("M_Locator_ID is mandatory.");
set_Value (COLUMNNAME_M_Locator_ID, Integer.valueOf(M_Locator_ID));
}
/** Get Locator.
@return Warehouse Locator */
public int getM_Locator_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Locator_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="e7af7d07-fd41-4552-8e4e-6888cb16e4e6")
public static String es_PE_FIELD_ShipmentLine_Locator_Name="Ubicación";

@XendraTrl(Identifier="e7af7d07-fd41-4552-8e4e-6888cb16e4e6")
public static String es_PE_FIELD_ShipmentLine_Locator_Description="Ubicación de Almacén";

@XendraTrl(Identifier="e7af7d07-fd41-4552-8e4e-6888cb16e4e6")
public static String es_PE_FIELD_ShipmentLine_Locator_Help="El ID de la ubicación indica en que parte del almacén se localiza el producto";

@XendraField(AD_Column_ID="M_Locator_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e10d7b88-9639-97e1-c65a-c064a3e16e64",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e7af7d07-fd41-4552-8e4e-6888cb16e4e6")
public static final String FIELDNAME_ShipmentLine_Locator="e7af7d07-fd41-4552-8e4e-6888cb16e4e6";

@XendraTrl(Identifier="f11f7359-5cbc-cc7d-3ccc-918634c80467")
public static String es_PE_FIELD_ReceiptLine_Locator_Name="Ubicación";

@XendraTrl(Identifier="f11f7359-5cbc-cc7d-3ccc-918634c80467")
public static String es_PE_FIELD_ReceiptLine_Locator_Description="Ubicación de Almacén";

@XendraTrl(Identifier="f11f7359-5cbc-cc7d-3ccc-918634c80467")
public static String es_PE_FIELD_ReceiptLine_Locator_Help="El ID de la ubicación indica en que parte del almacén se localiza el producto";

@XendraField(AD_Column_ID="M_Locator_ID",IsCentrallyMaintained=true,
AD_Tab_ID="db93a6dc-a6d3-5694-f203-389b98b1e2ec",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f11f7359-5cbc-cc7d-3ccc-918634c80467")
public static final String FIELDNAME_ReceiptLine_Locator="f11f7359-5cbc-cc7d-3ccc-918634c80467";

@XendraTrl(Identifier="f512b49b-6b4c-a9e2-a2bf-3eb7547e4bfd")
public static String es_PE_COLUMN_M_Locator_ID_Name="Ubicación";

@XendraColumn(AD_Element_ID="67f044ce-2864-93f9-fd0d-320945150933",ColumnName="M_Locator_ID",
AD_Reference_ID=31,AD_Reference_Value_ID="",AD_Val_Rule_ID="67c484dc-284d-a4ad-b352-8a8b313f4190",
FieldLength=22,DefaultValue="@M_Locator_ID@",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="f512b49b-6b4c-a9e2-a2bf-3eb7547e4bfd",Synchronized="2020-03-03 21:38:27.0")
/** Column name M_Locator_ID */
public static final String COLUMNNAME_M_Locator_ID = "M_Locator_ID";
/** Set Movement Quantity.
@param MovementQty Quantity of a product moved. */
public void setMovementQty (BigDecimal MovementQty)
{
if (MovementQty == null) throw new IllegalArgumentException ("MovementQty is mandatory.");
set_Value (COLUMNNAME_MovementQty, MovementQty);
}
/** Get Movement Quantity.
@return Quantity of a product moved. */
public BigDecimal getMovementQty() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_MovementQty);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="8ba810dc-16d0-61ae-2da3-107619faf239")
public static String es_PE_FIELD_ShipmentLine_MovementQuantity_Name="Cantidad del Movimiento";

@XendraTrl(Identifier="8ba810dc-16d0-61ae-2da3-107619faf239")
public static String es_PE_FIELD_ShipmentLine_MovementQuantity_Description="Cantidad de un producto movido";

@XendraTrl(Identifier="8ba810dc-16d0-61ae-2da3-107619faf239")
public static String es_PE_FIELD_ShipmentLine_MovementQuantity_Help="La Cantidad del Movimiento indica la cantidad de un producto que ha sido movido";

@XendraField(AD_Column_ID="MovementQty",IsCentrallyMaintained=true,
AD_Tab_ID="e10d7b88-9639-97e1-c65a-c064a3e16e64",AD_FieldGroup_ID="Quantities",IsDisplayed=true,
DisplayLogic="@UOMConversion@=Y | @Processed@=Y",DisplayLength=26,IsReadOnly=false,SeqNo=130,
SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="8ba810dc-16d0-61ae-2da3-107619faf239")
public static final String FIELDNAME_ShipmentLine_MovementQuantity="8ba810dc-16d0-61ae-2da3-107619faf239";

@XendraTrl(Identifier="72dd4091-baad-1f42-716b-8a2ca36a5a31")
public static String es_PE_FIELD_ReceiptLine_MovementQuantity_Name="Cantidad del Movimiento";

@XendraTrl(Identifier="72dd4091-baad-1f42-716b-8a2ca36a5a31")
public static String es_PE_FIELD_ReceiptLine_MovementQuantity_Description="Cantidad de un producto movido";

@XendraTrl(Identifier="72dd4091-baad-1f42-716b-8a2ca36a5a31")
public static String es_PE_FIELD_ReceiptLine_MovementQuantity_Help="La Cantidad del Movimiento indica la cantidad de un producto que ha sido movido";

@XendraField(AD_Column_ID="MovementQty",IsCentrallyMaintained=true,
AD_Tab_ID="db93a6dc-a6d3-5694-f203-389b98b1e2ec",AD_FieldGroup_ID="Quantities",IsDisplayed=true,
DisplayLogic="@UOMConversion@=Y | @Processed@=Y",DisplayLength=26,IsReadOnly=true,SeqNo=130,
SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="72dd4091-baad-1f42-716b-8a2ca36a5a31")
public static final String FIELDNAME_ReceiptLine_MovementQuantity="72dd4091-baad-1f42-716b-8a2ca36a5a31";

@XendraTrl(Identifier="efd8575f-e97b-47a0-d1dd-8bf5ade9f9fd")
public static String es_PE_COLUMN_MovementQty_Name="Cantidad del Movimiento";

@XendraColumn(AD_Element_ID="36c2f62a-1d3b-a3ff-a433-9fc2eec47380",ColumnName="MovementQty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="1",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=2,IsTranslated=false,Callout="org.compiere.model.CalloutInOut.qty",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="efd8575f-e97b-47a0-d1dd-8bf5ade9f9fd",Synchronized="2020-03-03 21:38:27.0")
/** Column name MovementQty */
public static final String COLUMNNAME_MovementQty = "MovementQty";
/** Set Product.
@param M_Product_ID Product, Service, Item */
public void setM_Product_ID (int M_Product_ID)
{
if (M_Product_ID <= 0) set_Value (COLUMNNAME_M_Product_ID, null);
 else 
set_Value (COLUMNNAME_M_Product_ID, Integer.valueOf(M_Product_ID));
}
/** Get Product.
@return Product, Service, Item */
public int getM_Product_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Product_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="1e9bd8f4-e00a-7c47-54c2-bcc3608f9624")
public static String es_PE_FIELD_ShipmentLine_Product_Name="Producto";

@XendraTrl(Identifier="1e9bd8f4-e00a-7c47-54c2-bcc3608f9624")
public static String es_PE_FIELD_ShipmentLine_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="1e9bd8f4-e00a-7c47-54c2-bcc3608f9624")
public static String es_PE_FIELD_ShipmentLine_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e10d7b88-9639-97e1-c65a-c064a3e16e64",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1e9bd8f4-e00a-7c47-54c2-bcc3608f9624")
public static final String FIELDNAME_ShipmentLine_Product="1e9bd8f4-e00a-7c47-54c2-bcc3608f9624";

@XendraTrl(Identifier="e7f210eb-3dc7-a110-2857-1e3a421fba49")
public static String es_PE_FIELD_ReceiptLine_Product_Name="Producto";

@XendraTrl(Identifier="e7f210eb-3dc7-a110-2857-1e3a421fba49")
public static String es_PE_FIELD_ReceiptLine_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="e7f210eb-3dc7-a110-2857-1e3a421fba49")
public static String es_PE_FIELD_ReceiptLine_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="db93a6dc-a6d3-5694-f203-389b98b1e2ec",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e7f210eb-3dc7-a110-2857-1e3a421fba49")
public static final String FIELDNAME_ReceiptLine_Product="e7f210eb-3dc7-a110-2857-1e3a421fba49";

@XendraTrl(Identifier="3c6253a9-d8e8-8cb2-4e13-e2755ede6214")
public static String es_PE_COLUMN_M_Product_ID_Name="Producto";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="4281f8eb-238e-6b28-eb66-8cc866e6312c",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=true,SeqNo=3,IsTranslated=false,
Callout="org.compiere.model.CalloutInOut.product",VFormat="",ValueMin="",ValueMax="",Version="1",
IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3c6253a9-d8e8-8cb2-4e13-e2755ede6214",
Synchronized="2020-03-03 21:38:27.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
/** Set RMA Line.
@param M_RMALine_ID Return Material Authorization Line */
public void setM_RMALine_ID (int M_RMALine_ID)
{
if (M_RMALine_ID <= 0) set_Value (COLUMNNAME_M_RMALine_ID, null);
 else 
set_Value (COLUMNNAME_M_RMALine_ID, Integer.valueOf(M_RMALine_ID));
}
/** Get RMA Line.
@return Return Material Authorization Line */
public int getM_RMALine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_RMALine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f5d3deb4-20a8-7269-c20e-5a04aba0d7a3")
public static String es_PE_FIELD_ShipmentLine_RMALine_Name="Línea ADM (RMA)";

@XendraTrl(Identifier="f5d3deb4-20a8-7269-c20e-5a04aba0d7a3")
public static String es_PE_FIELD_ShipmentLine_RMALine_Description="Línea Autorización de Devolución de Material";

@XendraTrl(Identifier="f5d3deb4-20a8-7269-c20e-5a04aba0d7a3")
public static String es_PE_FIELD_ShipmentLine_RMALine_Help="Información del detalle sobre las mercancías devueltas";

@XendraField(AD_Column_ID="M_RMALine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e10d7b88-9639-97e1-c65a-c064a3e16e64",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f5d3deb4-20a8-7269-c20e-5a04aba0d7a3")
public static final String FIELDNAME_ShipmentLine_RMALine="f5d3deb4-20a8-7269-c20e-5a04aba0d7a3";

@XendraTrl(Identifier="8aef5d05-2602-3edc-eea8-faa5a0afba51")
public static String es_PE_COLUMN_M_RMALine_ID_Name="Línea ADM (RMA)";

@XendraColumn(AD_Element_ID="e0f0ae49-188f-5578-c173-f836bc2ece2e",ColumnName="M_RMALine_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8aef5d05-2602-3edc-eea8-faa5a0afba51",
Synchronized="2020-03-03 21:38:27.0")
/** Column name M_RMALine_ID */
public static final String COLUMNNAME_M_RMALine_ID = "M_RMALine_ID";
/** Set Picked Quantity.
@param PickedQty Picked Quantity */
public void setPickedQty (BigDecimal PickedQty)
{
set_Value (COLUMNNAME_PickedQty, PickedQty);
}
/** Get Picked Quantity.
@return Picked Quantity */
public BigDecimal getPickedQty() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PickedQty);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="6e50e20c-3412-a8d9-48dc-782e3cac5c5c")
public static String es_PE_FIELD_ShipmentLine_PickedQuantity_Name="Cantidad de Recolección";

@XendraField(AD_Column_ID="PickedQty",IsCentrallyMaintained=true,
AD_Tab_ID="e10d7b88-9639-97e1-c65a-c064a3e16e64",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6e50e20c-3412-a8d9-48dc-782e3cac5c5c")
public static final String FIELDNAME_ShipmentLine_PickedQuantity="6e50e20c-3412-a8d9-48dc-782e3cac5c5c";

@XendraTrl(Identifier="db3fa82b-ce6f-724e-9cfa-e508848c348c")
public static String es_PE_FIELD_ReceiptLine_PickedQuantity_Name="Cantidad de Recolección";

@XendraField(AD_Column_ID="PickedQty",IsCentrallyMaintained=true,
AD_Tab_ID="db93a6dc-a6d3-5694-f203-389b98b1e2ec",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="db3fa82b-ce6f-724e-9cfa-e508848c348c")
public static final String FIELDNAME_ReceiptLine_PickedQuantity="db3fa82b-ce6f-724e-9cfa-e508848c348c";

@XendraTrl(Identifier="24cd0ef9-1c68-b073-8124-7b293d68fcd5")
public static String es_PE_COLUMN_PickedQty_Name="Cantidad de Recolección";

@XendraColumn(AD_Element_ID="5fa43a91-51db-0441-324c-b3c35399ca29",ColumnName="PickedQty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="24cd0ef9-1c68-b073-8124-7b293d68fcd5",
Synchronized="2020-03-03 21:38:27.0")
/** Column name PickedQty */
public static final String COLUMNNAME_PickedQty = "PickedQty";
/** Set Processed.
@param Processed The document has been processed */
public void setProcessed (boolean Processed)
{
set_Value (COLUMNNAME_Processed, Boolean.valueOf(Processed));
}
/** Get Processed.
@return The document has been processed */
public boolean isProcessed() 
{
Object oo = get_Value(COLUMNNAME_Processed);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="a661c240-c092-4099-6a85-39df71f8b6c6")
public static String es_PE_FIELD_ShipmentLine_Processed_Name="Procesado";

@XendraTrl(Identifier="a661c240-c092-4099-6a85-39df71f8b6c6")
public static String es_PE_FIELD_ShipmentLine_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="a661c240-c092-4099-6a85-39df71f8b6c6")
public static String es_PE_FIELD_ShipmentLine_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="e10d7b88-9639-97e1-c65a-c064a3e16e64",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a661c240-c092-4099-6a85-39df71f8b6c6")
public static final String FIELDNAME_ShipmentLine_Processed="a661c240-c092-4099-6a85-39df71f8b6c6";

@XendraTrl(Identifier="cc99943f-8b28-73db-ec87-11057c19b0f8")
public static String es_PE_FIELD_ReceiptLine_Processed_Name="Procesado";

@XendraTrl(Identifier="cc99943f-8b28-73db-ec87-11057c19b0f8")
public static String es_PE_FIELD_ReceiptLine_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="cc99943f-8b28-73db-ec87-11057c19b0f8")
public static String es_PE_FIELD_ReceiptLine_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="db93a6dc-a6d3-5694-f203-389b98b1e2ec",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cc99943f-8b28-73db-ec87-11057c19b0f8")
public static final String FIELDNAME_ReceiptLine_Processed="cc99943f-8b28-73db-ec87-11057c19b0f8";

@XendraTrl(Identifier="d8e76da8-c38f-c85c-010d-f35127e74da8")
public static String es_PE_COLUMN_Processed_Name="Procesado";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d8e76da8-c38f-c85c-010d-f35127e74da8",
Synchronized="2020-03-03 21:38:27.0")
/** Column name Processed */
public static final String COLUMNNAME_Processed = "Processed";
/** Set Quantity.
@param QtyEntered The Quantity Entered is based on the selected UoM */
public void setQtyEntered (BigDecimal QtyEntered)
{
if (QtyEntered == null) throw new IllegalArgumentException ("QtyEntered is mandatory.");
set_Value (COLUMNNAME_QtyEntered, QtyEntered);
}
/** Get Quantity.
@return The Quantity Entered is based on the selected UoM */
public BigDecimal getQtyEntered() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_QtyEntered);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="d8a00f2d-b91a-0a76-7e3a-609dea6535b2")
public static String es_PE_FIELD_ShipmentLine_Quantity_Name="Cantidad";

@XendraTrl(Identifier="d8a00f2d-b91a-0a76-7e3a-609dea6535b2")
public static String es_PE_FIELD_ShipmentLine_Quantity_Description="La cantidad incorporada se basa en la UM seleccionada.";

@XendraTrl(Identifier="d8a00f2d-b91a-0a76-7e3a-609dea6535b2")
public static String es_PE_FIELD_ShipmentLine_Quantity_Help="La cantidad incorporada se convierte a la cantidad baja de UM del producto";

@XendraField(AD_Column_ID="QtyEntered",IsCentrallyMaintained=true,
AD_Tab_ID="e10d7b88-9639-97e1-c65a-c064a3e16e64",AD_FieldGroup_ID="Quantities",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d8a00f2d-b91a-0a76-7e3a-609dea6535b2")
public static final String FIELDNAME_ShipmentLine_Quantity="d8a00f2d-b91a-0a76-7e3a-609dea6535b2";

@XendraTrl(Identifier="cdff4ed8-4fb8-cda4-5e90-a3110e5c9734")
public static String es_PE_FIELD_ReceiptLine_Quantity_Name="Cantidad Recibida";

@XendraTrl(Identifier="cdff4ed8-4fb8-cda4-5e90-a3110e5c9734")
public static String es_PE_FIELD_ReceiptLine_Quantity_Description="La cantidad incorporada se basa en la UM seleccionada.";

@XendraTrl(Identifier="cdff4ed8-4fb8-cda4-5e90-a3110e5c9734")
public static String es_PE_FIELD_ReceiptLine_Quantity_Help="La cantidad incorporada se convierte a la cantidad baja de UM del producto";

@XendraField(AD_Column_ID="QtyEntered",IsCentrallyMaintained=true,
AD_Tab_ID="db93a6dc-a6d3-5694-f203-389b98b1e2ec",AD_FieldGroup_ID="Quantities",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cdff4ed8-4fb8-cda4-5e90-a3110e5c9734")
public static final String FIELDNAME_ReceiptLine_Quantity="cdff4ed8-4fb8-cda4-5e90-a3110e5c9734";

@XendraTrl(Identifier="192c96c8-9e8c-47e0-ff18-a1b0bbb4c208")
public static String es_PE_COLUMN_QtyEntered_Name="Cantidad";

@XendraColumn(AD_Element_ID="70a37b06-986d-bf01-1ef9-23e214211841",ColumnName="QtyEntered",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="1",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="org.compiere.model.CalloutInOut.qty",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="192c96c8-9e8c-47e0-ff18-a1b0bbb4c208",Synchronized="2020-03-03 21:38:27.0")
/** Column name QtyEntered */
public static final String COLUMNNAME_QtyEntered = "QtyEntered";
/** Set Referenced Shipment Line.
@param Ref_InOutLine_ID Referenced Shipment Line */
public void setRef_InOutLine_ID (int Ref_InOutLine_ID)
{
if (Ref_InOutLine_ID <= 0) set_Value (COLUMNNAME_Ref_InOutLine_ID, null);
 else 
set_Value (COLUMNNAME_Ref_InOutLine_ID, Integer.valueOf(Ref_InOutLine_ID));
}
/** Get Referenced Shipment Line.
@return Referenced Shipment Line */
public int getRef_InOutLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Ref_InOutLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ca775b18-9a63-62ca-9f33-9e5bcb86b62e")
public static String es_PE_FIELD_ShipmentLine_ReferencedShipmentLine_Name="Item de Referencia de Entrega";

@XendraField(AD_Column_ID="Ref_InOutLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e10d7b88-9639-97e1-c65a-c064a3e16e64",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ca775b18-9a63-62ca-9f33-9e5bcb86b62e")
public static final String FIELDNAME_ShipmentLine_ReferencedShipmentLine="ca775b18-9a63-62ca-9f33-9e5bcb86b62e";

@XendraTrl(Identifier="310f8f1a-a82a-a6f4-f376-3f0cbf4d9063")
public static String es_PE_FIELD_ReceiptLine_ReferencedShipmentLine_Name="Item de Referencia de Entrega";

@XendraField(AD_Column_ID="Ref_InOutLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="db93a6dc-a6d3-5694-f203-389b98b1e2ec",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="310f8f1a-a82a-a6f4-f376-3f0cbf4d9063")
public static final String FIELDNAME_ReceiptLine_ReferencedShipmentLine="310f8f1a-a82a-a6f4-f376-3f0cbf4d9063";

@XendraTrl(Identifier="5b4ae366-5b46-ba70-49a9-35b1e0e2864a")
public static String es_PE_COLUMN_Ref_InOutLine_ID_Name="Línea de Referencia de Entrega";

@XendraColumn(AD_Element_ID="677bf922-7c40-644e-4950-6ffc42dc763a",ColumnName="Ref_InOutLine_ID",
AD_Reference_ID=13,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5b4ae366-5b46-ba70-49a9-35b1e0e2864a",
Synchronized="2020-03-03 21:38:27.0")
/** Column name Ref_InOutLine_ID */
public static final String COLUMNNAME_Ref_InOutLine_ID = "Ref_InOutLine_ID";
/** Set ReversalLine_ID.
@param ReversalLine_ID ReversalLine_ID */
public void setReversalLine_ID (int ReversalLine_ID)
{
if (ReversalLine_ID <= 0) set_Value (COLUMNNAME_ReversalLine_ID, null);
 else 
set_Value (COLUMNNAME_ReversalLine_ID, Integer.valueOf(ReversalLine_ID));
}
/** Get ReversalLine_ID.
@return ReversalLine_ID */
public int getReversalLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_ReversalLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="01568a17-178d-2a84-2205-51efc653ddb7")
public static String es_PE_FIELD_ShipmentLine_ReversalLine_ID_Name="reversalline_id";

@XendraField(AD_Column_ID="ReversalLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e10d7b88-9639-97e1-c65a-c064a3e16e64",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="01568a17-178d-2a84-2205-51efc653ddb7")
public static final String FIELDNAME_ShipmentLine_ReversalLine_ID="01568a17-178d-2a84-2205-51efc653ddb7";

@XendraTrl(Identifier="b8d28ff2-7cd9-7053-238e-dee304372a9a")
public static String es_PE_COLUMN_ReversalLine_ID_Name="reversalline_id";

@XendraColumn(AD_Element_ID="21516ca0-09b5-e20b-cc75-a14c4c9c55b8",ColumnName="ReversalLine_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="6ab4b59d-04c4-3ae9-0a5c-fca29678e934",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="b8d28ff2-7cd9-7053-238e-dee304372a9a",Synchronized="2020-03-03 21:38:27.0")
/** Column name ReversalLine_ID */
public static final String COLUMNNAME_ReversalLine_ID = "ReversalLine_ID";
/** Set Scrapped Quantity.
@param ScrappedQty The Quantity scrapped due to QA issues */
public void setScrappedQty (BigDecimal ScrappedQty)
{
set_Value (COLUMNNAME_ScrappedQty, ScrappedQty);
}
/** Get Scrapped Quantity.
@return The Quantity scrapped due to QA issues */
public BigDecimal getScrappedQty() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_ScrappedQty);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="8f6ce850-932f-a5f2-8168-3393cb6b1f73")
public static String es_PE_FIELD_ShipmentLine_ScrappedQuantity_Name="Cantidad de Desperdicio";

@XendraTrl(Identifier="8f6ce850-932f-a5f2-8168-3393cb6b1f73")
public static String es_PE_FIELD_ShipmentLine_ScrappedQuantity_Description="La cantidad de desperdicio debido a las ediciones del A.C.";

@XendraField(AD_Column_ID="ScrappedQty",IsCentrallyMaintained=true,
AD_Tab_ID="e10d7b88-9639-97e1-c65a-c064a3e16e64",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=170,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8f6ce850-932f-a5f2-8168-3393cb6b1f73")
public static final String FIELDNAME_ShipmentLine_ScrappedQuantity="8f6ce850-932f-a5f2-8168-3393cb6b1f73";

@XendraTrl(Identifier="431ea187-f769-8c3f-a034-e8c1d62b7ec2")
public static String es_PE_FIELD_ReceiptLine_ScrappedQuantity_Name="Cantidad de Desperdicio";

@XendraTrl(Identifier="431ea187-f769-8c3f-a034-e8c1d62b7ec2")
public static String es_PE_FIELD_ReceiptLine_ScrappedQuantity_Description="La cantidad de desperdicio debido a las ediciones del A.C.";

@XendraField(AD_Column_ID="ScrappedQty",IsCentrallyMaintained=true,
AD_Tab_ID="db93a6dc-a6d3-5694-f203-389b98b1e2ec",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=170,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="431ea187-f769-8c3f-a034-e8c1d62b7ec2")
public static final String FIELDNAME_ReceiptLine_ScrappedQuantity="431ea187-f769-8c3f-a034-e8c1d62b7ec2";

@XendraTrl(Identifier="bcaaaab1-2fb2-9f87-fe0a-08b8150d19f0")
public static String es_PE_COLUMN_ScrappedQty_Name="Cantidad de Desperdicio";

@XendraColumn(AD_Element_ID="40b91fb0-3206-0a29-4fd3-de7dde7e4d2c",ColumnName="ScrappedQty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bcaaaab1-2fb2-9f87-fe0a-08b8150d19f0",
Synchronized="2020-03-03 21:38:27.0")
/** Column name ScrappedQty */
public static final String COLUMNNAME_ScrappedQty = "ScrappedQty";
/** Set Target Quantity.
@param TargetQty Target Movement Quantity */
public void setTargetQty (BigDecimal TargetQty)
{
set_Value (COLUMNNAME_TargetQty, TargetQty);
}
/** Get Target Quantity.
@return Target Movement Quantity */
public BigDecimal getTargetQty() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_TargetQty);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="89b8235d-fd18-82ad-2592-dbf9855c15c1")
public static String es_PE_FIELD_ShipmentLine_TargetQuantity_Name="Cantidad a recibir";

@XendraTrl(Identifier="89b8235d-fd18-82ad-2592-dbf9855c15c1")
public static String es_PE_FIELD_ShipmentLine_TargetQuantity_Description="Movimientos de cantidad a recibir";

@XendraTrl(Identifier="89b8235d-fd18-82ad-2592-dbf9855c15c1")
public static String es_PE_FIELD_ShipmentLine_TargetQuantity_Help="La cantidad que debio haber sido recibida";

@XendraField(AD_Column_ID="TargetQty",IsCentrallyMaintained=true,
AD_Tab_ID="e10d7b88-9639-97e1-c65a-c064a3e16e64",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=150,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="89b8235d-fd18-82ad-2592-dbf9855c15c1")
public static final String FIELDNAME_ShipmentLine_TargetQuantity="89b8235d-fd18-82ad-2592-dbf9855c15c1";

@XendraTrl(Identifier="d285f7d4-e04c-ce62-daba-306757e27e6f")
public static String es_PE_FIELD_ReceiptLine_TargetQuantity_Name="Cantidad a recibir";

@XendraTrl(Identifier="d285f7d4-e04c-ce62-daba-306757e27e6f")
public static String es_PE_FIELD_ReceiptLine_TargetQuantity_Description="Movimientos de cantidad a recibir";

@XendraTrl(Identifier="d285f7d4-e04c-ce62-daba-306757e27e6f")
public static String es_PE_FIELD_ReceiptLine_TargetQuantity_Help="La cantidad que debio haber sido recibida";

@XendraField(AD_Column_ID="TargetQty",IsCentrallyMaintained=true,
AD_Tab_ID="db93a6dc-a6d3-5694-f203-389b98b1e2ec",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=150,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d285f7d4-e04c-ce62-daba-306757e27e6f")
public static final String FIELDNAME_ReceiptLine_TargetQuantity="d285f7d4-e04c-ce62-daba-306757e27e6f";

@XendraTrl(Identifier="cbe2aab0-3609-ed40-d273-843598f4a9de")
public static String es_PE_COLUMN_TargetQty_Name="Cantidad a recibir";

@XendraColumn(AD_Element_ID="6fbec6d0-2133-ed61-f214-65f7655fd4a6",ColumnName="TargetQty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cbe2aab0-3609-ed40-d273-843598f4a9de",
Synchronized="2020-03-03 21:38:27.0")
/** Column name TargetQty */
public static final String COLUMNNAME_TargetQty = "TargetQty";
/** Set User List 1.
@param User1_ID User defined list element #1 */
public void setUser1_ID (int User1_ID)
{
if (User1_ID <= 0) set_Value (COLUMNNAME_User1_ID, null);
 else 
set_Value (COLUMNNAME_User1_ID, Integer.valueOf(User1_ID));
}
/** Get User List 1.
@return User defined list element #1 */
public int getUser1_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_User1_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ff8dc0b7-296a-d2aa-1143-3f90ac86edb0")
public static String es_PE_FIELD_ShipmentLine_UserList_Name="Usuario 1";

@XendraTrl(Identifier="ff8dc0b7-296a-d2aa-1143-3f90ac86edb0")
public static String es_PE_FIELD_ShipmentLine_UserList_Description="El usuario definió el elemento # 1";

@XendraTrl(Identifier="ff8dc0b7-296a-d2aa-1143-3f90ac86edb0")
public static String es_PE_FIELD_ShipmentLine_UserList_Help="El elemento definido por el usuario despliega los elementos opcionales que han sido definidos para esta combinación de cuentas";

@XendraField(AD_Column_ID="User1_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e10d7b88-9639-97e1-c65a-c064a3e16e64",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@$Element_U1@='Y'",DisplayLength=10,IsReadOnly=false,SeqNo=200,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="ff8dc0b7-296a-d2aa-1143-3f90ac86edb0")
public static final String FIELDNAME_ShipmentLine_UserList="ff8dc0b7-296a-d2aa-1143-3f90ac86edb0";

@XendraTrl(Identifier="64eaba82-9f20-eb4b-d586-1b8b13b42509")
public static String es_PE_FIELD_ReceiptLine_UserList_Name="Usuario 1";

@XendraTrl(Identifier="64eaba82-9f20-eb4b-d586-1b8b13b42509")
public static String es_PE_FIELD_ReceiptLine_UserList_Description="El usuario definió el elemento # 1";

@XendraTrl(Identifier="64eaba82-9f20-eb4b-d586-1b8b13b42509")
public static String es_PE_FIELD_ReceiptLine_UserList_Help="El elemento definido por el usuario despliega los elementos opcionales que han sido definidos para esta combinación de cuentas";

@XendraField(AD_Column_ID="User1_ID",IsCentrallyMaintained=true,
AD_Tab_ID="db93a6dc-a6d3-5694-f203-389b98b1e2ec",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@$Element_U1@='Y'",DisplayLength=10,IsReadOnly=false,SeqNo=200,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="64eaba82-9f20-eb4b-d586-1b8b13b42509")
public static final String FIELDNAME_ReceiptLine_UserList="64eaba82-9f20-eb4b-d586-1b8b13b42509";

@XendraTrl(Identifier="10610a6d-34d2-5c17-667f-781a991928fa")
public static String es_PE_COLUMN_User1_ID_Name="Usuario 1";

@XendraColumn(AD_Element_ID="07453e74-aadd-d9c9-e543-837a6fdb3094",ColumnName="User1_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="5a2fe161-044f-67cb-3791-6d615980cabb",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="10610a6d-34d2-5c17-667f-781a991928fa",Synchronized="2020-03-03 21:38:27.0")
/** Column name User1_ID */
public static final String COLUMNNAME_User1_ID = "User1_ID";
/** Set User List 2.
@param User2_ID User defined list element #2 */
public void setUser2_ID (int User2_ID)
{
if (User2_ID <= 0) set_Value (COLUMNNAME_User2_ID, null);
 else 
set_Value (COLUMNNAME_User2_ID, Integer.valueOf(User2_ID));
}
/** Get User List 2.
@return User defined list element #2 */
public int getUser2_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_User2_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="e7c0d3a4-acf0-ba3e-a0e6-873e78c24f5a")
public static String es_PE_FIELD_ShipmentLine_UserList22_Name="Usuario 2";

@XendraTrl(Identifier="e7c0d3a4-acf0-ba3e-a0e6-873e78c24f5a")
public static String es_PE_FIELD_ShipmentLine_UserList22_Description="El usuario definió el elemento # 2";

@XendraTrl(Identifier="e7c0d3a4-acf0-ba3e-a0e6-873e78c24f5a")
public static String es_PE_FIELD_ShipmentLine_UserList22_Help="El elemento definido por el usuario despliega los elementos opcionales que han sido definidos para esta combinación de cuentas";

@XendraField(AD_Column_ID="User2_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e10d7b88-9639-97e1-c65a-c064a3e16e64",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@$Element_U2@='Y'",DisplayLength=10,IsReadOnly=false,SeqNo=210,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="e7c0d3a4-acf0-ba3e-a0e6-873e78c24f5a")
public static final String FIELDNAME_ShipmentLine_UserList22="e7c0d3a4-acf0-ba3e-a0e6-873e78c24f5a";

@XendraTrl(Identifier="08a835bb-ed63-2721-2a99-a25b4113156c")
public static String es_PE_FIELD_ReceiptLine_UserList22_Name="Usuario 2";

@XendraTrl(Identifier="08a835bb-ed63-2721-2a99-a25b4113156c")
public static String es_PE_FIELD_ReceiptLine_UserList22_Description="El usuario definió el elemento # 2";

@XendraTrl(Identifier="08a835bb-ed63-2721-2a99-a25b4113156c")
public static String es_PE_FIELD_ReceiptLine_UserList22_Help="El elemento definido por el usuario despliega los elementos opcionales que han sido definidos para esta combinación de cuentas";

@XendraField(AD_Column_ID="User2_ID",IsCentrallyMaintained=true,
AD_Tab_ID="db93a6dc-a6d3-5694-f203-389b98b1e2ec",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@$Element_U2@='Y'",DisplayLength=10,IsReadOnly=false,SeqNo=210,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="08a835bb-ed63-2721-2a99-a25b4113156c")
public static final String FIELDNAME_ReceiptLine_UserList22="08a835bb-ed63-2721-2a99-a25b4113156c";

@XendraTrl(Identifier="08d9eb8d-adbd-edfe-aa3c-f934fb372fad")
public static String es_PE_COLUMN_User2_ID_Name="Usuario 2";

@XendraColumn(AD_Element_ID="1b668c90-6743-20a2-df62-576857d72c06",ColumnName="User2_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="6a357ab2-7bb6-fce4-ffee-8bdd855a77fc",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="08d9eb8d-adbd-edfe-aa3c-f934fb372fad",Synchronized="2020-03-03 21:38:27.0")
/** Column name User2_ID */
public static final String COLUMNNAME_User2_ID = "User2_ID";
}
