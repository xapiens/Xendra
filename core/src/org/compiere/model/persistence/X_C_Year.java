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
/** Generated Model for C_Year
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_Year extends PO
{
/** Standard Constructor
@param ctx context
@param C_Year_ID id
@param trxName transaction
*/
public X_C_Year (Properties ctx, int C_Year_ID, String trxName)
{
super (ctx, C_Year_ID, trxName);
/** if (C_Year_ID == 0)
{
setC_Calendar_ID (0);
setC_Year_ID (0);
setDateAcctClose (new Timestamp(System.currentTimeMillis()));
setFiscalYear (null);
setIsClosed (false);	
// N
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_Year (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=177 */
public static int Table_ID=MTable.getTable_ID("C_Year");

@XendraTrl(Identifier="16660d6f-b0ca-f334-5dff-2f5cdf7519ee")
public static String es_PE_TAB_Year_Description="Definir año calendario";

@XendraTrl(Identifier="16660d6f-b0ca-f334-5dff-2f5cdf7519ee")
public static String es_PE_TAB_Year_Help="La ventana de año es usada para definir cada año para el calendario especifico.";

@XendraTrl(Identifier="16660d6f-b0ca-f334-5dff-2f5cdf7519ee")
public static String es_PE_TAB_Year_Name="Año";
@XendraTab(Name="Year",
Description="Define Calendar Year",
Help="The Year Window is used to define each year for the specified calendar.",
AD_Window_ID="54524f0d-f1a4-460b-d2f8-1eff9aea350e",SeqNo=20,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="16660d6f-b0ca-f334-5dff-2f5cdf7519ee",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Year="16660d6f-b0ca-f334-5dff-2f5cdf7519ee";

@XendraTrl(Identifier="630439f8-f6fd-c3ad-0344-302dfaf45373")
public static String es_PE_TABLE_C_Year_Name="Año";

@XendraTable(Name="Year",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Calendar Year",Help="",
TableName="C_Year",AccessLevel="2",AD_Window_ID="54524f0d-f1a4-460b-d2f8-1eff9aea350e",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=115,IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="630439f8-f6fd-c3ad-0344-302dfaf45373",Synchronized="2020-03-03 21:37:46.0")
/** TableName=C_Year */
public static final String Table_Name="C_Year";


@XendraIndex(Name="c_year_name",Identifier="91525c3d-f26c-afa8-ea42-1cdd563148f4",
Column_Names="c_calendar_id, fiscalyear",IsUnique="true",
TableIdentifier="91525c3d-f26c-afa8-ea42-1cdd563148f4",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_c_year_name = "91525c3d-f26c-afa8-ea42-1cdd563148f4";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_Year");

protected BigDecimal accessLevel = BigDecimal.valueOf(2);
/** AccessLevel
@return 2 - Client 
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
    Table_ID = MTable.getTable_ID("C_Year");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_Year[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Calendar.
@param C_Calendar_ID Accounting Calendar Name */
public void setC_Calendar_ID (int C_Calendar_ID)
{
if (C_Calendar_ID < 1) throw new IllegalArgumentException ("C_Calendar_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_Calendar_ID, Integer.valueOf(C_Calendar_ID));
}
/** Get Calendar.
@return Accounting Calendar Name */
public int getC_Calendar_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Calendar_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="59675dcb-9a57-a94f-05a2-e91d4d301e7c")
public static String es_PE_FIELD_Year_Calendar_Name="Calendario";

@XendraTrl(Identifier="59675dcb-9a57-a94f-05a2-e91d4d301e7c")
public static String es_PE_FIELD_Year_Calendar_Description="Nombre del Calendario Contable";

@XendraTrl(Identifier="59675dcb-9a57-a94f-05a2-e91d4d301e7c")
public static String es_PE_FIELD_Year_Calendar_Help="El calendario únicamente identifica un calendario contable. Múltiples calendarios pueden ser usados. Ej. Ud. puede necesitar un calendario estándar que corre del 1 de enero al 31 de diciembre y un calendario fiscal que corre del 1 de julio al 30 de junio.";

@XendraField(AD_Column_ID="C_Calendar_ID",IsCentrallyMaintained=true,
AD_Tab_ID="16660d6f-b0ca-f334-5dff-2f5cdf7519ee",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="59675dcb-9a57-a94f-05a2-e91d4d301e7c")
public static final String FIELDNAME_Year_Calendar="59675dcb-9a57-a94f-05a2-e91d4d301e7c";

@XendraTrl(Identifier="5d0d1dad-1706-3ccd-823c-fe23f74b273b")
public static String es_PE_COLUMN_C_Calendar_ID_Name="Calendario";

@XendraColumn(AD_Element_ID="f78f20f5-74d2-53fd-4e80-4df19abaa806",ColumnName="C_Calendar_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5d0d1dad-1706-3ccd-823c-fe23f74b273b",
Synchronized="2019-08-30 22:22:23.0")
/** Column name C_Calendar_ID */
public static final String COLUMNNAME_C_Calendar_ID = "C_Calendar_ID";
/** Set Year.
@param C_Year_ID Calendar Year */
public void setC_Year_ID (int C_Year_ID)
{
if (C_Year_ID < 1) throw new IllegalArgumentException ("C_Year_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_Year_ID, Integer.valueOf(C_Year_ID));
}
/** Get Year.
@return Calendar Year */
public int getC_Year_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Year_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d32e0cfc-389a-2390-636d-5d6feef42beb")
public static String es_PE_FIELD_Year_Year_Name="Año";

@XendraTrl(Identifier="d32e0cfc-389a-2390-636d-5d6feef42beb")
public static String es_PE_FIELD_Year_Year_Description="Año del calendario";

@XendraTrl(Identifier="d32e0cfc-389a-2390-636d-5d6feef42beb")
public static String es_PE_FIELD_Year_Year_Help="El Año identifica únicamente un año contable para un calendario";

@XendraField(AD_Column_ID="C_Year_ID",IsCentrallyMaintained=true,
AD_Tab_ID="16660d6f-b0ca-f334-5dff-2f5cdf7519ee",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d32e0cfc-389a-2390-636d-5d6feef42beb")
public static final String FIELDNAME_Year_Year="d32e0cfc-389a-2390-636d-5d6feef42beb";
/** Column name C_Year_ID */
public static final String COLUMNNAME_C_Year_ID = "C_Year_ID";
/** Set DateAcctClose.
@param DateAcctClose Accounting Date */
public void setDateAcctClose (Timestamp DateAcctClose)
{
if (DateAcctClose == null) throw new IllegalArgumentException ("DateAcctClose is mandatory.");
set_Value (COLUMNNAME_DateAcctClose, DateAcctClose);
}
/** Get DateAcctClose.
@return Accounting Date */
public Timestamp getDateAcctClose() 
{
return (Timestamp)get_Value(COLUMNNAME_DateAcctClose);
}

@XendraTrl(Identifier="d07ac3ce-d4e1-4935-b637-d499e20deeaa")
public static String es_PE_COLUMN_DateAcctClose_Name="DateAcctClose";

@XendraColumn(AD_Element_ID="09c02c54-f732-e8f4-06b7-b327c78eb009",ColumnName="DateAcctClose",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d07ac3ce-d4e1-4935-b637-d499e20deeaa",
Synchronized="2019-08-30 22:22:23.0")
/** Column name DateAcctClose */
public static final String COLUMNNAME_DateAcctClose = "DateAcctClose";
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

@XendraTrl(Identifier="d27eaa76-e2f2-e342-3b52-55a033eddef7")
public static String es_PE_FIELD_Year_Description_Name="Observación";

@XendraTrl(Identifier="d27eaa76-e2f2-e342-3b52-55a033eddef7")
public static String es_PE_FIELD_Year_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="d27eaa76-e2f2-e342-3b52-55a033eddef7")
public static String es_PE_FIELD_Year_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="16660d6f-b0ca-f334-5dff-2f5cdf7519ee",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d27eaa76-e2f2-e342-3b52-55a033eddef7")
public static final String FIELDNAME_Year_Description="d27eaa76-e2f2-e342-3b52-55a033eddef7";

@XendraTrl(Identifier="9d1ba9c4-1c9c-7d69-a6bd-8737af5d1a7a")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9d1ba9c4-1c9c-7d69-a6bd-8737af5d1a7a",
Synchronized="2019-08-30 22:22:23.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Year.
@param FiscalYear The Fiscal Year */
public void setFiscalYear (String FiscalYear)
{
if (FiscalYear == null) throw new IllegalArgumentException ("FiscalYear is mandatory.");
if (FiscalYear.length() > 10)
{
log.warning("Length > 10 - truncated");
FiscalYear = FiscalYear.substring(0,9);
}
set_Value (COLUMNNAME_FiscalYear, FiscalYear);
}
/** Get Year.
@return The Fiscal Year */
public String getFiscalYear() 
{
String value = (String)get_Value(COLUMNNAME_FiscalYear);
if (value == null)
  return "";
return value;
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), getFiscalYear());
}

@XendraTrl(Identifier="4ffbcb71-b7ae-1e69-2275-3539dc26e482")
public static String es_PE_FIELD_Year_Year2_Name="Año";

@XendraTrl(Identifier="4ffbcb71-b7ae-1e69-2275-3539dc26e482")
public static String es_PE_FIELD_Year_Year2_Description="Representa el año fisico";

@XendraTrl(Identifier="4ffbcb71-b7ae-1e69-2275-3539dc26e482")
public static String es_PE_FIELD_Year_Year2_Help="El año identifica el año calendario contable.";

@XendraField(AD_Column_ID="FiscalYear",IsCentrallyMaintained=true,
AD_Tab_ID="16660d6f-b0ca-f334-5dff-2f5cdf7519ee",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=50,SortNo=-1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4ffbcb71-b7ae-1e69-2275-3539dc26e482")
public static final String FIELDNAME_Year_Year2="4ffbcb71-b7ae-1e69-2275-3539dc26e482";

@XendraTrl(Identifier="7067adb5-8993-2fea-56b9-36e7bb0aeeb9")
public static String es_PE_COLUMN_FiscalYear_Name="Year";

@XendraColumn(AD_Element_ID="ab43c1df-0b0d-e7d5-da99-72761e9d52a4",ColumnName="FiscalYear",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7067adb5-8993-2fea-56b9-36e7bb0aeeb9",
Synchronized="2019-08-30 22:22:23.0")
/** Column name FiscalYear */
public static final String COLUMNNAME_FiscalYear = "FiscalYear";
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
@XendraTrl(Identifier="0ec9a918-e608-4b82-ad7d-8f46c6a3fc66")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0ec9a918-e608-4b82-ad7d-8f46c6a3fc66",
Synchronized="2019-08-30 22:22:23.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Closed Status.
@param IsClosed The status is closed */
public void setIsClosed (boolean IsClosed)
{
set_Value (COLUMNNAME_IsClosed, Boolean.valueOf(IsClosed));
}
/** Get Closed Status.
@return The status is closed */
public boolean isClosed() 
{
Object oo = get_Value(COLUMNNAME_IsClosed);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="4a301cae-f7e0-4ae5-abd0-ea3dd79d9559")
public static String es_PE_COLUMN_IsClosed_Name="Closed Status";

@XendraColumn(AD_Element_ID="a2f1da6b-5408-4e53-b0b9-51f029ef2549",ColumnName="IsClosed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4a301cae-f7e0-4ae5-abd0-ea3dd79d9559",
Synchronized="2019-08-30 22:22:23.0")
/** Column name IsClosed */
public static final String COLUMNNAME_IsClosed = "IsClosed";
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

@XendraTrl(Identifier="4eb55c64-f946-388b-0020-76bb6582648d")
public static String es_PE_FIELD_Year_ProcessNow_Name="Crear Períodos";

@XendraTrl(Identifier="4eb55c64-f946-388b-0020-76bb6582648d")
public static String es_PE_FIELD_Year_ProcessNow_Description="Crear 12 períodos de calendario estándar (Ene-Dic)";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="16660d6f-b0ca-f334-5dff-2f5cdf7519ee",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4eb55c64-f946-388b-0020-76bb6582648d")
public static final String FIELDNAME_Year_ProcessNow="4eb55c64-f946-388b-0020-76bb6582648d";

@XendraTrl(Identifier="5280634a-9aab-e766-4d7c-2932c3eba5f8")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="8e296982-10cd-3044-f422-b56e0f8f943e",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="5280634a-9aab-e766-4d7c-2932c3eba5f8",Synchronized="2019-08-30 22:22:23.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
}
