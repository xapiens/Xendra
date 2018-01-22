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
/** Generated Model for T_DistributionRunDetail
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_T_DistributionRunDetail extends PO
{
/** Standard Constructor
@param ctx context
@param T_DistributionRunDetail_ID id
@param trxName transaction
*/
public X_T_DistributionRunDetail (Properties ctx, int T_DistributionRunDetail_ID, String trxName)
{
super (ctx, T_DistributionRunDetail_ID, trxName);
/** if (T_DistributionRunDetail_ID == 0)
{
setC_BPartner_ID (0);
setC_BPartner_Location_ID (0);
setM_DistributionList_ID (0);
setM_DistributionListLine_ID (0);
setM_DistributionRun_ID (0);
setM_DistributionRunLine_ID (0);
setMinQty (Env.ZERO);
setM_Product_ID (0);
setQty (Env.ZERO);
setRatio (Env.ZERO);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_T_DistributionRunDetail (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=714 */
public static int Table_ID=MTable.getTable_ID("T_DistributionRunDetail");

@XendraTrl(Identifier="c975109b-04d3-731b-1db6-fea01426e8ba")
public static String es_PE_TABLE_T_DistributionRunDetail_Name="T_DistributionRunDetail";


@XendraTable(Name="T_DistributionRunDetail",Description="",Help="",
TableName="T_DistributionRunDetail",AccessLevel="3",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=0,
LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.standard",
Identifier="c975109b-04d3-731b-1db6-fea01426e8ba",Synchronized="2017-08-16 11:44:20.0")
/** TableName=T_DistributionRunDetail */
public static final String Table_Name="T_DistributionRunDetail";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"T_DistributionRunDetail");

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
    Table_ID = MTable.getTable_ID("T_DistributionRunDetail");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_T_DistributionRunDetail[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Business Partner .
@param C_BPartner_ID Identifies a Business Partner */
public void setC_BPartner_ID (int C_BPartner_ID)
{
if (C_BPartner_ID < 1) throw new IllegalArgumentException ("C_BPartner_ID is mandatory.");
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

@XendraTrl(Identifier="2d81104f-bcbd-ae9f-bdaa-cc06a9d6fc10")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Socio de Negocio";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2d81104f-bcbd-ae9f-bdaa-cc06a9d6fc10",
Synchronized="2017-08-05 16:56:24.0")
/** Column name C_BPartner_ID */
public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
/** Set Partner Location.
@param C_BPartner_Location_ID Identifies the (ship to) address for this Business Partner */
public void setC_BPartner_Location_ID (int C_BPartner_Location_ID)
{
if (C_BPartner_Location_ID < 1) throw new IllegalArgumentException ("C_BPartner_Location_ID is mandatory.");
set_Value (COLUMNNAME_C_BPartner_Location_ID, Integer.valueOf(C_BPartner_Location_ID));
}
/** Get Partner Location.
@return Identifies the (ship to) address for this Business Partner */
public int getC_BPartner_Location_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartner_Location_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="1c5b1089-3f1c-2294-62e8-110dde49caa9")
public static String es_PE_COLUMN_C_BPartner_Location_ID_Name="Dirección del Socio del Negocio";

@XendraColumn(AD_Element_ID="0dab7dc6-2832-26dc-2462-cba2d40235f2",
ColumnName="C_BPartner_Location_ID",AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="1c5b1089-3f1c-2294-62e8-110dde49caa9",Synchronized="2017-08-05 16:56:24.0")
/** Column name C_BPartner_Location_ID */
public static final String COLUMNNAME_C_BPartner_Location_ID = "C_BPartner_Location_ID";
/** Set Distribution List.
@param M_DistributionList_ID Distribution Lists allow to distribute products to a selected list of partners */
public void setM_DistributionList_ID (int M_DistributionList_ID)
{
if (M_DistributionList_ID < 1) throw new IllegalArgumentException ("M_DistributionList_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_DistributionList_ID, Integer.valueOf(M_DistributionList_ID));
}
/** Get Distribution List.
@return Distribution Lists allow to distribute products to a selected list of partners */
public int getM_DistributionList_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_DistributionList_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="2872ed6e-a3e9-90bb-4406-819c83b7474b")
public static String es_PE_COLUMN_M_DistributionList_ID_Name="Lista de Distribución";

@XendraColumn(AD_Element_ID="21142264-c420-5fa7-6238-fa3db90a45a8",
ColumnName="M_DistributionList_ID",AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="2872ed6e-a3e9-90bb-4406-819c83b7474b",Synchronized="2017-08-05 16:56:24.0")
/** Column name M_DistributionList_ID */
public static final String COLUMNNAME_M_DistributionList_ID = "M_DistributionList_ID";
/** Set Distribution List Line.
@param M_DistributionListLine_ID Distribution List Line with Business Partner and Quantity/Percentage */
public void setM_DistributionListLine_ID (int M_DistributionListLine_ID)
{
if (M_DistributionListLine_ID < 1) throw new IllegalArgumentException ("M_DistributionListLine_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_DistributionListLine_ID, Integer.valueOf(M_DistributionListLine_ID));
}
/** Get Distribution List Line.
@return Distribution List Line with Business Partner and Quantity/Percentage */
public int getM_DistributionListLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_DistributionListLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d7f3174e-428f-102d-b81f-8734fde15ba3")
public static String es_PE_COLUMN_M_DistributionListLine_ID_Name="Línea Lista de Distribución";

@XendraColumn(AD_Element_ID="30d5e49f-c546-321f-0306-f5e223c02a33",
ColumnName="M_DistributionListLine_ID",AD_Reference_ID=30,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=true,
IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="d7f3174e-428f-102d-b81f-8734fde15ba3",Synchronized="2017-08-05 16:56:24.0")
/** Column name M_DistributionListLine_ID */
public static final String COLUMNNAME_M_DistributionListLine_ID = "M_DistributionListLine_ID";
/** Set Distribution Run.
@param M_DistributionRun_ID Distribution Run create Orders to distribute products to a selected list of partners */
public void setM_DistributionRun_ID (int M_DistributionRun_ID)
{
if (M_DistributionRun_ID < 1) throw new IllegalArgumentException ("M_DistributionRun_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_DistributionRun_ID, Integer.valueOf(M_DistributionRun_ID));
}
/** Get Distribution Run.
@return Distribution Run create Orders to distribute products to a selected list of partners */
public int getM_DistributionRun_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_DistributionRun_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getM_DistributionRun_ID()));
}

@XendraTrl(Identifier="8c032fc6-f2a7-80c5-f35a-c93f1c78a728")
public static String es_PE_COLUMN_M_DistributionRun_ID_Name="Corrida de Distribución";

@XendraColumn(AD_Element_ID="e70572d6-d2f0-46bb-1e9a-9e50951d7fa5",
ColumnName="M_DistributionRun_ID",AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="8c032fc6-f2a7-80c5-f35a-c93f1c78a728",Synchronized="2017-08-05 16:56:24.0")
/** Column name M_DistributionRun_ID */
public static final String COLUMNNAME_M_DistributionRun_ID = "M_DistributionRun_ID";
/** Set Distribution Run Line.
@param M_DistributionRunLine_ID Distribution Run Lines define Distribution List, the Product and Quantiries */
public void setM_DistributionRunLine_ID (int M_DistributionRunLine_ID)
{
if (M_DistributionRunLine_ID < 1) throw new IllegalArgumentException ("M_DistributionRunLine_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_DistributionRunLine_ID, Integer.valueOf(M_DistributionRunLine_ID));
}
/** Get Distribution Run Line.
@return Distribution Run Lines define Distribution List, the Product and Quantiries */
public int getM_DistributionRunLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_DistributionRunLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="aaa84016-1571-f901-36f3-86e0ed6e4d09")
public static String es_PE_COLUMN_M_DistributionRunLine_ID_Name="Línea Lista de Distribución";

@XendraColumn(AD_Element_ID="edf8f34c-66eb-560f-8331-6c7154deb789",
ColumnName="M_DistributionRunLine_ID",AD_Reference_ID=30,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=true,
IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="aaa84016-1571-f901-36f3-86e0ed6e4d09",Synchronized="2017-08-05 16:56:24.0")
/** Column name M_DistributionRunLine_ID */
public static final String COLUMNNAME_M_DistributionRunLine_ID = "M_DistributionRunLine_ID";
/** Set Minimum Quantity.
@param MinQty Minimum quantity for the business partner */
public void setMinQty (BigDecimal MinQty)
{
if (MinQty == null) throw new IllegalArgumentException ("MinQty is mandatory.");
set_Value (COLUMNNAME_MinQty, MinQty);
}
/** Get Minimum Quantity.
@return Minimum quantity for the business partner */
public BigDecimal getMinQty() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_MinQty);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="756e4bde-01e5-45be-482c-4f2ff54fc050")
public static String es_PE_COLUMN_MinQty_Name="Cantidad Mín";

@XendraColumn(AD_Element_ID="dd9a9570-cfde-d9b6-0ddd-c3a4e58e0e04",ColumnName="MinQty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="756e4bde-01e5-45be-482c-4f2ff54fc050",
Synchronized="2017-08-05 16:56:24.0")
/** Column name MinQty */
public static final String COLUMNNAME_MinQty = "MinQty";
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

@XendraTrl(Identifier="ea1cad5f-29d8-a3d9-5f86-2aa1e4e8970f")
public static String es_PE_COLUMN_M_Product_ID_Name="Producto";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ea1cad5f-29d8-a3d9-5f86-2aa1e4e8970f",
Synchronized="2017-08-05 16:56:24.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
/** Set Quantity.
@param Qty Quantity */
public void setQty (BigDecimal Qty)
{
if (Qty == null) throw new IllegalArgumentException ("Qty is mandatory.");
set_Value (COLUMNNAME_Qty, Qty);
}
/** Get Quantity.
@return Quantity */
public BigDecimal getQty() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Qty);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="a0fe5fdc-a07b-4f1c-8f23-193ae5e9a2b8")
public static String es_PE_COLUMN_Qty_Name="Cantidad";

@XendraColumn(AD_Element_ID="c9d74a25-87c5-9592-5660-4f397607dad3",ColumnName="Qty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a0fe5fdc-a07b-4f1c-8f23-193ae5e9a2b8",
Synchronized="2017-08-05 16:56:24.0")
/** Column name Qty */
public static final String COLUMNNAME_Qty = "Qty";
/** Set Ratio.
@param Ratio Relative Ratio for Distributions */
public void setRatio (BigDecimal Ratio)
{
if (Ratio == null) throw new IllegalArgumentException ("Ratio is mandatory.");
set_Value (COLUMNNAME_Ratio, Ratio);
}
/** Get Ratio.
@return Relative Ratio for Distributions */
public BigDecimal getRatio() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Ratio);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="959c70f7-1d6e-6d22-f90f-73eeec0b6981")
public static String es_PE_COLUMN_Ratio_Name="Relación";

@XendraColumn(AD_Element_ID="b00bfc42-576b-6582-da4e-015a99db0db4",ColumnName="Ratio",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="959c70f7-1d6e-6d22-f90f-73eeec0b6981",
Synchronized="2017-08-05 16:56:24.0")
/** Column name Ratio */
public static final String COLUMNNAME_Ratio = "Ratio";
}
