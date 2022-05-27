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
/** Generated Model for S_DocLine
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_S_DocLine extends PO
{
/** Standard Constructor
@param ctx context
@param S_DocLine_ID id
@param trxName transaction
*/
public X_S_DocLine (Properties ctx, int S_DocLine_ID, String trxName)
{
super (ctx, S_DocLine_ID, trxName);
/** if (S_DocLine_ID == 0)
{
setS_DocLine_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_S_DocLine (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000426 */
public static int Table_ID=MTable.getTable_ID("S_DocLine");

@XendraTrl(Identifier="98399d06-a400-4553-b442-12ded65ffdf4")
public static String es_PE_TABLE_S_DocLine_Name="Sunat Linea Documento";

@XendraTable(Name="Sunat Linea Documento",AD_Package_ID="2ac04657-d663-47c2-4ec1-927ad71f1e96",
AD_Plugin_ID="",Description="",Help="",TableName="S_DocLine",AccessLevel="3",AD_Window_ID="",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=false,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="",
Identifier="98399d06-a400-4553-b442-12ded65ffdf4",Synchronized="2022-05-26 15:01:57.0")
/** TableName=S_DocLine */
public static final String Table_Name="S_DocLine";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"S_DocLine");

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
    Table_ID = MTable.getTable_ID("S_DocLine");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_S_DocLine[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Currency.
@param C_Currency_ID The Currency for this record */
public void setC_Currency_ID (int C_Currency_ID)
{
if (C_Currency_ID <= 0) set_Value (COLUMNNAME_C_Currency_ID, null);
 else 
set_Value (COLUMNNAME_C_Currency_ID, Integer.valueOf(C_Currency_ID));
}
/** Get Currency.
@return The Currency for this record */
public int getC_Currency_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Currency_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="9212fdc5-5dc1-447d-9953-0715c7cc171a")
public static String es_PE_COLUMN_C_Currency_ID_Name="Currency";

@XendraColumn(AD_Element_ID="8daec488-bca2-50fe-f9de-abf0cba2a34a",ColumnName="C_Currency_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9212fdc5-5dc1-447d-9953-0715c7cc171a",
Synchronized="2022-05-26 14:58:02.0")
/** Column name C_Currency_ID */
public static final String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
/** Set Invoice Line.
@param C_InvoiceLine_ID Invoice Detail Line */
public void setC_InvoiceLine_ID (int C_InvoiceLine_ID)
{
if (C_InvoiceLine_ID <= 0) set_Value (COLUMNNAME_C_InvoiceLine_ID, null);
 else 
set_Value (COLUMNNAME_C_InvoiceLine_ID, Integer.valueOf(C_InvoiceLine_ID));
}
/** Get Invoice Line.
@return Invoice Detail Line */
public int getC_InvoiceLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_InvoiceLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="838e630a-1767-45e9-8f79-15d7d13bc067")
public static String es_PE_COLUMN_C_InvoiceLine_ID_Name="Invoice Line";

@XendraColumn(AD_Element_ID="56a4b078-1c5d-e08d-5d9d-847e94161779",ColumnName="C_InvoiceLine_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="838e630a-1767-45e9-8f79-15d7d13bc067",
Synchronized="2022-05-26 14:58:02.0")
/** Column name C_InvoiceLine_ID */
public static final String COLUMNNAME_C_InvoiceLine_ID = "C_InvoiceLine_ID";
/** Set Order.
@param C_Order_ID Order */
public void setC_Order_ID (int C_Order_ID)
{
if (C_Order_ID <= 0) set_Value (COLUMNNAME_C_Order_ID, null);
 else 
set_Value (COLUMNNAME_C_Order_ID, Integer.valueOf(C_Order_ID));
}
/** Get Order.
@return Order */
public int getC_Order_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Order_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d4f800da-c3ae-468d-b1b1-a4335dc237d8")
public static String es_PE_COLUMN_C_Order_ID_Name="Order";

@XendraColumn(AD_Element_ID="cc846c60-90b8-6aad-9d07-b5d0c0328787",ColumnName="C_Order_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d4f800da-c3ae-468d-b1b1-a4335dc237d8",
Synchronized="2022-05-26 14:58:02.0")
/** Column name C_Order_ID */
public static final String COLUMNNAME_C_Order_ID = "C_Order_ID";
/** Set C_Retention_ID.
@param C_Retention_ID C_Retention_ID */
public void setC_Retention_ID (int C_Retention_ID)
{
if (C_Retention_ID <= 0) set_Value (COLUMNNAME_C_Retention_ID, null);
 else 
set_Value (COLUMNNAME_C_Retention_ID, Integer.valueOf(C_Retention_ID));
}
/** Get C_Retention_ID.
@return C_Retention_ID */
public int getC_Retention_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Retention_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="12045d93-48a2-4725-867a-57dcf762936d")
public static String es_PE_COLUMN_C_Retention_ID_Name="C_Retention_ID";

@XendraColumn(AD_Element_ID="34bf1c97-eb1f-e9f1-9f30-087410de5caf",ColumnName="C_Retention_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="12045d93-48a2-4725-867a-57dcf762936d",
Synchronized="2022-05-26 14:58:02.0")
/** Column name C_Retention_ID */
public static final String COLUMNNAME_C_Retention_ID = "C_Retention_ID";
/** Set Tax.
@param C_Tax_ID Tax identifier */
public void setC_Tax_ID (int C_Tax_ID)
{
if (C_Tax_ID <= 0) set_Value (COLUMNNAME_C_Tax_ID, null);
 else 
set_Value (COLUMNNAME_C_Tax_ID, Integer.valueOf(C_Tax_ID));
}
/** Get Tax.
@return Tax identifier */
public int getC_Tax_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Tax_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="97f7b618-df0c-4873-b606-d7ba951ce82c")
public static String es_PE_COLUMN_C_Tax_ID_Name="Tax";

@XendraColumn(AD_Element_ID="38ff24fc-b68c-51a9-60f8-ef2a1f060de2",ColumnName="C_Tax_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="97f7b618-df0c-4873-b606-d7ba951ce82c",
Synchronized="2022-05-26 14:58:02.0")
/** Column name C_Tax_ID */
public static final String COLUMNNAME_C_Tax_ID = "C_Tax_ID";
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

@XendraTrl(Identifier="ff7d9ce2-8990-40bc-a9e5-f4089b30f851")
public static String es_PE_COLUMN_C_UOM_ID_Name="UOM";

@XendraColumn(AD_Element_ID="d0345019-4fcc-44c8-4fd1-e38e3b4adeed",ColumnName="C_UOM_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ff7d9ce2-8990-40bc-a9e5-f4089b30f851",
Synchronized="2022-05-26 14:58:02.0")
/** Column name C_UOM_ID */
public static final String COLUMNNAME_C_UOM_ID = "C_UOM_ID";
/** Set Description.
@param Description Optional short DESCRIPTION of the record */
public void setDescription (String Description)
{
if (Description != null && Description.length() > 100)
{
log.warning("Length > 100 - truncated");
Description = Description.substring(0,99);
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

@XendraTrl(Identifier="920aea04-1aeb-4082-b698-991aa5b288ce")
public static String es_PE_COLUMN_Description_Name="Description";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=100,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="920aea04-1aeb-4082-b698-991aa5b288ce",
Synchronized="2022-05-26 14:58:02.0")
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
@XendraTrl(Identifier="a23f7ca8-1cd8-4705-ae24-36644bafc856")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a23f7ca8-1cd8-4705-ae24-36644bafc856",
Synchronized="2022-05-26 14:58:02.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set id_external.
@param id_external id_external */
public void setid_external (String id_external)
{
if (id_external != null && id_external.length() > 50)
{
log.warning("Length > 50 - truncated");
id_external = id_external.substring(0,49);
}
set_Value (COLUMNNAME_id_external, id_external);
}
/** Get id_external.
@return id_external */
public String getid_external() 
{
String value = (String)get_Value(COLUMNNAME_id_external);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="a52ada53-f435-4f3b-a671-beb79046c288")
public static String es_PE_COLUMN_id_external_Name="id_external";

@XendraColumn(AD_Element_ID="be1861d9-e69c-45aa-9841-4d7ab0d4d788",ColumnName="id_external",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=50,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a52ada53-f435-4f3b-a671-beb79046c288",
Synchronized="2022-05-26 14:58:02.0")
/** Column name id_external */
public static final String COLUMNNAME_id_external = "id_external";
/** Set item_afectacion.
@param item_afectacion item_afectacion */
public void setitem_afectacion (String item_afectacion)
{
if (item_afectacion != null && item_afectacion.length() > 2)
{
log.warning("Length > 2 - truncated");
item_afectacion = item_afectacion.substring(0,1);
}
set_Value (COLUMNNAME_item_afectacion, item_afectacion);
}
/** Get item_afectacion.
@return item_afectacion */
public String getitem_afectacion() 
{
String value = (String)get_Value(COLUMNNAME_item_afectacion);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="b9fb5e69-ba4a-44fb-8132-caad53580223")
public static String es_PE_COLUMN_item_afectacion_Name="item_afectacion";

@XendraColumn(AD_Element_ID="03a9cafb-84ab-4527-956a-212c95b33513",ColumnName="item_afectacion",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b9fb5e69-ba4a-44fb-8132-caad53580223",
Synchronized="2022-05-26 14:58:02.0")
/** Column name item_afectacion */
public static final String COLUMNNAME_item_afectacion = "item_afectacion";
/** Set item_base_isc.
@param item_base_isc item_base_isc */
public void setitem_base_isc (BigDecimal item_base_isc)
{
set_Value (COLUMNNAME_item_base_isc, item_base_isc);
}
/** Get item_base_isc.
@return item_base_isc */
public BigDecimal getitem_base_isc() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_item_base_isc);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="04d5c8cf-fce4-46ad-8200-764f2d0b9bf2")
public static String es_PE_COLUMN_item_base_isc_Name="item_base_isc";

@XendraColumn(AD_Element_ID="284da0f0-567b-43fd-b3f8-24c0d1c92a31",ColumnName="item_base_isc",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="04d5c8cf-fce4-46ad-8200-764f2d0b9bf2",
Synchronized="2022-05-26 14:58:02.0")
/** Column name item_base_isc */
public static final String COLUMNNAME_item_base_isc = "item_base_isc";
/** Set item_base_otros_trib.
@param item_base_otros_trib item_base_otros_trib */
public void setitem_base_otros_trib (BigDecimal item_base_otros_trib)
{
set_Value (COLUMNNAME_item_base_otros_trib, item_base_otros_trib);
}
/** Get item_base_otros_trib.
@return item_base_otros_trib */
public BigDecimal getitem_base_otros_trib() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_item_base_otros_trib);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="c5a502a6-5544-4c10-82d3-edd76de50ee4")
public static String es_PE_COLUMN_item_base_otros_trib_Name="item_base_otros_trib";

@XendraColumn(AD_Element_ID="90cbd19c-06c4-47a3-8414-ddb014c13b7e",
ColumnName="item_base_otros_trib",AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=14,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="c5a502a6-5544-4c10-82d3-edd76de50ee4",Synchronized="2022-05-26 14:58:02.0")
/** Column name item_base_otros_trib */
public static final String COLUMNNAME_item_base_otros_trib = "item_base_otros_trib";
/** Set item_isc.
@param item_isc item_isc */
public void setitem_isc (String item_isc)
{
if (item_isc != null && item_isc.length() > 2)
{
log.warning("Length > 2 - truncated");
item_isc = item_isc.substring(0,1);
}
set_Value (COLUMNNAME_item_isc, item_isc);
}
/** Get item_isc.
@return item_isc */
public String getitem_isc() 
{
String value = (String)get_Value(COLUMNNAME_item_isc);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="59b92d35-50ce-48e8-b1d1-7247317c629c")
public static String es_PE_COLUMN_item_isc_Name="item_isc";

@XendraColumn(AD_Element_ID="546131e6-2e42-49a5-92db-eef218390ecb",ColumnName="item_isc",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="59b92d35-50ce-48e8-b1d1-7247317c629c",
Synchronized="2022-05-26 14:58:02.0")
/** Column name item_isc */
public static final String COLUMNNAME_item_isc = "item_isc";
/** Set item_rate_isc.
@param item_rate_isc item_rate_isc */
public void setitem_rate_isc (BigDecimal item_rate_isc)
{
set_Value (COLUMNNAME_item_rate_isc, item_rate_isc);
}
/** Get item_rate_isc.
@return item_rate_isc */
public BigDecimal getitem_rate_isc() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_item_rate_isc);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="3701102f-8524-4274-ac3a-9509859df66a")
public static String es_PE_COLUMN_item_rate_isc_Name="item_rate_isc";

@XendraColumn(AD_Element_ID="d859109c-115d-456d-bce9-7f5d9903e464",ColumnName="item_rate_isc",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3701102f-8524-4274-ac3a-9509859df66a",
Synchronized="2022-05-26 14:58:02.0")
/** Column name item_rate_isc */
public static final String COLUMNNAME_item_rate_isc = "item_rate_isc";
/** Set item_rate_otros_trib.
@param item_rate_otros_trib item_rate_otros_trib */
public void setitem_rate_otros_trib (BigDecimal item_rate_otros_trib)
{
set_Value (COLUMNNAME_item_rate_otros_trib, item_rate_otros_trib);
}
/** Get item_rate_otros_trib.
@return item_rate_otros_trib */
public BigDecimal getitem_rate_otros_trib() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_item_rate_otros_trib);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="a44f2d42-29d3-40b4-81a6-28beda536de0")
public static String es_PE_COLUMN_item_rate_otros_trib_Name="item_rate_otros_trib";

@XendraColumn(AD_Element_ID="bc7f86b4-de2a-4ccd-8aa2-40a29ae4cf4f",
ColumnName="item_rate_otros_trib",AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=14,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="a44f2d42-29d3-40b4-81a6-28beda536de0",Synchronized="2022-05-26 14:58:02.0")
/** Column name item_rate_otros_trib */
public static final String COLUMNNAME_item_rate_otros_trib = "item_rate_otros_trib";
/** Set item_ti_isc.
@param item_ti_isc item_ti_isc */
public void setitem_ti_isc (BigDecimal item_ti_isc)
{
set_Value (COLUMNNAME_item_ti_isc, item_ti_isc);
}
/** Get item_ti_isc.
@return item_ti_isc */
public BigDecimal getitem_ti_isc() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_item_ti_isc);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="6053a96a-3203-4347-b49b-6fadf81d4c4d")
public static String es_PE_COLUMN_item_ti_isc_Name="item_ti_isc";

@XendraColumn(AD_Element_ID="33ab2274-b7e5-465d-902b-161f8b829c51",ColumnName="item_ti_isc",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6053a96a-3203-4347-b49b-6fadf81d4c4d",
Synchronized="2022-05-26 14:58:02.0")
/** Column name item_ti_isc */
public static final String COLUMNNAME_item_ti_isc = "item_ti_isc";
/** Set item_ti_otros.
@param item_ti_otros item_ti_otros */
public void setitem_ti_otros (BigDecimal item_ti_otros)
{
set_Value (COLUMNNAME_item_ti_otros, item_ti_otros);
}
/** Get item_ti_otros.
@return item_ti_otros */
public BigDecimal getitem_ti_otros() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_item_ti_otros);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="e0dc7e7d-2222-4079-8eb0-f9c61280040b")
public static String es_PE_COLUMN_item_ti_otros_Name="item_ti_otros";

@XendraColumn(AD_Element_ID="a3306731-0707-4012-9dce-113db0a44819",ColumnName="item_ti_otros",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e0dc7e7d-2222-4079-8eb0-f9c61280040b",
Synchronized="2022-05-26 14:58:02.0")
/** Column name item_ti_otros */
public static final String COLUMNNAME_item_ti_otros = "item_ti_otros";
/** Set item_tipo_precio_venta.
@param item_tipo_precio_venta item_tipo_precio_venta */
public void setitem_tipo_precio_venta (String item_tipo_precio_venta)
{
if (item_tipo_precio_venta != null && item_tipo_precio_venta.length() > 2)
{
log.warning("Length > 2 - truncated");
item_tipo_precio_venta = item_tipo_precio_venta.substring(0,1);
}
set_Value (COLUMNNAME_item_tipo_precio_venta, item_tipo_precio_venta);
}
/** Get item_tipo_precio_venta.
@return item_tipo_precio_venta */
public String getitem_tipo_precio_venta() 
{
String value = (String)get_Value(COLUMNNAME_item_tipo_precio_venta);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="a0a6ed24-d673-4eeb-991d-1e5c27706474")
public static String es_PE_COLUMN_item_tipo_precio_venta_Name="item_tipo_precio_venta";

@XendraColumn(AD_Element_ID="96ad7b33-94ec-47c1-a437-a5900bda0514",
ColumnName="item_tipo_precio_venta",AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=2,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="a0a6ed24-d673-4eeb-991d-1e5c27706474",Synchronized="2022-05-26 14:58:02.0")
/** Column name item_tipo_precio_venta */
public static final String COLUMNNAME_item_tipo_precio_venta = "item_tipo_precio_venta";
/** Set item_total_tax.
@param item_total_tax item_total_tax */
public void setitem_total_tax (BigDecimal item_total_tax)
{
set_Value (COLUMNNAME_item_total_tax, item_total_tax);
}
/** Get item_total_tax.
@return item_total_tax */
public BigDecimal getitem_total_tax() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_item_total_tax);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="a2024881-05f0-4516-b616-ec367a0d903a")
public static String es_PE_COLUMN_item_total_tax_Name="item_total_tax";

@XendraColumn(AD_Element_ID="bd7bdacc-4f74-4389-a93e-15d3a5d8cb15",ColumnName="item_total_tax",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a2024881-05f0-4516-b616-ec367a0d903a",
Synchronized="2022-05-26 14:58:02.0")
/** Column name item_total_tax */
public static final String COLUMNNAME_item_total_tax = "item_total_tax";
/** Set item_tributo.
@param item_tributo item_tributo */
public void setitem_tributo (String item_tributo)
{
if (item_tributo != null && item_tributo.length() > 4)
{
log.warning("Length > 4 - truncated");
item_tributo = item_tributo.substring(0,3);
}
set_Value (COLUMNNAME_item_tributo, item_tributo);
}
/** Get item_tributo.
@return item_tributo */
public String getitem_tributo() 
{
String value = (String)get_Value(COLUMNNAME_item_tributo);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="cc1fbcdb-bad1-4e3f-86ff-2f35bdbc3fcc")
public static String es_PE_COLUMN_item_tributo_Name="item_tributo";

@XendraColumn(AD_Element_ID="15ee4016-dce2-4788-87aa-f55a27af86c5",ColumnName="item_tributo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=4,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cc1fbcdb-bad1-4e3f-86ff-2f35bdbc3fcc",
Synchronized="2022-05-26 14:58:02.0")
/** Column name item_tributo */
public static final String COLUMNNAME_item_tributo = "item_tributo";
/** Set linecurrency.
@param linecurrency linecurrency */
public void setlinecurrency (int linecurrency)
{
set_Value (COLUMNNAME_linecurrency, Integer.valueOf(linecurrency));
}
/** Get linecurrency.
@return linecurrency */
public int getlinecurrency() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_linecurrency);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="4c5e2da4-6d8a-4574-9c8f-5f99775d9b55")
public static String es_PE_COLUMN_linecurrency_Name="linecurrency";

@XendraColumn(AD_Element_ID="c942b153-2ba6-4a09-8ded-edec5b5a30cd",ColumnName="linecurrency",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4c5e2da4-6d8a-4574-9c8f-5f99775d9b55",
Synchronized="2022-05-26 14:58:02.0")
/** Column name linecurrency */
public static final String COLUMNNAME_linecurrency = "linecurrency";
/** Set Line Total.
@param LineTotalAmt Total line amount incl. Tax */
public void setLineTotalAmt (BigDecimal LineTotalAmt)
{
set_Value (COLUMNNAME_LineTotalAmt, LineTotalAmt);
}
/** Get Line Total.
@return Total line amount incl. Tax */
public BigDecimal getLineTotalAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_LineTotalAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="2db4d5db-fbc7-42af-9e90-b98f3d268fb6")
public static String es_PE_COLUMN_LineTotalAmt_Name="Line Total";

@XendraColumn(AD_Element_ID="582be6fc-dd62-5c60-3398-a0f8435f0670",ColumnName="LineTotalAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2db4d5db-fbc7-42af-9e90-b98f3d268fb6",
Synchronized="2022-05-26 14:58:02.0")
/** Column name LineTotalAmt */
public static final String COLUMNNAME_LineTotalAmt = "LineTotalAmt";
/** Set Product.
@param M_Product_ID Product, Service, Item */
public void setM_Product_ID (int M_Product_ID)
{
if (M_Product_ID <= 0) set_Value (COLUMNNAME_M_Product_ID, null);
 else 
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

@XendraTrl(Identifier="02035c0b-bac4-4505-ace8-c0cf34ab4094")
public static String es_PE_COLUMN_M_Product_ID_Name="Product";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="02035c0b-bac4-4505-ace8-c0cf34ab4094",
Synchronized="2022-05-26 14:58:02.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
/** Set PriceBase.
@param PriceBase PriceBase */
public void setPriceBase (BigDecimal PriceBase)
{
set_Value (COLUMNNAME_PriceBase, PriceBase);
}
/** Get PriceBase.
@return PriceBase */
public BigDecimal getPriceBase() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PriceBase);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="b2d00d16-a82e-47e2-8483-b6aa7223398b")
public static String es_PE_COLUMN_PriceBase_Name="PriceBase";

@XendraColumn(AD_Element_ID="2342314a-e1c4-dc0e-b83e-ec9a9a83fd0a",ColumnName="PriceBase",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b2d00d16-a82e-47e2-8483-b6aa7223398b",
Synchronized="2022-05-26 14:58:02.0")
/** Column name PriceBase */
public static final String COLUMNNAME_PriceBase = "PriceBase";
/** Set producttaxname.
@param producttaxname producttaxname */
public void setproducttaxname (String producttaxname)
{
if (producttaxname != null && producttaxname.length() > 100)
{
log.warning("Length > 100 - truncated");
producttaxname = producttaxname.substring(0,99);
}
set_Value (COLUMNNAME_producttaxname, producttaxname);
}
/** Get producttaxname.
@return producttaxname */
public String getproducttaxname() 
{
String value = (String)get_Value(COLUMNNAME_producttaxname);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="c02fb93b-4a75-40e6-9078-55e0676366a5")
public static String es_PE_COLUMN_producttaxname_Name="producttaxname";

@XendraColumn(AD_Element_ID="87608304-585e-4a76-bce2-391299d60708",ColumnName="producttaxname",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=100,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c02fb93b-4a75-40e6-9078-55e0676366a5",
Synchronized="2022-05-26 14:58:02.0")
/** Column name producttaxname */
public static final String COLUMNNAME_producttaxname = "producttaxname";
/** Set Quantity.
@param Qty Quantity */
public void setQty (BigDecimal Qty)
{
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

@XendraTrl(Identifier="ce9d0b54-7678-467d-957d-82d12af7c8a6")
public static String es_PE_COLUMN_Qty_Name="Quantity";

@XendraColumn(AD_Element_ID="c9d74a25-87c5-9592-5660-4f397607dad3",ColumnName="Qty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ce9d0b54-7678-467d-957d-82d12af7c8a6",
Synchronized="2022-05-26 14:58:02.0")
/** Column name Qty */
public static final String COLUMNNAME_Qty = "Qty";
/** Set S_DocHeader_ID.
@param S_DocHeader_ID S_DocHeader_ID */
public void setS_DocHeader_ID (int S_DocHeader_ID)
{
if (S_DocHeader_ID <= 0) set_Value (COLUMNNAME_S_DocHeader_ID, null);
 else 
set_Value (COLUMNNAME_S_DocHeader_ID, Integer.valueOf(S_DocHeader_ID));
}
/** Get S_DocHeader_ID.
@return S_DocHeader_ID */
public int getS_DocHeader_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_S_DocHeader_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="4bdeebb6-07f2-46e7-9f7c-fa1fa178667e")
public static String es_PE_COLUMN_S_DocHeader_ID_Name="S_DocHeader_ID";

@XendraColumn(AD_Element_ID="51cdf354-f5f5-4380-86e3-e1607a818626",ColumnName="S_DocHeader_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4bdeebb6-07f2-46e7-9f7c-fa1fa178667e",
Synchronized="2022-05-26 14:58:02.0")
/** Column name S_DocHeader_ID */
public static final String COLUMNNAME_S_DocHeader_ID = "S_DocHeader_ID";
/** Set Sunat Linea Documento.
@param S_DocLine_ID Sunat Linea Documento */
public void setS_DocLine_ID (int S_DocLine_ID)
{
if (S_DocLine_ID < 1) throw new IllegalArgumentException ("S_DocLine_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_S_DocLine_ID, Integer.valueOf(S_DocLine_ID));
}
/** Get Sunat Linea Documento.
@return Sunat Linea Documento */
public int getS_DocLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_S_DocLine_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name S_DocLine_ID */
public static final String COLUMNNAME_S_DocLine_ID = "S_DocLine_ID";
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

@XendraTrl(Identifier="9cce2659-5b77-4371-bda2-4c3d0fede16a")
public static String es_PE_COLUMN_SeqNo_Name="Sequence";

@XendraColumn(AD_Element_ID="38fa26fe-b59d-fce1-c129-420b57da738b",ColumnName="SeqNo",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9cce2659-5b77-4371-bda2-4c3d0fede16a",
Synchronized="2022-05-26 14:58:02.0")
/** Column name SeqNo */
public static final String COLUMNNAME_SeqNo = "SeqNo";
/** Set subtotal.
@param subtotal subtotal */
public void setsubtotal (BigDecimal subtotal)
{
set_Value (COLUMNNAME_subtotal, subtotal);
}
/** Get subtotal.
@return subtotal */
public BigDecimal getsubtotal() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_subtotal);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="28961169-c387-4641-bd1f-18b124b209a2")
public static String es_PE_COLUMN_subtotal_Name="subtotal";

@XendraColumn(AD_Element_ID="266bb414-9549-447c-9eb4-8532b537e88c",ColumnName="subtotal",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="28961169-c387-4641-bd1f-18b124b209a2",
Synchronized="2022-05-26 14:58:02.0")
/** Column name subtotal */
public static final String COLUMNNAME_subtotal = "subtotal";
/** Set taxamount.
@param taxamount taxamount */
public void settaxamount (BigDecimal taxamount)
{
set_Value (COLUMNNAME_taxamount, taxamount);
}
/** Get taxamount.
@return taxamount */
public BigDecimal gettaxamount() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_taxamount);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="0b9b360e-5077-4f9e-a453-0a765c4408bb")
public static String es_PE_COLUMN_taxamount_Name="taxamount";

@XendraColumn(AD_Element_ID="03cc7aee-c087-4125-846e-ecb9abdb7229",ColumnName="taxamount",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0b9b360e-5077-4f9e-a453-0a765c4408bb",
Synchronized="2022-05-26 14:58:02.0")
/** Column name taxamount */
public static final String COLUMNNAME_taxamount = "taxamount";
/** Set Tax base Amount.
@param TaxBaseAmt Base for calculating the tax amount */
public void setTaxBaseAmt (BigDecimal TaxBaseAmt)
{
set_Value (COLUMNNAME_TaxBaseAmt, TaxBaseAmt);
}
/** Get Tax base Amount.
@return Base for calculating the tax amount */
public BigDecimal getTaxBaseAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_TaxBaseAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="fa347cc3-ce81-4f32-b378-5a42acf7e6bf")
public static String es_PE_COLUMN_TaxBaseAmt_Name="Tax base Amount";

@XendraColumn(AD_Element_ID="11beb746-5f42-cac6-2ece-2c64fb573db9",ColumnName="TaxBaseAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fa347cc3-ce81-4f32-b378-5a42acf7e6bf",
Synchronized="2022-05-26 14:58:03.0")
/** Column name TaxBaseAmt */
public static final String COLUMNNAME_TaxBaseAmt = "TaxBaseAmt";
/** Set TaxEAmt.
@param TaxEAmt TaxEAmt */
public void setTaxEAmt (BigDecimal TaxEAmt)
{
set_Value (COLUMNNAME_TaxEAmt, TaxEAmt);
}
/** Get TaxEAmt.
@return TaxEAmt */
public BigDecimal getTaxEAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_TaxEAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="3e6999d9-8a93-4718-9f0a-7ae4cbf7b4c2")
public static String es_PE_COLUMN_TaxEAmt_Name="TaxEAmt";

@XendraColumn(AD_Element_ID="7e33da5c-6c24-4ebc-b60f-a0b20624c6dd",ColumnName="TaxEAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3e6999d9-8a93-4718-9f0a-7ae4cbf7b4c2",
Synchronized="2022-05-26 14:58:03.0")
/** Column name TaxEAmt */
public static final String COLUMNNAME_TaxEAmt = "TaxEAmt";
/** Set TaxEBaseAmt.
@param TaxEBaseAmt TaxEBaseAmt */
public void setTaxEBaseAmt (BigDecimal TaxEBaseAmt)
{
set_Value (COLUMNNAME_TaxEBaseAmt, TaxEBaseAmt);
}
/** Get TaxEBaseAmt.
@return TaxEBaseAmt */
public BigDecimal getTaxEBaseAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_TaxEBaseAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="4cc67657-63d2-4440-b19d-00db33054fe6")
public static String es_PE_COLUMN_TaxEBaseAmt_Name="TaxEBaseAmt";

@XendraColumn(AD_Element_ID="8058e42d-caae-49b4-b2a3-e1c7c9c8b29d",ColumnName="TaxEBaseAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4cc67657-63d2-4440-b19d-00db33054fe6",
Synchronized="2022-05-26 14:58:03.0")
/** Column name TaxEBaseAmt */
public static final String COLUMNNAME_TaxEBaseAmt = "TaxEBaseAmt";
/** Set TaxGAmt.
@param TaxGAmt TaxGAmt */
public void setTaxGAmt (BigDecimal TaxGAmt)
{
set_Value (COLUMNNAME_TaxGAmt, TaxGAmt);
}
/** Get TaxGAmt.
@return TaxGAmt */
public BigDecimal getTaxGAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_TaxGAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="681ebb8d-d8df-4486-98fb-cdf708706018")
public static String es_PE_COLUMN_TaxGAmt_Name="TaxGAmt";

@XendraColumn(AD_Element_ID="d2526d19-e08e-457b-8aad-76cfe049cb57",ColumnName="TaxGAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="681ebb8d-d8df-4486-98fb-cdf708706018",
Synchronized="2022-05-26 14:58:03.0")
/** Column name TaxGAmt */
public static final String COLUMNNAME_TaxGAmt = "TaxGAmt";
/** Set TaxGBaseAmt.
@param TaxGBaseAmt TaxGBaseAmt */
public void setTaxGBaseAmt (BigDecimal TaxGBaseAmt)
{
set_Value (COLUMNNAME_TaxGBaseAmt, TaxGBaseAmt);
}
/** Get TaxGBaseAmt.
@return TaxGBaseAmt */
public BigDecimal getTaxGBaseAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_TaxGBaseAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="48579bc3-2cb0-4ded-804e-80dc56894655")
public static String es_PE_COLUMN_TaxGBaseAmt_Name="TaxGBaseAmt";

@XendraColumn(AD_Element_ID="f6997c57-a91d-4160-a11e-4711fc19fe96",ColumnName="TaxGBaseAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="48579bc3-2cb0-4ded-804e-80dc56894655",
Synchronized="2022-05-26 14:58:03.0")
/** Column name TaxGBaseAmt */
public static final String COLUMNNAME_TaxGBaseAmt = "TaxGBaseAmt";
/** Set TaxOAmt.
@param TaxOAmt TaxOAmt */
public void setTaxOAmt (BigDecimal TaxOAmt)
{
set_Value (COLUMNNAME_TaxOAmt, TaxOAmt);
}
/** Get TaxOAmt.
@return TaxOAmt */
public BigDecimal getTaxOAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_TaxOAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="5f81d35f-8afd-4861-9293-3bc1508074da")
public static String es_PE_COLUMN_TaxOAmt_Name="TaxOAmt";

@XendraColumn(AD_Element_ID="56d74915-3401-42b2-80b8-6c12afeafd74",ColumnName="TaxOAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5f81d35f-8afd-4861-9293-3bc1508074da",
Synchronized="2022-05-26 14:58:03.0")
/** Column name TaxOAmt */
public static final String COLUMNNAME_TaxOAmt = "TaxOAmt";
/** Set TaxOBaseAmt.
@param TaxOBaseAmt TaxOBaseAmt */
public void setTaxOBaseAmt (BigDecimal TaxOBaseAmt)
{
set_Value (COLUMNNAME_TaxOBaseAmt, TaxOBaseAmt);
}
/** Get TaxOBaseAmt.
@return TaxOBaseAmt */
public BigDecimal getTaxOBaseAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_TaxOBaseAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="b4171c4f-5977-40f7-ac6c-719e7794d5d3")
public static String es_PE_COLUMN_TaxOBaseAmt_Name="TaxOBaseAmt";

@XendraColumn(AD_Element_ID="6768bce5-1444-439e-a1cb-d182ea0e8d70",ColumnName="TaxOBaseAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b4171c4f-5977-40f7-ac6c-719e7794d5d3",
Synchronized="2022-05-26 14:58:03.0")
/** Column name TaxOBaseAmt */
public static final String COLUMNNAME_TaxOBaseAmt = "TaxOBaseAmt";
/** Set taxrate.
@param taxrate taxrate */
public void settaxrate (BigDecimal taxrate)
{
set_Value (COLUMNNAME_taxrate, taxrate);
}
/** Get taxrate.
@return taxrate */
public BigDecimal gettaxrate() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_taxrate);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="9c905a8a-0ffe-4393-b32a-25fe530dac79")
public static String es_PE_COLUMN_taxrate_Name="taxrate";

@XendraColumn(AD_Element_ID="7b5325ce-1e10-4cc6-ba78-ab2f1c549779",ColumnName="taxrate",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9c905a8a-0ffe-4393-b32a-25fe530dac79",
Synchronized="2022-05-26 14:58:03.0")
/** Column name taxrate */
public static final String COLUMNNAME_taxrate = "taxrate";
/** Set TaxSAmt.
@param TaxSAmt TaxSAmt */
public void setTaxSAmt (BigDecimal TaxSAmt)
{
set_Value (COLUMNNAME_TaxSAmt, TaxSAmt);
}
/** Get TaxSAmt.
@return TaxSAmt */
public BigDecimal getTaxSAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_TaxSAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="b009845d-e315-441c-ab3b-a0a359780779")
public static String es_PE_COLUMN_TaxSAmt_Name="TaxSAmt";

@XendraColumn(AD_Element_ID="51c33672-c264-41c2-a93a-8d367a6b76a7",ColumnName="TaxSAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b009845d-e315-441c-ab3b-a0a359780779",
Synchronized="2022-05-26 14:58:03.0")
/** Column name TaxSAmt */
public static final String COLUMNNAME_TaxSAmt = "TaxSAmt";
/** Set TaxSBaseAmt.
@param TaxSBaseAmt TaxSBaseAmt */
public void setTaxSBaseAmt (BigDecimal TaxSBaseAmt)
{
set_Value (COLUMNNAME_TaxSBaseAmt, TaxSBaseAmt);
}
/** Get TaxSBaseAmt.
@return TaxSBaseAmt */
public BigDecimal getTaxSBaseAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_TaxSBaseAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="0d1179a0-5c13-4c30-a469-4d93e2e2c36d")
public static String es_PE_COLUMN_TaxSBaseAmt_Name="TaxSBaseAmt";

@XendraColumn(AD_Element_ID="af2d1acb-cd39-436c-9c32-664dd471b158",ColumnName="TaxSBaseAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0d1179a0-5c13-4c30-a469-4d93e2e2c36d",
Synchronized="2022-05-26 14:58:03.0")
/** Column name TaxSBaseAmt */
public static final String COLUMNNAME_TaxSBaseAmt = "TaxSBaseAmt";
/** Set TaxTAmt.
@param TaxTAmt TaxTAmt */
public void setTaxTAmt (BigDecimal TaxTAmt)
{
set_Value (COLUMNNAME_TaxTAmt, TaxTAmt);
}
/** Get TaxTAmt.
@return TaxTAmt */
public BigDecimal getTaxTAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_TaxTAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="f71e1cd1-9f81-4bff-a4ab-673f3284b7a8")
public static String es_PE_COLUMN_TaxTAmt_Name="TaxTAmT";

@XendraColumn(AD_Element_ID="2b639e87-3957-4dc4-8169-d6c42a4a2bf8",ColumnName="TaxTAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f71e1cd1-9f81-4bff-a4ab-673f3284b7a8",
Synchronized="2022-05-26 14:58:03.0")
/** Column name TaxTAmt */
public static final String COLUMNNAME_TaxTAmt = "TaxTAmt";
/** Set TaxTBaseAmt.
@param TaxTBaseAmt TaxTBaseAmt */
public void setTaxTBaseAmt (BigDecimal TaxTBaseAmt)
{
set_Value (COLUMNNAME_TaxTBaseAmt, TaxTBaseAmt);
}
/** Get TaxTBaseAmt.
@return TaxTBaseAmt */
public BigDecimal getTaxTBaseAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_TaxTBaseAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="c31cfc2a-389a-4920-bf08-0e5a4c6e2d66")
public static String es_PE_COLUMN_TaxTBaseAmt_Name="TaxTBaseAmt";

@XendraColumn(AD_Element_ID="df91e11c-b68a-4684-96f7-784d1b416577",ColumnName="TaxTBaseAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c31cfc2a-389a-4920-bf08-0e5a4c6e2d66",
Synchronized="2022-05-26 14:58:03.0")
/** Column name TaxTBaseAmt */
public static final String COLUMNNAME_TaxTBaseAmt = "TaxTBaseAmt";
/** Set TaxZAmt.
@param TaxZAmt TaxZAmt */
public void setTaxZAmt (BigDecimal TaxZAmt)
{
set_Value (COLUMNNAME_TaxZAmt, TaxZAmt);
}
/** Get TaxZAmt.
@return TaxZAmt */
public BigDecimal getTaxZAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_TaxZAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="0fe6ca9f-0148-4ebd-bd1f-06241d7a8bd5")
public static String es_PE_COLUMN_TaxZAmt_Name="TaxZAmt";

@XendraColumn(AD_Element_ID="562bff5a-40de-47e2-a2a8-57577cec1b22",ColumnName="TaxZAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0fe6ca9f-0148-4ebd-bd1f-06241d7a8bd5",
Synchronized="2022-05-26 14:58:03.0")
/** Column name TaxZAmt */
public static final String COLUMNNAME_TaxZAmt = "TaxZAmt";
/** Set TaxZBaseAmt.
@param TaxZBaseAmt TaxZBaseAmt */
public void setTaxZBaseAmt (BigDecimal TaxZBaseAmt)
{
set_Value (COLUMNNAME_TaxZBaseAmt, TaxZBaseAmt);
}
/** Get TaxZBaseAmt.
@return TaxZBaseAmt */
public BigDecimal getTaxZBaseAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_TaxZBaseAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="971f89d0-620d-4812-ad83-ecc9f2652e62")
public static String es_PE_COLUMN_TaxZBaseAmt_Name="TaxZBaseAmt";

@XendraColumn(AD_Element_ID="e59b8279-4614-43d8-80fe-aeb4a55767f0",ColumnName="TaxZBaseAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="971f89d0-620d-4812-ad83-ecc9f2652e62",
Synchronized="2022-05-26 14:58:03.0")
/** Column name TaxZBaseAmt */
public static final String COLUMNNAME_TaxZBaseAmt = "TaxZBaseAmt";
/** Set venta_noonerosa.
@param venta_noonerosa venta_noonerosa */
public void setventa_noonerosa (BigDecimal venta_noonerosa)
{
set_Value (COLUMNNAME_venta_noonerosa, venta_noonerosa);
}
/** Get venta_noonerosa.
@return venta_noonerosa */
public BigDecimal getventa_noonerosa() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_venta_noonerosa);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="59f5f3b9-84d4-4b0c-9ce8-26389b803c5e")
public static String es_PE_COLUMN_venta_noonerosa_Name="venta_noonerosa";

@XendraColumn(AD_Element_ID="7cef3708-3d98-4d4e-9180-9242ebf9f257",ColumnName="venta_noonerosa",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="59f5f3b9-84d4-4b0c-9ce8-26389b803c5e",
Synchronized="2022-05-26 14:58:03.0")
/** Column name venta_noonerosa */
public static final String COLUMNNAME_venta_noonerosa = "venta_noonerosa";
}
