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
/** Generated Model for C_PrinterFormat
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_PrinterFormat extends PO
{
/** Standard Constructor
@param ctx context
@param C_PrinterFormat_ID id
@param trxName transaction
*/
public X_C_PrinterFormat (Properties ctx, int C_PrinterFormat_ID, String trxName)
{
super (ctx, C_PrinterFormat_ID, trxName);
/** if (C_PrinterFormat_ID == 0)
{
setC_PrinterFormat_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_PrinterFormat (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000318 */
public static int Table_ID=MTable.getTable_ID("C_PrinterFormat");

@XendraTrl(Identifier="79c87692-f8cb-4a87-a665-14de72ecdeec")
public static String es_PE_TABLE_C_PrinterFormat_Name="Printer Format";

@XendraTable(Name="Printer Format",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="C_PrinterFormat",AccessLevel="3",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=false,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.commercial",Identifier="79c87692-f8cb-4a87-a665-14de72ecdeec",
Synchronized="2020-03-03 21:37:30.0")
/** TableName=C_PrinterFormat */
public static final String Table_Name="C_PrinterFormat";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_PrinterFormat");

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
    Table_ID = MTable.getTable_ID("C_PrinterFormat");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_PrinterFormat[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Table.
@param AD_Table_ID Database Table information */
public void setAD_Table_ID (int AD_Table_ID)
{
if (AD_Table_ID <= 0) set_Value (COLUMNNAME_AD_Table_ID, null);
 else 
set_Value (COLUMNNAME_AD_Table_ID, Integer.valueOf(AD_Table_ID));
}
/** Get Table.
@return Database Table information */
public int getAD_Table_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Table_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="8a17a7e5-3875-4473-b053-9563a72adc02")
public static String es_PE_COLUMN_AD_Table_ID_Name="Table";

@XendraColumn(AD_Element_ID="270eeb02-723b-0ecc-7f56-3c67fa71a7f1",ColumnName="AD_Table_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8a17a7e5-3875-4473-b053-9563a72adc02",
Synchronized="2020-01-05 20:28:23.0")
/** Column name AD_Table_ID */
public static final String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
/** Set Machine Printers.
@param A_MachinePrinter_ID Machine Printers */
public void setA_MachinePrinter_ID (int A_MachinePrinter_ID)
{
if (A_MachinePrinter_ID <= 0) set_Value (COLUMNNAME_A_MachinePrinter_ID, null);
 else 
set_Value (COLUMNNAME_A_MachinePrinter_ID, Integer.valueOf(A_MachinePrinter_ID));
}
/** Get Machine Printers.
@return Machine Printers */
public int getA_MachinePrinter_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_A_MachinePrinter_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="3a744cf1-3aa9-46ab-9975-f9ce6be6e020")
public static String es_PE_COLUMN_A_MachinePrinter_ID_Name="Machine Printers";

@XendraColumn(AD_Element_ID="fa4c3bfb-dfa3-42a8-a824-52c7681d5045",
ColumnName="A_MachinePrinter_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="3a744cf1-3aa9-46ab-9975-f9ce6be6e020",Synchronized="2020-01-05 20:28:24.0")
/** Column name A_MachinePrinter_ID */
public static final String COLUMNNAME_A_MachinePrinter_ID = "A_MachinePrinter_ID";
/** Set C_PrinterDocumentFormat_ID.
@param C_PrinterDocumentFormat_ID C_PrinterDocumentFormat_ID */
public void setC_PrinterDocumentFormat_ID (int C_PrinterDocumentFormat_ID)
{
if (C_PrinterDocumentFormat_ID <= 0) set_Value (COLUMNNAME_C_PrinterDocumentFormat_ID, null);
 else 
set_Value (COLUMNNAME_C_PrinterDocumentFormat_ID, Integer.valueOf(C_PrinterDocumentFormat_ID));
}
/** Get C_PrinterDocumentFormat_ID.
@return C_PrinterDocumentFormat_ID */
public int getC_PrinterDocumentFormat_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_PrinterDocumentFormat_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="6306e9ce-9b95-4854-bd0a-dc7c08c05243")
public static String es_PE_COLUMN_C_PrinterDocumentFormat_ID_Name="C_PrinterDocumentFormat_ID";

@XendraColumn(AD_Element_ID="443bb6f7-8eb3-4556-98cf-f2ccd4d59324",
ColumnName="C_PrinterDocumentFormat_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="6306e9ce-9b95-4854-bd0a-dc7c08c05243",Synchronized="2020-01-05 20:28:24.0")
/** Column name C_PrinterDocumentFormat_ID */
public static final String COLUMNNAME_C_PrinterDocumentFormat_ID = "C_PrinterDocumentFormat_ID";
/** Set Printer Format.
@param C_PrinterFormat_ID Printer Format */
public void setC_PrinterFormat_ID (int C_PrinterFormat_ID)
{
if (C_PrinterFormat_ID < 1) throw new IllegalArgumentException ("C_PrinterFormat_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_PrinterFormat_ID, Integer.valueOf(C_PrinterFormat_ID));
}
/** Get Printer Format.
@return Printer Format */
public int getC_PrinterFormat_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_PrinterFormat_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name C_PrinterFormat_ID */
public static final String COLUMNNAME_C_PrinterFormat_ID = "C_PrinterFormat_ID";
/** Set Record ID.
@param Record_ID Direct internal record ID */
public void setRecord_ID (int Record_ID)
{
if (Record_ID <= 0) set_Value (COLUMNNAME_Record_ID, null);
 else 
set_Value (COLUMNNAME_Record_ID, Integer.valueOf(Record_ID));
}
/** Get Record ID.
@return Direct internal record ID */
public int getRecord_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Record_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="36e877fe-4cf2-4c66-8bd4-30ae2aa7a572")
public static String es_PE_COLUMN_Record_ID_Name="Record ID";

@XendraColumn(AD_Element_ID="86e36e4b-d1dc-2deb-449d-c1f6769e1603",ColumnName="Record_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="36e877fe-4cf2-4c66-8bd4-30ae2aa7a572",
Synchronized="2020-01-05 20:28:24.0")
/** Column name Record_ID */
public static final String COLUMNNAME_Record_ID = "Record_ID";
/** Set Source.
@param Source Source */
public void setSource (String Source)
{
set_Value (COLUMNNAME_Source, Source);
}
/** Get Source.
@return Source */
public String getSource() 
{
String value = (String)get_Value(COLUMNNAME_Source);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="059f51a7-786e-48e8-a7ac-8c6ea37b205d")
public static String es_PE_COLUMN_Source_Name="Source";

@XendraColumn(AD_Element_ID="0196dfe8-dc27-4c5c-9891-1a6c15182944",ColumnName="Source",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2147483647,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="059f51a7-786e-48e8-a7ac-8c6ea37b205d",
Synchronized="2020-01-05 20:28:24.0")
/** Column name Source */
public static final String COLUMNNAME_Source = "Source";
/** Set Search Key.
@param Value Search key for the record in the format required - must be unique */
public void setValue (String Value)
{
if (Value != null && Value.length() > 10)
{
log.warning("Length > 10 - truncated");
Value = Value.substring(0,9);
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
@XendraTrl(Identifier="616db173-2c34-428d-8e21-35ce7e6f1384")
public static String es_PE_COLUMN_Value_Name="Search Key";

@XendraColumn(AD_Element_ID="e75e100c-9b41-a643-2cb3-46eeced683d8",ColumnName="Value",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="616db173-2c34-428d-8e21-35ce7e6f1384",
Synchronized="2020-01-05 20:28:24.0")
/** Column name Value */
public static final String COLUMNNAME_Value = "Value";
}
