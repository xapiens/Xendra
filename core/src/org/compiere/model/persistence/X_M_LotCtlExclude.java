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
/** Generated Model for M_LotCtlExclude
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_LotCtlExclude extends PO
{
/** Standard Constructor
@param ctx context
@param M_LotCtlExclude_ID id
@param trxName transaction
*/
public X_M_LotCtlExclude (Properties ctx, int M_LotCtlExclude_ID, String trxName)
{
super (ctx, M_LotCtlExclude_ID, trxName);
/** if (M_LotCtlExclude_ID == 0)
{
setAD_Table_ID (0);
setIsSOTrx (false);	
// N
setM_LotCtlExclude_ID (0);
setM_LotCtl_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_M_LotCtlExclude (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=810 */
public static int Table_ID=MTable.getTable_ID("M_LotCtlExclude");

@XendraTrl(Identifier="170a3ed5-fa75-2603-28dd-785188c621a1")
public static String es_PE_TAB_Exclude_Description="Excluir capacidad de crear Lotes en Ajustar Atributos";

@XendraTrl(Identifier="170a3ed5-fa75-2603-28dd-785188c621a1")
public static String es_PE_TAB_Exclude_Name="Excluir";

@XendraTrl(Identifier="170a3ed5-fa75-2603-28dd-785188c621a1")
public static String es_PE_TAB_Exclude_Help="Crear un registro, si desea excluir capacidad de crear lotes en Información Ajustar Atributo de Producto Note que la información es alamacenada. Para que tenga efecto debe ingresar nuevamente al sistema o reiniciar el caché.";

@XendraTab(Name="Exclude",Description="Exclude the ability to create Lots in Attribute Sets",
Help="Create a record, if you want to exclude the ability to create Lots in Product Attribute Set information. Note that the information is cached. To have effect you may have to re-login or reset cache.",
AD_Window_ID="8e36c673-4582-effe-d6a4-d690c65293bb",SeqNo=20,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="170a3ed5-fa75-2603-28dd-785188c621a1",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Exclude="170a3ed5-fa75-2603-28dd-785188c621a1";

@XendraTrl(Identifier="9f42c2f9-7fdd-f677-9e02-401ca8e5fa4a")
public static String es_PE_TABLE_M_LotCtlExclude_Name="Exclur Lote";

@XendraTable(Name="Exclude Lot",Description="Exclude the ability to create Lots in Attribute Sets",
Help="",TableName="M_LotCtlExclude",AccessLevel="2",
AD_Window_ID="8e36c673-4582-effe-d6a4-d690c65293bb",AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.material",Identifier="9f42c2f9-7fdd-f677-9e02-401ca8e5fa4a",
Synchronized="2017-08-16 11:43:19.0")
/** TableName=M_LotCtlExclude */
public static final String Table_Name="M_LotCtlExclude";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_LotCtlExclude");

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
    Table_ID = MTable.getTable_ID("M_LotCtlExclude");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_LotCtlExclude[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="b06d2ed7-26bf-97c4-2de5-c484d08539dd")
public static String es_PE_FIELD_Exclude_Table_Description="Tabla para los campos";

@XendraTrl(Identifier="b06d2ed7-26bf-97c4-2de5-c484d08539dd")
public static String es_PE_FIELD_Exclude_Table_Help="La Tabla indica una tabla en la que reside un campo ó campos.";

@XendraTrl(Identifier="b06d2ed7-26bf-97c4-2de5-c484d08539dd")
public static String es_PE_FIELD_Exclude_Table_Name="Tabla";

@XendraField(AD_Column_ID="AD_Table_ID",IsCentrallyMaintained=true,
AD_Tab_ID="170a3ed5-fa75-2603-28dd-785188c621a1",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b06d2ed7-26bf-97c4-2de5-c484d08539dd")
public static final String FIELDNAME_Exclude_Table="b06d2ed7-26bf-97c4-2de5-c484d08539dd";

@XendraTrl(Identifier="74c46d7f-b39b-15c2-6c2b-8a0ed1863e1c")
public static String es_PE_COLUMN_AD_Table_ID_Name="Tabla";

@XendraColumn(AD_Element_ID="270eeb02-723b-0ecc-7f56-3c67fa71a7f1",ColumnName="AD_Table_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="06bca08f-53c7-71de-fdf9-9f713ddda6a4",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=true,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="74c46d7f-b39b-15c2-6c2b-8a0ed1863e1c",Synchronized="2017-08-05 16:55:14.0")
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
@XendraTrl(Identifier="b1f0207a-682f-4ab2-9b1d-08acdba0ad66")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b1f0207a-682f-4ab2-9b1d-08acdba0ad66",
Synchronized="2017-08-05 16:55:14.0")
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

@XendraTrl(Identifier="3d12bffe-97a8-4b09-eefd-39d2360318fa")
public static String es_PE_FIELD_Exclude_SalesTransaction_Description="Esta es una transacción de ventas";

@XendraTrl(Identifier="3d12bffe-97a8-4b09-eefd-39d2360318fa")
public static String es_PE_FIELD_Exclude_SalesTransaction_Help="El cuadro de verificación Transacción de Ventas indica si este ítem es una transacción de ventas";

@XendraTrl(Identifier="3d12bffe-97a8-4b09-eefd-39d2360318fa")
public static String es_PE_FIELD_Exclude_SalesTransaction_Name="Transacción de Ventas";

@XendraField(AD_Column_ID="IsSOTrx",IsCentrallyMaintained=true,
AD_Tab_ID="170a3ed5-fa75-2603-28dd-785188c621a1",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3d12bffe-97a8-4b09-eefd-39d2360318fa")
public static final String FIELDNAME_Exclude_SalesTransaction="3d12bffe-97a8-4b09-eefd-39d2360318fa";

@XendraTrl(Identifier="06145459-8bf7-7653-51bc-5abd0ba916af")
public static String es_PE_COLUMN_IsSOTrx_Name="Transacción de Ventas";

@XendraColumn(AD_Element_ID="4084b69f-a51d-5676-4d8c-395a13e6b2df",ColumnName="IsSOTrx",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="06145459-8bf7-7653-51bc-5abd0ba916af",
Synchronized="2017-08-05 16:55:14.0")
/** Column name IsSOTrx */
public static final String COLUMNNAME_IsSOTrx = "IsSOTrx";
/** Set Exclude Lot.
@param M_LotCtlExclude_ID Exclude the ability to create Lots in Attribute Sets */
public void setM_LotCtlExclude_ID (int M_LotCtlExclude_ID)
{
if (M_LotCtlExclude_ID < 1) throw new IllegalArgumentException ("M_LotCtlExclude_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_LotCtlExclude_ID, Integer.valueOf(M_LotCtlExclude_ID));
}
/** Get Exclude Lot.
@return Exclude the ability to create Lots in Attribute Sets */
public int getM_LotCtlExclude_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_LotCtlExclude_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="2ec776c8-378e-32b6-45f6-3dcc55acefc1")
public static String es_PE_FIELD_Exclude_ExcludeLot_Description="Excluir la capacidad de crear Lotes en Configurar Atributos";

@XendraTrl(Identifier="2ec776c8-378e-32b6-45f6-3dcc55acefc1")
public static String es_PE_FIELD_Exclude_ExcludeLot_Name="Exclur Lote";

@XendraField(AD_Column_ID="M_LotCtlExclude_ID",IsCentrallyMaintained=true,
AD_Tab_ID="170a3ed5-fa75-2603-28dd-785188c621a1",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2ec776c8-378e-32b6-45f6-3dcc55acefc1")
public static final String FIELDNAME_Exclude_ExcludeLot="2ec776c8-378e-32b6-45f6-3dcc55acefc1";
/** Column name M_LotCtlExclude_ID */
public static final String COLUMNNAME_M_LotCtlExclude_ID = "M_LotCtlExclude_ID";
/** Set Lot Control.
@param M_LotCtl_ID Product Lot Control */
public void setM_LotCtl_ID (int M_LotCtl_ID)
{
if (M_LotCtl_ID < 1) throw new IllegalArgumentException ("M_LotCtl_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_LotCtl_ID, Integer.valueOf(M_LotCtl_ID));
}
/** Get Lot Control.
@return Product Lot Control */
public int getM_LotCtl_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_LotCtl_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="1cf7d1f8-afcc-736b-4f63-5a1dfa9983e9")
public static String es_PE_FIELD_Exclude_LotControl_Description="Control del lote del producto";

@XendraTrl(Identifier="1cf7d1f8-afcc-736b-4f63-5a1dfa9983e9")
public static String es_PE_FIELD_Exclude_LotControl_Help="Definición para crear los números de lote para los productos";

@XendraTrl(Identifier="1cf7d1f8-afcc-736b-4f63-5a1dfa9983e9")
public static String es_PE_FIELD_Exclude_LotControl_Name="Control de Lote";

@XendraField(AD_Column_ID="M_LotCtl_ID",IsCentrallyMaintained=true,
AD_Tab_ID="170a3ed5-fa75-2603-28dd-785188c621a1",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1cf7d1f8-afcc-736b-4f63-5a1dfa9983e9")
public static final String FIELDNAME_Exclude_LotControl="1cf7d1f8-afcc-736b-4f63-5a1dfa9983e9";

@XendraTrl(Identifier="7388dd53-7a4e-32ed-c964-e236ea49b916")
public static String es_PE_COLUMN_M_LotCtl_ID_Name="Control de Lote";

@XendraColumn(AD_Element_ID="6a406977-cd64-deed-60f0-660eddec6189",ColumnName="M_LotCtl_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7388dd53-7a4e-32ed-c964-e236ea49b916",
Synchronized="2017-08-05 16:55:14.0")
/** Column name M_LotCtl_ID */
public static final String COLUMNNAME_M_LotCtl_ID = "M_LotCtl_ID";
}
