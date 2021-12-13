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
/** Generated Model for C_PaymentBatch
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_PaymentBatch extends PO
{
/** Standard Constructor
@param ctx context
@param C_PaymentBatch_ID id
@param trxName transaction
*/
public X_C_PaymentBatch (Properties ctx, int C_PaymentBatch_ID, String trxName)
{
super (ctx, C_PaymentBatch_ID, trxName);
/** if (C_PaymentBatch_ID == 0)
{
setC_PaymentBatch_ID (0);
setC_PaymentProcessor_ID (0);
setName (null);
setProcessed (false);	
// N
setProcessing (false);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_PaymentBatch (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=411 */
public static int Table_ID=MTable.getTable_ID("C_PaymentBatch");

@XendraTrl(Identifier="8e6744af-1828-d249-5ff0-0a2df757c7bd")
public static String es_PE_TAB_PaymentBatch_Name="Lote de Pago";
@XendraTab(Name="Payment Batch",
Description="Process Payment Batch",Help="Electronic Fund Transfer Payment Batch.",
AD_Window_ID="ac9cbe03-2007-ff60-2240-d4b45270528e",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="8e6744af-1828-d249-5ff0-0a2df757c7bd",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_PaymentBatch="8e6744af-1828-d249-5ff0-0a2df757c7bd";

@XendraTrl(Identifier="522a6fdb-e836-3d69-e9ab-0d8903504c9e")
public static String es_PE_TABLE_C_PaymentBatch_Name="Lote de Pagos";

@XendraTable(Name="Payment Batch",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Payment batch for EFT",Help="",
TableName="C_PaymentBatch",AccessLevel="1",AD_Window_ID="ac9cbe03-2007-ff60-2240-d4b45270528e",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=100,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="522a6fdb-e836-3d69-e9ab-0d8903504c9e",Synchronized="2020-03-03 21:37:20.0")
/** TableName=C_PaymentBatch */
public static final String Table_Name="C_PaymentBatch";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_PaymentBatch");

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
    Table_ID = MTable.getTable_ID("C_PaymentBatch");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_PaymentBatch[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Payment Batch.
@param C_PaymentBatch_ID Payment batch for EFT */
public void setC_PaymentBatch_ID (int C_PaymentBatch_ID)
{
if (C_PaymentBatch_ID < 1) throw new IllegalArgumentException ("C_PaymentBatch_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_PaymentBatch_ID, Integer.valueOf(C_PaymentBatch_ID));
}
/** Get Payment Batch.
@return Payment batch for EFT */
public int getC_PaymentBatch_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_PaymentBatch_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="9baa1f8c-72b2-0d50-6f05-af1a628ee924")
public static String es_PE_FIELD_PaymentBatch_PaymentBatch_Name="Lote de Pagos";

@XendraField(AD_Column_ID="C_PaymentBatch_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8e6744af-1828-d249-5ff0-0a2df757c7bd",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9baa1f8c-72b2-0d50-6f05-af1a628ee924")
public static final String FIELDNAME_PaymentBatch_PaymentBatch="9baa1f8c-72b2-0d50-6f05-af1a628ee924";
/** Column name C_PaymentBatch_ID */
public static final String COLUMNNAME_C_PaymentBatch_ID = "C_PaymentBatch_ID";
/** Set Payment Processor.
@param C_PaymentProcessor_ID Payment processor for electronic payments */
public void setC_PaymentProcessor_ID (int C_PaymentProcessor_ID)
{
if (C_PaymentProcessor_ID < 1) throw new IllegalArgumentException ("C_PaymentProcessor_ID is mandatory.");
set_Value (COLUMNNAME_C_PaymentProcessor_ID, Integer.valueOf(C_PaymentProcessor_ID));
}
/** Get Payment Processor.
@return Payment processor for electronic payments */
public int getC_PaymentProcessor_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_PaymentProcessor_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="61d080c4-5d86-4f32-7779-271f43827939")
public static String es_PE_FIELD_PaymentBatch_PaymentProcessor_Name="Procesador de Pago";

@XendraTrl(Identifier="61d080c4-5d86-4f32-7779-271f43827939")
public static String es_PE_FIELD_PaymentBatch_PaymentProcessor_Description="Procesador de pagos para pagos electrónicos.";

@XendraTrl(Identifier="61d080c4-5d86-4f32-7779-271f43827939")
public static String es_PE_FIELD_PaymentBatch_PaymentProcessor_Help="El procesador de pagos indica el procesador a ser usado para pagos electrónicos.";

@XendraField(AD_Column_ID="C_PaymentProcessor_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8e6744af-1828-d249-5ff0-0a2df757c7bd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="61d080c4-5d86-4f32-7779-271f43827939")
public static final String FIELDNAME_PaymentBatch_PaymentProcessor="61d080c4-5d86-4f32-7779-271f43827939";

@XendraTrl(Identifier="5493c4a1-08a3-d358-9650-ec9689d9e1af")
public static String es_PE_COLUMN_C_PaymentProcessor_ID_Name="Procesador de Pago";

@XendraColumn(AD_Element_ID="0e2b1bb2-38c6-a2d0-fe06-34f8bdf1e2e9",
ColumnName="C_PaymentProcessor_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="5493c4a1-08a3-d358-9650-ec9689d9e1af",Synchronized="2019-08-30 22:21:57.0")
/** Column name C_PaymentProcessor_ID */
public static final String COLUMNNAME_C_PaymentProcessor_ID = "C_PaymentProcessor_ID";
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
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), getDocumentNo());
}

@XendraTrl(Identifier="75e9e829-7e93-501f-a0d0-1a30841752e6")
public static String es_PE_FIELD_PaymentBatch_DocumentNo_Name="No. del Documento";

@XendraTrl(Identifier="75e9e829-7e93-501f-a0d0-1a30841752e6")
public static String es_PE_FIELD_PaymentBatch_DocumentNo_Description="Número de secuencia del documento para cada documento";

@XendraTrl(Identifier="75e9e829-7e93-501f-a0d0-1a30841752e6")
public static String es_PE_FIELD_PaymentBatch_DocumentNo_Help="El número del documento es usualmente generado en automático por el sistema y determinado por el tipo del documento. Si el documento no se salva; el número preliminar se despliega entre \"<>\"";

@XendraField(AD_Column_ID="DocumentNo",IsCentrallyMaintained=true,
AD_Tab_ID="8e6744af-1828-d249-5ff0-0a2df757c7bd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=50,SortNo=-1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="75e9e829-7e93-501f-a0d0-1a30841752e6")
public static final String FIELDNAME_PaymentBatch_DocumentNo="75e9e829-7e93-501f-a0d0-1a30841752e6";

@XendraTrl(Identifier="ee88f24d-2706-078b-3efb-8be09b0b3700")
public static String es_PE_COLUMN_DocumentNo_Name="No. del Documento";

@XendraColumn(AD_Element_ID="e3ca6e28-702a-2722-d941-b2072a0de9cb",ColumnName="DocumentNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ee88f24d-2706-078b-3efb-8be09b0b3700",
Synchronized="2019-08-30 22:21:57.0")
/** Column name DocumentNo */
public static final String COLUMNNAME_DocumentNo = "DocumentNo";
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
@XendraTrl(Identifier="a8fe5183-d68a-4804-aa25-7bf3c1505603")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a8fe5183-d68a-4804-aa25-7bf3c1505603",
Synchronized="2019-08-30 22:21:57.0")
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
@XendraTrl(Identifier="ef984f62-2f40-8a26-ea6d-fd115a3096a8")
public static String es_PE_FIELD_PaymentBatch_Name_Name="Nombre";

@XendraTrl(Identifier="ef984f62-2f40-8a26-ea6d-fd115a3096a8")
public static String es_PE_FIELD_PaymentBatch_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="ef984f62-2f40-8a26-ea6d-fd115a3096a8")
public static String es_PE_FIELD_PaymentBatch_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="8e6744af-1828-d249-5ff0-0a2df757c7bd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ef984f62-2f40-8a26-ea6d-fd115a3096a8")
public static final String FIELDNAME_PaymentBatch_Name="ef984f62-2f40-8a26-ea6d-fd115a3096a8";

@XendraTrl(Identifier="f31bb283-dadb-e638-fea5-fe1689566269")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f31bb283-dadb-e638-fea5-fe1689566269",
Synchronized="2019-08-30 22:21:57.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
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

@XendraTrl(Identifier="5880c9d4-66c0-8c34-9bdf-40133195a8cf")
public static String es_PE_FIELD_PaymentBatch_Processed_Name="Procesado";

@XendraTrl(Identifier="5880c9d4-66c0-8c34-9bdf-40133195a8cf")
public static String es_PE_FIELD_PaymentBatch_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="5880c9d4-66c0-8c34-9bdf-40133195a8cf")
public static String es_PE_FIELD_PaymentBatch_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="8e6744af-1828-d249-5ff0-0a2df757c7bd",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=20,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5880c9d4-66c0-8c34-9bdf-40133195a8cf")
public static final String FIELDNAME_PaymentBatch_Processed="5880c9d4-66c0-8c34-9bdf-40133195a8cf";

@XendraTrl(Identifier="2abb4153-b645-b0b6-975c-76db4d221994")
public static String es_PE_COLUMN_Processed_Name="Procesado";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2abb4153-b645-b0b6-975c-76db4d221994",
Synchronized="2019-08-30 22:21:57.0")
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

@XendraTrl(Identifier="3e94606c-d801-c361-0dd6-5246d457f499")
public static String es_PE_FIELD_PaymentBatch_ProcessNow_Name="Procesar Ahora";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="8e6744af-1828-d249-5ff0-0a2df757c7bd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=true,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3e94606c-d801-c361-0dd6-5246d457f499")
public static final String FIELDNAME_PaymentBatch_ProcessNow="3e94606c-d801-c361-0dd6-5246d457f499";

@XendraTrl(Identifier="fcc7dff0-b6f1-9919-cd9e-9766f8d04788")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fcc7dff0-b6f1-9919-cd9e-9766f8d04788",
Synchronized="2019-08-30 22:21:57.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
/** Set Processing date.
@param ProcessingDate Processing date */
public void setProcessingDate (Timestamp ProcessingDate)
{
set_Value (COLUMNNAME_ProcessingDate, ProcessingDate);
}
/** Get Processing date.
@return Processing date */
public Timestamp getProcessingDate() 
{
return (Timestamp)get_Value(COLUMNNAME_ProcessingDate);
}

@XendraTrl(Identifier="08893072-369e-954e-5033-eab2892f7101")
public static String es_PE_FIELD_PaymentBatch_ProcessingDate_Name="Fecha del Proceso";

@XendraField(AD_Column_ID="ProcessingDate",IsCentrallyMaintained=true,
AD_Tab_ID="8e6744af-1828-d249-5ff0-0a2df757c7bd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=90,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="08893072-369e-954e-5033-eab2892f7101")
public static final String FIELDNAME_PaymentBatch_ProcessingDate="08893072-369e-954e-5033-eab2892f7101";

@XendraTrl(Identifier="c7b512f2-66ea-b968-8497-f2ba6476a422")
public static String es_PE_COLUMN_ProcessingDate_Name="Fecha del Proceso";

@XendraColumn(AD_Element_ID="e5ffd38f-cf25-980f-1ffe-a121e4480937",ColumnName="ProcessingDate",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c7b512f2-66ea-b968-8497-f2ba6476a422",
Synchronized="2019-08-30 22:21:57.0")
/** Column name ProcessingDate */
public static final String COLUMNNAME_ProcessingDate = "ProcessingDate";
}
