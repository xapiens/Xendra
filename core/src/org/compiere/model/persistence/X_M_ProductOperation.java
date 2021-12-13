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
/** Generated Model for M_ProductOperation
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_ProductOperation extends PO
{
/** Standard Constructor
@param ctx context
@param M_ProductOperation_ID id
@param trxName transaction
*/
public X_M_ProductOperation (Properties ctx, int M_ProductOperation_ID, String trxName)
{
super (ctx, M_ProductOperation_ID, trxName);
/** if (M_ProductOperation_ID == 0)
{
setM_Product_ID (0);
setM_ProductOperation_ID (0);
setName (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_M_ProductOperation (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=796 */
public static int Table_ID=MTable.getTable_ID("M_ProductOperation");

@XendraTrl(Identifier="4910ba7e-6c87-9fb8-e99b-b8a1811453e9")
public static String es_PE_TAB_Operation_Description="Operación de manufactura del producto";

@XendraTrl(Identifier="4910ba7e-6c87-9fb8-e99b-b8a1811453e9")
public static String es_PE_TAB_Operation_Help="Las operaciones para crear el producto. Observe que las operaciones y las secuencias usadas reales son determinadas por la LDM del producto.";

@XendraTrl(Identifier="4910ba7e-6c87-9fb8-e99b-b8a1811453e9")
public static String es_PE_TAB_Operation_Name="Operación";
@XendraTab(Name="Operation",
Description="Product Manufacturing Operation",
Help="The Operations to create the product.  Note that the actual used operation and sequence is determined by the BOM Product.",
AD_Window_ID="19c8d953-bce9-f34c-e702-5d8e285fb49d",SeqNo=30,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="4910ba7e-6c87-9fb8-e99b-b8a1811453e9",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Operation="4910ba7e-6c87-9fb8-e99b-b8a1811453e9";

@XendraTrl(Identifier="458721b8-b699-853e-d843-91aa7bca2340")
public static String es_PE_TABLE_M_ProductOperation_Name="Operación del Producto";

@XendraTable(Name="Product Operation",AD_Package_ID="2809ac2d-7d43-20f8-05f0-a478f2e50204",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="M_ProductOperation",AccessLevel="3",AD_Window_ID="19c8d953-bce9-f34c-e702-5d8e285fb49d",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=140,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.material",
Identifier="458721b8-b699-853e-d843-91aa7bca2340",Synchronized="2020-03-03 21:38:52.0")
/** TableName=M_ProductOperation */
public static final String Table_Name="M_ProductOperation";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_ProductOperation");

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
    Table_ID = MTable.getTable_ID("M_ProductOperation");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_ProductOperation[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="d71955dd-8486-a3ce-80cd-eac29e71f045")
public static String es_PE_FIELD_Operation_Description_Name="Observación";

@XendraTrl(Identifier="d71955dd-8486-a3ce-80cd-eac29e71f045")
public static String es_PE_FIELD_Operation_Description_Description="Observación";

@XendraTrl(Identifier="d71955dd-8486-a3ce-80cd-eac29e71f045")
public static String es_PE_FIELD_Operation_Description_Help="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="4910ba7e-6c87-9fb8-e99b-b8a1811453e9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d71955dd-8486-a3ce-80cd-eac29e71f045")
public static final String FIELDNAME_Operation_Description="d71955dd-8486-a3ce-80cd-eac29e71f045";

@XendraTrl(Identifier="afc08522-de73-cdb0-f4c6-d9720c88c520")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="afc08522-de73-cdb0-f4c6-d9720c88c520",
Synchronized="2019-08-30 22:23:28.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Comment/Help.
@param Help Comment or Hint */
public void setHelp (String Help)
{
set_Value (COLUMNNAME_Help, Help);
}
/** Get Comment/Help.
@return Comment or Hint */
public String getHelp() 
{
String value = (String)get_Value(COLUMNNAME_Help);
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

@XendraTrl(Identifier="59927f8c-ddc2-edf6-270a-0dafc7e6c0e5")
public static String es_PE_FIELD_Operation_CommentHelp_Name="Ayuda";

@XendraTrl(Identifier="59927f8c-ddc2-edf6-270a-0dafc7e6c0e5")
public static String es_PE_FIELD_Operation_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="59927f8c-ddc2-edf6-270a-0dafc7e6c0e5")
public static String es_PE_FIELD_Operation_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraField(AD_Column_ID="Help",IsCentrallyMaintained=true,
AD_Tab_ID="4910ba7e-6c87-9fb8-e99b-b8a1811453e9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="59927f8c-ddc2-edf6-270a-0dafc7e6c0e5")
public static final String FIELDNAME_Operation_CommentHelp="59927f8c-ddc2-edf6-270a-0dafc7e6c0e5";

@XendraTrl(Identifier="41b5ba90-829c-ac77-48fa-af87838ee6e9")
public static String es_PE_COLUMN_Help_Name="Ayuda";

@XendraColumn(AD_Element_ID="a6fda582-56f9-6bb7-8436-285ce4f8de3f",ColumnName="Help",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="41b5ba90-829c-ac77-48fa-af87838ee6e9",
Synchronized="2019-08-30 22:23:28.0")
/** Column name Help */
public static final String COLUMNNAME_Help = "Help";
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
@XendraTrl(Identifier="a4ca353b-1a5c-4083-8e6c-f42f86a9376f")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a4ca353b-1a5c-4083-8e6c-f42f86a9376f",
Synchronized="2019-08-30 22:23:28.0")
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

@XendraTrl(Identifier="f66e5228-7a0d-7805-d103-2675bd4a9a08")
public static String es_PE_FIELD_Operation_Product_Name="Producto";

@XendraTrl(Identifier="f66e5228-7a0d-7805-d103-2675bd4a9a08")
public static String es_PE_FIELD_Operation_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="f66e5228-7a0d-7805-d103-2675bd4a9a08")
public static String es_PE_FIELD_Operation_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="4910ba7e-6c87-9fb8-e99b-b8a1811453e9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f66e5228-7a0d-7805-d103-2675bd4a9a08")
public static final String FIELDNAME_Operation_Product="f66e5228-7a0d-7805-d103-2675bd4a9a08";

@XendraTrl(Identifier="32fb9c0b-93a4-764b-04db-3753bb7f1565")
public static String es_PE_COLUMN_M_Product_ID_Name="Producto";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="4281f8eb-238e-6b28-eb66-8cc866e6312c",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="32fb9c0b-93a4-764b-04db-3753bb7f1565",Synchronized="2019-08-30 22:23:28.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
/** Set Product Operation.
@param M_ProductOperation_ID Product Manufacturing Operation */
public void setM_ProductOperation_ID (int M_ProductOperation_ID)
{
if (M_ProductOperation_ID < 1) throw new IllegalArgumentException ("M_ProductOperation_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_ProductOperation_ID, Integer.valueOf(M_ProductOperation_ID));
}
/** Get Product Operation.
@return Product Manufacturing Operation */
public int getM_ProductOperation_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_ProductOperation_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d9e915f1-496d-bd28-5ef8-62fe1c639710")
public static String es_PE_FIELD_Operation_ProductOperation_Name="Operación del Producto";

@XendraTrl(Identifier="d9e915f1-496d-bd28-5ef8-62fe1c639710")
public static String es_PE_FIELD_Operation_ProductOperation_Description="Operación de manufactura del producto";

@XendraTrl(Identifier="d9e915f1-496d-bd28-5ef8-62fe1c639710")
public static String es_PE_FIELD_Operation_ProductOperation_Help="La operación para crear el producto. Note que el actual uso y operación de secuencia es determinado por la LDM del producto.";

@XendraField(AD_Column_ID="M_ProductOperation_ID",IsCentrallyMaintained=true,
AD_Tab_ID="4910ba7e-6c87-9fb8-e99b-b8a1811453e9",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d9e915f1-496d-bd28-5ef8-62fe1c639710")
public static final String FIELDNAME_Operation_ProductOperation="d9e915f1-496d-bd28-5ef8-62fe1c639710";
/** Column name M_ProductOperation_ID */
public static final String COLUMNNAME_M_ProductOperation_ID = "M_ProductOperation_ID";
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

@XendraTrl(Identifier="0620f6da-aafc-4c34-e464-1d7da820ed45")
public static String es_PE_FIELD_Operation_Name_Name="Nombre";

@XendraTrl(Identifier="0620f6da-aafc-4c34-e464-1d7da820ed45")
public static String es_PE_FIELD_Operation_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="0620f6da-aafc-4c34-e464-1d7da820ed45")
public static String es_PE_FIELD_Operation_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="4910ba7e-6c87-9fb8-e99b-b8a1811453e9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0620f6da-aafc-4c34-e464-1d7da820ed45")
public static final String FIELDNAME_Operation_Name="0620f6da-aafc-4c34-e464-1d7da820ed45";

@XendraTrl(Identifier="8e29fcd6-d510-381c-c22e-4a17bc68bd8b")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8e29fcd6-d510-381c-c22e-4a17bc68bd8b",
Synchronized="2019-08-30 22:23:28.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Setup Time.
@param SetupTime Setup time before starting Production */
public void setSetupTime (BigDecimal SetupTime)
{
set_Value (COLUMNNAME_SetupTime, SetupTime);
}
/** Get Setup Time.
@return Setup time before starting Production */
public BigDecimal getSetupTime() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_SetupTime);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="1af51d04-e11c-dce3-b1cb-bc47cf7af836")
public static String es_PE_FIELD_Operation_SetupTime_Name="Tiempo por lote";

@XendraTrl(Identifier="1af51d04-e11c-dce3-b1cb-bc47cf7af836")
public static String es_PE_FIELD_Operation_SetupTime_Description="Tiempo requerido para producir un lote en la operación";

@XendraField(AD_Column_ID="SetupTime",IsCentrallyMaintained=true,
AD_Tab_ID="4910ba7e-6c87-9fb8-e99b-b8a1811453e9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1af51d04-e11c-dce3-b1cb-bc47cf7af836")
public static final String FIELDNAME_Operation_SetupTime="1af51d04-e11c-dce3-b1cb-bc47cf7af836";

@XendraTrl(Identifier="e72ad578-1b39-1769-890b-6249bf6ab797")
public static String es_PE_COLUMN_SetupTime_Name="Tiempo por lote";

@XendraColumn(AD_Element_ID="a4a9a3ef-8759-dcb2-f229-535e609f1fed",ColumnName="SetupTime",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e72ad578-1b39-1769-890b-6249bf6ab797",
Synchronized="2019-08-30 22:23:28.0")
/** Column name SetupTime */
public static final String COLUMNNAME_SetupTime = "SetupTime";
/** Set Teardown Time.
@param TeardownTime Time at the end of the operation */
public void setTeardownTime (BigDecimal TeardownTime)
{
set_Value (COLUMNNAME_TeardownTime, TeardownTime);
}
/** Get Teardown Time.
@return Time at the end of the operation */
public BigDecimal getTeardownTime() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_TeardownTime);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="f374a011-2df7-4783-b113-526c78ed6bd9")
public static String es_PE_FIELD_Operation_TeardownTime_Name="Tiempo de Desmontaje";

@XendraTrl(Identifier="f374a011-2df7-4783-b113-526c78ed6bd9")
public static String es_PE_FIELD_Operation_TeardownTime_Description="Tiempo de final de operaciones";

@XendraTrl(Identifier="f374a011-2df7-4783-b113-526c78ed6bd9")
public static String es_PE_FIELD_Operation_TeardownTime_Help="Tiempo muerto de operaciones";

@XendraField(AD_Column_ID="TeardownTime",IsCentrallyMaintained=true,
AD_Tab_ID="4910ba7e-6c87-9fb8-e99b-b8a1811453e9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f374a011-2df7-4783-b113-526c78ed6bd9")
public static final String FIELDNAME_Operation_TeardownTime="f374a011-2df7-4783-b113-526c78ed6bd9";

@XendraTrl(Identifier="a21fc484-9039-8eeb-7871-312512dd9284")
public static String es_PE_COLUMN_TeardownTime_Name="Tiempo de Desmontaje";

@XendraColumn(AD_Element_ID="5151cda7-dd8d-eb5a-c132-3653bff993f4",ColumnName="TeardownTime",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a21fc484-9039-8eeb-7871-312512dd9284",
Synchronized="2019-08-30 22:23:28.0")
/** Column name TeardownTime */
public static final String COLUMNNAME_TeardownTime = "TeardownTime";
/** Set Runtime per Unit.
@param UnitRuntime Time to produce one unit */
public void setUnitRuntime (BigDecimal UnitRuntime)
{
set_Value (COLUMNNAME_UnitRuntime, UnitRuntime);
}
/** Get Runtime per Unit.
@return Time to produce one unit */
public BigDecimal getUnitRuntime() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_UnitRuntime);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="19f4efce-1f16-43bd-631f-cbfb9aa1a495")
public static String es_PE_FIELD_Operation_RuntimePerUnit_Name="Tiempo de Corrida por Unidad";

@XendraTrl(Identifier="19f4efce-1f16-43bd-631f-cbfb9aa1a495")
public static String es_PE_FIELD_Operation_RuntimePerUnit_Description="Tiempo de corrida para producir una unidad";

@XendraField(AD_Column_ID="UnitRuntime",IsCentrallyMaintained=true,
AD_Tab_ID="4910ba7e-6c87-9fb8-e99b-b8a1811453e9",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="19f4efce-1f16-43bd-631f-cbfb9aa1a495")
public static final String FIELDNAME_Operation_RuntimePerUnit="19f4efce-1f16-43bd-631f-cbfb9aa1a495";

@XendraTrl(Identifier="f5501824-d84e-8937-7d9f-b66f94c380e1")
public static String es_PE_COLUMN_UnitRuntime_Name="Tiempo de Corrida por Unidad";

@XendraColumn(AD_Element_ID="1ac087b3-1c73-dc7b-442d-b951f640621b",ColumnName="UnitRuntime",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f5501824-d84e-8937-7d9f-b66f94c380e1",
Synchronized="2019-08-30 22:23:28.0")
/** Column name UnitRuntime */
public static final String COLUMNNAME_UnitRuntime = "UnitRuntime";
}
