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
/** Generated Model for C_Currency
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_Currency extends PO
{
/** Standard Constructor
@param ctx context
@param C_Currency_ID id
@param trxName transaction
*/
public X_C_Currency (Properties ctx, int C_Currency_ID, String trxName)
{
super (ctx, C_Currency_ID, trxName);
/** if (C_Currency_ID == 0)
{
setC_Currency_ID (0);
setCostingPrecision (0);	
// 4
setDescription (null);
setIsEMUMember (false);	
// N
setIsEuro (false);	
// N
setISO_Code (null);
setStdPrecision (0);	
// 2
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_Currency (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=141 */
public static int Table_ID=MTable.getTable_ID("C_Currency");

@XendraTrl(Identifier="4a091abb-fd70-0087-ec7c-2aadbf47713e")
public static String es_PE_TAB_Currency_Description="Definir Moneda";

@XendraTrl(Identifier="4a091abb-fd70-0087-ec7c-2aadbf47713e")
public static String es_PE_TAB_Currency_Name="Moneda";

@XendraTrl(Identifier="4a091abb-fd70-0087-ec7c-2aadbf47713e")
public static String es_PE_TAB_Currency_Help="La pestaña de moneda define cualquier moneda con la que se crearán transacciones ó Informes.";

@XendraTab(Name="Currency",Description="Define Currency",
Help="The Currency Tab defines any currency you will transact with or report in.",
AD_Window_ID="69518fbe-add4-e240-8d5a-c664ddd2ccd1",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="4a091abb-fd70-0087-ec7c-2aadbf47713e",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Currency="4a091abb-fd70-0087-ec7c-2aadbf47713e";

@XendraTrl(Identifier="f2f949e3-3dff-d89d-3a45-f54d3553dd98")
public static String es_PE_TABLE_C_Currency_Name="Moneda";

@XendraTable(Name="Currency",Description="The Currency for this record",Help="",
TableName="C_Currency",AccessLevel="6",AD_Window_ID="69518fbe-add4-e240-8d5a-c664ddd2ccd1",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=50,IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="f2f949e3-3dff-d89d-3a45-f54d3553dd98",Synchronized="2017-08-16 11:41:42.0")
/** TableName=C_Currency */
public static final String Table_Name="C_Currency";


@XendraIndex(Name="c_currencyisocode",Identifier="e7157f26-d749-371b-eba7-2000313f6707",
Column_Names="iso_code",IsUnique="true",TableIdentifier="e7157f26-d749-371b-eba7-2000313f6707",
Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_c_currencyisocode = "e7157f26-d749-371b-eba7-2000313f6707";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_Currency");

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
    Table_ID = MTable.getTable_ID("C_Currency");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_Currency[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Currency.
@param C_Currency_ID The Currency for this record */
public void setC_Currency_ID (int C_Currency_ID)
{
if (C_Currency_ID < 1) throw new IllegalArgumentException ("C_Currency_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_Currency_ID, Integer.valueOf(C_Currency_ID));
}
/** Get Currency.
@return The Currency for this record */
public int getC_Currency_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Currency_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="629b2ee8-e672-b6ce-baf7-8f8a176e5135")
public static String es_PE_FIELD_Currency_Currency_Description="Moneda para este registro";

@XendraTrl(Identifier="629b2ee8-e672-b6ce-baf7-8f8a176e5135")
public static String es_PE_FIELD_Currency_Currency_Help="Indica la moneda a ser usada cuando se procese ó Informe este registro";

@XendraTrl(Identifier="629b2ee8-e672-b6ce-baf7-8f8a176e5135")
public static String es_PE_FIELD_Currency_Currency_Name="Moneda";

@XendraField(AD_Column_ID="C_Currency_ID",IsCentrallyMaintained=true,
AD_Tab_ID="4a091abb-fd70-0087-ec7c-2aadbf47713e",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="629b2ee8-e672-b6ce-baf7-8f8a176e5135")
public static final String FIELDNAME_Currency_Currency="629b2ee8-e672-b6ce-baf7-8f8a176e5135";
/** Column name C_Currency_ID */
public static final String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
/** Set Sunat Document Code.
@param CodSunat Sunat Document Code */
public void setCodSunat (String CodSunat)
{
if (CodSunat != null && CodSunat.length() > 2)
{
log.warning("Length > 2 - truncated");
CodSunat = CodSunat.substring(0,1);
}
set_Value (COLUMNNAME_CodSunat, CodSunat);
}
/** Get Sunat Document Code.
@return Sunat Document Code */
public String getCodSunat() 
{
String value = (String)get_Value(COLUMNNAME_CodSunat);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="d3a75029-e91d-79e6-e028-1d26d1cdbec4")
public static String es_PE_COLUMN_CodSunat_Name="Código Sunat";

@XendraColumn(AD_Element_ID="84884f14-1f72-b5d2-c38f-d807ef550fd4",ColumnName="CodSunat",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d3a75029-e91d-79e6-e028-1d26d1cdbec4",
Synchronized="2017-08-05 16:53:34.0")
/** Column name CodSunat */
public static final String COLUMNNAME_CodSunat = "CodSunat";
/** Set Costing Precision.
@param CostingPrecision Rounding used costing calculations */
public void setCostingPrecision (int CostingPrecision)
{
set_Value (COLUMNNAME_CostingPrecision, Integer.valueOf(CostingPrecision));
}
/** Get Costing Precision.
@return Rounding used costing calculations */
public int getCostingPrecision() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_CostingPrecision);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="02dda9bf-efca-3c69-1bbe-5d191888bfbb")
public static String es_PE_FIELD_Currency_CostingPrecision_Description="Redondeo usado en el cálculo de costos";

@XendraTrl(Identifier="02dda9bf-efca-3c69-1bbe-5d191888bfbb")
public static String es_PE_FIELD_Currency_CostingPrecision_Help="La precisión del costeo define el número de lugares decimales en que los totales serán redondeados cuando se ejecuten los cálculos de costeo.";

@XendraTrl(Identifier="02dda9bf-efca-3c69-1bbe-5d191888bfbb")
public static String es_PE_FIELD_Currency_CostingPrecision_Name="Redondeo del Costo";

@XendraField(AD_Column_ID="CostingPrecision",IsCentrallyMaintained=true,
AD_Tab_ID="4a091abb-fd70-0087-ec7c-2aadbf47713e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="02dda9bf-efca-3c69-1bbe-5d191888bfbb")
public static final String FIELDNAME_Currency_CostingPrecision="02dda9bf-efca-3c69-1bbe-5d191888bfbb";

@XendraTrl(Identifier="c3053016-a9ef-948e-5b1e-6db3d4a12fb1")
public static String es_PE_COLUMN_CostingPrecision_Name="Redondeo del Costo";

@XendraColumn(AD_Element_ID="027f70ef-7a81-55fc-9e9b-84193d267732",ColumnName="CostingPrecision",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="4",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c3053016-a9ef-948e-5b1e-6db3d4a12fb1",
Synchronized="2017-08-05 16:53:34.0")
/** Column name CostingPrecision */
public static final String COLUMNNAME_CostingPrecision = "CostingPrecision";
/** Set Symbol.
@param CurSymbol Symbol of the currency (opt used for printing only) */
public void setCurSymbol (String CurSymbol)
{
if (CurSymbol != null && CurSymbol.length() > 10)
{
log.warning("Length > 10 - truncated");
CurSymbol = CurSymbol.substring(0,9);
}
set_Value (COLUMNNAME_CurSymbol, CurSymbol);
}
/** Get Symbol.
@return Symbol of the currency (opt used for printing only) */
public String getCurSymbol() 
{
String value = (String)get_Value(COLUMNNAME_CurSymbol);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="37062061-ca00-95c1-1f43-5271c29f5249")
public static String es_PE_FIELD_Currency_Symbol_Description="Símbolo de la moneda (opción usada sólo para impresión)";

@XendraTrl(Identifier="37062061-ca00-95c1-1f43-5271c29f5249")
public static String es_PE_FIELD_Currency_Symbol_Help="El símbolo de moneda define el símbolo que se imprimirá cuando esta moneda se use.";

@XendraTrl(Identifier="37062061-ca00-95c1-1f43-5271c29f5249")
public static String es_PE_FIELD_Currency_Symbol_Name="Símbolo";

@XendraField(AD_Column_ID="CurSymbol",IsCentrallyMaintained=true,
AD_Tab_ID="4a091abb-fd70-0087-ec7c-2aadbf47713e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=5,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="37062061-ca00-95c1-1f43-5271c29f5249")
public static final String FIELDNAME_Currency_Symbol="37062061-ca00-95c1-1f43-5271c29f5249";

@XendraTrl(Identifier="d9d967ed-8333-a41a-e86d-adafea79d33b")
public static String es_PE_COLUMN_CurSymbol_Name="Símbolo";

@XendraColumn(AD_Element_ID="a6544ce7-4bd1-7f2a-84da-823b8e61f86e",ColumnName="CurSymbol",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d9d967ed-8333-a41a-e86d-adafea79d33b",
Synchronized="2017-08-05 16:53:34.0")
/** Column name CurSymbol */
public static final String COLUMNNAME_CurSymbol = "CurSymbol";
/** Set Description.
@param Description Optional short DESCRIPTION of the record */
public void setDescription (String Description)
{
if (Description == null) throw new IllegalArgumentException ("Description is mandatory.");
if (Description.length() > 255)
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

@XendraTrl(Identifier="dd601ee6-a1d9-e8ce-9dfc-ca54d5551355")
public static String es_PE_FIELD_Currency_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="dd601ee6-a1d9-e8ce-9dfc-ca54d5551355")
public static String es_PE_FIELD_Currency_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="dd601ee6-a1d9-e8ce-9dfc-ca54d5551355")
public static String es_PE_FIELD_Currency_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="4a091abb-fd70-0087-ec7c-2aadbf47713e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="dd601ee6-a1d9-e8ce-9dfc-ca54d5551355")
public static final String FIELDNAME_Currency_Description="dd601ee6-a1d9-e8ce-9dfc-ca54d5551355";

@XendraTrl(Identifier="54f4f17f-1f22-0512-99d0-cd09f3521f00")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="54f4f17f-1f22-0512-99d0-cd09f3521f00",
Synchronized="2017-08-05 16:53:34.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set EMU Entry Date.
@param EMUEntryDate Date when the currency joined / will join the EMU */
public void setEMUEntryDate (Timestamp EMUEntryDate)
{
set_Value (COLUMNNAME_EMUEntryDate, EMUEntryDate);
}
/** Get EMU Entry Date.
@return Date when the currency joined / will join the EMU */
public Timestamp getEMUEntryDate() 
{
return (Timestamp)get_Value(COLUMNNAME_EMUEntryDate);
}

@XendraTrl(Identifier="ded56b1f-8dfd-dc9d-50a9-e791fc0a611d")
public static String es_PE_FIELD_Currency_EMUEntryDate_Description="Fecha en que la moneda se unió / unirá a la EMU";

@XendraTrl(Identifier="ded56b1f-8dfd-dc9d-50a9-e791fc0a611d")
public static String es_PE_FIELD_Currency_EMUEntryDate_Help="La fecha de Ingreso EMU define la fecha en que esta moneda ingresó; ó ingresará a la Unión Monetaria Económica";

@XendraTrl(Identifier="ded56b1f-8dfd-dc9d-50a9-e791fc0a611d")
public static String es_PE_FIELD_Currency_EMUEntryDate_Name="Fecha de inicio EMU";

@XendraField(AD_Column_ID="EMUEntryDate",IsCentrallyMaintained=true,
AD_Tab_ID="4a091abb-fd70-0087-ec7c-2aadbf47713e",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@IsEMUMember@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ded56b1f-8dfd-dc9d-50a9-e791fc0a611d")
public static final String FIELDNAME_Currency_EMUEntryDate="ded56b1f-8dfd-dc9d-50a9-e791fc0a611d";

@XendraTrl(Identifier="dfeee17e-ca24-d7c5-1a5f-6767d067f0e6")
public static String es_PE_COLUMN_EMUEntryDate_Name="Fecha de inicio EMU";

@XendraColumn(AD_Element_ID="87f7720b-0213-e47a-7ebc-73c57081d1e5",ColumnName="EMUEntryDate",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="dfeee17e-ca24-d7c5-1a5f-6767d067f0e6",
Synchronized="2017-08-05 16:53:34.0")
/** Column name EMUEntryDate */
public static final String COLUMNNAME_EMUEntryDate = "EMUEntryDate";
/** Set EMU Rate.
@param EMURate Official rate to the Euro */
public void setEMURate (BigDecimal EMURate)
{
set_Value (COLUMNNAME_EMURate, EMURate);
}
/** Get EMU Rate.
@return Official rate to the Euro */
public BigDecimal getEMURate() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_EMURate);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="df6a9e09-e7f1-7466-7b31-eafaf7f79ef1")
public static String es_PE_FIELD_Currency_EMURate_Description="Tasa oficial para convertir al Euro";

@XendraTrl(Identifier="df6a9e09-e7f1-7466-7b31-eafaf7f79ef1")
public static String es_PE_FIELD_Currency_EMURate_Help="La Tasa EMU define la tasa oficial a ser usada cuando convierte desde esta moneda al Euro";

@XendraTrl(Identifier="df6a9e09-e7f1-7466-7b31-eafaf7f79ef1")
public static String es_PE_FIELD_Currency_EMURate_Name="Tasa EMU";

@XendraField(AD_Column_ID="EMURate",IsCentrallyMaintained=true,
AD_Tab_ID="4a091abb-fd70-0087-ec7c-2aadbf47713e",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@IsEMUMember@=Y",DisplayLength=26,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="df6a9e09-e7f1-7466-7b31-eafaf7f79ef1")
public static final String FIELDNAME_Currency_EMURate="df6a9e09-e7f1-7466-7b31-eafaf7f79ef1";

@XendraTrl(Identifier="83d7f327-b774-d13e-a5b5-a010a1898608")
public static String es_PE_COLUMN_EMURate_Name="Tasa EMU";

@XendraColumn(AD_Element_ID="807e942e-37d7-f0ea-d522-ab768966fefc",ColumnName="EMURate",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="83d7f327-b774-d13e-a5b5-a010a1898608",
Synchronized="2017-08-05 16:53:34.0")
/** Column name EMURate */
public static final String COLUMNNAME_EMURate = "EMURate";
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
@XendraTrl(Identifier="5972a2f6-345c-4944-aac5-5d4dbbd39fb5")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5972a2f6-345c-4944-aac5-5d4dbbd39fb5",
Synchronized="2017-08-05 16:53:34.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set IsDolar.
@param IsDolar IsDolar */
public void setIsDolar (boolean IsDolar)
{
set_Value (COLUMNNAME_IsDolar, Boolean.valueOf(IsDolar));
}
/** Get IsDolar.
@return IsDolar */
public boolean isDolar() 
{
Object oo = get_Value(COLUMNNAME_IsDolar);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="f86fc9f6-c6ff-7106-face-60209894cc52")
public static String es_PE_FIELD_Currency_IsDolar_Name="isdolar";

@XendraField(AD_Column_ID="IsDolar",IsCentrallyMaintained=true,
AD_Tab_ID="4a091abb-fd70-0087-ec7c-2aadbf47713e",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f86fc9f6-c6ff-7106-face-60209894cc52")
public static final String FIELDNAME_Currency_IsDolar="f86fc9f6-c6ff-7106-face-60209894cc52";

@XendraTrl(Identifier="6c56d404-830d-d752-148c-4f1914d622ae")
public static String es_PE_COLUMN_IsDolar_Name="isdolar";

@XendraColumn(AD_Element_ID="20f133d1-b2ea-87ca-551d-c33bc2b0bf56",ColumnName="IsDolar",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6c56d404-830d-d752-148c-4f1914d622ae",
Synchronized="2017-08-05 16:53:34.0")
/** Column name IsDolar */
public static final String COLUMNNAME_IsDolar = "IsDolar";
/** Set EMU Member.
@param IsEMUMember This currency is member if the European Monetary Union */
public void setIsEMUMember (boolean IsEMUMember)
{
set_Value (COLUMNNAME_IsEMUMember, Boolean.valueOf(IsEMUMember));
}
/** Get EMU Member.
@return This currency is member if the European Monetary Union */
public boolean isEMUMember() 
{
Object oo = get_Value(COLUMNNAME_IsEMUMember);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="b593fc5c-211e-20d4-372f-b8bc60003c82")
public static String es_PE_FIELD_Currency_EMUMember_Description="La moneda es una moneda de la Unión Monetaria Europea";

@XendraTrl(Identifier="b593fc5c-211e-20d4-372f-b8bc60003c82")
public static String es_PE_FIELD_Currency_EMUMember_Help="El cuadro de verificación EMU se usa para indicar si esta moneda es un miembro de la Unión Económica Europea.";

@XendraTrl(Identifier="b593fc5c-211e-20d4-372f-b8bc60003c82")
public static String es_PE_FIELD_Currency_EMUMember_Name="Miembro EMU";

@XendraField(AD_Column_ID="IsEMUMember",IsCentrallyMaintained=true,
AD_Tab_ID="4a091abb-fd70-0087-ec7c-2aadbf47713e",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b593fc5c-211e-20d4-372f-b8bc60003c82")
public static final String FIELDNAME_Currency_EMUMember="b593fc5c-211e-20d4-372f-b8bc60003c82";

@XendraTrl(Identifier="b0821f38-c24a-6a5e-812c-00e4f84ea5bf")
public static String es_PE_COLUMN_IsEMUMember_Name="Miembro EMU";

@XendraColumn(AD_Element_ID="005ed97d-f786-b542-21c7-b7e81db1150c",ColumnName="IsEMUMember",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b0821f38-c24a-6a5e-812c-00e4f84ea5bf",
Synchronized="2017-08-05 16:53:34.0")
/** Column name IsEMUMember */
public static final String COLUMNNAME_IsEMUMember = "IsEMUMember";
/** Set The Euro Currency.
@param IsEuro This currency is the Euro */
public void setIsEuro (boolean IsEuro)
{
set_Value (COLUMNNAME_IsEuro, Boolean.valueOf(IsEuro));
}
/** Get The Euro Currency.
@return This currency is the Euro */
public boolean isEuro() 
{
Object oo = get_Value(COLUMNNAME_IsEuro);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="33ddb15d-7584-892e-0b1b-0bc9bdf84ec7")
public static String es_PE_FIELD_Currency_TheEuroCurrency_Description="La moneda es el euro";

@XendraTrl(Identifier="33ddb15d-7584-892e-0b1b-0bc9bdf84ec7")
public static String es_PE_FIELD_Currency_TheEuroCurrency_Help="El cuadro de verificación moneda euro es usado para indicar si ésta moneda es moneda euro.";

@XendraTrl(Identifier="33ddb15d-7584-892e-0b1b-0bc9bdf84ec7")
public static String es_PE_FIELD_Currency_TheEuroCurrency_Name="La Moneda Euro";

@XendraField(AD_Column_ID="IsEuro",IsCentrallyMaintained=true,
AD_Tab_ID="4a091abb-fd70-0087-ec7c-2aadbf47713e",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@IsEMUMember@=N",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="33ddb15d-7584-892e-0b1b-0bc9bdf84ec7")
public static final String FIELDNAME_Currency_TheEuroCurrency="33ddb15d-7584-892e-0b1b-0bc9bdf84ec7";

@XendraTrl(Identifier="96be63e1-09c8-3e1b-7a04-69ba2d878b37")
public static String es_PE_COLUMN_IsEuro_Name="La Moneda Euro";

@XendraColumn(AD_Element_ID="33c646b5-d658-e721-5e01-340d112fb414",ColumnName="IsEuro",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="96be63e1-09c8-3e1b-7a04-69ba2d878b37",
Synchronized="2017-08-05 16:53:34.0")
/** Column name IsEuro */
public static final String COLUMNNAME_IsEuro = "IsEuro";
/** Set Mandatory.
@param IsMandatory Data entry is required in this column */
public void setIsMandatory (boolean IsMandatory)
{
set_Value (COLUMNNAME_IsMandatory, Boolean.valueOf(IsMandatory));
}
/** Get Mandatory.
@return Data entry is required in this column */
public boolean isMandatory() 
{
Object oo = get_Value(COLUMNNAME_IsMandatory);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="33505cb4-90dd-add1-730f-5e21b87ea8db")
public static String es_PE_FIELD_Currency_Mandatory_Description="Entrada de datos es requerida en esta columna";

@XendraTrl(Identifier="33505cb4-90dd-add1-730f-5e21b87ea8db")
public static String es_PE_FIELD_Currency_Mandatory_Help="El cuadro de verificación obligatorio indica si el campo es requerido para que un registro sea salvado a la base de datos.";

@XendraTrl(Identifier="33505cb4-90dd-add1-730f-5e21b87ea8db")
public static String es_PE_FIELD_Currency_Mandatory_Name="Entrada Obligatoria";

@XendraField(AD_Column_ID="IsMandatory",IsCentrallyMaintained=true,
AD_Tab_ID="4a091abb-fd70-0087-ec7c-2aadbf47713e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="33505cb4-90dd-add1-730f-5e21b87ea8db")
public static final String FIELDNAME_Currency_Mandatory="33505cb4-90dd-add1-730f-5e21b87ea8db";

@XendraTrl(Identifier="b2a96ea0-60bd-631e-bea8-1591d007195e")
public static String es_PE_COLUMN_IsMandatory_Name="Mandatory";

@XendraColumn(AD_Element_ID="43310179-c59f-f313-de13-08d90722e38d",ColumnName="IsMandatory",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b2a96ea0-60bd-631e-bea8-1591d007195e",
Synchronized="2017-08-05 16:53:34.0")
/** Column name IsMandatory */
public static final String COLUMNNAME_IsMandatory = "IsMandatory";
/** Set ISO Currency Code.
@param ISO_Code Three letter ISO 4217 Code of the Currency */
public void setISO_Code (String ISO_Code)
{
if (ISO_Code == null) throw new IllegalArgumentException ("ISO_Code is mandatory.");
if (ISO_Code.length() > 3)
{
log.warning("Length > 3 - truncated");
ISO_Code = ISO_Code.substring(0,2);
}
set_Value (COLUMNNAME_ISO_Code, ISO_Code);
}
/** Get ISO Currency Code.
@return Three letter ISO 4217 Code of the Currency */
public String getISO_Code() 
{
String value = (String)get_Value(COLUMNNAME_ISO_Code);
if (value == null)
  return "";
return value;
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), getISO_Code());
}

@XendraTrl(Identifier="191800a6-8ec5-c969-b06a-d2587b24a410")
public static String es_PE_FIELD_Currency_ISOCurrencyCode_Description="Código ISO 4217 de la moneda";

@XendraTrl(Identifier="191800a6-8ec5-c969-b06a-d2587b24a410")
public static String es_PE_FIELD_Currency_ISOCurrencyCode_Help="Para detalles ver - http://www.unece.org/trade/rec/rec09en.htm";

@XendraTrl(Identifier="191800a6-8ec5-c969-b06a-d2587b24a410")
public static String es_PE_FIELD_Currency_ISOCurrencyCode_Name="Código ISO";

@XendraField(AD_Column_ID="ISO_Code",IsCentrallyMaintained=true,
AD_Tab_ID="4a091abb-fd70-0087-ec7c-2aadbf47713e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=5,IsReadOnly=false,SeqNo=30,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="191800a6-8ec5-c969-b06a-d2587b24a410")
public static final String FIELDNAME_Currency_ISOCurrencyCode="191800a6-8ec5-c969-b06a-d2587b24a410";

@XendraTrl(Identifier="5712f135-c6a5-9f6e-9ac1-c5867e87c673")
public static String es_PE_COLUMN_ISO_Code_Name="Código ISO";

@XendraColumn(AD_Element_ID="0770c1a3-36f8-0fc9-bd56-a563b64128ee",ColumnName="ISO_Code",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=3,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5712f135-c6a5-9f6e-9ac1-c5867e87c673",
Synchronized="2017-08-05 16:53:34.0")
/** Column name ISO_Code */
public static final String COLUMNNAME_ISO_Code = "ISO_Code";
/** Set Standard Precision.
@param StdPrecision Rule for rounding  calculated amounts */
public void setStdPrecision (int StdPrecision)
{
set_Value (COLUMNNAME_StdPrecision, Integer.valueOf(StdPrecision));
}
/** Get Standard Precision.
@return Rule for rounding  calculated amounts */
public int getStdPrecision() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_StdPrecision);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="b8de996b-b881-b13d-2d78-fbd03fe4f41c")
public static String es_PE_FIELD_Currency_StandardPrecision_Description="Regla de redondeo para los totales calculados";

@XendraTrl(Identifier="b8de996b-b881-b13d-2d78-fbd03fe4f41c")
public static String es_PE_FIELD_Currency_StandardPrecision_Help="La precisión estándar define el número de lugares decimales que serán redondeados los totales para transacciones contables y documentos";

@XendraTrl(Identifier="b8de996b-b881-b13d-2d78-fbd03fe4f41c")
public static String es_PE_FIELD_Currency_StandardPrecision_Name="Redondeo Estándar";

@XendraField(AD_Column_ID="StdPrecision",IsCentrallyMaintained=true,
AD_Tab_ID="4a091abb-fd70-0087-ec7c-2aadbf47713e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b8de996b-b881-b13d-2d78-fbd03fe4f41c")
public static final String FIELDNAME_Currency_StandardPrecision="b8de996b-b881-b13d-2d78-fbd03fe4f41c";

@XendraTrl(Identifier="abdebe2a-4623-8156-3706-4420521d3f01")
public static String es_PE_COLUMN_StdPrecision_Name="Redondeo Estándar";

@XendraColumn(AD_Element_ID="e68597be-fc06-38e3-84d4-408355922e9d",ColumnName="StdPrecision",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="2",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="abdebe2a-4623-8156-3706-4420521d3f01",
Synchronized="2017-08-05 16:53:34.0")
/** Column name StdPrecision */
public static final String COLUMNNAME_StdPrecision = "StdPrecision";
/** Set Tax ID.
@param TaxID Tax Identification */
public void setTaxID (String TaxID)
{
if (TaxID != null && TaxID.length() > 20)
{
log.warning("Length > 20 - truncated");
TaxID = TaxID.substring(0,19);
}
set_Value (COLUMNNAME_TaxID, TaxID);
}
/** Get Tax ID.
@return Tax Identification */
public String getTaxID() 
{
String value = (String)get_Value(COLUMNNAME_TaxID);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="f22a60fa-10fc-4ebb-9d9f-d33e414a7953")
public static String es_PE_FIELD_Currency_TaxID_Description="Código de Identificación";

@XendraTrl(Identifier="f22a60fa-10fc-4ebb-9d9f-d33e414a7953")
public static String es_PE_FIELD_Currency_TaxID_Help="El código de Identificación es el número de identificación gubernamental de esta entidad";

@XendraTrl(Identifier="f22a60fa-10fc-4ebb-9d9f-d33e414a7953")
public static String es_PE_FIELD_Currency_TaxID_Name="RFC";
@XendraField(AD_Column_ID="TaxID",
IsCentrallyMaintained=true,AD_Tab_ID="4a091abb-fd70-0087-ec7c-2aadbf47713e",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=90,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-08-12 00:00:00.0",Identifier="f22a60fa-10fc-4ebb-9d9f-d33e414a7953")
public static final String FIELDNAME_Currency_TaxID="f22a60fa-10fc-4ebb-9d9f-d33e414a7953";

@XendraTrl(Identifier="255716c3-42c5-becb-981d-85a2039be06a")
public static String es_PE_COLUMN_TaxID_Name="taxid";

@XendraColumn(AD_Element_ID="e0a9d0f7-835b-4f80-4c13-bff62213e232",ColumnName="TaxID",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="255716c3-42c5-becb-981d-85a2039be06a",
Synchronized="2012-07-11 00:00:00.0")
/** Column name TaxID */
public static final String COLUMNNAME_TaxID = "TaxID";
}
