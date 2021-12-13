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
/** Generated Model for AD_Ref_Table
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_Ref_Table extends PO
{
/** Standard Constructor
@param ctx context
@param AD_Ref_Table_ID id
@param trxName transaction
*/
public X_AD_Ref_Table (Properties ctx, int AD_Ref_Table_ID, String trxName)
{
super (ctx, AD_Ref_Table_ID, trxName);
/** if (AD_Ref_Table_ID == 0)
{
setAD_Display (0);
setAD_Key (0);
setAD_Reference_ID (0);
setAD_Table_ID (0);
setEntityType (null);	
// U
setIsValueDisplayed (false);	
// N
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_Ref_Table (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=103 */
public static int Table_ID=MTable.getTable_ID("AD_Ref_Table");

@XendraTrl(Identifier="a000e6d4-f843-c563-4eab-62f6721566ae")
public static String es_PE_TAB_TableValidation_Description="Validación de Tabla";

@XendraTrl(Identifier="a000e6d4-f843-c563-4eab-62f6721566ae")
public static String es_PE_TAB_TableValidation_Help="La pestaña de validación de tablas defina tablas para validar datos";

@XendraTrl(Identifier="a000e6d4-f843-c563-4eab-62f6721566ae")
public static String es_PE_TAB_TableValidation_Name="Validación de Tablas";

@XendraTab(Name="Table Validation",Description="Table validation",
Help="The Table Validation Tab defines tables to validate data",
AD_Window_ID="3aa1b885-6192-d44a-f2c0-c82b9363e3f6",SeqNo=50,TabLevel=1,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",
DisplayLogic="@ValidationType@=T",IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="a000e6d4-f843-c563-4eab-62f6721566ae",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_TableValidation="a000e6d4-f843-c563-4eab-62f6721566ae";

@XendraTrl(Identifier="d271132a-9e53-8a06-c7b4-7bb9712b297f")
public static String es_PE_TABLE_AD_Ref_Table_Name="AD_Ref_Table";

@XendraTable(Name="AD_Ref_Table",AD_Package_ID="24337a04-c03d-922c-e7ce-2876bf8880b5",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Reference Table Definitions",
Help="",TableName="AD_Ref_Table",AccessLevel="4",
AD_Window_ID="3aa1b885-6192-d44a-f2c0-c82b9363e3f6",AD_Val_Rule_ID="",IsKey=0,LoadSeq=145,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.request",Identifier="d271132a-9e53-8a06-c7b4-7bb9712b297f",
Synchronized="2020-03-03 21:35:50.0")
/** TableName=AD_Ref_Table */
public static final String Table_Name="AD_Ref_Table";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_Ref_Table");

protected BigDecimal accessLevel = BigDecimal.valueOf(4);
/** AccessLevel
@return 4 - System 
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
    Table_ID = MTable.getTable_ID("AD_Ref_Table");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_Ref_Table[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Display column.
@param AD_Display Column that will display */
public void setAD_Display (int AD_Display)
{
set_Value (COLUMNNAME_AD_Display, Integer.valueOf(AD_Display));
}
/** Get Display column.
@return Column that will display */
public int getAD_Display() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Display);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="8c655f6f-3550-f631-d364-aab71023fa77")
public static String es_PE_FIELD_TableValidation_DisplayColumn_Name="Despliegue de Columna";

@XendraTrl(Identifier="8c655f6f-3550-f631-d364-aab71023fa77")
public static String es_PE_FIELD_TableValidation_DisplayColumn_Description="Columna que desplegará";

@XendraTrl(Identifier="8c655f6f-3550-f631-d364-aab71023fa77")
public static String es_PE_FIELD_TableValidation_DisplayColumn_Help="La columna despliegue indica la columna que se desplegará";

@XendraField(AD_Column_ID="AD_Display",IsCentrallyMaintained=true,
AD_Tab_ID="a000e6d4-f843-c563-4eab-62f6721566ae",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@ValidationType@=T",DisplayLength=14,IsReadOnly=false,SeqNo=60,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="8c655f6f-3550-f631-d364-aab71023fa77")
public static final String FIELDNAME_TableValidation_DisplayColumn="8c655f6f-3550-f631-d364-aab71023fa77";

@XendraTrl(Identifier="11ba8e88-1de1-e4e7-af8d-f7f313e1ec8a")
public static String es_PE_COLUMN_AD_Display_Name="Despliegue de Columna";

@XendraColumn(AD_Element_ID="45df7cfe-ad08-6ae9-53a2-1af3e046f58f",ColumnName="AD_Display",
AD_Reference_ID=18,AD_Reference_Value_ID="71e45f6b-5379-d679-4b75-d0871acf908f",
AD_Val_Rule_ID="084db087-1100-ad15-806b-d1b94a96650c",FieldLength=22,DefaultValue="",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="11ba8e88-1de1-e4e7-af8d-f7f313e1ec8a",
Synchronized="2019-08-30 22:20:37.0")
/** Column name AD_Display */
public static final String COLUMNNAME_AD_Display = "AD_Display";
/** Set Key column.
@param AD_Key Unique identifier of a record */
public void setAD_Key (int AD_Key)
{
set_Value (COLUMNNAME_AD_Key, Integer.valueOf(AD_Key));
}
/** Get Key column.
@return Unique identifier of a record */
public int getAD_Key() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Key);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="c52c21f6-e63e-d71d-c916-edecc0d90b19")
public static String es_PE_FIELD_TableValidation_KeyColumn_Name="Columna Clave";

@XendraTrl(Identifier="c52c21f6-e63e-d71d-c916-edecc0d90b19")
public static String es_PE_FIELD_TableValidation_KeyColumn_Description="Identificador único de un registro";

@XendraTrl(Identifier="c52c21f6-e63e-d71d-c916-edecc0d90b19")
public static String es_PE_FIELD_TableValidation_KeyColumn_Help="La columna clave indica que éste es el identificador único de un registro en esta tabla";

@XendraField(AD_Column_ID="AD_Key",IsCentrallyMaintained=true,
AD_Tab_ID="a000e6d4-f843-c563-4eab-62f6721566ae",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@ValidationType@=T",DisplayLength=14,IsReadOnly=false,SeqNo=50,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="c52c21f6-e63e-d71d-c916-edecc0d90b19")
public static final String FIELDNAME_TableValidation_KeyColumn="c52c21f6-e63e-d71d-c916-edecc0d90b19";

@XendraTrl(Identifier="e607534d-77df-0bdb-0bbc-58c3dbd65389")
public static String es_PE_COLUMN_AD_Key_Name="Columna Clave";

@XendraColumn(AD_Element_ID="6346c249-f4c1-2876-3cc2-49795b974858",ColumnName="AD_Key",
AD_Reference_ID=18,AD_Reference_Value_ID="71e45f6b-5379-d679-4b75-d0871acf908f",
AD_Val_Rule_ID="084db087-1100-ad15-806b-d1b94a96650c",FieldLength=22,DefaultValue="",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e607534d-77df-0bdb-0bbc-58c3dbd65389",
Synchronized="2019-08-30 22:20:37.0")
/** Column name AD_Key */
public static final String COLUMNNAME_AD_Key = "AD_Key";
/** Set Reference.
@param AD_Reference_ID System Reference and Validation */
public void setAD_Reference_ID (int AD_Reference_ID)
{
if (AD_Reference_ID < 1) throw new IllegalArgumentException ("AD_Reference_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_Reference_ID, Integer.valueOf(AD_Reference_ID));
}
/** Get Reference.
@return System Reference and Validation */
public int getAD_Reference_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Reference_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getAD_Reference_ID()));
}

@XendraTrl(Identifier="d749e223-0c08-58ef-bdf9-fa2bd75c215e")
public static String es_PE_FIELD_TableValidation_Reference_Name="Referencia";

@XendraTrl(Identifier="d749e223-0c08-58ef-bdf9-fa2bd75c215e")
public static String es_PE_FIELD_TableValidation_Reference_Description="Referencia del Sistema (Lista de Selección)";

@XendraTrl(Identifier="d749e223-0c08-58ef-bdf9-fa2bd75c215e")
public static String es_PE_FIELD_TableValidation_Reference_Help="La Referencia indica el tipo de campo de referencia";

@XendraField(AD_Column_ID="AD_Reference_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a000e6d4-f843-c563-4eab-62f6721566ae",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@ValidationType@=T",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="d749e223-0c08-58ef-bdf9-fa2bd75c215e")
public static final String FIELDNAME_TableValidation_Reference="d749e223-0c08-58ef-bdf9-fa2bd75c215e";

@XendraTrl(Identifier="a644a872-d384-2b16-9ccd-a94aeda0598f")
public static String es_PE_COLUMN_AD_Reference_ID_Name="Referencia";

@XendraColumn(AD_Element_ID="bf1912e9-a75f-4e1b-99b4-d04633e7777b",ColumnName="AD_Reference_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a644a872-d384-2b16-9ccd-a94aeda0598f",
Synchronized="2019-08-30 22:20:37.0")
/** Column name AD_Reference_ID */
public static final String COLUMNNAME_AD_Reference_ID = "AD_Reference_ID";
/** Set Table.
@param AD_Table_ID Database Table information */
public void setAD_Table_ID (int AD_Table_ID)
{
if (AD_Table_ID < 1) throw new IllegalArgumentException ("AD_Table_ID is mandatory.");
set_Value (COLUMNNAME_AD_Table_ID, Integer.valueOf(AD_Table_ID));
}
/** Get Table.
@return Database Table information */
public int getAD_Table_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Table_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="fa0e1c13-c082-58a7-65fc-d95def7603ee")
public static String es_PE_FIELD_TableValidation_Table_Name="Tabla";

@XendraTrl(Identifier="fa0e1c13-c082-58a7-65fc-d95def7603ee")
public static String es_PE_FIELD_TableValidation_Table_Description="Tabla para los campos";

@XendraTrl(Identifier="fa0e1c13-c082-58a7-65fc-d95def7603ee")
public static String es_PE_FIELD_TableValidation_Table_Help="La Tabla indica una tabla en la que reside un campo ó campos.";

@XendraField(AD_Column_ID="AD_Table_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a000e6d4-f843-c563-4eab-62f6721566ae",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@ValidationType@=T",DisplayLength=14,IsReadOnly=false,SeqNo=40,SortNo=1,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="fa0e1c13-c082-58a7-65fc-d95def7603ee")
public static final String FIELDNAME_TableValidation_Table="fa0e1c13-c082-58a7-65fc-d95def7603ee";

@XendraTrl(Identifier="ffcb74c3-5999-8930-2f9d-3f7b6a8b8948")
public static String es_PE_COLUMN_AD_Table_ID_Name="Tabla";

@XendraColumn(AD_Element_ID="270eeb02-723b-0ecc-7f56-3c67fa71a7f1",ColumnName="AD_Table_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ffcb74c3-5999-8930-2f9d-3f7b6a8b8948",
Synchronized="2019-08-30 22:20:37.0")
/** Column name AD_Table_ID */
public static final String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
/** Set Window.
@param AD_Window_ID Data entry or display window */
public void setAD_Window_ID (int AD_Window_ID)
{
if (AD_Window_ID <= 0) set_Value (COLUMNNAME_AD_Window_ID, null);
 else 
set_Value (COLUMNNAME_AD_Window_ID, Integer.valueOf(AD_Window_ID));
}
/** Get Window.
@return Data entry or display window */
public int getAD_Window_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Window_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ac90ba14-e727-0197-b7e4-c77648efddc9")
public static String es_PE_COLUMN_AD_Window_ID_Name="Ventana";

@XendraColumn(AD_Element_ID="0c50cb0e-febe-8650-2621-11ba77688276",ColumnName="AD_Window_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ac90ba14-e727-0197-b7e4-c77648efddc9",
Synchronized="2019-08-30 22:20:37.0")
/** Column name AD_Window_ID */
public static final String COLUMNNAME_AD_Window_ID = "AD_Window_ID";
/** Set Entity Type.
@param EntityType Dictionary Entity Type: Determines ownership and synchronization */
public void setEntityType (String EntityType)
{
if (EntityType.length() > 4)
{
log.warning("Length > 4 - truncated");
EntityType = EntityType.substring(0,3);
}
set_Value (COLUMNNAME_EntityType, EntityType);
}
/** Get Entity Type.
@return Dictionary Entity Type: Determines ownership and synchronization */
public String getEntityType() 
{
return (String)get_Value(COLUMNNAME_EntityType);
}

@XendraTrl(Identifier="42cdb042-83f1-0074-1f18-d22443d5a356")
public static String es_PE_FIELD_TableValidation_EntityType_Name="Tipo de Entidad";

@XendraTrl(Identifier="42cdb042-83f1-0074-1f18-d22443d5a356")
public static String es_PE_FIELD_TableValidation_EntityType_Description="Tipo de Entidad Diccionario; determina propiedad y sincronización";

@XendraTrl(Identifier="42cdb042-83f1-0074-1f18-d22443d5a356")
public static String es_PE_FIELD_TableValidation_EntityType_Help="Los tipos de entidad \"Diccionario\"; \"Adempiere\"; y \"Aplicación\" podrían ser automáticamente sincronizados y las personalizaciones eliminadas ó sobreescritas";

@XendraField(AD_Column_ID="EntityType",IsCentrallyMaintained=true,
AD_Tab_ID="a000e6d4-f843-c563-4eab-62f6721566ae",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@ValidationType@=T",DisplayLength=14,IsReadOnly=false,SeqNo=90,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="42cdb042-83f1-0074-1f18-d22443d5a356")
public static final String FIELDNAME_TableValidation_EntityType="42cdb042-83f1-0074-1f18-d22443d5a356";

@XendraTrl(Identifier="3b9919c8-2890-0024-7f5b-a00379e9aecf")
public static String es_PE_COLUMN_EntityType_Name="Tipo de Entidad";

@XendraColumn(AD_Element_ID="5ba917bf-871c-6f19-aa50-962adc5de558",ColumnName="EntityType",
AD_Reference_ID=18,AD_Reference_Value_ID="fae4ad31-8ff1-5d5c-8d47-2426c541cd74",AD_Val_Rule_ID="",
FieldLength=4,DefaultValue="U",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="@EntityType@=D",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="3b9919c8-2890-0024-7f5b-a00379e9aecf",Synchronized="2019-08-30 22:20:37.0")
/** Column name EntityType */
public static final String COLUMNNAME_EntityType = "EntityType";
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
@XendraTrl(Identifier="ec4aa324-ee01-97e5-0c7f-4e659ac2fb7b")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ec4aa324-ee01-97e5-0c7f-4e659ac2fb7b",
Synchronized="2019-08-30 22:20:37.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Display Value.
@param IsValueDisplayed Displays Value column with the Display column */
public void setIsValueDisplayed (boolean IsValueDisplayed)
{
set_Value (COLUMNNAME_IsValueDisplayed, Boolean.valueOf(IsValueDisplayed));
}
/** Get Display Value.
@return Displays Value column with the Display column */
public boolean isValueDisplayed() 
{
Object oo = get_Value(COLUMNNAME_IsValueDisplayed);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="c8e8312c-6a7a-901a-af7f-8d0f7786b7f1")
public static String es_PE_FIELD_TableValidation_DisplayValue_Name="Despliega Valor";

@XendraTrl(Identifier="c8e8312c-6a7a-901a-af7f-8d0f7786b7f1")
public static String es_PE_FIELD_TableValidation_DisplayValue_Description="Despliega la columna valor con la columna despliegue";

@XendraTrl(Identifier="c8e8312c-6a7a-901a-af7f-8d0f7786b7f1")
public static String es_PE_FIELD_TableValidation_DisplayValue_Help="El cuadro de verificación valor de despliegue indica si la columna valor desplegará con la columna despliegue";

@XendraField(AD_Column_ID="IsValueDisplayed",IsCentrallyMaintained=true,
AD_Tab_ID="a000e6d4-f843-c563-4eab-62f6721566ae",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@ValidationType@=T",DisplayLength=1,IsReadOnly=false,SeqNo=70,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="c8e8312c-6a7a-901a-af7f-8d0f7786b7f1")
public static final String FIELDNAME_TableValidation_DisplayValue="c8e8312c-6a7a-901a-af7f-8d0f7786b7f1";

@XendraTrl(Identifier="664d73f3-eb35-bfdb-2424-4f8df5e11b00")
public static String es_PE_COLUMN_IsValueDisplayed_Name="Despliega Valor";

@XendraColumn(AD_Element_ID="768eb605-775c-d8fe-2792-2ca8687f7c8b",ColumnName="IsValueDisplayed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="664d73f3-eb35-bfdb-2424-4f8df5e11b00",
Synchronized="2019-08-30 22:20:37.0")
/** Column name IsValueDisplayed */
public static final String COLUMNNAME_IsValueDisplayed = "IsValueDisplayed";
/** Set Sql ORDER BY.
@param OrderByClause Fully qualified ORDER BY clause */
public void setOrderByClause (String OrderByClause)
{
set_Value (COLUMNNAME_OrderByClause, OrderByClause);
}
/** Get Sql ORDER BY.
@return Fully qualified ORDER BY clause */
public String getOrderByClause() 
{
String value = (String)get_Value(COLUMNNAME_OrderByClause);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="409f2c79-d7d0-b259-8e6b-43ed4dfc606a")
public static String es_PE_FIELD_TableValidation_SqlORDERBY_Name="Cláusula ORDER BY SQL";

@XendraTrl(Identifier="409f2c79-d7d0-b259-8e6b-43ed4dfc606a")
public static String es_PE_FIELD_TableValidation_SqlORDERBY_Description="Cláusula completamente calificada ORDER BY";

@XendraTrl(Identifier="409f2c79-d7d0-b259-8e6b-43ed4dfc606a")
public static String es_PE_FIELD_TableValidation_SqlORDERBY_Help="La cláusula ORDER BY indica la cláusula SQL ORDER BY a usar para la selección del registro";

@XendraField(AD_Column_ID="OrderByClause",IsCentrallyMaintained=true,
AD_Tab_ID="a000e6d4-f843-c563-4eab-62f6721566ae",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@ValidationType@=T",DisplayLength=60,IsReadOnly=false,SeqNo=110,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="409f2c79-d7d0-b259-8e6b-43ed4dfc606a")
public static final String FIELDNAME_TableValidation_SqlORDERBY="409f2c79-d7d0-b259-8e6b-43ed4dfc606a";

@XendraTrl(Identifier="0ce7e1c2-ebb6-dfde-b8e0-5e26539ec3e1")
public static String es_PE_COLUMN_OrderByClause_Name="Cláusula ORDER BY SQL";

@XendraColumn(AD_Element_ID="32eea30b-0ac3-b494-48bb-535e80217e7e",ColumnName="OrderByClause",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0ce7e1c2-ebb6-dfde-b8e0-5e26539ec3e1",
Synchronized="2019-08-30 22:20:37.0")
/** Column name OrderByClause */
public static final String COLUMNNAME_OrderByClause = "OrderByClause";
/** Set Synchronized.
@param Synchronized Synchronized */
public void setSynchronized (Timestamp Synchronized)
{
set_Value (COLUMNNAME_Synchronized, Synchronized);
}
/** Get Synchronized.
@return Synchronized */
public Timestamp getSynchronized() 
{
return (Timestamp)get_Value(COLUMNNAME_Synchronized);
}

@XendraTrl(Identifier="1c0cbd20-76cf-8a06-c036-988f319fbca8")
public static String es_PE_COLUMN_Synchronized_Name="Synchronized";

@XendraColumn(AD_Element_ID="08f1e976-ceeb-f830-9d75-bf94f13a98ce",ColumnName="Synchronized",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1c0cbd20-76cf-8a06-c036-988f319fbca8",
Synchronized="2019-08-30 22:20:37.0")
/** Column name Synchronized */
public static final String COLUMNNAME_Synchronized = "Synchronized";
/** Set Sql WHERE.
@param WhereClause Fully qualified SQL WHERE clause */
public void setWhereClause (String WhereClause)
{
set_Value (COLUMNNAME_WhereClause, WhereClause);
}
/** Get Sql WHERE.
@return Fully qualified SQL WHERE clause */
public String getWhereClause() 
{
String value = (String)get_Value(COLUMNNAME_WhereClause);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="fbf09dc5-f0c9-79e8-5083-605f9e5f2f72")
public static String es_PE_FIELD_TableValidation_SqlWHERE_Name="Cláusula Where SQL";

@XendraTrl(Identifier="fbf09dc5-f0c9-79e8-5083-605f9e5f2f72")
public static String es_PE_FIELD_TableValidation_SqlWHERE_Description="Cláusula WHERE completamente calificada";

@XendraTrl(Identifier="fbf09dc5-f0c9-79e8-5083-605f9e5f2f72")
public static String es_PE_FIELD_TableValidation_SqlWHERE_Help="La cláusula Where indica la cláusula SQL WHERE a usar para la selección del registro";

@XendraField(AD_Column_ID="WhereClause",IsCentrallyMaintained=true,
AD_Tab_ID="a000e6d4-f843-c563-4eab-62f6721566ae",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@ValidationType@=T",DisplayLength=60,IsReadOnly=false,SeqNo=100,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="fbf09dc5-f0c9-79e8-5083-605f9e5f2f72")
public static final String FIELDNAME_TableValidation_SqlWHERE="fbf09dc5-f0c9-79e8-5083-605f9e5f2f72";

@XendraTrl(Identifier="15ea0dba-bbd4-6bfd-c01d-bab491f3ec14")
public static String es_PE_COLUMN_WhereClause_Name="Cláusula Where SQL";

@XendraColumn(AD_Element_ID="7528e2a5-0b7f-8c17-e919-8343497249ca",ColumnName="WhereClause",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="15ea0dba-bbd4-6bfd-c01d-bab491f3ec14",
Synchronized="2019-08-30 22:20:37.0")
/** Column name WhereClause */
public static final String COLUMNNAME_WhereClause = "WhereClause";
}
