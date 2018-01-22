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
/** Generated Model for AD_Workbench
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_Workbench extends PO
{
/** Standard Constructor
@param ctx context
@param AD_Workbench_ID id
@param trxName transaction
*/
public X_AD_Workbench (Properties ctx, int AD_Workbench_ID, String trxName)
{
super (ctx, AD_Workbench_ID, trxName);
/** if (AD_Workbench_ID == 0)
{
setAD_Column_ID (0);
setAD_Workbench_ID (0);
setEntityType (null);	
// U
setName (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_Workbench (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=468 */
public static int Table_ID=MTable.getTable_ID("AD_Workbench");

@XendraTrl(Identifier="4af7d789-b6ef-617e-ced6-5ca7b10edf40")
public static String es_PE_TAB_Workbench_Description="Bancos de trabajo son un conjunto de ventanas";

@XendraTrl(Identifier="4af7d789-b6ef-617e-ced6-5ca7b10edf40")
public static String es_PE_TAB_Workbench_Name="Banco de Trabajo";
@XendraTab(Name="Workbench",
Description="Workbenches are a collection of Windows",Help="",
AD_Window_ID="1dcff49a-d577-7b76-550b-57511d7e5935",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="4af7d789-b6ef-617e-ced6-5ca7b10edf40",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Workbench="4af7d789-b6ef-617e-ced6-5ca7b10edf40";

@XendraTrl(Identifier="6854397a-3127-8595-9c08-f7b2e6ca0b21")
public static String es_PE_TABLE_AD_Workbench_Name="Banco de Trabajo";

@XendraTable(Name="Workbench",Description="Collection of windows, reports",Help="",
TableName="AD_Workbench",AccessLevel="4",AD_Window_ID="1dcff49a-d577-7b76-550b-57511d7e5935",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=135,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.dictionary",
Identifier="6854397a-3127-8595-9c08-f7b2e6ca0b21",Synchronized="2017-08-16 11:41:12.0")
/** TableName=AD_Workbench */
public static final String Table_Name="AD_Workbench";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_Workbench");

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
    Table_ID = MTable.getTable_ID("AD_Workbench");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_Workbench[").append(get_ID()).append("]");
return sb.toString();
}
/** Set System Color.
@param AD_Color_ID Color for backgrounds or indicators */
public void setAD_Color_ID (Object AD_Color_ID)
{
set_Value (COLUMNNAME_AD_Color_ID, AD_Color_ID);
}
/** Get System Color.
@return Color for backgrounds or indicators */
public Object getAD_Color_ID() 
{
return get_Value(COLUMNNAME_AD_Color_ID);
}

@XendraTrl(Identifier="431bd0bf-016c-cc7c-9ee2-0cd2314e7a1d")
public static String es_PE_FIELD_Workbench_SystemColor_Description="Color para el fondo ó indicadores";

@XendraTrl(Identifier="431bd0bf-016c-cc7c-9ee2-0cd2314e7a1d")
public static String es_PE_FIELD_Workbench_SystemColor_Name="Color";

@XendraField(AD_Column_ID="AD_Color_ID",IsCentrallyMaintained=true,
AD_Tab_ID="4af7d789-b6ef-617e-ced6-5ca7b10edf40",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="431bd0bf-016c-cc7c-9ee2-0cd2314e7a1d")
public static final String FIELDNAME_Workbench_SystemColor="431bd0bf-016c-cc7c-9ee2-0cd2314e7a1d";

@XendraTrl(Identifier="835e49d6-ec0f-5f14-9721-a7ae6e6ee8f2")
public static String es_PE_COLUMN_AD_Color_ID_Name="Color";

@XendraColumn(AD_Element_ID="e2547f9b-260e-de2e-bcfa-1188b5ee4d22",ColumnName="AD_Color_ID",
AD_Reference_ID=27,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="835e49d6-ec0f-5f14-9721-a7ae6e6ee8f2",
Synchronized="2017-08-05 16:53:02.0")
/** Column name AD_Color_ID */
public static final String COLUMNNAME_AD_Color_ID = "AD_Color_ID";

/** AD_Column_ID AD_Reference=c48bb868-887b-d4f4-81fc-17af38a78354 */
public static final int AD_COLUMN_ID_AD_Reference_ID=244;
/** Set Column.
@param AD_Column_ID Column in the table */
public void setAD_Column_ID (int AD_Column_ID)
{
if (AD_Column_ID < 1) throw new IllegalArgumentException ("AD_Column_ID is mandatory.");
set_Value (COLUMNNAME_AD_Column_ID, Integer.valueOf(AD_Column_ID));
}
/** Get Column.
@return Column in the table */
public int getAD_Column_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Column_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="9f098822-5016-f0bc-2761-cd6d45230496")
public static String es_PE_FIELD_Workbench_DrivingColumn_Description="Columna que controla todas las pesta=F1as en el banco de trabajo.";

@XendraTrl(Identifier="9f098822-5016-f0bc-2761-cd6d45230496")
public static String es_PE_FIELD_Workbench_DrivingColumn_Name="Conducir la columna";

@XendraField(AD_Column_ID="AD_Column_ID",IsCentrallyMaintained=false,
AD_Tab_ID="4af7d789-b6ef-617e-ced6-5ca7b10edf40",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9f098822-5016-f0bc-2761-cd6d45230496")
public static final String FIELDNAME_Workbench_DrivingColumn="9f098822-5016-f0bc-2761-cd6d45230496";

@XendraTrl(Identifier="4d3f052f-08c2-8ebd-e2ad-fc7aadcb9423")
public static String es_PE_COLUMN_AD_Column_ID_Name="Columna";

@XendraColumn(AD_Element_ID="a0dcf1ba-2ef3-ca06-ed42-8ae37c632eaf",ColumnName="AD_Column_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="c48bb868-887b-d4f4-81fc-17af38a78354",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="4d3f052f-08c2-8ebd-e2ad-fc7aadcb9423",Synchronized="2017-08-05 16:53:02.0")
/** Column name AD_Column_ID */
public static final String COLUMNNAME_AD_Column_ID = "AD_Column_ID";
/** Set Image.
@param AD_Image_ID Image or Icon */
public void setAD_Image_ID (int AD_Image_ID)
{
if (AD_Image_ID <= 0) set_Value (COLUMNNAME_AD_Image_ID, null);
 else 
set_Value (COLUMNNAME_AD_Image_ID, Integer.valueOf(AD_Image_ID));
}
/** Get Image.
@return Image or Icon */
public int getAD_Image_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Image_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="df6a49bb-0440-682c-446a-352c955fc379")
public static String es_PE_FIELD_Workbench_Image_Description="Imagen del sistema";

@XendraTrl(Identifier="df6a49bb-0440-682c-446a-352c955fc379")
public static String es_PE_FIELD_Workbench_Image_Name="Imagen";

@XendraField(AD_Column_ID="AD_Image_ID",IsCentrallyMaintained=true,
AD_Tab_ID="4af7d789-b6ef-617e-ced6-5ca7b10edf40",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="df6a49bb-0440-682c-446a-352c955fc379")
public static final String FIELDNAME_Workbench_Image="df6a49bb-0440-682c-446a-352c955fc379";

@XendraTrl(Identifier="8835e55a-c02b-a9a4-d6a1-3e0fcfadc9a7")
public static String es_PE_COLUMN_AD_Image_ID_Name="Imagen";

@XendraColumn(AD_Element_ID="8464640e-ab89-67ff-b78b-1e8940657a22",ColumnName="AD_Image_ID",
AD_Reference_ID=32,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8835e55a-c02b-a9a4-d6a1-3e0fcfadc9a7",
Synchronized="2017-08-05 16:53:03.0")
/** Column name AD_Image_ID */
public static final String COLUMNNAME_AD_Image_ID = "AD_Image_ID";
/** Set Workbench.
@param AD_Workbench_ID Collection of windows, reports */
public void setAD_Workbench_ID (int AD_Workbench_ID)
{
if (AD_Workbench_ID < 1) throw new IllegalArgumentException ("AD_Workbench_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_Workbench_ID, Integer.valueOf(AD_Workbench_ID));
}
/** Get Workbench.
@return Collection of windows, reports */
public int getAD_Workbench_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Workbench_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="c2989e31-ac44-e25a-16e0-1fa86f8b5095")
public static String es_PE_FIELD_Workbench_Workbench_Description="Colección de ventanas; Informes";

@XendraTrl(Identifier="c2989e31-ac44-e25a-16e0-1fa86f8b5095")
public static String es_PE_FIELD_Workbench_Workbench_Name="Banco de Trabajo";

@XendraField(AD_Column_ID="AD_Workbench_ID",IsCentrallyMaintained=true,
AD_Tab_ID="4af7d789-b6ef-617e-ced6-5ca7b10edf40",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c2989e31-ac44-e25a-16e0-1fa86f8b5095")
public static final String FIELDNAME_Workbench_Workbench="c2989e31-ac44-e25a-16e0-1fa86f8b5095";
/** Column name AD_Workbench_ID */
public static final String COLUMNNAME_AD_Workbench_ID = "AD_Workbench_ID";
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

@XendraTrl(Identifier="b9b9d6e3-d18e-c7a5-bd0b-1f1969ff935f")
public static String es_PE_FIELD_Workbench_Description_Description="Observación";

@XendraTrl(Identifier="b9b9d6e3-d18e-c7a5-bd0b-1f1969ff935f")
public static String es_PE_FIELD_Workbench_Description_Help="Observación";

@XendraTrl(Identifier="b9b9d6e3-d18e-c7a5-bd0b-1f1969ff935f")
public static String es_PE_FIELD_Workbench_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="4af7d789-b6ef-617e-ced6-5ca7b10edf40",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b9b9d6e3-d18e-c7a5-bd0b-1f1969ff935f")
public static final String FIELDNAME_Workbench_Description="b9b9d6e3-d18e-c7a5-bd0b-1f1969ff935f";

@XendraTrl(Identifier="a06d75a5-2419-2cb6-c9f7-06f5d8f16aba")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a06d75a5-2419-2cb6-c9f7-06f5d8f16aba",
Synchronized="2017-08-05 16:53:03.0")
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

@XendraTrl(Identifier="50b7e2db-bb9a-6995-4dfe-788c74324a4a")
public static String es_PE_FIELD_Workbench_EntityType_Description="Tipo de Entidad Diccionario; determina propiedad y sincronización";

@XendraTrl(Identifier="50b7e2db-bb9a-6995-4dfe-788c74324a4a")
public static String es_PE_FIELD_Workbench_EntityType_Help="Los tipos de entidad \"Diccionario\"; \"Adempiere\"; y \"Aplicación\" podrían ser automáticamente sincronizados y las personalizaciones eliminadas ó sobreescritas";

@XendraTrl(Identifier="50b7e2db-bb9a-6995-4dfe-788c74324a4a")
public static String es_PE_FIELD_Workbench_EntityType_Name="Tipo de Entidad";

@XendraField(AD_Column_ID="EntityType",IsCentrallyMaintained=true,
AD_Tab_ID="4af7d789-b6ef-617e-ced6-5ca7b10edf40",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="50b7e2db-bb9a-6995-4dfe-788c74324a4a")
public static final String FIELDNAME_Workbench_EntityType="50b7e2db-bb9a-6995-4dfe-788c74324a4a";

@XendraTrl(Identifier="d85a3dcf-9af1-f6c3-ff93-bfdf5f6242fc")
public static String es_PE_COLUMN_EntityType_Name="Tipo de Entidad";

@XendraColumn(AD_Element_ID="5ba917bf-871c-6f19-aa50-962adc5de558",ColumnName="EntityType",
AD_Reference_ID=18,AD_Reference_Value_ID="fae4ad31-8ff1-5d5c-8d47-2426c541cd74",AD_Val_Rule_ID="",
FieldLength=4,DefaultValue="U",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="@EntityType@=D",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="d85a3dcf-9af1-f6c3-ff93-bfdf5f6242fc",Synchronized="2017-08-05 16:53:03.0")
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

@XendraTrl(Identifier="a9b47557-f674-4db3-8328-23161457994e")
public static String es_PE_FIELD_Workbench_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="a9b47557-f674-4db3-8328-23161457994e")
public static String es_PE_FIELD_Workbench_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraTrl(Identifier="a9b47557-f674-4db3-8328-23161457994e")
public static String es_PE_FIELD_Workbench_CommentHelp_Name="Ayuda";

@XendraField(AD_Column_ID="Help",IsCentrallyMaintained=true,
AD_Tab_ID="4af7d789-b6ef-617e-ced6-5ca7b10edf40",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a9b47557-f674-4db3-8328-23161457994e")
public static final String FIELDNAME_Workbench_CommentHelp="a9b47557-f674-4db3-8328-23161457994e";

@XendraTrl(Identifier="036259d3-d133-f654-8e57-debf26dd544a")
public static String es_PE_COLUMN_Help_Name="Ayuda";

@XendraColumn(AD_Element_ID="a6fda582-56f9-6bb7-8436-285ce4f8de3f",ColumnName="Help",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="036259d3-d133-f654-8e57-debf26dd544a",
Synchronized="2017-08-05 16:53:03.0")
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
@XendraTrl(Identifier="7c83a2a2-84ee-42cc-9b0b-0d63ef555203")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7c83a2a2-84ee-42cc-9b0b-0d63ef555203",
Synchronized="2017-08-05 16:53:03.0")
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

@XendraTrl(Identifier="de324242-2663-fb6d-1acb-d320c372bd22")
public static String es_PE_FIELD_Workbench_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="de324242-2663-fb6d-1acb-d320c372bd22")
public static String es_PE_FIELD_Workbench_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="de324242-2663-fb6d-1acb-d320c372bd22")
public static String es_PE_FIELD_Workbench_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="4af7d789-b6ef-617e-ced6-5ca7b10edf40",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=1,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="de324242-2663-fb6d-1acb-d320c372bd22")
public static final String FIELDNAME_Workbench_Name="de324242-2663-fb6d-1acb-d320c372bd22";

@XendraTrl(Identifier="d84c65a0-b4e0-1970-1681-cc4796a98ac1")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d84c65a0-b4e0-1970-1681-cc4796a98ac1",
Synchronized="2017-08-05 16:53:03.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
}
