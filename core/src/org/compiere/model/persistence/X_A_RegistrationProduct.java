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
/** Generated Model for A_RegistrationProduct
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_A_RegistrationProduct extends PO
{
/** Standard Constructor
@param ctx context
@param A_RegistrationProduct_ID id
@param trxName transaction
*/
public X_A_RegistrationProduct (Properties ctx, int A_RegistrationProduct_ID, String trxName)
{
super (ctx, A_RegistrationProduct_ID, trxName);
/** if (A_RegistrationProduct_ID == 0)
{
setA_RegistrationAttribute_ID (0);
setM_Product_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_A_RegistrationProduct (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=715 */
public static int Table_ID=MTable.getTable_ID("A_RegistrationProduct");

@XendraTrl(Identifier="57a93e34-6a47-a918-7876-00b37988a062")
public static String es_PE_TAB_ProductAssignment_Description="Asignamiento de Atributos para Productos";

@XendraTrl(Identifier="57a93e34-6a47-a918-7876-00b37988a062")
public static String es_PE_TAB_ProductAssignment_Help="Se determina, que las cualidades se asignan a un producto.";

@XendraTrl(Identifier="57a93e34-6a47-a918-7876-00b37988a062")
public static String es_PE_TAB_ProductAssignment_Name="Asignar Productos";

@XendraTab(Name="Product Assignment",Description="Assignment of Atrributes to Products",
Help="Determines, which attributes are assigned to a product",
AD_Window_ID="22600d9e-6e66-7a00-961e-591783e32b7a",SeqNo=20,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="8e944c7b-abd6-f064-7402-8f04ab2606ea",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="57a93e34-6a47-a918-7876-00b37988a062",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_ProductAssignment="57a93e34-6a47-a918-7876-00b37988a062";

@XendraTrl(Identifier="67cf23c2-53cb-9dce-cc62-0fea0665c823")
public static String es_PE_TABLE_A_RegistrationProduct_Name="A_RegistrationProduct";

@XendraTable(Name="Registration Product",AD_Package_ID="1b3656e5-71c7-1296-994e-9b2c4549c7fd",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="A_RegistrationProduct",AccessLevel="2",
AD_Window_ID="22600d9e-6e66-7a00-961e-591783e32b7a",AD_Val_Rule_ID="",IsKey=0,LoadSeq=145,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.standard",Identifier="67cf23c2-53cb-9dce-cc62-0fea0665c823",
Synchronized="2020-03-03 21:36:16.0")
/** TableName=A_RegistrationProduct */
public static final String Table_Name="A_RegistrationProduct";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"A_RegistrationProduct");

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
    Table_ID = MTable.getTable_ID("A_RegistrationProduct");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_A_RegistrationProduct[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Registration Attribute.
@param A_RegistrationAttribute_ID Asset Registration Attribute */
public void setA_RegistrationAttribute_ID (int A_RegistrationAttribute_ID)
{
if (A_RegistrationAttribute_ID < 1) throw new IllegalArgumentException ("A_RegistrationAttribute_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_A_RegistrationAttribute_ID, Integer.valueOf(A_RegistrationAttribute_ID));
}
/** Get Registration Attribute.
@return Asset Registration Attribute */
public int getA_RegistrationAttribute_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_A_RegistrationAttribute_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="9677b5a0-3372-71ec-d659-f5e7bb4d23bc")
public static String es_PE_FIELD_ProductAssignment_RegistrationAttribute_Name="Registro de Atributo";

@XendraTrl(Identifier="9677b5a0-3372-71ec-d659-f5e7bb4d23bc")
public static String es_PE_FIELD_ProductAssignment_RegistrationAttribute_Description="Registro de atributo activo";

@XendraTrl(Identifier="9677b5a0-3372-71ec-d659-f5e7bb4d23bc")
public static String es_PE_FIELD_ProductAssignment_RegistrationAttribute_Help="Defina los valores individuales para el registro del activo.";

@XendraField(AD_Column_ID="A_RegistrationAttribute_ID",IsCentrallyMaintained=true,
AD_Tab_ID="57a93e34-6a47-a918-7876-00b37988a062",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9677b5a0-3372-71ec-d659-f5e7bb4d23bc")
public static final String FIELDNAME_ProductAssignment_RegistrationAttribute="9677b5a0-3372-71ec-d659-f5e7bb4d23bc";

@XendraTrl(Identifier="8e944c7b-abd6-f064-7402-8f04ab2606ea")
public static String es_PE_COLUMN_A_RegistrationAttribute_ID_Name="Registro de Atributo";

@XendraColumn(AD_Element_ID="afcb188c-7a96-7990-bf5f-31ff35953350",
ColumnName="A_RegistrationAttribute_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=true,
IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="8e944c7b-abd6-f064-7402-8f04ab2606ea",Synchronized="2019-08-30 22:20:56.0")
/** Column name A_RegistrationAttribute_ID */
public static final String COLUMNNAME_A_RegistrationAttribute_ID = "A_RegistrationAttribute_ID";
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

@XendraTrl(Identifier="8f479faf-3e33-6899-b364-b02868d6a5c0")
public static String es_PE_FIELD_ProductAssignment_Description_Name="Observación";

@XendraTrl(Identifier="8f479faf-3e33-6899-b364-b02868d6a5c0")
public static String es_PE_FIELD_ProductAssignment_Description_Description="Observación";

@XendraTrl(Identifier="8f479faf-3e33-6899-b364-b02868d6a5c0")
public static String es_PE_FIELD_ProductAssignment_Description_Help="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="57a93e34-6a47-a918-7876-00b37988a062",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8f479faf-3e33-6899-b364-b02868d6a5c0")
public static final String FIELDNAME_ProductAssignment_Description="8f479faf-3e33-6899-b364-b02868d6a5c0";

@XendraTrl(Identifier="a3e186a1-019e-e905-5a48-055ed5a8cae7")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a3e186a1-019e-e905-5a48-055ed5a8cae7",
Synchronized="2019-08-30 22:20:56.0")
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
@XendraTrl(Identifier="1ae4a27b-6c36-48a6-a9ad-8d111d955150")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1ae4a27b-6c36-48a6-a9ad-8d111d955150",
Synchronized="2019-08-30 22:20:56.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Product.
@param M_Product_ID Product, Service, Item */
public void setM_Product_ID (int M_Product_ID)
{
if (M_Product_ID < 1) throw new IllegalArgumentException ("M_Product_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_Product_ID, Integer.valueOf(M_Product_ID));
}
/** Get Product.
@return Product, Service, Item */
public int getM_Product_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Product_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="9d6b0442-867a-1b42-2593-fa39b41b4013")
public static String es_PE_FIELD_ProductAssignment_Product_Name="Producto";

@XendraTrl(Identifier="9d6b0442-867a-1b42-2593-fa39b41b4013")
public static String es_PE_FIELD_ProductAssignment_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="9d6b0442-867a-1b42-2593-fa39b41b4013")
public static String es_PE_FIELD_ProductAssignment_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="57a93e34-6a47-a918-7876-00b37988a062",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9d6b0442-867a-1b42-2593-fa39b41b4013")
public static final String FIELDNAME_ProductAssignment_Product="9d6b0442-867a-1b42-2593-fa39b41b4013";

@XendraTrl(Identifier="898bb317-e512-38c3-fb75-423680aa7442")
public static String es_PE_COLUMN_M_Product_ID_Name="Producto";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="4281f8eb-238e-6b28-eb66-8cc866e6312c",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="898bb317-e512-38c3-fb75-423680aa7442",Synchronized="2019-08-30 22:20:56.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
}
