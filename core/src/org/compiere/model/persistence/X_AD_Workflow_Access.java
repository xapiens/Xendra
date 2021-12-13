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
/** Generated Model for AD_Workflow_Access
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_Workflow_Access extends PO
{
/** Standard Constructor
@param ctx context
@param AD_Workflow_Access_ID id
@param trxName transaction
*/
public X_AD_Workflow_Access (Properties ctx, int AD_Workflow_Access_ID, String trxName)
{
super (ctx, AD_Workflow_Access_ID, trxName);
/** if (AD_Workflow_Access_ID == 0)
{
setAD_Role_ID (0);
setAD_Workflow_ID (0);
setIsReadWrite (false);	
// N
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_Workflow_Access (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=202 */
public static int Table_ID=MTable.getTable_ID("AD_Workflow_Access");

@XendraTrl(Identifier="49a9f9ab-f960-39e5-7043-335117b0c0f3")
public static String es_PE_TAB_WorkflowAccess_Description="Acceso a Flujo de Trabajo";

@XendraTrl(Identifier="49a9f9ab-f960-39e5-7043-335117b0c0f3")
public static String es_PE_TAB_WorkflowAccess_Help="La pestaña Acceso de Flujo de Trabajo define los flujos de trabajo y el tipo de acceso que este rol tiene.";

@XendraTrl(Identifier="49a9f9ab-f960-39e5-7043-335117b0c0f3")
public static String es_PE_TAB_WorkflowAccess_Name="Acceso a Flujo de Trabajo";

@XendraTab(Name="Workflow Access",Description="Workflow Access",
Help="The Workflow Access Tab defines the Workflows and type of access that this Role is granted.",
AD_Window_ID="6341ac38-b536-eb1d-f7aa-89d20601b434",SeqNo=80,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="58b01af1-44d1-5d01-cb59-299915914e93",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="49a9f9ab-f960-39e5-7043-335117b0c0f3",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_WorkflowAccess="49a9f9ab-f960-39e5-7043-335117b0c0f3";

@XendraTrl(Identifier="f5a5d647-cfe6-5735-a8a3-0821d22c226b")
public static String es_PE_TAB_Access_Description="Acceso a Flujo de Trabajo";

@XendraTrl(Identifier="f5a5d647-cfe6-5735-a8a3-0821d22c226b")
public static String es_PE_TAB_Access_Help="La pestaña Accesos de Flujo de Trabajo define los roles que tienen acceso a este flujo de trabajo.";

@XendraTrl(Identifier="f5a5d647-cfe6-5735-a8a3-0821d22c226b")
public static String es_PE_TAB_Access_Name="Acceso";
@XendraTab(Name="Access",
Description="Workflow Access",
Help="The Workflow Access Tab defines the Roles who have access to this Workflow. ",
AD_Window_ID="62b2e7ae-ae80-0120-50fa-d101e75827e6",SeqNo=30,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="781fb563-72f2-bd11-5b95-eb3084da291e",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="f5a5d647-cfe6-5735-a8a3-0821d22c226b",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Access="f5a5d647-cfe6-5735-a8a3-0821d22c226b";

@XendraTrl(Identifier="f3825d8f-871e-ceba-e437-0afa91a744c1")
public static String es_PE_TABLE_AD_Workflow_Access_Name="AD_Workflow_Access";

@XendraTable(Name="AD_Workflow_Access",AD_Package_ID="9df191d4-b8da-879a-276b-6e16b286e868",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="AD_Workflow_Access",AccessLevel="6",AD_Window_ID="62b2e7ae-ae80-0120-50fa-d101e75827e6",
AD_Val_Rule_ID="",IsKey=0,LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.workflow",
Identifier="f3825d8f-871e-ceba-e437-0afa91a744c1",Synchronized="2020-03-03 21:36:13.0")
/** TableName=AD_Workflow_Access */
public static final String Table_Name="AD_Workflow_Access";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_Workflow_Access");

protected BigDecimal accessLevel = BigDecimal.valueOf(6);
/** AccessLevel
@return 6 - System - Client 
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
    Table_ID = MTable.getTable_ID("AD_Workflow_Access");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_Workflow_Access[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Role.
@param AD_Role_ID Responsibility Role */
public void setAD_Role_ID (int AD_Role_ID)
{
if (AD_Role_ID < 0) throw new IllegalArgumentException ("AD_Role_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_Role_ID, Integer.valueOf(AD_Role_ID));
}
/** Get Role.
@return Responsibility Role */
public int getAD_Role_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Role_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="93ca48fb-07e7-110f-6ada-3bb9c9f637ea")
public static String es_PE_FIELD_WorkflowAccess_Role_Name="Rol";

@XendraTrl(Identifier="93ca48fb-07e7-110f-6ada-3bb9c9f637ea")
public static String es_PE_FIELD_WorkflowAccess_Role_Description="Rol de responsabilidad";

@XendraTrl(Identifier="93ca48fb-07e7-110f-6ada-3bb9c9f637ea")
public static String es_PE_FIELD_WorkflowAccess_Role_Help="El Rol determina la seguridad y acceso del usuario que posee este Rol";

@XendraField(AD_Column_ID="AD_Role_ID",IsCentrallyMaintained=true,
AD_Tab_ID="49a9f9ab-f960-39e5-7043-335117b0c0f3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="93ca48fb-07e7-110f-6ada-3bb9c9f637ea")
public static final String FIELDNAME_WorkflowAccess_Role="93ca48fb-07e7-110f-6ada-3bb9c9f637ea";

@XendraTrl(Identifier="eb026438-902b-f32a-9de3-4285ec3deb62")
public static String es_PE_FIELD_Access_Role_Name="Rol";

@XendraTrl(Identifier="eb026438-902b-f32a-9de3-4285ec3deb62")
public static String es_PE_FIELD_Access_Role_Description="Rol de responsabilidad";

@XendraTrl(Identifier="eb026438-902b-f32a-9de3-4285ec3deb62")
public static String es_PE_FIELD_Access_Role_Help="El Rol determina la seguridad y acceso del usuario que posee este Rol";

@XendraField(AD_Column_ID="AD_Role_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f5a5d647-cfe6-5735-a8a3-0821d22c226b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="eb026438-902b-f32a-9de3-4285ec3deb62")
public static final String FIELDNAME_Access_Role="eb026438-902b-f32a-9de3-4285ec3deb62";

@XendraTrl(Identifier="58b01af1-44d1-5d01-cb59-299915914e93")
public static String es_PE_COLUMN_AD_Role_ID_Name="Rol";

@XendraColumn(AD_Element_ID="08ffb725-ea75-e55f-f4c5-67ac26f40e2b",ColumnName="AD_Role_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="58b01af1-44d1-5d01-cb59-299915914e93",
Synchronized="2019-08-30 22:20:54.0")
/** Column name AD_Role_ID */
public static final String COLUMNNAME_AD_Role_ID = "AD_Role_ID";
/** Set Workflow.
@param AD_Workflow_ID Workflow or combination of tasks */
public void setAD_Workflow_ID (int AD_Workflow_ID)
{
if (AD_Workflow_ID < 1) throw new IllegalArgumentException ("AD_Workflow_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_Workflow_ID, Integer.valueOf(AD_Workflow_ID));
}
/** Get Workflow.
@return Workflow or combination of tasks */
public int getAD_Workflow_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Workflow_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f713ea59-3396-cbc0-b446-a6db45ceec7e")
public static String es_PE_FIELD_WorkflowAccess_Workflow_Name="Flujo de Trabajo";

@XendraTrl(Identifier="f713ea59-3396-cbc0-b446-a6db45ceec7e")
public static String es_PE_FIELD_WorkflowAccess_Workflow_Description="Flujo de trabajo ó combinación de tareas";

@XendraTrl(Identifier="f713ea59-3396-cbc0-b446-a6db45ceec7e")
public static String es_PE_FIELD_WorkflowAccess_Workflow_Help="El campo flujo de trabajo identifica un flujo de trabajo único en el sistema.";

@XendraField(AD_Column_ID="AD_Workflow_ID",IsCentrallyMaintained=true,
AD_Tab_ID="49a9f9ab-f960-39e5-7043-335117b0c0f3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f713ea59-3396-cbc0-b446-a6db45ceec7e")
public static final String FIELDNAME_WorkflowAccess_Workflow="f713ea59-3396-cbc0-b446-a6db45ceec7e";

@XendraTrl(Identifier="c7bf80d8-7e8a-81f3-caaf-752774ae0c02")
public static String es_PE_FIELD_Access_Workflow_Name="Flujo de Trabajo";

@XendraTrl(Identifier="c7bf80d8-7e8a-81f3-caaf-752774ae0c02")
public static String es_PE_FIELD_Access_Workflow_Description="Flujo de trabajo ó combinación de tareas";

@XendraTrl(Identifier="c7bf80d8-7e8a-81f3-caaf-752774ae0c02")
public static String es_PE_FIELD_Access_Workflow_Help="El campo flujo de trabajo identifica un flujo de trabajo único en el sistema.";

@XendraField(AD_Column_ID="AD_Workflow_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f5a5d647-cfe6-5735-a8a3-0821d22c226b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c7bf80d8-7e8a-81f3-caaf-752774ae0c02")
public static final String FIELDNAME_Access_Workflow="c7bf80d8-7e8a-81f3-caaf-752774ae0c02";

@XendraTrl(Identifier="781fb563-72f2-bd11-5b95-eb3084da291e")
public static String es_PE_COLUMN_AD_Workflow_ID_Name="Flujo de Trabajo";

@XendraColumn(AD_Element_ID="43635d58-652b-b89d-db56-913820c290aa",ColumnName="AD_Workflow_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="781fb563-72f2-bd11-5b95-eb3084da291e",
Synchronized="2019-08-30 22:20:54.0")
/** Column name AD_Workflow_ID */
public static final String COLUMNNAME_AD_Workflow_ID = "AD_Workflow_ID";
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
@XendraTrl(Identifier="3c70a270-1141-4bb7-844f-bae7f195c70d")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3c70a270-1141-4bb7-844f-bae7f195c70d",
Synchronized="2019-08-30 22:20:54.0")
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

@XendraTrl(Identifier="ea5e8709-acf3-1b87-85a1-b3c522ba43e6")
public static String es_PE_FIELD_WorkflowAccess_ReadWrite_Name="Lectura Escritura";

@XendraTrl(Identifier="ea5e8709-acf3-1b87-85a1-b3c522ba43e6")
public static String es_PE_FIELD_WorkflowAccess_ReadWrite_Description="El campo es de lectura / escritura";

@XendraTrl(Identifier="ea5e8709-acf3-1b87-85a1-b3c522ba43e6")
public static String es_PE_FIELD_WorkflowAccess_ReadWrite_Help="El lectura escritura indica que este campo puede ser leído y actualizado.";

@XendraField(AD_Column_ID="IsReadWrite",IsCentrallyMaintained=true,
AD_Tab_ID="49a9f9ab-f960-39e5-7043-335117b0c0f3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ea5e8709-acf3-1b87-85a1-b3c522ba43e6")
public static final String FIELDNAME_WorkflowAccess_ReadWrite="ea5e8709-acf3-1b87-85a1-b3c522ba43e6";

@XendraTrl(Identifier="c69c9f2e-4f46-42c4-0139-1a8ad487f9c9")
public static String es_PE_FIELD_Access_ReadWrite_Name="Lectura Escritura";

@XendraTrl(Identifier="c69c9f2e-4f46-42c4-0139-1a8ad487f9c9")
public static String es_PE_FIELD_Access_ReadWrite_Description="El campo es de lectura / escritura";

@XendraTrl(Identifier="c69c9f2e-4f46-42c4-0139-1a8ad487f9c9")
public static String es_PE_FIELD_Access_ReadWrite_Help="El lectura escritura indica que este campo puede ser leído y actualizado.";

@XendraField(AD_Column_ID="IsReadWrite",IsCentrallyMaintained=true,
AD_Tab_ID="f5a5d647-cfe6-5735-a8a3-0821d22c226b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c69c9f2e-4f46-42c4-0139-1a8ad487f9c9")
public static final String FIELDNAME_Access_ReadWrite="c69c9f2e-4f46-42c4-0139-1a8ad487f9c9";

@XendraTrl(Identifier="afda4958-146c-9a71-0e46-9eca50b5ae4e")
public static String es_PE_COLUMN_IsReadWrite_Name="Lectura Escritura";

@XendraColumn(AD_Element_ID="fc616898-5f46-981e-906f-9a5ddb486499",ColumnName="IsReadWrite",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="afda4958-146c-9a71-0e46-9eca50b5ae4e",
Synchronized="2019-08-30 22:20:54.0")
/** Column name IsReadWrite */
public static final String COLUMNNAME_IsReadWrite = "IsReadWrite";
}
