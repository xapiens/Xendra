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
/** Generated Model for M_ProductionLineMA
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_ProductionLineMA extends PO
{
/** Standard Constructor
@param ctx context
@param M_ProductionLineMA_ID id
@param trxName transaction
*/
public X_M_ProductionLineMA (Properties ctx, int M_ProductionLineMA_ID, String trxName)
{
super (ctx, M_ProductionLineMA_ID, trxName);
/** if (M_ProductionLineMA_ID == 0)
{
setM_AttributeSetInstance_ID (0);
setMovementQty (Env.ZERO);
setM_ProductionLine_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_M_ProductionLineMA (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=765 */
public static int Table_ID=MTable.getTable_ID("M_ProductionLineMA");

@XendraTrl(Identifier="d57e67e2-4a9a-1249-4ba6-3cc1d577675e")
public static String es_PE_TABLE_M_ProductionLineMA_Name="Production Line MA";

@XendraTable(Name="Production Line MA",Description="",Help="",TableName="M_ProductionLineMA",
AccessLevel="1",AD_Window_ID="735b6408-f744-4421-e308-a3bb880dfd24",AD_Val_Rule_ID="",IsKey=0,
LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.material",
Identifier="d57e67e2-4a9a-1249-4ba6-3cc1d577675e",Synchronized="2017-08-16 11:43:29.0")
/** TableName=M_ProductionLineMA */
public static final String Table_Name="M_ProductionLineMA";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_ProductionLineMA");

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
    Table_ID = MTable.getTable_ID("M_ProductionLineMA");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_ProductionLineMA[").append(get_ID()).append("]");
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
@XendraTrl(Identifier="62c40733-c10a-40c7-8e13-a8124429d76e")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="62c40733-c10a-40c7-8e13-a8124429d76e",
Synchronized="2017-08-05 16:55:27.0")
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

@XendraTrl(Identifier="16522ab8-8d03-6c5d-9518-b92ace502b70")
public static String es_PE_COLUMN_M_AttributeSetInstance_ID_Name="Instancia del Conjunto de Atributos";

@XendraColumn(AD_Element_ID="137807f2-3c52-e193-3ceb-f10b819cf955",
ColumnName="M_AttributeSetInstance_ID",AD_Reference_ID=35,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=true,
IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="16522ab8-8d03-6c5d-9518-b92ace502b70",Synchronized="2017-08-05 16:55:27.0")
/** Column name M_AttributeSetInstance_ID */
public static final String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";
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

@XendraTrl(Identifier="f76a1c8d-37aa-780c-102c-7139d5b21437")
public static String es_PE_COLUMN_MovementQty_Name="Cantidad del Movimiento";

@XendraColumn(AD_Element_ID="36c2f62a-1d3b-a3ff-a433-9fc2eec47380",ColumnName="MovementQty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f76a1c8d-37aa-780c-102c-7139d5b21437",
Synchronized="2017-08-05 16:55:27.0")
/** Column name MovementQty */
public static final String COLUMNNAME_MovementQty = "MovementQty";
/** Set Production Line.
@param M_ProductionLine_ID Document Line representing a production */
public void setM_ProductionLine_ID (int M_ProductionLine_ID)
{
if (M_ProductionLine_ID < 1) throw new IllegalArgumentException ("M_ProductionLine_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_ProductionLine_ID, Integer.valueOf(M_ProductionLine_ID));
}
/** Get Production Line.
@return Document Line representing a production */
public int getM_ProductionLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_ProductionLine_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getM_ProductionLine_ID()));
}

@XendraTrl(Identifier="ea34f9b9-f615-7dac-6656-9b85af8031f2")
public static String es_PE_COLUMN_M_ProductionLine_ID_Name="Línea de Producción";

@XendraColumn(AD_Element_ID="cd41491f-514d-42fd-aaf9-36308e165c0b",
ColumnName="M_ProductionLine_ID",AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="ea34f9b9-f615-7dac-6656-9b85af8031f2",Synchronized="2017-08-05 16:55:27.0")
/** Column name M_ProductionLine_ID */
public static final String COLUMNNAME_M_ProductionLine_ID = "M_ProductionLine_ID";
}
