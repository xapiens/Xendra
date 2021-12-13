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
/** Generated Model for C_PaySelectionCheck
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_PaySelectionCheck extends PO
{
/** Standard Constructor
@param ctx context
@param C_PaySelectionCheck_ID id
@param trxName transaction
*/
public X_C_PaySelectionCheck (Properties ctx, int C_PaySelectionCheck_ID, String trxName)
{
super (ctx, C_PaySelectionCheck_ID, trxName);
/** if (C_PaySelectionCheck_ID == 0)
{
setC_BPartner_ID (0);
setC_PaySelectionCheck_ID (0);
setC_PaySelection_ID (0);
setDiscountAmt (Env.ZERO);	
// 0
setIsPrinted (false);	
// N
setIsReceipt (false);	
// N
setPayAmt (Env.ZERO);	
// 0
setPaymentRule (null);
setProcessed (false);	
// N
setQty (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_PaySelectionCheck (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=525 */
public static int Table_ID=MTable.getTable_ID("C_PaySelectionCheck");

@XendraTrl(Identifier="af90e217-9ba8-ec01-37ac-c70d71cffbe2")
public static String es_PE_TAB_PreparedPayment_Description="Ver pago generado después de crear los pagos";

@XendraTrl(Identifier="af90e217-9ba8-ec01-37ac-c70d71cffbe2")
public static String es_PE_TAB_PreparedPayment_Name="Pago Generado";

@XendraTab(Name="Prepared Payment",Description="View Generated Prepared Payments (Checks)",
Help="You create the actual Payments via Payment Print/Export",
AD_Window_ID="3b3a39ee-5fa5-65fa-8f03-b3cbf65cc9e9",SeqNo=30,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=true,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=false,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="af90e217-9ba8-ec01-37ac-c70d71cffbe2",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_PreparedPayment="af90e217-9ba8-ec01-37ac-c70d71cffbe2";

@XendraTrl(Identifier="29c073a3-4e12-403f-7745-4a387b8c1957")
public static String es_PE_TABLE_C_PaySelectionCheck_Name="Revisión de Selección de Pago";


@XendraTable(Name="Pay Selection Check",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Payment Selection Check",Help="",
TableName="C_PaySelectionCheck",AccessLevel="1",
AD_Window_ID="3b3a39ee-5fa5-65fa-8f03-b3cbf65cc9e9",AD_Val_Rule_ID="",IsKey=1,LoadSeq=140,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.commercial",Identifier="29c073a3-4e12-403f-7745-4a387b8c1957",
Synchronized="2020-03-03 21:37:24.0")
/** TableName=C_PaySelectionCheck */
public static final String Table_Name="C_PaySelectionCheck";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_PaySelectionCheck");

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
    Table_ID = MTable.getTable_ID("C_PaySelectionCheck");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_PaySelectionCheck[").append(get_ID()).append("]");
return sb.toString();
}
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
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getC_BPartner_ID()));
}

@XendraTrl(Identifier="f288689b-f8ee-96a4-2de3-e63f14338bf8")
public static String es_PE_FIELD_PreparedPayment_BusinessPartner_Name="Socio de Negocio";

@XendraTrl(Identifier="f288689b-f8ee-96a4-2de3-e63f14338bf8")
public static String es_PE_FIELD_PreparedPayment_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="f288689b-f8ee-96a4-2de3-e63f14338bf8")
public static String es_PE_FIELD_PreparedPayment_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="af90e217-9ba8-ec01-37ac-c70d71cffbe2",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f288689b-f8ee-96a4-2de3-e63f14338bf8")
public static final String FIELDNAME_PreparedPayment_BusinessPartner="f288689b-f8ee-96a4-2de3-e63f14338bf8";

@XendraTrl(Identifier="fd87b49d-6cce-c592-319b-dcbe50ab3bbe")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Socio de Negocio";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="06fdbbe9-e1c4-3ee4-4a9d-73d1a990cc42",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="fd87b49d-6cce-c592-319b-dcbe50ab3bbe",Synchronized="2019-08-30 22:22:00.0")
/** Column name C_BPartner_ID */
public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
/** Set Partner Bank Account.
@param C_BP_BankAccount_ID Bank Account of the Business Partner */
public void setC_BP_BankAccount_ID (int C_BP_BankAccount_ID)
{
if (C_BP_BankAccount_ID <= 0) set_Value (COLUMNNAME_C_BP_BankAccount_ID, null);
 else 
set_Value (COLUMNNAME_C_BP_BankAccount_ID, Integer.valueOf(C_BP_BankAccount_ID));
}
/** Get Partner Bank Account.
@return Bank Account of the Business Partner */
public int getC_BP_BankAccount_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BP_BankAccount_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="54f3fdef-11d9-500b-1a0c-2c53c822610c")
public static String es_PE_COLUMN_C_BP_BankAccount_ID_Name="Cuenta Bancaria del Socio";

@XendraColumn(AD_Element_ID="3c4f5cea-368f-2a75-7414-a8d02110104b",
ColumnName="C_BP_BankAccount_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",
AD_Val_Rule_ID="937cf07b-3e21-96b1-6c4d-e19eb48a2383",FieldLength=10,DefaultValue="",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="54f3fdef-11d9-500b-1a0c-2c53c822610c",
Synchronized="2019-08-30 22:22:00.0")
/** Column name C_BP_BankAccount_ID */
public static final String COLUMNNAME_C_BP_BankAccount_ID = "C_BP_BankAccount_ID";
/** Set Payment.
@param C_Payment_ID Payment identifier */
public void setC_Payment_ID (int C_Payment_ID)
{
if (C_Payment_ID <= 0) set_Value (COLUMNNAME_C_Payment_ID, null);
 else 
set_Value (COLUMNNAME_C_Payment_ID, Integer.valueOf(C_Payment_ID));
}
/** Get Payment.
@return Payment identifier */
public int getC_Payment_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Payment_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="4fced985-202e-9517-e15b-b71771270b61")
public static String es_PE_FIELD_PreparedPayment_Payment_Name="Pago";

@XendraTrl(Identifier="4fced985-202e-9517-e15b-b71771270b61")
public static String es_PE_FIELD_PreparedPayment_Payment_Description="Identificador del pago";

@XendraTrl(Identifier="4fced985-202e-9517-e15b-b71771270b61")
public static String es_PE_FIELD_PreparedPayment_Payment_Help="El pago es un identificador único de este pago.";

@XendraField(AD_Column_ID="C_Payment_ID",IsCentrallyMaintained=true,
AD_Tab_ID="af90e217-9ba8-ec01-37ac-c70d71cffbe2",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4fced985-202e-9517-e15b-b71771270b61")
public static final String FIELDNAME_PreparedPayment_Payment="4fced985-202e-9517-e15b-b71771270b61";

@XendraTrl(Identifier="a6e52895-d263-f734-5a85-0ed37f95d787")
public static String es_PE_COLUMN_C_Payment_ID_Name="Pago";

@XendraColumn(AD_Element_ID="3ded5658-968e-94c5-207b-eed6f6a7bb43",ColumnName="C_Payment_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a6e52895-d263-f734-5a85-0ed37f95d787",
Synchronized="2019-08-30 22:22:00.0")
/** Column name C_Payment_ID */
public static final String COLUMNNAME_C_Payment_ID = "C_Payment_ID";
/** Set Pay Selection Check.
@param C_PaySelectionCheck_ID Payment Selection Check */
public void setC_PaySelectionCheck_ID (int C_PaySelectionCheck_ID)
{
if (C_PaySelectionCheck_ID < 1) throw new IllegalArgumentException ("C_PaySelectionCheck_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_PaySelectionCheck_ID, Integer.valueOf(C_PaySelectionCheck_ID));
}
/** Get Pay Selection Check.
@return Payment Selection Check */
public int getC_PaySelectionCheck_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_PaySelectionCheck_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="92fe24a4-607b-8262-a9ef-449332e6a096")
public static String es_PE_FIELD_PreparedPayment_PaySelectionCheck_Name="Revisión de Selección de Pago";

@XendraTrl(Identifier="92fe24a4-607b-8262-a9ef-449332e6a096")
public static String es_PE_FIELD_PreparedPayment_PaySelectionCheck_Description="Revisión de selección de pago";

@XendraField(AD_Column_ID="C_PaySelectionCheck_ID",IsCentrallyMaintained=true,
AD_Tab_ID="af90e217-9ba8-ec01-37ac-c70d71cffbe2",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="92fe24a4-607b-8262-a9ef-449332e6a096")
public static final String FIELDNAME_PreparedPayment_PaySelectionCheck="92fe24a4-607b-8262-a9ef-449332e6a096";
/** Column name C_PaySelectionCheck_ID */
public static final String COLUMNNAME_C_PaySelectionCheck_ID = "C_PaySelectionCheck_ID";
/** Set Payment Selection.
@param C_PaySelection_ID Payment Selection */
public void setC_PaySelection_ID (int C_PaySelection_ID)
{
if (C_PaySelection_ID < 1) throw new IllegalArgumentException ("C_PaySelection_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_PaySelection_ID, Integer.valueOf(C_PaySelection_ID));
}
/** Get Payment Selection.
@return Payment Selection */
public int getC_PaySelection_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_PaySelection_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="a67e7493-1a24-5dd9-d9c0-984b87fc42a9")
public static String es_PE_FIELD_PreparedPayment_PaymentSelection_Name="Selección de Pago";

@XendraTrl(Identifier="a67e7493-1a24-5dd9-d9c0-984b87fc42a9")
public static String es_PE_FIELD_PreparedPayment_PaymentSelection_Description="Selección de Pago";

@XendraTrl(Identifier="a67e7493-1a24-5dd9-d9c0-984b87fc42a9")
public static String es_PE_FIELD_PreparedPayment_PaymentSelection_Help="La selección de pago identifica un pago único.";

@XendraField(AD_Column_ID="C_PaySelection_ID",IsCentrallyMaintained=true,
AD_Tab_ID="af90e217-9ba8-ec01-37ac-c70d71cffbe2",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a67e7493-1a24-5dd9-d9c0-984b87fc42a9")
public static final String FIELDNAME_PreparedPayment_PaymentSelection="a67e7493-1a24-5dd9-d9c0-984b87fc42a9";

@XendraTrl(Identifier="ec665aec-779b-3f73-e510-c93450b1a5f9")
public static String es_PE_COLUMN_C_PaySelection_ID_Name="Selección de Pago";

@XendraColumn(AD_Element_ID="79f02f46-d5fc-1851-93df-8e77a06c5431",ColumnName="C_PaySelection_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ec665aec-779b-3f73-e510-c93450b1a5f9",
Synchronized="2019-08-30 22:22:00.0")
/** Column name C_PaySelection_ID */
public static final String COLUMNNAME_C_PaySelection_ID = "C_PaySelection_ID";
/** Set Discount Amount.
@param DiscountAmt Calculated amount of discount */
public void setDiscountAmt (BigDecimal DiscountAmt)
{
if (DiscountAmt == null) throw new IllegalArgumentException ("DiscountAmt is mandatory.");
set_Value (COLUMNNAME_DiscountAmt, DiscountAmt);
}
/** Get Discount Amount.
@return Calculated amount of discount */
public BigDecimal getDiscountAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_DiscountAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="28e361fc-b64a-2fd0-65ff-1ebc144d9962")
public static String es_PE_FIELD_PreparedPayment_DiscountAmount_Name="Total del Descuento";

@XendraTrl(Identifier="28e361fc-b64a-2fd0-65ff-1ebc144d9962")
public static String es_PE_FIELD_PreparedPayment_DiscountAmount_Description="Total de descuento calculado";

@XendraTrl(Identifier="28e361fc-b64a-2fd0-65ff-1ebc144d9962")
public static String es_PE_FIELD_PreparedPayment_DiscountAmount_Help="El Total descuento indica el total de descuento para un documento ó línea";

@XendraField(AD_Column_ID="DiscountAmt",IsCentrallyMaintained=true,
AD_Tab_ID="af90e217-9ba8-ec01-37ac-c70d71cffbe2",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="28e361fc-b64a-2fd0-65ff-1ebc144d9962")
public static final String FIELDNAME_PreparedPayment_DiscountAmount="28e361fc-b64a-2fd0-65ff-1ebc144d9962";

@XendraTrl(Identifier="1ef01ca4-14d0-a8bb-e82f-fa9c3b35dab0")
public static String es_PE_COLUMN_DiscountAmt_Name="Total del Descuento";

@XendraColumn(AD_Element_ID="351290a4-6d07-13cb-9132-459358217d86",ColumnName="DiscountAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1ef01ca4-14d0-a8bb-e82f-fa9c3b35dab0",
Synchronized="2019-08-30 22:22:00.0")
/** Column name DiscountAmt */
public static final String COLUMNNAME_DiscountAmt = "DiscountAmt";
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
@XendraTrl(Identifier="82b70e2f-a43c-40b3-4863-d5d0f738f468")
public static String es_PE_FIELD_PreparedPayment_DocumentNo_Name="No. del Documento";

@XendraTrl(Identifier="82b70e2f-a43c-40b3-4863-d5d0f738f468")
public static String es_PE_FIELD_PreparedPayment_DocumentNo_Description="Número de secuencia del documento para cada documento";

@XendraTrl(Identifier="82b70e2f-a43c-40b3-4863-d5d0f738f468")
public static String es_PE_FIELD_PreparedPayment_DocumentNo_Help="El número del documento es usualmente generado en automático por el sistema y determinado por el tipo del documento. Si el documento no se salva; el número preliminar se despliega entre \"<>\"";

@XendraField(AD_Column_ID="DocumentNo",IsCentrallyMaintained=true,
AD_Tab_ID="af90e217-9ba8-ec01-37ac-c70d71cffbe2",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=90,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="82b70e2f-a43c-40b3-4863-d5d0f738f468")
public static final String FIELDNAME_PreparedPayment_DocumentNo="82b70e2f-a43c-40b3-4863-d5d0f738f468";

@XendraTrl(Identifier="7a94abda-1101-e7c6-54f5-94059f44d8ba")
public static String es_PE_COLUMN_DocumentNo_Name="No. del Documento";

@XendraColumn(AD_Element_ID="e3ca6e28-702a-2722-d941-b2072a0de9cb",ColumnName="DocumentNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=2,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7a94abda-1101-e7c6-54f5-94059f44d8ba",
Synchronized="2019-08-30 22:22:00.0")
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
@XendraTrl(Identifier="579cf0ba-91cb-4ecf-8a79-799b3dd5df47")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="579cf0ba-91cb-4ecf-8a79-799b3dd5df47",
Synchronized="2019-08-30 22:22:00.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set IsGeneratedDraft.
@param IsGeneratedDraft IsGeneratedDraft */
public void setIsGeneratedDraft (boolean IsGeneratedDraft)
{
set_Value (COLUMNNAME_IsGeneratedDraft, Boolean.valueOf(IsGeneratedDraft));
}
/** Get IsGeneratedDraft.
@return IsGeneratedDraft */
public boolean isGeneratedDraft() 
{
Object oo = get_Value(COLUMNNAME_IsGeneratedDraft);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="4d1dfa7f-58a2-27e4-fc1e-5bb02ae95fa8")
public static String es_PE_COLUMN_IsGeneratedDraft_Name="IsGeneratedDraft";

@XendraColumn(AD_Element_ID="a41e15d4-14c8-6593-5ea3-52d2890b26bf",ColumnName="IsGeneratedDraft",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4d1dfa7f-58a2-27e4-fc1e-5bb02ae95fa8",
Synchronized="2019-08-30 22:22:00.0")
/** Column name IsGeneratedDraft */
public static final String COLUMNNAME_IsGeneratedDraft = "IsGeneratedDraft";
/** Set Printed.
@param IsPrinted Indicates if this document / line is printed */
public void setIsPrinted (boolean IsPrinted)
{
set_Value (COLUMNNAME_IsPrinted, Boolean.valueOf(IsPrinted));
}
/** Get Printed.
@return Indicates if this document / line is printed */
public boolean isPrinted() 
{
Object oo = get_Value(COLUMNNAME_IsPrinted);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="40f157cd-2f3a-9973-3e8b-f9cd642b2e33")
public static String es_PE_FIELD_PreparedPayment_Printed_Name="Impreso";

@XendraTrl(Identifier="40f157cd-2f3a-9973-3e8b-f9cd642b2e33")
public static String es_PE_FIELD_PreparedPayment_Printed_Description="Indica si este documento es impreso.";

@XendraTrl(Identifier="40f157cd-2f3a-9973-3e8b-f9cd642b2e33")
public static String es_PE_FIELD_PreparedPayment_Printed_Help="El cuadro de verificación impreso indica si este documento se imprimirá.";

@XendraField(AD_Column_ID="IsPrinted",IsCentrallyMaintained=true,
AD_Tab_ID="af90e217-9ba8-ec01-37ac-c70d71cffbe2",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="40f157cd-2f3a-9973-3e8b-f9cd642b2e33")
public static final String FIELDNAME_PreparedPayment_Printed="40f157cd-2f3a-9973-3e8b-f9cd642b2e33";

@XendraTrl(Identifier="de227bbb-986f-19f7-a952-498f53f98cc6")
public static String es_PE_COLUMN_IsPrinted_Name="Impreso";

@XendraColumn(AD_Element_ID="66795cb3-a608-19bb-8cde-40abe30a0130",ColumnName="IsPrinted",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="de227bbb-986f-19f7-a952-498f53f98cc6",
Synchronized="2019-08-30 22:22:00.0")
/** Column name IsPrinted */
public static final String COLUMNNAME_IsPrinted = "IsPrinted";
/** Set Receipt.
@param IsReceipt This is a sales transaction (receipt) */
public void setIsReceipt (boolean IsReceipt)
{
set_Value (COLUMNNAME_IsReceipt, Boolean.valueOf(IsReceipt));
}
/** Get Receipt.
@return This is a sales transaction (receipt) */
public boolean isReceipt() 
{
Object oo = get_Value(COLUMNNAME_IsReceipt);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="6d4bc87a-b2f1-6840-7d53-f159fd2e2b24")
public static String es_PE_FIELD_PreparedPayment_Receipt_Name="Cobros";

@XendraTrl(Identifier="6d4bc87a-b2f1-6840-7d53-f159fd2e2b24")
public static String es_PE_FIELD_PreparedPayment_Receipt_Description="Ésta es una transacción de ventas (Cobros)";

@XendraField(AD_Column_ID="IsReceipt",IsCentrallyMaintained=true,
AD_Tab_ID="af90e217-9ba8-ec01-37ac-c70d71cffbe2",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6d4bc87a-b2f1-6840-7d53-f159fd2e2b24")
public static final String FIELDNAME_PreparedPayment_Receipt="6d4bc87a-b2f1-6840-7d53-f159fd2e2b24";

@XendraTrl(Identifier="9293606e-3098-d094-5e5e-369abd9ff3e0")
public static String es_PE_COLUMN_IsReceipt_Name="Cobros";

@XendraColumn(AD_Element_ID="68c0f386-4097-c612-05c3-316e89cb3692",ColumnName="IsReceipt",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9293606e-3098-d094-5e5e-369abd9ff3e0",
Synchronized="2019-08-30 22:22:00.0")
/** Column name IsReceipt */
public static final String COLUMNNAME_IsReceipt = "IsReceipt";
/** Set Payment amount.
@param PayAmt Amount being paid */
public void setPayAmt (BigDecimal PayAmt)
{
if (PayAmt == null) throw new IllegalArgumentException ("PayAmt is mandatory.");
set_Value (COLUMNNAME_PayAmt, PayAmt);
}
/** Get Payment amount.
@return Amount being paid */
public BigDecimal getPayAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PayAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="0a4686df-55d8-8901-5898-66dfdcb5f325")
public static String es_PE_FIELD_PreparedPayment_PaymentAmount_Name="Total del Pago";

@XendraTrl(Identifier="0a4686df-55d8-8901-5898-66dfdcb5f325")
public static String es_PE_FIELD_PreparedPayment_PaymentAmount_Description="Total siendo pagado";

@XendraTrl(Identifier="0a4686df-55d8-8901-5898-66dfdcb5f325")
public static String es_PE_FIELD_PreparedPayment_PaymentAmount_Help="Indica el total a pagar. El total del pago puede ser para una factura simple, múltiple ó un pago parcial de una factura.";

@XendraField(AD_Column_ID="PayAmt",IsCentrallyMaintained=true,
AD_Tab_ID="af90e217-9ba8-ec01-37ac-c70d71cffbe2",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0a4686df-55d8-8901-5898-66dfdcb5f325")
public static final String FIELDNAME_PreparedPayment_PaymentAmount="0a4686df-55d8-8901-5898-66dfdcb5f325";

@XendraTrl(Identifier="9134e25c-f811-9d4d-a4e5-b4c3b8603114")
public static String es_PE_COLUMN_PayAmt_Name="Total del Pago";

@XendraColumn(AD_Element_ID="9e9a0ba1-2d71-67e7-e0f1-0309fd537c8b",ColumnName="PayAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9134e25c-f811-9d4d-a4e5-b4c3b8603114",
Synchronized="2019-08-30 22:22:00.0")
/** Column name PayAmt */
public static final String COLUMNNAME_PayAmt = "PayAmt";
/** Set Payment Rule.
@param PaymentRule How you pay the invoice */
public void setPaymentRule (String PaymentRule)
{
if (PaymentRule.length() > 1)
{
log.warning("Length > 1 - truncated");
PaymentRule = PaymentRule.substring(0,0);
}
set_Value (COLUMNNAME_PaymentRule, PaymentRule);
}
/** Get Payment Rule.
@return How you pay the invoice */
public String getPaymentRule() 
{
return (String)get_Value(COLUMNNAME_PaymentRule);
}

@XendraTrl(Identifier="b382ed9c-d33e-38c2-47fa-7772cf047eaf")
public static String es_PE_FIELD_PreparedPayment_PaymentRule_Name="Regla de Pago";

@XendraTrl(Identifier="b382ed9c-d33e-38c2-47fa-7772cf047eaf")
public static String es_PE_FIELD_PreparedPayment_PaymentRule_Description="Como se pagará la factura";

@XendraTrl(Identifier="b382ed9c-d33e-38c2-47fa-7772cf047eaf")
public static String es_PE_FIELD_PreparedPayment_PaymentRule_Help="La Regla de Pagos indica el método de pago de la factura";

@XendraField(AD_Column_ID="PaymentRule",IsCentrallyMaintained=true,
AD_Tab_ID="af90e217-9ba8-ec01-37ac-c70d71cffbe2",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b382ed9c-d33e-38c2-47fa-7772cf047eaf")
public static final String FIELDNAME_PreparedPayment_PaymentRule="b382ed9c-d33e-38c2-47fa-7772cf047eaf";

@XendraTrl(Identifier="e4db1cf0-ade0-0f09-5168-05aefaee5379")
public static String es_PE_COLUMN_PaymentRule_Name="Regla de Pago";

@XendraColumn(AD_Element_ID="5074db21-c657-2d23-63dc-80f0c5f2d4cc",ColumnName="PaymentRule",
AD_Reference_ID=17,AD_Reference_Value_ID="ac003b85-a929-cc48-3def-1a8f7b1adc7b",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="e4db1cf0-ade0-0f09-5168-05aefaee5379",Synchronized="2019-08-30 22:22:00.0")
/** Column name PaymentRule */
public static final String COLUMNNAME_PaymentRule = "PaymentRule";
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

@XendraTrl(Identifier="607d1bc2-7e91-3530-dddf-f3c395bbd90f")
public static String es_PE_FIELD_PreparedPayment_Processed_Name="Procesado";

@XendraTrl(Identifier="607d1bc2-7e91-3530-dddf-f3c395bbd90f")
public static String es_PE_FIELD_PreparedPayment_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="607d1bc2-7e91-3530-dddf-f3c395bbd90f")
public static String es_PE_FIELD_PreparedPayment_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="af90e217-9ba8-ec01-37ac-c70d71cffbe2",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="607d1bc2-7e91-3530-dddf-f3c395bbd90f")
public static final String FIELDNAME_PreparedPayment_Processed="607d1bc2-7e91-3530-dddf-f3c395bbd90f";

@XendraTrl(Identifier="2cac4989-1cdd-7854-2f30-d68f31f260e4")
public static String es_PE_COLUMN_Processed_Name="Procesado";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2cac4989-1cdd-7854-2f30-d68f31f260e4",
Synchronized="2019-08-30 22:22:00.0")
/** Column name Processed */
public static final String COLUMNNAME_Processed = "Processed";
/** Set Quantity.
@param Qty Quantity */
public void setQty (int Qty)
{
set_Value (COLUMNNAME_Qty, Integer.valueOf(Qty));
}
/** Get Quantity.
@return Quantity */
public int getQty() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Qty);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="bef781c4-68c3-29ac-7492-ddaec9a47862")
public static String es_PE_FIELD_PreparedPayment_Quantity_Name="Cantidad";

@XendraTrl(Identifier="bef781c4-68c3-29ac-7492-ddaec9a47862")
public static String es_PE_FIELD_PreparedPayment_Quantity_Description="Cantidad";

@XendraTrl(Identifier="bef781c4-68c3-29ac-7492-ddaec9a47862")
public static String es_PE_FIELD_PreparedPayment_Quantity_Help="La Cantidad indica el número de un producto específico o artículo para este documento";

@XendraField(AD_Column_ID="Qty",IsCentrallyMaintained=true,
AD_Tab_ID="af90e217-9ba8-ec01-37ac-c70d71cffbe2",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bef781c4-68c3-29ac-7492-ddaec9a47862")
public static final String FIELDNAME_PreparedPayment_Quantity="bef781c4-68c3-29ac-7492-ddaec9a47862";

@XendraTrl(Identifier="3e9cad2e-eacf-db5e-e5f4-88214f3e1bb0")
public static String es_PE_COLUMN_Qty_Name="Cantidad";

@XendraColumn(AD_Element_ID="c9d74a25-87c5-9592-5660-4f397607dad3",ColumnName="Qty",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3e9cad2e-eacf-db5e-e5f4-88214f3e1bb0",
Synchronized="2019-08-30 22:22:00.0")
/** Column name Qty */
public static final String COLUMNNAME_Qty = "Qty";
}
