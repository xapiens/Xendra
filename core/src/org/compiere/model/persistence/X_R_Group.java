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
/** Generated Model for R_Group
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_R_Group extends PO
{
/** Standard Constructor
@param ctx context
@param R_Group_ID id
@param trxName transaction
*/
public X_R_Group (Properties ctx, int R_Group_ID, String trxName)
{
super (ctx, R_Group_ID, trxName);
/** if (R_Group_ID == 0)
{
setName (null);
setR_Group_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_R_Group (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=773 */
public static int Table_ID=MTable.getTable_ID("R_Group");

@XendraTrl(Identifier="dcfc47b5-3095-5442-bac9-af8752d2dd46")
public static String es_PE_TAB_RequestGroup_Description="Mantener grupo de solicitud";

@XendraTrl(Identifier="dcfc47b5-3095-5442-bac9-af8752d2dd46")
public static String es_PE_TAB_RequestGroup_Name="Grupo de Solicitud";

@XendraTrl(Identifier="dcfc47b5-3095-5442-bac9-af8752d2dd46")
public static String es_PE_TAB_RequestGroup_Help="Grupo de solicitud (ej. número de versión, responsabilidad, ...). Si una LDM es referencia y permite el tipo de solicitud, una solicitud del cambio de LDM se crea automáticamente.";

@XendraTab(Name="Request Group",Description="Maintain Request Groups",
Help="Group of requests (e.g. version numbers, responsibility, ...).  If a BOM is referenced  and enabled in Request Type, a BOM Change Request is automatically created.",
AD_Window_ID="48b04170-f7f3-e7b8-2750-b4787c524f8a",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="dcfc47b5-3095-5442-bac9-af8752d2dd46",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_RequestGroup="dcfc47b5-3095-5442-bac9-af8752d2dd46";

@XendraTrl(Identifier="b56b196e-05f2-9005-2b80-3cacb161c2f5")
public static String es_PE_TABLE_R_Group_Name="Grupo";

@XendraTable(Name="Group",Description="Request Group",Help="",TableName="R_Group",AccessLevel="6",
AD_Window_ID="48b04170-f7f3-e7b8-2750-b4787c524f8a",AD_Val_Rule_ID="",IsKey=1,LoadSeq=130,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.standard",Identifier="b56b196e-05f2-9005-2b80-3cacb161c2f5",
Synchronized="2017-08-16 11:43:47.0")
/** TableName=R_Group */
public static final String Table_Name="R_Group";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"R_Group");

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
    Table_ID = MTable.getTable_ID("R_Group");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_R_Group[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="8b9d6278-ec1b-030a-803a-a44d9c585f3d")
public static String es_PE_FIELD_RequestGroup_Description_Description="Observación";

@XendraTrl(Identifier="8b9d6278-ec1b-030a-803a-a44d9c585f3d")
public static String es_PE_FIELD_RequestGroup_Description_Help="Observación";

@XendraTrl(Identifier="8b9d6278-ec1b-030a-803a-a44d9c585f3d")
public static String es_PE_FIELD_RequestGroup_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="dcfc47b5-3095-5442-bac9-af8752d2dd46",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8b9d6278-ec1b-030a-803a-a44d9c585f3d")
public static final String FIELDNAME_RequestGroup_Description="8b9d6278-ec1b-030a-803a-a44d9c585f3d";

@XendraTrl(Identifier="f095fae7-84af-89b6-efcc-ce16b4b2f79d")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f095fae7-84af-89b6-efcc-ce16b4b2f79d",
Synchronized="2017-08-05 16:55:48.0")
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

@XendraTrl(Identifier="d4eb9e1c-379b-6ed3-4379-8e7a52226adc")
public static String es_PE_FIELD_RequestGroup_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="d4eb9e1c-379b-6ed3-4379-8e7a52226adc")
public static String es_PE_FIELD_RequestGroup_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraTrl(Identifier="d4eb9e1c-379b-6ed3-4379-8e7a52226adc")
public static String es_PE_FIELD_RequestGroup_CommentHelp_Name="Ayuda";

@XendraField(AD_Column_ID="Help",IsCentrallyMaintained=true,
AD_Tab_ID="dcfc47b5-3095-5442-bac9-af8752d2dd46",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d4eb9e1c-379b-6ed3-4379-8e7a52226adc")
public static final String FIELDNAME_RequestGroup_CommentHelp="d4eb9e1c-379b-6ed3-4379-8e7a52226adc";

@XendraTrl(Identifier="7d87b0a2-c35a-5bb2-87f5-c35884c5dae9")
public static String es_PE_COLUMN_Help_Name="Ayuda";

@XendraColumn(AD_Element_ID="a6fda582-56f9-6bb7-8436-285ce4f8de3f",ColumnName="Help",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7d87b0a2-c35a-5bb2-87f5-c35884c5dae9",
Synchronized="2017-08-05 16:55:48.0")
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
@XendraTrl(Identifier="375f7ed6-e610-4c1d-8df0-7d199dc073b3")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="375f7ed6-e610-4c1d-8df0-7d199dc073b3",
Synchronized="2017-08-05 16:55:48.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set BOM.
@param M_BOM_ID Bill of Material */
public void setM_BOM_ID (int M_BOM_ID)
{
if (M_BOM_ID <= 0) set_Value (COLUMNNAME_M_BOM_ID, null);
 else 
set_Value (COLUMNNAME_M_BOM_ID, Integer.valueOf(M_BOM_ID));
}
/** Get BOM.
@return Bill of Material */
public int getM_BOM_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_BOM_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="8b7f0b37-b38f-40ca-d987-89a852b6e44d")
public static String es_PE_FIELD_RequestGroup_BOM_Description="Lista de materiales";

@XendraTrl(Identifier="8b7f0b37-b38f-40ca-d987-89a852b6e44d")
public static String es_PE_FIELD_RequestGroup_BOM_Help="La composición de el producto.";

@XendraTrl(Identifier="8b7f0b37-b38f-40ca-d987-89a852b6e44d")
public static String es_PE_FIELD_RequestGroup_BOM_Name="LDM";
@XendraField(AD_Column_ID="M_BOM_ID",
IsCentrallyMaintained=true,AD_Tab_ID="dcfc47b5-3095-5442-bac9-af8752d2dd46",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=80,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="8b7f0b37-b38f-40ca-d987-89a852b6e44d")
public static final String FIELDNAME_RequestGroup_BOM="8b7f0b37-b38f-40ca-d987-89a852b6e44d";

@XendraTrl(Identifier="f556bedd-910c-b6d8-f2ac-e4a4c096e000")
public static String es_PE_COLUMN_M_BOM_ID_Name="LDM";

@XendraColumn(AD_Element_ID="f74f158f-a1ce-2b65-149d-8ef9be21d27e",ColumnName="M_BOM_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f556bedd-910c-b6d8-f2ac-e4a4c096e000",
Synchronized="2017-08-05 16:55:48.0")
/** Column name M_BOM_ID */
public static final String COLUMNNAME_M_BOM_ID = "M_BOM_ID";
/** Set Change Notice.
@param M_ChangeNotice_ID Bill of Materials (Engineering) Change Notice (Version) */
public void setM_ChangeNotice_ID (int M_ChangeNotice_ID)
{
if (M_ChangeNotice_ID <= 0) set_Value (COLUMNNAME_M_ChangeNotice_ID, null);
 else 
set_Value (COLUMNNAME_M_ChangeNotice_ID, Integer.valueOf(M_ChangeNotice_ID));
}
/** Get Change Notice.
@return Bill of Materials (Engineering) Change Notice (Version) */
public int getM_ChangeNotice_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_ChangeNotice_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d06b27d6-f2c0-903e-cdd0-fc2c9159d313")
public static String es_PE_FIELD_RequestGroup_ChangeNotice_Description="Cuenta de materiales (ingeniería) cambio de aviso (versión)";

@XendraTrl(Identifier="d06b27d6-f2c0-903e-cdd0-fc2c9159d313")
public static String es_PE_FIELD_RequestGroup_ChangeNotice_Name="Aviso de Cambio";

@XendraField(AD_Column_ID="M_ChangeNotice_ID",IsCentrallyMaintained=true,
AD_Tab_ID="dcfc47b5-3095-5442-bac9-af8752d2dd46",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d06b27d6-f2c0-903e-cdd0-fc2c9159d313")
public static final String FIELDNAME_RequestGroup_ChangeNotice="d06b27d6-f2c0-903e-cdd0-fc2c9159d313";

@XendraTrl(Identifier="32fb8a24-6b03-9047-cac1-9e41c6432b28")
public static String es_PE_COLUMN_M_ChangeNotice_ID_Name="Aviso de Cambio";

@XendraColumn(AD_Element_ID="9ef80c4a-fc78-9760-2916-157f9f8d80b3",ColumnName="M_ChangeNotice_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="32fb8a24-6b03-9047-cac1-9e41c6432b28",
Synchronized="2017-08-05 16:55:48.0")
/** Column name M_ChangeNotice_ID */
public static final String COLUMNNAME_M_ChangeNotice_ID = "M_ChangeNotice_ID";
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

@XendraTrl(Identifier="8bf673eb-c296-e708-8961-383f1f691ebd")
public static String es_PE_FIELD_RequestGroup_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="8bf673eb-c296-e708-8961-383f1f691ebd")
public static String es_PE_FIELD_RequestGroup_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="8bf673eb-c296-e708-8961-383f1f691ebd")
public static String es_PE_FIELD_RequestGroup_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="dcfc47b5-3095-5442-bac9-af8752d2dd46",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=30,SortNo=1,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="8bf673eb-c296-e708-8961-383f1f691ebd")
public static final String FIELDNAME_RequestGroup_Name="8bf673eb-c296-e708-8961-383f1f691ebd";

@XendraTrl(Identifier="2a2ae417-5a4d-8d30-6275-e9ffde1d9ad0")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2a2ae417-5a4d-8d30-6275-e9ffde1d9ad0",
Synchronized="2017-08-05 16:55:48.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Group.
@param R_Group_ID Request Group */
public void setR_Group_ID (int R_Group_ID)
{
if (R_Group_ID < 1) throw new IllegalArgumentException ("R_Group_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_R_Group_ID, Integer.valueOf(R_Group_ID));
}
/** Get Group.
@return Request Group */
public int getR_Group_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_R_Group_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="78006938-448d-2762-2c5f-500710d262b9")
public static String es_PE_FIELD_RequestGroup_Group_Description="Grupo de solicitud";

@XendraTrl(Identifier="78006938-448d-2762-2c5f-500710d262b9")
public static String es_PE_FIELD_RequestGroup_Group_Help="Grupo de solicitud (ej. versión de números, responsabilidad, ...)";

@XendraTrl(Identifier="78006938-448d-2762-2c5f-500710d262b9")
public static String es_PE_FIELD_RequestGroup_Group_Name="Grupo";

@XendraField(AD_Column_ID="R_Group_ID",IsCentrallyMaintained=true,
AD_Tab_ID="dcfc47b5-3095-5442-bac9-af8752d2dd46",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="78006938-448d-2762-2c5f-500710d262b9")
public static final String FIELDNAME_RequestGroup_Group="78006938-448d-2762-2c5f-500710d262b9";
/** Column name R_Group_ID */
public static final String COLUMNNAME_R_Group_ID = "R_Group_ID";
}
