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
/** Generated Model for C_Recurring
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_Recurring extends PO
{
/** Standard Constructor
@param ctx context
@param C_Recurring_ID id
@param trxName transaction
*/
public X_C_Recurring (Properties ctx, int C_Recurring_ID, String trxName)
{
super (ctx, C_Recurring_ID, trxName);
/** if (C_Recurring_ID == 0)
{
setC_Recurring_ID (0);
setDateNextRun (new Timestamp(System.currentTimeMillis()));
setFrequencyType (null);	
// M
setName (null);
setRecurringType (null);
setRunsMax (0);
setRunsRemaining (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_Recurring (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=574 */
public static int Table_ID=MTable.getTable_ID("C_Recurring");

@XendraTrl(Identifier="b7e4cf11-f3be-a60f-0207-52655e6cba6d")
public static String es_PE_TAB_Recurring_Description="Documentos Recurrentes";

@XendraTrl(Identifier="b7e4cf11-f3be-a60f-0207-52655e6cba6d")
public static String es_PE_TAB_Recurring_Help="Mantener documentos recurrentes. La fecha del funcionamiento siguiente determina el documento (y fecha de contabilidad) de los documentos generados.";

@XendraTrl(Identifier="b7e4cf11-f3be-a60f-0207-52655e6cba6d")
public static String es_PE_TAB_Recurring_Name="Recurrente";
@XendraTab(Name="Recurring",
Description="Recurring Document",
Help="Maintain Recurring Documents. The Date Next Run determines the Document (and Accounting Date) of the generated documents.",
AD_Window_ID="400d64df-d42c-2949-456f-60c46aeb68cd",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="b7e4cf11-f3be-a60f-0207-52655e6cba6d",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Recurring="b7e4cf11-f3be-a60f-0207-52655e6cba6d";

@XendraTrl(Identifier="8e00e83f-23b5-03e6-8357-e7ee18139cd6")
public static String es_PE_TABLE_C_Recurring_Name="Recurrente";

@XendraTable(Name="Recurring",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Recurring Document",Help="",
TableName="C_Recurring",AccessLevel="3",AD_Window_ID="400d64df-d42c-2949-456f-60c46aeb68cd",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=140,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="8e00e83f-23b5-03e6-8357-e7ee18139cd6",Synchronized="2020-03-03 21:37:35.0")
/** TableName=C_Recurring */
public static final String Table_Name="C_Recurring";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_Recurring");

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
    Table_ID = MTable.getTable_ID("C_Recurring");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_Recurring[").append(get_ID()).append("]");
return sb.toString();
}
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

@XendraTrl(Identifier="f0d25ae5-60b1-266a-5a47-c1dc99aec884")
public static String es_PE_FIELD_Recurring_Invoice_Name="Factura";

@XendraTrl(Identifier="f0d25ae5-60b1-266a-5a47-c1dc99aec884")
public static String es_PE_FIELD_Recurring_Invoice_Description="Identificador de la factura";

@XendraTrl(Identifier="f0d25ae5-60b1-266a-5a47-c1dc99aec884")
public static String es_PE_FIELD_Recurring_Invoice_Help="La ID de Factura identifica únicamente un documento de Factura.";

@XendraField(AD_Column_ID="C_Invoice_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b7e4cf11-f3be-a60f-0207-52655e6cba6d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@RecurringType@=I",DisplayLength=26,IsReadOnly=false,SeqNo=160,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="f0d25ae5-60b1-266a-5a47-c1dc99aec884")
public static final String FIELDNAME_Recurring_Invoice="f0d25ae5-60b1-266a-5a47-c1dc99aec884";

@XendraTrl(Identifier="bb88b208-536a-d4a2-d691-541b0feccdde")
public static String es_PE_COLUMN_C_Invoice_ID_Name="Factura";

@XendraColumn(AD_Element_ID="e526ea57-1bdf-9871-fd57-0df3c1f9dd42",ColumnName="C_Invoice_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="@DateLastRun@!''",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="bb88b208-536a-d4a2-d691-541b0feccdde",Synchronized="2019-08-30 22:22:10.0")
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

@XendraTrl(Identifier="8bbd165c-eea3-bfce-9851-f29e0465515c")
public static String es_PE_FIELD_Recurring_Order_Name="Orden de Venta";

@XendraTrl(Identifier="8bbd165c-eea3-bfce-9851-f29e0465515c")
public static String es_PE_FIELD_Recurring_Order_Description="Orden de Venta";

@XendraTrl(Identifier="8bbd165c-eea3-bfce-9851-f29e0465515c")
public static String es_PE_FIELD_Recurring_Order_Help="La ID de la orden de ventas es un identificador único de la orden de ventas; Ésta es controlada por la secuencia del documento para este tipo de documento.";

@XendraField(AD_Column_ID="C_Order_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b7e4cf11-f3be-a60f-0207-52655e6cba6d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@RecurringType@=O",DisplayLength=26,IsReadOnly=false,SeqNo=140,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="8bbd165c-eea3-bfce-9851-f29e0465515c")
public static final String FIELDNAME_Recurring_Order="8bbd165c-eea3-bfce-9851-f29e0465515c";

@XendraTrl(Identifier="3b0d30a4-9be2-7b95-629a-8201239cdbcf")
public static String es_PE_COLUMN_C_Order_ID_Name="Orden de Venta";

@XendraColumn(AD_Element_ID="cc846c60-90b8-6aad-9d07-b5d0c0328787",ColumnName="C_Order_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="@DateLastRun@!''",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="3b0d30a4-9be2-7b95-629a-8201239cdbcf",Synchronized="2019-08-30 22:22:10.0")
/** Column name C_Order_ID */
public static final String COLUMNNAME_C_Order_ID = "C_Order_ID";
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

@XendraTrl(Identifier="631e22d0-9758-3452-fd14-c07a5b62a3e7")
public static String es_PE_FIELD_Recurring_Payment_Name="Pago";

@XendraTrl(Identifier="631e22d0-9758-3452-fd14-c07a5b62a3e7")
public static String es_PE_FIELD_Recurring_Payment_Description="Identificador del pago";

@XendraTrl(Identifier="631e22d0-9758-3452-fd14-c07a5b62a3e7")
public static String es_PE_FIELD_Recurring_Payment_Help="El pago es un identificador único de este pago.";

@XendraField(AD_Column_ID="C_Payment_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b7e4cf11-f3be-a60f-0207-52655e6cba6d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@RecurringType@=P",DisplayLength=26,IsReadOnly=false,SeqNo=180,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="631e22d0-9758-3452-fd14-c07a5b62a3e7")
public static final String FIELDNAME_Recurring_Payment="631e22d0-9758-3452-fd14-c07a5b62a3e7";

@XendraTrl(Identifier="a3c670ce-7c98-9e17-709f-f07ba62c3921")
public static String es_PE_COLUMN_C_Payment_ID_Name="Pago";

@XendraColumn(AD_Element_ID="3ded5658-968e-94c5-207b-eed6f6a7bb43",ColumnName="C_Payment_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="@DateLastRun@!''",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="a3c670ce-7c98-9e17-709f-f07ba62c3921",Synchronized="2019-08-30 22:22:10.0")
/** Column name C_Payment_ID */
public static final String COLUMNNAME_C_Payment_ID = "C_Payment_ID";
/** Set Project.
@param C_Project_ID Financial Project */
public void setC_Project_ID (int C_Project_ID)
{
if (C_Project_ID <= 0) set_Value (COLUMNNAME_C_Project_ID, null);
 else 
set_Value (COLUMNNAME_C_Project_ID, Integer.valueOf(C_Project_ID));
}
/** Get Project.
@return Financial Project */
public int getC_Project_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Project_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="466b823d-29f7-6b84-e0b3-0a4b70539869")
public static String es_PE_FIELD_Recurring_Project_Name="Proyecto";

@XendraTrl(Identifier="466b823d-29f7-6b84-e0b3-0a4b70539869")
public static String es_PE_FIELD_Recurring_Project_Description="Identifica un proyecto único";

@XendraTrl(Identifier="466b823d-29f7-6b84-e0b3-0a4b70539869")
public static String es_PE_FIELD_Recurring_Project_Help="La ID de un proyecto es un identificador definido por el usuario para un proyecto";

@XendraField(AD_Column_ID="C_Project_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b7e4cf11-f3be-a60f-0207-52655e6cba6d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@RecurringType@=J",DisplayLength=26,IsReadOnly=false,SeqNo=170,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="466b823d-29f7-6b84-e0b3-0a4b70539869")
public static final String FIELDNAME_Recurring_Project="466b823d-29f7-6b84-e0b3-0a4b70539869";

@XendraTrl(Identifier="d8756ff2-4fc2-4ca9-aa4a-3d3b8f6068d9")
public static String es_PE_COLUMN_C_Project_ID_Name="Proyecto";

@XendraColumn(AD_Element_ID="16ff5dcc-9178-73dd-e618-e88bd79d573b",ColumnName="C_Project_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="@DateLastRun@!''",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="d8756ff2-4fc2-4ca9-aa4a-3d3b8f6068d9",Synchronized="2019-08-30 22:22:10.0")
/** Column name C_Project_ID */
public static final String COLUMNNAME_C_Project_ID = "C_Project_ID";
/** Set Recurring.
@param C_Recurring_ID Recurring Document */
public void setC_Recurring_ID (int C_Recurring_ID)
{
if (C_Recurring_ID < 1) throw new IllegalArgumentException ("C_Recurring_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_Recurring_ID, Integer.valueOf(C_Recurring_ID));
}
/** Get Recurring.
@return Recurring Document */
public int getC_Recurring_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Recurring_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f7df5030-9f78-182d-fc64-80a3364badfc")
public static String es_PE_FIELD_Recurring_Recurring_Name="Recurrente";

@XendraTrl(Identifier="f7df5030-9f78-182d-fc64-80a3364badfc")
public static String es_PE_FIELD_Recurring_Recurring_Description="Documento recurrente";

@XendraTrl(Identifier="f7df5030-9f78-182d-fc64-80a3364badfc")
public static String es_PE_FIELD_Recurring_Recurring_Help="Documento recurrente";

@XendraField(AD_Column_ID="C_Recurring_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b7e4cf11-f3be-a60f-0207-52655e6cba6d",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=20,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f7df5030-9f78-182d-fc64-80a3364badfc")
public static final String FIELDNAME_Recurring_Recurring="f7df5030-9f78-182d-fc64-80a3364badfc";
/** Column name C_Recurring_ID */
public static final String COLUMNNAME_C_Recurring_ID = "C_Recurring_ID";
/** Set Date last run.
@param DateLastRun Date the process was last run. */
public void setDateLastRun (Timestamp DateLastRun)
{
set_ValueNoCheck (COLUMNNAME_DateLastRun, DateLastRun);
}
/** Get Date last run.
@return Date the process was last run. */
public Timestamp getDateLastRun() 
{
return (Timestamp)get_Value(COLUMNNAME_DateLastRun);
}

@XendraTrl(Identifier="8a82e0bd-4bb3-cb77-1565-e1e071eb1bbe")
public static String es_PE_FIELD_Recurring_DateLastRun_Name="Última Fecha de Corrida";

@XendraTrl(Identifier="8a82e0bd-4bb3-cb77-1565-e1e071eb1bbe")
public static String es_PE_FIELD_Recurring_DateLastRun_Description="Fecha en que el proceso fue corrido por última vez";

@XendraTrl(Identifier="8a82e0bd-4bb3-cb77-1565-e1e071eb1bbe")
public static String es_PE_FIELD_Recurring_DateLastRun_Help="La fecha de última corrida indica la última vez que se corrió un proceso";

@XendraField(AD_Column_ID="DateLastRun",IsCentrallyMaintained=true,
AD_Tab_ID="b7e4cf11-f3be-a60f-0207-52655e6cba6d",AD_FieldGroup_ID="History",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=190,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8a82e0bd-4bb3-cb77-1565-e1e071eb1bbe")
public static final String FIELDNAME_Recurring_DateLastRun="8a82e0bd-4bb3-cb77-1565-e1e071eb1bbe";

@XendraTrl(Identifier="3939016a-fa96-eff7-bf1c-23327b96d675")
public static String es_PE_COLUMN_DateLastRun_Name="Última Fecha de Corrida";

@XendraColumn(AD_Element_ID="e4c09739-6370-19ca-fdeb-4cdf8025abb8",ColumnName="DateLastRun",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3939016a-fa96-eff7-bf1c-23327b96d675",
Synchronized="2019-08-30 22:22:10.0")
/** Column name DateLastRun */
public static final String COLUMNNAME_DateLastRun = "DateLastRun";
/** Set Date next run.
@param DateNextRun Date the process will run next */
public void setDateNextRun (Timestamp DateNextRun)
{
if (DateNextRun == null) throw new IllegalArgumentException ("DateNextRun is mandatory.");
set_Value (COLUMNNAME_DateNextRun, DateNextRun);
}
/** Get Date next run.
@return Date the process will run next */
public Timestamp getDateNextRun() 
{
return (Timestamp)get_Value(COLUMNNAME_DateNextRun);
}

@XendraTrl(Identifier="900cf271-d0d4-b9db-20b1-d4b26b45e7a4")
public static String es_PE_FIELD_Recurring_DateNextRun_Name="Siguiente Fecha de Corrida";

@XendraTrl(Identifier="900cf271-d0d4-b9db-20b1-d4b26b45e7a4")
public static String es_PE_FIELD_Recurring_DateNextRun_Description="Fecha en que el proceso será corrido la siguiente vez";

@XendraTrl(Identifier="900cf271-d0d4-b9db-20b1-d4b26b45e7a4")
public static String es_PE_FIELD_Recurring_DateNextRun_Help="La fecha de la siguiente corrida indica la siguiente vez que este proceso se correrá.";

@XendraField(AD_Column_ID="DateNextRun",IsCentrallyMaintained=true,
AD_Tab_ID="b7e4cf11-f3be-a60f-0207-52655e6cba6d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="900cf271-d0d4-b9db-20b1-d4b26b45e7a4")
public static final String FIELDNAME_Recurring_DateNextRun="900cf271-d0d4-b9db-20b1-d4b26b45e7a4";

@XendraTrl(Identifier="e20a0f56-0118-b87d-9dac-02aaa368fca5")
public static String es_PE_COLUMN_DateNextRun_Name="Siguiente Fecha de Corrida";

@XendraColumn(AD_Element_ID="215eac34-7f19-f6b2-ebeb-e6fbdb06d7ee",ColumnName="DateNextRun",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e20a0f56-0118-b87d-9dac-02aaa368fca5",
Synchronized="2019-08-30 22:22:10.0")
/** Column name DateNextRun */
public static final String COLUMNNAME_DateNextRun = "DateNextRun";
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

@XendraTrl(Identifier="30658882-5bb0-9d26-bb4f-7e7e865fb073")
public static String es_PE_FIELD_Recurring_Description_Name="Observación";

@XendraTrl(Identifier="30658882-5bb0-9d26-bb4f-7e7e865fb073")
public static String es_PE_FIELD_Recurring_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="30658882-5bb0-9d26-bb4f-7e7e865fb073")
public static String es_PE_FIELD_Recurring_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="b7e4cf11-f3be-a60f-0207-52655e6cba6d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="30658882-5bb0-9d26-bb4f-7e7e865fb073")
public static final String FIELDNAME_Recurring_Description="30658882-5bb0-9d26-bb4f-7e7e865fb073";

@XendraTrl(Identifier="ee10bbdb-69dc-1681-8735-ea9bca93470d")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ee10bbdb-69dc-1681-8735-ea9bca93470d",
Synchronized="2019-08-30 22:22:10.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Frequency.
@param Frequency Frequency of events */
public void setFrequency (int Frequency)
{
set_Value (COLUMNNAME_Frequency, Integer.valueOf(Frequency));
}
/** Get Frequency.
@return Frequency of events */
public int getFrequency() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Frequency);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="81a8386a-eef9-20b6-ce33-f4013b158cb1")
public static String es_PE_FIELD_Recurring_Frequency_Name="Frecuencia";

@XendraTrl(Identifier="81a8386a-eef9-20b6-ce33-f4013b158cb1")
public static String es_PE_FIELD_Recurring_Frequency_Description="Frecuencia de proceso del requerimiento";

@XendraTrl(Identifier="81a8386a-eef9-20b6-ce33-f4013b158cb1")
public static String es_PE_FIELD_Recurring_Frequency_Help="La Frecuencia se usa junto con el tipo de frecuencia para determinar cuando un requerimiento será procesado.";

@XendraField(AD_Column_ID="Frequency",IsCentrallyMaintained=true,
AD_Tab_ID="b7e4cf11-f3be-a60f-0207-52655e6cba6d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="81a8386a-eef9-20b6-ce33-f4013b158cb1")
public static final String FIELDNAME_Recurring_Frequency="81a8386a-eef9-20b6-ce33-f4013b158cb1";

@XendraTrl(Identifier="fbfe59aa-55b9-185c-2abf-83dc8766ef42")
public static String es_PE_COLUMN_Frequency_Name="Frecuencia";

@XendraColumn(AD_Element_ID="cd717b11-c45b-527f-9abd-4533f87b759f",ColumnName="Frequency",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fbfe59aa-55b9-185c-2abf-83dc8766ef42",
Synchronized="2019-08-30 22:22:11.0")
/** Column name Frequency */
public static final String COLUMNNAME_Frequency = "Frequency";
/** Set Frequency Type.
@param FrequencyType Frequency of event */
public void setFrequencyType (String FrequencyType)
{
if (FrequencyType.length() > 1)
{
log.warning("Length > 1 - truncated");
FrequencyType = FrequencyType.substring(0,0);
}
set_Value (COLUMNNAME_FrequencyType, FrequencyType);
}
/** Get Frequency Type.
@return Frequency of event */
public String getFrequencyType() 
{
return (String)get_Value(COLUMNNAME_FrequencyType);
}

@XendraTrl(Identifier="4430f1c9-17b8-021d-5070-f2ede8383937")
public static String es_PE_FIELD_Recurring_FrequencyType_Name="Tipo de Frecuencia";

@XendraTrl(Identifier="4430f1c9-17b8-021d-5070-f2ede8383937")
public static String es_PE_FIELD_Recurring_FrequencyType_Description="Frecuencia de cálculo";

@XendraTrl(Identifier="4430f1c9-17b8-021d-5070-f2ede8383937")
public static String es_PE_FIELD_Recurring_FrequencyType_Help="El Tipo de frecuencia se usa para calcular las fechas de inicio y fin del cálculo";

@XendraField(AD_Column_ID="FrequencyType",IsCentrallyMaintained=true,
AD_Tab_ID="b7e4cf11-f3be-a60f-0207-52655e6cba6d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4430f1c9-17b8-021d-5070-f2ede8383937")
public static final String FIELDNAME_Recurring_FrequencyType="4430f1c9-17b8-021d-5070-f2ede8383937";

@XendraTrl(Identifier="79b98b9e-2019-c353-f379-e1956f742d0c")
public static String es_PE_COLUMN_FrequencyType_Name="Tipo de Frecuencia";

@XendraColumn(AD_Element_ID="d2dcc6d7-4c3b-0646-5dc8-3df7514121af",ColumnName="FrequencyType",
AD_Reference_ID=17,AD_Reference_Value_ID="33cfb9f6-5838-6aab-2851-2f9517251d7e",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="M",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="79b98b9e-2019-c353-f379-e1956f742d0c",Synchronized="2019-08-30 22:22:11.0")
/** Column name FrequencyType */
public static final String COLUMNNAME_FrequencyType = "FrequencyType";
/** Set Journal Batch.
@param GL_JournalBatch_ID General Ledger Journal Batch */
public void setGL_JournalBatch_ID (int GL_JournalBatch_ID)
{
if (GL_JournalBatch_ID <= 0) set_Value (COLUMNNAME_GL_JournalBatch_ID, null);
 else 
set_Value (COLUMNNAME_GL_JournalBatch_ID, Integer.valueOf(GL_JournalBatch_ID));
}
/** Get Journal Batch.
@return General Ledger Journal Batch */
public int getGL_JournalBatch_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_GL_JournalBatch_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="cf5cc949-6898-886b-c1f7-ac87cdc9a168")
public static String es_PE_FIELD_Recurring_JournalBatch_Name="Lote de Diario CG";

@XendraTrl(Identifier="cf5cc949-6898-886b-c1f7-ac87cdc9a168")
public static String es_PE_FIELD_Recurring_JournalBatch_Description="Lote de Diario CG";

@XendraTrl(Identifier="cf5cc949-6898-886b-c1f7-ac87cdc9a168")
public static String es_PE_FIELD_Recurring_JournalBatch_Help="El lote de pólizas de la contabilidad general identifica un conjunto de pólizas a ser procesadas como un grupo.";

@XendraField(AD_Column_ID="GL_JournalBatch_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b7e4cf11-f3be-a60f-0207-52655e6cba6d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@RecurringType@=G",DisplayLength=26,IsReadOnly=false,SeqNo=150,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="cf5cc949-6898-886b-c1f7-ac87cdc9a168")
public static final String FIELDNAME_Recurring_JournalBatch="cf5cc949-6898-886b-c1f7-ac87cdc9a168";

@XendraTrl(Identifier="f44729b9-b5db-ff2e-d3d0-ccf1f6bd661d")
public static String es_PE_COLUMN_GL_JournalBatch_ID_Name="Lote de Diario CG";

@XendraColumn(AD_Element_ID="7fbd376a-5aca-74a1-5535-368c0ba04a7a",ColumnName="GL_JournalBatch_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="@DateLastRun@!''",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="f44729b9-b5db-ff2e-d3d0-ccf1f6bd661d",Synchronized="2019-08-30 22:22:11.0")
/** Column name GL_JournalBatch_ID */
public static final String COLUMNNAME_GL_JournalBatch_ID = "GL_JournalBatch_ID";
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

@XendraTrl(Identifier="cbc2c5c3-5a95-8f92-be5a-fbecfa039bf8")
public static String es_PE_FIELD_Recurring_CommentHelp_Name="Ayuda";

@XendraTrl(Identifier="cbc2c5c3-5a95-8f92-be5a-fbecfa039bf8")
public static String es_PE_FIELD_Recurring_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="cbc2c5c3-5a95-8f92-be5a-fbecfa039bf8")
public static String es_PE_FIELD_Recurring_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraField(AD_Column_ID="Help",IsCentrallyMaintained=true,
AD_Tab_ID="b7e4cf11-f3be-a60f-0207-52655e6cba6d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cbc2c5c3-5a95-8f92-be5a-fbecfa039bf8")
public static final String FIELDNAME_Recurring_CommentHelp="cbc2c5c3-5a95-8f92-be5a-fbecfa039bf8";

@XendraTrl(Identifier="6ab069f6-69df-865f-3881-cbf7a7f4fc1d")
public static String es_PE_COLUMN_Help_Name="Ayuda";

@XendraColumn(AD_Element_ID="a6fda582-56f9-6bb7-8436-285ce4f8de3f",ColumnName="Help",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6ab069f6-69df-865f-3881-cbf7a7f4fc1d",
Synchronized="2019-08-30 22:22:11.0")
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
@XendraTrl(Identifier="c045c019-a188-4e8c-82ae-325bb54e7771")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c045c019-a188-4e8c-82ae-325bb54e7771",
Synchronized="2019-08-30 22:22:11.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
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

@XendraTrl(Identifier="64591951-cb55-e1cd-3534-1c147f7014cd")
public static String es_PE_FIELD_Recurring_Name_Name="Nombre";

@XendraTrl(Identifier="64591951-cb55-e1cd-3534-1c147f7014cd")
public static String es_PE_FIELD_Recurring_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="64591951-cb55-e1cd-3534-1c147f7014cd")
public static String es_PE_FIELD_Recurring_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="b7e4cf11-f3be-a60f-0207-52655e6cba6d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="64591951-cb55-e1cd-3534-1c147f7014cd")
public static final String FIELDNAME_Recurring_Name="64591951-cb55-e1cd-3534-1c147f7014cd";

@XendraTrl(Identifier="35671cda-b484-0fcb-e9cc-36394025d5cf")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="35671cda-b484-0fcb-e9cc-36394025d5cf",
Synchronized="2019-08-30 22:22:11.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
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

@XendraTrl(Identifier="bcac80fb-0d8b-f737-d5c2-41a8bf429d2a")
public static String es_PE_FIELD_Recurring_ProcessNow_Name="Inicio de Corrida Recurrente ";

@XendraTrl(Identifier="bcac80fb-0d8b-f737-d5c2-41a8bf429d2a")
public static String es_PE_FIELD_Recurring_ProcessNow_Description="Inicio de Corrida Recurrente ";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="b7e4cf11-f3be-a60f-0207-52655e6cba6d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=210,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bcac80fb-0d8b-f737-d5c2-41a8bf429d2a")
public static final String FIELDNAME_Recurring_ProcessNow="bcac80fb-0d8b-f737-d5c2-41a8bf429d2a";

@XendraTrl(Identifier="cd9caa49-42dc-d22a-7bb0-01ea73257f33")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="d608428f-622c-a288-6951-c97b52590058",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="cd9caa49-42dc-d22a-7bb0-01ea73257f33",Synchronized="2019-08-30 22:22:11.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
/** Set Recurring Type.
@param RecurringType Type of Recurring Document */
public void setRecurringType (String RecurringType)
{
if (RecurringType.length() > 1)
{
log.warning("Length > 1 - truncated");
RecurringType = RecurringType.substring(0,0);
}
set_Value (COLUMNNAME_RecurringType, RecurringType);
}
/** Get Recurring Type.
@return Type of Recurring Document */
public String getRecurringType() 
{
return (String)get_Value(COLUMNNAME_RecurringType);
}

@XendraTrl(Identifier="bdefc4da-1943-1a55-2fa6-d68eee59cc22")
public static String es_PE_FIELD_Recurring_RecurringType_Name="Tipo de Recurrencia";

@XendraTrl(Identifier="bdefc4da-1943-1a55-2fa6-d68eee59cc22")
public static String es_PE_FIELD_Recurring_RecurringType_Description="Tipo de recurrencia de documento";

@XendraTrl(Identifier="bdefc4da-1943-1a55-2fa6-d68eee59cc22")
public static String es_PE_FIELD_Recurring_RecurringType_Help="El tipo de documento que se generará";

@XendraField(AD_Column_ID="RecurringType",IsCentrallyMaintained=true,
AD_Tab_ID="b7e4cf11-f3be-a60f-0207-52655e6cba6d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bdefc4da-1943-1a55-2fa6-d68eee59cc22")
public static final String FIELDNAME_Recurring_RecurringType="bdefc4da-1943-1a55-2fa6-d68eee59cc22";

@XendraTrl(Identifier="c0849cbe-fa9f-3f29-a17d-a650276a18b4")
public static String es_PE_COLUMN_RecurringType_Name="Tipo de Recurrencia";

@XendraColumn(AD_Element_ID="d4bd66a6-38ef-3119-9ba7-bdf036744a31",ColumnName="RecurringType",
AD_Reference_ID=17,AD_Reference_Value_ID="83cd0595-4907-b096-73bb-781e5da6ede4",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="@DateLastRun@!''",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="c0849cbe-fa9f-3f29-a17d-a650276a18b4",Synchronized="2019-08-30 22:22:11.0")
/** Column name RecurringType */
public static final String COLUMNNAME_RecurringType = "RecurringType";
/** Set Maximum Runs.
@param RunsMax Number of recurring runs */
public void setRunsMax (int RunsMax)
{
set_Value (COLUMNNAME_RunsMax, Integer.valueOf(RunsMax));
}
/** Get Maximum Runs.
@return Number of recurring runs */
public int getRunsMax() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_RunsMax);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="6a33e3cc-6d58-059a-9ec4-7d7946f4ceab")
public static String es_PE_FIELD_Recurring_MaximumRuns_Name="Máximo de Corridas";

@XendraTrl(Identifier="6a33e3cc-6d58-059a-9ec4-7d7946f4ceab")
public static String es_PE_FIELD_Recurring_MaximumRuns_Description="Número de funcionamientos que se repiten.";

@XendraTrl(Identifier="6a33e3cc-6d58-059a-9ec4-7d7946f4ceab")
public static String es_PE_FIELD_Recurring_MaximumRuns_Help="Número de los documentos que se repiten y que se generarán en total.";

@XendraField(AD_Column_ID="RunsMax",IsCentrallyMaintained=true,
AD_Tab_ID="b7e4cf11-f3be-a60f-0207-52655e6cba6d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6a33e3cc-6d58-059a-9ec4-7d7946f4ceab")
public static final String FIELDNAME_Recurring_MaximumRuns="6a33e3cc-6d58-059a-9ec4-7d7946f4ceab";

@XendraTrl(Identifier="f8c08d30-c40a-46c4-8550-61c73d5b1dad")
public static String es_PE_COLUMN_RunsMax_Name="Máximo de Corridas";

@XendraColumn(AD_Element_ID="aa543cc8-1999-1bc0-ca09-d05158f31ba1",ColumnName="RunsMax",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f8c08d30-c40a-46c4-8550-61c73d5b1dad",
Synchronized="2019-08-30 22:22:11.0")
/** Column name RunsMax */
public static final String COLUMNNAME_RunsMax = "RunsMax";
/** Set Remaining Runs.
@param RunsRemaining Number of recurring runs remaining */
public void setRunsRemaining (int RunsRemaining)
{
set_ValueNoCheck (COLUMNNAME_RunsRemaining, Integer.valueOf(RunsRemaining));
}
/** Get Remaining Runs.
@return Number of recurring runs remaining */
public int getRunsRemaining() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_RunsRemaining);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="e9bd55be-f26b-f619-fcdb-4adfe32eabd1")
public static String es_PE_FIELD_Recurring_RemainingRuns_Name="Corridas Restantes";

@XendraTrl(Identifier="e9bd55be-f26b-f619-fcdb-4adfe32eabd1")
public static String es_PE_FIELD_Recurring_RemainingRuns_Description="Número de los funcionamientos restantes que se repiten ";

@XendraTrl(Identifier="e9bd55be-f26b-f619-fcdb-4adfe32eabd1")
public static String es_PE_FIELD_Recurring_RemainingRuns_Help="Número de los documentos que se repiten y que se generarán ";

@XendraField(AD_Column_ID="RunsRemaining",IsCentrallyMaintained=true,
AD_Tab_ID="b7e4cf11-f3be-a60f-0207-52655e6cba6d",AD_FieldGroup_ID="History",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=true,SeqNo=200,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e9bd55be-f26b-f619-fcdb-4adfe32eabd1")
public static final String FIELDNAME_Recurring_RemainingRuns="e9bd55be-f26b-f619-fcdb-4adfe32eabd1";

@XendraTrl(Identifier="5042b48b-85a6-0db9-1a80-4b3f7617969a")
public static String es_PE_COLUMN_RunsRemaining_Name="Corridas Restantes";

@XendraColumn(AD_Element_ID="3422876f-c164-1fe9-b669-c6d9a94ae174",ColumnName="RunsRemaining",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5042b48b-85a6-0db9-1a80-4b3f7617969a",
Synchronized="2019-08-30 22:22:11.0")
/** Column name RunsRemaining */
public static final String COLUMNNAME_RunsRemaining = "RunsRemaining";
}
