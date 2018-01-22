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
/** Generated Model for M_InventoryLineMA
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_InventoryLineMA extends PO
{
/** Standard Constructor
@param ctx context
@param M_InventoryLineMA_ID id
@param trxName transaction
*/
public X_M_InventoryLineMA (Properties ctx, int M_InventoryLineMA_ID, String trxName)
{
super (ctx, M_InventoryLineMA_ID, trxName);
/** if (M_InventoryLineMA_ID == 0)
{
setM_AttributeSetInstance_ID (0);
setM_InventoryLine_ID (0);
setMovementQty (Env.ZERO);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_M_InventoryLineMA (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=763 */
public static int Table_ID=MTable.getTable_ID("M_InventoryLineMA");

@XendraTrl(Identifier="88a44b1a-7fbb-cf24-5a53-466ed4ccc33f")
public static String es_PE_TAB_Attributes_Description="Producto Instancia Atributo Material Asignación";

@XendraTrl(Identifier="88a44b1a-7fbb-cf24-5a53-466ed4ccc33f")
public static String es_PE_TAB_Attributes_Name="Atributos";
@XendraTab(Name="Attributes",
Description="Product Instance Attribute Material Allocation",Help="",
AD_Window_ID="a8fe7291-40b1-7bfb-fc66-0a724a144092",SeqNo=30,TabLevel=2,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=true,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=false,IsAdvancedTab=true,Parent_Column_ID="",
Identifier="88a44b1a-7fbb-cf24-5a53-466ed4ccc33f",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Attributes="88a44b1a-7fbb-cf24-5a53-466ed4ccc33f";

@XendraTrl(Identifier="76214ed8-b5e4-e670-198c-2eddbc6c797f")
public static String es_PE_TABLE_M_InventoryLineMA_Name="M_InventoryLineMA";

@XendraTable(Name="M_InventoryLineMA",Description="",Help="",TableName="M_InventoryLineMA",
AccessLevel="1",AD_Window_ID="a8fe7291-40b1-7bfb-fc66-0a724a144092",AD_Val_Rule_ID="",IsKey=0,
LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.material",
Identifier="76214ed8-b5e4-e670-198c-2eddbc6c797f",Synchronized="2017-08-16 11:43:18.0")
/** TableName=M_InventoryLineMA */
public static final String Table_Name="M_InventoryLineMA";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_InventoryLineMA");

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
    Table_ID = MTable.getTable_ID("M_InventoryLineMA");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_InventoryLineMA[").append(get_ID()).append("]");
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
@XendraTrl(Identifier="786df238-61fe-430c-98a4-5d0c27c71d2b")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="786df238-61fe-430c-98a4-5d0c27c71d2b",
Synchronized="2017-08-05 16:55:13.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Attribute Set Instance.
@param M_AttributeSetInstance_ID Product Attribute Set Instance */
public void setM_AttributeSetInstance_ID (int M_AttributeSetInstance_ID)
{
if (M_AttributeSetInstance_ID < 0) throw new IllegalArgumentException ("M_AttributeSetInstance_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_AttributeSetInstance_ID, Integer.valueOf(M_AttributeSetInstance_ID));
}
/** Get Attribute Set Instance.
@return Product Attribute Set Instance */
public int getM_AttributeSetInstance_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_AttributeSetInstance_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="1348d757-b7ef-39b1-8906-d3b61781e5ed")
public static String es_PE_FIELD_Attributes_AttributeSetInstance_Description="Instancia del conjunto de atributos del producto";

@XendraTrl(Identifier="1348d757-b7ef-39b1-8906-d3b61781e5ed")
public static String es_PE_FIELD_Attributes_AttributeSetInstance_Help="Valor actual de Instancia del conjunto de atributos del producto";

@XendraTrl(Identifier="1348d757-b7ef-39b1-8906-d3b61781e5ed")
public static String es_PE_FIELD_Attributes_AttributeSetInstance_Name="Instancia del Conjunto de Atributos";

@XendraField(AD_Column_ID="M_AttributeSetInstance_ID",IsCentrallyMaintained=true,
AD_Tab_ID="88a44b1a-7fbb-cf24-5a53-466ed4ccc33f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1348d757-b7ef-39b1-8906-d3b61781e5ed")
public static final String FIELDNAME_Attributes_AttributeSetInstance="1348d757-b7ef-39b1-8906-d3b61781e5ed";

@XendraTrl(Identifier="bf991d4d-d349-1a7d-004b-761f2ea9cdaa")
public static String es_PE_COLUMN_M_AttributeSetInstance_ID_Name="Instancia del Conjunto de Atributos";

@XendraColumn(AD_Element_ID="137807f2-3c52-e193-3ceb-f10b819cf955",
ColumnName="M_AttributeSetInstance_ID",AD_Reference_ID=35,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=true,
IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="bf991d4d-d349-1a7d-004b-761f2ea9cdaa",Synchronized="2017-08-05 16:55:13.0")
/** Column name M_AttributeSetInstance_ID */
public static final String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";
/** Set Phys.Inventory Line.
@param M_InventoryLine_ID Unique line in an Inventory document */
public void setM_InventoryLine_ID (int M_InventoryLine_ID)
{
if (M_InventoryLine_ID < 1) throw new IllegalArgumentException ("M_InventoryLine_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_InventoryLine_ID, Integer.valueOf(M_InventoryLine_ID));
}
/** Get Phys.Inventory Line.
@return Unique line in an Inventory document */
public int getM_InventoryLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_InventoryLine_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getM_InventoryLine_ID()));
}

@XendraTrl(Identifier="dacc6886-0554-6fff-7ad4-a189d2cb332e")
public static String es_PE_FIELD_Attributes_PhysInventoryLine_Description="Item único en un documento de inventario.";

@XendraTrl(Identifier="dacc6886-0554-6fff-7ad4-a189d2cb332e")
public static String es_PE_FIELD_Attributes_PhysInventoryLine_Help="Indica el Item del documento del inventario físico (si es aplicable) para esta transacción.";

@XendraTrl(Identifier="dacc6886-0554-6fff-7ad4-a189d2cb332e")
public static String es_PE_FIELD_Attributes_PhysInventoryLine_Name="Item de Inventario Físico";

@XendraField(AD_Column_ID="M_InventoryLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="88a44b1a-7fbb-cf24-5a53-466ed4ccc33f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="dacc6886-0554-6fff-7ad4-a189d2cb332e")
public static final String FIELDNAME_Attributes_PhysInventoryLine="dacc6886-0554-6fff-7ad4-a189d2cb332e";

@XendraTrl(Identifier="a5f1cc70-ef90-f347-f5c0-b9f0eed195e8")
public static String es_PE_COLUMN_M_InventoryLine_ID_Name="Línea de Inventario Físico";

@XendraColumn(AD_Element_ID="2c5571d8-3b1f-8721-db52-cae644155140",ColumnName="M_InventoryLine_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a5f1cc70-ef90-f347-f5c0-b9f0eed195e8",
Synchronized="2017-08-05 16:55:13.0")
/** Column name M_InventoryLine_ID */
public static final String COLUMNNAME_M_InventoryLine_ID = "M_InventoryLine_ID";
/** Set Movement Quantity.
@param MovementQty Quantity of a product moved. */
public void setMovementQty (BigDecimal MovementQty)
{
if (MovementQty == null) throw new IllegalArgumentException ("MovementQty is mandatory.");
set_Value (COLUMNNAME_MovementQty, MovementQty);
}
/** Get Movement Quantity.
@return Quantity of a product moved. */
public BigDecimal getMovementQty() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_MovementQty);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="d2766a0c-1fc1-a9c6-b5bd-d36ef52fe4c6")
public static String es_PE_FIELD_Attributes_MovementQuantity_Description="Cantidad de un producto movido";

@XendraTrl(Identifier="d2766a0c-1fc1-a9c6-b5bd-d36ef52fe4c6")
public static String es_PE_FIELD_Attributes_MovementQuantity_Help="La Cantidad del Movimiento indica la cantidad de un producto que ha sido movido";

@XendraTrl(Identifier="d2766a0c-1fc1-a9c6-b5bd-d36ef52fe4c6")
public static String es_PE_FIELD_Attributes_MovementQuantity_Name="Cantidad del Movimiento";

@XendraField(AD_Column_ID="MovementQty",IsCentrallyMaintained=true,
AD_Tab_ID="88a44b1a-7fbb-cf24-5a53-466ed4ccc33f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=true,SeqNo=50,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d2766a0c-1fc1-a9c6-b5bd-d36ef52fe4c6")
public static final String FIELDNAME_Attributes_MovementQuantity="d2766a0c-1fc1-a9c6-b5bd-d36ef52fe4c6";

@XendraTrl(Identifier="311e82a9-4c19-e219-16a1-41d3fe16c376")
public static String es_PE_COLUMN_MovementQty_Name="Cantidad del Movimiento";

@XendraColumn(AD_Element_ID="36c2f62a-1d3b-a3ff-a433-9fc2eec47380",ColumnName="MovementQty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="311e82a9-4c19-e219-16a1-41d3fe16c376",
Synchronized="2017-08-05 16:55:13.0")
/** Column name MovementQty */
public static final String COLUMNNAME_MovementQty = "MovementQty";
}
