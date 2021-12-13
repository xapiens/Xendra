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
/** Generated Model for AD_User_OrgAccess
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_User_OrgAccess extends PO
{
/** Standard Constructor
@param ctx context
@param AD_User_OrgAccess_ID id
@param trxName transaction
*/
public X_AD_User_OrgAccess (Properties ctx, int AD_User_OrgAccess_ID, String trxName)
{
super (ctx, AD_User_OrgAccess_ID, trxName);
/** if (AD_User_OrgAccess_ID == 0)
{
setAD_User_ID (0);
setIsReadOnly (false);	
// N
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_User_OrgAccess (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=769 */
public static int Table_ID=MTable.getTable_ID("AD_User_OrgAccess");

@XendraTrl(Identifier="c4518fbd-5789-ba5b-2273-ebc38c5eccd5")
public static String es_PE_TAB_OrgAccess_Description="Mantenga el acceso de Org del usuario";

@XendraTrl(Identifier="c4518fbd-5789-ba5b-2273-ebc38c5eccd5")
public static String es_PE_TAB_OrgAccess_Help="Agregue a cliente y las organizaciones el usuario tienen acceso a. Si no hacen caso las entradas aquí, si en el rol, el acceso de Org del usuario no se selecciona ó el rol tiene acceso a todo los roles.<br >Observe que la información del acceso está depositada y requiere la re-conexión ó el reajuste.";

@XendraTrl(Identifier="c4518fbd-5789-ba5b-2273-ebc38c5eccd5")
public static String es_PE_TAB_OrgAccess_Name="Acceso a la Org";
@XendraTab(Name="Org Access",
Description="Maintain User Org Access",
Help="Add the client and organizations the user has access to. Entries here are ignored, if in the Role, User Org Access is not selected or the role has access to all roles.<br> Note that access information is cached and requires re-login or reset of cache.",
AD_Window_ID="9f3c1c3a-ab4f-0018-8a1e-b6cfbdbe8e7b",SeqNo=50,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="baa4e7b7-bb14-33b6-e6ad-70745be21349",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="c4518fbd-5789-ba5b-2273-ebc38c5eccd5",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_OrgAccess="c4518fbd-5789-ba5b-2273-ebc38c5eccd5";

@XendraTrl(Identifier="a1fe65d5-e26b-2e41-d730-20424f5ecfe0")
public static String es_PE_TABLE_AD_User_OrgAccess_Name="AD_User_OrgAccess";

@XendraTable(Name="AD_User_OrgAccess",AD_Package_ID="140d4d0c-8da8-bcb6-9c20-bc776701f80c",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="AD_User_OrgAccess",AccessLevel="6",AD_Window_ID="9f3c1c3a-ab4f-0018-8a1e-b6cfbdbe8e7b",
AD_Val_Rule_ID="",IsKey=0,LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.dictionary",
Identifier="a1fe65d5-e26b-2e41-d730-20424f5ecfe0",Synchronized="2020-03-03 21:36:05.0")
/** TableName=AD_User_OrgAccess */
public static final String Table_Name="AD_User_OrgAccess";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_User_OrgAccess");

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
    Table_ID = MTable.getTable_ID("AD_User_OrgAccess");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_User_OrgAccess[").append(get_ID()).append("]");
return sb.toString();
}
/** Set User/Contact.
@param AD_User_ID User within the system - Internal or Business Partner Contact */
public void setAD_User_ID (int AD_User_ID)
{
if (AD_User_ID < 1) throw new IllegalArgumentException ("AD_User_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_User_ID, Integer.valueOf(AD_User_ID));
}
/** Get User/Contact.
@return User within the system - Internal or Business Partner Contact */
public int getAD_User_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_User_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d7905e96-624e-ff96-0848-d39557c14bf7")
public static String es_PE_FIELD_OrgAccess_UserContact_Name="Usuario";

@XendraTrl(Identifier="d7905e96-624e-ff96-0848-d39557c14bf7")
public static String es_PE_FIELD_OrgAccess_UserContact_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="d7905e96-624e-ff96-0848-d39557c14bf7")
public static String es_PE_FIELD_OrgAccess_UserContact_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c4518fbd-5789-ba5b-2273-ebc38c5eccd5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d7905e96-624e-ff96-0848-d39557c14bf7")
public static final String FIELDNAME_OrgAccess_UserContact="d7905e96-624e-ff96-0848-d39557c14bf7";

@XendraTrl(Identifier="baa4e7b7-bb14-33b6-e6ad-70745be21349")
public static String es_PE_COLUMN_AD_User_ID_Name="Usuario";

@XendraColumn(AD_Element_ID="abdf8dee-d3cd-73ec-c758-683e907797f4",ColumnName="AD_User_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="baa4e7b7-bb14-33b6-e6ad-70745be21349",
Synchronized="2019-08-30 22:20:49.0")
/** Column name AD_User_ID */
public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";
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
@XendraTrl(Identifier="cf7c2cc9-9927-4429-97a7-3d513c75a03e")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cf7c2cc9-9927-4429-97a7-3d513c75a03e",
Synchronized="2019-08-30 22:20:49.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Read Only.
@param IsReadOnly Field is read only */
public void setIsReadOnly (boolean IsReadOnly)
{
set_Value (COLUMNNAME_IsReadOnly, Boolean.valueOf(IsReadOnly));
}
/** Get Read Only.
@return Field is read only */
public boolean isReadOnly() 
{
Object oo = get_Value(COLUMNNAME_IsReadOnly);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="a13df3bd-e64d-892b-130c-ec492773d7f4")
public static String es_PE_FIELD_OrgAccess_ReadOnly_Name="Sólo Lectura";

@XendraTrl(Identifier="a13df3bd-e64d-892b-130c-ec492773d7f4")
public static String es_PE_FIELD_OrgAccess_ReadOnly_Description="El campo es de sólo lectura";

@XendraTrl(Identifier="a13df3bd-e64d-892b-130c-ec492773d7f4")
public static String es_PE_FIELD_OrgAccess_ReadOnly_Help="El sólo lectura indica que este campo solamente puede ser leído. No puede ser actualizado.";

@XendraField(AD_Column_ID="IsReadOnly",IsCentrallyMaintained=true,
AD_Tab_ID="c4518fbd-5789-ba5b-2273-ebc38c5eccd5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a13df3bd-e64d-892b-130c-ec492773d7f4")
public static final String FIELDNAME_OrgAccess_ReadOnly="a13df3bd-e64d-892b-130c-ec492773d7f4";

@XendraTrl(Identifier="4d355c55-3213-1f4b-4f9d-6ea4032aa16c")
public static String es_PE_COLUMN_IsReadOnly_Name="Sólo Lectura";

@XendraColumn(AD_Element_ID="91b664da-9e5a-8ff7-2fef-8042ee7fb0c2",ColumnName="IsReadOnly",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4d355c55-3213-1f4b-4f9d-6ea4032aa16c",
Synchronized="2019-08-30 22:20:49.0")
/** Column name IsReadOnly */
public static final String COLUMNNAME_IsReadOnly = "IsReadOnly";
}
