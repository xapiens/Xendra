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
/** Generated Model for R_RequestUpdate
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_R_RequestUpdate extends PO
{
/** Standard Constructor
@param ctx context
@param R_RequestUpdate_ID id
@param trxName transaction
*/
public X_R_RequestUpdate (Properties ctx, int R_RequestUpdate_ID, String trxName)
{
super (ctx, R_RequestUpdate_ID, trxName);
/** if (R_RequestUpdate_ID == 0)
{
setConfidentialTypeEntry (null);
setR_Request_ID (0);
setR_RequestUpdate_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_R_RequestUpdate (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=802 */
public static int Table_ID=MTable.getTable_ID("R_RequestUpdate");

@XendraTrl(Identifier="417895bf-7702-6728-05db-c0db4124bfbf")
public static String es_PE_TAB_Updates_Description="Solicitud de Peticiones";

@XendraTrl(Identifier="417895bf-7702-6728-05db-c0db4124bfbf")
public static String es_PE_TAB_Updates_Help="Solicitud de las peticiones";

@XendraTrl(Identifier="417895bf-7702-6728-05db-c0db4124bfbf")
public static String es_PE_TAB_Updates_Name="Actualizaciones";
@XendraTab(Name="Updates",
Description="Request Updates",Help="Updates of the Request",
AD_Window_ID="0d176ab5-fb88-6941-47f1-b5effb1207a9",SeqNo=20,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=false,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="417895bf-7702-6728-05db-c0db4124bfbf",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Updates="417895bf-7702-6728-05db-c0db4124bfbf";

@XendraTrl(Identifier="53b20ce6-6ba4-22d1-95a2-676d618b0a2e")
public static String es_PE_TAB_Updates2_Description="Petición de las actualizaciones";

@XendraTrl(Identifier="53b20ce6-6ba4-22d1-95a2-676d618b0a2e")
public static String es_PE_TAB_Updates2_Help="Petición de las actualizaciones";

@XendraTrl(Identifier="53b20ce6-6ba4-22d1-95a2-676d618b0a2e")
public static String es_PE_TAB_Updates2_Name="Actualizaciones";
@XendraTab(Name="Updates",
Description="Request Updates",Help="Updated of the Request",
AD_Window_ID="0090e49f-fcb0-617d-03f1-c1d90ff77da9",SeqNo=20,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=false,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="53b20ce6-6ba4-22d1-95a2-676d618b0a2e",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Updates2="53b20ce6-6ba4-22d1-95a2-676d618b0a2e";

@XendraTrl(Identifier="86d411c6-29e2-7804-a343-b8a8ef930561")
public static String es_PE_TABLE_R_RequestUpdate_Name="Actualización de Solicitud";

@XendraTable(Name="Request Update",AD_Package_ID="1b3656e5-71c7-1296-994e-9b2c4549c7fd",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="R_RequestUpdate",AccessLevel="7",AD_Window_ID="0d176ab5-fb88-6941-47f1-b5effb1207a9",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.standard",
Identifier="86d411c6-29e2-7804-a343-b8a8ef930561",Synchronized="2020-03-03 21:39:41.0")
/** TableName=R_RequestUpdate */
public static final String Table_Name="R_RequestUpdate";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"R_RequestUpdate");

protected BigDecimal accessLevel = BigDecimal.valueOf(7);
/** AccessLevel
@return 7 - System - Client - Org 
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
    Table_ID = MTable.getTable_ID("R_RequestUpdate");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_R_RequestUpdate[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Entry Confidentiality.
@param ConfidentialTypeEntry Confidentiality of the individual entry */
public void setConfidentialTypeEntry (String ConfidentialTypeEntry)
{
if (ConfidentialTypeEntry.length() > 1)
{
log.warning("Length > 1 - truncated");
ConfidentialTypeEntry = ConfidentialTypeEntry.substring(0,0);
}
set_Value (COLUMNNAME_ConfidentialTypeEntry, ConfidentialTypeEntry);
}
/** Get Entry Confidentiality.
@return Confidentiality of the individual entry */
public String getConfidentialTypeEntry() 
{
return (String)get_Value(COLUMNNAME_ConfidentialTypeEntry);
}

@XendraTrl(Identifier="9e746a99-38bd-4bce-1b72-99d66041233a")
public static String es_PE_FIELD_Updates_EntryConfidentiality_Name="Entrada Confidencial";

@XendraTrl(Identifier="9e746a99-38bd-4bce-1b72-99d66041233a")
public static String es_PE_FIELD_Updates_EntryConfidentiality_Description="Secreto de la entrada individual.";

@XendraField(AD_Column_ID="ConfidentialTypeEntry",IsCentrallyMaintained=true,
AD_Tab_ID="53b20ce6-6ba4-22d1-95a2-676d618b0a2e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9e746a99-38bd-4bce-1b72-99d66041233a")
public static final String FIELDNAME_Updates_EntryConfidentiality="9e746a99-38bd-4bce-1b72-99d66041233a";

@XendraTrl(Identifier="2d4269a3-36bc-2e64-624d-676978ad48be")
public static String es_PE_FIELD_Updates_EntryConfidentiality2_Name="Entrada Confidencial";

@XendraTrl(Identifier="2d4269a3-36bc-2e64-624d-676978ad48be")
public static String es_PE_FIELD_Updates_EntryConfidentiality2_Description="Secreto de la entrada individual.";

@XendraField(AD_Column_ID="ConfidentialTypeEntry",IsCentrallyMaintained=true,
AD_Tab_ID="417895bf-7702-6728-05db-c0db4124bfbf",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2d4269a3-36bc-2e64-624d-676978ad48be")
public static final String FIELDNAME_Updates_EntryConfidentiality2="2d4269a3-36bc-2e64-624d-676978ad48be";

@XendraTrl(Identifier="fd228f99-2dd8-cf71-80bf-c112cae9b7d9")
public static String es_PE_COLUMN_ConfidentialTypeEntry_Name="Entrada Confidencial";

@XendraColumn(AD_Element_ID="0d53f707-2248-2b4a-3bb1-4131a1238dfd",
ColumnName="ConfidentialTypeEntry",AD_Reference_ID=17,
AD_Reference_Value_ID="af038e49-9eea-4e1c-da39-e6d987a12111",AD_Val_Rule_ID="",FieldLength=1,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="fd228f99-2dd8-cf71-80bf-c112cae9b7d9",
Synchronized="2019-08-30 22:23:51.0")
/** Column name ConfidentialTypeEntry */
public static final String COLUMNNAME_ConfidentialTypeEntry = "ConfidentialTypeEntry";
/** Set End Time.
@param EndTime End of the time span */
public void setEndTime (Timestamp EndTime)
{
set_Value (COLUMNNAME_EndTime, EndTime);
}
/** Get End Time.
@return End of the time span */
public Timestamp getEndTime() 
{
return (Timestamp)get_Value(COLUMNNAME_EndTime);
}

@XendraTrl(Identifier="3337e397-ff93-2192-b54f-cb862a2c53b4")
public static String es_PE_FIELD_Updates_EndTime_Name="Final de Tiempo";

@XendraTrl(Identifier="3337e397-ff93-2192-b54f-cb862a2c53b4")
public static String es_PE_FIELD_Updates_EndTime_Description="Final de tiempo";

@XendraField(AD_Column_ID="EndTime",IsCentrallyMaintained=true,
AD_Tab_ID="53b20ce6-6ba4-22d1-95a2-676d618b0a2e",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=7,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3337e397-ff93-2192-b54f-cb862a2c53b4")
public static final String FIELDNAME_Updates_EndTime="3337e397-ff93-2192-b54f-cb862a2c53b4";

@XendraTrl(Identifier="210605c0-b154-d2cc-99ba-71a6a2aed148")
public static String es_PE_FIELD_Updates_EndTime2_Name="Final de Tiempo";

@XendraTrl(Identifier="210605c0-b154-d2cc-99ba-71a6a2aed148")
public static String es_PE_FIELD_Updates_EndTime2_Description="Final de tiempo";

@XendraField(AD_Column_ID="EndTime",IsCentrallyMaintained=true,
AD_Tab_ID="417895bf-7702-6728-05db-c0db4124bfbf",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=7,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="210605c0-b154-d2cc-99ba-71a6a2aed148")
public static final String FIELDNAME_Updates_EndTime2="210605c0-b154-d2cc-99ba-71a6a2aed148";

@XendraTrl(Identifier="cf7a395b-256d-bf35-bed1-6e2a9145ec0d")
public static String es_PE_COLUMN_EndTime_Name="Final de Tiempo";

@XendraColumn(AD_Element_ID="6c802fea-18a8-875e-7b55-9ace2db37aac",ColumnName="EndTime",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cf7a395b-256d-bf35-bed1-6e2a9145ec0d",
Synchronized="2019-08-30 22:23:51.0")
/** Column name EndTime */
public static final String COLUMNNAME_EndTime = "EndTime";
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
@XendraTrl(Identifier="68b3cdbf-34d0-4b96-85d8-7e331fc3cdd3")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="68b3cdbf-34d0-4b96-85d8-7e331fc3cdd3",
Synchronized="2019-08-30 22:23:51.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Product Used.
@param M_ProductSpent_ID Product/Resource/Service used in Request */
public void setM_ProductSpent_ID (int M_ProductSpent_ID)
{
if (M_ProductSpent_ID <= 0) set_Value (COLUMNNAME_M_ProductSpent_ID, null);
 else 
set_Value (COLUMNNAME_M_ProductSpent_ID, Integer.valueOf(M_ProductSpent_ID));
}
/** Get Product Used.
@return Product/Resource/Service used in Request */
public int getM_ProductSpent_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_ProductSpent_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="5a70f172-ba73-d572-bbda-27ef96688683")
public static String es_PE_FIELD_Updates_ProductUsed_Name="Producto Usado";

@XendraTrl(Identifier="5a70f172-ba73-d572-bbda-27ef96688683")
public static String es_PE_FIELD_Updates_ProductUsed_Description="Producto/Solicitud/Servicio usado en una solicitud";

@XendraTrl(Identifier="5a70f172-ba73-d572-bbda-27ef96688683")
public static String es_PE_FIELD_Updates_ProductUsed_Help="La facturación utiliza el producto usado.";

@XendraField(AD_Column_ID="M_ProductSpent_ID",IsCentrallyMaintained=true,
AD_Tab_ID="53b20ce6-6ba4-22d1-95a2-676d618b0a2e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5a70f172-ba73-d572-bbda-27ef96688683")
public static final String FIELDNAME_Updates_ProductUsed="5a70f172-ba73-d572-bbda-27ef96688683";

@XendraTrl(Identifier="6163771b-b7fb-796d-eaa0-d69326860854")
public static String es_PE_FIELD_Updates_ProductUsed2_Name="Producto Usado";

@XendraTrl(Identifier="6163771b-b7fb-796d-eaa0-d69326860854")
public static String es_PE_FIELD_Updates_ProductUsed2_Description="Producto/Solicitud/Servicio usado en una solicitud";

@XendraTrl(Identifier="6163771b-b7fb-796d-eaa0-d69326860854")
public static String es_PE_FIELD_Updates_ProductUsed2_Help="La facturación utiliza el producto usado.";

@XendraField(AD_Column_ID="M_ProductSpent_ID",IsCentrallyMaintained=true,
AD_Tab_ID="417895bf-7702-6728-05db-c0db4124bfbf",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6163771b-b7fb-796d-eaa0-d69326860854")
public static final String FIELDNAME_Updates_ProductUsed2="6163771b-b7fb-796d-eaa0-d69326860854";

@XendraTrl(Identifier="688f239d-8fab-fdd4-1707-8451888d5e33")
public static String es_PE_COLUMN_M_ProductSpent_ID_Name="Producto Usado";

@XendraColumn(AD_Element_ID="ed41cfa1-c930-9b0e-9136-75c88fa6f1f7",ColumnName="M_ProductSpent_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="28b49c4d-0409-b2e0-b70e-d686f8d6503f",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="688f239d-8fab-fdd4-1707-8451888d5e33",Synchronized="2019-08-30 22:23:51.0")
/** Column name M_ProductSpent_ID */
public static final String COLUMNNAME_M_ProductSpent_ID = "M_ProductSpent_ID";
/** Set Quantity Invoiced.
@param QtyInvoiced Invoiced Quantity */
public void setQtyInvoiced (BigDecimal QtyInvoiced)
{
set_Value (COLUMNNAME_QtyInvoiced, QtyInvoiced);
}
/** Get Quantity Invoiced.
@return Invoiced Quantity */
public BigDecimal getQtyInvoiced() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_QtyInvoiced);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="10385dee-724a-6ab0-b54e-62e941639334")
public static String es_PE_FIELD_Updates_QuantityInvoiced_Name="Cantidad Facturada";

@XendraTrl(Identifier="10385dee-724a-6ab0-b54e-62e941639334")
public static String es_PE_FIELD_Updates_QuantityInvoiced_Description="Cantidad facturada";

@XendraTrl(Identifier="10385dee-724a-6ab0-b54e-62e941639334")
public static String es_PE_FIELD_Updates_QuantityInvoiced_Help="La cantidad facturada indica la cantidad de un producto que ha sido facturado";

@XendraField(AD_Column_ID="QtyInvoiced",IsCentrallyMaintained=true,
AD_Tab_ID="53b20ce6-6ba4-22d1-95a2-676d618b0a2e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="10385dee-724a-6ab0-b54e-62e941639334")
public static final String FIELDNAME_Updates_QuantityInvoiced="10385dee-724a-6ab0-b54e-62e941639334";

@XendraTrl(Identifier="d4c6d549-b1cd-69c5-019a-a50bdd2c2605")
public static String es_PE_FIELD_Updates_QuantityInvoiced2_Name="Cantidad Facturada";

@XendraTrl(Identifier="d4c6d549-b1cd-69c5-019a-a50bdd2c2605")
public static String es_PE_FIELD_Updates_QuantityInvoiced2_Description="Cantidad facturada";

@XendraTrl(Identifier="d4c6d549-b1cd-69c5-019a-a50bdd2c2605")
public static String es_PE_FIELD_Updates_QuantityInvoiced2_Help="La cantidad facturada indica la cantidad de un producto que ha sido facturado";

@XendraField(AD_Column_ID="QtyInvoiced",IsCentrallyMaintained=true,
AD_Tab_ID="417895bf-7702-6728-05db-c0db4124bfbf",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d4c6d549-b1cd-69c5-019a-a50bdd2c2605")
public static final String FIELDNAME_Updates_QuantityInvoiced2="d4c6d549-b1cd-69c5-019a-a50bdd2c2605";

@XendraTrl(Identifier="466b9beb-9166-1d54-f033-4baddac2d24a")
public static String es_PE_COLUMN_QtyInvoiced_Name="Cantidad Facturada";

@XendraColumn(AD_Element_ID="406c1301-33f0-3d6a-3fbc-b0cf44ccc5b3",ColumnName="QtyInvoiced",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="466b9beb-9166-1d54-f033-4baddac2d24a",
Synchronized="2019-08-30 22:23:51.0")
/** Column name QtyInvoiced */
public static final String COLUMNNAME_QtyInvoiced = "QtyInvoiced";
/** Set Quantity Used.
@param QtySpent Quantity used for this event */
public void setQtySpent (BigDecimal QtySpent)
{
set_Value (COLUMNNAME_QtySpent, QtySpent);
}
/** Get Quantity Used.
@return Quantity used for this event */
public BigDecimal getQtySpent() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_QtySpent);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="7cb74668-7b21-6022-1aa3-1ecb0872bcb1")
public static String es_PE_FIELD_Updates_QuantityUsed_Name="Cantidad Usada";

@XendraTrl(Identifier="7cb74668-7b21-6022-1aa3-1ecb0872bcb1")
public static String es_PE_FIELD_Updates_QuantityUsed_Description="Cantidad usada para este evento";

@XendraField(AD_Column_ID="QtySpent",IsCentrallyMaintained=true,
AD_Tab_ID="53b20ce6-6ba4-22d1-95a2-676d618b0a2e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7cb74668-7b21-6022-1aa3-1ecb0872bcb1")
public static final String FIELDNAME_Updates_QuantityUsed="7cb74668-7b21-6022-1aa3-1ecb0872bcb1";

@XendraTrl(Identifier="39e0ef65-7465-b6d7-b26e-67134963822e")
public static String es_PE_FIELD_Updates_QuantityUsed2_Name="Cantidad Usada";

@XendraTrl(Identifier="39e0ef65-7465-b6d7-b26e-67134963822e")
public static String es_PE_FIELD_Updates_QuantityUsed2_Description="Cantidad usada para este evento";

@XendraField(AD_Column_ID="QtySpent",IsCentrallyMaintained=true,
AD_Tab_ID="417895bf-7702-6728-05db-c0db4124bfbf",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="39e0ef65-7465-b6d7-b26e-67134963822e")
public static final String FIELDNAME_Updates_QuantityUsed2="39e0ef65-7465-b6d7-b26e-67134963822e";

@XendraTrl(Identifier="2215b174-3be9-c3af-31c8-44d45eb02b07")
public static String es_PE_COLUMN_QtySpent_Name="Cantidad Usada";

@XendraColumn(AD_Element_ID="de5f8ee0-79e4-9ea4-93ab-7bc172fc9f0f",ColumnName="QtySpent",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2215b174-3be9-c3af-31c8-44d45eb02b07",
Synchronized="2019-08-30 22:23:51.0")
/** Column name QtySpent */
public static final String COLUMNNAME_QtySpent = "QtySpent";
/** Set Result.
@param Result Result of the action taken */
public void setResult (String Result)
{
if (Result != null && Result.length() > 2000)
{
log.warning("Length > 2000 - truncated");
Result = Result.substring(0,1999);
}
set_ValueNoCheck (COLUMNNAME_Result, Result);
}
/** Get Result.
@return Result of the action taken */
public String getResult() 
{
String value = (String)get_Value(COLUMNNAME_Result);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="eae0f4ae-12c1-0188-c5b3-b74d4d2a828a")
public static String es_PE_FIELD_Updates_Result_Name="Resultado";

@XendraTrl(Identifier="eae0f4ae-12c1-0188-c5b3-b74d4d2a828a")
public static String es_PE_FIELD_Updates_Result_Description="Resultado de la acción tomada";

@XendraTrl(Identifier="eae0f4ae-12c1-0188-c5b3-b74d4d2a828a")
public static String es_PE_FIELD_Updates_Result_Help="El resultado indica el resultado de cualquier acción tomada en esta solicitud.";

@XendraField(AD_Column_ID="Result",IsCentrallyMaintained=true,
AD_Tab_ID="53b20ce6-6ba4-22d1-95a2-676d618b0a2e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=2000,IsReadOnly=true,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="eae0f4ae-12c1-0188-c5b3-b74d4d2a828a")
public static final String FIELDNAME_Updates_Result="eae0f4ae-12c1-0188-c5b3-b74d4d2a828a";

@XendraTrl(Identifier="bbc45a9f-d924-8e49-3925-deaa68fc6c8f")
public static String es_PE_FIELD_Updates_Result2_Name="Resultado";

@XendraTrl(Identifier="bbc45a9f-d924-8e49-3925-deaa68fc6c8f")
public static String es_PE_FIELD_Updates_Result2_Description="Resultado de la acción tomada";

@XendraTrl(Identifier="bbc45a9f-d924-8e49-3925-deaa68fc6c8f")
public static String es_PE_FIELD_Updates_Result2_Help="El resultado indica el resultado de cualquier acción tomada en esta solicitud.";

@XendraField(AD_Column_ID="Result",IsCentrallyMaintained=true,
AD_Tab_ID="417895bf-7702-6728-05db-c0db4124bfbf",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=2000,IsReadOnly=true,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bbc45a9f-d924-8e49-3925-deaa68fc6c8f")
public static final String FIELDNAME_Updates_Result2="bbc45a9f-d924-8e49-3925-deaa68fc6c8f";

@XendraTrl(Identifier="2defe4f0-2fde-b021-7e84-c6a106614589")
public static String es_PE_COLUMN_Result_Name="Resultado";

@XendraColumn(AD_Element_ID="ba7b014d-4620-7c1c-4680-838ca2550502",ColumnName="Result",
AD_Reference_ID=34,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2defe4f0-2fde-b021-7e84-c6a106614589",
Synchronized="2019-08-30 22:23:51.0")
/** Column name Result */
public static final String COLUMNNAME_Result = "Result";
/** Set Request.
@param R_Request_ID Request from a Business Partner or Prospect */
public void setR_Request_ID (int R_Request_ID)
{
if (R_Request_ID < 1) throw new IllegalArgumentException ("R_Request_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_R_Request_ID, Integer.valueOf(R_Request_ID));
}
/** Get Request.
@return Request from a Business Partner or Prospect */
public int getR_Request_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_R_Request_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="8739ded3-f941-38cd-98d0-75a11a4bbd79")
public static String es_PE_FIELD_Updates_Request_Name="Solicitud";

@XendraTrl(Identifier="8739ded3-f941-38cd-98d0-75a11a4bbd79")
public static String es_PE_FIELD_Updates_Request_Description="Solicitud de un socio de negocio ó prospecto.";

@XendraTrl(Identifier="8739ded3-f941-38cd-98d0-75a11a4bbd79")
public static String es_PE_FIELD_Updates_Request_Help="La solicitud identifica un requerimiento único de un socio de negocio ó prospecto.";

@XendraField(AD_Column_ID="R_Request_ID",IsCentrallyMaintained=true,
AD_Tab_ID="53b20ce6-6ba4-22d1-95a2-676d618b0a2e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8739ded3-f941-38cd-98d0-75a11a4bbd79")
public static final String FIELDNAME_Updates_Request="8739ded3-f941-38cd-98d0-75a11a4bbd79";

@XendraTrl(Identifier="2d227599-38aa-c8ea-e023-b680ec2fed0f")
public static String es_PE_FIELD_Updates_Request2_Name="Solicitud";

@XendraTrl(Identifier="2d227599-38aa-c8ea-e023-b680ec2fed0f")
public static String es_PE_FIELD_Updates_Request2_Description="Solicitud de un socio de negocio ó prospecto.";

@XendraTrl(Identifier="2d227599-38aa-c8ea-e023-b680ec2fed0f")
public static String es_PE_FIELD_Updates_Request2_Help="La solicitud identifica un requerimiento único de un socio de negocio ó prospecto.";

@XendraField(AD_Column_ID="R_Request_ID",IsCentrallyMaintained=true,
AD_Tab_ID="417895bf-7702-6728-05db-c0db4124bfbf",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2d227599-38aa-c8ea-e023-b680ec2fed0f")
public static final String FIELDNAME_Updates_Request2="2d227599-38aa-c8ea-e023-b680ec2fed0f";

@XendraTrl(Identifier="e7f4cc76-3971-bd07-2db2-45c239d57428")
public static String es_PE_COLUMN_R_Request_ID_Name="Solicitud";

@XendraColumn(AD_Element_ID="8f83a61c-3c9c-841b-466b-9700dd35c0de",ColumnName="R_Request_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e7f4cc76-3971-bd07-2db2-45c239d57428",
Synchronized="2019-08-30 22:23:51.0")
/** Column name R_Request_ID */
public static final String COLUMNNAME_R_Request_ID = "R_Request_ID";
/** Set Request Update.
@param R_RequestUpdate_ID Request Updates */
public void setR_RequestUpdate_ID (int R_RequestUpdate_ID)
{
if (R_RequestUpdate_ID < 1) throw new IllegalArgumentException ("R_RequestUpdate_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_R_RequestUpdate_ID, Integer.valueOf(R_RequestUpdate_ID));
}
/** Get Request Update.
@return Request Updates */
public int getR_RequestUpdate_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_R_RequestUpdate_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getR_RequestUpdate_ID()));
}

@XendraTrl(Identifier="4aee4d21-d9c5-2b94-722a-2e4e7d919e0c")
public static String es_PE_FIELD_Updates_RequestUpdate_Name="Actualización de Solicitud";

@XendraTrl(Identifier="4aee4d21-d9c5-2b94-722a-2e4e7d919e0c")
public static String es_PE_FIELD_Updates_RequestUpdate_Description="Actualización de Solicitud";

@XendraTrl(Identifier="4aee4d21-d9c5-2b94-722a-2e4e7d919e0c")
public static String es_PE_FIELD_Updates_RequestUpdate_Help="Indica si se puede realizar una actualización de solicitud";

@XendraField(AD_Column_ID="R_RequestUpdate_ID",IsCentrallyMaintained=true,
AD_Tab_ID="53b20ce6-6ba4-22d1-95a2-676d618b0a2e",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4aee4d21-d9c5-2b94-722a-2e4e7d919e0c")
public static final String FIELDNAME_Updates_RequestUpdate="4aee4d21-d9c5-2b94-722a-2e4e7d919e0c";

@XendraTrl(Identifier="8500ae5b-d6d0-73a7-225f-982dca91e962")
public static String es_PE_FIELD_Updates_RequestUpdate2_Name="Actualización de Solicitud";

@XendraTrl(Identifier="8500ae5b-d6d0-73a7-225f-982dca91e962")
public static String es_PE_FIELD_Updates_RequestUpdate2_Description="Actualización de Solicitud";

@XendraTrl(Identifier="8500ae5b-d6d0-73a7-225f-982dca91e962")
public static String es_PE_FIELD_Updates_RequestUpdate2_Help="Indica si se puede realizar una actualización de solicitud";

@XendraField(AD_Column_ID="R_RequestUpdate_ID",IsCentrallyMaintained=true,
AD_Tab_ID="417895bf-7702-6728-05db-c0db4124bfbf",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8500ae5b-d6d0-73a7-225f-982dca91e962")
public static final String FIELDNAME_Updates_RequestUpdate2="8500ae5b-d6d0-73a7-225f-982dca91e962";
/** Column name R_RequestUpdate_ID */
public static final String COLUMNNAME_R_RequestUpdate_ID = "R_RequestUpdate_ID";
/** Set Start Time.
@param StartTime Time started */
public void setStartTime (Timestamp StartTime)
{
set_Value (COLUMNNAME_StartTime, StartTime);
}
/** Get Start Time.
@return Time started */
public Timestamp getStartTime() 
{
return (Timestamp)get_Value(COLUMNNAME_StartTime);
}

@XendraTrl(Identifier="733de1e4-68a2-2fd1-a542-706ab09a390a")
public static String es_PE_FIELD_Updates_StartTime_Name="Fecha de Inicio";

@XendraTrl(Identifier="733de1e4-68a2-2fd1-a542-706ab09a390a")
public static String es_PE_FIELD_Updates_StartTime_Description="Fecha de inicio";

@XendraField(AD_Column_ID="StartTime",IsCentrallyMaintained=true,
AD_Tab_ID="53b20ce6-6ba4-22d1-95a2-676d618b0a2e",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=7,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="733de1e4-68a2-2fd1-a542-706ab09a390a")
public static final String FIELDNAME_Updates_StartTime="733de1e4-68a2-2fd1-a542-706ab09a390a";

@XendraTrl(Identifier="41ca9cf1-95eb-bad1-bf9d-9985be70fef5")
public static String es_PE_FIELD_Updates_StartTime2_Name="Fecha de Inicio";

@XendraTrl(Identifier="41ca9cf1-95eb-bad1-bf9d-9985be70fef5")
public static String es_PE_FIELD_Updates_StartTime2_Description="Fecha de inicio";

@XendraField(AD_Column_ID="StartTime",IsCentrallyMaintained=true,
AD_Tab_ID="417895bf-7702-6728-05db-c0db4124bfbf",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=7,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="41ca9cf1-95eb-bad1-bf9d-9985be70fef5")
public static final String FIELDNAME_Updates_StartTime2="41ca9cf1-95eb-bad1-bf9d-9985be70fef5";

@XendraTrl(Identifier="dd062e95-9abf-75a4-115a-51d141d96df5")
public static String es_PE_COLUMN_StartTime_Name="Fecha de Inicio";

@XendraColumn(AD_Element_ID="f37ff718-a1d1-dbb8-f704-786bf1d21ddf",ColumnName="StartTime",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="dd062e95-9abf-75a4-115a-51d141d96df5",
Synchronized="2019-08-30 22:23:51.0")
/** Column name StartTime */
public static final String COLUMNNAME_StartTime = "StartTime";
}
