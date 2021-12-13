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
/** Generated Model for M_MovementLineMA
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_MovementLineMA extends PO
{
/** Standard Constructor
@param ctx context
@param M_MovementLineMA_ID id
@param trxName transaction
*/
public X_M_MovementLineMA (Properties ctx, int M_MovementLineMA_ID, String trxName)
{
super (ctx, M_MovementLineMA_ID, trxName);
/** if (M_MovementLineMA_ID == 0)
{
setM_AttributeSetInstance_ID (0);
setM_MovementLine_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_M_MovementLineMA (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=764 */
public static int Table_ID=MTable.getTable_ID("M_MovementLineMA");

@XendraTrl(Identifier="09e2e3c2-bc6c-e45c-8cd2-af0994e6467c")
public static String es_PE_TAB_Attributes_Description="Producto Instancia  Atributo Material Asignación";

@XendraTrl(Identifier="09e2e3c2-bc6c-e45c-8cd2-af0994e6467c")
public static String es_PE_TAB_Attributes_Name="Atributos";
@XendraTab(Name="Attributes",
Description="Product Instance Attribute Material Allocation",Help="",
AD_Window_ID="d846fe0a-02ec-74b9-60c7-18dce41e7a56",SeqNo=30,TabLevel=2,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=true,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=false,IsAdvancedTab=true,Parent_Column_ID="",
Identifier="09e2e3c2-bc6c-e45c-8cd2-af0994e6467c",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Attributes="09e2e3c2-bc6c-e45c-8cd2-af0994e6467c";

@XendraTrl(Identifier="cac2ca0d-7e9d-79b2-8486-97f80df2544e")
public static String es_PE_TABLE_M_MovementLineMA_Name="M_MovementLineMA";

@XendraTable(Name="M_MovementLineMA",AD_Package_ID="2809ac2d-7d43-20f8-05f0-a478f2e50204",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="M_MovementLineMA",AccessLevel="1",AD_Window_ID="d846fe0a-02ec-74b9-60c7-18dce41e7a56",
AD_Val_Rule_ID="",IsKey=0,LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.material",
Identifier="cac2ca0d-7e9d-79b2-8486-97f80df2544e",Synchronized="2020-03-03 21:38:42.0")
/** TableName=M_MovementLineMA */
public static final String Table_Name="M_MovementLineMA";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_MovementLineMA");

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
    Table_ID = MTable.getTable_ID("M_MovementLineMA");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_MovementLineMA[").append(get_ID()).append("]");
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
@XendraTrl(Identifier="45484887-2598-4406-b171-00086ae6e641")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="45484887-2598-4406-b171-00086ae6e641",
Synchronized="2019-08-30 22:23:19.0")
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

@XendraTrl(Identifier="3e2a2dc2-77b2-3bf5-4340-76443e6665e5")
public static String es_PE_FIELD_Attributes_AttributeSetInstance_Name="Instancia del Conjunto de Atributos";

@XendraTrl(Identifier="3e2a2dc2-77b2-3bf5-4340-76443e6665e5")
public static String es_PE_FIELD_Attributes_AttributeSetInstance_Description="Instancia del conjunto de atributos del producto";

@XendraTrl(Identifier="3e2a2dc2-77b2-3bf5-4340-76443e6665e5")
public static String es_PE_FIELD_Attributes_AttributeSetInstance_Help="Valor actual de Instancia del conjunto de atributos del producto";

@XendraField(AD_Column_ID="M_AttributeSetInstance_ID",IsCentrallyMaintained=true,
AD_Tab_ID="09e2e3c2-bc6c-e45c-8cd2-af0994e6467c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3e2a2dc2-77b2-3bf5-4340-76443e6665e5")
public static final String FIELDNAME_Attributes_AttributeSetInstance="3e2a2dc2-77b2-3bf5-4340-76443e6665e5";

@XendraTrl(Identifier="728617b5-16d4-904a-1013-8ef5d5061179")
public static String es_PE_COLUMN_M_AttributeSetInstance_ID_Name="Instancia del Conjunto de Atributos";

@XendraColumn(AD_Element_ID="137807f2-3c52-e193-3ceb-f10b819cf955",
ColumnName="M_AttributeSetInstance_ID",AD_Reference_ID=35,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=true,
IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="728617b5-16d4-904a-1013-8ef5d5061179",Synchronized="2019-08-30 22:23:19.0")
/** Column name M_AttributeSetInstance_ID */
public static final String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";
/** Set Move Line.
@param M_MovementLine_ID Inventory Move document Line */
public void setM_MovementLine_ID (int M_MovementLine_ID)
{
if (M_MovementLine_ID < 1) throw new IllegalArgumentException ("M_MovementLine_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_MovementLine_ID, Integer.valueOf(M_MovementLine_ID));
}
/** Get Move Line.
@return Inventory Move document Line */
public int getM_MovementLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_MovementLine_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getM_MovementLine_ID()));
}

@XendraTrl(Identifier="ce5813af-406c-19df-570a-1cd65003716a")
public static String es_PE_FIELD_Attributes_MoveLine_Name="Item del Movimiento";

@XendraTrl(Identifier="ce5813af-406c-19df-570a-1cd65003716a")
public static String es_PE_FIELD_Attributes_MoveLine_Description="Item del documento de movimiento de inventario";

@XendraTrl(Identifier="ce5813af-406c-19df-570a-1cd65003716a")
public static String es_PE_FIELD_Attributes_MoveLine_Help="Indica el Item del documento de movimiento de inventario (si aplica) para esta transacción.";

@XendraField(AD_Column_ID="M_MovementLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="09e2e3c2-bc6c-e45c-8cd2-af0994e6467c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ce5813af-406c-19df-570a-1cd65003716a")
public static final String FIELDNAME_Attributes_MoveLine="ce5813af-406c-19df-570a-1cd65003716a";

@XendraTrl(Identifier="e82e4d09-5b2b-d551-9c83-c5f72e21ea53")
public static String es_PE_COLUMN_M_MovementLine_ID_Name="Línea del Movimiento";

@XendraColumn(AD_Element_ID="45800ec7-b982-e856-179e-390dd2305e2e",ColumnName="M_MovementLine_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e82e4d09-5b2b-d551-9c83-c5f72e21ea53",
Synchronized="2019-08-30 22:23:19.0")
/** Column name M_MovementLine_ID */
public static final String COLUMNNAME_M_MovementLine_ID = "M_MovementLine_ID";
/** Set Movement Quantity.
@param MovementQty Quantity of a product moved. */
public void setMovementQty (BigDecimal MovementQty)
{
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

@XendraTrl(Identifier="cc1ccd63-ec28-cdf1-e03e-4c2d17312e7a")
public static String es_PE_FIELD_Attributes_MovementQuantity_Name="Cantidad del Movimiento";

@XendraTrl(Identifier="cc1ccd63-ec28-cdf1-e03e-4c2d17312e7a")
public static String es_PE_FIELD_Attributes_MovementQuantity_Description="Cantidad de un producto movido";

@XendraTrl(Identifier="cc1ccd63-ec28-cdf1-e03e-4c2d17312e7a")
public static String es_PE_FIELD_Attributes_MovementQuantity_Help="La Cantidad del Movimiento indica la cantidad de un producto que ha sido movido";

@XendraField(AD_Column_ID="MovementQty",IsCentrallyMaintained=true,
AD_Tab_ID="09e2e3c2-bc6c-e45c-8cd2-af0994e6467c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=40,IsReadOnly=true,SeqNo=50,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cc1ccd63-ec28-cdf1-e03e-4c2d17312e7a")
public static final String FIELDNAME_Attributes_MovementQuantity="cc1ccd63-ec28-cdf1-e03e-4c2d17312e7a";

@XendraTrl(Identifier="fd3c2051-faff-cbfe-e19c-98091a938286")
public static String es_PE_COLUMN_MovementQty_Name="Cantidad del Movimiento";

@XendraColumn(AD_Element_ID="36c2f62a-1d3b-a3ff-a433-9fc2eec47380",ColumnName="MovementQty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=15,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fd3c2051-faff-cbfe-e19c-98091a938286",
Synchronized="2019-08-30 22:23:19.0")
/** Column name MovementQty */
public static final String COLUMNNAME_MovementQty = "MovementQty";
}
