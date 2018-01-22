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
/** Generated Model for AD_PrintColor
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_PrintColor extends PO
{
/** Standard Constructor
@param ctx context
@param AD_PrintColor_ID id
@param trxName transaction
*/
public X_AD_PrintColor (Properties ctx, int AD_PrintColor_ID, String trxName)
{
super (ctx, AD_PrintColor_ID, trxName);
/** if (AD_PrintColor_ID == 0)
{
setAD_PrintColor_ID (0);
setCode (null);
setIsDefault (false);	
// N
setName (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_PrintColor (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=490 */
public static int Table_ID=MTable.getTable_ID("AD_PrintColor");

@XendraTrl(Identifier="427db742-7069-31fb-b945-598dae90a13f")
public static String es_PE_TAB_PrintColor_Description="Mantener Color de Impresión";

@XendraTrl(Identifier="427db742-7069-31fb-b945-598dae90a13f")
public static String es_PE_TAB_PrintColor_Name="Color de Impresión";

@XendraTrl(Identifier="427db742-7069-31fb-b945-598dae90a13f")
public static String es_PE_TAB_PrintColor_Help="Colores usados para impresión.";

@XendraTab(Name="Print Color",Description="Maintain Print Color",Help="Colors used for printing",
AD_Window_ID="cf4c135d-c497-9be4-eb0e-5d7d2b792433",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="427db742-7069-31fb-b945-598dae90a13f",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_PrintColor="427db742-7069-31fb-b945-598dae90a13f";

@XendraTrl(Identifier="51503408-de06-788a-fd7d-184221f7e3e5")
public static String es_PE_TABLE_AD_PrintColor_Name="Impresión a Color";

@XendraTable(Name="Print Color",Description="Color used for printing and display",Help="",
TableName="AD_PrintColor",AccessLevel="6",AD_Window_ID="cf4c135d-c497-9be4-eb0e-5d7d2b792433",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=55,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.dictionary",
Identifier="51503408-de06-788a-fd7d-184221f7e3e5",Synchronized="2017-08-16 11:40:38.0")
/** TableName=AD_PrintColor */
public static final String Table_Name="AD_PrintColor";


@XendraIndex(Name="ad_printcolor_name",Identifier="1c16127a-5b70-dd9a-df8a-c6e6d0d64aed",
Column_Names="ad_client_id, name",IsUnique="true",
TableIdentifier="1c16127a-5b70-dd9a-df8a-c6e6d0d64aed",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_ad_printcolor_name = "1c16127a-5b70-dd9a-df8a-c6e6d0d64aed";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_PrintColor");

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
    Table_ID = MTable.getTable_ID("AD_PrintColor");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_PrintColor[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Print Color.
@param AD_PrintColor_ID Color used for printing and display */
public void setAD_PrintColor_ID (int AD_PrintColor_ID)
{
if (AD_PrintColor_ID < 1) throw new IllegalArgumentException ("AD_PrintColor_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_PrintColor_ID, Integer.valueOf(AD_PrintColor_ID));
}
/** Get Print Color.
@return Color used for printing and display */
public int getAD_PrintColor_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_PrintColor_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="b581ccc7-db8b-88a1-5115-fde0c080616f")
public static String es_PE_FIELD_PrintColor_PrintColor_Description="Color usado para imprimir";

@XendraTrl(Identifier="b581ccc7-db8b-88a1-5115-fde0c080616f")
public static String es_PE_FIELD_PrintColor_PrintColor_Help="Color usado para imprimir";

@XendraTrl(Identifier="b581ccc7-db8b-88a1-5115-fde0c080616f")
public static String es_PE_FIELD_PrintColor_PrintColor_Name="Impresión a Color";

@XendraField(AD_Column_ID="AD_PrintColor_ID",IsCentrallyMaintained=true,
AD_Tab_ID="427db742-7069-31fb-b945-598dae90a13f",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b581ccc7-db8b-88a1-5115-fde0c080616f")
public static final String FIELDNAME_PrintColor_PrintColor="b581ccc7-db8b-88a1-5115-fde0c080616f";
/** Column name AD_PrintColor_ID */
public static final String COLUMNNAME_AD_PrintColor_ID = "AD_PrintColor_ID";
/** Set Validation code.
@param Code Validation Code */
public void setCode (String Code)
{
if (Code == null) throw new IllegalArgumentException ("Code is mandatory.");
if (Code.length() > 2000)
{
log.warning("Length > 2000 - truncated");
Code = Code.substring(0,1999);
}
set_Value (COLUMNNAME_Code, Code);
}
/** Get Validation code.
@return Validation Code */
public String getCode() 
{
String value = (String)get_Value(COLUMNNAME_Code);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="e7b9b483-131a-b0f0-3317-fa6da767730b")
public static String es_PE_FIELD_PrintColor_ValidationCode_Description="Código de Validación";

@XendraTrl(Identifier="e7b9b483-131a-b0f0-3317-fa6da767730b")
public static String es_PE_FIELD_PrintColor_ValidationCode_Help="El código validación despliega la fecha; hora y mensaje del error";

@XendraTrl(Identifier="e7b9b483-131a-b0f0-3317-fa6da767730b")
public static String es_PE_FIELD_PrintColor_ValidationCode_Name="Código de Validación";

@XendraField(AD_Column_ID="Code",IsCentrallyMaintained=true,
AD_Tab_ID="427db742-7069-31fb-b945-598dae90a13f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e7b9b483-131a-b0f0-3317-fa6da767730b")
public static final String FIELDNAME_PrintColor_ValidationCode="e7b9b483-131a-b0f0-3317-fa6da767730b";

@XendraTrl(Identifier="e38b373e-6f86-d74f-be61-f39fccc278b0")
public static String es_PE_COLUMN_Code_Name="Código de Validación";

@XendraColumn(AD_Element_ID="4885b915-20ff-fb01-73f8-086c5ba63ba8",ColumnName="Code",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e38b373e-6f86-d74f-be61-f39fccc278b0",
Synchronized="2017-08-05 16:52:40.0")
/** Column name Code */
public static final String COLUMNNAME_Code = "Code";
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
@XendraTrl(Identifier="c1084a8c-8a08-4f07-bb76-a676ae7039e4")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c1084a8c-8a08-4f07-bb76-a676ae7039e4",
Synchronized="2017-08-05 16:52:40.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Default.
@param IsDefault Default value */
public void setIsDefault (boolean IsDefault)
{
set_Value (COLUMNNAME_IsDefault, Boolean.valueOf(IsDefault));
}
/** Get Default.
@return Default value */
public boolean isDefault() 
{
Object oo = get_Value(COLUMNNAME_IsDefault);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="3c763db1-b6b8-13c2-f801-6d02ed870302")
public static String es_PE_FIELD_PrintColor_Default_Description="Valor Predeterminado";

@XendraTrl(Identifier="3c763db1-b6b8-13c2-f801-6d02ed870302")
public static String es_PE_FIELD_PrintColor_Default_Help="El cuadro de verificación indica si este registro será usado como un valor predeterminado";

@XendraTrl(Identifier="3c763db1-b6b8-13c2-f801-6d02ed870302")
public static String es_PE_FIELD_PrintColor_Default_Name="Predeterminado";

@XendraField(AD_Column_ID="IsDefault",IsCentrallyMaintained=true,
AD_Tab_ID="427db742-7069-31fb-b945-598dae90a13f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3c763db1-b6b8-13c2-f801-6d02ed870302")
public static final String FIELDNAME_PrintColor_Default="3c763db1-b6b8-13c2-f801-6d02ed870302";

@XendraTrl(Identifier="89168e25-061f-7fbd-962f-9ccf15a67ed1")
public static String es_PE_COLUMN_IsDefault_Name="Predeterminado";

@XendraColumn(AD_Element_ID="8617f892-e113-a5fd-8715-687f792f136c",ColumnName="IsDefault",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="89168e25-061f-7fbd-962f-9ccf15a67ed1",
Synchronized="2017-08-05 16:52:40.0")
/** Column name IsDefault */
public static final String COLUMNNAME_IsDefault = "IsDefault";
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

@XendraTrl(Identifier="871f155e-8b90-236f-e9d2-731eb990d336")
public static String es_PE_FIELD_PrintColor_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="871f155e-8b90-236f-e9d2-731eb990d336")
public static String es_PE_FIELD_PrintColor_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="871f155e-8b90-236f-e9d2-731eb990d336")
public static String es_PE_FIELD_PrintColor_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="427db742-7069-31fb-b945-598dae90a13f",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=1,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="871f155e-8b90-236f-e9d2-731eb990d336")
public static final String FIELDNAME_PrintColor_Name="871f155e-8b90-236f-e9d2-731eb990d336";

@XendraTrl(Identifier="5a38e89d-02c9-a5fe-f65d-7f125b156e3c")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5a38e89d-02c9-a5fe-f65d-7f125b156e3c",
Synchronized="2017-08-05 16:52:40.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
}
