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
/** Generated Model for M_InOutLineConfirm
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_InOutLineConfirm extends PO
{
/** Standard Constructor
@param ctx context
@param M_InOutLineConfirm_ID id
@param trxName transaction
*/
public X_M_InOutLineConfirm (Properties ctx, int M_InOutLineConfirm_ID, String trxName)
{
super (ctx, M_InOutLineConfirm_ID, trxName);
/** if (M_InOutLineConfirm_ID == 0)
{
setConfirmedQty (Env.ZERO);
setM_InOutConfirm_ID (0);
setM_InOutLineConfirm_ID (0);
setM_InOutLine_ID (0);
setProcessed (false);	
// N
setTargetQty (Env.ZERO);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_M_InOutLineConfirm (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=728 */
public static int Table_ID=MTable.getTable_ID("M_InOutLineConfirm");

@XendraTrl(Identifier="3b930bb7-d28d-77b3-9ff5-db7239076fa8")
public static String es_PE_TAB_Confirmations_Description="Confirmaciones opcionales de las líneas del recibo.";

@XendraTrl(Identifier="3b930bb7-d28d-77b3-9ff5-db7239076fa8")
public static String es_PE_TAB_Confirmations_Name="Confirmaciones";

@XendraTrl(Identifier="3b930bb7-d28d-77b3-9ff5-db7239076fa8")
public static String es_PE_TAB_Confirmations_Help="¡Las cantidades están en la unidad del almacenaje de la medida!";

@XendraTab(Name="Confirmations",Description="Optional Confirmations of Receipt Lines",
Help="The quantities are in the storage Unit of Measure!",
AD_Window_ID="6856bd55-6f78-c775-449b-ef4aa2d1e170",SeqNo=30,TabLevel=2,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=true,
AD_Column_ID="f7238fd7-45e6-0317-69eb-9bf8b90fed4a",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=false,
IsAdvancedTab=true,Parent_Column_ID="",Identifier="3b930bb7-d28d-77b3-9ff5-db7239076fa8",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Confirmations="3b930bb7-d28d-77b3-9ff5-db7239076fa8";

@XendraTrl(Identifier="95231c06-f1c6-5545-fc1b-9ee8979bdf2b")
public static String es_PE_TAB_Confirmations2_Description="Confirmaciones opcionales de lineas de envio";

@XendraTrl(Identifier="95231c06-f1c6-5545-fc1b-9ee8979bdf2b")
public static String es_PE_TAB_Confirmations2_Name="Confirmaciones";

@XendraTrl(Identifier="95231c06-f1c6-5545-fc1b-9ee8979bdf2b")
public static String es_PE_TAB_Confirmations2_Help="¡Las cantidades están en la unidad de almacenaje de la medida!";

@XendraTab(Name="Confirmations",Description="Optional Confirmations of Shipment Lines",
Help="The quantities are in the storage Unit of Measure!",
AD_Window_ID="e6e007b8-22d0-0418-baa2-2de7b38251fb",SeqNo=30,TabLevel=2,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=true,
AD_Column_ID="f7238fd7-45e6-0317-69eb-9bf8b90fed4a",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=false,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="95231c06-f1c6-5545-fc1b-9ee8979bdf2b",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Confirmations2="95231c06-f1c6-5545-fc1b-9ee8979bdf2b";

@XendraTrl(Identifier="450663b7-264a-bae5-8012-97e8c262ec02")
public static String es_PE_TAB_Line_Description="Ìtem de Confirmación de entrega ó recibo de Material";

@XendraTrl(Identifier="450663b7-264a-bae5-8012-97e8c262ec02")
public static String es_PE_TAB_Line_Name="Ìtem";

@XendraTrl(Identifier="450663b7-264a-bae5-8012-97e8c262ec02")
public static String es_PE_TAB_Line_Help="Detalles de Confirmación";
@XendraTab(Name="Line",
Description="Material Shipment or Receipt Confirmation Line",
Help="The quantities are in the storage Unit of Measure!",
AD_Window_ID="28bd308b-927c-348b-3c82-31e192b65c0b",SeqNo=20,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="450663b7-264a-bae5-8012-97e8c262ec02",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Line="450663b7-264a-bae5-8012-97e8c262ec02";

@XendraTrl(Identifier="866bc850-a02b-c850-b68a-0db876bd98c2")
public static String es_PE_TABLE_M_InOutLineConfirm_Name="Línea Confirmación entrega/Recibo";


@XendraTable(Name="Ship/Receipt Confirmation Line",
Description="Material Shipment or Receipt Confirmation Line",Help="",
TableName="M_InOutLineConfirm",AccessLevel="1",AD_Window_ID="28bd308b-927c-348b-3c82-31e192b65c0b",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=140,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.material",
Identifier="866bc850-a02b-c850-b68a-0db876bd98c2",Synchronized="2017-08-16 11:43:16.0")
/** TableName=M_InOutLineConfirm */
public static final String Table_Name="M_InOutLineConfirm";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_InOutLineConfirm");

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
    Table_ID = MTable.getTable_ID("M_InOutLineConfirm");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_InOutLineConfirm[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Invoice Line.
@param C_InvoiceLine_ID Invoice Detail Line */
public void setC_InvoiceLine_ID (int C_InvoiceLine_ID)
{
if (C_InvoiceLine_ID <= 0) set_Value (COLUMNNAME_C_InvoiceLine_ID, null);
 else 
set_Value (COLUMNNAME_C_InvoiceLine_ID, Integer.valueOf(C_InvoiceLine_ID));
}
/** Get Invoice Line.
@return Invoice Detail Line */
public int getC_InvoiceLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_InvoiceLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="21caa815-b6a8-449e-0f82-5a1abbd944eb")
public static String es_PE_FIELD_Line_InvoiceLine_Description="Item de detalle de factura";

@XendraTrl(Identifier="21caa815-b6a8-449e-0f82-5a1abbd944eb")
public static String es_PE_FIELD_Line_InvoiceLine_Help="Identifica de manera única un Item de la factura";

@XendraTrl(Identifier="21caa815-b6a8-449e-0f82-5a1abbd944eb")
public static String es_PE_FIELD_Line_InvoiceLine_Name="Item de Factura";

@XendraField(AD_Column_ID="C_InvoiceLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="450663b7-264a-bae5-8012-97e8c262ec02",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@Processed@=Y",DisplayLength=26,IsReadOnly=true,SeqNo=120,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="21caa815-b6a8-449e-0f82-5a1abbd944eb")
public static final String FIELDNAME_Line_InvoiceLine="21caa815-b6a8-449e-0f82-5a1abbd944eb";

@XendraTrl(Identifier="71c26da3-f6fb-256e-c101-dd8726fdff68")
public static String es_PE_FIELD_Confirmations_InvoiceLine_Description="Item de detalle de factura";

@XendraTrl(Identifier="71c26da3-f6fb-256e-c101-dd8726fdff68")
public static String es_PE_FIELD_Confirmations_InvoiceLine_Help="Identifica de manera única un Item de la factura";

@XendraTrl(Identifier="71c26da3-f6fb-256e-c101-dd8726fdff68")
public static String es_PE_FIELD_Confirmations_InvoiceLine_Name="Item de Factura";

@XendraField(AD_Column_ID="C_InvoiceLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="3b930bb7-d28d-77b3-9ff5-db7239076fa8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="71c26da3-f6fb-256e-c101-dd8726fdff68")
public static final String FIELDNAME_Confirmations_InvoiceLine="71c26da3-f6fb-256e-c101-dd8726fdff68";

@XendraTrl(Identifier="4e7cb9d9-ef45-16f6-c952-83fd3b1e55d2")
public static String es_PE_FIELD_Confirmations_InvoiceLine2_Description="Item de detalle de factura";

@XendraTrl(Identifier="4e7cb9d9-ef45-16f6-c952-83fd3b1e55d2")
public static String es_PE_FIELD_Confirmations_InvoiceLine2_Help="Identifica de manera única un Item de la factura";

@XendraTrl(Identifier="4e7cb9d9-ef45-16f6-c952-83fd3b1e55d2")
public static String es_PE_FIELD_Confirmations_InvoiceLine2_Name="Item de Factura";

@XendraField(AD_Column_ID="C_InvoiceLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="95231c06-f1c6-5545-fc1b-9ee8979bdf2b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4e7cb9d9-ef45-16f6-c952-83fd3b1e55d2")
public static final String FIELDNAME_Confirmations_InvoiceLine2="4e7cb9d9-ef45-16f6-c952-83fd3b1e55d2";

@XendraTrl(Identifier="2a34e1fb-b4d2-c71b-c974-4b8f24eaae56")
public static String es_PE_COLUMN_C_InvoiceLine_ID_Name="Línea de Factura";

@XendraColumn(AD_Element_ID="56a4b078-1c5d-e08d-5d9d-847e94161779",ColumnName="C_InvoiceLine_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2a34e1fb-b4d2-c71b-c974-4b8f24eaae56",
Synchronized="2017-08-05 16:55:11.0")
/** Column name C_InvoiceLine_ID */
public static final String COLUMNNAME_C_InvoiceLine_ID = "C_InvoiceLine_ID";
/** Set Confirmation No.
@param ConfirmationNo Confirmation Number */
public void setConfirmationNo (String ConfirmationNo)
{
if (ConfirmationNo != null && ConfirmationNo.length() > 20)
{
log.warning("Length > 20 - truncated");
ConfirmationNo = ConfirmationNo.substring(0,19);
}
set_Value (COLUMNNAME_ConfirmationNo, ConfirmationNo);
}
/** Get Confirmation No.
@return Confirmation Number */
public String getConfirmationNo() 
{
String value = (String)get_Value(COLUMNNAME_ConfirmationNo);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="e36f6b8f-9b4e-a052-acba-34acde3e0282")
public static String es_PE_FIELD_Line_ConfirmationNo_Description="Número de confirmación";

@XendraTrl(Identifier="e36f6b8f-9b4e-a052-acba-34acde3e0282")
public static String es_PE_FIELD_Line_ConfirmationNo_Name="No. de Confirmación";

@XendraField(AD_Column_ID="ConfirmationNo",IsCentrallyMaintained=true,
AD_Tab_ID="450663b7-264a-bae5-8012-97e8c262ec02",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e36f6b8f-9b4e-a052-acba-34acde3e0282")
public static final String FIELDNAME_Line_ConfirmationNo="e36f6b8f-9b4e-a052-acba-34acde3e0282";

@XendraTrl(Identifier="a559c3fa-38f0-1100-50cb-2f04b2b5d3b6")
public static String es_PE_FIELD_Confirmations_ConfirmationNo_Description="Número de confirmación";

@XendraTrl(Identifier="a559c3fa-38f0-1100-50cb-2f04b2b5d3b6")
public static String es_PE_FIELD_Confirmations_ConfirmationNo_Name="No. de Confirmación";

@XendraField(AD_Column_ID="ConfirmationNo",IsCentrallyMaintained=true,
AD_Tab_ID="3b930bb7-d28d-77b3-9ff5-db7239076fa8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=60,SortNo=3,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a559c3fa-38f0-1100-50cb-2f04b2b5d3b6")
public static final String FIELDNAME_Confirmations_ConfirmationNo="a559c3fa-38f0-1100-50cb-2f04b2b5d3b6";

@XendraTrl(Identifier="67b50db4-673b-6b91-a388-3f4911606be1")
public static String es_PE_FIELD_Confirmations_ConfirmationNo2_Description="Número de confirmación";

@XendraTrl(Identifier="67b50db4-673b-6b91-a388-3f4911606be1")
public static String es_PE_FIELD_Confirmations_ConfirmationNo2_Name="No. de Confirmación";

@XendraField(AD_Column_ID="ConfirmationNo",IsCentrallyMaintained=true,
AD_Tab_ID="95231c06-f1c6-5545-fc1b-9ee8979bdf2b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=60,SortNo=3,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="67b50db4-673b-6b91-a388-3f4911606be1")
public static final String FIELDNAME_Confirmations_ConfirmationNo2="67b50db4-673b-6b91-a388-3f4911606be1";

@XendraTrl(Identifier="1a299cbc-51ed-a85a-b325-c7fd67369bd8")
public static String es_PE_COLUMN_ConfirmationNo_Name="No. de Confirmación";

@XendraColumn(AD_Element_ID="d976e121-1e1b-2d2d-2125-7fa5bf911c19",ColumnName="ConfirmationNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1a299cbc-51ed-a85a-b325-c7fd67369bd8",
Synchronized="2017-08-05 16:55:11.0")
/** Column name ConfirmationNo */
public static final String COLUMNNAME_ConfirmationNo = "ConfirmationNo";
/** Set Confirmed Quantity.
@param ConfirmedQty Confirmation of a received quantity */
public void setConfirmedQty (BigDecimal ConfirmedQty)
{
if (ConfirmedQty == null) throw new IllegalArgumentException ("ConfirmedQty is mandatory.");
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

@XendraTrl(Identifier="87ee4221-816b-92cd-a427-4ebbe6229f0f")
public static String es_PE_FIELD_Line_ConfirmedQuantity_Description="Confirmación de la cantidad recibida";

@XendraTrl(Identifier="87ee4221-816b-92cd-a427-4ebbe6229f0f")
public static String es_PE_FIELD_Line_ConfirmedQuantity_Help="Confirmación de la cantidad recibida";

@XendraTrl(Identifier="87ee4221-816b-92cd-a427-4ebbe6229f0f")
public static String es_PE_FIELD_Line_ConfirmedQuantity_Name="Cantidad Confirmada";

@XendraField(AD_Column_ID="ConfirmedQty",IsCentrallyMaintained=true,
AD_Tab_ID="450663b7-264a-bae5-8012-97e8c262ec02",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="87ee4221-816b-92cd-a427-4ebbe6229f0f")
public static final String FIELDNAME_Line_ConfirmedQuantity="87ee4221-816b-92cd-a427-4ebbe6229f0f";

@XendraTrl(Identifier="d02799b6-afc2-5560-e97e-3030ad0de2d0")
public static String es_PE_FIELD_Confirmations_ConfirmedQuantity_Description="Confirmación de la cantidad recibida";

@XendraTrl(Identifier="d02799b6-afc2-5560-e97e-3030ad0de2d0")
public static String es_PE_FIELD_Confirmations_ConfirmedQuantity_Help="Confirmación de la cantidad recibida";

@XendraTrl(Identifier="d02799b6-afc2-5560-e97e-3030ad0de2d0")
public static String es_PE_FIELD_Confirmations_ConfirmedQuantity_Name="Cantidad Confirmada";

@XendraField(AD_Column_ID="ConfirmedQty",IsCentrallyMaintained=true,
AD_Tab_ID="3b930bb7-d28d-77b3-9ff5-db7239076fa8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=80,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d02799b6-afc2-5560-e97e-3030ad0de2d0")
public static final String FIELDNAME_Confirmations_ConfirmedQuantity="d02799b6-afc2-5560-e97e-3030ad0de2d0";

@XendraTrl(Identifier="fcc4eee1-e19e-fc48-336a-0e289c9ec718")
public static String es_PE_FIELD_Confirmations_ConfirmedQuantity2_Description="Confirmación de la cantidad recibida";

@XendraTrl(Identifier="fcc4eee1-e19e-fc48-336a-0e289c9ec718")
public static String es_PE_FIELD_Confirmations_ConfirmedQuantity2_Help="Confirmación de la cantidad recibida";

@XendraTrl(Identifier="fcc4eee1-e19e-fc48-336a-0e289c9ec718")
public static String es_PE_FIELD_Confirmations_ConfirmedQuantity2_Name="Cantidad Confirmada";

@XendraField(AD_Column_ID="ConfirmedQty",IsCentrallyMaintained=true,
AD_Tab_ID="95231c06-f1c6-5545-fc1b-9ee8979bdf2b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=80,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fcc4eee1-e19e-fc48-336a-0e289c9ec718")
public static final String FIELDNAME_Confirmations_ConfirmedQuantity2="fcc4eee1-e19e-fc48-336a-0e289c9ec718";

@XendraTrl(Identifier="57bbca44-eddc-1475-10ff-146550697ea5")
public static String es_PE_COLUMN_ConfirmedQty_Name="Cantidad Confirmada";

@XendraColumn(AD_Element_ID="e612ae07-ebb5-65be-fcbd-a37419fb113f",ColumnName="ConfirmedQty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="57bbca44-eddc-1475-10ff-146550697ea5",
Synchronized="2017-08-05 16:55:11.0")
/** Column name ConfirmedQty */
public static final String COLUMNNAME_ConfirmedQty = "ConfirmedQty";
/** Set Description.
@param Description Optional short DESCRIPTION of the record */
public void setDescription (String Description)
{
if (Description != null && Description.length() > 255)
{
log.warning("Length > 255 - truncated");
Description = Description.substring(0,254);
}
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

@XendraTrl(Identifier="56647a96-94ba-ccf7-bb22-58d62e4b4f88")
public static String es_PE_FIELD_Line_Description_Description="Observación";

@XendraTrl(Identifier="56647a96-94ba-ccf7-bb22-58d62e4b4f88")
public static String es_PE_FIELD_Line_Description_Help="Observación";

@XendraTrl(Identifier="56647a96-94ba-ccf7-bb22-58d62e4b4f88")
public static String es_PE_FIELD_Line_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="450663b7-264a-bae5-8012-97e8c262ec02",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="56647a96-94ba-ccf7-bb22-58d62e4b4f88")
public static final String FIELDNAME_Line_Description="56647a96-94ba-ccf7-bb22-58d62e4b4f88";

@XendraTrl(Identifier="a7b35e4b-a673-8aa5-4bd1-86de3f16c82b")
public static String es_PE_FIELD_Confirmations_Description_Description="Observación";

@XendraTrl(Identifier="a7b35e4b-a673-8aa5-4bd1-86de3f16c82b")
public static String es_PE_FIELD_Confirmations_Description_Help="Observación";

@XendraTrl(Identifier="a7b35e4b-a673-8aa5-4bd1-86de3f16c82b")
public static String es_PE_FIELD_Confirmations_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="3b930bb7-d28d-77b3-9ff5-db7239076fa8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a7b35e4b-a673-8aa5-4bd1-86de3f16c82b")
public static final String FIELDNAME_Confirmations_Description="a7b35e4b-a673-8aa5-4bd1-86de3f16c82b";

@XendraTrl(Identifier="05a40546-3a99-7fe2-3b78-ea8c42a5f91a")
public static String es_PE_FIELD_Confirmations_Description2_Description="Observación";

@XendraTrl(Identifier="05a40546-3a99-7fe2-3b78-ea8c42a5f91a")
public static String es_PE_FIELD_Confirmations_Description2_Help="Observación";

@XendraTrl(Identifier="05a40546-3a99-7fe2-3b78-ea8c42a5f91a")
public static String es_PE_FIELD_Confirmations_Description2_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="95231c06-f1c6-5545-fc1b-9ee8979bdf2b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="05a40546-3a99-7fe2-3b78-ea8c42a5f91a")
public static final String FIELDNAME_Confirmations_Description2="05a40546-3a99-7fe2-3b78-ea8c42a5f91a";

@XendraTrl(Identifier="fbda1044-eca5-8463-3be2-b7f4df4b44b2")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=true,ColumnSQL="",
IsAllowLogging=false,Identifier="fbda1044-eca5-8463-3be2-b7f4df4b44b2",
Synchronized="2017-08-05 16:55:11.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Difference.
@param DifferenceQty Difference Quantity */
public void setDifferenceQty (BigDecimal DifferenceQty)
{
set_Value (COLUMNNAME_DifferenceQty, DifferenceQty);
}
/** Get Difference.
@return Difference Quantity */
public BigDecimal getDifferenceQty() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_DifferenceQty);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="4c14c475-e645-4bad-ae37-f9a7c09182d9")
public static String es_PE_FIELD_Line_Difference_Description="Cantidad de diferencia";

@XendraTrl(Identifier="4c14c475-e645-4bad-ae37-f9a7c09182d9")
public static String es_PE_FIELD_Line_Difference_Name="Diferencia Cant.";

@XendraField(AD_Column_ID="DifferenceQty",IsCentrallyMaintained=true,
AD_Tab_ID="450663b7-264a-bae5-8012-97e8c262ec02",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4c14c475-e645-4bad-ae37-f9a7c09182d9")
public static final String FIELDNAME_Line_Difference="4c14c475-e645-4bad-ae37-f9a7c09182d9";

@XendraTrl(Identifier="f364ac8b-d9ed-95bb-09e5-067de68a2145")
public static String es_PE_FIELD_Confirmations_Difference_Description="Cantidad de diferencia";

@XendraTrl(Identifier="f364ac8b-d9ed-95bb-09e5-067de68a2145")
public static String es_PE_FIELD_Confirmations_Difference_Name="Diferencia Cant.";

@XendraField(AD_Column_ID="DifferenceQty",IsCentrallyMaintained=true,
AD_Tab_ID="3b930bb7-d28d-77b3-9ff5-db7239076fa8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f364ac8b-d9ed-95bb-09e5-067de68a2145")
public static final String FIELDNAME_Confirmations_Difference="f364ac8b-d9ed-95bb-09e5-067de68a2145";

@XendraTrl(Identifier="c0fc9837-0339-0dee-755f-ea060f597252")
public static String es_PE_FIELD_Confirmations_Difference2_Description="Cantidad de diferencia";

@XendraTrl(Identifier="c0fc9837-0339-0dee-755f-ea060f597252")
public static String es_PE_FIELD_Confirmations_Difference2_Name="Diferencia Cant.";

@XendraField(AD_Column_ID="DifferenceQty",IsCentrallyMaintained=true,
AD_Tab_ID="95231c06-f1c6-5545-fc1b-9ee8979bdf2b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c0fc9837-0339-0dee-755f-ea060f597252")
public static final String FIELDNAME_Confirmations_Difference2="c0fc9837-0339-0dee-755f-ea060f597252";

@XendraTrl(Identifier="ca464818-aa61-02bc-1919-55b966dab74c")
public static String es_PE_COLUMN_DifferenceQty_Name="Diferencia Cant.";

@XendraColumn(AD_Element_ID="7bb51895-43a5-614f-71a2-9c6ac66e8ea0",ColumnName="DifferenceQty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ca464818-aa61-02bc-1919-55b966dab74c",
Synchronized="2017-08-05 16:55:11.0")
/** Column name DifferenceQty */
public static final String COLUMNNAME_DifferenceQty = "DifferenceQty";
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
@XendraTrl(Identifier="b84e06cc-6a5a-47a1-88de-628037266f1c")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b84e06cc-6a5a-47a1-88de-628037266f1c",
Synchronized="2017-08-05 16:55:11.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Ship/Receipt Confirmation.
@param M_InOutConfirm_ID Material Shipment or Receipt Confirmation */
public void setM_InOutConfirm_ID (int M_InOutConfirm_ID)
{
if (M_InOutConfirm_ID < 1) throw new IllegalArgumentException ("M_InOutConfirm_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_InOutConfirm_ID, Integer.valueOf(M_InOutConfirm_ID));
}
/** Get Ship/Receipt Confirmation.
@return Material Shipment or Receipt Confirmation */
public int getM_InOutConfirm_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_InOutConfirm_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="3ffee904-6df6-c2c4-e144-ef1c45e58654")
public static String es_PE_FIELD_Line_ShipReceiptConfirmation_Description="Confirmación material del envío ó del recibo";

@XendraTrl(Identifier="3ffee904-6df6-c2c4-e144-ef1c45e58654")
public static String es_PE_FIELD_Line_ShipReceiptConfirmation_Help="Confirmación del envío ó del recibo - creado del Envio/Recibo";

@XendraTrl(Identifier="3ffee904-6df6-c2c4-e144-ef1c45e58654")
public static String es_PE_FIELD_Line_ShipReceiptConfirmation_Name="Confirmación entrega/Recibo";

@XendraField(AD_Column_ID="M_InOutConfirm_ID",IsCentrallyMaintained=true,
AD_Tab_ID="450663b7-264a-bae5-8012-97e8c262ec02",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3ffee904-6df6-c2c4-e144-ef1c45e58654")
public static final String FIELDNAME_Line_ShipReceiptConfirmation="3ffee904-6df6-c2c4-e144-ef1c45e58654";

@XendraTrl(Identifier="53817b9d-fb9f-ceb6-8f35-46c0c0378a2a")
public static String es_PE_FIELD_Confirmations_ShipReceiptConfirmation_Description="Confirmación material del envío ó del recibo";

@XendraTrl(Identifier="53817b9d-fb9f-ceb6-8f35-46c0c0378a2a")
public static String es_PE_FIELD_Confirmations_ShipReceiptConfirmation_Help="Confirmación del envío ó del recibo - creado del Envio/Recibo";

@XendraTrl(Identifier="53817b9d-fb9f-ceb6-8f35-46c0c0378a2a")
public static String es_PE_FIELD_Confirmations_ShipReceiptConfirmation_Name="Confirmación entrega/Recibo";

@XendraField(AD_Column_ID="M_InOutConfirm_ID",IsCentrallyMaintained=true,
AD_Tab_ID="3b930bb7-d28d-77b3-9ff5-db7239076fa8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="53817b9d-fb9f-ceb6-8f35-46c0c0378a2a")
public static final String FIELDNAME_Confirmations_ShipReceiptConfirmation="53817b9d-fb9f-ceb6-8f35-46c0c0378a2a";

@XendraTrl(Identifier="487a6e59-4baa-5fd6-bd9e-12b30b6211ab")
public static String es_PE_FIELD_Confirmations_ShipReceiptConfirmation2_Description="Confirmación material del envío ó del recibo";

@XendraTrl(Identifier="487a6e59-4baa-5fd6-bd9e-12b30b6211ab")
public static String es_PE_FIELD_Confirmations_ShipReceiptConfirmation2_Help="Confirmación del envío ó del recibo - creado del Envio/Recibo";

@XendraTrl(Identifier="487a6e59-4baa-5fd6-bd9e-12b30b6211ab")
public static String es_PE_FIELD_Confirmations_ShipReceiptConfirmation2_Name="Confirmación entrega/Recibo";

@XendraField(AD_Column_ID="M_InOutConfirm_ID",IsCentrallyMaintained=true,
AD_Tab_ID="95231c06-f1c6-5545-fc1b-9ee8979bdf2b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="487a6e59-4baa-5fd6-bd9e-12b30b6211ab")
public static final String FIELDNAME_Confirmations_ShipReceiptConfirmation2="487a6e59-4baa-5fd6-bd9e-12b30b6211ab";

@XendraTrl(Identifier="c214ad1a-d747-af53-6345-99a562ac6131")
public static String es_PE_COLUMN_M_InOutConfirm_ID_Name="Confirmación entrega/Recibo";

@XendraColumn(AD_Element_ID="e16d24a0-85b5-e768-23a7-063164db19ed",ColumnName="M_InOutConfirm_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c214ad1a-d747-af53-6345-99a562ac6131",
Synchronized="2017-08-05 16:55:11.0")
/** Column name M_InOutConfirm_ID */
public static final String COLUMNNAME_M_InOutConfirm_ID = "M_InOutConfirm_ID";
/** Set Ship/Receipt Confirmation Line.
@param M_InOutLineConfirm_ID Material Shipment or Receipt Confirmation Line */
public void setM_InOutLineConfirm_ID (int M_InOutLineConfirm_ID)
{
if (M_InOutLineConfirm_ID < 1) throw new IllegalArgumentException ("M_InOutLineConfirm_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_InOutLineConfirm_ID, Integer.valueOf(M_InOutLineConfirm_ID));
}
/** Get Ship/Receipt Confirmation Line.
@return Material Shipment or Receipt Confirmation Line */
public int getM_InOutLineConfirm_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_InOutLineConfirm_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f6dfe584-8ddd-8731-fa03-7bbd4c7481c4")
public static String es_PE_FIELD_Line_ShipReceiptConfirmationLine_Description="Envio de material ó Item de confirmación del recibo.";

@XendraTrl(Identifier="f6dfe584-8ddd-8731-fa03-7bbd4c7481c4")
public static String es_PE_FIELD_Line_ShipReceiptConfirmationLine_Help="Detalles de la confirmación.";

@XendraTrl(Identifier="f6dfe584-8ddd-8731-fa03-7bbd4c7481c4")
public static String es_PE_FIELD_Line_ShipReceiptConfirmationLine_Name="Item Confirmación entrega/Recibo";

@XendraField(AD_Column_ID="M_InOutLineConfirm_ID",IsCentrallyMaintained=true,
AD_Tab_ID="450663b7-264a-bae5-8012-97e8c262ec02",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f6dfe584-8ddd-8731-fa03-7bbd4c7481c4")
public static final String FIELDNAME_Line_ShipReceiptConfirmationLine="f6dfe584-8ddd-8731-fa03-7bbd4c7481c4";

@XendraTrl(Identifier="733336a8-7eee-16dc-8c6a-0562de527b39")
public static String es_PE_FIELD_Confirmations_ShipReceiptConfirmationLine_Description="Envio de material ó Item de confirmación del recibo.";

@XendraTrl(Identifier="733336a8-7eee-16dc-8c6a-0562de527b39")
public static String es_PE_FIELD_Confirmations_ShipReceiptConfirmationLine_Help="Detalles de la confirmación.";

@XendraTrl(Identifier="733336a8-7eee-16dc-8c6a-0562de527b39")
public static String es_PE_FIELD_Confirmations_ShipReceiptConfirmationLine_Name="Item Confirmación entrega/Recibo";

@XendraField(AD_Column_ID="M_InOutLineConfirm_ID",IsCentrallyMaintained=true,
AD_Tab_ID="3b930bb7-d28d-77b3-9ff5-db7239076fa8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=50,SortNo=2,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="733336a8-7eee-16dc-8c6a-0562de527b39")
public static final String FIELDNAME_Confirmations_ShipReceiptConfirmationLine="733336a8-7eee-16dc-8c6a-0562de527b39";

@XendraTrl(Identifier="ba778039-f0f3-aaa4-cf95-8a6d4bb141ba")
public static String es_PE_FIELD_Confirmations_ShipReceiptConfirmationLine2_Description="Envio de material ó Item de confirmación del recibo.";

@XendraTrl(Identifier="ba778039-f0f3-aaa4-cf95-8a6d4bb141ba")
public static String es_PE_FIELD_Confirmations_ShipReceiptConfirmationLine2_Help="Detalles de la confirmación.";

@XendraTrl(Identifier="ba778039-f0f3-aaa4-cf95-8a6d4bb141ba")
public static String es_PE_FIELD_Confirmations_ShipReceiptConfirmationLine2_Name="Item Confirmación entrega/Recibo";

@XendraField(AD_Column_ID="M_InOutLineConfirm_ID",IsCentrallyMaintained=true,
AD_Tab_ID="95231c06-f1c6-5545-fc1b-9ee8979bdf2b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=50,SortNo=2,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ba778039-f0f3-aaa4-cf95-8a6d4bb141ba")
public static final String FIELDNAME_Confirmations_ShipReceiptConfirmationLine2="ba778039-f0f3-aaa4-cf95-8a6d4bb141ba";
/** Column name M_InOutLineConfirm_ID */
public static final String COLUMNNAME_M_InOutLineConfirm_ID = "M_InOutLineConfirm_ID";
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
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getM_InOutLine_ID()));
}

@XendraTrl(Identifier="9d82490a-e537-274b-286d-9d799a622e5a")
public static String es_PE_FIELD_Line_ShipmentReceiptLine_Description="Item de entrega ó documento de recibo.";

@XendraTrl(Identifier="9d82490a-e537-274b-286d-9d799a622e5a")
public static String es_PE_FIELD_Line_ShipmentReceiptLine_Help="Indica un Item único en un documento de entrega / recibo";

@XendraTrl(Identifier="9d82490a-e537-274b-286d-9d799a622e5a")
public static String es_PE_FIELD_Line_ShipmentReceiptLine_Name="Item Entrega / Recibo";

@XendraField(AD_Column_ID="M_InOutLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="450663b7-264a-bae5-8012-97e8c262ec02",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=40,SortNo=1,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9d82490a-e537-274b-286d-9d799a622e5a")
public static final String FIELDNAME_Line_ShipmentReceiptLine="9d82490a-e537-274b-286d-9d799a622e5a";

@XendraTrl(Identifier="c08bc497-728e-cfd6-0213-bac0106ffecc")
public static String es_PE_FIELD_Confirmations_ReceiptLine_Description="Item de entrega ó documento de recibo.";

@XendraTrl(Identifier="c08bc497-728e-cfd6-0213-bac0106ffecc")
public static String es_PE_FIELD_Confirmations_ReceiptLine_Help="Indica un Item único en un documento de entrega / recibo";

@XendraTrl(Identifier="c08bc497-728e-cfd6-0213-bac0106ffecc")
public static String es_PE_FIELD_Confirmations_ReceiptLine_Name="Item Entrega / Recibo";

@XendraField(AD_Column_ID="M_InOutLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="3b930bb7-d28d-77b3-9ff5-db7239076fa8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c08bc497-728e-cfd6-0213-bac0106ffecc")
public static final String FIELDNAME_Confirmations_ReceiptLine="c08bc497-728e-cfd6-0213-bac0106ffecc";

@XendraTrl(Identifier="74d10929-4bdb-cac7-58ab-ff70134ccd35")
public static String es_PE_FIELD_Confirmations_ShipmentReceiptLine_Description="Item de entrega ó documento de recibo.";

@XendraTrl(Identifier="74d10929-4bdb-cac7-58ab-ff70134ccd35")
public static String es_PE_FIELD_Confirmations_ShipmentReceiptLine_Help="Indica un Item único en un documento de entrega / recibo";

@XendraTrl(Identifier="74d10929-4bdb-cac7-58ab-ff70134ccd35")
public static String es_PE_FIELD_Confirmations_ShipmentReceiptLine_Name="Item Entrega / Recibo";

@XendraField(AD_Column_ID="M_InOutLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="95231c06-f1c6-5545-fc1b-9ee8979bdf2b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="74d10929-4bdb-cac7-58ab-ff70134ccd35")
public static final String FIELDNAME_Confirmations_ShipmentReceiptLine="74d10929-4bdb-cac7-58ab-ff70134ccd35";

@XendraTrl(Identifier="f7238fd7-45e6-0317-69eb-9bf8b90fed4a")
public static String es_PE_COLUMN_M_InOutLine_ID_Name="Línea Entrega / Recibo";

@XendraColumn(AD_Element_ID="a4d9928e-fbec-fd6c-b061-d3dbbd7de02c",ColumnName="M_InOutLine_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f7238fd7-45e6-0317-69eb-9bf8b90fed4a",
Synchronized="2017-08-05 16:55:11.0")
/** Column name M_InOutLine_ID */
public static final String COLUMNNAME_M_InOutLine_ID = "M_InOutLine_ID";
/** Set Phys.Inventory Line.
@param M_InventoryLine_ID Unique line in an Inventory document */
public void setM_InventoryLine_ID (int M_InventoryLine_ID)
{
if (M_InventoryLine_ID <= 0) set_Value (COLUMNNAME_M_InventoryLine_ID, null);
 else 
set_Value (COLUMNNAME_M_InventoryLine_ID, Integer.valueOf(M_InventoryLine_ID));
}
/** Get Phys.Inventory Line.
@return Unique line in an Inventory document */
public int getM_InventoryLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_InventoryLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="39654aba-2a31-cdf5-e951-ae646e00a4e0")
public static String es_PE_FIELD_Line_PhysInventoryLine_Description="Item único en un documento de inventario.";

@XendraTrl(Identifier="39654aba-2a31-cdf5-e951-ae646e00a4e0")
public static String es_PE_FIELD_Line_PhysInventoryLine_Help="Indica el Item del documento del inventario físico (si es aplicable) para esta transacción.";

@XendraTrl(Identifier="39654aba-2a31-cdf5-e951-ae646e00a4e0")
public static String es_PE_FIELD_Line_PhysInventoryLine_Name="Item de Inventario Físico";

@XendraField(AD_Column_ID="M_InventoryLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="450663b7-264a-bae5-8012-97e8c262ec02",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@Processed@=Y",DisplayLength=26,IsReadOnly=true,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="39654aba-2a31-cdf5-e951-ae646e00a4e0")
public static final String FIELDNAME_Line_PhysInventoryLine="39654aba-2a31-cdf5-e951-ae646e00a4e0";

@XendraTrl(Identifier="5fa175fd-2632-db62-ff6e-893b19fddcd8")
public static String es_PE_FIELD_Confirmations_PhysInventoryLine_Description="Item único en un documento de inventario.";

@XendraTrl(Identifier="5fa175fd-2632-db62-ff6e-893b19fddcd8")
public static String es_PE_FIELD_Confirmations_PhysInventoryLine_Help="Indica el Item del documento del inventario físico (si es aplicable) para esta transacción.";

@XendraTrl(Identifier="5fa175fd-2632-db62-ff6e-893b19fddcd8")
public static String es_PE_FIELD_Confirmations_PhysInventoryLine_Name="Item de Inventario Físico";

@XendraField(AD_Column_ID="M_InventoryLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="3b930bb7-d28d-77b3-9ff5-db7239076fa8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5fa175fd-2632-db62-ff6e-893b19fddcd8")
public static final String FIELDNAME_Confirmations_PhysInventoryLine="5fa175fd-2632-db62-ff6e-893b19fddcd8";

@XendraTrl(Identifier="e87ff8e9-30b5-3727-8390-cfad173dd78a")
public static String es_PE_FIELD_Confirmations_PhysInventoryLine2_Description="Item único en un documento de inventario.";

@XendraTrl(Identifier="e87ff8e9-30b5-3727-8390-cfad173dd78a")
public static String es_PE_FIELD_Confirmations_PhysInventoryLine2_Help="Indica el Item del documento del inventario físico (si es aplicable) para esta transacción.";

@XendraTrl(Identifier="e87ff8e9-30b5-3727-8390-cfad173dd78a")
public static String es_PE_FIELD_Confirmations_PhysInventoryLine2_Name="Item de Inventario Físico";

@XendraField(AD_Column_ID="M_InventoryLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="95231c06-f1c6-5545-fc1b-9ee8979bdf2b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e87ff8e9-30b5-3727-8390-cfad173dd78a")
public static final String FIELDNAME_Confirmations_PhysInventoryLine2="e87ff8e9-30b5-3727-8390-cfad173dd78a";

@XendraTrl(Identifier="725b02ae-0013-99a1-d346-e14ed66576b2")
public static String es_PE_COLUMN_M_InventoryLine_ID_Name="Línea de Inventario Físico";

@XendraColumn(AD_Element_ID="2c5571d8-3b1f-8721-db52-cae644155140",ColumnName="M_InventoryLine_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="725b02ae-0013-99a1-d346-e14ed66576b2",
Synchronized="2017-08-05 16:55:11.0")
/** Column name M_InventoryLine_ID */
public static final String COLUMNNAME_M_InventoryLine_ID = "M_InventoryLine_ID";
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

@XendraTrl(Identifier="a77ce218-78b5-9a7f-b998-f4f402a5f6f6")
public static String es_PE_FIELD_Line_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="a77ce218-78b5-9a7f-b998-f4f402a5f6f6")
public static String es_PE_FIELD_Line_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraTrl(Identifier="a77ce218-78b5-9a7f-b998-f4f402a5f6f6")
public static String es_PE_FIELD_Line_Processed_Name="Procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="450663b7-264a-bae5-8012-97e8c262ec02",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a77ce218-78b5-9a7f-b998-f4f402a5f6f6")
public static final String FIELDNAME_Line_Processed="a77ce218-78b5-9a7f-b998-f4f402a5f6f6";

@XendraTrl(Identifier="9363c537-b260-8d67-8fcb-c4bc1e123cd9")
public static String es_PE_FIELD_Confirmations_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="9363c537-b260-8d67-8fcb-c4bc1e123cd9")
public static String es_PE_FIELD_Confirmations_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraTrl(Identifier="9363c537-b260-8d67-8fcb-c4bc1e123cd9")
public static String es_PE_FIELD_Confirmations_Processed_Name="Procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="3b930bb7-d28d-77b3-9ff5-db7239076fa8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9363c537-b260-8d67-8fcb-c4bc1e123cd9")
public static final String FIELDNAME_Confirmations_Processed="9363c537-b260-8d67-8fcb-c4bc1e123cd9";

@XendraTrl(Identifier="de0c955e-233f-719c-5af8-8a0c4a76321b")
public static String es_PE_FIELD_Confirmations_Processed2_Description="El documento ha sido procesado";

@XendraTrl(Identifier="de0c955e-233f-719c-5af8-8a0c4a76321b")
public static String es_PE_FIELD_Confirmations_Processed2_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraTrl(Identifier="de0c955e-233f-719c-5af8-8a0c4a76321b")
public static String es_PE_FIELD_Confirmations_Processed2_Name="Procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="95231c06-f1c6-5545-fc1b-9ee8979bdf2b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="de0c955e-233f-719c-5af8-8a0c4a76321b")
public static final String FIELDNAME_Confirmations_Processed2="de0c955e-233f-719c-5af8-8a0c4a76321b";

@XendraTrl(Identifier="66324232-1a4a-c773-77cb-75937da2292a")
public static String es_PE_COLUMN_Processed_Name="Procesado";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="66324232-1a4a-c773-77cb-75937da2292a",
Synchronized="2017-08-05 16:55:11.0")
/** Column name Processed */
public static final String COLUMNNAME_Processed = "Processed";
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

@XendraTrl(Identifier="b0d6b8db-2583-4ec0-4495-ff5212738eab")
public static String es_PE_FIELD_Line_ScrappedQuantity_Description="La cantidad de desperdicio debido a las ediciones del A.C.";

@XendraTrl(Identifier="b0d6b8db-2583-4ec0-4495-ff5212738eab")
public static String es_PE_FIELD_Line_ScrappedQuantity_Name="Cantidad de Desperdicio";

@XendraField(AD_Column_ID="ScrappedQty",IsCentrallyMaintained=true,
AD_Tab_ID="450663b7-264a-bae5-8012-97e8c262ec02",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b0d6b8db-2583-4ec0-4495-ff5212738eab")
public static final String FIELDNAME_Line_ScrappedQuantity="b0d6b8db-2583-4ec0-4495-ff5212738eab";

@XendraTrl(Identifier="e4744554-6916-5036-f387-15562377cbb4")
public static String es_PE_FIELD_Confirmations_ScrappedQuantity_Description="La cantidad de desperdicio debido a las ediciones del A.C.";

@XendraTrl(Identifier="e4744554-6916-5036-f387-15562377cbb4")
public static String es_PE_FIELD_Confirmations_ScrappedQuantity_Name="Cantidad de Desperdicio";

@XendraField(AD_Column_ID="ScrappedQty",IsCentrallyMaintained=true,
AD_Tab_ID="3b930bb7-d28d-77b3-9ff5-db7239076fa8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e4744554-6916-5036-f387-15562377cbb4")
public static final String FIELDNAME_Confirmations_ScrappedQuantity="e4744554-6916-5036-f387-15562377cbb4";

@XendraTrl(Identifier="bf50eef5-4163-c474-db20-e663121c142c")
public static String es_PE_FIELD_Confirmations_ScrappedQuantity2_Description="La cantidad de desperdicio debido a las ediciones del A.C.";

@XendraTrl(Identifier="bf50eef5-4163-c474-db20-e663121c142c")
public static String es_PE_FIELD_Confirmations_ScrappedQuantity2_Name="Cantidad de Desperdicio";

@XendraField(AD_Column_ID="ScrappedQty",IsCentrallyMaintained=true,
AD_Tab_ID="95231c06-f1c6-5545-fc1b-9ee8979bdf2b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bf50eef5-4163-c474-db20-e663121c142c")
public static final String FIELDNAME_Confirmations_ScrappedQuantity2="bf50eef5-4163-c474-db20-e663121c142c";

@XendraTrl(Identifier="c5e0452a-4cff-9d11-efc5-005a7c471f1b")
public static String es_PE_COLUMN_ScrappedQty_Name="Cantidad de Desperdicio";

@XendraColumn(AD_Element_ID="40b91fb0-3206-0a29-4fd3-de7dde7e4d2c",ColumnName="ScrappedQty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c5e0452a-4cff-9d11-efc5-005a7c471f1b",
Synchronized="2017-08-05 16:55:11.0")
/** Column name ScrappedQty */
public static final String COLUMNNAME_ScrappedQty = "ScrappedQty";
/** Set Target Quantity.
@param TargetQty Target Movement Quantity */
public void setTargetQty (BigDecimal TargetQty)
{
if (TargetQty == null) throw new IllegalArgumentException ("TargetQty is mandatory.");
set_ValueNoCheck (COLUMNNAME_TargetQty, TargetQty);
}
/** Get Target Quantity.
@return Target Movement Quantity */
public BigDecimal getTargetQty() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_TargetQty);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="ae36d8bb-d846-335e-2046-e2805c96519d")
public static String es_PE_FIELD_Line_TargetQuantity_Description="Movimientos de cantidad a recibir";

@XendraTrl(Identifier="ae36d8bb-d846-335e-2046-e2805c96519d")
public static String es_PE_FIELD_Line_TargetQuantity_Help="La cantidad que debio haber sido recibida";

@XendraTrl(Identifier="ae36d8bb-d846-335e-2046-e2805c96519d")
public static String es_PE_FIELD_Line_TargetQuantity_Name="Cantidad a recibir";

@XendraField(AD_Column_ID="TargetQty",IsCentrallyMaintained=true,
AD_Tab_ID="450663b7-264a-bae5-8012-97e8c262ec02",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ae36d8bb-d846-335e-2046-e2805c96519d")
public static final String FIELDNAME_Line_TargetQuantity="ae36d8bb-d846-335e-2046-e2805c96519d";

@XendraTrl(Identifier="5812a86c-a96c-27de-6ce0-125bc9e53bd7")
public static String es_PE_FIELD_Confirmations_TargetQuantity_Description="Movimientos de cantidad a recibir";

@XendraTrl(Identifier="5812a86c-a96c-27de-6ce0-125bc9e53bd7")
public static String es_PE_FIELD_Confirmations_TargetQuantity_Help="La cantidad que debio haber sido recibida";

@XendraTrl(Identifier="5812a86c-a96c-27de-6ce0-125bc9e53bd7")
public static String es_PE_FIELD_Confirmations_TargetQuantity_Name="Cantidad a recibir";

@XendraField(AD_Column_ID="TargetQty",IsCentrallyMaintained=true,
AD_Tab_ID="3b930bb7-d28d-77b3-9ff5-db7239076fa8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5812a86c-a96c-27de-6ce0-125bc9e53bd7")
public static final String FIELDNAME_Confirmations_TargetQuantity="5812a86c-a96c-27de-6ce0-125bc9e53bd7";

@XendraTrl(Identifier="8c7235c1-1121-3f92-31d4-12584ae1b7b4")
public static String es_PE_FIELD_Confirmations_TargetQuantity2_Description="Movimientos de cantidad a recibir";

@XendraTrl(Identifier="8c7235c1-1121-3f92-31d4-12584ae1b7b4")
public static String es_PE_FIELD_Confirmations_TargetQuantity2_Help="La cantidad que debio haber sido recibida";

@XendraTrl(Identifier="8c7235c1-1121-3f92-31d4-12584ae1b7b4")
public static String es_PE_FIELD_Confirmations_TargetQuantity2_Name="Cantidad a recibir";

@XendraField(AD_Column_ID="TargetQty",IsCentrallyMaintained=true,
AD_Tab_ID="95231c06-f1c6-5545-fc1b-9ee8979bdf2b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8c7235c1-1121-3f92-31d4-12584ae1b7b4")
public static final String FIELDNAME_Confirmations_TargetQuantity2="8c7235c1-1121-3f92-31d4-12584ae1b7b4";

@XendraTrl(Identifier="b65e799a-e07f-35fe-5301-b73cfb021775")
public static String es_PE_COLUMN_TargetQty_Name="Cantidad a recibir";

@XendraColumn(AD_Element_ID="6fbec6d0-2133-ed61-f214-65f7655fd4a6",ColumnName="TargetQty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b65e799a-e07f-35fe-5301-b73cfb021775",
Synchronized="2017-08-05 16:55:11.0")
/** Column name TargetQty */
public static final String COLUMNNAME_TargetQty = "TargetQty";
}
