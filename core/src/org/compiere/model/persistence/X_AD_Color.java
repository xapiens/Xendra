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
/** Generated Model for AD_Color
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_Color extends PO
{
/** Standard Constructor
@param ctx context
@param AD_Color_ID id
@param trxName transaction
*/
public X_AD_Color (Properties ctx, int AD_Color_ID, String trxName)
{
super (ctx, AD_Color_ID, trxName);
/** if (AD_Color_ID == 0)
{
setAD_Color_ID (0);
setAlpha (0);
setBlue (0);
setColorType (null);
setGreen (0);
setImageAlpha (Env.ZERO);
setIsDefault (false);	
// N
setName (null);
setRed (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_Color (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=457 */
public static int Table_ID=MTable.getTable_ID("AD_Color");

@XendraTrl(Identifier="2ffa5639-6d2c-2e13-c952-8c0dcabca8b0")
public static String es_PE_TAB_SystemColor_Description="Color del Sistema para Fondos e Indicadores";

@XendraTrl(Identifier="2ffa5639-6d2c-2e13-c952-8c0dcabca8b0")
public static String es_PE_TAB_SystemColor_Name="Color del Sistema";
@XendraTab(Name="System Color",
Description="System color for backgrounds and indicators",Help="",
AD_Window_ID="7c0c8145-1309-b1e0-6e51-17df228ab1b6",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="2ffa5639-6d2c-2e13-c952-8c0dcabca8b0",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_SystemColor="2ffa5639-6d2c-2e13-c952-8c0dcabca8b0";

@XendraTrl(Identifier="94c1eeb2-f8cf-3d88-1c63-c2926f08fef3")
public static String es_PE_TABLE_AD_Color_Name="Color";

@XendraTable(Name="System Color",AD_Package_ID="140d4d0c-8da8-bcb6-9c20-bc776701f80c",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",
Description="Color for backgrounds or indicators",Help="",TableName="AD_Color",AccessLevel="4",
AD_Window_ID="7c0c8145-1309-b1e0-6e51-17df228ab1b6",AD_Val_Rule_ID="",IsKey=1,LoadSeq=45,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.dictionary",Identifier="94c1eeb2-f8cf-3d88-1c63-c2926f08fef3",
Synchronized="2020-03-03 21:34:55.0")
/** TableName=AD_Color */
public static final String Table_Name="AD_Color";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_Color");

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
    Table_ID = MTable.getTable_ID("AD_Color");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_Color[").append(get_ID()).append("]");
return sb.toString();
}
/** Set System Color.
@param AD_Color_ID Color for backgrounds or indicators */
public void setAD_Color_ID (int AD_Color_ID)
{
if (AD_Color_ID < 1) throw new IllegalArgumentException ("AD_Color_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_Color_ID, Integer.valueOf(AD_Color_ID));
}
/** Get System Color.
@return Color for backgrounds or indicators */
public int getAD_Color_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Color_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="aa309ca1-1146-1241-1b3e-fde26ff0a8db")
public static String es_PE_FIELD_SystemColor_SystemColor_Name="Color";

@XendraTrl(Identifier="aa309ca1-1146-1241-1b3e-fde26ff0a8db")
public static String es_PE_FIELD_SystemColor_SystemColor_Description="Color para el fondo ó indicadores";

@XendraField(AD_Column_ID="AD_Color_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2ffa5639-6d2c-2e13-c952-8c0dcabca8b0",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="aa309ca1-1146-1241-1b3e-fde26ff0a8db")
public static final String FIELDNAME_SystemColor_SystemColor="aa309ca1-1146-1241-1b3e-fde26ff0a8db";
/** Column name AD_Color_ID */
public static final String COLUMNNAME_AD_Color_ID = "AD_Color_ID";
/** Set Image.
@param AD_Image_ID Image or Icon */
public void setAD_Image_ID (int AD_Image_ID)
{
if (AD_Image_ID <= 0) set_Value (COLUMNNAME_AD_Image_ID, null);
 else 
set_Value (COLUMNNAME_AD_Image_ID, Integer.valueOf(AD_Image_ID));
}
/** Get Image.
@return Image or Icon */
public int getAD_Image_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Image_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="fb5a1495-ef7e-2d19-9e7d-aeac247ba94d")
public static String es_PE_FIELD_SystemColor_Image_Name="Imagen";

@XendraTrl(Identifier="fb5a1495-ef7e-2d19-9e7d-aeac247ba94d")
public static String es_PE_FIELD_SystemColor_Image_Description="Imagen del sistema";

@XendraField(AD_Column_ID="AD_Image_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2ffa5639-6d2c-2e13-c952-8c0dcabca8b0",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@ColorType@=P",DisplayLength=14,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fb5a1495-ef7e-2d19-9e7d-aeac247ba94d")
public static final String FIELDNAME_SystemColor_Image="fb5a1495-ef7e-2d19-9e7d-aeac247ba94d";

@XendraTrl(Identifier="3b84633e-a65e-bb51-257f-d70109e642e6")
public static String es_PE_COLUMN_AD_Image_ID_Name="Imagen";

@XendraColumn(AD_Element_ID="8464640e-ab89-67ff-b78b-1e8940657a22",ColumnName="AD_Image_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3b84633e-a65e-bb51-257f-d70109e642e6",
Synchronized="2020-03-03 21:34:28.0")
/** Column name AD_Image_ID */
public static final String COLUMNNAME_AD_Image_ID = "AD_Image_ID";
/** Set Alpha.
@param Alpha Color Alpha value 0-255 */
public void setAlpha (int Alpha)
{
set_Value (COLUMNNAME_Alpha, Integer.valueOf(Alpha));
}
/** Get Alpha.
@return Color Alpha value 0-255 */
public int getAlpha() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Alpha);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="a5810afd-d47c-fc0f-b429-4e1ea2454e62")
public static String es_PE_FIELD_SystemColor_Alpha_Name="Alfa";

@XendraTrl(Identifier="a5810afd-d47c-fc0f-b429-4e1ea2454e62")
public static String es_PE_FIELD_SystemColor_Alpha_Description="Color Alpha value 0-255";

@XendraField(AD_Column_ID="Alpha",IsCentrallyMaintained=true,
AD_Tab_ID="2ffa5639-6d2c-2e13-c952-8c0dcabca8b0",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a5810afd-d47c-fc0f-b429-4e1ea2454e62")
public static final String FIELDNAME_SystemColor_Alpha="a5810afd-d47c-fc0f-b429-4e1ea2454e62";

@XendraTrl(Identifier="2a3efa17-6915-0a4b-9647-a05d361ad613")
public static String es_PE_COLUMN_Alpha_Name="Alfa";

@XendraColumn(AD_Element_ID="d380f58c-7d50-29ff-b4e3-81a08f889bd4",ColumnName="Alpha",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2a3efa17-6915-0a4b-9647-a05d361ad613",
Synchronized="2020-03-03 21:34:28.0")
/** Column name Alpha */
public static final String COLUMNNAME_Alpha = "Alpha";
/** Set 2nd Alpha.
@param Alpha_1 Alpha value for second color */
public void setAlpha_1 (int Alpha_1)
{
set_Value (COLUMNNAME_Alpha_1, Integer.valueOf(Alpha_1));
}
/** Get 2nd Alpha.
@return Alpha value for second color */
public int getAlpha_1() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Alpha_1);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="704c446c-2f0e-c875-26d4-0ad6608dcc91")
public static String es_PE_FIELD_SystemColor_2ndAlpha_Name="2do. Alfa";

@XendraTrl(Identifier="704c446c-2f0e-c875-26d4-0ad6608dcc91")
public static String es_PE_FIELD_SystemColor_2ndAlpha_Description="valor de la alfa para el segundo color";

@XendraField(AD_Column_ID="Alpha_1",IsCentrallyMaintained=true,
AD_Tab_ID="2ffa5639-6d2c-2e13-c952-8c0dcabca8b0",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@ColorType@=G | @ColorType@=L",DisplayLength=11,IsReadOnly=false,SeqNo=140,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="704c446c-2f0e-c875-26d4-0ad6608dcc91")
public static final String FIELDNAME_SystemColor_2ndAlpha="704c446c-2f0e-c875-26d4-0ad6608dcc91";

@XendraTrl(Identifier="7036d9f2-7bd7-231f-306e-2198c58a4db4")
public static String es_PE_COLUMN_Alpha_1_Name="2do. Alfa";

@XendraColumn(AD_Element_ID="f54b755a-53fb-9f04-8d25-46f195da8895",ColumnName="Alpha_1",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7036d9f2-7bd7-231f-306e-2198c58a4db4",
Synchronized="2020-03-03 21:34:28.0")
/** Column name Alpha_1 */
public static final String COLUMNNAME_Alpha_1 = "Alpha_1";
/** Set Blue.
@param Blue Color RGB blue value */
public void setBlue (int Blue)
{
set_Value (COLUMNNAME_Blue, Integer.valueOf(Blue));
}
/** Get Blue.
@return Color RGB blue value */
public int getBlue() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Blue);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="240ab9d3-66cc-2e96-f4e6-e73baad6df7e")
public static String es_PE_FIELD_SystemColor_Blue_Name="Azul";

@XendraTrl(Identifier="240ab9d3-66cc-2e96-f4e6-e73baad6df7e")
public static String es_PE_FIELD_SystemColor_Blue_Description="Color RGB blue value";

@XendraField(AD_Column_ID="Blue",IsCentrallyMaintained=true,
AD_Tab_ID="2ffa5639-6d2c-2e13-c952-8c0dcabca8b0",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="240ab9d3-66cc-2e96-f4e6-e73baad6df7e")
public static final String FIELDNAME_SystemColor_Blue="240ab9d3-66cc-2e96-f4e6-e73baad6df7e";

@XendraTrl(Identifier="0e4ecd5f-c188-2176-400e-824b00b6b1df")
public static String es_PE_COLUMN_Blue_Name="Azul";

@XendraColumn(AD_Element_ID="5c1b7970-8156-9361-69e6-33e6a70f38e9",ColumnName="Blue",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0e4ecd5f-c188-2176-400e-824b00b6b1df",
Synchronized="2020-03-03 21:34:28.0")
/** Column name Blue */
public static final String COLUMNNAME_Blue = "Blue";
/** Set 2nd Blue.
@param Blue_1 RGB value for second color */
public void setBlue_1 (int Blue_1)
{
set_Value (COLUMNNAME_Blue_1, Integer.valueOf(Blue_1));
}
/** Get 2nd Blue.
@return RGB value for second color */
public int getBlue_1() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Blue_1);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ff650ad1-d81a-11f7-aba6-edde6fe6b48b")
public static String es_PE_FIELD_SystemColor_2ndBlue_Name="2do. Azul";

@XendraTrl(Identifier="ff650ad1-d81a-11f7-aba6-edde6fe6b48b")
public static String es_PE_FIELD_SystemColor_2ndBlue_Description="RGB valor por segundo color";

@XendraField(AD_Column_ID="Blue_1",IsCentrallyMaintained=true,
AD_Tab_ID="2ffa5639-6d2c-2e13-c952-8c0dcabca8b0",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@ColorType@=G | @ColorType@=L",DisplayLength=11,IsReadOnly=false,SeqNo=120,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="ff650ad1-d81a-11f7-aba6-edde6fe6b48b")
public static final String FIELDNAME_SystemColor_2ndBlue="ff650ad1-d81a-11f7-aba6-edde6fe6b48b";

@XendraTrl(Identifier="abcfd271-7284-0431-e303-392b01e5819d")
public static String es_PE_COLUMN_Blue_1_Name="2do. Azul";

@XendraColumn(AD_Element_ID="4bbccc9e-6fee-6afc-d008-416d2490b734",ColumnName="Blue_1",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="abcfd271-7284-0431-e303-392b01e5819d",
Synchronized="2020-03-03 21:34:28.0")
/** Column name Blue_1 */
public static final String COLUMNNAME_Blue_1 = "Blue_1";
/** Set Color Type.
@param ColorType Color presentation for this color */
public void setColorType (Object ColorType)
{
set_Value (COLUMNNAME_ColorType, ColorType);
}
/** Get Color Type.
@return Color presentation for this color */
public Object getColorType() 
{
return get_Value(COLUMNNAME_ColorType);
}

@XendraTrl(Identifier="3efc202f-b41a-52fa-4f6d-1e1144ed10cb")
public static String es_PE_FIELD_SystemColor_ColorType_Name="Tipo de Color";

@XendraTrl(Identifier="3efc202f-b41a-52fa-4f6d-1e1144ed10cb")
public static String es_PE_FIELD_SystemColor_ColorType_Description="Color de presentación para este color";

@XendraField(AD_Column_ID="ColorType",IsCentrallyMaintained=true,
AD_Tab_ID="2ffa5639-6d2c-2e13-c952-8c0dcabca8b0",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=210,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3efc202f-b41a-52fa-4f6d-1e1144ed10cb")
public static final String FIELDNAME_SystemColor_ColorType="3efc202f-b41a-52fa-4f6d-1e1144ed10cb";

@XendraTrl(Identifier="5ddaba48-6060-7872-4f82-57db6e97de79")
public static String es_PE_COLUMN_ColorType_Name="Tipo de Color";

@XendraColumn(AD_Element_ID="3a813da7-1748-f8be-d669-85d576fbaa6a",ColumnName="ColorType",
AD_Reference_ID=27,AD_Reference_Value_ID="e845bde3-ac75-7195-ec6f-8e3e8fa53abd",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="5ddaba48-6060-7872-4f82-57db6e97de79",Synchronized="2020-03-03 21:34:28.0")
/** Column name ColorType */
public static final String COLUMNNAME_ColorType = "ColorType";
/** Set Green.
@param Green RGB value  */
public void setGreen (int Green)
{
set_Value (COLUMNNAME_Green, Integer.valueOf(Green));
}
/** Get Green.
@return RGB value  */
public int getGreen() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Green);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="c43cf74a-cfcf-9449-68ac-d8d0fb2ee7eb")
public static String es_PE_FIELD_SystemColor_Green_Name="Verde";

@XendraTrl(Identifier="c43cf74a-cfcf-9449-68ac-d8d0fb2ee7eb")
public static String es_PE_FIELD_SystemColor_Green_Description="Valor RGB";

@XendraField(AD_Column_ID="Green",IsCentrallyMaintained=true,
AD_Tab_ID="2ffa5639-6d2c-2e13-c952-8c0dcabca8b0",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c43cf74a-cfcf-9449-68ac-d8d0fb2ee7eb")
public static final String FIELDNAME_SystemColor_Green="c43cf74a-cfcf-9449-68ac-d8d0fb2ee7eb";

@XendraTrl(Identifier="96540d67-48ed-1e65-b237-6f5110c69552")
public static String es_PE_COLUMN_Green_Name="Verde";

@XendraColumn(AD_Element_ID="42ae79a6-0a3b-690e-cc80-4f145d1823ef",ColumnName="Green",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="96540d67-48ed-1e65-b237-6f5110c69552",
Synchronized="2020-03-03 21:34:28.0")
/** Column name Green */
public static final String COLUMNNAME_Green = "Green";
/** Set 2nd Green.
@param Green_1 RGB value for second color */
public void setGreen_1 (int Green_1)
{
set_Value (COLUMNNAME_Green_1, Integer.valueOf(Green_1));
}
/** Get 2nd Green.
@return RGB value for second color */
public int getGreen_1() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Green_1);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="bab9bfd9-8452-23a5-bbd4-3d53a215ff98")
public static String es_PE_FIELD_SystemColor_2ndGreen_Name="2do. Verde";

@XendraTrl(Identifier="bab9bfd9-8452-23a5-bbd4-3d53a215ff98")
public static String es_PE_FIELD_SystemColor_2ndGreen_Description="RGB valor para segundo color";

@XendraField(AD_Column_ID="Green_1",IsCentrallyMaintained=true,
AD_Tab_ID="2ffa5639-6d2c-2e13-c952-8c0dcabca8b0",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@ColorType@=G | @ColorType@=L",DisplayLength=11,IsReadOnly=false,SeqNo=100,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="bab9bfd9-8452-23a5-bbd4-3d53a215ff98")
public static final String FIELDNAME_SystemColor_2ndGreen="bab9bfd9-8452-23a5-bbd4-3d53a215ff98";

@XendraTrl(Identifier="ad3dfce4-d915-9a6b-f687-2a4fb32d2bba")
public static String es_PE_COLUMN_Green_1_Name="2do. Verde";

@XendraColumn(AD_Element_ID="01d1c070-98e5-432d-8373-8d220da02d26",ColumnName="Green_1",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ad3dfce4-d915-9a6b-f687-2a4fb32d2bba",
Synchronized="2020-03-03 21:34:28.0")
/** Column name Green_1 */
public static final String COLUMNNAME_Green_1 = "Green_1";
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
@XendraTrl(Identifier="9281a814-9260-44d4-8954-bcf167d659c5")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9281a814-9260-44d4-8954-bcf167d659c5",
Synchronized="2020-03-03 21:34:28.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Image Alpha .
@param ImageAlpha Image Texture Composite Alpha */
public void setImageAlpha (BigDecimal ImageAlpha)
{
if (ImageAlpha == null) throw new IllegalArgumentException ("ImageAlpha is mandatory.");
set_Value (COLUMNNAME_ImageAlpha, ImageAlpha);
}
/** Get Image Alpha .
@return Image Texture Composite Alpha */
public BigDecimal getImageAlpha() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_ImageAlpha);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="b9ed535d-445a-f832-1714-232399aa85d7")
public static String es_PE_FIELD_SystemColor_ImageAlpha_Name="Imagen Alfa";

@XendraTrl(Identifier="b9ed535d-445a-f832-1714-232399aa85d7")
public static String es_PE_FIELD_SystemColor_ImageAlpha_Description="Imagen alfa del compuesto de textura.";

@XendraTrl(Identifier="b9ed535d-445a-f832-1714-232399aa85d7")
public static String es_PE_FIELD_SystemColor_ImageAlpha_Help="Compuesto factor alfa para la corrección del color.";

@XendraField(AD_Column_ID="ImageAlpha",IsCentrallyMaintained=true,
AD_Tab_ID="2ffa5639-6d2c-2e13-c952-8c0dcabca8b0",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@ColorType@=P",DisplayLength=26,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b9ed535d-445a-f832-1714-232399aa85d7")
public static final String FIELDNAME_SystemColor_ImageAlpha="b9ed535d-445a-f832-1714-232399aa85d7";

@XendraTrl(Identifier="04edae94-95b3-84e0-c854-8fceec573501")
public static String es_PE_COLUMN_ImageAlpha_Name="Imagen Alfa";

@XendraColumn(AD_Element_ID="ae3739e2-9c1c-c9d8-ef29-95b6072c4cfc",ColumnName="ImageAlpha",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="04edae94-95b3-84e0-c854-8fceec573501",
Synchronized="2020-03-03 21:34:28.0")
/** Column name ImageAlpha */
public static final String COLUMNNAME_ImageAlpha = "ImageAlpha";
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

@XendraTrl(Identifier="bee1815c-56ff-b1de-147d-196521b7307c")
public static String es_PE_FIELD_SystemColor_Default_Name="Predeterminado";

@XendraTrl(Identifier="bee1815c-56ff-b1de-147d-196521b7307c")
public static String es_PE_FIELD_SystemColor_Default_Description="Valor Predeterminado";

@XendraTrl(Identifier="bee1815c-56ff-b1de-147d-196521b7307c")
public static String es_PE_FIELD_SystemColor_Default_Help="El cuadro de verificación indica si este registro será usado como un valor predeterminado";

@XendraField(AD_Column_ID="IsDefault",IsCentrallyMaintained=true,
AD_Tab_ID="2ffa5639-6d2c-2e13-c952-8c0dcabca8b0",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bee1815c-56ff-b1de-147d-196521b7307c")
public static final String FIELDNAME_SystemColor_Default="bee1815c-56ff-b1de-147d-196521b7307c";

@XendraTrl(Identifier="a5496fbe-2414-8210-74c9-29f9b0b373bc")
public static String es_PE_COLUMN_IsDefault_Name="Predeterminado";

@XendraColumn(AD_Element_ID="8617f892-e113-a5fd-8715-687f792f136c",ColumnName="IsDefault",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a5496fbe-2414-8210-74c9-29f9b0b373bc",
Synchronized="2020-03-03 21:34:28.0")
/** Column name IsDefault */
public static final String COLUMNNAME_IsDefault = "IsDefault";
/** Set Line Distance.
@param LineDistance Distance between lines */
public void setLineDistance (int LineDistance)
{
set_Value (COLUMNNAME_LineDistance, Integer.valueOf(LineDistance));
}
/** Get Line Distance.
@return Distance between lines */
public int getLineDistance() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_LineDistance);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f9d180cc-c62d-f804-1229-709cec9754e1")
public static String es_PE_FIELD_SystemColor_LineDistance_Name="Distancia entre Líneas";

@XendraTrl(Identifier="f9d180cc-c62d-f804-1229-709cec9754e1")
public static String es_PE_FIELD_SystemColor_LineDistance_Description="Distancia entre líneas";

@XendraField(AD_Column_ID="LineDistance",IsCentrallyMaintained=true,
AD_Tab_ID="2ffa5639-6d2c-2e13-c952-8c0dcabca8b0",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@ColorType@=L",DisplayLength=11,IsReadOnly=false,SeqNo=180,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f9d180cc-c62d-f804-1229-709cec9754e1")
public static final String FIELDNAME_SystemColor_LineDistance="f9d180cc-c62d-f804-1229-709cec9754e1";

@XendraTrl(Identifier="62305a24-1923-1612-38b3-2740abb0e78d")
public static String es_PE_COLUMN_LineDistance_Name="Distancia entre Líneas";

@XendraColumn(AD_Element_ID="267ea696-e1cc-46e0-2b41-e9e9a8a019e8",ColumnName="LineDistance",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="62305a24-1923-1612-38b3-2740abb0e78d",
Synchronized="2020-03-03 21:34:28.0")
/** Column name LineDistance */
public static final String COLUMNNAME_LineDistance = "LineDistance";
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

@XendraTrl(Identifier="8364ef16-6182-0971-7279-a27b3fa6e731")
public static String es_PE_FIELD_SystemColor_LineWidth_Name="Anchura De la Línea";

@XendraTrl(Identifier="8364ef16-6182-0971-7279-a27b3fa6e731")
public static String es_PE_FIELD_SystemColor_LineWidth_Description="Ancho de las líneas";

@XendraTrl(Identifier="8364ef16-6182-0971-7279-a27b3fa6e731")
public static String es_PE_FIELD_SystemColor_LineWidth_Help="El ancho fisico de las lineas.";

@XendraField(AD_Column_ID="LineWidth",IsCentrallyMaintained=true,
AD_Tab_ID="2ffa5639-6d2c-2e13-c952-8c0dcabca8b0",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@ColorType@=L",DisplayLength=11,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8364ef16-6182-0971-7279-a27b3fa6e731")
public static final String FIELDNAME_SystemColor_LineWidth="8364ef16-6182-0971-7279-a27b3fa6e731";

@XendraTrl(Identifier="8411161b-0e43-c996-ba73-14b4915ab25e")
public static String es_PE_COLUMN_LineWidth_Name="Anchura De la Línea";

@XendraColumn(AD_Element_ID="24edf213-5acf-bae9-2ffb-b044dbd33413",ColumnName="LineWidth",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8411161b-0e43-c996-ba73-14b4915ab25e",
Synchronized="2020-03-03 21:34:28.0")
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

@XendraTrl(Identifier="2e5b2638-6209-a294-861f-72a42304c213")
public static String es_PE_FIELD_SystemColor_Name_Name="Nombre";

@XendraTrl(Identifier="2e5b2638-6209-a294-861f-72a42304c213")
public static String es_PE_FIELD_SystemColor_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="2e5b2638-6209-a294-861f-72a42304c213")
public static String es_PE_FIELD_SystemColor_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="2ffa5639-6d2c-2e13-c952-8c0dcabca8b0",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2e5b2638-6209-a294-861f-72a42304c213")
public static final String FIELDNAME_SystemColor_Name="2e5b2638-6209-a294-861f-72a42304c213";

@XendraTrl(Identifier="0394ce77-a246-6d38-196b-7e4c8a693c53")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0394ce77-a246-6d38-196b-7e4c8a693c53",
Synchronized="2020-03-03 21:34:28.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Red.
@param Red RGB value */
public void setRed (int Red)
{
set_Value (COLUMNNAME_Red, Integer.valueOf(Red));
}
/** Get Red.
@return RGB value */
public int getRed() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Red);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="83a460d9-c595-92ae-b158-a52fa1d807b0")
public static String es_PE_FIELD_SystemColor_Red_Name="Rojo";

@XendraTrl(Identifier="83a460d9-c595-92ae-b158-a52fa1d807b0")
public static String es_PE_FIELD_SystemColor_Red_Description="Valor RGB";

@XendraField(AD_Column_ID="Red",IsCentrallyMaintained=true,
AD_Tab_ID="2ffa5639-6d2c-2e13-c952-8c0dcabca8b0",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="83a460d9-c595-92ae-b158-a52fa1d807b0")
public static final String FIELDNAME_SystemColor_Red="83a460d9-c595-92ae-b158-a52fa1d807b0";

@XendraTrl(Identifier="e9f3e4c0-0d7f-e273-3c17-0bcef2906bf1")
public static String es_PE_COLUMN_Red_Name="Rojo";

@XendraColumn(AD_Element_ID="261119ea-337a-f6a8-50c4-d1b77d0ac1a9",ColumnName="Red",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e9f3e4c0-0d7f-e273-3c17-0bcef2906bf1",
Synchronized="2020-03-03 21:34:28.0")
/** Column name Red */
public static final String COLUMNNAME_Red = "Red";
/** Set 2nd Red.
@param Red_1 RGB value for second color */
public void setRed_1 (int Red_1)
{
set_Value (COLUMNNAME_Red_1, Integer.valueOf(Red_1));
}
/** Get 2nd Red.
@return RGB value for second color */
public int getRed_1() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Red_1);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="87ef4b2c-76ed-4d80-77e5-a5f459eed251")
public static String es_PE_FIELD_SystemColor_2ndRed_Name="2do. Rojo";

@XendraTrl(Identifier="87ef4b2c-76ed-4d80-77e5-a5f459eed251")
public static String es_PE_FIELD_SystemColor_2ndRed_Description="Valor RGB para segundo color";

@XendraField(AD_Column_ID="Red_1",IsCentrallyMaintained=true,
AD_Tab_ID="2ffa5639-6d2c-2e13-c952-8c0dcabca8b0",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@ColorType@=G | @ColorType@=L",DisplayLength=11,IsReadOnly=false,SeqNo=80,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="87ef4b2c-76ed-4d80-77e5-a5f459eed251")
public static final String FIELDNAME_SystemColor_2ndRed="87ef4b2c-76ed-4d80-77e5-a5f459eed251";

@XendraTrl(Identifier="239b0897-d769-d737-b850-0e50dc260680")
public static String es_PE_COLUMN_Red_1_Name="2do. Rojo";

@XendraColumn(AD_Element_ID="8ca5e144-f892-358f-25e3-017862bebb5c",ColumnName="Red_1",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="239b0897-d769-d737-b850-0e50dc260680",
Synchronized="2020-03-03 21:34:28.0")
/** Column name Red_1 */
public static final String COLUMNNAME_Red_1 = "Red_1";
/** Set Repeat Distance.
@param RepeatDistance Distance in points to repeat gradient color - or zero */
public void setRepeatDistance (int RepeatDistance)
{
set_Value (COLUMNNAME_RepeatDistance, Integer.valueOf(RepeatDistance));
}
/** Get Repeat Distance.
@return Distance in points to repeat gradient color - or zero */
public int getRepeatDistance() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_RepeatDistance);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="e0e96cc4-3ea7-321d-908e-89dc27592038")
public static String es_PE_FIELD_SystemColor_RepeatDistance_Name="Distancia a Repetir";

@XendraTrl(Identifier="e0e96cc4-3ea7-321d-908e-89dc27592038")
public static String es_PE_FIELD_SystemColor_RepeatDistance_Description="Distancia en puntos para repetir el gradiente de colores - ó cero";

@XendraTrl(Identifier="e0e96cc4-3ea7-321d-908e-89dc27592038")
public static String es_PE_FIELD_SystemColor_RepeatDistance_Help="El color del gradiente no se repite; si el valor es cero. La distancia se agrega (ó se resta de) al punto de partida del gradiente.";

@XendraField(AD_Column_ID="RepeatDistance",IsCentrallyMaintained=true,
AD_Tab_ID="2ffa5639-6d2c-2e13-c952-8c0dcabca8b0",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@ColorType@=G",DisplayLength=11,IsReadOnly=false,SeqNo=200,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e0e96cc4-3ea7-321d-908e-89dc27592038")
public static final String FIELDNAME_SystemColor_RepeatDistance="e0e96cc4-3ea7-321d-908e-89dc27592038";

@XendraTrl(Identifier="97c15c72-46c9-1267-b519-5bac4abd2623")
public static String es_PE_COLUMN_RepeatDistance_Name="Distancia a Repetir";

@XendraColumn(AD_Element_ID="9f227b1e-4af8-52b0-7baa-da9f1753eaf4",ColumnName="RepeatDistance",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="97c15c72-46c9-1267-b519-5bac4abd2623",
Synchronized="2020-03-03 21:34:28.0")
/** Column name RepeatDistance */
public static final String COLUMNNAME_RepeatDistance = "RepeatDistance";
/** Set Start Point.
@param StartPoint Start point of the gradient colors */
public void setStartPoint (String StartPoint)
{
if (StartPoint != null && StartPoint.length() > 22)
{
log.warning("Length > 22 - truncated");
StartPoint = StartPoint.substring(0,21);
}
set_Value (COLUMNNAME_StartPoint, StartPoint);
}
/** Get Start Point.
@return Start point of the gradient colors */
public String getStartPoint() 
{
return (String)get_Value(COLUMNNAME_StartPoint);
}

@XendraTrl(Identifier="7f93e2eb-6f00-7b8a-d7df-b00f3a3497bd")
public static String es_PE_FIELD_SystemColor_StartPoint_Name="Punto de Inicio";

@XendraTrl(Identifier="7f93e2eb-6f00-7b8a-d7df-b00f3a3497bd")
public static String es_PE_FIELD_SystemColor_StartPoint_Description="Punto de inicio del gradiente de colores";

@XendraTrl(Identifier="7f93e2eb-6f00-7b8a-d7df-b00f3a3497bd")
public static String es_PE_FIELD_SystemColor_StartPoint_Help="El comienzo del gradiente en el punto del comienzo (ej. del norte). La repetición de la distancia es determinada y como entonces se repiten los colores del gradiente. Si sale los puntos de inicio; el color superior esta actualmente en el botón.";

@XendraField(AD_Column_ID="StartPoint",IsCentrallyMaintained=true,
AD_Tab_ID="2ffa5639-6d2c-2e13-c952-8c0dcabca8b0",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="@ColorType@=G",DisplayLength=14,IsReadOnly=false,SeqNo=190,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7f93e2eb-6f00-7b8a-d7df-b00f3a3497bd")
public static final String FIELDNAME_SystemColor_StartPoint="7f93e2eb-6f00-7b8a-d7df-b00f3a3497bd";

@XendraTrl(Identifier="40514196-285d-fb2d-3785-8fedfe1b599a")
public static String es_PE_COLUMN_StartPoint_Name="Punto de Inicio";

@XendraColumn(AD_Element_ID="56a55c33-6695-ac53-f016-4fabee2262ba",ColumnName="StartPoint",
AD_Reference_ID=17,AD_Reference_Value_ID="fba5f216-7aa4-6367-907f-17a70d83f455",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="40514196-285d-fb2d-3785-8fedfe1b599a",Synchronized="2020-03-03 21:34:28.0")
/** Column name StartPoint */
public static final String COLUMNNAME_StartPoint = "StartPoint";
}
