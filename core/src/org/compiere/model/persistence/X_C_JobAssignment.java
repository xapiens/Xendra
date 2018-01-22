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
/** Generated Model for C_JobAssignment
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_JobAssignment extends PO
{
/** Standard Constructor
@param ctx context
@param C_JobAssignment_ID id
@param trxName transaction
*/
public X_C_JobAssignment (Properties ctx, int C_JobAssignment_ID, String trxName)
{
super (ctx, C_JobAssignment_ID, trxName);
/** if (C_JobAssignment_ID == 0)
{
setAD_User_ID (0);
setC_JobAssignment_ID (0);
setC_Job_ID (0);
setValidFrom (new Timestamp(System.currentTimeMillis()));
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_JobAssignment (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=791 */
public static int Table_ID=MTable.getTable_ID("C_JobAssignment");

@XendraTrl(Identifier="a63a35bd-be48-dd81-bb1c-9ec49ea9594f")
public static String es_PE_TAB_Assignment_Description="Empleado Asignado";

@XendraTrl(Identifier="a63a35bd-be48-dd81-bb1c-9ec49ea9594f")
public static String es_PE_TAB_Assignment_Name="Asignación";
@XendraTab(Name="Assignment",
Description="Employee Assignment",Help="",AD_Window_ID="af07de27-ee33-4462-55ef-e93e806652ca",
SeqNo=20,TabLevel=1,IsSingleRow=false,IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="b6dd0fe7-43cf-c263-8036-a35930221762",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="a63a35bd-be48-dd81-bb1c-9ec49ea9594f",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Assignment="a63a35bd-be48-dd81-bb1c-9ec49ea9594f";

@XendraTrl(Identifier="65c8bc2f-066c-48fc-9145-0750ce24ddf5")
public static String es_PE_TABLE_C_JobAssignment_Name="Asignación de Posición";

@XendraTable(Name="Position Assignment",Description="",Help="",TableName="C_JobAssignment",
AccessLevel="2",AD_Window_ID="af07de27-ee33-4462-55ef-e93e806652ca",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="65c8bc2f-066c-48fc-9145-0750ce24ddf5",Synchronized="2017-08-16 11:41:58.0")
/** TableName=C_JobAssignment */
public static final String Table_Name="C_JobAssignment";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_JobAssignment");

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
    Table_ID = MTable.getTable_ID("C_JobAssignment");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_JobAssignment[").append(get_ID()).append("]");
return sb.toString();
}
/** Set User/Contact.
@param AD_User_ID User within the system - Internal or Business Partner Contact */
public void setAD_User_ID (int AD_User_ID)
{
if (AD_User_ID < 1) throw new IllegalArgumentException ("AD_User_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_User_ID, Integer.valueOf(AD_User_ID));
}
/** Get User/Contact.
@return User within the system - Internal or Business Partner Contact */
public int getAD_User_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_User_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="1e499ff9-1db6-3398-7178-2808f9c3d1a9")
public static String es_PE_FIELD_Assignment_UserContact_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="1e499ff9-1db6-3398-7178-2808f9c3d1a9")
public static String es_PE_FIELD_Assignment_UserContact_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraTrl(Identifier="1e499ff9-1db6-3398-7178-2808f9c3d1a9")
public static String es_PE_FIELD_Assignment_UserContact_Name="Usuario";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a63a35bd-be48-dd81-bb1c-9ec49ea9594f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1e499ff9-1db6-3398-7178-2808f9c3d1a9")
public static final String FIELDNAME_Assignment_UserContact="1e499ff9-1db6-3398-7178-2808f9c3d1a9";

@XendraTrl(Identifier="8d4be6a4-9edb-085a-95bc-144626a6a965")
public static String es_PE_COLUMN_AD_User_ID_Name="Usuario";

@XendraColumn(AD_Element_ID="abdf8dee-d3cd-73ec-c758-683e907797f4",ColumnName="AD_User_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="a1ea6cc6-fa00-1e16-1059-b4df151aaf4b",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=true,SeqNo=2,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="8d4be6a4-9edb-085a-95bc-144626a6a965",Synchronized="2017-08-05 16:53:51.0")
/** Column name AD_User_ID */
public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";
/** Set Position Assignment.
@param C_JobAssignment_ID Assignemt of Employee (User) to Job Position */
public void setC_JobAssignment_ID (int C_JobAssignment_ID)
{
if (C_JobAssignment_ID < 1) throw new IllegalArgumentException ("C_JobAssignment_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_JobAssignment_ID, Integer.valueOf(C_JobAssignment_ID));
}
/** Get Position Assignment.
@return Assignemt of Employee (User) to Job Position */
public int getC_JobAssignment_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_JobAssignment_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="696f81d0-0646-f999-b7f0-9eb3e4cddbd1")
public static String es_PE_FIELD_Assignment_PositionAssignment_Description="Asignación de posición de trabajo (Usuario) de un Empleado";

@XendraTrl(Identifier="696f81d0-0646-f999-b7f0-9eb3e4cddbd1")
public static String es_PE_FIELD_Assignment_PositionAssignment_Help="Asignación de la posición de trabajo de un empleado.";

@XendraTrl(Identifier="696f81d0-0646-f999-b7f0-9eb3e4cddbd1")
public static String es_PE_FIELD_Assignment_PositionAssignment_Name="Asignación de Posición";

@XendraField(AD_Column_ID="C_JobAssignment_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a63a35bd-be48-dd81-bb1c-9ec49ea9594f",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="696f81d0-0646-f999-b7f0-9eb3e4cddbd1")
public static final String FIELDNAME_Assignment_PositionAssignment="696f81d0-0646-f999-b7f0-9eb3e4cddbd1";
/** Column name C_JobAssignment_ID */
public static final String COLUMNNAME_C_JobAssignment_ID = "C_JobAssignment_ID";
/** Set Position.
@param C_Job_ID Job Position */
public void setC_Job_ID (int C_Job_ID)
{
if (C_Job_ID < 1) throw new IllegalArgumentException ("C_Job_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_Job_ID, Integer.valueOf(C_Job_ID));
}
/** Get Position.
@return Job Position */
public int getC_Job_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Job_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getC_Job_ID()));
}

@XendraTrl(Identifier="63abe608-2c4f-6bfa-a183-afc34b258de1")
public static String es_PE_FIELD_Assignment_Position_Description="Posición del trabajo";

@XendraTrl(Identifier="63abe608-2c4f-6bfa-a183-afc34b258de1")
public static String es_PE_FIELD_Assignment_Position_Name="Posición";

@XendraField(AD_Column_ID="C_Job_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a63a35bd-be48-dd81-bb1c-9ec49ea9594f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="63abe608-2c4f-6bfa-a183-afc34b258de1")
public static final String FIELDNAME_Assignment_Position="63abe608-2c4f-6bfa-a183-afc34b258de1";

@XendraTrl(Identifier="b6dd0fe7-43cf-c263-8036-a35930221762")
public static String es_PE_COLUMN_C_Job_ID_Name="Posición";

@XendraColumn(AD_Element_ID="90c49ce9-ecea-a060-14e0-eca90ed486ad",ColumnName="C_Job_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b6dd0fe7-43cf-c263-8036-a35930221762",
Synchronized="2017-08-05 16:53:51.0")
/** Column name C_Job_ID */
public static final String COLUMNNAME_C_Job_ID = "C_Job_ID";
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

@XendraTrl(Identifier="50104031-bcbc-4079-524b-40edc127073a")
public static String es_PE_FIELD_Assignment_Description_Description="Observación";

@XendraTrl(Identifier="50104031-bcbc-4079-524b-40edc127073a")
public static String es_PE_FIELD_Assignment_Description_Help="Observación";

@XendraTrl(Identifier="50104031-bcbc-4079-524b-40edc127073a")
public static String es_PE_FIELD_Assignment_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="a63a35bd-be48-dd81-bb1c-9ec49ea9594f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="50104031-bcbc-4079-524b-40edc127073a")
public static final String FIELDNAME_Assignment_Description="50104031-bcbc-4079-524b-40edc127073a";

@XendraTrl(Identifier="2d5aebcf-a565-c8b4-aed8-e24cd2482c0c")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2d5aebcf-a565-c8b4-aed8-e24cd2482c0c",
Synchronized="2017-08-05 16:53:51.0")
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
@XendraTrl(Identifier="75ce0094-9898-4b60-a2df-59e92768ac53")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="75ce0094-9898-4b60-a2df-59e92768ac53",
Synchronized="2017-08-05 16:53:51.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Valid from.
@param ValidFrom Valid from including this date (first day) */
public void setValidFrom (Timestamp ValidFrom)
{
if (ValidFrom == null) throw new IllegalArgumentException ("ValidFrom is mandatory.");
set_Value (COLUMNNAME_ValidFrom, ValidFrom);
}
/** Get Valid from.
@return Valid from including this date (first day) */
public Timestamp getValidFrom() 
{
return (Timestamp)get_Value(COLUMNNAME_ValidFrom);
}

@XendraTrl(Identifier="265f6b79-9d78-bebc-505a-ccac5adbb930")
public static String es_PE_FIELD_Assignment_ValidFrom_Description="Válido desde; incluyendo esta fecha (primer día)";

@XendraTrl(Identifier="265f6b79-9d78-bebc-505a-ccac5adbb930")
public static String es_PE_FIELD_Assignment_ValidFrom_Help="La fecha válida desde indica el primer día de un rango de fechas";

@XendraTrl(Identifier="265f6b79-9d78-bebc-505a-ccac5adbb930")
public static String es_PE_FIELD_Assignment_ValidFrom_Name="Válido Desde";

@XendraField(AD_Column_ID="ValidFrom",IsCentrallyMaintained=true,
AD_Tab_ID="a63a35bd-be48-dd81-bb1c-9ec49ea9594f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=60,SortNo=-2,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="265f6b79-9d78-bebc-505a-ccac5adbb930")
public static final String FIELDNAME_Assignment_ValidFrom="265f6b79-9d78-bebc-505a-ccac5adbb930";

@XendraTrl(Identifier="4f1678e0-54cc-09b3-0855-3339db16c91e")
public static String es_PE_COLUMN_ValidFrom_Name="Válido Desde";

@XendraColumn(AD_Element_ID="86b1171a-a6c6-0da5-1aea-3f3106450d07",ColumnName="ValidFrom",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4f1678e0-54cc-09b3-0855-3339db16c91e",
Synchronized="2017-08-05 16:53:51.0")
/** Column name ValidFrom */
public static final String COLUMNNAME_ValidFrom = "ValidFrom";
/** Set Valid to.
@param ValidTo Valid to including this date (last day) */
public void setValidTo (Timestamp ValidTo)
{
set_Value (COLUMNNAME_ValidTo, ValidTo);
}
/** Get Valid to.
@return Valid to including this date (last day) */
public Timestamp getValidTo() 
{
return (Timestamp)get_Value(COLUMNNAME_ValidTo);
}

@XendraTrl(Identifier="fe2c86b4-a352-8900-283c-56e414a950bc")
public static String es_PE_FIELD_Assignment_ValidTo_Description="Válido hasta; incluyendo esta fecha (ultimo día)";

@XendraTrl(Identifier="fe2c86b4-a352-8900-283c-56e414a950bc")
public static String es_PE_FIELD_Assignment_ValidTo_Help="La fecha válida hasta indica el último día de un rango de fechas";

@XendraTrl(Identifier="fe2c86b4-a352-8900-283c-56e414a950bc")
public static String es_PE_FIELD_Assignment_ValidTo_Name="Válido Hasta";

@XendraField(AD_Column_ID="ValidTo",IsCentrallyMaintained=true,
AD_Tab_ID="a63a35bd-be48-dd81-bb1c-9ec49ea9594f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fe2c86b4-a352-8900-283c-56e414a950bc")
public static final String FIELDNAME_Assignment_ValidTo="fe2c86b4-a352-8900-283c-56e414a950bc";

@XendraTrl(Identifier="4cac0ad5-00a3-7821-ca53-65fde99046f1")
public static String es_PE_COLUMN_ValidTo_Name="Válido Hasta";

@XendraColumn(AD_Element_ID="0fbe43c3-c76d-0505-0043-63adb568a68f",ColumnName="ValidTo",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4cac0ad5-00a3-7821-ca53-65fde99046f1",
Synchronized="2017-08-05 16:53:51.0")
/** Column name ValidTo */
public static final String COLUMNNAME_ValidTo = "ValidTo";
}
