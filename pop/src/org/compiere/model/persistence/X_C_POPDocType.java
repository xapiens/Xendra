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
/** Generated Model for C_POPDocType
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_POPDocType extends PO
{
/** Standard Constructor
@param ctx context
@param C_POPDocType_ID id
@param trxName transaction
*/
public X_C_POPDocType (Properties ctx, int C_POPDocType_ID, String trxName)
{
super (ctx, C_POPDocType_ID, trxName);
/** if (C_POPDocType_ID == 0)
{
setC_PopDocType_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_POPDocType (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000353 */
public static int Table_ID=MTable.getTable_ID("C_POPDocType");

@XendraTrl(Identifier="48ac2e46-617c-41b3-9671-e9f8fc7695b6")
public static String es_PE_TABLE_C_POPDocType_Name="Point of Purchase Doc Type";

@XendraTable(Name="Point of Purchase Doc Type",
AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="C_POPDocType",AccessLevel="3",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=false,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.commercial",Identifier="48ac2e46-617c-41b3-9671-e9f8fc7695b6",
Synchronized="2020-03-03 21:37:27.0")
/** TableName=C_POPDocType */
public static final String Table_Name="C_POPDocType";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_POPDocType");

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
    Table_ID = MTable.getTable_ID("C_POPDocType");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_POPDocType[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Document Type.
@param C_DocType_ID Document type or rules */
public void setC_DocType_ID (int C_DocType_ID)
{
if (C_DocType_ID <= 0) set_Value (COLUMNNAME_C_DocType_ID, null);
 else 
set_Value (COLUMNNAME_C_DocType_ID, Integer.valueOf(C_DocType_ID));
}
/** Get Document Type.
@return Document type or rules */
public int getC_DocType_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_DocType_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="72b5defe-9217-4cd8-9f42-e941d5d8239e")
public static String es_PE_COLUMN_C_DocType_ID_Name="Document Type";

@XendraColumn(AD_Element_ID="099a4147-1a72-cdd0-81e0-8bdbc8c0b883",ColumnName="C_DocType_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="72b5defe-9217-4cd8-9f42-e941d5d8239e",
Synchronized="2019-08-30 22:22:03.0")
/** Column name C_DocType_ID */
public static final String COLUMNNAME_C_DocType_ID = "C_DocType_ID";
/** Set Point of Purchase Doc Type.
@param C_PopDocType_ID Point of Purchase Doc Type */
public void setC_PopDocType_ID (int C_PopDocType_ID)
{
if (C_PopDocType_ID < 1) throw new IllegalArgumentException ("C_PopDocType_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_PopDocType_ID, Integer.valueOf(C_PopDocType_ID));
}
/** Get Point of Purchase Doc Type.
@return Point of Purchase Doc Type */
public int getC_PopDocType_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_PopDocType_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name C_PopDocType_ID */
public static final String COLUMNNAME_C_PopDocType_ID = "C_PopDocType_ID";
/** Set Point of Purchase.
@param C_POP_ID Point of Purchase */
public void setC_POP_ID (int C_POP_ID)
{
if (C_POP_ID <= 0) set_Value (COLUMNNAME_C_POP_ID, null);
 else 
set_Value (COLUMNNAME_C_POP_ID, Integer.valueOf(C_POP_ID));
}
/** Get Point of Purchase.
@return Point of Purchase */
public int getC_POP_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_POP_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="0a5e2680-95e8-4267-b63b-3a608e9206bf")
public static String es_PE_COLUMN_C_POP_ID_Name="Point of Purchase";

@XendraColumn(AD_Element_ID="aeab4e94-a404-6b73-10c4-b133128c2853",ColumnName="C_POP_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0a5e2680-95e8-4267-b63b-3a608e9206bf",
Synchronized="2019-08-30 22:22:03.0")
/** Column name C_POP_ID */
public static final String COLUMNNAME_C_POP_ID = "C_POP_ID";
}
