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
/** Generated Model for C_BOEStatement
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_BOEStatement extends PO
{
/** Standard Constructor
@param ctx context
@param C_BOEStatement_ID id
@param trxName transaction
*/
public X_C_BOEStatement (Properties ctx, int C_BOEStatement_ID, String trxName)
{
super (ctx, C_BOEStatement_ID, trxName);
/** if (C_BOEStatement_ID == 0)
{
setC_BOE_ID (0);
setC_BOEStatement_ID (0);
setPosted (false);	
// N
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_BOEStatement (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000116 */
public static int Table_ID=MTable.getTable_ID("C_BOEStatement");

@XendraTrl(Identifier="9640d656-5512-efa6-ce43-b528f30fe480")
public static String es_PE_TAB_BillOfExchangeStatement_Name="Estado Letra de Cambio";

@XendraTab(Name="Bill of Exchange Statement",Description="",Help="",
AD_Window_ID="ed5bcd83-9b1c-d7fa-65a9-38f76f7a8d35",SeqNo=20,TabLevel=1,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=true,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=false,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="9640d656-5512-efa6-ce43-b528f30fe480",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_BillOfExchangeStatement="9640d656-5512-efa6-ce43-b528f30fe480";

@XendraTrl(Identifier="c0fe56cd-abf5-c204-d81f-337c9299e272")
public static String es_PE_TAB_BillOfExchangeStatement2_Name="Estado Letra de Cambio";

@XendraTab(Name="Bill of Exchange Statement",Description="",Help="",
AD_Window_ID="8f6df5bf-4121-5ea0-797c-32487bcbbea9",SeqNo=20,TabLevel=1,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="c0fe56cd-abf5-c204-d81f-337c9299e272",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_BillOfExchangeStatement2="c0fe56cd-abf5-c204-d81f-337c9299e272";

@XendraTrl(Identifier="7b77d670-6a9a-08be-94c9-f3fdd4a538b6")
public static String es_PE_TABLE_C_BOEStatement_Name="Bill Of Exchange Statement";

@XendraTable(Name="Bill Of Exchange Statement",Description="Bill Of Exchange Statement",Help="",
TableName="C_BOEStatement",AccessLevel="3",AD_Window_ID="ed5bcd83-9b1c-d7fa-65a9-38f76f7a8d35",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=120,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="7b77d670-6a9a-08be-94c9-f3fdd4a538b6",Synchronized="2017-08-16 11:41:27.0")
/** TableName=C_BOEStatement */
public static final String Table_Name="C_BOEStatement";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_BOEStatement");

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
    Table_ID = MTable.getTable_ID("C_BOEStatement");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_BOEStatement[").append(get_ID()).append("]");
return sb.toString();
}
/** Set BOEAmt.
@param BOEAmt BOEAmt */
public void setBOEAmt (BigDecimal BOEAmt)
{
set_Value (COLUMNNAME_BOEAmt, BOEAmt);
}
/** Get BOEAmt.
@return BOEAmt */
public BigDecimal getBOEAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_BOEAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="448d15cf-cd54-f5d6-3c9f-94b0c071c4ce")
public static String es_PE_FIELD_BillOfExchangeStatement_BOEAmt_Name="Monto Letra";

@XendraField(AD_Column_ID="BOEAmt",IsCentrallyMaintained=true,
AD_Tab_ID="9640d656-5512-efa6-ce43-b528f30fe480",AD_FieldGroup_ID="Document",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="448d15cf-cd54-f5d6-3c9f-94b0c071c4ce")
public static final String FIELDNAME_BillOfExchangeStatement_BOEAmt="448d15cf-cd54-f5d6-3c9f-94b0c071c4ce";

@XendraTrl(Identifier="96fc07b8-de62-27e0-bb9b-260441561cae")
public static String es_PE_FIELD_BillOfExchangeStatement_BOEAmt2_Name="Monto Letra de Cambio";

@XendraField(AD_Column_ID="BOEAmt",IsCentrallyMaintained=true,
AD_Tab_ID="c0fe56cd-abf5-c204-d81f-337c9299e272",AD_FieldGroup_ID="Document",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="96fc07b8-de62-27e0-bb9b-260441561cae")
public static final String FIELDNAME_BillOfExchangeStatement_BOEAmt2="96fc07b8-de62-27e0-bb9b-260441561cae";

@XendraTrl(Identifier="03a21460-4715-33bc-615e-0f57d98688e1")
public static String es_PE_COLUMN_BOEAmt_Name="Monto Letra de Cambio";

@XendraColumn(AD_Element_ID="1fe9bbca-ceed-2a6e-9e4d-59ef82964606",ColumnName="BOEAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="03a21460-4715-33bc-615e-0f57d98688e1",
Synchronized="2017-08-05 16:53:19.0")
/** Column name BOEAmt */
public static final String COLUMNNAME_BOEAmt = "BOEAmt";
/** Set Bank Account.
@param C_BankAccount_ID Account at the Bank */
public void setC_BankAccount_ID (int C_BankAccount_ID)
{
if (C_BankAccount_ID <= 0) set_Value (COLUMNNAME_C_BankAccount_ID, null);
 else 
set_Value (COLUMNNAME_C_BankAccount_ID, Integer.valueOf(C_BankAccount_ID));
}
/** Get Bank Account.
@return Account at the Bank */
public int getC_BankAccount_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BankAccount_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="c28d0b4f-9353-2825-a3c1-7cc3a20def53")
public static String es_PE_FIELD_BillOfExchangeStatement_BankAccount_Description="Cuenta bancaria";

@XendraTrl(Identifier="c28d0b4f-9353-2825-a3c1-7cc3a20def53")
public static String es_PE_FIELD_BillOfExchangeStatement_BankAccount_Help="La cuenta bancaria identifica una cuenta en este banco";

@XendraTrl(Identifier="c28d0b4f-9353-2825-a3c1-7cc3a20def53")
public static String es_PE_FIELD_BillOfExchangeStatement_BankAccount_Name="Cuenta Bancaria";

@XendraField(AD_Column_ID="C_BankAccount_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9640d656-5512-efa6-ce43-b528f30fe480",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c28d0b4f-9353-2825-a3c1-7cc3a20def53")
public static final String FIELDNAME_BillOfExchangeStatement_BankAccount="c28d0b4f-9353-2825-a3c1-7cc3a20def53";

@XendraTrl(Identifier="d99bbf2c-1141-bb92-3dd4-68d6e4318633")
public static String es_PE_COLUMN_C_BankAccount_ID_Name="Bank Account";

@XendraColumn(AD_Element_ID="5a03bc67-316f-bd8c-9e68-b009ad1b290b",ColumnName="C_BankAccount_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d99bbf2c-1141-bb92-3dd4-68d6e4318633",
Synchronized="2017-08-05 16:53:19.0")
/** Column name C_BankAccount_ID */
public static final String COLUMNNAME_C_BankAccount_ID = "C_BankAccount_ID";
/** Set Bill Of Exchange.
@param C_BOE_ID Bill Of Exchange Identifier */
public void setC_BOE_ID (int C_BOE_ID)
{
if (C_BOE_ID < 1) throw new IllegalArgumentException ("C_BOE_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_BOE_ID, Integer.valueOf(C_BOE_ID));
}
/** Get Bill Of Exchange.
@return Bill Of Exchange Identifier */
public int getC_BOE_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BOE_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="06d46daa-7a6d-c246-58a6-95ba66d25335")
public static String es_PE_FIELD_BillOfExchangeStatement_BillOfExchange_Description="Identificador de la Letra de Cambio ";

@XendraTrl(Identifier="06d46daa-7a6d-c246-58a6-95ba66d25335")
public static String es_PE_FIELD_BillOfExchangeStatement_BillOfExchange_Help="El docuemnto Letra de Cambio";

@XendraTrl(Identifier="06d46daa-7a6d-c246-58a6-95ba66d25335")
public static String es_PE_FIELD_BillOfExchangeStatement_BillOfExchange_Name="Letra de Cambio";

@XendraField(AD_Column_ID="C_BOE_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9640d656-5512-efa6-ce43-b528f30fe480",AD_FieldGroup_ID="Document",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="06d46daa-7a6d-c246-58a6-95ba66d25335")
public static final String FIELDNAME_BillOfExchangeStatement_BillOfExchange="06d46daa-7a6d-c246-58a6-95ba66d25335";

@XendraTrl(Identifier="41a1c62a-a948-8420-a45f-07e60c0ac33a")
public static String es_PE_FIELD_BillOfExchangeStatement_BillOfExchange2_Description="Identificador de la Letra de Cambio ";

@XendraTrl(Identifier="41a1c62a-a948-8420-a45f-07e60c0ac33a")
public static String es_PE_FIELD_BillOfExchangeStatement_BillOfExchange2_Help="El docuemnto Letra de Cambio";

@XendraTrl(Identifier="41a1c62a-a948-8420-a45f-07e60c0ac33a")
public static String es_PE_FIELD_BillOfExchangeStatement_BillOfExchange2_Name="Letra de Cambio";

@XendraField(AD_Column_ID="C_BOE_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c0fe56cd-abf5-c204-d81f-337c9299e272",AD_FieldGroup_ID="Document",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="41a1c62a-a948-8420-a45f-07e60c0ac33a")
public static final String FIELDNAME_BillOfExchangeStatement_BillOfExchange2="41a1c62a-a948-8420-a45f-07e60c0ac33a";

@XendraTrl(Identifier="33b1dc09-9f3a-29c3-b4b4-6958b2caf172")
public static String es_PE_COLUMN_C_BOE_ID_Name="Letra de Cambio";

@XendraColumn(AD_Element_ID="7dfa9e28-2055-cea9-fa94-b5ebdac44420",ColumnName="C_BOE_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="33b1dc09-9f3a-29c3-b4b4-6958b2caf172",
Synchronized="2017-08-05 16:53:19.0")
/** Column name C_BOE_ID */
public static final String COLUMNNAME_C_BOE_ID = "C_BOE_ID";
/** Set C_BOEStatement.
@param C_BOEStatement_ID C_BOEStatement */
public void setC_BOEStatement_ID (int C_BOEStatement_ID)
{
if (C_BOEStatement_ID < 1) throw new IllegalArgumentException ("C_BOEStatement_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_BOEStatement_ID, Integer.valueOf(C_BOEStatement_ID));
}
/** Get C_BOEStatement.
@return C_BOEStatement */
public int getC_BOEStatement_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BOEStatement_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="c21079e7-d12c-d06e-38c6-4d3dc45b1bdb")
public static String es_PE_FIELD_BillOfExchangeStatement_C_BOEStatement_Name="C_BOEStatement";

@XendraField(AD_Column_ID="C_BOEStatement_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9640d656-5512-efa6-ce43-b528f30fe480",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c21079e7-d12c-d06e-38c6-4d3dc45b1bdb")
public static final String FIELDNAME_BillOfExchangeStatement_C_BOEStatement="c21079e7-d12c-d06e-38c6-4d3dc45b1bdb";

@XendraTrl(Identifier="1bebffc4-780c-5a7c-a3b9-7d311cde5328")
public static String es_PE_FIELD_BillOfExchangeStatement_C_BOEStatement2_Name="C_BOEStatement";

@XendraField(AD_Column_ID="C_BOEStatement_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c0fe56cd-abf5-c204-d81f-337c9299e272",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1bebffc4-780c-5a7c-a3b9-7d311cde5328")
public static final String FIELDNAME_BillOfExchangeStatement_C_BOEStatement2="1bebffc4-780c-5a7c-a3b9-7d311cde5328";
/** Column name C_BOEStatement_ID */
public static final String COLUMNNAME_C_BOEStatement_ID = "C_BOEStatement_ID";
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

@XendraTrl(Identifier="471ad810-6069-0d18-b8cc-58e5f46b4057")
public static String es_PE_FIELD_BillOfExchangeStatement_Currency_Description="Moneda para este registro";

@XendraTrl(Identifier="471ad810-6069-0d18-b8cc-58e5f46b4057")
public static String es_PE_FIELD_BillOfExchangeStatement_Currency_Help="Indica la moneda a ser usada cuando se procese ó Informe este registro";

@XendraTrl(Identifier="471ad810-6069-0d18-b8cc-58e5f46b4057")
public static String es_PE_FIELD_BillOfExchangeStatement_Currency_Name="Moneda";

@XendraField(AD_Column_ID="C_Currency_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9640d656-5512-efa6-ce43-b528f30fe480",AD_FieldGroup_ID="Document",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="471ad810-6069-0d18-b8cc-58e5f46b4057")
public static final String FIELDNAME_BillOfExchangeStatement_Currency="471ad810-6069-0d18-b8cc-58e5f46b4057";

@XendraTrl(Identifier="22a055ea-33f8-606e-b652-3b3e1e0e2b1d")
public static String es_PE_FIELD_BillOfExchangeStatement_Currency2_Description="Moneda para este registro";

@XendraTrl(Identifier="22a055ea-33f8-606e-b652-3b3e1e0e2b1d")
public static String es_PE_FIELD_BillOfExchangeStatement_Currency2_Help="Indica la moneda a ser usada cuando se procese ó Informe este registro";

@XendraTrl(Identifier="22a055ea-33f8-606e-b652-3b3e1e0e2b1d")
public static String es_PE_FIELD_BillOfExchangeStatement_Currency2_Name="Moneda";

@XendraField(AD_Column_ID="C_Currency_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c0fe56cd-abf5-c204-d81f-337c9299e272",AD_FieldGroup_ID="Document",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="22a055ea-33f8-606e-b652-3b3e1e0e2b1d")
public static final String FIELDNAME_BillOfExchangeStatement_Currency2="22a055ea-33f8-606e-b652-3b3e1e0e2b1d";

@XendraTrl(Identifier="76b01c2a-a8b5-3a54-47bf-5259209191fa")
public static String es_PE_COLUMN_C_Currency_ID_Name="Moneda";

@XendraColumn(AD_Element_ID="8daec488-bca2-50fe-f9de-abf0cba2a34a",ColumnName="C_Currency_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="76b01c2a-a8b5-3a54-47bf-5259209191fa",
Synchronized="2017-08-05 16:53:19.0")
/** Column name C_Currency_ID */
public static final String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
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

@XendraTrl(Identifier="ba3d4117-c81a-1132-f6b7-4d38075afd54")
public static String es_PE_FIELD_BillOfExchangeStatement_DocumentType_Description="Tipo de documento ó reglas";

@XendraTrl(Identifier="ba3d4117-c81a-1132-f6b7-4d38075afd54")
public static String es_PE_FIELD_BillOfExchangeStatement_DocumentType_Help="El tipo de documento determina la secuencia del documento y las reglas de proceso";

@XendraTrl(Identifier="ba3d4117-c81a-1132-f6b7-4d38075afd54")
public static String es_PE_FIELD_BillOfExchangeStatement_DocumentType_Name="Tipo de Documento";

@XendraField(AD_Column_ID="C_DocType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9640d656-5512-efa6-ce43-b528f30fe480",AD_FieldGroup_ID="Document",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ba3d4117-c81a-1132-f6b7-4d38075afd54")
public static final String FIELDNAME_BillOfExchangeStatement_DocumentType="ba3d4117-c81a-1132-f6b7-4d38075afd54";

@XendraTrl(Identifier="5b3028ee-d896-9620-a026-2c73903984d4")
public static String es_PE_FIELD_BillOfExchangeStatement_DocumentType2_Description="Tipo de documento ó reglas";

@XendraTrl(Identifier="5b3028ee-d896-9620-a026-2c73903984d4")
public static String es_PE_FIELD_BillOfExchangeStatement_DocumentType2_Help="El tipo de documento determina la secuencia del documento y las reglas de proceso";

@XendraTrl(Identifier="5b3028ee-d896-9620-a026-2c73903984d4")
public static String es_PE_FIELD_BillOfExchangeStatement_DocumentType2_Name="Tipo de Documento";

@XendraField(AD_Column_ID="C_DocType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c0fe56cd-abf5-c204-d81f-337c9299e272",AD_FieldGroup_ID="Document",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5b3028ee-d896-9620-a026-2c73903984d4")
public static final String FIELDNAME_BillOfExchangeStatement_DocumentType2="5b3028ee-d896-9620-a026-2c73903984d4";

@XendraTrl(Identifier="c17c841f-e0c1-a59d-d3fb-40a379f4014b")
public static String es_PE_COLUMN_C_DocType_ID_Name="Tipo de Documento";

@XendraColumn(AD_Element_ID="099a4147-1a72-cdd0-81e0-8bdbc8c0b883",ColumnName="C_DocType_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c17c841f-e0c1-a59d-d3fb-40a379f4014b",
Synchronized="2017-08-05 16:53:19.0")
/** Column name C_DocType_ID */
public static final String COLUMNNAME_C_DocType_ID = "C_DocType_ID";
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

@XendraTrl(Identifier="eb3a6628-b9c2-076f-86df-99cccd91f5ef")
public static String es_PE_FIELD_BillOfExchangeStatement_AccountDate_Description="Fecha contable";

@XendraTrl(Identifier="eb3a6628-b9c2-076f-86df-99cccd91f5ef")
public static String es_PE_FIELD_BillOfExchangeStatement_AccountDate_Help="La fecha contable indica la fecha a ser usada en las cuentas de contabilidad general generadas desde este documento";

@XendraTrl(Identifier="eb3a6628-b9c2-076f-86df-99cccd91f5ef")
public static String es_PE_FIELD_BillOfExchangeStatement_AccountDate_Name="Fecha de Aplicación CG";

@XendraField(AD_Column_ID="DateAcct",IsCentrallyMaintained=true,
AD_Tab_ID="9640d656-5512-efa6-ce43-b528f30fe480",AD_FieldGroup_ID="Status",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="eb3a6628-b9c2-076f-86df-99cccd91f5ef")
public static final String FIELDNAME_BillOfExchangeStatement_AccountDate="eb3a6628-b9c2-076f-86df-99cccd91f5ef";

@XendraTrl(Identifier="c6360738-209c-be8e-fd64-53e094d6b14c")
public static String es_PE_FIELD_BillOfExchangeStatement_AccountDate2_Description="Fecha contable";

@XendraTrl(Identifier="c6360738-209c-be8e-fd64-53e094d6b14c")
public static String es_PE_FIELD_BillOfExchangeStatement_AccountDate2_Help="La fecha contable indica la fecha a ser usada en las cuentas de contabilidad general generadas desde este documento";

@XendraTrl(Identifier="c6360738-209c-be8e-fd64-53e094d6b14c")
public static String es_PE_FIELD_BillOfExchangeStatement_AccountDate2_Name="Fecha de Aplicación CG";

@XendraField(AD_Column_ID="DateAcct",IsCentrallyMaintained=true,
AD_Tab_ID="c0fe56cd-abf5-c204-d81f-337c9299e272",AD_FieldGroup_ID="Status",IsDisplayed=true,
DisplayLogic="",DisplayLength=29,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c6360738-209c-be8e-fd64-53e094d6b14c")
public static final String FIELDNAME_BillOfExchangeStatement_AccountDate2="c6360738-209c-be8e-fd64-53e094d6b14c";

@XendraTrl(Identifier="c533d288-5882-ac7e-1103-c47c7cba018a")
public static String es_PE_COLUMN_DateAcct_Name="Fecha de Aplicación CG";

@XendraColumn(AD_Element_ID="034727d0-e80f-fadf-3d4f-2d8d37b75669",ColumnName="DateAcct",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c533d288-5882-ac7e-1103-c47c7cba018a",
Synchronized="2017-08-05 16:53:19.0")
/** Column name DateAcct */
public static final String COLUMNNAME_DateAcct = "DateAcct";
/** Set Document Status.
@param DocStatus The current status of the document */
public void setDocStatus (String DocStatus)
{
if (DocStatus != null && DocStatus.length() > 5)
{
log.warning("Length > 5 - truncated");
DocStatus = DocStatus.substring(0,4);
}
set_Value (COLUMNNAME_DocStatus, DocStatus);
}
/** Get Document Status.
@return The current status of the document */
public String getDocStatus() 
{
String value = (String)get_Value(COLUMNNAME_DocStatus);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="8eecb46f-742c-7294-cc8a-ac24b5ba5398")
public static String es_PE_FIELD_BillOfExchangeStatement_DocumentStatus_Description="El estado actual del documento";

@XendraTrl(Identifier="8eecb46f-742c-7294-cc8a-ac24b5ba5398")
public static String es_PE_FIELD_BillOfExchangeStatement_DocumentStatus_Help="El estado del documento indica el estado del documento en este momento. Si usted quiere cambiar el estado de Documento; use el campo acción de documento";

@XendraTrl(Identifier="8eecb46f-742c-7294-cc8a-ac24b5ba5398")
public static String es_PE_FIELD_BillOfExchangeStatement_DocumentStatus_Name="Estado del Documento";

@XendraField(AD_Column_ID="DocStatus",IsCentrallyMaintained=true,
AD_Tab_ID="9640d656-5512-efa6-ce43-b528f30fe480",AD_FieldGroup_ID="Document",IsDisplayed=true,
DisplayLogic="",DisplayLength=5,IsReadOnly=true,SeqNo=90,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8eecb46f-742c-7294-cc8a-ac24b5ba5398")
public static final String FIELDNAME_BillOfExchangeStatement_DocumentStatus="8eecb46f-742c-7294-cc8a-ac24b5ba5398";

@XendraTrl(Identifier="463f4363-ce10-ada6-e0f8-ee84e1466af7")
public static String es_PE_FIELD_BillOfExchangeStatement_DocumentStatus2_Description="El estado actual del documento";

@XendraTrl(Identifier="463f4363-ce10-ada6-e0f8-ee84e1466af7")
public static String es_PE_FIELD_BillOfExchangeStatement_DocumentStatus2_Help="El estado del documento indica el estado del documento en este momento. Si usted quiere cambiar el estado de Documento; use el campo acción de documento";

@XendraTrl(Identifier="463f4363-ce10-ada6-e0f8-ee84e1466af7")
public static String es_PE_FIELD_BillOfExchangeStatement_DocumentStatus2_Name="Estado del Documento";

@XendraField(AD_Column_ID="DocStatus",IsCentrallyMaintained=true,
AD_Tab_ID="c0fe56cd-abf5-c204-d81f-337c9299e272",AD_FieldGroup_ID="Document",IsDisplayed=true,
DisplayLogic="",DisplayLength=5,IsReadOnly=true,SeqNo=90,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="463f4363-ce10-ada6-e0f8-ee84e1466af7")
public static final String FIELDNAME_BillOfExchangeStatement_DocumentStatus2="463f4363-ce10-ada6-e0f8-ee84e1466af7";

@XendraTrl(Identifier="9f234992-0ad1-71e1-ee14-328ddb0fe67c")
public static String es_PE_COLUMN_DocStatus_Name="Estado del Documento";

@XendraColumn(AD_Element_ID="e73fa537-3438-bd01-dfd4-f0f080a28c55",ColumnName="DocStatus",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=5,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9f234992-0ad1-71e1-ee14-328ddb0fe67c",
Synchronized="2017-08-05 16:53:19.0")
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
@XendraTrl(Identifier="ff1ed430-a662-4b25-370b-308d0432cf30")
public static String es_PE_FIELD_BillOfExchangeStatement_DocumentNo_Description="Número de secuencia del documento para cada documento";

@XendraTrl(Identifier="ff1ed430-a662-4b25-370b-308d0432cf30")
public static String es_PE_FIELD_BillOfExchangeStatement_DocumentNo_Help="El número del documento es usualmente generado en automático por el sistema y determinado por el tipo del documento. Si el documento no se salva; el número preliminar se despliega entre \"<>\"";

@XendraTrl(Identifier="ff1ed430-a662-4b25-370b-308d0432cf30")
public static String es_PE_FIELD_BillOfExchangeStatement_DocumentNo_Name="No. del Documento";

@XendraField(AD_Column_ID="DocumentNo",IsCentrallyMaintained=true,
AD_Tab_ID="9640d656-5512-efa6-ce43-b528f30fe480",AD_FieldGroup_ID="Document",IsDisplayed=true,
DisplayLogic="",DisplayLength=30,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ff1ed430-a662-4b25-370b-308d0432cf30")
public static final String FIELDNAME_BillOfExchangeStatement_DocumentNo="ff1ed430-a662-4b25-370b-308d0432cf30";

@XendraTrl(Identifier="7d995cde-7d23-b90d-3a18-ef80e6cdf390")
public static String es_PE_FIELD_BillOfExchangeStatement_DocumentNo2_Description="Número de secuencia del documento para cada documento";

@XendraTrl(Identifier="7d995cde-7d23-b90d-3a18-ef80e6cdf390")
public static String es_PE_FIELD_BillOfExchangeStatement_DocumentNo2_Help="El número del documento es usualmente generado en automático por el sistema y determinado por el tipo del documento. Si el documento no se salva; el número preliminar se despliega entre \"<>\"";

@XendraTrl(Identifier="7d995cde-7d23-b90d-3a18-ef80e6cdf390")
public static String es_PE_FIELD_BillOfExchangeStatement_DocumentNo2_Name="No. del Documento";

@XendraField(AD_Column_ID="DocumentNo",IsCentrallyMaintained=true,
AD_Tab_ID="c0fe56cd-abf5-c204-d81f-337c9299e272",AD_FieldGroup_ID="Document",IsDisplayed=true,
DisplayLogic="",DisplayLength=30,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7d995cde-7d23-b90d-3a18-ef80e6cdf390")
public static final String FIELDNAME_BillOfExchangeStatement_DocumentNo2="7d995cde-7d23-b90d-3a18-ef80e6cdf390";

@XendraTrl(Identifier="9942db5b-c16e-03f1-8ca5-3c19935e2be2")
public static String es_PE_COLUMN_DocumentNo_Name="No. del Documento";

@XendraColumn(AD_Element_ID="e3ca6e28-702a-2722-d941-b2072a0de9cb",ColumnName="DocumentNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9942db5b-c16e-03f1-8ca5-3c19935e2be2",
Synchronized="2017-08-05 16:53:19.0")
/** Column name DocumentNo */
public static final String COLUMNNAME_DocumentNo = "DocumentNo";
/** Set Accounting Fact ID (per document).
@param Fact_ID This ID is guaranteed to be unique per client per year per document (in the fact table). */
public void setFact_ID (String Fact_ID)
{
if (Fact_ID != null && Fact_ID.length() > 20)
{
log.warning("Length > 20 - truncated");
Fact_ID = Fact_ID.substring(0,19);
}
set_Value (COLUMNNAME_Fact_ID, Fact_ID);
}
/** Get Accounting Fact ID (per document).
@return This ID is guaranteed to be unique per client per year per document (in the fact table). */
public String getFact_ID() 
{
String value = (String)get_Value(COLUMNNAME_Fact_ID);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="f8350b37-144f-55a1-b3a0-49baa64966ec")
public static String es_PE_FIELD_BillOfExchangeStatement_AccountingFactIDPerDocument_Description="Se garantiza que este ID sea unico por cada cliente/ano/documento (en la tabla de asientos).";

@XendraTrl(Identifier="f8350b37-144f-55a1-b3a0-49baa64966ec")
public static String es_PE_FIELD_BillOfExchangeStatement_AccountingFactIDPerDocument_Name="ID Asiento Contable (por documento)";

@XendraField(AD_Column_ID="Fact_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9640d656-5512-efa6-ce43-b528f30fe480",AD_FieldGroup_ID="Status",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f8350b37-144f-55a1-b3a0-49baa64966ec")
public static final String FIELDNAME_BillOfExchangeStatement_AccountingFactIDPerDocument="f8350b37-144f-55a1-b3a0-49baa64966ec";

@XendraTrl(Identifier="36ebd67c-3786-41e5-30a3-2c93b55145e7")
public static String es_PE_FIELD_BillOfExchangeStatement_AccountingFactIDPerDocument2_Description="Se garantiza que este ID sea unico por cada cliente/ano/documento (en la tabla de asientos).";

@XendraTrl(Identifier="36ebd67c-3786-41e5-30a3-2c93b55145e7")
public static String es_PE_FIELD_BillOfExchangeStatement_AccountingFactIDPerDocument2_Name="ID Asiento Contable";

@XendraField(AD_Column_ID="Fact_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c0fe56cd-abf5-c204-d81f-337c9299e272",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="36ebd67c-3786-41e5-30a3-2c93b55145e7")
public static final String FIELDNAME_BillOfExchangeStatement_AccountingFactIDPerDocument2="36ebd67c-3786-41e5-30a3-2c93b55145e7";

@XendraTrl(Identifier="96755568-3191-b843-86e4-3402dbd08d2e")
public static String es_PE_COLUMN_Fact_ID_Name="ID Asiento Contable (por documento)";

@XendraColumn(AD_Element_ID="20f6c8ee-0151-735b-7a03-2006e09d8eb0",ColumnName="Fact_ID",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="96755568-3191-b843-86e4-3402dbd08d2e",
Synchronized="2017-08-05 16:53:19.0")
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
@XendraTrl(Identifier="a696341b-5e22-4913-9d01-0cb6f01bb89c")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a696341b-5e22-4913-9d01-0cb6f01bb89c",
Synchronized="2017-08-05 16:53:19.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
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

@XendraTrl(Identifier="734d063e-1ed5-8c78-670b-1fbb11fd45e9")
public static String es_PE_FIELD_BillOfExchangeStatement_SalesTransaction_Description="Esta es una transacción de ventas";

@XendraTrl(Identifier="734d063e-1ed5-8c78-670b-1fbb11fd45e9")
public static String es_PE_FIELD_BillOfExchangeStatement_SalesTransaction_Help="El cuadro de verificación Transacción de Ventas indica si este ítem es una transacción de ventas";

@XendraTrl(Identifier="734d063e-1ed5-8c78-670b-1fbb11fd45e9")
public static String es_PE_FIELD_BillOfExchangeStatement_SalesTransaction_Name="Transacción de Ventas";

@XendraField(AD_Column_ID="IsSOTrx",IsCentrallyMaintained=true,
AD_Tab_ID="9640d656-5512-efa6-ce43-b528f30fe480",AD_FieldGroup_ID="Document",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="734d063e-1ed5-8c78-670b-1fbb11fd45e9")
public static final String FIELDNAME_BillOfExchangeStatement_SalesTransaction="734d063e-1ed5-8c78-670b-1fbb11fd45e9";

@XendraTrl(Identifier="88e0ceaa-5d2a-7d93-4686-eef38e0dd1d1")
public static String es_PE_FIELD_BillOfExchangeStatement_SalesTransaction2_Description="Esta es una transacción de ventas";

@XendraTrl(Identifier="88e0ceaa-5d2a-7d93-4686-eef38e0dd1d1")
public static String es_PE_FIELD_BillOfExchangeStatement_SalesTransaction2_Help="El cuadro de verificación Transacción de Ventas indica si este ítem es una transacción de ventas";

@XendraTrl(Identifier="88e0ceaa-5d2a-7d93-4686-eef38e0dd1d1")
public static String es_PE_FIELD_BillOfExchangeStatement_SalesTransaction2_Name="Transacción de Ventas";

@XendraField(AD_Column_ID="IsSOTrx",IsCentrallyMaintained=true,
AD_Tab_ID="c0fe56cd-abf5-c204-d81f-337c9299e272",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="88e0ceaa-5d2a-7d93-4686-eef38e0dd1d1")
public static final String FIELDNAME_BillOfExchangeStatement_SalesTransaction2="88e0ceaa-5d2a-7d93-4686-eef38e0dd1d1";

@XendraTrl(Identifier="634ec0e1-2dca-3d13-e408-7d448d166fb0")
public static String es_PE_COLUMN_IsSOTrx_Name="Transacción de Ventas";

@XendraColumn(AD_Element_ID="4084b69f-a51d-5676-4d8c-395a13e6b2df",ColumnName="IsSOTrx",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="634ec0e1-2dca-3d13-e408-7d448d166fb0",
Synchronized="2017-08-05 16:53:19.0")
/** Column name IsSOTrx */
public static final String COLUMNNAME_IsSOTrx = "IsSOTrx";
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

@XendraTrl(Identifier="1734de49-def6-70c8-723c-1a204a49a6a3")
public static String es_PE_FIELD_BillOfExchangeStatement_Posted_Description="Las transacciones de contabilidad general han sido procesadas.";

@XendraTrl(Identifier="1734de49-def6-70c8-723c-1a204a49a6a3")
public static String es_PE_FIELD_BillOfExchangeStatement_Posted_Help="El campo fijado indica el estado de la generación de las Líneas contables a la contabilidad general.";

@XendraTrl(Identifier="1734de49-def6-70c8-723c-1a204a49a6a3")
public static String es_PE_FIELD_BillOfExchangeStatement_Posted_Name="Fijada";

@XendraField(AD_Column_ID="Posted",IsCentrallyMaintained=true,
AD_Tab_ID="9640d656-5512-efa6-ce43-b528f30fe480",AD_FieldGroup_ID="Status",IsDisplayed=true,
DisplayLogic="@#ShowAcct@=Y",DisplayLength=1,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1734de49-def6-70c8-723c-1a204a49a6a3")
public static final String FIELDNAME_BillOfExchangeStatement_Posted="1734de49-def6-70c8-723c-1a204a49a6a3";

@XendraTrl(Identifier="43dcfbfe-911d-5279-0abd-db96795dafe1")
public static String es_PE_FIELD_BillOfExchangeStatement_Posted2_Description="Las transacciones de contabilidad general han sido procesadas.";

@XendraTrl(Identifier="43dcfbfe-911d-5279-0abd-db96795dafe1")
public static String es_PE_FIELD_BillOfExchangeStatement_Posted2_Help="El campo fijado indica el estado de la generación de las Líneas contables a la contabilidad general.";

@XendraTrl(Identifier="43dcfbfe-911d-5279-0abd-db96795dafe1")
public static String es_PE_FIELD_BillOfExchangeStatement_Posted2_Name="Fijada";

@XendraField(AD_Column_ID="Posted",IsCentrallyMaintained=true,
AD_Tab_ID="c0fe56cd-abf5-c204-d81f-337c9299e272",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@#ShowAcct@=Y",DisplayLength=1,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="43dcfbfe-911d-5279-0abd-db96795dafe1")
public static final String FIELDNAME_BillOfExchangeStatement_Posted2="43dcfbfe-911d-5279-0abd-db96795dafe1";

@XendraTrl(Identifier="a8e8a657-224c-109a-428f-78d5d9d4b35c")
public static String es_PE_COLUMN_Posted_Name="Fijada";

@XendraColumn(AD_Element_ID="5eb52ebc-6992-12f5-b85a-e0a136df259b",ColumnName="Posted",
AD_Reference_ID=28,AD_Reference_Value_ID="d2b659dd-6c8c-baf3-fc71-0ee997273154",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="N",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="a8e8a657-224c-109a-428f-78d5d9d4b35c",Synchronized="2017-08-05 16:53:19.0")
/** Column name Posted */
public static final String COLUMNNAME_Posted = "Posted";

/** PreStatus AD_Reference=7627125d-fefe-e6bc-bb7d-4a6c772172dc */
public static final int PRESTATUS_AD_Reference_ID=131;
/** Set PreStatus.
@param PreStatus PreStatus */
public void setPreStatus (String PreStatus)
{
if (PreStatus == null || PreStatus.equals(REF__DocumentStatus.InProgress) || PreStatus.equals(REF__DocumentStatus.WaitingConfirmation) || PreStatus.equals(REF__DocumentStatus.Drafted) || PreStatus.equals(REF__DocumentStatus.Completed) || PreStatus.equals(REF__DocumentStatus.Approved) || PreStatus.equals(REF__DocumentStatus.WaitingPayment) || PreStatus.equals(REF__DocumentStatus.Placed) || PreStatus.equals(REF__DocumentStatus.Returned) || PreStatus.equals(REF__DocumentStatus.Discount) || PreStatus.equals(REF__DocumentStatus.Protested) || PreStatus.equals(REF__DocumentStatus.NotApproved) || PreStatus.equals(REF__DocumentStatus.Voided) || PreStatus.equals(REF__DocumentStatus.Invalid) || PreStatus.equals(REF__DocumentStatus.Reversed) || PreStatus.equals(REF__DocumentStatus.Closed) || PreStatus.equals(REF__DocumentStatus.Unknown) || PreStatus.equals(REF__DocumentStatus.Portfolio) || PreStatus.equals(REF__DocumentStatus.Warranty) || PreStatus.equals(REF__DocumentStatus.ToCollect) || PreStatus.equals(REF__DocumentStatus.Collect) || PreStatus.equals(REF__DocumentStatus.Receivables) || PreStatus.equals(REF__DocumentStatus.Apply));
 else throw new IllegalArgumentException ("PreStatus Invalid value - " + PreStatus + " - Reference_ID=131 - IP - WC - DR - CO - AP - WP - PL - RT - DS - PD - NA - VO - IN - RE - CL - ?? - PT - WR - TC - CT - RV - AY");
if (PreStatus != null && PreStatus.length() > 5)
{
log.warning("Length > 5 - truncated");
PreStatus = PreStatus.substring(0,4);
}
set_Value (COLUMNNAME_PreStatus, PreStatus);
}
/** Get PreStatus.
@return PreStatus */
public String getPreStatus() 
{
return (String)get_Value(COLUMNNAME_PreStatus);
}

@XendraTrl(Identifier="54a35af2-add6-abe2-209a-2c72f94747c2")
public static String es_PE_FIELD_BillOfExchangeStatement_PreStatus_Name="Estado Previo";

@XendraField(AD_Column_ID="PreStatus",IsCentrallyMaintained=true,
AD_Tab_ID="9640d656-5512-efa6-ce43-b528f30fe480",AD_FieldGroup_ID="Status",IsDisplayed=true,
DisplayLogic="",DisplayLength=5,IsReadOnly=true,SeqNo=170,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="54a35af2-add6-abe2-209a-2c72f94747c2")
public static final String FIELDNAME_BillOfExchangeStatement_PreStatus="54a35af2-add6-abe2-209a-2c72f94747c2";

@XendraTrl(Identifier="caff2d0d-dea7-92f7-db3c-ef844c5e83ae")
public static String es_PE_FIELD_BillOfExchangeStatement_PreStatus2_Name="Estado Previo";

@XendraField(AD_Column_ID="PreStatus",IsCentrallyMaintained=true,
AD_Tab_ID="c0fe56cd-abf5-c204-d81f-337c9299e272",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=5,IsReadOnly=true,SeqNo=170,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="caff2d0d-dea7-92f7-db3c-ef844c5e83ae")
public static final String FIELDNAME_BillOfExchangeStatement_PreStatus2="caff2d0d-dea7-92f7-db3c-ef844c5e83ae";

@XendraTrl(Identifier="a0a7a516-f033-dab9-6c35-404678a4421f")
public static String es_PE_COLUMN_PreStatus_Name="prestatus";

@XendraColumn(AD_Element_ID="9890ece6-d64b-b9f3-36ea-2bf63b050660",ColumnName="PreStatus",
AD_Reference_ID=17,AD_Reference_Value_ID="7627125d-fefe-e6bc-bb7d-4a6c772172dc",AD_Val_Rule_ID="",
FieldLength=5,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="a0a7a516-f033-dab9-6c35-404678a4421f",Synchronized="2017-08-05 16:53:19.0")
/** Column name PreStatus */
public static final String COLUMNNAME_PreStatus = "PreStatus";
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

@XendraTrl(Identifier="6da562fe-e376-8af4-6965-b6d8b9dbb00f")
public static String es_PE_FIELD_BillOfExchangeStatement_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="6da562fe-e376-8af4-6965-b6d8b9dbb00f")
public static String es_PE_FIELD_BillOfExchangeStatement_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraTrl(Identifier="6da562fe-e376-8af4-6965-b6d8b9dbb00f")
public static String es_PE_FIELD_BillOfExchangeStatement_Processed_Name="Procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="9640d656-5512-efa6-ce43-b528f30fe480",AD_FieldGroup_ID="Status",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=150,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6da562fe-e376-8af4-6965-b6d8b9dbb00f")
public static final String FIELDNAME_BillOfExchangeStatement_Processed="6da562fe-e376-8af4-6965-b6d8b9dbb00f";

@XendraTrl(Identifier="0e45b6cb-cdfb-b475-b733-0540c8f0ad37")
public static String es_PE_FIELD_BillOfExchangeStatement_Processed2_Description="El documento ha sido procesado";

@XendraTrl(Identifier="0e45b6cb-cdfb-b475-b733-0540c8f0ad37")
public static String es_PE_FIELD_BillOfExchangeStatement_Processed2_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraTrl(Identifier="0e45b6cb-cdfb-b475-b733-0540c8f0ad37")
public static String es_PE_FIELD_BillOfExchangeStatement_Processed2_Name="Procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="c0fe56cd-abf5-c204-d81f-337c9299e272",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0e45b6cb-cdfb-b475-b733-0540c8f0ad37")
public static final String FIELDNAME_BillOfExchangeStatement_Processed2="0e45b6cb-cdfb-b475-b733-0540c8f0ad37";

@XendraTrl(Identifier="4f1c3d7f-0be1-3eff-8dd6-ec75b5e4d020")
public static String es_PE_COLUMN_Processed_Name="Procesado";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4f1c3d7f-0be1-3eff-8dd6-ec75b5e4d020",
Synchronized="2017-08-05 16:53:19.0")
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

@XendraTrl(Identifier="ed2b8a09-3509-9c59-302d-fe7e7e563194")
public static String es_PE_FIELD_BillOfExchangeStatement_ProcessNow_Name="Procesar Ahora";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="9640d656-5512-efa6-ce43-b528f30fe480",AD_FieldGroup_ID="Status",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ed2b8a09-3509-9c59-302d-fe7e7e563194")
public static final String FIELDNAME_BillOfExchangeStatement_ProcessNow="ed2b8a09-3509-9c59-302d-fe7e7e563194";

@XendraTrl(Identifier="8917aafd-195d-beb2-8ea4-f6b72cdc3a4f")
public static String es_PE_FIELD_BillOfExchangeStatement_ProcessNow2_Name="Procesar Ahora";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="c0fe56cd-abf5-c204-d81f-337c9299e272",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8917aafd-195d-beb2-8ea4-f6b72cdc3a4f")
public static final String FIELDNAME_BillOfExchangeStatement_ProcessNow2="8917aafd-195d-beb2-8ea4-f6b72cdc3a4f";

@XendraTrl(Identifier="a58888b1-cb0b-a01d-54b6-9c3704cfb910")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="ad80301d-2044-4b67-bdd4-2e3da5ae14dc",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="a58888b1-cb0b-a01d-54b6-9c3704cfb910",Synchronized="2017-08-05 16:53:19.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";

/** Status AD_Reference=7627125d-fefe-e6bc-bb7d-4a6c772172dc */
public static final int STATUS_AD_Reference_ID=131;
/** Set Status.
@param Status Status of the currently running check */
public void setStatus (String Status)
{
if (Status == null || Status.equals(REF__DocumentStatus.InProgress) || Status.equals(REF__DocumentStatus.WaitingConfirmation) || Status.equals(REF__DocumentStatus.Drafted) || Status.equals(REF__DocumentStatus.Completed) || Status.equals(REF__DocumentStatus.Approved) || Status.equals(REF__DocumentStatus.WaitingPayment) || Status.equals(REF__DocumentStatus.Placed) || Status.equals(REF__DocumentStatus.Returned) || Status.equals(REF__DocumentStatus.Discount) || Status.equals(REF__DocumentStatus.Protested) || Status.equals(REF__DocumentStatus.NotApproved) || Status.equals(REF__DocumentStatus.Voided) || Status.equals(REF__DocumentStatus.Invalid) || Status.equals(REF__DocumentStatus.Reversed) || Status.equals(REF__DocumentStatus.Closed) || Status.equals(REF__DocumentStatus.Unknown) || Status.equals(REF__DocumentStatus.Portfolio) || Status.equals(REF__DocumentStatus.Warranty) || Status.equals(REF__DocumentStatus.ToCollect) || Status.equals(REF__DocumentStatus.Collect) || Status.equals(REF__DocumentStatus.Receivables) || Status.equals(REF__DocumentStatus.Apply));
 else throw new IllegalArgumentException ("Status Invalid value - " + Status + " - Reference_ID=131 - IP - WC - DR - CO - AP - WP - PL - RT - DS - PD - NA - VO - IN - RE - CL - ?? - PT - WR - TC - CT - RV - AY");
if (Status != null && Status.length() > 5)
{
log.warning("Length > 5 - truncated");
Status = Status.substring(0,4);
}
set_Value (COLUMNNAME_Status, Status);
}
/** Get Status.
@return Status of the currently running check */
public String getStatus() 
{
return (String)get_Value(COLUMNNAME_Status);
}

@XendraTrl(Identifier="0dd58f82-b427-f3a6-abdc-29318e588ef9")
public static String es_PE_FIELD_BillOfExchangeStatement_Status_Description="Status of the currently running check";

@XendraTrl(Identifier="0dd58f82-b427-f3a6-abdc-29318e588ef9")
public static String es_PE_FIELD_BillOfExchangeStatement_Status_Help="Status of the currently running check";

@XendraTrl(Identifier="0dd58f82-b427-f3a6-abdc-29318e588ef9")
public static String es_PE_FIELD_BillOfExchangeStatement_Status_Name="Estado Actual";

@XendraField(AD_Column_ID="Status",IsCentrallyMaintained=true,
AD_Tab_ID="9640d656-5512-efa6-ce43-b528f30fe480",AD_FieldGroup_ID="Status",IsDisplayed=true,
DisplayLogic="",DisplayLength=5,IsReadOnly=true,SeqNo=160,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0dd58f82-b427-f3a6-abdc-29318e588ef9")
public static final String FIELDNAME_BillOfExchangeStatement_Status="0dd58f82-b427-f3a6-abdc-29318e588ef9";

@XendraTrl(Identifier="4eb4f3bd-e912-0a30-830e-7c4265ef606a")
public static String es_PE_FIELD_BillOfExchangeStatement_Status2_Description="Status of the currently running check";

@XendraTrl(Identifier="4eb4f3bd-e912-0a30-830e-7c4265ef606a")
public static String es_PE_FIELD_BillOfExchangeStatement_Status2_Help="Status of the currently running check";

@XendraTrl(Identifier="4eb4f3bd-e912-0a30-830e-7c4265ef606a")
public static String es_PE_FIELD_BillOfExchangeStatement_Status2_Name="Estado Actual";

@XendraField(AD_Column_ID="Status",IsCentrallyMaintained=true,
AD_Tab_ID="c0fe56cd-abf5-c204-d81f-337c9299e272",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=5,IsReadOnly=true,SeqNo=160,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4eb4f3bd-e912-0a30-830e-7c4265ef606a")
public static final String FIELDNAME_BillOfExchangeStatement_Status2="4eb4f3bd-e912-0a30-830e-7c4265ef606a";

@XendraTrl(Identifier="7c73f6d5-4289-06a4-612b-4460cdf6f496")
public static String es_PE_COLUMN_Status_Name="Status";

@XendraColumn(AD_Element_ID="0b9968a2-c050-f756-f519-4b5d48d463a0",ColumnName="Status",
AD_Reference_ID=17,AD_Reference_Value_ID="7627125d-fefe-e6bc-bb7d-4a6c772172dc",AD_Val_Rule_ID="",
FieldLength=5,DefaultValue="DR",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="7c73f6d5-4289-06a4-612b-4460cdf6f496",Synchronized="2017-08-05 16:53:19.0")
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

@XendraTrl(Identifier="b15c7538-13bb-085a-88f9-198329161516")
public static String es_PE_FIELD_BillOfExchangeStatement_StatusDate_Name="Fecha de Estado";

@XendraField(AD_Column_ID="StatusDate",IsCentrallyMaintained=true,
AD_Tab_ID="9640d656-5512-efa6-ce43-b528f30fe480",AD_FieldGroup_ID="Status",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b15c7538-13bb-085a-88f9-198329161516")
public static final String FIELDNAME_BillOfExchangeStatement_StatusDate="b15c7538-13bb-085a-88f9-198329161516";

@XendraTrl(Identifier="9bbffea1-da9b-142b-3585-7e82332b3655")
public static String es_PE_FIELD_BillOfExchangeStatement_StatusDate2_Name="Fecha de Estado";

@XendraField(AD_Column_ID="StatusDate",IsCentrallyMaintained=true,
AD_Tab_ID="c0fe56cd-abf5-c204-d81f-337c9299e272",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=29,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9bbffea1-da9b-142b-3585-7e82332b3655")
public static final String FIELDNAME_BillOfExchangeStatement_StatusDate2="9bbffea1-da9b-142b-3585-7e82332b3655";

@XendraTrl(Identifier="15a792bc-f22c-695d-42fe-07269e404d3b")
public static String es_PE_COLUMN_StatusDate_Name="STATUSDATE";

@XendraColumn(AD_Element_ID="f4c6dc34-fa65-aa81-84cf-3e2d06a1583f",ColumnName="StatusDate",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="15a792bc-f22c-695d-42fe-07269e404d3b",
Synchronized="2017-08-05 16:53:19.0")
/** Column name StatusDate */
public static final String COLUMNNAME_StatusDate = "StatusDate";
}
