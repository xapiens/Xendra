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
/** Generated Model for C_NonBusinessDay
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_NonBusinessDay extends PO
{
/** Standard Constructor
@param ctx context
@param C_NonBusinessDay_ID id
@param trxName transaction
*/
public X_C_NonBusinessDay (Properties ctx, int C_NonBusinessDay_ID, String trxName)
{
super (ctx, C_NonBusinessDay_ID, trxName);
/** if (C_NonBusinessDay_ID == 0)
{
setC_Calendar_ID (0);
setC_NonBusinessDay_ID (0);
setDate1 (new Timestamp(System.currentTimeMillis()));
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_NonBusinessDay (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=163 */
public static int Table_ID=MTable.getTable_ID("C_NonBusinessDay");

@XendraTrl(Identifier="a43b7db7-d59c-24e8-5138-93de34a642a4")
public static String es_PE_TAB_NonBusinessDay_Description="Definir días no laborales";

@XendraTrl(Identifier="a43b7db7-d59c-24e8-5138-93de34a642a4")
public static String es_PE_TAB_NonBusinessDay_Name="Día no laboral";

@XendraTrl(Identifier="a43b7db7-d59c-24e8-5138-93de34a642a4")
public static String es_PE_TAB_NonBusinessDay_Help="La pestaña de días no laborales define los días que serán excluidos cuando se calcule el día de pago basado en los términos de pago.";

@XendraTab(Name="Non Business Day",Description="Define Non Business Days",
Help="The Non Business Days Tab defines those days to exclude when calculating the due date for given payment terms.  For example, if an invoice terms was Net 10 days and the Invoice Date was 2/17/2000 the due date would be 2/27/2000.  If 2/27/2000 was defined as a non business day then the due date  on the Invoice would be 2/28/2000.",
AD_Window_ID="54524f0d-f1a4-460b-d2f8-1eff9aea350e",SeqNo=50,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="a43b7db7-d59c-24e8-5138-93de34a642a4",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_NonBusinessDay="a43b7db7-d59c-24e8-5138-93de34a642a4";

@XendraTrl(Identifier="481328e7-ab64-0669-a6fb-bef707a0ba88")
public static String es_PE_TABLE_C_NonBusinessDay_Name="Día Inhábil";

@XendraTable(Name="Non Business Day",Description="Day on which business is not transacted",Help="",
TableName="C_NonBusinessDay",AccessLevel="6",AD_Window_ID="54524f0d-f1a4-460b-d2f8-1eff9aea350e",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="481328e7-ab64-0669-a6fb-bef707a0ba88",Synchronized="2017-08-16 11:41:59.0")
/** TableName=C_NonBusinessDay */
public static final String Table_Name="C_NonBusinessDay";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_NonBusinessDay");

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
    Table_ID = MTable.getTable_ID("C_NonBusinessDay");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_NonBusinessDay[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="04320041-20e6-62e4-c3ce-c55bbc1d5c28")
public static String es_PE_FIELD_NonBusinessDay_Calendar_Description="Nombre del Calendario Contable";

@XendraTrl(Identifier="04320041-20e6-62e4-c3ce-c55bbc1d5c28")
public static String es_PE_FIELD_NonBusinessDay_Calendar_Help="El calendario únicamente identifica un calendario contable. Múltiples calendarios pueden ser usados. Ej. Ud. puede necesitar un calendario estándar que corre del 1 de enero al 31 de diciembre y un calendario fiscal que corre del 1 de julio al 30 de junio.";

@XendraTrl(Identifier="04320041-20e6-62e4-c3ce-c55bbc1d5c28")
public static String es_PE_FIELD_NonBusinessDay_Calendar_Name="Calendario";

@XendraField(AD_Column_ID="C_Calendar_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a43b7db7-d59c-24e8-5138-93de34a642a4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="04320041-20e6-62e4-c3ce-c55bbc1d5c28")
public static final String FIELDNAME_NonBusinessDay_Calendar="04320041-20e6-62e4-c3ce-c55bbc1d5c28";

@XendraTrl(Identifier="3f5d1d11-006b-ce80-05f7-eefb6b3d1bac")
public static String es_PE_COLUMN_C_Calendar_ID_Name="Calendario";

@XendraColumn(AD_Element_ID="f78f20f5-74d2-53fd-4e80-4df19abaa806",ColumnName="C_Calendar_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3f5d1d11-006b-ce80-05f7-eefb6b3d1bac",
Synchronized="2017-08-05 16:53:53.0")
/** Column name C_Calendar_ID */
public static final String COLUMNNAME_C_Calendar_ID = "C_Calendar_ID";
/** Set Non Business Day.
@param C_NonBusinessDay_ID Day on which business is not transacted */
public void setC_NonBusinessDay_ID (int C_NonBusinessDay_ID)
{
if (C_NonBusinessDay_ID < 1) throw new IllegalArgumentException ("C_NonBusinessDay_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_NonBusinessDay_ID, Integer.valueOf(C_NonBusinessDay_ID));
}
/** Get Non Business Day.
@return Day on which business is not transacted */
public int getC_NonBusinessDay_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_NonBusinessDay_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="e5c713e7-56d7-93e0-0cbd-d61654e3e05f")
public static String es_PE_FIELD_NonBusinessDay_NonBusinessDay_Description="Día en el cual no se hacen transacciones del negocio";

@XendraTrl(Identifier="e5c713e7-56d7-93e0-0cbd-d61654e3e05f")
public static String es_PE_FIELD_NonBusinessDay_NonBusinessDay_Name="Día Inhábil";

@XendraField(AD_Column_ID="C_NonBusinessDay_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a43b7db7-d59c-24e8-5138-93de34a642a4",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e5c713e7-56d7-93e0-0cbd-d61654e3e05f")
public static final String FIELDNAME_NonBusinessDay_NonBusinessDay="e5c713e7-56d7-93e0-0cbd-d61654e3e05f";
/** Column name C_NonBusinessDay_ID */
public static final String COLUMNNAME_C_NonBusinessDay_ID = "C_NonBusinessDay_ID";
/** Set Date.
@param Date1 Date when business is not conducted */
public void setDate1 (Timestamp Date1)
{
if (Date1 == null) throw new IllegalArgumentException ("Date1 is mandatory.");
set_Value (COLUMNNAME_Date1, Date1);
}
/** Get Date.
@return Date when business is not conducted */
public Timestamp getDate1() 
{
return (Timestamp)get_Value(COLUMNNAME_Date1);
}

@XendraTrl(Identifier="329fb928-1d5f-f00c-69ee-b14ed3b2ad59")
public static String es_PE_FIELD_NonBusinessDay_Date_Description="Fecha cuando el negocio no procede";

@XendraTrl(Identifier="329fb928-1d5f-f00c-69ee-b14ed3b2ad59")
public static String es_PE_FIELD_NonBusinessDay_Date_Help="El campo fecha identifica una fecha calendario en la cúal los negocios no proceden.";

@XendraTrl(Identifier="329fb928-1d5f-f00c-69ee-b14ed3b2ad59")
public static String es_PE_FIELD_NonBusinessDay_Date_Name="Fecha";

@XendraField(AD_Column_ID="Date1",IsCentrallyMaintained=true,
AD_Tab_ID="a43b7db7-d59c-24e8-5138-93de34a642a4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="329fb928-1d5f-f00c-69ee-b14ed3b2ad59")
public static final String FIELDNAME_NonBusinessDay_Date="329fb928-1d5f-f00c-69ee-b14ed3b2ad59";

@XendraTrl(Identifier="bc742ecb-2a27-2d18-ff79-3231554b3ed0")
public static String es_PE_COLUMN_Date1_Name="Fecha";

@XendraColumn(AD_Element_ID="bbe87c53-3cd6-1b96-3321-4d4a08dc298e",ColumnName="Date1",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bc742ecb-2a27-2d18-ff79-3231554b3ed0",
Synchronized="2017-08-05 16:53:53.0")
/** Column name Date1 */
public static final String COLUMNNAME_Date1 = "Date1";
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
@XendraTrl(Identifier="c20622cf-cd7a-4820-81e0-3abcda7130f7")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c20622cf-cd7a-4820-81e0-3abcda7130f7",
Synchronized="2017-08-05 16:53:53.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Name.
@param Name Alphanumeric identifier of the entity */
public void setName (String Name)
{
if (Name != null && Name.length() > 60)
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

@XendraTrl(Identifier="ecccfc21-8231-652f-6d60-f408ebc5a17c")
public static String es_PE_FIELD_NonBusinessDay_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="ecccfc21-8231-652f-6d60-f408ebc5a17c")
public static String es_PE_FIELD_NonBusinessDay_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="ecccfc21-8231-652f-6d60-f408ebc5a17c")
public static String es_PE_FIELD_NonBusinessDay_Name_Name="Nombre";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="a43b7db7-d59c-24e8-5138-93de34a642a4",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ecccfc21-8231-652f-6d60-f408ebc5a17c")
public static final String FIELDNAME_NonBusinessDay_Name="ecccfc21-8231-652f-6d60-f408ebc5a17c";

@XendraTrl(Identifier="5d1732ef-a672-ab38-a22e-e2b0961dcc48")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5d1732ef-a672-ab38-a22e-e2b0961dcc48",
Synchronized="2017-08-05 16:53:53.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
}
