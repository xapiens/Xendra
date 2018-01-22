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
import org.compiere.model.reference.REF_C_ProjectTypeCategory;
/** Generated Model for C_ProjectType
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_ProjectType extends PO
{
/** Standard Constructor
@param ctx context
@param C_ProjectType_ID id
@param trxName transaction
*/
public X_C_ProjectType (Properties ctx, int C_ProjectType_ID, String trxName)
{
super (ctx, C_ProjectType_ID, trxName);
/** if (C_ProjectType_ID == 0)
{
setC_ProjectType_ID (0);
setName (null);
setProjectCategory (null);	
// N
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_ProjectType (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=575 */
public static int Table_ID=MTable.getTable_ID("C_ProjectType");

@XendraTrl(Identifier="c507b2a5-865f-0385-dba2-87eb1e74f84c")
public static String es_PE_TAB_ProjectType_Description="Mantener Tipo de Proyecto";

@XendraTrl(Identifier="c507b2a5-865f-0385-dba2-87eb1e74f84c")
public static String es_PE_TAB_ProjectType_Name="Tipo de Proyecto";

@XendraTrl(Identifier="c507b2a5-865f-0385-dba2-87eb1e74f84c")
public static String es_PE_TAB_ProjectType_Help="Tipo del Proyecto con fases y tareas opcionales de proyecto con la información estándar del funcionamiento";

@XendraTab(Name="Project Type",Description="Maintain Type of a Project",
Help="Type of the project with optional phases and tasks of the project with standard performance information",
AD_Window_ID="2e1a4ba2-daf5-c92e-d63d-46cbad48833e",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="c507b2a5-865f-0385-dba2-87eb1e74f84c",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_ProjectType="c507b2a5-865f-0385-dba2-87eb1e74f84c";

@XendraTrl(Identifier="beeffc8b-3e1f-8376-56ce-cdca8ccf6ce3")
public static String es_PE_TABLE_C_ProjectType_Name="Tipo de Proyecto";

@XendraTable(Name="Project Type",Description="Type of the project",Help="",
TableName="C_ProjectType",AccessLevel="3",AD_Window_ID="2e1a4ba2-daf5-c92e-d63d-46cbad48833e",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=90,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="beeffc8b-3e1f-8376-56ce-cdca8ccf6ce3",Synchronized="2017-08-16 11:42:22.0")
/** TableName=C_ProjectType */
public static final String Table_Name="C_ProjectType";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_ProjectType");

protected BigDecimal accessLevel = BigDecimal.valueOf(3);
/** AccessLevel
@return 3 - Client - Org 
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
    Table_ID = MTable.getTable_ID("C_ProjectType");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_ProjectType[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Project Type.
@param C_ProjectType_ID Type of the project */
public void setC_ProjectType_ID (int C_ProjectType_ID)
{
if (C_ProjectType_ID < 1) throw new IllegalArgumentException ("C_ProjectType_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_ProjectType_ID, Integer.valueOf(C_ProjectType_ID));
}
/** Get Project Type.
@return Type of the project */
public int getC_ProjectType_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_ProjectType_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="c0cd86c2-453f-d72e-57b6-f2b8fb34eb24")
public static String es_PE_FIELD_ProjectType_ProjectType_Description="Tipo de proyecto";

@XendraTrl(Identifier="c0cd86c2-453f-d72e-57b6-f2b8fb34eb24")
public static String es_PE_FIELD_ProjectType_ProjectType_Help="Tipo de proyecto con las fases opcionales del proyecto y la información estándar de funcionamiento";

@XendraTrl(Identifier="c0cd86c2-453f-d72e-57b6-f2b8fb34eb24")
public static String es_PE_FIELD_ProjectType_ProjectType_Name="Tipo de Proyecto";

@XendraField(AD_Column_ID="C_ProjectType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c507b2a5-865f-0385-dba2-87eb1e74f84c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c0cd86c2-453f-d72e-57b6-f2b8fb34eb24")
public static final String FIELDNAME_ProjectType_ProjectType="c0cd86c2-453f-d72e-57b6-f2b8fb34eb24";
/** Column name C_ProjectType_ID */
public static final String COLUMNNAME_C_ProjectType_ID = "C_ProjectType_ID";
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

@XendraTrl(Identifier="c6f7dc4c-cf1f-4053-0c02-d30b5ab8d53b")
public static String es_PE_FIELD_ProjectType_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="c6f7dc4c-cf1f-4053-0c02-d30b5ab8d53b")
public static String es_PE_FIELD_ProjectType_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="c6f7dc4c-cf1f-4053-0c02-d30b5ab8d53b")
public static String es_PE_FIELD_ProjectType_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="c507b2a5-865f-0385-dba2-87eb1e74f84c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c6f7dc4c-cf1f-4053-0c02-d30b5ab8d53b")
public static final String FIELDNAME_ProjectType_Description="c6f7dc4c-cf1f-4053-0c02-d30b5ab8d53b";

@XendraTrl(Identifier="1e77e3c0-82e4-25d6-2317-bd3aec5f7d3a")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1e77e3c0-82e4-25d6-2317-bd3aec5f7d3a",
Synchronized="2017-08-05 16:54:19.0")
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

@XendraTrl(Identifier="67316ce0-3583-612c-5ed1-ac9745f19287")
public static String es_PE_FIELD_ProjectType_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="67316ce0-3583-612c-5ed1-ac9745f19287")
public static String es_PE_FIELD_ProjectType_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraTrl(Identifier="67316ce0-3583-612c-5ed1-ac9745f19287")
public static String es_PE_FIELD_ProjectType_CommentHelp_Name="Ayuda";

@XendraField(AD_Column_ID="Help",IsCentrallyMaintained=true,
AD_Tab_ID="c507b2a5-865f-0385-dba2-87eb1e74f84c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="67316ce0-3583-612c-5ed1-ac9745f19287")
public static final String FIELDNAME_ProjectType_CommentHelp="67316ce0-3583-612c-5ed1-ac9745f19287";

@XendraTrl(Identifier="e0fe2134-1f8e-546e-be5d-9abbe216b726")
public static String es_PE_COLUMN_Help_Name="Ayuda";

@XendraColumn(AD_Element_ID="a6fda582-56f9-6bb7-8436-285ce4f8de3f",ColumnName="Help",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e0fe2134-1f8e-546e-be5d-9abbe216b726",
Synchronized="2017-08-05 16:54:19.0")
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
@XendraTrl(Identifier="11b4c533-40ac-47a8-ad6d-ee2058776636")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="11b4c533-40ac-47a8-ad6d-ee2058776636",
Synchronized="2017-08-05 16:54:19.0")
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

@XendraTrl(Identifier="128b4d06-78d5-6bc1-e093-10a0139852d6")
public static String es_PE_FIELD_ProjectType_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="128b4d06-78d5-6bc1-e093-10a0139852d6")
public static String es_PE_FIELD_ProjectType_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="128b4d06-78d5-6bc1-e093-10a0139852d6")
public static String es_PE_FIELD_ProjectType_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="c507b2a5-865f-0385-dba2-87eb1e74f84c",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=1,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="128b4d06-78d5-6bc1-e093-10a0139852d6")
public static final String FIELDNAME_ProjectType_Name="128b4d06-78d5-6bc1-e093-10a0139852d6";

@XendraTrl(Identifier="3ed929b5-36e8-0fc1-0273-3b0fb22335a5")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3ed929b5-36e8-0fc1-0273-3b0fb22335a5",
Synchronized="2017-08-05 16:54:19.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";

/** ProjectCategory AD_Reference=dd876d4c-6a7f-9d8e-4f7c-480645f3079a */
public static final int PROJECTCATEGORY_AD_Reference_ID=288;
/** Set Project Category.
@param ProjectCategory Project Category */
public void setProjectCategory (String ProjectCategory)
{
if (ProjectCategory == null) throw new IllegalArgumentException ("ProjectCategory is mandatory");
if (ProjectCategory.equals(REF_C_ProjectTypeCategory.General) || ProjectCategory.equals(REF_C_ProjectTypeCategory.AssetProject) || ProjectCategory.equals(REF_C_ProjectTypeCategory.WorkOrderJob) || ProjectCategory.equals(REF_C_ProjectTypeCategory.ServiceChargeProject));
 else throw new IllegalArgumentException ("ProjectCategory Invalid value - " + ProjectCategory + " - Reference_ID=288 - N - A - W - S");
if (ProjectCategory.length() > 1)
{
log.warning("Length > 1 - truncated");
ProjectCategory = ProjectCategory.substring(0,0);
}
set_ValueNoCheck (COLUMNNAME_ProjectCategory, ProjectCategory);
}
/** Get Project Category.
@return Project Category */
public String getProjectCategory() 
{
return (String)get_Value(COLUMNNAME_ProjectCategory);
}

@XendraTrl(Identifier="66b4563c-70ef-6e17-27c5-a9b3c80ea645")
public static String es_PE_FIELD_ProjectType_ProjectCategory_Description="Categoría del Proyecto";

@XendraTrl(Identifier="66b4563c-70ef-6e17-27c5-a9b3c80ea645")
public static String es_PE_FIELD_ProjectType_ProjectCategory_Help="La categoría del proyecto determina el comportamiento del proyecto:General - ninguna contabilidad especial, ej. para las pre-ventas ó seguir generalEl servicio - ninguna contabilidad especial, ej. para la orden de trabajo de los proyectos de Servicio/carga - crea las transacciones de Proyecto/Job WIP - capacidad de publicar activo material - crea las transacciones del activode proyecto - capacidad de publicar el material";

@XendraTrl(Identifier="66b4563c-70ef-6e17-27c5-a9b3c80ea645")
public static String es_PE_FIELD_ProjectType_ProjectCategory_Name="Categoría del Proyecto";

@XendraField(AD_Column_ID="ProjectCategory",IsCentrallyMaintained=true,
AD_Tab_ID="c507b2a5-865f-0385-dba2-87eb1e74f84c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="66b4563c-70ef-6e17-27c5-a9b3c80ea645")
public static final String FIELDNAME_ProjectType_ProjectCategory="66b4563c-70ef-6e17-27c5-a9b3c80ea645";

@XendraTrl(Identifier="e30574e9-e0df-695e-b6f1-7558a8d39df1")
public static String es_PE_COLUMN_ProjectCategory_Name="Categoría del Proyecto";

@XendraColumn(AD_Element_ID="57d9003e-8bd3-6171-c498-5ddff97037fd",ColumnName="ProjectCategory",
AD_Reference_ID=17,AD_Reference_Value_ID="dd876d4c-6a7f-9d8e-4f7c-480645f3079a",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="N",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="e30574e9-e0df-695e-b6f1-7558a8d39df1",Synchronized="2017-08-05 16:54:19.0")
/** Column name ProjectCategory */
public static final String COLUMNNAME_ProjectCategory = "ProjectCategory";
}
