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
/** Generated Model for C_Rebate
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_Rebate extends PO
{
/** Standard Constructor
@param ctx context
@param C_Rebate_ID id
@param trxName transaction
*/
public X_C_Rebate (Properties ctx, int C_Rebate_ID, String trxName)
{
super (ctx, C_Rebate_ID, trxName);
/** if (C_Rebate_ID == 0)
{
setC_Rebate_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_Rebate (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000183 */
public static int Table_ID=MTable.getTable_ID("C_Rebate");

@XendraTrl(Identifier="f3f293c0-7840-47bd-d8a7-ac8fe53fe868")
public static String es_PE_TAB_Rebate_Description="Rebate";

@XendraTrl(Identifier="f3f293c0-7840-47bd-d8a7-ac8fe53fe868")
public static String es_PE_TAB_Rebate_Name="Rebate";
@XendraTab(Name="Rebate",Description="Rebate",
Help="",AD_Window_ID="ce2d4e2c-ba4e-29bf-9f71-66fecdc05f55",SeqNo=110,TabLevel=1,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="f3f293c0-7840-47bd-d8a7-ac8fe53fe868",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Rebate="f3f293c0-7840-47bd-d8a7-ac8fe53fe868";

@XendraTrl(Identifier="9c94aae8-64c6-5caa-8507-f91d24817149")
public static String es_PE_TABLE_C_Rebate_Name="C_Rebate";

@XendraTable(Name="C_Rebate",Description="",Help="",TableName="C_Rebate",AccessLevel="3",
AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,IsSecurityEnabled=false,IsDeleteable=true,
IsHighVolume=false,IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="9c94aae8-64c6-5caa-8507-f91d24817149",Synchronized="2017-08-16 11:42:22.0")
/** TableName=C_Rebate */
public static final String Table_Name="C_Rebate";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_Rebate");

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
    Table_ID = MTable.getTable_ID("C_Rebate");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_Rebate[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="fd953fb1-eba4-1499-75b7-ea5ec1aff029")
public static String es_PE_FIELD_Rebate_Amount_Description="Total en una moneda definida";

@XendraTrl(Identifier="fd953fb1-eba4-1499-75b7-ea5ec1aff029")
public static String es_PE_FIELD_Rebate_Amount_Help="Indica el total para esta línea del documento";

@XendraTrl(Identifier="fd953fb1-eba4-1499-75b7-ea5ec1aff029")
public static String es_PE_FIELD_Rebate_Amount_Name="Total";
@XendraField(AD_Column_ID="Amount",
IsCentrallyMaintained=true,AD_Tab_ID="f3f293c0-7840-47bd-d8a7-ac8fe53fe868",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=50,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="fd953fb1-eba4-1499-75b7-ea5ec1aff029")
public static final String FIELDNAME_Rebate_Amount="fd953fb1-eba4-1499-75b7-ea5ec1aff029";

@XendraTrl(Identifier="e5a40879-d1dd-8fd1-b14f-24262e69237e")
public static String es_PE_COLUMN_Amount_Name="Amount";

@XendraColumn(AD_Element_ID="d89b3a02-29fd-e2e3-2d01-dbda08fb2454",ColumnName="Amount",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e5a40879-d1dd-8fd1-b14f-24262e69237e",
Synchronized="2017-08-05 16:54:19.0")
/** Column name Amount */
public static final String COLUMNNAME_Amount = "Amount";
/** Set C_Rebate.
@param C_Rebate_ID C_Rebate */
public void setC_Rebate_ID (int C_Rebate_ID)
{
if (C_Rebate_ID < 1) throw new IllegalArgumentException ("C_Rebate_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_Rebate_ID, Integer.valueOf(C_Rebate_ID));
}
/** Get C_Rebate.
@return C_Rebate */
public int getC_Rebate_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Rebate_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d3528638-813e-ce79-4d54-6f1ea2694efe")
public static String es_PE_FIELD_Rebate_C_Rebate_Name="C_Rebate";

@XendraField(AD_Column_ID="C_Rebate_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f3f293c0-7840-47bd-d8a7-ac8fe53fe868",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=131089,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d3528638-813e-ce79-4d54-6f1ea2694efe")
public static final String FIELDNAME_Rebate_C_Rebate="d3528638-813e-ce79-4d54-6f1ea2694efe";
/** Column name C_Rebate_ID */
public static final String COLUMNNAME_C_Rebate_ID = "C_Rebate_ID";
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

@XendraTrl(Identifier="523a8fcb-7929-f813-7809-c4ef7867521d")
public static String es_PE_FIELD_Rebate_UOM_Description="Unidad de Medida";

@XendraTrl(Identifier="523a8fcb-7929-f813-7809-c4ef7867521d")
public static String es_PE_FIELD_Rebate_UOM_Help="La UM define una unidad de medida única no monetaria";

@XendraTrl(Identifier="523a8fcb-7929-f813-7809-c4ef7867521d")
public static String es_PE_FIELD_Rebate_UOM_Name="UM";
@XendraField(AD_Column_ID="C_UOM_ID",
IsCentrallyMaintained=true,AD_Tab_ID="f3f293c0-7840-47bd-d8a7-ac8fe53fe868",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=60,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="523a8fcb-7929-f813-7809-c4ef7867521d")
public static final String FIELDNAME_Rebate_UOM="523a8fcb-7929-f813-7809-c4ef7867521d";

@XendraTrl(Identifier="3834c70d-fc01-34fa-9e17-0ff293c4776d")
public static String es_PE_COLUMN_C_UOM_ID_Name="UOM";

@XendraColumn(AD_Element_ID="d0345019-4fcc-44c8-4fd1-e38e3b4adeed",ColumnName="C_UOM_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3834c70d-fc01-34fa-9e17-0ff293c4776d",
Synchronized="2017-08-05 16:54:19.0")
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
@XendraTrl(Identifier="c0159130-400b-4ef3-a9f6-872c73792ab0")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c0159130-400b-4ef3-a9f6-872c73792ab0",
Synchronized="2017-08-05 16:54:19.0")
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

@XendraTrl(Identifier="334d510b-29b0-61e6-fcc3-d26ca57f4085")
public static String es_PE_FIELD_Rebate_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="334d510b-29b0-61e6-fcc3-d26ca57f4085")
public static String es_PE_FIELD_Rebate_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraTrl(Identifier="334d510b-29b0-61e6-fcc3-d26ca57f4085")
public static String es_PE_FIELD_Rebate_Product_Name="Producto";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f3f293c0-7840-47bd-d8a7-ac8fe53fe868",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="334d510b-29b0-61e6-fcc3-d26ca57f4085")
public static final String FIELDNAME_Rebate_Product="334d510b-29b0-61e6-fcc3-d26ca57f4085";

@XendraTrl(Identifier="b4453fa5-2d82-ceac-d6d2-f488d8e177e1")
public static String es_PE_COLUMN_M_Product_ID_Name="Product";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b4453fa5-2d82-ceac-d6d2-f488d8e177e1",
Synchronized="2017-08-05 16:54:19.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
}
