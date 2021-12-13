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
/** Generated Model for AD_Reference
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_Reference extends PO
{
/** Standard Constructor
@param ctx context
@param AD_Reference_ID id
@param trxName transaction
*/
public X_AD_Reference (Properties ctx, int AD_Reference_ID, String trxName)
{
super (ctx, AD_Reference_ID, trxName);
/** if (AD_Reference_ID == 0)
{
setAD_Reference_ID (0);
setEntityType (null);	
// U
setName (null);
setValidationType (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_Reference (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=102 */
public static int Table_ID=MTable.getTable_ID("AD_Reference");

@XendraTrl(Identifier="ebe0c712-7259-fadc-352b-4c729e9af35e")
public static String es_PE_TAB_Reference_Description="Definiciones de encabezamiento de referencia";

@XendraTrl(Identifier="ebe0c712-7259-fadc-352b-4c729e9af35e")
public static String es_PE_TAB_Reference_Help="La pestaña de referencia define las referencias que son usadas para validar datos";

@XendraTrl(Identifier="ebe0c712-7259-fadc-352b-4c729e9af35e")
public static String es_PE_TAB_Reference_Name="Referencia";
@XendraTab(Name="Reference",
Description="Reference header definitions",
Help="The Reference Tab defines the references that are used to validate data",
AD_Window_ID="3aa1b885-6192-d44a-f2c0-c82b9363e3f6",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="ebe0c712-7259-fadc-352b-4c729e9af35e",Synchronized="2015-11-26 11:06:59.0")
public static final String TABNAME_Reference="ebe0c712-7259-fadc-352b-4c729e9af35e";

@XendraTrl(Identifier="3cd705e1-15f3-7f0c-f643-2f507c38415c")
public static String es_PE_TABLE_AD_Reference_Name="Referencia";

@XendraTable(Name="Reference",AD_Package_ID="24337a04-c03d-922c-e7ce-2876bf8880b5",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="System Reference (Pick List)",
Help="",TableName="AD_Reference",AccessLevel="4",
AD_Window_ID="3aa1b885-6192-d44a-f2c0-c82b9363e3f6",AD_Val_Rule_ID="",IsKey=1,LoadSeq=125,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.request",Identifier="3cd705e1-15f3-7f0c-f643-2f507c38415c",
Synchronized="2020-03-03 21:35:49.0")
/** TableName=AD_Reference */
public static final String Table_Name="AD_Reference";


@XendraIndex(Name="ad_reference_name",Identifier="bb96e56a-c332-4ab2-3c39-de5e22d0fe9c",
Column_Names="name",IsUnique="true",TableIdentifier="bb96e56a-c332-4ab2-3c39-de5e22d0fe9c",
Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_ad_reference_name = "bb96e56a-c332-4ab2-3c39-de5e22d0fe9c";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_Reference");

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
    Table_ID = MTable.getTable_ID("AD_Reference");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_Reference[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Reference.
@param AD_Reference_ID System Reference and Validation */
public void setAD_Reference_ID (int AD_Reference_ID)
{
if (AD_Reference_ID < 1) throw new IllegalArgumentException ("AD_Reference_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_Reference_ID, Integer.valueOf(AD_Reference_ID));
}
/** Get Reference.
@return System Reference and Validation */
public int getAD_Reference_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Reference_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="69e5263c-37e3-7d39-44f5-f7dc3a01ec44")
public static String es_PE_FIELD_Reference_Reference_Name="Referencia";

@XendraTrl(Identifier="69e5263c-37e3-7d39-44f5-f7dc3a01ec44")
public static String es_PE_FIELD_Reference_Reference_Description="Referencia del Sistema (Lista de Selección)";

@XendraTrl(Identifier="69e5263c-37e3-7d39-44f5-f7dc3a01ec44")
public static String es_PE_FIELD_Reference_Reference_Help="La Referencia indica el tipo de campo de referencia";

@XendraField(AD_Column_ID="AD_Reference_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ebe0c712-7259-fadc-352b-4c729e9af35e",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="69e5263c-37e3-7d39-44f5-f7dc3a01ec44")
public static final String FIELDNAME_Reference_Reference="69e5263c-37e3-7d39-44f5-f7dc3a01ec44";
/** Column name AD_Reference_ID */
public static final String COLUMNNAME_AD_Reference_ID = "AD_Reference_ID";
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
@XendraTrl(Identifier="0b3f8495-da7f-4bf8-92c0-6b3179db15c1")
public static String es_PE_COLUMN_Classname_Name="Classname";

@XendraColumn(AD_Element_ID="43b208b9-53a3-0d59-0255-aaf07c9bd7ce",ColumnName="Classname",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0b3f8495-da7f-4bf8-92c0-6b3179db15c1",
Synchronized="2019-08-30 22:20:36.0")
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

@XendraTrl(Identifier="7f769f00-164b-2d13-f217-bab335d34f4c")
public static String es_PE_FIELD_Reference_Description_Name="Observación";

@XendraTrl(Identifier="7f769f00-164b-2d13-f217-bab335d34f4c")
public static String es_PE_FIELD_Reference_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="7f769f00-164b-2d13-f217-bab335d34f4c")
public static String es_PE_FIELD_Reference_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="ebe0c712-7259-fadc-352b-4c729e9af35e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7f769f00-164b-2d13-f217-bab335d34f4c")
public static final String FIELDNAME_Reference_Description="7f769f00-164b-2d13-f217-bab335d34f4c";

@XendraTrl(Identifier="80264213-0885-f2b1-a4f3-0eddd0c4c1f3")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="80264213-0885-f2b1-a4f3-0eddd0c4c1f3",
Synchronized="2019-08-30 22:20:36.0")
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

@XendraTrl(Identifier="10f6eb9f-e4d0-292c-8f54-5f2e3404cc64")
public static String es_PE_FIELD_Reference_EntityType_Name="Tipo de Entidad";

@XendraTrl(Identifier="10f6eb9f-e4d0-292c-8f54-5f2e3404cc64")
public static String es_PE_FIELD_Reference_EntityType_Description="Tipo de Entidad Diccionario; determina propiedad y sincronización";

@XendraTrl(Identifier="10f6eb9f-e4d0-292c-8f54-5f2e3404cc64")
public static String es_PE_FIELD_Reference_EntityType_Help="Los tipos de entidad \"Diccionario\"; \"Adempiere\"; y \"Aplicación\" podrían ser automáticamente sincronizados y las personalizaciones eliminadas ó sobreescritas";

@XendraField(AD_Column_ID="EntityType",IsCentrallyMaintained=true,
AD_Tab_ID="ebe0c712-7259-fadc-352b-4c729e9af35e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="10f6eb9f-e4d0-292c-8f54-5f2e3404cc64")
public static final String FIELDNAME_Reference_EntityType="10f6eb9f-e4d0-292c-8f54-5f2e3404cc64";

@XendraTrl(Identifier="f06e8955-961c-bf81-ab42-472b21022db5")
public static String es_PE_COLUMN_EntityType_Name="Tipo de Entidad";

@XendraColumn(AD_Element_ID="5ba917bf-871c-6f19-aa50-962adc5de558",ColumnName="EntityType",
AD_Reference_ID=18,AD_Reference_Value_ID="fae4ad31-8ff1-5d5c-8d47-2426c541cd74",AD_Val_Rule_ID="",
FieldLength=4,DefaultValue="U",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="@EntityType@=D",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="f06e8955-961c-bf81-ab42-472b21022db5",Synchronized="2019-08-30 22:20:36.0")
/** Column name EntityType */
public static final String COLUMNNAME_EntityType = "EntityType";
/** Set Extension.
@param Extension Extension */
public void setExtension (String Extension)
{
if (Extension != null && Extension.length() > 255)
{
log.warning("Length > 255 - truncated");
Extension = Extension.substring(0,254);
}
set_Value (COLUMNNAME_Extension, Extension);
}
/** Get Extension.
@return Extension */
public String getExtension() 
{
String value = (String)get_Value(COLUMNNAME_Extension);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="e40aaf3a-1d77-45a3-8030-849170d3a3d0")
public static String es_PE_FIELD_Reference_Extension_Name="extension";

@XendraField(AD_Column_ID="Extension",IsCentrallyMaintained=true,
AD_Tab_ID="ebe0c712-7259-fadc-352b-4c729e9af35e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=255,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2015-04-28 01:38:06.0",
Identifier="e40aaf3a-1d77-45a3-8030-849170d3a3d0")
public static final String FIELDNAME_Reference_Extension="e40aaf3a-1d77-45a3-8030-849170d3a3d0";

@XendraTrl(Identifier="fd9d291c-f750-4e25-8f88-c2bed1d85cb8")
public static String es_PE_COLUMN_Extension_Name="Extension";

@XendraColumn(AD_Element_ID="a6ec9764-7bbc-404e-870c-230ac4042a48",ColumnName="Extension",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fd9d291c-f750-4e25-8f88-c2bed1d85cb8",
Synchronized="2019-08-30 22:20:36.0")
/** Column name Extension */
public static final String COLUMNNAME_Extension = "Extension";
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

@XendraTrl(Identifier="0ba81773-4296-dd5f-428e-9c08d8f11ad9")
public static String es_PE_FIELD_Reference_CommentHelp_Name="Ayuda";

@XendraTrl(Identifier="0ba81773-4296-dd5f-428e-9c08d8f11ad9")
public static String es_PE_FIELD_Reference_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="0ba81773-4296-dd5f-428e-9c08d8f11ad9")
public static String es_PE_FIELD_Reference_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraField(AD_Column_ID="Help",IsCentrallyMaintained=true,
AD_Tab_ID="ebe0c712-7259-fadc-352b-4c729e9af35e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0ba81773-4296-dd5f-428e-9c08d8f11ad9")
public static final String FIELDNAME_Reference_CommentHelp="0ba81773-4296-dd5f-428e-9c08d8f11ad9";

@XendraTrl(Identifier="74304934-59ea-9b3a-4163-02b93585341c")
public static String es_PE_COLUMN_Help_Name="Ayuda";

@XendraColumn(AD_Element_ID="a6fda582-56f9-6bb7-8436-285ce4f8de3f",ColumnName="Help",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="74304934-59ea-9b3a-4163-02b93585341c",
Synchronized="2019-08-30 22:20:36.0")
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
@XendraTrl(Identifier="659cf5db-5648-4c36-ba37-33490dcde27b")
public static String es_PE_FIELD_Reference_Identifier_Name="Identifier";

@XendraField(AD_Column_ID="Identifier",IsCentrallyMaintained=true,
AD_Tab_ID="ebe0c712-7259-fadc-352b-4c729e9af35e",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=36,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2015-04-28 01:38:06.0",
Identifier="659cf5db-5648-4c36-ba37-33490dcde27b")
public static final String FIELDNAME_Reference_Identifier="659cf5db-5648-4c36-ba37-33490dcde27b";

@XendraTrl(Identifier="e9833d09-6edb-cd3e-b8f8-8c94a3018e44")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e9833d09-6edb-cd3e-b8f8-8c94a3018e44",
Synchronized="2019-08-30 22:20:36.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set IsOrderByValue.
@param IsOrderByValue IsOrderByValue */
public void setIsOrderByValue (boolean IsOrderByValue)
{
set_Value (COLUMNNAME_IsOrderByValue, Boolean.valueOf(IsOrderByValue));
}
/** Get IsOrderByValue.
@return IsOrderByValue */
public boolean isOrderByValue() 
{
Object oo = get_Value(COLUMNNAME_IsOrderByValue);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="941f0453-f41a-40c0-bc73-65df76af02aa")
public static String es_PE_FIELD_Reference_IsOrderByValue_Name="isorderbyvalue";

@XendraField(AD_Column_ID="IsOrderByValue",IsCentrallyMaintained=true,
AD_Tab_ID="ebe0c712-7259-fadc-352b-4c729e9af35e",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2015-04-28 01:38:06.0",
Identifier="941f0453-f41a-40c0-bc73-65df76af02aa")
public static final String FIELDNAME_Reference_IsOrderByValue="941f0453-f41a-40c0-bc73-65df76af02aa";

@XendraTrl(Identifier="918aae42-fd47-584f-c23d-5e90c3aec29d")
public static String es_PE_COLUMN_IsOrderByValue_Name="isorderbyvalue";

@XendraColumn(AD_Element_ID="05fcebf3-fe46-dd92-25bf-a3a941284835",ColumnName="IsOrderByValue",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="918aae42-fd47-584f-c23d-5e90c3aec29d",
Synchronized="2019-08-30 22:20:36.0")
/** Column name IsOrderByValue */
public static final String COLUMNNAME_IsOrderByValue = "IsOrderByValue";
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

@XendraTrl(Identifier="81604448-3947-bde3-c2ca-8fc5269e175f")
public static String es_PE_FIELD_Reference_Name_Name="Nombre";

@XendraTrl(Identifier="81604448-3947-bde3-c2ca-8fc5269e175f")
public static String es_PE_FIELD_Reference_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="81604448-3947-bde3-c2ca-8fc5269e175f")
public static String es_PE_FIELD_Reference_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="ebe0c712-7259-fadc-352b-4c729e9af35e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=30,SortNo=2,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="81604448-3947-bde3-c2ca-8fc5269e175f")
public static final String FIELDNAME_Reference_Name="81604448-3947-bde3-c2ca-8fc5269e175f";

@XendraTrl(Identifier="8a55f31b-7453-2abd-f054-a3fdeb926e47")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8a55f31b-7453-2abd-f054-a3fdeb926e47",
Synchronized="2019-08-30 22:20:36.0")
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

@XendraTrl(Identifier="9a0f2023-4872-4bfb-81b4-c9c0a57cd986")
public static String es_PE_FIELD_Reference_Synchronized_Name="Synchronized";

@XendraField(AD_Column_ID="Synchronized",IsCentrallyMaintained=true,
AD_Tab_ID="ebe0c712-7259-fadc-352b-4c729e9af35e",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=29,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2015-04-28 01:38:06.0",
Identifier="9a0f2023-4872-4bfb-81b4-c9c0a57cd986")
public static final String FIELDNAME_Reference_Synchronized="9a0f2023-4872-4bfb-81b4-c9c0a57cd986";

@XendraTrl(Identifier="b315e071-44e9-b7ef-d706-c50823ddb924")
public static String es_PE_COLUMN_Synchronized_Name="Synchronized";

@XendraColumn(AD_Element_ID="08f1e976-ceeb-f830-9d75-bf94f13a98ce",ColumnName="Synchronized",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b315e071-44e9-b7ef-d706-c50823ddb924",
Synchronized="2019-08-30 22:20:36.0")
/** Column name Synchronized */
public static final String COLUMNNAME_Synchronized = "Synchronized";
/** Set Validation type.
@param ValidationType Different method of validating data */
public void setValidationType (String ValidationType)
{
if (ValidationType.length() > 1)
{
log.warning("Length > 1 - truncated");
ValidationType = ValidationType.substring(0,0);
}
set_Value (COLUMNNAME_ValidationType, ValidationType);
}
/** Get Validation type.
@return Different method of validating data */
public String getValidationType() 
{
return (String)get_Value(COLUMNNAME_ValidationType);
}

@XendraTrl(Identifier="9a474ba0-9cc6-9b7a-350d-9a8a773872ad")
public static String es_PE_FIELD_Reference_ValidationType_Name="Tipo de Validación";

@XendraTrl(Identifier="9a474ba0-9cc6-9b7a-350d-9a8a773872ad")
public static String es_PE_FIELD_Reference_ValidationType_Description="Método diferente de validación de datos";

@XendraTrl(Identifier="9a474ba0-9cc6-9b7a-350d-9a8a773872ad")
public static String es_PE_FIELD_Reference_ValidationType_Help="El tipo de validación indica el método de validación a usar. Estos incluyen lista; tabla ó validación de tipo de datos";

@XendraField(AD_Column_ID="ValidationType",IsCentrallyMaintained=true,
AD_Tab_ID="ebe0c712-7259-fadc-352b-4c729e9af35e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9a474ba0-9cc6-9b7a-350d-9a8a773872ad")
public static final String FIELDNAME_Reference_ValidationType="9a474ba0-9cc6-9b7a-350d-9a8a773872ad";

@XendraTrl(Identifier="e64012c6-0f8b-ede6-5fab-7483f50bf2a1")
public static String es_PE_COLUMN_ValidationType_Name="Tipo de Validación";

@XendraColumn(AD_Element_ID="39cfb57a-8666-b87f-e321-f307e218023f",ColumnName="ValidationType",
AD_Reference_ID=17,AD_Reference_Value_ID="994e094c-1e92-8bac-18e9-6c49478f92c1",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=true,SeqNo=2,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=true,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="e64012c6-0f8b-ede6-5fab-7483f50bf2a1",Synchronized="2019-08-30 22:20:36.0")
/** Column name ValidationType */
public static final String COLUMNNAME_ValidationType = "ValidationType";
/** Set Value Format.
@param VFormat Format of the value: Can contain fixed format elements, Variables: '_lLoOaAcCa09' */
public void setVFormat (String VFormat)
{
if (VFormat != null && VFormat.length() > 40)
{
log.warning("Length > 40 - truncated");
VFormat = VFormat.substring(0,39);
}
set_Value (COLUMNNAME_VFormat, VFormat);
}
/** Get Value Format.
@return Format of the value: Can contain fixed format elements, Variables: '_lLoOaAcCa09' */
public String getVFormat() 
{
String value = (String)get_Value(COLUMNNAME_VFormat);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="ed1fdb58-1b5b-4329-54f2-fe1e7da68a3c")
public static String es_PE_FIELD_Reference_ValueFormat_Name="Formato del Valor";

@XendraTrl(Identifier="ed1fdb58-1b5b-4329-54f2-fe1e7da68a3c")
public static String es_PE_FIELD_Reference_ValueFormat_Description="Formato del valor; puede contener elementos de formato fijo; Variables: \"_lLoOaAcCa09\"";

@XendraTrl(Identifier="ed1fdb58-1b5b-4329-54f2-fe1e7da68a3c")
public static String es_PE_FIELD_Reference_ValueFormat_Help="<B>Elementos de validación:</B>";

@XendraField(AD_Column_ID="VFormat",IsCentrallyMaintained=true,
AD_Tab_ID="ebe0c712-7259-fadc-352b-4c729e9af35e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@ValidationType@=L",DisplayLength=20,IsReadOnly=false,SeqNo=90,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="ed1fdb58-1b5b-4329-54f2-fe1e7da68a3c")
public static final String FIELDNAME_Reference_ValueFormat="ed1fdb58-1b5b-4329-54f2-fe1e7da68a3c";

@XendraTrl(Identifier="7bad4eee-ba09-79b1-c0d6-6367d49cc423")
public static String es_PE_COLUMN_VFormat_Name="Formato del Valor";

@XendraColumn(AD_Element_ID="041d14f4-3102-bf3a-cf36-5153817cbfad",ColumnName="VFormat",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7bad4eee-ba09-79b1-c0d6-6367d49cc423",
Synchronized="2019-08-30 22:20:37.0")
/** Column name VFormat */
public static final String COLUMNNAME_VFormat = "VFormat";
}
