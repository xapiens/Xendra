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
/** Generated Model for M_PackageLine
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_PackageLine extends PO
{
/** Standard Constructor
@param ctx context
@param M_PackageLine_ID id
@param trxName transaction
*/
public X_M_PackageLine (Properties ctx, int M_PackageLine_ID, String trxName)
{
super (ctx, M_PackageLine_ID, trxName);
/** if (M_PackageLine_ID == 0)
{
setM_InOutLine_ID (0);
setM_Package_ID (0);
setM_PackageLine_ID (0);
setQty (Env.ZERO);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_M_PackageLine (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=663 */
public static int Table_ID=MTable.getTable_ID("M_PackageLine");

@XendraTrl(Identifier="350cba90-8ad7-4e0d-638e-ddc3debcb91f")
public static String es_PE_TAB_PackageLine_Description="El detalle de contenido del paquete";

@XendraTrl(Identifier="350cba90-8ad7-4e0d-638e-ddc3debcb91f")
public static String es_PE_TAB_PackageLine_Help="Acoplamiento al Ìtem de envío.";

@XendraTrl(Identifier="350cba90-8ad7-4e0d-638e-ddc3debcb91f")
public static String es_PE_TAB_PackageLine_Name="Ìtem Paquete";
@XendraTab(Name="Package Line",
Description="The detail content of the Package",Help="Link to the shipment line",
AD_Window_ID="cc7c5ddb-8738-c1b5-7364-48859b13ec14",SeqNo=20,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="350cba90-8ad7-4e0d-638e-ddc3debcb91f",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_PackageLine="350cba90-8ad7-4e0d-638e-ddc3debcb91f";

@XendraTrl(Identifier="e8a6c046-680c-6622-6b3f-0c893b44f91e")
public static String es_PE_TABLE_M_PackageLine_Name="Línea de Paquete";

@XendraTable(Name="Package Line",AD_Package_ID="2809ac2d-7d43-20f8-05f0-a478f2e50204",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",
Description="The detail content of the Package",Help="",TableName="M_PackageLine",AccessLevel="1",
AD_Window_ID="cc7c5ddb-8738-c1b5-7364-48859b13ec14",AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.material",Identifier="e8a6c046-680c-6622-6b3f-0c893b44f91e",
Synchronized="2020-03-03 21:38:45.0")
/** TableName=M_PackageLine */
public static final String Table_Name="M_PackageLine";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_PackageLine");

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
    Table_ID = MTable.getTable_ID("M_PackageLine");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_PackageLine[").append(get_ID()).append("]");
return sb.toString();
}
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

@XendraTrl(Identifier="f68c0ff2-3f96-1a76-3a5d-612a88d11aad")
public static String es_PE_FIELD_PackageLine_Description_Name="Observación";

@XendraTrl(Identifier="f68c0ff2-3f96-1a76-3a5d-612a88d11aad")
public static String es_PE_FIELD_PackageLine_Description_Description="Observación";

@XendraTrl(Identifier="f68c0ff2-3f96-1a76-3a5d-612a88d11aad")
public static String es_PE_FIELD_PackageLine_Description_Help="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="350cba90-8ad7-4e0d-638e-ddc3debcb91f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f68c0ff2-3f96-1a76-3a5d-612a88d11aad")
public static final String FIELDNAME_PackageLine_Description="f68c0ff2-3f96-1a76-3a5d-612a88d11aad";

@XendraTrl(Identifier="c3fd6b94-1cf8-337d-7c1d-3ada20d6b556")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c3fd6b94-1cf8-337d-7c1d-3ada20d6b556",
Synchronized="2019-08-30 22:23:21.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
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
@XendraTrl(Identifier="a232be9c-f645-4874-b925-84023d22c7c4")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a232be9c-f645-4874-b925-84023d22c7c4",
Synchronized="2019-08-30 22:23:21.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Shipment/Receipt Line.
@param M_InOutLine_ID Line on Shipment or Receipt document */
public void setM_InOutLine_ID (int M_InOutLine_ID)
{
if (M_InOutLine_ID < 1) throw new IllegalArgumentException ("M_InOutLine_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_InOutLine_ID, Integer.valueOf(M_InOutLine_ID));
}
/** Get Shipment/Receipt Line.
@return Line on Shipment or Receipt document */
public int getM_InOutLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_InOutLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="fcaa7395-9a52-4a9a-0648-62313df5e299")
public static String es_PE_FIELD_PackageLine_ReceiptLine_Name="Item Entrega / Recibo";

@XendraTrl(Identifier="fcaa7395-9a52-4a9a-0648-62313df5e299")
public static String es_PE_FIELD_PackageLine_ReceiptLine_Description="Item de entrega ó documento de recibo.";

@XendraTrl(Identifier="fcaa7395-9a52-4a9a-0648-62313df5e299")
public static String es_PE_FIELD_PackageLine_ReceiptLine_Help="Indica un Item único en un documento de entrega / recibo";

@XendraField(AD_Column_ID="M_InOutLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="350cba90-8ad7-4e0d-638e-ddc3debcb91f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=60,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fcaa7395-9a52-4a9a-0648-62313df5e299")
public static final String FIELDNAME_PackageLine_ReceiptLine="fcaa7395-9a52-4a9a-0648-62313df5e299";

@XendraTrl(Identifier="bc8051bf-1c6a-1f66-fa8e-9bf5e097bd4c")
public static String es_PE_COLUMN_M_InOutLine_ID_Name="Línea Entrega / Recibo";

@XendraColumn(AD_Element_ID="a4d9928e-fbec-fd6c-b061-d3dbbd7de02c",ColumnName="M_InOutLine_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="adb6a9a7-f36f-cf40-6dfe-c2c0b1249f3b",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1.000000000000",IsSelectionColumn=false,
AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="bc8051bf-1c6a-1f66-fa8e-9bf5e097bd4c",Synchronized="2019-08-30 22:23:21.0")
/** Column name M_InOutLine_ID */
public static final String COLUMNNAME_M_InOutLine_ID = "M_InOutLine_ID";
/** Set Package.
@param M_Package_ID Shipment Package */
public void setM_Package_ID (int M_Package_ID)
{
if (M_Package_ID < 1) throw new IllegalArgumentException ("M_Package_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_Package_ID, Integer.valueOf(M_Package_ID));
}
/** Get Package.
@return Shipment Package */
public int getM_Package_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Package_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getM_Package_ID()));
}

@XendraTrl(Identifier="59a900b5-1b77-68d4-be52-3dc12c5334f6")
public static String es_PE_FIELD_PackageLine_Package_Name="Paquete";

@XendraTrl(Identifier="59a900b5-1b77-68d4-be52-3dc12c5334f6")
public static String es_PE_FIELD_PackageLine_Package_Description="Paquete de envio";

@XendraTrl(Identifier="59a900b5-1b77-68d4-be52-3dc12c5334f6")
public static String es_PE_FIELD_PackageLine_Package_Help="Un envio puede tener uno ó mas paquetes. Un paquete puede ser seguido individualmente.";

@XendraField(AD_Column_ID="M_Package_ID",IsCentrallyMaintained=true,
AD_Tab_ID="350cba90-8ad7-4e0d-638e-ddc3debcb91f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="59a900b5-1b77-68d4-be52-3dc12c5334f6")
public static final String FIELDNAME_PackageLine_Package="59a900b5-1b77-68d4-be52-3dc12c5334f6";

@XendraTrl(Identifier="3cd5e310-bfb9-f691-2aa5-88805a6e11a9")
public static String es_PE_COLUMN_M_Package_ID_Name="Paquete";

@XendraColumn(AD_Element_ID="0c8ac6a0-dba8-8907-fd69-e56d74962f3c",ColumnName="M_Package_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3cd5e310-bfb9-f691-2aa5-88805a6e11a9",
Synchronized="2019-08-30 22:23:21.0")
/** Column name M_Package_ID */
public static final String COLUMNNAME_M_Package_ID = "M_Package_ID";
/** Set Package Line.
@param M_PackageLine_ID The detail content of the Package */
public void setM_PackageLine_ID (int M_PackageLine_ID)
{
if (M_PackageLine_ID < 1) throw new IllegalArgumentException ("M_PackageLine_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_PackageLine_ID, Integer.valueOf(M_PackageLine_ID));
}
/** Get Package Line.
@return The detail content of the Package */
public int getM_PackageLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_PackageLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="2a4caeec-5078-91b5-a4d2-1db936e99587")
public static String es_PE_FIELD_PackageLine_PackageLine_Name="Item de Paquete";

@XendraTrl(Identifier="2a4caeec-5078-91b5-a4d2-1db936e99587")
public static String es_PE_FIELD_PackageLine_PackageLine_Description="El contenido del detalle del paquete";

@XendraTrl(Identifier="2a4caeec-5078-91b5-a4d2-1db936e99587")
public static String es_PE_FIELD_PackageLine_PackageLine_Help="Acoplamiento al Item del envio.";

@XendraField(AD_Column_ID="M_PackageLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="350cba90-8ad7-4e0d-638e-ddc3debcb91f",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2a4caeec-5078-91b5-a4d2-1db936e99587")
public static final String FIELDNAME_PackageLine_PackageLine="2a4caeec-5078-91b5-a4d2-1db936e99587";
/** Column name M_PackageLine_ID */
public static final String COLUMNNAME_M_PackageLine_ID = "M_PackageLine_ID";
/** Set Quantity.
@param Qty Quantity */
public void setQty (BigDecimal Qty)
{
if (Qty == null) throw new IllegalArgumentException ("Qty is mandatory.");
set_Value (COLUMNNAME_Qty, Qty);
}
/** Get Quantity.
@return Quantity */
public BigDecimal getQty() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Qty);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="fddce2e8-ae0e-925d-1575-fb45550effda")
public static String es_PE_FIELD_PackageLine_Quantity_Name="Cantidad";

@XendraTrl(Identifier="fddce2e8-ae0e-925d-1575-fb45550effda")
public static String es_PE_FIELD_PackageLine_Quantity_Description="Cantidad";

@XendraTrl(Identifier="fddce2e8-ae0e-925d-1575-fb45550effda")
public static String es_PE_FIELD_PackageLine_Quantity_Help="La Cantidad indica el número de un producto específico o artículo para este documento";

@XendraField(AD_Column_ID="Qty",IsCentrallyMaintained=true,
AD_Tab_ID="350cba90-8ad7-4e0d-638e-ddc3debcb91f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fddce2e8-ae0e-925d-1575-fb45550effda")
public static final String FIELDNAME_PackageLine_Quantity="fddce2e8-ae0e-925d-1575-fb45550effda";

@XendraTrl(Identifier="77dfa35a-b811-b668-b205-4ac4dad92f60")
public static String es_PE_COLUMN_Qty_Name="Cantidad";

@XendraColumn(AD_Element_ID="c9d74a25-87c5-9592-5660-4f397607dad3",ColumnName="Qty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="77dfa35a-b811-b668-b205-4ac4dad92f60",
Synchronized="2019-08-30 22:23:21.0")
/** Column name Qty */
public static final String COLUMNNAME_Qty = "Qty";
}
