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
/** Generated Model for C_Contact
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_Contact extends PO
{
/** Standard Constructor
@param ctx context
@param C_Contact_ID id
@param trxName transaction
*/
public X_C_Contact (Properties ctx, int C_Contact_ID, String trxName)
{
super (ctx, C_Contact_ID, trxName);
/** if (C_Contact_ID == 0)
{
setC_Contact_ID (0);
setIsGuarantor (false);	
// N
setIsLegalRepresent (false);	
// N
setIsOwner (false);	
// N
setName (null);
setValue (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_Contact (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000303 */
public static int Table_ID=MTable.getTable_ID("C_Contact");

@XendraTrl(Identifier="279d8d09-585e-4ff2-bcb6-67df82b83158")
public static String es_PE_TABLE_C_Contact_Name="C_Contact";

@XendraTable(Name="C_Contact",Description="",Help="",TableName="C_Contact",AccessLevel="3",
AD_Window_ID="",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,IsSecurityEnabled=false,IsDeleteable=true,
IsHighVolume=false,IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="279d8d09-585e-4ff2-bcb6-67df82b83158",Synchronized="2017-08-16 11:41:40.0")
/** TableName=C_Contact */
public static final String Table_Name="C_Contact";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_Contact");

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
    Table_ID = MTable.getTable_ID("C_Contact");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_Contact[").append(get_ID()).append("]");
return sb.toString();
}
/** Set AdditionalNames.
@param AdditionalNames AdditionalNames */
public void setAdditionalNames (String AdditionalNames)
{
if (AdditionalNames != null && AdditionalNames.length() > 60)
{
log.warning("Length > 60 - truncated");
AdditionalNames = AdditionalNames.substring(0,59);
}
set_Value (COLUMNNAME_AdditionalNames, AdditionalNames);
}
/** Get AdditionalNames.
@return AdditionalNames */
public String getAdditionalNames() 
{
String value = (String)get_Value(COLUMNNAME_AdditionalNames);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="87a784f9-ad2c-4198-b08f-d1e4a0be4128")
public static String es_PE_COLUMN_AdditionalNames_Name="additionalnames";

@XendraColumn(AD_Element_ID="783c70d1-ab27-4142-bef0-52c2ae7d0627",ColumnName="AdditionalNames",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="87a784f9-ad2c-4198-b08f-d1e4a0be4128",
Synchronized="2017-08-05 16:53:31.0")
/** Column name AdditionalNames */
public static final String COLUMNNAME_AdditionalNames = "AdditionalNames";
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

@XendraTrl(Identifier="47b80c6c-32d3-4917-a51d-0a39d2d2d9a4")
public static String es_PE_COLUMN_AD_Image_ID_Name="Image";

@XendraColumn(AD_Element_ID="8464640e-ab89-67ff-b78b-1e8940657a22",ColumnName="AD_Image_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="47b80c6c-32d3-4917-a51d-0a39d2d2d9a4",
Synchronized="2017-08-05 16:53:31.0")
/** Column name AD_Image_ID */
public static final String COLUMNNAME_AD_Image_ID = "AD_Image_ID";
/** Set Trx Organization.
@param AD_OrgTrx_ID Performing or initiating organization */
public void setAD_OrgTrx_ID (int AD_OrgTrx_ID)
{
if (AD_OrgTrx_ID <= 0) set_Value (COLUMNNAME_AD_OrgTrx_ID, null);
 else 
set_Value (COLUMNNAME_AD_OrgTrx_ID, Integer.valueOf(AD_OrgTrx_ID));
}
/** Get Trx Organization.
@return Performing or initiating organization */
public int getAD_OrgTrx_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_OrgTrx_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="1395863b-d7de-4c03-92c1-5a750a5e0d55")
public static String es_PE_COLUMN_AD_OrgTrx_ID_Name="Trx Organization";

@XendraColumn(AD_Element_ID="b4180358-67aa-fe55-0409-6367a60e0a2e",ColumnName="AD_OrgTrx_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1395863b-d7de-4c03-92c1-5a750a5e0d55",
Synchronized="2017-08-05 16:53:31.0")
/** Column name AD_OrgTrx_ID */
public static final String COLUMNNAME_AD_OrgTrx_ID = "AD_OrgTrx_ID";
/** Set Birthday.
@param Birthday Birthday or Anniversary day */
public void setBirthday (Timestamp Birthday)
{
set_Value (COLUMNNAME_Birthday, Birthday);
}
/** Get Birthday.
@return Birthday or Anniversary day */
public Timestamp getBirthday() 
{
return (Timestamp)get_Value(COLUMNNAME_Birthday);
}

@XendraTrl(Identifier="7561f3b9-0605-49fc-a523-eac6d69e8852")
public static String es_PE_COLUMN_Birthday_Name="Birthday";

@XendraColumn(AD_Element_ID="5767cb2c-56e6-05de-20a9-958edf7be231",ColumnName="Birthday",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7561f3b9-0605-49fc-a523-eac6d69e8852",
Synchronized="2017-08-05 16:53:31.0")
/** Column name Birthday */
public static final String COLUMNNAME_Birthday = "Birthday";
/** Set Business Partner .
@param C_BPartner_ID Identifies a Business Partner */
public void setC_BPartner_ID (int C_BPartner_ID)
{
if (C_BPartner_ID <= 0) set_Value (COLUMNNAME_C_BPartner_ID, null);
 else 
set_Value (COLUMNNAME_C_BPartner_ID, Integer.valueOf(C_BPartner_ID));
}
/** Get Business Partner .
@return Identifies a Business Partner */
public int getC_BPartner_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartner_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="80bce4ee-7d0f-49a3-84e5-09c828385598")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Business Partner ";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="80bce4ee-7d0f-49a3-84e5-09c828385598",
Synchronized="2017-08-05 16:53:31.0")
/** Column name C_BPartner_ID */
public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
/** Set Partner Location.
@param C_BPartner_Location_ID Identifies the (ship to) address for this Business Partner */
public void setC_BPartner_Location_ID (int C_BPartner_Location_ID)
{
if (C_BPartner_Location_ID <= 0) set_Value (COLUMNNAME_C_BPartner_Location_ID, null);
 else 
set_Value (COLUMNNAME_C_BPartner_Location_ID, Integer.valueOf(C_BPartner_Location_ID));
}
/** Get Partner Location.
@return Identifies the (ship to) address for this Business Partner */
public int getC_BPartner_Location_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartner_Location_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="7c6c6246-022f-4d32-87d7-43923b485ea5")
public static String es_PE_COLUMN_C_BPartner_Location_ID_Name="Partner Location";

@XendraColumn(AD_Element_ID="0dab7dc6-2832-26dc-2462-cba2d40235f2",
ColumnName="C_BPartner_Location_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="7c6c6246-022f-4d32-87d7-43923b485ea5",Synchronized="2017-08-05 16:53:31.0")
/** Column name C_BPartner_Location_ID */
public static final String COLUMNNAME_C_BPartner_Location_ID = "C_BPartner_Location_ID";
/** Set C_ContactCategory_ID.
@param C_ContactCategory_ID C_ContactCategory_ID */
public void setC_ContactCategory_ID (int C_ContactCategory_ID)
{
if (C_ContactCategory_ID <= 0) set_Value (COLUMNNAME_C_ContactCategory_ID, null);
 else 
set_Value (COLUMNNAME_C_ContactCategory_ID, Integer.valueOf(C_ContactCategory_ID));
}
/** Get C_ContactCategory_ID.
@return C_ContactCategory_ID */
public int getC_ContactCategory_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_ContactCategory_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="01bbc0bc-1fa2-484e-8651-6ed95eeebed0")
public static String es_PE_COLUMN_C_ContactCategory_ID_Name="c_contactcategory_id";

@XendraColumn(AD_Element_ID="b6dc1986-8a16-460e-823a-9fd97958268e",
ColumnName="C_ContactCategory_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="01bbc0bc-1fa2-484e-8651-6ed95eeebed0",Synchronized="2017-08-05 16:53:31.0")
/** Column name C_ContactCategory_ID */
public static final String COLUMNNAME_C_ContactCategory_ID = "C_ContactCategory_ID";
/** Set C_Contact.
@param C_Contact_ID C_Contact */
public void setC_Contact_ID (int C_Contact_ID)
{
if (C_Contact_ID < 1) throw new IllegalArgumentException ("C_Contact_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_Contact_ID, Integer.valueOf(C_Contact_ID));
}
/** Get C_Contact.
@return C_Contact */
public int getC_Contact_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Contact_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name C_Contact_ID */
public static final String COLUMNNAME_C_Contact_ID = "C_Contact_ID";
/** Set Greeting.
@param C_Greeting_ID Greeting to print on correspondence */
public void setC_Greeting_ID (int C_Greeting_ID)
{
if (C_Greeting_ID <= 0) set_Value (COLUMNNAME_C_Greeting_ID, null);
 else 
set_Value (COLUMNNAME_C_Greeting_ID, Integer.valueOf(C_Greeting_ID));
}
/** Get Greeting.
@return Greeting to print on correspondence */
public int getC_Greeting_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Greeting_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="4d5b1934-0cd7-4800-9973-74130a43c78f")
public static String es_PE_COLUMN_C_Greeting_ID_Name="Greeting";

@XendraColumn(AD_Element_ID="2865a1ce-d044-a158-129d-7699708f4ce1",ColumnName="C_Greeting_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4d5b1934-0cd7-4800-9973-74130a43c78f",
Synchronized="2017-08-05 16:53:31.0")
/** Column name C_Greeting_ID */
public static final String COLUMNNAME_C_Greeting_ID = "C_Greeting_ID";
/** Set Comments.
@param Comments Comments or additional information */
public void setComments (String Comments)
{
set_Value (COLUMNNAME_Comments, Comments);
}
/** Get Comments.
@return Comments or additional information */
public String getComments() 
{
String value = (String)get_Value(COLUMNNAME_Comments);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="2f9d674e-143f-4fd8-96fd-6708ee2f4956")
public static String es_PE_COLUMN_Comments_Name="Comments";

@XendraColumn(AD_Element_ID="68725fe2-3419-b727-d8d4-8bf5d0d8cfc2",ColumnName="Comments",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2f9d674e-143f-4fd8-96fd-6708ee2f4956",
Synchronized="2017-08-05 16:53:31.0")
/** Column name Comments */
public static final String COLUMNNAME_Comments = "Comments";
/** Set Department.
@param Department Department */
public void setDepartment (String Department)
{
if (Department != null && Department.length() > 100)
{
log.warning("Length > 100 - truncated");
Department = Department.substring(0,99);
}
set_Value (COLUMNNAME_Department, Department);
}
/** Get Department.
@return Department */
public String getDepartment() 
{
String value = (String)get_Value(COLUMNNAME_Department);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="dd4f5977-296f-40e2-9213-bb636e77acae")
public static String es_PE_COLUMN_Department_Name="department";

@XendraColumn(AD_Element_ID="19407d88-f31e-44e8-be6f-3f2dc661f1f3",ColumnName="Department",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=100,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="dd4f5977-296f-40e2-9213-bb636e77acae",
Synchronized="2017-08-05 16:53:31.0")
/** Column name Department */
public static final String COLUMNNAME_Department = "Department";
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

@XendraTrl(Identifier="6a9e11d4-64b7-4099-b68c-8bccce871012")
public static String es_PE_COLUMN_Description_Name="Description";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6a9e11d4-64b7-4099-b68c-8bccce871012",
Synchronized="2017-08-05 16:53:31.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set EMail Address.
@param EMail Electronic Mail Address */
public void setEMail (String EMail)
{
if (EMail != null && EMail.length() > 60)
{
log.warning("Length > 60 - truncated");
EMail = EMail.substring(0,59);
}
set_Value (COLUMNNAME_EMail, EMail);
}
/** Get EMail Address.
@return Electronic Mail Address */
public String getEMail() 
{
String value = (String)get_Value(COLUMNNAME_EMail);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="f22af067-298c-4011-ab09-93fa593c9a0c")
public static String es_PE_COLUMN_EMail_Name="EMail Address";

@XendraColumn(AD_Element_ID="d18b300c-9ad6-2dd2-36d3-b65969743158",ColumnName="EMail",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f22af067-298c-4011-ab09-93fa593c9a0c",
Synchronized="2017-08-05 16:53:31.0")
/** Column name EMail */
public static final String COLUMNNAME_EMail = "EMail";
/** Set Family.
@param Family Family */
public void setFamily (String Family)
{
if (Family != null && Family.length() > 60)
{
log.warning("Length > 60 - truncated");
Family = Family.substring(0,59);
}
set_Value (COLUMNNAME_Family, Family);
}
/** Get Family.
@return Family */
public String getFamily() 
{
String value = (String)get_Value(COLUMNNAME_Family);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="64033905-47cf-4d35-aab1-cbddf2052522")
public static String es_PE_COLUMN_Family_Name="family";

@XendraColumn(AD_Element_ID="f000bd33-8e7e-44e8-834d-4f7256552b26",ColumnName="Family",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="64033905-47cf-4d35-aab1-cbddf2052522",
Synchronized="2017-08-05 16:53:31.0")
/** Column name Family */
public static final String COLUMNNAME_Family = "Family";
/** Set Fax.
@param Fax Facsimile number */
public void setFax (String Fax)
{
if (Fax != null && Fax.length() > 40)
{
log.warning("Length > 40 - truncated");
Fax = Fax.substring(0,39);
}
set_Value (COLUMNNAME_Fax, Fax);
}
/** Get Fax.
@return Facsimile number */
public String getFax() 
{
String value = (String)get_Value(COLUMNNAME_Fax);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="bceb339d-fe9b-4b13-8c42-50b2cf74150f")
public static String es_PE_COLUMN_Fax_Name="Fax";

@XendraColumn(AD_Element_ID="8a02a423-cb7b-6c2f-8be1-1423aec1ba37",ColumnName="Fax",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bceb339d-fe9b-4b13-8c42-50b2cf74150f",
Synchronized="2017-08-05 16:53:31.0")
/** Column name Fax */
public static final String COLUMNNAME_Fax = "Fax";
/** Set FirstName.
@param FirstName FirstName */
public void setFirstName (String FirstName)
{
if (FirstName != null && FirstName.length() > 60)
{
log.warning("Length > 60 - truncated");
FirstName = FirstName.substring(0,59);
}
set_Value (COLUMNNAME_FirstName, FirstName);
}
/** Get FirstName.
@return FirstName */
public String getFirstName() 
{
String value = (String)get_Value(COLUMNNAME_FirstName);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="3392dbf1-5e88-4e51-807c-652f5c8a9c99")
public static String es_PE_COLUMN_FirstName_Name="firstname";

@XendraColumn(AD_Element_ID="0f6bc73a-e614-484e-a28c-a4cbc029a4e0",ColumnName="FirstName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3392dbf1-5e88-4e51-807c-652f5c8a9c99",
Synchronized="2017-08-05 16:53:31.0")
/** Column name FirstName */
public static final String COLUMNNAME_FirstName = "FirstName";
/** Set FirstSurName.
@param FirstSurName FirstSurName */
public void setFirstSurName (String FirstSurName)
{
if (FirstSurName != null && FirstSurName.length() > 60)
{
log.warning("Length > 60 - truncated");
FirstSurName = FirstSurName.substring(0,59);
}
set_Value (COLUMNNAME_FirstSurName, FirstSurName);
}
/** Get FirstSurName.
@return FirstSurName */
public String getFirstSurName() 
{
String value = (String)get_Value(COLUMNNAME_FirstSurName);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="9b136732-949e-45cc-b644-9b57b1ddaf08")
public static String es_PE_COLUMN_FirstSurName_Name="firstsurname";

@XendraColumn(AD_Element_ID="656fb88f-c1c7-4fbe-a1f4-7bc7b926960d",ColumnName="FirstSurName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9b136732-949e-45cc-b644-9b57b1ddaf08",
Synchronized="2017-08-05 16:53:31.0")
/** Column name FirstSurName */
public static final String COLUMNNAME_FirstSurName = "FirstSurName";
/** Set fn.
@param fn fn */
public void setfn (String fn)
{
if (fn != null && fn.length() > 255)
{
log.warning("Length > 255 - truncated");
fn = fn.substring(0,254);
}
set_Value (COLUMNNAME_fn, fn);
}
/** Get fn.
@return fn */
public String getfn() 
{
String value = (String)get_Value(COLUMNNAME_fn);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="634b96de-f978-4f22-8670-aec890631d0e")
public static String es_PE_COLUMN_fn_Name="fn";

@XendraColumn(AD_Element_ID="76ad1bb7-1a31-49d0-abbc-8987a356cfc1",ColumnName="fn",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="634b96de-f978-4f22-8670-aec890631d0e",
Synchronized="2017-08-05 16:53:31.0")
/** Column name fn */
public static final String COLUMNNAME_fn = "fn";
/** Set Given.
@param Given Given */
public void setGiven (String Given)
{
if (Given != null && Given.length() > 60)
{
log.warning("Length > 60 - truncated");
Given = Given.substring(0,59);
}
set_Value (COLUMNNAME_Given, Given);
}
/** Get Given.
@return Given */
public String getGiven() 
{
String value = (String)get_Value(COLUMNNAME_Given);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="adfc0f4b-8393-4bdf-a21e-4bd202294546")
public static String es_PE_COLUMN_Given_Name="given";

@XendraColumn(AD_Element_ID="ffe060ae-c817-45f0-85f6-c5063e7c2aa3",ColumnName="Given",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="adfc0f4b-8393-4bdf-a21e-4bd202294546",
Synchronized="2017-08-05 16:53:31.0")
/** Column name Given */
public static final String COLUMNNAME_Given = "Given";
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
@XendraTrl(Identifier="8dd7e1ed-64a3-4419-9876-3b35a981ccfd")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8dd7e1ed-64a3-4419-9876-3b35a981ccfd",
Synchronized="2017-08-05 16:53:31.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Image URL.
@param ImageURL URL of  image */
public void setImageURL (String ImageURL)
{
if (ImageURL != null && ImageURL.length() > 120)
{
log.warning("Length > 120 - truncated");
ImageURL = ImageURL.substring(0,119);
}
set_Value (COLUMNNAME_ImageURL, ImageURL);
}
/** Get Image URL.
@return URL of  image */
public String getImageURL() 
{
String value = (String)get_Value(COLUMNNAME_ImageURL);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="15c51e10-cfba-4eed-8bca-1807b4f03552")
public static String es_PE_COLUMN_ImageURL_Name="Image URL";

@XendraColumn(AD_Element_ID="fe037607-f5d9-d969-d6e5-eb1f94c10e5e",ColumnName="ImageURL",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=120,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="15c51e10-cfba-4eed-8bca-1807b4f03552",
Synchronized="2017-08-05 16:53:31.0")
/** Column name ImageURL */
public static final String COLUMNNAME_ImageURL = "ImageURL";
/** Set IsGuarantor.
@param IsGuarantor IsGuarantor */
public void setIsGuarantor (boolean IsGuarantor)
{
set_Value (COLUMNNAME_IsGuarantor, Boolean.valueOf(IsGuarantor));
}
/** Get IsGuarantor.
@return IsGuarantor */
public boolean isGuarantor() 
{
Object oo = get_Value(COLUMNNAME_IsGuarantor);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="24104900-ec9d-4a9d-9e1c-901bb8f34939")
public static String es_PE_COLUMN_IsGuarantor_Name="isguarantor";

@XendraColumn(AD_Element_ID="d3c69a55-9f65-442f-8fe6-a1d61a55e920",ColumnName="IsGuarantor",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="24104900-ec9d-4a9d-9e1c-901bb8f34939",
Synchronized="2017-08-05 16:53:31.0")
/** Column name IsGuarantor */
public static final String COLUMNNAME_IsGuarantor = "IsGuarantor";
/** Set IsLegalRepresent.
@param IsLegalRepresent IsLegalRepresent */
public void setIsLegalRepresent (boolean IsLegalRepresent)
{
set_Value (COLUMNNAME_IsLegalRepresent, Boolean.valueOf(IsLegalRepresent));
}
/** Get IsLegalRepresent.
@return IsLegalRepresent */
public boolean isLegalRepresent() 
{
Object oo = get_Value(COLUMNNAME_IsLegalRepresent);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="ff89a193-b213-48da-8878-61e6cdd51290")
public static String es_PE_COLUMN_IsLegalRepresent_Name="islegalrepresent";

@XendraColumn(AD_Element_ID="8a1ac4d2-251e-4eb7-8f79-6b8bc3789e0d",ColumnName="IsLegalRepresent",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ff89a193-b213-48da-8878-61e6cdd51290",
Synchronized="2017-08-05 16:53:31.0")
/** Column name IsLegalRepresent */
public static final String COLUMNNAME_IsLegalRepresent = "IsLegalRepresent";
/** Set IsOwner.
@param IsOwner IsOwner */
public void setIsOwner (boolean IsOwner)
{
set_Value (COLUMNNAME_IsOwner, Boolean.valueOf(IsOwner));
}
/** Get IsOwner.
@return IsOwner */
public boolean isOwner() 
{
Object oo = get_Value(COLUMNNAME_IsOwner);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="b1af30c4-c2e9-49bc-9b0f-869e3ee96788")
public static String es_PE_COLUMN_IsOwner_Name="isowner";

@XendraColumn(AD_Element_ID="97e69efc-7f99-4bf3-8a00-a770fa6815cf",ColumnName="IsOwner",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b1af30c4-c2e9-49bc-9b0f-869e3ee96788",
Synchronized="2017-08-05 16:53:31.0")
/** Column name IsOwner */
public static final String COLUMNNAME_IsOwner = "IsOwner";
/** Set Last Contact.
@param LastContact Date this individual was last contacted */
public void setLastContact (Timestamp LastContact)
{
set_Value (COLUMNNAME_LastContact, LastContact);
}
/** Get Last Contact.
@return Date this individual was last contacted */
public Timestamp getLastContact() 
{
return (Timestamp)get_Value(COLUMNNAME_LastContact);
}

@XendraTrl(Identifier="daebae80-3a84-48a3-899f-fc612d7aa6f6")
public static String es_PE_COLUMN_LastContact_Name="Last Contact";

@XendraColumn(AD_Element_ID="c5f17fef-05a3-af26-432c-d3abb4baf9ce",ColumnName="LastContact",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="daebae80-3a84-48a3-899f-fc612d7aa6f6",
Synchronized="2017-08-05 16:53:31.0")
/** Column name LastContact */
public static final String COLUMNNAME_LastContact = "LastContact";
/** Set Last Result.
@param LastResult Result of last contact */
public void setLastResult (String LastResult)
{
if (LastResult != null && LastResult.length() > 255)
{
log.warning("Length > 255 - truncated");
LastResult = LastResult.substring(0,254);
}
set_Value (COLUMNNAME_LastResult, LastResult);
}
/** Get Last Result.
@return Result of last contact */
public String getLastResult() 
{
String value = (String)get_Value(COLUMNNAME_LastResult);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="1983e54e-42f4-4548-a667-0c9e807cdc0d")
public static String es_PE_COLUMN_LastResult_Name="Last Result";

@XendraColumn(AD_Element_ID="fc0abc92-dbad-97a1-2c92-beb692f0e911",ColumnName="LastResult",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1983e54e-42f4-4548-a667-0c9e807cdc0d",
Synchronized="2017-08-05 16:53:31.0")
/** Column name LastResult */
public static final String COLUMNNAME_LastResult = "LastResult";
/** Set Name.
@param Name Alphanumeric identifier of the entity */
public void setName (String Name)
{
if (Name == null) throw new IllegalArgumentException ("Name is mandatory.");
if (Name.length() > 40)
{
log.warning("Length > 40 - truncated");
Name = Name.substring(0,39);
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

@XendraTrl(Identifier="a0bfbe01-d885-4493-bbd7-8340ca02dab9")
public static String es_PE_COLUMN_Name_Name="Name";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a0bfbe01-d885-4493-bbd7-8340ca02dab9",
Synchronized="2017-08-05 16:53:31.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set NickName.
@param NickName NickName */
public void setNickName (String NickName)
{
if (NickName != null && NickName.length() > 60)
{
log.warning("Length > 60 - truncated");
NickName = NickName.substring(0,59);
}
set_Value (COLUMNNAME_NickName, NickName);
}
/** Get NickName.
@return NickName */
public String getNickName() 
{
String value = (String)get_Value(COLUMNNAME_NickName);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="3fb2a36d-1b67-47cb-9374-7604cd66df77")
public static String es_PE_COLUMN_NickName_Name="nickname";

@XendraColumn(AD_Element_ID="0406ef8e-8a8e-465f-aca1-bbdda56eb128",ColumnName="NickName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3fb2a36d-1b67-47cb-9374-7604cd66df77",
Synchronized="2017-08-05 16:53:31.0")
/** Column name NickName */
public static final String COLUMNNAME_NickName = "NickName";
/** Set Note.
@param Note Optional additional user defined information */
public void setNote (String Note)
{
if (Note != null && Note.length() > 100)
{
log.warning("Length > 100 - truncated");
Note = Note.substring(0,99);
}
set_Value (COLUMNNAME_Note, Note);
}
/** Get Note.
@return Optional additional user defined information */
public String getNote() 
{
String value = (String)get_Value(COLUMNNAME_Note);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="4c4e0d22-a41a-4ed7-994d-03f0086e436d")
public static String es_PE_COLUMN_Note_Name="Note";

@XendraColumn(AD_Element_ID="5fea140b-6b26-b544-b237-3b3fa64ae1c6",ColumnName="Note",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=100,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4c4e0d22-a41a-4ed7-994d-03f0086e436d",
Synchronized="2017-08-05 16:53:31.0")
/** Column name Note */
public static final String COLUMNNAME_Note = "Note";
/** Set Office.
@param Office Office */
public void setOffice (String Office)
{
if (Office != null && Office.length() > 100)
{
log.warning("Length > 100 - truncated");
Office = Office.substring(0,99);
}
set_Value (COLUMNNAME_Office, Office);
}
/** Get Office.
@return Office */
public String getOffice() 
{
String value = (String)get_Value(COLUMNNAME_Office);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="25c9f1a2-3ac9-4604-b07d-7a9098641f51")
public static String es_PE_COLUMN_Office_Name="office";

@XendraColumn(AD_Element_ID="1c8e0b4f-24e6-4e37-87a5-589c5cfd9343",ColumnName="Office",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=100,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="25c9f1a2-3ac9-4604-b07d-7a9098641f51",
Synchronized="2017-08-05 16:53:31.0")
/** Column name Office */
public static final String COLUMNNAME_Office = "Office";
/** Set Org.
@param Org Org */
public void setOrg (String Org)
{
if (Org != null && Org.length() > 60)
{
log.warning("Length > 60 - truncated");
Org = Org.substring(0,59);
}
set_Value (COLUMNNAME_Org, Org);
}
/** Get Org.
@return Org */
public String getOrg() 
{
String value = (String)get_Value(COLUMNNAME_Org);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="a588ac8f-e0c4-4c29-8a67-23903441d9bb")
public static String es_PE_COLUMN_Org_Name="org";

@XendraColumn(AD_Element_ID="5b9267c9-576e-4e8a-8d61-db74f52e6b9c",ColumnName="Org",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a588ac8f-e0c4-4c29-8a67-23903441d9bb",
Synchronized="2017-08-05 16:53:31.0")
/** Column name Org */
public static final String COLUMNNAME_Org = "Org";
/** Set Phone.
@param Phone Identifies a telephone number */
public void setPhone (String Phone)
{
if (Phone != null && Phone.length() > 40)
{
log.warning("Length > 40 - truncated");
Phone = Phone.substring(0,39);
}
set_Value (COLUMNNAME_Phone, Phone);
}
/** Get Phone.
@return Identifies a telephone number */
public String getPhone() 
{
String value = (String)get_Value(COLUMNNAME_Phone);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="3518fb2d-205f-4a5b-8e8d-d4d36fcd1191")
public static String es_PE_COLUMN_Phone_Name="Phone";

@XendraColumn(AD_Element_ID="4842df23-a82d-d921-7e1e-5869844caceb",ColumnName="Phone",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3518fb2d-205f-4a5b-8e8d-d4d36fcd1191",
Synchronized="2017-08-05 16:53:31.0")
/** Column name Phone */
public static final String COLUMNNAME_Phone = "Phone";
/** Set 2nd Phone.
@param Phone2 Identifies an alternate telephone number. */
public void setPhone2 (String Phone2)
{
if (Phone2 != null && Phone2.length() > 40)
{
log.warning("Length > 40 - truncated");
Phone2 = Phone2.substring(0,39);
}
set_Value (COLUMNNAME_Phone2, Phone2);
}
/** Get 2nd Phone.
@return Identifies an alternate telephone number. */
public String getPhone2() 
{
String value = (String)get_Value(COLUMNNAME_Phone2);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="c36276d9-e978-411e-9f24-8b5cd872e15a")
public static String es_PE_COLUMN_Phone2_Name="2nd Phone";

@XendraColumn(AD_Element_ID="619d752b-db65-e4fd-b230-313afdd72a83",ColumnName="Phone2",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c36276d9-e978-411e-9f24-8b5cd872e15a",
Synchronized="2017-08-05 16:53:31.0")
/** Column name Phone2 */
public static final String COLUMNNAME_Phone2 = "Phone2";
/** Set powerid.
@param powerid powerid */
public void setpowerid (String powerid)
{
if (powerid != null && powerid.length() > 40)
{
log.warning("Length > 40 - truncated");
powerid = powerid.substring(0,39);
}
set_Value (COLUMNNAME_powerid, powerid);
}
/** Get powerid.
@return powerid */
public String getpowerid() 
{
String value = (String)get_Value(COLUMNNAME_powerid);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="8d36c7bc-d94a-4705-99c5-6ed230bca230")
public static String es_PE_COLUMN_powerid_Name="powerid";

@XendraColumn(AD_Element_ID="6db25016-8791-4524-ad16-a12149a8ab60",ColumnName="powerid",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8d36c7bc-d94a-4705-99c5-6ed230bca230",
Synchronized="2017-08-05 16:53:31.0")
/** Column name powerid */
public static final String COLUMNNAME_powerid = "powerid";
/** Set Prefix.
@param Prefix Prefix before the sequence number */
public void setPrefix (String Prefix)
{
if (Prefix != null && Prefix.length() > 60)
{
log.warning("Length > 60 - truncated");
Prefix = Prefix.substring(0,59);
}
set_Value (COLUMNNAME_Prefix, Prefix);
}
/** Get Prefix.
@return Prefix before the sequence number */
public String getPrefix() 
{
String value = (String)get_Value(COLUMNNAME_Prefix);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="a2c68b61-b030-4c1d-827c-6e893898a8f2")
public static String es_PE_COLUMN_Prefix_Name="Prefix";

@XendraColumn(AD_Element_ID="be6a221d-f61b-ebf0-5a2c-d677571991d6",ColumnName="Prefix",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a2c68b61-b030-4c1d-827c-6e893898a8f2",
Synchronized="2017-08-05 16:53:31.0")
/** Column name Prefix */
public static final String COLUMNNAME_Prefix = "Prefix";
/** Set Process Now.
@param Processing Process Now */
public void setProcessing (boolean Processing)
{
set_Value (COLUMNNAME_Processing, Boolean.valueOf(Processing));
}
/** Get Process Now.
@return Process Now */
public boolean isProcessing() 
{
Object oo = get_Value(COLUMNNAME_Processing);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="3a6fcd6b-33f6-4151-8fe5-fe2e4c25a5dc")
public static String es_PE_COLUMN_Processing_Name="Process Now";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3a6fcd6b-33f6-4151-8fe5-fe2e4c25a5dc",
Synchronized="2017-08-05 16:53:31.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
/** Set role.
@param role role */
public void setrole (String role)
{
if (role != null && role.length() > 100)
{
log.warning("Length > 100 - truncated");
role = role.substring(0,99);
}
set_Value (COLUMNNAME_role, role);
}
/** Get role.
@return role */
public String getrole() 
{
String value = (String)get_Value(COLUMNNAME_role);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="d5fd7dbf-788a-44e0-9f5f-f1fd2fbc4032")
public static String es_PE_COLUMN_role_Name="role";

@XendraColumn(AD_Element_ID="83fda574-5d7b-459a-bed3-73c42585b6f8",ColumnName="role",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=100,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d5fd7dbf-788a-44e0-9f5f-f1fd2fbc4032",
Synchronized="2017-08-05 16:53:31.0")
/** Column name role */
public static final String COLUMNNAME_role = "role";
/** Set SecondSurName.
@param SecondSurName SecondSurName */
public void setSecondSurName (String SecondSurName)
{
if (SecondSurName != null && SecondSurName.length() > 60)
{
log.warning("Length > 60 - truncated");
SecondSurName = SecondSurName.substring(0,59);
}
set_Value (COLUMNNAME_SecondSurName, SecondSurName);
}
/** Get SecondSurName.
@return SecondSurName */
public String getSecondSurName() 
{
String value = (String)get_Value(COLUMNNAME_SecondSurName);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="1f14264b-b327-4745-af92-3541d50fcde1")
public static String es_PE_COLUMN_SecondSurName_Name="secondsurname";

@XendraColumn(AD_Element_ID="5f897d66-c316-4b04-b05e-6b61a0a310bf",ColumnName="SecondSurName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1f14264b-b327-4745-af92-3541d50fcde1",
Synchronized="2017-08-05 16:53:31.0")
/** Column name SecondSurName */
public static final String COLUMNNAME_SecondSurName = "SecondSurName";
/** Set Signature.
@param Signature Signature */
public void setSignature (String Signature)
{
if (Signature != null && Signature.length() > 40)
{
log.warning("Length > 40 - truncated");
Signature = Signature.substring(0,39);
}
set_Value (COLUMNNAME_Signature, Signature);
}
/** Get Signature.
@return Signature */
public String getSignature() 
{
String value = (String)get_Value(COLUMNNAME_Signature);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="aa795f86-17b9-44ca-bb7d-2d917ede842f")
public static String es_PE_COLUMN_Signature_Name="Signature";

@XendraColumn(AD_Element_ID="980443ea-14d3-4695-91bb-4aef0ce02ba8",ColumnName="Signature",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="aa795f86-17b9-44ca-bb7d-2d917ede842f",
Synchronized="2017-08-05 16:53:31.0")
/** Column name Signature */
public static final String COLUMNNAME_Signature = "Signature";
/** Set SortString.
@param SortString SortString */
public void setSortString (String SortString)
{
if (SortString != null && SortString.length() > 20)
{
log.warning("Length > 20 - truncated");
SortString = SortString.substring(0,19);
}
set_Value (COLUMNNAME_SortString, SortString);
}
/** Get SortString.
@return SortString */
public String getSortString() 
{
String value = (String)get_Value(COLUMNNAME_SortString);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="3bd8a9ce-f355-4c83-98a0-5f777cccadb9")
public static String es_PE_COLUMN_SortString_Name="sortstring";

@XendraColumn(AD_Element_ID="2b58e970-c769-4192-bc96-6d501eb2c9bc",ColumnName="SortString",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3bd8a9ce-f355-4c83-98a0-5f777cccadb9",
Synchronized="2017-08-05 16:53:31.0")
/** Column name SortString */
public static final String COLUMNNAME_SortString = "SortString";
/** Set Suffix.
@param Suffix Suffix after the number */
public void setSuffix (String Suffix)
{
if (Suffix != null && Suffix.length() > 60)
{
log.warning("Length > 60 - truncated");
Suffix = Suffix.substring(0,59);
}
set_Value (COLUMNNAME_Suffix, Suffix);
}
/** Get Suffix.
@return Suffix after the number */
public String getSuffix() 
{
String value = (String)get_Value(COLUMNNAME_Suffix);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="f1bef3ef-e251-415a-9069-5242ac2dde81")
public static String es_PE_COLUMN_Suffix_Name="Suffix";

@XendraColumn(AD_Element_ID="0404eac5-3c2b-06f8-cfae-d59c9fd0677d",ColumnName="Suffix",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f1bef3ef-e251-415a-9069-5242ac2dde81",
Synchronized="2017-08-05 16:53:31.0")
/** Column name Suffix */
public static final String COLUMNNAME_Suffix = "Suffix";
/** Set Title.
@param Title Name this entity is referred to as */
public void setTitle (String Title)
{
if (Title != null && Title.length() > 40)
{
log.warning("Length > 40 - truncated");
Title = Title.substring(0,39);
}
set_Value (COLUMNNAME_Title, Title);
}
/** Get Title.
@return Name this entity is referred to as */
public String getTitle() 
{
String value = (String)get_Value(COLUMNNAME_Title);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="b95f79ca-46ec-45f8-b915-6fe14489b9a2")
public static String es_PE_COLUMN_Title_Name="Title";

@XendraColumn(AD_Element_ID="05a7b975-a2e2-1303-e323-2e3fdda7ebd3",ColumnName="Title",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b95f79ca-46ec-45f8-b915-6fe14489b9a2",
Synchronized="2017-08-05 16:53:31.0")
/** Column name Title */
public static final String COLUMNNAME_Title = "Title";
/** Set URL.
@param URL Full URL address - e.g. http://www.adempiere.org */
public void setURL (String URL)
{
if (URL != null && URL.length() > 100)
{
log.warning("Length > 100 - truncated");
URL = URL.substring(0,99);
}
set_Value (COLUMNNAME_URL, URL);
}
/** Get URL.
@return Full URL address - e.g. http://www.adempiere.org */
public String getURL() 
{
String value = (String)get_Value(COLUMNNAME_URL);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="f4a5b768-0fed-4f68-8072-f01d18493a6f")
public static String es_PE_COLUMN_URL_Name="URL";

@XendraColumn(AD_Element_ID="28e2c006-3aca-a761-94d4-14eac9cc634c",ColumnName="URL",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=100,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f4a5b768-0fed-4f68-8072-f01d18493a6f",
Synchronized="2017-08-05 16:53:31.0")
/** Column name URL */
public static final String COLUMNNAME_URL = "URL";
/** Set URL_Blog.
@param URL_Blog URL_Blog */
public void setURL_Blog (String URL_Blog)
{
if (URL_Blog != null && URL_Blog.length() > 100)
{
log.warning("Length > 100 - truncated");
URL_Blog = URL_Blog.substring(0,99);
}
set_Value (COLUMNNAME_URL_Blog, URL_Blog);
}
/** Get URL_Blog.
@return URL_Blog */
public String getURL_Blog() 
{
String value = (String)get_Value(COLUMNNAME_URL_Blog);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="0033dbac-cb02-40ac-999d-e6f1ea993f55")
public static String es_PE_COLUMN_URL_Blog_Name="url_blog";

@XendraColumn(AD_Element_ID="f3f07915-826e-4437-8952-df417b6c590c",ColumnName="URL_Blog",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=100,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0033dbac-cb02-40ac-999d-e6f1ea993f55",
Synchronized="2017-08-05 16:53:31.0")
/** Column name URL_Blog */
public static final String COLUMNNAME_URL_Blog = "URL_Blog";
/** Set URL_Calendar.
@param URL_Calendar URL_Calendar */
public void setURL_Calendar (String URL_Calendar)
{
if (URL_Calendar != null && URL_Calendar.length() > 100)
{
log.warning("Length > 100 - truncated");
URL_Calendar = URL_Calendar.substring(0,99);
}
set_Value (COLUMNNAME_URL_Calendar, URL_Calendar);
}
/** Get URL_Calendar.
@return URL_Calendar */
public String getURL_Calendar() 
{
String value = (String)get_Value(COLUMNNAME_URL_Calendar);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="27f9e376-1d1a-4dec-bbd8-e1e104ca6852")
public static String es_PE_COLUMN_URL_Calendar_Name="url_calendar";

@XendraColumn(AD_Element_ID="d3874366-882a-4dcd-a9f6-34d9813b5cd6",ColumnName="URL_Calendar",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=100,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="27f9e376-1d1a-4dec-bbd8-e1e104ca6852",
Synchronized="2017-08-05 16:53:31.0")
/** Column name URL_Calendar */
public static final String COLUMNNAME_URL_Calendar = "URL_Calendar";
/** Set URL_Freebusy.
@param URL_Freebusy URL_Freebusy */
public void setURL_Freebusy (String URL_Freebusy)
{
if (URL_Freebusy != null && URL_Freebusy.length() > 100)
{
log.warning("Length > 100 - truncated");
URL_Freebusy = URL_Freebusy.substring(0,99);
}
set_Value (COLUMNNAME_URL_Freebusy, URL_Freebusy);
}
/** Get URL_Freebusy.
@return URL_Freebusy */
public String getURL_Freebusy() 
{
String value = (String)get_Value(COLUMNNAME_URL_Freebusy);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="a23c5507-133f-4271-afb6-2757dae417d4")
public static String es_PE_COLUMN_URL_Freebusy_Name="url_freebusy";

@XendraColumn(AD_Element_ID="04b151f4-98be-442b-b5cf-b91d1b1f008e",ColumnName="URL_Freebusy",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=100,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a23c5507-133f-4271-afb6-2757dae417d4",
Synchronized="2017-08-05 16:53:31.0")
/** Column name URL_Freebusy */
public static final String COLUMNNAME_URL_Freebusy = "URL_Freebusy";
/** Set Search Key.
@param Value Search key for the record in the format required - must be unique */
public void setValue (String Value)
{
if (Value == null) throw new IllegalArgumentException ("Value is mandatory.");
if (Value.length() > 40)
{
log.warning("Length > 40 - truncated");
Value = Value.substring(0,39);
}
set_Value (COLUMNNAME_Value, Value);
}
/** Get Search Key.
@return Search key for the record in the format required - must be unique */
public String getValue() 
{
String value = (String)get_Value(COLUMNNAME_Value);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="23387194-e135-47d8-a994-bab16b67f8ea")
public static String es_PE_COLUMN_Value_Name="Search Key";

@XendraColumn(AD_Element_ID="e75e100c-9b41-a643-2cb3-46eeced683d8",ColumnName="Value",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="23387194-e135-47d8-a994-bab16b67f8ea",
Synchronized="2017-08-05 16:53:31.0")
/** Column name Value */
public static final String COLUMNNAME_Value = "Value";
}
