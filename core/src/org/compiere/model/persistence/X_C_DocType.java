/******************************************************************************
 * Product: Xendra ERP & CRM Smart Business Solution                          *
 * Copyright (C)  dravios       All Rights Reserved.                          *
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
/** Generated Model for C_DocType
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_DocType extends PO
{
/** Standard Constructor
@param ctx context
@param C_DocType_ID id
@param trxName transaction
*/
public X_C_DocType (Properties ctx, int C_DocType_ID, String trxName)
{
super (ctx, C_DocType_ID, trxName);
/** if (C_DocType_ID == 0)
{
setC_DocType_ID (0);
setConsolidateDocument (false);	
// N
setDocBaseType (null);
setDocumentCopies (0);	
// 1
setGL_Category_ID (0);
setHasCharges (false);	
// N
setIsCreateCounter (true);	
// Y
setIsDefault (false);	
// N
setIsDefaultCounterDoc (false);	
// N
setIsDocNoControlled (true);	
// Y
setIsIndexed (false);	
// N
setIsInTransit (false);	
// N
setIsPickQAConfirm (false);	
// N
setIsShipConfirm (false);	
// N
setIsSOTrx (false);	
// N
setIsSplitWhenDifference (false);	
// N
setIsTaxable (true);	
// Y
setName (null);
setPrintName (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_DocType (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=217 */
public static int Table_ID=MTable.getTable_ID("C_DocType");

@XendraTrl(Identifier="cec45b4f-070f-857a-115e-4f69320167bc")
public static String es_PE_TAB_DocumentType_Description="Tipo de Documento";

@XendraTrl(Identifier="cec45b4f-070f-857a-115e-4f69320167bc")
public static String es_PE_TAB_DocumentType_Help="La pestaña de definición de documento define los parámetros de procesamiento y control del documento.";

@XendraTrl(Identifier="cec45b4f-070f-857a-115e-4f69320167bc")
public static String es_PE_TAB_DocumentType_Name="Tipo de Documento";

@XendraTab(Name="Document Type",Description="Define a Document Type",
Help="The Document Definition Tab defines the processing parameters and controls for the document.  Note that shipments for automatic documents like POS/Warehouse Orders cannot have confirmations!",
AD_Window_ID="e28a3366-4323-3c55-8fbc-2d66ef1d2ac6",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="cec45b4f-070f-857a-115e-4f69320167bc",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_DocumentType="cec45b4f-070f-857a-115e-4f69320167bc";

@XendraTrl(Identifier="66b40cf2-eb8a-69a5-013b-07a243930200")
public static String es_PE_TABLE_C_DocType_Name="Tipo de Documento";

@XendraTable(Name="Document Type",AD_Package_ID="140d4d0c-8da8-bcb6-9c20-bc776701f80c",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Document type or rules",Help="",
TableName="C_DocType",AccessLevel="6",AD_Window_ID="e28a3366-4323-3c55-8fbc-2d66ef1d2ac6",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=100,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.dictionary",
Identifier="66b40cf2-eb8a-69a5-013b-07a243930200",Synchronized="2023-03-22 21:24:37.0")
/** TableName=C_DocType */
public static final String Table_Name="C_DocType";


@XendraIndex(Name="c_doctype_name",Identifier="91ae432f-c62b-5319-4ab3-10ec8da47e37",
Column_Names="ad_client_id, name",IsUnique="true",
TableIdentifier="91ae432f-c62b-5319-4ab3-10ec8da47e37",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_c_doctype_name = "91ae432f-c62b-5319-4ab3-10ec8da47e37";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_DocType");

protected BigDecimal accessLevel = BigDecimal.valueOf(6);
/** AccessLevel
@return 6 - System - Client 
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
    Table_ID = MTable.getTable_ID("C_DocType");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_DocType[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Message Format.
@param AD_MessageFormat_ID Message Format */
public void setAD_MessageFormat_ID (int AD_MessageFormat_ID)
{
if (AD_MessageFormat_ID <= 0) set_Value (COLUMNNAME_AD_MessageFormat_ID, null);
 else 
set_Value (COLUMNNAME_AD_MessageFormat_ID, Integer.valueOf(AD_MessageFormat_ID));
}
/** Get Message Format.
@return Message Format */
public int getAD_MessageFormat_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_MessageFormat_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ef376aa9-f3c2-4b76-a75e-bc2b3be57594")
public static String es_PE_FIELD_DocumentType_MessageFormat_Name="Message Format";

@XendraField(AD_Column_ID="AD_MessageFormat_ID",IsCentrallyMaintained=true,
AD_Tab_ID="cec45b4f-070f-857a-115e-4f69320167bc",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=480,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2017-10-17 15:31:32.0",
Identifier="ef376aa9-f3c2-4b76-a75e-bc2b3be57594")
public static final String FIELDNAME_DocumentType_MessageFormat="ef376aa9-f3c2-4b76-a75e-bc2b3be57594";

@XendraTrl(Identifier="c4cdec80-7f44-4b69-96fa-5591007bc1c3")
public static String es_PE_COLUMN_AD_MessageFormat_ID_Name="Message Format";

@XendraColumn(AD_Element_ID="4bfbf9f8-a9e2-4831-bd11-0a42552d9e0c",
ColumnName="AD_MessageFormat_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="c4cdec80-7f44-4b69-96fa-5591007bc1c3",Synchronized="2023-03-22 18:53:52.0")
/** Column name AD_MessageFormat_ID */
public static final String COLUMNNAME_AD_MessageFormat_ID = "AD_MessageFormat_ID";
/** Set AD_Rule_ID.
@param AD_Rule_ID AD_Rule_ID */
public void setAD_Rule_ID (int AD_Rule_ID)
{
if (AD_Rule_ID <= 0) set_Value (COLUMNNAME_AD_Rule_ID, null);
 else 
set_Value (COLUMNNAME_AD_Rule_ID, Integer.valueOf(AD_Rule_ID));
}
/** Get AD_Rule_ID.
@return AD_Rule_ID */
public int getAD_Rule_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Rule_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="af9ef5a9-8c9d-444f-a25b-e032c6759653")
public static String es_PE_FIELD_DocumentType_AD_Rule_ID_Name="Rule";

@XendraField(AD_Column_ID="AD_Rule_ID",IsCentrallyMaintained=true,
AD_Tab_ID="cec45b4f-070f-857a-115e-4f69320167bc",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-05-23 10:52:54.0",
Identifier="af9ef5a9-8c9d-444f-a25b-e032c6759653")
public static final String FIELDNAME_DocumentType_AD_Rule_ID="af9ef5a9-8c9d-444f-a25b-e032c6759653";

@XendraTrl(Identifier="4cfdb22c-e03a-4ee0-b5c0-b7cd084af4b4")
public static String es_PE_COLUMN_AD_Rule_ID_Name="AD_Rule_ID";

@XendraColumn(AD_Element_ID="4b4afdeb-6aca-d182-6e3a-83f0f6d29f7d",ColumnName="AD_Rule_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="42e2d04c-574d-4cad-893a-55549ab9889b",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="4cfdb22c-e03a-4ee0-b5c0-b7cd084af4b4",Synchronized="2023-03-22 18:53:52.0")
/** Column name AD_Rule_ID */
public static final String COLUMNNAME_AD_Rule_ID = "AD_Rule_ID";
/** Set Machine Printers.
@param A_MachinePrinter_ID Machine Printers */
public void setA_MachinePrinter_ID (int A_MachinePrinter_ID)
{
if (A_MachinePrinter_ID <= 0) set_Value (COLUMNNAME_A_MachinePrinter_ID, null);
 else 
set_Value (COLUMNNAME_A_MachinePrinter_ID, Integer.valueOf(A_MachinePrinter_ID));
}
/** Get Machine Printers.
@return Machine Printers */
public int getA_MachinePrinter_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_A_MachinePrinter_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="0729995f-4cd2-4aa5-875e-b2579f8e853f")
public static String es_PE_FIELD_DocumentType_MachinePrinters_Name="Machine Printers";

@XendraField(AD_Column_ID="A_MachinePrinter_ID",IsCentrallyMaintained=true,
AD_Tab_ID="cec45b4f-070f-857a-115e-4f69320167bc",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=400,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-07-08 09:07:58.0",
Identifier="0729995f-4cd2-4aa5-875e-b2579f8e853f")
public static final String FIELDNAME_DocumentType_MachinePrinters="0729995f-4cd2-4aa5-875e-b2579f8e853f";

@XendraTrl(Identifier="2444a952-089a-4161-a3f9-706e952bba28")
public static String es_PE_COLUMN_A_MachinePrinter_ID_Name="Machine Printers";

@XendraColumn(AD_Element_ID="fa4c3bfb-dfa3-42a8-a824-52c7681d5045",
ColumnName="A_MachinePrinter_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="2444a952-089a-4161-a3f9-706e952bba28",Synchronized="2023-03-22 18:53:52.0")
/** Column name A_MachinePrinter_ID */
public static final String COLUMNNAME_A_MachinePrinter_ID = "A_MachinePrinter_ID";
/** Set C_ConversionTypeClose_ID.
@param C_ConversionTypeClose_ID C_ConversionTypeClose_ID */
public void setC_ConversionTypeClose_ID (int C_ConversionTypeClose_ID)
{
if (C_ConversionTypeClose_ID <= 0) set_Value (COLUMNNAME_C_ConversionTypeClose_ID, null);
 else 
set_Value (COLUMNNAME_C_ConversionTypeClose_ID, Integer.valueOf(C_ConversionTypeClose_ID));
}
/** Get C_ConversionTypeClose_ID.
@return C_ConversionTypeClose_ID */
public int getC_ConversionTypeClose_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_ConversionTypeClose_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="e1eed8a4-ab17-438e-9126-d364a0a668a9")
public static String es_PE_FIELD_DocumentType_C_ConversionTypeClose_ID_Name="Tip. moneda de cierre";

@XendraTrl(Identifier="e1eed8a4-ab17-438e-9126-d364a0a668a9")
public static String es_PE_FIELD_DocumentType_C_ConversionTypeClose_ID_Help="Se coloca el tipo de moneda que se usar[a para el cierre contable";

@XendraField(AD_Column_ID="C_ConversionTypeClose_ID",IsCentrallyMaintained=true,
AD_Tab_ID="cec45b4f-070f-857a-115e-4f69320167bc",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=300,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2015-05-05 18:25:40.0",
Identifier="e1eed8a4-ab17-438e-9126-d364a0a668a9")
public static final String FIELDNAME_DocumentType_C_ConversionTypeClose_ID="e1eed8a4-ab17-438e-9126-d364a0a668a9";

@XendraTrl(Identifier="8af74e2f-8cfb-40ff-9c1b-1ac2873a77fd")
public static String es_PE_COLUMN_C_ConversionTypeClose_ID_Name="c_conversiontypeclose_id";

@XendraColumn(AD_Element_ID="5ee970dd-0419-411c-be3f-37d9e1e8ed37",
ColumnName="C_ConversionTypeClose_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="41dda287-7ecf-a6d1-d177-b35716a62768",AD_Val_Rule_ID="",FieldLength=10,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="8af74e2f-8cfb-40ff-9c1b-1ac2873a77fd",
Synchronized="2023-03-22 18:53:52.0")
/** Column name C_ConversionTypeClose_ID */
public static final String COLUMNNAME_C_ConversionTypeClose_ID = "C_ConversionTypeClose_ID";
/** Set Currency Type.
@param C_ConversionType_ID Currency Conversion Rate Type */
public void setC_ConversionType_ID (int C_ConversionType_ID)
{
if (C_ConversionType_ID <= 0) set_Value (COLUMNNAME_C_ConversionType_ID, null);
 else 
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

@XendraTrl(Identifier="cc1f7cef-a273-3d6d-bc52-8983f93744dd")
public static String es_PE_FIELD_DocumentType_CurrencyType_Name="Tipo de Moneda";

@XendraTrl(Identifier="cc1f7cef-a273-3d6d-bc52-8983f93744dd")
public static String es_PE_FIELD_DocumentType_CurrencyType_Help="El tipo del índice de conversión de monedas le deja definir diversos tipos de tarifas, tarifas ej. del punto, corporativas y/o de Ventas/Compras.";

@XendraTrl(Identifier="cc1f7cef-a273-3d6d-bc52-8983f93744dd")
public static String es_PE_FIELD_DocumentType_CurrencyType_Description="Tipo de índice de conversión de moneda ";

@XendraField(AD_Column_ID="C_ConversionType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="cec45b4f-070f-857a-115e-4f69320167bc",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=290,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cc1f7cef-a273-3d6d-bc52-8983f93744dd")
public static final String FIELDNAME_DocumentType_CurrencyType="cc1f7cef-a273-3d6d-bc52-8983f93744dd";

@XendraTrl(Identifier="4d4d9650-7e51-6389-1b38-9668a9ec1d44")
public static String es_PE_COLUMN_C_ConversionType_ID_Name="Currency Type";

@XendraColumn(AD_Element_ID="66f5d039-c94d-0957-487b-eb3118bd7719",
ColumnName="C_ConversionType_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="4d4d9650-7e51-6389-1b38-9668a9ec1d44",Synchronized="2023-03-22 18:53:52.0")
/** Column name C_ConversionType_ID */
public static final String COLUMNNAME_C_ConversionType_ID = "C_ConversionType_ID";
/** Set Difference Document.
@param C_DocTypeDifference_ID Document type for generating in dispute Shipments */
public void setC_DocTypeDifference_ID (int C_DocTypeDifference_ID)
{
if (C_DocTypeDifference_ID <= 0) set_Value (COLUMNNAME_C_DocTypeDifference_ID, null);
 else 
set_Value (COLUMNNAME_C_DocTypeDifference_ID, Integer.valueOf(C_DocTypeDifference_ID));
}
/** Get Difference Document.
@return Document type for generating in dispute Shipments */
public int getC_DocTypeDifference_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_DocTypeDifference_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="5e434c98-163f-f547-f603-9a5e15753259")
public static String es_PE_FIELD_DocumentType_DifferenceDocument_Name="Diferencia del documento";

@XendraTrl(Identifier="5e434c98-163f-f547-f603-9a5e15753259")
public static String es_PE_FIELD_DocumentType_DifferenceDocument_Help="Si la confirmación contiene diferencias, el documento original está partido permitiendo que el documento original (envío) sea procesado y poniendo al día el inventario - y el documento nuevamente creado para manejar el conflicto en un rato más adelante. Hasta que se procesa la confirmación, el inventario no es actualizado.";

@XendraTrl(Identifier="5e434c98-163f-f547-f603-9a5e15753259")
public static String es_PE_FIELD_DocumentType_DifferenceDocument_Description="Tipo del documento para generar discuciones en entregas.";

@XendraField(AD_Column_ID="C_DocTypeDifference_ID",IsCentrallyMaintained=true,
AD_Tab_ID="cec45b4f-070f-857a-115e-4f69320167bc",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsSplitWhenDifference@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=230,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="5e434c98-163f-f547-f603-9a5e15753259")
public static final String FIELDNAME_DocumentType_DifferenceDocument="5e434c98-163f-f547-f603-9a5e15753259";

@XendraTrl(Identifier="cd999a2c-3a9f-f020-b209-cb071b5bd5d9")
public static String es_PE_COLUMN_C_DocTypeDifference_ID_Name="Diferencia del documento";

@XendraColumn(AD_Element_ID="193fcd10-fa13-afe1-05af-60d0191242a4",
ColumnName="C_DocTypeDifference_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="f06eaf85-a231-e1cf-ebf8-59d002c13ab4",
AD_Val_Rule_ID="866fc58e-64cf-49ec-1bca-67fbef3f5cc0",FieldLength=22,DefaultValue="",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cd999a2c-3a9f-f020-b209-cb071b5bd5d9",
Synchronized="2023-03-22 18:53:52.0")
/** Column name C_DocTypeDifference_ID */
public static final String COLUMNNAME_C_DocTypeDifference_ID = "C_DocTypeDifference_ID";
/** Set Document Type.
@param C_DocType_ID Document type or rules */
public void setC_DocType_ID (int C_DocType_ID)
{
if (C_DocType_ID < 0) throw new IllegalArgumentException ("C_DocType_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_DocType_ID, Integer.valueOf(C_DocType_ID));
}
/** Get Document Type.
@return Document type or rules */
public int getC_DocType_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_DocType_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="0ce5ee37-e06e-ed5b-6c75-fb6ce422c15a")
public static String es_PE_FIELD_DocumentType_DocumentType_Name="Tipo de Documento";

@XendraTrl(Identifier="0ce5ee37-e06e-ed5b-6c75-fb6ce422c15a")
public static String es_PE_FIELD_DocumentType_DocumentType_Help="El tipo de documento determina la secuencia del documento y las reglas de proceso";

@XendraTrl(Identifier="0ce5ee37-e06e-ed5b-6c75-fb6ce422c15a")
public static String es_PE_FIELD_DocumentType_DocumentType_Description="Tipo de documento ó reglas";

@XendraField(AD_Column_ID="C_DocType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="cec45b4f-070f-857a-115e-4f69320167bc",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0ce5ee37-e06e-ed5b-6c75-fb6ce422c15a")
public static final String FIELDNAME_DocumentType_DocumentType="0ce5ee37-e06e-ed5b-6c75-fb6ce422c15a";
/** Column name C_DocType_ID */
public static final String COLUMNNAME_C_DocType_ID = "C_DocType_ID";
/** Set Document Type for Invoice.
@param C_DocTypeInvoice_ID Document type used for invoices generated from this sales document */
public void setC_DocTypeInvoice_ID (int C_DocTypeInvoice_ID)
{
if (C_DocTypeInvoice_ID <= 0) set_Value (COLUMNNAME_C_DocTypeInvoice_ID, null);
 else 
set_Value (COLUMNNAME_C_DocTypeInvoice_ID, Integer.valueOf(C_DocTypeInvoice_ID));
}
/** Get Document Type for Invoice.
@return Document type used for invoices generated from this sales document */
public int getC_DocTypeInvoice_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_DocTypeInvoice_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="6322d719-9fc1-59b2-8073-bd965a1dd739")
public static String es_PE_FIELD_DocumentType_DocumentTypeForInvoice_Name="Tipo de Documento para la Factura";

@XendraTrl(Identifier="6322d719-9fc1-59b2-8073-bd965a1dd739")
public static String es_PE_FIELD_DocumentType_DocumentTypeForInvoice_Help="El Tipo de documento para factura indica el tipo de documento que será usado cuando una factura se genera desde este documento de venta. Este campo se desplegará solamente cuando el tipo de documento base sea orden de venta";

@XendraTrl(Identifier="6322d719-9fc1-59b2-8073-bd965a1dd739")
public static String es_PE_FIELD_DocumentType_DocumentTypeForInvoice_Description="Tipo del documento usado para facturas generadas desde este documento de ventas";

@XendraField(AD_Column_ID="C_DocTypeInvoice_ID",IsCentrallyMaintained=true,
AD_Tab_ID="cec45b4f-070f-857a-115e-4f69320167bc",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@DocBaseType@='SOO' | @DocBaseType='POO'",DisplayLength=14,IsReadOnly=false,
SeqNo=160,SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="6322d719-9fc1-59b2-8073-bd965a1dd739")
public static final String FIELDNAME_DocumentType_DocumentTypeForInvoice="6322d719-9fc1-59b2-8073-bd965a1dd739";

@XendraTrl(Identifier="cd7d265c-8118-e8c0-a790-2877f8f684ad")
public static String es_PE_COLUMN_C_DocTypeInvoice_ID_Name="Tipo de Documento para la Factura";

@XendraColumn(AD_Element_ID="0ac54edf-4695-2447-7e66-c34b1424e89a",
ColumnName="C_DocTypeInvoice_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="f06eaf85-a231-e1cf-ebf8-59d002c13ab4",
AD_Val_Rule_ID="3618c2e5-5c32-687f-83f6-d13e5296d9e4",FieldLength=22,DefaultValue="",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cd7d265c-8118-e8c0-a790-2877f8f684ad",
Synchronized="2023-03-22 18:53:52.0")
/** Column name C_DocTypeInvoice_ID */
public static final String COLUMNNAME_C_DocTypeInvoice_ID = "C_DocTypeInvoice_ID";
/** Set Document Type for ProForma.
@param C_DocTypeProforma_ID Document type used for pro forma invoices generated from this sales document */
public void setC_DocTypeProforma_ID (int C_DocTypeProforma_ID)
{
if (C_DocTypeProforma_ID <= 0) set_Value (COLUMNNAME_C_DocTypeProforma_ID, null);
 else 
set_Value (COLUMNNAME_C_DocTypeProforma_ID, Integer.valueOf(C_DocTypeProforma_ID));
}
/** Get Document Type for ProForma.
@return Document type used for pro forma invoices generated from this sales document */
public int getC_DocTypeProforma_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_DocTypeProforma_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f8b437b2-f72b-309a-474c-d725121931f0")
public static String es_PE_FIELD_DocumentType_DocumentTypeForProForma_Name="Tipo de Documento para Pro forma";

@XendraTrl(Identifier="f8b437b2-f72b-309a-474c-d725121931f0")
public static String es_PE_FIELD_DocumentType_DocumentTypeForProForma_Help="El Tipo de documento para factura indica el tipo de documento que será usado cuando una factura se genera desde este documento de venta. Este campo se desplegará solamente cuando el tipo de documento base sea orden de venta.";

@XendraTrl(Identifier="f8b437b2-f72b-309a-474c-d725121931f0")
public static String es_PE_FIELD_DocumentType_DocumentTypeForProForma_Description="Tipo del documento usado para facturas pro forma generadas desde este documento de ventas";

@XendraField(AD_Column_ID="C_DocTypeProforma_ID",IsCentrallyMaintained=true,
AD_Tab_ID="cec45b4f-070f-857a-115e-4f69320167bc",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@DocBaseType@='SOO' & @HasProforma@='Y'",DisplayLength=14,IsReadOnly=false,SeqNo=150,
SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="f8b437b2-f72b-309a-474c-d725121931f0")
public static final String FIELDNAME_DocumentType_DocumentTypeForProForma="f8b437b2-f72b-309a-474c-d725121931f0";

@XendraTrl(Identifier="b49a1adf-4c8d-d3fd-89f6-8fc865b26eb8")
public static String es_PE_COLUMN_C_DocTypeProforma_ID_Name="Tipo de Documento para Pro forma";

@XendraColumn(AD_Element_ID="80edd96a-67e3-e114-9601-d250af006558",
ColumnName="C_DocTypeProforma_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="f06eaf85-a231-e1cf-ebf8-59d002c13ab4",
AD_Val_Rule_ID="077e0f59-7277-13e7-b301-6bd2a378b17d",FieldLength=22,DefaultValue="",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b49a1adf-4c8d-d3fd-89f6-8fc865b26eb8",
Synchronized="2023-03-22 18:53:52.0")
/** Column name C_DocTypeProforma_ID */
public static final String COLUMNNAME_C_DocTypeProforma_ID = "C_DocTypeProforma_ID";
/** Set Document Type for Shipment.
@param C_DocTypeShipment_ID Document type used for shipments generated from this sales document */
public void setC_DocTypeShipment_ID (int C_DocTypeShipment_ID)
{
if (C_DocTypeShipment_ID <= 0) set_Value (COLUMNNAME_C_DocTypeShipment_ID, null);
 else 
set_Value (COLUMNNAME_C_DocTypeShipment_ID, Integer.valueOf(C_DocTypeShipment_ID));
}
/** Get Document Type for Shipment.
@return Document type used for shipments generated from this sales document */
public int getC_DocTypeShipment_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_DocTypeShipment_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="6550e551-1222-1832-bf70-b9892dd584dc")
public static String es_PE_FIELD_DocumentType_DocumentTypeForShipment_Name="Tipo de Documento para la Entrega";

@XendraTrl(Identifier="6550e551-1222-1832-bf70-b9892dd584dc")
public static String es_PE_FIELD_DocumentType_DocumentTypeForShipment_Help="El Tipo de documento para la entrega indica el tipo de documento que será usado cuando una entrega se genera desde este documento de venta. Este campo se desplegará solamente cuando el tipo de documento base sea orden de venta";

@XendraTrl(Identifier="6550e551-1222-1832-bf70-b9892dd584dc")
public static String es_PE_FIELD_DocumentType_DocumentTypeForShipment_Description="Tipo del documento usado para la entrega generados desde este documento de ventas";

@XendraField(AD_Column_ID="C_DocTypeShipment_ID",IsCentrallyMaintained=true,
AD_Tab_ID="cec45b4f-070f-857a-115e-4f69320167bc",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@DocBaseType@='SOO' | @DocBaseType='POO'",DisplayLength=14,IsReadOnly=false,
SeqNo=170,SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="6550e551-1222-1832-bf70-b9892dd584dc")
public static final String FIELDNAME_DocumentType_DocumentTypeForShipment="6550e551-1222-1832-bf70-b9892dd584dc";

@XendraTrl(Identifier="2168c0d6-3c5f-5ad8-70c5-340c756a4d5a")
public static String es_PE_COLUMN_C_DocTypeShipment_ID_Name="Tipo de Documento para la Entrega";

@XendraColumn(AD_Element_ID="fba1541a-49c3-3297-5836-20153dbda900",
ColumnName="C_DocTypeShipment_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="f06eaf85-a231-e1cf-ebf8-59d002c13ab4",
AD_Val_Rule_ID="dd6fc25f-c92c-fb01-6714-8c13e0ee2cde",FieldLength=22,DefaultValue="",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2168c0d6-3c5f-5ad8-70c5-340c756a4d5a",
Synchronized="2023-03-22 18:53:52.0")
/** Column name C_DocTypeShipment_ID */
public static final String COLUMNNAME_C_DocTypeShipment_ID = "C_DocTypeShipment_ID";
/** Set C_DocumentTax_ID.
@param C_DocumentTax_ID C_DocumentTax_ID */
public void setC_DocumentTax_ID (int C_DocumentTax_ID)
{
if (C_DocumentTax_ID <= 0) set_Value (COLUMNNAME_C_DocumentTax_ID, null);
 else 
set_Value (COLUMNNAME_C_DocumentTax_ID, Integer.valueOf(C_DocumentTax_ID));
}
/** Get C_DocumentTax_ID.
@return C_DocumentTax_ID */
public int getC_DocumentTax_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_DocumentTax_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ab313464-ae7c-4009-b743-399af43cbc0f")
public static String es_PE_FIELD_DocumentType_C_DocumentTax_ID_Name="Codigo de Gobierno";

@XendraTrl(Identifier="ab313464-ae7c-4009-b743-399af43cbc0f")
public static String es_PE_FIELD_DocumentType_C_DocumentTax_ID_Help="Tabla 10 anexo_3 SUNAT-PERU";

@XendraTrl(Identifier="ab313464-ae7c-4009-b743-399af43cbc0f")
public static String es_PE_FIELD_DocumentType_C_DocumentTax_ID_Description="C_DocumentTax_ID";

@XendraField(AD_Column_ID="C_DocumentTax_ID",IsCentrallyMaintained=true,
AD_Tab_ID="cec45b4f-070f-857a-115e-4f69320167bc",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2019-03-19 22:44:29.0",
Identifier="ab313464-ae7c-4009-b743-399af43cbc0f")
public static final String FIELDNAME_DocumentType_C_DocumentTax_ID="ab313464-ae7c-4009-b743-399af43cbc0f";

@XendraTrl(Identifier="c76302da-4d78-4b9c-b013-8729e3ef2a53")
public static String es_PE_COLUMN_C_DocumentTax_ID_Name="C_DocumentTax_ID";

@XendraColumn(AD_Element_ID="3a17e163-d2ff-4751-a29e-8450bc7d2ac1",ColumnName="C_DocumentTax_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c76302da-4d78-4b9c-b013-8729e3ef2a53",
Synchronized="2023-03-22 18:53:52.0")
/** Column name C_DocumentTax_ID */
public static final String COLUMNNAME_C_DocumentTax_ID = "C_DocumentTax_ID";
/** Set Sunat Document Code.
@param CodSunat Sunat Document Code */
public void setCodSunat (String CodSunat)
{
if (CodSunat != null && CodSunat.length() > 2)
{
log.warning("Length > 2 - truncated");
CodSunat = CodSunat.substring(0,1);
}
set_Value (COLUMNNAME_CodSunat, CodSunat);
}
/** Get Sunat Document Code.
@return Sunat Document Code */
public String getCodSunat() 
{
String value = (String)get_Value(COLUMNNAME_CodSunat);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="d31eac79-f817-48e6-fe4d-cccd38c1c274")
public static String es_PE_FIELD_DocumentType_SunatDocumentCode_Name="Código Sunat";

@XendraField(AD_Column_ID="CodSunat",IsCentrallyMaintained=true,
AD_Tab_ID="cec45b4f-070f-857a-115e-4f69320167bc",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=0,IsReadOnly=false,SeqNo=280,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d31eac79-f817-48e6-fe4d-cccd38c1c274")
public static final String FIELDNAME_DocumentType_SunatDocumentCode="d31eac79-f817-48e6-fe4d-cccd38c1c274";

@XendraTrl(Identifier="04e2f914-1b11-60c7-0f8a-249e07989760")
public static String es_PE_COLUMN_CodSunat_Name="Código Sunat";

@XendraColumn(AD_Element_ID="84884f14-1f72-b5d2-c38f-d807ef550fd4",ColumnName="CodSunat",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="04e2f914-1b11-60c7-0f8a-249e07989760",
Synchronized="2023-03-22 18:47:54.0")
/** Column name CodSunat */
public static final String COLUMNNAME_CodSunat = "CodSunat";
/** Set Consolidate to one Document.
@param ConsolidateDocument Consolidate Lines into one Document */
public void setConsolidateDocument (boolean ConsolidateDocument)
{
set_Value (COLUMNNAME_ConsolidateDocument, Boolean.valueOf(ConsolidateDocument));
}
/** Get Consolidate to one Document.
@return Consolidate Lines into one Document */
public boolean isConsolidateDocument() 
{
Object oo = get_Value(COLUMNNAME_ConsolidateDocument);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="1f2b277f-6b6f-4620-b90b-261e047a1e61")
public static String es_PE_FIELD_DocumentType_ConsolidateToOneDocument_Name="Consolidado en un Documento";

@XendraTrl(Identifier="1f2b277f-6b6f-4620-b90b-261e047a1e61")
public static String es_PE_FIELD_DocumentType_ConsolidateToOneDocument_Description="Lineas consolidadas en un documento";

@XendraField(AD_Column_ID="ConsolidateDocument",IsCentrallyMaintained=true,
AD_Tab_ID="cec45b4f-070f-857a-115e-4f69320167bc",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=420,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2015-05-05 18:25:40.0",
Identifier="1f2b277f-6b6f-4620-b90b-261e047a1e61")
public static final String FIELDNAME_DocumentType_ConsolidateToOneDocument="1f2b277f-6b6f-4620-b90b-261e047a1e61";

@XendraTrl(Identifier="b4f32e07-4e90-6ab8-8e54-973cd2bd330c")
public static String es_PE_COLUMN_ConsolidateDocument_Name="Consolidate to one Document";

@XendraColumn(AD_Element_ID="be0b888f-e4c3-c1eb-0a48-68c496b6c612",
ColumnName="ConsolidateDocument",AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="N",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="b4f32e07-4e90-6ab8-8e54-973cd2bd330c",Synchronized="2023-03-22 18:53:52.0")
/** Column name ConsolidateDocument */
public static final String COLUMNNAME_ConsolidateDocument = "ConsolidateDocument";
/** Set C_PrinterDocumentFormat_ID.
@param C_PrinterDocumentFormat_ID C_PrinterDocumentFormat_ID */
public void setC_PrinterDocumentFormat_ID (int C_PrinterDocumentFormat_ID)
{
if (C_PrinterDocumentFormat_ID <= 0) set_Value (COLUMNNAME_C_PrinterDocumentFormat_ID, null);
 else 
set_Value (COLUMNNAME_C_PrinterDocumentFormat_ID, Integer.valueOf(C_PrinterDocumentFormat_ID));
}
/** Get C_PrinterDocumentFormat_ID.
@return C_PrinterDocumentFormat_ID */
public int getC_PrinterDocumentFormat_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_PrinterDocumentFormat_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="1fe08c45-1334-4599-8c26-454c4ee958e3")
public static String es_PE_FIELD_DocumentType_C_PrinterDocumentFormat_ID_Name="C_PrinterDocumentFormat_ID";

@XendraTrl(Identifier="1fe08c45-1334-4599-8c26-454c4ee958e3")
public static String es_PE_FIELD_DocumentType_C_PrinterDocumentFormat_ID_Help="C_PrinterDocumentFormat_ID";

@XendraTrl(Identifier="1fe08c45-1334-4599-8c26-454c4ee958e3")
public static String es_PE_FIELD_DocumentType_C_PrinterDocumentFormat_ID_Description="C_PrinterDocumentFormat_ID";

@XendraField(AD_Column_ID="C_PrinterDocumentFormat_ID",IsCentrallyMaintained=true,
AD_Tab_ID="cec45b4f-070f-857a-115e-4f69320167bc",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=390,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2015-05-05 18:25:40.0",
Identifier="1fe08c45-1334-4599-8c26-454c4ee958e3")
public static final String FIELDNAME_DocumentType_C_PrinterDocumentFormat_ID="1fe08c45-1334-4599-8c26-454c4ee958e3";

@XendraTrl(Identifier="bda064c3-c7d3-4dd3-9779-14db561ab6cb")
public static String es_PE_COLUMN_C_PrinterDocumentFormat_ID_Name="C_PrinterDocumentFormat_ID";

@XendraColumn(AD_Element_ID="443bb6f7-8eb3-4556-98cf-f2ccd4d59324",
ColumnName="C_PrinterDocumentFormat_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="bda064c3-c7d3-4dd3-9779-14db561ab6cb",Synchronized="2023-03-22 18:53:52.0")
/** Column name C_PrinterDocumentFormat_ID */
public static final String COLUMNNAME_C_PrinterDocumentFormat_ID = "C_PrinterDocumentFormat_ID";
/** Set Definite Sequence.
@param DefiniteSequence_ID Definite Sequence */
public void setDefiniteSequence_ID (int DefiniteSequence_ID)
{
if (DefiniteSequence_ID <= 0) set_Value (COLUMNNAME_DefiniteSequence_ID, null);
 else 
set_Value (COLUMNNAME_DefiniteSequence_ID, Integer.valueOf(DefiniteSequence_ID));
}
/** Get Definite Sequence.
@return Definite Sequence */
public int getDefiniteSequence_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_DefiniteSequence_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="2015508a-eb3e-02ae-4c47-7d04100dc245")
public static String es_PE_FIELD_DocumentType_DefiniteSequence_Name="Secuencia";

@XendraField(AD_Column_ID="DefiniteSequence_ID",IsCentrallyMaintained=true,
AD_Tab_ID="cec45b4f-070f-857a-115e-4f69320167bc",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@DocSubType@='WR' | @DocSubType@='RM'",DisplayLength=10,IsReadOnly=false,SeqNo=310,
SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="2015508a-eb3e-02ae-4c47-7d04100dc245")
public static final String FIELDNAME_DocumentType_DefiniteSequence="2015508a-eb3e-02ae-4c47-7d04100dc245";

@XendraTrl(Identifier="fa656b32-4190-c81f-3bfc-6875c2433f92")
public static String es_PE_COLUMN_DefiniteSequence_ID_Name="definitesequence_id";

@XendraColumn(AD_Element_ID="74b266b6-d29b-3da9-13db-05a2a936d3bb",
ColumnName="DefiniteSequence_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="4aa462a2-7603-59ba-08c7-4982c43f3ad7",AD_Val_Rule_ID="",FieldLength=10,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="fa656b32-4190-c81f-3bfc-6875c2433f92",
Synchronized="2023-03-22 18:53:52.0")
/** Column name DefiniteSequence_ID */
public static final String COLUMNNAME_DefiniteSequence_ID = "DefiniteSequence_ID";
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

@XendraTrl(Identifier="a041fd2c-b387-099c-a6ec-7ee3a3d732e9")
public static String es_PE_FIELD_DocumentType_Description_Name="Observación";

@XendraTrl(Identifier="a041fd2c-b387-099c-a6ec-7ee3a3d732e9")
public static String es_PE_FIELD_DocumentType_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="a041fd2c-b387-099c-a6ec-7ee3a3d732e9")
public static String es_PE_FIELD_DocumentType_Description_Description="Observación corta opcional del registro";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="cec45b4f-070f-857a-115e-4f69320167bc",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a041fd2c-b387-099c-a6ec-7ee3a3d732e9")
public static final String FIELDNAME_DocumentType_Description="a041fd2c-b387-099c-a6ec-7ee3a3d732e9";

@XendraTrl(Identifier="ea1866c0-1a61-4790-19aa-0c5cf72f35ad")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ea1866c0-1a61-4790-19aa-0c5cf72f35ad",
Synchronized="2023-03-22 18:53:52.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Document BaseType.
@param DocBaseType Logical type of document */
public void setDocBaseType (String DocBaseType)
{
if (DocBaseType.length() > 3)
{
log.warning("Length > 3 - truncated");
DocBaseType = DocBaseType.substring(0,2);
}
set_Value (COLUMNNAME_DocBaseType, DocBaseType);
}
/** Get Document BaseType.
@return Logical type of document */
public String getDocBaseType() 
{
return (String)get_Value(COLUMNNAME_DocBaseType);
}

@XendraTrl(Identifier="51ea1d58-634c-f803-502e-187907b0d22e")
public static String es_PE_FIELD_DocumentType_DocumentBaseType_Name="Tipo de Documento Base";

@XendraTrl(Identifier="51ea1d58-634c-f803-502e-187907b0d22e")
public static String es_PE_FIELD_DocumentType_DocumentBaseType_Help="El tipo base de documento identifica la base ó punto de inicio de un documento. Múltiples tipos de documento pueden compartir un tipo base de documento simple.";

@XendraTrl(Identifier="51ea1d58-634c-f803-502e-187907b0d22e")
public static String es_PE_FIELD_DocumentType_DocumentBaseType_Description="Identifica el punto de inicio para un documento";

@XendraField(AD_Column_ID="DocBaseType",IsCentrallyMaintained=true,
AD_Tab_ID="cec45b4f-070f-857a-115e-4f69320167bc",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=120,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="51ea1d58-634c-f803-502e-187907b0d22e")
public static final String FIELDNAME_DocumentType_DocumentBaseType="51ea1d58-634c-f803-502e-187907b0d22e";

@XendraTrl(Identifier="2826d044-aeaf-9c19-cfd9-63eac58e1f1d")
public static String es_PE_COLUMN_DocBaseType_Name="Tipo de Documento Base";

@XendraColumn(AD_Element_ID="d03cb659-5074-3721-d480-034c74c562e4",ColumnName="DocBaseType",
AD_Reference_ID=17,AD_Reference_Value_ID="c1999318-834d-4c66-5345-371ffe3c1f06",AD_Val_Rule_ID="",
FieldLength=3,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="2826d044-aeaf-9c19-cfd9-63eac58e1f1d",Synchronized="2023-03-22 18:53:53.0")
/** Column name DocBaseType */
public static final String COLUMNNAME_DocBaseType = "DocBaseType";
/** Set Document Sequence.
@param DocNoSequence_ID Document sequence determines the numbering of documents */
public void setDocNoSequence_ID (int DocNoSequence_ID)
{
if (DocNoSequence_ID <= 0) set_Value (COLUMNNAME_DocNoSequence_ID, null);
 else 
set_Value (COLUMNNAME_DocNoSequence_ID, Integer.valueOf(DocNoSequence_ID));
}
/** Get Document Sequence.
@return Document sequence determines the numbering of documents */
public int getDocNoSequence_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_DocNoSequence_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="8fee1a40-7858-9418-d8d0-d3e2c76e7d08")
public static String es_PE_FIELD_DocumentType_DocumentSequence_Name="Secuencia del Documento";

@XendraTrl(Identifier="8fee1a40-7858-9418-d8d0-d3e2c76e7d08")
public static String es_PE_FIELD_DocumentType_DocumentSequence_Help="La Secuencia del Documento indica la regla de secuencia a usar para este tipo de documento";

@XendraTrl(Identifier="8fee1a40-7858-9418-d8d0-d3e2c76e7d08")
public static String es_PE_FIELD_DocumentType_DocumentSequence_Description="La secuencia del documento determina la numeración del documento";

@XendraField(AD_Column_ID="DocNoSequence_ID",IsCentrallyMaintained=true,
AD_Tab_ID="cec45b4f-070f-857a-115e-4f69320167bc",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsDocNoControlled@='Y'",DisplayLength=14,IsReadOnly=false,SeqNo=190,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="8fee1a40-7858-9418-d8d0-d3e2c76e7d08")
public static final String FIELDNAME_DocumentType_DocumentSequence="8fee1a40-7858-9418-d8d0-d3e2c76e7d08";

@XendraTrl(Identifier="8922f292-950f-faa6-393e-0b17b9da7ea4")
public static String es_PE_COLUMN_DocNoSequence_ID_Name="Secuencia del Documento";

@XendraColumn(AD_Element_ID="4d302914-efea-caae-2817-b28fc3ecb505",ColumnName="DocNoSequence_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="4aa462a2-7603-59ba-08c7-4982c43f3ad7",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="8922f292-950f-faa6-393e-0b17b9da7ea4",Synchronized="2023-03-22 18:53:54.0")
/** Column name DocNoSequence_ID */
public static final String COLUMNNAME_DocNoSequence_ID = "DocNoSequence_ID";
/** Set DocSubType.
@param DocSubType DocSubType */
public void setDocSubType (String DocSubType)
{
if (DocSubType != null && DocSubType.length() > 2)
{
log.warning("Length > 2 - truncated");
DocSubType = DocSubType.substring(0,1);
}
set_Value (COLUMNNAME_DocSubType, DocSubType);
}
/** Get DocSubType.
@return DocSubType */
public String getDocSubType() 
{
return (String)get_Value(COLUMNNAME_DocSubType);
}

@XendraTrl(Identifier="1d6279ae-f5de-455c-93dd-fc05900cea43")
public static String es_PE_FIELD_DocumentType_DocSubType_Name="docsubtype";

@XendraField(AD_Column_ID="DocSubType",IsCentrallyMaintained=true,
AD_Tab_ID="cec45b4f-070f-857a-115e-4f69320167bc",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=2,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2017-10-17 15:31:33.0",
Identifier="1d6279ae-f5de-455c-93dd-fc05900cea43")
public static final String FIELDNAME_DocumentType_DocSubType="1d6279ae-f5de-455c-93dd-fc05900cea43";

@XendraTrl(Identifier="96bdadcb-6647-4dd7-a961-8f0993df359f")
public static String es_PE_COLUMN_DocSubType_Name="docsubtype";

@XendraColumn(AD_Element_ID="fb4bbd74-90d7-4304-81fa-8bef0a7479f5",ColumnName="DocSubType",
AD_Reference_ID=17,AD_Reference_Value_ID="510701bb-3d4a-4be3-a6ef-074558e57de9",AD_Val_Rule_ID="",
FieldLength=2,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="96bdadcb-6647-4dd7-a961-8f0993df359f",Synchronized="2023-03-22 18:53:54.0")
/** Column name DocSubType */
public static final String COLUMNNAME_DocSubType = "DocSubType";
/** Set Document Copies.
@param DocumentCopies Number of copies to be printed */
public void setDocumentCopies (int DocumentCopies)
{
set_Value (COLUMNNAME_DocumentCopies, Integer.valueOf(DocumentCopies));
}
/** Get Document Copies.
@return Number of copies to be printed */
public int getDocumentCopies() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_DocumentCopies);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="e264d000-5933-8c65-f467-4e97626ea492")
public static String es_PE_FIELD_DocumentType_DocumentCopies_Name="Copias del Documento";

@XendraTrl(Identifier="e264d000-5933-8c65-f467-4e97626ea492")
public static String es_PE_FIELD_DocumentType_DocumentCopies_Help="Copias de documento indica el número de copias de cada documento que será generado";

@XendraTrl(Identifier="e264d000-5933-8c65-f467-4e97626ea492")
public static String es_PE_FIELD_DocumentType_DocumentCopies_Description="Número de copias a ser impresas";

@XendraField(AD_Column_ID="DocumentCopies",IsCentrallyMaintained=true,
AD_Tab_ID="cec45b4f-070f-857a-115e-4f69320167bc",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=270,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e264d000-5933-8c65-f467-4e97626ea492")
public static final String FIELDNAME_DocumentType_DocumentCopies="e264d000-5933-8c65-f467-4e97626ea492";

@XendraTrl(Identifier="55605d18-27f3-541f-3275-ea53193c20df")
public static String es_PE_COLUMN_DocumentCopies_Name="Copias del Documento";

@XendraColumn(AD_Element_ID="df034791-81d2-e06f-9337-e45426c348fa",ColumnName="DocumentCopies",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="1",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="0",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="55605d18-27f3-541f-3275-ea53193c20df",
Synchronized="2023-03-22 18:53:54.0")
/** Column name DocumentCopies */
public static final String COLUMNNAME_DocumentCopies = "DocumentCopies";
/** Set Document Note.
@param DocumentNote Additional information for a Document */
public void setDocumentNote (String DocumentNote)
{
set_Value (COLUMNNAME_DocumentNote, DocumentNote);
}
/** Get Document Note.
@return Additional information for a Document */
public String getDocumentNote() 
{
String value = (String)get_Value(COLUMNNAME_DocumentNote);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="aca1782a-e312-b92f-aeeb-ba1643d36684")
public static String es_PE_FIELD_DocumentType_DocumentNote_Name="Nota de Documento";

@XendraTrl(Identifier="aca1782a-e312-b92f-aeeb-ba1643d36684")
public static String es_PE_FIELD_DocumentType_DocumentNote_Help="La nota de documento se usa para registrar cualquier información adicional considerando este producto.";

@XendraTrl(Identifier="aca1782a-e312-b92f-aeeb-ba1643d36684")
public static String es_PE_FIELD_DocumentType_DocumentNote_Description="Información adicional para un documento";

@XendraField(AD_Column_ID="DocumentNote",IsCentrallyMaintained=true,
AD_Tab_ID="cec45b4f-070f-857a-115e-4f69320167bc",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="aca1782a-e312-b92f-aeeb-ba1643d36684")
public static final String FIELDNAME_DocumentType_DocumentNote="aca1782a-e312-b92f-aeeb-ba1643d36684";

@XendraTrl(Identifier="2e14d7d7-2cbd-5f51-4112-6e7712b6af47")
public static String es_PE_COLUMN_DocumentNote_Name="Nota de Documento";

@XendraColumn(AD_Element_ID="facce503-36ce-65e5-ad96-c872503feb2e",ColumnName="DocumentNote",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2e14d7d7-2cbd-5f51-4112-6e7712b6af47",
Synchronized="2023-03-22 18:53:54.0")
/** Column name DocumentNote */
public static final String COLUMNNAME_DocumentNote = "DocumentNote";
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

@XendraTrl(Identifier="e5fbdf2f-9092-8f1a-74c2-f48e5b33693a")
public static String es_PE_FIELD_DocumentType_GLCategory_Name="Categoría CG";

@XendraTrl(Identifier="e5fbdf2f-9092-8f1a-74c2-f48e5b33693a")
public static String es_PE_FIELD_DocumentType_GLCategory_Help="La Categoría de Contabilidad General es un método opcional; definido por el usuario; de agrupación de líneas de las pólizas";

@XendraTrl(Identifier="e5fbdf2f-9092-8f1a-74c2-f48e5b33693a")
public static String es_PE_FIELD_DocumentType_GLCategory_Description="Categoría de Contabilidad General";

@XendraField(AD_Column_ID="GL_Category_ID",IsCentrallyMaintained=true,
AD_Tab_ID="cec45b4f-070f-857a-115e-4f69320167bc",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e5fbdf2f-9092-8f1a-74c2-f48e5b33693a")
public static final String FIELDNAME_DocumentType_GLCategory="e5fbdf2f-9092-8f1a-74c2-f48e5b33693a";

@XendraTrl(Identifier="6db0b768-08a7-a0ce-0cc0-d3af05d6052d")
public static String es_PE_COLUMN_GL_Category_ID_Name="Categoría CG";

@XendraColumn(AD_Element_ID="b3063a1c-d28b-42fc-2d1b-27037b4d6514",ColumnName="GL_Category_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6db0b768-08a7-a0ce-0cc0-d3af05d6052d",
Synchronized="2023-03-22 18:53:54.0")
/** Column name GL_Category_ID */
public static final String COLUMNNAME_GL_Category_ID = "GL_Category_ID";
/** Set Charges.
@param HasCharges Charges can be added to the document */
public void setHasCharges (boolean HasCharges)
{
set_Value (COLUMNNAME_HasCharges, Boolean.valueOf(HasCharges));
}
/** Get Charges.
@return Charges can be added to the document */
public boolean isHasCharges() 
{
Object oo = get_Value(COLUMNNAME_HasCharges);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="15830931-dc1a-78ea-6d02-f1fdf834d7a4")
public static String es_PE_FIELD_DocumentType_Charges_Name="Cargos";

@XendraTrl(Identifier="15830931-dc1a-78ea-6d02-f1fdf834d7a4")
public static String es_PE_FIELD_DocumentType_Charges_Help="El cuadro de verificación indica que algún cargo puede ser agregado a este documento. Los cargos pueden incluir articulos como despacho; manejo ó cargos bancarios.";

@XendraTrl(Identifier="15830931-dc1a-78ea-6d02-f1fdf834d7a4")
public static String es_PE_FIELD_DocumentType_Charges_Description="Cargos pueden ser agregados al documento";

@XendraField(AD_Column_ID="HasCharges",IsCentrallyMaintained=true,
AD_Tab_ID="cec45b4f-070f-857a-115e-4f69320167bc",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="15830931-dc1a-78ea-6d02-f1fdf834d7a4")
public static final String FIELDNAME_DocumentType_Charges="15830931-dc1a-78ea-6d02-f1fdf834d7a4";

@XendraTrl(Identifier="d9b6ac31-a756-811f-7681-2e16a40c9f2a")
public static String es_PE_COLUMN_HasCharges_Name="Cargos";

@XendraColumn(AD_Element_ID="f9754972-542a-9c91-4b1c-ca71171568c9",ColumnName="HasCharges",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d9b6ac31-a756-811f-7681-2e16a40c9f2a",
Synchronized="2023-03-22 18:53:54.0")
/** Column name HasCharges */
public static final String COLUMNNAME_HasCharges = "HasCharges";
/** Set Pro forma Invoice.
@param HasProforma Indicates if Pro Forma Invoices can be generated from this document */
public void setHasProforma (boolean HasProforma)
{
set_Value (COLUMNNAME_HasProforma, Boolean.valueOf(HasProforma));
}
/** Get Pro forma Invoice.
@return Indicates if Pro Forma Invoices can be generated from this document */
public boolean isHasProforma() 
{
Object oo = get_Value(COLUMNNAME_HasProforma);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="b17d81a6-c97b-216f-9770-f114718a64f9")
public static String es_PE_FIELD_DocumentType_ProFormaInvoice_Name="Factura Pro Forma";

@XendraTrl(Identifier="b17d81a6-c97b-216f-9770-f114718a64f9")
public static String es_PE_FIELD_DocumentType_ProFormaInvoice_Help="El cuadro de verificación factura Pro forma indica si las facturas pro forma pueden ser generadas desde este documento de ventas. Una factura pro forma indica el total que vencerá debido al embarque de una orden.";

@XendraTrl(Identifier="b17d81a6-c97b-216f-9770-f114718a64f9")
public static String es_PE_FIELD_DocumentType_ProFormaInvoice_Description="Indica si facturas Pro forma pueden ser generadas desde este documento.";

@XendraField(AD_Column_ID="HasProforma",IsCentrallyMaintained=true,
AD_Tab_ID="cec45b4f-070f-857a-115e-4f69320167bc",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@DocBaseType@='SOO'",DisplayLength=1,IsReadOnly=false,SeqNo=140,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="b17d81a6-c97b-216f-9770-f114718a64f9")
public static final String FIELDNAME_DocumentType_ProFormaInvoice="b17d81a6-c97b-216f-9770-f114718a64f9";

@XendraTrl(Identifier="4fb072fa-009a-6198-5d98-be46fed59de2")
public static String es_PE_COLUMN_HasProforma_Name="Factura Pro Forma";

@XendraColumn(AD_Element_ID="38b8b908-1563-14f4-9a3d-fe740dc853d1",ColumnName="HasProforma",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4fb072fa-009a-6198-5d98-be46fed59de2",
Synchronized="2023-03-22 18:53:54.0")
/** Column name HasProforma */
public static final String COLUMNNAME_HasProforma = "HasProforma";
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
@XendraTrl(Identifier="4592203d-cab3-4a44-ac97-8ecfe0b6067e")
public static String es_PE_FIELD_DocumentType_Identifier_Name="Identifier";

@XendraField(AD_Column_ID="Identifier",IsCentrallyMaintained=true,
AD_Tab_ID="cec45b4f-070f-857a-115e-4f69320167bc",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=36,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2015-05-05 18:25:40.0",
Identifier="4592203d-cab3-4a44-ac97-8ecfe0b6067e")
public static final String FIELDNAME_DocumentType_Identifier="4592203d-cab3-4a44-ac97-8ecfe0b6067e";

@XendraTrl(Identifier="8cb68cd8-a35e-4116-9cd9-dce89907a79b")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8cb68cd8-a35e-4116-9cd9-dce89907a79b",
Synchronized="2023-03-22 18:53:54.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set InvoiceOperationTypeCode.
@param InvoiceOperationTypeCode InvoiceOperationTypeCode */
public void setInvoiceOperationTypeCode (String InvoiceOperationTypeCode)
{
if (InvoiceOperationTypeCode != null && InvoiceOperationTypeCode.length() > 4)
{
log.warning("Length > 4 - truncated");
InvoiceOperationTypeCode = InvoiceOperationTypeCode.substring(0,3);
}
set_Value (COLUMNNAME_InvoiceOperationTypeCode, InvoiceOperationTypeCode);
}
/** Get InvoiceOperationTypeCode.
@return InvoiceOperationTypeCode */
public String getInvoiceOperationTypeCode() 
{
return (String)get_Value(COLUMNNAME_InvoiceOperationTypeCode);
}

@XendraTrl(Identifier="c4bd3c2c-4d12-42db-a3c4-abfbb04c3644")
public static String es_PE_COLUMN_InvoiceOperationTypeCode_Name="InvoiceOperationTypeCode";

@XendraColumn(AD_Element_ID="4d3dc7e7-3e66-4042-aa41-dc44f35d0905",
ColumnName="InvoiceOperationTypeCode",AD_Reference_ID=17,
AD_Reference_Value_ID="f21e0f28-1211-4c12-98f0-1449784900c6",AD_Val_Rule_ID="",FieldLength=4,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="c4bd3c2c-4d12-42db-a3c4-abfbb04c3644",
Synchronized="2023-03-22 19:23:49.0")
/** Column name InvoiceOperationTypeCode */
public static final String COLUMNNAME_InvoiceOperationTypeCode = "InvoiceOperationTypeCode";
/** Set Create Counter Document.
@param IsCreateCounter Create Counter Document */
public void setIsCreateCounter (boolean IsCreateCounter)
{
set_Value (COLUMNNAME_IsCreateCounter, Boolean.valueOf(IsCreateCounter));
}
/** Get Create Counter Document.
@return Create Counter Document */
public boolean isCreateCounter() 
{
Object oo = get_Value(COLUMNNAME_IsCreateCounter);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="1efe2b60-7a07-dccb-20a5-6c141e385a59")
public static String es_PE_FIELD_DocumentType_CreateCounterDocument_Name="Crea Contador de Documento";

@XendraTrl(Identifier="1efe2b60-7a07-dccb-20a5-6c141e385a59")
public static String es_PE_FIELD_DocumentType_CreateCounterDocument_Help="Si es seleccionado, crea un contador de documento especifico. Si no esta seleccionado, no crea contador de documento para el tipo de documento.";

@XendraTrl(Identifier="1efe2b60-7a07-dccb-20a5-6c141e385a59")
public static String es_PE_FIELD_DocumentType_CreateCounterDocument_Description="Crea Contador de documento";

@XendraField(AD_Column_ID="IsCreateCounter",IsCentrallyMaintained=true,
AD_Tab_ID="cec45b4f-070f-857a-115e-4f69320167bc",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@DocBaseType@='SOO' | @DocBaseType@='POO' | @DocBaseType@='MMR' | @DocBaseType@='MMS' | @DocBaseType@='API' | @DocBaseType@='APC' | @DocBaseType@='ARI' | @DocBaseType@='ARC' | @DocBaseType@='ARR' | @DocBaseType@='APP'",
DisplayLength=1,IsReadOnly=false,SeqNo=250,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1efe2b60-7a07-dccb-20a5-6c141e385a59")
public static final String FIELDNAME_DocumentType_CreateCounterDocument="1efe2b60-7a07-dccb-20a5-6c141e385a59";

@XendraTrl(Identifier="b3ede220-4cea-7096-5350-4ca40c95ba6a")
public static String es_PE_COLUMN_IsCreateCounter_Name="Crea Contador de Documento";

@XendraColumn(AD_Element_ID="176e0b61-2a2f-c5bc-b1ec-e15e5fa6e121",ColumnName="IsCreateCounter",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b3ede220-4cea-7096-5350-4ca40c95ba6a",
Synchronized="2023-03-22 18:53:54.0")
/** Column name IsCreateCounter */
public static final String COLUMNNAME_IsCreateCounter = "IsCreateCounter";
/** Set Default.
@param IsDefault Default value */
public void setIsDefault (boolean IsDefault)
{
set_Value (COLUMNNAME_IsDefault, Boolean.valueOf(IsDefault));
}
/** Get Default.
@return Default value */
public boolean isDefault() 
{
Object oo = get_Value(COLUMNNAME_IsDefault);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="3270de54-4bb2-3023-6223-d6b750580acd")
public static String es_PE_FIELD_DocumentType_Default_Name="Predeterminado";

@XendraTrl(Identifier="3270de54-4bb2-3023-6223-d6b750580acd")
public static String es_PE_FIELD_DocumentType_Default_Help="El cuadro de verificación indica si este registro será usado como un valor predeterminado";

@XendraTrl(Identifier="3270de54-4bb2-3023-6223-d6b750580acd")
public static String es_PE_FIELD_DocumentType_Default_Description="Valor Predeterminado";

@XendraField(AD_Column_ID="IsDefault",IsCentrallyMaintained=true,
AD_Tab_ID="cec45b4f-070f-857a-115e-4f69320167bc",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3270de54-4bb2-3023-6223-d6b750580acd")
public static final String FIELDNAME_DocumentType_Default="3270de54-4bb2-3023-6223-d6b750580acd";

@XendraTrl(Identifier="70c598b0-9ff3-6e8a-ba53-c1db1f3bd9f1")
public static String es_PE_COLUMN_IsDefault_Name="Predeterminado";

@XendraColumn(AD_Element_ID="8617f892-e113-a5fd-8715-687f792f136c",ColumnName="IsDefault",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="70c598b0-9ff3-6e8a-ba53-c1db1f3bd9f1",
Synchronized="2023-03-22 18:53:54.0")
/** Column name IsDefault */
public static final String COLUMNNAME_IsDefault = "IsDefault";
/** Set Default Counter Document.
@param IsDefaultCounterDoc The document type is the default counter document type */
public void setIsDefaultCounterDoc (boolean IsDefaultCounterDoc)
{
set_Value (COLUMNNAME_IsDefaultCounterDoc, Boolean.valueOf(IsDefaultCounterDoc));
}
/** Get Default Counter Document.
@return The document type is the default counter document type */
public boolean isDefaultCounterDoc() 
{
Object oo = get_Value(COLUMNNAME_IsDefaultCounterDoc);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="26dabe95-7b51-1a6f-0874-bb089c89262c")
public static String es_PE_FIELD_DocumentType_DefaultCounterDocument_Name="Contador de Documento predeterminado";

@XendraTrl(Identifier="26dabe95-7b51-1a6f-0874-bb089c89262c")
public static String es_PE_FIELD_DocumentType_DefaultCounterDocument_Help="Al usar los documentos explícitos para la inter-org transacción (después de ligar a un socio de negocio a una organización), usted puede determinar en qué tipo de documento se basa el documento contrario en el tipo de documento de la transacción original. Ejemplo: cuando la generación las ventas pide, utiliza este tipo de documento de la orden de las ventas. Este defecto puede ser sobreescrito definiendo relaciones contrarias explícitas del documento.";

@XendraTrl(Identifier="26dabe95-7b51-1a6f-0874-bb089c89262c")
public static String es_PE_FIELD_DocumentType_DefaultCounterDocument_Description="El tipo del documento es el tipo de contador de documento predeterminado";

@XendraField(AD_Column_ID="IsDefaultCounterDoc",IsCentrallyMaintained=true,
AD_Tab_ID="cec45b4f-070f-857a-115e-4f69320167bc",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@DocBaseType@='SOO' | @DocBaseType@='POO' | @DocBaseType@='MMR' | @DocBaseType@='MMS' | @DocBaseType@='API' | @DocBaseType@='APC' | @DocBaseType@='ARI' | @DocBaseType@='ARC'",
DisplayLength=1,IsReadOnly=false,SeqNo=260,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="26dabe95-7b51-1a6f-0874-bb089c89262c")
public static final String FIELDNAME_DocumentType_DefaultCounterDocument="26dabe95-7b51-1a6f-0874-bb089c89262c";

@XendraTrl(Identifier="9ecc4a20-7ff0-ccec-9b45-28c8a0d4f83d")
public static String es_PE_COLUMN_IsDefaultCounterDoc_Name="Contador de Documento predeterminado";

@XendraColumn(AD_Element_ID="82567530-531f-bada-e4b1-55d16df61e8e",
ColumnName="IsDefaultCounterDoc",AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="N",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="9ecc4a20-7ff0-ccec-9b45-28c8a0d4f83d",Synchronized="2023-03-22 18:53:54.0")
/** Column name IsDefaultCounterDoc */
public static final String COLUMNNAME_IsDefaultCounterDoc = "IsDefaultCounterDoc";
/** Set Document is Number Controlled.
@param IsDocNoControlled The document has a document sequence */
public void setIsDocNoControlled (boolean IsDocNoControlled)
{
set_Value (COLUMNNAME_IsDocNoControlled, Boolean.valueOf(IsDocNoControlled));
}
/** Get Document is Number Controlled.
@return The document has a document sequence */
public boolean isDocNoControlled() 
{
Object oo = get_Value(COLUMNNAME_IsDocNoControlled);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="42f97c8a-e1c4-b7b0-ce9c-195034316f7b")
public static String es_PE_FIELD_DocumentType_DocumentIsNumberControlled_Name="Documento Controlado";

@XendraTrl(Identifier="42f97c8a-e1c4-b7b0-ce9c-195034316f7b")
public static String es_PE_FIELD_DocumentType_DocumentIsNumberControlled_Help="El cuadro de verificación número de documento controlado indica si este tipo de documento tendrá un número de secuencia";

@XendraTrl(Identifier="42f97c8a-e1c4-b7b0-ce9c-195034316f7b")
public static String es_PE_FIELD_DocumentType_DocumentIsNumberControlled_Description="El documento tiene una secuencia de control";

@XendraField(AD_Column_ID="IsDocNoControlled",IsCentrallyMaintained=true,
AD_Tab_ID="cec45b4f-070f-857a-115e-4f69320167bc",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="42f97c8a-e1c4-b7b0-ce9c-195034316f7b")
public static final String FIELDNAME_DocumentType_DocumentIsNumberControlled="42f97c8a-e1c4-b7b0-ce9c-195034316f7b";

@XendraTrl(Identifier="54344fa4-903d-0fa2-f2d1-bb6d16b1b536")
public static String es_PE_COLUMN_IsDocNoControlled_Name="Documento Controlado";

@XendraColumn(AD_Element_ID="c8a633ab-aea5-f148-dc40-182b66e91682",ColumnName="IsDocNoControlled",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="54344fa4-903d-0fa2-f2d1-bb6d16b1b536",
Synchronized="2023-03-22 18:53:54.0")
/** Column name IsDocNoControlled */
public static final String COLUMNNAME_IsDocNoControlled = "IsDocNoControlled";
/** Set IsElectronic.
@param IsElectronic IsElectronic */
public void setIsElectronic (boolean IsElectronic)
{
set_Value (COLUMNNAME_IsElectronic, Boolean.valueOf(IsElectronic));
}
/** Get IsElectronic.
@return IsElectronic */
public boolean isElectronic() 
{
Object oo = get_Value(COLUMNNAME_IsElectronic);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="88730b0e-c311-47e1-9adb-077ec01203b2")
public static String es_PE_FIELD_DocumentType_IsElectronic_Name="IsElectronic";

@XendraTrl(Identifier="88730b0e-c311-47e1-9adb-077ec01203b2")
public static String es_PE_FIELD_DocumentType_IsElectronic_Help="IsElectronic";

@XendraTrl(Identifier="88730b0e-c311-47e1-9adb-077ec01203b2")
public static String es_PE_FIELD_DocumentType_IsElectronic_Description="IsElectronic";

@XendraField(AD_Column_ID="IsElectronic",IsCentrallyMaintained=true,
AD_Tab_ID="cec45b4f-070f-857a-115e-4f69320167bc",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=420,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2022-04-04 21:18:27.0",
Identifier="88730b0e-c311-47e1-9adb-077ec01203b2")
public static final String FIELDNAME_DocumentType_IsElectronic="88730b0e-c311-47e1-9adb-077ec01203b2";

@XendraTrl(Identifier="a8efe43f-006c-47e1-b9f1-2403a19ab181")
public static String es_PE_COLUMN_IsElectronic_Name="IsElectronic";

@XendraColumn(AD_Element_ID="395f42e2-e25c-47b6-82f9-6eba9fb616ee",ColumnName="IsElectronic",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a8efe43f-006c-47e1-b9f1-2403a19ab181",
Synchronized="2023-03-22 18:53:54.0")
/** Column name IsElectronic */
public static final String COLUMNNAME_IsElectronic = "IsElectronic";
/** Set IsImport.
@param IsImport IsImport */
public void setIsImport (boolean IsImport)
{
set_Value (COLUMNNAME_IsImport, Boolean.valueOf(IsImport));
}
/** Get IsImport.
@return IsImport */
public boolean isImport() 
{
Object oo = get_Value(COLUMNNAME_IsImport);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="7eac0991-01e1-6e97-8b76-f6861f00b413")
public static String es_PE_FIELD_DocumentType_IsImport_Name="isimport";

@XendraField(AD_Column_ID="IsImport",IsCentrallyMaintained=true,
AD_Tab_ID="cec45b4f-070f-857a-115e-4f69320167bc",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7eac0991-01e1-6e97-8b76-f6861f00b413")
public static final String FIELDNAME_DocumentType_IsImport="7eac0991-01e1-6e97-8b76-f6861f00b413";

@XendraTrl(Identifier="b41caa36-5095-2dad-0a17-ebb588e62bb8")
public static String es_PE_COLUMN_IsImport_Name="isimport";

@XendraColumn(AD_Element_ID="3c993e4b-ba0f-0162-197d-080925c1056c",ColumnName="IsImport",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b41caa36-5095-2dad-0a17-ebb588e62bb8",
Synchronized="2023-03-22 18:53:54.0")
/** Column name IsImport */
public static final String COLUMNNAME_IsImport = "IsImport";
/** Set Indexed.
@param IsIndexed Index the document for the internal search engine */
public void setIsIndexed (boolean IsIndexed)
{
set_Value (COLUMNNAME_IsIndexed, Boolean.valueOf(IsIndexed));
}
/** Get Indexed.
@return Index the document for the internal search engine */
public boolean isIndexed() 
{
Object oo = get_Value(COLUMNNAME_IsIndexed);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="e9144366-a6ec-0348-7917-f61439f833dd")
public static String es_PE_FIELD_DocumentType_Indexed_Name="Indexed";

@XendraTrl(Identifier="e9144366-a6ec-0348-7917-f61439f833dd")
public static String es_PE_FIELD_DocumentType_Indexed_Help="For cross document search, the document can be indexed for faster search (Container, Document Type, Request Type)";

@XendraTrl(Identifier="e9144366-a6ec-0348-7917-f61439f833dd")
public static String es_PE_FIELD_DocumentType_Indexed_Description="Index the document for the internal search engine";

@XendraField(AD_Column_ID="IsIndexed",IsCentrallyMaintained=true,
AD_Tab_ID="cec45b4f-070f-857a-115e-4f69320167bc",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e9144366-a6ec-0348-7917-f61439f833dd")
public static final String FIELDNAME_DocumentType_Indexed="e9144366-a6ec-0348-7917-f61439f833dd";

@XendraTrl(Identifier="52c34cae-8749-4de1-27c0-7568f7bd972b")
public static String es_PE_COLUMN_IsIndexed_Name="Indexed";

@XendraColumn(AD_Element_ID="d1590244-3414-257f-0fd2-4766ac5da7e7",ColumnName="IsIndexed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="52c34cae-8749-4de1-27c0-7568f7bd972b",
Synchronized="2023-03-22 18:53:54.0")
/** Column name IsIndexed */
public static final String COLUMNNAME_IsIndexed = "IsIndexed";
/** Set In Transit.
@param IsInTransit Movement is in transit */
public void setIsInTransit (boolean IsInTransit)
{
set_Value (COLUMNNAME_IsInTransit, Boolean.valueOf(IsInTransit));
}
/** Get In Transit.
@return Movement is in transit */
public boolean isInTransit() 
{
Object oo = get_Value(COLUMNNAME_IsInTransit);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="c44bbb09-a988-a5fb-a0ce-4dce0752b052")
public static String es_PE_FIELD_DocumentType_InTransit_Name="En Transito";

@XendraTrl(Identifier="c44bbb09-a988-a5fb-a0ce-4dce0752b052")
public static String es_PE_FIELD_DocumentType_InTransit_Help="El movimiento de material está en tránsito - enviado, pero no recibido.";

@XendraTrl(Identifier="c44bbb09-a988-a5fb-a0ce-4dce0752b052")
public static String es_PE_FIELD_DocumentType_InTransit_Description="El Movimiento está en transito";

@XendraField(AD_Column_ID="IsInTransit",IsCentrallyMaintained=true,
AD_Tab_ID="cec45b4f-070f-857a-115e-4f69320167bc",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@DocBaseType@='MMM'",DisplayLength=1,IsReadOnly=false,SeqNo=240,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="c44bbb09-a988-a5fb-a0ce-4dce0752b052")
public static final String FIELDNAME_DocumentType_InTransit="c44bbb09-a988-a5fb-a0ce-4dce0752b052";

@XendraTrl(Identifier="beaf3a58-ac4e-5cbb-91e3-fe8a7eacd61b")
public static String es_PE_COLUMN_IsInTransit_Name="En Transito";

@XendraColumn(AD_Element_ID="763c0703-d1fd-4d3b-1507-82f4ab57d51c",ColumnName="IsInTransit",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="beaf3a58-ac4e-5cbb-91e3-fe8a7eacd61b",
Synchronized="2023-03-22 18:53:54.0")
/** Column name IsInTransit */
public static final String COLUMNNAME_IsInTransit = "IsInTransit";
/** Set IsOverwriteDateOnComplete.
@param IsOverwriteDateOnComplete IsOverwriteDateOnComplete */
public void setIsOverwriteDateOnComplete (boolean IsOverwriteDateOnComplete)
{
set_Value (COLUMNNAME_IsOverwriteDateOnComplete, Boolean.valueOf(IsOverwriteDateOnComplete));
}
/** Get IsOverwriteDateOnComplete.
@return IsOverwriteDateOnComplete */
public boolean isOverwriteDateOnComplete() 
{
Object oo = get_Value(COLUMNNAME_IsOverwriteDateOnComplete);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="34697362-de1a-1856-18d5-95cc2b592d59")
public static String es_PE_FIELD_DocumentType_IsOverwriteDateOnComplete_Name="Sobreescribe Fecha";

@XendraField(AD_Column_ID="IsOverwriteDateOnComplete",IsCentrallyMaintained=true,
AD_Tab_ID="cec45b4f-070f-857a-115e-4f69320167bc",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@DocSubType@='WR' | @DocSubType@='RM'",DisplayLength=1,IsReadOnly=false,SeqNo=320,
SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="34697362-de1a-1856-18d5-95cc2b592d59")
public static final String FIELDNAME_DocumentType_IsOverwriteDateOnComplete="34697362-de1a-1856-18d5-95cc2b592d59";

@XendraTrl(Identifier="1d2310cb-dd65-2f5f-3dbf-378d7b2e8e62")
public static String es_PE_COLUMN_IsOverwriteDateOnComplete_Name="isoverwritedateoncomplete";

@XendraColumn(AD_Element_ID="17f0496e-d49e-d74f-474f-a0281c415d4c",
ColumnName="IsOverwriteDateOnComplete",AD_Reference_ID=20,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="1d2310cb-dd65-2f5f-3dbf-378d7b2e8e62",Synchronized="2023-03-22 18:53:54.0")
/** Column name IsOverwriteDateOnComplete */
public static final String COLUMNNAME_IsOverwriteDateOnComplete = "IsOverwriteDateOnComplete";
/** Set Overwrite Sequence on Complete.
@param IsOverwriteSeqOnComplete Overwrite Sequence on Complete */
public void setIsOverwriteSeqOnComplete (boolean IsOverwriteSeqOnComplete)
{
set_Value (COLUMNNAME_IsOverwriteSeqOnComplete, Boolean.valueOf(IsOverwriteSeqOnComplete));
}
/** Get Overwrite Sequence on Complete.
@return Overwrite Sequence on Complete */
public boolean isOverwriteSeqOnComplete() 
{
Object oo = get_Value(COLUMNNAME_IsOverwriteSeqOnComplete);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="7e1bacc9-f5ef-ae75-4911-4353cc0ccc21")
public static String es_PE_FIELD_DocumentType_OverwriteSequenceOnComplete_Name="Sobreescribe Secuencia";

@XendraField(AD_Column_ID="IsOverwriteSeqOnComplete",IsCentrallyMaintained=true,
AD_Tab_ID="cec45b4f-070f-857a-115e-4f69320167bc",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@DocSubType@='WR' | @DocSubType@='RM'",DisplayLength=1,IsReadOnly=false,SeqNo=330,
SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="7e1bacc9-f5ef-ae75-4911-4353cc0ccc21")
public static final String FIELDNAME_DocumentType_OverwriteSequenceOnComplete="7e1bacc9-f5ef-ae75-4911-4353cc0ccc21";

@XendraTrl(Identifier="e29f1770-f04d-0a10-b7c7-d0d56d8cc50c")
public static String es_PE_COLUMN_IsOverwriteSeqOnComplete_Name="isoverwriteseqoncomplete";

@XendraColumn(AD_Element_ID="bba9e621-517e-3cc1-8673-9c7d13974229",
ColumnName="IsOverwriteSeqOnComplete",AD_Reference_ID=20,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="e29f1770-f04d-0a10-b7c7-d0d56d8cc50c",Synchronized="2023-03-22 18:53:54.0")
/** Column name IsOverwriteSeqOnComplete */
public static final String COLUMNNAME_IsOverwriteSeqOnComplete = "IsOverwriteSeqOnComplete";
/** Set IsPerception.
@param IsPerception IsPerception */
public void setIsPerception (boolean IsPerception)
{
set_Value (COLUMNNAME_IsPerception, Boolean.valueOf(IsPerception));
}
/** Get IsPerception.
@return IsPerception */
public boolean isPerception() 
{
Object oo = get_Value(COLUMNNAME_IsPerception);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="8dde666d-f614-aaa5-3c53-432525c9d5da")
public static String es_PE_FIELD_DocumentType_IsPerception_Name="isperception";

@XendraField(AD_Column_ID="IsPerception",IsCentrallyMaintained=true,
AD_Tab_ID="cec45b4f-070f-857a-115e-4f69320167bc",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8dde666d-f614-aaa5-3c53-432525c9d5da")
public static final String FIELDNAME_DocumentType_IsPerception="8dde666d-f614-aaa5-3c53-432525c9d5da";

@XendraTrl(Identifier="e63830dd-8c5d-27ee-06b7-16b97c0e62ce")
public static String es_PE_COLUMN_IsPerception_Name="isperception";

@XendraColumn(AD_Element_ID="c7f0eedf-e8c3-af0f-eaa2-f36735943754",ColumnName="IsPerception",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e63830dd-8c5d-27ee-06b7-16b97c0e62ce",
Synchronized="2023-03-22 18:53:54.0")
/** Column name IsPerception */
public static final String COLUMNNAME_IsPerception = "IsPerception";
/** Set Pick/QA Confirmation.
@param IsPickQAConfirm Require Pick or QA Confirmation before processing */
public void setIsPickQAConfirm (boolean IsPickQAConfirm)
{
set_Value (COLUMNNAME_IsPickQAConfirm, Boolean.valueOf(IsPickQAConfirm));
}
/** Get Pick/QA Confirmation.
@return Require Pick or QA Confirmation before processing */
public boolean isPickQAConfirm() 
{
Object oo = get_Value(COLUMNNAME_IsPickQAConfirm);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="75d6e6a2-49c4-fd59-ad2e-286d48987470")
public static String es_PE_FIELD_DocumentType_PickQAConfirmation_Name="Conformación Cant/Recolección";

@XendraTrl(Identifier="75d6e6a2-49c4-fd59-ad2e-286d48987470")
public static String es_PE_FIELD_DocumentType_PickQAConfirmation_Help="El proceso del envío (recibo) requiere la selección de confirmación de (A.C.).";

@XendraTrl(Identifier="75d6e6a2-49c4-fd59-ad2e-286d48987470")
public static String es_PE_FIELD_DocumentType_PickQAConfirmation_Description="Requiere la selección ó A.C. para confirmación antes de procesar";

@XendraField(AD_Column_ID="IsPickQAConfirm",IsCentrallyMaintained=true,
AD_Tab_ID="cec45b4f-070f-857a-115e-4f69320167bc",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@DocBaseType@='MMR' | @DocBaseType@='MMS'",DisplayLength=1,IsReadOnly=false,
SeqNo=200,SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="75d6e6a2-49c4-fd59-ad2e-286d48987470")
public static final String FIELDNAME_DocumentType_PickQAConfirmation="75d6e6a2-49c4-fd59-ad2e-286d48987470";

@XendraTrl(Identifier="3da2a3d5-46d1-e37f-f6d8-6b9e3733230b")
public static String es_PE_COLUMN_IsPickQAConfirm_Name="Conformación Cant/Recolección";

@XendraColumn(AD_Element_ID="c8f7bd6e-a87e-24f3-c324-49ec1383de2f",ColumnName="IsPickQAConfirm",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3da2a3d5-46d1-e37f-f6d8-6b9e3733230b",
Synchronized="2023-03-22 18:53:54.0")
/** Column name IsPickQAConfirm */
public static final String COLUMNNAME_IsPickQAConfirm = "IsPickQAConfirm";
/** Set IsPrintOnComplete.
@param IsPrintOnComplete IsPrintOnComplete */
public void setIsPrintOnComplete (boolean IsPrintOnComplete)
{
set_Value (COLUMNNAME_IsPrintOnComplete, Boolean.valueOf(IsPrintOnComplete));
}
/** Get IsPrintOnComplete.
@return IsPrintOnComplete */
public boolean isPrintOnComplete() 
{
Object oo = get_Value(COLUMNNAME_IsPrintOnComplete);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="14b1d483-6ced-4dce-aea2-141d6d3ffb46")
public static String es_PE_FIELD_DocumentType_IsPrintOnComplete_Name="Imprime cuando completa?";

@XendraField(AD_Column_ID="IsPrintOnComplete",IsCentrallyMaintained=true,
AD_Tab_ID="cec45b4f-070f-857a-115e-4f69320167bc",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=410,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-07-09 15:31:08.0",
Identifier="14b1d483-6ced-4dce-aea2-141d6d3ffb46")
public static final String FIELDNAME_DocumentType_IsPrintOnComplete="14b1d483-6ced-4dce-aea2-141d6d3ffb46";

@XendraTrl(Identifier="eedd07af-6e9d-48f2-83bc-809b011a6e15")
public static String es_PE_COLUMN_IsPrintOnComplete_Name="isprintoncomplete";

@XendraColumn(AD_Element_ID="1259109c-8198-47c9-9602-143a534ded96",ColumnName="IsPrintOnComplete",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="eedd07af-6e9d-48f2-83bc-809b011a6e15",
Synchronized="2023-03-22 18:53:54.0")
/** Column name IsPrintOnComplete */
public static final String COLUMNNAME_IsPrintOnComplete = "IsPrintOnComplete";
/** Set IsReturn.
@param IsReturn IsReturn */
public void setIsReturn (boolean IsReturn)
{
set_Value (COLUMNNAME_IsReturn, Boolean.valueOf(IsReturn));
}
/** Get IsReturn.
@return IsReturn */
public boolean isReturn() 
{
Object oo = get_Value(COLUMNNAME_IsReturn);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="644edbba-eaf8-0d7b-9bd5-0039ff4480d8")
public static String es_PE_FIELD_DocumentType_IsReturn_Name="Es Devolucion?";

@XendraField(AD_Column_ID="IsReturn",IsCentrallyMaintained=true,
AD_Tab_ID="cec45b4f-070f-857a-115e-4f69320167bc",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=460,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="644edbba-eaf8-0d7b-9bd5-0039ff4480d8")
public static final String FIELDNAME_DocumentType_IsReturn="644edbba-eaf8-0d7b-9bd5-0039ff4480d8";

@XendraTrl(Identifier="1d714627-d5be-24f6-e1a0-aa313bec57c6")
public static String es_PE_COLUMN_IsReturn_Name="isreturn";

@XendraColumn(AD_Element_ID="5b2d975d-844c-3550-8a16-7f748770e35d",ColumnName="IsReturn",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1d714627-d5be-24f6-e1a0-aa313bec57c6",
Synchronized="2023-03-22 18:53:54.0")
/** Column name IsReturn */
public static final String COLUMNNAME_IsReturn = "IsReturn";
/** Set Ship/Receipt Confirmation.
@param IsShipConfirm Require Ship or Receipt Confirmation before processing */
public void setIsShipConfirm (boolean IsShipConfirm)
{
set_Value (COLUMNNAME_IsShipConfirm, Boolean.valueOf(IsShipConfirm));
}
/** Get Ship/Receipt Confirmation.
@return Require Ship or Receipt Confirmation before processing */
public boolean isShipConfirm() 
{
Object oo = get_Value(COLUMNNAME_IsShipConfirm);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="1cc75693-cd3c-8ac6-d5be-0e48e27819bb")
public static String es_PE_FIELD_DocumentType_ShipReceiptConfirmation_Name="Confirmación entrega/Recibo";

@XendraTrl(Identifier="1cc75693-cd3c-8ac6-d5be-0e48e27819bb")
public static String es_PE_FIELD_DocumentType_ShipReceiptConfirmation_Help="El proceso del envío (recibo) requiere la confirmación de la entrega (recibo)";

@XendraTrl(Identifier="1cc75693-cd3c-8ac6-d5be-0e48e27819bb")
public static String es_PE_FIELD_DocumentType_ShipReceiptConfirmation_Description="Requiere la confirmación de la entrega ó del recibo antes de procesar";

@XendraField(AD_Column_ID="IsShipConfirm",IsCentrallyMaintained=true,
AD_Tab_ID="cec45b4f-070f-857a-115e-4f69320167bc",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@DocBaseType@='MMR' | @DocBaseType@='MMS'",DisplayLength=1,IsReadOnly=false,
SeqNo=210,SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="1cc75693-cd3c-8ac6-d5be-0e48e27819bb")
public static final String FIELDNAME_DocumentType_ShipReceiptConfirmation="1cc75693-cd3c-8ac6-d5be-0e48e27819bb";

@XendraTrl(Identifier="edd34275-9031-8d33-1c5b-2d9e510efc74")
public static String es_PE_COLUMN_IsShipConfirm_Name="Confirmación entrega/Recibo";

@XendraColumn(AD_Element_ID="8d82007a-0c98-4f97-fcee-3f92e3615e8f",ColumnName="IsShipConfirm",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="edd34275-9031-8d33-1c5b-2d9e510efc74",
Synchronized="2023-03-22 18:53:54.0")
/** Column name IsShipConfirm */
public static final String COLUMNNAME_IsShipConfirm = "IsShipConfirm";
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

@XendraTrl(Identifier="5c08e108-9ee6-da7f-fe88-4694dafab3ad")
public static String es_PE_FIELD_DocumentType_SalesTransaction_Name="Transacción de Ventas";

@XendraTrl(Identifier="5c08e108-9ee6-da7f-fe88-4694dafab3ad")
public static String es_PE_FIELD_DocumentType_SalesTransaction_Help="El cuadro de verificación Transacción de Ventas indica si este ítem es una transacción de ventas";

@XendraTrl(Identifier="5c08e108-9ee6-da7f-fe88-4694dafab3ad")
public static String es_PE_FIELD_DocumentType_SalesTransaction_Description="Esta es una transacción de ventas";

@XendraField(AD_Column_ID="IsSOTrx",IsCentrallyMaintained=true,
AD_Tab_ID="cec45b4f-070f-857a-115e-4f69320167bc",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5c08e108-9ee6-da7f-fe88-4694dafab3ad")
public static final String FIELDNAME_DocumentType_SalesTransaction="5c08e108-9ee6-da7f-fe88-4694dafab3ad";

@XendraTrl(Identifier="c922f6dd-505b-3b92-174c-b3413b157ec5")
public static String es_PE_COLUMN_IsSOTrx_Name="Transacción de Ventas";

@XendraColumn(AD_Element_ID="4084b69f-a51d-5676-4d8c-395a13e6b2df",ColumnName="IsSOTrx",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c922f6dd-505b-3b92-174c-b3413b157ec5",
Synchronized="2023-03-22 18:53:54.0")
/** Column name IsSOTrx */
public static final String COLUMNNAME_IsSOTrx = "IsSOTrx";
/** Set IsSplitByTax.
@param IsSplitByTax IsSplitByTax */
public void setIsSplitByTax (boolean IsSplitByTax)
{
set_Value (COLUMNNAME_IsSplitByTax, Boolean.valueOf(IsSplitByTax));
}
/** Get IsSplitByTax.
@return IsSplitByTax */
public boolean isSplitByTax() 
{
Object oo = get_Value(COLUMNNAME_IsSplitByTax);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="ae02e383-599d-4ea6-98c2-1003020a1aa1")
public static String es_PE_FIELD_DocumentType_IsSplitByTax_Name="Corte por Impuesto?";

@XendraTrl(Identifier="ae02e383-599d-4ea6-98c2-1003020a1aa1")
public static String es_PE_FIELD_DocumentType_IsSplitByTax_Help="Para el grabado el sistema haceun corte por afectos e inafecto y otros impuestos";

@XendraField(AD_Column_ID="IsSplitByTax",IsCentrallyMaintained=true,
AD_Tab_ID="cec45b4f-070f-857a-115e-4f69320167bc",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=360,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-05-26 09:54:16.0",
Identifier="ae02e383-599d-4ea6-98c2-1003020a1aa1")
public static final String FIELDNAME_DocumentType_IsSplitByTax="ae02e383-599d-4ea6-98c2-1003020a1aa1";

@XendraTrl(Identifier="d9c7da16-c814-4e84-a3ee-67790e47a00a")
public static String es_PE_COLUMN_IsSplitByTax_Name="issplitbytax";

@XendraColumn(AD_Element_ID="c1bcd784-7bac-47f5-9e55-5a4c6d5a95f8",ColumnName="IsSplitByTax",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d9c7da16-c814-4e84-a3ee-67790e47a00a",
Synchronized="2023-03-22 18:53:54.0")
/** Column name IsSplitByTax */
public static final String COLUMNNAME_IsSplitByTax = "IsSplitByTax";
/** Set Split when Difference.
@param IsSplitWhenDifference Split document when there is a difference */
public void setIsSplitWhenDifference (boolean IsSplitWhenDifference)
{
set_Value (COLUMNNAME_IsSplitWhenDifference, Boolean.valueOf(IsSplitWhenDifference));
}
/** Get Split when Difference.
@return Split document when there is a difference */
public boolean isSplitWhenDifference() 
{
Object oo = get_Value(COLUMNNAME_IsSplitWhenDifference);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="2cb73a08-c680-2fad-0b72-8cc8a406696e")
public static String es_PE_FIELD_DocumentType_SplitWhenDifference_Name="Dividir cuando hay Diferencia";

@XendraTrl(Identifier="2cb73a08-c680-2fad-0b72-8cc8a406696e")
public static String es_PE_FIELD_DocumentType_SplitWhenDifference_Help="Si la confirmación contiene diferencias, el documento original crea partidas permitiendo que el documento original (entrega) sea procesado y poniendo al día el inventario - y el documento nuevamente creado para manejar el conflicto al final. Hasta que se procesa la confirmación, el inventario no es actualizado.";

@XendraTrl(Identifier="2cb73a08-c680-2fad-0b72-8cc8a406696e")
public static String es_PE_FIELD_DocumentType_SplitWhenDifference_Description="Documento dividido cuando hay una diferencia";

@XendraField(AD_Column_ID="IsSplitWhenDifference",IsCentrallyMaintained=true,
AD_Tab_ID="cec45b4f-070f-857a-115e-4f69320167bc",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsPickQAConfirm@=Y | @IsShipConfirm@=Y",DisplayLength=1,IsReadOnly=false,SeqNo=220,
SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="2cb73a08-c680-2fad-0b72-8cc8a406696e")
public static final String FIELDNAME_DocumentType_SplitWhenDifference="2cb73a08-c680-2fad-0b72-8cc8a406696e";

@XendraTrl(Identifier="ff69b89f-da95-6ffd-f121-d273cbc15b83")
public static String es_PE_COLUMN_IsSplitWhenDifference_Name="Dividir cuando hay Diferencia";

@XendraColumn(AD_Element_ID="0eceee7c-3e5d-b5df-12be-cf38b773fe69",
ColumnName="IsSplitWhenDifference",AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="N",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="ff69b89f-da95-6ffd-f121-d273cbc15b83",Synchronized="2023-03-22 18:53:54.0")
/** Column name IsSplitWhenDifference */
public static final String COLUMNNAME_IsSplitWhenDifference = "IsSplitWhenDifference";
/** Set IsTaxable.
@param IsTaxable IsTaxable */
public void setIsTaxable (boolean IsTaxable)
{
set_Value (COLUMNNAME_IsTaxable, Boolean.valueOf(IsTaxable));
}
/** Get IsTaxable.
@return IsTaxable */
public boolean isTaxable() 
{
Object oo = get_Value(COLUMNNAME_IsTaxable);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="5aaa6c60-6425-4ec3-b09c-42d618378683")
public static String es_PE_FIELD_DocumentType_IsTaxable_Name="Afecto a Impuesto?";

@XendraTrl(Identifier="5aaa6c60-6425-4ec3-b09c-42d618378683")
public static String es_PE_FIELD_DocumentType_IsTaxable_Help="Si el documento esta afecto a impuestos";

@XendraField(AD_Column_ID="IsTaxable",IsCentrallyMaintained=true,
AD_Tab_ID="cec45b4f-070f-857a-115e-4f69320167bc",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=430,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2015-05-05 18:25:40.0",
Identifier="5aaa6c60-6425-4ec3-b09c-42d618378683")
public static final String FIELDNAME_DocumentType_IsTaxable="5aaa6c60-6425-4ec3-b09c-42d618378683";

@XendraTrl(Identifier="eb167b5e-cb17-45c5-85e7-1d3be6c7a392")
public static String es_PE_COLUMN_IsTaxable_Name="istaxable";

@XendraColumn(AD_Element_ID="29bc04d1-efba-4f5f-b298-ee3b475445df",ColumnName="IsTaxable",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="eb167b5e-cb17-45c5-85e7-1d3be6c7a392",
Synchronized="2023-03-22 18:53:54.0")
/** Column name IsTaxable */
public static final String COLUMNNAME_IsTaxable = "IsTaxable";
/** Set IsUseBPartner.
@param IsUseBPartner IsUseBPartner */
public void setIsUseBPartner (boolean IsUseBPartner)
{
set_Value (COLUMNNAME_IsUseBPartner, Boolean.valueOf(IsUseBPartner));
}
/** Get IsUseBPartner.
@return IsUseBPartner */
public boolean isUseBPartner() 
{
Object oo = get_Value(COLUMNNAME_IsUseBPartner);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="03fff47e-99cb-35d7-81da-2bc03884b384")
public static String es_PE_FIELD_DocumentType_IsUseBPartner_Name="Usa Socio de Negocio";

@XendraTrl(Identifier="03fff47e-99cb-35d7-81da-2bc03884b384")
public static String es_PE_FIELD_DocumentType_IsUseBPartner_Help="Si este documento exige el llenado de un socio de negocio con RUC(Peru)";

@XendraField(AD_Column_ID="IsUseBPartner",IsCentrallyMaintained=true,
AD_Tab_ID="cec45b4f-070f-857a-115e-4f69320167bc",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=440,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="03fff47e-99cb-35d7-81da-2bc03884b384")
public static final String FIELDNAME_DocumentType_IsUseBPartner="03fff47e-99cb-35d7-81da-2bc03884b384";

@XendraTrl(Identifier="52feeb22-6a6d-4f1d-2620-aada7c51d212")
public static String es_PE_COLUMN_IsUseBPartner_Name="IsUseBPartner";

@XendraColumn(AD_Element_ID="4be0eb91-3016-43df-7f4f-3281d8213fff",ColumnName="IsUseBPartner",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="52feeb22-6a6d-4f1d-2620-aada7c51d212",
Synchronized="2023-03-22 18:53:54.0")
/** Column name IsUseBPartner */
public static final String COLUMNNAME_IsUseBPartner = "IsUseBPartner";
/** Set LineCount.
@param LineCount LineCount */
public void setLineCount (BigDecimal LineCount)
{
set_Value (COLUMNNAME_LineCount, LineCount);
}
/** Get LineCount.
@return LineCount */
public BigDecimal getLineCount() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_LineCount);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="d0c1d889-ebcd-8b4b-580f-504d0a3c9997")
public static String es_PE_FIELD_DocumentType_LineCount_Name="Num. Líneas";

@XendraField(AD_Column_ID="LineCount",IsCentrallyMaintained=true,
AD_Tab_ID="cec45b4f-070f-857a-115e-4f69320167bc",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=340,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d0c1d889-ebcd-8b4b-580f-504d0a3c9997")
public static final String FIELDNAME_DocumentType_LineCount="d0c1d889-ebcd-8b4b-580f-504d0a3c9997";

@XendraTrl(Identifier="a6da7652-aba0-186b-2564-2b19b9903b10")
public static String es_PE_COLUMN_LineCount_Name="linecount";

@XendraColumn(AD_Element_ID="d475888f-d2de-fa65-21ce-6c4ac31c4d1d",ColumnName="LineCount",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a6da7652-aba0-186b-2564-2b19b9903b10",
Synchronized="2023-03-22 18:53:54.0")
/** Column name LineCount */
public static final String COLUMNNAME_LineCount = "LineCount";
/** Set Lockout.
@param Lockout Lockout */
public void setLockout (String Lockout)
{
if (Lockout != null && Lockout.length() > 1)
{
log.warning("Length > 1 - truncated");
Lockout = Lockout.substring(0,0);
}
set_Value (COLUMNNAME_Lockout, Lockout);
}
/** Get Lockout.
@return Lockout */
public String getLockout() 
{
String value = (String)get_Value(COLUMNNAME_Lockout);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="aadf9424-51b7-437d-a1f4-f3fdfbe30cf3")
public static String es_PE_FIELD_DocumentType_Lockout_Name="lockout";

@XendraField(AD_Column_ID="Lockout",IsCentrallyMaintained=true,
AD_Tab_ID="cec45b4f-070f-857a-115e-4f69320167bc",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=470,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2017-10-17 15:31:34.0",
Identifier="aadf9424-51b7-437d-a1f4-f3fdfbe30cf3")
public static final String FIELDNAME_DocumentType_Lockout="aadf9424-51b7-437d-a1f4-f3fdfbe30cf3";

@XendraTrl(Identifier="da37e133-e5a1-4883-b045-70d8f889f2b1")
public static String es_PE_COLUMN_Lockout_Name="Lockout";

@XendraColumn(AD_Element_ID="63f75f32-a2eb-4522-a988-6c753105407e",ColumnName="Lockout",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="da37e133-e5a1-4883-b045-70d8f889f2b1",
Synchronized="2023-03-22 18:53:54.0")
/** Column name Lockout */
public static final String COLUMNNAME_Lockout = "Lockout";
/** Set Max Amount.
@param MaxAmt Maximum Amount in invoice currency */
public void setMaxAmt (BigDecimal MaxAmt)
{
set_Value (COLUMNNAME_MaxAmt, MaxAmt);
}
/** Get Max Amount.
@return Maximum Amount in invoice currency */
public BigDecimal getMaxAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_MaxAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="1dd05416-a78c-4437-ae3b-634b2cd70f8a")
public static String es_PE_FIELD_DocumentType_MaxAmount_Name="Total Máximo";

@XendraTrl(Identifier="1dd05416-a78c-4437-ae3b-634b2cd70f8a")
public static String es_PE_FIELD_DocumentType_MaxAmount_Help="El total máximo indica el total máximo en la moneda de la factura";

@XendraTrl(Identifier="1dd05416-a78c-4437-ae3b-634b2cd70f8a")
public static String es_PE_FIELD_DocumentType_MaxAmount_Description="Total máximo en la moneda de la factura";

@XendraField(AD_Column_ID="MaxAmt",IsCentrallyMaintained=true,
AD_Tab_ID="cec45b4f-070f-857a-115e-4f69320167bc",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=370,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2015-05-05 18:25:40.0",
Identifier="1dd05416-a78c-4437-ae3b-634b2cd70f8a")
public static final String FIELDNAME_DocumentType_MaxAmount="1dd05416-a78c-4437-ae3b-634b2cd70f8a";

@XendraTrl(Identifier="b375a92c-2ec9-46c3-b73d-24e14ac04b1b")
public static String es_PE_COLUMN_MaxAmt_Name="Max Amount";

@XendraColumn(AD_Element_ID="6861e638-d30f-2ea2-4acb-518f1422ea14",ColumnName="MaxAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b375a92c-2ec9-46c3-b73d-24e14ac04b1b",
Synchronized="2023-03-22 18:53:54.0")
/** Column name MaxAmt */
public static final String COLUMNNAME_MaxAmt = "MaxAmt";
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

@XendraTrl(Identifier="a2389128-e7c6-b74d-9c67-5eb790c23f78")
public static String es_PE_FIELD_DocumentType_Name_Name="Nombre";

@XendraTrl(Identifier="a2389128-e7c6-b74d-9c67-5eb790c23f78")
public static String es_PE_FIELD_DocumentType_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="a2389128-e7c6-b74d-9c67-5eb790c23f78")
public static String es_PE_FIELD_DocumentType_Name_Description="Identificador alfanumérico de la entidad.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="cec45b4f-070f-857a-115e-4f69320167bc",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=30,SortNo=2,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a2389128-e7c6-b74d-9c67-5eb790c23f78")
public static final String FIELDNAME_DocumentType_Name="a2389128-e7c6-b74d-9c67-5eb790c23f78";

@XendraTrl(Identifier="e058f5a4-6c5c-5597-12e7-6325039e17cc")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e058f5a4-6c5c-5597-12e7-6325039e17cc",
Synchronized="2023-03-22 18:53:54.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set NroSerieDocument.
@param NroSerieDocument NroSerieDocument */
public void setNroSerieDocument (String NroSerieDocument)
{
if (NroSerieDocument != null && NroSerieDocument.length() > 10)
{
log.warning("Length > 10 - truncated");
NroSerieDocument = NroSerieDocument.substring(0,9);
}
set_Value (COLUMNNAME_NroSerieDocument, NroSerieDocument);
}
/** Get NroSerieDocument.
@return NroSerieDocument */
public String getNroSerieDocument() 
{
String value = (String)get_Value(COLUMNNAME_NroSerieDocument);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="7fb14b8c-e4f3-3079-cbfd-6fca4d11100a")
public static String es_PE_FIELD_DocumentType_NroSerieDocument_Name="Num. Documento";

@XendraField(AD_Column_ID="NroSerieDocument",IsCentrallyMaintained=true,
AD_Tab_ID="cec45b4f-070f-857a-115e-4f69320167bc",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@DocSubType@='WR' | @DocSubType@='RM'",DisplayLength=10,IsReadOnly=false,SeqNo=350,
SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="7fb14b8c-e4f3-3079-cbfd-6fca4d11100a")
public static final String FIELDNAME_DocumentType_NroSerieDocument="7fb14b8c-e4f3-3079-cbfd-6fca4d11100a";

@XendraTrl(Identifier="6b1fa75d-daa5-a20a-b659-59c8801abddc")
public static String es_PE_COLUMN_NroSerieDocument_Name="nroseriedocument";

@XendraColumn(AD_Element_ID="e2720ff8-46fc-4e94-4832-5e3c14a6aec7",ColumnName="NroSerieDocument",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6b1fa75d-daa5-a20a-b659-59c8801abddc",
Synchronized="2023-03-22 18:53:54.0")
/** Column name NroSerieDocument */
public static final String COLUMNNAME_NroSerieDocument = "NroSerieDocument";
/** Set Printer Name.
@param PrinterName Name of the Printer */
public void setPrinterName (String PrinterName)
{
if (PrinterName != null && PrinterName.length() > 60)
{
log.warning("Length > 60 - truncated");
PrinterName = PrinterName.substring(0,59);
}
set_Value (COLUMNNAME_PrinterName, PrinterName);
}
/** Get Printer Name.
@return Name of the Printer */
public String getPrinterName() 
{
String value = (String)get_Value(COLUMNNAME_PrinterName);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="84eef1cb-8117-2793-6c4f-e860b7db9755")
public static String es_PE_FIELD_DocumentType_PrinterName_Name="Nombre Impresora";

@XendraTrl(Identifier="84eef1cb-8117-2793-6c4f-e860b7db9755")
public static String es_PE_FIELD_DocumentType_PrinterName_Help="(Nombre interno de el sistema operativo) de la impresora; Por favor note que el nombre de la impresora puede ser diferente en diversos clientes. Incorpore un nombre de la impresora, que se aplica a TODOS LOS clientes (ej. Impresora en un servidor) <p> Si no se incorpora ninguna, se utiliza la impresora por default. Usted especifica su impresora a utilizar cuando abre una sesión. Tambien puede cambiar la impresora por default en preferencias.";

@XendraTrl(Identifier="84eef1cb-8117-2793-6c4f-e860b7db9755")
public static String es_PE_FIELD_DocumentType_PrinterName_Description="Nombre de la Impresión";

@XendraField(AD_Column_ID="PrinterName",IsCentrallyMaintained=true,
AD_Tab_ID="cec45b4f-070f-857a-115e-4f69320167bc",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@DocSubType@='WR' | @DocSubType@='RM'",DisplayLength=10,IsReadOnly=false,SeqNo=450,
SortNo=0,IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="84eef1cb-8117-2793-6c4f-e860b7db9755")
public static final String FIELDNAME_DocumentType_PrinterName="84eef1cb-8117-2793-6c4f-e860b7db9755";

@XendraTrl(Identifier="d6a6903d-bbe2-20ca-1e5d-ea79284d8e74")
public static String es_PE_COLUMN_PrinterName_Name="Nombre Impresión";

@XendraColumn(AD_Element_ID="3cc8b19c-2d7f-761b-8ec9-3afda5b3a2eb",ColumnName="PrinterName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d6a6903d-bbe2-20ca-1e5d-ea79284d8e74",
Synchronized="2023-03-22 18:53:54.0")
/** Column name PrinterName */
public static final String COLUMNNAME_PrinterName = "PrinterName";
/** Set Print Text.
@param PrintName The label text to be printed on a document or correspondence. */
public void setPrintName (String PrintName)
{
if (PrintName == null) throw new IllegalArgumentException ("PrintName is mandatory.");
if (PrintName.length() > 60)
{
log.warning("Length > 60 - truncated");
PrintName = PrintName.substring(0,59);
}
set_Value (COLUMNNAME_PrintName, PrintName);
}
/** Get Print Text.
@return The label text to be printed on a document or correspondence. */
public String getPrintName() 
{
String value = (String)get_Value(COLUMNNAME_PrintName);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="b25c451f-6e38-cef4-6777-18fefb8565db")
public static String es_PE_FIELD_DocumentType_PrintText_Name="Nombre a ser Impreso";

@XendraTrl(Identifier="b25c451f-6e38-cef4-6777-18fefb8565db")
public static String es_PE_FIELD_DocumentType_PrintText_Help="El nombre a ser Impreso indica el nombre que será impreso en un documento ó correspondencia";

@XendraTrl(Identifier="b25c451f-6e38-cef4-6777-18fefb8565db")
public static String es_PE_FIELD_DocumentType_PrintText_Description="Indica el nombre a ser impreso en un documento ó correspondencia";

@XendraField(AD_Column_ID="PrintName",IsCentrallyMaintained=true,
AD_Tab_ID="cec45b4f-070f-857a-115e-4f69320167bc",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b25c451f-6e38-cef4-6777-18fefb8565db")
public static final String FIELDNAME_DocumentType_PrintText="b25c451f-6e38-cef4-6777-18fefb8565db";

@XendraTrl(Identifier="e845bb9a-7a0b-a9eb-6d6c-45802e46402a")
public static String es_PE_COLUMN_PrintName_Name="Nombre a ser Impreso";

@XendraColumn(AD_Element_ID="83f7d1df-e4e7-adff-3bda-43555a334585",ColumnName="PrintName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e845bb9a-7a0b-a9eb-6d6c-45802e46402a",
Synchronized="2023-03-22 18:53:54.0")
/** Column name PrintName */
public static final String COLUMNNAME_PrintName = "PrintName";
/** Set TransactionType.
@param TransactionType TransactionType */
public void setTransactionType (String TransactionType)
{
if (TransactionType != null && TransactionType.length() > 1)
{
log.warning("Length > 1 - truncated");
TransactionType = TransactionType.substring(0,0);
}
set_Value (COLUMNNAME_TransactionType, TransactionType);
}
/** Get TransactionType.
@return TransactionType */
public String getTransactionType() 
{
return (String)get_Value(COLUMNNAME_TransactionType);
}

@XendraTrl(Identifier="8d8c6adc-e79a-4d73-b49e-0797a232dd07")
public static String es_PE_FIELD_DocumentType_TransactionType_Name="transactiontype";

@XendraField(AD_Column_ID="TransactionType",IsCentrallyMaintained=true,
AD_Tab_ID="cec45b4f-070f-857a-115e-4f69320167bc",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=490,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2017-10-17 15:31:34.0",
Identifier="8d8c6adc-e79a-4d73-b49e-0797a232dd07")
public static final String FIELDNAME_DocumentType_TransactionType="8d8c6adc-e79a-4d73-b49e-0797a232dd07";

@XendraTrl(Identifier="aec25f4b-1bd7-4f76-8490-b8de40fa1236")
public static String es_PE_COLUMN_TransactionType_Name="TransactionType";

@XendraColumn(AD_Element_ID="97706c37-8c3e-4d9a-a6f6-1e149dc77c97",ColumnName="TransactionType",
AD_Reference_ID=17,AD_Reference_Value_ID="fe35729f-77d7-4356-a8e1-30e72e5d389a",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="aec25f4b-1bd7-4f76-8490-b8de40fa1236",Synchronized="2023-03-22 18:53:54.0")
/** Column name TransactionType */
public static final String COLUMNNAME_TransactionType = "TransactionType";
}
