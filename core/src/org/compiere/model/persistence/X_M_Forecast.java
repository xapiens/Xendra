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
/** Generated Model for M_Forecast
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_Forecast extends PO
{
/** Standard Constructor
@param ctx context
@param M_Forecast_ID id
@param trxName transaction
*/
public X_M_Forecast (Properties ctx, int M_Forecast_ID, String trxName)
{
super (ctx, M_Forecast_ID, trxName);
/** if (M_Forecast_ID == 0)
{
setC_Calendar_ID (0);
setC_Year_ID (0);
setIsDefault (false);	
// N
setM_Forecast_ID (0);
setName (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_M_Forecast (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=720 */
public static int Table_ID=MTable.getTable_ID("M_Forecast");

@XendraTrl(Identifier="c1b07917-5ae4-c060-3d05-2acd3cb9eb40")
public static String es_PE_TAB_Forecast_Description="Material pronósticado";

@XendraTrl(Identifier="c1b07917-5ae4-c060-3d05-2acd3cb9eb40")
public static String es_PE_TAB_Forecast_Name="Pronosticar";

@XendraTrl(Identifier="c1b07917-5ae4-c060-3d05-2acd3cb9eb40")
public static String es_PE_TAB_Forecast_Help="Material pronósticado";
@XendraTab(Name="Forecast",
Description="Material Forecast",Help="Material Forecast",
AD_Window_ID="06d44e37-f9cc-1106-262a-5b7b41954a21",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="c1b07917-5ae4-c060-3d05-2acd3cb9eb40",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Forecast="c1b07917-5ae4-c060-3d05-2acd3cb9eb40";

@XendraTrl(Identifier="c4c43f53-0d27-42b3-5d20-72a9b1311258")
public static String es_PE_TABLE_M_Forecast_Name="Pronóstico";

@XendraTable(Name="Forecast",Description="Material Forecast",Help="",TableName="M_Forecast",
AccessLevel="2",AD_Window_ID="06d44e37-f9cc-1106-262a-5b7b41954a21",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=135,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.material",
Identifier="c4c43f53-0d27-42b3-5d20-72a9b1311258",Synchronized="2017-08-16 11:43:11.0")
/** TableName=M_Forecast */
public static final String Table_Name="M_Forecast";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_Forecast");

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
    Table_ID = MTable.getTable_ID("M_Forecast");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_Forecast[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Calendar.
@param C_Calendar_ID Accounting Calendar Name */
public void setC_Calendar_ID (int C_Calendar_ID)
{
if (C_Calendar_ID < 1) throw new IllegalArgumentException ("C_Calendar_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_Calendar_ID, Integer.valueOf(C_Calendar_ID));
}
/** Get Calendar.
@return Accounting Calendar Name */
public int getC_Calendar_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Calendar_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="94826572-5d3c-e62e-9117-e86f98fcc2d4")
public static String es_PE_FIELD_Forecast_Calendar_Description="Nombre del Calendario Contable";

@XendraTrl(Identifier="94826572-5d3c-e62e-9117-e86f98fcc2d4")
public static String es_PE_FIELD_Forecast_Calendar_Help="El calendario únicamente identifica un calendario contable. Múltiples calendarios pueden ser usados. Ej. Ud. puede necesitar un calendario estándar que corre del 1 de enero al 31 de diciembre y un calendario fiscal que corre del 1 de julio al 30 de junio.";

@XendraTrl(Identifier="94826572-5d3c-e62e-9117-e86f98fcc2d4")
public static String es_PE_FIELD_Forecast_Calendar_Name="Calendario";

@XendraField(AD_Column_ID="C_Calendar_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c1b07917-5ae4-c060-3d05-2acd3cb9eb40",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="94826572-5d3c-e62e-9117-e86f98fcc2d4")
public static final String FIELDNAME_Forecast_Calendar="94826572-5d3c-e62e-9117-e86f98fcc2d4";

@XendraTrl(Identifier="6add697b-0ca4-b168-994b-3c99623b7f50")
public static String es_PE_COLUMN_C_Calendar_ID_Name="Calendario";

@XendraColumn(AD_Element_ID="f78f20f5-74d2-53fd-4e80-4df19abaa806",ColumnName="C_Calendar_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6add697b-0ca4-b168-994b-3c99623b7f50",
Synchronized="2017-08-05 16:55:06.0")
/** Column name C_Calendar_ID */
public static final String COLUMNNAME_C_Calendar_ID = "C_Calendar_ID";
/** Set Year.
@param C_Year_ID Calendar Year */
public void setC_Year_ID (int C_Year_ID)
{
if (C_Year_ID < 1) throw new IllegalArgumentException ("C_Year_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_Year_ID, Integer.valueOf(C_Year_ID));
}
/** Get Year.
@return Calendar Year */
public int getC_Year_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Year_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="3a561090-d7f8-f219-8620-e89c2fa5ac30")
public static String es_PE_FIELD_Forecast_Year_Description="Año del calendario";

@XendraTrl(Identifier="3a561090-d7f8-f219-8620-e89c2fa5ac30")
public static String es_PE_FIELD_Forecast_Year_Help="El Año identifica únicamente un año contable para un calendario";

@XendraTrl(Identifier="3a561090-d7f8-f219-8620-e89c2fa5ac30")
public static String es_PE_FIELD_Forecast_Year_Name="Año";
@XendraField(AD_Column_ID="C_Year_ID",
IsCentrallyMaintained=true,AD_Tab_ID="c1b07917-5ae4-c060-3d05-2acd3cb9eb40",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="3a561090-d7f8-f219-8620-e89c2fa5ac30")
public static final String FIELDNAME_Forecast_Year="3a561090-d7f8-f219-8620-e89c2fa5ac30";

@XendraTrl(Identifier="3b0f0cb2-91f2-36b3-ac2c-94030ca0f1b9")
public static String es_PE_COLUMN_C_Year_ID_Name="Año";

@XendraColumn(AD_Element_ID="c7021f96-c6b3-e088-ab83-e25c3e111170",ColumnName="C_Year_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="30a559a5-b676-32d1-61bf-2d3c267cfbd1",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="3b0f0cb2-91f2-36b3-ac2c-94030ca0f1b9",Synchronized="2017-08-05 16:55:06.0")
/** Column name C_Year_ID */
public static final String COLUMNNAME_C_Year_ID = "C_Year_ID";
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

@XendraTrl(Identifier="2453858a-78e2-dfdc-9803-ea28c2c221d3")
public static String es_PE_FIELD_Forecast_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="2453858a-78e2-dfdc-9803-ea28c2c221d3")
public static String es_PE_FIELD_Forecast_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="2453858a-78e2-dfdc-9803-ea28c2c221d3")
public static String es_PE_FIELD_Forecast_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="c1b07917-5ae4-c060-3d05-2acd3cb9eb40",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2453858a-78e2-dfdc-9803-ea28c2c221d3")
public static final String FIELDNAME_Forecast_Description="2453858a-78e2-dfdc-9803-ea28c2c221d3";

@XendraTrl(Identifier="f25e60e3-7543-5873-1d9a-8385e1f39521")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f25e60e3-7543-5873-1d9a-8385e1f39521",
Synchronized="2017-08-05 16:55:06.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Comment/Help.
@param Help Comment or Hint */
public void setHelp (String Help)
{
if (Help != null && Help.length() > 2000)
{
log.warning("Length > 2000 - truncated");
Help = Help.substring(0,1999);
}
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

@XendraTrl(Identifier="bfa3ea7d-540f-42fc-e380-e041986d2637")
public static String es_PE_FIELD_Forecast_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="bfa3ea7d-540f-42fc-e380-e041986d2637")
public static String es_PE_FIELD_Forecast_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraTrl(Identifier="bfa3ea7d-540f-42fc-e380-e041986d2637")
public static String es_PE_FIELD_Forecast_CommentHelp_Name="Ayuda";

@XendraField(AD_Column_ID="Help",IsCentrallyMaintained=true,
AD_Tab_ID="c1b07917-5ae4-c060-3d05-2acd3cb9eb40",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bfa3ea7d-540f-42fc-e380-e041986d2637")
public static final String FIELDNAME_Forecast_CommentHelp="bfa3ea7d-540f-42fc-e380-e041986d2637";

@XendraTrl(Identifier="53bd860d-46e0-29dd-8b39-2dc9f4c3d913")
public static String es_PE_COLUMN_Help_Name="Ayuda";

@XendraColumn(AD_Element_ID="a6fda582-56f9-6bb7-8436-285ce4f8de3f",ColumnName="Help",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="53bd860d-46e0-29dd-8b39-2dc9f4c3d913",
Synchronized="2017-08-05 16:55:06.0")
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
@XendraTrl(Identifier="71e14d9a-086c-4404-b394-d334fabf8591")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="71e14d9a-086c-4404-b394-d334fabf8591",
Synchronized="2017-08-05 16:55:06.0")
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

@XendraTrl(Identifier="f944399a-6a7b-b162-3bcd-a69f22207998")
public static String es_PE_FIELD_Forecast_Default_Description="Valor Predeterminado";

@XendraTrl(Identifier="f944399a-6a7b-b162-3bcd-a69f22207998")
public static String es_PE_FIELD_Forecast_Default_Help="El cuadro de verificación indica si este registro será usado como un valor predeterminado";

@XendraTrl(Identifier="f944399a-6a7b-b162-3bcd-a69f22207998")
public static String es_PE_FIELD_Forecast_Default_Name="Predeterminado";

@XendraField(AD_Column_ID="IsDefault",IsCentrallyMaintained=true,
AD_Tab_ID="c1b07917-5ae4-c060-3d05-2acd3cb9eb40",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f944399a-6a7b-b162-3bcd-a69f22207998")
public static final String FIELDNAME_Forecast_Default="f944399a-6a7b-b162-3bcd-a69f22207998";

@XendraTrl(Identifier="a9496b44-15b0-2e35-fda4-66d998bb28ab")
public static String es_PE_COLUMN_IsDefault_Name="Predeterminado";

@XendraColumn(AD_Element_ID="8617f892-e113-a5fd-8715-687f792f136c",ColumnName="IsDefault",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a9496b44-15b0-2e35-fda4-66d998bb28ab",
Synchronized="2017-08-05 16:55:06.0")
/** Column name IsDefault */
public static final String COLUMNNAME_IsDefault = "IsDefault";
/** Set Forecast.
@param M_Forecast_ID Material Forecast */
public void setM_Forecast_ID (int M_Forecast_ID)
{
if (M_Forecast_ID < 1) throw new IllegalArgumentException ("M_Forecast_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_Forecast_ID, Integer.valueOf(M_Forecast_ID));
}
/** Get Forecast.
@return Material Forecast */
public int getM_Forecast_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Forecast_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="03ccce62-0f4c-c7d1-b0ba-451c0b60f652")
public static String es_PE_FIELD_Forecast_Forecast_Description="Pronóstico de material";

@XendraTrl(Identifier="03ccce62-0f4c-c7d1-b0ba-451c0b60f652")
public static String es_PE_FIELD_Forecast_Forecast_Help="Pronóstico de material";

@XendraTrl(Identifier="03ccce62-0f4c-c7d1-b0ba-451c0b60f652")
public static String es_PE_FIELD_Forecast_Forecast_Name="Pronóstico";

@XendraField(AD_Column_ID="M_Forecast_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c1b07917-5ae4-c060-3d05-2acd3cb9eb40",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="03ccce62-0f4c-c7d1-b0ba-451c0b60f652")
public static final String FIELDNAME_Forecast_Forecast="03ccce62-0f4c-c7d1-b0ba-451c0b60f652";
/** Column name M_Forecast_ID */
public static final String COLUMNNAME_M_Forecast_ID = "M_Forecast_ID";
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

@XendraTrl(Identifier="da5a6e27-f6b2-c062-f564-b273bd652f81")
public static String es_PE_FIELD_Forecast_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="da5a6e27-f6b2-c062-f564-b273bd652f81")
public static String es_PE_FIELD_Forecast_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="da5a6e27-f6b2-c062-f564-b273bd652f81")
public static String es_PE_FIELD_Forecast_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="c1b07917-5ae4-c060-3d05-2acd3cb9eb40",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=1,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="da5a6e27-f6b2-c062-f564-b273bd652f81")
public static final String FIELDNAME_Forecast_Name="da5a6e27-f6b2-c062-f564-b273bd652f81";

@XendraTrl(Identifier="abf2588a-b9bf-e651-373e-a807d56f1b1a")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="abf2588a-b9bf-e651-373e-a807d56f1b1a",
Synchronized="2017-08-05 16:55:06.0")
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

@XendraTrl(Identifier="1b55da8f-15ce-23ed-ac07-014711a65284")
public static String es_PE_FIELD_Forecast_ProcessNow_Name="Procesar Ahora";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="c1b07917-5ae4-c060-3d05-2acd3cb9eb40",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1b55da8f-15ce-23ed-ac07-014711a65284")
public static final String FIELDNAME_Forecast_ProcessNow="1b55da8f-15ce-23ed-ac07-014711a65284";

@XendraTrl(Identifier="377c8aa9-be45-f6f6-f555-90533d2ea7cd")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="377c8aa9-be45-f6f6-f555-90533d2ea7cd",
Synchronized="2017-08-05 16:55:06.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
}
