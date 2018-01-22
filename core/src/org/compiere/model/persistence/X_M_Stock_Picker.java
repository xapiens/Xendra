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
/** Generated Model for M_Stock_Picker
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_Stock_Picker extends PO
{
/** Standard Constructor
@param ctx context
@param M_Stock_Picker_ID id
@param trxName transaction
*/
public X_M_Stock_Picker (Properties ctx, int M_Stock_Picker_ID, String trxName)
{
super (ctx, M_Stock_Picker_ID, trxName);
/** if (M_Stock_Picker_ID == 0)
{
setAD_User_ID (0);
setM_Locator_ID (0);
setM_Product_Brand_ID (0);
setM_Stock_Picker_ID (0);
setM_Warehouse_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_M_Stock_Picker (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000341 */
public static int Table_ID=MTable.getTable_ID("M_Stock_Picker");

@XendraTrl(Identifier="39cecb55-73ef-4ed7-b8b4-7a31593a8c6b")
public static String es_PE_TAB_StockPicker_Name="Stock Picker";
@XendraTab(Name="Stock Picker",
Description="",Help="",AD_Window_ID="3cf64ad7-aa81-4fb3-972a-b0169b02a788",SeqNo=10,TabLevel=0,
IsSingleRow=false,IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",
HasTree=false,WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",
AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",
ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="39cecb55-73ef-4ed7-b8b4-7a31593a8c6b",Synchronized="2016-03-18 14:00:15.0")
public static final String TABNAME_StockPicker="39cecb55-73ef-4ed7-b8b4-7a31593a8c6b";

@XendraTrl(Identifier="318cbf81-543f-4140-a825-3be2d8368dbc")
public static String es_PE_TABLE_M_Stock_Picker_Name="Stock Picker";

@XendraTable(Name="Stock Picker",Description="",Help="",TableName="M_Stock_Picker",AccessLevel="3",
AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,IsSecurityEnabled=false,IsDeleteable=true,
IsHighVolume=false,IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.material",
Identifier="318cbf81-543f-4140-a825-3be2d8368dbc",Synchronized="2017-08-16 11:43:35.0")
/** TableName=M_Stock_Picker */
public static final String Table_Name="M_Stock_Picker";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_Stock_Picker");

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
    Table_ID = MTable.getTable_ID("M_Stock_Picker");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_Stock_Picker[").append(get_ID()).append("]");
return sb.toString();
}
/** Set User/Contact.
@param AD_User_ID User within the system - Internal or Business Partner Contact */
public void setAD_User_ID (int AD_User_ID)
{
if (AD_User_ID < 1) throw new IllegalArgumentException ("AD_User_ID is mandatory.");
set_Value (COLUMNNAME_AD_User_ID, Integer.valueOf(AD_User_ID));
}
/** Get User/Contact.
@return User within the system - Internal or Business Partner Contact */
public int getAD_User_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_User_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="e7439c7d-0ca0-4e89-aa60-492531753c7b")
public static String es_PE_FIELD_StockPicker_UserContact_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="e7439c7d-0ca0-4e89-aa60-492531753c7b")
public static String es_PE_FIELD_StockPicker_UserContact_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraTrl(Identifier="e7439c7d-0ca0-4e89-aa60-492531753c7b")
public static String es_PE_FIELD_StockPicker_UserContact_Name="Usuario";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="39cecb55-73ef-4ed7-b8b4-7a31593a8c6b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-03-18 14:00:15.0",
Identifier="e7439c7d-0ca0-4e89-aa60-492531753c7b")
public static final String FIELDNAME_StockPicker_UserContact="e7439c7d-0ca0-4e89-aa60-492531753c7b";

@XendraTrl(Identifier="6fd4a64c-a9ab-44a1-bda6-2d5a13337363")
public static String es_PE_COLUMN_AD_User_ID_Name="User/Contact";

@XendraColumn(AD_Element_ID="abdf8dee-d3cd-73ec-c758-683e907797f4",ColumnName="AD_User_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6fd4a64c-a9ab-44a1-bda6-2d5a13337363",
Synchronized="2017-08-05 16:55:34.0")
/** Column name AD_User_ID */
public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";
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
@XendraTrl(Identifier="6e6b72dc-bc6b-4413-97d1-f2caa17e25a8")
public static String es_PE_FIELD_StockPicker_Identifier_Name="Identifier";

@XendraField(AD_Column_ID="Identifier",IsCentrallyMaintained=true,
AD_Tab_ID="39cecb55-73ef-4ed7-b8b4-7a31593a8c6b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=36,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-03-18 14:00:15.0",
Identifier="6e6b72dc-bc6b-4413-97d1-f2caa17e25a8")
public static final String FIELDNAME_StockPicker_Identifier="6e6b72dc-bc6b-4413-97d1-f2caa17e25a8";

@XendraTrl(Identifier="cf757734-b9e0-4843-ab1f-54589874dd8d")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cf757734-b9e0-4843-ab1f-54589874dd8d",
Synchronized="2017-08-05 16:55:34.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
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

@XendraTrl(Identifier="0a29dcae-38e7-4f27-a51e-26a08a86f213")
public static String es_PE_FIELD_StockPicker_Locator_Description="Ubicación de Almacén";

@XendraTrl(Identifier="0a29dcae-38e7-4f27-a51e-26a08a86f213")
public static String es_PE_FIELD_StockPicker_Locator_Help="El ID de la ubicación indica en que parte del almacén se localiza el producto";

@XendraTrl(Identifier="0a29dcae-38e7-4f27-a51e-26a08a86f213")
public static String es_PE_FIELD_StockPicker_Locator_Name="Ubicación";

@XendraField(AD_Column_ID="M_Locator_ID",IsCentrallyMaintained=true,
AD_Tab_ID="39cecb55-73ef-4ed7-b8b4-7a31593a8c6b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-03-18 14:00:15.0",
Identifier="0a29dcae-38e7-4f27-a51e-26a08a86f213")
public static final String FIELDNAME_StockPicker_Locator="0a29dcae-38e7-4f27-a51e-26a08a86f213";

@XendraTrl(Identifier="b097b4e5-6783-4db2-b2fc-0e3b19de3b4f")
public static String es_PE_COLUMN_M_Locator_ID_Name="Locator";

@XendraColumn(AD_Element_ID="67f044ce-2864-93f9-fd0d-320945150933",ColumnName="M_Locator_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b097b4e5-6783-4db2-b2fc-0e3b19de3b4f",
Synchronized="2017-08-05 16:55:34.0")
/** Column name M_Locator_ID */
public static final String COLUMNNAME_M_Locator_ID = "M_Locator_ID";
/** Set Product Brand.
@param M_Product_Brand_ID Brand of a Product */
public void setM_Product_Brand_ID (int M_Product_Brand_ID)
{
if (M_Product_Brand_ID < 1) throw new IllegalArgumentException ("M_Product_Brand_ID is mandatory.");
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

@XendraTrl(Identifier="796e4944-e259-4e49-a8be-29d8bffb04b4")
public static String es_PE_FIELD_StockPicker_ProductBrand_Description="";

@XendraTrl(Identifier="796e4944-e259-4e49-a8be-29d8bffb04b4")
public static String es_PE_FIELD_StockPicker_ProductBrand_Help="";

@XendraTrl(Identifier="796e4944-e259-4e49-a8be-29d8bffb04b4")
public static String es_PE_FIELD_StockPicker_ProductBrand_Name="Linea";

@XendraField(AD_Column_ID="M_Product_Brand_ID",IsCentrallyMaintained=true,
AD_Tab_ID="39cecb55-73ef-4ed7-b8b4-7a31593a8c6b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-03-18 14:00:15.0",
Identifier="796e4944-e259-4e49-a8be-29d8bffb04b4")
public static final String FIELDNAME_StockPicker_ProductBrand="796e4944-e259-4e49-a8be-29d8bffb04b4";

@XendraTrl(Identifier="31bd5010-fc4c-4dbd-a8f2-8e437ac145d5")
public static String es_PE_COLUMN_M_Product_Brand_ID_Name="Product Brand";

@XendraColumn(AD_Element_ID="028aa2e6-3ac7-548f-6575-e61a07ea3e9e",ColumnName="M_Product_Brand_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="31bd5010-fc4c-4dbd-a8f2-8e437ac145d5",
Synchronized="2017-08-05 16:55:34.0")
/** Column name M_Product_Brand_ID */
public static final String COLUMNNAME_M_Product_Brand_ID = "M_Product_Brand_ID";
/** Set Stock Picker.
@param M_Stock_Picker_ID Stock Picker */
public void setM_Stock_Picker_ID (int M_Stock_Picker_ID)
{
if (M_Stock_Picker_ID < 1) throw new IllegalArgumentException ("M_Stock_Picker_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_Stock_Picker_ID, Integer.valueOf(M_Stock_Picker_ID));
}
/** Get Stock Picker.
@return Stock Picker */
public int getM_Stock_Picker_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Stock_Picker_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="0e897ed1-c620-458f-877e-51db85b1e35c")
public static String es_PE_FIELD_StockPicker_StockPicker_Name="Stock Picker";

@XendraField(AD_Column_ID="M_Stock_Picker_ID",IsCentrallyMaintained=true,
AD_Tab_ID="39cecb55-73ef-4ed7-b8b4-7a31593a8c6b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-03-18 14:00:15.0",
Identifier="0e897ed1-c620-458f-877e-51db85b1e35c")
public static final String FIELDNAME_StockPicker_StockPicker="0e897ed1-c620-458f-877e-51db85b1e35c";
/** Column name M_Stock_Picker_ID */
public static final String COLUMNNAME_M_Stock_Picker_ID = "M_Stock_Picker_ID";
/** Set Warehouse.
@param M_Warehouse_ID Storage Warehouse and Service Point */
public void setM_Warehouse_ID (int M_Warehouse_ID)
{
if (M_Warehouse_ID < 1) throw new IllegalArgumentException ("M_Warehouse_ID is mandatory.");
set_Value (COLUMNNAME_M_Warehouse_ID, Integer.valueOf(M_Warehouse_ID));
}
/** Get Warehouse.
@return Storage Warehouse and Service Point */
public int getM_Warehouse_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Warehouse_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="cec18535-ba30-472d-bed7-4bdca10b029f")
public static String es_PE_FIELD_StockPicker_Warehouse_Description="Almacén";

@XendraTrl(Identifier="cec18535-ba30-472d-bed7-4bdca10b029f")
public static String es_PE_FIELD_StockPicker_Warehouse_Help="El Almacén indica un Almacén único donde los productos son almacenados";

@XendraTrl(Identifier="cec18535-ba30-472d-bed7-4bdca10b029f")
public static String es_PE_FIELD_StockPicker_Warehouse_Name="Almacén";

@XendraField(AD_Column_ID="M_Warehouse_ID",IsCentrallyMaintained=true,
AD_Tab_ID="39cecb55-73ef-4ed7-b8b4-7a31593a8c6b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-03-18 14:00:15.0",
Identifier="cec18535-ba30-472d-bed7-4bdca10b029f")
public static final String FIELDNAME_StockPicker_Warehouse="cec18535-ba30-472d-bed7-4bdca10b029f";

@XendraTrl(Identifier="91a8e6de-3a80-4aa2-a4df-8b95128b1502")
public static String es_PE_COLUMN_M_Warehouse_ID_Name="Warehouse";

@XendraColumn(AD_Element_ID="402045cd-baa5-aeaf-b148-a921dffb7821",ColumnName="M_Warehouse_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="91a8e6de-3a80-4aa2-a4df-8b95128b1502",
Synchronized="2017-08-05 16:55:34.0")
/** Column name M_Warehouse_ID */
public static final String COLUMNNAME_M_Warehouse_ID = "M_Warehouse_ID";
}
