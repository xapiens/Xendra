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
/** Generated Model for AD_Plugin_Access
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_Plugin_Access extends PO
{
/** Standard Constructor
@param ctx context
@param AD_Plugin_Access_ID id
@param trxName transaction
*/
public X_AD_Plugin_Access (Properties ctx, int AD_Plugin_Access_ID, String trxName)
{
super (ctx, AD_Plugin_Access_ID, trxName);
/** if (AD_Plugin_Access_ID == 0)
{
setAD_Plugin_ID (0);
setAD_Role_ID (0);
setIsReadWrite (false);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_Plugin_Access (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000331 */
public static int Table_ID=MTable.getTable_ID("AD_Plugin_Access");

@XendraTrl(Identifier="edb241a2-77e9-45c6-b5a6-f7df3fabdf96")
public static String es_PE_TAB_PluginAccess_Description="Plugin Access";

@XendraTrl(Identifier="edb241a2-77e9-45c6-b5a6-f7df3fabdf96")
public static String es_PE_TAB_PluginAccess_Name="Plugin";

@XendraTrl(Identifier="edb241a2-77e9-45c6-b5a6-f7df3fabdf96")
public static String es_PE_TAB_PluginAccess_Help="The Plugin Access Tab defines the plugin and type of access that this Role is granted.";

@XendraTab(Name="Plugin Access",Description="Plugin Access",
Help="The Plugin Access Tab defines the plugin and type of access that this Role is granted.",
AD_Window_ID="6341ac38-b536-eb1d-f7aa-89d20601b434",SeqNo=90,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="6fd582a6-5e06-4903-9ad7-3a0833a37c22",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="edb241a2-77e9-45c6-b5a6-f7df3fabdf96",
Synchronized="2015-11-25 08:46:41.0")
public static final String TABNAME_PluginAccess="edb241a2-77e9-45c6-b5a6-f7df3fabdf96";

@XendraTrl(Identifier="3995db92-700f-47ab-9ff2-653c587915c3")
public static String es_PE_TABLE_AD_Plugin_Access_Name="Plugin Access";

@XendraTable(Name="Plugin Access",Description="",Help="",TableName="AD_Plugin_Access",
AccessLevel="6",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=0,LoadSeq=0,IsSecurityEnabled=false,
IsDeleteable=true,IsHighVolume=false,IsChangeLog=false,IsView=false,PO_Window_ID="",
ID="org.xendra.dictionary",Identifier="3995db92-700f-47ab-9ff2-653c587915c3",
Synchronized="2017-08-16 11:40:37.0")
/** TableName=AD_Plugin_Access */
public static final String Table_Name="AD_Plugin_Access";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_Plugin_Access");

protected BigDecimal accessLevel = BigDecimal.valueOf(6);
/** AccessLevel
@return 6 - System - Client 
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
    Table_ID = MTable.getTable_ID("AD_Plugin_Access");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_Plugin_Access[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Plugin.
@param AD_Plugin_ID Plugin */
public void setAD_Plugin_ID (int AD_Plugin_ID)
{
if (AD_Plugin_ID < 1) throw new IllegalArgumentException ("AD_Plugin_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_Plugin_ID, Integer.valueOf(AD_Plugin_ID));
}
/** Get Plugin.
@return Plugin */
public int getAD_Plugin_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Plugin_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="")
public static String es_PE_FIELD_PluginAccess_Plugin_Name="Plugin";

@XendraField(AD_Column_ID="AD_Plugin_ID",IsCentrallyMaintained=true,
AD_Tab_ID="edb241a2-77e9-45c6-b5a6-f7df3fabdf96",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2015-11-25 08:46:41.0",
Identifier="")
public static final String FIELDNAME_PluginAccess_Plugin="";

@XendraTrl(Identifier="9e3d9c8b-7039-49f0-8c76-afd28209022b")
public static String es_PE_COLUMN_AD_Plugin_ID_Name="Plugin";

@XendraColumn(AD_Element_ID="895f0c3e-fa52-48b7-8fce-f9b2dc637774",ColumnName="AD_Plugin_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9e3d9c8b-7039-49f0-8c76-afd28209022b",
Synchronized="2017-08-05 16:52:39.0")
/** Column name AD_Plugin_ID */
public static final String COLUMNNAME_AD_Plugin_ID = "AD_Plugin_ID";
/** Set Role.
@param AD_Role_ID Responsibility Role */
public void setAD_Role_ID (int AD_Role_ID)
{
if (AD_Role_ID < 0) throw new IllegalArgumentException ("AD_Role_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_Role_ID, Integer.valueOf(AD_Role_ID));
}
/** Get Role.
@return Responsibility Role */
public int getAD_Role_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Role_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="")
public static String es_PE_FIELD_PluginAccess_Role_Description="Rol de responsabilidad";

@XendraTrl(Identifier="")
public static String es_PE_FIELD_PluginAccess_Role_Help="El Rol determina la seguridad y acceso del usuario que posee este Rol";

@XendraTrl(Identifier="")
public static String es_PE_FIELD_PluginAccess_Role_Name="Rol";

@XendraField(AD_Column_ID="AD_Role_ID",IsCentrallyMaintained=true,
AD_Tab_ID="edb241a2-77e9-45c6-b5a6-f7df3fabdf96",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2015-11-25 08:46:41.0",
Identifier="")
public static final String FIELDNAME_PluginAccess_Role="";

@XendraTrl(Identifier="6fd582a6-5e06-4903-9ad7-3a0833a37c22")
public static String es_PE_COLUMN_AD_Role_ID_Name="Role";

@XendraColumn(AD_Element_ID="08ffb725-ea75-e55f-f4c5-67ac26f40e2b",ColumnName="AD_Role_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6fd582a6-5e06-4903-9ad7-3a0833a37c22",
Synchronized="2017-08-05 16:52:39.0")
/** Column name AD_Role_ID */
public static final String COLUMNNAME_AD_Role_ID = "AD_Role_ID";
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
@XendraTrl(Identifier="")
public static String es_PE_FIELD_PluginAccess_Identifier_Name="Identifier";

@XendraField(AD_Column_ID="Identifier",IsCentrallyMaintained=true,
AD_Tab_ID="edb241a2-77e9-45c6-b5a6-f7df3fabdf96",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=36,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2015-11-25 08:46:41.0",
Identifier="")
public static final String FIELDNAME_PluginAccess_Identifier="";

@XendraTrl(Identifier="99571b51-edbb-4a36-a1a6-a5759df4cb57")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="99571b51-edbb-4a36-a1a6-a5759df4cb57",
Synchronized="2015-11-15 00:01:18.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Read Write.
@param IsReadWrite Field is read / write */
public void setIsReadWrite (boolean IsReadWrite)
{
set_Value (COLUMNNAME_IsReadWrite, Boolean.valueOf(IsReadWrite));
}
/** Get Read Write.
@return Field is read / write */
public boolean isReadWrite() 
{
Object oo = get_Value(COLUMNNAME_IsReadWrite);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="")
public static String es_PE_FIELD_PluginAccess_ReadWrite_Description="El campo es de lectura / escritura";

@XendraTrl(Identifier="")
public static String es_PE_FIELD_PluginAccess_ReadWrite_Help="El lectura escritura indica que este campo puede ser leído y actualizado.";

@XendraTrl(Identifier="")
public static String es_PE_FIELD_PluginAccess_ReadWrite_Name="Lectura Escritura";

@XendraField(AD_Column_ID="IsReadWrite",IsCentrallyMaintained=true,
AD_Tab_ID="edb241a2-77e9-45c6-b5a6-f7df3fabdf96",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2015-11-25 08:46:41.0",Identifier="")
public static final String FIELDNAME_PluginAccess_ReadWrite="";

@XendraTrl(Identifier="7a5a84ae-600b-4d25-b143-f99e993ce348")
public static String es_PE_COLUMN_IsReadWrite_Name="Read Write";

@XendraColumn(AD_Element_ID="fc616898-5f46-981e-906f-9a5ddb486499",ColumnName="IsReadWrite",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7a5a84ae-600b-4d25-b143-f99e993ce348",
Synchronized="2015-11-15 00:01:18.0")
/** Column name IsReadWrite */
public static final String COLUMNNAME_IsReadWrite = "IsReadWrite";
}
