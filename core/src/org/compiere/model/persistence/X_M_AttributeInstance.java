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
/** Generated Model for M_AttributeInstance
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_AttributeInstance extends PO
{
/** Standard Constructor
@param ctx context
@param M_AttributeInstance_ID id
@param trxName transaction
*/
public X_M_AttributeInstance (Properties ctx, int M_AttributeInstance_ID, String trxName)
{
super (ctx, M_AttributeInstance_ID, trxName);
/** if (M_AttributeInstance_ID == 0)
{
setM_Attribute_ID (0);
setM_AttributeSetInstance_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_M_AttributeInstance (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=561 */
public static int Table_ID=MTable.getTable_ID("M_AttributeInstance");

@XendraTrl(Identifier="ea9031da-a574-4c5e-d2e5-70c076cd9edf")
public static String es_PE_TABLE_M_AttributeInstance_Name="M_AttributeInstance";

@XendraTable(Name="M_AttributeInstance",Description="",Help="",TableName="M_AttributeInstance",
AccessLevel="3",AD_Window_ID="1b6bcb89-ad62-5249-c6bc-bf851e4e624f",AD_Val_Rule_ID="",IsKey=0,
LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.material",
Identifier="ea9031da-a574-4c5e-d2e5-70c076cd9edf",Synchronized="2017-08-16 11:43:05.0")
/** TableName=M_AttributeInstance */
public static final String Table_Name="M_AttributeInstance";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_AttributeInstance");

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
    Table_ID = MTable.getTable_ID("M_AttributeInstance");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_AttributeInstance[").append(get_ID()).append("]");
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
@XendraTrl(Identifier="645d9cee-bbef-4205-aca4-0eabcb427aa3")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="645d9cee-bbef-4205-aca4-0eabcb427aa3",
Synchronized="2017-08-05 16:54:59.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Attribute.
@param M_Attribute_ID Product Attribute */
public void setM_Attribute_ID (int M_Attribute_ID)
{
if (M_Attribute_ID < 1) throw new IllegalArgumentException ("M_Attribute_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_Attribute_ID, Integer.valueOf(M_Attribute_ID));
}
/** Get Attribute.
@return Product Attribute */
public int getM_Attribute_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Attribute_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="fc8c8595-edbe-41d9-f9ec-5f9b94a1844d")
public static String es_PE_COLUMN_M_Attribute_ID_Name="Atributo";

@XendraColumn(AD_Element_ID="452994bf-a9df-fbe8-06a5-b6ca6baff95b",ColumnName="M_Attribute_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fc8c8595-edbe-41d9-f9ec-5f9b94a1844d",
Synchronized="2017-08-05 16:54:59.0")
/** Column name M_Attribute_ID */
public static final String COLUMNNAME_M_Attribute_ID = "M_Attribute_ID";
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

@XendraTrl(Identifier="442acb55-cecb-357e-7dd3-078697d3033b")
public static String es_PE_COLUMN_M_AttributeSetInstance_ID_Name="Instancia del Conjunto de Atributos";

@XendraColumn(AD_Element_ID="137807f2-3c52-e193-3ceb-f10b819cf955",
ColumnName="M_AttributeSetInstance_ID",AD_Reference_ID=35,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=true,
IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="442acb55-cecb-357e-7dd3-078697d3033b",Synchronized="2017-08-05 16:54:59.0")
/** Column name M_AttributeSetInstance_ID */
public static final String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";
/** Set Attribute Value.
@param M_AttributeValue_ID Product Attribute Value */
public void setM_AttributeValue_ID (int M_AttributeValue_ID)
{
if (M_AttributeValue_ID <= 0) set_Value (COLUMNNAME_M_AttributeValue_ID, null);
 else 
set_Value (COLUMNNAME_M_AttributeValue_ID, Integer.valueOf(M_AttributeValue_ID));
}
/** Get Attribute Value.
@return Product Attribute Value */
public int getM_AttributeValue_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_AttributeValue_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getM_AttributeValue_ID()));
}

@XendraTrl(Identifier="67867fc6-e092-e27d-c13c-7d5457a18dc9")
public static String es_PE_COLUMN_M_AttributeValue_ID_Name="Valor de Atributo";

@XendraColumn(AD_Element_ID="fea6efce-6d43-d7a5-16b3-28424e67494f",
ColumnName="M_AttributeValue_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="67867fc6-e092-e27d-c13c-7d5457a18dc9",Synchronized="2017-08-05 16:54:59.0")
/** Column name M_AttributeValue_ID */
public static final String COLUMNNAME_M_AttributeValue_ID = "M_AttributeValue_ID";
/** Set Search Key.
@param Value Search key for the record in the format required - must be unique */
public void setValue (String Value)
{
if (Value != null && Value.length() > 40)
{
log.warning("Length > 40 - truncated");
Value = Value.substring(0,39);
}
set_Value (COLUMNNAME_Value, Value);
}
/** Get Search Key.
@return Search key for the record in the format required - must be unique */
public String getValue() 
{
String value = (String)get_Value(COLUMNNAME_Value);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="30044fa0-b84f-6d80-6a4e-596ba7bb85c4")
public static String es_PE_COLUMN_Value_Name="Clave de Búsqueda";

@XendraColumn(AD_Element_ID="e75e100c-9b41-a643-2cb3-46eeced683d8",ColumnName="Value",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="30044fa0-b84f-6d80-6a4e-596ba7bb85c4",
Synchronized="2017-08-05 16:54:59.0")
/** Column name Value */
public static final String COLUMNNAME_Value = "Value";
/** Set Value.
@param ValueNumber Numeric Value */
public void setValueNumber (BigDecimal ValueNumber)
{
set_Value (COLUMNNAME_ValueNumber, ValueNumber);
}
/** Get Value.
@return Numeric Value */
public BigDecimal getValueNumber() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_ValueNumber);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="3e3a2315-674b-1c28-03dd-7ada0c6c07a6")
public static String es_PE_COLUMN_ValueNumber_Name="Valor";

@XendraColumn(AD_Element_ID="30e265be-6eea-a5aa-8d7b-e13dffd963b2",ColumnName="ValueNumber",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3e3a2315-674b-1c28-03dd-7ada0c6c07a6",
Synchronized="2017-08-05 16:54:59.0")
/** Column name ValueNumber */
public static final String COLUMNNAME_ValueNumber = "ValueNumber";
}
