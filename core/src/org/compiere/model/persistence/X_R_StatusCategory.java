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
/** Generated Model for R_StatusCategory
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_R_StatusCategory extends PO
{
/** Standard Constructor
@param ctx context
@param R_StatusCategory_ID id
@param trxName transaction
*/
public X_R_StatusCategory (Properties ctx, int R_StatusCategory_ID, String trxName)
{
super (ctx, R_StatusCategory_ID, trxName);
/** if (R_StatusCategory_ID == 0)
{
setIsDefault (false);	
// N
setName (null);
setR_StatusCategory_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_R_StatusCategory (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=844 */
public static int Table_ID=MTable.getTable_ID("R_StatusCategory");

@XendraTrl(Identifier="9319c2db-36fe-900e-53e9-5b48338585db")
public static String es_PE_TAB_StatusCategory_Description="Request Status Category";

@XendraTrl(Identifier="9319c2db-36fe-900e-53e9-5b48338585db")
public static String es_PE_TAB_StatusCategory_Help="Category of Request Status enables to maintain different set of Status for different Request Categories";

@XendraTrl(Identifier="9319c2db-36fe-900e-53e9-5b48338585db")
public static String es_PE_TAB_StatusCategory_Name="Categoría de Estado";

@XendraTab(Name="Status Category",Description="Request Status Category",
Help="Category of Request Status enables to maintain different set of Status for different Request Categories",
AD_Window_ID="3f6b13dd-0a25-4d00-9f77-7570bb7d42a1",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="9319c2db-36fe-900e-53e9-5b48338585db",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_StatusCategory="9319c2db-36fe-900e-53e9-5b48338585db";

@XendraTrl(Identifier="521801c6-f041-9d09-a2dd-f8da09e04d3a")
public static String es_PE_TABLE_R_StatusCategory_Name="Status Category";

@XendraTable(Name="Status Category",AD_Package_ID="1b3656e5-71c7-1296-994e-9b2c4549c7fd",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Request Status Category",Help="",
TableName="R_StatusCategory",AccessLevel="6",AD_Window_ID="3f6b13dd-0a25-4d00-9f77-7570bb7d42a1",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.standard",
Identifier="521801c6-f041-9d09-a2dd-f8da09e04d3a",Synchronized="2020-03-03 21:39:43.0")
/** TableName=R_StatusCategory */
public static final String Table_Name="R_StatusCategory";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"R_StatusCategory");

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
    Table_ID = MTable.getTable_ID("R_StatusCategory");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_R_StatusCategory[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="30f513e0-dc8c-3bff-3b61-1032d95d2781")
public static String es_PE_FIELD_StatusCategory_Description_Name="Observación";

@XendraTrl(Identifier="30f513e0-dc8c-3bff-3b61-1032d95d2781")
public static String es_PE_FIELD_StatusCategory_Description_Description="Observación";

@XendraTrl(Identifier="30f513e0-dc8c-3bff-3b61-1032d95d2781")
public static String es_PE_FIELD_StatusCategory_Description_Help="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="9319c2db-36fe-900e-53e9-5b48338585db",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=255,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="30f513e0-dc8c-3bff-3b61-1032d95d2781")
public static final String FIELDNAME_StatusCategory_Description="30f513e0-dc8c-3bff-3b61-1032d95d2781";

@XendraTrl(Identifier="1d1d95b1-735c-2e07-24c4-1bc46dca532c")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1d1d95b1-735c-2e07-24c4-1bc46dca532c",
Synchronized="2019-08-30 22:23:52.0")
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

@XendraTrl(Identifier="1c107f5f-4499-cd85-aac9-016bcd8def75")
public static String es_PE_FIELD_StatusCategory_CommentHelp_Name="Ayuda";

@XendraTrl(Identifier="1c107f5f-4499-cd85-aac9-016bcd8def75")
public static String es_PE_FIELD_StatusCategory_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="1c107f5f-4499-cd85-aac9-016bcd8def75")
public static String es_PE_FIELD_StatusCategory_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraField(AD_Column_ID="Help",IsCentrallyMaintained=true,
AD_Tab_ID="9319c2db-36fe-900e-53e9-5b48338585db",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=2000,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1c107f5f-4499-cd85-aac9-016bcd8def75")
public static final String FIELDNAME_StatusCategory_CommentHelp="1c107f5f-4499-cd85-aac9-016bcd8def75";

@XendraTrl(Identifier="de91488e-0ee5-fb03-6431-cb4fa32504c6")
public static String es_PE_COLUMN_Help_Name="Ayuda";

@XendraColumn(AD_Element_ID="a6fda582-56f9-6bb7-8436-285ce4f8de3f",ColumnName="Help",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="de91488e-0ee5-fb03-6431-cb4fa32504c6",
Synchronized="2019-08-30 22:23:52.0")
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
@XendraTrl(Identifier="fd2ecb2a-11be-4516-9ec8-2f4bc0c2cb34")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fd2ecb2a-11be-4516-9ec8-2f4bc0c2cb34",
Synchronized="2019-08-30 22:23:52.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Default.
@param IsDefault Default value */
public void setIsDefault (boolean IsDefault)
{
set_Value (COLUMNNAME_IsDefault, Boolean.valueOf(IsDefault));
}
/** Get Default.
@return Default value */
public boolean isDefault() 
{
Object oo = get_Value(COLUMNNAME_IsDefault);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="181c95f7-2127-d55f-626c-ae0a3f7fd0b6")
public static String es_PE_FIELD_StatusCategory_Default_Name="Predeterminado";

@XendraTrl(Identifier="181c95f7-2127-d55f-626c-ae0a3f7fd0b6")
public static String es_PE_FIELD_StatusCategory_Default_Description="Valor Predeterminado";

@XendraTrl(Identifier="181c95f7-2127-d55f-626c-ae0a3f7fd0b6")
public static String es_PE_FIELD_StatusCategory_Default_Help="El cuadro de verificación indica si este registro será usado como un valor predeterminado";

@XendraField(AD_Column_ID="IsDefault",IsCentrallyMaintained=true,
AD_Tab_ID="9319c2db-36fe-900e-53e9-5b48338585db",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="181c95f7-2127-d55f-626c-ae0a3f7fd0b6")
public static final String FIELDNAME_StatusCategory_Default="181c95f7-2127-d55f-626c-ae0a3f7fd0b6";

@XendraTrl(Identifier="5c9d4c1d-0678-4e46-4899-85d5f50b7301")
public static String es_PE_COLUMN_IsDefault_Name="Predeterminado";

@XendraColumn(AD_Element_ID="8617f892-e113-a5fd-8715-687f792f136c",ColumnName="IsDefault",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5c9d4c1d-0678-4e46-4899-85d5f50b7301",
Synchronized="2019-08-30 22:23:52.0")
/** Column name IsDefault */
public static final String COLUMNNAME_IsDefault = "IsDefault";
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

@XendraTrl(Identifier="4d2b0237-410b-5579-38fa-e49e7420c1ed")
public static String es_PE_FIELD_StatusCategory_Name_Name="Nombre";

@XendraTrl(Identifier="4d2b0237-410b-5579-38fa-e49e7420c1ed")
public static String es_PE_FIELD_StatusCategory_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="4d2b0237-410b-5579-38fa-e49e7420c1ed")
public static String es_PE_FIELD_StatusCategory_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="9319c2db-36fe-900e-53e9-5b48338585db",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=120,IsReadOnly=false,SeqNo=30,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4d2b0237-410b-5579-38fa-e49e7420c1ed")
public static final String FIELDNAME_StatusCategory_Name="4d2b0237-410b-5579-38fa-e49e7420c1ed";

@XendraTrl(Identifier="fb90b1df-d6e1-6899-b60a-879601b9147b")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=120,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fb90b1df-d6e1-6899-b60a-879601b9147b",
Synchronized="2019-08-30 22:23:52.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Status Category.
@param R_StatusCategory_ID Request Status Category */
public void setR_StatusCategory_ID (int R_StatusCategory_ID)
{
if (R_StatusCategory_ID < 1) throw new IllegalArgumentException ("R_StatusCategory_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_R_StatusCategory_ID, Integer.valueOf(R_StatusCategory_ID));
}
/** Get Status Category.
@return Request Status Category */
public int getR_StatusCategory_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_R_StatusCategory_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="252be4d1-45e7-7d5a-a55e-99b093a013d9")
public static String es_PE_FIELD_StatusCategory_StatusCategory_Name="Status Category";

@XendraTrl(Identifier="252be4d1-45e7-7d5a-a55e-99b093a013d9")
public static String es_PE_FIELD_StatusCategory_StatusCategory_Description="Request Status Category";

@XendraTrl(Identifier="252be4d1-45e7-7d5a-a55e-99b093a013d9")
public static String es_PE_FIELD_StatusCategory_StatusCategory_Help="Category of Request Status enables to maintain different set of Status for different Request Categories";

@XendraField(AD_Column_ID="R_StatusCategory_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9319c2db-36fe-900e-53e9-5b48338585db",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="252be4d1-45e7-7d5a-a55e-99b093a013d9")
public static final String FIELDNAME_StatusCategory_StatusCategory="252be4d1-45e7-7d5a-a55e-99b093a013d9";
/** Column name R_StatusCategory_ID */
public static final String COLUMNNAME_R_StatusCategory_ID = "R_StatusCategory_ID";
}
