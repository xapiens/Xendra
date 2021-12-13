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
/** Generated Model for M_ProductionPlan
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_ProductionPlan extends PO
{
/** Standard Constructor
@param ctx context
@param M_ProductionPlan_ID id
@param trxName transaction
*/
public X_M_ProductionPlan (Properties ctx, int M_ProductionPlan_ID, String trxName)
{
super (ctx, M_ProductionPlan_ID, trxName);
/** if (M_ProductionPlan_ID == 0)
{
setLine (0);	
// @SQL=SELECT COALESCE(MAX(Line),0)+10 AS DefaultValue FROM M_ProductionPlan WHERE M_Production_ID=@M_Production_ID@
setM_Locator_ID (0);	
// @M_Locator_ID@
setM_Product_ID (0);
setM_Production_ID (0);
setM_ProductionPlan_ID (0);
setProcessed (false);	
// N
setProductionQty (Env.ZERO);	
// 1
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_M_ProductionPlan (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=385 */
public static int Table_ID=MTable.getTable_ID("M_ProductionPlan");

@XendraTrl(Identifier="d06ad7c7-ec81-4a28-5ccc-7701b83d62b0")
public static String es_PE_TAB_ProductionPlan_Description="Plan de Producción";

@XendraTrl(Identifier="d06ad7c7-ec81-4a28-5ccc-7701b83d62b0")
public static String es_PE_TAB_ProductionPlan_Help="La pestaña Plan de Producción define cada ítem usado y generado en una producción.";

@XendraTrl(Identifier="d06ad7c7-ec81-4a28-5ccc-7701b83d62b0")
public static String es_PE_TAB_ProductionPlan_Name="Plan de Producción";

@XendraTab(Name="Production Plan",Description="Production Plan",
Help="The Production Plan Tab defines the items used and generated in a production.",
AD_Window_ID="735b6408-f744-4421-e308-a3bb880dfd24",SeqNo=20,TabLevel=1,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="d06ad7c7-ec81-4a28-5ccc-7701b83d62b0",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_ProductionPlan="d06ad7c7-ec81-4a28-5ccc-7701b83d62b0";

@XendraTrl(Identifier="92d06592-9f83-fed4-d9ac-166087625231")
public static String es_PE_TABLE_M_ProductionPlan_Name="Plan de Producción";

@XendraTable(Name="Production Plan",AD_Package_ID="2809ac2d-7d43-20f8-05f0-a478f2e50204",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",
Description="Plan for how a product is produced",Help="",TableName="M_ProductionPlan",
AccessLevel="3",AD_Window_ID="735b6408-f744-4421-e308-a3bb880dfd24",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=130,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.material",
Identifier="92d06592-9f83-fed4-d9ac-166087625231",Synchronized="2020-03-03 21:38:52.0")
/** TableName=M_ProductionPlan */
public static final String Table_Name="M_ProductionPlan";


@XendraIndex(Name="m_productionplan_production",Identifier="3e78b5ed-0cda-645c-618d-58a94d6e9e1a",
Column_Names="m_production_id",IsUnique="false",
TableIdentifier="3e78b5ed-0cda-645c-618d-58a94d6e9e1a",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_m_productionplan_production = "3e78b5ed-0cda-645c-618d-58a94d6e9e1a";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_ProductionPlan");

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
    Table_ID = MTable.getTable_ID("M_ProductionPlan");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_ProductionPlan[").append(get_ID()).append("]");
return sb.toString();
}
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

@XendraTrl(Identifier="91b3c7c6-c57f-d957-0f1f-57d098e028ee")
public static String es_PE_FIELD_ProductionPlan_Description_Name="Observación";

@XendraTrl(Identifier="91b3c7c6-c57f-d957-0f1f-57d098e028ee")
public static String es_PE_FIELD_ProductionPlan_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="91b3c7c6-c57f-d957-0f1f-57d098e028ee")
public static String es_PE_FIELD_ProductionPlan_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="d06ad7c7-ec81-4a28-5ccc-7701b83d62b0",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="91b3c7c6-c57f-d957-0f1f-57d098e028ee")
public static final String FIELDNAME_ProductionPlan_Description="91b3c7c6-c57f-d957-0f1f-57d098e028ee";

@XendraTrl(Identifier="4b9b36c0-c4ba-c605-4771-a8f69ed046a1")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4b9b36c0-c4ba-c605-4771-a8f69ed046a1",
Synchronized="2020-02-07 18:00:46.0")
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
@XendraTrl(Identifier="0c1c7611-bc51-4dda-959b-c08382b014e7")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0c1c7611-bc51-4dda-959b-c08382b014e7",
Synchronized="2020-02-07 18:00:46.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set InCost.
@param InCost InCost */
public void setInCost (BigDecimal InCost)
{
set_Value (COLUMNNAME_InCost, InCost);
}
/** Get InCost.
@return InCost */
public BigDecimal getInCost() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_InCost);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="daebca7e-7150-44a3-aae5-94a6f0af2228")
public static String es_PE_COLUMN_InCost_Name="InCost";

@XendraColumn(AD_Element_ID="a62237a4-c96c-35df-d692-6a61aabd0fd5",ColumnName="InCost",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="daebca7e-7150-44a3-aae5-94a6f0af2228",
Synchronized="2020-02-07 18:00:46.0")
/** Column name InCost */
public static final String COLUMNNAME_InCost = "InCost";
/** Set Line No.
@param Line Unique line for this document */
public void setLine (int Line)
{
set_Value (COLUMNNAME_Line, Integer.valueOf(Line));
}
/** Get Line No.
@return Unique line for this document */
public int getLine() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Line);
if (ii == null) return 0;
return ii.intValue();
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getLine()));
}

@XendraTrl(Identifier="66d4c09b-f643-642a-2c6a-daef3ebf6608")
public static String es_PE_FIELD_ProductionPlan_LineNo_Name="No. Línea";

@XendraTrl(Identifier="66d4c09b-f643-642a-2c6a-daef3ebf6608")
public static String es_PE_FIELD_ProductionPlan_LineNo_Description="No. Línea único para este documento";

@XendraTrl(Identifier="66d4c09b-f643-642a-2c6a-daef3ebf6608")
public static String es_PE_FIELD_ProductionPlan_LineNo_Help="Indica el No. Línea para un documento. También controlará el orden de despliegue de las líneas dentro de un documento";

@XendraField(AD_Column_ID="Line",IsCentrallyMaintained=true,
AD_Tab_ID="d06ad7c7-ec81-4a28-5ccc-7701b83d62b0",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=60,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="66d4c09b-f643-642a-2c6a-daef3ebf6608")
public static final String FIELDNAME_ProductionPlan_LineNo="66d4c09b-f643-642a-2c6a-daef3ebf6608";

@XendraTrl(Identifier="c0b5030c-d72e-c29b-ef02-59cb2c931532")
public static String es_PE_COLUMN_Line_Name="No. Línea";

@XendraColumn(AD_Element_ID="986ef077-61da-f9cf-1c6d-aefe3a35113b",ColumnName="Line",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="@SQL=SELECT COALESCE(MAX(Line),0)+10 AS DefaultValue FROM M_ProductionPlan WHERE M_Production_ID=@M_Production_ID@",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c0b5030c-d72e-c29b-ef02-59cb2c931532",
Synchronized="2020-02-07 18:00:46.0")
/** Column name Line */
public static final String COLUMNNAME_Line = "Line";
/** Set Locator.
@param M_Locator_ID Warehouse Locator */
public void setM_Locator_ID (int M_Locator_ID)
{
if (M_Locator_ID < 1) throw new IllegalArgumentException ("M_Locator_ID is mandatory.");
set_Value (COLUMNNAME_M_Locator_ID, Integer.valueOf(M_Locator_ID));
}
/** Get Locator.
@return Warehouse Locator */
public int getM_Locator_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Locator_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="94bbffd6-3dc0-a882-db54-20a5c5c8beb6")
public static String es_PE_FIELD_ProductionPlan_Locator_Name="Ubicación";

@XendraTrl(Identifier="94bbffd6-3dc0-a882-db54-20a5c5c8beb6")
public static String es_PE_FIELD_ProductionPlan_Locator_Description="Ubicación de Almacén";

@XendraTrl(Identifier="94bbffd6-3dc0-a882-db54-20a5c5c8beb6")
public static String es_PE_FIELD_ProductionPlan_Locator_Help="El ID de la ubicación indica en que parte del almacén se localiza el producto";

@XendraField(AD_Column_ID="M_Locator_ID",IsCentrallyMaintained=true,
AD_Tab_ID="d06ad7c7-ec81-4a28-5ccc-7701b83d62b0",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="94bbffd6-3dc0-a882-db54-20a5c5c8beb6")
public static final String FIELDNAME_ProductionPlan_Locator="94bbffd6-3dc0-a882-db54-20a5c5c8beb6";

@XendraTrl(Identifier="d7a88864-00e4-41e5-def0-3c08646db31a")
public static String es_PE_COLUMN_M_Locator_ID_Name="Ubicación";

@XendraColumn(AD_Element_ID="67f044ce-2864-93f9-fd0d-320945150933",ColumnName="M_Locator_ID",
AD_Reference_ID=31,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="@M_Locator_ID@",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=true,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="d7a88864-00e4-41e5-def0-3c08646db31a",Synchronized="2020-02-07 18:00:46.0")
/** Column name M_Locator_ID */
public static final String COLUMNNAME_M_Locator_ID = "M_Locator_ID";
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

@XendraTrl(Identifier="f42910ee-aa88-6c8c-f2fe-f3ca897c2d3a")
public static String es_PE_FIELD_ProductionPlan_Product_Name="Producto";

@XendraTrl(Identifier="f42910ee-aa88-6c8c-f2fe-f3ca897c2d3a")
public static String es_PE_FIELD_ProductionPlan_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="f42910ee-aa88-6c8c-f2fe-f3ca897c2d3a")
public static String es_PE_FIELD_ProductionPlan_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="d06ad7c7-ec81-4a28-5ccc-7701b83d62b0",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=2,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f42910ee-aa88-6c8c-f2fe-f3ca897c2d3a")
public static final String FIELDNAME_ProductionPlan_Product="f42910ee-aa88-6c8c-f2fe-f3ca897c2d3a";

@XendraTrl(Identifier="87dae2f0-794d-4e29-1031-51ece6d837bc")
public static String es_PE_COLUMN_M_Product_ID_Name="Producto";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="8b1fe0be-1a6b-167f-67d3-2decbd5cb379",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=true,SeqNo=2,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=true,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="87dae2f0-794d-4e29-1031-51ece6d837bc",Synchronized="2020-02-07 18:00:46.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
/** Set Production.
@param M_Production_ID Plan for producing a product */
public void setM_Production_ID (int M_Production_ID)
{
if (M_Production_ID < 1) throw new IllegalArgumentException ("M_Production_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_Production_ID, Integer.valueOf(M_Production_ID));
}
/** Get Production.
@return Plan for producing a product */
public int getM_Production_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Production_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="dcd71051-cd97-7c62-2b13-7c9a0cae13cf")
public static String es_PE_FIELD_ProductionPlan_Production_Name="Producción";

@XendraTrl(Identifier="dcd71051-cd97-7c62-2b13-7c9a0cae13cf")
public static String es_PE_FIELD_ProductionPlan_Production_Description="Plan para producir un producto";

@XendraTrl(Identifier="dcd71051-cd97-7c62-2b13-7c9a0cae13cf")
public static String es_PE_FIELD_ProductionPlan_Production_Help="La producción únicamente identifica un plan de producción";

@XendraField(AD_Column_ID="M_Production_ID",IsCentrallyMaintained=true,
AD_Tab_ID="d06ad7c7-ec81-4a28-5ccc-7701b83d62b0",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="dcd71051-cd97-7c62-2b13-7c9a0cae13cf")
public static final String FIELDNAME_ProductionPlan_Production="dcd71051-cd97-7c62-2b13-7c9a0cae13cf";

@XendraTrl(Identifier="fef95710-2df6-cf03-81b9-837b5ca7b907")
public static String es_PE_COLUMN_M_Production_ID_Name="Producción";

@XendraColumn(AD_Element_ID="9c8dd82c-e2c6-2b73-d9f8-045652e10cb9",ColumnName="M_Production_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fef95710-2df6-cf03-81b9-837b5ca7b907",
Synchronized="2020-02-07 18:00:46.0")
/** Column name M_Production_ID */
public static final String COLUMNNAME_M_Production_ID = "M_Production_ID";
/** Set Production Plan.
@param M_ProductionPlan_ID Plan for how a product is produced */
public void setM_ProductionPlan_ID (int M_ProductionPlan_ID)
{
if (M_ProductionPlan_ID < 1) throw new IllegalArgumentException ("M_ProductionPlan_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_ProductionPlan_ID, Integer.valueOf(M_ProductionPlan_ID));
}
/** Get Production Plan.
@return Plan for how a product is produced */
public int getM_ProductionPlan_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_ProductionPlan_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d0fdf545-3150-4d67-f306-a90603218024")
public static String es_PE_FIELD_ProductionPlan_ProductionPlan_Name="Plan de Producción";

@XendraTrl(Identifier="d0fdf545-3150-4d67-f306-a90603218024")
public static String es_PE_FIELD_ProductionPlan_ProductionPlan_Description="Plan de cómo un producto es producido";

@XendraTrl(Identifier="d0fdf545-3150-4d67-f306-a90603218024")
public static String es_PE_FIELD_ProductionPlan_ProductionPlan_Help="El plan de producción identifica las partidas y pasos en la generación de un producto.";

@XendraField(AD_Column_ID="M_ProductionPlan_ID",IsCentrallyMaintained=true,
AD_Tab_ID="d06ad7c7-ec81-4a28-5ccc-7701b83d62b0",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d0fdf545-3150-4d67-f306-a90603218024")
public static final String FIELDNAME_ProductionPlan_ProductionPlan="d0fdf545-3150-4d67-f306-a90603218024";
/** Column name M_ProductionPlan_ID */
public static final String COLUMNNAME_M_ProductionPlan_ID = "M_ProductionPlan_ID";
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

@XendraTrl(Identifier="5c84a293-e160-0d4d-cc88-3087366cbf35")
public static String es_PE_FIELD_ProductionPlan_Processed_Name="Procesado";

@XendraTrl(Identifier="5c84a293-e160-0d4d-cc88-3087366cbf35")
public static String es_PE_FIELD_ProductionPlan_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="5c84a293-e160-0d4d-cc88-3087366cbf35")
public static String es_PE_FIELD_ProductionPlan_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="d06ad7c7-ec81-4a28-5ccc-7701b83d62b0",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=20,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5c84a293-e160-0d4d-cc88-3087366cbf35")
public static final String FIELDNAME_ProductionPlan_Processed="5c84a293-e160-0d4d-cc88-3087366cbf35";

@XendraTrl(Identifier="9a058e53-a989-6d27-a8b3-e1111c9c94e8")
public static String es_PE_COLUMN_Processed_Name="Procesado";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9a058e53-a989-6d27-a8b3-e1111c9c94e8",
Synchronized="2020-02-07 18:00:46.0")
/** Column name Processed */
public static final String COLUMNNAME_Processed = "Processed";
/** Set Production Quantity.
@param ProductionQty Quantity of products to produce */
public void setProductionQty (BigDecimal ProductionQty)
{
if (ProductionQty == null) throw new IllegalArgumentException ("ProductionQty is mandatory.");
set_Value (COLUMNNAME_ProductionQty, ProductionQty);
}
/** Get Production Quantity.
@return Quantity of products to produce */
public BigDecimal getProductionQty() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_ProductionQty);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="aa64b6da-405d-64ec-fdd1-5d24fe2da4c3")
public static String es_PE_FIELD_ProductionPlan_ProductionQuantity_Name="Cantidad a Producir";

@XendraTrl(Identifier="aa64b6da-405d-64ec-fdd1-5d24fe2da4c3")
public static String es_PE_FIELD_ProductionPlan_ProductionQuantity_Description="Cantidad del producto a producir";

@XendraTrl(Identifier="aa64b6da-405d-64ec-fdd1-5d24fe2da4c3")
public static String es_PE_FIELD_ProductionPlan_ProductionQuantity_Help="La Cantidad de Producción identifica el número de productos a producir";

@XendraField(AD_Column_ID="ProductionQty",IsCentrallyMaintained=true,
AD_Tab_ID="d06ad7c7-ec81-4a28-5ccc-7701b83d62b0",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="aa64b6da-405d-64ec-fdd1-5d24fe2da4c3")
public static final String FIELDNAME_ProductionPlan_ProductionQuantity="aa64b6da-405d-64ec-fdd1-5d24fe2da4c3";

@XendraTrl(Identifier="a38ba383-3c33-2d82-86e8-aeed91a0ac81")
public static String es_PE_COLUMN_ProductionQty_Name="Cantidad a Producir";

@XendraColumn(AD_Element_ID="824ac537-40d9-8cf8-7f81-d882e922eb33",ColumnName="ProductionQty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="1",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a38ba383-3c33-2d82-86e8-aeed91a0ac81",
Synchronized="2020-02-07 18:00:46.0")
/** Column name ProductionQty */
public static final String COLUMNNAME_ProductionQty = "ProductionQty";
}
