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
/** Generated Model for M_TransactionAllocation
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_TransactionAllocation extends PO
{
/** Standard Constructor
@param ctx context
@param M_TransactionAllocation_ID id
@param trxName transaction
*/
public X_M_TransactionAllocation (Properties ctx, int M_TransactionAllocation_ID, String trxName)
{
super (ctx, M_TransactionAllocation_ID, trxName);
/** if (M_TransactionAllocation_ID == 0)
{
setAllocationStrategyType (null);
setIsAllocated (false);	
// N
setIsManual (false);	
// N
setM_AttributeSetInstance_ID (0);
setM_Product_ID (0);
setM_Transaction_ID (0);
setQty (Env.ZERO);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_M_TransactionAllocation (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=636 */
public static int Table_ID=MTable.getTable_ID("M_TransactionAllocation");

@XendraTrl(Identifier="72249ad1-3085-fd06-3c48-d33733b06853")
public static String es_PE_TABLE_M_TransactionAllocation_Name="M_TransactionAllocation";


@XendraTable(Name="M_TransactionAllocation",AD_Package_ID="2809ac2d-7d43-20f8-05f0-a478f2e50204",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="M_TransactionAllocation",AccessLevel="1",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=0,
LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.material",
Identifier="72249ad1-3085-fd06-3c48-d33733b06853",Synchronized="2020-03-03 21:38:59.0")
/** TableName=M_TransactionAllocation */
public static final String Table_Name="M_TransactionAllocation";


@XendraIndex(Name="m_transactionallocation_prd",Identifier="f546477b-f989-cf64-9d72-8b6ed26cb4e9",
Column_Names="m_product_id, m_attributesetinstance_id, isallocated",IsUnique="false",
TableIdentifier="f546477b-f989-cf64-9d72-8b6ed26cb4e9",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_m_transactionallocation_prd = "f546477b-f989-cf64-9d72-8b6ed26cb4e9";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_TransactionAllocation");

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
    Table_ID = MTable.getTable_ID("M_TransactionAllocation");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_TransactionAllocation[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Allocation Strategy.
@param AllocationStrategyType Allocation Strategy */
public void setAllocationStrategyType (String AllocationStrategyType)
{
if (AllocationStrategyType.length() > 1)
{
log.warning("Length > 1 - truncated");
AllocationStrategyType = AllocationStrategyType.substring(0,0);
}
set_Value (COLUMNNAME_AllocationStrategyType, AllocationStrategyType);
}
/** Get Allocation Strategy.
@return Allocation Strategy */
public String getAllocationStrategyType() 
{
return (String)get_Value(COLUMNNAME_AllocationStrategyType);
}

@XendraTrl(Identifier="fb4e1fab-8a32-861a-9e78-3884b30d1873")
public static String es_PE_COLUMN_AllocationStrategyType_Name="Asignación de Estrategia";

@XendraColumn(AD_Element_ID="dc096f6e-05fe-dd7d-ad06-0d1ec3c276b9",
ColumnName="AllocationStrategyType",AD_Reference_ID=17,
AD_Reference_Value_ID="9148d9e2-9168-fae3-adbc-678718e7ce5f",AD_Val_Rule_ID="",FieldLength=1,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="fb4e1fab-8a32-861a-9e78-3884b30d1873",
Synchronized="2019-08-30 22:23:34.0")
/** Column name AllocationStrategyType */
public static final String COLUMNNAME_AllocationStrategyType = "AllocationStrategyType";
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
@XendraTrl(Identifier="b3c78f28-4f07-4c69-98c2-ee81ccbed356")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b3c78f28-4f07-4c69-98c2-ee81ccbed356",
Synchronized="2019-08-30 22:23:34.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Allocated.
@param IsAllocated Indicates if the payment has been allocated */
public void setIsAllocated (boolean IsAllocated)
{
set_Value (COLUMNNAME_IsAllocated, Boolean.valueOf(IsAllocated));
}
/** Get Allocated.
@return Indicates if the payment has been allocated */
public boolean isAllocated() 
{
Object oo = get_Value(COLUMNNAME_IsAllocated);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="d1380204-8f4f-00ac-d1f4-00d22c84b137")
public static String es_PE_COLUMN_IsAllocated_Name="Asignado";

@XendraColumn(AD_Element_ID="9e224a32-8f75-7921-819b-e891efaf4226",ColumnName="IsAllocated",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d1380204-8f4f-00ac-d1f4-00d22c84b137",
Synchronized="2019-08-30 22:23:34.0")
/** Column name IsAllocated */
public static final String COLUMNNAME_IsAllocated = "IsAllocated";
/** Set Manual.
@param IsManual This is a manual process */
public void setIsManual (boolean IsManual)
{
set_Value (COLUMNNAME_IsManual, Boolean.valueOf(IsManual));
}
/** Get Manual.
@return This is a manual process */
public boolean isManual() 
{
Object oo = get_Value(COLUMNNAME_IsManual);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="8f08ee83-b9df-b1e5-17ac-6bfdda2e3ddc")
public static String es_PE_COLUMN_IsManual_Name="Manual";

@XendraColumn(AD_Element_ID="064afee2-bc1c-12d9-20dc-97a2318dc359",ColumnName="IsManual",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8f08ee83-b9df-b1e5-17ac-6bfdda2e3ddc",
Synchronized="2019-08-30 22:23:34.0")
/** Column name IsManual */
public static final String COLUMNNAME_IsManual = "IsManual";
/** Set Attribute Set Instance.
@param M_AttributeSetInstance_ID Product Attribute Set Instance */
public void setM_AttributeSetInstance_ID (int M_AttributeSetInstance_ID)
{
if (M_AttributeSetInstance_ID < 0) throw new IllegalArgumentException ("M_AttributeSetInstance_ID is mandatory.");
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

@XendraTrl(Identifier="a03165aa-2034-22e5-a759-0e82b13c1bbe")
public static String es_PE_COLUMN_M_AttributeSetInstance_ID_Name="Instancia del Conjunto de Atributos";

@XendraColumn(AD_Element_ID="137807f2-3c52-e193-3ceb-f10b819cf955",
ColumnName="M_AttributeSetInstance_ID",AD_Reference_ID=35,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="a03165aa-2034-22e5-a759-0e82b13c1bbe",Synchronized="2019-08-30 22:23:34.0")
/** Column name M_AttributeSetInstance_ID */
public static final String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";
/** Set Shipment/Receipt Line.
@param M_InOutLine_ID Line on Shipment or Receipt document */
public void setM_InOutLine_ID (int M_InOutLine_ID)
{
if (M_InOutLine_ID <= 0) set_Value (COLUMNNAME_M_InOutLine_ID, null);
 else 
set_Value (COLUMNNAME_M_InOutLine_ID, Integer.valueOf(M_InOutLine_ID));
}
/** Get Shipment/Receipt Line.
@return Line on Shipment or Receipt document */
public int getM_InOutLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_InOutLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d0e4473a-998c-30db-e745-ab9d318b5fa7")
public static String es_PE_COLUMN_M_InOutLine_ID_Name="Línea Entrega / Recibo";

@XendraColumn(AD_Element_ID="a4d9928e-fbec-fd6c-b061-d3dbbd7de02c",ColumnName="M_InOutLine_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d0e4473a-998c-30db-e745-ab9d318b5fa7",
Synchronized="2019-08-30 22:23:34.0")
/** Column name M_InOutLine_ID */
public static final String COLUMNNAME_M_InOutLine_ID = "M_InOutLine_ID";
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

@XendraTrl(Identifier="75d84214-4dc8-df5a-cade-ca579c56a2c5")
public static String es_PE_COLUMN_M_InventoryLine_ID_Name="Línea de Inventario Físico";

@XendraColumn(AD_Element_ID="2c5571d8-3b1f-8721-db52-cae644155140",ColumnName="M_InventoryLine_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="75d84214-4dc8-df5a-cade-ca579c56a2c5",
Synchronized="2019-08-30 22:23:34.0")
/** Column name M_InventoryLine_ID */
public static final String COLUMNNAME_M_InventoryLine_ID = "M_InventoryLine_ID";
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

@XendraTrl(Identifier="6379b446-4da8-068c-597d-f79952c62aa5")
public static String es_PE_COLUMN_M_Product_ID_Name="Producto";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="4281f8eb-238e-6b28-eb66-8cc866e6312c",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="6379b446-4da8-068c-597d-f79952c62aa5",Synchronized="2019-08-30 22:23:34.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
/** Set Production Line.
@param M_ProductionLine_ID Document Line representing a production */
public void setM_ProductionLine_ID (int M_ProductionLine_ID)
{
if (M_ProductionLine_ID <= 0) set_Value (COLUMNNAME_M_ProductionLine_ID, null);
 else 
set_Value (COLUMNNAME_M_ProductionLine_ID, Integer.valueOf(M_ProductionLine_ID));
}
/** Get Production Line.
@return Document Line representing a production */
public int getM_ProductionLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_ProductionLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="39d0028a-a014-394d-3254-7be7ba699d34")
public static String es_PE_COLUMN_M_ProductionLine_ID_Name="Línea de Producción";

@XendraColumn(AD_Element_ID="cd41491f-514d-42fd-aaf9-36308e165c0b",
ColumnName="M_ProductionLine_ID",AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="39d0028a-a014-394d-3254-7be7ba699d34",Synchronized="2019-08-30 22:23:34.0")
/** Column name M_ProductionLine_ID */
public static final String COLUMNNAME_M_ProductionLine_ID = "M_ProductionLine_ID";
/** Set Inventory Transaction.
@param M_Transaction_ID Inventory Transaction */
public void setM_Transaction_ID (int M_Transaction_ID)
{
if (M_Transaction_ID < 1) throw new IllegalArgumentException ("M_Transaction_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_Transaction_ID, Integer.valueOf(M_Transaction_ID));
}
/** Get Inventory Transaction.
@return Inventory Transaction */
public int getM_Transaction_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Transaction_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="1810d8cb-ac53-2ccd-10a6-57c923c0e006")
public static String es_PE_COLUMN_M_Transaction_ID_Name="Transacción de Inventario";

@XendraColumn(AD_Element_ID="f5a7dcbf-becf-1bc2-2dd2-ee6fd51f398c",ColumnName="M_Transaction_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1810d8cb-ac53-2ccd-10a6-57c923c0e006",
Synchronized="2019-08-30 22:23:34.0")
/** Column name M_Transaction_ID */
public static final String COLUMNNAME_M_Transaction_ID = "M_Transaction_ID";
/** Set Out Shipment Line.
@param Out_M_InOutLine_ID Outgoing Shipment/Receipt */
public void setOut_M_InOutLine_ID (int Out_M_InOutLine_ID)
{
if (Out_M_InOutLine_ID <= 0) set_Value (COLUMNNAME_Out_M_InOutLine_ID, null);
 else 
set_Value (COLUMNNAME_Out_M_InOutLine_ID, Integer.valueOf(Out_M_InOutLine_ID));
}
/** Get Out Shipment Line.
@return Outgoing Shipment/Receipt */
public int getOut_M_InOutLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Out_M_InOutLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="3f7e2c78-4e05-ff9d-5426-4b6e10d362fa")
public static String es_PE_COLUMN_Out_M_InOutLine_ID_Name="Línea de Embarque Saliente";

@XendraColumn(AD_Element_ID="dc2f34ab-b4ad-737f-a2c8-47d2193ff6e2",ColumnName="Out_M_InOutLine_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="09bcaf38-49c7-0311-4a15-1296d9699294",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="3f7e2c78-4e05-ff9d-5426-4b6e10d362fa",Synchronized="2019-08-30 22:23:34.0")
/** Column name Out_M_InOutLine_ID */
public static final String COLUMNNAME_Out_M_InOutLine_ID = "Out_M_InOutLine_ID";
/** Set Out Inventory Line.
@param Out_M_InventoryLine_ID Outgoing Inventory Line */
public void setOut_M_InventoryLine_ID (int Out_M_InventoryLine_ID)
{
if (Out_M_InventoryLine_ID <= 0) set_Value (COLUMNNAME_Out_M_InventoryLine_ID, null);
 else 
set_Value (COLUMNNAME_Out_M_InventoryLine_ID, Integer.valueOf(Out_M_InventoryLine_ID));
}
/** Get Out Inventory Line.
@return Outgoing Inventory Line */
public int getOut_M_InventoryLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Out_M_InventoryLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="c7d9bed5-a5f8-a64d-03e1-4ff343489733")
public static String es_PE_COLUMN_Out_M_InventoryLine_ID_Name="Línea de Inventario Saliente";

@XendraColumn(AD_Element_ID="94819e26-8acb-5b6b-d1d3-6dff4102a5b2",
ColumnName="Out_M_InventoryLine_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="2b2adb14-50b2-7181-3248-cc0e81a55c1a",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="c7d9bed5-a5f8-a64d-03e1-4ff343489733",
Synchronized="2019-08-30 22:23:34.0")
/** Column name Out_M_InventoryLine_ID */
public static final String COLUMNNAME_Out_M_InventoryLine_ID = "Out_M_InventoryLine_ID";
/** Set Out Production Line.
@param Out_M_ProductionLine_ID Outgoing Production Line */
public void setOut_M_ProductionLine_ID (int Out_M_ProductionLine_ID)
{
if (Out_M_ProductionLine_ID <= 0) set_Value (COLUMNNAME_Out_M_ProductionLine_ID, null);
 else 
set_Value (COLUMNNAME_Out_M_ProductionLine_ID, Integer.valueOf(Out_M_ProductionLine_ID));
}
/** Get Out Production Line.
@return Outgoing Production Line */
public int getOut_M_ProductionLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Out_M_ProductionLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ef8ba54e-783c-90d4-f537-5835f8b6841e")
public static String es_PE_COLUMN_Out_M_ProductionLine_ID_Name="Línea de Producción Saliente";

@XendraColumn(AD_Element_ID="4a6f1ff6-1f1c-f993-bf53-8b05ab056642",
ColumnName="Out_M_ProductionLine_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="f699853b-860b-22cb-9641-da3d4d63523a",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="ef8ba54e-783c-90d4-f537-5835f8b6841e",
Synchronized="2019-08-30 22:23:34.0")
/** Column name Out_M_ProductionLine_ID */
public static final String COLUMNNAME_Out_M_ProductionLine_ID = "Out_M_ProductionLine_ID";
/** Set Out Transaction.
@param Out_M_Transaction_ID Outgoing Transaction */
public void setOut_M_Transaction_ID (int Out_M_Transaction_ID)
{
if (Out_M_Transaction_ID <= 0) set_Value (COLUMNNAME_Out_M_Transaction_ID, null);
 else 
set_Value (COLUMNNAME_Out_M_Transaction_ID, Integer.valueOf(Out_M_Transaction_ID));
}
/** Get Out Transaction.
@return Outgoing Transaction */
public int getOut_M_Transaction_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Out_M_Transaction_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="29e91689-68ef-38d7-c4f7-aa97bbb74e61")
public static String es_PE_COLUMN_Out_M_Transaction_ID_Name="Transacción Saliente";

@XendraColumn(AD_Element_ID="e55fa85b-788d-f72b-1cb5-0f5ef1bcfd8c",
ColumnName="Out_M_Transaction_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="859ed0e6-0ba2-1fb0-8b19-4bb3433e134c",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="29e91689-68ef-38d7-c4f7-aa97bbb74e61",
Synchronized="2019-08-30 22:23:34.0")
/** Column name Out_M_Transaction_ID */
public static final String COLUMNNAME_Out_M_Transaction_ID = "Out_M_Transaction_ID";
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

@XendraTrl(Identifier="54b2ae60-aa40-c267-e2ef-3f51e0254b61")
public static String es_PE_COLUMN_Qty_Name="Cantidad";

@XendraColumn(AD_Element_ID="c9d74a25-87c5-9592-5660-4f397607dad3",ColumnName="Qty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="54b2ae60-aa40-c267-e2ef-3f51e0254b61",
Synchronized="2019-08-30 22:23:34.0")
/** Column name Qty */
public static final String COLUMNNAME_Qty = "Qty";
}
