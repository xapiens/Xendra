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
/** Generated Model for W_Counter
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_W_Counter extends PO
{
/** Standard Constructor
@param ctx context
@param W_Counter_ID id
@param trxName transaction
*/
public X_W_Counter (Properties ctx, int W_Counter_ID, String trxName)
{
super (ctx, W_Counter_ID, trxName);
/** if (W_Counter_ID == 0)
{
setPageURL (null);
setProcessed (false);	
// N
setRemote_Addr (null);
setRemote_Host (null);
setW_Counter_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_W_Counter (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=403 */
public static int Table_ID=MTable.getTable_ID("W_Counter");

@XendraTrl(Identifier="eb38295a-9e60-051a-68ed-6a97ab6c3b1b")
public static String es_PE_TAB_IndividualCount_Name="Contador Individual";

@XendraTab(Name="Individual Count",Description="",Help="",
AD_Window_ID="8f8d4e21-4aa4-aea5-05d8-e157ddc1d91a",SeqNo=20,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=true,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=false,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="eb38295a-9e60-051a-68ed-6a97ab6c3b1b",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_IndividualCount="eb38295a-9e60-051a-68ed-6a97ab6c3b1b";

@XendraTrl(Identifier="5b4d2337-aa30-4411-2336-fb065911db64")
public static String es_PE_TABLE_W_Counter_Name="Contador Web";

@XendraTable(Name="Web Counter",Description="Individual Count hit",Help="",TableName="W_Counter",
AccessLevel="3",AD_Window_ID="8f8d4e21-4aa4-aea5-05d8-e157ddc1d91a",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.standard",
Identifier="5b4d2337-aa30-4411-2336-fb065911db64",Synchronized="2017-08-16 11:44:28.0")
/** TableName=W_Counter */
public static final String Table_Name="W_Counter";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"W_Counter");

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
    Table_ID = MTable.getTable_ID("W_Counter");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_W_Counter[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Accept Language.
@param AcceptLanguage Language accepted based on browser information */
public void setAcceptLanguage (String AcceptLanguage)
{
if (AcceptLanguage != null && AcceptLanguage.length() > 60)
{
log.warning("Length > 60 - truncated");
AcceptLanguage = AcceptLanguage.substring(0,59);
}
set_Value (COLUMNNAME_AcceptLanguage, AcceptLanguage);
}
/** Get Accept Language.
@return Language accepted based on browser information */
public String getAcceptLanguage() 
{
String value = (String)get_Value(COLUMNNAME_AcceptLanguage);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="bc1142f8-a8e0-e21c-30e4-8c7661920aa2")
public static String es_PE_FIELD_IndividualCount_AcceptLanguage_Description="Lenguaje aceptado en información de paginadores";

@XendraTrl(Identifier="bc1142f8-a8e0-e21c-30e4-8c7661920aa2")
public static String es_PE_FIELD_IndividualCount_AcceptLanguage_Help="Indica si acepta el lenguaje en información de paginadores.";

@XendraTrl(Identifier="bc1142f8-a8e0-e21c-30e4-8c7661920aa2")
public static String es_PE_FIELD_IndividualCount_AcceptLanguage_Name="Aceptar Lenguaje";

@XendraField(AD_Column_ID="AcceptLanguage",IsCentrallyMaintained=true,
AD_Tab_ID="eb38295a-9e60-051a-68ed-6a97ab6c3b1b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bc1142f8-a8e0-e21c-30e4-8c7661920aa2")
public static final String FIELDNAME_IndividualCount_AcceptLanguage="bc1142f8-a8e0-e21c-30e4-8c7661920aa2";

@XendraTrl(Identifier="4eba9e4d-5f34-387e-2faf-6a03af7fddd3")
public static String es_PE_COLUMN_AcceptLanguage_Name="Aceptar Lenguaje";

@XendraColumn(AD_Element_ID="b5a6a8c8-e3ab-7bc5-a9c1-82035b78da62",ColumnName="AcceptLanguage",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4eba9e4d-5f34-387e-2faf-6a03af7fddd3",
Synchronized="2017-08-05 16:56:32.0")
/** Column name AcceptLanguage */
public static final String COLUMNNAME_AcceptLanguage = "AcceptLanguage";
/** Set User/Contact.
@param AD_User_ID User within the system - Internal or Business Partner Contact */
public void setAD_User_ID (int AD_User_ID)
{
if (AD_User_ID <= 0) set_Value (COLUMNNAME_AD_User_ID, null);
 else 
set_Value (COLUMNNAME_AD_User_ID, Integer.valueOf(AD_User_ID));
}
/** Get User/Contact.
@return User within the system - Internal or Business Partner Contact */
public int getAD_User_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_User_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="fd20278f-47d3-3044-1f17-f22400936644")
public static String es_PE_FIELD_IndividualCount_UserContact_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="fd20278f-47d3-3044-1f17-f22400936644")
public static String es_PE_FIELD_IndividualCount_UserContact_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraTrl(Identifier="fd20278f-47d3-3044-1f17-f22400936644")
public static String es_PE_FIELD_IndividualCount_UserContact_Name="Usuario";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="eb38295a-9e60-051a-68ed-6a97ab6c3b1b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fd20278f-47d3-3044-1f17-f22400936644")
public static final String FIELDNAME_IndividualCount_UserContact="fd20278f-47d3-3044-1f17-f22400936644";

@XendraTrl(Identifier="3fa68478-4703-c238-0fe7-a18aef471820")
public static String es_PE_COLUMN_AD_User_ID_Name="Usuario";

@XendraColumn(AD_Element_ID="abdf8dee-d3cd-73ec-c758-683e907797f4",ColumnName="AD_User_ID",
AD_Reference_ID=13,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3fa68478-4703-c238-0fe7-a18aef471820",
Synchronized="2017-08-05 16:56:32.0")
/** Column name AD_User_ID */
public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";
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
@XendraTrl(Identifier="c769c36e-2997-94d2-4ae3-ab81be60df1e")
public static String es_PE_FIELD_IndividualCount_EMailAddress_Description="ID de correo electrónico";

@XendraTrl(Identifier="c769c36e-2997-94d2-4ae3-ab81be60df1e")
public static String es_PE_FIELD_IndividualCount_EMailAddress_Help="El Email indica la ID de correo electrónico para este usuario";

@XendraTrl(Identifier="c769c36e-2997-94d2-4ae3-ab81be60df1e")
public static String es_PE_FIELD_IndividualCount_EMailAddress_Name="Email";

@XendraField(AD_Column_ID="EMail",IsCentrallyMaintained=true,
AD_Tab_ID="eb38295a-9e60-051a-68ed-6a97ab6c3b1b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c769c36e-2997-94d2-4ae3-ab81be60df1e")
public static final String FIELDNAME_IndividualCount_EMailAddress="c769c36e-2997-94d2-4ae3-ab81be60df1e";

@XendraTrl(Identifier="51116b91-1fed-2068-035a-e3a25d5e23c5")
public static String es_PE_COLUMN_EMail_Name="Email";

@XendraColumn(AD_Element_ID="d18b300c-9ad6-2dd2-36d3-b65969743158",ColumnName="EMail",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="51116b91-1fed-2068-035a-e3a25d5e23c5",
Synchronized="2017-08-05 16:56:32.0")
/** Column name EMail */
public static final String COLUMNNAME_EMail = "EMail";
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
@XendraTrl(Identifier="39c6802c-4b58-450e-b9a5-0a157e93fbd8")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="39c6802c-4b58-450e-b9a5-0a157e93fbd8",
Synchronized="2017-08-05 16:56:32.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Page URL.
@param PageURL Page URL */
public void setPageURL (String PageURL)
{
if (PageURL == null) throw new IllegalArgumentException ("PageURL is mandatory.");
if (PageURL.length() > 120)
{
log.warning("Length > 120 - truncated");
PageURL = PageURL.substring(0,119);
}
set_Value (COLUMNNAME_PageURL, PageURL);
}
/** Get Page URL.
@return Page URL */
public String getPageURL() 
{
String value = (String)get_Value(COLUMNNAME_PageURL);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="e37e5253-88f5-6348-4370-448093d2b7df")
public static String es_PE_FIELD_IndividualCount_PageURL_Name="URL de la Página";

@XendraField(AD_Column_ID="PageURL",IsCentrallyMaintained=true,
AD_Tab_ID="eb38295a-9e60-051a-68ed-6a97ab6c3b1b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e37e5253-88f5-6348-4370-448093d2b7df")
public static final String FIELDNAME_IndividualCount_PageURL="e37e5253-88f5-6348-4370-448093d2b7df";

@XendraTrl(Identifier="ad55cdcc-a1e7-f60b-de3e-f788b2fcf79a")
public static String es_PE_COLUMN_PageURL_Name="URL de la Página";

@XendraColumn(AD_Element_ID="cfdc4b8b-1b18-e1ed-01b2-b5d6539274f1",ColumnName="PageURL",
AD_Reference_ID=40,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=120,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ad55cdcc-a1e7-f60b-de3e-f788b2fcf79a",
Synchronized="2017-08-05 16:56:32.0")
/** Column name PageURL */
public static final String COLUMNNAME_PageURL = "PageURL";
/** Set Processed.
@param Processed The document has been processed */
public void setProcessed (boolean Processed)
{
set_Value (COLUMNNAME_Processed, Boolean.valueOf(Processed));
}
/** Get Processed.
@return The document has been processed */
public boolean isProcessed() 
{
Object oo = get_Value(COLUMNNAME_Processed);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="baad0878-3a4a-8b1e-614e-ceb6cca052f1")
public static String es_PE_FIELD_IndividualCount_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="baad0878-3a4a-8b1e-614e-ceb6cca052f1")
public static String es_PE_FIELD_IndividualCount_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraTrl(Identifier="baad0878-3a4a-8b1e-614e-ceb6cca052f1")
public static String es_PE_FIELD_IndividualCount_Processed_Name="Procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="eb38295a-9e60-051a-68ed-6a97ab6c3b1b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="baad0878-3a4a-8b1e-614e-ceb6cca052f1")
public static final String FIELDNAME_IndividualCount_Processed="baad0878-3a4a-8b1e-614e-ceb6cca052f1";

@XendraTrl(Identifier="db9e534e-1ada-f69c-c56f-08d8900cb520")
public static String es_PE_COLUMN_Processed_Name="Procesado";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="db9e534e-1ada-f69c-c56f-08d8900cb520",
Synchronized="2017-08-05 16:56:32.0")
/** Column name Processed */
public static final String COLUMNNAME_Processed = "Processed";
/** Set Referrer.
@param Referrer Referring web address */
public void setReferrer (String Referrer)
{
if (Referrer != null && Referrer.length() > 120)
{
log.warning("Length > 120 - truncated");
Referrer = Referrer.substring(0,119);
}
set_Value (COLUMNNAME_Referrer, Referrer);
}
/** Get Referrer.
@return Referring web address */
public String getReferrer() 
{
String value = (String)get_Value(COLUMNNAME_Referrer);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="e29f3034-87a1-4318-edbd-96fcf8169e5f")
public static String es_PE_FIELD_IndividualCount_Referrer_Description="Dirección web de referencia";

@XendraTrl(Identifier="e29f3034-87a1-4318-edbd-96fcf8169e5f")
public static String es_PE_FIELD_IndividualCount_Referrer_Name="Referencia";

@XendraField(AD_Column_ID="Referrer",IsCentrallyMaintained=true,
AD_Tab_ID="eb38295a-9e60-051a-68ed-6a97ab6c3b1b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e29f3034-87a1-4318-edbd-96fcf8169e5f")
public static final String FIELDNAME_IndividualCount_Referrer="e29f3034-87a1-4318-edbd-96fcf8169e5f";

@XendraTrl(Identifier="3736aa53-38df-bf48-25dc-2241b84385c1")
public static String es_PE_COLUMN_Referrer_Name="Referencia";

@XendraColumn(AD_Element_ID="f47f85cc-8a02-b91f-3a82-fb6f10d6169e",ColumnName="Referrer",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=120,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3736aa53-38df-bf48-25dc-2241b84385c1",
Synchronized="2017-08-05 16:56:32.0")
/** Column name Referrer */
public static final String COLUMNNAME_Referrer = "Referrer";
/** Set Remote Addr.
@param Remote_Addr Remote Address */
public void setRemote_Addr (String Remote_Addr)
{
if (Remote_Addr == null) throw new IllegalArgumentException ("Remote_Addr is mandatory.");
if (Remote_Addr.length() > 60)
{
log.warning("Length > 60 - truncated");
Remote_Addr = Remote_Addr.substring(0,59);
}
set_Value (COLUMNNAME_Remote_Addr, Remote_Addr);
}
/** Get Remote Addr.
@return Remote Address */
public String getRemote_Addr() 
{
String value = (String)get_Value(COLUMNNAME_Remote_Addr);
if (value == null)
  return "";
return value;
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), getRemote_Addr());
}

@XendraTrl(Identifier="e9f82d9f-0bf2-f06d-544f-2300cc7567a5")
public static String es_PE_FIELD_IndividualCount_RemoteAddr_Description="Dirección remota";

@XendraTrl(Identifier="e9f82d9f-0bf2-f06d-544f-2300cc7567a5")
public static String es_PE_FIELD_IndividualCount_RemoteAddr_Help="La dirección remota indica una dirección alternativa ó externa";

@XendraTrl(Identifier="e9f82d9f-0bf2-f06d-544f-2300cc7567a5")
public static String es_PE_FIELD_IndividualCount_RemoteAddr_Name="Dirección Remota";

@XendraField(AD_Column_ID="Remote_Addr",IsCentrallyMaintained=true,
AD_Tab_ID="eb38295a-9e60-051a-68ed-6a97ab6c3b1b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e9f82d9f-0bf2-f06d-544f-2300cc7567a5")
public static final String FIELDNAME_IndividualCount_RemoteAddr="e9f82d9f-0bf2-f06d-544f-2300cc7567a5";

@XendraTrl(Identifier="fbc142d0-d05c-b35a-7c39-a73731179ffb")
public static String es_PE_COLUMN_Remote_Addr_Name="Dirección Remota";

@XendraColumn(AD_Element_ID="b1551fd7-ca8d-4a87-8302-e41caf5553d6",ColumnName="Remote_Addr",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fbc142d0-d05c-b35a-7c39-a73731179ffb",
Synchronized="2017-08-05 16:56:32.0")
/** Column name Remote_Addr */
public static final String COLUMNNAME_Remote_Addr = "Remote_Addr";
/** Set Remote Host.
@param Remote_Host Remote host Info */
public void setRemote_Host (String Remote_Host)
{
if (Remote_Host == null) throw new IllegalArgumentException ("Remote_Host is mandatory.");
if (Remote_Host.length() > 120)
{
log.warning("Length > 120 - truncated");
Remote_Host = Remote_Host.substring(0,119);
}
set_Value (COLUMNNAME_Remote_Host, Remote_Host);
}
/** Get Remote Host.
@return Remote host Info */
public String getRemote_Host() 
{
String value = (String)get_Value(COLUMNNAME_Remote_Host);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="6332e272-dc82-f01b-35a6-1e76c6a765ce")
public static String es_PE_FIELD_IndividualCount_RemoteHost_Name="Host Remoto";

@XendraField(AD_Column_ID="Remote_Host",IsCentrallyMaintained=true,
AD_Tab_ID="eb38295a-9e60-051a-68ed-6a97ab6c3b1b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6332e272-dc82-f01b-35a6-1e76c6a765ce")
public static final String FIELDNAME_IndividualCount_RemoteHost="6332e272-dc82-f01b-35a6-1e76c6a765ce";

@XendraTrl(Identifier="894a7f95-9ccc-4717-a420-a403d39217bf")
public static String es_PE_COLUMN_Remote_Host_Name="Host Remoto";

@XendraColumn(AD_Element_ID="eb636ff7-fd5e-fa57-d640-f766bf4e52b2",ColumnName="Remote_Host",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=120,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="894a7f95-9ccc-4717-a420-a403d39217bf",
Synchronized="2017-08-05 16:56:32.0")
/** Column name Remote_Host */
public static final String COLUMNNAME_Remote_Host = "Remote_Host";
/** Set User Agent.
@param UserAgent Browser Used */
public void setUserAgent (String UserAgent)
{
if (UserAgent != null && UserAgent.length() > 255)
{
log.warning("Length > 255 - truncated");
UserAgent = UserAgent.substring(0,254);
}
set_Value (COLUMNNAME_UserAgent, UserAgent);
}
/** Get User Agent.
@return Browser Used */
public String getUserAgent() 
{
String value = (String)get_Value(COLUMNNAME_UserAgent);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="1afb152f-8899-4405-6fa9-f2fa4292e68c")
public static String es_PE_FIELD_IndividualCount_UserAgent_Description="Paginador usado";

@XendraTrl(Identifier="1afb152f-8899-4405-6fa9-f2fa4292e68c")
public static String es_PE_FIELD_IndividualCount_UserAgent_Name="Agente del Usuario";

@XendraField(AD_Column_ID="UserAgent",IsCentrallyMaintained=true,
AD_Tab_ID="eb38295a-9e60-051a-68ed-6a97ab6c3b1b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1afb152f-8899-4405-6fa9-f2fa4292e68c")
public static final String FIELDNAME_IndividualCount_UserAgent="1afb152f-8899-4405-6fa9-f2fa4292e68c";

@XendraTrl(Identifier="0e8f5249-c42a-20a7-db69-2c22800e1dbf")
public static String es_PE_COLUMN_UserAgent_Name="Agente del Usuario";

@XendraColumn(AD_Element_ID="4a9fba4b-1174-5e1a-566b-fb1bed555e3e",ColumnName="UserAgent",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0e8f5249-c42a-20a7-db69-2c22800e1dbf",
Synchronized="2017-08-05 16:56:32.0")
/** Column name UserAgent */
public static final String COLUMNNAME_UserAgent = "UserAgent";
/** Set Counter Count.
@param W_CounterCount_ID Web Counter Count Management */
public void setW_CounterCount_ID (int W_CounterCount_ID)
{
if (W_CounterCount_ID <= 0) set_ValueNoCheck (COLUMNNAME_W_CounterCount_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_W_CounterCount_ID, Integer.valueOf(W_CounterCount_ID));
}
/** Get Counter Count.
@return Web Counter Count Management */
public int getW_CounterCount_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_W_CounterCount_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="09e3abcc-9b3b-66a8-10dd-9660129a64b2")
public static String es_PE_FIELD_IndividualCount_CounterCount_Description="Gerencia contraria de la cuenta Web";

@XendraTrl(Identifier="09e3abcc-9b3b-66a8-10dd-9660129a64b2")
public static String es_PE_FIELD_IndividualCount_CounterCount_Help="Información de la cuenta contaria en Web";

@XendraTrl(Identifier="09e3abcc-9b3b-66a8-10dd-9660129a64b2")
public static String es_PE_FIELD_IndividualCount_CounterCount_Name="Cuenta Contraria";

@XendraField(AD_Column_ID="W_CounterCount_ID",IsCentrallyMaintained=true,
AD_Tab_ID="eb38295a-9e60-051a-68ed-6a97ab6c3b1b",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="09e3abcc-9b3b-66a8-10dd-9660129a64b2")
public static final String FIELDNAME_IndividualCount_CounterCount="09e3abcc-9b3b-66a8-10dd-9660129a64b2";

@XendraTrl(Identifier="0a1d6f48-07d0-0728-9e3e-9e9a2e64a78a")
public static String es_PE_COLUMN_W_CounterCount_ID_Name="Cuenta Contraria";

@XendraColumn(AD_Element_ID="9676fb33-2d34-d665-ade0-44452ee92bf4",ColumnName="W_CounterCount_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0a1d6f48-07d0-0728-9e3e-9e9a2e64a78a",
Synchronized="2017-08-05 16:56:32.0")
/** Column name W_CounterCount_ID */
public static final String COLUMNNAME_W_CounterCount_ID = "W_CounterCount_ID";
/** Set Web Counter.
@param W_Counter_ID Individual Count hit */
public void setW_Counter_ID (int W_Counter_ID)
{
if (W_Counter_ID < 1) throw new IllegalArgumentException ("W_Counter_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_W_Counter_ID, Integer.valueOf(W_Counter_ID));
}
/** Get Web Counter.
@return Individual Count hit */
public int getW_Counter_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_W_Counter_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="0a306993-44c7-ff21-e8c8-09b3d7171990")
public static String es_PE_FIELD_IndividualCount_WebCounter_Name="Contador Web";

@XendraField(AD_Column_ID="W_Counter_ID",IsCentrallyMaintained=true,
AD_Tab_ID="eb38295a-9e60-051a-68ed-6a97ab6c3b1b",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=20,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0a306993-44c7-ff21-e8c8-09b3d7171990")
public static final String FIELDNAME_IndividualCount_WebCounter="0a306993-44c7-ff21-e8c8-09b3d7171990";
/** Column name W_Counter_ID */
public static final String COLUMNNAME_W_Counter_ID = "W_Counter_ID";
}
