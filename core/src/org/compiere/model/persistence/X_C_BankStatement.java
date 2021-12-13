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
/** Generated Model for C_BankStatement
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_BankStatement extends PO
{
/** Standard Constructor
@param ctx context
@param C_BankStatement_ID id
@param trxName transaction
*/
public X_C_BankStatement (Properties ctx, int C_BankStatement_ID, String trxName)
{
super (ctx, C_BankStatement_ID, trxName);
/** if (C_BankStatement_ID == 0)
{
setC_BankAccount_ID (0);
setC_BankStatement_ID (0);
setDocAction (null);	
// CO
setDocStatus (null);	
// DR
setEndingBalance (Env.ZERO);	
// 0
setIsApproved (false);	
// N
setIsManual (true);	
// Y
setName (null);	
// @#Date@
setPosted (false);	
// N
setProcessed (false);	
// N
setStatementDate (new Timestamp(System.currentTimeMillis()));	
// @Date@
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_BankStatement (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=392 */
public static int Table_ID=MTable.getTable_ID("C_BankStatement");

@XendraTrl(Identifier="9cc403d8-904f-2915-d309-726641539417")
public static String es_PE_TAB_BankStatement_Description="Estado de Cuentas Bancario";

@XendraTrl(Identifier="9cc403d8-904f-2915-d309-726641539417")
public static String es_PE_TAB_BankStatement_Help="La pestaña Edo. de Cuentas define el estado de cuentas bancario que va a ser conciliado.";

@XendraTrl(Identifier="9cc403d8-904f-2915-d309-726641539417")
public static String es_PE_TAB_BankStatement_Name="Edo. de Cuentas";

@XendraTab(Name="Bank Statement",Description="Bank Statement",
Help="The Bank Statement Tab defines the Bank Statement to be reconciled.",
AD_Window_ID="5b26c020-cbec-1897-1781-73fd519089d4",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="9cc403d8-904f-2915-d309-726641539417",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_BankStatement="9cc403d8-904f-2915-d309-726641539417";

@XendraTrl(Identifier="501f1568-8b7c-6a73-fb58-7ba3a65072a5")
public static String es_PE_TABLE_C_BankStatement_Name="Balance Bancario";

@XendraTable(Name="Bank Statement",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Bank Statement of account",
Help="",TableName="C_BankStatement",AccessLevel="3",
AD_Window_ID="5b26c020-cbec-1897-1781-73fd519089d4",AD_Val_Rule_ID="",IsKey=1,LoadSeq=135,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.commercial",Identifier="501f1568-8b7c-6a73-fb58-7ba3a65072a5",
Synchronized="2020-03-03 21:36:26.0")
/** TableName=C_BankStatement */
public static final String Table_Name="C_BankStatement";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_BankStatement");

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
    Table_ID = MTable.getTable_ID("C_BankStatement");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_BankStatement[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Beginning Balance.
@param BeginningBalance Balance prior to any transactions */
public void setBeginningBalance (BigDecimal BeginningBalance)
{
set_Value (COLUMNNAME_BeginningBalance, BeginningBalance);
}
/** Get Beginning Balance.
@return Balance prior to any transactions */
public BigDecimal getBeginningBalance() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_BeginningBalance);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="be7d6ebe-3c0b-64b7-b6c7-ea5c9a04b591")
public static String es_PE_FIELD_BankStatement_BeginningBalance_Name="Saldo Inicial";

@XendraTrl(Identifier="be7d6ebe-3c0b-64b7-b6c7-ea5c9a04b591")
public static String es_PE_FIELD_BankStatement_BeginningBalance_Description="Saldo anterior a cualquier transacción";

@XendraTrl(Identifier="be7d6ebe-3c0b-64b7-b6c7-ea5c9a04b591")
public static String es_PE_FIELD_BankStatement_BeginningBalance_Help="El saldo Inicial es el saldo anterior a hacer cualquier ajuste a los pagos ó desembolsos.";

@XendraField(AD_Column_ID="BeginningBalance",IsCentrallyMaintained=true,
AD_Tab_ID="9cc403d8-904f-2915-d309-726641539417",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="be7d6ebe-3c0b-64b7-b6c7-ea5c9a04b591")
public static final String FIELDNAME_BankStatement_BeginningBalance="be7d6ebe-3c0b-64b7-b6c7-ea5c9a04b591";

@XendraTrl(Identifier="7d7c640a-d1a4-f995-37f3-4c291245186a")
public static String es_PE_COLUMN_BeginningBalance_Name="Saldo Inicial";

@XendraColumn(AD_Element_ID="de1a5546-dd89-8879-f8ba-d6afe929dbd6",ColumnName="BeginningBalance",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="@SQL=SELECT COALESCE(MIN(CurrentBalance),0) FROM C_BankAccount WHERE C_BankAccount_ID=@C_BankAccount_ID@",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7d7c640a-d1a4-f995-37f3-4c291245186a",
Synchronized="2019-08-30 22:21:04.0")
/** Column name BeginningBalance */
public static final String COLUMNNAME_BeginningBalance = "BeginningBalance";
/** Set Bank Account.
@param C_BankAccount_ID Account at the Bank */
public void setC_BankAccount_ID (int C_BankAccount_ID)
{
if (C_BankAccount_ID < 1) throw new IllegalArgumentException ("C_BankAccount_ID is mandatory.");
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

@XendraTrl(Identifier="b918866f-5f75-4a50-2d10-863309590acf")
public static String es_PE_FIELD_BankStatement_BankAccount_Name="Cuenta Bancaria";

@XendraTrl(Identifier="b918866f-5f75-4a50-2d10-863309590acf")
public static String es_PE_FIELD_BankStatement_BankAccount_Description="Cuenta bancaria";

@XendraTrl(Identifier="b918866f-5f75-4a50-2d10-863309590acf")
public static String es_PE_FIELD_BankStatement_BankAccount_Help="La cuenta bancaria identifica una cuenta en este banco";

@XendraField(AD_Column_ID="C_BankAccount_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9cc403d8-904f-2915-d309-726641539417",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b918866f-5f75-4a50-2d10-863309590acf")
public static final String FIELDNAME_BankStatement_BankAccount="b918866f-5f75-4a50-2d10-863309590acf";

@XendraTrl(Identifier="931a5e29-9783-fdd1-d54b-99e334637af6")
public static String es_PE_COLUMN_C_BankAccount_ID_Name="Cuenta Bancaria";

@XendraColumn(AD_Element_ID="5a03bc67-316f-bd8c-9e68-b009ad1b290b",ColumnName="C_BankAccount_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="org.compiere.model.CalloutBankStatement.bankAccount",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="931a5e29-9783-fdd1-d54b-99e334637af6",
Synchronized="2019-08-30 22:21:04.0")
/** Column name C_BankAccount_ID */
public static final String COLUMNNAME_C_BankAccount_ID = "C_BankAccount_ID";
/** Set Bank Statement.
@param C_BankStatement_ID Bank Statement of account */
public void setC_BankStatement_ID (int C_BankStatement_ID)
{
if (C_BankStatement_ID < 1) throw new IllegalArgumentException ("C_BankStatement_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_BankStatement_ID, Integer.valueOf(C_BankStatement_ID));
}
/** Get Bank Statement.
@return Bank Statement of account */
public int getC_BankStatement_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BankStatement_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="db303313-5bed-4cc7-1205-2a7bd918af4e")
public static String es_PE_FIELD_BankStatement_BankStatement_Name="Balance Bancario";

@XendraTrl(Identifier="db303313-5bed-4cc7-1205-2a7bd918af4e")
public static String es_PE_FIELD_BankStatement_BankStatement_Description="Balance bancario de la cuenta";

@XendraTrl(Identifier="db303313-5bed-4cc7-1205-2a7bd918af4e")
public static String es_PE_FIELD_BankStatement_BankStatement_Help="El balance bancario identifica un balance único para un período de tiempo definido. El balance lista todas las transacciones que han ocurrido";

@XendraField(AD_Column_ID="C_BankStatement_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9cc403d8-904f-2915-d309-726641539417",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="db303313-5bed-4cc7-1205-2a7bd918af4e")
public static final String FIELDNAME_BankStatement_BankStatement="db303313-5bed-4cc7-1205-2a7bd918af4e";
/** Column name C_BankStatement_ID */
public static final String COLUMNNAME_C_BankStatement_ID = "C_BankStatement_ID";
/** Set Create lines from.
@param CreateFrom Process which will generate a new document lines based on an existing document */
public void setCreateFrom (String CreateFrom)
{
if (CreateFrom != null && CreateFrom.length() > 1)
{
log.warning("Length > 1 - truncated");
CreateFrom = CreateFrom.substring(0,0);
}
set_Value (COLUMNNAME_CreateFrom, CreateFrom);
}
/** Get Create lines from.
@return Process which will generate a new document lines based on an existing document */
public String getCreateFrom() 
{
return (String)get_Value(COLUMNNAME_CreateFrom);
}

@XendraTrl(Identifier="1742bf50-f7c9-b900-1ad6-b643953d3f72")
public static String es_PE_FIELD_BankStatement_CreateLinesFrom_Name="Crear Desde";

@XendraTrl(Identifier="1742bf50-f7c9-b900-1ad6-b643953d3f72")
public static String es_PE_FIELD_BankStatement_CreateLinesFrom_Description="Proceso que generará un nuevo documento";

@XendraTrl(Identifier="1742bf50-f7c9-b900-1ad6-b643953d3f72")
public static String es_PE_FIELD_BankStatement_CreateLinesFrom_Help="El proceso crear desde creará un nuevo documento basado en información de un documento existente seleccionado por el usuario";

@XendraField(AD_Column_ID="CreateFrom",IsCentrallyMaintained=true,
AD_Tab_ID="9cc403d8-904f-2915-d309-726641539417",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1742bf50-f7c9-b900-1ad6-b643953d3f72")
public static final String FIELDNAME_BankStatement_CreateLinesFrom="1742bf50-f7c9-b900-1ad6-b643953d3f72";

@XendraTrl(Identifier="44709a18-4c4b-5c33-8e2e-a5173dc79579")
public static String es_PE_COLUMN_CreateFrom_Name="Crear Desde";

@XendraColumn(AD_Element_ID="7fccccce-83dd-9c79-faa2-d4675bdb0e1c",ColumnName="CreateFrom",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="44709a18-4c4b-5c33-8e2e-a5173dc79579",
Synchronized="2019-08-30 22:21:04.0")
/** Column name CreateFrom */
public static final String COLUMNNAME_CreateFrom = "CreateFrom";
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

@XendraTrl(Identifier="054c3f4c-8eb0-7812-faff-4e23afef60d8")
public static String es_PE_FIELD_BankStatement_Description_Name="Observacion";

@XendraTrl(Identifier="054c3f4c-8eb0-7812-faff-4e23afef60d8")
public static String es_PE_FIELD_BankStatement_Description_Description="Descripción corta opcional del registro";

@XendraTrl(Identifier="054c3f4c-8eb0-7812-faff-4e23afef60d8")
public static String es_PE_FIELD_BankStatement_Description_Help="Una descripción esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="9cc403d8-904f-2915-d309-726641539417",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="054c3f4c-8eb0-7812-faff-4e23afef60d8")
public static final String FIELDNAME_BankStatement_Description="054c3f4c-8eb0-7812-faff-4e23afef60d8";

@XendraTrl(Identifier="3f653087-33ea-8d2c-cf24-b160f77040aa")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=true,ColumnSQL="",
IsAllowLogging=false,Identifier="3f653087-33ea-8d2c-cf24-b160f77040aa",
Synchronized="2019-08-30 22:21:04.0")
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

@XendraTrl(Identifier="27451fcf-c812-7076-8d6c-180a023a5733")
public static String es_PE_FIELD_BankStatement_ProcessStatement_Name="Procesar Conciliación";

@XendraField(AD_Column_ID="DocAction",IsCentrallyMaintained=true,
AD_Tab_ID="9cc403d8-904f-2915-d309-726641539417",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="27451fcf-c812-7076-8d6c-180a023a5733")
public static final String FIELDNAME_BankStatement_ProcessStatement="27451fcf-c812-7076-8d6c-180a023a5733";

@XendraTrl(Identifier="aa1f26f5-e116-b957-fcb3-54adb373c2f1")
public static String es_PE_COLUMN_DocAction_Name="Acción en el Documento";

@XendraColumn(AD_Element_ID="d4b9075b-18e5-ebbb-5565-d217a7e531cb",ColumnName="DocAction",
AD_Reference_ID=28,AD_Reference_Value_ID="e397c9b0-c643-d1cd-8380-20bee13b2a6e",AD_Val_Rule_ID="",
FieldLength=2,DefaultValue="CO",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,
AD_Process_ID="8d6273b5-ec9d-6708-5b18-cd22b6009963",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="aa1f26f5-e116-b957-fcb3-54adb373c2f1",
Synchronized="2019-08-30 22:21:04.0")
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

@XendraTrl(Identifier="58586191-60ec-a320-b19a-f74d0b641997")
public static String es_PE_FIELD_BankStatement_DocumentStatus_Name="Estado del Documento";

@XendraTrl(Identifier="58586191-60ec-a320-b19a-f74d0b641997")
public static String es_PE_FIELD_BankStatement_DocumentStatus_Description="El estado actual del documento";

@XendraTrl(Identifier="58586191-60ec-a320-b19a-f74d0b641997")
public static String es_PE_FIELD_BankStatement_DocumentStatus_Help="El estado del documento indica el estado del documento en este momento. Si usted quiere cambiar el estado de Documento; use el campo acción de documento";

@XendraField(AD_Column_ID="DocStatus",IsCentrallyMaintained=true,
AD_Tab_ID="9cc403d8-904f-2915-d309-726641539417",AD_FieldGroup_ID="Status",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=170,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="58586191-60ec-a320-b19a-f74d0b641997")
public static final String FIELDNAME_BankStatement_DocumentStatus="58586191-60ec-a320-b19a-f74d0b641997";

@XendraTrl(Identifier="243f765a-6a82-59cb-f246-93760a9aa870")
public static String es_PE_COLUMN_DocStatus_Name="Estado del Documento";

@XendraColumn(AD_Element_ID="e73fa537-3438-bd01-dfd4-f0f080a28c55",ColumnName="DocStatus",
AD_Reference_ID=17,AD_Reference_Value_ID="7627125d-fefe-e6bc-bb7d-4a6c772172dc",AD_Val_Rule_ID="",
FieldLength=2,DefaultValue="DR",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="243f765a-6a82-59cb-f246-93760a9aa870",Synchronized="2019-08-30 22:21:04.0")
/** Column name DocStatus */
public static final String COLUMNNAME_DocStatus = "DocStatus";
/** Set EFT Statement Date.
@param EftStatementDate Electronic Funds Transfer Statement Date */
public void setEftStatementDate (Timestamp EftStatementDate)
{
set_Value (COLUMNNAME_EftStatementDate, EftStatementDate);
}
/** Get EFT Statement Date.
@return Electronic Funds Transfer Statement Date */
public Timestamp getEftStatementDate() 
{
return (Timestamp)get_Value(COLUMNNAME_EftStatementDate);
}

@XendraTrl(Identifier="5e2448e1-6010-daf7-76ca-d99c2665be27")
public static String es_PE_FIELD_BankStatement_EFTStatementDate_Name="Estado de la TEF a la Fecha";

@XendraTrl(Identifier="5e2448e1-6010-daf7-76ca-d99c2665be27")
public static String es_PE_FIELD_BankStatement_EFTStatementDate_Description="Fecha de declaración de la transferencia electrónica de fondos.";

@XendraTrl(Identifier="5e2448e1-6010-daf7-76ca-d99c2665be27")
public static String es_PE_FIELD_BankStatement_EFTStatementDate_Help="Información de medios de transferencia electronica de fondos.";

@XendraField(AD_Column_ID="EftStatementDate",IsCentrallyMaintained=true,
AD_Tab_ID="9cc403d8-904f-2915-d309-726641539417",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=160,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5e2448e1-6010-daf7-76ca-d99c2665be27")
public static final String FIELDNAME_BankStatement_EFTStatementDate="5e2448e1-6010-daf7-76ca-d99c2665be27";

@XendraTrl(Identifier="ec3b78df-aebc-2dd6-3560-86f05f9e7811")
public static String es_PE_COLUMN_EftStatementDate_Name="Estado de la TEF a la Fecha";

@XendraColumn(AD_Element_ID="a4b71dc9-2e83-d982-b586-06a6e5cee7cb",ColumnName="EftStatementDate",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ec3b78df-aebc-2dd6-3560-86f05f9e7811",
Synchronized="2019-08-30 22:21:04.0")
/** Column name EftStatementDate */
public static final String COLUMNNAME_EftStatementDate = "EftStatementDate";
/** Set EFT Statement Reference.
@param EftStatementReference Electronic Funds Transfer Statement Reference */
public void setEftStatementReference (String EftStatementReference)
{
if (EftStatementReference != null && EftStatementReference.length() > 60)
{
log.warning("Length > 60 - truncated");
EftStatementReference = EftStatementReference.substring(0,59);
}
set_Value (COLUMNNAME_EftStatementReference, EftStatementReference);
}
/** Get EFT Statement Reference.
@return Electronic Funds Transfer Statement Reference */
public String getEftStatementReference() 
{
String value = (String)get_Value(COLUMNNAME_EftStatementReference);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="255d66e4-aa80-6704-45a5-bc77a7f57b3f")
public static String es_PE_FIELD_BankStatement_EFTStatementReference_Name="Referencia Estado de la TEF";

@XendraTrl(Identifier="255d66e4-aa80-6704-45a5-bc77a7f57b3f")
public static String es_PE_FIELD_BankStatement_EFTStatementReference_Description="Referencia del Estado de la Transferencia Electronica de Fondos";

@XendraTrl(Identifier="255d66e4-aa80-6704-45a5-bc77a7f57b3f")
public static String es_PE_FIELD_BankStatement_EFTStatementReference_Help="Información de medios de TEF.";

@XendraField(AD_Column_ID="EftStatementReference",IsCentrallyMaintained=true,
AD_Tab_ID="9cc403d8-904f-2915-d309-726641539417",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="255d66e4-aa80-6704-45a5-bc77a7f57b3f")
public static final String FIELDNAME_BankStatement_EFTStatementReference="255d66e4-aa80-6704-45a5-bc77a7f57b3f";

@XendraTrl(Identifier="bd4e73e7-3edb-26cb-9f4e-1d52848fb158")
public static String es_PE_COLUMN_EftStatementReference_Name="Referencia Estado de la TEF";

@XendraColumn(AD_Element_ID="aaf88f06-39df-784d-a34c-bae2a723ee8f",
ColumnName="EftStatementReference",AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=60,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="bd4e73e7-3edb-26cb-9f4e-1d52848fb158",Synchronized="2019-08-30 22:21:04.0")
/** Column name EftStatementReference */
public static final String COLUMNNAME_EftStatementReference = "EftStatementReference";
/** Set Ending balance.
@param EndingBalance Ending  or closing balance */
public void setEndingBalance (BigDecimal EndingBalance)
{
if (EndingBalance == null) throw new IllegalArgumentException ("EndingBalance is mandatory.");
set_Value (COLUMNNAME_EndingBalance, EndingBalance);
}
/** Get Ending balance.
@return Ending  or closing balance */
public BigDecimal getEndingBalance() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_EndingBalance);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="a6a0a4cf-90b7-504f-d175-e952286704e2")
public static String es_PE_FIELD_BankStatement_EndingBalance_Name="Saldo Final";

@XendraTrl(Identifier="a6a0a4cf-90b7-504f-d175-e952286704e2")
public static String es_PE_FIELD_BankStatement_EndingBalance_Description="Saldo final ó al cierre";

@XendraTrl(Identifier="a6a0a4cf-90b7-504f-d175-e952286704e2")
public static String es_PE_FIELD_BankStatement_EndingBalance_Help="El saldo final es el resultado de ajustar el saldo Inicial por cualquier pago ó desembolso.";

@XendraField(AD_Column_ID="EndingBalance",IsCentrallyMaintained=true,
AD_Tab_ID="9cc403d8-904f-2915-d309-726641539417",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a6a0a4cf-90b7-504f-d175-e952286704e2")
public static final String FIELDNAME_BankStatement_EndingBalance="a6a0a4cf-90b7-504f-d175-e952286704e2";

@XendraTrl(Identifier="d1c64fb9-3ede-f3e0-6e3a-23cef84dcf65")
public static String es_PE_COLUMN_EndingBalance_Name="Saldo Final";

@XendraColumn(AD_Element_ID="43c64e50-5b53-2d2d-5fb4-7b5d31e3c043",ColumnName="EndingBalance",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d1c64fb9-3ede-f3e0-6e3a-23cef84dcf65",
Synchronized="2019-08-30 22:21:04.0")
/** Column name EndingBalance */
public static final String COLUMNNAME_EndingBalance = "EndingBalance";
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
@XendraTrl(Identifier="d8a4bd0f-d9ca-4b53-b9f6-2ceb69e7b36f")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d8a4bd0f-d9ca-4b53-b9f6-2ceb69e7b36f",
Synchronized="2019-08-30 22:21:04.0")
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

@XendraTrl(Identifier="8e7b3fc5-a29c-84f5-916b-1b90d4999e0b")
public static String es_PE_FIELD_BankStatement_Approved_Name="Aprobación";

@XendraTrl(Identifier="8e7b3fc5-a29c-84f5-916b-1b90d4999e0b")
public static String es_PE_FIELD_BankStatement_Approved_Description="Indica si este documento requiere aprobación";

@XendraTrl(Identifier="8e7b3fc5-a29c-84f5-916b-1b90d4999e0b")
public static String es_PE_FIELD_BankStatement_Approved_Help="El Cuadro de Verificación  Aprobado indica si este documento requiere aprobación antes de que pueda ser procesado";

@XendraField(AD_Column_ID="IsApproved",IsCentrallyMaintained=true,
AD_Tab_ID="9cc403d8-904f-2915-d309-726641539417",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=190,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8e7b3fc5-a29c-84f5-916b-1b90d4999e0b")
public static final String FIELDNAME_BankStatement_Approved="8e7b3fc5-a29c-84f5-916b-1b90d4999e0b";

@XendraTrl(Identifier="eb48f753-a4da-bd87-bed4-ba6e569b9505")
public static String es_PE_COLUMN_IsApproved_Name="Aprobación";

@XendraColumn(AD_Element_ID="44388d99-07b7-b005-9e16-78884800beff",ColumnName="IsApproved",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="eb48f753-a4da-bd87-bed4-ba6e569b9505",
Synchronized="2019-08-30 22:21:04.0")
/** Column name IsApproved */
public static final String COLUMNNAME_IsApproved = "IsApproved";
/** Set Manual.
@param IsManual This is a manual process */
public void setIsManual (boolean IsManual)
{
set_Value (COLUMNNAME_IsManual, Boolean.valueOf(IsManual));
}
/** Get Manual.
@return This is a manual process */
public boolean isManual() 
{
Object oo = get_Value(COLUMNNAME_IsManual);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="9aa49640-83e5-34aa-6c43-edb5b64822cc")
public static String es_PE_FIELD_BankStatement_Manual_Name="Manual";

@XendraTrl(Identifier="9aa49640-83e5-34aa-6c43-edb5b64822cc")
public static String es_PE_FIELD_BankStatement_Manual_Description="Éste es un proceso manual.";

@XendraTrl(Identifier="9aa49640-83e5-34aa-6c43-edb5b64822cc")
public static String es_PE_FIELD_BankStatement_Manual_Help="El cuadro de verificación manual indica si el proceso será hecho manualmente.";

@XendraField(AD_Column_ID="IsManual",IsCentrallyMaintained=true,
AD_Tab_ID="9cc403d8-904f-2915-d309-726641539417",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=90,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9aa49640-83e5-34aa-6c43-edb5b64822cc")
public static final String FIELDNAME_BankStatement_Manual="9aa49640-83e5-34aa-6c43-edb5b64822cc";

@XendraTrl(Identifier="88abf584-4f02-cef4-e01b-cbe6a8957633")
public static String es_PE_COLUMN_IsManual_Name="Manual";

@XendraColumn(AD_Element_ID="064afee2-bc1c-12d9-20dc-97a2318dc359",ColumnName="IsManual",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="88abf584-4f02-cef4-e01b-cbe6a8957633",
Synchronized="2019-08-30 22:21:04.0")
/** Column name IsManual */
public static final String COLUMNNAME_IsManual = "IsManual";
/** Set Match Statement.
@param MatchStatement Match Statement */
public void setMatchStatement (String MatchStatement)
{
if (MatchStatement != null && MatchStatement.length() > 1)
{
log.warning("Length > 1 - truncated");
MatchStatement = MatchStatement.substring(0,0);
}
set_Value (COLUMNNAME_MatchStatement, MatchStatement);
}
/** Get Match Statement.
@return Match Statement */
public String getMatchStatement() 
{
return (String)get_Value(COLUMNNAME_MatchStatement);
}

@XendraTrl(Identifier="b82a9dd4-2cad-4c96-fed0-042f70bae8e4")
public static String es_PE_FIELD_BankStatement_MatchStatement_Name="Conciliación de Estado de Cuenta Bancario";

@XendraTrl(Identifier="b82a9dd4-2cad-4c96-fed0-042f70bae8e4")
public static String es_PE_FIELD_BankStatement_MatchStatement_Description="Estado de la cuenta del banco, información a los socios de negocio, a las facturas y a los pagos.";

@XendraField(AD_Column_ID="MatchStatement",IsCentrallyMaintained=true,
AD_Tab_ID="9cc403d8-904f-2915-d309-726641539417",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b82a9dd4-2cad-4c96-fed0-042f70bae8e4")
public static final String FIELDNAME_BankStatement_MatchStatement="b82a9dd4-2cad-4c96-fed0-042f70bae8e4";

@XendraTrl(Identifier="fbbd1eec-c3e9-ed57-0a49-19743e4e6ddc")
public static String es_PE_COLUMN_MatchStatement_Name="Conciliación";

@XendraColumn(AD_Element_ID="458ade5b-b2f5-9520-6391-55dfab59c30a",ColumnName="MatchStatement",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="b09397f4-1e05-ab78-94ea-b67a4c43a1f2",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="fbbd1eec-c3e9-ed57-0a49-19743e4e6ddc",Synchronized="2019-08-30 22:21:04.0")
/** Column name MatchStatement */
public static final String COLUMNNAME_MatchStatement = "MatchStatement";
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
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), getName());
}

@XendraTrl(Identifier="f2a02bfa-f784-6639-f143-cd3bba7c72ab")
public static String es_PE_FIELD_BankStatement_Name_Name="Observación";

@XendraTrl(Identifier="f2a02bfa-f784-6639-f143-cd3bba7c72ab")
public static String es_PE_FIELD_BankStatement_Name_Description="Observación";

@XendraTrl(Identifier="f2a02bfa-f784-6639-f143-cd3bba7c72ab")
public static String es_PE_FIELD_BankStatement_Name_Help="Observación";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="9cc403d8-904f-2915-d309-726641539417",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=-1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f2a02bfa-f784-6639-f143-cd3bba7c72ab")
public static final String FIELDNAME_BankStatement_Name="f2a02bfa-f784-6639-f143-cd3bba7c72ab";

@XendraTrl(Identifier="1def027f-7f25-4157-06cd-678af460ea92")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,
DefaultValue="@#Date@",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=true,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="1def027f-7f25-4157-06cd-678af460ea92",Synchronized="2019-08-30 22:21:04.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
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

@XendraTrl(Identifier="46c085e2-ab62-c975-b4b6-9f2f3eebbd55")
public static String es_PE_FIELD_BankStatement_Posted_Name="Fijada";

@XendraTrl(Identifier="46c085e2-ab62-c975-b4b6-9f2f3eebbd55")
public static String es_PE_FIELD_BankStatement_Posted_Description="Las transacciones de contabilidad general han sido procesadas.";

@XendraTrl(Identifier="46c085e2-ab62-c975-b4b6-9f2f3eebbd55")
public static String es_PE_FIELD_BankStatement_Posted_Help="El campo fijado indica el estado de la generación de las Líneas contables a la contabilidad general.";

@XendraField(AD_Column_ID="Posted",IsCentrallyMaintained=true,
AD_Tab_ID="9cc403d8-904f-2915-d309-726641539417",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@Processed@=Y & @#ShowAcct@=Y",DisplayLength=23,IsReadOnly=false,SeqNo=200,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="46c085e2-ab62-c975-b4b6-9f2f3eebbd55")
public static final String FIELDNAME_BankStatement_Posted="46c085e2-ab62-c975-b4b6-9f2f3eebbd55";

@XendraTrl(Identifier="f90e8e47-1864-2f6d-a353-63ad80760413")
public static String es_PE_COLUMN_Posted_Name="Fijada";

@XendraColumn(AD_Element_ID="5eb52ebc-6992-12f5-b85a-e0a136df259b",ColumnName="Posted",
AD_Reference_ID=28,AD_Reference_Value_ID="d2b659dd-6c8c-baf3-fc71-0ee997273154",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="N",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="f90e8e47-1864-2f6d-a353-63ad80760413",Synchronized="2019-08-30 22:21:04.0")
/** Column name Posted */
public static final String COLUMNNAME_Posted = "Posted";
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

@XendraTrl(Identifier="0c860fbf-35f0-5eaa-be43-5b0bffb00475")
public static String es_PE_FIELD_BankStatement_Processed_Name="Procesado";

@XendraTrl(Identifier="0c860fbf-35f0-5eaa-be43-5b0bffb00475")
public static String es_PE_FIELD_BankStatement_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="0c860fbf-35f0-5eaa-be43-5b0bffb00475")
public static String es_PE_FIELD_BankStatement_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="9cc403d8-904f-2915-d309-726641539417",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0c860fbf-35f0-5eaa-be43-5b0bffb00475")
public static final String FIELDNAME_BankStatement_Processed="0c860fbf-35f0-5eaa-be43-5b0bffb00475";

@XendraTrl(Identifier="ae4a1419-8725-99b9-62fd-3786ffc7838f")
public static String es_PE_COLUMN_Processed_Name="Procesado";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ae4a1419-8725-99b9-62fd-3786ffc7838f",
Synchronized="2019-08-30 22:21:04.0")
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

@XendraTrl(Identifier="eeaa2ef4-8ab1-5368-fd9f-278df14d0da7")
public static String es_PE_FIELD_BankStatement_ProcessNow_Name="Procesar Ahora";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="9cc403d8-904f-2915-d309-726641539417",AD_FieldGroup_ID="Status",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="eeaa2ef4-8ab1-5368-fd9f-278df14d0da7")
public static final String FIELDNAME_BankStatement_ProcessNow="eeaa2ef4-8ab1-5368-fd9f-278df14d0da7";

@XendraTrl(Identifier="297e5ba0-036b-1fa2-8a22-b7417abc5f8a")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="297e5ba0-036b-1fa2-8a22-b7417abc5f8a",
Synchronized="2019-08-30 22:21:04.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
/** Set Statement date.
@param StatementDate Date of the statement */
public void setStatementDate (Timestamp StatementDate)
{
if (StatementDate == null) throw new IllegalArgumentException ("StatementDate is mandatory.");
set_Value (COLUMNNAME_StatementDate, StatementDate);
}
/** Get Statement date.
@return Date of the statement */
public Timestamp getStatementDate() 
{
return (Timestamp)get_Value(COLUMNNAME_StatementDate);
}

@XendraTrl(Identifier="92e6271f-62ab-dba9-25a2-d333d9a680d5")
public static String es_PE_FIELD_BankStatement_StatementDate_Name="Fecha de Estado de Cuenta";

@XendraTrl(Identifier="92e6271f-62ab-dba9-25a2-d333d9a680d5")
public static String es_PE_FIELD_BankStatement_StatementDate_Description="Fecha de proceso de un estado de cuentas";

@XendraTrl(Identifier="92e6271f-62ab-dba9-25a2-d333d9a680d5")
public static String es_PE_FIELD_BankStatement_StatementDate_Help="El campo fecha del estado de cuenta define la fecha del estado de cuenta que está siendo procesado.";

@XendraField(AD_Column_ID="StatementDate",IsCentrallyMaintained=true,
AD_Tab_ID="9cc403d8-904f-2915-d309-726641539417",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="92e6271f-62ab-dba9-25a2-d333d9a680d5")
public static final String FIELDNAME_BankStatement_StatementDate="92e6271f-62ab-dba9-25a2-d333d9a680d5";

@XendraTrl(Identifier="4b1cef07-88c6-db24-0c2d-5e1ce3e2929d")
public static String es_PE_COLUMN_StatementDate_Name="Fecha de Estado de Cuenta";

@XendraColumn(AD_Element_ID="99499740-aa9e-199a-8ae3-28cd928e33d1",ColumnName="StatementDate",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="@Date@",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4b1cef07-88c6-db24-0c2d-5e1ce3e2929d",
Synchronized="2019-08-30 22:21:04.0")
/** Column name StatementDate */
public static final String COLUMNNAME_StatementDate = "StatementDate";
/** Set Statement difference.
@param StatementDifference Difference between statement ending balance and actual ending balance */
public void setStatementDifference (BigDecimal StatementDifference)
{
set_Value (COLUMNNAME_StatementDifference, StatementDifference);
}
/** Get Statement difference.
@return Difference between statement ending balance and actual ending balance */
public BigDecimal getStatementDifference() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_StatementDifference);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="52ece764-869b-8dcb-69d0-0c8b71318f5b")
public static String es_PE_FIELD_BankStatement_StatementDifference_Name="Diferencia  Edo. De Cuenta";

@XendraTrl(Identifier="52ece764-869b-8dcb-69d0-0c8b71318f5b")
public static String es_PE_FIELD_BankStatement_StatementDifference_Description="Diferencia entre el saldo final del estado de cuentas y el saldo final actual";

@XendraTrl(Identifier="52ece764-869b-8dcb-69d0-0c8b71318f5b")
public static String es_PE_FIELD_BankStatement_StatementDifference_Help="La diferencia del estado de cuenta refleja la diferencia entre el saldo final del estado de cuenta y el saldo final actual";

@XendraField(AD_Column_ID="StatementDifference",IsCentrallyMaintained=true,
AD_Tab_ID="9cc403d8-904f-2915-d309-726641539417",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="52ece764-869b-8dcb-69d0-0c8b71318f5b")
public static final String FIELDNAME_BankStatement_StatementDifference="52ece764-869b-8dcb-69d0-0c8b71318f5b";

@XendraTrl(Identifier="195fe53e-7a01-5e19-9334-53fd24981dbb")
public static String es_PE_COLUMN_StatementDifference_Name="Diferencia  Edo. De Cuenta";

@XendraColumn(AD_Element_ID="8eeef4fb-9625-ed88-3bdd-02e23c8e42a2",
ColumnName="StatementDifference",AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="195fe53e-7a01-5e19-9334-53fd24981dbb",Synchronized="2019-08-30 22:21:04.0")
/** Column name StatementDifference */
public static final String COLUMNNAME_StatementDifference = "StatementDifference";
}
