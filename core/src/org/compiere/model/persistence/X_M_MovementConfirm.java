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
/** Generated Model for M_MovementConfirm
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_MovementConfirm extends PO
{
/** Standard Constructor
@param ctx context
@param M_MovementConfirm_ID id
@param trxName transaction
*/
public X_M_MovementConfirm (Properties ctx, int M_MovementConfirm_ID, String trxName)
{
super (ctx, M_MovementConfirm_ID, trxName);
/** if (M_MovementConfirm_ID == 0)
{
setDocAction (null);
setDocStatus (null);
setDocumentNo (null);
setIsApproved (false);	
// N
setM_MovementConfirm_ID (0);
setM_Movement_ID (0);
setProcessed (false);	
// N
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_M_MovementConfirm (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=738 */
public static int Table_ID=MTable.getTable_ID("M_MovementConfirm");

@XendraTrl(Identifier="edd7ca29-fd1f-c1e4-bc28-83f1c8fedb2d")
public static String es_PE_TAB_Confirmation_Description="Confirme los Movimientos del Inventario";

@XendraTrl(Identifier="edd7ca29-fd1f-c1e4-bc28-83f1c8fedb2d")
public static String es_PE_TAB_Confirmation_Name="Confirmación";

@XendraTrl(Identifier="edd7ca29-fd1f-c1e4-bc28-83f1c8fedb2d")
public static String es_PE_TAB_Confirmation_Help="El documento es creado automáticamente cuando el tipo de documento del movimiento indica en tránsito.";

@XendraTab(Name="Confirmation",Description="Confirm Inventory Moves",
Help="The document is automatically created when the document type of the movement indicates In Transit.",
AD_Window_ID="2d3ecb03-6da6-cacc-a299-b3fab0fb6a3c",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="edd7ca29-fd1f-c1e4-bc28-83f1c8fedb2d",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Confirmation="edd7ca29-fd1f-c1e4-bc28-83f1c8fedb2d";

@XendraTrl(Identifier="1502876a-ae99-0acb-8695-41e0f79f2a14")
public static String es_PE_TABLE_M_MovementConfirm_Name="Confirma Movimiento";

@XendraTable(Name="Move Confirm",Description="Inventory Move Confirmation",Help="",
TableName="M_MovementConfirm",AccessLevel="1",AD_Window_ID="2d3ecb03-6da6-cacc-a299-b3fab0fb6a3c",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=140,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.material",
Identifier="1502876a-ae99-0acb-8695-41e0f79f2a14",Synchronized="2017-08-16 11:43:21.0")
/** TableName=M_MovementConfirm */
public static final String Table_Name="M_MovementConfirm";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_MovementConfirm");

protected BigDecimal accessLevel = BigDecimal.valueOf(1);
/** AccessLevel
@return 1 - Org 
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
    Table_ID = MTable.getTable_ID("M_MovementConfirm");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_MovementConfirm[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Approval Amount.
@param ApprovalAmt Document Approval Amount */
public void setApprovalAmt (BigDecimal ApprovalAmt)
{
set_Value (COLUMNNAME_ApprovalAmt, ApprovalAmt);
}
/** Get Approval Amount.
@return Document Approval Amount */
public BigDecimal getApprovalAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_ApprovalAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="79e694e7-c644-649d-3fad-833cbca412dc")
public static String es_PE_FIELD_Confirmation_ApprovalAmount_Description="Documento de importe aprobado";

@XendraTrl(Identifier="79e694e7-c644-649d-3fad-833cbca412dc")
public static String es_PE_FIELD_Confirmation_ApprovalAmount_Help="Cantidad de la aprobación para el Flujo de trabajo";

@XendraTrl(Identifier="79e694e7-c644-649d-3fad-833cbca412dc")
public static String es_PE_FIELD_Confirmation_ApprovalAmount_Name="Importe Aprobado";

@XendraField(AD_Column_ID="ApprovalAmt",IsCentrallyMaintained=true,
AD_Tab_ID="edd7ca29-fd1f-c1e4-bc28-83f1c8fedb2d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=70,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="79e694e7-c644-649d-3fad-833cbca412dc")
public static final String FIELDNAME_Confirmation_ApprovalAmount="79e694e7-c644-649d-3fad-833cbca412dc";

@XendraTrl(Identifier="a582be74-ad27-9c0e-9c80-e851e9f8386d")
public static String es_PE_COLUMN_ApprovalAmt_Name="Importe Aprobado";

@XendraColumn(AD_Element_ID="fd13a366-3264-4b86-b3f3-66490833103d",ColumnName="ApprovalAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a582be74-ad27-9c0e-9c80-e851e9f8386d",
Synchronized="2017-08-05 16:55:16.0")
/** Column name ApprovalAmt */
public static final String COLUMNNAME_ApprovalAmt = "ApprovalAmt";
/** Set Description.
@param Description Optional short DESCRIPTION of the record */
public void setDescription (String Description)
{
if (Description != null && Description.length() > 255)
{
log.warning("Length > 255 - truncated");
Description = Description.substring(0,254);
}
set_Value (COLUMNNAME_Description, Description);
}
/** Get Description.
@return Optional short DESCRIPTION of the record */
public String getDescription() 
{
String value = (String)get_Value(COLUMNNAME_Description);
if (value == null)
  return "";
if (value.contains("\""))
  value = value.replaceAll("\"","'");
if (value.contains("\n"))
  value = value.replaceAll("\n"," ");
if (value.contains(";"))
  value = value.replaceAll(";",":");
return value;
}

@XendraTrl(Identifier="de75ae80-8779-8730-40b2-1cb8b9cc3cca")
public static String es_PE_FIELD_Confirmation_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="de75ae80-8779-8730-40b2-1cb8b9cc3cca")
public static String es_PE_FIELD_Confirmation_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="de75ae80-8779-8730-40b2-1cb8b9cc3cca")
public static String es_PE_FIELD_Confirmation_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="edd7ca29-fd1f-c1e4-bc28-83f1c8fedb2d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="de75ae80-8779-8730-40b2-1cb8b9cc3cca")
public static final String FIELDNAME_Confirmation_Description="de75ae80-8779-8730-40b2-1cb8b9cc3cca";

@XendraTrl(Identifier="f7ceb1ba-7cd6-d3c0-0828-43c0cd7a720f")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=true,ColumnSQL="",
IsAllowLogging=false,Identifier="f7ceb1ba-7cd6-d3c0-0828-43c0cd7a720f",
Synchronized="2017-08-05 16:55:16.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";

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

@XendraTrl(Identifier="e433b323-71c6-749c-f74c-5eb25a689e8f")
public static String es_PE_FIELD_Confirmation_ProcessConfirmation_Description="Confirmación de proceso del Movimiento de Inventario";

@XendraTrl(Identifier="e433b323-71c6-749c-f74c-5eb25a689e8f")
public static String es_PE_FIELD_Confirmation_ProcessConfirmation_Name="Procesa Confirmación";

@XendraField(AD_Column_ID="DocAction",IsCentrallyMaintained=true,
AD_Tab_ID="edd7ca29-fd1f-c1e4-bc28-83f1c8fedb2d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e433b323-71c6-749c-f74c-5eb25a689e8f")
public static final String FIELDNAME_Confirmation_ProcessConfirmation="e433b323-71c6-749c-f74c-5eb25a689e8f";

@XendraTrl(Identifier="880790cd-561e-4445-819a-551efae694c1")
public static String es_PE_COLUMN_DocAction_Name="Acción en el Documento";

@XendraColumn(AD_Element_ID="d4b9075b-18e5-ebbb-5565-d217a7e531cb",ColumnName="DocAction",
AD_Reference_ID=28,AD_Reference_Value_ID="e397c9b0-c643-d1cd-8380-20bee13b2a6e",AD_Val_Rule_ID="",
FieldLength=2,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,
AD_Process_ID="78a82872-1cf9-8407-cbcc-437f59c5b9f4",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="880790cd-561e-4445-819a-551efae694c1",
Synchronized="2017-08-05 16:55:16.0")
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

@XendraTrl(Identifier="14b1be61-b1d2-120c-5d12-790ce4976444")
public static String es_PE_FIELD_Confirmation_DocumentStatus_Description="El estado actual del documento";

@XendraTrl(Identifier="14b1be61-b1d2-120c-5d12-790ce4976444")
public static String es_PE_FIELD_Confirmation_DocumentStatus_Help="El estado del documento indica el estado del documento en este momento. Si usted quiere cambiar el estado de Documento; use el campo acción de documento";

@XendraTrl(Identifier="14b1be61-b1d2-120c-5d12-790ce4976444")
public static String es_PE_FIELD_Confirmation_DocumentStatus_Name="Estado del Documento";

@XendraField(AD_Column_ID="DocStatus",IsCentrallyMaintained=true,
AD_Tab_ID="edd7ca29-fd1f-c1e4-bc28-83f1c8fedb2d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="14b1be61-b1d2-120c-5d12-790ce4976444")
public static final String FIELDNAME_Confirmation_DocumentStatus="14b1be61-b1d2-120c-5d12-790ce4976444";

@XendraTrl(Identifier="f3e30b83-c3cc-3f50-b742-38a980018709")
public static String es_PE_COLUMN_DocStatus_Name="Estado del Documento";

@XendraColumn(AD_Element_ID="e73fa537-3438-bd01-dfd4-f0f080a28c55",ColumnName="DocStatus",
AD_Reference_ID=17,AD_Reference_Value_ID="7627125d-fefe-e6bc-bb7d-4a6c772172dc",AD_Val_Rule_ID="",
FieldLength=2,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="f3e30b83-c3cc-3f50-b742-38a980018709",Synchronized="2017-08-05 16:55:16.0")
/** Column name DocStatus */
public static final String COLUMNNAME_DocStatus = "DocStatus";
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
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), getDocumentNo());
}

@XendraTrl(Identifier="0ad74b70-ed5f-13bd-5866-e94752afd4fd")
public static String es_PE_FIELD_Confirmation_DocumentNo_Description="Número de secuencia del documento para cada documento";

@XendraTrl(Identifier="0ad74b70-ed5f-13bd-5866-e94752afd4fd")
public static String es_PE_FIELD_Confirmation_DocumentNo_Help="El número del documento es usualmente generado en automático por el sistema y determinado por el tipo del documento. Si el documento no se salva; el número preliminar se despliega entre \"<>\"";

@XendraTrl(Identifier="0ad74b70-ed5f-13bd-5866-e94752afd4fd")
public static String es_PE_FIELD_Confirmation_DocumentNo_Name="No. del Documento";

@XendraField(AD_Column_ID="DocumentNo",IsCentrallyMaintained=true,
AD_Tab_ID="edd7ca29-fd1f-c1e4-bc28-83f1c8fedb2d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=30,SortNo=-1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0ad74b70-ed5f-13bd-5866-e94752afd4fd")
public static final String FIELDNAME_Confirmation_DocumentNo="0ad74b70-ed5f-13bd-5866-e94752afd4fd";

@XendraTrl(Identifier="4fc8c6c0-da39-fc78-4d43-35e3d967d180")
public static String es_PE_COLUMN_DocumentNo_Name="No. del Documento";

@XendraColumn(AD_Element_ID="e3ca6e28-702a-2722-d941-b2072a0de9cb",ColumnName="DocumentNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4fc8c6c0-da39-fc78-4d43-35e3d967d180",
Synchronized="2017-08-05 16:55:16.0")
/** Column name DocumentNo */
public static final String COLUMNNAME_DocumentNo = "DocumentNo";
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
@XendraTrl(Identifier="03b33635-c7f8-490a-8dd1-c795e48606ef")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="03b33635-c7f8-490a-8dd1-c795e48606ef",
Synchronized="2017-08-05 16:55:16.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Approved.
@param IsApproved Indicates if this document requires approval */
public void setIsApproved (boolean IsApproved)
{
set_Value (COLUMNNAME_IsApproved, Boolean.valueOf(IsApproved));
}
/** Get Approved.
@return Indicates if this document requires approval */
public boolean isApproved() 
{
Object oo = get_Value(COLUMNNAME_IsApproved);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="226d1652-47ab-2515-29af-197591aadbe3")
public static String es_PE_FIELD_Confirmation_Approved_Description="Indica si este documento requiere aprobación";

@XendraTrl(Identifier="226d1652-47ab-2515-29af-197591aadbe3")
public static String es_PE_FIELD_Confirmation_Approved_Help="El Cuadro de Verificación  Aprobado indica si este documento requiere aprobación antes de que pueda ser procesado";

@XendraTrl(Identifier="226d1652-47ab-2515-29af-197591aadbe3")
public static String es_PE_FIELD_Confirmation_Approved_Name="Aprobación";

@XendraField(AD_Column_ID="IsApproved",IsCentrallyMaintained=true,
AD_Tab_ID="edd7ca29-fd1f-c1e4-bc28-83f1c8fedb2d",AD_FieldGroup_ID="Status",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=60,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="226d1652-47ab-2515-29af-197591aadbe3")
public static final String FIELDNAME_Confirmation_Approved="226d1652-47ab-2515-29af-197591aadbe3";

@XendraTrl(Identifier="fabdb728-5a01-f1d8-e404-575a1a8fee28")
public static String es_PE_COLUMN_IsApproved_Name="Aprobación";

@XendraColumn(AD_Element_ID="44388d99-07b7-b005-9e16-78884800beff",ColumnName="IsApproved",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fabdb728-5a01-f1d8-e404-575a1a8fee28",
Synchronized="2017-08-05 16:55:16.0")
/** Column name IsApproved */
public static final String COLUMNNAME_IsApproved = "IsApproved";
/** Set Phys.Inventory.
@param M_Inventory_ID Parameters for a Physical Inventory */
public void setM_Inventory_ID (int M_Inventory_ID)
{
if (M_Inventory_ID <= 0) set_Value (COLUMNNAME_M_Inventory_ID, null);
 else 
set_Value (COLUMNNAME_M_Inventory_ID, Integer.valueOf(M_Inventory_ID));
}
/** Get Phys.Inventory.
@return Parameters for a Physical Inventory */
public int getM_Inventory_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Inventory_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="db7aa6d8-4dd7-7277-b096-45cf546db8d7")
public static String es_PE_FIELD_Confirmation_PhysInventory_Description="Parámetros para el inventario físico.";

@XendraTrl(Identifier="db7aa6d8-4dd7-7277-b096-45cf546db8d7")
public static String es_PE_FIELD_Confirmation_PhysInventory_Help="El inventario físico indica parámetros únicos para el inventario físico.";

@XendraTrl(Identifier="db7aa6d8-4dd7-7277-b096-45cf546db8d7")
public static String es_PE_FIELD_Confirmation_PhysInventory_Name="Inventario Físico";

@XendraField(AD_Column_ID="M_Inventory_ID",IsCentrallyMaintained=true,
AD_Tab_ID="edd7ca29-fd1f-c1e4-bc28-83f1c8fedb2d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@Processed@=Y",DisplayLength=26,IsReadOnly=true,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="db7aa6d8-4dd7-7277-b096-45cf546db8d7")
public static final String FIELDNAME_Confirmation_PhysInventory="db7aa6d8-4dd7-7277-b096-45cf546db8d7";

@XendraTrl(Identifier="d9a9f875-a775-c4cf-7562-14dde34a7e73")
public static String es_PE_COLUMN_M_Inventory_ID_Name="Inventario Físico";

@XendraColumn(AD_Element_ID="0e8f85f3-fbb2-f347-b412-2f2218e14665",ColumnName="M_Inventory_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d9a9f875-a775-c4cf-7562-14dde34a7e73",
Synchronized="2017-08-05 16:55:16.0")
/** Column name M_Inventory_ID */
public static final String COLUMNNAME_M_Inventory_ID = "M_Inventory_ID";
/** Set Move Confirm.
@param M_MovementConfirm_ID Inventory Move Confirmation */
public void setM_MovementConfirm_ID (int M_MovementConfirm_ID)
{
if (M_MovementConfirm_ID < 1) throw new IllegalArgumentException ("M_MovementConfirm_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_MovementConfirm_ID, Integer.valueOf(M_MovementConfirm_ID));
}
/** Get Move Confirm.
@return Inventory Move Confirmation */
public int getM_MovementConfirm_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_MovementConfirm_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="c1833130-7a88-f27f-30b6-1258d471e29d")
public static String es_PE_FIELD_Confirmation_MoveConfirm_Description="Confirmación de Movimientos de Inventario";

@XendraTrl(Identifier="c1833130-7a88-f27f-30b6-1258d471e29d")
public static String es_PE_FIELD_Confirmation_MoveConfirm_Help="El documento se crea automáticamente cuando el tipo del documento del movimiento indica en tránsito.";

@XendraTrl(Identifier="c1833130-7a88-f27f-30b6-1258d471e29d")
public static String es_PE_FIELD_Confirmation_MoveConfirm_Name="Confirma Movimiento";

@XendraField(AD_Column_ID="M_MovementConfirm_ID",IsCentrallyMaintained=true,
AD_Tab_ID="edd7ca29-fd1f-c1e4-bc28-83f1c8fedb2d",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c1833130-7a88-f27f-30b6-1258d471e29d")
public static final String FIELDNAME_Confirmation_MoveConfirm="c1833130-7a88-f27f-30b6-1258d471e29d";
/** Column name M_MovementConfirm_ID */
public static final String COLUMNNAME_M_MovementConfirm_ID = "M_MovementConfirm_ID";
/** Set Inventory Move.
@param M_Movement_ID Movement of Inventory */
public void setM_Movement_ID (int M_Movement_ID)
{
if (M_Movement_ID < 1) throw new IllegalArgumentException ("M_Movement_ID is mandatory.");
set_Value (COLUMNNAME_M_Movement_ID, Integer.valueOf(M_Movement_ID));
}
/** Get Inventory Move.
@return Movement of Inventory */
public int getM_Movement_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Movement_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="dbf90d28-f6a3-b65a-c5ed-3a738b5a6315")
public static String es_PE_FIELD_Confirmation_InventoryMove_Description="Movimiento de inventario";

@XendraTrl(Identifier="dbf90d28-f6a3-b65a-c5ed-3a738b5a6315")
public static String es_PE_FIELD_Confirmation_InventoryMove_Help="El Movimiento de Inventario identifica únicamente un grupo de líneas de movimiento";

@XendraTrl(Identifier="dbf90d28-f6a3-b65a-c5ed-3a738b5a6315")
public static String es_PE_FIELD_Confirmation_InventoryMove_Name="Movimiento";

@XendraField(AD_Column_ID="M_Movement_ID",IsCentrallyMaintained=true,
AD_Tab_ID="edd7ca29-fd1f-c1e4-bc28-83f1c8fedb2d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="dbf90d28-f6a3-b65a-c5ed-3a738b5a6315")
public static final String FIELDNAME_Confirmation_InventoryMove="dbf90d28-f6a3-b65a-c5ed-3a738b5a6315";

@XendraTrl(Identifier="c78dc9ad-87be-4d23-eafa-bd7c1c35bb7e")
public static String es_PE_COLUMN_M_Movement_ID_Name="Movimiento";

@XendraColumn(AD_Element_ID="38464e21-16a7-4ca4-2d20-bfa901cb61fb",ColumnName="M_Movement_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c78dc9ad-87be-4d23-eafa-bd7c1c35bb7e",
Synchronized="2017-08-05 16:55:17.0")
/** Column name M_Movement_ID */
public static final String COLUMNNAME_M_Movement_ID = "M_Movement_ID";
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

@XendraTrl(Identifier="40778cdf-97ab-744f-3db5-5171659fb91a")
public static String es_PE_FIELD_Confirmation_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="40778cdf-97ab-744f-3db5-5171659fb91a")
public static String es_PE_FIELD_Confirmation_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraTrl(Identifier="40778cdf-97ab-744f-3db5-5171659fb91a")
public static String es_PE_FIELD_Confirmation_Processed_Name="Procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="edd7ca29-fd1f-c1e4-bc28-83f1c8fedb2d",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="40778cdf-97ab-744f-3db5-5171659fb91a")
public static final String FIELDNAME_Confirmation_Processed="40778cdf-97ab-744f-3db5-5171659fb91a";

@XendraTrl(Identifier="4205994b-bc54-d2df-343c-011d552a677a")
public static String es_PE_COLUMN_Processed_Name="Procesado";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4205994b-bc54-d2df-343c-011d552a677a",
Synchronized="2017-08-05 16:55:17.0")
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

@XendraTrl(Identifier="feb0cc48-dc89-83a6-f7f4-6c683a50c253")
public static String es_PE_FIELD_Confirmation_ProcessNow_Name="Procesar Ahora";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="edd7ca29-fd1f-c1e4-bc28-83f1c8fedb2d",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="feb0cc48-dc89-83a6-f7f4-6c683a50c253")
public static final String FIELDNAME_Confirmation_ProcessNow="feb0cc48-dc89-83a6-f7f4-6c683a50c253";

@XendraTrl(Identifier="51be39f3-7948-f104-5723-8b60ace7da25")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="51be39f3-7948-f104-5723-8b60ace7da25",
Synchronized="2017-08-05 16:55:17.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
}
