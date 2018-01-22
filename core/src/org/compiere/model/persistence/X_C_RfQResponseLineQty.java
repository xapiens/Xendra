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
/** Generated Model for C_RfQResponseLineQty
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_RfQResponseLineQty extends PO
{
/** Standard Constructor
@param ctx context
@param C_RfQResponseLineQty_ID id
@param trxName transaction
*/
public X_C_RfQResponseLineQty (Properties ctx, int C_RfQResponseLineQty_ID, String trxName)
{
super (ctx, C_RfQResponseLineQty_ID, trxName);
/** if (C_RfQResponseLineQty_ID == 0)
{
setC_RfQLineQty_ID (0);
setC_RfQResponseLine_ID (0);
setC_RfQResponseLineQty_ID (0);
setPrice (Env.ZERO);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_RfQResponseLineQty (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=672 */
public static int Table_ID=MTable.getTable_ID("C_RfQResponseLineQty");

@XendraTrl(Identifier="d483a0da-c957-eed3-870b-405e58dfbf90")
public static String es_PE_TAB_ResponseQuantity_Description="Línea de la Cantidad de Respuestas RfQ ";

@XendraTrl(Identifier="d483a0da-c957-eed3-870b-405e58dfbf90")
public static String es_PE_TAB_ResponseQuantity_Name="Cantidad Respuesta";

@XendraTrl(Identifier="d483a0da-c957-eed3-870b-405e58dfbf90")
public static String es_PE_TAB_ResponseQuantity_Help="Pedido de Cantidad de la Línea de Respuesta de la cita de un proveedor potencial";

@XendraTab(Name="Response Quantity",Description="RfQ Line Quantity Response",
Help="Request for Quotation Response Line Quantity from a potential Vendor",
AD_Window_ID="00321465-3813-5160-b116-f76e77af89f6",SeqNo=30,TabLevel=3,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="d483a0da-c957-eed3-870b-405e58dfbf90",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_ResponseQuantity="d483a0da-c957-eed3-870b-405e58dfbf90";

@XendraTrl(Identifier="489491e4-db4d-8162-c6a8-ac49091aec8b")
public static String es_PE_TABLE_C_RfQResponseLineQty_Name="Cantidad Línea Respuesta SPC (RfQ)";


@XendraTable(Name="RfQ Response Line Qty",
Description="Request for Quotation Response Line Quantity",Help="",
TableName="C_RfQResponseLineQty",AccessLevel="1",
AD_Window_ID="00321465-3813-5160-b116-f76e77af89f6",AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.commercial",Identifier="489491e4-db4d-8162-c6a8-ac49091aec8b",
Synchronized="2017-08-16 11:42:26.0")
/** TableName=C_RfQResponseLineQty */
public static final String Table_Name="C_RfQResponseLineQty";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_RfQResponseLineQty");

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
    Table_ID = MTable.getTable_ID("C_RfQResponseLineQty");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_RfQResponseLineQty[").append(get_ID()).append("]");
return sb.toString();
}
/** Set RfQ Line Quantity.
@param C_RfQLineQty_ID Request for Quotation Line Quantity */
public void setC_RfQLineQty_ID (int C_RfQLineQty_ID)
{
if (C_RfQLineQty_ID < 1) throw new IllegalArgumentException ("C_RfQLineQty_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_RfQLineQty_ID, Integer.valueOf(C_RfQLineQty_ID));
}
/** Get RfQ Line Quantity.
@return Request for Quotation Line Quantity */
public int getC_RfQLineQty_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_RfQLineQty_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="c92ad721-136a-a4ad-5436-b71433ddc26b")
public static String es_PE_FIELD_ResponseQuantity_RfQLineQuantity_Description="Solicitud para la cita de la cantida de la linea";

@XendraTrl(Identifier="c92ad721-136a-a4ad-5436-b71433ddc26b")
public static String es_PE_FIELD_ResponseQuantity_RfQLineQuantity_Help="Usted puede solicitar una cita para diversas cantidades";

@XendraTrl(Identifier="c92ad721-136a-a4ad-5436-b71433ddc26b")
public static String es_PE_FIELD_ResponseQuantity_RfQLineQuantity_Name="Cantidad Línea";

@XendraField(AD_Column_ID="C_RfQLineQty_ID",IsCentrallyMaintained=true,
AD_Tab_ID="d483a0da-c957-eed3-870b-405e58dfbf90",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c92ad721-136a-a4ad-5436-b71433ddc26b")
public static final String FIELDNAME_ResponseQuantity_RfQLineQuantity="c92ad721-136a-a4ad-5436-b71433ddc26b";

@XendraTrl(Identifier="9369ca0b-544e-c177-905e-15971afc58b8")
public static String es_PE_COLUMN_C_RfQLineQty_ID_Name="Cantidad Línea SPC (RfQ)";

@XendraColumn(AD_Element_ID="0b965a1c-169a-5f4d-8d6b-307365dac356",ColumnName="C_RfQLineQty_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=2,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9369ca0b-544e-c177-905e-15971afc58b8",
Synchronized="2017-08-05 16:54:23.0")
/** Column name C_RfQLineQty_ID */
public static final String COLUMNNAME_C_RfQLineQty_ID = "C_RfQLineQty_ID";
/** Set RfQ Response Line.
@param C_RfQResponseLine_ID Request for Quotation Response Line */
public void setC_RfQResponseLine_ID (int C_RfQResponseLine_ID)
{
if (C_RfQResponseLine_ID < 1) throw new IllegalArgumentException ("C_RfQResponseLine_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_RfQResponseLine_ID, Integer.valueOf(C_RfQResponseLine_ID));
}
/** Get RfQ Response Line.
@return Request for Quotation Response Line */
public int getC_RfQResponseLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_RfQResponseLine_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getC_RfQResponseLine_ID()));
}

@XendraTrl(Identifier="75e570c0-5e75-d254-21ac-ef2f67a8b369")
public static String es_PE_FIELD_ResponseQuantity_RfQResponseLine_Description="Solicitud para el Item de respuesta.";

@XendraTrl(Identifier="75e570c0-5e75-d254-21ac-ef2f67a8b369")
public static String es_PE_FIELD_ResponseQuantity_RfQResponseLine_Help="Solicitud para línea de respuesta de la cita de un vendedor potencial.";

@XendraTrl(Identifier="75e570c0-5e75-d254-21ac-ef2f67a8b369")
public static String es_PE_FIELD_ResponseQuantity_RfQResponseLine_Name="Item Respuesta";

@XendraField(AD_Column_ID="C_RfQResponseLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="d483a0da-c957-eed3-870b-405e58dfbf90",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="75e570c0-5e75-d254-21ac-ef2f67a8b369")
public static final String FIELDNAME_ResponseQuantity_RfQResponseLine="75e570c0-5e75-d254-21ac-ef2f67a8b369";

@XendraTrl(Identifier="09950ddd-f023-c418-49d9-250a8abc0c88")
public static String es_PE_COLUMN_C_RfQResponseLine_ID_Name="Línea Respuesta SPC (RfQ)";

@XendraColumn(AD_Element_ID="e9dada94-ac8d-3082-c345-8d3967bffa06",
ColumnName="C_RfQResponseLine_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="09950ddd-f023-c418-49d9-250a8abc0c88",Synchronized="2017-08-05 16:54:23.0")
/** Column name C_RfQResponseLine_ID */
public static final String COLUMNNAME_C_RfQResponseLine_ID = "C_RfQResponseLine_ID";
/** Set RfQ Response Line Qty.
@param C_RfQResponseLineQty_ID Request for Quotation Response Line Quantity */
public void setC_RfQResponseLineQty_ID (int C_RfQResponseLineQty_ID)
{
if (C_RfQResponseLineQty_ID < 1) throw new IllegalArgumentException ("C_RfQResponseLineQty_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_RfQResponseLineQty_ID, Integer.valueOf(C_RfQResponseLineQty_ID));
}
/** Get RfQ Response Line Qty.
@return Request for Quotation Response Line Quantity */
public int getC_RfQResponseLineQty_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_RfQResponseLineQty_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="10fbac0c-186b-88ed-3411-ddfd61b8643e")
public static String es_PE_FIELD_ResponseQuantity_RfQResponseLineQty_Description="Petición de la cita para la cantidad de la línea de la respuesta";

@XendraTrl(Identifier="10fbac0c-186b-88ed-3411-ddfd61b8643e")
public static String es_PE_FIELD_ResponseQuantity_RfQResponseLineQty_Help="Petición de la cita para la cantidad de la línea de la respuesta de un vendedor potencial";

@XendraTrl(Identifier="10fbac0c-186b-88ed-3411-ddfd61b8643e")
public static String es_PE_FIELD_ResponseQuantity_RfQResponseLineQty_Name="Cantidad Línea Respuesta SPC (RfQ)";

@XendraField(AD_Column_ID="C_RfQResponseLineQty_ID",IsCentrallyMaintained=true,
AD_Tab_ID="d483a0da-c957-eed3-870b-405e58dfbf90",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="10fbac0c-186b-88ed-3411-ddfd61b8643e")
public static final String FIELDNAME_ResponseQuantity_RfQResponseLineQty="10fbac0c-186b-88ed-3411-ddfd61b8643e";
/** Column name C_RfQResponseLineQty_ID */
public static final String COLUMNNAME_C_RfQResponseLineQty_ID = "C_RfQResponseLineQty_ID";
/** Set Discount %.
@param Discount Discount in percent */
public void setDiscount (BigDecimal Discount)
{
set_Value (COLUMNNAME_Discount, Discount);
}
/** Get Discount %.
@return Discount in percent */
public BigDecimal getDiscount() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Discount);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="39b9b53f-8f91-9db0-e189-e3750b198daa")
public static String es_PE_FIELD_ResponseQuantity_Discount_Description="Descuento en porcentaje";

@XendraTrl(Identifier="39b9b53f-8f91-9db0-e189-e3750b198daa")
public static String es_PE_FIELD_ResponseQuantity_Discount_Help="El Descuento indica el descuento aplicado o tomado como un porcentaje.";

@XendraTrl(Identifier="39b9b53f-8f91-9db0-e189-e3750b198daa")
public static String es_PE_FIELD_ResponseQuantity_Discount_Name="% Descuento";

@XendraField(AD_Column_ID="Discount",IsCentrallyMaintained=true,
AD_Tab_ID="d483a0da-c957-eed3-870b-405e58dfbf90",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="39b9b53f-8f91-9db0-e189-e3750b198daa")
public static final String FIELDNAME_ResponseQuantity_Discount="39b9b53f-8f91-9db0-e189-e3750b198daa";

@XendraTrl(Identifier="ad1e2930-bdea-4ef5-c206-350f5fa91352")
public static String es_PE_COLUMN_Discount_Name="% Descuento";

@XendraColumn(AD_Element_ID="3d8e2bac-29ff-f758-dd80-f9b4107077e6",ColumnName="Discount",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ad1e2930-bdea-4ef5-c206-350f5fa91352",
Synchronized="2017-08-05 16:54:23.0")
/** Column name Discount */
public static final String COLUMNNAME_Discount = "Discount";
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
@XendraTrl(Identifier="4477224a-7864-43f5-b33c-02dcd4b34c0d")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4477224a-7864-43f5-b33c-02dcd4b34c0d",
Synchronized="2017-08-05 16:54:23.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Price.
@param Price Price */
public void setPrice (BigDecimal Price)
{
if (Price == null) throw new IllegalArgumentException ("Price is mandatory.");
set_Value (COLUMNNAME_Price, Price);
}
/** Get Price.
@return Price */
public BigDecimal getPrice() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Price);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="98b1eaa9-0ab2-6b09-103a-1b3839366706")
public static String es_PE_FIELD_ResponseQuantity_Price_Description="Precio";

@XendraTrl(Identifier="98b1eaa9-0ab2-6b09-103a-1b3839366706")
public static String es_PE_FIELD_ResponseQuantity_Price_Help="El Precio indica el precio de un producto ó servicio";

@XendraTrl(Identifier="98b1eaa9-0ab2-6b09-103a-1b3839366706")
public static String es_PE_FIELD_ResponseQuantity_Price_Name="Precio";

@XendraField(AD_Column_ID="Price",IsCentrallyMaintained=true,
AD_Tab_ID="d483a0da-c957-eed3-870b-405e58dfbf90",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=70,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="98b1eaa9-0ab2-6b09-103a-1b3839366706")
public static final String FIELDNAME_ResponseQuantity_Price="98b1eaa9-0ab2-6b09-103a-1b3839366706";

@XendraTrl(Identifier="d51f8096-c83c-5f79-785a-5a731988b228")
public static String es_PE_COLUMN_Price_Name="Precio";

@XendraColumn(AD_Element_ID="aafaa7a6-6897-fb14-1b29-1dc3b61047b9",ColumnName="Price",
AD_Reference_ID=37,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d51f8096-c83c-5f79-785a-5a731988b228",
Synchronized="2017-08-05 16:54:23.0")
/** Column name Price */
public static final String COLUMNNAME_Price = "Price";
/** Set Ranking.
@param Ranking Relative Rank Number */
public void setRanking (int Ranking)
{
set_Value (COLUMNNAME_Ranking, Integer.valueOf(Ranking));
}
/** Get Ranking.
@return Relative Rank Number */
public int getRanking() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Ranking);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d58ab3c8-48d8-0b0f-76ac-e8e6e4dac417")
public static String es_PE_FIELD_ResponseQuantity_Ranking_Description="Numero relativo de fila";

@XendraTrl(Identifier="d58ab3c8-48d8-0b0f-76ac-e8e6e4dac417")
public static String es_PE_FIELD_ResponseQuantity_Ranking_Help="Uno es la fila más alta";

@XendraTrl(Identifier="d58ab3c8-48d8-0b0f-76ac-e8e6e4dac417")
public static String es_PE_FIELD_ResponseQuantity_Ranking_Name="Evaluación";

@XendraField(AD_Column_ID="Ranking",IsCentrallyMaintained=true,
AD_Tab_ID="d483a0da-c957-eed3-870b-405e58dfbf90",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d58ab3c8-48d8-0b0f-76ac-e8e6e4dac417")
public static final String FIELDNAME_ResponseQuantity_Ranking="d58ab3c8-48d8-0b0f-76ac-e8e6e4dac417";

@XendraTrl(Identifier="f26aa3be-6438-60b9-d894-e84ba2df259c")
public static String es_PE_COLUMN_Ranking_Name="Evaluación";

@XendraColumn(AD_Element_ID="1e16005e-4845-d720-5cdf-d2257a4078aa",ColumnName="Ranking",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f26aa3be-6438-60b9-d894-e84ba2df259c",
Synchronized="2017-08-05 16:54:23.0")
/** Column name Ranking */
public static final String COLUMNNAME_Ranking = "Ranking";
}
