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
/** Generated Model for C_JobCategory
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_JobCategory extends PO
{
/** Standard Constructor
@param ctx context
@param C_JobCategory_ID id
@param trxName transaction
*/
public X_C_JobCategory (Properties ctx, int C_JobCategory_ID, String trxName)
{
super (ctx, C_JobCategory_ID, trxName);
/** if (C_JobCategory_ID == 0)
{
setC_JobCategory_ID (0);
setName (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_JobCategory (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=790 */
public static int Table_ID=MTable.getTable_ID("C_JobCategory");

@XendraTrl(Identifier="13800dd0-4a22-a410-1d06-46c2a68a2b1b")
public static String es_PE_TAB_PositionCategory_Description="Mantener Categoria de la Posición";

@XendraTrl(Identifier="13800dd0-4a22-a410-1d06-46c2a68a2b1b")
public static String es_PE_TAB_PositionCategory_Name="Categoria de la Posición";

@XendraTab(Name="Position Category",Description="Maintain Job Position Categories",Help="",
AD_Window_ID="8f3fd243-9415-d601-03e2-35db61709803",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="13800dd0-4a22-a410-1d06-46c2a68a2b1b",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_PositionCategory="13800dd0-4a22-a410-1d06-46c2a68a2b1b";

@XendraTrl(Identifier="f88f9765-5762-4b70-f200-d4e2a39b1be0")
public static String es_PE_TABLE_C_JobCategory_Name="Categoría de Posición";

@XendraTable(Name="Position Category",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="C_JobCategory",AccessLevel="2",AD_Window_ID="8f3fd243-9415-d601-03e2-35db61709803",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=135,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="f88f9765-5762-4b70-f200-d4e2a39b1be0",Synchronized="2020-03-03 21:37:09.0")
/** TableName=C_JobCategory */
public static final String Table_Name="C_JobCategory";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_JobCategory");

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
    Table_ID = MTable.getTable_ID("C_JobCategory");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_JobCategory[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Position Category.
@param C_JobCategory_ID Job Position Category */
public void setC_JobCategory_ID (int C_JobCategory_ID)
{
if (C_JobCategory_ID < 1) throw new IllegalArgumentException ("C_JobCategory_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_JobCategory_ID, Integer.valueOf(C_JobCategory_ID));
}
/** Get Position Category.
@return Job Position Category */
public int getC_JobCategory_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_JobCategory_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="0439409d-db23-5b97-05a7-92e4962f45d1")
public static String es_PE_FIELD_PositionCategory_PositionCategory_Name="Categoría de Posición";

@XendraTrl(Identifier="0439409d-db23-5b97-05a7-92e4962f45d1")
public static String es_PE_FIELD_PositionCategory_PositionCategory_Description="Categoría de posición del trabajo";

@XendraTrl(Identifier="0439409d-db23-5b97-05a7-92e4962f45d1")
public static String es_PE_FIELD_PositionCategory_PositionCategory_Help="Clasificación de las posiciones de trabajo";

@XendraField(AD_Column_ID="C_JobCategory_ID",IsCentrallyMaintained=true,
AD_Tab_ID="13800dd0-4a22-a410-1d06-46c2a68a2b1b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0439409d-db23-5b97-05a7-92e4962f45d1")
public static final String FIELDNAME_PositionCategory_PositionCategory="0439409d-db23-5b97-05a7-92e4962f45d1";
/** Column name C_JobCategory_ID */
public static final String COLUMNNAME_C_JobCategory_ID = "C_JobCategory_ID";
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

@XendraTrl(Identifier="555a6920-ae5a-f0ad-dc50-fe07acaab9d6")
public static String es_PE_FIELD_PositionCategory_Description_Name="Observación";

@XendraTrl(Identifier="555a6920-ae5a-f0ad-dc50-fe07acaab9d6")
public static String es_PE_FIELD_PositionCategory_Description_Description="Observación";

@XendraTrl(Identifier="555a6920-ae5a-f0ad-dc50-fe07acaab9d6")
public static String es_PE_FIELD_PositionCategory_Description_Help="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="13800dd0-4a22-a410-1d06-46c2a68a2b1b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="555a6920-ae5a-f0ad-dc50-fe07acaab9d6")
public static final String FIELDNAME_PositionCategory_Description="555a6920-ae5a-f0ad-dc50-fe07acaab9d6";

@XendraTrl(Identifier="0ad1c2da-679b-8242-eb50-12b292ac00e9")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0ad1c2da-679b-8242-eb50-12b292ac00e9",
Synchronized="2019-08-30 22:21:46.0")
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

@XendraTrl(Identifier="8f313971-732a-a400-28ba-58e817ddcee4")
public static String es_PE_FIELD_PositionCategory_CommentHelp_Name="Ayuda";

@XendraTrl(Identifier="8f313971-732a-a400-28ba-58e817ddcee4")
public static String es_PE_FIELD_PositionCategory_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="8f313971-732a-a400-28ba-58e817ddcee4")
public static String es_PE_FIELD_PositionCategory_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraField(AD_Column_ID="Help",IsCentrallyMaintained=true,
AD_Tab_ID="13800dd0-4a22-a410-1d06-46c2a68a2b1b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8f313971-732a-a400-28ba-58e817ddcee4")
public static final String FIELDNAME_PositionCategory_CommentHelp="8f313971-732a-a400-28ba-58e817ddcee4";

@XendraTrl(Identifier="a98308ad-2562-64d6-1a19-c8683bd9faa6")
public static String es_PE_COLUMN_Help_Name="Ayuda";

@XendraColumn(AD_Element_ID="a6fda582-56f9-6bb7-8436-285ce4f8de3f",ColumnName="Help",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a98308ad-2562-64d6-1a19-c8683bd9faa6",
Synchronized="2019-08-30 22:21:46.0")
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
@XendraTrl(Identifier="b967e250-a3df-4d53-9acc-0a77e8a337ae")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b967e250-a3df-4d53-9acc-0a77e8a337ae",
Synchronized="2019-08-30 22:21:46.0")
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

@XendraTrl(Identifier="35603d3c-a231-6825-c51c-dd52fcd8bc24")
public static String es_PE_FIELD_PositionCategory_Name_Name="Nombre";

@XendraTrl(Identifier="35603d3c-a231-6825-c51c-dd52fcd8bc24")
public static String es_PE_FIELD_PositionCategory_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="35603d3c-a231-6825-c51c-dd52fcd8bc24")
public static String es_PE_FIELD_PositionCategory_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="13800dd0-4a22-a410-1d06-46c2a68a2b1b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=30,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="35603d3c-a231-6825-c51c-dd52fcd8bc24")
public static final String FIELDNAME_PositionCategory_Name="35603d3c-a231-6825-c51c-dd52fcd8bc24";

@XendraTrl(Identifier="beda5e4f-73e0-7d0f-3521-17b5dd5c9431")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="beda5e4f-73e0-7d0f-3521-17b5dd5c9431",
Synchronized="2019-08-30 22:21:46.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
}
