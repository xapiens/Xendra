/******************************************************************************
 * Product: Xendra ERP & CRM Smart Business Solution                          *
 * Copyright (C)  dravios       All Rights Reserved.                          *
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
/** Generated Model for S_DocSummary
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_S_DocSummary extends PO
{
/** Standard Constructor
@param ctx context
@param S_DocSummary_ID id
@param trxName transaction
*/
public X_S_DocSummary (Properties ctx, int S_DocSummary_ID, String trxName)
{
super (ctx, S_DocSummary_ID, trxName);
/** if (S_DocSummary_ID == 0)
{
setS_DocSummary_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_S_DocSummary (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000427 */
public static int Table_ID=MTable.getTable_ID("S_DocSummary");

@XendraTrl(Identifier="ef8dfaa9-dd28-4e96-a2d9-365b754f9830")
public static String es_PE_TABLE_S_DocSummary_Name="Sunat Sumario Documento";

@XendraTable(Name="Sunat Sumario Documento",AD_Package_ID="2ac04657-d663-47c2-4ec1-927ad71f1e96",
AD_Plugin_ID="",Description="",Help="",TableName="S_DocSummary",AccessLevel="6",AD_Window_ID="",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=false,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="",
Identifier="ef8dfaa9-dd28-4e96-a2d9-365b754f9830",Synchronized="2022-09-14 10:20:22.0")
/** TableName=S_DocSummary */
public static final String Table_Name="S_DocSummary";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"S_DocSummary");

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
    Table_ID = MTable.getTable_ID("S_DocSummary");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_S_DocSummary[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Partner Location.
@param C_BPartner_Location_ID Identifies the (ship to) address for this Business Partner */
public void setC_BPartner_Location_ID (int C_BPartner_Location_ID)
{
if (C_BPartner_Location_ID <= 0) set_Value (COLUMNNAME_C_BPartner_Location_ID, null);
 else 
set_Value (COLUMNNAME_C_BPartner_Location_ID, Integer.valueOf(C_BPartner_Location_ID));
}
/** Get Partner Location.
@return Identifies the (ship to) address for this Business Partner */
public int getC_BPartner_Location_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartner_Location_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f9d9facf-679a-4b73-9fda-3376e786cb4f")
public static String es_PE_COLUMN_C_BPartner_Location_ID_Name="Partner Location";

@XendraColumn(AD_Element_ID="0dab7dc6-2832-26dc-2462-cba2d40235f2",
ColumnName="C_BPartner_Location_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="f9d9facf-679a-4b73-9fda-3376e786cb4f",Synchronized="2022-05-18 10:57:21.0")
/** Column name C_BPartner_Location_ID */
public static final String COLUMNNAME_C_BPartner_Location_ID = "C_BPartner_Location_ID";
/** Set c_bpartnermodified_location_id.
@param c_bpartnermodified_location_id c_bpartnermodified_location_id */
public void setc_bpartnermodified_location_id (int c_bpartnermodified_location_id)
{
set_Value (COLUMNNAME_c_bpartnermodified_location_id, Integer.valueOf(c_bpartnermodified_location_id));
}
/** Get c_bpartnermodified_location_id.
@return c_bpartnermodified_location_id */
public int getc_bpartnermodified_location_id() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_c_bpartnermodified_location_id);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="65b94633-7c62-43d8-81d1-68192c0c74ab")
public static String es_PE_COLUMN_c_bpartnermodified_location_id_Name="c_bpartnermodified_location_id";

@XendraColumn(AD_Element_ID="14ddea75-26bd-498c-8bb7-6cbde965230d",
ColumnName="c_bpartnermodified_location_id",AD_Reference_ID=19,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="65b94633-7c62-43d8-81d1-68192c0c74ab",Synchronized="2022-05-18 10:57:21.0")
/** Column name c_bpartnermodified_location_id */
public static final String COLUMNNAME_c_bpartnermodified_location_id = "c_bpartnermodified_location_id";
/** Set Currency.
@param C_Currency_ID The Currency for this record */
public void setC_Currency_ID (int C_Currency_ID)
{
if (C_Currency_ID <= 0) set_Value (COLUMNNAME_C_Currency_ID, null);
 else 
set_Value (COLUMNNAME_C_Currency_ID, Integer.valueOf(C_Currency_ID));
}
/** Get Currency.
@return The Currency for this record */
public int getC_Currency_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Currency_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="73c2dd60-0eed-48ca-8f30-6b58949a719d")
public static String es_PE_COLUMN_C_Currency_ID_Name="Currency";

@XendraColumn(AD_Element_ID="8daec488-bca2-50fe-f9de-abf0cba2a34a",ColumnName="C_Currency_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="73c2dd60-0eed-48ca-8f30-6b58949a719d",
Synchronized="2022-05-18 10:57:21.0")
/** Column name C_Currency_ID */
public static final String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
/** Set c_documentax_id.
@param c_documentax_id c_documentax_id */
public void setc_documentax_id (int c_documentax_id)
{
set_Value (COLUMNNAME_c_documentax_id, Integer.valueOf(c_documentax_id));
}
/** Get c_documentax_id.
@return c_documentax_id */
public int getc_documentax_id() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_c_documentax_id);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="7c8df432-fa5b-4501-8710-a6e81b70eeb4")
public static String es_PE_COLUMN_c_documentax_id_Name="c_documentax_id";

@XendraColumn(AD_Element_ID="2aca89ee-7910-423e-b5b6-da9532e17c0a",ColumnName="c_documentax_id",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7c8df432-fa5b-4501-8710-a6e81b70eeb4",
Synchronized="2022-05-18 10:57:21.0")
/** Column name c_documentax_id */
public static final String COLUMNNAME_c_documentax_id = "c_documentax_id";
/** Set DateDoc.
@param DateDoc Date of the Document */
public void setDateDoc (Timestamp DateDoc)
{
set_Value (COLUMNNAME_DateDoc, DateDoc);
}
/** Get DateDoc.
@return Date of the Document */
public Timestamp getDateDoc() 
{
return (Timestamp)get_Value(COLUMNNAME_DateDoc);
}

@XendraTrl(Identifier="e471d777-d8bb-4731-92bc-254dbea126cb")
public static String es_PE_COLUMN_DateDoc_Name="DateDoc";

@XendraColumn(AD_Element_ID="68f87a38-0b7e-cc52-6990-3b5d2d120d9d",ColumnName="DateDoc",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e471d777-d8bb-4731-92bc-254dbea126cb",
Synchronized="2022-05-18 10:57:22.0")
/** Column name DateDoc */
public static final String COLUMNNAME_DateDoc = "DateDoc";
/** Set End No.
@param EndNo End No */
public void setEndNo (int EndNo)
{
set_Value (COLUMNNAME_EndNo, Integer.valueOf(EndNo));
}
/** Get End No.
@return End No */
public int getEndNo() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_EndNo);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d77137f1-0d29-4178-acb4-c3fa4857edee")
public static String es_PE_COLUMN_EndNo_Name="End No";

@XendraColumn(AD_Element_ID="0a96a9b8-2c4b-3c6f-fe50-9a77904698b1",ColumnName="EndNo",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d77137f1-0d29-4178-acb4-c3fa4857edee",
Synchronized="2022-05-18 10:57:22.0")
/** Column name EndNo */
public static final String COLUMNNAME_EndNo = "EndNo";
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
@XendraTrl(Identifier="9ddd1e1a-3280-45aa-8fe1-2fe0a03abb1f")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9ddd1e1a-3280-45aa-8fe1-2fe0a03abb1f",
Synchronized="2022-05-18 10:57:22.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Sunat Sumario Documento.
@param S_DocSummary_ID Sunat Sumario Documento */
public void setS_DocSummary_ID (int S_DocSummary_ID)
{
if (S_DocSummary_ID < 1) throw new IllegalArgumentException ("S_DocSummary_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_S_DocSummary_ID, Integer.valueOf(S_DocSummary_ID));
}
/** Get Sunat Sumario Documento.
@return Sunat Sumario Documento */
public int getS_DocSummary_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_S_DocSummary_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name S_DocSummary_ID */
public static final String COLUMNNAME_S_DocSummary_ID = "S_DocSummary_ID";
/** Set Sequence.
@param SeqNo Method of ordering records: lowest number comes first */
public void setSeqNo (int SeqNo)
{
set_Value (COLUMNNAME_SeqNo, Integer.valueOf(SeqNo));
}
/** Get Sequence.
@return Method of ordering records: lowest number comes first */
public int getSeqNo() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_SeqNo);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ce983768-8d9a-4583-9875-ee97dff7c99d")
public static String es_PE_COLUMN_SeqNo_Name="Sequence";

@XendraColumn(AD_Element_ID="38fa26fe-b59d-fce1-c129-420b57da738b",ColumnName="SeqNo",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ce983768-8d9a-4583-9875-ee97dff7c99d",
Synchronized="2022-05-18 10:57:22.0")
/** Column name SeqNo */
public static final String COLUMNNAME_SeqNo = "SeqNo";
/** Set Document Serial.
@param Serial Serial Number for the Document */
public void setSerial (String Serial)
{
if (Serial != null && Serial.length() > 10)
{
log.warning("Length > 10 - truncated");
Serial = Serial.substring(0,9);
}
set_Value (COLUMNNAME_Serial, Serial);
}
/** Get Document Serial.
@return Serial Number for the Document */
public String getSerial() 
{
String value = (String)get_Value(COLUMNNAME_Serial);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="de84390f-9c9f-4008-8cb5-924fb42ae1f8")
public static String es_PE_COLUMN_Serial_Name="Document Serial";

@XendraColumn(AD_Element_ID="56277733-3963-25db-320e-99e754ca1e9c",ColumnName="Serial",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="de84390f-9c9f-4008-8cb5-924fb42ae1f8",
Synchronized="2022-05-18 10:57:22.0")
/** Column name Serial */
public static final String COLUMNNAME_Serial = "Serial";
/** Set serialmodified.
@param serialmodified serialmodified */
public void setserialmodified (String serialmodified)
{
if (serialmodified != null && serialmodified.length() > 10)
{
log.warning("Length > 10 - truncated");
serialmodified = serialmodified.substring(0,9);
}
set_Value (COLUMNNAME_serialmodified, serialmodified);
}
/** Get serialmodified.
@return serialmodified */
public String getserialmodified() 
{
String value = (String)get_Value(COLUMNNAME_serialmodified);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="9ddaae79-3a38-413d-9ed9-b54560e1df35")
public static String es_PE_COLUMN_serialmodified_Name="serialmodified";

@XendraColumn(AD_Element_ID="f46a2c0f-223a-41b1-9e99-f79b50f6c0e2",ColumnName="serialmodified",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9ddaae79-3a38-413d-9ed9-b54560e1df35",
Synchronized="2022-05-18 10:57:22.0")
/** Column name serialmodified */
public static final String COLUMNNAME_serialmodified = "serialmodified";
/** Set Start No.
@param StartNo Starting number/position */
public void setStartNo (int StartNo)
{
set_Value (COLUMNNAME_StartNo, Integer.valueOf(StartNo));
}
/** Get Start No.
@return Starting number/position */
public int getStartNo() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_StartNo);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="6618845f-aebb-4aaf-b494-9eafaf39e8b9")
public static String es_PE_COLUMN_StartNo_Name="Start No";

@XendraColumn(AD_Element_ID="88d592be-43c4-2902-25a0-56584fd9c3f9",ColumnName="StartNo",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6618845f-aebb-4aaf-b494-9eafaf39e8b9",
Synchronized="2022-05-18 10:57:22.0")
/** Column name StartNo */
public static final String COLUMNNAME_StartNo = "StartNo";
/** Set summaryigv.
@param summaryigv summaryigv */
public void setsummaryigv (BigDecimal summaryigv)
{
set_Value (COLUMNNAME_summaryigv, summaryigv);
}
/** Get summaryigv.
@return summaryigv */
public BigDecimal getsummaryigv() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_summaryigv);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="8944e4f5-cb8d-4e6c-ac19-70b0d56d4941")
public static String es_PE_COLUMN_summaryigv_Name="summaryigv";

@XendraColumn(AD_Element_ID="d6f99572-c0b3-43a8-9fa1-fe57b5b733fc",ColumnName="summaryigv",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8944e4f5-cb8d-4e6c-ac19-70b0d56d4941",
Synchronized="2022-05-18 10:57:22.0")
/** Column name summaryigv */
public static final String COLUMNNAME_summaryigv = "summaryigv";
/** Set summaryisc.
@param summaryisc summaryisc */
public void setsummaryisc (BigDecimal summaryisc)
{
set_Value (COLUMNNAME_summaryisc, summaryisc);
}
/** Get summaryisc.
@return summaryisc */
public BigDecimal getsummaryisc() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_summaryisc);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="cb1db2e1-5d79-4196-9b6d-2fd1dfd3b90a")
public static String es_PE_COLUMN_summaryisc_Name="summaryisc";

@XendraColumn(AD_Element_ID="4a085487-09e3-472d-bd4b-707bf99d9fbf",ColumnName="summaryisc",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cb1db2e1-5d79-4196-9b6d-2fd1dfd3b90a",
Synchronized="2022-05-18 10:57:22.0")
/** Column name summaryisc */
public static final String COLUMNNAME_summaryisc = "summaryisc";
/** Set summaryothers.
@param summaryothers summaryothers */
public void setsummaryothers (BigDecimal summaryothers)
{
set_Value (COLUMNNAME_summaryothers, summaryothers);
}
/** Get summaryothers.
@return summaryothers */
public BigDecimal getsummaryothers() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_summaryothers);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="71a7e67f-6930-438a-9a63-08e8ca12a173")
public static String es_PE_COLUMN_summaryothers_Name="summaryothers";

@XendraColumn(AD_Element_ID="3616b9e3-7805-4450-8c44-4ff53ce7774c",ColumnName="summaryothers",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="71a7e67f-6930-438a-9a63-08e8ca12a173",
Synchronized="2022-05-18 10:57:22.0")
/** Column name summaryothers */
public static final String COLUMNNAME_summaryothers = "summaryothers";
/** Set summary_serial.
@param summary_serial summary_serial */
public void setsummary_serial (String summary_serial)
{
if (summary_serial != null && summary_serial.length() > 10)
{
log.warning("Length > 10 - truncated");
summary_serial = summary_serial.substring(0,9);
}
set_Value (COLUMNNAME_summary_serial, summary_serial);
}
/** Get summary_serial.
@return summary_serial */
public String getsummary_serial() 
{
String value = (String)get_Value(COLUMNNAME_summary_serial);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="0cf959f3-34b9-463f-b452-220b80de85c3")
public static String es_PE_COLUMN_summary_serial_Name="summary_serial";

@XendraColumn(AD_Element_ID="1f30e567-e506-4529-af58-fc46fc6a7594",ColumnName="summary_serial",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0cf959f3-34b9-463f-b452-220b80de85c3",
Synchronized="2022-05-18 10:57:22.0")
/** Column name summary_serial */
public static final String COLUMNNAME_summary_serial = "summary_serial";
/** Set summarystatus.
@param summarystatus summarystatus */
public void setsummarystatus (String summarystatus)
{
if (summarystatus != null && summarystatus.length() > 2)
{
log.warning("Length > 2 - truncated");
summarystatus = summarystatus.substring(0,1);
}
set_Value (COLUMNNAME_summarystatus, summarystatus);
}
/** Get summarystatus.
@return summarystatus */
public String getsummarystatus() 
{
String value = (String)get_Value(COLUMNNAME_summarystatus);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="5f4a7e32-89f9-4e89-b5e4-ace2016d7811")
public static String es_PE_COLUMN_summarystatus_Name="summarystatus";

@XendraColumn(AD_Element_ID="c2c78add-1f6d-43d0-9ea2-6e2aab251797",ColumnName="summarystatus",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5f4a7e32-89f9-4e89-b5e4-ace2016d7811",
Synchronized="2022-05-18 10:57:22.0")
/** Column name summarystatus */
public static final String COLUMNNAME_summarystatus = "summarystatus";
/** Set summarytotal.
@param summarytotal summarytotal */
public void setsummarytotal (BigDecimal summarytotal)
{
set_Value (COLUMNNAME_summarytotal, summarytotal);
}
/** Get summarytotal.
@return summarytotal */
public BigDecimal getsummarytotal() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_summarytotal);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="87a4413e-811f-4f53-b10d-eed7e31fcc1a")
public static String es_PE_COLUMN_summarytotal_Name="summarytotal";

@XendraColumn(AD_Element_ID="bb3f70ff-103b-4692-83ed-a86bbc7cff49",ColumnName="summarytotal",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="87a4413e-811f-4f53-b10d-eed7e31fcc1a",
Synchronized="2022-05-18 10:57:22.0")
/** Column name summarytotal */
public static final String COLUMNNAME_summarytotal = "summarytotal";
/** Set taxamount.
@param taxamount taxamount */
public void settaxamount (BigDecimal taxamount)
{
set_Value (COLUMNNAME_taxamount, taxamount);
}
/** Get taxamount.
@return taxamount */
public BigDecimal gettaxamount() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_taxamount);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="ab88834b-6e0f-440f-8647-589e84da86ad")
public static String es_PE_COLUMN_taxamount_Name="taxamount";

@XendraColumn(AD_Element_ID="03cc7aee-c087-4125-846e-ecb9abdb7229",ColumnName="taxamount",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ab88834b-6e0f-440f-8647-589e84da86ad",
Synchronized="2022-05-18 10:57:22.0")
/** Column name taxamount */
public static final String COLUMNNAME_taxamount = "taxamount";
/** Set taxexonerateamount.
@param taxexonerateamount taxexonerateamount */
public void settaxexonerateamount (BigDecimal taxexonerateamount)
{
set_Value (COLUMNNAME_taxexonerateamount, taxexonerateamount);
}
/** Get taxexonerateamount.
@return taxexonerateamount */
public BigDecimal gettaxexonerateamount() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_taxexonerateamount);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="e74259f3-4def-426f-85ae-db4d13beb610")
public static String es_PE_COLUMN_taxexonerateamount_Name="taxexonerateamount";

@XendraColumn(AD_Element_ID="387e9046-5b76-4840-9897-54f7833a8f5b",ColumnName="taxexonerateamount",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e74259f3-4def-426f-85ae-db4d13beb610",
Synchronized="2022-05-18 10:57:22.0")
/** Column name taxexonerateamount */
public static final String COLUMNNAME_taxexonerateamount = "taxexonerateamount";
/** Set taxfreeofchargeamount.
@param taxfreeofchargeamount taxfreeofchargeamount */
public void settaxfreeofchargeamount (BigDecimal taxfreeofchargeamount)
{
set_Value (COLUMNNAME_taxfreeofchargeamount, taxfreeofchargeamount);
}
/** Get taxfreeofchargeamount.
@return taxfreeofchargeamount */
public BigDecimal gettaxfreeofchargeamount() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_taxfreeofchargeamount);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="d7a57359-67e0-457a-b4cb-d43a3f14cac9")
public static String es_PE_COLUMN_taxfreeofchargeamount_Name="taxfreeofchargeamount";

@XendraColumn(AD_Element_ID="ae6fd377-528f-410a-af88-8d58a626f7b1",
ColumnName="taxfreeofchargeamount",AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=14,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="d7a57359-67e0-457a-b4cb-d43a3f14cac9",Synchronized="2022-05-18 10:57:22.0")
/** Column name taxfreeofchargeamount */
public static final String COLUMNNAME_taxfreeofchargeamount = "taxfreeofchargeamount";
/** Set taxothersamount.
@param taxothersamount taxothersamount */
public void settaxothersamount (BigDecimal taxothersamount)
{
set_Value (COLUMNNAME_taxothersamount, taxothersamount);
}
/** Get taxothersamount.
@return taxothersamount */
public BigDecimal gettaxothersamount() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_taxothersamount);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="c6bd5067-108a-478b-935c-996579383726")
public static String es_PE_COLUMN_taxothersamount_Name="taxothersamount";

@XendraColumn(AD_Element_ID="2e2bc57d-d8e1-4344-96e3-f14a05e21d6c",ColumnName="taxothersamount",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c6bd5067-108a-478b-935c-996579383726",
Synchronized="2022-05-18 10:57:22.0")
/** Column name taxothersamount */
public static final String COLUMNNAME_taxothersamount = "taxothersamount";
/** Set taxunaffectedamount.
@param taxunaffectedamount taxunaffectedamount */
public void settaxunaffectedamount (BigDecimal taxunaffectedamount)
{
set_Value (COLUMNNAME_taxunaffectedamount, taxunaffectedamount);
}
/** Get taxunaffectedamount.
@return taxunaffectedamount */
public BigDecimal gettaxunaffectedamount() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_taxunaffectedamount);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="90a2683c-a37e-4e6d-bfd6-0397f9191ed3")
public static String es_PE_COLUMN_taxunaffectedamount_Name="taxunaffectedamount";

@XendraColumn(AD_Element_ID="5df4fc3f-b0f5-455d-840e-8e273a3d4271",
ColumnName="taxunaffectedamount",AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=14,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="90a2683c-a37e-4e6d-bfd6-0397f9191ed3",Synchronized="2022-05-18 10:57:22.0")
/** Column name taxunaffectedamount */
public static final String COLUMNNAME_taxunaffectedamount = "taxunaffectedamount";
}
