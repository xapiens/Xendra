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
/** Generated Model for AD_InfoColumn
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_InfoColumn extends PO
{
/** Standard Constructor
@param ctx context
@param AD_InfoColumn_ID id
@param trxName transaction
*/
public X_AD_InfoColumn (Properties ctx, int AD_InfoColumn_ID, String trxName)
{
super (ctx, AD_InfoColumn_ID, trxName);
/** if (AD_InfoColumn_ID == 0)
{
setAD_InfoColumn_ID (0);
setAD_InfoWindow_ID (0);
setAD_Reference_ID (0);
setEntityType (null);	
// U
setIsDisplayed (false);	
// N
setIsQueryCriteria (false);	
// N
setName (null);
setSelectClause (null);
setSeqNo (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_InfoColumn (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=897 */
public static int Table_ID=MTable.getTable_ID("AD_InfoColumn");

@XendraTrl(Identifier="27fe45cd-682f-6365-02fc-38186c6f391c")
public static String es_PE_TAB_Column_Description="Info Window Column";

@XendraTrl(Identifier="27fe45cd-682f-6365-02fc-38186c6f391c")
public static String es_PE_TAB_Column_Help="Column in the Info Window for display and/or selection.  If used for selection, the column cannot be a SQL expression. The SQL clause must be fully qualified based on the FROM clause in the Info Window definition";

@XendraTrl(Identifier="27fe45cd-682f-6365-02fc-38186c6f391c")
public static String es_PE_TAB_Column_Name="Column";
@XendraTab(Name="Column",
Description="Info Window Column",
Help="Column in the Info Window for display and/or selection.  If used for selection, the column cannot be a SQL expression. The SQL clause must be fully qualified based on the FROM clause in the Info Window definition",
AD_Window_ID="13edf8fc-28e0-a971-e179-35ed7fc64319",SeqNo=30,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="27fe45cd-682f-6365-02fc-38186c6f391c",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Column="27fe45cd-682f-6365-02fc-38186c6f391c";

@XendraTrl(Identifier="6332479e-2023-2bd3-bfa5-bb5aa54804fd")
public static String es_PE_TABLE_AD_InfoColumn_Name="Info Column";

@XendraTable(Name="Info Column",AD_Package_ID="140d4d0c-8da8-bcb6-9c20-bc776701f80c",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="AD_InfoColumn",AccessLevel="4",AD_Window_ID="13edf8fc-28e0-a971-e179-35ed7fc64319",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.dictionary",
Identifier="6332479e-2023-2bd3-bfa5-bb5aa54804fd",Synchronized="2020-03-03 21:35:05.0")
/** TableName=AD_InfoColumn */
public static final String Table_Name="AD_InfoColumn";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_InfoColumn");

protected BigDecimal accessLevel = BigDecimal.valueOf(4);
/** AccessLevel
@return 4 - System 
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
    Table_ID = MTable.getTable_ID("AD_InfoColumn");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_InfoColumn[").append(get_ID()).append("]");
return sb.toString();
}
/** Set System Element.
@param AD_Element_ID System Element enables the central maintenance of column DESCRIPTION and HELP. */
public void setAD_Element_ID (int AD_Element_ID)
{
if (AD_Element_ID <= 0) set_Value (COLUMNNAME_AD_Element_ID, null);
 else 
set_Value (COLUMNNAME_AD_Element_ID, Integer.valueOf(AD_Element_ID));
}
/** Get System Element.
@return System Element enables the central maintenance of column DESCRIPTION and HELP. */
public int getAD_Element_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Element_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f46110db-a2b6-7fde-99d5-942c75f4e928")
public static String es_PE_FIELD_Column_SystemElement_Name="Elemento";

@XendraTrl(Identifier="f46110db-a2b6-7fde-99d5-942c75f4e928")
public static String es_PE_FIELD_Column_SystemElement_Description="El elemento del sistema permite el mantenimiento central de la descripción y ayuda de la columna";

@XendraTrl(Identifier="f46110db-a2b6-7fde-99d5-942c75f4e928")
public static String es_PE_FIELD_Column_SystemElement_Help="El elemento sistema permite el mantenimiento central de la ayuda descripciones y terminología para una columna base de datos.";

@XendraField(AD_Column_ID="AD_Element_ID",IsCentrallyMaintained=true,
AD_Tab_ID="27fe45cd-682f-6365-02fc-38186c6f391c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f46110db-a2b6-7fde-99d5-942c75f4e928")
public static final String FIELDNAME_Column_SystemElement="f46110db-a2b6-7fde-99d5-942c75f4e928";

@XendraTrl(Identifier="8783662f-5c31-e626-e285-c1588bfb2526")
public static String es_PE_COLUMN_AD_Element_ID_Name="Elemento";

@XendraColumn(AD_Element_ID="ca8e78b4-089d-16d4-cff1-575a3558c7bc",ColumnName="AD_Element_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8783662f-5c31-e626-e285-c1588bfb2526",
Synchronized="2019-08-30 22:20:23.0")
/** Column name AD_Element_ID */
public static final String COLUMNNAME_AD_Element_ID = "AD_Element_ID";
/** Set Info Column.
@param AD_InfoColumn_ID Info Window Column */
public void setAD_InfoColumn_ID (int AD_InfoColumn_ID)
{
if (AD_InfoColumn_ID < 1) throw new IllegalArgumentException ("AD_InfoColumn_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_InfoColumn_ID, Integer.valueOf(AD_InfoColumn_ID));
}
/** Get Info Column.
@return Info Window Column */
public int getAD_InfoColumn_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_InfoColumn_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="c32d8cc6-279f-65ed-8c69-408c93be0bcc")
public static String es_PE_FIELD_Column_InfoColumn_Name="Info Column";

@XendraTrl(Identifier="c32d8cc6-279f-65ed-8c69-408c93be0bcc")
public static String es_PE_FIELD_Column_InfoColumn_Description="Info Window Column";

@XendraTrl(Identifier="c32d8cc6-279f-65ed-8c69-408c93be0bcc")
public static String es_PE_FIELD_Column_InfoColumn_Help="Column in the Info Window for display and/or selection.  If used for selection, the column cannot be a SQL expression. The SQL clause must be fully qualified based on the FROM clause in the Info Window definition";

@XendraField(AD_Column_ID="AD_InfoColumn_ID",IsCentrallyMaintained=true,
AD_Tab_ID="27fe45cd-682f-6365-02fc-38186c6f391c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c32d8cc6-279f-65ed-8c69-408c93be0bcc")
public static final String FIELDNAME_Column_InfoColumn="c32d8cc6-279f-65ed-8c69-408c93be0bcc";
/** Column name AD_InfoColumn_ID */
public static final String COLUMNNAME_AD_InfoColumn_ID = "AD_InfoColumn_ID";
/** Set Info Window.
@param AD_InfoWindow_ID Info and search/select Window */
public void setAD_InfoWindow_ID (int AD_InfoWindow_ID)
{
if (AD_InfoWindow_ID < 1) throw new IllegalArgumentException ("AD_InfoWindow_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_InfoWindow_ID, Integer.valueOf(AD_InfoWindow_ID));
}
/** Get Info Window.
@return Info and search/select Window */
public int getAD_InfoWindow_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_InfoWindow_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="c8f18e4e-24ca-1a33-6846-5e40abd74c93")
public static String es_PE_FIELD_Column_InfoWindow_Name="Info Window";

@XendraTrl(Identifier="c8f18e4e-24ca-1a33-6846-5e40abd74c93")
public static String es_PE_FIELD_Column_InfoWindow_Description="Info and search/select Window";

@XendraTrl(Identifier="c8f18e4e-24ca-1a33-6846-5e40abd74c93")
public static String es_PE_FIELD_Column_InfoWindow_Help="The Info window is used to search and select records as well as display information relevant to the selection.";

@XendraField(AD_Column_ID="AD_InfoWindow_ID",IsCentrallyMaintained=true,
AD_Tab_ID="27fe45cd-682f-6365-02fc-38186c6f391c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c8f18e4e-24ca-1a33-6846-5e40abd74c93")
public static final String FIELDNAME_Column_InfoWindow="c8f18e4e-24ca-1a33-6846-5e40abd74c93";

@XendraTrl(Identifier="78d62bce-1f7a-db8e-ab59-953110c26925")
public static String es_PE_COLUMN_AD_InfoWindow_ID_Name="Info Window";

@XendraColumn(AD_Element_ID="ced33096-7a51-1539-9718-cb66b071c9fd",ColumnName="AD_InfoWindow_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="78d62bce-1f7a-db8e-ab59-953110c26925",
Synchronized="2019-08-30 22:20:24.0")
/** Column name AD_InfoWindow_ID */
public static final String COLUMNNAME_AD_InfoWindow_ID = "AD_InfoWindow_ID";
/** Set Reference.
@param AD_Reference_ID System Reference and Validation */
public void setAD_Reference_ID (int AD_Reference_ID)
{
if (AD_Reference_ID < 1) throw new IllegalArgumentException ("AD_Reference_ID is mandatory.");
set_Value (COLUMNNAME_AD_Reference_ID, Integer.valueOf(AD_Reference_ID));
}
/** Get Reference.
@return System Reference and Validation */
public int getAD_Reference_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Reference_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="97691c48-1f4f-ba3c-ace9-9b8cbe9beda9")
public static String es_PE_FIELD_Column_Reference_Name="Referencia";

@XendraTrl(Identifier="97691c48-1f4f-ba3c-ace9-9b8cbe9beda9")
public static String es_PE_FIELD_Column_Reference_Description="Referencia del Sistema (Lista de Selección)";

@XendraTrl(Identifier="97691c48-1f4f-ba3c-ace9-9b8cbe9beda9")
public static String es_PE_FIELD_Column_Reference_Help="La Referencia indica el tipo de campo de referencia";

@XendraField(AD_Column_ID="AD_Reference_ID",IsCentrallyMaintained=true,
AD_Tab_ID="27fe45cd-682f-6365-02fc-38186c6f391c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="97691c48-1f4f-ba3c-ace9-9b8cbe9beda9")
public static final String FIELDNAME_Column_Reference="97691c48-1f4f-ba3c-ace9-9b8cbe9beda9";

@XendraTrl(Identifier="dcd17e9a-6455-3a7a-4e45-898e0e1ab0e9")
public static String es_PE_COLUMN_AD_Reference_ID_Name="Referencia";

@XendraColumn(AD_Element_ID="bf1912e9-a75f-4e1b-99b4-d04633e7777b",ColumnName="AD_Reference_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="17ec718c-707b-498f-3a6c-e81d1630e510",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="dcd17e9a-6455-3a7a-4e45-898e0e1ab0e9",Synchronized="2019-08-30 22:20:24.0")
/** Column name AD_Reference_ID */
public static final String COLUMNNAME_AD_Reference_ID = "AD_Reference_ID";
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

@XendraTrl(Identifier="a4de5299-db48-ded9-8cd0-c0d9675649dd")
public static String es_PE_FIELD_Column_Description_Name="Observación";

@XendraTrl(Identifier="a4de5299-db48-ded9-8cd0-c0d9675649dd")
public static String es_PE_FIELD_Column_Description_Description="Observación";

@XendraTrl(Identifier="a4de5299-db48-ded9-8cd0-c0d9675649dd")
public static String es_PE_FIELD_Column_Description_Help="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="27fe45cd-682f-6365-02fc-38186c6f391c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=255,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a4de5299-db48-ded9-8cd0-c0d9675649dd")
public static final String FIELDNAME_Column_Description="a4de5299-db48-ded9-8cd0-c0d9675649dd";

@XendraTrl(Identifier="c8e7f950-98e2-3997-b7e1-ec5bdb44b433")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c8e7f950-98e2-3997-b7e1-ec5bdb44b433",
Synchronized="2019-08-30 22:20:24.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Entity Type.
@param EntityType Dictionary Entity Type: Determines ownership and synchronization */
public void setEntityType (String EntityType)
{
if (EntityType.length() > 4)
{
log.warning("Length > 4 - truncated");
EntityType = EntityType.substring(0,3);
}
set_Value (COLUMNNAME_EntityType, EntityType);
}
/** Get Entity Type.
@return Dictionary Entity Type: Determines ownership and synchronization */
public String getEntityType() 
{
return (String)get_Value(COLUMNNAME_EntityType);
}

@XendraTrl(Identifier="a960838d-02a7-9acc-e785-a7b45e1747c6")
public static String es_PE_FIELD_Column_EntityType_Name="Tipo de Entidad";

@XendraTrl(Identifier="a960838d-02a7-9acc-e785-a7b45e1747c6")
public static String es_PE_FIELD_Column_EntityType_Description="Tipo de Entidad Diccionario; determina propiedad y sincronización";

@XendraTrl(Identifier="a960838d-02a7-9acc-e785-a7b45e1747c6")
public static String es_PE_FIELD_Column_EntityType_Help="Los tipos de entidad \"Diccionario\"; \"Adempiere\"; y \"Aplicación\" podrían ser automáticamente sincronizados y las personalizaciones eliminadas ó sobreescritas";

@XendraField(AD_Column_ID="EntityType",IsCentrallyMaintained=true,
AD_Tab_ID="27fe45cd-682f-6365-02fc-38186c6f391c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=4,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a960838d-02a7-9acc-e785-a7b45e1747c6")
public static final String FIELDNAME_Column_EntityType="a960838d-02a7-9acc-e785-a7b45e1747c6";

@XendraTrl(Identifier="99fc503a-beeb-a32a-9df1-f317427729d7")
public static String es_PE_COLUMN_EntityType_Name="Tipo de Entidad";

@XendraColumn(AD_Element_ID="5ba917bf-871c-6f19-aa50-962adc5de558",ColumnName="EntityType",
AD_Reference_ID=18,AD_Reference_Value_ID="fae4ad31-8ff1-5d5c-8d47-2426c541cd74",AD_Val_Rule_ID="",
FieldLength=4,DefaultValue="U",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="@EntityType@=D",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="99fc503a-beeb-a32a-9df1-f317427729d7",Synchronized="2019-08-30 22:20:24.0")
/** Column name EntityType */
public static final String COLUMNNAME_EntityType = "EntityType";
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

@XendraTrl(Identifier="4b975499-a459-74c7-038f-3bb8861f34b9")
public static String es_PE_FIELD_Column_CommentHelp_Name="Ayuda";

@XendraTrl(Identifier="4b975499-a459-74c7-038f-3bb8861f34b9")
public static String es_PE_FIELD_Column_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="4b975499-a459-74c7-038f-3bb8861f34b9")
public static String es_PE_FIELD_Column_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraField(AD_Column_ID="Help",IsCentrallyMaintained=true,
AD_Tab_ID="27fe45cd-682f-6365-02fc-38186c6f391c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=2000,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4b975499-a459-74c7-038f-3bb8861f34b9")
public static final String FIELDNAME_Column_CommentHelp="4b975499-a459-74c7-038f-3bb8861f34b9";

@XendraTrl(Identifier="55a5fc61-0edc-5344-87e4-45bc40ef4bfe")
public static String es_PE_COLUMN_Help_Name="Ayuda";

@XendraColumn(AD_Element_ID="a6fda582-56f9-6bb7-8436-285ce4f8de3f",ColumnName="Help",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="55a5fc61-0edc-5344-87e4-45bc40ef4bfe",
Synchronized="2019-08-30 22:20:24.0")
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
@XendraTrl(Identifier="8b8a2161-0ea0-45b4-bb21-cfa4b4aabc78")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8b8a2161-0ea0-45b4-bb21-cfa4b4aabc78",
Synchronized="2019-08-30 22:20:24.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Displayed.
@param IsDisplayed Determines, if this field is displayed */
public void setIsDisplayed (boolean IsDisplayed)
{
set_Value (COLUMNNAME_IsDisplayed, Boolean.valueOf(IsDisplayed));
}
/** Get Displayed.
@return Determines, if this field is displayed */
public boolean isDisplayed() 
{
Object oo = get_Value(COLUMNNAME_IsDisplayed);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="a2053b96-d426-7705-6e90-cca50b4702d7")
public static String es_PE_FIELD_Column_Displayed_Name="Desplegado";

@XendraTrl(Identifier="a2053b96-d426-7705-6e90-cca50b4702d7")
public static String es_PE_FIELD_Column_Displayed_Description="Determina; si este campo es desplegado";

@XendraTrl(Identifier="a2053b96-d426-7705-6e90-cca50b4702d7")
public static String es_PE_FIELD_Column_Displayed_Help="Si el campo es desplegado; el campo lógica de despliegue determinará en tiempo de ejecución si es actualmente desplegado";

@XendraField(AD_Column_ID="IsDisplayed",IsCentrallyMaintained=true,
AD_Tab_ID="27fe45cd-682f-6365-02fc-38186c6f391c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a2053b96-d426-7705-6e90-cca50b4702d7")
public static final String FIELDNAME_Column_Displayed="a2053b96-d426-7705-6e90-cca50b4702d7";

@XendraTrl(Identifier="c707016e-3600-dfb5-dc9d-f135d1686d5f")
public static String es_PE_COLUMN_IsDisplayed_Name="Desplegado";

@XendraColumn(AD_Element_ID="c1bfb876-0c16-8bbc-3714-fb5c9f0481b5",ColumnName="IsDisplayed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c707016e-3600-dfb5-dc9d-f135d1686d5f",
Synchronized="2019-08-30 22:20:24.0")
/** Column name IsDisplayed */
public static final String COLUMNNAME_IsDisplayed = "IsDisplayed";
/** Set Query Criteria.
@param IsQueryCriteria The column is also used as a query criteria */
public void setIsQueryCriteria (boolean IsQueryCriteria)
{
set_Value (COLUMNNAME_IsQueryCriteria, Boolean.valueOf(IsQueryCriteria));
}
/** Get Query Criteria.
@return The column is also used as a query criteria */
public boolean isQueryCriteria() 
{
Object oo = get_Value(COLUMNNAME_IsQueryCriteria);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="f316e896-6602-0b66-0d08-25b8c5d03ecc")
public static String es_PE_FIELD_Column_QueryCriteria_Name="Query Criteria";

@XendraTrl(Identifier="f316e896-6602-0b66-0d08-25b8c5d03ecc")
public static String es_PE_FIELD_Column_QueryCriteria_Description="The column is also used as a query criteria";

@XendraTrl(Identifier="f316e896-6602-0b66-0d08-25b8c5d03ecc")
public static String es_PE_FIELD_Column_QueryCriteria_Help="The column is used to enter queries - the SQL cannot be an expression";

@XendraField(AD_Column_ID="IsQueryCriteria",IsCentrallyMaintained=true,
AD_Tab_ID="27fe45cd-682f-6365-02fc-38186c6f391c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f316e896-6602-0b66-0d08-25b8c5d03ecc")
public static final String FIELDNAME_Column_QueryCriteria="f316e896-6602-0b66-0d08-25b8c5d03ecc";

@XendraTrl(Identifier="794a494e-56fe-fdd8-2528-0e23140c4b8d")
public static String es_PE_COLUMN_IsQueryCriteria_Name="Query Criteria";

@XendraColumn(AD_Element_ID="d8e8da31-f82a-9816-9d3e-21d9f60b24cb",ColumnName="IsQueryCriteria",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="794a494e-56fe-fdd8-2528-0e23140c4b8d",
Synchronized="2019-08-30 22:20:24.0")
/** Column name IsQueryCriteria */
public static final String COLUMNNAME_IsQueryCriteria = "IsQueryCriteria";
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

@XendraTrl(Identifier="35934bbd-f918-d0ca-52cc-46193f844e6c")
public static String es_PE_FIELD_Column_Name_Name="Nombre";

@XendraTrl(Identifier="35934bbd-f918-d0ca-52cc-46193f844e6c")
public static String es_PE_FIELD_Column_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="35934bbd-f918-d0ca-52cc-46193f844e6c")
public static String es_PE_FIELD_Column_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="27fe45cd-682f-6365-02fc-38186c6f391c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=120,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="35934bbd-f918-d0ca-52cc-46193f844e6c")
public static final String FIELDNAME_Column_Name="35934bbd-f918-d0ca-52cc-46193f844e6c";

@XendraTrl(Identifier="71070216-b4a5-86c8-fb7e-7741bbeb261a")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=120,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="71070216-b4a5-86c8-fb7e-7741bbeb261a",
Synchronized="2019-08-30 22:20:24.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Sql SELECT.
@param SelectClause SQL SELECT clause */
public void setSelectClause (String SelectClause)
{
if (SelectClause == null) throw new IllegalArgumentException ("SelectClause is mandatory.");
if (SelectClause.length() > 255)
{
log.warning("Length > 255 - truncated");
SelectClause = SelectClause.substring(0,254);
}
set_Value (COLUMNNAME_SelectClause, SelectClause);
}
/** Get Sql SELECT.
@return SQL SELECT clause */
public String getSelectClause() 
{
String value = (String)get_Value(COLUMNNAME_SelectClause);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="64863c71-fca2-8c1d-2230-6ba8e963442a")
public static String es_PE_FIELD_Column_SqlSELECT_Name="Cláusula Select ";

@XendraTrl(Identifier="64863c71-fca2-8c1d-2230-6ba8e963442a")
public static String es_PE_FIELD_Column_SqlSELECT_Description="Seleccione la cláusula";

@XendraTrl(Identifier="64863c71-fca2-8c1d-2230-6ba8e963442a")
public static String es_PE_FIELD_Column_SqlSELECT_Help="La Cláusula Select indica la cláusula SQL SELECT a usar para seleccionar el registro en un cálculo de medida";

@XendraField(AD_Column_ID="SelectClause",IsCentrallyMaintained=true,
AD_Tab_ID="27fe45cd-682f-6365-02fc-38186c6f391c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=255,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="64863c71-fca2-8c1d-2230-6ba8e963442a")
public static final String FIELDNAME_Column_SqlSELECT="64863c71-fca2-8c1d-2230-6ba8e963442a";

@XendraTrl(Identifier="69371332-7e85-7d21-a001-68cbeb7f1d13")
public static String es_PE_COLUMN_SelectClause_Name="Cláusula Select ";

@XendraColumn(AD_Element_ID="0cde47ad-0d12-516f-0d2f-d5ecebf7514e",ColumnName="SelectClause",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="69371332-7e85-7d21-a001-68cbeb7f1d13",
Synchronized="2019-08-30 22:20:24.0")
/** Column name SelectClause */
public static final String COLUMNNAME_SelectClause = "SelectClause";
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

@XendraTrl(Identifier="975bdb37-8102-0126-c90b-195239bd008c")
public static String es_PE_FIELD_Column_Sequence_Name="Secuencia";

@XendraTrl(Identifier="975bdb37-8102-0126-c90b-195239bd008c")
public static String es_PE_FIELD_Column_Sequence_Description="Método de ordenar registros; el número más bajo viene primero";

@XendraTrl(Identifier="975bdb37-8102-0126-c90b-195239bd008c")
public static String es_PE_FIELD_Column_Sequence_Help="La Secuencia indica el orden de los registros";

@XendraField(AD_Column_ID="SeqNo",IsCentrallyMaintained=true,
AD_Tab_ID="27fe45cd-682f-6365-02fc-38186c6f391c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="975bdb37-8102-0126-c90b-195239bd008c")
public static final String FIELDNAME_Column_Sequence="975bdb37-8102-0126-c90b-195239bd008c";

@XendraTrl(Identifier="51e82646-4d7e-f9da-407f-afaf2cb81cca")
public static String es_PE_COLUMN_SeqNo_Name="Secuencia";

@XendraColumn(AD_Element_ID="38fa26fe-b59d-fce1-c129-420b57da738b",ColumnName="SeqNo",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="51e82646-4d7e-f9da-407f-afaf2cb81cca",
Synchronized="2019-08-30 22:20:24.0")
/** Column name SeqNo */
public static final String COLUMNNAME_SeqNo = "SeqNo";
}
