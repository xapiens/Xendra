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
/** Generated Model for M_InOutLineMA
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_InOutLineMA extends PO
{
/** Standard Constructor
@param ctx context
@param M_InOutLineMA_ID id
@param trxName transaction
*/
public X_M_InOutLineMA (Properties ctx, int M_InOutLineMA_ID, String trxName)
{
super (ctx, M_InOutLineMA_ID, trxName);
/** if (M_InOutLineMA_ID == 0)
{
setM_AttributeSetInstance_ID (0);
setM_InOutLine_ID (0);
setMovementQty (Env.ZERO);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_M_InOutLineMA (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=762 */
public static int Table_ID=MTable.getTable_ID("M_InOutLineMA");

@XendraTrl(Identifier="8bf369fb-b07d-8c2d-0f5a-7723492b90c5")
public static String es_PE_TAB_Attributes_Description="Producto Instancia  Atributo Material Asignación";

@XendraTrl(Identifier="8bf369fb-b07d-8c2d-0f5a-7723492b90c5")
public static String es_PE_TAB_Attributes_Name="Atributos";
@XendraTab(Name="Attributes",
Description="Product Instance Attribute Material Allocation",Help="",
AD_Window_ID="e6e007b8-22d0-0418-baa2-2de7b38251fb",SeqNo=40,TabLevel=2,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=true,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=false,IsAdvancedTab=true,Parent_Column_ID="",
Identifier="8bf369fb-b07d-8c2d-0f5a-7723492b90c5",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Attributes="8bf369fb-b07d-8c2d-0f5a-7723492b90c5";

@XendraTrl(Identifier="f9ed3211-c6af-c277-bf64-47e2d025a41e")
public static String es_PE_TABLE_M_InOutLineMA_Name="M_InOutLineMA";

@XendraTable(Name="M_InOutLineMA",Description="",Help="",TableName="M_InOutLineMA",AccessLevel="1",
AD_Window_ID="e6e007b8-22d0-0418-baa2-2de7b38251fb",AD_Val_Rule_ID="",IsKey=0,LoadSeq=145,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="6856bd55-6f78-c775-449b-ef4aa2d1e170",ID="org.xendra.material",
Identifier="f9ed3211-c6af-c277-bf64-47e2d025a41e",Synchronized="2017-08-16 11:43:16.0")
/** TableName=M_InOutLineMA */
public static final String Table_Name="M_InOutLineMA";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_InOutLineMA");

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
    Table_ID = MTable.getTable_ID("M_InOutLineMA");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_InOutLineMA[").append(get_ID()).append("]");
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
@XendraTrl(Identifier="3fdeb15e-0607-4ce5-92fa-020abf018346")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3fdeb15e-0607-4ce5-92fa-020abf018346",
Synchronized="2017-08-05 16:55:12.0")
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

@XendraTrl(Identifier="dd2334d8-4916-2d25-07eb-ccd4d190e789")
public static String es_PE_FIELD_Attributes_AttributeSetInstance_Description="Instancia del conjunto de atributos del producto";

@XendraTrl(Identifier="dd2334d8-4916-2d25-07eb-ccd4d190e789")
public static String es_PE_FIELD_Attributes_AttributeSetInstance_Help="Valor actual de Instancia del conjunto de atributos del producto";

@XendraTrl(Identifier="dd2334d8-4916-2d25-07eb-ccd4d190e789")
public static String es_PE_FIELD_Attributes_AttributeSetInstance_Name="Instancia del Conjunto de Atributos";

@XendraField(AD_Column_ID="M_AttributeSetInstance_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8bf369fb-b07d-8c2d-0f5a-7723492b90c5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="dd2334d8-4916-2d25-07eb-ccd4d190e789")
public static final String FIELDNAME_Attributes_AttributeSetInstance="dd2334d8-4916-2d25-07eb-ccd4d190e789";

@XendraTrl(Identifier="9b93ba38-c383-f20a-f3a9-831216b4301f")
public static String es_PE_COLUMN_M_AttributeSetInstance_ID_Name="Instancia del Conjunto de Atributos";

@XendraColumn(AD_Element_ID="137807f2-3c52-e193-3ceb-f10b819cf955",
ColumnName="M_AttributeSetInstance_ID",AD_Reference_ID=35,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=true,
IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="9b93ba38-c383-f20a-f3a9-831216b4301f",Synchronized="2017-08-05 16:55:12.0")
/** Column name M_AttributeSetInstance_ID */
public static final String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";
/** Set Shipment/Receipt Line.
@param M_InOutLine_ID Line on Shipment or Receipt document */
public void setM_InOutLine_ID (int M_InOutLine_ID)
{
if (M_InOutLine_ID < 1) throw new IllegalArgumentException ("M_InOutLine_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_InOutLine_ID, Integer.valueOf(M_InOutLine_ID));
}
/** Get Shipment/Receipt Line.
@return Line on Shipment or Receipt document */
public int getM_InOutLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_InOutLine_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getM_InOutLine_ID()));
}

@XendraTrl(Identifier="7ce67273-3b88-c7d7-1bae-cf553f77fd93")
public static String es_PE_FIELD_Attributes_ShipmentReceiptLine_Description="Item de entrega ó documento de recibo.";

@XendraTrl(Identifier="7ce67273-3b88-c7d7-1bae-cf553f77fd93")
public static String es_PE_FIELD_Attributes_ShipmentReceiptLine_Help="Indica un Item único en un documento de entrega / recibo";

@XendraTrl(Identifier="7ce67273-3b88-c7d7-1bae-cf553f77fd93")
public static String es_PE_FIELD_Attributes_ShipmentReceiptLine_Name="Item Entrega / Recibo";

@XendraField(AD_Column_ID="M_InOutLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8bf369fb-b07d-8c2d-0f5a-7723492b90c5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7ce67273-3b88-c7d7-1bae-cf553f77fd93")
public static final String FIELDNAME_Attributes_ShipmentReceiptLine="7ce67273-3b88-c7d7-1bae-cf553f77fd93";

@XendraTrl(Identifier="5dd03d22-f5ab-c5c1-e157-5b24884bd240")
public static String es_PE_COLUMN_M_InOutLine_ID_Name="Línea Entrega / Recibo";

@XendraColumn(AD_Element_ID="a4d9928e-fbec-fd6c-b061-d3dbbd7de02c",ColumnName="M_InOutLine_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5dd03d22-f5ab-c5c1-e157-5b24884bd240",
Synchronized="2017-08-05 16:55:12.0")
/** Column name M_InOutLine_ID */
public static final String COLUMNNAME_M_InOutLine_ID = "M_InOutLine_ID";
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

@XendraTrl(Identifier="3daf5b36-d8f4-c338-8d31-91f2c1bcc8a5")
public static String es_PE_FIELD_Attributes_MovementQuantity_Description="Cantidad de un producto movido";

@XendraTrl(Identifier="3daf5b36-d8f4-c338-8d31-91f2c1bcc8a5")
public static String es_PE_FIELD_Attributes_MovementQuantity_Help="La Cantidad del Movimiento indica la cantidad de un producto que ha sido movido";

@XendraTrl(Identifier="3daf5b36-d8f4-c338-8d31-91f2c1bcc8a5")
public static String es_PE_FIELD_Attributes_MovementQuantity_Name="Cantidad del Movimiento";

@XendraField(AD_Column_ID="MovementQty",IsCentrallyMaintained=true,
AD_Tab_ID="8bf369fb-b07d-8c2d-0f5a-7723492b90c5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=true,SeqNo=50,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3daf5b36-d8f4-c338-8d31-91f2c1bcc8a5")
public static final String FIELDNAME_Attributes_MovementQuantity="3daf5b36-d8f4-c338-8d31-91f2c1bcc8a5";

@XendraTrl(Identifier="68fd836c-030a-5b38-6e84-95d89a6e95b1")
public static String es_PE_COLUMN_MovementQty_Name="Cantidad del Movimiento";

@XendraColumn(AD_Element_ID="36c2f62a-1d3b-a3ff-a433-9fc2eec47380",ColumnName="MovementQty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="68fd836c-030a-5b38-6e84-95d89a6e95b1",
Synchronized="2017-08-05 16:55:12.0")
/** Column name MovementQty */
public static final String COLUMNNAME_MovementQty = "MovementQty";
}
