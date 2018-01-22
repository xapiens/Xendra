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
/** Generated Model for PA_Achievement
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_PA_Achievement extends PO
{
/** Standard Constructor
@param ctx context
@param PA_Achievement_ID id
@param trxName transaction
*/
public X_PA_Achievement (Properties ctx, int PA_Achievement_ID, String trxName)
{
super (ctx, PA_Achievement_ID, trxName);
/** if (PA_Achievement_ID == 0)
{
setIsAchieved (false);	
// N
setManualActual (Env.ZERO);
setName (null);
setPA_Achievement_ID (0);
setPA_Measure_ID (0);
setSeqNo (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_PA_Achievement (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=438 */
public static int Table_ID=MTable.getTable_ID("PA_Achievement");

@XendraTrl(Identifier="d6b68a57-891d-a9b9-f345-7cf7ee3ee814")
public static String es_PE_TAB_Achievement_Description="Logro del Desempeño";

@XendraTrl(Identifier="d6b68a57-891d-a9b9-f345-7cf7ee3ee814")
public static String es_PE_TAB_Achievement_Name="Logro del Desempeño";

@XendraTrl(Identifier="d6b68a57-891d-a9b9-f345-7cf7ee3ee814")
public static String es_PE_TAB_Achievement_Help="La pestaña Logro de Desempeño define las tareas a alcanzar. El desempeño es medido por el porcentaje de logros alcanzados.";

@XendraTab(Name="Achievement",Description="Performance Achievement",
Help="The Performance Achievement Tab defines the Tasks to be achieved.  The performance is measured by the percentage of reached achievements.",
AD_Window_ID="77e27ab5-730a-939b-28f1-8469068c1e44",SeqNo=20,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",
DisplayLogic="@MeasureType@=A",IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="d6b68a57-891d-a9b9-f345-7cf7ee3ee814",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Achievement="d6b68a57-891d-a9b9-f345-7cf7ee3ee814";

@XendraTrl(Identifier="abc265d7-ff47-1da7-6fd2-f97333e62f8b")
public static String es_PE_TABLE_PA_Achievement_Name="Meta";

@XendraTable(Name="Achievement",Description="Performance Achievement",Help="",
TableName="PA_Achievement",AccessLevel="6",AD_Window_ID="77e27ab5-730a-939b-28f1-8469068c1e44",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.performanceanalysis",
Identifier="abc265d7-ff47-1da7-6fd2-f97333e62f8b",Synchronized="2017-08-16 11:43:38.0")
/** TableName=PA_Achievement */
public static final String Table_Name="PA_Achievement";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"PA_Achievement");

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
    Table_ID = MTable.getTable_ID("PA_Achievement");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_PA_Achievement[").append(get_ID()).append("]");
return sb.toString();
}
/** Set DateDoc.
@param DateDoc Date of the Document */
public void setDateDoc (Timestamp DateDoc)
{
set_Value (COLUMNNAME_DateDoc, DateDoc);
}
/** Get DateDoc.
@return Date of the Document */
public Timestamp getDateDoc() 
{
return (Timestamp)get_Value(COLUMNNAME_DateDoc);
}

@XendraTrl(Identifier="e4a6cfed-6efe-b46b-bde8-ef90809f739a")
public static String es_PE_FIELD_Achievement_DateDoc_Description="Fecha del documento";

@XendraTrl(Identifier="e4a6cfed-6efe-b46b-bde8-ef90809f739a")
public static String es_PE_FIELD_Achievement_DateDoc_Help="La fecha del documento indica la fecha en que el documento fue generado. Puede ó no ser la misma que la fecha contable. ";

@XendraTrl(Identifier="e4a6cfed-6efe-b46b-bde8-ef90809f739a")
public static String es_PE_FIELD_Achievement_DateDoc_Name="F. Documento";

@XendraField(AD_Column_ID="DateDoc",IsCentrallyMaintained=true,
AD_Tab_ID="d6b68a57-891d-a9b9-f345-7cf7ee3ee814",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=9,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e4a6cfed-6efe-b46b-bde8-ef90809f739a")
public static final String FIELDNAME_Achievement_DateDoc="e4a6cfed-6efe-b46b-bde8-ef90809f739a";

@XendraTrl(Identifier="e0940700-4ef6-dcc7-c32f-d47cf13cc16e")
public static String es_PE_COLUMN_DateDoc_Name="F. Documento";

@XendraColumn(AD_Element_ID="68f87a38-0b7e-cc52-6990-3b5d2d120d9d",ColumnName="DateDoc",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=9,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e0940700-4ef6-dcc7-c32f-d47cf13cc16e",
Synchronized="2017-08-05 16:55:38.0")
/** Column name DateDoc */
public static final String COLUMNNAME_DateDoc = "DateDoc";
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

@XendraTrl(Identifier="9ba2938b-5731-70b8-6601-e61c99661844")
public static String es_PE_FIELD_Achievement_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="9ba2938b-5731-70b8-6601-e61c99661844")
public static String es_PE_FIELD_Achievement_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="9ba2938b-5731-70b8-6601-e61c99661844")
public static String es_PE_FIELD_Achievement_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="d6b68a57-891d-a9b9-f345-7cf7ee3ee814",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9ba2938b-5731-70b8-6601-e61c99661844")
public static final String FIELDNAME_Achievement_Description="9ba2938b-5731-70b8-6601-e61c99661844";

@XendraTrl(Identifier="40c699c9-1845-fe3e-b078-95bde5f4d3c7")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="40c699c9-1845-fe3e-b078-95bde5f4d3c7",
Synchronized="2017-08-05 16:55:38.0")
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
@XendraTrl(Identifier="937c833a-631e-4c27-9593-dc88f8d957a6")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="937c833a-631e-4c27-9593-dc88f8d957a6",
Synchronized="2017-08-05 16:55:38.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Achieved.
@param IsAchieved The goal is achieved */
public void setIsAchieved (boolean IsAchieved)
{
set_Value (COLUMNNAME_IsAchieved, Boolean.valueOf(IsAchieved));
}
/** Get Achieved.
@return The goal is achieved */
public boolean isAchieved() 
{
Object oo = get_Value(COLUMNNAME_IsAchieved);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="0a829377-c036-d0eb-2b2a-df2769c2cee7")
public static String es_PE_FIELD_Achievement_Achieved_Description="La meta es lograda";

@XendraTrl(Identifier="0a829377-c036-d0eb-2b2a-df2769c2cee7")
public static String es_PE_FIELD_Achievement_Achieved_Help="El cuadro de verificación Logrado indica que esta meta ha sido lograda";

@XendraTrl(Identifier="0a829377-c036-d0eb-2b2a-df2769c2cee7")
public static String es_PE_FIELD_Achievement_Achieved_Name="Archivado";

@XendraField(AD_Column_ID="IsAchieved",IsCentrallyMaintained=true,
AD_Tab_ID="d6b68a57-891d-a9b9-f345-7cf7ee3ee814",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0a829377-c036-d0eb-2b2a-df2769c2cee7")
public static final String FIELDNAME_Achievement_Achieved="0a829377-c036-d0eb-2b2a-df2769c2cee7";

@XendraTrl(Identifier="9b111337-6917-db80-b107-75d68958e076")
public static String es_PE_COLUMN_IsAchieved_Name="Archivado";

@XendraColumn(AD_Element_ID="c95ec1e7-af1b-275a-38fd-7114788718e1",ColumnName="IsAchieved",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9b111337-6917-db80-b107-75d68958e076",
Synchronized="2017-08-05 16:55:38.0")
/** Column name IsAchieved */
public static final String COLUMNNAME_IsAchieved = "IsAchieved";
/** Set Manual Actual.
@param ManualActual Manually entered actual value */
public void setManualActual (BigDecimal ManualActual)
{
if (ManualActual == null) throw new IllegalArgumentException ("ManualActual is mandatory.");
set_Value (COLUMNNAME_ManualActual, ManualActual);
}
/** Get Manual Actual.
@return Manually entered actual value */
public BigDecimal getManualActual() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_ManualActual);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="8dfffec8-7bf4-d64d-9d26-e4a2b95596a4")
public static String es_PE_FIELD_Achievement_ManualActual_Description="Valor actual introducido manualmente";

@XendraTrl(Identifier="8dfffec8-7bf4-d64d-9d26-e4a2b95596a4")
public static String es_PE_FIELD_Achievement_ManualActual_Help="El activo manual identifica el valor actual introducido manualmente.";

@XendraTrl(Identifier="8dfffec8-7bf4-d64d-9d26-e4a2b95596a4")
public static String es_PE_FIELD_Achievement_ManualActual_Name="Valor Manual Actual";

@XendraField(AD_Column_ID="ManualActual",IsCentrallyMaintained=true,
AD_Tab_ID="d6b68a57-891d-a9b9-f345-7cf7ee3ee814",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8dfffec8-7bf4-d64d-9d26-e4a2b95596a4")
public static final String FIELDNAME_Achievement_ManualActual="8dfffec8-7bf4-d64d-9d26-e4a2b95596a4";

@XendraTrl(Identifier="d806ffd5-c324-880a-0790-cc4d9d9089ba")
public static String es_PE_COLUMN_ManualActual_Name="Valor Manual Actual";

@XendraColumn(AD_Element_ID="885854a7-bfaa-5e6e-de17-749a35a80edf",ColumnName="ManualActual",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d806ffd5-c324-880a-0790-cc4d9d9089ba",
Synchronized="2017-08-05 16:55:38.0")
/** Column name ManualActual */
public static final String COLUMNNAME_ManualActual = "ManualActual";
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

@XendraTrl(Identifier="b5632e5a-1f9a-1f64-08c0-92389d9e458e")
public static String es_PE_FIELD_Achievement_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="b5632e5a-1f9a-1f64-08c0-92389d9e458e")
public static String es_PE_FIELD_Achievement_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="b5632e5a-1f9a-1f64-08c0-92389d9e458e")
public static String es_PE_FIELD_Achievement_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="d6b68a57-891d-a9b9-f345-7cf7ee3ee814",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=1,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="b5632e5a-1f9a-1f64-08c0-92389d9e458e")
public static final String FIELDNAME_Achievement_Name="b5632e5a-1f9a-1f64-08c0-92389d9e458e";

@XendraTrl(Identifier="1bad2a97-fcb9-6f60-3990-41238b7cd3a1")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1bad2a97-fcb9-6f60-3990-41238b7cd3a1",
Synchronized="2017-08-05 16:55:38.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Note.
@param Note Optional additional user defined information */
public void setNote (String Note)
{
set_Value (COLUMNNAME_Note, Note);
}
/** Get Note.
@return Optional additional user defined information */
public String getNote() 
{
String value = (String)get_Value(COLUMNNAME_Note);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="4144c526-1356-cc12-c9da-a6f34480c77b")
public static String es_PE_FIELD_Achievement_Note_Description="Información adicional opcional definida por el usuario";

@XendraTrl(Identifier="4144c526-1356-cc12-c9da-a6f34480c77b")
public static String es_PE_FIELD_Achievement_Note_Help="El campo Nota permite una entrada opcional de información definida por el usuario considerando este registro";

@XendraTrl(Identifier="4144c526-1356-cc12-c9da-a6f34480c77b")
public static String es_PE_FIELD_Achievement_Note_Name="Nota";
@XendraField(AD_Column_ID="Note",
IsCentrallyMaintained=true,AD_Tab_ID="d6b68a57-891d-a9b9-f345-7cf7ee3ee814",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=90,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="4144c526-1356-cc12-c9da-a6f34480c77b")
public static final String FIELDNAME_Achievement_Note="4144c526-1356-cc12-c9da-a6f34480c77b";

@XendraTrl(Identifier="7b177e16-17f9-adec-4283-a9bbe75722f3")
public static String es_PE_COLUMN_Note_Name="Nota";

@XendraColumn(AD_Element_ID="5fea140b-6b26-b544-b237-3b3fa64ae1c6",ColumnName="Note",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7b177e16-17f9-adec-4283-a9bbe75722f3",
Synchronized="2017-08-05 16:55:38.0")
/** Column name Note */
public static final String COLUMNNAME_Note = "Note";
/** Set Achievement.
@param PA_Achievement_ID Performance Achievement */
public void setPA_Achievement_ID (int PA_Achievement_ID)
{
if (PA_Achievement_ID < 1) throw new IllegalArgumentException ("PA_Achievement_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_PA_Achievement_ID, Integer.valueOf(PA_Achievement_ID));
}
/** Get Achievement.
@return Performance Achievement */
public int getPA_Achievement_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_PA_Achievement_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="9ba04dc0-6da6-f936-a59c-203de85e2764")
public static String es_PE_FIELD_Achievement_Achievement_Description="Meta de desempeño";

@XendraTrl(Identifier="9ba04dc0-6da6-f936-a59c-203de85e2764")
public static String es_PE_FIELD_Achievement_Achievement_Help="La meta identifica una tarea única que es parte de una meta de desempeño completa";

@XendraTrl(Identifier="9ba04dc0-6da6-f936-a59c-203de85e2764")
public static String es_PE_FIELD_Achievement_Achievement_Name="Meta";

@XendraField(AD_Column_ID="PA_Achievement_ID",IsCentrallyMaintained=true,
AD_Tab_ID="d6b68a57-891d-a9b9-f345-7cf7ee3ee814",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9ba04dc0-6da6-f936-a59c-203de85e2764")
public static final String FIELDNAME_Achievement_Achievement="9ba04dc0-6da6-f936-a59c-203de85e2764";
/** Column name PA_Achievement_ID */
public static final String COLUMNNAME_PA_Achievement_ID = "PA_Achievement_ID";
/** Set Measure.
@param PA_Measure_ID Concrete Performance Measurement */
public void setPA_Measure_ID (int PA_Measure_ID)
{
if (PA_Measure_ID < 1) throw new IllegalArgumentException ("PA_Measure_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_PA_Measure_ID, Integer.valueOf(PA_Measure_ID));
}
/** Get Measure.
@return Concrete Performance Measurement */
public int getPA_Measure_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_PA_Measure_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="5ad6d992-5ac0-4ca1-bcc5-bc915619429b")
public static String es_PE_FIELD_Achievement_Measure_Description="Medida de desempeño concreto";

@XendraTrl(Identifier="5ad6d992-5ac0-4ca1-bcc5-bc915619429b")
public static String es_PE_FIELD_Achievement_Measure_Help="La medida identifica un indicador concreto; medible del desempeño. Por Ej. Dólares de venta ó prospectos contactados.";

@XendraTrl(Identifier="5ad6d992-5ac0-4ca1-bcc5-bc915619429b")
public static String es_PE_FIELD_Achievement_Measure_Name="Medida";

@XendraField(AD_Column_ID="PA_Measure_ID",IsCentrallyMaintained=true,
AD_Tab_ID="d6b68a57-891d-a9b9-f345-7cf7ee3ee814",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5ad6d992-5ac0-4ca1-bcc5-bc915619429b")
public static final String FIELDNAME_Achievement_Measure="5ad6d992-5ac0-4ca1-bcc5-bc915619429b";

@XendraTrl(Identifier="217d6d71-07a4-ed21-006d-560f70392afb")
public static String es_PE_COLUMN_PA_Measure_ID_Name="Medida";

@XendraColumn(AD_Element_ID="a1b2285c-4e3e-37c1-37a9-2206d4a6cd87",ColumnName="PA_Measure_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="217d6d71-07a4-ed21-006d-560f70392afb",
Synchronized="2017-08-05 16:55:38.0")
/** Column name PA_Measure_ID */
public static final String COLUMNNAME_PA_Measure_ID = "PA_Measure_ID";
/** Set Sequence.
@param SeqNo Method of ordering records: lowest number comes first */
public void setSeqNo (int SeqNo)
{
set_Value (COLUMNNAME_SeqNo, Integer.valueOf(SeqNo));
}
/** Get Sequence.
@return Method of ordering records: lowest number comes first */
public int getSeqNo() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_SeqNo);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="a4547d2e-5184-e518-c4ef-a583ece8c84d")
public static String es_PE_FIELD_Achievement_Sequence_Description="Método de ordenar registros; el número más bajo viene primero";

@XendraTrl(Identifier="a4547d2e-5184-e518-c4ef-a583ece8c84d")
public static String es_PE_FIELD_Achievement_Sequence_Help="La Secuencia indica el orden de los registros";

@XendraTrl(Identifier="a4547d2e-5184-e518-c4ef-a583ece8c84d")
public static String es_PE_FIELD_Achievement_Sequence_Name="Secuencia";

@XendraField(AD_Column_ID="SeqNo",IsCentrallyMaintained=true,
AD_Tab_ID="d6b68a57-891d-a9b9-f345-7cf7ee3ee814",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=70,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a4547d2e-5184-e518-c4ef-a583ece8c84d")
public static final String FIELDNAME_Achievement_Sequence="a4547d2e-5184-e518-c4ef-a583ece8c84d";

@XendraTrl(Identifier="2040baf1-0561-73af-662d-ecb692ebc86b")
public static String es_PE_COLUMN_SeqNo_Name="Secuencia";

@XendraColumn(AD_Element_ID="38fa26fe-b59d-fce1-c129-420b57da738b",ColumnName="SeqNo",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2040baf1-0561-73af-662d-ecb692ebc86b",
Synchronized="2017-08-05 16:55:38.0")
/** Column name SeqNo */
public static final String COLUMNNAME_SeqNo = "SeqNo";
}
