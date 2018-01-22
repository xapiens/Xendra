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
/** Generated Model for C_CyclePhase
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_CyclePhase extends PO
{
/** Standard Constructor
@param ctx context
@param C_CyclePhase_ID id
@param trxName transaction
*/
public X_C_CyclePhase (Properties ctx, int C_CyclePhase_ID, String trxName)
{
super (ctx, C_CyclePhase_ID, trxName);
/** if (C_CyclePhase_ID == 0)
{
setC_CycleStep_ID (0);
setC_Phase_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_CyclePhase (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=433 */
public static int Table_ID=MTable.getTable_ID("C_CyclePhase");

@XendraTrl(Identifier="1813d1fa-5e55-24c3-3e7b-fe3c642ca110")
public static String es_PE_TAB_CyclePhase_Description="Definir Pasos del Ciclo de Proyecto";

@XendraTrl(Identifier="1813d1fa-5e55-24c3-3e7b-fe3c642ca110")
public static String es_PE_TAB_CyclePhase_Name="Fase del Ciclo";

@XendraTrl(Identifier="1813d1fa-5e55-24c3-3e7b-fe3c642ca110")
public static String es_PE_TAB_CyclePhase_Help="Los pasos del ciclo determinan la secuencia lógica de eventos dentro del ciclo.";

@XendraTab(Name="Cycle Phase",Description="Link Cycle Step with Project Phases",
Help="Link similar Project Phases to a Cycle Step ",
AD_Window_ID="1d686c87-4250-cd4c-c787-342ca8921a79",SeqNo=30,TabLevel=2,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="1813d1fa-5e55-24c3-3e7b-fe3c642ca110",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_CyclePhase="1813d1fa-5e55-24c3-3e7b-fe3c642ca110";

@XendraTrl(Identifier="23a9d1d4-daf7-d7d2-ca2c-8570b21f172b")
public static String es_PE_TABLE_C_CyclePhase_Name="C_CyclePhase";

@XendraTable(Name="C_CyclePhase",Description="",Help="",TableName="C_CyclePhase",AccessLevel="3",
AD_Window_ID="1d686c87-4250-cd4c-c787-342ca8921a79",AD_Val_Rule_ID="",IsKey=0,LoadSeq=145,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.commercial",Identifier="23a9d1d4-daf7-d7d2-ca2c-8570b21f172b",
Synchronized="2017-08-16 11:41:42.0")
/** TableName=C_CyclePhase */
public static final String Table_Name="C_CyclePhase";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_CyclePhase");

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
    Table_ID = MTable.getTable_ID("C_CyclePhase");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_CyclePhase[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Cycle Step.
@param C_CycleStep_ID The step for this Cycle */
public void setC_CycleStep_ID (int C_CycleStep_ID)
{
if (C_CycleStep_ID < 1) throw new IllegalArgumentException ("C_CycleStep_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_CycleStep_ID, Integer.valueOf(C_CycleStep_ID));
}
/** Get Cycle Step.
@return The step for this Cycle */
public int getC_CycleStep_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_CycleStep_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="176ca927-5c42-ca48-a694-74db89f4c4ae")
public static String es_PE_FIELD_CyclePhase_CycleStep_Description="El paso para este ciclo";

@XendraTrl(Identifier="176ca927-5c42-ca48-a694-74db89f4c4ae")
public static String es_PE_FIELD_CyclePhase_CycleStep_Help="Identifica unos ó más pasos dentro de un ciclo del proyecto.";

@XendraTrl(Identifier="176ca927-5c42-ca48-a694-74db89f4c4ae")
public static String es_PE_FIELD_CyclePhase_CycleStep_Name="Etapa del Ciclo";

@XendraField(AD_Column_ID="C_CycleStep_ID",IsCentrallyMaintained=true,
AD_Tab_ID="1813d1fa-5e55-24c3-3e7b-fe3c642ca110",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="176ca927-5c42-ca48-a694-74db89f4c4ae")
public static final String FIELDNAME_CyclePhase_CycleStep="176ca927-5c42-ca48-a694-74db89f4c4ae";

@XendraTrl(Identifier="834a0fa3-3b20-d0bd-f287-e3f9d2df0e13")
public static String es_PE_COLUMN_C_CycleStep_ID_Name="Etapa del Ciclo";

@XendraColumn(AD_Element_ID="68ef6e18-acc9-10dc-1690-af3ed242ae73",ColumnName="C_CycleStep_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="834a0fa3-3b20-d0bd-f287-e3f9d2df0e13",
Synchronized="2017-08-05 16:53:34.0")
/** Column name C_CycleStep_ID */
public static final String COLUMNNAME_C_CycleStep_ID = "C_CycleStep_ID";
/** Set Standard Phase.
@param C_Phase_ID Standard Phase of the Project Type */
public void setC_Phase_ID (int C_Phase_ID)
{
if (C_Phase_ID < 1) throw new IllegalArgumentException ("C_Phase_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_Phase_ID, Integer.valueOf(C_Phase_ID));
}
/** Get Standard Phase.
@return Standard Phase of the Project Type */
public int getC_Phase_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Phase_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="e2551255-f8bc-c160-352d-15fc55cc66f6")
public static String es_PE_FIELD_CyclePhase_StandardPhase_Description="Fase estándar de el tipo de proyecto";

@XendraTrl(Identifier="e2551255-f8bc-c160-352d-15fc55cc66f6")
public static String es_PE_FIELD_CyclePhase_StandardPhase_Help="Fase del proyecto con la información estándar del funcionamiento con el trabajo estándar.";

@XendraTrl(Identifier="e2551255-f8bc-c160-352d-15fc55cc66f6")
public static String es_PE_FIELD_CyclePhase_StandardPhase_Name="Fase Estándar";

@XendraField(AD_Column_ID="C_Phase_ID",IsCentrallyMaintained=true,
AD_Tab_ID="1813d1fa-5e55-24c3-3e7b-fe3c642ca110",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=50,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e2551255-f8bc-c160-352d-15fc55cc66f6")
public static final String FIELDNAME_CyclePhase_StandardPhase="e2551255-f8bc-c160-352d-15fc55cc66f6";

@XendraTrl(Identifier="975a3685-ef6c-33b5-c828-3c5233ad33c7")
public static String es_PE_COLUMN_C_Phase_ID_Name="Fase Estándar";

@XendraColumn(AD_Element_ID="3ef98f9c-ae28-3183-566b-a77d4b8d6048",ColumnName="C_Phase_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="975a3685-ef6c-33b5-c828-3c5233ad33c7",
Synchronized="2017-08-05 16:53:34.0")
/** Column name C_Phase_ID */
public static final String COLUMNNAME_C_Phase_ID = "C_Phase_ID";
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
@XendraTrl(Identifier="04028c24-f604-476d-aaa4-e9a5901cc05c")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="04028c24-f604-476d-aaa4-e9a5901cc05c",
Synchronized="2017-08-05 16:53:34.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
}
