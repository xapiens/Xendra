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
/** Generated Model for R_IssueProject
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_R_IssueProject extends PO
{
/** Standard Constructor
@param ctx context
@param R_IssueProject_ID id
@param trxName transaction
*/
public X_R_IssueProject (Properties ctx, int R_IssueProject_ID, String trxName)
{
super (ctx, R_IssueProject_ID, trxName);
/** if (R_IssueProject_ID == 0)
{
setName (null);
setR_IssueProject_ID (0);
setSystemStatus (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_R_IssueProject (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=842 */
public static int Table_ID=MTable.getTable_ID("R_IssueProject");

@XendraTrl(Identifier="807575fe-04ed-dcef-ade9-650d57646f0b")
public static String es_PE_TAB_IssueProject_Description="Proyecto de Reporte Automático de Surtimiento";

@XendraTrl(Identifier="807575fe-04ed-dcef-ade9-650d57646f0b")
public static String es_PE_TAB_IssueProject_Name="Surtimiento al Proyecto";

@XendraTab(Name="Issue Project",Description="Projects of automatic Issue Reporting",Help="",
AD_Window_ID="d4faa51d-96f2-047a-5a2e-779a7f4f1a03",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=false,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="807575fe-04ed-dcef-ade9-650d57646f0b",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_IssueProject="807575fe-04ed-dcef-ade9-650d57646f0b";

@XendraTrl(Identifier="e0130fca-4eb4-d95c-5ab8-0fbeb160c40f")
public static String es_PE_TAB_IssueProject2_Description="Reporte Automático de Surtimiento";

@XendraTrl(Identifier="e0130fca-4eb4-d95c-5ab8-0fbeb160c40f")
public static String es_PE_TAB_IssueProject2_Name="Surtimiento al Proyecto";

@XendraTab(Name="Issue Project",Description="Automatic Issue Reporting",Help="",
AD_Window_ID="53561d65-4ae5-81a3-c14b-9b09382be0fe",SeqNo=30,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="33d4dfe8-80a4-ed22-6556-33cb6b87967f",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=false,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="e0130fca-4eb4-d95c-5ab8-0fbeb160c40f",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_IssueProject2="e0130fca-4eb4-d95c-5ab8-0fbeb160c40f";

@XendraTrl(Identifier="1db468b2-c111-126d-709d-bafc6925eebc")
public static String es_PE_TABLE_R_IssueProject_Name="Edición de Proyecto";

@XendraTable(Name="Issue Project",AD_Package_ID="1b3656e5-71c7-1296-994e-9b2c4549c7fd",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="R_IssueProject",AccessLevel="6",AD_Window_ID="d4faa51d-96f2-047a-5a2e-779a7f4f1a03",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=140,IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.standard",
Identifier="1db468b2-c111-126d-709d-bafc6925eebc",Synchronized="2020-03-03 21:39:31.0")
/** TableName=R_IssueProject */
public static final String Table_Name="R_IssueProject";


@XendraIndex(Name="r_issueproject_name",Identifier="2aea6f72-f932-3ac1-87e0-3dee7b2b8b56",
Column_Names="name",IsUnique="false",TableIdentifier="2aea6f72-f932-3ac1-87e0-3dee7b2b8b56",
Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_r_issueproject_name = "2aea6f72-f932-3ac1-87e0-3dee7b2b8b56";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"R_IssueProject");

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
    Table_ID = MTable.getTable_ID("R_IssueProject");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_R_IssueProject[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Asset.
@param A_Asset_ID Asset used internally or by customers */
public void setA_Asset_ID (int A_Asset_ID)
{
if (A_Asset_ID <= 0) set_Value (COLUMNNAME_A_Asset_ID, null);
 else 
set_Value (COLUMNNAME_A_Asset_ID, Integer.valueOf(A_Asset_ID));
}
/** Get Asset.
@return Asset used internally or by customers */
public int getA_Asset_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_A_Asset_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="5199a317-bd53-7a71-507e-05756166bb31")
public static String es_PE_FIELD_IssueProject_Asset_Name="Activo";

@XendraTrl(Identifier="5199a317-bd53-7a71-507e-05756166bb31")
public static String es_PE_FIELD_IssueProject_Asset_Description="Activo usado por la compañía o sus clientes";

@XendraTrl(Identifier="5199a317-bd53-7a71-507e-05756166bb31")
public static String es_PE_FIELD_IssueProject_Asset_Help="Indica si es usado por la compañia o sus clientes";

@XendraField(AD_Column_ID="A_Asset_ID",IsCentrallyMaintained=true,
AD_Tab_ID="807575fe-04ed-dcef-ade9-650d57646f0b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5199a317-bd53-7a71-507e-05756166bb31")
public static final String FIELDNAME_IssueProject_Asset="5199a317-bd53-7a71-507e-05756166bb31";

@XendraTrl(Identifier="6cb1826e-9818-0ba0-4017-3a9097f31612")
public static String es_PE_FIELD_IssueProject_Asset2_Name="Activo";

@XendraTrl(Identifier="6cb1826e-9818-0ba0-4017-3a9097f31612")
public static String es_PE_FIELD_IssueProject_Asset2_Description="Activo usado por la compañía o sus clientes";

@XendraTrl(Identifier="6cb1826e-9818-0ba0-4017-3a9097f31612")
public static String es_PE_FIELD_IssueProject_Asset2_Help="Indica si es usado por la compañia o sus clientes";

@XendraField(AD_Column_ID="A_Asset_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e0130fca-4eb4-d95c-5ab8-0fbeb160c40f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6cb1826e-9818-0ba0-4017-3a9097f31612")
public static final String FIELDNAME_IssueProject_Asset2="6cb1826e-9818-0ba0-4017-3a9097f31612";

@XendraTrl(Identifier="33d4dfe8-80a4-ed22-6556-33cb6b87967f")
public static String es_PE_COLUMN_A_Asset_ID_Name="Activo";

@XendraColumn(AD_Element_ID="3cd84c49-e25b-9ecc-5637-ed9a07d76bee",ColumnName="A_Asset_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="33d4dfe8-80a4-ed22-6556-33cb6b87967f",
Synchronized="2019-08-30 22:23:45.0")
/** Column name A_Asset_ID */
public static final String COLUMNNAME_A_Asset_ID = "A_Asset_ID";
/** Set Project.
@param C_Project_ID Financial Project */
public void setC_Project_ID (int C_Project_ID)
{
if (C_Project_ID <= 0) set_Value (COLUMNNAME_C_Project_ID, null);
 else 
set_Value (COLUMNNAME_C_Project_ID, Integer.valueOf(C_Project_ID));
}
/** Get Project.
@return Financial Project */
public int getC_Project_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Project_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="219681e6-a705-a872-8b95-822a4260fe3a")
public static String es_PE_FIELD_IssueProject_Project_Name="Proyecto";

@XendraTrl(Identifier="219681e6-a705-a872-8b95-822a4260fe3a")
public static String es_PE_FIELD_IssueProject_Project_Description="Identifica un proyecto único";

@XendraTrl(Identifier="219681e6-a705-a872-8b95-822a4260fe3a")
public static String es_PE_FIELD_IssueProject_Project_Help="La ID de un proyecto es un identificador definido por el usuario para un proyecto";

@XendraField(AD_Column_ID="C_Project_ID",IsCentrallyMaintained=true,
AD_Tab_ID="807575fe-04ed-dcef-ade9-650d57646f0b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="219681e6-a705-a872-8b95-822a4260fe3a")
public static final String FIELDNAME_IssueProject_Project="219681e6-a705-a872-8b95-822a4260fe3a";

@XendraTrl(Identifier="92721fd8-b206-e0ea-5b5e-735b35ab37b3")
public static String es_PE_FIELD_IssueProject_Project2_Name="Proyecto";

@XendraTrl(Identifier="92721fd8-b206-e0ea-5b5e-735b35ab37b3")
public static String es_PE_FIELD_IssueProject_Project2_Description="Identifica un proyecto único";

@XendraTrl(Identifier="92721fd8-b206-e0ea-5b5e-735b35ab37b3")
public static String es_PE_FIELD_IssueProject_Project2_Help="La ID de un proyecto es un identificador definido por el usuario para un proyecto";

@XendraField(AD_Column_ID="C_Project_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e0130fca-4eb4-d95c-5ab8-0fbeb160c40f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="92721fd8-b206-e0ea-5b5e-735b35ab37b3")
public static final String FIELDNAME_IssueProject_Project2="92721fd8-b206-e0ea-5b5e-735b35ab37b3";

@XendraTrl(Identifier="a5786030-cf2a-2e35-8e5d-659e36e7a643")
public static String es_PE_COLUMN_C_Project_ID_Name="Proyecto";

@XendraColumn(AD_Element_ID="16ff5dcc-9178-73dd-e618-e88bd79d573b",ColumnName="C_Project_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a5786030-cf2a-2e35-8e5d-659e36e7a643",
Synchronized="2019-08-30 22:23:45.0")
/** Column name C_Project_ID */
public static final String COLUMNNAME_C_Project_ID = "C_Project_ID";
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

@XendraTrl(Identifier="156d4e3b-4fcf-d9fd-e2cd-11e04292e244")
public static String es_PE_FIELD_IssueProject_Description_Name="Observación";

@XendraTrl(Identifier="156d4e3b-4fcf-d9fd-e2cd-11e04292e244")
public static String es_PE_FIELD_IssueProject_Description_Description="Observación";

@XendraTrl(Identifier="156d4e3b-4fcf-d9fd-e2cd-11e04292e244")
public static String es_PE_FIELD_IssueProject_Description_Help="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="807575fe-04ed-dcef-ade9-650d57646f0b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=255,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="156d4e3b-4fcf-d9fd-e2cd-11e04292e244")
public static final String FIELDNAME_IssueProject_Description="156d4e3b-4fcf-d9fd-e2cd-11e04292e244";

@XendraTrl(Identifier="57e40b3b-b9b9-fd5c-5f10-e3654a01474e")
public static String es_PE_FIELD_IssueProject_Description2_Name="Observación";

@XendraTrl(Identifier="57e40b3b-b9b9-fd5c-5f10-e3654a01474e")
public static String es_PE_FIELD_IssueProject_Description2_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="57e40b3b-b9b9-fd5c-5f10-e3654a01474e")
public static String es_PE_FIELD_IssueProject_Description2_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="e0130fca-4eb4-d95c-5ab8-0fbeb160c40f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=255,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="57e40b3b-b9b9-fd5c-5f10-e3654a01474e")
public static final String FIELDNAME_IssueProject_Description2="57e40b3b-b9b9-fd5c-5f10-e3654a01474e";

@XendraTrl(Identifier="306a2b92-e261-a15a-8af5-9b14c6184be4")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="306a2b92-e261-a15a-8af5-9b14c6184be4",
Synchronized="2019-08-30 22:23:45.0")
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
@XendraTrl(Identifier="0bbd73f6-439f-4b38-9276-ea9c1e2e11de")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0bbd73f6-439f-4b38-9276-ea9c1e2e11de",
Synchronized="2019-08-30 22:23:45.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Name.
@param Name Alphanumeric identifier of the entity */
public void setName (String Name)
{
if (Name == null) throw new IllegalArgumentException ("Name is mandatory.");
if (Name.length() > 120)
{
log.warning("Length > 120 - truncated");
Name = Name.substring(0,119);
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

@XendraTrl(Identifier="d4320585-ae3e-1303-3ae9-853fc5bd737d")
public static String es_PE_FIELD_IssueProject_Name_Name="Nombre";

@XendraTrl(Identifier="d4320585-ae3e-1303-3ae9-853fc5bd737d")
public static String es_PE_FIELD_IssueProject_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="d4320585-ae3e-1303-3ae9-853fc5bd737d")
public static String es_PE_FIELD_IssueProject_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="807575fe-04ed-dcef-ade9-650d57646f0b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=120,IsReadOnly=true,SeqNo=30,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d4320585-ae3e-1303-3ae9-853fc5bd737d")
public static final String FIELDNAME_IssueProject_Name="d4320585-ae3e-1303-3ae9-853fc5bd737d";

@XendraTrl(Identifier="123d3625-310d-a72d-6b56-94433d7da08f")
public static String es_PE_FIELD_IssueProject_Name2_Name="Nombre";

@XendraTrl(Identifier="123d3625-310d-a72d-6b56-94433d7da08f")
public static String es_PE_FIELD_IssueProject_Name2_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="123d3625-310d-a72d-6b56-94433d7da08f")
public static String es_PE_FIELD_IssueProject_Name2_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="e0130fca-4eb4-d95c-5ab8-0fbeb160c40f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=120,IsReadOnly=true,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="123d3625-310d-a72d-6b56-94433d7da08f")
public static final String FIELDNAME_IssueProject_Name2="123d3625-310d-a72d-6b56-94433d7da08f";

@XendraTrl(Identifier="5578d277-6fdf-88fc-9b40-7a7891618a6b")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=120,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5578d277-6fdf-88fc-9b40-7a7891618a6b",
Synchronized="2019-08-30 22:23:45.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Profile.
@param ProfileInfo Information to HELP profiling the system for solving support issues */
public void setProfileInfo (String ProfileInfo)
{
if (ProfileInfo != null && ProfileInfo.length() > 60)
{
log.warning("Length > 60 - truncated");
ProfileInfo = ProfileInfo.substring(0,59);
}
set_Value (COLUMNNAME_ProfileInfo, ProfileInfo);
}
/** Get Profile.
@return Information to HELP profiling the system for solving support issues */
public String getProfileInfo() 
{
String value = (String)get_Value(COLUMNNAME_ProfileInfo);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="46e7a479-4eef-9b70-0882-55c31a950d98")
public static String es_PE_FIELD_IssueProject_Profile_Name="Perfil";

@XendraTrl(Identifier="46e7a479-4eef-9b70-0882-55c31a950d98")
public static String es_PE_FIELD_IssueProject_Profile_Description="Información que ayuda al perfilamiento del sistema para solucionar ediciónes de soporte";

@XendraTrl(Identifier="46e7a479-4eef-9b70-0882-55c31a950d98")
public static String es_PE_FIELD_IssueProject_Profile_Help="La información de perfil no contiene información confidencial y se utiliza para soportar la detección y el diagnóstico de la edición.";

@XendraField(AD_Column_ID="ProfileInfo",IsCentrallyMaintained=true,
AD_Tab_ID="807575fe-04ed-dcef-ade9-650d57646f0b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="46e7a479-4eef-9b70-0882-55c31a950d98")
public static final String FIELDNAME_IssueProject_Profile="46e7a479-4eef-9b70-0882-55c31a950d98";

@XendraTrl(Identifier="7df58c06-d226-9784-d877-03aa2aac3a3b")
public static String es_PE_FIELD_IssueProject_Profile2_Name="Perfil";

@XendraTrl(Identifier="7df58c06-d226-9784-d877-03aa2aac3a3b")
public static String es_PE_FIELD_IssueProject_Profile2_Description="Información que ayuda al perfilamiento del sistema para solucionar ediciónes de soporte";

@XendraTrl(Identifier="7df58c06-d226-9784-d877-03aa2aac3a3b")
public static String es_PE_FIELD_IssueProject_Profile2_Help="La información de perfil no contiene información confidencial y se utiliza para soportar la detección y el diagnóstico de la edición.";

@XendraField(AD_Column_ID="ProfileInfo",IsCentrallyMaintained=true,
AD_Tab_ID="e0130fca-4eb4-d95c-5ab8-0fbeb160c40f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=30,IsReadOnly=true,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7df58c06-d226-9784-d877-03aa2aac3a3b")
public static final String FIELDNAME_IssueProject_Profile2="7df58c06-d226-9784-d877-03aa2aac3a3b";

@XendraTrl(Identifier="1906e699-dc07-1248-2d89-0881192fe955")
public static String es_PE_COLUMN_ProfileInfo_Name="Perfil";

@XendraColumn(AD_Element_ID="77ce72b8-feb1-d63c-1414-d8068d2b9c63",ColumnName="ProfileInfo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1906e699-dc07-1248-2d89-0881192fe955",
Synchronized="2019-08-30 22:23:45.0")
/** Column name ProfileInfo */
public static final String COLUMNNAME_ProfileInfo = "ProfileInfo";
/** Set Issue Project.
@param R_IssueProject_ID Implementation Projects */
public void setR_IssueProject_ID (int R_IssueProject_ID)
{
if (R_IssueProject_ID < 1) throw new IllegalArgumentException ("R_IssueProject_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_R_IssueProject_ID, Integer.valueOf(R_IssueProject_ID));
}
/** Get Issue Project.
@return Implementation Projects */
public int getR_IssueProject_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_R_IssueProject_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="9ddf4939-5154-ba4e-5edb-3c8b47151c76")
public static String es_PE_FIELD_IssueProject_IssueProject_Name="Edición de Proyecto";

@XendraTrl(Identifier="9ddf4939-5154-ba4e-5edb-3c8b47151c76")
public static String es_PE_FIELD_IssueProject_IssueProject_Description="Implementación de Proyectos";

@XendraField(AD_Column_ID="R_IssueProject_ID",IsCentrallyMaintained=true,
AD_Tab_ID="807575fe-04ed-dcef-ade9-650d57646f0b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9ddf4939-5154-ba4e-5edb-3c8b47151c76")
public static final String FIELDNAME_IssueProject_IssueProject="9ddf4939-5154-ba4e-5edb-3c8b47151c76";

@XendraTrl(Identifier="e474b3d3-461c-5eb5-5655-c7d20b5389d4")
public static String es_PE_FIELD_IssueProject_IssueProject2_Name="Edición de Proyecto";

@XendraTrl(Identifier="e474b3d3-461c-5eb5-5655-c7d20b5389d4")
public static String es_PE_FIELD_IssueProject_IssueProject2_Description="Implementación de Proyectos";

@XendraField(AD_Column_ID="R_IssueProject_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e0130fca-4eb4-d95c-5ab8-0fbeb160c40f",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e474b3d3-461c-5eb5-5655-c7d20b5389d4")
public static final String FIELDNAME_IssueProject_IssueProject2="e474b3d3-461c-5eb5-5655-c7d20b5389d4";
/** Column name R_IssueProject_ID */
public static final String COLUMNNAME_R_IssueProject_ID = "R_IssueProject_ID";
/** Set Statistics.
@param StatisticsInfo Information to HELP profiling the system for solving support issues */
public void setStatisticsInfo (String StatisticsInfo)
{
if (StatisticsInfo != null && StatisticsInfo.length() > 60)
{
log.warning("Length > 60 - truncated");
StatisticsInfo = StatisticsInfo.substring(0,59);
}
set_Value (COLUMNNAME_StatisticsInfo, StatisticsInfo);
}
/** Get Statistics.
@return Information to HELP profiling the system for solving support issues */
public String getStatisticsInfo() 
{
String value = (String)get_Value(COLUMNNAME_StatisticsInfo);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="5c6b025e-fc95-0013-e5e4-a8d236f33eca")
public static String es_PE_FIELD_IssueProject_Statistics_Name="Estadística";

@XendraTrl(Identifier="5c6b025e-fc95-0013-e5e4-a8d236f33eca")
public static String es_PE_FIELD_IssueProject_Statistics_Description="Información que ayuda a perfilar el sistema para solucionar ediciones de soporte";

@XendraTrl(Identifier="5c6b025e-fc95-0013-e5e4-a8d236f33eca")
public static String es_PE_FIELD_IssueProject_Statistics_Help="La información de perfil no contiene información confidencial y se utiliza para apoyar la detección y el diagnóstico de la edición así como la estadística anónima en general";

@XendraField(AD_Column_ID="StatisticsInfo",IsCentrallyMaintained=true,
AD_Tab_ID="807575fe-04ed-dcef-ade9-650d57646f0b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5c6b025e-fc95-0013-e5e4-a8d236f33eca")
public static final String FIELDNAME_IssueProject_Statistics="5c6b025e-fc95-0013-e5e4-a8d236f33eca";

@XendraTrl(Identifier="9c81bb6c-954c-d66e-02f2-2957d144c812")
public static String es_PE_FIELD_IssueProject_Statistics2_Name="Estadística";

@XendraTrl(Identifier="9c81bb6c-954c-d66e-02f2-2957d144c812")
public static String es_PE_FIELD_IssueProject_Statistics2_Description="Información que ayuda a perfilar el sistema para solucionar ediciones de soporte";

@XendraTrl(Identifier="9c81bb6c-954c-d66e-02f2-2957d144c812")
public static String es_PE_FIELD_IssueProject_Statistics2_Help="La información de perfil no contiene información confidencial y se utiliza para apoyar la detección y el diagnóstico de la edición así como la estadística anónima en general";

@XendraField(AD_Column_ID="StatisticsInfo",IsCentrallyMaintained=true,
AD_Tab_ID="e0130fca-4eb4-d95c-5ab8-0fbeb160c40f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=30,IsReadOnly=true,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9c81bb6c-954c-d66e-02f2-2957d144c812")
public static final String FIELDNAME_IssueProject_Statistics2="9c81bb6c-954c-d66e-02f2-2957d144c812";

@XendraTrl(Identifier="052ff297-c46b-3f3a-b36c-09403d949a6d")
public static String es_PE_COLUMN_StatisticsInfo_Name="Estadística";

@XendraColumn(AD_Element_ID="cb4e2bb3-3a05-420d-402e-eac787e0151a",ColumnName="StatisticsInfo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="052ff297-c46b-3f3a-b36c-09403d949a6d",
Synchronized="2019-08-30 22:23:45.0")
/** Column name StatisticsInfo */
public static final String COLUMNNAME_StatisticsInfo = "StatisticsInfo";
/** Set System Status.
@param SystemStatus Status of the system - Support priority depends on system status */
public void setSystemStatus (String SystemStatus)
{
if (SystemStatus.length() > 1)
{
log.warning("Length > 1 - truncated");
SystemStatus = SystemStatus.substring(0,0);
}
set_Value (COLUMNNAME_SystemStatus, SystemStatus);
}
/** Get System Status.
@return Status of the system - Support priority depends on system status */
public String getSystemStatus() 
{
return (String)get_Value(COLUMNNAME_SystemStatus);
}

@XendraTrl(Identifier="593571d0-0396-256b-5a96-e030f37d0cba")
public static String es_PE_FIELD_IssueProject_SystemStatus_Name="Estado del Sistema";

@XendraTrl(Identifier="593571d0-0396-256b-5a96-e030f37d0cba")
public static String es_PE_FIELD_IssueProject_SystemStatus_Description="Estado del Sistema - La prioridad del soporte depende del estado del sistema.";

@XendraTrl(Identifier="593571d0-0396-256b-5a96-e030f37d0cba")
public static String es_PE_FIELD_IssueProject_SystemStatus_Help="Estado del Sistema ayuda a priorizar recursos de soporte.";

@XendraField(AD_Column_ID="SystemStatus",IsCentrallyMaintained=true,
AD_Tab_ID="807575fe-04ed-dcef-ade9-650d57646f0b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="593571d0-0396-256b-5a96-e030f37d0cba")
public static final String FIELDNAME_IssueProject_SystemStatus="593571d0-0396-256b-5a96-e030f37d0cba";

@XendraTrl(Identifier="b4e65822-a762-e277-394a-76e099945017")
public static String es_PE_FIELD_IssueProject_SystemStatus2_Name="Estado del Sistema";

@XendraTrl(Identifier="b4e65822-a762-e277-394a-76e099945017")
public static String es_PE_FIELD_IssueProject_SystemStatus2_Description="Estado del Sistema - La prioridad del soporte depende del estado del sistema.";

@XendraTrl(Identifier="b4e65822-a762-e277-394a-76e099945017")
public static String es_PE_FIELD_IssueProject_SystemStatus2_Help="Estado del Sistema ayuda a priorizar recursos de soporte.";

@XendraField(AD_Column_ID="SystemStatus",IsCentrallyMaintained=true,
AD_Tab_ID="e0130fca-4eb4-d95c-5ab8-0fbeb160c40f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b4e65822-a762-e277-394a-76e099945017")
public static final String FIELDNAME_IssueProject_SystemStatus2="b4e65822-a762-e277-394a-76e099945017";

@XendraTrl(Identifier="8fd62b2a-e3ac-b410-adaa-5bc07335ee36")
public static String es_PE_COLUMN_SystemStatus_Name="Estado del Sistema";

@XendraColumn(AD_Element_ID="66b6be12-484d-bb38-e430-af4c3adbdb6a",ColumnName="SystemStatus",
AD_Reference_ID=17,AD_Reference_Value_ID="2aca3aa9-4a75-ed5a-2785-69ad14e5c85d",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="8fd62b2a-e3ac-b410-adaa-5bc07335ee36",Synchronized="2019-08-30 22:23:45.0")
/** Column name SystemStatus */
public static final String COLUMNNAME_SystemStatus = "SystemStatus";
}
