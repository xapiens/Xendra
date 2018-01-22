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
/** Generated Model for PA_ReportLineSet
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_PA_ReportLineSet extends PO
{
/** Standard Constructor
@param ctx context
@param PA_ReportLineSet_ID id
@param trxName transaction
*/
public X_PA_ReportLineSet (Properties ctx, int PA_ReportLineSet_ID, String trxName)
{
super (ctx, PA_ReportLineSet_ID, trxName);
/** if (PA_ReportLineSet_ID == 0)
{
setName (null);
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
public X_PA_ReportLineSet (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=449 */
public static int Table_ID=MTable.getTable_ID("PA_ReportLineSet");

@XendraTrl(Identifier="503ad351-1851-585b-d61a-e107fbe16527")
public static String es_PE_TAB_ReportLineSet_Description="Mantener conjunto de líneas del Informe financiero";

@XendraTrl(Identifier="503ad351-1851-585b-d61a-e107fbe16527")
public static String es_PE_TAB_ReportLineSet_Name="Conjunto de Líneas del Informe";

@XendraTab(Name="Report Line Set",Description="Maintain Financial Report Line Set",Help="",
AD_Window_ID="8c6d3119-8975-60f6-4810-c1c02115372c",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="503ad351-1851-585b-d61a-e107fbe16527",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_ReportLineSet="503ad351-1851-585b-d61a-e107fbe16527";

@XendraTrl(Identifier="1a879baf-e9c3-01d1-d002-71e080bec276")
public static String es_PE_TABLE_PA_ReportLineSet_Name="Establecer Línea de Informe";

@XendraTable(Name="Report Line Set",Description="",Help="",TableName="PA_ReportLineSet",
AccessLevel="3",AD_Window_ID="8c6d3119-8975-60f6-4810-c1c02115372c",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=130,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.performanceanalysis",
Identifier="1a879baf-e9c3-01d1-d002-71e080bec276",Synchronized="2017-08-16 11:43:42.0")
/** TableName=PA_ReportLineSet */
public static final String Table_Name="PA_ReportLineSet";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"PA_ReportLineSet");

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
    Table_ID = MTable.getTable_ID("PA_ReportLineSet");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_PA_ReportLineSet[").append(get_ID()).append("]");
return sb.toString();
}
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

@XendraTrl(Identifier="95bf0b41-9dcc-2e55-d864-c964fdcdbfa4")
public static String es_PE_FIELD_ReportLineSet_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="95bf0b41-9dcc-2e55-d864-c964fdcdbfa4")
public static String es_PE_FIELD_ReportLineSet_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="95bf0b41-9dcc-2e55-d864-c964fdcdbfa4")
public static String es_PE_FIELD_ReportLineSet_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="503ad351-1851-585b-d61a-e107fbe16527",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="95bf0b41-9dcc-2e55-d864-c964fdcdbfa4")
public static final String FIELDNAME_ReportLineSet_Description="95bf0b41-9dcc-2e55-d864-c964fdcdbfa4";

@XendraTrl(Identifier="c53c7521-788a-a478-de85-c8e4f6eed78d")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c53c7521-788a-a478-de85-c8e4f6eed78d",
Synchronized="2017-08-05 16:55:43.0")
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
@XendraTrl(Identifier="2604e525-2258-41e0-b515-9682c0c4ec0e")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2604e525-2258-41e0-b515-9682c0c4ec0e",
Synchronized="2017-08-05 16:55:44.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
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

@XendraTrl(Identifier="f014c1b9-3da7-2d4d-dc76-5fe1226be416")
public static String es_PE_FIELD_ReportLineSet_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="f014c1b9-3da7-2d4d-dc76-5fe1226be416")
public static String es_PE_FIELD_ReportLineSet_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="f014c1b9-3da7-2d4d-dc76-5fe1226be416")
public static String es_PE_FIELD_ReportLineSet_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="503ad351-1851-585b-d61a-e107fbe16527",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=1,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="f014c1b9-3da7-2d4d-dc76-5fe1226be416")
public static final String FIELDNAME_ReportLineSet_Name="f014c1b9-3da7-2d4d-dc76-5fe1226be416";

@XendraTrl(Identifier="667b3017-3f2d-04b3-c144-d9d997615583")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="667b3017-3f2d-04b3-c144-d9d997615583",
Synchronized="2017-08-05 16:55:44.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Report Line Set.
@param PA_ReportLineSet_ID Report Line Set */
public void setPA_ReportLineSet_ID (int PA_ReportLineSet_ID)
{
if (PA_ReportLineSet_ID < 1) throw new IllegalArgumentException ("PA_ReportLineSet_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_PA_ReportLineSet_ID, Integer.valueOf(PA_ReportLineSet_ID));
}
/** Get Report Line Set.
@return Report Line Set */
public int getPA_ReportLineSet_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_PA_ReportLineSet_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d99553be-bbda-5c18-6d33-4fbb811b2c1b")
public static String es_PE_FIELD_ReportLineSet_ReportLineSet_Name="Establecer Línea de Informe";

@XendraField(AD_Column_ID="PA_ReportLineSet_ID",IsCentrallyMaintained=true,
AD_Tab_ID="503ad351-1851-585b-d61a-e107fbe16527",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d99553be-bbda-5c18-6d33-4fbb811b2c1b")
public static final String FIELDNAME_ReportLineSet_ReportLineSet="d99553be-bbda-5c18-6d33-4fbb811b2c1b";
/** Column name PA_ReportLineSet_ID */
public static final String COLUMNNAME_PA_ReportLineSet_ID = "PA_ReportLineSet_ID";
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

@XendraTrl(Identifier="88974baf-8fd0-62e8-8ec3-2ba8cb98eb7b")
public static String es_PE_FIELD_ReportLineSet_ProcessNow_Description="Copiar líneas de reporte desde otro conjunto de líneas";

@XendraTrl(Identifier="88974baf-8fd0-62e8-8ec3-2ba8cb98eb7b")
public static String es_PE_FIELD_ReportLineSet_ProcessNow_Help="Copiar líneas al final de éste conjunto de líneas";

@XendraTrl(Identifier="88974baf-8fd0-62e8-8ec3-2ba8cb98eb7b")
public static String es_PE_FIELD_ReportLineSet_ProcessNow_Name="Copiar Líneas";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="503ad351-1851-585b-d61a-e107fbe16527",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="88974baf-8fd0-62e8-8ec3-2ba8cb98eb7b")
public static final String FIELDNAME_ReportLineSet_ProcessNow="88974baf-8fd0-62e8-8ec3-2ba8cb98eb7b";

@XendraTrl(Identifier="88a5ff17-7e43-a48e-e375-8a6dadb95902")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="40d32397-202a-5797-584a-279216901f23",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="88a5ff17-7e43-a48e-e375-8a6dadb95902",Synchronized="2017-08-05 16:55:44.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
}
