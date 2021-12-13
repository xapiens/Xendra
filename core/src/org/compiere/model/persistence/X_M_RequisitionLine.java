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
/** Generated Model for M_RequisitionLine
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_RequisitionLine extends PO
{
/** Standard Constructor
@param ctx context
@param M_RequisitionLine_ID id
@param trxName transaction
*/
public X_M_RequisitionLine (Properties ctx, int M_RequisitionLine_ID, String trxName)
{
super (ctx, M_RequisitionLine_ID, trxName);
/** if (M_RequisitionLine_ID == 0)
{
setLine (0);	
// @SQL=SELECT COALESCE(MAX(Line),0)+10 AS DefaultValue FROM M_RequisitionLine WHERE M_Requisition_ID=@M_Requisition_ID@
setLineNetAmt (Env.ZERO);	
// 0
setM_Requisition_ID (0);
setM_RequisitionLine_ID (0);
setPriceActual (Env.ZERO);
setQty (Env.ZERO);	
// 1
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_M_RequisitionLine (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=703 */
public static int Table_ID=MTable.getTable_ID("M_RequisitionLine");

@XendraTrl(Identifier="637258c0-1d0c-fdfe-a45b-13c4c73654e3")
public static String es_PE_TAB_RequisitionLine_Description="Requisición de Ìtem de material";

@XendraTrl(Identifier="637258c0-1d0c-fdfe-a45b-13c4c73654e3")
public static String es_PE_TAB_RequisitionLine_Name="Ìtem Requisición";

@XendraTab(Name="Requisition Line",Description="Material Requisition Line",Help="",
AD_Window_ID="f15d0d2b-f9e2-c40d-7ba7-3c3f33dcaa08",SeqNo=20,TabLevel=1,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="637258c0-1d0c-fdfe-a45b-13c4c73654e3",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_RequisitionLine="637258c0-1d0c-fdfe-a45b-13c4c73654e3";

@XendraTrl(Identifier="1e69586d-ee0a-c9dd-9622-3afd230a5e12")
public static String es_PE_TAB_RequisitionLines_Description="Líneas de Requisición Compra Relacionada";

@XendraTrl(Identifier="1e69586d-ee0a-c9dd-9622-3afd230a5e12")
public static String es_PE_TAB_RequisitionLines_Name="Líneas de Requisición";

@XendraTab(Name="Requisition Lines",Description="Related Purchase Requisition Lines",Help="",
AD_Window_ID="041b9539-24f3-7494-c2fa-c360634d60b2",SeqNo=40,TabLevel=2,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=true,
AD_Column_ID="86d28c7b-faf8-40a6-10a0-baf10e36c98b",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=false,
IsAdvancedTab=true,Parent_Column_ID="",Identifier="1e69586d-ee0a-c9dd-9622-3afd230a5e12",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_RequisitionLines="1e69586d-ee0a-c9dd-9622-3afd230a5e12";

@XendraTrl(Identifier="c3ace2d2-50ea-f6d1-abe8-60d39fe10bfe")
public static String es_PE_TABLE_M_RequisitionLine_Name="Línea de Requisición Material";


@XendraTable(Name="Requisition Line",AD_Package_ID="2809ac2d-7d43-20f8-05f0-a478f2e50204",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Material Requisition Line",
Help="",TableName="M_RequisitionLine",AccessLevel="3",
AD_Window_ID="f15d0d2b-f9e2-c40d-7ba7-3c3f33dcaa08",AD_Val_Rule_ID="",IsKey=1,LoadSeq=140,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.material",Identifier="c3ace2d2-50ea-f6d1-abe8-60d39fe10bfe",
Synchronized="2020-03-03 21:38:55.0")
/** TableName=M_RequisitionLine */
public static final String Table_Name="M_RequisitionLine";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_RequisitionLine");

protected BigDecimal accessLevel = BigDecimal.valueOf(3);
/** AccessLevel
@return 3 - Client - Org 
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
    Table_ID = MTable.getTable_ID("M_RequisitionLine");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_RequisitionLine[").append(get_ID()).append("]");
return sb.toString();
}
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

@XendraTrl(Identifier="c434b137-c412-e47d-6df9-2c0ec22a9c8b")
public static String es_PE_FIELD_RequisitionLine_Charge_Name="Cargo";

@XendraTrl(Identifier="c434b137-c412-e47d-6df9-2c0ec22a9c8b")
public static String es_PE_FIELD_RequisitionLine_Charge_Description="Cargos adicionales del documento";

@XendraTrl(Identifier="c434b137-c412-e47d-6df9-2c0ec22a9c8b")
public static String es_PE_FIELD_RequisitionLine_Charge_Help="El cargo indica un tipo de cargo (manejo; despacho; reposición)";

@XendraField(AD_Column_ID="C_Charge_ID",IsCentrallyMaintained=true,
AD_Tab_ID="637258c0-1d0c-fdfe-a45b-13c4c73654e3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@M_Product_ID@=0",DisplayLength=10,IsReadOnly=false,SeqNo=60,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="c434b137-c412-e47d-6df9-2c0ec22a9c8b")
public static final String FIELDNAME_RequisitionLine_Charge="c434b137-c412-e47d-6df9-2c0ec22a9c8b";

@XendraTrl(Identifier="4e705f25-8c90-7d6c-4203-ea1258c18631")
public static String es_PE_COLUMN_C_Charge_ID_Name="Cargo";

@XendraColumn(AD_Element_ID="d7e2fc48-a26e-4ded-ea44-fe15849a7883",ColumnName="C_Charge_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4e705f25-8c90-7d6c-4203-ea1258c18631",
Synchronized="2019-08-30 22:23:30.0")
/** Column name C_Charge_ID */
public static final String COLUMNNAME_C_Charge_ID = "C_Charge_ID";
/** Set Sales Order Line.
@param C_OrderLine_ID Sales Order Line */
public void setC_OrderLine_ID (int C_OrderLine_ID)
{
if (C_OrderLine_ID <= 0) set_Value (COLUMNNAME_C_OrderLine_ID, null);
 else 
set_Value (COLUMNNAME_C_OrderLine_ID, Integer.valueOf(C_OrderLine_ID));
}
/** Get Sales Order Line.
@return Sales Order Line */
public int getC_OrderLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_OrderLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="b8bf705b-0f6d-2376-c5cf-f1afdb385df8")
public static String es_PE_FIELD_RequisitionLine_PurchaseOrderLine_Name="Item";

@XendraTrl(Identifier="b8bf705b-0f6d-2376-c5cf-f1afdb385df8")
public static String es_PE_FIELD_RequisitionLine_PurchaseOrderLine_Description="Item de orden de compra";

@XendraTrl(Identifier="b8bf705b-0f6d-2376-c5cf-f1afdb385df8")
public static String es_PE_FIELD_RequisitionLine_PurchaseOrderLine_Help="Identificador único para un Item en una orden.";

@XendraField(AD_Column_ID="C_OrderLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="637258c0-1d0c-fdfe-a45b-13c4c73654e3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b8bf705b-0f6d-2376-c5cf-f1afdb385df8")
public static final String FIELDNAME_RequisitionLine_PurchaseOrderLine="b8bf705b-0f6d-2376-c5cf-f1afdb385df8";

@XendraTrl(Identifier="fb2f5848-0d4d-3866-2257-a78a8ea5bcb5")
public static String es_PE_FIELD_RequisitionLines_PurchaseOrderLine_Name="Item";

@XendraTrl(Identifier="fb2f5848-0d4d-3866-2257-a78a8ea5bcb5")
public static String es_PE_FIELD_RequisitionLines_PurchaseOrderLine_Description="Item de orden de compra";

@XendraTrl(Identifier="fb2f5848-0d4d-3866-2257-a78a8ea5bcb5")
public static String es_PE_FIELD_RequisitionLines_PurchaseOrderLine_Help="Identificador único para un Item en una orden.";

@XendraField(AD_Column_ID="C_OrderLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="1e69586d-ee0a-c9dd-9622-3afd230a5e12",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fb2f5848-0d4d-3866-2257-a78a8ea5bcb5")
public static final String FIELDNAME_RequisitionLines_PurchaseOrderLine="fb2f5848-0d4d-3866-2257-a78a8ea5bcb5";

@XendraTrl(Identifier="86d28c7b-faf8-40a6-10a0-baf10e36c98b")
public static String es_PE_COLUMN_C_OrderLine_ID_Name="Línea";

@XendraColumn(AD_Element_ID="a94fbec0-0ef5-0f6c-033d-8286782321b0",ColumnName="C_OrderLine_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="86d28c7b-faf8-40a6-10a0-baf10e36c98b",
Synchronized="2019-08-30 22:23:30.0")
/** Column name C_OrderLine_ID */
public static final String COLUMNNAME_C_OrderLine_ID = "C_OrderLine_ID";
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

@XendraTrl(Identifier="d8444905-dbd6-8786-f796-b7720359146f")
public static String es_PE_FIELD_RequisitionLine_Description_Name="Observación";

@XendraTrl(Identifier="d8444905-dbd6-8786-f796-b7720359146f")
public static String es_PE_FIELD_RequisitionLine_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="d8444905-dbd6-8786-f796-b7720359146f")
public static String es_PE_FIELD_RequisitionLine_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="637258c0-1d0c-fdfe-a45b-13c4c73654e3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d8444905-dbd6-8786-f796-b7720359146f")
public static final String FIELDNAME_RequisitionLine_Description="d8444905-dbd6-8786-f796-b7720359146f";

@XendraTrl(Identifier="d3b63aef-0752-2549-3a17-1dc8682aa967")
public static String es_PE_FIELD_RequisitionLines_Description_Name="Observación";

@XendraTrl(Identifier="d3b63aef-0752-2549-3a17-1dc8682aa967")
public static String es_PE_FIELD_RequisitionLines_Description_Description="Observación";

@XendraTrl(Identifier="d3b63aef-0752-2549-3a17-1dc8682aa967")
public static String es_PE_FIELD_RequisitionLines_Description_Help="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="1e69586d-ee0a-c9dd-9622-3afd230a5e12",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=255,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d3b63aef-0752-2549-3a17-1dc8682aa967")
public static final String FIELDNAME_RequisitionLines_Description="d3b63aef-0752-2549-3a17-1dc8682aa967";

@XendraTrl(Identifier="64fc85a2-aee1-a37d-b9e6-10d3d7261da6")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="64fc85a2-aee1-a37d-b9e6-10d3d7261da6",
Synchronized="2019-08-30 22:23:30.0")
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
@XendraTrl(Identifier="cc419192-37e2-4c5f-918b-34b61cc65eec")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cc419192-37e2-4c5f-918b-34b61cc65eec",
Synchronized="2019-08-30 22:23:30.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
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

@XendraTrl(Identifier="de983e83-e894-75cc-9d8d-b3ac0bfc619a")
public static String es_PE_FIELD_RequisitionLine_LineNo_Name="No. Línea";

@XendraTrl(Identifier="de983e83-e894-75cc-9d8d-b3ac0bfc619a")
public static String es_PE_FIELD_RequisitionLine_LineNo_Description="No. Línea único para este documento";

@XendraTrl(Identifier="de983e83-e894-75cc-9d8d-b3ac0bfc619a")
public static String es_PE_FIELD_RequisitionLine_LineNo_Help="Indica el No. Línea para un documento. También controlará el orden de despliegue de las líneas dentro de un documento";

@XendraField(AD_Column_ID="Line",IsCentrallyMaintained=true,
AD_Tab_ID="637258c0-1d0c-fdfe-a45b-13c4c73654e3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="de983e83-e894-75cc-9d8d-b3ac0bfc619a")
public static final String FIELDNAME_RequisitionLine_LineNo="de983e83-e894-75cc-9d8d-b3ac0bfc619a";

@XendraTrl(Identifier="f1c2439c-b346-8111-404b-94d48b5e11b6")
public static String es_PE_FIELD_RequisitionLines_LineNo_Name="No. Línea";

@XendraTrl(Identifier="f1c2439c-b346-8111-404b-94d48b5e11b6")
public static String es_PE_FIELD_RequisitionLines_LineNo_Description="No. Línea único para este documento";

@XendraTrl(Identifier="f1c2439c-b346-8111-404b-94d48b5e11b6")
public static String es_PE_FIELD_RequisitionLines_LineNo_Help="Indica el No. Línea para un documento. También controlará el orden de despliegue de las líneas dentro de un documento";

@XendraField(AD_Column_ID="Line",IsCentrallyMaintained=true,
AD_Tab_ID="1e69586d-ee0a-c9dd-9622-3afd230a5e12",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f1c2439c-b346-8111-404b-94d48b5e11b6")
public static final String FIELDNAME_RequisitionLines_LineNo="f1c2439c-b346-8111-404b-94d48b5e11b6";

@XendraTrl(Identifier="4aee0fd5-6b98-9d08-9923-7bbf588dc5b8")
public static String es_PE_COLUMN_Line_Name="No. Línea";

@XendraColumn(AD_Element_ID="986ef077-61da-f9cf-1c6d-aefe3a35113b",ColumnName="Line",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="@SQL=SELECT COALESCE(MAX(Line),0)+10 AS DefaultValue FROM M_RequisitionLine WHERE M_Requisition_ID=@M_Requisition_ID@",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4aee0fd5-6b98-9d08-9923-7bbf588dc5b8",
Synchronized="2019-08-30 22:23:30.0")
/** Column name Line */
public static final String COLUMNNAME_Line = "Line";
/** Set Line Amount.
@param LineNetAmt Line Extended Amount (Quantity * Actual Price) without Freight and Charges */
public void setLineNetAmt (BigDecimal LineNetAmt)
{
if (LineNetAmt == null) throw new IllegalArgumentException ("LineNetAmt is mandatory.");
set_Value (COLUMNNAME_LineNetAmt, LineNetAmt);
}
/** Get Line Amount.
@return Line Extended Amount (Quantity * Actual Price) without Freight and Charges */
public BigDecimal getLineNetAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_LineNetAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="95d6f418-fa6a-c699-9ef1-7899af72ab45")
public static String es_PE_FIELD_RequisitionLine_LineAmount_Name="Neto de Línea";

@XendraTrl(Identifier="95d6f418-fa6a-c699-9ef1-7899af72ab45")
public static String es_PE_FIELD_RequisitionLine_LineAmount_Description="Total neto de la línea (Cantidad * Precio Actual) sin fletes ni cargos";

@XendraTrl(Identifier="95d6f418-fa6a-c699-9ef1-7899af72ab45")
public static String es_PE_FIELD_RequisitionLine_LineAmount_Help="Indica el total neto de la línea basado en la cantidad y el precio actual. Cualquier cargo adicional ó flete no es incluido.";

@XendraField(AD_Column_ID="LineNetAmt",IsCentrallyMaintained=true,
AD_Tab_ID="637258c0-1d0c-fdfe-a45b-13c4c73654e3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="95d6f418-fa6a-c699-9ef1-7899af72ab45")
public static final String FIELDNAME_RequisitionLine_LineAmount="95d6f418-fa6a-c699-9ef1-7899af72ab45";

@XendraTrl(Identifier="4ecde109-5cd0-f304-7573-253184e5faf4")
public static String es_PE_FIELD_RequisitionLines_LineAmount_Name="Neto de Línea";

@XendraTrl(Identifier="4ecde109-5cd0-f304-7573-253184e5faf4")
public static String es_PE_FIELD_RequisitionLines_LineAmount_Description="Total neto de la línea (Cantidad * Precio Actual) sin fletes ni cargos";

@XendraTrl(Identifier="4ecde109-5cd0-f304-7573-253184e5faf4")
public static String es_PE_FIELD_RequisitionLines_LineAmount_Help="Indica el total neto de la línea basado en la cantidad y el precio actual. Cualquier cargo adicional ó flete no es incluido.";

@XendraField(AD_Column_ID="LineNetAmt",IsCentrallyMaintained=true,
AD_Tab_ID="1e69586d-ee0a-c9dd-9622-3afd230a5e12",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=true,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4ecde109-5cd0-f304-7573-253184e5faf4")
public static final String FIELDNAME_RequisitionLines_LineAmount="4ecde109-5cd0-f304-7573-253184e5faf4";

@XendraTrl(Identifier="7a5d3954-b781-6323-9ba9-8341833eef9e")
public static String es_PE_COLUMN_LineNetAmt_Name="Neto de Línea";

@XendraColumn(AD_Element_ID="ba57a535-4ae3-c6eb-74ec-3dcb0973d6f6",ColumnName="LineNetAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7a5d3954-b781-6323-9ba9-8341833eef9e",
Synchronized="2019-08-30 22:23:30.0")
/** Column name LineNetAmt */
public static final String COLUMNNAME_LineNetAmt = "LineNetAmt";
/** Set Attribute Set Instance.
@param M_AttributeSetInstance_ID Product Attribute Set Instance */
public void setM_AttributeSetInstance_ID (int M_AttributeSetInstance_ID)
{
if (M_AttributeSetInstance_ID <= 0) set_Value (COLUMNNAME_M_AttributeSetInstance_ID, null);
 else 
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

@XendraTrl(Identifier="dfae4907-1706-8d50-06d4-3dd27c54f481")
public static String es_PE_FIELD_RequisitionLine_AttributeSetInstance_Name="Instancia del Conjunto de Atributos";

@XendraTrl(Identifier="dfae4907-1706-8d50-06d4-3dd27c54f481")
public static String es_PE_FIELD_RequisitionLine_AttributeSetInstance_Description="Instancia del conjunto de atributos del producto";

@XendraTrl(Identifier="dfae4907-1706-8d50-06d4-3dd27c54f481")
public static String es_PE_FIELD_RequisitionLine_AttributeSetInstance_Help="Valor actual de Instancia del conjunto de atributos del producto";

@XendraField(AD_Column_ID="M_AttributeSetInstance_ID",IsCentrallyMaintained=true,
AD_Tab_ID="637258c0-1d0c-fdfe-a45b-13c4c73654e3",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="dfae4907-1706-8d50-06d4-3dd27c54f481")
public static final String FIELDNAME_RequisitionLine_AttributeSetInstance="dfae4907-1706-8d50-06d4-3dd27c54f481";

@XendraTrl(Identifier="3fb95c11-6a3c-ee2d-2d53-ab8fcb83d23a")
public static String es_PE_COLUMN_M_AttributeSetInstance_ID_Name="Instancia del Conjunto de Atributos";

@XendraColumn(AD_Element_ID="137807f2-3c52-e193-3ceb-f10b819cf955",
ColumnName="M_AttributeSetInstance_ID",AD_Reference_ID=35,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="3fb95c11-6a3c-ee2d-2d53-ab8fcb83d23a",Synchronized="2019-08-30 22:23:30.0")
/** Column name M_AttributeSetInstance_ID */
public static final String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";
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

@XendraTrl(Identifier="1f6a9dbb-371b-c5e3-781b-1b32b2a8119a")
public static String es_PE_FIELD_RequisitionLine_Product_Name="Producto";

@XendraTrl(Identifier="1f6a9dbb-371b-c5e3-781b-1b32b2a8119a")
public static String es_PE_FIELD_RequisitionLine_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="1f6a9dbb-371b-c5e3-781b-1b32b2a8119a")
public static String es_PE_FIELD_RequisitionLine_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="637258c0-1d0c-fdfe-a45b-13c4c73654e3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1f6a9dbb-371b-c5e3-781b-1b32b2a8119a")
public static final String FIELDNAME_RequisitionLine_Product="1f6a9dbb-371b-c5e3-781b-1b32b2a8119a";

@XendraTrl(Identifier="6cad8e2c-ad67-1a34-04fc-ece04772ce87")
public static String es_PE_FIELD_RequisitionLines_Product_Name="Producto";

@XendraTrl(Identifier="6cad8e2c-ad67-1a34-04fc-ece04772ce87")
public static String es_PE_FIELD_RequisitionLines_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="6cad8e2c-ad67-1a34-04fc-ece04772ce87")
public static String es_PE_FIELD_RequisitionLines_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="1e69586d-ee0a-c9dd-9622-3afd230a5e12",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=true,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6cad8e2c-ad67-1a34-04fc-ece04772ce87")
public static final String FIELDNAME_RequisitionLines_Product="6cad8e2c-ad67-1a34-04fc-ece04772ce87";

@XendraTrl(Identifier="7643a112-d938-be7a-c7b2-c68b57264b16")
public static String es_PE_COLUMN_M_Product_ID_Name="Producto";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="4281f8eb-238e-6b28-eb66-8cc866e6312c",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="org.compiere.model.CalloutRequisition.product",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7643a112-d938-be7a-c7b2-c68b57264b16",
Synchronized="2019-08-30 22:23:30.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
/** Set Requisition.
@param M_Requisition_ID Material Requisition */
public void setM_Requisition_ID (int M_Requisition_ID)
{
if (M_Requisition_ID < 1) throw new IllegalArgumentException ("M_Requisition_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_Requisition_ID, Integer.valueOf(M_Requisition_ID));
}
/** Get Requisition.
@return Material Requisition */
public int getM_Requisition_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Requisition_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="832fa81c-907e-7f50-00a9-324556f32125")
public static String es_PE_FIELD_RequisitionLine_Requisition_Name="Requisición de Material";

@XendraTrl(Identifier="832fa81c-907e-7f50-00a9-324556f32125")
public static String es_PE_FIELD_RequisitionLine_Requisition_Description="Requisición de Material";

@XendraField(AD_Column_ID="M_Requisition_ID",IsCentrallyMaintained=true,
AD_Tab_ID="637258c0-1d0c-fdfe-a45b-13c4c73654e3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="832fa81c-907e-7f50-00a9-324556f32125")
public static final String FIELDNAME_RequisitionLine_Requisition="832fa81c-907e-7f50-00a9-324556f32125";

@XendraTrl(Identifier="b7721acc-f463-2d29-a947-0312a1c25f46")
public static String es_PE_FIELD_RequisitionLines_Requisition_Name="Requisición de Material";

@XendraTrl(Identifier="b7721acc-f463-2d29-a947-0312a1c25f46")
public static String es_PE_FIELD_RequisitionLines_Requisition_Description="Requisición de Material";

@XendraField(AD_Column_ID="M_Requisition_ID",IsCentrallyMaintained=true,
AD_Tab_ID="1e69586d-ee0a-c9dd-9622-3afd230a5e12",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b7721acc-f463-2d29-a947-0312a1c25f46")
public static final String FIELDNAME_RequisitionLines_Requisition="b7721acc-f463-2d29-a947-0312a1c25f46";

@XendraTrl(Identifier="139df7c5-94f6-6c8e-f270-f6e833ad213e")
public static String es_PE_COLUMN_M_Requisition_ID_Name="Requisición de Material";

@XendraColumn(AD_Element_ID="d6a9b9c0-6fa1-c8a2-a1cf-6b20e2587ebe",ColumnName="M_Requisition_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="139df7c5-94f6-6c8e-f270-f6e833ad213e",
Synchronized="2019-08-30 22:23:30.0")
/** Column name M_Requisition_ID */
public static final String COLUMNNAME_M_Requisition_ID = "M_Requisition_ID";
/** Set Requisition Line.
@param M_RequisitionLine_ID Material Requisition Line */
public void setM_RequisitionLine_ID (int M_RequisitionLine_ID)
{
if (M_RequisitionLine_ID < 1) throw new IllegalArgumentException ("M_RequisitionLine_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_RequisitionLine_ID, Integer.valueOf(M_RequisitionLine_ID));
}
/** Get Requisition Line.
@return Material Requisition Line */
public int getM_RequisitionLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_RequisitionLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="fb75c93e-b861-f03a-acd6-d9510d8c8bff")
public static String es_PE_FIELD_RequisitionLine_RequisitionLine_Name="Item de Requisición Material";

@XendraTrl(Identifier="fb75c93e-b861-f03a-acd6-d9510d8c8bff")
public static String es_PE_FIELD_RequisitionLine_RequisitionLine_Description="Item de Requisición de material";

@XendraField(AD_Column_ID="M_RequisitionLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="637258c0-1d0c-fdfe-a45b-13c4c73654e3",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fb75c93e-b861-f03a-acd6-d9510d8c8bff")
public static final String FIELDNAME_RequisitionLine_RequisitionLine="fb75c93e-b861-f03a-acd6-d9510d8c8bff";

@XendraTrl(Identifier="fc5b1a24-3020-78da-159c-3f802f3ccbfc")
public static String es_PE_FIELD_RequisitionLines_RequisitionLine_Name="Item de Requisición Material";

@XendraTrl(Identifier="fc5b1a24-3020-78da-159c-3f802f3ccbfc")
public static String es_PE_FIELD_RequisitionLines_RequisitionLine_Description="Item de Requisición de material";

@XendraField(AD_Column_ID="M_RequisitionLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="1e69586d-ee0a-c9dd-9622-3afd230a5e12",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fc5b1a24-3020-78da-159c-3f802f3ccbfc")
public static final String FIELDNAME_RequisitionLines_RequisitionLine="fc5b1a24-3020-78da-159c-3f802f3ccbfc";
/** Column name M_RequisitionLine_ID */
public static final String COLUMNNAME_M_RequisitionLine_ID = "M_RequisitionLine_ID";
/** Set Unit Price.
@param PriceActual Actual Price  */
public void setPriceActual (BigDecimal PriceActual)
{
if (PriceActual == null) throw new IllegalArgumentException ("PriceActual is mandatory.");
set_Value (COLUMNNAME_PriceActual, PriceActual);
}
/** Get Unit Price.
@return Actual Price  */
public BigDecimal getPriceActual() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PriceActual);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="81285948-190d-19b1-c2dc-cdbf6fe4f7cc")
public static String es_PE_FIELD_RequisitionLine_UnitPrice_Name="Precio Actual";

@XendraTrl(Identifier="81285948-190d-19b1-c2dc-cdbf6fe4f7cc")
public static String es_PE_FIELD_RequisitionLine_UnitPrice_Description="Precio Actual";

@XendraTrl(Identifier="81285948-190d-19b1-c2dc-cdbf6fe4f7cc")
public static String es_PE_FIELD_RequisitionLine_UnitPrice_Help="El precio Actual ó Unitario indica el precio para un producto en la moneda fuente.";

@XendraField(AD_Column_ID="PriceActual",IsCentrallyMaintained=true,
AD_Tab_ID="637258c0-1d0c-fdfe-a45b-13c4c73654e3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="81285948-190d-19b1-c2dc-cdbf6fe4f7cc")
public static final String FIELDNAME_RequisitionLine_UnitPrice="81285948-190d-19b1-c2dc-cdbf6fe4f7cc";

@XendraTrl(Identifier="1fd353ea-ac6a-5ea9-7a2d-1c58f99f10f8")
public static String es_PE_FIELD_RequisitionLines_UnitPrice_Name="Precio Actual";

@XendraTrl(Identifier="1fd353ea-ac6a-5ea9-7a2d-1c58f99f10f8")
public static String es_PE_FIELD_RequisitionLines_UnitPrice_Description="Precio Actual";

@XendraTrl(Identifier="1fd353ea-ac6a-5ea9-7a2d-1c58f99f10f8")
public static String es_PE_FIELD_RequisitionLines_UnitPrice_Help="El precio Actual ó Unitario indica el precio para un producto en la moneda fuente.";

@XendraField(AD_Column_ID="PriceActual",IsCentrallyMaintained=true,
AD_Tab_ID="1e69586d-ee0a-c9dd-9622-3afd230a5e12",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=true,SeqNo=80,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1fd353ea-ac6a-5ea9-7a2d-1c58f99f10f8")
public static final String FIELDNAME_RequisitionLines_UnitPrice="1fd353ea-ac6a-5ea9-7a2d-1c58f99f10f8";

@XendraTrl(Identifier="aec7ff65-8395-dba5-1f94-68aa1465ca8f")
public static String es_PE_COLUMN_PriceActual_Name="Precio Actual";

@XendraColumn(AD_Element_ID="8ee15d33-8f4b-598f-dc4c-9d67f968a13c",ColumnName="PriceActual",
AD_Reference_ID=37,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="org.compiere.model.CalloutRequisition.amt",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="aec7ff65-8395-dba5-1f94-68aa1465ca8f",Synchronized="2019-08-30 22:23:30.0")
/** Column name PriceActual */
public static final String COLUMNNAME_PriceActual = "PriceActual";
/** Set Quantity.
@param Qty Quantity */
public void setQty (BigDecimal Qty)
{
if (Qty == null) throw new IllegalArgumentException ("Qty is mandatory.");
set_Value (COLUMNNAME_Qty, Qty);
}
/** Get Quantity.
@return Quantity */
public BigDecimal getQty() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Qty);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="93e9d144-e1d1-8009-e21a-325d4e439b95")
public static String es_PE_FIELD_RequisitionLine_Quantity_Name="Cantidad";

@XendraTrl(Identifier="93e9d144-e1d1-8009-e21a-325d4e439b95")
public static String es_PE_FIELD_RequisitionLine_Quantity_Description="Cantidad";

@XendraTrl(Identifier="93e9d144-e1d1-8009-e21a-325d4e439b95")
public static String es_PE_FIELD_RequisitionLine_Quantity_Help="La Cantidad indica el número de un producto específico o artículo para este documento";

@XendraField(AD_Column_ID="Qty",IsCentrallyMaintained=true,
AD_Tab_ID="637258c0-1d0c-fdfe-a45b-13c4c73654e3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="93e9d144-e1d1-8009-e21a-325d4e439b95")
public static final String FIELDNAME_RequisitionLine_Quantity="93e9d144-e1d1-8009-e21a-325d4e439b95";

@XendraTrl(Identifier="0b777838-3250-510b-bd8e-5a260da96a80")
public static String es_PE_FIELD_RequisitionLines_Quantity_Name="Cantidad";

@XendraTrl(Identifier="0b777838-3250-510b-bd8e-5a260da96a80")
public static String es_PE_FIELD_RequisitionLines_Quantity_Description="Cantidad";

@XendraTrl(Identifier="0b777838-3250-510b-bd8e-5a260da96a80")
public static String es_PE_FIELD_RequisitionLines_Quantity_Help="La Cantidad indica el número de un producto específico o artículo para este documento";

@XendraField(AD_Column_ID="Qty",IsCentrallyMaintained=true,
AD_Tab_ID="1e69586d-ee0a-c9dd-9622-3afd230a5e12",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=true,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0b777838-3250-510b-bd8e-5a260da96a80")
public static final String FIELDNAME_RequisitionLines_Quantity="0b777838-3250-510b-bd8e-5a260da96a80";

@XendraTrl(Identifier="63de69b6-ab09-54b7-5bfc-ce772bbe24e1")
public static String es_PE_COLUMN_Qty_Name="Cantidad";

@XendraColumn(AD_Element_ID="c9d74a25-87c5-9592-5660-4f397607dad3",ColumnName="Qty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="1",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="org.compiere.model.CalloutRequisition.amt",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="63de69b6-ab09-54b7-5bfc-ce772bbe24e1",Synchronized="2019-08-30 22:23:30.0")
/** Column name Qty */
public static final String COLUMNNAME_Qty = "Qty";
}
