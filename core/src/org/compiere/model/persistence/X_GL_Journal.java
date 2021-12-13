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
/** Generated Model for GL_Journal
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_GL_Journal extends PO
{
/** Standard Constructor
@param ctx context
@param GL_Journal_ID id
@param trxName transaction
*/
public X_GL_Journal (Properties ctx, int GL_Journal_ID, String trxName)
{
super (ctx, GL_Journal_ID, trxName);
/** if (GL_Journal_ID == 0)
{
setC_AcctSchema_ID (0);	
// @$C_AcctSchema_ID@
setC_ConversionType_ID (0);
setC_Currency_ID (0);	
// @C_Currency_ID@
setC_DocType_ID (0);	
// @C_DocType_ID@
setC_Period_ID (0);	
// @C_Period_ID@
setCurrencyRate (Env.ZERO);	
// 1
setDateAcct (new Timestamp(System.currentTimeMillis()));	
// @DateAcct@
setDateDoc (new Timestamp(System.currentTimeMillis()));	
// @DateDoc@
setDescription (null);
setDocAction (null);	
// CO
setDocStatus (null);	
// DR
setDocumentNo (null);
setGL_Category_ID (0);	
// @GL_Category_ID@
setGL_Journal_ID (0);
setIsApproved (true);	
// Y
setIsPrinted (false);	
// N
setPosted (false);	
// N
setPostingType (null);	
// @PostingType@
setTotalCr (Env.ZERO);	
// 0
setTotalDr (Env.ZERO);	
// 0
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_GL_Journal (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=224 */
public static int Table_ID=MTable.getTable_ID("GL_Journal");

@XendraTrl(Identifier="6ea6a282-e86b-3f24-4644-8a69df5e4ea1")
public static String es_PE_TAB_Journal_Description="Diario del libro mayor";

@XendraTrl(Identifier="6ea6a282-e86b-3f24-4644-8a69df5e4ea1")
public static String es_PE_TAB_Journal_Help="La pestaña de entrada de diario del GL define los parámetros de control para una entrada de diario.";

@XendraTrl(Identifier="6ea6a282-e86b-3f24-4644-8a69df5e4ea1")
public static String es_PE_TAB_Journal_Name="Diario";
@XendraTab(Name="Journal",
Description="General Ledger Journal",
Help="The GL Journal Tab defines the control parameters for a single GL Journal. If the Control Amount is not zero, it is compared to the Total Debit Amount. The Control/Debit/Credit Amount is in Source Document Currency.",
AD_Window_ID="d65b9eb7-94f9-c08c-7f56-cfe897065bea",SeqNo=20,TabLevel=1,IsSingleRow=true,
IsInfoTab=true,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="6ea6a282-e86b-3f24-4644-8a69df5e4ea1",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Journal="6ea6a282-e86b-3f24-4644-8a69df5e4ea1";

@XendraTrl(Identifier="da0e7e4b-652c-7e6e-91b6-4ff277f89b9a")
public static String es_PE_TABLE_GL_Journal_Name="Póliza";

@XendraTable(Name="Journal",AD_Package_ID="2ac04657-d663-47c2-4ec1-927ad71f1e96",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="General Ledger Journal",Help="",
TableName="GL_Journal",AccessLevel="1",AD_Window_ID="d65b9eb7-94f9-c08c-7f56-cfe897065bea",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=135,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=false,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.accounting",
Identifier="da0e7e4b-652c-7e6e-91b6-4ff277f89b9a",Synchronized="2020-03-03 21:37:58.0")
/** TableName=GL_Journal */
public static final String Table_Name="GL_Journal";


@XendraIndex(Name="gl_journal_docno",Identifier="319ab007-7516-4702-f8e9-47b3edee3ec6",
Column_Names="ad_org_id, c_period_id, documentno",IsUnique="true",
TableIdentifier="319ab007-7516-4702-f8e9-47b3edee3ec6",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_gl_journal_docno = "319ab007-7516-4702-f8e9-47b3edee3ec6";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"GL_Journal");

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
    Table_ID = MTable.getTable_ID("GL_Journal");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_GL_Journal[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Accounting Schema.
@param C_AcctSchema_ID Rules for accounting */
public void setC_AcctSchema_ID (int C_AcctSchema_ID)
{
if (C_AcctSchema_ID < 1) throw new IllegalArgumentException ("C_AcctSchema_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_AcctSchema_ID, Integer.valueOf(C_AcctSchema_ID));
}
/** Get Accounting Schema.
@return Rules for accounting */
public int getC_AcctSchema_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_AcctSchema_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="74e23d59-7e5c-3157-3fad-348df79f27f1")
public static String es_PE_FIELD_Journal_AccountingSchema_Name="Esquema Contable";

@XendraTrl(Identifier="74e23d59-7e5c-3157-3fad-348df79f27f1")
public static String es_PE_FIELD_Journal_AccountingSchema_Description="Reglas para contabilizar";

@XendraTrl(Identifier="74e23d59-7e5c-3157-3fad-348df79f27f1")
public static String es_PE_FIELD_Journal_AccountingSchema_Help="Un esquema contable define las reglas contables usadas tales como método de costeo; moneda y calendario";

@XendraField(AD_Column_ID="C_AcctSchema_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6ea6a282-e86b-3f24-4644-8a69df5e4ea1",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="74e23d59-7e5c-3157-3fad-348df79f27f1")
public static final String FIELDNAME_Journal_AccountingSchema="74e23d59-7e5c-3157-3fad-348df79f27f1";

@XendraTrl(Identifier="e39bdf09-bc8c-08be-6a3f-c288776f1f09")
public static String es_PE_COLUMN_C_AcctSchema_ID_Name="Esquema Contable";

@XendraColumn(AD_Element_ID="561c9a32-9b35-9c1a-fabc-8abf7f2bb4ae",ColumnName="C_AcctSchema_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="@$C_AcctSchema_ID@",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="e39bdf09-bc8c-08be-6a3f-c288776f1f09",Synchronized="2019-08-30 22:22:34.0")
/** Column name C_AcctSchema_ID */
public static final String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";
/** Set Currency Type.
@param C_ConversionType_ID Currency Conversion Rate Type */
public void setC_ConversionType_ID (int C_ConversionType_ID)
{
if (C_ConversionType_ID < 1) throw new IllegalArgumentException ("C_ConversionType_ID is mandatory.");
set_Value (COLUMNNAME_C_ConversionType_ID, Integer.valueOf(C_ConversionType_ID));
}
/** Get Currency Type.
@return Currency Conversion Rate Type */
public int getC_ConversionType_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_ConversionType_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="9060dc58-9512-80d8-2657-57a60a2b2171")
public static String es_PE_FIELD_Journal_CurrencyType_Name="Tipo de Moneda";

@XendraTrl(Identifier="9060dc58-9512-80d8-2657-57a60a2b2171")
public static String es_PE_FIELD_Journal_CurrencyType_Description="Tipo de índice de conversión de moneda ";

@XendraTrl(Identifier="9060dc58-9512-80d8-2657-57a60a2b2171")
public static String es_PE_FIELD_Journal_CurrencyType_Help="El tipo del índice de conversión de monedas le deja definir diversos tipos de tarifas, tarifas ej. del punto, corporativas y/o de Ventas/Compras.";

@XendraField(AD_Column_ID="C_ConversionType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6ea6a282-e86b-3f24-4644-8a69df5e4ea1",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@$C_Currency_ID@!@C_Currency_ID@",DisplayLength=14,IsReadOnly=false,SeqNo=160,
SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="9060dc58-9512-80d8-2657-57a60a2b2171")
public static final String FIELDNAME_Journal_CurrencyType="9060dc58-9512-80d8-2657-57a60a2b2171";

@XendraTrl(Identifier="27cbd3fe-746a-2962-b430-01aff06b38e2")
public static String es_PE_COLUMN_C_ConversionType_ID_Name="Tipo de Moneda";

@XendraColumn(AD_Element_ID="66f5d039-c94d-0957-487b-eb3118bd7719",
ColumnName="C_ConversionType_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="org.compiere.model.CalloutGLJournal.rate",VFormat="",ValueMin="",ValueMax="",Version="1",
IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="27cbd3fe-746a-2962-b430-01aff06b38e2",
Synchronized="2019-08-30 22:22:34.0")
/** Column name C_ConversionType_ID */
public static final String COLUMNNAME_C_ConversionType_ID = "C_ConversionType_ID";
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

@XendraTrl(Identifier="cb2a0706-b40c-e7db-d407-4fd2734df9d5")
public static String es_PE_FIELD_Journal_Currency_Name="Moneda";

@XendraTrl(Identifier="cb2a0706-b40c-e7db-d407-4fd2734df9d5")
public static String es_PE_FIELD_Journal_Currency_Description="Moneda para este registro";

@XendraTrl(Identifier="cb2a0706-b40c-e7db-d407-4fd2734df9d5")
public static String es_PE_FIELD_Journal_Currency_Help="Indica la moneda a ser usada cuando se procese ó Informe este registro";

@XendraField(AD_Column_ID="C_Currency_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6ea6a282-e86b-3f24-4644-8a69df5e4ea1",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cb2a0706-b40c-e7db-d407-4fd2734df9d5")
public static final String FIELDNAME_Journal_Currency="cb2a0706-b40c-e7db-d407-4fd2734df9d5";

@XendraTrl(Identifier="f3eb09cf-cf14-3de3-a10b-39c45f4d4953")
public static String es_PE_COLUMN_C_Currency_ID_Name="Moneda";

@XendraColumn(AD_Element_ID="8daec488-bca2-50fe-f9de-abf0cba2a34a",ColumnName="C_Currency_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="@C_Currency_ID@",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="org.compiere.model.CalloutGLJournal.rate",VFormat="",ValueMin="",ValueMax="",Version="1",
IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f3eb09cf-cf14-3de3-a10b-39c45f4d4953",
Synchronized="2019-08-30 22:22:34.0")
/** Column name C_Currency_ID */
public static final String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
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

@XendraTrl(Identifier="9c0933c3-16bf-8d0f-b9c1-5df1eac36b51")
public static String es_PE_FIELD_Journal_DocumentType_Name="Tipo de Documento";

@XendraTrl(Identifier="9c0933c3-16bf-8d0f-b9c1-5df1eac36b51")
public static String es_PE_FIELD_Journal_DocumentType_Description="Tipo de documento ó reglas";

@XendraTrl(Identifier="9c0933c3-16bf-8d0f-b9c1-5df1eac36b51")
public static String es_PE_FIELD_Journal_DocumentType_Help="El tipo de documento determina la secuencia del documento y las reglas de proceso";

@XendraField(AD_Column_ID="C_DocType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6ea6a282-e86b-3f24-4644-8a69df5e4ea1",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9c0933c3-16bf-8d0f-b9c1-5df1eac36b51")
public static final String FIELDNAME_Journal_DocumentType="9c0933c3-16bf-8d0f-b9c1-5df1eac36b51";

@XendraTrl(Identifier="10dfd7c7-e687-c1e3-bc3f-4b598a647e0e")
public static String es_PE_COLUMN_C_DocType_ID_Name="Tipo de Documento";

@XendraColumn(AD_Element_ID="099a4147-1a72-cdd0-81e0-8bdbc8c0b883",ColumnName="C_DocType_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="66c5d74f-1f24-ffa1-2a9d-b301198a14ea",
FieldLength=22,DefaultValue="@C_DocType_ID@",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="10dfd7c7-e687-c1e3-bc3f-4b598a647e0e",Synchronized="2019-08-30 22:22:34.0")
/** Column name C_DocType_ID */
public static final String COLUMNNAME_C_DocType_ID = "C_DocType_ID";
/** Set Control Amount.
@param ControlAmt If not zero, the Debit amount of the document must be equal this amount */
public void setControlAmt (BigDecimal ControlAmt)
{
set_Value (COLUMNNAME_ControlAmt, ControlAmt);
}
/** Get Control Amount.
@return If not zero, the Debit amount of the document must be equal this amount */
public BigDecimal getControlAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_ControlAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="6a6fe093-7e24-6e88-f872-d5f0bd461663")
public static String es_PE_FIELD_Journal_ControlAmount_Name="Cifra de Control";

@XendraTrl(Identifier="6a6fe093-7e24-6e88-f872-d5f0bd461663")
public static String es_PE_FIELD_Journal_ControlAmount_Description="Si no es cero; el total del débito del documento debe ser igual a este total";

@XendraTrl(Identifier="6a6fe093-7e24-6e88-f872-d5f0bd461663")
public static String es_PE_FIELD_Journal_ControlAmount_Help="Si el total de control es cero; ninguna verificación es ejecutada";

@XendraField(AD_Column_ID="ControlAmt",IsCentrallyMaintained=true,
AD_Tab_ID="6ea6a282-e86b-3f24-4644-8a69df5e4ea1",AD_FieldGroup_ID="Status",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6a6fe093-7e24-6e88-f872-d5f0bd461663")
public static final String FIELDNAME_Journal_ControlAmount="6a6fe093-7e24-6e88-f872-d5f0bd461663";

@XendraTrl(Identifier="a9497f76-e6ba-f0a5-c224-a96853dcf35c")
public static String es_PE_COLUMN_ControlAmt_Name="Cifra de Control";

@XendraColumn(AD_Element_ID="d520c7db-ab46-3aab-ca2d-7ffa7ad5b197",ColumnName="ControlAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a9497f76-e6ba-f0a5-c224-a96853dcf35c",
Synchronized="2019-08-30 22:22:35.0")
/** Column name ControlAmt */
public static final String COLUMNNAME_ControlAmt = "ControlAmt";
/** Set Period.
@param C_Period_ID Period of the Calendar */
public void setC_Period_ID (int C_Period_ID)
{
if (C_Period_ID < 1) throw new IllegalArgumentException ("C_Period_ID is mandatory.");
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

@XendraTrl(Identifier="eaf61482-d1cc-9ed5-981f-c7595cde071d")
public static String es_PE_FIELD_Journal_Period_Name="Período";

@XendraTrl(Identifier="eaf61482-d1cc-9ed5-981f-c7595cde071d")
public static String es_PE_FIELD_Journal_Period_Description="Período de Calendario";

@XendraTrl(Identifier="eaf61482-d1cc-9ed5-981f-c7595cde071d")
public static String es_PE_FIELD_Journal_Period_Help="El Período indica un rango de fechas exclusivo para un calendario";

@XendraField(AD_Column_ID="C_Period_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6ea6a282-e86b-3f24-4644-8a69df5e4ea1",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="eaf61482-d1cc-9ed5-981f-c7595cde071d")
public static final String FIELDNAME_Journal_Period="eaf61482-d1cc-9ed5-981f-c7595cde071d";

@XendraTrl(Identifier="26ba77a2-f20e-19ab-bd0e-4dc8717b4377")
public static String es_PE_COLUMN_C_Period_ID_Name="Período";

@XendraColumn(AD_Element_ID="8f295c04-0eb4-a8f3-829f-cc6a6bd1df1e",ColumnName="C_Period_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="3e0cd06a-1e7b-c866-dabc-c97665ee2f08",
AD_Val_Rule_ID="960b4328-66be-fb14-73d5-68009c22064a",FieldLength=22,DefaultValue="@C_Period_ID@",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="org.compiere.model.CalloutGLJournal.period",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="26ba77a2-f20e-19ab-bd0e-4dc8717b4377",Synchronized="2019-08-30 22:22:35.0")
/** Column name C_Period_ID */
public static final String COLUMNNAME_C_Period_ID = "C_Period_ID";
/** Set Rate.
@param CurrencyRate Currency Conversion Rate */
public void setCurrencyRate (BigDecimal CurrencyRate)
{
if (CurrencyRate == null) throw new IllegalArgumentException ("CurrencyRate is mandatory.");
set_Value (COLUMNNAME_CurrencyRate, CurrencyRate);
}
/** Get Rate.
@return Currency Conversion Rate */
public BigDecimal getCurrencyRate() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CurrencyRate);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="34e55266-3d19-6e13-3653-600374d16f88")
public static String es_PE_FIELD_Journal_Rate_Name="Tasa";

@XendraTrl(Identifier="34e55266-3d19-6e13-3653-600374d16f88")
public static String es_PE_FIELD_Journal_Rate_Description="Tasa de Conversión de moneda.";

@XendraTrl(Identifier="34e55266-3d19-6e13-3653-600374d16f88")
public static String es_PE_FIELD_Journal_Rate_Help="La tasa de conversión de moneda indica la tasa a ser usada cuando se convierte la moneda fuente a la moneda contable.";

@XendraField(AD_Column_ID="CurrencyRate",IsCentrallyMaintained=true,
AD_Tab_ID="6ea6a282-e86b-3f24-4644-8a69df5e4ea1",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@$C_Currency_ID@!@C_Currency_ID@",DisplayLength=26,IsReadOnly=false,SeqNo=170,
SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="34e55266-3d19-6e13-3653-600374d16f88")
public static final String FIELDNAME_Journal_Rate="34e55266-3d19-6e13-3653-600374d16f88";

@XendraTrl(Identifier="c7b12a33-d6de-a355-dada-3af85978002c")
public static String es_PE_COLUMN_CurrencyRate_Name="Tasa";

@XendraColumn(AD_Element_ID="4289010b-fa36-c95f-6306-3182f48d2b0c",ColumnName="CurrencyRate",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="1",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c7b12a33-d6de-a355-dada-3af85978002c",
Synchronized="2019-08-30 22:22:35.0")
/** Column name CurrencyRate */
public static final String COLUMNNAME_CurrencyRate = "CurrencyRate";
/** Set Account Date.
@param DateAcct Accounting Date */
public void setDateAcct (Timestamp DateAcct)
{
if (DateAcct == null) throw new IllegalArgumentException ("DateAcct is mandatory.");
set_Value (COLUMNNAME_DateAcct, DateAcct);
}
/** Get Account Date.
@return Accounting Date */
public Timestamp getDateAcct() 
{
return (Timestamp)get_Value(COLUMNNAME_DateAcct);
}

@XendraTrl(Identifier="3ff1c436-d08b-b199-7ef5-cc9476561092")
public static String es_PE_FIELD_Journal_AccountDate_Name="Fecha de Aplicación CG";

@XendraTrl(Identifier="3ff1c436-d08b-b199-7ef5-cc9476561092")
public static String es_PE_FIELD_Journal_AccountDate_Description="Fecha contable";

@XendraTrl(Identifier="3ff1c436-d08b-b199-7ef5-cc9476561092")
public static String es_PE_FIELD_Journal_AccountDate_Help="La fecha contable indica la fecha a ser usada en las cuentas de contabilidad general generadas desde este documento";

@XendraField(AD_Column_ID="DateAcct",IsCentrallyMaintained=true,
AD_Tab_ID="6ea6a282-e86b-3f24-4644-8a69df5e4ea1",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3ff1c436-d08b-b199-7ef5-cc9476561092")
public static final String FIELDNAME_Journal_AccountDate="3ff1c436-d08b-b199-7ef5-cc9476561092";

@XendraTrl(Identifier="6eadae31-0c8b-3d2f-a5d1-cab1738266a2")
public static String es_PE_COLUMN_DateAcct_Name="Fecha de Aplicación CG";

@XendraColumn(AD_Element_ID="034727d0-e80f-fadf-3d4f-2d8d37b75669",ColumnName="DateAcct",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,
DefaultValue="@DateAcct@",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="org.compiere.model.CalloutGLJournal.period; org.compiere.model.CalloutGLJournal.rate",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="6eadae31-0c8b-3d2f-a5d1-cab1738266a2",Synchronized="2019-08-30 22:22:35.0")
/** Column name DateAcct */
public static final String COLUMNNAME_DateAcct = "DateAcct";
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

@XendraTrl(Identifier="63377c0a-8ba6-bbc4-1f73-f6e30a83f0a3")
public static String es_PE_FIELD_Journal_DateDoc_Name="F. Documento";

@XendraTrl(Identifier="63377c0a-8ba6-bbc4-1f73-f6e30a83f0a3")
public static String es_PE_FIELD_Journal_DateDoc_Description="Fecha del documento";

@XendraTrl(Identifier="63377c0a-8ba6-bbc4-1f73-f6e30a83f0a3")
public static String es_PE_FIELD_Journal_DateDoc_Help="La fecha del documento indica la fecha en que el documento fue generado. Puede ó no ser la misma que la fecha contable. ";

@XendraField(AD_Column_ID="DateDoc",IsCentrallyMaintained=true,
AD_Tab_ID="6ea6a282-e86b-3f24-4644-8a69df5e4ea1",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="63377c0a-8ba6-bbc4-1f73-f6e30a83f0a3")
public static final String FIELDNAME_Journal_DateDoc="63377c0a-8ba6-bbc4-1f73-f6e30a83f0a3";

@XendraTrl(Identifier="e9848803-641e-ec74-2d12-913a5daf473f")
public static String es_PE_COLUMN_DateDoc_Name="F. Documento";

@XendraColumn(AD_Element_ID="68f87a38-0b7e-cc52-6990-3b5d2d120d9d",ColumnName="DateDoc",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,
DefaultValue="@DateDoc@",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="org.compiere.model.CalloutEngine.dateAcct",VFormat="",ValueMin="",ValueMax="",Version="1",
IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e9848803-641e-ec74-2d12-913a5daf473f",
Synchronized="2019-08-30 22:22:35.0")
/** Column name DateDoc */
public static final String COLUMNNAME_DateDoc = "DateDoc";
/** Set Description.
@param Description Optional short DESCRIPTION of the record */
public void setDescription (String Description)
{
if (Description == null) throw new IllegalArgumentException ("Description is mandatory.");
if (Description.length() > 255)
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

@XendraTrl(Identifier="29374078-c221-bfe0-02aa-2c6378f47e6b")
public static String es_PE_FIELD_Journal_Description_Name="Observación";

@XendraTrl(Identifier="29374078-c221-bfe0-02aa-2c6378f47e6b")
public static String es_PE_FIELD_Journal_Description_Description="Observación";

@XendraTrl(Identifier="29374078-c221-bfe0-02aa-2c6378f47e6b")
public static String es_PE_FIELD_Journal_Description_Help="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="6ea6a282-e86b-3f24-4644-8a69df5e4ea1",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="29374078-c221-bfe0-02aa-2c6378f47e6b")
public static final String FIELDNAME_Journal_Description="29374078-c221-bfe0-02aa-2c6378f47e6b";

@XendraTrl(Identifier="06bcef8a-13df-47b3-70cd-4aa56b6f5ee5")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="06bcef8a-13df-47b3-70cd-4aa56b6f5ee5",
Synchronized="2019-08-30 22:22:35.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Document Action.
@param DocAction The targeted status of the document */
public void setDocAction (String DocAction)
{
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

@XendraTrl(Identifier="2fd4a25f-d613-f5d1-a112-137d734b8af3")
public static String es_PE_FIELD_Journal_ProcessJournal_Name="Procesar Diario";

@XendraField(AD_Column_ID="DocAction",IsCentrallyMaintained=true,
AD_Tab_ID="6ea6a282-e86b-3f24-4644-8a69df5e4ea1",AD_FieldGroup_ID="Status",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2fd4a25f-d613-f5d1-a112-137d734b8af3")
public static final String FIELDNAME_Journal_ProcessJournal="2fd4a25f-d613-f5d1-a112-137d734b8af3";

@XendraTrl(Identifier="3cf53c6e-88ba-8ebe-d68f-f59db3aa1e88")
public static String es_PE_COLUMN_DocAction_Name="Acción en el Documento";

@XendraColumn(AD_Element_ID="d4b9075b-18e5-ebbb-5565-d217a7e531cb",ColumnName="DocAction",
AD_Reference_ID=28,AD_Reference_Value_ID="e397c9b0-c643-d1cd-8380-20bee13b2a6e",AD_Val_Rule_ID="",
FieldLength=2,DefaultValue="CO",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,
AD_Process_ID="d14625aa-b8a9-f54b-1f36-df48a6178753",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3cf53c6e-88ba-8ebe-d68f-f59db3aa1e88",
Synchronized="2019-08-30 22:22:35.0")
/** Column name DocAction */
public static final String COLUMNNAME_DocAction = "DocAction";
/** Set Document Status.
@param DocStatus The current status of the document */
public void setDocStatus (String DocStatus)
{
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

@XendraTrl(Identifier="0dbd07b3-33c0-1301-2d6d-961927aec20b")
public static String es_PE_FIELD_Journal_DocumentStatus_Name="Estado del Documento";

@XendraTrl(Identifier="0dbd07b3-33c0-1301-2d6d-961927aec20b")
public static String es_PE_FIELD_Journal_DocumentStatus_Description="El estado actual del documento";

@XendraTrl(Identifier="0dbd07b3-33c0-1301-2d6d-961927aec20b")
public static String es_PE_FIELD_Journal_DocumentStatus_Help="El estado del documento indica el estado del documento en este momento. Si usted quiere cambiar el estado de Documento; use el campo acción de documento";

@XendraField(AD_Column_ID="DocStatus",IsCentrallyMaintained=true,
AD_Tab_ID="6ea6a282-e86b-3f24-4644-8a69df5e4ea1",AD_FieldGroup_ID="Status",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=220,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0dbd07b3-33c0-1301-2d6d-961927aec20b")
public static final String FIELDNAME_Journal_DocumentStatus="0dbd07b3-33c0-1301-2d6d-961927aec20b";

@XendraTrl(Identifier="aa38ca63-c770-33cb-c467-26cac5aa7f50")
public static String es_PE_COLUMN_DocStatus_Name="Estado del Documento";

@XendraColumn(AD_Element_ID="e73fa537-3438-bd01-dfd4-f0f080a28c55",ColumnName="DocStatus",
AD_Reference_ID=17,AD_Reference_Value_ID="7627125d-fefe-e6bc-bb7d-4a6c772172dc",AD_Val_Rule_ID="",
FieldLength=2,DefaultValue="DR",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="aa38ca63-c770-33cb-c467-26cac5aa7f50",Synchronized="2019-08-30 22:22:35.0")
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

@XendraTrl(Identifier="aaed6ac7-c7cb-f8d9-5700-bf6acbc7263e")
public static String es_PE_FIELD_Journal_DocumentNo_Name="No. del Documento";

@XendraTrl(Identifier="aaed6ac7-c7cb-f8d9-5700-bf6acbc7263e")
public static String es_PE_FIELD_Journal_DocumentNo_Description="Número de secuencia del documento para cada documento";

@XendraTrl(Identifier="aaed6ac7-c7cb-f8d9-5700-bf6acbc7263e")
public static String es_PE_FIELD_Journal_DocumentNo_Help="El número del documento es usualmente generado en automático por el sistema y determinado por el tipo del documento. Si el documento no se salva; el número preliminar se despliega entre \"<>\"";

@XendraField(AD_Column_ID="DocumentNo",IsCentrallyMaintained=true,
AD_Tab_ID="6ea6a282-e86b-3f24-4644-8a69df5e4ea1",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=50,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="aaed6ac7-c7cb-f8d9-5700-bf6acbc7263e")
public static final String FIELDNAME_Journal_DocumentNo="aaed6ac7-c7cb-f8d9-5700-bf6acbc7263e";

@XendraTrl(Identifier="a98e22e0-cbc0-3c0a-ec2c-c1ad183580b2")
public static String es_PE_COLUMN_DocumentNo_Name="No. del Documento";

@XendraColumn(AD_Element_ID="e3ca6e28-702a-2722-d941-b2072a0de9cb",ColumnName="DocumentNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a98e22e0-cbc0-3c0a-ec2c-c1ad183580b2",
Synchronized="2019-08-30 22:22:35.0")
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
@XendraTrl(Identifier="09c6a03d-1a61-2f3a-1046-af1d40636272")
public static String es_PE_COLUMN_Fact_ID_Name="ID Asiento Contable (por documento)";

@XendraColumn(AD_Element_ID="20f6c8ee-0151-735b-7a03-2006e09d8eb0",ColumnName="Fact_ID",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="09c6a03d-1a61-2f3a-1046-af1d40636272",
Synchronized="2019-08-30 22:22:35.0")
/** Column name Fact_ID */
public static final String COLUMNNAME_Fact_ID = "Fact_ID";
/** Set Budget.
@param GL_Budget_ID General Ledger Budget */
public void setGL_Budget_ID (int GL_Budget_ID)
{
if (GL_Budget_ID <= 0) set_Value (COLUMNNAME_GL_Budget_ID, null);
 else 
set_Value (COLUMNNAME_GL_Budget_ID, Integer.valueOf(GL_Budget_ID));
}
/** Get Budget.
@return General Ledger Budget */
public int getGL_Budget_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_GL_Budget_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="aafe4fea-fe76-15be-7a3e-5614ba15a383")
public static String es_PE_FIELD_Journal_Budget_Name="Presupuesto";

@XendraTrl(Identifier="aafe4fea-fe76-15be-7a3e-5614ba15a383")
public static String es_PE_FIELD_Journal_Budget_Description="Presupuesto de la Contabilidad General";

@XendraTrl(Identifier="aafe4fea-fe76-15be-7a3e-5614ba15a383")
public static String es_PE_FIELD_Journal_Budget_Help="El Presupuesto de Contabilidad General identifica un presupuesto definido por el usuario. Puede ser usado para reportar en comparación con los meses reales.";

@XendraField(AD_Column_ID="GL_Budget_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6ea6a282-e86b-3f24-4644-8a69df5e4ea1",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@PostingType@='B'",DisplayLength=14,IsReadOnly=false,SeqNo=90,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="aafe4fea-fe76-15be-7a3e-5614ba15a383")
public static final String FIELDNAME_Journal_Budget="aafe4fea-fe76-15be-7a3e-5614ba15a383";

@XendraTrl(Identifier="be799977-fe30-1595-0e8d-a849c7f6531c")
public static String es_PE_COLUMN_GL_Budget_ID_Name="Presupuesto";

@XendraColumn(AD_Element_ID="202442f1-5c47-451c-a68b-6c32567592ad",ColumnName="GL_Budget_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="be799977-fe30-1595-0e8d-a849c7f6531c",
Synchronized="2019-08-30 22:22:35.0")
/** Column name GL_Budget_ID */
public static final String COLUMNNAME_GL_Budget_ID = "GL_Budget_ID";
/** Set GL Category.
@param GL_Category_ID General Ledger Category */
public void setGL_Category_ID (int GL_Category_ID)
{
if (GL_Category_ID < 1) throw new IllegalArgumentException ("GL_Category_ID is mandatory.");
set_Value (COLUMNNAME_GL_Category_ID, Integer.valueOf(GL_Category_ID));
}
/** Get GL Category.
@return General Ledger Category */
public int getGL_Category_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_GL_Category_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="861b4152-2cdf-185e-7213-326987f9bf33")
public static String es_PE_FIELD_Journal_GLCategory_Name="Categoría CG";

@XendraTrl(Identifier="861b4152-2cdf-185e-7213-326987f9bf33")
public static String es_PE_FIELD_Journal_GLCategory_Description="Categoría de Contabilidad General";

@XendraTrl(Identifier="861b4152-2cdf-185e-7213-326987f9bf33")
public static String es_PE_FIELD_Journal_GLCategory_Help="La Categoría de Contabilidad General es un método opcional; definido por el usuario; de agrupación de líneas de las pólizas";

@XendraField(AD_Column_ID="GL_Category_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6ea6a282-e86b-3f24-4644-8a69df5e4ea1",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="861b4152-2cdf-185e-7213-326987f9bf33")
public static final String FIELDNAME_Journal_GLCategory="861b4152-2cdf-185e-7213-326987f9bf33";

@XendraTrl(Identifier="4ce58afe-19d7-cead-dd55-24b37f807a42")
public static String es_PE_COLUMN_GL_Category_ID_Name="Categoría CG";

@XendraColumn(AD_Element_ID="b3063a1c-d28b-42fc-2d1b-27037b4d6514",ColumnName="GL_Category_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="0b63bfd0-74b1-97e5-5bc9-fe99cc50e4d3",
FieldLength=22,DefaultValue="@GL_Category_ID@",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="4ce58afe-19d7-cead-dd55-24b37f807a42",Synchronized="2019-08-30 22:22:35.0")
/** Column name GL_Category_ID */
public static final String COLUMNNAME_GL_Category_ID = "GL_Category_ID";
/** Set Journal Batch.
@param GL_JournalBatch_ID General Ledger Journal Batch */
public void setGL_JournalBatch_ID (int GL_JournalBatch_ID)
{
if (GL_JournalBatch_ID <= 0) set_ValueNoCheck (COLUMNNAME_GL_JournalBatch_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_GL_JournalBatch_ID, Integer.valueOf(GL_JournalBatch_ID));
}
/** Get Journal Batch.
@return General Ledger Journal Batch */
public int getGL_JournalBatch_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_GL_JournalBatch_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="1c3a4b8b-8a31-4d9b-ab99-95b56bfb2f3f")
public static String es_PE_FIELD_Journal_JournalBatch_Name="Lote de Diario CG";

@XendraTrl(Identifier="1c3a4b8b-8a31-4d9b-ab99-95b56bfb2f3f")
public static String es_PE_FIELD_Journal_JournalBatch_Description="Lote de Diario CG";

@XendraTrl(Identifier="1c3a4b8b-8a31-4d9b-ab99-95b56bfb2f3f")
public static String es_PE_FIELD_Journal_JournalBatch_Help="El lote de pólizas de la contabilidad general identifica un conjunto de pólizas a ser procesadas como un grupo.";

@XendraField(AD_Column_ID="GL_JournalBatch_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6ea6a282-e86b-3f24-4644-8a69df5e4ea1",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1c3a4b8b-8a31-4d9b-ab99-95b56bfb2f3f")
public static final String FIELDNAME_Journal_JournalBatch="1c3a4b8b-8a31-4d9b-ab99-95b56bfb2f3f";

@XendraTrl(Identifier="eb9eb65a-9db2-e928-8ee0-c778504f5f8a")
public static String es_PE_COLUMN_GL_JournalBatch_ID_Name="Lote de Diario CG";

@XendraColumn(AD_Element_ID="7fbd376a-5aca-74a1-5535-368c0ba04a7a",ColumnName="GL_JournalBatch_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="eb9eb65a-9db2-e928-8ee0-c778504f5f8a",
Synchronized="2019-08-30 22:22:35.0")
/** Column name GL_JournalBatch_ID */
public static final String COLUMNNAME_GL_JournalBatch_ID = "GL_JournalBatch_ID";
/** Set Journal.
@param GL_Journal_ID General Ledger Journal */
public void setGL_Journal_ID (int GL_Journal_ID)
{
if (GL_Journal_ID < 1) throw new IllegalArgumentException ("GL_Journal_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_GL_Journal_ID, Integer.valueOf(GL_Journal_ID));
}
/** Get Journal.
@return General Ledger Journal */
public int getGL_Journal_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_GL_Journal_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="409945a4-1c92-b9e3-c1d3-7887244e0900")
public static String es_PE_FIELD_Journal_Journal_Name="Póliza";

@XendraTrl(Identifier="409945a4-1c92-b9e3-c1d3-7887244e0900")
public static String es_PE_FIELD_Journal_Journal_Description="Póliza";

@XendraTrl(Identifier="409945a4-1c92-b9e3-c1d3-7887244e0900")
public static String es_PE_FIELD_Journal_Journal_Help="La póliza de la contabilidad general identifica un grupo de líneas de póliza que representa una transacción lógica del negocio.";

@XendraField(AD_Column_ID="GL_Journal_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6ea6a282-e86b-3f24-4644-8a69df5e4ea1",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="409945a4-1c92-b9e3-c1d3-7887244e0900")
public static final String FIELDNAME_Journal_Journal="409945a4-1c92-b9e3-c1d3-7887244e0900";
/** Column name GL_Journal_ID */
public static final String COLUMNNAME_GL_Journal_ID = "GL_Journal_ID";
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
@XendraTrl(Identifier="2150ab84-52ea-44dc-9590-a9ed36f9a9df")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2150ab84-52ea-44dc-9590-a9ed36f9a9df",
Synchronized="2019-08-30 22:22:35.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Approved.
@param IsApproved Indicates if this document requires approval */
public void setIsApproved (boolean IsApproved)
{
set_ValueNoCheck (COLUMNNAME_IsApproved, Boolean.valueOf(IsApproved));
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

@XendraTrl(Identifier="18289f66-0cc1-5638-2e5c-ad127c1e8a4c")
public static String es_PE_FIELD_Journal_Approved_Name="Aprobación";

@XendraTrl(Identifier="18289f66-0cc1-5638-2e5c-ad127c1e8a4c")
public static String es_PE_FIELD_Journal_Approved_Description="Indica si este documento requiere aprobación";

@XendraTrl(Identifier="18289f66-0cc1-5638-2e5c-ad127c1e8a4c")
public static String es_PE_FIELD_Journal_Approved_Help="El Cuadro de Verificación  Aprobado indica si este documento requiere aprobación antes de que pueda ser procesado";

@XendraField(AD_Column_ID="IsApproved",IsCentrallyMaintained=true,
AD_Tab_ID="6ea6a282-e86b-3f24-4644-8a69df5e4ea1",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=190,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="18289f66-0cc1-5638-2e5c-ad127c1e8a4c")
public static final String FIELDNAME_Journal_Approved="18289f66-0cc1-5638-2e5c-ad127c1e8a4c";

@XendraTrl(Identifier="950d4efc-a1df-bc32-21c6-075ae2a4721d")
public static String es_PE_COLUMN_IsApproved_Name="Aprobación";

@XendraColumn(AD_Element_ID="44388d99-07b7-b005-9e16-78884800beff",ColumnName="IsApproved",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="950d4efc-a1df-bc32-21c6-075ae2a4721d",
Synchronized="2019-08-30 22:22:35.0")
/** Column name IsApproved */
public static final String COLUMNNAME_IsApproved = "IsApproved";
/** Set Close Document.
@param IsCloseDocument Close Document (process) */
public void setIsCloseDocument (boolean IsCloseDocument)
{
set_Value (COLUMNNAME_IsCloseDocument, Boolean.valueOf(IsCloseDocument));
}
/** Get Close Document.
@return Close Document (process) */
public boolean isCloseDocument() 
{
Object oo = get_Value(COLUMNNAME_IsCloseDocument);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="4da91f60-50f6-41c9-9773-ecdbd4762990")
public static String es_PE_COLUMN_IsCloseDocument_Name="Close Document";

@XendraColumn(AD_Element_ID="ba1e3b22-a9f1-84d5-6c2b-f96847f7f25c",ColumnName="IsCloseDocument",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4da91f60-50f6-41c9-9773-ecdbd4762990",
Synchronized="2019-08-30 22:22:35.0")
/** Column name IsCloseDocument */
public static final String COLUMNNAME_IsCloseDocument = "IsCloseDocument";
/** Set IsOpenDocument.
@param IsOpenDocument Open Document (Process) */
public void setIsOpenDocument (boolean IsOpenDocument)
{
set_Value (COLUMNNAME_IsOpenDocument, Boolean.valueOf(IsOpenDocument));
}
/** Get IsOpenDocument.
@return Open Document (Process) */
public boolean isOpenDocument() 
{
Object oo = get_Value(COLUMNNAME_IsOpenDocument);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="90c4c6cc-4db6-4892-89e5-444a75ca46b5")
public static String es_PE_COLUMN_IsOpenDocument_Name="isopendocument";

@XendraColumn(AD_Element_ID="2888b8d7-7c19-4542-a943-a77ea885f1cf",ColumnName="IsOpenDocument",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="90c4c6cc-4db6-4892-89e5-444a75ca46b5",
Synchronized="2019-08-30 22:22:35.0")
/** Column name IsOpenDocument */
public static final String COLUMNNAME_IsOpenDocument = "IsOpenDocument";
/** Set Printed.
@param IsPrinted Indicates if this document / line is printed */
public void setIsPrinted (boolean IsPrinted)
{
set_ValueNoCheck (COLUMNNAME_IsPrinted, Boolean.valueOf(IsPrinted));
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

@XendraTrl(Identifier="1b8d61c3-d540-574e-213a-80fcb56aa83b")
public static String es_PE_FIELD_Journal_Printed_Name="Impreso";

@XendraTrl(Identifier="1b8d61c3-d540-574e-213a-80fcb56aa83b")
public static String es_PE_FIELD_Journal_Printed_Description="Indica si este documento es impreso.";

@XendraTrl(Identifier="1b8d61c3-d540-574e-213a-80fcb56aa83b")
public static String es_PE_FIELD_Journal_Printed_Help="El cuadro de verificación impreso indica si este documento se imprimirá.";

@XendraField(AD_Column_ID="IsPrinted",IsCentrallyMaintained=true,
AD_Tab_ID="6ea6a282-e86b-3f24-4644-8a69df5e4ea1",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1b8d61c3-d540-574e-213a-80fcb56aa83b")
public static final String FIELDNAME_Journal_Printed="1b8d61c3-d540-574e-213a-80fcb56aa83b";

@XendraTrl(Identifier="59a0bf66-6edc-c518-be1d-07bc26220d02")
public static String es_PE_COLUMN_IsPrinted_Name="Impreso";

@XendraColumn(AD_Element_ID="66795cb3-a608-19bb-8cde-40abe30a0130",ColumnName="IsPrinted",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="59a0bf66-6edc-c518-be1d-07bc26220d02",
Synchronized="2019-08-30 22:22:35.0")
/** Column name IsPrinted */
public static final String COLUMNNAME_IsPrinted = "IsPrinted";
/** Set Posted.
@param Posted Posting status */
public void setPosted (boolean Posted)
{
set_ValueNoCheck (COLUMNNAME_Posted, Boolean.valueOf(Posted));
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

@XendraTrl(Identifier="24af0198-226a-cde7-34ea-63ca81422936")
public static String es_PE_FIELD_Journal_Posted_Name="Fijada";

@XendraTrl(Identifier="24af0198-226a-cde7-34ea-63ca81422936")
public static String es_PE_FIELD_Journal_Posted_Description="Las transacciones de contabilidad general han sido procesadas.";

@XendraTrl(Identifier="24af0198-226a-cde7-34ea-63ca81422936")
public static String es_PE_FIELD_Journal_Posted_Help="El campo fijado indica el estado de la generación de las Líneas contables a la contabilidad general.";

@XendraField(AD_Column_ID="Posted",IsCentrallyMaintained=true,
AD_Tab_ID="6ea6a282-e86b-3f24-4644-8a69df5e4ea1",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@Processed@=Y & @#ShowAcct@=Y",DisplayLength=23,IsReadOnly=false,SeqNo=230,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="24af0198-226a-cde7-34ea-63ca81422936")
public static final String FIELDNAME_Journal_Posted="24af0198-226a-cde7-34ea-63ca81422936";

@XendraTrl(Identifier="6ec2fb2c-20f1-16e9-4bde-f5d4cdc826ff")
public static String es_PE_COLUMN_Posted_Name="Fijada";

@XendraColumn(AD_Element_ID="5eb52ebc-6992-12f5-b85a-e0a136df259b",ColumnName="Posted",
AD_Reference_ID=28,AD_Reference_Value_ID="d2b659dd-6c8c-baf3-fc71-0ee997273154",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="N",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="6ec2fb2c-20f1-16e9-4bde-f5d4cdc826ff",Synchronized="2019-08-30 22:22:35.0")
/** Column name Posted */
public static final String COLUMNNAME_Posted = "Posted";
/** Set PostingType.
@param PostingType The type of posted amount for the transaction */
public void setPostingType (String PostingType)
{
if (PostingType.length() > 1)
{
log.warning("Length > 1 - truncated");
PostingType = PostingType.substring(0,0);
}
set_Value (COLUMNNAME_PostingType, PostingType);
}
/** Get PostingType.
@return The type of posted amount for the transaction */
public String getPostingType() 
{
return (String)get_Value(COLUMNNAME_PostingType);
}

@XendraTrl(Identifier="e2b8a027-194f-d5f9-3b33-fbe05b7f2786")
public static String es_PE_FIELD_Journal_PostingType_Name="Tipo de Aplicación";

@XendraTrl(Identifier="e2b8a027-194f-d5f9-3b33-fbe05b7f2786")
public static String es_PE_FIELD_Journal_PostingType_Description="El tipo de total que esta póliza actualizó";

@XendraTrl(Identifier="e2b8a027-194f-d5f9-3b33-fbe05b7f2786")
public static String es_PE_FIELD_Journal_PostingType_Help="El tipo de aplicación indica el tipo de total (actual; gravamen; presupuesto) que esta póliza actualizó";

@XendraField(AD_Column_ID="PostingType",IsCentrallyMaintained=true,
AD_Tab_ID="6ea6a282-e86b-3f24-4644-8a69df5e4ea1",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e2b8a027-194f-d5f9-3b33-fbe05b7f2786")
public static final String FIELDNAME_Journal_PostingType="e2b8a027-194f-d5f9-3b33-fbe05b7f2786";

@XendraTrl(Identifier="63d0e837-7818-c5c9-d947-a4aec2d5951d")
public static String es_PE_COLUMN_PostingType_Name="Tipo de Aplicación";

@XendraColumn(AD_Element_ID="465cd8dd-d2b8-aa76-fc18-7f8df439b182",ColumnName="PostingType",
AD_Reference_ID=17,AD_Reference_Value_ID="1ad48d23-2ec9-09d0-cb68-38688c5e6ce0",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="@PostingType@",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="63d0e837-7818-c5c9-d947-a4aec2d5951d",Synchronized="2019-08-30 22:22:35.0")
/** Column name PostingType */
public static final String COLUMNNAME_PostingType = "PostingType";
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

@XendraTrl(Identifier="0490229e-e91a-5f40-3e9d-b5e1876ee27d")
public static String es_PE_FIELD_Journal_Processed_Name="Procesado";

@XendraTrl(Identifier="0490229e-e91a-5f40-3e9d-b5e1876ee27d")
public static String es_PE_FIELD_Journal_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="0490229e-e91a-5f40-3e9d-b5e1876ee27d")
public static String es_PE_FIELD_Journal_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="6ea6a282-e86b-3f24-4644-8a69df5e4ea1",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0490229e-e91a-5f40-3e9d-b5e1876ee27d")
public static final String FIELDNAME_Journal_Processed="0490229e-e91a-5f40-3e9d-b5e1876ee27d";

@XendraTrl(Identifier="45059e5a-6d64-b2ec-1bda-26c7099d8169")
public static String es_PE_COLUMN_Processed_Name="Procesado";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="45059e5a-6d64-b2ec-1bda-26c7099d8169",
Synchronized="2019-08-30 22:22:35.0")
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

@XendraTrl(Identifier="2013fad7-f7d3-b640-f939-172eb642c7eb")
public static String es_PE_FIELD_Journal_ProcessNow_Name="Process Now";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="6ea6a282-e86b-3f24-4644-8a69df5e4ea1",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2013fad7-f7d3-b640-f939-172eb642c7eb")
public static final String FIELDNAME_Journal_ProcessNow="2013fad7-f7d3-b640-f939-172eb642c7eb";

@XendraTrl(Identifier="deb97d06-316d-f233-eea6-8e358f2cf46f")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="deb97d06-316d-f233-eea6-8e358f2cf46f",
Synchronized="2019-08-30 22:22:35.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
/** Set Total Credit.
@param TotalCr Total Credit in document currency */
public void setTotalCr (BigDecimal TotalCr)
{
if (TotalCr == null) throw new IllegalArgumentException ("TotalCr is mandatory.");
set_ValueNoCheck (COLUMNNAME_TotalCr, TotalCr);
}
/** Get Total Credit.
@return Total Credit in document currency */
public BigDecimal getTotalCr() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_TotalCr);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="e0d61c70-02ef-236f-9246-51381d2c5a44")
public static String es_PE_FIELD_Journal_TotalCredit_Name="Total Crédito";

@XendraTrl(Identifier="e0d61c70-02ef-236f-9246-51381d2c5a44")
public static String es_PE_FIELD_Journal_TotalCredit_Description="Total de Créditos en la moneda del negocio";

@XendraTrl(Identifier="e0d61c70-02ef-236f-9246-51381d2c5a44")
public static String es_PE_FIELD_Journal_TotalCredit_Help="El Crédito Total indica el total de crédito para una póliza ó lote de pólizas en la moneda fuente";

@XendraField(AD_Column_ID="TotalCr",IsCentrallyMaintained=true,
AD_Tab_ID="6ea6a282-e86b-3f24-4644-8a69df5e4ea1",AD_FieldGroup_ID="Status",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=210,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e0d61c70-02ef-236f-9246-51381d2c5a44")
public static final String FIELDNAME_Journal_TotalCredit="e0d61c70-02ef-236f-9246-51381d2c5a44";

@XendraTrl(Identifier="10cf3fb5-1651-5c6f-a7e7-9184c8a266a2")
public static String es_PE_COLUMN_TotalCr_Name="Total Crédito";

@XendraColumn(AD_Element_ID="c4df0a38-3a1d-0a18-ce6c-5458e8897ab4",ColumnName="TotalCr",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="10cf3fb5-1651-5c6f-a7e7-9184c8a266a2",
Synchronized="2019-08-30 22:22:35.0")
/** Column name TotalCr */
public static final String COLUMNNAME_TotalCr = "TotalCr";
/** Set Total Debit.
@param TotalDr Total debit in document currency */
public void setTotalDr (BigDecimal TotalDr)
{
if (TotalDr == null) throw new IllegalArgumentException ("TotalDr is mandatory.");
set_ValueNoCheck (COLUMNNAME_TotalDr, TotalDr);
}
/** Get Total Debit.
@return Total debit in document currency */
public BigDecimal getTotalDr() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_TotalDr);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="7774ea0f-a780-70f3-0c30-d00c698a658f")
public static String es_PE_FIELD_Journal_TotalDebit_Name="Total Débito";

@XendraTrl(Identifier="7774ea0f-a780-70f3-0c30-d00c698a658f")
public static String es_PE_FIELD_Journal_TotalDebit_Description="Total de Débitos en la moneda del negocio";

@XendraTrl(Identifier="7774ea0f-a780-70f3-0c30-d00c698a658f")
public static String es_PE_FIELD_Journal_TotalDebit_Help="El Débito total indica el total de débito para una póliza ó lote de pólizas en la moneda fuente";

@XendraField(AD_Column_ID="TotalDr",IsCentrallyMaintained=true,
AD_Tab_ID="6ea6a282-e86b-3f24-4644-8a69df5e4ea1",AD_FieldGroup_ID="Status",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=200,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7774ea0f-a780-70f3-0c30-d00c698a658f")
public static final String FIELDNAME_Journal_TotalDebit="7774ea0f-a780-70f3-0c30-d00c698a658f";

@XendraTrl(Identifier="93683b2d-3686-9716-e0f3-ecad1ecd4b19")
public static String es_PE_COLUMN_TotalDr_Name="Total Débito";

@XendraColumn(AD_Element_ID="55b251f6-8ed0-1b6e-5cbd-05019adb48d8",ColumnName="TotalDr",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="93683b2d-3686-9716-e0f3-ecad1ecd4b19",
Synchronized="2019-08-30 22:22:35.0")
/** Column name TotalDr */
public static final String COLUMNNAME_TotalDr = "TotalDr";
}
