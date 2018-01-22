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
/** Generated Model for M_ProductBonus
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_ProductBonus extends PO
{
/** Standard Constructor
@param ctx context
@param M_ProductBonus_ID id
@param trxName transaction
*/
public X_M_ProductBonus (Properties ctx, int M_ProductBonus_ID, String trxName)
{
super (ctx, M_ProductBonus_ID, trxName);
/** if (M_ProductBonus_ID == 0)
{
setC_UOM_ID (0);
setM_ProductBonus_ID (0);
setM_Product_ID (0);
setQtyEntered (Env.ZERO);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_M_ProductBonus (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000179 */
public static int Table_ID=MTable.getTable_ID("M_ProductBonus");

@XendraTrl(Identifier="b3c77c6e-a899-cb2e-feaa-0fc36ca7cbb1")
public static String es_PE_TAB_ProductBonus_Description="Marketing Campaign";

@XendraTrl(Identifier="b3c77c6e-a899-cb2e-feaa-0fc36ca7cbb1")
public static String es_PE_TAB_ProductBonus_Name="Producto Bonificado";

@XendraTrl(Identifier="b3c77c6e-a899-cb2e-feaa-0fc36ca7cbb1")
public static String es_PE_TAB_ProductBonus_Help="The Marketing Campaign Tab defines the parameters for a Campaign.  These include a start and end date as well as the amount of any invoices that have been processed which reference this campaign.";

@XendraTab(Name="Product Bonus",Description="Marketing Campaign",
Help="The Marketing Campaign Tab defines the parameters for a Campaign.  These include a start and end date as well as the amount of any invoices that have been processed which reference this campaign.",
AD_Window_ID="5fbd0093-6a0b-0961-2180-55573e4d502a",SeqNo=30,TabLevel=2,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="b3c77c6e-a899-cb2e-feaa-0fc36ca7cbb1",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_ProductBonus="b3c77c6e-a899-cb2e-feaa-0fc36ca7cbb1";

@XendraTrl(Identifier="e19ace09-7e58-69aa-0266-9b1cd7aedb9d")
public static String es_PE_TABLE_M_ProductBonus_Name="Producto Bonificado";

@XendraTable(Name="ProductBonus",Description="ProductBonus",Help="",TableName="M_ProductBonus",
AccessLevel="3",AD_Window_ID="5fbd0093-6a0b-0961-2180-55573e4d502a",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=95,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.material",
Identifier="e19ace09-7e58-69aa-0266-9b1cd7aedb9d",Synchronized="2017-08-16 11:43:27.0")
/** TableName=M_ProductBonus */
public static final String Table_Name="M_ProductBonus";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_ProductBonus");

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
    Table_ID = MTable.getTable_ID("M_ProductBonus");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_ProductBonus[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Campaign.
@param C_CampaignBonus_ID Campaign */
public void setC_CampaignBonus_ID (int C_CampaignBonus_ID)
{
if (C_CampaignBonus_ID <= 0) set_ValueNoCheck (COLUMNNAME_C_CampaignBonus_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_C_CampaignBonus_ID, Integer.valueOf(C_CampaignBonus_ID));
}
/** Get Campaign.
@return Campaign */
public int getC_CampaignBonus_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_CampaignBonus_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="1d155f69-bbf0-0e1d-063e-828d94e72aa8")
public static String es_PE_FIELD_ProductBonus_Campaign_Name="Bonificacion";

@XendraField(AD_Column_ID="C_CampaignBonus_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b3c77c6e-a899-cb2e-feaa-0fc36ca7cbb1",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1d155f69-bbf0-0e1d-063e-828d94e72aa8")
public static final String FIELDNAME_ProductBonus_Campaign="1d155f69-bbf0-0e1d-063e-828d94e72aa8";

@XendraTrl(Identifier="633ef533-f346-78f2-e603-ce211b7ad484")
public static String es_PE_COLUMN_C_CampaignBonus_ID_Name="Campaign";

@XendraColumn(AD_Element_ID="a5f39b6e-5196-25a2-48dd-348f1075c264",ColumnName="C_CampaignBonus_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="633ef533-f346-78f2-e603-ce211b7ad484",
Synchronized="2017-08-05 16:55:22.0")
/** Column name C_CampaignBonus_ID */
public static final String COLUMNNAME_C_CampaignBonus_ID = "C_CampaignBonus_ID";
/** Set UOM.
@param C_UOM_ID Unit of Measure */
public void setC_UOM_ID (int C_UOM_ID)
{
if (C_UOM_ID < 1) throw new IllegalArgumentException ("C_UOM_ID is mandatory.");
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

@XendraTrl(Identifier="2c7657c6-c877-0e69-a1d2-69838df1fdb8")
public static String es_PE_FIELD_ProductBonus_UOM_Description="Unidad de Medida";

@XendraTrl(Identifier="2c7657c6-c877-0e69-a1d2-69838df1fdb8")
public static String es_PE_FIELD_ProductBonus_UOM_Help="La UM define una unidad de medida única no monetaria";

@XendraTrl(Identifier="2c7657c6-c877-0e69-a1d2-69838df1fdb8")
public static String es_PE_FIELD_ProductBonus_UOM_Name="UM";
@XendraField(AD_Column_ID="C_UOM_ID",
IsCentrallyMaintained=true,AD_Tab_ID="b3c77c6e-a899-cb2e-feaa-0fc36ca7cbb1",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=60,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="2c7657c6-c877-0e69-a1d2-69838df1fdb8")
public static final String FIELDNAME_ProductBonus_UOM="2c7657c6-c877-0e69-a1d2-69838df1fdb8";

@XendraTrl(Identifier="4726114a-9739-9ec7-783b-8d61555c5cf7")
public static String es_PE_COLUMN_C_UOM_ID_Name="UOM";

@XendraColumn(AD_Element_ID="d0345019-4fcc-44c8-4fd1-e38e3b4adeed",ColumnName="C_UOM_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="107d46fd-952f-7ad3-6b0d-c74906c7b323",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="4726114a-9739-9ec7-783b-8d61555c5cf7",Synchronized="2017-08-05 16:55:22.0")
/** Column name C_UOM_ID */
public static final String COLUMNNAME_C_UOM_ID = "C_UOM_ID";
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
@XendraTrl(Identifier="babea7d5-924e-48cf-b6de-8c8f78ca0f07")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="babea7d5-924e-48cf-b6de-8c8f78ca0f07",
Synchronized="2017-08-05 16:55:22.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set ProductBonus.
@param M_ProductBonus_ID ProductBonus */
public void setM_ProductBonus_ID (int M_ProductBonus_ID)
{
if (M_ProductBonus_ID < 1) throw new IllegalArgumentException ("M_ProductBonus_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_ProductBonus_ID, Integer.valueOf(M_ProductBonus_ID));
}
/** Get ProductBonus.
@return ProductBonus */
public int getM_ProductBonus_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_ProductBonus_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="a5f4a34d-e354-cd90-629e-c9f4a7a19911")
public static String es_PE_FIELD_ProductBonus_ProductBonus_Name="ProductBonus";

@XendraField(AD_Column_ID="M_ProductBonus_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b3c77c6e-a899-cb2e-feaa-0fc36ca7cbb1",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a5f4a34d-e354-cd90-629e-c9f4a7a19911")
public static final String FIELDNAME_ProductBonus_ProductBonus="a5f4a34d-e354-cd90-629e-c9f4a7a19911";
/** Column name M_ProductBonus_ID */
public static final String COLUMNNAME_M_ProductBonus_ID = "M_ProductBonus_ID";
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

@XendraTrl(Identifier="6a4e865a-d55d-bcea-0d63-14bcedf31250")
public static String es_PE_FIELD_ProductBonus_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="6a4e865a-d55d-bcea-0d63-14bcedf31250")
public static String es_PE_FIELD_ProductBonus_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraTrl(Identifier="6a4e865a-d55d-bcea-0d63-14bcedf31250")
public static String es_PE_FIELD_ProductBonus_Product_Name="Producto";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b3c77c6e-a899-cb2e-feaa-0fc36ca7cbb1",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6a4e865a-d55d-bcea-0d63-14bcedf31250")
public static final String FIELDNAME_ProductBonus_Product="6a4e865a-d55d-bcea-0d63-14bcedf31250";

@XendraTrl(Identifier="5a987bf3-8008-0158-eb53-9c76ccc3af30")
public static String es_PE_COLUMN_M_Product_ID_Name="Product";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5a987bf3-8008-0158-eb53-9c76ccc3af30",
Synchronized="2017-08-05 16:55:22.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
/** Set Quantity.
@param QtyEntered The Quantity Entered is based on the selected UoM */
public void setQtyEntered (BigDecimal QtyEntered)
{
if (QtyEntered == null) throw new IllegalArgumentException ("QtyEntered is mandatory.");
set_Value (COLUMNNAME_QtyEntered, QtyEntered);
}
/** Get Quantity.
@return The Quantity Entered is based on the selected UoM */
public BigDecimal getQtyEntered() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_QtyEntered);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="9f33be82-9520-80de-918b-b4dc448ee0db")
public static String es_PE_FIELD_ProductBonus_Quantity_Description="La cantidad incorporada se basa en la UM seleccionada.";

@XendraTrl(Identifier="9f33be82-9520-80de-918b-b4dc448ee0db")
public static String es_PE_FIELD_ProductBonus_Quantity_Help="La cantidad incorporada se convierte a la cantidad baja de UM del producto";

@XendraTrl(Identifier="9f33be82-9520-80de-918b-b4dc448ee0db")
public static String es_PE_FIELD_ProductBonus_Quantity_Name="Cantidad";

@XendraField(AD_Column_ID="QtyEntered",IsCentrallyMaintained=true,
AD_Tab_ID="b3c77c6e-a899-cb2e-feaa-0fc36ca7cbb1",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9f33be82-9520-80de-918b-b4dc448ee0db")
public static final String FIELDNAME_ProductBonus_Quantity="9f33be82-9520-80de-918b-b4dc448ee0db";

@XendraTrl(Identifier="073e077e-7060-7e59-b68a-f0423c1bc796")
public static String es_PE_COLUMN_QtyEntered_Name="Quantity";

@XendraColumn(AD_Element_ID="70a37b06-986d-bf01-1ef9-23e214211841",ColumnName="QtyEntered",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="073e077e-7060-7e59-b68a-f0423c1bc796",
Synchronized="2017-08-05 16:55:22.0")
/** Column name QtyEntered */
public static final String COLUMNNAME_QtyEntered = "QtyEntered";
}
