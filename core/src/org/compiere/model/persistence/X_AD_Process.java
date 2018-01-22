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
import org.compiere.model.reference.REF_AD_TableAccessLevels;
import org.compiere.model.reference.REF_RuleType;
import org.compiere.model.reference.REF_ShowHelpList;
/** Generated Model for AD_Process
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_Process extends PO
{
/** Standard Constructor
@param ctx context
@param AD_Process_ID id
@param trxName transaction
*/
public X_AD_Process (Properties ctx, int AD_Process_ID, String trxName)
{
super (ctx, AD_Process_ID, trxName);
/** if (AD_Process_ID == 0)
{
setAccessLevel (null);
setAD_Process_ID (0);
setEntityType (null);	
// U
setIsBetaFunctionality (false);	
// N
setIsReport (false);	
// N
setIsServerProcess (false);	
// N
setName (null);
setValue (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_Process (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=284 */
public static int Table_ID=MTable.getTable_ID("AD_Process");

@XendraTrl(Identifier="0ec3d85a-ad30-4b8d-60c0-5aaaee5ad3d8")
public static String es_PE_TAB_ReportProcess_Description="Definir Informe y Proceso";

@XendraTrl(Identifier="0ec3d85a-ad30-4b8d-60c0-5aaaee5ad3d8")
public static String es_PE_TAB_ReportProcess_Name="Informe y Proceso";

@XendraTrl(Identifier="0ec3d85a-ad30-4b8d-60c0-5aaaee5ad3d8")
public static String es_PE_TAB_ReportProcess_Help="La pestaña de Informe y Proceso define los Informes y procesos que corren en el sistema.";

@XendraTab(Name="Report & Process",Description="Define Report & Process",
Help="The Report and Process Tab defines each report and process run in the system.   Please note that the Print Format is only used for Document Print when you want to share a common format defined on System level. For normal reports and formats, you would not define a Print Format here, but modify the generated print format and set it as the default.",
AD_Window_ID="7bc9e03b-e56c-36fe-34ff-ea412ab43089",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="0ec3d85a-ad30-4b8d-60c0-5aaaee5ad3d8",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_ReportProcess="0ec3d85a-ad30-4b8d-60c0-5aaaee5ad3d8";

@XendraTrl(Identifier="47012e9a-d7e2-dfb8-5b58-b305c84f3dd2")
public static String es_PE_TABLE_AD_Process_Name="Proceso";

@XendraTable(Name="Process",Description="Process or Report",Help="",TableName="AD_Process",
AccessLevel="4",AD_Window_ID="7bc9e03b-e56c-36fe-34ff-ea412ab43089",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=125,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.dictionary",
Identifier="47012e9a-d7e2-dfb8-5b58-b305c84f3dd2",Synchronized="2017-08-16 11:40:54.0")
/** TableName=AD_Process */
public static final String Table_Name="AD_Process";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_Process");

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
    Table_ID = MTable.getTable_ID("AD_Process");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_Process[").append(get_ID()).append("]");
return sb.toString();
}

/** AccessLevel AD_Reference=5684046b-00f0-a17c-843e-efad2b0e42f3 */
public static final int ACCESSLEVEL_AD_Reference_ID=5;
/** Set Data Access Level.
@param AccessLevel Access Level required */
public void setAccessLevel (String AccessLevel)
{
if (AccessLevel == null) throw new IllegalArgumentException ("AccessLevel is mandatory");
if (AccessLevel.equals(REF_AD_TableAccessLevels.SystemPlusClient) || AccessLevel.equals(REF_AD_TableAccessLevels.ClientOnly) || AccessLevel.equals(REF_AD_TableAccessLevels.Organization) || AccessLevel.equals(REF_AD_TableAccessLevels.ClientPlusOrganization) || AccessLevel.equals(REF_AD_TableAccessLevels.SystemOnly) || AccessLevel.equals(REF_AD_TableAccessLevels.All));
 else throw new IllegalArgumentException ("AccessLevel Invalid value - " + AccessLevel + " - Reference_ID=5 - 6 - 2 - 1 - 3 - 4 - 7");
if (AccessLevel.length() > 1)
{
log.warning("Length > 1 - truncated");
AccessLevel = AccessLevel.substring(0,0);
}
set_Value (COLUMNNAME_AccessLevel, AccessLevel);
}
/** Get Data Access Level.
@return Access Level required */
public String getAccessLevel() 
{
return (String)get_Value(COLUMNNAME_AccessLevel);
}

@XendraTrl(Identifier="47baec4e-9508-eb52-35ba-0a333c71767a")
public static String es_PE_FIELD_ReportProcess_DataAccessLevel_Description="Nivel de Acceso requerido";

@XendraTrl(Identifier="47baec4e-9508-eb52-35ba-0a333c71767a")
public static String es_PE_FIELD_ReportProcess_DataAccessLevel_Help="Indica el nivel de acceso requerido para este registro ó proceso";

@XendraTrl(Identifier="47baec4e-9508-eb52-35ba-0a333c71767a")
public static String es_PE_FIELD_ReportProcess_DataAccessLevel_Name="Nivel de Acceso a Datos";

@XendraField(AD_Column_ID="AccessLevel",IsCentrallyMaintained=true,
AD_Tab_ID="0ec3d85a-ad30-4b8d-60c0-5aaaee5ad3d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="47baec4e-9508-eb52-35ba-0a333c71767a")
public static final String FIELDNAME_ReportProcess_DataAccessLevel="47baec4e-9508-eb52-35ba-0a333c71767a";

@XendraTrl(Identifier="66f214f6-6df4-fef1-68d9-517d5f988471")
public static String es_PE_COLUMN_AccessLevel_Name="Nivel de Acceso a Datos";

@XendraColumn(AD_Element_ID="bd129648-2bd8-10dc-6b09-97aa41aa28e2",ColumnName="AccessLevel",
AD_Reference_ID=17,AD_Reference_Value_ID="5684046b-00f0-a17c-843e-efad2b0e42f3",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="66f214f6-6df4-fef1-68d9-517d5f988471",Synchronized="2017-08-05 16:52:44.0")
/** Column name AccessLevel */
public static final String COLUMNNAME_AccessLevel = "AccessLevel";
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

@XendraTrl(Identifier="123486af-e882-40ae-16c3-4bf0d8fac217")
public static String es_PE_FIELD_ReportProcess_SpecialForm_Description="Forma especial";

@XendraTrl(Identifier="123486af-e882-40ae-16c3-4bf0d8fac217")
public static String es_PE_FIELD_ReportProcess_SpecialForm_Help="El campo forma especial identifica una forma especial única en el sistema.";

@XendraTrl(Identifier="123486af-e882-40ae-16c3-4bf0d8fac217")
public static String es_PE_FIELD_ReportProcess_SpecialForm_Name="Forma Especial";

@XendraField(AD_Column_ID="AD_Form_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0ec3d85a-ad30-4b8d-60c0-5aaaee5ad3d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=240,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="123486af-e882-40ae-16c3-4bf0d8fac217")
public static final String FIELDNAME_ReportProcess_SpecialForm="123486af-e882-40ae-16c3-4bf0d8fac217";

@XendraTrl(Identifier="2c7c617e-9798-d170-a71b-08c3cc7c5563")
public static String es_PE_COLUMN_AD_Form_ID_Name="Special Form";

@XendraColumn(AD_Element_ID="6e3fcf05-8a76-e0af-25a6-7a4ab20551f4",ColumnName="AD_Form_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2c7c617e-9798-d170-a71b-08c3cc7c5563",
Synchronized="2017-08-05 16:52:44.0")
/** Column name AD_Form_ID */
public static final String COLUMNNAME_AD_Form_ID = "AD_Form_ID";
/** Set Plugin.
@param AD_Plugin_ID Plugin */
public void setAD_Plugin_ID (int AD_Plugin_ID)
{
if (AD_Plugin_ID <= 0) set_Value (COLUMNNAME_AD_Plugin_ID, null);
 else 
set_Value (COLUMNNAME_AD_Plugin_ID, Integer.valueOf(AD_Plugin_ID));
}
/** Get Plugin.
@return Plugin */
public int getAD_Plugin_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Plugin_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f74e7abf-f84f-498f-82d7-7ca944186bde")
public static String es_PE_FIELD_ReportProcess_Plugin_Name="Plugin";

@XendraField(AD_Column_ID="AD_Plugin_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0ec3d85a-ad30-4b8d-60c0-5aaaee5ad3d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=300,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-05-13 05:40:28.0",
Identifier="f74e7abf-f84f-498f-82d7-7ca944186bde")
public static final String FIELDNAME_ReportProcess_Plugin="f74e7abf-f84f-498f-82d7-7ca944186bde";

@XendraTrl(Identifier="fbccf247-6571-4041-9fc7-3eb6430136f4")
public static String es_PE_COLUMN_AD_Plugin_ID_Name="Plugin";

@XendraColumn(AD_Element_ID="895f0c3e-fa52-48b7-8fce-f9b2dc637774",ColumnName="AD_Plugin_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fbccf247-6571-4041-9fc7-3eb6430136f4",
Synchronized="2017-08-05 16:52:44.0")
/** Column name AD_Plugin_ID */
public static final String COLUMNNAME_AD_Plugin_ID = "AD_Plugin_ID";
/** Set Print Format.
@param AD_PrintFormat_ID Data Print Format */
public void setAD_PrintFormat_ID (int AD_PrintFormat_ID)
{
if (AD_PrintFormat_ID <= 0) set_Value (COLUMNNAME_AD_PrintFormat_ID, null);
 else 
set_Value (COLUMNNAME_AD_PrintFormat_ID, Integer.valueOf(AD_PrintFormat_ID));
}
/** Get Print Format.
@return Data Print Format */
public int getAD_PrintFormat_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_PrintFormat_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="14545222-a691-a8f8-dd72-e267984958c7")
public static String es_PE_FIELD_ReportProcess_PrintFormat_Description="Formato de Impresión de datos";

@XendraTrl(Identifier="14545222-a691-a8f8-dd72-e267984958c7")
public static String es_PE_FIELD_ReportProcess_PrintFormat_Help="El formato de impresión determina como se despliegan los datos para la impresión";

@XendraTrl(Identifier="14545222-a691-a8f8-dd72-e267984958c7")
public static String es_PE_FIELD_ReportProcess_PrintFormat_Name="Formato de Impresión";

@XendraField(AD_Column_ID="AD_PrintFormat_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0ec3d85a-ad30-4b8d-60c0-5aaaee5ad3d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsReport@='Y'",DisplayLength=14,IsReadOnly=false,SeqNo=190,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="14545222-a691-a8f8-dd72-e267984958c7")
public static final String FIELDNAME_ReportProcess_PrintFormat="14545222-a691-a8f8-dd72-e267984958c7";

@XendraTrl(Identifier="c8cedd60-fad0-d5fb-4fb5-4e2bb40ee0b7")
public static String es_PE_COLUMN_AD_PrintFormat_ID_Name="Formato de Impresión";

@XendraColumn(AD_Element_ID="3d4916cb-0ecd-15a5-1916-be4c68c10d1f",ColumnName="AD_PrintFormat_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c8cedd60-fad0-d5fb-4fb5-4e2bb40ee0b7",
Synchronized="2017-08-05 16:52:44.0")
/** Column name AD_PrintFormat_ID */
public static final String COLUMNNAME_AD_PrintFormat_ID = "AD_PrintFormat_ID";
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

@XendraTrl(Identifier="69cdcf7f-e4b1-1550-e61b-8eed0e3a004e")
public static String es_PE_FIELD_ReportProcess_Process_Description="Proceso ó Informe";

@XendraTrl(Identifier="69cdcf7f-e4b1-1550-e61b-8eed0e3a004e")
public static String es_PE_FIELD_ReportProcess_Process_Help="El campo proceso identifica un proceso ó Informe único en el sistema.";

@XendraTrl(Identifier="69cdcf7f-e4b1-1550-e61b-8eed0e3a004e")
public static String es_PE_FIELD_ReportProcess_Process_Name="Proceso";

@XendraField(AD_Column_ID="AD_Process_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0ec3d85a-ad30-4b8d-60c0-5aaaee5ad3d8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="69cdcf7f-e4b1-1550-e61b-8eed0e3a004e")
public static final String FIELDNAME_ReportProcess_Process="69cdcf7f-e4b1-1550-e61b-8eed0e3a004e";
/** Column name AD_Process_ID */
public static final String COLUMNNAME_AD_Process_ID = "AD_Process_ID";
/** Set Report View.
@param AD_ReportView_ID View used to generate this report */
public void setAD_ReportView_ID (int AD_ReportView_ID)
{
if (AD_ReportView_ID <= 0) set_Value (COLUMNNAME_AD_ReportView_ID, null);
 else 
set_Value (COLUMNNAME_AD_ReportView_ID, Integer.valueOf(AD_ReportView_ID));
}
/** Get Report View.
@return View used to generate this report */
public int getAD_ReportView_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_ReportView_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="cf2457b9-6df1-cb8c-d6cd-82456272cf9f")
public static String es_PE_FIELD_ReportProcess_ReportView_Description="Vista usada para generar este Informe";

@XendraTrl(Identifier="cf2457b9-6df1-cb8c-d6cd-82456272cf9f")
public static String es_PE_FIELD_ReportProcess_ReportView_Help="La Vista del Informe indica la vista usada para generar este Informe";

@XendraTrl(Identifier="cf2457b9-6df1-cb8c-d6cd-82456272cf9f")
public static String es_PE_FIELD_ReportProcess_ReportView_Name="Vista del Informe";

@XendraField(AD_Column_ID="AD_ReportView_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0ec3d85a-ad30-4b8d-60c0-5aaaee5ad3d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsReport@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cf2457b9-6df1-cb8c-d6cd-82456272cf9f")
public static final String FIELDNAME_ReportProcess_ReportView="cf2457b9-6df1-cb8c-d6cd-82456272cf9f";

@XendraTrl(Identifier="d1ca75d2-b4a9-026c-e496-7865fe395b2b")
public static String es_PE_COLUMN_AD_ReportView_ID_Name="Vista del Informe";

@XendraColumn(AD_Element_ID="c754a5db-23cc-4220-33ac-cc954cd05645",ColumnName="AD_ReportView_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d1ca75d2-b4a9-026c-e496-7865fe395b2b",
Synchronized="2017-08-05 16:52:44.0")
/** Column name AD_ReportView_ID */
public static final String COLUMNNAME_AD_ReportView_ID = "AD_ReportView_ID";
/** Set AD_Rule_ID.
@param AD_Rule_ID AD_Rule_ID */
public void setAD_Rule_ID (int AD_Rule_ID)
{
if (AD_Rule_ID <= 0) set_Value (COLUMNNAME_AD_Rule_ID, null);
 else 
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

@XendraTrl(Identifier="fc68e681-4cbd-4ccf-9f3b-6c339526235b")
public static String es_PE_FIELD_ReportProcess_AD_Rule_ID_Name="Rule";

@XendraField(AD_Column_ID="AD_Rule_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0ec3d85a-ad30-4b8d-60c0-5aaaee5ad3d8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-05-09 17:10:00.0",
Identifier="fc68e681-4cbd-4ccf-9f3b-6c339526235b")
public static final String FIELDNAME_ReportProcess_AD_Rule_ID="fc68e681-4cbd-4ccf-9f3b-6c339526235b";

@XendraTrl(Identifier="5b3e81cb-1e64-4603-9c5f-f06b62394c7e")
public static String es_PE_COLUMN_AD_Rule_ID_Name="AD_Rule_ID";

@XendraColumn(AD_Element_ID="4b4afdeb-6aca-d182-6e3a-83f0f6d29f7d",ColumnName="AD_Rule_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5b3e81cb-1e64-4603-9c5f-f06b62394c7e",
Synchronized="2017-08-05 16:52:44.0")
/** Column name AD_Rule_ID */
public static final String COLUMNNAME_AD_Rule_ID = "AD_Rule_ID";
/** Set Table.
@param AD_Table_ID Database Table information */
public void setAD_Table_ID (int AD_Table_ID)
{
if (AD_Table_ID <= 0) set_Value (COLUMNNAME_AD_Table_ID, null);
 else 
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

@XendraTrl(Identifier="af7e3366-a87f-9424-280b-d0c31cf5cb87")
public static String es_PE_FIELD_ReportProcess_Table_Description="Tabla para los campos";

@XendraTrl(Identifier="af7e3366-a87f-9424-280b-d0c31cf5cb87")
public static String es_PE_FIELD_ReportProcess_Table_Help="La Tabla indica una tabla en la que reside un campo ó campos.";

@XendraTrl(Identifier="af7e3366-a87f-9424-280b-d0c31cf5cb87")
public static String es_PE_FIELD_ReportProcess_Table_Name="Tabla";

@XendraField(AD_Column_ID="AD_Table_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0ec3d85a-ad30-4b8d-60c0-5aaaee5ad3d8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="af7e3366-a87f-9424-280b-d0c31cf5cb87")
public static final String FIELDNAME_ReportProcess_Table="af7e3366-a87f-9424-280b-d0c31cf5cb87";

@XendraTrl(Identifier="33c737ab-aefd-cf3f-197a-680a497acc7a")
public static String es_PE_COLUMN_AD_Table_ID_Name="Table";

@XendraColumn(AD_Element_ID="270eeb02-723b-0ecc-7f56-3c67fa71a7f1",ColumnName="AD_Table_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="33c737ab-aefd-cf3f-197a-680a497acc7a",
Synchronized="2017-08-05 16:52:44.0")
/** Column name AD_Table_ID */
public static final String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
/** Set Workflow.
@param AD_Workflow_ID Workflow or combination of tasks */
public void setAD_Workflow_ID (int AD_Workflow_ID)
{
if (AD_Workflow_ID <= 0) set_Value (COLUMNNAME_AD_Workflow_ID, null);
 else 
set_Value (COLUMNNAME_AD_Workflow_ID, Integer.valueOf(AD_Workflow_ID));
}
/** Get Workflow.
@return Workflow or combination of tasks */
public int getAD_Workflow_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Workflow_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="c360a94f-36ad-7a13-d694-67402eb80aa1")
public static String es_PE_FIELD_ReportProcess_Workflow_Description="Flujo de trabajo ó combinación de tareas";

@XendraTrl(Identifier="c360a94f-36ad-7a13-d694-67402eb80aa1")
public static String es_PE_FIELD_ReportProcess_Workflow_Help="El campo flujo de trabajo identifica un flujo de trabajo único en el sistema.";

@XendraTrl(Identifier="c360a94f-36ad-7a13-d694-67402eb80aa1")
public static String es_PE_FIELD_ReportProcess_Workflow_Name="Flujo de Trabajo";

@XendraField(AD_Column_ID="AD_Workflow_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0ec3d85a-ad30-4b8d-60c0-5aaaee5ad3d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c360a94f-36ad-7a13-d694-67402eb80aa1")
public static final String FIELDNAME_ReportProcess_Workflow="c360a94f-36ad-7a13-d694-67402eb80aa1";

@XendraTrl(Identifier="ac09882d-7ac3-193a-7d3f-564a3273228d")
public static String es_PE_COLUMN_AD_Workflow_ID_Name="Flujo de Trabajo";

@XendraColumn(AD_Element_ID="43635d58-652b-b89d-db56-913820c290aa",ColumnName="AD_Workflow_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="782a94d5-35b3-a8a4-f708-67e29e850978",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="ac09882d-7ac3-193a-7d3f-564a3273228d",Synchronized="2017-08-05 16:52:44.0")
/** Column name AD_Workflow_ID */
public static final String COLUMNNAME_AD_Workflow_ID = "AD_Workflow_ID";
/** Set Category Name.
@param CategoryName Name of the Category */
public void setCategoryName (String CategoryName)
{
if (CategoryName != null && CategoryName.length() > 60)
{
log.warning("Length > 60 - truncated");
CategoryName = CategoryName.substring(0,59);
}
set_Value (COLUMNNAME_CategoryName, CategoryName);
}
/** Get Category Name.
@return Name of the Category */
public String getCategoryName() 
{
String value = (String)get_Value(COLUMNNAME_CategoryName);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="7b8ba663-04e7-4b19-aa3f-193a6b39b2c3")
public static String es_PE_FIELD_ReportProcess_CategoryName_Description="Nombre de la Categoría";

@XendraTrl(Identifier="7b8ba663-04e7-4b19-aa3f-193a6b39b2c3")
public static String es_PE_FIELD_ReportProcess_CategoryName_Name="Nombre de la Categoría";

@XendraField(AD_Column_ID="CategoryName",IsCentrallyMaintained=true,
AD_Tab_ID="0ec3d85a-ad30-4b8d-60c0-5aaaee5ad3d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-05-09 17:10:00.0",
Identifier="7b8ba663-04e7-4b19-aa3f-193a6b39b2c3")
public static final String FIELDNAME_ReportProcess_CategoryName="7b8ba663-04e7-4b19-aa3f-193a6b39b2c3";

@XendraTrl(Identifier="4f75fc7d-ff40-4bb8-bfd5-a984a61061c8")
public static String es_PE_COLUMN_CategoryName_Name="Category Name";

@XendraColumn(AD_Element_ID="6f30a805-6fdd-446d-efc8-cf35be4e2c2d",ColumnName="CategoryName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4f75fc7d-ff40-4bb8-bfd5-a984a61061c8",
Synchronized="2017-08-05 16:52:44.0")
/** Column name CategoryName */
public static final String COLUMNNAME_CategoryName = "CategoryName";
/** Set Classname.
@param Classname Java Classname */
public void setClassname (String Classname)
{
if (Classname != null && Classname.length() > 60)
{
log.warning("Length > 60 - truncated");
Classname = Classname.substring(0,59);
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
@XendraTrl(Identifier="d29b612e-e832-383c-0af0-1309b974c34a")
public static String es_PE_FIELD_ReportProcess_Classname_Description="Nombre de la clase Java";

@XendraTrl(Identifier="d29b612e-e832-383c-0af0-1309b974c34a")
public static String es_PE_FIELD_ReportProcess_Classname_Help="El nombre de clase identifica el nombre de la clase Java usada por este Informe ó proceso.";

@XendraTrl(Identifier="d29b612e-e832-383c-0af0-1309b974c34a")
public static String es_PE_FIELD_ReportProcess_Classname_Name="Nombre de Clase";

@XendraField(AD_Column_ID="Classname",IsCentrallyMaintained=true,
AD_Tab_ID="0ec3d85a-ad30-4b8d-60c0-5aaaee5ad3d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=40,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d29b612e-e832-383c-0af0-1309b974c34a")
public static final String FIELDNAME_ReportProcess_Classname="d29b612e-e832-383c-0af0-1309b974c34a";

@XendraTrl(Identifier="20a7d318-e97c-b4b6-ab9e-39314cf57015")
public static String es_PE_COLUMN_Classname_Name="Nombre de Clase";

@XendraColumn(AD_Element_ID="43b208b9-53a3-0d59-0255-aaf07c9bd7ce",ColumnName="Classname",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="20a7d318-e97c-b4b6-ab9e-39314cf57015",
Synchronized="2017-08-05 16:52:44.0")
/** Column name Classname */
public static final String COLUMNNAME_Classname = "Classname";
/** Set Content.
@param Content Content */
public void setContent (String Content)
{
set_Value (COLUMNNAME_Content, Content);
}
/** Get Content.
@return Content */
public String getContent() 
{
String value = (String)get_Value(COLUMNNAME_Content);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="e08063fe-8faa-4708-ba75-43aa24ad92e7")
public static String es_PE_FIELD_ReportProcess_Content_Name="content";

@XendraField(AD_Column_ID="Content",IsCentrallyMaintained=true,
AD_Tab_ID="0ec3d85a-ad30-4b8d-60c0-5aaaee5ad3d8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-05-01 20:03:45.0",
Identifier="e08063fe-8faa-4708-ba75-43aa24ad92e7")
public static final String FIELDNAME_ReportProcess_Content="e08063fe-8faa-4708-ba75-43aa24ad92e7";

@XendraTrl(Identifier="d3c65bad-82fb-470e-9cbb-032cc4f7ef70")
public static String es_PE_COLUMN_Content_Name="Content";

@XendraColumn(AD_Element_ID="1aa0835d-f6ff-ae44-3d38-0719eab019ce",ColumnName="Content",
AD_Reference_ID=45,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d3c65bad-82fb-470e-9cbb-032cc4f7ef70",
Synchronized="2017-08-05 16:52:44.0")
/** Column name Content */
public static final String COLUMNNAME_Content = "Content";
/** Set DataSource.
@param DataSource DataSource */
public void setDataSource (String DataSource)
{
set_Value (COLUMNNAME_DataSource, DataSource);
}
/** Get DataSource.
@return DataSource */
public String getDataSource() 
{
String value = (String)get_Value(COLUMNNAME_DataSource);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="4696b2bf-7b90-ce9b-1f90-6b63b2df7e63")
public static String es_PE_FIELD_ReportProcess_DataSource_Name="datasource";

@XendraField(AD_Column_ID="DataSource",IsCentrallyMaintained=true,
AD_Tab_ID="0ec3d85a-ad30-4b8d-60c0-5aaaee5ad3d8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=2147483647,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4696b2bf-7b90-ce9b-1f90-6b63b2df7e63")
public static final String FIELDNAME_ReportProcess_DataSource="4696b2bf-7b90-ce9b-1f90-6b63b2df7e63";

@XendraTrl(Identifier="e24d5337-88a3-f76c-b9d8-d95f7b455c66")
public static String es_PE_COLUMN_DataSource_Name="datasource";

@XendraColumn(AD_Element_ID="b1553225-5c21-ecd5-a173-cac62c25452f",ColumnName="DataSource",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2147483647,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="e24d5337-88a3-f76c-b9d8-d95f7b455c66",
Synchronized="2017-08-05 16:52:44.0")
/** Column name DataSource */
public static final String COLUMNNAME_DataSource = "DataSource";
/** Set Description.
@param Description Optional short DESCRIPTION of the record */
public void setDescription (String Description)
{
if (Description != null && Description.length() > 255)
{
log.warning("Length > 255 - truncated");
Description = Description.substring(0,254);
}
set_Value (COLUMNNAME_Description, Description);
}
/** Get Description.
@return Optional short DESCRIPTION of the record */
public String getDescription() 
{
String value = (String)get_Value(COLUMNNAME_Description);
if (value == null)
  return "";
if (value.contains("\""))
  value = value.replaceAll("\"","'");
if (value.contains("\n"))
  value = value.replaceAll("\n"," ");
if (value.contains(";"))
  value = value.replaceAll(";",":");
return value;
}

@XendraTrl(Identifier="a4766074-24d8-5af2-c25b-b99681b85894")
public static String es_PE_FIELD_ReportProcess_Description_Description="Observación";

@XendraTrl(Identifier="a4766074-24d8-5af2-c25b-b99681b85894")
public static String es_PE_FIELD_ReportProcess_Description_Help="Observación";

@XendraTrl(Identifier="a4766074-24d8-5af2-c25b-b99681b85894")
public static String es_PE_FIELD_ReportProcess_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="0ec3d85a-ad30-4b8d-60c0-5aaaee5ad3d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a4766074-24d8-5af2-c25b-b99681b85894")
public static final String FIELDNAME_ReportProcess_Description="a4766074-24d8-5af2-c25b-b99681b85894";

@XendraTrl(Identifier="f41b4f44-87c5-f30f-9ed8-b1470eb4e028")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f41b4f44-87c5-f30f-9ed8-b1470eb4e028",
Synchronized="2017-08-05 16:52:44.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";

/** EntityType AD_Reference=fae4ad31-8ff1-5d5c-8d47-2426c541cd74 */
public static final int ENTITYTYPE_AD_Reference_ID=389;
/** Set Entity Type.
@param EntityType Dictionary Entity Type: Determines ownership and synchronization */
public void setEntityType (String EntityType)
{
if (EntityType.length() > 4)
{
log.warning("Length > 4 - truncated");
EntityType = EntityType.substring(0,3);
}
set_Value (COLUMNNAME_EntityType, EntityType);
}
/** Get Entity Type.
@return Dictionary Entity Type: Determines ownership and synchronization */
public String getEntityType() 
{
return (String)get_Value(COLUMNNAME_EntityType);
}

@XendraTrl(Identifier="abc5d446-62e2-cf89-96b8-ab087387a6c5")
public static String es_PE_FIELD_ReportProcess_EntityType_Description="Tipo de Entidad Diccionario; determina propiedad y sincronización";

@XendraTrl(Identifier="abc5d446-62e2-cf89-96b8-ab087387a6c5")
public static String es_PE_FIELD_ReportProcess_EntityType_Help="Los tipos de entidad \"Diccionario\"; \"Adempiere\"; y \"Aplicación\" podrían ser automáticamente sincronizados y las personalizaciones eliminadas ó sobreescritas";

@XendraTrl(Identifier="abc5d446-62e2-cf89-96b8-ab087387a6c5")
public static String es_PE_FIELD_ReportProcess_EntityType_Name="Tipo de Entidad";

@XendraField(AD_Column_ID="EntityType",IsCentrallyMaintained=true,
AD_Tab_ID="0ec3d85a-ad30-4b8d-60c0-5aaaee5ad3d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="abc5d446-62e2-cf89-96b8-ab087387a6c5")
public static final String FIELDNAME_ReportProcess_EntityType="abc5d446-62e2-cf89-96b8-ab087387a6c5";

@XendraTrl(Identifier="e0dab794-9b0c-5f29-9750-4bb744bfb8a1")
public static String es_PE_COLUMN_EntityType_Name="Tipo de Entidad";

@XendraColumn(AD_Element_ID="5ba917bf-871c-6f19-aa50-962adc5de558",ColumnName="EntityType",
AD_Reference_ID=18,AD_Reference_Value_ID="fae4ad31-8ff1-5d5c-8d47-2426c541cd74",AD_Val_Rule_ID="",
FieldLength=4,DefaultValue="U",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="@EntityType@=D",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="e0dab794-9b0c-5f29-9750-4bb744bfb8a1",Synchronized="2017-08-05 16:52:44.0")
/** Column name EntityType */
public static final String COLUMNNAME_EntityType = "EntityType";
/** Set File Name.
@param FileName Name of the local file or URL */
public void setFileName (String FileName)
{
if (FileName != null && FileName.length() > 120)
{
log.warning("Length > 120 - truncated");
FileName = FileName.substring(0,119);
}
set_Value (COLUMNNAME_FileName, FileName);
}
/** Get File Name.
@return Name of the local file or URL */
public String getFileName() 
{
String value = (String)get_Value(COLUMNNAME_FileName);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="8fde8783-fbaa-4530-90ec-4c762605cec7")
public static String es_PE_FIELD_ReportProcess_FileName_Description="Nombre del fichero local ó URL";

@XendraTrl(Identifier="8fde8783-fbaa-4530-90ec-4c762605cec7")
public static String es_PE_FIELD_ReportProcess_FileName_Help="Nombre de un archivo en el espacio local del directorio ó URL (Archivo://.., http://.., ftp://..)";

@XendraTrl(Identifier="8fde8783-fbaa-4530-90ec-4c762605cec7")
public static String es_PE_FIELD_ReportProcess_FileName_Name="Nombre del Fichero";

@XendraField(AD_Column_ID="FileName",IsCentrallyMaintained=true,
AD_Tab_ID="0ec3d85a-ad30-4b8d-60c0-5aaaee5ad3d8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=120,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-05-13 05:40:29.0",
Identifier="8fde8783-fbaa-4530-90ec-4c762605cec7")
public static final String FIELDNAME_ReportProcess_FileName="8fde8783-fbaa-4530-90ec-4c762605cec7";

@XendraTrl(Identifier="60433993-c595-4951-ab79-e1f4f04e4a1e")
public static String es_PE_COLUMN_FileName_Name="File Name";

@XendraColumn(AD_Element_ID="309eb761-231b-faf7-45e5-8f880bf8604a",ColumnName="FileName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=120,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="60433993-c595-4951-ab79-e1f4f04e4a1e",
Synchronized="2017-08-05 16:52:44.0")
/** Column name FileName */
public static final String COLUMNNAME_FileName = "FileName";
/** Set Comment/Help.
@param Help Comment or Hint */
public void setHelp (String Help)
{
set_Value (COLUMNNAME_Help, Help);
}
/** Get Comment/Help.
@return Comment or Hint */
public String getHelp() 
{
String value = (String)get_Value(COLUMNNAME_Help);
if (value == null)
  return "";
if (value.contains("\""))
  value = value.replaceAll("\"","'");
if (value.contains("\n"))
  value = value.replaceAll("\n"," ");
if (value.contains(";"))
  value = value.replaceAll(";",":");
return value;
}

@XendraTrl(Identifier="5560b88e-1bed-fe75-4f83-8c55b0b4d88a")
public static String es_PE_FIELD_ReportProcess_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="5560b88e-1bed-fe75-4f83-8c55b0b4d88a")
public static String es_PE_FIELD_ReportProcess_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraTrl(Identifier="5560b88e-1bed-fe75-4f83-8c55b0b4d88a")
public static String es_PE_FIELD_ReportProcess_CommentHelp_Name="Ayuda";

@XendraField(AD_Column_ID="Help",IsCentrallyMaintained=true,
AD_Tab_ID="0ec3d85a-ad30-4b8d-60c0-5aaaee5ad3d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5560b88e-1bed-fe75-4f83-8c55b0b4d88a")
public static final String FIELDNAME_ReportProcess_CommentHelp="5560b88e-1bed-fe75-4f83-8c55b0b4d88a";

@XendraTrl(Identifier="39a60d1d-a39d-5464-fdef-bf673a3e242c")
public static String es_PE_COLUMN_Help_Name="Ayuda";

@XendraColumn(AD_Element_ID="a6fda582-56f9-6bb7-8436-285ce4f8de3f",ColumnName="Help",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="39a60d1d-a39d-5464-fdef-bf673a3e242c",
Synchronized="2017-08-05 16:52:44.0")
/** Column name Help */
public static final String COLUMNNAME_Help = "Help";
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
@XendraTrl(Identifier="d04e00cf-7b0c-4a96-87b8-d994e248c78b")
public static String es_PE_FIELD_ReportProcess_ID_Name="id";
@XendraField(AD_Column_ID="ID",
IsCentrallyMaintained=true,AD_Tab_ID="0ec3d85a-ad30-4b8d-60c0-5aaaee5ad3d8",AD_FieldGroup_ID="",
IsDisplayed=false,DisplayLogic="",DisplayLength=100,IsReadOnly=false,SeqNo=0,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2016-05-09 17:10:00.0",Identifier="d04e00cf-7b0c-4a96-87b8-d994e248c78b")
public static final String FIELDNAME_ReportProcess_ID="d04e00cf-7b0c-4a96-87b8-d994e248c78b";

@XendraTrl(Identifier="2d829356-a02c-4005-9bda-4ef6c9b3c939")
public static String es_PE_COLUMN_ID_Name="ID";

@XendraColumn(AD_Element_ID="089e82a2-807e-4cc0-96a6-05e479740035",ColumnName="ID",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=100,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2d829356-a02c-4005-9bda-4ef6c9b3c939",
Synchronized="2017-08-05 16:52:44.0")
/** Column name ID */
public static final String COLUMNNAME_ID = "ID";
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
@XendraTrl(Identifier="d5b1676a-a38c-4dbf-817a-6bcf6a4b0891")
public static String es_PE_FIELD_ReportProcess_Identifier_Name="Identifier";

@XendraField(AD_Column_ID="Identifier",IsCentrallyMaintained=true,
AD_Tab_ID="0ec3d85a-ad30-4b8d-60c0-5aaaee5ad3d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=36,IsReadOnly=false,SeqNo=270,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-05-09 17:10:00.0",
Identifier="d5b1676a-a38c-4dbf-817a-6bcf6a4b0891")
public static final String FIELDNAME_ReportProcess_Identifier="d5b1676a-a38c-4dbf-817a-6bcf6a4b0891";

@XendraTrl(Identifier="143303f4-cc3b-4260-ac94-7492d6dbdb53")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="143303f4-cc3b-4260-ac94-7492d6dbdb53",
Synchronized="2017-08-05 16:52:44.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Beta Functionality.
@param IsBetaFunctionality This functionality is considered Beta */
public void setIsBetaFunctionality (boolean IsBetaFunctionality)
{
set_Value (COLUMNNAME_IsBetaFunctionality, Boolean.valueOf(IsBetaFunctionality));
}
/** Get Beta Functionality.
@return This functionality is considered Beta */
public boolean isBetaFunctionality() 
{
Object oo = get_Value(COLUMNNAME_IsBetaFunctionality);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="9a27d4c9-8fdb-1970-07c7-feb8e6e36885")
public static String es_PE_FIELD_ReportProcess_BetaFunctionality_Description="Esta funcionalidad se considera como Beta";

@XendraTrl(Identifier="9a27d4c9-8fdb-1970-07c7-feb8e6e36885")
public static String es_PE_FIELD_ReportProcess_BetaFunctionality_Help="La funcionalidad beta no esta probada ni completada.";

@XendraTrl(Identifier="9a27d4c9-8fdb-1970-07c7-feb8e6e36885")
public static String es_PE_FIELD_ReportProcess_BetaFunctionality_Name="Funcionalidad Beta";

@XendraField(AD_Column_ID="IsBetaFunctionality",IsCentrallyMaintained=true,
AD_Tab_ID="0ec3d85a-ad30-4b8d-60c0-5aaaee5ad3d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9a27d4c9-8fdb-1970-07c7-feb8e6e36885")
public static final String FIELDNAME_ReportProcess_BetaFunctionality="9a27d4c9-8fdb-1970-07c7-feb8e6e36885";

@XendraTrl(Identifier="b604c978-9db6-c4f5-826a-734a41fdc635")
public static String es_PE_COLUMN_IsBetaFunctionality_Name="Funcionalidad Beta";

@XendraColumn(AD_Element_ID="6537bbc5-66e0-d1d1-5adc-cef787e2f4b6",
ColumnName="IsBetaFunctionality",AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="N",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="b604c978-9db6-c4f5-826a-734a41fdc635",Synchronized="2017-08-05 16:52:44.0")
/** Column name IsBetaFunctionality */
public static final String COLUMNNAME_IsBetaFunctionality = "IsBetaFunctionality";
/** Set Direct print.
@param IsDirectPrint Print without dialog */
public void setIsDirectPrint (boolean IsDirectPrint)
{
set_Value (COLUMNNAME_IsDirectPrint, Boolean.valueOf(IsDirectPrint));
}
/** Get Direct print.
@return Print without dialog */
public boolean isDirectPrint() 
{
Object oo = get_Value(COLUMNNAME_IsDirectPrint);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="1b7f57bc-a5d4-8b71-087c-3e84fef7da83")
public static String es_PE_FIELD_ReportProcess_DirectPrint_Description="Imprimir sin diálogo";

@XendraTrl(Identifier="1b7f57bc-a5d4-8b71-087c-3e84fef7da83")
public static String es_PE_FIELD_ReportProcess_DirectPrint_Help="El cuadro de verificación Impresión directa indica que este Informe se imprimirá sin que un cuadro de diálogo de impresión se despliegue.";

@XendraTrl(Identifier="1b7f57bc-a5d4-8b71-087c-3e84fef7da83")
public static String es_PE_FIELD_ReportProcess_DirectPrint_Name="Impresión Directa";

@XendraField(AD_Column_ID="IsDirectPrint",IsCentrallyMaintained=true,
AD_Tab_ID="0ec3d85a-ad30-4b8d-60c0-5aaaee5ad3d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsReport@='Y'",DisplayLength=1,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1b7f57bc-a5d4-8b71-087c-3e84fef7da83")
public static final String FIELDNAME_ReportProcess_DirectPrint="1b7f57bc-a5d4-8b71-087c-3e84fef7da83";

@XendraTrl(Identifier="7a504464-5025-f0e5-8b74-730db8c6aa7c")
public static String es_PE_COLUMN_IsDirectPrint_Name="Impresión Directa";

@XendraColumn(AD_Element_ID="09b2bf5f-c1fd-938c-1fda-b5de7f4fc6f3",ColumnName="IsDirectPrint",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7a504464-5025-f0e5-8b74-730db8c6aa7c",
Synchronized="2017-08-05 16:52:44.0")
/** Column name IsDirectPrint */
public static final String COLUMNNAME_IsDirectPrint = "IsDirectPrint";
/** Set Report.
@param IsReport Indicates a Report record */
public void setIsReport (boolean IsReport)
{
set_Value (COLUMNNAME_IsReport, Boolean.valueOf(IsReport));
}
/** Get Report.
@return Indicates a Report record */
public boolean isReport() 
{
Object oo = get_Value(COLUMNNAME_IsReport);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="03f0cd42-e439-1123-8dda-d97fd4618f78")
public static String es_PE_FIELD_ReportProcess_Report_Description="Indica un registro del Informe";

@XendraTrl(Identifier="03f0cd42-e439-1123-8dda-d97fd4618f78")
public static String es_PE_FIELD_ReportProcess_Report_Help="El cuadro de verificación Informe indica que este registro es un Informe en oposición a un proceso";

@XendraTrl(Identifier="03f0cd42-e439-1123-8dda-d97fd4618f78")
public static String es_PE_FIELD_ReportProcess_Report_Name="Informe";

@XendraField(AD_Column_ID="IsReport",IsCentrallyMaintained=true,
AD_Tab_ID="0ec3d85a-ad30-4b8d-60c0-5aaaee5ad3d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="03f0cd42-e439-1123-8dda-d97fd4618f78")
public static final String FIELDNAME_ReportProcess_Report="03f0cd42-e439-1123-8dda-d97fd4618f78";

@XendraTrl(Identifier="7f25f0e5-0661-5b03-c4d1-5d9d5466fdeb")
public static String es_PE_COLUMN_IsReport_Name="Informe";

@XendraColumn(AD_Element_ID="bce12aa5-0ac9-9849-f760-ecf51caf7af2",ColumnName="IsReport",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7f25f0e5-0661-5b03-c4d1-5d9d5466fdeb",
Synchronized="2017-08-05 16:52:44.0")
/** Column name IsReport */
public static final String COLUMNNAME_IsReport = "IsReport";
/** Set Server Process.
@param IsServerProcess Run this Process on Server only */
public void setIsServerProcess (boolean IsServerProcess)
{
set_Value (COLUMNNAME_IsServerProcess, Boolean.valueOf(IsServerProcess));
}
/** Get Server Process.
@return Run this Process on Server only */
public boolean isServerProcess() 
{
Object oo = get_Value(COLUMNNAME_IsServerProcess);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="13aa1d91-b574-b7a5-d416-d8ccbfc10c11")
public static String es_PE_FIELD_ReportProcess_ServerProcess_Description="Ejecutar este proceso sobre el servidor únicamente";

@XendraTrl(Identifier="13aa1d91-b574-b7a5-d416-d8ccbfc10c11")
public static String es_PE_FIELD_ReportProcess_ServerProcess_Help="Habilitando esta bandera se deshabilita que corra el proceso en el cliente. Esto disminuye potencialmente la disponibilidad";

@XendraTrl(Identifier="13aa1d91-b574-b7a5-d416-d8ccbfc10c11")
public static String es_PE_FIELD_ReportProcess_ServerProcess_Name="Proceso del Servidor";

@XendraField(AD_Column_ID="IsServerProcess",IsCentrallyMaintained=true,
AD_Tab_ID="0ec3d85a-ad30-4b8d-60c0-5aaaee5ad3d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsReport@=N",DisplayLength=1,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="13aa1d91-b574-b7a5-d416-d8ccbfc10c11")
public static final String FIELDNAME_ReportProcess_ServerProcess="13aa1d91-b574-b7a5-d416-d8ccbfc10c11";

@XendraTrl(Identifier="91ea1476-f621-eeeb-d68b-1f76880a048f")
public static String es_PE_COLUMN_IsServerProcess_Name="Proceso del Servidor";

@XendraColumn(AD_Element_ID="5f0d593d-5720-24cb-9a70-978ed8e51f2e",ColumnName="IsServerProcess",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="91ea1476-f621-eeeb-d68b-1f76880a048f",
Synchronized="2017-08-05 16:52:44.0")
/** Column name IsServerProcess */
public static final String COLUMNNAME_IsServerProcess = "IsServerProcess";
/** Set Jasper Report.
@param JasperReport Jasper Report */
public void setJasperReport (String JasperReport)
{
set_Value (COLUMNNAME_JasperReport, JasperReport);
}
/** Get Jasper Report.
@return Jasper Report */
public String getJasperReport() 
{
String value = (String)get_Value(COLUMNNAME_JasperReport);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="20f69334-946e-d22a-e825-f1f61daef1b4")
public static String es_PE_FIELD_ReportProcess_JasperReport_Name="Reporte Jasper";

@XendraField(AD_Column_ID="JasperReport",IsCentrallyMaintained=true,
AD_Tab_ID="0ec3d85a-ad30-4b8d-60c0-5aaaee5ad3d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=230,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="20f69334-946e-d22a-e825-f1f61daef1b4")
public static final String FIELDNAME_ReportProcess_JasperReport="20f69334-946e-d22a-e825-f1f61daef1b4";

@XendraTrl(Identifier="7b4025d4-7b24-28bb-ae58-c459db365553")
public static String es_PE_COLUMN_JasperReport_Name="Reporte Jasper";

@XendraColumn(AD_Element_ID="35e1cb2b-4609-2194-2765-a5c3ad493775",ColumnName="JasperReport",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7b4025d4-7b24-28bb-ae58-c459db365553",
Synchronized="2017-08-05 16:52:44.0")
/** Column name JasperReport */
public static final String COLUMNNAME_JasperReport = "JasperReport";
/** Set LinePrinterFormat.
@param LinePrinterFormat LinePrinterFormat */
public void setLinePrinterFormat (String LinePrinterFormat)
{
if (LinePrinterFormat != null && LinePrinterFormat.length() > 255)
{
log.warning("Length > 255 - truncated");
LinePrinterFormat = LinePrinterFormat.substring(0,254);
}
set_Value (COLUMNNAME_LinePrinterFormat, LinePrinterFormat);
}
/** Get LinePrinterFormat.
@return LinePrinterFormat */
public String getLinePrinterFormat() 
{
String value = (String)get_Value(COLUMNNAME_LinePrinterFormat);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="4981d60f-57e2-4b1b-9068-98d767a1b404")
public static String es_PE_FIELD_ReportProcess_LinePrinterFormat_Name="lineprinterformat";

@XendraField(AD_Column_ID="LinePrinterFormat",IsCentrallyMaintained=true,
AD_Tab_ID="0ec3d85a-ad30-4b8d-60c0-5aaaee5ad3d8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=255,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-05-09 17:10:00.0",
Identifier="4981d60f-57e2-4b1b-9068-98d767a1b404")
public static final String FIELDNAME_ReportProcess_LinePrinterFormat="4981d60f-57e2-4b1b-9068-98d767a1b404";

@XendraTrl(Identifier="b0ca9efd-7009-4925-b7ce-f5202830fb92")
public static String es_PE_COLUMN_LinePrinterFormat_Name="lineprinterformat";

@XendraColumn(AD_Element_ID="6370136e-0f21-4507-bfc3-89b137d0b004",ColumnName="LinePrinterFormat",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b0ca9efd-7009-4925-b7ce-f5202830fb92",
Synchronized="2017-08-05 16:52:44.0")
/** Column name LinePrinterFormat */
public static final String COLUMNNAME_LinePrinterFormat = "LinePrinterFormat";
/** Set Lockout.
@param Lockout Lockout */
public void setLockout (String Lockout)
{
if (Lockout != null && Lockout.length() > 1)
{
log.warning("Length > 1 - truncated");
Lockout = Lockout.substring(0,0);
}
set_Value (COLUMNNAME_Lockout, Lockout);
}
/** Get Lockout.
@return Lockout */
public String getLockout() 
{
String value = (String)get_Value(COLUMNNAME_Lockout);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="e585797f-6d99-413e-bcff-b65a6b8d4281")
public static String es_PE_COLUMN_Lockout_Name="Lockout";

@XendraColumn(AD_Element_ID="63f75f32-a2eb-4522-a988-6c753105407e",ColumnName="Lockout",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e585797f-6d99-413e-bcff-b65a6b8d4281",
Synchronized="2017-08-05 16:52:44.0")
/** Column name Lockout */
public static final String COLUMNNAME_Lockout = "Lockout";
/** Set Name.
@param Name Alphanumeric identifier of the entity */
public void setName (String Name)
{
if (Name == null) throw new IllegalArgumentException ("Name is mandatory.");
if (Name.length() > 60)
{
log.warning("Length > 60 - truncated");
Name = Name.substring(0,59);
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
@XendraTrl(Identifier="066cbbbd-a40a-a701-1d8b-8b405ba360a0")
public static String es_PE_FIELD_ReportProcess_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="066cbbbd-a40a-a701-1d8b-8b405ba360a0")
public static String es_PE_FIELD_ReportProcess_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="066cbbbd-a40a-a701-1d8b-8b405ba360a0")
public static String es_PE_FIELD_ReportProcess_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="0ec3d85a-ad30-4b8d-60c0-5aaaee5ad3d8",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=2,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="066cbbbd-a40a-a701-1d8b-8b405ba360a0")
public static final String FIELDNAME_ReportProcess_Name="066cbbbd-a40a-a701-1d8b-8b405ba360a0";

@XendraTrl(Identifier="7297bac8-c639-07ed-b7e2-016be65a26d0")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7297bac8-c639-07ed-b7e2-016be65a26d0",
Synchronized="2017-08-05 16:52:44.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Procedure.
@param ProcedureName Name of the Database Procedure */
public void setProcedureName (String ProcedureName)
{
if (ProcedureName != null && ProcedureName.length() > 60)
{
log.warning("Length > 60 - truncated");
ProcedureName = ProcedureName.substring(0,59);
}
set_Value (COLUMNNAME_ProcedureName, ProcedureName);
}
/** Get Procedure.
@return Name of the Database Procedure */
public String getProcedureName() 
{
String value = (String)get_Value(COLUMNNAME_ProcedureName);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="157ff919-aa68-5638-6c57-2b9c0072ead4")
public static String es_PE_FIELD_ReportProcess_Procedure_Description="Nombre del procedimiento de la base de datos.";

@XendraTrl(Identifier="157ff919-aa68-5638-6c57-2b9c0072ead4")
public static String es_PE_FIELD_ReportProcess_Procedure_Help="El Procedimiento indica el nombre del procedimiento de la base de datos llamado por este Informe ó proceso.";

@XendraTrl(Identifier="157ff919-aa68-5638-6c57-2b9c0072ead4")
public static String es_PE_FIELD_ReportProcess_Procedure_Name="Procedimiento";

@XendraField(AD_Column_ID="ProcedureName",IsCentrallyMaintained=true,
AD_Tab_ID="0ec3d85a-ad30-4b8d-60c0-5aaaee5ad3d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="157ff919-aa68-5638-6c57-2b9c0072ead4")
public static final String FIELDNAME_ReportProcess_Procedure="157ff919-aa68-5638-6c57-2b9c0072ead4";

@XendraTrl(Identifier="3e1dc429-527a-5844-d7b2-07253f03d340")
public static String es_PE_COLUMN_ProcedureName_Name="Procedimiento";

@XendraColumn(AD_Element_ID="0eef0e8c-15a9-03f5-9f80-11823842c746",ColumnName="ProcedureName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3e1dc429-527a-5844-d7b2-07253f03d340",
Synchronized="2017-08-05 16:52:44.0")
/** Column name ProcedureName */
public static final String COLUMNNAME_ProcedureName = "ProcedureName";
/** Set Properties.
@param Properties Properties */
public void setProperties (HashMap Properties)
{
set_Value (COLUMNNAME_Properties, Properties);
}
/** Get Properties.
@return Properties */
public HashMap getProperties() 
{
HashMap propsrc = (HashMap)get_Value(COLUMNNAME_Properties);
if (propsrc == null) return new HashMap();
 HashMap propdst = (HashMap) propsrc.clone();
return propdst;
}

@XendraTrl(Identifier="df51a403-89c5-4e7d-b10d-bffdb79274f3")
public static String es_PE_FIELD_ReportProcess_Properties_Name="Properties";

@XendraField(AD_Column_ID="Properties",IsCentrallyMaintained=true,
AD_Tab_ID="0ec3d85a-ad30-4b8d-60c0-5aaaee5ad3d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=250,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-05-09 17:10:00.0",
Identifier="df51a403-89c5-4e7d-b10d-bffdb79274f3")
public static final String FIELDNAME_ReportProcess_Properties="df51a403-89c5-4e7d-b10d-bffdb79274f3";

@XendraTrl(Identifier="37b7bc4e-6716-4ffa-a647-8bbc7463ea1a")
public static String es_PE_COLUMN_Properties_Name="Properties";

@XendraColumn(AD_Element_ID="acc3987b-292c-475a-86b5-5104970a96f3",ColumnName="Properties",
AD_Reference_ID=46,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="37b7bc4e-6716-4ffa-a647-8bbc7463ea1a",
Synchronized="2017-08-05 16:52:44.0")
/** Column name Properties */
public static final String COLUMNNAME_Properties = "Properties";

/** RuleType AD_Reference=c30f8c29-bd66-4674-9c29-dd0e2bb96611 */
public static final int RULETYPE_AD_Reference_ID=1000056;
/** Set RuleType.
@param RuleType RuleType */
public void setRuleType (String RuleType)
{
if (RuleType == null || RuleType.equals(REF_RuleType.SQL) || RuleType.equals(REF_RuleType.AspectOrientProgram) || RuleType.equals(REF_RuleType.JSR94RuleEngineAPI) || RuleType.equals(REF_RuleType.JSR223ScriptingAPIs) || RuleType.equals(REF_RuleType.Listener) || RuleType.equals(REF_RuleType.Acceptor));
 else throw new IllegalArgumentException ("RuleType Invalid value - " + RuleType + " - Reference_ID=1000056 - Q - O - R - S - L - A");
if (RuleType != null && RuleType.length() > 1)
{
log.warning("Length > 1 - truncated");
RuleType = RuleType.substring(0,0);
}
set_Value (COLUMNNAME_RuleType, RuleType);
}
/** Get RuleType.
@return RuleType */
public String getRuleType() 
{
return (String)get_Value(COLUMNNAME_RuleType);
}

@XendraTrl(Identifier="e0e86cf4-57c0-4d03-8686-9e67527a449a")
public static String es_PE_FIELD_ReportProcess_RuleType_Name="ruletype";

@XendraField(AD_Column_ID="RuleType",IsCentrallyMaintained=true,
AD_Tab_ID="0ec3d85a-ad30-4b8d-60c0-5aaaee5ad3d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=280,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-05-09 17:10:00.0",
Identifier="e0e86cf4-57c0-4d03-8686-9e67527a449a")
public static final String FIELDNAME_ReportProcess_RuleType="e0e86cf4-57c0-4d03-8686-9e67527a449a";

@XendraTrl(Identifier="f95e0f4c-b957-4e4e-b6c9-99463e01a189")
public static String es_PE_COLUMN_RuleType_Name="ruletype";

@XendraColumn(AD_Element_ID="361b3533-35d5-9200-918c-a94ad26a9c15",ColumnName="RuleType",
AD_Reference_ID=17,AD_Reference_Value_ID="c30f8c29-bd66-4674-9c29-dd0e2bb96611",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="f95e0f4c-b957-4e4e-b6c9-99463e01a189",Synchronized="2017-08-05 16:52:44.0")
/** Column name RuleType */
public static final String COLUMNNAME_RuleType = "RuleType";

/** ShowHelp AD_Reference=0d4825d0-6fd5-6ec1-a8d6-fd86c63ea82a */
public static final int SHOWHELP_AD_Reference_ID=50007;
/** Set Show Help.
@param ShowHelp Show Help */
public void setShowHelp (String ShowHelp)
{
if (ShowHelp == null || ShowHelp.equals(REF_ShowHelpList.AskUserForFutureUse) || ShowHelp.equals(REF_ShowHelpList.DonTShowHelp) || ShowHelp.equals(REF_ShowHelpList.ShowHelp));
 else throw new IllegalArgumentException ("ShowHelp Invalid value - " + ShowHelp + " - Reference_ID=50007 - A - N - Y");
if (ShowHelp != null && ShowHelp.length() > 1)
{
log.warning("Length > 1 - truncated");
ShowHelp = ShowHelp.substring(0,0);
}
set_Value (COLUMNNAME_ShowHelp, ShowHelp);
}
/** Get Show Help.
@return Show Help */
public String getShowHelp() 
{
return (String)get_Value(COLUMNNAME_ShowHelp);
}

@XendraTrl(Identifier="0b6c7761-a64c-cb2d-22d2-5739280aafd2")
public static String es_PE_FIELD_ReportProcess_ShowHelp_Name="Show Help";

@XendraField(AD_Column_ID="ShowHelp",IsCentrallyMaintained=true,
AD_Tab_ID="0ec3d85a-ad30-4b8d-60c0-5aaaee5ad3d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=200,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0b6c7761-a64c-cb2d-22d2-5739280aafd2")
public static final String FIELDNAME_ReportProcess_ShowHelp="0b6c7761-a64c-cb2d-22d2-5739280aafd2";

@XendraTrl(Identifier="416481eb-dd19-884d-2f84-8d620dab52a6")
public static String es_PE_COLUMN_ShowHelp_Name="Show Help";

@XendraColumn(AD_Element_ID="422308d1-e9e4-fa85-67a3-936c4a1fb485",ColumnName="ShowHelp",
AD_Reference_ID=17,AD_Reference_Value_ID="0d4825d0-6fd5-6ec1-a8d6-fd86c63ea82a",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="Y",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="416481eb-dd19-884d-2f84-8d620dab52a6",Synchronized="2017-08-05 16:52:44.0")
/** Column name ShowHelp */
public static final String COLUMNNAME_ShowHelp = "ShowHelp";
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
@XendraTrl(Identifier="9aa7b9b8-d5fb-47ea-b2f2-fb4a6a6d2b86")
public static String es_PE_COLUMN_StackTrace_Name="Stack Trace";

@XendraColumn(AD_Element_ID="6c9d4846-c398-7ea2-15c8-14fd5120ca70",ColumnName="StackTrace",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9aa7b9b8-d5fb-47ea-b2f2-fb4a6a6d2b86",
Synchronized="2017-08-05 16:52:44.0")
/** Column name StackTrace */
public static final String COLUMNNAME_StackTrace = "StackTrace";
/** Set Statistic Count.
@param Statistic_Count Internal statistics how often the entity was used */
public void setStatistic_Count (int Statistic_Count)
{
set_Value (COLUMNNAME_Statistic_Count, Integer.valueOf(Statistic_Count));
}
/** Get Statistic Count.
@return Internal statistics how often the entity was used */
public int getStatistic_Count() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Statistic_Count);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="a50786ca-0ddf-073f-daa4-27efc9c7b82c")
public static String es_PE_FIELD_ReportProcess_StatisticCount_Description="Estadística interna de que tan frecuente la entidad es usada";

@XendraTrl(Identifier="a50786ca-0ddf-073f-daa4-27efc9c7b82c")
public static String es_PE_FIELD_ReportProcess_StatisticCount_Name="Cuenta Estadística";

@XendraField(AD_Column_ID="Statistic_Count",IsCentrallyMaintained=true,
AD_Tab_ID="0ec3d85a-ad30-4b8d-60c0-5aaaee5ad3d8",AD_FieldGroup_ID="Statistics",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=true,SeqNo=210,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a50786ca-0ddf-073f-daa4-27efc9c7b82c")
public static final String FIELDNAME_ReportProcess_StatisticCount="a50786ca-0ddf-073f-daa4-27efc9c7b82c";

@XendraTrl(Identifier="2b7ea5e5-5a2e-e501-fd52-746caf0630c8")
public static String es_PE_COLUMN_Statistic_Count_Name="Cuenta Estadística";

@XendraColumn(AD_Element_ID="0decf1d6-f75d-a96d-20b2-1c94bac69359",ColumnName="Statistic_Count",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2b7ea5e5-5a2e-e501-fd52-746caf0630c8",
Synchronized="2017-08-05 16:52:44.0")
/** Column name Statistic_Count */
public static final String COLUMNNAME_Statistic_Count = "Statistic_Count";
/** Set Statistic Seconds.
@param Statistic_Seconds Internal statistics how many seconds a process took */
public void setStatistic_Seconds (int Statistic_Seconds)
{
set_Value (COLUMNNAME_Statistic_Seconds, Integer.valueOf(Statistic_Seconds));
}
/** Get Statistic Seconds.
@return Internal statistics how many seconds a process took */
public int getStatistic_Seconds() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Statistic_Seconds);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d78ad1d1-7c4e-b8b4-f83f-e63f9b82034b")
public static String es_PE_FIELD_ReportProcess_StatisticSeconds_Description="Estadísticas internas de qué tantos segundos toma un proceso";

@XendraTrl(Identifier="d78ad1d1-7c4e-b8b4-f83f-e63f9b82034b")
public static String es_PE_FIELD_ReportProcess_StatisticSeconds_Help="Para uso interno";

@XendraTrl(Identifier="d78ad1d1-7c4e-b8b4-f83f-e63f9b82034b")
public static String es_PE_FIELD_ReportProcess_StatisticSeconds_Name="Segundos Estáticos";

@XendraField(AD_Column_ID="Statistic_Seconds",IsCentrallyMaintained=true,
AD_Tab_ID="0ec3d85a-ad30-4b8d-60c0-5aaaee5ad3d8",AD_FieldGroup_ID="Statistics",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=true,SeqNo=220,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d78ad1d1-7c4e-b8b4-f83f-e63f9b82034b")
public static final String FIELDNAME_ReportProcess_StatisticSeconds="d78ad1d1-7c4e-b8b4-f83f-e63f9b82034b";

@XendraTrl(Identifier="7ea3ddd5-ec5f-cd94-aa93-d2096992327e")
public static String es_PE_COLUMN_Statistic_Seconds_Name="Segundos Estáticos";

@XendraColumn(AD_Element_ID="a433661b-333e-a177-4d86-0866341177cc",ColumnName="Statistic_Seconds",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7ea3ddd5-ec5f-cd94-aa93-d2096992327e",
Synchronized="2017-08-05 16:52:45.0")
/** Column name Statistic_Seconds */
public static final String COLUMNNAME_Statistic_Seconds = "Statistic_Seconds";
/** Set Synchronized.
@param Synchronized Synchronized */
public void setSynchronized (Timestamp Synchronized)
{
set_Value (COLUMNNAME_Synchronized, Synchronized);
}
/** Get Synchronized.
@return Synchronized */
public Timestamp getSynchronized() 
{
return (Timestamp)get_Value(COLUMNNAME_Synchronized);
}

@XendraTrl(Identifier="0d619b7d-53c8-4975-8021-c1687cc36827")
public static String es_PE_FIELD_ReportProcess_Synchronized_Name="Synchronized";

@XendraField(AD_Column_ID="Synchronized",IsCentrallyMaintained=true,
AD_Tab_ID="0ec3d85a-ad30-4b8d-60c0-5aaaee5ad3d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=29,IsReadOnly=false,SeqNo=260,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-05-09 17:10:00.0",
Identifier="0d619b7d-53c8-4975-8021-c1687cc36827")
public static final String FIELDNAME_ReportProcess_Synchronized="0d619b7d-53c8-4975-8021-c1687cc36827";

@XendraTrl(Identifier="fb642d8a-b2b4-4ed2-abcc-84ae5b41cb4a")
public static String es_PE_COLUMN_Synchronized_Name="Synchronized";

@XendraColumn(AD_Element_ID="08f1e976-ceeb-f830-9d75-bf94f13a98ce",ColumnName="Synchronized",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fb642d8a-b2b4-4ed2-abcc-84ae5b41cb4a",
Synchronized="2017-08-05 16:52:45.0")
/** Column name Synchronized */
public static final String COLUMNNAME_Synchronized = "Synchronized";
/** Set Search Key.
@param Value Search key for the record in the format required - must be unique */
public void setValue (String Value)
{
if (Value == null) throw new IllegalArgumentException ("Value is mandatory.");
if (Value.length() > 40)
{
log.warning("Length > 40 - truncated");
Value = Value.substring(0,39);
}
set_Value (COLUMNNAME_Value, Value);
}
/** Get Search Key.
@return Search key for the record in the format required - must be unique */
public String getValue() 
{
String value = (String)get_Value(COLUMNNAME_Value);
if (value == null)
  return "";
return value;
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), getValue());
}

@XendraTrl(Identifier="dd879bae-30f5-f0b8-1a8a-5112921e2ef6")
public static String es_PE_FIELD_ReportProcess_SearchKey_Description="Clave de búsqueda para el registro en el formato requerido; debe ser única";

@XendraTrl(Identifier="dd879bae-30f5-f0b8-1a8a-5112921e2ef6")
public static String es_PE_FIELD_ReportProcess_SearchKey_Help="Una clave de búsqueda le permite a usted un método rápido de encontrar un registro en particular";

@XendraTrl(Identifier="dd879bae-30f5-f0b8-1a8a-5112921e2ef6")
public static String es_PE_FIELD_ReportProcess_SearchKey_Name="Clave de Búsqueda";

@XendraField(AD_Column_ID="Value",IsCentrallyMaintained=true,
AD_Tab_ID="0ec3d85a-ad30-4b8d-60c0-5aaaee5ad3d8",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=30,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="dd879bae-30f5-f0b8-1a8a-5112921e2ef6")
public static final String FIELDNAME_ReportProcess_SearchKey="dd879bae-30f5-f0b8-1a8a-5112921e2ef6";

@XendraTrl(Identifier="c7996c18-9051-848f-7a90-cc3b772ca878")
public static String es_PE_COLUMN_Value_Name="Clave de Búsqueda";

@XendraColumn(AD_Element_ID="e75e100c-9b41-a643-2cb3-46eeced683d8",ColumnName="Value",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c7996c18-9051-848f-7a90-cc3b772ca878",
Synchronized="2017-08-05 16:52:45.0")
/** Column name Value */
public static final String COLUMNNAME_Value = "Value";
/** Set Workflow Key.
@param WorkflowValue Key of the Workflow to start */
public void setWorkflowValue (String WorkflowValue)
{
if (WorkflowValue != null && WorkflowValue.length() > 40)
{
log.warning("Length > 40 - truncated");
WorkflowValue = WorkflowValue.substring(0,39);
}
set_Value (COLUMNNAME_WorkflowValue, WorkflowValue);
}
/** Get Workflow Key.
@return Key of the Workflow to start */
public String getWorkflowValue() 
{
String value = (String)get_Value(COLUMNNAME_WorkflowValue);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="35fd3aa1-8792-09db-b1a3-c9a4166fd7c2")
public static String es_PE_FIELD_ReportProcess_WorkflowKey_Description="Llave del flujo de trabajo para comenzar";

@XendraTrl(Identifier="35fd3aa1-8792-09db-b1a3-c9a4166fd7c2")
public static String es_PE_FIELD_ReportProcess_WorkflowKey_Name="Clave de Flujo de Trabajo";

@XendraField(AD_Column_ID="WorkflowValue",IsCentrallyMaintained=true,
AD_Tab_ID="0ec3d85a-ad30-4b8d-60c0-5aaaee5ad3d8",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@IsReport@=N",DisplayLength=40,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="35fd3aa1-8792-09db-b1a3-c9a4166fd7c2")
public static final String FIELDNAME_ReportProcess_WorkflowKey="35fd3aa1-8792-09db-b1a3-c9a4166fd7c2";

@XendraTrl(Identifier="673e1906-cbc2-b860-1689-712bd18ed682")
public static String es_PE_COLUMN_WorkflowValue_Name="Clave de Flujo de Trabajo";

@XendraColumn(AD_Element_ID="b9aba6af-d820-88f6-39d5-1ff853f9264c",ColumnName="WorkflowValue",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="673e1906-cbc2-b860-1689-712bd18ed682",
Synchronized="2017-08-05 16:52:45.0")
/** Column name WorkflowValue */
public static final String COLUMNNAME_WorkflowValue = "WorkflowValue";
}
