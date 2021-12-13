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
/** Generated Model for M_AttributeUse
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_AttributeUse extends PO
{
/** Standard Constructor
@param ctx context
@param M_AttributeUse_ID id
@param trxName transaction
*/
public X_M_AttributeUse (Properties ctx, int M_AttributeUse_ID, String trxName)
{
super (ctx, M_AttributeUse_ID, trxName);
/** if (M_AttributeUse_ID == 0)
{
setM_Attribute_ID (0);
setM_AttributeSet_ID (0);
setSeqNo (0);	
// @SQL=SELECT COALESCE(MAX(SeqNo),0)+10 AS DefaultValue FROM M_AttributeUse WHERE M_AttributeSet_ID=@M_AttributeSet_ID@
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_M_AttributeUse (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=563 */
public static int Table_ID=MTable.getTable_ID("M_AttributeUse");

@XendraTrl(Identifier="be20e9b7-fd01-ca77-ecef-d588e48c9ef8")
public static String es_PE_TAB_AttributeUse_Description="Atributos usados para el sistema de atributo de producto.";

@XendraTrl(Identifier="be20e9b7-fd01-ca77-ecef-d588e48c9ef8")
public static String es_PE_TAB_AttributeUse_Help="Atributo y valor de atributos usados para el producto";

@XendraTrl(Identifier="be20e9b7-fd01-ca77-ecef-d588e48c9ef8")
public static String es_PE_TAB_AttributeUse_Name="Uso de Atributo";
@XendraTab(Name="Attribute Use",
Description="Attributes Used for the Product Attribute Set",
Help="Attributes and Attribute Values used for the product",
AD_Window_ID="c776058b-1056-0bc4-3e42-f91c200f5ade",SeqNo=20,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="7ebbff09-fc0f-792e-2b00-2cd16e3cccbe",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="be20e9b7-fd01-ca77-ecef-d588e48c9ef8",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_AttributeUse="be20e9b7-fd01-ca77-ecef-d588e48c9ef8";

@XendraTrl(Identifier="2424e70a-3980-39de-7fc3-400f47eef477")
public static String es_PE_TABLE_M_AttributeUse_Name="M_AttributeUse";

@XendraTable(Name="M_AttributeUse",AD_Package_ID="2809ac2d-7d43-20f8-05f0-a478f2e50204",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="M_AttributeUse",AccessLevel="3",AD_Window_ID="c776058b-1056-0bc4-3e42-f91c200f5ade",
AD_Val_Rule_ID="",IsKey=0,LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.material",
Identifier="2424e70a-3980-39de-7fc3-400f47eef477",Synchronized="2020-03-03 21:38:16.0")
/** TableName=M_AttributeUse */
public static final String Table_Name="M_AttributeUse";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_AttributeUse");

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
    Table_ID = MTable.getTable_ID("M_AttributeUse");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_AttributeUse[").append(get_ID()).append("]");
return sb.toString();
}
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
@XendraTrl(Identifier="7e648043-1bd6-4aa5-995e-eba30a64351d")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7e648043-1bd6-4aa5-995e-eba30a64351d",
Synchronized="2019-08-30 22:22:58.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Attribute.
@param M_Attribute_ID Product Attribute */
public void setM_Attribute_ID (int M_Attribute_ID)
{
if (M_Attribute_ID < 1) throw new IllegalArgumentException ("M_Attribute_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_Attribute_ID, Integer.valueOf(M_Attribute_ID));
}
/** Get Attribute.
@return Product Attribute */
public int getM_Attribute_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Attribute_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="bfa2b5c1-1ef4-5632-c2ca-c27a64e297de")
public static String es_PE_FIELD_AttributeUse_Attribute_Name="Atributo";

@XendraTrl(Identifier="bfa2b5c1-1ef4-5632-c2ca-c27a64e297de")
public static String es_PE_FIELD_AttributeUse_Attribute_Description="Atributo del Producto";

@XendraTrl(Identifier="bfa2b5c1-1ef4-5632-c2ca-c27a64e297de")
public static String es_PE_FIELD_AttributeUse_Attribute_Help="Cualidad del producto como el color y tamaño";

@XendraField(AD_Column_ID="M_Attribute_ID",IsCentrallyMaintained=true,
AD_Tab_ID="be20e9b7-fd01-ca77-ecef-d588e48c9ef8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bfa2b5c1-1ef4-5632-c2ca-c27a64e297de")
public static final String FIELDNAME_AttributeUse_Attribute="bfa2b5c1-1ef4-5632-c2ca-c27a64e297de";

@XendraTrl(Identifier="4b2f29aa-1c5b-429d-eeb4-9018baca8580")
public static String es_PE_COLUMN_M_Attribute_ID_Name="Atributo";

@XendraColumn(AD_Element_ID="452994bf-a9df-fbe8-06a5-b6ca6baff95b",ColumnName="M_Attribute_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=2,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4b2f29aa-1c5b-429d-eeb4-9018baca8580",
Synchronized="2019-08-30 22:22:58.0")
/** Column name M_Attribute_ID */
public static final String COLUMNNAME_M_Attribute_ID = "M_Attribute_ID";
/** Set Attribute Set.
@param M_AttributeSet_ID Product Attribute Set */
public void setM_AttributeSet_ID (int M_AttributeSet_ID)
{
if (M_AttributeSet_ID < 0) throw new IllegalArgumentException ("M_AttributeSet_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_AttributeSet_ID, Integer.valueOf(M_AttributeSet_ID));
}
/** Get Attribute Set.
@return Product Attribute Set */
public int getM_AttributeSet_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_AttributeSet_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getM_AttributeSet_ID()));
}

@XendraTrl(Identifier="ecb1dc8e-5291-4b0b-86d4-4231aead8d73")
public static String es_PE_FIELD_AttributeUse_AttributeSet_Name="Conjunto de Atributos";

@XendraTrl(Identifier="ecb1dc8e-5291-4b0b-86d4-4231aead8d73")
public static String es_PE_FIELD_AttributeUse_AttributeSet_Description="Conjunto de Atributos de Producto";

@XendraTrl(Identifier="ecb1dc8e-5291-4b0b-86d4-4231aead8d73")
public static String es_PE_FIELD_AttributeUse_AttributeSet_Help="Defina los sistemas de la cualidad de producto para agregar cualidades y valores adicionales al producto. Usted necesita definir una cualidad fijada si desea seguir el número de conteo por entregas y de porción.";

@XendraField(AD_Column_ID="M_AttributeSet_ID",IsCentrallyMaintained=true,
AD_Tab_ID="be20e9b7-fd01-ca77-ecef-d588e48c9ef8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ecb1dc8e-5291-4b0b-86d4-4231aead8d73")
public static final String FIELDNAME_AttributeUse_AttributeSet="ecb1dc8e-5291-4b0b-86d4-4231aead8d73";

@XendraTrl(Identifier="7ebbff09-fc0f-792e-2b00-2cd16e3cccbe")
public static String es_PE_COLUMN_M_AttributeSet_ID_Name="Conjunto de Atributos";

@XendraColumn(AD_Element_ID="8debe7a4-548a-6126-d8aa-196f184678c2",ColumnName="M_AttributeSet_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7ebbff09-fc0f-792e-2b00-2cd16e3cccbe",
Synchronized="2019-08-30 22:22:58.0")
/** Column name M_AttributeSet_ID */
public static final String COLUMNNAME_M_AttributeSet_ID = "M_AttributeSet_ID";
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

@XendraTrl(Identifier="18737871-da1d-933a-7b2a-4a06833de378")
public static String es_PE_FIELD_AttributeUse_Sequence_Name="Secuencia";

@XendraTrl(Identifier="18737871-da1d-933a-7b2a-4a06833de378")
public static String es_PE_FIELD_AttributeUse_Sequence_Description="Método de ordenar registros; el número más bajo viene primero";

@XendraTrl(Identifier="18737871-da1d-933a-7b2a-4a06833de378")
public static String es_PE_FIELD_AttributeUse_Sequence_Help="La Secuencia indica el orden de los registros";

@XendraField(AD_Column_ID="SeqNo",IsCentrallyMaintained=true,
AD_Tab_ID="be20e9b7-fd01-ca77-ecef-d588e48c9ef8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=60,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="18737871-da1d-933a-7b2a-4a06833de378")
public static final String FIELDNAME_AttributeUse_Sequence="18737871-da1d-933a-7b2a-4a06833de378";

@XendraTrl(Identifier="610694ac-35c8-0d9d-090a-6e9f8b1e00ed")
public static String es_PE_COLUMN_SeqNo_Name="Secuencia";

@XendraColumn(AD_Element_ID="38fa26fe-b59d-fce1-c129-420b57da738b",ColumnName="SeqNo",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="@SQL=SELECT COALESCE(MAX(SeqNo),0)+10 AS DefaultValue FROM M_AttributeUse WHERE M_AttributeSet_ID=@M_AttributeSet_ID@",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="610694ac-35c8-0d9d-090a-6e9f8b1e00ed",
Synchronized="2019-08-30 22:22:58.0")
/** Column name SeqNo */
public static final String COLUMNNAME_SeqNo = "SeqNo";
}
