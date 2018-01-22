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
import org.compiere.model.reference.REF__DocumentAction;
import org.compiere.model.reference.REF__DocumentStatus;
/** Generated Model for HR_Process
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_HR_Process extends PO
{
/** Standard Constructor
@param ctx context
@param HR_Process_ID id
@param trxName transaction
*/
public X_HR_Process (Properties ctx, int HR_Process_ID, String trxName)
{
super (ctx, HR_Process_ID, trxName);
/** if (HR_Process_ID == 0)
{
setDocAction (null);	
// CO	
setDocStatus (null);	
// DR
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_HR_Process (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000376 */
public static int Table_ID=MTable.getTable_ID("HR_Process");

@XendraTrl(Identifier="ac5104a8-c9d7-4b33-9e08-ce3413388fed")
public static String es_PE_TABLE_HR_Process_Name="Human Resource Process";

@XendraTable(Name="Human Resource Process",Description="",Help="",TableName="HR_Process",
AccessLevel="3",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=0,LoadSeq=0,IsSecurityEnabled=false,
IsDeleteable=true,IsHighVolume=false,IsChangeLog=false,IsView=false,PO_Window_ID="",
ID="org.xendra.humanresource",Identifier="ac5104a8-c9d7-4b33-9e08-ce3413388fed",
Synchronized="2017-08-16 11:42:49.0")
/** TableName=HR_Process */
public static final String Table_Name="HR_Process";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"HR_Process");

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
    Table_ID = MTable.getTable_ID("HR_Process");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_HR_Process[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Print Format.
@param AD_PrintFormat_ID Data Print Format */
public void setAD_PrintFormat_ID (int AD_PrintFormat_ID)
{
if (AD_PrintFormat_ID <= 0) set_Value (COLUMNNAME_AD_PrintFormat_ID, null);
 else 
set_Value (COLUMNNAME_AD_PrintFormat_ID, Integer.valueOf(AD_PrintFormat_ID));
}
/** Get Print Format.
@return Data Print Format */
public int getAD_PrintFormat_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_PrintFormat_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="2fbd374f-2741-4841-927d-7cdc991d1c15")
public static String es_PE_COLUMN_AD_PrintFormat_ID_Name="Print Format";

@XendraColumn(AD_Element_ID="3d4916cb-0ecd-15a5-1916-be4c68c10d1f",ColumnName="AD_PrintFormat_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2fbd374f-2741-4841-927d-7cdc991d1c15",
Synchronized="2017-08-05 16:54:48.0")
/** Column name AD_PrintFormat_ID */
public static final String COLUMNNAME_AD_PrintFormat_ID = "AD_PrintFormat_ID";
/** Set Workflow.
@param AD_Workflow_ID Workflow or combination of tasks */
public void setAD_Workflow_ID (int AD_Workflow_ID)
{
if (AD_Workflow_ID <= 0) set_Value (COLUMNNAME_AD_Workflow_ID, null);
 else 
set_Value (COLUMNNAME_AD_Workflow_ID, Integer.valueOf(AD_Workflow_ID));
}
/** Get Workflow.
@return Workflow or combination of tasks */
public int getAD_Workflow_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Workflow_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="870101cc-21a5-4c6e-8360-c8acd284052d")
public static String es_PE_COLUMN_AD_Workflow_ID_Name="Workflow";

@XendraColumn(AD_Element_ID="43635d58-652b-b89d-db56-913820c290aa",ColumnName="AD_Workflow_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="870101cc-21a5-4c6e-8360-c8acd284052d",
Synchronized="2017-08-05 16:54:48.0")
/** Column name AD_Workflow_ID */
public static final String COLUMNNAME_AD_Workflow_ID = "AD_Workflow_ID";
/** Set Business Partner .
@param C_BPartner_ID Identifies a Business Partner */
public void setC_BPartner_ID (int C_BPartner_ID)
{
if (C_BPartner_ID <= 0) set_Value (COLUMNNAME_C_BPartner_ID, null);
 else 
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

@XendraTrl(Identifier="f54fa9fa-d019-4223-996a-da7a663ef6f0")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Business Partner ";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f54fa9fa-d019-4223-996a-da7a663ef6f0",
Synchronized="2017-08-05 16:54:48.0")
/** Column name C_BPartner_ID */
public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
/** Set Charge.
@param C_Charge_ID Additional document charges */
public void setC_Charge_ID (int C_Charge_ID)
{
if (C_Charge_ID <= 0) set_Value (COLUMNNAME_C_Charge_ID, null);
 else 
set_Value (COLUMNNAME_C_Charge_ID, Integer.valueOf(C_Charge_ID));
}
/** Get Charge.
@return Additional document charges */
public int getC_Charge_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Charge_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="8c040ac1-da6c-4bab-9d8c-445ee799604c")
public static String es_PE_COLUMN_C_Charge_ID_Name="Charge";

@XendraColumn(AD_Element_ID="d7e2fc48-a26e-4ded-ea44-fe15849a7883",ColumnName="C_Charge_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8c040ac1-da6c-4bab-9d8c-445ee799604c",
Synchronized="2017-08-05 16:54:48.0")
/** Column name C_Charge_ID */
public static final String COLUMNNAME_C_Charge_ID = "C_Charge_ID";
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

@XendraTrl(Identifier="079138df-5995-4841-8b14-78a13b06e515")
public static String es_PE_COLUMN_C_DocType_ID_Name="Document Type";

@XendraColumn(AD_Element_ID="099a4147-1a72-cdd0-81e0-8bdbc8c0b883",ColumnName="C_DocType_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="079138df-5995-4841-8b14-78a13b06e515",
Synchronized="2017-08-05 16:54:48.0")
/** Column name C_DocType_ID */
public static final String COLUMNNAME_C_DocType_ID = "C_DocType_ID";

/** C_DocTypeTarget_ID AD_Reference=f06eaf85-a231-e1cf-ebf8-59d002c13ab4 */
public static final int C_DOCTYPETARGET_ID_AD_Reference_ID=170;
/** Set Target Document Type.
@param C_DocTypeTarget_ID Target document type for conversing documents */
public void setC_DocTypeTarget_ID (int C_DocTypeTarget_ID)
{
if (C_DocTypeTarget_ID <= 0) set_Value (COLUMNNAME_C_DocTypeTarget_ID, null);
 else 
set_Value (COLUMNNAME_C_DocTypeTarget_ID, Integer.valueOf(C_DocTypeTarget_ID));
}
/** Get Target Document Type.
@return Target document type for conversing documents */
public int getC_DocTypeTarget_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_DocTypeTarget_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="09c9de45-c69b-4945-a657-b0775f36f537")
public static String es_PE_COLUMN_C_DocTypeTarget_ID_Name="Target Document Type";

@XendraColumn(AD_Element_ID="6dee1e94-d5bf-ba0d-a64a-25cdb5fd9515",ColumnName="C_DocTypeTarget_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="f06eaf85-a231-e1cf-ebf8-59d002c13ab4",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="09c9de45-c69b-4945-a657-b0775f36f537",Synchronized="2017-08-05 16:54:48.0")
/** Column name C_DocTypeTarget_ID */
public static final String COLUMNNAME_C_DocTypeTarget_ID = "C_DocTypeTarget_ID";
/** Set Column SQL.
@param ColumnSQL Virtual Column (r/o) */
public void setColumnSQL (String ColumnSQL)
{
if (ColumnSQL != null && ColumnSQL.length() > 255)
{
log.warning("Length > 255 - truncated");
ColumnSQL = ColumnSQL.substring(0,254);
}
set_Value (COLUMNNAME_ColumnSQL, ColumnSQL);
}
/** Get Column SQL.
@return Virtual Column (r/o) */
public String getColumnSQL() 
{
String value = (String)get_Value(COLUMNNAME_ColumnSQL);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="76579f10-495b-4294-bead-b4be1fd236b6")
public static String es_PE_COLUMN_ColumnSQL_Name="Column SQL";

@XendraColumn(AD_Element_ID="4d5be23f-2ffd-ca83-8ea2-bc7b4d29ea78",ColumnName="ColumnSQL",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="76579f10-495b-4294-bead-b4be1fd236b6",
Synchronized="2017-08-05 16:54:48.0")
/** Column name ColumnSQL */
public static final String COLUMNNAME_ColumnSQL = "ColumnSQL";
/** Set Payment Selection.
@param C_PaySelection_ID Payment Selection */
public void setC_PaySelection_ID (int C_PaySelection_ID)
{
if (C_PaySelection_ID <= 0) set_Value (COLUMNNAME_C_PaySelection_ID, null);
 else 
set_Value (COLUMNNAME_C_PaySelection_ID, Integer.valueOf(C_PaySelection_ID));
}
/** Get Payment Selection.
@return Payment Selection */
public int getC_PaySelection_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_PaySelection_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d234a798-7ecf-49fa-a6bc-51f0fb156fd4")
public static String es_PE_COLUMN_C_PaySelection_ID_Name="Payment Selection";

@XendraColumn(AD_Element_ID="79f02f46-d5fc-1851-93df-8e77a06c5431",ColumnName="C_PaySelection_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d234a798-7ecf-49fa-a6bc-51f0fb156fd4",
Synchronized="2017-08-05 16:54:48.0")
/** Column name C_PaySelection_ID */
public static final String COLUMNNAME_C_PaySelection_ID = "C_PaySelection_ID";
/** Set Account Date.
@param DateAcct Accounting Date */
public void setDateAcct (Timestamp DateAcct)
{
set_Value (COLUMNNAME_DateAcct, DateAcct);
}
/** Get Account Date.
@return Accounting Date */
public Timestamp getDateAcct() 
{
return (Timestamp)get_Value(COLUMNNAME_DateAcct);
}

@XendraTrl(Identifier="61a591e0-4569-4e50-ae0a-96f4fc9677d8")
public static String es_PE_COLUMN_DateAcct_Name="Account Date";

@XendraColumn(AD_Element_ID="034727d0-e80f-fadf-3d4f-2d8d37b75669",ColumnName="DateAcct",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,
DefaultValue="@SysDate@",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="61a591e0-4569-4e50-ae0a-96f4fc9677d8",Synchronized="2017-08-05 16:54:48.0")
/** Column name DateAcct */
public static final String COLUMNNAME_DateAcct = "DateAcct";

/** DocAction AD_Reference=e397c9b0-c643-d1cd-8380-20bee13b2a6e */
public static final int DOCACTION_AD_Reference_ID=135;
/** Set Document Action.
@param DocAction The targeted status of the document */
public void setDocAction (String DocAction)
{
if (DocAction == null) throw new IllegalArgumentException ("DocAction is mandatory");
if (DocAction.equals(REF__DocumentAction.Complete) || DocAction.equals(REF__DocumentAction.Approve) || DocAction.equals(REF__DocumentAction.Reject) || DocAction.equals(REF__DocumentAction.Post) || DocAction.equals(REF__DocumentAction.WaitComplete) || DocAction.equals(REF__DocumentAction.Prepare) || DocAction.equals(REF__DocumentAction.Close) || DocAction.equals(REF__DocumentAction.Placed) || DocAction.equals(REF__DocumentAction.Discount) || DocAction.equals(REF__DocumentAction.Portofolio) || DocAction.equals(REF__DocumentAction.Warranty) || DocAction.equals(REF__DocumentAction.Reverse_Correct) || DocAction.equals(REF__DocumentAction.Reverse_Accrual) || DocAction.equals(REF__DocumentAction.Invalidate) || DocAction.equals(REF__DocumentAction.Re_Activate) || DocAction.equals(REF__DocumentAction.None) || DocAction.equals(REF__DocumentAction.Unlock) || DocAction.equals(REF__DocumentAction.Returned) || DocAction.equals(REF__DocumentAction.Apply) || DocAction.equals(REF__DocumentAction.Collect) || DocAction.equals(REF__DocumentAction.ToCollect) || DocAction.equals(REF__DocumentAction.Restore) || DocAction.equals(REF__DocumentAction.Protested) || DocAction.equals(REF__DocumentAction.Receivables) || DocAction.equals(REF__DocumentAction.Void) || DocAction.equals(REF__DocumentAction.Draft) || DocAction.equals(REF__DocumentAction.InProgress) || DocAction.equals(REF__DocumentAction.WaitingPayment));
 else throw new IllegalArgumentException ("DocAction Invalid value - " + DocAction + " - Reference_ID=135 - CO - AP - RJ - PO - WC - PR - CL - PL - DS - PT - WR - RC - RA - IN - RE - -- - XL - RT - AY - CT - TC - RR - PD - RV - VO - DR - IP - WP");
if (DocAction.length() > 2)
{
log.warning("Length > 2 - truncated");
DocAction = DocAction.substring(0,1);
}
set_Value (COLUMNNAME_DocAction, DocAction);
}
/** Get Document Action.
@return The targeted status of the document */
public String getDocAction() 
{
return (String)get_Value(COLUMNNAME_DocAction);
}

@XendraTrl(Identifier="d310881c-3d61-425c-95c2-36e11e103920")
public static String es_PE_COLUMN_DocAction_Name="Document Action";

@XendraColumn(AD_Element_ID="d4b9075b-18e5-ebbb-5565-d217a7e531cb",ColumnName="DocAction",
AD_Reference_ID=28,AD_Reference_Value_ID="e397c9b0-c643-d1cd-8380-20bee13b2a6e",AD_Val_Rule_ID="",
FieldLength=2,DefaultValue="CO	",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,
AD_Process_ID="9eb1bbd4-415d-f589-3524-03d442fd323c",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d310881c-3d61-425c-95c2-36e11e103920",
Synchronized="2017-08-05 16:54:48.0")
/** Column name DocAction */
public static final String COLUMNNAME_DocAction = "DocAction";

/** DocStatus AD_Reference=7627125d-fefe-e6bc-bb7d-4a6c772172dc */
public static final int DOCSTATUS_AD_Reference_ID=131;
/** Set Document Status.
@param DocStatus The current status of the document */
public void setDocStatus (String DocStatus)
{
if (DocStatus == null) throw new IllegalArgumentException ("DocStatus is mandatory");
if (DocStatus.equals(REF__DocumentStatus.InProgress) || DocStatus.equals(REF__DocumentStatus.WaitingConfirmation) || DocStatus.equals(REF__DocumentStatus.Drafted) || DocStatus.equals(REF__DocumentStatus.Completed) || DocStatus.equals(REF__DocumentStatus.Approved) || DocStatus.equals(REF__DocumentStatus.WaitingPayment) || DocStatus.equals(REF__DocumentStatus.Placed) || DocStatus.equals(REF__DocumentStatus.Returned) || DocStatus.equals(REF__DocumentStatus.Discount) || DocStatus.equals(REF__DocumentStatus.Protested) || DocStatus.equals(REF__DocumentStatus.NotApproved) || DocStatus.equals(REF__DocumentStatus.Voided) || DocStatus.equals(REF__DocumentStatus.Invalid) || DocStatus.equals(REF__DocumentStatus.Reversed) || DocStatus.equals(REF__DocumentStatus.Closed) || DocStatus.equals(REF__DocumentStatus.Unknown) || DocStatus.equals(REF__DocumentStatus.Portfolio) || DocStatus.equals(REF__DocumentStatus.Warranty) || DocStatus.equals(REF__DocumentStatus.ToCollect) || DocStatus.equals(REF__DocumentStatus.Collect) || DocStatus.equals(REF__DocumentStatus.Receivables) || DocStatus.equals(REF__DocumentStatus.Apply));
 else throw new IllegalArgumentException ("DocStatus Invalid value - " + DocStatus + " - Reference_ID=131 - IP - WC - DR - CO - AP - WP - PL - RT - DS - PD - NA - VO - IN - RE - CL - ?? - PT - WR - TC - CT - RV - AY");
if (DocStatus.length() > 2)
{
log.warning("Length > 2 - truncated");
DocStatus = DocStatus.substring(0,1);
}
set_Value (COLUMNNAME_DocStatus, DocStatus);
}
/** Get Document Status.
@return The current status of the document */
public String getDocStatus() 
{
return (String)get_Value(COLUMNNAME_DocStatus);
}

@XendraTrl(Identifier="6491d2dd-11df-4dc2-a95e-a431066e0f49")
public static String es_PE_COLUMN_DocStatus_Name="Document Status";

@XendraColumn(AD_Element_ID="e73fa537-3438-bd01-dfd4-f0f080a28c55",ColumnName="DocStatus",
AD_Reference_ID=17,AD_Reference_Value_ID="7627125d-fefe-e6bc-bb7d-4a6c772172dc",AD_Val_Rule_ID="",
FieldLength=2,DefaultValue="DR",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=true,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="6491d2dd-11df-4dc2-a95e-a431066e0f49",Synchronized="2017-08-05 16:54:48.0")
/** Column name DocStatus */
public static final String COLUMNNAME_DocStatus = "DocStatus";
/** Set Document No.
@param DocumentNo Document sequence number of the document */
public void setDocumentNo (String DocumentNo)
{
if (DocumentNo != null && DocumentNo.length() > 30)
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
@XendraTrl(Identifier="8da3bf47-b09f-4664-ba37-213ebd74a342")
public static String es_PE_COLUMN_DocumentNo_Name="Document No";

@XendraColumn(AD_Element_ID="e3ca6e28-702a-2722-d941-b2072a0de9cb",ColumnName="DocumentNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8da3bf47-b09f-4664-ba37-213ebd74a342",
Synchronized="2017-08-05 16:54:48.0")
/** Column name DocumentNo */
public static final String COLUMNNAME_DocumentNo = "DocumentNo";
/** Set Payroll Department.
@param HR_Department_ID Payroll Department */
public void setHR_Department_ID (int HR_Department_ID)
{
if (HR_Department_ID <= 0) set_Value (COLUMNNAME_HR_Department_ID, null);
 else 
set_Value (COLUMNNAME_HR_Department_ID, Integer.valueOf(HR_Department_ID));
}
/** Get Payroll Department.
@return Payroll Department */
public int getHR_Department_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_HR_Department_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ba9cce23-b1a6-48d0-a285-d0894e019b98")
public static String es_PE_COLUMN_HR_Department_ID_Name="HR_Department_ID";

@XendraColumn(AD_Element_ID="9840f276-88b2-4bd2-accd-1d0a1a1dcf1f",ColumnName="HR_Department_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ba9cce23-b1a6-48d0-a285-d0894e019b98",
Synchronized="2017-08-05 16:54:48.0")
/** Column name HR_Department_ID */
public static final String COLUMNNAME_HR_Department_ID = "HR_Department_ID";
/** Set Payroll Employee.
@param HR_Employee_ID Payroll Employee */
public void setHR_Employee_ID (int HR_Employee_ID)
{
if (HR_Employee_ID <= 0) set_Value (COLUMNNAME_HR_Employee_ID, null);
 else 
set_Value (COLUMNNAME_HR_Employee_ID, Integer.valueOf(HR_Employee_ID));
}
/** Get Payroll Employee.
@return Payroll Employee */
public int getHR_Employee_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_HR_Employee_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="16396d28-141a-47eb-b7ad-d837cba8ed68")
public static String es_PE_COLUMN_HR_Employee_ID_Name="HR_Employee_ID";

@XendraColumn(AD_Element_ID="e2e2d837-3087-4795-9ab7-535beef68162",ColumnName="HR_Employee_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="16396d28-141a-47eb-b7ad-d837cba8ed68",
Synchronized="2017-08-05 16:54:48.0")
/** Column name HR_Employee_ID */
public static final String COLUMNNAME_HR_Employee_ID = "HR_Employee_ID";
/** Set HR_Job_ID.
@param HR_Job_ID HR_Job_ID */
public void setHR_Job_ID (int HR_Job_ID)
{
if (HR_Job_ID <= 0) set_Value (COLUMNNAME_HR_Job_ID, null);
 else 
set_Value (COLUMNNAME_HR_Job_ID, Integer.valueOf(HR_Job_ID));
}
/** Get HR_Job_ID.
@return HR_Job_ID */
public int getHR_Job_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_HR_Job_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="e6321a58-94f5-4450-9690-0857835409d8")
public static String es_PE_COLUMN_HR_Job_ID_Name="HR_Job_ID";

@XendraColumn(AD_Element_ID="1c2e67d4-c857-4514-908a-4b5c69d29cb0",ColumnName="HR_Job_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e6321a58-94f5-4450-9690-0857835409d8",
Synchronized="2017-08-05 16:54:48.0")
/** Column name HR_Job_ID */
public static final String COLUMNNAME_HR_Job_ID = "HR_Job_ID";
/** Set HR_Payroll_ID.
@param HR_Payroll_ID HR_Payroll_ID */
public void setHR_Payroll_ID (int HR_Payroll_ID)
{
if (HR_Payroll_ID <= 0) set_Value (COLUMNNAME_HR_Payroll_ID, null);
 else 
set_Value (COLUMNNAME_HR_Payroll_ID, Integer.valueOf(HR_Payroll_ID));
}
/** Get HR_Payroll_ID.
@return HR_Payroll_ID */
public int getHR_Payroll_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_HR_Payroll_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="4c3c9ba5-4ccf-46ae-a5c5-918d22995082")
public static String es_PE_COLUMN_HR_Payroll_ID_Name="HR_Payroll_ID";

@XendraColumn(AD_Element_ID="7e583833-168b-49d6-84d9-137ec0c40d00",ColumnName="HR_Payroll_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4c3c9ba5-4ccf-46ae-a5c5-918d22995082",
Synchronized="2017-08-05 16:54:48.0")
/** Column name HR_Payroll_ID */
public static final String COLUMNNAME_HR_Payroll_ID = "HR_Payroll_ID";
/** Set Payroll Period.
@param HR_Period_ID Payroll Period */
public void setHR_Period_ID (int HR_Period_ID)
{
if (HR_Period_ID <= 0) set_Value (COLUMNNAME_HR_Period_ID, null);
 else 
set_Value (COLUMNNAME_HR_Period_ID, Integer.valueOf(HR_Period_ID));
}
/** Get Payroll Period.
@return Payroll Period */
public int getHR_Period_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_HR_Period_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="c2f184cd-c6b1-46e7-ab55-a7eebfef7246")
public static String es_PE_COLUMN_HR_Period_ID_Name="Payroll Period";

@XendraColumn(AD_Element_ID="e75ae9a3-701a-442a-847a-5e1887efaf12",ColumnName="HR_Period_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c2f184cd-c6b1-46e7-ab55-a7eebfef7246",
Synchronized="2017-08-05 16:54:48.0")
/** Column name HR_Period_ID */
public static final String COLUMNNAME_HR_Period_ID = "HR_Period_ID";
/** Set HR_Process_ID.
@param HR_Process_ID HR_Process_ID */
public void setHR_Process_ID (int HR_Process_ID)
{
if (HR_Process_ID <= 0) set_Value (COLUMNNAME_HR_Process_ID, null);
 else 
set_Value (COLUMNNAME_HR_Process_ID, Integer.valueOf(HR_Process_ID));
}
/** Get HR_Process_ID.
@return HR_Process_ID */
public int getHR_Process_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_HR_Process_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="0a420dd9-ed05-488a-b330-17a9a120046b")
public static String es_PE_COLUMN_HR_Process_ID_Name="HR_Process_ID";

@XendraColumn(AD_Element_ID="114b5b74-200c-4ddd-b2ca-48b8cf7ff0e6",ColumnName="HR_Process_ID",
AD_Reference_ID=13,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0a420dd9-ed05-488a-b330-17a9a120046b",
Synchronized="2017-08-05 16:54:48.0")
/** Column name HR_Process_ID */
public static final String COLUMNNAME_HR_Process_ID = "HR_Process_ID";
/** Set HR_process_UU.
@param HR_process_UU HR_process_UU */
public void setHR_process_UU (String HR_process_UU)
{
if (HR_process_UU != null && HR_process_UU.length() > 36)
{
log.warning("Length > 36 - truncated");
HR_process_UU = HR_process_UU.substring(0,35);
}
set_Value (COLUMNNAME_HR_process_UU, HR_process_UU);
}
/** Get HR_process_UU.
@return HR_process_UU */
public String getHR_process_UU() 
{
String value = (String)get_Value(COLUMNNAME_HR_process_UU);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="8d4fe2c5-66be-4d1b-952c-64c4b9a5523a")
public static String es_PE_COLUMN_HR_process_UU_Name="hr_process_uu";

@XendraColumn(AD_Element_ID="04a6a62d-86ad-4822-87ef-b6c55314d36d",ColumnName="HR_process_UU",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8d4fe2c5-66be-4d1b-952c-64c4b9a5523a",
Synchronized="2017-08-05 16:54:48.0")
/** Column name HR_process_UU */
public static final String COLUMNNAME_HR_process_UU = "HR_process_UU";
/** Set Name.
@param Name Alphanumeric identifier of the entity */
public void setName (String Name)
{
if (Name != null && Name.length() > 60)
{
log.warning("Length > 60 - truncated");
Name = Name.substring(0,59);
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
@XendraTrl(Identifier="90c81e72-c337-47f7-b8ba-9e6ccefcfa7d")
public static String es_PE_COLUMN_Name_Name="Name";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="90c81e72-c337-47f7-b8ba-9e6ccefcfa7d",
Synchronized="2017-08-05 16:54:48.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
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

@XendraTrl(Identifier="e10cb322-4352-4950-bbc1-39c369a52718")
public static String es_PE_COLUMN_Posted_Name="Posted";

@XendraColumn(AD_Element_ID="5eb52ebc-6992-12f5-b85a-e0a136df259b",ColumnName="Posted",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e10cb322-4352-4950-bbc1-39c369a52718",
Synchronized="2017-08-05 16:54:48.0")
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

@XendraTrl(Identifier="4722530c-b9a3-4a51-ab38-fae230ba4228")
public static String es_PE_COLUMN_Processed_Name="Processed";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4722530c-b9a3-4a51-ab38-fae230ba4228",
Synchronized="2017-08-05 16:54:48.0")
/** Column name Processed */
public static final String COLUMNNAME_Processed = "Processed";
/** Set processedon.
@param processedon processedon */
public void setprocessedon (int processedon)
{
set_Value (COLUMNNAME_processedon, Integer.valueOf(processedon));
}
/** Get processedon.
@return processedon */
public int getprocessedon() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_processedon);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="36d10aef-ef2c-459c-830c-a5d9b04fc5f4")
public static String es_PE_COLUMN_processedon_Name="processedon";

@XendraColumn(AD_Element_ID="83f920c0-b8b5-43b8-92a9-a4b465af49a1",ColumnName="processedon",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="36d10aef-ef2c-459c-830c-a5d9b04fc5f4",
Synchronized="2017-08-05 16:54:48.0")
/** Column name processedon */
public static final String COLUMNNAME_processedon = "processedon";
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

@XendraTrl(Identifier="05532171-df68-45f9-8d11-5ba70a1a5b5d")
public static String es_PE_COLUMN_Processing_Name="Process Now";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="05532171-df68-45f9-8d11-5ba70a1a5b5d",
Synchronized="2017-08-05 16:54:48.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
/** Set Reversal_Id.
@param Reversal_Id Reversal_Id */
public void setReversal_Id (int Reversal_Id)
{
set_Value (COLUMNNAME_Reversal_Id, Integer.valueOf(Reversal_Id));
}
/** Get Reversal_Id.
@return Reversal_Id */
public int getReversal_Id() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Reversal_Id);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ac70cb2e-15fb-4d4f-b18f-cb5273c0bbbc")
public static String es_PE_COLUMN_Reversal_Id_Name="Reversal_Id";

@XendraColumn(AD_Element_ID="072b6a3c-1389-3168-b586-752d0874e508",ColumnName="Reversal_Id",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ac70cb2e-15fb-4d4f-b18f-cb5273c0bbbc",
Synchronized="2017-08-05 16:54:48.0")
/** Column name Reversal_Id */
public static final String COLUMNNAME_Reversal_Id = "Reversal_Id";
}
