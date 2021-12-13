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
/** Generated Model for AD_Process_Access
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_Process_Access extends PO
{
/** Standard Constructor
@param ctx context
@param AD_Process_Access_ID id
@param trxName transaction
*/
public X_AD_Process_Access (Properties ctx, int AD_Process_Access_ID, String trxName)
{
super (ctx, AD_Process_Access_ID, trxName);
/** if (AD_Process_Access_ID == 0)
{
setAD_Process_ID (0);
setAD_Role_ID (0);
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
public X_AD_Process_Access (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=197 */
public static int Table_ID=MTable.getTable_ID("AD_Process_Access");

@XendraTrl(Identifier="586b8299-d122-6706-1551-7ce575c9f663")
public static String es_PE_TAB_ReportTranslation_Description="Acceso a Informe";

@XendraTrl(Identifier="586b8299-d122-6706-1551-7ce575c9f663")
public static String es_PE_TAB_ReportTranslation_Help="La pestaña Acceso de Informes determina quien puede tener acceso a un Informe ó proceso";

@XendraTrl(Identifier="586b8299-d122-6706-1551-7ce575c9f663")
public static String es_PE_TAB_ReportTranslation_Name="Acceso a Informe";

@XendraTab(Name="Report Translation",Description="Report Access",
Help="The Report Access Tab determines who can access a report or process",
AD_Window_ID="7bc9e03b-e56c-36fe-34ff-ea412ab43089",SeqNo=30,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="aa94bae7-87d1-9ad8-2913-20dfe2a7ff86",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="586b8299-d122-6706-1551-7ce575c9f663",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_ReportTranslation="586b8299-d122-6706-1551-7ce575c9f663";

@XendraTrl(Identifier="9297bbeb-f6bc-195b-2580-e4d31b7c98ec")
public static String es_PE_TAB_ProcessAccess_Description="Acceso a Proceso";

@XendraTrl(Identifier="9297bbeb-f6bc-195b-2580-e4d31b7c98ec")
public static String es_PE_TAB_ProcessAccess_Help="La pestaña Acceso de Procesos define los procesos y el tipo de acceso que este rol tiene.";

@XendraTrl(Identifier="9297bbeb-f6bc-195b-2580-e4d31b7c98ec")
public static String es_PE_TAB_ProcessAccess_Name="Acceso a Proceso";

@XendraTab(Name="Process Access",Description="Process Access",
Help="The Process Access Tab defines the Processes and type of access that this Role is granted.",
AD_Window_ID="6341ac38-b536-eb1d-f7aa-89d20601b434",SeqNo=60,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="2f2299ba-e742-aacb-0517-6a667bc7cb34",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="9297bbeb-f6bc-195b-2580-e4d31b7c98ec",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_ProcessAccess="9297bbeb-f6bc-195b-2580-e4d31b7c98ec";

@XendraTrl(Identifier="53776df6-9daa-b241-61aa-cc43506d392e")
public static String es_PE_TABLE_AD_Process_Access_Name="AD_Process_Access";

@XendraTable(Name="Process Access",AD_Package_ID="140d4d0c-8da8-bcb6-9c20-bc776701f80c",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="AD_Process_Access",AccessLevel="6",AD_Window_ID="7bc9e03b-e56c-36fe-34ff-ea412ab43089",
AD_Val_Rule_ID="",IsKey=0,LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.dictionary",
Identifier="53776df6-9daa-b241-61aa-cc43506d392e",Synchronized="2020-03-03 21:35:48.0")
/** TableName=AD_Process_Access */
public static final String Table_Name="AD_Process_Access";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_Process_Access");

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
    Table_ID = MTable.getTable_ID("AD_Process_Access");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_Process_Access[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Process.
@param AD_Process_ID Process or Report */
public void setAD_Process_ID (int AD_Process_ID)
{
if (AD_Process_ID < 1) throw new IllegalArgumentException ("AD_Process_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_Process_ID, Integer.valueOf(AD_Process_ID));
}
/** Get Process.
@return Process or Report */
public int getAD_Process_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Process_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="526cc309-b426-48a4-1470-6f27ea4028b0")
public static String es_PE_FIELD_ProcessAccess_Process_Name="Proceso";

@XendraTrl(Identifier="526cc309-b426-48a4-1470-6f27ea4028b0")
public static String es_PE_FIELD_ProcessAccess_Process_Description="Proceso ó Informe";

@XendraTrl(Identifier="526cc309-b426-48a4-1470-6f27ea4028b0")
public static String es_PE_FIELD_ProcessAccess_Process_Help="El campo proceso identifica un proceso ó Informe único en el sistema.";

@XendraField(AD_Column_ID="AD_Process_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9297bbeb-f6bc-195b-2580-e4d31b7c98ec",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="526cc309-b426-48a4-1470-6f27ea4028b0")
public static final String FIELDNAME_ProcessAccess_Process="526cc309-b426-48a4-1470-6f27ea4028b0";

@XendraTrl(Identifier="ff1c7780-acb4-e71e-ed05-b682de4d9372")
public static String es_PE_FIELD_ReportTranslation_Process_Name="Proceso";

@XendraTrl(Identifier="ff1c7780-acb4-e71e-ed05-b682de4d9372")
public static String es_PE_FIELD_ReportTranslation_Process_Description="Proceso ó Informe";

@XendraTrl(Identifier="ff1c7780-acb4-e71e-ed05-b682de4d9372")
public static String es_PE_FIELD_ReportTranslation_Process_Help="El campo proceso identifica un proceso ó Informe único en el sistema.";

@XendraField(AD_Column_ID="AD_Process_ID",IsCentrallyMaintained=true,
AD_Tab_ID="586b8299-d122-6706-1551-7ce575c9f663",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ff1c7780-acb4-e71e-ed05-b682de4d9372")
public static final String FIELDNAME_ReportTranslation_Process="ff1c7780-acb4-e71e-ed05-b682de4d9372";

@XendraTrl(Identifier="aa94bae7-87d1-9ad8-2913-20dfe2a7ff86")
public static String es_PE_COLUMN_AD_Process_ID_Name="Proceso";

@XendraColumn(AD_Element_ID="60982cc9-e937-d374-4608-1c3f64b16d3b",ColumnName="AD_Process_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="aa94bae7-87d1-9ad8-2913-20dfe2a7ff86",
Synchronized="2019-08-30 22:20:35.0")
/** Column name AD_Process_ID */
public static final String COLUMNNAME_AD_Process_ID = "AD_Process_ID";
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

@XendraTrl(Identifier="2d0f413e-2b28-7ed3-e723-50896c508add")
public static String es_PE_FIELD_ProcessAccess_Role_Name="Rol";

@XendraTrl(Identifier="2d0f413e-2b28-7ed3-e723-50896c508add")
public static String es_PE_FIELD_ProcessAccess_Role_Description="Rol de responsabilidad";

@XendraTrl(Identifier="2d0f413e-2b28-7ed3-e723-50896c508add")
public static String es_PE_FIELD_ProcessAccess_Role_Help="El Rol determina la seguridad y acceso del usuario que posee este Rol";

@XendraField(AD_Column_ID="AD_Role_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9297bbeb-f6bc-195b-2580-e4d31b7c98ec",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2d0f413e-2b28-7ed3-e723-50896c508add")
public static final String FIELDNAME_ProcessAccess_Role="2d0f413e-2b28-7ed3-e723-50896c508add";

@XendraTrl(Identifier="5d6deddf-e126-d125-11a8-4d1ca0ad6e08")
public static String es_PE_FIELD_ReportTranslation_Role_Name="Rol";

@XendraTrl(Identifier="5d6deddf-e126-d125-11a8-4d1ca0ad6e08")
public static String es_PE_FIELD_ReportTranslation_Role_Description="Rol de responsabilidad";

@XendraTrl(Identifier="5d6deddf-e126-d125-11a8-4d1ca0ad6e08")
public static String es_PE_FIELD_ReportTranslation_Role_Help="El Rol determina la seguridad y acceso del usuario que posee este Rol";

@XendraField(AD_Column_ID="AD_Role_ID",IsCentrallyMaintained=true,
AD_Tab_ID="586b8299-d122-6706-1551-7ce575c9f663",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5d6deddf-e126-d125-11a8-4d1ca0ad6e08")
public static final String FIELDNAME_ReportTranslation_Role="5d6deddf-e126-d125-11a8-4d1ca0ad6e08";

@XendraTrl(Identifier="2f2299ba-e742-aacb-0517-6a667bc7cb34")
public static String es_PE_COLUMN_AD_Role_ID_Name="Rol";

@XendraColumn(AD_Element_ID="08ffb725-ea75-e55f-f4c5-67ac26f40e2b",ColumnName="AD_Role_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2f2299ba-e742-aacb-0517-6a667bc7cb34",
Synchronized="2019-08-30 22:20:35.0")
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
@XendraTrl(Identifier="c4c9d1cc-5a84-450c-b752-ede135bc4e2c")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c4c9d1cc-5a84-450c-b752-ede135bc4e2c",
Synchronized="2019-08-30 22:20:35.0")
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

@XendraTrl(Identifier="6a3c0c87-30e9-540a-4d69-4902d7520eb7")
public static String es_PE_FIELD_ProcessAccess_ReadWrite_Name="Lectura Escritura";

@XendraTrl(Identifier="6a3c0c87-30e9-540a-4d69-4902d7520eb7")
public static String es_PE_FIELD_ProcessAccess_ReadWrite_Description="El campo es de lectura / escritura";

@XendraTrl(Identifier="6a3c0c87-30e9-540a-4d69-4902d7520eb7")
public static String es_PE_FIELD_ProcessAccess_ReadWrite_Help="El lectura escritura indica que este campo puede ser leído y actualizado.";

@XendraField(AD_Column_ID="IsReadWrite",IsCentrallyMaintained=true,
AD_Tab_ID="9297bbeb-f6bc-195b-2580-e4d31b7c98ec",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6a3c0c87-30e9-540a-4d69-4902d7520eb7")
public static final String FIELDNAME_ProcessAccess_ReadWrite="6a3c0c87-30e9-540a-4d69-4902d7520eb7";

@XendraTrl(Identifier="d6769f92-cc15-f412-2880-0ca40e8dcfe8")
public static String es_PE_FIELD_ReportTranslation_ReadWrite_Name="Lectura Escritura";

@XendraTrl(Identifier="d6769f92-cc15-f412-2880-0ca40e8dcfe8")
public static String es_PE_FIELD_ReportTranslation_ReadWrite_Description="El campo es de lectura / escritura";

@XendraTrl(Identifier="d6769f92-cc15-f412-2880-0ca40e8dcfe8")
public static String es_PE_FIELD_ReportTranslation_ReadWrite_Help="El lectura escritura indica que este campo puede ser leído y actualizado.";

@XendraField(AD_Column_ID="IsReadWrite",IsCentrallyMaintained=true,
AD_Tab_ID="586b8299-d122-6706-1551-7ce575c9f663",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d6769f92-cc15-f412-2880-0ca40e8dcfe8")
public static final String FIELDNAME_ReportTranslation_ReadWrite="d6769f92-cc15-f412-2880-0ca40e8dcfe8";

@XendraTrl(Identifier="7acfc180-2f51-81bf-db52-6e87440b9c82")
public static String es_PE_COLUMN_IsReadWrite_Name="Lectura Escritura";

@XendraColumn(AD_Element_ID="fc616898-5f46-981e-906f-9a5ddb486499",ColumnName="IsReadWrite",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7acfc180-2f51-81bf-db52-6e87440b9c82",
Synchronized="2019-08-30 22:20:35.0")
/** Column name IsReadWrite */
public static final String COLUMNNAME_IsReadWrite = "IsReadWrite";
}
