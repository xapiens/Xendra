/******************************************************************************
 * Product: Xendra ERP & CRM Smart Business Solution                          *
 * Copyright (C)  dravios       All Rights Reserved.                          *
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
/** Generated Model for M_Storage
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_Storage extends PO
{
/** Standard Constructor
@param ctx context
@param M_Storage_ID id
@param trxName transaction
*/
public X_M_Storage (Properties ctx, int M_Storage_ID, String trxName)
{
super (ctx, M_Storage_ID, trxName);
/** if (M_Storage_ID == 0)
{
setM_AttributeSetInstance_ID (0);
setM_Locator_ID (0);
setM_Product_ID (0);
setQtyOnHand (Env.ZERO);
setQtyOrdered (Env.ZERO);
setQtyReserved (Env.ZERO);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_M_Storage (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=250 */
public static int Table_ID=MTable.getTable_ID("M_Storage");

@XendraTrl(Identifier="2b54d21b-9e81-fa0f-765f-2e564a9f8623")
public static String es_PE_TAB_Storage_Name="Almacenamiento";
@XendraTab(Name="Storage",
Description="Detail Storage Information",Help="",
AD_Window_ID="46ccc992-68c0-cc7a-5da1-f15017ce2fce",SeqNo=30,TabLevel=2,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=true,
AD_Column_ID="c719fe8b-a7be-52b1-1492-b4d24457e13e",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=false,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="2b54d21b-9e81-fa0f-765f-2e564a9f8623",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Storage="2b54d21b-9e81-fa0f-765f-2e564a9f8623";

@XendraTrl(Identifier="be10b627-38e2-1cd8-a23a-bed77ffb560c")
public static String es_PE_TABLE_M_Storage_Name="M_Storage";

@XendraTable(Name="M_Storage",AD_Package_ID="2809ac2d-7d43-20f8-05f0-a478f2e50204",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",TableName="M_Storage",
AccessLevel="3",AD_Window_ID="46ccc992-68c0-cc7a-5da1-f15017ce2fce",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.material",
Identifier="be10b627-38e2-1cd8-a23a-bed77ffb560c",Synchronized="2023-04-19 21:54:11.0")
/** TableName=M_Storage */
public static final String Table_Name="M_Storage";


@XendraIndex(Name="m_storage_identifier",Identifier="c092e7e0-b2b4-48c1-bed0-75bbd6f8dbd0",
Column_Names="identifier",IsUnique="false",TableIdentifier="c092e7e0-b2b4-48c1-bed0-75bbd6f8dbd0",
Synchronized="2020-11-02 17:52:07.0")
public static final String INDEXNAME_m_storage_identifier = "c092e7e0-b2b4-48c1-bed0-75bbd6f8dbd0";


@XendraIndex(Name="m_storage_main",Identifier="fe714ed6-fc97-4806-8cea-528aa3ecaec8",
Column_Names="m_storage_id",IsUnique="false",
TableIdentifier="fe714ed6-fc97-4806-8cea-528aa3ecaec8",Synchronized="2020-11-02 20:45:36.0")
public static final String INDEXNAME_m_storage_main = "fe714ed6-fc97-4806-8cea-528aa3ecaec8";


@XendraIndex(Name="storageasi",Identifier="7252f0d1-b2b5-4806-ace4-a5c911ea3b9b",
Column_Names="m_attributesetinstance_id",IsUnique="false",
TableIdentifier="7252f0d1-b2b5-4806-ace4-a5c911ea3b9b",Synchronized="2020-10-26 10:31:03.0")
public static final String INDEXNAME_storageasi = "7252f0d1-b2b5-4806-ace4-a5c911ea3b9b";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_Storage");

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
    Table_ID = MTable.getTable_ID("M_Storage");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_Storage[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Date last inventory count.
@param DateLastInventory Date of Last Inventory Count */
public void setDateLastInventory (Timestamp DateLastInventory)
{
set_Value (COLUMNNAME_DateLastInventory, DateLastInventory);
}
/** Get Date last inventory count.
@return Date of Last Inventory Count */
public Timestamp getDateLastInventory() 
{
return (Timestamp)get_Value(COLUMNNAME_DateLastInventory);
}

@XendraTrl(Identifier="6da15f93-b094-217a-2229-15b3a7e66efe")
public static String es_PE_FIELD_Storage_DateLastInventoryCount_Name="Ultima Fecha del Conteo de Inventarios";

@XendraTrl(Identifier="6da15f93-b094-217a-2229-15b3a7e66efe")
public static String es_PE_FIELD_Storage_DateLastInventoryCount_Help="La Fecha del último conteo de Inventario indica la última vez en que un conteo de inventario fue hecho";

@XendraTrl(Identifier="6da15f93-b094-217a-2229-15b3a7e66efe")
public static String es_PE_FIELD_Storage_DateLastInventoryCount_Description="Fecha de último conteo de inventario";

@XendraField(AD_Column_ID="DateLastInventory",IsCentrallyMaintained=true,
AD_Tab_ID="2b54d21b-9e81-fa0f-765f-2e564a9f8623",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=80,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6da15f93-b094-217a-2229-15b3a7e66efe")
public static final String FIELDNAME_Storage_DateLastInventoryCount="6da15f93-b094-217a-2229-15b3a7e66efe";

@XendraTrl(Identifier="6b6c504c-f151-6a78-8e1c-b08090893426")
public static String es_PE_COLUMN_DateLastInventory_Name="Ultima Fecha del Conteo de Inventarios";

@XendraColumn(AD_Element_ID="a85ef901-a554-3a25-6dda-793a8a73752b",ColumnName="DateLastInventory",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6b6c504c-f151-6a78-8e1c-b08090893426",
Synchronized="2023-03-22 18:57:02.0")
/** Column name DateLastInventory */
public static final String COLUMNNAME_DateLastInventory = "DateLastInventory";
/** Set Date last run.
@param DateLastRun Date the process was last run. */
public void setDateLastRun (Timestamp DateLastRun)
{
set_Value (COLUMNNAME_DateLastRun, DateLastRun);
}
/** Get Date last run.
@return Date the process was last run. */
public Timestamp getDateLastRun() 
{
return (Timestamp)get_Value(COLUMNNAME_DateLastRun);
}

@XendraTrl(Identifier="f9c8e066-fd79-4531-b0a2-c329f505fba3")
public static String es_PE_COLUMN_DateLastRun_Name="Date last run";

@XendraColumn(AD_Element_ID="e4c09739-6370-19ca-fdeb-4cdf8025abb8",ColumnName="DateLastRun",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f9c8e066-fd79-4531-b0a2-c329f505fba3",
Synchronized="2023-03-22 18:57:02.0")
/** Column name DateLastRun */
public static final String COLUMNNAME_DateLastRun = "DateLastRun";
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
@XendraTrl(Identifier="3964e46e-35f1-432b-b12f-a749c16fbfe8")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3964e46e-35f1-432b-b12f-a749c16fbfe8",
Synchronized="2023-03-22 18:57:02.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set IsCosted.
@param IsCosted IsCosted */
public void setIsCosted (boolean IsCosted)
{
set_Value (COLUMNNAME_IsCosted, Boolean.valueOf(IsCosted));
}
/** Get IsCosted.
@return IsCosted */
public boolean isCosted() 
{
Object oo = get_Value(COLUMNNAME_IsCosted);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="a13f26e1-08eb-45ec-b81d-ce1de3cfe7d0")
public static String es_PE_COLUMN_IsCosted_Name="IsCosted";

@XendraColumn(AD_Element_ID="1d2cca33-7933-6933-e8cd-036ca4cb806e",ColumnName="IsCosted",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a13f26e1-08eb-45ec-b81d-ce1de3cfe7d0",
Synchronized="2023-04-19 21:53:04.0")
/** Column name IsCosted */
public static final String COLUMNNAME_IsCosted = "IsCosted";
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

@XendraTrl(Identifier="f6708b0d-d443-5198-a762-ca8f9d0a3667")
public static String es_PE_FIELD_Storage_AttributeSetInstance_Name="Instancia del Conjunto de Atributos";

@XendraTrl(Identifier="f6708b0d-d443-5198-a762-ca8f9d0a3667")
public static String es_PE_FIELD_Storage_AttributeSetInstance_Help="Valor actual de Instancia del conjunto de atributos del producto";

@XendraTrl(Identifier="f6708b0d-d443-5198-a762-ca8f9d0a3667")
public static String es_PE_FIELD_Storage_AttributeSetInstance_Description="Instancia del conjunto de atributos del producto";

@XendraField(AD_Column_ID="M_AttributeSetInstance_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2b54d21b-9e81-fa0f-765f-2e564a9f8623",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f6708b0d-d443-5198-a762-ca8f9d0a3667")
public static final String FIELDNAME_Storage_AttributeSetInstance="f6708b0d-d443-5198-a762-ca8f9d0a3667";

@XendraTrl(Identifier="bd1856ec-efb6-adfd-469e-ffc1ea0d11c6")
public static String es_PE_COLUMN_M_AttributeSetInstance_ID_Name="Instancia del Conjunto de Atributos";

@XendraColumn(AD_Element_ID="137807f2-3c52-e193-3ceb-f10b819cf955",
ColumnName="M_AttributeSetInstance_ID",AD_Reference_ID=35,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=true,
IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="bd1856ec-efb6-adfd-469e-ffc1ea0d11c6",Synchronized="2023-03-22 18:57:02.0")
/** Column name M_AttributeSetInstance_ID */
public static final String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";
/** Set Locator.
@param M_Locator_ID Warehouse Locator */
public void setM_Locator_ID (int M_Locator_ID)
{
if (M_Locator_ID < 1) throw new IllegalArgumentException ("M_Locator_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_Locator_ID, Integer.valueOf(M_Locator_ID));
}
/** Get Locator.
@return Warehouse Locator */
public int getM_Locator_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Locator_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="a99d5e2c-fbe0-cc2c-8f65-11382b8857c7")
public static String es_PE_FIELD_Storage_Locator_Name="Ubicación";

@XendraTrl(Identifier="a99d5e2c-fbe0-cc2c-8f65-11382b8857c7")
public static String es_PE_FIELD_Storage_Locator_Help="El ID de la ubicación indica en que parte del almacén se localiza el producto";

@XendraTrl(Identifier="a99d5e2c-fbe0-cc2c-8f65-11382b8857c7")
public static String es_PE_FIELD_Storage_Locator_Description="Ubicación de Almacén";

@XendraField(AD_Column_ID="M_Locator_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2b54d21b-9e81-fa0f-765f-2e564a9f8623",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a99d5e2c-fbe0-cc2c-8f65-11382b8857c7")
public static final String FIELDNAME_Storage_Locator="a99d5e2c-fbe0-cc2c-8f65-11382b8857c7";

@XendraTrl(Identifier="c719fe8b-a7be-52b1-1492-b4d24457e13e")
public static String es_PE_COLUMN_M_Locator_ID_Name="Ubicación";

@XendraColumn(AD_Element_ID="67f044ce-2864-93f9-fd0d-320945150933",ColumnName="M_Locator_ID",
AD_Reference_ID=31,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c719fe8b-a7be-52b1-1492-b4d24457e13e",
Synchronized="2023-03-22 18:57:02.0")
/** Column name M_Locator_ID */
public static final String COLUMNNAME_M_Locator_ID = "M_Locator_ID";
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

@XendraTrl(Identifier="2c2cde9b-2093-2ff1-543c-a19fbbc26193")
public static String es_PE_FIELD_Storage_Product_Name="Producto";

@XendraTrl(Identifier="2c2cde9b-2093-2ff1-543c-a19fbbc26193")
public static String es_PE_FIELD_Storage_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraTrl(Identifier="2c2cde9b-2093-2ff1-543c-a19fbbc26193")
public static String es_PE_FIELD_Storage_Product_Description="Producto; servicio ó artículo.";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2b54d21b-9e81-fa0f-765f-2e564a9f8623",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2c2cde9b-2093-2ff1-543c-a19fbbc26193")
public static final String FIELDNAME_Storage_Product="2c2cde9b-2093-2ff1-543c-a19fbbc26193";

@XendraTrl(Identifier="f9d1bc43-2b12-6a0d-3daf-bc3f0ac44a3f")
public static String es_PE_COLUMN_M_Product_ID_Name="Producto";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="4281f8eb-238e-6b28-eb66-8cc866e6312c",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="f9d1bc43-2b12-6a0d-3daf-bc3f0ac44a3f",Synchronized="2023-03-22 18:57:02.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
/** Set M_Storage.
@param M_Storage_ID M_Storage */
public void setM_Storage_ID (int M_Storage_ID)
{
if (M_Storage_ID <= 0) set_ValueNoCheck (COLUMNNAME_M_Storage_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_M_Storage_ID, Integer.valueOf(M_Storage_ID));
}
/** Get M_Storage.
@return M_Storage */
public int getM_Storage_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Storage_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name M_Storage_ID */
public static final String COLUMNNAME_M_Storage_ID = "M_Storage_ID";
/** Set On Hand Quantity.
@param QtyOnHand On Hand Quantity */
public void setQtyOnHand (BigDecimal QtyOnHand)
{
if (QtyOnHand == null) throw new IllegalArgumentException ("QtyOnHand is mandatory.");
set_ValueNoCheck (COLUMNNAME_QtyOnHand, QtyOnHand);
}
/** Get On Hand Quantity.
@return On Hand Quantity */
public BigDecimal getQtyOnHand() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_QtyOnHand);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="0af09c8d-b4f2-fe74-c333-627d54f20956")
public static String es_PE_FIELD_Storage_OnHandQuantity_Name="Cantidad en Existencia";

@XendraTrl(Identifier="0af09c8d-b4f2-fe74-c333-627d54f20956")
public static String es_PE_FIELD_Storage_OnHandQuantity_Help="La cantidad en existencia indica la cantidad de un producto que se encuentra en inventario";

@XendraTrl(Identifier="0af09c8d-b4f2-fe74-c333-627d54f20956")
public static String es_PE_FIELD_Storage_OnHandQuantity_Description="Cantidad en existencia";

@XendraField(AD_Column_ID="QtyOnHand",IsCentrallyMaintained=true,
AD_Tab_ID="2b54d21b-9e81-fa0f-765f-2e564a9f8623",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0af09c8d-b4f2-fe74-c333-627d54f20956")
public static final String FIELDNAME_Storage_OnHandQuantity="0af09c8d-b4f2-fe74-c333-627d54f20956";

@XendraTrl(Identifier="14b1064b-4e5e-7c39-d268-3b1bcecfd074")
public static String es_PE_COLUMN_QtyOnHand_Name="Cantidad en Existencia";

@XendraColumn(AD_Element_ID="491f8fda-42bc-512d-4b3c-2a1cad786e74",ColumnName="QtyOnHand",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="14b1064b-4e5e-7c39-d268-3b1bcecfd074",
Synchronized="2023-03-22 18:57:02.0")
/** Column name QtyOnHand */
public static final String COLUMNNAME_QtyOnHand = "QtyOnHand";
/** Set Ordered Quantity.
@param QtyOrdered Ordered Quantity */
public void setQtyOrdered (BigDecimal QtyOrdered)
{
if (QtyOrdered == null) throw new IllegalArgumentException ("QtyOrdered is mandatory.");
set_ValueNoCheck (COLUMNNAME_QtyOrdered, QtyOrdered);
}
/** Get Ordered Quantity.
@return Ordered Quantity */
public BigDecimal getQtyOrdered() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_QtyOrdered);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="86b07c6e-e298-82c2-e0a2-03a44b77c239")
public static String es_PE_FIELD_Storage_OrderedQuantity_Name="Cantidad Ordenada";

@XendraTrl(Identifier="86b07c6e-e298-82c2-e0a2-03a44b77c239")
public static String es_PE_FIELD_Storage_OrderedQuantity_Help="La Cantidad Ordenada indica la cantidad de un producto que fue ordenada";

@XendraTrl(Identifier="86b07c6e-e298-82c2-e0a2-03a44b77c239")
public static String es_PE_FIELD_Storage_OrderedQuantity_Description="Cantidad ordenada";

@XendraField(AD_Column_ID="QtyOrdered",IsCentrallyMaintained=true,
AD_Tab_ID="2b54d21b-9e81-fa0f-765f-2e564a9f8623",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="86b07c6e-e298-82c2-e0a2-03a44b77c239")
public static final String FIELDNAME_Storage_OrderedQuantity="86b07c6e-e298-82c2-e0a2-03a44b77c239";

@XendraTrl(Identifier="bac9e763-ca8e-9f00-4f62-38f37506c2d1")
public static String es_PE_COLUMN_QtyOrdered_Name="Cantidad Ordenada";

@XendraColumn(AD_Element_ID="2f601325-19ce-9544-d9df-693c76cbde8a",ColumnName="QtyOrdered",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bac9e763-ca8e-9f00-4f62-38f37506c2d1",
Synchronized="2023-03-22 18:57:02.0")
/** Column name QtyOrdered */
public static final String COLUMNNAME_QtyOrdered = "QtyOrdered";
/** Set Reserved Quantity.
@param QtyReserved Reserved Quantity */
public void setQtyReserved (BigDecimal QtyReserved)
{
if (QtyReserved == null) throw new IllegalArgumentException ("QtyReserved is mandatory.");
set_ValueNoCheck (COLUMNNAME_QtyReserved, QtyReserved);
}
/** Get Reserved Quantity.
@return Reserved Quantity */
public BigDecimal getQtyReserved() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_QtyReserved);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="c204b337-0291-eac0-cf89-f8ae8e81fddd")
public static String es_PE_FIELD_Storage_ReservedQuantity_Name="Cantidad Reservada";

@XendraTrl(Identifier="c204b337-0291-eac0-cf89-f8ae8e81fddd")
public static String es_PE_FIELD_Storage_ReservedQuantity_Help="La cantidad reservada indica la cantidad de un producto que se encuentra reservada para otras órdenes";

@XendraTrl(Identifier="c204b337-0291-eac0-cf89-f8ae8e81fddd")
public static String es_PE_FIELD_Storage_ReservedQuantity_Description="Cantidad reservada";

@XendraField(AD_Column_ID="QtyReserved",IsCentrallyMaintained=true,
AD_Tab_ID="2b54d21b-9e81-fa0f-765f-2e564a9f8623",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c204b337-0291-eac0-cf89-f8ae8e81fddd")
public static final String FIELDNAME_Storage_ReservedQuantity="c204b337-0291-eac0-cf89-f8ae8e81fddd";

@XendraTrl(Identifier="8e5b5e6e-7b96-94ff-4e6d-4c9443296341")
public static String es_PE_COLUMN_QtyReserved_Name="Cantidad Reservada";

@XendraColumn(AD_Element_ID="9e1b819d-9985-da9d-e2e7-a1fe07d429e4",ColumnName="QtyReserved",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8e5b5e6e-7b96-94ff-4e6d-4c9443296341",
Synchronized="2023-03-22 18:57:02.0")
/** Column name QtyReserved */
public static final String COLUMNNAME_QtyReserved = "QtyReserved";
}
