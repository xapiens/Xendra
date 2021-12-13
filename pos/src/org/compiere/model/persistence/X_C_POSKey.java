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
/** Generated Model for C_POSKey
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: X_C_POSKey.java 7157 2020-03-11 05:24:14Z xapiens $ */
public class X_C_POSKey extends PO
{
/** Standard Constructor
@param ctx context
@param C_POSKey_ID id
@param trxName transaction
*/
public X_C_POSKey (Properties ctx, int C_POSKey_ID, String trxName)
{
super (ctx, C_POSKey_ID, trxName);
/** if (C_POSKey_ID == 0)
{
setC_POSKey_ID (0);
setC_POSKeyLayout_ID (0);
setM_Product_ID (0);
setName (null);
setQty (Env.ZERO);
setSeqNo (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_POSKey (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=750 */
public static int Table_ID=MTable.getTable_ID("C_POSKey");

@XendraTrl(Identifier="8b439dfc-749f-1daa-f860-bd1ce6a112b1")
public static String es_PE_TAB_POSKey_Description="POS Función de llave";

@XendraTrl(Identifier="8b439dfc-749f-1daa-f860-bd1ce6a112b1")
public static String es_PE_TAB_POSKey_Help="POS Función de la llave de asignación";

@XendraTrl(Identifier="8b439dfc-749f-1daa-f860-bd1ce6a112b1")
public static String es_PE_TAB_POSKey_Name="Llave PDV ";
@XendraTab(Name="POS Key",
Description="POS Function Key",Help="POS Function Key Assignment",
AD_Window_ID="d83bb7aa-6c36-6465-c0b7-09482af4d6cf",SeqNo=20,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="8b439dfc-749f-1daa-f860-bd1ce6a112b1",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_POSKey="8b439dfc-749f-1daa-f860-bd1ce6a112b1";

@XendraTrl(Identifier="8151a9e9-a172-9633-e011-ba3e70abcc1d")
public static String es_PE_TABLE_C_POSKey_Name="PDV llave";

@XendraTable(Name="POS Key",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="POS Function Key",Help="",
TableName="C_POSKey",AccessLevel="2",AD_Window_ID="d83bb7aa-6c36-6465-c0b7-09482af4d6cf",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="8151a9e9-a172-9633-e011-ba3e70abcc1d",Synchronized="2020-03-03 21:37:28.0")
/** TableName=C_POSKey */
public static final String Table_Name="C_POSKey";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_POSKey");

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
    Table_ID = MTable.getTable_ID("C_POSKey");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_POSKey[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Print Color.
@param AD_PrintColor_ID Color used for printing and display */
public void setAD_PrintColor_ID (int AD_PrintColor_ID)
{
if (AD_PrintColor_ID <= 0) set_Value (COLUMNNAME_AD_PrintColor_ID, null);
 else 
set_Value (COLUMNNAME_AD_PrintColor_ID, Integer.valueOf(AD_PrintColor_ID));
}
/** Get Print Color.
@return Color used for printing and display */
public int getAD_PrintColor_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_PrintColor_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="b05c778f-60cb-dea0-0ade-939481b14355")
public static String es_PE_COLUMN_AD_PrintColor_ID_Name="Print Color";

@XendraColumn(AD_Element_ID="fa351bf7-0efd-2c6a-da0b-f514d630b8e6",ColumnName="AD_PrintColor_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b05c778f-60cb-dea0-0ade-939481b14355",
Synchronized="2019-08-30 22:22:05.0")
/** Column name AD_PrintColor_ID */
public static final String COLUMNNAME_AD_PrintColor_ID = "AD_PrintColor_ID";
/** Set POS Key.
@param C_POSKey_ID POS Function Key */
public void setC_POSKey_ID (int C_POSKey_ID)
{
if (C_POSKey_ID < 1) throw new IllegalArgumentException ("C_POSKey_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_POSKey_ID, Integer.valueOf(C_POSKey_ID));
}
/** Get POS Key.
@return POS Function Key */
public int getC_POSKey_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_POSKey_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="3a28a351-e428-35d2-4e60-b2b9a1c80e5f")
public static String es_PE_FIELD_POSKey_POSKey_Name="PDV llave";

@XendraTrl(Identifier="3a28a351-e428-35d2-4e60-b2b9a1c80e5f")
public static String es_PE_FIELD_POSKey_POSKey_Description="PDV llave de Funcionamiento";

@XendraTrl(Identifier="3a28a351-e428-35d2-4e60-b2b9a1c80e5f")
public static String es_PE_FIELD_POSKey_POSKey_Help="Define llave de funcionamiento PDV";

@XendraField(AD_Column_ID="C_POSKey_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8b439dfc-749f-1daa-f860-bd1ce6a112b1",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3a28a351-e428-35d2-4e60-b2b9a1c80e5f")
public static final String FIELDNAME_POSKey_POSKey="3a28a351-e428-35d2-4e60-b2b9a1c80e5f";
/** Column name C_POSKey_ID */
public static final String COLUMNNAME_C_POSKey_ID = "C_POSKey_ID";
/** Set POS Key Layout.
@param C_POSKeyLayout_ID POS Function Key Layout */
public void setC_POSKeyLayout_ID (int C_POSKeyLayout_ID)
{
if (C_POSKeyLayout_ID < 1) throw new IllegalArgumentException ("C_POSKeyLayout_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_POSKeyLayout_ID, Integer.valueOf(C_POSKeyLayout_ID));
}
/** Get POS Key Layout.
@return POS Function Key Layout */
public int getC_POSKeyLayout_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_POSKeyLayout_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="7e4e0f31-3277-a7f3-180d-f8ab5450b478")
public static String es_PE_FIELD_POSKey_POSKeyLayout_Name="PDV Disposición de la llave";

@XendraTrl(Identifier="7e4e0f31-3277-a7f3-180d-f8ab5450b478")
public static String es_PE_FIELD_POSKey_POSKeyLayout_Description="Disposición de la llave de funcionamiento PDV";

@XendraTrl(Identifier="7e4e0f31-3277-a7f3-180d-f8ab5450b478")
public static String es_PE_FIELD_POSKey_POSKeyLayout_Help="Disposición de la llave de funcionamiento PDV";

@XendraField(AD_Column_ID="C_POSKeyLayout_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8b439dfc-749f-1daa-f860-bd1ce6a112b1",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7e4e0f31-3277-a7f3-180d-f8ab5450b478")
public static final String FIELDNAME_POSKey_POSKeyLayout="7e4e0f31-3277-a7f3-180d-f8ab5450b478";

@XendraTrl(Identifier="7a81d73d-a4c6-aebf-acf0-01ae95a13b0c")
public static String es_PE_COLUMN_C_POSKeyLayout_ID_Name="PDV Disposición de la llave";

@XendraColumn(AD_Element_ID="4665a4ce-9921-ee8e-32d7-b2602f5804bf",ColumnName="C_POSKeyLayout_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7a81d73d-a4c6-aebf-acf0-01ae95a13b0c",
Synchronized="2019-08-30 22:22:05.0")
/** Column name C_POSKeyLayout_ID */
public static final String COLUMNNAME_C_POSKeyLayout_ID = "C_POSKeyLayout_ID";
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

@XendraTrl(Identifier="08773b94-b7bc-37e8-8be7-254cb148ee24")
public static String es_PE_FIELD_POSKey_Description_Name="Observación";

@XendraTrl(Identifier="08773b94-b7bc-37e8-8be7-254cb148ee24")
public static String es_PE_FIELD_POSKey_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="08773b94-b7bc-37e8-8be7-254cb148ee24")
public static String es_PE_FIELD_POSKey_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="8b439dfc-749f-1daa-f860-bd1ce6a112b1",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="08773b94-b7bc-37e8-8be7-254cb148ee24")
public static final String FIELDNAME_POSKey_Description="08773b94-b7bc-37e8-8be7-254cb148ee24";

@XendraTrl(Identifier="c37c096d-d39f-83d7-7e82-012f881effc7")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c37c096d-d39f-83d7-7e82-012f881effc7",
Synchronized="2019-08-30 22:22:05.0")
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
@XendraTrl(Identifier="17a3cd97-5fe1-4c6f-b177-33557f7a9b90")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="17a3cd97-5fe1-4c6f-b177-33557f7a9b90",
Synchronized="2019-08-30 22:22:05.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Product.
@param M_Product_ID Product, Service, Item */
public void setM_Product_ID (int M_Product_ID)
{
if (M_Product_ID < 1) throw new IllegalArgumentException ("M_Product_ID is mandatory.");
set_Value (COLUMNNAME_M_Product_ID, Integer.valueOf(M_Product_ID));
}
/** Get Product.
@return Product, Service, Item */
public int getM_Product_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Product_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="cfb75a66-46da-c08c-ce54-a0aa58a4f8f1")
public static String es_PE_FIELD_POSKey_Product_Name="Producto";

@XendraTrl(Identifier="cfb75a66-46da-c08c-ce54-a0aa58a4f8f1")
public static String es_PE_FIELD_POSKey_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="cfb75a66-46da-c08c-ce54-a0aa58a4f8f1")
public static String es_PE_FIELD_POSKey_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="8b439dfc-749f-1daa-f860-bd1ce6a112b1",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cfb75a66-46da-c08c-ce54-a0aa58a4f8f1")
public static final String FIELDNAME_POSKey_Product="cfb75a66-46da-c08c-ce54-a0aa58a4f8f1";

@XendraTrl(Identifier="997e7223-69f3-7eac-0166-9ce868ac0486")
public static String es_PE_COLUMN_M_Product_ID_Name="Producto";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="4281f8eb-238e-6b28-eb66-8cc866e6312c",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="997e7223-69f3-7eac-0166-9ce868ac0486",Synchronized="2019-08-30 22:22:05.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
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

@XendraTrl(Identifier="b882fd33-04c9-694a-5eea-8f860a7d2015")
public static String es_PE_FIELD_POSKey_Name_Name="Nombre";

@XendraTrl(Identifier="b882fd33-04c9-694a-5eea-8f860a7d2015")
public static String es_PE_FIELD_POSKey_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="b882fd33-04c9-694a-5eea-8f860a7d2015")
public static String es_PE_FIELD_POSKey_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="8b439dfc-749f-1daa-f860-bd1ce6a112b1",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b882fd33-04c9-694a-5eea-8f860a7d2015")
public static final String FIELDNAME_POSKey_Name="b882fd33-04c9-694a-5eea-8f860a7d2015";

@XendraTrl(Identifier="8c26f94b-e576-3d1f-8312-0ccc6582ab28")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8c26f94b-e576-3d1f-8312-0ccc6582ab28",
Synchronized="2019-08-30 22:22:05.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Quantity.
@param Qty Quantity */
public void setQty (BigDecimal Qty)
{
if (Qty == null) throw new IllegalArgumentException ("Qty is mandatory.");
set_Value (COLUMNNAME_Qty, Qty);
}
/** Get Quantity.
@return Quantity */
public BigDecimal getQty() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Qty);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="237a1eb9-2d7e-0528-311e-3581f24ff0c7")
public static String es_PE_FIELD_POSKey_Quantity_Name="Cantidad";

@XendraTrl(Identifier="237a1eb9-2d7e-0528-311e-3581f24ff0c7")
public static String es_PE_FIELD_POSKey_Quantity_Description="Cantidad";

@XendraTrl(Identifier="237a1eb9-2d7e-0528-311e-3581f24ff0c7")
public static String es_PE_FIELD_POSKey_Quantity_Help="La Cantidad indica el número de un producto específico o artículo para este documento";

@XendraField(AD_Column_ID="Qty",IsCentrallyMaintained=true,
AD_Tab_ID="8b439dfc-749f-1daa-f860-bd1ce6a112b1",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="237a1eb9-2d7e-0528-311e-3581f24ff0c7")
public static final String FIELDNAME_POSKey_Quantity="237a1eb9-2d7e-0528-311e-3581f24ff0c7";

@XendraTrl(Identifier="34ac4f18-7dec-4919-9735-c253ac71ded6")
public static String es_PE_COLUMN_Qty_Name="Cantidad";

@XendraColumn(AD_Element_ID="c9d74a25-87c5-9592-5660-4f397607dad3",ColumnName="Qty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="34ac4f18-7dec-4919-9735-c253ac71ded6",
Synchronized="2019-08-30 22:22:05.0")
/** Column name Qty */
public static final String COLUMNNAME_Qty = "Qty";
/** Set Sequence.
@param SeqNo Method of ordering records: lowest number comes first */
public void setSeqNo (int SeqNo)
{
set_Value (COLUMNNAME_SeqNo, Integer.valueOf(SeqNo));
}
/** Get Sequence.
@return Method of ordering records: lowest number comes first */
public int getSeqNo() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_SeqNo);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="7137f03b-20ff-ee6f-4aec-94f92d24d843")
public static String es_PE_FIELD_POSKey_Sequence_Name="Secuencia";

@XendraTrl(Identifier="7137f03b-20ff-ee6f-4aec-94f92d24d843")
public static String es_PE_FIELD_POSKey_Sequence_Description="Método de ordenar registros; el número más bajo viene primero";

@XendraTrl(Identifier="7137f03b-20ff-ee6f-4aec-94f92d24d843")
public static String es_PE_FIELD_POSKey_Sequence_Help="La Secuencia indica el orden de los registros";

@XendraField(AD_Column_ID="SeqNo",IsCentrallyMaintained=true,
AD_Tab_ID="8b439dfc-749f-1daa-f860-bd1ce6a112b1",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7137f03b-20ff-ee6f-4aec-94f92d24d843")
public static final String FIELDNAME_POSKey_Sequence="7137f03b-20ff-ee6f-4aec-94f92d24d843";

@XendraTrl(Identifier="cb78cafb-941a-15d8-1b75-05011475bcbd")
public static String es_PE_COLUMN_SeqNo_Name="Secuencia";

@XendraColumn(AD_Element_ID="38fa26fe-b59d-fce1-c129-420b57da738b",ColumnName="SeqNo",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cb78cafb-941a-15d8-1b75-05011475bcbd",
Synchronized="2019-08-30 22:22:05.0")
/** Column name SeqNo */
public static final String COLUMNNAME_SeqNo = "SeqNo";
}
