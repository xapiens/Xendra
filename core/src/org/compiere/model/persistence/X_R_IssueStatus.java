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
/** Generated Model for R_IssueStatus
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_R_IssueStatus extends PO
{
/** Standard Constructor
@param ctx context
@param R_IssueStatus_ID id
@param trxName transaction
*/
public X_R_IssueStatus (Properties ctx, int R_IssueStatus_ID, String trxName)
{
super (ctx, R_IssueStatus_ID, trxName);
/** if (R_IssueStatus_ID == 0)
{
setName (null);
setR_IssueStatus_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_R_IssueStatus (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=838 */
public static int Table_ID=MTable.getTable_ID("R_IssueStatus");

@XendraTrl(Identifier="dd965732-3a5a-08a0-d22d-1cae2fd1904e")
public static String es_PE_TAB_IssueStatus_Description="Mantener estado de un surtimiento";

@XendraTrl(Identifier="dd965732-3a5a-08a0-d22d-1cae2fd1904e")
public static String es_PE_TAB_IssueStatus_Help="Estado de un Surtimiento";

@XendraTrl(Identifier="dd965732-3a5a-08a0-d22d-1cae2fd1904e")
public static String es_PE_TAB_IssueStatus_Name="Estado Surtimiento";

@XendraTab(Name="Issue Status",Description="Maintain Status of an Issue",Help="Status of an Issue",
AD_Window_ID="73e17226-1c89-3760-7260-13c9f5628966",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="dd965732-3a5a-08a0-d22d-1cae2fd1904e",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_IssueStatus="dd965732-3a5a-08a0-d22d-1cae2fd1904e";

@XendraTrl(Identifier="9c1aea83-ab84-9185-e61e-894d3099167b")
public static String es_PE_TABLE_R_IssueStatus_Name="Estado de Edición ";

@XendraTable(Name="Issue Status",AD_Package_ID="1b3656e5-71c7-1296-994e-9b2c4549c7fd",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="R_IssueStatus",AccessLevel="6",AD_Window_ID="73e17226-1c89-3760-7260-13c9f5628966",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=135,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.standard",
Identifier="9c1aea83-ab84-9185-e61e-894d3099167b",Synchronized="2020-03-03 21:39:32.0")
/** TableName=R_IssueStatus */
public static final String Table_Name="R_IssueStatus";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"R_IssueStatus");

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
    Table_ID = MTable.getTable_ID("R_IssueStatus");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_R_IssueStatus[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="c39d123b-847b-7104-e8d0-b8928ab5d488")
public static String es_PE_FIELD_IssueStatus_Description_Name="Observación";

@XendraTrl(Identifier="c39d123b-847b-7104-e8d0-b8928ab5d488")
public static String es_PE_FIELD_IssueStatus_Description_Description="Observación";

@XendraTrl(Identifier="c39d123b-847b-7104-e8d0-b8928ab5d488")
public static String es_PE_FIELD_IssueStatus_Description_Help="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="dd965732-3a5a-08a0-d22d-1cae2fd1904e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=255,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c39d123b-847b-7104-e8d0-b8928ab5d488")
public static final String FIELDNAME_IssueStatus_Description="c39d123b-847b-7104-e8d0-b8928ab5d488";

@XendraTrl(Identifier="84856ee3-0b41-c9bd-98ee-f308062f1d0a")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="84856ee3-0b41-c9bd-98ee-f308062f1d0a",
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
@XendraTrl(Identifier="7081b0f1-657d-4cfd-b3d3-87eebcea5a8b")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7081b0f1-657d-4cfd-b3d3-87eebcea5a8b",
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

@XendraTrl(Identifier="d575ff03-e59f-6f03-0264-0f90227b25fe")
public static String es_PE_FIELD_IssueStatus_Name_Name="Nombre";

@XendraTrl(Identifier="d575ff03-e59f-6f03-0264-0f90227b25fe")
public static String es_PE_FIELD_IssueStatus_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="d575ff03-e59f-6f03-0264-0f90227b25fe")
public static String es_PE_FIELD_IssueStatus_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="dd965732-3a5a-08a0-d22d-1cae2fd1904e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=120,IsReadOnly=false,SeqNo=30,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d575ff03-e59f-6f03-0264-0f90227b25fe")
public static final String FIELDNAME_IssueStatus_Name="d575ff03-e59f-6f03-0264-0f90227b25fe";

@XendraTrl(Identifier="e5c45015-8522-c750-0a5f-a6603a4c8fb8")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=120,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e5c45015-8522-c750-0a5f-a6603a4c8fb8",
Synchronized="2019-08-30 22:23:45.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Issue Status.
@param R_IssueStatus_ID Status of an Issue */
public void setR_IssueStatus_ID (int R_IssueStatus_ID)
{
if (R_IssueStatus_ID < 1) throw new IllegalArgumentException ("R_IssueStatus_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_R_IssueStatus_ID, Integer.valueOf(R_IssueStatus_ID));
}
/** Get Issue Status.
@return Status of an Issue */
public int getR_IssueStatus_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_R_IssueStatus_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="801e1fa5-64d5-a346-cb67-ce0bf76e4d84")
public static String es_PE_FIELD_IssueStatus_IssueStatus_Name="Estado de Edición ";

@XendraTrl(Identifier="801e1fa5-64d5-a346-cb67-ce0bf76e4d84")
public static String es_PE_FIELD_IssueStatus_IssueStatus_Description="Status of an Issue";

@XendraTrl(Identifier="801e1fa5-64d5-a346-cb67-ce0bf76e4d84")
public static String es_PE_FIELD_IssueStatus_IssueStatus_Help="Estado de una Edición.";

@XendraField(AD_Column_ID="R_IssueStatus_ID",IsCentrallyMaintained=true,
AD_Tab_ID="dd965732-3a5a-08a0-d22d-1cae2fd1904e",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="801e1fa5-64d5-a346-cb67-ce0bf76e4d84")
public static final String FIELDNAME_IssueStatus_IssueStatus="801e1fa5-64d5-a346-cb67-ce0bf76e4d84";
/** Column name R_IssueStatus_ID */
public static final String COLUMNNAME_R_IssueStatus_ID = "R_IssueStatus_ID";
}
