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
/** Generated Model for AD_DesktopWorkbench
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_DesktopWorkbench extends PO
{
/** Standard Constructor
@param ctx context
@param AD_DesktopWorkbench_ID id
@param trxName transaction
*/
public X_AD_DesktopWorkbench (Properties ctx, int AD_DesktopWorkbench_ID, String trxName)
{
super (ctx, AD_DesktopWorkbench_ID, trxName);
/** if (AD_DesktopWorkbench_ID == 0)
{
setAD_Desktop_ID (0);
setAD_DesktopWorkbench_ID (0);
setAD_Workbench_ID (0);
setSeqNo (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_DesktopWorkbench (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=459 */
public static int Table_ID=MTable.getTable_ID("AD_DesktopWorkbench");

@XendraTrl(Identifier="6f897716-f826-da4e-04c3-24e61a4aab40")
public static String es_PE_TAB_Workbench_Description="Banco de Trabajo en el Escritorio";

@XendraTrl(Identifier="6f897716-f826-da4e-04c3-24e61a4aab40")
public static String es_PE_TAB_Workbench_Name="Banco de Trabajo";
@XendraTab(Name="Workbench",
Description="Workbench on the desktop",Help="",AD_Window_ID="1e215aa5-19c2-dcfe-4977-953ef21540ec",
SeqNo=30,TabLevel=1,IsSingleRow=false,IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="",HasTree=false,WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",
AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",
ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="6f897716-f826-da4e-04c3-24e61a4aab40",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Workbench="6f897716-f826-da4e-04c3-24e61a4aab40";

@XendraTrl(Identifier="8515eabb-8311-04f0-ced1-3f5e37d6b8f0")
public static String es_PE_TABLE_AD_DesktopWorkbench_Name="Banco de Trabajo del Escritorio";


@XendraTable(Name="Desktop Workbench",Description="",Help="",TableName="AD_DesktopWorkbench",
AccessLevel="4",AD_Window_ID="1e215aa5-19c2-dcfe-4977-953ef21540ec",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.dictionary",
Identifier="8515eabb-8311-04f0-ced1-3f5e37d6b8f0",Synchronized="2017-08-16 11:40:09.0")
/** TableName=AD_DesktopWorkbench */
public static final String Table_Name="AD_DesktopWorkbench";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_DesktopWorkbench");

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
    Table_ID = MTable.getTable_ID("AD_DesktopWorkbench");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_DesktopWorkbench[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Desktop.
@param AD_Desktop_ID Collection of Workbenches */
public void setAD_Desktop_ID (int AD_Desktop_ID)
{
if (AD_Desktop_ID < 1) throw new IllegalArgumentException ("AD_Desktop_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_Desktop_ID, Integer.valueOf(AD_Desktop_ID));
}
/** Get Desktop.
@return Collection of Workbenches */
public int getAD_Desktop_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Desktop_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="3193393d-0492-bf90-d1a4-10fb356ca44e")
public static String es_PE_FIELD_Workbench_Desktop_Description="Colección de bancos de trabajo";

@XendraTrl(Identifier="3193393d-0492-bf90-d1a4-10fb356ca44e")
public static String es_PE_FIELD_Workbench_Desktop_Name="Escritorio";

@XendraField(AD_Column_ID="AD_Desktop_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6f897716-f826-da4e-04c3-24e61a4aab40",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3193393d-0492-bf90-d1a4-10fb356ca44e")
public static final String FIELDNAME_Workbench_Desktop="3193393d-0492-bf90-d1a4-10fb356ca44e";

@XendraTrl(Identifier="1d4b6f40-1f54-51c9-28b2-8c84af96b1f9")
public static String es_PE_COLUMN_AD_Desktop_ID_Name="Escritorio";

@XendraColumn(AD_Element_ID="44ab94fd-cc79-1402-e9e6-b473fcc6a768",ColumnName="AD_Desktop_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1d4b6f40-1f54-51c9-28b2-8c84af96b1f9",
Synchronized="2017-08-05 16:52:29.0")
/** Column name AD_Desktop_ID */
public static final String COLUMNNAME_AD_Desktop_ID = "AD_Desktop_ID";
/** Set Desktop Workbench.
@param AD_DesktopWorkbench_ID Desktop Workbench */
public void setAD_DesktopWorkbench_ID (int AD_DesktopWorkbench_ID)
{
if (AD_DesktopWorkbench_ID < 1) throw new IllegalArgumentException ("AD_DesktopWorkbench_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_DesktopWorkbench_ID, Integer.valueOf(AD_DesktopWorkbench_ID));
}
/** Get Desktop Workbench.
@return Desktop Workbench */
public int getAD_DesktopWorkbench_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_DesktopWorkbench_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="fdcb7839-c4cb-4b06-18db-b097bc6081ab")
public static String es_PE_FIELD_Workbench_DesktopWorkbench_Name="Banco de Trabajo del Escritorio";

@XendraField(AD_Column_ID="AD_DesktopWorkbench_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6f897716-f826-da4e-04c3-24e61a4aab40",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fdcb7839-c4cb-4b06-18db-b097bc6081ab")
public static final String FIELDNAME_Workbench_DesktopWorkbench="fdcb7839-c4cb-4b06-18db-b097bc6081ab";
/** Column name AD_DesktopWorkbench_ID */
public static final String COLUMNNAME_AD_DesktopWorkbench_ID = "AD_DesktopWorkbench_ID";
/** Set Workbench.
@param AD_Workbench_ID Collection of windows, reports */
public void setAD_Workbench_ID (int AD_Workbench_ID)
{
if (AD_Workbench_ID < 1) throw new IllegalArgumentException ("AD_Workbench_ID is mandatory.");
set_Value (COLUMNNAME_AD_Workbench_ID, Integer.valueOf(AD_Workbench_ID));
}
/** Get Workbench.
@return Collection of windows, reports */
public int getAD_Workbench_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Workbench_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getAD_Workbench_ID()));
}

@XendraTrl(Identifier="11160896-c402-5884-b2a5-bef297e5c179")
public static String es_PE_FIELD_Workbench_Workbench_Description="Colección de ventanas; Informes";

@XendraTrl(Identifier="11160896-c402-5884-b2a5-bef297e5c179")
public static String es_PE_FIELD_Workbench_Workbench_Name="Banco de Trabajo";

@XendraField(AD_Column_ID="AD_Workbench_ID",IsCentrallyMaintained=true,
AD_Tab_ID="6f897716-f826-da4e-04c3-24e61a4aab40",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="11160896-c402-5884-b2a5-bef297e5c179")
public static final String FIELDNAME_Workbench_Workbench="11160896-c402-5884-b2a5-bef297e5c179";

@XendraTrl(Identifier="23557cc2-b9fd-58f6-5121-0642a469e6ec")
public static String es_PE_COLUMN_AD_Workbench_ID_Name="Banco de Trabajo";

@XendraColumn(AD_Element_ID="0180b8d1-3c69-6355-84ad-0f02bb7058a2",ColumnName="AD_Workbench_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="23557cc2-b9fd-58f6-5121-0642a469e6ec",
Synchronized="2017-08-05 16:52:29.0")
/** Column name AD_Workbench_ID */
public static final String COLUMNNAME_AD_Workbench_ID = "AD_Workbench_ID";
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
@XendraTrl(Identifier="ababbfcb-c25f-4714-803d-8c70eab2a717")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ababbfcb-c25f-4714-803d-8c70eab2a717",
Synchronized="2017-08-05 16:52:29.0")
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

@XendraTrl(Identifier="79168f5b-7366-603d-3e9a-1a160db72fcc")
public static String es_PE_FIELD_Workbench_Sequence_Description="Método de ordenar registros; el número más bajo viene primero";

@XendraTrl(Identifier="79168f5b-7366-603d-3e9a-1a160db72fcc")
public static String es_PE_FIELD_Workbench_Sequence_Help="La Secuencia indica el orden de los registros";

@XendraTrl(Identifier="79168f5b-7366-603d-3e9a-1a160db72fcc")
public static String es_PE_FIELD_Workbench_Sequence_Name="Secuencia";

@XendraField(AD_Column_ID="SeqNo",IsCentrallyMaintained=true,
AD_Tab_ID="6f897716-f826-da4e-04c3-24e61a4aab40",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=70,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="79168f5b-7366-603d-3e9a-1a160db72fcc")
public static final String FIELDNAME_Workbench_Sequence="79168f5b-7366-603d-3e9a-1a160db72fcc";

@XendraTrl(Identifier="881e6307-0ae0-69c6-220b-66f2df359224")
public static String es_PE_COLUMN_SeqNo_Name="Secuencia";

@XendraColumn(AD_Element_ID="38fa26fe-b59d-fce1-c129-420b57da738b",ColumnName="SeqNo",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="881e6307-0ae0-69c6-220b-66f2df359224",
Synchronized="2017-08-05 16:52:29.0")
/** Column name SeqNo */
public static final String COLUMNNAME_SeqNo = "SeqNo";
}
