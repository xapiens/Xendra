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
import org.compiere.model.reference.REF_M_EDIStatus;
import org.compiere.model.reference.REF_M_EDITrxType;
/** Generated Model for M_EDI
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_EDI extends PO
{
/** Standard Constructor
@param ctx context
@param M_EDI_ID id
@param trxName transaction
*/
public X_M_EDI (Properties ctx, int M_EDI_ID, String trxName)
{
super (ctx, M_EDI_ID, trxName);
/** if (M_EDI_ID == 0)
{
setC_BP_EDI_ID (0);
setDocumentNo (null);
setEDIStatus (null);
setLine (0);
setM_EDI_ID (0);
setM_Product_ID (0);
setM_Warehouse_ID (0);
setProcessed (false);	
// N
setRequest_Qty (Env.ZERO);
setRequest_Shipdate (new Timestamp(System.currentTimeMillis()));
setTrxSent (new Timestamp(System.currentTimeMillis()));
setTrxType (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_M_EDI (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=367 */
public static int Table_ID=MTable.getTable_ID("M_EDI");

@XendraTrl(Identifier="8cfccf06-9155-f075-7bce-524e4758a565")
public static String es_PE_TAB_EDITransaction_Name="Transacción de EDI";

@XendraTab(Name="EDI Transaction",Description="",Help="",
AD_Window_ID="acfebec3-98c6-9441-ca9a-73cb2afaf512",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=true,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=false,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="8cfccf06-9155-f075-7bce-524e4758a565",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_EDITransaction="8cfccf06-9155-f075-7bce-524e4758a565";

@XendraTrl(Identifier="1fd93565-394e-4905-3b70-9b7d2c339c60")
public static String es_PE_TABLE_M_EDI_Name="Transacción EDI";

@XendraTable(Name="EDI Transaction",Description="",Help="",TableName="M_EDI",AccessLevel="3",
AD_Window_ID="acfebec3-98c6-9441-ca9a-73cb2afaf512",AD_Val_Rule_ID="",IsKey=1,LoadSeq=140,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.material",Identifier="1fd93565-394e-4905-3b70-9b7d2c339c60",
Synchronized="2017-08-16 11:43:11.0")
/** TableName=M_EDI */
public static final String Table_Name="M_EDI";


@XendraIndex(Name="m_edi_trx",Identifier="f6ac8a00-4fdd-e39a-1ae2-7ac0289e83f8",
Column_Names="c_bp_edi_id, documentno, line",IsUnique="true",
TableIdentifier="f6ac8a00-4fdd-e39a-1ae2-7ac0289e83f8",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_m_edi_trx = "f6ac8a00-4fdd-e39a-1ae2-7ac0289e83f8";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_EDI");

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
    Table_ID = MTable.getTable_ID("M_EDI");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_EDI[").append(get_ID()).append("]");
return sb.toString();
}
/** Set EDI Definition.
@param C_BP_EDI_ID Electronic Data Interchange */
public void setC_BP_EDI_ID (int C_BP_EDI_ID)
{
if (C_BP_EDI_ID < 1) throw new IllegalArgumentException ("C_BP_EDI_ID is mandatory.");
set_Value (COLUMNNAME_C_BP_EDI_ID, Integer.valueOf(C_BP_EDI_ID));
}
/** Get EDI Definition.
@return Electronic Data Interchange */
public int getC_BP_EDI_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BP_EDI_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d5fa9f6c-64a8-b1af-ea05-cdb6968cf229")
public static String es_PE_FIELD_EDITransaction_EDIDefinition_Description="Intercambio Electrónico de Datos";

@XendraTrl(Identifier="d5fa9f6c-64a8-b1af-ea05-cdb6968cf229")
public static String es_PE_FIELD_EDITransaction_EDIDefinition_Name="Definición EDI";

@XendraField(AD_Column_ID="C_BP_EDI_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8cfccf06-9155-f075-7bce-524e4758a565",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d5fa9f6c-64a8-b1af-ea05-cdb6968cf229")
public static final String FIELDNAME_EDITransaction_EDIDefinition="d5fa9f6c-64a8-b1af-ea05-cdb6968cf229";

@XendraTrl(Identifier="3c78064f-7166-b066-c627-dea1b2a7a39a")
public static String es_PE_COLUMN_C_BP_EDI_ID_Name="Definición EDI";

@XendraColumn(AD_Element_ID="2d4536fe-c8a6-dfaf-7570-055ff5448581",ColumnName="C_BP_EDI_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3c78064f-7166-b066-c627-dea1b2a7a39a",
Synchronized="2017-08-05 16:55:06.0")
/** Column name C_BP_EDI_ID */
public static final String COLUMNNAME_C_BP_EDI_ID = "C_BP_EDI_ID";
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

@XendraTrl(Identifier="4ffaf533-b88c-a2ad-95a5-fa7412677c73")
public static String es_PE_FIELD_EDITransaction_DocumentNo_Description="Número de secuencia del documento para cada documento";

@XendraTrl(Identifier="4ffaf533-b88c-a2ad-95a5-fa7412677c73")
public static String es_PE_FIELD_EDITransaction_DocumentNo_Help="El número del documento es usualmente generado en automático por el sistema y determinado por el tipo del documento. Si el documento no se salva; el número preliminar se despliega entre \"<>\"";

@XendraTrl(Identifier="4ffaf533-b88c-a2ad-95a5-fa7412677c73")
public static String es_PE_FIELD_EDITransaction_DocumentNo_Name="No. del Documento";

@XendraField(AD_Column_ID="DocumentNo",IsCentrallyMaintained=true,
AD_Tab_ID="8cfccf06-9155-f075-7bce-524e4758a565",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4ffaf533-b88c-a2ad-95a5-fa7412677c73")
public static final String FIELDNAME_EDITransaction_DocumentNo="4ffaf533-b88c-a2ad-95a5-fa7412677c73";

@XendraTrl(Identifier="a22bbb05-38a1-a0eb-aaf9-8f4b2b7adbf0")
public static String es_PE_COLUMN_DocumentNo_Name="No. del Documento";

@XendraColumn(AD_Element_ID="e3ca6e28-702a-2722-d941-b2072a0de9cb",ColumnName="DocumentNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a22bbb05-38a1-a0eb-aaf9-8f4b2b7adbf0",
Synchronized="2017-08-05 16:55:06.0")
/** Column name DocumentNo */
public static final String COLUMNNAME_DocumentNo = "DocumentNo";

/** EDIStatus AD_Reference=3554c7e0-2df9-4353-ac1b-73440df5fe3d */
public static final int EDISTATUS_AD_Reference_ID=202;
/** Set EDI Status.
@param EDIStatus EDI Status */
public void setEDIStatus (String EDIStatus)
{
if (EDIStatus == null) throw new IllegalArgumentException ("EDIStatus is mandatory");
if (EDIStatus.equals(REF_M_EDIStatus.Sent) || EDIStatus.equals(REF_M_EDIStatus.Acknowledged) || EDIStatus.equals(REF_M_EDIStatus.Draft) || EDIStatus.equals(REF_M_EDIStatus.AnsweredComplete));
 else throw new IllegalArgumentException ("EDIStatus Invalid value - " + EDIStatus + " - Reference_ID=202 - S - A - D - C");
if (EDIStatus.length() > 1)
{
log.warning("Length > 1 - truncated");
EDIStatus = EDIStatus.substring(0,0);
}
set_ValueNoCheck (COLUMNNAME_EDIStatus, EDIStatus);
}
/** Get EDI Status.
@return EDI Status */
public String getEDIStatus() 
{
return (String)get_Value(COLUMNNAME_EDIStatus);
}

@XendraTrl(Identifier="20dd0ce3-fb57-d8a0-1a7c-953ec8d4b250")
public static String es_PE_FIELD_EDITransaction_EDIStatus_Name="Estado EDI";

@XendraField(AD_Column_ID="EDIStatus",IsCentrallyMaintained=true,
AD_Tab_ID="8cfccf06-9155-f075-7bce-524e4758a565",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="20dd0ce3-fb57-d8a0-1a7c-953ec8d4b250")
public static final String FIELDNAME_EDITransaction_EDIStatus="20dd0ce3-fb57-d8a0-1a7c-953ec8d4b250";

@XendraTrl(Identifier="84b1d720-8817-e19f-e4a6-cf5d176889cb")
public static String es_PE_COLUMN_EDIStatus_Name="Estado EDI";

@XendraColumn(AD_Element_ID="6e65c301-f13d-8e38-82d7-adb3f3a5a783",ColumnName="EDIStatus",
AD_Reference_ID=17,AD_Reference_Value_ID="3554c7e0-2df9-4353-ac1b-73440df5fe3d",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="84b1d720-8817-e19f-e4a6-cf5d176889cb",Synchronized="2017-08-05 16:55:06.0")
/** Column name EDIStatus */
public static final String COLUMNNAME_EDIStatus = "EDIStatus";
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
@XendraTrl(Identifier="875b29fc-4cea-4a16-9a12-0b95bc9dc176")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="875b29fc-4cea-4a16-9a12-0b95bc9dc176",
Synchronized="2015-08-11 20:38:55.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
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

@XendraTrl(Identifier="adc8d609-fb4b-3d4d-b1cf-633e43d380ba")
public static String es_PE_FIELD_EDITransaction_LineNo_Description="No. Línea único para este documento";

@XendraTrl(Identifier="adc8d609-fb4b-3d4d-b1cf-633e43d380ba")
public static String es_PE_FIELD_EDITransaction_LineNo_Help="Indica el No. Línea para un documento. También controlará el orden de despliegue de las líneas dentro de un documento";

@XendraTrl(Identifier="adc8d609-fb4b-3d4d-b1cf-633e43d380ba")
public static String es_PE_FIELD_EDITransaction_LineNo_Name="No. Línea";

@XendraField(AD_Column_ID="Line",IsCentrallyMaintained=true,
AD_Tab_ID="8cfccf06-9155-f075-7bce-524e4758a565",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="adc8d609-fb4b-3d4d-b1cf-633e43d380ba")
public static final String FIELDNAME_EDITransaction_LineNo="adc8d609-fb4b-3d4d-b1cf-633e43d380ba";

@XendraTrl(Identifier="da51c6c1-5db0-855f-d22f-23493a3dba97")
public static String es_PE_COLUMN_Line_Name="No. Línea";

@XendraColumn(AD_Element_ID="986ef077-61da-f9cf-1c6d-aefe3a35113b",ColumnName="Line",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=2,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="da51c6c1-5db0-855f-d22f-23493a3dba97",
Synchronized="2017-08-05 16:55:06.0")
/** Column name Line */
public static final String COLUMNNAME_Line = "Line";
/** Set EDI Transaction.
@param M_EDI_ID EDI Transaction */
public void setM_EDI_ID (int M_EDI_ID)
{
if (M_EDI_ID < 1) throw new IllegalArgumentException ("M_EDI_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_EDI_ID, Integer.valueOf(M_EDI_ID));
}
/** Get EDI Transaction.
@return EDI Transaction */
public int getM_EDI_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_EDI_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="e3c82e58-198c-87de-755f-ed1e2a08aa59")
public static String es_PE_FIELD_EDITransaction_EDITransaction_Name="Transacción EDI";

@XendraField(AD_Column_ID="M_EDI_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8cfccf06-9155-f075-7bce-524e4758a565",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e3c82e58-198c-87de-755f-ed1e2a08aa59")
public static final String FIELDNAME_EDITransaction_EDITransaction="e3c82e58-198c-87de-755f-ed1e2a08aa59";
/** Column name M_EDI_ID */
public static final String COLUMNNAME_M_EDI_ID = "M_EDI_ID";
/** Set Product.
@param M_Product_ID Product, Service, Item */
public void setM_Product_ID (int M_Product_ID)
{
if (M_Product_ID < 1) throw new IllegalArgumentException ("M_Product_ID is mandatory.");
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

@XendraTrl(Identifier="849952b1-3e40-0052-0f5b-992882da5318")
public static String es_PE_FIELD_EDITransaction_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="849952b1-3e40-0052-0f5b-992882da5318")
public static String es_PE_FIELD_EDITransaction_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraTrl(Identifier="849952b1-3e40-0052-0f5b-992882da5318")
public static String es_PE_FIELD_EDITransaction_Product_Name="Producto";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8cfccf06-9155-f075-7bce-524e4758a565",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="849952b1-3e40-0052-0f5b-992882da5318")
public static final String FIELDNAME_EDITransaction_Product="849952b1-3e40-0052-0f5b-992882da5318";

@XendraTrl(Identifier="ecb923c0-3960-d5a6-73a5-b226bbc2c282")
public static String es_PE_COLUMN_M_Product_ID_Name="Producto";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ecb923c0-3960-d5a6-73a5-b226bbc2c282",
Synchronized="2017-08-05 16:55:06.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
/** Set Warehouse.
@param M_Warehouse_ID Storage Warehouse and Service Point */
public void setM_Warehouse_ID (int M_Warehouse_ID)
{
if (M_Warehouse_ID < 1) throw new IllegalArgumentException ("M_Warehouse_ID is mandatory.");
set_Value (COLUMNNAME_M_Warehouse_ID, Integer.valueOf(M_Warehouse_ID));
}
/** Get Warehouse.
@return Storage Warehouse and Service Point */
public int getM_Warehouse_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Warehouse_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="1919c6f5-c18f-7f93-3718-2e066a10530f")
public static String es_PE_FIELD_EDITransaction_Warehouse_Description="Almacén";

@XendraTrl(Identifier="1919c6f5-c18f-7f93-3718-2e066a10530f")
public static String es_PE_FIELD_EDITransaction_Warehouse_Help="El Almacén indica un Almacén único donde los productos son almacenados";

@XendraTrl(Identifier="1919c6f5-c18f-7f93-3718-2e066a10530f")
public static String es_PE_FIELD_EDITransaction_Warehouse_Name="Almacén";

@XendraField(AD_Column_ID="M_Warehouse_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8cfccf06-9155-f075-7bce-524e4758a565",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1919c6f5-c18f-7f93-3718-2e066a10530f")
public static final String FIELDNAME_EDITransaction_Warehouse="1919c6f5-c18f-7f93-3718-2e066a10530f";

@XendraTrl(Identifier="1eab4562-ee61-6535-640b-506e30189b7e")
public static String es_PE_COLUMN_M_Warehouse_ID_Name="Almacén";

@XendraColumn(AD_Element_ID="402045cd-baa5-aeaf-b148-a921dffb7821",ColumnName="M_Warehouse_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1eab4562-ee61-6535-640b-506e30189b7e",
Synchronized="2017-08-05 16:55:06.0")
/** Column name M_Warehouse_ID */
public static final String COLUMNNAME_M_Warehouse_ID = "M_Warehouse_ID";
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

@XendraTrl(Identifier="8c53bb4e-7242-bb5e-d41d-949e07e8bcfc")
public static String es_PE_FIELD_EDITransaction_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="8c53bb4e-7242-bb5e-d41d-949e07e8bcfc")
public static String es_PE_FIELD_EDITransaction_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraTrl(Identifier="8c53bb4e-7242-bb5e-d41d-949e07e8bcfc")
public static String es_PE_FIELD_EDITransaction_Processed_Name="Procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="8cfccf06-9155-f075-7bce-524e4758a565",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=230,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8c53bb4e-7242-bb5e-d41d-949e07e8bcfc")
public static final String FIELDNAME_EDITransaction_Processed="8c53bb4e-7242-bb5e-d41d-949e07e8bcfc";

@XendraTrl(Identifier="5f28084b-f3e8-316d-268f-f70efc50931e")
public static String es_PE_COLUMN_Processed_Name="Procesado";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5f28084b-f3e8-316d-268f-f70efc50931e",
Synchronized="2017-08-05 16:55:06.0")
/** Column name Processed */
public static final String COLUMNNAME_Processed = "Processed";
/** Set Reply Price.
@param Reply_Price Confirmed Price from EDI Partner */
public void setReply_Price (BigDecimal Reply_Price)
{
set_Value (COLUMNNAME_Reply_Price, Reply_Price);
}
/** Get Reply Price.
@return Confirmed Price from EDI Partner */
public BigDecimal getReply_Price() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Reply_Price);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="9fefbe9e-153a-4af1-578d-27881813f208")
public static String es_PE_FIELD_EDITransaction_ReplyPrice_Description="Precio confirmado EDI  por el socio.";

@XendraTrl(Identifier="9fefbe9e-153a-4af1-578d-27881813f208")
public static String es_PE_FIELD_EDITransaction_ReplyPrice_Name="Respuesta de Precio";

@XendraField(AD_Column_ID="Reply_Price",IsCentrallyMaintained=true,
AD_Tab_ID="8cfccf06-9155-f075-7bce-524e4758a565",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=210,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9fefbe9e-153a-4af1-578d-27881813f208")
public static final String FIELDNAME_EDITransaction_ReplyPrice="9fefbe9e-153a-4af1-578d-27881813f208";

@XendraTrl(Identifier="fa013896-3c75-9014-6866-6528c581d148")
public static String es_PE_COLUMN_Reply_Price_Name="Respuesta de Precio";

@XendraColumn(AD_Element_ID="d4de3a43-11c4-5af6-eb9c-98485d4dab60",ColumnName="Reply_Price",
AD_Reference_ID=37,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fa013896-3c75-9014-6866-6528c581d148",
Synchronized="2017-08-05 16:55:06.0")
/** Column name Reply_Price */
public static final String COLUMNNAME_Reply_Price = "Reply_Price";
/** Set Reply Qty Available.
@param Reply_QtyAvailable Reply Qty Available */
public void setReply_QtyAvailable (BigDecimal Reply_QtyAvailable)
{
set_Value (COLUMNNAME_Reply_QtyAvailable, Reply_QtyAvailable);
}
/** Get Reply Qty Available.
@return Reply Qty Available */
public BigDecimal getReply_QtyAvailable() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Reply_QtyAvailable);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="3e94cce0-6170-e91a-cddb-18bc7a4ab1a9")
public static String es_PE_FIELD_EDITransaction_ReplyQtyAvailable_Name="Respuesta de Cantidad Disponible";

@XendraField(AD_Column_ID="Reply_QtyAvailable",IsCentrallyMaintained=true,
AD_Tab_ID="8cfccf06-9155-f075-7bce-524e4758a565",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=190,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3e94cce0-6170-e91a-cddb-18bc7a4ab1a9")
public static final String FIELDNAME_EDITransaction_ReplyQtyAvailable="3e94cce0-6170-e91a-cddb-18bc7a4ab1a9";

@XendraTrl(Identifier="407a2772-8a68-4603-8d94-0115fb8a4754")
public static String es_PE_COLUMN_Reply_QtyAvailable_Name="Respuesta de Cantidad Disponible";

@XendraColumn(AD_Element_ID="fe002813-3180-52f3-0a9b-d91adf9df197",ColumnName="Reply_QtyAvailable",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="407a2772-8a68-4603-8d94-0115fb8a4754",
Synchronized="2017-08-05 16:55:06.0")
/** Column name Reply_QtyAvailable */
public static final String COLUMNNAME_Reply_QtyAvailable = "Reply_QtyAvailable";
/** Set Reply Qty Confirmed.
@param Reply_QtyConfirmed Reply Qty Confirmed */
public void setReply_QtyConfirmed (BigDecimal Reply_QtyConfirmed)
{
set_Value (COLUMNNAME_Reply_QtyConfirmed, Reply_QtyConfirmed);
}
/** Get Reply Qty Confirmed.
@return Reply Qty Confirmed */
public BigDecimal getReply_QtyConfirmed() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Reply_QtyConfirmed);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="3f17f563-0557-c604-f3c1-4dac45339c45")
public static String es_PE_FIELD_EDITransaction_ReplyQtyConfirmed_Name="Respuesta de Cantidad Confirmada";

@XendraField(AD_Column_ID="Reply_QtyConfirmed",IsCentrallyMaintained=true,
AD_Tab_ID="8cfccf06-9155-f075-7bce-524e4758a565",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3f17f563-0557-c604-f3c1-4dac45339c45")
public static final String FIELDNAME_EDITransaction_ReplyQtyConfirmed="3f17f563-0557-c604-f3c1-4dac45339c45";

@XendraTrl(Identifier="280d4c4b-4bb0-5b32-8ac6-7c46be7c771b")
public static String es_PE_COLUMN_Reply_QtyConfirmed_Name="Respuesta de Cantidad Confirmada";

@XendraColumn(AD_Element_ID="0ce461dd-5c1c-86bb-76d6-6a079aedba0e",ColumnName="Reply_QtyConfirmed",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="280d4c4b-4bb0-5b32-8ac6-7c46be7c771b",
Synchronized="2017-08-05 16:55:06.0")
/** Column name Reply_QtyConfirmed */
public static final String COLUMNNAME_Reply_QtyConfirmed = "Reply_QtyConfirmed";
/** Set Reply Received.
@param Reply_Received Reply Received */
public void setReply_Received (Timestamp Reply_Received)
{
set_Value (COLUMNNAME_Reply_Received, Reply_Received);
}
/** Get Reply Received.
@return Reply Received */
public Timestamp getReply_Received() 
{
return (Timestamp)get_Value(COLUMNNAME_Reply_Received);
}

@XendraTrl(Identifier="9684cd84-3a81-b61d-b775-f48a7a383397")
public static String es_PE_FIELD_EDITransaction_ReplyReceived_Name="Respuesta Recibida";

@XendraField(AD_Column_ID="Reply_Received",IsCentrallyMaintained=true,
AD_Tab_ID="8cfccf06-9155-f075-7bce-524e4758a565",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9684cd84-3a81-b61d-b775-f48a7a383397")
public static final String FIELDNAME_EDITransaction_ReplyReceived="9684cd84-3a81-b61d-b775-f48a7a383397";

@XendraTrl(Identifier="1cc19de8-4ecd-f5b9-aa33-22e33c547a19")
public static String es_PE_COLUMN_Reply_Received_Name="Respuesta Recibida";

@XendraColumn(AD_Element_ID="a0fa3b66-35a7-3917-1aca-8d9734e3cb07",ColumnName="Reply_Received",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1cc19de8-4ecd-f5b9-aa33-22e33c547a19",
Synchronized="2017-08-05 16:55:06.0")
/** Column name Reply_Received */
public static final String COLUMNNAME_Reply_Received = "Reply_Received";
/** Set Reply Remarks.
@param Reply_Remarks Reply Remarks */
public void setReply_Remarks (String Reply_Remarks)
{
set_Value (COLUMNNAME_Reply_Remarks, Reply_Remarks);
}
/** Get Reply Remarks.
@return Reply Remarks */
public String getReply_Remarks() 
{
String value = (String)get_Value(COLUMNNAME_Reply_Remarks);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="898dd95a-d865-4c52-e1e7-450797353876")
public static String es_PE_FIELD_EDITransaction_ReplyRemarks_Name="Observaciones de Respuesta";

@XendraField(AD_Column_ID="Reply_Remarks",IsCentrallyMaintained=true,
AD_Tab_ID="8cfccf06-9155-f075-7bce-524e4758a565",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=220,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="898dd95a-d865-4c52-e1e7-450797353876")
public static final String FIELDNAME_EDITransaction_ReplyRemarks="898dd95a-d865-4c52-e1e7-450797353876";

@XendraTrl(Identifier="fd708b20-e389-b297-ae17-7a28cb52ea78")
public static String es_PE_COLUMN_Reply_Remarks_Name="Observaciones de Respuesta";

@XendraColumn(AD_Element_ID="cc7d51cd-4431-c864-4576-1462c14ef722",ColumnName="Reply_Remarks",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fd708b20-e389-b297-ae17-7a28cb52ea78",
Synchronized="2017-08-05 16:55:06.0")
/** Column name Reply_Remarks */
public static final String COLUMNNAME_Reply_Remarks = "Reply_Remarks";
/** Set Reply Ship date.
@param Reply_ShipDate Reply Ship date */
public void setReply_ShipDate (Timestamp Reply_ShipDate)
{
set_Value (COLUMNNAME_Reply_ShipDate, Reply_ShipDate);
}
/** Get Reply Ship date.
@return Reply Ship date */
public Timestamp getReply_ShipDate() 
{
return (Timestamp)get_Value(COLUMNNAME_Reply_ShipDate);
}

@XendraTrl(Identifier="135a4489-03f7-166e-ebd9-d8a359696a45")
public static String es_PE_FIELD_EDITransaction_ReplyShipDate_Name="Respuesta de Fecha de Entrega";

@XendraField(AD_Column_ID="Reply_ShipDate",IsCentrallyMaintained=true,
AD_Tab_ID="8cfccf06-9155-f075-7bce-524e4758a565",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=200,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="135a4489-03f7-166e-ebd9-d8a359696a45")
public static final String FIELDNAME_EDITransaction_ReplyShipDate="135a4489-03f7-166e-ebd9-d8a359696a45";

@XendraTrl(Identifier="d1c20d3d-11e1-b2a5-1a13-dceb1a866509")
public static String es_PE_COLUMN_Reply_ShipDate_Name="Respuesta de Fecha de Entrega";

@XendraColumn(AD_Element_ID="2bcbbd38-d6bc-581a-07ae-f2707dc2654e",ColumnName="Reply_ShipDate",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d1c20d3d-11e1-b2a5-1a13-dceb1a866509",
Synchronized="2017-08-05 16:55:06.0")
/** Column name Reply_ShipDate */
public static final String COLUMNNAME_Reply_ShipDate = "Reply_ShipDate";
/** Set Request Price.
@param Request_Price Request Price */
public void setRequest_Price (BigDecimal Request_Price)
{
set_Value (COLUMNNAME_Request_Price, Request_Price);
}
/** Get Request Price.
@return Request Price */
public BigDecimal getRequest_Price() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Request_Price);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="afacb5ad-cfea-986c-78cf-611a5b2ae9a8")
public static String es_PE_FIELD_EDITransaction_RequestPrice_Name="Precio Solicitado";

@XendraField(AD_Column_ID="Request_Price",IsCentrallyMaintained=true,
AD_Tab_ID="8cfccf06-9155-f075-7bce-524e4758a565",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="afacb5ad-cfea-986c-78cf-611a5b2ae9a8")
public static final String FIELDNAME_EDITransaction_RequestPrice="afacb5ad-cfea-986c-78cf-611a5b2ae9a8";

@XendraTrl(Identifier="6e59266d-15ab-e101-b2a7-853799f3d3d4")
public static String es_PE_COLUMN_Request_Price_Name="Precio Solicitado";

@XendraColumn(AD_Element_ID="22620dda-b588-2441-abd0-67c9ada9ecdf",ColumnName="Request_Price",
AD_Reference_ID=37,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6e59266d-15ab-e101-b2a7-853799f3d3d4",
Synchronized="2017-08-05 16:55:06.0")
/** Column name Request_Price */
public static final String COLUMNNAME_Request_Price = "Request_Price";
/** Set Request Qty.
@param Request_Qty Request Qty */
public void setRequest_Qty (BigDecimal Request_Qty)
{
if (Request_Qty == null) throw new IllegalArgumentException ("Request_Qty is mandatory.");
set_Value (COLUMNNAME_Request_Qty, Request_Qty);
}
/** Get Request Qty.
@return Request Qty */
public BigDecimal getRequest_Qty() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Request_Qty);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="4311e8f9-1244-7054-8ae7-db0290052774")
public static String es_PE_FIELD_EDITransaction_RequestQty_Name="Cantidad Solicitada ";

@XendraField(AD_Column_ID="Request_Qty",IsCentrallyMaintained=true,
AD_Tab_ID="8cfccf06-9155-f075-7bce-524e4758a565",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4311e8f9-1244-7054-8ae7-db0290052774")
public static final String FIELDNAME_EDITransaction_RequestQty="4311e8f9-1244-7054-8ae7-db0290052774";

@XendraTrl(Identifier="4e30bf52-f20b-5ea3-2986-6142c9199418")
public static String es_PE_COLUMN_Request_Qty_Name="Cantidad Solicitada ";

@XendraColumn(AD_Element_ID="ca825781-d8e0-e1bf-ce14-eb8a2157f012",ColumnName="Request_Qty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4e30bf52-f20b-5ea3-2986-6142c9199418",
Synchronized="2017-08-05 16:55:06.0")
/** Column name Request_Qty */
public static final String COLUMNNAME_Request_Qty = "Request_Qty";
/** Set Request Ship date.
@param Request_Shipdate Request Ship date */
public void setRequest_Shipdate (Timestamp Request_Shipdate)
{
if (Request_Shipdate == null) throw new IllegalArgumentException ("Request_Shipdate is mandatory.");
set_Value (COLUMNNAME_Request_Shipdate, Request_Shipdate);
}
/** Get Request Ship date.
@return Request Ship date */
public Timestamp getRequest_Shipdate() 
{
return (Timestamp)get_Value(COLUMNNAME_Request_Shipdate);
}

@XendraTrl(Identifier="1aa58e10-fcdf-d3aa-be89-38abc56aa7a7")
public static String es_PE_FIELD_EDITransaction_RequestShipDate_Name="Solicitud de fecha de despacho";

@XendraField(AD_Column_ID="Request_Shipdate",IsCentrallyMaintained=true,
AD_Tab_ID="8cfccf06-9155-f075-7bce-524e4758a565",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1aa58e10-fcdf-d3aa-be89-38abc56aa7a7")
public static final String FIELDNAME_EDITransaction_RequestShipDate="1aa58e10-fcdf-d3aa-be89-38abc56aa7a7";

@XendraTrl(Identifier="35242f40-85ea-6497-3655-57e893a15812")
public static String es_PE_COLUMN_Request_Shipdate_Name="Solicitud de fecha de despacho";

@XendraColumn(AD_Element_ID="54d06e06-a56d-af8a-7d69-5d05be79a355",ColumnName="Request_Shipdate",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="35242f40-85ea-6497-3655-57e893a15812",
Synchronized="2017-08-05 16:55:06.0")
/** Column name Request_Shipdate */
public static final String COLUMNNAME_Request_Shipdate = "Request_Shipdate";
/** Set Transaction received.
@param TrxReceived Transaction received */
public void setTrxReceived (Timestamp TrxReceived)
{
set_Value (COLUMNNAME_TrxReceived, TrxReceived);
}
/** Get Transaction received.
@return Transaction received */
public Timestamp getTrxReceived() 
{
return (Timestamp)get_Value(COLUMNNAME_TrxReceived);
}

@XendraTrl(Identifier="5785329a-cf2b-9d4c-ef28-e34a0fc5a6aa")
public static String es_PE_FIELD_EDITransaction_TransactionReceived_Name="Transacción recibida";

@XendraField(AD_Column_ID="TrxReceived",IsCentrallyMaintained=true,
AD_Tab_ID="8cfccf06-9155-f075-7bce-524e4758a565",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5785329a-cf2b-9d4c-ef28-e34a0fc5a6aa")
public static final String FIELDNAME_EDITransaction_TransactionReceived="5785329a-cf2b-9d4c-ef28-e34a0fc5a6aa";

@XendraTrl(Identifier="ed9c4064-bc5b-b929-6c93-e97a47762241")
public static String es_PE_COLUMN_TrxReceived_Name="Transacción recibida";

@XendraColumn(AD_Element_ID="637696ed-1105-8dcf-1250-a2a4f9152bf9",ColumnName="TrxReceived",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ed9c4064-bc5b-b929-6c93-e97a47762241",
Synchronized="2017-08-05 16:55:06.0")
/** Column name TrxReceived */
public static final String COLUMNNAME_TrxReceived = "TrxReceived";
/** Set Transaction sent.
@param TrxSent Transaction sent */
public void setTrxSent (Timestamp TrxSent)
{
if (TrxSent == null) throw new IllegalArgumentException ("TrxSent is mandatory.");
set_Value (COLUMNNAME_TrxSent, TrxSent);
}
/** Get Transaction sent.
@return Transaction sent */
public Timestamp getTrxSent() 
{
return (Timestamp)get_Value(COLUMNNAME_TrxSent);
}

@XendraTrl(Identifier="3ec8f182-339e-8bce-c8f3-6ce087d578d4")
public static String es_PE_FIELD_EDITransaction_TransactionSent_Name="Transacción Enviada";

@XendraField(AD_Column_ID="TrxSent",IsCentrallyMaintained=true,
AD_Tab_ID="8cfccf06-9155-f075-7bce-524e4758a565",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3ec8f182-339e-8bce-c8f3-6ce087d578d4")
public static final String FIELDNAME_EDITransaction_TransactionSent="3ec8f182-339e-8bce-c8f3-6ce087d578d4";

@XendraTrl(Identifier="5fd97911-6923-4fe9-617b-16b3f78e465b")
public static String es_PE_COLUMN_TrxSent_Name="Transacción Enviada";

@XendraColumn(AD_Element_ID="6680e5d5-859f-cbe8-46fc-0cc8584029ad",ColumnName="TrxSent",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5fd97911-6923-4fe9-617b-16b3f78e465b",
Synchronized="2017-08-05 16:55:06.0")
/** Column name TrxSent */
public static final String COLUMNNAME_TrxSent = "TrxSent";

/** TrxType AD_Reference=aa874fb2-4ea5-4397-98be-844319667774 */
public static final int TRXTYPE_AD_Reference_ID=203;
/** Set Transaction Type.
@param TrxType Type of credit card transaction */
public void setTrxType (String TrxType)
{
if (TrxType == null) throw new IllegalArgumentException ("TrxType is mandatory");
if (TrxType.equals(REF_M_EDITrxType.Inquiry) || TrxType.equals(REF_M_EDITrxType.PurchaseOrder));
 else throw new IllegalArgumentException ("TrxType Invalid value - " + TrxType + " - Reference_ID=203 - I - O");
if (TrxType.length() > 1)
{
log.warning("Length > 1 - truncated");
TrxType = TrxType.substring(0,0);
}
set_ValueNoCheck (COLUMNNAME_TrxType, TrxType);
}
/** Get Transaction Type.
@return Type of credit card transaction */
public String getTrxType() 
{
return (String)get_Value(COLUMNNAME_TrxType);
}

@XendraTrl(Identifier="e06b18fe-a729-8731-4aa3-f2e2d8390ae6")
public static String es_PE_FIELD_EDITransaction_TransactionType_Description="Tipo de transacción de la tarjeta de crédito";

@XendraTrl(Identifier="e06b18fe-a729-8731-4aa3-f2e2d8390ae6")
public static String es_PE_FIELD_EDITransaction_TransactionType_Help="El tipo de transacción indica el tipo de transacción a ser sometida a la compañía de la tarjeta de crédito.";

@XendraTrl(Identifier="e06b18fe-a729-8731-4aa3-f2e2d8390ae6")
public static String es_PE_FIELD_EDITransaction_TransactionType_Name="Tipo de Transacción";

@XendraField(AD_Column_ID="TrxType",IsCentrallyMaintained=true,
AD_Tab_ID="8cfccf06-9155-f075-7bce-524e4758a565",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e06b18fe-a729-8731-4aa3-f2e2d8390ae6")
public static final String FIELDNAME_EDITransaction_TransactionType="e06b18fe-a729-8731-4aa3-f2e2d8390ae6";

@XendraTrl(Identifier="93483761-453f-3669-9bab-3633366b7ace")
public static String es_PE_COLUMN_TrxType_Name="Tipo de Transacción";

@XendraColumn(AD_Element_ID="4d4a53c4-1cc3-27bd-5eb1-03412d96bc93",ColumnName="TrxType",
AD_Reference_ID=17,AD_Reference_Value_ID="aa874fb2-4ea5-4397-98be-844319667774",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="93483761-453f-3669-9bab-3633366b7ace",Synchronized="2017-08-05 16:55:06.0")
/** Column name TrxType */
public static final String COLUMNNAME_TrxType = "TrxType";
}
