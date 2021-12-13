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
/** Generated Model for C_POSFormat
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_POSFormat extends PO
{
/** Standard Constructor
@param ctx context
@param C_POSFormat_ID id
@param trxName transaction
*/
public X_C_POSFormat (Properties ctx, int C_POSFormat_ID, String trxName)
{
super (ctx, C_POSFormat_ID, trxName);
/** if (C_POSFormat_ID == 0)
{
setC_POSFormat_ID (0);
setC_POS_ID (0);
setC_PrinterDocumentFormat_ID (0);
setC_PrinterFormatType (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_POSFormat (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000314 */
public static int Table_ID=MTable.getTable_ID("C_POSFormat");

@XendraTrl(Identifier="c3e84d34-99fb-4fb7-bc0c-705959afe1d0")
public static String es_PE_TABLE_C_POSFormat_Name="POS Formats";

@XendraTable(Name="POS Formats",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",TableName="C_POSFormat",
AccessLevel="3",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,IsSecurityEnabled=false,
IsDeleteable=true,IsHighVolume=false,IsChangeLog=false,IsView=false,PO_Window_ID="",
ID="org.xendra.commercial",Identifier="c3e84d34-99fb-4fb7-bc0c-705959afe1d0",
Synchronized="2020-03-03 21:37:28.0")
/** TableName=C_POSFormat */
public static final String Table_Name="C_POSFormat";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_POSFormat");

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
    Table_ID = MTable.getTable_ID("C_POSFormat");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_POSFormat[").append(get_ID()).append("]");
return sb.toString();
}
/** Set POS Formats.
@param C_POSFormat_ID POS Formats */
public void setC_POSFormat_ID (int C_POSFormat_ID)
{
if (C_POSFormat_ID < 1) throw new IllegalArgumentException ("C_POSFormat_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_POSFormat_ID, Integer.valueOf(C_POSFormat_ID));
}
/** Get POS Formats.
@return POS Formats */
public int getC_POSFormat_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_POSFormat_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name C_POSFormat_ID */
public static final String COLUMNNAME_C_POSFormat_ID = "C_POSFormat_ID";
/** Set POS Terminal.
@param C_POS_ID Point of Sales Terminal */
public void setC_POS_ID (int C_POS_ID)
{
if (C_POS_ID < 1) throw new IllegalArgumentException ("C_POS_ID is mandatory.");
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

@XendraTrl(Identifier="7238b54b-911f-42d7-bebd-6fba41436499")
public static String es_PE_COLUMN_C_POS_ID_Name="POS Terminal";

@XendraColumn(AD_Element_ID="c2adeeab-8099-b658-0016-5d97a32be4a2",ColumnName="C_POS_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7238b54b-911f-42d7-bebd-6fba41436499",
Synchronized="2019-08-30 22:22:04.0")
/** Column name C_POS_ID */
public static final String COLUMNNAME_C_POS_ID = "C_POS_ID";
/** Set C_PrinterDocumentFormat_ID.
@param C_PrinterDocumentFormat_ID C_PrinterDocumentFormat_ID */
public void setC_PrinterDocumentFormat_ID (int C_PrinterDocumentFormat_ID)
{
if (C_PrinterDocumentFormat_ID < 1) throw new IllegalArgumentException ("C_PrinterDocumentFormat_ID is mandatory.");
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

@XendraTrl(Identifier="49a1aa11-14d8-4d1d-a348-a44685638eaa")
public static String es_PE_COLUMN_C_PrinterDocumentFormat_ID_Name="C_PrinterDocumentFormat_ID";

@XendraColumn(AD_Element_ID="443bb6f7-8eb3-4556-98cf-f2ccd4d59324",
ColumnName="C_PrinterDocumentFormat_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="49a1aa11-14d8-4d1d-a348-a44685638eaa",Synchronized="2019-08-30 22:22:04.0")
/** Column name C_PrinterDocumentFormat_ID */
public static final String COLUMNNAME_C_PrinterDocumentFormat_ID = "C_PrinterDocumentFormat_ID";
/** Set C_PrinterFormatType.
@param C_PrinterFormatType C_PrinterFormatType */
public void setC_PrinterFormatType (String C_PrinterFormatType)
{
if (C_PrinterFormatType.length() > 3)
{
log.warning("Length > 3 - truncated");
C_PrinterFormatType = C_PrinterFormatType.substring(0,2);
}
set_Value (COLUMNNAME_C_PrinterFormatType, C_PrinterFormatType);
}
/** Get C_PrinterFormatType.
@return C_PrinterFormatType */
public String getC_PrinterFormatType() 
{
return (String)get_Value(COLUMNNAME_C_PrinterFormatType);
}

@XendraTrl(Identifier="f32d2356-73d6-49b7-9af1-b92a2a08ae29")
public static String es_PE_COLUMN_C_PrinterFormatType_Name="c_printerformattype";

@XendraColumn(AD_Element_ID="fd1cf9ac-afd8-455d-bcab-8cb939b4389c",
ColumnName="C_PrinterFormatType",AD_Reference_ID=17,
AD_Reference_Value_ID="14324025-4700-4e81-9434-3ae76ce146e4",AD_Val_Rule_ID="",FieldLength=3,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="f32d2356-73d6-49b7-9af1-b92a2a08ae29",
Synchronized="2019-08-30 22:22:04.0")
/** Column name C_PrinterFormatType */
public static final String COLUMNNAME_C_PrinterFormatType = "C_PrinterFormatType";
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
@XendraTrl(Identifier="eac23aa0-448a-40a7-b323-e1fe924869cc")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="eac23aa0-448a-40a7-b323-e1fe924869cc",
Synchronized="2019-08-30 22:22:05.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
}
