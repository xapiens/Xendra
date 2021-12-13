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
/** Generated Model for GL_JournalLine
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_GL_JournalLine extends PO
{
/** Standard Constructor
@param ctx context
@param GL_JournalLine_ID id
@param trxName transaction
*/
public X_GL_JournalLine (Properties ctx, int GL_JournalLine_ID, String trxName)
{
super (ctx, GL_JournalLine_ID, trxName);
/** if (GL_JournalLine_ID == 0)
{
setAmtAcctCr (Env.ZERO);	
// 0
setAmtAcctDr (Env.ZERO);	
// 0
setAmtSourceCr (Env.ZERO);	
// 0
setAmtSourceDr (Env.ZERO);	
// 0
setC_ConversionType_ID (0);
setC_Currency_ID (0);	
// @C_Currency_ID@
setCurrencyRate (Env.ZERO);	
// @CurrencyRate@;
1
setC_ValidCombination_ID (0);
setDateAcct (new Timestamp(System.currentTimeMillis()));	
// @DateAcct@
setGL_Journal_ID (0);
setGL_JournalLine_ID (0);
setIsGenerated (false);	
// N
setLine (0);	
// @SQL=SELECT COALESCE(MAX(Line),0)+10 AS DefaultValue FROM GL_JournalLine WHERE GL_Journal_ID=@GL_Journal_ID@
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
public X_GL_JournalLine (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=226 */
public static int Table_ID=MTable.getTable_ID("GL_JournalLine");

@XendraTrl(Identifier="c6932af9-e469-92d6-97c0-6ee36cbbc911")
public static String es_PE_TAB_Line_Description="Ìtem de diario del libro mayor";

@XendraTrl(Identifier="c6932af9-e469-92d6-97c0-6ee36cbbc911")
public static String es_PE_TAB_Line_Help="La pestaña de Ìtem de la entrada de diario del GL define las transacciones de débito y crédito individuales que comprenden una entrada de diario.";

@XendraTrl(Identifier="c6932af9-e469-92d6-97c0-6ee36cbbc911")
public static String es_PE_TAB_Line_Name="Ìtem";
@XendraTab(Name="Line",
Description="General Ledger Journal Line",
Help="The GL Journal Line Tab defines the individual debit and credit transactions that comprise a journal.",
AD_Window_ID="d65b9eb7-94f9-c08c-7f56-cfe897065bea",SeqNo=30,TabLevel=2,IsSingleRow=true,
IsInfoTab=true,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="c6932af9-e469-92d6-97c0-6ee36cbbc911",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Line="c6932af9-e469-92d6-97c0-6ee36cbbc911";

@XendraTrl(Identifier="988b5208-7178-6074-a2e5-82e7805a6cce")
public static String es_PE_TABLE_GL_JournalLine_Name="Línea de Póliza";

@XendraTable(Name="Journal Line",AD_Package_ID="2ac04657-d663-47c2-4ec1-927ad71f1e96",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="General Ledger Journal Line",
Help="",TableName="GL_JournalLine",AccessLevel="1",
AD_Window_ID="d65b9eb7-94f9-c08c-7f56-cfe897065bea",AD_Val_Rule_ID="",IsKey=1,LoadSeq=140,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.accounting",Identifier="988b5208-7178-6074-a2e5-82e7805a6cce",
Synchronized="2020-03-03 21:37:58.0")
/** TableName=GL_JournalLine */
public static final String Table_Name="GL_JournalLine";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"GL_JournalLine");

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
    Table_ID = MTable.getTable_ID("GL_JournalLine");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_GL_JournalLine[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Accounted Credit.
@param AmtAcctCr Accounted Credit Amount */
public void setAmtAcctCr (BigDecimal AmtAcctCr)
{
if (AmtAcctCr == null) throw new IllegalArgumentException ("AmtAcctCr is mandatory.");
set_ValueNoCheck (COLUMNNAME_AmtAcctCr, AmtAcctCr);
}
/** Get Accounted Credit.
@return Accounted Credit Amount */
public BigDecimal getAmtAcctCr() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AmtAcctCr);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="aba52c80-2b58-effe-c90c-3d19db94af0c")
public static String es_PE_FIELD_Line_AccountedCredit_Name="Crédito Contabilizado";

@XendraTrl(Identifier="aba52c80-2b58-effe-c90c-3d19db94af0c")
public static String es_PE_FIELD_Line_AccountedCredit_Description="Total del crédito contabilizado";

@XendraTrl(Identifier="aba52c80-2b58-effe-c90c-3d19db94af0c")
public static String es_PE_FIELD_Line_AccountedCredit_Help="El total del crédito de la cuenta indica el total de la transacción convertido a esta transacción";

@XendraField(AD_Column_ID="AmtAcctCr",IsCentrallyMaintained=true,
AD_Tab_ID="c6932af9-e469-92d6-97c0-6ee36cbbc911",AD_FieldGroup_ID="Amounts",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=160,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="aba52c80-2b58-effe-c90c-3d19db94af0c")
public static final String FIELDNAME_Line_AccountedCredit="aba52c80-2b58-effe-c90c-3d19db94af0c";

@XendraTrl(Identifier="423a5cd6-e922-43bc-a9e8-05a3b5b7f9ac")
public static String es_PE_COLUMN_AmtAcctCr_Name="Crédito Contabilizado";

@XendraColumn(AD_Element_ID="945e7d70-99b5-5eaf-31ef-c5f460f7626c",ColumnName="AmtAcctCr",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="423a5cd6-e922-43bc-a9e8-05a3b5b7f9ac",
Synchronized="2019-08-30 22:22:36.0")
/** Column name AmtAcctCr */
public static final String COLUMNNAME_AmtAcctCr = "AmtAcctCr";
/** Set Accounted Debit.
@param AmtAcctDr Accounted Debit Amount */
public void setAmtAcctDr (BigDecimal AmtAcctDr)
{
if (AmtAcctDr == null) throw new IllegalArgumentException ("AmtAcctDr is mandatory.");
set_ValueNoCheck (COLUMNNAME_AmtAcctDr, AmtAcctDr);
}
/** Get Accounted Debit.
@return Accounted Debit Amount */
public BigDecimal getAmtAcctDr() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AmtAcctDr);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="d5907886-080e-3b9e-6748-a1570e540556")
public static String es_PE_FIELD_Line_AccountedDebit_Name="Débito Contabilizado";

@XendraTrl(Identifier="d5907886-080e-3b9e-6748-a1570e540556")
public static String es_PE_FIELD_Line_AccountedDebit_Description="Débito";

@XendraTrl(Identifier="d5907886-080e-3b9e-6748-a1570e540556")
public static String es_PE_FIELD_Line_AccountedDebit_Help="El total del debito de la cuenta indica el total de la transacción convertido a esta transacción";

@XendraField(AD_Column_ID="AmtAcctDr",IsCentrallyMaintained=true,
AD_Tab_ID="c6932af9-e469-92d6-97c0-6ee36cbbc911",AD_FieldGroup_ID="Amounts",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d5907886-080e-3b9e-6748-a1570e540556")
public static final String FIELDNAME_Line_AccountedDebit="d5907886-080e-3b9e-6748-a1570e540556";

@XendraTrl(Identifier="68e087ed-31c0-6967-b896-5b9c3b8f4c5b")
public static String es_PE_COLUMN_AmtAcctDr_Name="Débito Contabilizado";

@XendraColumn(AD_Element_ID="67410612-76a4-c113-8594-305f58926372",ColumnName="AmtAcctDr",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="68e087ed-31c0-6967-b896-5b9c3b8f4c5b",
Synchronized="2019-08-30 22:22:36.0")
/** Column name AmtAcctDr */
public static final String COLUMNNAME_AmtAcctDr = "AmtAcctDr";
/** Set Source Credit.
@param AmtSourceCr Source Credit Amount */
public void setAmtSourceCr (BigDecimal AmtSourceCr)
{
if (AmtSourceCr == null) throw new IllegalArgumentException ("AmtSourceCr is mandatory.");
set_Value (COLUMNNAME_AmtSourceCr, AmtSourceCr);
}
/** Get Source Credit.
@return Source Credit Amount */
public BigDecimal getAmtSourceCr() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AmtSourceCr);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="6188f46d-05a5-0b84-c175-a91debf9c371")
public static String es_PE_FIELD_Line_SourceCredit_Name="Abono";

@XendraTrl(Identifier="6188f46d-05a5-0b84-c175-a91debf9c371")
public static String es_PE_FIELD_Line_SourceCredit_Description="Total del Crédito en moneda fuente.";

@XendraTrl(Identifier="6188f46d-05a5-0b84-c175-a91debf9c371")
public static String es_PE_FIELD_Line_SourceCredit_Help="El Total crédito fuente indica el Total crédito para esta línea en la moneda fuente.";

@XendraField(AD_Column_ID="AmtSourceCr",IsCentrallyMaintained=true,
AD_Tab_ID="c6932af9-e469-92d6-97c0-6ee36cbbc911",AD_FieldGroup_ID="Amounts",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6188f46d-05a5-0b84-c175-a91debf9c371")
public static final String FIELDNAME_Line_SourceCredit="6188f46d-05a5-0b84-c175-a91debf9c371";

@XendraTrl(Identifier="140ee46b-dd9d-606c-7e38-8e2bf480b005")
public static String es_PE_COLUMN_AmtSourceCr_Name="Abono";

@XendraColumn(AD_Element_ID="37fc9554-00eb-5046-f770-46b9f63a1166",ColumnName="AmtSourceCr",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="org.compiere.model.CalloutGLJournal.amt",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="140ee46b-dd9d-606c-7e38-8e2bf480b005",Synchronized="2019-08-30 22:22:36.0")
/** Column name AmtSourceCr */
public static final String COLUMNNAME_AmtSourceCr = "AmtSourceCr";
/** Set Source Debit.
@param AmtSourceDr Source Debit Amount */
public void setAmtSourceDr (BigDecimal AmtSourceDr)
{
if (AmtSourceDr == null) throw new IllegalArgumentException ("AmtSourceDr is mandatory.");
set_Value (COLUMNNAME_AmtSourceDr, AmtSourceDr);
}
/** Get Source Debit.
@return Source Debit Amount */
public BigDecimal getAmtSourceDr() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AmtSourceDr);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="7339b69c-b866-96a5-e0b5-0aa4536688cb")
public static String es_PE_FIELD_Line_SourceDebit_Name="Cargo";

@XendraTrl(Identifier="7339b69c-b866-96a5-e0b5-0aa4536688cb")
public static String es_PE_FIELD_Line_SourceDebit_Description="Total del débito en moneda fuente";

@XendraTrl(Identifier="7339b69c-b866-96a5-e0b5-0aa4536688cb")
public static String es_PE_FIELD_Line_SourceDebit_Help="El total débito fuente indica el total debito para esta línea en la moneda fuente";

@XendraField(AD_Column_ID="AmtSourceDr",IsCentrallyMaintained=true,
AD_Tab_ID="c6932af9-e469-92d6-97c0-6ee36cbbc911",AD_FieldGroup_ID="Amounts",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7339b69c-b866-96a5-e0b5-0aa4536688cb")
public static final String FIELDNAME_Line_SourceDebit="7339b69c-b866-96a5-e0b5-0aa4536688cb";

@XendraTrl(Identifier="0e2484ba-bb38-133b-dee3-b21f1fa4312d")
public static String es_PE_COLUMN_AmtSourceDr_Name="Cargo";

@XendraColumn(AD_Element_ID="83234cfc-e73c-2419-af3c-afb9356f1f68",ColumnName="AmtSourceDr",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="org.compiere.model.CalloutGLJournal.amt",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="0e2484ba-bb38-133b-dee3-b21f1fa4312d",Synchronized="2019-08-30 22:22:36.0")
/** Column name AmtSourceDr */
public static final String COLUMNNAME_AmtSourceDr = "AmtSourceDr";
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

@XendraTrl(Identifier="4dfb0f49-4bd5-3380-fe8b-b1f2e091efdc")
public static String es_PE_FIELD_Line_BusinessPartner_Name="Socio de Negocio";

@XendraTrl(Identifier="4dfb0f49-4bd5-3380-fe8b-b1f2e091efdc")
public static String es_PE_FIELD_Line_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="4dfb0f49-4bd5-3380-fe8b-b1f2e091efdc")
public static String es_PE_FIELD_Line_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c6932af9-e469-92d6-97c0-6ee36cbbc911",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=190,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4dfb0f49-4bd5-3380-fe8b-b1f2e091efdc")
public static final String FIELDNAME_Line_BusinessPartner="4dfb0f49-4bd5-3380-fe8b-b1f2e091efdc";

@XendraTrl(Identifier="04158190-ec46-fc94-2011-bc8cb0072bff")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Business Partner ";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="04158190-ec46-fc94-2011-bc8cb0072bff",
Synchronized="2019-08-30 22:22:36.0")
/** Column name C_BPartner_ID */
public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
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

@XendraTrl(Identifier="c2e278d4-72cb-9a93-2d2c-de5a732202c1")
public static String es_PE_FIELD_Line_CurrencyType_Name="Tipo de Moneda";

@XendraTrl(Identifier="c2e278d4-72cb-9a93-2d2c-de5a732202c1")
public static String es_PE_FIELD_Line_CurrencyType_Description="Tipo de índice de conversión de moneda ";

@XendraTrl(Identifier="c2e278d4-72cb-9a93-2d2c-de5a732202c1")
public static String es_PE_FIELD_Line_CurrencyType_Help="El tipo del índice de conversión de monedas le deja definir diversos tipos de tarifas, tarifas ej. del punto, corporativas y/o de Ventas/Compras.";

@XendraField(AD_Column_ID="C_ConversionType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c6932af9-e469-92d6-97c0-6ee36cbbc911",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@C_Currency_ID@!@$C_Currency_ID@",DisplayLength=14,IsReadOnly=false,SeqNo=100,
SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="c2e278d4-72cb-9a93-2d2c-de5a732202c1")
public static final String FIELDNAME_Line_CurrencyType="c2e278d4-72cb-9a93-2d2c-de5a732202c1";

@XendraTrl(Identifier="9ac1194d-2f98-d99e-524b-281cff8e6856")
public static String es_PE_COLUMN_C_ConversionType_ID_Name="Tipo de Moneda";

@XendraColumn(AD_Element_ID="66f5d039-c94d-0957-487b-eb3118bd7719",
ColumnName="C_ConversionType_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="org.compiere.model.CalloutGLJournal.rate",VFormat="",ValueMin="",ValueMax="",Version="1",
IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9ac1194d-2f98-d99e-524b-281cff8e6856",
Synchronized="2019-08-30 22:22:36.0")
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

@XendraTrl(Identifier="cfabc7ba-f7fe-55a9-a463-eb378f8e474a")
public static String es_PE_FIELD_Line_Currency_Name="Moneda";

@XendraTrl(Identifier="cfabc7ba-f7fe-55a9-a463-eb378f8e474a")
public static String es_PE_FIELD_Line_Currency_Description="Moneda para este registro";

@XendraTrl(Identifier="cfabc7ba-f7fe-55a9-a463-eb378f8e474a")
public static String es_PE_FIELD_Line_Currency_Help="Indica la moneda a ser usada cuando se procese ó Informe este registro";

@XendraField(AD_Column_ID="C_Currency_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c6932af9-e469-92d6-97c0-6ee36cbbc911",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cfabc7ba-f7fe-55a9-a463-eb378f8e474a")
public static final String FIELDNAME_Line_Currency="cfabc7ba-f7fe-55a9-a463-eb378f8e474a";

@XendraTrl(Identifier="0cb18490-5a57-97f3-da45-471e2be160b8")
public static String es_PE_COLUMN_C_Currency_ID_Name="Moneda";

@XendraColumn(AD_Element_ID="8daec488-bca2-50fe-f9de-abf0cba2a34a",ColumnName="C_Currency_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="@C_Currency_ID@",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="org.compiere.model.CalloutGLJournal.rate",VFormat="",ValueMin="",ValueMax="",Version="1",
IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0cb18490-5a57-97f3-da45-471e2be160b8",
Synchronized="2019-08-30 22:22:36.0")
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

@XendraTrl(Identifier="bf62623b-5320-460f-9239-99a3b880760a")
public static String es_PE_FIELD_Line_DocumentType_Name="Tipo de Documento";

@XendraTrl(Identifier="bf62623b-5320-460f-9239-99a3b880760a")
public static String es_PE_FIELD_Line_DocumentType_Description="Tipo de documento ó reglas";

@XendraTrl(Identifier="bf62623b-5320-460f-9239-99a3b880760a")
public static String es_PE_FIELD_Line_DocumentType_Help="El tipo de documento determina la secuencia del documento y las reglas de proceso";

@XendraField(AD_Column_ID="C_DocType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c6932af9-e469-92d6-97c0-6ee36cbbc911",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=220,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2014-02-23 11:35:12.0",
Identifier="bf62623b-5320-460f-9239-99a3b880760a")
public static final String FIELDNAME_Line_DocumentType="bf62623b-5320-460f-9239-99a3b880760a";

@XendraTrl(Identifier="89cbabd5-7c70-49ef-acec-e476232cdca8")
public static String es_PE_COLUMN_C_DocType_ID_Name="Document Type";

@XendraColumn(AD_Element_ID="099a4147-1a72-cdd0-81e0-8bdbc8c0b883",ColumnName="C_DocType_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="89cbabd5-7c70-49ef-acec-e476232cdca8",
Synchronized="2019-08-30 22:22:36.0")
/** Column name C_DocType_ID */
public static final String COLUMNNAME_C_DocType_ID = "C_DocType_ID";
/** Set UOM.
@param C_UOM_ID Unit of Measure */
public void setC_UOM_ID (int C_UOM_ID)
{
if (C_UOM_ID <= 0) set_Value (COLUMNNAME_C_UOM_ID, null);
 else 
set_Value (COLUMNNAME_C_UOM_ID, Integer.valueOf(C_UOM_ID));
}
/** Get UOM.
@return Unit of Measure */
public int getC_UOM_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_UOM_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="a4b24c0d-83fa-b8d9-86cc-661e46080ba8")
public static String es_PE_FIELD_Line_UOM_Name="UM";

@XendraTrl(Identifier="a4b24c0d-83fa-b8d9-86cc-661e46080ba8")
public static String es_PE_FIELD_Line_UOM_Description="Unidad de Medida";

@XendraTrl(Identifier="a4b24c0d-83fa-b8d9-86cc-661e46080ba8")
public static String es_PE_FIELD_Line_UOM_Help="La UM define una unidad de medida única no monetaria";

@XendraField(AD_Column_ID="C_UOM_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c6932af9-e469-92d6-97c0-6ee36cbbc911",AD_FieldGroup_ID="Quantities",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a4b24c0d-83fa-b8d9-86cc-661e46080ba8")
public static final String FIELDNAME_Line_UOM="a4b24c0d-83fa-b8d9-86cc-661e46080ba8";

@XendraTrl(Identifier="425d7261-1850-d04b-a096-1a95ec6092df")
public static String es_PE_COLUMN_C_UOM_ID_Name="UM";

@XendraColumn(AD_Element_ID="d0345019-4fcc-44c8-4fd1-e38e3b4adeed",ColumnName="C_UOM_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="425d7261-1850-d04b-a096-1a95ec6092df",
Synchronized="2019-08-30 22:22:36.0")
/** Column name C_UOM_ID */
public static final String COLUMNNAME_C_UOM_ID = "C_UOM_ID";
/** Set Rate.
@param CurrencyRate Currency Conversion Rate */
public void setCurrencyRate (BigDecimal CurrencyRate)
{
if (CurrencyRate == null) throw new IllegalArgumentException ("CurrencyRate is mandatory.");
set_ValueNoCheck (COLUMNNAME_CurrencyRate, CurrencyRate);
}
/** Get Rate.
@return Currency Conversion Rate */
public BigDecimal getCurrencyRate() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CurrencyRate);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="b71f987c-15b2-cc64-c9b2-29ad7859b1ff")
public static String es_PE_FIELD_Line_Rate_Name="Tasa";

@XendraTrl(Identifier="b71f987c-15b2-cc64-c9b2-29ad7859b1ff")
public static String es_PE_FIELD_Line_Rate_Description="Tasa de Conversión de moneda.";

@XendraTrl(Identifier="b71f987c-15b2-cc64-c9b2-29ad7859b1ff")
public static String es_PE_FIELD_Line_Rate_Help="La tasa de conversión de moneda indica la tasa a ser usada cuando se convierte la moneda fuente a la moneda contable.";

@XendraField(AD_Column_ID="CurrencyRate",IsCentrallyMaintained=true,
AD_Tab_ID="c6932af9-e469-92d6-97c0-6ee36cbbc911",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@C_Currency_ID@!@$C_Currency_ID@",DisplayLength=26,IsReadOnly=true,SeqNo=110,
SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="b71f987c-15b2-cc64-c9b2-29ad7859b1ff")
public static final String FIELDNAME_Line_Rate="b71f987c-15b2-cc64-c9b2-29ad7859b1ff";

@XendraTrl(Identifier="84984f4c-2022-2cc4-5f51-57d4f5b3e704")
public static String es_PE_COLUMN_CurrencyRate_Name="Tasa";

@XendraColumn(AD_Element_ID="4289010b-fa36-c95f-6306-3182f48d2b0c",ColumnName="CurrencyRate",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="@CurrencyRate@;1",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="org.compiere.model.CalloutGLJournal.amt",VFormat="",ValueMin="",ValueMax="",Version="1",
IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="84984f4c-2022-2cc4-5f51-57d4f5b3e704",
Synchronized="2019-08-30 22:22:36.0")
/** Column name CurrencyRate */
public static final String COLUMNNAME_CurrencyRate = "CurrencyRate";
/** Set Combination.
@param C_ValidCombination_ID Valid Account Combination */
public void setC_ValidCombination_ID (int C_ValidCombination_ID)
{
if (C_ValidCombination_ID < 1) throw new IllegalArgumentException ("C_ValidCombination_ID is mandatory.");
set_Value (COLUMNNAME_C_ValidCombination_ID, Integer.valueOf(C_ValidCombination_ID));
}
/** Get Combination.
@return Valid Account Combination */
public int getC_ValidCombination_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_ValidCombination_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="2cca2019-6481-7271-9ba6-a6ffe31dba46")
public static String es_PE_FIELD_Line_Combination_Name="Combinación";

@XendraTrl(Identifier="2cca2019-6481-7271-9ba6-a6ffe31dba46")
public static String es_PE_FIELD_Line_Combination_Description="Combinación de Cuenta Válido";

@XendraTrl(Identifier="2cca2019-6481-7271-9ba6-a6ffe31dba46")
public static String es_PE_FIELD_Line_Combination_Help="La combinación identifica una combinación válida de elementos que representan una cuenta de Cg.";

@XendraField(AD_Column_ID="C_ValidCombination_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c6932af9-e469-92d6-97c0-6ee36cbbc911",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2cca2019-6481-7271-9ba6-a6ffe31dba46")
public static final String FIELDNAME_Line_Combination="2cca2019-6481-7271-9ba6-a6ffe31dba46";

@XendraTrl(Identifier="e4c72538-449f-b237-1a19-9e1ba8bafa2a")
public static String es_PE_COLUMN_C_ValidCombination_ID_Name="Combinación";

@XendraColumn(AD_Element_ID="7131fb8b-047a-8274-0958-0f2b91a7fd8a",
ColumnName="C_ValidCombination_ID",AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="e4c72538-449f-b237-1a19-9e1ba8bafa2a",Synchronized="2019-08-30 22:22:36.0")
/** Column name C_ValidCombination_ID */
public static final String COLUMNNAME_C_ValidCombination_ID = "C_ValidCombination_ID";
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

@XendraTrl(Identifier="4b8f56dc-602f-b5c8-e3af-a466a9c340bb")
public static String es_PE_FIELD_Line_AccountDate_Name="Fecha de Aplicación CG";

@XendraTrl(Identifier="4b8f56dc-602f-b5c8-e3af-a466a9c340bb")
public static String es_PE_FIELD_Line_AccountDate_Description="Fecha contable";

@XendraTrl(Identifier="4b8f56dc-602f-b5c8-e3af-a466a9c340bb")
public static String es_PE_FIELD_Line_AccountDate_Help="La fecha contable indica la fecha a ser usada en las cuentas de contabilidad general generadas desde este documento";

@XendraField(AD_Column_ID="DateAcct",IsCentrallyMaintained=true,
AD_Tab_ID="c6932af9-e469-92d6-97c0-6ee36cbbc911",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@C_Currency_ID@!@$C_Currency_ID@",DisplayLength=14,IsReadOnly=false,SeqNo=90,
SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="4b8f56dc-602f-b5c8-e3af-a466a9c340bb")
public static final String FIELDNAME_Line_AccountDate="4b8f56dc-602f-b5c8-e3af-a466a9c340bb";

@XendraTrl(Identifier="43bbef63-1c4c-cbe3-fed2-881dd1003f03")
public static String es_PE_COLUMN_DateAcct_Name="Fecha de Aplicación CG";

@XendraColumn(AD_Element_ID="034727d0-e80f-fadf-3d4f-2d8d37b75669",ColumnName="DateAcct",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,
DefaultValue="@DateAcct@",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="org.compiere.model.CalloutGLJournal.rate",VFormat="",ValueMin="",ValueMax="",Version="1",
IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="43bbef63-1c4c-cbe3-fed2-881dd1003f03",
Synchronized="2019-08-30 22:22:36.0")
/** Column name DateAcct */
public static final String COLUMNNAME_DateAcct = "DateAcct";
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

@XendraTrl(Identifier="d937952b-7fc4-b170-9d1c-baa52f432103")
public static String es_PE_FIELD_Line_Description_Name="Observación";

@XendraTrl(Identifier="d937952b-7fc4-b170-9d1c-baa52f432103")
public static String es_PE_FIELD_Line_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="d937952b-7fc4-b170-9d1c-baa52f432103")
public static String es_PE_FIELD_Line_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="c6932af9-e469-92d6-97c0-6ee36cbbc911",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d937952b-7fc4-b170-9d1c-baa52f432103")
public static final String FIELDNAME_Line_Description="d937952b-7fc4-b170-9d1c-baa52f432103";

@XendraTrl(Identifier="7a232eca-df81-2b5a-28c4-d7f83ce746c2")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7a232eca-df81-2b5a-28c4-d7f83ce746c2",
Synchronized="2019-08-30 22:22:36.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
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

@XendraTrl(Identifier="a28be5ad-65a4-63b4-95a0-660a4cfb6994")
public static String es_PE_FIELD_Line_Journal_Name="Póliza";

@XendraTrl(Identifier="a28be5ad-65a4-63b4-95a0-660a4cfb6994")
public static String es_PE_FIELD_Line_Journal_Description="Póliza";

@XendraTrl(Identifier="a28be5ad-65a4-63b4-95a0-660a4cfb6994")
public static String es_PE_FIELD_Line_Journal_Help="La póliza de la contabilidad general identifica un grupo de líneas de póliza que representa una transacción lógica del negocio.";

@XendraField(AD_Column_ID="GL_Journal_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c6932af9-e469-92d6-97c0-6ee36cbbc911",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a28be5ad-65a4-63b4-95a0-660a4cfb6994")
public static final String FIELDNAME_Line_Journal="a28be5ad-65a4-63b4-95a0-660a4cfb6994";

@XendraTrl(Identifier="bd78047b-54bc-6585-09d8-1060bb2d8120")
public static String es_PE_COLUMN_GL_Journal_ID_Name="Póliza";

@XendraColumn(AD_Element_ID="32802681-b859-1049-1622-21ea8c9a2474",ColumnName="GL_Journal_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bd78047b-54bc-6585-09d8-1060bb2d8120",
Synchronized="2019-08-30 22:22:36.0")
/** Column name GL_Journal_ID */
public static final String COLUMNNAME_GL_Journal_ID = "GL_Journal_ID";
/** Set Journal Line.
@param GL_JournalLine_ID General Ledger Journal Line */
public void setGL_JournalLine_ID (int GL_JournalLine_ID)
{
if (GL_JournalLine_ID < 1) throw new IllegalArgumentException ("GL_JournalLine_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_GL_JournalLine_ID, Integer.valueOf(GL_JournalLine_ID));
}
/** Get Journal Line.
@return General Ledger Journal Line */
public int getGL_JournalLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_GL_JournalLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="9082a1d0-0495-4f46-dfc1-e6839ea05539")
public static String es_PE_FIELD_Line_JournalLine_Name="Item de Póliza";

@XendraTrl(Identifier="9082a1d0-0495-4f46-dfc1-e6839ea05539")
public static String es_PE_FIELD_Line_JournalLine_Description="Item de la póliza";

@XendraTrl(Identifier="9082a1d0-0495-4f46-dfc1-e6839ea05539")
public static String es_PE_FIELD_Line_JournalLine_Help="Identifica una transacción simple en una póliza.";

@XendraField(AD_Column_ID="GL_JournalLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c6932af9-e469-92d6-97c0-6ee36cbbc911",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9082a1d0-0495-4f46-dfc1-e6839ea05539")
public static final String FIELDNAME_Line_JournalLine="9082a1d0-0495-4f46-dfc1-e6839ea05539";
/** Column name GL_JournalLine_ID */
public static final String COLUMNNAME_GL_JournalLine_ID = "GL_JournalLine_ID";
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
@XendraTrl(Identifier="f84e9930-5225-44d4-b5f5-4be0ed3def5b")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f84e9930-5225-44d4-b5f5-4be0ed3def5b",
Synchronized="2019-08-30 22:22:36.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Generated.
@param IsGenerated This Line is generated */
public void setIsGenerated (boolean IsGenerated)
{
set_ValueNoCheck (COLUMNNAME_IsGenerated, Boolean.valueOf(IsGenerated));
}
/** Get Generated.
@return This Line is generated */
public boolean isGenerated() 
{
Object oo = get_Value(COLUMNNAME_IsGenerated);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="bf617193-c0c5-cb2c-afd3-5c4a1bafa8ae")
public static String es_PE_FIELD_Line_Generated_Name="Generado";

@XendraTrl(Identifier="bf617193-c0c5-cb2c-afd3-5c4a1bafa8ae")
public static String es_PE_FIELD_Line_Generated_Description="Esta línea es generada";

@XendraTrl(Identifier="bf617193-c0c5-cb2c-afd3-5c4a1bafa8ae")
public static String es_PE_FIELD_Line_Generated_Help="El cuadro de verificación generado identifica una línea de póliza que fue generada desde un documento fuente. Las líneas podrían también ser introducidas manualmente ó importadas.";

@XendraField(AD_Column_ID="IsGenerated",IsCentrallyMaintained=true,
AD_Tab_ID="c6932af9-e469-92d6-97c0-6ee36cbbc911",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=70,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bf617193-c0c5-cb2c-afd3-5c4a1bafa8ae")
public static final String FIELDNAME_Line_Generated="bf617193-c0c5-cb2c-afd3-5c4a1bafa8ae";

@XendraTrl(Identifier="91b627a1-7228-bb2b-0796-ea75826f4402")
public static String es_PE_COLUMN_IsGenerated_Name="Generado";

@XendraColumn(AD_Element_ID="88727bdd-ffa1-9516-a955-2200e496a777",ColumnName="IsGenerated",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="91b627a1-7228-bb2b-0796-ea75826f4402",
Synchronized="2019-08-30 22:22:37.0")
/** Column name IsGenerated */
public static final String COLUMNNAME_IsGenerated = "IsGenerated";
/** Set IsPayment.
@param IsPayment IsPayment */
public void setIsPayment (boolean IsPayment)
{
set_Value (COLUMNNAME_IsPayment, Boolean.valueOf(IsPayment));
}
/** Get IsPayment.
@return IsPayment */
public boolean isPayment() 
{
Object oo = get_Value(COLUMNNAME_IsPayment);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="94ac7773-df6f-4112-ddb4-91c0c29bfbea")
public static String es_PE_FIELD_Line_IsPayment_Name="IsPayment";

@XendraField(AD_Column_ID="IsPayment",IsCentrallyMaintained=true,
AD_Tab_ID="c6932af9-e469-92d6-97c0-6ee36cbbc911",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="94ac7773-df6f-4112-ddb4-91c0c29bfbea")
public static final String FIELDNAME_Line_IsPayment="94ac7773-df6f-4112-ddb4-91c0c29bfbea";

@XendraTrl(Identifier="3f7aba04-3538-ffa0-f917-5d98a576c56b")
public static String es_PE_COLUMN_IsPayment_Name="IsPayment";

@XendraColumn(AD_Element_ID="6b41a758-6814-25ac-9d99-ce9378fc4bd2",ColumnName="IsPayment",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3f7aba04-3538-ffa0-f917-5d98a576c56b",
Synchronized="2019-08-30 22:22:37.0")
/** Column name IsPayment */
public static final String COLUMNNAME_IsPayment = "IsPayment";
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
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getLine()));
}

@XendraTrl(Identifier="465091eb-4f6d-3431-835e-db7324702c0b")
public static String es_PE_FIELD_Line_LineNo_Name="No. Línea";

@XendraTrl(Identifier="465091eb-4f6d-3431-835e-db7324702c0b")
public static String es_PE_FIELD_Line_LineNo_Description="No. Línea único para este documento";

@XendraTrl(Identifier="465091eb-4f6d-3431-835e-db7324702c0b")
public static String es_PE_FIELD_Line_LineNo_Help="Indica el No. Línea para un documento. También controlará el orden de despliegue de las líneas dentro de un documento";

@XendraField(AD_Column_ID="Line",IsCentrallyMaintained=true,
AD_Tab_ID="c6932af9-e469-92d6-97c0-6ee36cbbc911",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="465091eb-4f6d-3431-835e-db7324702c0b")
public static final String FIELDNAME_Line_LineNo="465091eb-4f6d-3431-835e-db7324702c0b";

@XendraTrl(Identifier="5e3a3ecc-b3b9-575a-db50-3f3a932c299a")
public static String es_PE_COLUMN_Line_Name="No. Línea";

@XendraColumn(AD_Element_ID="986ef077-61da-f9cf-1c6d-aefe3a35113b",ColumnName="Line",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="@SQL=SELECT COALESCE(MAX(Line),0)+10 AS DefaultValue FROM GL_JournalLine WHERE GL_Journal_ID=@GL_Journal_ID@",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5e3a3ecc-b3b9-575a-db50-3f3a932c299a",
Synchronized="2019-08-30 22:22:37.0")
/** Column name Line */
public static final String COLUMNNAME_Line = "Line";
/** Set Product.
@param M_Product_ID Product, Service, Item */
public void setM_Product_ID (int M_Product_ID)
{
if (M_Product_ID <= 0) set_Value (COLUMNNAME_M_Product_ID, null);
 else 
set_Value (COLUMNNAME_M_Product_ID, Integer.valueOf(M_Product_ID));
}
/** Get Product.
@return Product, Service, Item */
public int getM_Product_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Product_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="974979c4-8a9c-4afb-9590-aa661e26c414")
public static String es_PE_FIELD_Line_Product_Name="Producto";

@XendraTrl(Identifier="974979c4-8a9c-4afb-9590-aa661e26c414")
public static String es_PE_FIELD_Line_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="974979c4-8a9c-4afb-9590-aa661e26c414")
public static String es_PE_FIELD_Line_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c6932af9-e469-92d6-97c0-6ee36cbbc911",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2014-02-23 11:35:12.0",
Identifier="974979c4-8a9c-4afb-9590-aa661e26c414")
public static final String FIELDNAME_Line_Product="974979c4-8a9c-4afb-9590-aa661e26c414";

@XendraTrl(Identifier="0e35fec6-c9a0-440c-b1a5-73eb9c411f79")
public static String es_PE_COLUMN_M_Product_ID_Name="Product";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0e35fec6-c9a0-440c-b1a5-73eb9c411f79",
Synchronized="2019-08-30 22:22:37.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
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

@XendraTrl(Identifier="0bbff12d-b774-a918-7826-7424b01b97b6")
public static String es_PE_FIELD_Line_Processed_Name="Procesado";

@XendraTrl(Identifier="0bbff12d-b774-a918-7826-7424b01b97b6")
public static String es_PE_FIELD_Line_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="0bbff12d-b774-a918-7826-7424b01b97b6")
public static String es_PE_FIELD_Line_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="c6932af9-e469-92d6-97c0-6ee36cbbc911",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0bbff12d-b774-a918-7826-7424b01b97b6")
public static final String FIELDNAME_Line_Processed="0bbff12d-b774-a918-7826-7424b01b97b6";

@XendraTrl(Identifier="a71341e6-ea23-072c-bcb2-1cbdb891da6c")
public static String es_PE_COLUMN_Processed_Name="Procesado";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a71341e6-ea23-072c-bcb2-1cbdb891da6c",
Synchronized="2019-08-30 22:22:37.0")
/** Column name Processed */
public static final String COLUMNNAME_Processed = "Processed";
/** Set Quantity.
@param Qty Quantity */
public void setQty (BigDecimal Qty)
{
set_Value (COLUMNNAME_Qty, Qty);
}
/** Get Quantity.
@return Quantity */
public BigDecimal getQty() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Qty);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="4e69c7a2-0ed2-0923-8e89-1d1a7f6ca289")
public static String es_PE_FIELD_Line_Quantity_Name="Cantidad";

@XendraTrl(Identifier="4e69c7a2-0ed2-0923-8e89-1d1a7f6ca289")
public static String es_PE_FIELD_Line_Quantity_Description="Cantidad";

@XendraTrl(Identifier="4e69c7a2-0ed2-0923-8e89-1d1a7f6ca289")
public static String es_PE_FIELD_Line_Quantity_Help="La Cantidad indica el número de un producto específico o artículo para este documento";

@XendraField(AD_Column_ID="Qty",IsCentrallyMaintained=true,
AD_Tab_ID="c6932af9-e469-92d6-97c0-6ee36cbbc911",AD_FieldGroup_ID="Quantities",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4e69c7a2-0ed2-0923-8e89-1d1a7f6ca289")
public static final String FIELDNAME_Line_Quantity="4e69c7a2-0ed2-0923-8e89-1d1a7f6ca289";

@XendraTrl(Identifier="b5825a8b-b290-1dda-42fe-987a0ad67973")
public static String es_PE_COLUMN_Qty_Name="Cantidad";

@XendraColumn(AD_Element_ID="c9d74a25-87c5-9592-5660-4f397607dad3",ColumnName="Qty",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b5825a8b-b290-1dda-42fe-987a0ad67973",
Synchronized="2019-08-30 22:22:37.0")
/** Column name Qty */
public static final String COLUMNNAME_Qty = "Qty";
/** Set Reference No.
@param ReferenceNo Your customer or vendor number at the Business Partner's site */
public void setReferenceNo (String ReferenceNo)
{
if (ReferenceNo != null && ReferenceNo.length() > 40)
{
log.warning("Length > 40 - truncated");
ReferenceNo = ReferenceNo.substring(0,39);
}
set_Value (COLUMNNAME_ReferenceNo, ReferenceNo);
}
/** Get Reference No.
@return Your customer or vendor number at the Business Partner's site */
public String getReferenceNo() 
{
String value = (String)get_Value(COLUMNNAME_ReferenceNo);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="fe45cfab-3606-9e90-28fc-1568a84826a4")
public static String es_PE_FIELD_Line_ReferenceNo_Name="No. de Referencia";

@XendraTrl(Identifier="fe45cfab-3606-9e90-28fc-1568a84826a4")
public static String es_PE_FIELD_Line_ReferenceNo_Description="Su número de cliente ó proveedor con el socio de negocio.";

@XendraTrl(Identifier="fe45cfab-3606-9e90-28fc-1568a84826a4")
public static String es_PE_FIELD_Line_ReferenceNo_Help="El número de referencia puede ser impreso en órdenes y facturas para permitirle a su socio de negocio identificar más rápido sus registros.";

@XendraField(AD_Column_ID="ReferenceNo",IsCentrallyMaintained=true,
AD_Tab_ID="c6932af9-e469-92d6-97c0-6ee36cbbc911",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=200,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fe45cfab-3606-9e90-28fc-1568a84826a4")
public static final String FIELDNAME_Line_ReferenceNo="fe45cfab-3606-9e90-28fc-1568a84826a4";

@XendraTrl(Identifier="40f45cd6-f8eb-8f70-b865-e7f0cf08eee1")
public static String es_PE_COLUMN_ReferenceNo_Name="Reference No";

@XendraColumn(AD_Element_ID="87d37906-4977-97f1-29f1-85a654abe404",ColumnName="ReferenceNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="40f45cd6-f8eb-8f70-b865-e7f0cf08eee1",
Synchronized="2019-08-30 22:22:37.0")
/** Column name ReferenceNo */
public static final String COLUMNNAME_ReferenceNo = "ReferenceNo";
/** Set Document Serial.
@param Serial Serial Number for the Document */
public void setSerial (String Serial)
{
if (Serial != null && Serial.length() > 10)
{
log.warning("Length > 10 - truncated");
Serial = Serial.substring(0,9);
}
set_Value (COLUMNNAME_Serial, Serial);
}
/** Get Document Serial.
@return Serial Number for the Document */
public String getSerial() 
{
String value = (String)get_Value(COLUMNNAME_Serial);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="46394e51-5d7a-4475-b62b-027e97260b81")
public static String en_GB_FIELD_Line_DocumentSerial_Name="Document Serial";

@XendraTrl(Identifier="46394e51-5d7a-4475-b62b-027e97260b81")
public static String es_PE_FIELD_Line_DocumentSerial_Name="Serie del Documento";

@XendraTrl(Identifier="46394e51-5d7a-4475-b62b-027e97260b81")
public static String en_GB_FIELD_Line_DocumentSerial_Description="Serial Number for the Document";

@XendraTrl(Identifier="46394e51-5d7a-4475-b62b-027e97260b81")
public static String es_PE_FIELD_Line_DocumentSerial_Description="Serie del Documento";

@XendraTrl(Identifier="46394e51-5d7a-4475-b62b-027e97260b81")
public static String en_GB_FIELD_Line_DocumentSerial_Help="In some countries, documents have a serial in adition to it's number. Also, every serial has an independent sequence.";

@XendraTrl(Identifier="46394e51-5d7a-4475-b62b-027e97260b81")
public static String es_PE_FIELD_Line_DocumentSerial_Help="En algunos paises, los documentos tienen una serie ademas de su numero. Ademas, cada serie tiene una numeracion independiente.";

@XendraField(AD_Column_ID="Serial",IsCentrallyMaintained=true,
AD_Tab_ID="c6932af9-e469-92d6-97c0-6ee36cbbc911",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=210,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2014-02-23 11:35:12.0",
Identifier="46394e51-5d7a-4475-b62b-027e97260b81")
public static final String FIELDNAME_Line_DocumentSerial="46394e51-5d7a-4475-b62b-027e97260b81";

@XendraTrl(Identifier="f8a4653b-8bfd-bf4b-5810-cd97195dc887")
public static String es_PE_COLUMN_Serial_Name="Document Serial";

@XendraColumn(AD_Element_ID="56277733-3963-25db-320e-99e754ca1e9c",ColumnName="Serial",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f8a4653b-8bfd-bf4b-5810-cd97195dc887",
Synchronized="2019-08-30 22:22:37.0")
/** Column name Serial */
public static final String COLUMNNAME_Serial = "Serial";
}
