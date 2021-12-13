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
/** Generated Model for C_WithholdingState
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_WithholdingState extends PO
{
/** Standard Constructor
@param ctx context
@param C_WithholdingState_ID id
@param trxName transaction
*/
public X_C_WithholdingState (Properties ctx, int C_WithholdingState_ID, String trxName)
{
super (ctx, C_WithholdingState_ID, trxName);
/** if (C_WithholdingState_ID == 0)
{
setC_WithholdingHdr_ID (0);
setC_WithholdingState_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_WithholdingState (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000280 */
public static int Table_ID=MTable.getTable_ID("C_WithholdingState");

@XendraTrl(Identifier="ff3a3449-baee-4f73-aaf1-1f32798df18f")
public static String es_PE_TABLE_C_WithholdingState_Name="WithholdingState";

@XendraTable(Name="WithholdingState",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="C_WithholdingState",AccessLevel="3",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=false,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.commercial",Identifier="ff3a3449-baee-4f73-aaf1-1f32798df18f",
Synchronized="2020-03-03 21:37:46.0")
/** TableName=C_WithholdingState */
public static final String Table_Name="C_WithholdingState";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_WithholdingState");

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
    Table_ID = MTable.getTable_ID("C_WithholdingState");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_WithholdingState[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Withholding Header.
@param C_WithholdingHdr_ID Withholding Header */
public void setC_WithholdingHdr_ID (int C_WithholdingHdr_ID)
{
if (C_WithholdingHdr_ID < 1) throw new IllegalArgumentException ("C_WithholdingHdr_ID is mandatory.");
set_Value (COLUMNNAME_C_WithholdingHdr_ID, Integer.valueOf(C_WithholdingHdr_ID));
}
/** Get Withholding Header.
@return Withholding Header */
public int getC_WithholdingHdr_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_WithholdingHdr_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="26a09a32-56b9-48dd-aa15-07e7e256aca0")
public static String es_PE_COLUMN_C_WithholdingHdr_ID_Name="Withholding Header";

@XendraColumn(AD_Element_ID="488a7bc4-04a7-4c5f-95e2-190323fac34c",
ColumnName="C_WithholdingHdr_ID",AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="26a09a32-56b9-48dd-aa15-07e7e256aca0",Synchronized="2019-08-30 22:22:23.0")
/** Column name C_WithholdingHdr_ID */
public static final String COLUMNNAME_C_WithholdingHdr_ID = "C_WithholdingHdr_ID";
/** Set WithholdingState.
@param C_WithholdingState_ID WithholdingState */
public void setC_WithholdingState_ID (int C_WithholdingState_ID)
{
if (C_WithholdingState_ID < 1) throw new IllegalArgumentException ("C_WithholdingState_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_WithholdingState_ID, Integer.valueOf(C_WithholdingState_ID));
}
/** Get WithholdingState.
@return WithholdingState */
public int getC_WithholdingState_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_WithholdingState_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name C_WithholdingState_ID */
public static final String COLUMNNAME_C_WithholdingState_ID = "C_WithholdingState_ID";
/** Set Accounting Fact ID (per document).
@param Fact_ID This ID is guaranteed to be unique per client per year per document (in the fact table). */
public void setFact_ID (int Fact_ID)
{
if (Fact_ID <= 0) set_Value (COLUMNNAME_Fact_ID, null);
 else 
set_Value (COLUMNNAME_Fact_ID, Integer.valueOf(Fact_ID));
}
/** Get Accounting Fact ID (per document).
@return This ID is guaranteed to be unique per client per year per document (in the fact table). */
public int getFact_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Fact_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="c735aa4b-cb9d-4606-a330-d4ec3c23d8e6")
public static String es_PE_COLUMN_Fact_ID_Name="Accounting Fact ID (per document)";

@XendraColumn(AD_Element_ID="20f6c8ee-0151-735b-7a03-2006e09d8eb0",ColumnName="Fact_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c735aa4b-cb9d-4606-a330-d4ec3c23d8e6",
Synchronized="2019-08-30 22:22:23.0")
/** Column name Fact_ID */
public static final String COLUMNNAME_Fact_ID = "Fact_ID";
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
@XendraTrl(Identifier="9494e86c-6d94-4c0d-ae8a-e37be2883f64")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9494e86c-6d94-4c0d-ae8a-e37be2883f64",
Synchronized="2019-08-30 22:22:23.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Posted.
@param Posted Posting status */
public void setPosted (boolean Posted)
{
set_Value (COLUMNNAME_Posted, Boolean.valueOf(Posted));
}
/** Get Posted.
@return Posting status */
public boolean isPosted() 
{
Object oo = get_Value(COLUMNNAME_Posted);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="454f5aaf-c978-4ab1-9f8c-0c1be82461dd")
public static String es_PE_COLUMN_Posted_Name="Posted";

@XendraColumn(AD_Element_ID="5eb52ebc-6992-12f5-b85a-e0a136df259b",ColumnName="Posted",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="454f5aaf-c978-4ab1-9f8c-0c1be82461dd",
Synchronized="2019-08-30 22:22:23.0")
/** Column name Posted */
public static final String COLUMNNAME_Posted = "Posted";
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

@XendraTrl(Identifier="0d4bcecd-e01f-4bc4-bc36-22f8507ff366")
public static String es_PE_COLUMN_Processed_Name="Processed";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0d4bcecd-e01f-4bc4-bc36-22f8507ff366",
Synchronized="2019-08-30 22:22:23.0")
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

@XendraTrl(Identifier="5b4873a9-3d54-4e71-b05e-5a9831c9b0a8")
public static String es_PE_COLUMN_Processing_Name="Process Now";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5b4873a9-3d54-4e71-b05e-5a9831c9b0a8",
Synchronized="2019-08-30 22:22:23.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
/** Set Status.
@param Status Status of the currently running check */
public void setStatus (String Status)
{
if (Status != null && Status.length() > 2)
{
log.warning("Length > 2 - truncated");
Status = Status.substring(0,1);
}
set_Value (COLUMNNAME_Status, Status);
}
/** Get Status.
@return Status of the currently running check */
public String getStatus() 
{
return (String)get_Value(COLUMNNAME_Status);
}

@XendraTrl(Identifier="93a21bd5-c539-4825-b3ef-744038892ef4")
public static String es_PE_COLUMN_Status_Name="Status";

@XendraColumn(AD_Element_ID="0b9968a2-c050-f756-f519-4b5d48d463a0",ColumnName="Status",
AD_Reference_ID=17,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="93a21bd5-c539-4825-b3ef-744038892ef4",
Synchronized="2019-08-30 22:22:23.0")
/** Column name Status */
public static final String COLUMNNAME_Status = "Status";
/** Set StatusDate.
@param StatusDate StatusDate */
public void setStatusDate (Timestamp StatusDate)
{
set_Value (COLUMNNAME_StatusDate, StatusDate);
}
/** Get StatusDate.
@return StatusDate */
public Timestamp getStatusDate() 
{
return (Timestamp)get_Value(COLUMNNAME_StatusDate);
}

@XendraTrl(Identifier="1590fb8f-1716-423d-813c-2c92ef655895")
public static String es_PE_COLUMN_StatusDate_Name="StatusDate";

@XendraColumn(AD_Element_ID="f4c6dc34-fa65-aa81-84cf-3e2d06a1583f",ColumnName="StatusDate",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1590fb8f-1716-423d-813c-2c92ef655895",
Synchronized="2019-08-30 22:22:23.0")
/** Column name StatusDate */
public static final String COLUMNNAME_StatusDate = "StatusDate";
}
