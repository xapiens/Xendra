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
/** Generated Model for AD_Registration
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_Registration extends PO
{
/** Standard Constructor
@param ctx context
@param AD_Registration_ID id
@param trxName transaction
*/
public X_AD_Registration (Properties ctx, int AD_Registration_ID, String trxName)
{
super (ctx, AD_Registration_ID, trxName);
/** if (AD_Registration_ID == 0)
{
setAD_Registration_ID (0);	
// 0
setAD_System_ID (0);	
// 0
setIsAllowPublish (true);	
// Y
setIsAllowStatistics (true);	
// Y
setIsInProduction (false);	
// N
setIsRegistered (false);	
// N
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_Registration (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=625 */
public static int Table_ID=MTable.getTable_ID("AD_Registration");

@XendraTrl(Identifier="bc38aa77-b583-c358-155e-f69449114e02")
public static String es_PE_TAB_Registration_Description="Registro del sistema";

@XendraTrl(Identifier="bc38aa77-b583-c358-155e-f69449114e02")
public static String es_PE_TAB_Registration_Name="Registro";

@XendraTrl(Identifier="bc38aa77-b583-c358-155e-f69449114e02")
public static String es_PE_TAB_Registration_Help="Información del registro de sistema";

@XendraTab(Name="Registration",Description="System Registration",
Help="System Registration Information",AD_Window_ID="e8ba5751-e876-d951-2e5d-f037a2ab74f5",
SeqNo=10,TabLevel=0,IsSingleRow=true,IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="",HasTree=false,WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",
AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",
ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="bc38aa77-b583-c358-155e-f69449114e02",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Registration="bc38aa77-b583-c358-155e-f69449114e02";

@XendraTrl(Identifier="ce3600d5-40dd-7d4b-33db-8255241d4e8f")
public static String es_PE_TABLE_AD_Registration_Name="Registro";

@XendraTable(Name="System Registration",Description="System Registration",
Help="System Registration - Only one Record - Do not add additional records.",
TableName="AD_Registration",AccessLevel="4",AD_Window_ID="e8ba5751-e876-d951-2e5d-f037a2ab74f5",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.request",
Identifier="ce3600d5-40dd-7d4b-33db-8255241d4e8f",Synchronized="2017-08-16 11:40:56.0")
/** TableName=AD_Registration */
public static final String Table_Name="AD_Registration";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_Registration");

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
    Table_ID = MTable.getTable_ID("AD_Registration");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_Registration[").append(get_ID()).append("]");
return sb.toString();
}
/** Set System Registration.
@param AD_Registration_ID System Registration */
public void setAD_Registration_ID (int AD_Registration_ID)
{
if (AD_Registration_ID < 1) throw new IllegalArgumentException ("AD_Registration_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_Registration_ID, Integer.valueOf(AD_Registration_ID));
}
/** Get System Registration.
@return System Registration */
public int getAD_Registration_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Registration_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="42d2731d-ba97-ca29-b9f5-6deb916e809f")
public static String es_PE_FIELD_Registration_SystemRegistration_Description="Registro de sistema.";

@XendraTrl(Identifier="42d2731d-ba97-ca29-b9f5-6deb916e809f")
public static String es_PE_FIELD_Registration_SystemRegistration_Name="Registro";

@XendraField(AD_Column_ID="AD_Registration_ID",IsCentrallyMaintained=true,
AD_Tab_ID="bc38aa77-b583-c358-155e-f69449114e02",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="42d2731d-ba97-ca29-b9f5-6deb916e809f")
public static final String FIELDNAME_Registration_SystemRegistration="42d2731d-ba97-ca29-b9f5-6deb916e809f";
/** Column name AD_Registration_ID */
public static final String COLUMNNAME_AD_Registration_ID = "AD_Registration_ID";
/** Set System.
@param AD_System_ID System Definition */
public void setAD_System_ID (int AD_System_ID)
{
if (AD_System_ID < 1) throw new IllegalArgumentException ("AD_System_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_System_ID, Integer.valueOf(AD_System_ID));
}
/** Get System.
@return System Definition */
public int getAD_System_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_System_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="2bb51458-0ca3-7e0b-ffbb-359a6a2ea55c")
public static String es_PE_FIELD_Registration_System_Description="Definición del sistema";

@XendraTrl(Identifier="2bb51458-0ca3-7e0b-ffbb-359a6a2ea55c")
public static String es_PE_FIELD_Registration_System_Help="Definición del sistema común";

@XendraTrl(Identifier="2bb51458-0ca3-7e0b-ffbb-359a6a2ea55c")
public static String es_PE_FIELD_Registration_System_Name="Sistema";

@XendraField(AD_Column_ID="AD_System_ID",IsCentrallyMaintained=true,
AD_Tab_ID="bc38aa77-b583-c358-155e-f69449114e02",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2bb51458-0ca3-7e0b-ffbb-359a6a2ea55c")
public static final String FIELDNAME_Registration_System="2bb51458-0ca3-7e0b-ffbb-359a6a2ea55c";

@XendraTrl(Identifier="03d6f90f-3647-df48-b25e-50c2fe564282")
public static String es_PE_COLUMN_AD_System_ID_Name="Sistema";

@XendraColumn(AD_Element_ID="4308ba95-f891-8b07-4d0c-dd6fc9c41301",ColumnName="AD_System_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="03d6f90f-3647-df48-b25e-50c2fe564282",
Synchronized="2017-08-05 16:52:46.0")
/** Column name AD_System_ID */
public static final String COLUMNNAME_AD_System_ID = "AD_System_ID";
/** Set Currency.
@param C_Currency_ID The Currency for this record */
public void setC_Currency_ID (int C_Currency_ID)
{
if (C_Currency_ID <= 0) set_Value (COLUMNNAME_C_Currency_ID, null);
 else 
set_Value (COLUMNNAME_C_Currency_ID, Integer.valueOf(C_Currency_ID));
}
/** Get Currency.
@return The Currency for this record */
public int getC_Currency_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Currency_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f646a726-252b-6371-9d5d-71aac6a97bf9")
public static String es_PE_FIELD_Registration_Currency_Description="Moneda para este registro";

@XendraTrl(Identifier="f646a726-252b-6371-9d5d-71aac6a97bf9")
public static String es_PE_FIELD_Registration_Currency_Help="Indica la moneda a ser usada cuando se procese ó Informe este registro";

@XendraTrl(Identifier="f646a726-252b-6371-9d5d-71aac6a97bf9")
public static String es_PE_FIELD_Registration_Currency_Name="Moneda";

@XendraField(AD_Column_ID="C_Currency_ID",IsCentrallyMaintained=true,
AD_Tab_ID="bc38aa77-b583-c358-155e-f69449114e02",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f646a726-252b-6371-9d5d-71aac6a97bf9")
public static final String FIELDNAME_Registration_Currency="f646a726-252b-6371-9d5d-71aac6a97bf9";

@XendraTrl(Identifier="8ac8831c-a167-d017-cdf1-8a3b2c61e65f")
public static String es_PE_COLUMN_C_Currency_ID_Name="Moneda";

@XendraColumn(AD_Element_ID="8daec488-bca2-50fe-f9de-abf0cba2a34a",ColumnName="C_Currency_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8ac8831c-a167-d017-cdf1-8a3b2c61e65f",
Synchronized="2017-08-05 16:52:46.0")
/** Column name C_Currency_ID */
public static final String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
/** Set Address.
@param C_Location_ID Location or Address */
public void setC_Location_ID (int C_Location_ID)
{
if (C_Location_ID <= 0) set_Value (COLUMNNAME_C_Location_ID, null);
 else 
set_Value (COLUMNNAME_C_Location_ID, Integer.valueOf(C_Location_ID));
}
/** Get Address.
@return Location or Address */
public int getC_Location_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Location_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="0813a908-09a5-2350-0e49-eccb90620991")
public static String es_PE_FIELD_Registration_Address_Description="Ubicación ó dirección";

@XendraTrl(Identifier="0813a908-09a5-2350-0e49-eccb90620991")
public static String es_PE_FIELD_Registration_Address_Help="El campo Ubicación / Dirección define la ubicación de una entidad.";

@XendraTrl(Identifier="0813a908-09a5-2350-0e49-eccb90620991")
public static String es_PE_FIELD_Registration_Address_Name="Localización / Dirección";

@XendraField(AD_Column_ID="C_Location_ID",IsCentrallyMaintained=true,
AD_Tab_ID="bc38aa77-b583-c358-155e-f69449114e02",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0813a908-09a5-2350-0e49-eccb90620991")
public static final String FIELDNAME_Registration_Address="0813a908-09a5-2350-0e49-eccb90620991";

@XendraTrl(Identifier="0c6b5fd6-7b73-b065-89f8-a32ee6e6d59e")
public static String es_PE_COLUMN_C_Location_ID_Name="Localización / Dirección";

@XendraColumn(AD_Element_ID="e66e22a8-535b-2af2-6efb-aa600959a885",ColumnName="C_Location_ID",
AD_Reference_ID=21,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0c6b5fd6-7b73-b065-89f8-a32ee6e6d59e",
Synchronized="2017-08-05 16:52:46.0")
/** Column name C_Location_ID */
public static final String COLUMNNAME_C_Location_ID = "C_Location_ID";
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

@XendraTrl(Identifier="6f0a6f85-d4ec-bc7e-d503-5724e21ca408")
public static String es_PE_FIELD_Registration_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="6f0a6f85-d4ec-bc7e-d503-5724e21ca408")
public static String es_PE_FIELD_Registration_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="6f0a6f85-d4ec-bc7e-d503-5724e21ca408")
public static String es_PE_FIELD_Registration_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="bc38aa77-b583-c358-155e-f69449114e02",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6f0a6f85-d4ec-bc7e-d503-5724e21ca408")
public static final String FIELDNAME_Registration_Description="6f0a6f85-d4ec-bc7e-d503-5724e21ca408";

@XendraTrl(Identifier="4e1224c6-ecaa-cb0e-0f72-024beacdf8f1")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4e1224c6-ecaa-cb0e-0f72-024beacdf8f1",
Synchronized="2017-08-05 16:52:46.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
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
@XendraTrl(Identifier="233a3999-3503-497e-83e2-e283f99196f0")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="233a3999-3503-497e-83e2-e283f99196f0",
Synchronized="2017-08-05 16:52:46.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Industry Info.
@param IndustryInfo Information of the industry (e.g. professional service, distribution of furnitures, ..) */
public void setIndustryInfo (String IndustryInfo)
{
set_Value (COLUMNNAME_IndustryInfo, IndustryInfo);
}
/** Get Industry Info.
@return Information of the industry (e.g. professional service, distribution of furnitures, ..) */
public String getIndustryInfo() 
{
String value = (String)get_Value(COLUMNNAME_IndustryInfo);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="90733fe2-f233-685f-073d-3d0b3f6f45f7")
public static String es_PE_FIELD_Registration_IndustryInfo_Description="Información de la industria ej. (servicio profesional, distribución de muebles)";

@XendraTrl(Identifier="90733fe2-f233-685f-073d-3d0b3f6f45f7")
public static String es_PE_FIELD_Registration_IndustryInfo_Help="Descripción de el anuncio de la industria exacto como sea posible.";

@XendraTrl(Identifier="90733fe2-f233-685f-073d-3d0b3f6f45f7")
public static String es_PE_FIELD_Registration_IndustryInfo_Name="Información de la Industria";

@XendraField(AD_Column_ID="IndustryInfo",IsCentrallyMaintained=true,
AD_Tab_ID="bc38aa77-b583-c358-155e-f69449114e02",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="90733fe2-f233-685f-073d-3d0b3f6f45f7")
public static final String FIELDNAME_Registration_IndustryInfo="90733fe2-f233-685f-073d-3d0b3f6f45f7";

@XendraTrl(Identifier="477bb1a1-764f-94b1-d4a6-8afa75efe0b9")
public static String es_PE_COLUMN_IndustryInfo_Name="Información de la Industria";

@XendraColumn(AD_Element_ID="20a3b8a7-6a64-5909-3601-0fc88229044f",ColumnName="IndustryInfo",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="477bb1a1-764f-94b1-d4a6-8afa75efe0b9",
Synchronized="2017-08-05 16:52:46.0")
/** Column name IndustryInfo */
public static final String COLUMNNAME_IndustryInfo = "IndustryInfo";
/** Set Allowed to be Published.
@param IsAllowPublish You allow to publish the information, not just statistical summary info */
public void setIsAllowPublish (boolean IsAllowPublish)
{
set_Value (COLUMNNAME_IsAllowPublish, Boolean.valueOf(IsAllowPublish));
}
/** Get Allowed to be Published.
@return You allow to publish the information, not just statistical summary info */
public boolean isAllowPublish() 
{
Object oo = get_Value(COLUMNNAME_IsAllowPublish);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="70910380-d01c-a118-33f2-43071ec0b0fc")
public static String es_PE_FIELD_Registration_AllowedToBePublished_Description="Usted permite publicar la información, no resumen estadístico de Información.";

@XendraTrl(Identifier="70910380-d01c-a118-33f2-43071ec0b0fc")
public static String es_PE_FIELD_Registration_AllowedToBePublished_Name="Mostrar lo Publicado";

@XendraField(AD_Column_ID="IsAllowPublish",IsCentrallyMaintained=true,
AD_Tab_ID="bc38aa77-b583-c358-155e-f69449114e02",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="70910380-d01c-a118-33f2-43071ec0b0fc")
public static final String FIELDNAME_Registration_AllowedToBePublished="70910380-d01c-a118-33f2-43071ec0b0fc";

@XendraTrl(Identifier="9e92ab9e-1ebe-48f1-b3dd-eae249239953")
public static String es_PE_COLUMN_IsAllowPublish_Name="Mostrar lo Publicado";

@XendraColumn(AD_Element_ID="9431e926-fb2d-bc74-e2fb-a54ed9bd4fe1",ColumnName="IsAllowPublish",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9e92ab9e-1ebe-48f1-b3dd-eae249239953",
Synchronized="2017-08-05 16:52:46.0")
/** Column name IsAllowPublish */
public static final String COLUMNNAME_IsAllowPublish = "IsAllowPublish";
/** Set Maintain Statistics.
@param IsAllowStatistics Maintain general statistics */
public void setIsAllowStatistics (boolean IsAllowStatistics)
{
set_Value (COLUMNNAME_IsAllowStatistics, Boolean.valueOf(IsAllowStatistics));
}
/** Get Maintain Statistics.
@return Maintain general statistics */
public boolean isAllowStatistics() 
{
Object oo = get_Value(COLUMNNAME_IsAllowStatistics);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="7348f71b-3567-1032-ae3a-8a48958228ac")
public static String es_PE_FIELD_Registration_MaintainStatistics_Description="Permite transferir estadisticas generales (número de clientes, org, socios de negocio, usuarios, productos, facturas)";

@XendraTrl(Identifier="7348f71b-3567-1032-ae3a-8a48958228ac")
public static String es_PE_FIELD_Registration_MaintainStatistics_Help="Permite transferir estadisticas generales (número de clientes, org, socios de negocio, usuarios, productos, facturas) para conseguir una mejor sensación para el tamaño de aplicación. Esta información no se publica.";

@XendraTrl(Identifier="7348f71b-3567-1032-ae3a-8a48958228ac")
public static String es_PE_FIELD_Registration_MaintainStatistics_Name="Permite Estadística";

@XendraField(AD_Column_ID="IsAllowStatistics",IsCentrallyMaintained=true,
AD_Tab_ID="bc38aa77-b583-c358-155e-f69449114e02",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7348f71b-3567-1032-ae3a-8a48958228ac")
public static final String FIELDNAME_Registration_MaintainStatistics="7348f71b-3567-1032-ae3a-8a48958228ac";

@XendraTrl(Identifier="54657424-0cff-79d4-6286-d62974895e6a")
public static String es_PE_COLUMN_IsAllowStatistics_Name="Permite Estadística";

@XendraColumn(AD_Element_ID="ba839339-1212-bbcb-1234-578d7f545909",ColumnName="IsAllowStatistics",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="54657424-0cff-79d4-6286-d62974895e6a",
Synchronized="2017-08-05 16:52:46.0")
/** Column name IsAllowStatistics */
public static final String COLUMNNAME_IsAllowStatistics = "IsAllowStatistics";
/** Set In Production.
@param IsInProduction The system is in production */
public void setIsInProduction (boolean IsInProduction)
{
set_Value (COLUMNNAME_IsInProduction, Boolean.valueOf(IsInProduction));
}
/** Get In Production.
@return The system is in production */
public boolean isInProduction() 
{
Object oo = get_Value(COLUMNNAME_IsInProduction);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="e9cc8d05-1775-29b5-b2ae-15868899af9f")
public static String es_PE_FIELD_Registration_InProduction_Description="El Sistema está en producción";

@XendraTrl(Identifier="e9cc8d05-1775-29b5-b2ae-15868899af9f")
public static String es_PE_FIELD_Registration_InProduction_Name="En Producción";

@XendraField(AD_Column_ID="IsInProduction",IsCentrallyMaintained=true,
AD_Tab_ID="bc38aa77-b583-c358-155e-f69449114e02",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e9cc8d05-1775-29b5-b2ae-15868899af9f")
public static final String FIELDNAME_Registration_InProduction="e9cc8d05-1775-29b5-b2ae-15868899af9f";

@XendraTrl(Identifier="066acd50-37c7-b451-b13f-5677b7e3cd21")
public static String es_PE_COLUMN_IsInProduction_Name="En Producción";

@XendraColumn(AD_Element_ID="0d37a1a4-d555-6b82-cfa6-6be72f417aa6",ColumnName="IsInProduction",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="066acd50-37c7-b451-b13f-5677b7e3cd21",
Synchronized="2017-08-05 16:52:46.0")
/** Column name IsInProduction */
public static final String COLUMNNAME_IsInProduction = "IsInProduction";
/** Set Registered.
@param IsRegistered The application is registered. */
public void setIsRegistered (boolean IsRegistered)
{
set_ValueNoCheck (COLUMNNAME_IsRegistered, Boolean.valueOf(IsRegistered));
}
/** Get Registered.
@return The application is registered. */
public boolean isRegistered() 
{
Object oo = get_Value(COLUMNNAME_IsRegistered);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="6f5722a9-0ae9-729d-6d40-3c2740de921e")
public static String es_PE_FIELD_Registration_Registered_Description="La aplicación es registrada.";

@XendraTrl(Identifier="6f5722a9-0ae9-729d-6d40-3c2740de921e")
public static String es_PE_FIELD_Registration_Registered_Name="Registrado";

@XendraField(AD_Column_ID="IsRegistered",IsCentrallyMaintained=true,
AD_Tab_ID="bc38aa77-b583-c358-155e-f69449114e02",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=20,SortNo=1,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6f5722a9-0ae9-729d-6d40-3c2740de921e")
public static final String FIELDNAME_Registration_Registered="6f5722a9-0ae9-729d-6d40-3c2740de921e";

@XendraTrl(Identifier="8c411930-cf40-d3ba-923b-2d8ab81c3c3f")
public static String es_PE_COLUMN_IsRegistered_Name="Registrado";

@XendraColumn(AD_Element_ID="723a813c-2ec8-705a-a3d8-de4c5c70d97c",ColumnName="IsRegistered",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8c411930-cf40-d3ba-923b-2d8ab81c3c3f",
Synchronized="2017-08-05 16:52:46.0")
/** Column name IsRegistered */
public static final String COLUMNNAME_IsRegistered = "IsRegistered";
/** Set Employees.
@param NumberEmployees Number of employees */
public void setNumberEmployees (int NumberEmployees)
{
set_Value (COLUMNNAME_NumberEmployees, Integer.valueOf(NumberEmployees));
}
/** Get Employees.
@return Number of employees */
public int getNumberEmployees() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_NumberEmployees);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ce256276-3614-ef8b-062c-472967d41aae")
public static String es_PE_FIELD_Registration_Employees_Description="Número de empleados";

@XendraTrl(Identifier="ce256276-3614-ef8b-062c-472967d41aae")
public static String es_PE_FIELD_Registration_Employees_Help="Indica el número de empleados de este socio de negocio. Este campo se despliega solamente para prospectos.";

@XendraTrl(Identifier="ce256276-3614-ef8b-062c-472967d41aae")
public static String es_PE_FIELD_Registration_Employees_Name="Empleados";

@XendraField(AD_Column_ID="NumberEmployees",IsCentrallyMaintained=true,
AD_Tab_ID="bc38aa77-b583-c358-155e-f69449114e02",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ce256276-3614-ef8b-062c-472967d41aae")
public static final String FIELDNAME_Registration_Employees="ce256276-3614-ef8b-062c-472967d41aae";

@XendraTrl(Identifier="3bd5a90a-38fa-38b5-a81f-106ad6683496")
public static String es_PE_COLUMN_NumberEmployees_Name="Empleados";

@XendraColumn(AD_Element_ID="d506e9bf-a944-aa26-3eaa-004391d1b334",ColumnName="NumberEmployees",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3bd5a90a-38fa-38b5-a81f-106ad6683496",
Synchronized="2017-08-05 16:52:46.0")
/** Column name NumberEmployees */
public static final String COLUMNNAME_NumberEmployees = "NumberEmployees";
/** Set Platform Info.
@param PlatformInfo Information about Server and Client Platform */
public void setPlatformInfo (String PlatformInfo)
{
set_Value (COLUMNNAME_PlatformInfo, PlatformInfo);
}
/** Get Platform Info.
@return Information about Server and Client Platform */
public String getPlatformInfo() 
{
String value = (String)get_Value(COLUMNNAME_PlatformInfo);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="022c8d17-0420-2360-b792-b2ee06b3f63f")
public static String es_PE_FIELD_Registration_PlatformInfo_Description="Información sobre plataforma del servidor y del cliente.";

@XendraTrl(Identifier="022c8d17-0420-2360-b792-b2ee06b3f63f")
public static String es_PE_FIELD_Registration_PlatformInfo_Help="Incluye la información sobre el servidor, la red y (número de) clientes.";

@XendraTrl(Identifier="022c8d17-0420-2360-b792-b2ee06b3f63f")
public static String es_PE_FIELD_Registration_PlatformInfo_Name="Información Plataforma";

@XendraField(AD_Column_ID="PlatformInfo",IsCentrallyMaintained=true,
AD_Tab_ID="bc38aa77-b583-c358-155e-f69449114e02",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="022c8d17-0420-2360-b792-b2ee06b3f63f")
public static final String FIELDNAME_Registration_PlatformInfo="022c8d17-0420-2360-b792-b2ee06b3f63f";

@XendraTrl(Identifier="25afc449-75ef-a9d0-e0a3-61783bd7c4e6")
public static String es_PE_COLUMN_PlatformInfo_Name="Información Plataforma";

@XendraColumn(AD_Element_ID="fa90ddfa-9d60-e8f2-d665-63e0f9c70f5f",ColumnName="PlatformInfo",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,
DefaultValue="Server - Network [Operating System - RAM - Disk - CPUs] and (number of) Clients.",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="25afc449-75ef-a9d0-e0a3-61783bd7c4e6",
Synchronized="2017-08-05 16:52:46.0")
/** Column name PlatformInfo */
public static final String COLUMNNAME_PlatformInfo = "PlatformInfo";
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

@XendraTrl(Identifier="816a4df8-eff6-e733-6e0f-176b285412ed")
public static String es_PE_FIELD_Registration_ProcessNow_Description="Los registros nos ayudan a mejorar servicio de la base de usuario de Adempiere.";

@XendraTrl(Identifier="816a4df8-eff6-e733-6e0f-176b285412ed")
public static String es_PE_FIELD_Registration_ProcessNow_Help="No pondremos los datos a disposición de terceros ni utilizaremos la información para propósitos estadísticos.  Nos ayudará, si usted permitirá publicar su uso en Adempiere. Nos pondremos en contacto directamente antes de que publiquemos cualquier información.";

@XendraTrl(Identifier="816a4df8-eff6-e733-6e0f-176b285412ed")
public static String es_PE_FIELD_Registration_ProcessNow_Name="Registrarce Ahora!!!";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="bc38aa77-b583-c358-155e-f69449114e02",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="816a4df8-eff6-e733-6e0f-176b285412ed")
public static final String FIELDNAME_Registration_ProcessNow="816a4df8-eff6-e733-6e0f-176b285412ed";

@XendraTrl(Identifier="0a14f054-a477-f783-77bf-445f0096561f")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="a5b3b096-1c16-385b-112d-17e80be913a6",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="0a14f054-a477-f783-77bf-445f0096561f",Synchronized="2017-08-05 16:52:46.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
/** Set Record ID.
@param Record_ID Direct internal record ID */
public void setRecord_ID (int Record_ID)
{
if (Record_ID <= 0) set_ValueNoCheck (COLUMNNAME_Record_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_Record_ID, Integer.valueOf(Record_ID));
}
/** Get Record ID.
@return Direct internal record ID */
public int getRecord_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Record_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="8589f5d5-6fda-7f08-690d-5a740b4c977d")
public static String es_PE_FIELD_Registration_RecordID_Description="Identificador de registro interno";

@XendraTrl(Identifier="8589f5d5-6fda-7f08-690d-5a740b4c977d")
public static String es_PE_FIELD_Registration_RecordID_Help="La ID de registro es el identificador único interno de un registro.";

@XendraTrl(Identifier="8589f5d5-6fda-7f08-690d-5a740b4c977d")
public static String es_PE_FIELD_Registration_RecordID_Name="ID de Registro";

@XendraField(AD_Column_ID="Record_ID",IsCentrallyMaintained=true,
AD_Tab_ID="bc38aa77-b583-c358-155e-f69449114e02",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8589f5d5-6fda-7f08-690d-5a740b4c977d")
public static final String FIELDNAME_Registration_RecordID="8589f5d5-6fda-7f08-690d-5a740b4c977d";

@XendraTrl(Identifier="62359ad6-40c4-55f8-e429-0a2f8e750031")
public static String es_PE_COLUMN_Record_ID_Name="ID de Registro";

@XendraColumn(AD_Element_ID="86e36e4b-d1dc-2deb-449d-c1f6769e1603",ColumnName="Record_ID",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="62359ad6-40c4-55f8-e429-0a2f8e750031",
Synchronized="2017-08-05 16:52:46.0")
/** Column name Record_ID */
public static final String COLUMNNAME_Record_ID = "Record_ID";
/** Set Remote Addr.
@param Remote_Addr Remote Address */
public void setRemote_Addr (String Remote_Addr)
{
if (Remote_Addr != null && Remote_Addr.length() > 60)
{
log.warning("Length > 60 - truncated");
Remote_Addr = Remote_Addr.substring(0,59);
}
set_ValueNoCheck (COLUMNNAME_Remote_Addr, Remote_Addr);
}
/** Get Remote Addr.
@return Remote Address */
public String getRemote_Addr() 
{
String value = (String)get_Value(COLUMNNAME_Remote_Addr);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="a5718d22-9e8a-b360-569d-732d4cdab6d3")
public static String es_PE_FIELD_Registration_RemoteAddr_Description="Dirección remota";

@XendraTrl(Identifier="a5718d22-9e8a-b360-569d-732d4cdab6d3")
public static String es_PE_FIELD_Registration_RemoteAddr_Help="La dirección remota indica una dirección alternativa ó externa";

@XendraTrl(Identifier="a5718d22-9e8a-b360-569d-732d4cdab6d3")
public static String es_PE_FIELD_Registration_RemoteAddr_Name="Dirección Remota";

@XendraField(AD_Column_ID="Remote_Addr",IsCentrallyMaintained=true,
AD_Tab_ID="bc38aa77-b583-c358-155e-f69449114e02",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a5718d22-9e8a-b360-569d-732d4cdab6d3")
public static final String FIELDNAME_Registration_RemoteAddr="a5718d22-9e8a-b360-569d-732d4cdab6d3";

@XendraTrl(Identifier="749afeff-8ef4-873a-82ab-ae5295bbd13a")
public static String es_PE_COLUMN_Remote_Addr_Name="Dirección Remota";

@XendraColumn(AD_Element_ID="b1551fd7-ca8d-4a87-8302-e41caf5553d6",ColumnName="Remote_Addr",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="749afeff-8ef4-873a-82ab-ae5295bbd13a",
Synchronized="2017-08-05 16:52:46.0")
/** Column name Remote_Addr */
public static final String COLUMNNAME_Remote_Addr = "Remote_Addr";
/** Set Remote Host.
@param Remote_Host Remote host Info */
public void setRemote_Host (String Remote_Host)
{
if (Remote_Host != null && Remote_Host.length() > 120)
{
log.warning("Length > 120 - truncated");
Remote_Host = Remote_Host.substring(0,119);
}
set_ValueNoCheck (COLUMNNAME_Remote_Host, Remote_Host);
}
/** Get Remote Host.
@return Remote host Info */
public String getRemote_Host() 
{
String value = (String)get_Value(COLUMNNAME_Remote_Host);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="8b8b19d1-6f41-d291-d69a-a43b03faff3e")
public static String es_PE_FIELD_Registration_RemoteHost_Name="Host Remoto";

@XendraField(AD_Column_ID="Remote_Host",IsCentrallyMaintained=true,
AD_Tab_ID="bc38aa77-b583-c358-155e-f69449114e02",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8b8b19d1-6f41-d291-d69a-a43b03faff3e")
public static final String FIELDNAME_Registration_RemoteHost="8b8b19d1-6f41-d291-d69a-a43b03faff3e";

@XendraTrl(Identifier="ff3020f6-52e3-e459-9ba0-9c310b918757")
public static String es_PE_COLUMN_Remote_Host_Name="Host Remoto";

@XendraColumn(AD_Element_ID="eb636ff7-fd5e-fa57-d640-f766bf4e52b2",ColumnName="Remote_Host",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=120,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ff3020f6-52e3-e459-9ba0-9c310b918757",
Synchronized="2017-08-05 16:52:46.0")
/** Column name Remote_Host */
public static final String COLUMNNAME_Remote_Host = "Remote_Host";
/** Set Sales Volume in 1.000.
@param SalesVolume Total Volume of Sales in Thousands of Currency */
public void setSalesVolume (int SalesVolume)
{
set_Value (COLUMNNAME_SalesVolume, Integer.valueOf(SalesVolume));
}
/** Get Sales Volume in 1.000.
@return Total Volume of Sales in Thousands of Currency */
public int getSalesVolume() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_SalesVolume);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="4aef5192-601a-90da-6d40-a35f6d04e889")
public static String es_PE_FIELD_Registration_SalesVolumeIn100_Description="Volúmen total de Ventas";

@XendraTrl(Identifier="4aef5192-601a-90da-6d40-a35f6d04e889")
public static String es_PE_FIELD_Registration_SalesVolumeIn100_Help="El Volúmen de ventas indica el volúmen total de ventas para un socio de negocio";

@XendraTrl(Identifier="4aef5192-601a-90da-6d40-a35f6d04e889")
public static String es_PE_FIELD_Registration_SalesVolumeIn100_Name="Volúmen de Ventas";

@XendraField(AD_Column_ID="SalesVolume",IsCentrallyMaintained=true,
AD_Tab_ID="bc38aa77-b583-c358-155e-f69449114e02",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4aef5192-601a-90da-6d40-a35f6d04e889")
public static final String FIELDNAME_Registration_SalesVolumeIn100="4aef5192-601a-90da-6d40-a35f6d04e889";

@XendraTrl(Identifier="219d2d10-d301-b460-24e6-a506af2a5d1d")
public static String es_PE_COLUMN_SalesVolume_Name="Volúmen de Ventas";

@XendraColumn(AD_Element_ID="c7ec37b9-64cd-ba29-2f5f-a3852581c2dd",ColumnName="SalesVolume",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="219d2d10-d301-b460-24e6-a506af2a5d1d",
Synchronized="2017-08-05 16:52:46.0")
/** Column name SalesVolume */
public static final String COLUMNNAME_SalesVolume = "SalesVolume";
/** Set Start Implementation/Production.
@param StartProductionDate The day you started the implementation (if implementing) - or production (went life) with Adempiere */
public void setStartProductionDate (Timestamp StartProductionDate)
{
set_Value (COLUMNNAME_StartProductionDate, StartProductionDate);
}
/** Get Start Implementation/Production.
@return The day you started the implementation (if implementing) - or production (went life) with Adempiere */
public Timestamp getStartProductionDate() 
{
return (Timestamp)get_Value(COLUMNNAME_StartProductionDate);
}

@XendraTrl(Identifier="0256b70a-945a-d6de-a06d-14b9e71acacb")
public static String es_PE_FIELD_Registration_StartImplementationProduction_Description="El día que comenzó la implementación ó producción (se pone en ejecución) en Adempiere.";

@XendraTrl(Identifier="0256b70a-945a-d6de-a06d-14b9e71acacb")
public static String es_PE_FIELD_Registration_StartImplementationProduction_Name="Inicia Implementación/Producción";

@XendraField(AD_Column_ID="StartProductionDate",IsCentrallyMaintained=true,
AD_Tab_ID="bc38aa77-b583-c358-155e-f69449114e02",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0256b70a-945a-d6de-a06d-14b9e71acacb")
public static final String FIELDNAME_Registration_StartImplementationProduction="0256b70a-945a-d6de-a06d-14b9e71acacb";

@XendraTrl(Identifier="21d3ec98-4e5e-98f9-091c-f4d3d75cb20a")
public static String es_PE_COLUMN_StartProductionDate_Name="Inicia Implementación/Producción";

@XendraColumn(AD_Element_ID="8539352b-f25e-cb3b-18d8-e089929bd051",
ColumnName="StartProductionDate",AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=7,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="21d3ec98-4e5e-98f9-091c-f4d3d75cb20a",Synchronized="2017-08-05 16:52:46.0")
/** Column name StartProductionDate */
public static final String COLUMNNAME_StartProductionDate = "StartProductionDate";
}
