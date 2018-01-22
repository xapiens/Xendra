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
/** Generated Model for M_Lot
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_Lot extends PO
{
/** Standard Constructor
@param ctx context
@param M_Lot_ID id
@param trxName transaction
*/
public X_M_Lot (Properties ctx, int M_Lot_ID, String trxName)
{
super (ctx, M_Lot_ID, trxName);
/** if (M_Lot_ID == 0)
{
setM_Lot_ID (0);
setM_Product_ID (0);
setName (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_M_Lot (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=557 */
public static int Table_ID=MTable.getTable_ID("M_Lot");

@XendraTrl(Identifier="088a4d45-9a95-80e8-86bf-1fc9692fe080")
public static String es_PE_TAB_Lot_Description="Definición Lote de Producción";

@XendraTrl(Identifier="088a4d45-9a95-80e8-86bf-1fc9692fe080")
public static String es_PE_TAB_Lot_Name="Lote";

@XendraTrl(Identifier="088a4d45-9a95-80e8-86bf-1fc9692fe080")
public static String es_PE_TAB_Lot_Help="Mantener el Lote Individual de un Producto";

@XendraTab(Name="Lot",Description="Product Lot Definition",
Help="Maintain the individual Lot of a Product",
AD_Window_ID="2dad6553-3785-ddce-6dcf-8096c3e87f0e",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="088a4d45-9a95-80e8-86bf-1fc9692fe080",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Lot="088a4d45-9a95-80e8-86bf-1fc9692fe080";

@XendraTrl(Identifier="10523ec5-e455-e6ca-4994-10031f9b499c")
public static String es_PE_TABLE_M_Lot_Name="Lote";

@XendraTable(Name="Lot",Description="Product Lot Definition",Help="",TableName="M_Lot",
AccessLevel="3",AD_Window_ID="2dad6553-3785-ddce-6dcf-8096c3e87f0e",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=105,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.material",
Identifier="10523ec5-e455-e6ca-4994-10031f9b499c",Synchronized="2017-08-16 11:43:18.0")
/** TableName=M_Lot */
public static final String Table_Name="M_Lot";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_Lot");

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
    Table_ID = MTable.getTable_ID("M_Lot");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_Lot[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Date From.
@param DateFrom Starting date for a range */
public void setDateFrom (Timestamp DateFrom)
{
set_Value (COLUMNNAME_DateFrom, DateFrom);
}
/** Get Date From.
@return Starting date for a range */
public Timestamp getDateFrom() 
{
return (Timestamp)get_Value(COLUMNNAME_DateFrom);
}

@XendraTrl(Identifier="4b0c5146-6dac-85a6-77bb-112b0c91b5dd")
public static String es_PE_FIELD_Lot_DateFrom_Description="Fecha de inicio para un rango";

@XendraTrl(Identifier="4b0c5146-6dac-85a6-77bb-112b0c91b5dd")
public static String es_PE_FIELD_Lot_DateFrom_Help="La Fecha desde indica la fecha inicial de un rango";

@XendraTrl(Identifier="4b0c5146-6dac-85a6-77bb-112b0c91b5dd")
public static String es_PE_FIELD_Lot_DateFrom_Name="Desde Fecha";

@XendraField(AD_Column_ID="DateFrom",IsCentrallyMaintained=true,
AD_Tab_ID="088a4d45-9a95-80e8-86bf-1fc9692fe080",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4b0c5146-6dac-85a6-77bb-112b0c91b5dd")
public static final String FIELDNAME_Lot_DateFrom="4b0c5146-6dac-85a6-77bb-112b0c91b5dd";

@XendraTrl(Identifier="38412736-d54e-ac72-7677-6589c290ad7d")
public static String es_PE_COLUMN_DateFrom_Name="Desde Fecha";

@XendraColumn(AD_Element_ID="5bfdcbe1-cf4f-d7f7-c643-7a07f2907ae9",ColumnName="DateFrom",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="38412736-d54e-ac72-7677-6589c290ad7d",
Synchronized="2017-08-05 16:55:14.0")
/** Column name DateFrom */
public static final String COLUMNNAME_DateFrom = "DateFrom";
/** Set Date To.
@param DateTo End date of a date range */
public void setDateTo (Timestamp DateTo)
{
set_Value (COLUMNNAME_DateTo, DateTo);
}
/** Get Date To.
@return End date of a date range */
public Timestamp getDateTo() 
{
return (Timestamp)get_Value(COLUMNNAME_DateTo);
}

@XendraTrl(Identifier="d375a2f1-1d7f-dc96-e4c2-7bcd0836005b")
public static String es_PE_FIELD_Lot_DateTo_Description="Fecha final de un rango (inclusive)";

@XendraTrl(Identifier="d375a2f1-1d7f-dc96-e4c2-7bcd0836005b")
public static String es_PE_FIELD_Lot_DateTo_Help="La Fecha A indica la fecha final de un rango (inclusive)";

@XendraTrl(Identifier="d375a2f1-1d7f-dc96-e4c2-7bcd0836005b")
public static String es_PE_FIELD_Lot_DateTo_Name="A Fecha";
@XendraField(AD_Column_ID="DateTo",
IsCentrallyMaintained=true,AD_Tab_ID="088a4d45-9a95-80e8-86bf-1fc9692fe080",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=110,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="d375a2f1-1d7f-dc96-e4c2-7bcd0836005b")
public static final String FIELDNAME_Lot_DateTo="d375a2f1-1d7f-dc96-e4c2-7bcd0836005b";

@XendraTrl(Identifier="8292fc38-aa4c-d34d-232b-4fa40dc5bc96")
public static String es_PE_COLUMN_DateTo_Name="A Fecha";

@XendraColumn(AD_Element_ID="c98c05a0-7b58-ed8f-3e5b-fe1e1358ac38",ColumnName="DateTo",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8292fc38-aa4c-d34d-232b-4fa40dc5bc96",
Synchronized="2017-08-05 16:55:14.0")
/** Column name DateTo */
public static final String COLUMNNAME_DateTo = "DateTo";
/** Set Description.
@param Description Optional short DESCRIPTION of the record */
public void setDescription (String Description)
{
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

@XendraTrl(Identifier="48337ce0-0e2b-e2a1-78ce-3b0b6446770c")
public static String es_PE_FIELD_Lot_Description_Description="Observación";

@XendraTrl(Identifier="48337ce0-0e2b-e2a1-78ce-3b0b6446770c")
public static String es_PE_FIELD_Lot_Description_Help="Observación";

@XendraTrl(Identifier="48337ce0-0e2b-e2a1-78ce-3b0b6446770c")
public static String es_PE_FIELD_Lot_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="088a4d45-9a95-80e8-86bf-1fc9692fe080",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="48337ce0-0e2b-e2a1-78ce-3b0b6446770c")
public static final String FIELDNAME_Lot_Description="48337ce0-0e2b-e2a1-78ce-3b0b6446770c";

@XendraTrl(Identifier="2ecf06a6-2ce3-0785-9f66-30521e414ff8")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2ecf06a6-2ce3-0785-9f66-30521e414ff8",
Synchronized="2017-08-05 16:55:14.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Comment/Help.
@param Help Comment or Hint */
public void setHelp (String Help)
{
set_Value (COLUMNNAME_Help, Help);
}
/** Get Comment/Help.
@return Comment or Hint */
public String getHelp() 
{
String value = (String)get_Value(COLUMNNAME_Help);
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

@XendraTrl(Identifier="b1a22b75-ef74-fe95-b473-b800aa365435")
public static String es_PE_FIELD_Lot_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="b1a22b75-ef74-fe95-b473-b800aa365435")
public static String es_PE_FIELD_Lot_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraTrl(Identifier="b1a22b75-ef74-fe95-b473-b800aa365435")
public static String es_PE_FIELD_Lot_CommentHelp_Name="Ayuda";
@XendraField(AD_Column_ID="Help",
IsCentrallyMaintained=true,AD_Tab_ID="088a4d45-9a95-80e8-86bf-1fc9692fe080",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=80,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="b1a22b75-ef74-fe95-b473-b800aa365435")
public static final String FIELDNAME_Lot_CommentHelp="b1a22b75-ef74-fe95-b473-b800aa365435";

@XendraTrl(Identifier="a5613822-4a23-70fa-65a3-28c3a884ca95")
public static String es_PE_COLUMN_Help_Name="Ayuda";

@XendraColumn(AD_Element_ID="a6fda582-56f9-6bb7-8436-285ce4f8de3f",ColumnName="Help",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a5613822-4a23-70fa-65a3-28c3a884ca95",
Synchronized="2017-08-05 16:55:14.0")
/** Column name Help */
public static final String COLUMNNAME_Help = "Help";
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
@XendraTrl(Identifier="f5429437-fc9c-4224-a5e4-f8145dfc743a")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f5429437-fc9c-4224-a5e4-f8145dfc743a",
Synchronized="2017-08-05 16:55:14.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Lot Control.
@param M_LotCtl_ID Product Lot Control */
public void setM_LotCtl_ID (int M_LotCtl_ID)
{
if (M_LotCtl_ID <= 0) set_ValueNoCheck (COLUMNNAME_M_LotCtl_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_M_LotCtl_ID, Integer.valueOf(M_LotCtl_ID));
}
/** Get Lot Control.
@return Product Lot Control */
public int getM_LotCtl_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_LotCtl_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="0dce5bf8-1d3b-8a79-91b8-950502e41a2d")
public static String es_PE_FIELD_Lot_LotControl_Description="Control del lote del producto";

@XendraTrl(Identifier="0dce5bf8-1d3b-8a79-91b8-950502e41a2d")
public static String es_PE_FIELD_Lot_LotControl_Help="Definición para crear los números de lote para los productos";

@XendraTrl(Identifier="0dce5bf8-1d3b-8a79-91b8-950502e41a2d")
public static String es_PE_FIELD_Lot_LotControl_Name="Control de Lote";

@XendraField(AD_Column_ID="M_LotCtl_ID",IsCentrallyMaintained=true,
AD_Tab_ID="088a4d45-9a95-80e8-86bf-1fc9692fe080",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=50,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0dce5bf8-1d3b-8a79-91b8-950502e41a2d")
public static final String FIELDNAME_Lot_LotControl="0dce5bf8-1d3b-8a79-91b8-950502e41a2d";

@XendraTrl(Identifier="51d362e8-5578-aba2-75ff-7401114d0daf")
public static String es_PE_COLUMN_M_LotCtl_ID_Name="Control de Lote";

@XendraColumn(AD_Element_ID="6a406977-cd64-deed-60f0-660eddec6189",ColumnName="M_LotCtl_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="51d362e8-5578-aba2-75ff-7401114d0daf",
Synchronized="2017-08-05 16:55:14.0")
/** Column name M_LotCtl_ID */
public static final String COLUMNNAME_M_LotCtl_ID = "M_LotCtl_ID";
/** Set Lot.
@param M_Lot_ID Product Lot Definition */
public void setM_Lot_ID (int M_Lot_ID)
{
if (M_Lot_ID < 1) throw new IllegalArgumentException ("M_Lot_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_Lot_ID, Integer.valueOf(M_Lot_ID));
}
/** Get Lot.
@return Product Lot Definition */
public int getM_Lot_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Lot_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="a5f3f982-2e0f-dffa-ab6d-ea327dfd16a7")
public static String es_PE_FIELD_Lot_Lot_Description="Definición de lote de producto.";

@XendraTrl(Identifier="a5f3f982-2e0f-dffa-ab6d-ea327dfd16a7")
public static String es_PE_FIELD_Lot_Lot_Help="El lote individual de un producto. ";

@XendraTrl(Identifier="a5f3f982-2e0f-dffa-ab6d-ea327dfd16a7")
public static String es_PE_FIELD_Lot_Lot_Name="Lote";
@XendraField(AD_Column_ID="M_Lot_ID",
IsCentrallyMaintained=true,AD_Tab_ID="088a4d45-9a95-80e8-86bf-1fc9692fe080",AD_FieldGroup_ID="",
IsDisplayed=false,DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="a5f3f982-2e0f-dffa-ab6d-ea327dfd16a7")
public static final String FIELDNAME_Lot_Lot="a5f3f982-2e0f-dffa-ab6d-ea327dfd16a7";
/** Column name M_Lot_ID */
public static final String COLUMNNAME_M_Lot_ID = "M_Lot_ID";
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
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getM_Product_ID()));
}

@XendraTrl(Identifier="9144c0d7-dea0-cac3-3b44-db96807bb1fe")
public static String es_PE_FIELD_Lot_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="9144c0d7-dea0-cac3-3b44-db96807bb1fe")
public static String es_PE_FIELD_Lot_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraTrl(Identifier="9144c0d7-dea0-cac3-3b44-db96807bb1fe")
public static String es_PE_FIELD_Lot_Product_Name="Producto";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="088a4d45-9a95-80e8-86bf-1fc9692fe080",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9144c0d7-dea0-cac3-3b44-db96807bb1fe")
public static final String FIELDNAME_Lot_Product="9144c0d7-dea0-cac3-3b44-db96807bb1fe";

@XendraTrl(Identifier="d63252cd-8688-1a20-6f79-3165e09e26b0")
public static String es_PE_COLUMN_M_Product_ID_Name="Producto";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="4281f8eb-238e-6b28-eb66-8cc866e6312c",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=true,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="d63252cd-8688-1a20-6f79-3165e09e26b0",Synchronized="2017-08-05 16:55:14.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
/** Set Name.
@param Name Alphanumeric identifier of the entity */
public void setName (String Name)
{
if (Name == null) throw new IllegalArgumentException ("Name is mandatory.");
if (Name.length() > 60)
{
log.warning("Length > 60 - truncated");
Name = Name.substring(0,59);
}
set_Value (COLUMNNAME_Name, Name);
}
/** Get Name.
@return Alphanumeric identifier of the entity */
public String getName() 
{
String value = (String)get_Value(COLUMNNAME_Name);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="6c4c247c-7bf3-3b52-64ff-a9a4020f8bb0")
public static String es_PE_FIELD_Lot_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="6c4c247c-7bf3-3b52-64ff-a9a4020f8bb0")
public static String es_PE_FIELD_Lot_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="6c4c247c-7bf3-3b52-64ff-a9a4020f8bb0")
public static String es_PE_FIELD_Lot_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="088a4d45-9a95-80e8-86bf-1fc9692fe080",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=2,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="6c4c247c-7bf3-3b52-64ff-a9a4020f8bb0")
public static final String FIELDNAME_Lot_Name="6c4c247c-7bf3-3b52-64ff-a9a4020f8bb0";

@XendraTrl(Identifier="e013c97b-dd5a-b2e4-38f0-28b12af39859")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=2,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e013c97b-dd5a-b2e4-38f0-28b12af39859",
Synchronized="2017-08-05 16:55:14.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
}
