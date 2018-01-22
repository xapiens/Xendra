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
/** Generated Model for B_Seller
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_B_Seller extends PO
{
/** Standard Constructor
@param ctx context
@param B_Seller_ID id
@param trxName transaction
*/
public X_B_Seller (Properties ctx, int B_Seller_ID, String trxName)
{
super (ctx, B_Seller_ID, trxName);
/** if (B_Seller_ID == 0)
{
setAD_User_ID (0);
setIsInternal (false);	
// N
setName (null);
setValidTo (new Timestamp(System.currentTimeMillis()));
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_B_Seller (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=681 */
public static int Table_ID=MTable.getTable_ID("B_Seller");

@XendraTrl(Identifier="dc0474b7-38de-6dfe-ea9b-8e6516147e83")
public static String es_PE_TAB_Seller_Description="Información del vendedor.";

@XendraTrl(Identifier="dc0474b7-38de-6dfe-ea9b-8e6516147e83")
public static String es_PE_TAB_Seller_Name="Vendedor";

@XendraTrl(Identifier="dc0474b7-38de-6dfe-ea9b-8e6516147e83")
public static String es_PE_TAB_Seller_Help="Información sobre un participante en una subasta como vendedor.";

@XendraTab(Name="Seller",Description="Aution Seller Information",
Help="Information about a participant in an Auction as a Seller",
AD_Window_ID="45a49f39-e720-7227-5a91-7c0178b269a7",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="dc0474b7-38de-6dfe-ea9b-8e6516147e83",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Seller="dc0474b7-38de-6dfe-ea9b-8e6516147e83";

@XendraTrl(Identifier="70ba9a44-6bc6-da69-8300-5d0889ed3963")
public static String es_PE_TABLE_B_Seller_Name="B_Seller";

@XendraTable(Name="B_Seller",Description="",Help="",TableName="B_Seller",AccessLevel="3",
AD_Window_ID="45a49f39-e720-7227-5a91-7c0178b269a7",AD_Val_Rule_ID="",IsKey=0,LoadSeq=135,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.bids",Identifier="70ba9a44-6bc6-da69-8300-5d0889ed3963",
Synchronized="2017-08-16 11:41:16.0")
/** TableName=B_Seller */
public static final String Table_Name="B_Seller";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"B_Seller");

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
    Table_ID = MTable.getTable_ID("B_Seller");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_B_Seller[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="eeca5e52-4782-577b-4aec-7f01f3050916")
public static String es_PE_FIELD_Seller_UserContact_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="eeca5e52-4782-577b-4aec-7f01f3050916")
public static String es_PE_FIELD_Seller_UserContact_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraTrl(Identifier="eeca5e52-4782-577b-4aec-7f01f3050916")
public static String es_PE_FIELD_Seller_UserContact_Name="Usuario";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="dc0474b7-38de-6dfe-ea9b-8e6516147e83",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="eeca5e52-4782-577b-4aec-7f01f3050916")
public static final String FIELDNAME_Seller_UserContact="eeca5e52-4782-577b-4aec-7f01f3050916";

@XendraTrl(Identifier="48bed4e9-d1f3-9654-162c-ac0934b1f1df")
public static String es_PE_COLUMN_AD_User_ID_Name="Usuario";

@XendraColumn(AD_Element_ID="abdf8dee-d3cd-73ec-c758-683e907797f4",ColumnName="AD_User_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="48bed4e9-d1f3-9654-162c-ac0934b1f1df",
Synchronized="2017-08-05 16:53:07.0")
/** Column name AD_User_ID */
public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";
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

@XendraTrl(Identifier="f0a5da6b-b4e0-f258-a56e-b5aaa5a2192f")
public static String es_PE_FIELD_Seller_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="f0a5da6b-b4e0-f258-a56e-b5aaa5a2192f")
public static String es_PE_FIELD_Seller_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="f0a5da6b-b4e0-f258-a56e-b5aaa5a2192f")
public static String es_PE_FIELD_Seller_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="dc0474b7-38de-6dfe-ea9b-8e6516147e83",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f0a5da6b-b4e0-f258-a56e-b5aaa5a2192f")
public static final String FIELDNAME_Seller_Description="f0a5da6b-b4e0-f258-a56e-b5aaa5a2192f";

@XendraTrl(Identifier="c76422fb-560d-84a6-cd4a-a777561eaa34")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c76422fb-560d-84a6-cd4a-a777561eaa34",
Synchronized="2017-08-05 16:53:07.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
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
@XendraTrl(Identifier="d8b9a6e0-0252-458c-9a65-f756075926bc")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d8b9a6e0-0252-458c-9a65-f756075926bc",
Synchronized="2017-08-05 16:53:07.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Internal.
@param IsInternal Internal Organization */
public void setIsInternal (boolean IsInternal)
{
set_Value (COLUMNNAME_IsInternal, Boolean.valueOf(IsInternal));
}
/** Get Internal.
@return Internal Organization */
public boolean isInternal() 
{
Object oo = get_Value(COLUMNNAME_IsInternal);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="c814ce77-ac6f-c5ac-2006-04ff4dd0b409")
public static String es_PE_FIELD_Seller_Internal_Description="Organización Interna";

@XendraTrl(Identifier="c814ce77-ac6f-c5ac-2006-04ff4dd0b409")
public static String es_PE_FIELD_Seller_Internal_Name="Interna";

@XendraField(AD_Column_ID="IsInternal",IsCentrallyMaintained=true,
AD_Tab_ID="dc0474b7-38de-6dfe-ea9b-8e6516147e83",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c814ce77-ac6f-c5ac-2006-04ff4dd0b409")
public static final String FIELDNAME_Seller_Internal="c814ce77-ac6f-c5ac-2006-04ff4dd0b409";

@XendraTrl(Identifier="9050cc6f-c210-084e-227b-eec5e5eaa476")
public static String es_PE_COLUMN_IsInternal_Name="Interna";

@XendraColumn(AD_Element_ID="004cc0f1-7de2-4eed-7a23-4c529f432c47",ColumnName="IsInternal",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9050cc6f-c210-084e-227b-eec5e5eaa476",
Synchronized="2017-08-05 16:53:07.0")
/** Column name IsInternal */
public static final String COLUMNNAME_IsInternal = "IsInternal";
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

@XendraTrl(Identifier="9d0f57d5-cb87-9b82-3d65-6d2c1ff8e1e2")
public static String es_PE_FIELD_Seller_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="9d0f57d5-cb87-9b82-3d65-6d2c1ff8e1e2")
public static String es_PE_FIELD_Seller_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="9d0f57d5-cb87-9b82-3d65-6d2c1ff8e1e2")
public static String es_PE_FIELD_Seller_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="dc0474b7-38de-6dfe-ea9b-8e6516147e83",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=1,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="9d0f57d5-cb87-9b82-3d65-6d2c1ff8e1e2")
public static final String FIELDNAME_Seller_Name="9d0f57d5-cb87-9b82-3d65-6d2c1ff8e1e2";

@XendraTrl(Identifier="eaddef1d-e891-99bc-1aa8-a207c35d8c91")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="eaddef1d-e891-99bc-1aa8-a207c35d8c91",
Synchronized="2017-08-05 16:53:07.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Valid to.
@param ValidTo Valid to including this date (last day) */
public void setValidTo (Timestamp ValidTo)
{
if (ValidTo == null) throw new IllegalArgumentException ("ValidTo is mandatory.");
set_Value (COLUMNNAME_ValidTo, ValidTo);
}
/** Get Valid to.
@return Valid to including this date (last day) */
public Timestamp getValidTo() 
{
return (Timestamp)get_Value(COLUMNNAME_ValidTo);
}

@XendraTrl(Identifier="4e693515-1c1e-e0e6-a507-e0cecc1003dd")
public static String es_PE_FIELD_Seller_ValidTo_Description="Válido hasta; incluyendo esta fecha (ultimo día)";

@XendraTrl(Identifier="4e693515-1c1e-e0e6-a507-e0cecc1003dd")
public static String es_PE_FIELD_Seller_ValidTo_Help="La fecha válida hasta indica el último día de un rango de fechas";

@XendraTrl(Identifier="4e693515-1c1e-e0e6-a507-e0cecc1003dd")
public static String es_PE_FIELD_Seller_ValidTo_Name="Válido Hasta";

@XendraField(AD_Column_ID="ValidTo",IsCentrallyMaintained=true,
AD_Tab_ID="dc0474b7-38de-6dfe-ea9b-8e6516147e83",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4e693515-1c1e-e0e6-a507-e0cecc1003dd")
public static final String FIELDNAME_Seller_ValidTo="4e693515-1c1e-e0e6-a507-e0cecc1003dd";

@XendraTrl(Identifier="e30e8a79-05ae-02f8-4c4f-59b2ad0eb822")
public static String es_PE_COLUMN_ValidTo_Name="Válido Hasta";

@XendraColumn(AD_Element_ID="0fbe43c3-c76d-0505-0043-63adb568a68f",ColumnName="ValidTo",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e30e8a79-05ae-02f8-4c4f-59b2ad0eb822",
Synchronized="2017-08-05 16:53:07.0")
/** Column name ValidTo */
public static final String COLUMNNAME_ValidTo = "ValidTo";
}
