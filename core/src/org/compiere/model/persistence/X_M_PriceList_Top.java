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
/** Generated Model for M_PriceList_Top
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_PriceList_Top extends PO
{
/** Standard Constructor
@param ctx context
@param M_PriceList_Top_ID id
@param trxName transaction
*/
public X_M_PriceList_Top (Properties ctx, int M_PriceList_Top_ID, String trxName)
{
super (ctx, M_PriceList_Top_ID, trxName);
/** if (M_PriceList_Top_ID == 0)
{
setM_PriceList_ID (0);
setM_PriceList_Top_ID (0);
setM_Product_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_M_PriceList_Top (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000274 */
public static int Table_ID=MTable.getTable_ID("M_PriceList_Top");

@XendraTrl(Identifier="b59d1842-e560-4b58-b19f-ee886e992991")
public static String es_PE_TAB_PriceListTop_Name="Price List Top";
@XendraTab(Name="Price List Top",
Description="",Help="",AD_Window_ID="e3c55106-2db1-b535-c578-d544cd183313",SeqNo=40,TabLevel=0,
IsSingleRow=false,IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",
HasTree=false,WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",
AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",
ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="b59d1842-e560-4b58-b19f-ee886e992991",Synchronized="2013-01-21 11:15:11.0")
public static final String TABNAME_PriceListTop="b59d1842-e560-4b58-b19f-ee886e992991";

@XendraTrl(Identifier="d46ee19a-826e-4e19-a496-bfe40ac990ea")
public static String es_PE_TABLE_M_PriceList_Top_Name="Price List Top";

@XendraTable(Name="Price List Top",AD_Package_ID="2809ac2d-7d43-20f8-05f0-a478f2e50204",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="M_PriceList_Top",AccessLevel="3",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=false,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.material",Identifier="d46ee19a-826e-4e19-a496-bfe40ac990ea",
Synchronized="2020-03-03 21:38:46.0")
/** TableName=M_PriceList_Top */
public static final String Table_Name="M_PriceList_Top";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_PriceList_Top");

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
    Table_ID = MTable.getTable_ID("M_PriceList_Top");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_PriceList_Top[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="6c36bb98-65a8-4de8-b202-15772c80e544")
public static String es_PE_FIELD_PriceListTop_UOM_Name="UM";

@XendraTrl(Identifier="6c36bb98-65a8-4de8-b202-15772c80e544")
public static String es_PE_FIELD_PriceListTop_UOM_Description="Unidad de Medida";

@XendraTrl(Identifier="6c36bb98-65a8-4de8-b202-15772c80e544")
public static String es_PE_FIELD_PriceListTop_UOM_Help="La UM define una unidad de medida única no monetaria";

@XendraField(AD_Column_ID="C_UOM_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b59d1842-e560-4b58-b19f-ee886e992991",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2013-01-21 11:15:11.0",
Identifier="6c36bb98-65a8-4de8-b202-15772c80e544")
public static final String FIELDNAME_PriceListTop_UOM="6c36bb98-65a8-4de8-b202-15772c80e544";

@XendraTrl(Identifier="bfb018a9-8b7a-47ed-8f8e-654513ac954a")
public static String es_PE_COLUMN_C_UOM_ID_Name="UOM";

@XendraColumn(AD_Element_ID="d0345019-4fcc-44c8-4fd1-e38e3b4adeed",ColumnName="C_UOM_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bfb018a9-8b7a-47ed-8f8e-654513ac954a",
Synchronized="2019-08-30 22:23:22.0")
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
@XendraTrl(Identifier="2f868a6b-5756-417a-a78c-a677faeb441c")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2f868a6b-5756-417a-a78c-a677faeb441c",
Synchronized="2019-08-30 22:23:22.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Image URL.
@param ImageURL URL of  image */
public void setImageURL (String ImageURL)
{
if (ImageURL != null && ImageURL.length() > 120)
{
log.warning("Length > 120 - truncated");
ImageURL = ImageURL.substring(0,119);
}
set_Value (COLUMNNAME_ImageURL, ImageURL);
}
/** Get Image URL.
@return URL of  image */
public String getImageURL() 
{
String value = (String)get_Value(COLUMNNAME_ImageURL);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="755aee32-4975-44cf-bd6b-83d24a46385e")
public static String es_PE_FIELD_PriceListTop_ImageURL_Name="URL de la Imagen";

@XendraTrl(Identifier="755aee32-4975-44cf-bd6b-83d24a46385e")
public static String es_PE_FIELD_PriceListTop_ImageURL_Description="URL de la estructura de la imagen";

@XendraTrl(Identifier="755aee32-4975-44cf-bd6b-83d24a46385e")
public static String es_PE_FIELD_PriceListTop_ImageURL_Help="URL de imagen de la textura; La imagen no se almacena en la base de datos; ";

@XendraField(AD_Column_ID="ImageURL",IsCentrallyMaintained=true,
AD_Tab_ID="b59d1842-e560-4b58-b19f-ee886e992991",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=120,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2013-01-21 11:15:11.0",
Identifier="755aee32-4975-44cf-bd6b-83d24a46385e")
public static final String FIELDNAME_PriceListTop_ImageURL="755aee32-4975-44cf-bd6b-83d24a46385e";

@XendraTrl(Identifier="0d9a32da-0b1c-4f45-8bca-103683113bfd")
public static String es_PE_COLUMN_ImageURL_Name="Image URL";

@XendraColumn(AD_Element_ID="fe037607-f5d9-d969-d6e5-eb1f94c10e5e",ColumnName="ImageURL",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=120,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0d9a32da-0b1c-4f45-8bca-103683113bfd",
Synchronized="2019-08-30 22:23:22.0")
/** Column name ImageURL */
public static final String COLUMNNAME_ImageURL = "ImageURL";
/** Set M_PriceList_ID.
@param M_PriceList_ID Unique identifier of a Price List */
public void setM_PriceList_ID (int M_PriceList_ID)
{
if (M_PriceList_ID < 1) throw new IllegalArgumentException ("M_PriceList_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_PriceList_ID, Integer.valueOf(M_PriceList_ID));
}
/** Get M_PriceList_ID.
@return Unique identifier of a Price List */
public int getM_PriceList_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_PriceList_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ed4c9e52-ad9b-4330-b94c-91ef641cae81")
public static String es_PE_FIELD_PriceListTop_M_PriceList_ID_Name="Lista de Precios";

@XendraTrl(Identifier="ed4c9e52-ad9b-4330-b94c-91ef641cae81")
public static String es_PE_FIELD_PriceListTop_M_PriceList_ID_Description="Identificador único de mi lista de precios";

@XendraTrl(Identifier="ed4c9e52-ad9b-4330-b94c-91ef641cae81")
public static String es_PE_FIELD_PriceListTop_M_PriceList_ID_Help="Listas de precios son usadas para determinar el precio; margen y costo de artículos comprados ó vendidos.";

@XendraField(AD_Column_ID="M_PriceList_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b59d1842-e560-4b58-b19f-ee886e992991",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2013-01-21 11:15:11.0",
Identifier="ed4c9e52-ad9b-4330-b94c-91ef641cae81")
public static final String FIELDNAME_PriceListTop_M_PriceList_ID="ed4c9e52-ad9b-4330-b94c-91ef641cae81";

@XendraTrl(Identifier="2c2a2839-4385-49e1-b1bc-fd0fce6acb55")
public static String es_PE_COLUMN_M_PriceList_ID_Name="M_PriceList_ID";

@XendraColumn(AD_Element_ID="652afdd3-9ff1-082d-5831-6aad828e0e09",ColumnName="M_PriceList_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2c2a2839-4385-49e1-b1bc-fd0fce6acb55",
Synchronized="2019-08-30 22:23:22.0")
/** Column name M_PriceList_ID */
public static final String COLUMNNAME_M_PriceList_ID = "M_PriceList_ID";
/** Set Price List Top.
@param M_PriceList_Top_ID Price List Top */
public void setM_PriceList_Top_ID (int M_PriceList_Top_ID)
{
if (M_PriceList_Top_ID < 1) throw new IllegalArgumentException ("M_PriceList_Top_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_PriceList_Top_ID, Integer.valueOf(M_PriceList_Top_ID));
}
/** Get Price List Top.
@return Price List Top */
public int getM_PriceList_Top_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_PriceList_Top_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="05b4440e-b146-4b05-8f19-728a0ee1537f")
public static String es_PE_FIELD_PriceListTop_PriceListTop_Name="Price List Top";

@XendraField(AD_Column_ID="M_PriceList_Top_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b59d1842-e560-4b58-b19f-ee886e992991",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2013-01-21 11:15:11.0",
Identifier="05b4440e-b146-4b05-8f19-728a0ee1537f")
public static final String FIELDNAME_PriceListTop_PriceListTop="05b4440e-b146-4b05-8f19-728a0ee1537f";
/** Column name M_PriceList_Top_ID */
public static final String COLUMNNAME_M_PriceList_Top_ID = "M_PriceList_Top_ID";
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

@XendraTrl(Identifier="b9721bb8-2d9a-4519-8a55-7aea4e18af0b")
public static String es_PE_FIELD_PriceListTop_Product_Name="Producto";

@XendraTrl(Identifier="b9721bb8-2d9a-4519-8a55-7aea4e18af0b")
public static String es_PE_FIELD_PriceListTop_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="b9721bb8-2d9a-4519-8a55-7aea4e18af0b")
public static String es_PE_FIELD_PriceListTop_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b59d1842-e560-4b58-b19f-ee886e992991",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2013-01-21 11:15:11.0",
Identifier="b9721bb8-2d9a-4519-8a55-7aea4e18af0b")
public static final String FIELDNAME_PriceListTop_Product="b9721bb8-2d9a-4519-8a55-7aea4e18af0b";

@XendraTrl(Identifier="a364198b-2af9-4e3c-80ae-5fe80c1d94c1")
public static String es_PE_COLUMN_M_Product_ID_Name="Product";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a364198b-2af9-4e3c-80ae-5fe80c1d94c1",
Synchronized="2019-08-30 22:23:22.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
/** Set Sequence.
@param SeqNo Method of ordering records: lowest number comes first */
public void setSeqNo (int SeqNo)
{
set_Value (COLUMNNAME_SeqNo, Integer.valueOf(SeqNo));
}
/** Get Sequence.
@return Method of ordering records: lowest number comes first */
public int getSeqNo() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_SeqNo);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="a2dad0d1-cb30-4455-9154-6436556fd391")
public static String es_PE_FIELD_PriceListTop_Sequence_Name="Secuencia";

@XendraTrl(Identifier="a2dad0d1-cb30-4455-9154-6436556fd391")
public static String es_PE_FIELD_PriceListTop_Sequence_Description="Método de ordenar registros; el número más bajo viene primero";

@XendraTrl(Identifier="a2dad0d1-cb30-4455-9154-6436556fd391")
public static String es_PE_FIELD_PriceListTop_Sequence_Help="La Secuencia indica el orden de los registros";

@XendraField(AD_Column_ID="SeqNo",IsCentrallyMaintained=true,
AD_Tab_ID="b59d1842-e560-4b58-b19f-ee886e992991",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2013-01-21 11:15:11.0",
Identifier="a2dad0d1-cb30-4455-9154-6436556fd391")
public static final String FIELDNAME_PriceListTop_Sequence="a2dad0d1-cb30-4455-9154-6436556fd391";

@XendraTrl(Identifier="2882d108-477b-4c91-a3eb-592d2cfcbd1f")
public static String es_PE_COLUMN_SeqNo_Name="Sequence";

@XendraColumn(AD_Element_ID="38fa26fe-b59d-fce1-c129-420b57da738b",ColumnName="SeqNo",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2882d108-477b-4c91-a3eb-592d2cfcbd1f",
Synchronized="2019-08-30 22:23:22.0")
/** Column name SeqNo */
public static final String COLUMNNAME_SeqNo = "SeqNo";
}
