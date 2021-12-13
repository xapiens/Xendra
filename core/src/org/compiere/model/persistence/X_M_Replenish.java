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
/** Generated Model for M_Replenish
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_Replenish extends PO
{
/** Standard Constructor
@param ctx context
@param M_Replenish_ID id
@param trxName transaction
*/
public X_M_Replenish (Properties ctx, int M_Replenish_ID, String trxName)
{
super (ctx, M_Replenish_ID, trxName);
/** if (M_Replenish_ID == 0)
{
setLevel_Max (Env.ZERO);	
// 0
setLevel_Min (Env.ZERO);	
// 0
setM_Product_ID (0);
setM_Warehouse_ID (0);
setReplenishType (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_M_Replenish (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=249 */
public static int Table_ID=MTable.getTable_ID("M_Replenish");

@XendraTrl(Identifier="0cf50741-bdd1-4390-7c8f-99941aabf6b0")
public static String es_PE_TAB_Replenish_Description="Define Reabastecimiento de Producto";

@XendraTrl(Identifier="0cf50741-bdd1-4390-7c8f-99941aabf6b0")
public static String es_PE_TAB_Replenish_Help="La pestaña Reabastecimiento define el tipo de cantidad reabastecimiento. Esto es empleado para ordenes automatizadas. Si seleccionó personalizar tipo reabastecimiento, debe realizar una implementación de clase org.compiere.util.ReplenishInterface y ajustar sobre nivel de almacén.";

@XendraTrl(Identifier="0cf50741-bdd1-4390-7c8f-99941aabf6b0")
public static String es_PE_TAB_Replenish_Name="Reabastecimiento";
@XendraTab(Name="Replenish",
Description="Define Product Replenishment",
Help="The Replenishment Tab defines the type of replenishment quantities.  This is used for automated ordering.  If you select a custom replenishment type, you need to create a class implementing org.compiere.util.ReplenishInterface and set that on warehouse level.",
AD_Window_ID="46ccc992-68c0-cc7a-5da1-f15017ce2fce",SeqNo=35,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="110a9030-a339-c5a7-52a0-18a4cb651ee6",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="0cf50741-bdd1-4390-7c8f-99941aabf6b0",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Replenish="0cf50741-bdd1-4390-7c8f-99941aabf6b0";

@XendraTrl(Identifier="a3d290aa-d186-2356-d01d-bfa943dd8175")
public static String es_PE_TAB_Replenish2_Description="Definir reabastecimiento";

@XendraTrl(Identifier="a3d290aa-d186-2356-d01d-bfa943dd8175")
public static String es_PE_TAB_Replenish2_Help="La pestaña de reabastecer define el tipo de reposición. Esta información es usada para reordenamiento automático.";

@XendraTrl(Identifier="a3d290aa-d186-2356-d01d-bfa943dd8175")
public static String es_PE_TAB_Replenish2_Name="Reabastecer";
@XendraTab(Name="Replenish",
Description="Define Product Replenishment",
Help="The Replenishment Tab defines the type of replenishment quantities.  This is used for automated ordering.  If you select a custom replenishment type, you need to create a class implementing org.compiere.util.ReplenishInterface and set that on warehouse level.",
AD_Window_ID="ce2d4e2c-ba4e-29bf-9f71-66fecdc05f55",SeqNo=60,TabLevel=1,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="ee6e24ef-76b0-5a1c-3720-83631f189433",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="a3d290aa-d186-2356-d01d-bfa943dd8175",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Replenish2="a3d290aa-d186-2356-d01d-bfa943dd8175";

@XendraTrl(Identifier="f5acf5f6-4242-429f-ecb5-15c09410a9f5")
public static String es_PE_TABLE_M_Replenish_Name="M_Replenish";

@XendraTable(Name="M_Replenish",AD_Package_ID="2809ac2d-7d43-20f8-05f0-a478f2e50204",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",TableName="M_Replenish",
AccessLevel="3",AD_Window_ID="ce2d4e2c-ba4e-29bf-9f71-66fecdc05f55",AD_Val_Rule_ID="",IsKey=0,
LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.material",
Identifier="f5acf5f6-4242-429f-ecb5-15c09410a9f5",Synchronized="2020-03-03 21:38:54.0")
/** TableName=M_Replenish */
public static final String Table_Name="M_Replenish";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_Replenish");

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
    Table_ID = MTable.getTable_ID("M_Replenish");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_Replenish[").append(get_ID()).append("]");
return sb.toString();
}
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
@XendraTrl(Identifier="3c003f1a-61ec-4e94-8e13-4ba4654c2eac")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3c003f1a-61ec-4e94-8e13-4ba4654c2eac",
Synchronized="2019-08-30 22:23:29.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Maximum Level.
@param Level_Max Maximum Inventory level for this product */
public void setLevel_Max (BigDecimal Level_Max)
{
if (Level_Max == null) throw new IllegalArgumentException ("Level_Max is mandatory.");
set_Value (COLUMNNAME_Level_Max, Level_Max);
}
/** Get Maximum Level.
@return Maximum Inventory level for this product */
public BigDecimal getLevel_Max() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Level_Max);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="e950eaa0-1d5d-35d1-5f38-a66898789b9e")
public static String es_PE_FIELD_Replenish_MaximumLevel_Name="Nivel Máximo";

@XendraTrl(Identifier="e950eaa0-1d5d-35d1-5f38-a66898789b9e")
public static String es_PE_FIELD_Replenish_MaximumLevel_Description="Nivel máximo de inventario para este producto";

@XendraTrl(Identifier="e950eaa0-1d5d-35d1-5f38-a66898789b9e")
public static String es_PE_FIELD_Replenish_MaximumLevel_Help="Indica la cantidad máxima de este producto a ser almacenada en inventario";

@XendraField(AD_Column_ID="Level_Max",IsCentrallyMaintained=true,
AD_Tab_ID="a3d290aa-d186-2356-d01d-bfa943dd8175",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e950eaa0-1d5d-35d1-5f38-a66898789b9e")
public static final String FIELDNAME_Replenish_MaximumLevel="e950eaa0-1d5d-35d1-5f38-a66898789b9e";

@XendraTrl(Identifier="1569a94e-1e39-d883-97b8-7574f3283956")
public static String es_PE_FIELD_Replenish_MaximumLevel2_Name="Nivel Máximo";

@XendraTrl(Identifier="1569a94e-1e39-d883-97b8-7574f3283956")
public static String es_PE_FIELD_Replenish_MaximumLevel2_Description="Nivel máximo de inventario para este producto";

@XendraTrl(Identifier="1569a94e-1e39-d883-97b8-7574f3283956")
public static String es_PE_FIELD_Replenish_MaximumLevel2_Help="Indica la cantidad máxima de este producto a ser almacenada en inventario";

@XendraField(AD_Column_ID="Level_Max",IsCentrallyMaintained=true,
AD_Tab_ID="0cf50741-bdd1-4390-7c8f-99941aabf6b0",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1569a94e-1e39-d883-97b8-7574f3283956")
public static final String FIELDNAME_Replenish_MaximumLevel2="1569a94e-1e39-d883-97b8-7574f3283956";

@XendraTrl(Identifier="106e8810-bdcb-85f0-9c2e-9b0d9467babd")
public static String es_PE_COLUMN_Level_Max_Name="Nivel Máximo";

@XendraColumn(AD_Element_ID="208d613f-fe5d-67df-60ea-10ddad36ccb5",ColumnName="Level_Max",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="106e8810-bdcb-85f0-9c2e-9b0d9467babd",
Synchronized="2019-08-30 22:23:29.0")
/** Column name Level_Max */
public static final String COLUMNNAME_Level_Max = "Level_Max";
/** Set Minimum Level.
@param Level_Min Minimum Inventory level for this product */
public void setLevel_Min (BigDecimal Level_Min)
{
if (Level_Min == null) throw new IllegalArgumentException ("Level_Min is mandatory.");
set_Value (COLUMNNAME_Level_Min, Level_Min);
}
/** Get Minimum Level.
@return Minimum Inventory level for this product */
public BigDecimal getLevel_Min() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Level_Min);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="e7959c06-231b-f362-78d2-2188644e087b")
public static String es_PE_FIELD_Replenish_MinimumLevel_Name="Nivel Mínimo";

@XendraTrl(Identifier="e7959c06-231b-f362-78d2-2188644e087b")
public static String es_PE_FIELD_Replenish_MinimumLevel_Description="Nivel mínimo de inventario para este producto";

@XendraTrl(Identifier="e7959c06-231b-f362-78d2-2188644e087b")
public static String es_PE_FIELD_Replenish_MinimumLevel_Help="Indica la cantidad mínima de este producto a ser almacenada en inventario";

@XendraField(AD_Column_ID="Level_Min",IsCentrallyMaintained=true,
AD_Tab_ID="a3d290aa-d186-2356-d01d-bfa943dd8175",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e7959c06-231b-f362-78d2-2188644e087b")
public static final String FIELDNAME_Replenish_MinimumLevel="e7959c06-231b-f362-78d2-2188644e087b";

@XendraTrl(Identifier="197980d5-025f-0d7f-e20b-1696e93dad88")
public static String es_PE_FIELD_Replenish_MinimumLevel2_Name="Nivel Mínimo";

@XendraTrl(Identifier="197980d5-025f-0d7f-e20b-1696e93dad88")
public static String es_PE_FIELD_Replenish_MinimumLevel2_Description="Nivel mínimo de inventario para este producto";

@XendraTrl(Identifier="197980d5-025f-0d7f-e20b-1696e93dad88")
public static String es_PE_FIELD_Replenish_MinimumLevel2_Help="Indica la cantidad mínima de este producto a ser almacenada en inventario";

@XendraField(AD_Column_ID="Level_Min",IsCentrallyMaintained=true,
AD_Tab_ID="0cf50741-bdd1-4390-7c8f-99941aabf6b0",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="197980d5-025f-0d7f-e20b-1696e93dad88")
public static final String FIELDNAME_Replenish_MinimumLevel2="197980d5-025f-0d7f-e20b-1696e93dad88";

@XendraTrl(Identifier="0af9a061-384e-5674-1000-5d64b62d49ce")
public static String es_PE_COLUMN_Level_Min_Name="Nivel Mínimo";

@XendraColumn(AD_Element_ID="23e1e821-a802-99ee-2a6a-0223aab95ea4",ColumnName="Level_Min",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0af9a061-384e-5674-1000-5d64b62d49ce",
Synchronized="2019-08-30 22:23:29.0")
/** Column name Level_Min */
public static final String COLUMNNAME_Level_Min = "Level_Min";
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

@XendraTrl(Identifier="e0acd3da-bcec-2ad9-179d-b76a685258c9")
public static String es_PE_FIELD_Replenish_Product_Name="Producto";

@XendraTrl(Identifier="e0acd3da-bcec-2ad9-179d-b76a685258c9")
public static String es_PE_FIELD_Replenish_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="e0acd3da-bcec-2ad9-179d-b76a685258c9")
public static String es_PE_FIELD_Replenish_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a3d290aa-d186-2356-d01d-bfa943dd8175",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e0acd3da-bcec-2ad9-179d-b76a685258c9")
public static final String FIELDNAME_Replenish_Product="e0acd3da-bcec-2ad9-179d-b76a685258c9";

@XendraTrl(Identifier="7552cc67-f2db-815b-75c0-b430ae7d8904")
public static String es_PE_FIELD_Replenish_Product2_Name="Producto";

@XendraTrl(Identifier="7552cc67-f2db-815b-75c0-b430ae7d8904")
public static String es_PE_FIELD_Replenish_Product2_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="7552cc67-f2db-815b-75c0-b430ae7d8904")
public static String es_PE_FIELD_Replenish_Product2_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0cf50741-bdd1-4390-7c8f-99941aabf6b0",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7552cc67-f2db-815b-75c0-b430ae7d8904")
public static final String FIELDNAME_Replenish_Product2="7552cc67-f2db-815b-75c0-b430ae7d8904";

@XendraTrl(Identifier="ee6e24ef-76b0-5a1c-3720-83631f189433")
public static String es_PE_COLUMN_M_Product_ID_Name="Producto";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="4281f8eb-238e-6b28-eb66-8cc866e6312c",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=true,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="ee6e24ef-76b0-5a1c-3720-83631f189433",Synchronized="2019-08-30 22:23:29.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
/** Set Warehouse.
@param M_Warehouse_ID Storage Warehouse and Service Point */
public void setM_Warehouse_ID (int M_Warehouse_ID)
{
if (M_Warehouse_ID < 1) throw new IllegalArgumentException ("M_Warehouse_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_Warehouse_ID, Integer.valueOf(M_Warehouse_ID));
}
/** Get Warehouse.
@return Storage Warehouse and Service Point */
public int getM_Warehouse_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Warehouse_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="7b6edf5c-c838-d9c7-380a-324968b51042")
public static String es_PE_FIELD_Replenish_Warehouse_Name="Almacén";

@XendraTrl(Identifier="7b6edf5c-c838-d9c7-380a-324968b51042")
public static String es_PE_FIELD_Replenish_Warehouse_Description="Almacén";

@XendraTrl(Identifier="7b6edf5c-c838-d9c7-380a-324968b51042")
public static String es_PE_FIELD_Replenish_Warehouse_Help="El Almacén indica un Almacén único donde los productos son almacenados";

@XendraField(AD_Column_ID="M_Warehouse_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a3d290aa-d186-2356-d01d-bfa943dd8175",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7b6edf5c-c838-d9c7-380a-324968b51042")
public static final String FIELDNAME_Replenish_Warehouse="7b6edf5c-c838-d9c7-380a-324968b51042";

@XendraTrl(Identifier="75c3463c-472a-712f-7f39-07817050e881")
public static String es_PE_FIELD_Replenish_Warehouse2_Name="Almacén";

@XendraTrl(Identifier="75c3463c-472a-712f-7f39-07817050e881")
public static String es_PE_FIELD_Replenish_Warehouse2_Description="Almacén";

@XendraTrl(Identifier="75c3463c-472a-712f-7f39-07817050e881")
public static String es_PE_FIELD_Replenish_Warehouse2_Help="El Almacén indica un Almacén único donde los productos son almacenados";

@XendraField(AD_Column_ID="M_Warehouse_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0cf50741-bdd1-4390-7c8f-99941aabf6b0",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="75c3463c-472a-712f-7f39-07817050e881")
public static final String FIELDNAME_Replenish_Warehouse2="75c3463c-472a-712f-7f39-07817050e881";

@XendraTrl(Identifier="110a9030-a339-c5a7-52a0-18a4cb651ee6")
public static String es_PE_COLUMN_M_Warehouse_ID_Name="Almacén";

@XendraColumn(AD_Element_ID="402045cd-baa5-aeaf-b148-a921dffb7821",ColumnName="M_Warehouse_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="110a9030-a339-c5a7-52a0-18a4cb651ee6",
Synchronized="2019-08-30 22:23:30.0")
/** Column name M_Warehouse_ID */
public static final String COLUMNNAME_M_Warehouse_ID = "M_Warehouse_ID";
/** Set Source Warehouse.
@param M_WarehouseSource_ID Optional Warehouse to replenish from */
public void setM_WarehouseSource_ID (int M_WarehouseSource_ID)
{
if (M_WarehouseSource_ID <= 0) set_Value (COLUMNNAME_M_WarehouseSource_ID, null);
 else 
set_Value (COLUMNNAME_M_WarehouseSource_ID, Integer.valueOf(M_WarehouseSource_ID));
}
/** Get Source Warehouse.
@return Optional Warehouse to replenish from */
public int getM_WarehouseSource_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_WarehouseSource_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="4f0e141a-9dab-cf9c-76bb-f57781c31630")
public static String es_PE_FIELD_Replenish_SourceWarehouse_Name="n seleccionado ";

@XendraField(AD_Column_ID="M_WarehouseSource_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a3d290aa-d186-2356-d01d-bfa943dd8175",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4f0e141a-9dab-cf9c-76bb-f57781c31630")
public static final String FIELDNAME_Replenish_SourceWarehouse="4f0e141a-9dab-cf9c-76bb-f57781c31630";

@XendraTrl(Identifier="61e1dd6e-080e-9638-e706-3e4d2e415159")
public static String es_PE_FIELD_Replenish_SourceWarehouse2_Name="Almacén Fuente";

@XendraTrl(Identifier="61e1dd6e-080e-9638-e706-3e4d2e415159")
public static String es_PE_FIELD_Replenish_SourceWarehouse2_Description="Almacén Opcional de Reabastecimiento para ";

@XendraTrl(Identifier="61e1dd6e-080e-9638-e706-3e4d2e415159")
public static String es_PE_FIELD_Replenish_SourceWarehouse2_Help="Si seleccionó, el almacén seleccionado es empleado para reabastecimiento de producto(s)";

@XendraField(AD_Column_ID="M_WarehouseSource_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0cf50741-bdd1-4390-7c8f-99941aabf6b0",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="61e1dd6e-080e-9638-e706-3e4d2e415159")
public static final String FIELDNAME_Replenish_SourceWarehouse2="61e1dd6e-080e-9638-e706-3e4d2e415159";

@XendraTrl(Identifier="72d6272a-d041-5f52-9645-47ad3a0acbe9")
public static String es_PE_COLUMN_M_WarehouseSource_ID_Name="Almacén Fuente";

@XendraColumn(AD_Element_ID="47beb296-0f71-6c17-c133-5f1b98bf1682",
ColumnName="M_WarehouseSource_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="e3999c76-66f0-38b0-a95e-fb0d580cde7a",AD_Val_Rule_ID="",FieldLength=10,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="72d6272a-d041-5f52-9645-47ad3a0acbe9",
Synchronized="2019-08-30 22:23:30.0")
/** Column name M_WarehouseSource_ID */
public static final String COLUMNNAME_M_WarehouseSource_ID = "M_WarehouseSource_ID";
/** Set Replenish Type.
@param ReplenishType Method for re-ordering a product */
public void setReplenishType (String ReplenishType)
{
if (ReplenishType.length() > 1)
{
log.warning("Length > 1 - truncated");
ReplenishType = ReplenishType.substring(0,0);
}
set_Value (COLUMNNAME_ReplenishType, ReplenishType);
}
/** Get Replenish Type.
@return Method for re-ordering a product */
public String getReplenishType() 
{
return (String)get_Value(COLUMNNAME_ReplenishType);
}

@XendraTrl(Identifier="8807c393-f846-d0b9-2fd7-f94c2fc41c65")
public static String es_PE_FIELD_Replenish_ReplenishType_Name="Tipo de Reabastecimiento";

@XendraTrl(Identifier="8807c393-f846-d0b9-2fd7-f94c2fc41c65")
public static String es_PE_FIELD_Replenish_ReplenishType_Description="Método para re-ordenar un producto";

@XendraTrl(Identifier="8807c393-f846-d0b9-2fd7-f94c2fc41c65")
public static String es_PE_FIELD_Replenish_ReplenishType_Help="El Tipo de Reabastecimiento indica si este producto será manualmente reordenado; ordenado cuando la cantidad esté por debajo de la cantidad mínima u ordenado cuando esté debajo de la cantidad máxima.";

@XendraField(AD_Column_ID="ReplenishType",IsCentrallyMaintained=true,
AD_Tab_ID="a3d290aa-d186-2356-d01d-bfa943dd8175",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8807c393-f846-d0b9-2fd7-f94c2fc41c65")
public static final String FIELDNAME_Replenish_ReplenishType="8807c393-f846-d0b9-2fd7-f94c2fc41c65";

@XendraTrl(Identifier="d0885e29-0365-598a-179a-3f11b5d2a347")
public static String es_PE_FIELD_Replenish_ReplenishType2_Name="Tipo de Reabastecimiento";

@XendraTrl(Identifier="d0885e29-0365-598a-179a-3f11b5d2a347")
public static String es_PE_FIELD_Replenish_ReplenishType2_Description="Método para re-ordenar un producto";

@XendraTrl(Identifier="d0885e29-0365-598a-179a-3f11b5d2a347")
public static String es_PE_FIELD_Replenish_ReplenishType2_Help="El Tipo de Reabastecimiento indica si este producto será manualmente reordenado; ordenado cuando la cantidad esté por debajo de la cantidad mínima u ordenado cuando esté debajo de la cantidad máxima.";

@XendraField(AD_Column_ID="ReplenishType",IsCentrallyMaintained=true,
AD_Tab_ID="0cf50741-bdd1-4390-7c8f-99941aabf6b0",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d0885e29-0365-598a-179a-3f11b5d2a347")
public static final String FIELDNAME_Replenish_ReplenishType2="d0885e29-0365-598a-179a-3f11b5d2a347";

@XendraTrl(Identifier="e833013b-f616-2612-d551-147a422328fd")
public static String es_PE_COLUMN_ReplenishType_Name="Tipo de Reabastecimiento";

@XendraColumn(AD_Element_ID="b40e880b-813a-5bc0-caa7-dd8ed9e21f1d",ColumnName="ReplenishType",
AD_Reference_ID=17,AD_Reference_Value_ID="4ae23d3a-7913-5665-971c-430591c605b3",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=true,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="e833013b-f616-2612-d551-147a422328fd",Synchronized="2019-08-30 22:23:30.0")
/** Column name ReplenishType */
public static final String COLUMNNAME_ReplenishType = "ReplenishType";
}
