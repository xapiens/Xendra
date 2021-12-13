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
/** Generated Model for C_POSKeyLayout
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: X_C_POSKeyLayout.java 7157 2020-03-11 05:24:14Z xapiens $ */
public class X_C_POSKeyLayout extends PO
{
/** Standard Constructor
@param ctx context
@param C_POSKeyLayout_ID id
@param trxName transaction
*/
public X_C_POSKeyLayout (Properties ctx, int C_POSKeyLayout_ID, String trxName)
{
super (ctx, C_POSKeyLayout_ID, trxName);
/** if (C_POSKeyLayout_ID == 0)
{
setC_POSKeyLayout_ID (0);
setName (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_POSKeyLayout (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=749 */
public static int Table_ID=MTable.getTable_ID("C_POSKeyLayout");

@XendraTrl(Identifier="1a7e5138-7c78-6eb4-ceba-958bc3a9f4d2")
public static String es_PE_TAB_POSKeyLayout_Description="Función PV Función de llave de Layout";

@XendraTrl(Identifier="1a7e5138-7c78-6eb4-ceba-958bc3a9f4d2")
public static String es_PE_TAB_POSKeyLayout_Help="Función PV Función de llave de Layout";

@XendraTrl(Identifier="1a7e5138-7c78-6eb4-ceba-958bc3a9f4d2")
public static String es_PE_TAB_POSKeyLayout_Name="Llave de disposicion de PDV";

@XendraTab(Name="POS Key Layout",Description="POS Function Key Layout",
Help="POS Function Key Layout",AD_Window_ID="d83bb7aa-6c36-6465-c0b7-09482af4d6cf",SeqNo=10,
TabLevel=0,IsSingleRow=true,IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="",HasTree=false,WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",
AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",
ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="1a7e5138-7c78-6eb4-ceba-958bc3a9f4d2",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_POSKeyLayout="1a7e5138-7c78-6eb4-ceba-958bc3a9f4d2";

@XendraTrl(Identifier="290ba75a-ebee-86d5-360b-7b1dc643d04a")
public static String es_PE_TABLE_C_POSKeyLayout_Name="PDV Disposición de la llave";

@XendraTable(Name="POS Key Layout",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="POS Function Key Layout",Help="",
TableName="C_POSKeyLayout",AccessLevel="2",AD_Window_ID="d83bb7aa-6c36-6465-c0b7-09482af4d6cf",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=140,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="290ba75a-ebee-86d5-360b-7b1dc643d04a",Synchronized="2020-03-03 21:37:28.0")
/** TableName=C_POSKeyLayout */
public static final String Table_Name="C_POSKeyLayout";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_POSKeyLayout");

protected BigDecimal accessLevel = BigDecimal.valueOf(2);
/** AccessLevel
@return 2 - Client 
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
    Table_ID = MTable.getTable_ID("C_POSKeyLayout");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_POSKeyLayout[").append(get_ID()).append("]");
return sb.toString();
}
/** Set POS Key Layout.
@param C_POSKeyLayout_ID POS Function Key Layout */
public void setC_POSKeyLayout_ID (int C_POSKeyLayout_ID)
{
if (C_POSKeyLayout_ID < 1) throw new IllegalArgumentException ("C_POSKeyLayout_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_POSKeyLayout_ID, Integer.valueOf(C_POSKeyLayout_ID));
}
/** Get POS Key Layout.
@return POS Function Key Layout */
public int getC_POSKeyLayout_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_POSKeyLayout_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="4ca39d49-d1e7-f0ed-45d1-b58758434cde")
public static String es_PE_FIELD_POSKeyLayout_POSKeyLayout_Name="PDV Disposición de la llave";

@XendraTrl(Identifier="4ca39d49-d1e7-f0ed-45d1-b58758434cde")
public static String es_PE_FIELD_POSKeyLayout_POSKeyLayout_Description="Disposición de la llave de funcionamiento PDV";

@XendraTrl(Identifier="4ca39d49-d1e7-f0ed-45d1-b58758434cde")
public static String es_PE_FIELD_POSKeyLayout_POSKeyLayout_Help="Disposición de la llave de funcionamiento PDV";

@XendraField(AD_Column_ID="C_POSKeyLayout_ID",IsCentrallyMaintained=true,
AD_Tab_ID="1a7e5138-7c78-6eb4-ceba-958bc3a9f4d2",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4ca39d49-d1e7-f0ed-45d1-b58758434cde")
public static final String FIELDNAME_POSKeyLayout_POSKeyLayout="4ca39d49-d1e7-f0ed-45d1-b58758434cde";
/** Column name C_POSKeyLayout_ID */
public static final String COLUMNNAME_C_POSKeyLayout_ID = "C_POSKeyLayout_ID";
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

@XendraTrl(Identifier="0653c22f-29ab-5adc-f9fb-1c446acf4386")
public static String es_PE_FIELD_POSKeyLayout_Description_Name="Observación";

@XendraTrl(Identifier="0653c22f-29ab-5adc-f9fb-1c446acf4386")
public static String es_PE_FIELD_POSKeyLayout_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="0653c22f-29ab-5adc-f9fb-1c446acf4386")
public static String es_PE_FIELD_POSKeyLayout_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="1a7e5138-7c78-6eb4-ceba-958bc3a9f4d2",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0653c22f-29ab-5adc-f9fb-1c446acf4386")
public static final String FIELDNAME_POSKeyLayout_Description="0653c22f-29ab-5adc-f9fb-1c446acf4386";

@XendraTrl(Identifier="efa67c26-2dcb-167a-c0fc-fccbb4767dfd")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="efa67c26-2dcb-167a-c0fc-fccbb4767dfd",
Synchronized="2019-08-30 22:22:05.0")
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

@XendraTrl(Identifier="692da999-7f0f-d65f-67ee-32cf9beb473c")
public static String es_PE_FIELD_POSKeyLayout_CommentHelp_Name="Ayuda";

@XendraTrl(Identifier="692da999-7f0f-d65f-67ee-32cf9beb473c")
public static String es_PE_FIELD_POSKeyLayout_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="692da999-7f0f-d65f-67ee-32cf9beb473c")
public static String es_PE_FIELD_POSKeyLayout_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraField(AD_Column_ID="Help",IsCentrallyMaintained=true,
AD_Tab_ID="1a7e5138-7c78-6eb4-ceba-958bc3a9f4d2",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="692da999-7f0f-d65f-67ee-32cf9beb473c")
public static final String FIELDNAME_POSKeyLayout_CommentHelp="692da999-7f0f-d65f-67ee-32cf9beb473c";

@XendraTrl(Identifier="b0f832b1-4356-29fa-b064-e284d7aa7d63")
public static String es_PE_COLUMN_Help_Name="Ayuda";

@XendraColumn(AD_Element_ID="a6fda582-56f9-6bb7-8436-285ce4f8de3f",ColumnName="Help",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b0f832b1-4356-29fa-b064-e284d7aa7d63",
Synchronized="2019-08-30 22:22:05.0")
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
@XendraTrl(Identifier="35dba984-12b3-40c3-ac43-38bb9376a5a2")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="35dba984-12b3-40c3-ac43-38bb9376a5a2",
Synchronized="2019-08-30 22:22:05.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
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

@XendraTrl(Identifier="b60cfc5a-0a70-bc46-ba0a-caa030a07788")
public static String es_PE_FIELD_POSKeyLayout_Name_Name="Nombre";

@XendraTrl(Identifier="b60cfc5a-0a70-bc46-ba0a-caa030a07788")
public static String es_PE_FIELD_POSKeyLayout_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="b60cfc5a-0a70-bc46-ba0a-caa030a07788")
public static String es_PE_FIELD_POSKeyLayout_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="1a7e5138-7c78-6eb4-ceba-958bc3a9f4d2",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=30,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b60cfc5a-0a70-bc46-ba0a-caa030a07788")
public static final String FIELDNAME_POSKeyLayout_Name="b60cfc5a-0a70-bc46-ba0a-caa030a07788";

@XendraTrl(Identifier="fcbad89f-ecc7-6e5d-b831-230be0c73adf")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fcbad89f-ecc7-6e5d-b831-230be0c73adf",
Synchronized="2019-08-30 22:22:05.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
}
