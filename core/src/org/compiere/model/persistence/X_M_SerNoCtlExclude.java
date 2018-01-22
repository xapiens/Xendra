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
/** Generated Model for M_SerNoCtlExclude
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_SerNoCtlExclude extends PO
{
/** Standard Constructor
@param ctx context
@param M_SerNoCtlExclude_ID id
@param trxName transaction
*/
public X_M_SerNoCtlExclude (Properties ctx, int M_SerNoCtlExclude_ID, String trxName)
{
super (ctx, M_SerNoCtlExclude_ID, trxName);
/** if (M_SerNoCtlExclude_ID == 0)
{
setAD_Table_ID (0);
setIsSOTrx (false);	
// N
setM_SerNoCtlExclude_ID (0);
setM_SerNoCtl_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_M_SerNoCtlExclude (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=811 */
public static int Table_ID=MTable.getTable_ID("M_SerNoCtlExclude");

@XendraTrl(Identifier="cda46bd7-e72a-cc62-7dcd-e0d6a6666c81")
public static String es_PE_TAB_Exclude_Description="Excluye la capacidad de crear Números de Serie en Ajustar Atributos";

@XendraTrl(Identifier="cda46bd7-e72a-cc62-7dcd-e0d6a6666c81")
public static String es_PE_TAB_Exclude_Name="Excluir";

@XendraTrl(Identifier="cda46bd7-e72a-cc62-7dcd-e0d6a6666c81")
public static String es_PE_TAB_Exclude_Help="Crear un registro, si desea excluir la capacidas de crear Números de Serie en Ajustar Atributos de Producto.Note que la información es almacenada en cache. Para que adquiera valor debe reingresar al sistema o restaurar el cache. ";

@XendraTab(Name="Exclude",
Description="Exclude the ability to create Serial Numbers in Attribute Sets",
Help="Create a record, if you want to exclude the ability to create Serial Numbers in Product Attribute Set information. Note that the information is cached. To have effect you may have to re-login or reset cache.",
AD_Window_ID="15591a4b-721e-18c5-b207-d85d143f88e3",SeqNo=20,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="cda46bd7-e72a-cc62-7dcd-e0d6a6666c81",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Exclude="cda46bd7-e72a-cc62-7dcd-e0d6a6666c81";

@XendraTrl(Identifier="a3f121fb-52df-cdfc-8b7a-4e224a4e6d29")
public static String es_PE_TABLE_M_SerNoCtlExclude_Name="Excluir No Serie";

@XendraTable(Name="Exclude SerNo",
Description="Exclude the ability to create Serial Numbers in Attribute Sets",Help="",
TableName="M_SerNoCtlExclude",AccessLevel="2",AD_Window_ID="15591a4b-721e-18c5-b207-d85d143f88e3",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.material",
Identifier="a3f121fb-52df-cdfc-8b7a-4e224a4e6d29",Synchronized="2017-08-16 11:43:35.0")
/** TableName=M_SerNoCtlExclude */
public static final String Table_Name="M_SerNoCtlExclude";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_SerNoCtlExclude");

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
    Table_ID = MTable.getTable_ID("M_SerNoCtlExclude");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_SerNoCtlExclude[").append(get_ID()).append("]");
return sb.toString();
}
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

@XendraTrl(Identifier="6b92e743-0e56-1d54-1059-c3c5dde607ab")
public static String es_PE_FIELD_Exclude_Table_Description="Tabla para los campos";

@XendraTrl(Identifier="6b92e743-0e56-1d54-1059-c3c5dde607ab")
public static String es_PE_FIELD_Exclude_Table_Help="La Tabla indica una tabla en la que reside un campo ó campos.";

@XendraTrl(Identifier="6b92e743-0e56-1d54-1059-c3c5dde607ab")
public static String es_PE_FIELD_Exclude_Table_Name="Tabla";

@XendraField(AD_Column_ID="AD_Table_ID",IsCentrallyMaintained=true,
AD_Tab_ID="cda46bd7-e72a-cc62-7dcd-e0d6a6666c81",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6b92e743-0e56-1d54-1059-c3c5dde607ab")
public static final String FIELDNAME_Exclude_Table="6b92e743-0e56-1d54-1059-c3c5dde607ab";

@XendraTrl(Identifier="44e00539-a813-8da0-7090-9297d3c399bb")
public static String es_PE_COLUMN_AD_Table_ID_Name="Tabla";

@XendraColumn(AD_Element_ID="270eeb02-723b-0ecc-7f56-3c67fa71a7f1",ColumnName="AD_Table_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="06bca08f-53c7-71de-fdf9-9f713ddda6a4",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=true,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="44e00539-a813-8da0-7090-9297d3c399bb",Synchronized="2017-08-05 16:55:33.0")
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
@XendraTrl(Identifier="f4cf6707-2da4-41c1-b27e-acefd3897072")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f4cf6707-2da4-41c1-b27e-acefd3897072",
Synchronized="2017-08-05 16:55:33.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Sales Transaction.
@param IsSOTrx This is a Sales Transaction */
public void setIsSOTrx (boolean IsSOTrx)
{
set_Value (COLUMNNAME_IsSOTrx, Boolean.valueOf(IsSOTrx));
}
/** Get Sales Transaction.
@return This is a Sales Transaction */
public boolean isSOTrx() 
{
Object oo = get_Value(COLUMNNAME_IsSOTrx);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="09d3301b-3f1c-0d0a-2ad3-1204ef60129f")
public static String es_PE_FIELD_Exclude_SalesTransaction_Description="Esta es una transacción de ventas";

@XendraTrl(Identifier="09d3301b-3f1c-0d0a-2ad3-1204ef60129f")
public static String es_PE_FIELD_Exclude_SalesTransaction_Help="El cuadro de verificación Transacción de Ventas indica si este ítem es una transacción de ventas";

@XendraTrl(Identifier="09d3301b-3f1c-0d0a-2ad3-1204ef60129f")
public static String es_PE_FIELD_Exclude_SalesTransaction_Name="Transacción de Ventas";

@XendraField(AD_Column_ID="IsSOTrx",IsCentrallyMaintained=true,
AD_Tab_ID="cda46bd7-e72a-cc62-7dcd-e0d6a6666c81",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="09d3301b-3f1c-0d0a-2ad3-1204ef60129f")
public static final String FIELDNAME_Exclude_SalesTransaction="09d3301b-3f1c-0d0a-2ad3-1204ef60129f";

@XendraTrl(Identifier="39372bd7-cd97-d3ab-da5f-0e9e583f03c6")
public static String es_PE_COLUMN_IsSOTrx_Name="Transacción de Ventas";

@XendraColumn(AD_Element_ID="4084b69f-a51d-5676-4d8c-395a13e6b2df",ColumnName="IsSOTrx",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="39372bd7-cd97-d3ab-da5f-0e9e583f03c6",
Synchronized="2017-08-05 16:55:33.0")
/** Column name IsSOTrx */
public static final String COLUMNNAME_IsSOTrx = "IsSOTrx";
/** Set Exclude SerNo.
@param M_SerNoCtlExclude_ID Exclude the ability to create Serial Numbers in Attribute Sets */
public void setM_SerNoCtlExclude_ID (int M_SerNoCtlExclude_ID)
{
if (M_SerNoCtlExclude_ID < 1) throw new IllegalArgumentException ("M_SerNoCtlExclude_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_SerNoCtlExclude_ID, Integer.valueOf(M_SerNoCtlExclude_ID));
}
/** Get Exclude SerNo.
@return Exclude the ability to create Serial Numbers in Attribute Sets */
public int getM_SerNoCtlExclude_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_SerNoCtlExclude_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="4c64c937-ace3-978f-e552-88a2cee098b3")
public static String es_PE_FIELD_Exclude_ExcludeSerNo_Description="Excluir la Capacidad de crear Números de Serie en Configurar  Atributos";

@XendraTrl(Identifier="4c64c937-ace3-978f-e552-88a2cee098b3")
public static String es_PE_FIELD_Exclude_ExcludeSerNo_Name="Excluir No Serie";

@XendraField(AD_Column_ID="M_SerNoCtlExclude_ID",IsCentrallyMaintained=true,
AD_Tab_ID="cda46bd7-e72a-cc62-7dcd-e0d6a6666c81",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4c64c937-ace3-978f-e552-88a2cee098b3")
public static final String FIELDNAME_Exclude_ExcludeSerNo="4c64c937-ace3-978f-e552-88a2cee098b3";
/** Column name M_SerNoCtlExclude_ID */
public static final String COLUMNNAME_M_SerNoCtlExclude_ID = "M_SerNoCtlExclude_ID";
/** Set Serial No Control.
@param M_SerNoCtl_ID Product Serial Number Control */
public void setM_SerNoCtl_ID (int M_SerNoCtl_ID)
{
if (M_SerNoCtl_ID < 1) throw new IllegalArgumentException ("M_SerNoCtl_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_SerNoCtl_ID, Integer.valueOf(M_SerNoCtl_ID));
}
/** Get Serial No Control.
@return Product Serial Number Control */
public int getM_SerNoCtl_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_SerNoCtl_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="30bf0f04-341d-3d35-b929-f142f031bbcf")
public static String es_PE_FIELD_Exclude_SerialNoControl_Description="Control de número de serie del producto";

@XendraTrl(Identifier="30bf0f04-341d-3d35-b929-f142f031bbcf")
public static String es_PE_FIELD_Exclude_SerialNoControl_Help="Definición para crear numero de serie de productos.";

@XendraTrl(Identifier="30bf0f04-341d-3d35-b929-f142f031bbcf")
public static String es_PE_FIELD_Exclude_SerialNoControl_Name="Control de numero de Serie";

@XendraField(AD_Column_ID="M_SerNoCtl_ID",IsCentrallyMaintained=true,
AD_Tab_ID="cda46bd7-e72a-cc62-7dcd-e0d6a6666c81",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="30bf0f04-341d-3d35-b929-f142f031bbcf")
public static final String FIELDNAME_Exclude_SerialNoControl="30bf0f04-341d-3d35-b929-f142f031bbcf";

@XendraTrl(Identifier="5caadf96-8300-b58f-d5ab-8d9c5ed7409e")
public static String es_PE_COLUMN_M_SerNoCtl_ID_Name="Control de numero de Serie";

@XendraColumn(AD_Element_ID="0b84081b-2d0d-634a-535c-abb7dfc54cc8",ColumnName="M_SerNoCtl_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5caadf96-8300-b58f-d5ab-8d9c5ed7409e",
Synchronized="2017-08-05 16:55:34.0")
/** Column name M_SerNoCtl_ID */
public static final String COLUMNNAME_M_SerNoCtl_ID = "M_SerNoCtl_ID";
}
