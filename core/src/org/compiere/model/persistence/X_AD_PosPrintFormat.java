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
/** Generated Model for AD_PosPrintFormat
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_PosPrintFormat extends PO
{
/** Standard Constructor
@param ctx context
@param AD_PosPrintFormat_ID id
@param trxName transaction
*/
public X_AD_PosPrintFormat (Properties ctx, int AD_PosPrintFormat_ID, String trxName)
{
super (ctx, AD_PosPrintFormat_ID, trxName);
/** if (AD_PosPrintFormat_ID == 0)
{
setAD_PosPrintFormat_ID (0);
setIsPrePrinted (false);	
// N
setLineWidth (0);
setName (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_PosPrintFormat (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000035 */
public static int Table_ID=MTable.getTable_ID("AD_PosPrintFormat");

@XendraTrl(Identifier="8926e46d-5a0a-b63f-cce9-8726113171ff")
public static String es_PE_TABLE_AD_PosPrintFormat_Name="Formato de Impresion POS";

@XendraTable(Name="POS Print Format",Description="Print format for printing POS tickets",Help="",
TableName="AD_PosPrintFormat",AccessLevel="3",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.dictionary",Identifier="8926e46d-5a0a-b63f-cce9-8726113171ff",
Synchronized="2017-08-16 11:40:38.0")
/** TableName=AD_PosPrintFormat */
public static final String Table_Name="AD_PosPrintFormat";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_PosPrintFormat");

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
    Table_ID = MTable.getTable_ID("AD_PosPrintFormat");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_PosPrintFormat[").append(get_ID()).append("]");
return sb.toString();
}
/** Set POS Print Format.
@param AD_PosPrintFormat_ID POS Print Format */
public void setAD_PosPrintFormat_ID (int AD_PosPrintFormat_ID)
{
if (AD_PosPrintFormat_ID < 1) throw new IllegalArgumentException ("AD_PosPrintFormat_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_PosPrintFormat_ID, Integer.valueOf(AD_PosPrintFormat_ID));
}
/** Get POS Print Format.
@return POS Print Format */
public int getAD_PosPrintFormat_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_PosPrintFormat_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name AD_PosPrintFormat_ID */
public static final String COLUMNNAME_AD_PosPrintFormat_ID = "AD_PosPrintFormat_ID";
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

@XendraTrl(Identifier="2ce66005-2500-8ed8-268f-1bcb782d2836")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2ce66005-2500-8ed8-268f-1bcb782d2836",
Synchronized="2017-08-05 16:52:40.0")
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
@XendraTrl(Identifier="19a957b2-7bc4-456a-88fc-d106bf2ccdb7")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="19a957b2-7bc4-456a-88fc-d106bf2ccdb7",
Synchronized="2017-08-05 16:52:40.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set IsCashOpen.
@param IsCashOpen IsCashOpen */
public void setIsCashOpen (boolean IsCashOpen)
{
set_Value (COLUMNNAME_IsCashOpen, Boolean.valueOf(IsCashOpen));
}
/** Get IsCashOpen.
@return IsCashOpen */
public boolean isCashOpen() 
{
Object oo = get_Value(COLUMNNAME_IsCashOpen);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="c1825863-60c9-728d-85e4-2045f067ec71")
public static String es_PE_COLUMN_IsCashOpen_Name="IsCashOpen";

@XendraColumn(AD_Element_ID="84094552-a044-9771-df59-067cca29491e",ColumnName="IsCashOpen",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c1825863-60c9-728d-85e4-2045f067ec71",
Synchronized="2017-08-05 16:52:40.0")
/** Column name IsCashOpen */
public static final String COLUMNNAME_IsCashOpen = "IsCashOpen";
/** Set IsCompressed.
@param IsCompressed IsCompressed */
public void setIsCompressed (boolean IsCompressed)
{
set_Value (COLUMNNAME_IsCompressed, Boolean.valueOf(IsCompressed));
}
/** Get IsCompressed.
@return IsCompressed */
public boolean isCompressed() 
{
Object oo = get_Value(COLUMNNAME_IsCompressed);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="68599e5b-af24-efe4-e31b-edb5692f2616")
public static String es_PE_COLUMN_IsCompressed_Name="iscompressed";

@XendraColumn(AD_Element_ID="c91dbbf0-e204-2229-f6fe-8b91c37663f1",ColumnName="IsCompressed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="68599e5b-af24-efe4-e31b-edb5692f2616",
Synchronized="2017-08-05 16:52:40.0")
/** Column name IsCompressed */
public static final String COLUMNNAME_IsCompressed = "IsCompressed";
/** Set IsPaperCut.
@param IsPaperCut IsPaperCut */
public void setIsPaperCut (boolean IsPaperCut)
{
set_Value (COLUMNNAME_IsPaperCut, Boolean.valueOf(IsPaperCut));
}
/** Get IsPaperCut.
@return IsPaperCut */
public boolean isPaperCut() 
{
Object oo = get_Value(COLUMNNAME_IsPaperCut);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="54fdbd8a-d162-5886-cc3f-8a20854a2ee0")
public static String es_PE_COLUMN_IsPaperCut_Name="IsPaperCut";

@XendraColumn(AD_Element_ID="1d8d402e-f99b-b83d-4f2d-01c7c314580c",ColumnName="IsPaperCut",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="54fdbd8a-d162-5886-cc3f-8a20854a2ee0",
Synchronized="2017-08-05 16:52:40.0")
/** Column name IsPaperCut */
public static final String COLUMNNAME_IsPaperCut = "IsPaperCut";
/** Set IsPrePrinted.
@param IsPrePrinted The format it preprinted, only fill in the blanks. */
public void setIsPrePrinted (boolean IsPrePrinted)
{
set_Value (COLUMNNAME_IsPrePrinted, Boolean.valueOf(IsPrePrinted));
}
/** Get IsPrePrinted.
@return The format it preprinted, only fill in the blanks. */
public boolean isPrePrinted() 
{
Object oo = get_Value(COLUMNNAME_IsPrePrinted);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="91934969-0985-42a3-dda1-b2da8210339e")
public static String es_PE_COLUMN_IsPrePrinted_Name="Es preimpreso";

@XendraColumn(AD_Element_ID="770e8890-327c-4001-fd3c-dc9018431f36",ColumnName="IsPrePrinted",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="91934969-0985-42a3-dda1-b2da8210339e",
Synchronized="2017-08-05 16:52:40.0")
/** Column name IsPrePrinted */
public static final String COLUMNNAME_IsPrePrinted = "IsPrePrinted";
/** Set Line Width.
@param LineWidth Width of the lines */
public void setLineWidth (int LineWidth)
{
set_Value (COLUMNNAME_LineWidth, Integer.valueOf(LineWidth));
}
/** Get Line Width.
@return Width of the lines */
public int getLineWidth() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_LineWidth);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="69f4f11b-6769-19df-079e-b998af0583e5")
public static String es_PE_COLUMN_LineWidth_Name="Anchura De la Línea";

@XendraColumn(AD_Element_ID="24edf213-5acf-bae9-2ffb-b044dbd33413",ColumnName="LineWidth",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="69f4f11b-6769-19df-079e-b998af0583e5",
Synchronized="2017-08-05 16:52:40.0")
/** Column name LineWidth */
public static final String COLUMNNAME_LineWidth = "LineWidth";
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

@XendraTrl(Identifier="5f15c16c-ca7c-fbbd-0b1c-643e40396451")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5f15c16c-ca7c-fbbd-0b1c-643e40396451",
Synchronized="2017-08-05 16:52:40.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Size Y.
@param SizeY Y (vertical) dimension size */
public void setSizeY (int SizeY)
{
set_Value (COLUMNNAME_SizeY, Integer.valueOf(SizeY));
}
/** Get Size Y.
@return Y (vertical) dimension size */
public int getSizeY() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_SizeY);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f569883e-0fc7-445e-ba3a-b41e7db55ddd")
public static String es_PE_COLUMN_SizeY_Name="Size Y";

@XendraColumn(AD_Element_ID="3a04c005-6b61-63ee-907a-3b2cf25bd282",ColumnName="SizeY",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f569883e-0fc7-445e-ba3a-b41e7db55ddd",
Synchronized="2017-08-05 16:52:40.0")
/** Column name SizeY */
public static final String COLUMNNAME_SizeY = "SizeY";
}
