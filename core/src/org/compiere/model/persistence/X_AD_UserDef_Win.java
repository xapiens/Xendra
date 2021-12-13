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
/** Generated Model for AD_UserDef_Win
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_UserDef_Win extends PO
{
/** Standard Constructor
@param ctx context
@param AD_UserDef_Win_ID id
@param trxName transaction
*/
public X_AD_UserDef_Win (Properties ctx, int AD_UserDef_Win_ID, String trxName)
{
super (ctx, AD_UserDef_Win_ID, trxName);
/** if (AD_UserDef_Win_ID == 0)
{
setAD_Language (null);
setAD_UserDef_Win_ID (0);
setAD_Window_ID (0);
setIsDefault (false);	
// N
setIsReadOnly (false);	
// N
setIsUserUpdateable (false);	
// N
setName (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_UserDef_Win (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=467 */
public static int Table_ID=MTable.getTable_ID("AD_UserDef_Win");

@XendraTrl(Identifier="10c759b8-b900-8674-b0a5-a4208b7ce923")
public static String es_PE_TAB_WindowCustomization_Name="Personalización de Ventana";

@XendraTab(Name="Window Customization",Description="",Help="",
AD_Window_ID="b1b1f4ea-07aa-32d8-5b9a-b3002bb6f98b",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="10c759b8-b900-8674-b0a5-a4208b7ce923",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_WindowCustomization="10c759b8-b900-8674-b0a5-a4208b7ce923";

@XendraTrl(Identifier="765ff7c1-718a-5a4e-f92c-6603f5cf84fb")
public static String es_PE_TABLE_AD_UserDef_Win_Name="Ventana Definida por el Usuario";


@XendraTable(Name="User defined Window",AD_Package_ID="140d4d0c-8da8-bcb6-9c20-bc776701f80c",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="AD_UserDef_Win",AccessLevel="6",AD_Window_ID="b1b1f4ea-07aa-32d8-5b9a-b3002bb6f98b",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=135,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.dictionary",
Identifier="765ff7c1-718a-5a4e-f92c-6603f5cf84fb",Synchronized="2020-03-03 21:36:05.0")
/** TableName=AD_UserDef_Win */
public static final String Table_Name="AD_UserDef_Win";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_UserDef_Win");

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
    Table_ID = MTable.getTable_ID("AD_UserDef_Win");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_UserDef_Win[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Language.
@param AD_Language Language for this entity */
public void setAD_Language (String AD_Language)
{
if (AD_Language.length() > 6)
{
log.warning("Length > 6 - truncated");
AD_Language = AD_Language.substring(0,5);
}
set_Value (COLUMNNAME_AD_Language, AD_Language);
}
/** Get Language.
@return Language for this entity */
public String getAD_Language() 
{
return (String)get_Value(COLUMNNAME_AD_Language);
}

@XendraTrl(Identifier="5835a63e-b164-4af6-635b-52997512e5a4")
public static String es_PE_FIELD_WindowCustomization_Language_Name="Lenguaje";

@XendraTrl(Identifier="5835a63e-b164-4af6-635b-52997512e5a4")
public static String es_PE_FIELD_WindowCustomization_Language_Description="Lenguaje para esta aplicación";

@XendraTrl(Identifier="5835a63e-b164-4af6-635b-52997512e5a4")
public static String es_PE_FIELD_WindowCustomization_Language_Help="El lenguaje identifica el lenguaje a usar para el despliegue";

@XendraField(AD_Column_ID="AD_Language",IsCentrallyMaintained=true,
AD_Tab_ID="10c759b8-b900-8674-b0a5-a4208b7ce923",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5835a63e-b164-4af6-635b-52997512e5a4")
public static final String FIELDNAME_WindowCustomization_Language="5835a63e-b164-4af6-635b-52997512e5a4";

@XendraTrl(Identifier="6fde8a8c-b8a4-607c-b5fd-bbeccb5eb212")
public static String es_PE_COLUMN_AD_Language_Name="Lenguaje";

@XendraColumn(AD_Element_ID="d542d9da-4627-0da8-89af-5797f22de434",ColumnName="AD_Language",
AD_Reference_ID=18,AD_Reference_Value_ID="136e26cd-6ffa-f76c-1e63-cce5ed2025b9",AD_Val_Rule_ID="",
FieldLength=6,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="6fde8a8c-b8a4-607c-b5fd-bbeccb5eb212",Synchronized="2019-08-30 22:20:48.0")
/** Column name AD_Language */
public static final String COLUMNNAME_AD_Language = "AD_Language";
/** Set Role.
@param AD_Role_ID Responsibility Role */
public void setAD_Role_ID (int AD_Role_ID)
{
if (AD_Role_ID <= 0) set_Value (COLUMNNAME_AD_Role_ID, null);
 else 
set_Value (COLUMNNAME_AD_Role_ID, Integer.valueOf(AD_Role_ID));
}
/** Get Role.
@return Responsibility Role */
public int getAD_Role_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Role_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="e694e85c-0b09-f549-62f9-6a9577c0259e")
public static String es_PE_FIELD_WindowCustomization_Role_Name="Rol";

@XendraTrl(Identifier="e694e85c-0b09-f549-62f9-6a9577c0259e")
public static String es_PE_FIELD_WindowCustomization_Role_Description="Rol de responsabilidad";

@XendraTrl(Identifier="e694e85c-0b09-f549-62f9-6a9577c0259e")
public static String es_PE_FIELD_WindowCustomization_Role_Help="El Rol determina la seguridad y acceso del usuario que posee este Rol";

@XendraField(AD_Column_ID="AD_Role_ID",IsCentrallyMaintained=true,
AD_Tab_ID="10c759b8-b900-8674-b0a5-a4208b7ce923",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e694e85c-0b09-f549-62f9-6a9577c0259e")
public static final String FIELDNAME_WindowCustomization_Role="e694e85c-0b09-f549-62f9-6a9577c0259e";

@XendraTrl(Identifier="6332850d-da75-8a30-4e3a-a91c447adf5a")
public static String es_PE_COLUMN_AD_Role_ID_Name="Rol";

@XendraColumn(AD_Element_ID="08ffb725-ea75-e55f-f4c5-67ac26f40e2b",ColumnName="AD_Role_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6332850d-da75-8a30-4e3a-a91c447adf5a",
Synchronized="2019-08-30 22:20:48.0")
/** Column name AD_Role_ID */
public static final String COLUMNNAME_AD_Role_ID = "AD_Role_ID";
/** Set User defined Window.
@param AD_UserDef_Win_ID User defined Window */
public void setAD_UserDef_Win_ID (int AD_UserDef_Win_ID)
{
if (AD_UserDef_Win_ID < 1) throw new IllegalArgumentException ("AD_UserDef_Win_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_UserDef_Win_ID, Integer.valueOf(AD_UserDef_Win_ID));
}
/** Get User defined Window.
@return User defined Window */
public int getAD_UserDef_Win_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_UserDef_Win_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="4642d03c-7218-63b1-1a23-64760e77d60a")
public static String es_PE_FIELD_WindowCustomization_UserDefinedWindow_Name="Ventana Definida por el Usuario";

@XendraField(AD_Column_ID="AD_UserDef_Win_ID",IsCentrallyMaintained=true,
AD_Tab_ID="10c759b8-b900-8674-b0a5-a4208b7ce923",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4642d03c-7218-63b1-1a23-64760e77d60a")
public static final String FIELDNAME_WindowCustomization_UserDefinedWindow="4642d03c-7218-63b1-1a23-64760e77d60a";
/** Column name AD_UserDef_Win_ID */
public static final String COLUMNNAME_AD_UserDef_Win_ID = "AD_UserDef_Win_ID";
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

@XendraTrl(Identifier="dcc393be-6849-9138-37c8-91596b3c65ee")
public static String es_PE_FIELD_WindowCustomization_UserContact_Name="Usuario";

@XendraTrl(Identifier="dcc393be-6849-9138-37c8-91596b3c65ee")
public static String es_PE_FIELD_WindowCustomization_UserContact_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="dcc393be-6849-9138-37c8-91596b3c65ee")
public static String es_PE_FIELD_WindowCustomization_UserContact_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="10c759b8-b900-8674-b0a5-a4208b7ce923",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="dcc393be-6849-9138-37c8-91596b3c65ee")
public static final String FIELDNAME_WindowCustomization_UserContact="dcc393be-6849-9138-37c8-91596b3c65ee";

@XendraTrl(Identifier="fa679f01-1a0b-ab45-87ae-4328a65659a3")
public static String es_PE_COLUMN_AD_User_ID_Name="Usuario";

@XendraColumn(AD_Element_ID="abdf8dee-d3cd-73ec-c758-683e907797f4",ColumnName="AD_User_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="-1",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fa679f01-1a0b-ab45-87ae-4328a65659a3",
Synchronized="2019-08-30 22:20:48.0")
/** Column name AD_User_ID */
public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";
/** Set Window.
@param AD_Window_ID Data entry or display window */
public void setAD_Window_ID (int AD_Window_ID)
{
if (AD_Window_ID < 1) throw new IllegalArgumentException ("AD_Window_ID is mandatory.");
set_Value (COLUMNNAME_AD_Window_ID, Integer.valueOf(AD_Window_ID));
}
/** Get Window.
@return Data entry or display window */
public int getAD_Window_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Window_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="e3ca1b7e-759e-b988-2642-3b0e7e177054")
public static String es_PE_FIELD_WindowCustomization_Window_Name="Ventana";

@XendraTrl(Identifier="e3ca1b7e-759e-b988-2642-3b0e7e177054")
public static String es_PE_FIELD_WindowCustomization_Window_Description="Ventana de entrada de datos ó despliegue";

@XendraTrl(Identifier="e3ca1b7e-759e-b988-2642-3b0e7e177054")
public static String es_PE_FIELD_WindowCustomization_Window_Help="El campo ventana identifica una ventana única en el sistema";

@XendraField(AD_Column_ID="AD_Window_ID",IsCentrallyMaintained=true,
AD_Tab_ID="10c759b8-b900-8674-b0a5-a4208b7ce923",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e3ca1b7e-759e-b988-2642-3b0e7e177054")
public static final String FIELDNAME_WindowCustomization_Window="e3ca1b7e-759e-b988-2642-3b0e7e177054";

@XendraTrl(Identifier="4e4d3884-f9db-5e52-e8bd-f3ff28833fa2")
public static String es_PE_COLUMN_AD_Window_ID_Name="Ventana";

@XendraColumn(AD_Element_ID="0c50cb0e-febe-8650-2621-11ba77688276",ColumnName="AD_Window_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4e4d3884-f9db-5e52-e8bd-f3ff28833fa2",
Synchronized="2019-08-30 22:20:48.0")
/** Column name AD_Window_ID */
public static final String COLUMNNAME_AD_Window_ID = "AD_Window_ID";
/** Set Description.
@param Description Optional short DESCRIPTION of the record */
public void setDescription (String Description)
{
if (Description != null && Description.length() > 255)
{
log.warning("Length > 255 - truncated");
Description = Description.substring(0,254);
}
set_Value (COLUMNNAME_Description, Description);
}
/** Get Description.
@return Optional short DESCRIPTION of the record */
public String getDescription() 
{
String value = (String)get_Value(COLUMNNAME_Description);
if (value == null)
  return "";
if (value.contains("\""))
  value = value.replaceAll("\"","'");
if (value.contains("\n"))
  value = value.replaceAll("\n"," ");
if (value.contains(";"))
  value = value.replaceAll(";",":");
return value;
}

@XendraTrl(Identifier="c80e0622-878d-04bd-4ec5-4b7c34a44831")
public static String es_PE_FIELD_WindowCustomization_Description_Name="Observación";

@XendraTrl(Identifier="c80e0622-878d-04bd-4ec5-4b7c34a44831")
public static String es_PE_FIELD_WindowCustomization_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="c80e0622-878d-04bd-4ec5-4b7c34a44831")
public static String es_PE_FIELD_WindowCustomization_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="10c759b8-b900-8674-b0a5-a4208b7ce923",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c80e0622-878d-04bd-4ec5-4b7c34a44831")
public static final String FIELDNAME_WindowCustomization_Description="c80e0622-878d-04bd-4ec5-4b7c34a44831";

@XendraTrl(Identifier="2d70a80c-cab1-2fcf-2e3f-5c8d3c250a16")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2d70a80c-cab1-2fcf-2e3f-5c8d3c250a16",
Synchronized="2019-08-30 22:20:48.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Comment/Help.
@param Help Comment or Hint */
public void setHelp (String Help)
{
set_Value (COLUMNNAME_Help, Help);
}
/** Get Comment/Help.
@return Comment or Hint */
public String getHelp() 
{
String value = (String)get_Value(COLUMNNAME_Help);
if (value == null)
  return "";
if (value.contains("\""))
  value = value.replaceAll("\"","'");
if (value.contains("\n"))
  value = value.replaceAll("\n"," ");
if (value.contains(";"))
  value = value.replaceAll(";",":");
return value;
}

@XendraTrl(Identifier="da11ee0b-6cb2-0a0d-f740-3294264d849b")
public static String es_PE_FIELD_WindowCustomization_CommentHelp_Name="Ayuda";

@XendraTrl(Identifier="da11ee0b-6cb2-0a0d-f740-3294264d849b")
public static String es_PE_FIELD_WindowCustomization_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="da11ee0b-6cb2-0a0d-f740-3294264d849b")
public static String es_PE_FIELD_WindowCustomization_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraField(AD_Column_ID="Help",IsCentrallyMaintained=true,
AD_Tab_ID="10c759b8-b900-8674-b0a5-a4208b7ce923",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="da11ee0b-6cb2-0a0d-f740-3294264d849b")
public static final String FIELDNAME_WindowCustomization_CommentHelp="da11ee0b-6cb2-0a0d-f740-3294264d849b";

@XendraTrl(Identifier="427480c0-9f96-5a76-1ef6-ce57cd949a8b")
public static String es_PE_COLUMN_Help_Name="Ayuda";

@XendraColumn(AD_Element_ID="a6fda582-56f9-6bb7-8436-285ce4f8de3f",ColumnName="Help",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="427480c0-9f96-5a76-1ef6-ce57cd949a8b",
Synchronized="2019-08-30 22:20:48.0")
/** Column name Help */
public static final String COLUMNNAME_Help = "Help";
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
@XendraTrl(Identifier="d9fe294e-32d4-452f-97e6-6d53defd20eb")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d9fe294e-32d4-452f-97e6-6d53defd20eb",
Synchronized="2019-08-30 22:20:48.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Default.
@param IsDefault Default value */
public void setIsDefault (boolean IsDefault)
{
set_Value (COLUMNNAME_IsDefault, Boolean.valueOf(IsDefault));
}
/** Get Default.
@return Default value */
public boolean isDefault() 
{
Object oo = get_Value(COLUMNNAME_IsDefault);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="f5241ea8-13ef-9321-b66c-c5bed0d3374f")
public static String es_PE_FIELD_WindowCustomization_Default_Name="Predeterminado";

@XendraTrl(Identifier="f5241ea8-13ef-9321-b66c-c5bed0d3374f")
public static String es_PE_FIELD_WindowCustomization_Default_Description="Valor Predeterminado";

@XendraTrl(Identifier="f5241ea8-13ef-9321-b66c-c5bed0d3374f")
public static String es_PE_FIELD_WindowCustomization_Default_Help="El cuadro de verificación indica si este registro será usado como un valor predeterminado";

@XendraField(AD_Column_ID="IsDefault",IsCentrallyMaintained=true,
AD_Tab_ID="10c759b8-b900-8674-b0a5-a4208b7ce923",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f5241ea8-13ef-9321-b66c-c5bed0d3374f")
public static final String FIELDNAME_WindowCustomization_Default="f5241ea8-13ef-9321-b66c-c5bed0d3374f";

@XendraTrl(Identifier="56ab866c-f41b-2fd2-43cb-d831dbe20dab")
public static String es_PE_COLUMN_IsDefault_Name="Predeterminado";

@XendraColumn(AD_Element_ID="8617f892-e113-a5fd-8715-687f792f136c",ColumnName="IsDefault",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="56ab866c-f41b-2fd2-43cb-d831dbe20dab",
Synchronized="2019-08-30 22:20:48.0")
/** Column name IsDefault */
public static final String COLUMNNAME_IsDefault = "IsDefault";
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

@XendraTrl(Identifier="0c09577c-dd6b-e645-f943-ec9512c74bb2")
public static String es_PE_FIELD_WindowCustomization_ReadOnly_Name="Sólo Lectura";

@XendraTrl(Identifier="0c09577c-dd6b-e645-f943-ec9512c74bb2")
public static String es_PE_FIELD_WindowCustomization_ReadOnly_Description="El campo es de sólo lectura";

@XendraTrl(Identifier="0c09577c-dd6b-e645-f943-ec9512c74bb2")
public static String es_PE_FIELD_WindowCustomization_ReadOnly_Help="El sólo lectura indica que este campo solamente puede ser leído. No puede ser actualizado.";

@XendraField(AD_Column_ID="IsReadOnly",IsCentrallyMaintained=true,
AD_Tab_ID="10c759b8-b900-8674-b0a5-a4208b7ce923",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0c09577c-dd6b-e645-f943-ec9512c74bb2")
public static final String FIELDNAME_WindowCustomization_ReadOnly="0c09577c-dd6b-e645-f943-ec9512c74bb2";

@XendraTrl(Identifier="b317894f-4c35-3993-bf14-f4b77c990128")
public static String es_PE_COLUMN_IsReadOnly_Name="Sólo Lectura";

@XendraColumn(AD_Element_ID="91b664da-9e5a-8ff7-2fef-8042ee7fb0c2",ColumnName="IsReadOnly",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b317894f-4c35-3993-bf14-f4b77c990128",
Synchronized="2019-08-30 22:20:48.0")
/** Column name IsReadOnly */
public static final String COLUMNNAME_IsReadOnly = "IsReadOnly";
/** Set User updateable.
@param IsUserUpdateable The field can be UPDATED by the user */
public void setIsUserUpdateable (boolean IsUserUpdateable)
{
set_Value (COLUMNNAME_IsUserUpdateable, Boolean.valueOf(IsUserUpdateable));
}
/** Get User updateable.
@return The field can be UPDATED by the user */
public boolean isUserUpdateable() 
{
Object oo = get_Value(COLUMNNAME_IsUserUpdateable);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="62de8a1d-cfaa-63db-6245-d78056e72745")
public static String es_PE_FIELD_WindowCustomization_UserUpdateable_Name="Usuario Actualizable";

@XendraTrl(Identifier="62de8a1d-cfaa-63db-6245-d78056e72745")
public static String es_PE_FIELD_WindowCustomization_UserUpdateable_Description="El campo puede ser actualizado por el usuario";

@XendraTrl(Identifier="62de8a1d-cfaa-63db-6245-d78056e72745")
public static String es_PE_FIELD_WindowCustomization_UserUpdateable_Help="El Cuadro de verificación actualizable por el usuario indica si el usuario puede actualizar este campo";

@XendraField(AD_Column_ID="IsUserUpdateable",IsCentrallyMaintained=true,
AD_Tab_ID="10c759b8-b900-8674-b0a5-a4208b7ce923",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="62de8a1d-cfaa-63db-6245-d78056e72745")
public static final String FIELDNAME_WindowCustomization_UserUpdateable="62de8a1d-cfaa-63db-6245-d78056e72745";

@XendraTrl(Identifier="9dfd4bdc-94f8-2439-6b14-4457a415a1fe")
public static String es_PE_COLUMN_IsUserUpdateable_Name="Usuario Actualizable";

@XendraColumn(AD_Element_ID="2bcc1270-2beb-285e-c478-d809f587521e",ColumnName="IsUserUpdateable",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9dfd4bdc-94f8-2439-6b14-4457a415a1fe",
Synchronized="2019-08-30 22:20:48.0")
/** Column name IsUserUpdateable */
public static final String COLUMNNAME_IsUserUpdateable = "IsUserUpdateable";
/** Set Name.
@param Name Alphanumeric identifier of the entity */
public void setName (String Name)
{
if (Name == null) throw new IllegalArgumentException ("Name is mandatory.");
if (Name.length() > 60)
{
log.warning("Length > 60 - truncated");
Name = Name.substring(0,59);
}
set_Value (COLUMNNAME_Name, Name);
}
/** Get Name.
@return Alphanumeric identifier of the entity */
public String getName() 
{
String value = (String)get_Value(COLUMNNAME_Name);
if (value == null)
  return "";
return value;
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), getName());
}

@XendraTrl(Identifier="3eb3a2c3-842f-35a5-a535-a3b5857d374e")
public static String es_PE_FIELD_WindowCustomization_Name_Name="Nombre";

@XendraTrl(Identifier="3eb3a2c3-842f-35a5-a535-a3b5857d374e")
public static String es_PE_FIELD_WindowCustomization_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="3eb3a2c3-842f-35a5-a535-a3b5857d374e")
public static String es_PE_FIELD_WindowCustomization_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="10c759b8-b900-8674-b0a5-a4208b7ce923",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=70,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3eb3a2c3-842f-35a5-a535-a3b5857d374e")
public static final String FIELDNAME_WindowCustomization_Name="3eb3a2c3-842f-35a5-a535-a3b5857d374e";

@XendraTrl(Identifier="90c03cf5-c019-98bf-2de0-a91da1fbc69e")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="90c03cf5-c019-98bf-2de0-a91da1fbc69e",
Synchronized="2019-08-30 22:20:48.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
}
