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
/** Generated Model for GL_Exchange
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_GL_Exchange extends PO
{
/** Standard Constructor
@param ctx context
@param GL_Exchange_ID id
@param trxName transaction
*/
public X_GL_Exchange (Properties ctx, int GL_Exchange_ID, String trxName)
{
super (ctx, GL_Exchange_ID, trxName);
/** if (GL_Exchange_ID == 0)
{
setC_AcctSchema_ID (0);
setGL_Exchange_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_GL_Exchange (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000176 */
public static int Table_ID=MTable.getTable_ID("GL_Exchange");

@XendraTrl(Identifier="150bff89-49f7-e99c-170b-61162d3b7dbf")
public static String es_PE_TABLE_GL_Exchange_Name="GL Exchange";

@XendraTable(Name="GL Exchange",Description="",Help="",TableName="GL_Exchange",AccessLevel="3",
AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,IsSecurityEnabled=false,IsDeleteable=true,
IsHighVolume=false,IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.accounting",
Identifier="150bff89-49f7-e99c-170b-61162d3b7dbf",Synchronized="2017-08-16 11:42:44.0")
/** TableName=GL_Exchange */
public static final String Table_Name="GL_Exchange";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"GL_Exchange");

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
    Table_ID = MTable.getTable_ID("GL_Exchange");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_GL_Exchange[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Accounting Schema.
@param C_AcctSchema_ID Rules for accounting */
public void setC_AcctSchema_ID (int C_AcctSchema_ID)
{
if (C_AcctSchema_ID < 1) throw new IllegalArgumentException ("C_AcctSchema_ID is mandatory.");
set_Value (COLUMNNAME_C_AcctSchema_ID, Integer.valueOf(C_AcctSchema_ID));
}
/** Get Accounting Schema.
@return Rules for accounting */
public int getC_AcctSchema_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_AcctSchema_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="e647c099-5af0-2ff2-4109-1aa15df65942")
public static String es_PE_COLUMN_C_AcctSchema_ID_Name="Accounting Schema";

@XendraColumn(AD_Element_ID="561c9a32-9b35-9c1a-fabc-8abf7f2bb4ae",ColumnName="C_AcctSchema_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e647c099-5af0-2ff2-4109-1aa15df65942",
Synchronized="2017-08-05 16:54:42.0")
/** Column name C_AcctSchema_ID */
public static final String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";
/** Set c_conversiontypepo_id.
@param c_conversiontypepo_id c_conversiontypepo_id */
public void setc_conversiontypepo_id (int c_conversiontypepo_id)
{
set_Value (COLUMNNAME_c_conversiontypepo_id, Integer.valueOf(c_conversiontypepo_id));
}
/** Get c_conversiontypepo_id.
@return c_conversiontypepo_id */
public int getc_conversiontypepo_id() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_c_conversiontypepo_id);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="4fa66fb1-0669-e9ed-7f9f-f1a62a2849ba")
public static String es_PE_COLUMN_c_conversiontypepo_id_Name="c_conversiontypepo_id";

@XendraColumn(AD_Element_ID="99d3f80d-e5cf-247f-a5c4-b5a07c2f798a",
ColumnName="c_conversiontypepo_id",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="4fa66fb1-0669-e9ed-7f9f-f1a62a2849ba",Synchronized="2017-08-05 16:54:42.0")
/** Column name c_conversiontypepo_id */
public static final String COLUMNNAME_c_conversiontypepo_id = "c_conversiontypepo_id";
/** Set c_conversiontypeso_id.
@param c_conversiontypeso_id c_conversiontypeso_id */
public void setc_conversiontypeso_id (int c_conversiontypeso_id)
{
set_Value (COLUMNNAME_c_conversiontypeso_id, Integer.valueOf(c_conversiontypeso_id));
}
/** Get c_conversiontypeso_id.
@return c_conversiontypeso_id */
public int getc_conversiontypeso_id() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_c_conversiontypeso_id);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="54d8a4e5-4f15-f9f4-aa67-7d2c7da4167a")
public static String es_PE_COLUMN_c_conversiontypeso_id_Name="c_conversiontypeso_id";

@XendraColumn(AD_Element_ID="cb866d00-7a8b-b52d-337f-6c5b560d72ad",
ColumnName="c_conversiontypeso_id",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="54d8a4e5-4f15-f9f4-aa67-7d2c7da4167a",Synchronized="2017-08-05 16:54:42.0")
/** Column name c_conversiontypeso_id */
public static final String COLUMNNAME_c_conversiontypeso_id = "c_conversiontypeso_id";
/** Set Conversion Date.
@param ConversionDate Date for selecting conversion rate */
public void setConversionDate (Timestamp ConversionDate)
{
set_Value (COLUMNNAME_ConversionDate, ConversionDate);
}
/** Get Conversion Date.
@return Date for selecting conversion rate */
public Timestamp getConversionDate() 
{
return (Timestamp)get_Value(COLUMNNAME_ConversionDate);
}

@XendraTrl(Identifier="8526bd3f-5942-800e-386c-be227d0a3786")
public static String es_PE_COLUMN_ConversionDate_Name="Conversion Date";

@XendraColumn(AD_Element_ID="ffd4046d-2b65-d80f-0af5-794d7c280a48",ColumnName="ConversionDate",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8526bd3f-5942-800e-386c-be227d0a3786",
Synchronized="2017-08-05 16:54:42.0")
/** Column name ConversionDate */
public static final String COLUMNNAME_ConversionDate = "ConversionDate";
/** Set Period.
@param C_Period_ID Period of the Calendar */
public void setC_Period_ID (int C_Period_ID)
{
if (C_Period_ID <= 0) set_Value (COLUMNNAME_C_Period_ID, null);
 else 
set_Value (COLUMNNAME_C_Period_ID, Integer.valueOf(C_Period_ID));
}
/** Get Period.
@return Period of the Calendar */
public int getC_Period_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Period_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="72291847-d535-8d5e-ad5f-a625d5229eb0")
public static String es_PE_COLUMN_C_Period_ID_Name="Period";

@XendraColumn(AD_Element_ID="8f295c04-0eb4-a8f3-829f-cc6a6bd1df1e",ColumnName="C_Period_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="72291847-d535-8d5e-ad5f-a625d5229eb0",
Synchronized="2017-08-05 16:54:42.0")
/** Column name C_Period_ID */
public static final String COLUMNNAME_C_Period_ID = "C_Period_ID";
/** Set GL Exchange.
@param GL_Exchange_ID GL Exchange */
public void setGL_Exchange_ID (int GL_Exchange_ID)
{
if (GL_Exchange_ID < 1) throw new IllegalArgumentException ("GL_Exchange_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_GL_Exchange_ID, Integer.valueOf(GL_Exchange_ID));
}
/** Get GL Exchange.
@return GL Exchange */
public int getGL_Exchange_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_GL_Exchange_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name GL_Exchange_ID */
public static final String COLUMNNAME_GL_Exchange_ID = "GL_Exchange_ID";
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
@XendraTrl(Identifier="332547b9-0521-4151-a8f6-b1770050e63f")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="332547b9-0521-4151-a8f6-b1770050e63f",
Synchronized="2017-08-05 16:54:42.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Name.
@param Name Alphanumeric identifier of the entity */
public void setName (String Name)
{
if (Name != null && Name.length() > 10)
{
log.warning("Length > 10 - truncated");
Name = Name.substring(0,9);
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
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), getName());
}

@XendraTrl(Identifier="e4c7d3be-6ccd-f7ad-d9cf-1e471eb4c7c9")
public static String es_PE_COLUMN_Name_Name="Name";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e4c7d3be-6ccd-f7ad-d9cf-1e471eb4c7c9",
Synchronized="2017-08-05 16:54:42.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set prevconversiondate.
@param prevconversiondate prevconversiondate */
public void setprevconversiondate (Timestamp prevconversiondate)
{
set_Value (COLUMNNAME_prevconversiondate, prevconversiondate);
}
/** Get prevconversiondate.
@return prevconversiondate */
public Timestamp getprevconversiondate() 
{
return (Timestamp)get_Value(COLUMNNAME_prevconversiondate);
}

@XendraTrl(Identifier="a23db79e-acbf-d6bd-ceb0-7c5374e54700")
public static String es_PE_COLUMN_prevconversiondate_Name="prevconversiondate";

@XendraColumn(AD_Element_ID="fcddf6ad-5b8e-9385-3424-2fccd2500a3d",ColumnName="prevconversiondate",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a23db79e-acbf-d6bd-ceb0-7c5374e54700",
Synchronized="2017-08-05 16:54:42.0")
/** Column name prevconversiondate */
public static final String COLUMNNAME_prevconversiondate = "prevconversiondate";
/** Set Realized Gain Acct.
@param RealizedGain_Acct Realized Gain Account */
public void setRealizedGain_Acct (int RealizedGain_Acct)
{
set_Value (COLUMNNAME_RealizedGain_Acct, Integer.valueOf(RealizedGain_Acct));
}
/** Get Realized Gain Acct.
@return Realized Gain Account */
public int getRealizedGain_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_RealizedGain_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ff69bc7c-672b-1049-1ac0-589018d8d823")
public static String es_PE_COLUMN_RealizedGain_Acct_Name="Realized Gain Acct";

@XendraColumn(AD_Element_ID="b1a37766-a6ee-af2d-cb8e-aa7bd5cdcbb2",ColumnName="RealizedGain_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ff69bc7c-672b-1049-1ac0-589018d8d823",
Synchronized="2017-08-05 16:54:42.0")
/** Column name RealizedGain_Acct */
public static final String COLUMNNAME_RealizedGain_Acct = "RealizedGain_Acct";
/** Set Realized Loss Acct.
@param RealizedLoss_Acct Realized Loss Account */
public void setRealizedLoss_Acct (int RealizedLoss_Acct)
{
set_Value (COLUMNNAME_RealizedLoss_Acct, Integer.valueOf(RealizedLoss_Acct));
}
/** Get Realized Loss Acct.
@return Realized Loss Account */
public int getRealizedLoss_Acct() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_RealizedLoss_Acct);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="70e5cd46-826f-ab00-f626-7bba0ee1608e")
public static String es_PE_COLUMN_RealizedLoss_Acct_Name="Realized Loss Acct";

@XendraColumn(AD_Element_ID="7e5a74b9-ab23-f88b-a100-923d97d74ee4",ColumnName="RealizedLoss_Acct",
AD_Reference_ID=25,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="70e5cd46-826f-ab00-f626-7bba0ee1608e",
Synchronized="2017-08-05 16:54:42.0")
/** Column name RealizedLoss_Acct */
public static final String COLUMNNAME_RealizedLoss_Acct = "RealizedLoss_Acct";
}
