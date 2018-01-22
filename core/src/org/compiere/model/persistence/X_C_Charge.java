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
import org.compiere.model.reference.REF_TypesOfGoodsAndServicesPurchased;
/** Generated Model for C_Charge
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_Charge extends PO
{
/** Standard Constructor
@param ctx context
@param C_Charge_ID id
@param trxName transaction
*/
public X_C_Charge (Properties ctx, int C_Charge_ID, String trxName)
{
super (ctx, C_Charge_ID, trxName);
/** if (C_Charge_ID == 0)
{
setC_Charge_ID (0);
setChargeAmt (Env.ZERO);	
// 0
setC_TaxCategory_ID (0);
setIsSameCurrency (false);	
// N
setIsSameTax (false);	
// N
setIsTaxIncluded (false);	
// N
setName (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_Charge (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=313 */
public static int Table_ID=MTable.getTable_ID("C_Charge");

@XendraTrl(Identifier="5bc9242d-ec03-599e-3780-864fb28c79b5")
public static String es_PE_TAB_Charge_Description="Cargo";

@XendraTrl(Identifier="5bc9242d-ec03-599e-3780-864fb28c79b5")
public static String es_PE_TAB_Charge_Name="Cargo";

@XendraTrl(Identifier="5bc9242d-ec03-599e-3780-864fb28c79b5")
public static String es_PE_TAB_Charge_Help="La pestaña Cargos define los cargos que pueden ser asociados a un documento.";

@XendraTab(Name="Charge",Description="Charge",
Help="The Charge Tab defines the unique charges that may be associated with a document. The optional Business Partner allows to create Purchase Orders from Requisitions.",
AD_Window_ID="ef466ff3-68cd-74cc-581f-b4cfbb084e84",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="5bc9242d-ec03-599e-3780-864fb28c79b5",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Charge="5bc9242d-ec03-599e-3780-864fb28c79b5";

@XendraTrl(Identifier="d8f28873-f3fb-1861-2860-3b946a781c13")
public static String es_PE_TABLE_C_Charge_Name="Cargo";

@XendraTable(Name="Charge",Description="Additional document charges",Help="",TableName="C_Charge",
AccessLevel="3",AD_Window_ID="ef466ff3-68cd-74cc-581f-b4cfbb084e84",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=100,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="d8f28873-f3fb-1861-2860-3b946a781c13",Synchronized="2017-08-16 11:41:37.0")
/** TableName=C_Charge */
public static final String Table_Name="C_Charge";


@XendraIndex(Name="c_charge_name",Identifier="4ffb790e-e1d4-3dd0-8595-f2dbb540e791",
Column_Names="ad_client_id, name",IsUnique="true",
TableIdentifier="4ffb790e-e1d4-3dd0-8595-f2dbb540e791",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_c_charge_name = "4ffb790e-e1d4-3dd0-8595-f2dbb540e791";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_Charge");

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
    Table_ID = MTable.getTable_ID("C_Charge");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_Charge[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Business Partner .
@param C_BPartner_ID Identifies a Business Partner */
public void setC_BPartner_ID (int C_BPartner_ID)
{
if (C_BPartner_ID <= 0) set_Value (COLUMNNAME_C_BPartner_ID, null);
 else 
set_Value (COLUMNNAME_C_BPartner_ID, Integer.valueOf(C_BPartner_ID));
}
/** Get Business Partner .
@return Identifies a Business Partner */
public int getC_BPartner_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartner_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="79e8e8ad-63fa-81a1-84bd-44f754098c49")
public static String es_PE_FIELD_Charge_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="79e8e8ad-63fa-81a1-84bd-44f754098c49")
public static String es_PE_FIELD_Charge_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraTrl(Identifier="79e8e8ad-63fa-81a1-84bd-44f754098c49")
public static String es_PE_FIELD_Charge_BusinessPartner_Name="Socio de Negocio";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5bc9242d-ec03-599e-3780-864fb28c79b5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="79e8e8ad-63fa-81a1-84bd-44f754098c49")
public static final String FIELDNAME_Charge_BusinessPartner="79e8e8ad-63fa-81a1-84bd-44f754098c49";

@XendraTrl(Identifier="89c5b16c-2b64-e47a-5196-717bb3be560c")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Socio de Negocio";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="89c5b16c-2b64-e47a-5196-717bb3be560c",
Synchronized="2017-08-05 16:53:29.0")
/** Column name C_BPartner_ID */
public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
/** Set Charge.
@param C_Charge_ID Additional document charges */
public void setC_Charge_ID (int C_Charge_ID)
{
if (C_Charge_ID < 1) throw new IllegalArgumentException ("C_Charge_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_Charge_ID, Integer.valueOf(C_Charge_ID));
}
/** Get Charge.
@return Additional document charges */
public int getC_Charge_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Charge_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ed1e9272-ed03-f374-4692-dee3cc6989fd")
public static String es_PE_FIELD_Charge_Charge_Description="Cargos adicionales del documento";

@XendraTrl(Identifier="ed1e9272-ed03-f374-4692-dee3cc6989fd")
public static String es_PE_FIELD_Charge_Charge_Help="El cargo indica un tipo de cargo (manejo; despacho; reposición)";

@XendraTrl(Identifier="ed1e9272-ed03-f374-4692-dee3cc6989fd")
public static String es_PE_FIELD_Charge_Charge_Name="Cargo";

@XendraField(AD_Column_ID="C_Charge_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5bc9242d-ec03-599e-3780-864fb28c79b5",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ed1e9272-ed03-f374-4692-dee3cc6989fd")
public static final String FIELDNAME_Charge_Charge="ed1e9272-ed03-f374-4692-dee3cc6989fd";
/** Column name C_Charge_ID */
public static final String COLUMNNAME_C_Charge_ID = "C_Charge_ID";
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

@XendraTrl(Identifier="4c816cb4-755f-b740-7013-dd6a893d5337")
public static String es_PE_COLUMN_C_Currency_ID_Name="Currency";

@XendraColumn(AD_Element_ID="8daec488-bca2-50fe-f9de-abf0cba2a34a",ColumnName="C_Currency_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4c816cb4-755f-b740-7013-dd6a893d5337",
Synchronized="2017-08-05 16:53:29.0")
/** Column name C_Currency_ID */
public static final String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
/** Set Charge amount.
@param ChargeAmt Charge Amount */
public void setChargeAmt (BigDecimal ChargeAmt)
{
if (ChargeAmt == null) throw new IllegalArgumentException ("ChargeAmt is mandatory.");
set_Value (COLUMNNAME_ChargeAmt, ChargeAmt);
}
/** Get Charge amount.
@return Charge Amount */
public BigDecimal getChargeAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_ChargeAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="5a1cccc4-3530-4670-4b32-1e796dfbc577")
public static String es_PE_FIELD_Charge_ChargeAmount_Description="Total del Cargo";

@XendraTrl(Identifier="5a1cccc4-3530-4670-4b32-1e796dfbc577")
public static String es_PE_FIELD_Charge_ChargeAmount_Help="El Total Cargo indica el total para un cargo adicional";

@XendraTrl(Identifier="5a1cccc4-3530-4670-4b32-1e796dfbc577")
public static String es_PE_FIELD_Charge_ChargeAmount_Name="Total de Cargo";

@XendraField(AD_Column_ID="ChargeAmt",IsCentrallyMaintained=true,
AD_Tab_ID="5bc9242d-ec03-599e-3780-864fb28c79b5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5a1cccc4-3530-4670-4b32-1e796dfbc577")
public static final String FIELDNAME_Charge_ChargeAmount="5a1cccc4-3530-4670-4b32-1e796dfbc577";

@XendraTrl(Identifier="0c82f619-8cb5-042b-3e1c-1cea946a5f08")
public static String es_PE_COLUMN_ChargeAmt_Name="Total de Cargo";

@XendraColumn(AD_Element_ID="0700d401-01bb-8f19-a508-aa47155ba852",ColumnName="ChargeAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0c82f619-8cb5-042b-3e1c-1cea946a5f08",
Synchronized="2017-08-05 16:53:29.0")
/** Column name ChargeAmt */
public static final String COLUMNNAME_ChargeAmt = "ChargeAmt";
/** Set Tax Category.
@param C_TaxCategory_ID Tax Category */
public void setC_TaxCategory_ID (int C_TaxCategory_ID)
{
if (C_TaxCategory_ID < 1) throw new IllegalArgumentException ("C_TaxCategory_ID is mandatory.");
set_Value (COLUMNNAME_C_TaxCategory_ID, Integer.valueOf(C_TaxCategory_ID));
}
/** Get Tax Category.
@return Tax Category */
public int getC_TaxCategory_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_TaxCategory_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="25db3246-5fee-64c2-0f3e-e2d0df927cbb")
public static String es_PE_FIELD_Charge_TaxCategory_Description="Categoría del Impuesto";

@XendraTrl(Identifier="25db3246-5fee-64c2-0f3e-e2d0df927cbb")
public static String es_PE_FIELD_Charge_TaxCategory_Help="La categoría de impuesto proporciona un método de agrupación de impuestos similares. (Ej. Impuesto de ventas ó Impuesto al Valor Agregado)";

@XendraTrl(Identifier="25db3246-5fee-64c2-0f3e-e2d0df927cbb")
public static String es_PE_FIELD_Charge_TaxCategory_Name="Categoría del Impuesto";

@XendraField(AD_Column_ID="C_TaxCategory_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5bc9242d-ec03-599e-3780-864fb28c79b5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="25db3246-5fee-64c2-0f3e-e2d0df927cbb")
public static final String FIELDNAME_Charge_TaxCategory="25db3246-5fee-64c2-0f3e-e2d0df927cbb";

@XendraTrl(Identifier="17f011ce-b304-2876-6bcf-21bee2a2b452")
public static String es_PE_COLUMN_C_TaxCategory_ID_Name="Categoría del Impuesto";

@XendraColumn(AD_Element_ID="d52d1891-09d1-cd05-f9fa-46c801a8d9a6",ColumnName="C_TaxCategory_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="17f011ce-b304-2876-6bcf-21bee2a2b452",
Synchronized="2017-08-05 16:53:29.0")
/** Column name C_TaxCategory_ID */
public static final String COLUMNNAME_C_TaxCategory_ID = "C_TaxCategory_ID";
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

@XendraTrl(Identifier="a8db44b6-bced-1e45-3884-1e229f1e3d23")
public static String es_PE_FIELD_Charge_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="a8db44b6-bced-1e45-3884-1e229f1e3d23")
public static String es_PE_FIELD_Charge_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="a8db44b6-bced-1e45-3884-1e229f1e3d23")
public static String es_PE_FIELD_Charge_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="5bc9242d-ec03-599e-3780-864fb28c79b5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a8db44b6-bced-1e45-3884-1e229f1e3d23")
public static final String FIELDNAME_Charge_Description="a8db44b6-bced-1e45-3884-1e229f1e3d23";

@XendraTrl(Identifier="d4212d6a-2d04-d8f8-aa0d-e94d6aa36cac")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d4212d6a-2d04-d8f8-aa0d-e94d6aa36cac",
Synchronized="2017-08-05 16:53:29.0")
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
@XendraTrl(Identifier="63e34eda-d450-477a-91ae-afd21a61364d")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="63e34eda-d450-477a-91ae-afd21a61364d",
Synchronized="2017-08-05 16:53:29.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set IsAdvance.
@param IsAdvance IsAdvance */
public void setIsAdvance (boolean IsAdvance)
{
set_Value (COLUMNNAME_IsAdvance, Boolean.valueOf(IsAdvance));
}
/** Get IsAdvance.
@return IsAdvance */
public boolean isAdvance() 
{
Object oo = get_Value(COLUMNNAME_IsAdvance);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="4d2ddf42-3918-4bbf-9eba-539f81184770")
public static String es_PE_COLUMN_IsAdvance_Name="IsAdvance";

@XendraColumn(AD_Element_ID="8281818b-c061-770d-070d-e1e625133ca7",ColumnName="IsAdvance",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4d2ddf42-3918-4bbf-9eba-539f81184770",
Synchronized="2017-08-05 16:53:29.0")
/** Column name IsAdvance */
public static final String COLUMNNAME_IsAdvance = "IsAdvance";
/** Set Same Currency.
@param IsSameCurrency Same Currency */
public void setIsSameCurrency (boolean IsSameCurrency)
{
set_Value (COLUMNNAME_IsSameCurrency, Boolean.valueOf(IsSameCurrency));
}
/** Get Same Currency.
@return Same Currency */
public boolean isSameCurrency() 
{
Object oo = get_Value(COLUMNNAME_IsSameCurrency);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="1d37edce-93c2-3b56-2fb4-45f21d605055")
public static String es_PE_FIELD_Charge_SameCurrency_Name="Misma Moneda";

@XendraField(AD_Column_ID="IsSameCurrency",IsCentrallyMaintained=true,
AD_Tab_ID="5bc9242d-ec03-599e-3780-864fb28c79b5",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1d37edce-93c2-3b56-2fb4-45f21d605055")
public static final String FIELDNAME_Charge_SameCurrency="1d37edce-93c2-3b56-2fb4-45f21d605055";

@XendraTrl(Identifier="47f8b4bf-64e1-21bc-c390-1b62f605b930")
public static String es_PE_COLUMN_IsSameCurrency_Name="Misma Moneda";

@XendraColumn(AD_Element_ID="b2c8c181-39ce-b9ac-08c4-6325b0454cbb",ColumnName="IsSameCurrency",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="47f8b4bf-64e1-21bc-c390-1b62f605b930",
Synchronized="2017-08-05 16:53:29.0")
/** Column name IsSameCurrency */
public static final String COLUMNNAME_IsSameCurrency = "IsSameCurrency";
/** Set Same Tax.
@param IsSameTax Use the same tax as the main transaction */
public void setIsSameTax (boolean IsSameTax)
{
set_Value (COLUMNNAME_IsSameTax, Boolean.valueOf(IsSameTax));
}
/** Get Same Tax.
@return Use the same tax as the main transaction */
public boolean isSameTax() 
{
Object oo = get_Value(COLUMNNAME_IsSameTax);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="f3f4e36d-e809-f869-e93b-8c7f18415881")
public static String es_PE_FIELD_Charge_SameTax_Description="Usar el mismo impuesto que en la transacción principal";

@XendraTrl(Identifier="f3f4e36d-e809-f869-e93b-8c7f18415881")
public static String es_PE_FIELD_Charge_SameTax_Help="El cuadro de verificación Mismo Impuesto indica que este cargo debe usar el mismo impuesto que la transacción principal.";

@XendraTrl(Identifier="f3f4e36d-e809-f869-e93b-8c7f18415881")
public static String es_PE_FIELD_Charge_SameTax_Name="Mismo Impuesto";

@XendraField(AD_Column_ID="IsSameTax",IsCentrallyMaintained=true,
AD_Tab_ID="5bc9242d-ec03-599e-3780-864fb28c79b5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f3f4e36d-e809-f869-e93b-8c7f18415881")
public static final String FIELDNAME_Charge_SameTax="f3f4e36d-e809-f869-e93b-8c7f18415881";

@XendraTrl(Identifier="dedc09a5-98e7-f403-ed58-42c446598d10")
public static String es_PE_COLUMN_IsSameTax_Name="Mismo Impuesto";

@XendraColumn(AD_Element_ID="83e41113-d122-61fe-d72e-5568ff11ff13",ColumnName="IsSameTax",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="dedc09a5-98e7-f403-ed58-42c446598d10",
Synchronized="2017-08-05 16:53:29.0")
/** Column name IsSameTax */
public static final String COLUMNNAME_IsSameTax = "IsSameTax";
/** Set Price includes Tax.
@param IsTaxIncluded Tax is included in the price  */
public void setIsTaxIncluded (boolean IsTaxIncluded)
{
set_Value (COLUMNNAME_IsTaxIncluded, Boolean.valueOf(IsTaxIncluded));
}
/** Get Price includes Tax.
@return Tax is included in the price  */
public boolean isTaxIncluded() 
{
Object oo = get_Value(COLUMNNAME_IsTaxIncluded);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="7efd64bc-b96d-101b-28cd-b48fb60024da")
public static String es_PE_FIELD_Charge_PriceIncludesTax_Description="Impuesto incluido en el precio";

@XendraTrl(Identifier="7efd64bc-b96d-101b-28cd-b48fb60024da")
public static String es_PE_FIELD_Charge_PriceIncludesTax_Help="El cuadro de verificación Impuesto Incluido indica que el precio incluye impuestos. Esto es también conocido como el precio bruto";

@XendraTrl(Identifier="7efd64bc-b96d-101b-28cd-b48fb60024da")
public static String es_PE_FIELD_Charge_PriceIncludesTax_Name="Impuesto Incluido en el Precio";

@XendraField(AD_Column_ID="IsTaxIncluded",IsCentrallyMaintained=true,
AD_Tab_ID="5bc9242d-ec03-599e-3780-864fb28c79b5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=80,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7efd64bc-b96d-101b-28cd-b48fb60024da")
public static final String FIELDNAME_Charge_PriceIncludesTax="7efd64bc-b96d-101b-28cd-b48fb60024da";

@XendraTrl(Identifier="a6633536-f824-372c-c3c4-6ca7bce5ef81")
public static String es_PE_COLUMN_IsTaxIncluded_Name="Impuesto Incluido en el Precio";

@XendraColumn(AD_Element_ID="eb0a6d55-2fff-a462-20b8-744571a3fe60",ColumnName="IsTaxIncluded",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a6633536-f824-372c-c3c4-6ca7bce5ef81",
Synchronized="2017-08-05 16:53:29.0")
/** Column name IsTaxIncluded */
public static final String COLUMNNAME_IsTaxIncluded = "IsTaxIncluded";
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

@XendraTrl(Identifier="1c1331f0-ce75-151e-f935-7cc2bf6cc22f")
public static String es_PE_FIELD_Charge_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="1c1331f0-ce75-151e-f935-7cc2bf6cc22f")
public static String es_PE_FIELD_Charge_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="1c1331f0-ce75-151e-f935-7cc2bf6cc22f")
public static String es_PE_FIELD_Charge_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="5bc9242d-ec03-599e-3780-864fb28c79b5",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=30,SortNo=1,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="1c1331f0-ce75-151e-f935-7cc2bf6cc22f")
public static final String FIELDNAME_Charge_Name="1c1331f0-ce75-151e-f935-7cc2bf6cc22f";

@XendraTrl(Identifier="c393ede4-9a94-9df0-bb20-6cd6bf0f0eac")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c393ede4-9a94-9df0-bb20-6cd6bf0f0eac",
Synchronized="2017-08-05 16:53:29.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";

/** PO_GS AD_Reference=684506f6-a7aa-49ad-852c-8e6c59f303f6 */
public static final int PO_GS_AD_Reference_ID=1000071;
/** Set PO_GS.
@param PO_GS PO_GS */
public void setPO_GS (String PO_GS)
{
if (PO_GS == null || PO_GS.equals(REF_TypesOfGoodsAndServicesPurchased.GOODSRAWMATERIALSSUPPLIES) || PO_GS.equals(REF_TypesOfGoodsAndServicesPurchased.FIXEDASSETS) || PO_GS.equals(REF_TypesOfGoodsAndServicesPurchased.OTHERASSETSHELDINNO1AND2) || PO_GS.equals(REF_TypesOfGoodsAndServicesPurchased.EXPENSESEducationRecreationHealthCulturalREPRESENT) || PO_GS.equals(REF_TypesOfGoodsAndServicesPurchased.OTHEREXPENSESNOTINCLUDEDInParagraph4));
 else throw new IllegalArgumentException ("PO_GS Invalid value - " + PO_GS + " - Reference_ID=1000071 - 1 - 2 - 3 - 4 - 5");
if (PO_GS != null && PO_GS.length() > 1)
{
log.warning("Length > 1 - truncated");
PO_GS = PO_GS.substring(0,0);
}
set_Value (COLUMNNAME_PO_GS, PO_GS);
}
/** Get PO_GS.
@return PO_GS */
public String getPO_GS() 
{
return (String)get_Value(COLUMNNAME_PO_GS);
}

@XendraTrl(Identifier="7a4d59b5-cb17-4d9d-8dfd-7d979ba6a0f4")
public static String es_PE_COLUMN_PO_GS_Name="PO_GS";

@XendraColumn(AD_Element_ID="6947ca3c-f528-4ac5-8034-5745946ed6cc",ColumnName="PO_GS",
AD_Reference_ID=17,AD_Reference_Value_ID="684506f6-a7aa-49ad-852c-8e6c59f303f6",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="7a4d59b5-cb17-4d9d-8dfd-7d979ba6a0f4",Synchronized="2017-08-05 16:53:29.0")
/** Column name PO_GS */
public static final String COLUMNNAME_PO_GS = "PO_GS";
}
