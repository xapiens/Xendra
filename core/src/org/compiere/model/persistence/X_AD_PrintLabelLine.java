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
/** Generated Model for AD_PrintLabelLine
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_PrintLabelLine extends PO
{
/** Standard Constructor
@param ctx context
@param AD_PrintLabelLine_ID id
@param trxName transaction
*/
public X_AD_PrintLabelLine (Properties ctx, int AD_PrintLabelLine_ID, String trxName)
{
super (ctx, AD_PrintLabelLine_ID, trxName);
/** if (AD_PrintLabelLine_ID == 0)
{
setAD_LabelPrinterFunction_ID (0);
setAD_PrintLabel_ID (0);
setAD_PrintLabelLine_ID (0);
setLabelFormatType (null);	
// F
setName (null);
setSeqNo (0);
setXPosition (0);
setYPosition (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_PrintLabelLine (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=569 */
public static int Table_ID=MTable.getTable_ID("AD_PrintLabelLine");

@XendraTrl(Identifier="b4f3ee34-6563-d632-44a5-24a32e22838f")
public static String es_PE_TAB_Line_Description="Ìtem de la etiqueta de la impresión";

@XendraTrl(Identifier="b4f3ee34-6563-d632-44a5-24a32e22838f")
public static String es_PE_TAB_Line_Help="Mantener formato de la línea en la etiqueta";

@XendraTrl(Identifier="b4f3ee34-6563-d632-44a5-24a32e22838f")
public static String es_PE_TAB_Line_Name="Línea";
@XendraTab(Name="Line",
Description="Print Label Line",Help="Maintain Format of the line on a Label",
AD_Window_ID="f9dedcb3-64b8-9e14-5fb5-6cd892b7e3aa",SeqNo=20,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="b4f3ee34-6563-d632-44a5-24a32e22838f",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Line="b4f3ee34-6563-d632-44a5-24a32e22838f";

@XendraTrl(Identifier="08d218e3-00ed-9c0d-0288-2f1ea31bde65")
public static String es_PE_TABLE_AD_PrintLabelLine_Name="Impresión Etiqueta Linea";

@XendraTable(Name="Print Label Line",AD_Package_ID="140d4d0c-8da8-bcb6-9c20-bc776701f80c",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Print Label Line Format",Help="",
TableName="AD_PrintLabelLine",AccessLevel="6",AD_Window_ID="f9dedcb3-64b8-9e14-5fb5-6cd892b7e3aa",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=140,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.dictionary",
Identifier="08d218e3-00ed-9c0d-0288-2f1ea31bde65",Synchronized="2020-03-03 21:35:42.0")
/** TableName=AD_PrintLabelLine */
public static final String Table_Name="AD_PrintLabelLine";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_PrintLabelLine");

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
    Table_ID = MTable.getTable_ID("AD_PrintLabelLine");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_PrintLabelLine[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="07ec1dd0-47ef-5816-6409-94ad1b1e7717")
public static String es_PE_FIELD_Line_Column_Name="Columna";

@XendraTrl(Identifier="07ec1dd0-47ef-5816-6409-94ad1b1e7717")
public static String es_PE_FIELD_Line_Column_Description="Columna en la tabla";

@XendraTrl(Identifier="07ec1dd0-47ef-5816-6409-94ad1b1e7717")
public static String es_PE_FIELD_Line_Column_Help="Enlace a la columna base de datos de la tabla";

@XendraField(AD_Column_ID="AD_Column_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b4f3ee34-6563-d632-44a5-24a32e22838f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@LabelFormatType@=F",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="07ec1dd0-47ef-5816-6409-94ad1b1e7717")
public static final String FIELDNAME_Line_Column="07ec1dd0-47ef-5816-6409-94ad1b1e7717";

@XendraTrl(Identifier="d74832f7-abc3-b907-dd63-272aaf8bc681")
public static String es_PE_COLUMN_AD_Column_ID_Name="Columna";

@XendraColumn(AD_Element_ID="a0dcf1ba-2ef3-ca06-ed42-8ae37c632eaf",ColumnName="AD_Column_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="084db087-1100-ad15-806b-d1b94a96650c",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="d74832f7-abc3-b907-dd63-272aaf8bc681",Synchronized="2019-08-30 22:20:34.0")
/** Column name AD_Column_ID */
public static final String COLUMNNAME_AD_Column_ID = "AD_Column_ID";
/** Set Label printer Function.
@param AD_LabelPrinterFunction_ID Function of Label Printer */
public void setAD_LabelPrinterFunction_ID (int AD_LabelPrinterFunction_ID)
{
if (AD_LabelPrinterFunction_ID < 1) throw new IllegalArgumentException ("AD_LabelPrinterFunction_ID is mandatory.");
set_Value (COLUMNNAME_AD_LabelPrinterFunction_ID, Integer.valueOf(AD_LabelPrinterFunction_ID));
}
/** Get Label printer Function.
@return Function of Label Printer */
public int getAD_LabelPrinterFunction_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_LabelPrinterFunction_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d5400fac-b529-6e59-7fcd-c79519c61fb3")
public static String es_PE_FIELD_Line_LabelPrinterFunction_Name="Función de la Impresión de Etiqueta";

@XendraTrl(Identifier="d5400fac-b529-6e59-7fcd-c79519c61fb3")
public static String es_PE_FIELD_Line_LabelPrinterFunction_Description="Función de la impresión de etiqueta";

@XendraField(AD_Column_ID="AD_LabelPrinterFunction_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b4f3ee34-6563-d632-44a5-24a32e22838f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d5400fac-b529-6e59-7fcd-c79519c61fb3")
public static final String FIELDNAME_Line_LabelPrinterFunction="d5400fac-b529-6e59-7fcd-c79519c61fb3";

@XendraTrl(Identifier="9af2a727-8eaf-b0ce-999d-6f73febc00a5")
public static String es_PE_COLUMN_AD_LabelPrinterFunction_ID_Name="Función de la Impresión de Etiqueta";

@XendraColumn(AD_Element_ID="9ac1d69e-6584-a52c-e8d7-7b62fda1e1f5",
ColumnName="AD_LabelPrinterFunction_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",
AD_Val_Rule_ID="d058de22-5420-c76d-9c1b-41c5a6de8c85",FieldLength=22,DefaultValue="",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9af2a727-8eaf-b0ce-999d-6f73febc00a5",
Synchronized="2019-08-30 22:20:34.0")
/** Column name AD_LabelPrinterFunction_ID */
public static final String COLUMNNAME_AD_LabelPrinterFunction_ID = "AD_LabelPrinterFunction_ID";
/** Set Print Label.
@param AD_PrintLabel_ID Label Format to print */
public void setAD_PrintLabel_ID (int AD_PrintLabel_ID)
{
if (AD_PrintLabel_ID < 1) throw new IllegalArgumentException ("AD_PrintLabel_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_PrintLabel_ID, Integer.valueOf(AD_PrintLabel_ID));
}
/** Get Print Label.
@return Label Format to print */
public int getAD_PrintLabel_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_PrintLabel_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f020a439-8c54-490b-e52b-c85c78411185")
public static String es_PE_FIELD_Line_PrintLabel_Name="Etiqueta Impresión";

@XendraTrl(Identifier="f020a439-8c54-490b-e52b-c85c78411185")
public static String es_PE_FIELD_Line_PrintLabel_Description="Formato de la etiqueta a imprimir";

@XendraTrl(Identifier="f020a439-8c54-490b-e52b-c85c78411185")
public static String es_PE_FIELD_Line_PrintLabel_Help="Formato para imprimir etiqueta";

@XendraField(AD_Column_ID="AD_PrintLabel_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b4f3ee34-6563-d632-44a5-24a32e22838f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f020a439-8c54-490b-e52b-c85c78411185")
public static final String FIELDNAME_Line_PrintLabel="f020a439-8c54-490b-e52b-c85c78411185";

@XendraTrl(Identifier="b4d66df3-83db-dc4f-306d-c0619d70dd92")
public static String es_PE_COLUMN_AD_PrintLabel_ID_Name="Etiqueta Impresión";

@XendraColumn(AD_Element_ID="b21118b8-7b0e-d071-330c-0a6775bb5687",ColumnName="AD_PrintLabel_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b4d66df3-83db-dc4f-306d-c0619d70dd92",
Synchronized="2019-08-30 22:20:34.0")
/** Column name AD_PrintLabel_ID */
public static final String COLUMNNAME_AD_PrintLabel_ID = "AD_PrintLabel_ID";
/** Set Print Label Line.
@param AD_PrintLabelLine_ID Print Label Line Format */
public void setAD_PrintLabelLine_ID (int AD_PrintLabelLine_ID)
{
if (AD_PrintLabelLine_ID < 1) throw new IllegalArgumentException ("AD_PrintLabelLine_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_PrintLabelLine_ID, Integer.valueOf(AD_PrintLabelLine_ID));
}
/** Get Print Label Line.
@return Print Label Line Format */
public int getAD_PrintLabelLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_PrintLabelLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="b1b8fa1b-5180-0f59-53b9-9196e1a14da0")
public static String es_PE_FIELD_Line_PrintLabelLine_Name="Impresión Etiqueta Linea";

@XendraTrl(Identifier="b1b8fa1b-5180-0f59-53b9-9196e1a14da0")
public static String es_PE_FIELD_Line_PrintLabelLine_Description="Impresión de etiqueta con formato de linea.";

@XendraTrl(Identifier="b1b8fa1b-5180-0f59-53b9-9196e1a14da0")
public static String es_PE_FIELD_Line_PrintLabelLine_Help="Formato de linea en la etiqueta.";

@XendraField(AD_Column_ID="AD_PrintLabelLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b4f3ee34-6563-d632-44a5-24a32e22838f",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b1b8fa1b-5180-0f59-53b9-9196e1a14da0")
public static final String FIELDNAME_Line_PrintLabelLine="b1b8fa1b-5180-0f59-53b9-9196e1a14da0";
/** Column name AD_PrintLabelLine_ID */
public static final String COLUMNNAME_AD_PrintLabelLine_ID = "AD_PrintLabelLine_ID";
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
@XendraTrl(Identifier="80b6a768-9934-403b-ab9e-7bce217e967c")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="80b6a768-9934-403b-ab9e-7bce217e967c",
Synchronized="2019-08-30 22:20:34.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Label Format Type.
@param LabelFormatType Label Format Type */
public void setLabelFormatType (String LabelFormatType)
{
if (LabelFormatType.length() > 1)
{
log.warning("Length > 1 - truncated");
LabelFormatType = LabelFormatType.substring(0,0);
}
set_Value (COLUMNNAME_LabelFormatType, LabelFormatType);
}
/** Get Label Format Type.
@return Label Format Type */
public String getLabelFormatType() 
{
return (String)get_Value(COLUMNNAME_LabelFormatType);
}

@XendraTrl(Identifier="c3a278f2-4ca0-74c0-1cd6-f20262628a81")
public static String es_PE_FIELD_Line_LabelFormatType_Name="Tipo del Formato de la Etiqueta";

@XendraTrl(Identifier="c3a278f2-4ca0-74c0-1cd6-f20262628a81")
public static String es_PE_FIELD_Line_LabelFormatType_Description="Tipo del Formato de la Etiqueta";

@XendraField(AD_Column_ID="LabelFormatType",IsCentrallyMaintained=true,
AD_Tab_ID="b4f3ee34-6563-d632-44a5-24a32e22838f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c3a278f2-4ca0-74c0-1cd6-f20262628a81")
public static final String FIELDNAME_Line_LabelFormatType="c3a278f2-4ca0-74c0-1cd6-f20262628a81";

@XendraTrl(Identifier="c7bc15d2-aba6-ce7b-49b2-6a3e016293be")
public static String es_PE_COLUMN_LabelFormatType_Name="Tipo del Formato de la Etiqueta";

@XendraColumn(AD_Element_ID="cd76ee78-b24e-4e15-3ef4-3fcf5b1f86a3",ColumnName="LabelFormatType",
AD_Reference_ID=17,AD_Reference_Value_ID="15f6fee1-f96a-305c-8322-4fa07ae1266a",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="F",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="c7bc15d2-aba6-ce7b-49b2-6a3e016293be",Synchronized="2019-08-30 22:20:34.0")
/** Column name LabelFormatType */
public static final String COLUMNNAME_LabelFormatType = "LabelFormatType";
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
@XendraTrl(Identifier="1dfa9875-e82c-683c-51e9-d2f145f8a019")
public static String es_PE_FIELD_Line_Name_Name="Nombre";

@XendraTrl(Identifier="1dfa9875-e82c-683c-51e9-d2f145f8a019")
public static String es_PE_FIELD_Line_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="1dfa9875-e82c-683c-51e9-d2f145f8a019")
public static String es_PE_FIELD_Line_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="b4f3ee34-6563-d632-44a5-24a32e22838f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1dfa9875-e82c-683c-51e9-d2f145f8a019")
public static final String FIELDNAME_Line_Name="1dfa9875-e82c-683c-51e9-d2f145f8a019";

@XendraTrl(Identifier="7b43eaee-d3bb-d9dd-3584-c70de14c50b2")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=2,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7b43eaee-d3bb-d9dd-3584-c70de14c50b2",
Synchronized="2019-08-30 22:20:34.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Print Text.
@param PrintName The label text to be printed on a document or correspondence. */
public void setPrintName (String PrintName)
{
if (PrintName != null && PrintName.length() > 60)
{
log.warning("Length > 60 - truncated");
PrintName = PrintName.substring(0,59);
}
set_Value (COLUMNNAME_PrintName, PrintName);
}
/** Get Print Text.
@return The label text to be printed on a document or correspondence. */
public String getPrintName() 
{
String value = (String)get_Value(COLUMNNAME_PrintName);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="46ae9773-cf49-624a-0540-972f7cf71c1d")
public static String es_PE_FIELD_Line_PrintText_Name="Nombre a ser Impreso";

@XendraTrl(Identifier="46ae9773-cf49-624a-0540-972f7cf71c1d")
public static String es_PE_FIELD_Line_PrintText_Description="Indica el nombre a ser impreso en un documento ó correspondencia";

@XendraTrl(Identifier="46ae9773-cf49-624a-0540-972f7cf71c1d")
public static String es_PE_FIELD_Line_PrintText_Help="El nombre a ser Impreso indica el nombre que será impreso en un documento ó correspondencia";

@XendraField(AD_Column_ID="PrintName",IsCentrallyMaintained=true,
AD_Tab_ID="b4f3ee34-6563-d632-44a5-24a32e22838f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="@LabelFormatType@=T",DisplayLength=60,IsReadOnly=false,SeqNo=90,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="46ae9773-cf49-624a-0540-972f7cf71c1d")
public static final String FIELDNAME_Line_PrintText="46ae9773-cf49-624a-0540-972f7cf71c1d";

@XendraTrl(Identifier="8cb49f7b-9bd6-8f48-31aa-bc1e8c0ac35a")
public static String es_PE_COLUMN_PrintName_Name="Nombre a ser Impreso";

@XendraColumn(AD_Element_ID="83f7d1df-e4e7-adff-3bda-43555a334585",ColumnName="PrintName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8cb49f7b-9bd6-8f48-31aa-bc1e8c0ac35a",
Synchronized="2019-08-30 22:20:34.0")
/** Column name PrintName */
public static final String COLUMNNAME_PrintName = "PrintName";
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
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getSeqNo()));
}

@XendraTrl(Identifier="cf193668-3b1b-f9ae-ca74-b1bd610adc46")
public static String es_PE_FIELD_Line_Sequence_Name="Secuencia";

@XendraTrl(Identifier="cf193668-3b1b-f9ae-ca74-b1bd610adc46")
public static String es_PE_FIELD_Line_Sequence_Description="Método de ordenar registros; el número más bajo viene primero";

@XendraTrl(Identifier="cf193668-3b1b-f9ae-ca74-b1bd610adc46")
public static String es_PE_FIELD_Line_Sequence_Help="La Secuencia indica el orden de los registros";

@XendraField(AD_Column_ID="SeqNo",IsCentrallyMaintained=true,
AD_Tab_ID="b4f3ee34-6563-d632-44a5-24a32e22838f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=50,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cf193668-3b1b-f9ae-ca74-b1bd610adc46")
public static final String FIELDNAME_Line_Sequence="cf193668-3b1b-f9ae-ca74-b1bd610adc46";

@XendraTrl(Identifier="0d222328-1c97-f63a-7153-cdd39b8e3484")
public static String es_PE_COLUMN_SeqNo_Name="Secuencia";

@XendraColumn(AD_Element_ID="38fa26fe-b59d-fce1-c129-420b57da738b",ColumnName="SeqNo",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0d222328-1c97-f63a-7153-cdd39b8e3484",
Synchronized="2019-08-30 22:20:34.0")
/** Column name SeqNo */
public static final String COLUMNNAME_SeqNo = "SeqNo";
/** Set X Position.
@param XPosition Absolute X (horizontal) position in 1/72 of an inch */
public void setXPosition (int XPosition)
{
set_Value (COLUMNNAME_XPosition, Integer.valueOf(XPosition));
}
/** Get X Position.
@return Absolute X (horizontal) position in 1/72 of an inch */
public int getXPosition() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_XPosition);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="05505cb9-f156-df9c-96df-436ad1684aaf")
public static String es_PE_FIELD_Line_XPosition_Name="Posición X";

@XendraTrl(Identifier="05505cb9-f156-df9c-96df-436ad1684aaf")
public static String es_PE_FIELD_Line_XPosition_Description="Posición absoluta X (horizontal) en 1/72 de pulgada";

@XendraTrl(Identifier="05505cb9-f156-df9c-96df-436ad1684aaf")
public static String es_PE_FIELD_Line_XPosition_Help="Posición absoluta X (horizontal) en 1/72 de pulgada";

@XendraField(AD_Column_ID="XPosition",IsCentrallyMaintained=true,
AD_Tab_ID="b4f3ee34-6563-d632-44a5-24a32e22838f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="05505cb9-f156-df9c-96df-436ad1684aaf")
public static final String FIELDNAME_Line_XPosition="05505cb9-f156-df9c-96df-436ad1684aaf";

@XendraTrl(Identifier="5b506a2e-a507-ab8d-d4cf-e5861629333b")
public static String es_PE_COLUMN_XPosition_Name="Posición X";

@XendraColumn(AD_Element_ID="c9e199b8-4285-b714-7ca0-2a2ce8f49a8c",ColumnName="XPosition",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5b506a2e-a507-ab8d-d4cf-e5861629333b",
Synchronized="2019-08-30 22:20:34.0")
/** Column name XPosition */
public static final String COLUMNNAME_XPosition = "XPosition";
/** Set Y Position.
@param YPosition Absolute Y (vertical) position in 1/72 of an inch */
public void setYPosition (int YPosition)
{
set_Value (COLUMNNAME_YPosition, Integer.valueOf(YPosition));
}
/** Get Y Position.
@return Absolute Y (vertical) position in 1/72 of an inch */
public int getYPosition() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_YPosition);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="115e6dcd-a53e-6549-4d11-c8fe1cb8fcd8")
public static String es_PE_FIELD_Line_YPosition_Name="Posición Y";

@XendraTrl(Identifier="115e6dcd-a53e-6549-4d11-c8fe1cb8fcd8")
public static String es_PE_FIELD_Line_YPosition_Description="Posición absoluta Y (vertical) en 1/72 de pulgada";

@XendraTrl(Identifier="115e6dcd-a53e-6549-4d11-c8fe1cb8fcd8")
public static String es_PE_FIELD_Line_YPosition_Help="Posición absoluta Y (vertical) en 1/72 de pulgada";

@XendraField(AD_Column_ID="YPosition",IsCentrallyMaintained=true,
AD_Tab_ID="b4f3ee34-6563-d632-44a5-24a32e22838f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="115e6dcd-a53e-6549-4d11-c8fe1cb8fcd8")
public static final String FIELDNAME_Line_YPosition="115e6dcd-a53e-6549-4d11-c8fe1cb8fcd8";

@XendraTrl(Identifier="59b64ea7-ea20-e122-1cfe-ea46c9235198")
public static String es_PE_COLUMN_YPosition_Name="Posición Y";

@XendraColumn(AD_Element_ID="fa498dfa-2429-1705-70ab-df8eb3c62eab",ColumnName="YPosition",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="59b64ea7-ea20-e122-1cfe-ea46c9235198",
Synchronized="2019-08-30 22:20:34.0")
/** Column name YPosition */
public static final String COLUMNNAME_YPosition = "YPosition";
}
