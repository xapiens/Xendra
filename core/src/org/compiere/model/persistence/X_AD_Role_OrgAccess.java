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
/** Generated Model for AD_Role_OrgAccess
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_Role_OrgAccess extends PO
{
/** Standard Constructor
@param ctx context
@param AD_Role_OrgAccess_ID id
@param trxName transaction
*/
public X_AD_Role_OrgAccess (Properties ctx, int AD_Role_OrgAccess_ID, String trxName)
{
super (ctx, AD_Role_OrgAccess_ID, trxName);
/** if (AD_Role_OrgAccess_ID == 0)
{
setAD_Role_ID (0);
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
public X_AD_Role_OrgAccess (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=422 */
public static int Table_ID=MTable.getTable_ID("AD_Role_OrgAccess");

@XendraTrl(Identifier="5e039afa-cd4b-0892-89b4-03065c0333ac")
public static String es_PE_TAB_OrgAccess_Description="Mantener Acceso a Organización";

@XendraTrl(Identifier="5e039afa-cd4b-0892-89b4-03065c0333ac")
public static String es_PE_TAB_OrgAccess_Help="Adicionar las organizaciones a las cuales el usuario tiene acceso. Solamente adiciones organizaciones que hagan parte de la compañía a la cual pertenece el rol.";

@XendraTrl(Identifier="5e039afa-cd4b-0892-89b4-03065c0333ac")
public static String es_PE_TAB_OrgAccess_Name="Acceso a Organización";
@XendraTab(Name="Org Access",
Description="Maintain Role Org Access",
Help="Add the client and organizations the user has access to. Entries here are ignored, if User Org Access is selected or the role has access to all roles.<br> Note that access information is cached and requires re-login or reset of cache.",
AD_Window_ID="6341ac38-b536-eb1d-f7aa-89d20601b434",SeqNo=30,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="0281d376-abb9-e2bd-38f2-1d9a2e364399",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="5e039afa-cd4b-0892-89b4-03065c0333ac",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_OrgAccess="5e039afa-cd4b-0892-89b4-03065c0333ac";

@XendraTrl(Identifier="d288e94c-b928-8285-abe0-491846fbd5c3")
public static String es_PE_TABLE_AD_Role_OrgAccess_Name="AD_Role_OrgAccess";

@XendraTable(Name="AD_Role_OrgAccess",AD_Package_ID="140d4d0c-8da8-bcb6-9c20-bc776701f80c",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="AD_Role_OrgAccess",AccessLevel="6",AD_Window_ID="6341ac38-b536-eb1d-f7aa-89d20601b434",
AD_Val_Rule_ID="",IsKey=0,LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.dictionary",
Identifier="d288e94c-b928-8285-abe0-491846fbd5c3",Synchronized="2020-03-03 21:35:53.0")
/** TableName=AD_Role_OrgAccess */
public static final String Table_Name="AD_Role_OrgAccess";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_Role_OrgAccess");

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
    Table_ID = MTable.getTable_ID("AD_Role_OrgAccess");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_Role_OrgAccess[").append(get_ID()).append("]");
return sb.toString();
}
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

@XendraTrl(Identifier="88af288f-55db-e759-7045-3bd348bdbec4")
public static String es_PE_FIELD_OrgAccess_Role_Name="Rol";

@XendraTrl(Identifier="88af288f-55db-e759-7045-3bd348bdbec4")
public static String es_PE_FIELD_OrgAccess_Role_Description="Rol de responsabilidad";

@XendraTrl(Identifier="88af288f-55db-e759-7045-3bd348bdbec4")
public static String es_PE_FIELD_OrgAccess_Role_Help="El Rol determina la seguridad y acceso del usuario que posee este Rol";

@XendraField(AD_Column_ID="AD_Role_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5e039afa-cd4b-0892-89b4-03065c0333ac",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="88af288f-55db-e759-7045-3bd348bdbec4")
public static final String FIELDNAME_OrgAccess_Role="88af288f-55db-e759-7045-3bd348bdbec4";

@XendraTrl(Identifier="0281d376-abb9-e2bd-38f2-1d9a2e364399")
public static String es_PE_COLUMN_AD_Role_ID_Name="Rol";

@XendraColumn(AD_Element_ID="08ffb725-ea75-e55f-f4c5-67ac26f40e2b",ColumnName="AD_Role_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0281d376-abb9-e2bd-38f2-1d9a2e364399",
Synchronized="2019-08-30 22:20:39.0")
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
@XendraTrl(Identifier="b980a64a-3810-4b78-a87f-80746a50e820")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b980a64a-3810-4b78-a87f-80746a50e820",
Synchronized="2019-08-30 22:20:39.0")
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

@XendraTrl(Identifier="e1a27d62-830e-55f3-2d01-f22d2ca9b199")
public static String es_PE_FIELD_OrgAccess_ReadOnly_Name="Sólo Lectura";

@XendraTrl(Identifier="e1a27d62-830e-55f3-2d01-f22d2ca9b199")
public static String es_PE_FIELD_OrgAccess_ReadOnly_Description="El campo es de sólo lectura";

@XendraTrl(Identifier="e1a27d62-830e-55f3-2d01-f22d2ca9b199")
public static String es_PE_FIELD_OrgAccess_ReadOnly_Help="El sólo lectura indica que este campo solamente puede ser leído. No puede ser actualizado.";

@XendraField(AD_Column_ID="IsReadOnly",IsCentrallyMaintained=true,
AD_Tab_ID="5e039afa-cd4b-0892-89b4-03065c0333ac",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e1a27d62-830e-55f3-2d01-f22d2ca9b199")
public static final String FIELDNAME_OrgAccess_ReadOnly="e1a27d62-830e-55f3-2d01-f22d2ca9b199";

@XendraTrl(Identifier="9685fc62-b9ae-98cf-adf8-b522a7865d09")
public static String es_PE_COLUMN_IsReadOnly_Name="Sólo Lectura";

@XendraColumn(AD_Element_ID="91b664da-9e5a-8ff7-2fef-8042ee7fb0c2",ColumnName="IsReadOnly",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9685fc62-b9ae-98cf-adf8-b522a7865d09",
Synchronized="2019-08-30 22:20:39.0")
/** Column name IsReadOnly */
public static final String COLUMNNAME_IsReadOnly = "IsReadOnly";
}
