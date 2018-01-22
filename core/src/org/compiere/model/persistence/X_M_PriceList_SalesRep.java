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
/** Generated Model for M_PriceList_SalesRep
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_PriceList_SalesRep extends PO
{
/** Standard Constructor
@param ctx context
@param M_PriceList_SalesRep_ID id
@param trxName transaction
*/
public X_M_PriceList_SalesRep (Properties ctx, int M_PriceList_SalesRep_ID, String trxName)
{
super (ctx, M_PriceList_SalesRep_ID, trxName);
/** if (M_PriceList_SalesRep_ID == 0)
{
setAD_User_ID (0);
setM_PriceList_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_M_PriceList_SalesRep (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000167 */
public static int Table_ID=MTable.getTable_ID("M_PriceList_SalesRep");

@XendraTrl(Identifier="3646cfc1-c265-12e2-8645-b54cd88be809")
public static String es_PE_TAB_PriceListSalesRep_Description="Maintain PriceList SalesRep";

@XendraTrl(Identifier="3646cfc1-c265-12e2-8645-b54cd88be809")
public static String es_PE_TAB_PriceListSalesRep_Name="PriceList SalesRep";

@XendraTrl(Identifier="3646cfc1-c265-12e2-8645-b54cd88be809")
public static String es_PE_TAB_PriceListSalesRep_Help="Maintain PriceList SalesRep";

@XendraTab(Name="PriceList SalesRep",Description="Maintain PriceList SalesRep",
Help="Maintain PriceList SalesRep",AD_Window_ID="e3c55106-2db1-b535-c578-d544cd183313",SeqNo=30,
TabLevel=1,IsSingleRow=false,IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="16683cab-b5fa-7b05-653d-27a78b426919",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="3646cfc1-c265-12e2-8645-b54cd88be809",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_PriceListSalesRep="3646cfc1-c265-12e2-8645-b54cd88be809";

@XendraTrl(Identifier="d1b4dcbc-c65d-23b1-e617-2f13f68c1bfa")
public static String es_PE_TABLE_M_PriceList_SalesRep_Name="PriceList SalesRep";

@XendraTable(Name="PriceList SalesRep",
Description="Identifies SalesRep  a unique instance of a Price List",Help="",
TableName="M_PriceList_SalesRep",AccessLevel="3",
AD_Window_ID="e3c55106-2db1-b535-c578-d544cd183313",AD_Val_Rule_ID="",IsKey=0,LoadSeq=95,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.material",Identifier="d1b4dcbc-c65d-23b1-e617-2f13f68c1bfa",
Synchronized="2017-08-16 11:43:24.0")
/** TableName=M_PriceList_SalesRep */
public static final String Table_Name="M_PriceList_SalesRep";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_PriceList_SalesRep");

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
    Table_ID = MTable.getTable_ID("M_PriceList_SalesRep");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_PriceList_SalesRep[").append(get_ID()).append("]");
return sb.toString();
}
/** Set User/Contact.
@param AD_User_ID User within the system - Internal or Business Partner Contact */
public void setAD_User_ID (int AD_User_ID)
{
if (AD_User_ID < 1) throw new IllegalArgumentException ("AD_User_ID is mandatory.");
set_Value (COLUMNNAME_AD_User_ID, Integer.valueOf(AD_User_ID));
}
/** Get User/Contact.
@return User within the system - Internal or Business Partner Contact */
public int getAD_User_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_User_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="fe657b7c-91e0-0148-fa0b-823159bbe75d")
public static String es_PE_FIELD_PriceListSalesRep_UserContact_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="fe657b7c-91e0-0148-fa0b-823159bbe75d")
public static String es_PE_FIELD_PriceListSalesRep_UserContact_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraTrl(Identifier="fe657b7c-91e0-0148-fa0b-823159bbe75d")
public static String es_PE_FIELD_PriceListSalesRep_UserContact_Name="Usuario";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="3646cfc1-c265-12e2-8645-b54cd88be809",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fe657b7c-91e0-0148-fa0b-823159bbe75d")
public static final String FIELDNAME_PriceListSalesRep_UserContact="fe657b7c-91e0-0148-fa0b-823159bbe75d";

@XendraTrl(Identifier="5c6b71da-a7f0-5e6a-51c3-a0d4878ead9b")
public static String es_PE_COLUMN_AD_User_ID_Name="User/Contact";

@XendraColumn(AD_Element_ID="abdf8dee-d3cd-73ec-c758-683e907797f4",ColumnName="AD_User_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5c6b71da-a7f0-5e6a-51c3-a0d4878ead9b",
Synchronized="2017-08-05 16:55:19.0")
/** Column name AD_User_ID */
public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";
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
@XendraTrl(Identifier="94265453-224c-47f5-81ae-fac959928790")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="94265453-224c-47f5-81ae-fac959928790",
Synchronized="2017-08-05 16:55:19.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set M_PriceList_ID.
@param M_PriceList_ID Unique identifier of a Price List */
public void setM_PriceList_ID (int M_PriceList_ID)
{
if (M_PriceList_ID < 1) throw new IllegalArgumentException ("M_PriceList_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_PriceList_ID, Integer.valueOf(M_PriceList_ID));
}
/** Get M_PriceList_ID.
@return Unique identifier of a Price List */
public int getM_PriceList_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_PriceList_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ad7e043e-85cc-53d7-b2e3-9d6de3d9fd90")
public static String es_PE_FIELD_PriceListSalesRep_M_PriceList_ID_Description="Identificador único de mi lista de precios";

@XendraTrl(Identifier="ad7e043e-85cc-53d7-b2e3-9d6de3d9fd90")
public static String es_PE_FIELD_PriceListSalesRep_M_PriceList_ID_Help="Listas de precios son usadas para determinar el precio; margen y costo de artículos comprados ó vendidos.";

@XendraTrl(Identifier="ad7e043e-85cc-53d7-b2e3-9d6de3d9fd90")
public static String es_PE_FIELD_PriceListSalesRep_M_PriceList_ID_Name="Lista de Precios";

@XendraField(AD_Column_ID="M_PriceList_ID",IsCentrallyMaintained=true,
AD_Tab_ID="3646cfc1-c265-12e2-8645-b54cd88be809",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ad7e043e-85cc-53d7-b2e3-9d6de3d9fd90")
public static final String FIELDNAME_PriceListSalesRep_M_PriceList_ID="ad7e043e-85cc-53d7-b2e3-9d6de3d9fd90";

@XendraTrl(Identifier="16683cab-b5fa-7b05-653d-27a78b426919")
public static String es_PE_COLUMN_M_PriceList_ID_Name="M_PriceList_ID";

@XendraColumn(AD_Element_ID="652afdd3-9ff1-082d-5831-6aad828e0e09",ColumnName="M_PriceList_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="16683cab-b5fa-7b05-653d-27a78b426919",
Synchronized="2017-08-05 16:55:19.0")
/** Column name M_PriceList_ID */
public static final String COLUMNNAME_M_PriceList_ID = "M_PriceList_ID";
}
