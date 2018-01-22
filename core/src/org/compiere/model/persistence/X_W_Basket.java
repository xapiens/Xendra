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
/** Generated Model for W_Basket
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_W_Basket extends PO
{
/** Standard Constructor
@param ctx context
@param W_Basket_ID id
@param trxName transaction
*/
public X_W_Basket (Properties ctx, int W_Basket_ID, String trxName)
{
super (ctx, W_Basket_ID, trxName);
/** if (W_Basket_ID == 0)
{
setAD_User_ID (0);
setSession_ID (0);
setW_Basket_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_W_Basket (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=402 */
public static int Table_ID=MTable.getTable_ID("W_Basket");

@XendraTrl(Identifier="1eaaffbf-d211-8c09-ec46-6c88b9ab7bb3")
public static String es_PE_TABLE_W_Basket_Name="ID de almacenado";

@XendraTable(Name="W_Basket_ID",Description="Web Basket",Help="",TableName="W_Basket",
AccessLevel="4",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=140,IsSecurityEnabled=false,
IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,PO_Window_ID="",
ID="org.xendra.standard",Identifier="1eaaffbf-d211-8c09-ec46-6c88b9ab7bb3",
Synchronized="2017-08-16 11:44:27.0")
/** TableName=W_Basket */
public static final String Table_Name="W_Basket";


@XendraIndex(Name="w_basket_cbpartner",Identifier="54b5d51f-a435-992b-c84a-de3dd2eb5664",
Column_Names="c_bpartner_id",IsUnique="false",
TableIdentifier="54b5d51f-a435-992b-c84a-de3dd2eb5664",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_w_basket_cbpartner = "54b5d51f-a435-992b-c84a-de3dd2eb5664";


@XendraIndex(Name="w_basket_session",Identifier="259b50f0-f71e-1788-c38c-0b37e82561de",
Column_Names="session_id",IsUnique="true",TableIdentifier="259b50f0-f71e-1788-c38c-0b37e82561de",
Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_w_basket_session = "259b50f0-f71e-1788-c38c-0b37e82561de";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"W_Basket");

protected BigDecimal accessLevel = BigDecimal.valueOf(4);
/** AccessLevel
@return 4 - System 
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
    Table_ID = MTable.getTable_ID("W_Basket");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_W_Basket[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="34a4bb58-0d1c-4899-e3ec-628b0be96ea7")
public static String es_PE_COLUMN_AD_User_ID_Name="Usuario";

@XendraColumn(AD_Element_ID="abdf8dee-d3cd-73ec-c758-683e907797f4",ColumnName="AD_User_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="f4ac36a1-4200-1386-677e-14ac90afb4fe",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="34a4bb58-0d1c-4899-e3ec-628b0be96ea7",Synchronized="2017-08-05 16:56:31.0")
/** Column name AD_User_ID */
public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";
/** Set Business Partner .
@param C_BPartner_ID Identifies a Business Partner */
public void setC_BPartner_ID (int C_BPartner_ID)
{
if (C_BPartner_ID <= 0) set_Value (COLUMNNAME_C_BPartner_ID, null);
 else 
set_Value (COLUMNNAME_C_BPartner_ID, Integer.valueOf(C_BPartner_ID));
}
/** Get Business Partner .
@return Identifies a Business Partner */
public int getC_BPartner_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartner_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="1d055b66-ea6f-1209-64de-39577fc21a37")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Socio de Negocio";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="06fdbbe9-e1c4-3ee4-4a9d-73d1a990cc42",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="1d055b66-ea6f-1209-64de-39577fc21a37",Synchronized="2017-08-05 16:56:31.0")
/** Column name C_BPartner_ID */
public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
/** Set EMail Address.
@param EMail Electronic Mail Address */
public void setEMail (String EMail)
{
if (EMail != null && EMail.length() > 60)
{
log.warning("Length > 60 - truncated");
EMail = EMail.substring(0,59);
}
set_Value (COLUMNNAME_EMail, EMail);
}
/** Get EMail Address.
@return Electronic Mail Address */
public String getEMail() 
{
String value = (String)get_Value(COLUMNNAME_EMail);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="ead6e1ad-b6f2-7e5b-cd02-6a463c36cb68")
public static String es_PE_COLUMN_EMail_Name="Email";

@XendraColumn(AD_Element_ID="d18b300c-9ad6-2dd2-36d3-b65969743158",ColumnName="EMail",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ead6e1ad-b6f2-7e5b-cd02-6a463c36cb68",
Synchronized="2017-08-05 16:56:31.0")
/** Column name EMail */
public static final String COLUMNNAME_EMail = "EMail";
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
@XendraTrl(Identifier="ead590e3-a631-48d6-880c-6f33f7959dd6")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ead590e3-a631-48d6-880c-6f33f7959dd6",
Synchronized="2017-08-05 16:56:31.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set M_PriceList_ID.
@param M_PriceList_ID Unique identifier of a Price List */
public void setM_PriceList_ID (int M_PriceList_ID)
{
if (M_PriceList_ID <= 0) set_Value (COLUMNNAME_M_PriceList_ID, null);
 else 
set_Value (COLUMNNAME_M_PriceList_ID, Integer.valueOf(M_PriceList_ID));
}
/** Get M_PriceList_ID.
@return Unique identifier of a Price List */
public int getM_PriceList_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_PriceList_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="021cd108-533b-8815-ed50-1eee30e5de19")
public static String es_PE_COLUMN_M_PriceList_ID_Name="Lista de Precios";

@XendraColumn(AD_Element_ID="652afdd3-9ff1-082d-5831-6aad828e0e09",ColumnName="M_PriceList_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="021cd108-533b-8815-ed50-1eee30e5de19",
Synchronized="2017-08-05 16:56:31.0")
/** Column name M_PriceList_ID */
public static final String COLUMNNAME_M_PriceList_ID = "M_PriceList_ID";
/** Set Session ID.
@param Session_ID Session ID */
public void setSession_ID (int Session_ID)
{
if (Session_ID < 1) throw new IllegalArgumentException ("Session_ID is mandatory.");
set_Value (COLUMNNAME_Session_ID, Integer.valueOf(Session_ID));
}
/** Get Session ID.
@return Session ID */
public int getSession_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Session_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getSession_ID()));
}

@XendraTrl(Identifier="01f71d7d-4279-4ffc-2e45-34c6b6b7385d")
public static String es_PE_COLUMN_Session_ID_Name="ID de la Sesión";

@XendraColumn(AD_Element_ID="b9159d31-14a9-978e-34aa-7b261929c42b",ColumnName="Session_ID",
AD_Reference_ID=13,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="01f71d7d-4279-4ffc-2e45-34c6b6b7385d",
Synchronized="2017-08-05 16:56:31.0")
/** Column name Session_ID */
public static final String COLUMNNAME_Session_ID = "Session_ID";
/** Set W_Basket_ID.
@param W_Basket_ID Web Basket */
public void setW_Basket_ID (int W_Basket_ID)
{
if (W_Basket_ID < 1) throw new IllegalArgumentException ("W_Basket_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_W_Basket_ID, Integer.valueOf(W_Basket_ID));
}
/** Get W_Basket_ID.
@return Web Basket */
public int getW_Basket_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_W_Basket_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name W_Basket_ID */
public static final String COLUMNNAME_W_Basket_ID = "W_Basket_ID";
}
