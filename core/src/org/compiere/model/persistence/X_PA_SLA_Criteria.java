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
/** Generated Model for PA_SLA_Criteria
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_PA_SLA_Criteria extends PO
{
/** Standard Constructor
@param ctx context
@param PA_SLA_Criteria_ID id
@param trxName transaction
*/
public X_PA_SLA_Criteria (Properties ctx, int PA_SLA_Criteria_ID, String trxName)
{
super (ctx, PA_SLA_Criteria_ID, trxName);
/** if (PA_SLA_Criteria_ID == 0)
{
setIsManual (true);	
// Y
setName (null);
setPA_SLA_Criteria_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_PA_SLA_Criteria (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=744 */
public static int Table_ID=MTable.getTable_ID("PA_SLA_Criteria");

@XendraTrl(Identifier="2e2420a0-42e2-e9d9-ee82-8603e37573d9")
public static String es_PE_TAB_SLACriteria_Description="Acuerdo de Nivel de Servicio Criterio";

@XendraTrl(Identifier="2e2420a0-42e2-e9d9-ee82-8603e37573d9")
public static String es_PE_TAB_SLACriteria_Help="Defina los criterios para medir acuerdos del porcentaje de disponibilidad (ej. la calidad, entrega resuelve la fecha prometida,..). Si usted define una clase de proceso, es necesario poner org.compiere.process.SvrProcess en ejecución (véase el ejemplo)";

@XendraTrl(Identifier="2e2420a0-42e2-e9d9-ee82-8603e37573d9")
public static String es_PE_TAB_SLACriteria_Name="ANS Criterio";
@XendraTab(Name="SLA Criteria",
Description="Service Level Agreement Criteria",
Help="Define a criteria to measure service level agreements (e.g. Quality, Delivery meets Promised date, ..). If you define a process class, it need to implement org.compiere.sla.SLACriteria (see example)",
AD_Window_ID="2f9c0dec-822e-9ffd-0c1a-85834bda184f",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="2e2420a0-42e2-e9d9-ee82-8603e37573d9",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_SLACriteria="2e2420a0-42e2-e9d9-ee82-8603e37573d9";

@XendraTrl(Identifier="6a8f4d95-9979-bb03-9f8e-ad29c0f4865d")
public static String es_PE_TABLE_PA_SLA_Criteria_Name="Criterio ANS";

@XendraTable(Name="SLA Criteria",AD_Package_ID="34bf6e21-8c70-8fb9-604c-a300eb925459",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Service Level Agreement Criteria",
Help="",TableName="PA_SLA_Criteria",AccessLevel="6",
AD_Window_ID="2f9c0dec-822e-9ffd-0c1a-85834bda184f",AD_Val_Rule_ID="",IsKey=1,LoadSeq=135,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.performanceanalysis",
Identifier="6a8f4d95-9979-bb03-9f8e-ad29c0f4865d",Synchronized="2020-03-03 21:39:18.0")
/** TableName=PA_SLA_Criteria */
public static final String Table_Name="PA_SLA_Criteria";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"PA_SLA_Criteria");

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
    Table_ID = MTable.getTable_ID("PA_SLA_Criteria");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_PA_SLA_Criteria[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Classname.
@param Classname Java Classname */
public void setClassname (String Classname)
{
if (Classname != null && Classname.length() > 60)
{
log.warning("Length > 60 - truncated");
Classname = Classname.substring(0,59);
}
set_Value (COLUMNNAME_Classname, Classname);
}
/** Get Classname.
@return Java Classname */
public String getClassname() 
{
String value = (String)get_Value(COLUMNNAME_Classname);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="35e6e68e-0dd2-4141-45ae-80361b7ca138")
public static String es_PE_FIELD_SLACriteria_Classname_Name="Nombre de Clase";

@XendraTrl(Identifier="35e6e68e-0dd2-4141-45ae-80361b7ca138")
public static String es_PE_FIELD_SLACriteria_Classname_Description="Nombre de la clase Java";

@XendraTrl(Identifier="35e6e68e-0dd2-4141-45ae-80361b7ca138")
public static String es_PE_FIELD_SLACriteria_Classname_Help="El nombre de clase identifica el nombre de la clase Java usada por este Informe ó proceso.";

@XendraField(AD_Column_ID="Classname",IsCentrallyMaintained=true,
AD_Tab_ID="2e2420a0-42e2-e9d9-ee82-8603e37573d9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsManual@=N",DisplayLength=60,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="35e6e68e-0dd2-4141-45ae-80361b7ca138")
public static final String FIELDNAME_SLACriteria_Classname="35e6e68e-0dd2-4141-45ae-80361b7ca138";

@XendraTrl(Identifier="1c375ab9-4e96-e14b-0abc-e30c455a9ba6")
public static String es_PE_COLUMN_Classname_Name="Nombre de Clase";

@XendraColumn(AD_Element_ID="43b208b9-53a3-0d59-0255-aaf07c9bd7ce",ColumnName="Classname",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1c375ab9-4e96-e14b-0abc-e30c455a9ba6",
Synchronized="2019-08-30 22:23:40.0")
/** Column name Classname */
public static final String COLUMNNAME_Classname = "Classname";
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

@XendraTrl(Identifier="bcd044e2-7986-7254-00a4-362aa79a10f1")
public static String es_PE_FIELD_SLACriteria_Description_Name="Observación";

@XendraTrl(Identifier="bcd044e2-7986-7254-00a4-362aa79a10f1")
public static String es_PE_FIELD_SLACriteria_Description_Description="Observación";

@XendraTrl(Identifier="bcd044e2-7986-7254-00a4-362aa79a10f1")
public static String es_PE_FIELD_SLACriteria_Description_Help="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="2e2420a0-42e2-e9d9-ee82-8603e37573d9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bcd044e2-7986-7254-00a4-362aa79a10f1")
public static final String FIELDNAME_SLACriteria_Description="bcd044e2-7986-7254-00a4-362aa79a10f1";

@XendraTrl(Identifier="3a107335-56d7-83f8-efbd-63c6851634ae")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3a107335-56d7-83f8-efbd-63c6851634ae",
Synchronized="2019-08-30 22:23:40.0")
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

@XendraTrl(Identifier="1bb0ce31-3f74-164c-6049-514581e505c8")
public static String es_PE_FIELD_SLACriteria_CommentHelp_Name="Ayuda";

@XendraTrl(Identifier="1bb0ce31-3f74-164c-6049-514581e505c8")
public static String es_PE_FIELD_SLACriteria_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="1bb0ce31-3f74-164c-6049-514581e505c8")
public static String es_PE_FIELD_SLACriteria_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraField(AD_Column_ID="Help",IsCentrallyMaintained=true,
AD_Tab_ID="2e2420a0-42e2-e9d9-ee82-8603e37573d9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1bb0ce31-3f74-164c-6049-514581e505c8")
public static final String FIELDNAME_SLACriteria_CommentHelp="1bb0ce31-3f74-164c-6049-514581e505c8";

@XendraTrl(Identifier="36ccd26c-41a9-ca1e-ab19-574727eea244")
public static String es_PE_COLUMN_Help_Name="Ayuda";

@XendraColumn(AD_Element_ID="a6fda582-56f9-6bb7-8436-285ce4f8de3f",ColumnName="Help",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="36ccd26c-41a9-ca1e-ab19-574727eea244",
Synchronized="2019-08-30 22:23:40.0")
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
@XendraTrl(Identifier="e0f00f0e-056e-41ad-b0aa-a6f1063d8b24")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e0f00f0e-056e-41ad-b0aa-a6f1063d8b24",
Synchronized="2019-08-30 22:23:40.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Manual.
@param IsManual This is a manual process */
public void setIsManual (boolean IsManual)
{
set_Value (COLUMNNAME_IsManual, Boolean.valueOf(IsManual));
}
/** Get Manual.
@return This is a manual process */
public boolean isManual() 
{
Object oo = get_Value(COLUMNNAME_IsManual);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="ca9b4970-ad02-1a6b-c4ac-9621c6395243")
public static String es_PE_FIELD_SLACriteria_Manual_Name="Manual";

@XendraTrl(Identifier="ca9b4970-ad02-1a6b-c4ac-9621c6395243")
public static String es_PE_FIELD_SLACriteria_Manual_Description="Éste es un proceso manual.";

@XendraTrl(Identifier="ca9b4970-ad02-1a6b-c4ac-9621c6395243")
public static String es_PE_FIELD_SLACriteria_Manual_Help="El cuadro de verificación manual indica si el proceso será hecho manualmente.";

@XendraField(AD_Column_ID="IsManual",IsCentrallyMaintained=true,
AD_Tab_ID="2e2420a0-42e2-e9d9-ee82-8603e37573d9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ca9b4970-ad02-1a6b-c4ac-9621c6395243")
public static final String FIELDNAME_SLACriteria_Manual="ca9b4970-ad02-1a6b-c4ac-9621c6395243";

@XendraTrl(Identifier="000809ad-2541-2e24-c4c6-895bfb78d741")
public static String es_PE_COLUMN_IsManual_Name="Manual";

@XendraColumn(AD_Element_ID="064afee2-bc1c-12d9-20dc-97a2318dc359",ColumnName="IsManual",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="000809ad-2541-2e24-c4c6-895bfb78d741",
Synchronized="2019-08-30 22:23:40.0")
/** Column name IsManual */
public static final String COLUMNNAME_IsManual = "IsManual";
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

@XendraTrl(Identifier="2b591342-e89b-1a72-803e-143fa6bce494")
public static String es_PE_FIELD_SLACriteria_Name_Name="Nombre";

@XendraTrl(Identifier="2b591342-e89b-1a72-803e-143fa6bce494")
public static String es_PE_FIELD_SLACriteria_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="2b591342-e89b-1a72-803e-143fa6bce494")
public static String es_PE_FIELD_SLACriteria_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="2e2420a0-42e2-e9d9-ee82-8603e37573d9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=30,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2b591342-e89b-1a72-803e-143fa6bce494")
public static final String FIELDNAME_SLACriteria_Name="2b591342-e89b-1a72-803e-143fa6bce494";

@XendraTrl(Identifier="a02de56d-8dce-b356-55f3-5448e66ce55b")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a02de56d-8dce-b356-55f3-5448e66ce55b",
Synchronized="2019-08-30 22:23:40.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set SLA Criteria.
@param PA_SLA_Criteria_ID Service Level Agreement Criteria */
public void setPA_SLA_Criteria_ID (int PA_SLA_Criteria_ID)
{
if (PA_SLA_Criteria_ID < 1) throw new IllegalArgumentException ("PA_SLA_Criteria_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_PA_SLA_Criteria_ID, Integer.valueOf(PA_SLA_Criteria_ID));
}
/** Get SLA Criteria.
@return Service Level Agreement Criteria */
public int getPA_SLA_Criteria_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_PA_SLA_Criteria_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="2e1fbaf7-2ff5-e532-7643-db93b1fbe69e")
public static String es_PE_FIELD_SLACriteria_SLACriteria_Name="Criterio ANS";

@XendraTrl(Identifier="2e1fbaf7-2ff5-e532-7643-db93b1fbe69e")
public static String es_PE_FIELD_SLACriteria_SLACriteria_Description="Criterios de acuerdo del porcentaje de disponibilidad";

@XendraTrl(Identifier="2e1fbaf7-2ff5-e532-7643-db93b1fbe69e")
public static String es_PE_FIELD_SLACriteria_SLACriteria_Help="Criterios para medir los acuerdos del porcentaje de disponibilidad (Ej. de la calidad, de la entrega prometidas la fecha,..)";

@XendraField(AD_Column_ID="PA_SLA_Criteria_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2e2420a0-42e2-e9d9-ee82-8603e37573d9",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2e1fbaf7-2ff5-e532-7643-db93b1fbe69e")
public static final String FIELDNAME_SLACriteria_SLACriteria="2e1fbaf7-2ff5-e532-7643-db93b1fbe69e";
/** Column name PA_SLA_Criteria_ID */
public static final String COLUMNNAME_PA_SLA_Criteria_ID = "PA_SLA_Criteria_ID";
}
