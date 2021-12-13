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
/** Generated Model for C_POSDocType
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_POSDocType extends PO
{
/** Standard Constructor
@param ctx context
@param C_POSDocType_ID id
@param trxName transaction
*/
public X_C_POSDocType (Properties ctx, int C_POSDocType_ID, String trxName)
{
super (ctx, C_POSDocType_ID, trxName);
/** if (C_POSDocType_ID == 0)
{
setC_POSDocType_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_POSDocType (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000335 */
public static int Table_ID=MTable.getTable_ID("C_POSDocType");

@XendraTrl(Identifier="ea0dcb22-a50a-4a69-b066-f4294c17dee7")
public static String es_PE_TABLE_C_POSDocType_Name="DocTypes for POS";

@XendraTable(Name="DocTypes for POS",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="C_POSDocType",AccessLevel="6",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=false,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.commercial",Identifier="ea0dcb22-a50a-4a69-b066-f4294c17dee7",
Synchronized="2020-03-03 21:37:28.0")
/** TableName=C_POSDocType */
public static final String Table_Name="C_POSDocType";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_POSDocType");

protected BigDecimal accessLevel = BigDecimal.valueOf(6);
/** AccessLevel
@return 6 - System - Client 
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
    Table_ID = MTable.getTable_ID("C_POSDocType");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_POSDocType[").append(get_ID()).append("]");
return sb.toString();
}
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

@XendraTrl(Identifier="a7fd6e82-506e-4501-828f-bc170bde1150")
public static String es_PE_COLUMN_A_MachinePrinter_ID_Name="Machine Printers";

@XendraColumn(AD_Element_ID="fa4c3bfb-dfa3-42a8-a824-52c7681d5045",
ColumnName="A_MachinePrinter_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="a7fd6e82-506e-4501-828f-bc170bde1150",Synchronized="2019-12-28 19:11:06.0")
/** Column name A_MachinePrinter_ID */
public static final String COLUMNNAME_A_MachinePrinter_ID = "A_MachinePrinter_ID";
/** Set Document Type.
@param C_DocType_ID Document type or rules */
public void setC_DocType_ID (int C_DocType_ID)
{
if (C_DocType_ID <= 0) set_Value (COLUMNNAME_C_DocType_ID, null);
 else 
set_Value (COLUMNNAME_C_DocType_ID, Integer.valueOf(C_DocType_ID));
}
/** Get Document Type.
@return Document type or rules */
public int getC_DocType_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_DocType_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="6787a1b9-da86-43c4-8538-4e4ef63b28de")
public static String es_PE_COLUMN_C_DocType_ID_Name="Document Type";

@XendraColumn(AD_Element_ID="099a4147-1a72-cdd0-81e0-8bdbc8c0b883",ColumnName="C_DocType_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6787a1b9-da86-43c4-8538-4e4ef63b28de",
Synchronized="2019-12-28 19:11:07.0")
/** Column name C_DocType_ID */
public static final String COLUMNNAME_C_DocType_ID = "C_DocType_ID";
/** Set DocTypes for POS.
@param C_POSDocType_ID DocTypes for POS */
public void setC_POSDocType_ID (int C_POSDocType_ID)
{
if (C_POSDocType_ID < 1) throw new IllegalArgumentException ("C_POSDocType_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_POSDocType_ID, Integer.valueOf(C_POSDocType_ID));
}
/** Get DocTypes for POS.
@return DocTypes for POS */
public int getC_POSDocType_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_POSDocType_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name C_POSDocType_ID */
public static final String COLUMNNAME_C_POSDocType_ID = "C_POSDocType_ID";
/** Set POS Terminal.
@param C_POS_ID Point of Sales Terminal */
public void setC_POS_ID (int C_POS_ID)
{
if (C_POS_ID <= 0) set_Value (COLUMNNAME_C_POS_ID, null);
 else 
set_Value (COLUMNNAME_C_POS_ID, Integer.valueOf(C_POS_ID));
}
/** Get POS Terminal.
@return Point of Sales Terminal */
public int getC_POS_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_POS_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="742915a4-3e85-4b07-b802-72ce4761f027")
public static String es_PE_COLUMN_C_POS_ID_Name="POS Terminal";

@XendraColumn(AD_Element_ID="c2adeeab-8099-b658-0016-5d97a32be4a2",ColumnName="C_POS_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="742915a4-3e85-4b07-b802-72ce4761f027",
Synchronized="2019-12-28 19:11:07.0")
/** Column name C_POS_ID */
public static final String COLUMNNAME_C_POS_ID = "C_POS_ID";
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

@XendraTrl(Identifier="f3aa6215-c8a0-4843-9810-a377c27191cb")
public static String es_PE_COLUMN_C_PrinterDocumentFormat_ID_Name="C_PrinterDocumentFormat_ID";

@XendraColumn(AD_Element_ID="443bb6f7-8eb3-4556-98cf-f2ccd4d59324",
ColumnName="C_PrinterDocumentFormat_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="f3aa6215-c8a0-4843-9810-a377c27191cb",Synchronized="2019-12-28 19:11:07.0")
/** Column name C_PrinterDocumentFormat_ID */
public static final String COLUMNNAME_C_PrinterDocumentFormat_ID = "C_PrinterDocumentFormat_ID";
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
@XendraTrl(Identifier="47041c07-94d9-458e-9aa0-2b424120d6c9")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="47041c07-94d9-458e-9aa0-2b424120d6c9",
Synchronized="2019-12-28 19:11:07.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set IsOrder.
@param IsOrder IsOrder */
public void setIsOrder (boolean IsOrder)
{
set_Value (COLUMNNAME_IsOrder, Boolean.valueOf(IsOrder));
}
/** Get IsOrder.
@return IsOrder */
public boolean isOrder() 
{
Object oo = get_Value(COLUMNNAME_IsOrder);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="da492fc7-d3fe-4dab-8024-f3b257aa0167")
public static String es_PE_COLUMN_IsOrder_Name="IsOrder";

@XendraColumn(AD_Element_ID="9eb502d1-052e-45e7-a3d0-79612dc59021",ColumnName="IsOrder",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="da492fc7-d3fe-4dab-8024-f3b257aa0167",
Synchronized="2019-12-28 19:11:07.0")
/** Column name IsOrder */
public static final String COLUMNNAME_IsOrder = "IsOrder";
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
@XendraTrl(Identifier="5a188310-ba8c-47b3-a5e7-516fd978ef97")
public static String es_PE_COLUMN_Source_Name="Source";

@XendraColumn(AD_Element_ID="0196dfe8-dc27-4c5c-9891-1a6c15182944",ColumnName="Source",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2147483647,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="5a188310-ba8c-47b3-a5e7-516fd978ef97",
Synchronized="2019-12-28 19:11:07.0")
/** Column name Source */
public static final String COLUMNNAME_Source = "Source";
}
