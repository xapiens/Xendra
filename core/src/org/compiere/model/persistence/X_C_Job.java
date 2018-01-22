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
/** Generated Model for C_Job
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_Job extends PO
{
/** Standard Constructor
@param ctx context
@param C_Job_ID id
@param trxName transaction
*/
public X_C_Job (Properties ctx, int C_Job_ID, String trxName)
{
super (ctx, C_Job_ID, trxName);
/** if (C_Job_ID == 0)
{
setC_JobCategory_ID (0);
setC_Job_ID (0);
setIsEmployee (true);	
// Y
setName (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_Job (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=789 */
public static int Table_ID=MTable.getTable_ID("C_Job");

@XendraTrl(Identifier="951aa462-17aa-07e4-c2d4-c764636bf763")
public static String es_PE_TAB_Position_Description="Mantenga la posición del trabajo";

@XendraTrl(Identifier="951aa462-17aa-07e4-c2d4-c764636bf763")
public static String es_PE_TAB_Position_Name="Posicion";
@XendraTab(Name="Position",
Description="Maintain Job Position",Help="Maintain internal (employee) or external positions",
AD_Window_ID="af07de27-ee33-4462-55ef-e93e806652ca",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="951aa462-17aa-07e4-c2d4-c764636bf763",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Position="951aa462-17aa-07e4-c2d4-c764636bf763";

@XendraTrl(Identifier="bcda16a4-e84e-ee5e-c536-dc682d8b21ba")
public static String es_PE_TABLE_C_Job_Name="Posición";

@XendraTable(Name="Position",Description="",Help="",TableName="C_Job",AccessLevel="2",
AD_Window_ID="af07de27-ee33-4462-55ef-e93e806652ca",AD_Val_Rule_ID="",IsKey=1,LoadSeq=140,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.commercial",Identifier="bcda16a4-e84e-ee5e-c536-dc682d8b21ba",
Synchronized="2017-08-16 11:41:58.0")
/** TableName=C_Job */
public static final String Table_Name="C_Job";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_Job");

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
    Table_ID = MTable.getTable_ID("C_Job");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_Job[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Position Category.
@param C_JobCategory_ID Job Position Category */
public void setC_JobCategory_ID (int C_JobCategory_ID)
{
if (C_JobCategory_ID < 1) throw new IllegalArgumentException ("C_JobCategory_ID is mandatory.");
set_Value (COLUMNNAME_C_JobCategory_ID, Integer.valueOf(C_JobCategory_ID));
}
/** Get Position Category.
@return Job Position Category */
public int getC_JobCategory_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_JobCategory_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="edde2110-0b74-c39e-46c1-9189480e3c3c")
public static String es_PE_FIELD_Position_PositionCategory_Description="Categoría de posición del trabajo";

@XendraTrl(Identifier="edde2110-0b74-c39e-46c1-9189480e3c3c")
public static String es_PE_FIELD_Position_PositionCategory_Help="Clasificación de las posiciones de trabajo";

@XendraTrl(Identifier="edde2110-0b74-c39e-46c1-9189480e3c3c")
public static String es_PE_FIELD_Position_PositionCategory_Name="Categoría de Posición";

@XendraField(AD_Column_ID="C_JobCategory_ID",IsCentrallyMaintained=true,
AD_Tab_ID="951aa462-17aa-07e4-c2d4-c764636bf763",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="edde2110-0b74-c39e-46c1-9189480e3c3c")
public static final String FIELDNAME_Position_PositionCategory="edde2110-0b74-c39e-46c1-9189480e3c3c";

@XendraTrl(Identifier="8b8c9f3c-4709-ea30-dc41-be9db9ee6ae4")
public static String es_PE_COLUMN_C_JobCategory_ID_Name="Categoría de Posición";

@XendraColumn(AD_Element_ID="adb258fa-6a83-2fef-0b04-b2b3f872e325",ColumnName="C_JobCategory_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8b8c9f3c-4709-ea30-dc41-be9db9ee6ae4",
Synchronized="2017-08-05 16:53:50.0")
/** Column name C_JobCategory_ID */
public static final String COLUMNNAME_C_JobCategory_ID = "C_JobCategory_ID";
/** Set Position.
@param C_Job_ID Job Position */
public void setC_Job_ID (int C_Job_ID)
{
if (C_Job_ID < 1) throw new IllegalArgumentException ("C_Job_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_Job_ID, Integer.valueOf(C_Job_ID));
}
/** Get Position.
@return Job Position */
public int getC_Job_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Job_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="6e2b4fda-c9d5-0075-d1a3-12800b3f0d5a")
public static String es_PE_FIELD_Position_Position_Description="Posición del trabajo";

@XendraTrl(Identifier="6e2b4fda-c9d5-0075-d1a3-12800b3f0d5a")
public static String es_PE_FIELD_Position_Position_Name="Posición";

@XendraField(AD_Column_ID="C_Job_ID",IsCentrallyMaintained=true,
AD_Tab_ID="951aa462-17aa-07e4-c2d4-c764636bf763",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6e2b4fda-c9d5-0075-d1a3-12800b3f0d5a")
public static final String FIELDNAME_Position_Position="6e2b4fda-c9d5-0075-d1a3-12800b3f0d5a";
/** Column name C_Job_ID */
public static final String COLUMNNAME_C_Job_ID = "C_Job_ID";
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

@XendraTrl(Identifier="ec436384-ea05-05eb-0592-e7bb3313db58")
public static String es_PE_FIELD_Position_Description_Description="Observación";

@XendraTrl(Identifier="ec436384-ea05-05eb-0592-e7bb3313db58")
public static String es_PE_FIELD_Position_Description_Help="Observación";

@XendraTrl(Identifier="ec436384-ea05-05eb-0592-e7bb3313db58")
public static String es_PE_FIELD_Position_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="951aa462-17aa-07e4-c2d4-c764636bf763",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ec436384-ea05-05eb-0592-e7bb3313db58")
public static final String FIELDNAME_Position_Description="ec436384-ea05-05eb-0592-e7bb3313db58";

@XendraTrl(Identifier="d172fb38-96d8-2381-34b1-cff17360a74c")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d172fb38-96d8-2381-34b1-cff17360a74c",
Synchronized="2017-08-05 16:53:50.0")
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

@XendraTrl(Identifier="42a40118-3022-8c3f-6d9c-3c6758685324")
public static String es_PE_FIELD_Position_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="42a40118-3022-8c3f-6d9c-3c6758685324")
public static String es_PE_FIELD_Position_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraTrl(Identifier="42a40118-3022-8c3f-6d9c-3c6758685324")
public static String es_PE_FIELD_Position_CommentHelp_Name="Ayuda";

@XendraField(AD_Column_ID="Help",IsCentrallyMaintained=true,
AD_Tab_ID="951aa462-17aa-07e4-c2d4-c764636bf763",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="42a40118-3022-8c3f-6d9c-3c6758685324")
public static final String FIELDNAME_Position_CommentHelp="42a40118-3022-8c3f-6d9c-3c6758685324";

@XendraTrl(Identifier="38f661c7-42ff-d7e8-f291-e974725912ff")
public static String es_PE_COLUMN_Help_Name="Ayuda";

@XendraColumn(AD_Element_ID="a6fda582-56f9-6bb7-8436-285ce4f8de3f",ColumnName="Help",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="38f661c7-42ff-d7e8-f291-e974725912ff",
Synchronized="2017-08-05 16:53:50.0")
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
@XendraTrl(Identifier="83c06a2b-e35f-4fc6-a1ce-af89a027dc18")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="83c06a2b-e35f-4fc6-a1ce-af89a027dc18",
Synchronized="2017-08-05 16:53:50.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Employee.
@param IsEmployee Indicates if  this Business Partner is an employee */
public void setIsEmployee (boolean IsEmployee)
{
set_Value (COLUMNNAME_IsEmployee, Boolean.valueOf(IsEmployee));
}
/** Get Employee.
@return Indicates if  this Business Partner is an employee */
public boolean isEmployee() 
{
Object oo = get_Value(COLUMNNAME_IsEmployee);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="4859ca7d-fbb6-3706-fe89-1c8ad4c8c49c")
public static String es_PE_FIELD_Position_Employee_Description="Indica si el socio de negocio es un empleado";

@XendraTrl(Identifier="4859ca7d-fbb6-3706-fe89-1c8ad4c8c49c")
public static String es_PE_FIELD_Position_Employee_Help="El cuadro de verificación empleado indica si este socio de negocio es un empleado. Si se selecciona; se  desplegarán campos adicionales para identificar a este empleado.";

@XendraTrl(Identifier="4859ca7d-fbb6-3706-fe89-1c8ad4c8c49c")
public static String es_PE_FIELD_Position_Employee_Name="Empleado";

@XendraField(AD_Column_ID="IsEmployee",IsCentrallyMaintained=true,
AD_Tab_ID="951aa462-17aa-07e4-c2d4-c764636bf763",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4859ca7d-fbb6-3706-fe89-1c8ad4c8c49c")
public static final String FIELDNAME_Position_Employee="4859ca7d-fbb6-3706-fe89-1c8ad4c8c49c";

@XendraTrl(Identifier="23188447-f775-57d8-6199-ccd881cd9252")
public static String es_PE_COLUMN_IsEmployee_Name="Empleado";

@XendraColumn(AD_Element_ID="84da5ee0-801e-eb21-908e-8114648ff2ec",ColumnName="IsEmployee",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="23188447-f775-57d8-6199-ccd881cd9252",
Synchronized="2017-08-05 16:53:50.0")
/** Column name IsEmployee */
public static final String COLUMNNAME_IsEmployee = "IsEmployee";
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

@XendraTrl(Identifier="74e0ac96-617e-5413-58aa-80035b2144ec")
public static String es_PE_FIELD_Position_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="74e0ac96-617e-5413-58aa-80035b2144ec")
public static String es_PE_FIELD_Position_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="74e0ac96-617e-5413-58aa-80035b2144ec")
public static String es_PE_FIELD_Position_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="951aa462-17aa-07e4-c2d4-c764636bf763",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=30,SortNo=1,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="74e0ac96-617e-5413-58aa-80035b2144ec")
public static final String FIELDNAME_Position_Name="74e0ac96-617e-5413-58aa-80035b2144ec";

@XendraTrl(Identifier="fe1e6ff7-f0cb-fae7-8b88-a614ed93cf3b")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fe1e6ff7-f0cb-fae7-8b88-a614ed93cf3b",
Synchronized="2017-08-05 16:53:51.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
}
