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
/** Generated Model for R_IssueRecommendation
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_R_IssueRecommendation extends PO
{
/** Standard Constructor
@param ctx context
@param R_IssueRecommendation_ID id
@param trxName transaction
*/
public X_R_IssueRecommendation (Properties ctx, int R_IssueRecommendation_ID, String trxName)
{
super (ctx, R_IssueRecommendation_ID, trxName);
/** if (R_IssueRecommendation_ID == 0)
{
setName (null);
setR_IssueRecommendation_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_R_IssueRecommendation (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=837 */
public static int Table_ID=MTable.getTable_ID("R_IssueRecommendation");

@XendraTrl(Identifier="aa1f1a38-81a5-46ed-ed79-3d41beecaa53")
public static String es_PE_TAB_IssueRecommendation_Description="Mantener Recomendación de Surtimiento";

@XendraTrl(Identifier="aa1f1a38-81a5-46ed-ed79-3d41beecaa53")
public static String es_PE_TAB_IssueRecommendation_Help="Recomendaciones sobre como fijar un surtimiento.";

@XendraTrl(Identifier="aa1f1a38-81a5-46ed-ed79-3d41beecaa53")
public static String es_PE_TAB_IssueRecommendation_Name="Recomendación Surtimiento";

@XendraTab(Name="Issue Recommendation",Description="Maintain Issue Recommendation",
Help="Recommendations how to fix an Issue",AD_Window_ID="710417ee-5cdc-d4d7-5d8a-ee10a1d94d5a",
SeqNo=10,TabLevel=0,IsSingleRow=false,IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="",HasTree=false,WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",
AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",
ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="aa1f1a38-81a5-46ed-ed79-3d41beecaa53",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_IssueRecommendation="aa1f1a38-81a5-46ed-ed79-3d41beecaa53";

@XendraTrl(Identifier="46aa2e58-ad63-15f3-268e-6c4d24c178c9")
public static String es_PE_TABLE_R_IssueRecommendation_Name="Edición de Recomendación";


@XendraTable(Name="Issue Recommendation",AD_Package_ID="1b3656e5-71c7-1296-994e-9b2c4549c7fd",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="R_IssueRecommendation",AccessLevel="6",
AD_Window_ID="710417ee-5cdc-d4d7-5d8a-ee10a1d94d5a",AD_Val_Rule_ID="",IsKey=1,LoadSeq=135,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.standard",Identifier="46aa2e58-ad63-15f3-268e-6c4d24c178c9",
Synchronized="2020-03-03 21:39:31.0")
/** TableName=R_IssueRecommendation */
public static final String Table_Name="R_IssueRecommendation";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"R_IssueRecommendation");

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
    Table_ID = MTable.getTable_ID("R_IssueRecommendation");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_R_IssueRecommendation[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="df6b4f1a-bdac-9828-5cfc-7c15e04fe586")
public static String es_PE_FIELD_IssueRecommendation_Description_Name="Observación";

@XendraTrl(Identifier="df6b4f1a-bdac-9828-5cfc-7c15e04fe586")
public static String es_PE_FIELD_IssueRecommendation_Description_Description="Observación";

@XendraTrl(Identifier="df6b4f1a-bdac-9828-5cfc-7c15e04fe586")
public static String es_PE_FIELD_IssueRecommendation_Description_Help="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="aa1f1a38-81a5-46ed-ed79-3d41beecaa53",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=255,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="df6b4f1a-bdac-9828-5cfc-7c15e04fe586")
public static final String FIELDNAME_IssueRecommendation_Description="df6b4f1a-bdac-9828-5cfc-7c15e04fe586";

@XendraTrl(Identifier="04fa6fab-8054-947e-4ea7-b908124fa7af")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="04fa6fab-8054-947e-4ea7-b908124fa7af",
Synchronized="2019-08-30 22:23:45.0")
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

@XendraTrl(Identifier="ea6443a2-c87f-dd54-90f8-50f30be795b9")
public static String es_PE_FIELD_IssueRecommendation_CommentHelp_Name="Ayuda";

@XendraTrl(Identifier="ea6443a2-c87f-dd54-90f8-50f30be795b9")
public static String es_PE_FIELD_IssueRecommendation_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="ea6443a2-c87f-dd54-90f8-50f30be795b9")
public static String es_PE_FIELD_IssueRecommendation_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraField(AD_Column_ID="Help",IsCentrallyMaintained=true,
AD_Tab_ID="aa1f1a38-81a5-46ed-ed79-3d41beecaa53",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=2000,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ea6443a2-c87f-dd54-90f8-50f30be795b9")
public static final String FIELDNAME_IssueRecommendation_CommentHelp="ea6443a2-c87f-dd54-90f8-50f30be795b9";

@XendraTrl(Identifier="91ecc02d-7078-33a0-f105-eecb5706c38d")
public static String es_PE_COLUMN_Help_Name="Ayuda";

@XendraColumn(AD_Element_ID="a6fda582-56f9-6bb7-8436-285ce4f8de3f",ColumnName="Help",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="91ecc02d-7078-33a0-f105-eecb5706c38d",
Synchronized="2019-08-30 22:23:45.0")
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
@XendraTrl(Identifier="7b70a404-75c0-4760-84c7-8c3e6558c96a")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7b70a404-75c0-4760-84c7-8c3e6558c96a",
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

@XendraTrl(Identifier="1c3a073a-9834-d6d9-2381-ab814b89f59c")
public static String es_PE_FIELD_IssueRecommendation_Name_Name="Nombre";

@XendraTrl(Identifier="1c3a073a-9834-d6d9-2381-ab814b89f59c")
public static String es_PE_FIELD_IssueRecommendation_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="1c3a073a-9834-d6d9-2381-ab814b89f59c")
public static String es_PE_FIELD_IssueRecommendation_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="aa1f1a38-81a5-46ed-ed79-3d41beecaa53",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=120,IsReadOnly=false,SeqNo=30,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1c3a073a-9834-d6d9-2381-ab814b89f59c")
public static final String FIELDNAME_IssueRecommendation_Name="1c3a073a-9834-d6d9-2381-ab814b89f59c";

@XendraTrl(Identifier="ba27682f-8c34-1162-d732-a3e7d24e5ec2")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=120,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ba27682f-8c34-1162-d732-a3e7d24e5ec2",
Synchronized="2019-08-30 22:23:45.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Issue Recommendation.
@param R_IssueRecommendation_ID Recommendations how to fix an Issue */
public void setR_IssueRecommendation_ID (int R_IssueRecommendation_ID)
{
if (R_IssueRecommendation_ID < 1) throw new IllegalArgumentException ("R_IssueRecommendation_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_R_IssueRecommendation_ID, Integer.valueOf(R_IssueRecommendation_ID));
}
/** Get Issue Recommendation.
@return Recommendations how to fix an Issue */
public int getR_IssueRecommendation_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_R_IssueRecommendation_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="5f0bc6f9-a1f4-46bf-bd88-7a3e6dbe3e5e")
public static String es_PE_FIELD_IssueRecommendation_IssueRecommendation_Name="Edición de Recomendación";

@XendraTrl(Identifier="5f0bc6f9-a1f4-46bf-bd88-7a3e6dbe3e5e")
public static String es_PE_FIELD_IssueRecommendation_IssueRecommendation_Description="Recomendaciones cómo fijar una edición";

@XendraTrl(Identifier="5f0bc6f9-a1f4-46bf-bd88-7a3e6dbe3e5e")
public static String es_PE_FIELD_IssueRecommendation_IssueRecommendation_Help="Recomendaciones cómo fijar una edición.";

@XendraField(AD_Column_ID="R_IssueRecommendation_ID",IsCentrallyMaintained=true,
AD_Tab_ID="aa1f1a38-81a5-46ed-ed79-3d41beecaa53",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5f0bc6f9-a1f4-46bf-bd88-7a3e6dbe3e5e")
public static final String FIELDNAME_IssueRecommendation_IssueRecommendation="5f0bc6f9-a1f4-46bf-bd88-7a3e6dbe3e5e";
/** Column name R_IssueRecommendation_ID */
public static final String COLUMNNAME_R_IssueRecommendation_ID = "R_IssueRecommendation_ID";
}
