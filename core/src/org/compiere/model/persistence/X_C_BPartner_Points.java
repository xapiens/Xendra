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
/** Generated Model for C_BPartner_Points
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_BPartner_Points extends PO
{
/** Standard Constructor
@param ctx context
@param C_BPartner_Points_ID id
@param trxName transaction
*/
public X_C_BPartner_Points (Properties ctx, int C_BPartner_Points_ID, String trxName)
{
super (ctx, C_BPartner_Points_ID, trxName);
/** if (C_BPartner_Points_ID == 0)
{
setC_BPartner_ID (0);
setC_BPartner_Points_ID (0);
setC_Order_ID (0);
setPoints (Env.ZERO);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_BPartner_Points (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000120 */
public static int Table_ID=MTable.getTable_ID("C_BPartner_Points");

@XendraTrl(Identifier="17bad2e8-851f-3c97-5ec2-3eb567e298bd")
public static String es_PE_TABLE_C_BPartner_Points_Name="C_BPartner_Point";

@XendraTable(Name="C_BPartner_Points",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="C_BPartner_Points",Help="",
TableName="C_BPartner_Points",AccessLevel="3",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=70,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.commercial",Identifier="17bad2e8-851f-3c97-5ec2-3eb567e298bd",
Synchronized="2020-03-03 21:36:35.0")
/** TableName=C_BPartner_Points */
public static final String Table_Name="C_BPartner_Points";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_BPartner_Points");

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
    Table_ID = MTable.getTable_ID("C_BPartner_Points");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_BPartner_Points[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Business Partner .
@param C_BPartner_ID Identifies a Business Partner */
public void setC_BPartner_ID (int C_BPartner_ID)
{
if (C_BPartner_ID < 1) throw new IllegalArgumentException ("C_BPartner_ID is mandatory.");
set_Value (COLUMNNAME_C_BPartner_ID, Integer.valueOf(C_BPartner_ID));
}
/** Get Business Partner .
@return Identifies a Business Partner */
public int getC_BPartner_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartner_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="257bf3b9-57e1-7dce-d542-d2f5bdb79dd9")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Socio de Negocio";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="257bf3b9-57e1-7dce-d542-d2f5bdb79dd9",
Synchronized="2019-08-30 22:21:13.0")
/** Column name C_BPartner_ID */
public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
/** Set C_BPartner_Points.
@param C_BPartner_Points_ID C_BPartner_Points */
public void setC_BPartner_Points_ID (int C_BPartner_Points_ID)
{
if (C_BPartner_Points_ID < 1) throw new IllegalArgumentException ("C_BPartner_Points_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_BPartner_Points_ID, Integer.valueOf(C_BPartner_Points_ID));
}
/** Get C_BPartner_Points.
@return C_BPartner_Points */
public int getC_BPartner_Points_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartner_Points_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name C_BPartner_Points_ID */
public static final String COLUMNNAME_C_BPartner_Points_ID = "C_BPartner_Points_ID";
/** Set Order.
@param C_Order_ID Order */
public void setC_Order_ID (int C_Order_ID)
{
if (C_Order_ID < 1) throw new IllegalArgumentException ("C_Order_ID is mandatory.");
set_Value (COLUMNNAME_C_Order_ID, Integer.valueOf(C_Order_ID));
}
/** Get Order.
@return Order */
public int getC_Order_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Order_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="865f2d57-b91b-f1cf-1025-c9a3aa774a8d")
public static String es_PE_COLUMN_C_Order_ID_Name="Orden de Venta";

@XendraColumn(AD_Element_ID="cc846c60-90b8-6aad-9d07-b5d0c0328787",ColumnName="C_Order_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="865f2d57-b91b-f1cf-1025-c9a3aa774a8d",
Synchronized="2019-08-30 22:21:13.0")
/** Column name C_Order_ID */
public static final String COLUMNNAME_C_Order_ID = "C_Order_ID";
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
@XendraTrl(Identifier="04cce6ca-0f48-4581-a94f-610cc0a2c37c")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="04cce6ca-0f48-4581-a94f-610cc0a2c37c",
Synchronized="2019-08-30 22:21:13.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Points.
@param Points Points */
public void setPoints (BigDecimal Points)
{
if (Points == null) throw new IllegalArgumentException ("Points is mandatory.");
set_Value (COLUMNNAME_Points, Points);
}
/** Get Points.
@return Points */
public BigDecimal getPoints() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Points);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="70f1a47f-4f27-fbcf-6770-44df651a5964")
public static String es_PE_COLUMN_Points_Name="points";

@XendraColumn(AD_Element_ID="b7851d60-f96e-369f-a20e-99a1cbd76360",ColumnName="Points",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="70f1a47f-4f27-fbcf-6770-44df651a5964",
Synchronized="2019-08-30 22:21:13.0")
/** Column name Points */
public static final String COLUMNNAME_Points = "Points";
}
