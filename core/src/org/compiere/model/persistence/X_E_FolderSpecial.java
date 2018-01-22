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
/** Generated Model for E_FolderSpecial
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_E_FolderSpecial extends PO
{
/** Standard Constructor
@param ctx context
@param E_FolderSpecial_ID id
@param trxName transaction
*/
public X_E_FolderSpecial (Properties ctx, int E_FolderSpecial_ID, String trxName)
{
super (ctx, E_FolderSpecial_ID, trxName);
/** if (E_FolderSpecial_ID == 0)
{
setE_FolderSpecial_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_E_FolderSpecial (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000294 */
public static int Table_ID=MTable.getTable_ID("E_FolderSpecial");

@XendraTrl(Identifier="98d35d9d-af90-46f4-bd16-98ea8352e1d4")
public static String es_PE_TABLE_E_FolderSpecial_Name="E_FolderSpecial";

@XendraTable(Name="E_FolderSpecial",Description="",Help="",TableName="E_FolderSpecial",
AccessLevel="3",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,IsSecurityEnabled=false,
IsDeleteable=false,IsHighVolume=false,IsChangeLog=false,IsView=false,PO_Window_ID="",
ID="org.xendra.communication",Identifier="98d35d9d-af90-46f4-bd16-98ea8352e1d4",
Synchronized="2017-08-16 11:42:36.0")
/** TableName=E_FolderSpecial */
public static final String Table_Name="E_FolderSpecial";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"E_FolderSpecial");

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
    Table_ID = MTable.getTable_ID("E_FolderSpecial");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_E_FolderSpecial[").append(get_ID()).append("]");
return sb.toString();
}
/** Set User/Contact.
@param AD_User_ID User within the system - Internal or Business Partner Contact */
public void setAD_User_ID (int AD_User_ID)
{
if (AD_User_ID <= 0) set_Value (COLUMNNAME_AD_User_ID, null);
 else 
set_Value (COLUMNNAME_AD_User_ID, Integer.valueOf(AD_User_ID));
}
/** Get User/Contact.
@return User within the system - Internal or Business Partner Contact */
public int getAD_User_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_User_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d8f9413a-2bf9-425c-a480-1533ecd211d4")
public static String es_PE_COLUMN_AD_User_ID_Name="User/Contact";

@XendraColumn(AD_Element_ID="abdf8dee-d3cd-73ec-c758-683e907797f4",ColumnName="AD_User_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d8f9413a-2bf9-425c-a480-1533ecd211d4",
Synchronized="2017-08-05 16:54:33.0")
/** Column name AD_User_ID */
public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";

/** E_FolderDrafts_ID AD_Reference=78d11f10-7a65-4786-abf0-65f9631dd1f1 */
public static final int E_FOLDERDRAFTS_ID_AD_Reference_ID=1000055;
/** Set E_FolderDrafts_ID.
@param E_FolderDrafts_ID E_FolderDrafts_ID */
public void setE_FolderDrafts_ID (int E_FolderDrafts_ID)
{
if (E_FolderDrafts_ID <= 0) set_Value (COLUMNNAME_E_FolderDrafts_ID, null);
 else 
set_Value (COLUMNNAME_E_FolderDrafts_ID, Integer.valueOf(E_FolderDrafts_ID));
}
/** Get E_FolderDrafts_ID.
@return E_FolderDrafts_ID */
public int getE_FolderDrafts_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_E_FolderDrafts_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="6e221617-a1e8-47f0-89c5-4d8c31c1d737")
public static String es_PE_COLUMN_E_FolderDrafts_ID_Name="E_FolderDrafts_ID";

@XendraColumn(AD_Element_ID="5b5f4d01-001e-4841-aeb0-9859a00b6379",ColumnName="E_FolderDrafts_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="78d11f10-7a65-4786-abf0-65f9631dd1f1",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="6e221617-a1e8-47f0-89c5-4d8c31c1d737",Synchronized="2017-08-05 16:54:33.0")
/** Column name E_FolderDrafts_ID */
public static final String COLUMNNAME_E_FolderDrafts_ID = "E_FolderDrafts_ID";

/** E_FolderInbox_ID AD_Reference=78d11f10-7a65-4786-abf0-65f9631dd1f1 */
public static final int E_FOLDERINBOX_ID_AD_Reference_ID=1000055;
/** Set E_FolderInbox_ID.
@param E_FolderInbox_ID E_FolderInbox_ID */
public void setE_FolderInbox_ID (int E_FolderInbox_ID)
{
if (E_FolderInbox_ID <= 0) set_Value (COLUMNNAME_E_FolderInbox_ID, null);
 else 
set_Value (COLUMNNAME_E_FolderInbox_ID, Integer.valueOf(E_FolderInbox_ID));
}
/** Get E_FolderInbox_ID.
@return E_FolderInbox_ID */
public int getE_FolderInbox_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_E_FolderInbox_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="545bf44a-79a9-480c-9ba8-1a084c31a70f")
public static String es_PE_COLUMN_E_FolderInbox_ID_Name="E_FolderInbox_ID";

@XendraColumn(AD_Element_ID="55d7ec47-38f9-4a26-b237-8474ee83efbc",ColumnName="E_FolderInbox_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="78d11f10-7a65-4786-abf0-65f9631dd1f1",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="545bf44a-79a9-480c-9ba8-1a084c31a70f",Synchronized="2017-08-05 16:54:33.0")
/** Column name E_FolderInbox_ID */
public static final String COLUMNNAME_E_FolderInbox_ID = "E_FolderInbox_ID";

/** E_FolderSent_ID AD_Reference=78d11f10-7a65-4786-abf0-65f9631dd1f1 */
public static final int E_FOLDERSENT_ID_AD_Reference_ID=1000055;
/** Set E_FolderSent_ID.
@param E_FolderSent_ID E_FolderSent_ID */
public void setE_FolderSent_ID (int E_FolderSent_ID)
{
if (E_FolderSent_ID <= 0) set_Value (COLUMNNAME_E_FolderSent_ID, null);
 else 
set_Value (COLUMNNAME_E_FolderSent_ID, Integer.valueOf(E_FolderSent_ID));
}
/** Get E_FolderSent_ID.
@return E_FolderSent_ID */
public int getE_FolderSent_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_E_FolderSent_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="6d1688d9-8c54-475a-a6d1-c8ebf4ce5a93")
public static String es_PE_COLUMN_E_FolderSent_ID_Name="E_FolderSent_ID";

@XendraColumn(AD_Element_ID="41938e46-dfa3-479a-aabe-d9d7335d270e",ColumnName="E_FolderSent_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="78d11f10-7a65-4786-abf0-65f9631dd1f1",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="6d1688d9-8c54-475a-a6d1-c8ebf4ce5a93",Synchronized="2017-08-05 16:54:33.0")
/** Column name E_FolderSent_ID */
public static final String COLUMNNAME_E_FolderSent_ID = "E_FolderSent_ID";

/** E_FolderSpecial_ID AD_Reference=78d11f10-7a65-4786-abf0-65f9631dd1f1 */
public static final int E_FOLDERSPECIAL_ID_AD_Reference_ID=1000055;
/** Set E_FolderSpecial_ID.
@param E_FolderSpecial_ID E_FolderSpecial_ID */
public void setE_FolderSpecial_ID (int E_FolderSpecial_ID)
{
if (E_FolderSpecial_ID < 1) throw new IllegalArgumentException ("E_FolderSpecial_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_E_FolderSpecial_ID, Integer.valueOf(E_FolderSpecial_ID));
}
/** Get E_FolderSpecial_ID.
@return E_FolderSpecial_ID */
public int getE_FolderSpecial_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_E_FolderSpecial_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name E_FolderSpecial_ID */
public static final String COLUMNNAME_E_FolderSpecial_ID = "E_FolderSpecial_ID";

/** E_FolderTemplates_ID AD_Reference=78d11f10-7a65-4786-abf0-65f9631dd1f1 */
public static final int E_FOLDERTEMPLATES_ID_AD_Reference_ID=1000055;
/** Set E_FolderTemplates_ID.
@param E_FolderTemplates_ID E_FolderTemplates_ID */
public void setE_FolderTemplates_ID (int E_FolderTemplates_ID)
{
if (E_FolderTemplates_ID <= 0) set_Value (COLUMNNAME_E_FolderTemplates_ID, null);
 else 
set_Value (COLUMNNAME_E_FolderTemplates_ID, Integer.valueOf(E_FolderTemplates_ID));
}
/** Get E_FolderTemplates_ID.
@return E_FolderTemplates_ID */
public int getE_FolderTemplates_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_E_FolderTemplates_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="10e1f3cb-6e55-4472-ab8a-bc98e0ada28b")
public static String es_PE_COLUMN_E_FolderTemplates_ID_Name="E_FolderTemplates_ID";

@XendraColumn(AD_Element_ID="3f4581cf-d781-4ee8-94d9-b1f181959ce4",
ColumnName="E_FolderTemplates_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="78d11f10-7a65-4786-abf0-65f9631dd1f1",AD_Val_Rule_ID="",FieldLength=10,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="10e1f3cb-6e55-4472-ab8a-bc98e0ada28b",
Synchronized="2017-08-05 16:54:33.0")
/** Column name E_FolderTemplates_ID */
public static final String COLUMNNAME_E_FolderTemplates_ID = "E_FolderTemplates_ID";

/** E_FolderTrash_ID AD_Reference=78d11f10-7a65-4786-abf0-65f9631dd1f1 */
public static final int E_FOLDERTRASH_ID_AD_Reference_ID=1000055;
/** Set E_FolderTrash_ID.
@param E_FolderTrash_ID E_FolderTrash_ID */
public void setE_FolderTrash_ID (int E_FolderTrash_ID)
{
if (E_FolderTrash_ID <= 0) set_Value (COLUMNNAME_E_FolderTrash_ID, null);
 else 
set_Value (COLUMNNAME_E_FolderTrash_ID, Integer.valueOf(E_FolderTrash_ID));
}
/** Get E_FolderTrash_ID.
@return E_FolderTrash_ID */
public int getE_FolderTrash_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_E_FolderTrash_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="8b9cbe37-53f2-4f3f-831b-c05dbc027236")
public static String es_PE_COLUMN_E_FolderTrash_ID_Name="E_FolderTrash_ID";

@XendraColumn(AD_Element_ID="84930f83-68a3-4243-87fb-6415cc53280b",ColumnName="E_FolderTrash_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="78d11f10-7a65-4786-abf0-65f9631dd1f1",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="8b9cbe37-53f2-4f3f-831b-c05dbc027236",Synchronized="2017-08-05 16:54:33.0")
/** Column name E_FolderTrash_ID */
public static final String COLUMNNAME_E_FolderTrash_ID = "E_FolderTrash_ID";
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
@XendraTrl(Identifier="b72dc7ac-0142-4c91-b2f6-54d5c5aedb9b")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b72dc7ac-0142-4c91-b2f6-54d5c5aedb9b",
Synchronized="2017-08-05 16:54:33.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
}
