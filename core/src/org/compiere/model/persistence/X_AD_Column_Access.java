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
/** Generated Model for AD_Column_Access
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_Column_Access extends PO
{
/** Standard Constructor
@param ctx context
@param AD_Column_Access_ID id
@param trxName transaction
*/
public X_AD_Column_Access (Properties ctx, int AD_Column_Access_ID, String trxName)
{
super (ctx, AD_Column_Access_ID, trxName);
/** if (AD_Column_Access_ID == 0)
{
setAD_Column_ID (0);
setAD_Role_ID (0);
setIsExclude (true);	
// Y
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
public X_AD_Column_Access (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=571 */
public static int Table_ID=MTable.getTable_ID("AD_Column_Access");

@XendraTrl(Identifier="9ebfa86f-be6e-169b-e30e-9bba66bb1d7c")
public static String es_PE_TAB_ColumnAccess_Description="Mantener el acceso a columnas";

@XendraTrl(Identifier="9ebfa86f-be6e-169b-e30e-9bba66bb1d7c")
public static String es_PE_TAB_ColumnAccess_Name="Acceso a columnas";

@XendraTrl(Identifier="9ebfa86f-be6e-169b-e30e-9bba66bb1d7c")
public static String es_PE_TAB_ColumnAccess_Help="Si está enumerado aquí, el acceso del rol can(not) es la columna de esta tabla, iguala si el rol tiene acceso a la funcionalidad";

@XendraTab(Name="Column Access",Description="Maintain Column Access",
Help="If listed here, the Role can(not) access the column of this table, even if the role has access to the functionality. <br>If you Include Access to a column and select Read Only, you can only read data (otherwise full access). <br>If you Exclude Access to a column and select Read Only, you can only read data (otherwise no access). Note that access information is cached and requires re-login or reset of cache.",
AD_Window_ID="c927d42d-2145-4004-dbd3-51f85f9cab5e",SeqNo=30,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="34225c02-b6bb-5938-2f8e-0dac0ae8d4a1",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="9ebfa86f-be6e-169b-e30e-9bba66bb1d7c",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_ColumnAccess="9ebfa86f-be6e-169b-e30e-9bba66bb1d7c";

@XendraTrl(Identifier="06021a6e-6c1d-9b25-4dc0-aa94edb61a38")
public static String es_PE_TABLE_AD_Column_Access_Name="AD_Column_Access";

@XendraTable(Name="AD_Column_Access",Description="",Help="",TableName="AD_Column_Access",
AccessLevel="6",AD_Window_ID="c927d42d-2145-4004-dbd3-51f85f9cab5e",AD_Val_Rule_ID="",IsKey=0,
LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.dictionary",
Identifier="06021a6e-6c1d-9b25-4dc0-aa94edb61a38",Synchronized="2017-08-16 11:40:08.0")
/** TableName=AD_Column_Access */
public static final String Table_Name="AD_Column_Access";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_Column_Access");

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
    Table_ID = MTable.getTable_ID("AD_Column_Access");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_Column_Access[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Column.
@param AD_Column_ID Column in the table */
public void setAD_Column_ID (int AD_Column_ID)
{
if (AD_Column_ID < 1) throw new IllegalArgumentException ("AD_Column_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_Column_ID, Integer.valueOf(AD_Column_ID));
}
/** Get Column.
@return Column in the table */
public int getAD_Column_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Column_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getAD_Column_ID()));
}

@XendraTrl(Identifier="4ba16fff-36a3-c887-790c-44d91c8d4b59")
public static String es_PE_FIELD_ColumnAccess_Column_Description="Columna en la tabla";

@XendraTrl(Identifier="4ba16fff-36a3-c887-790c-44d91c8d4b59")
public static String es_PE_FIELD_ColumnAccess_Column_Help="Enlace a la columna base de datos de la tabla";

@XendraTrl(Identifier="4ba16fff-36a3-c887-790c-44d91c8d4b59")
public static String es_PE_FIELD_ColumnAccess_Column_Name="Columna";

@XendraField(AD_Column_ID="AD_Column_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9ebfa86f-be6e-169b-e30e-9bba66bb1d7c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=50,SortNo=1,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4ba16fff-36a3-c887-790c-44d91c8d4b59")
public static final String FIELDNAME_ColumnAccess_Column="4ba16fff-36a3-c887-790c-44d91c8d4b59";

@XendraTrl(Identifier="ea6362aa-5cf7-b1c6-3539-ff88c1069068")
public static String es_PE_COLUMN_AD_Column_ID_Name="Columna";

@XendraColumn(AD_Element_ID="a0dcf1ba-2ef3-ca06-ed42-8ae37c632eaf",ColumnName="AD_Column_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="084db087-1100-ad15-806b-d1b94a96650c",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="ea6362aa-5cf7-b1c6-3539-ff88c1069068",Synchronized="2017-08-05 16:52:28.0")
/** Column name AD_Column_ID */
public static final String COLUMNNAME_AD_Column_ID = "AD_Column_ID";
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

@XendraTrl(Identifier="e65e1696-6806-4cef-4d20-f2d4b0dea0db")
public static String es_PE_FIELD_ColumnAccess_Role_Description="Rol de responsabilidad";

@XendraTrl(Identifier="e65e1696-6806-4cef-4d20-f2d4b0dea0db")
public static String es_PE_FIELD_ColumnAccess_Role_Help="El Rol determina la seguridad y acceso del usuario que posee este Rol";

@XendraTrl(Identifier="e65e1696-6806-4cef-4d20-f2d4b0dea0db")
public static String es_PE_FIELD_ColumnAccess_Role_Name="Rol";

@XendraField(AD_Column_ID="AD_Role_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9ebfa86f-be6e-169b-e30e-9bba66bb1d7c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e65e1696-6806-4cef-4d20-f2d4b0dea0db")
public static final String FIELDNAME_ColumnAccess_Role="e65e1696-6806-4cef-4d20-f2d4b0dea0db";

@XendraTrl(Identifier="34225c02-b6bb-5938-2f8e-0dac0ae8d4a1")
public static String es_PE_COLUMN_AD_Role_ID_Name="Rol";

@XendraColumn(AD_Element_ID="08ffb725-ea75-e55f-f4c5-67ac26f40e2b",ColumnName="AD_Role_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="34225c02-b6bb-5938-2f8e-0dac0ae8d4a1",
Synchronized="2017-08-05 16:52:28.0")
/** Column name AD_Role_ID */
public static final String COLUMNNAME_AD_Role_ID = "AD_Role_ID";
/** Set Table.
@param AD_Table_ID Database Table information */
public void setAD_Table_ID (int AD_Table_ID)
{
if (AD_Table_ID <= 0) set_Value (COLUMNNAME_AD_Table_ID, null);
 else 
set_Value (COLUMNNAME_AD_Table_ID, Integer.valueOf(AD_Table_ID));
}
/** Get Table.
@return Database Table information */
public int getAD_Table_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Table_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="8851b425-756d-4953-280a-e19814de01d3")
public static String es_PE_FIELD_ColumnAccess_Table_Description="Tabla para los campos";

@XendraTrl(Identifier="8851b425-756d-4953-280a-e19814de01d3")
public static String es_PE_FIELD_ColumnAccess_Table_Help="La Tabla indica una tabla en la que reside un campo ó campos.";

@XendraTrl(Identifier="8851b425-756d-4953-280a-e19814de01d3")
public static String es_PE_FIELD_ColumnAccess_Table_Name="Tabla";

@XendraField(AD_Column_ID="AD_Table_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9ebfa86f-be6e-169b-e30e-9bba66bb1d7c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8851b425-756d-4953-280a-e19814de01d3")
public static final String FIELDNAME_ColumnAccess_Table="8851b425-756d-4953-280a-e19814de01d3";

@XendraTrl(Identifier="cddb9171-6a7d-127a-1ced-53e4e004fea2")
public static String es_PE_COLUMN_AD_Table_ID_Name="Tabla";

@XendraColumn(AD_Element_ID="270eeb02-723b-0ecc-7f56-3c67fa71a7f1",ColumnName="AD_Table_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cddb9171-6a7d-127a-1ced-53e4e004fea2",
Synchronized="2017-08-05 16:52:28.0")
/** Column name AD_Table_ID */
public static final String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
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
@XendraTrl(Identifier="a40cbbcd-9cd2-4538-a6ea-b7d8e20de187")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a40cbbcd-9cd2-4538-a6ea-b7d8e20de187",
Synchronized="2017-08-05 16:52:28.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Exclude.
@param IsExclude Exclude access to the data - if not selected Include access to the data */
public void setIsExclude (boolean IsExclude)
{
set_Value (COLUMNNAME_IsExclude, Boolean.valueOf(IsExclude));
}
/** Get Exclude.
@return Exclude access to the data - if not selected Include access to the data */
public boolean isExclude() 
{
Object oo = get_Value(COLUMNNAME_IsExclude);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="2a3f8fdd-0fb9-e7bc-17d5-d5329da19a92")
public static String es_PE_FIELD_ColumnAccess_Exclude_Description="Excluir el acceso a los datos";

@XendraTrl(Identifier="2a3f8fdd-0fb9-e7bc-17d5-d5329da19a92")
public static String es_PE_FIELD_ColumnAccess_Exclude_Help="Si está seleccionado, el Rol no puede tener acceso a los datos especificos. Si no esta seleccionado, el Rol puede tener acceso SOLAMENTE a los datos especificos.";

@XendraTrl(Identifier="2a3f8fdd-0fb9-e7bc-17d5-d5329da19a92")
public static String es_PE_FIELD_ColumnAccess_Exclude_Name="Excluir";

@XendraField(AD_Column_ID="IsExclude",IsCentrallyMaintained=true,
AD_Tab_ID="9ebfa86f-be6e-169b-e30e-9bba66bb1d7c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2a3f8fdd-0fb9-e7bc-17d5-d5329da19a92")
public static final String FIELDNAME_ColumnAccess_Exclude="2a3f8fdd-0fb9-e7bc-17d5-d5329da19a92";

@XendraTrl(Identifier="c9b771cb-b8c6-6cd9-97d9-d9660c88e328")
public static String es_PE_COLUMN_IsExclude_Name="Excluir";

@XendraColumn(AD_Element_ID="770b492c-be75-a622-6c96-f202d97c4dfd",ColumnName="IsExclude",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c9b771cb-b8c6-6cd9-97d9-d9660c88e328",
Synchronized="2017-08-05 16:52:28.0")
/** Column name IsExclude */
public static final String COLUMNNAME_IsExclude = "IsExclude";
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

@XendraTrl(Identifier="cd33a15f-b937-fd3e-2643-c12ad3dd06c5")
public static String es_PE_FIELD_ColumnAccess_ReadOnly_Description="El campo es de sólo lectura";

@XendraTrl(Identifier="cd33a15f-b937-fd3e-2643-c12ad3dd06c5")
public static String es_PE_FIELD_ColumnAccess_ReadOnly_Help="El sólo lectura indica que este campo solamente puede ser leído. No puede ser actualizado.";

@XendraTrl(Identifier="cd33a15f-b937-fd3e-2643-c12ad3dd06c5")
public static String es_PE_FIELD_ColumnAccess_ReadOnly_Name="Sólo Lectura";

@XendraField(AD_Column_ID="IsReadOnly",IsCentrallyMaintained=true,
AD_Tab_ID="9ebfa86f-be6e-169b-e30e-9bba66bb1d7c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cd33a15f-b937-fd3e-2643-c12ad3dd06c5")
public static final String FIELDNAME_ColumnAccess_ReadOnly="cd33a15f-b937-fd3e-2643-c12ad3dd06c5";

@XendraTrl(Identifier="0bbade4d-ad63-34ef-05c3-8861e941eef8")
public static String es_PE_COLUMN_IsReadOnly_Name="Sólo Lectura";

@XendraColumn(AD_Element_ID="91b664da-9e5a-8ff7-2fef-8042ee7fb0c2",ColumnName="IsReadOnly",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0bbade4d-ad63-34ef-05c3-8861e941eef8",
Synchronized="2017-08-05 16:52:28.0")
/** Column name IsReadOnly */
public static final String COLUMNNAME_IsReadOnly = "IsReadOnly";
/** Set Synchronized.
@param Synchronized Synchronized */
public void setSynchronized (Timestamp Synchronized)
{
set_Value (COLUMNNAME_Synchronized, Synchronized);
}
/** Get Synchronized.
@return Synchronized */
public Timestamp getSynchronized() 
{
return (Timestamp)get_Value(COLUMNNAME_Synchronized);
}

@XendraTrl(Identifier="da9fe34a-89fc-8eff-85a7-093b22727c22")
public static String es_PE_COLUMN_Synchronized_Name="Synchronized";

@XendraColumn(AD_Element_ID="08f1e976-ceeb-f830-9d75-bf94f13a98ce",ColumnName="Synchronized",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="da9fe34a-89fc-8eff-85a7-093b22727c22",
Synchronized="2017-08-05 16:52:28.0")
/** Column name Synchronized */
public static final String COLUMNNAME_Synchronized = "Synchronized";
}
