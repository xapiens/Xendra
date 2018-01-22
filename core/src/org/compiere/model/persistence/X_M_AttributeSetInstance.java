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
/** Generated Model for M_AttributeSetInstance
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_AttributeSetInstance extends PO
{
/** Standard Constructor
@param ctx context
@param M_AttributeSetInstance_ID id
@param trxName transaction
*/
public X_M_AttributeSetInstance (Properties ctx, int M_AttributeSetInstance_ID, String trxName)
{
super (ctx, M_AttributeSetInstance_ID, trxName);
/** if (M_AttributeSetInstance_ID == 0)
{
setM_AttributeSet_ID (0);
setM_AttributeSetInstance_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_M_AttributeSetInstance (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=559 */
public static int Table_ID=MTable.getTable_ID("M_AttributeSetInstance");

@XendraTrl(Identifier="6adfbe5e-3e5f-999e-9314-a1ea63106eb7")
public static String es_PE_TAB_Instance_Description="Instancia Conjunto de Atributos";

@XendraTrl(Identifier="6adfbe5e-3e5f-999e-9314-a1ea63106eb7")
public static String es_PE_TAB_Instance_Name="Instancia";
@XendraTab(Name="Instance",
Description="Attribute Set Instance",Help="",AD_Window_ID="bd7ab262-ffdb-76d6-f9af-ce93739d8ed8",
SeqNo=10,TabLevel=0,IsSingleRow=false,IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="",HasTree=false,WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",
AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",
ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="6adfbe5e-3e5f-999e-9314-a1ea63106eb7",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Instance="6adfbe5e-3e5f-999e-9314-a1ea63106eb7";

@XendraTrl(Identifier="b1918d10-9089-5261-9f63-57b8dfe43311")
public static String es_PE_TABLE_M_AttributeSetInstance_Name="Instancia del Conjunto de Atributos";


@XendraTable(Name="Attribute Set Instance",Description="Product Attribute Set Instance",Help="",
TableName="M_AttributeSetInstance",AccessLevel="3",
AD_Window_ID="bd7ab262-ffdb-76d6-f9af-ce93739d8ed8",AD_Val_Rule_ID="",IsKey=1,LoadSeq=110,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.material",Identifier="b1918d10-9089-5261-9f63-57b8dfe43311",
Synchronized="2017-08-16 11:43:06.0")
/** TableName=M_AttributeSetInstance */
public static final String Table_Name="M_AttributeSetInstance";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_AttributeSetInstance");

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
    Table_ID = MTable.getTable_ID("M_AttributeSetInstance");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_AttributeSetInstance[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="5e71637c-87a5-9120-7ea9-faa23e003e08")
public static String es_PE_FIELD_Instance_Description_Description="Observación";

@XendraTrl(Identifier="5e71637c-87a5-9120-7ea9-faa23e003e08")
public static String es_PE_FIELD_Instance_Description_Help="Observación";

@XendraTrl(Identifier="5e71637c-87a5-9120-7ea9-faa23e003e08")
public static String es_PE_FIELD_Instance_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="6adfbe5e-3e5f-999e-9314-a1ea63106eb7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5e71637c-87a5-9120-7ea9-faa23e003e08")
public static final String FIELDNAME_Instance_Description="5e71637c-87a5-9120-7ea9-faa23e003e08";

@XendraTrl(Identifier="e0602761-de58-524f-eb73-3f4a232eac00")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e0602761-de58-524f-eb73-3f4a232eac00",
Synchronized="2017-08-05 16:55:00.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
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

@XendraTrl(Identifier="cdecac04-4988-65f7-9c82-387e9cb1e083")
public static String es_PE_FIELD_Instance_GuaranteeDate_Description="Fecha cuando la garantía expira";

@XendraTrl(Identifier="cdecac04-4988-65f7-9c82-387e9cb1e083")
public static String es_PE_FIELD_Instance_GuaranteeDate_Help="Fecha cuando la garantía ó disponibilidad normal expira";

@XendraTrl(Identifier="cdecac04-4988-65f7-9c82-387e9cb1e083")
public static String es_PE_FIELD_Instance_GuaranteeDate_Name="Fecha de Vencimiento";

@XendraField(AD_Column_ID="GuaranteeDate",IsCentrallyMaintained=true,
AD_Tab_ID="6adfbe5e-3e5f-999e-9314-a1ea63106eb7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=7,IsReadOnly=true,SeqNo=80,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cdecac04-4988-65f7-9c82-387e9cb1e083")
public static final String FIELDNAME_Instance_GuaranteeDate="cdecac04-4988-65f7-9c82-387e9cb1e083";

@XendraTrl(Identifier="cc22d36d-a846-8675-bb53-23af8e4dc0f3")
public static String es_PE_COLUMN_GuaranteeDate_Name="Fecha de Garantía";

@XendraColumn(AD_Element_ID="2956aa9d-0dfd-6e86-af9b-584f4c7eca21",ColumnName="GuaranteeDate",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cc22d36d-a846-8675-bb53-23af8e4dc0f3",
Synchronized="2017-08-05 16:55:00.0")
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
@XendraTrl(Identifier="6755dc88-749f-44de-8816-6f7c9b99d1cb")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6755dc88-749f-44de-8816-6f7c9b99d1cb",
Synchronized="2017-08-05 16:55:00.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
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
@XendraTrl(Identifier="1b0f9dbc-1924-2a14-9e65-7e5f8462e956")
public static String es_PE_FIELD_Instance_LotNo_Description="Número de Lote";

@XendraTrl(Identifier="1b0f9dbc-1924-2a14-9e65-7e5f8462e956")
public static String es_PE_FIELD_Instance_LotNo_Help="Indica el número de lote específico del que un producto fue parte.";

@XendraTrl(Identifier="1b0f9dbc-1924-2a14-9e65-7e5f8462e956")
public static String es_PE_FIELD_Instance_LotNo_Name="No. Lote";
@XendraField(AD_Column_ID="Lot",
IsCentrallyMaintained=true,AD_Tab_ID="6adfbe5e-3e5f-999e-9314-a1ea63106eb7",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=70,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="1b0f9dbc-1924-2a14-9e65-7e5f8462e956")
public static final String FIELDNAME_Instance_LotNo="1b0f9dbc-1924-2a14-9e65-7e5f8462e956";

@XendraTrl(Identifier="8fe94bba-2ce4-7395-daab-d2d787a85dbd")
public static String es_PE_COLUMN_Lot_Name="No. Lote";

@XendraColumn(AD_Element_ID="e8a3022e-4a91-6f2a-e27c-3739825075c7",ColumnName="Lot",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8fe94bba-2ce4-7395-daab-d2d787a85dbd",
Synchronized="2017-08-05 16:55:00.0")
/** Column name Lot */
public static final String COLUMNNAME_Lot = "Lot";
/** Set Attribute Set.
@param M_AttributeSet_ID Product Attribute Set */
public void setM_AttributeSet_ID (int M_AttributeSet_ID)
{
if (M_AttributeSet_ID < 0) throw new IllegalArgumentException ("M_AttributeSet_ID is mandatory.");
set_Value (COLUMNNAME_M_AttributeSet_ID, Integer.valueOf(M_AttributeSet_ID));
}
/** Get Attribute Set.
@return Product Attribute Set */
public int getM_AttributeSet_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_AttributeSet_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="562b3ac2-1d15-362e-56c4-4f64cf9bcdb4")
public static String es_PE_FIELD_Instance_AttributeSet_Description="Conjunto de Atributos de Producto";

@XendraTrl(Identifier="562b3ac2-1d15-362e-56c4-4f64cf9bcdb4")
public static String es_PE_FIELD_Instance_AttributeSet_Help="Defina los sistemas de la cualidad de producto para agregar cualidades y valores adicionales al producto. Usted necesita definir una cualidad fijada si desea seguir el número de conteo por entregas y de porción.";

@XendraTrl(Identifier="562b3ac2-1d15-362e-56c4-4f64cf9bcdb4")
public static String es_PE_FIELD_Instance_AttributeSet_Name="Conjunto de Atributos";

@XendraField(AD_Column_ID="M_AttributeSet_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6adfbe5e-3e5f-999e-9314-a1ea63106eb7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="562b3ac2-1d15-362e-56c4-4f64cf9bcdb4")
public static final String FIELDNAME_Instance_AttributeSet="562b3ac2-1d15-362e-56c4-4f64cf9bcdb4";

@XendraTrl(Identifier="b5b0f7b6-e0aa-c202-8dfb-84dabc5b4c32")
public static String es_PE_COLUMN_M_AttributeSet_ID_Name="Conjunto de Atributos";

@XendraColumn(AD_Element_ID="8debe7a4-548a-6126-d8aa-196f184678c2",ColumnName="M_AttributeSet_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b5b0f7b6-e0aa-c202-8dfb-84dabc5b4c32",
Synchronized="2017-08-05 16:55:00.0")
/** Column name M_AttributeSet_ID */
public static final String COLUMNNAME_M_AttributeSet_ID = "M_AttributeSet_ID";
/** Set Attribute Set Instance.
@param M_AttributeSetInstance_ID Product Attribute Set Instance */
public void setM_AttributeSetInstance_ID (int M_AttributeSetInstance_ID)
{
if (M_AttributeSetInstance_ID < 0) throw new IllegalArgumentException ("M_AttributeSetInstance_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_AttributeSetInstance_ID, Integer.valueOf(M_AttributeSetInstance_ID));
}
/** Get Attribute Set Instance.
@return Product Attribute Set Instance */
public int getM_AttributeSetInstance_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_AttributeSetInstance_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getM_AttributeSetInstance_ID()));
}

@XendraTrl(Identifier="9e425290-cd54-1cfa-7528-7e5c89eb7348")
public static String es_PE_FIELD_Instance_AttributeSetInstance_Description="Instancia del conjunto de atributos del producto";

@XendraTrl(Identifier="9e425290-cd54-1cfa-7528-7e5c89eb7348")
public static String es_PE_FIELD_Instance_AttributeSetInstance_Help="Valor actual de Instancia del conjunto de atributos del producto";

@XendraTrl(Identifier="9e425290-cd54-1cfa-7528-7e5c89eb7348")
public static String es_PE_FIELD_Instance_AttributeSetInstance_Name="Instancia del Conjunto de Atributos";

@XendraField(AD_Column_ID="M_AttributeSetInstance_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6adfbe5e-3e5f-999e-9314-a1ea63106eb7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=22,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9e425290-cd54-1cfa-7528-7e5c89eb7348")
public static final String FIELDNAME_Instance_AttributeSetInstance="9e425290-cd54-1cfa-7528-7e5c89eb7348";
/** Column name M_AttributeSetInstance_ID */
public static final String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";
/** Set Lot.
@param M_Lot_ID Product Lot Definition */
public void setM_Lot_ID (int M_Lot_ID)
{
if (M_Lot_ID <= 0) set_Value (COLUMNNAME_M_Lot_ID, null);
 else 
set_Value (COLUMNNAME_M_Lot_ID, Integer.valueOf(M_Lot_ID));
}
/** Get Lot.
@return Product Lot Definition */
public int getM_Lot_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Lot_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d8564a5d-e619-fb9a-81f1-a5a8c296f576")
public static String es_PE_FIELD_Instance_Lot_Description="Definición de lote de producto.";

@XendraTrl(Identifier="d8564a5d-e619-fb9a-81f1-a5a8c296f576")
public static String es_PE_FIELD_Instance_Lot_Help="El lote individual de un producto. ";

@XendraTrl(Identifier="d8564a5d-e619-fb9a-81f1-a5a8c296f576")
public static String es_PE_FIELD_Instance_Lot_Name="Lote";
@XendraField(AD_Column_ID="M_Lot_ID",
IsCentrallyMaintained=true,AD_Tab_ID="6adfbe5e-3e5f-999e-9314-a1ea63106eb7",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=22,IsReadOnly=true,SeqNo=60,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="d8564a5d-e619-fb9a-81f1-a5a8c296f576")
public static final String FIELDNAME_Instance_Lot="d8564a5d-e619-fb9a-81f1-a5a8c296f576";

@XendraTrl(Identifier="bc0dd463-3c35-2e7c-df1c-6c52d4dd95f2")
public static String es_PE_COLUMN_M_Lot_ID_Name="Lote";

@XendraColumn(AD_Element_ID="e1d8c1a9-7ee8-36d2-d9da-fcf63a007dbb",ColumnName="M_Lot_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="b1d7408a-6943-bebd-cdad-3bb7d92bd74e",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="bc0dd463-3c35-2e7c-df1c-6c52d4dd95f2",Synchronized="2017-08-05 16:55:00.0")
/** Column name M_Lot_ID */
public static final String COLUMNNAME_M_Lot_ID = "M_Lot_ID";

/** Ref_AttributeSetInstance_ID AD_Reference=bb57b2f2-25be-b966-04c4-2e0c6ea9b4e2 */
public static final int REF_ATTRIBUTESETINSTANCE_ID_AD_Reference_ID=1000046;
/** Set Ref Attribute Set Instance.
@param Ref_AttributeSetInstance_ID Product Attribute Set Instance */
public void setRef_AttributeSetInstance_ID (int Ref_AttributeSetInstance_ID)
{
if (Ref_AttributeSetInstance_ID <= 0) set_Value (COLUMNNAME_Ref_AttributeSetInstance_ID, null);
 else 
set_Value (COLUMNNAME_Ref_AttributeSetInstance_ID, Integer.valueOf(Ref_AttributeSetInstance_ID));
}
/** Get Ref Attribute Set Instance.
@return Product Attribute Set Instance */
public int getRef_AttributeSetInstance_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Ref_AttributeSetInstance_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="6e954bbf-03af-a00b-9f6b-0ff815c2ebcf")
public static String es_PE_COLUMN_Ref_AttributeSetInstance_ID_Name="Ref Attribute Set Instance";

@XendraColumn(AD_Element_ID="ff673d87-9520-c2f6-12c6-9576a3b5423f",
ColumnName="Ref_AttributeSetInstance_ID",AD_Reference_ID=11,
AD_Reference_Value_ID="bb57b2f2-25be-b966-04c4-2e0c6ea9b4e2",AD_Val_Rule_ID="",FieldLength=10,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="6e954bbf-03af-a00b-9f6b-0ff815c2ebcf",
Synchronized="2017-08-05 16:55:00.0")
/** Column name Ref_AttributeSetInstance_ID */
public static final String COLUMNNAME_Ref_AttributeSetInstance_ID = "Ref_AttributeSetInstance_ID";
/** Set Serial No.
@param SerNo Product Serial Number  */
public void setSerNo (String SerNo)
{
if (SerNo != null && SerNo.length() > 40)
{
log.warning("Length > 40 - truncated");
SerNo = SerNo.substring(0,39);
}
set_Value (COLUMNNAME_SerNo, SerNo);
}
/** Get Serial No.
@return Product Serial Number  */
public String getSerNo() 
{
String value = (String)get_Value(COLUMNNAME_SerNo);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="096813c2-a95a-ef54-d8bb-384e3c5b91c3")
public static String es_PE_FIELD_Instance_SerialNo_Description="Número de serie del producto";

@XendraTrl(Identifier="096813c2-a95a-ef54-d8bb-384e3c5b91c3")
public static String es_PE_FIELD_Instance_SerialNo_Help="El número de serie identifica un producto garantizado; monitoreado. Puede solamente ser usado cuando la cantidad es 1.";

@XendraTrl(Identifier="096813c2-a95a-ef54-d8bb-384e3c5b91c3")
public static String es_PE_FIELD_Instance_SerialNo_Name="No. de Serie";

@XendraField(AD_Column_ID="SerNo",IsCentrallyMaintained=true,
AD_Tab_ID="6adfbe5e-3e5f-999e-9314-a1ea63106eb7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=90,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="096813c2-a95a-ef54-d8bb-384e3c5b91c3")
public static final String FIELDNAME_Instance_SerialNo="096813c2-a95a-ef54-d8bb-384e3c5b91c3";

@XendraTrl(Identifier="b8f8f348-1459-ae25-081d-99621c0d0f09")
public static String es_PE_COLUMN_SerNo_Name="No. de Serie";

@XendraColumn(AD_Element_ID="9aac6ac8-a553-7ad4-9bc7-40f85e011f4b",ColumnName="SerNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b8f8f348-1459-ae25-081d-99621c0d0f09",
Synchronized="2017-08-05 16:55:00.0")
/** Column name SerNo */
public static final String COLUMNNAME_SerNo = "SerNo";
}
