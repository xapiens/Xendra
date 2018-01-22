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
/** Generated Model for M_EDI_Info
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_EDI_Info extends PO
{
/** Standard Constructor
@param ctx context
@param M_EDI_Info_ID id
@param trxName transaction
*/
public X_M_EDI_Info (Properties ctx, int M_EDI_Info_ID, String trxName)
{
super (ctx, M_EDI_Info_ID, trxName);
/** if (M_EDI_Info_ID == 0)
{
setInfo (null);
setM_EDI_ID (0);
setM_EDI_Info_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_M_EDI_Info (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=368 */
public static int Table_ID=MTable.getTable_ID("M_EDI_Info");

@XendraTrl(Identifier="d7c2d12f-7c20-a4f0-14dd-04e453ff1dde")
public static String es_PE_TAB_EDILog_Name="Bitácora de EDI";
@XendraTab(Name="EDI Log",
Description="",Help="",AD_Window_ID="acfebec3-98c6-9441-ca9a-73cb2afaf512",SeqNo=20,TabLevel=1,
IsSingleRow=true,IsInfoTab=false,IsTranslationTab=false,IsReadOnly=true,AD_Column_ID="",
HasTree=false,WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",
AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",
ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=false,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="d7c2d12f-7c20-a4f0-14dd-04e453ff1dde",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_EDILog="d7c2d12f-7c20-a4f0-14dd-04e453ff1dde";

@XendraTrl(Identifier="f7474e27-2025-aaa1-e6c8-9a4b1607eaa4")
public static String es_PE_TABLE_M_EDI_Info_Name="Histórico EDI";

@XendraTable(Name="EDI Log",Description="",Help="",TableName="M_EDI_Info",AccessLevel="3",
AD_Window_ID="acfebec3-98c6-9441-ca9a-73cb2afaf512",AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=false,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.material",Identifier="f7474e27-2025-aaa1-e6c8-9a4b1607eaa4",
Synchronized="2017-08-16 11:43:11.0")
/** TableName=M_EDI_Info */
public static final String Table_Name="M_EDI_Info";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_EDI_Info");

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
    Table_ID = MTable.getTable_ID("M_EDI_Info");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_EDI_Info[").append(get_ID()).append("]");
return sb.toString();
}
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
@XendraTrl(Identifier="088caf1a-5cd2-4acc-a584-01b34ed35262")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="088caf1a-5cd2-4acc-a584-01b34ed35262",
Synchronized="2015-08-11 20:39:28.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Info.
@param Info Information */
public void setInfo (String Info)
{
if (Info == null) throw new IllegalArgumentException ("Info is mandatory.");
set_Value (COLUMNNAME_Info, Info);
}
/** Get Info.
@return Information */
public String getInfo() 
{
String value = (String)get_Value(COLUMNNAME_Info);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="65a3da49-48bb-d3ff-cde2-5eb25d6a11e8")
public static String es_PE_FIELD_EDILog_Info_Description="Información";

@XendraTrl(Identifier="65a3da49-48bb-d3ff-cde2-5eb25d6a11e8")
public static String es_PE_FIELD_EDILog_Info_Help="La Información despliega datos desde la línea del documento fuente";

@XendraTrl(Identifier="65a3da49-48bb-d3ff-cde2-5eb25d6a11e8")
public static String es_PE_FIELD_EDILog_Info_Name="Información";
@XendraField(AD_Column_ID="Info",
IsCentrallyMaintained=true,AD_Tab_ID="d7c2d12f-7c20-a4f0-14dd-04e453ff1dde",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=1,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="65a3da49-48bb-d3ff-cde2-5eb25d6a11e8")
public static final String FIELDNAME_EDILog_Info="65a3da49-48bb-d3ff-cde2-5eb25d6a11e8";

@XendraTrl(Identifier="dffee33d-fa2e-141e-4faf-a27521321a4c")
public static String es_PE_COLUMN_Info_Name="Información";

@XendraColumn(AD_Element_ID="ab412fab-8336-50a9-21d9-30571bb98ce1",ColumnName="Info",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=4000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="dffee33d-fa2e-141e-4faf-a27521321a4c",
Synchronized="2017-08-05 16:55:06.0")
/** Column name Info */
public static final String COLUMNNAME_Info = "Info";
/** Set EDI Transaction.
@param M_EDI_ID EDI Transaction */
public void setM_EDI_ID (int M_EDI_ID)
{
if (M_EDI_ID < 1) throw new IllegalArgumentException ("M_EDI_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_EDI_ID, Integer.valueOf(M_EDI_ID));
}
/** Get EDI Transaction.
@return EDI Transaction */
public int getM_EDI_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_EDI_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getM_EDI_ID()));
}

@XendraTrl(Identifier="92d62fae-d6fe-924c-0ed4-a3eaf268d6d6")
public static String es_PE_FIELD_EDILog_EDITransaction_Name="Transacción EDI";

@XendraField(AD_Column_ID="M_EDI_ID",IsCentrallyMaintained=true,
AD_Tab_ID="d7c2d12f-7c20-a4f0-14dd-04e453ff1dde",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="92d62fae-d6fe-924c-0ed4-a3eaf268d6d6")
public static final String FIELDNAME_EDILog_EDITransaction="92d62fae-d6fe-924c-0ed4-a3eaf268d6d6";

@XendraTrl(Identifier="a6dc82b6-d3b7-7829-d057-44b6edf04a96")
public static String es_PE_COLUMN_M_EDI_ID_Name="Transacción EDI";

@XendraColumn(AD_Element_ID="81671c46-4b11-0617-4de7-f1acb1c75106",ColumnName="M_EDI_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a6dc82b6-d3b7-7829-d057-44b6edf04a96",
Synchronized="2017-08-05 16:55:06.0")
/** Column name M_EDI_ID */
public static final String COLUMNNAME_M_EDI_ID = "M_EDI_ID";
/** Set EDI Log.
@param M_EDI_Info_ID EDI Log */
public void setM_EDI_Info_ID (int M_EDI_Info_ID)
{
if (M_EDI_Info_ID < 1) throw new IllegalArgumentException ("M_EDI_Info_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_EDI_Info_ID, Integer.valueOf(M_EDI_Info_ID));
}
/** Get EDI Log.
@return EDI Log */
public int getM_EDI_Info_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_EDI_Info_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="e7a8f171-a7e9-e950-036d-6120e4db63ec")
public static String es_PE_FIELD_EDILog_EDILog_Name="Histórico EDI";

@XendraField(AD_Column_ID="M_EDI_Info_ID",IsCentrallyMaintained=true,
AD_Tab_ID="d7c2d12f-7c20-a4f0-14dd-04e453ff1dde",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e7a8f171-a7e9-e950-036d-6120e4db63ec")
public static final String FIELDNAME_EDILog_EDILog="e7a8f171-a7e9-e950-036d-6120e4db63ec";
/** Column name M_EDI_Info_ID */
public static final String COLUMNNAME_M_EDI_Info_ID = "M_EDI_Info_ID";
}
