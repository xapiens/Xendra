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
/** Generated Model for C_CampaignDiscount
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_CampaignDiscount extends PO
{
/** Standard Constructor
@param ctx context
@param C_CampaignDiscount_ID id
@param trxName transaction
*/
public X_C_CampaignDiscount (Properties ctx, int C_CampaignDiscount_ID, String trxName)
{
super (ctx, C_CampaignDiscount_ID, trxName);
/** if (C_CampaignDiscount_ID == 0)
{
setC_CampaignDiscount_ID (0);
setC_Campaign_ID (0);
setM_DiscountSchema_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_CampaignDiscount (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000182 */
public static int Table_ID=MTable.getTable_ID("C_CampaignDiscount");

@XendraTrl(Identifier="32d70564-5e54-948c-e1d5-19394477e08c")
public static String es_PE_TAB_CampaignDiscount_Description="CampaignDiscount";

@XendraTrl(Identifier="32d70564-5e54-948c-e1d5-19394477e08c")
public static String es_PE_TAB_CampaignDiscount_Name="CampaignDiscount";

@XendraTab(Name="CampaignDiscount",Description="CampaignDiscount",Help="",
AD_Window_ID="5fbd0093-6a0b-0961-2180-55573e4d502a",SeqNo=40,TabLevel=1,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="32d70564-5e54-948c-e1d5-19394477e08c",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_CampaignDiscount="32d70564-5e54-948c-e1d5-19394477e08c";

@XendraTrl(Identifier="f024dd4b-1345-224c-52af-6ef86759c8af")
public static String es_PE_TABLE_C_CampaignDiscount_Name="CampaignDiscount";

@XendraTable(Name="CampaignDiscount",Description="CampaignDiscount",Help="",
TableName="C_CampaignDiscount",AccessLevel="3",AD_Window_ID="5fbd0093-6a0b-0961-2180-55573e4d502a",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=95,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="f024dd4b-1345-224c-52af-6ef86759c8af",Synchronized="2017-08-16 11:41:34.0")
/** TableName=C_CampaignDiscount */
public static final String Table_Name="C_CampaignDiscount";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_CampaignDiscount");

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
    Table_ID = MTable.getTable_ID("C_CampaignDiscount");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_CampaignDiscount[").append(get_ID()).append("]");
return sb.toString();
}
/** Set C_CampaignDiscount_ID.
@param C_CampaignDiscount_ID C_CampaignDiscount_ID */
public void setC_CampaignDiscount_ID (int C_CampaignDiscount_ID)
{
if (C_CampaignDiscount_ID < 1) throw new IllegalArgumentException ("C_CampaignDiscount_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_CampaignDiscount_ID, Integer.valueOf(C_CampaignDiscount_ID));
}
/** Get C_CampaignDiscount_ID.
@return C_CampaignDiscount_ID */
public int getC_CampaignDiscount_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_CampaignDiscount_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="3518a248-ade6-db1a-119f-a874ce68a5c8")
public static String es_PE_FIELD_CampaignDiscount_C_CampaignDiscount_ID_Name="C_CampaignDiscount_ID";

@XendraField(AD_Column_ID="C_CampaignDiscount_ID",IsCentrallyMaintained=true,
AD_Tab_ID="32d70564-5e54-948c-e1d5-19394477e08c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3518a248-ade6-db1a-119f-a874ce68a5c8")
public static final String FIELDNAME_CampaignDiscount_C_CampaignDiscount_ID="3518a248-ade6-db1a-119f-a874ce68a5c8";
/** Column name C_CampaignDiscount_ID */
public static final String COLUMNNAME_C_CampaignDiscount_ID = "C_CampaignDiscount_ID";
/** Set Campaign.
@param C_Campaign_ID Marketing Campaign */
public void setC_Campaign_ID (int C_Campaign_ID)
{
if (C_Campaign_ID < 1) throw new IllegalArgumentException ("C_Campaign_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_Campaign_ID, Integer.valueOf(C_Campaign_ID));
}
/** Get Campaign.
@return Marketing Campaign */
public int getC_Campaign_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Campaign_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="908c548a-196a-83ab-3f4a-c8a0dce0f447")
public static String es_PE_FIELD_CampaignDiscount_Campaign_Description="Campaña de Mercadeo";

@XendraTrl(Identifier="908c548a-196a-83ab-3f4a-c8a0dce0f447")
public static String es_PE_FIELD_CampaignDiscount_Campaign_Help="La Campaña define un programa de mercadotecnia único. Los proyectos pueden estar asociados con una campaña de mercadotecnia única. Usted puede entonces reportar basado en una campaña específica";

@XendraTrl(Identifier="908c548a-196a-83ab-3f4a-c8a0dce0f447")
public static String es_PE_FIELD_CampaignDiscount_Campaign_Name="Campaña";

@XendraField(AD_Column_ID="C_Campaign_ID",IsCentrallyMaintained=true,
AD_Tab_ID="32d70564-5e54-948c-e1d5-19394477e08c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="908c548a-196a-83ab-3f4a-c8a0dce0f447")
public static final String FIELDNAME_CampaignDiscount_Campaign="908c548a-196a-83ab-3f4a-c8a0dce0f447";

@XendraTrl(Identifier="6c68ddf4-15db-0b7b-72be-87fc776a27b3")
public static String es_PE_COLUMN_C_Campaign_ID_Name="Campaign";

@XendraColumn(AD_Element_ID="6cf08e31-d355-ee38-9c0b-bee20b3ea5b6",ColumnName="C_Campaign_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6c68ddf4-15db-0b7b-72be-87fc776a27b3",
Synchronized="2017-08-05 16:53:26.0")
/** Column name C_Campaign_ID */
public static final String COLUMNNAME_C_Campaign_ID = "C_Campaign_ID";
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

@XendraTrl(Identifier="c38200d4-1fe6-ca88-6d0d-6e3a70e5ecc0")
public static String es_PE_FIELD_CampaignDiscount_UOM_Description="Unidad de Medida";

@XendraTrl(Identifier="c38200d4-1fe6-ca88-6d0d-6e3a70e5ecc0")
public static String es_PE_FIELD_CampaignDiscount_UOM_Help="La UM define una unidad de medida única no monetaria";

@XendraTrl(Identifier="c38200d4-1fe6-ca88-6d0d-6e3a70e5ecc0")
public static String es_PE_FIELD_CampaignDiscount_UOM_Name="UM";

@XendraField(AD_Column_ID="C_UOM_ID",IsCentrallyMaintained=true,
AD_Tab_ID="32d70564-5e54-948c-e1d5-19394477e08c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c38200d4-1fe6-ca88-6d0d-6e3a70e5ecc0")
public static final String FIELDNAME_CampaignDiscount_UOM="c38200d4-1fe6-ca88-6d0d-6e3a70e5ecc0";

@XendraTrl(Identifier="68473775-3c53-911a-6441-5b9d08daf2fa")
public static String es_PE_COLUMN_C_UOM_ID_Name="UOM";

@XendraColumn(AD_Element_ID="d0345019-4fcc-44c8-4fd1-e38e3b4adeed",ColumnName="C_UOM_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="107d46fd-952f-7ad3-6b0d-c74906c7b323",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="68473775-3c53-911a-6441-5b9d08daf2fa",Synchronized="2017-08-05 16:53:26.0")
/** Column name C_UOM_ID */
public static final String COLUMNNAME_C_UOM_ID = "C_UOM_ID";
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
@XendraTrl(Identifier="e0355465-d512-4bd2-853e-5fbd836622f7")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e0355465-d512-4bd2-853e-5fbd836622f7",
Synchronized="2017-08-05 16:53:26.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Discount Schema.
@param M_DiscountSchema_ID Schema to calculate the trade discount percentage */
public void setM_DiscountSchema_ID (int M_DiscountSchema_ID)
{
if (M_DiscountSchema_ID < 1) throw new IllegalArgumentException ("M_DiscountSchema_ID is mandatory.");
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

@XendraTrl(Identifier="41cc0000-f10e-f209-ffc8-f5932f5464c8")
public static String es_PE_FIELD_CampaignDiscount_DiscountSchema_Description="Esquema para calcular el porcentaje de descuento comercial";

@XendraTrl(Identifier="41cc0000-f10e-f209-ffc8-f5932f5464c8")
public static String es_PE_FIELD_CampaignDiscount_DiscountSchema_Help="Después del cálculo de precio (estándar); el porcentaje de descuento comercial es calculado y aplicado resultando en el precio final";

@XendraTrl(Identifier="41cc0000-f10e-f209-ffc8-f5932f5464c8")
public static String es_PE_FIELD_CampaignDiscount_DiscountSchema_Name="Esq List Precios/Desc";

@XendraField(AD_Column_ID="M_DiscountSchema_ID",IsCentrallyMaintained=true,
AD_Tab_ID="32d70564-5e54-948c-e1d5-19394477e08c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="41cc0000-f10e-f209-ffc8-f5932f5464c8")
public static final String FIELDNAME_CampaignDiscount_DiscountSchema="41cc0000-f10e-f209-ffc8-f5932f5464c8";

@XendraTrl(Identifier="d4aff296-f6c3-08b1-64ac-b36bc7e41278")
public static String es_PE_COLUMN_M_DiscountSchema_ID_Name="Discount Schema";

@XendraColumn(AD_Element_ID="e8a3b5bd-239d-8376-eae6-8e5ebcfbe6fa",
ColumnName="M_DiscountSchema_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="d4aff296-f6c3-08b1-64ac-b36bc7e41278",Synchronized="2017-08-05 16:53:26.0")
/** Column name M_DiscountSchema_ID */
public static final String COLUMNNAME_M_DiscountSchema_ID = "M_DiscountSchema_ID";
/** Set Product Brand.
@param M_Product_Brand_ID Brand of a Product */
public void setM_Product_Brand_ID (int M_Product_Brand_ID)
{
if (M_Product_Brand_ID <= 0) set_Value (COLUMNNAME_M_Product_Brand_ID, null);
 else 
set_Value (COLUMNNAME_M_Product_Brand_ID, Integer.valueOf(M_Product_Brand_ID));
}
/** Get Product Brand.
@return Brand of a Product */
public int getM_Product_Brand_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Product_Brand_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="1b8eee96-6fff-981d-154a-53ec9ad3521f")
public static String es_PE_FIELD_CampaignDiscount_ProductBrand_Description="";

@XendraTrl(Identifier="1b8eee96-6fff-981d-154a-53ec9ad3521f")
public static String es_PE_FIELD_CampaignDiscount_ProductBrand_Help="";

@XendraTrl(Identifier="1b8eee96-6fff-981d-154a-53ec9ad3521f")
public static String es_PE_FIELD_CampaignDiscount_ProductBrand_Name="Linea";

@XendraField(AD_Column_ID="M_Product_Brand_ID",IsCentrallyMaintained=true,
AD_Tab_ID="32d70564-5e54-948c-e1d5-19394477e08c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1b8eee96-6fff-981d-154a-53ec9ad3521f")
public static final String FIELDNAME_CampaignDiscount_ProductBrand="1b8eee96-6fff-981d-154a-53ec9ad3521f";

@XendraTrl(Identifier="beb4ebab-e154-e4dc-19ba-17162f668d10")
public static String es_PE_COLUMN_M_Product_Brand_ID_Name="Product Brand";

@XendraColumn(AD_Element_ID="028aa2e6-3ac7-548f-6575-e61a07ea3e9e",ColumnName="M_Product_Brand_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="beb4ebab-e154-e4dc-19ba-17162f668d10",
Synchronized="2017-08-05 16:53:26.0")
/** Column name M_Product_Brand_ID */
public static final String COLUMNNAME_M_Product_Brand_ID = "M_Product_Brand_ID";
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
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getM_Product_ID()));
}

@XendraTrl(Identifier="c8665c0f-c2b9-0226-c8bf-c4669c482178")
public static String es_PE_FIELD_CampaignDiscount_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="c8665c0f-c2b9-0226-c8bf-c4669c482178")
public static String es_PE_FIELD_CampaignDiscount_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraTrl(Identifier="c8665c0f-c2b9-0226-c8bf-c4669c482178")
public static String es_PE_FIELD_CampaignDiscount_Product_Name="Producto";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="32d70564-5e54-948c-e1d5-19394477e08c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c8665c0f-c2b9-0226-c8bf-c4669c482178")
public static final String FIELDNAME_CampaignDiscount_Product="c8665c0f-c2b9-0226-c8bf-c4669c482178";

@XendraTrl(Identifier="c41a0c7a-15c4-2e81-cb3d-668f85c58bce")
public static String es_PE_COLUMN_M_Product_ID_Name="Product";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c41a0c7a-15c4-2e81-cb3d-668f85c58bce",
Synchronized="2017-08-05 16:53:26.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
}
