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
/** Generated Model for C_UserRemuneration
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_UserRemuneration extends PO
{
/** Standard Constructor
@param ctx context
@param C_UserRemuneration_ID id
@param trxName transaction
*/
public X_C_UserRemuneration (Properties ctx, int C_UserRemuneration_ID, String trxName)
{
super (ctx, C_UserRemuneration_ID, trxName);
/** if (C_UserRemuneration_ID == 0)
{
setAD_User_ID (0);
setC_Remuneration_ID (0);
setC_UserRemuneration_ID (0);
setGrossRAmt (Env.ZERO);	
// 0
setGrossRCost (Env.ZERO);
setOvertimeAmt (Env.ZERO);	
// 0
setOvertimeCost (Env.ZERO);
setValidFrom (new Timestamp(System.currentTimeMillis()));
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_UserRemuneration (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=794 */
public static int Table_ID=MTable.getTable_ID("C_UserRemuneration");

@XendraTrl(Identifier="bb2d7cca-549a-325b-ffed-a7d59bb018f6")
public static String es_PE_TAB_EmployeeRemuneration_Description="Sobreescriba la remuneración de la posición del empleado";

@XendraTrl(Identifier="bb2d7cca-549a-325b-ffed-a7d59bb018f6")
public static String es_PE_TAB_EmployeeRemuneration_Name="Remuneracion al Empleado";

@XendraTab(Name="Employee Remuneration",Description="Overwrite of Employee Position Remuneration",
Help="",AD_Window_ID="5430bec6-fb8a-fb45-67e1-794d63718e0c",SeqNo=30,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="29f64b64-ae22-7664-b4d7-3ddeb2c65d0d",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="bb2d7cca-549a-325b-ffed-a7d59bb018f6",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_EmployeeRemuneration="bb2d7cca-549a-325b-ffed-a7d59bb018f6";

@XendraTrl(Identifier="01bed140-9724-6a6b-607a-8b51cf79bbdf")
public static String es_PE_TABLE_C_UserRemuneration_Name="Remuneración a Empleado";

@XendraTable(Name="Employee Remuneration",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",
Description="Employee Wage or Salary Overwrite",Help="",TableName="C_UserRemuneration",
AccessLevel="2",AD_Window_ID="5430bec6-fb8a-fb45-67e1-794d63718e0c",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="01bed140-9724-6a6b-607a-8b51cf79bbdf",Synchronized="2020-03-03 21:37:45.0")
/** TableName=C_UserRemuneration */
public static final String Table_Name="C_UserRemuneration";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_UserRemuneration");

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
    Table_ID = MTable.getTable_ID("C_UserRemuneration");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_UserRemuneration[").append(get_ID()).append("]");
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
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getAD_User_ID()));
}

@XendraTrl(Identifier="f27f6563-e3ff-0c4c-3d42-a3f1c73b93ac")
public static String es_PE_FIELD_EmployeeRemuneration_UserContact_Name="Usuario";

@XendraTrl(Identifier="f27f6563-e3ff-0c4c-3d42-a3f1c73b93ac")
public static String es_PE_FIELD_EmployeeRemuneration_UserContact_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="f27f6563-e3ff-0c4c-3d42-a3f1c73b93ac")
public static String es_PE_FIELD_EmployeeRemuneration_UserContact_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="bb2d7cca-549a-325b-ffed-a7d59bb018f6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f27f6563-e3ff-0c4c-3d42-a3f1c73b93ac")
public static final String FIELDNAME_EmployeeRemuneration_UserContact="f27f6563-e3ff-0c4c-3d42-a3f1c73b93ac";

@XendraTrl(Identifier="764d72e2-873c-7c9c-47f9-36a4c6e1b71a")
public static String es_PE_COLUMN_AD_User_ID_Name="Usuario";

@XendraColumn(AD_Element_ID="abdf8dee-d3cd-73ec-c758-683e907797f4",ColumnName="AD_User_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="a1ea6cc6-fa00-1e16-1059-b4df151aaf4b",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="764d72e2-873c-7c9c-47f9-36a4c6e1b71a",Synchronized="2019-08-30 22:22:21.0")
/** Column name AD_User_ID */
public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";
/** Set Remuneration.
@param C_Remuneration_ID Wage or Salary */
public void setC_Remuneration_ID (int C_Remuneration_ID)
{
if (C_Remuneration_ID < 1) throw new IllegalArgumentException ("C_Remuneration_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_Remuneration_ID, Integer.valueOf(C_Remuneration_ID));
}
/** Get Remuneration.
@return Wage or Salary */
public int getC_Remuneration_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Remuneration_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="b79b8a71-8af8-6435-6a35-9c276748e943")
public static String es_PE_FIELD_EmployeeRemuneration_Remuneration_Name="Remuneración";

@XendraTrl(Identifier="b79b8a71-8af8-6435-6a35-9c276748e943")
public static String es_PE_FIELD_EmployeeRemuneration_Remuneration_Description="Salario ó sueldo.";

@XendraField(AD_Column_ID="C_Remuneration_ID",IsCentrallyMaintained=true,
AD_Tab_ID="bb2d7cca-549a-325b-ffed-a7d59bb018f6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b79b8a71-8af8-6435-6a35-9c276748e943")
public static final String FIELDNAME_EmployeeRemuneration_Remuneration="b79b8a71-8af8-6435-6a35-9c276748e943";

@XendraTrl(Identifier="29f64b64-ae22-7664-b4d7-3ddeb2c65d0d")
public static String es_PE_COLUMN_C_Remuneration_ID_Name="Remuneración";

@XendraColumn(AD_Element_ID="6b51a170-2063-47d0-af92-c5ed3408a51e",ColumnName="C_Remuneration_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=2,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="29f64b64-ae22-7664-b4d7-3ddeb2c65d0d",
Synchronized="2019-08-30 22:22:21.0")
/** Column name C_Remuneration_ID */
public static final String COLUMNNAME_C_Remuneration_ID = "C_Remuneration_ID";
/** Set Employee Remuneration.
@param C_UserRemuneration_ID Employee Wage or Salary Overwrite */
public void setC_UserRemuneration_ID (int C_UserRemuneration_ID)
{
if (C_UserRemuneration_ID < 1) throw new IllegalArgumentException ("C_UserRemuneration_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_UserRemuneration_ID, Integer.valueOf(C_UserRemuneration_ID));
}
/** Get Employee Remuneration.
@return Employee Wage or Salary Overwrite */
public int getC_UserRemuneration_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_UserRemuneration_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ac8c59a4-1bdd-6bf2-315d-76fc9c7e8dea")
public static String es_PE_FIELD_EmployeeRemuneration_EmployeeRemuneration_Name="Remuneración a Empleado";

@XendraTrl(Identifier="ac8c59a4-1bdd-6bf2-315d-76fc9c7e8dea")
public static String es_PE_FIELD_EmployeeRemuneration_EmployeeRemuneration_Description="Sobreescribe el salario ó sueldo del empleado.";

@XendraTrl(Identifier="ac8c59a4-1bdd-6bf2-315d-76fc9c7e8dea")
public static String es_PE_FIELD_EmployeeRemuneration_EmployeeRemuneration_Help="Sobreescribe la renumeración estandard.";

@XendraField(AD_Column_ID="C_UserRemuneration_ID",IsCentrallyMaintained=true,
AD_Tab_ID="bb2d7cca-549a-325b-ffed-a7d59bb018f6",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ac8c59a4-1bdd-6bf2-315d-76fc9c7e8dea")
public static final String FIELDNAME_EmployeeRemuneration_EmployeeRemuneration="ac8c59a4-1bdd-6bf2-315d-76fc9c7e8dea";
/** Column name C_UserRemuneration_ID */
public static final String COLUMNNAME_C_UserRemuneration_ID = "C_UserRemuneration_ID";
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

@XendraTrl(Identifier="05d5ce83-e6d7-ced0-8c98-7a878566feba")
public static String es_PE_FIELD_EmployeeRemuneration_Description_Name="Observación";

@XendraTrl(Identifier="05d5ce83-e6d7-ced0-8c98-7a878566feba")
public static String es_PE_FIELD_EmployeeRemuneration_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="05d5ce83-e6d7-ced0-8c98-7a878566feba")
public static String es_PE_FIELD_EmployeeRemuneration_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="bb2d7cca-549a-325b-ffed-a7d59bb018f6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="05d5ce83-e6d7-ced0-8c98-7a878566feba")
public static final String FIELDNAME_EmployeeRemuneration_Description="05d5ce83-e6d7-ced0-8c98-7a878566feba";

@XendraTrl(Identifier="7bcb92c7-2552-d41e-853f-d4fff10700b1")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7bcb92c7-2552-d41e-853f-d4fff10700b1",
Synchronized="2019-08-30 22:22:21.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Gross Amount.
@param GrossRAmt Gross Remuneration Amount */
public void setGrossRAmt (BigDecimal GrossRAmt)
{
if (GrossRAmt == null) throw new IllegalArgumentException ("GrossRAmt is mandatory.");
set_Value (COLUMNNAME_GrossRAmt, GrossRAmt);
}
/** Get Gross Amount.
@return Gross Remuneration Amount */
public BigDecimal getGrossRAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_GrossRAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="18b33f2a-8336-d8e6-744e-a52bf260b0b5")
public static String es_PE_FIELD_EmployeeRemuneration_GrossAmount_Name="Importe Total";

@XendraTrl(Identifier="18b33f2a-8336-d8e6-744e-a52bf260b0b5")
public static String es_PE_FIELD_EmployeeRemuneration_GrossAmount_Description="Cantidad total de la renumeración.";

@XendraTrl(Identifier="18b33f2a-8336-d8e6-744e-a52bf260b0b5")
public static String es_PE_FIELD_EmployeeRemuneration_GrossAmount_Help="Cantidad total del sueldo ó del salario (sin gastos indirectos del tiempo suplementario, de las ventajas y del patrón)";

@XendraField(AD_Column_ID="GrossRAmt",IsCentrallyMaintained=true,
AD_Tab_ID="bb2d7cca-549a-325b-ffed-a7d59bb018f6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="18b33f2a-8336-d8e6-744e-a52bf260b0b5")
public static final String FIELDNAME_EmployeeRemuneration_GrossAmount="18b33f2a-8336-d8e6-744e-a52bf260b0b5";

@XendraTrl(Identifier="a6f0ef56-91f9-dda7-8d91-57bc0cc7c488")
public static String es_PE_COLUMN_GrossRAmt_Name="Importe Total";

@XendraColumn(AD_Element_ID="fe31dc7a-9e3a-81a8-1d81-2d21ae3ade8f",ColumnName="GrossRAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a6f0ef56-91f9-dda7-8d91-57bc0cc7c488",
Synchronized="2019-08-30 22:22:21.0")
/** Column name GrossRAmt */
public static final String COLUMNNAME_GrossRAmt = "GrossRAmt";
/** Set Gross Cost.
@param GrossRCost Gross Remuneration Costs */
public void setGrossRCost (BigDecimal GrossRCost)
{
if (GrossRCost == null) throw new IllegalArgumentException ("GrossRCost is mandatory.");
set_Value (COLUMNNAME_GrossRCost, GrossRCost);
}
/** Get Gross Cost.
@return Gross Remuneration Costs */
public BigDecimal getGrossRCost() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_GrossRCost);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="a2bd948d-baba-71dd-083a-802afe9564ca")
public static String es_PE_FIELD_EmployeeRemuneration_GrossCost_Name="Importe de Costo";

@XendraTrl(Identifier="a2bd948d-baba-71dd-083a-802afe9564ca")
public static String es_PE_FIELD_EmployeeRemuneration_GrossCost_Description="Importe de Costo";

@XendraTrl(Identifier="a2bd948d-baba-71dd-083a-802afe9564ca")
public static String es_PE_FIELD_EmployeeRemuneration_GrossCost_Help="Costos elevados del sueldo ó salario (sin tiempo suplementario, con gastos indirectos de las ventajas y el patrón)";

@XendraField(AD_Column_ID="GrossRCost",IsCentrallyMaintained=true,
AD_Tab_ID="bb2d7cca-549a-325b-ffed-a7d59bb018f6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a2bd948d-baba-71dd-083a-802afe9564ca")
public static final String FIELDNAME_EmployeeRemuneration_GrossCost="a2bd948d-baba-71dd-083a-802afe9564ca";

@XendraTrl(Identifier="9acdae0b-6d72-5a91-c55c-fe9158f08f3b")
public static String es_PE_COLUMN_GrossRCost_Name="Importe de Costo";

@XendraColumn(AD_Element_ID="9cd8821f-f34d-da27-a043-7474b5642c00",ColumnName="GrossRCost",
AD_Reference_ID=37,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9acdae0b-6d72-5a91-c55c-fe9158f08f3b",
Synchronized="2019-08-30 22:22:21.0")
/** Column name GrossRCost */
public static final String COLUMNNAME_GrossRCost = "GrossRCost";
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
@XendraTrl(Identifier="cb3c9007-f103-4e0e-9e64-4f384ad1c5b4")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cb3c9007-f103-4e0e-9e64-4f384ad1c5b4",
Synchronized="2019-08-30 22:22:21.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Overtime Amount.
@param OvertimeAmt Hourly Overtime Rate */
public void setOvertimeAmt (BigDecimal OvertimeAmt)
{
if (OvertimeAmt == null) throw new IllegalArgumentException ("OvertimeAmt is mandatory.");
set_Value (COLUMNNAME_OvertimeAmt, OvertimeAmt);
}
/** Get Overtime Amount.
@return Hourly Overtime Rate */
public BigDecimal getOvertimeAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_OvertimeAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="e188ca4e-a3f0-ecdd-282e-9927f912d8ea")
public static String es_PE_FIELD_EmployeeRemuneration_OvertimeAmount_Name="Importe de Sobre tiempo";

@XendraTrl(Identifier="e188ca4e-a3f0-ecdd-282e-9927f912d8ea")
public static String es_PE_FIELD_EmployeeRemuneration_OvertimeAmount_Description="Tarifa del suplemento cada hora";

@XendraTrl(Identifier="e188ca4e-a3f0-ecdd-282e-9927f912d8ea")
public static String es_PE_FIELD_EmployeeRemuneration_OvertimeAmount_Help="Cantidad de cada hora sin gastos indirectos de las ventajas y del patrón.";

@XendraField(AD_Column_ID="OvertimeAmt",IsCentrallyMaintained=true,
AD_Tab_ID="bb2d7cca-549a-325b-ffed-a7d59bb018f6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e188ca4e-a3f0-ecdd-282e-9927f912d8ea")
public static final String FIELDNAME_EmployeeRemuneration_OvertimeAmount="e188ca4e-a3f0-ecdd-282e-9927f912d8ea";

@XendraTrl(Identifier="eefe6e88-666b-c468-8024-749dc1cebb7b")
public static String es_PE_COLUMN_OvertimeAmt_Name="Importe de Sobre tiempo";

@XendraColumn(AD_Element_ID="f0c23cfb-fe91-67d5-b2ba-94fd580b1f88",ColumnName="OvertimeAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="eefe6e88-666b-c468-8024-749dc1cebb7b",
Synchronized="2019-08-30 22:22:22.0")
/** Column name OvertimeAmt */
public static final String COLUMNNAME_OvertimeAmt = "OvertimeAmt";
/** Set Overtime Cost.
@param OvertimeCost Hourly Overtime Cost */
public void setOvertimeCost (BigDecimal OvertimeCost)
{
if (OvertimeCost == null) throw new IllegalArgumentException ("OvertimeCost is mandatory.");
set_Value (COLUMNNAME_OvertimeCost, OvertimeCost);
}
/** Get Overtime Cost.
@return Hourly Overtime Cost */
public BigDecimal getOvertimeCost() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_OvertimeCost);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="7c6e6a11-144c-1a83-768d-b653e3a90987")
public static String es_PE_FIELD_EmployeeRemuneration_OvertimeCost_Name="Costo de Sobretiempo";

@XendraTrl(Identifier="7c6e6a11-144c-1a83-768d-b653e3a90987")
public static String es_PE_FIELD_EmployeeRemuneration_OvertimeCost_Description="Costo de cada hora del tiempo suplementario";

@XendraTrl(Identifier="7c6e6a11-144c-1a83-768d-b653e3a90987")
public static String es_PE_FIELD_EmployeeRemuneration_OvertimeCost_Help="Cantidad de cada hora con gastos indirectos de las ventajas y del patrón";

@XendraField(AD_Column_ID="OvertimeCost",IsCentrallyMaintained=true,
AD_Tab_ID="bb2d7cca-549a-325b-ffed-a7d59bb018f6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7c6e6a11-144c-1a83-768d-b653e3a90987")
public static final String FIELDNAME_EmployeeRemuneration_OvertimeCost="7c6e6a11-144c-1a83-768d-b653e3a90987";

@XendraTrl(Identifier="22305ff0-5150-89f8-e06e-5e4f62dc5893")
public static String es_PE_COLUMN_OvertimeCost_Name="Costo de Sobretiempo";

@XendraColumn(AD_Element_ID="4262e677-f797-c790-373f-b3b0d43afab8",ColumnName="OvertimeCost",
AD_Reference_ID=37,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="22305ff0-5150-89f8-e06e-5e4f62dc5893",
Synchronized="2019-08-30 22:22:22.0")
/** Column name OvertimeCost */
public static final String COLUMNNAME_OvertimeCost = "OvertimeCost";
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

@XendraTrl(Identifier="08b5528b-9d1d-2f7c-1a6c-db79b2094521")
public static String es_PE_FIELD_EmployeeRemuneration_ValidFrom_Name="Válido Desde";

@XendraTrl(Identifier="08b5528b-9d1d-2f7c-1a6c-db79b2094521")
public static String es_PE_FIELD_EmployeeRemuneration_ValidFrom_Description="Válido desde; incluyendo esta fecha (primer día)";

@XendraTrl(Identifier="08b5528b-9d1d-2f7c-1a6c-db79b2094521")
public static String es_PE_FIELD_EmployeeRemuneration_ValidFrom_Help="La fecha válida desde indica el primer día de un rango de fechas";

@XendraField(AD_Column_ID="ValidFrom",IsCentrallyMaintained=true,
AD_Tab_ID="bb2d7cca-549a-325b-ffed-a7d59bb018f6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=100,SortNo=-1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="08b5528b-9d1d-2f7c-1a6c-db79b2094521")
public static final String FIELDNAME_EmployeeRemuneration_ValidFrom="08b5528b-9d1d-2f7c-1a6c-db79b2094521";

@XendraTrl(Identifier="6cce2e6f-2ca7-2c07-ef2f-31e1002d78e6")
public static String es_PE_COLUMN_ValidFrom_Name="Válido Desde";

@XendraColumn(AD_Element_ID="86b1171a-a6c6-0da5-1aea-3f3106450d07",ColumnName="ValidFrom",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6cce2e6f-2ca7-2c07-ef2f-31e1002d78e6",
Synchronized="2019-08-30 22:22:22.0")
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

@XendraTrl(Identifier="7334d696-208d-9fd8-37db-cb3be179b79c")
public static String es_PE_FIELD_EmployeeRemuneration_ValidTo_Name="Válido Hasta";

@XendraTrl(Identifier="7334d696-208d-9fd8-37db-cb3be179b79c")
public static String es_PE_FIELD_EmployeeRemuneration_ValidTo_Description="Válido hasta; incluyendo esta fecha (ultimo día)";

@XendraTrl(Identifier="7334d696-208d-9fd8-37db-cb3be179b79c")
public static String es_PE_FIELD_EmployeeRemuneration_ValidTo_Help="La fecha válida hasta indica el último día de un rango de fechas";

@XendraField(AD_Column_ID="ValidTo",IsCentrallyMaintained=true,
AD_Tab_ID="bb2d7cca-549a-325b-ffed-a7d59bb018f6",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7334d696-208d-9fd8-37db-cb3be179b79c")
public static final String FIELDNAME_EmployeeRemuneration_ValidTo="7334d696-208d-9fd8-37db-cb3be179b79c";

@XendraTrl(Identifier="8513783f-1902-a72a-1e36-f94147ae3070")
public static String es_PE_COLUMN_ValidTo_Name="Válido Hasta";

@XendraColumn(AD_Element_ID="0fbe43c3-c76d-0505-0043-63adb568a68f",ColumnName="ValidTo",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8513783f-1902-a72a-1e36-f94147ae3070",
Synchronized="2019-08-30 22:22:22.0")
/** Column name ValidTo */
public static final String COLUMNNAME_ValidTo = "ValidTo";
}
