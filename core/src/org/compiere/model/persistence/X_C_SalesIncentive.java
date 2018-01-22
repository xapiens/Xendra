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
/** Generated Model for C_SalesIncentive
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_SalesIncentive extends PO
{
/** Standard Constructor
@param ctx context
@param C_SalesIncentive_ID id
@param trxName transaction
*/
public X_C_SalesIncentive (Properties ctx, int C_SalesIncentive_ID, String trxName)
{
super (ctx, C_SalesIncentive_ID, trxName);
/** if (C_SalesIncentive_ID == 0)
{
setC_SalesIncentive_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_SalesIncentive (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000175 */
public static int Table_ID=MTable.getTable_ID("C_SalesIncentive");

@XendraTrl(Identifier="8dd58ef1-0f28-872e-7c18-3031c6edea3e")
public static String es_PE_TAB_Incentive_Description="Sales Incentive";

@XendraTrl(Identifier="8dd58ef1-0f28-872e-7c18-3031c6edea3e")
public static String es_PE_TAB_Incentive_Name="Incentive";
@XendraTab(Name="Incentive",
Description="Sales Incentive",Help="",AD_Window_ID="ce2d4e2c-ba4e-29bf-9f71-66fecdc05f55",
SeqNo=100,TabLevel=1,IsSingleRow=true,IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="",HasTree=false,WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",
AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",
ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="8dd58ef1-0f28-872e-7c18-3031c6edea3e",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Incentive="8dd58ef1-0f28-872e-7c18-3031c6edea3e";

@XendraTrl(Identifier="82aca990-6d4a-c3ac-3d26-bc0e504291e4")
public static String es_PE_TABLE_C_SalesIncentive_Name="C_SalesIncentive";

@XendraTable(Name="C_SalesIncentive",Description="",Help="",TableName="C_SalesIncentive",
AccessLevel="3",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,IsSecurityEnabled=false,
IsDeleteable=true,IsHighVolume=false,IsChangeLog=false,IsView=false,PO_Window_ID="",
ID="org.xendra.commercial",Identifier="82aca990-6d4a-c3ac-3d26-bc0e504291e4",
Synchronized="2017-08-16 11:42:27.0")
/** TableName=C_SalesIncentive */
public static final String Table_Name="C_SalesIncentive";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_SalesIncentive");

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
    Table_ID = MTable.getTable_ID("C_SalesIncentive");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_SalesIncentive[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Amount.
@param Amount Amount in a defined currency */
public void setAmount (BigDecimal Amount)
{
set_Value (COLUMNNAME_Amount, Amount);
}
/** Get Amount.
@return Amount in a defined currency */
public BigDecimal getAmount() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Amount);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="0d53dc8a-24bd-7b5c-70f1-806511242b67")
public static String es_PE_FIELD_Incentive_Amount_Description="Total en una moneda definida";

@XendraTrl(Identifier="0d53dc8a-24bd-7b5c-70f1-806511242b67")
public static String es_PE_FIELD_Incentive_Amount_Help="Indica el total para esta línea del documento";

@XendraTrl(Identifier="0d53dc8a-24bd-7b5c-70f1-806511242b67")
public static String es_PE_FIELD_Incentive_Amount_Name="Monto del Incentivo";

@XendraField(AD_Column_ID="Amount",IsCentrallyMaintained=true,
AD_Tab_ID="8dd58ef1-0f28-872e-7c18-3031c6edea3e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0d53dc8a-24bd-7b5c-70f1-806511242b67")
public static final String FIELDNAME_Incentive_Amount="0d53dc8a-24bd-7b5c-70f1-806511242b67";

@XendraTrl(Identifier="64935896-a931-7e3c-4f0c-cc6a3a324c85")
public static String es_PE_COLUMN_Amount_Name="Amount";

@XendraColumn(AD_Element_ID="d89b3a02-29fd-e2e3-2d01-dbda08fb2454",ColumnName="Amount",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="64935896-a931-7e3c-4f0c-cc6a3a324c85",
Synchronized="2017-08-05 16:54:25.0")
/** Column name Amount */
public static final String COLUMNNAME_Amount = "Amount";
/** Set C_SalesIncentive.
@param C_SalesIncentive_ID C_SalesIncentive */
public void setC_SalesIncentive_ID (int C_SalesIncentive_ID)
{
if (C_SalesIncentive_ID < 1) throw new IllegalArgumentException ("C_SalesIncentive_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_SalesIncentive_ID, Integer.valueOf(C_SalesIncentive_ID));
}
/** Get C_SalesIncentive.
@return C_SalesIncentive */
public int getC_SalesIncentive_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_SalesIncentive_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="34236e05-a133-a1c6-3fe3-992ae097a4a3")
public static String es_PE_FIELD_Incentive_C_SalesIncentive_Name="C_SalesIncentive";

@XendraField(AD_Column_ID="C_SalesIncentive_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8dd58ef1-0f28-872e-7c18-3031c6edea3e",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=131089,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="34236e05-a133-a1c6-3fe3-992ae097a4a3")
public static final String FIELDNAME_Incentive_C_SalesIncentive="34236e05-a133-a1c6-3fe3-992ae097a4a3";
/** Column name C_SalesIncentive_ID */
public static final String COLUMNNAME_C_SalesIncentive_ID = "C_SalesIncentive_ID";
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

@XendraTrl(Identifier="13cfb4e6-83aa-7091-876f-7b002c43ed7e")
public static String es_PE_FIELD_Incentive_UOM_Description="Unidad de Medida";

@XendraTrl(Identifier="13cfb4e6-83aa-7091-876f-7b002c43ed7e")
public static String es_PE_FIELD_Incentive_UOM_Help="La UM define una unidad de medida única no monetaria";

@XendraTrl(Identifier="13cfb4e6-83aa-7091-876f-7b002c43ed7e")
public static String es_PE_FIELD_Incentive_UOM_Name="UM";
@XendraField(AD_Column_ID="C_UOM_ID",
IsCentrallyMaintained=true,AD_Tab_ID="8dd58ef1-0f28-872e-7c18-3031c6edea3e",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=60,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="13cfb4e6-83aa-7091-876f-7b002c43ed7e")
public static final String FIELDNAME_Incentive_UOM="13cfb4e6-83aa-7091-876f-7b002c43ed7e";

@XendraTrl(Identifier="0594843b-5915-b8f8-76da-8247da489d96")
public static String es_PE_COLUMN_C_UOM_ID_Name="UOM";

@XendraColumn(AD_Element_ID="d0345019-4fcc-44c8-4fd1-e38e3b4adeed",ColumnName="C_UOM_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0594843b-5915-b8f8-76da-8247da489d96",
Synchronized="2017-08-05 16:54:25.0")
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
@XendraTrl(Identifier="a1a89ea7-6309-434c-99f6-71e510eab310")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a1a89ea7-6309-434c-99f6-71e510eab310",
Synchronized="2017-08-05 16:54:25.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Product.
@param M_Product_ID Product, Service, Item */
public void setM_Product_ID (int M_Product_ID)
{
if (M_Product_ID <= 0) set_ValueNoCheck (COLUMNNAME_M_Product_ID, null);
 else 
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

@XendraTrl(Identifier="2e2e350d-9fbe-88be-270b-5372767a9bb3")
public static String es_PE_FIELD_Incentive_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="2e2e350d-9fbe-88be-270b-5372767a9bb3")
public static String es_PE_FIELD_Incentive_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraTrl(Identifier="2e2e350d-9fbe-88be-270b-5372767a9bb3")
public static String es_PE_FIELD_Incentive_Product_Name="Producto";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8dd58ef1-0f28-872e-7c18-3031c6edea3e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=131089,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2e2e350d-9fbe-88be-270b-5372767a9bb3")
public static final String FIELDNAME_Incentive_Product="2e2e350d-9fbe-88be-270b-5372767a9bb3";

@XendraTrl(Identifier="36d6d277-3f93-05d2-fb74-e80e57a12c33")
public static String es_PE_COLUMN_M_Product_ID_Name="Product";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="36d6d277-3f93-05d2-fb74-e80e57a12c33",
Synchronized="2017-08-05 16:54:25.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
}
