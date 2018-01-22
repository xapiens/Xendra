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
/** Generated Model for S_TimeType
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_S_TimeType extends PO
{
/** Standard Constructor
@param ctx context
@param S_TimeType_ID id
@param trxName transaction
*/
public X_S_TimeType (Properties ctx, int S_TimeType_ID, String trxName)
{
super (ctx, S_TimeType_ID, trxName);
/** if (S_TimeType_ID == 0)
{
setName (null);
setS_TimeType_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_S_TimeType (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=581 */
public static int Table_ID=MTable.getTable_ID("S_TimeType");

@XendraTrl(Identifier="211a0889-ca23-5843-757b-2503aeb657d5")
public static String es_PE_TAB_TimeType_Description="El tipo de tiempo registrado";

@XendraTrl(Identifier="211a0889-ca23-5843-757b-2503aeb657d5")
public static String es_PE_TAB_TimeType_Name="Tipo Hora";

@XendraTrl(Identifier="211a0889-ca23-5843-757b-2503aeb657d5")
public static String es_PE_TAB_TimeType_Help="Distinga los tipos del tiempo para reportar propósitos (en paralelo a las actividades).";

@XendraTab(Name="Time Type",Description="Type of Time recorded",
Help="Differentiate time types for reporting purposes (In parallel to Activities)",
AD_Window_ID="cf895669-ab03-6447-d4b1-efbc9b89e8a0",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="211a0889-ca23-5843-757b-2503aeb657d5",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_TimeType="211a0889-ca23-5843-757b-2503aeb657d5";

@XendraTrl(Identifier="b74d70cb-d055-3407-dddf-e19c877de1da")
public static String es_PE_TABLE_S_TimeType_Name="Tipo de Tiempo";

@XendraTable(Name="Time Type",Description="Type of time recorded",Help="",TableName="S_TimeType",
AccessLevel="3",AD_Window_ID="cf895669-ab03-6447-d4b1-efbc9b89e8a0",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=125,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.services",
Identifier="b74d70cb-d055-3407-dddf-e19c877de1da",Synchronized="2017-08-16 11:44:16.0")
/** TableName=S_TimeType */
public static final String Table_Name="S_TimeType";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"S_TimeType");

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
    Table_ID = MTable.getTable_ID("S_TimeType");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_S_TimeType[").append(get_ID()).append("]");
return sb.toString();
}
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

@XendraTrl(Identifier="24ee59f2-4fc1-96de-498a-8706cb9e4e51")
public static String es_PE_FIELD_TimeType_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="24ee59f2-4fc1-96de-498a-8706cb9e4e51")
public static String es_PE_FIELD_TimeType_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="24ee59f2-4fc1-96de-498a-8706cb9e4e51")
public static String es_PE_FIELD_TimeType_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="211a0889-ca23-5843-757b-2503aeb657d5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="24ee59f2-4fc1-96de-498a-8706cb9e4e51")
public static final String FIELDNAME_TimeType_Description="24ee59f2-4fc1-96de-498a-8706cb9e4e51";

@XendraTrl(Identifier="b934e06b-36c8-0c51-b061-07a80087f6c8")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b934e06b-36c8-0c51-b061-07a80087f6c8",
Synchronized="2017-08-05 16:56:21.0")
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

@XendraTrl(Identifier="10ce4c27-eb47-5dd9-5fd9-20f48d4564a7")
public static String es_PE_FIELD_TimeType_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="10ce4c27-eb47-5dd9-5fd9-20f48d4564a7")
public static String es_PE_FIELD_TimeType_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraTrl(Identifier="10ce4c27-eb47-5dd9-5fd9-20f48d4564a7")
public static String es_PE_FIELD_TimeType_CommentHelp_Name="Ayuda";

@XendraField(AD_Column_ID="Help",IsCentrallyMaintained=true,
AD_Tab_ID="211a0889-ca23-5843-757b-2503aeb657d5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="10ce4c27-eb47-5dd9-5fd9-20f48d4564a7")
public static final String FIELDNAME_TimeType_CommentHelp="10ce4c27-eb47-5dd9-5fd9-20f48d4564a7";

@XendraTrl(Identifier="d76d0f41-d318-9d21-710c-4c3157518955")
public static String es_PE_COLUMN_Help_Name="Ayuda";

@XendraColumn(AD_Element_ID="a6fda582-56f9-6bb7-8436-285ce4f8de3f",ColumnName="Help",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d76d0f41-d318-9d21-710c-4c3157518955",
Synchronized="2017-08-05 16:56:21.0")
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
@XendraTrl(Identifier="32cc5a9b-8f75-4fe9-b784-7100007fd230")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="32cc5a9b-8f75-4fe9-b784-7100007fd230",
Synchronized="2017-08-05 16:56:21.0")
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

@XendraTrl(Identifier="c6652648-bf60-5b5f-4a88-dab5c3003e0a")
public static String es_PE_FIELD_TimeType_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="c6652648-bf60-5b5f-4a88-dab5c3003e0a")
public static String es_PE_FIELD_TimeType_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="c6652648-bf60-5b5f-4a88-dab5c3003e0a")
public static String es_PE_FIELD_TimeType_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="211a0889-ca23-5843-757b-2503aeb657d5",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=1,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="c6652648-bf60-5b5f-4a88-dab5c3003e0a")
public static final String FIELDNAME_TimeType_Name="c6652648-bf60-5b5f-4a88-dab5c3003e0a";

@XendraTrl(Identifier="5035193f-b4be-4e2f-4864-f31fd6b02ca8")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5035193f-b4be-4e2f-4864-f31fd6b02ca8",
Synchronized="2017-08-05 16:56:21.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Time Type.
@param S_TimeType_ID Type of time recorded */
public void setS_TimeType_ID (int S_TimeType_ID)
{
if (S_TimeType_ID < 1) throw new IllegalArgumentException ("S_TimeType_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_S_TimeType_ID, Integer.valueOf(S_TimeType_ID));
}
/** Get Time Type.
@return Type of time recorded */
public int getS_TimeType_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_S_TimeType_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="0d4168b2-368f-6598-8660-fc7ee1108304")
public static String es_PE_FIELD_TimeType_TimeType_Description="Registro del tipo de tiempo";

@XendraTrl(Identifier="0d4168b2-368f-6598-8660-fc7ee1108304")
public static String es_PE_FIELD_TimeType_TimeType_Help="Diferencia de tipos de tiempo para reportar propositos (en paralelo a las actividades)";

@XendraTrl(Identifier="0d4168b2-368f-6598-8660-fc7ee1108304")
public static String es_PE_FIELD_TimeType_TimeType_Name="Tipo de Tiempo";

@XendraField(AD_Column_ID="S_TimeType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="211a0889-ca23-5843-757b-2503aeb657d5",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0d4168b2-368f-6598-8660-fc7ee1108304")
public static final String FIELDNAME_TimeType_TimeType="0d4168b2-368f-6598-8660-fc7ee1108304";
/** Column name S_TimeType_ID */
public static final String COLUMNNAME_S_TimeType_ID = "S_TimeType_ID";
}
