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
/** Generated Model for C_Coupon
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_Coupon extends PO
{
/** Standard Constructor
@param ctx context
@param C_Coupon_ID id
@param trxName transaction
*/
public X_C_Coupon (Properties ctx, int C_Coupon_ID, String trxName)
{
super (ctx, C_Coupon_ID, trxName);
/** if (C_Coupon_ID == 0)
{
setC_BPartner_ID (0);
setC_Coupon_ID (0);
setC_Currency_ID (0);
setC_Invoice_ID (0);
setDocumentNo (null);
setGrandTotal (Env.ZERO);	
// 0
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
public X_C_Coupon (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000124 */
public static int Table_ID=MTable.getTable_ID("C_Coupon");

@XendraTrl(Identifier="440bbd97-b948-5fdb-ce78-d86fb9c28a5a")
public static String es_PE_TAB_Coupon_Name="Cupón";
@XendraTab(Name="Coupon",Description="",Help="",
AD_Window_ID="038deb75-6182-699a-7f6e-48283e04bed9",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="440bbd97-b948-5fdb-ce78-d86fb9c28a5a",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Coupon="440bbd97-b948-5fdb-ce78-d86fb9c28a5a";

@XendraTrl(Identifier="5b2e4bbe-fc7b-1831-bab8-48ed6c13f0b4")
public static String es_PE_TABLE_C_Coupon_Name="C_Cupon";

@XendraTable(Name="C_Coupon",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",TableName="C_Coupon",
AccessLevel="3",AD_Window_ID="038deb75-6182-699a-7f6e-48283e04bed9",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=100,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="5b2e4bbe-fc7b-1831-bab8-48ed6c13f0b4",Synchronized="2020-03-03 21:36:48.0")
/** TableName=C_Coupon */
public static final String Table_Name="C_Coupon";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_Coupon");

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
    Table_ID = MTable.getTable_ID("C_Coupon");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_Coupon[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="97d924ee-07d6-673e-af38-4e8a75d0e4c1")
public static String es_PE_FIELD_Coupon_BusinessPartner_Name="Socio de Negocio";

@XendraTrl(Identifier="97d924ee-07d6-673e-af38-4e8a75d0e4c1")
public static String es_PE_FIELD_Coupon_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="97d924ee-07d6-673e-af38-4e8a75d0e4c1")
public static String es_PE_FIELD_Coupon_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="440bbd97-b948-5fdb-ce78-d86fb9c28a5a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=70,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=true,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="97d924ee-07d6-673e-af38-4e8a75d0e4c1")
public static final String FIELDNAME_Coupon_BusinessPartner="97d924ee-07d6-673e-af38-4e8a75d0e4c1";

@XendraTrl(Identifier="bb74e5f4-4a69-2435-d8f1-6692e3629e43")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Business Partner ";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bb74e5f4-4a69-2435-d8f1-6692e3629e43",
Synchronized="2019-08-30 22:21:27.0")
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

@XendraTrl(Identifier="83ce5b0d-116d-c7f8-e921-3edb57651781")
public static String es_PE_COLUMN_C_Charge_ID_Name="Charge";

@XendraColumn(AD_Element_ID="d7e2fc48-a26e-4ded-ea44-fe15849a7883",ColumnName="C_Charge_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="83ce5b0d-116d-c7f8-e921-3edb57651781",
Synchronized="2019-08-30 22:21:27.0")
/** Column name C_Charge_ID */
public static final String COLUMNNAME_C_Charge_ID = "C_Charge_ID";
/** Set C_Coupon_ID.
@param C_Coupon_ID C_Coupon_ID */
public void setC_Coupon_ID (int C_Coupon_ID)
{
if (C_Coupon_ID < 1) throw new IllegalArgumentException ("C_Coupon_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_Coupon_ID, Integer.valueOf(C_Coupon_ID));
}
/** Get C_Coupon_ID.
@return C_Coupon_ID */
public int getC_Coupon_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Coupon_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="05430907-1e7c-271e-5eba-6f911e0eb08d")
public static String es_PE_FIELD_Coupon_C_Coupon_ID_Name="C_Coupon";

@XendraField(AD_Column_ID="C_Coupon_ID",IsCentrallyMaintained=true,
AD_Tab_ID="440bbd97-b948-5fdb-ce78-d86fb9c28a5a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="05430907-1e7c-271e-5eba-6f911e0eb08d")
public static final String FIELDNAME_Coupon_C_Coupon_ID="05430907-1e7c-271e-5eba-6f911e0eb08d";
/** Column name C_Coupon_ID */
public static final String COLUMNNAME_C_Coupon_ID = "C_Coupon_ID";
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

@XendraTrl(Identifier="5fed448b-8b8f-5f5b-5718-603b25afca60")
public static String es_PE_FIELD_Coupon_Currency_Name="Moneda";

@XendraTrl(Identifier="5fed448b-8b8f-5f5b-5718-603b25afca60")
public static String es_PE_FIELD_Coupon_Currency_Description="Moneda para este registro";

@XendraTrl(Identifier="5fed448b-8b8f-5f5b-5718-603b25afca60")
public static String es_PE_FIELD_Coupon_Currency_Help="Indica la moneda a ser usada cuando se procese ó Informe este registro";

@XendraField(AD_Column_ID="C_Currency_ID",IsCentrallyMaintained=true,
AD_Tab_ID="440bbd97-b948-5fdb-ce78-d86fb9c28a5a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=true,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5fed448b-8b8f-5f5b-5718-603b25afca60")
public static final String FIELDNAME_Coupon_Currency="5fed448b-8b8f-5f5b-5718-603b25afca60";

@XendraTrl(Identifier="b97e248b-373d-9d50-bc03-a93c153d05d6")
public static String es_PE_COLUMN_C_Currency_ID_Name="Currency";

@XendraColumn(AD_Element_ID="8daec488-bca2-50fe-f9de-abf0cba2a34a",ColumnName="C_Currency_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b97e248b-373d-9d50-bc03-a93c153d05d6",
Synchronized="2019-08-30 22:21:27.0")
/** Column name C_Currency_ID */
public static final String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
/** Set Invoice.
@param C_Invoice_ID Invoice Identifier */
public void setC_Invoice_ID (int C_Invoice_ID)
{
if (C_Invoice_ID < 1) throw new IllegalArgumentException ("C_Invoice_ID is mandatory.");
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

@XendraTrl(Identifier="84b7f048-e3e4-e7d5-e312-13c8dfc76d40")
public static String es_PE_FIELD_Coupon_Invoice_Name="Factura";

@XendraTrl(Identifier="84b7f048-e3e4-e7d5-e312-13c8dfc76d40")
public static String es_PE_FIELD_Coupon_Invoice_Description="Identificador de la factura";

@XendraTrl(Identifier="84b7f048-e3e4-e7d5-e312-13c8dfc76d40")
public static String es_PE_FIELD_Coupon_Invoice_Help="La ID de Factura identifica únicamente un documento de Factura.";

@XendraField(AD_Column_ID="C_Invoice_ID",IsCentrallyMaintained=true,
AD_Tab_ID="440bbd97-b948-5fdb-ce78-d86fb9c28a5a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=true,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="84b7f048-e3e4-e7d5-e312-13c8dfc76d40")
public static final String FIELDNAME_Coupon_Invoice="84b7f048-e3e4-e7d5-e312-13c8dfc76d40";

@XendraTrl(Identifier="13997b2f-6b2b-8560-dff2-be6c4f83bfd9")
public static String es_PE_COLUMN_C_Invoice_ID_Name="Invoice";

@XendraColumn(AD_Element_ID="e526ea57-1bdf-9871-fd57-0df3c1f9dd42",ColumnName="C_Invoice_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="13997b2f-6b2b-8560-dff2-be6c4f83bfd9",
Synchronized="2019-08-30 22:21:27.0")
/** Column name C_Invoice_ID */
public static final String COLUMNNAME_C_Invoice_ID = "C_Invoice_ID";
/** Set Order.
@param C_Order_ID Order */
public void setC_Order_ID (int C_Order_ID)
{
if (C_Order_ID <= 0) set_Value (COLUMNNAME_C_Order_ID, null);
 else 
set_Value (COLUMNNAME_C_Order_ID, Integer.valueOf(C_Order_ID));
}
/** Get Order.
@return Order */
public int getC_Order_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Order_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="7fed1716-e520-48f5-6f2e-aaf69a16a597")
public static String es_PE_COLUMN_C_Order_ID_Name="Order";

@XendraColumn(AD_Element_ID="cc846c60-90b8-6aad-9d07-b5d0c0328787",ColumnName="C_Order_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7fed1716-e520-48f5-6f2e-aaf69a16a597",
Synchronized="2019-08-30 22:21:28.0")
/** Column name C_Order_ID */
public static final String COLUMNNAME_C_Order_ID = "C_Order_ID";
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

@XendraTrl(Identifier="ae958b4f-0659-4422-05ba-b8349261c809")
public static String es_PE_COLUMN_C_Tax_ID_Name="Tax";

@XendraColumn(AD_Element_ID="38ff24fc-b68c-51a9-60f8-ef2a1f060de2",ColumnName="C_Tax_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ae958b4f-0659-4422-05ba-b8349261c809",
Synchronized="2019-08-30 22:21:28.0")
/** Column name C_Tax_ID */
public static final String COLUMNNAME_C_Tax_ID = "C_Tax_ID";
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
@XendraTrl(Identifier="46c88193-c0cd-461b-a154-44ac3057658c")
public static String es_PE_COLUMN_DocumentNo_Name="Document No";

@XendraColumn(AD_Element_ID="e3ca6e28-702a-2722-d941-b2072a0de9cb",ColumnName="DocumentNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="46c88193-c0cd-461b-a154-44ac3057658c",
Synchronized="2019-08-30 22:21:28.0")
/** Column name DocumentNo */
public static final String COLUMNNAME_DocumentNo = "DocumentNo";
/** Set End Date.
@param EndDate Last effective date (inclusive) */
public void setEndDate (Timestamp EndDate)
{
set_Value (COLUMNNAME_EndDate, EndDate);
}
/** Get End Date.
@return Last effective date (inclusive) */
public Timestamp getEndDate() 
{
return (Timestamp)get_Value(COLUMNNAME_EndDate);
}

@XendraTrl(Identifier="6dae8a61-78bb-6b98-3ebd-596173caa289")
public static String es_PE_FIELD_Coupon_EndDate_Name="Fecha Límite";

@XendraTrl(Identifier="6dae8a61-78bb-6b98-3ebd-596173caa289")
public static String es_PE_FIELD_Coupon_EndDate_Description="Última fecha efectiva (inclusive)";

@XendraTrl(Identifier="6dae8a61-78bb-6b98-3ebd-596173caa289")
public static String es_PE_FIELD_Coupon_EndDate_Help="La fecha final indica la última fecha en este rango.";

@XendraField(AD_Column_ID="EndDate",IsCentrallyMaintained=true,
AD_Tab_ID="440bbd97-b948-5fdb-ce78-d86fb9c28a5a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=29,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=true,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6dae8a61-78bb-6b98-3ebd-596173caa289")
public static final String FIELDNAME_Coupon_EndDate="6dae8a61-78bb-6b98-3ebd-596173caa289";

@XendraTrl(Identifier="32e42eff-242e-37c2-499c-1ff3a451e461")
public static String es_PE_COLUMN_EndDate_Name="End Date";

@XendraColumn(AD_Element_ID="16fae692-c943-4a1f-732e-bfce5aecb4b3",ColumnName="EndDate",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="32e42eff-242e-37c2-499c-1ff3a451e461",
Synchronized="2019-08-30 22:21:28.0")
/** Column name EndDate */
public static final String COLUMNNAME_EndDate = "EndDate";
/** Set Grand Total.
@param GrandTotal Total amount of document */
public void setGrandTotal (BigDecimal GrandTotal)
{
if (GrandTotal == null) throw new IllegalArgumentException ("GrandTotal is mandatory.");
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

@XendraTrl(Identifier="30e09225-ff4a-9ad8-2fd9-78d178a451b3")
public static String es_PE_FIELD_Coupon_GrandTotal_Name="Gran Total";

@XendraTrl(Identifier="30e09225-ff4a-9ad8-2fd9-78d178a451b3")
public static String es_PE_FIELD_Coupon_GrandTotal_Description="Total del documento";

@XendraTrl(Identifier="30e09225-ff4a-9ad8-2fd9-78d178a451b3")
public static String es_PE_FIELD_Coupon_GrandTotal_Help="El gran total identifica el total incluyendo impuestos y totales de fletes en la moneda del documento.";

@XendraField(AD_Column_ID="GrandTotal",IsCentrallyMaintained=true,
AD_Tab_ID="440bbd97-b948-5fdb-ce78-d86fb9c28a5a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=true,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="30e09225-ff4a-9ad8-2fd9-78d178a451b3")
public static final String FIELDNAME_Coupon_GrandTotal="30e09225-ff4a-9ad8-2fd9-78d178a451b3";

@XendraTrl(Identifier="6a6b0121-9fbb-4a5a-a16f-95a3d88c8fd5")
public static String es_PE_COLUMN_GrandTotal_Name="Grand Total";

@XendraColumn(AD_Element_ID="ffd614c2-6ff8-c9c6-71bf-44f369675711",ColumnName="GrandTotal",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6a6b0121-9fbb-4a5a-a16f-95a3d88c8fd5",
Synchronized="2019-08-30 22:21:28.0")
/** Column name GrandTotal */
public static final String COLUMNNAME_GrandTotal = "GrandTotal";
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
@XendraTrl(Identifier="d99a5a54-41ed-4421-b982-0a3be4eb1395")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d99a5a54-41ed-4421-b982-0a3be4eb1395",
Synchronized="2019-08-30 22:21:28.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
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

@XendraTrl(Identifier="7b725ea3-57c3-1699-faba-30a4a1dfb924")
public static String es_PE_COLUMN_Processed_Name="Processed";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7b725ea3-57c3-1699-faba-30a4a1dfb924",
Synchronized="2019-08-30 22:21:28.0")
/** Column name Processed */
public static final String COLUMNNAME_Processed = "Processed";
/** Set Ref_Invoice_ID.
@param Ref_Invoice_ID Ref_Invoice_ID */
public void setRef_Invoice_ID (int Ref_Invoice_ID)
{
if (Ref_Invoice_ID <= 0) set_Value (COLUMNNAME_Ref_Invoice_ID, null);
 else 
set_Value (COLUMNNAME_Ref_Invoice_ID, Integer.valueOf(Ref_Invoice_ID));
}
/** Get Ref_Invoice_ID.
@return Ref_Invoice_ID */
public int getRef_Invoice_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Ref_Invoice_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="a5460bd7-5b55-44a9-8e17-e968ed405934")
public static String es_PE_COLUMN_Ref_Invoice_ID_Name="Ref_Invoice_ID";

@XendraColumn(AD_Element_ID="e3ca474e-0bd4-06ea-5910-51930caa9bbc",ColumnName="Ref_Invoice_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="7fd6a4ea-911e-151b-68bf-3a86cc5f06e3",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="a5460bd7-5b55-44a9-8e17-e968ed405934",Synchronized="2019-08-30 22:21:28.0")
/** Column name Ref_Invoice_ID */
public static final String COLUMNNAME_Ref_Invoice_ID = "Ref_Invoice_ID";
/** Set SKU.
@param SKU Stock Keeping Unit */
public void setSKU (String SKU)
{
if (SKU != null && SKU.length() > 30)
{
log.warning("Length > 30 - truncated");
SKU = SKU.substring(0,29);
}
set_Value (COLUMNNAME_SKU, SKU);
}
/** Get SKU.
@return Stock Keeping Unit */
public String getSKU() 
{
String value = (String)get_Value(COLUMNNAME_SKU);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="ace43166-0f6e-b914-f503-170980c87278")
public static String es_PE_FIELD_Coupon_SKU_Name="UM Almacenamiento";

@XendraTrl(Identifier="ace43166-0f6e-b914-f503-170980c87278")
public static String es_PE_FIELD_Coupon_SKU_Description="Unidad de Mantenimiento en Inventario";

@XendraTrl(Identifier="ace43166-0f6e-b914-f503-170980c87278")
public static String es_PE_FIELD_Coupon_SKU_Help="El SKU indica la unidad de almacenamiento de inventario definida por el usuario. Puede ser usada por  una simbología adicional de código de barras ó por su propio esquema .";

@XendraField(AD_Column_ID="SKU",IsCentrallyMaintained=true,
AD_Tab_ID="440bbd97-b948-5fdb-ce78-d86fb9c28a5a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ace43166-0f6e-b914-f503-170980c87278")
public static final String FIELDNAME_Coupon_SKU="ace43166-0f6e-b914-f503-170980c87278";

@XendraTrl(Identifier="ba23ee7e-19e2-25c0-d49f-c7594cad4ce7")
public static String es_PE_COLUMN_SKU_Name="SKU";

@XendraColumn(AD_Element_ID="f473a6ed-4a3f-b6fd-5b0f-06d49c1e65e2",ColumnName="SKU",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ba23ee7e-19e2-25c0-d49f-c7594cad4ce7",
Synchronized="2019-08-30 22:21:28.0")
/** Column name SKU */
public static final String COLUMNNAME_SKU = "SKU";
}
