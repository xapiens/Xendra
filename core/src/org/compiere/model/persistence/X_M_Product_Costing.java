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
/** Generated Model for M_Product_Costing
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_Product_Costing extends PO
{
/** Standard Constructor
@param ctx context
@param M_Product_Costing_ID id
@param trxName transaction
*/
public X_M_Product_Costing (Properties ctx, int M_Product_Costing_ID, String trxName)
{
super (ctx, M_Product_Costing_ID, trxName);
/** if (M_Product_Costing_ID == 0)
{
setCostAverage (Env.ZERO);
setCostAverageCumAmt (Env.ZERO);
setCostAverageCumQty (Env.ZERO);
setCostStandard (Env.ZERO);
setCostStandardCumAmt (Env.ZERO);
setCostStandardCumQty (Env.ZERO);
setCostStandardPOAmt (Env.ZERO);
setCostStandardPOQty (Env.ZERO);
setCurrentCostPrice (Env.ZERO);
setFutureCostPrice (Env.ZERO);
setM_Product_ID (0);
setPriceLastInv (Env.ZERO);
setPriceLastPO (Env.ZERO);
setTotalInvAmt (Env.ZERO);	
// 0
setTotalInvQty (Env.ZERO);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_M_Product_Costing (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=327 */
public static int Table_ID=MTable.getTable_ID("M_Product_Costing");

@XendraTrl(Identifier="2779e740-c788-442b-bd6d-4cd5535e3d99")
public static String es_PE_TAB_Cost_Description="Cost";

@XendraTrl(Identifier="2779e740-c788-442b-bd6d-4cd5535e3d99")
public static String es_PE_TAB_Cost_Help="Cost History";

@XendraTrl(Identifier="2779e740-c788-442b-bd6d-4cd5535e3d99")
public static String es_PE_TAB_Cost_Name="Cost";
@XendraTab(Name="Cost",Description="Cost",
Help="Cost History",AD_Window_ID="ce2d4e2c-ba4e-29bf-9f71-66fecdc05f55",SeqNo=45,TabLevel=1,
IsSingleRow=false,IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="eca82e20-fc03-8d9c-730f-8e5f2434cfcb",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="2779e740-c788-442b-bd6d-4cd5535e3d99",
Synchronized="2016-10-19 12:18:38.0")
public static final String TABNAME_Cost="2779e740-c788-442b-bd6d-4cd5535e3d99";

@XendraTrl(Identifier="6c5a0b96-45e2-624e-5845-883b310b570c")
public static String es_PE_TAB_CostingOld_Description="Definir Costeos";

@XendraTrl(Identifier="6c5a0b96-45e2-624e-5845-883b310b570c")
public static String es_PE_TAB_CostingOld_Help="La pestaña Costeo define el tipo de costeo usado en el sistema.";

@XendraTrl(Identifier="6c5a0b96-45e2-624e-5845-883b310b570c")
public static String es_PE_TAB_CostingOld_Name="Costeo";
@XendraTab(Name="Costing (old)",
Description="Old Product Costing Info",Help="",AD_Window_ID="8983f195-c186-47e9-7541-aa6e2d0eebfc",
SeqNo=120,TabLevel=1,IsSingleRow=true,IsInfoTab=true,IsTranslationTab=false,IsReadOnly=true,
AD_Column_ID="eca82e20-fc03-8d9c-730f-8e5f2434cfcb",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=false,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="6c5a0b96-45e2-624e-5845-883b310b570c",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_CostingOld="6c5a0b96-45e2-624e-5845-883b310b570c";

@XendraTrl(Identifier="d72e6674-f498-5a9c-20a6-8f32d8e78546")
public static String es_PE_TABLE_M_Product_Costing_Name="M_Product_Costing";

@XendraTable(Name="Product Costing",AD_Package_ID="2809ac2d-7d43-20f8-05f0-a478f2e50204",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="M_Product_Costing",AccessLevel="3",AD_Window_ID="ce2d4e2c-ba4e-29bf-9f71-66fecdc05f55",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.material",
Identifier="d72e6674-f498-5a9c-20a6-8f32d8e78546",Synchronized="2020-03-03 21:38:51.0")
/** TableName=M_Product_Costing */
public static final String Table_Name="M_Product_Costing";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_Product_Costing");

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
    Table_ID = MTable.getTable_ID("M_Product_Costing");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_Product_Costing[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Average Cost.
@param CostAverage Weighted average costs */
public void setCostAverage (BigDecimal CostAverage)
{
if (CostAverage == null) throw new IllegalArgumentException ("CostAverage is mandatory.");
set_ValueNoCheck (COLUMNNAME_CostAverage, CostAverage);
}
/** Get Average Cost.
@return Weighted average costs */
public BigDecimal getCostAverage() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CostAverage);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="dc005d15-b5a0-82cb-0d68-4c34f8c63b10")
public static String es_PE_FIELD_CostingOld_AverageCost_Name="Costo Promedio";

@XendraTrl(Identifier="dc005d15-b5a0-82cb-0d68-4c34f8c63b10")
public static String es_PE_FIELD_CostingOld_AverageCost_Description="Costo promedio ponderado";

@XendraTrl(Identifier="dc005d15-b5a0-82cb-0d68-4c34f8c63b10")
public static String es_PE_FIELD_CostingOld_AverageCost_Help="Costos promedio ponderado (actual)";

@XendraField(AD_Column_ID="CostAverage",IsCentrallyMaintained=true,
AD_Tab_ID="6c5a0b96-45e2-624e-5845-883b310b570c",AD_FieldGroup_ID="Actual Costs",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="dc005d15-b5a0-82cb-0d68-4c34f8c63b10")
public static final String FIELDNAME_CostingOld_AverageCost="dc005d15-b5a0-82cb-0d68-4c34f8c63b10";

@XendraTrl(Identifier="d4ce9129-4928-41e6-83c0-e722afee9b24")
public static String es_PE_FIELD_Cost_AverageCost_Name="Costo Promedio";

@XendraTrl(Identifier="d4ce9129-4928-41e6-83c0-e722afee9b24")
public static String es_PE_FIELD_Cost_AverageCost_Description="Costo promedio ponderado";

@XendraTrl(Identifier="d4ce9129-4928-41e6-83c0-e722afee9b24")
public static String es_PE_FIELD_Cost_AverageCost_Help="Costos promedio ponderado (actual)";

@XendraField(AD_Column_ID="CostAverage",IsCentrallyMaintained=true,
AD_Tab_ID="2779e740-c788-442b-bd6d-4cd5535e3d99",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-19 12:18:37.0",
Identifier="d4ce9129-4928-41e6-83c0-e722afee9b24")
public static final String FIELDNAME_Cost_AverageCost="d4ce9129-4928-41e6-83c0-e722afee9b24";

@XendraTrl(Identifier="686da55f-ba50-3587-2a18-af7c0d77f386")
public static String es_PE_COLUMN_CostAverage_Name="Costo Promedio";

@XendraColumn(AD_Element_ID="bdb0c682-9cd4-109c-972d-b83a69bc2fec",ColumnName="CostAverage",
AD_Reference_ID=37,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="686da55f-ba50-3587-2a18-af7c0d77f386",
Synchronized="2019-08-30 22:23:26.0")
/** Column name CostAverage */
public static final String COLUMNNAME_CostAverage = "CostAverage";
/** Set Average Cost Amount Sum.
@param CostAverageCumAmt Cumulative average cost amounts (internal) */
public void setCostAverageCumAmt (BigDecimal CostAverageCumAmt)
{
if (CostAverageCumAmt == null) throw new IllegalArgumentException ("CostAverageCumAmt is mandatory.");
set_ValueNoCheck (COLUMNNAME_CostAverageCumAmt, CostAverageCumAmt);
}
/** Get Average Cost Amount Sum.
@return Cumulative average cost amounts (internal) */
public BigDecimal getCostAverageCumAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CostAverageCumAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="135372cd-73ae-c385-80bc-f9a214df53f5")
public static String es_PE_FIELD_CostingOld_AverageCostAmountSum_Name="Costo Promedio Acumulado";

@XendraTrl(Identifier="135372cd-73ae-c385-80bc-f9a214df53f5")
public static String es_PE_FIELD_CostingOld_AverageCostAmountSum_Description="Total acumulado actual para el cálculo del costo promedio (interno)";

@XendraTrl(Identifier="135372cd-73ae-c385-80bc-f9a214df53f5")
public static String es_PE_FIELD_CostingOld_AverageCostAmountSum_Help="Costos actuales acumulados para calcular los costos promedio";

@XendraField(AD_Column_ID="CostAverageCumAmt",IsCentrallyMaintained=true,
AD_Tab_ID="6c5a0b96-45e2-624e-5845-883b310b570c",AD_FieldGroup_ID="Actual Costs",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="135372cd-73ae-c385-80bc-f9a214df53f5")
public static final String FIELDNAME_CostingOld_AverageCostAmountSum="135372cd-73ae-c385-80bc-f9a214df53f5";

@XendraTrl(Identifier="b5bf7760-c384-4849-bea2-7ce16fca0379")
public static String es_PE_FIELD_Cost_AverageCostAmountSum_Name="Costo Promedio Acumulado";

@XendraTrl(Identifier="b5bf7760-c384-4849-bea2-7ce16fca0379")
public static String es_PE_FIELD_Cost_AverageCostAmountSum_Description="Total acumulado actual para el cálculo del costo promedio (interno)";

@XendraTrl(Identifier="b5bf7760-c384-4849-bea2-7ce16fca0379")
public static String es_PE_FIELD_Cost_AverageCostAmountSum_Help="Costos actuales acumulados para calcular los costos promedio";

@XendraField(AD_Column_ID="CostAverageCumAmt",IsCentrallyMaintained=true,
AD_Tab_ID="2779e740-c788-442b-bd6d-4cd5535e3d99",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-19 12:18:37.0",
Identifier="b5bf7760-c384-4849-bea2-7ce16fca0379")
public static final String FIELDNAME_Cost_AverageCostAmountSum="b5bf7760-c384-4849-bea2-7ce16fca0379";

@XendraTrl(Identifier="b91b50ea-fb09-42e4-360d-3e89fc03cd6d")
public static String es_PE_COLUMN_CostAverageCumAmt_Name="Costo Promedio Acumulado";

@XendraColumn(AD_Element_ID="643e5744-3953-6b2c-132f-f423f9e8b237",ColumnName="CostAverageCumAmt",
AD_Reference_ID=37,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b91b50ea-fb09-42e4-360d-3e89fc03cd6d",
Synchronized="2019-08-30 22:23:26.0")
/** Column name CostAverageCumAmt */
public static final String COLUMNNAME_CostAverageCumAmt = "CostAverageCumAmt";
/** Set Average Cost Quantity Sum.
@param CostAverageCumQty Cumulative average cost quantities (internal) */
public void setCostAverageCumQty (BigDecimal CostAverageCumQty)
{
if (CostAverageCumQty == null) throw new IllegalArgumentException ("CostAverageCumQty is mandatory.");
set_ValueNoCheck (COLUMNNAME_CostAverageCumQty, CostAverageCumQty);
}
/** Get Average Cost Quantity Sum.
@return Cumulative average cost quantities (internal) */
public BigDecimal getCostAverageCumQty() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CostAverageCumQty);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="ff8c3f29-96f4-cde1-02b6-33891003b33a")
public static String es_PE_FIELD_CostingOld_AverageCostQuantitySum_Name="Cantidad  Promedio Acumulada";

@XendraTrl(Identifier="ff8c3f29-96f4-cde1-02b6-33891003b33a")
public static String es_PE_FIELD_CostingOld_AverageCostQuantitySum_Description="Cantidad acumulada para cálculo de costo promedio (interno)";

@XendraTrl(Identifier="ff8c3f29-96f4-cde1-02b6-33891003b33a")
public static String es_PE_FIELD_CostingOld_AverageCostQuantitySum_Help="Cantidad Acumulada Actual para calcular los costos promedio";

@XendraField(AD_Column_ID="CostAverageCumQty",IsCentrallyMaintained=true,
AD_Tab_ID="6c5a0b96-45e2-624e-5845-883b310b570c",AD_FieldGroup_ID="Actual Costs",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=90,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ff8c3f29-96f4-cde1-02b6-33891003b33a")
public static final String FIELDNAME_CostingOld_AverageCostQuantitySum="ff8c3f29-96f4-cde1-02b6-33891003b33a";

@XendraTrl(Identifier="d7ba3b28-c9af-4939-bb6a-8f728b4519a4")
public static String es_PE_FIELD_Cost_AverageCostQuantitySum_Name="Cantidad  Promedio Acumulada";

@XendraTrl(Identifier="d7ba3b28-c9af-4939-bb6a-8f728b4519a4")
public static String es_PE_FIELD_Cost_AverageCostQuantitySum_Description="Cantidad acumulada para cálculo de costo promedio (interno)";

@XendraTrl(Identifier="d7ba3b28-c9af-4939-bb6a-8f728b4519a4")
public static String es_PE_FIELD_Cost_AverageCostQuantitySum_Help="Cantidad Acumulada Actual para calcular los costos promedio";

@XendraField(AD_Column_ID="CostAverageCumQty",IsCentrallyMaintained=true,
AD_Tab_ID="2779e740-c788-442b-bd6d-4cd5535e3d99",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-19 12:18:37.0",
Identifier="d7ba3b28-c9af-4939-bb6a-8f728b4519a4")
public static final String FIELDNAME_Cost_AverageCostQuantitySum="d7ba3b28-c9af-4939-bb6a-8f728b4519a4";

@XendraTrl(Identifier="f7f5b8e7-115c-c066-1576-8801b0a83ac3")
public static String es_PE_COLUMN_CostAverageCumQty_Name="Cantidad  Promedio Acumulada";

@XendraColumn(AD_Element_ID="02f463ea-d41a-edcd-94d2-c01433dbbdfc",ColumnName="CostAverageCumQty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f7f5b8e7-115c-c066-1576-8801b0a83ac3",
Synchronized="2019-08-30 22:23:26.0")
/** Column name CostAverageCumQty */
public static final String COLUMNNAME_CostAverageCumQty = "CostAverageCumQty";
/** Set Standard Cost.
@param CostStandard Standard Costs */
public void setCostStandard (BigDecimal CostStandard)
{
if (CostStandard == null) throw new IllegalArgumentException ("CostStandard is mandatory.");
set_ValueNoCheck (COLUMNNAME_CostStandard, CostStandard);
}
/** Get Standard Cost.
@return Standard Costs */
public BigDecimal getCostStandard() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CostStandard);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="03f0e84c-e853-8eb8-4f47-b6220b152c8e")
public static String es_PE_FIELD_CostingOld_StandardCost_Name="Costo Estándar";

@XendraTrl(Identifier="03f0e84c-e853-8eb8-4f47-b6220b152c8e")
public static String es_PE_FIELD_CostingOld_StandardCost_Description="Costo Estándar";

@XendraTrl(Identifier="03f0e84c-e853-8eb8-4f47-b6220b152c8e")
public static String es_PE_FIELD_CostingOld_StandardCost_Help="Costos Estándar (Plan)";

@XendraField(AD_Column_ID="CostStandard",IsCentrallyMaintained=true,
AD_Tab_ID="6c5a0b96-45e2-624e-5845-883b310b570c",AD_FieldGroup_ID="Standard Cost",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="03f0e84c-e853-8eb8-4f47-b6220b152c8e")
public static final String FIELDNAME_CostingOld_StandardCost="03f0e84c-e853-8eb8-4f47-b6220b152c8e";

@XendraTrl(Identifier="1663b49b-33fd-4bf3-a175-f734b435fd3f")
public static String es_PE_FIELD_Cost_StandardCost_Name="Costo Estándar";

@XendraTrl(Identifier="1663b49b-33fd-4bf3-a175-f734b435fd3f")
public static String es_PE_FIELD_Cost_StandardCost_Description="Costo Estándar";

@XendraTrl(Identifier="1663b49b-33fd-4bf3-a175-f734b435fd3f")
public static String es_PE_FIELD_Cost_StandardCost_Help="Costos Estándar (Plan)";

@XendraField(AD_Column_ID="CostStandard",IsCentrallyMaintained=true,
AD_Tab_ID="2779e740-c788-442b-bd6d-4cd5535e3d99",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-19 12:18:37.0",
Identifier="1663b49b-33fd-4bf3-a175-f734b435fd3f")
public static final String FIELDNAME_Cost_StandardCost="1663b49b-33fd-4bf3-a175-f734b435fd3f";

@XendraTrl(Identifier="23e11c2a-a61c-9981-3111-74a473ede8d2")
public static String es_PE_COLUMN_CostStandard_Name="Costo Estándar";

@XendraColumn(AD_Element_ID="85a07b95-ef79-5555-7c3c-e9c25a74eae9",ColumnName="CostStandard",
AD_Reference_ID=37,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="23e11c2a-a61c-9981-3111-74a473ede8d2",
Synchronized="2019-08-30 22:23:26.0")
/** Column name CostStandard */
public static final String COLUMNNAME_CostStandard = "CostStandard";
/** Set Std Cost Amount Sum.
@param CostStandardCumAmt Standard Cost Invoice Amount Sum (internal) */
public void setCostStandardCumAmt (BigDecimal CostStandardCumAmt)
{
if (CostStandardCumAmt == null) throw new IllegalArgumentException ("CostStandardCumAmt is mandatory.");
set_ValueNoCheck (COLUMNNAME_CostStandardCumAmt, CostStandardCumAmt);
}
/** Get Std Cost Amount Sum.
@return Standard Cost Invoice Amount Sum (internal) */
public BigDecimal getCostStandardCumAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CostStandardCumAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="f996639d-0c25-cd04-8ca6-d783694de383")
public static String es_PE_FIELD_CostingOld_StdCostAmountSum_Name="Costo Estándar de Factura Acumulado";

@XendraTrl(Identifier="f996639d-0c25-cd04-8ca6-d783694de383")
public static String es_PE_FIELD_CostingOld_StdCostAmountSum_Description="Total acumulado de la factura para el cálculo del costo estándar interno";

@XendraTrl(Identifier="f996639d-0c25-cd04-8ca6-d783694de383")
public static String es_PE_FIELD_CostingOld_StdCostAmountSum_Help="Total acumulado actual para calcular la diferencia en costo estándar basada en el precio de la factura (actual)";

@XendraField(AD_Column_ID="CostStandardCumAmt",IsCentrallyMaintained=true,
AD_Tab_ID="6c5a0b96-45e2-624e-5845-883b310b570c",AD_FieldGroup_ID="Standard Cost",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f996639d-0c25-cd04-8ca6-d783694de383")
public static final String FIELDNAME_CostingOld_StdCostAmountSum="f996639d-0c25-cd04-8ca6-d783694de383";

@XendraTrl(Identifier="5ad0dd61-62df-4d1f-9259-4f674002303c")
public static String es_PE_FIELD_Cost_StdCostAmountSum_Name="Costo Estándar de Factura Acumulado";

@XendraTrl(Identifier="5ad0dd61-62df-4d1f-9259-4f674002303c")
public static String es_PE_FIELD_Cost_StdCostAmountSum_Description="Total acumulado de la factura para el cálculo del costo estándar interno";

@XendraTrl(Identifier="5ad0dd61-62df-4d1f-9259-4f674002303c")
public static String es_PE_FIELD_Cost_StdCostAmountSum_Help="Total acumulado actual para calcular la diferencia en costo estándar basada en el precio de la factura (actual)";

@XendraField(AD_Column_ID="CostStandardCumAmt",IsCentrallyMaintained=true,
AD_Tab_ID="2779e740-c788-442b-bd6d-4cd5535e3d99",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-19 12:18:37.0",
Identifier="5ad0dd61-62df-4d1f-9259-4f674002303c")
public static final String FIELDNAME_Cost_StdCostAmountSum="5ad0dd61-62df-4d1f-9259-4f674002303c";

@XendraTrl(Identifier="2cb2a4c5-d174-fcac-95c2-19037c517bc6")
public static String es_PE_COLUMN_CostStandardCumAmt_Name="Costo Estándar de Factura Acumulado";

@XendraColumn(AD_Element_ID="d12c571d-0d24-c3db-7745-7d82ee9ecda0",ColumnName="CostStandardCumAmt",
AD_Reference_ID=37,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2cb2a4c5-d174-fcac-95c2-19037c517bc6",
Synchronized="2019-08-30 22:23:26.0")
/** Column name CostStandardCumAmt */
public static final String COLUMNNAME_CostStandardCumAmt = "CostStandardCumAmt";
/** Set Std Cost Quantity Sum.
@param CostStandardCumQty Standard Cost Invoice Quantity Sum (internal) */
public void setCostStandardCumQty (BigDecimal CostStandardCumQty)
{
if (CostStandardCumQty == null) throw new IllegalArgumentException ("CostStandardCumQty is mandatory.");
set_ValueNoCheck (COLUMNNAME_CostStandardCumQty, CostStandardCumQty);
}
/** Get Std Cost Quantity Sum.
@return Standard Cost Invoice Quantity Sum (internal) */
public BigDecimal getCostStandardCumQty() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CostStandardCumQty);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="56012e01-7c08-03e2-492e-551bdcaff4a5")
public static String es_PE_FIELD_CostingOld_StdCostQuantitySum_Name="Cantidad de la Factura Acumulada";

@XendraTrl(Identifier="56012e01-7c08-03e2-492e-551bdcaff4a5")
public static String es_PE_FIELD_CostingOld_StdCostQuantitySum_Description="Cantidad acumulada de la factura para el cálculo del costo estándar interno";

@XendraTrl(Identifier="56012e01-7c08-03e2-492e-551bdcaff4a5")
public static String es_PE_FIELD_CostingOld_StdCostQuantitySum_Help="Cantidad Acumulada Actual para calcular la diferencia en costo estándar basada en el precio de la factura (actual)";

@XendraField(AD_Column_ID="CostStandardCumQty",IsCentrallyMaintained=true,
AD_Tab_ID="6c5a0b96-45e2-624e-5845-883b310b570c",AD_FieldGroup_ID="Standard Cost",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=150,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="56012e01-7c08-03e2-492e-551bdcaff4a5")
public static final String FIELDNAME_CostingOld_StdCostQuantitySum="56012e01-7c08-03e2-492e-551bdcaff4a5";

@XendraTrl(Identifier="69947fbb-5455-463f-afb4-ec705a42b737")
public static String es_PE_FIELD_Cost_StdCostQuantitySum_Name="Cantidad de la Factura Acumulada";

@XendraTrl(Identifier="69947fbb-5455-463f-afb4-ec705a42b737")
public static String es_PE_FIELD_Cost_StdCostQuantitySum_Description="Cantidad acumulada de la factura para el cálculo del costo estándar interno";

@XendraTrl(Identifier="69947fbb-5455-463f-afb4-ec705a42b737")
public static String es_PE_FIELD_Cost_StdCostQuantitySum_Help="Cantidad Acumulada Actual para calcular la diferencia en costo estándar basada en el precio de la factura (actual)";

@XendraField(AD_Column_ID="CostStandardCumQty",IsCentrallyMaintained=true,
AD_Tab_ID="2779e740-c788-442b-bd6d-4cd5535e3d99",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-19 12:18:37.0",
Identifier="69947fbb-5455-463f-afb4-ec705a42b737")
public static final String FIELDNAME_Cost_StdCostQuantitySum="69947fbb-5455-463f-afb4-ec705a42b737";

@XendraTrl(Identifier="80ba2659-b30e-214f-c163-25493d79e434")
public static String es_PE_COLUMN_CostStandardCumQty_Name="Cantidad de la Factura Acumulada";

@XendraColumn(AD_Element_ID="fa7bbe70-4a59-8942-7164-f98d170b51ca",ColumnName="CostStandardCumQty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="80ba2659-b30e-214f-c163-25493d79e434",
Synchronized="2019-08-30 22:23:26.0")
/** Column name CostStandardCumQty */
public static final String COLUMNNAME_CostStandardCumQty = "CostStandardCumQty";
/** Set Std PO Cost Amount Sum.
@param CostStandardPOAmt Standard Cost Purchase Order Amount Sum (internal) */
public void setCostStandardPOAmt (BigDecimal CostStandardPOAmt)
{
if (CostStandardPOAmt == null) throw new IllegalArgumentException ("CostStandardPOAmt is mandatory.");
set_ValueNoCheck (COLUMNNAME_CostStandardPOAmt, CostStandardPOAmt);
}
/** Get Std PO Cost Amount Sum.
@return Standard Cost Purchase Order Amount Sum (internal) */
public BigDecimal getCostStandardPOAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CostStandardPOAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="bbfaeefe-792b-34d6-29f3-38899220b101")
public static String es_PE_FIELD_CostingOld_StdPOCostAmountSum_Name="Costo Acumulado de OC";

@XendraTrl(Identifier="bbfaeefe-792b-34d6-29f3-38899220b101")
public static String es_PE_FIELD_CostingOld_StdPOCostAmountSum_Description="Total acumulado de la orden de compra para el cálculo del costo estándar interno";

@XendraTrl(Identifier="bbfaeefe-792b-34d6-29f3-38899220b101")
public static String es_PE_FIELD_CostingOld_StdPOCostAmountSum_Help="Total acumulado actual para calcular la diferencia en costo estándar basada en el precio de la orden de compra (planeado)";

@XendraField(AD_Column_ID="CostStandardPOAmt",IsCentrallyMaintained=true,
AD_Tab_ID="6c5a0b96-45e2-624e-5845-883b310b570c",AD_FieldGroup_ID="Standard Cost",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bbfaeefe-792b-34d6-29f3-38899220b101")
public static final String FIELDNAME_CostingOld_StdPOCostAmountSum="bbfaeefe-792b-34d6-29f3-38899220b101";

@XendraTrl(Identifier="d7f72eb1-dd66-4335-9733-ef255f45b5bd")
public static String es_PE_FIELD_Cost_StdPOCostAmountSum_Name="Costo Acumulado de OC";

@XendraTrl(Identifier="d7f72eb1-dd66-4335-9733-ef255f45b5bd")
public static String es_PE_FIELD_Cost_StdPOCostAmountSum_Description="Total acumulado de la orden de compra para el cálculo del costo estándar interno";

@XendraTrl(Identifier="d7f72eb1-dd66-4335-9733-ef255f45b5bd")
public static String es_PE_FIELD_Cost_StdPOCostAmountSum_Help="Total acumulado actual para calcular la diferencia en costo estándar basada en el precio de la orden de compra (planeado)";

@XendraField(AD_Column_ID="CostStandardPOAmt",IsCentrallyMaintained=true,
AD_Tab_ID="2779e740-c788-442b-bd6d-4cd5535e3d99",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-19 12:18:37.0",
Identifier="d7f72eb1-dd66-4335-9733-ef255f45b5bd")
public static final String FIELDNAME_Cost_StdPOCostAmountSum="d7f72eb1-dd66-4335-9733-ef255f45b5bd";

@XendraTrl(Identifier="87277883-2d9c-c046-b027-d877d61478ff")
public static String es_PE_COLUMN_CostStandardPOAmt_Name="Costo Acumulado de OC";

@XendraColumn(AD_Element_ID="5a818b63-ad20-7953-3488-6fe88342611a",ColumnName="CostStandardPOAmt",
AD_Reference_ID=37,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="87277883-2d9c-c046-b027-d877d61478ff",
Synchronized="2019-08-30 22:23:26.0")
/** Column name CostStandardPOAmt */
public static final String COLUMNNAME_CostStandardPOAmt = "CostStandardPOAmt";
/** Set Std PO Cost Quantity Sum.
@param CostStandardPOQty Standard Cost Purchase Order Quantity Sum (internal) */
public void setCostStandardPOQty (BigDecimal CostStandardPOQty)
{
if (CostStandardPOQty == null) throw new IllegalArgumentException ("CostStandardPOQty is mandatory.");
set_ValueNoCheck (COLUMNNAME_CostStandardPOQty, CostStandardPOQty);
}
/** Get Std PO Cost Quantity Sum.
@return Standard Cost Purchase Order Quantity Sum (internal) */
public BigDecimal getCostStandardPOQty() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CostStandardPOQty);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="a730ce32-9e40-cf95-3fd6-4bb3f6123563")
public static String es_PE_FIELD_CostingOld_StdPOCostQuantitySum_Name="Cantidad Acumulada de la OC";

@XendraTrl(Identifier="a730ce32-9e40-cf95-3fd6-4bb3f6123563")
public static String es_PE_FIELD_CostingOld_StdPOCostQuantitySum_Description="Cantidad acumulado de la orden de compra para el cálculo del costo estándar interno)";

@XendraTrl(Identifier="a730ce32-9e40-cf95-3fd6-4bb3f6123563")
public static String es_PE_FIELD_CostingOld_StdPOCostQuantitySum_Help="Cantidad Acumulada Actual para calcular la diferencia en costo estándar basada en el precio de la orden de compra (planeada)";

@XendraField(AD_Column_ID="CostStandardPOQty",IsCentrallyMaintained=true,
AD_Tab_ID="6c5a0b96-45e2-624e-5845-883b310b570c",AD_FieldGroup_ID="Standard Cost",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=130,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a730ce32-9e40-cf95-3fd6-4bb3f6123563")
public static final String FIELDNAME_CostingOld_StdPOCostQuantitySum="a730ce32-9e40-cf95-3fd6-4bb3f6123563";

@XendraTrl(Identifier="98a01e97-b406-44c3-ac5e-33ef99d3a56c")
public static String es_PE_FIELD_Cost_StdPOCostQuantitySum_Name="Cantidad Acumulada de la OC";

@XendraTrl(Identifier="98a01e97-b406-44c3-ac5e-33ef99d3a56c")
public static String es_PE_FIELD_Cost_StdPOCostQuantitySum_Description="Cantidad acumulado de la orden de compra para el cálculo del costo estándar interno)";

@XendraTrl(Identifier="98a01e97-b406-44c3-ac5e-33ef99d3a56c")
public static String es_PE_FIELD_Cost_StdPOCostQuantitySum_Help="Cantidad Acumulada Actual para calcular la diferencia en costo estándar basada en el precio de la orden de compra (planeada)";

@XendraField(AD_Column_ID="CostStandardPOQty",IsCentrallyMaintained=true,
AD_Tab_ID="2779e740-c788-442b-bd6d-4cd5535e3d99",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-19 12:18:37.0",
Identifier="98a01e97-b406-44c3-ac5e-33ef99d3a56c")
public static final String FIELDNAME_Cost_StdPOCostQuantitySum="98a01e97-b406-44c3-ac5e-33ef99d3a56c";

@XendraTrl(Identifier="34a9e587-18f0-a1d6-ef8f-e07958eee396")
public static String es_PE_COLUMN_CostStandardPOQty_Name="Cantidad Acumulada de la OC";

@XendraColumn(AD_Element_ID="d16ff6ef-c63b-0bf3-9874-138ba45fd878",ColumnName="CostStandardPOQty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="34a9e587-18f0-a1d6-ef8f-e07958eee396",
Synchronized="2019-08-30 22:23:26.0")
/** Column name CostStandardPOQty */
public static final String COLUMNNAME_CostStandardPOQty = "CostStandardPOQty";
/** Set Period.
@param C_Period_ID Period of the Calendar */
public void setC_Period_ID (int C_Period_ID)
{
if (C_Period_ID <= 0) set_Value (COLUMNNAME_C_Period_ID, null);
 else 
set_Value (COLUMNNAME_C_Period_ID, Integer.valueOf(C_Period_ID));
}
/** Get Period.
@return Period of the Calendar */
public int getC_Period_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Period_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="3d9a4b74-80fe-40d2-8823-6db893ac320f")
public static String es_PE_FIELD_Cost_Period_Name="Período";

@XendraTrl(Identifier="3d9a4b74-80fe-40d2-8823-6db893ac320f")
public static String es_PE_FIELD_Cost_Period_Description="Período de Calendario";

@XendraTrl(Identifier="3d9a4b74-80fe-40d2-8823-6db893ac320f")
public static String es_PE_FIELD_Cost_Period_Help="El Período indica un rango de fechas exclusivo para un calendario";

@XendraField(AD_Column_ID="C_Period_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2779e740-c788-442b-bd6d-4cd5535e3d99",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-19 12:18:37.0",
Identifier="3d9a4b74-80fe-40d2-8823-6db893ac320f")
public static final String FIELDNAME_Cost_Period="3d9a4b74-80fe-40d2-8823-6db893ac320f";

@XendraTrl(Identifier="0f15a054-8ecf-4583-ac14-ed03ce3a51f2")
public static String es_PE_COLUMN_C_Period_ID_Name="Period";

@XendraColumn(AD_Element_ID="8f295c04-0eb4-a8f3-829f-cc6a6bd1df1e",ColumnName="C_Period_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0f15a054-8ecf-4583-ac14-ed03ce3a51f2",
Synchronized="2019-08-30 22:23:26.0")
/** Column name C_Period_ID */
public static final String COLUMNNAME_C_Period_ID = "C_Period_ID";
/** Set Current Cost Price.
@param CurrentCostPrice The currently used cost price */
public void setCurrentCostPrice (BigDecimal CurrentCostPrice)
{
if (CurrentCostPrice == null) throw new IllegalArgumentException ("CurrentCostPrice is mandatory.");
set_Value (COLUMNNAME_CurrentCostPrice, CurrentCostPrice);
}
/** Get Current Cost Price.
@return The currently used cost price */
public BigDecimal getCurrentCostPrice() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CurrentCostPrice);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="ebb51a1a-d458-b803-bdee-f018c6260c50")
public static String es_PE_FIELD_CostingOld_CurrentCostPrice_Name="Costo Actual";

@XendraTrl(Identifier="ebb51a1a-d458-b803-bdee-f018c6260c50")
public static String es_PE_FIELD_CostingOld_CurrentCostPrice_Description="Costo usado actualmente";

@XendraField(AD_Column_ID="CurrentCostPrice",IsCentrallyMaintained=true,
AD_Tab_ID="6c5a0b96-45e2-624e-5845-883b310b570c",AD_FieldGroup_ID="General",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ebb51a1a-d458-b803-bdee-f018c6260c50")
public static final String FIELDNAME_CostingOld_CurrentCostPrice="ebb51a1a-d458-b803-bdee-f018c6260c50";

@XendraTrl(Identifier="9fc82891-87a0-466e-b1e0-f56117208c89")
public static String es_PE_FIELD_Cost_CurrentCostPrice_Name="Costo Actual";

@XendraTrl(Identifier="9fc82891-87a0-466e-b1e0-f56117208c89")
public static String es_PE_FIELD_Cost_CurrentCostPrice_Description="Costo usado actualmente";

@XendraField(AD_Column_ID="CurrentCostPrice",IsCentrallyMaintained=true,
AD_Tab_ID="2779e740-c788-442b-bd6d-4cd5535e3d99",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-19 12:18:37.0",
Identifier="9fc82891-87a0-466e-b1e0-f56117208c89")
public static final String FIELDNAME_Cost_CurrentCostPrice="9fc82891-87a0-466e-b1e0-f56117208c89";

@XendraTrl(Identifier="d4a6c198-5656-6c3b-5a6e-9056ffa2586e")
public static String es_PE_COLUMN_CurrentCostPrice_Name="Costo Actual";

@XendraColumn(AD_Element_ID="d07935b6-9cf0-08b3-6cd9-004592823010",ColumnName="CurrentCostPrice",
AD_Reference_ID=37,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d4a6c198-5656-6c3b-5a6e-9056ffa2586e",
Synchronized="2019-08-30 22:23:26.0")
/** Column name CurrentCostPrice */
public static final String COLUMNNAME_CurrentCostPrice = "CurrentCostPrice";
/** Set Error Msg.
@param ErrorMsg Error Msg */
public void setErrorMsg (String ErrorMsg)
{
set_Value (COLUMNNAME_ErrorMsg, ErrorMsg);
}
/** Get Error Msg.
@return Error Msg */
public String getErrorMsg() 
{
String value = (String)get_Value(COLUMNNAME_ErrorMsg);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="91589b50-c705-4899-94e3-22cc951daf49")
public static String es_PE_FIELD_Cost_ErrorMsg_Name="Mensaje de Error";

@XendraField(AD_Column_ID="ErrorMsg",IsCentrallyMaintained=true,
AD_Tab_ID="2779e740-c788-442b-bd6d-4cd5535e3d99",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=2000,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-19 12:18:37.0",
Identifier="91589b50-c705-4899-94e3-22cc951daf49")
public static final String FIELDNAME_Cost_ErrorMsg="91589b50-c705-4899-94e3-22cc951daf49";

@XendraTrl(Identifier="15f7a901-be48-475f-8f23-150b5ad2be07")
public static String es_PE_COLUMN_ErrorMsg_Name="Error Msg";

@XendraColumn(AD_Element_ID="7ed8e902-7223-0140-a5e2-159d12a79a58",ColumnName="ErrorMsg",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="15f7a901-be48-475f-8f23-150b5ad2be07",
Synchronized="2019-08-30 22:23:26.0")
/** Column name ErrorMsg */
public static final String COLUMNNAME_ErrorMsg = "ErrorMsg";
/** Set Future Cost Price.
@param FutureCostPrice Future Cost Price */
public void setFutureCostPrice (BigDecimal FutureCostPrice)
{
if (FutureCostPrice == null) throw new IllegalArgumentException ("FutureCostPrice is mandatory.");
set_Value (COLUMNNAME_FutureCostPrice, FutureCostPrice);
}
/** Get Future Cost Price.
@return Future Cost Price */
public BigDecimal getFutureCostPrice() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_FutureCostPrice);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="67fa86cf-86a1-014a-8f93-4d2fdfc2dbd3")
public static String es_PE_FIELD_CostingOld_FutureCostPrice_Name="Costo Futuro";

@XendraField(AD_Column_ID="FutureCostPrice",IsCentrallyMaintained=true,
AD_Tab_ID="6c5a0b96-45e2-624e-5845-883b310b570c",AD_FieldGroup_ID="Standard Cost",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="67fa86cf-86a1-014a-8f93-4d2fdfc2dbd3")
public static final String FIELDNAME_CostingOld_FutureCostPrice="67fa86cf-86a1-014a-8f93-4d2fdfc2dbd3";

@XendraTrl(Identifier="8f837168-1821-4ad3-b2b6-b5f26f73d9ca")
public static String es_PE_FIELD_Cost_FutureCostPrice_Name="Costo Futuro";

@XendraField(AD_Column_ID="FutureCostPrice",IsCentrallyMaintained=true,
AD_Tab_ID="2779e740-c788-442b-bd6d-4cd5535e3d99",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-19 12:18:37.0",
Identifier="8f837168-1821-4ad3-b2b6-b5f26f73d9ca")
public static final String FIELDNAME_Cost_FutureCostPrice="8f837168-1821-4ad3-b2b6-b5f26f73d9ca";

@XendraTrl(Identifier="76df9b88-1292-9fdc-0158-6d6222815e72")
public static String es_PE_COLUMN_FutureCostPrice_Name="Costo Futuro";

@XendraColumn(AD_Element_ID="92208d2e-943b-0866-3053-e94a7efb0b73",ColumnName="FutureCostPrice",
AD_Reference_ID=37,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="76df9b88-1292-9fdc-0158-6d6222815e72",
Synchronized="2019-08-30 22:23:26.0")
/** Column name FutureCostPrice */
public static final String COLUMNNAME_FutureCostPrice = "FutureCostPrice";
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
@XendraTrl(Identifier="54b897e5-c7ee-4bbe-863c-bc428433c533")
public static String es_PE_FIELD_Cost_Identifier_Name="Identifier";

@XendraField(AD_Column_ID="Identifier",IsCentrallyMaintained=true,
AD_Tab_ID="2779e740-c788-442b-bd6d-4cd5535e3d99",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=36,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-19 12:18:37.0",
Identifier="54b897e5-c7ee-4bbe-863c-bc428433c533")
public static final String FIELDNAME_Cost_Identifier="54b897e5-c7ee-4bbe-863c-bc428433c533";

@XendraTrl(Identifier="edab8d62-e215-4113-8063-6196f76ba1a5")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="edab8d62-e215-4113-8063-6196f76ba1a5",
Synchronized="2019-08-30 22:23:26.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set LastCosted.
@param LastCosted LastCosted */
public void setLastCosted (Timestamp LastCosted)
{
set_Value (COLUMNNAME_LastCosted, LastCosted);
}
/** Get LastCosted.
@return LastCosted */
public Timestamp getLastCosted() 
{
return (Timestamp)get_Value(COLUMNNAME_LastCosted);
}

@XendraTrl(Identifier="effbb6ca-d877-417d-9d7d-b30f465fbf08")
public static String es_PE_FIELD_Cost_LastCosted_Name="lastcosted";

@XendraField(AD_Column_ID="LastCosted",IsCentrallyMaintained=true,
AD_Tab_ID="2779e740-c788-442b-bd6d-4cd5535e3d99",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=29,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-19 12:18:37.0",
Identifier="effbb6ca-d877-417d-9d7d-b30f465fbf08")
public static final String FIELDNAME_Cost_LastCosted="effbb6ca-d877-417d-9d7d-b30f465fbf08";

@XendraTrl(Identifier="4935236e-e9e8-4090-a1a6-7a3215e9f9e0")
public static String es_PE_COLUMN_LastCosted_Name="lastcosted";

@XendraColumn(AD_Element_ID="13460917-cbad-45c0-a98e-aa5d708aeb80",ColumnName="LastCosted",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4935236e-e9e8-4090-a1a6-7a3215e9f9e0",
Synchronized="2019-08-30 22:23:26.0")
/** Column name LastCosted */
public static final String COLUMNNAME_LastCosted = "LastCosted";
/** Set Cost Calc.
@param M_CostCalc_ID Cost Calc */
public void setM_CostCalc_ID (int M_CostCalc_ID)
{
if (M_CostCalc_ID <= 0) set_Value (COLUMNNAME_M_CostCalc_ID, null);
 else 
set_Value (COLUMNNAME_M_CostCalc_ID, Integer.valueOf(M_CostCalc_ID));
}
/** Get Cost Calc.
@return Cost Calc */
public int getM_CostCalc_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_CostCalc_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="0c71e5d3-6660-4a1b-998a-5576f7c8311e")
public static String es_PE_FIELD_Cost_CostCalc_Name="Cost Calc";

@XendraField(AD_Column_ID="M_CostCalc_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2779e740-c788-442b-bd6d-4cd5535e3d99",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-19 12:18:37.0",
Identifier="0c71e5d3-6660-4a1b-998a-5576f7c8311e")
public static final String FIELDNAME_Cost_CostCalc="0c71e5d3-6660-4a1b-998a-5576f7c8311e";

@XendraTrl(Identifier="c19dc7cd-dd0b-4fdc-8d93-6df022bbdbfb")
public static String es_PE_COLUMN_M_CostCalc_ID_Name="Cost Calc";

@XendraColumn(AD_Element_ID="e87ffb49-1644-c603-da22-fc206852344d",ColumnName="M_CostCalc_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c19dc7cd-dd0b-4fdc-8d93-6df022bbdbfb",
Synchronized="2019-08-30 22:23:26.0")
/** Column name M_CostCalc_ID */
public static final String COLUMNNAME_M_CostCalc_ID = "M_CostCalc_ID";
/** Set Cost Element.
@param M_CostElement_ID Product Cost Element */
public void setM_CostElement_ID (int M_CostElement_ID)
{
if (M_CostElement_ID <= 0) set_Value (COLUMNNAME_M_CostElement_ID, null);
 else 
set_Value (COLUMNNAME_M_CostElement_ID, Integer.valueOf(M_CostElement_ID));
}
/** Get Cost Element.
@return Product Cost Element */
public int getM_CostElement_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_CostElement_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="53624841-acc4-4b70-984b-5d5bf3268169")
public static String es_PE_FIELD_Cost_CostElement_Name="Elemento de Costo";

@XendraTrl(Identifier="53624841-acc4-4b70-984b-5d5bf3268169")
public static String es_PE_FIELD_Cost_CostElement_Description="Elemento de costo de producto";

@XendraField(AD_Column_ID="M_CostElement_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2779e740-c788-442b-bd6d-4cd5535e3d99",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=20,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-19 12:18:37.0",
Identifier="53624841-acc4-4b70-984b-5d5bf3268169")
public static final String FIELDNAME_Cost_CostElement="53624841-acc4-4b70-984b-5d5bf3268169";

@XendraTrl(Identifier="90c6c097-e5c8-4e34-a5c0-6af14d583053")
public static String es_PE_COLUMN_M_CostElement_ID_Name="Cost Element";

@XendraColumn(AD_Element_ID="1b5355ae-f799-dbe3-d07b-17cb2162e976",ColumnName="M_CostElement_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="90c6c097-e5c8-4e34-a5c0-6af14d583053",
Synchronized="2019-08-30 22:23:26.0")
/** Column name M_CostElement_ID */
public static final String COLUMNNAME_M_CostElement_ID = "M_CostElement_ID";
/** Set Product Costing.
@param M_Product_Costing_ID Product Costing */
public void setM_Product_Costing_ID (int M_Product_Costing_ID)
{
if (M_Product_Costing_ID <= 0) set_ValueNoCheck (COLUMNNAME_M_Product_Costing_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_M_Product_Costing_ID, Integer.valueOf(M_Product_Costing_ID));
}
/** Get Product Costing.
@return Product Costing */
public int getM_Product_Costing_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Product_Costing_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="2e15fafa-ec0d-490d-9834-240e03064f32")
public static String es_PE_FIELD_Cost_ProductCosting_Name="Product Costing";

@XendraField(AD_Column_ID="M_Product_Costing_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2779e740-c788-442b-bd6d-4cd5535e3d99",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-19 12:18:37.0",
Identifier="2e15fafa-ec0d-490d-9834-240e03064f32")
public static final String FIELDNAME_Cost_ProductCosting="2e15fafa-ec0d-490d-9834-240e03064f32";
/** Column name M_Product_Costing_ID */
public static final String COLUMNNAME_M_Product_Costing_ID = "M_Product_Costing_ID";
/** Set Product.
@param M_Product_ID Product, Service, Item */
public void setM_Product_ID (int M_Product_ID)
{
if (M_Product_ID < 1) throw new IllegalArgumentException ("M_Product_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_Product_ID, Integer.valueOf(M_Product_ID));
}
/** Get Product.
@return Product, Service, Item */
public int getM_Product_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Product_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="70ae1d94-d3b4-dceb-8eeb-8fd4d31ae50e")
public static String es_PE_FIELD_CostingOld_Product_Name="Producto";

@XendraTrl(Identifier="70ae1d94-d3b4-dceb-8eeb-8fd4d31ae50e")
public static String es_PE_FIELD_CostingOld_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="70ae1d94-d3b4-dceb-8eeb-8fd4d31ae50e")
public static String es_PE_FIELD_CostingOld_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6c5a0b96-45e2-624e-5845-883b310b570c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="70ae1d94-d3b4-dceb-8eeb-8fd4d31ae50e")
public static final String FIELDNAME_CostingOld_Product="70ae1d94-d3b4-dceb-8eeb-8fd4d31ae50e";

@XendraTrl(Identifier="a517e98a-525d-40ec-89e1-dcacf3b9db9e")
public static String es_PE_FIELD_Cost_Product_Name="Producto";

@XendraTrl(Identifier="a517e98a-525d-40ec-89e1-dcacf3b9db9e")
public static String es_PE_FIELD_Cost_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="a517e98a-525d-40ec-89e1-dcacf3b9db9e")
public static String es_PE_FIELD_Cost_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2779e740-c788-442b-bd6d-4cd5535e3d99",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-19 12:18:37.0",
Identifier="a517e98a-525d-40ec-89e1-dcacf3b9db9e")
public static final String FIELDNAME_Cost_Product="a517e98a-525d-40ec-89e1-dcacf3b9db9e";

@XendraTrl(Identifier="eca82e20-fc03-8d9c-730f-8e5f2434cfcb")
public static String es_PE_COLUMN_M_Product_ID_Name="Producto";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="4281f8eb-238e-6b28-eb66-8cc866e6312c",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="eca82e20-fc03-8d9c-730f-8e5f2434cfcb",Synchronized="2019-08-30 22:23:26.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
/** Set Last Invoice Price.
@param PriceLastInv Price of the last invoice for the product */
public void setPriceLastInv (BigDecimal PriceLastInv)
{
if (PriceLastInv == null) throw new IllegalArgumentException ("PriceLastInv is mandatory.");
set_ValueNoCheck (COLUMNNAME_PriceLastInv, PriceLastInv);
}
/** Get Last Invoice Price.
@return Price of the last invoice for the product */
public BigDecimal getPriceLastInv() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PriceLastInv);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="1160979e-eaf2-a2aa-c8da-aff1119505bd")
public static String es_PE_FIELD_CostingOld_LastInvoicePrice_Name="Último Precio de la Factura";

@XendraTrl(Identifier="1160979e-eaf2-a2aa-c8da-aff1119505bd")
public static String es_PE_FIELD_CostingOld_LastInvoicePrice_Description="Precio de la última factura para el producto";

@XendraTrl(Identifier="1160979e-eaf2-a2aa-c8da-aff1119505bd")
public static String es_PE_FIELD_CostingOld_LastInvoicePrice_Help="El Precio de última factura indica el último precio pagado (unitario en la factura) para este producto";

@XendraField(AD_Column_ID="PriceLastInv",IsCentrallyMaintained=true,
AD_Tab_ID="6c5a0b96-45e2-624e-5845-883b310b570c",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=170,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1160979e-eaf2-a2aa-c8da-aff1119505bd")
public static final String FIELDNAME_CostingOld_LastInvoicePrice="1160979e-eaf2-a2aa-c8da-aff1119505bd";

@XendraTrl(Identifier="6a0885a6-b9b4-44d2-9a42-0e9559ce0e36")
public static String es_PE_FIELD_Cost_LastInvoicePrice_Name="Último Precio de la Factura";

@XendraTrl(Identifier="6a0885a6-b9b4-44d2-9a42-0e9559ce0e36")
public static String es_PE_FIELD_Cost_LastInvoicePrice_Description="Precio de la última factura para el producto";

@XendraTrl(Identifier="6a0885a6-b9b4-44d2-9a42-0e9559ce0e36")
public static String es_PE_FIELD_Cost_LastInvoicePrice_Help="El Precio de última factura indica el último precio pagado (unitario en la factura) para este producto";

@XendraField(AD_Column_ID="PriceLastInv",IsCentrallyMaintained=true,
AD_Tab_ID="2779e740-c788-442b-bd6d-4cd5535e3d99",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-19 12:18:37.0",
Identifier="6a0885a6-b9b4-44d2-9a42-0e9559ce0e36")
public static final String FIELDNAME_Cost_LastInvoicePrice="6a0885a6-b9b4-44d2-9a42-0e9559ce0e36";

@XendraTrl(Identifier="361bcbd2-96f5-534e-1be8-cc117a70f562")
public static String es_PE_COLUMN_PriceLastInv_Name="Último Precio de la Factura";

@XendraColumn(AD_Element_ID="79d5f96d-d602-00ac-43e5-ed89fc511cb4",ColumnName="PriceLastInv",
AD_Reference_ID=37,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="361bcbd2-96f5-534e-1be8-cc117a70f562",
Synchronized="2019-08-30 22:23:26.0")
/** Column name PriceLastInv */
public static final String COLUMNNAME_PriceLastInv = "PriceLastInv";
/** Set Last PO Price.
@param PriceLastPO Price of the last purchase order for the product */
public void setPriceLastPO (BigDecimal PriceLastPO)
{
if (PriceLastPO == null) throw new IllegalArgumentException ("PriceLastPO is mandatory.");
set_ValueNoCheck (COLUMNNAME_PriceLastPO, PriceLastPO);
}
/** Get Last PO Price.
@return Price of the last purchase order for the product */
public BigDecimal getPriceLastPO() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PriceLastPO);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="c8c76c9b-1629-d462-7a6e-e1a07cc449f9")
public static String es_PE_FIELD_CostingOld_LastPOPrice_Name="Último Precio de OC";

@XendraTrl(Identifier="c8c76c9b-1629-d462-7a6e-e1a07cc449f9")
public static String es_PE_FIELD_CostingOld_LastPOPrice_Description="Precio de la última orden de compra del producto";

@XendraTrl(Identifier="c8c76c9b-1629-d462-7a6e-e1a07cc449f9")
public static String es_PE_FIELD_CostingOld_LastPOPrice_Help="El Precio de última orden de compra indica el último precio pagado (unitario de la orden de compra) para este producto";

@XendraField(AD_Column_ID="PriceLastPO",IsCentrallyMaintained=true,
AD_Tab_ID="6c5a0b96-45e2-624e-5845-883b310b570c",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=160,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c8c76c9b-1629-d462-7a6e-e1a07cc449f9")
public static final String FIELDNAME_CostingOld_LastPOPrice="c8c76c9b-1629-d462-7a6e-e1a07cc449f9";

@XendraTrl(Identifier="7fbe78f1-1fa0-4d78-ac73-5e3731ad95cb")
public static String es_PE_FIELD_Cost_LastPOPrice_Name="Último Precio de OC";

@XendraTrl(Identifier="7fbe78f1-1fa0-4d78-ac73-5e3731ad95cb")
public static String es_PE_FIELD_Cost_LastPOPrice_Description="Precio de la última orden de compra del producto";

@XendraTrl(Identifier="7fbe78f1-1fa0-4d78-ac73-5e3731ad95cb")
public static String es_PE_FIELD_Cost_LastPOPrice_Help="El Precio de última orden de compra indica el último precio pagado (unitario de la orden de compra) para este producto";

@XendraField(AD_Column_ID="PriceLastPO",IsCentrallyMaintained=true,
AD_Tab_ID="2779e740-c788-442b-bd6d-4cd5535e3d99",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-19 12:18:37.0",
Identifier="7fbe78f1-1fa0-4d78-ac73-5e3731ad95cb")
public static final String FIELDNAME_Cost_LastPOPrice="7fbe78f1-1fa0-4d78-ac73-5e3731ad95cb";

@XendraTrl(Identifier="6514c791-af74-e1e7-1687-1c4e432ef8bd")
public static String es_PE_COLUMN_PriceLastPO_Name="Último Precio de OC";

@XendraColumn(AD_Element_ID="71f85667-7f69-a76d-4634-c8bab5c2ef8f",ColumnName="PriceLastPO",
AD_Reference_ID=37,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6514c791-af74-e1e7-1687-1c4e432ef8bd",
Synchronized="2019-08-30 22:23:26.0")
/** Column name PriceLastPO */
public static final String COLUMNNAME_PriceLastPO = "PriceLastPO";
/** Set Sequence.
@param SeqNo Method of ordering records: lowest number comes first */
public void setSeqNo (BigDecimal SeqNo)
{
set_Value (COLUMNNAME_SeqNo, SeqNo);
}
/** Get Sequence.
@return Method of ordering records: lowest number comes first */
public BigDecimal getSeqNo() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_SeqNo);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="1b4f8a4e-412f-41fd-9b27-dfb3369ac5e6")
public static String es_PE_FIELD_Cost_Sequence_Name="Secuencia";

@XendraTrl(Identifier="1b4f8a4e-412f-41fd-9b27-dfb3369ac5e6")
public static String es_PE_FIELD_Cost_Sequence_Description="Método de ordenar registros; el número más bajo viene primero";

@XendraTrl(Identifier="1b4f8a4e-412f-41fd-9b27-dfb3369ac5e6")
public static String es_PE_FIELD_Cost_Sequence_Help="La Secuencia indica el orden de los registros";

@XendraField(AD_Column_ID="SeqNo",IsCentrallyMaintained=true,
AD_Tab_ID="2779e740-c788-442b-bd6d-4cd5535e3d99",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=131089,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-19 12:18:37.0",
Identifier="1b4f8a4e-412f-41fd-9b27-dfb3369ac5e6")
public static final String FIELDNAME_Cost_Sequence="1b4f8a4e-412f-41fd-9b27-dfb3369ac5e6";

@XendraTrl(Identifier="a48a63fe-f1ea-4436-ad65-7fa059270be6")
public static String es_PE_COLUMN_SeqNo_Name="Sequence";

@XendraColumn(AD_Element_ID="38fa26fe-b59d-fce1-c129-420b57da738b",ColumnName="SeqNo",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a48a63fe-f1ea-4436-ad65-7fa059270be6",
Synchronized="2019-08-30 22:23:26.0")
/** Column name SeqNo */
public static final String COLUMNNAME_SeqNo = "SeqNo";
/** Set Total Invoice Amount.
@param TotalInvAmt Cumulative total lifetime invoice amount */
public void setTotalInvAmt (BigDecimal TotalInvAmt)
{
if (TotalInvAmt == null) throw new IllegalArgumentException ("TotalInvAmt is mandatory.");
set_ValueNoCheck (COLUMNNAME_TotalInvAmt, TotalInvAmt);
}
/** Get Total Invoice Amount.
@return Cumulative total lifetime invoice amount */
public BigDecimal getTotalInvAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_TotalInvAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="40fcefa6-3912-60b4-d910-d0ac378dd9ca")
public static String es_PE_FIELD_CostingOld_TotalInvoiceAmount_Name="Total Total de la Factura";

@XendraTrl(Identifier="40fcefa6-3912-60b4-d910-d0ac378dd9ca")
public static String es_PE_FIELD_CostingOld_TotalInvoiceAmount_Description="Total Total de la Factura";

@XendraTrl(Identifier="40fcefa6-3912-60b4-d910-d0ac378dd9ca")
public static String es_PE_FIELD_CostingOld_TotalInvoiceAmount_Help="El Total acumulado total facturado en el tiempo de vida. Se usa para calcular el precio estándar total";

@XendraField(AD_Column_ID="TotalInvAmt",IsCentrallyMaintained=true,
AD_Tab_ID="6c5a0b96-45e2-624e-5845-883b310b570c",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=180,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="40fcefa6-3912-60b4-d910-d0ac378dd9ca")
public static final String FIELDNAME_CostingOld_TotalInvoiceAmount="40fcefa6-3912-60b4-d910-d0ac378dd9ca";

@XendraTrl(Identifier="d092f5d5-1cea-4d7a-bb4a-a763d1159224")
public static String es_PE_FIELD_Cost_TotalInvoiceAmount_Name="Total Total de la Factura";

@XendraTrl(Identifier="d092f5d5-1cea-4d7a-bb4a-a763d1159224")
public static String es_PE_FIELD_Cost_TotalInvoiceAmount_Description="Total Total de la Factura";

@XendraTrl(Identifier="d092f5d5-1cea-4d7a-bb4a-a763d1159224")
public static String es_PE_FIELD_Cost_TotalInvoiceAmount_Help="El Total acumulado total facturado en el tiempo de vida. Se usa para calcular el precio estándar total";

@XendraField(AD_Column_ID="TotalInvAmt",IsCentrallyMaintained=true,
AD_Tab_ID="2779e740-c788-442b-bd6d-4cd5535e3d99",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-19 12:18:38.0",
Identifier="d092f5d5-1cea-4d7a-bb4a-a763d1159224")
public static final String FIELDNAME_Cost_TotalInvoiceAmount="d092f5d5-1cea-4d7a-bb4a-a763d1159224";

@XendraTrl(Identifier="5d943050-6586-adb3-ddf3-c0dd4256d70b")
public static String es_PE_COLUMN_TotalInvAmt_Name="Total Total de la Factura";

@XendraColumn(AD_Element_ID="4385d202-8565-89c6-2e19-aa071f96e1c6",ColumnName="TotalInvAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5d943050-6586-adb3-ddf3-c0dd4256d70b",
Synchronized="2019-08-30 22:23:26.0")
/** Column name TotalInvAmt */
public static final String COLUMNNAME_TotalInvAmt = "TotalInvAmt";
/** Set Total Invoice Quantity.
@param TotalInvQty Cumulative total lifetime invoice quantity */
public void setTotalInvQty (BigDecimal TotalInvQty)
{
if (TotalInvQty == null) throw new IllegalArgumentException ("TotalInvQty is mandatory.");
set_ValueNoCheck (COLUMNNAME_TotalInvQty, TotalInvQty);
}
/** Get Total Invoice Quantity.
@return Cumulative total lifetime invoice quantity */
public BigDecimal getTotalInvQty() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_TotalInvQty);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="8ca73902-ebf6-d5ab-839a-58fc37e9026f")
public static String es_PE_FIELD_CostingOld_TotalInvoiceQuantity_Name="Cantidad Total de la Factura";

@XendraTrl(Identifier="8ca73902-ebf6-d5ab-839a-58fc37e9026f")
public static String es_PE_FIELD_CostingOld_TotalInvoiceQuantity_Description="Cantidad Total de la Factura";

@XendraTrl(Identifier="8ca73902-ebf6-d5ab-839a-58fc37e9026f")
public static String es_PE_FIELD_CostingOld_TotalInvoiceQuantity_Help="La cantidad total facturada en el tiempo de vida. Se usa para calcular el precio estándar total";

@XendraField(AD_Column_ID="TotalInvQty",IsCentrallyMaintained=true,
AD_Tab_ID="6c5a0b96-45e2-624e-5845-883b310b570c",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=190,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8ca73902-ebf6-d5ab-839a-58fc37e9026f")
public static final String FIELDNAME_CostingOld_TotalInvoiceQuantity="8ca73902-ebf6-d5ab-839a-58fc37e9026f";

@XendraTrl(Identifier="1d195a81-7102-4e65-a26f-535c61c423dd")
public static String es_PE_FIELD_Cost_TotalInvoiceQuantity_Name="Cantidad Total de la Factura";

@XendraTrl(Identifier="1d195a81-7102-4e65-a26f-535c61c423dd")
public static String es_PE_FIELD_Cost_TotalInvoiceQuantity_Description="Cantidad Total de la Factura";

@XendraTrl(Identifier="1d195a81-7102-4e65-a26f-535c61c423dd")
public static String es_PE_FIELD_Cost_TotalInvoiceQuantity_Help="La cantidad total facturada en el tiempo de vida. Se usa para calcular el precio estándar total";

@XendraField(AD_Column_ID="TotalInvQty",IsCentrallyMaintained=true,
AD_Tab_ID="2779e740-c788-442b-bd6d-4cd5535e3d99",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-19 12:18:38.0",
Identifier="1d195a81-7102-4e65-a26f-535c61c423dd")
public static final String FIELDNAME_Cost_TotalInvoiceQuantity="1d195a81-7102-4e65-a26f-535c61c423dd";

@XendraTrl(Identifier="fcd90c33-2c22-adfa-3ae4-31ea53344af0")
public static String es_PE_COLUMN_TotalInvQty_Name="Cantidad Total de la Factura";

@XendraColumn(AD_Element_ID="b1d9efe4-c464-9986-5a82-d1fb86c97338",ColumnName="TotalInvQty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fcd90c33-2c22-adfa-3ae4-31ea53344af0",
Synchronized="2019-08-30 22:23:26.0")
/** Column name TotalInvQty */
public static final String COLUMNNAME_TotalInvQty = "TotalInvQty";
}
