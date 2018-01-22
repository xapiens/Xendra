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
/** Generated Model for M_DistributionRunLine
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_DistributionRunLine extends PO
{
/** Standard Constructor
@param ctx context
@param M_DistributionRunLine_ID id
@param trxName transaction
*/
public X_M_DistributionRunLine (Properties ctx, int M_DistributionRunLine_ID, String trxName)
{
super (ctx, M_DistributionRunLine_ID, trxName);
/** if (M_DistributionRunLine_ID == 0)
{
setLine (0);	
// @SQL=SELECT COALESCE(MAX(Line),0)+10 AS DefaultValue FROM M_DistributionRunLine WHERE M_DistributionRun_ID=@M_DistributionRun_ID@
setM_DistributionList_ID (0);
setM_DistributionRun_ID (0);
setM_DistributionRunLine_ID (0);
setMinQty (Env.ZERO);	
// 0
setM_Product_ID (0);
setTotalQty (Env.ZERO);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_M_DistributionRunLine (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=713 */
public static int Table_ID=MTable.getTable_ID("M_DistributionRunLine");

@XendraTrl(Identifier="866fedd8-4eb9-c89e-e0a3-296bf7b3c403")
public static String es_PE_TAB_Line_Description="Los Ìtems del funcionamiento de la distribución definen la lista de distribución, el producto y cantidades";

@XendraTrl(Identifier="866fedd8-4eb9-c89e-e0a3-296bf7b3c403")
public static String es_PE_TAB_Line_Name="Línea";

@XendraTrl(Identifier="866fedd8-4eb9-c89e-e0a3-296bf7b3c403")
public static String es_PE_TAB_Line_Help="La cantidad de la orden se basa en el mayor de los mínimos de la lista del producto ó de distribución y de la cantidad basada en el cociente.";

@XendraTab(Name="Line",
Description="Distribution Run Lines define Distribution List, the Product and Quantiries",
Help="The order amount is based on the greater of the minimums of the product or distribution list and the quantity based on the ratio.",
AD_Window_ID="ed3d93df-76c1-5e54-7703-bc1fceeb5bd1",SeqNo=20,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="866fedd8-4eb9-c89e-e0a3-296bf7b3c403",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Line="866fedd8-4eb9-c89e-e0a3-296bf7b3c403";

@XendraTrl(Identifier="8c3c2288-cd92-a442-8a07-269eb90be1e4")
public static String es_PE_TABLE_M_DistributionRunLine_Name="Línea Lista de Distribución";


@XendraTable(Name="Distribution Run Line",
Description="Distribution Run Lines define Distribution List, the Product and Quantiries",Help="",
TableName="M_DistributionRunLine",AccessLevel="3",
AD_Window_ID="ed3d93df-76c1-5e54-7703-bc1fceeb5bd1",AD_Val_Rule_ID="",IsKey=1,LoadSeq=140,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.material",Identifier="8c3c2288-cd92-a442-8a07-269eb90be1e4",
Synchronized="2017-08-16 11:43:10.0")
/** TableName=M_DistributionRunLine */
public static final String Table_Name="M_DistributionRunLine";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_DistributionRunLine");

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
    Table_ID = MTable.getTable_ID("M_DistributionRunLine");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_DistributionRunLine[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="1c1cc2db-5e5c-30d8-3378-ed8f373a4fb4")
public static String es_PE_FIELD_Line_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="1c1cc2db-5e5c-30d8-3378-ed8f373a4fb4")
public static String es_PE_FIELD_Line_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="1c1cc2db-5e5c-30d8-3378-ed8f373a4fb4")
public static String es_PE_FIELD_Line_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="866fedd8-4eb9-c89e-e0a3-296bf7b3c403",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1c1cc2db-5e5c-30d8-3378-ed8f373a4fb4")
public static final String FIELDNAME_Line_Description="1c1cc2db-5e5c-30d8-3378-ed8f373a4fb4";

@XendraTrl(Identifier="d8b7aab8-7302-3811-2486-e16dd849bcc7")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d8b7aab8-7302-3811-2486-e16dd849bcc7",
Synchronized="2017-08-05 16:55:06.0")
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
@XendraTrl(Identifier="4c355342-3678-4033-b8bf-431efef44cd6")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4c355342-3678-4033-b8bf-431efef44cd6",
Synchronized="2017-08-05 16:55:06.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Line No.
@param Line Unique line for this document */
public void setLine (int Line)
{
set_Value (COLUMNNAME_Line, Integer.valueOf(Line));
}
/** Get Line No.
@return Unique line for this document */
public int getLine() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Line);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="0f4ecabe-0505-0993-4b01-4052520b452f")
public static String es_PE_FIELD_Line_LineNo_Description="No. Línea único para este documento";

@XendraTrl(Identifier="0f4ecabe-0505-0993-4b01-4052520b452f")
public static String es_PE_FIELD_Line_LineNo_Help="Indica el No. Línea para un documento. También controlará el orden de despliegue de las líneas dentro de un documento";

@XendraTrl(Identifier="0f4ecabe-0505-0993-4b01-4052520b452f")
public static String es_PE_FIELD_Line_LineNo_Name="No. Línea";
@XendraField(AD_Column_ID="Line",
IsCentrallyMaintained=true,AD_Tab_ID="866fedd8-4eb9-c89e-e0a3-296bf7b3c403",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=50,SortNo=1,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="0f4ecabe-0505-0993-4b01-4052520b452f")
public static final String FIELDNAME_Line_LineNo="0f4ecabe-0505-0993-4b01-4052520b452f";

@XendraTrl(Identifier="b702f93b-3f35-1379-a5f8-39736ecfbb3d")
public static String es_PE_COLUMN_Line_Name="No. Línea";

@XendraColumn(AD_Element_ID="986ef077-61da-f9cf-1c6d-aefe3a35113b",ColumnName="Line",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="@SQL=SELECT COALESCE(MAX(Line),0)+10 AS DefaultValue FROM M_DistributionRunLine WHERE M_DistributionRun_ID=@M_DistributionRun_ID@",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=2,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b702f93b-3f35-1379-a5f8-39736ecfbb3d",
Synchronized="2017-08-05 16:55:06.0")
/** Column name Line */
public static final String COLUMNNAME_Line = "Line";
/** Set Distribution List.
@param M_DistributionList_ID Distribution Lists allow to distribute products to a selected list of partners */
public void setM_DistributionList_ID (int M_DistributionList_ID)
{
if (M_DistributionList_ID < 1) throw new IllegalArgumentException ("M_DistributionList_ID is mandatory.");
set_Value (COLUMNNAME_M_DistributionList_ID, Integer.valueOf(M_DistributionList_ID));
}
/** Get Distribution List.
@return Distribution Lists allow to distribute products to a selected list of partners */
public int getM_DistributionList_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_DistributionList_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="c5ee1efb-3108-d3ff-5f27-7840e28a0420")
public static String es_PE_FIELD_Line_DistributionList_Description="Las listas de distribución permiten para distribuir productos a una lista seleccionada de socios.";

@XendraTrl(Identifier="c5ee1efb-3108-d3ff-5f27-7840e28a0420")
public static String es_PE_FIELD_Line_DistributionList_Help="La lista de distribución contiene socios de negocio y una cantidad ó un cociente de la distribución para crear órdenes.";

@XendraTrl(Identifier="c5ee1efb-3108-d3ff-5f27-7840e28a0420")
public static String es_PE_FIELD_Line_DistributionList_Name="Lista de Distribución";

@XendraField(AD_Column_ID="M_DistributionList_ID",IsCentrallyMaintained=true,
AD_Tab_ID="866fedd8-4eb9-c89e-e0a3-296bf7b3c403",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c5ee1efb-3108-d3ff-5f27-7840e28a0420")
public static final String FIELDNAME_Line_DistributionList="c5ee1efb-3108-d3ff-5f27-7840e28a0420";

@XendraTrl(Identifier="2bd54ad3-5325-3968-9ca7-9d198e973b03")
public static String es_PE_COLUMN_M_DistributionList_ID_Name="Lista de Distribución";

@XendraColumn(AD_Element_ID="21142264-c420-5fa7-6238-fa3db90a45a8",
ColumnName="M_DistributionList_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="2bd54ad3-5325-3968-9ca7-9d198e973b03",Synchronized="2017-08-05 16:55:06.0")
/** Column name M_DistributionList_ID */
public static final String COLUMNNAME_M_DistributionList_ID = "M_DistributionList_ID";
/** Set Distribution Run.
@param M_DistributionRun_ID Distribution Run create Orders to distribute products to a selected list of partners */
public void setM_DistributionRun_ID (int M_DistributionRun_ID)
{
if (M_DistributionRun_ID < 1) throw new IllegalArgumentException ("M_DistributionRun_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_DistributionRun_ID, Integer.valueOf(M_DistributionRun_ID));
}
/** Get Distribution Run.
@return Distribution Run create Orders to distribute products to a selected list of partners */
public int getM_DistributionRun_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_DistributionRun_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getM_DistributionRun_ID()));
}

@XendraTrl(Identifier="b647a328-1dbd-1cd8-ff7c-db2ae515dd16")
public static String es_PE_FIELD_Line_DistributionRun_Description="El funcionamiento de la distribución crea órdenes para distribuir productos a una lista seleccionada de socios.";

@XendraTrl(Identifier="b647a328-1dbd-1cd8-ff7c-db2ae515dd16")
public static String es_PE_FIELD_Line_DistributionRun_Help="El funcionamiento de la distribución define cómo se crean las órdenes basadas en listas de distribución.";

@XendraTrl(Identifier="b647a328-1dbd-1cd8-ff7c-db2ae515dd16")
public static String es_PE_FIELD_Line_DistributionRun_Name="Corrida de Distribución";

@XendraField(AD_Column_ID="M_DistributionRun_ID",IsCentrallyMaintained=true,
AD_Tab_ID="866fedd8-4eb9-c89e-e0a3-296bf7b3c403",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b647a328-1dbd-1cd8-ff7c-db2ae515dd16")
public static final String FIELDNAME_Line_DistributionRun="b647a328-1dbd-1cd8-ff7c-db2ae515dd16";

@XendraTrl(Identifier="8f67c1b6-b288-dc04-749d-79eb01ed333f")
public static String es_PE_COLUMN_M_DistributionRun_ID_Name="Corrida de Distribución";

@XendraColumn(AD_Element_ID="e70572d6-d2f0-46bb-1e9a-9e50951d7fa5",
ColumnName="M_DistributionRun_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="8f67c1b6-b288-dc04-749d-79eb01ed333f",Synchronized="2017-08-05 16:55:06.0")
/** Column name M_DistributionRun_ID */
public static final String COLUMNNAME_M_DistributionRun_ID = "M_DistributionRun_ID";
/** Set Distribution Run Line.
@param M_DistributionRunLine_ID Distribution Run Lines define Distribution List, the Product and Quantiries */
public void setM_DistributionRunLine_ID (int M_DistributionRunLine_ID)
{
if (M_DistributionRunLine_ID < 1) throw new IllegalArgumentException ("M_DistributionRunLine_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_DistributionRunLine_ID, Integer.valueOf(M_DistributionRunLine_ID));
}
/** Get Distribution Run Line.
@return Distribution Run Lines define Distribution List, the Product and Quantiries */
public int getM_DistributionRunLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_DistributionRunLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="88ff14dd-2648-3dd1-0252-fec88b1cf6c5")
public static String es_PE_FIELD_Line_DistributionRunLine_Description="Los Items de funcionamiento de la distribución definen la lista de distribución, el producto y cantidades.";

@XendraTrl(Identifier="88ff14dd-2648-3dd1-0252-fec88b1cf6c5")
public static String es_PE_FIELD_Line_DistributionRunLine_Help="La cantidad de la orden se basa en el mayor de los mínimos de la lista del producto ó de distribución y de la cantidad basada en el cociente.";

@XendraTrl(Identifier="88ff14dd-2648-3dd1-0252-fec88b1cf6c5")
public static String es_PE_FIELD_Line_DistributionRunLine_Name="Item Lista de Distribución";

@XendraField(AD_Column_ID="M_DistributionRunLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="866fedd8-4eb9-c89e-e0a3-296bf7b3c403",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="88ff14dd-2648-3dd1-0252-fec88b1cf6c5")
public static final String FIELDNAME_Line_DistributionRunLine="88ff14dd-2648-3dd1-0252-fec88b1cf6c5";
/** Column name M_DistributionRunLine_ID */
public static final String COLUMNNAME_M_DistributionRunLine_ID = "M_DistributionRunLine_ID";
/** Set Minimum Quantity.
@param MinQty Minimum quantity for the business partner */
public void setMinQty (BigDecimal MinQty)
{
if (MinQty == null) throw new IllegalArgumentException ("MinQty is mandatory.");
set_Value (COLUMNNAME_MinQty, MinQty);
}
/** Get Minimum Quantity.
@return Minimum quantity for the business partner */
public BigDecimal getMinQty() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_MinQty);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="9a67ff60-aaa9-0241-ec87-c3fc688b3e74")
public static String es_PE_FIELD_Line_MinimumQuantity_Description="Cantidad mínima para el socio de negocio";

@XendraTrl(Identifier="9a67ff60-aaa9-0241-ec87-c3fc688b3e74")
public static String es_PE_FIELD_Line_MinimumQuantity_Help="Si la cantidad mínima es definida, y la cantidad basada en el porcentaje es más baja, la cantidad mínima es utilizada.";

@XendraTrl(Identifier="9a67ff60-aaa9-0241-ec87-c3fc688b3e74")
public static String es_PE_FIELD_Line_MinimumQuantity_Name="Cantidad Mín";

@XendraField(AD_Column_ID="MinQty",IsCentrallyMaintained=true,
AD_Tab_ID="866fedd8-4eb9-c89e-e0a3-296bf7b3c403",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9a67ff60-aaa9-0241-ec87-c3fc688b3e74")
public static final String FIELDNAME_Line_MinimumQuantity="9a67ff60-aaa9-0241-ec87-c3fc688b3e74";

@XendraTrl(Identifier="e7b36310-0c4c-262a-fbff-8eb371e0a574")
public static String es_PE_COLUMN_MinQty_Name="Cantidad Mín";

@XendraColumn(AD_Element_ID="dd9a9570-cfde-d9b6-0ddd-c3a4e58e0e04",ColumnName="MinQty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e7b36310-0c4c-262a-fbff-8eb371e0a574",
Synchronized="2017-08-05 16:55:06.0")
/** Column name MinQty */
public static final String COLUMNNAME_MinQty = "MinQty";
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

@XendraTrl(Identifier="cf9eff1a-3d74-4156-e08a-ee622f6b5a02")
public static String es_PE_FIELD_Line_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="cf9eff1a-3d74-4156-e08a-ee622f6b5a02")
public static String es_PE_FIELD_Line_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraTrl(Identifier="cf9eff1a-3d74-4156-e08a-ee622f6b5a02")
public static String es_PE_FIELD_Line_Product_Name="Producto";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="866fedd8-4eb9-c89e-e0a3-296bf7b3c403",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cf9eff1a-3d74-4156-e08a-ee622f6b5a02")
public static final String FIELDNAME_Line_Product="cf9eff1a-3d74-4156-e08a-ee622f6b5a02";

@XendraTrl(Identifier="37360568-ad38-0b6a-7056-261c6f77dc18")
public static String es_PE_COLUMN_M_Product_ID_Name="Producto";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="4281f8eb-238e-6b28-eb66-8cc866e6312c",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="37360568-ad38-0b6a-7056-261c6f77dc18",Synchronized="2017-08-05 16:55:06.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
/** Set Total Quantity.
@param TotalQty Total Quantity */
public void setTotalQty (BigDecimal TotalQty)
{
if (TotalQty == null) throw new IllegalArgumentException ("TotalQty is mandatory.");
set_Value (COLUMNNAME_TotalQty, TotalQty);
}
/** Get Total Quantity.
@return Total Quantity */
public BigDecimal getTotalQty() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_TotalQty);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="e70f1665-059d-713c-a8e4-bfed01141298")
public static String es_PE_FIELD_Line_TotalQuantity_Description="Cantidad Total";

@XendraTrl(Identifier="e70f1665-059d-713c-a8e4-bfed01141298")
public static String es_PE_FIELD_Line_TotalQuantity_Name="Cantidad Total";

@XendraField(AD_Column_ID="TotalQty",IsCentrallyMaintained=true,
AD_Tab_ID="866fedd8-4eb9-c89e-e0a3-296bf7b3c403",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e70f1665-059d-713c-a8e4-bfed01141298")
public static final String FIELDNAME_Line_TotalQuantity="e70f1665-059d-713c-a8e4-bfed01141298";

@XendraTrl(Identifier="abc08243-be8b-0b3e-a133-b4218948795e")
public static String es_PE_COLUMN_TotalQty_Name="Cantidad Total";

@XendraColumn(AD_Element_ID="9047414d-729e-2c1a-b56d-4b50309ad441",ColumnName="TotalQty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="abc08243-be8b-0b3e-a133-b4218948795e",
Synchronized="2017-08-05 16:55:06.0")
/** Column name TotalQty */
public static final String COLUMNNAME_TotalQty = "TotalQty";
}
