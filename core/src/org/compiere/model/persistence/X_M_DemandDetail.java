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
/** Generated Model for M_DemandDetail
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_DemandDetail extends PO
{
/** Standard Constructor
@param ctx context
@param M_DemandDetail_ID id
@param trxName transaction
*/
public X_M_DemandDetail (Properties ctx, int M_DemandDetail_ID, String trxName)
{
super (ctx, M_DemandDetail_ID, trxName);
/** if (M_DemandDetail_ID == 0)
{
setM_DemandDetail_ID (0);
setM_DemandLine_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_M_DemandDetail (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=721 */
public static int Table_ID=MTable.getTable_ID("M_DemandDetail");

@XendraTrl(Identifier="5ba6706d-176e-0f30-b492-acb55758fbea")
public static String es_PE_TAB_Detail_Description="Detalle de la fuente de material de la linea de la demanda";

@XendraTrl(Identifier="5ba6706d-176e-0f30-b492-acb55758fbea")
public static String es_PE_TAB_Detail_Name="Detalle";

@XendraTrl(Identifier="5ba6706d-176e-0f30-b492-acb55758fbea")
public static String es_PE_TAB_Detail_Help="Acoplamiento de la fuente para las líneas materiales de la demanda.";

@XendraTab(Name="Detail",Description="Material Demand Line Source Detail",
Help="Source Link for Material Demand Lines",AD_Window_ID="6538f96e-bc28-b93f-fb99-b3302e2c3a01",
SeqNo=30,TabLevel=2,IsSingleRow=false,IsInfoTab=false,IsTranslationTab=false,IsReadOnly=true,
AD_Column_ID="",HasTree=false,WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",
AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",
ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=false,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="5ba6706d-176e-0f30-b492-acb55758fbea",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Detail="5ba6706d-176e-0f30-b492-acb55758fbea";

@XendraTrl(Identifier="25dcfb41-44d7-1457-b282-8aba07917e49")
public static String es_PE_TABLE_M_DemandDetail_Name="Detalles de la demanda";

@XendraTable(Name="Demand Detail",Description="Material Demand Line Source Detail",Help="",
TableName="M_DemandDetail",AccessLevel="2",AD_Window_ID="6538f96e-bc28-b93f-fb99-b3302e2c3a01",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.material",
Identifier="25dcfb41-44d7-1457-b282-8aba07917e49",Synchronized="2017-08-16 11:43:09.0")
/** TableName=M_DemandDetail */
public static final String Table_Name="M_DemandDetail";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_DemandDetail");

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
    Table_ID = MTable.getTable_ID("M_DemandDetail");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_DemandDetail[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Sales Order Line.
@param C_OrderLine_ID Sales Order Line */
public void setC_OrderLine_ID (int C_OrderLine_ID)
{
if (C_OrderLine_ID <= 0) set_Value (COLUMNNAME_C_OrderLine_ID, null);
 else 
set_Value (COLUMNNAME_C_OrderLine_ID, Integer.valueOf(C_OrderLine_ID));
}
/** Get Sales Order Line.
@return Sales Order Line */
public int getC_OrderLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_OrderLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="fc1e45ec-1281-99be-6596-7d896bcdaa69")
public static String es_PE_FIELD_Detail_SalesOrderLine_Description="Item de orden de venta";

@XendraTrl(Identifier="fc1e45ec-1281-99be-6596-7d896bcdaa69")
public static String es_PE_FIELD_Detail_SalesOrderLine_Help="Identificador único para un Item en una orden.";

@XendraTrl(Identifier="fc1e45ec-1281-99be-6596-7d896bcdaa69")
public static String es_PE_FIELD_Detail_SalesOrderLine_Name="Item";

@XendraField(AD_Column_ID="C_OrderLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5ba6706d-176e-0f30-b492-acb55758fbea",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fc1e45ec-1281-99be-6596-7d896bcdaa69")
public static final String FIELDNAME_Detail_SalesOrderLine="fc1e45ec-1281-99be-6596-7d896bcdaa69";

@XendraTrl(Identifier="e7d289cc-70ed-bdd3-ee15-97b3958d0120")
public static String es_PE_COLUMN_C_OrderLine_ID_Name="Línea";

@XendraColumn(AD_Element_ID="a94fbec0-0ef5-0f6c-033d-8286782321b0",ColumnName="C_OrderLine_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e7d289cc-70ed-bdd3-ee15-97b3958d0120",
Synchronized="2017-08-05 16:55:04.0")
/** Column name C_OrderLine_ID */
public static final String COLUMNNAME_C_OrderLine_ID = "C_OrderLine_ID";
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
@XendraTrl(Identifier="88bba63e-a5c7-4132-a14d-b0023403709d")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="88bba63e-a5c7-4132-a14d-b0023403709d",
Synchronized="2017-08-05 16:55:04.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Demand Detail.
@param M_DemandDetail_ID Material Demand Line Source Detail */
public void setM_DemandDetail_ID (int M_DemandDetail_ID)
{
if (M_DemandDetail_ID < 1) throw new IllegalArgumentException ("M_DemandDetail_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_DemandDetail_ID, Integer.valueOf(M_DemandDetail_ID));
}
/** Get Demand Detail.
@return Material Demand Line Source Detail */
public int getM_DemandDetail_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_DemandDetail_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getM_DemandDetail_ID()));
}

@XendraTrl(Identifier="58d74274-a0f4-d446-e1f2-e053bc41984a")
public static String es_PE_FIELD_Detail_DemandDetail_Description="Detalles de la demanda de la fuente de linea de material";

@XendraTrl(Identifier="58d74274-a0f4-d446-e1f2-e053bc41984a")
public static String es_PE_FIELD_Detail_DemandDetail_Help="Acoplamiento de la fuente para las líneas materiales de la demanda";

@XendraTrl(Identifier="58d74274-a0f4-d446-e1f2-e053bc41984a")
public static String es_PE_FIELD_Detail_DemandDetail_Name="Detalles de la demanda";

@XendraField(AD_Column_ID="M_DemandDetail_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5ba6706d-176e-0f30-b492-acb55758fbea",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="58d74274-a0f4-d446-e1f2-e053bc41984a")
public static final String FIELDNAME_Detail_DemandDetail="58d74274-a0f4-d446-e1f2-e053bc41984a";
/** Column name M_DemandDetail_ID */
public static final String COLUMNNAME_M_DemandDetail_ID = "M_DemandDetail_ID";
/** Set Demand Line.
@param M_DemandLine_ID Material Demand Line */
public void setM_DemandLine_ID (int M_DemandLine_ID)
{
if (M_DemandLine_ID < 1) throw new IllegalArgumentException ("M_DemandLine_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_DemandLine_ID, Integer.valueOf(M_DemandLine_ID));
}
/** Get Demand Line.
@return Material Demand Line */
public int getM_DemandLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_DemandLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="6fd5aec2-123b-9dfb-0097-7f57076836f1")
public static String es_PE_FIELD_Detail_DemandLine_Description="Item de demanda de material.";

@XendraTrl(Identifier="6fd5aec2-123b-9dfb-0097-7f57076836f1")
public static String es_PE_FIELD_Detail_DemandLine_Help="Demanda para un producto en un periodo.";

@XendraTrl(Identifier="6fd5aec2-123b-9dfb-0097-7f57076836f1")
public static String es_PE_FIELD_Detail_DemandLine_Name="Item de Demanda";

@XendraField(AD_Column_ID="M_DemandLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5ba6706d-176e-0f30-b492-acb55758fbea",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6fd5aec2-123b-9dfb-0097-7f57076836f1")
public static final String FIELDNAME_Detail_DemandLine="6fd5aec2-123b-9dfb-0097-7f57076836f1";

@XendraTrl(Identifier="ed273ec1-6884-7599-e79d-cd34e6315031")
public static String es_PE_COLUMN_M_DemandLine_ID_Name="Línea de Demanda";

@XendraColumn(AD_Element_ID="046de761-26e7-5d4a-9921-e8881e8ae96a",ColumnName="M_DemandLine_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ed273ec1-6884-7599-e79d-cd34e6315031",
Synchronized="2017-08-05 16:55:04.0")
/** Column name M_DemandLine_ID */
public static final String COLUMNNAME_M_DemandLine_ID = "M_DemandLine_ID";
/** Set Forecast Line.
@param M_ForecastLine_ID Forecast Line */
public void setM_ForecastLine_ID (int M_ForecastLine_ID)
{
if (M_ForecastLine_ID <= 0) set_Value (COLUMNNAME_M_ForecastLine_ID, null);
 else 
set_Value (COLUMNNAME_M_ForecastLine_ID, Integer.valueOf(M_ForecastLine_ID));
}
/** Get Forecast Line.
@return Forecast Line */
public int getM_ForecastLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_ForecastLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="debfe126-7e3a-730b-ea1b-e6ba59da1ec3")
public static String es_PE_FIELD_Detail_ForecastLine_Description="Item de pronóstico";

@XendraTrl(Identifier="debfe126-7e3a-730b-ea1b-e6ba59da1ec3")
public static String es_PE_FIELD_Detail_ForecastLine_Help="Pronóstico de producto cantidad y periodo.";

@XendraTrl(Identifier="debfe126-7e3a-730b-ea1b-e6ba59da1ec3")
public static String es_PE_FIELD_Detail_ForecastLine_Name="Item de Pronostico";

@XendraField(AD_Column_ID="M_ForecastLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5ba6706d-176e-0f30-b492-acb55758fbea",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=60,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="debfe126-7e3a-730b-ea1b-e6ba59da1ec3")
public static final String FIELDNAME_Detail_ForecastLine="debfe126-7e3a-730b-ea1b-e6ba59da1ec3";

@XendraTrl(Identifier="aea79549-652b-b85a-7d2c-ddd208791ad9")
public static String es_PE_COLUMN_M_ForecastLine_ID_Name="Línea de Pronostico";

@XendraColumn(AD_Element_ID="45dc368a-4ae6-f8d5-e082-b93a025f6f5c",ColumnName="M_ForecastLine_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="aea79549-652b-b85a-7d2c-ddd208791ad9",
Synchronized="2017-08-05 16:55:04.0")
/** Column name M_ForecastLine_ID */
public static final String COLUMNNAME_M_ForecastLine_ID = "M_ForecastLine_ID";
/** Set Requisition Line.
@param M_RequisitionLine_ID Material Requisition Line */
public void setM_RequisitionLine_ID (int M_RequisitionLine_ID)
{
if (M_RequisitionLine_ID <= 0) set_Value (COLUMNNAME_M_RequisitionLine_ID, null);
 else 
set_Value (COLUMNNAME_M_RequisitionLine_ID, Integer.valueOf(M_RequisitionLine_ID));
}
/** Get Requisition Line.
@return Material Requisition Line */
public int getM_RequisitionLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_RequisitionLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="72293a4b-10c8-da27-b185-bc7bfdc73740")
public static String es_PE_FIELD_Detail_RequisitionLine_Description="Item de Requisición de material";

@XendraTrl(Identifier="72293a4b-10c8-da27-b185-bc7bfdc73740")
public static String es_PE_FIELD_Detail_RequisitionLine_Name="Item de Requisición Material";

@XendraField(AD_Column_ID="M_RequisitionLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5ba6706d-176e-0f30-b492-acb55758fbea",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="72293a4b-10c8-da27-b185-bc7bfdc73740")
public static final String FIELDNAME_Detail_RequisitionLine="72293a4b-10c8-da27-b185-bc7bfdc73740";

@XendraTrl(Identifier="05721bf9-d499-6ea3-494b-14e50c0e5721")
public static String es_PE_COLUMN_M_RequisitionLine_ID_Name="Línea de Requisición Material";

@XendraColumn(AD_Element_ID="bfc27618-d920-caaf-adc2-3c51159659e6",
ColumnName="M_RequisitionLine_ID",AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="05721bf9-d499-6ea3-494b-14e50c0e5721",Synchronized="2017-08-05 16:55:04.0")
/** Column name M_RequisitionLine_ID */
public static final String COLUMNNAME_M_RequisitionLine_ID = "M_RequisitionLine_ID";
}
