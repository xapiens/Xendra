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
/** Generated Model for C_Channel
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_Channel extends PO
{
/** Standard Constructor
@param ctx context
@param C_Channel_ID id
@param trxName transaction
*/
public X_C_Channel (Properties ctx, int C_Channel_ID, String trxName)
{
super (ctx, C_Channel_ID, trxName);
/** if (C_Channel_ID == 0)
{
setC_Channel_ID (0);
setName (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_Channel (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=275 */
public static int Table_ID=MTable.getTable_ID("C_Channel");

@XendraTrl(Identifier="8a5ef2d1-7e82-9808-e31a-cc75eb3f92a7")
public static String es_PE_TAB_Channel_Description="Canal de Distribución";

@XendraTrl(Identifier="8a5ef2d1-7e82-9808-e31a-cc75eb3f92a7")
public static String es_PE_TAB_Channel_Name="Canal";

@XendraTrl(Identifier="8a5ef2d1-7e82-9808-e31a-cc75eb3f92a7")
public static String es_PE_TAB_Channel_Help="La pestaña de Canal de Mercadeo define los métodos ó procesos a través de los cuales los clientes son captados.";

@XendraTab(Name="Channel",Description="Distribution Channel",
Help="The Marketing Channel Tab defines the different methods or processes through which customers are obtained.",
AD_Window_ID="c21068e9-ad16-773a-791b-5cb31b479a1a",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="8a5ef2d1-7e82-9808-e31a-cc75eb3f92a7",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Channel="8a5ef2d1-7e82-9808-e31a-cc75eb3f92a7";

@XendraTrl(Identifier="b6853496-07c4-077f-047a-f579419b1784")
public static String es_PE_TABLE_C_Channel_Name="Canal";

@XendraTable(Name="Channel",Description="Sales Channel",Help="",TableName="C_Channel",
AccessLevel="3",AD_Window_ID="c21068e9-ad16-773a-791b-5cb31b479a1a",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=90,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="b6853496-07c4-077f-047a-f579419b1784",Synchronized="2017-08-16 11:41:37.0")
/** TableName=C_Channel */
public static final String Table_Name="C_Channel";


@XendraIndex(Name="c_channel_name",Identifier="bd1fbb4e-ddf0-ac06-da14-e5f40b7e20ab",
Column_Names="ad_client_id, name",IsUnique="true",
TableIdentifier="bd1fbb4e-ddf0-ac06-da14-e5f40b7e20ab",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_c_channel_name = "bd1fbb4e-ddf0-ac06-da14-e5f40b7e20ab";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_Channel");

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
    Table_ID = MTable.getTable_ID("C_Channel");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_Channel[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Print Color.
@param AD_PrintColor_ID Color used for printing and display */
public void setAD_PrintColor_ID (int AD_PrintColor_ID)
{
if (AD_PrintColor_ID <= 0) set_Value (COLUMNNAME_AD_PrintColor_ID, null);
 else 
set_Value (COLUMNNAME_AD_PrintColor_ID, Integer.valueOf(AD_PrintColor_ID));
}
/** Get Print Color.
@return Color used for printing and display */
public int getAD_PrintColor_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_PrintColor_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="6b26fdeb-1826-0d34-4f9e-81acd7699698")
public static String es_PE_FIELD_Channel_PrintColor_Description="Color usado para imprimir";

@XendraTrl(Identifier="6b26fdeb-1826-0d34-4f9e-81acd7699698")
public static String es_PE_FIELD_Channel_PrintColor_Help="Color usado para imprimir";

@XendraTrl(Identifier="6b26fdeb-1826-0d34-4f9e-81acd7699698")
public static String es_PE_FIELD_Channel_PrintColor_Name="Impresión a Color";

@XendraField(AD_Column_ID="AD_PrintColor_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8a5ef2d1-7e82-9808-e31a-cc75eb3f92a7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6b26fdeb-1826-0d34-4f9e-81acd7699698")
public static final String FIELDNAME_Channel_PrintColor="6b26fdeb-1826-0d34-4f9e-81acd7699698";

@XendraTrl(Identifier="4f02bd84-976f-683f-c804-cd69c8d62d62")
public static String es_PE_COLUMN_AD_PrintColor_ID_Name="Impresión a Color";

@XendraColumn(AD_Element_ID="fa351bf7-0efd-2c6a-da0b-f514d630b8e6",ColumnName="AD_PrintColor_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4f02bd84-976f-683f-c804-cd69c8d62d62",
Synchronized="2017-08-05 16:53:29.0")
/** Column name AD_PrintColor_ID */
public static final String COLUMNNAME_AD_PrintColor_ID = "AD_PrintColor_ID";
/** Set Channel.
@param C_Channel_ID Sales Channel */
public void setC_Channel_ID (int C_Channel_ID)
{
if (C_Channel_ID < 1) throw new IllegalArgumentException ("C_Channel_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_Channel_ID, Integer.valueOf(C_Channel_ID));
}
/** Get Channel.
@return Sales Channel */
public int getC_Channel_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Channel_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="90271890-8f67-f3fe-7a8c-169159d36fc1")
public static String es_PE_FIELD_Channel_Channel_Description="Canal de Ventas";

@XendraTrl(Identifier="90271890-8f67-f3fe-7a8c-169159d36fc1")
public static String es_PE_FIELD_Channel_Channel_Help="El Canal de Ventas identifica un canal (o método) de generación de ventas";

@XendraTrl(Identifier="90271890-8f67-f3fe-7a8c-169159d36fc1")
public static String es_PE_FIELD_Channel_Channel_Name="Canal";

@XendraField(AD_Column_ID="C_Channel_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8a5ef2d1-7e82-9808-e31a-cc75eb3f92a7",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="90271890-8f67-f3fe-7a8c-169159d36fc1")
public static final String FIELDNAME_Channel_Channel="90271890-8f67-f3fe-7a8c-169159d36fc1";
/** Column name C_Channel_ID */
public static final String COLUMNNAME_C_Channel_ID = "C_Channel_ID";
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

@XendraTrl(Identifier="5ea170f5-2e07-a0d6-d79b-fef3c3117686")
public static String es_PE_FIELD_Channel_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="5ea170f5-2e07-a0d6-d79b-fef3c3117686")
public static String es_PE_FIELD_Channel_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="5ea170f5-2e07-a0d6-d79b-fef3c3117686")
public static String es_PE_FIELD_Channel_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="8a5ef2d1-7e82-9808-e31a-cc75eb3f92a7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5ea170f5-2e07-a0d6-d79b-fef3c3117686")
public static final String FIELDNAME_Channel_Description="5ea170f5-2e07-a0d6-d79b-fef3c3117686";

@XendraTrl(Identifier="b849a1a9-eaf2-d5d6-4c98-2431d471ea48")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b849a1a9-eaf2-d5d6-4c98-2431d471ea48",
Synchronized="2017-08-05 16:53:29.0")
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
@XendraTrl(Identifier="f88e29bc-7dcf-427b-97e8-14ff6e03215d")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f88e29bc-7dcf-427b-97e8-14ff6e03215d",
Synchronized="2017-08-05 16:53:29.0")
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

@XendraTrl(Identifier="62f76197-abe9-d77d-e66c-06c2c047ec51")
public static String es_PE_FIELD_Channel_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="62f76197-abe9-d77d-e66c-06c2c047ec51")
public static String es_PE_FIELD_Channel_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="62f76197-abe9-d77d-e66c-06c2c047ec51")
public static String es_PE_FIELD_Channel_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="8a5ef2d1-7e82-9808-e31a-cc75eb3f92a7",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=1,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="62f76197-abe9-d77d-e66c-06c2c047ec51")
public static final String FIELDNAME_Channel_Name="62f76197-abe9-d77d-e66c-06c2c047ec51";

@XendraTrl(Identifier="cea492ec-ef5c-633f-6701-75120796aa5f")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cea492ec-ef5c-633f-6701-75120796aa5f",
Synchronized="2017-08-05 16:53:29.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
}
