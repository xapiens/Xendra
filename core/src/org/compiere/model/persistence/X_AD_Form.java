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
/** Generated Model for AD_Form
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_Form extends PO
{
/** Standard Constructor
@param ctx context
@param AD_Form_ID id
@param trxName transaction
*/
public X_AD_Form (Properties ctx, int AD_Form_ID, String trxName)
{
super (ctx, AD_Form_ID, trxName);
/** if (AD_Form_ID == 0)
{
setAccessLevel (null);
setAD_Form_ID (0);
setEntityType (null);	
// U
setIsBetaFunctionality (false);	
// N
setName (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_Form (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=376 */
public static int Table_ID=MTable.getTable_ID("AD_Form");

@XendraTrl(Identifier="56c9d5d0-0e72-c911-6159-552cab191b6b")
public static String es_PE_TAB_Form_Description="Forma Especial";

@XendraTrl(Identifier="56c9d5d0-0e72-c911-6159-552cab191b6b")
public static String es_PE_TAB_Form_Name="Forma";

@XendraTrl(Identifier="56c9d5d0-0e72-c911-6159-552cab191b6b")
public static String es_PE_TAB_Form_Help="La pestaña Forma define una ventana que no es automáticamente generada. Solo para uso del administrador del sistema.";

@XendraTab(Name="Form",Description="Special Form",
Help="The Forms Tab defines any window which is not automatically generated.  For System Admin use only.",
AD_Window_ID="98a2b09d-25a4-31ca-c67d-29c638b0921e",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="56c9d5d0-0e72-c911-6159-552cab191b6b",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Form="56c9d5d0-0e72-c911-6159-552cab191b6b";

@XendraTrl(Identifier="d61b2e26-72f4-ba9f-4a5e-661af780d1e0")
public static String es_PE_TABLE_AD_Form_Name="Forma Especial";

@XendraTable(Name="Special Form",Description="Special Form",Help="",TableName="AD_Form",
AccessLevel="4",AD_Window_ID="98a2b09d-25a4-31ca-c67d-29c638b0921e",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=130,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.dictionary",
Identifier="d61b2e26-72f4-ba9f-4a5e-661af780d1e0",Synchronized="2017-08-16 11:40:17.0")
/** TableName=AD_Form */
public static final String Table_Name="AD_Form";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_Form");

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
    Table_ID = MTable.getTable_ID("AD_Form");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_Form[").append(get_ID()).append("]");
return sb.toString();
}

/** AccessLevel AD_Reference=5684046b-00f0-a17c-843e-efad2b0e42f3 */
public static final int ACCESSLEVEL_AD_Reference_ID=5;
/** Set Data Access Level.
@param AccessLevel Access Level required */
public void setAccessLevel (String AccessLevel)
{
if (AccessLevel == null) throw new IllegalArgumentException ("AccessLevel is mandatory");
if (AccessLevel.equals(REF_AD_TableAccessLevels.SystemPlusClient) || AccessLevel.equals(REF_AD_TableAccessLevels.ClientOnly) || AccessLevel.equals(REF_AD_TableAccessLevels.Organization) || AccessLevel.equals(REF_AD_TableAccessLevels.ClientPlusOrganization) || AccessLevel.equals(REF_AD_TableAccessLevels.SystemOnly) || AccessLevel.equals(REF_AD_TableAccessLevels.All));
 else throw new IllegalArgumentException ("AccessLevel Invalid value - " + AccessLevel + " - Reference_ID=5 - 6 - 2 - 1 - 3 - 4 - 7");
if (AccessLevel.length() > 1)
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

@XendraTrl(Identifier="9e9dbc84-fe93-a66d-f4b8-b01ea34d6f59")
public static String es_PE_FIELD_Form_DataAccessLevel_Description="Nivel de Acceso requerido";

@XendraTrl(Identifier="9e9dbc84-fe93-a66d-f4b8-b01ea34d6f59")
public static String es_PE_FIELD_Form_DataAccessLevel_Help="Indica el nivel de acceso requerido para este registro ó proceso";

@XendraTrl(Identifier="9e9dbc84-fe93-a66d-f4b8-b01ea34d6f59")
public static String es_PE_FIELD_Form_DataAccessLevel_Name="Nivel de Acceso a Datos";

@XendraField(AD_Column_ID="AccessLevel",IsCentrallyMaintained=true,
AD_Tab_ID="56c9d5d0-0e72-c911-6159-552cab191b6b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9e9dbc84-fe93-a66d-f4b8-b01ea34d6f59")
public static final String FIELDNAME_Form_DataAccessLevel="9e9dbc84-fe93-a66d-f4b8-b01ea34d6f59";

@XendraTrl(Identifier="9e15f40e-4592-522a-6671-6e3fd8404612")
public static String es_PE_COLUMN_AccessLevel_Name="Nivel de Acceso a Datos";

@XendraColumn(AD_Element_ID="bd129648-2bd8-10dc-6b09-97aa41aa28e2",ColumnName="AccessLevel",
AD_Reference_ID=17,AD_Reference_Value_ID="5684046b-00f0-a17c-843e-efad2b0e42f3",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="9e15f40e-4592-522a-6671-6e3fd8404612",Synchronized="2017-08-05 16:52:32.0")
/** Column name AccessLevel */
public static final String COLUMNNAME_AccessLevel = "AccessLevel";
/** Set Special Form.
@param AD_Form_ID Special Form */
public void setAD_Form_ID (int AD_Form_ID)
{
if (AD_Form_ID < 1) throw new IllegalArgumentException ("AD_Form_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_Form_ID, Integer.valueOf(AD_Form_ID));
}
/** Get Special Form.
@return Special Form */
public int getAD_Form_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Form_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="93c54153-a2cd-715a-8393-ada0573fc5a5")
public static String es_PE_FIELD_Form_SpecialForm_Description="Forma especial";

@XendraTrl(Identifier="93c54153-a2cd-715a-8393-ada0573fc5a5")
public static String es_PE_FIELD_Form_SpecialForm_Help="El campo forma especial identifica una forma especial única en el sistema.";

@XendraTrl(Identifier="93c54153-a2cd-715a-8393-ada0573fc5a5")
public static String es_PE_FIELD_Form_SpecialForm_Name="Forma Especial";

@XendraField(AD_Column_ID="AD_Form_ID",IsCentrallyMaintained=true,
AD_Tab_ID="56c9d5d0-0e72-c911-6159-552cab191b6b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="93c54153-a2cd-715a-8393-ada0573fc5a5")
public static final String FIELDNAME_Form_SpecialForm="93c54153-a2cd-715a-8393-ada0573fc5a5";
/** Column name AD_Form_ID */
public static final String COLUMNNAME_AD_Form_ID = "AD_Form_ID";
/** Set Plugin.
@param AD_Plugin_ID Plugin */
public void setAD_Plugin_ID (int AD_Plugin_ID)
{
if (AD_Plugin_ID <= 0) set_Value (COLUMNNAME_AD_Plugin_ID, null);
 else 
set_Value (COLUMNNAME_AD_Plugin_ID, Integer.valueOf(AD_Plugin_ID));
}
/** Get Plugin.
@return Plugin */
public int getAD_Plugin_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Plugin_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="fde96fae-7e66-4a9d-a6cc-f5e39137f9cc")
public static String es_PE_COLUMN_AD_Plugin_ID_Name="Plugin";

@XendraColumn(AD_Element_ID="895f0c3e-fa52-48b7-8fce-f9b2dc637774",ColumnName="AD_Plugin_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fde96fae-7e66-4a9d-a6cc-f5e39137f9cc",
Synchronized="2017-08-05 16:52:32.0")
/** Column name AD_Plugin_ID */
public static final String COLUMNNAME_AD_Plugin_ID = "AD_Plugin_ID";
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
@XendraTrl(Identifier="2adac924-c4d2-4476-45f9-9b0f41ab9b3a")
public static String es_PE_FIELD_Form_Classname_Description="Nombre de la clase Java";

@XendraTrl(Identifier="2adac924-c4d2-4476-45f9-9b0f41ab9b3a")
public static String es_PE_FIELD_Form_Classname_Help="El nombre de clase identifica el nombre de la clase Java usada por este Informe ó proceso.";

@XendraTrl(Identifier="2adac924-c4d2-4476-45f9-9b0f41ab9b3a")
public static String es_PE_FIELD_Form_Classname_Name="Nombre de Clase";

@XendraField(AD_Column_ID="Classname",IsCentrallyMaintained=true,
AD_Tab_ID="56c9d5d0-0e72-c911-6159-552cab191b6b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=40,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2adac924-c4d2-4476-45f9-9b0f41ab9b3a")
public static final String FIELDNAME_Form_Classname="2adac924-c4d2-4476-45f9-9b0f41ab9b3a";

@XendraTrl(Identifier="a635b91c-2df5-6d5d-5d76-2d95af7ee522")
public static String es_PE_COLUMN_Classname_Name="Nombre de Clase";

@XendraColumn(AD_Element_ID="43b208b9-53a3-0d59-0255-aaf07c9bd7ce",ColumnName="Classname",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a635b91c-2df5-6d5d-5d76-2d95af7ee522",
Synchronized="2017-08-05 16:52:32.0")
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

@XendraTrl(Identifier="c04d5122-b63f-c39e-db7b-157c3b879872")
public static String es_PE_FIELD_Form_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="c04d5122-b63f-c39e-db7b-157c3b879872")
public static String es_PE_FIELD_Form_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="c04d5122-b63f-c39e-db7b-157c3b879872")
public static String es_PE_FIELD_Form_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="56c9d5d0-0e72-c911-6159-552cab191b6b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c04d5122-b63f-c39e-db7b-157c3b879872")
public static final String FIELDNAME_Form_Description="c04d5122-b63f-c39e-db7b-157c3b879872";

@XendraTrl(Identifier="23eb285c-2869-70ae-773d-9a15546a6495")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="23eb285c-2869-70ae-773d-9a15546a6495",
Synchronized="2017-08-05 16:52:32.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";

/** EntityType AD_Reference=fae4ad31-8ff1-5d5c-8d47-2426c541cd74 */
public static final int ENTITYTYPE_AD_Reference_ID=389;
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

@XendraTrl(Identifier="6a0e8420-12a1-7e26-44c7-2806cb0dcf4e")
public static String es_PE_FIELD_Form_EntityType_Description="Tipo de Entidad Diccionario; determina propiedad y sincronización";

@XendraTrl(Identifier="6a0e8420-12a1-7e26-44c7-2806cb0dcf4e")
public static String es_PE_FIELD_Form_EntityType_Help="Los tipos de entidad \"Diccionario\"; \"Adempiere\"; y \"Aplicación\" podrían ser automáticamente sincronizados y las personalizaciones eliminadas ó sobreescritas";

@XendraTrl(Identifier="6a0e8420-12a1-7e26-44c7-2806cb0dcf4e")
public static String es_PE_FIELD_Form_EntityType_Name="Tipo de Entidad";

@XendraField(AD_Column_ID="EntityType",IsCentrallyMaintained=true,
AD_Tab_ID="56c9d5d0-0e72-c911-6159-552cab191b6b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6a0e8420-12a1-7e26-44c7-2806cb0dcf4e")
public static final String FIELDNAME_Form_EntityType="6a0e8420-12a1-7e26-44c7-2806cb0dcf4e";

@XendraTrl(Identifier="39906204-7f3b-2ec8-c123-6aca50568a82")
public static String es_PE_COLUMN_EntityType_Name="Tipo de Entidad";

@XendraColumn(AD_Element_ID="5ba917bf-871c-6f19-aa50-962adc5de558",ColumnName="EntityType",
AD_Reference_ID=18,AD_Reference_Value_ID="fae4ad31-8ff1-5d5c-8d47-2426c541cd74",AD_Val_Rule_ID="",
FieldLength=4,DefaultValue="U",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="@EntityType@=D",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="39906204-7f3b-2ec8-c123-6aca50568a82",Synchronized="2017-08-05 16:52:32.0")
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

@XendraTrl(Identifier="f01f2e6d-03af-e2a2-36c6-3e8d5382b848")
public static String es_PE_FIELD_Form_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="f01f2e6d-03af-e2a2-36c6-3e8d5382b848")
public static String es_PE_FIELD_Form_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraTrl(Identifier="f01f2e6d-03af-e2a2-36c6-3e8d5382b848")
public static String es_PE_FIELD_Form_CommentHelp_Name="Ayuda";
@XendraField(AD_Column_ID="Help",
IsCentrallyMaintained=true,AD_Tab_ID="56c9d5d0-0e72-c911-6159-552cab191b6b",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="f01f2e6d-03af-e2a2-36c6-3e8d5382b848")
public static final String FIELDNAME_Form_CommentHelp="f01f2e6d-03af-e2a2-36c6-3e8d5382b848";

@XendraTrl(Identifier="b82a1f70-a802-265e-00c8-60d9edde63cd")
public static String es_PE_COLUMN_Help_Name="Ayuda";

@XendraColumn(AD_Element_ID="a6fda582-56f9-6bb7-8436-285ce4f8de3f",ColumnName="Help",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b82a1f70-a802-265e-00c8-60d9edde63cd",
Synchronized="2017-08-05 16:52:32.0")
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
@XendraTrl(Identifier="d274e264-2c18-4b10-88c6-5859af56c056")
public static String es_PE_COLUMN_ID_Name="ID";

@XendraColumn(AD_Element_ID="089e82a2-807e-4cc0-96a6-05e479740035",ColumnName="ID",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=100,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d274e264-2c18-4b10-88c6-5859af56c056",
Synchronized="2017-08-05 16:52:32.0")
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
@XendraTrl(Identifier="c56d3d17-ac37-22d2-7c93-5980ae5416bc")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c56d3d17-ac37-22d2-7c93-5980ae5416bc",
Synchronized="2017-08-05 16:52:32.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Beta Functionality.
@param IsBetaFunctionality This functionality is considered Beta */
public void setIsBetaFunctionality (boolean IsBetaFunctionality)
{
set_Value (COLUMNNAME_IsBetaFunctionality, Boolean.valueOf(IsBetaFunctionality));
}
/** Get Beta Functionality.
@return This functionality is considered Beta */
public boolean isBetaFunctionality() 
{
Object oo = get_Value(COLUMNNAME_IsBetaFunctionality);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="8ed7291c-00f9-a472-fa8a-dd2bd19e380e")
public static String es_PE_FIELD_Form_BetaFunctionality_Description="Esta funcionalidad se considera como Beta";

@XendraTrl(Identifier="8ed7291c-00f9-a472-fa8a-dd2bd19e380e")
public static String es_PE_FIELD_Form_BetaFunctionality_Help="La funcionalidad beta no esta probada ni completada.";

@XendraTrl(Identifier="8ed7291c-00f9-a472-fa8a-dd2bd19e380e")
public static String es_PE_FIELD_Form_BetaFunctionality_Name="Funcionalidad Beta";

@XendraField(AD_Column_ID="IsBetaFunctionality",IsCentrallyMaintained=true,
AD_Tab_ID="56c9d5d0-0e72-c911-6159-552cab191b6b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8ed7291c-00f9-a472-fa8a-dd2bd19e380e")
public static final String FIELDNAME_Form_BetaFunctionality="8ed7291c-00f9-a472-fa8a-dd2bd19e380e";

@XendraTrl(Identifier="c117d1e1-9f6a-9938-952b-bd8cb8831b86")
public static String es_PE_COLUMN_IsBetaFunctionality_Name="Funcionalidad Beta";

@XendraColumn(AD_Element_ID="6537bbc5-66e0-d1d1-5adc-cef787e2f4b6",
ColumnName="IsBetaFunctionality",AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="N",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="c117d1e1-9f6a-9938-952b-bd8cb8831b86",Synchronized="2017-08-05 16:52:32.0")
/** Column name IsBetaFunctionality */
public static final String COLUMNNAME_IsBetaFunctionality = "IsBetaFunctionality";
/** Set IsMenu.
@param IsMenu IsMenu */
public void setIsMenu (boolean IsMenu)
{
set_Value (COLUMNNAME_IsMenu, Boolean.valueOf(IsMenu));
}
/** Get IsMenu.
@return IsMenu */
public boolean isMenu() 
{
Object oo = get_Value(COLUMNNAME_IsMenu);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="f786aae7-605f-4797-b48c-e196a8ab669d")
public static String es_PE_COLUMN_IsMenu_Name="ismenu";

@XendraColumn(AD_Element_ID="c6be6212-daab-4c27-acef-11caef0f9223",ColumnName="IsMenu",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f786aae7-605f-4797-b48c-e196a8ab669d",
Synchronized="2017-08-05 16:52:32.0")
/** Column name IsMenu */
public static final String COLUMNNAME_IsMenu = "IsMenu";
/** Set jsp URL.
@param JSPURL Web URL of the jsp function */
public void setJSPURL (String JSPURL)
{
if (JSPURL != null && JSPURL.length() > 120)
{
log.warning("Length > 120 - truncated");
JSPURL = JSPURL.substring(0,119);
}
set_Value (COLUMNNAME_JSPURL, JSPURL);
}
/** Get jsp URL.
@return Web URL of the jsp function */
public String getJSPURL() 
{
String value = (String)get_Value(COLUMNNAME_JSPURL);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="37618722-2896-d834-47c3-9fe71e3ca8f0")
public static String es_PE_FIELD_Form_JspURL_Description="Web Url d ela función JSP.";

@XendraTrl(Identifier="37618722-2896-d834-47c3-9fe71e3ca8f0")
public static String es_PE_FIELD_Form_JspURL_Help="Para la Url de Web, defina el Url para realizar la función (generalmente un JSP). El Url también puede ser externo al sistema.";

@XendraTrl(Identifier="37618722-2896-d834-47c3-9fe71e3ca8f0")
public static String es_PE_FIELD_Form_JspURL_Name="JSP Url";
@XendraField(AD_Column_ID="JSPURL",
IsCentrallyMaintained=true,AD_Tab_ID="56c9d5d0-0e72-c911-6159-552cab191b6b",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=40,IsReadOnly=false,SeqNo=110,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="37618722-2896-d834-47c3-9fe71e3ca8f0")
public static final String FIELDNAME_Form_JspURL="37618722-2896-d834-47c3-9fe71e3ca8f0";

@XendraTrl(Identifier="8bf0b3d9-667b-6242-758f-c36d31424f60")
public static String es_PE_COLUMN_JSPURL_Name="JSP Url";

@XendraColumn(AD_Element_ID="f6564309-fa41-bca3-3140-83cb304ad56a",ColumnName="JSPURL",
AD_Reference_ID=40,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=120,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8bf0b3d9-667b-6242-758f-c36d31424f60",
Synchronized="2017-08-05 16:52:32.0")
/** Column name JSPURL */
public static final String COLUMNNAME_JSPURL = "JSPURL";
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

@XendraTrl(Identifier="36d8664a-53c8-f711-7de3-b67e572c058d")
public static String es_PE_FIELD_Form_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="36d8664a-53c8-f711-7de3-b67e572c058d")
public static String es_PE_FIELD_Form_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="36d8664a-53c8-f711-7de3-b67e572c058d")
public static String es_PE_FIELD_Form_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="56c9d5d0-0e72-c911-6159-552cab191b6b",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=30,SortNo=1,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="36d8664a-53c8-f711-7de3-b67e572c058d")
public static final String FIELDNAME_Form_Name="36d8664a-53c8-f711-7de3-b67e572c058d";

@XendraTrl(Identifier="15723cc7-4778-efe0-be7e-7b6090abd648")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="15723cc7-4778-efe0-be7e-7b6090abd648",
Synchronized="2017-08-05 16:52:32.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
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

@XendraTrl(Identifier="7033ea48-40c5-fb18-b9d4-2f866e56c2ff")
public static String es_PE_COLUMN_Synchronized_Name="Synchronized";

@XendraColumn(AD_Element_ID="08f1e976-ceeb-f830-9d75-bf94f13a98ce",ColumnName="Synchronized",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7033ea48-40c5-fb18-b9d4-2f866e56c2ff",
Synchronized="2017-08-05 16:52:32.0")
/** Column name Synchronized */
public static final String COLUMNNAME_Synchronized = "Synchronized";
}
