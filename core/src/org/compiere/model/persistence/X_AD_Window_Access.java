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
/** Generated Model for AD_Window_Access
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_Window_Access extends PO
{
/** Standard Constructor
@param ctx context
@param AD_Window_Access_ID id
@param trxName transaction
*/
public X_AD_Window_Access (Properties ctx, int AD_Window_Access_ID, String trxName)
{
super (ctx, AD_Window_Access_ID, trxName);
/** if (AD_Window_Access_ID == 0)
{
setAD_Role_ID (0);
setAD_Window_ID (0);
setIsReadWrite (false);	
// N
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_Window_Access (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=201 */
public static int Table_ID=MTable.getTable_ID("AD_Window_Access");

@XendraTrl(Identifier="fa6b3ea3-b169-e592-740f-258c9255481b")
public static String es_PE_TAB_WindowAccess_Description="Acceso a Ventana";

@XendraTrl(Identifier="fa6b3ea3-b169-e592-740f-258c9255481b")
public static String es_PE_TAB_WindowAccess_Help="La pestaña Acceso de Ventanas define las ventanas y el tipo de acceso que este rol tiene.";

@XendraTrl(Identifier="fa6b3ea3-b169-e592-740f-258c9255481b")
public static String es_PE_TAB_WindowAccess_Name="Acceso a Ventana";

@XendraTab(Name="Window Access",Description="Window Access",
Help="The Window Access Tab defines the Windows and type of access that this Role is granted.",
AD_Window_ID="6341ac38-b536-eb1d-f7aa-89d20601b434",SeqNo=50,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="174e72d3-8a67-8478-34f9-139d3dbe9e10",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="fa6b3ea3-b169-e592-740f-258c9255481b",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_WindowAccess="fa6b3ea3-b169-e592-740f-258c9255481b";

@XendraTrl(Identifier="c40f3f11-0529-bf1e-c50c-6a75799e6d35")
public static String es_PE_TAB_Access_Description="Acceso a Ventana";

@XendraTrl(Identifier="c40f3f11-0529-bf1e-c50c-6a75799e6d35")
public static String es_PE_TAB_Access_Help="La pestaña Acceso de Ventanas define los roles que tienen acceso a esta ventana.";

@XendraTrl(Identifier="c40f3f11-0529-bf1e-c50c-6a75799e6d35")
public static String es_PE_TAB_Access_Name="Acceso";
@XendraTab(Name="Access",
Description="Window Access",
Help="The Window Access Tab defines the Roles which have access to this Window.",
AD_Window_ID="30d54758-dbe1-9262-0e6e-4d5cd8507e38",SeqNo=30,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="9f598d3f-0ebd-fccb-471a-acd51b911b37",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="c40f3f11-0529-bf1e-c50c-6a75799e6d35",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Access="c40f3f11-0529-bf1e-c50c-6a75799e6d35";

@XendraTrl(Identifier="4485919e-6b7f-7517-0eb3-aea509576359")
public static String es_PE_TABLE_AD_Window_Access_Name="AD_Window_Access";

@XendraTable(Name="AD_Window_Access",AD_Package_ID="140d4d0c-8da8-bcb6-9c20-bc776701f80c",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="AD_Window_Access",AccessLevel="6",AD_Window_ID="30d54758-dbe1-9262-0e6e-4d5cd8507e38",
AD_Val_Rule_ID="",IsKey=0,LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.dictionary",
Identifier="4485919e-6b7f-7517-0eb3-aea509576359",Synchronized="2020-03-03 21:36:11.0")
/** TableName=AD_Window_Access */
public static final String Table_Name="AD_Window_Access";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_Window_Access");

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
    Table_ID = MTable.getTable_ID("AD_Window_Access");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_Window_Access[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="38bc92e0-cbed-12ab-2f6e-2c330490b87d")
public static String es_PE_FIELD_WindowAccess_Role_Name="Rol";

@XendraTrl(Identifier="38bc92e0-cbed-12ab-2f6e-2c330490b87d")
public static String es_PE_FIELD_WindowAccess_Role_Description="Rol de responsabilidad";

@XendraTrl(Identifier="38bc92e0-cbed-12ab-2f6e-2c330490b87d")
public static String es_PE_FIELD_WindowAccess_Role_Help="El Rol determina la seguridad y acceso del usuario que posee este Rol";

@XendraField(AD_Column_ID="AD_Role_ID",IsCentrallyMaintained=true,
AD_Tab_ID="fa6b3ea3-b169-e592-740f-258c9255481b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="38bc92e0-cbed-12ab-2f6e-2c330490b87d")
public static final String FIELDNAME_WindowAccess_Role="38bc92e0-cbed-12ab-2f6e-2c330490b87d";

@XendraTrl(Identifier="e267cf6e-432d-78e5-0ab4-2465697afc92")
public static String es_PE_FIELD_Access_Role_Name="Rol";

@XendraTrl(Identifier="e267cf6e-432d-78e5-0ab4-2465697afc92")
public static String es_PE_FIELD_Access_Role_Description="Rol de responsabilidad";

@XendraTrl(Identifier="e267cf6e-432d-78e5-0ab4-2465697afc92")
public static String es_PE_FIELD_Access_Role_Help="El Rol determina la seguridad y acceso del usuario que posee este Rol";

@XendraField(AD_Column_ID="AD_Role_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c40f3f11-0529-bf1e-c50c-6a75799e6d35",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e267cf6e-432d-78e5-0ab4-2465697afc92")
public static final String FIELDNAME_Access_Role="e267cf6e-432d-78e5-0ab4-2465697afc92";

@XendraTrl(Identifier="174e72d3-8a67-8478-34f9-139d3dbe9e10")
public static String es_PE_COLUMN_AD_Role_ID_Name="Rol";

@XendraColumn(AD_Element_ID="08ffb725-ea75-e55f-f4c5-67ac26f40e2b",ColumnName="AD_Role_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="174e72d3-8a67-8478-34f9-139d3dbe9e10",
Synchronized="2019-08-30 22:20:53.0")
/** Column name AD_Role_ID */
public static final String COLUMNNAME_AD_Role_ID = "AD_Role_ID";
/** Set Window.
@param AD_Window_ID Data entry or display window */
public void setAD_Window_ID (int AD_Window_ID)
{
if (AD_Window_ID < 1) throw new IllegalArgumentException ("AD_Window_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_Window_ID, Integer.valueOf(AD_Window_ID));
}
/** Get Window.
@return Data entry or display window */
public int getAD_Window_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Window_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="1c61a16d-53e0-3e82-e780-4cc5f01141a5")
public static String es_PE_FIELD_WindowAccess_Window_Name="Ventana";

@XendraTrl(Identifier="1c61a16d-53e0-3e82-e780-4cc5f01141a5")
public static String es_PE_FIELD_WindowAccess_Window_Description="Ventana de entrada de datos ó despliegue";

@XendraTrl(Identifier="1c61a16d-53e0-3e82-e780-4cc5f01141a5")
public static String es_PE_FIELD_WindowAccess_Window_Help="El campo ventana identifica una ventana única en el sistema";

@XendraField(AD_Column_ID="AD_Window_ID",IsCentrallyMaintained=true,
AD_Tab_ID="fa6b3ea3-b169-e592-740f-258c9255481b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1c61a16d-53e0-3e82-e780-4cc5f01141a5")
public static final String FIELDNAME_WindowAccess_Window="1c61a16d-53e0-3e82-e780-4cc5f01141a5";

@XendraTrl(Identifier="39877421-11bc-bfe3-3b22-e4d2cdf9571b")
public static String es_PE_FIELD_Access_Window_Name="Ventana";

@XendraTrl(Identifier="39877421-11bc-bfe3-3b22-e4d2cdf9571b")
public static String es_PE_FIELD_Access_Window_Description="Ventana de entrada de datos ó despliegue";

@XendraTrl(Identifier="39877421-11bc-bfe3-3b22-e4d2cdf9571b")
public static String es_PE_FIELD_Access_Window_Help="El campo ventana identifica una ventana única en el sistema";

@XendraField(AD_Column_ID="AD_Window_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c40f3f11-0529-bf1e-c50c-6a75799e6d35",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="39877421-11bc-bfe3-3b22-e4d2cdf9571b")
public static final String FIELDNAME_Access_Window="39877421-11bc-bfe3-3b22-e4d2cdf9571b";

@XendraTrl(Identifier="9f598d3f-0ebd-fccb-471a-acd51b911b37")
public static String es_PE_COLUMN_AD_Window_ID_Name="Ventana";

@XendraColumn(AD_Element_ID="0c50cb0e-febe-8650-2621-11ba77688276",ColumnName="AD_Window_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9f598d3f-0ebd-fccb-471a-acd51b911b37",
Synchronized="2019-08-30 22:20:53.0")
/** Column name AD_Window_ID */
public static final String COLUMNNAME_AD_Window_ID = "AD_Window_ID";
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
@XendraTrl(Identifier="2cc31580-715f-4875-9a80-347bc505ac96")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2cc31580-715f-4875-9a80-347bc505ac96",
Synchronized="2019-08-30 22:20:53.0")
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

@XendraTrl(Identifier="8915c43f-4458-cd94-2a59-61ad7bed764b")
public static String es_PE_FIELD_WindowAccess_ReadWrite_Name="Lectura Escritura";

@XendraTrl(Identifier="8915c43f-4458-cd94-2a59-61ad7bed764b")
public static String es_PE_FIELD_WindowAccess_ReadWrite_Description="El campo es de lectura / escritura";

@XendraTrl(Identifier="8915c43f-4458-cd94-2a59-61ad7bed764b")
public static String es_PE_FIELD_WindowAccess_ReadWrite_Help="El lectura escritura indica que este campo puede ser leído y actualizado.";

@XendraField(AD_Column_ID="IsReadWrite",IsCentrallyMaintained=true,
AD_Tab_ID="fa6b3ea3-b169-e592-740f-258c9255481b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8915c43f-4458-cd94-2a59-61ad7bed764b")
public static final String FIELDNAME_WindowAccess_ReadWrite="8915c43f-4458-cd94-2a59-61ad7bed764b";

@XendraTrl(Identifier="2212e2ae-be74-c1bf-b118-8a4d386506c4")
public static String es_PE_FIELD_Access_ReadWrite_Name="Lectura Escritura";

@XendraTrl(Identifier="2212e2ae-be74-c1bf-b118-8a4d386506c4")
public static String es_PE_FIELD_Access_ReadWrite_Description="El campo es de lectura / escritura";

@XendraTrl(Identifier="2212e2ae-be74-c1bf-b118-8a4d386506c4")
public static String es_PE_FIELD_Access_ReadWrite_Help="El lectura escritura indica que este campo puede ser leído y actualizado.";

@XendraField(AD_Column_ID="IsReadWrite",IsCentrallyMaintained=true,
AD_Tab_ID="c40f3f11-0529-bf1e-c50c-6a75799e6d35",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2212e2ae-be74-c1bf-b118-8a4d386506c4")
public static final String FIELDNAME_Access_ReadWrite="2212e2ae-be74-c1bf-b118-8a4d386506c4";

@XendraTrl(Identifier="cd3c4b73-47f3-ad0e-1072-cf22bac78153")
public static String es_PE_COLUMN_IsReadWrite_Name="Lectura Escritura";

@XendraColumn(AD_Element_ID="fc616898-5f46-981e-906f-9a5ddb486499",ColumnName="IsReadWrite",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cd3c4b73-47f3-ad0e-1072-cf22bac78153",
Synchronized="2019-08-30 22:20:53.0")
/** Column name IsReadWrite */
public static final String COLUMNNAME_IsReadWrite = "IsReadWrite";
}
