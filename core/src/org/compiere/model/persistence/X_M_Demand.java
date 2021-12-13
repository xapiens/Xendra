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
/** Generated Model for M_Demand
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_Demand extends PO
{
/** Standard Constructor
@param ctx context
@param M_Demand_ID id
@param trxName transaction
*/
public X_M_Demand (Properties ctx, int M_Demand_ID, String trxName)
{
super (ctx, M_Demand_ID, trxName);
/** if (M_Demand_ID == 0)
{
setC_Calendar_ID (0);
setC_Year_ID (0);
setIsDefault (false);	
// N
setM_Demand_ID (0);
setName (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_M_Demand (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=723 */
public static int Table_ID=MTable.getTable_ID("M_Demand");

@XendraTrl(Identifier="fc07746b-303b-3dfe-64a1-7a15c98a60af")
public static String es_PE_TAB_Demand_Description="Demanda de material";

@XendraTrl(Identifier="fc07746b-303b-3dfe-64a1-7a15c98a60af")
public static String es_PE_TAB_Demand_Help="La demanda de material se puede basar en el pronóstico, demandas, órdenes abiertas.";

@XendraTrl(Identifier="fc07746b-303b-3dfe-64a1-7a15c98a60af")
public static String es_PE_TAB_Demand_Name="Solicitud";
@XendraTab(Name="Demand",
Description="Material Demand",
Help="Material Demand can be based on Forecast, Requisitions, Open Orders",
AD_Window_ID="6538f96e-bc28-b93f-fb99-b3302e2c3a01",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="fc07746b-303b-3dfe-64a1-7a15c98a60af",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Demand="fc07746b-303b-3dfe-64a1-7a15c98a60af";

@XendraTrl(Identifier="50011c3e-f491-6df0-400d-b636adf221ed")
public static String es_PE_TABLE_M_Demand_Name="Demanda";

@XendraTable(Name="Demand",AD_Package_ID="2809ac2d-7d43-20f8-05f0-a478f2e50204",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Material Demand",Help="",
TableName="M_Demand",AccessLevel="2",AD_Window_ID="6538f96e-bc28-b93f-fb99-b3302e2c3a01",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=135,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.material",
Identifier="50011c3e-f491-6df0-400d-b636adf221ed",Synchronized="2020-03-03 21:38:19.0")
/** TableName=M_Demand */
public static final String Table_Name="M_Demand";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_Demand");

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
    Table_ID = MTable.getTable_ID("M_Demand");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_Demand[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="902d431c-5e82-f00d-f7ba-1257a58abb75")
public static String es_PE_FIELD_Demand_Calendar_Name="Calendario";

@XendraTrl(Identifier="902d431c-5e82-f00d-f7ba-1257a58abb75")
public static String es_PE_FIELD_Demand_Calendar_Description="Nombre del Calendario Contable";

@XendraTrl(Identifier="902d431c-5e82-f00d-f7ba-1257a58abb75")
public static String es_PE_FIELD_Demand_Calendar_Help="El calendario únicamente identifica un calendario contable. Múltiples calendarios pueden ser usados. Ej. Ud. puede necesitar un calendario estándar que corre del 1 de enero al 31 de diciembre y un calendario fiscal que corre del 1 de julio al 30 de junio.";

@XendraField(AD_Column_ID="C_Calendar_ID",IsCentrallyMaintained=true,
AD_Tab_ID="fc07746b-303b-3dfe-64a1-7a15c98a60af",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="902d431c-5e82-f00d-f7ba-1257a58abb75")
public static final String FIELDNAME_Demand_Calendar="902d431c-5e82-f00d-f7ba-1257a58abb75";

@XendraTrl(Identifier="5f336a7b-fb67-e7ef-3dd2-4d9a00110d6a")
public static String es_PE_COLUMN_C_Calendar_ID_Name="Calendario";

@XendraColumn(AD_Element_ID="f78f20f5-74d2-53fd-4e80-4df19abaa806",ColumnName="C_Calendar_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5f336a7b-fb67-e7ef-3dd2-4d9a00110d6a",
Synchronized="2019-08-30 22:23:01.0")
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

@XendraTrl(Identifier="c6dcbc65-8262-8d3d-2f19-7c838a1727d4")
public static String es_PE_FIELD_Demand_Year_Name="Año";

@XendraTrl(Identifier="c6dcbc65-8262-8d3d-2f19-7c838a1727d4")
public static String es_PE_FIELD_Demand_Year_Description="Año del calendario";

@XendraTrl(Identifier="c6dcbc65-8262-8d3d-2f19-7c838a1727d4")
public static String es_PE_FIELD_Demand_Year_Help="El Año identifica únicamente un año contable para un calendario";

@XendraField(AD_Column_ID="C_Year_ID",IsCentrallyMaintained=true,
AD_Tab_ID="fc07746b-303b-3dfe-64a1-7a15c98a60af",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c6dcbc65-8262-8d3d-2f19-7c838a1727d4")
public static final String FIELDNAME_Demand_Year="c6dcbc65-8262-8d3d-2f19-7c838a1727d4";

@XendraTrl(Identifier="f223835b-7244-b6b3-9c62-4bd1d24931b8")
public static String es_PE_COLUMN_C_Year_ID_Name="Año";

@XendraColumn(AD_Element_ID="c7021f96-c6b3-e088-ab83-e25c3e111170",ColumnName="C_Year_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="30a559a5-b676-32d1-61bf-2d3c267cfbd1",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="f223835b-7244-b6b3-9c62-4bd1d24931b8",Synchronized="2019-08-30 22:23:01.0")
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

@XendraTrl(Identifier="e9e10c74-7a33-00d3-1985-972d302b0d11")
public static String es_PE_FIELD_Demand_Description_Name="Observación";

@XendraTrl(Identifier="e9e10c74-7a33-00d3-1985-972d302b0d11")
public static String es_PE_FIELD_Demand_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="e9e10c74-7a33-00d3-1985-972d302b0d11")
public static String es_PE_FIELD_Demand_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="fc07746b-303b-3dfe-64a1-7a15c98a60af",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e9e10c74-7a33-00d3-1985-972d302b0d11")
public static final String FIELDNAME_Demand_Description="e9e10c74-7a33-00d3-1985-972d302b0d11";

@XendraTrl(Identifier="6f5d1ba8-1842-8f40-7ced-6e6c09665e31")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6f5d1ba8-1842-8f40-7ced-6e6c09665e31",
Synchronized="2019-08-30 22:23:01.0")
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

@XendraTrl(Identifier="fd2c27d7-439d-e135-54a7-ddeda48b38fa")
public static String es_PE_FIELD_Demand_CommentHelp_Name="Ayuda";

@XendraTrl(Identifier="fd2c27d7-439d-e135-54a7-ddeda48b38fa")
public static String es_PE_FIELD_Demand_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="fd2c27d7-439d-e135-54a7-ddeda48b38fa")
public static String es_PE_FIELD_Demand_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraField(AD_Column_ID="Help",IsCentrallyMaintained=true,
AD_Tab_ID="fc07746b-303b-3dfe-64a1-7a15c98a60af",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fd2c27d7-439d-e135-54a7-ddeda48b38fa")
public static final String FIELDNAME_Demand_CommentHelp="fd2c27d7-439d-e135-54a7-ddeda48b38fa";

@XendraTrl(Identifier="d14319dc-73ca-875a-785c-6c497a44ee3f")
public static String es_PE_COLUMN_Help_Name="Ayuda";

@XendraColumn(AD_Element_ID="a6fda582-56f9-6bb7-8436-285ce4f8de3f",ColumnName="Help",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d14319dc-73ca-875a-785c-6c497a44ee3f",
Synchronized="2019-08-30 22:23:01.0")
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
@XendraTrl(Identifier="cc28087c-1bf6-4ac6-8504-4e685cfacdfd")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cc28087c-1bf6-4ac6-8504-4e685cfacdfd",
Synchronized="2019-08-30 22:23:01.0")
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

@XendraTrl(Identifier="65f943c3-9800-af6c-fbfe-817d9aba4b9d")
public static String es_PE_FIELD_Demand_Default_Name="Predeterminado";

@XendraTrl(Identifier="65f943c3-9800-af6c-fbfe-817d9aba4b9d")
public static String es_PE_FIELD_Demand_Default_Description="Valor Predeterminado";

@XendraTrl(Identifier="65f943c3-9800-af6c-fbfe-817d9aba4b9d")
public static String es_PE_FIELD_Demand_Default_Help="El cuadro de verificación indica si este registro será usado como un valor predeterminado";

@XendraField(AD_Column_ID="IsDefault",IsCentrallyMaintained=true,
AD_Tab_ID="fc07746b-303b-3dfe-64a1-7a15c98a60af",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="65f943c3-9800-af6c-fbfe-817d9aba4b9d")
public static final String FIELDNAME_Demand_Default="65f943c3-9800-af6c-fbfe-817d9aba4b9d";

@XendraTrl(Identifier="8ae2083c-8e66-887f-6c03-94b28239bbd1")
public static String es_PE_COLUMN_IsDefault_Name="Predeterminado";

@XendraColumn(AD_Element_ID="8617f892-e113-a5fd-8715-687f792f136c",ColumnName="IsDefault",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8ae2083c-8e66-887f-6c03-94b28239bbd1",
Synchronized="2019-08-30 22:23:01.0")
/** Column name IsDefault */
public static final String COLUMNNAME_IsDefault = "IsDefault";
/** Set Demand.
@param M_Demand_ID Material Demand */
public void setM_Demand_ID (int M_Demand_ID)
{
if (M_Demand_ID < 1) throw new IllegalArgumentException ("M_Demand_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_Demand_ID, Integer.valueOf(M_Demand_ID));
}
/** Get Demand.
@return Material Demand */
public int getM_Demand_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Demand_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="c8d4a3da-ca10-e7a4-ac65-897d3d62e013")
public static String es_PE_FIELD_Demand_Demand_Name="Demanda";

@XendraTrl(Identifier="c8d4a3da-ca10-e7a4-ac65-897d3d62e013")
public static String es_PE_FIELD_Demand_Demand_Description="Demanda material";

@XendraTrl(Identifier="c8d4a3da-ca10-e7a4-ac65-897d3d62e013")
public static String es_PE_FIELD_Demand_Demand_Help="La demanda material se puede basar en el pronóstico, demandas, órdenes abiertas.";

@XendraField(AD_Column_ID="M_Demand_ID",IsCentrallyMaintained=true,
AD_Tab_ID="fc07746b-303b-3dfe-64a1-7a15c98a60af",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c8d4a3da-ca10-e7a4-ac65-897d3d62e013")
public static final String FIELDNAME_Demand_Demand="c8d4a3da-ca10-e7a4-ac65-897d3d62e013";
/** Column name M_Demand_ID */
public static final String COLUMNNAME_M_Demand_ID = "M_Demand_ID";
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

@XendraTrl(Identifier="243d0edd-6a5c-d3bb-a40c-5eb4c300415e")
public static String es_PE_FIELD_Demand_Name_Name="Nombre";

@XendraTrl(Identifier="243d0edd-6a5c-d3bb-a40c-5eb4c300415e")
public static String es_PE_FIELD_Demand_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="243d0edd-6a5c-d3bb-a40c-5eb4c300415e")
public static String es_PE_FIELD_Demand_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="fc07746b-303b-3dfe-64a1-7a15c98a60af",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="243d0edd-6a5c-d3bb-a40c-5eb4c300415e")
public static final String FIELDNAME_Demand_Name="243d0edd-6a5c-d3bb-a40c-5eb4c300415e";

@XendraTrl(Identifier="beb4ff17-07c4-a1be-943d-55f1dd1af96b")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="beb4ff17-07c4-a1be-943d-55f1dd1af96b",
Synchronized="2019-08-30 22:23:01.0")
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

@XendraTrl(Identifier="d0ddf489-339b-62f7-4c30-988dc67ec3f6")
public static String es_PE_FIELD_Demand_ProcessNow_Name="Procesar Ahora";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="fc07746b-303b-3dfe-64a1-7a15c98a60af",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d0ddf489-339b-62f7-4c30-988dc67ec3f6")
public static final String FIELDNAME_Demand_ProcessNow="d0ddf489-339b-62f7-4c30-988dc67ec3f6";

@XendraTrl(Identifier="307140b1-5233-acc6-0333-8db3dfec3c70")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="307140b1-5233-acc6-0333-8db3dfec3c70",
Synchronized="2019-08-30 22:23:01.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
}
