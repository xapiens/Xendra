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
/** Generated Model for AD_Process_Machine
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_Process_Machine extends PO
{
/** Standard Constructor
@param ctx context
@param AD_Process_Machine_ID id
@param trxName transaction
*/
public X_AD_Process_Machine (Properties ctx, int AD_Process_Machine_ID, String trxName)
{
super (ctx, AD_Process_Machine_ID, trxName);
/** if (AD_Process_Machine_ID == 0)
{
setAD_Process_ID (0);
setAD_Process_Machine_ID (0);
setA_Machine_ID (0);
setIsReadWrite (false);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_Process_Machine (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000327 */
public static int Table_ID=MTable.getTable_ID("AD_Process_Machine");

@XendraTrl(Identifier="d0c6b57f-ef1d-45ed-9aa0-e08f11156587")
public static String es_PE_TAB_ProcessByMachine_Name="Process by Machine";

@XendraTab(Name="Process by Machine",Description="",Help="",
AD_Window_ID="7bc9e03b-e56c-36fe-34ff-ea412ab43089",SeqNo=60,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="d0c6b57f-ef1d-45ed-9aa0-e08f11156587",Synchronized="2016-07-08 11:31:59.0")
public static final String TABNAME_ProcessByMachine="d0c6b57f-ef1d-45ed-9aa0-e08f11156587";

@XendraTrl(Identifier="67b818ce-ca6c-44bd-b568-4a201486bfe3")
public static String es_PE_TABLE_AD_Process_Machine_Name="Process Machine";

@XendraTable(Name="Process Machine",Description="",Help="",TableName="AD_Process_Machine",
AccessLevel="4",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,IsSecurityEnabled=false,
IsDeleteable=true,IsHighVolume=false,IsChangeLog=false,IsView=false,PO_Window_ID="",
ID="org.xendra.dictionary",Identifier="67b818ce-ca6c-44bd-b568-4a201486bfe3",
Synchronized="2017-08-16 11:40:54.0")
/** TableName=AD_Process_Machine */
public static final String Table_Name="AD_Process_Machine";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_Process_Machine");

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
    Table_ID = MTable.getTable_ID("AD_Process_Machine");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_Process_Machine[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Process.
@param AD_Process_ID Process or Report */
public void setAD_Process_ID (int AD_Process_ID)
{
if (AD_Process_ID < 1) throw new IllegalArgumentException ("AD_Process_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_Process_ID, Integer.valueOf(AD_Process_ID));
}
/** Get Process.
@return Process or Report */
public int getAD_Process_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Process_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="29022031-4f19-47b2-bc3b-ef95441bbbf5")
public static String es_PE_FIELD_ProcessByMachine_Process_Description="Proceso ó Informe";

@XendraTrl(Identifier="29022031-4f19-47b2-bc3b-ef95441bbbf5")
public static String es_PE_FIELD_ProcessByMachine_Process_Help="El campo proceso identifica un proceso ó Informe único en el sistema.";

@XendraTrl(Identifier="29022031-4f19-47b2-bc3b-ef95441bbbf5")
public static String es_PE_FIELD_ProcessByMachine_Process_Name="Proceso";

@XendraField(AD_Column_ID="AD_Process_ID",IsCentrallyMaintained=true,
AD_Tab_ID="d0c6b57f-ef1d-45ed-9aa0-e08f11156587",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-07-08 11:31:59.0",
Identifier="29022031-4f19-47b2-bc3b-ef95441bbbf5")
public static final String FIELDNAME_ProcessByMachine_Process="29022031-4f19-47b2-bc3b-ef95441bbbf5";

@XendraTrl(Identifier="00904242-e414-48f5-a97a-ea843512e178")
public static String es_PE_COLUMN_AD_Process_ID_Name="Process";

@XendraColumn(AD_Element_ID="60982cc9-e937-d374-4608-1c3f64b16d3b",ColumnName="AD_Process_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="00904242-e414-48f5-a97a-ea843512e178",
Synchronized="2017-08-05 16:52:45.0")
/** Column name AD_Process_ID */
public static final String COLUMNNAME_AD_Process_ID = "AD_Process_ID";
/** Set Process Machine.
@param AD_Process_Machine_ID Process Machine */
public void setAD_Process_Machine_ID (int AD_Process_Machine_ID)
{
if (AD_Process_Machine_ID < 1) throw new IllegalArgumentException ("AD_Process_Machine_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_Process_Machine_ID, Integer.valueOf(AD_Process_Machine_ID));
}
/** Get Process Machine.
@return Process Machine */
public int getAD_Process_Machine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Process_Machine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="5d358be4-8623-453a-864c-5060b639bb3a")
public static String es_PE_FIELD_ProcessByMachine_ProcessMachine_Name="Process Machine";

@XendraField(AD_Column_ID="AD_Process_Machine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="d0c6b57f-ef1d-45ed-9aa0-e08f11156587",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-07-08 11:31:59.0",
Identifier="5d358be4-8623-453a-864c-5060b639bb3a")
public static final String FIELDNAME_ProcessByMachine_ProcessMachine="5d358be4-8623-453a-864c-5060b639bb3a";
/** Column name AD_Process_Machine_ID */
public static final String COLUMNNAME_AD_Process_Machine_ID = "AD_Process_Machine_ID";
/** Set Machine .
@param A_Machine_ID Machine  */
public void setA_Machine_ID (int A_Machine_ID)
{
if (A_Machine_ID < 1) throw new IllegalArgumentException ("A_Machine_ID is mandatory.");
set_Value (COLUMNNAME_A_Machine_ID, Integer.valueOf(A_Machine_ID));
}
/** Get Machine .
@return Machine  */
public int getA_Machine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_A_Machine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="a045a1ed-936c-4359-bee2-d58c92f537fb")
public static String es_PE_FIELD_ProcessByMachine_Machine_Name="Machine ";

@XendraField(AD_Column_ID="A_Machine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="d0c6b57f-ef1d-45ed-9aa0-e08f11156587",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-07-08 11:31:59.0",
Identifier="a045a1ed-936c-4359-bee2-d58c92f537fb")
public static final String FIELDNAME_ProcessByMachine_Machine="a045a1ed-936c-4359-bee2-d58c92f537fb";

@XendraTrl(Identifier="d2765d8f-726a-4126-96cd-b43bfe73dc58")
public static String es_PE_COLUMN_A_Machine_ID_Name="Machine ";

@XendraColumn(AD_Element_ID="5ca659c9-c8cc-4dd1-8e7c-ddc2fe399392",ColumnName="A_Machine_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d2765d8f-726a-4126-96cd-b43bfe73dc58",
Synchronized="2015-08-21 20:39:03.0")
/** Column name A_Machine_ID */
public static final String COLUMNNAME_A_Machine_ID = "A_Machine_ID";
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
@XendraTrl(Identifier="696dc5a5-fe23-4639-bed2-4ca9f2ece2bf")
public static String es_PE_FIELD_ProcessByMachine_Identifier_Name="Identifier";

@XendraField(AD_Column_ID="Identifier",IsCentrallyMaintained=true,
AD_Tab_ID="d0c6b57f-ef1d-45ed-9aa0-e08f11156587",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=36,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-07-08 11:31:59.0",
Identifier="696dc5a5-fe23-4639-bed2-4ca9f2ece2bf")
public static final String FIELDNAME_ProcessByMachine_Identifier="696dc5a5-fe23-4639-bed2-4ca9f2ece2bf";

@XendraTrl(Identifier="b4cc0c9f-3e36-42c5-a3c0-cd823d93866e")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b4cc0c9f-3e36-42c5-a3c0-cd823d93866e",
Synchronized="2015-08-21 20:39:03.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Read Write.
@param IsReadWrite Field is read / write */
public void setIsReadWrite (boolean IsReadWrite)
{
set_Value (COLUMNNAME_IsReadWrite, Boolean.valueOf(IsReadWrite));
}
/** Get Read Write.
@return Field is read / write */
public boolean isReadWrite() 
{
Object oo = get_Value(COLUMNNAME_IsReadWrite);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="a8a76432-2d35-413d-9b73-596746833d77")
public static String es_PE_FIELD_ProcessByMachine_ReadWrite_Description="El campo es de lectura / escritura";

@XendraTrl(Identifier="a8a76432-2d35-413d-9b73-596746833d77")
public static String es_PE_FIELD_ProcessByMachine_ReadWrite_Help="El lectura escritura indica que este campo puede ser leído y actualizado.";

@XendraTrl(Identifier="a8a76432-2d35-413d-9b73-596746833d77")
public static String es_PE_FIELD_ProcessByMachine_ReadWrite_Name="Lectura Escritura";

@XendraField(AD_Column_ID="IsReadWrite",IsCentrallyMaintained=true,
AD_Tab_ID="d0c6b57f-ef1d-45ed-9aa0-e08f11156587",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-07-08 11:31:59.0",
Identifier="a8a76432-2d35-413d-9b73-596746833d77")
public static final String FIELDNAME_ProcessByMachine_ReadWrite="a8a76432-2d35-413d-9b73-596746833d77";

@XendraTrl(Identifier="befca5d1-ff74-4df7-90cf-26a75980af7b")
public static String es_PE_COLUMN_IsReadWrite_Name="Read Write";

@XendraColumn(AD_Element_ID="fc616898-5f46-981e-906f-9a5ddb486499",ColumnName="IsReadWrite",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="befca5d1-ff74-4df7-90cf-26a75980af7b",
Synchronized="2015-08-21 20:39:03.0")
/** Column name IsReadWrite */
public static final String COLUMNNAME_IsReadWrite = "IsReadWrite";
}
