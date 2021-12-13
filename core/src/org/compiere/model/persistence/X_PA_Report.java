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
/** Generated Model for PA_Report
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_PA_Report extends PO
{
/** Standard Constructor
@param ctx context
@param PA_Report_ID id
@param trxName transaction
*/
public X_PA_Report (Properties ctx, int PA_Report_ID, String trxName)
{
super (ctx, PA_Report_ID, trxName);
/** if (PA_Report_ID == 0)
{
setC_AcctSchema_ID (0);
setC_Calendar_ID (0);
setListSources (false);	
// N
setListTrx (false);	
// N
setName (null);
setPA_ReportColumnSet_ID (0);
setPA_Report_ID (0);
setPA_ReportLineSet_ID (0);
setProcessing (false);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_PA_Report (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=445 */
public static int Table_ID=MTable.getTable_ID("PA_Report");

@XendraTrl(Identifier="762436e0-4892-a546-1cd4-8b0fbf0f603d")
public static String es_PE_TAB_FinancialReport_Name="Informe Financiero";

@XendraTab(Name="Financial Report",Description="",Help="",
AD_Window_ID="f25057e6-b23b-95e6-7268-b4aa69b5111a",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="762436e0-4892-a546-1cd4-8b0fbf0f603d",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_FinancialReport="762436e0-4892-a546-1cd4-8b0fbf0f603d";

@XendraTrl(Identifier="093aea1a-a66b-5408-fe8c-4904e8166c90")
public static String es_PE_TABLE_PA_Report_Name="Informe Financiero";

@XendraTable(Name="Financial Report",AD_Package_ID="34bf6e21-8c70-8fb9-604c-a300eb925459",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Financial Report",Help="",
TableName="PA_Report",AccessLevel="3",AD_Window_ID="f25057e6-b23b-95e6-7268-b4aa69b5111a",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.performanceanalysis",
Identifier="093aea1a-a66b-5408-fe8c-4904e8166c90",Synchronized="2020-03-03 21:39:09.0")
/** TableName=PA_Report */
public static final String Table_Name="PA_Report";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"PA_Report");

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
    Table_ID = MTable.getTable_ID("PA_Report");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_PA_Report[").append(get_ID()).append("]");
return sb.toString();
}
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

@XendraTrl(Identifier="77fdfefe-f7f3-05eb-c3d8-6c518922c95c")
public static String es_PE_FIELD_FinancialReport_PrintFormat_Name="Formato de Impresión";

@XendraTrl(Identifier="77fdfefe-f7f3-05eb-c3d8-6c518922c95c")
public static String es_PE_FIELD_FinancialReport_PrintFormat_Description="Formato de Impresión de datos";

@XendraTrl(Identifier="77fdfefe-f7f3-05eb-c3d8-6c518922c95c")
public static String es_PE_FIELD_FinancialReport_PrintFormat_Help="El formato de impresión determina como se despliegan los datos para la impresión";

@XendraField(AD_Column_ID="AD_PrintFormat_ID",IsCentrallyMaintained=true,
AD_Tab_ID="762436e0-4892-a546-1cd4-8b0fbf0f603d",AD_FieldGroup_ID="Action",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=140,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="77fdfefe-f7f3-05eb-c3d8-6c518922c95c")
public static final String FIELDNAME_FinancialReport_PrintFormat="77fdfefe-f7f3-05eb-c3d8-6c518922c95c";

@XendraTrl(Identifier="edfc00ad-75c7-0a60-09ed-b4bcf83ed158")
public static String es_PE_COLUMN_AD_PrintFormat_ID_Name="Formato de Impresión";

@XendraColumn(AD_Element_ID="3d4916cb-0ecd-15a5-1916-be4c68c10d1f",ColumnName="AD_PrintFormat_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="edfc00ad-75c7-0a60-09ed-b4bcf83ed158",
Synchronized="2019-08-30 22:23:38.0")
/** Column name AD_PrintFormat_ID */
public static final String COLUMNNAME_AD_PrintFormat_ID = "AD_PrintFormat_ID";
/** Set Accounting Schema.
@param C_AcctSchema_ID Rules for accounting */
public void setC_AcctSchema_ID (int C_AcctSchema_ID)
{
if (C_AcctSchema_ID < 1) throw new IllegalArgumentException ("C_AcctSchema_ID is mandatory.");
set_Value (COLUMNNAME_C_AcctSchema_ID, Integer.valueOf(C_AcctSchema_ID));
}
/** Get Accounting Schema.
@return Rules for accounting */
public int getC_AcctSchema_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_AcctSchema_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="3210a5cb-2843-89ba-cb51-2451fa7244de")
public static String es_PE_FIELD_FinancialReport_AccountingSchema_Name="Esquema Contable";

@XendraTrl(Identifier="3210a5cb-2843-89ba-cb51-2451fa7244de")
public static String es_PE_FIELD_FinancialReport_AccountingSchema_Description="Reglas para contabilizar";

@XendraTrl(Identifier="3210a5cb-2843-89ba-cb51-2451fa7244de")
public static String es_PE_FIELD_FinancialReport_AccountingSchema_Help="Un esquema contable define las reglas contables usadas tales como método de costeo; moneda y calendario";

@XendraField(AD_Column_ID="C_AcctSchema_ID",IsCentrallyMaintained=true,
AD_Tab_ID="762436e0-4892-a546-1cd4-8b0fbf0f603d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3210a5cb-2843-89ba-cb51-2451fa7244de")
public static final String FIELDNAME_FinancialReport_AccountingSchema="3210a5cb-2843-89ba-cb51-2451fa7244de";

@XendraTrl(Identifier="5a471da2-5760-61d1-54a0-c43a39f77a54")
public static String es_PE_COLUMN_C_AcctSchema_ID_Name="Esquema Contable";

@XendraColumn(AD_Element_ID="561c9a32-9b35-9c1a-fabc-8abf7f2bb4ae",ColumnName="C_AcctSchema_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5a471da2-5760-61d1-54a0-c43a39f77a54",
Synchronized="2019-08-30 22:23:38.0")
/** Column name C_AcctSchema_ID */
public static final String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";
/** Set Calendar.
@param C_Calendar_ID Accounting Calendar Name */
public void setC_Calendar_ID (int C_Calendar_ID)
{
if (C_Calendar_ID < 1) throw new IllegalArgumentException ("C_Calendar_ID is mandatory.");
set_Value (COLUMNNAME_C_Calendar_ID, Integer.valueOf(C_Calendar_ID));
}
/** Get Calendar.
@return Accounting Calendar Name */
public int getC_Calendar_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Calendar_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d61e8f49-3f5e-4e4d-b5bb-d0174044cd00")
public static String es_PE_FIELD_FinancialReport_Calendar_Name="Calendario";

@XendraTrl(Identifier="d61e8f49-3f5e-4e4d-b5bb-d0174044cd00")
public static String es_PE_FIELD_FinancialReport_Calendar_Description="Nombre del Calendario Contable";

@XendraTrl(Identifier="d61e8f49-3f5e-4e4d-b5bb-d0174044cd00")
public static String es_PE_FIELD_FinancialReport_Calendar_Help="El calendario únicamente identifica un calendario contable. Múltiples calendarios pueden ser usados. Ej. Ud. puede necesitar un calendario estándar que corre del 1 de enero al 31 de diciembre y un calendario fiscal que corre del 1 de julio al 30 de junio.";

@XendraField(AD_Column_ID="C_Calendar_ID",IsCentrallyMaintained=true,
AD_Tab_ID="762436e0-4892-a546-1cd4-8b0fbf0f603d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d61e8f49-3f5e-4e4d-b5bb-d0174044cd00")
public static final String FIELDNAME_FinancialReport_Calendar="d61e8f49-3f5e-4e4d-b5bb-d0174044cd00";

@XendraTrl(Identifier="2711c9f8-1ff6-4cdb-641c-9b62041a55ae")
public static String es_PE_COLUMN_C_Calendar_ID_Name="Calendario";

@XendraColumn(AD_Element_ID="f78f20f5-74d2-53fd-4e80-4df19abaa806",ColumnName="C_Calendar_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2711c9f8-1ff6-4cdb-641c-9b62041a55ae",
Synchronized="2019-08-30 22:23:38.0")
/** Column name C_Calendar_ID */
public static final String COLUMNNAME_C_Calendar_ID = "C_Calendar_ID";
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

@XendraTrl(Identifier="38289dd0-49f3-90c4-b695-3f033a05de8f")
public static String es_PE_FIELD_FinancialReport_Description_Name="Observación";

@XendraTrl(Identifier="38289dd0-49f3-90c4-b695-3f033a05de8f")
public static String es_PE_FIELD_FinancialReport_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="38289dd0-49f3-90c4-b695-3f033a05de8f")
public static String es_PE_FIELD_FinancialReport_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="762436e0-4892-a546-1cd4-8b0fbf0f603d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="38289dd0-49f3-90c4-b695-3f033a05de8f")
public static final String FIELDNAME_FinancialReport_Description="38289dd0-49f3-90c4-b695-3f033a05de8f";

@XendraTrl(Identifier="1900d5c0-2bce-912f-e44c-04f2f70016c4")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1900d5c0-2bce-912f-e44c-04f2f70016c4",
Synchronized="2019-08-30 22:23:38.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
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
@XendraTrl(Identifier="eaef2b47-41f7-43be-a48e-3be834c3a8ae")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="eaef2b47-41f7-43be-a48e-3be834c3a8ae",
Synchronized="2019-08-30 22:23:38.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Jasper Process.
@param JasperProcess_ID The Jasper Process used by the printengine if any process defined */
public void setJasperProcess_ID (int JasperProcess_ID)
{
if (JasperProcess_ID <= 0) set_Value (COLUMNNAME_JasperProcess_ID, null);
 else 
set_Value (COLUMNNAME_JasperProcess_ID, Integer.valueOf(JasperProcess_ID));
}
/** Get Jasper Process.
@return The Jasper Process used by the printengine if any process defined */
public int getJasperProcess_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_JasperProcess_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="77f57dd7-ebaa-4139-bcad-9e8f409dd40e")
public static String es_PE_COLUMN_JasperProcess_ID_Name="Jasper Process";

@XendraColumn(AD_Element_ID="245c191e-a50f-e368-5255-09a68dfa4da7",ColumnName="JasperProcess_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="77f57dd7-ebaa-4139-bcad-9e8f409dd40e",
Synchronized="2019-08-30 22:23:38.0")
/** Column name JasperProcess_ID */
public static final String COLUMNNAME_JasperProcess_ID = "JasperProcess_ID";
/** Set JasperProcessing.
@param JasperProcessing JasperProcessing */
public void setJasperProcessing (boolean JasperProcessing)
{
set_Value (COLUMNNAME_JasperProcessing, Boolean.valueOf(JasperProcessing));
}
/** Get JasperProcessing.
@return JasperProcessing */
public boolean isJasperProcessing() 
{
Object oo = get_Value(COLUMNNAME_JasperProcessing);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="6d01d733-cbf3-401d-a698-bffc204fdc68")
public static String es_PE_COLUMN_JasperProcessing_Name="jasperprocessing";

@XendraColumn(AD_Element_ID="60c30b11-118d-4f1f-a626-38844d307985",ColumnName="JasperProcessing",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6d01d733-cbf3-401d-a698-bffc204fdc68",
Synchronized="2019-08-30 22:23:38.0")
/** Column name JasperProcessing */
public static final String COLUMNNAME_JasperProcessing = "JasperProcessing";
/** Set List Sources.
@param ListSources List Report Line Sources */
public void setListSources (boolean ListSources)
{
set_Value (COLUMNNAME_ListSources, Boolean.valueOf(ListSources));
}
/** Get List Sources.
@return List Report Line Sources */
public boolean isListSources() 
{
Object oo = get_Value(COLUMNNAME_ListSources);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="fba49c76-7b36-f62b-6896-ceab12f5a09a")
public static String es_PE_FIELD_FinancialReport_ListSources_Name="Lista de Fuentes";

@XendraTrl(Identifier="fba49c76-7b36-f62b-6896-ceab12f5a09a")
public static String es_PE_FIELD_FinancialReport_ListSources_Description="Informe de la lista de lineas de entrada";

@XendraTrl(Identifier="fba49c76-7b36-f62b-6896-ceab12f5a09a")
public static String es_PE_FIELD_FinancialReport_ListSources_Help="Lista también las fuentes de la línea del informe";

@XendraField(AD_Column_ID="ListSources",IsCentrallyMaintained=true,
AD_Tab_ID="762436e0-4892-a546-1cd4-8b0fbf0f603d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fba49c76-7b36-f62b-6896-ceab12f5a09a")
public static final String FIELDNAME_FinancialReport_ListSources="fba49c76-7b36-f62b-6896-ceab12f5a09a";

@XendraTrl(Identifier="304462db-db4b-63cb-a331-c7cc7d34d887")
public static String es_PE_COLUMN_ListSources_Name="Lista de Fuentes";

@XendraColumn(AD_Element_ID="c040bfa2-0f4d-961c-0508-a4703e1eebc5",ColumnName="ListSources",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="304462db-db4b-63cb-a331-c7cc7d34d887",
Synchronized="2019-08-30 22:23:38.0")
/** Column name ListSources */
public static final String COLUMNNAME_ListSources = "ListSources";
/** Set List Transactions.
@param ListTrx List the report transactions */
public void setListTrx (boolean ListTrx)
{
set_Value (COLUMNNAME_ListTrx, Boolean.valueOf(ListTrx));
}
/** Get List Transactions.
@return List the report transactions */
public boolean isListTrx() 
{
Object oo = get_Value(COLUMNNAME_ListTrx);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="c96e414f-99f2-e079-53f1-76f0d2b81a39")
public static String es_PE_FIELD_FinancialReport_ListTransactions_Name="Lista de Transacciones";

@XendraTrl(Identifier="c96e414f-99f2-e079-53f1-76f0d2b81a39")
public static String es_PE_FIELD_FinancialReport_ListTransactions_Description="Lista de informes de transacciones";

@XendraTrl(Identifier="c96e414f-99f2-e079-53f1-76f0d2b81a39")
public static String es_PE_FIELD_FinancialReport_ListTransactions_Help="Enumera la transacción de las líneas fuente del informe";

@XendraField(AD_Column_ID="ListTrx",IsCentrallyMaintained=true,
AD_Tab_ID="762436e0-4892-a546-1cd4-8b0fbf0f603d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@ListSources@=Y",DisplayLength=1,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c96e414f-99f2-e079-53f1-76f0d2b81a39")
public static final String FIELDNAME_FinancialReport_ListTransactions="c96e414f-99f2-e079-53f1-76f0d2b81a39";

@XendraTrl(Identifier="9b2533ce-67f4-f2a4-16bb-6732162e4872")
public static String es_PE_COLUMN_ListTrx_Name="Lista de Transacciones";

@XendraColumn(AD_Element_ID="96b49b08-999e-534e-e47c-e125037f4a28",ColumnName="ListTrx",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9b2533ce-67f4-f2a4-16bb-6732162e4872",
Synchronized="2019-08-30 22:23:38.0")
/** Column name ListTrx */
public static final String COLUMNNAME_ListTrx = "ListTrx";
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
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), getName());
}

@XendraTrl(Identifier="86e8c3e8-d1c6-eda3-72a0-1176b5b2f9aa")
public static String es_PE_FIELD_FinancialReport_Name_Name="Nombre";

@XendraTrl(Identifier="86e8c3e8-d1c6-eda3-72a0-1176b5b2f9aa")
public static String es_PE_FIELD_FinancialReport_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="86e8c3e8-d1c6-eda3-72a0-1176b5b2f9aa")
public static String es_PE_FIELD_FinancialReport_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="762436e0-4892-a546-1cd4-8b0fbf0f603d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="86e8c3e8-d1c6-eda3-72a0-1176b5b2f9aa")
public static final String FIELDNAME_FinancialReport_Name="86e8c3e8-d1c6-eda3-72a0-1176b5b2f9aa";

@XendraTrl(Identifier="06ba773a-51b0-376f-2f36-2f06260005e0")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="06ba773a-51b0-376f-2f36-2f06260005e0",
Synchronized="2019-08-30 22:23:38.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Report Column Set.
@param PA_ReportColumnSet_ID Collection of Columns for Report */
public void setPA_ReportColumnSet_ID (int PA_ReportColumnSet_ID)
{
if (PA_ReportColumnSet_ID < 1) throw new IllegalArgumentException ("PA_ReportColumnSet_ID is mandatory.");
set_Value (COLUMNNAME_PA_ReportColumnSet_ID, Integer.valueOf(PA_ReportColumnSet_ID));
}
/** Get Report Column Set.
@return Collection of Columns for Report */
public int getPA_ReportColumnSet_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_PA_ReportColumnSet_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="a365e42c-bf67-0458-50d2-719a1d6dbd50")
public static String es_PE_FIELD_FinancialReport_ReportColumnSet_Name="Grupo de Columnas del Informe";

@XendraTrl(Identifier="a365e42c-bf67-0458-50d2-719a1d6dbd50")
public static String es_PE_FIELD_FinancialReport_ReportColumnSet_Description="Colección de columnas para Informe";

@XendraTrl(Identifier="a365e42c-bf67-0458-50d2-719a1d6dbd50")
public static String es_PE_FIELD_FinancialReport_ReportColumnSet_Help="El conjunto de columnas del Informe identifica las columnas usadas en un Informe.";

@XendraField(AD_Column_ID="PA_ReportColumnSet_ID",IsCentrallyMaintained=true,
AD_Tab_ID="762436e0-4892-a546-1cd4-8b0fbf0f603d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a365e42c-bf67-0458-50d2-719a1d6dbd50")
public static final String FIELDNAME_FinancialReport_ReportColumnSet="a365e42c-bf67-0458-50d2-719a1d6dbd50";

@XendraTrl(Identifier="228f5ed8-edef-b60f-7d19-5cf0b2aecaff")
public static String es_PE_COLUMN_PA_ReportColumnSet_ID_Name="Grupo de Columnas del Informe";

@XendraColumn(AD_Element_ID="be7e7c3a-9bab-3f7d-1aa7-ef15bf66e346",
ColumnName="PA_ReportColumnSet_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="228f5ed8-edef-b60f-7d19-5cf0b2aecaff",Synchronized="2019-08-30 22:23:38.0")
/** Column name PA_ReportColumnSet_ID */
public static final String COLUMNNAME_PA_ReportColumnSet_ID = "PA_ReportColumnSet_ID";
/** Set PA_ReportCube_ID.
@param PA_ReportCube_ID PA_ReportCube_ID */
public void setPA_ReportCube_ID (int PA_ReportCube_ID)
{
if (PA_ReportCube_ID <= 0) set_Value (COLUMNNAME_PA_ReportCube_ID, null);
 else 
set_Value (COLUMNNAME_PA_ReportCube_ID, Integer.valueOf(PA_ReportCube_ID));
}
/** Get PA_ReportCube_ID.
@return PA_ReportCube_ID */
public int getPA_ReportCube_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_PA_ReportCube_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="1a86d03f-08d3-461c-9480-747558a4c4c6")
public static String es_PE_COLUMN_PA_ReportCube_ID_Name="pa_reportcube_id";

@XendraColumn(AD_Element_ID="d8b00463-55e0-4fee-9320-9137f349b772",ColumnName="PA_ReportCube_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1a86d03f-08d3-461c-9480-747558a4c4c6",
Synchronized="2019-08-30 22:23:38.0")
/** Column name PA_ReportCube_ID */
public static final String COLUMNNAME_PA_ReportCube_ID = "PA_ReportCube_ID";
/** Set Financial Report.
@param PA_Report_ID Financial Report */
public void setPA_Report_ID (int PA_Report_ID)
{
if (PA_Report_ID < 1) throw new IllegalArgumentException ("PA_Report_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_PA_Report_ID, Integer.valueOf(PA_Report_ID));
}
/** Get Financial Report.
@return Financial Report */
public int getPA_Report_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_PA_Report_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="0b6238b2-909d-c3a2-b8ea-c9843769322d")
public static String es_PE_FIELD_FinancialReport_FinancialReport_Name="Informe Financiero";

@XendraTrl(Identifier="0b6238b2-909d-c3a2-b8ea-c9843769322d")
public static String es_PE_FIELD_FinancialReport_FinancialReport_Description="Informe Financiero";

@XendraField(AD_Column_ID="PA_Report_ID",IsCentrallyMaintained=true,
AD_Tab_ID="762436e0-4892-a546-1cd4-8b0fbf0f603d",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0b6238b2-909d-c3a2-b8ea-c9843769322d")
public static final String FIELDNAME_FinancialReport_FinancialReport="0b6238b2-909d-c3a2-b8ea-c9843769322d";
/** Column name PA_Report_ID */
public static final String COLUMNNAME_PA_Report_ID = "PA_Report_ID";
/** Set Report Line Set.
@param PA_ReportLineSet_ID Report Line Set */
public void setPA_ReportLineSet_ID (int PA_ReportLineSet_ID)
{
if (PA_ReportLineSet_ID < 1) throw new IllegalArgumentException ("PA_ReportLineSet_ID is mandatory.");
set_Value (COLUMNNAME_PA_ReportLineSet_ID, Integer.valueOf(PA_ReportLineSet_ID));
}
/** Get Report Line Set.
@return Report Line Set */
public int getPA_ReportLineSet_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_PA_ReportLineSet_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="5131cc69-3177-d2f8-3da0-6c93c4f81ac2")
public static String es_PE_FIELD_FinancialReport_ReportLineSet_Name="Establecer Línea de Informe";

@XendraField(AD_Column_ID="PA_ReportLineSet_ID",IsCentrallyMaintained=true,
AD_Tab_ID="762436e0-4892-a546-1cd4-8b0fbf0f603d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5131cc69-3177-d2f8-3da0-6c93c4f81ac2")
public static final String FIELDNAME_FinancialReport_ReportLineSet="5131cc69-3177-d2f8-3da0-6c93c4f81ac2";

@XendraTrl(Identifier="cf8743e0-0874-4d37-0c3e-c30db83ff6ce")
public static String es_PE_COLUMN_PA_ReportLineSet_ID_Name="Establecer Línea de Informe";

@XendraColumn(AD_Element_ID="71d54bec-2aa5-e5e8-5306-b5fa80ab086e",
ColumnName="PA_ReportLineSet_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="cf8743e0-0874-4d37-0c3e-c30db83ff6ce",Synchronized="2019-08-30 22:23:38.0")
/** Column name PA_ReportLineSet_ID */
public static final String COLUMNNAME_PA_ReportLineSet_ID = "PA_ReportLineSet_ID";
/** Set PosPeriodName.
@param PosPeriodName PosPeriodName */
public void setPosPeriodName (String PosPeriodName)
{
if (PosPeriodName != null && PosPeriodName.length() > 20)
{
log.warning("Length > 20 - truncated");
PosPeriodName = PosPeriodName.substring(0,19);
}
set_Value (COLUMNNAME_PosPeriodName, PosPeriodName);
}
/** Get PosPeriodName.
@return PosPeriodName */
public String getPosPeriodName() 
{
String value = (String)get_Value(COLUMNNAME_PosPeriodName);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="01345a11-31f5-4927-af9a-661babdfd63a")
public static String es_PE_COLUMN_PosPeriodName_Name="posperiodname";

@XendraColumn(AD_Element_ID="a3abcd99-45ee-4c11-9616-101288fdfe44",ColumnName="PosPeriodName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="01345a11-31f5-4927-af9a-661babdfd63a",
Synchronized="2019-08-30 22:23:38.0")
/** Column name PosPeriodName */
public static final String COLUMNNAME_PosPeriodName = "PosPeriodName";
/** Set PrePeriodName.
@param PrePeriodName PrePeriodName */
public void setPrePeriodName (String PrePeriodName)
{
if (PrePeriodName != null && PrePeriodName.length() > 20)
{
log.warning("Length > 20 - truncated");
PrePeriodName = PrePeriodName.substring(0,19);
}
set_Value (COLUMNNAME_PrePeriodName, PrePeriodName);
}
/** Get PrePeriodName.
@return PrePeriodName */
public String getPrePeriodName() 
{
String value = (String)get_Value(COLUMNNAME_PrePeriodName);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="4c1898b5-feea-4932-8ac6-cf5460c212e7")
public static String es_PE_COLUMN_PrePeriodName_Name="preperiodname";

@XendraColumn(AD_Element_ID="be905527-b532-4270-8da6-a5b9de842bca",ColumnName="PrePeriodName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4c1898b5-feea-4932-8ac6-cf5460c212e7",
Synchronized="2019-08-30 22:23:38.0")
/** Column name PrePeriodName */
public static final String COLUMNNAME_PrePeriodName = "PrePeriodName";
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

@XendraTrl(Identifier="dd2f53b7-cb40-9d32-8d6e-fafe053cc55a")
public static String es_PE_FIELD_FinancialReport_ProcessNow_Name="Crear Informe";

@XendraTrl(Identifier="dd2f53b7-cb40-9d32-8d6e-fafe053cc55a")
public static String es_PE_FIELD_FinancialReport_ProcessNow_Description="Crea Informe Financiero";

@XendraTrl(Identifier="dd2f53b7-cb40-9d32-8d6e-fafe053cc55a")
public static String es_PE_FIELD_FinancialReport_ProcessNow_Help="El periodo por defaul es el periodo actual. Usted puede incorporar opcionalmente otras restricciones.";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="762436e0-4892-a546-1cd4-8b0fbf0f603d",AD_FieldGroup_ID="Action",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="dd2f53b7-cb40-9d32-8d6e-fafe053cc55a")
public static final String FIELDNAME_FinancialReport_ProcessNow="dd2f53b7-cb40-9d32-8d6e-fafe053cc55a";

@XendraTrl(Identifier="6e2292df-170d-aebe-d709-671652e1c836")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="05479439-2600-8d9b-a599-5386f0722e56",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="6e2292df-170d-aebe-d709-671652e1c836",Synchronized="2019-08-30 22:23:38.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
}
