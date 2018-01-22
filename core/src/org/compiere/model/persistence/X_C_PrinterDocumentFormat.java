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
import org.compiere.model.reference.REF_C_PrinterFormatType;
/** Generated Model for C_PrinterDocumentFormat
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_PrinterDocumentFormat extends PO
{
/** Standard Constructor
@param ctx context
@param C_PrinterDocumentFormat_ID id
@param trxName transaction
*/
public X_C_PrinterDocumentFormat (Properties ctx, int C_PrinterDocumentFormat_ID, String trxName)
{
super (ctx, C_PrinterDocumentFormat_ID, trxName);
/** if (C_PrinterDocumentFormat_ID == 0)
{
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
public X_C_PrinterDocumentFormat (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000300 */
public static int Table_ID=MTable.getTable_ID("C_PrinterDocumentFormat");

@XendraTrl(Identifier="6e7f6563-c8a0-4c48-9a2e-791325e64349")
public static String es_PE_TABLE_C_PrinterDocumentFormat_Name="C_PrinterDocumentFormat";


@XendraTable(Name="C_PrinterDocumentFormat",Description="",Help="",
TableName="C_PrinterDocumentFormat",AccessLevel="3",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=0,IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=false,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="6e7f6563-c8a0-4c48-9a2e-791325e64349",Synchronized="2017-08-16 11:42:17.0")
/** TableName=C_PrinterDocumentFormat */
public static final String Table_Name="C_PrinterDocumentFormat";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_PrinterDocumentFormat");

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
    Table_ID = MTable.getTable_ID("C_PrinterDocumentFormat");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_PrinterDocumentFormat[").append(get_ID()).append("]");
return sb.toString();
}
/** Set C_PrinterDocumentFormat_ID.
@param C_PrinterDocumentFormat_ID C_PrinterDocumentFormat_ID */
public void setC_PrinterDocumentFormat_ID (int C_PrinterDocumentFormat_ID)
{
if (C_PrinterDocumentFormat_ID < 1) throw new IllegalArgumentException ("C_PrinterDocumentFormat_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_PrinterDocumentFormat_ID, Integer.valueOf(C_PrinterDocumentFormat_ID));
}
/** Get C_PrinterDocumentFormat_ID.
@return C_PrinterDocumentFormat_ID */
public int getC_PrinterDocumentFormat_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_PrinterDocumentFormat_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name C_PrinterDocumentFormat_ID */
public static final String COLUMNNAME_C_PrinterDocumentFormat_ID = "C_PrinterDocumentFormat_ID";

/** C_PrinterFormatType AD_Reference=14324025-4700-4e81-9434-3ae76ce146e4 */
public static final int C_PRINTERFORMATTYPE_AD_Reference_ID=1000062;
/** Set C_PrinterFormatType.
@param C_PrinterFormatType C_PrinterFormatType */
public void setC_PrinterFormatType (String C_PrinterFormatType)
{
if (C_PrinterFormatType == null) throw new IllegalArgumentException ("C_PrinterFormatType is mandatory");
if (C_PrinterFormatType.equals(REF_C_PrinterFormatType.Invoice) || C_PrinterFormatType.equals(REF_C_PrinterFormatType.CreditCardList) || C_PrinterFormatType.equals(REF_C_PrinterFormatType.VoidCanceledList) || C_PrinterFormatType.equals(REF_C_PrinterFormatType.Collection) || C_PrinterFormatType.equals(REF_C_PrinterFormatType.CashCount) || C_PrinterFormatType.equals(REF_C_PrinterFormatType.Others) || C_PrinterFormatType.equals(REF_C_PrinterFormatType.POSCreditFormat) || C_PrinterFormatType.equals(REF_C_PrinterFormatType.InOut));
 else throw new IllegalArgumentException ("C_PrinterFormatType Invalid value - " + C_PrinterFormatType + " - Reference_ID=1000062 - INV - CCL - LCL - COL - CCF - OTH - PCF - OUT");
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

@XendraTrl(Identifier="5db7e090-85fe-4d5f-b5b3-7b3bd4c01973")
public static String es_PE_COLUMN_C_PrinterFormatType_Name="C_PrinterFormatType";

@XendraColumn(AD_Element_ID="fd1cf9ac-afd8-455d-bcab-8cb939b4389c",
ColumnName="C_PrinterFormatType",AD_Reference_ID=17,
AD_Reference_Value_ID="14324025-4700-4e81-9434-3ae76ce146e4",AD_Val_Rule_ID="",FieldLength=3,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="5db7e090-85fe-4d5f-b5b3-7b3bd4c01973",
Synchronized="2017-08-05 16:54:13.0")
/** Column name C_PrinterFormatType */
public static final String COLUMNNAME_C_PrinterFormatType = "C_PrinterFormatType";
/** Set Destination.
@param Destination Destination */
public void setDestination (String Destination)
{
if (Destination != null && Destination.length() > 100)
{
log.warning("Length > 100 - truncated");
Destination = Destination.substring(0,99);
}
set_Value (COLUMNNAME_Destination, Destination);
}
/** Get Destination.
@return Destination */
public String getDestination() 
{
String value = (String)get_Value(COLUMNNAME_Destination);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="d46e59aa-b1f0-4410-9537-4e45a31a1682")
public static String es_PE_COLUMN_Destination_Name="Destination";

@XendraColumn(AD_Element_ID="c8959b1b-a3cf-bf54-0386-c96972b0fc06",ColumnName="Destination",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=100,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d46e59aa-b1f0-4410-9537-4e45a31a1682",
Synchronized="2013-12-04 20:56:16.0")
/** Column name Destination */
public static final String COLUMNNAME_Destination = "Destination";
/** Set Format.
@param Format Format */
public void setFormat (String Format)
{
set_Value (COLUMNNAME_Format, Format);
}
/** Get Format.
@return Format */
public String getFormat() 
{
String value = (String)get_Value(COLUMNNAME_Format);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="9820b918-2ed4-4d60-a73b-0e80f9ae5b8d")
public static String es_PE_COLUMN_Format_Name="Format";

@XendraColumn(AD_Element_ID="10f3edc9-79b5-43a4-a83f-0e07f49f52da",ColumnName="Format",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2147483647,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="9820b918-2ed4-4d60-a73b-0e80f9ae5b8d",
Synchronized="2017-08-05 16:54:13.0")
/** Column name Format */
public static final String COLUMNNAME_Format = "Format";
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
@XendraTrl(Identifier="a872a9d6-e76d-4a79-ad82-183fb4dbeb8c")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a872a9d6-e76d-4a79-ad82-183fb4dbeb8c",
Synchronized="2017-08-05 16:54:13.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Lockout.
@param Lockout Lockout */
public void setLockout (boolean Lockout)
{
set_Value (COLUMNNAME_Lockout, Boolean.valueOf(Lockout));
}
/** Get Lockout.
@return Lockout */
public boolean isLockout() 
{
Object oo = get_Value(COLUMNNAME_Lockout);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="c670bbb6-7a0b-4770-9039-17af0c1d8a0c")
public static String es_PE_COLUMN_Lockout_Name="Lockout";

@XendraColumn(AD_Element_ID="63f75f32-a2eb-4522-a988-6c753105407e",ColumnName="Lockout",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c670bbb6-7a0b-4770-9039-17af0c1d8a0c",
Synchronized="2017-08-05 16:54:13.0")
/** Column name Lockout */
public static final String COLUMNNAME_Lockout = "Lockout";
/** Set Name.
@param Name Alphanumeric identifier of the entity */
public void setName (String Name)
{
if (Name != null && Name.length() > 20)
{
log.warning("Length > 20 - truncated");
Name = Name.substring(0,19);
}
set_Value (COLUMNNAME_Name, Name);
}
/** Get Name.
@return Alphanumeric identifier of the entity */
public String getName() 
{
String value = (String)get_Value(COLUMNNAME_Name);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="fedc73c8-86d0-483f-b83a-e6be8f795245")
public static String es_PE_COLUMN_Name_Name="Name";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fedc73c8-86d0-483f-b83a-e6be8f795245",
Synchronized="2017-08-05 16:54:13.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Properties.
@param Properties Properties */
public void setProperties (HashMap Properties)
{
set_Value (COLUMNNAME_Properties, Properties);
}
/** Get Properties.
@return Properties */
public HashMap getProperties() 
{
HashMap propsrc = (HashMap)get_Value(COLUMNNAME_Properties);
if (propsrc == null) return new HashMap();
 HashMap propdst = (HashMap) propsrc.clone();
return propdst;
}

@XendraTrl(Identifier="07264084-e905-4c5d-becb-75d7d8311464")
public static String es_PE_COLUMN_Properties_Name="Properties";

@XendraColumn(AD_Element_ID="acc3987b-292c-475a-86b5-5104970a96f3",ColumnName="Properties",
AD_Reference_ID=46,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="07264084-e905-4c5d-becb-75d7d8311464",
Synchronized="2017-08-05 16:54:13.0")
/** Column name Properties */
public static final String COLUMNNAME_Properties = "Properties";
/** Set Synchronized.
@param Synchronized Synchronized */
public void setSynchronized (Timestamp Synchronized)
{
set_Value (COLUMNNAME_Synchronized, Synchronized);
}
/** Get Synchronized.
@return Synchronized */
public Timestamp getSynchronized() 
{
return (Timestamp)get_Value(COLUMNNAME_Synchronized);
}

@XendraTrl(Identifier="ec6f7fe2-3604-444c-8b70-6305308fe5e4")
public static String es_PE_COLUMN_Synchronized_Name="Synchronized";

@XendraColumn(AD_Element_ID="08f1e976-ceeb-f830-9d75-bf94f13a98ce",ColumnName="Synchronized",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ec6f7fe2-3604-444c-8b70-6305308fe5e4",
Synchronized="2017-08-05 16:54:13.0")
/** Column name Synchronized */
public static final String COLUMNNAME_Synchronized = "Synchronized";
}
