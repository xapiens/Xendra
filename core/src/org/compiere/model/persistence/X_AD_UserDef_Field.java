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
/** Generated Model for AD_UserDef_Field
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_UserDef_Field extends PO
{
/** Standard Constructor
@param ctx context
@param AD_UserDef_Field_ID id
@param trxName transaction
*/
public X_AD_UserDef_Field (Properties ctx, int AD_UserDef_Field_ID, String trxName)
{
super (ctx, AD_UserDef_Field_ID, trxName);
/** if (AD_UserDef_Field_ID == 0)
{
setAD_Field_ID (0);
setAD_UserDef_Field_ID (0);
setAD_UserDef_Tab_ID (0);
setDefaultValue (null);
setIsDisplayed (false);	
// N
setIsReadOnly (false);	
// N
setIsSameLine (false);	
// N
setName (null);
setSeqNo (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_UserDef_Field (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=464 */
public static int Table_ID=MTable.getTable_ID("AD_UserDef_Field");

@XendraTrl(Identifier="1094eb37-ed37-5730-9b1c-6f542582b878")
public static String es_PE_TAB_FieldCustomization_Name="Personalización de Campo";

@XendraTab(Name="Field Customization",Description="",Help="",
AD_Window_ID="b1b1f4ea-07aa-32d8-5b9a-b3002bb6f98b",SeqNo=30,TabLevel=2,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="1094eb37-ed37-5730-9b1c-6f542582b878",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_FieldCustomization="1094eb37-ed37-5730-9b1c-6f542582b878";

@XendraTrl(Identifier="60a42e06-a433-1174-36d3-98b9b2bc38d6")
public static String es_PE_TABLE_AD_UserDef_Field_Name="Campo Definido por el Usuario";


@XendraTable(Name="User defined Field",AD_Package_ID="140d4d0c-8da8-bcb6-9c20-bc776701f80c",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="AD_UserDef_Field",AccessLevel="4",AD_Window_ID="b1b1f4ea-07aa-32d8-5b9a-b3002bb6f98b",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.dictionary",
Identifier="60a42e06-a433-1174-36d3-98b9b2bc38d6",Synchronized="2020-03-03 21:36:05.0")
/** TableName=AD_UserDef_Field */
public static final String Table_Name="AD_UserDef_Field";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_UserDef_Field");

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
    Table_ID = MTable.getTable_ID("AD_UserDef_Field");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_UserDef_Field[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Field.
@param AD_Field_ID Field on a database table */
public void setAD_Field_ID (int AD_Field_ID)
{
if (AD_Field_ID < 1) throw new IllegalArgumentException ("AD_Field_ID is mandatory.");
set_Value (COLUMNNAME_AD_Field_ID, Integer.valueOf(AD_Field_ID));
}
/** Get Field.
@return Field on a database table */
public int getAD_Field_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Field_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="3c57c50b-318b-a3ac-e8a7-de6d328a8589")
public static String es_PE_FIELD_FieldCustomization_Field_Name="Campo";

@XendraTrl(Identifier="3c57c50b-318b-a3ac-e8a7-de6d328a8589")
public static String es_PE_FIELD_FieldCustomization_Field_Description="Campo en una base de datos";

@XendraTrl(Identifier="3c57c50b-318b-a3ac-e8a7-de6d328a8589")
public static String es_PE_FIELD_FieldCustomization_Field_Help="El Campo identifica un campo en una tabla de base de datos";

@XendraField(AD_Column_ID="AD_Field_ID",IsCentrallyMaintained=true,
AD_Tab_ID="1094eb37-ed37-5730-9b1c-6f542582b878",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3c57c50b-318b-a3ac-e8a7-de6d328a8589")
public static final String FIELDNAME_FieldCustomization_Field="3c57c50b-318b-a3ac-e8a7-de6d328a8589";

@XendraTrl(Identifier="eb9e3a88-ce81-15d3-c506-201ce52355b0")
public static String es_PE_COLUMN_AD_Field_ID_Name="Campo";

@XendraColumn(AD_Element_ID="508ed669-ea64-b3be-bdd0-e5c386ae2fea",ColumnName="AD_Field_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="eb9e3a88-ce81-15d3-c506-201ce52355b0",
Synchronized="2019-08-30 22:20:48.0")
/** Column name AD_Field_ID */
public static final String COLUMNNAME_AD_Field_ID = "AD_Field_ID";
/** Set User defined Field.
@param AD_UserDef_Field_ID User defined Field */
public void setAD_UserDef_Field_ID (int AD_UserDef_Field_ID)
{
if (AD_UserDef_Field_ID < 1) throw new IllegalArgumentException ("AD_UserDef_Field_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_UserDef_Field_ID, Integer.valueOf(AD_UserDef_Field_ID));
}
/** Get User defined Field.
@return User defined Field */
public int getAD_UserDef_Field_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_UserDef_Field_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="6c314fc9-998a-94ed-8a07-f958b803adec")
public static String es_PE_FIELD_FieldCustomization_UserDefinedField_Name="Campo Definido por el Usuario";

@XendraField(AD_Column_ID="AD_UserDef_Field_ID",IsCentrallyMaintained=true,
AD_Tab_ID="1094eb37-ed37-5730-9b1c-6f542582b878",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6c314fc9-998a-94ed-8a07-f958b803adec")
public static final String FIELDNAME_FieldCustomization_UserDefinedField="6c314fc9-998a-94ed-8a07-f958b803adec";
/** Column name AD_UserDef_Field_ID */
public static final String COLUMNNAME_AD_UserDef_Field_ID = "AD_UserDef_Field_ID";
/** Set User defined Tab.
@param AD_UserDef_Tab_ID User defined Tab */
public void setAD_UserDef_Tab_ID (int AD_UserDef_Tab_ID)
{
if (AD_UserDef_Tab_ID < 1) throw new IllegalArgumentException ("AD_UserDef_Tab_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_UserDef_Tab_ID, Integer.valueOf(AD_UserDef_Tab_ID));
}
/** Get User defined Tab.
@return User defined Tab */
public int getAD_UserDef_Tab_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_UserDef_Tab_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="5cd1815b-2034-a6f7-3c6d-e56c256c3d4b")
public static String es_PE_FIELD_FieldCustomization_UserDefinedTab_Name="Pestaña Definida por el Usuario";

@XendraField(AD_Column_ID="AD_UserDef_Tab_ID",IsCentrallyMaintained=true,
AD_Tab_ID="1094eb37-ed37-5730-9b1c-6f542582b878",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5cd1815b-2034-a6f7-3c6d-e56c256c3d4b")
public static final String FIELDNAME_FieldCustomization_UserDefinedTab="5cd1815b-2034-a6f7-3c6d-e56c256c3d4b";

@XendraTrl(Identifier="9d7b2515-2110-393d-e6cc-a869e8f9d8cd")
public static String es_PE_COLUMN_AD_UserDef_Tab_ID_Name="Pestaña Definida por el Usuario";

@XendraColumn(AD_Element_ID="5e8f1b3f-a185-c0cf-d42e-ae2ee0b295a0",ColumnName="AD_UserDef_Tab_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9d7b2515-2110-393d-e6cc-a869e8f9d8cd",
Synchronized="2019-08-30 22:20:48.0")
/** Column name AD_UserDef_Tab_ID */
public static final String COLUMNNAME_AD_UserDef_Tab_ID = "AD_UserDef_Tab_ID";
/** Set Default Logic.
@param DefaultValue Default value hierarchy, separated by : */
public void setDefaultValue (String DefaultValue)
{
if (DefaultValue == null) throw new IllegalArgumentException ("DefaultValue is mandatory.");
if (DefaultValue.length() > 2000)
{
log.warning("Length > 2000 - truncated");
DefaultValue = DefaultValue.substring(0,1999);
}
set_Value (COLUMNNAME_DefaultValue, DefaultValue);
}
/** Get Default Logic.
@return Default value hierarchy, separated by : */
public String getDefaultValue() 
{
String value = (String)get_Value(COLUMNNAME_DefaultValue);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="d7815179-209d-c25f-d57a-47880f5d1483")
public static String es_PE_FIELD_FieldCustomization_DefaultLogic_Name="Lógica Predeterminada";

@XendraTrl(Identifier="d7815179-209d-c25f-d57a-47880f5d1483")
public static String es_PE_FIELD_FieldCustomization_DefaultLogic_Description="Jerarquía de valores predeterminados; separados por ;";

@XendraTrl(Identifier="d7815179-209d-c25f-d57a-47880f5d1483")
public static String es_PE_FIELD_FieldCustomization_DefaultLogic_Help="Los valores predeterminados son evaluados en el orden de la definición; el primer valor no nulo de la columna  llega a ser el valor predeterminado. Los valores son separados por coma ó punto y coma.";

@XendraField(AD_Column_ID="DefaultValue",IsCentrallyMaintained=true,
AD_Tab_ID="1094eb37-ed37-5730-9b1c-6f542582b878",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d7815179-209d-c25f-d57a-47880f5d1483")
public static final String FIELDNAME_FieldCustomization_DefaultLogic="d7815179-209d-c25f-d57a-47880f5d1483";

@XendraTrl(Identifier="dbd4299f-d805-5433-25df-6c7bbc5be6fe")
public static String es_PE_COLUMN_DefaultValue_Name="Lógica Predeterminada";

@XendraColumn(AD_Element_ID="85c6e06b-cd4c-c419-f8e4-9e93236b9219",ColumnName="DefaultValue",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="dbd4299f-d805-5433-25df-6c7bbc5be6fe",
Synchronized="2019-08-30 22:20:48.0")
/** Column name DefaultValue */
public static final String COLUMNNAME_DefaultValue = "DefaultValue";
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

@XendraTrl(Identifier="f1202d00-a3de-00b2-c0dd-78d31c234a58")
public static String es_PE_FIELD_FieldCustomization_Description_Name="Observación";

@XendraTrl(Identifier="f1202d00-a3de-00b2-c0dd-78d31c234a58")
public static String es_PE_FIELD_FieldCustomization_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="f1202d00-a3de-00b2-c0dd-78d31c234a58")
public static String es_PE_FIELD_FieldCustomization_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="1094eb37-ed37-5730-9b1c-6f542582b878",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f1202d00-a3de-00b2-c0dd-78d31c234a58")
public static final String FIELDNAME_FieldCustomization_Description="f1202d00-a3de-00b2-c0dd-78d31c234a58";

@XendraTrl(Identifier="24a7fae4-5e44-91fb-0507-0bf34e93b90e")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="24a7fae4-5e44-91fb-0507-0bf34e93b90e",
Synchronized="2019-08-30 22:20:48.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Display Length.
@param DisplayLength Length of the display in characters */
public void setDisplayLength (int DisplayLength)
{
set_Value (COLUMNNAME_DisplayLength, Integer.valueOf(DisplayLength));
}
/** Get Display Length.
@return Length of the display in characters */
public int getDisplayLength() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_DisplayLength);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="dbe701f0-8b3e-d23d-1722-c23a39bff571")
public static String es_PE_FIELD_FieldCustomization_DisplayLength_Name="Longitud del Despliegue";

@XendraTrl(Identifier="dbe701f0-8b3e-d23d-1722-c23a39bff571")
public static String es_PE_FIELD_FieldCustomization_DisplayLength_Description="Longitud del despliegue en caracteres";

@XendraTrl(Identifier="dbe701f0-8b3e-d23d-1722-c23a39bff571")
public static String es_PE_FIELD_FieldCustomization_DisplayLength_Help="La longitud de despliegue es principalmente para campos de cadena. La longitud no tiene impacto; si el tipo de datos del campo es - Entero; Número; Total (longitud determinada por el sistema) - Si No (Cuadro de Verificación) - Lista; Tabla; Dirección tabla (longitud de cuadros determinadas)";

@XendraField(AD_Column_ID="DisplayLength",IsCentrallyMaintained=true,
AD_Tab_ID="1094eb37-ed37-5730-9b1c-6f542582b878",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="dbe701f0-8b3e-d23d-1722-c23a39bff571")
public static final String FIELDNAME_FieldCustomization_DisplayLength="dbe701f0-8b3e-d23d-1722-c23a39bff571";

@XendraTrl(Identifier="aa9d2812-076e-7857-eb86-76ed88cd689c")
public static String es_PE_COLUMN_DisplayLength_Name="Longitud del Despliegue";

@XendraColumn(AD_Element_ID="dce6fb37-2aa2-ab65-ac11-c4ce9c6c5d0a",ColumnName="DisplayLength",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="aa9d2812-076e-7857-eb86-76ed88cd689c",
Synchronized="2019-08-30 22:20:48.0")
/** Column name DisplayLength */
public static final String COLUMNNAME_DisplayLength = "DisplayLength";
/** Set Display Logic.
@param DisplayLogic If the Field is displayed, the result determines if the field is actually displayed */
public void setDisplayLogic (String DisplayLogic)
{
if (DisplayLogic != null && DisplayLogic.length() > 2000)
{
log.warning("Length > 2000 - truncated");
DisplayLogic = DisplayLogic.substring(0,1999);
}
set_Value (COLUMNNAME_DisplayLogic, DisplayLogic);
}
/** Get Display Logic.
@return If the Field is displayed, the result determines if the field is actually displayed */
public String getDisplayLogic() 
{
String value = (String)get_Value(COLUMNNAME_DisplayLogic);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="e0af42f0-3328-e4f6-824c-5149e865d0cb")
public static String es_PE_FIELD_FieldCustomization_DisplayLogic_Name="Despliegue Lógico";

@XendraTrl(Identifier="e0af42f0-3328-e4f6-824c-5149e865d0cb")
public static String es_PE_FIELD_FieldCustomization_DisplayLogic_Description="Si el campo es desplegado; el resultado determina si el campo es efectivamente desplegado";

@XendraTrl(Identifier="e0af42f0-3328-e4f6-824c-5149e865d0cb")
public static String es_PE_FIELD_FieldCustomization_DisplayLogic_Help="formato:= <expresion> [<logica> <expresion>] expresion	:= @<contexto>@=<valor> o @<contexto>@!<valor> logica:= <|>|<&>contexto:= cualquier valor global ó de la ventana del contexto		:= secuencia a operadores de la logica:=  Y/O con el previo resultado de izquierda a derecha E";

@XendraField(AD_Column_ID="DisplayLogic",IsCentrallyMaintained=true,
AD_Tab_ID="1094eb37-ed37-5730-9b1c-6f542582b878",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e0af42f0-3328-e4f6-824c-5149e865d0cb")
public static final String FIELDNAME_FieldCustomization_DisplayLogic="e0af42f0-3328-e4f6-824c-5149e865d0cb";

@XendraTrl(Identifier="a9171035-9277-5f7b-c983-be4272ec20f3")
public static String es_PE_COLUMN_DisplayLogic_Name="Despliegue Lógico";

@XendraColumn(AD_Element_ID="fcb60996-c818-2f09-e6c4-b7544353cf56",ColumnName="DisplayLogic",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a9171035-9277-5f7b-c983-be4272ec20f3",
Synchronized="2019-08-30 22:20:48.0")
/** Column name DisplayLogic */
public static final String COLUMNNAME_DisplayLogic = "DisplayLogic";
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

@XendraTrl(Identifier="73021f79-3505-a408-647d-689cde75f9ab")
public static String es_PE_FIELD_FieldCustomization_CommentHelp_Name="Ayuda";

@XendraTrl(Identifier="73021f79-3505-a408-647d-689cde75f9ab")
public static String es_PE_FIELD_FieldCustomization_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="73021f79-3505-a408-647d-689cde75f9ab")
public static String es_PE_FIELD_FieldCustomization_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraField(AD_Column_ID="Help",IsCentrallyMaintained=true,
AD_Tab_ID="1094eb37-ed37-5730-9b1c-6f542582b878",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="73021f79-3505-a408-647d-689cde75f9ab")
public static final String FIELDNAME_FieldCustomization_CommentHelp="73021f79-3505-a408-647d-689cde75f9ab";

@XendraTrl(Identifier="a2c37f98-9f9c-21b0-4a63-e9a7e3da83dd")
public static String es_PE_COLUMN_Help_Name="Ayuda";

@XendraColumn(AD_Element_ID="a6fda582-56f9-6bb7-8436-285ce4f8de3f",ColumnName="Help",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a2c37f98-9f9c-21b0-4a63-e9a7e3da83dd",
Synchronized="2019-08-30 22:20:48.0")
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
@XendraTrl(Identifier="22113cab-cdd0-4219-a357-b1ae0520881d")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="22113cab-cdd0-4219-a357-b1ae0520881d",
Synchronized="2019-08-30 22:20:48.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Displayed.
@param IsDisplayed Determines, if this field is displayed */
public void setIsDisplayed (boolean IsDisplayed)
{
set_Value (COLUMNNAME_IsDisplayed, Boolean.valueOf(IsDisplayed));
}
/** Get Displayed.
@return Determines, if this field is displayed */
public boolean isDisplayed() 
{
Object oo = get_Value(COLUMNNAME_IsDisplayed);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="428c1854-fc04-1589-6d0c-e0cc1abdd771")
public static String es_PE_FIELD_FieldCustomization_Displayed_Name="Desplegado";

@XendraTrl(Identifier="428c1854-fc04-1589-6d0c-e0cc1abdd771")
public static String es_PE_FIELD_FieldCustomization_Displayed_Description="Determina; si este campo es desplegado";

@XendraTrl(Identifier="428c1854-fc04-1589-6d0c-e0cc1abdd771")
public static String es_PE_FIELD_FieldCustomization_Displayed_Help="Si el campo es desplegado; el campo lógica de despliegue determinará en tiempo de ejecución si es actualmente desplegado";

@XendraField(AD_Column_ID="IsDisplayed",IsCentrallyMaintained=true,
AD_Tab_ID="1094eb37-ed37-5730-9b1c-6f542582b878",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="428c1854-fc04-1589-6d0c-e0cc1abdd771")
public static final String FIELDNAME_FieldCustomization_Displayed="428c1854-fc04-1589-6d0c-e0cc1abdd771";

@XendraTrl(Identifier="9bafdd01-d346-a6be-1604-2ea6b67e8eb7")
public static String es_PE_COLUMN_IsDisplayed_Name="Desplegado";

@XendraColumn(AD_Element_ID="c1bfb876-0c16-8bbc-3714-fb5c9f0481b5",ColumnName="IsDisplayed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9bafdd01-d346-a6be-1604-2ea6b67e8eb7",
Synchronized="2019-08-30 22:20:48.0")
/** Column name IsDisplayed */
public static final String COLUMNNAME_IsDisplayed = "IsDisplayed";
/** Set Read Only.
@param IsReadOnly Field is read only */
public void setIsReadOnly (boolean IsReadOnly)
{
set_Value (COLUMNNAME_IsReadOnly, Boolean.valueOf(IsReadOnly));
}
/** Get Read Only.
@return Field is read only */
public boolean isReadOnly() 
{
Object oo = get_Value(COLUMNNAME_IsReadOnly);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="2fd4d80e-b4db-7d45-6e12-5db48f74d70d")
public static String es_PE_FIELD_FieldCustomization_ReadOnly_Name="Sólo Lectura";

@XendraTrl(Identifier="2fd4d80e-b4db-7d45-6e12-5db48f74d70d")
public static String es_PE_FIELD_FieldCustomization_ReadOnly_Description="El campo es de sólo lectura";

@XendraTrl(Identifier="2fd4d80e-b4db-7d45-6e12-5db48f74d70d")
public static String es_PE_FIELD_FieldCustomization_ReadOnly_Help="El sólo lectura indica que este campo solamente puede ser leído. No puede ser actualizado.";

@XendraField(AD_Column_ID="IsReadOnly",IsCentrallyMaintained=true,
AD_Tab_ID="1094eb37-ed37-5730-9b1c-6f542582b878",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2fd4d80e-b4db-7d45-6e12-5db48f74d70d")
public static final String FIELDNAME_FieldCustomization_ReadOnly="2fd4d80e-b4db-7d45-6e12-5db48f74d70d";

@XendraTrl(Identifier="7dbb657b-a006-76d5-68d3-ba8bcf88e8ed")
public static String es_PE_COLUMN_IsReadOnly_Name="Sólo Lectura";

@XendraColumn(AD_Element_ID="91b664da-9e5a-8ff7-2fef-8042ee7fb0c2",ColumnName="IsReadOnly",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7dbb657b-a006-76d5-68d3-ba8bcf88e8ed",
Synchronized="2019-08-30 22:20:48.0")
/** Column name IsReadOnly */
public static final String COLUMNNAME_IsReadOnly = "IsReadOnly";
/** Set Same Line.
@param IsSameLine Displayed on same line as previous field */
public void setIsSameLine (boolean IsSameLine)
{
set_Value (COLUMNNAME_IsSameLine, Boolean.valueOf(IsSameLine));
}
/** Get Same Line.
@return Displayed on same line as previous field */
public boolean isSameLine() 
{
Object oo = get_Value(COLUMNNAME_IsSameLine);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="70eabbae-1599-ae3f-0beb-84b1ee907dc8")
public static String es_PE_FIELD_FieldCustomization_SameLine_Name="Misma Línea";

@XendraTrl(Identifier="70eabbae-1599-ae3f-0beb-84b1ee907dc8")
public static String es_PE_FIELD_FieldCustomization_SameLine_Description="Desplegado en la misma línea que el campo previo";

@XendraTrl(Identifier="70eabbae-1599-ae3f-0beb-84b1ee907dc8")
public static String es_PE_FIELD_FieldCustomization_SameLine_Help="El cuadro de verificación misma línea indica que este campo se desplegará en la misma línea que el campo previo.";

@XendraField(AD_Column_ID="IsSameLine",IsCentrallyMaintained=true,
AD_Tab_ID="1094eb37-ed37-5730-9b1c-6f542582b878",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="70eabbae-1599-ae3f-0beb-84b1ee907dc8")
public static final String FIELDNAME_FieldCustomization_SameLine="70eabbae-1599-ae3f-0beb-84b1ee907dc8";

@XendraTrl(Identifier="db245c89-5caa-96b1-8454-23bf345e205c")
public static String es_PE_COLUMN_IsSameLine_Name="Misma Línea";

@XendraColumn(AD_Element_ID="855d68c0-e401-f8a8-00b1-ed4eeb2e6138",ColumnName="IsSameLine",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="db245c89-5caa-96b1-8454-23bf345e205c",
Synchronized="2019-08-30 22:20:48.0")
/** Column name IsSameLine */
public static final String COLUMNNAME_IsSameLine = "IsSameLine";
/** Set Updateable.
@param IsUpdateable Determines, if the field can be UPDATED */
public void setIsUpdateable (boolean IsUpdateable)
{
set_Value (COLUMNNAME_IsUpdateable, Boolean.valueOf(IsUpdateable));
}
/** Get Updateable.
@return Determines, if the field can be UPDATED */
public boolean isUpdateable() 
{
Object oo = get_Value(COLUMNNAME_IsUpdateable);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="94e87868-9b8a-ce28-d64a-a903edccc635")
public static String es_PE_FIELD_FieldCustomization_Updateable_Name="Actualizable";

@XendraTrl(Identifier="94e87868-9b8a-ce28-d64a-a903edccc635")
public static String es_PE_FIELD_FieldCustomization_Updateable_Description="Determina si el campo puede ser actualizado";

@XendraTrl(Identifier="94e87868-9b8a-ce28-d64a-a903edccc635")
public static String es_PE_FIELD_FieldCustomization_Updateable_Help="El Cuadro de Verificación Actualizable indica si este campo puede ser actualizado por el usuario";

@XendraField(AD_Column_ID="IsUpdateable",IsCentrallyMaintained=true,
AD_Tab_ID="1094eb37-ed37-5730-9b1c-6f542582b878",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="94e87868-9b8a-ce28-d64a-a903edccc635")
public static final String FIELDNAME_FieldCustomization_Updateable="94e87868-9b8a-ce28-d64a-a903edccc635";

@XendraTrl(Identifier="5eb7fbf9-2d39-9219-38ac-ae2fcb1de2ca")
public static String es_PE_COLUMN_IsUpdateable_Name="Actualizable";

@XendraColumn(AD_Element_ID="a793d4db-fec3-ab3c-10ca-23558b3015cb",ColumnName="IsUpdateable",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5eb7fbf9-2d39-9219-38ac-ae2fcb1de2ca",
Synchronized="2019-08-30 22:20:48.0")
/** Column name IsUpdateable */
public static final String COLUMNNAME_IsUpdateable = "IsUpdateable";
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

@XendraTrl(Identifier="11f8fa06-1cd4-1f0a-73bc-a218b29ca403")
public static String es_PE_FIELD_FieldCustomization_Name_Name="Nombre";

@XendraTrl(Identifier="11f8fa06-1cd4-1f0a-73bc-a218b29ca403")
public static String es_PE_FIELD_FieldCustomization_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="11f8fa06-1cd4-1f0a-73bc-a218b29ca403")
public static String es_PE_FIELD_FieldCustomization_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="1094eb37-ed37-5730-9b1c-6f542582b878",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="11f8fa06-1cd4-1f0a-73bc-a218b29ca403")
public static final String FIELDNAME_FieldCustomization_Name="11f8fa06-1cd4-1f0a-73bc-a218b29ca403";

@XendraTrl(Identifier="776049fe-52e7-0192-cac9-d85b2860ee97")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="776049fe-52e7-0192-cac9-d85b2860ee97",
Synchronized="2019-08-30 22:20:48.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Sequence.
@param SeqNo Method of ordering records: lowest number comes first */
public void setSeqNo (int SeqNo)
{
set_Value (COLUMNNAME_SeqNo, Integer.valueOf(SeqNo));
}
/** Get Sequence.
@return Method of ordering records: lowest number comes first */
public int getSeqNo() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_SeqNo);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="075fdc03-ab99-bd59-a295-e3b828fbd134")
public static String es_PE_FIELD_FieldCustomization_Sequence_Name="Secuencia";

@XendraTrl(Identifier="075fdc03-ab99-bd59-a295-e3b828fbd134")
public static String es_PE_FIELD_FieldCustomization_Sequence_Description="Método de ordenar registros; el número más bajo viene primero";

@XendraTrl(Identifier="075fdc03-ab99-bd59-a295-e3b828fbd134")
public static String es_PE_FIELD_FieldCustomization_Sequence_Help="La Secuencia indica el orden de los registros";

@XendraField(AD_Column_ID="SeqNo",IsCentrallyMaintained=true,
AD_Tab_ID="1094eb37-ed37-5730-9b1c-6f542582b878",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=140,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="075fdc03-ab99-bd59-a295-e3b828fbd134")
public static final String FIELDNAME_FieldCustomization_Sequence="075fdc03-ab99-bd59-a295-e3b828fbd134";

@XendraTrl(Identifier="779a3cb7-1025-50b2-fc06-15c1e56c14c5")
public static String es_PE_COLUMN_SeqNo_Name="Secuencia";

@XendraColumn(AD_Element_ID="38fa26fe-b59d-fce1-c129-420b57da738b",ColumnName="SeqNo",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="779a3cb7-1025-50b2-fc06-15c1e56c14c5",
Synchronized="2019-08-30 22:20:48.0")
/** Column name SeqNo */
public static final String COLUMNNAME_SeqNo = "SeqNo";
/** Set Record Sort No.
@param SortNo Determines in what order the records are displayed */
public void setSortNo (int SortNo)
{
set_Value (COLUMNNAME_SortNo, Integer.valueOf(SortNo));
}
/** Get Record Sort No.
@return Determines in what order the records are displayed */
public int getSortNo() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_SortNo);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="0786aefb-060f-6871-441c-67ce88ab42a9")
public static String es_PE_FIELD_FieldCustomization_RecordSortNo_Name="No. de Clasificación del Registro";

@XendraTrl(Identifier="0786aefb-060f-6871-441c-67ce88ab42a9")
public static String es_PE_FIELD_FieldCustomization_RecordSortNo_Description="Determina en que orden son desplegados los productos";

@XendraTrl(Identifier="0786aefb-060f-6871-441c-67ce88ab42a9")
public static String es_PE_FIELD_FieldCustomization_RecordSortNo_Help="El No. de clasificación del registro indica la secuencia de clasificación ascendente de los registros";

@XendraField(AD_Column_ID="SortNo",IsCentrallyMaintained=true,
AD_Tab_ID="1094eb37-ed37-5730-9b1c-6f542582b878",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0786aefb-060f-6871-441c-67ce88ab42a9")
public static final String FIELDNAME_FieldCustomization_RecordSortNo="0786aefb-060f-6871-441c-67ce88ab42a9";

@XendraTrl(Identifier="78056985-9ca2-28d2-f28e-f2f9de6730f5")
public static String es_PE_COLUMN_SortNo_Name="No. de Clasificación del Registro";

@XendraColumn(AD_Element_ID="929301a0-e5a0-7f21-9aa1-b7e9061fe6ed",ColumnName="SortNo",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="78056985-9ca2-28d2-f28e-f2f9de6730f5",
Synchronized="2019-08-30 22:20:48.0")
/** Column name SortNo */
public static final String COLUMNNAME_SortNo = "SortNo";
}
