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
/** Generated Model for M_StockTakingLine
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_StockTakingLine extends PO
{
/** Standard Constructor
@param ctx context
@param M_StockTakingLine_ID id
@param trxName transaction
*/
public X_M_StockTakingLine (Properties ctx, int M_StockTakingLine_ID, String trxName)
{
super (ctx, M_StockTakingLine_ID, trxName);
/** if (M_StockTakingLine_ID == 0)
{
setM_Locator_ID (0);
setM_Product_ID (0);
setM_StockTaking_ID (0);
setM_StockTakingLine_ID (0);
setProcessed (false);	
// N
setQtyCount (Env.ZERO);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_M_StockTakingLine (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000247 */
public static int Table_ID=MTable.getTable_ID("M_StockTakingLine");

@XendraTrl(Identifier="cfdf8349-9b1c-49ba-ab9d-ffe4e771a79e")
public static String es_PE_TAB_LineasDeLaTomaDeInventario_Name="Lineas de la Toma de Inventario";

@XendraTab(Name="Lineas de la Toma de Inventario",Description="",Help="",
AD_Window_ID="d70f618b-5e90-467e-b814-86738b3a139d",SeqNo=20,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="cfdf8349-9b1c-49ba-ab9d-ffe4e771a79e",Synchronized="2017-05-04 22:52:22.0")
public static final String TABNAME_LineasDeLaTomaDeInventario="cfdf8349-9b1c-49ba-ab9d-ffe4e771a79e";

@XendraTrl(Identifier="362ce506-c462-98d3-cb50-828718e3bdc6")
public static String es_PE_TABLE_M_StockTakingLine_Name="Stock Taking Line";

@XendraTable(Name="Stock Taking Line",Description="",Help="",TableName="M_StockTakingLine",
AccessLevel="3",AD_Window_ID="d70f618b-5e90-467e-b814-86738b3a139d",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=0,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=false,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.material",
Identifier="362ce506-c462-98d3-cb50-828718e3bdc6",Synchronized="2017-08-16 11:43:36.0")
/** TableName=M_StockTakingLine */
public static final String Table_Name="M_StockTakingLine";


@XendraIndex(Name="m_stocktakingline_productlocattr",
Identifier="097a7e1d-8c91-e76c-de1f-7370ff3c6c3b",
Column_Names="m_stocktaking_id, m_locator_id, m_product_id, m_attributesetinstance_id",
IsUnique="true",TableIdentifier="097a7e1d-8c91-e76c-de1f-7370ff3c6c3b",
Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_m_stocktakingline_productlocattr = "097a7e1d-8c91-e76c-de1f-7370ff3c6c3b";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_StockTakingLine");

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
    Table_ID = MTable.getTable_ID("M_StockTakingLine");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_StockTakingLine[").append(get_ID()).append("]");
return sb.toString();
}
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

@XendraTrl(Identifier="5ef4e54b-958a-4dce-8715-3448dd3e366c")
public static String es_PE_FIELD_LineasDeLaTomaDeInventario_UOM_Description="Unidad de Medida";

@XendraTrl(Identifier="5ef4e54b-958a-4dce-8715-3448dd3e366c")
public static String es_PE_FIELD_LineasDeLaTomaDeInventario_UOM_Help="La UM define una unidad de medida única no monetaria";

@XendraTrl(Identifier="5ef4e54b-958a-4dce-8715-3448dd3e366c")
public static String es_PE_FIELD_LineasDeLaTomaDeInventario_UOM_Name="UM";

@XendraField(AD_Column_ID="C_UOM_ID",IsCentrallyMaintained=true,
AD_Tab_ID="cfdf8349-9b1c-49ba-ab9d-ffe4e771a79e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2017-05-04 22:52:21.0",
Identifier="5ef4e54b-958a-4dce-8715-3448dd3e366c")
public static final String FIELDNAME_LineasDeLaTomaDeInventario_UOM="5ef4e54b-958a-4dce-8715-3448dd3e366c";

@XendraTrl(Identifier="cae226d2-3028-47f4-a4c4-ce2df9e54620")
public static String es_PE_COLUMN_C_UOM_ID_Name="UOM";

@XendraColumn(AD_Element_ID="d0345019-4fcc-44c8-4fd1-e38e3b4adeed",ColumnName="C_UOM_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cae226d2-3028-47f4-a4c4-ce2df9e54620",
Synchronized="2013-12-27 18:35:24.0")
/** Column name C_UOM_ID */
public static final String COLUMNNAME_C_UOM_ID = "C_UOM_ID";
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

@XendraTrl(Identifier="3f0d1535-b8a5-4f3a-827f-db8b3fa35b06")
public static String es_PE_FIELD_LineasDeLaTomaDeInventario_Description_Description="Descripción corta opcional del registro";

@XendraTrl(Identifier="3f0d1535-b8a5-4f3a-827f-db8b3fa35b06")
public static String es_PE_FIELD_LineasDeLaTomaDeInventario_Description_Help="Una descripción esta limitada a 255 caracteres";

@XendraTrl(Identifier="3f0d1535-b8a5-4f3a-827f-db8b3fa35b06")
public static String es_PE_FIELD_LineasDeLaTomaDeInventario_Description_Name="Descripción";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="cfdf8349-9b1c-49ba-ab9d-ffe4e771a79e",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=255,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2017-05-04 22:52:21.0",
Identifier="3f0d1535-b8a5-4f3a-827f-db8b3fa35b06")
public static final String FIELDNAME_LineasDeLaTomaDeInventario_Description="3f0d1535-b8a5-4f3a-827f-db8b3fa35b06";

@XendraTrl(Identifier="9aaaca72-1690-c9ce-561e-d54e5642b294")
public static String es_PE_COLUMN_Description_Name="Description";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9aaaca72-1690-c9ce-561e-d54e5642b294",
Synchronized="2017-08-05 16:55:34.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Error Msg.
@param ErrorMsg Error Msg */
public void setErrorMsg (String ErrorMsg)
{
set_Value (COLUMNNAME_ErrorMsg, ErrorMsg);
}
/** Get Error Msg.
@return Error Msg */
public String getErrorMsg() 
{
String value = (String)get_Value(COLUMNNAME_ErrorMsg);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="98d6bdbc-000d-40d1-8fc6-213c6a54f696")
public static String es_PE_FIELD_LineasDeLaTomaDeInventario_ErrorMsg_Name="Mensaje de Error";

@XendraField(AD_Column_ID="ErrorMsg",IsCentrallyMaintained=true,
AD_Tab_ID="cfdf8349-9b1c-49ba-ab9d-ffe4e771a79e",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=2000,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2017-05-04 22:52:21.0",
Identifier="98d6bdbc-000d-40d1-8fc6-213c6a54f696")
public static final String FIELDNAME_LineasDeLaTomaDeInventario_ErrorMsg="98d6bdbc-000d-40d1-8fc6-213c6a54f696";

@XendraTrl(Identifier="e909e534-00cc-41da-bced-a586c8f615b9")
public static String es_PE_COLUMN_ErrorMsg_Name="Error Msg";

@XendraColumn(AD_Element_ID="7ed8e902-7223-0140-a5e2-159d12a79a58",ColumnName="ErrorMsg",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e909e534-00cc-41da-bced-a586c8f615b9",
Synchronized="2015-08-11 20:33:34.0")
/** Column name ErrorMsg */
public static final String COLUMNNAME_ErrorMsg = "ErrorMsg";
/** Set Guarantee Date.
@param GuaranteeDate Date when guarantee expires */
public void setGuaranteeDate (Timestamp GuaranteeDate)
{
set_Value (COLUMNNAME_GuaranteeDate, GuaranteeDate);
}
/** Get Guarantee Date.
@return Date when guarantee expires */
public Timestamp getGuaranteeDate() 
{
return (Timestamp)get_Value(COLUMNNAME_GuaranteeDate);
}

@XendraTrl(Identifier="8451b084-dc1d-4617-b8b6-ecc9974ec0de")
public static String es_PE_FIELD_LineasDeLaTomaDeInventario_GuaranteeDate_Description="Fecha cuando la garantía expira";

@XendraTrl(Identifier="8451b084-dc1d-4617-b8b6-ecc9974ec0de")
public static String es_PE_FIELD_LineasDeLaTomaDeInventario_GuaranteeDate_Help="Fecha cuando la garantía ó disponibilidad normal expira";

@XendraTrl(Identifier="8451b084-dc1d-4617-b8b6-ecc9974ec0de")
public static String es_PE_FIELD_LineasDeLaTomaDeInventario_GuaranteeDate_Name="Fecha de Garantía";

@XendraField(AD_Column_ID="GuaranteeDate",IsCentrallyMaintained=true,
AD_Tab_ID="cfdf8349-9b1c-49ba-ab9d-ffe4e771a79e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=29,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2017-05-04 22:52:21.0",
Identifier="8451b084-dc1d-4617-b8b6-ecc9974ec0de")
public static final String FIELDNAME_LineasDeLaTomaDeInventario_GuaranteeDate="8451b084-dc1d-4617-b8b6-ecc9974ec0de";

@XendraTrl(Identifier="7d767aa8-9890-4f55-89b9-ba14b4a17743")
public static String es_PE_COLUMN_GuaranteeDate_Name="Guarantee Date";

@XendraColumn(AD_Element_ID="2956aa9d-0dfd-6e86-af9b-584f4c7eca21",ColumnName="GuaranteeDate",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7d767aa8-9890-4f55-89b9-ba14b4a17743",
Synchronized="2013-12-27 10:51:40.0")
/** Column name GuaranteeDate */
public static final String COLUMNNAME_GuaranteeDate = "GuaranteeDate";
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
@XendraTrl(Identifier="c50b17b8-fded-4ba8-87a1-853479503c6d")
public static String es_PE_FIELD_LineasDeLaTomaDeInventario_Identifier_Name="Identifier";

@XendraField(AD_Column_ID="Identifier",IsCentrallyMaintained=true,
AD_Tab_ID="cfdf8349-9b1c-49ba-ab9d-ffe4e771a79e",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=36,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2017-05-04 22:52:21.0",
Identifier="c50b17b8-fded-4ba8-87a1-853479503c6d")
public static final String FIELDNAME_LineasDeLaTomaDeInventario_Identifier="c50b17b8-fded-4ba8-87a1-853479503c6d";

@XendraTrl(Identifier="6bf2db1c-3775-469b-85ba-786b21d9b60c")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6bf2db1c-3775-469b-85ba-786b21d9b60c",
Synchronized="2017-08-05 16:55:34.0")
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

@XendraTrl(Identifier="528f207f-646e-4fc0-910f-66ab9b6bd7b2")
public static String es_PE_FIELD_LineasDeLaTomaDeInventario_LineNo_Description="No. Línea único para este documento";

@XendraTrl(Identifier="528f207f-646e-4fc0-910f-66ab9b6bd7b2")
public static String es_PE_FIELD_LineasDeLaTomaDeInventario_LineNo_Help="Indica el No. Línea para un documento. También controlará el orden de despliegue de las líneas dentro de un documento";

@XendraTrl(Identifier="528f207f-646e-4fc0-910f-66ab9b6bd7b2")
public static String es_PE_FIELD_LineasDeLaTomaDeInventario_LineNo_Name="No. Línea";

@XendraField(AD_Column_ID="Line",IsCentrallyMaintained=true,
AD_Tab_ID="cfdf8349-9b1c-49ba-ab9d-ffe4e771a79e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2017-05-04 22:52:21.0",
Identifier="528f207f-646e-4fc0-910f-66ab9b6bd7b2")
public static final String FIELDNAME_LineasDeLaTomaDeInventario_LineNo="528f207f-646e-4fc0-910f-66ab9b6bd7b2";

@XendraTrl(Identifier="07c80e04-2c3b-d7b3-2970-ba4c81d0fcc3")
public static String es_PE_COLUMN_Line_Name="Line No";

@XendraColumn(AD_Element_ID="986ef077-61da-f9cf-1c6d-aefe3a35113b",ColumnName="Line",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="07c80e04-2c3b-d7b3-2970-ba4c81d0fcc3",
Synchronized="2017-08-05 16:55:34.0")
/** Column name Line */
public static final String COLUMNNAME_Line = "Line";
/** Set Lot No.
@param Lot Lot number (alphanumeric) */
public void setLot (String Lot)
{
if (Lot != null && Lot.length() > 40)
{
log.warning("Length > 40 - truncated");
Lot = Lot.substring(0,39);
}
set_Value (COLUMNNAME_Lot, Lot);
}
/** Get Lot No.
@return Lot number (alphanumeric) */
public String getLot() 
{
String value = (String)get_Value(COLUMNNAME_Lot);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="6bf05d2d-0d26-4cbc-ae3c-02b39e8e3a92")
public static String es_PE_FIELD_LineasDeLaTomaDeInventario_LotNo_Description="Número de Lote";

@XendraTrl(Identifier="6bf05d2d-0d26-4cbc-ae3c-02b39e8e3a92")
public static String es_PE_FIELD_LineasDeLaTomaDeInventario_LotNo_Help="Indica el número de lote específico del que un producto fue parte.";

@XendraTrl(Identifier="6bf05d2d-0d26-4cbc-ae3c-02b39e8e3a92")
public static String es_PE_FIELD_LineasDeLaTomaDeInventario_LotNo_Name="No. Lote";

@XendraField(AD_Column_ID="Lot",IsCentrallyMaintained=true,
AD_Tab_ID="cfdf8349-9b1c-49ba-ab9d-ffe4e771a79e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=40,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2017-05-04 22:52:21.0",
Identifier="6bf05d2d-0d26-4cbc-ae3c-02b39e8e3a92")
public static final String FIELDNAME_LineasDeLaTomaDeInventario_LotNo="6bf05d2d-0d26-4cbc-ae3c-02b39e8e3a92";

@XendraTrl(Identifier="a91af42b-f7cc-4e9b-b33a-2795cee788b4")
public static String es_PE_COLUMN_Lot_Name="Lot No";

@XendraColumn(AD_Element_ID="e8a3022e-4a91-6f2a-e27c-3739825075c7",ColumnName="Lot",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a91af42b-f7cc-4e9b-b33a-2795cee788b4",
Synchronized="2013-12-27 10:51:40.0")
/** Column name Lot */
public static final String COLUMNNAME_Lot = "Lot";
/** Set Attribute Set Instance.
@param M_AttributeSetInstance_ID Product Attribute Set Instance */
public void setM_AttributeSetInstance_ID (int M_AttributeSetInstance_ID)
{
if (M_AttributeSetInstance_ID <= 0) set_Value (COLUMNNAME_M_AttributeSetInstance_ID, null);
 else 
set_Value (COLUMNNAME_M_AttributeSetInstance_ID, Integer.valueOf(M_AttributeSetInstance_ID));
}
/** Get Attribute Set Instance.
@return Product Attribute Set Instance */
public int getM_AttributeSetInstance_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_AttributeSetInstance_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="9615b7ad-0f42-43e4-9131-448ba693322e")
public static String es_PE_FIELD_LineasDeLaTomaDeInventario_AttributeSetInstance_Description="Instancia del conjunto de atributos del producto";

@XendraTrl(Identifier="9615b7ad-0f42-43e4-9131-448ba693322e")
public static String es_PE_FIELD_LineasDeLaTomaDeInventario_AttributeSetInstance_Help="Valor actual de Instancia del conjunto de atributos del producto";

@XendraTrl(Identifier="9615b7ad-0f42-43e4-9131-448ba693322e")
public static String es_PE_FIELD_LineasDeLaTomaDeInventario_AttributeSetInstance_Name="Instancia del Conjunto de Atributos";

@XendraField(AD_Column_ID="M_AttributeSetInstance_ID",IsCentrallyMaintained=true,
AD_Tab_ID="cfdf8349-9b1c-49ba-ab9d-ffe4e771a79e",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2017-05-04 22:52:21.0",
Identifier="9615b7ad-0f42-43e4-9131-448ba693322e")
public static final String FIELDNAME_LineasDeLaTomaDeInventario_AttributeSetInstance="9615b7ad-0f42-43e4-9131-448ba693322e";

@XendraTrl(Identifier="b0bfab05-a4bb-6806-eb1b-d1d0dba77804")
public static String es_PE_COLUMN_M_AttributeSetInstance_ID_Name="Attribute Set Instance";

@XendraColumn(AD_Element_ID="137807f2-3c52-e193-3ceb-f10b819cf955",
ColumnName="M_AttributeSetInstance_ID",AD_Reference_ID=35,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="b0bfab05-a4bb-6806-eb1b-d1d0dba77804",Synchronized="2017-08-05 16:55:34.0")
/** Column name M_AttributeSetInstance_ID */
public static final String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";
/** Set Phys.Inventory Line.
@param M_InventoryLine_ID Unique line in an Inventory document */
public void setM_InventoryLine_ID (int M_InventoryLine_ID)
{
if (M_InventoryLine_ID <= 0) set_Value (COLUMNNAME_M_InventoryLine_ID, null);
 else 
set_Value (COLUMNNAME_M_InventoryLine_ID, Integer.valueOf(M_InventoryLine_ID));
}
/** Get Phys.Inventory Line.
@return Unique line in an Inventory document */
public int getM_InventoryLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_InventoryLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="96aaddce-4a29-4028-87d9-56846bb705cd")
public static String es_PE_FIELD_LineasDeLaTomaDeInventario_PhysInventoryLine_Description="Línea única en un documento de inventario.";

@XendraTrl(Identifier="96aaddce-4a29-4028-87d9-56846bb705cd")
public static String es_PE_FIELD_LineasDeLaTomaDeInventario_PhysInventoryLine_Help="La línea del inventario físico indica la línea del documento del inventario físico (si es aplicable) para esta transacción.";

@XendraTrl(Identifier="96aaddce-4a29-4028-87d9-56846bb705cd")
public static String es_PE_FIELD_LineasDeLaTomaDeInventario_PhysInventoryLine_Name="Línea de Inventario Físico";

@XendraField(AD_Column_ID="M_InventoryLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="cfdf8349-9b1c-49ba-ab9d-ffe4e771a79e",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2017-05-04 22:52:21.0",
Identifier="96aaddce-4a29-4028-87d9-56846bb705cd")
public static final String FIELDNAME_LineasDeLaTomaDeInventario_PhysInventoryLine="96aaddce-4a29-4028-87d9-56846bb705cd";

@XendraTrl(Identifier="4fa68351-ac7b-4164-b5e3-d938553ddc69")
public static String es_PE_COLUMN_M_InventoryLine_ID_Name="Phys.Inventory Line";

@XendraColumn(AD_Element_ID="2c5571d8-3b1f-8721-db52-cae644155140",ColumnName="M_InventoryLine_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4fa68351-ac7b-4164-b5e3-d938553ddc69",
Synchronized="2017-08-05 16:55:35.0")
/** Column name M_InventoryLine_ID */
public static final String COLUMNNAME_M_InventoryLine_ID = "M_InventoryLine_ID";
/** Set Locator.
@param M_Locator_ID Warehouse Locator */
public void setM_Locator_ID (int M_Locator_ID)
{
if (M_Locator_ID < 1) throw new IllegalArgumentException ("M_Locator_ID is mandatory.");
set_Value (COLUMNNAME_M_Locator_ID, Integer.valueOf(M_Locator_ID));
}
/** Get Locator.
@return Warehouse Locator */
public int getM_Locator_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Locator_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="cd241d7a-8512-43a6-87d3-ff02d251569e")
public static String es_PE_FIELD_LineasDeLaTomaDeInventario_Locator_Description="Ubicación de Almacén";

@XendraTrl(Identifier="cd241d7a-8512-43a6-87d3-ff02d251569e")
public static String es_PE_FIELD_LineasDeLaTomaDeInventario_Locator_Help="El ID de la ubicación indica en que parte del almacén se localiza el producto";

@XendraTrl(Identifier="cd241d7a-8512-43a6-87d3-ff02d251569e")
public static String es_PE_FIELD_LineasDeLaTomaDeInventario_Locator_Name="Ubicación";

@XendraField(AD_Column_ID="M_Locator_ID",IsCentrallyMaintained=true,
AD_Tab_ID="cfdf8349-9b1c-49ba-ab9d-ffe4e771a79e",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2017-05-04 22:52:21.0",
Identifier="cd241d7a-8512-43a6-87d3-ff02d251569e")
public static final String FIELDNAME_LineasDeLaTomaDeInventario_Locator="cd241d7a-8512-43a6-87d3-ff02d251569e";

@XendraTrl(Identifier="b40968a7-da66-f76b-dbc2-1ceba72d6c1d")
public static String es_PE_COLUMN_M_Locator_ID_Name="Locator";

@XendraColumn(AD_Element_ID="67f044ce-2864-93f9-fd0d-320945150933",ColumnName="M_Locator_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b40968a7-da66-f76b-dbc2-1ceba72d6c1d",
Synchronized="2017-08-05 16:55:35.0")
/** Column name M_Locator_ID */
public static final String COLUMNNAME_M_Locator_ID = "M_Locator_ID";
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

@XendraTrl(Identifier="8a7f2e2b-b708-4cbb-9415-d4fcf17f33c8")
public static String es_PE_FIELD_LineasDeLaTomaDeInventario_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="8a7f2e2b-b708-4cbb-9415-d4fcf17f33c8")
public static String es_PE_FIELD_LineasDeLaTomaDeInventario_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraTrl(Identifier="8a7f2e2b-b708-4cbb-9415-d4fcf17f33c8")
public static String es_PE_FIELD_LineasDeLaTomaDeInventario_Product_Name="Producto";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="cfdf8349-9b1c-49ba-ab9d-ffe4e771a79e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=20,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2017-05-04 22:52:21.0",
Identifier="8a7f2e2b-b708-4cbb-9415-d4fcf17f33c8")
public static final String FIELDNAME_LineasDeLaTomaDeInventario_Product="8a7f2e2b-b708-4cbb-9415-d4fcf17f33c8";

@XendraTrl(Identifier="d03d8a3e-ea6e-98e2-7fba-bdd3e5151460")
public static String es_PE_COLUMN_M_Product_ID_Name="Product";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d03d8a3e-ea6e-98e2-7fba-bdd3e5151460",
Synchronized="2017-08-05 16:55:35.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
/** Set Stock Taking.
@param M_StockTaking_ID Stock Taking */
public void setM_StockTaking_ID (int M_StockTaking_ID)
{
if (M_StockTaking_ID < 1) throw new IllegalArgumentException ("M_StockTaking_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_StockTaking_ID, Integer.valueOf(M_StockTaking_ID));
}
/** Get Stock Taking.
@return Stock Taking */
public int getM_StockTaking_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_StockTaking_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="8b84567c-6252-4f07-bd27-9119499d2ea0")
public static String es_PE_FIELD_LineasDeLaTomaDeInventario_StockTaking_Name="Stock Taking";

@XendraField(AD_Column_ID="M_StockTaking_ID",IsCentrallyMaintained=true,
AD_Tab_ID="cfdf8349-9b1c-49ba-ab9d-ffe4e771a79e",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2017-05-04 22:52:21.0",
Identifier="8b84567c-6252-4f07-bd27-9119499d2ea0")
public static final String FIELDNAME_LineasDeLaTomaDeInventario_StockTaking="8b84567c-6252-4f07-bd27-9119499d2ea0";

@XendraTrl(Identifier="c9be7bd6-3b34-69a5-3c09-8d510348c1d1")
public static String es_PE_COLUMN_M_StockTaking_ID_Name="Stock Taking";

@XendraColumn(AD_Element_ID="cee7562c-4b2a-4cf5-0718-42660f910f48",ColumnName="M_StockTaking_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c9be7bd6-3b34-69a5-3c09-8d510348c1d1",
Synchronized="2017-08-05 16:55:35.0")
/** Column name M_StockTaking_ID */
public static final String COLUMNNAME_M_StockTaking_ID = "M_StockTaking_ID";
/** Set Stock Taking Line.
@param M_StockTakingLine_ID Stock Taking Line */
public void setM_StockTakingLine_ID (int M_StockTakingLine_ID)
{
if (M_StockTakingLine_ID < 1) throw new IllegalArgumentException ("M_StockTakingLine_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_StockTakingLine_ID, Integer.valueOf(M_StockTakingLine_ID));
}
/** Get Stock Taking Line.
@return Stock Taking Line */
public int getM_StockTakingLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_StockTakingLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="2c47dfcb-76d0-4e02-8117-fdbfbc65494b")
public static String es_PE_FIELD_LineasDeLaTomaDeInventario_StockTakingLine_Name="Stock Taking Line";

@XendraField(AD_Column_ID="M_StockTakingLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="cfdf8349-9b1c-49ba-ab9d-ffe4e771a79e",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2017-05-04 22:52:21.0",
Identifier="2c47dfcb-76d0-4e02-8117-fdbfbc65494b")
public static final String FIELDNAME_LineasDeLaTomaDeInventario_StockTakingLine="2c47dfcb-76d0-4e02-8117-fdbfbc65494b";
/** Column name M_StockTakingLine_ID */
public static final String COLUMNNAME_M_StockTakingLine_ID = "M_StockTakingLine_ID";
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

@XendraTrl(Identifier="58714c7f-391e-46b8-bceb-dca8d56ba2ba")
public static String es_PE_FIELD_LineasDeLaTomaDeInventario_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="58714c7f-391e-46b8-bceb-dca8d56ba2ba")
public static String es_PE_FIELD_LineasDeLaTomaDeInventario_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraTrl(Identifier="58714c7f-391e-46b8-bceb-dca8d56ba2ba")
public static String es_PE_FIELD_LineasDeLaTomaDeInventario_Processed_Name="Procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="cfdf8349-9b1c-49ba-ab9d-ffe4e771a79e",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2017-05-04 22:52:21.0",
Identifier="58714c7f-391e-46b8-bceb-dca8d56ba2ba")
public static final String FIELDNAME_LineasDeLaTomaDeInventario_Processed="58714c7f-391e-46b8-bceb-dca8d56ba2ba";

@XendraTrl(Identifier="323a2937-11ba-6ea3-cb80-0c4b27c2a480")
public static String es_PE_COLUMN_Processed_Name="Processed";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="323a2937-11ba-6ea3-cb80-0c4b27c2a480",
Synchronized="2017-08-05 16:55:35.0")
/** Column name Processed */
public static final String COLUMNNAME_Processed = "Processed";
/** Set Quantity count.
@param QtyCount Counted Quantity */
public void setQtyCount (BigDecimal QtyCount)
{
if (QtyCount == null) throw new IllegalArgumentException ("QtyCount is mandatory.");
set_Value (COLUMNNAME_QtyCount, QtyCount);
}
/** Get Quantity count.
@return Counted Quantity */
public BigDecimal getQtyCount() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_QtyCount);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="88f24960-45b9-42b9-9cfe-98ce35ab1125")
public static String es_PE_FIELD_LineasDeLaTomaDeInventario_QuantityCount_Description="Cantidad Contada";

@XendraTrl(Identifier="88f24960-45b9-42b9-9cfe-98ce35ab1125")
public static String es_PE_FIELD_LineasDeLaTomaDeInventario_QuantityCount_Help="La Cantidad Contada indica la cuenta de inventario actual tomada para un producto en inventario";

@XendraTrl(Identifier="88f24960-45b9-42b9-9cfe-98ce35ab1125")
public static String es_PE_FIELD_LineasDeLaTomaDeInventario_QuantityCount_Name="Cantidad Contada";

@XendraField(AD_Column_ID="QtyCount",IsCentrallyMaintained=true,
AD_Tab_ID="cfdf8349-9b1c-49ba-ab9d-ffe4e771a79e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=131089,IsReadOnly=false,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2017-05-04 22:52:22.0",
Identifier="88f24960-45b9-42b9-9cfe-98ce35ab1125")
public static final String FIELDNAME_LineasDeLaTomaDeInventario_QuantityCount="88f24960-45b9-42b9-9cfe-98ce35ab1125";

@XendraTrl(Identifier="c87473b6-8f09-c5b9-92c0-c2e1de143786")
public static String es_PE_COLUMN_QtyCount_Name="Quantity count";

@XendraColumn(AD_Element_ID="0bc23bd1-673a-949b-480d-869c08afa39d",ColumnName="QtyCount",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c87473b6-8f09-c5b9-92c0-c2e1de143786",
Synchronized="2017-08-05 16:55:35.0")
/** Column name QtyCount */
public static final String COLUMNNAME_QtyCount = "QtyCount";
}
