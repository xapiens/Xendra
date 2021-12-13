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
/** Generated Model for E_FolderSpam
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_E_FolderSpam extends PO
{
/** Standard Constructor
@param ctx context
@param E_FolderSpam_ID id
@param trxName transaction
*/
public X_E_FolderSpam (Properties ctx, int E_FolderSpam_ID, String trxName)
{
super (ctx, E_FolderSpam_ID, trxName);
/** if (E_FolderSpam_ID == 0)
{
setE_FolderSpam_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_E_FolderSpam (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000296 */
public static int Table_ID=MTable.getTable_ID("E_FolderSpam");

@XendraTrl(Identifier="6e8e6521-5a80-4804-b32b-993c290be094")
public static String es_PE_TABLE_E_FolderSpam_Name="E_FolderSpam";

@XendraTable(Name="E_FolderSpam",AD_Package_ID="5a4baeee-43d7-eba9-9b5a-4ab05cfda2bd",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="E_FolderSpam",AccessLevel="6",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,
IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=false,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.communication",Identifier="6e8e6521-5a80-4804-b32b-993c290be094",
Synchronized="2020-03-03 21:37:47.0")
/** TableName=E_FolderSpam */
public static final String Table_Name="E_FolderSpam";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"E_FolderSpam");

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
    Table_ID = MTable.getTable_ID("E_FolderSpam");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_E_FolderSpam[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="cddb3ddc-ed76-4cdf-af63-bd1cc184cdc8")
public static String es_PE_COLUMN_AD_User_ID_Name="User/Contact";

@XendraColumn(AD_Element_ID="abdf8dee-d3cd-73ec-c758-683e907797f4",ColumnName="AD_User_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cddb3ddc-ed76-4cdf-af63-bd1cc184cdc8",
Synchronized="2019-08-30 22:22:24.0")
/** Column name AD_User_ID */
public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";
/** Set E_FolderIncoming_ID.
@param E_FolderIncoming_ID E_FolderIncoming_ID */
public void setE_FolderIncoming_ID (int E_FolderIncoming_ID)
{
if (E_FolderIncoming_ID <= 0) set_Value (COLUMNNAME_E_FolderIncoming_ID, null);
 else 
set_Value (COLUMNNAME_E_FolderIncoming_ID, Integer.valueOf(E_FolderIncoming_ID));
}
/** Get E_FolderIncoming_ID.
@return E_FolderIncoming_ID */
public int getE_FolderIncoming_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_E_FolderIncoming_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="145221ff-a228-4c94-97ce-a293cb92ceb4")
public static String es_PE_COLUMN_E_FolderIncoming_ID_Name="E_FolderIncoming_ID";

@XendraColumn(AD_Element_ID="c78db40a-7581-45c1-91c9-4e6cdd97cd93",
ColumnName="E_FolderIncoming_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="78d11f10-7a65-4786-abf0-65f9631dd1f1",AD_Val_Rule_ID="",FieldLength=10,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="145221ff-a228-4c94-97ce-a293cb92ceb4",
Synchronized="2019-08-30 22:22:24.0")
/** Column name E_FolderIncoming_ID */
public static final String COLUMNNAME_E_FolderIncoming_ID = "E_FolderIncoming_ID";
/** Set E_FolderMove_ID.
@param E_FolderMove_ID E_FolderMove_ID */
public void setE_FolderMove_ID (int E_FolderMove_ID)
{
if (E_FolderMove_ID <= 0) set_Value (COLUMNNAME_E_FolderMove_ID, null);
 else 
set_Value (COLUMNNAME_E_FolderMove_ID, Integer.valueOf(E_FolderMove_ID));
}
/** Get E_FolderMove_ID.
@return E_FolderMove_ID */
public int getE_FolderMove_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_E_FolderMove_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="a345a66c-07dc-4736-84f4-5a66c2e93f85")
public static String es_PE_COLUMN_E_FolderMove_ID_Name="E_FolderMove_ID";

@XendraColumn(AD_Element_ID="73fcc21c-59d6-445e-934a-ce3e2f9139e7",ColumnName="E_FolderMove_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="78d11f10-7a65-4786-abf0-65f9631dd1f1",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="a345a66c-07dc-4736-84f4-5a66c2e93f85",Synchronized="2019-08-30 22:22:24.0")
/** Column name E_FolderMove_ID */
public static final String COLUMNNAME_E_FolderMove_ID = "E_FolderMove_ID";
/** Set E_FolderSpam_ID.
@param E_FolderSpam_ID E_FolderSpam_ID */
public void setE_FolderSpam_ID (int E_FolderSpam_ID)
{
if (E_FolderSpam_ID < 1) throw new IllegalArgumentException ("E_FolderSpam_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_E_FolderSpam_ID, Integer.valueOf(E_FolderSpam_ID));
}
/** Get E_FolderSpam_ID.
@return E_FolderSpam_ID */
public int getE_FolderSpam_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_E_FolderSpam_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name E_FolderSpam_ID */
public static final String COLUMNNAME_E_FolderSpam_ID = "E_FolderSpam_ID";
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
@XendraTrl(Identifier="bd8192bf-cbc7-4b6c-9fa9-4b7c66718524")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bd8192bf-cbc7-4b6c-9fa9-4b7c66718524",
Synchronized="2019-08-30 22:22:24.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set IsCheckAddressBook.
@param IsCheckAddressBook IsCheckAddressBook */
public void setIsCheckAddressBook (boolean IsCheckAddressBook)
{
set_Value (COLUMNNAME_IsCheckAddressBook, Boolean.valueOf(IsCheckAddressBook));
}
/** Get IsCheckAddressBook.
@return IsCheckAddressBook */
public boolean isCheckAddressBook() 
{
Object oo = get_Value(COLUMNNAME_IsCheckAddressBook);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="4b30492b-d43c-4667-b3e9-762998407995")
public static String es_PE_COLUMN_IsCheckAddressBook_Name="IsCheckAddressBook";

@XendraColumn(AD_Element_ID="dbde67db-0f38-4041-b3f7-163ede492253",ColumnName="IsCheckAddressBook",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4b30492b-d43c-4667-b3e9-762998407995",
Synchronized="2019-08-30 22:22:24.0")
/** Column name IsCheckAddressBook */
public static final String COLUMNNAME_IsCheckAddressBook = "IsCheckAddressBook";
/** Set IsIncomingTrash.
@param IsIncomingTrash IsIncomingTrash */
public void setIsIncomingTrash (boolean IsIncomingTrash)
{
set_Value (COLUMNNAME_IsIncomingTrash, Boolean.valueOf(IsIncomingTrash));
}
/** Get IsIncomingTrash.
@return IsIncomingTrash */
public boolean isIncomingTrash() 
{
Object oo = get_Value(COLUMNNAME_IsIncomingTrash);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="b65920cb-1faf-4a28-93be-95e1391f859d")
public static String es_PE_COLUMN_IsIncomingTrash_Name="IsIncomingTrash";

@XendraColumn(AD_Element_ID="460249c4-5531-4bb4-a6b0-1f5c9e1c43c5",ColumnName="IsIncomingTrash",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b65920cb-1faf-4a28-93be-95e1391f859d",
Synchronized="2019-08-30 22:22:24.0")
/** Column name IsIncomingTrash */
public static final String COLUMNNAME_IsIncomingTrash = "IsIncomingTrash";
/** Set IsMoveIncomingJunkMessages.
@param IsMoveIncomingJunkMessages IsMoveIncomingJunkMessages */
public void setIsMoveIncomingJunkMessages (boolean IsMoveIncomingJunkMessages)
{
set_Value (COLUMNNAME_IsMoveIncomingJunkMessages, Boolean.valueOf(IsMoveIncomingJunkMessages));
}
/** Get IsMoveIncomingJunkMessages.
@return IsMoveIncomingJunkMessages */
public boolean isMoveIncomingJunkMessages() 
{
Object oo = get_Value(COLUMNNAME_IsMoveIncomingJunkMessages);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="5f69110c-cdb7-4da1-bfe5-cb6699ba5a3d")
public static String es_PE_COLUMN_IsMoveIncomingJunkMessages_Name="IsMoveIncomingJunkMessages";

@XendraColumn(AD_Element_ID="68a27a8b-df22-4b53-8b41-26f0dacc3148",
ColumnName="IsMoveIncomingJunkMessages",AD_Reference_ID=20,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="5f69110c-cdb7-4da1-bfe5-cb6699ba5a3d",Synchronized="2019-08-30 22:22:24.0")
/** Column name IsMoveIncomingJunkMessages */
public static final String COLUMNNAME_IsMoveIncomingJunkMessages = "IsMoveIncomingJunkMessages";
/** Set IsMoveMessageWhenMarking.
@param IsMoveMessageWhenMarking IsMoveMessageWhenMarking */
public void setIsMoveMessageWhenMarking (boolean IsMoveMessageWhenMarking)
{
set_Value (COLUMNNAME_IsMoveMessageWhenMarking, Boolean.valueOf(IsMoveMessageWhenMarking));
}
/** Get IsMoveMessageWhenMarking.
@return IsMoveMessageWhenMarking */
public boolean isMoveMessageWhenMarking() 
{
Object oo = get_Value(COLUMNNAME_IsMoveMessageWhenMarking);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="e1b43301-2004-4308-a67a-43da66c89b42")
public static String es_PE_COLUMN_IsMoveMessageWhenMarking_Name="IsMoveMessageWhenMarking";

@XendraColumn(AD_Element_ID="58c848ec-a1a0-44e9-8c2f-4346250dcffc",
ColumnName="IsMoveMessageWhenMarking",AD_Reference_ID=20,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="e1b43301-2004-4308-a67a-43da66c89b42",Synchronized="2019-08-30 22:22:24.0")
/** Column name IsMoveMessageWhenMarking */
public static final String COLUMNNAME_IsMoveMessageWhenMarking = "IsMoveMessageWhenMarking";
/** Set IsMoveTrash.
@param IsMoveTrash IsMoveTrash */
public void setIsMoveTrash (boolean IsMoveTrash)
{
set_Value (COLUMNNAME_IsMoveTrash, Boolean.valueOf(IsMoveTrash));
}
/** Get IsMoveTrash.
@return IsMoveTrash */
public boolean isMoveTrash() 
{
Object oo = get_Value(COLUMNNAME_IsMoveTrash);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="fa7a2428-f5e5-4381-8476-6d50a880e87d")
public static String es_PE_COLUMN_IsMoveTrash_Name="IsMoveTrash";

@XendraColumn(AD_Element_ID="913781f7-005d-4879-84c3-7157c230165f",ColumnName="IsMoveTrash",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fa7a2428-f5e5-4381-8476-6d50a880e87d",
Synchronized="2019-08-30 22:22:25.0")
/** Column name IsMoveTrash */
public static final String COLUMNNAME_IsMoveTrash = "IsMoveTrash";
}
