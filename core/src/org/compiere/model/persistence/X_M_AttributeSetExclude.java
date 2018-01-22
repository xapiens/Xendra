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
/** Generated Model for M_AttributeSetExclude
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_AttributeSetExclude extends PO
{
/** Standard Constructor
@param ctx context
@param M_AttributeSetExclude_ID id
@param trxName transaction
*/
public X_M_AttributeSetExclude (Properties ctx, int M_AttributeSetExclude_ID, String trxName)
{
super (ctx, M_AttributeSetExclude_ID, trxName);
/** if (M_AttributeSetExclude_ID == 0)
{
setAD_Table_ID (0);
setIsSOTrx (false);	
// N
setM_AttributeSetExclude_ID (0);
setM_AttributeSet_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_M_AttributeSetExclude (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=809 */
public static int Table_ID=MTable.getTable_ID("M_AttributeSetExclude");

@XendraTrl(Identifier="72dad031-5b8a-a899-b14e-c0288550373e")
public static String es_PE_TAB_Exclude_Description="Excluye la capacidad de ingresar Ajustes en los Atributos";

@XendraTrl(Identifier="72dad031-5b8a-a899-b14e-c0288550373e")
public static String es_PE_TAB_Exclude_Name="Excluir";

@XendraTrl(Identifier="72dad031-5b8a-a899-b14e-c0288550373e")
public static String es_PE_TAB_Exclude_Help="Crear un registro. si desea excluir la capacidad de ingresar Información en Ajustes Atributos de Producto.Note que la información es almacenada. Para que los cambios sean considerados debe re-ingresar o restaurar el cache. ";

@XendraTab(Name="Exclude",Description="Exclude the ability to enter Attribute Sets",
Help="Create a record, if you want to exclude the ability to enter Product Attribute Set information.  Note that the information is cached. To have effect you may have to re-login or reset cache.",
AD_Window_ID="c776058b-1056-0bc4-3e42-f91c200f5ade",SeqNo=30,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="72dad031-5b8a-a899-b14e-c0288550373e",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Exclude="72dad031-5b8a-a899-b14e-c0288550373e";

@XendraTrl(Identifier="c3cd5860-f5f8-20ad-b9f0-60a6df4a6a18")
public static String es_PE_TABLE_M_AttributeSetExclude_Name="Excluir Configuración de Atributos";


@XendraTable(Name="Exclude Attribute Set",
Description="Exclude the ability to enter Attribute Sets",Help="",
TableName="M_AttributeSetExclude",AccessLevel="2",
AD_Window_ID="c776058b-1056-0bc4-3e42-f91c200f5ade",AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.material",Identifier="c3cd5860-f5f8-20ad-b9f0-60a6df4a6a18",
Synchronized="2017-08-16 11:43:06.0")
/** TableName=M_AttributeSetExclude */
public static final String Table_Name="M_AttributeSetExclude";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_AttributeSetExclude");

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
    Table_ID = MTable.getTable_ID("M_AttributeSetExclude");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_AttributeSetExclude[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="ccf8f465-a44b-bd88-dc05-847120d1ce9d")
public static String es_PE_FIELD_Exclude_Table_Description="Tabla para los campos";

@XendraTrl(Identifier="ccf8f465-a44b-bd88-dc05-847120d1ce9d")
public static String es_PE_FIELD_Exclude_Table_Help="La Tabla indica una tabla en la que reside un campo ó campos.";

@XendraTrl(Identifier="ccf8f465-a44b-bd88-dc05-847120d1ce9d")
public static String es_PE_FIELD_Exclude_Table_Name="Tabla";

@XendraField(AD_Column_ID="AD_Table_ID",IsCentrallyMaintained=true,
AD_Tab_ID="72dad031-5b8a-a899-b14e-c0288550373e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ccf8f465-a44b-bd88-dc05-847120d1ce9d")
public static final String FIELDNAME_Exclude_Table="ccf8f465-a44b-bd88-dc05-847120d1ce9d";

@XendraTrl(Identifier="73d07323-2c5b-5ee2-a853-d107e7acd73f")
public static String es_PE_COLUMN_AD_Table_ID_Name="Tabla";

@XendraColumn(AD_Element_ID="270eeb02-723b-0ecc-7f56-3c67fa71a7f1",ColumnName="AD_Table_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="06bca08f-53c7-71de-fdf9-9f713ddda6a4",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=true,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="73d07323-2c5b-5ee2-a853-d107e7acd73f",Synchronized="2017-08-05 16:55:00.0")
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
@XendraTrl(Identifier="87c69c21-122c-4fc6-8a5a-516c80c8d1a5")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="87c69c21-122c-4fc6-8a5a-516c80c8d1a5",
Synchronized="2017-08-05 16:55:00.0")
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

@XendraTrl(Identifier="38f3d18b-5aa9-9ad6-fd03-bb224301f205")
public static String es_PE_FIELD_Exclude_SalesTransaction_Description="Esta es una transacción de ventas";

@XendraTrl(Identifier="38f3d18b-5aa9-9ad6-fd03-bb224301f205")
public static String es_PE_FIELD_Exclude_SalesTransaction_Help="El cuadro de verificación Transacción de Ventas indica si este ítem es una transacción de ventas";

@XendraTrl(Identifier="38f3d18b-5aa9-9ad6-fd03-bb224301f205")
public static String es_PE_FIELD_Exclude_SalesTransaction_Name="Transacción de Ventas";

@XendraField(AD_Column_ID="IsSOTrx",IsCentrallyMaintained=true,
AD_Tab_ID="72dad031-5b8a-a899-b14e-c0288550373e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="38f3d18b-5aa9-9ad6-fd03-bb224301f205")
public static final String FIELDNAME_Exclude_SalesTransaction="38f3d18b-5aa9-9ad6-fd03-bb224301f205";

@XendraTrl(Identifier="2166a31c-f58a-f45f-6ce3-0c37342134a0")
public static String es_PE_COLUMN_IsSOTrx_Name="Transacción de Ventas";

@XendraColumn(AD_Element_ID="4084b69f-a51d-5676-4d8c-395a13e6b2df",ColumnName="IsSOTrx",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2166a31c-f58a-f45f-6ce3-0c37342134a0",
Synchronized="2017-08-05 16:55:00.0")
/** Column name IsSOTrx */
public static final String COLUMNNAME_IsSOTrx = "IsSOTrx";
/** Set Exclude Attribute Set.
@param M_AttributeSetExclude_ID Exclude the ability to enter Attribute Sets */
public void setM_AttributeSetExclude_ID (int M_AttributeSetExclude_ID)
{
if (M_AttributeSetExclude_ID < 1) throw new IllegalArgumentException ("M_AttributeSetExclude_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_AttributeSetExclude_ID, Integer.valueOf(M_AttributeSetExclude_ID));
}
/** Get Exclude Attribute Set.
@return Exclude the ability to enter Attribute Sets */
public int getM_AttributeSetExclude_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_AttributeSetExclude_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="231f2bca-8779-3988-0c41-0f4cabee0640")
public static String es_PE_FIELD_Exclude_ExcludeAttributeSet_Description="Excluir capacidad de Ingresar configuraciones en los atributos";

@XendraTrl(Identifier="231f2bca-8779-3988-0c41-0f4cabee0640")
public static String es_PE_FIELD_Exclude_ExcludeAttributeSet_Name="Excluir Configuración de Atributos";

@XendraField(AD_Column_ID="M_AttributeSetExclude_ID",IsCentrallyMaintained=true,
AD_Tab_ID="72dad031-5b8a-a899-b14e-c0288550373e",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="231f2bca-8779-3988-0c41-0f4cabee0640")
public static final String FIELDNAME_Exclude_ExcludeAttributeSet="231f2bca-8779-3988-0c41-0f4cabee0640";
/** Column name M_AttributeSetExclude_ID */
public static final String COLUMNNAME_M_AttributeSetExclude_ID = "M_AttributeSetExclude_ID";
/** Set Attribute Set.
@param M_AttributeSet_ID Product Attribute Set */
public void setM_AttributeSet_ID (int M_AttributeSet_ID)
{
if (M_AttributeSet_ID < 0) throw new IllegalArgumentException ("M_AttributeSet_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_AttributeSet_ID, Integer.valueOf(M_AttributeSet_ID));
}
/** Get Attribute Set.
@return Product Attribute Set */
public int getM_AttributeSet_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_AttributeSet_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="a5cb954f-248a-f8f2-a63a-3bd6fbdaca70")
public static String es_PE_FIELD_Exclude_AttributeSet_Description="Conjunto de Atributos de Producto";

@XendraTrl(Identifier="a5cb954f-248a-f8f2-a63a-3bd6fbdaca70")
public static String es_PE_FIELD_Exclude_AttributeSet_Help="Defina los sistemas de la cualidad de producto para agregar cualidades y valores adicionales al producto. Usted necesita definir una cualidad fijada si desea seguir el número de conteo por entregas y de porción.";

@XendraTrl(Identifier="a5cb954f-248a-f8f2-a63a-3bd6fbdaca70")
public static String es_PE_FIELD_Exclude_AttributeSet_Name="Conjunto de Atributos";

@XendraField(AD_Column_ID="M_AttributeSet_ID",IsCentrallyMaintained=true,
AD_Tab_ID="72dad031-5b8a-a899-b14e-c0288550373e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a5cb954f-248a-f8f2-a63a-3bd6fbdaca70")
public static final String FIELDNAME_Exclude_AttributeSet="a5cb954f-248a-f8f2-a63a-3bd6fbdaca70";

@XendraTrl(Identifier="878c5fc6-9e19-0394-ea2d-7d4bf4274cd6")
public static String es_PE_COLUMN_M_AttributeSet_ID_Name="Conjunto de Atributos";

@XendraColumn(AD_Element_ID="8debe7a4-548a-6126-d8aa-196f184678c2",ColumnName="M_AttributeSet_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="878c5fc6-9e19-0394-ea2d-7d4bf4274cd6",
Synchronized="2017-08-05 16:55:00.0")
/** Column name M_AttributeSet_ID */
public static final String COLUMNNAME_M_AttributeSet_ID = "M_AttributeSet_ID";
}
