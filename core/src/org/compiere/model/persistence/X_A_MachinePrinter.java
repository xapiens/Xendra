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
/** Generated Model for A_MachinePrinter
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_A_MachinePrinter extends PO
{
/** Standard Constructor
@param ctx context
@param A_MachinePrinter_ID id
@param trxName transaction
*/
public X_A_MachinePrinter (Properties ctx, int A_MachinePrinter_ID, String trxName)
{
super (ctx, A_MachinePrinter_ID, trxName);
/** if (A_MachinePrinter_ID == 0)
{
setA_Machine_ID (0);
setA_MachinePrinter_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_A_MachinePrinter (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000316 */
public static int Table_ID=MTable.getTable_ID("A_MachinePrinter");

@XendraTrl(Identifier="6be07074-4a06-4506-89fe-8fc0e38827b2")
public static String es_PE_TABLE_A_MachinePrinter_Name="Machine Printers";

@XendraTable(Name="Machine Printers",Description="",Help="",TableName="A_MachinePrinter",
AccessLevel="3",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,IsSecurityEnabled=false,
IsDeleteable=true,IsHighVolume=false,IsChangeLog=false,IsView=false,PO_Window_ID="",
ID="org.xendra.standard",Identifier="6be07074-4a06-4506-89fe-8fc0e38827b2",
Synchronized="2017-08-16 11:41:14.0")
/** TableName=A_MachinePrinter */
public static final String Table_Name="A_MachinePrinter";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"A_MachinePrinter");

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
    Table_ID = MTable.getTable_ID("A_MachinePrinter");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_A_MachinePrinter[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Machine .
@param A_Machine_ID Machine  */
public void setA_Machine_ID (int A_Machine_ID)
{
if (A_Machine_ID < 1) throw new IllegalArgumentException ("A_Machine_ID is mandatory.");
set_Value (COLUMNNAME_A_Machine_ID, Integer.valueOf(A_Machine_ID));
}
/** Get Machine .
@return Machine  */
public int getA_Machine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_A_Machine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="c67e7824-bf57-4646-9ea4-c8556077899c")
public static String es_PE_COLUMN_A_Machine_ID_Name="Machine ";

@XendraColumn(AD_Element_ID="5ca659c9-c8cc-4dd1-8e7c-ddc2fe399392",ColumnName="A_Machine_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c67e7824-bf57-4646-9ea4-c8556077899c",
Synchronized="2017-08-05 16:53:04.0")
/** Column name A_Machine_ID */
public static final String COLUMNNAME_A_Machine_ID = "A_Machine_ID";
/** Set Machine Printers.
@param A_MachinePrinter_ID Machine Printers */
public void setA_MachinePrinter_ID (int A_MachinePrinter_ID)
{
if (A_MachinePrinter_ID < 1) throw new IllegalArgumentException ("A_MachinePrinter_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_A_MachinePrinter_ID, Integer.valueOf(A_MachinePrinter_ID));
}
/** Get Machine Printers.
@return Machine Printers */
public int getA_MachinePrinter_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_A_MachinePrinter_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name A_MachinePrinter_ID */
public static final String COLUMNNAME_A_MachinePrinter_ID = "A_MachinePrinter_ID";
/** Set Printer Driver.
@param A_PrinterDriver_ID Printer Driver */
public void setA_PrinterDriver_ID (int A_PrinterDriver_ID)
{
if (A_PrinterDriver_ID <= 0) set_Value (COLUMNNAME_A_PrinterDriver_ID, null);
 else 
set_Value (COLUMNNAME_A_PrinterDriver_ID, Integer.valueOf(A_PrinterDriver_ID));
}
/** Get Printer Driver.
@return Printer Driver */
public int getA_PrinterDriver_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_A_PrinterDriver_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="04426660-2626-45a1-9a18-92d43c2ffe77")
public static String es_PE_COLUMN_A_PrinterDriver_ID_Name="Printer Driver";

@XendraColumn(AD_Element_ID="b56a5614-9519-431a-8262-1e3020b62252",ColumnName="A_PrinterDriver_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="04426660-2626-45a1-9a18-92d43c2ffe77",
Synchronized="2017-08-05 16:53:04.0")
/** Column name A_PrinterDriver_ID */
public static final String COLUMNNAME_A_PrinterDriver_ID = "A_PrinterDriver_ID";
/** Set DeviceName.
@param DeviceName DeviceName */
public void setDeviceName (String DeviceName)
{
if (DeviceName != null && DeviceName.length() > 200)
{
log.warning("Length > 200 - truncated");
DeviceName = DeviceName.substring(0,199);
}
set_Value (COLUMNNAME_DeviceName, DeviceName);
}
/** Get DeviceName.
@return DeviceName */
public String getDeviceName() 
{
String value = (String)get_Value(COLUMNNAME_DeviceName);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="74ead767-ab47-4643-ae38-27095842c9ca")
public static String es_PE_COLUMN_DeviceName_Name="devicename";

@XendraColumn(AD_Element_ID="ce28c691-7916-4f66-986e-c6876828341f",ColumnName="DeviceName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=200,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="74ead767-ab47-4643-ae38-27095842c9ca",
Synchronized="2017-08-05 16:53:04.0")
/** Column name DeviceName */
public static final String COLUMNNAME_DeviceName = "DeviceName";
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
@XendraTrl(Identifier="6531e9bb-e9c2-4cc2-bfe0-5a66a155c85c")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6531e9bb-e9c2-4cc2-bfe0-5a66a155c85c",
Synchronized="2017-08-05 16:53:04.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set QueueName.
@param QueueName QueueName */
public void setQueueName (String QueueName)
{
if (QueueName != null && QueueName.length() > 200)
{
log.warning("Length > 200 - truncated");
QueueName = QueueName.substring(0,199);
}
set_Value (COLUMNNAME_QueueName, QueueName);
}
/** Get QueueName.
@return QueueName */
public String getQueueName() 
{
String value = (String)get_Value(COLUMNNAME_QueueName);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="54b0a223-6ad5-470a-bf18-2d3089a77afc")
public static String es_PE_COLUMN_QueueName_Name="QueueName";

@XendraColumn(AD_Element_ID="8a1919b0-ec3e-4e5c-a763-aa074f903244",ColumnName="QueueName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=200,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="54b0a223-6ad5-470a-bf18-2d3089a77afc",
Synchronized="2017-08-05 16:53:04.0")
/** Column name QueueName */
public static final String COLUMNNAME_QueueName = "QueueName";
}
