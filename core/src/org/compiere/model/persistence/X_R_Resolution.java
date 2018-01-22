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
/** Generated Model for R_Resolution
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_R_Resolution extends PO
{
/** Standard Constructor
@param ctx context
@param R_Resolution_ID id
@param trxName transaction
*/
public X_R_Resolution (Properties ctx, int R_Resolution_ID, String trxName)
{
super (ctx, R_Resolution_ID, trxName);
/** if (R_Resolution_ID == 0)
{
setName (null);
setR_Resolution_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_R_Resolution (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=774 */
public static int Table_ID=MTable.getTable_ID("R_Resolution");

@XendraTrl(Identifier="6724cc79-1f58-b31a-2ff8-507d7a14e1b5")
public static String es_PE_TAB_RequestResolution_Description="Mantener respuesta de solicitud ";

@XendraTrl(Identifier="6724cc79-1f58-b31a-2ff8-507d7a14e1b5")
public static String es_PE_TAB_RequestResolution_Name="Respuesta de Solicitud";

@XendraTrl(Identifier="6724cc79-1f58-b31a-2ff8-507d7a14e1b5")
public static String es_PE_TAB_RequestResolution_Help="Estado de la respuesta (ej. fijo, rechazado..)";

@XendraTab(Name="Request Resolution",Description="Maintain Request Resolutions",
Help="Resolution status (e.g. Fixed, Rejected, ..)",
AD_Window_ID="f52d5f04-e984-2510-2215-f3498a31d58b",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="6724cc79-1f58-b31a-2ff8-507d7a14e1b5",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_RequestResolution="6724cc79-1f58-b31a-2ff8-507d7a14e1b5";

@XendraTrl(Identifier="b2fa71fb-0b65-4350-0b36-1e78d883c6e9")
public static String es_PE_TABLE_R_Resolution_Name="Resolución";

@XendraTable(Name="Resolution",Description="Request Resolution",Help="",TableName="R_Resolution",
AccessLevel="6",AD_Window_ID="f52d5f04-e984-2510-2215-f3498a31d58b",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=130,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.standard",
Identifier="b2fa71fb-0b65-4350-0b36-1e78d883c6e9",Synchronized="2017-08-16 11:43:53.0")
/** TableName=R_Resolution */
public static final String Table_Name="R_Resolution";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"R_Resolution");

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
    Table_ID = MTable.getTable_ID("R_Resolution");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_R_Resolution[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="f27f83e8-5d77-421a-5136-d234769f7564")
public static String es_PE_FIELD_RequestResolution_Description_Description="Observación";

@XendraTrl(Identifier="f27f83e8-5d77-421a-5136-d234769f7564")
public static String es_PE_FIELD_RequestResolution_Description_Help="Observación";

@XendraTrl(Identifier="f27f83e8-5d77-421a-5136-d234769f7564")
public static String es_PE_FIELD_RequestResolution_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="6724cc79-1f58-b31a-2ff8-507d7a14e1b5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f27f83e8-5d77-421a-5136-d234769f7564")
public static final String FIELDNAME_RequestResolution_Description="f27f83e8-5d77-421a-5136-d234769f7564";

@XendraTrl(Identifier="fb460db5-fe1c-0225-a862-cabe32097eff")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fb460db5-fe1c-0225-a862-cabe32097eff",
Synchronized="2017-08-05 16:55:59.0")
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

@XendraTrl(Identifier="08be3639-08ff-ba4f-fad1-c79163dde0f9")
public static String es_PE_FIELD_RequestResolution_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="08be3639-08ff-ba4f-fad1-c79163dde0f9")
public static String es_PE_FIELD_RequestResolution_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraTrl(Identifier="08be3639-08ff-ba4f-fad1-c79163dde0f9")
public static String es_PE_FIELD_RequestResolution_CommentHelp_Name="Ayuda";

@XendraField(AD_Column_ID="Help",IsCentrallyMaintained=true,
AD_Tab_ID="6724cc79-1f58-b31a-2ff8-507d7a14e1b5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="08be3639-08ff-ba4f-fad1-c79163dde0f9")
public static final String FIELDNAME_RequestResolution_CommentHelp="08be3639-08ff-ba4f-fad1-c79163dde0f9";

@XendraTrl(Identifier="d0408e6e-12ea-3c8c-b406-5f897c23c08b")
public static String es_PE_COLUMN_Help_Name="Ayuda";

@XendraColumn(AD_Element_ID="a6fda582-56f9-6bb7-8436-285ce4f8de3f",ColumnName="Help",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d0408e6e-12ea-3c8c-b406-5f897c23c08b",
Synchronized="2017-08-05 16:55:59.0")
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
@XendraTrl(Identifier="2e12d21e-2dc6-45f1-b21a-c7134da39b93")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2e12d21e-2dc6-45f1-b21a-c7134da39b93",
Synchronized="2017-08-05 16:55:59.0")
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

@XendraTrl(Identifier="09236d94-32f7-4b58-fecd-b2bbfa5fd7ac")
public static String es_PE_FIELD_RequestResolution_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="09236d94-32f7-4b58-fecd-b2bbfa5fd7ac")
public static String es_PE_FIELD_RequestResolution_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="09236d94-32f7-4b58-fecd-b2bbfa5fd7ac")
public static String es_PE_FIELD_RequestResolution_Name_Name="Nombre";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="6724cc79-1f58-b31a-2ff8-507d7a14e1b5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=30,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="09236d94-32f7-4b58-fecd-b2bbfa5fd7ac")
public static final String FIELDNAME_RequestResolution_Name="09236d94-32f7-4b58-fecd-b2bbfa5fd7ac";

@XendraTrl(Identifier="ffe17772-70ae-737e-5c96-f8541e5c8759")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ffe17772-70ae-737e-5c96-f8541e5c8759",
Synchronized="2017-08-05 16:55:59.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Resolution.
@param R_Resolution_ID Request Resolution */
public void setR_Resolution_ID (int R_Resolution_ID)
{
if (R_Resolution_ID < 1) throw new IllegalArgumentException ("R_Resolution_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_R_Resolution_ID, Integer.valueOf(R_Resolution_ID));
}
/** Get Resolution.
@return Request Resolution */
public int getR_Resolution_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_R_Resolution_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="6f2a68cc-cecf-72e8-bb5c-3c3032d1173d")
public static String es_PE_FIELD_RequestResolution_Resolution_Description="Resolución de la solicitud.";

@XendraTrl(Identifier="6f2a68cc-cecf-72e8-bb5c-3c3032d1173d")
public static String es_PE_FIELD_RequestResolution_Resolution_Help="Estado de la resolución (ej. Corregida, Rechazada).";

@XendraTrl(Identifier="6f2a68cc-cecf-72e8-bb5c-3c3032d1173d")
public static String es_PE_FIELD_RequestResolution_Resolution_Name="Resolución";

@XendraField(AD_Column_ID="R_Resolution_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6724cc79-1f58-b31a-2ff8-507d7a14e1b5",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6f2a68cc-cecf-72e8-bb5c-3c3032d1173d")
public static final String FIELDNAME_RequestResolution_Resolution="6f2a68cc-cecf-72e8-bb5c-3c3032d1173d";
/** Column name R_Resolution_ID */
public static final String COLUMNNAME_R_Resolution_ID = "R_Resolution_ID";
}
