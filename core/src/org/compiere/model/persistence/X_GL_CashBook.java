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
/** Generated Model for GL_CashBook
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_GL_CashBook extends PO
{
/** Standard Constructor
@param ctx context
@param GL_CashBook_ID id
@param trxName transaction
*/
public X_GL_CashBook (Properties ctx, int GL_CashBook_ID, String trxName)
{
super (ctx, GL_CashBook_ID, trxName);
/** if (GL_CashBook_ID == 0)
{
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_GL_CashBook (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000356 */
public static int Table_ID=MTable.getTable_ID("GL_CashBook");

@XendraTrl(Identifier="8bc6945f-d5ff-4d64-989c-cb36d0ee547a")
public static String es_PE_TABLE_GL_CashBook_Name="GL_CashBook";

@XendraTable(Name="GL_CashBook",AD_Package_ID="2ac04657-d663-47c2-4ec1-927ad71f1e96",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",TableName="GL_CashBook",
AccessLevel="3",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=0,LoadSeq=0,IsSecurityEnabled=false,
IsDeleteable=false,IsHighVolume=false,IsChangeLog=false,IsView=true,PO_Window_ID="",
ID="org.xendra.accounting",Identifier="8bc6945f-d5ff-4d64-989c-cb36d0ee547a",
Synchronized="2020-03-03 21:37:56.0")
/** TableName=GL_CashBook */
public static final String Table_Name="GL_CashBook";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"GL_CashBook");

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
    Table_ID = MTable.getTable_ID("GL_CashBook");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_GL_CashBook[").append(get_ID()).append("]");
return sb.toString();
}
@XendraTrl(Identifier="024c089a-e985-4b14-931c-6c1f0d56ae7f")
public static String es_PE_COLUMN_AmtAcctCr_Name="Accounted Credit";

@XendraColumn(AD_Element_ID="945e7d70-99b5-5eaf-31ef-c5f460f7626c",ColumnName="AmtAcctCr",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="024c089a-e985-4b14-931c-6c1f0d56ae7f",
Synchronized="2020-02-12 17:55:34.0")
/** Column name AmtAcctCr */
public static final String COLUMNNAME_AmtAcctCr = "AmtAcctCr";

@XendraTrl(Identifier="1b530239-fba8-4537-8ee4-2c2ea8f20b6a")
public static String es_PE_COLUMN_AmtAcctDr_Name="Accounted Debit";

@XendraColumn(AD_Element_ID="67410612-76a4-c113-8594-305f58926372",ColumnName="AmtAcctDr",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1b530239-fba8-4537-8ee4-2c2ea8f20b6a",
Synchronized="2020-02-12 17:55:34.0")
/** Column name AmtAcctDr */
public static final String COLUMNNAME_AmtAcctDr = "AmtAcctDr";

@XendraTrl(Identifier="d21fa427-cfe1-4dfb-a2e1-6c823711f386")
public static String es_PE_COLUMN_bpartner_Name="bpartner";

@XendraColumn(AD_Element_ID="a260a02a-1429-4bae-bf46-36eb5f8fd95e",ColumnName="bpartner",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d21fa427-cfe1-4dfb-a2e1-6c823711f386",
Synchronized="2020-02-12 17:55:34.0")
/** Column name bpartner */
public static final String COLUMNNAME_bpartner = "bpartner";

@XendraTrl(Identifier="258104fd-ef24-45bc-a82d-e27272a034ee")
public static String es_PE_COLUMN_C_AcctSchema_ID_Name="Accounting Schema";

@XendraColumn(AD_Element_ID="561c9a32-9b35-9c1a-fabc-8abf7f2bb4ae",ColumnName="C_AcctSchema_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="258104fd-ef24-45bc-a82d-e27272a034ee",
Synchronized="2020-02-12 17:55:34.0")
/** Column name C_AcctSchema_ID */
public static final String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";

@XendraTrl(Identifier="5523cf87-4bef-4182-8f7c-f4092edf08f5")
public static String es_PE_COLUMN_C_Period_ID_Name="Period";

@XendraColumn(AD_Element_ID="8f295c04-0eb4-a8f3-829f-cc6a6bd1df1e",ColumnName="C_Period_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5523cf87-4bef-4182-8f7c-f4092edf08f5",
Synchronized="2020-02-12 17:55:34.0")
/** Column name C_Period_ID */
public static final String COLUMNNAME_C_Period_ID = "C_Period_ID";

@XendraTrl(Identifier="3b6a2ce0-829c-4c0e-a044-85edf5c73e3c")
public static String es_PE_COLUMN_DateAcct_Name="Account Date";

@XendraColumn(AD_Element_ID="034727d0-e80f-fadf-3d4f-2d8d37b75669",ColumnName="DateAcct",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3b6a2ce0-829c-4c0e-a044-85edf5c73e3c",
Synchronized="2020-02-12 17:55:34.0")
/** Column name DateAcct */
public static final String COLUMNNAME_DateAcct = "DateAcct";

@XendraTrl(Identifier="6942834b-3dd4-45f2-a141-3674b137ac26")
public static String es_PE_COLUMN_DateTrx_Name="Transaction Date";

@XendraColumn(AD_Element_ID="3700288f-61dd-2021-b833-cf804ceed1e9",ColumnName="DateTrx",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6942834b-3dd4-45f2-a141-3674b137ac26",
Synchronized="2020-02-12 17:55:34.0")
/** Column name DateTrx */
public static final String COLUMNNAME_DateTrx = "DateTrx";

@XendraTrl(Identifier="36189aa6-880e-41d8-924c-9311af93165d")
public static String es_PE_COLUMN_Description_Name="Description";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="36189aa6-880e-41d8-924c-9311af93165d",
Synchronized="2020-02-12 17:55:34.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";

@XendraTrl(Identifier="2441340d-e4d0-4943-8b00-443d1a95934b")
public static String es_PE_COLUMN_Fact_Acct_ID_Name="Accounting Fact";

@XendraColumn(AD_Element_ID="c1839793-0346-4c78-96ff-8f7942ce0082",ColumnName="Fact_Acct_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2441340d-e4d0-4943-8b00-443d1a95934b",
Synchronized="2020-02-12 17:55:34.0")
/** Column name Fact_Acct_ID */
public static final String COLUMNNAME_Fact_Acct_ID = "Fact_Acct_ID";

@XendraTrl(Identifier="67d46bb9-98ea-46a0-a200-faa01a98112d")
public static String es_PE_COLUMN_Fact_ID_Name="Accounting Fact ID (per document)";

@XendraColumn(AD_Element_ID="20f6c8ee-0151-735b-7a03-2006e09d8eb0",ColumnName="Fact_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="67d46bb9-98ea-46a0-a200-faa01a98112d",
Synchronized="2020-02-12 17:55:34.0")
/** Column name Fact_ID */
public static final String COLUMNNAME_Fact_ID = "Fact_ID";

@XendraTrl(Identifier="51f3b6d2-8de9-480c-b85f-20b07b4ed755")
public static String es_PE_COLUMN_InvoiceDocumentNo_Name="Invoice Document No";

@XendraColumn(AD_Element_ID="8fe4a47f-1637-81de-48d3-f43e7643d57d",ColumnName="InvoiceDocumentNo",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2147483647,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="51f3b6d2-8de9-480c-b85f-20b07b4ed755",
Synchronized="2020-02-12 17:55:35.0")
/** Column name InvoiceDocumentNo */
public static final String COLUMNNAME_InvoiceDocumentNo = "InvoiceDocumentNo";

@XendraTrl(Identifier="bb3d9ef6-ff52-4609-bdce-b15068c82b77")
public static String es_PE_COLUMN_IsCloseDocument_Name="Close Document";

@XendraColumn(AD_Element_ID="ba1e3b22-a9f1-84d5-6c2b-f96847f7f25c",ColumnName="IsCloseDocument",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bb3d9ef6-ff52-4609-bdce-b15068c82b77",
Synchronized="2020-02-12 17:55:35.0")
/** Column name IsCloseDocument */
public static final String COLUMNNAME_IsCloseDocument = "IsCloseDocument";

@XendraTrl(Identifier="4d4fd47b-fa75-4b0f-8d7e-dca8955c7a32")
public static String es_PE_COLUMN_IsOpenDocument_Name="IsOpenDocument";

@XendraColumn(AD_Element_ID="2888b8d7-7c19-4542-a943-a77ea885f1cf",ColumnName="IsOpenDocument",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4d4fd47b-fa75-4b0f-8d7e-dca8955c7a32",
Synchronized="2020-02-12 17:55:35.0")
/** Column name IsOpenDocument */
public static final String COLUMNNAME_IsOpenDocument = "IsOpenDocument";

@XendraTrl(Identifier="ca43d43e-79e0-47d1-9984-eb3cd5b91660")
public static String es_PE_COLUMN_nameacct_Name="nameacct";

@XendraColumn(AD_Element_ID="685af745-82ee-4361-b373-91e48892eecb",ColumnName="nameacct",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ca43d43e-79e0-47d1-9984-eb3cd5b91660",
Synchronized="2020-02-12 17:55:35.0")
/** Column name nameacct */
public static final String COLUMNNAME_nameacct = "nameacct";

@XendraTrl(Identifier="92587d8a-9479-49e8-944c-34258709e2c5")
public static String es_PE_COLUMN_nameperiod_Name="nameperiod";

@XendraColumn(AD_Element_ID="bc7da4da-fe50-4b66-869d-4067cfe735d2",ColumnName="nameperiod",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="92587d8a-9479-49e8-944c-34258709e2c5",
Synchronized="2020-02-12 17:55:35.0")
/** Column name nameperiod */
public static final String COLUMNNAME_nameperiod = "nameperiod";

@XendraTrl(Identifier="4053993b-48f8-4c7f-9c60-b84ae36d821a")
public static String es_PE_COLUMN_PeriodNo_Name="Period No";

@XendraColumn(AD_Element_ID="c3b1b3eb-a9b0-25c6-0c8b-86bb7d76de0e",ColumnName="PeriodNo",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4053993b-48f8-4c7f-9c60-b84ae36d821a",
Synchronized="2020-02-12 17:55:35.0")
/** Column name PeriodNo */
public static final String COLUMNNAME_PeriodNo = "PeriodNo";

@XendraTrl(Identifier="838fbafc-30e0-4a30-bdd0-f3b18806b6a9")
public static String es_PE_COLUMN_PostingType_Name="PostingType";

@XendraColumn(AD_Element_ID="465cd8dd-d2b8-aa76-fc18-7f8df439b182",ColumnName="PostingType",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="838fbafc-30e0-4a30-bdd0-f3b18806b6a9",
Synchronized="2020-02-12 17:55:35.0")
/** Column name PostingType */
public static final String COLUMNNAME_PostingType = "PostingType";

@XendraTrl(Identifier="dfd37f5e-a4f6-4a8d-875c-a4aed566cb1e")
public static String es_PE_COLUMN_Serial_Name="Document Serial";

@XendraColumn(AD_Element_ID="56277733-3963-25db-320e-99e754ca1e9c",ColumnName="Serial",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2147483647,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="dfd37f5e-a4f6-4a8d-875c-a4aed566cb1e",
Synchronized="2020-02-12 17:55:35.0")
/** Column name Serial */
public static final String COLUMNNAME_Serial = "Serial";

@XendraTrl(Identifier="f697d078-f1e2-491e-ab70-a4a7862edf52")
public static String es_PE_COLUMN_taxcurrency_Name="taxcurrency";

@XendraColumn(AD_Element_ID="e434fed6-0ff3-43c0-abec-4af69cb1895f",ColumnName="taxcurrency",
AD_Reference_ID=17,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=3,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f697d078-f1e2-491e-ab70-a4a7862edf52",
Synchronized="2020-02-12 17:55:35.0")
/** Column name taxcurrency */
public static final String COLUMNNAME_taxcurrency = "taxcurrency";

@XendraTrl(Identifier="714a11cb-646c-4d77-929e-9d48e36e2c19")
public static String es_PE_COLUMN_taxdocument_Name="taxdocument";

@XendraColumn(AD_Element_ID="9154fc0b-4085-4618-a811-f3aa3b0e9441",ColumnName="taxdocument",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2147483647,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="714a11cb-646c-4d77-929e-9d48e36e2c19",
Synchronized="2020-02-12 17:55:35.0")
/** Column name taxdocument */
public static final String COLUMNNAME_taxdocument = "taxdocument";

@XendraTrl(Identifier="e40be60b-cc52-4dbc-af3d-8a01d9708343")
public static String es_PE_COLUMN_valueacct_Name="valueacct";

@XendraColumn(AD_Element_ID="81c4da9e-290e-4bcc-9882-e6c6d1401f0e",ColumnName="valueacct",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e40be60b-cc52-4dbc-af3d-8a01d9708343",
Synchronized="2020-02-12 17:55:35.0")
/** Column name valueacct */
public static final String COLUMNNAME_valueacct = "valueacct";
}
