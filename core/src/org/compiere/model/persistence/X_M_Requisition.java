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
import org.compiere.model.reference.REF__PriorityRule;
/** Generated Model for M_Requisition
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_Requisition extends PO
{
/** Standard Constructor
@param ctx context
@param M_Requisition_ID id
@param trxName transaction
*/
public X_M_Requisition (Properties ctx, int M_Requisition_ID, String trxName)
{
super (ctx, M_Requisition_ID, trxName);
/** if (M_Requisition_ID == 0)
{
setAD_User_ID (0);
setC_DocType_ID (0);
setDateDoc (new Timestamp(System.currentTimeMillis()));	
// @#Date@
setDateRequired (new Timestamp(System.currentTimeMillis()));
setDocAction (null);	
// CO
setDocStatus (null);	
// DR
setDocumentNo (null);
setIsApproved (false);	
// N
setM_PriceList_ID (0);
setM_Requisition_ID (0);
setM_Warehouse_ID (0);
setPosted (false);
setPriorityRule (null);	
// 5
setProcessed (false);	
// N
setTotalLines (Env.ZERO);	
// 0
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_M_Requisition (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=702 */
public static int Table_ID=MTable.getTable_ID("M_Requisition");

@XendraTrl(Identifier="61eb022a-de96-225e-0829-d7d114ee315b")
public static String es_PE_TAB_Requisition_Description="Requisición de material";

@XendraTrl(Identifier="61eb022a-de96-225e-0829-d7d114ee315b")
public static String es_PE_TAB_Requisition_Name="Requisición";
@XendraTab(Name="Requisition",
Description="Maintain Material Requisition",Help="",
AD_Window_ID="f15d0d2b-f9e2-c40d-7ba7-3c3f33dcaa08",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="61eb022a-de96-225e-0829-d7d114ee315b",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Requisition="61eb022a-de96-225e-0829-d7d114ee315b";

@XendraTrl(Identifier="0b4f9dfc-84e2-5172-1fd3-7c6f05b23c80")
public static String es_PE_TABLE_M_Requisition_Name="Requisición de Material";

@XendraTable(Name="Requisition",Description="Material Requisition",Help="",
TableName="M_Requisition",AccessLevel="3",AD_Window_ID="f15d0d2b-f9e2-c40d-7ba7-3c3f33dcaa08",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=135,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.material",
Identifier="0b4f9dfc-84e2-5172-1fd3-7c6f05b23c80",Synchronized="2017-08-16 11:43:31.0")
/** TableName=M_Requisition */
public static final String Table_Name="M_Requisition";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_Requisition");

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
    Table_ID = MTable.getTable_ID("M_Requisition");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_Requisition[").append(get_ID()).append("]");
return sb.toString();
}
/** Set User/Contact.
@param AD_User_ID User within the system - Internal or Business Partner Contact */
public void setAD_User_ID (int AD_User_ID)
{
if (AD_User_ID < 1) throw new IllegalArgumentException ("AD_User_ID is mandatory.");
set_Value (COLUMNNAME_AD_User_ID, Integer.valueOf(AD_User_ID));
}
/** Get User/Contact.
@return User within the system - Internal or Business Partner Contact */
public int getAD_User_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_User_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="57bb59cd-f9e7-18ad-4944-5ef0c7aa5527")
public static String es_PE_FIELD_Requisition_UserContact_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="57bb59cd-f9e7-18ad-4944-5ef0c7aa5527")
public static String es_PE_FIELD_Requisition_UserContact_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraTrl(Identifier="57bb59cd-f9e7-18ad-4944-5ef0c7aa5527")
public static String es_PE_FIELD_Requisition_UserContact_Name="Usuario";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="61eb022a-de96-225e-0829-d7d114ee315b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="57bb59cd-f9e7-18ad-4944-5ef0c7aa5527")
public static final String FIELDNAME_Requisition_UserContact="57bb59cd-f9e7-18ad-4944-5ef0c7aa5527";

@XendraTrl(Identifier="4acb769b-8ee9-c1d5-eb60-28eb7b24c5b2")
public static String es_PE_COLUMN_AD_User_ID_Name="Usuario";

@XendraColumn(AD_Element_ID="abdf8dee-d3cd-73ec-c758-683e907797f4",ColumnName="AD_User_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="a1ea6cc6-fa00-1e16-1059-b4df151aaf4b",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=true,SeqNo=2,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="4acb769b-8ee9-c1d5-eb60-28eb7b24c5b2",Synchronized="2017-08-05 16:55:30.0")
/** Column name AD_User_ID */
public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";
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

@XendraTrl(Identifier="b6153567-5104-9070-a68b-925a5492716b")
public static String es_PE_FIELD_Requisition_DocumentType_Description="Tipo de documento ó reglas";

@XendraTrl(Identifier="b6153567-5104-9070-a68b-925a5492716b")
public static String es_PE_FIELD_Requisition_DocumentType_Help="El tipo de documento determina la secuencia del documento y las reglas de proceso";

@XendraTrl(Identifier="b6153567-5104-9070-a68b-925a5492716b")
public static String es_PE_FIELD_Requisition_DocumentType_Name="Tipo de Documento";

@XendraField(AD_Column_ID="C_DocType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="61eb022a-de96-225e-0829-d7d114ee315b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b6153567-5104-9070-a68b-925a5492716b")
public static final String FIELDNAME_Requisition_DocumentType="b6153567-5104-9070-a68b-925a5492716b";

@XendraTrl(Identifier="e8783a42-0057-640d-0af2-9c5a3a3c5979")
public static String es_PE_COLUMN_C_DocType_ID_Name="Tipo de Documento";

@XendraColumn(AD_Element_ID="099a4147-1a72-cdd0-81e0-8bdbc8c0b883",ColumnName="C_DocType_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="f897b6e2-5b91-fa67-a18b-528694a66000",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="e8783a42-0057-640d-0af2-9c5a3a3c5979",Synchronized="2017-08-05 16:55:30.0")
/** Column name C_DocType_ID */
public static final String COLUMNNAME_C_DocType_ID = "C_DocType_ID";
/** Set DateDoc.
@param DateDoc Date of the Document */
public void setDateDoc (Timestamp DateDoc)
{
if (DateDoc == null) throw new IllegalArgumentException ("DateDoc is mandatory.");
set_Value (COLUMNNAME_DateDoc, DateDoc);
}
/** Get DateDoc.
@return Date of the Document */
public Timestamp getDateDoc() 
{
return (Timestamp)get_Value(COLUMNNAME_DateDoc);
}

@XendraTrl(Identifier="66fe1c33-03df-de68-7255-b1c8cd4ab47c")
public static String es_PE_FIELD_Requisition_DateDoc_Description="Fecha del documento";

@XendraTrl(Identifier="66fe1c33-03df-de68-7255-b1c8cd4ab47c")
public static String es_PE_FIELD_Requisition_DateDoc_Help="La fecha del documento indica la fecha en que el documento fue generado. Puede ó no ser la misma que la fecha contable. ";

@XendraTrl(Identifier="66fe1c33-03df-de68-7255-b1c8cd4ab47c")
public static String es_PE_FIELD_Requisition_DateDoc_Name="F. Documento";

@XendraField(AD_Column_ID="DateDoc",IsCentrallyMaintained=true,
AD_Tab_ID="61eb022a-de96-225e-0829-d7d114ee315b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=7,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="66fe1c33-03df-de68-7255-b1c8cd4ab47c")
public static final String FIELDNAME_Requisition_DateDoc="66fe1c33-03df-de68-7255-b1c8cd4ab47c";

@XendraTrl(Identifier="9df6d005-c5ee-d857-0fd5-d0a36dba5163")
public static String es_PE_COLUMN_DateDoc_Name="F. Documento";

@XendraColumn(AD_Element_ID="68f87a38-0b7e-cc52-6990-3b5d2d120d9d",ColumnName="DateDoc",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="@#Date@",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9df6d005-c5ee-d857-0fd5-d0a36dba5163",
Synchronized="2017-08-05 16:55:30.0")
/** Column name DateDoc */
public static final String COLUMNNAME_DateDoc = "DateDoc";
/** Set Date Required.
@param DateRequired Date when required */
public void setDateRequired (Timestamp DateRequired)
{
if (DateRequired == null) throw new IllegalArgumentException ("DateRequired is mandatory.");
set_Value (COLUMNNAME_DateRequired, DateRequired);
}
/** Get Date Required.
@return Date when required */
public Timestamp getDateRequired() 
{
return (Timestamp)get_Value(COLUMNNAME_DateRequired);
}

@XendraTrl(Identifier="dfe91c72-1aac-e34b-2847-c9a9e72ad4f6")
public static String es_PE_FIELD_Requisition_DateRequired_Description="Fecha desde cuando se ha requerido";

@XendraTrl(Identifier="dfe91c72-1aac-e34b-2847-c9a9e72ad4f6")
public static String es_PE_FIELD_Requisition_DateRequired_Name="Fecha Requerida";

@XendraField(AD_Column_ID="DateRequired",IsCentrallyMaintained=true,
AD_Tab_ID="61eb022a-de96-225e-0829-d7d114ee315b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="dfe91c72-1aac-e34b-2847-c9a9e72ad4f6")
public static final String FIELDNAME_Requisition_DateRequired="dfe91c72-1aac-e34b-2847-c9a9e72ad4f6";

@XendraTrl(Identifier="297d4aa4-5ed7-82a8-2515-6763f32afb4a")
public static String es_PE_COLUMN_DateRequired_Name="Fecha Requerida";

@XendraColumn(AD_Element_ID="69bef1ed-a6ae-059a-7cbb-531c16624538",ColumnName="DateRequired",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="297d4aa4-5ed7-82a8-2515-6763f32afb4a",
Synchronized="2017-08-05 16:55:30.0")
/** Column name DateRequired */
public static final String COLUMNNAME_DateRequired = "DateRequired";
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

@XendraTrl(Identifier="bdf8b5eb-4799-e07f-989c-4600dd01f850")
public static String es_PE_FIELD_Requisition_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="bdf8b5eb-4799-e07f-989c-4600dd01f850")
public static String es_PE_FIELD_Requisition_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="bdf8b5eb-4799-e07f-989c-4600dd01f850")
public static String es_PE_FIELD_Requisition_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="61eb022a-de96-225e-0829-d7d114ee315b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bdf8b5eb-4799-e07f-989c-4600dd01f850")
public static final String FIELDNAME_Requisition_Description="bdf8b5eb-4799-e07f-989c-4600dd01f850";

@XendraTrl(Identifier="de617f1c-167e-db93-c6b7-952993844eac")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="de617f1c-167e-db93-c6b7-952993844eac",
Synchronized="2017-08-05 16:55:30.0")
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

@XendraTrl(Identifier="b6f1353f-20fb-61ae-3346-22edc23ce331")
public static String es_PE_FIELD_Requisition_ProcessRequisition_Name="Proceso de Solicitudes";

@XendraField(AD_Column_ID="DocAction",IsCentrallyMaintained=true,
AD_Tab_ID="61eb022a-de96-225e-0829-d7d114ee315b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b6f1353f-20fb-61ae-3346-22edc23ce331")
public static final String FIELDNAME_Requisition_ProcessRequisition="b6f1353f-20fb-61ae-3346-22edc23ce331";

@XendraTrl(Identifier="cc08f106-a1c5-c277-9194-419d09650b26")
public static String es_PE_COLUMN_DocAction_Name="Acción en el Documento";

@XendraColumn(AD_Element_ID="d4b9075b-18e5-ebbb-5565-d217a7e531cb",ColumnName="DocAction",
AD_Reference_ID=28,AD_Reference_Value_ID="e397c9b0-c643-d1cd-8380-20bee13b2a6e",AD_Val_Rule_ID="",
FieldLength=2,DefaultValue="CO",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,
AD_Process_ID="ada75e97-2d7c-edee-77da-5864eeea9bad",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cc08f106-a1c5-c277-9194-419d09650b26",
Synchronized="2017-08-05 16:55:30.0")
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

@XendraTrl(Identifier="353d516a-f63d-a4b6-e9da-9fa3a29d2a6b")
public static String es_PE_FIELD_Requisition_DocumentStatus_Description="El estado actual del documento";

@XendraTrl(Identifier="353d516a-f63d-a4b6-e9da-9fa3a29d2a6b")
public static String es_PE_FIELD_Requisition_DocumentStatus_Help="El estado del documento indica el estado del documento en este momento. Si usted quiere cambiar el estado de Documento; use el campo acción de documento";

@XendraTrl(Identifier="353d516a-f63d-a4b6-e9da-9fa3a29d2a6b")
public static String es_PE_FIELD_Requisition_DocumentStatus_Name="Estado del Documento";

@XendraField(AD_Column_ID="DocStatus",IsCentrallyMaintained=true,
AD_Tab_ID="61eb022a-de96-225e-0829-d7d114ee315b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="353d516a-f63d-a4b6-e9da-9fa3a29d2a6b")
public static final String FIELDNAME_Requisition_DocumentStatus="353d516a-f63d-a4b6-e9da-9fa3a29d2a6b";

@XendraTrl(Identifier="a7576008-d4c8-3789-26f5-b6760f3c101e")
public static String es_PE_COLUMN_DocStatus_Name="Estado del Documento";

@XendraColumn(AD_Element_ID="e73fa537-3438-bd01-dfd4-f0f080a28c55",ColumnName="DocStatus",
AD_Reference_ID=17,AD_Reference_Value_ID="7627125d-fefe-e6bc-bb7d-4a6c772172dc",AD_Val_Rule_ID="",
FieldLength=2,DefaultValue="DR",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="a7576008-d4c8-3789-26f5-b6760f3c101e",Synchronized="2017-08-05 16:55:30.0")
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
set_ValueNoCheck (COLUMNNAME_DocumentNo, DocumentNo);
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

@XendraTrl(Identifier="ede106ec-18ae-053d-cbe8-62215c43ede9")
public static String es_PE_FIELD_Requisition_DocumentNo_Description="Número de secuencia del documento para cada documento";

@XendraTrl(Identifier="ede106ec-18ae-053d-cbe8-62215c43ede9")
public static String es_PE_FIELD_Requisition_DocumentNo_Help="El número del documento es usualmente generado en automático por el sistema y determinado por el tipo del documento. Si el documento no se salva; el número preliminar se despliega entre \"<>\"";

@XendraTrl(Identifier="ede106ec-18ae-053d-cbe8-62215c43ede9")
public static String es_PE_FIELD_Requisition_DocumentNo_Name="No. del Documento";

@XendraField(AD_Column_ID="DocumentNo",IsCentrallyMaintained=true,
AD_Tab_ID="61eb022a-de96-225e-0829-d7d114ee315b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=40,SortNo=-1,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ede106ec-18ae-053d-cbe8-62215c43ede9")
public static final String FIELDNAME_Requisition_DocumentNo="ede106ec-18ae-053d-cbe8-62215c43ede9";

@XendraTrl(Identifier="007f1c41-d6be-93db-35b6-7376c392697f")
public static String es_PE_COLUMN_DocumentNo_Name="No. del Documento";

@XendraColumn(AD_Element_ID="e3ca6e28-702a-2722-d941-b2072a0de9cb",ColumnName="DocumentNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="007f1c41-d6be-93db-35b6-7376c392697f",
Synchronized="2017-08-05 16:55:30.0")
/** Column name DocumentNo */
public static final String COLUMNNAME_DocumentNo = "DocumentNo";
/** Set Comment/Help.
@param Help Comment or Hint */
public void setHelp (String Help)
{
if (Help != null && Help.length() > 2000)
{
log.warning("Length > 2000 - truncated");
Help = Help.substring(0,1999);
}
set_Value (COLUMNNAME_Help, Help);
}
/** Get Comment/Help.
@return Comment or Hint */
public String getHelp() 
{
String value = (String)get_Value(COLUMNNAME_Help);
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

@XendraTrl(Identifier="9c471a6c-d52a-130d-e700-3051831bbebc")
public static String es_PE_FIELD_Requisition_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="9c471a6c-d52a-130d-e700-3051831bbebc")
public static String es_PE_FIELD_Requisition_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraTrl(Identifier="9c471a6c-d52a-130d-e700-3051831bbebc")
public static String es_PE_FIELD_Requisition_CommentHelp_Name="Ayuda";

@XendraField(AD_Column_ID="Help",IsCentrallyMaintained=true,
AD_Tab_ID="61eb022a-de96-225e-0829-d7d114ee315b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9c471a6c-d52a-130d-e700-3051831bbebc")
public static final String FIELDNAME_Requisition_CommentHelp="9c471a6c-d52a-130d-e700-3051831bbebc";

@XendraTrl(Identifier="9639c5b7-cd5c-7784-a620-c65b9056d711")
public static String es_PE_COLUMN_Help_Name="Ayuda";

@XendraColumn(AD_Element_ID="a6fda582-56f9-6bb7-8436-285ce4f8de3f",ColumnName="Help",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9639c5b7-cd5c-7784-a620-c65b9056d711",
Synchronized="2017-08-05 16:55:30.0")
/** Column name Help */
public static final String COLUMNNAME_Help = "Help";
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
@XendraTrl(Identifier="a6ea5d37-87c7-4c41-874a-f1e5367a7706")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a6ea5d37-87c7-4c41-874a-f1e5367a7706",
Synchronized="2017-08-05 16:55:30.0")
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

@XendraTrl(Identifier="41a436c8-85c6-4058-9373-2b5d39601189")
public static String es_PE_FIELD_Requisition_Approved_Description="Indica si este documento requiere aprobación";

@XendraTrl(Identifier="41a436c8-85c6-4058-9373-2b5d39601189")
public static String es_PE_FIELD_Requisition_Approved_Help="El Cuadro de Verificación  Aprobado indica si este documento requiere aprobación antes de que pueda ser procesado";

@XendraTrl(Identifier="41a436c8-85c6-4058-9373-2b5d39601189")
public static String es_PE_FIELD_Requisition_Approved_Name="Aprobación";

@XendraField(AD_Column_ID="IsApproved",IsCentrallyMaintained=true,
AD_Tab_ID="61eb022a-de96-225e-0829-d7d114ee315b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=90,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="41a436c8-85c6-4058-9373-2b5d39601189")
public static final String FIELDNAME_Requisition_Approved="41a436c8-85c6-4058-9373-2b5d39601189";

@XendraTrl(Identifier="26f88c06-71bd-ca36-bc17-3f4a7e5dbfe7")
public static String es_PE_COLUMN_IsApproved_Name="Aprobación";

@XendraColumn(AD_Element_ID="44388d99-07b7-b005-9e16-78884800beff",ColumnName="IsApproved",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="26f88c06-71bd-ca36-bc17-3f4a7e5dbfe7",
Synchronized="2017-08-05 16:55:30.0")
/** Column name IsApproved */
public static final String COLUMNNAME_IsApproved = "IsApproved";
/** Set M_PriceList_ID.
@param M_PriceList_ID Unique identifier of a Price List */
public void setM_PriceList_ID (int M_PriceList_ID)
{
if (M_PriceList_ID < 1) throw new IllegalArgumentException ("M_PriceList_ID is mandatory.");
set_Value (COLUMNNAME_M_PriceList_ID, Integer.valueOf(M_PriceList_ID));
}
/** Get M_PriceList_ID.
@return Unique identifier of a Price List */
public int getM_PriceList_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_PriceList_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="0a209f29-7158-969e-0c35-c86fe9f43eed")
public static String es_PE_FIELD_Requisition_M_PriceList_ID_Description="Identificador único de mi lista de precios";

@XendraTrl(Identifier="0a209f29-7158-969e-0c35-c86fe9f43eed")
public static String es_PE_FIELD_Requisition_M_PriceList_ID_Help="Listas de precios son usadas para determinar el precio; margen y costo de artículos comprados ó vendidos.";

@XendraTrl(Identifier="0a209f29-7158-969e-0c35-c86fe9f43eed")
public static String es_PE_FIELD_Requisition_M_PriceList_ID_Name="Lista de Precios";

@XendraField(AD_Column_ID="M_PriceList_ID",IsCentrallyMaintained=true,
AD_Tab_ID="61eb022a-de96-225e-0829-d7d114ee315b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0a209f29-7158-969e-0c35-c86fe9f43eed")
public static final String FIELDNAME_Requisition_M_PriceList_ID="0a209f29-7158-969e-0c35-c86fe9f43eed";

@XendraTrl(Identifier="ed9a567c-7972-dbf5-499e-b2564322cbc0")
public static String es_PE_COLUMN_M_PriceList_ID_Name="Lista de Precios";

@XendraColumn(AD_Element_ID="652afdd3-9ff1-082d-5831-6aad828e0e09",ColumnName="M_PriceList_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ed9a567c-7972-dbf5-499e-b2564322cbc0",
Synchronized="2017-08-05 16:55:30.0")
/** Column name M_PriceList_ID */
public static final String COLUMNNAME_M_PriceList_ID = "M_PriceList_ID";
/** Set Requisition.
@param M_Requisition_ID Material Requisition */
public void setM_Requisition_ID (int M_Requisition_ID)
{
if (M_Requisition_ID < 1) throw new IllegalArgumentException ("M_Requisition_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_Requisition_ID, Integer.valueOf(M_Requisition_ID));
}
/** Get Requisition.
@return Material Requisition */
public int getM_Requisition_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Requisition_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="8a6fed2f-0973-e427-6606-50c993be42d8")
public static String es_PE_FIELD_Requisition_Requisition_Description="Requisición de Material";

@XendraTrl(Identifier="8a6fed2f-0973-e427-6606-50c993be42d8")
public static String es_PE_FIELD_Requisition_Requisition_Name="Requisición de Material";

@XendraField(AD_Column_ID="M_Requisition_ID",IsCentrallyMaintained=true,
AD_Tab_ID="61eb022a-de96-225e-0829-d7d114ee315b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8a6fed2f-0973-e427-6606-50c993be42d8")
public static final String FIELDNAME_Requisition_Requisition="8a6fed2f-0973-e427-6606-50c993be42d8";
/** Column name M_Requisition_ID */
public static final String COLUMNNAME_M_Requisition_ID = "M_Requisition_ID";
/** Set Warehouse.
@param M_Warehouse_ID Storage Warehouse and Service Point */
public void setM_Warehouse_ID (int M_Warehouse_ID)
{
if (M_Warehouse_ID < 1) throw new IllegalArgumentException ("M_Warehouse_ID is mandatory.");
set_Value (COLUMNNAME_M_Warehouse_ID, Integer.valueOf(M_Warehouse_ID));
}
/** Get Warehouse.
@return Storage Warehouse and Service Point */
public int getM_Warehouse_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Warehouse_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f4001a3a-d363-e406-ca74-8d2453459757")
public static String es_PE_FIELD_Requisition_Warehouse_Description="Almacén";

@XendraTrl(Identifier="f4001a3a-d363-e406-ca74-8d2453459757")
public static String es_PE_FIELD_Requisition_Warehouse_Help="El Almacén indica un Almacén único donde los productos son almacenados";

@XendraTrl(Identifier="f4001a3a-d363-e406-ca74-8d2453459757")
public static String es_PE_FIELD_Requisition_Warehouse_Name="Almacén";

@XendraField(AD_Column_ID="M_Warehouse_ID",IsCentrallyMaintained=true,
AD_Tab_ID="61eb022a-de96-225e-0829-d7d114ee315b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f4001a3a-d363-e406-ca74-8d2453459757")
public static final String FIELDNAME_Requisition_Warehouse="f4001a3a-d363-e406-ca74-8d2453459757";

@XendraTrl(Identifier="0c531a1c-95e1-f7f7-2c5b-cf614743c104")
public static String es_PE_COLUMN_M_Warehouse_ID_Name="Almacén";

@XendraColumn(AD_Element_ID="402045cd-baa5-aeaf-b148-a921dffb7821",ColumnName="M_Warehouse_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0c531a1c-95e1-f7f7-2c5b-cf614743c104",
Synchronized="2017-08-05 16:55:30.0")
/** Column name M_Warehouse_ID */
public static final String COLUMNNAME_M_Warehouse_ID = "M_Warehouse_ID";
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

@XendraTrl(Identifier="22add117-ba87-c913-0660-f04a7a70935e")
public static String es_PE_FIELD_Requisition_Posted_Description="Las transacciones de contabilidad general han sido procesadas.";

@XendraTrl(Identifier="22add117-ba87-c913-0660-f04a7a70935e")
public static String es_PE_FIELD_Requisition_Posted_Help="El campo fijado indica el estado de la generación de las Líneas contables a la contabilidad general.";

@XendraTrl(Identifier="22add117-ba87-c913-0660-f04a7a70935e")
public static String es_PE_FIELD_Requisition_Posted_Name="Fijada";

@XendraField(AD_Column_ID="Posted",IsCentrallyMaintained=true,
AD_Tab_ID="61eb022a-de96-225e-0829-d7d114ee315b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@Processed@=Y & @#ShowAcct@=Y",DisplayLength=23,IsReadOnly=false,SeqNo=180,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="22add117-ba87-c913-0660-f04a7a70935e")
public static final String FIELDNAME_Requisition_Posted="22add117-ba87-c913-0660-f04a7a70935e";

@XendraTrl(Identifier="7147e668-9672-e766-64dc-eb1610b1b44e")
public static String es_PE_COLUMN_Posted_Name="Fijada";

@XendraColumn(AD_Element_ID="5eb52ebc-6992-12f5-b85a-e0a136df259b",ColumnName="Posted",
AD_Reference_ID=28,AD_Reference_Value_ID="d2b659dd-6c8c-baf3-fc71-0ee997273154",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="7147e668-9672-e766-64dc-eb1610b1b44e",Synchronized="2017-08-05 16:55:30.0")
/** Column name Posted */
public static final String COLUMNNAME_Posted = "Posted";

/** PriorityRule AD_Reference=bfacaeda-bbb9-ba51-d726-52826206b4d7 */
public static final int PRIORITYRULE_AD_Reference_ID=154;
/** Set Priority.
@param PriorityRule Priority of a document */
public void setPriorityRule (String PriorityRule)
{
if (PriorityRule == null) throw new IllegalArgumentException ("PriorityRule is mandatory");
if (PriorityRule.equals(REF__PriorityRule.High) || PriorityRule.equals(REF__PriorityRule.Medium) || PriorityRule.equals(REF__PriorityRule.Low) || PriorityRule.equals(REF__PriorityRule.Urgent) || PriorityRule.equals(REF__PriorityRule.Minor));
 else throw new IllegalArgumentException ("PriorityRule Invalid value - " + PriorityRule + " - Reference_ID=154 - 3 - 5 - 7 - 1 - 9");
if (PriorityRule.length() > 1)
{
log.warning("Length > 1 - truncated");
PriorityRule = PriorityRule.substring(0,0);
}
set_Value (COLUMNNAME_PriorityRule, PriorityRule);
}
/** Get Priority.
@return Priority of a document */
public String getPriorityRule() 
{
return (String)get_Value(COLUMNNAME_PriorityRule);
}

@XendraTrl(Identifier="0ce9678b-9214-7cf6-dc10-ffcb7feb1c2d")
public static String es_PE_FIELD_Requisition_Priority_Description="Prioridad de un documento";

@XendraTrl(Identifier="0ce9678b-9214-7cf6-dc10-ffcb7feb1c2d")
public static String es_PE_FIELD_Requisition_Priority_Help="La prioridad indica la importancia (alta; media; baja) de este documento";

@XendraTrl(Identifier="0ce9678b-9214-7cf6-dc10-ffcb7feb1c2d")
public static String es_PE_FIELD_Requisition_Priority_Name="Prioridad";

@XendraField(AD_Column_ID="PriorityRule",IsCentrallyMaintained=true,
AD_Tab_ID="61eb022a-de96-225e-0829-d7d114ee315b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0ce9678b-9214-7cf6-dc10-ffcb7feb1c2d")
public static final String FIELDNAME_Requisition_Priority="0ce9678b-9214-7cf6-dc10-ffcb7feb1c2d";

@XendraTrl(Identifier="3b46fdf1-7181-ebfe-c41f-41381649bdce")
public static String es_PE_COLUMN_PriorityRule_Name="Prioridad";

@XendraColumn(AD_Element_ID="8ff1ec26-d036-3761-33be-8de919b0ed5c",ColumnName="PriorityRule",
AD_Reference_ID=17,AD_Reference_Value_ID="bfacaeda-bbb9-ba51-d726-52826206b4d7",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="5",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="3b46fdf1-7181-ebfe-c41f-41381649bdce",Synchronized="2017-08-05 16:55:30.0")
/** Column name PriorityRule */
public static final String COLUMNNAME_PriorityRule = "PriorityRule";
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

@XendraTrl(Identifier="00db04ef-af1c-2117-d18e-bb3d2b0f0c48")
public static String es_PE_FIELD_Requisition_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="00db04ef-af1c-2117-d18e-bb3d2b0f0c48")
public static String es_PE_FIELD_Requisition_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraTrl(Identifier="00db04ef-af1c-2117-d18e-bb3d2b0f0c48")
public static String es_PE_FIELD_Requisition_Processed_Name="Procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="61eb022a-de96-225e-0829-d7d114ee315b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=170,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="00db04ef-af1c-2117-d18e-bb3d2b0f0c48")
public static final String FIELDNAME_Requisition_Processed="00db04ef-af1c-2117-d18e-bb3d2b0f0c48";

@XendraTrl(Identifier="18c24330-9fe1-1ac8-585f-06580464a234")
public static String es_PE_COLUMN_Processed_Name="Procesado";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="18c24330-9fe1-1ac8-585f-06580464a234",
Synchronized="2017-08-05 16:55:30.0")
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

@XendraTrl(Identifier="0b89c7f4-6e4d-a46d-712d-5c98102ff1f2")
public static String es_PE_FIELD_Requisition_ProcessNow_Name="Procesar Ahora";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="61eb022a-de96-225e-0829-d7d114ee315b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0b89c7f4-6e4d-a46d-712d-5c98102ff1f2")
public static final String FIELDNAME_Requisition_ProcessNow="0b89c7f4-6e4d-a46d-712d-5c98102ff1f2";

@XendraTrl(Identifier="91063646-af5b-5ed0-5811-24e90680e54c")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="91063646-af5b-5ed0-5811-24e90680e54c",
Synchronized="2017-08-05 16:55:30.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
/** Set Total Lines.
@param TotalLines Total of all document lines */
public void setTotalLines (BigDecimal TotalLines)
{
if (TotalLines == null) throw new IllegalArgumentException ("TotalLines is mandatory.");
set_Value (COLUMNNAME_TotalLines, TotalLines);
}
/** Get Total Lines.
@return Total of all document lines */
public BigDecimal getTotalLines() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_TotalLines);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="b2f54127-5669-ce12-93cf-9ff4417d7cca")
public static String es_PE_FIELD_Requisition_TotalLines_Description="Total de todas las líneas del documento";

@XendraTrl(Identifier="b2f54127-5669-ce12-93cf-9ff4417d7cca")
public static String es_PE_FIELD_Requisition_TotalLines_Help="El Total total despliega el total de todas las líneas en la moneda del documento";

@XendraTrl(Identifier="b2f54127-5669-ce12-93cf-9ff4417d7cca")
public static String es_PE_FIELD_Requisition_TotalLines_Name="Total de Líneas";

@XendraField(AD_Column_ID="TotalLines",IsCentrallyMaintained=true,
AD_Tab_ID="61eb022a-de96-225e-0829-d7d114ee315b",AD_FieldGroup_ID="Status",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b2f54127-5669-ce12-93cf-9ff4417d7cca")
public static final String FIELDNAME_Requisition_TotalLines="b2f54127-5669-ce12-93cf-9ff4417d7cca";

@XendraTrl(Identifier="9cc77cd6-7554-014d-5a87-5667b06ef59e")
public static String es_PE_COLUMN_TotalLines_Name="Total de Líneas";

@XendraColumn(AD_Element_ID="b1a5a695-e900-bbfd-4380-df29c5444a9a",ColumnName="TotalLines",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9cc77cd6-7554-014d-5a87-5667b06ef59e",
Synchronized="2017-08-05 16:55:30.0")
/** Column name TotalLines */
public static final String COLUMNNAME_TotalLines = "TotalLines";
}
