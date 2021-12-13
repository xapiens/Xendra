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
/** Generated Model for AD_Table_ScriptValidator
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_Table_ScriptValidator extends PO
{
/** Standard Constructor
@param ctx context
@param AD_Table_ScriptValidator_ID id
@param trxName transaction
*/
public X_AD_Table_ScriptValidator (Properties ctx, int AD_Table_ScriptValidator_ID, String trxName)
{
super (ctx, AD_Table_ScriptValidator_ID, trxName);
/** if (AD_Table_ScriptValidator_ID == 0)
{
setAD_Rule_ID (0);
setAD_Table_ID (0);
setAD_Table_ScriptValidator_ID (0);
setEventModelValidator (null);
setSeqNo (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_Table_ScriptValidator (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000205 */
public static int Table_ID=MTable.getTable_ID("AD_Table_ScriptValidator");

@XendraTrl(Identifier="cddd5246-4206-15aa-dd53-b56932902060")
public static String es_PE_TABLE_AD_Table_ScriptValidator_Name="AD_Table_ScriptValidator";


@XendraTable(Name="AD_Table_ScriptValidator",AD_Package_ID="140d4d0c-8da8-bcb6-9c20-bc776701f80c",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="AD_Table_ScriptValidator",AccessLevel="4",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=0,IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=false,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.dictionary",
Identifier="cddd5246-4206-15aa-dd53-b56932902060",Synchronized="2020-03-03 21:35:59.0")
/** TableName=AD_Table_ScriptValidator */
public static final String Table_Name="AD_Table_ScriptValidator";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_Table_ScriptValidator");

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
    Table_ID = MTable.getTable_ID("AD_Table_ScriptValidator");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_Table_ScriptValidator[").append(get_ID()).append("]");
return sb.toString();
}
/** Set AD_Rule_ID.
@param AD_Rule_ID AD_Rule_ID */
public void setAD_Rule_ID (int AD_Rule_ID)
{
if (AD_Rule_ID < 1) throw new IllegalArgumentException ("AD_Rule_ID is mandatory.");
set_Value (COLUMNNAME_AD_Rule_ID, Integer.valueOf(AD_Rule_ID));
}
/** Get AD_Rule_ID.
@return AD_Rule_ID */
public int getAD_Rule_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Rule_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="029e51a8-be49-b10d-1d12-35e6764846b9")
public static String es_PE_COLUMN_AD_Rule_ID_Name="AD_Rule_ID";

@XendraColumn(AD_Element_ID="4b4afdeb-6aca-d182-6e3a-83f0f6d29f7d",ColumnName="AD_Rule_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="6e3b61d3-e674-6d25-b8c5-5f0ca5289eb8",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="029e51a8-be49-b10d-1d12-35e6764846b9",Synchronized="2019-08-30 22:20:44.0")
/** Column name AD_Rule_ID */
public static final String COLUMNNAME_AD_Rule_ID = "AD_Rule_ID";
/** Set Table.
@param AD_Table_ID Database Table information */
public void setAD_Table_ID (int AD_Table_ID)
{
if (AD_Table_ID < 1) throw new IllegalArgumentException ("AD_Table_ID is mandatory.");
set_Value (COLUMNNAME_AD_Table_ID, Integer.valueOf(AD_Table_ID));
}
/** Get Table.
@return Database Table information */
public int getAD_Table_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Table_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="c0846b3b-29e4-268f-648c-2f80897cd69f")
public static String es_PE_COLUMN_AD_Table_ID_Name="Table";

@XendraColumn(AD_Element_ID="270eeb02-723b-0ecc-7f56-3c67fa71a7f1",ColumnName="AD_Table_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c0846b3b-29e4-268f-648c-2f80897cd69f",
Synchronized="2019-08-30 22:20:44.0")
/** Column name AD_Table_ID */
public static final String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
/** Set AD_Table_ScriptValidator_ID.
@param AD_Table_ScriptValidator_ID AD_Table_ScriptValidator_ID */
public void setAD_Table_ScriptValidator_ID (int AD_Table_ScriptValidator_ID)
{
if (AD_Table_ScriptValidator_ID < 1) throw new IllegalArgumentException ("AD_Table_ScriptValidator_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_Table_ScriptValidator_ID, Integer.valueOf(AD_Table_ScriptValidator_ID));
}
/** Get AD_Table_ScriptValidator_ID.
@return AD_Table_ScriptValidator_ID */
public int getAD_Table_ScriptValidator_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Table_ScriptValidator_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name AD_Table_ScriptValidator_ID */
public static final String COLUMNNAME_AD_Table_ScriptValidator_ID = "AD_Table_ScriptValidator_ID";
/** Set EventModelValidator.
@param EventModelValidator EventModelValidator */
public void setEventModelValidator (String EventModelValidator)
{
if (EventModelValidator.length() > 4)
{
log.warning("Length > 4 - truncated");
EventModelValidator = EventModelValidator.substring(0,3);
}
set_Value (COLUMNNAME_EventModelValidator, EventModelValidator);
}
/** Get EventModelValidator.
@return EventModelValidator */
public String getEventModelValidator() 
{
return (String)get_Value(COLUMNNAME_EventModelValidator);
}

@XendraTrl(Identifier="e221c171-bff2-5bab-530b-1e38b330f959")
public static String es_PE_COLUMN_EventModelValidator_Name="eventmodelvalidator";

@XendraColumn(AD_Element_ID="26e42951-d3f1-fca0-b849-ed7698034e08",
ColumnName="EventModelValidator",AD_Reference_ID=17,AD_Reference_Value_ID="xendra.getuuid()",
AD_Val_Rule_ID="",FieldLength=4,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="e221c171-bff2-5bab-530b-1e38b330f959",Synchronized="2019-08-30 22:20:44.0")
/** Column name EventModelValidator */
public static final String COLUMNNAME_EventModelValidator = "EventModelValidator";
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
@XendraTrl(Identifier="fd69b974-65b9-4527-aff6-2b7ed941ea31")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fd69b974-65b9-4527-aff6-2b7ed941ea31",
Synchronized="2019-08-30 22:20:44.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Sequence.
@param SeqNo Method of ordering records: lowest number comes first */
public void setSeqNo (int SeqNo)
{
set_Value (COLUMNNAME_SeqNo, Integer.valueOf(SeqNo));
}
/** Get Sequence.
@return Method of ordering records: lowest number comes first */
public int getSeqNo() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_SeqNo);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="433544f4-e8d5-4e33-09f7-9f4a063d3e8e")
public static String es_PE_COLUMN_SeqNo_Name="Sequence";

@XendraColumn(AD_Element_ID="38fa26fe-b59d-fce1-c129-420b57da738b",ColumnName="SeqNo",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="433544f4-e8d5-4e33-09f7-9f4a063d3e8e",
Synchronized="2019-08-30 22:20:44.0")
/** Column name SeqNo */
public static final String COLUMNNAME_SeqNo = "SeqNo";
}
