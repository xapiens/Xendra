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
/** Generated Model for M_RMA
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_RMA extends PO
{
/** Standard Constructor
@param ctx context
@param M_RMA_ID id
@param trxName transaction
*/
public X_M_RMA (Properties ctx, int M_RMA_ID, String trxName)
{
super (ctx, M_RMA_ID, trxName);
/** if (M_RMA_ID == 0)
{
setC_DocType_ID (0);
setDocAction (null);	
// CO
setDocStatus (null);	
// DR
setDocumentNo (null);
setIsApproved (false);	
// N
setIsSOTrx (false);	
// N
setM_InOut_ID (0);
setM_RMA_ID (0);
setM_RMAType_ID (0);
setName (null);
setProcessed (false);	
// N
setSalesRep_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_M_RMA (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=661 */
public static int Table_ID=MTable.getTable_ID("M_RMA");

@XendraTrl(Identifier="ffa4628f-94f1-ad68-e661-525bc5c0e92f")
public static String es_PE_TAB_RMA_Description="Autorización de Devolución de Material";

@XendraTrl(Identifier="ffa4628f-94f1-ad68-e661-525bc5c0e92f")
public static String es_PE_TAB_RMA_Name="Devolución de Material";

@XendraTrl(Identifier="ffa4628f-94f1-ad68-e661-525bc5c0e92f")
public static String es_PE_TAB_RMA_Help="Una Autorización de Devolución de Material puede ser requerida para crear notas de crédito.";

@XendraTab(Name="RMA",Description="Return Material Authorization",
Help="A Return Material Authorization may be required to accept returns and to create Credit Memos",
AD_Window_ID="f9fb62fb-17c7-fd5a-e51e-c90c208c467b",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="ffa4628f-94f1-ad68-e661-525bc5c0e92f",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_RMA="ffa4628f-94f1-ad68-e661-525bc5c0e92f";

@XendraTrl(Identifier="de97f267-09f6-808a-c801-be8eab1a3acd")
public static String es_PE_TABLE_M_RMA_Name="ADM (RMA)";

@XendraTable(Name="RMA",Description="Return Material Authorization",Help="",TableName="M_RMA",
AccessLevel="1",AD_Window_ID="f9fb62fb-17c7-fd5a-e51e-c90c208c467b",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=130,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.material",
Identifier="de97f267-09f6-808a-c801-be8eab1a3acd",Synchronized="2017-08-16 11:43:33.0")
/** TableName=M_RMA */
public static final String Table_Name="M_RMA";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_RMA");

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
    Table_ID = MTable.getTable_ID("M_RMA");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_RMA[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Amount.
@param Amt Amount */
public void setAmt (BigDecimal Amt)
{
set_Value (COLUMNNAME_Amt, Amt);
}
/** Get Amount.
@return Amount */
public BigDecimal getAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Amt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="a74eecfd-b963-24f7-411f-8584ab3103c5")
public static String es_PE_FIELD_RMA_Amount_Description="Total límite para el envío de facturas";

@XendraTrl(Identifier="a74eecfd-b963-24f7-411f-8584ab3103c5")
public static String es_PE_FIELD_RMA_Amount_Help="El campo total indica el límite en el que las facturas no serán generadas. Si el total total de la factura esta por debajo de este total; la factura  no será enviada en esta corrida programada. Este campo es solamente desplegado si el cuadro de verificación de total límite es seleccionado";

@XendraTrl(Identifier="a74eecfd-b963-24f7-411f-8584ab3103c5")
public static String es_PE_FIELD_RMA_Amount_Name="Total";
@XendraField(AD_Column_ID="Amt",
IsCentrallyMaintained=true,AD_Tab_ID="ffa4628f-94f1-ad68-e661-525bc5c0e92f",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=120,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="a74eecfd-b963-24f7-411f-8584ab3103c5")
public static final String FIELDNAME_RMA_Amount="a74eecfd-b963-24f7-411f-8584ab3103c5";

@XendraTrl(Identifier="edef2bd7-9ee9-76ef-1662-cd4d6461c4ff")
public static String es_PE_COLUMN_Amt_Name="Total";

@XendraColumn(AD_Element_ID="42827f15-aceb-2f14-cc38-b4a7c6022136",ColumnName="Amt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="edef2bd7-9ee9-76ef-1662-cd4d6461c4ff",
Synchronized="2017-08-05 16:55:31.0")
/** Column name Amt */
public static final String COLUMNNAME_Amt = "Amt";
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

@XendraTrl(Identifier="0071fc27-ef07-5d18-7c3a-e660c933319a")
public static String es_PE_FIELD_RMA_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="0071fc27-ef07-5d18-7c3a-e660c933319a")
public static String es_PE_FIELD_RMA_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraTrl(Identifier="0071fc27-ef07-5d18-7c3a-e660c933319a")
public static String es_PE_FIELD_RMA_BusinessPartner_Name="Socio de Negocio";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ffa4628f-94f1-ad68-e661-525bc5c0e92f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0071fc27-ef07-5d18-7c3a-e660c933319a")
public static final String FIELDNAME_RMA_BusinessPartner="0071fc27-ef07-5d18-7c3a-e660c933319a";

@XendraTrl(Identifier="1708ac34-479d-09fe-c59d-1a5090754a0a")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Socio de Negocio";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="06fdbbe9-e1c4-3ee4-4a9d-73d1a990cc42",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="1708ac34-479d-09fe-c59d-1a5090754a0a",Synchronized="2017-08-05 16:55:31.0")
/** Column name C_BPartner_ID */
public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
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

@XendraTrl(Identifier="8152b421-90d0-a70e-7077-361a288d7f1c")
public static String es_PE_FIELD_RMA_Currency_Description="Moneda para este registro";

@XendraTrl(Identifier="8152b421-90d0-a70e-7077-361a288d7f1c")
public static String es_PE_FIELD_RMA_Currency_Help="Indica la moneda a ser usada cuando se procese ó Informe este registro";

@XendraTrl(Identifier="8152b421-90d0-a70e-7077-361a288d7f1c")
public static String es_PE_FIELD_RMA_Currency_Name="Moneda";

@XendraField(AD_Column_ID="C_Currency_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ffa4628f-94f1-ad68-e661-525bc5c0e92f",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8152b421-90d0-a70e-7077-361a288d7f1c")
public static final String FIELDNAME_RMA_Currency="8152b421-90d0-a70e-7077-361a288d7f1c";

@XendraTrl(Identifier="7d80e781-6552-ebe4-b942-939f5f342fe4")
public static String es_PE_COLUMN_C_Currency_ID_Name="Moneda";

@XendraColumn(AD_Element_ID="8daec488-bca2-50fe-f9de-abf0cba2a34a",ColumnName="C_Currency_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7d80e781-6552-ebe4-b942-939f5f342fe4",
Synchronized="2017-08-05 16:55:31.0")
/** Column name C_Currency_ID */
public static final String COLUMNNAME_C_Currency_ID = "C_Currency_ID";

/** C_DocType_ID AD_Reference=8ed1e524-7705-819d-013c-a3306be80529 */
public static final int C_DOCTYPE_ID_AD_Reference_ID=321;
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

@XendraTrl(Identifier="26fcfe48-fa08-0165-10f7-7f4f1f689063")
public static String es_PE_FIELD_RMA_DocumentType_Description="Tipo de documento ó reglas";

@XendraTrl(Identifier="26fcfe48-fa08-0165-10f7-7f4f1f689063")
public static String es_PE_FIELD_RMA_DocumentType_Help="El tipo de documento determina la secuencia del documento y las reglas de proceso";

@XendraTrl(Identifier="26fcfe48-fa08-0165-10f7-7f4f1f689063")
public static String es_PE_FIELD_RMA_DocumentType_Name="Tipo de Documento";

@XendraField(AD_Column_ID="C_DocType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ffa4628f-94f1-ad68-e661-525bc5c0e92f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="26fcfe48-fa08-0165-10f7-7f4f1f689063")
public static final String FIELDNAME_RMA_DocumentType="26fcfe48-fa08-0165-10f7-7f4f1f689063";

@XendraTrl(Identifier="44f6c31e-aa3b-47d7-276b-50a1f7a18474")
public static String es_PE_COLUMN_C_DocType_ID_Name="Tipo de Documento";

@XendraColumn(AD_Element_ID="099a4147-1a72-cdd0-81e0-8bdbc8c0b883",ColumnName="C_DocType_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="8ed1e524-7705-819d-013c-a3306be80529",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="44f6c31e-aa3b-47d7-276b-50a1f7a18474",Synchronized="2017-08-05 16:55:31.0")
/** Column name C_DocType_ID */
public static final String COLUMNNAME_C_DocType_ID = "C_DocType_ID";
/** Set Order.
@param C_Order_ID Order */
public void setC_Order_ID (int C_Order_ID)
{
if (C_Order_ID <= 0) set_ValueNoCheck (COLUMNNAME_C_Order_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_C_Order_ID, Integer.valueOf(C_Order_ID));
}
/** Get Order.
@return Order */
public int getC_Order_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Order_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="0d898d84-0bca-547d-6f5f-1e19536c6c6f")
public static String es_PE_FIELD_RMA_Order_Description="Orden de Venta";

@XendraTrl(Identifier="0d898d84-0bca-547d-6f5f-1e19536c6c6f")
public static String es_PE_FIELD_RMA_Order_Help="La ID de la orden de ventas es un identificador único de la orden de ventas; Ésta es controlada por la secuencia del documento para este tipo de documento.";

@XendraTrl(Identifier="0d898d84-0bca-547d-6f5f-1e19536c6c6f")
public static String es_PE_FIELD_RMA_Order_Name="Orden de Venta";

@XendraField(AD_Column_ID="C_Order_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ffa4628f-94f1-ad68-e661-525bc5c0e92f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@Processed@=Y",DisplayLength=26,IsReadOnly=true,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0d898d84-0bca-547d-6f5f-1e19536c6c6f")
public static final String FIELDNAME_RMA_Order="0d898d84-0bca-547d-6f5f-1e19536c6c6f";

@XendraTrl(Identifier="726b2f22-abfd-facc-9548-9c11060967ea")
public static String es_PE_COLUMN_C_Order_ID_Name="Orden de Venta";

@XendraColumn(AD_Element_ID="cc846c60-90b8-6aad-9d07-b5d0c0328787",ColumnName="C_Order_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="726b2f22-abfd-facc-9548-9c11060967ea",
Synchronized="2017-08-05 16:55:31.0")
/** Column name C_Order_ID */
public static final String COLUMNNAME_C_Order_ID = "C_Order_ID";
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

@XendraTrl(Identifier="49aa2617-c055-21ec-8d26-ae8acef54949")
public static String es_PE_FIELD_RMA_Description_Description="Observación";

@XendraTrl(Identifier="49aa2617-c055-21ec-8d26-ae8acef54949")
public static String es_PE_FIELD_RMA_Description_Help="Observación";

@XendraTrl(Identifier="49aa2617-c055-21ec-8d26-ae8acef54949")
public static String es_PE_FIELD_RMA_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="ffa4628f-94f1-ad68-e661-525bc5c0e92f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="49aa2617-c055-21ec-8d26-ae8acef54949")
public static final String FIELDNAME_RMA_Description="49aa2617-c055-21ec-8d26-ae8acef54949";

@XendraTrl(Identifier="3c6ac85c-87a6-89a4-2e41-0d8fd68eb7b2")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3c6ac85c-87a6-89a4-2e41-0d8fd68eb7b2",
Synchronized="2017-08-05 16:55:31.0")
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

@XendraTrl(Identifier="40412b0e-9163-e9c0-9e7f-a454cf13c0f8")
public static String es_PE_FIELD_RMA_ProcessRMA_Name="Proceso ADM (RMA)";

@XendraField(AD_Column_ID="DocAction",IsCentrallyMaintained=true,
AD_Tab_ID="ffa4628f-94f1-ad68-e661-525bc5c0e92f",AD_FieldGroup_ID="Status",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="40412b0e-9163-e9c0-9e7f-a454cf13c0f8")
public static final String FIELDNAME_RMA_ProcessRMA="40412b0e-9163-e9c0-9e7f-a454cf13c0f8";

@XendraTrl(Identifier="1879911a-6291-c620-ae29-09293873eabb")
public static String es_PE_COLUMN_DocAction_Name="Acción en el Documento";

@XendraColumn(AD_Element_ID="d4b9075b-18e5-ebbb-5565-d217a7e531cb",ColumnName="DocAction",
AD_Reference_ID=28,AD_Reference_Value_ID="e397c9b0-c643-d1cd-8380-20bee13b2a6e",AD_Val_Rule_ID="",
FieldLength=2,DefaultValue="CO",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,
AD_Process_ID="733515e9-5bca-0d01-8720-565b37e3be6c",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1879911a-6291-c620-ae29-09293873eabb",
Synchronized="2017-08-05 16:55:31.0")
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

@XendraTrl(Identifier="264bd6e8-7366-3770-f8e8-cae4897362b7")
public static String es_PE_FIELD_RMA_DocumentStatus_Description="El estado actual del documento";

@XendraTrl(Identifier="264bd6e8-7366-3770-f8e8-cae4897362b7")
public static String es_PE_FIELD_RMA_DocumentStatus_Help="El estado del documento indica el estado del documento en este momento. Si usted quiere cambiar el estado de Documento; use el campo acción de documento";

@XendraTrl(Identifier="264bd6e8-7366-3770-f8e8-cae4897362b7")
public static String es_PE_FIELD_RMA_DocumentStatus_Name="Estado del Documento";

@XendraField(AD_Column_ID="DocStatus",IsCentrallyMaintained=true,
AD_Tab_ID="ffa4628f-94f1-ad68-e661-525bc5c0e92f",AD_FieldGroup_ID="Status",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="264bd6e8-7366-3770-f8e8-cae4897362b7")
public static final String FIELDNAME_RMA_DocumentStatus="264bd6e8-7366-3770-f8e8-cae4897362b7";

@XendraTrl(Identifier="b8e99b57-f04a-14a4-553f-1d2c7beed305")
public static String es_PE_COLUMN_DocStatus_Name="Estado del Documento";

@XendraColumn(AD_Element_ID="e73fa537-3438-bd01-dfd4-f0f080a28c55",ColumnName="DocStatus",
AD_Reference_ID=17,AD_Reference_Value_ID="7627125d-fefe-e6bc-bb7d-4a6c772172dc",AD_Val_Rule_ID="",
FieldLength=2,DefaultValue="DR",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="b8e99b57-f04a-14a4-553f-1d2c7beed305",Synchronized="2017-08-05 16:55:31.0")
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

@XendraTrl(Identifier="4bb1f8cb-1a13-fa3d-2f53-e1a81a0cf8da")
public static String es_PE_FIELD_RMA_DocumentNo_Description="Número de secuencia del documento para cada documento";

@XendraTrl(Identifier="4bb1f8cb-1a13-fa3d-2f53-e1a81a0cf8da")
public static String es_PE_FIELD_RMA_DocumentNo_Help="El número del documento es usualmente generado en automático por el sistema y determinado por el tipo del documento. Si el documento no se salva; el número preliminar se despliega entre \"<>\"";

@XendraTrl(Identifier="4bb1f8cb-1a13-fa3d-2f53-e1a81a0cf8da")
public static String es_PE_FIELD_RMA_DocumentNo_Name="No. del Documento";

@XendraField(AD_Column_ID="DocumentNo",IsCentrallyMaintained=true,
AD_Tab_ID="ffa4628f-94f1-ad68-e661-525bc5c0e92f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=30,SortNo=-1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4bb1f8cb-1a13-fa3d-2f53-e1a81a0cf8da")
public static final String FIELDNAME_RMA_DocumentNo="4bb1f8cb-1a13-fa3d-2f53-e1a81a0cf8da";

@XendraTrl(Identifier="2b9596d7-4a06-88f1-e39a-0b63956cbd0f")
public static String es_PE_COLUMN_DocumentNo_Name="No. del Documento";

@XendraColumn(AD_Element_ID="e3ca6e28-702a-2722-d941-b2072a0de9cb",ColumnName="DocumentNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2b9596d7-4a06-88f1-e39a-0b63956cbd0f",
Synchronized="2017-08-05 16:55:31.0")
/** Column name DocumentNo */
public static final String COLUMNNAME_DocumentNo = "DocumentNo";
/** Set Comment/Help.
@param Help Comment or Hint */
public void setHelp (String Help)
{
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

@XendraTrl(Identifier="910973be-1689-3168-1ae7-2fc0c91b10af")
public static String es_PE_FIELD_RMA_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="910973be-1689-3168-1ae7-2fc0c91b10af")
public static String es_PE_FIELD_RMA_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraTrl(Identifier="910973be-1689-3168-1ae7-2fc0c91b10af")
public static String es_PE_FIELD_RMA_CommentHelp_Name="Ayuda";
@XendraField(AD_Column_ID="Help",
IsCentrallyMaintained=true,AD_Tab_ID="ffa4628f-94f1-ad68-e661-525bc5c0e92f",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="910973be-1689-3168-1ae7-2fc0c91b10af")
public static final String FIELDNAME_RMA_CommentHelp="910973be-1689-3168-1ae7-2fc0c91b10af";

@XendraTrl(Identifier="8fd41adf-547b-7b83-04c6-1e9b5e0acb4d")
public static String es_PE_COLUMN_Help_Name="Ayuda";

@XendraColumn(AD_Element_ID="a6fda582-56f9-6bb7-8436-285ce4f8de3f",ColumnName="Help",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8fd41adf-547b-7b83-04c6-1e9b5e0acb4d",
Synchronized="2017-08-05 16:55:31.0")
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
@XendraTrl(Identifier="379012a6-132b-46c1-8323-7d77ec89f820")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="379012a6-132b-46c1-8323-7d77ec89f820",
Synchronized="2017-08-05 16:55:31.0")
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

@XendraTrl(Identifier="fdc8924c-abb0-27fb-3fc5-bd3351a9bcc7")
public static String es_PE_FIELD_RMA_Approved_Description="Indica si este documento requiere aprobación";

@XendraTrl(Identifier="fdc8924c-abb0-27fb-3fc5-bd3351a9bcc7")
public static String es_PE_FIELD_RMA_Approved_Help="El Cuadro de Verificación  Aprobado indica si este documento requiere aprobación antes de que pueda ser procesado";

@XendraTrl(Identifier="fdc8924c-abb0-27fb-3fc5-bd3351a9bcc7")
public static String es_PE_FIELD_RMA_Approved_Name="Aprobación";

@XendraField(AD_Column_ID="IsApproved",IsCentrallyMaintained=true,
AD_Tab_ID="ffa4628f-94f1-ad68-e661-525bc5c0e92f",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fdc8924c-abb0-27fb-3fc5-bd3351a9bcc7")
public static final String FIELDNAME_RMA_Approved="fdc8924c-abb0-27fb-3fc5-bd3351a9bcc7";

@XendraTrl(Identifier="d08b8c22-bd2e-393e-4e17-189296f8d9f5")
public static String es_PE_COLUMN_IsApproved_Name="Aprobación";

@XendraColumn(AD_Element_ID="44388d99-07b7-b005-9e16-78884800beff",ColumnName="IsApproved",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d08b8c22-bd2e-393e-4e17-189296f8d9f5",
Synchronized="2017-08-05 16:55:31.0")
/** Column name IsApproved */
public static final String COLUMNNAME_IsApproved = "IsApproved";
/** Set Sales Transaction.
@param IsSOTrx This is a Sales Transaction */
public void setIsSOTrx (boolean IsSOTrx)
{
set_Value (COLUMNNAME_IsSOTrx, Boolean.valueOf(IsSOTrx));
}
/** Get Sales Transaction.
@return This is a Sales Transaction */
public boolean isSOTrx() 
{
Object oo = get_Value(COLUMNNAME_IsSOTrx);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="7ad7f5e1-99c9-64c1-ddd3-a8e5a9b14821")
public static String es_PE_COLUMN_IsSOTrx_Name="Sales Transaction";

@XendraColumn(AD_Element_ID="4084b69f-a51d-5676-4d8c-395a13e6b2df",ColumnName="IsSOTrx",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7ad7f5e1-99c9-64c1-ddd3-a8e5a9b14821",
Synchronized="2017-08-05 16:55:31.0")
/** Column name IsSOTrx */
public static final String COLUMNNAME_IsSOTrx = "IsSOTrx";
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

@XendraTrl(Identifier="9d1217fe-e12e-8430-b493-aaa016eab174")
public static String es_PE_FIELD_RMA_ShipmentReceipt_Description="Entrega ó documento de recibo";

@XendraTrl(Identifier="9d1217fe-e12e-8430-b493-aaa016eab174")
public static String es_PE_FIELD_RMA_ShipmentReceipt_Help="La ID de Entrega / Recibo indica el documento único para esta entrega ó recibo";

@XendraTrl(Identifier="9d1217fe-e12e-8430-b493-aaa016eab174")
public static String es_PE_FIELD_RMA_ShipmentReceipt_Name="Entrega / Recibo";

@XendraField(AD_Column_ID="M_InOut_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ffa4628f-94f1-ad68-e661-525bc5c0e92f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9d1217fe-e12e-8430-b493-aaa016eab174")
public static final String FIELDNAME_RMA_ShipmentReceipt="9d1217fe-e12e-8430-b493-aaa016eab174";

@XendraTrl(Identifier="a3cfa9cb-0210-f01d-590e-ccac753bb116")
public static String es_PE_COLUMN_M_InOut_ID_Name="Entrega / Recibo";

@XendraColumn(AD_Element_ID="5c1a0edf-01a0-832e-098b-d49510db71db",ColumnName="M_InOut_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a3cfa9cb-0210-f01d-590e-ccac753bb116",
Synchronized="2017-08-05 16:55:31.0")
/** Column name M_InOut_ID */
public static final String COLUMNNAME_M_InOut_ID = "M_InOut_ID";
/** Set RMA.
@param M_RMA_ID Return Material Authorization */
public void setM_RMA_ID (int M_RMA_ID)
{
if (M_RMA_ID < 1) throw new IllegalArgumentException ("M_RMA_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_RMA_ID, Integer.valueOf(M_RMA_ID));
}
/** Get RMA.
@return Return Material Authorization */
public int getM_RMA_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_RMA_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="af2b441d-4689-26bd-f184-d1251bb827f1")
public static String es_PE_FIELD_RMA_RMA_Description="Autorización de Devolución de Material";

@XendraTrl(Identifier="af2b441d-4689-26bd-f184-d1251bb827f1")
public static String es_PE_FIELD_RMA_RMA_Help="La Autorización de Devolución de Material se requiere para aceptar devoluciones y para crear memos de credito.";

@XendraTrl(Identifier="af2b441d-4689-26bd-f184-d1251bb827f1")
public static String es_PE_FIELD_RMA_RMA_Name="ADM (RMA)";
@XendraField(AD_Column_ID="M_RMA_ID",
IsCentrallyMaintained=true,AD_Tab_ID="ffa4628f-94f1-ad68-e661-525bc5c0e92f",AD_FieldGroup_ID="",
IsDisplayed=false,DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="af2b441d-4689-26bd-f184-d1251bb827f1")
public static final String FIELDNAME_RMA_RMA="af2b441d-4689-26bd-f184-d1251bb827f1";
/** Column name M_RMA_ID */
public static final String COLUMNNAME_M_RMA_ID = "M_RMA_ID";
/** Set RMA Type.
@param M_RMAType_ID Return Material Authorization Type */
public void setM_RMAType_ID (int M_RMAType_ID)
{
if (M_RMAType_ID < 1) throw new IllegalArgumentException ("M_RMAType_ID is mandatory.");
set_Value (COLUMNNAME_M_RMAType_ID, Integer.valueOf(M_RMAType_ID));
}
/** Get RMA Type.
@return Return Material Authorization Type */
public int getM_RMAType_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_RMAType_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f80bb2df-6e4b-f0ce-1eba-8e610c728985")
public static String es_PE_FIELD_RMA_RMAType_Description="Tipo Autorización de Devolución de Material";

@XendraTrl(Identifier="f80bb2df-6e4b-f0ce-1eba-8e610c728985")
public static String es_PE_FIELD_RMA_RMAType_Help="Tipos de ADM (RMA)";

@XendraTrl(Identifier="f80bb2df-6e4b-f0ce-1eba-8e610c728985")
public static String es_PE_FIELD_RMA_RMAType_Name="Tipo de ADM (RMA)";

@XendraField(AD_Column_ID="M_RMAType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ffa4628f-94f1-ad68-e661-525bc5c0e92f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f80bb2df-6e4b-f0ce-1eba-8e610c728985")
public static final String FIELDNAME_RMA_RMAType="f80bb2df-6e4b-f0ce-1eba-8e610c728985";

@XendraTrl(Identifier="02c4cfc7-21f3-5668-3106-a8efd05c45e3")
public static String es_PE_COLUMN_M_RMAType_ID_Name="Tipo de ADM (RMA)";

@XendraColumn(AD_Element_ID="d39b123b-4de6-f27d-da3e-874e06101394",ColumnName="M_RMAType_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="02c4cfc7-21f3-5668-3106-a8efd05c45e3",
Synchronized="2017-08-05 16:55:31.0")
/** Column name M_RMAType_ID */
public static final String COLUMNNAME_M_RMAType_ID = "M_RMAType_ID";
/** Set Name.
@param Name Alphanumeric identifier of the entity */
public void setName (String Name)
{
if (Name == null) throw new IllegalArgumentException ("Name is mandatory.");
if (Name.length() > 60)
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
@XendraTrl(Identifier="63eaec9e-3ab6-1829-471e-5ca4c4418fb1")
public static String es_PE_FIELD_RMA_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="63eaec9e-3ab6-1829-471e-5ca4c4418fb1")
public static String es_PE_FIELD_RMA_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="63eaec9e-3ab6-1829-471e-5ca4c4418fb1")
public static String es_PE_FIELD_RMA_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="ffa4628f-94f1-ad68-e661-525bc5c0e92f",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="63eaec9e-3ab6-1829-471e-5ca4c4418fb1")
public static final String FIELDNAME_RMA_Name="63eaec9e-3ab6-1829-471e-5ca4c4418fb1";

@XendraTrl(Identifier="fceb923b-602f-7d77-b679-e0561072cbe1")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fceb923b-602f-7d77-b679-e0561072cbe1",
Synchronized="2017-08-05 16:55:31.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
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

@XendraTrl(Identifier="9db4aee6-4080-5ee7-90f2-f149b1e11e65")
public static String es_PE_FIELD_RMA_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="9db4aee6-4080-5ee7-90f2-f149b1e11e65")
public static String es_PE_FIELD_RMA_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraTrl(Identifier="9db4aee6-4080-5ee7-90f2-f149b1e11e65")
public static String es_PE_FIELD_RMA_Processed_Name="Procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="ffa4628f-94f1-ad68-e661-525bc5c0e92f",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9db4aee6-4080-5ee7-90f2-f149b1e11e65")
public static final String FIELDNAME_RMA_Processed="9db4aee6-4080-5ee7-90f2-f149b1e11e65";

@XendraTrl(Identifier="c92fcbd9-e768-8172-00cd-16037343f6f2")
public static String es_PE_COLUMN_Processed_Name="Procesado";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c92fcbd9-e768-8172-00cd-16037343f6f2",
Synchronized="2017-08-05 16:55:31.0")
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

@XendraTrl(Identifier="9dfe178d-c9fa-19bd-7324-657c430d4a28")
public static String es_PE_FIELD_RMA_ProcessNow_Name="Procesar Ahora";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="ffa4628f-94f1-ad68-e661-525bc5c0e92f",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9dfe178d-c9fa-19bd-7324-657c430d4a28")
public static final String FIELDNAME_RMA_ProcessNow="9dfe178d-c9fa-19bd-7324-657c430d4a28";

@XendraTrl(Identifier="a4f83f3a-2f19-3490-8402-20f0e846b87c")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a4f83f3a-2f19-3490-8402-20f0e846b87c",
Synchronized="2017-08-05 16:55:31.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";

/** SalesRep_ID AD_Reference=15251147-a1b6-4a83-a3a5-2d3ae7db69d9 */
public static final int SALESREP_ID_AD_Reference_ID=190;
/** Set Sales Representative.
@param SalesRep_ID Sales Representative or Company Agent */
public void setSalesRep_ID (int SalesRep_ID)
{
if (SalesRep_ID < 1) throw new IllegalArgumentException ("SalesRep_ID is mandatory.");
set_Value (COLUMNNAME_SalesRep_ID, Integer.valueOf(SalesRep_ID));
}
/** Get Sales Representative.
@return Sales Representative or Company Agent */
public int getSalesRep_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_SalesRep_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="9009fe4c-7291-cf9a-7052-6b8d42a8f8c7")
public static String es_PE_FIELD_RMA_SalesRepresentative_Description="Representante de Ventas";

@XendraTrl(Identifier="9009fe4c-7291-cf9a-7052-6b8d42a8f8c7")
public static String es_PE_FIELD_RMA_SalesRepresentative_Help="El representante de ventas indica el representante de ventas para esta región.";

@XendraTrl(Identifier="9009fe4c-7291-cf9a-7052-6b8d42a8f8c7")
public static String es_PE_FIELD_RMA_SalesRepresentative_Name="Agente Cía";

@XendraField(AD_Column_ID="SalesRep_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ffa4628f-94f1-ad68-e661-525bc5c0e92f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9009fe4c-7291-cf9a-7052-6b8d42a8f8c7")
public static final String FIELDNAME_RMA_SalesRepresentative="9009fe4c-7291-cf9a-7052-6b8d42a8f8c7";

@XendraTrl(Identifier="0c6b032f-b1bb-f0ec-04ad-8b6d1c57017a")
public static String es_PE_COLUMN_SalesRep_ID_Name="Agente Cía";

@XendraColumn(AD_Element_ID="197a9c3a-ff10-c291-d65f-5e05a36d3710",ColumnName="SalesRep_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="15251147-a1b6-4a83-a3a5-2d3ae7db69d9",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="0c6b032f-b1bb-f0ec-04ad-8b6d1c57017a",Synchronized="2017-08-05 16:55:31.0")
/** Column name SalesRep_ID */
public static final String COLUMNNAME_SalesRep_ID = "SalesRep_ID";
}
