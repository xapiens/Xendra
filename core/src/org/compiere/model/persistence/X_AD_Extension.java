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
/** Generated Model for AD_Extension
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_Extension extends PO
{
/** Standard Constructor
@param ctx context
@param AD_Extension_ID id
@param trxName transaction
*/
public X_AD_Extension (Properties ctx, int AD_Extension_ID, String trxName)
{
super (ctx, AD_Extension_ID, trxName);
/** if (AD_Extension_ID == 0)
{
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_Extension (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000333 */
public static int Table_ID=MTable.getTable_ID("AD_Extension");

@XendraTrl(Identifier="50228442-ef4c-4525-98bc-36e2f52f968a")
public static String es_PE_TABLE_AD_Extension_Name="Plugin Extension";

@XendraTable(Name="Plugin Extension",Description="",Help="",TableName="AD_Extension",
AccessLevel="4",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,IsSecurityEnabled=false,
IsDeleteable=true,IsHighVolume=false,IsChangeLog=false,IsView=false,PO_Window_ID="",
ID="org.xendra.dictionary",Identifier="50228442-ef4c-4525-98bc-36e2f52f968a",
Synchronized="2017-08-16 11:40:11.0")
/** TableName=AD_Extension */
public static final String Table_Name="AD_Extension";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_Extension");

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
    Table_ID = MTable.getTable_ID("AD_Extension");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_Extension[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Plugin Extension.
@param AD_Extension_ID Plugin Extension */
public void setAD_Extension_ID (int AD_Extension_ID)
{
if (AD_Extension_ID <= 0) set_ValueNoCheck (COLUMNNAME_AD_Extension_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_AD_Extension_ID, Integer.valueOf(AD_Extension_ID));
}
/** Get Plugin Extension.
@return Plugin Extension */
public int getAD_Extension_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Extension_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name AD_Extension_ID */
public static final String COLUMNNAME_AD_Extension_ID = "AD_Extension_ID";
/** Set Plugin Extension List.
@param AD_ExtensionList_ID Plugin Extension List */
public void setAD_ExtensionList_ID (int AD_ExtensionList_ID)
{
if (AD_ExtensionList_ID <= 0) set_Value (COLUMNNAME_AD_ExtensionList_ID, null);
 else 
set_Value (COLUMNNAME_AD_ExtensionList_ID, Integer.valueOf(AD_ExtensionList_ID));
}
/** Get Plugin Extension List.
@return Plugin Extension List */
public int getAD_ExtensionList_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_ExtensionList_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d67085b6-5322-4975-b7fe-6057f9d54d64")
public static String es_PE_COLUMN_AD_ExtensionList_ID_Name="Plugin Extension List";

@XendraColumn(AD_Element_ID="73a0325c-611c-41d1-a01c-ef806c56383b",
ColumnName="AD_ExtensionList_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="d67085b6-5322-4975-b7fe-6057f9d54d64",Synchronized="2015-11-20 16:30:17.0")
/** Column name AD_ExtensionList_ID */
public static final String COLUMNNAME_AD_ExtensionList_ID = "AD_ExtensionList_ID";
/** Set Classname.
@param Classname Java Classname */
public void setClassname (String Classname)
{
if (Classname != null && Classname.length() > 100)
{
log.warning("Length > 100 - truncated");
Classname = Classname.substring(0,99);
}
set_Value (COLUMNNAME_Classname, Classname);
}
/** Get Classname.
@return Java Classname */
public String getClassname() 
{
String value = (String)get_Value(COLUMNNAME_Classname);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="a70dc112-cf3c-4e36-b92a-6102d9a43273")
public static String es_PE_COLUMN_Classname_Name="Classname";

@XendraColumn(AD_Element_ID="43b208b9-53a3-0d59-0255-aaf07c9bd7ce",ColumnName="Classname",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=100,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a70dc112-cf3c-4e36-b92a-6102d9a43273",
Synchronized="2017-08-05 16:52:30.0")
/** Column name Classname */
public static final String COLUMNNAME_Classname = "Classname";
/** Set ID.
@param ID ID */
public void setID (String ID)
{
if (ID != null && ID.length() > 100)
{
log.warning("Length > 100 - truncated");
ID = ID.substring(0,99);
}
set_Value (COLUMNNAME_ID, ID);
}
/** Get ID.
@return ID */
public String getID() 
{
String value = (String)get_Value(COLUMNNAME_ID);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="aad79081-e96f-4e53-9698-1d67f97b8d70")
public static String es_PE_COLUMN_ID_Name="ID";

@XendraColumn(AD_Element_ID="089e82a2-807e-4cc0-96a6-05e479740035",ColumnName="ID",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=100,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="aad79081-e96f-4e53-9698-1d67f97b8d70",
Synchronized="2015-11-20 16:30:17.0")
/** Column name ID */
public static final String COLUMNNAME_ID = "ID";
}
