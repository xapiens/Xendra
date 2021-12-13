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
/** Generated Model for C_RevenueRecognition
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_RevenueRecognition extends PO
{
/** Standard Constructor
@param ctx context
@param C_RevenueRecognition_ID id
@param trxName transaction
*/
public X_C_RevenueRecognition (Properties ctx, int C_RevenueRecognition_ID, String trxName)
{
super (ctx, C_RevenueRecognition_ID, trxName);
/** if (C_RevenueRecognition_ID == 0)
{
setC_RevenueRecognition_ID (0);
setIsTimeBased (false);	
// N
setName (null);
setRecognitionFrequency (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_RevenueRecognition (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=336 */
public static int Table_ID=MTable.getTable_ID("C_RevenueRecognition");

@XendraTrl(Identifier="e4d1030c-9309-fe65-e965-254d4799daca")
public static String es_PE_TAB_RevenueRecognition_Description="Reconocimiento de Ingresos";

@XendraTrl(Identifier="e4d1030c-9309-fe65-e965-254d4799daca")
public static String es_PE_TAB_RevenueRecognition_Help="La pestaña Reconocimiento de Ingresos define los intervalos a los cuales los ingresos serán reconocidos. Es posible basar el reconocimiento de ingresos en los niveles de servicio previstos.";

@XendraTrl(Identifier="e4d1030c-9309-fe65-e965-254d4799daca")
public static String es_PE_TAB_RevenueRecognition_Name="Reconocimiento de Ingresos";

@XendraTab(Name="Revenue Recognition",Description="Revenue Recognition",
Help="The Revenue Recognition Tab defines the intervals at which revenue will be recognized.  You can also base the revenue recognition on provided Service Levels.",
AD_Window_ID="733a8f19-500f-50a8-f39f-40d4949bd162",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="e4d1030c-9309-fe65-e965-254d4799daca",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_RevenueRecognition="e4d1030c-9309-fe65-e965-254d4799daca";

@XendraTrl(Identifier="006b6711-3073-f6c8-3508-6a8ab8e30c0f")
public static String es_PE_TABLE_C_RevenueRecognition_Name="Reconocimiento de Ingreso";


@XendraTable(Name="Revenue Recognition",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Method for recording revenue",
Help="",TableName="C_RevenueRecognition",AccessLevel="3",
AD_Window_ID="733a8f19-500f-50a8-f39f-40d4949bd162",AD_Val_Rule_ID="",IsKey=1,LoadSeq=85,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.commercial",Identifier="006b6711-3073-f6c8-3508-6a8ab8e30c0f",
Synchronized="2020-03-03 21:37:36.0")
/** TableName=C_RevenueRecognition */
public static final String Table_Name="C_RevenueRecognition";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_RevenueRecognition");

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
    Table_ID = MTable.getTable_ID("C_RevenueRecognition");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_RevenueRecognition[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Revenue Recognition.
@param C_RevenueRecognition_ID Method for recording revenue */
public void setC_RevenueRecognition_ID (int C_RevenueRecognition_ID)
{
if (C_RevenueRecognition_ID < 1) throw new IllegalArgumentException ("C_RevenueRecognition_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_RevenueRecognition_ID, Integer.valueOf(C_RevenueRecognition_ID));
}
/** Get Revenue Recognition.
@return Method for recording revenue */
public int getC_RevenueRecognition_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_RevenueRecognition_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="cbb2da20-d353-80ae-4962-22293d7be911")
public static String es_PE_FIELD_RevenueRecognition_RevenueRecognition_Name="Reconocimiento de Ingreso";

@XendraTrl(Identifier="cbb2da20-d353-80ae-4962-22293d7be911")
public static String es_PE_FIELD_RevenueRecognition_RevenueRecognition_Description="Método para registro de ingresos";

@XendraTrl(Identifier="cbb2da20-d353-80ae-4962-22293d7be911")
public static String es_PE_FIELD_RevenueRecognition_RevenueRecognition_Help="El Reconocimiento de Ingresos indica como los ingresos serán reconocidos para este producto.";

@XendraField(AD_Column_ID="C_RevenueRecognition_ID",IsCentrallyMaintained=true,
AD_Tab_ID="e4d1030c-9309-fe65-e965-254d4799daca",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cbb2da20-d353-80ae-4962-22293d7be911")
public static final String FIELDNAME_RevenueRecognition_RevenueRecognition="cbb2da20-d353-80ae-4962-22293d7be911";
/** Column name C_RevenueRecognition_ID */
public static final String COLUMNNAME_C_RevenueRecognition_ID = "C_RevenueRecognition_ID";
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

@XendraTrl(Identifier="4d83d92a-bd02-c6b8-d409-517d28570b8f")
public static String es_PE_FIELD_RevenueRecognition_Description_Name="Observación";

@XendraTrl(Identifier="4d83d92a-bd02-c6b8-d409-517d28570b8f")
public static String es_PE_FIELD_RevenueRecognition_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="4d83d92a-bd02-c6b8-d409-517d28570b8f")
public static String es_PE_FIELD_RevenueRecognition_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="e4d1030c-9309-fe65-e965-254d4799daca",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4d83d92a-bd02-c6b8-d409-517d28570b8f")
public static final String FIELDNAME_RevenueRecognition_Description="4d83d92a-bd02-c6b8-d409-517d28570b8f";

@XendraTrl(Identifier="4e592b93-1f00-7245-7805-a71bfd25f043")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4e592b93-1f00-7245-7805-a71bfd25f043",
Synchronized="2019-08-30 22:22:13.0")
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
@XendraTrl(Identifier="1ca60dd9-4960-47c8-bc49-a6ea001ae9bd")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1ca60dd9-4960-47c8-bc49-a6ea001ae9bd",
Synchronized="2019-08-30 22:22:13.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Time based.
@param IsTimeBased Time based Revenue Recognition rather than Service Level based */
public void setIsTimeBased (boolean IsTimeBased)
{
set_Value (COLUMNNAME_IsTimeBased, Boolean.valueOf(IsTimeBased));
}
/** Get Time based.
@return Time based Revenue Recognition rather than Service Level based */
public boolean isTimeBased() 
{
Object oo = get_Value(COLUMNNAME_IsTimeBased);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="b3fe5652-b604-bf33-f983-da93c59c8d99")
public static String es_PE_FIELD_RevenueRecognition_TimeBased_Name="Basado en Tiempo";

@XendraTrl(Identifier="b3fe5652-b604-bf33-f983-da93c59c8d99")
public static String es_PE_FIELD_RevenueRecognition_TimeBased_Description="Reconocimiento de Ingresos basados en el tiempo o Nivel de Servicio";

@XendraTrl(Identifier="b3fe5652-b604-bf33-f983-da93c59c8d99")
public static String es_PE_FIELD_RevenueRecognition_TimeBased_Help="Reconocimiento de Ingresos puede estar basado en el nivel de servicio o en el tiempo";

@XendraField(AD_Column_ID="IsTimeBased",IsCentrallyMaintained=true,
AD_Tab_ID="e4d1030c-9309-fe65-e965-254d4799daca",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b3fe5652-b604-bf33-f983-da93c59c8d99")
public static final String FIELDNAME_RevenueRecognition_TimeBased="b3fe5652-b604-bf33-f983-da93c59c8d99";

@XendraTrl(Identifier="9fb302aa-4bda-56c3-8c3a-2d05ef1ae487")
public static String es_PE_COLUMN_IsTimeBased_Name="Basado en Tiempo";

@XendraColumn(AD_Element_ID="fe3de755-4add-cd4a-91ae-5c9c08dc8b67",ColumnName="IsTimeBased",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9fb302aa-4bda-56c3-8c3a-2d05ef1ae487",
Synchronized="2019-08-30 22:22:13.0")
/** Column name IsTimeBased */
public static final String COLUMNNAME_IsTimeBased = "IsTimeBased";
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

@XendraTrl(Identifier="49e5d361-cfb8-cb82-8b76-6b68dac0e50a")
public static String es_PE_FIELD_RevenueRecognition_Name_Name="Nombre";

@XendraTrl(Identifier="49e5d361-cfb8-cb82-8b76-6b68dac0e50a")
public static String es_PE_FIELD_RevenueRecognition_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="49e5d361-cfb8-cb82-8b76-6b68dac0e50a")
public static String es_PE_FIELD_RevenueRecognition_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="e4d1030c-9309-fe65-e965-254d4799daca",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="49e5d361-cfb8-cb82-8b76-6b68dac0e50a")
public static final String FIELDNAME_RevenueRecognition_Name="49e5d361-cfb8-cb82-8b76-6b68dac0e50a";

@XendraTrl(Identifier="726525b5-5ee8-dd46-a19f-8396e45431c8")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="726525b5-5ee8-dd46-a19f-8396e45431c8",
Synchronized="2019-08-30 22:22:13.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Number of Months.
@param NoMonths Number of Months */
public void setNoMonths (int NoMonths)
{
set_Value (COLUMNNAME_NoMonths, Integer.valueOf(NoMonths));
}
/** Get Number of Months.
@return Number of Months */
public int getNoMonths() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_NoMonths);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="c59d1679-d79c-2002-7d82-fe58ea9b54ec")
public static String es_PE_FIELD_RevenueRecognition_NumberOfMonths_Name="Número de Meses";

@XendraField(AD_Column_ID="NoMonths",IsCentrallyMaintained=true,
AD_Tab_ID="e4d1030c-9309-fe65-e965-254d4799daca",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsTimeBased@=Y",DisplayLength=11,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c59d1679-d79c-2002-7d82-fe58ea9b54ec")
public static final String FIELDNAME_RevenueRecognition_NumberOfMonths="c59d1679-d79c-2002-7d82-fe58ea9b54ec";

@XendraTrl(Identifier="233fa336-1d44-0855-227b-1288eb6e7635")
public static String es_PE_COLUMN_NoMonths_Name="Número de Meses";

@XendraColumn(AD_Element_ID="77030468-d495-ef5b-0071-06851af5cc9c",ColumnName="NoMonths",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="233fa336-1d44-0855-227b-1288eb6e7635",
Synchronized="2019-08-30 22:22:13.0")
/** Column name NoMonths */
public static final String COLUMNNAME_NoMonths = "NoMonths";
/** Set Recognition frequency.
@param RecognitionFrequency Recognition frequency */
public void setRecognitionFrequency (String RecognitionFrequency)
{
if (RecognitionFrequency.length() > 1)
{
log.warning("Length > 1 - truncated");
RecognitionFrequency = RecognitionFrequency.substring(0,0);
}
set_Value (COLUMNNAME_RecognitionFrequency, RecognitionFrequency);
}
/** Get Recognition frequency.
@return Recognition frequency */
public String getRecognitionFrequency() 
{
return (String)get_Value(COLUMNNAME_RecognitionFrequency);
}

@XendraTrl(Identifier="65a120be-e9e5-5dc9-2d76-9b99ab93e3a2")
public static String es_PE_FIELD_RevenueRecognition_RecognitionFrequency_Name="Reconocimiento de Frecuencia";

@XendraField(AD_Column_ID="RecognitionFrequency",IsCentrallyMaintained=true,
AD_Tab_ID="e4d1030c-9309-fe65-e965-254d4799daca",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@IsTimeBased@=Y",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="65a120be-e9e5-5dc9-2d76-9b99ab93e3a2")
public static final String FIELDNAME_RevenueRecognition_RecognitionFrequency="65a120be-e9e5-5dc9-2d76-9b99ab93e3a2";

@XendraTrl(Identifier="b9655dea-b57a-de0a-e63c-7042d2da38e4")
public static String es_PE_COLUMN_RecognitionFrequency_Name="Reconocimiento de Frecuencia";

@XendraColumn(AD_Element_ID="5f95c17d-3fff-16a6-fd72-e0d56ac90065",
ColumnName="RecognitionFrequency",AD_Reference_ID=17,
AD_Reference_Value_ID="19c5b9f0-1445-8b89-2573-2f4fc66c7a45",AD_Val_Rule_ID="",FieldLength=1,
DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,
ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",
ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="b9655dea-b57a-de0a-e63c-7042d2da38e4",
Synchronized="2019-08-30 22:22:13.0")
/** Column name RecognitionFrequency */
public static final String COLUMNNAME_RecognitionFrequency = "RecognitionFrequency";
}
