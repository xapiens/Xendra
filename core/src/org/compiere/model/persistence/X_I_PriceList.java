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
/** Generated Model for I_PriceList
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_I_PriceList extends PO
{
/** Standard Constructor
@param ctx context
@param I_PriceList_ID id
@param trxName transaction
*/
public X_I_PriceList (Properties ctx, int I_PriceList_ID, String trxName)
{
super (ctx, I_PriceList_ID, trxName);
/** if (I_PriceList_ID == 0)
{
setEnforcePriceLimit (false);	
// N
setI_PriceList_ID (0);
setIsDefault (false);	
// N
setIsSOPriceList (false);	
// N
setIsTaxIncluded (false);	
// N
setName (null);
setValidFrom (new Timestamp(System.currentTimeMillis()));
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_I_PriceList (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000046 */
public static int Table_ID=MTable.getTable_ID("I_PriceList");

@XendraTrl(Identifier="42c6588d-b2e5-395e-40d9-0b43c3b9f9d3")
public static String es_PE_TAB_ImportPriceList_Name="Importar Lista de Precios";

@XendraTab(Name="Import Price List",Description="",Help="",
AD_Window_ID="8a45e95d-09a9-14a4-0fc9-c3a54b0fdd61",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="42c6588d-b2e5-395e-40d9-0b43c3b9f9d3",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_ImportPriceList="42c6588d-b2e5-395e-40d9-0b43c3b9f9d3";

@XendraTrl(Identifier="40da93c1-a945-23e9-400d-412735aaceeb")
public static String es_PE_TABLE_I_PriceList_Name="Import Price List";

@XendraTable(Name="Import Price List",AD_Package_ID="645f34c0-ea3a-ac63-618d-8ca49873c33b",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Import List of prices",Help="",
TableName="I_PriceList",AccessLevel="2",AD_Window_ID="8a45e95d-09a9-14a4-0fc9-c3a54b0fdd61",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.import",
Identifier="40da93c1-a945-23e9-400d-412735aaceeb",Synchronized="2020-03-03 21:38:13.0")
/** TableName=I_PriceList */
public static final String Table_Name="I_PriceList";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"I_PriceList");

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
    Table_ID = MTable.getTable_ID("I_PriceList");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_I_PriceList[").append(get_ID()).append("]");
return sb.toString();
}
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

@XendraTrl(Identifier="7470a04b-c34c-d2e4-8b9f-18197c979025")
public static String es_PE_FIELD_ImportPriceList_Currency_Name="Moneda";

@XendraTrl(Identifier="7470a04b-c34c-d2e4-8b9f-18197c979025")
public static String es_PE_FIELD_ImportPriceList_Currency_Description="Moneda para este registro";

@XendraTrl(Identifier="7470a04b-c34c-d2e4-8b9f-18197c979025")
public static String es_PE_FIELD_ImportPriceList_Currency_Help="Indica la moneda a ser usada cuando se procese ó Informe este registro";

@XendraField(AD_Column_ID="C_Currency_ID",IsCentrallyMaintained=true,
AD_Tab_ID="42c6588d-b2e5-395e-40d9-0b43c3b9f9d3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7470a04b-c34c-d2e4-8b9f-18197c979025")
public static final String FIELDNAME_ImportPriceList_Currency="7470a04b-c34c-d2e4-8b9f-18197c979025";

@XendraTrl(Identifier="589681c0-0191-4619-dc11-afc32de2bb08")
public static String es_PE_COLUMN_C_Currency_ID_Name="Moneda";

@XendraColumn(AD_Element_ID="8daec488-bca2-50fe-f9de-abf0cba2a34a",ColumnName="C_Currency_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="589681c0-0191-4619-dc11-afc32de2bb08",
Synchronized="2019-08-30 22:22:53.0")
/** Column name C_Currency_ID */
public static final String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
/** Set UOM.
@param C_UOM_ID Unit of Measure */
public void setC_UOM_ID (int C_UOM_ID)
{
if (C_UOM_ID <= 0) set_Value (COLUMNNAME_C_UOM_ID, null);
 else 
set_Value (COLUMNNAME_C_UOM_ID, Integer.valueOf(C_UOM_ID));
}
/** Get UOM.
@return Unit of Measure */
public int getC_UOM_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_UOM_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="a7a03d67-3da1-4f97-bbb0-4626916ea4e3")
public static String es_PE_FIELD_ImportPriceList_UOM_Name="UM";

@XendraTrl(Identifier="a7a03d67-3da1-4f97-bbb0-4626916ea4e3")
public static String es_PE_FIELD_ImportPriceList_UOM_Description="Unidad de Medida";

@XendraTrl(Identifier="a7a03d67-3da1-4f97-bbb0-4626916ea4e3")
public static String es_PE_FIELD_ImportPriceList_UOM_Help="La UM define una unidad de medida única no monetaria";

@XendraField(AD_Column_ID="C_UOM_ID",IsCentrallyMaintained=true,
AD_Tab_ID="42c6588d-b2e5-395e-40d9-0b43c3b9f9d3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=280,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2018-01-06 12:52:30.0",
Identifier="a7a03d67-3da1-4f97-bbb0-4626916ea4e3")
public static final String FIELDNAME_ImportPriceList_UOM="a7a03d67-3da1-4f97-bbb0-4626916ea4e3";

@XendraTrl(Identifier="ff6aed3a-273c-4ee1-b329-8b7284a79b31")
public static String es_PE_COLUMN_C_UOM_ID_Name="UOM";

@XendraColumn(AD_Element_ID="d0345019-4fcc-44c8-4fd1-e38e3b4adeed",ColumnName="C_UOM_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ff6aed3a-273c-4ee1-b329-8b7284a79b31",
Synchronized="2019-08-30 22:22:53.0")
/** Column name C_UOM_ID */
public static final String COLUMNNAME_C_UOM_ID = "C_UOM_ID";
/** Set Symbol.
@param CurSymbol Symbol of the currency (opt used for printing only) */
public void setCurSymbol (String CurSymbol)
{
if (CurSymbol != null && CurSymbol.length() > 3)
{
log.warning("Length > 3 - truncated");
CurSymbol = CurSymbol.substring(0,2);
}
set_Value (COLUMNNAME_CurSymbol, CurSymbol);
}
/** Get Symbol.
@return Symbol of the currency (opt used for printing only) */
public String getCurSymbol() 
{
return (String)get_Value(COLUMNNAME_CurSymbol);
}

@XendraTrl(Identifier="5f75bd1b-3333-f602-2ee6-f392d4c03589")
public static String es_PE_FIELD_ImportPriceList_Symbol_Name="Símbolo";

@XendraTrl(Identifier="5f75bd1b-3333-f602-2ee6-f392d4c03589")
public static String es_PE_FIELD_ImportPriceList_Symbol_Description="Símbolo de la moneda (opción usada sólo para impresión)";

@XendraTrl(Identifier="5f75bd1b-3333-f602-2ee6-f392d4c03589")
public static String es_PE_FIELD_ImportPriceList_Symbol_Help="El símbolo de moneda define el símbolo que se imprimirá cuando esta moneda se use.";

@XendraField(AD_Column_ID="CurSymbol",IsCentrallyMaintained=true,
AD_Tab_ID="42c6588d-b2e5-395e-40d9-0b43c3b9f9d3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=3,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5f75bd1b-3333-f602-2ee6-f392d4c03589")
public static final String FIELDNAME_ImportPriceList_Symbol="5f75bd1b-3333-f602-2ee6-f392d4c03589";

@XendraTrl(Identifier="31f7d5c0-89d4-789c-fd73-7137bf090e45")
public static String es_PE_COLUMN_CurSymbol_Name="Símbolo";

@XendraColumn(AD_Element_ID="a6544ce7-4bd1-7f2a-84da-823b8e61f86e",ColumnName="CurSymbol",
AD_Reference_ID=17,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=3,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="31f7d5c0-89d4-789c-fd73-7137bf090e45",
Synchronized="2019-08-30 22:22:53.0")
/** Column name CurSymbol */
public static final String COLUMNNAME_CurSymbol = "CurSymbol";
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

@XendraTrl(Identifier="3844949b-96d7-c4c7-381f-60deb43e505f")
public static String es_PE_FIELD_ImportPriceList_Description_Name="Descripción";

@XendraTrl(Identifier="3844949b-96d7-c4c7-381f-60deb43e505f")
public static String es_PE_FIELD_ImportPriceList_Description_Description="Descripción corta opcional del registro";

@XendraTrl(Identifier="3844949b-96d7-c4c7-381f-60deb43e505f")
public static String es_PE_FIELD_ImportPriceList_Description_Help="Una descripción esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="42c6588d-b2e5-395e-40d9-0b43c3b9f9d3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=255,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3844949b-96d7-c4c7-381f-60deb43e505f")
public static final String FIELDNAME_ImportPriceList_Description="3844949b-96d7-c4c7-381f-60deb43e505f";

@XendraTrl(Identifier="986038c9-64a4-535e-798c-569b404236e0")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="986038c9-64a4-535e-798c-569b404236e0",
Synchronized="2019-08-30 22:22:53.0")
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

@XendraTrl(Identifier="eaa652f2-32b2-d243-e15c-aebeeef0f65e")
public static String es_PE_FIELD_ImportPriceList_EnforcePriceLimit_Name="Precio Límite Forzado";

@XendraTrl(Identifier="eaa652f2-32b2-d243-e15c-aebeeef0f65e")
public static String es_PE_FIELD_ImportPriceList_EnforcePriceLimit_Description="No se permiten precios por debajo del precio límite.";

@XendraTrl(Identifier="eaa652f2-32b2-d243-e15c-aebeeef0f65e")
public static String es_PE_FIELD_ImportPriceList_EnforcePriceLimit_Help="El cuadro de verificación forzar límite de precio indica que los precios no pueden estar por debajo del límite de precio.";

@XendraField(AD_Column_ID="EnforcePriceLimit",IsCentrallyMaintained=true,
AD_Tab_ID="42c6588d-b2e5-395e-40d9-0b43c3b9f9d3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="eaa652f2-32b2-d243-e15c-aebeeef0f65e")
public static final String FIELDNAME_ImportPriceList_EnforcePriceLimit="eaa652f2-32b2-d243-e15c-aebeeef0f65e";

@XendraTrl(Identifier="b0c93b94-4f8b-7f02-6e36-376a127b93c7")
public static String es_PE_COLUMN_EnforcePriceLimit_Name="Precio Límite Forzado";

@XendraColumn(AD_Element_ID="70b45046-c441-b7c6-4782-fddda3b8fae8",ColumnName="EnforcePriceLimit",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b0c93b94-4f8b-7f02-6e36-376a127b93c7",
Synchronized="2019-08-30 22:22:53.0")
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
@XendraTrl(Identifier="f79faec5-d2d1-4999-aec5-1343400b4a0c")
public static String es_PE_FIELD_ImportPriceList_Identifier_Name="Identifier";

@XendraField(AD_Column_ID="Identifier",IsCentrallyMaintained=true,
AD_Tab_ID="42c6588d-b2e5-395e-40d9-0b43c3b9f9d3",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=36,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2018-01-06 12:52:31.0",
Identifier="f79faec5-d2d1-4999-aec5-1343400b4a0c")
public static final String FIELDNAME_ImportPriceList_Identifier="f79faec5-d2d1-4999-aec5-1343400b4a0c";

@XendraTrl(Identifier="adcaecf2-fac9-4461-a367-add6522b3287")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="adcaecf2-fac9-4461-a367-add6522b3287",
Synchronized="2019-08-30 22:22:53.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Import Error Message.
@param I_ErrorMsg Messages generated from import process */
public void setI_ErrorMsg (String I_ErrorMsg)
{
set_Value (COLUMNNAME_I_ErrorMsg, I_ErrorMsg);
}
/** Get Import Error Message.
@return Messages generated from import process */
public String getI_ErrorMsg() 
{
String value = (String)get_Value(COLUMNNAME_I_ErrorMsg);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="a12e9088-23ab-7085-d1fe-229d216b5dbc")
public static String es_PE_FIELD_ImportPriceList_ImportErrorMessage_Name="Mensajes de Error al Importar";

@XendraTrl(Identifier="a12e9088-23ab-7085-d1fe-229d216b5dbc")
public static String es_PE_FIELD_ImportPriceList_ImportErrorMessage_Description="Mensajes generados desde procesos de importación";

@XendraTrl(Identifier="a12e9088-23ab-7085-d1fe-229d216b5dbc")
public static String es_PE_FIELD_ImportPriceList_ImportErrorMessage_Help="El mensaje de error de Importación despliega cualquier mensaje de error generado durante el proceso de importación.";

@XendraField(AD_Column_ID="I_ErrorMsg",IsCentrallyMaintained=true,
AD_Tab_ID="42c6588d-b2e5-395e-40d9-0b43c3b9f9d3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=2000,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a12e9088-23ab-7085-d1fe-229d216b5dbc")
public static final String FIELDNAME_ImportPriceList_ImportErrorMessage="a12e9088-23ab-7085-d1fe-229d216b5dbc";

@XendraTrl(Identifier="79675052-f16c-866c-6230-27808b140de6")
public static String es_PE_COLUMN_I_ErrorMsg_Name="Mensajes de Error al Importar";

@XendraColumn(AD_Element_ID="e512e524-25c8-eddd-ad88-d2ce6b66fdc7",ColumnName="I_ErrorMsg",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="79675052-f16c-866c-6230-27808b140de6",
Synchronized="2019-08-30 22:22:53.0")
/** Column name I_ErrorMsg */
public static final String COLUMNNAME_I_ErrorMsg = "I_ErrorMsg";
/** Set Imported.
@param I_IsImported Has this import been processed */
public void setI_IsImported (boolean I_IsImported)
{
set_Value (COLUMNNAME_I_IsImported, Boolean.valueOf(I_IsImported));
}
/** Get Imported.
@return Has this import been processed */
public boolean isI_IsImported() 
{
Object oo = get_Value(COLUMNNAME_I_IsImported);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="3fafc027-3b82-cbe0-eaa8-c8f1f2f6b825")
public static String es_PE_FIELD_ImportPriceList_Imported_Name="Importar";

@XendraTrl(Identifier="3fafc027-3b82-cbe0-eaa8-c8f1f2f6b825")
public static String es_PE_FIELD_ImportPriceList_Imported_Description="Esta importación ha sido procesada";

@XendraTrl(Identifier="3fafc027-3b82-cbe0-eaa8-c8f1f2f6b825")
public static String es_PE_FIELD_ImportPriceList_Imported_Help="El cuadro de verificación Importado indica si esta importación ha sido procesada";

@XendraField(AD_Column_ID="I_IsImported",IsCentrallyMaintained=true,
AD_Tab_ID="42c6588d-b2e5-395e-40d9-0b43c3b9f9d3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=20,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3fafc027-3b82-cbe0-eaa8-c8f1f2f6b825")
public static final String FIELDNAME_ImportPriceList_Imported="3fafc027-3b82-cbe0-eaa8-c8f1f2f6b825";

@XendraTrl(Identifier="a99f75ee-14d9-3b0b-bdf1-da6b524a55ac")
public static String es_PE_COLUMN_I_IsImported_Name="Importar";

@XendraColumn(AD_Element_ID="f4939725-7d85-767d-540d-feafa759184b",ColumnName="I_IsImported",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a99f75ee-14d9-3b0b-bdf1-da6b524a55ac",
Synchronized="2019-08-30 22:22:53.0")
/** Column name I_IsImported */
public static final String COLUMNNAME_I_IsImported = "I_IsImported";
/** Set Import Price List.
@param I_PriceList_ID Import Price List */
public void setI_PriceList_ID (int I_PriceList_ID)
{
if (I_PriceList_ID < 1) throw new IllegalArgumentException ("I_PriceList_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_I_PriceList_ID, Integer.valueOf(I_PriceList_ID));
}
/** Get Import Price List.
@return Import Price List */
public int getI_PriceList_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_I_PriceList_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="3c06b119-9e9a-5186-d516-a33b6c2de664")
public static String es_PE_FIELD_ImportPriceList_ImportPriceList_Name="Importar Lista de Precios";

@XendraField(AD_Column_ID="I_PriceList_ID",IsCentrallyMaintained=true,
AD_Tab_ID="42c6588d-b2e5-395e-40d9-0b43c3b9f9d3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3c06b119-9e9a-5186-d516-a33b6c2de664")
public static final String FIELDNAME_ImportPriceList_ImportPriceList="3c06b119-9e9a-5186-d516-a33b6c2de664";
/** Column name I_PriceList_ID */
public static final String COLUMNNAME_I_PriceList_ID = "I_PriceList_ID";
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

@XendraTrl(Identifier="450aa63b-83c8-2e13-41aa-b5ce621f3d25")
public static String es_PE_FIELD_ImportPriceList_Default_Name="Predeterminado";

@XendraTrl(Identifier="450aa63b-83c8-2e13-41aa-b5ce621f3d25")
public static String es_PE_FIELD_ImportPriceList_Default_Description="Valor Predeterminado";

@XendraTrl(Identifier="450aa63b-83c8-2e13-41aa-b5ce621f3d25")
public static String es_PE_FIELD_ImportPriceList_Default_Help="El cuadro de verificación indica si este registro será usado como un valor predeterminado";

@XendraField(AD_Column_ID="IsDefault",IsCentrallyMaintained=true,
AD_Tab_ID="42c6588d-b2e5-395e-40d9-0b43c3b9f9d3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="450aa63b-83c8-2e13-41aa-b5ce621f3d25")
public static final String FIELDNAME_ImportPriceList_Default="450aa63b-83c8-2e13-41aa-b5ce621f3d25";

@XendraTrl(Identifier="8fa278b1-1ca6-e494-2493-e5a07d203e85")
public static String es_PE_COLUMN_IsDefault_Name="Predeterminado";

@XendraColumn(AD_Element_ID="8617f892-e113-a5fd-8715-687f792f136c",ColumnName="IsDefault",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8fa278b1-1ca6-e494-2493-e5a07d203e85",
Synchronized="2019-08-30 22:22:54.0")
/** Column name IsDefault */
public static final String COLUMNNAME_IsDefault = "IsDefault";
/** Set ISO Currency Code.
@param ISO_Code Three letter ISO 4217 Code of the Currency */
public void setISO_Code (String ISO_Code)
{
if (ISO_Code != null && ISO_Code.length() > 3)
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
return (String)get_Value(COLUMNNAME_ISO_Code);
}

@XendraTrl(Identifier="4ccc6d1f-5f94-394f-4f09-46016d7a92f1")
public static String es_PE_FIELD_ImportPriceList_ISOCurrencyCode_Name="Código ISO";

@XendraTrl(Identifier="4ccc6d1f-5f94-394f-4f09-46016d7a92f1")
public static String es_PE_FIELD_ImportPriceList_ISOCurrencyCode_Description="Código ISO 4217 de la moneda";

@XendraTrl(Identifier="4ccc6d1f-5f94-394f-4f09-46016d7a92f1")
public static String es_PE_FIELD_ImportPriceList_ISOCurrencyCode_Help="Para detalles ver - http://www.unece.org/trade/rec/rec09en.htm";

@XendraField(AD_Column_ID="ISO_Code",IsCentrallyMaintained=true,
AD_Tab_ID="42c6588d-b2e5-395e-40d9-0b43c3b9f9d3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=3,IsReadOnly=false,SeqNo=260,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4ccc6d1f-5f94-394f-4f09-46016d7a92f1")
public static final String FIELDNAME_ImportPriceList_ISOCurrencyCode="4ccc6d1f-5f94-394f-4f09-46016d7a92f1";

@XendraTrl(Identifier="5d2d237f-ba6c-658b-ea1a-30f4d8fe2c82")
public static String es_PE_COLUMN_ISO_Code_Name="ISO Currency Code";

@XendraColumn(AD_Element_ID="0770c1a3-36f8-0fc9-bd56-a563b64128ee",ColumnName="ISO_Code",
AD_Reference_ID=17,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=3,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5d2d237f-ba6c-658b-ea1a-30f4d8fe2c82",
Synchronized="2019-08-30 22:22:54.0")
/** Column name ISO_Code */
public static final String COLUMNNAME_ISO_Code = "ISO_Code";
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

@XendraTrl(Identifier="12cbdb9f-b143-9298-c563-3021e4f462da")
public static String es_PE_FIELD_ImportPriceList_SalesPriceList_Name="Lista de Precios de Venta";

@XendraTrl(Identifier="12cbdb9f-b143-9298-c563-3021e4f462da")
public static String es_PE_FIELD_ImportPriceList_SalesPriceList_Description="Esta es una lista de precios de venta.";

@XendraTrl(Identifier="12cbdb9f-b143-9298-c563-3021e4f462da")
public static String es_PE_FIELD_ImportPriceList_SalesPriceList_Help="El cuadro de verificación lista de precios de venta indica si esta lista de precios es usada para transacciones de ventas.";

@XendraField(AD_Column_ID="IsSOPriceList",IsCentrallyMaintained=true,
AD_Tab_ID="42c6588d-b2e5-395e-40d9-0b43c3b9f9d3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="12cbdb9f-b143-9298-c563-3021e4f462da")
public static final String FIELDNAME_ImportPriceList_SalesPriceList="12cbdb9f-b143-9298-c563-3021e4f462da";

@XendraTrl(Identifier="7aab2f3b-fcee-6061-cc0c-f04fe999694d")
public static String es_PE_COLUMN_IsSOPriceList_Name="Lista de Precios de Venta";

@XendraColumn(AD_Element_ID="831a0035-e9e9-4eae-6307-bc7f515f48dd",ColumnName="IsSOPriceList",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7aab2f3b-fcee-6061-cc0c-f04fe999694d",
Synchronized="2019-08-30 22:22:54.0")
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

@XendraTrl(Identifier="1cf81ce7-cff0-31f9-c269-b8dc91be47ad")
public static String es_PE_FIELD_ImportPriceList_PriceIncludesTax_Name="Impuesto Incluido en el Precio";

@XendraTrl(Identifier="1cf81ce7-cff0-31f9-c269-b8dc91be47ad")
public static String es_PE_FIELD_ImportPriceList_PriceIncludesTax_Description="Impuesto incluido en el precio";

@XendraTrl(Identifier="1cf81ce7-cff0-31f9-c269-b8dc91be47ad")
public static String es_PE_FIELD_ImportPriceList_PriceIncludesTax_Help="El cuadro de verificación Impuesto Incluido indica que el precio incluye impuestos. Esto es también conocido como el precio bruto";

@XendraField(AD_Column_ID="IsTaxIncluded",IsCentrallyMaintained=true,
AD_Tab_ID="42c6588d-b2e5-395e-40d9-0b43c3b9f9d3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1cf81ce7-cff0-31f9-c269-b8dc91be47ad")
public static final String FIELDNAME_ImportPriceList_PriceIncludesTax="1cf81ce7-cff0-31f9-c269-b8dc91be47ad";

@XendraTrl(Identifier="6af9c9ef-afa8-0de4-54d6-fb02d68a3e1d")
public static String es_PE_COLUMN_IsTaxIncluded_Name="Impuesto Incluido en el Precio";

@XendraColumn(AD_Element_ID="eb0a6d55-2fff-a462-20b8-744571a3fe60",ColumnName="IsTaxIncluded",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6af9c9ef-afa8-0de4-54d6-fb02d68a3e1d",
Synchronized="2019-08-30 22:22:54.0")
/** Column name IsTaxIncluded */
public static final String COLUMNNAME_IsTaxIncluded = "IsTaxIncluded";
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

@XendraTrl(Identifier="c5320c49-5b18-1632-59b6-d99179bc898d")
public static String es_PE_FIELD_ImportPriceList_M_PriceList_ID_Name="Lista de Precios";

@XendraTrl(Identifier="c5320c49-5b18-1632-59b6-d99179bc898d")
public static String es_PE_FIELD_ImportPriceList_M_PriceList_ID_Description="Identificador único de mi lista de precios";

@XendraTrl(Identifier="c5320c49-5b18-1632-59b6-d99179bc898d")
public static String es_PE_FIELD_ImportPriceList_M_PriceList_ID_Help="Listas de precios son usadas para determinar el precio; margen y costo de artículos comprados ó vendidos.";

@XendraField(AD_Column_ID="M_PriceList_ID",IsCentrallyMaintained=true,
AD_Tab_ID="42c6588d-b2e5-395e-40d9-0b43c3b9f9d3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c5320c49-5b18-1632-59b6-d99179bc898d")
public static final String FIELDNAME_ImportPriceList_M_PriceList_ID="c5320c49-5b18-1632-59b6-d99179bc898d";

@XendraTrl(Identifier="e1681035-0ad3-9a29-7755-faf448db37ab")
public static String es_PE_COLUMN_M_PriceList_ID_Name="Lista de Precios";

@XendraColumn(AD_Element_ID="652afdd3-9ff1-082d-5831-6aad828e0e09",ColumnName="M_PriceList_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e1681035-0ad3-9a29-7755-faf448db37ab",
Synchronized="2019-08-30 22:22:54.0")
/** Column name M_PriceList_ID */
public static final String COLUMNNAME_M_PriceList_ID = "M_PriceList_ID";
/** Set Base Price List.
@param M_Pricelist_Version_Base_ID Source for Price list calculations */
public void setM_Pricelist_Version_Base_ID (int M_Pricelist_Version_Base_ID)
{
if (M_Pricelist_Version_Base_ID <= 0) set_Value (COLUMNNAME_M_Pricelist_Version_Base_ID, null);
 else 
set_Value (COLUMNNAME_M_Pricelist_Version_Base_ID, Integer.valueOf(M_Pricelist_Version_Base_ID));
}
/** Get Base Price List.
@return Source for Price list calculations */
public int getM_Pricelist_Version_Base_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Pricelist_Version_Base_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="07d1da83-ec21-bc34-9e4d-a81eb64a8f36")
public static String es_PE_FIELD_ImportPriceList_BasePriceList_Name="Lista de Precios Base";

@XendraTrl(Identifier="07d1da83-ec21-bc34-9e4d-a81eb64a8f36")
public static String es_PE_FIELD_ImportPriceList_BasePriceList_Description="Fuente para el cálculo de la lista de precios.";

@XendraTrl(Identifier="07d1da83-ec21-bc34-9e4d-a81eb64a8f36")
public static String es_PE_FIELD_ImportPriceList_BasePriceList_Help="La lista de precio base identifica el precio de lista usado para calcular precios (La fuente)";

@XendraField(AD_Column_ID="M_Pricelist_Version_Base_ID",IsCentrallyMaintained=true,
AD_Tab_ID="42c6588d-b2e5-395e-40d9-0b43c3b9f9d3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=230,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="07d1da83-ec21-bc34-9e4d-a81eb64a8f36")
public static final String FIELDNAME_ImportPriceList_BasePriceList="07d1da83-ec21-bc34-9e4d-a81eb64a8f36";

@XendraTrl(Identifier="65c90b52-8895-eb54-dfca-ff9f6a9e67b8")
public static String es_PE_COLUMN_M_Pricelist_Version_Base_ID_Name="Lista de Precios Base";

@XendraColumn(AD_Element_ID="f99aa932-914a-10b6-eaf0-54fbd852e788",
ColumnName="M_Pricelist_Version_Base_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="84808698-f549-32c8-9435-3477bb7ce31c",AD_Val_Rule_ID="",FieldLength=10,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="65c90b52-8895-eb54-dfca-ff9f6a9e67b8",
Synchronized="2019-08-30 22:22:54.0")
/** Column name M_Pricelist_Version_Base_ID */
public static final String COLUMNNAME_M_Pricelist_Version_Base_ID = "M_Pricelist_Version_Base_ID";
/** Set Product.
@param M_Product_ID Product, Service, Item */
public void setM_Product_ID (int M_Product_ID)
{
if (M_Product_ID <= 0) set_Value (COLUMNNAME_M_Product_ID, null);
 else 
set_Value (COLUMNNAME_M_Product_ID, Integer.valueOf(M_Product_ID));
}
/** Get Product.
@return Product, Service, Item */
public int getM_Product_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Product_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="8057d413-0171-6c10-607b-b2627b1cc2e2")
public static String es_PE_FIELD_ImportPriceList_Product_Name="Producto";

@XendraTrl(Identifier="8057d413-0171-6c10-607b-b2627b1cc2e2")
public static String es_PE_FIELD_ImportPriceList_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="8057d413-0171-6c10-607b-b2627b1cc2e2")
public static String es_PE_FIELD_ImportPriceList_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="42c6588d-b2e5-395e-40d9-0b43c3b9f9d3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8057d413-0171-6c10-607b-b2627b1cc2e2")
public static final String FIELDNAME_ImportPriceList_Product="8057d413-0171-6c10-607b-b2627b1cc2e2";

@XendraTrl(Identifier="e7f59759-9d11-c61d-d566-161e5a53522b")
public static String es_PE_COLUMN_M_Product_ID_Name="Producto";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e7f59759-9d11-c61d-d566-161e5a53522b",
Synchronized="2019-08-30 22:22:54.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
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

@XendraTrl(Identifier="8da798e1-a20d-1d78-4bfb-9691cf75f17e")
public static String es_PE_FIELD_ImportPriceList_Name_Name="Nombre";

@XendraTrl(Identifier="8da798e1-a20d-1d78-4bfb-9691cf75f17e")
public static String es_PE_FIELD_ImportPriceList_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="8da798e1-a20d-1d78-4bfb-9691cf75f17e")
public static String es_PE_FIELD_ImportPriceList_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="42c6588d-b2e5-395e-40d9-0b43c3b9f9d3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8da798e1-a20d-1d78-4bfb-9691cf75f17e")
public static final String FIELDNAME_ImportPriceList_Name="8da798e1-a20d-1d78-4bfb-9691cf75f17e";

@XendraTrl(Identifier="a20c396c-64ba-334a-7163-f7ebe7e3452e")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a20c396c-64ba-334a-7163-f7ebe7e3452e",
Synchronized="2019-08-30 22:22:54.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Limit Price.
@param PriceLimit Lowest price for a product */
public void setPriceLimit (BigDecimal PriceLimit)
{
set_Value (COLUMNNAME_PriceLimit, PriceLimit);
}
/** Get Limit Price.
@return Lowest price for a product */
public BigDecimal getPriceLimit() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PriceLimit);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="9de2e6b0-c3d9-8f33-78c5-4e95329de8ee")
public static String es_PE_FIELD_ImportPriceList_LimitPrice_Name="Precio Límite";

@XendraTrl(Identifier="9de2e6b0-c3d9-8f33-78c5-4e95329de8ee")
public static String es_PE_FIELD_ImportPriceList_LimitPrice_Description="Precio más bajo del producto";

@XendraTrl(Identifier="9de2e6b0-c3d9-8f33-78c5-4e95329de8ee")
public static String es_PE_FIELD_ImportPriceList_LimitPrice_Help="El límite de precio indica el precio más bajo para un producto establecido en la moneda de la lista de precio.";

@XendraField(AD_Column_ID="PriceLimit",IsCentrallyMaintained=true,
AD_Tab_ID="42c6588d-b2e5-395e-40d9-0b43c3b9f9d3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=200,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9de2e6b0-c3d9-8f33-78c5-4e95329de8ee")
public static final String FIELDNAME_ImportPriceList_LimitPrice="9de2e6b0-c3d9-8f33-78c5-4e95329de8ee";

@XendraTrl(Identifier="929e02c6-af99-3b5f-801a-c685c6f813dc")
public static String es_PE_COLUMN_PriceLimit_Name="Precio Límite";

@XendraColumn(AD_Element_ID="0dbee629-4878-ced9-eafa-0f6bdfb99af4",ColumnName="PriceLimit",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="929e02c6-af99-3b5f-801a-c685c6f813dc",
Synchronized="2019-08-30 22:22:54.0")
/** Column name PriceLimit */
public static final String COLUMNNAME_PriceLimit = "PriceLimit";
/** Set List Price.
@param PriceList List Price */
public void setPriceList (BigDecimal PriceList)
{
set_Value (COLUMNNAME_PriceList, PriceList);
}
/** Get List Price.
@return List Price */
public BigDecimal getPriceList() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PriceList);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="a91bfe5f-0003-20b6-d796-58deb3cd80e1")
public static String es_PE_FIELD_ImportPriceList_ListPrice_Name="Precio de Lista";

@XendraTrl(Identifier="a91bfe5f-0003-20b6-d796-58deb3cd80e1")
public static String es_PE_FIELD_ImportPriceList_ListPrice_Description="Precio de Lista";

@XendraTrl(Identifier="a91bfe5f-0003-20b6-d796-58deb3cd80e1")
public static String es_PE_FIELD_ImportPriceList_ListPrice_Help="El Precio de lista es el precio de lista oficial en la moneda del documento";

@XendraField(AD_Column_ID="PriceList",IsCentrallyMaintained=true,
AD_Tab_ID="42c6588d-b2e5-395e-40d9-0b43c3b9f9d3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a91bfe5f-0003-20b6-d796-58deb3cd80e1")
public static final String FIELDNAME_ImportPriceList_ListPrice="a91bfe5f-0003-20b6-d796-58deb3cd80e1";

@XendraTrl(Identifier="33ff0b49-8b25-6651-a67a-974856244582")
public static String es_PE_COLUMN_PriceList_Name="Precio de Lista";

@XendraColumn(AD_Element_ID="0f6529f2-0ceb-0583-6c50-c04e6542c99b",ColumnName="PriceList",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="33ff0b49-8b25-6651-a67a-974856244582",
Synchronized="2019-08-30 22:22:54.0")
/** Column name PriceList */
public static final String COLUMNNAME_PriceList = "PriceList";
/** Set Price Precision.
@param PricePrecision Precision (number of decimals) for the Price */
public void setPricePrecision (int PricePrecision)
{
set_Value (COLUMNNAME_PricePrecision, Integer.valueOf(PricePrecision));
}
/** Get Price Precision.
@return Precision (number of decimals) for the Price */
public int getPricePrecision() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_PricePrecision);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="5b9be992-80eb-54b1-c048-bd8f9399a8e4")
public static String es_PE_FIELD_ImportPriceList_PricePrecision_Name="Precio preciso";

@XendraTrl(Identifier="5b9be992-80eb-54b1-c048-bd8f9399a8e4")
public static String es_PE_FIELD_ImportPriceList_PricePrecision_Description="Precisión (número de decimales) para el precio.";

@XendraTrl(Identifier="5b9be992-80eb-54b1-c048-bd8f9399a8e4")
public static String es_PE_FIELD_ImportPriceList_PricePrecision_Help="Los precios de la lista de precios se redondean a la precisión incorporada. Esto permite tener precios debajo de la precisión actual, ej. $ 0.005. Incorpore el número de decimales ó -1 para ningún redondeo.";

@XendraField(AD_Column_ID="PricePrecision",IsCentrallyMaintained=true,
AD_Tab_ID="42c6588d-b2e5-395e-40d9-0b43c3b9f9d3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=210,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5b9be992-80eb-54b1-c048-bd8f9399a8e4")
public static final String FIELDNAME_ImportPriceList_PricePrecision="5b9be992-80eb-54b1-c048-bd8f9399a8e4";

@XendraTrl(Identifier="14fb7f69-9151-0a9a-43b8-d3932b57048b")
public static String es_PE_COLUMN_PricePrecision_Name="Precio preciso";

@XendraColumn(AD_Element_ID="6d85e007-1f35-43fa-d5d7-93f7a1314aa6",ColumnName="PricePrecision",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="14fb7f69-9151-0a9a-43b8-d3932b57048b",
Synchronized="2019-08-30 22:22:54.0")
/** Column name PricePrecision */
public static final String COLUMNNAME_PricePrecision = "PricePrecision";
/** Set Standard Price.
@param PriceStd Standard Price */
public void setPriceStd (BigDecimal PriceStd)
{
set_Value (COLUMNNAME_PriceStd, PriceStd);
}
/** Get Standard Price.
@return Standard Price */
public BigDecimal getPriceStd() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PriceStd);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="a632b7b9-6e49-23e1-8cc3-16611f2875ac")
public static String es_PE_FIELD_ImportPriceList_StandardPrice_Name="Precio Estándar";

@XendraTrl(Identifier="a632b7b9-6e49-23e1-8cc3-16611f2875ac")
public static String es_PE_FIELD_ImportPriceList_StandardPrice_Description="Precio Estándar";

@XendraTrl(Identifier="a632b7b9-6e49-23e1-8cc3-16611f2875ac")
public static String es_PE_FIELD_ImportPriceList_StandardPrice_Help="El Precio Estándar indica el precio estándar ó normal para un producto en esta lista de precios";

@XendraField(AD_Column_ID="PriceStd",IsCentrallyMaintained=true,
AD_Tab_ID="42c6588d-b2e5-395e-40d9-0b43c3b9f9d3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=190,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a632b7b9-6e49-23e1-8cc3-16611f2875ac")
public static final String FIELDNAME_ImportPriceList_StandardPrice="a632b7b9-6e49-23e1-8cc3-16611f2875ac";

@XendraTrl(Identifier="4fb52749-fa20-4831-1929-0a2cbc2bc7fa")
public static String es_PE_COLUMN_PriceStd_Name="Precio Estándar";

@XendraColumn(AD_Element_ID="cd12259b-a52a-9102-1c72-983d6e1d5324",ColumnName="PriceStd",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4fb52749-fa20-4831-1929-0a2cbc2bc7fa",
Synchronized="2019-08-30 22:22:54.0")
/** Column name PriceStd */
public static final String COLUMNNAME_PriceStd = "PriceStd";
/** Set Processed.
@param Processed The document has been processed */
public void setProcessed (boolean Processed)
{
set_Value (COLUMNNAME_Processed, Boolean.valueOf(Processed));
}
/** Get Processed.
@return The document has been processed */
public boolean isProcessed() 
{
Object oo = get_Value(COLUMNNAME_Processed);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="245e50bf-f101-c74b-a9e7-bda2c28fa7ec")
public static String es_PE_FIELD_ImportPriceList_Processed_Name="Procesado";

@XendraTrl(Identifier="245e50bf-f101-c74b-a9e7-bda2c28fa7ec")
public static String es_PE_FIELD_ImportPriceList_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="245e50bf-f101-c74b-a9e7-bda2c28fa7ec")
public static String es_PE_FIELD_ImportPriceList_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="42c6588d-b2e5-395e-40d9-0b43c3b9f9d3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=240,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="245e50bf-f101-c74b-a9e7-bda2c28fa7ec")
public static final String FIELDNAME_ImportPriceList_Processed="245e50bf-f101-c74b-a9e7-bda2c28fa7ec";

@XendraTrl(Identifier="e4037a43-fa01-f214-a9f7-93851d4a0466")
public static String es_PE_COLUMN_Processed_Name="Procesado";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e4037a43-fa01-f214-a9f7-93851d4a0466",
Synchronized="2019-08-30 22:22:54.0")
/** Column name Processed */
public static final String COLUMNNAME_Processed = "Processed";
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

@XendraTrl(Identifier="7c3104d9-e47c-8a25-0692-57ce7338177f")
public static String es_PE_FIELD_ImportPriceList_ProcessNow_Name="Procesar Ahora";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="42c6588d-b2e5-395e-40d9-0b43c3b9f9d3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=250,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7c3104d9-e47c-8a25-0692-57ce7338177f")
public static final String FIELDNAME_ImportPriceList_ProcessNow="7c3104d9-e47c-8a25-0692-57ce7338177f";

@XendraTrl(Identifier="ef9c4471-bfe4-7e7b-8e3e-b7b9db9e05d7")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="3faef0cc-3100-8a46-6a5e-33d7c54c5f04",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="ef9c4471-bfe4-7e7b-8e3e-b7b9db9e05d7",Synchronized="2019-08-30 22:22:54.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
/** Set Product.
@param Product Product */
public void setProduct (String Product)
{
if (Product != null && Product.length() > 200)
{
log.warning("Length > 200 - truncated");
Product = Product.substring(0,199);
}
set_Value (COLUMNNAME_Product, Product);
}
/** Get Product.
@return Product */
public String getProduct() 
{
String value = (String)get_Value(COLUMNNAME_Product);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="3892c482-8002-936e-5cb7-5486c24618e5")
public static String es_PE_FIELD_ImportPriceList_Product2_Name="Producto";

@XendraField(AD_Column_ID="Product",IsCentrallyMaintained=true,
AD_Tab_ID="42c6588d-b2e5-395e-40d9-0b43c3b9f9d3",AD_FieldGroup_ID="Product",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3892c482-8002-936e-5cb7-5486c24618e5")
public static final String FIELDNAME_ImportPriceList_Product2="3892c482-8002-936e-5cb7-5486c24618e5";

@XendraTrl(Identifier="72e5d9ac-c997-a62e-8859-42763ff64b4c")
public static String es_PE_COLUMN_Product_Name="Producto";

@XendraColumn(AD_Element_ID="18372c66-d72f-51a5-c6aa-c7976b30f962",ColumnName="Product",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=200,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="72e5d9ac-c997-a62e-8859-42763ff64b4c",
Synchronized="2019-08-30 22:22:54.0")
/** Column name Product */
public static final String COLUMNNAME_Product = "Product";
/** Set Product_Value.
@param Product_Value Product_Value */
public void setProduct_Value (String Product_Value)
{
if (Product_Value != null && Product_Value.length() > 40)
{
log.warning("Length > 40 - truncated");
Product_Value = Product_Value.substring(0,39);
}
set_Value (COLUMNNAME_Product_Value, Product_Value);
}
/** Get Product_Value.
@return Product_Value */
public String getProduct_Value() 
{
String value = (String)get_Value(COLUMNNAME_Product_Value);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="ad24a66a-123f-4f4c-8aa8-2df22d8451a2")
public static String es_PE_FIELD_ImportPriceList_Product_Value_Name="product_value";

@XendraField(AD_Column_ID="Product_Value",IsCentrallyMaintained=true,
AD_Tab_ID="42c6588d-b2e5-395e-40d9-0b43c3b9f9d3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=40,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2018-01-06 12:52:31.0",
Identifier="ad24a66a-123f-4f4c-8aa8-2df22d8451a2")
public static final String FIELDNAME_ImportPriceList_Product_Value="ad24a66a-123f-4f4c-8aa8-2df22d8451a2";

@XendraTrl(Identifier="52b29fde-09f9-4cd9-baae-90467e2cf29d")
public static String es_PE_COLUMN_Product_Value_Name="product_value";

@XendraColumn(AD_Element_ID="8c2f9e70-4ad7-40ae-9131-91c463a543cc",ColumnName="Product_Value",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="52b29fde-09f9-4cd9-baae-90467e2cf29d",
Synchronized="2019-08-30 22:22:54.0")
/** Column name Product_Value */
public static final String COLUMNNAME_Product_Value = "Product_Value";
/** Set Symbol.
@param UOMSymbol Symbol for a Unit of Measure */
public void setUOMSymbol (String UOMSymbol)
{
if (UOMSymbol != null && UOMSymbol.length() > 10)
{
log.warning("Length > 10 - truncated");
UOMSymbol = UOMSymbol.substring(0,9);
}
set_Value (COLUMNNAME_UOMSymbol, UOMSymbol);
}
/** Get Symbol.
@return Symbol for a Unit of Measure */
public String getUOMSymbol() 
{
String value = (String)get_Value(COLUMNNAME_UOMSymbol);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="19e67426-6254-4ba1-a792-d2d59fa65887")
public static String es_PE_FIELD_ImportPriceList_Symbol2_Name="Símbolo";

@XendraTrl(Identifier="19e67426-6254-4ba1-a792-d2d59fa65887")
public static String es_PE_FIELD_ImportPriceList_Symbol2_Description="Símbolo para una unidad de medida";

@XendraTrl(Identifier="19e67426-6254-4ba1-a792-d2d59fa65887")
public static String es_PE_FIELD_ImportPriceList_Symbol2_Help="El símbolo identifica el simbolo ha ser desplegado e impreso para una unidad de medida";

@XendraField(AD_Column_ID="UOMSymbol",IsCentrallyMaintained=true,
AD_Tab_ID="42c6588d-b2e5-395e-40d9-0b43c3b9f9d3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=270,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2018-01-06 12:52:31.0",
Identifier="19e67426-6254-4ba1-a792-d2d59fa65887")
public static final String FIELDNAME_ImportPriceList_Symbol2="19e67426-6254-4ba1-a792-d2d59fa65887";

@XendraTrl(Identifier="0410efd9-b4bc-4de1-bcfc-70013c106bdc")
public static String es_PE_COLUMN_UOMSymbol_Name="Symbol";

@XendraColumn(AD_Element_ID="ccb82b4f-2e57-da9a-16a8-8fd48d94adf5",ColumnName="UOMSymbol",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0410efd9-b4bc-4de1-bcfc-70013c106bdc",
Synchronized="2019-08-30 22:22:54.0")
/** Column name UOMSymbol */
public static final String COLUMNNAME_UOMSymbol = "UOMSymbol";
/** Set Valid from.
@param ValidFrom Valid from including this date (first day) */
public void setValidFrom (Timestamp ValidFrom)
{
if (ValidFrom == null) throw new IllegalArgumentException ("ValidFrom is mandatory.");
set_Value (COLUMNNAME_ValidFrom, ValidFrom);
}
/** Get Valid from.
@return Valid from including this date (first day) */
public Timestamp getValidFrom() 
{
return (Timestamp)get_Value(COLUMNNAME_ValidFrom);
}

@XendraTrl(Identifier="15e80125-d053-f917-d0a6-5510dd7ed8d1")
public static String es_PE_FIELD_ImportPriceList_ValidFrom_Name="Válido Desde";

@XendraTrl(Identifier="15e80125-d053-f917-d0a6-5510dd7ed8d1")
public static String es_PE_FIELD_ImportPriceList_ValidFrom_Description="Válido desde; incluyendo esta fecha (primer día)";

@XendraTrl(Identifier="15e80125-d053-f917-d0a6-5510dd7ed8d1")
public static String es_PE_FIELD_ImportPriceList_ValidFrom_Help="La fecha válida desde indica el primer día de un rango de fechas";

@XendraField(AD_Column_ID="ValidFrom",IsCentrallyMaintained=true,
AD_Tab_ID="42c6588d-b2e5-395e-40d9-0b43c3b9f9d3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=220,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="15e80125-d053-f917-d0a6-5510dd7ed8d1")
public static final String FIELDNAME_ImportPriceList_ValidFrom="15e80125-d053-f917-d0a6-5510dd7ed8d1";

@XendraTrl(Identifier="19bc07f7-716d-3a94-a53b-a0eb6386d6fa")
public static String es_PE_COLUMN_ValidFrom_Name="Válido Desde";

@XendraColumn(AD_Element_ID="86b1171a-a6c6-0da5-1aea-3f3106450d07",ColumnName="ValidFrom",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="19bc07f7-716d-3a94-a53b-a0eb6386d6fa",
Synchronized="2019-08-30 22:22:54.0")
/** Column name ValidFrom */
public static final String COLUMNNAME_ValidFrom = "ValidFrom";
}
