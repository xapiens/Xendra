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
import org.compiere.model.reference.REF__YesNo;
import org.compiere.model.reference.REF_AD_MenuAction;
import org.compiere.model.reference.REF_AD_SystemStatus;
/** Generated Model for AD_Issue
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_Issue extends PO
{
/** Standard Constructor
@param ctx context
@param AD_Issue_ID id
@param trxName transaction
*/
public X_AD_Issue (Properties ctx, int AD_Issue_ID, String trxName)
{
super (ctx, AD_Issue_ID, trxName);
/** if (AD_Issue_ID == 0)
{
setAD_Issue_ID (0);
setIssueSummary (null);
setName (null);	
// .
setProcessed (false);	
// N
setReleaseNo (null);	
// .
setSystemStatus (null);	
// E
setUserName (null);	
// .
setVersion (null);	
// .
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_Issue (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
static void X_AD_Issue() {
	try {
		
	} catch (Exception e) {
		System.out.println(e);
	}
}
/** AD_Table_ID=828 */
public static int Table_ID=MTable.getTable_ID("AD_Issue");

@XendraTrl(Identifier="8a1139bd-dd03-4685-c329-8ca3e5675a7e")
public static String es_PE_TAB_SystemIssue_Description="Creado Automáticamente o Reporte Versión de Sistema ingresado manualmente";

@XendraTrl(Identifier="8a1139bd-dd03-4685-c329-8ca3e5675a7e")
public static String es_PE_TAB_SystemIssue_Name="Versión de Sistema";

@XendraTrl(Identifier="8a1139bd-dd03-4685-c329-8ca3e5675a7e")
public static String es_PE_TAB_SystemIssue_Help="Las versiones de sistema son creadas para apresurar la resolución de cualquier versión de sistema relacionaddo (errores potenciales). Si habilitó, automáticaamente son reportados a Adempiere. No sé transfiere información confidencial.";

@XendraTab(Name="System Issue",
Description="Automatically created or manually entered System Issue Reporting",
Help="System Issues are created to speed up the resolution of any system related issues (potential bugs).  If enabled, they are automatically reported to Adempiere.  No data or confidential information is transferred.",
AD_Window_ID="1458551b-4748-9880-89c0-451da5092150",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="8a1139bd-dd03-4685-c329-8ca3e5675a7e",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_SystemIssue="8a1139bd-dd03-4685-c329-8ca3e5675a7e";

@XendraTrl(Identifier="08706472-185e-abaf-c9b8-a1d0bf90323e")
public static String es_PE_TABLE_AD_Issue_Name="Edición del Sistema";

@XendraTable(Name="System Issue",Description="",Help="",TableName="AD_Issue",AccessLevel="6",
AD_Window_ID="1458551b-4748-9880-89c0-451da5092150",AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.dictionary",Identifier="08706472-185e-abaf-c9b8-a1d0bf90323e",
Synchronized="2017-08-16 11:40:24.0")
/** TableName=AD_Issue */
public static final String Table_Name="AD_Issue";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_Issue");

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
    Table_ID = MTable.getTable_ID("AD_Issue");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_Issue[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Asset.
@param A_Asset_ID Asset used internally or by customers */
public void setA_Asset_ID (int A_Asset_ID)
{
if (A_Asset_ID <= 0) set_ValueNoCheck (COLUMNNAME_A_Asset_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_A_Asset_ID, Integer.valueOf(A_Asset_ID));
}
/** Get Asset.
@return Asset used internally or by customers */
public int getA_Asset_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_A_Asset_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="0f79e1d0-904a-393d-14c5-16fd19e05b52")
public static String es_PE_FIELD_SystemIssue_Asset_Description="Activo usado por la compañía o sus clientes";

@XendraTrl(Identifier="0f79e1d0-904a-393d-14c5-16fd19e05b52")
public static String es_PE_FIELD_SystemIssue_Asset_Help="Indica si es usado por la compañia o sus clientes";

@XendraTrl(Identifier="0f79e1d0-904a-393d-14c5-16fd19e05b52")
public static String es_PE_FIELD_SystemIssue_Asset_Name="Activo";

@XendraField(AD_Column_ID="A_Asset_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8a1139bd-dd03-4685-c329-8ca3e5675a7e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@Record_ID@=0",DisplayLength=10,IsReadOnly=true,SeqNo=270,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0f79e1d0-904a-393d-14c5-16fd19e05b52")
public static final String FIELDNAME_SystemIssue_Asset="0f79e1d0-904a-393d-14c5-16fd19e05b52";

@XendraTrl(Identifier="3d30bc2e-8ccb-e4df-b7e6-bec1a7197775")
public static String es_PE_COLUMN_A_Asset_ID_Name="Activo";

@XendraColumn(AD_Element_ID="3cd84c49-e25b-9ecc-5637-ed9a07d76bee",ColumnName="A_Asset_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3d30bc2e-8ccb-e4df-b7e6-bec1a7197775",
Synchronized="2017-08-05 16:52:34.0")
/** Column name A_Asset_ID */
public static final String COLUMNNAME_A_Asset_ID = "A_Asset_ID";
/** Set Special Form.
@param AD_Form_ID Special Form */
public void setAD_Form_ID (int AD_Form_ID)
{
if (AD_Form_ID <= 0) set_Value (COLUMNNAME_AD_Form_ID, null);
 else 
set_Value (COLUMNNAME_AD_Form_ID, Integer.valueOf(AD_Form_ID));
}
/** Get Special Form.
@return Special Form */
public int getAD_Form_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Form_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="31d3c853-7d0a-330a-0971-46b158ebbb1a")
public static String es_PE_FIELD_SystemIssue_SpecialForm_Description="Forma especial";

@XendraTrl(Identifier="31d3c853-7d0a-330a-0971-46b158ebbb1a")
public static String es_PE_FIELD_SystemIssue_SpecialForm_Help="El campo forma especial identifica una forma especial única en el sistema.";

@XendraTrl(Identifier="31d3c853-7d0a-330a-0971-46b158ebbb1a")
public static String es_PE_FIELD_SystemIssue_SpecialForm_Name="Forma Especial";

@XendraField(AD_Column_ID="AD_Form_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8a1139bd-dd03-4685-c329-8ca3e5675a7e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IssueSource@=X",DisplayLength=10,IsReadOnly=false,SeqNo=120,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="31d3c853-7d0a-330a-0971-46b158ebbb1a")
public static final String FIELDNAME_SystemIssue_SpecialForm="31d3c853-7d0a-330a-0971-46b158ebbb1a";

@XendraTrl(Identifier="3bf96df8-569e-5c82-0e9c-5126c4900e1e")
public static String es_PE_COLUMN_AD_Form_ID_Name="Forma Especial";

@XendraColumn(AD_Element_ID="6e3fcf05-8a76-e0af-25a6-7a4ab20551f4",ColumnName="AD_Form_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3bf96df8-569e-5c82-0e9c-5126c4900e1e",
Synchronized="2017-08-05 16:52:34.0")
/** Column name AD_Form_ID */
public static final String COLUMNNAME_AD_Form_ID = "AD_Form_ID";
/** Set System Issue.
@param AD_Issue_ID Automatically CREATED or manually entered System Issue */
public void setAD_Issue_ID (int AD_Issue_ID)
{
if (AD_Issue_ID < 1) throw new IllegalArgumentException ("AD_Issue_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_Issue_ID, Integer.valueOf(AD_Issue_ID));
}
/** Get System Issue.
@return Automatically CREATED or manually entered System Issue */
public int getAD_Issue_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Issue_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="34a3a085-72d5-6b32-b53c-6b35085847c5")
public static String es_PE_FIELD_SystemIssue_SystemIssue_Description="Edición del Sistema Creada Automáticamente o Ingresada Manualmente  ";

@XendraTrl(Identifier="34a3a085-72d5-6b32-b53c-6b35085847c5")
public static String es_PE_FIELD_SystemIssue_SystemIssue_Help="Las ediciónes de  sistema son creadas para acelerar la resolución de cualquier edición relacionada del sistema (errores potenciales). Si es habilitado, serán reportados automáticamente a Adempiere. No se transfiere información confidencial.";

@XendraTrl(Identifier="34a3a085-72d5-6b32-b53c-6b35085847c5")
public static String es_PE_FIELD_SystemIssue_SystemIssue_Name="Edición del Sistema";

@XendraField(AD_Column_ID="AD_Issue_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8a1139bd-dd03-4685-c329-8ca3e5675a7e",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="34a3a085-72d5-6b32-b53c-6b35085847c5")
public static final String FIELDNAME_SystemIssue_SystemIssue="34a3a085-72d5-6b32-b53c-6b35085847c5";
/** Column name AD_Issue_ID */
public static final String COLUMNNAME_AD_Issue_ID = "AD_Issue_ID";
/** Set Process.
@param AD_Process_ID Process or Report */
public void setAD_Process_ID (int AD_Process_ID)
{
if (AD_Process_ID <= 0) set_Value (COLUMNNAME_AD_Process_ID, null);
 else 
set_Value (COLUMNNAME_AD_Process_ID, Integer.valueOf(AD_Process_ID));
}
/** Get Process.
@return Process or Report */
public int getAD_Process_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Process_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="49c0912f-d17b-0ff3-081e-e539ac637866")
public static String es_PE_FIELD_SystemIssue_Process_Description="Proceso ó Informe";

@XendraTrl(Identifier="49c0912f-d17b-0ff3-081e-e539ac637866")
public static String es_PE_FIELD_SystemIssue_Process_Help="El campo proceso identifica un proceso ó Informe único en el sistema.";

@XendraTrl(Identifier="49c0912f-d17b-0ff3-081e-e539ac637866")
public static String es_PE_FIELD_SystemIssue_Process_Name="Proceso";

@XendraField(AD_Column_ID="AD_Process_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8a1139bd-dd03-4685-c329-8ca3e5675a7e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IssueSource@=R | @IssueSource@=P",DisplayLength=10,IsReadOnly=false,SeqNo=110,
SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="49c0912f-d17b-0ff3-081e-e539ac637866")
public static final String FIELDNAME_SystemIssue_Process="49c0912f-d17b-0ff3-081e-e539ac637866";

@XendraTrl(Identifier="44743d3d-a49a-5874-b38e-96d0e6fea916")
public static String es_PE_COLUMN_AD_Process_ID_Name="Proceso";

@XendraColumn(AD_Element_ID="60982cc9-e937-d374-4608-1c3f64b16d3b",ColumnName="AD_Process_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="44743d3d-a49a-5874-b38e-96d0e6fea916",
Synchronized="2017-08-05 16:52:34.0")
/** Column name AD_Process_ID */
public static final String COLUMNNAME_AD_Process_ID = "AD_Process_ID";
/** Set Window.
@param AD_Window_ID Data entry or display window */
public void setAD_Window_ID (int AD_Window_ID)
{
if (AD_Window_ID <= 0) set_Value (COLUMNNAME_AD_Window_ID, null);
 else 
set_Value (COLUMNNAME_AD_Window_ID, Integer.valueOf(AD_Window_ID));
}
/** Get Window.
@return Data entry or display window */
public int getAD_Window_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Window_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="52830e87-7163-1961-75ea-0197b7fbe5e6")
public static String es_PE_FIELD_SystemIssue_Window_Description="Ventana de entrada de datos ó despliegue";

@XendraTrl(Identifier="52830e87-7163-1961-75ea-0197b7fbe5e6")
public static String es_PE_FIELD_SystemIssue_Window_Help="El campo ventana identifica una ventana única en el sistema";

@XendraTrl(Identifier="52830e87-7163-1961-75ea-0197b7fbe5e6")
public static String es_PE_FIELD_SystemIssue_Window_Name="Ventana";

@XendraField(AD_Column_ID="AD_Window_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8a1139bd-dd03-4685-c329-8ca3e5675a7e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IssueSource@=W",DisplayLength=10,IsReadOnly=false,SeqNo=100,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="52830e87-7163-1961-75ea-0197b7fbe5e6")
public static final String FIELDNAME_SystemIssue_Window="52830e87-7163-1961-75ea-0197b7fbe5e6";

@XendraTrl(Identifier="63ebb05f-0f9f-ffee-4d14-38e783fbcd32")
public static String es_PE_COLUMN_AD_Window_ID_Name="Ventana";

@XendraColumn(AD_Element_ID="0c50cb0e-febe-8650-2621-11ba77688276",ColumnName="AD_Window_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="63ebb05f-0f9f-ffee-4d14-38e783fbcd32",
Synchronized="2017-08-05 16:52:34.0")
/** Column name AD_Window_ID */
public static final String COLUMNNAME_AD_Window_ID = "AD_Window_ID";
/** Set Comments.
@param Comments Comments or additional information */
public void setComments (String Comments)
{
set_Value (COLUMNNAME_Comments, Comments);
}
/** Get Comments.
@return Comments or additional information */
public String getComments() 
{
String value = (String)get_Value(COLUMNNAME_Comments);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="1fe16802-132d-a126-646e-e1331059b34e")
public static String es_PE_FIELD_SystemIssue_Comments_Description="Comentarios ó información adicional";

@XendraTrl(Identifier="1fe16802-132d-a126-646e-e1331059b34e")
public static String es_PE_FIELD_SystemIssue_Comments_Help="El campo comentarios permite entrada en formato libre de información adicional";

@XendraTrl(Identifier="1fe16802-132d-a126-646e-e1331059b34e")
public static String es_PE_FIELD_SystemIssue_Comments_Name="Comentarios";

@XendraField(AD_Column_ID="Comments",IsCentrallyMaintained=true,
AD_Tab_ID="8a1139bd-dd03-4685-c329-8ca3e5675a7e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=2000,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1fe16802-132d-a126-646e-e1331059b34e")
public static final String FIELDNAME_SystemIssue_Comments="1fe16802-132d-a126-646e-e1331059b34e";

@XendraTrl(Identifier="5fe6a68a-acc1-3370-e04a-b7c05e0cb21b")
public static String es_PE_COLUMN_Comments_Name="Comentarios";

@XendraColumn(AD_Element_ID="68725fe2-3419-b727-d8d4-8bf5d0d8cfc2",ColumnName="Comments",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5fe6a68a-acc1-3370-e04a-b7c05e0cb21b",
Synchronized="2017-08-05 16:52:34.0")
/** Column name Comments */
public static final String COLUMNNAME_Comments = "Comments";
/** Set Database.
@param DatabaseInfo Database Information */
public void setDatabaseInfo (String DatabaseInfo)
{
if (DatabaseInfo != null && DatabaseInfo.length() > 255)
{
log.warning("Length > 255 - truncated");
DatabaseInfo = DatabaseInfo.substring(0,254);
}
set_ValueNoCheck (COLUMNNAME_DatabaseInfo, DatabaseInfo);
}
/** Get Database.
@return Database Information */
public String getDatabaseInfo() 
{
String value = (String)get_Value(COLUMNNAME_DatabaseInfo);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="43e5576a-09a2-5945-d543-9d2393386f5d")
public static String es_PE_FIELD_SystemIssue_Database_Description="Información Base de Datos";

@XendraTrl(Identifier="43e5576a-09a2-5945-d543-9d2393386f5d")
public static String es_PE_FIELD_SystemIssue_Database_Name="Base de Datos";

@XendraField(AD_Column_ID="DatabaseInfo",IsCentrallyMaintained=true,
AD_Tab_ID="8a1139bd-dd03-4685-c329-8ca3e5675a7e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@Record_ID@=0",DisplayLength=40,IsReadOnly=true,SeqNo=420,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="43e5576a-09a2-5945-d543-9d2393386f5d")
public static final String FIELDNAME_SystemIssue_Database="43e5576a-09a2-5945-d543-9d2393386f5d";

@XendraTrl(Identifier="e0066185-65fa-673e-bc6b-d98a2141ad47")
public static String es_PE_COLUMN_DatabaseInfo_Name="Base de Datos";

@XendraColumn(AD_Element_ID="3faf78a0-f94e-6fc7-e941-a45378b4d056",ColumnName="DatabaseInfo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e0066185-65fa-673e-bc6b-d98a2141ad47",
Synchronized="2017-08-05 16:52:34.0")
/** Column name DatabaseInfo */
public static final String COLUMNNAME_DatabaseInfo = "DatabaseInfo";
/** Set DB Address.
@param DBAddress JDBC URL of the database server */
public void setDBAddress (String DBAddress)
{
if (DBAddress != null && DBAddress.length() > 255)
{
log.warning("Length > 255 - truncated");
DBAddress = DBAddress.substring(0,254);
}
set_ValueNoCheck (COLUMNNAME_DBAddress, DBAddress);
}
/** Get DB Address.
@return JDBC URL of the database server */
public String getDBAddress() 
{
String value = (String)get_Value(COLUMNNAME_DBAddress);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="283dcae9-013c-b171-4253-20742f6f73bc")
public static String es_PE_FIELD_SystemIssue_DBAddress_Description="Dirección de BD servidor";

@XendraTrl(Identifier="283dcae9-013c-b171-4253-20742f6f73bc")
public static String es_PE_FIELD_SystemIssue_DBAddress_Name="Dirección de BD Servidor";

@XendraField(AD_Column_ID="DBAddress",IsCentrallyMaintained=true,
AD_Tab_ID="8a1139bd-dd03-4685-c329-8ca3e5675a7e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@Record_ID@=0",DisplayLength=20,IsReadOnly=true,SeqNo=340,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="283dcae9-013c-b171-4253-20742f6f73bc")
public static final String FIELDNAME_SystemIssue_DBAddress="283dcae9-013c-b171-4253-20742f6f73bc";

@XendraTrl(Identifier="c8547522-479c-a246-ddcb-cf9cb2f38f25")
public static String es_PE_COLUMN_DBAddress_Name="Dirección de BD Servidor";

@XendraColumn(AD_Element_ID="ec6efc21-e877-d4e1-1d31-67dac89f2532",ColumnName="DBAddress",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c8547522-479c-a246-ddcb-cf9cb2f38f25",
Synchronized="2017-08-05 16:52:34.0")
/** Column name DBAddress */
public static final String COLUMNNAME_DBAddress = "DBAddress";
/** Set Error Trace.
@param ErrorTrace System Error Trace */
public void setErrorTrace (String ErrorTrace)
{
set_Value (COLUMNNAME_ErrorTrace, ErrorTrace);
}
/** Get Error Trace.
@return System Error Trace */
public String getErrorTrace() 
{
String value = (String)get_Value(COLUMNNAME_ErrorTrace);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="75f6e1d9-425b-1ebf-a01a-d750ad58bb98")
public static String es_PE_FIELD_SystemIssue_ErrorTrace_Description="Error de Seguimiento del Sistema ";

@XendraTrl(Identifier="75f6e1d9-425b-1ebf-a01a-d750ad58bb98")
public static String es_PE_FIELD_SystemIssue_ErrorTrace_Help="Java Información de Seguimiento";

@XendraTrl(Identifier="75f6e1d9-425b-1ebf-a01a-d750ad58bb98")
public static String es_PE_FIELD_SystemIssue_ErrorTrace_Name="Error de Seguimiento";

@XendraField(AD_Column_ID="ErrorTrace",IsCentrallyMaintained=true,
AD_Tab_ID="8a1139bd-dd03-4685-c329-8ca3e5675a7e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=2000,IsReadOnly=false,SeqNo=210,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="75f6e1d9-425b-1ebf-a01a-d750ad58bb98")
public static final String FIELDNAME_SystemIssue_ErrorTrace="75f6e1d9-425b-1ebf-a01a-d750ad58bb98";

@XendraTrl(Identifier="2ce43764-1205-aa94-e40e-4d42a2593908")
public static String es_PE_COLUMN_ErrorTrace_Name="Error de Seguimiento";

@XendraColumn(AD_Element_ID="d6d8ac6d-8fc1-49a0-9eca-ba965b0abb74",ColumnName="ErrorTrace",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2ce43764-1205-aa94-e40e-4d42a2593908",
Synchronized="2017-08-05 16:52:34.0")
/** Column name ErrorTrace */
public static final String COLUMNNAME_ErrorTrace = "ErrorTrace";
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
@XendraTrl(Identifier="138af51d-49c0-4f9e-8b7c-75294c5b9a21")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="138af51d-49c0-4f9e-8b7c-75294c5b9a21",
Synchronized="2017-08-05 16:52:34.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";

/** IsReproducible AD_Reference=9d5d423d-1f38-e653-2094-21cc989d1234 */
public static final int ISREPRODUCIBLE_AD_Reference_ID=319;
/** Set Reproducible.
@param IsReproducible Problem can re reproduced in Gardenworld */
public void setIsReproducible (String IsReproducible)
{
if (IsReproducible == null || IsReproducible.equals(REF__YesNo.Yes) || IsReproducible.equals(REF__YesNo.No));
 else throw new IllegalArgumentException ("IsReproducible Invalid value - " + IsReproducible + " - Reference_ID=319 - Y - N");
if (IsReproducible != null && IsReproducible.length() > 1)
{
log.warning("Length > 1 - truncated");
IsReproducible = IsReproducible.substring(0,0);
}
set_Value (COLUMNNAME_IsReproducible, IsReproducible);
}
/** Get Reproducible.
@return Problem can re reproduced in Gardenworld */
public String getIsReproducible() 
{
return (String)get_Value(COLUMNNAME_IsReproducible);
}

@XendraTrl(Identifier="57d763b2-245a-f3dd-38df-a75593e5f8a7")
public static String es_PE_FIELD_SystemIssue_Reproducible_Description="Puede Problema ser reproducido en Gardenworld";

@XendraTrl(Identifier="57d763b2-245a-f3dd-38df-a75593e5f8a7")
public static String es_PE_FIELD_SystemIssue_Reproducible_Help="El problema también ocurre en la Distribución estándar en el demo compañía  Gardenworld.";

@XendraTrl(Identifier="57d763b2-245a-f3dd-38df-a75593e5f8a7")
public static String es_PE_FIELD_SystemIssue_Reproducible_Name="Reproducible";

@XendraField(AD_Column_ID="IsReproducible",IsCentrallyMaintained=true,
AD_Tab_ID="8a1139bd-dd03-4685-c329-8ca3e5675a7e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="57d763b2-245a-f3dd-38df-a75593e5f8a7")
public static final String FIELDNAME_SystemIssue_Reproducible="57d763b2-245a-f3dd-38df-a75593e5f8a7";

@XendraTrl(Identifier="a81f7911-bb08-661e-ee1f-b1b3eb56ec17")
public static String es_PE_COLUMN_IsReproducible_Name="Reproducible";

@XendraColumn(AD_Element_ID="931b7d38-7036-ea0c-7688-d31d04cae8f1",ColumnName="IsReproducible",
AD_Reference_ID=17,AD_Reference_Value_ID="9d5d423d-1f38-e653-2094-21cc989d1234",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="a81f7911-bb08-661e-ee1f-b1b3eb56ec17",Synchronized="2017-08-05 16:52:34.0")
/** Column name IsReproducible */
public static final String COLUMNNAME_IsReproducible = "IsReproducible";

/** IssueSource AD_Reference=e7221c7b-2e98-09e1-fdde-58d677721189 */
public static final int ISSUESOURCE_AD_Reference_ID=104;
/** Set Source.
@param IssueSource Issue Source */
public void setIssueSource (String IssueSource)
{
if (IssueSource == null || IssueSource.equals(REF_AD_MenuAction.Process) || IssueSource.equals(REF_AD_MenuAction.Workbench) || IssueSource.equals(REF_AD_MenuAction.Window) || IssueSource.equals(REF_AD_MenuAction.Task) || IssueSource.equals(REF_AD_MenuAction.Form) || IssueSource.equals(REF_AD_MenuAction.Report) || IssueSource.equals(REF_AD_MenuAction.WorkFlow));
 else throw new IllegalArgumentException ("IssueSource Invalid value - " + IssueSource + " - Reference_ID=104 - P - B - W - T - X - R - F");
if (IssueSource != null && IssueSource.length() > 1)
{
log.warning("Length > 1 - truncated");
IssueSource = IssueSource.substring(0,0);
}
set_Value (COLUMNNAME_IssueSource, IssueSource);
}
/** Get Source.
@return Issue Source */
public String getIssueSource() 
{
return (String)get_Value(COLUMNNAME_IssueSource);
}

@XendraTrl(Identifier="63bc4877-44e0-8dbc-384b-d5e25138b690")
public static String es_PE_FIELD_SystemIssue_Source_Description="Issue Source";

@XendraTrl(Identifier="63bc4877-44e0-8dbc-384b-d5e25138b690")
public static String es_PE_FIELD_SystemIssue_Source_Help="Source of the Issue";

@XendraTrl(Identifier="63bc4877-44e0-8dbc-384b-d5e25138b690")
public static String es_PE_FIELD_SystemIssue_Source_Name="Source";

@XendraField(AD_Column_ID="IssueSource",IsCentrallyMaintained=true,
AD_Tab_ID="8a1139bd-dd03-4685-c329-8ca3e5675a7e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="63bc4877-44e0-8dbc-384b-d5e25138b690")
public static final String FIELDNAME_SystemIssue_Source="63bc4877-44e0-8dbc-384b-d5e25138b690";

@XendraTrl(Identifier="3d830a5b-639b-0000-4594-df9b04de619e")
public static String es_PE_COLUMN_IssueSource_Name="Source";

@XendraColumn(AD_Element_ID="0cfc8dba-4649-b271-21dc-aa3eecb1b33d",ColumnName="IssueSource",
AD_Reference_ID=17,AD_Reference_Value_ID="e7221c7b-2e98-09e1-fdde-58d677721189",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="3d830a5b-639b-0000-4594-df9b04de619e",Synchronized="2017-08-05 16:52:34.0")
/** Column name IssueSource */
public static final String COLUMNNAME_IssueSource = "IssueSource";
/** Set Issue Summary.
@param IssueSummary Issue Summary */
public void setIssueSummary (String IssueSummary)
{
if (IssueSummary == null) throw new IllegalArgumentException ("IssueSummary is mandatory.");
if (IssueSummary.length() > 2000)
{
log.warning("Length > 2000 - truncated");
IssueSummary = IssueSummary.substring(0,1999);
}
set_Value (COLUMNNAME_IssueSummary, IssueSummary);
}
/** Get Issue Summary.
@return Issue Summary */
public String getIssueSummary() 
{
String value = (String)get_Value(COLUMNNAME_IssueSummary);
if (value == null)
  return "";
return value;
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), getIssueSummary());
}

@XendraTrl(Identifier="575a028d-f221-236b-77cd-6fb45b6f3eca")
public static String es_PE_FIELD_SystemIssue_IssueSummary_Description="Edición Sumario ";

@XendraTrl(Identifier="575a028d-f221-236b-77cd-6fb45b6f3eca")
public static String es_PE_FIELD_SystemIssue_IssueSummary_Name="Edición Sumario ";

@XendraField(AD_Column_ID="IssueSummary",IsCentrallyMaintained=true,
AD_Tab_ID="8a1139bd-dd03-4685-c329-8ca3e5675a7e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=255,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="575a028d-f221-236b-77cd-6fb45b6f3eca")
public static final String FIELDNAME_SystemIssue_IssueSummary="575a028d-f221-236b-77cd-6fb45b6f3eca";

@XendraTrl(Identifier="622805cf-6656-152e-9a37-f281c7c31ca0")
public static String es_PE_COLUMN_IssueSummary_Name="Edición Sumario ";

@XendraColumn(AD_Element_ID="ab895f6f-cac4-a3bd-68cf-26edc358e728",ColumnName="IssueSummary",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="622805cf-6656-152e-9a37-f281c7c31ca0",
Synchronized="2017-08-05 16:52:34.0")
/** Column name IssueSummary */
public static final String COLUMNNAME_IssueSummary = "IssueSummary";

/** IsVanillaSystem AD_Reference=9d5d423d-1f38-e653-2094-21cc989d1234 */
public static final int ISVANILLASYSTEM_AD_Reference_ID=319;
/** Set Vanilla System.
@param IsVanillaSystem The system was NOT compiled from Source - i.e. standard distribution */
public void setIsVanillaSystem (String IsVanillaSystem)
{
if (IsVanillaSystem == null || IsVanillaSystem.equals(REF__YesNo.Yes) || IsVanillaSystem.equals(REF__YesNo.No));
 else throw new IllegalArgumentException ("IsVanillaSystem Invalid value - " + IsVanillaSystem + " - Reference_ID=319 - Y - N");
if (IsVanillaSystem != null && IsVanillaSystem.length() > 1)
{
log.warning("Length > 1 - truncated");
IsVanillaSystem = IsVanillaSystem.substring(0,0);
}
set_Value (COLUMNNAME_IsVanillaSystem, IsVanillaSystem);
}
/** Get Vanilla System.
@return The system was NOT compiled from Source - i.e. standard distribution */
public String getIsVanillaSystem() 
{
return (String)get_Value(COLUMNNAME_IsVanillaSystem);
}

@XendraTrl(Identifier="4e914e86-e876-b77a-3228-ed0ba454a2c0")
public static String es_PE_FIELD_SystemIssue_VanillaSystem_Description="El sistema NO fue Compilado desde fuente - ej. Distribución Estándar";

@XendraTrl(Identifier="4e914e86-e876-b77a-3228-ed0ba454a2c0")
public static String es_PE_FIELD_SystemIssue_VanillaSystem_Help="Usted puede tener personalizaciones, Columnas adicionales, Tablas, etc - pero ninguna modificación  del código que requiere la compilación desde  fuente.";

@XendraTrl(Identifier="4e914e86-e876-b77a-3228-ed0ba454a2c0")
public static String es_PE_FIELD_SystemIssue_VanillaSystem_Name="Sistema Vanilla ";

@XendraField(AD_Column_ID="IsVanillaSystem",IsCentrallyMaintained=true,
AD_Tab_ID="8a1139bd-dd03-4685-c329-8ca3e5675a7e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4e914e86-e876-b77a-3228-ed0ba454a2c0")
public static final String FIELDNAME_SystemIssue_VanillaSystem="4e914e86-e876-b77a-3228-ed0ba454a2c0";

@XendraTrl(Identifier="e92d353d-4860-7ca4-d4de-4230d49596f1")
public static String es_PE_COLUMN_IsVanillaSystem_Name="Sistema Vanilla ";

@XendraColumn(AD_Element_ID="31bc17e1-6cce-6017-a558-b3d630bbd41a",ColumnName="IsVanillaSystem",
AD_Reference_ID=17,AD_Reference_Value_ID="9d5d423d-1f38-e653-2094-21cc989d1234",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="e92d353d-4860-7ca4-d4de-4230d49596f1",Synchronized="2017-08-05 16:52:34.0")
/** Column name IsVanillaSystem */
public static final String COLUMNNAME_IsVanillaSystem = "IsVanillaSystem";
/** Set Java Info.
@param JavaInfo Java Version Info */
public void setJavaInfo (String JavaInfo)
{
if (JavaInfo != null && JavaInfo.length() > 255)
{
log.warning("Length > 255 - truncated");
JavaInfo = JavaInfo.substring(0,254);
}
set_ValueNoCheck (COLUMNNAME_JavaInfo, JavaInfo);
}
/** Get Java Info.
@return Java Version Info */
public String getJavaInfo() 
{
String value = (String)get_Value(COLUMNNAME_JavaInfo);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="edbe8ca3-3e34-0274-61bd-9fef345d942d")
public static String es_PE_FIELD_SystemIssue_JavaInfo_Description="Información de la Versión de Java ";

@XendraTrl(Identifier="edbe8ca3-3e34-0274-61bd-9fef345d942d")
public static String es_PE_FIELD_SystemIssue_JavaInfo_Name="Java Información";

@XendraField(AD_Column_ID="JavaInfo",IsCentrallyMaintained=true,
AD_Tab_ID="8a1139bd-dd03-4685-c329-8ca3e5675a7e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@Record_ID@=0",DisplayLength=20,IsReadOnly=true,SeqNo=410,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="edbe8ca3-3e34-0274-61bd-9fef345d942d")
public static final String FIELDNAME_SystemIssue_JavaInfo="edbe8ca3-3e34-0274-61bd-9fef345d942d";

@XendraTrl(Identifier="04507ab9-54e7-1bb6-6ac4-35ac92d1432f")
public static String es_PE_COLUMN_JavaInfo_Name="Java Información";

@XendraColumn(AD_Element_ID="4a148295-41ba-99ea-8ad0-91b34a9e210f",ColumnName="JavaInfo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="04507ab9-54e7-1bb6-6ac4-35ac92d1432f",
Synchronized="2017-08-05 16:52:34.0")
/** Column name JavaInfo */
public static final String COLUMNNAME_JavaInfo = "JavaInfo";
/** Set Line.
@param LineNo Line No */
public void setLineNo (int LineNo)
{
set_Value (COLUMNNAME_LineNo, Integer.valueOf(LineNo));
}
/** Get Line.
@return Line No */
public int getLineNo() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_LineNo);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="82f67466-6fc9-7fa4-4b35-a306e1aa725b")
public static String es_PE_FIELD_SystemIssue_Line_Description="No Item";

@XendraTrl(Identifier="82f67466-6fc9-7fa4-4b35-a306e1aa725b")
public static String es_PE_FIELD_SystemIssue_Line_Help="";

@XendraTrl(Identifier="82f67466-6fc9-7fa4-4b35-a306e1aa725b")
public static String es_PE_FIELD_SystemIssue_Line_Name="Item";
@XendraField(AD_Column_ID="LineNo",
IsCentrallyMaintained=true,AD_Tab_ID="8a1139bd-dd03-4685-c329-8ca3e5675a7e",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=190,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="82f67466-6fc9-7fa4-4b35-a306e1aa725b")
public static final String FIELDNAME_SystemIssue_Line="82f67466-6fc9-7fa4-4b35-a306e1aa725b";

@XendraTrl(Identifier="db4e3956-38c1-74fa-248a-96b34f5ac7b6")
public static String es_PE_COLUMN_LineNo_Name="Línea";

@XendraColumn(AD_Element_ID="d65a0cd1-ddc9-8ae6-6fdc-2d7a54968ace",ColumnName="LineNo",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="db4e3956-38c1-74fa-248a-96b34f5ac7b6",
Synchronized="2017-08-05 16:52:34.0")
/** Column name LineNo */
public static final String COLUMNNAME_LineNo = "LineNo";
/** Set Local Host.
@param Local_Host Local Host Info */
public void setLocal_Host (String Local_Host)
{
if (Local_Host != null && Local_Host.length() > 120)
{
log.warning("Length > 120 - truncated");
Local_Host = Local_Host.substring(0,119);
}
set_ValueNoCheck (COLUMNNAME_Local_Host, Local_Host);
}
/** Get Local Host.
@return Local Host Info */
public String getLocal_Host() 
{
String value = (String)get_Value(COLUMNNAME_Local_Host);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="0cd691d6-4ae8-0101-f4d7-1043c91c053d")
public static String es_PE_FIELD_SystemIssue_LocalHost_Description="Información Host Local ";

@XendraTrl(Identifier="0cd691d6-4ae8-0101-f4d7-1043c91c053d")
public static String es_PE_FIELD_SystemIssue_LocalHost_Name="Host Local ";

@XendraField(AD_Column_ID="Local_Host",IsCentrallyMaintained=true,
AD_Tab_ID="8a1139bd-dd03-4685-c329-8ca3e5675a7e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@Record_ID@=0",DisplayLength=20,IsReadOnly=true,SeqNo=350,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0cd691d6-4ae8-0101-f4d7-1043c91c053d")
public static final String FIELDNAME_SystemIssue_LocalHost="0cd691d6-4ae8-0101-f4d7-1043c91c053d";

@XendraTrl(Identifier="ff7e0680-9143-671d-fae8-3788f3f14d27")
public static String es_PE_COLUMN_Local_Host_Name="Host Local ";

@XendraColumn(AD_Element_ID="626bc4ac-da44-5249-f3da-572bbe15e75c",ColumnName="Local_Host",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=120,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ff7e0680-9143-671d-fae8-3788f3f14d27",
Synchronized="2017-08-05 16:52:34.0")
/** Column name Local_Host */
public static final String COLUMNNAME_Local_Host = "Local_Host";
/** Set Logger.
@param LoggerName Logger Name */
public void setLoggerName (String LoggerName)
{
if (LoggerName != null && LoggerName.length() > 60)
{
log.warning("Length > 60 - truncated");
LoggerName = LoggerName.substring(0,59);
}
set_Value (COLUMNNAME_LoggerName, LoggerName);
}
/** Get Logger.
@return Logger Name */
public String getLoggerName() 
{
String value = (String)get_Value(COLUMNNAME_LoggerName);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="f1135cc6-213e-48a1-a3aa-e9d45b2f98a9")
public static String es_PE_FIELD_SystemIssue_Logger_Description="Nombre de Historial";

@XendraTrl(Identifier="f1135cc6-213e-48a1-a3aa-e9d45b2f98a9")
public static String es_PE_FIELD_SystemIssue_Logger_Name="Historial";

@XendraField(AD_Column_ID="LoggerName",IsCentrallyMaintained=true,
AD_Tab_ID="8a1139bd-dd03-4685-c329-8ca3e5675a7e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=160,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f1135cc6-213e-48a1-a3aa-e9d45b2f98a9")
public static final String FIELDNAME_SystemIssue_Logger="f1135cc6-213e-48a1-a3aa-e9d45b2f98a9";

@XendraTrl(Identifier="b2f915f1-2cb5-2ee7-cae2-0d37f1be0020")
public static String es_PE_COLUMN_LoggerName_Name="Historial";

@XendraColumn(AD_Element_ID="b6d593de-40e4-d9f9-2f4c-efb1f0ccb212",ColumnName="LoggerName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b2f915f1-2cb5-2ee7-cae2-0d37f1be0020",
Synchronized="2017-08-05 16:52:34.0")
/** Column name LoggerName */
public static final String COLUMNNAME_LoggerName = "LoggerName";
/** Set Name.
@param Name Alphanumeric identifier of the entity */
public void setName (String Name)
{
if (Name == null) throw new IllegalArgumentException ("Name is mandatory.");
if (Name.length() > 120)
{
log.warning("Length > 120 - truncated");
Name = Name.substring(0,119);
}
set_ValueNoCheck (COLUMNNAME_Name, Name);
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
@XendraTrl(Identifier="a708b16f-155b-ef29-e35e-e78a63bd9448")
public static String es_PE_FIELD_SystemIssue_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="a708b16f-155b-ef29-e35e-e78a63bd9448")
public static String es_PE_FIELD_SystemIssue_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="a708b16f-155b-ef29-e35e-e78a63bd9448")
public static String es_PE_FIELD_SystemIssue_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="8a1139bd-dd03-4685-c329-8ca3e5675a7e",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="@Record_ID@=0",DisplayLength=20,IsReadOnly=true,SeqNo=300,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="a708b16f-155b-ef29-e35e-e78a63bd9448")
public static final String FIELDNAME_SystemIssue_Name="a708b16f-155b-ef29-e35e-e78a63bd9448";

@XendraTrl(Identifier="6dc702e4-67f6-89f5-bc94-0e3f2bfd60c6")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=120,DefaultValue=".",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=2,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6dc702e4-67f6-89f5-bc94-0e3f2bfd60c6",
Synchronized="2017-08-05 16:52:35.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Operating System.
@param OperatingSystemInfo Operating System Info */
public void setOperatingSystemInfo (String OperatingSystemInfo)
{
if (OperatingSystemInfo != null && OperatingSystemInfo.length() > 255)
{
log.warning("Length > 255 - truncated");
OperatingSystemInfo = OperatingSystemInfo.substring(0,254);
}
set_ValueNoCheck (COLUMNNAME_OperatingSystemInfo, OperatingSystemInfo);
}
/** Get Operating System.
@return Operating System Info */
public String getOperatingSystemInfo() 
{
String value = (String)get_Value(COLUMNNAME_OperatingSystemInfo);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="3593100a-9730-839b-2d01-8b48bd2da0d8")
public static String es_PE_FIELD_SystemIssue_OperatingSystem_Description="Información Sistema Operativo";

@XendraTrl(Identifier="3593100a-9730-839b-2d01-8b48bd2da0d8")
public static String es_PE_FIELD_SystemIssue_OperatingSystem_Name="Sistema Operativo";

@XendraField(AD_Column_ID="OperatingSystemInfo",IsCentrallyMaintained=true,
AD_Tab_ID="8a1139bd-dd03-4685-c329-8ca3e5675a7e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@Record_ID@=0",DisplayLength=20,IsReadOnly=true,SeqNo=400,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3593100a-9730-839b-2d01-8b48bd2da0d8")
public static final String FIELDNAME_SystemIssue_OperatingSystem="3593100a-9730-839b-2d01-8b48bd2da0d8";

@XendraTrl(Identifier="887c940b-f4d7-b60e-66dd-808736af39ae")
public static String es_PE_COLUMN_OperatingSystemInfo_Name="Sistema Operativo";

@XendraColumn(AD_Element_ID="675b898b-fe10-abd9-3155-0e08614f66af",
ColumnName="OperatingSystemInfo",AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=255,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="887c940b-f4d7-b60e-66dd-808736af39ae",Synchronized="2017-08-05 16:52:35.0")
/** Column name OperatingSystemInfo */
public static final String COLUMNNAME_OperatingSystemInfo = "OperatingSystemInfo";
/** Set Processed.
@param Processed The document has been processed */
public void setProcessed (boolean Processed)
{
set_ValueNoCheck (COLUMNNAME_Processed, Boolean.valueOf(Processed));
}
/** Get Processed.
@return The document has been processed */
public boolean isProcessed() 
{
Object oo = get_Value(COLUMNNAME_Processed);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="6a1a425f-84cb-3145-3807-7a1b367198fa")
public static String es_PE_FIELD_SystemIssue_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="6a1a425f-84cb-3145-3807-7a1b367198fa")
public static String es_PE_FIELD_SystemIssue_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraTrl(Identifier="6a1a425f-84cb-3145-3807-7a1b367198fa")
public static String es_PE_FIELD_SystemIssue_Processed_Name="Procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="8a1139bd-dd03-4685-c329-8ca3e5675a7e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=430,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6a1a425f-84cb-3145-3807-7a1b367198fa")
public static final String FIELDNAME_SystemIssue_Processed="6a1a425f-84cb-3145-3807-7a1b367198fa";

@XendraTrl(Identifier="2316681e-2690-4347-647d-0f59ac8e8be1")
public static String es_PE_COLUMN_Processed_Name="Procesado";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2316681e-2690-4347-647d-0f59ac8e8be1",
Synchronized="2017-08-05 16:52:35.0")
/** Column name Processed */
public static final String COLUMNNAME_Processed = "Processed";
/** Set Process Now.
@param Processing Process Now */
public void setProcessing (boolean Processing)
{
set_Value (COLUMNNAME_Processing, Boolean.valueOf(Processing));
}
/** Get Process Now.
@return Process Now */
public boolean isProcessing() 
{
Object oo = get_Value(COLUMNNAME_Processing);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="25aa7613-5d53-5c7a-d0df-2dca2611f97c")
public static String es_PE_FIELD_SystemIssue_ProcessNow_Description="Reportar Surtimiento a Adempiere";

@XendraTrl(Identifier="25aa7613-5d53-5c7a-d0df-2dca2611f97c")
public static String es_PE_FIELD_SystemIssue_ProcessNow_Name="Reportar o Actualizar Surtimiento";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="8a1139bd-dd03-4685-c329-8ca3e5675a7e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@Record_ID@!0",DisplayLength=1,IsReadOnly=false,SeqNo=440,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="25aa7613-5d53-5c7a-d0df-2dca2611f97c")
public static final String FIELDNAME_SystemIssue_ProcessNow="25aa7613-5d53-5c7a-d0df-2dca2611f97c";

@XendraTrl(Identifier="2fb8adf5-0d4b-dd10-503e-95b05889fe63")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="fa86ef0b-8aab-0729-907e-c452fa29f587",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="2fb8adf5-0d4b-dd10-503e-95b05889fe63",Synchronized="2017-08-05 16:52:35.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
/** Set Profile.
@param ProfileInfo Information to HELP profiling the system for solving support issues */
public void setProfileInfo (String ProfileInfo)
{
if (ProfileInfo != null && ProfileInfo.length() > 255)
{
log.warning("Length > 255 - truncated");
ProfileInfo = ProfileInfo.substring(0,254);
}
set_ValueNoCheck (COLUMNNAME_ProfileInfo, ProfileInfo);
}
/** Get Profile.
@return Information to HELP profiling the system for solving support issues */
public String getProfileInfo() 
{
String value = (String)get_Value(COLUMNNAME_ProfileInfo);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="68ebf6aa-1549-b3d1-da6c-9b950b12ffc4")
public static String es_PE_FIELD_SystemIssue_Profile_Description="Información que ayuda al perfilamiento del sistema para solucionar ediciónes de soporte";

@XendraTrl(Identifier="68ebf6aa-1549-b3d1-da6c-9b950b12ffc4")
public static String es_PE_FIELD_SystemIssue_Profile_Help="La información de perfil no contiene información confidencial y se utiliza para soportar la detección y el diagnóstico de la edición.";

@XendraTrl(Identifier="68ebf6aa-1549-b3d1-da6c-9b950b12ffc4")
public static String es_PE_FIELD_SystemIssue_Profile_Name="Perfil";

@XendraField(AD_Column_ID="ProfileInfo",IsCentrallyMaintained=true,
AD_Tab_ID="8a1139bd-dd03-4685-c329-8ca3e5675a7e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@Record_ID@=0",DisplayLength=20,IsReadOnly=true,SeqNo=370,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="68ebf6aa-1549-b3d1-da6c-9b950b12ffc4")
public static final String FIELDNAME_SystemIssue_Profile="68ebf6aa-1549-b3d1-da6c-9b950b12ffc4";

@XendraTrl(Identifier="56bd9a7e-4ef9-1bd7-e861-6b8639e085fe")
public static String es_PE_COLUMN_ProfileInfo_Name="Perfil";

@XendraColumn(AD_Element_ID="77ce72b8-feb1-d63c-1414-d8068d2b9c63",ColumnName="ProfileInfo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="56bd9a7e-4ef9-1bd7-e861-6b8639e085fe",
Synchronized="2017-08-05 16:52:35.0")
/** Column name ProfileInfo */
public static final String COLUMNNAME_ProfileInfo = "ProfileInfo";
/** Set Record ID.
@param Record_ID Direct internal record ID */
public void setRecord_ID (int Record_ID)
{
if (Record_ID <= 0) set_ValueNoCheck (COLUMNNAME_Record_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_Record_ID, Integer.valueOf(Record_ID));
}
/** Get Record ID.
@return Direct internal record ID */
public int getRecord_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Record_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="823321f8-1d35-eaab-2c80-d0adf7120a5b")
public static String es_PE_FIELD_SystemIssue_RecordID_Description="Identificador de registro interno";

@XendraTrl(Identifier="823321f8-1d35-eaab-2c80-d0adf7120a5b")
public static String es_PE_FIELD_SystemIssue_RecordID_Help="La ID de registro es el identificador único interno de un registro.";

@XendraTrl(Identifier="823321f8-1d35-eaab-2c80-d0adf7120a5b")
public static String es_PE_FIELD_SystemIssue_RecordID_Name="ID de Registro";

@XendraField(AD_Column_ID="Record_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8a1139bd-dd03-4685-c329-8ca3e5675a7e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="1=2",DisplayLength=10,IsReadOnly=false,SeqNo=450,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="823321f8-1d35-eaab-2c80-d0adf7120a5b")
public static final String FIELDNAME_SystemIssue_RecordID="823321f8-1d35-eaab-2c80-d0adf7120a5b";

@XendraTrl(Identifier="02b6b28a-9084-69a4-aede-7773496c75d6")
public static String es_PE_COLUMN_Record_ID_Name="ID de Registro";

@XendraColumn(AD_Element_ID="86e36e4b-d1dc-2deb-449d-c1f6769e1603",ColumnName="Record_ID",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="1",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="02b6b28a-9084-69a4-aede-7773496c75d6",
Synchronized="2017-08-05 16:52:35.0")
/** Column name Record_ID */
public static final String COLUMNNAME_Record_ID = "Record_ID";
/** Set Release No.
@param ReleaseNo Internal Release Number */
public void setReleaseNo (String ReleaseNo)
{
if (ReleaseNo == null) throw new IllegalArgumentException ("ReleaseNo is mandatory.");
if (ReleaseNo.length() > 4)
{
log.warning("Length > 4 - truncated");
ReleaseNo = ReleaseNo.substring(0,3);
}
set_ValueNoCheck (COLUMNNAME_ReleaseNo, ReleaseNo);
}
/** Get Release No.
@return Internal Release Number */
public String getReleaseNo() 
{
String value = (String)get_Value(COLUMNNAME_ReleaseNo);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="38cc8f17-904c-db78-8dd4-cdba86fa0318")
public static String es_PE_FIELD_SystemIssue_ReleaseNo_Description="Número interno de versión";

@XendraTrl(Identifier="38cc8f17-904c-db78-8dd4-cdba86fa0318")
public static String es_PE_FIELD_SystemIssue_ReleaseNo_Name="No. Versión ";

@XendraField(AD_Column_ID="ReleaseNo",IsCentrallyMaintained=true,
AD_Tab_ID="8a1139bd-dd03-4685-c329-8ca3e5675a7e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=4,IsReadOnly=true,SeqNo=50,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="38cc8f17-904c-db78-8dd4-cdba86fa0318")
public static final String FIELDNAME_SystemIssue_ReleaseNo="38cc8f17-904c-db78-8dd4-cdba86fa0318";

@XendraTrl(Identifier="4f10c3fc-c648-be9f-5094-a2c83c926c37")
public static String es_PE_COLUMN_ReleaseNo_Name="No. Versión ";

@XendraColumn(AD_Element_ID="f8040f52-b90f-b045-60b4-9605538827a4",ColumnName="ReleaseNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=4,DefaultValue=".",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4f10c3fc-c648-be9f-5094-a2c83c926c37",
Synchronized="2017-08-05 16:52:35.0")
/** Column name ReleaseNo */
public static final String COLUMNNAME_ReleaseNo = "ReleaseNo";
/** Set Release Tag.
@param ReleaseTag Release Tag */
public void setReleaseTag (String ReleaseTag)
{
if (ReleaseTag != null && ReleaseTag.length() > 60)
{
log.warning("Length > 60 - truncated");
ReleaseTag = ReleaseTag.substring(0,59);
}
set_Value (COLUMNNAME_ReleaseTag, ReleaseTag);
}
/** Get Release Tag.
@return Release Tag */
public String getReleaseTag() 
{
String value = (String)get_Value(COLUMNNAME_ReleaseTag);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="aa2c2bc9-1d25-cb2d-8dba-2c6cb242f2cf")
public static String es_PE_FIELD_SystemIssue_ReleaseTag_Description="Etiqueta de Liberación";

@XendraTrl(Identifier="aa2c2bc9-1d25-cb2d-8dba-2c6cb242f2cf")
public static String es_PE_FIELD_SystemIssue_ReleaseTag_Name="Etiqueta de Liberación";

@XendraField(AD_Column_ID="ReleaseTag",IsCentrallyMaintained=true,
AD_Tab_ID="8a1139bd-dd03-4685-c329-8ca3e5675a7e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=80,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="aa2c2bc9-1d25-cb2d-8dba-2c6cb242f2cf")
public static final String FIELDNAME_SystemIssue_ReleaseTag="aa2c2bc9-1d25-cb2d-8dba-2c6cb242f2cf";

@XendraTrl(Identifier="ed1ed569-5cdd-6d38-475f-d5d01362c2c4")
public static String es_PE_COLUMN_ReleaseTag_Name="Etiqueta de Liberación";

@XendraColumn(AD_Element_ID="c87ceecf-0eb1-a4a7-6715-d57e0bdfd1db",ColumnName="ReleaseTag",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ed1ed569-5cdd-6d38-475f-d5d01362c2c4",
Synchronized="2017-08-05 16:52:35.0")
/** Column name ReleaseTag */
public static final String COLUMNNAME_ReleaseTag = "ReleaseTag";
/** Set Remote Addr.
@param Remote_Addr Remote Address */
public void setRemote_Addr (String Remote_Addr)
{
if (Remote_Addr != null && Remote_Addr.length() > 60)
{
log.warning("Length > 60 - truncated");
Remote_Addr = Remote_Addr.substring(0,59);
}
set_ValueNoCheck (COLUMNNAME_Remote_Addr, Remote_Addr);
}
/** Get Remote Addr.
@return Remote Address */
public String getRemote_Addr() 
{
String value = (String)get_Value(COLUMNNAME_Remote_Addr);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="1b83ad6f-c2c7-7238-0409-88555888ebf3")
public static String es_PE_FIELD_SystemIssue_RemoteAddr_Description="Dirección remota";

@XendraTrl(Identifier="1b83ad6f-c2c7-7238-0409-88555888ebf3")
public static String es_PE_FIELD_SystemIssue_RemoteAddr_Help="La dirección remota indica una dirección alternativa ó externa";

@XendraTrl(Identifier="1b83ad6f-c2c7-7238-0409-88555888ebf3")
public static String es_PE_FIELD_SystemIssue_RemoteAddr_Name="Dirección Remota";

@XendraField(AD_Column_ID="Remote_Addr",IsCentrallyMaintained=true,
AD_Tab_ID="8a1139bd-dd03-4685-c329-8ca3e5675a7e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@Record_ID@=0",DisplayLength=20,IsReadOnly=true,SeqNo=390,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1b83ad6f-c2c7-7238-0409-88555888ebf3")
public static final String FIELDNAME_SystemIssue_RemoteAddr="1b83ad6f-c2c7-7238-0409-88555888ebf3";

@XendraTrl(Identifier="b44a5aec-0d15-b54d-ebfe-9dda0b2a04b0")
public static String es_PE_COLUMN_Remote_Addr_Name="Dirección Remota";

@XendraColumn(AD_Element_ID="b1551fd7-ca8d-4a87-8302-e41caf5553d6",ColumnName="Remote_Addr",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue=".",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b44a5aec-0d15-b54d-ebfe-9dda0b2a04b0",
Synchronized="2017-08-05 16:52:35.0")
/** Column name Remote_Addr */
public static final String COLUMNNAME_Remote_Addr = "Remote_Addr";
/** Set Remote Host.
@param Remote_Host Remote host Info */
public void setRemote_Host (String Remote_Host)
{
if (Remote_Host != null && Remote_Host.length() > 120)
{
log.warning("Length > 120 - truncated");
Remote_Host = Remote_Host.substring(0,119);
}
set_ValueNoCheck (COLUMNNAME_Remote_Host, Remote_Host);
}
/** Get Remote Host.
@return Remote host Info */
public String getRemote_Host() 
{
String value = (String)get_Value(COLUMNNAME_Remote_Host);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="0a90717a-2817-e661-f41e-f84727d09027")
public static String es_PE_FIELD_SystemIssue_RemoteHost_Name="Host Remoto";

@XendraField(AD_Column_ID="Remote_Host",IsCentrallyMaintained=true,
AD_Tab_ID="8a1139bd-dd03-4685-c329-8ca3e5675a7e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@Record_ID@=0",DisplayLength=20,IsReadOnly=true,SeqNo=380,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0a90717a-2817-e661-f41e-f84727d09027")
public static final String FIELDNAME_SystemIssue_RemoteHost="0a90717a-2817-e661-f41e-f84727d09027";

@XendraTrl(Identifier="ad4d4f04-b2e1-db46-82ce-f664f42d28b8")
public static String es_PE_COLUMN_Remote_Host_Name="Host Remoto";

@XendraColumn(AD_Element_ID="eb636ff7-fd5e-fa57-d640-f766bf4e52b2",ColumnName="Remote_Host",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=120,DefaultValue=".",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ad4d4f04-b2e1-db46-82ce-f664f42d28b8",
Synchronized="2017-08-05 16:52:35.0")
/** Column name Remote_Host */
public static final String COLUMNNAME_Remote_Host = "Remote_Host";
/** Set Request Document No.
@param RequestDocumentNo Adempiere Request Document No */
public void setRequestDocumentNo (String RequestDocumentNo)
{
if (RequestDocumentNo != null && RequestDocumentNo.length() > 30)
{
log.warning("Length > 30 - truncated");
RequestDocumentNo = RequestDocumentNo.substring(0,29);
}
set_ValueNoCheck (COLUMNNAME_RequestDocumentNo, RequestDocumentNo);
}
/** Get Request Document No.
@return Adempiere Request Document No */
public String getRequestDocumentNo() 
{
String value = (String)get_Value(COLUMNNAME_RequestDocumentNo);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="bc545421-8f45-f512-6b85-55a963abea66")
public static String es_PE_FIELD_SystemIssue_RequestDocumentNo_Description="Adempiere Solicita No de Documento ";

@XendraTrl(Identifier="bc545421-8f45-f512-6b85-55a963abea66")
public static String es_PE_FIELD_SystemIssue_RequestDocumentNo_Name="Solicitud No Documento ";

@XendraField(AD_Column_ID="RequestDocumentNo",IsCentrallyMaintained=true,
AD_Tab_ID="8a1139bd-dd03-4685-c329-8ca3e5675a7e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@Record_ID@!0",DisplayLength=20,IsReadOnly=true,SeqNo=250,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bc545421-8f45-f512-6b85-55a963abea66")
public static final String FIELDNAME_SystemIssue_RequestDocumentNo="bc545421-8f45-f512-6b85-55a963abea66";

@XendraTrl(Identifier="74e41529-5476-1608-3ad2-f5c6922fb5da")
public static String es_PE_COLUMN_RequestDocumentNo_Name="Solicitud No Documento ";

@XendraColumn(AD_Element_ID="8e5ed4c4-9327-917d-1f4a-4d2a769619b6",ColumnName="RequestDocumentNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="74e41529-5476-1608-3ad2-f5c6922fb5da",
Synchronized="2017-08-05 16:52:35.0")
/** Column name RequestDocumentNo */
public static final String COLUMNNAME_RequestDocumentNo = "RequestDocumentNo";
/** Set Response Text.
@param ResponseText Request Response Text */
public void setResponseText (String ResponseText)
{
set_ValueNoCheck (COLUMNNAME_ResponseText, ResponseText);
}
/** Get Response Text.
@return Request Response Text */
public String getResponseText() 
{
String value = (String)get_Value(COLUMNNAME_ResponseText);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="28498e6f-8c54-56da-5391-16441631bf76")
public static String es_PE_FIELD_SystemIssue_ResponseText_Description="Texto de Respuesta de la Solicitud";

@XendraTrl(Identifier="28498e6f-8c54-56da-5391-16441631bf76")
public static String es_PE_FIELD_SystemIssue_ResponseText_Help="Bloque de texto copiada en el area de texto de respuesta de la solicitud.";

@XendraTrl(Identifier="28498e6f-8c54-56da-5391-16441631bf76")
public static String es_PE_FIELD_SystemIssue_ResponseText_Name="Texto de Respuesta";

@XendraField(AD_Column_ID="ResponseText",IsCentrallyMaintained=true,
AD_Tab_ID="8a1139bd-dd03-4685-c329-8ca3e5675a7e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=2000,IsReadOnly=false,SeqNo=220,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="28498e6f-8c54-56da-5391-16441631bf76")
public static final String FIELDNAME_SystemIssue_ResponseText="28498e6f-8c54-56da-5391-16441631bf76";

@XendraTrl(Identifier="20f7eb5f-9e49-ae12-cab4-a2933f6605f3")
public static String es_PE_COLUMN_ResponseText_Name="Texto de Respuesta";

@XendraColumn(AD_Element_ID="ac7865e2-cecd-f0a7-4a39-b7c5af9def95",ColumnName="ResponseText",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,
ReadOnlyLogic="@Record_ID@!0",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",
ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="20f7eb5f-9e49-ae12-cab4-a2933f6605f3",Synchronized="2017-08-05 16:52:35.0")
/** Column name ResponseText */
public static final String COLUMNNAME_ResponseText = "ResponseText";
/** Set r_issuekcurrent_timestampn_id.
@param r_issuekcurrent_timestampn_id r_issuekcurrent_timestampn_id */
public void setr_issuekcurrent_timestampn_id (int r_issuekcurrent_timestampn_id)
{
set_Value (COLUMNNAME_r_issuekcurrent_timestampn_id, Integer.valueOf(r_issuekcurrent_timestampn_id));
}
/** Get r_issuekcurrent_timestampn_id.
@return r_issuekcurrent_timestampn_id */
public int getr_issuekcurrent_timestampn_id() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_r_issuekcurrent_timestampn_id);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ffdc60aa-1493-806f-1730-fb9a565eaa86")
public static String es_PE_COLUMN_r_issuekcurrent_timestampn_id_Name="r_issuekcurrent_timestampn_id";

@XendraColumn(AD_Element_ID="a7f61fa9-5e1a-7511-4f09-18446d5bf74c",
ColumnName="r_issuekcurrent_timestampn_id",AD_Reference_ID=19,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="ffdc60aa-1493-806f-1730-fb9a565eaa86",Synchronized="2017-08-05 16:52:35.0")
/** Column name r_issuekcurrent_timestampn_id */
public static final String COLUMNNAME_r_issuekcurrent_timestampn_id = "r_issuekcurrent_timestampn_id";
/** Set Known Issue.
@param R_IssueKnown_ID Known Issue */
public void setR_IssueKnown_ID (int R_IssueKnown_ID)
{
if (R_IssueKnown_ID <= 0) set_Value (COLUMNNAME_R_IssueKnown_ID, null);
 else 
set_Value (COLUMNNAME_R_IssueKnown_ID, Integer.valueOf(R_IssueKnown_ID));
}
/** Get Known Issue.
@return Known Issue */
public int getR_IssueKnown_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_R_IssueKnown_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="4bd6c0e7-1781-c8d7-2dfa-ba5389855e05")
public static String es_PE_FIELD_SystemIssue_KnownIssue_Description="Edición Conocida";

@XendraTrl(Identifier="4bd6c0e7-1781-c8d7-2dfa-ba5389855e05")
public static String es_PE_FIELD_SystemIssue_KnownIssue_Name="Edición Conocida";

@XendraField(AD_Column_ID="R_IssueKnown_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8a1139bd-dd03-4685-c329-8ca3e5675a7e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@Record_ID@=0",DisplayLength=10,IsReadOnly=false,SeqNo=240,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4bd6c0e7-1781-c8d7-2dfa-ba5389855e05")
public static final String FIELDNAME_SystemIssue_KnownIssue="4bd6c0e7-1781-c8d7-2dfa-ba5389855e05";

@XendraTrl(Identifier="2b4bde31-ec1e-df45-eebf-478b687ca4a3")
public static String es_PE_COLUMN_R_IssueKnown_ID_Name="Edición Conocida";

@XendraColumn(AD_Element_ID="4645d5cb-fa3b-5cfc-20ac-fee5171ca0e0",ColumnName="R_IssueKnown_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2b4bde31-ec1e-df45-eebf-478b687ca4a3",
Synchronized="2017-08-05 16:52:35.0")
/** Column name R_IssueKnown_ID */
public static final String COLUMNNAME_R_IssueKnown_ID = "R_IssueKnown_ID";
/** Set Issue Project.
@param R_IssueProject_ID Implementation Projects */
public void setR_IssueProject_ID (int R_IssueProject_ID)
{
if (R_IssueProject_ID <= 0) set_Value (COLUMNNAME_R_IssueProject_ID, null);
 else 
set_Value (COLUMNNAME_R_IssueProject_ID, Integer.valueOf(R_IssueProject_ID));
}
/** Get Issue Project.
@return Implementation Projects */
public int getR_IssueProject_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_R_IssueProject_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="feb30532-03ac-ee2f-f255-2919e2cf0e2a")
public static String es_PE_FIELD_SystemIssue_IssueProject_Description="Implementación de Proyectos";

@XendraTrl(Identifier="feb30532-03ac-ee2f-f255-2919e2cf0e2a")
public static String es_PE_FIELD_SystemIssue_IssueProject_Name="Edición de Proyecto";

@XendraField(AD_Column_ID="R_IssueProject_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8a1139bd-dd03-4685-c329-8ca3e5675a7e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@Record_ID@=0",DisplayLength=10,IsReadOnly=false,SeqNo=280,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="feb30532-03ac-ee2f-f255-2919e2cf0e2a")
public static final String FIELDNAME_SystemIssue_IssueProject="feb30532-03ac-ee2f-f255-2919e2cf0e2a";

@XendraTrl(Identifier="f2016c5d-bc29-47c0-01b0-c2fe0ac357dd")
public static String es_PE_COLUMN_R_IssueProject_ID_Name="Edición de Proyecto";

@XendraColumn(AD_Element_ID="e3e64ba6-8349-f89d-b126-03a4314c2f03",ColumnName="R_IssueProject_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f2016c5d-bc29-47c0-01b0-c2fe0ac357dd",
Synchronized="2017-08-05 16:52:35.0")
/** Column name R_IssueProject_ID */
public static final String COLUMNNAME_R_IssueProject_ID = "R_IssueProject_ID";
/** Set Issue System.
@param R_IssueSystem_ID System creating the issue */
public void setR_IssueSystem_ID (int R_IssueSystem_ID)
{
if (R_IssueSystem_ID <= 0) set_Value (COLUMNNAME_R_IssueSystem_ID, null);
 else 
set_Value (COLUMNNAME_R_IssueSystem_ID, Integer.valueOf(R_IssueSystem_ID));
}
/** Get Issue System.
@return System creating the issue */
public int getR_IssueSystem_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_R_IssueSystem_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="8391c66e-bd15-cd99-60e3-4792a8cda7ab")
public static String es_PE_FIELD_SystemIssue_IssueSystem_Description="Edición de la creación del sistema";

@XendraTrl(Identifier="8391c66e-bd15-cd99-60e3-4792a8cda7ab")
public static String es_PE_FIELD_SystemIssue_IssueSystem_Name="Edición Sistema";

@XendraField(AD_Column_ID="R_IssueSystem_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8a1139bd-dd03-4685-c329-8ca3e5675a7e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@Record_ID@=0",DisplayLength=10,IsReadOnly=false,SeqNo=320,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8391c66e-bd15-cd99-60e3-4792a8cda7ab")
public static final String FIELDNAME_SystemIssue_IssueSystem="8391c66e-bd15-cd99-60e3-4792a8cda7ab";

@XendraTrl(Identifier="e06d062d-b5a1-6fa3-0be1-fcd9aebd340a")
public static String es_PE_COLUMN_R_IssueSystem_ID_Name="Edición Sistema";

@XendraColumn(AD_Element_ID="86ae7d06-3ae4-c567-0207-d0ec6da9d42a",ColumnName="R_IssueSystem_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e06d062d-b5a1-6fa3-0be1-fcd9aebd340a",
Synchronized="2017-08-05 16:52:35.0")
/** Column name R_IssueSystem_ID */
public static final String COLUMNNAME_R_IssueSystem_ID = "R_IssueSystem_ID";
/** Set IssueUser.
@param R_IssueUser_ID User who reported issues */
public void setR_IssueUser_ID (int R_IssueUser_ID)
{
if (R_IssueUser_ID <= 0) set_Value (COLUMNNAME_R_IssueUser_ID, null);
 else 
set_Value (COLUMNNAME_R_IssueUser_ID, Integer.valueOf(R_IssueUser_ID));
}
/** Get IssueUser.
@return User who reported issues */
public int getR_IssueUser_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_R_IssueUser_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ca99c1e2-b09b-627d-4337-1f2f909100be")
public static String es_PE_FIELD_SystemIssue_IssueUser_Description="Usuario quién reportó la edición";

@XendraTrl(Identifier="ca99c1e2-b09b-627d-4337-1f2f909100be")
public static String es_PE_FIELD_SystemIssue_IssueUser_Name="Usuario Edición";

@XendraField(AD_Column_ID="R_IssueUser_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8a1139bd-dd03-4685-c329-8ca3e5675a7e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@Record_ID@=0",DisplayLength=10,IsReadOnly=false,SeqNo=330,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ca99c1e2-b09b-627d-4337-1f2f909100be")
public static final String FIELDNAME_SystemIssue_IssueUser="ca99c1e2-b09b-627d-4337-1f2f909100be";

@XendraTrl(Identifier="045e2533-e352-d443-866d-d063cd49b48f")
public static String es_PE_COLUMN_R_IssueUser_ID_Name="Usuario Edición";

@XendraColumn(AD_Element_ID="dc28f935-fd86-1f75-68c1-4247bf0f6ecd",ColumnName="R_IssueUser_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="045e2533-e352-d443-866d-d063cd49b48f",
Synchronized="2017-08-05 16:52:35.0")
/** Column name R_IssueUser_ID */
public static final String COLUMNNAME_R_IssueUser_ID = "R_IssueUser_ID";
/** Set Request.
@param R_Request_ID Request from a Business Partner or Prospect */
public void setR_Request_ID (int R_Request_ID)
{
if (R_Request_ID <= 0) set_ValueNoCheck (COLUMNNAME_R_Request_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_R_Request_ID, Integer.valueOf(R_Request_ID));
}
/** Get Request.
@return Request from a Business Partner or Prospect */
public int getR_Request_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_R_Request_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="be3d5d1e-9693-0abf-13b4-629582deb6aa")
public static String es_PE_FIELD_SystemIssue_Request_Description="Solicitud de un socio de negocio ó prospecto.";

@XendraTrl(Identifier="be3d5d1e-9693-0abf-13b4-629582deb6aa")
public static String es_PE_FIELD_SystemIssue_Request_Help="La solicitud identifica un requerimiento único de un socio de negocio ó prospecto.";

@XendraTrl(Identifier="be3d5d1e-9693-0abf-13b4-629582deb6aa")
public static String es_PE_FIELD_SystemIssue_Request_Name="Solicitud";

@XendraField(AD_Column_ID="R_Request_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8a1139bd-dd03-4685-c329-8ca3e5675a7e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@Record_ID@=0",DisplayLength=10,IsReadOnly=true,SeqNo=260,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="be3d5d1e-9693-0abf-13b4-629582deb6aa")
public static final String FIELDNAME_SystemIssue_Request="be3d5d1e-9693-0abf-13b4-629582deb6aa";

@XendraTrl(Identifier="71f1993a-9b9c-2070-3f07-01a0c4505c25")
public static String es_PE_COLUMN_R_Request_ID_Name="Solicitud";

@XendraColumn(AD_Element_ID="8f83a61c-3c9c-841b-466b-9700dd35c0de",ColumnName="R_Request_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="71f1993a-9b9c-2070-3f07-01a0c4505c25",
Synchronized="2017-08-05 16:52:35.0")
/** Column name R_Request_ID */
public static final String COLUMNNAME_R_Request_ID = "R_Request_ID";
/** Set Source Class.
@param SourceClassName Source Class Name */
public void setSourceClassName (String SourceClassName)
{
if (SourceClassName != null && SourceClassName.length() > 60)
{
log.warning("Length > 60 - truncated");
SourceClassName = SourceClassName.substring(0,59);
}
set_Value (COLUMNNAME_SourceClassName, SourceClassName);
}
/** Get Source Class.
@return Source Class Name */
public String getSourceClassName() 
{
String value = (String)get_Value(COLUMNNAME_SourceClassName);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="00b17180-943a-a1dc-26b7-38feb11ffc5b")
public static String es_PE_FIELD_SystemIssue_SourceClass_Description="Nombre De la Clase De la Fuente ";

@XendraTrl(Identifier="00b17180-943a-a1dc-26b7-38feb11ffc5b")
public static String es_PE_FIELD_SystemIssue_SourceClass_Name="Clase de Fuente";

@XendraField(AD_Column_ID="SourceClassName",IsCentrallyMaintained=true,
AD_Tab_ID="8a1139bd-dd03-4685-c329-8ca3e5675a7e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=180,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="00b17180-943a-a1dc-26b7-38feb11ffc5b")
public static final String FIELDNAME_SystemIssue_SourceClass="00b17180-943a-a1dc-26b7-38feb11ffc5b";

@XendraTrl(Identifier="0185ff21-b345-1c35-abb6-baa04ab55b8f")
public static String es_PE_COLUMN_SourceClassName_Name="Clase de Fuente";

@XendraColumn(AD_Element_ID="ee682afd-0b76-1b81-864b-ef7254e532bd",ColumnName="SourceClassName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0185ff21-b345-1c35-abb6-baa04ab55b8f",
Synchronized="2017-08-05 16:52:35.0")
/** Column name SourceClassName */
public static final String COLUMNNAME_SourceClassName = "SourceClassName";
/** Set Source Method.
@param SourceMethodName Source Method Name */
public void setSourceMethodName (String SourceMethodName)
{
if (SourceMethodName != null && SourceMethodName.length() > 60)
{
log.warning("Length > 60 - truncated");
SourceMethodName = SourceMethodName.substring(0,59);
}
set_Value (COLUMNNAME_SourceMethodName, SourceMethodName);
}
/** Get Source Method.
@return Source Method Name */
public String getSourceMethodName() 
{
String value = (String)get_Value(COLUMNNAME_SourceMethodName);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="a35d6a74-d56a-d88c-e37a-eb564560aed3")
public static String es_PE_FIELD_SystemIssue_SourceMethod_Description="Nombre Método de Fuente";

@XendraTrl(Identifier="a35d6a74-d56a-d88c-e37a-eb564560aed3")
public static String es_PE_FIELD_SystemIssue_SourceMethod_Name="Método de Fuente";

@XendraField(AD_Column_ID="SourceMethodName",IsCentrallyMaintained=true,
AD_Tab_ID="8a1139bd-dd03-4685-c329-8ca3e5675a7e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=170,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a35d6a74-d56a-d88c-e37a-eb564560aed3")
public static final String FIELDNAME_SystemIssue_SourceMethod="a35d6a74-d56a-d88c-e37a-eb564560aed3";

@XendraTrl(Identifier="a243aba5-d771-f138-5dc3-28541cc2fd66")
public static String es_PE_COLUMN_SourceMethodName_Name="Método de Fuente";

@XendraColumn(AD_Element_ID="c8f923ba-42fd-65b8-bf15-8f7d5b2d78ca",ColumnName="SourceMethodName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a243aba5-d771-f138-5dc3-28541cc2fd66",
Synchronized="2017-08-05 16:52:35.0")
/** Column name SourceMethodName */
public static final String COLUMNNAME_SourceMethodName = "SourceMethodName";
/** Set Stack Trace.
@param StackTrace System Log Trace */
public void setStackTrace (String StackTrace)
{
set_Value (COLUMNNAME_StackTrace, StackTrace);
}
/** Get Stack Trace.
@return System Log Trace */
public String getStackTrace() 
{
String value = (String)get_Value(COLUMNNAME_StackTrace);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="800e9ad3-2c0f-e6c6-dda3-5cffadc57413")
public static String es_PE_FIELD_SystemIssue_StackTrace_Description="Seguimiento del Histórico del Sistema";

@XendraTrl(Identifier="800e9ad3-2c0f-e6c6-dda3-5cffadc57413")
public static String es_PE_FIELD_SystemIssue_StackTrace_Name="Seguimiento de Pila ";

@XendraField(AD_Column_ID="StackTrace",IsCentrallyMaintained=true,
AD_Tab_ID="8a1139bd-dd03-4685-c329-8ca3e5675a7e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=2000,IsReadOnly=false,SeqNo=200,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="800e9ad3-2c0f-e6c6-dda3-5cffadc57413")
public static final String FIELDNAME_SystemIssue_StackTrace="800e9ad3-2c0f-e6c6-dda3-5cffadc57413";

@XendraTrl(Identifier="fbf2112b-e39b-7f30-e780-7e5c6e2f8075")
public static String es_PE_COLUMN_StackTrace_Name="Seguimiento de Pila ";

@XendraColumn(AD_Element_ID="6c9d4846-c398-7ea2-15c8-14fd5120ca70",ColumnName="StackTrace",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fbf2112b-e39b-7f30-e780-7e5c6e2f8075",
Synchronized="2017-08-05 16:52:35.0")
/** Column name StackTrace */
public static final String COLUMNNAME_StackTrace = "StackTrace";
/** Set Statistics.
@param StatisticsInfo Information to HELP profiling the system for solving support issues */
public void setStatisticsInfo (String StatisticsInfo)
{
if (StatisticsInfo != null && StatisticsInfo.length() > 255)
{
log.warning("Length > 255 - truncated");
StatisticsInfo = StatisticsInfo.substring(0,254);
}
set_ValueNoCheck (COLUMNNAME_StatisticsInfo, StatisticsInfo);
}
/** Get Statistics.
@return Information to HELP profiling the system for solving support issues */
public String getStatisticsInfo() 
{
String value = (String)get_Value(COLUMNNAME_StatisticsInfo);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="f8c2ed5f-5509-530b-7729-45ee74dafa4e")
public static String es_PE_FIELD_SystemIssue_Statistics_Description="Información que ayuda a perfilar el sistema para solucionar ediciones de soporte";

@XendraTrl(Identifier="f8c2ed5f-5509-530b-7729-45ee74dafa4e")
public static String es_PE_FIELD_SystemIssue_Statistics_Help="La información de perfil no contiene información confidencial y se utiliza para apoyar la detección y el diagnóstico de la edición así como la estadística anónima en general";

@XendraTrl(Identifier="f8c2ed5f-5509-530b-7729-45ee74dafa4e")
public static String es_PE_FIELD_SystemIssue_Statistics_Name="Estadística";

@XendraField(AD_Column_ID="StatisticsInfo",IsCentrallyMaintained=true,
AD_Tab_ID="8a1139bd-dd03-4685-c329-8ca3e5675a7e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@Record_ID@=0",DisplayLength=20,IsReadOnly=true,SeqNo=360,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f8c2ed5f-5509-530b-7729-45ee74dafa4e")
public static final String FIELDNAME_SystemIssue_Statistics="f8c2ed5f-5509-530b-7729-45ee74dafa4e";

@XendraTrl(Identifier="245f3bee-d082-4042-8493-d31011a34b85")
public static String es_PE_COLUMN_StatisticsInfo_Name="Estadística";

@XendraColumn(AD_Element_ID="cb4e2bb3-3a05-420d-402e-eac787e0151a",ColumnName="StatisticsInfo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="245f3bee-d082-4042-8493-d31011a34b85",
Synchronized="2017-08-05 16:52:35.0")
/** Column name StatisticsInfo */
public static final String COLUMNNAME_StatisticsInfo = "StatisticsInfo";
/** Set Support EMail.
@param SupportEMail EMail address to send support information and updates to */
public void setSupportEMail (String SupportEMail)
{
if (SupportEMail != null && SupportEMail.length() > 60)
{
log.warning("Length > 60 - truncated");
SupportEMail = SupportEMail.substring(0,59);
}
set_Value (COLUMNNAME_SupportEMail, SupportEMail);
}
/** Get Support EMail.
@return EMail address to send support information and updates to */
public String getSupportEMail() 
{
String value = (String)get_Value(COLUMNNAME_SupportEMail);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="89dd30ec-690c-6287-4661-1a17375bbe20")
public static String es_PE_FIELD_SystemIssue_SupportEMail_Description="Dirección de Correo para solicitar información de soporte y actualizaciones.";

@XendraTrl(Identifier="89dd30ec-690c-6287-4661-1a17375bbe20")
public static String es_PE_FIELD_SystemIssue_SupportEMail_Help="Si no fue ingresado se empleará la dirección de Correo registrada.";

@XendraTrl(Identifier="89dd30ec-690c-6287-4661-1a17375bbe20")
public static String es_PE_FIELD_SystemIssue_SupportEMail_Name="EMail a Soporte ";

@XendraField(AD_Column_ID="SupportEMail",IsCentrallyMaintained=true,
AD_Tab_ID="8a1139bd-dd03-4685-c329-8ca3e5675a7e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@Record_ID@=0",DisplayLength=20,IsReadOnly=true,SeqNo=290,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="89dd30ec-690c-6287-4661-1a17375bbe20")
public static final String FIELDNAME_SystemIssue_SupportEMail="89dd30ec-690c-6287-4661-1a17375bbe20";

@XendraTrl(Identifier="7b013a88-2add-59b0-1ac1-f7d7744dd61a")
public static String es_PE_COLUMN_SupportEMail_Name="EMail a Soporte ";

@XendraColumn(AD_Element_ID="6e7de731-45e3-8bea-ba4b-6d4e4c2e85e1",ColumnName="SupportEMail",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7b013a88-2add-59b0-1ac1-f7d7744dd61a",
Synchronized="2017-08-05 16:52:35.0")
/** Column name SupportEMail */
public static final String COLUMNNAME_SupportEMail = "SupportEMail";

/** SystemStatus AD_Reference=2aca3aa9-4a75-ed5a-2785-69ad14e5c85d */
public static final int SYSTEMSTATUS_AD_Reference_ID=374;
/** Set System Status.
@param SystemStatus Status of the system - Support priority depends on system status */
public void setSystemStatus (String SystemStatus)
{
if (SystemStatus == null) throw new IllegalArgumentException ("SystemStatus is mandatory");
if (SystemStatus.equals(REF_AD_SystemStatus.Evaluation) || SystemStatus.equals(REF_AD_SystemStatus.Implementation) || SystemStatus.equals(REF_AD_SystemStatus.Production));
 else throw new IllegalArgumentException ("SystemStatus Invalid value - " + SystemStatus + " - Reference_ID=374 - E - I - P");
if (SystemStatus.length() > 1)
{
log.warning("Length > 1 - truncated");
SystemStatus = SystemStatus.substring(0,0);
}
set_Value (COLUMNNAME_SystemStatus, SystemStatus);
}
/** Get System Status.
@return Status of the system - Support priority depends on system status */
public String getSystemStatus() 
{
return (String)get_Value(COLUMNNAME_SystemStatus);
}

@XendraTrl(Identifier="9cee831b-9ae2-2185-fe83-729449f92cc8")
public static String es_PE_FIELD_SystemIssue_SystemStatus_Description="Estado del Sistema - La prioridad del soporte depende del estado del sistema.";

@XendraTrl(Identifier="9cee831b-9ae2-2185-fe83-729449f92cc8")
public static String es_PE_FIELD_SystemIssue_SystemStatus_Help="Estado del Sistema ayuda a priorizar recursos de soporte.";

@XendraTrl(Identifier="9cee831b-9ae2-2185-fe83-729449f92cc8")
public static String es_PE_FIELD_SystemIssue_SystemStatus_Name="Estado del Sistema";

@XendraField(AD_Column_ID="SystemStatus",IsCentrallyMaintained=true,
AD_Tab_ID="8a1139bd-dd03-4685-c329-8ca3e5675a7e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=230,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9cee831b-9ae2-2185-fe83-729449f92cc8")
public static final String FIELDNAME_SystemIssue_SystemStatus="9cee831b-9ae2-2185-fe83-729449f92cc8";

@XendraTrl(Identifier="0777aa53-5b92-fd28-067d-7e039daefc26")
public static String es_PE_COLUMN_SystemStatus_Name="Estado del Sistema";

@XendraColumn(AD_Element_ID="66b6be12-484d-bb38-e430-af4c3adbdb6a",ColumnName="SystemStatus",
AD_Reference_ID=17,AD_Reference_Value_ID="2aca3aa9-4a75-ed5a-2785-69ad14e5c85d",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="E",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="@Record_ID@=0",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="0777aa53-5b92-fd28-067d-7e039daefc26",Synchronized="2017-08-05 16:52:35.0")
/** Column name SystemStatus */
public static final String COLUMNNAME_SystemStatus = "SystemStatus";
/** Set Registered EMail.
@param UserName Email of the responsible for the System */
public void setUserName (String UserName)
{
if (UserName == null) throw new IllegalArgumentException ("UserName is mandatory.");
if (UserName.length() > 60)
{
log.warning("Length > 60 - truncated");
UserName = UserName.substring(0,59);
}
set_ValueNoCheck (COLUMNNAME_UserName, UserName);
}
/** Get Registered EMail.
@return Email of the responsible for the System */
public String getUserName() 
{
String value = (String)get_Value(COLUMNNAME_UserName);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="1a7ba301-43cc-45b5-a196-616c842ac3ae")
public static String es_PE_FIELD_SystemIssue_RegisteredEMail_Description="Usuario responsable por el sistema";

@XendraTrl(Identifier="1a7ba301-43cc-45b5-a196-616c842ac3ae")
public static String es_PE_FIELD_SystemIssue_RegisteredEMail_Help="Persona responsable por el sistema";

@XendraTrl(Identifier="1a7ba301-43cc-45b5-a196-616c842ac3ae")
public static String es_PE_FIELD_SystemIssue_RegisteredEMail_Name="Usuario";

@XendraField(AD_Column_ID="UserName",IsCentrallyMaintained=true,
AD_Tab_ID="8a1139bd-dd03-4685-c329-8ca3e5675a7e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@Record_ID@=0",DisplayLength=20,IsReadOnly=true,SeqNo=310,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1a7ba301-43cc-45b5-a196-616c842ac3ae")
public static final String FIELDNAME_SystemIssue_RegisteredEMail="1a7ba301-43cc-45b5-a196-616c842ac3ae";

@XendraTrl(Identifier="bcdfa9f3-a2bb-14da-aa42-3c6534c30051")
public static String es_PE_COLUMN_UserName_Name="Usuario";

@XendraColumn(AD_Element_ID="f1f44b21-d257-0aaf-7454-cf73b867319a",ColumnName="UserName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue=".",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bcdfa9f3-a2bb-14da-aa42-3c6534c30051",
Synchronized="2017-08-05 16:52:35.0")
/** Column name UserName */
public static final String COLUMNNAME_UserName = "UserName";
/** Set Version.
@param Version Version of the table definition */
public void setVersion (String Version)
{
if (Version == null) throw new IllegalArgumentException ("Version is mandatory.");
if (Version.length() > 40)
{
log.warning("Length > 40 - truncated");
Version = Version.substring(0,39);
}
set_ValueNoCheck (COLUMNNAME_Version, Version);
}
/** Get Version.
@return Version of the table definition */
public String getVersion() 
{
String value = (String)get_Value(COLUMNNAME_Version);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="b1f7afc3-2d64-0b31-7b22-24c8ba11c657")
public static String es_PE_FIELD_SystemIssue_Version_Description="Versión de la definición de tabla";

@XendraTrl(Identifier="b1f7afc3-2d64-0b31-7b22-24c8ba11c657")
public static String es_PE_FIELD_SystemIssue_Version_Help="La versión indica la versión de esta definición de tabla";

@XendraTrl(Identifier="b1f7afc3-2d64-0b31-7b22-24c8ba11c657")
public static String es_PE_FIELD_SystemIssue_Version_Name="Versión";

@XendraField(AD_Column_ID="Version",IsCentrallyMaintained=true,
AD_Tab_ID="8a1139bd-dd03-4685-c329-8ca3e5675a7e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=60,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b1f7afc3-2d64-0b31-7b22-24c8ba11c657")
public static final String FIELDNAME_SystemIssue_Version="b1f7afc3-2d64-0b31-7b22-24c8ba11c657";

@XendraTrl(Identifier="19aee07e-4362-5248-ee34-37b3181c5981")
public static String es_PE_COLUMN_Version_Name="Versión";

@XendraColumn(AD_Element_ID="739fe203-51de-92a9-b8a8-c08f63b73506",ColumnName="Version",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue=".",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="19aee07e-4362-5248-ee34-37b3181c5981",
Synchronized="2017-08-05 16:52:35.0")
/** Column name Version */
public static final String COLUMNNAME_Version = "Version";
}
