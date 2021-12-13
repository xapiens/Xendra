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
/** Generated Model for C_BP_Group
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_BP_Group extends PO
{
/** Standard Constructor
@param ctx context
@param C_BP_Group_ID id
@param trxName transaction
*/
public X_C_BP_Group (Properties ctx, int C_BP_Group_ID, String trxName)
{
super (ctx, C_BP_Group_ID, trxName);
/** if (C_BP_Group_ID == 0)
{
setC_BP_Group_ID (0);
setIsConfidentialInfo (false);	
// N
setIsDefault (false);	
// N
setIsForeigner (false);
setName (null);
setValue (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_BP_Group (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=394 */
public static int Table_ID=MTable.getTable_ID("C_BP_Group");

@XendraTrl(Identifier="e371c975-39c1-9242-a283-86119ee2ce92")
public static String es_PE_TAB_BusinessPartnerGroup_Description="Grupos de socios de negocio para predeterminados de Informes de contabilidad";

@XendraTrl(Identifier="e371c975-39c1-9242-a283-86119ee2ce92")
public static String es_PE_TAB_BusinessPartnerGroup_Help="La pestaña grupo de socios de negocio permite el agrupamiento de socios de negocio para que compartan valores predeterminados en Informes y contabilidad.";

@XendraTrl(Identifier="e371c975-39c1-9242-a283-86119ee2ce92")
public static String es_PE_TAB_BusinessPartnerGroup_Name="Grupo de Socio de Negocio";

@XendraTab(Name="Business Partner Group",
Description="Business Partner Groups for Reporting Accounting Defaults",
Help="The Business Partner Group Tab allow for the association of business partners for reporting and accounting defaults.",
AD_Window_ID="96da4345-d601-5a94-1f7c-420540a4b3c4",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="e371c975-39c1-9242-a283-86119ee2ce92",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_BusinessPartnerGroup="e371c975-39c1-9242-a283-86119ee2ce92";

@XendraTrl(Identifier="6650ab74-a5ed-90b2-259b-a8d0a08e818a")
public static String es_PE_TABLE_C_BP_Group_Name="Grupo de Socio de Negocio";

@XendraTable(Name="Business Partner Group",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Business Partner Group",Help="",
TableName="C_BP_Group",AccessLevel="3",AD_Window_ID="96da4345-d601-5a94-1f7c-420540a4b3c4",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=65,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="6650ab74-a5ed-90b2-259b-a8d0a08e818a",Synchronized="2020-03-03 21:36:38.0")
/** TableName=C_BP_Group */
public static final String Table_Name="C_BP_Group";


@XendraIndex(Name="c_bp_group_value",Identifier="2f7646c3-36df-2930-35cd-da5a2652be39",
Column_Names="ad_client_id, value",IsUnique="true",
TableIdentifier="2f7646c3-36df-2930-35cd-da5a2652be39",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_c_bp_group_value = "2f7646c3-36df-2930-35cd-da5a2652be39";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_BP_Group");

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
    Table_ID = MTable.getTable_ID("C_BP_Group");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_BP_Group[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Print Color.
@param AD_PrintColor_ID Color used for printing and display */
public void setAD_PrintColor_ID (int AD_PrintColor_ID)
{
if (AD_PrintColor_ID <= 0) set_Value (COLUMNNAME_AD_PrintColor_ID, null);
 else 
set_Value (COLUMNNAME_AD_PrintColor_ID, Integer.valueOf(AD_PrintColor_ID));
}
/** Get Print Color.
@return Color used for printing and display */
public int getAD_PrintColor_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_PrintColor_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="9507816f-24a7-326b-6b79-c47d8208e190")
public static String es_PE_FIELD_BusinessPartnerGroup_PrintColor_Name="Impresión a Color";

@XendraTrl(Identifier="9507816f-24a7-326b-6b79-c47d8208e190")
public static String es_PE_FIELD_BusinessPartnerGroup_PrintColor_Description="Color usado para imprimir";

@XendraTrl(Identifier="9507816f-24a7-326b-6b79-c47d8208e190")
public static String es_PE_FIELD_BusinessPartnerGroup_PrintColor_Help="Color usado para imprimir";

@XendraField(AD_Column_ID="AD_PrintColor_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e371c975-39c1-9242-a283-86119ee2ce92",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9507816f-24a7-326b-6b79-c47d8208e190")
public static final String FIELDNAME_BusinessPartnerGroup_PrintColor="9507816f-24a7-326b-6b79-c47d8208e190";

@XendraTrl(Identifier="03297b4a-4ced-9d3f-de96-e21578640e3d")
public static String es_PE_COLUMN_AD_PrintColor_ID_Name="Impresión a Color";

@XendraColumn(AD_Element_ID="fa351bf7-0efd-2c6a-da0b-f514d630b8e6",ColumnName="AD_PrintColor_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="03297b4a-4ced-9d3f-de96-e21578640e3d",
Synchronized="2019-08-30 22:21:15.0")
/** Column name AD_PrintColor_ID */
public static final String COLUMNNAME_AD_PrintColor_ID = "AD_PrintColor_ID";
/** Set Business Partner Group.
@param C_BP_Group_ID Business Partner Group */
public void setC_BP_Group_ID (int C_BP_Group_ID)
{
if (C_BP_Group_ID < 1) throw new IllegalArgumentException ("C_BP_Group_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_BP_Group_ID, Integer.valueOf(C_BP_Group_ID));
}
/** Get Business Partner Group.
@return Business Partner Group */
public int getC_BP_Group_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BP_Group_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="a44a8062-0cb1-4f5b-f473-7e358fd10e0a")
public static String es_PE_FIELD_BusinessPartnerGroup_BusinessPartnerGroup_Name="Grupo de Socio de Negocio";

@XendraTrl(Identifier="a44a8062-0cb1-4f5b-f473-7e358fd10e0a")
public static String es_PE_FIELD_BusinessPartnerGroup_BusinessPartnerGroup_Description="ID del Grupo de Socio de Negocio";

@XendraTrl(Identifier="a44a8062-0cb1-4f5b-f473-7e358fd10e0a")
public static String es_PE_FIELD_BusinessPartnerGroup_BusinessPartnerGroup_Help="La ID Grupo del Socio de Negocio proporciona un método de definir valores predeterminados a ser usados para Socios de Negocio individuales.";

@XendraField(AD_Column_ID="C_BP_Group_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e371c975-39c1-9242-a283-86119ee2ce92",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a44a8062-0cb1-4f5b-f473-7e358fd10e0a")
public static final String FIELDNAME_BusinessPartnerGroup_BusinessPartnerGroup="a44a8062-0cb1-4f5b-f473-7e358fd10e0a";
/** Column name C_BP_Group_ID */
public static final String COLUMNNAME_C_BP_Group_ID = "C_BP_Group_ID";
/** Set Dunning.
@param C_Dunning_ID Dunning Rules for overdue invoices */
public void setC_Dunning_ID (int C_Dunning_ID)
{
if (C_Dunning_ID <= 0) set_Value (COLUMNNAME_C_Dunning_ID, null);
 else 
set_Value (COLUMNNAME_C_Dunning_ID, Integer.valueOf(C_Dunning_ID));
}
/** Get Dunning.
@return Dunning Rules for overdue invoices */
public int getC_Dunning_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Dunning_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="7fc0f31b-9c2c-f092-59d9-19a0c2c6f32f")
public static String es_PE_FIELD_BusinessPartnerGroup_Dunning_Name="Morosidad";

@XendraTrl(Identifier="7fc0f31b-9c2c-f092-59d9-19a0c2c6f32f")
public static String es_PE_FIELD_BusinessPartnerGroup_Dunning_Description="Reglas de morosidad para facturas vencidas";

@XendraTrl(Identifier="7fc0f31b-9c2c-f092-59d9-19a0c2c6f32f")
public static String es_PE_FIELD_BusinessPartnerGroup_Dunning_Help="La Morosidad indica las reglas y métodos de cálculo de morosidad para pagos vencidos";

@XendraField(AD_Column_ID="C_Dunning_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e371c975-39c1-9242-a283-86119ee2ce92",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7fc0f31b-9c2c-f092-59d9-19a0c2c6f32f")
public static final String FIELDNAME_BusinessPartnerGroup_Dunning="7fc0f31b-9c2c-f092-59d9-19a0c2c6f32f";

@XendraTrl(Identifier="c9bc8cff-b55f-51f9-a0fe-e26c093446ff")
public static String es_PE_COLUMN_C_Dunning_ID_Name="Morosidad";

@XendraColumn(AD_Element_ID="1ecce40a-5c50-54d9-2d4b-12d7fbab21a8",ColumnName="C_Dunning_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c9bc8cff-b55f-51f9-a0fe-e26c093446ff",
Synchronized="2019-08-30 22:21:15.0")
/** Column name C_Dunning_ID */
public static final String COLUMNNAME_C_Dunning_ID = "C_Dunning_ID";
/** Set Credit Watch %.
@param CreditWatchPercent Credit Watch - Percent of Credit Limit when OK switches to Watch */
public void setCreditWatchPercent (BigDecimal CreditWatchPercent)
{
set_Value (COLUMNNAME_CreditWatchPercent, CreditWatchPercent);
}
/** Get Credit Watch %.
@return Credit Watch - Percent of Credit Limit when OK switches to Watch */
public BigDecimal getCreditWatchPercent() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CreditWatchPercent);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="1a8f641f-f316-5cae-178e-48130f1fb6cb")
public static String es_PE_FIELD_BusinessPartnerGroup_CreditWatch_Name="% de Crédito en Verificación Cliente";

@XendraTrl(Identifier="1a8f641f-f316-5cae-178e-48130f1fb6cb")
public static String es_PE_FIELD_BusinessPartnerGroup_CreditWatch_Description="Crédito en Verificación - Porcentaje de Límite de Crédito cuando Correcto cambia a Verificación";

@XendraTrl(Identifier="1a8f641f-f316-5cae-178e-48130f1fb6cb")
public static String es_PE_FIELD_BusinessPartnerGroup_CreditWatch_Help="Si Adempiere mantiene el estado de crédito, el estado \"Credito Correcto\" es movido a \"Crédito en Verificación\"  empleando este valor como límite. De no definirlo, se empleará el 90%.";

@XendraField(AD_Column_ID="CreditWatchPercent",IsCentrallyMaintained=true,
AD_Tab_ID="e371c975-39c1-9242-a283-86119ee2ce92",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1a8f641f-f316-5cae-178e-48130f1fb6cb")
public static final String FIELDNAME_BusinessPartnerGroup_CreditWatch="1a8f641f-f316-5cae-178e-48130f1fb6cb";

@XendraTrl(Identifier="b643c19a-2ae7-2cfd-ae4c-5947d76881dc")
public static String es_PE_COLUMN_CreditWatchPercent_Name="% de Crédito en Verificación Cliente";

@XendraColumn(AD_Element_ID="4e600b47-b7f9-6df1-37c0-48c219c15de6",ColumnName="CreditWatchPercent",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="0",ValueMax="100",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b643c19a-2ae7-2cfd-ae4c-5947d76881dc",
Synchronized="2019-08-30 22:21:15.0")
/** Column name CreditWatchPercent */
public static final String COLUMNNAME_CreditWatchPercent = "CreditWatchPercent";
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

@XendraTrl(Identifier="21d8bad6-f135-8091-4f44-7993f301e206")
public static String es_PE_FIELD_BusinessPartnerGroup_Description_Name="Observación";

@XendraTrl(Identifier="21d8bad6-f135-8091-4f44-7993f301e206")
public static String es_PE_FIELD_BusinessPartnerGroup_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="21d8bad6-f135-8091-4f44-7993f301e206")
public static String es_PE_FIELD_BusinessPartnerGroup_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="e371c975-39c1-9242-a283-86119ee2ce92",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="21d8bad6-f135-8091-4f44-7993f301e206")
public static final String FIELDNAME_BusinessPartnerGroup_Description="21d8bad6-f135-8091-4f44-7993f301e206";

@XendraTrl(Identifier="c5930b19-2d6a-90dd-3840-c7ded7a9bd93")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c5930b19-2d6a-90dd-3840-c7ded7a9bd93",
Synchronized="2019-08-30 22:21:15.0")
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
@XendraTrl(Identifier="1f69a26d-94eb-438f-82c6-598dbd248ce3")
public static String es_PE_FIELD_BusinessPartnerGroup_Identifier_Name="Identifier";

@XendraField(AD_Column_ID="Identifier",IsCentrallyMaintained=true,
AD_Tab_ID="e371c975-39c1-9242-a283-86119ee2ce92",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=36,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2019-04-04 17:50:15.0",
Identifier="1f69a26d-94eb-438f-82c6-598dbd248ce3")
public static final String FIELDNAME_BusinessPartnerGroup_Identifier="1f69a26d-94eb-438f-82c6-598dbd248ce3";

@XendraTrl(Identifier="261f3972-42ce-4aa2-8736-e78b67ad8307")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="261f3972-42ce-4aa2-8736-e78b67ad8307",
Synchronized="2019-08-30 22:21:15.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Confidential Info.
@param IsConfidentialInfo Can enter confidential information */
public void setIsConfidentialInfo (boolean IsConfidentialInfo)
{
set_Value (COLUMNNAME_IsConfidentialInfo, Boolean.valueOf(IsConfidentialInfo));
}
/** Get Confidential Info.
@return Can enter confidential information */
public boolean isConfidentialInfo() 
{
Object oo = get_Value(COLUMNNAME_IsConfidentialInfo);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="e866bc86-8a64-3ca4-ade1-b7c7f00c2aa7")
public static String es_PE_FIELD_BusinessPartnerGroup_ConfidentialInfo_Name="Info Confidencial";

@XendraTrl(Identifier="e866bc86-8a64-3ca4-ade1-b7c7f00c2aa7")
public static String es_PE_FIELD_BusinessPartnerGroup_ConfidentialInfo_Description="Puede dar entrada a informacióm confidencial.";

@XendraTrl(Identifier="e866bc86-8a64-3ca4-ade1-b7c7f00c2aa7")
public static String es_PE_FIELD_BusinessPartnerGroup_ConfidentialInfo_Help="Cuando las peticiones entran/puesta al día sobre la Web, el usuario pueden marcar su Información como confidencial.";

@XendraField(AD_Column_ID="IsConfidentialInfo",IsCentrallyMaintained=true,
AD_Tab_ID="e371c975-39c1-9242-a283-86119ee2ce92",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e866bc86-8a64-3ca4-ade1-b7c7f00c2aa7")
public static final String FIELDNAME_BusinessPartnerGroup_ConfidentialInfo="e866bc86-8a64-3ca4-ade1-b7c7f00c2aa7";

@XendraTrl(Identifier="2b80a6f8-4035-2361-213e-c2b97195c74f")
public static String es_PE_COLUMN_IsConfidentialInfo_Name="Info Confidencial";

@XendraColumn(AD_Element_ID="928a5de1-a583-cf39-596c-aeb1e1d9aaca",ColumnName="IsConfidentialInfo",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2b80a6f8-4035-2361-213e-c2b97195c74f",
Synchronized="2019-08-30 22:21:15.0")
/** Column name IsConfidentialInfo */
public static final String COLUMNNAME_IsConfidentialInfo = "IsConfidentialInfo";
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

@XendraTrl(Identifier="54b09c24-5f4f-136a-2093-70538e7afa23")
public static String es_PE_FIELD_BusinessPartnerGroup_Default_Name="Predeterminado";

@XendraTrl(Identifier="54b09c24-5f4f-136a-2093-70538e7afa23")
public static String es_PE_FIELD_BusinessPartnerGroup_Default_Description="Valor Predeterminado";

@XendraTrl(Identifier="54b09c24-5f4f-136a-2093-70538e7afa23")
public static String es_PE_FIELD_BusinessPartnerGroup_Default_Help="El cuadro de verificación indica si este registro será usado como un valor predeterminado";

@XendraField(AD_Column_ID="IsDefault",IsCentrallyMaintained=true,
AD_Tab_ID="e371c975-39c1-9242-a283-86119ee2ce92",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="54b09c24-5f4f-136a-2093-70538e7afa23")
public static final String FIELDNAME_BusinessPartnerGroup_Default="54b09c24-5f4f-136a-2093-70538e7afa23";

@XendraTrl(Identifier="ca2ea123-5ecf-aa12-e6dd-f668c3f91a2f")
public static String es_PE_COLUMN_IsDefault_Name="Predeterminado";

@XendraColumn(AD_Element_ID="8617f892-e113-a5fd-8715-687f792f136c",ColumnName="IsDefault",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ca2ea123-5ecf-aa12-e6dd-f668c3f91a2f",
Synchronized="2019-08-30 22:21:15.0")
/** Column name IsDefault */
public static final String COLUMNNAME_IsDefault = "IsDefault";
/** Set IsForeigner.
@param IsForeigner IsForeigner */
public void setIsForeigner (boolean IsForeigner)
{
set_Value (COLUMNNAME_IsForeigner, Boolean.valueOf(IsForeigner));
}
/** Get IsForeigner.
@return IsForeigner */
public boolean isForeigner() 
{
Object oo = get_Value(COLUMNNAME_IsForeigner);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="fc8839a9-7ae3-4e63-9176-ec89925dce20")
public static String es_PE_FIELD_BusinessPartnerGroup_IsForeigner_Name="isforeigner";

@XendraField(AD_Column_ID="IsForeigner",IsCentrallyMaintained=true,
AD_Tab_ID="e371c975-39c1-9242-a283-86119ee2ce92",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2019-04-04 17:50:15.0",
Identifier="fc8839a9-7ae3-4e63-9176-ec89925dce20")
public static final String FIELDNAME_BusinessPartnerGroup_IsForeigner="fc8839a9-7ae3-4e63-9176-ec89925dce20";

@XendraTrl(Identifier="83709e19-00e8-43cf-8f47-f9c15f3839af")
public static String es_PE_COLUMN_IsForeigner_Name="isforeigner";

@XendraColumn(AD_Element_ID="2fb76002-af78-412e-8746-bbcc30d24f59",ColumnName="IsForeigner",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="83709e19-00e8-43cf-8f47-f9c15f3839af",
Synchronized="2019-08-30 22:21:15.0")
/** Column name IsForeigner */
public static final String COLUMNNAME_IsForeigner = "IsForeigner";
/** Set Discount Schema.
@param M_DiscountSchema_ID Schema to calculate the trade discount percentage */
public void setM_DiscountSchema_ID (int M_DiscountSchema_ID)
{
if (M_DiscountSchema_ID <= 0) set_Value (COLUMNNAME_M_DiscountSchema_ID, null);
 else 
set_Value (COLUMNNAME_M_DiscountSchema_ID, Integer.valueOf(M_DiscountSchema_ID));
}
/** Get Discount Schema.
@return Schema to calculate the trade discount percentage */
public int getM_DiscountSchema_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_DiscountSchema_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="3f390abc-fc34-d2db-c0c5-eb4578de156d")
public static String es_PE_FIELD_BusinessPartnerGroup_DiscountSchema_Name="Esq List Precios/Desc";

@XendraTrl(Identifier="3f390abc-fc34-d2db-c0c5-eb4578de156d")
public static String es_PE_FIELD_BusinessPartnerGroup_DiscountSchema_Description="Esquema para calcular el porcentaje de descuento comercial";

@XendraTrl(Identifier="3f390abc-fc34-d2db-c0c5-eb4578de156d")
public static String es_PE_FIELD_BusinessPartnerGroup_DiscountSchema_Help="Después del cálculo de precio (estándar); el porcentaje de descuento comercial es calculado y aplicado resultando en el precio final";

@XendraField(AD_Column_ID="M_DiscountSchema_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e371c975-39c1-9242-a283-86119ee2ce92",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3f390abc-fc34-d2db-c0c5-eb4578de156d")
public static final String FIELDNAME_BusinessPartnerGroup_DiscountSchema="3f390abc-fc34-d2db-c0c5-eb4578de156d";

@XendraTrl(Identifier="5c777515-0589-c4f3-51ca-281fbb4e9747")
public static String es_PE_COLUMN_M_DiscountSchema_ID_Name="Esq List Precios/Desc";

@XendraColumn(AD_Element_ID="e8a3b5bd-239d-8376-eae6-8e5ebcfbe6fa",
ColumnName="M_DiscountSchema_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="3a3974a6-65b9-c98d-24a9-e5218ed456cd",AD_Val_Rule_ID="",FieldLength=10,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="5c777515-0589-c4f3-51ca-281fbb4e9747",
Synchronized="2019-08-30 22:21:15.0")
/** Column name M_DiscountSchema_ID */
public static final String COLUMNNAME_M_DiscountSchema_ID = "M_DiscountSchema_ID";
/** Set M_PriceList_ID.
@param M_PriceList_ID Unique identifier of a Price List */
public void setM_PriceList_ID (int M_PriceList_ID)
{
if (M_PriceList_ID <= 0) set_Value (COLUMNNAME_M_PriceList_ID, null);
 else 
set_Value (COLUMNNAME_M_PriceList_ID, Integer.valueOf(M_PriceList_ID));
}
/** Get M_PriceList_ID.
@return Unique identifier of a Price List */
public int getM_PriceList_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_PriceList_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="5ba8bfd9-8276-f504-b99f-22d2308b2343")
public static String es_PE_FIELD_BusinessPartnerGroup_M_PriceList_ID_Name="Lista de Precios";

@XendraTrl(Identifier="5ba8bfd9-8276-f504-b99f-22d2308b2343")
public static String es_PE_FIELD_BusinessPartnerGroup_M_PriceList_ID_Description="Identificador único de mi lista de precios";

@XendraTrl(Identifier="5ba8bfd9-8276-f504-b99f-22d2308b2343")
public static String es_PE_FIELD_BusinessPartnerGroup_M_PriceList_ID_Help="Listas de precios son usadas para determinar el precio; margen y costo de artículos comprados ó vendidos.";

@XendraField(AD_Column_ID="M_PriceList_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e371c975-39c1-9242-a283-86119ee2ce92",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5ba8bfd9-8276-f504-b99f-22d2308b2343")
public static final String FIELDNAME_BusinessPartnerGroup_M_PriceList_ID="5ba8bfd9-8276-f504-b99f-22d2308b2343";

@XendraTrl(Identifier="13b7a01f-d32e-2028-730c-4386a96e8080")
public static String es_PE_COLUMN_M_PriceList_ID_Name="Lista de Precios";

@XendraColumn(AD_Element_ID="652afdd3-9ff1-082d-5831-6aad828e0e09",ColumnName="M_PriceList_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="13b7a01f-d32e-2028-730c-4386a96e8080",
Synchronized="2019-08-30 22:21:15.0")
/** Column name M_PriceList_ID */
public static final String COLUMNNAME_M_PriceList_ID = "M_PriceList_ID";
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

@XendraTrl(Identifier="18e0458d-eb43-805d-a0d0-0c84f62d4f38")
public static String es_PE_FIELD_BusinessPartnerGroup_Name_Name="Nombre";

@XendraTrl(Identifier="18e0458d-eb43-805d-a0d0-0c84f62d4f38")
public static String es_PE_FIELD_BusinessPartnerGroup_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="18e0458d-eb43-805d-a0d0-0c84f62d4f38")
public static String es_PE_FIELD_BusinessPartnerGroup_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="e371c975-39c1-9242-a283-86119ee2ce92",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="18e0458d-eb43-805d-a0d0-0c84f62d4f38")
public static final String FIELDNAME_BusinessPartnerGroup_Name="18e0458d-eb43-805d-a0d0-0c84f62d4f38";

@XendraTrl(Identifier="b67b26cf-a8da-acec-2eb1-ba5c43376dbe")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b67b26cf-a8da-acec-2eb1-ba5c43376dbe",
Synchronized="2019-08-30 22:21:15.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set PO Discount Schema.
@param PO_DiscountSchema_ID Schema to calculate the purchase trade discount percentage */
public void setPO_DiscountSchema_ID (int PO_DiscountSchema_ID)
{
if (PO_DiscountSchema_ID <= 0) set_Value (COLUMNNAME_PO_DiscountSchema_ID, null);
 else 
set_Value (COLUMNNAME_PO_DiscountSchema_ID, Integer.valueOf(PO_DiscountSchema_ID));
}
/** Get PO Discount Schema.
@return Schema to calculate the purchase trade discount percentage */
public int getPO_DiscountSchema_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_PO_DiscountSchema_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="8e6cbe5a-9d90-ad42-2dbe-0e9a04e6fd0b")
public static String es_PE_FIELD_BusinessPartnerGroup_PODiscountSchema_Name="Esquema Del Descuento en OC";

@XendraTrl(Identifier="8e6cbe5a-9d90-ad42-2dbe-0e9a04e6fd0b")
public static String es_PE_FIELD_BusinessPartnerGroup_PODiscountSchema_Description="Esquema para calcular el porcentaje de descuento comercial en compra";

@XendraField(AD_Column_ID="PO_DiscountSchema_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e371c975-39c1-9242-a283-86119ee2ce92",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8e6cbe5a-9d90-ad42-2dbe-0e9a04e6fd0b")
public static final String FIELDNAME_BusinessPartnerGroup_PODiscountSchema="8e6cbe5a-9d90-ad42-2dbe-0e9a04e6fd0b";

@XendraTrl(Identifier="ffe3698c-7b7c-cc0c-cbe4-0a7e057c2593")
public static String es_PE_COLUMN_PO_DiscountSchema_ID_Name="Esquema Del Descuento en OC";

@XendraColumn(AD_Element_ID="17207ce1-c4e8-781c-b165-f893e525e36b",
ColumnName="PO_DiscountSchema_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="3a3974a6-65b9-c98d-24a9-e5218ed456cd",AD_Val_Rule_ID="",FieldLength=10,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="ffe3698c-7b7c-cc0c-cbe4-0a7e057c2593",
Synchronized="2019-08-30 22:21:15.0")
/** Column name PO_DiscountSchema_ID */
public static final String COLUMNNAME_PO_DiscountSchema_ID = "PO_DiscountSchema_ID";
/** Set Purchase Pricelist.
@param PO_PriceList_ID Price List used by this Business Partner */
public void setPO_PriceList_ID (int PO_PriceList_ID)
{
if (PO_PriceList_ID <= 0) set_Value (COLUMNNAME_PO_PriceList_ID, null);
 else 
set_Value (COLUMNNAME_PO_PriceList_ID, Integer.valueOf(PO_PriceList_ID));
}
/** Get Purchase Pricelist.
@return Price List used by this Business Partner */
public int getPO_PriceList_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_PO_PriceList_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="cdaaed6b-d98c-be62-bc1f-dc002f1a3735")
public static String es_PE_FIELD_BusinessPartnerGroup_PurchasePricelist_Name="Lista de Precios de Compra";

@XendraTrl(Identifier="cdaaed6b-d98c-be62-bc1f-dc002f1a3735")
public static String es_PE_FIELD_BusinessPartnerGroup_PurchasePricelist_Description="Lista de precios usada por este Socio del Negocio";

@XendraTrl(Identifier="cdaaed6b-d98c-be62-bc1f-dc002f1a3735")
public static String es_PE_FIELD_BusinessPartnerGroup_PurchasePricelist_Help="Identifica la lista de precios usada por un proveedor para productos comprados por esta organización.";

@XendraField(AD_Column_ID="PO_PriceList_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e371c975-39c1-9242-a283-86119ee2ce92",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cdaaed6b-d98c-be62-bc1f-dc002f1a3735")
public static final String FIELDNAME_BusinessPartnerGroup_PurchasePricelist="cdaaed6b-d98c-be62-bc1f-dc002f1a3735";

@XendraTrl(Identifier="038a0022-95b2-e651-5f7e-d4fd2182f1bf")
public static String es_PE_COLUMN_PO_PriceList_ID_Name="Lista de Precios de Compra";

@XendraColumn(AD_Element_ID="5387ca78-4441-35ea-c78f-3a42c70e41d3",ColumnName="PO_PriceList_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="a20c07c8-1fb7-74c6-ec9d-66afd2d29682",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=true,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="038a0022-95b2-e651-5f7e-d4fd2182f1bf",Synchronized="2019-08-30 22:21:15.0")
/** Column name PO_PriceList_ID */
public static final String COLUMNNAME_PO_PriceList_ID = "PO_PriceList_ID";
/** Set Price Match Tolerance.
@param PriceMatchTolerance PO-Invoice Match Price Tolerance in percent of the purchase price */
public void setPriceMatchTolerance (BigDecimal PriceMatchTolerance)
{
set_Value (COLUMNNAME_PriceMatchTolerance, PriceMatchTolerance);
}
/** Get Price Match Tolerance.
@return PO-Invoice Match Price Tolerance in percent of the purchase price */
public BigDecimal getPriceMatchTolerance() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PriceMatchTolerance);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="bd9fe62d-62fc-62c2-2df9-f399a6d0a608")
public static String es_PE_FIELD_BusinessPartnerGroup_PriceMatchTolerance_Name="% Tolerancia OC/Factura  ";

@XendraTrl(Identifier="bd9fe62d-62fc-62c2-2df9-f399a6d0a608")
public static String es_PE_FIELD_BusinessPartnerGroup_PriceMatchTolerance_Description="OC-Factura Precio Cotejar Tolerancia en porcentaje del Precio de Compra";

@XendraTrl(Identifier="bd9fe62d-62fc-62c2-2df9-f399a6d0a608")
public static String es_PE_FIELD_BusinessPartnerGroup_PriceMatchTolerance_Help="Tolerancia en por ciento de cotejar el precio de la orden de compra al precio de la factura. La diferencia se fija como tolerancia del precio de la factura para costeo estándar. Si está definido, la OC-Factura debe ser aprobada explícitamente, si la diferencia que coteja es mayor entonces la tolerancia.Ejemplo: si el precio de compra es $100 y la tolerancia es 1 ( porciento), el precio de la factura debe estar entre $99 y 101 que se aprobarán automáticamente.";

@XendraField(AD_Column_ID="PriceMatchTolerance",IsCentrallyMaintained=true,
AD_Tab_ID="e371c975-39c1-9242-a283-86119ee2ce92",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bd9fe62d-62fc-62c2-2df9-f399a6d0a608")
public static final String FIELDNAME_BusinessPartnerGroup_PriceMatchTolerance="bd9fe62d-62fc-62c2-2df9-f399a6d0a608";

@XendraTrl(Identifier="b0040257-73f0-8188-4f4a-1fce547099ac")
public static String es_PE_COLUMN_PriceMatchTolerance_Name="% Tolerancia OC/Factura  ";

@XendraColumn(AD_Element_ID="838e037e-5234-6315-b544-af89507bf24c",
ColumnName="PriceMatchTolerance",AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="0",ValueMax="100",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="b0040257-73f0-8188-4f4a-1fce547099ac",Synchronized="2019-08-30 22:21:15.0")
/** Column name PriceMatchTolerance */
public static final String COLUMNNAME_PriceMatchTolerance = "PriceMatchTolerance";
/** Set Priority Base.
@param PriorityBase Base of Priority */
public void setPriorityBase (String PriorityBase)
{
if (PriorityBase != null && PriorityBase.length() > 1)
{
log.warning("Length > 1 - truncated");
PriorityBase = PriorityBase.substring(0,0);
}
set_Value (COLUMNNAME_PriorityBase, PriorityBase);
}
/** Get Priority Base.
@return Base of Priority */
public String getPriorityBase() 
{
return (String)get_Value(COLUMNNAME_PriorityBase);
}

@XendraTrl(Identifier="ef547c03-a858-9360-f3ee-1b586d7269d2")
public static String es_PE_FIELD_BusinessPartnerGroup_PriorityBase_Name="Prioridad Base";

@XendraTrl(Identifier="ef547c03-a858-9360-f3ee-1b586d7269d2")
public static String es_PE_FIELD_BusinessPartnerGroup_PriorityBase_Description="Base de prioridad";

@XendraTrl(Identifier="ef547c03-a858-9360-f3ee-1b586d7269d2")
public static String es_PE_FIELD_BusinessPartnerGroup_PriorityBase_Help="Cuando se deriva la prioridad de la importancia, La base \"es agregada\" para la importancia del usuario.";

@XendraField(AD_Column_ID="PriorityBase",IsCentrallyMaintained=true,
AD_Tab_ID="e371c975-39c1-9242-a283-86119ee2ce92",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ef547c03-a858-9360-f3ee-1b586d7269d2")
public static final String FIELDNAME_BusinessPartnerGroup_PriorityBase="ef547c03-a858-9360-f3ee-1b586d7269d2";

@XendraTrl(Identifier="2da89473-1211-f60c-a505-e5a3f68b3338")
public static String es_PE_COLUMN_PriorityBase_Name="Prioridad Base";

@XendraColumn(AD_Element_ID="e80027c9-88c5-0afd-5a3f-9d6d184c16f1",ColumnName="PriorityBase",
AD_Reference_ID=17,AD_Reference_Value_ID="bd551a3b-b41c-6a6a-20ca-6b50202ca49c",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=true,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="2da89473-1211-f60c-a505-e5a3f68b3338",Synchronized="2019-08-30 22:21:15.0")
/** Column name PriorityBase */
public static final String COLUMNNAME_PriorityBase = "PriorityBase";
/** Set Search Key.
@param Value Search key for the record in the format required - must be unique */
public void setValue (String Value)
{
if (Value == null) throw new IllegalArgumentException ("Value is mandatory.");
if (Value.length() > 40)
{
log.warning("Length > 40 - truncated");
Value = Value.substring(0,39);
}
set_Value (COLUMNNAME_Value, Value);
}
/** Get Search Key.
@return Search key for the record in the format required - must be unique */
public String getValue() 
{
String value = (String)get_Value(COLUMNNAME_Value);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="6671066c-e040-4593-d8ee-81407e31b1e8")
public static String es_PE_FIELD_BusinessPartnerGroup_SearchKey_Name="Clave de Búsqueda";

@XendraTrl(Identifier="6671066c-e040-4593-d8ee-81407e31b1e8")
public static String es_PE_FIELD_BusinessPartnerGroup_SearchKey_Description="Clave de búsqueda para el registro en el formato requerido; debe ser única";

@XendraTrl(Identifier="6671066c-e040-4593-d8ee-81407e31b1e8")
public static String es_PE_FIELD_BusinessPartnerGroup_SearchKey_Help="Una clave de búsqueda le permite a usted un método rápido de encontrar un registro en particular";

@XendraField(AD_Column_ID="Value",IsCentrallyMaintained=true,
AD_Tab_ID="e371c975-39c1-9242-a283-86119ee2ce92",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=30,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6671066c-e040-4593-d8ee-81407e31b1e8")
public static final String FIELDNAME_BusinessPartnerGroup_SearchKey="6671066c-e040-4593-d8ee-81407e31b1e8";

@XendraTrl(Identifier="28306787-a6e7-e8e1-4192-5fde497bc982")
public static String es_PE_COLUMN_Value_Name="Clave de Búsqueda";

@XendraColumn(AD_Element_ID="e75e100c-9b41-a643-2cb3-46eeced683d8",ColumnName="Value",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="28306787-a6e7-e8e1-4192-5fde497bc982",
Synchronized="2019-08-30 22:21:15.0")
/** Column name Value */
public static final String COLUMNNAME_Value = "Value";
}
