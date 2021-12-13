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
/** Generated Model for C_POSLine
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_POSLine extends PO
{
/** Standard Constructor
@param ctx context
@param C_POSLine_ID id
@param trxName transaction
*/
public X_C_POSLine (Properties ctx, int C_POSLine_ID, String trxName)
{
super (ctx, C_POSLine_ID, trxName);
/** if (C_POSLine_ID == 0)
{
setC_POSLine_ID (0);
setIsDescription (false);	
// N
setIsKey (false);	
// N
setIsNextLine (false);	
// N
setIsOrder (false);	
// N
setIsReadWrite (false);	
// N
setIsVisible (false);	
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
public X_C_POSLine (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000162 */
public static int Table_ID=MTable.getTable_ID("C_POSLine");

@XendraTrl(Identifier="95215b88-794f-c360-7942-19bfae197e62")
public static String es_PE_TAB_POSLine_Name="POSLine";
@XendraTab(Name="POSLine",Description="",
Help="",AD_Window_ID="8c97af02-7083-d71f-40f0-ef227a57d420",SeqNo=20,TabLevel=1,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="95215b88-794f-c360-7942-19bfae197e62",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_POSLine="95215b88-794f-c360-7942-19bfae197e62";

@XendraTrl(Identifier="b37ad8a6-2e51-b67b-a153-9580830fb4ce")
public static String es_PE_TABLE_C_POSLine_Name="POS Line";

@XendraTable(Name="POS Line",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="POS Line",Help="",
TableName="C_POSLine",AccessLevel="2",AD_Window_ID="8c97af02-7083-d71f-40f0-ef227a57d420",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="b37ad8a6-2e51-b67b-a153-9580830fb4ce",Synchronized="2020-03-03 21:37:28.0")
/** TableName=C_POSLine */
public static final String Table_Name="C_POSLine";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_POSLine");

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
    Table_ID = MTable.getTable_ID("C_POSLine");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_POSLine[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Column.
@param AD_Column_ID Column in the table */
public void setAD_Column_ID (int AD_Column_ID)
{
if (AD_Column_ID <= 0) set_Value (COLUMNNAME_AD_Column_ID, null);
 else 
set_Value (COLUMNNAME_AD_Column_ID, Integer.valueOf(AD_Column_ID));
}
/** Get Column.
@return Column in the table */
public int getAD_Column_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Column_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="86f6c44e-2ea1-aea6-f578-3ec9d65e3455")
public static String es_PE_FIELD_POSLine_Column_Name="Columna";

@XendraTrl(Identifier="86f6c44e-2ea1-aea6-f578-3ec9d65e3455")
public static String es_PE_FIELD_POSLine_Column_Description="Columna en la tabla";

@XendraTrl(Identifier="86f6c44e-2ea1-aea6-f578-3ec9d65e3455")
public static String es_PE_FIELD_POSLine_Column_Help="Enlace a la columna base de datos de la tabla";

@XendraField(AD_Column_ID="AD_Column_ID",IsCentrallyMaintained=true,
AD_Tab_ID="95215b88-794f-c360-7942-19bfae197e62",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="86f6c44e-2ea1-aea6-f578-3ec9d65e3455")
public static final String FIELDNAME_POSLine_Column="86f6c44e-2ea1-aea6-f578-3ec9d65e3455";

@XendraTrl(Identifier="c75e15d0-7828-5955-bc32-66a5c4c061a7")
public static String es_PE_COLUMN_AD_Column_ID_Name="Column";

@XendraColumn(AD_Element_ID="a0dcf1ba-2ef3-ca06-ed42-8ae37c632eaf",ColumnName="AD_Column_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="084db087-1100-ad15-806b-d1b94a96650c",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="c75e15d0-7828-5955-bc32-66a5c4c061a7",Synchronized="2019-08-30 22:22:05.0")
/** Column name AD_Column_ID */
public static final String COLUMNNAME_AD_Column_ID = "AD_Column_ID";
/** Set Reference.
@param AD_Reference_ID System Reference and Validation */
public void setAD_Reference_ID (int AD_Reference_ID)
{
if (AD_Reference_ID <= 0) set_Value (COLUMNNAME_AD_Reference_ID, null);
 else 
set_Value (COLUMNNAME_AD_Reference_ID, Integer.valueOf(AD_Reference_ID));
}
/** Get Reference.
@return System Reference and Validation */
public int getAD_Reference_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Reference_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="151b35be-ec92-314d-daec-966c75bc65c5")
public static String es_PE_FIELD_POSLine_Reference_Name="Referencia";

@XendraTrl(Identifier="151b35be-ec92-314d-daec-966c75bc65c5")
public static String es_PE_FIELD_POSLine_Reference_Description="Referencia del Sistema (Lista de Selección)";

@XendraTrl(Identifier="151b35be-ec92-314d-daec-966c75bc65c5")
public static String es_PE_FIELD_POSLine_Reference_Help="La Referencia indica el tipo de campo de referencia";

@XendraField(AD_Column_ID="AD_Reference_ID",IsCentrallyMaintained=true,
AD_Tab_ID="95215b88-794f-c360-7942-19bfae197e62",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=190,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="151b35be-ec92-314d-daec-966c75bc65c5")
public static final String FIELDNAME_POSLine_Reference="151b35be-ec92-314d-daec-966c75bc65c5";

@XendraTrl(Identifier="352bc4c6-2031-8866-bae4-14d299d1d76a")
public static String es_PE_COLUMN_AD_Reference_ID_Name="Reference";

@XendraColumn(AD_Element_ID="bf1912e9-a75f-4e1b-99b4-d04633e7777b",ColumnName="AD_Reference_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="17ec718c-707b-498f-3a6c-e81d1630e510",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="352bc4c6-2031-8866-bae4-14d299d1d76a",Synchronized="2019-08-30 22:22:05.0")
/** Column name AD_Reference_ID */
public static final String COLUMNNAME_AD_Reference_ID = "AD_Reference_ID";
/** Set Reference Key.
@param AD_Reference_Value_ID Required to specify, if data type is Table or List */
public void setAD_Reference_Value_ID (int AD_Reference_Value_ID)
{
if (AD_Reference_Value_ID <= 0) set_Value (COLUMNNAME_AD_Reference_Value_ID, null);
 else 
set_Value (COLUMNNAME_AD_Reference_Value_ID, Integer.valueOf(AD_Reference_Value_ID));
}
/** Get Reference Key.
@return Required to specify, if data type is Table or List */
public int getAD_Reference_Value_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Reference_Value_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="e31f3db9-0423-cd16-427a-8659c0ac8536")
public static String es_PE_FIELD_POSLine_ReferenceKey_Name="Valor de Referencia";

@XendraTrl(Identifier="e31f3db9-0423-cd16-427a-8659c0ac8536")
public static String es_PE_FIELD_POSLine_ReferenceKey_Description="Requerido para especificar; si el tipo de datos es tabla ó lista.";

@XendraTrl(Identifier="e31f3db9-0423-cd16-427a-8659c0ac8536")
public static String es_PE_FIELD_POSLine_ReferenceKey_Help="El valor referencia indica dónde los valores referencia son almacenados. Debe especificarce si el tipo de datos es tabla ó lista.";

@XendraField(AD_Column_ID="AD_Reference_Value_ID",IsCentrallyMaintained=true,
AD_Tab_ID="95215b88-794f-c360-7942-19bfae197e62",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=200,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e31f3db9-0423-cd16-427a-8659c0ac8536")
public static final String FIELDNAME_POSLine_ReferenceKey="e31f3db9-0423-cd16-427a-8659c0ac8536";

@XendraTrl(Identifier="b380c0b1-ca14-1810-3b69-5dba95951c07")
public static String es_PE_COLUMN_AD_Reference_Value_ID_Name="Reference Key";

@XendraColumn(AD_Element_ID="1ce26254-3c83-8d1d-3506-37160c076aad",
ColumnName="AD_Reference_Value_ID",AD_Reference_ID=18,
AD_Reference_Value_ID="12253474-e61c-58a4-3fd3-2c2ccf236272",
AD_Val_Rule_ID="147ddeef-c150-2ac8-67e8-346cc5225ef4",FieldLength=10,DefaultValue="",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b380c0b1-ca14-1810-3b69-5dba95951c07",
Synchronized="2019-08-30 22:22:05.0")
/** Column name AD_Reference_Value_ID */
public static final String COLUMNNAME_AD_Reference_Value_ID = "AD_Reference_Value_ID";
/** Set Table.
@param AD_Table_ID Database Table information */
public void setAD_Table_ID (int AD_Table_ID)
{
if (AD_Table_ID <= 0) set_Value (COLUMNNAME_AD_Table_ID, null);
 else 
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

@XendraTrl(Identifier="c0e5f670-fbe2-4069-c03c-4b9b39459471")
public static String es_PE_FIELD_POSLine_Table_Name="Tabla";

@XendraTrl(Identifier="c0e5f670-fbe2-4069-c03c-4b9b39459471")
public static String es_PE_FIELD_POSLine_Table_Description="Tabla para los campos";

@XendraTrl(Identifier="c0e5f670-fbe2-4069-c03c-4b9b39459471")
public static String es_PE_FIELD_POSLine_Table_Help="La Tabla indica una tabla en la que reside un campo ó campos.";

@XendraField(AD_Column_ID="AD_Table_ID",IsCentrallyMaintained=true,
AD_Tab_ID="95215b88-794f-c360-7942-19bfae197e62",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c0e5f670-fbe2-4069-c03c-4b9b39459471")
public static final String FIELDNAME_POSLine_Table="c0e5f670-fbe2-4069-c03c-4b9b39459471";

@XendraTrl(Identifier="56566343-8b6f-8b99-286a-0639b3b64c4e")
public static String es_PE_COLUMN_AD_Table_ID_Name="Table";

@XendraColumn(AD_Element_ID="270eeb02-723b-0ecc-7f56-3c67fa71a7f1",ColumnName="AD_Table_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="56566343-8b6f-8b99-286a-0639b3b64c4e",
Synchronized="2019-08-30 22:22:05.0")
/** Column name AD_Table_ID */
public static final String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
/** Set Classname.
@param Classname Java Classname */
public void setClassname (String Classname)
{
if (Classname != null && Classname.length() > 60)
{
log.warning("Length > 60 - truncated");
Classname = Classname.substring(0,59);
}
set_Value (COLUMNNAME_Classname, Classname);
}
/** Get Classname.
@return Java Classname */
public String getClassname() 
{
String value = (String)get_Value(COLUMNNAME_Classname);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="468f5397-4cd2-b9d1-8da0-fdbe2823ca6d")
public static String es_PE_FIELD_POSLine_Classname_Name="Nombre de Clase";

@XendraTrl(Identifier="468f5397-4cd2-b9d1-8da0-fdbe2823ca6d")
public static String es_PE_FIELD_POSLine_Classname_Description="Nombre de la clase Java";

@XendraTrl(Identifier="468f5397-4cd2-b9d1-8da0-fdbe2823ca6d")
public static String es_PE_FIELD_POSLine_Classname_Help="El nombre de clase identifica el nombre de la clase Java usada por este Informe ó proceso.";

@XendraField(AD_Column_ID="Classname",IsCentrallyMaintained=true,
AD_Tab_ID="95215b88-794f-c360-7942-19bfae197e62",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="468f5397-4cd2-b9d1-8da0-fdbe2823ca6d")
public static final String FIELDNAME_POSLine_Classname="468f5397-4cd2-b9d1-8da0-fdbe2823ca6d";

@XendraTrl(Identifier="67b848b4-0a0e-84c1-8df6-961981e1222d")
public static String es_PE_COLUMN_Classname_Name="Classname";

@XendraColumn(AD_Element_ID="43b208b9-53a3-0d59-0255-aaf07c9bd7ce",ColumnName="Classname",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="67b848b4-0a0e-84c1-8df6-961981e1222d",
Synchronized="2019-08-30 22:22:05.0")
/** Column name Classname */
public static final String COLUMNNAME_Classname = "Classname";
/** Set POS Terminal.
@param C_POS_ID Point of Sales Terminal */
public void setC_POS_ID (int C_POS_ID)
{
if (C_POS_ID <= 0) set_ValueNoCheck (COLUMNNAME_C_POS_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_C_POS_ID, Integer.valueOf(C_POS_ID));
}
/** Get POS Terminal.
@return Point of Sales Terminal */
public int getC_POS_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_POS_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d9bdb64e-05dc-2b4e-b667-b58b611f5afa")
public static String es_PE_FIELD_POSLine_POSTerminal_Name="Terminal PDV";

@XendraTrl(Identifier="d9bdb64e-05dc-2b4e-b667-b58b611f5afa")
public static String es_PE_FIELD_POSLine_POSTerminal_Description="Punto de las ventas terminales";

@XendraTrl(Identifier="d9bdb64e-05dc-2b4e-b667-b58b611f5afa")
public static String es_PE_FIELD_POSLine_POSTerminal_Help="La Terminal de PDV define el default y las funciones de la forma de PV.";

@XendraField(AD_Column_ID="C_POS_ID",IsCentrallyMaintained=true,
AD_Tab_ID="95215b88-794f-c360-7942-19bfae197e62",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d9bdb64e-05dc-2b4e-b667-b58b611f5afa")
public static final String FIELDNAME_POSLine_POSTerminal="d9bdb64e-05dc-2b4e-b667-b58b611f5afa";

@XendraTrl(Identifier="649a6272-73dd-f4c0-1135-eac840daf27b")
public static String es_PE_COLUMN_C_POS_ID_Name="POS Terminal";

@XendraColumn(AD_Element_ID="c2adeeab-8099-b658-0016-5d97a32be4a2",ColumnName="C_POS_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="649a6272-73dd-f4c0-1135-eac840daf27b",
Synchronized="2019-08-30 22:22:05.0")
/** Column name C_POS_ID */
public static final String COLUMNNAME_C_POS_ID = "C_POS_ID";
/** Set POS Line.
@param C_POSLine_ID POS Line */
public void setC_POSLine_ID (int C_POSLine_ID)
{
if (C_POSLine_ID < 1) throw new IllegalArgumentException ("C_POSLine_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_POSLine_ID, Integer.valueOf(C_POSLine_ID));
}
/** Get POS Line.
@return POS Line */
public int getC_POSLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_POSLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="7dc00788-9cd7-f024-9929-f4652204902d")
public static String es_PE_FIELD_POSLine_POSLine_Name="POS Line";

@XendraField(AD_Column_ID="C_POSLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="95215b88-794f-c360-7942-19bfae197e62",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7dc00788-9cd7-f024-9929-f4652204902d")
public static final String FIELDNAME_POSLine_POSLine="7dc00788-9cd7-f024-9929-f4652204902d";
/** Column name C_POSLine_ID */
public static final String COLUMNNAME_C_POSLine_ID = "C_POSLine_ID";
/** Set Store POS Line.
@param C_StorePOSLine_ID Store POS Line */
public void setC_StorePOSLine_ID (int C_StorePOSLine_ID)
{
if (C_StorePOSLine_ID <= 0) set_Value (COLUMNNAME_C_StorePOSLine_ID, null);
 else 
set_Value (COLUMNNAME_C_StorePOSLine_ID, Integer.valueOf(C_StorePOSLine_ID));
}
/** Get Store POS Line.
@return Store POS Line */
public int getC_StorePOSLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_StorePOSLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="07c9ed38-104c-4ab8-9ff5-9bf6f5bacd04")
public static String es_PE_COLUMN_C_StorePOSLine_ID_Name="Store POS Line";

@XendraColumn(AD_Element_ID="9a9c00b0-065a-44f2-83c5-0b1a6935879f",ColumnName="C_StorePOSLine_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="07c9ed38-104c-4ab8-9ff5-9bf6f5bacd04",
Synchronized="2019-08-30 22:22:05.0")
/** Column name C_StorePOSLine_ID */
public static final String COLUMNNAME_C_StorePOSLine_ID = "C_StorePOSLine_ID";
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

@XendraTrl(Identifier="4ea7d224-e2bb-ade1-7024-bb845aec3e2b")
public static String es_PE_FIELD_POSLine_Description_Name="Descripción";

@XendraTrl(Identifier="4ea7d224-e2bb-ade1-7024-bb845aec3e2b")
public static String es_PE_FIELD_POSLine_Description_Description="Descripción corta opcional del registro";

@XendraTrl(Identifier="4ea7d224-e2bb-ade1-7024-bb845aec3e2b")
public static String es_PE_FIELD_POSLine_Description_Help="Una descripción esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="95215b88-794f-c360-7942-19bfae197e62",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=255,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4ea7d224-e2bb-ade1-7024-bb845aec3e2b")
public static final String FIELDNAME_POSLine_Description="4ea7d224-e2bb-ade1-7024-bb845aec3e2b";

@XendraTrl(Identifier="8889cb6b-2f30-9876-2112-988781ff501f")
public static String es_PE_COLUMN_Description_Name="Description";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8889cb6b-2f30-9876-2112-988781ff501f",
Synchronized="2019-08-30 22:22:05.0")
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

@XendraTrl(Identifier="6283673d-420e-52a7-04d2-02e4f04883b9")
public static String es_PE_FIELD_POSLine_CommentHelp_Name="Ayuda";

@XendraTrl(Identifier="6283673d-420e-52a7-04d2-02e4f04883b9")
public static String es_PE_FIELD_POSLine_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="6283673d-420e-52a7-04d2-02e4f04883b9")
public static String es_PE_FIELD_POSLine_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraField(AD_Column_ID="Help",IsCentrallyMaintained=true,
AD_Tab_ID="95215b88-794f-c360-7942-19bfae197e62",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=2000,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6283673d-420e-52a7-04d2-02e4f04883b9")
public static final String FIELDNAME_POSLine_CommentHelp="6283673d-420e-52a7-04d2-02e4f04883b9";

@XendraTrl(Identifier="78422ba9-dbc8-9de4-9cc2-214795839307")
public static String es_PE_COLUMN_Help_Name="Comment/Help";

@XendraColumn(AD_Element_ID="a6fda582-56f9-6bb7-8436-285ce4f8de3f",ColumnName="Help",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="78422ba9-dbc8-9de4-9cc2-214795839307",
Synchronized="2019-08-30 22:22:05.0")
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
@XendraTrl(Identifier="11a9ddce-36a3-424a-adec-9650a3d42712")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="11a9ddce-36a3-424a-adec-9650a3d42712",
Synchronized="2019-08-30 22:22:05.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set IsColorColumn.
@param IsColorColumn IsColorColumn */
public void setIsColorColumn (boolean IsColorColumn)
{
set_Value (COLUMNNAME_IsColorColumn, Boolean.valueOf(IsColorColumn));
}
/** Get IsColorColumn.
@return IsColorColumn */
public boolean isColorColumn() 
{
Object oo = get_Value(COLUMNNAME_IsColorColumn);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="64c4c838-8618-9544-5cb0-6f683a1a52dd")
public static String es_PE_FIELD_POSLine_IsColorColumn_Name="IsColorColumn";

@XendraField(AD_Column_ID="IsColorColumn",IsCentrallyMaintained=true,
AD_Tab_ID="95215b88-794f-c360-7942-19bfae197e62",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="64c4c838-8618-9544-5cb0-6f683a1a52dd")
public static final String FIELDNAME_POSLine_IsColorColumn="64c4c838-8618-9544-5cb0-6f683a1a52dd";

@XendraTrl(Identifier="44e1ac27-cdad-961e-15c8-9f0efc3bc24a")
public static String es_PE_COLUMN_IsColorColumn_Name="IsColorColumn";

@XendraColumn(AD_Element_ID="483dfa3a-1b4f-898f-1165-7a916ae6f797",ColumnName="IsColorColumn",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="44e1ac27-cdad-961e-15c8-9f0efc3bc24a",
Synchronized="2019-08-30 22:22:05.0")
/** Column name IsColorColumn */
public static final String COLUMNNAME_IsColorColumn = "IsColorColumn";
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

@XendraTrl(Identifier="5f12fe9e-fd8a-8196-6948-ff3ae4976484")
public static String es_PE_FIELD_POSLine_Default_Name="Predeterminado";

@XendraTrl(Identifier="5f12fe9e-fd8a-8196-6948-ff3ae4976484")
public static String es_PE_FIELD_POSLine_Default_Description="Valor Predeterminado";

@XendraTrl(Identifier="5f12fe9e-fd8a-8196-6948-ff3ae4976484")
public static String es_PE_FIELD_POSLine_Default_Help="El cuadro de verificación indica si este registro será usado como un valor predeterminado";

@XendraField(AD_Column_ID="IsDefault",IsCentrallyMaintained=true,
AD_Tab_ID="95215b88-794f-c360-7942-19bfae197e62",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5f12fe9e-fd8a-8196-6948-ff3ae4976484")
public static final String FIELDNAME_POSLine_Default="5f12fe9e-fd8a-8196-6948-ff3ae4976484";

@XendraTrl(Identifier="6129035a-09b6-e4d2-6883-7b5731a95161")
public static String es_PE_COLUMN_IsDefault_Name="Default";

@XendraColumn(AD_Element_ID="8617f892-e113-a5fd-8715-687f792f136c",ColumnName="IsDefault",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6129035a-09b6-e4d2-6883-7b5731a95161",
Synchronized="2019-08-30 22:22:05.0")
/** Column name IsDefault */
public static final String COLUMNNAME_IsDefault = "IsDefault";
/** Set Description Only.
@param IsDescription if true, the line is just DESCRIPTION and no transaction */
public void setIsDescription (boolean IsDescription)
{
set_Value (COLUMNNAME_IsDescription, Boolean.valueOf(IsDescription));
}
/** Get Description Only.
@return if true, the line is just DESCRIPTION and no transaction */
public boolean isDescription() 
{
Object oo = get_Value(COLUMNNAME_IsDescription);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="bb8855d7-ba4e-09a0-46f7-207263e5fad0")
public static String es_PE_FIELD_POSLine_DescriptionOnly_Name="Sólo Descripción";

@XendraTrl(Identifier="bb8855d7-ba4e-09a0-46f7-207263e5fad0")
public static String es_PE_FIELD_POSLine_DescriptionOnly_Description="Si es verdad, la línea es descripción justa y ninguna transacción.";

@XendraTrl(Identifier="bb8855d7-ba4e-09a0-46f7-207263e5fad0")
public static String es_PE_FIELD_POSLine_DescriptionOnly_Help="Si una línea es descripción solamente, Ej. el inventario del producto no se corrige. No se crea ningunas transacciones de la contabilidad y la cantidad ó los totales no se incluye en el documento. Esto para incluir líneas de detalle de descripción, Ej. para una orden de trabajo.";

@XendraField(AD_Column_ID="IsDescription",IsCentrallyMaintained=true,
AD_Tab_ID="95215b88-794f-c360-7942-19bfae197e62",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bb8855d7-ba4e-09a0-46f7-207263e5fad0")
public static final String FIELDNAME_POSLine_DescriptionOnly="bb8855d7-ba4e-09a0-46f7-207263e5fad0";

@XendraTrl(Identifier="9d366918-fdf3-7e20-945b-5fbfc59b6528")
public static String es_PE_COLUMN_IsDescription_Name="Description Only";

@XendraColumn(AD_Element_ID="bd7f450d-a061-1b08-60d8-19c8943042f0",ColumnName="IsDescription",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9d366918-fdf3-7e20-945b-5fbfc59b6528",
Synchronized="2019-08-30 22:22:05.0")
/** Column name IsDescription */
public static final String COLUMNNAME_IsDescription = "IsDescription";
/** Set Key column.
@param IsKey This column is the key in this table */
public void setIsKey (boolean IsKey)
{
set_Value (COLUMNNAME_IsKey, Boolean.valueOf(IsKey));
}
/** Get Key column.
@return This column is the key in this table */
public boolean isKey() 
{
Object oo = get_Value(COLUMNNAME_IsKey);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="42401b1c-e386-3fe6-299e-bac4c1b103bd")
public static String es_PE_FIELD_POSLine_KeyColumn_Name="Columna Clave";

@XendraTrl(Identifier="42401b1c-e386-3fe6-299e-bac4c1b103bd")
public static String es_PE_FIELD_POSLine_KeyColumn_Description="Esta columna es la clave en esta tabla";

@XendraTrl(Identifier="42401b1c-e386-3fe6-299e-bac4c1b103bd")
public static String es_PE_FIELD_POSLine_KeyColumn_Help="La columna clave debe también desplegar la secuencia 0 en la definición de campo y puede estar oculto";

@XendraField(AD_Column_ID="IsKey",IsCentrallyMaintained=true,
AD_Tab_ID="95215b88-794f-c360-7942-19bfae197e62",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="42401b1c-e386-3fe6-299e-bac4c1b103bd")
public static final String FIELDNAME_POSLine_KeyColumn="42401b1c-e386-3fe6-299e-bac4c1b103bd";

@XendraTrl(Identifier="53055b9a-e375-e113-d790-0169b7ed0b60")
public static String es_PE_COLUMN_IsKey_Name="Key column";

@XendraColumn(AD_Element_ID="8be2cc4b-c2a0-4ba3-839f-51f95a60471f",ColumnName="IsKey",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="53055b9a-e375-e113-d790-0169b7ed0b60",
Synchronized="2019-08-30 22:22:05.0")
/** Column name IsKey */
public static final String COLUMNNAME_IsKey = "IsKey";
/** Set Next Line.
@param IsNextLine Print item on next line */
public void setIsNextLine (boolean IsNextLine)
{
set_Value (COLUMNNAME_IsNextLine, Boolean.valueOf(IsNextLine));
}
/** Get Next Line.
@return Print item on next line */
public boolean isNextLine() 
{
Object oo = get_Value(COLUMNNAME_IsNextLine);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="55260b80-9e8f-adc6-b4e4-1b2c2a4a5bcb")
public static String es_PE_FIELD_POSLine_NextLine_Name="Próxima Línea";

@XendraTrl(Identifier="55260b80-9e8f-adc6-b4e4-1b2c2a4a5bcb")
public static String es_PE_FIELD_POSLine_NextLine_Description="Imprimir item en la próxima línea";

@XendraTrl(Identifier="55260b80-9e8f-adc6-b4e4-1b2c2a4a5bcb")
public static String es_PE_FIELD_POSLine_NextLine_Help="Sí no se selecciona; el item es impreso en la misma línea";

@XendraField(AD_Column_ID="IsNextLine",IsCentrallyMaintained=true,
AD_Tab_ID="95215b88-794f-c360-7942-19bfae197e62",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="55260b80-9e8f-adc6-b4e4-1b2c2a4a5bcb")
public static final String FIELDNAME_POSLine_NextLine="55260b80-9e8f-adc6-b4e4-1b2c2a4a5bcb";

@XendraTrl(Identifier="043faba5-2e6e-93ab-4148-be1d12c6c502")
public static String es_PE_COLUMN_IsNextLine_Name="Next Line";

@XendraColumn(AD_Element_ID="f174a61c-2e3c-e69b-1602-2c17eb3540b8",ColumnName="IsNextLine",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="043faba5-2e6e-93ab-4148-be1d12c6c502",
Synchronized="2019-08-30 22:22:05.0")
/** Column name IsNextLine */
public static final String COLUMNNAME_IsNextLine = "IsNextLine";
/** Set IsOrder.
@param IsOrder IsOrder */
public void setIsOrder (boolean IsOrder)
{
set_Value (COLUMNNAME_IsOrder, Boolean.valueOf(IsOrder));
}
/** Get IsOrder.
@return IsOrder */
public boolean isOrder() 
{
Object oo = get_Value(COLUMNNAME_IsOrder);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="e30e6df5-d4c1-7eae-5c65-3c347c77bada")
public static String es_PE_COLUMN_IsOrder_Name="IsOrder";

@XendraColumn(AD_Element_ID="9eb502d1-052e-45e7-a3d0-79612dc59021",ColumnName="IsOrder",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e30e6df5-d4c1-7eae-5c65-3c347c77bada",
Synchronized="2019-08-30 22:22:05.0")
/** Column name IsOrder */
public static final String COLUMNNAME_IsOrder = "IsOrder";
/** Set IsOverwrite.
@param IsOverwrite IsOverwrite */
public void setIsOverwrite (boolean IsOverwrite)
{
set_Value (COLUMNNAME_IsOverwrite, Boolean.valueOf(IsOverwrite));
}
/** Get IsOverwrite.
@return IsOverwrite */
public boolean isOverwrite() 
{
Object oo = get_Value(COLUMNNAME_IsOverwrite);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="3e8b6b37-3094-791e-ef82-75e6e18fe26a")
public static String es_PE_COLUMN_IsOverwrite_Name="isoverwrite";

@XendraColumn(AD_Element_ID="68339b4d-933a-68ba-d78f-c0fbb9c1c361",ColumnName="IsOverwrite",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3e8b6b37-3094-791e-ef82-75e6e18fe26a",
Synchronized="2019-08-30 22:22:05.0")
/** Column name IsOverwrite */
public static final String COLUMNNAME_IsOverwrite = "IsOverwrite";
/** Set Read Write.
@param IsReadWrite Field is read / write */
public void setIsReadWrite (boolean IsReadWrite)
{
set_Value (COLUMNNAME_IsReadWrite, Boolean.valueOf(IsReadWrite));
}
/** Get Read Write.
@return Field is read / write */
public boolean isReadWrite() 
{
Object oo = get_Value(COLUMNNAME_IsReadWrite);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="3eb268f6-2208-0429-fc39-f4770147ec9c")
public static String es_PE_FIELD_POSLine_ReadWrite_Name="Lectura Escritura";

@XendraTrl(Identifier="3eb268f6-2208-0429-fc39-f4770147ec9c")
public static String es_PE_FIELD_POSLine_ReadWrite_Description="El campo es de lectura / escritura";

@XendraTrl(Identifier="3eb268f6-2208-0429-fc39-f4770147ec9c")
public static String es_PE_FIELD_POSLine_ReadWrite_Help="El lectura escritura indica que este campo puede ser leído y actualizado.";

@XendraField(AD_Column_ID="IsReadWrite",IsCentrallyMaintained=true,
AD_Tab_ID="95215b88-794f-c360-7942-19bfae197e62",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3eb268f6-2208-0429-fc39-f4770147ec9c")
public static final String FIELDNAME_POSLine_ReadWrite="3eb268f6-2208-0429-fc39-f4770147ec9c";

@XendraTrl(Identifier="cb41384d-1215-a217-6181-b67e29435999")
public static String es_PE_COLUMN_IsReadWrite_Name="Read Write";

@XendraColumn(AD_Element_ID="fc616898-5f46-981e-906f-9a5ddb486499",ColumnName="IsReadWrite",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cb41384d-1215-a217-6181-b67e29435999",
Synchronized="2019-08-30 22:22:05.0")
/** Column name IsReadWrite */
public static final String COLUMNNAME_IsReadWrite = "IsReadWrite";
/** Set IsVisible.
@param IsVisible IsVisible */
public void setIsVisible (boolean IsVisible)
{
set_Value (COLUMNNAME_IsVisible, Boolean.valueOf(IsVisible));
}
/** Get IsVisible.
@return IsVisible */
public boolean isVisible() 
{
Object oo = get_Value(COLUMNNAME_IsVisible);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="9182486f-d58d-daf7-3c79-71dc90badbb3")
public static String es_PE_FIELD_POSLine_IsVisible_Name="isvisible";

@XendraField(AD_Column_ID="IsVisible",IsCentrallyMaintained=true,
AD_Tab_ID="95215b88-794f-c360-7942-19bfae197e62",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9182486f-d58d-daf7-3c79-71dc90badbb3")
public static final String FIELDNAME_POSLine_IsVisible="9182486f-d58d-daf7-3c79-71dc90badbb3";

@XendraTrl(Identifier="886a05b2-8928-7655-5b1a-f554f09aab92")
public static String es_PE_COLUMN_IsVisible_Name="IsVisible";

@XendraColumn(AD_Element_ID="d5755b76-7c48-2932-e64a-ac8e7bfa27c9",ColumnName="IsVisible",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="886a05b2-8928-7655-5b1a-f554f09aab92",
Synchronized="2019-08-30 22:22:05.0")
/** Column name IsVisible */
public static final String COLUMNNAME_IsVisible = "IsVisible";
/** Set Line No.
@param Line Unique line for this document */
public void setLine (int Line)
{
set_Value (COLUMNNAME_Line, Integer.valueOf(Line));
}
/** Get Line No.
@return Unique line for this document */
public int getLine() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Line);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ca2ebe56-5b49-4c35-f7c4-4ff4148ad213")
public static String es_PE_FIELD_POSLine_LineNo_Name="No. Línea";

@XendraTrl(Identifier="ca2ebe56-5b49-4c35-f7c4-4ff4148ad213")
public static String es_PE_FIELD_POSLine_LineNo_Description="No. Línea único para este documento";

@XendraTrl(Identifier="ca2ebe56-5b49-4c35-f7c4-4ff4148ad213")
public static String es_PE_FIELD_POSLine_LineNo_Help="Indica el No. Línea para un documento. También controlará el orden de despliegue de las líneas dentro de un documento";

@XendraField(AD_Column_ID="Line",IsCentrallyMaintained=true,
AD_Tab_ID="95215b88-794f-c360-7942-19bfae197e62",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ca2ebe56-5b49-4c35-f7c4-4ff4148ad213")
public static final String FIELDNAME_POSLine_LineNo="ca2ebe56-5b49-4c35-f7c4-4ff4148ad213";

@XendraTrl(Identifier="44eb20c3-1231-bc98-d977-964d709d031e")
public static String es_PE_COLUMN_Line_Name="Line No";

@XendraColumn(AD_Element_ID="986ef077-61da-f9cf-1c6d-aefe3a35113b",ColumnName="Line",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="44eb20c3-1231-bc98-d977-964d709d031e",
Synchronized="2019-08-30 22:22:05.0")
/** Column name Line */
public static final String COLUMNNAME_Line = "Line";
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

@XendraTrl(Identifier="9ea21da4-c9e0-238c-2721-b18776151d52")
public static String es_PE_FIELD_POSLine_Name_Name="Nombre";

@XendraTrl(Identifier="9ea21da4-c9e0-238c-2721-b18776151d52")
public static String es_PE_FIELD_POSLine_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="9ea21da4-c9e0-238c-2721-b18776151d52")
public static String es_PE_FIELD_POSLine_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="95215b88-794f-c360-7942-19bfae197e62",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9ea21da4-c9e0-238c-2721-b18776151d52")
public static final String FIELDNAME_POSLine_Name="9ea21da4-c9e0-238c-2721-b18776151d52";

@XendraTrl(Identifier="66e0f8dd-c2b7-95a8-fc4c-e0a20168c068")
public static String es_PE_COLUMN_Name_Name="Name";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="66e0f8dd-c2b7-95a8-fc4c-e0a20168c068",
Synchronized="2019-08-30 22:22:05.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Source Method.
@param SourceMethodName Source Method Name */
public void setSourceMethodName (String SourceMethodName)
{
if (SourceMethodName != null && SourceMethodName.length() > 60)
{
log.warning("Length > 60 - truncated");
SourceMethodName = SourceMethodName.substring(0,59);
}
set_Value (COLUMNNAME_SourceMethodName, SourceMethodName);
}
/** Get Source Method.
@return Source Method Name */
public String getSourceMethodName() 
{
String value = (String)get_Value(COLUMNNAME_SourceMethodName);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="3beb7ebc-6afd-8acb-b596-8f0014bd6e0b")
public static String es_PE_FIELD_POSLine_SourceMethod_Name="Método de Fuente";

@XendraTrl(Identifier="3beb7ebc-6afd-8acb-b596-8f0014bd6e0b")
public static String es_PE_FIELD_POSLine_SourceMethod_Description="Nombre Método de Fuente";

@XendraField(AD_Column_ID="SourceMethodName",IsCentrallyMaintained=true,
AD_Tab_ID="95215b88-794f-c360-7942-19bfae197e62",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3beb7ebc-6afd-8acb-b596-8f0014bd6e0b")
public static final String FIELDNAME_POSLine_SourceMethod="3beb7ebc-6afd-8acb-b596-8f0014bd6e0b";

@XendraTrl(Identifier="a3ec4ac9-026d-4e5f-2897-9f64de072321")
public static String es_PE_COLUMN_SourceMethodName_Name="Source Method";

@XendraColumn(AD_Element_ID="c8f923ba-42fd-65b8-bf15-8f7d5b2d78ca",ColumnName="SourceMethodName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a3ec4ac9-026d-4e5f-2897-9f64de072321",
Synchronized="2019-08-30 22:22:05.0")
/** Column name SourceMethodName */
public static final String COLUMNNAME_SourceMethodName = "SourceMethodName";
}
