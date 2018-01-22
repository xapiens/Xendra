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
import org.compiere.model.reference.REF_M_InOutConfirmType;
import org.compiere.model.reference.REF__DocumentAction;
import org.compiere.model.reference.REF__DocumentStatus;
/** Generated Model for M_InOutConfirm
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_InOutConfirm extends PO
{
/** Standard Constructor
@param ctx context
@param M_InOutConfirm_ID id
@param trxName transaction
*/
public X_M_InOutConfirm (Properties ctx, int M_InOutConfirm_ID, String trxName)
{
super (ctx, M_InOutConfirm_ID, trxName);
/** if (M_InOutConfirm_ID == 0)
{
setConfirmType (null);
setDocAction (null);	
// CO
setDocStatus (null);	
// DR
setDocumentNo (null);
setIsApproved (false);	
// N
setIsCancelled (false);	
// N
setIsInDispute (false);	
// N
setM_InOutConfirm_ID (0);
setM_InOut_ID (0);
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
public X_M_InOutConfirm (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=727 */
public static int Table_ID=MTable.getTable_ID("M_InOutConfirm");

@XendraTrl(Identifier="0f70d6b2-b0e2-1872-4234-7e2b593e2c67")
public static String es_PE_TAB_Confirmation_Description="Confirmación Entrega ó Recibo de Material ";

@XendraTrl(Identifier="0f70d6b2-b0e2-1872-4234-7e2b593e2c67")
public static String es_PE_TAB_Confirmation_Name="Confirmación";

@XendraTrl(Identifier="0f70d6b2-b0e2-1872-4234-7e2b593e2c67")
public static String es_PE_TAB_Confirmation_Help="Confirmación de entrega ó recibo - Creado por una entrega/Recibo ";

@XendraTab(Name="Confirmation",Description="Material Shipment or Receipt Confirmation",
Help="Confirmation of Shipment or Receipt - Created from the Shipment/Receipt",
AD_Window_ID="28bd308b-927c-348b-3c82-31e192b65c0b",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",
AD_Process_ID="a625cbde-1c28-65d3-62c1-71c8e423c425",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="0f70d6b2-b0e2-1872-4234-7e2b593e2c67",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Confirmation="0f70d6b2-b0e2-1872-4234-7e2b593e2c67";

@XendraTrl(Identifier="5bbc9fa9-e093-8899-9451-5ed6c0ae1f51")
public static String es_PE_TABLE_M_InOutConfirm_Name="Confirmación entrega/Recibo";

@XendraTable(Name="Ship/Receipt Confirmation",
Description="Material Shipment or Receipt Confirmation",Help="",TableName="M_InOutConfirm",
AccessLevel="1",AD_Window_ID="28bd308b-927c-348b-3c82-31e192b65c0b",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=135,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.material",
Identifier="5bbc9fa9-e093-8899-9451-5ed6c0ae1f51",Synchronized="2017-08-16 11:43:14.0")
/** TableName=M_InOutConfirm */
public static final String Table_Name="M_InOutConfirm";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_InOutConfirm");

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
    Table_ID = MTable.getTable_ID("M_InOutConfirm");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_InOutConfirm[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="11afac25-feed-0ad8-2d6a-d5555014808f")
public static String es_PE_FIELD_Confirmation_ApprovalAmount_Description="Documento de importe aprobado";

@XendraTrl(Identifier="11afac25-feed-0ad8-2d6a-d5555014808f")
public static String es_PE_FIELD_Confirmation_ApprovalAmount_Help="Cantidad de la aprobación para el Flujo de trabajo";

@XendraTrl(Identifier="11afac25-feed-0ad8-2d6a-d5555014808f")
public static String es_PE_FIELD_Confirmation_ApprovalAmount_Name="Importe Aprobado";

@XendraField(AD_Column_ID="ApprovalAmt",IsCentrallyMaintained=true,
AD_Tab_ID="0f70d6b2-b0e2-1872-4234-7e2b593e2c67",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=90,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="11afac25-feed-0ad8-2d6a-d5555014808f")
public static final String FIELDNAME_Confirmation_ApprovalAmount="11afac25-feed-0ad8-2d6a-d5555014808f";

@XendraTrl(Identifier="4e70d2d7-3401-e400-159a-a59ddde75239")
public static String es_PE_COLUMN_ApprovalAmt_Name="Importe Aprobado";

@XendraColumn(AD_Element_ID="fd13a366-3264-4b86-b3f3-66490833103d",ColumnName="ApprovalAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4e70d2d7-3401-e400-159a-a59ddde75239",
Synchronized="2017-08-05 16:55:09.0")
/** Column name ApprovalAmt */
public static final String COLUMNNAME_ApprovalAmt = "ApprovalAmt";
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

@XendraTrl(Identifier="4d2847bd-b9ad-56c5-b9b1-bee6e42ff475")
public static String es_PE_FIELD_Confirmation_Invoice_Description="Identificador de la factura";

@XendraTrl(Identifier="4d2847bd-b9ad-56c5-b9b1-bee6e42ff475")
public static String es_PE_FIELD_Confirmation_Invoice_Help="La ID de Factura identifica únicamente un documento de Factura.";

@XendraTrl(Identifier="4d2847bd-b9ad-56c5-b9b1-bee6e42ff475")
public static String es_PE_FIELD_Confirmation_Invoice_Name="Factura";

@XendraField(AD_Column_ID="C_Invoice_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0f70d6b2-b0e2-1872-4234-7e2b593e2c67",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@Processed@=Y",DisplayLength=26,IsReadOnly=true,SeqNo=150,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4d2847bd-b9ad-56c5-b9b1-bee6e42ff475")
public static final String FIELDNAME_Confirmation_Invoice="4d2847bd-b9ad-56c5-b9b1-bee6e42ff475";

@XendraTrl(Identifier="4a50d71a-96d1-8ec3-a993-e62a7a11501b")
public static String es_PE_COLUMN_C_Invoice_ID_Name="Factura";

@XendraColumn(AD_Element_ID="e526ea57-1bdf-9871-fd57-0df3c1f9dd42",ColumnName="C_Invoice_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4a50d71a-96d1-8ec3-a993-e62a7a11501b",
Synchronized="2017-08-05 16:55:09.0")
/** Column name C_Invoice_ID */
public static final String COLUMNNAME_C_Invoice_ID = "C_Invoice_ID";
/** Set Confirmation No.
@param ConfirmationNo Confirmation Number */
public void setConfirmationNo (String ConfirmationNo)
{
if (ConfirmationNo != null && ConfirmationNo.length() > 20)
{
log.warning("Length > 20 - truncated");
ConfirmationNo = ConfirmationNo.substring(0,19);
}
set_Value (COLUMNNAME_ConfirmationNo, ConfirmationNo);
}
/** Get Confirmation No.
@return Confirmation Number */
public String getConfirmationNo() 
{
String value = (String)get_Value(COLUMNNAME_ConfirmationNo);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="780a346f-c9c2-5319-55de-81556e19addf")
public static String es_PE_FIELD_Confirmation_ConfirmationNo_Description="Número de confirmación";

@XendraTrl(Identifier="780a346f-c9c2-5319-55de-81556e19addf")
public static String es_PE_FIELD_Confirmation_ConfirmationNo_Name="No. de Confirmación";

@XendraField(AD_Column_ID="ConfirmationNo",IsCentrallyMaintained=true,
AD_Tab_ID="0f70d6b2-b0e2-1872-4234-7e2b593e2c67",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="780a346f-c9c2-5319-55de-81556e19addf")
public static final String FIELDNAME_Confirmation_ConfirmationNo="780a346f-c9c2-5319-55de-81556e19addf";

@XendraTrl(Identifier="29433fd5-5a63-8356-7d36-8f9bf8c42341")
public static String es_PE_COLUMN_ConfirmationNo_Name="No. de Confirmación";

@XendraColumn(AD_Element_ID="d976e121-1e1b-2d2d-2125-7fa5bf911c19",ColumnName="ConfirmationNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="29433fd5-5a63-8356-7d36-8f9bf8c42341",
Synchronized="2017-08-05 16:55:09.0")
/** Column name ConfirmationNo */
public static final String COLUMNNAME_ConfirmationNo = "ConfirmationNo";

/** ConfirmType AD_Reference=0239f238-ee4d-c963-02f8-4aa1460f1694 */
public static final int CONFIRMTYPE_AD_Reference_ID=320;
/** Set Confirmation Type.
@param ConfirmType Type of confirmation */
public void setConfirmType (String ConfirmType)
{
if (ConfirmType == null) throw new IllegalArgumentException ("ConfirmType is mandatory");
if (ConfirmType.equals(REF_M_InOutConfirmType.VendorConfirmation) || ConfirmType.equals(REF_M_InOutConfirmType.CustomerConfirmation) || ConfirmType.equals(REF_M_InOutConfirmType.DropShipConfirm) || ConfirmType.equals(REF_M_InOutConfirmType.ShipReceiptConfirm) || ConfirmType.equals(REF_M_InOutConfirmType.PickQAConfirm));
 else throw new IllegalArgumentException ("ConfirmType Invalid value - " + ConfirmType + " - Reference_ID=320 - XV - XC - DS - SC - PC");
if (ConfirmType.length() > 2)
{
log.warning("Length > 2 - truncated");
ConfirmType = ConfirmType.substring(0,1);
}
set_Value (COLUMNNAME_ConfirmType, ConfirmType);
}
/** Get Confirmation Type.
@return Type of confirmation */
public String getConfirmType() 
{
return (String)get_Value(COLUMNNAME_ConfirmType);
}

@XendraTrl(Identifier="2d9a9004-1ffe-58d9-bc96-7f31fa187dcd")
public static String es_PE_FIELD_Confirmation_ConfirmationType_Description="Tipo de Confirmación";

@XendraTrl(Identifier="2d9a9004-1ffe-58d9-bc96-7f31fa187dcd")
public static String es_PE_FIELD_Confirmation_ConfirmationType_Name="Tipo de Confirmación";

@XendraField(AD_Column_ID="ConfirmType",IsCentrallyMaintained=true,
AD_Tab_ID="0f70d6b2-b0e2-1872-4234-7e2b593e2c67",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=60,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2d9a9004-1ffe-58d9-bc96-7f31fa187dcd")
public static final String FIELDNAME_Confirmation_ConfirmationType="2d9a9004-1ffe-58d9-bc96-7f31fa187dcd";

@XendraTrl(Identifier="87ec6e2d-b855-387c-ca85-69f6e7e18c11")
public static String es_PE_COLUMN_ConfirmType_Name="Tipo de Confirmación";

@XendraColumn(AD_Element_ID="85b938d6-0d0d-9b12-c29f-d8e540108b6e",ColumnName="ConfirmType",
AD_Reference_ID=17,AD_Reference_Value_ID="0239f238-ee4d-c963-02f8-4aa1460f1694",AD_Val_Rule_ID="",
FieldLength=2,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="87ec6e2d-b855-387c-ca85-69f6e7e18c11",Synchronized="2017-08-05 16:55:09.0")
/** Column name ConfirmType */
public static final String COLUMNNAME_ConfirmType = "ConfirmType";
/** Set Create Package.
@param CreatePackage Create Package */
public void setCreatePackage (String CreatePackage)
{
if (CreatePackage != null && CreatePackage.length() > 1)
{
log.warning("Length > 1 - truncated");
CreatePackage = CreatePackage.substring(0,0);
}
set_Value (COLUMNNAME_CreatePackage, CreatePackage);
}
/** Get Create Package.
@return Create Package */
public String getCreatePackage() 
{
return (String)get_Value(COLUMNNAME_CreatePackage);
}

@XendraTrl(Identifier="f1786227-4b31-61ff-df1f-a1ed331e3323")
public static String es_PE_FIELD_Confirmation_CreatePackage_Name="Crear Paquete";

@XendraField(AD_Column_ID="CreatePackage",IsCentrallyMaintained=true,
AD_Tab_ID="0f70d6b2-b0e2-1872-4234-7e2b593e2c67",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@Processed@=Y",DisplayLength=23,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f1786227-4b31-61ff-df1f-a1ed331e3323")
public static final String FIELDNAME_Confirmation_CreatePackage="f1786227-4b31-61ff-df1f-a1ed331e3323";

@XendraTrl(Identifier="9773692c-d85d-393e-b256-c151dcd6513b")
public static String es_PE_COLUMN_CreatePackage_Name="Crea Paquete";

@XendraColumn(AD_Element_ID="eea4a472-a489-ca7c-0474-75b51f3379cb",ColumnName="CreatePackage",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="40167b8d-4082-f969-950c-6146c8b283dc",
IsAlwaysUpdateable=true,ColumnSQL="",IsAllowLogging=false,
Identifier="9773692c-d85d-393e-b256-c151dcd6513b",Synchronized="2017-08-05 16:55:09.0")
/** Column name CreatePackage */
public static final String COLUMNNAME_CreatePackage = "CreatePackage";
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

@XendraTrl(Identifier="34137382-8085-6b82-0865-3cf95acb4299")
public static String es_PE_FIELD_Confirmation_Description_Description="Observación";

@XendraTrl(Identifier="34137382-8085-6b82-0865-3cf95acb4299")
public static String es_PE_FIELD_Confirmation_Description_Help="Observación";

@XendraTrl(Identifier="34137382-8085-6b82-0865-3cf95acb4299")
public static String es_PE_FIELD_Confirmation_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="0f70d6b2-b0e2-1872-4234-7e2b593e2c67",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="34137382-8085-6b82-0865-3cf95acb4299")
public static final String FIELDNAME_Confirmation_Description="34137382-8085-6b82-0865-3cf95acb4299";

@XendraTrl(Identifier="184732dc-5c92-d660-3183-ca4dc25a6f50")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=true,ColumnSQL="",
IsAllowLogging=false,Identifier="184732dc-5c92-d660-3183-ca4dc25a6f50",
Synchronized="2017-08-05 16:55:09.0")
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

@XendraTrl(Identifier="6f9b2b75-69a6-8a1b-fd00-2cbe1d83d17d")
public static String es_PE_FIELD_Confirmation_ProcessConfirmation_Name="Completa la Confirmación";

@XendraField(AD_Column_ID="DocAction",IsCentrallyMaintained=true,
AD_Tab_ID="0f70d6b2-b0e2-1872-4234-7e2b593e2c67",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6f9b2b75-69a6-8a1b-fd00-2cbe1d83d17d")
public static final String FIELDNAME_Confirmation_ProcessConfirmation="6f9b2b75-69a6-8a1b-fd00-2cbe1d83d17d";

@XendraTrl(Identifier="e040ce0a-9121-34b4-30f4-4c0522ff9219")
public static String es_PE_COLUMN_DocAction_Name="Acción en el Documento";

@XendraColumn(AD_Element_ID="d4b9075b-18e5-ebbb-5565-d217a7e531cb",ColumnName="DocAction",
AD_Reference_ID=28,AD_Reference_Value_ID="e397c9b0-c643-d1cd-8380-20bee13b2a6e",AD_Val_Rule_ID="",
FieldLength=2,DefaultValue="CO",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,
AD_Process_ID="11da6627-cb22-ee8a-e405-92bfe0ee2f5b",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e040ce0a-9121-34b4-30f4-4c0522ff9219",
Synchronized="2017-08-05 16:55:09.0")
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

@XendraTrl(Identifier="402a5914-3c5a-c888-e6a9-b4148eaf18af")
public static String es_PE_FIELD_Confirmation_DocumentStatus_Description="El estado actual del documento";

@XendraTrl(Identifier="402a5914-3c5a-c888-e6a9-b4148eaf18af")
public static String es_PE_FIELD_Confirmation_DocumentStatus_Help="El estado del documento indica el estado del documento en este momento. Si usted quiere cambiar el estado de Documento; use el campo acción de documento";

@XendraTrl(Identifier="402a5914-3c5a-c888-e6a9-b4148eaf18af")
public static String es_PE_FIELD_Confirmation_DocumentStatus_Name="Estado del Documento";

@XendraField(AD_Column_ID="DocStatus",IsCentrallyMaintained=true,
AD_Tab_ID="0f70d6b2-b0e2-1872-4234-7e2b593e2c67",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="402a5914-3c5a-c888-e6a9-b4148eaf18af")
public static final String FIELDNAME_Confirmation_DocumentStatus="402a5914-3c5a-c888-e6a9-b4148eaf18af";

@XendraTrl(Identifier="ff8a8ecf-be7e-f713-9cb4-8e509dfad14c")
public static String es_PE_COLUMN_DocStatus_Name="Estado del Documento";

@XendraColumn(AD_Element_ID="e73fa537-3438-bd01-dfd4-f0f080a28c55",ColumnName="DocStatus",
AD_Reference_ID=17,AD_Reference_Value_ID="7627125d-fefe-e6bc-bb7d-4a6c772172dc",AD_Val_Rule_ID="",
FieldLength=2,DefaultValue="DR",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="ff8a8ecf-be7e-f713-9cb4-8e509dfad14c",Synchronized="2017-08-05 16:55:09.0")
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

@XendraTrl(Identifier="46153164-413d-32ab-cee8-3047fbd6efb7")
public static String es_PE_FIELD_Confirmation_DocumentNo_Description="Número de secuencia del documento para cada documento";

@XendraTrl(Identifier="46153164-413d-32ab-cee8-3047fbd6efb7")
public static String es_PE_FIELD_Confirmation_DocumentNo_Help="El número del documento es usualmente generado en automático por el sistema y determinado por el tipo del documento. Si el documento no se salva; el número preliminar se despliega entre \"<>\"";

@XendraTrl(Identifier="46153164-413d-32ab-cee8-3047fbd6efb7")
public static String es_PE_FIELD_Confirmation_DocumentNo_Name="No. del Documento";

@XendraField(AD_Column_ID="DocumentNo",IsCentrallyMaintained=true,
AD_Tab_ID="0f70d6b2-b0e2-1872-4234-7e2b593e2c67",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=30,SortNo=-1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="46153164-413d-32ab-cee8-3047fbd6efb7")
public static final String FIELDNAME_Confirmation_DocumentNo="46153164-413d-32ab-cee8-3047fbd6efb7";

@XendraTrl(Identifier="1253b2d7-4dd9-09e2-8948-0c0ce550cb16")
public static String es_PE_COLUMN_DocumentNo_Name="No. del Documento";

@XendraColumn(AD_Element_ID="e3ca6e28-702a-2722-d941-b2072a0de9cb",ColumnName="DocumentNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1253b2d7-4dd9-09e2-8948-0c0ce550cb16",
Synchronized="2017-08-05 16:55:09.0")
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
@XendraTrl(Identifier="18b2949e-717c-475d-84ab-0298c377f2e9")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="18b2949e-717c-475d-84ab-0298c377f2e9",
Synchronized="2017-08-05 16:55:09.0")
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

@XendraTrl(Identifier="fa0046c0-af4d-4b33-a7d6-e3ea24f8964c")
public static String es_PE_FIELD_Confirmation_Approved_Description="Indica si este documento requiere aprobación";

@XendraTrl(Identifier="fa0046c0-af4d-4b33-a7d6-e3ea24f8964c")
public static String es_PE_FIELD_Confirmation_Approved_Help="El Cuadro de Verificación  Aprobado indica si este documento requiere aprobación antes de que pueda ser procesado";

@XendraTrl(Identifier="fa0046c0-af4d-4b33-a7d6-e3ea24f8964c")
public static String es_PE_FIELD_Confirmation_Approved_Name="Aprobación";

@XendraField(AD_Column_ID="IsApproved",IsCentrallyMaintained=true,
AD_Tab_ID="0f70d6b2-b0e2-1872-4234-7e2b593e2c67",AD_FieldGroup_ID="Status",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=80,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fa0046c0-af4d-4b33-a7d6-e3ea24f8964c")
public static final String FIELDNAME_Confirmation_Approved="fa0046c0-af4d-4b33-a7d6-e3ea24f8964c";

@XendraTrl(Identifier="68b36a4c-a5e3-ce12-cc41-817fee70a03e")
public static String es_PE_COLUMN_IsApproved_Name="Aprobación";

@XendraColumn(AD_Element_ID="44388d99-07b7-b005-9e16-78884800beff",ColumnName="IsApproved",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="68b36a4c-a5e3-ce12-cc41-817fee70a03e",
Synchronized="2017-08-05 16:55:09.0")
/** Column name IsApproved */
public static final String COLUMNNAME_IsApproved = "IsApproved";
/** Set Cancelled.
@param IsCancelled The transaction was cancelled */
public void setIsCancelled (boolean IsCancelled)
{
set_Value (COLUMNNAME_IsCancelled, Boolean.valueOf(IsCancelled));
}
/** Get Cancelled.
@return The transaction was cancelled */
public boolean isCancelled() 
{
Object oo = get_Value(COLUMNNAME_IsCancelled);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="c9fb6247-ad14-9800-b249-d95113d949fc")
public static String es_PE_FIELD_Confirmation_Cancelled_Description="La transacción ha sido cancelada";

@XendraTrl(Identifier="c9fb6247-ad14-9800-b249-d95113d949fc")
public static String es_PE_FIELD_Confirmation_Cancelled_Name="Cancelado";

@XendraField(AD_Column_ID="IsCancelled",IsCentrallyMaintained=true,
AD_Tab_ID="0f70d6b2-b0e2-1872-4234-7e2b593e2c67",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@Processed@=Y",DisplayLength=1,IsReadOnly=true,SeqNo=130,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c9fb6247-ad14-9800-b249-d95113d949fc")
public static final String FIELDNAME_Confirmation_Cancelled="c9fb6247-ad14-9800-b249-d95113d949fc";

@XendraTrl(Identifier="0bf44baf-1231-061d-f8e6-fbdf6a8f93e6")
public static String es_PE_COLUMN_IsCancelled_Name="Cancelado";

@XendraColumn(AD_Element_ID="3d043de3-ae7f-5602-27f9-f1b2bb764f53",ColumnName="IsCancelled",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0bf44baf-1231-061d-f8e6-fbdf6a8f93e6",
Synchronized="2017-08-05 16:55:09.0")
/** Column name IsCancelled */
public static final String COLUMNNAME_IsCancelled = "IsCancelled";
/** Set In Dispute.
@param IsInDispute Document is in dispute */
public void setIsInDispute (boolean IsInDispute)
{
set_Value (COLUMNNAME_IsInDispute, Boolean.valueOf(IsInDispute));
}
/** Get In Dispute.
@return Document is in dispute */
public boolean isInDispute() 
{
Object oo = get_Value(COLUMNNAME_IsInDispute);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="7fd264a1-1a4c-97fc-f70b-9e2022fed75d")
public static String es_PE_FIELD_Confirmation_InDispute_Description="Documento en negociación";

@XendraTrl(Identifier="7fd264a1-1a4c-97fc-f70b-9e2022fed75d")
public static String es_PE_FIELD_Confirmation_InDispute_Help="Documento en negociación";

@XendraTrl(Identifier="7fd264a1-1a4c-97fc-f70b-9e2022fed75d")
public static String es_PE_FIELD_Confirmation_InDispute_Name="En Negociación";

@XendraField(AD_Column_ID="IsInDispute",IsCentrallyMaintained=true,
AD_Tab_ID="0f70d6b2-b0e2-1872-4234-7e2b593e2c67",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7fd264a1-1a4c-97fc-f70b-9e2022fed75d")
public static final String FIELDNAME_Confirmation_InDispute="7fd264a1-1a4c-97fc-f70b-9e2022fed75d";

@XendraTrl(Identifier="2dd01e7b-e043-7a67-4569-8d37cbba90e0")
public static String es_PE_COLUMN_IsInDispute_Name="En Negociación";

@XendraColumn(AD_Element_ID="4d75c777-0a61-61e6-1a19-413ad176740e",ColumnName="IsInDispute",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2dd01e7b-e043-7a67-4569-8d37cbba90e0",
Synchronized="2017-08-05 16:55:09.0")
/** Column name IsInDispute */
public static final String COLUMNNAME_IsInDispute = "IsInDispute";
/** Set Ship/Receipt Confirmation.
@param M_InOutConfirm_ID Material Shipment or Receipt Confirmation */
public void setM_InOutConfirm_ID (int M_InOutConfirm_ID)
{
if (M_InOutConfirm_ID < 1) throw new IllegalArgumentException ("M_InOutConfirm_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_InOutConfirm_ID, Integer.valueOf(M_InOutConfirm_ID));
}
/** Get Ship/Receipt Confirmation.
@return Material Shipment or Receipt Confirmation */
public int getM_InOutConfirm_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_InOutConfirm_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="390cd5c4-2476-4dbc-8f6e-bba821df789f")
public static String es_PE_FIELD_Confirmation_ShipReceiptConfirmation_Description="Confirmación material del envío ó del recibo";

@XendraTrl(Identifier="390cd5c4-2476-4dbc-8f6e-bba821df789f")
public static String es_PE_FIELD_Confirmation_ShipReceiptConfirmation_Help="Confirmación del envío ó del recibo - creado del Envio/Recibo";

@XendraTrl(Identifier="390cd5c4-2476-4dbc-8f6e-bba821df789f")
public static String es_PE_FIELD_Confirmation_ShipReceiptConfirmation_Name="Confirmación entrega/Recibo";

@XendraField(AD_Column_ID="M_InOutConfirm_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0f70d6b2-b0e2-1872-4234-7e2b593e2c67",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="390cd5c4-2476-4dbc-8f6e-bba821df789f")
public static final String FIELDNAME_Confirmation_ShipReceiptConfirmation="390cd5c4-2476-4dbc-8f6e-bba821df789f";
/** Column name M_InOutConfirm_ID */
public static final String COLUMNNAME_M_InOutConfirm_ID = "M_InOutConfirm_ID";
/** Set Shipment/Receipt.
@param M_InOut_ID Material Shipment Document */
public void setM_InOut_ID (int M_InOut_ID)
{
if (M_InOut_ID < 1) throw new IllegalArgumentException ("M_InOut_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_InOut_ID, Integer.valueOf(M_InOut_ID));
}
/** Get Shipment/Receipt.
@return Material Shipment Document */
public int getM_InOut_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_InOut_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="3e717dd6-1888-4811-5bf5-6d03468746f3")
public static String es_PE_FIELD_Confirmation_ShipmentReceipt_Description="Entrega ó documento de recibo";

@XendraTrl(Identifier="3e717dd6-1888-4811-5bf5-6d03468746f3")
public static String es_PE_FIELD_Confirmation_ShipmentReceipt_Help="La ID de Entrega / Recibo indica el documento único para esta entrega ó recibo";

@XendraTrl(Identifier="3e717dd6-1888-4811-5bf5-6d03468746f3")
public static String es_PE_FIELD_Confirmation_ShipmentReceipt_Name="Entrega / Recibo";

@XendraField(AD_Column_ID="M_InOut_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0f70d6b2-b0e2-1872-4234-7e2b593e2c67",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3e717dd6-1888-4811-5bf5-6d03468746f3")
public static final String FIELDNAME_Confirmation_ShipmentReceipt="3e717dd6-1888-4811-5bf5-6d03468746f3";

@XendraTrl(Identifier="dae52c5f-a35d-216e-be14-b678f5058a0c")
public static String es_PE_COLUMN_M_InOut_ID_Name="Entrega / Recibo";

@XendraColumn(AD_Element_ID="5c1a0edf-01a0-832e-098b-d49510db71db",ColumnName="M_InOut_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="dae52c5f-a35d-216e-be14-b678f5058a0c",
Synchronized="2017-08-05 16:55:09.0")
/** Column name M_InOut_ID */
public static final String COLUMNNAME_M_InOut_ID = "M_InOut_ID";
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

@XendraTrl(Identifier="232f3b24-7363-f744-110b-e6f1ceb883cf")
public static String es_PE_FIELD_Confirmation_PhysInventory_Description="Parámetros para el inventario físico.";

@XendraTrl(Identifier="232f3b24-7363-f744-110b-e6f1ceb883cf")
public static String es_PE_FIELD_Confirmation_PhysInventory_Help="El inventario físico indica parámetros únicos para el inventario físico.";

@XendraTrl(Identifier="232f3b24-7363-f744-110b-e6f1ceb883cf")
public static String es_PE_FIELD_Confirmation_PhysInventory_Name="Inventario Físico";

@XendraField(AD_Column_ID="M_Inventory_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0f70d6b2-b0e2-1872-4234-7e2b593e2c67",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@Processed@=Y",DisplayLength=26,IsReadOnly=true,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="232f3b24-7363-f744-110b-e6f1ceb883cf")
public static final String FIELDNAME_Confirmation_PhysInventory="232f3b24-7363-f744-110b-e6f1ceb883cf";

@XendraTrl(Identifier="01a28cdf-ca3c-40fd-673d-5fda1814c597")
public static String es_PE_COLUMN_M_Inventory_ID_Name="Inventario Físico";

@XendraColumn(AD_Element_ID="0e8f85f3-fbb2-f347-b412-2f2218e14665",ColumnName="M_Inventory_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="01a28cdf-ca3c-40fd-673d-5fda1814c597",
Synchronized="2017-08-05 16:55:09.0")
/** Column name M_Inventory_ID */
public static final String COLUMNNAME_M_Inventory_ID = "M_Inventory_ID";
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

@XendraTrl(Identifier="45bd55c6-ff09-5d02-12c0-109f8192825f")
public static String es_PE_FIELD_Confirmation_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="45bd55c6-ff09-5d02-12c0-109f8192825f")
public static String es_PE_FIELD_Confirmation_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraTrl(Identifier="45bd55c6-ff09-5d02-12c0-109f8192825f")
public static String es_PE_FIELD_Confirmation_Processed_Name="Procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="0f70d6b2-b0e2-1872-4234-7e2b593e2c67",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="45bd55c6-ff09-5d02-12c0-109f8192825f")
public static final String FIELDNAME_Confirmation_Processed="45bd55c6-ff09-5d02-12c0-109f8192825f";

@XendraTrl(Identifier="95cf1f87-c790-6e56-bdbb-9f459200454c")
public static String es_PE_COLUMN_Processed_Name="Procesado";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="95cf1f87-c790-6e56-bdbb-9f459200454c",
Synchronized="2017-08-05 16:55:09.0")
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

@XendraTrl(Identifier="5746a365-ff5b-6dd4-91b7-eb70bb316823")
public static String es_PE_FIELD_Confirmation_ProcessNow_Name="Procesar Ahora";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="0f70d6b2-b0e2-1872-4234-7e2b593e2c67",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5746a365-ff5b-6dd4-91b7-eb70bb316823")
public static final String FIELDNAME_Confirmation_ProcessNow="5746a365-ff5b-6dd4-91b7-eb70bb316823";

@XendraTrl(Identifier="5ef5954a-1efc-d4df-61ab-f4733d53b62e")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5ef5954a-1efc-d4df-61ab-f4733d53b62e",
Synchronized="2017-08-05 16:55:09.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
}
