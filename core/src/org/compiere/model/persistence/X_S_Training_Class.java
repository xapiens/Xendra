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
/** Generated Model for S_Training_Class
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_S_Training_Class extends PO
{
/** Standard Constructor
@param ctx context
@param S_Training_Class_ID id
@param trxName transaction
*/
public X_S_Training_Class (Properties ctx, int S_Training_Class_ID, String trxName)
{
super (ctx, S_Training_Class_ID, trxName);
/** if (S_Training_Class_ID == 0)
{
setEndDate (new Timestamp(System.currentTimeMillis()));
setM_Product_ID (0);
setStartDate (new Timestamp(System.currentTimeMillis()));
setS_Training_Class_ID (0);
setS_Training_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_S_Training_Class (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=537 */
public static int Table_ID=MTable.getTable_ID("S_Training_Class");

@XendraTrl(Identifier="70cb612b-a413-3da1-5dbf-d352d1a85eaa")
public static String es_PE_TAB_Class_Description="El Actual ";

@XendraTrl(Identifier="70cb612b-a413-3da1-5dbf-d352d1a85eaa")
public static String es_PE_TAB_Class_Help="Un Programador de Clase";

@XendraTrl(Identifier="70cb612b-a413-3da1-5dbf-d352d1a85eaa")
public static String es_PE_TAB_Class_Name="Clase";
@XendraTab(Name="Class",
Description="The actual training class instance",Help="A scheduled class",
AD_Window_ID="14c204f8-5dfb-ff0b-b3f7-8445e3bd66d5",SeqNo=20,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="70cb612b-a413-3da1-5dbf-d352d1a85eaa",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Class="70cb612b-a413-3da1-5dbf-d352d1a85eaa";

@XendraTrl(Identifier="167df0af-8d98-3468-1a85-7b3980084a8f")
public static String es_PE_TABLE_S_Training_Class_Name="Clase de entrenamiento";

@XendraTable(Name="Training Class",AD_Package_ID="4bb6f0e4-f72d-dcbb-9183-88af0357143f",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",
Description="The actual training class instance",Help="",TableName="S_Training_Class",
AccessLevel="3",AD_Window_ID="14c204f8-5dfb-ff0b-b3f7-8445e3bd66d5",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.services",
Identifier="167df0af-8d98-3468-1a85-7b3980084a8f",Synchronized="2020-03-03 21:40:15.0")
/** TableName=S_Training_Class */
public static final String Table_Name="S_Training_Class";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"S_Training_Class");

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
    Table_ID = MTable.getTable_ID("S_Training_Class");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_S_Training_Class[").append(get_ID()).append("]");
return sb.toString();
}
/** Set End Date.
@param EndDate Last effective date (inclusive) */
public void setEndDate (Timestamp EndDate)
{
if (EndDate == null) throw new IllegalArgumentException ("EndDate is mandatory.");
set_Value (COLUMNNAME_EndDate, EndDate);
}
/** Get End Date.
@return Last effective date (inclusive) */
public Timestamp getEndDate() 
{
return (Timestamp)get_Value(COLUMNNAME_EndDate);
}

@XendraTrl(Identifier="0d4b096a-de27-a2a4-4772-838ce30d5161")
public static String es_PE_FIELD_Class_EndDate_Name="Fecha Final";

@XendraTrl(Identifier="0d4b096a-de27-a2a4-4772-838ce30d5161")
public static String es_PE_FIELD_Class_EndDate_Description="Última fecha efectiva (inclusive)";

@XendraTrl(Identifier="0d4b096a-de27-a2a4-4772-838ce30d5161")
public static String es_PE_FIELD_Class_EndDate_Help="La fecha final indica la última fecha en este rango.";

@XendraField(AD_Column_ID="EndDate",IsCentrallyMaintained=true,
AD_Tab_ID="70cb612b-a413-3da1-5dbf-d352d1a85eaa",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0d4b096a-de27-a2a4-4772-838ce30d5161")
public static final String FIELDNAME_Class_EndDate="0d4b096a-de27-a2a4-4772-838ce30d5161";

@XendraTrl(Identifier="54ffa8b2-42db-c075-72ae-e809624b8c8b")
public static String es_PE_COLUMN_EndDate_Name="Fecha Final";

@XendraColumn(AD_Element_ID="16fae692-c943-4a1f-732e-bfce5aecb4b3",ColumnName="EndDate",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="54ffa8b2-42db-c075-72ae-e809624b8c8b",
Synchronized="2019-08-30 22:24:19.0")
/** Column name EndDate */
public static final String COLUMNNAME_EndDate = "EndDate";
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
@XendraTrl(Identifier="39dc0d12-e1e3-4914-a85b-6a080001e59d")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="39dc0d12-e1e3-4914-a85b-6a080001e59d",
Synchronized="2019-08-30 22:24:19.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Product.
@param M_Product_ID Product, Service, Item */
public void setM_Product_ID (int M_Product_ID)
{
if (M_Product_ID < 1) throw new IllegalArgumentException ("M_Product_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_Product_ID, Integer.valueOf(M_Product_ID));
}
/** Get Product.
@return Product, Service, Item */
public int getM_Product_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Product_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ce3c4329-91ea-52c3-27f8-74bfce8a94c8")
public static String es_PE_FIELD_Class_Product_Name="Producto";

@XendraTrl(Identifier="ce3c4329-91ea-52c3-27f8-74bfce8a94c8")
public static String es_PE_FIELD_Class_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="ce3c4329-91ea-52c3-27f8-74bfce8a94c8")
public static String es_PE_FIELD_Class_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="70cb612b-a413-3da1-5dbf-d352d1a85eaa",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ce3c4329-91ea-52c3-27f8-74bfce8a94c8")
public static final String FIELDNAME_Class_Product="ce3c4329-91ea-52c3-27f8-74bfce8a94c8";

@XendraTrl(Identifier="fb4a9e98-4b58-dd3f-a477-0a1d93da1e5d")
public static String es_PE_COLUMN_M_Product_ID_Name="Producto";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fb4a9e98-4b58-dd3f-a477-0a1d93da1e5d",
Synchronized="2019-08-30 22:24:19.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
/** Set Start Date.
@param StartDate First effective day (inclusive) */
public void setStartDate (Timestamp StartDate)
{
if (StartDate == null) throw new IllegalArgumentException ("StartDate is mandatory.");
set_Value (COLUMNNAME_StartDate, StartDate);
}
/** Get Start Date.
@return First effective day (inclusive) */
public Timestamp getStartDate() 
{
return (Timestamp)get_Value(COLUMNNAME_StartDate);
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getStartDate()));
}

@XendraTrl(Identifier="7f1a450e-65e2-46a0-3995-7fa18db21e21")
public static String es_PE_FIELD_Class_StartDate_Name="Fecha de Inicio";

@XendraTrl(Identifier="7f1a450e-65e2-46a0-3995-7fa18db21e21")
public static String es_PE_FIELD_Class_StartDate_Description="Primer día efectivo (inclusive)";

@XendraTrl(Identifier="7f1a450e-65e2-46a0-3995-7fa18db21e21")
public static String es_PE_FIELD_Class_StartDate_Help="La fecha de Inicio indica la primera fecha ó fecha inicial de un rango";

@XendraField(AD_Column_ID="StartDate",IsCentrallyMaintained=true,
AD_Tab_ID="70cb612b-a413-3da1-5dbf-d352d1a85eaa",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7f1a450e-65e2-46a0-3995-7fa18db21e21")
public static final String FIELDNAME_Class_StartDate="7f1a450e-65e2-46a0-3995-7fa18db21e21";

@XendraTrl(Identifier="09701a84-b1fb-b8c8-85cb-825f68c297a1")
public static String es_PE_COLUMN_StartDate_Name="Fecha de Inicio";

@XendraColumn(AD_Element_ID="3fe42406-cab3-a569-bf0b-3614f5d95711",ColumnName="StartDate",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="09701a84-b1fb-b8c8-85cb-825f68c297a1",
Synchronized="2019-08-30 22:24:19.0")
/** Column name StartDate */
public static final String COLUMNNAME_StartDate = "StartDate";
/** Set Training Class.
@param S_Training_Class_ID The actual training class instance */
public void setS_Training_Class_ID (int S_Training_Class_ID)
{
if (S_Training_Class_ID < 1) throw new IllegalArgumentException ("S_Training_Class_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_S_Training_Class_ID, Integer.valueOf(S_Training_Class_ID));
}
/** Get Training Class.
@return The actual training class instance */
public int getS_Training_Class_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_S_Training_Class_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="9d58fd36-23d9-f33b-7005-4526b5a5ce66")
public static String es_PE_FIELD_Class_TrainingClass_Name="Clase de entrenamiento";

@XendraTrl(Identifier="9d58fd36-23d9-f33b-7005-4526b5a5ce66")
public static String es_PE_FIELD_Class_TrainingClass_Description="El caso real de la clase del entrenamiento";

@XendraTrl(Identifier="9d58fd36-23d9-f33b-7005-4526b5a5ce66")
public static String es_PE_FIELD_Class_TrainingClass_Help="Programación de una clase";

@XendraField(AD_Column_ID="S_Training_Class_ID",IsCentrallyMaintained=true,
AD_Tab_ID="70cb612b-a413-3da1-5dbf-d352d1a85eaa",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9d58fd36-23d9-f33b-7005-4526b5a5ce66")
public static final String FIELDNAME_Class_TrainingClass="9d58fd36-23d9-f33b-7005-4526b5a5ce66";
/** Column name S_Training_Class_ID */
public static final String COLUMNNAME_S_Training_Class_ID = "S_Training_Class_ID";
/** Set Training.
@param S_Training_ID Repeated Training */
public void setS_Training_ID (int S_Training_ID)
{
if (S_Training_ID < 1) throw new IllegalArgumentException ("S_Training_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_S_Training_ID, Integer.valueOf(S_Training_ID));
}
/** Get Training.
@return Repeated Training */
public int getS_Training_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_S_Training_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="601f15eb-0a58-636a-3bcf-4bb81b5162d5")
public static String es_PE_FIELD_Class_Training_Name="Entrenamiento";

@XendraTrl(Identifier="601f15eb-0a58-636a-3bcf-4bb81b5162d5")
public static String es_PE_FIELD_Class_Training_Description="Entrenamiento repetido";

@XendraTrl(Identifier="601f15eb-0a58-636a-3bcf-4bb81b5162d5")
public static String es_PE_FIELD_Class_Training_Help="El entrenamiento puede tener clases reales múltiples";

@XendraField(AD_Column_ID="S_Training_ID",IsCentrallyMaintained=true,
AD_Tab_ID="70cb612b-a413-3da1-5dbf-d352d1a85eaa",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="601f15eb-0a58-636a-3bcf-4bb81b5162d5")
public static final String FIELDNAME_Class_Training="601f15eb-0a58-636a-3bcf-4bb81b5162d5";

@XendraTrl(Identifier="ffb7d32d-2bfc-d3d6-872d-9b2f29e75a7e")
public static String es_PE_COLUMN_S_Training_ID_Name="Entrenamiento";

@XendraColumn(AD_Element_ID="63004ef1-ba60-2a4f-5bc9-2fea98eac608",ColumnName="S_Training_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ffb7d32d-2bfc-d3d6-872d-9b2f29e75a7e",
Synchronized="2019-08-30 22:24:19.0")
/** Column name S_Training_ID */
public static final String COLUMNNAME_S_Training_ID = "S_Training_ID";
}
