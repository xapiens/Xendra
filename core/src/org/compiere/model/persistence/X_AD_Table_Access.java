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
import org.compiere.model.reference.REF_AD_Table_AccessRuleType;
/** Generated Model for AD_Table_Access
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_Table_Access extends PO
{
/** Standard Constructor
@param ctx context
@param AD_Table_Access_ID id
@param trxName transaction
*/
public X_AD_Table_Access (Properties ctx, int AD_Table_Access_ID, String trxName)
{
super (ctx, AD_Table_Access_ID, trxName);
/** if (AD_Table_Access_ID == 0)
{
setAccessTypeRule (null);	
// A
setAD_Role_ID (0);
setAD_Table_ID (0);
setIsCanExport (false);	
// N
setIsCanReport (false);	
// N
setIsExclude (true);	
// Y
setIsReadOnly (false);	
// N
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_Table_Access (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=565 */
public static int Table_ID=MTable.getTable_ID("AD_Table_Access");

@XendraTrl(Identifier="4c1c85c5-b100-868a-c058-0cf264762a27")
public static String es_PE_TAB_TableAccess_Description="Mantener el Acceso a Tablas";

@XendraTrl(Identifier="4c1c85c5-b100-868a-c058-0cf264762a27")
public static String es_PE_TAB_TableAccess_Name="Acceso a Tablas";

@XendraTrl(Identifier="4c1c85c5-b100-868a-c058-0cf264762a27")
public static String es_PE_TAB_TableAccess_Help="Si está enumerado aquí, el acceso del rol can(not) de los expedientes de datos de esta tabla, iguala si el papel tiene acceso a la funcionalidad";

@XendraTab(Name="Table Access",Description="Maintain Table Access",
Help="If listed here, the Role can(not) access all data of this table, even if the role has access to the functionality. <br>If you Include Access to a table and select Read Only, you can only read data (otherwise full access). <br>If you Exclude Access to a table and select Read Only, you can only read data (otherwise no access). <br>Please note that table access rules here are in addition to the Data Access Levels defined for a Table and the User Level defined for a Role. These rules are evaulated first and you only need to define the exceptions to these rules here. <p> Note that access information is cached and requires re-login or reset of cache. Be aware that if you use Include rules, that you need to include also several supporting entiries. As an alternative, grant access only to functionality required.",
AD_Window_ID="c927d42d-2145-4004-dbd3-51f85f9cab5e",SeqNo=20,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="3dbba6dd-b000-0264-02d7-c4e1b8bc8411",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="4c1c85c5-b100-868a-c058-0cf264762a27",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_TableAccess="4c1c85c5-b100-868a-c058-0cf264762a27";

@XendraTrl(Identifier="c515088b-3037-27c4-42cc-3515c2668cea")
public static String es_PE_TABLE_AD_Table_Access_Name="AD_Table_Access";

@XendraTable(Name="AD_Table_Access",Description="",Help="",TableName="AD_Table_Access",
AccessLevel="6",AD_Window_ID="c927d42d-2145-4004-dbd3-51f85f9cab5e",AD_Val_Rule_ID="",IsKey=0,
LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.dictionary",
Identifier="c515088b-3037-27c4-42cc-3515c2668cea",Synchronized="2017-08-16 11:41:01.0")
/** TableName=AD_Table_Access */
public static final String Table_Name="AD_Table_Access";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_Table_Access");

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
    Table_ID = MTable.getTable_ID("AD_Table_Access");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_Table_Access[").append(get_ID()).append("]");
return sb.toString();
}

/** AccessTypeRule AD_Reference=77ec3623-8e6b-df6f-0a21-f92cfcd5ad81 */
public static final int ACCESSTYPERULE_AD_Reference_ID=293;
/** Set Access Type.
@param AccessTypeRule The type of access for this rule */
public void setAccessTypeRule (String AccessTypeRule)
{
if (AccessTypeRule == null) throw new IllegalArgumentException ("AccessTypeRule is mandatory");
if (AccessTypeRule.equals(REF_AD_Table_AccessRuleType.Reporting) || AccessTypeRule.equals(REF_AD_Table_AccessRuleType.Accessing) || AccessTypeRule.equals(REF_AD_Table_AccessRuleType.Exporting));
 else throw new IllegalArgumentException ("AccessTypeRule Invalid value - " + AccessTypeRule + " - Reference_ID=293 - R - A - E");
if (AccessTypeRule.length() > 1)
{
log.warning("Length > 1 - truncated");
AccessTypeRule = AccessTypeRule.substring(0,0);
}
set_ValueNoCheck (COLUMNNAME_AccessTypeRule, AccessTypeRule);
}
/** Get Access Type.
@return The type of access for this rule */
public String getAccessTypeRule() 
{
return (String)get_Value(COLUMNNAME_AccessTypeRule);
}

@XendraTrl(Identifier="81535dd9-f8af-1358-98b9-99f4f5767e78")
public static String es_PE_FIELD_TableAccess_AccessType_Description="Tipo de acceso para esta regla";

@XendraTrl(Identifier="81535dd9-f8af-1358-98b9-99f4f5767e78")
public static String es_PE_FIELD_TableAccess_AccessType_Help="Si usted restringe el acceso a la entidad, usted también no puede reportar ó exportar (ej. tener acceso es un requisito para que usted pueda reportar ó exportar los datos) Las reglas del informe y de la exportación son otras restricciones si usted tiene acceso.";

@XendraTrl(Identifier="81535dd9-f8af-1358-98b9-99f4f5767e78")
public static String es_PE_FIELD_TableAccess_AccessType_Name="Tipo de Acceso";

@XendraField(AD_Column_ID="AccessTypeRule",IsCentrallyMaintained=true,
AD_Tab_ID="4c1c85c5-b100-868a-c058-0cf264762a27",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="81535dd9-f8af-1358-98b9-99f4f5767e78")
public static final String FIELDNAME_TableAccess_AccessType="81535dd9-f8af-1358-98b9-99f4f5767e78";

@XendraTrl(Identifier="c0b6e991-513d-04c2-c5c5-f8448477ab90")
public static String es_PE_COLUMN_AccessTypeRule_Name="Tipo de Acceso";

@XendraColumn(AD_Element_ID="a723d768-1d9a-fc32-6daf-5878d57dc141",ColumnName="AccessTypeRule",
AD_Reference_ID=17,AD_Reference_Value_ID="77ec3623-8e6b-df6f-0a21-f92cfcd5ad81",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="A",IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="c0b6e991-513d-04c2-c5c5-f8448477ab90",Synchronized="2017-08-05 16:52:53.0")
/** Column name AccessTypeRule */
public static final String COLUMNNAME_AccessTypeRule = "AccessTypeRule";
/** Set Role.
@param AD_Role_ID Responsibility Role */
public void setAD_Role_ID (int AD_Role_ID)
{
if (AD_Role_ID < 0) throw new IllegalArgumentException ("AD_Role_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_Role_ID, Integer.valueOf(AD_Role_ID));
}
/** Get Role.
@return Responsibility Role */
public int getAD_Role_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Role_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="e0a04be1-7e6d-452f-5141-9b895d92e7c4")
public static String es_PE_FIELD_TableAccess_Role_Description="Rol de responsabilidad";

@XendraTrl(Identifier="e0a04be1-7e6d-452f-5141-9b895d92e7c4")
public static String es_PE_FIELD_TableAccess_Role_Help="El Rol determina la seguridad y acceso del usuario que posee este Rol";

@XendraTrl(Identifier="e0a04be1-7e6d-452f-5141-9b895d92e7c4")
public static String es_PE_FIELD_TableAccess_Role_Name="Rol";

@XendraField(AD_Column_ID="AD_Role_ID",IsCentrallyMaintained=true,
AD_Tab_ID="4c1c85c5-b100-868a-c058-0cf264762a27",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e0a04be1-7e6d-452f-5141-9b895d92e7c4")
public static final String FIELDNAME_TableAccess_Role="e0a04be1-7e6d-452f-5141-9b895d92e7c4";

@XendraTrl(Identifier="3dbba6dd-b000-0264-02d7-c4e1b8bc8411")
public static String es_PE_COLUMN_AD_Role_ID_Name="Rol";

@XendraColumn(AD_Element_ID="08ffb725-ea75-e55f-f4c5-67ac26f40e2b",ColumnName="AD_Role_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3dbba6dd-b000-0264-02d7-c4e1b8bc8411",
Synchronized="2017-08-05 16:52:53.0")
/** Column name AD_Role_ID */
public static final String COLUMNNAME_AD_Role_ID = "AD_Role_ID";
/** Set Table.
@param AD_Table_ID Database Table information */
public void setAD_Table_ID (int AD_Table_ID)
{
if (AD_Table_ID < 1) throw new IllegalArgumentException ("AD_Table_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_Table_ID, Integer.valueOf(AD_Table_ID));
}
/** Get Table.
@return Database Table information */
public int getAD_Table_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Table_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getAD_Table_ID()));
}

@XendraTrl(Identifier="856e70c0-d6ce-5087-0366-676816cfd361")
public static String es_PE_FIELD_TableAccess_Table_Description="Tabla para los campos";

@XendraTrl(Identifier="856e70c0-d6ce-5087-0366-676816cfd361")
public static String es_PE_FIELD_TableAccess_Table_Help="La Tabla indica una tabla en la que reside un campo ó campos.";

@XendraTrl(Identifier="856e70c0-d6ce-5087-0366-676816cfd361")
public static String es_PE_FIELD_TableAccess_Table_Name="Tabla";

@XendraField(AD_Column_ID="AD_Table_ID",IsCentrallyMaintained=true,
AD_Tab_ID="4c1c85c5-b100-868a-c058-0cf264762a27",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="856e70c0-d6ce-5087-0366-676816cfd361")
public static final String FIELDNAME_TableAccess_Table="856e70c0-d6ce-5087-0366-676816cfd361";

@XendraTrl(Identifier="f11eda55-1ca8-725d-33c3-c5184fb6de9b")
public static String es_PE_COLUMN_AD_Table_ID_Name="Tabla";

@XendraColumn(AD_Element_ID="270eeb02-723b-0ecc-7f56-3c67fa71a7f1",ColumnName="AD_Table_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f11eda55-1ca8-725d-33c3-c5184fb6de9b",
Synchronized="2017-08-05 16:52:53.0")
/** Column name AD_Table_ID */
public static final String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
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
@XendraTrl(Identifier="f22ab31f-ada4-4481-899e-4a891cfed09b")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f22ab31f-ada4-4481-899e-4a891cfed09b",
Synchronized="2017-08-05 16:52:53.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Can Export.
@param IsCanExport Users with this role can export data */
public void setIsCanExport (boolean IsCanExport)
{
set_Value (COLUMNNAME_IsCanExport, Boolean.valueOf(IsCanExport));
}
/** Get Can Export.
@return Users with this role can export data */
public boolean isCanExport() 
{
Object oo = get_Value(COLUMNNAME_IsCanExport);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="da2af30e-d9e0-823e-cbb8-9cb425efe5f1")
public static String es_PE_FIELD_TableAccess_CanExport_Description="Usuarios con una regla para poder exportar";

@XendraTrl(Identifier="da2af30e-d9e0-823e-cbb8-9cb425efe5f1")
public static String es_PE_FIELD_TableAccess_CanExport_Help="Usted puede restringir la capacidad de exportar datos de Adempiere.";

@XendraTrl(Identifier="da2af30e-d9e0-823e-cbb8-9cb425efe5f1")
public static String es_PE_FIELD_TableAccess_CanExport_Name="Puede Exportar";

@XendraField(AD_Column_ID="IsCanExport",IsCentrallyMaintained=true,
AD_Tab_ID="4c1c85c5-b100-868a-c058-0cf264762a27",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@AccessTypeRule@=E",DisplayLength=1,IsReadOnly=false,SeqNo=100,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="da2af30e-d9e0-823e-cbb8-9cb425efe5f1")
public static final String FIELDNAME_TableAccess_CanExport="da2af30e-d9e0-823e-cbb8-9cb425efe5f1";

@XendraTrl(Identifier="caba1abb-1023-c07e-2101-a1368f49c6bf")
public static String es_PE_COLUMN_IsCanExport_Name="Puede Exportar";

@XendraColumn(AD_Element_ID="0af50b0e-deaa-f58b-d99f-12fd6eebd3dd",ColumnName="IsCanExport",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="caba1abb-1023-c07e-2101-a1368f49c6bf",
Synchronized="2017-08-05 16:52:53.0")
/** Column name IsCanExport */
public static final String COLUMNNAME_IsCanExport = "IsCanExport";
/** Set Can Report.
@param IsCanReport Users with this role can create reports */
public void setIsCanReport (boolean IsCanReport)
{
set_Value (COLUMNNAME_IsCanReport, Boolean.valueOf(IsCanReport));
}
/** Get Can Report.
@return Users with this role can create reports */
public boolean isCanReport() 
{
Object oo = get_Value(COLUMNNAME_IsCanReport);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="07c5cf18-4622-861b-62e6-e89ac06bd6bf")
public static String es_PE_FIELD_TableAccess_CanReport_Description="Usuarios con una regla para poder crear informes";

@XendraTrl(Identifier="07c5cf18-4622-861b-62e6-e89ac06bd6bf")
public static String es_PE_FIELD_TableAccess_CanReport_Help="Usted puede restringir la capacidad de hacer informes sobre datos.";

@XendraTrl(Identifier="07c5cf18-4622-861b-62e6-e89ac06bd6bf")
public static String es_PE_FIELD_TableAccess_CanReport_Name="Puede hacer Informes";

@XendraField(AD_Column_ID="IsCanReport",IsCentrallyMaintained=true,
AD_Tab_ID="4c1c85c5-b100-868a-c058-0cf264762a27",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@AccessTypeRule@=R",DisplayLength=1,IsReadOnly=false,SeqNo=90,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="07c5cf18-4622-861b-62e6-e89ac06bd6bf")
public static final String FIELDNAME_TableAccess_CanReport="07c5cf18-4622-861b-62e6-e89ac06bd6bf";

@XendraTrl(Identifier="e74e4a67-937c-b68c-fc18-104b0bdeb8a4")
public static String es_PE_COLUMN_IsCanReport_Name="Puede hacer Informes";

@XendraColumn(AD_Element_ID="aea4c019-2381-2f85-c631-9521d55c77a3",ColumnName="IsCanReport",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e74e4a67-937c-b68c-fc18-104b0bdeb8a4",
Synchronized="2017-08-05 16:52:53.0")
/** Column name IsCanReport */
public static final String COLUMNNAME_IsCanReport = "IsCanReport";
/** Set Exclude.
@param IsExclude Exclude access to the data - if not selected Include access to the data */
public void setIsExclude (boolean IsExclude)
{
set_Value (COLUMNNAME_IsExclude, Boolean.valueOf(IsExclude));
}
/** Get Exclude.
@return Exclude access to the data - if not selected Include access to the data */
public boolean isExclude() 
{
Object oo = get_Value(COLUMNNAME_IsExclude);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="9d515711-db7f-bc5d-830f-54d791e5c65f")
public static String es_PE_FIELD_TableAccess_Exclude_Description="Excluir el acceso a los datos";

@XendraTrl(Identifier="9d515711-db7f-bc5d-830f-54d791e5c65f")
public static String es_PE_FIELD_TableAccess_Exclude_Help="Si está seleccionado, el Rol no puede tener acceso a los datos especificos. Si no esta seleccionado, el Rol puede tener acceso SOLAMENTE a los datos especificos.";

@XendraTrl(Identifier="9d515711-db7f-bc5d-830f-54d791e5c65f")
public static String es_PE_FIELD_TableAccess_Exclude_Name="Excluir";

@XendraField(AD_Column_ID="IsExclude",IsCentrallyMaintained=true,
AD_Tab_ID="4c1c85c5-b100-868a-c058-0cf264762a27",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9d515711-db7f-bc5d-830f-54d791e5c65f")
public static final String FIELDNAME_TableAccess_Exclude="9d515711-db7f-bc5d-830f-54d791e5c65f";

@XendraTrl(Identifier="d368f175-693a-7a9c-5866-aba6169b7500")
public static String es_PE_COLUMN_IsExclude_Name="Excluir";

@XendraColumn(AD_Element_ID="770b492c-be75-a622-6c96-f202d97c4dfd",ColumnName="IsExclude",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="Y",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d368f175-693a-7a9c-5866-aba6169b7500",
Synchronized="2017-08-05 16:52:53.0")
/** Column name IsExclude */
public static final String COLUMNNAME_IsExclude = "IsExclude";
/** Set Read Only.
@param IsReadOnly Field is read only */
public void setIsReadOnly (boolean IsReadOnly)
{
set_Value (COLUMNNAME_IsReadOnly, Boolean.valueOf(IsReadOnly));
}
/** Get Read Only.
@return Field is read only */
public boolean isReadOnly() 
{
Object oo = get_Value(COLUMNNAME_IsReadOnly);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="7424424b-ec57-094e-bfb6-0355fc791ab7")
public static String es_PE_FIELD_TableAccess_ReadOnly_Description="El campo es de sólo lectura";

@XendraTrl(Identifier="7424424b-ec57-094e-bfb6-0355fc791ab7")
public static String es_PE_FIELD_TableAccess_ReadOnly_Help="El sólo lectura indica que este campo solamente puede ser leído. No puede ser actualizado.";

@XendraTrl(Identifier="7424424b-ec57-094e-bfb6-0355fc791ab7")
public static String es_PE_FIELD_TableAccess_ReadOnly_Name="Sólo Lectura";

@XendraField(AD_Column_ID="IsReadOnly",IsCentrallyMaintained=true,
AD_Tab_ID="4c1c85c5-b100-868a-c058-0cf264762a27",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@AccessTypeRule@=A",DisplayLength=1,IsReadOnly=false,SeqNo=80,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="7424424b-ec57-094e-bfb6-0355fc791ab7")
public static final String FIELDNAME_TableAccess_ReadOnly="7424424b-ec57-094e-bfb6-0355fc791ab7";

@XendraTrl(Identifier="8e082821-649c-f1b2-abd8-2f167511e96d")
public static String es_PE_COLUMN_IsReadOnly_Name="Sólo Lectura";

@XendraColumn(AD_Element_ID="91b664da-9e5a-8ff7-2fef-8042ee7fb0c2",ColumnName="IsReadOnly",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8e082821-649c-f1b2-abd8-2f167511e96d",
Synchronized="2017-08-05 16:52:53.0")
/** Column name IsReadOnly */
public static final String COLUMNNAME_IsReadOnly = "IsReadOnly";
}
