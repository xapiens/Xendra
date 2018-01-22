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
/** Generated Model for AD_Scheduler_Para
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_Scheduler_Para extends PO
{
/** Standard Constructor
@param ctx context
@param AD_Scheduler_Para_ID id
@param trxName transaction
*/
public X_AD_Scheduler_Para (Properties ctx, int AD_Scheduler_Para_ID, String trxName)
{
super (ctx, AD_Scheduler_Para_ID, trxName);
/** if (AD_Scheduler_Para_ID == 0)
{
setAD_Process_Para_ID (0);
setAD_Scheduler_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_Scheduler_Para (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=698 */
public static int Table_ID=MTable.getTable_ID("AD_Scheduler_Para");

@XendraTrl(Identifier="be7a542c-6558-e724-51db-ba39649e73b3")
public static String es_PE_TAB_Parameter_Description="Parámetro del planificador";

@XendraTrl(Identifier="be7a542c-6558-e724-51db-ba39649e73b3")
public static String es_PE_TAB_Parameter_Name="Parámetro";

@XendraTrl(Identifier="be7a542c-6558-e724-51db-ba39649e73b3")
public static String es_PE_TAB_Parameter_Help="Proporcione el parámetro para el proceso a programar";

@XendraTab(Name="Parameter",Description="Scheduler Parameter",
Help="Provide parameter for scheduled process",AD_Window_ID="2d2f8ce7-abbe-ad81-0373-06f27fbe1596",
SeqNo=20,TabLevel=1,IsSingleRow=false,IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="ee8dcb69-7826-7eb4-1a0c-2d933a7cca86",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="be7a542c-6558-e724-51db-ba39649e73b3",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Parameter="be7a542c-6558-e724-51db-ba39649e73b3";

@XendraTrl(Identifier="ab01c06c-e82c-ccab-6c71-4f708577e290")
public static String es_PE_TABLE_AD_Scheduler_Para_Name="AD_Scheduler_Para";

@XendraTable(Name="AD_Scheduler_Para",Description="",Help="",TableName="AD_Scheduler_Para",
AccessLevel="6",AD_Window_ID="2d2f8ce7-abbe-ad81-0373-06f27fbe1596",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.dictionary",
Identifier="ab01c06c-e82c-ccab-6c71-4f708577e290",Synchronized="2017-08-16 11:40:58.0")
/** TableName=AD_Scheduler_Para */
public static final String Table_Name="AD_Scheduler_Para";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_Scheduler_Para");

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
    Table_ID = MTable.getTable_ID("AD_Scheduler_Para");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_Scheduler_Para[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Process Parameter.
@param AD_Process_Para_ID Process Parameter */
public void setAD_Process_Para_ID (int AD_Process_Para_ID)
{
if (AD_Process_Para_ID < 1) throw new IllegalArgumentException ("AD_Process_Para_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_Process_Para_ID, Integer.valueOf(AD_Process_Para_ID));
}
/** Get Process Parameter.
@return Process Parameter */
public int getAD_Process_Para_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Process_Para_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d93be9e0-201e-8ede-d822-f5cf3fde0dda")
public static String es_PE_FIELD_Parameter_ProcessParameter_Name="Parámetro de Procesos";

@XendraField(AD_Column_ID="AD_Process_Para_ID",IsCentrallyMaintained=true,
AD_Tab_ID="be7a542c-6558-e724-51db-ba39649e73b3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d93be9e0-201e-8ede-d822-f5cf3fde0dda")
public static final String FIELDNAME_Parameter_ProcessParameter="d93be9e0-201e-8ede-d822-f5cf3fde0dda";

@XendraTrl(Identifier="84b60ada-00b9-36d1-4f65-6679ecf38c3c")
public static String es_PE_COLUMN_AD_Process_Para_ID_Name="Parámetro de Procesos";

@XendraColumn(AD_Element_ID="ba7a1fb4-c201-c803-e146-f7bba5520ba9",ColumnName="AD_Process_Para_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="7875fd4e-d920-8e85-9e1e-09e9b8029038",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="84b60ada-00b9-36d1-4f65-6679ecf38c3c",Synchronized="2017-08-05 16:52:50.0")
/** Column name AD_Process_Para_ID */
public static final String COLUMNNAME_AD_Process_Para_ID = "AD_Process_Para_ID";
/** Set Scheduler.
@param AD_Scheduler_ID Schedule Processes */
public void setAD_Scheduler_ID (int AD_Scheduler_ID)
{
if (AD_Scheduler_ID < 1) throw new IllegalArgumentException ("AD_Scheduler_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_Scheduler_ID, Integer.valueOf(AD_Scheduler_ID));
}
/** Get Scheduler.
@return Schedule Processes */
public int getAD_Scheduler_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Scheduler_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="6053e672-dd52-5bfb-82a3-ae4a05e4954c")
public static String es_PE_FIELD_Parameter_Scheduler_Description="Programación de procesos";

@XendraTrl(Identifier="6053e672-dd52-5bfb-82a3-ae4a05e4954c")
public static String es_PE_FIELD_Parameter_Scheduler_Help="Programación de procesos para ser ejecutada la sincronización.";

@XendraTrl(Identifier="6053e672-dd52-5bfb-82a3-ae4a05e4954c")
public static String es_PE_FIELD_Parameter_Scheduler_Name="Programación";

@XendraField(AD_Column_ID="AD_Scheduler_ID",IsCentrallyMaintained=true,
AD_Tab_ID="be7a542c-6558-e724-51db-ba39649e73b3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6053e672-dd52-5bfb-82a3-ae4a05e4954c")
public static final String FIELDNAME_Parameter_Scheduler="6053e672-dd52-5bfb-82a3-ae4a05e4954c";

@XendraTrl(Identifier="ee8dcb69-7826-7eb4-1a0c-2d933a7cca86")
public static String es_PE_COLUMN_AD_Scheduler_ID_Name="Programación";

@XendraColumn(AD_Element_ID="7c943646-ecd0-4485-0c20-0616c91ca579",ColumnName="AD_Scheduler_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ee8dcb69-7826-7eb4-1a0c-2d933a7cca86",
Synchronized="2017-08-05 16:52:50.0")
/** Column name AD_Scheduler_ID */
public static final String COLUMNNAME_AD_Scheduler_ID = "AD_Scheduler_ID";
/** Set AD_Scheduler_Para_ID.
@param AD_Scheduler_Para_ID AD_Scheduler_Para_ID */
public void setAD_Scheduler_Para_ID (int AD_Scheduler_Para_ID)
{
if (AD_Scheduler_Para_ID <= 0) set_ValueNoCheck (COLUMNNAME_AD_Scheduler_Para_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_AD_Scheduler_Para_ID, Integer.valueOf(AD_Scheduler_Para_ID));
}
/** Get AD_Scheduler_Para_ID.
@return AD_Scheduler_Para_ID */
public int getAD_Scheduler_Para_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Scheduler_Para_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name AD_Scheduler_Para_ID */
public static final String COLUMNNAME_AD_Scheduler_Para_ID = "AD_Scheduler_Para_ID";
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

@XendraTrl(Identifier="e20e7e23-a7fa-ab4d-8111-e8f4933a33ea")
public static String es_PE_FIELD_Parameter_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="e20e7e23-a7fa-ab4d-8111-e8f4933a33ea")
public static String es_PE_FIELD_Parameter_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="e20e7e23-a7fa-ab4d-8111-e8f4933a33ea")
public static String es_PE_FIELD_Parameter_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="be7a542c-6558-e724-51db-ba39649e73b3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e20e7e23-a7fa-ab4d-8111-e8f4933a33ea")
public static final String FIELDNAME_Parameter_Description="e20e7e23-a7fa-ab4d-8111-e8f4933a33ea";

@XendraTrl(Identifier="7d9d9dab-11f2-2f92-ed7d-0ea1c8167bcf")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7d9d9dab-11f2-2f92-ed7d-0ea1c8167bcf",
Synchronized="2017-08-05 16:52:50.0")
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
@XendraTrl(Identifier="3984ac6d-ab3b-4c8b-a7ee-238d3bed3072")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3984ac6d-ab3b-4c8b-a7ee-238d3bed3072",
Synchronized="2017-08-05 16:52:50.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Default Parameter.
@param ParameterDefault Default value of the parameter */
public void setParameterDefault (String ParameterDefault)
{
if (ParameterDefault != null && ParameterDefault.length() > 60)
{
log.warning("Length > 60 - truncated");
ParameterDefault = ParameterDefault.substring(0,59);
}
set_Value (COLUMNNAME_ParameterDefault, ParameterDefault);
}
/** Get Default Parameter.
@return Default value of the parameter */
public String getParameterDefault() 
{
String value = (String)get_Value(COLUMNNAME_ParameterDefault);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="813501b1-8a04-51ff-8971-7ff116fe5788")
public static String es_PE_FIELD_Parameter_DefaultParameter_Description="Valor predeterminado del parámetro.";

@XendraTrl(Identifier="813501b1-8a04-51ff-8971-7ff116fe5788")
public static String es_PE_FIELD_Parameter_DefaultParameter_Help="El valor predeterminado del parámetro puede ser una variable como @#Fecha@ ";

@XendraTrl(Identifier="813501b1-8a04-51ff-8971-7ff116fe5788")
public static String es_PE_FIELD_Parameter_DefaultParameter_Name="Parametro Predeterminado";

@XendraField(AD_Column_ID="ParameterDefault",IsCentrallyMaintained=true,
AD_Tab_ID="be7a542c-6558-e724-51db-ba39649e73b3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="813501b1-8a04-51ff-8971-7ff116fe5788")
public static final String FIELDNAME_Parameter_DefaultParameter="813501b1-8a04-51ff-8971-7ff116fe5788";

@XendraTrl(Identifier="00048539-e502-034e-1cac-9cdd78c06422")
public static String es_PE_COLUMN_ParameterDefault_Name="Parametro Predeterminado";

@XendraColumn(AD_Element_ID="d6abb65b-a894-b4bd-e1f3-249cde072b7f",ColumnName="ParameterDefault",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="00048539-e502-034e-1cac-9cdd78c06422",
Synchronized="2017-08-05 16:52:50.0")
/** Column name ParameterDefault */
public static final String COLUMNNAME_ParameterDefault = "ParameterDefault";
}
