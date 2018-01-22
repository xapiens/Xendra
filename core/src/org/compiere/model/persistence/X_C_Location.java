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
/** Generated Model for C_Location
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_Location extends PO
{
/** Standard Constructor
@param ctx context
@param C_Location_ID id
@param trxName transaction
*/
public X_C_Location (Properties ctx, int C_Location_ID, String trxName)
{
super (ctx, C_Location_ID, trxName);
/** if (C_Location_ID == 0)
{
setC_Country_ID (0);
setC_Location_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_Location (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=162 */
public static int Table_ID=MTable.getTable_ID("C_Location");

@XendraTrl(Identifier="c3f58789-7548-84a7-2d18-6bab4db13096")
public static String es_PE_TAB_Location_Description="Definir localización";

@XendraTrl(Identifier="c3f58789-7548-84a7-2d18-6bab4db13096")
public static String es_PE_TAB_Location_Name="Localización";

@XendraTrl(Identifier="c3f58789-7548-84a7-2d18-6bab4db13096")
public static String es_PE_TAB_Location_Help="La pestaña de localización define la localización de una organización.";

@XendraTab(Name="Location",Description="Define Location",
Help="The Location Tab defines the location of an Organization.",
AD_Window_ID="200e7024-e010-3538-89e8-af4533eb66b7",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="c3f58789-7548-84a7-2d18-6bab4db13096",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Location="c3f58789-7548-84a7-2d18-6bab4db13096";

@XendraTrl(Identifier="62a5afdf-c9c9-ae3f-4bd1-6cb1ad5ec010")
public static String es_PE_TABLE_C_Location_Name="Localización / Dirección";

@XendraTable(Name="Address",Description="Location or Address",Help="",TableName="C_Location",
AccessLevel="7",AD_Window_ID="200e7024-e010-3538-89e8-af4533eb66b7",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=70,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="62a5afdf-c9c9-ae3f-4bd1-6cb1ad5ec010",Synchronized="2017-08-16 11:41:59.0")
/** TableName=C_Location */
public static final String Table_Name="C_Location";


@XendraIndex(Name="c_location_locationcode",Identifier="55e45498-a859-8227-d1e1-355fcf8812e4",
Column_Names="locationcode",IsUnique="false",
TableIdentifier="55e45498-a859-8227-d1e1-355fcf8812e4",Synchronized="2017-05-01 11:07:58.0")
public static final String INDEXNAME_c_location_locationcode = "55e45498-a859-8227-d1e1-355fcf8812e4";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_Location");

protected BigDecimal accessLevel = BigDecimal.valueOf(7);
/** AccessLevel
@return 7 - System - Client - Org 
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
    Table_ID = MTable.getTable_ID("C_Location");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_Location[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Address 1.
@param Address1 Address line 1 for this location */
public void setAddress1 (String Address1)
{
if (Address1 != null && Address1.length() > 60)
{
log.warning("Length > 60 - truncated");
Address1 = Address1.substring(0,59);
}
set_Value (COLUMNNAME_Address1, Address1);
}
/** Get Address 1.
@return Address line 1 for this location */
public String getAddress1() 
{
String value = (String)get_Value(COLUMNNAME_Address1);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="fdc50718-c928-2d21-4339-daba770479d2")
public static String es_PE_FIELD_Location_Address_Description="Dirección para esta ubicación";

@XendraTrl(Identifier="fdc50718-c928-2d21-4339-daba770479d2")
public static String es_PE_FIELD_Location_Address_Help="La Dirección 1 identifica la dirección para una entidad";

@XendraTrl(Identifier="fdc50718-c928-2d21-4339-daba770479d2")
public static String es_PE_FIELD_Location_Address_Name="Calle";

@XendraField(AD_Column_ID="Address1",IsCentrallyMaintained=true,
AD_Tab_ID="c3f58789-7548-84a7-2d18-6bab4db13096",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fdc50718-c928-2d21-4339-daba770479d2")
public static final String FIELDNAME_Location_Address="fdc50718-c928-2d21-4339-daba770479d2";

@XendraTrl(Identifier="6e40b2d3-94e0-2687-52b2-071300c346ae")
public static String es_PE_COLUMN_Address1_Name="Calle";

@XendraColumn(AD_Element_ID="25535414-be76-de81-69b4-106e2150a04a",ColumnName="Address1",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6e40b2d3-94e0-2687-52b2-071300c346ae",
Synchronized="2017-08-05 16:53:52.0")
/** Column name Address1 */
public static final String COLUMNNAME_Address1 = "Address1";
/** Set Address 2.
@param Address2 Address line 2 for this location */
public void setAddress2 (String Address2)
{
if (Address2 != null && Address2.length() > 60)
{
log.warning("Length > 60 - truncated");
Address2 = Address2.substring(0,59);
}
set_Value (COLUMNNAME_Address2, Address2);
}
/** Get Address 2.
@return Address line 2 for this location */
public String getAddress2() 
{
String value = (String)get_Value(COLUMNNAME_Address2);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="3d7dafc0-232e-596b-4468-3128e84ad61d")
public static String es_PE_FIELD_Location_Address22_Description="Dirección 2 para esta ubicación";

@XendraTrl(Identifier="3d7dafc0-232e-596b-4468-3128e84ad61d")
public static String es_PE_FIELD_Location_Address22_Help="La Dirección 2 provee información de la dirección adicional para una entidad. Puede ser usada para integrar la ubicación; número de apartamento; ó información similar";

@XendraTrl(Identifier="3d7dafc0-232e-596b-4468-3128e84ad61d")
public static String es_PE_FIELD_Location_Address22_Name="Colonía";

@XendraField(AD_Column_ID="Address2",IsCentrallyMaintained=true,
AD_Tab_ID="c3f58789-7548-84a7-2d18-6bab4db13096",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3d7dafc0-232e-596b-4468-3128e84ad61d")
public static final String FIELDNAME_Location_Address22="3d7dafc0-232e-596b-4468-3128e84ad61d";

@XendraTrl(Identifier="c5b6a16c-e47a-f364-3201-5467f71721fa")
public static String es_PE_COLUMN_Address2_Name="Colonía";

@XendraColumn(AD_Element_ID="a3cd6592-3282-7ed0-953e-16e24d22cc17",ColumnName="Address2",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c5b6a16c-e47a-f364-3201-5467f71721fa",
Synchronized="2017-08-05 16:53:52.0")
/** Column name Address2 */
public static final String COLUMNNAME_Address2 = "Address2";
/** Set Address 3.
@param Address3 Address Line 3 for the location */
public void setAddress3 (String Address3)
{
if (Address3 != null && Address3.length() > 60)
{
log.warning("Length > 60 - truncated");
Address3 = Address3.substring(0,59);
}
set_Value (COLUMNNAME_Address3, Address3);
}
/** Get Address 3.
@return Address Line 3 for the location */
public String getAddress3() 
{
String value = (String)get_Value(COLUMNNAME_Address3);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="75c733c3-3c68-59ff-c1af-86a1a3ae8520")
public static String es_PE_FIELD_Location_Address33_Description="Linea dirección 3";

@XendraTrl(Identifier="75c733c3-3c68-59ff-c1af-86a1a3ae8520")
public static String es_PE_FIELD_Location_Address33_Name="Municipio ";

@XendraField(AD_Column_ID="Address3",IsCentrallyMaintained=true,
AD_Tab_ID="c3f58789-7548-84a7-2d18-6bab4db13096",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="75c733c3-3c68-59ff-c1af-86a1a3ae8520")
public static final String FIELDNAME_Location_Address33="75c733c3-3c68-59ff-c1af-86a1a3ae8520";

@XendraTrl(Identifier="3914a209-6f58-6d79-2f9e-9b2d29a7e377")
public static String es_PE_COLUMN_Address3_Name="Municipio ";

@XendraColumn(AD_Element_ID="33b5e539-4323-f4f5-13cd-afa84a0c64b6",ColumnName="Address3",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3914a209-6f58-6d79-2f9e-9b2d29a7e377",
Synchronized="2017-08-05 16:53:52.0")
/** Column name Address3 */
public static final String COLUMNNAME_Address3 = "Address3";
/** Set Address 4.
@param Address4 Address Line 4 for the location */
public void setAddress4 (String Address4)
{
if (Address4 != null && Address4.length() > 60)
{
log.warning("Length > 60 - truncated");
Address4 = Address4.substring(0,59);
}
set_Value (COLUMNNAME_Address4, Address4);
}
/** Get Address 4.
@return Address Line 4 for the location */
public String getAddress4() 
{
String value = (String)get_Value(COLUMNNAME_Address4);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="4fa9082a-f81d-2a79-6d10-575425db28ff")
public static String es_PE_FIELD_Location_Address44_Description="Línea dirección 4";

@XendraTrl(Identifier="4fa9082a-f81d-2a79-6d10-575425db28ff")
public static String es_PE_FIELD_Location_Address44_Name="Más Información";

@XendraField(AD_Column_ID="Address4",IsCentrallyMaintained=true,
AD_Tab_ID="c3f58789-7548-84a7-2d18-6bab4db13096",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4fa9082a-f81d-2a79-6d10-575425db28ff")
public static final String FIELDNAME_Location_Address44="4fa9082a-f81d-2a79-6d10-575425db28ff";

@XendraTrl(Identifier="aa77f36a-f8a1-54ba-0aa0-f3a2df976f73")
public static String es_PE_COLUMN_Address4_Name="Más Información";

@XendraColumn(AD_Element_ID="a7cd09d2-7cd2-5e62-c241-887457311de4",ColumnName="Address4",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="aa77f36a-f8a1-54ba-0aa0-f3a2df976f73",
Synchronized="2017-08-05 16:53:52.0")
/** Column name Address4 */
public static final String COLUMNNAME_Address4 = "Address4";
/** Set City.
@param C_City_ID City */
public void setC_City_ID (int C_City_ID)
{
if (C_City_ID <= 0) set_Value (COLUMNNAME_C_City_ID, null);
 else 
set_Value (COLUMNNAME_C_City_ID, Integer.valueOf(C_City_ID));
}
/** Get City.
@return City */
public int getC_City_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_City_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="dc6d1a24-b2cc-a8ce-eb51-32e62d5e9d05")
public static String es_PE_FIELD_Location_City_Description="Ciudad";

@XendraTrl(Identifier="dc6d1a24-b2cc-a8ce-eb51-32e62d5e9d05")
public static String es_PE_FIELD_Location_City_Help="Ciudad en el país";

@XendraTrl(Identifier="dc6d1a24-b2cc-a8ce-eb51-32e62d5e9d05")
public static String es_PE_FIELD_Location_City_Name="Ciudad";
@XendraField(AD_Column_ID="C_City_ID",
IsCentrallyMaintained=true,AD_Tab_ID="c3f58789-7548-84a7-2d18-6bab4db13096",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=90,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="dc6d1a24-b2cc-a8ce-eb51-32e62d5e9d05")
public static final String FIELDNAME_Location_City="dc6d1a24-b2cc-a8ce-eb51-32e62d5e9d05";

@XendraTrl(Identifier="11c47ef5-f3dd-2a4d-ad51-0b910058cc68")
public static String es_PE_COLUMN_C_City_ID_Name="Ciudad";

@XendraColumn(AD_Element_ID="21961928-16ec-6c41-6aac-32d86b1e6bb0",ColumnName="C_City_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="11c47ef5-f3dd-2a4d-ad51-0b910058cc68",
Synchronized="2017-08-05 16:53:52.0")
/** Column name C_City_ID */
public static final String COLUMNNAME_C_City_ID = "C_City_ID";
/** Set Country_ID.
@param C_Country_ID Country  */
public void setC_Country_ID (int C_Country_ID)
{
if (C_Country_ID < 1) throw new IllegalArgumentException ("C_Country_ID is mandatory.");
set_Value (COLUMNNAME_C_Country_ID, Integer.valueOf(C_Country_ID));
}
/** Get Country_ID.
@return Country  */
public int getC_Country_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Country_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="b07b5082-896f-4abb-e4df-eb13d378f340")
public static String es_PE_FIELD_Location_Country_ID_Description="País";

@XendraTrl(Identifier="b07b5082-896f-4abb-e4df-eb13d378f340")
public static String es_PE_FIELD_Location_Country_ID_Help="El país define un país. Cada país debe ser definido antes de que pueda ser usado en un documento.";

@XendraTrl(Identifier="b07b5082-896f-4abb-e4df-eb13d378f340")
public static String es_PE_FIELD_Location_Country_ID_Name="País";

@XendraField(AD_Column_ID="C_Country_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c3f58789-7548-84a7-2d18-6bab4db13096",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b07b5082-896f-4abb-e4df-eb13d378f340")
public static final String FIELDNAME_Location_Country_ID="b07b5082-896f-4abb-e4df-eb13d378f340";

@XendraTrl(Identifier="537a8726-9aed-552a-25bf-0dba3689a2d8")
public static String es_PE_COLUMN_C_Country_ID_Name="País";

@XendraColumn(AD_Element_ID="43379d46-930b-f17e-61f3-a1b7f02135c1",ColumnName="C_Country_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1.000000000000",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="537a8726-9aed-552a-25bf-0dba3689a2d8",
Synchronized="2017-08-05 16:53:52.0")
/** Column name C_Country_ID */
public static final String COLUMNNAME_C_Country_ID = "C_Country_ID";
/** Set City.
@param City Identifies a City */
public void setCity (String City)
{
if (City != null && City.length() > 60)
{
log.warning("Length > 60 - truncated");
City = City.substring(0,59);
}
set_Value (COLUMNNAME_City, City);
}
/** Get City.
@return Identifies a City */
public String getCity() 
{
String value = (String)get_Value(COLUMNNAME_City);
if (value == null)
  return "";
return value;
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), getCity());
}

@XendraTrl(Identifier="b6584228-0646-e26d-728a-1c8007da0e21")
public static String es_PE_FIELD_Location_City2_Description="Identifica una Ciudad";

@XendraTrl(Identifier="b6584228-0646-e26d-728a-1c8007da0e21")
public static String es_PE_FIELD_Location_City2_Help="La Ciudad identifica una ciudad única para este País ó Región";

@XendraTrl(Identifier="b6584228-0646-e26d-728a-1c8007da0e21")
public static String es_PE_FIELD_Location_City2_Name="Ciudad";
@XendraField(AD_Column_ID="City",
IsCentrallyMaintained=true,AD_Tab_ID="c3f58789-7548-84a7-2d18-6bab4db13096",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=80,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="b6584228-0646-e26d-728a-1c8007da0e21")
public static final String FIELDNAME_Location_City2="b6584228-0646-e26d-728a-1c8007da0e21";

@XendraTrl(Identifier="772fc80a-19bc-d4fe-61a9-948fde140dad")
public static String es_PE_COLUMN_City_Name="Ciudad";

@XendraColumn(AD_Element_ID="968cd06b-d53d-9f3f-cbd5-d393f09a0264",ColumnName="City",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="772fc80a-19bc-d4fe-61a9-948fde140dad",
Synchronized="2017-08-05 16:53:52.0")
/** Column name City */
public static final String COLUMNNAME_City = "City";
/** Set Address.
@param C_Location_ID Location or Address */
public void setC_Location_ID (int C_Location_ID)
{
if (C_Location_ID < 1) throw new IllegalArgumentException ("C_Location_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_Location_ID, Integer.valueOf(C_Location_ID));
}
/** Get Address.
@return Location or Address */
public int getC_Location_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Location_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="7fd9aee2-dc2a-9da6-a771-640af168233a")
public static String es_PE_FIELD_Location_Address5_Description="Ubicación ó dirección";

@XendraTrl(Identifier="7fd9aee2-dc2a-9da6-a771-640af168233a")
public static String es_PE_FIELD_Location_Address5_Help="El campo Ubicación / Dirección define la ubicación de una entidad.";

@XendraTrl(Identifier="7fd9aee2-dc2a-9da6-a771-640af168233a")
public static String es_PE_FIELD_Location_Address5_Name="Localización / Dirección";

@XendraField(AD_Column_ID="C_Location_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c3f58789-7548-84a7-2d18-6bab4db13096",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7fd9aee2-dc2a-9da6-a771-640af168233a")
public static final String FIELDNAME_Location_Address5="7fd9aee2-dc2a-9da6-a771-640af168233a";
/** Column name C_Location_ID */
public static final String COLUMNNAME_C_Location_ID = "C_Location_ID";
/** Set C_Province_ID.
@param C_Province_ID C_Province_ID */
public void setC_Province_ID (int C_Province_ID)
{
if (C_Province_ID <= 0) set_Value (COLUMNNAME_C_Province_ID, null);
 else 
set_Value (COLUMNNAME_C_Province_ID, Integer.valueOf(C_Province_ID));
}
/** Get C_Province_ID.
@return C_Province_ID */
public int getC_Province_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Province_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="1ea85d40-6fd8-cc5f-d8e8-96e15d2c822e")
public static String es_PE_COLUMN_C_Province_ID_Name="c_province_id";

@XendraColumn(AD_Element_ID="cde63be0-fa0b-9319-77c6-a6b10bb61b08",ColumnName="C_Province_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1ea85d40-6fd8-cc5f-d8e8-96e15d2c822e",
Synchronized="2017-08-05 16:53:52.0")
/** Column name C_Province_ID */
public static final String COLUMNNAME_C_Province_ID = "C_Province_ID";
/** Set Region.
@param C_Region_ID Identifies a geographical Region */
public void setC_Region_ID (int C_Region_ID)
{
if (C_Region_ID <= 0) set_Value (COLUMNNAME_C_Region_ID, null);
 else 
set_Value (COLUMNNAME_C_Region_ID, Integer.valueOf(C_Region_ID));
}
/** Get Region.
@return Identifies a geographical Region */
public int getC_Region_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Region_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="363e1d03-f6fc-9acf-0a62-b13479d7f027")
public static String es_PE_FIELD_Location_Region_Description="Identifica una región geográfica";

@XendraTrl(Identifier="363e1d03-f6fc-9acf-0a62-b13479d7f027")
public static String es_PE_FIELD_Location_Region_Help="La región indica una región única para este país";

@XendraTrl(Identifier="363e1d03-f6fc-9acf-0a62-b13479d7f027")
public static String es_PE_FIELD_Location_Region_Name="Región";

@XendraField(AD_Column_ID="C_Region_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c3f58789-7548-84a7-2d18-6bab4db13096",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="363e1d03-f6fc-9acf-0a62-b13479d7f027")
public static final String FIELDNAME_Location_Region="363e1d03-f6fc-9acf-0a62-b13479d7f027";

@XendraTrl(Identifier="6a2e0c60-d187-01c9-57c3-9ea35ec071d1")
public static String es_PE_COLUMN_C_Region_ID_Name="Región";

@XendraColumn(AD_Element_ID="ebf14ae5-8cc5-d3f7-2bd3-ea81d9c6d1fe",ColumnName="C_Region_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="2f48b18b-cc01-4a24-2f77-91b0071e443b",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="6a2e0c60-d187-01c9-57c3-9ea35ec071d1",Synchronized="2017-08-05 16:53:52.0")
/** Column name C_Region_ID */
public static final String COLUMNNAME_C_Region_ID = "C_Region_ID";
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
@XendraTrl(Identifier="d7b081f0-6892-4eda-9385-34961d2989a4")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d7b081f0-6892-4eda-9385-34961d2989a4",
Synchronized="2017-08-05 16:53:53.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set LocationCode.
@param LocationCode LocationCode */
public void setLocationCode (String LocationCode)
{
if (LocationCode != null && LocationCode.length() > 2)
{
log.warning("Length > 2 - truncated");
LocationCode = LocationCode.substring(0,1);
}
set_Value (COLUMNNAME_LocationCode, LocationCode);
}
/** Get LocationCode.
@return LocationCode */
public String getLocationCode() 
{
String value = (String)get_Value(COLUMNNAME_LocationCode);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="49220558-9217-45dc-999e-21023ee06157")
public static String es_PE_COLUMN_LocationCode_Name="locationcode";

@XendraColumn(AD_Element_ID="03482a63-f3e6-497c-8a9d-d801a25aaddb",ColumnName="LocationCode",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="49220558-9217-45dc-999e-21023ee06157",
Synchronized="2017-08-05 16:53:53.0")
/** Column name LocationCode */
public static final String COLUMNNAME_LocationCode = "LocationCode";
/** Set ZIP.
@param Postal Postal code */
public void setPostal (String Postal)
{
if (Postal != null && Postal.length() > 10)
{
log.warning("Length > 10 - truncated");
Postal = Postal.substring(0,9);
}
set_Value (COLUMNNAME_Postal, Postal);
}
/** Get ZIP.
@return Postal code */
public String getPostal() 
{
String value = (String)get_Value(COLUMNNAME_Postal);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="697e0249-8d45-1a6d-0886-1d4feec85ced")
public static String es_PE_FIELD_Location_ZIP_Description="Código Postal";

@XendraTrl(Identifier="697e0249-8d45-1a6d-0886-1d4feec85ced")
public static String es_PE_FIELD_Location_ZIP_Help="El campo Código Postal identifica el código postal para esta entidad";

@XendraTrl(Identifier="697e0249-8d45-1a6d-0886-1d4feec85ced")
public static String es_PE_FIELD_Location_ZIP_Name="Código Postal";

@XendraField(AD_Column_ID="Postal",IsCentrallyMaintained=true,
AD_Tab_ID="c3f58789-7548-84a7-2d18-6bab4db13096",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=100,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="697e0249-8d45-1a6d-0886-1d4feec85ced")
public static final String FIELDNAME_Location_ZIP="697e0249-8d45-1a6d-0886-1d4feec85ced";

@XendraTrl(Identifier="a094ee20-6f98-3430-ce65-334b632ce9bd")
public static String es_PE_COLUMN_Postal_Name="Código Postal";

@XendraColumn(AD_Element_ID="b91ba048-ef4f-31e3-3865-fa3cff649df8",ColumnName="Postal",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a094ee20-6f98-3430-ce65-334b632ce9bd",
Synchronized="2017-08-05 16:53:53.0")
/** Column name Postal */
public static final String COLUMNNAME_Postal = "Postal";
/** Set -.
@param Postal_Add Additional ZIP or Postal code */
public void setPostal_Add (String Postal_Add)
{
if (Postal_Add != null && Postal_Add.length() > 10)
{
log.warning("Length > 10 - truncated");
Postal_Add = Postal_Add.substring(0,9);
}
set_Value (COLUMNNAME_Postal_Add, Postal_Add);
}
/** Get -.
@return Additional ZIP or Postal code */
public String getPostal_Add() 
{
String value = (String)get_Value(COLUMNNAME_Postal_Add);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="3ee653a1-4dd1-eae8-40c0-b52d022c18a9")
public static String es_PE_FIELD_Location___Description="ZIP adicional o Código Postal";

@XendraTrl(Identifier="3ee653a1-4dd1-eae8-40c0-b52d022c18a9")
public static String es_PE_FIELD_Location___Help="El código o Zona postal adicional identifica; si es apropiado; cualquier información de código postal adicional";

@XendraTrl(Identifier="3ee653a1-4dd1-eae8-40c0-b52d022c18a9")
public static String es_PE_FIELD_Location___Name="-";
@XendraField(AD_Column_ID="Postal_Add",
IsCentrallyMaintained=true,AD_Tab_ID="c3f58789-7548-84a7-2d18-6bab4db13096",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=110,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="3ee653a1-4dd1-eae8-40c0-b52d022c18a9")
public static final String FIELDNAME_Location__="3ee653a1-4dd1-eae8-40c0-b52d022c18a9";

@XendraTrl(Identifier="6e84f1b7-d224-f0b8-7560-5268b2c1df21")
public static String es_PE_COLUMN_Postal_Add_Name="-";

@XendraColumn(AD_Element_ID="c00d9640-000a-9e1d-4070-f6df5e9b3622",ColumnName="Postal_Add",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6e84f1b7-d224-f0b8-7560-5268b2c1df21",
Synchronized="2017-08-05 16:53:53.0")
/** Column name Postal_Add */
public static final String COLUMNNAME_Postal_Add = "Postal_Add";
/** Set Region.
@param RegionName Name of the Region */
public void setRegionName (String RegionName)
{
if (RegionName != null && RegionName.length() > 40)
{
log.warning("Length > 40 - truncated");
RegionName = RegionName.substring(0,39);
}
set_Value (COLUMNNAME_RegionName, RegionName);
}
/** Get Region.
@return Name of the Region */
public String getRegionName() 
{
String value = (String)get_Value(COLUMNNAME_RegionName);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="67fc1cc2-f7f6-62cf-164c-fef217be9c29")
public static String es_PE_FIELD_Location_Region2_Description="Nombre de esta región";

@XendraTrl(Identifier="67fc1cc2-f7f6-62cf-164c-fef217be9c29")
public static String es_PE_FIELD_Location_Region2_Help="El nombre de región define el nombre que se imprimirá cuando esta región se use en un documento.";

@XendraTrl(Identifier="67fc1cc2-f7f6-62cf-164c-fef217be9c29")
public static String es_PE_FIELD_Location_Region2_Name="Nombre de Región";

@XendraField(AD_Column_ID="RegionName",IsCentrallyMaintained=true,
AD_Tab_ID="c3f58789-7548-84a7-2d18-6bab4db13096",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="67fc1cc2-f7f6-62cf-164c-fef217be9c29")
public static final String FIELDNAME_Location_Region2="67fc1cc2-f7f6-62cf-164c-fef217be9c29";

@XendraTrl(Identifier="5c8c6e6c-0aca-e18e-6999-9fb7ea237f67")
public static String es_PE_COLUMN_RegionName_Name="Nombre de Región";

@XendraColumn(AD_Element_ID="b2bf2a97-80d5-f41e-ee37-c6093627a1b0",ColumnName="RegionName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5c8c6e6c-0aca-e18e-6999-9fb7ea237f67",
Synchronized="2017-08-05 16:53:53.0")
/** Column name RegionName */
public static final String COLUMNNAME_RegionName = "RegionName";
}
