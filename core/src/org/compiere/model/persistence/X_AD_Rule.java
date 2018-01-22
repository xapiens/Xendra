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
import org.compiere.model.reference.REF_AD_TableAccessLevels;
import org.compiere.model.reference.REF_AD_Rule_EventType;
import org.compiere.model.reference.REF_RuleType;
/** Generated Model for AD_Rule
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_Rule extends PO
{
/** Standard Constructor
@param ctx context
@param AD_Rule_ID id
@param trxName transaction
*/
public X_AD_Rule (Properties ctx, int AD_Rule_ID, String trxName)
{
super (ctx, AD_Rule_ID, trxName);
/** if (AD_Rule_ID == 0)
{
setAD_Rule_ID (0);
setName (null);
setValue (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_Rule (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000191 */
public static int Table_ID=MTable.getTable_ID("AD_Rule");

@XendraTrl(Identifier="98d70b82-149a-48c0-8489-98148daf80e9")
public static String es_PE_TAB_Rules_Name="Rules";
@XendraTab(Name="Rules",Description="",Help="",
AD_Window_ID="96cf741b-1e49-4271-a7bd-13e9c160d692",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=true,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="98d70b82-149a-48c0-8489-98148daf80e9",Synchronized="2016-07-21 05:22:41.0")
public static final String TABNAME_Rules="98d70b82-149a-48c0-8489-98148daf80e9";

@XendraTrl(Identifier="483ec280-ce75-1230-5d5d-72305ef742b0")
public static String es_PE_TABLE_AD_Rule_Name="AD_Rule";

@XendraTable(Name="AD_Rule",Description="",Help="",TableName="AD_Rule",AccessLevel="4",
AD_Window_ID="96cf741b-1e49-4271-a7bd-13e9c160d692",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,
IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=false,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.request",Identifier="483ec280-ce75-1230-5d5d-72305ef742b0",
Synchronized="2017-08-16 11:40:58.0")
/** TableName=AD_Rule */
public static final String Table_Name="AD_Rule";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_Rule");

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
    Table_ID = MTable.getTable_ID("AD_Rule");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_Rule[").append(get_ID()).append("]");
return sb.toString();
}

/** AccessLevel AD_Reference=5684046b-00f0-a17c-843e-efad2b0e42f3 */
public static final int ACCESSLEVEL_AD_Reference_ID=5;
/** Set Data Access Level.
@param AccessLevel Access Level required */
public void setAccessLevel (String AccessLevel)
{
if (AccessLevel == null || AccessLevel.equals(REF_AD_TableAccessLevels.SystemPlusClient) || AccessLevel.equals(REF_AD_TableAccessLevels.ClientOnly) || AccessLevel.equals(REF_AD_TableAccessLevels.Organization) || AccessLevel.equals(REF_AD_TableAccessLevels.ClientPlusOrganization) || AccessLevel.equals(REF_AD_TableAccessLevels.SystemOnly) || AccessLevel.equals(REF_AD_TableAccessLevels.All));
 else throw new IllegalArgumentException ("AccessLevel Invalid value - " + AccessLevel + " - Reference_ID=5 - 6 - 2 - 1 - 3 - 4 - 7");
if (AccessLevel != null && AccessLevel.length() > 1)
{
log.warning("Length > 1 - truncated");
AccessLevel = AccessLevel.substring(0,0);
}
set_Value (COLUMNNAME_AccessLevel, AccessLevel);
}
/** Get Data Access Level.
@return Access Level required */
public String getAccessLevel() 
{
return (String)get_Value(COLUMNNAME_AccessLevel);
}

@XendraTrl(Identifier="c2272dd2-b613-4300-bada-01141bc74109")
public static String es_PE_FIELD_Rules_DataAccessLevel_Description="Nivel de Acceso requerido";

@XendraTrl(Identifier="c2272dd2-b613-4300-bada-01141bc74109")
public static String es_PE_FIELD_Rules_DataAccessLevel_Help="Indica el nivel de acceso requerido para este registro ó proceso";

@XendraTrl(Identifier="c2272dd2-b613-4300-bada-01141bc74109")
public static String es_PE_FIELD_Rules_DataAccessLevel_Name="Nivel de Acceso a Datos";

@XendraField(AD_Column_ID="AccessLevel",IsCentrallyMaintained=true,
AD_Tab_ID="98d70b82-149a-48c0-8489-98148daf80e9",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-07-21 05:22:41.0",
Identifier="c2272dd2-b613-4300-bada-01141bc74109")
public static final String FIELDNAME_Rules_DataAccessLevel="c2272dd2-b613-4300-bada-01141bc74109";

@XendraTrl(Identifier="d19d5399-ad38-3a76-4be0-e80c93601764")
public static String es_PE_COLUMN_AccessLevel_Name="Data Access Level";

@XendraColumn(AD_Element_ID="bd129648-2bd8-10dc-6b09-97aa41aa28e2",ColumnName="AccessLevel",
AD_Reference_ID=17,AD_Reference_Value_ID="5684046b-00f0-a17c-843e-efad2b0e42f3",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="4",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="d19d5399-ad38-3a76-4be0-e80c93601764",Synchronized="2017-08-05 16:52:49.0")
/** Column name AccessLevel */
public static final String COLUMNNAME_AccessLevel = "AccessLevel";
/** Set AD_Rule_ID.
@param AD_Rule_ID AD_Rule_ID */
public void setAD_Rule_ID (int AD_Rule_ID)
{
if (AD_Rule_ID < 1) throw new IllegalArgumentException ("AD_Rule_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_Rule_ID, Integer.valueOf(AD_Rule_ID));
}
/** Get AD_Rule_ID.
@return AD_Rule_ID */
public int getAD_Rule_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Rule_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="3e460d8e-09d3-4077-be36-3180a8eb2567")
public static String es_PE_FIELD_Rules_AD_Rule_ID_Name="Rule";

@XendraField(AD_Column_ID="AD_Rule_ID",IsCentrallyMaintained=true,
AD_Tab_ID="98d70b82-149a-48c0-8489-98148daf80e9",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-07-21 05:22:41.0",
Identifier="3e460d8e-09d3-4077-be36-3180a8eb2567")
public static final String FIELDNAME_Rules_AD_Rule_ID="3e460d8e-09d3-4077-be36-3180a8eb2567";
/** Column name AD_Rule_ID */
public static final String COLUMNNAME_AD_Rule_ID = "AD_Rule_ID";
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

@XendraTrl(Identifier="99ac6157-24e3-426f-bf15-dbfaf87d8034")
public static String es_PE_FIELD_Rules_Description_Description="Descripción corta opcional del registro";

@XendraTrl(Identifier="99ac6157-24e3-426f-bf15-dbfaf87d8034")
public static String es_PE_FIELD_Rules_Description_Help="Una descripción esta limitada a 255 caracteres";

@XendraTrl(Identifier="99ac6157-24e3-426f-bf15-dbfaf87d8034")
public static String es_PE_FIELD_Rules_Description_Name="Descripción";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="98d70b82-149a-48c0-8489-98148daf80e9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=255,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-07-21 05:22:41.0",
Identifier="99ac6157-24e3-426f-bf15-dbfaf87d8034")
public static final String FIELDNAME_Rules_Description="99ac6157-24e3-426f-bf15-dbfaf87d8034";

@XendraTrl(Identifier="f2cae7bc-ec84-045a-2ed2-d2c4935bc743")
public static String es_PE_COLUMN_Description_Name="Description";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f2cae7bc-ec84-045a-2ed2-d2c4935bc743",
Synchronized="2017-08-05 16:52:49.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";

/** EntityType AD_Reference=fae4ad31-8ff1-5d5c-8d47-2426c541cd74 */
public static final int ENTITYTYPE_AD_Reference_ID=389;
/** Set Entity Type.
@param EntityType Dictionary Entity Type: Determines ownership and synchronization */
public void setEntityType (String EntityType)
{
if (EntityType != null && EntityType.length() > 40)
{
log.warning("Length > 40 - truncated");
EntityType = EntityType.substring(0,39);
}
set_Value (COLUMNNAME_EntityType, EntityType);
}
/** Get Entity Type.
@return Dictionary Entity Type: Determines ownership and synchronization */
public String getEntityType() 
{
return (String)get_Value(COLUMNNAME_EntityType);
}

@XendraTrl(Identifier="cc7dc81e-63b9-4962-905e-ec1330abaf77")
public static String es_PE_FIELD_Rules_EntityType_Description="Tipo de Entidad Diccionario; determina propiedad y sincronización";

@XendraTrl(Identifier="cc7dc81e-63b9-4962-905e-ec1330abaf77")
public static String es_PE_FIELD_Rules_EntityType_Help="Los tipos de entidad \"Diccionario\"; \"Adempiere\"; y \"Aplicación\" podrían ser automáticamente sincronizados y las personalizaciones eliminadas ó sobreescritas";

@XendraTrl(Identifier="cc7dc81e-63b9-4962-905e-ec1330abaf77")
public static String es_PE_FIELD_Rules_EntityType_Name="Tipo de Entidad";

@XendraField(AD_Column_ID="EntityType",IsCentrallyMaintained=true,
AD_Tab_ID="98d70b82-149a-48c0-8489-98148daf80e9",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=40,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-07-21 05:22:41.0",
Identifier="cc7dc81e-63b9-4962-905e-ec1330abaf77")
public static final String FIELDNAME_Rules_EntityType="cc7dc81e-63b9-4962-905e-ec1330abaf77";

@XendraTrl(Identifier="68b3711f-4067-2207-f349-6baff015c4b0")
public static String es_PE_COLUMN_EntityType_Name="Entity Type";

@XendraColumn(AD_Element_ID="5ba917bf-871c-6f19-aa50-962adc5de558",ColumnName="EntityType",
AD_Reference_ID=18,AD_Reference_Value_ID="fae4ad31-8ff1-5d5c-8d47-2426c541cd74",AD_Val_Rule_ID="",
FieldLength=40,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="68b3711f-4067-2207-f349-6baff015c4b0",Synchronized="2017-08-05 16:52:49.0")
/** Column name EntityType */
public static final String COLUMNNAME_EntityType = "EntityType";

/** EventType AD_Reference=96201651-a4d1-4382-be28-793fda1db486 */
public static final int EVENTTYPE_AD_Reference_ID=1000020;
/** Set Event Type.
@param EventType Type of Event */
public void setEventType (String EventType)
{
if (EventType == null || EventType.equals(REF_AD_Rule_EventType.Callout) || EventType.equals(REF_AD_Rule_EventType.ModelValidatorDocumentEvent) || EventType.equals(REF_AD_Rule_EventType.Process) || EventType.equals(REF_AD_Rule_EventType.ModelValidatorTableEvent) || EventType.equals(REF_AD_Rule_EventType.ModelValidatorLoginEvent));
 else throw new IllegalArgumentException ("EventType Invalid value - " + EventType + " - Reference_ID=1000020 - C - D - P - T - L");
if (EventType != null && EventType.length() > 1)
{
log.warning("Length > 1 - truncated");
EventType = EventType.substring(0,0);
}
set_Value (COLUMNNAME_EventType, EventType);
}
/** Get Event Type.
@return Type of Event */
public String getEventType() 
{
return (String)get_Value(COLUMNNAME_EventType);
}

@XendraTrl(Identifier="10d34e0b-7611-4aa2-ae1a-5d8253b61527")
public static String es_PE_FIELD_Rules_EventType_Description="Tipo de Evento";

@XendraTrl(Identifier="10d34e0b-7611-4aa2-ae1a-5d8253b61527")
public static String es_PE_FIELD_Rules_EventType_Name="Tipo de Evento";

@XendraField(AD_Column_ID="EventType",IsCentrallyMaintained=true,
AD_Tab_ID="98d70b82-149a-48c0-8489-98148daf80e9",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-07-21 05:22:41.0",
Identifier="10d34e0b-7611-4aa2-ae1a-5d8253b61527")
public static final String FIELDNAME_Rules_EventType="10d34e0b-7611-4aa2-ae1a-5d8253b61527";

@XendraTrl(Identifier="aff83c88-dfc0-f75c-8698-0837a6b87139")
public static String es_PE_COLUMN_EventType_Name="Event Type";

@XendraColumn(AD_Element_ID="f03adee7-3329-d849-eaf3-946618429e03",ColumnName="EventType",
AD_Reference_ID=17,AD_Reference_Value_ID="96201651-a4d1-4382-be28-793fda1db486",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="aff83c88-dfc0-f75c-8698-0837a6b87139",Synchronized="2017-08-05 16:52:49.0")
/** Column name EventType */
public static final String COLUMNNAME_EventType = "EventType";
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

@XendraTrl(Identifier="d1a3fc61-decb-49dc-86ec-4570ac902e24")
public static String es_PE_FIELD_Rules_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="d1a3fc61-decb-49dc-86ec-4570ac902e24")
public static String es_PE_FIELD_Rules_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraTrl(Identifier="d1a3fc61-decb-49dc-86ec-4570ac902e24")
public static String es_PE_FIELD_Rules_CommentHelp_Name="Ayuda";
@XendraField(AD_Column_ID="Help",
IsCentrallyMaintained=true,AD_Tab_ID="98d70b82-149a-48c0-8489-98148daf80e9",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=2000,IsReadOnly=false,SeqNo=80,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2016-07-21 05:22:41.0",Identifier="d1a3fc61-decb-49dc-86ec-4570ac902e24")
public static final String FIELDNAME_Rules_CommentHelp="d1a3fc61-decb-49dc-86ec-4570ac902e24";

@XendraTrl(Identifier="976edd95-c700-6208-a649-14a16f647b14")
public static String es_PE_COLUMN_Help_Name="Comment/Help";

@XendraColumn(AD_Element_ID="a6fda582-56f9-6bb7-8436-285ce4f8de3f",ColumnName="Help",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="976edd95-c700-6208-a649-14a16f647b14",
Synchronized="2017-08-05 16:52:49.0")
/** Column name Help */
public static final String COLUMNNAME_Help = "Help";
/** Set ID.
@param ID ID */
public void setID (String ID)
{
if (ID != null && ID.length() > 100)
{
log.warning("Length > 100 - truncated");
ID = ID.substring(0,99);
}
set_Value (COLUMNNAME_ID, ID);
}
/** Get ID.
@return ID */
public String getID() 
{
String value = (String)get_Value(COLUMNNAME_ID);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="589af0fa-5d5a-4fee-bb93-764c83b5a511")
public static String es_PE_FIELD_Rules_ID_Name="id";
@XendraField(AD_Column_ID="ID",
IsCentrallyMaintained=true,AD_Tab_ID="98d70b82-149a-48c0-8489-98148daf80e9",AD_FieldGroup_ID="",
IsDisplayed=false,DisplayLogic="",DisplayLength=100,IsReadOnly=false,SeqNo=0,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2016-07-21 05:22:41.0",Identifier="589af0fa-5d5a-4fee-bb93-764c83b5a511")
public static final String FIELDNAME_Rules_ID="589af0fa-5d5a-4fee-bb93-764c83b5a511";

@XendraTrl(Identifier="f47f00f3-a913-4616-9764-ad542434e28d")
public static String es_PE_COLUMN_ID_Name="ID";

@XendraColumn(AD_Element_ID="089e82a2-807e-4cc0-96a6-05e479740035",ColumnName="ID",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=100,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f47f00f3-a913-4616-9764-ad542434e28d",
Synchronized="2017-08-05 16:52:49.0")
/** Column name ID */
public static final String COLUMNNAME_ID = "ID";
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
@XendraTrl(Identifier="87b5c94d-b0ac-4bf4-b374-50e36614cb23")
public static String es_PE_FIELD_Rules_Identifier_Name="Identifier";

@XendraField(AD_Column_ID="Identifier",IsCentrallyMaintained=true,
AD_Tab_ID="98d70b82-149a-48c0-8489-98148daf80e9",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=36,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-07-21 05:22:41.0",
Identifier="87b5c94d-b0ac-4bf4-b374-50e36614cb23")
public static final String FIELDNAME_Rules_Identifier="87b5c94d-b0ac-4bf4-b374-50e36614cb23";

@XendraTrl(Identifier="f1585522-ea8a-4e12-997e-6c5a94a7cd55")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f1585522-ea8a-4e12-997e-6c5a94a7cd55",
Synchronized="2017-08-05 16:52:49.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Lockout.
@param Lockout Lockout */
public void setLockout (boolean Lockout)
{
set_Value (COLUMNNAME_Lockout, Boolean.valueOf(Lockout));
}
/** Get Lockout.
@return Lockout */
public boolean isLockout() 
{
Object oo = get_Value(COLUMNNAME_Lockout);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="248b976c-8a54-46ff-a980-e008986e6053")
public static String es_PE_COLUMN_Lockout_Name="lockout";

@XendraColumn(AD_Element_ID="63f75f32-a2eb-4522-a988-6c753105407e",ColumnName="Lockout",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="248b976c-8a54-46ff-a980-e008986e6053",
Synchronized="2017-08-05 16:52:49.0")
/** Column name Lockout */
public static final String COLUMNNAME_Lockout = "Lockout";
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

@XendraTrl(Identifier="cee9f0c2-ba05-4e30-9f7c-8e279d80ce69")
public static String es_PE_FIELD_Rules_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="cee9f0c2-ba05-4e30-9f7c-8e279d80ce69")
public static String es_PE_FIELD_Rules_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="cee9f0c2-ba05-4e30-9f7c-8e279d80ce69")
public static String es_PE_FIELD_Rules_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="98d70b82-149a-48c0-8489-98148daf80e9",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2016-07-21 05:22:41.0",Identifier="cee9f0c2-ba05-4e30-9f7c-8e279d80ce69")
public static final String FIELDNAME_Rules_Name="cee9f0c2-ba05-4e30-9f7c-8e279d80ce69";

@XendraTrl(Identifier="01e5490c-315c-37b9-6beb-bf384488caf3")
public static String es_PE_COLUMN_Name_Name="Name";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="01e5490c-315c-37b9-6beb-bf384488caf3",
Synchronized="2017-08-05 16:52:49.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";

/** Parent_ID AD_Reference=1b6b7fa4-6b3f-164d-6151-85d9a2225bea */
public static final int PARENT_ID_AD_Reference_ID=1000063;
/** Set Parent.
@param Parent_ID Parent of Entity */
public void setParent_ID (int Parent_ID)
{
if (Parent_ID <= 0) set_Value (COLUMNNAME_Parent_ID, null);
 else 
set_Value (COLUMNNAME_Parent_ID, Integer.valueOf(Parent_ID));
}
/** Get Parent.
@return Parent of Entity */
public int getParent_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Parent_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="38a41a01-eb56-43d3-8105-ab5100674637")
public static String es_PE_FIELD_Rules_Parent_Description="Valor padre.";

@XendraTrl(Identifier="38a41a01-eb56-43d3-8105-ab5100674637")
public static String es_PE_FIELD_Rules_Parent_Help="El padre indica un valor usado para representar un nivel sumario ó Informe a nivel para un registro.";

@XendraTrl(Identifier="38a41a01-eb56-43d3-8105-ab5100674637")
public static String es_PE_FIELD_Rules_Parent_Name="Padre";
@XendraField(AD_Column_ID="Parent_ID",
IsCentrallyMaintained=true,AD_Tab_ID="98d70b82-149a-48c0-8489-98148daf80e9",AD_FieldGroup_ID="",
IsDisplayed=false,DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2016-07-21 05:22:41.0",Identifier="38a41a01-eb56-43d3-8105-ab5100674637")
public static final String FIELDNAME_Rules_Parent="38a41a01-eb56-43d3-8105-ab5100674637";

@XendraTrl(Identifier="69830caf-c777-4baf-a27a-dac0f28490e9")
public static String es_PE_COLUMN_Parent_ID_Name="Parent";

@XendraColumn(AD_Element_ID="26d35f92-f0e2-00bf-656e-99db30e53a7f",ColumnName="Parent_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="1b6b7fa4-6b3f-164d-6151-85d9a2225bea",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="69830caf-c777-4baf-a27a-dac0f28490e9",Synchronized="2017-08-05 16:52:49.0")
/** Column name Parent_ID */
public static final String COLUMNNAME_Parent_ID = "Parent_ID";
/** Set Properties.
@param Properties Properties */
public void setProperties (HashMap Properties)
{
set_Value (COLUMNNAME_Properties, Properties);
}
/** Get Properties.
@return Properties */
public HashMap getProperties() 
{
HashMap propsrc = (HashMap)get_Value(COLUMNNAME_Properties);
if (propsrc == null) return new HashMap();
 HashMap propdst = (HashMap) propsrc.clone();
return propdst;
}

@XendraTrl(Identifier="bf90c644-13c5-4bfc-84c2-9fd1b514bacd")
public static String es_PE_FIELD_Rules_Properties_Name="Properties";

@XendraField(AD_Column_ID="Properties",IsCentrallyMaintained=true,
AD_Tab_ID="98d70b82-149a-48c0-8489-98148daf80e9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-07-21 05:22:41.0",
Identifier="bf90c644-13c5-4bfc-84c2-9fd1b514bacd")
public static final String FIELDNAME_Rules_Properties="bf90c644-13c5-4bfc-84c2-9fd1b514bacd";

@XendraTrl(Identifier="a0415fb7-e1a3-4c0b-aaa1-845414ec0201")
public static String es_PE_COLUMN_Properties_Name="Properties";

@XendraColumn(AD_Element_ID="acc3987b-292c-475a-86b5-5104970a96f3",ColumnName="Properties",
AD_Reference_ID=46,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a0415fb7-e1a3-4c0b-aaa1-845414ec0201",
Synchronized="2017-08-05 16:52:49.0")
/** Column name Properties */
public static final String COLUMNNAME_Properties = "Properties";

/** RuleType AD_Reference=c30f8c29-bd66-4674-9c29-dd0e2bb96611 */
public static final int RULETYPE_AD_Reference_ID=1000056;
/** Set RuleType.
@param RuleType RuleType */
public void setRuleType (String RuleType)
{
if (RuleType == null || RuleType.equals(REF_RuleType.SQL) || RuleType.equals(REF_RuleType.AspectOrientProgram) || RuleType.equals(REF_RuleType.JSR94RuleEngineAPI) || RuleType.equals(REF_RuleType.JSR223ScriptingAPIs) || RuleType.equals(REF_RuleType.Listener) || RuleType.equals(REF_RuleType.Acceptor));
 else throw new IllegalArgumentException ("RuleType Invalid value - " + RuleType + " - Reference_ID=1000056 - Q - O - R - S - L - A");
if (RuleType != null && RuleType.length() > 1)
{
log.warning("Length > 1 - truncated");
RuleType = RuleType.substring(0,0);
}
set_Value (COLUMNNAME_RuleType, RuleType);
}
/** Get RuleType.
@return RuleType */
public String getRuleType() 
{
return (String)get_Value(COLUMNNAME_RuleType);
}

@XendraTrl(Identifier="56e8c441-9c2e-42b5-adef-cd1e7c7725be")
public static String es_PE_FIELD_Rules_RuleType_Name="ruletype";

@XendraField(AD_Column_ID="RuleType",IsCentrallyMaintained=true,
AD_Tab_ID="98d70b82-149a-48c0-8489-98148daf80e9",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-07-21 05:22:41.0",
Identifier="56e8c441-9c2e-42b5-adef-cd1e7c7725be")
public static final String FIELDNAME_Rules_RuleType="56e8c441-9c2e-42b5-adef-cd1e7c7725be";

@XendraTrl(Identifier="ab01ae52-d095-d134-b576-c8da74f78a6e")
public static String es_PE_COLUMN_RuleType_Name="ruletype";

@XendraColumn(AD_Element_ID="361b3533-35d5-9200-918c-a94ad26a9c15",ColumnName="RuleType",
AD_Reference_ID=17,AD_Reference_Value_ID="c30f8c29-bd66-4674-9c29-dd0e2bb96611",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="ab01ae52-d095-d134-b576-c8da74f78a6e",Synchronized="2017-08-05 16:52:49.0")
/** Column name RuleType */
public static final String COLUMNNAME_RuleType = "RuleType";
/** Set Script.
@param Script Dynamic Java Language Script to calculate result */
public void setScript (String Script)
{
set_Value (COLUMNNAME_Script, Script);
}
/** Get Script.
@return Dynamic Java Language Script to calculate result */
public String getScript() 
{
String value = (String)get_Value(COLUMNNAME_Script);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="99980928-51e6-4cd6-9abc-05a75f133b19")
public static String es_PE_FIELD_Rules_Script_Description="Escritura de lenguaje Java para calcular resultados";

@XendraTrl(Identifier="99980928-51e6-4cd6-9abc-05a75f133b19")
public static String es_PE_FIELD_Rules_Script_Help="Usar constructores del lenguaje Java para definir el resultado del calculo";

@XendraTrl(Identifier="99980928-51e6-4cd6-9abc-05a75f133b19")
public static String es_PE_FIELD_Rules_Script_Name="Escritura";
@XendraField(AD_Column_ID="Script",
IsCentrallyMaintained=true,AD_Tab_ID="98d70b82-149a-48c0-8489-98148daf80e9",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=0,IsReadOnly=false,SeqNo=70,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2016-07-21 05:22:41.0",Identifier="99980928-51e6-4cd6-9abc-05a75f133b19")
public static final String FIELDNAME_Rules_Script="99980928-51e6-4cd6-9abc-05a75f133b19";

@XendraTrl(Identifier="503e35b8-dd99-460b-9638-07d0cc7beafd")
public static String es_PE_COLUMN_Script_Name="Script";

@XendraColumn(AD_Element_ID="9cf04103-dbd5-c841-c159-641242e2c557",ColumnName="Script",
AD_Reference_ID=36,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=0,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="503e35b8-dd99-460b-9638-07d0cc7beafd",
Synchronized="2017-08-05 16:52:49.0")
/** Column name Script */
public static final String COLUMNNAME_Script = "Script";
/** Set Synchronized.
@param Synchronized Synchronized */
public void setSynchronized (Timestamp Synchronized)
{
set_Value (COLUMNNAME_Synchronized, Synchronized);
}
/** Get Synchronized.
@return Synchronized */
public Timestamp getSynchronized() 
{
return (Timestamp)get_Value(COLUMNNAME_Synchronized);
}

@XendraTrl(Identifier="86e767d6-89c5-49e7-b314-23703db921a1")
public static String es_PE_FIELD_Rules_Synchronized_Name="Synchronized";

@XendraField(AD_Column_ID="Synchronized",IsCentrallyMaintained=true,
AD_Tab_ID="98d70b82-149a-48c0-8489-98148daf80e9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=29,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-07-21 05:22:41.0",
Identifier="86e767d6-89c5-49e7-b314-23703db921a1")
public static final String FIELDNAME_Rules_Synchronized="86e767d6-89c5-49e7-b314-23703db921a1";

@XendraTrl(Identifier="8b846920-9309-4b6f-9144-71bac8aa9335")
public static String es_PE_COLUMN_Synchronized_Name="Synchronized";

@XendraColumn(AD_Element_ID="08f1e976-ceeb-f830-9d75-bf94f13a98ce",ColumnName="Synchronized",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8b846920-9309-4b6f-9144-71bac8aa9335",
Synchronized="2017-08-05 16:52:49.0")
/** Column name Synchronized */
public static final String COLUMNNAME_Synchronized = "Synchronized";
/** Set Search Key.
@param Value Search key for the record in the format required - must be unique */
public void setValue (String Value)
{
if (Value == null) throw new IllegalArgumentException ("Value is mandatory.");
if (Value.length() > 40)
{
log.warning("Length > 40 - truncated");
Value = Value.substring(0,39);
}
set_Value (COLUMNNAME_Value, Value);
}
/** Get Search Key.
@return Search key for the record in the format required - must be unique */
public String getValue() 
{
String value = (String)get_Value(COLUMNNAME_Value);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="78b33f5f-f63b-4cdd-9de8-30c42db59858")
public static String es_PE_FIELD_Rules_SearchKey_Description="Clave de búsqueda para el registro en el formato requerido; debe ser única";

@XendraTrl(Identifier="78b33f5f-f63b-4cdd-9de8-30c42db59858")
public static String es_PE_FIELD_Rules_SearchKey_Help="Una clave de búsqueda le permite a usted un método rápido de encontrar un registro en particular";

@XendraTrl(Identifier="78b33f5f-f63b-4cdd-9de8-30c42db59858")
public static String es_PE_FIELD_Rules_SearchKey_Name="Clave de Búsqueda";

@XendraField(AD_Column_ID="Value",IsCentrallyMaintained=true,
AD_Tab_ID="98d70b82-149a-48c0-8489-98148daf80e9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=40,IsReadOnly=false,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-07-21 05:22:41.0",
Identifier="78b33f5f-f63b-4cdd-9de8-30c42db59858")
public static final String FIELDNAME_Rules_SearchKey="78b33f5f-f63b-4cdd-9de8-30c42db59858";

@XendraTrl(Identifier="dc789bba-865e-5432-7f7d-68df3b64b9a3")
public static String es_PE_COLUMN_Value_Name="Search Key";

@XendraColumn(AD_Element_ID="e75e100c-9b41-a643-2cb3-46eeced683d8",ColumnName="Value",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="dc789bba-865e-5432-7f7d-68df3b64b9a3",
Synchronized="2017-08-05 16:52:49.0")
/** Column name Value */
public static final String COLUMNNAME_Value = "Value";
}
