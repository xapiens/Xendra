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
/** Generated Model for C_CommissionRun
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_CommissionRun extends PO
{
/** Standard Constructor
@param ctx context
@param C_CommissionRun_ID id
@param trxName transaction
*/
public X_C_CommissionRun (Properties ctx, int C_CommissionRun_ID, String trxName)
{
super (ctx, C_CommissionRun_ID, trxName);
/** if (C_CommissionRun_ID == 0)
{
setC_Commission_ID (0);
setC_CommissionRun_ID (0);
setDocumentNo (null);
setGrandTotal (Env.ZERO);	
// 0
setProcessed (false);	
// N
setStartDate (new Timestamp(System.currentTimeMillis()));
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_CommissionRun (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=436 */
public static int Table_ID=MTable.getTable_ID("C_CommissionRun");

@XendraTrl(Identifier="9cb13da7-5538-3e43-6051-faf750318e38")
public static String es_PE_TAB_CommissionRun_Description="Cálculo de Comisiones para un Período";

@XendraTrl(Identifier="9cb13da7-5538-3e43-6051-faf750318e38")
public static String es_PE_TAB_CommissionRun_Name="Cálculo de Comisión";

@XendraTrl(Identifier="9cb13da7-5538-3e43-6051-faf750318e38")
public static String es_PE_TAB_CommissionRun_Help="La corrida de comisiones para un período definido en la ventana de comisión.";

@XendraTab(Name="Commission Run",Description="Commission run for a period",
Help="Commission run for a period defined in the Commission window.",
AD_Window_ID="4951efe3-6b21-ab9a-5bc7-01af51e516d9",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="9cb13da7-5538-3e43-6051-faf750318e38",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_CommissionRun="9cb13da7-5538-3e43-6051-faf750318e38";

@XendraTrl(Identifier="0e44ccf3-d119-832b-a86e-42435951cd37")
public static String es_PE_TABLE_C_CommissionRun_Name="Cálculo de Comisiones";

@XendraTable(Name="Commission Run",Description="Commission Run or Process",Help="",
TableName="C_CommissionRun",AccessLevel="1",AD_Window_ID="4951efe3-6b21-ab9a-5bc7-01af51e516d9",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=135,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="0e44ccf3-d119-832b-a86e-42435951cd37",Synchronized="2017-08-16 11:41:39.0")
/** TableName=C_CommissionRun */
public static final String Table_Name="C_CommissionRun";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_CommissionRun");

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
    Table_ID = MTable.getTable_ID("C_CommissionRun");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_CommissionRun[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Commission.
@param C_Commission_ID Commission */
public void setC_Commission_ID (int C_Commission_ID)
{
if (C_Commission_ID < 1) throw new IllegalArgumentException ("C_Commission_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_Commission_ID, Integer.valueOf(C_Commission_ID));
}
/** Get Commission.
@return Commission */
public int getC_Commission_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Commission_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d813e3a4-ceea-debe-9374-d3e5db8e7595")
public static String es_PE_FIELD_CommissionRun_Commission_Description="Identificador de comisiones";

@XendraTrl(Identifier="d813e3a4-ceea-debe-9374-d3e5db8e7595")
public static String es_PE_FIELD_CommissionRun_Commission_Help="La ID de Comisiones es un identificador único de un conjunto de reglas de comisiones";

@XendraTrl(Identifier="d813e3a4-ceea-debe-9374-d3e5db8e7595")
public static String es_PE_FIELD_CommissionRun_Commission_Name="Comisión";

@XendraField(AD_Column_ID="C_Commission_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9cb13da7-5538-3e43-6051-faf750318e38",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d813e3a4-ceea-debe-9374-d3e5db8e7595")
public static final String FIELDNAME_CommissionRun_Commission="d813e3a4-ceea-debe-9374-d3e5db8e7595";

@XendraTrl(Identifier="a090c788-7654-320f-97c0-5dbfc251a179")
public static String es_PE_COLUMN_C_Commission_ID_Name="Comisión";

@XendraColumn(AD_Element_ID="08639de7-14ae-d138-fbed-28f57024bba0",ColumnName="C_Commission_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a090c788-7654-320f-97c0-5dbfc251a179",
Synchronized="2017-08-05 16:53:31.0")
/** Column name C_Commission_ID */
public static final String COLUMNNAME_C_Commission_ID = "C_Commission_ID";
/** Set Commission Run.
@param C_CommissionRun_ID Commission Run or Process */
public void setC_CommissionRun_ID (int C_CommissionRun_ID)
{
if (C_CommissionRun_ID < 1) throw new IllegalArgumentException ("C_CommissionRun_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_CommissionRun_ID, Integer.valueOf(C_CommissionRun_ID));
}
/** Get Commission Run.
@return Commission Run or Process */
public int getC_CommissionRun_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_CommissionRun_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="7eb336fd-8c39-47ff-8f55-8a5e13d6cca7")
public static String es_PE_FIELD_CommissionRun_CommissionRun_Description="Cálculo o proceso de comisiones ";

@XendraTrl(Identifier="7eb336fd-8c39-47ff-8f55-8a5e13d6cca7")
public static String es_PE_FIELD_CommissionRun_CommissionRun_Help="La Corrida de Comisión es un identificador único definido por el sistema de una corrida específica de comisiones. Cuando una comisión se procece en la pantalla de comisiones. La ID de corrida de comisiones será desplegada";

@XendraTrl(Identifier="7eb336fd-8c39-47ff-8f55-8a5e13d6cca7")
public static String es_PE_FIELD_CommissionRun_CommissionRun_Name="Cálculo de Comisiones";

@XendraField(AD_Column_ID="C_CommissionRun_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9cb13da7-5538-3e43-6051-faf750318e38",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7eb336fd-8c39-47ff-8f55-8a5e13d6cca7")
public static final String FIELDNAME_CommissionRun_CommissionRun="7eb336fd-8c39-47ff-8f55-8a5e13d6cca7";
/** Column name C_CommissionRun_ID */
public static final String COLUMNNAME_C_CommissionRun_ID = "C_CommissionRun_ID";
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

@XendraTrl(Identifier="fcda3770-b19b-5c9a-ed7a-410eedc88eab")
public static String es_PE_FIELD_CommissionRun_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="fcda3770-b19b-5c9a-ed7a-410eedc88eab")
public static String es_PE_FIELD_CommissionRun_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="fcda3770-b19b-5c9a-ed7a-410eedc88eab")
public static String es_PE_FIELD_CommissionRun_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="9cb13da7-5538-3e43-6051-faf750318e38",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fcda3770-b19b-5c9a-ed7a-410eedc88eab")
public static final String FIELDNAME_CommissionRun_Description="fcda3770-b19b-5c9a-ed7a-410eedc88eab";

@XendraTrl(Identifier="3bb91314-aa14-ed17-be46-bbb620dbbd63")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3bb91314-aa14-ed17-be46-bbb620dbbd63",
Synchronized="2017-08-05 16:53:31.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
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
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), getDocumentNo());
}

@XendraTrl(Identifier="aa51c86b-9bed-faa9-3210-51e306cef7e2")
public static String es_PE_FIELD_CommissionRun_DocumentNo_Description="Número de secuencia del documento para cada documento";

@XendraTrl(Identifier="aa51c86b-9bed-faa9-3210-51e306cef7e2")
public static String es_PE_FIELD_CommissionRun_DocumentNo_Help="El número del documento es usualmente generado en automático por el sistema y determinado por el tipo del documento. Si el documento no se salva; el número preliminar se despliega entre \"<>\"";

@XendraTrl(Identifier="aa51c86b-9bed-faa9-3210-51e306cef7e2")
public static String es_PE_FIELD_CommissionRun_DocumentNo_Name="No. del Documento";

@XendraField(AD_Column_ID="DocumentNo",IsCentrallyMaintained=true,
AD_Tab_ID="9cb13da7-5538-3e43-6051-faf750318e38",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=50,SortNo=-1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="aa51c86b-9bed-faa9-3210-51e306cef7e2")
public static final String FIELDNAME_CommissionRun_DocumentNo="aa51c86b-9bed-faa9-3210-51e306cef7e2";

@XendraTrl(Identifier="96a819d8-2321-13f1-8ab5-2c7a03508e52")
public static String es_PE_COLUMN_DocumentNo_Name="No. del Documento";

@XendraColumn(AD_Element_ID="e3ca6e28-702a-2722-d941-b2072a0de9cb",ColumnName="DocumentNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="96a819d8-2321-13f1-8ab5-2c7a03508e52",
Synchronized="2017-08-05 16:53:31.0")
/** Column name DocumentNo */
public static final String COLUMNNAME_DocumentNo = "DocumentNo";
/** Set Grand Total.
@param GrandTotal Total amount of document */
public void setGrandTotal (BigDecimal GrandTotal)
{
if (GrandTotal == null) throw new IllegalArgumentException ("GrandTotal is mandatory.");
set_ValueNoCheck (COLUMNNAME_GrandTotal, GrandTotal);
}
/** Get Grand Total.
@return Total amount of document */
public BigDecimal getGrandTotal() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_GrandTotal);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="960c00d2-3a8a-788d-e789-f01c14c70fb8")
public static String es_PE_FIELD_CommissionRun_GrandTotal_Description="Total del documento";

@XendraTrl(Identifier="960c00d2-3a8a-788d-e789-f01c14c70fb8")
public static String es_PE_FIELD_CommissionRun_GrandTotal_Help="El gran total identifica el total incluyendo impuestos y totales de fletes en la moneda del documento.";

@XendraTrl(Identifier="960c00d2-3a8a-788d-e789-f01c14c70fb8")
public static String es_PE_FIELD_CommissionRun_GrandTotal_Name="Gran Total";

@XendraField(AD_Column_ID="GrandTotal",IsCentrallyMaintained=true,
AD_Tab_ID="9cb13da7-5538-3e43-6051-faf750318e38",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=80,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="960c00d2-3a8a-788d-e789-f01c14c70fb8")
public static final String FIELDNAME_CommissionRun_GrandTotal="960c00d2-3a8a-788d-e789-f01c14c70fb8";

@XendraTrl(Identifier="ae924ad8-f255-c477-06b5-67f4a18cf5e2")
public static String es_PE_COLUMN_GrandTotal_Name="Gran Total";

@XendraColumn(AD_Element_ID="ffd614c2-6ff8-c9c6-71bf-44f369675711",ColumnName="GrandTotal",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ae924ad8-f255-c477-06b5-67f4a18cf5e2",
Synchronized="2017-08-05 16:53:31.0")
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
@XendraTrl(Identifier="93d097ac-ad5e-48ea-8bb0-3478a5340f1f")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="93d097ac-ad5e-48ea-8bb0-3478a5340f1f",
Synchronized="2017-08-05 16:53:31.0")
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

@XendraTrl(Identifier="13163b73-8f01-b763-8ce3-66c5355e6a89")
public static String es_PE_FIELD_CommissionRun_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="13163b73-8f01-b763-8ce3-66c5355e6a89")
public static String es_PE_FIELD_CommissionRun_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraTrl(Identifier="13163b73-8f01-b763-8ce3-66c5355e6a89")
public static String es_PE_FIELD_CommissionRun_Processed_Name="Procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="9cb13da7-5538-3e43-6051-faf750318e38",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="13163b73-8f01-b763-8ce3-66c5355e6a89")
public static final String FIELDNAME_CommissionRun_Processed="13163b73-8f01-b763-8ce3-66c5355e6a89";

@XendraTrl(Identifier="e5c7cc70-8947-be01-078e-ba2867f30779")
public static String es_PE_COLUMN_Processed_Name="Procesado";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e5c7cc70-8947-be01-078e-ba2867f30779",
Synchronized="2017-08-05 16:53:31.0")
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

@XendraTrl(Identifier="8c44aeab-9c00-9d02-d101-d50ac121cacd")
public static String es_PE_FIELD_CommissionRun_ProcessNow_Description="Crear factura desde cálculo de comisión";

@XendraTrl(Identifier="8c44aeab-9c00-9d02-d101-d50ac121cacd")
public static String es_PE_FIELD_CommissionRun_ProcessNow_Name="Crear Factura";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="9cb13da7-5538-3e43-6051-faf750318e38",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8c44aeab-9c00-9d02-d101-d50ac121cacd")
public static final String FIELDNAME_CommissionRun_ProcessNow="8c44aeab-9c00-9d02-d101-d50ac121cacd";

@XendraTrl(Identifier="c38adba6-49c7-0cb5-d2c2-179ae6045dd8")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="7b0e8277-a214-04d7-0fcb-e86a28888b37",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="c38adba6-49c7-0cb5-d2c2-179ae6045dd8",Synchronized="2017-08-05 16:53:31.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
/** Set Start Date.
@param StartDate First effective day (inclusive) */
public void setStartDate (Timestamp StartDate)
{
if (StartDate == null) throw new IllegalArgumentException ("StartDate is mandatory.");
set_Value (COLUMNNAME_StartDate, StartDate);
}
/** Get Start Date.
@return First effective day (inclusive) */
public Timestamp getStartDate() 
{
return (Timestamp)get_Value(COLUMNNAME_StartDate);
}

@XendraTrl(Identifier="b806fc19-0177-990c-226b-bffd5b2f953f")
public static String es_PE_FIELD_CommissionRun_StartDate_Description="Primer día efectivo (inclusive)";

@XendraTrl(Identifier="b806fc19-0177-990c-226b-bffd5b2f953f")
public static String es_PE_FIELD_CommissionRun_StartDate_Help="La fecha de Inicio indica la primera fecha ó fecha inicial de un rango";

@XendraTrl(Identifier="b806fc19-0177-990c-226b-bffd5b2f953f")
public static String es_PE_FIELD_CommissionRun_StartDate_Name="Fecha de Inicio";

@XendraField(AD_Column_ID="StartDate",IsCentrallyMaintained=true,
AD_Tab_ID="9cb13da7-5538-3e43-6051-faf750318e38",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b806fc19-0177-990c-226b-bffd5b2f953f")
public static final String FIELDNAME_CommissionRun_StartDate="b806fc19-0177-990c-226b-bffd5b2f953f";

@XendraTrl(Identifier="4feadf30-fc99-8cb1-cc32-ab94c2eceae7")
public static String es_PE_COLUMN_StartDate_Name="Fecha de Inicio";

@XendraColumn(AD_Element_ID="3fe42406-cab3-a569-bf0b-3614f5d95711",ColumnName="StartDate",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4feadf30-fc99-8cb1-cc32-ab94c2eceae7",
Synchronized="2017-08-05 16:53:31.0")
/** Column name StartDate */
public static final String COLUMNNAME_StartDate = "StartDate";
}
