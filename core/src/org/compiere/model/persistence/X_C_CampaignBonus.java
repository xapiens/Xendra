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
/** Generated Model for C_CampaignBonus
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_CampaignBonus extends PO
{
/** Standard Constructor
@param ctx context
@param C_CampaignBonus_ID id
@param trxName transaction
*/
public X_C_CampaignBonus (Properties ctx, int C_CampaignBonus_ID, String trxName)
{
super (ctx, C_CampaignBonus_ID, trxName);
/** if (C_CampaignBonus_ID == 0)
{
setC_CampaignBonus_ID (0);
setC_Campaign_ID (0);
setM_Product_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_CampaignBonus (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000177 */
public static int Table_ID=MTable.getTable_ID("C_CampaignBonus");

@XendraTrl(Identifier="d34c28f8-0e41-e000-f10e-2d385f6b036a")
public static String es_PE_TAB_CampaignBonus_Description="Marketing Campaign";

@XendraTrl(Identifier="d34c28f8-0e41-e000-f10e-2d385f6b036a")
public static String es_PE_TAB_CampaignBonus_Help="The Marketing Campaign Tab defines the parameters for a Campaign.  These include a start and end date as well as the amount of any invoices that have been processed which reference this campaign.";

@XendraTrl(Identifier="d34c28f8-0e41-e000-f10e-2d385f6b036a")
public static String es_PE_TAB_CampaignBonus_Name="Producto Facturado";

@XendraTab(Name="CampaignBonus",Description="Marketing Campaign",
Help="The Marketing Campaign Tab defines the parameters for a Campaign.  These include a start and end date as well as the amount of any invoices that have been processed which reference this campaign.",
AD_Window_ID="5fbd0093-6a0b-0961-2180-55573e4d502a",SeqNo=20,TabLevel=1,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="d34c28f8-0e41-e000-f10e-2d385f6b036a",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_CampaignBonus="d34c28f8-0e41-e000-f10e-2d385f6b036a";

@XendraTrl(Identifier="eb0e36ed-2999-d6cd-421b-ea5a9a44281b")
public static String es_PE_TABLE_C_CampaignBonus_Name="Campaña Bonus";

@XendraTable(Name="Campaign",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Marketing Campaign",Help="",
TableName="C_CampaignBonus",AccessLevel="3",AD_Window_ID="5fbd0093-6a0b-0961-2180-55573e4d502a",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=95,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="eb0e36ed-2999-d6cd-421b-ea5a9a44281b",Synchronized="2020-03-03 21:36:40.0")
/** TableName=C_CampaignBonus */
public static final String Table_Name="C_CampaignBonus";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_CampaignBonus");

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
    Table_ID = MTable.getTable_ID("C_CampaignBonus");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_CampaignBonus[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Break Discount %.
@param BreakDiscount Trade Discount in Percent for the break level */
public void setBreakDiscount (BigDecimal BreakDiscount)
{
set_Value (COLUMNNAME_BreakDiscount, BreakDiscount);
}
/** Get Break Discount %.
@return Trade Discount in Percent for the break level */
public BigDecimal getBreakDiscount() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_BreakDiscount);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="b25c4d73-dd8c-87d5-3b3a-8641b9b24551")
public static String es_PE_FIELD_CampaignBonus_BreakDiscount_Name="% de Descuento para Corte";

@XendraTrl(Identifier="b25c4d73-dd8c-87d5-3b3a-8641b9b24551")
public static String es_PE_FIELD_CampaignBonus_BreakDiscount_Description="Descuento Comercial en porcentaje para el nivel de corte";

@XendraTrl(Identifier="b25c4d73-dd8c-87d5-3b3a-8641b9b24551")
public static String es_PE_FIELD_CampaignBonus_BreakDiscount_Help="Descuento Comercial en Porcentaje para el nivel de corte";

@XendraField(AD_Column_ID="BreakDiscount",IsCentrallyMaintained=true,
AD_Tab_ID="d34c28f8-0e41-e000-f10e-2d385f6b036a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=131089,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b25c4d73-dd8c-87d5-3b3a-8641b9b24551")
public static final String FIELDNAME_CampaignBonus_BreakDiscount="b25c4d73-dd8c-87d5-3b3a-8641b9b24551";

@XendraTrl(Identifier="41e8caf8-44c2-95c0-5193-5091c03926cd")
public static String es_PE_COLUMN_BreakDiscount_Name="Break Discount %";

@XendraColumn(AD_Element_ID="c22e251c-6831-b70b-218e-dab36ab04a22",ColumnName="BreakDiscount",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="41e8caf8-44c2-95c0-5193-5091c03926cd",
Synchronized="2019-08-30 22:21:17.0")
/** Column name BreakDiscount */
public static final String COLUMNNAME_BreakDiscount = "BreakDiscount";
/** Set Break Value.
@param BreakValue Low Value of trade discount break level */
public void setBreakValue (BigDecimal BreakValue)
{
set_Value (COLUMNNAME_BreakValue, BreakValue);
}
/** Get Break Value.
@return Low Value of trade discount break level */
public BigDecimal getBreakValue() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_BreakValue);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="231017c9-3225-579f-5a46-ce2a0a84ea39")
public static String es_PE_FIELD_CampaignBonus_BreakValue_Name="Valor de corte";

@XendraTrl(Identifier="231017c9-3225-579f-5a46-ce2a0a84ea39")
public static String es_PE_FIELD_CampaignBonus_BreakValue_Description="Valor mínimo para el valor de corte del descuento";

@XendraField(AD_Column_ID="BreakValue",IsCentrallyMaintained=true,
AD_Tab_ID="d34c28f8-0e41-e000-f10e-2d385f6b036a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="231017c9-3225-579f-5a46-ce2a0a84ea39")
public static final String FIELDNAME_CampaignBonus_BreakValue="231017c9-3225-579f-5a46-ce2a0a84ea39";

@XendraTrl(Identifier="1d175e81-25e4-a710-35de-ffbf1abece65")
public static String es_PE_COLUMN_BreakValue_Name="Break Value";

@XendraColumn(AD_Element_ID="c7060020-4c95-96db-bfcf-ac4f63cab833",ColumnName="BreakValue",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1d175e81-25e4-a710-35de-ffbf1abece65",
Synchronized="2019-08-30 22:21:17.0")
/** Column name BreakValue */
public static final String COLUMNNAME_BreakValue = "BreakValue";
/** Set Campaign.
@param C_CampaignBonus_ID Campaign */
public void setC_CampaignBonus_ID (int C_CampaignBonus_ID)
{
if (C_CampaignBonus_ID < 1) throw new IllegalArgumentException ("C_CampaignBonus_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_CampaignBonus_ID, Integer.valueOf(C_CampaignBonus_ID));
}
/** Get Campaign.
@return Campaign */
public int getC_CampaignBonus_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_CampaignBonus_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f48ec8da-71a3-8e19-1092-5983b1282029")
public static String es_PE_FIELD_CampaignBonus_Campaign_Name="Campaign";

@XendraField(AD_Column_ID="C_CampaignBonus_ID",IsCentrallyMaintained=true,
AD_Tab_ID="d34c28f8-0e41-e000-f10e-2d385f6b036a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f48ec8da-71a3-8e19-1092-5983b1282029")
public static final String FIELDNAME_CampaignBonus_Campaign="f48ec8da-71a3-8e19-1092-5983b1282029";
/** Column name C_CampaignBonus_ID */
public static final String COLUMNNAME_C_CampaignBonus_ID = "C_CampaignBonus_ID";
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

@XendraTrl(Identifier="39ff73fc-bcfa-405d-4ea2-a38547355978")
public static String es_PE_FIELD_CampaignBonus_Campaign2_Name="Campaña";

@XendraTrl(Identifier="39ff73fc-bcfa-405d-4ea2-a38547355978")
public static String es_PE_FIELD_CampaignBonus_Campaign2_Description="Campaña de Mercadeo";

@XendraTrl(Identifier="39ff73fc-bcfa-405d-4ea2-a38547355978")
public static String es_PE_FIELD_CampaignBonus_Campaign2_Help="La Campaña define un programa de mercadotecnia único. Los proyectos pueden estar asociados con una campaña de mercadotecnia única. Usted puede entonces reportar basado en una campaña específica";

@XendraField(AD_Column_ID="C_Campaign_ID",IsCentrallyMaintained=true,
AD_Tab_ID="d34c28f8-0e41-e000-f10e-2d385f6b036a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="39ff73fc-bcfa-405d-4ea2-a38547355978")
public static final String FIELDNAME_CampaignBonus_Campaign2="39ff73fc-bcfa-405d-4ea2-a38547355978";

@XendraTrl(Identifier="9baeef6c-5ca8-f89d-82e0-bf5e156ce8bd")
public static String es_PE_COLUMN_C_Campaign_ID_Name="Campaign";

@XendraColumn(AD_Element_ID="6cf08e31-d355-ee38-9c0b-bee20b3ea5b6",ColumnName="C_Campaign_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9baeef6c-5ca8-f89d-82e0-bf5e156ce8bd",
Synchronized="2019-08-30 22:21:17.0")
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

@XendraTrl(Identifier="88a911ee-e032-d6c0-846e-aabfbcbe51d7")
public static String es_PE_FIELD_CampaignBonus_UOM_Name="UM";

@XendraTrl(Identifier="88a911ee-e032-d6c0-846e-aabfbcbe51d7")
public static String es_PE_FIELD_CampaignBonus_UOM_Description="Unidad de Medida";

@XendraTrl(Identifier="88a911ee-e032-d6c0-846e-aabfbcbe51d7")
public static String es_PE_FIELD_CampaignBonus_UOM_Help="La UM define una unidad de medida única no monetaria";

@XendraField(AD_Column_ID="C_UOM_ID",IsCentrallyMaintained=true,
AD_Tab_ID="d34c28f8-0e41-e000-f10e-2d385f6b036a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="88a911ee-e032-d6c0-846e-aabfbcbe51d7")
public static final String FIELDNAME_CampaignBonus_UOM="88a911ee-e032-d6c0-846e-aabfbcbe51d7";

@XendraTrl(Identifier="a5dc1630-8a95-d44d-bafc-32ab0a7dc070")
public static String es_PE_COLUMN_C_UOM_ID_Name="UOM";

@XendraColumn(AD_Element_ID="d0345019-4fcc-44c8-4fd1-e38e3b4adeed",ColumnName="C_UOM_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="107d46fd-952f-7ad3-6b0d-c74906c7b323",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="a5dc1630-8a95-d44d-bafc-32ab0a7dc070",Synchronized="2019-08-30 22:21:17.0")
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
@XendraTrl(Identifier="b68a6e8d-d3ad-4d44-8215-654c5d2a91df")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b68a6e8d-d3ad-4d44-8215-654c5d2a91df",
Synchronized="2019-08-30 22:21:17.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Exclude.
@param IsExclude Exclude access to the data - if not selected Include access to the data */
public void setIsExclude (boolean IsExclude)
{
set_Value (COLUMNNAME_IsExclude, Boolean.valueOf(IsExclude));
}
/** Get Exclude.
@return Exclude access to the data - if not selected Include access to the data */
public boolean isExclude() 
{
Object oo = get_Value(COLUMNNAME_IsExclude);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="6863763c-c29c-225d-c796-afedbcb84696")
public static String es_PE_FIELD_CampaignBonus_Exclude_Name="Excluir";

@XendraTrl(Identifier="6863763c-c29c-225d-c796-afedbcb84696")
public static String es_PE_FIELD_CampaignBonus_Exclude_Description="Excluir el acceso a los datos";

@XendraTrl(Identifier="6863763c-c29c-225d-c796-afedbcb84696")
public static String es_PE_FIELD_CampaignBonus_Exclude_Help="Si está seleccionado, el Rol no puede tener acceso a los datos especificos. Si no esta seleccionado, el Rol puede tener acceso SOLAMENTE a los datos especificos.";

@XendraField(AD_Column_ID="IsExclude",IsCentrallyMaintained=true,
AD_Tab_ID="d34c28f8-0e41-e000-f10e-2d385f6b036a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6863763c-c29c-225d-c796-afedbcb84696")
public static final String FIELDNAME_CampaignBonus_Exclude="6863763c-c29c-225d-c796-afedbcb84696";

@XendraTrl(Identifier="4c5f3aac-66bb-44b9-cb5b-1b724e3adf47")
public static String es_PE_COLUMN_IsExclude_Name="Exclude";

@XendraColumn(AD_Element_ID="770b492c-be75-a622-6c96-f202d97c4dfd",ColumnName="IsExclude",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4c5f3aac-66bb-44b9-cb5b-1b724e3adf47",
Synchronized="2019-08-30 22:21:17.0")
/** Column name IsExclude */
public static final String COLUMNNAME_IsExclude = "IsExclude";
/** Set Quantity based.
@param IsQuantityBased Trade discount break level based on Quantity (not value) */
public void setIsQuantityBased (boolean IsQuantityBased)
{
set_Value (COLUMNNAME_IsQuantityBased, Boolean.valueOf(IsQuantityBased));
}
/** Get Quantity based.
@return Trade discount break level based on Quantity (not value) */
public boolean isQuantityBased() 
{
Object oo = get_Value(COLUMNNAME_IsQuantityBased);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="59feca83-c072-f2b9-6932-d877e33c338f")
public static String es_PE_FIELD_CampaignBonus_QuantityBased_Name="Basado en cantidad";

@XendraTrl(Identifier="59feca83-c072-f2b9-6932-d877e33c338f")
public static String es_PE_FIELD_CampaignBonus_QuantityBased_Description="Nivel de corte del descuento comercial en cantidad (No en valor)";

@XendraTrl(Identifier="59feca83-c072-f2b9-6932-d877e33c338f")
public static String es_PE_FIELD_CampaignBonus_QuantityBased_Help="El cálculo del nivel de descuento comercial se basa en la cantidad de la orden y no en valor de la orden";

@XendraField(AD_Column_ID="IsQuantityBased",IsCentrallyMaintained=true,
AD_Tab_ID="d34c28f8-0e41-e000-f10e-2d385f6b036a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="59feca83-c072-f2b9-6932-d877e33c338f")
public static final String FIELDNAME_CampaignBonus_QuantityBased="59feca83-c072-f2b9-6932-d877e33c338f";

@XendraTrl(Identifier="686fcc1e-9d42-6621-b860-a4835acba88b")
public static String es_PE_COLUMN_IsQuantityBased_Name="Quantity based";

@XendraColumn(AD_Element_ID="e5a02afd-adea-c124-8552-6131fcf23917",ColumnName="IsQuantityBased",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="686fcc1e-9d42-6621-b860-a4835acba88b",
Synchronized="2019-08-30 22:21:17.0")
/** Column name IsQuantityBased */
public static final String COLUMNNAME_IsQuantityBased = "IsQuantityBased";
/** Set Product.
@param M_Product_ID Product, Service, Item */
public void setM_Product_ID (int M_Product_ID)
{
if (M_Product_ID < 1) throw new IllegalArgumentException ("M_Product_ID is mandatory.");
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

@XendraTrl(Identifier="cfc859fb-9851-be5d-b5ea-9a3513b6cc4c")
public static String es_PE_FIELD_CampaignBonus_Product_Name="Producto";

@XendraTrl(Identifier="cfc859fb-9851-be5d-b5ea-9a3513b6cc4c")
public static String es_PE_FIELD_CampaignBonus_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="cfc859fb-9851-be5d-b5ea-9a3513b6cc4c")
public static String es_PE_FIELD_CampaignBonus_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="d34c28f8-0e41-e000-f10e-2d385f6b036a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cfc859fb-9851-be5d-b5ea-9a3513b6cc4c")
public static final String FIELDNAME_CampaignBonus_Product="cfc859fb-9851-be5d-b5ea-9a3513b6cc4c";

@XendraTrl(Identifier="1d3f0dae-ebb9-4f19-3c65-f3fb023965ee")
public static String es_PE_COLUMN_M_Product_ID_Name="Product";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=2,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1d3f0dae-ebb9-4f19-3c65-f3fb023965ee",
Synchronized="2019-08-30 22:21:17.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
/** Set Search Key.
@param Value Search key for the record in the format required - must be unique */
public void setValue (String Value)
{
if (Value != null && Value.length() > 40)
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
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), getValue());
}

@XendraTrl(Identifier="c877a760-cfa8-3542-e6ae-a4243d5917a3")
public static String es_PE_FIELD_CampaignBonus_SearchKey_Name="Codigo";

@XendraTrl(Identifier="c877a760-cfa8-3542-e6ae-a4243d5917a3")
public static String es_PE_FIELD_CampaignBonus_SearchKey_Description="Clave de búsqueda para el registro en el formato requerido; debe ser única";

@XendraTrl(Identifier="c877a760-cfa8-3542-e6ae-a4243d5917a3")
public static String es_PE_FIELD_CampaignBonus_SearchKey_Help="Una clave de búsqueda le permite a usted un método rápido de encontrar un registro en particular";

@XendraField(AD_Column_ID="Value",IsCentrallyMaintained=true,
AD_Tab_ID="d34c28f8-0e41-e000-f10e-2d385f6b036a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c877a760-cfa8-3542-e6ae-a4243d5917a3")
public static final String FIELDNAME_CampaignBonus_SearchKey="c877a760-cfa8-3542-e6ae-a4243d5917a3";

@XendraTrl(Identifier="833729aa-7a47-dc60-64be-1ffbc2c9d632")
public static String es_PE_COLUMN_Value_Name="Search Key";

@XendraColumn(AD_Element_ID="e75e100c-9b41-a643-2cb3-46eeced683d8",ColumnName="Value",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="833729aa-7a47-dc60-64be-1ffbc2c9d632",
Synchronized="2019-08-30 22:21:17.0")
/** Column name Value */
public static final String COLUMNNAME_Value = "Value";
}
