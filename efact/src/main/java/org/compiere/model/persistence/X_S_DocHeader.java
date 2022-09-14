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
/** Generated Model for S_DocHeader
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_S_DocHeader extends PO
{
/** Standard Constructor
@param ctx context
@param S_DocHeader_ID id
@param trxName transaction
*/
public X_S_DocHeader (Properties ctx, int S_DocHeader_ID, String trxName)
{
super (ctx, S_DocHeader_ID, trxName);
/** if (S_DocHeader_ID == 0)
{
setC_BPartner_ID (0);
setC_BPartner_Location_ID (0);
setC_Currency_ID (0);
setC_DocType_ID (0);
setDateInvoiced (new Timestamp(System.currentTimeMillis()));
setDocumentNo (null);
setProcessed (false);	
// N
setS_DocHeader_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_S_DocHeader (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000425 */
public static int Table_ID=MTable.getTable_ID("S_DocHeader");

@XendraTrl(Identifier="6554c7bc-f112-488b-918e-72e05edc3772")
public static String es_PE_TABLE_S_DocHeader_Name="Sunat Cabecera Documento";

@XendraTable(Name="Sunat Cabecera Documento",AD_Package_ID="2ac04657-d663-47c2-4ec1-927ad71f1e96",
AD_Plugin_ID="",Description="",Help="",TableName="S_DocHeader",AccessLevel="6",AD_Window_ID="",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=false,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="",
Identifier="6554c7bc-f112-488b-918e-72e05edc3772",Synchronized="2022-09-14 10:11:56.0")
/** TableName=S_DocHeader */
public static final String Table_Name="S_DocHeader";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"S_DocHeader");

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
    Table_ID = MTable.getTable_ID("S_DocHeader");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_S_DocHeader[").append(get_ID()).append("]");
return sb.toString();
}
/** Set AdditionalInformation.
@param AdditionalInformation AdditionalInformation */
public void setAdditionalInformation (String AdditionalInformation)
{
if (AdditionalInformation != null && AdditionalInformation.length() > 2)
{
log.warning("Length > 2 - truncated");
AdditionalInformation = AdditionalInformation.substring(0,1);
}
set_Value (COLUMNNAME_AdditionalInformation, AdditionalInformation);
}
/** Get AdditionalInformation.
@return AdditionalInformation */
public String getAdditionalInformation() 
{
String value = (String)get_Value(COLUMNNAME_AdditionalInformation);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="8c6187a2-3761-4769-a60e-b11fdbddeb9c")
public static String es_PE_COLUMN_AdditionalInformation_Name="AdditionalInformation";

@XendraColumn(AD_Element_ID="128c9534-58be-4c2f-a700-22b763d0abad",
ColumnName="AdditionalInformation",AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=2,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="8c6187a2-3761-4769-a60e-b11fdbddeb9c",Synchronized="2022-08-27 11:54:07.0")
/** Column name AdditionalInformation */
public static final String COLUMNNAME_AdditionalInformation = "AdditionalInformation";
/** Set BarCode.
@param BarCode BarCode */
public void setBarCode (byte[] BarCode)
{
set_Value (COLUMNNAME_BarCode, BarCode);
}
/** Get BarCode.
@return BarCode */
public byte[] getBarCode() 
{
return (byte[])get_Value(COLUMNNAME_BarCode);
}

@XendraTrl(Identifier="7189b7b9-184b-472c-9005-4f2a5de10b29")
public static String es_PE_COLUMN_BarCode_Name="barcode";

@XendraColumn(AD_Element_ID="da5eafb2-a7ed-471f-9492-4806f7c1689d",ColumnName="BarCode",
AD_Reference_ID=23,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=0,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7189b7b9-184b-472c-9005-4f2a5de10b29",
Synchronized="2022-08-27 11:54:07.0")
/** Column name BarCode */
public static final String COLUMNNAME_BarCode = "BarCode";
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

@XendraTrl(Identifier="6bc8b4ff-f06b-46ec-b0fe-07db71c61547")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Business Partner ";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6bc8b4ff-f06b-46ec-b0fe-07db71c61547",
Synchronized="2022-08-27 11:54:07.0")
/** Column name C_BPartner_ID */
public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
/** Set Partner Location.
@param C_BPartner_Location_ID Identifies the (ship to) address for this Business Partner */
public void setC_BPartner_Location_ID (int C_BPartner_Location_ID)
{
if (C_BPartner_Location_ID < 1) throw new IllegalArgumentException ("C_BPartner_Location_ID is mandatory.");
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

@XendraTrl(Identifier="0ecbe33d-6ad0-403a-925b-35fc604fb5ae")
public static String es_PE_COLUMN_C_BPartner_Location_ID_Name="Partner Location";

@XendraColumn(AD_Element_ID="0dab7dc6-2832-26dc-2462-cba2d40235f2",
ColumnName="C_BPartner_Location_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="0ecbe33d-6ad0-403a-925b-35fc604fb5ae",Synchronized="2022-08-27 11:54:07.0")
/** Column name C_BPartner_Location_ID */
public static final String COLUMNNAME_C_BPartner_Location_ID = "C_BPartner_Location_ID";
/** Set Currency.
@param C_Currency_ID The Currency for this record */
public void setC_Currency_ID (int C_Currency_ID)
{
if (C_Currency_ID < 1) throw new IllegalArgumentException ("C_Currency_ID is mandatory.");
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

@XendraTrl(Identifier="73807569-70ba-4927-888c-899a6abc0470")
public static String es_PE_COLUMN_C_Currency_ID_Name="Currency";

@XendraColumn(AD_Element_ID="8daec488-bca2-50fe-f9de-abf0cba2a34a",ColumnName="C_Currency_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="73807569-70ba-4927-888c-899a6abc0470",
Synchronized="2022-08-27 11:54:07.0")
/** Column name C_Currency_ID */
public static final String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
/** Set Document Type.
@param C_DocType_ID Document type or rules */
public void setC_DocType_ID (int C_DocType_ID)
{
if (C_DocType_ID < 0) throw new IllegalArgumentException ("C_DocType_ID is mandatory.");
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

@XendraTrl(Identifier="abf135d4-f28f-4aa4-bd14-9274823a428b")
public static String es_PE_COLUMN_C_DocType_ID_Name="Document Type";

@XendraColumn(AD_Element_ID="099a4147-1a72-cdd0-81e0-8bdbc8c0b883",ColumnName="C_DocType_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="abf135d4-f28f-4aa4-bd14-9274823a428b",
Synchronized="2022-08-27 11:54:07.0")
/** Column name C_DocType_ID */
public static final String COLUMNNAME_C_DocType_ID = "C_DocType_ID";
/** Set CDR.
@param CDR CDR */
public void setCDR (String CDR)
{
if (CDR != null && CDR.length() > 200)
{
log.warning("Length > 200 - truncated");
CDR = CDR.substring(0,199);
}
set_Value (COLUMNNAME_CDR, CDR);
}
/** Get CDR.
@return CDR */
public String getCDR() 
{
String value = (String)get_Value(COLUMNNAME_CDR);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="6690eab3-f4fc-48ce-a0d4-017c34a200f4")
public static String es_PE_COLUMN_CDR_Name="cdr";

@XendraColumn(AD_Element_ID="737a8ebb-a36d-4198-9c71-5258dbb87a54",ColumnName="CDR",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=200,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6690eab3-f4fc-48ce-a0d4-017c34a200f4",
Synchronized="2022-08-27 11:54:07.0")
/** Column name CDR */
public static final String COLUMNNAME_CDR = "CDR";
/** Set CDR_Nota.
@param CDR_Nota CDR_Nota */
public void setCDR_Nota (String CDR_Nota)
{
if (CDR_Nota != null && CDR_Nota.length() > 200)
{
log.warning("Length > 200 - truncated");
CDR_Nota = CDR_Nota.substring(0,199);
}
set_Value (COLUMNNAME_CDR_Nota, CDR_Nota);
}
/** Get CDR_Nota.
@return CDR_Nota */
public String getCDR_Nota() 
{
String value = (String)get_Value(COLUMNNAME_CDR_Nota);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="b6ba0c90-9c57-4b6b-96da-0b8cfbc48b5b")
public static String es_PE_COLUMN_CDR_Nota_Name="cdr_nota";

@XendraColumn(AD_Element_ID="d1f8fe95-13b4-465b-8e1b-fa34a1c17f61",ColumnName="CDR_Nota",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=200,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b6ba0c90-9c57-4b6b-96da-0b8cfbc48b5b",
Synchronized="2022-08-27 11:54:07.0")
/** Column name CDR_Nota */
public static final String COLUMNNAME_CDR_Nota = "CDR_Nota";
/** Set CDR_Observation.
@param CDR_Observation CDR_Observation */
public void setCDR_Observation (String CDR_Observation)
{
set_Value (COLUMNNAME_CDR_Observation, CDR_Observation);
}
/** Get CDR_Observation.
@return CDR_Observation */
public String getCDR_Observation() 
{
String value = (String)get_Value(COLUMNNAME_CDR_Observation);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="5adc227b-adf0-45ce-aad3-c39394809d45")
public static String es_PE_COLUMN_CDR_Observation_Name="cdr_observation";

@XendraColumn(AD_Element_ID="906c6c20-eb36-4013-82f0-d9829f9af90e",ColumnName="CDR_Observation",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5adc227b-adf0-45ce-aad3-c39394809d45",
Synchronized="2022-08-27 11:54:07.0")
/** Column name CDR_Observation */
public static final String COLUMNNAME_CDR_Observation = "CDR_Observation";
/** Set Invoice.
@param C_Invoice_ID Invoice Identifier */
public void setC_Invoice_ID (int C_Invoice_ID)
{
if (C_Invoice_ID <= 0) set_Value (COLUMNNAME_C_Invoice_ID, null);
 else 
set_Value (COLUMNNAME_C_Invoice_ID, Integer.valueOf(C_Invoice_ID));
}
/** Get Invoice.
@return Invoice Identifier */
public int getC_Invoice_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Invoice_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ff23452f-d743-4266-b529-71cba44e9e1d")
public static String es_PE_COLUMN_C_Invoice_ID_Name="Invoice";

@XendraColumn(AD_Element_ID="e526ea57-1bdf-9871-fd57-0df3c1f9dd42",ColumnName="C_Invoice_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ff23452f-d743-4266-b529-71cba44e9e1d",
Synchronized="2022-08-27 11:54:07.0")
/** Column name C_Invoice_ID */
public static final String COLUMNNAME_C_Invoice_ID = "C_Invoice_ID";
/** Set clie_correo_cpe0.
@param clie_correo_cpe0 clie_correo_cpe0 */
public void setclie_correo_cpe0 (String clie_correo_cpe0)
{
if (clie_correo_cpe0 != null && clie_correo_cpe0.length() > 100)
{
log.warning("Length > 100 - truncated");
clie_correo_cpe0 = clie_correo_cpe0.substring(0,99);
}
set_Value (COLUMNNAME_clie_correo_cpe0, clie_correo_cpe0);
}
/** Get clie_correo_cpe0.
@return clie_correo_cpe0 */
public String getclie_correo_cpe0() 
{
String value = (String)get_Value(COLUMNNAME_clie_correo_cpe0);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="e48ec6be-41e3-4ab6-b39f-b390507afac8")
public static String es_PE_COLUMN_clie_correo_cpe0_Name="clie_correo_cpe0";

@XendraColumn(AD_Element_ID="5dd090bb-64eb-48bd-9a41-f2d2125e7464",ColumnName="clie_correo_cpe0",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=100,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e48ec6be-41e3-4ab6-b39f-b390507afac8",
Synchronized="2022-08-27 11:54:07.0")
/** Column name clie_correo_cpe0 */
public static final String COLUMNNAME_clie_correo_cpe0 = "clie_correo_cpe0";
/** Set clie_correo_cpe1.
@param clie_correo_cpe1 clie_correo_cpe1 */
public void setclie_correo_cpe1 (String clie_correo_cpe1)
{
if (clie_correo_cpe1 != null && clie_correo_cpe1.length() > 100)
{
log.warning("Length > 100 - truncated");
clie_correo_cpe1 = clie_correo_cpe1.substring(0,99);
}
set_Value (COLUMNNAME_clie_correo_cpe1, clie_correo_cpe1);
}
/** Get clie_correo_cpe1.
@return clie_correo_cpe1 */
public String getclie_correo_cpe1() 
{
String value = (String)get_Value(COLUMNNAME_clie_correo_cpe1);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="71b1161a-c336-44f2-b5a2-324a45ffb9d3")
public static String es_PE_COLUMN_clie_correo_cpe1_Name="clie_correo_cpe1";

@XendraColumn(AD_Element_ID="a9e19229-3bd9-4c60-b6c0-167fbfe25c9c",ColumnName="clie_correo_cpe1",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=100,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="71b1161a-c336-44f2-b5a2-324a45ffb9d3",
Synchronized="2022-08-27 11:54:07.0")
/** Column name clie_correo_cpe1 */
public static final String COLUMNNAME_clie_correo_cpe1 = "clie_correo_cpe1";
/** Set clie_correo_cpe2.
@param clie_correo_cpe2 clie_correo_cpe2 */
public void setclie_correo_cpe2 (String clie_correo_cpe2)
{
if (clie_correo_cpe2 != null && clie_correo_cpe2.length() > 100)
{
log.warning("Length > 100 - truncated");
clie_correo_cpe2 = clie_correo_cpe2.substring(0,99);
}
set_Value (COLUMNNAME_clie_correo_cpe2, clie_correo_cpe2);
}
/** Get clie_correo_cpe2.
@return clie_correo_cpe2 */
public String getclie_correo_cpe2() 
{
String value = (String)get_Value(COLUMNNAME_clie_correo_cpe2);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="1d180d90-4e0b-4772-840b-2433b18a4de6")
public static String es_PE_COLUMN_clie_correo_cpe2_Name="clie_correo_cpe2";

@XendraColumn(AD_Element_ID="ef8dcb13-db39-4426-9124-1dfd0f7bfe9f",ColumnName="clie_correo_cpe2",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=100,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1d180d90-4e0b-4772-840b-2433b18a4de6",
Synchronized="2022-08-27 11:54:07.0")
/** Column name clie_correo_cpe2 */
public static final String COLUMNNAME_clie_correo_cpe2 = "clie_correo_cpe2";
/** Set Tax.
@param C_Tax_ID Tax identifier */
public void setC_Tax_ID (int C_Tax_ID)
{
if (C_Tax_ID <= 0) set_Value (COLUMNNAME_C_Tax_ID, null);
 else 
set_Value (COLUMNNAME_C_Tax_ID, Integer.valueOf(C_Tax_ID));
}
/** Get Tax.
@return Tax identifier */
public int getC_Tax_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Tax_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="1ad54199-ccfa-4b51-a895-7f49163a800e")
public static String es_PE_COLUMN_C_Tax_ID_Name="Tax";

@XendraColumn(AD_Element_ID="38ff24fc-b68c-51a9-60f8-ef2a1f060de2",ColumnName="C_Tax_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1ad54199-ccfa-4b51-a895-7f49163a800e",
Synchronized="2022-08-27 11:54:07.0")
/** Column name C_Tax_ID */
public static final String COLUMNNAME_C_Tax_ID = "C_Tax_ID";
/** Set Date Invoiced.
@param DateInvoiced Date printed on Invoice */
public void setDateInvoiced (Timestamp DateInvoiced)
{
if (DateInvoiced == null) throw new IllegalArgumentException ("DateInvoiced is mandatory.");
set_Value (COLUMNNAME_DateInvoiced, DateInvoiced);
}
/** Get Date Invoiced.
@return Date printed on Invoice */
public Timestamp getDateInvoiced() 
{
return (Timestamp)get_Value(COLUMNNAME_DateInvoiced);
}

@XendraTrl(Identifier="c78819b1-45c5-4690-94d5-2e34f912af17")
public static String es_PE_COLUMN_DateInvoiced_Name="Date Invoiced";

@XendraColumn(AD_Element_ID="5e3c1a65-f97d-82ed-a21c-bc730ca3c080",ColumnName="DateInvoiced",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c78819b1-45c5-4690-94d5-2e34f912af17",
Synchronized="2022-08-27 11:54:07.0")
/** Column name DateInvoiced */
public static final String COLUMNNAME_DateInvoiced = "DateInvoiced";
/** Set Discount %.
@param Discount Discount in percent */
public void setDiscount (BigDecimal Discount)
{
set_Value (COLUMNNAME_Discount, Discount);
}
/** Get Discount %.
@return Discount in percent */
public BigDecimal getDiscount() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Discount);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="fbe17d80-2841-47d6-970e-751c2d278049")
public static String es_PE_COLUMN_Discount_Name="Discount %";

@XendraColumn(AD_Element_ID="3d8e2bac-29ff-f758-dd80-f9b4107077e6",ColumnName="Discount",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fbe17d80-2841-47d6-970e-751c2d278049",
Synchronized="2022-08-27 11:54:07.0")
/** Column name Discount */
public static final String COLUMNNAME_Discount = "Discount";
/** Set doc_anticipo_total.
@param doc_anticipo_total doc_anticipo_total */
public void setdoc_anticipo_total (BigDecimal doc_anticipo_total)
{
set_Value (COLUMNNAME_doc_anticipo_total, doc_anticipo_total);
}
/** Get doc_anticipo_total.
@return doc_anticipo_total */
public BigDecimal getdoc_anticipo_total() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_doc_anticipo_total);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="071bec21-fa70-454f-b3d2-c360d8fafedb")
public static String es_PE_COLUMN_doc_anticipo_total_Name="doc_anticipo_total";

@XendraColumn(AD_Element_ID="a2968314-f64d-4ef1-9ba8-51f5be726b2d",ColumnName="doc_anticipo_total",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="071bec21-fa70-454f-b3d2-c360d8fafedb",
Synchronized="2022-08-27 11:54:07.0")
/** Column name doc_anticipo_total */
public static final String COLUMNNAME_doc_anticipo_total = "doc_anticipo_total";
/** Set doc_descuento.
@param doc_descuento doc_descuento */
public void setdoc_descuento (BigDecimal doc_descuento)
{
set_Value (COLUMNNAME_doc_descuento, doc_descuento);
}
/** Get doc_descuento.
@return doc_descuento */
public BigDecimal getdoc_descuento() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_doc_descuento);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="80e8def5-c126-4cda-8211-59557b713324")
public static String es_PE_COLUMN_doc_descuento_Name="doc_descuento";

@XendraColumn(AD_Element_ID="58e62d60-4d92-464a-931f-dc1ec80d88dc",ColumnName="doc_descuento",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="80e8def5-c126-4cda-8211-59557b713324",
Synchronized="2022-08-27 11:54:07.0")
/** Column name doc_descuento */
public static final String COLUMNNAME_doc_descuento = "doc_descuento";
/** Set doc_exonerada.
@param doc_exonerada doc_exonerada */
public void setdoc_exonerada (BigDecimal doc_exonerada)
{
set_Value (COLUMNNAME_doc_exonerada, doc_exonerada);
}
/** Get doc_exonerada.
@return doc_exonerada */
public BigDecimal getdoc_exonerada() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_doc_exonerada);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="756eb8a1-3193-461b-8a8f-f439a964e46c")
public static String es_PE_COLUMN_doc_exonerada_Name="doc_exonerada";

@XendraColumn(AD_Element_ID="ba1ccc8d-1c52-48e7-ba6f-903bb453e17e",ColumnName="doc_exonerada",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="756eb8a1-3193-461b-8a8f-f439a964e46c",
Synchronized="2022-08-27 11:54:07.0")
/** Column name doc_exonerada */
public static final String COLUMNNAME_doc_exonerada = "doc_exonerada";
/** Set doc_exportada.
@param doc_exportada doc_exportada */
public void setdoc_exportada (BigDecimal doc_exportada)
{
set_Value (COLUMNNAME_doc_exportada, doc_exportada);
}
/** Get doc_exportada.
@return doc_exportada */
public BigDecimal getdoc_exportada() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_doc_exportada);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="003b4e19-4a70-416c-ab0a-7299b14ea638")
public static String es_PE_COLUMN_doc_exportada_Name="doc_exportada";

@XendraColumn(AD_Element_ID="8d1cf2c6-ed41-4848-892e-4f633bb3a7e9",ColumnName="doc_exportada",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="003b4e19-4a70-416c-ab0a-7299b14ea638",
Synchronized="2022-08-27 11:54:07.0")
/** Column name doc_exportada */
public static final String COLUMNNAME_doc_exportada = "doc_exportada";
/** Set doc_gratuita.
@param doc_gratuita doc_gratuita */
public void setdoc_gratuita (BigDecimal doc_gratuita)
{
set_Value (COLUMNNAME_doc_gratuita, doc_gratuita);
}
/** Get doc_gratuita.
@return doc_gratuita */
public BigDecimal getdoc_gratuita() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_doc_gratuita);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="52572fd6-849c-4fa8-892a-b42c4ca09a12")
public static String es_PE_COLUMN_doc_gratuita_Name="doc_gratuita";

@XendraColumn(AD_Element_ID="fb9ac00b-d1fe-4b94-9f18-3bbb2dfb9f79",ColumnName="doc_gratuita",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="52572fd6-849c-4fa8-892a-b42c4ca09a12",
Synchronized="2022-08-27 11:54:07.0")
/** Column name doc_gratuita */
public static final String COLUMNNAME_doc_gratuita = "doc_gratuita";
/** Set doc_gravada.
@param doc_gravada doc_gravada */
public void setdoc_gravada (BigDecimal doc_gravada)
{
set_Value (COLUMNNAME_doc_gravada, doc_gravada);
}
/** Get doc_gravada.
@return doc_gravada */
public BigDecimal getdoc_gravada() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_doc_gravada);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="894636b7-28a0-464c-8b14-22a714c150f1")
public static String es_PE_COLUMN_doc_gravada_Name="doc_gravada";

@XendraColumn(AD_Element_ID="f3e636d6-6c83-4ced-a5a1-fec72b248898",ColumnName="doc_gravada",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="894636b7-28a0-464c-8b14-22a714c150f1",
Synchronized="2022-08-27 11:54:07.0")
/** Column name doc_gravada */
public static final String COLUMNNAME_doc_gravada = "doc_gravada";
/** Set doc_inafecta.
@param doc_inafecta doc_inafecta */
public void setdoc_inafecta (BigDecimal doc_inafecta)
{
set_Value (COLUMNNAME_doc_inafecta, doc_inafecta);
}
/** Get doc_inafecta.
@return doc_inafecta */
public BigDecimal getdoc_inafecta() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_doc_inafecta);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="34a30b6d-2320-4a5e-80cd-185c5a796fbb")
public static String es_PE_COLUMN_doc_inafecta_Name="doc_inafecta";

@XendraColumn(AD_Element_ID="91770585-e49c-4bae-be77-ccf113bc9994",ColumnName="doc_inafecta",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="34a30b6d-2320-4a5e-80cd-185c5a796fbb",
Synchronized="2022-08-27 11:54:07.0")
/** Column name doc_inafecta */
public static final String COLUMNNAME_doc_inafecta = "doc_inafecta";
/** Set doc_otroscargos.
@param doc_otroscargos doc_otroscargos */
public void setdoc_otroscargos (BigDecimal doc_otroscargos)
{
set_Value (COLUMNNAME_doc_otroscargos, doc_otroscargos);
}
/** Get doc_otroscargos.
@return doc_otroscargos */
public BigDecimal getdoc_otroscargos() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_doc_otroscargos);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="745a8af1-62fb-446c-9b45-2be104047fb7")
public static String es_PE_COLUMN_doc_otroscargos_Name="doc_otroscargos";

@XendraColumn(AD_Element_ID="52effacc-af0f-404b-88eb-aa1c2a20a95a",ColumnName="doc_otroscargos",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="745a8af1-62fb-446c-9b45-2be104047fb7",
Synchronized="2022-08-27 11:54:07.0")
/** Column name doc_otroscargos */
public static final String COLUMNNAME_doc_otroscargos = "doc_otroscargos";
/** Set doc_otrostributos.
@param doc_otrostributos doc_otrostributos */
public void setdoc_otrostributos (BigDecimal doc_otrostributos)
{
set_Value (COLUMNNAME_doc_otrostributos, doc_otrostributos);
}
/** Get doc_otrostributos.
@return doc_otrostributos */
public BigDecimal getdoc_otrostributos() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_doc_otrostributos);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="cbbb6fe2-3cc9-4117-a10a-12657c140360")
public static String es_PE_COLUMN_doc_otrostributos_Name="doc_otrostributos";

@XendraColumn(AD_Element_ID="bcf0b63f-23e6-409a-b075-4707f64d0860",ColumnName="doc_otrostributos",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cbbb6fe2-3cc9-4117-a10a-12657c140360",
Synchronized="2022-08-27 11:54:07.0")
/** Column name doc_otrostributos */
public static final String COLUMNNAME_doc_otrostributos = "doc_otrostributos";
/** Set doc_percepcion.
@param doc_percepcion doc_percepcion */
public void setdoc_percepcion (BigDecimal doc_percepcion)
{
set_Value (COLUMNNAME_doc_percepcion, doc_percepcion);
}
/** Get doc_percepcion.
@return doc_percepcion */
public BigDecimal getdoc_percepcion() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_doc_percepcion);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="a62833c6-0dfd-4100-8c14-99fd3000c195")
public static String es_PE_COLUMN_doc_percepcion_Name="doc_percepcion";

@XendraColumn(AD_Element_ID="872c10ea-888e-4568-a522-1cfc2039f897",ColumnName="doc_percepcion",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a62833c6-0dfd-4100-8c14-99fd3000c195",
Synchronized="2022-08-27 11:54:07.0")
/** Column name doc_percepcion */
public static final String COLUMNNAME_doc_percepcion = "doc_percepcion";
/** Set doc_subtotal.
@param doc_subtotal doc_subtotal */
public void setdoc_subtotal (BigDecimal doc_subtotal)
{
set_Value (COLUMNNAME_doc_subtotal, doc_subtotal);
}
/** Get doc_subtotal.
@return doc_subtotal */
public BigDecimal getdoc_subtotal() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_doc_subtotal);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="750d9e33-ff87-4d14-b3ab-0c1295327453")
public static String es_PE_COLUMN_doc_subtotal_Name="doc_subtotal";

@XendraColumn(AD_Element_ID="10627629-89fe-4d5c-8823-d849bf3f8f9a",ColumnName="doc_subtotal",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="750d9e33-ff87-4d14-b3ab-0c1295327453",
Synchronized="2022-08-27 11:54:07.0")
/** Column name doc_subtotal */
public static final String COLUMNNAME_doc_subtotal = "doc_subtotal";
/** Set doc_tipo_operacion.
@param doc_tipo_operacion doc_tipo_operacion */
public void setdoc_tipo_operacion (String doc_tipo_operacion)
{
if (doc_tipo_operacion != null && doc_tipo_operacion.length() > 5)
{
log.warning("Length > 5 - truncated");
doc_tipo_operacion = doc_tipo_operacion.substring(0,4);
}
set_Value (COLUMNNAME_doc_tipo_operacion, doc_tipo_operacion);
}
/** Get doc_tipo_operacion.
@return doc_tipo_operacion */
public String getdoc_tipo_operacion() 
{
String value = (String)get_Value(COLUMNNAME_doc_tipo_operacion);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="e2ec3399-5ed1-4436-929f-ce9138f55ba1")
public static String es_PE_COLUMN_doc_tipo_operacion_Name="doc_tipo_operacion";

@XendraColumn(AD_Element_ID="de7d7f78-2c45-4ce3-896a-3eb7dc66b6e4",ColumnName="doc_tipo_operacion",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=5,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e2ec3399-5ed1-4436-929f-ce9138f55ba1",
Synchronized="2022-08-27 11:54:08.0")
/** Column name doc_tipo_operacion */
public static final String COLUMNNAME_doc_tipo_operacion = "doc_tipo_operacion";
/** Set doc_total.
@param doc_total doc_total */
public void setdoc_total (BigDecimal doc_total)
{
set_Value (COLUMNNAME_doc_total, doc_total);
}
/** Get doc_total.
@return doc_total */
public BigDecimal getdoc_total() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_doc_total);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="582bb69d-e53f-4e4c-8dfa-53be50692222")
public static String es_PE_COLUMN_doc_total_Name="doc_total";

@XendraColumn(AD_Element_ID="0a20c64c-7ba5-4d8d-a9ff-7cd5ba97abb2",ColumnName="doc_total",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="582bb69d-e53f-4e4c-8dfa-53be50692222",
Synchronized="2022-08-27 11:54:08.0")
/** Column name doc_total */
public static final String COLUMNNAME_doc_total = "doc_total";
/** Set docu_codigo_bien_detraccion.
@param docu_codigo_bien_detraccion docu_codigo_bien_detraccion */
public void setdocu_codigo_bien_detraccion (String docu_codigo_bien_detraccion)
{
if (docu_codigo_bien_detraccion != null && docu_codigo_bien_detraccion.length() > 45)
{
log.warning("Length > 45 - truncated");
docu_codigo_bien_detraccion = docu_codigo_bien_detraccion.substring(0,44);
}
set_Value (COLUMNNAME_docu_codigo_bien_detraccion, docu_codigo_bien_detraccion);
}
/** Get docu_codigo_bien_detraccion.
@return docu_codigo_bien_detraccion */
public String getdocu_codigo_bien_detraccion() 
{
String value = (String)get_Value(COLUMNNAME_docu_codigo_bien_detraccion);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="73b37329-f319-4787-aa56-2ea873e61246")
public static String es_PE_COLUMN_docu_codigo_bien_detraccion_Name="docu_codigo_bien_detraccion";

@XendraColumn(AD_Element_ID="5ca125c5-2ee2-496e-b176-65fc7c9b4366",
ColumnName="docu_codigo_bien_detraccion",AD_Reference_ID=10,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=45,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="73b37329-f319-4787-aa56-2ea873e61246",Synchronized="2022-08-27 11:54:08.0")
/** Column name docu_codigo_bien_detraccion */
public static final String COLUMNNAME_docu_codigo_bien_detraccion = "docu_codigo_bien_detraccion";
/** Set docu_detraccion.
@param docu_detraccion docu_detraccion */
public void setdocu_detraccion (BigDecimal docu_detraccion)
{
set_Value (COLUMNNAME_docu_detraccion, docu_detraccion);
}
/** Get docu_detraccion.
@return docu_detraccion */
public BigDecimal getdocu_detraccion() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_docu_detraccion);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="4c1893c6-948e-441c-b12a-c033af31d545")
public static String es_PE_COLUMN_docu_detraccion_Name="docu_detraccion";

@XendraColumn(AD_Element_ID="bafd36b5-6d43-49f8-a4f1-e5fd75e0969d",ColumnName="docu_detraccion",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4c1893c6-948e-441c-b12a-c033af31d545",
Synchronized="2022-08-27 11:54:08.0")
/** Column name docu_detraccion */
public static final String COLUMNNAME_docu_detraccion = "docu_detraccion";
/** Set docu_enviaws.
@param docu_enviaws docu_enviaws */
public void setdocu_enviaws (String docu_enviaws)
{
if (docu_enviaws != null && docu_enviaws.length() > 1)
{
log.warning("Length > 1 - truncated");
docu_enviaws = docu_enviaws.substring(0,0);
}
set_Value (COLUMNNAME_docu_enviaws, docu_enviaws);
}
/** Get docu_enviaws.
@return docu_enviaws */
public String getdocu_enviaws() 
{
String value = (String)get_Value(COLUMNNAME_docu_enviaws);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="c46e9210-9239-495f-90ff-c009abbcad5b")
public static String es_PE_COLUMN_docu_enviaws_Name="docu_enviaws";

@XendraColumn(AD_Element_ID="116f27ce-91ad-4891-a2a4-8766652ddb1f",ColumnName="docu_enviaws",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c46e9210-9239-495f-90ff-c009abbcad5b",
Synchronized="2022-08-27 11:54:08.0")
/** Column name docu_enviaws */
public static final String COLUMNNAME_docu_enviaws = "docu_enviaws";
/** Set docu_fecha_vencimiento.
@param docu_fecha_vencimiento docu_fecha_vencimiento */
public void setdocu_fecha_vencimiento (String docu_fecha_vencimiento)
{
if (docu_fecha_vencimiento != null && docu_fecha_vencimiento.length() > 10)
{
log.warning("Length > 10 - truncated");
docu_fecha_vencimiento = docu_fecha_vencimiento.substring(0,9);
}
set_Value (COLUMNNAME_docu_fecha_vencimiento, docu_fecha_vencimiento);
}
/** Get docu_fecha_vencimiento.
@return docu_fecha_vencimiento */
public String getdocu_fecha_vencimiento() 
{
String value = (String)get_Value(COLUMNNAME_docu_fecha_vencimiento);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="ef83ce70-483c-4441-92a1-2d44e1fd8688")
public static String es_PE_COLUMN_docu_fecha_vencimiento_Name="docu_fecha_vencimiento";

@XendraColumn(AD_Element_ID="aded8b3f-1fb8-4bff-86c6-9dfa7794a25d",
ColumnName="docu_fecha_vencimiento",AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="ef83ce70-483c-4441-92a1-2d44e1fd8688",Synchronized="2022-08-27 11:54:08.0")
/** Column name docu_fecha_vencimiento */
public static final String COLUMNNAME_docu_fecha_vencimiento = "docu_fecha_vencimiento";
/** Set docu_hora.
@param docu_hora docu_hora */
public void setdocu_hora (String docu_hora)
{
if (docu_hora != null && docu_hora.length() > 13)
{
log.warning("Length > 13 - truncated");
docu_hora = docu_hora.substring(0,12);
}
set_Value (COLUMNNAME_docu_hora, docu_hora);
}
/** Get docu_hora.
@return docu_hora */
public String getdocu_hora() 
{
String value = (String)get_Value(COLUMNNAME_docu_hora);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="23a6d52a-3adc-4f4b-8095-01e1aa54bc6f")
public static String es_PE_COLUMN_docu_hora_Name="docu_hora";

@XendraColumn(AD_Element_ID="f0f51ad2-09c9-4468-bd87-92c61b88a7d4",ColumnName="docu_hora",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=13,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="23a6d52a-3adc-4f4b-8095-01e1aa54bc6f",
Synchronized="2022-08-27 11:54:08.0")
/** Column name docu_hora */
public static final String COLUMNNAME_docu_hora = "docu_hora";
/** Set docu_isc.
@param docu_isc docu_isc */
public void setdocu_isc (BigDecimal docu_isc)
{
set_Value (COLUMNNAME_docu_isc, docu_isc);
}
/** Get docu_isc.
@return docu_isc */
public BigDecimal getdocu_isc() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_docu_isc);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="dc637884-d8b4-4050-82e0-9e02f9658efc")
public static String es_PE_COLUMN_docu_isc_Name="docu_isc";

@XendraColumn(AD_Element_ID="5b5f77d0-df1b-4a29-9418-d5ced1b0b39c",ColumnName="docu_isc",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="dc637884-d8b4-4050-82e0-9e02f9658efc",
Synchronized="2022-08-27 11:54:08.0")
/** Column name docu_isc */
public static final String COLUMNNAME_docu_isc = "docu_isc";
/** Set docu_link_cdr.
@param docu_link_cdr docu_link_cdr */
public void setdocu_link_cdr (String docu_link_cdr)
{
if (docu_link_cdr != null && docu_link_cdr.length() > 200)
{
log.warning("Length > 200 - truncated");
docu_link_cdr = docu_link_cdr.substring(0,199);
}
set_Value (COLUMNNAME_docu_link_cdr, docu_link_cdr);
}
/** Get docu_link_cdr.
@return docu_link_cdr */
public String getdocu_link_cdr() 
{
String value = (String)get_Value(COLUMNNAME_docu_link_cdr);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="6fbec24b-b51c-4360-bee1-76faf7e1453e")
public static String es_PE_COLUMN_docu_link_cdr_Name="docu_link_cdr";

@XendraColumn(AD_Element_ID="5176c7ba-cef1-4fcc-a5b6-c16ee1203365",ColumnName="docu_link_cdr",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=200,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6fbec24b-b51c-4360-bee1-76faf7e1453e",
Synchronized="2022-08-27 11:54:08.0")
/** Column name docu_link_cdr */
public static final String COLUMNNAME_docu_link_cdr = "docu_link_cdr";
/** Set docu_link_pdf.
@param docu_link_pdf docu_link_pdf */
public void setdocu_link_pdf (String docu_link_pdf)
{
if (docu_link_pdf != null && docu_link_pdf.length() > 200)
{
log.warning("Length > 200 - truncated");
docu_link_pdf = docu_link_pdf.substring(0,199);
}
set_Value (COLUMNNAME_docu_link_pdf, docu_link_pdf);
}
/** Get docu_link_pdf.
@return docu_link_pdf */
public String getdocu_link_pdf() 
{
String value = (String)get_Value(COLUMNNAME_docu_link_pdf);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="3de647d3-07b0-4705-9b04-8d1c4b9f9188")
public static String es_PE_COLUMN_docu_link_pdf_Name="docu_link_pdf";

@XendraColumn(AD_Element_ID="578146f9-06ef-4a86-9040-8b49075b0d95",ColumnName="docu_link_pdf",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=200,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3de647d3-07b0-4705-9b04-8d1c4b9f9188",
Synchronized="2022-08-27 11:54:08.0")
/** Column name docu_link_pdf */
public static final String COLUMNNAME_docu_link_pdf = "docu_link_pdf";
/** Set docu_link_xml.
@param docu_link_xml docu_link_xml */
public void setdocu_link_xml (String docu_link_xml)
{
if (docu_link_xml != null && docu_link_xml.length() > 200)
{
log.warning("Length > 200 - truncated");
docu_link_xml = docu_link_xml.substring(0,199);
}
set_Value (COLUMNNAME_docu_link_xml, docu_link_xml);
}
/** Get docu_link_xml.
@return docu_link_xml */
public String getdocu_link_xml() 
{
String value = (String)get_Value(COLUMNNAME_docu_link_xml);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="d1812daa-d94d-41e0-9480-8056616b4a93")
public static String es_PE_COLUMN_docu_link_xml_Name="docu_link_xml";

@XendraColumn(AD_Element_ID="14f5a07c-01e9-4d6f-a0b2-e0001ed774b9",ColumnName="docu_link_xml",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=200,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d1812daa-d94d-41e0-9480-8056616b4a93",
Synchronized="2022-08-27 11:54:08.0")
/** Column name docu_link_xml */
public static final String COLUMNNAME_docu_link_xml = "docu_link_xml";
/** Set Document No.
@param DocumentNo Document sequence number of the document */
public void setDocumentNo (String DocumentNo)
{
if (DocumentNo == null) throw new IllegalArgumentException ("DocumentNo is mandatory.");
if (DocumentNo.length() > 30)
{
log.warning("Length > 30 - truncated");
DocumentNo = DocumentNo.substring(0,29);
}
set_Value (COLUMNNAME_DocumentNo, DocumentNo);
}
/** Get Document No.
@return Document sequence number of the document */
public String getDocumentNo() 
{
String value = (String)get_Value(COLUMNNAME_DocumentNo);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="e26f5f09-588d-4593-b7cc-eeefba41fee5")
public static String es_PE_COLUMN_DocumentNo_Name="Document No";

@XendraColumn(AD_Element_ID="e3ca6e28-702a-2722-d941-b2072a0de9cb",ColumnName="DocumentNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e26f5f09-588d-4593-b7cc-eeefba41fee5",
Synchronized="2022-08-27 11:54:08.0")
/** Column name DocumentNo */
public static final String COLUMNNAME_DocumentNo = "DocumentNo";
/** Set docu_tasa_detraccion.
@param docu_tasa_detraccion docu_tasa_detraccion */
public void setdocu_tasa_detraccion (String docu_tasa_detraccion)
{
if (docu_tasa_detraccion != null && docu_tasa_detraccion.length() > 45)
{
log.warning("Length > 45 - truncated");
docu_tasa_detraccion = docu_tasa_detraccion.substring(0,44);
}
set_Value (COLUMNNAME_docu_tasa_detraccion, docu_tasa_detraccion);
}
/** Get docu_tasa_detraccion.
@return docu_tasa_detraccion */
public String getdocu_tasa_detraccion() 
{
String value = (String)get_Value(COLUMNNAME_docu_tasa_detraccion);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="4dc62d5a-b95f-40ad-b393-de2a29432f4f")
public static String es_PE_COLUMN_docu_tasa_detraccion_Name="docu_tasa_detraccion";

@XendraColumn(AD_Element_ID="b96f7a47-33f4-49d0-b0ce-0fca8ba88b93",
ColumnName="docu_tasa_detraccion",AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=45,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="4dc62d5a-b95f-40ad-b393-de2a29432f4f",Synchronized="2022-08-27 11:54:08.0")
/** Column name docu_tasa_detraccion */
public static final String COLUMNNAME_docu_tasa_detraccion = "docu_tasa_detraccion";
/** Set docu_total_tax.
@param docu_total_tax docu_total_tax */
public void setdocu_total_tax (BigDecimal docu_total_tax)
{
set_Value (COLUMNNAME_docu_total_tax, docu_total_tax);
}
/** Get docu_total_tax.
@return docu_total_tax */
public BigDecimal getdocu_total_tax() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_docu_total_tax);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="86e6aa77-95a7-42ff-bbda-d18e1fb30bc7")
public static String es_PE_COLUMN_docu_total_tax_Name="docu_total_tax";

@XendraColumn(AD_Element_ID="37714d84-5da5-41df-9152-6a9c0830fd6b",ColumnName="docu_total_tax",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="86e6aa77-95a7-42ff-bbda-d18e1fb30bc7",
Synchronized="2022-08-27 11:54:08.0")
/** Column name docu_total_tax */
public static final String COLUMNNAME_docu_total_tax = "docu_total_tax";
/** Set Due Date.
@param DueDate Date when the payment is due */
public void setDueDate (Timestamp DueDate)
{
set_Value (COLUMNNAME_DueDate, DueDate);
}
/** Get Due Date.
@return Date when the payment is due */
public Timestamp getDueDate() 
{
return (Timestamp)get_Value(COLUMNNAME_DueDate);
}

@XendraTrl(Identifier="198752f6-ee06-409d-bdec-47f236c32d6c")
public static String es_PE_COLUMN_DueDate_Name="Due Date";

@XendraColumn(AD_Element_ID="37bdf028-bb21-2699-2840-6730e99633c6",ColumnName="DueDate",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="198752f6-ee06-409d-bdec-47f236c32d6c",
Synchronized="2022-08-27 11:54:08.0")
/** Column name DueDate */
public static final String COLUMNNAME_DueDate = "DueDate";
/** Set empr_cta_banco_nacion_detraccion.
@param empr_cta_banco_nacion_detraccion empr_cta_banco_nacion_detraccion */
public void setempr_cta_banco_nacion_detraccion (String empr_cta_banco_nacion_detraccion)
{
if (empr_cta_banco_nacion_detraccion != null && empr_cta_banco_nacion_detraccion.length() > 30)
{
log.warning("Length > 30 - truncated");
empr_cta_banco_nacion_detraccion = empr_cta_banco_nacion_detraccion.substring(0,29);
}
set_Value (COLUMNNAME_empr_cta_banco_nacion_detraccion, empr_cta_banco_nacion_detraccion);
}
/** Get empr_cta_banco_nacion_detraccion.
@return empr_cta_banco_nacion_detraccion */
public String getempr_cta_banco_nacion_detraccion() 
{
String value = (String)get_Value(COLUMNNAME_empr_cta_banco_nacion_detraccion);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="8eef274c-d7ea-4277-8364-c751ae4b7651")
public static String es_PE_COLUMN_empr_cta_banco_nacion_detraccion_Name="empr_cta_banco_nacion_detraccion";

@XendraColumn(AD_Element_ID="1b5a614e-7167-4a44-8de7-bd923153a666",
ColumnName="empr_cta_banco_nacion_detraccion",AD_Reference_ID=10,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="8eef274c-d7ea-4277-8364-c751ae4b7651",Synchronized="2022-08-27 11:54:08.0")
/** Column name empr_cta_banco_nacion_detraccion */
public static final String COLUMNNAME_empr_cta_banco_nacion_detraccion = "empr_cta_banco_nacion_detraccion";
/** Set empr_local.
@param empr_local empr_local */
public void setempr_local (String empr_local)
{
if (empr_local != null && empr_local.length() > 4)
{
log.warning("Length > 4 - truncated");
empr_local = empr_local.substring(0,3);
}
set_Value (COLUMNNAME_empr_local, empr_local);
}
/** Get empr_local.
@return empr_local */
public String getempr_local() 
{
String value = (String)get_Value(COLUMNNAME_empr_local);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="a8cc1ac0-40c2-4cc6-b519-b38e15677061")
public static String es_PE_COLUMN_empr_local_Name="empr_local";

@XendraColumn(AD_Element_ID="f40f2a14-4503-4463-9280-c44a26993ec2",ColumnName="empr_local",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=4,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a8cc1ac0-40c2-4cc6-b519-b38e15677061",
Synchronized="2022-08-27 11:54:08.0")
/** Column name empr_local */
public static final String COLUMNNAME_empr_local = "empr_local";
/** Set Error Msg.
@param ErrorMsg Error Msg */
public void setErrorMsg (String ErrorMsg)
{
if (ErrorMsg != null && ErrorMsg.length() > 100)
{
log.warning("Length > 100 - truncated");
ErrorMsg = ErrorMsg.substring(0,99);
}
set_Value (COLUMNNAME_ErrorMsg, ErrorMsg);
}
/** Get Error Msg.
@return Error Msg */
public String getErrorMsg() 
{
String value = (String)get_Value(COLUMNNAME_ErrorMsg);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="c4d42eaf-0320-4413-8bf3-e3e0f16261bd")
public static String es_PE_COLUMN_ErrorMsg_Name="Error Msg";

@XendraColumn(AD_Element_ID="7ed8e902-7223-0140-a5e2-159d12a79a58",ColumnName="ErrorMsg",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=100,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c4d42eaf-0320-4413-8bf3-e3e0f16261bd",
Synchronized="2022-08-27 11:54:08.0")
/** Column name ErrorMsg */
public static final String COLUMNNAME_ErrorMsg = "ErrorMsg";
/** Set Grand Total.
@param GrandTotal Total amount of document */
public void setGrandTotal (BigDecimal GrandTotal)
{
set_Value (COLUMNNAME_GrandTotal, GrandTotal);
}
/** Get Grand Total.
@return Total amount of document */
public BigDecimal getGrandTotal() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_GrandTotal);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="2165c584-d53e-4918-bb5e-3e4fef0ecb65")
public static String es_PE_COLUMN_GrandTotal_Name="Grand Total";

@XendraColumn(AD_Element_ID="ffd614c2-6ff8-c9c6-71bf-44f369675711",ColumnName="GrandTotal",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2165c584-d53e-4918-bb5e-3e4fef0ecb65",
Synchronized="2022-08-27 11:54:08.0")
/** Column name GrandTotal */
public static final String COLUMNNAME_GrandTotal = "GrandTotal";
/** Set HashCode.
@param HashCode HashCode */
public void setHashCode (String HashCode)
{
if (HashCode != null && HashCode.length() > 100)
{
log.warning("Length > 100 - truncated");
HashCode = HashCode.substring(0,99);
}
set_Value (COLUMNNAME_HashCode, HashCode);
}
/** Get HashCode.
@return HashCode */
public String getHashCode() 
{
String value = (String)get_Value(COLUMNNAME_HashCode);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="14427571-4a7d-43f9-8468-01e92c714d20")
public static String es_PE_COLUMN_HashCode_Name="hashcode";

@XendraColumn(AD_Element_ID="5887d79b-fe5d-44a5-8569-44b609f9a26c",ColumnName="HashCode",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=100,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="14427571-4a7d-43f9-8468-01e92c714d20",
Synchronized="2022-08-27 11:54:08.0")
/** Column name HashCode */
public static final String COLUMNNAME_HashCode = "HashCode";
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
@XendraTrl(Identifier="b7e68ee8-859b-454b-9e8d-e9471bea2271")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b7e68ee8-859b-454b-9e8d-e9471bea2271",
Synchronized="2022-08-27 11:54:08.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set id_externo.
@param id_externo id_externo */
public void setid_externo (int id_externo)
{
set_Value (COLUMNNAME_id_externo, Integer.valueOf(id_externo));
}
/** Get id_externo.
@return id_externo */
public int getid_externo() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_id_externo);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="36c0064e-7ec5-4411-ba11-02cac83b8216")
public static String es_PE_COLUMN_id_externo_Name="id_externo";

@XendraColumn(AD_Element_ID="4d3cac79-e47e-4c1d-957c-440874177dc5",ColumnName="id_externo",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="36c0064e-7ec5-4411-ba11-02cac83b8216",
Synchronized="2022-08-27 11:54:08.0")
/** Column name id_externo */
public static final String COLUMNNAME_id_externo = "id_externo";
/** Set InvoiceOperationTypeCode.
@param InvoiceOperationTypeCode InvoiceOperationTypeCode */
public void setInvoiceOperationTypeCode (String InvoiceOperationTypeCode)
{
if (InvoiceOperationTypeCode != null && InvoiceOperationTypeCode.length() > 4)
{
log.warning("Length > 4 - truncated");
InvoiceOperationTypeCode = InvoiceOperationTypeCode.substring(0,3);
}
set_Value (COLUMNNAME_InvoiceOperationTypeCode, InvoiceOperationTypeCode);
}
/** Get InvoiceOperationTypeCode.
@return InvoiceOperationTypeCode */
public String getInvoiceOperationTypeCode() 
{
return (String)get_Value(COLUMNNAME_InvoiceOperationTypeCode);
}

@XendraTrl(Identifier="be7c0074-fec8-40d2-b5a7-4f61ca47fce7")
public static String es_PE_COLUMN_InvoiceOperationTypeCode_Name="invoiceoperationtypecode";

@XendraColumn(AD_Element_ID="8ae6db16-28d2-4c86-b08a-214c5e9419ac",
ColumnName="InvoiceOperationTypeCode",AD_Reference_ID=17,
AD_Reference_Value_ID="f21e0f28-1211-4c12-98f0-1449784900c6",AD_Val_Rule_ID="",FieldLength=4,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="be7c0074-fec8-40d2-b5a7-4f61ca47fce7",
Synchronized="2022-08-27 11:54:08.0")
/** Column name InvoiceOperationTypeCode */
public static final String COLUMNNAME_InvoiceOperationTypeCode = "InvoiceOperationTypeCode";
/** Set nota_documento.
@param nota_documento nota_documento */
public void setnota_documento (String nota_documento)
{
if (nota_documento != null && nota_documento.length() > 30)
{
log.warning("Length > 30 - truncated");
nota_documento = nota_documento.substring(0,29);
}
set_Value (COLUMNNAME_nota_documento, nota_documento);
}
/** Get nota_documento.
@return nota_documento */
public String getnota_documento() 
{
String value = (String)get_Value(COLUMNNAME_nota_documento);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="bd4a4189-aa54-491e-9c7e-e12cd78e9c91")
public static String es_PE_COLUMN_nota_documento_Name="nota_documento";

@XendraColumn(AD_Element_ID="a57c07c2-4804-46d0-b74e-ae0ab0b0ec6f",ColumnName="nota_documento",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bd4a4189-aa54-491e-9c7e-e12cd78e9c91",
Synchronized="2022-08-27 11:54:08.0")
/** Column name nota_documento */
public static final String COLUMNNAME_nota_documento = "nota_documento";
/** Set nota_documento_fecha.
@param nota_documento_fecha nota_documento_fecha */
public void setnota_documento_fecha (String nota_documento_fecha)
{
if (nota_documento_fecha != null && nota_documento_fecha.length() > 10)
{
log.warning("Length > 10 - truncated");
nota_documento_fecha = nota_documento_fecha.substring(0,9);
}
set_Value (COLUMNNAME_nota_documento_fecha, nota_documento_fecha);
}
/** Get nota_documento_fecha.
@return nota_documento_fecha */
public String getnota_documento_fecha() 
{
String value = (String)get_Value(COLUMNNAME_nota_documento_fecha);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="f9f2d16b-6ee6-44b5-b7b1-3bddc4babb8f")
public static String es_PE_COLUMN_nota_documento_fecha_Name="nota_documento_fecha";

@XendraColumn(AD_Element_ID="abff39ff-9101-4c52-9df2-a13b8fae7c87",
ColumnName="nota_documento_fecha",AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="f9f2d16b-6ee6-44b5-b7b1-3bddc4babb8f",Synchronized="2022-08-27 11:54:08.0")
/** Column name nota_documento_fecha */
public static final String COLUMNNAME_nota_documento_fecha = "nota_documento_fecha";
/** Set nota_motivo.
@param nota_motivo nota_motivo */
public void setnota_motivo (String nota_motivo)
{
if (nota_motivo != null && nota_motivo.length() > 30)
{
log.warning("Length > 30 - truncated");
nota_motivo = nota_motivo.substring(0,29);
}
set_Value (COLUMNNAME_nota_motivo, nota_motivo);
}
/** Get nota_motivo.
@return nota_motivo */
public String getnota_motivo() 
{
String value = (String)get_Value(COLUMNNAME_nota_motivo);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="fa95e417-c9ea-494d-9235-750f16392f63")
public static String es_PE_COLUMN_nota_motivo_Name="nota_motivo";

@XendraColumn(AD_Element_ID="380c5f63-4623-42c1-a7f9-0cb0aafe3ea7",ColumnName="nota_motivo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fa95e417-c9ea-494d-9235-750f16392f63",
Synchronized="2022-08-27 11:54:08.0")
/** Column name nota_motivo */
public static final String COLUMNNAME_nota_motivo = "nota_motivo";
/** Set nota_sustento.
@param nota_sustento nota_sustento */
public void setnota_sustento (String nota_sustento)
{
if (nota_sustento != null && nota_sustento.length() > 30)
{
log.warning("Length > 30 - truncated");
nota_sustento = nota_sustento.substring(0,29);
}
set_Value (COLUMNNAME_nota_sustento, nota_sustento);
}
/** Get nota_sustento.
@return nota_sustento */
public String getnota_sustento() 
{
String value = (String)get_Value(COLUMNNAME_nota_sustento);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="b966a48d-abcb-4ddc-93d6-ecd15d26a7b5")
public static String es_PE_COLUMN_nota_sustento_Name="nota_sustento";

@XendraColumn(AD_Element_ID="517998d7-8b31-4565-9277-8b54bb494217",ColumnName="nota_sustento",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b966a48d-abcb-4ddc-93d6-ecd15d26a7b5",
Synchronized="2022-08-27 11:54:08.0")
/** Column name nota_sustento */
public static final String COLUMNNAME_nota_sustento = "nota_sustento";
/** Set nota_tipodoc.
@param nota_tipodoc nota_tipodoc */
public void setnota_tipodoc (String nota_tipodoc)
{
if (nota_tipodoc != null && nota_tipodoc.length() > 30)
{
log.warning("Length > 30 - truncated");
nota_tipodoc = nota_tipodoc.substring(0,29);
}
set_Value (COLUMNNAME_nota_tipodoc, nota_tipodoc);
}
/** Get nota_tipodoc.
@return nota_tipodoc */
public String getnota_tipodoc() 
{
String value = (String)get_Value(COLUMNNAME_nota_tipodoc);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="917e8939-04d1-4008-9778-400ca99638e4")
public static String es_PE_COLUMN_nota_tipodoc_Name="nota_tipodoc";

@XendraColumn(AD_Element_ID="f82b5e5c-70aa-49a8-a2c8-96bdf4ca49a9",ColumnName="nota_tipodoc",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="917e8939-04d1-4008-9778-400ca99638e4",
Synchronized="2022-08-27 11:54:08.0")
/** Column name nota_tipodoc */
public static final String COLUMNNAME_nota_tipodoc = "nota_tipodoc";
/** Set PartnerName.
@param PartnerName PartnerName */
public void setPartnerName (String PartnerName)
{
if (PartnerName != null && PartnerName.length() > 60)
{
log.warning("Length > 60 - truncated");
PartnerName = PartnerName.substring(0,59);
}
set_Value (COLUMNNAME_PartnerName, PartnerName);
}
/** Get PartnerName.
@return PartnerName */
public String getPartnerName() 
{
String value = (String)get_Value(COLUMNNAME_PartnerName);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="49cdfdcf-62f5-4b7b-8427-f4e76a5c9ee9")
public static String es_PE_COLUMN_PartnerName_Name="partnername";

@XendraColumn(AD_Element_ID="65b742c7-146e-4be1-823d-3236f672f558",ColumnName="PartnerName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="49cdfdcf-62f5-4b7b-8427-f4e76a5c9ee9",
Synchronized="2022-08-27 11:54:08.0")
/** Column name PartnerName */
public static final String COLUMNNAME_PartnerName = "PartnerName";
/** Set PartnerTaxID.
@param PartnerTaxID PartnerTaxID */
public void setPartnerTaxID (String PartnerTaxID)
{
if (PartnerTaxID != null && PartnerTaxID.length() > 20)
{
log.warning("Length > 20 - truncated");
PartnerTaxID = PartnerTaxID.substring(0,19);
}
set_Value (COLUMNNAME_PartnerTaxID, PartnerTaxID);
}
/** Get PartnerTaxID.
@return PartnerTaxID */
public String getPartnerTaxID() 
{
String value = (String)get_Value(COLUMNNAME_PartnerTaxID);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="f07db27f-e051-49d8-98ae-51cc9d879a34")
public static String es_PE_COLUMN_PartnerTaxID_Name="partnertaxid";

@XendraColumn(AD_Element_ID="93de4d80-bc79-4b34-b829-2e3c6a94492d",ColumnName="PartnerTaxID",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f07db27f-e051-49d8-98ae-51cc9d879a34",
Synchronized="2022-08-27 11:54:08.0")
/** Column name PartnerTaxID */
public static final String COLUMNNAME_PartnerTaxID = "PartnerTaxID";
/** Set Processed.
@param Processed The document has been processed */
public void setProcessed (boolean Processed)
{
set_Value (COLUMNNAME_Processed, Boolean.valueOf(Processed));
}
/** Get Processed.
@return The document has been processed */
public boolean isProcessed() 
{
Object oo = get_Value(COLUMNNAME_Processed);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="82b04b19-45fc-42ec-9389-dbd6a9566bb6")
public static String es_PE_COLUMN_Processed_Name="Processed";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="82b04b19-45fc-42ec-9389-dbd6a9566bb6",
Synchronized="2022-08-27 11:54:08.0")
/** Column name Processed */
public static final String COLUMNNAME_Processed = "Processed";
/** Set Process Now.
@param Processing Process Now */
public void setProcessing (boolean Processing)
{
set_Value (COLUMNNAME_Processing, Boolean.valueOf(Processing));
}
/** Get Process Now.
@return Process Now */
public boolean isProcessing() 
{
Object oo = get_Value(COLUMNNAME_Processing);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="7ac49fa9-038b-4e70-9794-6eceff663364")
public static String es_PE_COLUMN_Processing_Name="Process Now";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7ac49fa9-038b-4e70-9794-6eceff663364",
Synchronized="2022-08-27 11:54:08.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
/** Set ReferenceTaxID.
@param ReferenceTaxID ReferenceTaxID */
public void setReferenceTaxID (String ReferenceTaxID)
{
if (ReferenceTaxID != null && ReferenceTaxID.length() > 20)
{
log.warning("Length > 20 - truncated");
ReferenceTaxID = ReferenceTaxID.substring(0,19);
}
set_Value (COLUMNNAME_ReferenceTaxID, ReferenceTaxID);
}
/** Get ReferenceTaxID.
@return ReferenceTaxID */
public String getReferenceTaxID() 
{
String value = (String)get_Value(COLUMNNAME_ReferenceTaxID);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="1886be63-7e46-4183-956f-67531aaba4ad")
public static String es_PE_COLUMN_ReferenceTaxID_Name="referencetaxid";

@XendraColumn(AD_Element_ID="3103fea5-53ed-46cd-9f41-70bb2e37cce1",ColumnName="ReferenceTaxID",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1886be63-7e46-4183-956f-67531aaba4ad",
Synchronized="2022-08-27 11:54:08.0")
/** Column name ReferenceTaxID */
public static final String COLUMNNAME_ReferenceTaxID = "ReferenceTaxID";
/** Set rete_regi.
@param rete_regi rete_regi */
public void setrete_regi (BigDecimal rete_regi)
{
set_Value (COLUMNNAME_rete_regi, rete_regi);
}
/** Get rete_regi.
@return rete_regi */
public BigDecimal getrete_regi() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_rete_regi);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="738b7bb9-8931-4e30-9240-aa672fec4a6a")
public static String es_PE_COLUMN_rete_regi_Name="rete_regi";

@XendraColumn(AD_Element_ID="3154edeb-bd63-4214-91c3-39308f72882b",ColumnName="rete_regi",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="738b7bb9-8931-4e30-9240-aa672fec4a6a",
Synchronized="2022-08-27 11:54:08.0")
/** Column name rete_regi */
public static final String COLUMNNAME_rete_regi = "rete_regi";
/** Set rete_tasa.
@param rete_tasa rete_tasa */
public void setrete_tasa (BigDecimal rete_tasa)
{
set_Value (COLUMNNAME_rete_tasa, rete_tasa);
}
/** Get rete_tasa.
@return rete_tasa */
public BigDecimal getrete_tasa() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_rete_tasa);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="16d3abf0-c602-4983-aeba-8fd44dda877b")
public static String es_PE_COLUMN_rete_tasa_Name="rete_tasa";

@XendraColumn(AD_Element_ID="0ab4ed0b-3978-4006-9476-f08113712767",ColumnName="rete_tasa",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="16d3abf0-c602-4983-aeba-8fd44dda877b",
Synchronized="2022-08-27 11:54:08.0")
/** Column name rete_tasa */
public static final String COLUMNNAME_rete_tasa = "rete_tasa";
/** Set rete_total_elec.
@param rete_total_elec rete_total_elec */
public void setrete_total_elec (BigDecimal rete_total_elec)
{
set_Value (COLUMNNAME_rete_total_elec, rete_total_elec);
}
/** Get rete_total_elec.
@return rete_total_elec */
public BigDecimal getrete_total_elec() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_rete_total_elec);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="932c025e-83bc-4861-b3d5-c398719a80f1")
public static String es_PE_COLUMN_rete_total_elec_Name="rete_total_elec";

@XendraColumn(AD_Element_ID="288ed3da-9882-4364-bd4a-487137d814a5",ColumnName="rete_total_elec",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="932c025e-83bc-4861-b3d5-c398719a80f1",
Synchronized="2022-08-27 11:54:08.0")
/** Column name rete_total_elec */
public static final String COLUMNNAME_rete_total_elec = "rete_total_elec";
/** Set rete_total_rete.
@param rete_total_rete rete_total_rete */
public void setrete_total_rete (BigDecimal rete_total_rete)
{
set_Value (COLUMNNAME_rete_total_rete, rete_total_rete);
}
/** Get rete_total_rete.
@return rete_total_rete */
public BigDecimal getrete_total_rete() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_rete_total_rete);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="8a863a6d-3680-4ec3-952f-3896e69733fe")
public static String es_PE_COLUMN_rete_total_rete_Name="rete_total_rete";

@XendraColumn(AD_Element_ID="d862c17a-66a4-453c-8f04-c2ae525cdd28",ColumnName="rete_total_rete",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8a863a6d-3680-4ec3-952f-3896e69733fe",
Synchronized="2022-08-27 11:54:08.0")
/** Column name rete_total_rete */
public static final String COLUMNNAME_rete_total_rete = "rete_total_rete";
/** Set S_DocHeader_ID.
@param S_DocHeader_ID S_DocHeader_ID */
public void setS_DocHeader_ID (int S_DocHeader_ID)
{
if (S_DocHeader_ID < 1) throw new IllegalArgumentException ("S_DocHeader_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_S_DocHeader_ID, Integer.valueOf(S_DocHeader_ID));
}
/** Get S_DocHeader_ID.
@return S_DocHeader_ID */
public int getS_DocHeader_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_S_DocHeader_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name S_DocHeader_ID */
public static final String COLUMNNAME_S_DocHeader_ID = "S_DocHeader_ID";
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
@XendraTrl(Identifier="054e13cc-551e-4b94-9e3c-50005aa10c7d")
public static String es_PE_COLUMN_Serial_Name="Document Serial";

@XendraColumn(AD_Element_ID="56277733-3963-25db-320e-99e754ca1e9c",ColumnName="Serial",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="054e13cc-551e-4b94-9e3c-50005aa10c7d",
Synchronized="2022-08-27 11:54:08.0")
/** Column name Serial */
public static final String COLUMNNAME_Serial = "Serial";
/** Set tasa_isc.
@param tasa_isc tasa_isc */
public void settasa_isc (int tasa_isc)
{
set_Value (COLUMNNAME_tasa_isc, Integer.valueOf(tasa_isc));
}
/** Get tasa_isc.
@return tasa_isc */
public int gettasa_isc() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_tasa_isc);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="0a29c23f-4e99-4709-99e5-151f0993d4df")
public static String es_PE_COLUMN_tasa_isc_Name="tasa_isc";

@XendraColumn(AD_Element_ID="2b1ab46d-93a2-41ea-97f9-7dbc8ba6d64a",ColumnName="tasa_isc",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0a29c23f-4e99-4709-99e5-151f0993d4df",
Synchronized="2022-08-27 11:54:08.0")
/** Column name tasa_isc */
public static final String COLUMNNAME_tasa_isc = "tasa_isc";
/** Set tasa_otrostributos.
@param tasa_otrostributos tasa_otrostributos */
public void settasa_otrostributos (int tasa_otrostributos)
{
set_Value (COLUMNNAME_tasa_otrostributos, Integer.valueOf(tasa_otrostributos));
}
/** Get tasa_otrostributos.
@return tasa_otrostributos */
public int gettasa_otrostributos() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_tasa_otrostributos);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="a5bb3722-d639-4700-85fe-0306a6c91832")
public static String es_PE_COLUMN_tasa_otrostributos_Name="tasa_otrostributos";

@XendraColumn(AD_Element_ID="f4f5a36a-a205-4e46-a55b-4d64e7e59b0c",ColumnName="tasa_otrostributos",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a5bb3722-d639-4700-85fe-0306a6c91832",
Synchronized="2022-08-27 11:54:08.0")
/** Column name tasa_otrostributos */
public static final String COLUMNNAME_tasa_otrostributos = "tasa_otrostributos";
/** Set Tax Amount.
@param TaxAmt Tax Amount for a document */
public void setTaxAmt (BigDecimal TaxAmt)
{
set_Value (COLUMNNAME_TaxAmt, TaxAmt);
}
/** Get Tax Amount.
@return Tax Amount for a document */
public BigDecimal getTaxAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_TaxAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="9cc096dd-d64f-4648-babf-3bc072b6c333")
public static String es_PE_COLUMN_TaxAmt_Name="Tax Amount";

@XendraColumn(AD_Element_ID="462941e1-a196-170f-fd16-84da06ba50ea",ColumnName="TaxAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9cc096dd-d64f-4648-babf-3bc072b6c333",
Synchronized="2022-08-27 11:54:08.0")
/** Column name TaxAmt */
public static final String COLUMNNAME_TaxAmt = "TaxAmt";
/** Set Tax base Amount.
@param TaxBaseAmt Base for calculating the tax amount */
public void setTaxBaseAmt (BigDecimal TaxBaseAmt)
{
set_Value (COLUMNNAME_TaxBaseAmt, TaxBaseAmt);
}
/** Get Tax base Amount.
@return Base for calculating the tax amount */
public BigDecimal getTaxBaseAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_TaxBaseAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="fe7fba03-b13d-442b-aef6-c922de93839b")
public static String es_PE_COLUMN_TaxBaseAmt_Name="Tax base Amount";

@XendraColumn(AD_Element_ID="11beb746-5f42-cac6-2ece-2c64fb573db9",ColumnName="TaxBaseAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fe7fba03-b13d-442b-aef6-c922de93839b",
Synchronized="2022-08-27 11:54:08.0")
/** Column name TaxBaseAmt */
public static final String COLUMNNAME_TaxBaseAmt = "TaxBaseAmt";
/** Set TaxEAmt.
@param TaxEAmt TaxEAmt */
public void setTaxEAmt (BigDecimal TaxEAmt)
{
set_Value (COLUMNNAME_TaxEAmt, TaxEAmt);
}
/** Get TaxEAmt.
@return TaxEAmt */
public BigDecimal getTaxEAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_TaxEAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="fe476852-96be-4865-a22e-2ced5356bcef")
public static String es_PE_COLUMN_TaxEAmt_Name="taxeamt";

@XendraColumn(AD_Element_ID="7e33da5c-6c24-4ebc-b60f-a0b20624c6dd",ColumnName="TaxEAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fe476852-96be-4865-a22e-2ced5356bcef",
Synchronized="2022-08-27 11:54:08.0")
/** Column name TaxEAmt */
public static final String COLUMNNAME_TaxEAmt = "TaxEAmt";
/** Set TaxEBaseAmt.
@param TaxEBaseAmt TaxEBaseAmt */
public void setTaxEBaseAmt (BigDecimal TaxEBaseAmt)
{
set_Value (COLUMNNAME_TaxEBaseAmt, TaxEBaseAmt);
}
/** Get TaxEBaseAmt.
@return TaxEBaseAmt */
public BigDecimal getTaxEBaseAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_TaxEBaseAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="bc53a375-a65c-4250-8004-f970e9035cd7")
public static String es_PE_COLUMN_TaxEBaseAmt_Name="taxebaseamt";

@XendraColumn(AD_Element_ID="8058e42d-caae-49b4-b2a3-e1c7c9c8b29d",ColumnName="TaxEBaseAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bc53a375-a65c-4250-8004-f970e9035cd7",
Synchronized="2022-08-27 11:54:08.0")
/** Column name TaxEBaseAmt */
public static final String COLUMNNAME_TaxEBaseAmt = "TaxEBaseAmt";
/** Set TaxGAmt.
@param TaxGAmt TaxGAmt */
public void setTaxGAmt (BigDecimal TaxGAmt)
{
set_Value (COLUMNNAME_TaxGAmt, TaxGAmt);
}
/** Get TaxGAmt.
@return TaxGAmt */
public BigDecimal getTaxGAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_TaxGAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="e055b119-10b0-420c-abbe-3771c4f5db18")
public static String es_PE_COLUMN_TaxGAmt_Name="taxgamt";

@XendraColumn(AD_Element_ID="d2526d19-e08e-457b-8aad-76cfe049cb57",ColumnName="TaxGAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e055b119-10b0-420c-abbe-3771c4f5db18",
Synchronized="2022-08-27 11:54:08.0")
/** Column name TaxGAmt */
public static final String COLUMNNAME_TaxGAmt = "TaxGAmt";
/** Set TaxGBaseAmt.
@param TaxGBaseAmt TaxGBaseAmt */
public void setTaxGBaseAmt (BigDecimal TaxGBaseAmt)
{
set_Value (COLUMNNAME_TaxGBaseAmt, TaxGBaseAmt);
}
/** Get TaxGBaseAmt.
@return TaxGBaseAmt */
public BigDecimal getTaxGBaseAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_TaxGBaseAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="c4c56f38-41bf-41c2-8a7c-c8f6d94baf10")
public static String es_PE_COLUMN_TaxGBaseAmt_Name="taxgbaseamt";

@XendraColumn(AD_Element_ID="f6997c57-a91d-4160-a11e-4711fc19fe96",ColumnName="TaxGBaseAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c4c56f38-41bf-41c2-8a7c-c8f6d94baf10",
Synchronized="2022-08-27 11:54:08.0")
/** Column name TaxGBaseAmt */
public static final String COLUMNNAME_TaxGBaseAmt = "TaxGBaseAmt";
/** Set Tax ID.
@param TaxID Tax Identification */
public void setTaxID (String TaxID)
{
if (TaxID != null && TaxID.length() > 20)
{
log.warning("Length > 20 - truncated");
TaxID = TaxID.substring(0,19);
}
set_Value (COLUMNNAME_TaxID, TaxID);
}
/** Get Tax ID.
@return Tax Identification */
public String getTaxID() 
{
String value = (String)get_Value(COLUMNNAME_TaxID);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="a94d29f5-beac-47b9-96d0-979af7e2c5f7")
public static String es_PE_COLUMN_TaxID_Name="Tax ID";

@XendraColumn(AD_Element_ID="e0a9d0f7-835b-4f80-4c13-bff62213e232",ColumnName="TaxID",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a94d29f5-beac-47b9-96d0-979af7e2c5f7",
Synchronized="2022-08-27 11:54:08.0")
/** Column name TaxID */
public static final String COLUMNNAME_TaxID = "TaxID";
/** Set TaxOAmt.
@param TaxOAmt TaxOAmt */
public void setTaxOAmt (BigDecimal TaxOAmt)
{
set_Value (COLUMNNAME_TaxOAmt, TaxOAmt);
}
/** Get TaxOAmt.
@return TaxOAmt */
public BigDecimal getTaxOAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_TaxOAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="311318bf-8136-44ff-8b12-9d4b735fb70f")
public static String es_PE_COLUMN_TaxOAmt_Name="taxoamt";

@XendraColumn(AD_Element_ID="56d74915-3401-42b2-80b8-6c12afeafd74",ColumnName="TaxOAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="311318bf-8136-44ff-8b12-9d4b735fb70f",
Synchronized="2022-08-27 11:54:08.0")
/** Column name TaxOAmt */
public static final String COLUMNNAME_TaxOAmt = "TaxOAmt";
/** Set TaxOBaseAmt.
@param TaxOBaseAmt TaxOBaseAmt */
public void setTaxOBaseAmt (BigDecimal TaxOBaseAmt)
{
set_Value (COLUMNNAME_TaxOBaseAmt, TaxOBaseAmt);
}
/** Get TaxOBaseAmt.
@return TaxOBaseAmt */
public BigDecimal getTaxOBaseAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_TaxOBaseAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="28cfc0a5-da70-4677-8e22-3ac954e7d624")
public static String es_PE_COLUMN_TaxOBaseAmt_Name="taxobaseamt";

@XendraColumn(AD_Element_ID="6768bce5-1444-439e-a1cb-d182ea0e8d70",ColumnName="TaxOBaseAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="28cfc0a5-da70-4677-8e22-3ac954e7d624",
Synchronized="2022-08-27 11:54:08.0")
/** Column name TaxOBaseAmt */
public static final String COLUMNNAME_TaxOBaseAmt = "TaxOBaseAmt";
/** Set TaxSAmt.
@param TaxSAmt TaxSAmt */
public void setTaxSAmt (BigDecimal TaxSAmt)
{
set_Value (COLUMNNAME_TaxSAmt, TaxSAmt);
}
/** Get TaxSAmt.
@return TaxSAmt */
public BigDecimal getTaxSAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_TaxSAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="5cc85975-5eab-4f21-854d-34174fa4ed35")
public static String es_PE_COLUMN_TaxSAmt_Name="taxsamt";

@XendraColumn(AD_Element_ID="51c33672-c264-41c2-a93a-8d367a6b76a7",ColumnName="TaxSAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5cc85975-5eab-4f21-854d-34174fa4ed35",
Synchronized="2022-08-27 11:54:08.0")
/** Column name TaxSAmt */
public static final String COLUMNNAME_TaxSAmt = "TaxSAmt";
/** Set TaxSBaseAmt.
@param TaxSBaseAmt TaxSBaseAmt */
public void setTaxSBaseAmt (BigDecimal TaxSBaseAmt)
{
set_Value (COLUMNNAME_TaxSBaseAmt, TaxSBaseAmt);
}
/** Get TaxSBaseAmt.
@return TaxSBaseAmt */
public BigDecimal getTaxSBaseAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_TaxSBaseAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="904daa43-bf6f-4ead-ab71-589fb8a59048")
public static String es_PE_COLUMN_TaxSBaseAmt_Name="taxsbaseamt";

@XendraColumn(AD_Element_ID="af2d1acb-cd39-436c-9c32-664dd471b158",ColumnName="TaxSBaseAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="904daa43-bf6f-4ead-ab71-589fb8a59048",
Synchronized="2022-08-27 11:54:08.0")
/** Column name TaxSBaseAmt */
public static final String COLUMNNAME_TaxSBaseAmt = "TaxSBaseAmt";
/** Set TaxTAmt.
@param TaxTAmt TaxTAmt */
public void setTaxTAmt (BigDecimal TaxTAmt)
{
set_Value (COLUMNNAME_TaxTAmt, TaxTAmt);
}
/** Get TaxTAmt.
@return TaxTAmt */
public BigDecimal getTaxTAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_TaxTAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="989a724b-ed7e-4d14-b5f2-d953b614c194")
public static String es_PE_COLUMN_TaxTAmt_Name="taxtamt";

@XendraColumn(AD_Element_ID="2b639e87-3957-4dc4-8169-d6c42a4a2bf8",ColumnName="TaxTAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="989a724b-ed7e-4d14-b5f2-d953b614c194",
Synchronized="2022-08-27 11:54:08.0")
/** Column name TaxTAmt */
public static final String COLUMNNAME_TaxTAmt = "TaxTAmt";
/** Set TaxTBaseAmt.
@param TaxTBaseAmt TaxTBaseAmt */
public void setTaxTBaseAmt (BigDecimal TaxTBaseAmt)
{
set_Value (COLUMNNAME_TaxTBaseAmt, TaxTBaseAmt);
}
/** Get TaxTBaseAmt.
@return TaxTBaseAmt */
public BigDecimal getTaxTBaseAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_TaxTBaseAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="44c95d49-dd74-4a50-86a8-4b38c3f15e3f")
public static String es_PE_COLUMN_TaxTBaseAmt_Name="taxtbaseamt";

@XendraColumn(AD_Element_ID="df91e11c-b68a-4684-96f7-784d1b416577",ColumnName="TaxTBaseAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="44c95d49-dd74-4a50-86a8-4b38c3f15e3f",
Synchronized="2022-08-27 11:54:08.0")
/** Column name TaxTBaseAmt */
public static final String COLUMNNAME_TaxTBaseAmt = "TaxTBaseAmt";
/** Set TaxZAmt.
@param TaxZAmt TaxZAmt */
public void setTaxZAmt (BigDecimal TaxZAmt)
{
set_Value (COLUMNNAME_TaxZAmt, TaxZAmt);
}
/** Get TaxZAmt.
@return TaxZAmt */
public BigDecimal getTaxZAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_TaxZAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="ecd4bae9-fa55-4820-b353-1263ede64211")
public static String es_PE_COLUMN_TaxZAmt_Name="taxzamt";

@XendraColumn(AD_Element_ID="562bff5a-40de-47e2-a2a8-57577cec1b22",ColumnName="TaxZAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ecd4bae9-fa55-4820-b353-1263ede64211",
Synchronized="2022-08-27 11:54:08.0")
/** Column name TaxZAmt */
public static final String COLUMNNAME_TaxZAmt = "TaxZAmt";
/** Set TaxZBaseAmt.
@param TaxZBaseAmt TaxZBaseAmt */
public void setTaxZBaseAmt (BigDecimal TaxZBaseAmt)
{
set_Value (COLUMNNAME_TaxZBaseAmt, TaxZBaseAmt);
}
/** Get TaxZBaseAmt.
@return TaxZBaseAmt */
public BigDecimal getTaxZBaseAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_TaxZBaseAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="e17eb3a6-0659-40d0-b222-b7e467eebdc1")
public static String es_PE_COLUMN_TaxZBaseAmt_Name="taxzbaseamt";

@XendraColumn(AD_Element_ID="e59b8279-4614-43d8-80fe-aeb4a55767f0",ColumnName="TaxZBaseAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e17eb3a6-0659-40d0-b222-b7e467eebdc1",
Synchronized="2022-08-27 11:54:08.0")
/** Column name TaxZBaseAmt */
public static final String COLUMNNAME_TaxZBaseAmt = "TaxZBaseAmt";
/** Set TotalAdvanceAmount.
@param TotalAdvanceAmount TotalAdvanceAmount */
public void setTotalAdvanceAmount (BigDecimal TotalAdvanceAmount)
{
set_Value (COLUMNNAME_TotalAdvanceAmount, TotalAdvanceAmount);
}
/** Get TotalAdvanceAmount.
@return TotalAdvanceAmount */
public BigDecimal getTotalAdvanceAmount() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_TotalAdvanceAmount);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="76d14ffb-21b8-4514-9b30-a6ae80db64e9")
public static String es_PE_COLUMN_TotalAdvanceAmount_Name="totaladvanceamount";

@XendraColumn(AD_Element_ID="4ff5313c-fa50-41e2-a886-0c00d5b5eed8",ColumnName="TotalAdvanceAmount",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="76d14ffb-21b8-4514-9b30-a6ae80db64e9",
Synchronized="2022-08-27 11:54:08.0")
/** Column name TotalAdvanceAmount */
public static final String COLUMNNAME_TotalAdvanceAmount = "TotalAdvanceAmount";
}
