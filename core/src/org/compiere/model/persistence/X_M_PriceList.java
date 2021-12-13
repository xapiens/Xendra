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
/** Generated Model for M_PriceList
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_PriceList extends PO
{
/** Standard Constructor
@param ctx context
@param M_PriceList_ID id
@param trxName transaction
*/
public X_M_PriceList (Properties ctx, int M_PriceList_ID, String trxName)
{
super (ctx, M_PriceList_ID, trxName);
/** if (M_PriceList_ID == 0)
{
setC_Currency_ID (0);
setEnforcePriceLimit (false);	
// N
setIsDefault (false);	
// N
setIsSOPriceList (false);	
// N
setIsTaxIncluded (false);	
// N
setM_PriceList_ID (0);
setName (null);
setPricePrecision (Env.ZERO);	
// 2
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_M_PriceList (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=255 */
public static int Table_ID=MTable.getTable_ID("M_PriceList");

@XendraTrl(Identifier="265536aa-f442-516a-1ab0-dbf05f43f762")
public static String es_PE_TAB_PriceList_Description="Definir Listas de Precio";

@XendraTrl(Identifier="265536aa-f442-516a-1ab0-dbf05f43f762")
public static String es_PE_TAB_PriceList_Help="Listas de precios determinan la moneda del documento así como el tratamiento de impuestos.";

@XendraTrl(Identifier="265536aa-f442-516a-1ab0-dbf05f43f762")
public static String es_PE_TAB_PriceList_Name="Lista de Precios";
@XendraTab(Name="Price List",
Description="Define Price Lists",
Help="Price lists determine currency of the document as well as tax treatment.",
AD_Window_ID="e3c55106-2db1-b535-c578-d544cd183313",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="265536aa-f442-516a-1ab0-dbf05f43f762",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_PriceList="265536aa-f442-516a-1ab0-dbf05f43f762";

@XendraTrl(Identifier="fa060b8a-ddc4-0a28-e00b-d306cf3f34ab")
public static String es_PE_TABLE_M_PriceList_Name="Lista de Precios";

@XendraTable(Name="Price List",AD_Package_ID="2809ac2d-7d43-20f8-05f0-a478f2e50204",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",
Description="Unique identifier of a Price List",Help="",TableName="M_PriceList",AccessLevel="3",
AD_Window_ID="e3c55106-2db1-b535-c578-d544cd183313",AD_Val_Rule_ID="",IsKey=1,LoadSeq=60,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.material",Identifier="fa060b8a-ddc4-0a28-e00b-d306cf3f34ab",
Synchronized="2020-11-02 17:51:31.0")
/** TableName=M_PriceList */
public static final String Table_Name="M_PriceList";


@XendraIndex(Name="m_pricelist_identifier",Identifier="f18b1caf-bffd-48c7-89ea-55681d6680a8",
Column_Names="identifier",IsUnique="false",TableIdentifier="f18b1caf-bffd-48c7-89ea-55681d6680a8",
Synchronized="2020-11-02 17:51:31.0")
public static final String INDEXNAME_m_pricelist_identifier = "f18b1caf-bffd-48c7-89ea-55681d6680a8";


@XendraIndex(Name="m_pricelist_name",Identifier="87d2fdd8-e3cd-3732-ecba-995daf5c2759",
Column_Names="ad_client_id, name",IsUnique="true",
TableIdentifier="87d2fdd8-e3cd-3732-ecba-995daf5c2759",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_m_pricelist_name = "87d2fdd8-e3cd-3732-ecba-995daf5c2759";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_PriceList");

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
    Table_ID = MTable.getTable_ID("M_PriceList");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_PriceList[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Base Pricelist.
@param BasePriceList_ID Pricelist to be used, if product not found on this pricelist */
public void setBasePriceList_ID (int BasePriceList_ID)
{
if (BasePriceList_ID <= 0) set_Value (COLUMNNAME_BasePriceList_ID, null);
 else 
set_Value (COLUMNNAME_BasePriceList_ID, Integer.valueOf(BasePriceList_ID));
}
/** Get Base Pricelist.
@return Pricelist to be used, if product not found on this pricelist */
public int getBasePriceList_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_BasePriceList_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="c11f1fb3-6fea-407a-29e1-b6bbcf3690f6")
public static String es_PE_FIELD_PriceList_BasePricelist_Name="Lista de Precio Base";

@XendraTrl(Identifier="c11f1fb3-6fea-407a-29e1-b6bbcf3690f6")
public static String es_PE_FIELD_PriceList_BasePricelist_Description="Lista de precios a ser usada; si el producto no se encontró en esta lista de precios";

@XendraTrl(Identifier="c11f1fb3-6fea-407a-29e1-b6bbcf3690f6")
public static String es_PE_FIELD_PriceList_BasePricelist_Help="La lista de precio base identifica la lista de precio predeterminado a ser usado si un producto no se encuentra en la lista de precios seleccionada.";

@XendraField(AD_Column_ID="BasePriceList_ID",IsCentrallyMaintained=true,
AD_Tab_ID="265536aa-f442-516a-1ab0-dbf05f43f762",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c11f1fb3-6fea-407a-29e1-b6bbcf3690f6")
public static final String FIELDNAME_PriceList_BasePricelist="c11f1fb3-6fea-407a-29e1-b6bbcf3690f6";

@XendraTrl(Identifier="ce2a79fe-2098-48d7-6450-409bc638d533")
public static String es_PE_COLUMN_BasePriceList_ID_Name="Lista de Precio Base";

@XendraColumn(AD_Element_ID="ca887558-0fa1-8ecb-4de2-5e1b2b713cae",ColumnName="BasePriceList_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="a20c07c8-1fb7-74c6-ec9d-66afd2d29682",
AD_Val_Rule_ID="c4d39c49-c115-f950-dd1c-74ac50b224bd",FieldLength=22,DefaultValue="",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ce2a79fe-2098-48d7-6450-409bc638d533",
Synchronized="2020-03-03 21:38:46.0")
/** Column name BasePriceList_ID */
public static final String COLUMNNAME_BasePriceList_ID = "BasePriceList_ID";
/** Set Currency.
@param C_Currency_ID The Currency for this record */
public void setC_Currency_ID (int C_Currency_ID)
{
if (C_Currency_ID < 1) throw new IllegalArgumentException ("C_Currency_ID is mandatory.");
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

@XendraTrl(Identifier="9962c439-0f22-c044-4e4c-9b3da07338ac")
public static String es_PE_FIELD_PriceList_Currency_Name="Moneda";

@XendraTrl(Identifier="9962c439-0f22-c044-4e4c-9b3da07338ac")
public static String es_PE_FIELD_PriceList_Currency_Description="Moneda para este registro";

@XendraTrl(Identifier="9962c439-0f22-c044-4e4c-9b3da07338ac")
public static String es_PE_FIELD_PriceList_Currency_Help="Indica la moneda a ser usada cuando se procese ó Informe este registro";

@XendraField(AD_Column_ID="C_Currency_ID",IsCentrallyMaintained=true,
AD_Tab_ID="265536aa-f442-516a-1ab0-dbf05f43f762",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9962c439-0f22-c044-4e4c-9b3da07338ac")
public static final String FIELDNAME_PriceList_Currency="9962c439-0f22-c044-4e4c-9b3da07338ac";

@XendraTrl(Identifier="2077717f-6019-12e9-3a6c-cf446fbd34c1")
public static String es_PE_COLUMN_C_Currency_ID_Name="Moneda";

@XendraColumn(AD_Element_ID="8daec488-bca2-50fe-f9de-abf0cba2a34a",ColumnName="C_Currency_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2077717f-6019-12e9-3a6c-cf446fbd34c1",
Synchronized="2020-03-03 21:38:46.0")
/** Column name C_Currency_ID */
public static final String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
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

@XendraTrl(Identifier="52bb5ce7-7af9-b1c3-e532-ad2ee87ff00b")
public static String es_PE_FIELD_PriceList_Description_Name="Observación";

@XendraTrl(Identifier="52bb5ce7-7af9-b1c3-e532-ad2ee87ff00b")
public static String es_PE_FIELD_PriceList_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="52bb5ce7-7af9-b1c3-e532-ad2ee87ff00b")
public static String es_PE_FIELD_PriceList_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="265536aa-f442-516a-1ab0-dbf05f43f762",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="52bb5ce7-7af9-b1c3-e532-ad2ee87ff00b")
public static final String FIELDNAME_PriceList_Description="52bb5ce7-7af9-b1c3-e532-ad2ee87ff00b";

@XendraTrl(Identifier="fa3c551e-7f83-a3dd-13bf-f09f73ca6293")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fa3c551e-7f83-a3dd-13bf-f09f73ca6293",
Synchronized="2020-03-03 21:38:46.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Enforce price limit.
@param EnforcePriceLimit Do not allow prices below the limit price */
public void setEnforcePriceLimit (boolean EnforcePriceLimit)
{
set_Value (COLUMNNAME_EnforcePriceLimit, Boolean.valueOf(EnforcePriceLimit));
}
/** Get Enforce price limit.
@return Do not allow prices below the limit price */
public boolean isEnforcePriceLimit() 
{
Object oo = get_Value(COLUMNNAME_EnforcePriceLimit);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="2c37a57e-2cad-940f-01e7-f68c70c71e17")
public static String es_PE_FIELD_PriceList_EnforcePriceLimit_Name="Precio Límite Forzado";

@XendraTrl(Identifier="2c37a57e-2cad-940f-01e7-f68c70c71e17")
public static String es_PE_FIELD_PriceList_EnforcePriceLimit_Description="No se permiten precios por debajo del precio límite.";

@XendraTrl(Identifier="2c37a57e-2cad-940f-01e7-f68c70c71e17")
public static String es_PE_FIELD_PriceList_EnforcePriceLimit_Help="El cuadro de verificación forzar límite de precio indica que los precios no pueden estar por debajo del límite de precio.";

@XendraField(AD_Column_ID="EnforcePriceLimit",IsCentrallyMaintained=true,
AD_Tab_ID="265536aa-f442-516a-1ab0-dbf05f43f762",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2c37a57e-2cad-940f-01e7-f68c70c71e17")
public static final String FIELDNAME_PriceList_EnforcePriceLimit="2c37a57e-2cad-940f-01e7-f68c70c71e17";

@XendraTrl(Identifier="f9e37a31-5199-b1ae-5ed4-0b8125ef1165")
public static String es_PE_COLUMN_EnforcePriceLimit_Name="Precio Límite Forzado";

@XendraColumn(AD_Element_ID="70b45046-c441-b7c6-4782-fddda3b8fae8",ColumnName="EnforcePriceLimit",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f9e37a31-5199-b1ae-5ed4-0b8125ef1165",
Synchronized="2020-03-03 21:38:46.0")
/** Column name EnforcePriceLimit */
public static final String COLUMNNAME_EnforcePriceLimit = "EnforcePriceLimit";
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
@XendraTrl(Identifier="b41f406b-8955-4281-af4f-82df8605ad21")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b41f406b-8955-4281-af4f-82df8605ad21",
Synchronized="2020-03-03 21:38:46.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set IsAllowCampaign.
@param IsAllowCampaign IsAllowCampaign */
public void setIsAllowCampaign (boolean IsAllowCampaign)
{
set_Value (COLUMNNAME_IsAllowCampaign, Boolean.valueOf(IsAllowCampaign));
}
/** Get IsAllowCampaign.
@return IsAllowCampaign */
public boolean isAllowCampaign() 
{
Object oo = get_Value(COLUMNNAME_IsAllowCampaign);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="df5b9c2a-1761-21bf-4249-c209678f50d1")
public static String es_PE_FIELD_PriceList_IsAllowCampaign_Name="Lista de Precios de Campaña";

@XendraField(AD_Column_ID="IsAllowCampaign",IsCentrallyMaintained=true,
AD_Tab_ID="265536aa-f442-516a-1ab0-dbf05f43f762",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="df5b9c2a-1761-21bf-4249-c209678f50d1")
public static final String FIELDNAME_PriceList_IsAllowCampaign="df5b9c2a-1761-21bf-4249-c209678f50d1";

@XendraTrl(Identifier="50709e6c-b345-59ad-7f91-d6a7fa60ca8e")
public static String es_PE_COLUMN_IsAllowCampaign_Name="isallowcampaign";

@XendraColumn(AD_Element_ID="f9e5ebb3-e456-a944-baa0-587d3aea5a61",ColumnName="IsAllowCampaign",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="50709e6c-b345-59ad-7f91-d6a7fa60ca8e",
Synchronized="2020-03-03 21:38:46.0")
/** Column name IsAllowCampaign */
public static final String COLUMNNAME_IsAllowCampaign = "IsAllowCampaign";
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

@XendraTrl(Identifier="c96ddccf-18b6-5efa-198d-58228c7a7d0d")
public static String es_PE_FIELD_PriceList_Default_Name="Predeterminado";

@XendraTrl(Identifier="c96ddccf-18b6-5efa-198d-58228c7a7d0d")
public static String es_PE_FIELD_PriceList_Default_Description="Valor Predeterminado";

@XendraTrl(Identifier="c96ddccf-18b6-5efa-198d-58228c7a7d0d")
public static String es_PE_FIELD_PriceList_Default_Help="El cuadro de verificación indica si este registro será usado como un valor predeterminado";

@XendraField(AD_Column_ID="IsDefault",IsCentrallyMaintained=true,
AD_Tab_ID="265536aa-f442-516a-1ab0-dbf05f43f762",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c96ddccf-18b6-5efa-198d-58228c7a7d0d")
public static final String FIELDNAME_PriceList_Default="c96ddccf-18b6-5efa-198d-58228c7a7d0d";

@XendraTrl(Identifier="20b18541-52ed-e445-4064-75c5e5991339")
public static String es_PE_COLUMN_IsDefault_Name="Predeterminado";

@XendraColumn(AD_Element_ID="8617f892-e113-a5fd-8715-687f792f136c",ColumnName="IsDefault",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="20b18541-52ed-e445-4064-75c5e5991339",
Synchronized="2020-03-03 21:38:46.0")
/** Column name IsDefault */
public static final String COLUMNNAME_IsDefault = "IsDefault";
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

@XendraTrl(Identifier="8ca8f9f9-e525-339f-22db-027a5e3191a7")
public static String es_PE_COLUMN_IsReadOnly_Name="Read Only";

@XendraColumn(AD_Element_ID="91b664da-9e5a-8ff7-2fef-8042ee7fb0c2",ColumnName="IsReadOnly",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="N",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8ca8f9f9-e525-339f-22db-027a5e3191a7",
Synchronized="2020-03-03 21:38:46.0")
/** Column name IsReadOnly */
public static final String COLUMNNAME_IsReadOnly = "IsReadOnly";
/** Set Sales Price list.
@param IsSOPriceList This is a Sales Price List */
public void setIsSOPriceList (boolean IsSOPriceList)
{
set_Value (COLUMNNAME_IsSOPriceList, Boolean.valueOf(IsSOPriceList));
}
/** Get Sales Price list.
@return This is a Sales Price List */
public boolean isSOPriceList() 
{
Object oo = get_Value(COLUMNNAME_IsSOPriceList);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="933a39d8-52b4-fea7-d4a3-58d1b59601d0")
public static String es_PE_FIELD_PriceList_SalesPriceList_Name="Lista de Precios de Venta";

@XendraTrl(Identifier="933a39d8-52b4-fea7-d4a3-58d1b59601d0")
public static String es_PE_FIELD_PriceList_SalesPriceList_Description="Esta es una lista de precios de venta.";

@XendraTrl(Identifier="933a39d8-52b4-fea7-d4a3-58d1b59601d0")
public static String es_PE_FIELD_PriceList_SalesPriceList_Help="El cuadro de verificación lista de precios de venta indica si esta lista de precios es usada para transacciones de ventas.";

@XendraField(AD_Column_ID="IsSOPriceList",IsCentrallyMaintained=true,
AD_Tab_ID="265536aa-f442-516a-1ab0-dbf05f43f762",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="933a39d8-52b4-fea7-d4a3-58d1b59601d0")
public static final String FIELDNAME_PriceList_SalesPriceList="933a39d8-52b4-fea7-d4a3-58d1b59601d0";

@XendraTrl(Identifier="5a85efd5-88c1-8daa-fa11-f3b2830f55b4")
public static String es_PE_COLUMN_IsSOPriceList_Name="Lista de Precios de Venta";

@XendraColumn(AD_Element_ID="831a0035-e9e9-4eae-6307-bc7f515f48dd",ColumnName="IsSOPriceList",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5a85efd5-88c1-8daa-fa11-f3b2830f55b4",
Synchronized="2020-03-03 21:38:46.0")
/** Column name IsSOPriceList */
public static final String COLUMNNAME_IsSOPriceList = "IsSOPriceList";
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

@XendraTrl(Identifier="c1c59d8e-b187-9877-b489-6144c1aa7b84")
public static String es_PE_FIELD_PriceList_PriceIncludesTax_Name="Impuesto Incluido en el Precio";

@XendraTrl(Identifier="c1c59d8e-b187-9877-b489-6144c1aa7b84")
public static String es_PE_FIELD_PriceList_PriceIncludesTax_Description="Impuesto incluido en el precio";

@XendraTrl(Identifier="c1c59d8e-b187-9877-b489-6144c1aa7b84")
public static String es_PE_FIELD_PriceList_PriceIncludesTax_Help="El cuadro de verificación Impuesto Incluido indica que el precio incluye impuestos. Esto es también conocido como el precio bruto";

@XendraField(AD_Column_ID="IsTaxIncluded",IsCentrallyMaintained=true,
AD_Tab_ID="265536aa-f442-516a-1ab0-dbf05f43f762",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c1c59d8e-b187-9877-b489-6144c1aa7b84")
public static final String FIELDNAME_PriceList_PriceIncludesTax="c1c59d8e-b187-9877-b489-6144c1aa7b84";

@XendraTrl(Identifier="6acb492d-2f49-3d2b-382f-2283758388bb")
public static String es_PE_COLUMN_IsTaxIncluded_Name="Impuesto Incluido en el Precio";

@XendraColumn(AD_Element_ID="eb0a6d55-2fff-a462-20b8-744571a3fe60",ColumnName="IsTaxIncluded",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6acb492d-2f49-3d2b-382f-2283758388bb",
Synchronized="2020-03-03 21:38:46.0")
/** Column name IsTaxIncluded */
public static final String COLUMNNAME_IsTaxIncluded = "IsTaxIncluded";
/** Set M_PriceList_ID.
@param M_PriceList_ID Unique identifier of a Price List */
public void setM_PriceList_ID (int M_PriceList_ID)
{
if (M_PriceList_ID < 1) throw new IllegalArgumentException ("M_PriceList_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_PriceList_ID, Integer.valueOf(M_PriceList_ID));
}
/** Get M_PriceList_ID.
@return Unique identifier of a Price List */
public int getM_PriceList_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_PriceList_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d3ff50ec-c9f6-ea67-4447-66955b9bc136")
public static String es_PE_FIELD_PriceList_M_PriceList_ID_Name="Lista de Precios";

@XendraTrl(Identifier="d3ff50ec-c9f6-ea67-4447-66955b9bc136")
public static String es_PE_FIELD_PriceList_M_PriceList_ID_Description="Identificador único de mi lista de precios";

@XendraTrl(Identifier="d3ff50ec-c9f6-ea67-4447-66955b9bc136")
public static String es_PE_FIELD_PriceList_M_PriceList_ID_Help="Listas de precios son usadas para determinar el precio; margen y costo de artículos comprados ó vendidos.";

@XendraField(AD_Column_ID="M_PriceList_ID",IsCentrallyMaintained=true,
AD_Tab_ID="265536aa-f442-516a-1ab0-dbf05f43f762",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d3ff50ec-c9f6-ea67-4447-66955b9bc136")
public static final String FIELDNAME_PriceList_M_PriceList_ID="d3ff50ec-c9f6-ea67-4447-66955b9bc136";
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

@XendraTrl(Identifier="7bd926e2-07d6-970b-2891-ca85b2ce634a")
public static String es_PE_FIELD_PriceList_Name_Name="Nombre";

@XendraTrl(Identifier="7bd926e2-07d6-970b-2891-ca85b2ce634a")
public static String es_PE_FIELD_PriceList_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="7bd926e2-07d6-970b-2891-ca85b2ce634a")
public static String es_PE_FIELD_PriceList_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="265536aa-f442-516a-1ab0-dbf05f43f762",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=30,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7bd926e2-07d6-970b-2891-ca85b2ce634a")
public static final String FIELDNAME_PriceList_Name="7bd926e2-07d6-970b-2891-ca85b2ce634a";

@XendraTrl(Identifier="0eb06043-75ae-5839-e371-5d3b28563641")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0eb06043-75ae-5839-e371-5d3b28563641",
Synchronized="2020-03-03 21:38:46.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Price Precision.
@param PricePrecision Precision (number of decimals) for the Price */
public void setPricePrecision (BigDecimal PricePrecision)
{
if (PricePrecision == null) throw new IllegalArgumentException ("PricePrecision is mandatory.");
set_Value (COLUMNNAME_PricePrecision, PricePrecision);
}
/** Get Price Precision.
@return Precision (number of decimals) for the Price */
public BigDecimal getPricePrecision() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PricePrecision);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="bef5af6c-783c-2a18-1a81-667c76b50a74")
public static String es_PE_FIELD_PriceList_PricePrecision_Name="Precio preciso";

@XendraTrl(Identifier="bef5af6c-783c-2a18-1a81-667c76b50a74")
public static String es_PE_FIELD_PriceList_PricePrecision_Description="Precisión (número de decimales) para el precio.";

@XendraTrl(Identifier="bef5af6c-783c-2a18-1a81-667c76b50a74")
public static String es_PE_FIELD_PriceList_PricePrecision_Help="Los precios de la lista de precios se redondean a la precisión incorporada. Esto permite tener precios debajo de la precisión actual, ej. $ 0.005. Incorpore el número de decimales ó -1 para ningún redondeo.";

@XendraField(AD_Column_ID="PricePrecision",IsCentrallyMaintained=true,
AD_Tab_ID="265536aa-f442-516a-1ab0-dbf05f43f762",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bef5af6c-783c-2a18-1a81-667c76b50a74")
public static final String FIELDNAME_PriceList_PricePrecision="bef5af6c-783c-2a18-1a81-667c76b50a74";

@XendraTrl(Identifier="596368b3-7ac9-b20c-3d9d-5e2902c6b178")
public static String es_PE_COLUMN_PricePrecision_Name="Precio preciso";

@XendraColumn(AD_Element_ID="6d85e007-1f35-43fa-d5d7-93f7a1314aa6",ColumnName="PricePrecision",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="2",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="596368b3-7ac9-b20c-3d9d-5e2902c6b178",
Synchronized="2020-03-03 21:38:46.0")
/** Column name PricePrecision */
public static final String COLUMNNAME_PricePrecision = "PricePrecision";
/** Set Rate.
@param Rate Rate or Tax or Exchange */
public void setRate (BigDecimal Rate)
{
set_Value (COLUMNNAME_Rate, Rate);
}
/** Get Rate.
@return Rate or Tax or Exchange */
public BigDecimal getRate() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Rate);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="b0a36cdd-eb1d-abca-7632-f1fe62bf175c")
public static String es_PE_FIELD_PriceList_Rate_Name="Tasa";

@XendraTrl(Identifier="b0a36cdd-eb1d-abca-7632-f1fe62bf175c")
public static String es_PE_FIELD_PriceList_Rate_Description="Tasa, impuesto ó conversión.";

@XendraTrl(Identifier="b0a36cdd-eb1d-abca-7632-f1fe62bf175c")
public static String es_PE_FIELD_PriceList_Rate_Help="La tasa indica el porcentaje a ser multiplicado por la fuente para obtener el impuesto ó el total de la conversión.";

@XendraField(AD_Column_ID="Rate",IsCentrallyMaintained=true,
AD_Tab_ID="265536aa-f442-516a-1ab0-dbf05f43f762",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b0a36cdd-eb1d-abca-7632-f1fe62bf175c")
public static final String FIELDNAME_PriceList_Rate="b0a36cdd-eb1d-abca-7632-f1fe62bf175c";

@XendraTrl(Identifier="506183a7-c3d6-51b5-cced-b6ac7d21bf0c")
public static String es_PE_COLUMN_Rate_Name="Rate";

@XendraColumn(AD_Element_ID="3eb861a4-ab06-c590-06e1-f57223b55231",ColumnName="Rate",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="506183a7-c3d6-51b5-cced-b6ac7d21bf0c",
Synchronized="2020-03-03 21:38:46.0")
/** Column name Rate */
public static final String COLUMNNAME_Rate = "Rate";
/** Set RateLimit.
@param RateLimit RateLimit */
public void setRateLimit (BigDecimal RateLimit)
{
set_Value (COLUMNNAME_RateLimit, RateLimit);
}
/** Get RateLimit.
@return RateLimit */
public BigDecimal getRateLimit() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_RateLimit);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="e2cbd476-7540-e7e9-0b48-d8050043d2b5")
public static String es_PE_FIELD_PriceList_RateLimit_Name="RateLimit";

@XendraField(AD_Column_ID="RateLimit",IsCentrallyMaintained=true,
AD_Tab_ID="265536aa-f442-516a-1ab0-dbf05f43f762",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e2cbd476-7540-e7e9-0b48-d8050043d2b5")
public static final String FIELDNAME_PriceList_RateLimit="e2cbd476-7540-e7e9-0b48-d8050043d2b5";

@XendraTrl(Identifier="c80e0ae3-4a32-bb2f-5354-1fc3bac49696")
public static String es_PE_COLUMN_RateLimit_Name="RateLimit";

@XendraColumn(AD_Element_ID="832ce328-5a73-fa55-f821-70d9d929bbaf",ColumnName="RateLimit",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c80e0ae3-4a32-bb2f-5354-1fc3bac49696",
Synchronized="2020-03-03 21:38:46.0")
/** Column name RateLimit */
public static final String COLUMNNAME_RateLimit = "RateLimit";
}
