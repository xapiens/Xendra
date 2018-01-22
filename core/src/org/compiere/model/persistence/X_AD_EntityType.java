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
/** Generated Model for AD_EntityType
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_EntityType extends PO
{
/** Standard Constructor
@param ctx context
@param AD_EntityType_ID id
@param trxName transaction
*/
public X_AD_EntityType (Properties ctx, int AD_EntityType_ID, String trxName)
{
super (ctx, AD_EntityType_ID, trxName);
/** if (AD_EntityType_ID == 0)
{
setAD_EntityType_ID (0);
setEntityType (null);
setName (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_EntityType (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=882 */
public static int Table_ID=MTable.getTable_ID("AD_EntityType");

@XendraTrl(Identifier="1908af9d-2827-f240-15b8-a3d8b689b64f")
public static String es_PE_TAB_EntityType_Description="System Entity Type";

@XendraTrl(Identifier="1908af9d-2827-f240-15b8-a3d8b689b64f")
public static String es_PE_TAB_EntityType_Name="Entity Type";

@XendraTrl(Identifier="1908af9d-2827-f240-15b8-a3d8b689b64f")
public static String es_PE_TAB_EntityType_Help="The entity type determines the ownership of Application Dictionary entries.  The types \"Dictionary\" and \"Adempiere\" should not be used and are maintainted by Adempiere (i.e. all changes are reversed during migration to the current definition).";

@XendraTab(Name="Entity Type",Description="System Entity Type",
Help="The entity type determines the ownership of Application Dictionary entries.  The types 'Dictionary' and 'Adempiere' should not be used and are maintainted by Adempiere (i.e. all changes are reversed during migration to the current definition).",
AD_Window_ID="60e49d31-29c0-776f-a49c-81392b6c1e48",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="1908af9d-2827-f240-15b8-a3d8b689b64f",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_EntityType="1908af9d-2827-f240-15b8-a3d8b689b64f";

@XendraTrl(Identifier="f8d49dc1-c824-c536-b71f-2e1e9e24d627")
public static String es_PE_TABLE_AD_EntityType_Name="Entity Type";

@XendraTable(Name="Entity Type",Description="System Entity Type",Help="",TableName="AD_EntityType",
AccessLevel="4",AD_Window_ID="60e49d31-29c0-776f-a49c-81392b6c1e48",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=0,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.dictionary",
Identifier="f8d49dc1-c824-c536-b71f-2e1e9e24d627",Synchronized="2017-08-16 11:40:11.0")
/** TableName=AD_EntityType */
public static final String Table_Name="AD_EntityType";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_EntityType");

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
    Table_ID = MTable.getTable_ID("AD_EntityType");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_EntityType[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Entity Type.
@param AD_EntityType_ID System Entity Type */
public void setAD_EntityType_ID (int AD_EntityType_ID)
{
if (AD_EntityType_ID < 1) throw new IllegalArgumentException ("AD_EntityType_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_EntityType_ID, Integer.valueOf(AD_EntityType_ID));
}
/** Get Entity Type.
@return System Entity Type */
public int getAD_EntityType_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_EntityType_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="0fd16b64-8062-57de-d59e-b867e0021bcb")
public static String es_PE_FIELD_EntityType_EntityType_Description="System Entity Type";

@XendraTrl(Identifier="0fd16b64-8062-57de-d59e-b867e0021bcb")
public static String es_PE_FIELD_EntityType_EntityType_Help="The entity type determines the ownership of Application Dictionary entries.  The types \"Dictionary\" and \"Adempiere\" should not be used and are maintainted by Adempiere (i.e. all changes are reversed during migration to the current definition).";

@XendraTrl(Identifier="0fd16b64-8062-57de-d59e-b867e0021bcb")
public static String es_PE_FIELD_EntityType_EntityType_Name="Entity Type";

@XendraField(AD_Column_ID="AD_EntityType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="1908af9d-2827-f240-15b8-a3d8b689b64f",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0fd16b64-8062-57de-d59e-b867e0021bcb")
public static final String FIELDNAME_EntityType_EntityType="0fd16b64-8062-57de-d59e-b867e0021bcb";
/** Column name AD_EntityType_ID */
public static final String COLUMNNAME_AD_EntityType_ID = "AD_EntityType_ID";
/** Set Classpath.
@param Classpath Extension Classpath */
public void setClasspath (String Classpath)
{
if (Classpath != null && Classpath.length() > 255)
{
log.warning("Length > 255 - truncated");
Classpath = Classpath.substring(0,254);
}
set_Value (COLUMNNAME_Classpath, Classpath);
}
/** Get Classpath.
@return Extension Classpath */
public String getClasspath() 
{
String value = (String)get_Value(COLUMNNAME_Classpath);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="22c8cb07-e47c-9f24-b5d8-940af28f8339")
public static String es_PE_FIELD_EntityType_Classpath_Description="Extension Classpath";

@XendraTrl(Identifier="22c8cb07-e47c-9f24-b5d8-940af28f8339")
public static String es_PE_FIELD_EntityType_Classpath_Help="If your appplication requires additional jar files, enter them here. The jar files must be located in the $XENDRA_HOME/lib directory.";

@XendraTrl(Identifier="22c8cb07-e47c-9f24-b5d8-940af28f8339")
public static String es_PE_FIELD_EntityType_Classpath_Name="Classpath";

@XendraField(AD_Column_ID="Classpath",IsCentrallyMaintained=true,
AD_Tab_ID="1908af9d-2827-f240-15b8-a3d8b689b64f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=255,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="22c8cb07-e47c-9f24-b5d8-940af28f8339")
public static final String FIELDNAME_EntityType_Classpath="22c8cb07-e47c-9f24-b5d8-940af28f8339";

@XendraTrl(Identifier="b9df92a0-ca14-cb9b-f37d-07566f785919")
public static String es_PE_COLUMN_Classpath_Name="Classpath";

@XendraColumn(AD_Element_ID="cdbe435b-e9e2-185e-f177-ddce4ab52bb4",ColumnName="Classpath",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b9df92a0-ca14-cb9b-f37d-07566f785919",
Synchronized="2017-08-05 16:52:29.0")
/** Column name Classpath */
public static final String COLUMNNAME_Classpath = "Classpath";
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

@XendraTrl(Identifier="0dc9291e-6f67-d85e-16f3-c1ad14dfb447")
public static String es_PE_FIELD_EntityType_Description_Description="Observación";

@XendraTrl(Identifier="0dc9291e-6f67-d85e-16f3-c1ad14dfb447")
public static String es_PE_FIELD_EntityType_Description_Help="Observación";

@XendraTrl(Identifier="0dc9291e-6f67-d85e-16f3-c1ad14dfb447")
public static String es_PE_FIELD_EntityType_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="1908af9d-2827-f240-15b8-a3d8b689b64f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=255,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0dc9291e-6f67-d85e-16f3-c1ad14dfb447")
public static final String FIELDNAME_EntityType_Description="0dc9291e-6f67-d85e-16f3-c1ad14dfb447";

@XendraTrl(Identifier="bd186637-5b64-bd83-ca33-ec129c869f52")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bd186637-5b64-bd83-ca33-ec129c869f52",
Synchronized="2017-08-05 16:52:29.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Entity Type.
@param EntityType Dictionary Entity Type: Determines ownership and synchronization */
public void setEntityType (String EntityType)
{
if (EntityType == null) throw new IllegalArgumentException ("EntityType is mandatory.");
if (EntityType.length() > 4)
{
log.warning("Length > 4 - truncated");
EntityType = EntityType.substring(0,3);
}
set_ValueNoCheck (COLUMNNAME_EntityType, EntityType);
}
/** Get Entity Type.
@return Dictionary Entity Type: Determines ownership and synchronization */
public String getEntityType() 
{
String value = (String)get_Value(COLUMNNAME_EntityType);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="63b3a4b0-b358-380a-770e-59da5dcfdb5f")
public static String es_PE_FIELD_EntityType_EntityType2_Description="Tipo de Entidad Diccionario; determina propiedad y sincronización";

@XendraTrl(Identifier="63b3a4b0-b358-380a-770e-59da5dcfdb5f")
public static String es_PE_FIELD_EntityType_EntityType2_Help="Los tipos de entidad \"Diccionario\"; \"Adempiere\"; y \"Aplicación\" podrían ser automáticamente sincronizados y las personalizaciones eliminadas ó sobreescritas";

@XendraTrl(Identifier="63b3a4b0-b358-380a-770e-59da5dcfdb5f")
public static String es_PE_FIELD_EntityType_EntityType2_Name="Tipo de Entidad";

@XendraField(AD_Column_ID="EntityType",IsCentrallyMaintained=true,
AD_Tab_ID="1908af9d-2827-f240-15b8-a3d8b689b64f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=4,IsReadOnly=false,SeqNo=30,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="63b3a4b0-b358-380a-770e-59da5dcfdb5f")
public static final String FIELDNAME_EntityType_EntityType2="63b3a4b0-b358-380a-770e-59da5dcfdb5f";

@XendraTrl(Identifier="46c95409-2816-70e9-addd-cb8d4208de77")
public static String es_PE_COLUMN_EntityType_Name="Tipo de Entidad";

@XendraColumn(AD_Element_ID="5ba917bf-871c-6f19-aa50-962adc5de558",ColumnName="EntityType",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=4,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="46c95409-2816-70e9-addd-cb8d4208de77",
Synchronized="2017-08-05 16:52:29.0")
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

@XendraTrl(Identifier="aeea3e2d-ff1e-77e1-17e5-0ef6c9db607a")
public static String es_PE_FIELD_EntityType_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="aeea3e2d-ff1e-77e1-17e5-0ef6c9db607a")
public static String es_PE_FIELD_EntityType_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraTrl(Identifier="aeea3e2d-ff1e-77e1-17e5-0ef6c9db607a")
public static String es_PE_FIELD_EntityType_CommentHelp_Name="Ayuda";

@XendraField(AD_Column_ID="Help",IsCentrallyMaintained=true,
AD_Tab_ID="1908af9d-2827-f240-15b8-a3d8b689b64f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=2000,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="aeea3e2d-ff1e-77e1-17e5-0ef6c9db607a")
public static final String FIELDNAME_EntityType_CommentHelp="aeea3e2d-ff1e-77e1-17e5-0ef6c9db607a";

@XendraTrl(Identifier="89bc2490-6cde-2897-b83e-f7eddea0ba08")
public static String es_PE_COLUMN_Help_Name="Ayuda";

@XendraColumn(AD_Element_ID="a6fda582-56f9-6bb7-8436-285ce4f8de3f",ColumnName="Help",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="89bc2490-6cde-2897-b83e-f7eddea0ba08",
Synchronized="2017-08-05 16:52:29.0")
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
@XendraTrl(Identifier="c5ef20c2-7c82-49c2-b39a-f046860aa22d")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c5ef20c2-7c82-49c2-b39a-f046860aa22d",
Synchronized="2017-08-05 16:52:29.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set ModelPackage.
@param ModelPackage Java Package of the model classes */
public void setModelPackage (String ModelPackage)
{
if (ModelPackage != null && ModelPackage.length() > 255)
{
log.warning("Length > 255 - truncated");
ModelPackage = ModelPackage.substring(0,254);
}
set_Value (COLUMNNAME_ModelPackage, ModelPackage);
}
/** Get ModelPackage.
@return Java Package of the model classes */
public String getModelPackage() 
{
String value = (String)get_Value(COLUMNNAME_ModelPackage);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="dd16d2e2-a794-0198-d885-758a8fc32b25")
public static String es_PE_FIELD_EntityType_ModelPackage_Description="Java Package of the model classes";

@XendraTrl(Identifier="dd16d2e2-a794-0198-d885-758a8fc32b25")
public static String es_PE_FIELD_EntityType_ModelPackage_Help="By default, the Java model classes for extensions are in the compiere.model package.  If you provide a jar file in the classpath, you can define here your specific model package.  The model classes are used to save/modify/delete entries and as well as in Workflow.  Refer to the Compiere naming convention to make sure that your class is used rather then the base classes.";

@XendraTrl(Identifier="dd16d2e2-a794-0198-d885-758a8fc32b25")
public static String es_PE_FIELD_EntityType_ModelPackage_Name="ModelPackage";

@XendraField(AD_Column_ID="ModelPackage",IsCentrallyMaintained=true,
AD_Tab_ID="1908af9d-2827-f240-15b8-a3d8b689b64f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=255,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="dd16d2e2-a794-0198-d885-758a8fc32b25")
public static final String FIELDNAME_EntityType_ModelPackage="dd16d2e2-a794-0198-d885-758a8fc32b25";

@XendraTrl(Identifier="b2c60d54-6302-3c05-30f7-a90dad4bcd97")
public static String es_PE_COLUMN_ModelPackage_Name="ModelPackage";

@XendraColumn(AD_Element_ID="5e010070-b315-4d44-9bda-c6f9412169c7",ColumnName="ModelPackage",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b2c60d54-6302-3c05-30f7-a90dad4bcd97",
Synchronized="2017-08-05 16:52:29.0")
/** Column name ModelPackage */
public static final String COLUMNNAME_ModelPackage = "ModelPackage";
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

@XendraTrl(Identifier="1fa9e598-a051-0073-a8c1-957317d9f4f3")
public static String es_PE_FIELD_EntityType_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="1fa9e598-a051-0073-a8c1-957317d9f4f3")
public static String es_PE_FIELD_EntityType_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="1fa9e598-a051-0073-a8c1-957317d9f4f3")
public static String es_PE_FIELD_EntityType_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="1908af9d-2827-f240-15b8-a3d8b689b64f",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=120,IsReadOnly=false,SeqNo=40,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="1fa9e598-a051-0073-a8c1-957317d9f4f3")
public static final String FIELDNAME_EntityType_Name="1fa9e598-a051-0073-a8c1-957317d9f4f3";

@XendraTrl(Identifier="a008812f-9c21-097b-b8e9-378036d007c5")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=120,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a008812f-9c21-097b-b8e9-378036d007c5",
Synchronized="2017-08-05 16:52:29.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Process Now.
@param Processing Process Now */
public void setProcessing (boolean Processing)
{
set_Value (COLUMNNAME_Processing, Boolean.valueOf(Processing));
}
/** Get Process Now.
@return Process Now */
public boolean isProcessing() 
{
Object oo = get_Value(COLUMNNAME_Processing);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="2205d516-31a0-bcaf-40ab-cceba51cf04a")
public static String es_PE_FIELD_EntityType_ProcessNow_Description="Register your extension with Adempiere";

@XendraTrl(Identifier="2205d516-31a0-bcaf-40ab-cceba51cf04a")
public static String es_PE_FIELD_EntityType_ProcessNow_Help="You can register the four character extension with Adempiere. This makes sure that your extension can be automatically distributed and implemented.  You will also be able to certify extensions.  Contact Adempiere for details.";

@XendraTrl(Identifier="2205d516-31a0-bcaf-40ab-cceba51cf04a")
public static String es_PE_FIELD_EntityType_ProcessNow_Name="Register Extension";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="1908af9d-2827-f240-15b8-a3d8b689b64f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2205d516-31a0-bcaf-40ab-cceba51cf04a")
public static final String FIELDNAME_EntityType_ProcessNow="2205d516-31a0-bcaf-40ab-cceba51cf04a";

@XendraTrl(Identifier="cd11cb20-18c7-c65d-1e88-c5aa2f106832")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="e5aaf6f0-b975-7960-2bf4-58dafe8f4f17",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="cd11cb20-18c7-c65d-1e88-c5aa2f106832",Synchronized="2017-08-05 16:52:29.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
/** Set Version.
@param Version Version of the table definition */
public void setVersion (String Version)
{
if (Version != null && Version.length() > 20)
{
log.warning("Length > 20 - truncated");
Version = Version.substring(0,19);
}
set_Value (COLUMNNAME_Version, Version);
}
/** Get Version.
@return Version of the table definition */
public String getVersion() 
{
String value = (String)get_Value(COLUMNNAME_Version);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="a27b1b9a-db18-6ee8-4666-4f13a7690590")
public static String es_PE_FIELD_EntityType_Version_Description="Versión de la definición de tabla";

@XendraTrl(Identifier="a27b1b9a-db18-6ee8-4666-4f13a7690590")
public static String es_PE_FIELD_EntityType_Version_Help="La versión indica la versión de esta definición de tabla";

@XendraTrl(Identifier="a27b1b9a-db18-6ee8-4666-4f13a7690590")
public static String es_PE_FIELD_EntityType_Version_Name="Versión";

@XendraField(AD_Column_ID="Version",IsCentrallyMaintained=true,
AD_Tab_ID="1908af9d-2827-f240-15b8-a3d8b689b64f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a27b1b9a-db18-6ee8-4666-4f13a7690590")
public static final String FIELDNAME_EntityType_Version="a27b1b9a-db18-6ee8-4666-4f13a7690590";

@XendraTrl(Identifier="3ce849cb-e552-e597-0f24-2fb0d30e475e")
public static String es_PE_COLUMN_Version_Name="Versión";

@XendraColumn(AD_Element_ID="739fe203-51de-92a9-b8a8-c08f63b73506",ColumnName="Version",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3ce849cb-e552-e597-0f24-2fb0d30e475e",
Synchronized="2017-08-05 16:52:30.0")
/** Column name Version */
public static final String COLUMNNAME_Version = "Version";
}
