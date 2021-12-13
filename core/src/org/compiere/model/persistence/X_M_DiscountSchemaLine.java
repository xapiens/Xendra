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
/** Generated Model for M_DiscountSchemaLine
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_DiscountSchemaLine extends PO
{
/** Standard Constructor
@param ctx context
@param M_DiscountSchemaLine_ID id
@param trxName transaction
*/
public X_M_DiscountSchemaLine (Properties ctx, int M_DiscountSchemaLine_ID, String trxName)
{
super (ctx, M_DiscountSchemaLine_ID, trxName);
/** if (M_DiscountSchemaLine_ID == 0)
{
setC_ConversionType_ID (0);
setConversionDate (new Timestamp(System.currentTimeMillis()));	
// @#Date@
setLimit_AddAmt (Env.ZERO);	
// 0
setLimit_Base (null);	
// X
setLimit_Discount (Env.ZERO);
setLimit_MaxAmt (Env.ZERO);	
// 0
setLimit_MinAmt (Env.ZERO);	
// 0
setLimit_Rounding (null);	
// C
setList_AddAmt (Env.ZERO);	
// 0
setList_Base (null);	
// L
setList_Discount (Env.ZERO);
setList_MaxAmt (Env.ZERO);	
// 0
setList_MinAmt (Env.ZERO);	
// 0
setList_Rounding (null);	
// C
setM_DiscountSchema_ID (0);
setM_DiscountSchemaLine_ID (0);
setSeqNo (0);	
// @SQL=SELECT COALESCE(MAX(SeqNo),0)+10 AS DefaultValue FROM M_DiscountSchemaLine WHERE M_DiscountSchema_ID=@M_DiscountSchema_ID@
setStd_AddAmt (Env.ZERO);	
// 0
setStd_Base (null);	
// S
setStd_Discount (Env.ZERO);
setStd_MaxAmt (Env.ZERO);	
// 0
setStd_MinAmt (Env.ZERO);	
// 0
setStd_Rounding (null);	
// C
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_M_DiscountSchemaLine (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=477 */
public static int Table_ID=MTable.getTable_ID("M_DiscountSchemaLine");

@XendraTrl(Identifier="4e66f585-12c6-2542-4550-239e19cd2fb5")
public static String es_PE_TAB_SchemaLine_Description="Trade Discount Price List Lines";

@XendraTrl(Identifier="4e66f585-12c6-2542-4550-239e19cd2fb5")
public static String es_PE_TAB_SchemaLine_Help="Pricelists are created based on Product Purchase and Category Discounts.The parameters listed here allow to copy and calculate pricelists.<BR>The calculation:<UL><LI>Copy and convert price from referenced price list<LI>result plus Surcharge Amount<LI>result minus Discount<LI>if resulting price is less than the original limit price plus min Margin, use this price (only if Margin is not zero)<LI>if resulting price is more than the original limit price plus max Margin, use this price (only if Margin us not zero)<LI>Round resulting price</UL><B>The Formula</B> is<BR>NewPrice = (Convert(BasePrice) + Surcharge) * (100-Discount) / 100;<BR>if MinMargin <> 0 then NewPrice = Max (NewPrice, Convert(OrigLimitPrice) + MinMargin);<BR>if MaxMargin <> 0 then NewPrice = Min (NewPrice, Convert(OrigLimitPrice) + MaxMargin);<BR> <BR><B>Example:</B> (assuming same currency)<BR>Original Prices:  List=300, Standard=250, Limit=200;<BR>New List Price: Base=List, Surcharge=0, Discount=0, Round";

@XendraTrl(Identifier="4e66f585-12c6-2542-4550-239e19cd2fb5")
public static String es_PE_TAB_SchemaLine_Name="Linea del Esquema";
@XendraTab(Name="Schema Line",
Description="Trade Discount Price List Lines",
Help="Pricelists are created based on Product Purchase and Category Discounts. The parameters listed here allow to copy and calculate pricelists.<BR> The calculation: <UL> <LI>Copy and convert price from referenced price list <LI>result plus Surcharge Amount <LI>result minus Discount <LI>if resulting price is less than the original limit price plus min Margin, use this price (only if Margin is not zero) <LI>if resulting price is more than the original limit price plus max Margin, use this price (only if Margin us not zero) <LI>Round resulting price </UL> <B>The Formula</B> is<BR> NewPrice = (Convert(BasePrice) + Surcharge) * (100-Discount) / 100:<BR> if MinMargin <> 0 then NewPrice = Max (NewPrice, Convert(OrigLimitPrice) + MinMargin):<BR> if MaxMargin <> 0 then NewPrice = Min (NewPrice, Convert(OrigLimitPrice) + MaxMargin):<BR>  <BR> <B>Example:</B> (assuming same currency)<BR> Original Prices:  List=300, Standard=250, Limit=200:<BR> New List Price: Base=List, Surcharge=0, Discount=0, Round",
AD_Window_ID="0c3a375c-192b-bfce-6181-3cb6aea1c8f1",SeqNo=20,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="4e66f585-12c6-2542-4550-239e19cd2fb5",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_SchemaLine="4e66f585-12c6-2542-4550-239e19cd2fb5";

@XendraTrl(Identifier="f8baee20-586c-971c-aeef-98ce91a584ef")
public static String es_PE_TABLE_M_DiscountSchemaLine_Name="Lista de Precio con descuento";


@XendraTable(Name="Discount Pricelist",AD_Package_ID="2809ac2d-7d43-20f8-05f0-a478f2e50204",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",
Description="Line of the pricelist trade discount schema",Help="",TableName="M_DiscountSchemaLine",
AccessLevel="3",AD_Window_ID="0c3a375c-192b-bfce-6181-3cb6aea1c8f1",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.material",
Identifier="f8baee20-586c-971c-aeef-98ce91a584ef",Synchronized="2020-03-03 21:38:21.0")
/** TableName=M_DiscountSchemaLine */
public static final String Table_Name="M_DiscountSchemaLine";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_DiscountSchemaLine");

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
    Table_ID = MTable.getTable_ID("M_DiscountSchemaLine");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_DiscountSchemaLine[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="272cb068-b6a2-24ca-602b-6934710a06f5")
public static String es_PE_FIELD_SchemaLine_BusinessPartner_Name="Socio de Negocio";

@XendraTrl(Identifier="272cb068-b6a2-24ca-602b-6934710a06f5")
public static String es_PE_FIELD_SchemaLine_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="272cb068-b6a2-24ca-602b-6934710a06f5")
public static String es_PE_FIELD_SchemaLine_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="4e66f585-12c6-2542-4550-239e19cd2fb5",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="@DiscountType@=P",DisplayLength=26,IsReadOnly=false,SeqNo=90,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="272cb068-b6a2-24ca-602b-6934710a06f5")
public static final String FIELDNAME_SchemaLine_BusinessPartner="272cb068-b6a2-24ca-602b-6934710a06f5";

@XendraTrl(Identifier="85d06f21-5a21-bc5a-5dc3-9d9759f7a99a")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Socio de Negocio";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="06fdbbe9-e1c4-3ee4-4a9d-73d1a990cc42",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=true,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="85d06f21-5a21-bc5a-5dc3-9d9759f7a99a",Synchronized="2019-08-30 22:23:02.0")
/** Column name C_BPartner_ID */
public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
/** Set Currency Type.
@param C_ConversionType_ID Currency Conversion Rate Type */
public void setC_ConversionType_ID (int C_ConversionType_ID)
{
if (C_ConversionType_ID < 1) throw new IllegalArgumentException ("C_ConversionType_ID is mandatory.");
set_Value (COLUMNNAME_C_ConversionType_ID, Integer.valueOf(C_ConversionType_ID));
}
/** Get Currency Type.
@return Currency Conversion Rate Type */
public int getC_ConversionType_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_ConversionType_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d7636057-3706-9515-9913-d0728d6af660")
public static String es_PE_FIELD_SchemaLine_CurrencyType_Name="Tipo de Moneda";

@XendraTrl(Identifier="d7636057-3706-9515-9913-d0728d6af660")
public static String es_PE_FIELD_SchemaLine_CurrencyType_Description="Tipo de índice de conversión de moneda ";

@XendraTrl(Identifier="d7636057-3706-9515-9913-d0728d6af660")
public static String es_PE_FIELD_SchemaLine_CurrencyType_Help="El tipo del índice de conversión de monedas le deja definir diversos tipos de tarifas, tarifas ej. del punto, corporativas y/o de Ventas/Compras.";

@XendraField(AD_Column_ID="C_ConversionType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="4e66f585-12c6-2542-4550-239e19cd2fb5",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="@DiscountType@=P",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="d7636057-3706-9515-9913-d0728d6af660")
public static final String FIELDNAME_SchemaLine_CurrencyType="d7636057-3706-9515-9913-d0728d6af660";

@XendraTrl(Identifier="63799fa4-c962-c410-0e48-a42a5c04c679")
public static String es_PE_COLUMN_C_ConversionType_ID_Name="Tipo de Moneda";

@XendraColumn(AD_Element_ID="66f5d039-c94d-0957-487b-eb3118bd7719",
ColumnName="C_ConversionType_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="63799fa4-c962-c410-0e48-a42a5c04c679",Synchronized="2019-08-30 22:23:02.0")
/** Column name C_ConversionType_ID */
public static final String COLUMNNAME_C_ConversionType_ID = "C_ConversionType_ID";
/** Set Conversion Date.
@param ConversionDate Date for selecting conversion rate */
public void setConversionDate (Timestamp ConversionDate)
{
if (ConversionDate == null) throw new IllegalArgumentException ("ConversionDate is mandatory.");
set_Value (COLUMNNAME_ConversionDate, ConversionDate);
}
/** Get Conversion Date.
@return Date for selecting conversion rate */
public Timestamp getConversionDate() 
{
return (Timestamp)get_Value(COLUMNNAME_ConversionDate);
}

@XendraTrl(Identifier="4407529b-3d6c-9761-e692-40621c3707b7")
public static String es_PE_FIELD_SchemaLine_ConversionDate_Name="Fecha de Conversión";

@XendraTrl(Identifier="4407529b-3d6c-9761-e692-40621c3707b7")
public static String es_PE_FIELD_SchemaLine_ConversionDate_Description="Fecha para seleccionar la tasa de conversión";

@XendraTrl(Identifier="4407529b-3d6c-9761-e692-40621c3707b7")
public static String es_PE_FIELD_SchemaLine_ConversionDate_Help="La fecha de conversión identifica la fecha usada para conversión de moneda. La tasa de conversión seleccionada debe estar incluida en ella.";

@XendraField(AD_Column_ID="ConversionDate",IsCentrallyMaintained=true,
AD_Tab_ID="4e66f585-12c6-2542-4550-239e19cd2fb5",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="@DiscountType@=P",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="4407529b-3d6c-9761-e692-40621c3707b7")
public static final String FIELDNAME_SchemaLine_ConversionDate="4407529b-3d6c-9761-e692-40621c3707b7";

@XendraTrl(Identifier="dfead55a-f3a9-4d9c-5e73-d8c1f0814cbf")
public static String es_PE_COLUMN_ConversionDate_Name="Fecha de Conversión";

@XendraColumn(AD_Element_ID="ffd4046d-2b65-d80f-0af5-794d7c280a48",ColumnName="ConversionDate",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="@#Date@",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="dfead55a-f3a9-4d9c-5e73-d8c1f0814cbf",
Synchronized="2019-08-30 22:23:02.0")
/** Column name ConversionDate */
public static final String COLUMNNAME_ConversionDate = "ConversionDate";
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
@XendraTrl(Identifier="f4119297-1104-4e3a-893c-52d2eebb4505")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f4119297-1104-4e3a-893c-52d2eebb4505",
Synchronized="2019-08-30 22:23:02.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Limit price Surcharge Amount.
@param Limit_AddAmt Amount added to the converted/copied price before multiplying */
public void setLimit_AddAmt (BigDecimal Limit_AddAmt)
{
if (Limit_AddAmt == null) throw new IllegalArgumentException ("Limit_AddAmt is mandatory.");
set_Value (COLUMNNAME_Limit_AddAmt, Limit_AddAmt);
}
/** Get Limit price Surcharge Amount.
@return Amount added to the converted/copied price before multiplying */
public BigDecimal getLimit_AddAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Limit_AddAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="365e88d5-4534-222b-bc90-8045151481bc")
public static String es_PE_FIELD_SchemaLine_LimitPriceSurchargeAmount_Name="Total de Sobreprecio al Precio  Límite";

@XendraTrl(Identifier="365e88d5-4534-222b-bc90-8045151481bc")
public static String es_PE_FIELD_SchemaLine_LimitPriceSurchargeAmount_Description="Total adicionado al precio convertido / copiado antes de multiplicarlo";

@XendraTrl(Identifier="365e88d5-4534-222b-bc90-8045151481bc")
public static String es_PE_FIELD_SchemaLine_LimitPriceSurchargeAmount_Help="Indica el Total a ser adicionado al precio límite anterior a la multiplicación";

@XendraField(AD_Column_ID="Limit_AddAmt",IsCentrallyMaintained=true,
AD_Tab_ID="4e66f585-12c6-2542-4550-239e19cd2fb5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@DiscountType@=P & @Limit_Base@!F",DisplayLength=26,IsReadOnly=false,SeqNo=280,
SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="365e88d5-4534-222b-bc90-8045151481bc")
public static final String FIELDNAME_SchemaLine_LimitPriceSurchargeAmount="365e88d5-4534-222b-bc90-8045151481bc";

@XendraTrl(Identifier="b2f05d64-5863-d24a-ae63-16ce7d16e50f")
public static String es_PE_COLUMN_Limit_AddAmt_Name="Total de Sobreprecio al Precio  Límite";

@XendraColumn(AD_Element_ID="aac417e9-bc29-6e67-30c2-8761bdb2bf2e",ColumnName="Limit_AddAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b2f05d64-5863-d24a-ae63-16ce7d16e50f",
Synchronized="2019-08-30 22:23:02.0")
/** Column name Limit_AddAmt */
public static final String COLUMNNAME_Limit_AddAmt = "Limit_AddAmt";
/** Set Limit price Base.
@param Limit_Base Base price for calculation of the new price */
public void setLimit_Base (String Limit_Base)
{
if (Limit_Base.length() > 1)
{
log.warning("Length > 1 - truncated");
Limit_Base = Limit_Base.substring(0,0);
}
set_Value (COLUMNNAME_Limit_Base, Limit_Base);
}
/** Get Limit price Base.
@return Base price for calculation of the new price */
public String getLimit_Base() 
{
return (String)get_Value(COLUMNNAME_Limit_Base);
}

@XendraTrl(Identifier="db308584-1940-4938-862c-d46dc7d63182")
public static String es_PE_FIELD_SchemaLine_LimitPriceBase_Name="Base para Precio Límite";

@XendraTrl(Identifier="db308584-1940-4938-862c-d46dc7d63182")
public static String es_PE_FIELD_SchemaLine_LimitPriceBase_Description="Precio Base para el cálculo del nuevo precio";

@XendraTrl(Identifier="db308584-1940-4938-862c-d46dc7d63182")
public static String es_PE_FIELD_SchemaLine_LimitPriceBase_Help="Identifica el precio a ser usado como la base para calcular una nueva lista de precios";

@XendraField(AD_Column_ID="Limit_Base",IsCentrallyMaintained=true,
AD_Tab_ID="4e66f585-12c6-2542-4550-239e19cd2fb5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@DiscountType@=P",DisplayLength=14,IsReadOnly=false,SeqNo=260,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="db308584-1940-4938-862c-d46dc7d63182")
public static final String FIELDNAME_SchemaLine_LimitPriceBase="db308584-1940-4938-862c-d46dc7d63182";

@XendraTrl(Identifier="4f290079-434d-c39b-2356-d52068ea05ce")
public static String es_PE_COLUMN_Limit_Base_Name="Base para Precio Límite";

@XendraColumn(AD_Element_ID="baaba796-9b22-6b66-05e0-ec7a7e177395",ColumnName="Limit_Base",
AD_Reference_ID=17,AD_Reference_Value_ID="ce63bdf9-c16c-fe89-c2f4-def7e55d7c68",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="X",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="4f290079-434d-c39b-2356-d52068ea05ce",Synchronized="2019-08-30 22:23:02.0")
/** Column name Limit_Base */
public static final String COLUMNNAME_Limit_Base = "Limit_Base";
/** Set Limit price Discount %.
@param Limit_Discount Discount in percent to be subtracted from base, if negative it will be added to base price */
public void setLimit_Discount (BigDecimal Limit_Discount)
{
if (Limit_Discount == null) throw new IllegalArgumentException ("Limit_Discount is mandatory.");
set_Value (COLUMNNAME_Limit_Discount, Limit_Discount);
}
/** Get Limit price Discount %.
@return Discount in percent to be subtracted from base, if negative it will be added to base price */
public BigDecimal getLimit_Discount() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Limit_Discount);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="a1330090-3077-b567-4fad-1b242d899155")
public static String es_PE_FIELD_SchemaLine_LimitPriceDiscount_Name="%  Descuento Sobre Precio Límite";

@XendraTrl(Identifier="a1330090-3077-b567-4fad-1b242d899155")
public static String es_PE_FIELD_SchemaLine_LimitPriceDiscount_Description="Descuento en porcentaje a ser restado del precio base; si es negativo será adicionado al precio base";

@XendraTrl(Identifier="a1330090-3077-b567-4fad-1b242d899155")
public static String es_PE_FIELD_SchemaLine_LimitPriceDiscount_Help="Indica el descuento en porcentaje a ser restado del precio base; si es negativo será añadido al precio base";

@XendraField(AD_Column_ID="Limit_Discount",IsCentrallyMaintained=true,
AD_Tab_ID="4e66f585-12c6-2542-4550-239e19cd2fb5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@DiscountType@=P & @Limit_Base@!F",DisplayLength=26,IsReadOnly=false,SeqNo=300,
SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="a1330090-3077-b567-4fad-1b242d899155")
public static final String FIELDNAME_SchemaLine_LimitPriceDiscount="a1330090-3077-b567-4fad-1b242d899155";

@XendraTrl(Identifier="0d6b836e-dc67-aa25-e7d6-14d8f9157a04")
public static String es_PE_COLUMN_Limit_Discount_Name="%  Descuento Sobre Precio Límite";

@XendraColumn(AD_Element_ID="b715d8dc-11f0-48e1-65e3-f08d1cbc4769",ColumnName="Limit_Discount",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0d6b836e-dc67-aa25-e7d6-14d8f9157a04",
Synchronized="2019-08-30 22:23:03.0")
/** Column name Limit_Discount */
public static final String COLUMNNAME_Limit_Discount = "Limit_Discount";
/** Set Fixed Limit Price.
@param Limit_Fixed Fixed Limit Price (not calculated) */
public void setLimit_Fixed (BigDecimal Limit_Fixed)
{
set_Value (COLUMNNAME_Limit_Fixed, Limit_Fixed);
}
/** Get Fixed Limit Price.
@return Fixed Limit Price (not calculated) */
public BigDecimal getLimit_Fixed() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Limit_Fixed);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="b08bf81e-1c7d-8081-e643-6f97f563b4c3")
public static String es_PE_FIELD_SchemaLine_FixedLimitPrice_Name="Fijar Limite de Precio";

@XendraTrl(Identifier="b08bf81e-1c7d-8081-e643-6f97f563b4c3")
public static String es_PE_FIELD_SchemaLine_FixedLimitPrice_Description="Precio límite fijado (No calculado)";

@XendraField(AD_Column_ID="Limit_Fixed",IsCentrallyMaintained=true,
AD_Tab_ID="4e66f585-12c6-2542-4550-239e19cd2fb5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@DiscountType@=P & @Limit_Base@=F",DisplayLength=26,IsReadOnly=false,SeqNo=320,
SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="b08bf81e-1c7d-8081-e643-6f97f563b4c3")
public static final String FIELDNAME_SchemaLine_FixedLimitPrice="b08bf81e-1c7d-8081-e643-6f97f563b4c3";

@XendraTrl(Identifier="199cc72d-7535-f8d8-7c6e-57f1ec9133cf")
public static String es_PE_COLUMN_Limit_Fixed_Name="Fijar Limite de Precio";

@XendraColumn(AD_Element_ID="ce19d8dc-e727-abac-a795-3e9ee9d15a86",ColumnName="Limit_Fixed",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="199cc72d-7535-f8d8-7c6e-57f1ec9133cf",
Synchronized="2019-08-30 22:23:03.0")
/** Column name Limit_Fixed */
public static final String COLUMNNAME_Limit_Fixed = "Limit_Fixed";
/** Set Limit price max Margin.
@param Limit_MaxAmt Maximum difference to original limit price: ignored if zero */
public void setLimit_MaxAmt (BigDecimal Limit_MaxAmt)
{
if (Limit_MaxAmt == null) throw new IllegalArgumentException ("Limit_MaxAmt is mandatory.");
set_Value (COLUMNNAME_Limit_MaxAmt, Limit_MaxAmt);
}
/** Get Limit price max Margin.
@return Maximum difference to original limit price: ignored if zero */
public BigDecimal getLimit_MaxAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Limit_MaxAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="24de6076-ea79-3964-d6ad-c405a5ad4e9c")
public static String es_PE_FIELD_SchemaLine_LimitPriceMaxMargin_Name="Margen Máximo del Precio Límite";

@XendraTrl(Identifier="24de6076-ea79-3964-d6ad-c405a5ad4e9c")
public static String es_PE_FIELD_SchemaLine_LimitPriceMaxMargin_Description="Diferencia máxima al precio límite original; se ignora si es cero";

@XendraTrl(Identifier="24de6076-ea79-3964-d6ad-c405a5ad4e9c")
public static String es_PE_FIELD_SchemaLine_LimitPriceMaxMargin_Help="Identifica el margen máximo para un producto. El margen se calcula restando el precio límite original del nuevo precio calculado. Si este campo contiene 0.00 entonces es ignorado";

@XendraField(AD_Column_ID="Limit_MaxAmt",IsCentrallyMaintained=true,
AD_Tab_ID="4e66f585-12c6-2542-4550-239e19cd2fb5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@DiscountType@=P & @Limit_Base@!F",DisplayLength=26,IsReadOnly=false,SeqNo=290,
SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="24de6076-ea79-3964-d6ad-c405a5ad4e9c")
public static final String FIELDNAME_SchemaLine_LimitPriceMaxMargin="24de6076-ea79-3964-d6ad-c405a5ad4e9c";

@XendraTrl(Identifier="fb5d5cd9-e344-7451-1bf6-ef3fd11c3ed5")
public static String es_PE_COLUMN_Limit_MaxAmt_Name="Margen Máximo del Precio Límite";

@XendraColumn(AD_Element_ID="f3334c83-1b03-a761-7734-62f641f7254b",ColumnName="Limit_MaxAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fb5d5cd9-e344-7451-1bf6-ef3fd11c3ed5",
Synchronized="2019-08-30 22:23:03.0")
/** Column name Limit_MaxAmt */
public static final String COLUMNNAME_Limit_MaxAmt = "Limit_MaxAmt";
/** Set Limit price min Margin.
@param Limit_MinAmt Minimum difference to original limit price: ignored if zero */
public void setLimit_MinAmt (BigDecimal Limit_MinAmt)
{
if (Limit_MinAmt == null) throw new IllegalArgumentException ("Limit_MinAmt is mandatory.");
set_Value (COLUMNNAME_Limit_MinAmt, Limit_MinAmt);
}
/** Get Limit price min Margin.
@return Minimum difference to original limit price: ignored if zero */
public BigDecimal getLimit_MinAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Limit_MinAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="33962101-b6c7-3a06-2852-54a7ced9a62a")
public static String es_PE_FIELD_SchemaLine_LimitPriceMinMargin_Name="Margen Mínimo del Precio Límite";

@XendraTrl(Identifier="33962101-b6c7-3a06-2852-54a7ced9a62a")
public static String es_PE_FIELD_SchemaLine_LimitPriceMinMargin_Description="Diferencia mínima al precio límite original; se ignora si es cero.";

@XendraTrl(Identifier="33962101-b6c7-3a06-2852-54a7ced9a62a")
public static String es_PE_FIELD_SchemaLine_LimitPriceMinMargin_Help="Identifica el margen mínimo para un producto. El margen se calcula restando el precio límite original del nuevo precio calculado. Si este campo contiene 0.00 entonces es ignorado.";

@XendraField(AD_Column_ID="Limit_MinAmt",IsCentrallyMaintained=true,
AD_Tab_ID="4e66f585-12c6-2542-4550-239e19cd2fb5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@DiscountType@=P & @Limit_Base@!F",DisplayLength=26,IsReadOnly=false,SeqNo=270,
SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="33962101-b6c7-3a06-2852-54a7ced9a62a")
public static final String FIELDNAME_SchemaLine_LimitPriceMinMargin="33962101-b6c7-3a06-2852-54a7ced9a62a";

@XendraTrl(Identifier="87ffe633-9a42-8c01-aafd-90970d8833de")
public static String es_PE_COLUMN_Limit_MinAmt_Name="Margen Mínimo del Precio Límite";

@XendraColumn(AD_Element_ID="bf439f6f-af65-a0d4-ec7f-87f119af37bb",ColumnName="Limit_MinAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="87ffe633-9a42-8c01-aafd-90970d8833de",
Synchronized="2019-08-30 22:23:03.0")
/** Column name Limit_MinAmt */
public static final String COLUMNNAME_Limit_MinAmt = "Limit_MinAmt";
/** Set Limit price Rounding.
@param Limit_Rounding Rounding of the final result */
public void setLimit_Rounding (String Limit_Rounding)
{
if (Limit_Rounding.length() > 1)
{
log.warning("Length > 1 - truncated");
Limit_Rounding = Limit_Rounding.substring(0,0);
}
set_Value (COLUMNNAME_Limit_Rounding, Limit_Rounding);
}
/** Get Limit price Rounding.
@return Rounding of the final result */
public String getLimit_Rounding() 
{
return (String)get_Value(COLUMNNAME_Limit_Rounding);
}

@XendraTrl(Identifier="b5099607-54b0-6f89-f523-ba3197d16acf")
public static String es_PE_FIELD_SchemaLine_LimitPriceRounding_Name="Redondeo del Precio Límite";

@XendraTrl(Identifier="b5099607-54b0-6f89-f523-ba3197d16acf")
public static String es_PE_FIELD_SchemaLine_LimitPriceRounding_Description="Redondeo del resultado final";

@XendraTrl(Identifier="b5099607-54b0-6f89-f523-ba3197d16acf")
public static String es_PE_FIELD_SchemaLine_LimitPriceRounding_Help="Un cuadro de lista indica el redondeo (si existe alguno) que se aplicará al precio final en la lista de precios";

@XendraField(AD_Column_ID="Limit_Rounding",IsCentrallyMaintained=true,
AD_Tab_ID="4e66f585-12c6-2542-4550-239e19cd2fb5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@DiscountType@=P & @Limit_Base@!F",DisplayLength=14,IsReadOnly=false,SeqNo=310,
SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="b5099607-54b0-6f89-f523-ba3197d16acf")
public static final String FIELDNAME_SchemaLine_LimitPriceRounding="b5099607-54b0-6f89-f523-ba3197d16acf";

@XendraTrl(Identifier="2e3bcb67-f0ca-25ee-cc2d-cd6e24b64e05")
public static String es_PE_COLUMN_Limit_Rounding_Name="Redondeo del Precio Límite";

@XendraColumn(AD_Element_ID="569da7a9-0c83-5df4-479e-f0ced57bdfcf",ColumnName="Limit_Rounding",
AD_Reference_ID=17,AD_Reference_Value_ID="317c2ec3-8463-ddaf-7302-ddb30b73eb93",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="C",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="2e3bcb67-f0ca-25ee-cc2d-cd6e24b64e05",Synchronized="2019-08-30 22:23:03.0")
/** Column name Limit_Rounding */
public static final String COLUMNNAME_Limit_Rounding = "Limit_Rounding";
/** Set List price Surcharge Amount.
@param List_AddAmt List Price Surcharge Amount */
public void setList_AddAmt (BigDecimal List_AddAmt)
{
if (List_AddAmt == null) throw new IllegalArgumentException ("List_AddAmt is mandatory.");
set_Value (COLUMNNAME_List_AddAmt, List_AddAmt);
}
/** Get List price Surcharge Amount.
@return List Price Surcharge Amount */
public BigDecimal getList_AddAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_List_AddAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="357594d5-743d-b863-3c29-65d398b6edc9")
public static String es_PE_FIELD_SchemaLine_ListPriceSurchargeAmount_Name="Sobreprecio del Precio de Lista";

@XendraTrl(Identifier="357594d5-743d-b863-3c29-65d398b6edc9")
public static String es_PE_FIELD_SchemaLine_ListPriceSurchargeAmount_Description="Total del sobreprecio en la lista de precios.";

@XendraTrl(Identifier="357594d5-743d-b863-3c29-65d398b6edc9")
public static String es_PE_FIELD_SchemaLine_ListPriceSurchargeAmount_Help="El total de sobrecargo en el precio de lista indica el total a ser adicionado al precio antes de la multiplicación.";

@XendraField(AD_Column_ID="List_AddAmt",IsCentrallyMaintained=true,
AD_Tab_ID="4e66f585-12c6-2542-4550-239e19cd2fb5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@DiscountType@=P & @List_Base@!F",DisplayLength=26,IsReadOnly=false,SeqNo=140,
SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="357594d5-743d-b863-3c29-65d398b6edc9")
public static final String FIELDNAME_SchemaLine_ListPriceSurchargeAmount="357594d5-743d-b863-3c29-65d398b6edc9";

@XendraTrl(Identifier="edc4e060-1458-468b-043b-aed8ae1df7fe")
public static String es_PE_COLUMN_List_AddAmt_Name="Sobreprecio del Precio de Lista";

@XendraColumn(AD_Element_ID="e9765f93-da54-4d11-d90f-12543a94816b",ColumnName="List_AddAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="edc4e060-1458-468b-043b-aed8ae1df7fe",
Synchronized="2019-08-30 22:23:03.0")
/** Column name List_AddAmt */
public static final String COLUMNNAME_List_AddAmt = "List_AddAmt";
/** Set List price Base.
@param List_Base Price used as the basis for price list calculations */
public void setList_Base (String List_Base)
{
if (List_Base.length() > 1)
{
log.warning("Length > 1 - truncated");
List_Base = List_Base.substring(0,0);
}
set_Value (COLUMNNAME_List_Base, List_Base);
}
/** Get List price Base.
@return Price used as the basis for price list calculations */
public String getList_Base() 
{
return (String)get_Value(COLUMNNAME_List_Base);
}

@XendraTrl(Identifier="2ffce20b-2fab-64b8-58cb-d8037d83f29e")
public static String es_PE_FIELD_SchemaLine_ListPriceBase_Name="Base del Precio de Lista";

@XendraTrl(Identifier="2ffce20b-2fab-64b8-58cb-d8037d83f29e")
public static String es_PE_FIELD_SchemaLine_ListPriceBase_Description="Precio usado como la base para cálculos de la lista de precios";

@XendraTrl(Identifier="2ffce20b-2fab-64b8-58cb-d8037d83f29e")
public static String es_PE_FIELD_SchemaLine_ListPriceBase_Help="La Base del Precio de Lista indica el precio a usar como la base para el cálculo de una nueva lista de precios";

@XendraField(AD_Column_ID="List_Base",IsCentrallyMaintained=true,
AD_Tab_ID="4e66f585-12c6-2542-4550-239e19cd2fb5",AD_FieldGroup_ID="Amounts",IsDisplayed=true,
DisplayLogic="@DiscountType@=P",DisplayLength=14,IsReadOnly=false,SeqNo=120,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="2ffce20b-2fab-64b8-58cb-d8037d83f29e")
public static final String FIELDNAME_SchemaLine_ListPriceBase="2ffce20b-2fab-64b8-58cb-d8037d83f29e";

@XendraTrl(Identifier="768048f0-46f9-10dd-4812-fde8ff907dc8")
public static String es_PE_COLUMN_List_Base_Name="Base del Precio de Lista";

@XendraColumn(AD_Element_ID="47a252ab-956f-0fd3-b59d-0d8723672fec",ColumnName="List_Base",
AD_Reference_ID=17,AD_Reference_Value_ID="ce63bdf9-c16c-fe89-c2f4-def7e55d7c68",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="L",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="768048f0-46f9-10dd-4812-fde8ff907dc8",Synchronized="2019-08-30 22:23:03.0")
/** Column name List_Base */
public static final String COLUMNNAME_List_Base = "List_Base";
/** Set List price Discount %.
@param List_Discount Discount from list price as a percentage */
public void setList_Discount (BigDecimal List_Discount)
{
if (List_Discount == null) throw new IllegalArgumentException ("List_Discount is mandatory.");
set_Value (COLUMNNAME_List_Discount, List_Discount);
}
/** Get List price Discount %.
@return Discount from list price as a percentage */
public BigDecimal getList_Discount() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_List_Discount);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="170fa1fb-4241-4473-7558-ec135f9e7832")
public static String es_PE_FIELD_SchemaLine_ListPriceDiscount_Name="% Descuento Sobre Precio de Lista";

@XendraTrl(Identifier="170fa1fb-4241-4473-7558-ec135f9e7832")
public static String es_PE_FIELD_SchemaLine_ListPriceDiscount_Description="Descuento en porcentaje del Precio de Lista a ser restado del precio base";

@XendraTrl(Identifier="170fa1fb-4241-4473-7558-ec135f9e7832")
public static String es_PE_FIELD_SchemaLine_ListPriceDiscount_Help="El Porcentaje de Descuento sobre Precio de Lista, indica el porcentaje de descuento que será restado del precio base. Un Total negativo indica el porcentaje que será añadido al precio base   .";

@XendraField(AD_Column_ID="List_Discount",IsCentrallyMaintained=true,
AD_Tab_ID="4e66f585-12c6-2542-4550-239e19cd2fb5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@DiscountType@=P & @List_Base@!F",DisplayLength=26,IsReadOnly=false,SeqNo=160,
SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="170fa1fb-4241-4473-7558-ec135f9e7832")
public static final String FIELDNAME_SchemaLine_ListPriceDiscount="170fa1fb-4241-4473-7558-ec135f9e7832";

@XendraTrl(Identifier="5143b44c-a477-6050-2a1e-dc0b73032e85")
public static String es_PE_COLUMN_List_Discount_Name="% Descuento Sobre Precio de Lista";

@XendraColumn(AD_Element_ID="4f7793de-653f-095b-9f11-ca696bbbc9e6",ColumnName="List_Discount",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5143b44c-a477-6050-2a1e-dc0b73032e85",
Synchronized="2019-08-30 22:23:03.0")
/** Column name List_Discount */
public static final String COLUMNNAME_List_Discount = "List_Discount";
/** Set Fixed List Price.
@param List_Fixed Fixes List Price (not calculated) */
public void setList_Fixed (BigDecimal List_Fixed)
{
set_Value (COLUMNNAME_List_Fixed, List_Fixed);
}
/** Get Fixed List Price.
@return Fixes List Price (not calculated) */
public BigDecimal getList_Fixed() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_List_Fixed);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="5dbdb849-4bc0-632c-a1a9-983790339ea7")
public static String es_PE_FIELD_SchemaLine_FixedListPrice_Name="Fijar Precio de Lista";

@XendraTrl(Identifier="5dbdb849-4bc0-632c-a1a9-983790339ea7")
public static String es_PE_FIELD_SchemaLine_FixedListPrice_Description="Precio de lista fijado (No calculado)";

@XendraField(AD_Column_ID="List_Fixed",IsCentrallyMaintained=true,
AD_Tab_ID="4e66f585-12c6-2542-4550-239e19cd2fb5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@DiscountType@=P & @List_Base@=F",DisplayLength=26,IsReadOnly=false,SeqNo=180,
SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="5dbdb849-4bc0-632c-a1a9-983790339ea7")
public static final String FIELDNAME_SchemaLine_FixedListPrice="5dbdb849-4bc0-632c-a1a9-983790339ea7";

@XendraTrl(Identifier="c115845c-a2cd-290c-df14-0dc4cb515eb3")
public static String es_PE_COLUMN_List_Fixed_Name="Fijar Precio de Lista";

@XendraColumn(AD_Element_ID="391e42ba-0883-1e44-d3ff-6fed1b4eb38f",ColumnName="List_Fixed",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c115845c-a2cd-290c-df14-0dc4cb515eb3",
Synchronized="2019-08-30 22:23:03.0")
/** Column name List_Fixed */
public static final String COLUMNNAME_List_Fixed = "List_Fixed";
/** Set List price max Margin.
@param List_MaxAmt Maximum margin for a product */
public void setList_MaxAmt (BigDecimal List_MaxAmt)
{
if (List_MaxAmt == null) throw new IllegalArgumentException ("List_MaxAmt is mandatory.");
set_Value (COLUMNNAME_List_MaxAmt, List_MaxAmt);
}
/** Get List price max Margin.
@return Maximum margin for a product */
public BigDecimal getList_MaxAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_List_MaxAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="bae86332-cf32-302d-65e7-c6b280d4b541")
public static String es_PE_FIELD_SchemaLine_ListPriceMaxMargin_Name="Margen Máximo sobre el Precio de Lista";

@XendraTrl(Identifier="bae86332-cf32-302d-65e7-c6b280d4b541")
public static String es_PE_FIELD_SchemaLine_ListPriceMaxMargin_Description="Margen máximo para un producto";

@XendraTrl(Identifier="bae86332-cf32-302d-65e7-c6b280d4b541")
public static String es_PE_FIELD_SchemaLine_ListPriceMaxMargin_Help="El margen máximo del precio de lista indica el margen máximo para un producto. El margen es calculado restando el precio de lista original del precio nuevo calculado. Si este campo contiene 0.00 entonces es ignorado.";

@XendraField(AD_Column_ID="List_MaxAmt",IsCentrallyMaintained=true,
AD_Tab_ID="4e66f585-12c6-2542-4550-239e19cd2fb5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@DiscountType@=P & @List_Base@!F",DisplayLength=26,IsReadOnly=false,SeqNo=150,
SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="bae86332-cf32-302d-65e7-c6b280d4b541")
public static final String FIELDNAME_SchemaLine_ListPriceMaxMargin="bae86332-cf32-302d-65e7-c6b280d4b541";

@XendraTrl(Identifier="951895c0-6fab-c3ad-6be0-3cc0d8f810c8")
public static String es_PE_COLUMN_List_MaxAmt_Name="Margen Máximo sobre el Precio de Lista";

@XendraColumn(AD_Element_ID="891fd46a-7fa0-184f-a95c-2b6b50405fd0",ColumnName="List_MaxAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="951895c0-6fab-c3ad-6be0-3cc0d8f810c8",
Synchronized="2019-08-30 22:23:03.0")
/** Column name List_MaxAmt */
public static final String COLUMNNAME_List_MaxAmt = "List_MaxAmt";
/** Set List price min Margin.
@param List_MinAmt Minimum margin for a product */
public void setList_MinAmt (BigDecimal List_MinAmt)
{
if (List_MinAmt == null) throw new IllegalArgumentException ("List_MinAmt is mandatory.");
set_Value (COLUMNNAME_List_MinAmt, List_MinAmt);
}
/** Get List price min Margin.
@return Minimum margin for a product */
public BigDecimal getList_MinAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_List_MinAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="a4221869-eb01-4c39-a253-177c4d7a446c")
public static String es_PE_FIELD_SchemaLine_ListPriceMinMargin_Name="Margen Mínimo sobre el precio de lista";

@XendraTrl(Identifier="a4221869-eb01-4c39-a253-177c4d7a446c")
public static String es_PE_FIELD_SchemaLine_ListPriceMinMargin_Description="Margen mínimo para un producto";

@XendraTrl(Identifier="a4221869-eb01-4c39-a253-177c4d7a446c")
public static String es_PE_FIELD_SchemaLine_ListPriceMinMargin_Help="El margen mínimo sobre el precio de lista indica el margen mínimo para un producto. El margen es calculado substrayendo el precio de lista original del nuevo precio calculado. Si el campo contiene 0.00; el margen es ignorado.";

@XendraField(AD_Column_ID="List_MinAmt",IsCentrallyMaintained=true,
AD_Tab_ID="4e66f585-12c6-2542-4550-239e19cd2fb5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@DiscountType@=P & @List_Base@!F",DisplayLength=26,IsReadOnly=false,SeqNo=130,
SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="a4221869-eb01-4c39-a253-177c4d7a446c")
public static final String FIELDNAME_SchemaLine_ListPriceMinMargin="a4221869-eb01-4c39-a253-177c4d7a446c";

@XendraTrl(Identifier="2056e868-ce1c-6880-3b6d-e1863f2f5e61")
public static String es_PE_COLUMN_List_MinAmt_Name="Margen Mínimo sobre el precio de lista";

@XendraColumn(AD_Element_ID="1c389c14-380a-3392-2609-7fa72f8c98f4",ColumnName="List_MinAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2056e868-ce1c-6880-3b6d-e1863f2f5e61",
Synchronized="2019-08-30 22:23:03.0")
/** Column name List_MinAmt */
public static final String COLUMNNAME_List_MinAmt = "List_MinAmt";
/** Set List price Rounding.
@param List_Rounding Rounding rule for final list price */
public void setList_Rounding (String List_Rounding)
{
if (List_Rounding.length() > 1)
{
log.warning("Length > 1 - truncated");
List_Rounding = List_Rounding.substring(0,0);
}
set_Value (COLUMNNAME_List_Rounding, List_Rounding);
}
/** Get List price Rounding.
@return Rounding rule for final list price */
public String getList_Rounding() 
{
return (String)get_Value(COLUMNNAME_List_Rounding);
}

@XendraTrl(Identifier="4f702662-7424-c765-7272-5cc264da1ed4")
public static String es_PE_FIELD_SchemaLine_ListPriceRounding_Name="Redondeo del Precio de Lista";

@XendraTrl(Identifier="4f702662-7424-c765-7272-5cc264da1ed4")
public static String es_PE_FIELD_SchemaLine_ListPriceRounding_Description="Regla de redondeo para la lista de precios final";

@XendraTrl(Identifier="4f702662-7424-c765-7272-5cc264da1ed4")
public static String es_PE_FIELD_SchemaLine_ListPriceRounding_Help="El Redondeo del Precio de Lista indica como el precio de lista final será redondeado";

@XendraField(AD_Column_ID="List_Rounding",IsCentrallyMaintained=true,
AD_Tab_ID="4e66f585-12c6-2542-4550-239e19cd2fb5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@DiscountType@=P & @List_Base@!F",DisplayLength=14,IsReadOnly=false,SeqNo=170,
SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="4f702662-7424-c765-7272-5cc264da1ed4")
public static final String FIELDNAME_SchemaLine_ListPriceRounding="4f702662-7424-c765-7272-5cc264da1ed4";

@XendraTrl(Identifier="6222371b-8b3a-ea85-77ed-2d1d61bc7935")
public static String es_PE_COLUMN_List_Rounding_Name="Redondeo del Precio de Lista";

@XendraColumn(AD_Element_ID="4bbb02f4-719c-345b-cb0c-96b4826830b6",ColumnName="List_Rounding",
AD_Reference_ID=17,AD_Reference_Value_ID="317c2ec3-8463-ddaf-7302-ddb30b73eb93",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="C",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="6222371b-8b3a-ea85-77ed-2d1d61bc7935",Synchronized="2019-08-30 22:23:03.0")
/** Column name List_Rounding */
public static final String COLUMNNAME_List_Rounding = "List_Rounding";
/** Set Discount Schema.
@param M_DiscountSchema_ID Schema to calculate the trade discount percentage */
public void setM_DiscountSchema_ID (int M_DiscountSchema_ID)
{
if (M_DiscountSchema_ID < 1) throw new IllegalArgumentException ("M_DiscountSchema_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_DiscountSchema_ID, Integer.valueOf(M_DiscountSchema_ID));
}
/** Get Discount Schema.
@return Schema to calculate the trade discount percentage */
public int getM_DiscountSchema_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_DiscountSchema_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="82f0a296-aaab-228f-8c92-9dca909e20a2")
public static String es_PE_FIELD_SchemaLine_PriceListSchema_Name="Esq Lista Precios";

@XendraTrl(Identifier="82f0a296-aaab-228f-8c92-9dca909e20a2")
public static String es_PE_FIELD_SchemaLine_PriceListSchema_Description="Esquema para calcular el porcentaje de descuento comercial";

@XendraTrl(Identifier="82f0a296-aaab-228f-8c92-9dca909e20a2")
public static String es_PE_FIELD_SchemaLine_PriceListSchema_Help="Después del cálculo de precio (estándar); el porcentaje de descuento comercial es calculado y aplicado resultando en el precio final";

@XendraField(AD_Column_ID="M_DiscountSchema_ID",IsCentrallyMaintained=true,
AD_Tab_ID="4e66f585-12c6-2542-4550-239e19cd2fb5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@DiscountType@=P",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="82f0a296-aaab-228f-8c92-9dca909e20a2")
public static final String FIELDNAME_SchemaLine_PriceListSchema="82f0a296-aaab-228f-8c92-9dca909e20a2";

@XendraTrl(Identifier="7cc8c887-4692-48ee-75ef-e6c6e534e790")
public static String es_PE_COLUMN_M_DiscountSchema_ID_Name="Esq List Precios/Desc";

@XendraColumn(AD_Element_ID="e8a3b5bd-239d-8376-eae6-8e5ebcfbe6fa",
ColumnName="M_DiscountSchema_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="7cc8c887-4692-48ee-75ef-e6c6e534e790",Synchronized="2019-08-30 22:23:03.0")
/** Column name M_DiscountSchema_ID */
public static final String COLUMNNAME_M_DiscountSchema_ID = "M_DiscountSchema_ID";
/** Set Discount Pricelist.
@param M_DiscountSchemaLine_ID Line of the pricelist trade discount schema */
public void setM_DiscountSchemaLine_ID (int M_DiscountSchemaLine_ID)
{
if (M_DiscountSchemaLine_ID < 1) throw new IllegalArgumentException ("M_DiscountSchemaLine_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_DiscountSchemaLine_ID, Integer.valueOf(M_DiscountSchemaLine_ID));
}
/** Get Discount Pricelist.
@return Line of the pricelist trade discount schema */
public int getM_DiscountSchemaLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_DiscountSchemaLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="9df1e31a-5407-db63-6bce-c38c0053a83f")
public static String es_PE_FIELD_SchemaLine_DiscountPricelist_Name="Lista de Precio con descuento";

@XendraTrl(Identifier="9df1e31a-5407-db63-6bce-c38c0053a83f")
public static String es_PE_FIELD_SchemaLine_DiscountPricelist_Description="Línea de la lista de precio con descuento comercial";

@XendraTrl(Identifier="9df1e31a-5407-db63-6bce-c38c0053a83f")
public static String es_PE_FIELD_SchemaLine_DiscountPricelist_Help="Para el tipo de descuento en la lista de precios; Usted introduce como el precio límite y estándar es calculada.";

@XendraField(AD_Column_ID="M_DiscountSchemaLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="4e66f585-12c6-2542-4550-239e19cd2fb5",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@DiscountType@=P",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="9df1e31a-5407-db63-6bce-c38c0053a83f")
public static final String FIELDNAME_SchemaLine_DiscountPricelist="9df1e31a-5407-db63-6bce-c38c0053a83f";
/** Column name M_DiscountSchemaLine_ID */
public static final String COLUMNNAME_M_DiscountSchemaLine_ID = "M_DiscountSchemaLine_ID";
/** Set Product Category.
@param M_Product_Category_ID Category of a Product */
public void setM_Product_Category_ID (int M_Product_Category_ID)
{
if (M_Product_Category_ID <= 0) set_Value (COLUMNNAME_M_Product_Category_ID, null);
 else 
set_Value (COLUMNNAME_M_Product_Category_ID, Integer.valueOf(M_Product_Category_ID));
}
/** Get Product Category.
@return Category of a Product */
public int getM_Product_Category_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Product_Category_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="3a1c9c10-3ec4-53a3-2ec5-096ae5e73579")
public static String es_PE_FIELD_SchemaLine_ProductCategory_Name="Categoría del Producto";

@XendraTrl(Identifier="3a1c9c10-3ec4-53a3-2ec5-096ae5e73579")
public static String es_PE_FIELD_SchemaLine_ProductCategory_Description="Categoría de la que este producto es parte";

@XendraTrl(Identifier="3a1c9c10-3ec4-53a3-2ec5-096ae5e73579")
public static String es_PE_FIELD_SchemaLine_ProductCategory_Help="Identifica la categoría a la que pertenece este producto. Las categorías del producto son usadas para el cálculo de precios";

@XendraField(AD_Column_ID="M_Product_Category_ID",IsCentrallyMaintained=true,
AD_Tab_ID="4e66f585-12c6-2542-4550-239e19cd2fb5",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="@DiscountType@=P",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="3a1c9c10-3ec4-53a3-2ec5-096ae5e73579")
public static final String FIELDNAME_SchemaLine_ProductCategory="3a1c9c10-3ec4-53a3-2ec5-096ae5e73579";

@XendraTrl(Identifier="e0d1548e-abb3-228d-cfc6-e8fdcaed2e4b")
public static String es_PE_COLUMN_M_Product_Category_ID_Name="Categoría del Producto";

@XendraColumn(AD_Element_ID="80d3e0bb-473b-67d4-42d5-1d776006a69c",
ColumnName="M_Product_Category_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=true,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="e0d1548e-abb3-228d-cfc6-e8fdcaed2e4b",Synchronized="2019-08-30 22:23:03.0")
/** Column name M_Product_Category_ID */
public static final String COLUMNNAME_M_Product_Category_ID = "M_Product_Category_ID";
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

@XendraTrl(Identifier="8d11b650-6737-00c6-c058-52f9c9c127d5")
public static String es_PE_FIELD_SchemaLine_Product_Name="Producto";

@XendraTrl(Identifier="8d11b650-6737-00c6-c058-52f9c9c127d5")
public static String es_PE_FIELD_SchemaLine_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="8d11b650-6737-00c6-c058-52f9c9c127d5")
public static String es_PE_FIELD_SchemaLine_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="4e66f585-12c6-2542-4550-239e19cd2fb5",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="@DiscountType@=P",DisplayLength=26,IsReadOnly=false,SeqNo=110,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="8d11b650-6737-00c6-c058-52f9c9c127d5")
public static final String FIELDNAME_SchemaLine_Product="8d11b650-6737-00c6-c058-52f9c9c127d5";

@XendraTrl(Identifier="c15b77f4-2738-7d87-6d94-01c88ba740cf")
public static String es_PE_COLUMN_M_Product_ID_Name="Producto";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="4281f8eb-238e-6b28-eb66-8cc866e6312c",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=true,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="c15b77f4-2738-7d87-6d94-01c88ba740cf",Synchronized="2019-08-30 22:23:03.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
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
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getSeqNo()));
}

@XendraTrl(Identifier="a7a56ef7-a51c-a2e5-c523-b8a2fb6a2fd7")
public static String es_PE_FIELD_SchemaLine_Sequence_Name="Secuencia";

@XendraTrl(Identifier="a7a56ef7-a51c-a2e5-c523-b8a2fb6a2fd7")
public static String es_PE_FIELD_SchemaLine_Sequence_Description="Método de ordenar registros; el número más bajo viene primero";

@XendraTrl(Identifier="a7a56ef7-a51c-a2e5-c523-b8a2fb6a2fd7")
public static String es_PE_FIELD_SchemaLine_Sequence_Help="La Secuencia indica el orden de los registros";

@XendraField(AD_Column_ID="SeqNo",IsCentrallyMaintained=true,
AD_Tab_ID="4e66f585-12c6-2542-4550-239e19cd2fb5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@DiscountType@=P",DisplayLength=11,IsReadOnly=false,SeqNo=60,SortNo=1,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="a7a56ef7-a51c-a2e5-c523-b8a2fb6a2fd7")
public static final String FIELDNAME_SchemaLine_Sequence="a7a56ef7-a51c-a2e5-c523-b8a2fb6a2fd7";

@XendraTrl(Identifier="ad159290-1307-789b-394e-b314d1ff6ed0")
public static String es_PE_COLUMN_SeqNo_Name="Secuencia";

@XendraColumn(AD_Element_ID="38fa26fe-b59d-fce1-c129-420b57da738b",ColumnName="SeqNo",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="@SQL=SELECT COALESCE(MAX(SeqNo),0)+10 AS DefaultValue FROM M_DiscountSchemaLine WHERE M_DiscountSchema_ID=@M_DiscountSchema_ID@",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ad159290-1307-789b-394e-b314d1ff6ed0",
Synchronized="2019-08-30 22:23:03.0")
/** Column name SeqNo */
public static final String COLUMNNAME_SeqNo = "SeqNo";
/** Set Standard price Surcharge Amount.
@param Std_AddAmt Amount added to a price as a surcharge */
public void setStd_AddAmt (BigDecimal Std_AddAmt)
{
if (Std_AddAmt == null) throw new IllegalArgumentException ("Std_AddAmt is mandatory.");
set_Value (COLUMNNAME_Std_AddAmt, Std_AddAmt);
}
/** Get Standard price Surcharge Amount.
@return Amount added to a price as a surcharge */
public BigDecimal getStd_AddAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Std_AddAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="4de347f1-a0a8-fd52-7c71-7ba8bf705253")
public static String es_PE_FIELD_SchemaLine_StandardPriceSurchargeAmount_Name="Total de Sobreprecio al Precio Estándar";

@XendraTrl(Identifier="4de347f1-a0a8-fd52-7c71-7ba8bf705253")
public static String es_PE_FIELD_SchemaLine_StandardPriceSurchargeAmount_Description="Total añadido al precio como un sobreprecio";

@XendraTrl(Identifier="4de347f1-a0a8-fd52-7c71-7ba8bf705253")
public static String es_PE_FIELD_SchemaLine_StandardPriceSurchargeAmount_Help="El Total de sobreprecio del precio estándar indica el total a ser añadido a el precio antes de la multiplicación.";

@XendraField(AD_Column_ID="Std_AddAmt",IsCentrallyMaintained=true,
AD_Tab_ID="4e66f585-12c6-2542-4550-239e19cd2fb5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@DiscountType@=P & @Std_Base@!F",DisplayLength=26,IsReadOnly=false,SeqNo=210,
SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="4de347f1-a0a8-fd52-7c71-7ba8bf705253")
public static final String FIELDNAME_SchemaLine_StandardPriceSurchargeAmount="4de347f1-a0a8-fd52-7c71-7ba8bf705253";

@XendraTrl(Identifier="576255b3-08de-0bc8-d3be-a8632a184382")
public static String es_PE_COLUMN_Std_AddAmt_Name="Total de Sobreprecio al Precio Estándar";

@XendraColumn(AD_Element_ID="55054d8a-a2e4-6723-6b90-d139d7390978",ColumnName="Std_AddAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="576255b3-08de-0bc8-d3be-a8632a184382",
Synchronized="2019-08-30 22:23:03.0")
/** Column name Std_AddAmt */
public static final String COLUMNNAME_Std_AddAmt = "Std_AddAmt";
/** Set Standard price Base.
@param Std_Base Base price for calculating new standard price */
public void setStd_Base (String Std_Base)
{
if (Std_Base.length() > 1)
{
log.warning("Length > 1 - truncated");
Std_Base = Std_Base.substring(0,0);
}
set_Value (COLUMNNAME_Std_Base, Std_Base);
}
/** Get Standard price Base.
@return Base price for calculating new standard price */
public String getStd_Base() 
{
return (String)get_Value(COLUMNNAME_Std_Base);
}

@XendraTrl(Identifier="8655f082-e6e1-1ee6-20c3-6a8ca1249756")
public static String es_PE_FIELD_SchemaLine_StandardPriceBase_Name="Base para Precio Estándar";

@XendraTrl(Identifier="8655f082-e6e1-1ee6-20c3-6a8ca1249756")
public static String es_PE_FIELD_SchemaLine_StandardPriceBase_Description="Precio base para calcular el nuevo precio estándar";

@XendraTrl(Identifier="8655f082-e6e1-1ee6-20c3-6a8ca1249756")
public static String es_PE_FIELD_SchemaLine_StandardPriceBase_Help="La base del precio estándar indica el precio a usar como la base para el cálculo del nuevo precio estándar";

@XendraField(AD_Column_ID="Std_Base",IsCentrallyMaintained=true,
AD_Tab_ID="4e66f585-12c6-2542-4550-239e19cd2fb5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@DiscountType@=P",DisplayLength=14,IsReadOnly=false,SeqNo=190,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="8655f082-e6e1-1ee6-20c3-6a8ca1249756")
public static final String FIELDNAME_SchemaLine_StandardPriceBase="8655f082-e6e1-1ee6-20c3-6a8ca1249756";

@XendraTrl(Identifier="ae550b73-f826-1835-1316-38d2ea25ff85")
public static String es_PE_COLUMN_Std_Base_Name="Base para Precio Estándar";

@XendraColumn(AD_Element_ID="0d9a4796-d36c-4553-75c8-7d0bf5d3698d",ColumnName="Std_Base",
AD_Reference_ID=17,AD_Reference_Value_ID="ce63bdf9-c16c-fe89-c2f4-def7e55d7c68",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="S",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="ae550b73-f826-1835-1316-38d2ea25ff85",Synchronized="2019-08-30 22:23:03.0")
/** Column name Std_Base */
public static final String COLUMNNAME_Std_Base = "Std_Base";
/** Set Standard price Discount %.
@param Std_Discount Discount percentage to subtract from base price */
public void setStd_Discount (BigDecimal Std_Discount)
{
if (Std_Discount == null) throw new IllegalArgumentException ("Std_Discount is mandatory.");
set_Value (COLUMNNAME_Std_Discount, Std_Discount);
}
/** Get Standard price Discount %.
@return Discount percentage to subtract from base price */
public BigDecimal getStd_Discount() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Std_Discount);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="10731c67-6389-145f-f7c8-6b839b8eaa7f")
public static String es_PE_FIELD_SchemaLine_StandardPriceDiscount_Name="% Descuento Sobre Precio Estándar";

@XendraTrl(Identifier="10731c67-6389-145f-f7c8-6b839b8eaa7f")
public static String es_PE_FIELD_SchemaLine_StandardPriceDiscount_Description="Descuento en porcentaje del precio Estándar a ser restado del precio base";

@XendraTrl(Identifier="10731c67-6389-145f-f7c8-6b839b8eaa7f")
public static String es_PE_FIELD_SchemaLine_StandardPriceDiscount_Help="El Porcentaje de Descuento en el Precio Estándar indica el porcentaje de descuento que será restado del precio base. Un Total negativo indica el porcentaje que será añadido al precio base  .";

@XendraField(AD_Column_ID="Std_Discount",IsCentrallyMaintained=true,
AD_Tab_ID="4e66f585-12c6-2542-4550-239e19cd2fb5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@DiscountType@=P & @Std_Base@!F",DisplayLength=26,IsReadOnly=false,SeqNo=230,
SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="10731c67-6389-145f-f7c8-6b839b8eaa7f")
public static final String FIELDNAME_SchemaLine_StandardPriceDiscount="10731c67-6389-145f-f7c8-6b839b8eaa7f";

@XendraTrl(Identifier="2ea3e3bf-9430-55cb-d745-4c504ab0a37b")
public static String es_PE_COLUMN_Std_Discount_Name="% Descuento Sobre Precio Estándar";

@XendraColumn(AD_Element_ID="bcd7aec4-87e6-bb69-47e4-7e904f6ffb7b",ColumnName="Std_Discount",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2ea3e3bf-9430-55cb-d745-4c504ab0a37b",
Synchronized="2019-08-30 22:23:03.0")
/** Column name Std_Discount */
public static final String COLUMNNAME_Std_Discount = "Std_Discount";
/** Set Fixed Standard Price.
@param Std_Fixed Fixed Standard Price (not calculated) */
public void setStd_Fixed (BigDecimal Std_Fixed)
{
set_Value (COLUMNNAME_Std_Fixed, Std_Fixed);
}
/** Get Fixed Standard Price.
@return Fixed Standard Price (not calculated) */
public BigDecimal getStd_Fixed() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Std_Fixed);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="c822b623-0e01-3baa-38c0-bc195235a290")
public static String es_PE_FIELD_SchemaLine_FixedStandardPrice_Name="Fijar Precio Estándar";

@XendraTrl(Identifier="c822b623-0e01-3baa-38c0-bc195235a290")
public static String es_PE_FIELD_SchemaLine_FixedStandardPrice_Description="Precio estándar fijado (No calculado)";

@XendraField(AD_Column_ID="Std_Fixed",IsCentrallyMaintained=true,
AD_Tab_ID="4e66f585-12c6-2542-4550-239e19cd2fb5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@DiscountType@=P & @Std_Base@=F",DisplayLength=26,IsReadOnly=false,SeqNo=250,
SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="c822b623-0e01-3baa-38c0-bc195235a290")
public static final String FIELDNAME_SchemaLine_FixedStandardPrice="c822b623-0e01-3baa-38c0-bc195235a290";

@XendraTrl(Identifier="0d40f5cc-fc53-000e-afed-374ccea0f5c5")
public static String es_PE_COLUMN_Std_Fixed_Name="Fijar Precio Estándar";

@XendraColumn(AD_Element_ID="e48848a2-6c42-e43e-f24b-1c039cc39fb1",ColumnName="Std_Fixed",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0d40f5cc-fc53-000e-afed-374ccea0f5c5",
Synchronized="2019-08-30 22:23:03.0")
/** Column name Std_Fixed */
public static final String COLUMNNAME_Std_Fixed = "Std_Fixed";
/** Set Standard max Margin.
@param Std_MaxAmt Maximum margin allowed for a product */
public void setStd_MaxAmt (BigDecimal Std_MaxAmt)
{
if (Std_MaxAmt == null) throw new IllegalArgumentException ("Std_MaxAmt is mandatory.");
set_Value (COLUMNNAME_Std_MaxAmt, Std_MaxAmt);
}
/** Get Standard max Margin.
@return Maximum margin allowed for a product */
public BigDecimal getStd_MaxAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Std_MaxAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="476ff0c5-26f5-46c1-427f-61f600d2251c")
public static String es_PE_FIELD_SchemaLine_StandardMaxMargin_Name="Margen Máximo del Precio Estándar";

@XendraTrl(Identifier="476ff0c5-26f5-46c1-427f-61f600d2251c")
public static String es_PE_FIELD_SchemaLine_StandardMaxMargin_Description="Margen máximo permitido para un producto.";

@XendraTrl(Identifier="476ff0c5-26f5-46c1-427f-61f600d2251c")
public static String es_PE_FIELD_SchemaLine_StandardMaxMargin_Help="El margen máximo del precio estándar indica el margen máximo para un producto. El margen se calcula restando el precio estándar original del precio nuevamente calculado. Si este campo contiene 0.00 entonces es ignorado.";

@XendraField(AD_Column_ID="Std_MaxAmt",IsCentrallyMaintained=true,
AD_Tab_ID="4e66f585-12c6-2542-4550-239e19cd2fb5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@DiscountType@=P & @Std_Base@!F",DisplayLength=26,IsReadOnly=false,SeqNo=220,
SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="476ff0c5-26f5-46c1-427f-61f600d2251c")
public static final String FIELDNAME_SchemaLine_StandardMaxMargin="476ff0c5-26f5-46c1-427f-61f600d2251c";

@XendraTrl(Identifier="39dd4795-1ffb-c409-0b7f-be5f41391195")
public static String es_PE_COLUMN_Std_MaxAmt_Name="Margen Máximo del Precio Estándar";

@XendraColumn(AD_Element_ID="902328c9-09a4-1f55-533f-0e26b46d497b",ColumnName="Std_MaxAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="39dd4795-1ffb-c409-0b7f-be5f41391195",
Synchronized="2019-08-30 22:23:03.0")
/** Column name Std_MaxAmt */
public static final String COLUMNNAME_Std_MaxAmt = "Std_MaxAmt";
/** Set Standard price min Margin.
@param Std_MinAmt Minimum margin allowed for a product */
public void setStd_MinAmt (BigDecimal Std_MinAmt)
{
if (Std_MinAmt == null) throw new IllegalArgumentException ("Std_MinAmt is mandatory.");
set_Value (COLUMNNAME_Std_MinAmt, Std_MinAmt);
}
/** Get Standard price min Margin.
@return Minimum margin allowed for a product */
public BigDecimal getStd_MinAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Std_MinAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="449e8f59-2643-5325-1f14-4ac4cd0ccda4")
public static String es_PE_FIELD_SchemaLine_StandardPriceMinMargin_Name="Margen Mínimo del Precio Estándar";

@XendraTrl(Identifier="449e8f59-2643-5325-1f14-4ac4cd0ccda4")
public static String es_PE_FIELD_SchemaLine_StandardPriceMinMargin_Description="Margen mínimo permitido para un producto";

@XendraTrl(Identifier="449e8f59-2643-5325-1f14-4ac4cd0ccda4")
public static String es_PE_FIELD_SchemaLine_StandardPriceMinMargin_Help="El margen mínimo del precio estándar indica el margen mínimo para un producto. El margen se calcula restando el precio estándar original del precio nuevamente calculado. Si este campo contiene 0.00 entonces es ignorado.";

@XendraField(AD_Column_ID="Std_MinAmt",IsCentrallyMaintained=true,
AD_Tab_ID="4e66f585-12c6-2542-4550-239e19cd2fb5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@DiscountType@=P & @Std_Base@!F",DisplayLength=26,IsReadOnly=false,SeqNo=200,
SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="449e8f59-2643-5325-1f14-4ac4cd0ccda4")
public static final String FIELDNAME_SchemaLine_StandardPriceMinMargin="449e8f59-2643-5325-1f14-4ac4cd0ccda4";

@XendraTrl(Identifier="af032b42-cc7f-44c0-6806-fb39039d9af7")
public static String es_PE_COLUMN_Std_MinAmt_Name="Margen Mínimo del Precio Estándar";

@XendraColumn(AD_Element_ID="ff4107d4-0b57-bc74-02e0-5c54ff164df4",ColumnName="Std_MinAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="af032b42-cc7f-44c0-6806-fb39039d9af7",
Synchronized="2019-08-30 22:23:03.0")
/** Column name Std_MinAmt */
public static final String COLUMNNAME_Std_MinAmt = "Std_MinAmt";
/** Set Standard price Rounding.
@param Std_Rounding Rounding rule for calculated price */
public void setStd_Rounding (String Std_Rounding)
{
if (Std_Rounding.length() > 1)
{
log.warning("Length > 1 - truncated");
Std_Rounding = Std_Rounding.substring(0,0);
}
set_Value (COLUMNNAME_Std_Rounding, Std_Rounding);
}
/** Get Standard price Rounding.
@return Rounding rule for calculated price */
public String getStd_Rounding() 
{
return (String)get_Value(COLUMNNAME_Std_Rounding);
}

@XendraTrl(Identifier="928bb073-34ba-51bd-205f-4afaa6562955")
public static String es_PE_FIELD_SchemaLine_StandardPriceRounding_Name="Redondeo del Precio Estándar";

@XendraTrl(Identifier="928bb073-34ba-51bd-205f-4afaa6562955")
public static String es_PE_FIELD_SchemaLine_StandardPriceRounding_Description="Regla de redondeo para el precio calculado";

@XendraTrl(Identifier="928bb073-34ba-51bd-205f-4afaa6562955")
public static String es_PE_FIELD_SchemaLine_StandardPriceRounding_Help="El redondeo del Precio Estándar indica como el precio estándar será redondeado";

@XendraField(AD_Column_ID="Std_Rounding",IsCentrallyMaintained=true,
AD_Tab_ID="4e66f585-12c6-2542-4550-239e19cd2fb5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@DiscountType@=P & @Std_Base@!F",DisplayLength=14,IsReadOnly=false,SeqNo=240,
SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="928bb073-34ba-51bd-205f-4afaa6562955")
public static final String FIELDNAME_SchemaLine_StandardPriceRounding="928bb073-34ba-51bd-205f-4afaa6562955";

@XendraTrl(Identifier="49ddfec2-37c3-0fd0-2802-69982ffd1124")
public static String es_PE_COLUMN_Std_Rounding_Name="Redondeo del Precio Estándar";

@XendraColumn(AD_Element_ID="45d19c71-7d9d-bbf4-2df2-d5545a907198",ColumnName="Std_Rounding",
AD_Reference_ID=17,AD_Reference_Value_ID="317c2ec3-8463-ddaf-7302-ddb30b73eb93",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="C",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="49ddfec2-37c3-0fd0-2802-69982ffd1124",Synchronized="2019-08-30 22:23:03.0")
/** Column name Std_Rounding */
public static final String COLUMNNAME_Std_Rounding = "Std_Rounding";
}
