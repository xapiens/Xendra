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
/** Generated Model for C_DunningRun
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_DunningRun extends PO
{
/** Standard Constructor
@param ctx context
@param C_DunningRun_ID id
@param trxName transaction
*/
public X_C_DunningRun (Properties ctx, int C_DunningRun_ID, String trxName)
{
super (ctx, C_DunningRun_ID, trxName);
/** if (C_DunningRun_ID == 0)
{
setC_DunningLevel_ID (0);
setC_DunningRun_ID (0);
setDunningDate (new Timestamp(System.currentTimeMillis()));	
// @#Date@
setProcessed (false);	
// N
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_DunningRun (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=526 */
public static int Table_ID=MTable.getTable_ID("C_DunningRun");

@XendraTrl(Identifier="a298cea9-1fd9-37cc-e8c1-7b058229719c")
public static String es_PE_TAB_DunningRun_Name="Ejecutar Morosidad";
@XendraTab(Name="Dunning Run",
Description="Manage Dunning Run",Help="Manage Dunning Run",
AD_Window_ID="a455d38f-dfdf-f625-e59d-84fe05432eea",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="a298cea9-1fd9-37cc-e8c1-7b058229719c",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_DunningRun="a298cea9-1fd9-37cc-e8c1-7b058229719c";

@XendraTrl(Identifier="966f8c10-1c36-be57-4ec7-623087b121ef")
public static String es_PE_TABLE_C_DunningRun_Name="Secuencial de Morosidad";

@XendraTable(Name="Dunning Run",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Dunning Run",Help="",
TableName="C_DunningRun",AccessLevel="3",AD_Window_ID="a455d38f-dfdf-f625-e59d-84fe05432eea",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=135,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="966f8c10-1c36-be57-4ec7-623087b121ef",Synchronized="2020-03-03 21:36:53.0")
/** TableName=C_DunningRun */
public static final String Table_Name="C_DunningRun";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_DunningRun");

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
    Table_ID = MTable.getTable_ID("C_DunningRun");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_DunningRun[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Dunning Level.
@param C_DunningLevel_ID Dunning Level */
public void setC_DunningLevel_ID (int C_DunningLevel_ID)
{
if (C_DunningLevel_ID < 1) throw new IllegalArgumentException ("C_DunningLevel_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_DunningLevel_ID, Integer.valueOf(C_DunningLevel_ID));
}
/** Get Dunning Level.
@return Dunning Level */
public int getC_DunningLevel_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_DunningLevel_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="b5fc944d-0aef-529e-f804-42230d14077a")
public static String es_PE_FIELD_DunningRun_DunningLevel_Name="Nivel de Morosidad";

@XendraField(AD_Column_ID="C_DunningLevel_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a298cea9-1fd9-37cc-e8c1-7b058229719c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b5fc944d-0aef-529e-f804-42230d14077a")
public static final String FIELDNAME_DunningRun_DunningLevel="b5fc944d-0aef-529e-f804-42230d14077a";

@XendraTrl(Identifier="d9942bf3-d66d-95d8-6e1f-eb20bc9b1456")
public static String es_PE_COLUMN_C_DunningLevel_ID_Name="Nivel de Morosidad";

@XendraColumn(AD_Element_ID="d04176e3-d920-8087-23a5-79088dab6000",ColumnName="C_DunningLevel_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d9942bf3-d66d-95d8-6e1f-eb20bc9b1456",
Synchronized="2019-08-30 22:21:33.0")
/** Column name C_DunningLevel_ID */
public static final String COLUMNNAME_C_DunningLevel_ID = "C_DunningLevel_ID";
/** Set Dunning Run.
@param C_DunningRun_ID Dunning Run */
public void setC_DunningRun_ID (int C_DunningRun_ID)
{
if (C_DunningRun_ID < 1) throw new IllegalArgumentException ("C_DunningRun_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_DunningRun_ID, Integer.valueOf(C_DunningRun_ID));
}
/** Get Dunning Run.
@return Dunning Run */
public int getC_DunningRun_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_DunningRun_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="cd5ece53-bd81-6bc8-8952-78eea5ce39a7")
public static String es_PE_FIELD_DunningRun_DunningRun_Name="Secuencial de Morosidad";

@XendraTrl(Identifier="cd5ece53-bd81-6bc8-8952-78eea5ce39a7")
public static String es_PE_FIELD_DunningRun_DunningRun_Description="Secuencial de Informes de morosidad corridos";

@XendraField(AD_Column_ID="C_DunningRun_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a298cea9-1fd9-37cc-e8c1-7b058229719c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cd5ece53-bd81-6bc8-8952-78eea5ce39a7")
public static final String FIELDNAME_DunningRun_DunningRun="cd5ece53-bd81-6bc8-8952-78eea5ce39a7";
/** Column name C_DunningRun_ID */
public static final String COLUMNNAME_C_DunningRun_ID = "C_DunningRun_ID";
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

@XendraTrl(Identifier="3d2c0787-c059-4eba-5fa4-fbf5232770a1")
public static String es_PE_FIELD_DunningRun_Description_Name="Observación";

@XendraTrl(Identifier="3d2c0787-c059-4eba-5fa4-fbf5232770a1")
public static String es_PE_FIELD_DunningRun_Description_Description="Observación";

@XendraTrl(Identifier="3d2c0787-c059-4eba-5fa4-fbf5232770a1")
public static String es_PE_FIELD_DunningRun_Description_Help="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="a298cea9-1fd9-37cc-e8c1-7b058229719c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3d2c0787-c059-4eba-5fa4-fbf5232770a1")
public static final String FIELDNAME_DunningRun_Description="3d2c0787-c059-4eba-5fa4-fbf5232770a1";

@XendraTrl(Identifier="f0f7e0db-cacb-29fb-9c61-c347c1710041")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=true,ColumnSQL="",
IsAllowLogging=false,Identifier="f0f7e0db-cacb-29fb-9c61-c347c1710041",
Synchronized="2019-08-30 22:21:33.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Dunning Date.
@param DunningDate Date of Dunning */
public void setDunningDate (Timestamp DunningDate)
{
if (DunningDate == null) throw new IllegalArgumentException ("DunningDate is mandatory.");
set_Value (COLUMNNAME_DunningDate, DunningDate);
}
/** Get Dunning Date.
@return Date of Dunning */
public Timestamp getDunningDate() 
{
return (Timestamp)get_Value(COLUMNNAME_DunningDate);
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getDunningDate()));
}

@XendraTrl(Identifier="d771288c-9398-6bec-bf9d-1868b8a41449")
public static String es_PE_FIELD_DunningRun_DunningDate_Name="Fecha de Morosidad";

@XendraTrl(Identifier="d771288c-9398-6bec-bf9d-1868b8a41449")
public static String es_PE_FIELD_DunningRun_DunningDate_Description="Fecha de morosidad";

@XendraField(AD_Column_ID="DunningDate",IsCentrallyMaintained=true,
AD_Tab_ID="a298cea9-1fd9-37cc-e8c1-7b058229719c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d771288c-9398-6bec-bf9d-1868b8a41449")
public static final String FIELDNAME_DunningRun_DunningDate="d771288c-9398-6bec-bf9d-1868b8a41449";

@XendraTrl(Identifier="4f95fa4c-6f68-89c8-572b-032aae1a51ec")
public static String es_PE_COLUMN_DunningDate_Name="Fecha de Morosidad";

@XendraColumn(AD_Element_ID="4347cb24-107c-4f42-c933-9e198b56fdce",ColumnName="DunningDate",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="@#Date@",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4f95fa4c-6f68-89c8-572b-032aae1a51ec",
Synchronized="2019-08-30 22:21:33.0")
/** Column name DunningDate */
public static final String COLUMNNAME_DunningDate = "DunningDate";
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
@XendraTrl(Identifier="dd0d6b03-c322-4581-891e-690b48414b05")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="dd0d6b03-c322-4581-891e-690b48414b05",
Synchronized="2019-08-30 22:21:33.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Processed.
@param Processed The document has been processed */
public void setProcessed (boolean Processed)
{
set_Value (COLUMNNAME_Processed, Boolean.valueOf(Processed));
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

@XendraTrl(Identifier="65407360-0fd7-0da8-185e-4611f2ba59d7")
public static String es_PE_FIELD_DunningRun_Processed_Name="Procesado";

@XendraTrl(Identifier="65407360-0fd7-0da8-185e-4611f2ba59d7")
public static String es_PE_FIELD_DunningRun_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="65407360-0fd7-0da8-185e-4611f2ba59d7")
public static String es_PE_FIELD_DunningRun_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="a298cea9-1fd9-37cc-e8c1-7b058229719c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=80,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="65407360-0fd7-0da8-185e-4611f2ba59d7")
public static final String FIELDNAME_DunningRun_Processed="65407360-0fd7-0da8-185e-4611f2ba59d7";

@XendraTrl(Identifier="ad5b0d4a-2ea5-0d70-f038-fe017d95f913")
public static String es_PE_COLUMN_Processed_Name="Procesado";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ad5b0d4a-2ea5-0d70-f038-fe017d95f913",
Synchronized="2019-08-30 22:21:33.0")
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

@XendraTrl(Identifier="8b8cc985-7de8-4877-ec3e-90ef91153de1")
public static String es_PE_FIELD_DunningRun_ProcessNow_Name="Crear Cálculo de Morosidad";

@XendraTrl(Identifier="8b8cc985-7de8-4877-ec3e-90ef91153de1")
public static String es_PE_FIELD_DunningRun_ProcessNow_Description="Crea Cartas de Morosidad basado en criterios dados.";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="a298cea9-1fd9-37cc-e8c1-7b058229719c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8b8cc985-7de8-4877-ec3e-90ef91153de1")
public static final String FIELDNAME_DunningRun_ProcessNow="8b8cc985-7de8-4877-ec3e-90ef91153de1";

@XendraTrl(Identifier="66f2abae-37cb-24af-3ea4-de9a8bceb51e")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="cc35db48-170a-80b4-3d52-c9c89edc477f",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="66f2abae-37cb-24af-3ea4-de9a8bceb51e",Synchronized="2019-08-30 22:21:33.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
/** Set Send.
@param SendIt Send */
public void setSendIt (String SendIt)
{
if (SendIt != null && SendIt.length() > 1)
{
log.warning("Length > 1 - truncated");
SendIt = SendIt.substring(0,0);
}
set_Value (COLUMNNAME_SendIt, SendIt);
}
/** Get Send.
@return Send */
public String getSendIt() 
{
return (String)get_Value(COLUMNNAME_SendIt);
}

@XendraTrl(Identifier="c45f927d-06fe-10f2-707d-a1b6fb24e835")
public static String es_PE_FIELD_DunningRun_Send_Name="Envíe";
@XendraField(AD_Column_ID="SendIt",
IsCentrallyMaintained=true,AD_Tab_ID="a298cea9-1fd9-37cc-e8c1-7b058229719c",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="@Processed@=Y",DisplayLength=23,IsReadOnly=false,SeqNo=90,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="c45f927d-06fe-10f2-707d-a1b6fb24e835")
public static final String FIELDNAME_DunningRun_Send="c45f927d-06fe-10f2-707d-a1b6fb24e835";

@XendraTrl(Identifier="2d65bfea-3149-7ad2-387d-194e83934a3b")
public static String es_PE_COLUMN_SendIt_Name="Envíe";

@XendraColumn(AD_Element_ID="ee377dbe-6345-93ae-7b26-ad4d340ee1df",ColumnName="SendIt",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2d65bfea-3149-7ad2-387d-194e83934a3b",
Synchronized="2019-08-30 22:21:33.0")
/** Column name SendIt */
public static final String COLUMNNAME_SendIt = "SendIt";
}
