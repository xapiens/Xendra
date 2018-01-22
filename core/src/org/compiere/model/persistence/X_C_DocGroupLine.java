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
/** Generated Model for C_DocGroupLine
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_DocGroupLine extends PO
{
/** Standard Constructor
@param ctx context
@param C_DocGroupLine_ID id
@param trxName transaction
*/
public X_C_DocGroupLine (Properties ctx, int C_DocGroupLine_ID, String trxName)
{
super (ctx, C_DocGroupLine_ID, trxName);
/** if (C_DocGroupLine_ID == 0)
{
setC_DocGroup_ID (0);
setC_DocGroupLine_ID (0);
setC_DocType_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_DocGroupLine (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000002 */
public static int Table_ID=MTable.getTable_ID("C_DocGroupLine");

@XendraTrl(Identifier="029519ec-70f2-222f-8284-687138ddb7ad")
public static String es_PE_TAB_GroupLine_Description="Los elementos del Grupo";

@XendraTrl(Identifier="029519ec-70f2-222f-8284-687138ddb7ad")
public static String es_PE_TAB_GroupLine_Name="Lineas del Grupo";
@XendraTab(Name="Group Line",
Description="The elements of the group",Help="",
AD_Window_ID="b9ac075c-28fd-ccbe-c632-33ba372be5bf",SeqNo=30,TabLevel=1,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="029519ec-70f2-222f-8284-687138ddb7ad",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_GroupLine="029519ec-70f2-222f-8284-687138ddb7ad";

@XendraTrl(Identifier="f1efa7bc-46aa-bb71-eceb-2c44e49954ad")
public static String es_PE_TABLE_C_DocGroupLine_Name="Linea de Grupo de Documento";

@XendraTable(Name="Document Group Line",Description="",Help="",TableName="C_DocGroupLine",
AccessLevel="3",AD_Window_ID="b9ac075c-28fd-ccbe-c632-33ba372be5bf",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=0,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="f1efa7bc-46aa-bb71-eceb-2c44e49954ad",Synchronized="2017-08-16 11:41:42.0")
/** TableName=C_DocGroupLine */
public static final String Table_Name="C_DocGroupLine";


@XendraIndex(Name="c_docgroupline_docgroup",Identifier="6ada95fe-2e76-8af2-5ae3-0a2a0744d960",
Column_Names="c_docgroup_id",IsUnique="false",
TableIdentifier="6ada95fe-2e76-8af2-5ae3-0a2a0744d960",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_c_docgroupline_docgroup = "6ada95fe-2e76-8af2-5ae3-0a2a0744d960";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_DocGroupLine");

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
    Table_ID = MTable.getTable_ID("C_DocGroupLine");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_DocGroupLine[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Document Group.
@param C_DocGroup_ID Identifies a document group exclusively. */
public void setC_DocGroup_ID (int C_DocGroup_ID)
{
if (C_DocGroup_ID < 1) throw new IllegalArgumentException ("C_DocGroup_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_DocGroup_ID, Integer.valueOf(C_DocGroup_ID));
}
/** Get Document Group.
@return Identifies a document group exclusively. */
public int getC_DocGroup_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_DocGroup_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getC_DocGroup_ID()));
}

@XendraTrl(Identifier="4bc9d05a-4a79-2e14-3cba-63e1bf1ae8d2")
public static String es_PE_FIELD_GroupLine_DocumentGroup_Description="Identifica a un Grupo de Documentos exclusivamente.";

@XendraTrl(Identifier="4bc9d05a-4a79-2e14-3cba-63e1bf1ae8d2")
public static String es_PE_FIELD_GroupLine_DocumentGroup_Name="Grupo de Documentos";

@XendraField(AD_Column_ID="C_DocGroup_ID",IsCentrallyMaintained=true,
AD_Tab_ID="029519ec-70f2-222f-8284-687138ddb7ad",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=0,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4bc9d05a-4a79-2e14-3cba-63e1bf1ae8d2")
public static final String FIELDNAME_GroupLine_DocumentGroup="4bc9d05a-4a79-2e14-3cba-63e1bf1ae8d2";

@XendraTrl(Identifier="e3f81a78-6dc1-2eed-4177-68e7d3d69d01")
public static String es_PE_COLUMN_C_DocGroup_ID_Name="Grupo de Documentos";

@XendraColumn(AD_Element_ID="0ae3b1ec-1cf5-c5bb-9763-54f9648b267b",ColumnName="C_DocGroup_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e3f81a78-6dc1-2eed-4177-68e7d3d69d01",
Synchronized="2017-08-05 16:53:34.0")
/** Column name C_DocGroup_ID */
public static final String COLUMNNAME_C_DocGroup_ID = "C_DocGroup_ID";
/** Set Document Group Line.
@param C_DocGroupLine_ID Identifies a line of a Document Group */
public void setC_DocGroupLine_ID (int C_DocGroupLine_ID)
{
if (C_DocGroupLine_ID < 1) throw new IllegalArgumentException ("C_DocGroupLine_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_DocGroupLine_ID, Integer.valueOf(C_DocGroupLine_ID));
}
/** Get Document Group Line.
@return Identifies a line of a Document Group */
public int getC_DocGroupLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_DocGroupLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="08347265-783e-ec42-4697-7fbfa6310e47")
public static String es_PE_FIELD_GroupLine_DocumentGroupLine_Description="Identifica una Linea de un Grupo de Documentos";

@XendraTrl(Identifier="08347265-783e-ec42-4697-7fbfa6310e47")
public static String es_PE_FIELD_GroupLine_DocumentGroupLine_Name="Linea de Grupo de Documento";

@XendraField(AD_Column_ID="C_DocGroupLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="029519ec-70f2-222f-8284-687138ddb7ad",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=0,IsReadOnly=true,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="08347265-783e-ec42-4697-7fbfa6310e47")
public static final String FIELDNAME_GroupLine_DocumentGroupLine="08347265-783e-ec42-4697-7fbfa6310e47";
/** Column name C_DocGroupLine_ID */
public static final String COLUMNNAME_C_DocGroupLine_ID = "C_DocGroupLine_ID";
/** Set Document Type.
@param C_DocType_ID Document type or rules */
public void setC_DocType_ID (int C_DocType_ID)
{
if (C_DocType_ID < 0) throw new IllegalArgumentException ("C_DocType_ID is mandatory.");
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

@XendraTrl(Identifier="b4219f19-a9a4-7c14-c3b5-dde2f5582401")
public static String es_PE_FIELD_GroupLine_DocumentType_Description="Tipo de documento ó reglas";

@XendraTrl(Identifier="b4219f19-a9a4-7c14-c3b5-dde2f5582401")
public static String es_PE_FIELD_GroupLine_DocumentType_Help="El tipo de documento determina la secuencia del documento y las reglas de proceso";

@XendraTrl(Identifier="b4219f19-a9a4-7c14-c3b5-dde2f5582401")
public static String es_PE_FIELD_GroupLine_DocumentType_Name="Tipo de Documento";

@XendraField(AD_Column_ID="C_DocType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="029519ec-70f2-222f-8284-687138ddb7ad",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=0,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b4219f19-a9a4-7c14-c3b5-dde2f5582401")
public static final String FIELDNAME_GroupLine_DocumentType="b4219f19-a9a4-7c14-c3b5-dde2f5582401";

@XendraTrl(Identifier="c3743cb2-3642-68a8-4409-3406cfd3efbd")
public static String es_PE_COLUMN_C_DocType_ID_Name="Tipo de Documento";

@XendraColumn(AD_Element_ID="099a4147-1a72-cdd0-81e0-8bdbc8c0b883",ColumnName="C_DocType_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="3618c2e5-5c32-687f-83f6-d13e5296d9e4",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="c3743cb2-3642-68a8-4409-3406cfd3efbd",Synchronized="2017-08-05 16:53:35.0")
/** Column name C_DocType_ID */
public static final String COLUMNNAME_C_DocType_ID = "C_DocType_ID";
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
@XendraTrl(Identifier="1e0237a6-560f-40ed-b60d-5398eeac2f3d")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1e0237a6-560f-40ed-b60d-5398eeac2f3d",
Synchronized="2017-08-05 16:53:35.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
}
