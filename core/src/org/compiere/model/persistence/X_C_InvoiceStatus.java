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
/** Generated Model for C_InvoiceStatus
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_InvoiceStatus extends PO
{
/** Standard Constructor
@param ctx context
@param C_InvoiceStatus_ID id
@param trxName transaction
*/
public X_C_InvoiceStatus (Properties ctx, int C_InvoiceStatus_ID, String trxName)
{
super (ctx, C_InvoiceStatus_ID, trxName);
/** if (C_InvoiceStatus_ID == 0)
{
setC_Invoice_ID (0);
setC_InvoiceStatus_ID (0);
setDocStatus (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_InvoiceStatus (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000049 */
public static int Table_ID=MTable.getTable_ID("C_InvoiceStatus");

@XendraTrl(Identifier="03769890-0cb6-401f-334c-12d35afca799")
public static String es_PE_TAB_Status_Description="Estados del Documento";

@XendraTrl(Identifier="03769890-0cb6-401f-334c-12d35afca799")
public static String es_PE_TAB_Status_Help="Estados del Documento";

@XendraTrl(Identifier="03769890-0cb6-401f-334c-12d35afca799")
public static String es_PE_TAB_Status_Name="Estado";
@XendraTab(Name="Status",
Description="Invoice Status",Help="Invoice Status",
AD_Window_ID="dc1a37c5-086c-c19e-c2ba-344555bfcf65",SeqNo=60,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=true,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=false,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="03769890-0cb6-401f-334c-12d35afca799",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Status="03769890-0cb6-401f-334c-12d35afca799";

@XendraTrl(Identifier="918f8b37-2d6d-cc66-7d26-a2aba37dd3f8")
public static String es_PE_TABLE_C_InvoiceStatus_Name="Invoice Status";

@XendraTable(Name="Invoice Status",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Invoice Status",Help="",
TableName="C_InvoiceStatus",AccessLevel="3",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.commercial",Identifier="918f8b37-2d6d-cc66-7d26-a2aba37dd3f8",
Synchronized="2020-03-03 21:37:05.0")
/** TableName=C_InvoiceStatus */
public static final String Table_Name="C_InvoiceStatus";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_InvoiceStatus");

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
    Table_ID = MTable.getTable_ID("C_InvoiceStatus");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_InvoiceStatus[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Invoice.
@param C_Invoice_ID Invoice Identifier */
public void setC_Invoice_ID (int C_Invoice_ID)
{
if (C_Invoice_ID < 1) throw new IllegalArgumentException ("C_Invoice_ID is mandatory.");
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

@XendraTrl(Identifier="6e9c9c7d-c0aa-27a4-c80f-9686d99d415e")
public static String es_PE_FIELD_Status_Invoice_Name="Factura";

@XendraTrl(Identifier="6e9c9c7d-c0aa-27a4-c80f-9686d99d415e")
public static String es_PE_FIELD_Status_Invoice_Description="Identificador de la factura";

@XendraTrl(Identifier="6e9c9c7d-c0aa-27a4-c80f-9686d99d415e")
public static String es_PE_FIELD_Status_Invoice_Help="La ID de Factura identifica únicamente un documento de Factura.";

@XendraField(AD_Column_ID="C_Invoice_ID",IsCentrallyMaintained=true,
AD_Tab_ID="03769890-0cb6-401f-334c-12d35afca799",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6e9c9c7d-c0aa-27a4-c80f-9686d99d415e")
public static final String FIELDNAME_Status_Invoice="6e9c9c7d-c0aa-27a4-c80f-9686d99d415e";

@XendraTrl(Identifier="b95c6a16-c94c-6b2c-48dd-343af165f4b0")
public static String es_PE_COLUMN_C_Invoice_ID_Name="Factura";

@XendraColumn(AD_Element_ID="e526ea57-1bdf-9871-fd57-0df3c1f9dd42",ColumnName="C_Invoice_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b95c6a16-c94c-6b2c-48dd-343af165f4b0",
Synchronized="2019-08-30 22:21:44.0")
/** Column name C_Invoice_ID */
public static final String COLUMNNAME_C_Invoice_ID = "C_Invoice_ID";
/** Set Invoice Status.
@param C_InvoiceStatus_ID Invoice Status */
public void setC_InvoiceStatus_ID (int C_InvoiceStatus_ID)
{
if (C_InvoiceStatus_ID < 1) throw new IllegalArgumentException ("C_InvoiceStatus_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_InvoiceStatus_ID, Integer.valueOf(C_InvoiceStatus_ID));
}
/** Get Invoice Status.
@return Invoice Status */
public int getC_InvoiceStatus_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_InvoiceStatus_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="9607f06a-2fc4-3773-eb50-4355477c6c1f")
public static String es_PE_FIELD_Status_InvoiceStatus_Name="Invoice Status";

@XendraField(AD_Column_ID="C_InvoiceStatus_ID",IsCentrallyMaintained=true,
AD_Tab_ID="03769890-0cb6-401f-334c-12d35afca799",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9607f06a-2fc4-3773-eb50-4355477c6c1f")
public static final String FIELDNAME_Status_InvoiceStatus="9607f06a-2fc4-3773-eb50-4355477c6c1f";
/** Column name C_InvoiceStatus_ID */
public static final String COLUMNNAME_C_InvoiceStatus_ID = "C_InvoiceStatus_ID";
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

@XendraTrl(Identifier="ac381fc5-22a3-302c-607d-7a44cb712c26")
public static String es_PE_FIELD_Status_DocumentStatus_Name="Estado del Documento";

@XendraTrl(Identifier="ac381fc5-22a3-302c-607d-7a44cb712c26")
public static String es_PE_FIELD_Status_DocumentStatus_Description="El estado actual del documento";

@XendraTrl(Identifier="ac381fc5-22a3-302c-607d-7a44cb712c26")
public static String es_PE_FIELD_Status_DocumentStatus_Help="El estado del documento indica el estado del documento en este momento. Si usted quiere cambiar el estado de Documento; use el campo acción de documento";

@XendraField(AD_Column_ID="DocStatus",IsCentrallyMaintained=true,
AD_Tab_ID="03769890-0cb6-401f-334c-12d35afca799",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=2,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ac381fc5-22a3-302c-607d-7a44cb712c26")
public static final String FIELDNAME_Status_DocumentStatus="ac381fc5-22a3-302c-607d-7a44cb712c26";

@XendraTrl(Identifier="22ad0809-6e12-d928-bf03-7f3b4c16f8ab")
public static String es_PE_COLUMN_DocStatus_Name="Estado del Documento";

@XendraColumn(AD_Element_ID="e73fa537-3438-bd01-dfd4-f0f080a28c55",ColumnName="DocStatus",
AD_Reference_ID=17,AD_Reference_Value_ID="7627125d-fefe-e6bc-bb7d-4a6c772172dc",AD_Val_Rule_ID="",
FieldLength=2,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="22ad0809-6e12-d928-bf03-7f3b4c16f8ab",Synchronized="2019-08-30 22:21:44.0")
/** Column name DocStatus */
public static final String COLUMNNAME_DocStatus = "DocStatus";
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
@XendraTrl(Identifier="25622789-e64e-464c-a057-bbc3b18077f8")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="25622789-e64e-464c-a057-bbc3b18077f8",
Synchronized="2019-08-30 22:21:44.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
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

@XendraTrl(Identifier="832e9f64-cad9-bc03-91ed-6cb5ae08bc69")
public static String es_PE_FIELD_Status_StatusDate_Name="Fecha";

@XendraTrl(Identifier="832e9f64-cad9-bc03-91ed-6cb5ae08bc69")
public static String es_PE_FIELD_Status_StatusDate_Description="Fecha en que se cambio a este estado";

@XendraTrl(Identifier="832e9f64-cad9-bc03-91ed-6cb5ae08bc69")
public static String es_PE_FIELD_Status_StatusDate_Help="Fecha en que se cambio a este estado";

@XendraField(AD_Column_ID="StatusDate",IsCentrallyMaintained=true,
AD_Tab_ID="03769890-0cb6-401f-334c-12d35afca799",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=7,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="832e9f64-cad9-bc03-91ed-6cb5ae08bc69")
public static final String FIELDNAME_Status_StatusDate="832e9f64-cad9-bc03-91ed-6cb5ae08bc69";

@XendraTrl(Identifier="c81264f7-26ac-ecd9-83de-4f68b0ec75ea")
public static String es_PE_COLUMN_StatusDate_Name="STATUSDATE";

@XendraColumn(AD_Element_ID="f4c6dc34-fa65-aa81-84cf-3e2d06a1583f",ColumnName="StatusDate",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c81264f7-26ac-ecd9-83de-4f68b0ec75ea",
Synchronized="2019-08-30 22:21:44.0")
/** Column name StatusDate */
public static final String COLUMNNAME_StatusDate = "StatusDate";
}
