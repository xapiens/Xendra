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
/** Generated Model for C_Recurring_Run
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_Recurring_Run extends PO
{
/** Standard Constructor
@param ctx context
@param C_Recurring_Run_ID id
@param trxName transaction
*/
public X_C_Recurring_Run (Properties ctx, int C_Recurring_Run_ID, String trxName)
{
super (ctx, C_Recurring_Run_ID, trxName);
/** if (C_Recurring_Run_ID == 0)
{
setC_Recurring_ID (0);
setC_Recurring_Run_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_Recurring_Run (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=573 */
public static int Table_ID=MTable.getTable_ID("C_Recurring_Run");

@XendraTrl(Identifier="f85a4170-cfdd-7a8b-a8e6-5fc417c4811c")
public static String es_PE_TAB_Run_Description="Cálculos de Documentos Recurrentes";

@XendraTrl(Identifier="f85a4170-cfdd-7a8b-a8e6-5fc417c4811c")
public static String es_PE_TAB_Run_Name="Calculos";

@XendraTrl(Identifier="f85a4170-cfdd-7a8b-a8e6-5fc417c4811c")
public static String es_PE_TAB_Run_Help="Historia generación de documentos recurrentes";

@XendraTab(Name="Run",Description="Recurring Document Run",
Help="History of Recurring Document Generation",
AD_Window_ID="400d64df-d42c-2949-456f-60c46aeb68cd",SeqNo=20,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=true,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=false,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="f85a4170-cfdd-7a8b-a8e6-5fc417c4811c",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Run="f85a4170-cfdd-7a8b-a8e6-5fc417c4811c";

@XendraTrl(Identifier="b5fb5c8e-d8cd-2938-a19e-6331113c6a16")
public static String es_PE_TABLE_C_Recurring_Run_Name="Corridad de Recurrencias";

@XendraTable(Name="Recurring Run",Description="Recurring Document Run",Help="",
TableName="C_Recurring_Run",AccessLevel="3",AD_Window_ID="400d64df-d42c-2949-456f-60c46aeb68cd",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="b5fb5c8e-d8cd-2938-a19e-6331113c6a16",Synchronized="2017-08-16 11:42:23.0")
/** TableName=C_Recurring_Run */
public static final String Table_Name="C_Recurring_Run";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_Recurring_Run");

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
    Table_ID = MTable.getTable_ID("C_Recurring_Run");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_Recurring_Run[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Invoice.
@param C_Invoice_ID Invoice Identifier */
public void setC_Invoice_ID (int C_Invoice_ID)
{
if (C_Invoice_ID <= 0) set_ValueNoCheck (COLUMNNAME_C_Invoice_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_C_Invoice_ID, Integer.valueOf(C_Invoice_ID));
}
/** Get Invoice.
@return Invoice Identifier */
public int getC_Invoice_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Invoice_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="79f5a82c-6a2d-e18e-80c6-0cdef869e171")
public static String es_PE_FIELD_Run_Invoice_Description="Identificador de la factura";

@XendraTrl(Identifier="79f5a82c-6a2d-e18e-80c6-0cdef869e171")
public static String es_PE_FIELD_Run_Invoice_Help="La ID de Factura identifica únicamente un documento de Factura.";

@XendraTrl(Identifier="79f5a82c-6a2d-e18e-80c6-0cdef869e171")
public static String es_PE_FIELD_Run_Invoice_Name="Factura";

@XendraField(AD_Column_ID="C_Invoice_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f85a4170-cfdd-7a8b-a8e6-5fc417c4811c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@RecurringType@=I",DisplayLength=26,IsReadOnly=true,SeqNo=110,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="79f5a82c-6a2d-e18e-80c6-0cdef869e171")
public static final String FIELDNAME_Run_Invoice="79f5a82c-6a2d-e18e-80c6-0cdef869e171";

@XendraTrl(Identifier="031a7fb1-da0f-3001-5306-36056fb48a31")
public static String es_PE_COLUMN_C_Invoice_ID_Name="Factura";

@XendraColumn(AD_Element_ID="e526ea57-1bdf-9871-fd57-0df3c1f9dd42",ColumnName="C_Invoice_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="031a7fb1-da0f-3001-5306-36056fb48a31",
Synchronized="2017-08-05 16:54:20.0")
/** Column name C_Invoice_ID */
public static final String COLUMNNAME_C_Invoice_ID = "C_Invoice_ID";
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

@XendraTrl(Identifier="6f52e482-cef1-b7a5-1718-99a5b7595a15")
public static String es_PE_FIELD_Run_Order_Description="Orden de Venta";

@XendraTrl(Identifier="6f52e482-cef1-b7a5-1718-99a5b7595a15")
public static String es_PE_FIELD_Run_Order_Help="La ID de la orden de ventas es un identificador único de la orden de ventas; Ésta es controlada por la secuencia del documento para este tipo de documento.";

@XendraTrl(Identifier="6f52e482-cef1-b7a5-1718-99a5b7595a15")
public static String es_PE_FIELD_Run_Order_Name="Orden de Venta";

@XendraField(AD_Column_ID="C_Order_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f85a4170-cfdd-7a8b-a8e6-5fc417c4811c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@RecurringType@=O",DisplayLength=26,IsReadOnly=true,SeqNo=90,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="6f52e482-cef1-b7a5-1718-99a5b7595a15")
public static final String FIELDNAME_Run_Order="6f52e482-cef1-b7a5-1718-99a5b7595a15";

@XendraTrl(Identifier="a90ca77e-c434-8c50-e380-c8a50055414d")
public static String es_PE_COLUMN_C_Order_ID_Name="Orden de Venta";

@XendraColumn(AD_Element_ID="cc846c60-90b8-6aad-9d07-b5d0c0328787",ColumnName="C_Order_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a90ca77e-c434-8c50-e380-c8a50055414d",
Synchronized="2017-08-05 16:54:20.0")
/** Column name C_Order_ID */
public static final String COLUMNNAME_C_Order_ID = "C_Order_ID";
/** Set Payment.
@param C_Payment_ID Payment identifier */
public void setC_Payment_ID (int C_Payment_ID)
{
if (C_Payment_ID <= 0) set_ValueNoCheck (COLUMNNAME_C_Payment_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_C_Payment_ID, Integer.valueOf(C_Payment_ID));
}
/** Get Payment.
@return Payment identifier */
public int getC_Payment_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Payment_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="0919b04b-d6d5-0ddd-4751-f4488f185723")
public static String es_PE_FIELD_Run_Payment_Description="Identificador del pago";

@XendraTrl(Identifier="0919b04b-d6d5-0ddd-4751-f4488f185723")
public static String es_PE_FIELD_Run_Payment_Help="El pago es un identificador único de este pago.";

@XendraTrl(Identifier="0919b04b-d6d5-0ddd-4751-f4488f185723")
public static String es_PE_FIELD_Run_Payment_Name="Pago";
@XendraField(AD_Column_ID="C_Payment_ID",
IsCentrallyMaintained=true,AD_Tab_ID="f85a4170-cfdd-7a8b-a8e6-5fc417c4811c",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="@RecurringType@=P",DisplayLength=26,IsReadOnly=true,SeqNo=80,
SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="0919b04b-d6d5-0ddd-4751-f4488f185723")
public static final String FIELDNAME_Run_Payment="0919b04b-d6d5-0ddd-4751-f4488f185723";

@XendraTrl(Identifier="b03bed12-174b-a31e-1723-efe484d76ae8")
public static String es_PE_COLUMN_C_Payment_ID_Name="Pago";

@XendraColumn(AD_Element_ID="3ded5658-968e-94c5-207b-eed6f6a7bb43",ColumnName="C_Payment_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b03bed12-174b-a31e-1723-efe484d76ae8",
Synchronized="2017-08-05 16:54:20.0")
/** Column name C_Payment_ID */
public static final String COLUMNNAME_C_Payment_ID = "C_Payment_ID";
/** Set Project.
@param C_Project_ID Financial Project */
public void setC_Project_ID (int C_Project_ID)
{
if (C_Project_ID <= 0) set_ValueNoCheck (COLUMNNAME_C_Project_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_C_Project_ID, Integer.valueOf(C_Project_ID));
}
/** Get Project.
@return Financial Project */
public int getC_Project_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Project_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ce1ecdb5-da02-2a9d-89bc-f7d3ce128c08")
public static String es_PE_FIELD_Run_Project_Description="Identifica un proyecto único";

@XendraTrl(Identifier="ce1ecdb5-da02-2a9d-89bc-f7d3ce128c08")
public static String es_PE_FIELD_Run_Project_Help="La ID de un proyecto es un identificador definido por el usuario para un proyecto";

@XendraTrl(Identifier="ce1ecdb5-da02-2a9d-89bc-f7d3ce128c08")
public static String es_PE_FIELD_Run_Project_Name="Proyecto";

@XendraField(AD_Column_ID="C_Project_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f85a4170-cfdd-7a8b-a8e6-5fc417c4811c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@RecurringType@=J",DisplayLength=26,IsReadOnly=true,SeqNo=100,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="ce1ecdb5-da02-2a9d-89bc-f7d3ce128c08")
public static final String FIELDNAME_Run_Project="ce1ecdb5-da02-2a9d-89bc-f7d3ce128c08";

@XendraTrl(Identifier="1e5c88d3-38fc-2629-c2c5-c280dfd3e3c1")
public static String es_PE_COLUMN_C_Project_ID_Name="Proyecto";

@XendraColumn(AD_Element_ID="16ff5dcc-9178-73dd-e618-e88bd79d573b",ColumnName="C_Project_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1e5c88d3-38fc-2629-c2c5-c280dfd3e3c1",
Synchronized="2017-08-05 16:54:20.0")
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

@XendraTrl(Identifier="dca09fa2-fa0b-ca04-75c8-7dd6ce9f78d8")
public static String es_PE_FIELD_Run_Recurring_Description="Documento recurrente";

@XendraTrl(Identifier="dca09fa2-fa0b-ca04-75c8-7dd6ce9f78d8")
public static String es_PE_FIELD_Run_Recurring_Help="Documento recurrente";

@XendraTrl(Identifier="dca09fa2-fa0b-ca04-75c8-7dd6ce9f78d8")
public static String es_PE_FIELD_Run_Recurring_Name="Recurrente";

@XendraField(AD_Column_ID="C_Recurring_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f85a4170-cfdd-7a8b-a8e6-5fc417c4811c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="dca09fa2-fa0b-ca04-75c8-7dd6ce9f78d8")
public static final String FIELDNAME_Run_Recurring="dca09fa2-fa0b-ca04-75c8-7dd6ce9f78d8";

@XendraTrl(Identifier="dd16a55e-285c-84d8-f2e1-f6b5b071427f")
public static String es_PE_COLUMN_C_Recurring_ID_Name="Recurrente";

@XendraColumn(AD_Element_ID="4aeba568-2a65-c1c6-d8d0-664eeb958c47",ColumnName="C_Recurring_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="dd16a55e-285c-84d8-f2e1-f6b5b071427f",
Synchronized="2017-08-05 16:54:20.0")
/** Column name C_Recurring_ID */
public static final String COLUMNNAME_C_Recurring_ID = "C_Recurring_ID";
/** Set Recurring Run.
@param C_Recurring_Run_ID Recurring Document Run */
public void setC_Recurring_Run_ID (int C_Recurring_Run_ID)
{
if (C_Recurring_Run_ID < 1) throw new IllegalArgumentException ("C_Recurring_Run_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_Recurring_Run_ID, Integer.valueOf(C_Recurring_Run_ID));
}
/** Get Recurring Run.
@return Recurring Document Run */
public int getC_Recurring_Run_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Recurring_Run_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="8a594302-bfa0-3446-66c0-3ea262390746")
public static String es_PE_FIELD_Run_RecurringRun_Description="Funcionamiento del documento que se repite";

@XendraTrl(Identifier="8a594302-bfa0-3446-66c0-3ea262390746")
public static String es_PE_FIELD_Run_RecurringRun_Name="Corridad de Recurrencias";

@XendraField(AD_Column_ID="C_Recurring_Run_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f85a4170-cfdd-7a8b-a8e6-5fc417c4811c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8a594302-bfa0-3446-66c0-3ea262390746")
public static final String FIELDNAME_Run_RecurringRun="8a594302-bfa0-3446-66c0-3ea262390746";
/** Column name C_Recurring_Run_ID */
public static final String COLUMNNAME_C_Recurring_Run_ID = "C_Recurring_Run_ID";
/** Set DateDoc.
@param DateDoc Date of the Document */
public void setDateDoc (Timestamp DateDoc)
{
set_Value (COLUMNNAME_DateDoc, DateDoc);
}
/** Get DateDoc.
@return Date of the Document */
public Timestamp getDateDoc() 
{
return (Timestamp)get_Value(COLUMNNAME_DateDoc);
}

@XendraTrl(Identifier="c18727af-6cc1-c6d3-bc68-73b0e3e8e268")
public static String es_PE_FIELD_Run_DateDoc_Description="Fecha del documento";

@XendraTrl(Identifier="c18727af-6cc1-c6d3-bc68-73b0e3e8e268")
public static String es_PE_FIELD_Run_DateDoc_Help="La fecha del documento indica la fecha en que el documento fue generado. Puede ó no ser la misma que la fecha contable. ";

@XendraTrl(Identifier="c18727af-6cc1-c6d3-bc68-73b0e3e8e268")
public static String es_PE_FIELD_Run_DateDoc_Name="F. Documento";

@XendraField(AD_Column_ID="DateDoc",IsCentrallyMaintained=true,
AD_Tab_ID="f85a4170-cfdd-7a8b-a8e6-5fc417c4811c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c18727af-6cc1-c6d3-bc68-73b0e3e8e268")
public static final String FIELDNAME_Run_DateDoc="c18727af-6cc1-c6d3-bc68-73b0e3e8e268";

@XendraTrl(Identifier="80c76074-8d6b-3ffd-e4d2-013942552242")
public static String es_PE_COLUMN_DateDoc_Name="F. Documento";

@XendraColumn(AD_Element_ID="68f87a38-0b7e-cc52-6990-3b5d2d120d9d",ColumnName="DateDoc",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="80c76074-8d6b-3ffd-e4d2-013942552242",
Synchronized="2017-08-05 16:54:20.0")
/** Column name DateDoc */
public static final String COLUMNNAME_DateDoc = "DateDoc";
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

@XendraTrl(Identifier="4ab2878f-b0d6-1000-70a9-1936db39872e")
public static String es_PE_FIELD_Run_JournalBatch_Description="Lote de Diario CG";

@XendraTrl(Identifier="4ab2878f-b0d6-1000-70a9-1936db39872e")
public static String es_PE_FIELD_Run_JournalBatch_Help="El lote de pólizas de la contabilidad general identifica un conjunto de pólizas a ser procesadas como un grupo.";

@XendraTrl(Identifier="4ab2878f-b0d6-1000-70a9-1936db39872e")
public static String es_PE_FIELD_Run_JournalBatch_Name="Lote de Diario CG";

@XendraField(AD_Column_ID="GL_JournalBatch_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f85a4170-cfdd-7a8b-a8e6-5fc417c4811c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@RecurringType@=G",DisplayLength=26,IsReadOnly=true,SeqNo=120,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="4ab2878f-b0d6-1000-70a9-1936db39872e")
public static final String FIELDNAME_Run_JournalBatch="4ab2878f-b0d6-1000-70a9-1936db39872e";

@XendraTrl(Identifier="0deb2e82-7943-1811-968d-572a22b4a0ce")
public static String es_PE_COLUMN_GL_JournalBatch_ID_Name="Lote de Diario CG";

@XendraColumn(AD_Element_ID="7fbd376a-5aca-74a1-5535-368c0ba04a7a",ColumnName="GL_JournalBatch_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0deb2e82-7943-1811-968d-572a22b4a0ce",
Synchronized="2017-08-05 16:54:20.0")
/** Column name GL_JournalBatch_ID */
public static final String COLUMNNAME_GL_JournalBatch_ID = "GL_JournalBatch_ID";
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
@XendraTrl(Identifier="31c1081c-f293-4d53-a5b8-c4bef70897d5")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="31c1081c-f293-4d53-a5b8-c4bef70897d5",
Synchronized="2017-08-05 16:54:20.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
}
