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
import org.compiere.model.reference.REF_EMailType;
/** Generated Model for C_ContactAddress
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_ContactAddress extends PO
{
/** Standard Constructor
@param ctx context
@param C_ContactAddress_ID id
@param trxName transaction
*/
public X_C_ContactAddress (Properties ctx, int C_ContactAddress_ID, String trxName)
{
super (ctx, C_ContactAddress_ID, trxName);
/** if (C_ContactAddress_ID == 0)
{
setC_ContactAddress_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_ContactAddress (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000385 */
public static int Table_ID=MTable.getTable_ID("C_ContactAddress");

@XendraTrl(Identifier="314dec39-a2a4-4081-accb-37f83ed062ca")
public static String es_PE_TABLE_C_ContactAddress_Name="Contact Address";

@XendraTable(Name="Contact Address",Description="",Help="",TableName="C_ContactAddress",
AccessLevel="3",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,IsSecurityEnabled=false,
IsDeleteable=true,IsHighVolume=false,IsChangeLog=false,IsView=false,PO_Window_ID="",
ID="org.xendra.commercial",Identifier="314dec39-a2a4-4081-accb-37f83ed062ca",
Synchronized="2017-08-16 11:41:40.0")
/** TableName=C_ContactAddress */
public static final String Table_Name="C_ContactAddress";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_ContactAddress");

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
    Table_ID = MTable.getTable_ID("C_ContactAddress");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_ContactAddress[").append(get_ID()).append("]");
return sb.toString();
}

/** AddressType AD_Reference=aa9ed05b-ac7a-4d3d-916a-dcdb623a1082 */
public static final int ADDRESSTYPE_AD_Reference_ID=1000059;
/** Set AddressType.
@param AddressType AddressType */
public void setAddressType (String AddressType)
{
if (AddressType == null || AddressType.equals(REF_EMailType.House) || AddressType.equals(REF_EMailType.Other) || AddressType.equals(REF_EMailType.Work));
 else throw new IllegalArgumentException ("AddressType Invalid value - " + AddressType + " - Reference_ID=1000059 - H - O - W");
if (AddressType != null && AddressType.length() > 1)
{
log.warning("Length > 1 - truncated");
AddressType = AddressType.substring(0,0);
}
set_Value (COLUMNNAME_AddressType, AddressType);
}
/** Get AddressType.
@return AddressType */
public String getAddressType() 
{
return (String)get_Value(COLUMNNAME_AddressType);
}

@XendraTrl(Identifier="04efff63-37bc-47c1-af88-2411d01af0b4")
public static String es_PE_COLUMN_AddressType_Name="addresstype";

@XendraColumn(AD_Element_ID="4a39224b-d00b-4145-b594-c0c4ef8063df",ColumnName="AddressType",
AD_Reference_ID=17,AD_Reference_Value_ID="aa9ed05b-ac7a-4d3d-916a-dcdb623a1082",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="04efff63-37bc-47c1-af88-2411d01af0b4",Synchronized="2017-08-05 16:53:31.0")
/** Column name AddressType */
public static final String COLUMNNAME_AddressType = "AddressType";
/** Set Contact Address.
@param C_ContactAddress_ID Contact Address */
public void setC_ContactAddress_ID (int C_ContactAddress_ID)
{
if (C_ContactAddress_ID < 1) throw new IllegalArgumentException ("C_ContactAddress_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_ContactAddress_ID, Integer.valueOf(C_ContactAddress_ID));
}
/** Get Contact Address.
@return Contact Address */
public int getC_ContactAddress_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_ContactAddress_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name C_ContactAddress_ID */
public static final String COLUMNNAME_C_ContactAddress_ID = "C_ContactAddress_ID";
/** Set C_Contact.
@param C_Contact_ID C_Contact */
public void setC_Contact_ID (int C_Contact_ID)
{
if (C_Contact_ID <= 0) set_Value (COLUMNNAME_C_Contact_ID, null);
 else 
set_Value (COLUMNNAME_C_Contact_ID, Integer.valueOf(C_Contact_ID));
}
/** Get C_Contact.
@return C_Contact */
public int getC_Contact_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Contact_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="9eb777d7-88b3-4447-abde-d7ed11d287df")
public static String es_PE_COLUMN_C_Contact_ID_Name="C_Contact";

@XendraColumn(AD_Element_ID="bb15e679-fe21-467e-83f5-3dbf31590903",ColumnName="C_Contact_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9eb777d7-88b3-4447-abde-d7ed11d287df",
Synchronized="2017-08-05 16:53:31.0")
/** Column name C_Contact_ID */
public static final String COLUMNNAME_C_Contact_ID = "C_Contact_ID";
/** Set Address.
@param C_Location_ID Location or Address */
public void setC_Location_ID (int C_Location_ID)
{
if (C_Location_ID <= 0) set_Value (COLUMNNAME_C_Location_ID, null);
 else 
set_Value (COLUMNNAME_C_Location_ID, Integer.valueOf(C_Location_ID));
}
/** Get Address.
@return Location or Address */
public int getC_Location_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Location_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="53a0026d-20e9-4c0f-8b79-41b6555005bc")
public static String es_PE_COLUMN_C_Location_ID_Name="Address";

@XendraColumn(AD_Element_ID="e66e22a8-535b-2af2-6efb-aa600959a885",ColumnName="C_Location_ID",
AD_Reference_ID=21,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="53a0026d-20e9-4c0f-8b79-41b6555005bc",
Synchronized="2017-08-05 16:53:31.0")
/** Column name C_Location_ID */
public static final String COLUMNNAME_C_Location_ID = "C_Location_ID";
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
@XendraTrl(Identifier="aced81a6-2d47-4a91-976a-d76ba8f6dbe3")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="aced81a6-2d47-4a91-976a-d76ba8f6dbe3",
Synchronized="2017-08-05 16:53:31.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Label.
@param Label Label */
public void setLabel (String Label)
{
if (Label != null && Label.length() > 20)
{
log.warning("Length > 20 - truncated");
Label = Label.substring(0,19);
}
set_Value (COLUMNNAME_Label, Label);
}
/** Get Label.
@return Label */
public String getLabel() 
{
String value = (String)get_Value(COLUMNNAME_Label);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="31656bb0-670d-45c9-b66a-3d90b49e656f")
public static String es_PE_COLUMN_Label_Name="label";

@XendraColumn(AD_Element_ID="b7decc38-c399-4fc2-b427-dc6e8ee0f049",ColumnName="Label",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="31656bb0-670d-45c9-b66a-3d90b49e656f",
Synchronized="2017-08-05 16:53:31.0")
/** Column name Label */
public static final String COLUMNNAME_Label = "Label";
/** Set POBox.
@param POBox POBox */
public void setPOBox (String POBox)
{
if (POBox != null && POBox.length() > 20)
{
log.warning("Length > 20 - truncated");
POBox = POBox.substring(0,19);
}
set_Value (COLUMNNAME_POBox, POBox);
}
/** Get POBox.
@return POBox */
public String getPOBox() 
{
String value = (String)get_Value(COLUMNNAME_POBox);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="ccfe782b-ae25-446d-b4f7-e03ecedb2544")
public static String es_PE_COLUMN_POBox_Name="pobox";

@XendraColumn(AD_Element_ID="1f10cad5-2f96-48c4-8ffa-20496d1afe39",ColumnName="POBox",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ccfe782b-ae25-446d-b4f7-e03ecedb2544",
Synchronized="2017-08-05 16:53:31.0")
/** Column name POBox */
public static final String COLUMNNAME_POBox = "POBox";
}
