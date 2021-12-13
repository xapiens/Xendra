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
/** Generated Model for C_LandedCost
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_LandedCost extends PO
{
/** Standard Constructor
@param ctx context
@param C_LandedCost_ID id
@param trxName transaction
*/
public X_C_LandedCost (Properties ctx, int C_LandedCost_ID, String trxName)
{
super (ctx, C_LandedCost_ID, trxName);
/** if (C_LandedCost_ID == 0)
{
setC_InvoiceLine_ID (0);
setC_LandedCost_ID (0);
setLandedCostDistribution (null);	
// Q
setM_CostElement_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_LandedCost (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=759 */
public static int Table_ID=MTable.getTable_ID("C_LandedCost");

@XendraTrl(Identifier="d4037ee4-ab56-68a4-b7fb-53af02bd6ebf")
public static String es_PE_TAB_LandedCosts_Description="Costos Adicionales para ser asignados a recibos de material";

@XendraTrl(Identifier="d4037ee4-ab56-68a4-b7fb-53af02bd6ebf")
public static String es_PE_TAB_LandedCosts_Help="Los Costos  Adicionales le permiten asignar costos previamente a recibos de materiales. Ej. Flete, suprimir impuesto, seguro, etc.También seleccionar un Recibo, Línea de Recibo o Prducto Específico para asignarles el costo adicional.";

@XendraTrl(Identifier="d4037ee4-ab56-68a4-b7fb-53af02bd6ebf")
public static String es_PE_TAB_LandedCosts_Name="Costos Adicionales";

@XendraTab(Name="Landed Costs",Description="Landed cost to be allocated to material receipts",
Help="Landed costs allow you to allocate costs to previously received material receipts. Examples are freight, excise tax, insurance, etc.<br> Select either a Receipt, Receipt Line or a specific Product to allocate the costs to.",
AD_Window_ID="f7b55b8d-31bd-29ee-4626-2d3ad620dccb",SeqNo=30,TabLevel=2,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=true,Parent_Column_ID="",
Identifier="d4037ee4-ab56-68a4-b7fb-53af02bd6ebf",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_LandedCosts="d4037ee4-ab56-68a4-b7fb-53af02bd6ebf";

@XendraTrl(Identifier="6715a0c9-24bd-fbf3-3508-c9a972761869")
public static String es_PE_TABLE_C_LandedCost_Name="Costo Adicional";

@XendraTable(Name="Landed Cost",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="C_LandedCost",AccessLevel="1",AD_Window_ID="f7b55b8d-31bd-29ee-4626-2d3ad620dccb",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="6715a0c9-24bd-fbf3-3508-c9a972761869",Synchronized="2020-03-03 21:37:09.0")
/** TableName=C_LandedCost */
public static final String Table_Name="C_LandedCost";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_LandedCost");

protected BigDecimal accessLevel = BigDecimal.valueOf(1);
/** AccessLevel
@return 1 - Org 
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
    Table_ID = MTable.getTable_ID("C_LandedCost");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_LandedCost[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Invoice Line.
@param C_InvoiceLine_ID Invoice Detail Line */
public void setC_InvoiceLine_ID (int C_InvoiceLine_ID)
{
if (C_InvoiceLine_ID < 1) throw new IllegalArgumentException ("C_InvoiceLine_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_InvoiceLine_ID, Integer.valueOf(C_InvoiceLine_ID));
}
/** Get Invoice Line.
@return Invoice Detail Line */
public int getC_InvoiceLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_InvoiceLine_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getC_InvoiceLine_ID()));
}

@XendraTrl(Identifier="ff817635-3796-0ab0-fd63-87633cc0b949")
public static String es_PE_FIELD_LandedCosts_InvoiceLine_Name="Item de Factura";

@XendraTrl(Identifier="ff817635-3796-0ab0-fd63-87633cc0b949")
public static String es_PE_FIELD_LandedCosts_InvoiceLine_Description="Item de detalle de factura";

@XendraTrl(Identifier="ff817635-3796-0ab0-fd63-87633cc0b949")
public static String es_PE_FIELD_LandedCosts_InvoiceLine_Help="Identifica de manera única un Item de la factura";

@XendraField(AD_Column_ID="C_InvoiceLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="d4037ee4-ab56-68a4-b7fb-53af02bd6ebf",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ff817635-3796-0ab0-fd63-87633cc0b949")
public static final String FIELDNAME_LandedCosts_InvoiceLine="ff817635-3796-0ab0-fd63-87633cc0b949";

@XendraTrl(Identifier="1412402d-f0cf-0173-da0b-91161b680e5e")
public static String es_PE_COLUMN_C_InvoiceLine_ID_Name="Línea de Factura";

@XendraColumn(AD_Element_ID="56a4b078-1c5d-e08d-5d9d-847e94161779",ColumnName="C_InvoiceLine_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1412402d-f0cf-0173-da0b-91161b680e5e",
Synchronized="2019-08-30 22:21:46.0")
/** Column name C_InvoiceLine_ID */
public static final String COLUMNNAME_C_InvoiceLine_ID = "C_InvoiceLine_ID";
/** Set Landed Cost.
@param C_LandedCost_ID Landed cost to be allocated to material receipts */
public void setC_LandedCost_ID (int C_LandedCost_ID)
{
if (C_LandedCost_ID < 1) throw new IllegalArgumentException ("C_LandedCost_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_LandedCost_ID, Integer.valueOf(C_LandedCost_ID));
}
/** Get Landed Cost.
@return Landed cost to be allocated to material receipts */
public int getC_LandedCost_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_LandedCost_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="5af31364-661c-fc9d-b880-952313b69bd8")
public static String es_PE_FIELD_LandedCosts_LandedCost_Name="Costo Adicional";

@XendraTrl(Identifier="5af31364-661c-fc9d-b880-952313b69bd8")
public static String es_PE_FIELD_LandedCosts_LandedCost_Description="Costo Adicional a ser asignado a recibos de material ";

@XendraTrl(Identifier="5af31364-661c-fc9d-b880-952313b69bd8")
public static String es_PE_FIELD_LandedCosts_LandedCost_Help="Costo adicional le permite asignar costos a recibos de materiales previamente recibidos. Ejemplos Flete, seguro, suprimir impuesto, etc.";

@XendraField(AD_Column_ID="C_LandedCost_ID",IsCentrallyMaintained=true,
AD_Tab_ID="d4037ee4-ab56-68a4-b7fb-53af02bd6ebf",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5af31364-661c-fc9d-b880-952313b69bd8")
public static final String FIELDNAME_LandedCosts_LandedCost="5af31364-661c-fc9d-b880-952313b69bd8";
/** Column name C_LandedCost_ID */
public static final String COLUMNNAME_C_LandedCost_ID = "C_LandedCost_ID";
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

@XendraTrl(Identifier="bca06172-a521-bae2-c4c4-8605de912e61")
public static String es_PE_FIELD_LandedCosts_Description_Name="Observación";

@XendraTrl(Identifier="bca06172-a521-bae2-c4c4-8605de912e61")
public static String es_PE_FIELD_LandedCosts_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="bca06172-a521-bae2-c4c4-8605de912e61")
public static String es_PE_FIELD_LandedCosts_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="d4037ee4-ab56-68a4-b7fb-53af02bd6ebf",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bca06172-a521-bae2-c4c4-8605de912e61")
public static final String FIELDNAME_LandedCosts_Description="bca06172-a521-bae2-c4c4-8605de912e61";

@XendraTrl(Identifier="8cb63cf5-66e1-e711-500a-72709aa59bbf")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8cb63cf5-66e1-e711-500a-72709aa59bbf",
Synchronized="2019-08-30 22:21:47.0")
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
@XendraTrl(Identifier="b773ad2d-86d3-4a4a-8fe8-b16d5eaf4453")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b773ad2d-86d3-4a4a-8fe8-b16d5eaf4453",
Synchronized="2019-08-30 22:21:47.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Cost Distribution.
@param LandedCostDistribution Landed Cost Distribution */
public void setLandedCostDistribution (String LandedCostDistribution)
{
if (LandedCostDistribution.length() > 1)
{
log.warning("Length > 1 - truncated");
LandedCostDistribution = LandedCostDistribution.substring(0,0);
}
set_Value (COLUMNNAME_LandedCostDistribution, LandedCostDistribution);
}
/** Get Cost Distribution.
@return Landed Cost Distribution */
public String getLandedCostDistribution() 
{
return (String)get_Value(COLUMNNAME_LandedCostDistribution);
}

@XendraTrl(Identifier="e573dbdb-d121-7639-1991-1c2f08952004")
public static String es_PE_FIELD_LandedCosts_CostDistribution_Name="Distribución de Costo";

@XendraTrl(Identifier="e573dbdb-d121-7639-1991-1c2f08952004")
public static String es_PE_FIELD_LandedCosts_CostDistribution_Description="Distribución de costo aterrizado";

@XendraTrl(Identifier="e573dbdb-d121-7639-1991-1c2f08952004")
public static String es_PE_FIELD_LandedCosts_CostDistribution_Help="Cómo los costos aterrizados se distribuyen a los recibos materiales";

@XendraField(AD_Column_ID="LandedCostDistribution",IsCentrallyMaintained=true,
AD_Tab_ID="d4037ee4-ab56-68a4-b7fb-53af02bd6ebf",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e573dbdb-d121-7639-1991-1c2f08952004")
public static final String FIELDNAME_LandedCosts_CostDistribution="e573dbdb-d121-7639-1991-1c2f08952004";

@XendraTrl(Identifier="71467d03-1127-ac52-eeff-372bac050b4a")
public static String es_PE_COLUMN_LandedCostDistribution_Name="Distribución de Costo";

@XendraColumn(AD_Element_ID="9b2ca1c4-1fb5-7eae-bffa-bc563216c875",
ColumnName="LandedCostDistribution",AD_Reference_ID=17,
AD_Reference_Value_ID="1a5763cd-c568-02af-38a6-f3291883dadc",AD_Val_Rule_ID="",FieldLength=1,
DefaultValue="Q",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="71467d03-1127-ac52-eeff-372bac050b4a",
Synchronized="2019-08-30 22:21:47.0")
/** Column name LandedCostDistribution */
public static final String COLUMNNAME_LandedCostDistribution = "LandedCostDistribution";
/** Set Cost Element.
@param M_CostElement_ID Product Cost Element */
public void setM_CostElement_ID (int M_CostElement_ID)
{
if (M_CostElement_ID < 1) throw new IllegalArgumentException ("M_CostElement_ID is mandatory.");
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

@XendraTrl(Identifier="fb2f41bf-ca24-7f46-71eb-b5415ad044f3")
public static String es_PE_FIELD_LandedCosts_CostElement_Name="Elemento de Costo";

@XendraTrl(Identifier="fb2f41bf-ca24-7f46-71eb-b5415ad044f3")
public static String es_PE_FIELD_LandedCosts_CostElement_Description="Elemento de costo de producto";

@XendraField(AD_Column_ID="M_CostElement_ID",IsCentrallyMaintained=true,
AD_Tab_ID="d4037ee4-ab56-68a4-b7fb-53af02bd6ebf",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fb2f41bf-ca24-7f46-71eb-b5415ad044f3")
public static final String FIELDNAME_LandedCosts_CostElement="fb2f41bf-ca24-7f46-71eb-b5415ad044f3";

@XendraTrl(Identifier="6ae5f44c-835f-4e0f-e578-9e59ee2819a0")
public static String es_PE_COLUMN_M_CostElement_ID_Name="Elemento de Costo";

@XendraColumn(AD_Element_ID="1b5355ae-f799-dbe3-d07b-17cb2162e976",ColumnName="M_CostElement_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="6d65eced-52d9-7b4c-0244-8b4e02067511",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="6ae5f44c-835f-4e0f-e578-9e59ee2819a0",Synchronized="2019-08-30 22:21:47.0")
/** Column name M_CostElement_ID */
public static final String COLUMNNAME_M_CostElement_ID = "M_CostElement_ID";
/** Set Shipment/Receipt.
@param M_InOut_ID Material Shipment Document */
public void setM_InOut_ID (int M_InOut_ID)
{
if (M_InOut_ID <= 0) set_Value (COLUMNNAME_M_InOut_ID, null);
 else 
set_Value (COLUMNNAME_M_InOut_ID, Integer.valueOf(M_InOut_ID));
}
/** Get Shipment/Receipt.
@return Material Shipment Document */
public int getM_InOut_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_InOut_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="7121f17f-a89f-4a41-43e5-81450d38165b")
public static String es_PE_FIELD_LandedCosts_Receipt_Name="Entrega / Recibo";

@XendraTrl(Identifier="7121f17f-a89f-4a41-43e5-81450d38165b")
public static String es_PE_FIELD_LandedCosts_Receipt_Description="Entrega ó documento de recibo";

@XendraTrl(Identifier="7121f17f-a89f-4a41-43e5-81450d38165b")
public static String es_PE_FIELD_LandedCosts_Receipt_Help="La ID de Entrega / Recibo indica el documento único para esta entrega ó recibo";

@XendraField(AD_Column_ID="M_InOut_ID",IsCentrallyMaintained=true,
AD_Tab_ID="d4037ee4-ab56-68a4-b7fb-53af02bd6ebf",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=70,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7121f17f-a89f-4a41-43e5-81450d38165b")
public static final String FIELDNAME_LandedCosts_Receipt="7121f17f-a89f-4a41-43e5-81450d38165b";

@XendraTrl(Identifier="733e745e-9507-8e74-e96f-6a293001912f")
public static String es_PE_COLUMN_M_InOut_ID_Name="Entrega / Recibo";

@XendraColumn(AD_Element_ID="5c1a0edf-01a0-832e-098b-d49510db71db",ColumnName="M_InOut_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="282a7dd4-c219-6d9c-8540-9cd810db9dc6",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="733e745e-9507-8e74-e96f-6a293001912f",Synchronized="2019-08-30 22:21:47.0")
/** Column name M_InOut_ID */
public static final String COLUMNNAME_M_InOut_ID = "M_InOut_ID";
/** Set Shipment/Receipt Line.
@param M_InOutLine_ID Line on Shipment or Receipt document */
public void setM_InOutLine_ID (int M_InOutLine_ID)
{
if (M_InOutLine_ID <= 0) set_Value (COLUMNNAME_M_InOutLine_ID, null);
 else 
set_Value (COLUMNNAME_M_InOutLine_ID, Integer.valueOf(M_InOutLine_ID));
}
/** Get Shipment/Receipt Line.
@return Line on Shipment or Receipt document */
public int getM_InOutLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_InOutLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="a8c8c885-a8ff-3d9a-62e9-251c129927c2")
public static String es_PE_FIELD_LandedCosts_ReceiptLine_Name="Item Entrega / Recibo";

@XendraTrl(Identifier="a8c8c885-a8ff-3d9a-62e9-251c129927c2")
public static String es_PE_FIELD_LandedCosts_ReceiptLine_Description="Item de entrega ó documento de recibo.";

@XendraTrl(Identifier="a8c8c885-a8ff-3d9a-62e9-251c129927c2")
public static String es_PE_FIELD_LandedCosts_ReceiptLine_Help="Indica un Item único en un documento de entrega / recibo";

@XendraField(AD_Column_ID="M_InOutLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="d4037ee4-ab56-68a4-b7fb-53af02bd6ebf",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=80,SortNo=2,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a8c8c885-a8ff-3d9a-62e9-251c129927c2")
public static final String FIELDNAME_LandedCosts_ReceiptLine="a8c8c885-a8ff-3d9a-62e9-251c129927c2";

@XendraTrl(Identifier="fb4706e7-44dc-e78b-72ba-870b35dcedcf")
public static String es_PE_COLUMN_M_InOutLine_ID_Name="Línea Entrega / Recibo";

@XendraColumn(AD_Element_ID="a4d9928e-fbec-fd6c-b061-d3dbbd7de02c",ColumnName="M_InOutLine_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="adb6a9a7-f36f-cf40-6dfe-c2c0b1249f3b",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="fb4706e7-44dc-e78b-72ba-870b35dcedcf",Synchronized="2019-08-30 22:21:47.0")
/** Column name M_InOutLine_ID */
public static final String COLUMNNAME_M_InOutLine_ID = "M_InOutLine_ID";
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

@XendraTrl(Identifier="bcf7ce0e-c057-c6de-6c53-0219670323ec")
public static String es_PE_FIELD_LandedCosts_Product_Name="Producto";

@XendraTrl(Identifier="bcf7ce0e-c057-c6de-6c53-0219670323ec")
public static String es_PE_FIELD_LandedCosts_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="bcf7ce0e-c057-c6de-6c53-0219670323ec")
public static String es_PE_FIELD_LandedCosts_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="d4037ee4-ab56-68a4-b7fb-53af02bd6ebf",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=90,SortNo=3,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bcf7ce0e-c057-c6de-6c53-0219670323ec")
public static final String FIELDNAME_LandedCosts_Product="bcf7ce0e-c057-c6de-6c53-0219670323ec";

@XendraTrl(Identifier="c4704f08-db34-5d35-8a2b-93a96c8188bd")
public static String es_PE_COLUMN_M_Product_ID_Name="Producto";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="4281f8eb-238e-6b28-eb66-8cc866e6312c",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="c4704f08-db34-5d35-8a2b-93a96c8188bd",Synchronized="2019-08-30 22:21:47.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
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

@XendraTrl(Identifier="0e8e25c2-6e9e-d5b8-b706-a1a1e9f902dd")
public static String es_PE_FIELD_LandedCosts_ProcessNow_Name="Distribución de Costos";

@XendraTrl(Identifier="0e8e25c2-6e9e-d5b8-b706-a1a1e9f902dd")
public static String es_PE_FIELD_LandedCosts_ProcessNow_Description="Distribución de Costos a Productos ";

@XendraTrl(Identifier="0e8e25c2-6e9e-d5b8-b706-a1a1e9f902dd")
public static String es_PE_FIELD_LandedCosts_ProcessNow_Help="Distribución de Costos a Productos basados en selecciones - Bas de Distribución (Cantidad,Costo Actual línea, Peso)y Recibi/Línea o directamente para el producto. ";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="d4037ee4-ab56-68a4-b7fb-53af02bd6ebf",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0e8e25c2-6e9e-d5b8-b706-a1a1e9f902dd")
public static final String FIELDNAME_LandedCosts_ProcessNow="0e8e25c2-6e9e-d5b8-b706-a1a1e9f902dd";

@XendraTrl(Identifier="d4140ba3-a878-7c59-0d82-ec73e68586bf")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="2e3d6150-c16d-fc05-cb14-aac1443e907e",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="d4140ba3-a878-7c59-0d82-ec73e68586bf",Synchronized="2019-08-30 22:21:47.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
}
