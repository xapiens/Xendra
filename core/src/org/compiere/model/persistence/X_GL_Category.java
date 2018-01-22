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
import org.compiere.model.reference.REF_GLCategoryType;
import org.compiere.model.reference.REF_C_DocTypeDocBaseType;
/** Generated Model for GL_Category
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_GL_Category extends PO
{
/** Standard Constructor
@param ctx context
@param GL_Category_ID id
@param trxName transaction
*/
public X_GL_Category (Properties ctx, int GL_Category_ID, String trxName)
{
super (ctx, GL_Category_ID, trxName);
/** if (GL_Category_ID == 0)
{
setCategoryType (null);	
// M
setGL_Category_ID (0);
setIsDefault (false);	
// N
setName (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_GL_Category (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=218 */
public static int Table_ID=MTable.getTable_ID("GL_Category");

@XendraTrl(Identifier="ae711623-2cd3-eef7-fd56-9bfb1e6349ed")
public static String es_PE_TAB_GLCategory_Description="Definir categorías de Libro Mayor";

@XendraTrl(Identifier="ae711623-2cd3-eef7-fd56-9bfb1e6349ed")
public static String es_PE_TAB_GLCategory_Name="Categoría CG";

@XendraTrl(Identifier="ae711623-2cd3-eef7-fd56-9bfb1e6349ed")
public static String es_PE_TAB_GLCategory_Help="La pestaña de Categoría de Libro Mayor define identificadores opcionales para un documento ó entrada de diario. Cada categoría puede ser usada en un documento. Entrada de diario ó un archivo a importar.";

@XendraTab(Name="GL Category",Description="Define General Ledger Categories",
Help="The GL Category Tab defines optional identifiers for a document or journal.  Each Category may be used on a document, manual journal or import",
AD_Window_ID="33c4c61d-d1fa-9890-072c-40e9eca93a61",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="ae711623-2cd3-eef7-fd56-9bfb1e6349ed",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_GLCategory="ae711623-2cd3-eef7-fd56-9bfb1e6349ed";

@XendraTrl(Identifier="953a228a-c5fe-20e0-edfa-71e3adbd73c9")
public static String es_PE_TABLE_GL_Category_Name="Categoría CG";

@XendraTable(Name="GL Category",Description="General Ledger Category",Help="",
TableName="GL_Category",AccessLevel="2",AD_Window_ID="33c4c61d-d1fa-9890-072c-40e9eca93a61",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=95,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.accounting",
Identifier="953a228a-c5fe-20e0-edfa-71e3adbd73c9",Synchronized="2017-08-16 11:42:43.0")
/** TableName=GL_Category */
public static final String Table_Name="GL_Category";


@XendraIndex(Name="gl_category_name",Identifier="0b2a10bf-af8f-4a25-06b3-a548dbe3ac04",
Column_Names="ad_client_id, name",IsUnique="true",
TableIdentifier="0b2a10bf-af8f-4a25-06b3-a548dbe3ac04",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_gl_category_name = "0b2a10bf-af8f-4a25-06b3-a548dbe3ac04";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"GL_Category");

protected BigDecimal accessLevel = BigDecimal.valueOf(2);
/** AccessLevel
@return 2 - Client 
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
    Table_ID = MTable.getTable_ID("GL_Category");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_GL_Category[").append(get_ID()).append("]");
return sb.toString();
}

/** CategoryType AD_Reference=453b465e-17b3-d547-8f5d-504a0b898d77 */
public static final int CATEGORYTYPE_AD_Reference_ID=207;
/** Set Category Type.
@param CategoryType Source of the Journal with this category */
public void setCategoryType (String CategoryType)
{
if (CategoryType == null) throw new IllegalArgumentException ("CategoryType is mandatory");
if (CategoryType.equals(REF_GLCategoryType.Manual) || CategoryType.equals(REF_GLCategoryType.Import) || CategoryType.equals(REF_GLCategoryType.Document) || CategoryType.equals(REF_GLCategoryType.SystemGenerated));
 else throw new IllegalArgumentException ("CategoryType Invalid value - " + CategoryType + " - Reference_ID=207 - M - I - D - S");
if (CategoryType.length() > 1)
{
log.warning("Length > 1 - truncated");
CategoryType = CategoryType.substring(0,0);
}
set_Value (COLUMNNAME_CategoryType, CategoryType);
}
/** Get Category Type.
@return Source of the Journal with this category */
public String getCategoryType() 
{
return (String)get_Value(COLUMNNAME_CategoryType);
}

@XendraTrl(Identifier="7ccf5fd3-8655-f088-316c-cd517526c901")
public static String es_PE_FIELD_GLCategory_CategoryType_Description="Fuente de la póliza con esta categoría";

@XendraTrl(Identifier="7ccf5fd3-8655-f088-316c-cd517526c901")
public static String es_PE_FIELD_GLCategory_CategoryType_Help="El tipo de categoría indica la fuente de la póliza para esta categoría. Las pólizas pueden ser generadas desde un documento; introducido manualmente ó importado";

@XendraTrl(Identifier="7ccf5fd3-8655-f088-316c-cd517526c901")
public static String es_PE_FIELD_GLCategory_CategoryType_Name="Tipo de Categoría";

@XendraField(AD_Column_ID="CategoryType",IsCentrallyMaintained=true,
AD_Tab_ID="ae711623-2cd3-eef7-fd56-9bfb1e6349ed",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7ccf5fd3-8655-f088-316c-cd517526c901")
public static final String FIELDNAME_GLCategory_CategoryType="7ccf5fd3-8655-f088-316c-cd517526c901";

@XendraTrl(Identifier="4816957d-11bd-fabc-49dd-82ddb84cd221")
public static String es_PE_COLUMN_CategoryType_Name="Tipo de Categoría";

@XendraColumn(AD_Element_ID="70e9bfff-3461-7aeb-77e0-02f2e94d3651",ColumnName="CategoryType",
AD_Reference_ID=17,AD_Reference_Value_ID="453b465e-17b3-d547-8f5d-504a0b898d77",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="M",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="4816957d-11bd-fabc-49dd-82ddb84cd221",Synchronized="2017-08-05 16:54:41.0")
/** Column name CategoryType */
public static final String COLUMNNAME_CategoryType = "CategoryType";
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
@XendraTrl(Identifier="2972c456-b985-3e43-c671-ad94edf63274")
public static String es_PE_FIELD_GLCategory_SunatDocumentCode_Name="Código Sunat";

@XendraField(AD_Column_ID="CodSunat",IsCentrallyMaintained=true,
AD_Tab_ID="ae711623-2cd3-eef7-fd56-9bfb1e6349ed",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=0,IsReadOnly=false,SeqNo=91,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2972c456-b985-3e43-c671-ad94edf63274")
public static final String FIELDNAME_GLCategory_SunatDocumentCode="2972c456-b985-3e43-c671-ad94edf63274";

@XendraTrl(Identifier="12b5b8c9-638d-d986-d816-bb6fd8ec1258")
public static String es_PE_COLUMN_CodSunat_Name="Código Sunat";

@XendraColumn(AD_Element_ID="84884f14-1f72-b5d2-c38f-d807ef550fd4",ColumnName="CodSunat",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="12b5b8c9-638d-d986-d816-bb6fd8ec1258",
Synchronized="2017-08-05 16:54:41.0")
/** Column name CodSunat */
public static final String COLUMNNAME_CodSunat = "CodSunat";
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

@XendraTrl(Identifier="34e316d0-f67c-fdd4-75c4-fe691ad7d104")
public static String es_PE_FIELD_GLCategory_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="34e316d0-f67c-fdd4-75c4-fe691ad7d104")
public static String es_PE_FIELD_GLCategory_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="34e316d0-f67c-fdd4-75c4-fe691ad7d104")
public static String es_PE_FIELD_GLCategory_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="ae711623-2cd3-eef7-fd56-9bfb1e6349ed",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="34e316d0-f67c-fdd4-75c4-fe691ad7d104")
public static final String FIELDNAME_GLCategory_Description="34e316d0-f67c-fdd4-75c4-fe691ad7d104";

@XendraTrl(Identifier="af29a1ce-4bb5-ae13-3032-669890fab0c5")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="af29a1ce-4bb5-ae13-3032-669890fab0c5",
Synchronized="2017-08-05 16:54:41.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";

/** DocBaseType AD_Reference=c1999318-834d-4c66-5345-371ffe3c1f06 */
public static final int DOCBASETYPE_AD_Reference_ID=183;
/** Set Document BaseType.
@param DocBaseType Logical type of document */
public void setDocBaseType (String DocBaseType)
{
if (DocBaseType == null || DocBaseType.equals(REF_C_DocTypeDocBaseType.PurchaseOrder) || DocBaseType.equals(REF_C_DocTypeDocBaseType.PurchaseRequisition) || DocBaseType.equals(REF_C_DocTypeDocBaseType.MatchInvoice) || DocBaseType.equals(REF_C_DocTypeDocBaseType.MaterialProduction) || DocBaseType.equals(REF_C_DocTypeDocBaseType.ProjectIssue) || DocBaseType.equals(REF_C_DocTypeDocBaseType.APCreditMemo) || DocBaseType.equals(REF_C_DocTypeDocBaseType.ARCreditMemo) || DocBaseType.equals(REF_C_DocTypeDocBaseType.GLJournal) || DocBaseType.equals(REF_C_DocTypeDocBaseType.GLDocument) || DocBaseType.equals(REF_C_DocTypeDocBaseType.APInvoice) || DocBaseType.equals(REF_C_DocTypeDocBaseType.MatchPO) || DocBaseType.equals(REF_C_DocTypeDocBaseType.CashJournal) || DocBaseType.equals(REF_C_DocTypeDocBaseType.BillOfExchange) || DocBaseType.equals(REF_C_DocTypeDocBaseType.PersonalFeeShip) || DocBaseType.equals(REF_C_DocTypeDocBaseType.MaterialReturnOfVendor) || DocBaseType.equals(REF_C_DocTypeDocBaseType.MaterialReturnOfCustomer) || DocBaseType.equals(REF_C_DocTypeDocBaseType.APPayment) || DocBaseType.equals(REF_C_DocTypeDocBaseType.ARInvoice) || DocBaseType.equals(REF_C_DocTypeDocBaseType.ARReceipt) || DocBaseType.equals(REF_C_DocTypeDocBaseType.SalesOrder) || DocBaseType.equals(REF_C_DocTypeDocBaseType.ARProFormaInvoice) || DocBaseType.equals(REF_C_DocTypeDocBaseType.MaterialDelivery) || DocBaseType.equals(REF_C_DocTypeDocBaseType.MaterialReceipt) || DocBaseType.equals(REF_C_DocTypeDocBaseType.PaymentAllocation) || DocBaseType.equals(REF_C_DocTypeDocBaseType.MaterialPhysicalInventory) || DocBaseType.equals(REF_C_DocTypeDocBaseType.Retention) || DocBaseType.equals(REF_C_DocTypeDocBaseType.ARInvoiceFreeTransfer) || DocBaseType.equals(REF_C_DocTypeDocBaseType.DeclarationCustomsValue) || DocBaseType.equals(REF_C_DocTypeDocBaseType.APCreditMemoDiscount) || DocBaseType.equals(REF_C_DocTypeDocBaseType.MaterialMovement) || DocBaseType.equals(REF_C_DocTypeDocBaseType.BankAccountTransfer) || DocBaseType.equals(REF_C_DocTypeDocBaseType.BankStatement) || DocBaseType.equals(REF_C_DocTypeDocBaseType.Withholding) || DocBaseType.equals(REF_C_DocTypeDocBaseType.MaterialProductionReversed) || DocBaseType.equals(REF_C_DocTypeDocBaseType.Payroll) || DocBaseType.equals(REF_C_DocTypeDocBaseType.APDebit));
 else throw new IllegalArgumentException ("DocBaseType Invalid value - " + DocBaseType + " - Reference_ID=183 - POO - POR - MXI - MMP - PJI - APC - ARC - GLJ - GLD - API - MXP - CMC - BOE - FPS - MRV - MRC - APP - ARI - ARR - SOO - ARF - MMS - MMR - CMA - MMI - RET - ART - DCV - APD - MMM - BAT - CMB - WIT - MPR - HRP - APB");
if (DocBaseType != null && DocBaseType.length() > 3)
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

@XendraTrl(Identifier="f9642746-32a8-1498-17e1-44946602c011")
public static String es_PE_FIELD_GLCategory_DocumentBaseType_Description="Identifica el punto de inicio para un documento";

@XendraTrl(Identifier="f9642746-32a8-1498-17e1-44946602c011")
public static String es_PE_FIELD_GLCategory_DocumentBaseType_Help="El tipo base de documento identifica la base ó punto de inicio de un documento. Múltiples tipos de documento pueden compartir un tipo base de documento simple.";

@XendraTrl(Identifier="f9642746-32a8-1498-17e1-44946602c011")
public static String es_PE_FIELD_GLCategory_DocumentBaseType_Name="Tipo de Documento Base";

@XendraField(AD_Column_ID="DocBaseType",IsCentrallyMaintained=true,
AD_Tab_ID="ae711623-2cd3-eef7-fd56-9bfb1e6349ed",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f9642746-32a8-1498-17e1-44946602c011")
public static final String FIELDNAME_GLCategory_DocumentBaseType="f9642746-32a8-1498-17e1-44946602c011";

@XendraTrl(Identifier="14bdc0e3-56b6-dd27-a93b-047b3a43e3d5")
public static String es_PE_COLUMN_DocBaseType_Name="Tipo de Documento Base";

@XendraColumn(AD_Element_ID="d03cb659-5074-3721-d480-034c74c562e4",ColumnName="DocBaseType",
AD_Reference_ID=17,AD_Reference_Value_ID="c1999318-834d-4c66-5345-371ffe3c1f06",AD_Val_Rule_ID="",
FieldLength=3,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="14bdc0e3-56b6-dd27-a93b-047b3a43e3d5",Synchronized="2017-08-05 16:54:41.0")
/** Column name DocBaseType */
public static final String COLUMNNAME_DocBaseType = "DocBaseType";
/** Set GL Category.
@param GL_Category_ID General Ledger Category */
public void setGL_Category_ID (int GL_Category_ID)
{
if (GL_Category_ID < 1) throw new IllegalArgumentException ("GL_Category_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_GL_Category_ID, Integer.valueOf(GL_Category_ID));
}
/** Get GL Category.
@return General Ledger Category */
public int getGL_Category_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_GL_Category_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="55d7b1fb-0da2-c407-e446-e0edf4ba5aa7")
public static String es_PE_FIELD_GLCategory_GLCategory_Description="Categoría de Contabilidad General";

@XendraTrl(Identifier="55d7b1fb-0da2-c407-e446-e0edf4ba5aa7")
public static String es_PE_FIELD_GLCategory_GLCategory_Help="La Categoría de Contabilidad General es un método opcional; definido por el usuario; de agrupación de líneas de las pólizas";

@XendraTrl(Identifier="55d7b1fb-0da2-c407-e446-e0edf4ba5aa7")
public static String es_PE_FIELD_GLCategory_GLCategory_Name="Categoría CG";

@XendraField(AD_Column_ID="GL_Category_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ae711623-2cd3-eef7-fd56-9bfb1e6349ed",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="55d7b1fb-0da2-c407-e446-e0edf4ba5aa7")
public static final String FIELDNAME_GLCategory_GLCategory="55d7b1fb-0da2-c407-e446-e0edf4ba5aa7";
/** Column name GL_Category_ID */
public static final String COLUMNNAME_GL_Category_ID = "GL_Category_ID";
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
@XendraTrl(Identifier="08eca405-0838-41b1-ab0f-c9e82d1d7c73")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="08eca405-0838-41b1-ab0f-c9e82d1d7c73",
Synchronized="2017-08-05 16:54:41.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
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

@XendraTrl(Identifier="5df059ec-acf9-99b2-a560-6c22cb67d75b")
public static String es_PE_FIELD_GLCategory_Default_Description="Valor Predeterminado";

@XendraTrl(Identifier="5df059ec-acf9-99b2-a560-6c22cb67d75b")
public static String es_PE_FIELD_GLCategory_Default_Help="El cuadro de verificación indica si este registro será usado como un valor predeterminado";

@XendraTrl(Identifier="5df059ec-acf9-99b2-a560-6c22cb67d75b")
public static String es_PE_FIELD_GLCategory_Default_Name="Predeterminado";

@XendraField(AD_Column_ID="IsDefault",IsCentrallyMaintained=true,
AD_Tab_ID="ae711623-2cd3-eef7-fd56-9bfb1e6349ed",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5df059ec-acf9-99b2-a560-6c22cb67d75b")
public static final String FIELDNAME_GLCategory_Default="5df059ec-acf9-99b2-a560-6c22cb67d75b";

@XendraTrl(Identifier="697003cd-872d-00ca-28c4-552038a3c259")
public static String es_PE_COLUMN_IsDefault_Name="Predeterminado";

@XendraColumn(AD_Element_ID="8617f892-e113-a5fd-8715-687f792f136c",ColumnName="IsDefault",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="697003cd-872d-00ca-28c4-552038a3c259",
Synchronized="2017-08-05 16:54:41.0")
/** Column name IsDefault */
public static final String COLUMNNAME_IsDefault = "IsDefault";
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

@XendraTrl(Identifier="167f8808-e1f0-640c-2329-ddeac58c579c")
public static String es_PE_FIELD_GLCategory_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="167f8808-e1f0-640c-2329-ddeac58c579c")
public static String es_PE_FIELD_GLCategory_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="167f8808-e1f0-640c-2329-ddeac58c579c")
public static String es_PE_FIELD_GLCategory_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="ae711623-2cd3-eef7-fd56-9bfb1e6349ed",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=1,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="167f8808-e1f0-640c-2329-ddeac58c579c")
public static final String FIELDNAME_GLCategory_Name="167f8808-e1f0-640c-2329-ddeac58c579c";

@XendraTrl(Identifier="7593e5ea-75d2-4be4-3148-2cc9f1f1d443")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7593e5ea-75d2-4be4-3148-2cc9f1f1d443",
Synchronized="2017-08-05 16:54:41.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
}
