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
import org.compiere.model.reference.REF__DocumentStatus;
import org.compiere.model.reference.REF_M_InventoryType;
import org.compiere.model.reference.REF_M_TransactionMovementType;
import org.compiere.model.reference.REF_M_TransactionTransactionType;
/** Generated Model for M_Transaction
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_Transaction extends PO
{
/** Standard Constructor
@param ctx context
@param M_Transaction_ID id
@param trxName transaction
*/
public X_M_Transaction (Properties ctx, int M_Transaction_ID, String trxName)
{
super (ctx, M_Transaction_ID, trxName);
/** if (M_Transaction_ID == 0)
{
setDocumentNo (null);
setM_AttributeSetInstance_ID (0);
setMovementDate (new Timestamp(System.currentTimeMillis()));
setMovementQty (Env.ZERO);
setMovementQtyBalance (Env.ZERO);
setMovementType (null);
setM_Product_ID (0);
setM_Transaction_ID (0);
setSeqNo (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_M_Transaction (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=329 */
public static int Table_ID=MTable.getTable_ID("M_Transaction");

@XendraTrl(Identifier="f13e72ac-9a92-1f12-5bdf-0bfd25daef93")
public static String es_PE_TAB_ProductTransactions_Description="Transacciones de productos almacenados";

@XendraTrl(Identifier="f13e72ac-9a92-1f12-5bdf-0bfd25daef93")
public static String es_PE_TAB_ProductTransactions_Name="Transacciones de Producto";

@XendraTab(Name="Product Transactions",Description="Transactions for stored Products",Help="",
AD_Window_ID="46ccc992-68c0-cc7a-5da1-f15017ce2fce",SeqNo=50,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=true,
AD_Column_ID="e510941f-8891-6a01-1862-e5677ac2158c",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=false,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="f13e72ac-9a92-1f12-5bdf-0bfd25daef93",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_ProductTransactions="f13e72ac-9a92-1f12-5bdf-0bfd25daef93";

@XendraTrl(Identifier="26bc3fe1-0b93-fca9-4754-7847ab21a970")
public static String es_PE_TAB_MaterialTransactions_Name="Transacciones de Materiales";

@XendraTab(Name="Material Transactions",Description="",Help="",
AD_Window_ID="201da08f-6c0d-3193-a918-cdf0702bd74c",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=true,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=false,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="26bc3fe1-0b93-fca9-4754-7847ab21a970",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_MaterialTransactions="26bc3fe1-0b93-fca9-4754-7847ab21a970";

@XendraTrl(Identifier="cb3ed3af-248b-41b3-8216-07164d850cf0")
public static String es_PE_TAB_Transaction_Name="Transaction";
@XendraTab(Name="Transaction",
Description="",Help="",AD_Window_ID="0e6c81af-9ed3-4c69-826e-66cef055fc8e",SeqNo=10,TabLevel=0,
IsSingleRow=false,IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",
HasTree=false,WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",
AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",
ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="cb3ed3af-248b-41b3-8216-07164d850cf0",Synchronized="2016-10-18 12:34:38.0")
public static final String TABNAME_Transaction="cb3ed3af-248b-41b3-8216-07164d850cf0";

@XendraTrl(Identifier="a63d8837-34e1-b9a5-9362-585f408186be")
public static String es_PE_TAB_Transactions_Description="Transacciones de productos almacenados";

@XendraTrl(Identifier="a63d8837-34e1-b9a5-9362-585f408186be")
public static String es_PE_TAB_Transactions_Name="Transacciones";

@XendraTrl(Identifier="a63d8837-34e1-b9a5-9362-585f408186be")
public static String es_PE_TAB_Transactions_Help="La pestaña Transacciones despliega las transacciones que han sido procesadas para un producto.";

@XendraTab(Name="Transactions",Description="Transactions for stored Products",
Help="The Transaction Tab displays the transactions that have been processed for this product.",
AD_Window_ID="ce2d4e2c-ba4e-29bf-9f71-66fecdc05f55",SeqNo=80,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=true,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=false,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="a63d8837-34e1-b9a5-9362-585f408186be",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Transactions="a63d8837-34e1-b9a5-9362-585f408186be";

@XendraTrl(Identifier="706cb1f8-7927-0aaa-5068-65b082bcb4c8")
public static String es_PE_TABLE_M_Transaction_Name="Transacción de Inventario";

@XendraTable(Name="Inventory Transaction",Description="",Help="",TableName="M_Transaction",
AccessLevel="1",AD_Window_ID="0e6c81af-9ed3-4c69-826e-66cef055fc8e",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=140,IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.material",
Identifier="706cb1f8-7927-0aaa-5068-65b082bcb4c8",Synchronized="2017-08-16 11:43:37.0")
/** TableName=M_Transaction */
public static final String Table_Name="M_Transaction";


@XendraIndex(Name="m_transaction_period_product",Identifier="462f7215-b701-4660-8aba-541724ca8569",
Column_Names="ad_client_id, c_period_id, movementdate, m_product_id, m_attributesetinstance_id",
IsUnique="false",TableIdentifier="462f7215-b701-4660-8aba-541724ca8569",
Synchronized="2016-04-24 19:04:29.0")
public static final String INDEXNAME_m_transaction_period_product = "462f7215-b701-4660-8aba-541724ca8569";


@XendraIndex(Name="storagemonthlyrecord",Identifier="5b504ebf-47c7-4766-91b9-9aeeee8787e2",
Column_Names="ad_table_id, record_id",IsUnique="false",
TableIdentifier="5b504ebf-47c7-4766-91b9-9aeeee8787e2",Synchronized="2015-09-19 20:15:27.0")
public static final String INDEXNAME_storagemonthlyrecord = "5b504ebf-47c7-4766-91b9-9aeeee8787e2";


@XendraIndex(Name="m_transaction_processed",Identifier="f5e2d368-b5c1-4e05-a323-565c96f6de89",
Column_Names="ad_client_id, c_period_id, processed",IsUnique="false",
TableIdentifier="f5e2d368-b5c1-4e05-a323-565c96f6de89",Synchronized="2015-09-20 07:50:30.0")
public static final String INDEXNAME_m_transaction_processed = "f5e2d368-b5c1-4e05-a323-565c96f6de89";


@XendraIndex(Name="m_transaction_product",Identifier="6542c73e-2aab-83b4-336f-6b19f164e175",
Column_Names="m_product_id",IsUnique="false",
TableIdentifier="6542c73e-2aab-83b4-336f-6b19f164e175",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_m_transaction_product = "6542c73e-2aab-83b4-336f-6b19f164e175";


@XendraIndex(Name="m_transaction_inoutline",Identifier="ef717637-a299-4349-a0b2-7ffb869f17a9",
Column_Names="m_inoutline_id",IsUnique="false",
TableIdentifier="ef717637-a299-4349-a0b2-7ffb869f17a9",Synchronized="2016-11-17 17:47:16.0")
public static final String INDEXNAME_m_transaction_inoutline = "ef717637-a299-4349-a0b2-7ffb869f17a9";


@XendraIndex(Name="m_transaction_movementdate",Identifier="0f5dbe94-de39-a8af-11d1-df413de61f6e",
Column_Names="ad_client_id, movementdate",IsUnique="false",
TableIdentifier="0f5dbe94-de39-a8af-11d1-df413de61f6e",Synchronized="2016-11-30 12:36:58.0")
public static final String INDEXNAME_m_transaction_movementdate = "0f5dbe94-de39-a8af-11d1-df413de61f6e";


@XendraIndex(Name="m_transaction_invoice",Identifier="29a0bf63-9e82-2b56-d4f7-285629e6eb44",
Column_Names="c_invoiceline_id",IsUnique="false",
TableIdentifier="29a0bf63-9e82-2b56-d4f7-285629e6eb44",Synchronized="2017-07-22 18:20:16.0")
public static final String INDEXNAME_m_transaction_invoice = "29a0bf63-9e82-2b56-d4f7-285629e6eb44";


@XendraIndex(Name="m_transaction_period",Identifier="d37ff413-a434-ae57-6d9b-6fb6cfa8194e",
Column_Names="c_period_id",IsUnique="false",TableIdentifier="d37ff413-a434-ae57-6d9b-6fb6cfa8194e",
Synchronized="2017-07-21 17:52:58.0")
public static final String INDEXNAME_m_transaction_period = "d37ff413-a434-ae57-6d9b-6fb6cfa8194e";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_Transaction");

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
    Table_ID = MTable.getTable_ID("M_Transaction");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_Transaction[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Table.
@param AD_Table_ID Database Table information */
public void setAD_Table_ID (int AD_Table_ID)
{
if (AD_Table_ID <= 0) set_Value (COLUMNNAME_AD_Table_ID, null);
 else 
set_Value (COLUMNNAME_AD_Table_ID, Integer.valueOf(AD_Table_ID));
}
/** Get Table.
@return Database Table information */
public int getAD_Table_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Table_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ef85ccb2-97d5-457d-80e4-a527d47ba0ea")
public static String es_PE_FIELD_Transactions_Table_Description="Tabla para los campos";

@XendraTrl(Identifier="ef85ccb2-97d5-457d-80e4-a527d47ba0ea")
public static String es_PE_FIELD_Transactions_Table_Help="La Tabla indica una tabla en la que reside un campo ó campos.";

@XendraTrl(Identifier="ef85ccb2-97d5-457d-80e4-a527d47ba0ea")
public static String es_PE_FIELD_Transactions_Table_Name="Tabla";

@XendraField(AD_Column_ID="AD_Table_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a63d8837-34e1-b9a5-9362-585f408186be",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-06-28 18:17:01.0",
Identifier="ef85ccb2-97d5-457d-80e4-a527d47ba0ea")
public static final String FIELDNAME_Transactions_Table="ef85ccb2-97d5-457d-80e4-a527d47ba0ea";

@XendraTrl(Identifier="082fe02e-7da9-478c-8eb4-102323c24514")
public static String es_PE_FIELD_Transaction_Table_Description="Tabla para los campos";

@XendraTrl(Identifier="082fe02e-7da9-478c-8eb4-102323c24514")
public static String es_PE_FIELD_Transaction_Table_Help="La Tabla indica una tabla en la que reside un campo ó campos.";

@XendraTrl(Identifier="082fe02e-7da9-478c-8eb4-102323c24514")
public static String es_PE_FIELD_Transaction_Table_Name="Tabla";

@XendraField(AD_Column_ID="AD_Table_ID",IsCentrallyMaintained=true,
AD_Tab_ID="cb3ed3af-248b-41b3-8216-07164d850cf0",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-18 12:34:36.0",
Identifier="082fe02e-7da9-478c-8eb4-102323c24514")
public static final String FIELDNAME_Transaction_Table="082fe02e-7da9-478c-8eb4-102323c24514";

@XendraTrl(Identifier="a618b587-1dc6-4c37-93f2-8aae45967718")
public static String es_PE_COLUMN_AD_Table_ID_Name="Table";

@XendraColumn(AD_Element_ID="270eeb02-723b-0ecc-7f56-3c67fa71a7f1",ColumnName="AD_Table_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a618b587-1dc6-4c37-93f2-8aae45967718",
Synchronized="2017-08-05 16:55:36.0")
/** Column name AD_Table_ID */
public static final String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
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

@XendraTrl(Identifier="a2bdf4e3-589b-4d40-8d7d-9b0399f6301a")
public static String es_PE_FIELD_Transaction_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="a2bdf4e3-589b-4d40-8d7d-9b0399f6301a")
public static String es_PE_FIELD_Transaction_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraTrl(Identifier="a2bdf4e3-589b-4d40-8d7d-9b0399f6301a")
public static String es_PE_FIELD_Transaction_BusinessPartner_Name="Socio de Negocio";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="cb3ed3af-248b-41b3-8216-07164d850cf0",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-18 17:21:49.0",
Identifier="a2bdf4e3-589b-4d40-8d7d-9b0399f6301a")
public static final String FIELDNAME_Transaction_BusinessPartner="a2bdf4e3-589b-4d40-8d7d-9b0399f6301a";

@XendraTrl(Identifier="7791220f-0c81-4b4d-bf06-662d2971f5c5")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Business Partner ";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7791220f-0c81-4b4d-bf06-662d2971f5c5",
Synchronized="2017-08-05 16:55:36.0")
/** Column name C_BPartner_ID */
public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
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

@XendraTrl(Identifier="57429a54-3c7a-42f2-9c6a-4708c8d9feb0")
public static String es_PE_FIELD_Transaction_DocumentType_Description="Tipo de documento ó reglas";

@XendraTrl(Identifier="57429a54-3c7a-42f2-9c6a-4708c8d9feb0")
public static String es_PE_FIELD_Transaction_DocumentType_Help="El tipo de documento determina la secuencia del documento y las reglas de proceso";

@XendraTrl(Identifier="57429a54-3c7a-42f2-9c6a-4708c8d9feb0")
public static String es_PE_FIELD_Transaction_DocumentType_Name="Tipo de Documento";

@XendraField(AD_Column_ID="C_DocType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="cb3ed3af-248b-41b3-8216-07164d850cf0",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-18 17:21:49.0",
Identifier="57429a54-3c7a-42f2-9c6a-4708c8d9feb0")
public static final String FIELDNAME_Transaction_DocumentType="57429a54-3c7a-42f2-9c6a-4708c8d9feb0";

@XendraTrl(Identifier="3cc8223c-29e1-4699-bed5-535476852aef")
public static String es_PE_COLUMN_C_DocType_ID_Name="Document Type";

@XendraColumn(AD_Element_ID="099a4147-1a72-cdd0-81e0-8bdbc8c0b883",ColumnName="C_DocType_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3cc8223c-29e1-4699-bed5-535476852aef",
Synchronized="2017-08-05 16:55:36.0")
/** Column name C_DocType_ID */
public static final String COLUMNNAME_C_DocType_ID = "C_DocType_ID";
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

@XendraTrl(Identifier="679d0347-abc9-4891-a352-13baded9f843")
public static String es_PE_FIELD_Transaction_Invoice_Description="Identificador de la factura";

@XendraTrl(Identifier="679d0347-abc9-4891-a352-13baded9f843")
public static String es_PE_FIELD_Transaction_Invoice_Help="La ID de Factura identifica únicamente un documento de Factura.";

@XendraTrl(Identifier="679d0347-abc9-4891-a352-13baded9f843")
public static String es_PE_FIELD_Transaction_Invoice_Name="Factura";

@XendraField(AD_Column_ID="C_Invoice_ID",IsCentrallyMaintained=true,
AD_Tab_ID="cb3ed3af-248b-41b3-8216-07164d850cf0",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-18 17:45:47.0",
Identifier="679d0347-abc9-4891-a352-13baded9f843")
public static final String FIELDNAME_Transaction_Invoice="679d0347-abc9-4891-a352-13baded9f843";

@XendraTrl(Identifier="3d166293-2235-41dc-884a-7aed92476990")
public static String es_PE_COLUMN_C_Invoice_ID_Name="Invoice";

@XendraColumn(AD_Element_ID="e526ea57-1bdf-9871-fd57-0df3c1f9dd42",ColumnName="C_Invoice_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3d166293-2235-41dc-884a-7aed92476990",
Synchronized="2017-08-05 16:55:36.0")
/** Column name C_Invoice_ID */
public static final String COLUMNNAME_C_Invoice_ID = "C_Invoice_ID";
/** Set Invoice Line.
@param C_InvoiceLine_ID Invoice Detail Line */
public void setC_InvoiceLine_ID (int C_InvoiceLine_ID)
{
if (C_InvoiceLine_ID <= 0) set_Value (COLUMNNAME_C_InvoiceLine_ID, null);
 else 
set_Value (COLUMNNAME_C_InvoiceLine_ID, Integer.valueOf(C_InvoiceLine_ID));
}
/** Get Invoice Line.
@return Invoice Detail Line */
public int getC_InvoiceLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_InvoiceLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="2ad4f022-0399-4b04-9725-a6132224c359")
public static String es_PE_FIELD_Transactions_InvoiceLine_Description="Línea de detalle de factura";

@XendraTrl(Identifier="2ad4f022-0399-4b04-9725-a6132224c359")
public static String es_PE_FIELD_Transactions_InvoiceLine_Help="La línea de la factura identifica de manera única una línea de la factura";

@XendraTrl(Identifier="2ad4f022-0399-4b04-9725-a6132224c359")
public static String es_PE_FIELD_Transactions_InvoiceLine_Name="Línea de Factura";

@XendraField(AD_Column_ID="C_InvoiceLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a63d8837-34e1-b9a5-9362-585f408186be",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-06-28 18:17:01.0",
Identifier="2ad4f022-0399-4b04-9725-a6132224c359")
public static final String FIELDNAME_Transactions_InvoiceLine="2ad4f022-0399-4b04-9725-a6132224c359";

@XendraTrl(Identifier="b6901428-4e5d-4231-983a-617571381a52")
public static String es_PE_FIELD_Transaction_InvoiceLine_Description="Línea de detalle de factura";

@XendraTrl(Identifier="b6901428-4e5d-4231-983a-617571381a52")
public static String es_PE_FIELD_Transaction_InvoiceLine_Help="La línea de la factura identifica de manera única una línea de la factura";

@XendraTrl(Identifier="b6901428-4e5d-4231-983a-617571381a52")
public static String es_PE_FIELD_Transaction_InvoiceLine_Name="Línea de Factura";

@XendraField(AD_Column_ID="C_InvoiceLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="cb3ed3af-248b-41b3-8216-07164d850cf0",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-18 12:34:36.0",
Identifier="b6901428-4e5d-4231-983a-617571381a52")
public static final String FIELDNAME_Transaction_InvoiceLine="b6901428-4e5d-4231-983a-617571381a52";

@XendraTrl(Identifier="4a72b38f-5147-4aa4-954b-cd1ab309b94f")
public static String es_PE_COLUMN_C_InvoiceLine_ID_Name="Invoice Line";

@XendraColumn(AD_Element_ID="56a4b078-1c5d-e08d-5d9d-847e94161779",ColumnName="C_InvoiceLine_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4a72b38f-5147-4aa4-954b-cd1ab309b94f",
Synchronized="2017-08-05 16:55:36.0")
/** Column name C_InvoiceLine_ID */
public static final String COLUMNNAME_C_InvoiceLine_ID = "C_InvoiceLine_ID";
/** Set Sales Order Line.
@param C_OrderLine_ID Sales Order Line */
public void setC_OrderLine_ID (int C_OrderLine_ID)
{
if (C_OrderLine_ID <= 0) set_Value (COLUMNNAME_C_OrderLine_ID, null);
 else 
set_Value (COLUMNNAME_C_OrderLine_ID, Integer.valueOf(C_OrderLine_ID));
}
/** Get Sales Order Line.
@return Sales Order Line */
public int getC_OrderLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_OrderLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="b63eef6a-3f6b-45fe-8796-eda954d7424b")
public static String es_PE_FIELD_Transactions_SalesOrderLine_Description="Línea de orden de venta";

@XendraTrl(Identifier="b63eef6a-3f6b-45fe-8796-eda954d7424b")
public static String es_PE_FIELD_Transactions_SalesOrderLine_Help="La línea de orden de venta es un identificador único para una línea en una orden.";

@XendraTrl(Identifier="b63eef6a-3f6b-45fe-8796-eda954d7424b")
public static String es_PE_FIELD_Transactions_SalesOrderLine_Name="Línea";

@XendraField(AD_Column_ID="C_OrderLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a63d8837-34e1-b9a5-9362-585f408186be",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-06-28 18:17:01.0",
Identifier="b63eef6a-3f6b-45fe-8796-eda954d7424b")
public static final String FIELDNAME_Transactions_SalesOrderLine="b63eef6a-3f6b-45fe-8796-eda954d7424b";

@XendraTrl(Identifier="fd3b5570-7370-4c5a-ad84-6c1646736e2a")
public static String es_PE_FIELD_Transaction_SalesOrderLine_Description="Línea de orden de venta";

@XendraTrl(Identifier="fd3b5570-7370-4c5a-ad84-6c1646736e2a")
public static String es_PE_FIELD_Transaction_SalesOrderLine_Help="La línea de orden de venta es un identificador único para una línea en una orden.";

@XendraTrl(Identifier="fd3b5570-7370-4c5a-ad84-6c1646736e2a")
public static String es_PE_FIELD_Transaction_SalesOrderLine_Name="Línea";

@XendraField(AD_Column_ID="C_OrderLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="cb3ed3af-248b-41b3-8216-07164d850cf0",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-18 12:34:36.0",
Identifier="fd3b5570-7370-4c5a-ad84-6c1646736e2a")
public static final String FIELDNAME_Transaction_SalesOrderLine="fd3b5570-7370-4c5a-ad84-6c1646736e2a";

@XendraTrl(Identifier="439fd7db-5ef4-40bf-a806-d7f2aa52237d")
public static String es_PE_COLUMN_C_OrderLine_ID_Name="Sales Order Line";

@XendraColumn(AD_Element_ID="a94fbec0-0ef5-0f6c-033d-8286782321b0",ColumnName="C_OrderLine_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="439fd7db-5ef4-40bf-a806-d7f2aa52237d",
Synchronized="2017-08-05 16:55:36.0")
/** Column name C_OrderLine_ID */
public static final String COLUMNNAME_C_OrderLine_ID = "C_OrderLine_ID";
/** Set Period.
@param C_Period_ID Period of the Calendar */
public void setC_Period_ID (int C_Period_ID)
{
if (C_Period_ID <= 0) set_Value (COLUMNNAME_C_Period_ID, null);
 else 
set_Value (COLUMNNAME_C_Period_ID, Integer.valueOf(C_Period_ID));
}
/** Get Period.
@return Period of the Calendar */
public int getC_Period_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Period_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="8f42175b-20ee-4b31-8911-652308ee332c")
public static String es_PE_FIELD_Transactions_Period_Description="Período de Calendario";

@XendraTrl(Identifier="8f42175b-20ee-4b31-8911-652308ee332c")
public static String es_PE_FIELD_Transactions_Period_Help="El Período indica un rango de fechas exclusivo para un calendario";

@XendraTrl(Identifier="8f42175b-20ee-4b31-8911-652308ee332c")
public static String es_PE_FIELD_Transactions_Period_Name="Período";

@XendraField(AD_Column_ID="C_Period_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a63d8837-34e1-b9a5-9362-585f408186be",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-06-28 18:17:01.0",
Identifier="8f42175b-20ee-4b31-8911-652308ee332c")
public static final String FIELDNAME_Transactions_Period="8f42175b-20ee-4b31-8911-652308ee332c";

@XendraTrl(Identifier="88fce14f-976c-40f2-b130-724537ac4c72")
public static String es_PE_FIELD_Transaction_Period_Description="Período de Calendario";

@XendraTrl(Identifier="88fce14f-976c-40f2-b130-724537ac4c72")
public static String es_PE_FIELD_Transaction_Period_Help="El Período indica un rango de fechas exclusivo para un calendario";

@XendraTrl(Identifier="88fce14f-976c-40f2-b130-724537ac4c72")
public static String es_PE_FIELD_Transaction_Period_Name="Período";

@XendraField(AD_Column_ID="C_Period_ID",IsCentrallyMaintained=true,
AD_Tab_ID="cb3ed3af-248b-41b3-8216-07164d850cf0",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-18 12:34:36.0",
Identifier="88fce14f-976c-40f2-b130-724537ac4c72")
public static final String FIELDNAME_Transaction_Period="88fce14f-976c-40f2-b130-724537ac4c72";

@XendraTrl(Identifier="943629a1-5007-49e2-879c-4440e6a2a1af")
public static String es_PE_COLUMN_C_Period_ID_Name="Period";

@XendraColumn(AD_Element_ID="8f295c04-0eb4-a8f3-829f-cc6a6bd1df1e",ColumnName="C_Period_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="943629a1-5007-49e2-879c-4440e6a2a1af",
Synchronized="2015-08-11 20:32:15.0")
/** Column name C_Period_ID */
public static final String COLUMNNAME_C_Period_ID = "C_Period_ID";
/** Set Project Issue.
@param C_ProjectIssue_ID Project Issues (Material, Labor) */
public void setC_ProjectIssue_ID (int C_ProjectIssue_ID)
{
if (C_ProjectIssue_ID <= 0) set_ValueNoCheck (COLUMNNAME_C_ProjectIssue_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_C_ProjectIssue_ID, Integer.valueOf(C_ProjectIssue_ID));
}
/** Get Project Issue.
@return Project Issues (Material, Labor) */
public int getC_ProjectIssue_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_ProjectIssue_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ff3697a5-0df8-6a0a-a824-9a2e3e350790")
public static String es_PE_FIELD_ProductTransactions_ProjectIssue_Description="Ediciones del proyecto (material, trabajo).";

@XendraTrl(Identifier="ff3697a5-0df8-6a0a-a824-9a2e3e350790")
public static String es_PE_FIELD_ProductTransactions_ProjectIssue_Help="Ediciones del proyecto iniciado por procesos \"ediciones al proyecto\". Usted puede publicar recibos, tiempo y costos, ó acción.";

@XendraTrl(Identifier="ff3697a5-0df8-6a0a-a824-9a2e3e350790")
public static String es_PE_FIELD_ProductTransactions_ProjectIssue_Name="Asunto del Proyecto";

@XendraField(AD_Column_ID="C_ProjectIssue_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f13e72ac-9a92-1f12-5bdf-0bfd25daef93",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ff3697a5-0df8-6a0a-a824-9a2e3e350790")
public static final String FIELDNAME_ProductTransactions_ProjectIssue="ff3697a5-0df8-6a0a-a824-9a2e3e350790";

@XendraTrl(Identifier="2c0d328e-5781-4b8f-b5b1-0baf75c598b7")
public static String es_PE_FIELD_Transactions_ProjectIssue_Description="Ediciones del proyecto (material, trabajo).";

@XendraTrl(Identifier="2c0d328e-5781-4b8f-b5b1-0baf75c598b7")
public static String es_PE_FIELD_Transactions_ProjectIssue_Help="Ediciones del proyecto iniciado por procesos \"ediciones al proyecto\". Usted puede publicar recibos, tiempo y costos, ó acción.";

@XendraTrl(Identifier="2c0d328e-5781-4b8f-b5b1-0baf75c598b7")
public static String es_PE_FIELD_Transactions_ProjectIssue_Name="Asunto del Proyecto";

@XendraField(AD_Column_ID="C_ProjectIssue_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a63d8837-34e1-b9a5-9362-585f408186be",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-06-28 18:17:01.0",
Identifier="2c0d328e-5781-4b8f-b5b1-0baf75c598b7")
public static final String FIELDNAME_Transactions_ProjectIssue="2c0d328e-5781-4b8f-b5b1-0baf75c598b7";

@XendraTrl(Identifier="95594b8a-5ab1-0bd1-c9da-93e688409007")
public static String es_PE_FIELD_MaterialTransactions_ProjectIssue_Description="Ediciones del proyecto (material, trabajo).";

@XendraTrl(Identifier="95594b8a-5ab1-0bd1-c9da-93e688409007")
public static String es_PE_FIELD_MaterialTransactions_ProjectIssue_Help="Ediciones del proyecto iniciado por procesos \"ediciones al proyecto\". Usted puede publicar recibos, tiempo y costos, ó acción.";

@XendraTrl(Identifier="95594b8a-5ab1-0bd1-c9da-93e688409007")
public static String es_PE_FIELD_MaterialTransactions_ProjectIssue_Name="Asunto del Proyecto";

@XendraField(AD_Column_ID="C_ProjectIssue_ID",IsCentrallyMaintained=true,
AD_Tab_ID="26bc3fe1-0b93-fca9-4754-7847ab21a970",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="95594b8a-5ab1-0bd1-c9da-93e688409007")
public static final String FIELDNAME_MaterialTransactions_ProjectIssue="95594b8a-5ab1-0bd1-c9da-93e688409007";

@XendraTrl(Identifier="793b982e-e043-499f-8be5-e7fe79a628d0")
public static String es_PE_FIELD_Transaction_ProjectIssue_Description="Ediciones del proyecto (material, trabajo).";

@XendraTrl(Identifier="793b982e-e043-499f-8be5-e7fe79a628d0")
public static String es_PE_FIELD_Transaction_ProjectIssue_Help="Ediciones del proyecto iniciado por procesos \"ediciones al proyecto\". Usted puede publicar recibos, tiempo y costos, ó acción.";

@XendraTrl(Identifier="793b982e-e043-499f-8be5-e7fe79a628d0")
public static String es_PE_FIELD_Transaction_ProjectIssue_Name="Asunto del Proyecto";

@XendraField(AD_Column_ID="C_ProjectIssue_ID",IsCentrallyMaintained=true,
AD_Tab_ID="cb3ed3af-248b-41b3-8216-07164d850cf0",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-18 12:34:37.0",
Identifier="793b982e-e043-499f-8be5-e7fe79a628d0")
public static final String FIELDNAME_Transaction_ProjectIssue="793b982e-e043-499f-8be5-e7fe79a628d0";

@XendraTrl(Identifier="93f89df5-2c71-52e0-09cd-05b95420d911")
public static String es_PE_COLUMN_C_ProjectIssue_ID_Name="Asunto del Proyecto";

@XendraColumn(AD_Element_ID="6c6aa911-79e0-a8ca-00de-c0e2aa4fd667",ColumnName="C_ProjectIssue_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="93f89df5-2c71-52e0-09cd-05b95420d911",
Synchronized="2017-08-05 16:55:36.0")
/** Column name C_ProjectIssue_ID */
public static final String COLUMNNAME_C_ProjectIssue_ID = "C_ProjectIssue_ID";

/** DocStatus AD_Reference=7627125d-fefe-e6bc-bb7d-4a6c772172dc */
public static final int DOCSTATUS_AD_Reference_ID=131;
/** Set Document Status.
@param DocStatus The current status of the document */
public void setDocStatus (String DocStatus)
{
if (DocStatus == null || DocStatus.equals(REF__DocumentStatus.InProgress) || DocStatus.equals(REF__DocumentStatus.WaitingConfirmation) || DocStatus.equals(REF__DocumentStatus.Drafted) || DocStatus.equals(REF__DocumentStatus.Completed) || DocStatus.equals(REF__DocumentStatus.Approved) || DocStatus.equals(REF__DocumentStatus.WaitingPayment) || DocStatus.equals(REF__DocumentStatus.Placed) || DocStatus.equals(REF__DocumentStatus.Returned) || DocStatus.equals(REF__DocumentStatus.Discount) || DocStatus.equals(REF__DocumentStatus.Protested) || DocStatus.equals(REF__DocumentStatus.NotApproved) || DocStatus.equals(REF__DocumentStatus.Voided) || DocStatus.equals(REF__DocumentStatus.Invalid) || DocStatus.equals(REF__DocumentStatus.Reversed) || DocStatus.equals(REF__DocumentStatus.Closed) || DocStatus.equals(REF__DocumentStatus.Unknown) || DocStatus.equals(REF__DocumentStatus.Portfolio) || DocStatus.equals(REF__DocumentStatus.Warranty) || DocStatus.equals(REF__DocumentStatus.ToCollect) || DocStatus.equals(REF__DocumentStatus.Collect) || DocStatus.equals(REF__DocumentStatus.Receivables) || DocStatus.equals(REF__DocumentStatus.Apply));
 else throw new IllegalArgumentException ("DocStatus Invalid value - " + DocStatus + " - Reference_ID=131 - IP - WC - DR - CO - AP - WP - PL - RT - DS - PD - NA - VO - IN - RE - CL - ?? - PT - WR - TC - CT - RV - AY");
if (DocStatus != null && DocStatus.length() > 2)
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

@XendraTrl(Identifier="426315f7-31e6-440e-940e-ed65639ed4be")
public static String es_PE_FIELD_Transaction_DocumentStatus_Description="El estado actual del documento";

@XendraTrl(Identifier="426315f7-31e6-440e-940e-ed65639ed4be")
public static String es_PE_FIELD_Transaction_DocumentStatus_Help="El estado del documento indica el estado del documento en este momento. Si usted quiere cambiar el estado de Documento; use el campo acción de documento";

@XendraTrl(Identifier="426315f7-31e6-440e-940e-ed65639ed4be")
public static String es_PE_FIELD_Transaction_DocumentStatus_Name="Estado del Documento";

@XendraField(AD_Column_ID="DocStatus",IsCentrallyMaintained=true,
AD_Tab_ID="cb3ed3af-248b-41b3-8216-07164d850cf0",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=2,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-18 12:34:37.0",
Identifier="426315f7-31e6-440e-940e-ed65639ed4be")
public static final String FIELDNAME_Transaction_DocumentStatus="426315f7-31e6-440e-940e-ed65639ed4be";

@XendraTrl(Identifier="bb5dd045-405f-410a-a4e6-01ae4e59fd4e")
public static String es_PE_COLUMN_DocStatus_Name="Document Status";

@XendraColumn(AD_Element_ID="e73fa537-3438-bd01-dfd4-f0f080a28c55",ColumnName="DocStatus",
AD_Reference_ID=17,AD_Reference_Value_ID="7627125d-fefe-e6bc-bb7d-4a6c772172dc",AD_Val_Rule_ID="",
FieldLength=2,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="bb5dd045-405f-410a-a4e6-01ae4e59fd4e",Synchronized="2017-08-05 16:55:36.0")
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
@XendraTrl(Identifier="5ac78339-5e30-4833-a01a-e93ae0e7aedc")
public static String es_PE_FIELD_Transaction_DocumentNo_Description="Número de secuencia del documento para cada documento";

@XendraTrl(Identifier="5ac78339-5e30-4833-a01a-e93ae0e7aedc")
public static String es_PE_FIELD_Transaction_DocumentNo_Help="El número del documento es usualmente generado en automático por el sistema y determinado por el tipo del documento. Si el documento no se salva; el número preliminar se despliega entre \"<>\"";

@XendraTrl(Identifier="5ac78339-5e30-4833-a01a-e93ae0e7aedc")
public static String es_PE_FIELD_Transaction_DocumentNo_Name="No. del Documento";

@XendraField(AD_Column_ID="DocumentNo",IsCentrallyMaintained=true,
AD_Tab_ID="cb3ed3af-248b-41b3-8216-07164d850cf0",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=30,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-18 17:21:50.0",
Identifier="5ac78339-5e30-4833-a01a-e93ae0e7aedc")
public static final String FIELDNAME_Transaction_DocumentNo="5ac78339-5e30-4833-a01a-e93ae0e7aedc";

@XendraTrl(Identifier="65a04b45-f99b-49d4-a268-0077c1ca6487")
public static String es_PE_COLUMN_DocumentNo_Name="Document No";

@XendraColumn(AD_Element_ID="e3ca6e28-702a-2722-d941-b2072a0de9cb",ColumnName="DocumentNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="65a04b45-f99b-49d4-a268-0077c1ca6487",
Synchronized="2017-08-05 16:55:36.0")
/** Column name DocumentNo */
public static final String COLUMNNAME_DocumentNo = "DocumentNo";
/** Set Error Msg.
@param ErrorMsg Error Msg */
public void setErrorMsg (String ErrorMsg)
{
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
@XendraTrl(Identifier="b6615dac-a38e-4252-99e2-b6572c01343b")
public static String es_PE_FIELD_Transactions_ErrorMsg_Name="Mensaje de Error";

@XendraField(AD_Column_ID="ErrorMsg",IsCentrallyMaintained=true,
AD_Tab_ID="a63d8837-34e1-b9a5-9362-585f408186be",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=2000,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-06-28 18:17:01.0",
Identifier="b6615dac-a38e-4252-99e2-b6572c01343b")
public static final String FIELDNAME_Transactions_ErrorMsg="b6615dac-a38e-4252-99e2-b6572c01343b";

@XendraTrl(Identifier="d429f546-5b91-4d99-a8c8-dbc3123b74d8")
public static String es_PE_FIELD_Transaction_ErrorMsg_Name="Mensaje de Error";

@XendraField(AD_Column_ID="ErrorMsg",IsCentrallyMaintained=true,
AD_Tab_ID="cb3ed3af-248b-41b3-8216-07164d850cf0",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=2000,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-18 12:34:37.0",
Identifier="d429f546-5b91-4d99-a8c8-dbc3123b74d8")
public static final String FIELDNAME_Transaction_ErrorMsg="d429f546-5b91-4d99-a8c8-dbc3123b74d8";

@XendraTrl(Identifier="283d9d69-d34f-4bb5-a5df-22aa5594522c")
public static String es_PE_COLUMN_ErrorMsg_Name="Error Msg";

@XendraColumn(AD_Element_ID="7ed8e902-7223-0140-a5e2-159d12a79a58",ColumnName="ErrorMsg",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="283d9d69-d34f-4bb5-a5df-22aa5594522c",
Synchronized="2015-10-20 09:15:38.0")
/** Column name ErrorMsg */
public static final String COLUMNNAME_ErrorMsg = "ErrorMsg";
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
@XendraTrl(Identifier="724eb2f0-335a-4276-9cf9-9d081fd33029")
public static String es_PE_FIELD_Transactions_Identifier_Name="Identifier";

@XendraField(AD_Column_ID="Identifier",IsCentrallyMaintained=true,
AD_Tab_ID="a63d8837-34e1-b9a5-9362-585f408186be",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=36,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-06-28 18:17:01.0",
Identifier="724eb2f0-335a-4276-9cf9-9d081fd33029")
public static final String FIELDNAME_Transactions_Identifier="724eb2f0-335a-4276-9cf9-9d081fd33029";

@XendraTrl(Identifier="72fde8f3-33a8-4c81-8192-02e03a62467b")
public static String es_PE_FIELD_Transaction_Identifier_Name="Identifier";

@XendraField(AD_Column_ID="Identifier",IsCentrallyMaintained=true,
AD_Tab_ID="cb3ed3af-248b-41b3-8216-07164d850cf0",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=36,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-18 12:34:37.0",
Identifier="72fde8f3-33a8-4c81-8192-02e03a62467b")
public static final String FIELDNAME_Transaction_Identifier="72fde8f3-33a8-4c81-8192-02e03a62467b";

@XendraTrl(Identifier="14b1caa1-f608-49fe-9804-5eaf346d0aba")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="14b1caa1-f608-49fe-9804-5eaf346d0aba",
Synchronized="2017-08-05 16:55:36.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";

/** InventoryType AD_Reference=7e005d54-e029-eb24-c698-53b211653660 */
public static final int INVENTORYTYPE_AD_Reference_ID=292;
/** Set Inventory Type.
@param InventoryType Type of inventory difference */
public void setInventoryType (String InventoryType)
{
if (InventoryType == null || InventoryType.equals(REF_M_InventoryType.InventoryDifference) || InventoryType.equals(REF_M_InventoryType.ChargeAccount) || InventoryType.equals(REF_M_InventoryType.InitialCharge));
 else throw new IllegalArgumentException ("InventoryType Invalid value - " + InventoryType + " - Reference_ID=292 - D - C - I");
if (InventoryType != null && InventoryType.length() > 1)
{
log.warning("Length > 1 - truncated");
InventoryType = InventoryType.substring(0,0);
}
set_Value (COLUMNNAME_InventoryType, InventoryType);
}
/** Get Inventory Type.
@return Type of inventory difference */
public String getInventoryType() 
{
return (String)get_Value(COLUMNNAME_InventoryType);
}

@XendraTrl(Identifier="c9f76420-e4e0-4775-b710-c4ce99204b5c")
public static String es_PE_FIELD_Transactions_InventoryType_Description="Diferentes tipos de inventario";

@XendraTrl(Identifier="c9f76420-e4e0-4775-b710-c4ce99204b5c")
public static String es_PE_FIELD_Transactions_InventoryType_Help="El tipo de diferencia del inventario determina que cuenta es usada. Por default es la cuenta de la diferencia del inventario definida para el almacén. Alternativamente, usted podría seleccionar cualquier carga. Esto permite que usted explique uso interno ó pérdidas extraordinarias del inventario.";

@XendraTrl(Identifier="c9f76420-e4e0-4775-b710-c4ce99204b5c")
public static String es_PE_FIELD_Transactions_InventoryType_Name="Tipo de Inventario";

@XendraField(AD_Column_ID="InventoryType",IsCentrallyMaintained=true,
AD_Tab_ID="a63d8837-34e1-b9a5-9362-585f408186be",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-06-28 18:17:01.0",
Identifier="c9f76420-e4e0-4775-b710-c4ce99204b5c")
public static final String FIELDNAME_Transactions_InventoryType="c9f76420-e4e0-4775-b710-c4ce99204b5c";

@XendraTrl(Identifier="559575a4-4dba-430a-8f2d-43101c0c229f")
public static String es_PE_FIELD_Transaction_InventoryType_Description="Diferentes tipos de inventario";

@XendraTrl(Identifier="559575a4-4dba-430a-8f2d-43101c0c229f")
public static String es_PE_FIELD_Transaction_InventoryType_Help="El tipo de diferencia del inventario determina que cuenta es usada. Por default es la cuenta de la diferencia del inventario definida para el almacén. Alternativamente, usted podría seleccionar cualquier carga. Esto permite que usted explique uso interno ó pérdidas extraordinarias del inventario.";

@XendraTrl(Identifier="559575a4-4dba-430a-8f2d-43101c0c229f")
public static String es_PE_FIELD_Transaction_InventoryType_Name="Tipo de Inventario";

@XendraField(AD_Column_ID="InventoryType",IsCentrallyMaintained=true,
AD_Tab_ID="cb3ed3af-248b-41b3-8216-07164d850cf0",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-18 12:34:37.0",
Identifier="559575a4-4dba-430a-8f2d-43101c0c229f")
public static final String FIELDNAME_Transaction_InventoryType="559575a4-4dba-430a-8f2d-43101c0c229f";

@XendraTrl(Identifier="737bc568-ebef-48ea-bd8c-6e210784307c")
public static String es_PE_COLUMN_InventoryType_Name="Inventory Type";

@XendraColumn(AD_Element_ID="11968cac-c964-2641-6d93-2aa0e9e5349b",ColumnName="InventoryType",
AD_Reference_ID=17,AD_Reference_Value_ID="7e005d54-e029-eb24-c698-53b211653660",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="737bc568-ebef-48ea-bd8c-6e210784307c",Synchronized="2015-08-11 20:32:15.0")
/** Column name InventoryType */
public static final String COLUMNNAME_InventoryType = "InventoryType";
/** Set Line No.
@param Line Unique line for this document */
public void setLine (int Line)
{
set_Value (COLUMNNAME_Line, Integer.valueOf(Line));
}
/** Get Line No.
@return Unique line for this document */
public int getLine() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Line);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="afe45e7c-56c5-48c1-9e3e-8b0645740b88")
public static String es_PE_FIELD_Transactions_LineNo_Description="No. Línea único para este documento";

@XendraTrl(Identifier="afe45e7c-56c5-48c1-9e3e-8b0645740b88")
public static String es_PE_FIELD_Transactions_LineNo_Help="Indica el No. Línea para un documento. También controlará el orden de despliegue de las líneas dentro de un documento";

@XendraTrl(Identifier="afe45e7c-56c5-48c1-9e3e-8b0645740b88")
public static String es_PE_FIELD_Transactions_LineNo_Name="No. Línea";

@XendraField(AD_Column_ID="Line",IsCentrallyMaintained=true,
AD_Tab_ID="a63d8837-34e1-b9a5-9362-585f408186be",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-06-28 18:17:01.0",
Identifier="afe45e7c-56c5-48c1-9e3e-8b0645740b88")
public static final String FIELDNAME_Transactions_LineNo="afe45e7c-56c5-48c1-9e3e-8b0645740b88";

@XendraTrl(Identifier="ceb1a1fc-bb3c-4f43-8efd-39bee71edeed")
public static String es_PE_FIELD_Transaction_LineNo_Description="No. Línea único para este documento";

@XendraTrl(Identifier="ceb1a1fc-bb3c-4f43-8efd-39bee71edeed")
public static String es_PE_FIELD_Transaction_LineNo_Help="Indica el No. Línea para un documento. También controlará el orden de despliegue de las líneas dentro de un documento";

@XendraTrl(Identifier="ceb1a1fc-bb3c-4f43-8efd-39bee71edeed")
public static String es_PE_FIELD_Transaction_LineNo_Name="No. Línea";

@XendraField(AD_Column_ID="Line",IsCentrallyMaintained=true,
AD_Tab_ID="cb3ed3af-248b-41b3-8216-07164d850cf0",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-18 12:34:37.0",
Identifier="ceb1a1fc-bb3c-4f43-8efd-39bee71edeed")
public static final String FIELDNAME_Transaction_LineNo="ceb1a1fc-bb3c-4f43-8efd-39bee71edeed";

@XendraTrl(Identifier="b6c7e723-58f4-4cad-a16c-d5a16ffe392c")
public static String es_PE_COLUMN_Line_Name="Line No";

@XendraColumn(AD_Element_ID="986ef077-61da-f9cf-1c6d-aefe3a35113b",ColumnName="Line",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b6c7e723-58f4-4cad-a16c-d5a16ffe392c",
Synchronized="2015-11-13 17:28:19.0")
/** Column name Line */
public static final String COLUMNNAME_Line = "Line";
/** Set Attribute Set Instance.
@param M_AttributeSetInstance_ID Product Attribute Set Instance */
public void setM_AttributeSetInstance_ID (int M_AttributeSetInstance_ID)
{
if (M_AttributeSetInstance_ID < 0) throw new IllegalArgumentException ("M_AttributeSetInstance_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_AttributeSetInstance_ID, Integer.valueOf(M_AttributeSetInstance_ID));
}
/** Get Attribute Set Instance.
@return Product Attribute Set Instance */
public int getM_AttributeSetInstance_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_AttributeSetInstance_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="2ebb120a-3a24-e483-25e3-ff5461363926")
public static String es_PE_FIELD_ProductTransactions_AttributeSetInstance_Description="Instancia del conjunto de atributos del producto";

@XendraTrl(Identifier="2ebb120a-3a24-e483-25e3-ff5461363926")
public static String es_PE_FIELD_ProductTransactions_AttributeSetInstance_Help="Valor actual de Instancia del conjunto de atributos del producto";

@XendraTrl(Identifier="2ebb120a-3a24-e483-25e3-ff5461363926")
public static String es_PE_FIELD_ProductTransactions_AttributeSetInstance_Name="Instancia del Conjunto de Atributos";

@XendraField(AD_Column_ID="M_AttributeSetInstance_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f13e72ac-9a92-1f12-5bdf-0bfd25daef93",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2ebb120a-3a24-e483-25e3-ff5461363926")
public static final String FIELDNAME_ProductTransactions_AttributeSetInstance="2ebb120a-3a24-e483-25e3-ff5461363926";

@XendraTrl(Identifier="74edc71d-7dad-487e-b549-4da802ec4e42")
public static String es_PE_FIELD_Transactions_AttributeSetInstance_Description="Instancia del conjunto de atributos del producto";

@XendraTrl(Identifier="74edc71d-7dad-487e-b549-4da802ec4e42")
public static String es_PE_FIELD_Transactions_AttributeSetInstance_Help="Valor actual de Instancia del conjunto de atributos del producto";

@XendraTrl(Identifier="74edc71d-7dad-487e-b549-4da802ec4e42")
public static String es_PE_FIELD_Transactions_AttributeSetInstance_Name="Instancia del Conjunto de Atributos";

@XendraField(AD_Column_ID="M_AttributeSetInstance_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a63d8837-34e1-b9a5-9362-585f408186be",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-06-28 18:17:01.0",
Identifier="74edc71d-7dad-487e-b549-4da802ec4e42")
public static final String FIELDNAME_Transactions_AttributeSetInstance="74edc71d-7dad-487e-b549-4da802ec4e42";

@XendraTrl(Identifier="c8d10725-383f-e9ff-77c5-4d5edd36fc89")
public static String es_PE_FIELD_MaterialTransactions_AttributeSetInstance_Description="Instancia del conjunto de atributos del producto";

@XendraTrl(Identifier="c8d10725-383f-e9ff-77c5-4d5edd36fc89")
public static String es_PE_FIELD_MaterialTransactions_AttributeSetInstance_Help="Valor actual de Instancia del conjunto de atributos del producto";

@XendraTrl(Identifier="c8d10725-383f-e9ff-77c5-4d5edd36fc89")
public static String es_PE_FIELD_MaterialTransactions_AttributeSetInstance_Name="Instancia del Conjunto de Atributos";

@XendraField(AD_Column_ID="M_AttributeSetInstance_ID",IsCentrallyMaintained=true,
AD_Tab_ID="26bc3fe1-0b93-fca9-4754-7847ab21a970",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c8d10725-383f-e9ff-77c5-4d5edd36fc89")
public static final String FIELDNAME_MaterialTransactions_AttributeSetInstance="c8d10725-383f-e9ff-77c5-4d5edd36fc89";

@XendraTrl(Identifier="1e4fcb03-0bcd-4706-9073-db98d466d79a")
public static String es_PE_FIELD_Transaction_AttributeSetInstance_Description="Instancia del conjunto de atributos del producto";

@XendraTrl(Identifier="1e4fcb03-0bcd-4706-9073-db98d466d79a")
public static String es_PE_FIELD_Transaction_AttributeSetInstance_Help="Valor actual de Instancia del conjunto de atributos del producto";

@XendraTrl(Identifier="1e4fcb03-0bcd-4706-9073-db98d466d79a")
public static String es_PE_FIELD_Transaction_AttributeSetInstance_Name="Instancia del Conjunto de Atributos";

@XendraField(AD_Column_ID="M_AttributeSetInstance_ID",IsCentrallyMaintained=true,
AD_Tab_ID="cb3ed3af-248b-41b3-8216-07164d850cf0",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-18 12:34:37.0",
Identifier="1e4fcb03-0bcd-4706-9073-db98d466d79a")
public static final String FIELDNAME_Transaction_AttributeSetInstance="1e4fcb03-0bcd-4706-9073-db98d466d79a";

@XendraTrl(Identifier="796ea1f5-2cd5-fb56-d7fb-f5e4a93214e4")
public static String es_PE_COLUMN_M_AttributeSetInstance_ID_Name="Instancia del Conjunto de Atributos";

@XendraColumn(AD_Element_ID="137807f2-3c52-e193-3ceb-f10b819cf955",
ColumnName="M_AttributeSetInstance_ID",AD_Reference_ID=35,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="796ea1f5-2cd5-fb56-d7fb-f5e4a93214e4",Synchronized="2017-08-05 16:55:36.0")
/** Column name M_AttributeSetInstance_ID */
public static final String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";
/** Set Shipment/Receipt Line.
@param M_InOutLine_ID Line on Shipment or Receipt document */
public void setM_InOutLine_ID (int M_InOutLine_ID)
{
if (M_InOutLine_ID <= 0) set_ValueNoCheck (COLUMNNAME_M_InOutLine_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_M_InOutLine_ID, Integer.valueOf(M_InOutLine_ID));
}
/** Get Shipment/Receipt Line.
@return Line on Shipment or Receipt document */
public int getM_InOutLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_InOutLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="6748b68d-b56e-7867-a1d2-5ffb564e39e1")
public static String es_PE_FIELD_ProductTransactions_ShipmentReceiptLine_Description="Item de entrega ó documento de recibo.";

@XendraTrl(Identifier="6748b68d-b56e-7867-a1d2-5ffb564e39e1")
public static String es_PE_FIELD_ProductTransactions_ShipmentReceiptLine_Help="Indica un Item único en un documento de entrega / recibo";

@XendraTrl(Identifier="6748b68d-b56e-7867-a1d2-5ffb564e39e1")
public static String es_PE_FIELD_ProductTransactions_ShipmentReceiptLine_Name="Item Entrega / Recibo";

@XendraField(AD_Column_ID="M_InOutLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f13e72ac-9a92-1f12-5bdf-0bfd25daef93",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6748b68d-b56e-7867-a1d2-5ffb564e39e1")
public static final String FIELDNAME_ProductTransactions_ShipmentReceiptLine="6748b68d-b56e-7867-a1d2-5ffb564e39e1";

@XendraTrl(Identifier="2db6e0d0-3722-4d2e-bcfb-d0135641f994")
public static String es_PE_FIELD_Transactions_ShipmentReceiptLine_Description="Línea de entrega ó documento de recibo.";

@XendraTrl(Identifier="2db6e0d0-3722-4d2e-bcfb-d0135641f994")
public static String es_PE_FIELD_Transactions_ShipmentReceiptLine_Help="La línea de Entrega / Recibo indica una línea única en un documento de entrega / recibo";

@XendraTrl(Identifier="2db6e0d0-3722-4d2e-bcfb-d0135641f994")
public static String es_PE_FIELD_Transactions_ShipmentReceiptLine_Name="Línea Entrega / Recibo";

@XendraField(AD_Column_ID="M_InOutLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a63d8837-34e1-b9a5-9362-585f408186be",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-06-28 18:17:01.0",
Identifier="2db6e0d0-3722-4d2e-bcfb-d0135641f994")
public static final String FIELDNAME_Transactions_ShipmentReceiptLine="2db6e0d0-3722-4d2e-bcfb-d0135641f994";

@XendraTrl(Identifier="e157c049-9e63-47ab-6b24-2d4b080f02e3")
public static String es_PE_FIELD_MaterialTransactions_ShipmentReceiptLine_Description="Item de entrega ó documento de recibo.";

@XendraTrl(Identifier="e157c049-9e63-47ab-6b24-2d4b080f02e3")
public static String es_PE_FIELD_MaterialTransactions_ShipmentReceiptLine_Help="Indica un Item único en un documento de entrega / recibo";

@XendraTrl(Identifier="e157c049-9e63-47ab-6b24-2d4b080f02e3")
public static String es_PE_FIELD_MaterialTransactions_ShipmentReceiptLine_Name="Item Entrega / Recibo";

@XendraField(AD_Column_ID="M_InOutLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="26bc3fe1-0b93-fca9-4754-7847ab21a970",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e157c049-9e63-47ab-6b24-2d4b080f02e3")
public static final String FIELDNAME_MaterialTransactions_ShipmentReceiptLine="e157c049-9e63-47ab-6b24-2d4b080f02e3";

@XendraTrl(Identifier="1dbd424e-71c9-4ef2-92eb-97c8ffa5d33c")
public static String es_PE_FIELD_Transaction_ShipmentReceiptLine_Description="Línea de entrega ó documento de recibo.";

@XendraTrl(Identifier="1dbd424e-71c9-4ef2-92eb-97c8ffa5d33c")
public static String es_PE_FIELD_Transaction_ShipmentReceiptLine_Help="La línea de Entrega / Recibo indica una línea única en un documento de entrega / recibo";

@XendraTrl(Identifier="1dbd424e-71c9-4ef2-92eb-97c8ffa5d33c")
public static String es_PE_FIELD_Transaction_ShipmentReceiptLine_Name="Línea Entrega / Recibo";

@XendraField(AD_Column_ID="M_InOutLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="cb3ed3af-248b-41b3-8216-07164d850cf0",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-18 12:34:37.0",
Identifier="1dbd424e-71c9-4ef2-92eb-97c8ffa5d33c")
public static final String FIELDNAME_Transaction_ShipmentReceiptLine="1dbd424e-71c9-4ef2-92eb-97c8ffa5d33c";

@XendraTrl(Identifier="d5c0c489-f465-d8ae-0928-f7b7180b2545")
public static String es_PE_COLUMN_M_InOutLine_ID_Name="Línea Entrega / Recibo";

@XendraColumn(AD_Element_ID="a4d9928e-fbec-fd6c-b061-d3dbbd7de02c",ColumnName="M_InOutLine_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d5c0c489-f465-d8ae-0928-f7b7180b2545",
Synchronized="2017-08-05 16:55:36.0")
/** Column name M_InOutLine_ID */
public static final String COLUMNNAME_M_InOutLine_ID = "M_InOutLine_ID";
/** Set Phys.Inventory Line.
@param M_InventoryLine_ID Unique line in an Inventory document */
public void setM_InventoryLine_ID (int M_InventoryLine_ID)
{
if (M_InventoryLine_ID <= 0) set_ValueNoCheck (COLUMNNAME_M_InventoryLine_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_M_InventoryLine_ID, Integer.valueOf(M_InventoryLine_ID));
}
/** Get Phys.Inventory Line.
@return Unique line in an Inventory document */
public int getM_InventoryLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_InventoryLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d166ea98-74fc-57f8-bf30-393adff65e08")
public static String es_PE_FIELD_ProductTransactions_PhysInventoryLine_Description="Item únicoen un documento de inventario.";

@XendraTrl(Identifier="d166ea98-74fc-57f8-bf30-393adff65e08")
public static String es_PE_FIELD_ProductTransactions_PhysInventoryLine_Help="IIndica el Item del documento del inventario físico (si es aplicable) para esta transacción.";

@XendraTrl(Identifier="d166ea98-74fc-57f8-bf30-393adff65e08")
public static String es_PE_FIELD_ProductTransactions_PhysInventoryLine_Name="Item de Inventario Físico";

@XendraField(AD_Column_ID="M_InventoryLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f13e72ac-9a92-1f12-5bdf-0bfd25daef93",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d166ea98-74fc-57f8-bf30-393adff65e08")
public static final String FIELDNAME_ProductTransactions_PhysInventoryLine="d166ea98-74fc-57f8-bf30-393adff65e08";

@XendraTrl(Identifier="09e05dd8-6720-4a7e-8add-2cb978500d5f")
public static String es_PE_FIELD_Transactions_PhysInventoryLine_Description="Línea única en un documento de inventario.";

@XendraTrl(Identifier="09e05dd8-6720-4a7e-8add-2cb978500d5f")
public static String es_PE_FIELD_Transactions_PhysInventoryLine_Help="La línea del inventario físico indica la línea del documento del inventario físico (si es aplicable) para esta transacción.";

@XendraTrl(Identifier="09e05dd8-6720-4a7e-8add-2cb978500d5f")
public static String es_PE_FIELD_Transactions_PhysInventoryLine_Name="Línea de Inventario Físico";

@XendraField(AD_Column_ID="M_InventoryLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a63d8837-34e1-b9a5-9362-585f408186be",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-06-28 18:17:01.0",
Identifier="09e05dd8-6720-4a7e-8add-2cb978500d5f")
public static final String FIELDNAME_Transactions_PhysInventoryLine="09e05dd8-6720-4a7e-8add-2cb978500d5f";

@XendraTrl(Identifier="e5036c28-8e1f-27b6-31b8-565f98c70c57")
public static String es_PE_FIELD_MaterialTransactions_PhysInventoryLine_Description="Item único en un documento de inventario.";

@XendraTrl(Identifier="e5036c28-8e1f-27b6-31b8-565f98c70c57")
public static String es_PE_FIELD_MaterialTransactions_PhysInventoryLine_Help="Indica el Item del documento del inventario físico (si es aplicable) para esta transacción.";

@XendraTrl(Identifier="e5036c28-8e1f-27b6-31b8-565f98c70c57")
public static String es_PE_FIELD_MaterialTransactions_PhysInventoryLine_Name="Item de Inventario Físico";

@XendraField(AD_Column_ID="M_InventoryLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="26bc3fe1-0b93-fca9-4754-7847ab21a970",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e5036c28-8e1f-27b6-31b8-565f98c70c57")
public static final String FIELDNAME_MaterialTransactions_PhysInventoryLine="e5036c28-8e1f-27b6-31b8-565f98c70c57";

@XendraTrl(Identifier="e3b981a5-d52b-4b2d-8ace-432f674a8283")
public static String es_PE_FIELD_Transaction_PhysInventoryLine_Description="Línea única en un documento de inventario.";

@XendraTrl(Identifier="e3b981a5-d52b-4b2d-8ace-432f674a8283")
public static String es_PE_FIELD_Transaction_PhysInventoryLine_Help="La línea del inventario físico indica la línea del documento del inventario físico (si es aplicable) para esta transacción.";

@XendraTrl(Identifier="e3b981a5-d52b-4b2d-8ace-432f674a8283")
public static String es_PE_FIELD_Transaction_PhysInventoryLine_Name="Línea de Inventario Físico";

@XendraField(AD_Column_ID="M_InventoryLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="cb3ed3af-248b-41b3-8216-07164d850cf0",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-18 12:34:37.0",
Identifier="e3b981a5-d52b-4b2d-8ace-432f674a8283")
public static final String FIELDNAME_Transaction_PhysInventoryLine="e3b981a5-d52b-4b2d-8ace-432f674a8283";

@XendraTrl(Identifier="624f8904-19a8-958e-e884-2fe1e23079c0")
public static String es_PE_COLUMN_M_InventoryLine_ID_Name="Línea de Inventario Físico";

@XendraColumn(AD_Element_ID="2c5571d8-3b1f-8721-db52-cae644155140",ColumnName="M_InventoryLine_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="624f8904-19a8-958e-e884-2fe1e23079c0",
Synchronized="2017-08-05 16:55:36.0")
/** Column name M_InventoryLine_ID */
public static final String COLUMNNAME_M_InventoryLine_ID = "M_InventoryLine_ID";
/** Set Locator.
@param M_Locator_ID Warehouse Locator */
public void setM_Locator_ID (int M_Locator_ID)
{
if (M_Locator_ID <= 0) set_ValueNoCheck (COLUMNNAME_M_Locator_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_M_Locator_ID, Integer.valueOf(M_Locator_ID));
}
/** Get Locator.
@return Warehouse Locator */
public int getM_Locator_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Locator_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ef7f55ee-3b31-a230-2e83-92353ab66dc2")
public static String es_PE_FIELD_ProductTransactions_Locator_Description="Ubicación de Almacén";

@XendraTrl(Identifier="ef7f55ee-3b31-a230-2e83-92353ab66dc2")
public static String es_PE_FIELD_ProductTransactions_Locator_Help="El ID de la ubicación indica en que parte del almacén se localiza el producto";

@XendraTrl(Identifier="ef7f55ee-3b31-a230-2e83-92353ab66dc2")
public static String es_PE_FIELD_ProductTransactions_Locator_Name="Ubicación";

@XendraField(AD_Column_ID="M_Locator_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f13e72ac-9a92-1f12-5bdf-0bfd25daef93",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ef7f55ee-3b31-a230-2e83-92353ab66dc2")
public static final String FIELDNAME_ProductTransactions_Locator="ef7f55ee-3b31-a230-2e83-92353ab66dc2";

@XendraTrl(Identifier="f0d0c655-cabc-40aa-9a43-5724df38dad8")
public static String es_PE_FIELD_Transactions_Locator_Description="Ubicación de Almacén";

@XendraTrl(Identifier="f0d0c655-cabc-40aa-9a43-5724df38dad8")
public static String es_PE_FIELD_Transactions_Locator_Help="El ID de la ubicación indica en que parte del almacén se localiza el producto";

@XendraTrl(Identifier="f0d0c655-cabc-40aa-9a43-5724df38dad8")
public static String es_PE_FIELD_Transactions_Locator_Name="Ubicación";

@XendraField(AD_Column_ID="M_Locator_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a63d8837-34e1-b9a5-9362-585f408186be",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-06-28 18:17:01.0",
Identifier="f0d0c655-cabc-40aa-9a43-5724df38dad8")
public static final String FIELDNAME_Transactions_Locator="f0d0c655-cabc-40aa-9a43-5724df38dad8";

@XendraTrl(Identifier="fa6c4356-7a2a-3a1d-9b44-586a9a2851a1")
public static String es_PE_FIELD_MaterialTransactions_Locator_Description="Ubicación de Almacén";

@XendraTrl(Identifier="fa6c4356-7a2a-3a1d-9b44-586a9a2851a1")
public static String es_PE_FIELD_MaterialTransactions_Locator_Help="El ID de la ubicación indica en que parte del almacén se localiza el producto";

@XendraTrl(Identifier="fa6c4356-7a2a-3a1d-9b44-586a9a2851a1")
public static String es_PE_FIELD_MaterialTransactions_Locator_Name="Ubicación";

@XendraField(AD_Column_ID="M_Locator_ID",IsCentrallyMaintained=true,
AD_Tab_ID="26bc3fe1-0b93-fca9-4754-7847ab21a970",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=20,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fa6c4356-7a2a-3a1d-9b44-586a9a2851a1")
public static final String FIELDNAME_MaterialTransactions_Locator="fa6c4356-7a2a-3a1d-9b44-586a9a2851a1";

@XendraTrl(Identifier="d593b418-5013-4080-9ce4-02b2c870a547")
public static String es_PE_FIELD_Transaction_Locator_Description="Ubicación de Almacén";

@XendraTrl(Identifier="d593b418-5013-4080-9ce4-02b2c870a547")
public static String es_PE_FIELD_Transaction_Locator_Help="El ID de la ubicación indica en que parte del almacén se localiza el producto";

@XendraTrl(Identifier="d593b418-5013-4080-9ce4-02b2c870a547")
public static String es_PE_FIELD_Transaction_Locator_Name="Ubicación";

@XendraField(AD_Column_ID="M_Locator_ID",IsCentrallyMaintained=true,
AD_Tab_ID="cb3ed3af-248b-41b3-8216-07164d850cf0",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-18 12:34:37.0",
Identifier="d593b418-5013-4080-9ce4-02b2c870a547")
public static final String FIELDNAME_Transaction_Locator="d593b418-5013-4080-9ce4-02b2c870a547";

@XendraTrl(Identifier="ee5a6cf6-61ad-af83-97d2-d6eb86179c2b")
public static String es_PE_COLUMN_M_Locator_ID_Name="Ubicación";

@XendraColumn(AD_Element_ID="67f044ce-2864-93f9-fd0d-320945150933",ColumnName="M_Locator_ID",
AD_Reference_ID=31,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ee5a6cf6-61ad-af83-97d2-d6eb86179c2b",
Synchronized="2017-08-05 16:55:36.0")
/** Column name M_Locator_ID */
public static final String COLUMNNAME_M_Locator_ID = "M_Locator_ID";
/** Set Move Line.
@param M_MovementLine_ID Inventory Move document Line */
public void setM_MovementLine_ID (int M_MovementLine_ID)
{
if (M_MovementLine_ID <= 0) set_ValueNoCheck (COLUMNNAME_M_MovementLine_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_M_MovementLine_ID, Integer.valueOf(M_MovementLine_ID));
}
/** Get Move Line.
@return Inventory Move document Line */
public int getM_MovementLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_MovementLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="de128439-20be-2028-0ed9-ec9729f30a01")
public static String es_PE_FIELD_ProductTransactions_MoveLine_Description="Item del documento de movimiento de inventario";

@XendraTrl(Identifier="de128439-20be-2028-0ed9-ec9729f30a01")
public static String es_PE_FIELD_ProductTransactions_MoveLine_Help="Indica el Item del documento de movimiento de inventario (si aplica) para esta transacción.";

@XendraTrl(Identifier="de128439-20be-2028-0ed9-ec9729f30a01")
public static String es_PE_FIELD_ProductTransactions_MoveLine_Name="Item del Movimiento";

@XendraField(AD_Column_ID="M_MovementLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f13e72ac-9a92-1f12-5bdf-0bfd25daef93",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="de128439-20be-2028-0ed9-ec9729f30a01")
public static final String FIELDNAME_ProductTransactions_MoveLine="de128439-20be-2028-0ed9-ec9729f30a01";

@XendraTrl(Identifier="e18ed916-83ee-4815-8559-227331e5a154")
public static String es_PE_FIELD_Transactions_MoveLine_Description="Línea del documento de movimiento de inventario";

@XendraTrl(Identifier="e18ed916-83ee-4815-8559-227331e5a154")
public static String es_PE_FIELD_Transactions_MoveLine_Help="La línea del movimiento indica la linea del documento de movimiento de inventario (si aplica) para esta transacción.";

@XendraTrl(Identifier="e18ed916-83ee-4815-8559-227331e5a154")
public static String es_PE_FIELD_Transactions_MoveLine_Name="Línea del Movimiento";

@XendraField(AD_Column_ID="M_MovementLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a63d8837-34e1-b9a5-9362-585f408186be",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-06-28 18:17:01.0",
Identifier="e18ed916-83ee-4815-8559-227331e5a154")
public static final String FIELDNAME_Transactions_MoveLine="e18ed916-83ee-4815-8559-227331e5a154";

@XendraTrl(Identifier="8719e36c-5ff0-3b63-ce90-bbcbc0b0a164")
public static String es_PE_FIELD_MaterialTransactions_MoveLine_Description="Item del documento de movimiento de inventario";

@XendraTrl(Identifier="8719e36c-5ff0-3b63-ce90-bbcbc0b0a164")
public static String es_PE_FIELD_MaterialTransactions_MoveLine_Help="Indica el Item del documento de movimiento de inventario (si aplica) para esta transacción.";

@XendraTrl(Identifier="8719e36c-5ff0-3b63-ce90-bbcbc0b0a164")
public static String es_PE_FIELD_MaterialTransactions_MoveLine_Name="Item del Movimiento";

@XendraField(AD_Column_ID="M_MovementLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="26bc3fe1-0b93-fca9-4754-7847ab21a970",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8719e36c-5ff0-3b63-ce90-bbcbc0b0a164")
public static final String FIELDNAME_MaterialTransactions_MoveLine="8719e36c-5ff0-3b63-ce90-bbcbc0b0a164";

@XendraTrl(Identifier="bf5df9da-5f8a-48b5-a0e4-af6cc93ed68d")
public static String es_PE_FIELD_Transaction_MoveLine_Description="Línea del documento de movimiento de inventario";

@XendraTrl(Identifier="bf5df9da-5f8a-48b5-a0e4-af6cc93ed68d")
public static String es_PE_FIELD_Transaction_MoveLine_Help="La línea del movimiento indica la linea del documento de movimiento de inventario (si aplica) para esta transacción.";

@XendraTrl(Identifier="bf5df9da-5f8a-48b5-a0e4-af6cc93ed68d")
public static String es_PE_FIELD_Transaction_MoveLine_Name="Línea del Movimiento";

@XendraField(AD_Column_ID="M_MovementLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="cb3ed3af-248b-41b3-8216-07164d850cf0",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-18 12:34:37.0",
Identifier="bf5df9da-5f8a-48b5-a0e4-af6cc93ed68d")
public static final String FIELDNAME_Transaction_MoveLine="bf5df9da-5f8a-48b5-a0e4-af6cc93ed68d";

@XendraTrl(Identifier="170f913e-cb2a-4fe5-70e6-93377e2c0bc6")
public static String es_PE_COLUMN_M_MovementLine_ID_Name="Línea del Movimiento";

@XendraColumn(AD_Element_ID="45800ec7-b982-e856-179e-390dd2305e2e",ColumnName="M_MovementLine_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="170f913e-cb2a-4fe5-70e6-93377e2c0bc6",
Synchronized="2017-08-05 16:55:36.0")
/** Column name M_MovementLine_ID */
public static final String COLUMNNAME_M_MovementLine_ID = "M_MovementLine_ID";
/** Set Movement Date.
@param MovementDate Date a product was moved in or out of inventory */
public void setMovementDate (Timestamp MovementDate)
{
if (MovementDate == null) throw new IllegalArgumentException ("MovementDate is mandatory.");
set_ValueNoCheck (COLUMNNAME_MovementDate, MovementDate);
}
/** Get Movement Date.
@return Date a product was moved in or out of inventory */
public Timestamp getMovementDate() 
{
return (Timestamp)get_Value(COLUMNNAME_MovementDate);
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getMovementDate()));
}

@XendraTrl(Identifier="6b13ee85-d482-3876-a54a-cda940250766")
public static String es_PE_FIELD_ProductTransactions_MovementDate_Description="Fecha en que un producto fue movido (dentro ó fuera) del inventario";

@XendraTrl(Identifier="6b13ee85-d482-3876-a54a-cda940250766")
public static String es_PE_FIELD_ProductTransactions_MovementDate_Help="La fecha del movimiento indica la fecha en que el producto es movido. Éste es el resultado de un embarque; recibo ó movimiento de inventario.";

@XendraTrl(Identifier="6b13ee85-d482-3876-a54a-cda940250766")
public static String es_PE_FIELD_ProductTransactions_MovementDate_Name="Fecha de Movimiento";

@XendraField(AD_Column_ID="MovementDate",IsCentrallyMaintained=true,
AD_Tab_ID="f13e72ac-9a92-1f12-5bdf-0bfd25daef93",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=90,SortNo=3,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6b13ee85-d482-3876-a54a-cda940250766")
public static final String FIELDNAME_ProductTransactions_MovementDate="6b13ee85-d482-3876-a54a-cda940250766";

@XendraTrl(Identifier="565d06a0-d983-4adc-800e-30f555b3b969")
public static String es_PE_FIELD_Transactions_MovementDate_Description="Fecha en que un producto fue movido (dentro ó fuera) del inventario";

@XendraTrl(Identifier="565d06a0-d983-4adc-800e-30f555b3b969")
public static String es_PE_FIELD_Transactions_MovementDate_Help="La fecha del movimiento indica la fecha en que el producto es movido. Éste es el resultado de un embarque; recibo ó movimiento de inventario.";

@XendraTrl(Identifier="565d06a0-d983-4adc-800e-30f555b3b969")
public static String es_PE_FIELD_Transactions_MovementDate_Name="Fecha de Movimiento";

@XendraField(AD_Column_ID="MovementDate",IsCentrallyMaintained=true,
AD_Tab_ID="a63d8837-34e1-b9a5-9362-585f408186be",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=7,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-06-28 18:17:02.0",
Identifier="565d06a0-d983-4adc-800e-30f555b3b969")
public static final String FIELDNAME_Transactions_MovementDate="565d06a0-d983-4adc-800e-30f555b3b969";

@XendraTrl(Identifier="648580f0-41de-9c8f-0577-bcbb5be13c5b")
public static String es_PE_FIELD_MaterialTransactions_MovementDate_Description="Fecha en que un producto fue movido (dentro ó fuera) del inventario";

@XendraTrl(Identifier="648580f0-41de-9c8f-0577-bcbb5be13c5b")
public static String es_PE_FIELD_MaterialTransactions_MovementDate_Help="La fecha del movimiento indica la fecha en que el producto es movido. Éste es el resultado de un embarque; recibo ó movimiento de inventario.";

@XendraTrl(Identifier="648580f0-41de-9c8f-0577-bcbb5be13c5b")
public static String es_PE_FIELD_MaterialTransactions_MovementDate_Name="Fecha de Movimiento";

@XendraField(AD_Column_ID="MovementDate",IsCentrallyMaintained=true,
AD_Tab_ID="26bc3fe1-0b93-fca9-4754-7847ab21a970",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=30,SortNo=-1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="648580f0-41de-9c8f-0577-bcbb5be13c5b")
public static final String FIELDNAME_MaterialTransactions_MovementDate="648580f0-41de-9c8f-0577-bcbb5be13c5b";

@XendraTrl(Identifier="92c71dc6-5dfb-4777-b286-a9ad6522750b")
public static String es_PE_FIELD_Transaction_MovementDate_Description="Fecha en que un producto fue movido (dentro ó fuera) del inventario";

@XendraTrl(Identifier="92c71dc6-5dfb-4777-b286-a9ad6522750b")
public static String es_PE_FIELD_Transaction_MovementDate_Help="La fecha del movimiento indica la fecha en que el producto es movido. Éste es el resultado de un embarque; recibo ó movimiento de inventario.";

@XendraTrl(Identifier="92c71dc6-5dfb-4777-b286-a9ad6522750b")
public static String es_PE_FIELD_Transaction_MovementDate_Name="Fecha de Movimiento";

@XendraField(AD_Column_ID="MovementDate",IsCentrallyMaintained=true,
AD_Tab_ID="cb3ed3af-248b-41b3-8216-07164d850cf0",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=7,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-18 12:34:37.0",
Identifier="92c71dc6-5dfb-4777-b286-a9ad6522750b")
public static final String FIELDNAME_Transaction_MovementDate="92c71dc6-5dfb-4777-b286-a9ad6522750b";

@XendraTrl(Identifier="f22c3099-3df3-21a1-d365-6011b820b494")
public static String es_PE_COLUMN_MovementDate_Name="Fecha de Movimiento";

@XendraColumn(AD_Element_ID="7a907f01-8525-820d-22d4-98b06d4b902b",ColumnName="MovementDate",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f22c3099-3df3-21a1-d365-6011b820b494",
Synchronized="2017-08-05 16:55:36.0")
/** Column name MovementDate */
public static final String COLUMNNAME_MovementDate = "MovementDate";
/** Set Movement Quantity.
@param MovementQty Quantity of a product moved. */
public void setMovementQty (BigDecimal MovementQty)
{
if (MovementQty == null) throw new IllegalArgumentException ("MovementQty is mandatory.");
set_ValueNoCheck (COLUMNNAME_MovementQty, MovementQty);
}
/** Get Movement Quantity.
@return Quantity of a product moved. */
public BigDecimal getMovementQty() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_MovementQty);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="a03d48d7-26cb-a62e-bae8-33d75a261acc")
public static String es_PE_FIELD_ProductTransactions_MovementQuantity_Description="Cantidad de un producto movido";

@XendraTrl(Identifier="a03d48d7-26cb-a62e-bae8-33d75a261acc")
public static String es_PE_FIELD_ProductTransactions_MovementQuantity_Help="La Cantidad del Movimiento indica la cantidad de un producto que ha sido movido";

@XendraTrl(Identifier="a03d48d7-26cb-a62e-bae8-33d75a261acc")
public static String es_PE_FIELD_ProductTransactions_MovementQuantity_Name="Cantidad del Movimiento";

@XendraField(AD_Column_ID="MovementQty",IsCentrallyMaintained=true,
AD_Tab_ID="f13e72ac-9a92-1f12-5bdf-0bfd25daef93",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a03d48d7-26cb-a62e-bae8-33d75a261acc")
public static final String FIELDNAME_ProductTransactions_MovementQuantity="a03d48d7-26cb-a62e-bae8-33d75a261acc";

@XendraTrl(Identifier="d355a93d-8332-4cf4-a379-15621ca53785")
public static String es_PE_FIELD_Transactions_MovementQuantity_Description="Cantidad de un producto movido";

@XendraTrl(Identifier="d355a93d-8332-4cf4-a379-15621ca53785")
public static String es_PE_FIELD_Transactions_MovementQuantity_Help="La Cantidad del Movimiento indica la cantidad de un producto que ha sido movido";

@XendraTrl(Identifier="d355a93d-8332-4cf4-a379-15621ca53785")
public static String es_PE_FIELD_Transactions_MovementQuantity_Name="Cantidad del Movimiento";

@XendraField(AD_Column_ID="MovementQty",IsCentrallyMaintained=true,
AD_Tab_ID="a63d8837-34e1-b9a5-9362-585f408186be",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-06-28 18:17:02.0",
Identifier="d355a93d-8332-4cf4-a379-15621ca53785")
public static final String FIELDNAME_Transactions_MovementQuantity="d355a93d-8332-4cf4-a379-15621ca53785";

@XendraTrl(Identifier="1a074cc8-4500-a3c3-534f-1b0c5d2159b6")
public static String es_PE_FIELD_MaterialTransactions_MovementQuantity_Description="Cantidad de un producto movido";

@XendraTrl(Identifier="1a074cc8-4500-a3c3-534f-1b0c5d2159b6")
public static String es_PE_FIELD_MaterialTransactions_MovementQuantity_Help="La Cantidad del Movimiento indica la cantidad de un producto que ha sido movido";

@XendraTrl(Identifier="1a074cc8-4500-a3c3-534f-1b0c5d2159b6")
public static String es_PE_FIELD_MaterialTransactions_MovementQuantity_Name="Cantidad del Movimiento";

@XendraField(AD_Column_ID="MovementQty",IsCentrallyMaintained=true,
AD_Tab_ID="26bc3fe1-0b93-fca9-4754-7847ab21a970",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1a074cc8-4500-a3c3-534f-1b0c5d2159b6")
public static final String FIELDNAME_MaterialTransactions_MovementQuantity="1a074cc8-4500-a3c3-534f-1b0c5d2159b6";

@XendraTrl(Identifier="aa7719b1-ab0a-4a3e-88af-62ceb9775314")
public static String es_PE_FIELD_Transaction_MovementQuantity_Description="Cantidad de un producto movido";

@XendraTrl(Identifier="aa7719b1-ab0a-4a3e-88af-62ceb9775314")
public static String es_PE_FIELD_Transaction_MovementQuantity_Help="La Cantidad del Movimiento indica la cantidad de un producto que ha sido movido";

@XendraTrl(Identifier="aa7719b1-ab0a-4a3e-88af-62ceb9775314")
public static String es_PE_FIELD_Transaction_MovementQuantity_Name="Cantidad del Movimiento";

@XendraField(AD_Column_ID="MovementQty",IsCentrallyMaintained=true,
AD_Tab_ID="cb3ed3af-248b-41b3-8216-07164d850cf0",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-18 12:34:37.0",
Identifier="aa7719b1-ab0a-4a3e-88af-62ceb9775314")
public static final String FIELDNAME_Transaction_MovementQuantity="aa7719b1-ab0a-4a3e-88af-62ceb9775314";

@XendraTrl(Identifier="bcb0789d-609b-487d-db54-2ab1122c75f5")
public static String es_PE_COLUMN_MovementQty_Name="Cantidad del Movimiento";

@XendraColumn(AD_Element_ID="36c2f62a-1d3b-a3ff-a433-9fc2eec47380",ColumnName="MovementQty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bcb0789d-609b-487d-db54-2ab1122c75f5",
Synchronized="2017-08-05 16:55:36.0")
/** Column name MovementQty */
public static final String COLUMNNAME_MovementQty = "MovementQty";
/** Set Movement Quantity Balance.
@param MovementQtyBalance Movement Quantity Balance */
public void setMovementQtyBalance (BigDecimal MovementQtyBalance)
{
if (MovementQtyBalance == null) throw new IllegalArgumentException ("MovementQtyBalance is mandatory.");
set_ValueNoCheck (COLUMNNAME_MovementQtyBalance, MovementQtyBalance);
}
/** Get Movement Quantity Balance.
@return Movement Quantity Balance */
public BigDecimal getMovementQtyBalance() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_MovementQtyBalance);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="d82ad576-5cbc-4390-b73b-675bc5683be9")
public static String es_PE_FIELD_Transactions_MovementQuantityBalance_Name="Movement Quantity Balance";

@XendraField(AD_Column_ID="MovementQtyBalance",IsCentrallyMaintained=true,
AD_Tab_ID="a63d8837-34e1-b9a5-9362-585f408186be",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-06-28 18:17:02.0",
Identifier="d82ad576-5cbc-4390-b73b-675bc5683be9")
public static final String FIELDNAME_Transactions_MovementQuantityBalance="d82ad576-5cbc-4390-b73b-675bc5683be9";

@XendraTrl(Identifier="7d8c1c11-2162-b534-4fc7-b42897058140")
public static String es_PE_FIELD_MaterialTransactions_MovementQuantityBalance_Name="Movement Quantity Balance";

@XendraField(AD_Column_ID="MovementQtyBalance",IsCentrallyMaintained=true,
AD_Tab_ID="26bc3fe1-0b93-fca9-4754-7847ab21a970",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=0,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7d8c1c11-2162-b534-4fc7-b42897058140")
public static final String FIELDNAME_MaterialTransactions_MovementQuantityBalance="7d8c1c11-2162-b534-4fc7-b42897058140";

@XendraTrl(Identifier="0c46699a-d7c8-477f-b4f0-234d45d215a0")
public static String es_PE_FIELD_Transaction_MovementQuantityBalance_Name="Movement Quantity Balance";

@XendraField(AD_Column_ID="MovementQtyBalance",IsCentrallyMaintained=true,
AD_Tab_ID="cb3ed3af-248b-41b3-8216-07164d850cf0",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-18 12:34:37.0",
Identifier="0c46699a-d7c8-477f-b4f0-234d45d215a0")
public static final String FIELDNAME_Transaction_MovementQuantityBalance="0c46699a-d7c8-477f-b4f0-234d45d215a0";

@XendraTrl(Identifier="6c3f9db2-9ed9-2264-e72c-e6a3ec4a4a7b")
public static String es_PE_COLUMN_MovementQtyBalance_Name="Movement Quantity Balance";

@XendraColumn(AD_Element_ID="ac415ed3-ef1a-5e5b-9343-f6e7d056e532",ColumnName="MovementQtyBalance",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6c3f9db2-9ed9-2264-e72c-e6a3ec4a4a7b",
Synchronized="2017-08-05 16:55:36.0")
/** Column name MovementQtyBalance */
public static final String COLUMNNAME_MovementQtyBalance = "MovementQtyBalance";

/** MovementType AD_Reference=0455b4db-004d-594c-a505-3e493bfda9ad */
public static final int MOVEMENTTYPE_AD_Reference_ID=189;
/** Set Movement Type.
@param MovementType Method of moving the inventory */
public void setMovementType (String MovementType)
{
if (MovementType == null) throw new IllegalArgumentException ("MovementType is mandatory");
if (MovementType.equals(REF_M_TransactionMovementType.WorkOrderPlus) || MovementType.equals(REF_M_TransactionMovementType.WorkOrder_) || MovementType.equals(REF_M_TransactionMovementType.ProductionPlus) || MovementType.equals(REF_M_TransactionMovementType.InventoryIn) || MovementType.equals(REF_M_TransactionMovementType.VendorReturns) || MovementType.equals(REF_M_TransactionMovementType.MovementFrom) || MovementType.equals(REF_M_TransactionMovementType.Production_) || MovementType.equals(REF_M_TransactionMovementType.CustomerShipment) || MovementType.equals(REF_M_TransactionMovementType.VendorReceipts) || MovementType.equals(REF_M_TransactionMovementType.InventoryOut) || MovementType.equals(REF_M_TransactionMovementType.MovementTo) || MovementType.equals(REF_M_TransactionMovementType.CustomerReturns) || MovementType.equals(REF_M_TransactionMovementType.NotApply));
 else throw new IllegalArgumentException ("MovementType Invalid value - " + MovementType + " - Reference_ID=189 - W+ - W- - P+ - I+ - R- - M- - P- - C- - V+ - I- - M+ - R+ - NA");
if (MovementType.length() > 2)
{
log.warning("Length > 2 - truncated");
MovementType = MovementType.substring(0,1);
}
set_ValueNoCheck (COLUMNNAME_MovementType, MovementType);
}
/** Get Movement Type.
@return Method of moving the inventory */
public String getMovementType() 
{
return (String)get_Value(COLUMNNAME_MovementType);
}

@XendraTrl(Identifier="4defba8f-83be-3d3c-a0f9-bf4f2666b950")
public static String es_PE_FIELD_ProductTransactions_MovementType_Description="Método de movimiento de inventario";

@XendraTrl(Identifier="4defba8f-83be-3d3c-a0f9-bf4f2666b950")
public static String es_PE_FIELD_ProductTransactions_MovementType_Help="El Tipo de Movimiento indica el tipo de movimiento (entradas; salidas a producción etc)";

@XendraTrl(Identifier="4defba8f-83be-3d3c-a0f9-bf4f2666b950")
public static String es_PE_FIELD_ProductTransactions_MovementType_Name="Tipo de Movimiento";

@XendraField(AD_Column_ID="MovementType",IsCentrallyMaintained=true,
AD_Tab_ID="f13e72ac-9a92-1f12-5bdf-0bfd25daef93",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4defba8f-83be-3d3c-a0f9-bf4f2666b950")
public static final String FIELDNAME_ProductTransactions_MovementType="4defba8f-83be-3d3c-a0f9-bf4f2666b950";

@XendraTrl(Identifier="51225196-d610-45ac-9372-6faa15a6a882")
public static String es_PE_FIELD_Transactions_MovementType_Description="Método de movimiento de inventario";

@XendraTrl(Identifier="51225196-d610-45ac-9372-6faa15a6a882")
public static String es_PE_FIELD_Transactions_MovementType_Help="El Tipo de Movimiento indica el tipo de movimiento (entradas; salidas a producción etc)";

@XendraTrl(Identifier="51225196-d610-45ac-9372-6faa15a6a882")
public static String es_PE_FIELD_Transactions_MovementType_Name="Tipo de Movimiento";

@XendraField(AD_Column_ID="MovementType",IsCentrallyMaintained=true,
AD_Tab_ID="a63d8837-34e1-b9a5-9362-585f408186be",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=2,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-06-28 18:17:02.0",
Identifier="51225196-d610-45ac-9372-6faa15a6a882")
public static final String FIELDNAME_Transactions_MovementType="51225196-d610-45ac-9372-6faa15a6a882";

@XendraTrl(Identifier="36893cd2-ca9e-9a07-397c-f2e8cb9faa5c")
public static String es_PE_FIELD_MaterialTransactions_MovementType_Description="Método de movimiento de inventario";

@XendraTrl(Identifier="36893cd2-ca9e-9a07-397c-f2e8cb9faa5c")
public static String es_PE_FIELD_MaterialTransactions_MovementType_Help="El Tipo de Movimiento indica el tipo de movimiento (entradas; salidas a producción etc)";

@XendraTrl(Identifier="36893cd2-ca9e-9a07-397c-f2e8cb9faa5c")
public static String es_PE_FIELD_MaterialTransactions_MovementType_Name="Tipo de Movimiento";

@XendraField(AD_Column_ID="MovementType",IsCentrallyMaintained=true,
AD_Tab_ID="26bc3fe1-0b93-fca9-4754-7847ab21a970",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=60,SortNo=3,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="36893cd2-ca9e-9a07-397c-f2e8cb9faa5c")
public static final String FIELDNAME_MaterialTransactions_MovementType="36893cd2-ca9e-9a07-397c-f2e8cb9faa5c";

@XendraTrl(Identifier="819b9d16-2407-4d96-afe8-06b5a1242131")
public static String es_PE_FIELD_Transaction_MovementType_Description="Método de movimiento de inventario";

@XendraTrl(Identifier="819b9d16-2407-4d96-afe8-06b5a1242131")
public static String es_PE_FIELD_Transaction_MovementType_Help="El Tipo de Movimiento indica el tipo de movimiento (entradas; salidas a producción etc)";

@XendraTrl(Identifier="819b9d16-2407-4d96-afe8-06b5a1242131")
public static String es_PE_FIELD_Transaction_MovementType_Name="Tipo de Movimiento";

@XendraField(AD_Column_ID="MovementType",IsCentrallyMaintained=true,
AD_Tab_ID="cb3ed3af-248b-41b3-8216-07164d850cf0",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=2,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-18 12:34:37.0",
Identifier="819b9d16-2407-4d96-afe8-06b5a1242131")
public static final String FIELDNAME_Transaction_MovementType="819b9d16-2407-4d96-afe8-06b5a1242131";

@XendraTrl(Identifier="652b3c5f-4ce9-4d0a-4cc9-356d2de4a69b")
public static String es_PE_COLUMN_MovementType_Name="Tipo de Movimiento";

@XendraColumn(AD_Element_ID="6deba235-3003-eca1-becf-5fd99b19b2a9",ColumnName="MovementType",
AD_Reference_ID=17,AD_Reference_Value_ID="0455b4db-004d-594c-a505-3e493bfda9ad",AD_Val_Rule_ID="",
FieldLength=2,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=true,SeqNo=2,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="652b3c5f-4ce9-4d0a-4cc9-356d2de4a69b",Synchronized="2017-08-05 16:55:36.0")
/** Column name MovementType */
public static final String COLUMNNAME_MovementType = "MovementType";
/** Set Product.
@param M_Product_ID Product, Service, Item */
public void setM_Product_ID (int M_Product_ID)
{
if (M_Product_ID < 1) throw new IllegalArgumentException ("M_Product_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_Product_ID, Integer.valueOf(M_Product_ID));
}
/** Get Product.
@return Product, Service, Item */
public int getM_Product_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Product_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="fe0a6784-fa99-e664-c8ca-6354a4413f2c")
public static String es_PE_FIELD_ProductTransactions_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="fe0a6784-fa99-e664-c8ca-6354a4413f2c")
public static String es_PE_FIELD_ProductTransactions_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraTrl(Identifier="fe0a6784-fa99-e664-c8ca-6354a4413f2c")
public static String es_PE_FIELD_ProductTransactions_Product_Name="Producto";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f13e72ac-9a92-1f12-5bdf-0bfd25daef93",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=60,SortNo=2,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fe0a6784-fa99-e664-c8ca-6354a4413f2c")
public static final String FIELDNAME_ProductTransactions_Product="fe0a6784-fa99-e664-c8ca-6354a4413f2c";

@XendraTrl(Identifier="eb3739d8-cead-46fd-99f9-6197e95c1ed6")
public static String es_PE_FIELD_Transactions_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="eb3739d8-cead-46fd-99f9-6197e95c1ed6")
public static String es_PE_FIELD_Transactions_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraTrl(Identifier="eb3739d8-cead-46fd-99f9-6197e95c1ed6")
public static String es_PE_FIELD_Transactions_Product_Name="Producto";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a63d8837-34e1-b9a5-9362-585f408186be",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-06-28 18:17:02.0",
Identifier="eb3739d8-cead-46fd-99f9-6197e95c1ed6")
public static final String FIELDNAME_Transactions_Product="eb3739d8-cead-46fd-99f9-6197e95c1ed6";

@XendraTrl(Identifier="8ca23ed8-7e6b-9d75-db85-be95006034b9")
public static String es_PE_FIELD_MaterialTransactions_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="8ca23ed8-7e6b-9d75-db85-be95006034b9")
public static String es_PE_FIELD_MaterialTransactions_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraTrl(Identifier="8ca23ed8-7e6b-9d75-db85-be95006034b9")
public static String es_PE_FIELD_MaterialTransactions_Product_Name="Producto";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="26bc3fe1-0b93-fca9-4754-7847ab21a970",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=40,SortNo=2,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8ca23ed8-7e6b-9d75-db85-be95006034b9")
public static final String FIELDNAME_MaterialTransactions_Product="8ca23ed8-7e6b-9d75-db85-be95006034b9";

@XendraTrl(Identifier="6d434a0d-2e84-4cfb-bbbe-49296f535da0")
public static String es_PE_FIELD_Transaction_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="6d434a0d-2e84-4cfb-bbbe-49296f535da0")
public static String es_PE_FIELD_Transaction_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraTrl(Identifier="6d434a0d-2e84-4cfb-bbbe-49296f535da0")
public static String es_PE_FIELD_Transaction_Product_Name="Producto";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="cb3ed3af-248b-41b3-8216-07164d850cf0",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-18 12:34:37.0",
Identifier="6d434a0d-2e84-4cfb-bbbe-49296f535da0")
public static final String FIELDNAME_Transaction_Product="6d434a0d-2e84-4cfb-bbbe-49296f535da0";

@XendraTrl(Identifier="e510941f-8891-6a01-1862-e5677ac2158c")
public static String es_PE_COLUMN_M_Product_ID_Name="Producto";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="4281f8eb-238e-6b28-eb66-8cc866e6312c",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=true,SeqNo=3,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="e510941f-8891-6a01-1862-e5677ac2158c",Synchronized="2017-08-05 16:55:36.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
/** Set Production Line.
@param M_ProductionLine_ID Document Line representing a production */
public void setM_ProductionLine_ID (int M_ProductionLine_ID)
{
if (M_ProductionLine_ID <= 0) set_ValueNoCheck (COLUMNNAME_M_ProductionLine_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_M_ProductionLine_ID, Integer.valueOf(M_ProductionLine_ID));
}
/** Get Production Line.
@return Document Line representing a production */
public int getM_ProductionLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_ProductionLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="85f80e5f-d26e-50e5-d441-7baab926a2fb")
public static String es_PE_FIELD_ProductTransactions_ProductionLine_Description="Item del documento representando una producción.";

@XendraTrl(Identifier="85f80e5f-d26e-50e5-d441-7baab926a2fb")
public static String es_PE_FIELD_ProductTransactions_ProductionLine_Help="Indica el Item del documento de producción (si es aplicable) para esta transacción.";

@XendraTrl(Identifier="85f80e5f-d26e-50e5-d441-7baab926a2fb")
public static String es_PE_FIELD_ProductTransactions_ProductionLine_Name="Item de Producción";

@XendraField(AD_Column_ID="M_ProductionLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f13e72ac-9a92-1f12-5bdf-0bfd25daef93",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="85f80e5f-d26e-50e5-d441-7baab926a2fb")
public static final String FIELDNAME_ProductTransactions_ProductionLine="85f80e5f-d26e-50e5-d441-7baab926a2fb";

@XendraTrl(Identifier="6efe7a44-ad78-4fe9-9a4e-62f833c3cb8a")
public static String es_PE_FIELD_Transactions_ProductionLine_Description="Línea del documento representando una producción.";

@XendraTrl(Identifier="6efe7a44-ad78-4fe9-9a4e-62f833c3cb8a")
public static String es_PE_FIELD_Transactions_ProductionLine_Help="La línea de producción indica la línea del documento de producción (si es aplicable) para esta transacción.";

@XendraTrl(Identifier="6efe7a44-ad78-4fe9-9a4e-62f833c3cb8a")
public static String es_PE_FIELD_Transactions_ProductionLine_Name="Línea de Producción";

@XendraField(AD_Column_ID="M_ProductionLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a63d8837-34e1-b9a5-9362-585f408186be",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-06-28 18:17:02.0",
Identifier="6efe7a44-ad78-4fe9-9a4e-62f833c3cb8a")
public static final String FIELDNAME_Transactions_ProductionLine="6efe7a44-ad78-4fe9-9a4e-62f833c3cb8a";

@XendraTrl(Identifier="faa3ed97-d928-e7af-b5b2-6bb69b1fc6be")
public static String es_PE_FIELD_MaterialTransactions_ProductionLine_Description="Item del documento representando una producción.";

@XendraTrl(Identifier="faa3ed97-d928-e7af-b5b2-6bb69b1fc6be")
public static String es_PE_FIELD_MaterialTransactions_ProductionLine_Help="Indica el Item del documento de producción (si es aplicable) para esta transacción.";

@XendraTrl(Identifier="faa3ed97-d928-e7af-b5b2-6bb69b1fc6be")
public static String es_PE_FIELD_MaterialTransactions_ProductionLine_Name="Item de Producción";

@XendraField(AD_Column_ID="M_ProductionLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="26bc3fe1-0b93-fca9-4754-7847ab21a970",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="faa3ed97-d928-e7af-b5b2-6bb69b1fc6be")
public static final String FIELDNAME_MaterialTransactions_ProductionLine="faa3ed97-d928-e7af-b5b2-6bb69b1fc6be";

@XendraTrl(Identifier="226077fe-533c-4c06-ab41-7208f1697ef5")
public static String es_PE_FIELD_Transaction_ProductionLine_Description="Línea del documento representando una producción.";

@XendraTrl(Identifier="226077fe-533c-4c06-ab41-7208f1697ef5")
public static String es_PE_FIELD_Transaction_ProductionLine_Help="La línea de producción indica la línea del documento de producción (si es aplicable) para esta transacción.";

@XendraTrl(Identifier="226077fe-533c-4c06-ab41-7208f1697ef5")
public static String es_PE_FIELD_Transaction_ProductionLine_Name="Línea de Producción";

@XendraField(AD_Column_ID="M_ProductionLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="cb3ed3af-248b-41b3-8216-07164d850cf0",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-18 12:34:37.0",
Identifier="226077fe-533c-4c06-ab41-7208f1697ef5")
public static final String FIELDNAME_Transaction_ProductionLine="226077fe-533c-4c06-ab41-7208f1697ef5";

@XendraTrl(Identifier="69f07458-d426-f49e-4b8f-2d0f8823586b")
public static String es_PE_COLUMN_M_ProductionLine_ID_Name="Línea de Producción";

@XendraColumn(AD_Element_ID="cd41491f-514d-42fd-aaf9-36308e165c0b",
ColumnName="M_ProductionLine_ID",AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="69f07458-d426-f49e-4b8f-2d0f8823586b",Synchronized="2017-08-05 16:55:36.0")
/** Column name M_ProductionLine_ID */
public static final String COLUMNNAME_M_ProductionLine_ID = "M_ProductionLine_ID";
/** Set Production Plan.
@param M_ProductionPlan_ID Plan for how a product is produced */
public void setM_ProductionPlan_ID (int M_ProductionPlan_ID)
{
if (M_ProductionPlan_ID <= 0) set_Value (COLUMNNAME_M_ProductionPlan_ID, null);
 else 
set_Value (COLUMNNAME_M_ProductionPlan_ID, Integer.valueOf(M_ProductionPlan_ID));
}
/** Get Production Plan.
@return Plan for how a product is produced */
public int getM_ProductionPlan_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_ProductionPlan_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="e2b7f912-d562-4026-84a6-1729c072b8d2")
public static String es_PE_FIELD_Transactions_ProductionPlan_Description="Plan de cómo un producto es producido";

@XendraTrl(Identifier="e2b7f912-d562-4026-84a6-1729c072b8d2")
public static String es_PE_FIELD_Transactions_ProductionPlan_Help="El plan de producción identifica las partidas y pasos en la generación de un producto.";

@XendraTrl(Identifier="e2b7f912-d562-4026-84a6-1729c072b8d2")
public static String es_PE_FIELD_Transactions_ProductionPlan_Name="Plan de Producción";

@XendraField(AD_Column_ID="M_ProductionPlan_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a63d8837-34e1-b9a5-9362-585f408186be",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-06-28 18:17:02.0",
Identifier="e2b7f912-d562-4026-84a6-1729c072b8d2")
public static final String FIELDNAME_Transactions_ProductionPlan="e2b7f912-d562-4026-84a6-1729c072b8d2";

@XendraTrl(Identifier="ac27d5ca-3e21-46a2-873d-f83385824c98")
public static String es_PE_FIELD_Transaction_ProductionPlan_Description="Plan de cómo un producto es producido";

@XendraTrl(Identifier="ac27d5ca-3e21-46a2-873d-f83385824c98")
public static String es_PE_FIELD_Transaction_ProductionPlan_Help="El plan de producción identifica las partidas y pasos en la generación de un producto.";

@XendraTrl(Identifier="ac27d5ca-3e21-46a2-873d-f83385824c98")
public static String es_PE_FIELD_Transaction_ProductionPlan_Name="Plan de Producción";

@XendraField(AD_Column_ID="M_ProductionPlan_ID",IsCentrallyMaintained=true,
AD_Tab_ID="cb3ed3af-248b-41b3-8216-07164d850cf0",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-18 12:34:38.0",
Identifier="ac27d5ca-3e21-46a2-873d-f83385824c98")
public static final String FIELDNAME_Transaction_ProductionPlan="ac27d5ca-3e21-46a2-873d-f83385824c98";

@XendraTrl(Identifier="d2702fc3-2f5b-4bdb-83ed-f98e8812e4dc")
public static String es_PE_COLUMN_M_ProductionPlan_ID_Name="Production Plan";

@XendraColumn(AD_Element_ID="19bd576a-c4f4-8c57-56b5-4b85a67d32d6",
ColumnName="M_ProductionPlan_ID",AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="d2702fc3-2f5b-4bdb-83ed-f98e8812e4dc",Synchronized="2017-08-05 16:55:36.0")
/** Column name M_ProductionPlan_ID */
public static final String COLUMNNAME_M_ProductionPlan_ID = "M_ProductionPlan_ID";
/** Set Inventory Transaction.
@param M_Transaction_ID Inventory Transaction */
public void setM_Transaction_ID (int M_Transaction_ID)
{
if (M_Transaction_ID < 1) throw new IllegalArgumentException ("M_Transaction_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_Transaction_ID, Integer.valueOf(M_Transaction_ID));
}
/** Get Inventory Transaction.
@return Inventory Transaction */
public int getM_Transaction_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Transaction_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="67e2e133-8ce5-e4fc-497e-f5790c6574b0")
public static String es_PE_FIELD_ProductTransactions_InventoryTransaction_Name="Transacción de Inventario";

@XendraField(AD_Column_ID="M_Transaction_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f13e72ac-9a92-1f12-5bdf-0bfd25daef93",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="67e2e133-8ce5-e4fc-497e-f5790c6574b0")
public static final String FIELDNAME_ProductTransactions_InventoryTransaction="67e2e133-8ce5-e4fc-497e-f5790c6574b0";

@XendraTrl(Identifier="967190cf-653a-40df-98e5-503b0a917239")
public static String es_PE_FIELD_Transactions_InventoryTransaction_Name="Transacción de Inventario";

@XendraField(AD_Column_ID="M_Transaction_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a63d8837-34e1-b9a5-9362-585f408186be",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-06-28 18:17:02.0",
Identifier="967190cf-653a-40df-98e5-503b0a917239")
public static final String FIELDNAME_Transactions_InventoryTransaction="967190cf-653a-40df-98e5-503b0a917239";

@XendraTrl(Identifier="f139b1ef-12c2-77e1-bea4-ac2759bb8fbc")
public static String es_PE_FIELD_MaterialTransactions_InventoryTransaction_Name="Transacción de Inventario";

@XendraField(AD_Column_ID="M_Transaction_ID",IsCentrallyMaintained=true,
AD_Tab_ID="26bc3fe1-0b93-fca9-4754-7847ab21a970",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f139b1ef-12c2-77e1-bea4-ac2759bb8fbc")
public static final String FIELDNAME_MaterialTransactions_InventoryTransaction="f139b1ef-12c2-77e1-bea4-ac2759bb8fbc";

@XendraTrl(Identifier="257343fa-71d9-46c9-9cbd-d84332328fe7")
public static String es_PE_FIELD_Transaction_InventoryTransaction_Name="Transacción de Inventario";

@XendraField(AD_Column_ID="M_Transaction_ID",IsCentrallyMaintained=true,
AD_Tab_ID="cb3ed3af-248b-41b3-8216-07164d850cf0",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-18 12:34:38.0",
Identifier="257343fa-71d9-46c9-9cbd-d84332328fe7")
public static final String FIELDNAME_Transaction_InventoryTransaction="257343fa-71d9-46c9-9cbd-d84332328fe7";
/** Column name M_Transaction_ID */
public static final String COLUMNNAME_M_Transaction_ID = "M_Transaction_ID";
/** Set Warehouse.
@param M_Warehouse_ID Storage Warehouse and Service Point */
public void setM_Warehouse_ID (int M_Warehouse_ID)
{
if (M_Warehouse_ID <= 0) set_Value (COLUMNNAME_M_Warehouse_ID, null);
 else 
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

@XendraTrl(Identifier="2781ca7d-12fe-446a-a39f-b532cfb01313")
public static String es_PE_FIELD_Transaction_Warehouse_Description="Almacén";

@XendraTrl(Identifier="2781ca7d-12fe-446a-a39f-b532cfb01313")
public static String es_PE_FIELD_Transaction_Warehouse_Help="El Almacén indica un Almacén único donde los productos son almacenados";

@XendraTrl(Identifier="2781ca7d-12fe-446a-a39f-b532cfb01313")
public static String es_PE_FIELD_Transaction_Warehouse_Name="Almacén";

@XendraField(AD_Column_ID="M_Warehouse_ID",IsCentrallyMaintained=true,
AD_Tab_ID="cb3ed3af-248b-41b3-8216-07164d850cf0",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=20,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-18 17:21:50.0",
Identifier="2781ca7d-12fe-446a-a39f-b532cfb01313")
public static final String FIELDNAME_Transaction_Warehouse="2781ca7d-12fe-446a-a39f-b532cfb01313";

@XendraTrl(Identifier="aaa1094c-1640-434b-bac6-10901d399403")
public static String es_PE_COLUMN_M_Warehouse_ID_Name="Warehouse";

@XendraColumn(AD_Element_ID="402045cd-baa5-aeaf-b148-a921dffb7821",ColumnName="M_Warehouse_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="aaa1094c-1640-434b-bac6-10901d399403",
Synchronized="2017-08-05 16:55:36.0")
/** Column name M_Warehouse_ID */
public static final String COLUMNNAME_M_Warehouse_ID = "M_Warehouse_ID";
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

@XendraTrl(Identifier="f5cc6794-5d2f-4b5d-8730-2a4220e862f8")
public static String es_PE_FIELD_Transactions_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="f5cc6794-5d2f-4b5d-8730-2a4220e862f8")
public static String es_PE_FIELD_Transactions_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraTrl(Identifier="f5cc6794-5d2f-4b5d-8730-2a4220e862f8")
public static String es_PE_FIELD_Transactions_Processed_Name="Procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="a63d8837-34e1-b9a5-9362-585f408186be",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-06-28 18:17:02.0",
Identifier="f5cc6794-5d2f-4b5d-8730-2a4220e862f8")
public static final String FIELDNAME_Transactions_Processed="f5cc6794-5d2f-4b5d-8730-2a4220e862f8";

@XendraTrl(Identifier="e42188fb-cf14-4061-a344-9318f407242c")
public static String es_PE_FIELD_Transaction_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="e42188fb-cf14-4061-a344-9318f407242c")
public static String es_PE_FIELD_Transaction_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraTrl(Identifier="e42188fb-cf14-4061-a344-9318f407242c")
public static String es_PE_FIELD_Transaction_Processed_Name="Procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="cb3ed3af-248b-41b3-8216-07164d850cf0",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-18 12:34:38.0",
Identifier="e42188fb-cf14-4061-a344-9318f407242c")
public static final String FIELDNAME_Transaction_Processed="e42188fb-cf14-4061-a344-9318f407242c";

@XendraTrl(Identifier="dac485a8-1e33-48c3-9205-d3716728e3d2")
public static String es_PE_COLUMN_Processed_Name="Processed";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="'N'	",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="dac485a8-1e33-48c3-9205-d3716728e3d2",
Synchronized="2015-08-26 10:14:00.0")
/** Column name Processed */
public static final String COLUMNNAME_Processed = "Processed";
/** Set QtyInput.
@param QtyInput QtyInput */
public void setQtyInput (BigDecimal QtyInput)
{
set_Value (COLUMNNAME_QtyInput, QtyInput);
}
/** Get QtyInput.
@return QtyInput */
public BigDecimal getQtyInput() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_QtyInput);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="7b0c2086-8c64-4ad2-b413-c7e0d363a2be")
public static String es_PE_FIELD_Transaction_QtyInput_Name="qtyinput";

@XendraField(AD_Column_ID="QtyInput",IsCentrallyMaintained=true,
AD_Tab_ID="cb3ed3af-248b-41b3-8216-07164d850cf0",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-18 17:21:51.0",
Identifier="7b0c2086-8c64-4ad2-b413-c7e0d363a2be")
public static final String FIELDNAME_Transaction_QtyInput="7b0c2086-8c64-4ad2-b413-c7e0d363a2be";

@XendraTrl(Identifier="1917612f-01c2-4204-bda2-5be866785f28")
public static String es_PE_COLUMN_QtyInput_Name="qtyinput";

@XendraColumn(AD_Element_ID="befcd710-705f-469e-8b85-687c9486b239",ColumnName="QtyInput",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1917612f-01c2-4204-bda2-5be866785f28",
Synchronized="2017-08-05 16:55:36.0")
/** Column name QtyInput */
public static final String COLUMNNAME_QtyInput = "QtyInput";
/** Set QtyOutput.
@param QtyOutput QtyOutput */
public void setQtyOutput (BigDecimal QtyOutput)
{
set_Value (COLUMNNAME_QtyOutput, QtyOutput);
}
/** Get QtyOutput.
@return QtyOutput */
public BigDecimal getQtyOutput() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_QtyOutput);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="6a55ab7c-24e6-47c6-a58e-7c1b1ff3e6c2")
public static String es_PE_FIELD_Transaction_QtyOutput_Name="qtyoutput";

@XendraField(AD_Column_ID="QtyOutput",IsCentrallyMaintained=true,
AD_Tab_ID="cb3ed3af-248b-41b3-8216-07164d850cf0",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-18 17:21:51.0",
Identifier="6a55ab7c-24e6-47c6-a58e-7c1b1ff3e6c2")
public static final String FIELDNAME_Transaction_QtyOutput="6a55ab7c-24e6-47c6-a58e-7c1b1ff3e6c2";

@XendraTrl(Identifier="33f778ed-a224-4525-93a8-be74abdf394f")
public static String es_PE_COLUMN_QtyOutput_Name="qtyoutput";

@XendraColumn(AD_Element_ID="8fffbae2-c184-40da-9299-5753af39ec24",ColumnName="QtyOutput",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="33f778ed-a224-4525-93a8-be74abdf394f",
Synchronized="2017-08-05 16:55:36.0")
/** Column name QtyOutput */
public static final String COLUMNNAME_QtyOutput = "QtyOutput";
/** Set Record ID.
@param Record_ID Direct internal record ID */
public void setRecord_ID (int Record_ID)
{
if (Record_ID <= 0) set_Value (COLUMNNAME_Record_ID, null);
 else 
set_Value (COLUMNNAME_Record_ID, Integer.valueOf(Record_ID));
}
/** Get Record ID.
@return Direct internal record ID */
public int getRecord_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Record_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="a21dc042-7f29-4c53-92d6-f2a0746b4ad1")
public static String es_PE_FIELD_Transactions_RecordID_Description="Identificador de registro interno";

@XendraTrl(Identifier="a21dc042-7f29-4c53-92d6-f2a0746b4ad1")
public static String es_PE_FIELD_Transactions_RecordID_Help="La ID de registro es el identificador único interno de un registro.";

@XendraTrl(Identifier="a21dc042-7f29-4c53-92d6-f2a0746b4ad1")
public static String es_PE_FIELD_Transactions_RecordID_Name="ID de Registro";

@XendraField(AD_Column_ID="Record_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a63d8837-34e1-b9a5-9362-585f408186be",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-06-28 18:17:02.0",
Identifier="a21dc042-7f29-4c53-92d6-f2a0746b4ad1")
public static final String FIELDNAME_Transactions_RecordID="a21dc042-7f29-4c53-92d6-f2a0746b4ad1";

@XendraTrl(Identifier="f8018cb8-d973-46f8-999c-5e0b679f7927")
public static String es_PE_FIELD_Transaction_RecordID_Description="Identificador de registro interno";

@XendraTrl(Identifier="f8018cb8-d973-46f8-999c-5e0b679f7927")
public static String es_PE_FIELD_Transaction_RecordID_Help="La ID de registro es el identificador único interno de un registro.";

@XendraTrl(Identifier="f8018cb8-d973-46f8-999c-5e0b679f7927")
public static String es_PE_FIELD_Transaction_RecordID_Name="ID de Registro";

@XendraField(AD_Column_ID="Record_ID",IsCentrallyMaintained=true,
AD_Tab_ID="cb3ed3af-248b-41b3-8216-07164d850cf0",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-18 12:34:38.0",
Identifier="f8018cb8-d973-46f8-999c-5e0b679f7927")
public static final String FIELDNAME_Transaction_RecordID="f8018cb8-d973-46f8-999c-5e0b679f7927";

@XendraTrl(Identifier="2561a449-a8a9-4a51-8c5e-adc3957878a3")
public static String es_PE_COLUMN_Record_ID_Name="Record ID";

@XendraColumn(AD_Element_ID="86e36e4b-d1dc-2deb-449d-c1f6769e1603",ColumnName="Record_ID",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2561a449-a8a9-4a51-8c5e-adc3957878a3",
Synchronized="2017-08-05 16:55:36.0")
/** Column name Record_ID */
public static final String COLUMNNAME_Record_ID = "Record_ID";
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

@XendraTrl(Identifier="80011bf7-859c-4214-b210-4b770e0196c5")
public static String es_PE_FIELD_Transaction_Sequence_Description="Método de ordenar registros; el número más bajo viene primero";

@XendraTrl(Identifier="80011bf7-859c-4214-b210-4b770e0196c5")
public static String es_PE_FIELD_Transaction_Sequence_Help="La Secuencia indica el orden de los registros";

@XendraTrl(Identifier="80011bf7-859c-4214-b210-4b770e0196c5")
public static String es_PE_FIELD_Transaction_Sequence_Name="Secuencia";

@XendraField(AD_Column_ID="SeqNo",IsCentrallyMaintained=true,
AD_Tab_ID="cb3ed3af-248b-41b3-8216-07164d850cf0",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-18 12:34:38.0",
Identifier="80011bf7-859c-4214-b210-4b770e0196c5")
public static final String FIELDNAME_Transaction_Sequence="80011bf7-859c-4214-b210-4b770e0196c5";

@XendraTrl(Identifier="a387cb74-c312-4b16-a95c-ddfe34138778")
public static String es_PE_COLUMN_SeqNo_Name="Sequence";

@XendraColumn(AD_Element_ID="38fa26fe-b59d-fce1-c129-420b57da738b",ColumnName="SeqNo",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a387cb74-c312-4b16-a95c-ddfe34138778",
Synchronized="2017-08-05 16:55:36.0")
/** Column name SeqNo */
public static final String COLUMNNAME_SeqNo = "SeqNo";

/** TransactionType AD_Reference=fe35729f-77d7-4356-a8e1-30e72e5d389a */
public static final int TRANSACTIONTYPE_AD_Reference_ID=1000065;
/** Set TransactionType.
@param TransactionType TransactionType */
public void setTransactionType (String TransactionType)
{
if (TransactionType == null || TransactionType.equals(REF_M_TransactionTransactionType.MovementAndCost) || TransactionType.equals(REF_M_TransactionTransactionType.OnlyMovement) || TransactionType.equals(REF_M_TransactionTransactionType.OnlyCost));
 else throw new IllegalArgumentException ("TransactionType Invalid value - " + TransactionType + " - Reference_ID=1000065 - B - M - C");
if (TransactionType != null && TransactionType.length() > 1)
{
log.warning("Length > 1 - truncated");
TransactionType = TransactionType.substring(0,0);
}
set_Value (COLUMNNAME_TransactionType, TransactionType);
}
/** Get TransactionType.
@return TransactionType */
public String getTransactionType() 
{
return (String)get_Value(COLUMNNAME_TransactionType);
}

@XendraTrl(Identifier="14af1efc-b801-4ca8-a7c6-7837f0759e20")
public static String es_PE_FIELD_Transactions_TransactionType_Name="transactiontype";

@XendraField(AD_Column_ID="TransactionType",IsCentrallyMaintained=true,
AD_Tab_ID="a63d8837-34e1-b9a5-9362-585f408186be",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-06-28 18:17:02.0",
Identifier="14af1efc-b801-4ca8-a7c6-7837f0759e20")
public static final String FIELDNAME_Transactions_TransactionType="14af1efc-b801-4ca8-a7c6-7837f0759e20";

@XendraTrl(Identifier="5ecfd36e-579f-4f4e-99d7-dd92697f973f")
public static String es_PE_FIELD_Transaction_TransactionType_Name="transactiontype";

@XendraField(AD_Column_ID="TransactionType",IsCentrallyMaintained=true,
AD_Tab_ID="cb3ed3af-248b-41b3-8216-07164d850cf0",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-10-18 12:34:38.0",
Identifier="5ecfd36e-579f-4f4e-99d7-dd92697f973f")
public static final String FIELDNAME_Transaction_TransactionType="5ecfd36e-579f-4f4e-99d7-dd92697f973f";

@XendraTrl(Identifier="e099abf2-cc89-4419-a469-6ece47a5138d")
public static String es_PE_COLUMN_TransactionType_Name="transactiontype";

@XendraColumn(AD_Element_ID="97706c37-8c3e-4d9a-a6f6-1e149dc77c97",ColumnName="TransactionType",
AD_Reference_ID=17,AD_Reference_Value_ID="fe35729f-77d7-4356-a8e1-30e72e5d389a",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="e099abf2-cc89-4419-a469-6ece47a5138d",Synchronized="2017-08-05 16:55:37.0")
/** Column name TransactionType */
public static final String COLUMNNAME_TransactionType = "TransactionType";
}
