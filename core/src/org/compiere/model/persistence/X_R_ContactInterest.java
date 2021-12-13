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
/** Generated Model for R_ContactInterest
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_R_ContactInterest extends PO
{
/** Standard Constructor
@param ctx context
@param R_ContactInterest_ID id
@param trxName transaction
*/
public X_R_ContactInterest (Properties ctx, int R_ContactInterest_ID, String trxName)
{
super (ctx, R_ContactInterest_ID, trxName);
/** if (R_ContactInterest_ID == 0)
{
setAD_User_ID (0);	
// @AD_User_ID@
setR_InterestArea_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_R_ContactInterest (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=528 */
public static int Table_ID=MTable.getTable_ID("R_ContactInterest");

@XendraTrl(Identifier="5715e30a-1f22-4043-96cf-f797934fa251")
public static String es_PE_TAB_Subscriptions_Name="Suscripción";
@XendraTab(Name="Subscriptions",
Description="User Subscriptions",Help="",AD_Window_ID="cbadf0d4-f118-0bd1-a224-303786a4e4a8",
SeqNo=20,TabLevel=1,IsSingleRow=false,IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="f2a642fe-221e-62b1-bad2-5d92e4fad2d9",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="5715e30a-1f22-4043-96cf-f797934fa251",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Subscriptions="5715e30a-1f22-4043-96cf-f797934fa251";

@XendraTrl(Identifier="a6fe78ae-88d7-b40c-c602-8d88064dda02")
public static String es_PE_TAB_InterestArea_Description="Área de Interés del Contacto del Socio de Negocio";

@XendraTrl(Identifier="a6fe78ae-88d7-b40c-c602-8d88064dda02")
public static String es_PE_TAB_InterestArea_Help="Área de Interés puede ser usada para las campañas de mercadeo.";

@XendraTrl(Identifier="a6fe78ae-88d7-b40c-c602-8d88064dda02")
public static String es_PE_TAB_InterestArea_Name="Area de Interés";
@XendraTab(Name="Interest Area",
Description="Business Partner Contact Interest Area",
Help="Interest Area can be used for Marketing Campaigns",
AD_Window_ID="273719a2-ec2e-9b44-d30b-014c7ec70d0e",SeqNo=110,TabLevel=2,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="ed47c1ba-60cc-138b-513e-ec7422b3d96a",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="a6fe78ae-88d7-b40c-c602-8d88064dda02",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_InterestArea="a6fe78ae-88d7-b40c-c602-8d88064dda02";

@XendraTrl(Identifier="40c74a07-0c30-a9d8-bbc8-73556a3e064b")
public static String es_PE_TABLE_R_ContactInterest_Name="R_ContactInterest";

@XendraTable(Name="R_ContactInterest",AD_Package_ID="1b3656e5-71c7-1296-994e-9b2c4549c7fd",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="R_ContactInterest",AccessLevel="3",AD_Window_ID="cbadf0d4-f118-0bd1-a224-303786a4e4a8",
AD_Val_Rule_ID="",IsKey=0,LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.standard",
Identifier="40c74a07-0c30-a9d8-bbc8-73556a3e064b",Synchronized="2020-03-03 21:39:29.0")
/** TableName=R_ContactInterest */
public static final String Table_Name="R_ContactInterest";


@XendraIndex(Name="r_contactinterest_key",Identifier="d912d229-e481-6943-bf5d-d27d260920a5",
Column_Names="ad_user_id, r_interestarea_id",IsUnique="true",
TableIdentifier="d912d229-e481-6943-bf5d-d27d260920a5",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_r_contactinterest_key = "d912d229-e481-6943-bf5d-d27d260920a5";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"R_ContactInterest");

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
    Table_ID = MTable.getTable_ID("R_ContactInterest");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_R_ContactInterest[").append(get_ID()).append("]");
return sb.toString();
}
/** Set User/Contact.
@param AD_User_ID User within the system - Internal or Business Partner Contact */
public void setAD_User_ID (int AD_User_ID)
{
if (AD_User_ID < 1) throw new IllegalArgumentException ("AD_User_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_User_ID, Integer.valueOf(AD_User_ID));
}
/** Get User/Contact.
@return User within the system - Internal or Business Partner Contact */
public int getAD_User_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_User_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getAD_User_ID()));
}

@XendraTrl(Identifier="cc35fe5f-c4e0-72ce-2758-fd816b6f3822")
public static String es_PE_FIELD_InterestArea_UserContact_Name="Usuario";

@XendraTrl(Identifier="cc35fe5f-c4e0-72ce-2758-fd816b6f3822")
public static String es_PE_FIELD_InterestArea_UserContact_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="cc35fe5f-c4e0-72ce-2758-fd816b6f3822")
public static String es_PE_FIELD_InterestArea_UserContact_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a6fe78ae-88d7-b40c-c602-8d88064dda02",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cc35fe5f-c4e0-72ce-2758-fd816b6f3822")
public static final String FIELDNAME_InterestArea_UserContact="cc35fe5f-c4e0-72ce-2758-fd816b6f3822";

@XendraTrl(Identifier="904f8e9b-da5e-d462-0102-7c3caae1f3c2")
public static String es_PE_FIELD_Subscriptions_UserContact_Name="Usuario";

@XendraTrl(Identifier="904f8e9b-da5e-d462-0102-7c3caae1f3c2")
public static String es_PE_FIELD_Subscriptions_UserContact_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="904f8e9b-da5e-d462-0102-7c3caae1f3c2")
public static String es_PE_FIELD_Subscriptions_UserContact_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5715e30a-1f22-4043-96cf-f797934fa251",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="904f8e9b-da5e-d462-0102-7c3caae1f3c2")
public static final String FIELDNAME_Subscriptions_UserContact="904f8e9b-da5e-d462-0102-7c3caae1f3c2";

@XendraTrl(Identifier="ed47c1ba-60cc-138b-513e-ec7422b3d96a")
public static String es_PE_COLUMN_AD_User_ID_Name="Usuario";

@XendraColumn(AD_Element_ID="abdf8dee-d3cd-73ec-c758-683e907797f4",ColumnName="AD_User_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="f4ac36a1-4200-1386-677e-14ac90afb4fe",
FieldLength=22,DefaultValue="@AD_User_ID@",IsKey=false,IsInternal=false,IsParent=true,
IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=true,SeqNo=1,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="ed47c1ba-60cc-138b-513e-ec7422b3d96a",Synchronized="2019-08-30 22:23:44.0")
/** Column name AD_User_ID */
public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";
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
@XendraTrl(Identifier="6d42430f-c623-4823-aae9-79384bb7ab29")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6d42430f-c623-4823-aae9-79384bb7ab29",
Synchronized="2019-08-30 22:23:44.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Opt-out Date.
@param OptOutDate Date the contact opted out */
public void setOptOutDate (Timestamp OptOutDate)
{
set_ValueNoCheck (COLUMNNAME_OptOutDate, OptOutDate);
}
/** Get Opt-out Date.
@return Date the contact opted out */
public Timestamp getOptOutDate() 
{
return (Timestamp)get_Value(COLUMNNAME_OptOutDate);
}

@XendraTrl(Identifier="8ac3c41c-261f-7755-e168-f83f89d55f99")
public static String es_PE_FIELD_InterestArea_Opt_OutDate_Name="Fecha de Baja";

@XendraTrl(Identifier="8ac3c41c-261f-7755-e168-f83f89d55f99")
public static String es_PE_FIELD_InterestArea_Opt_OutDate_Description="Fecha en que el contacto se dio de baja";

@XendraTrl(Identifier="8ac3c41c-261f-7755-e168-f83f89d55f99")
public static String es_PE_FIELD_InterestArea_Opt_OutDate_Help="Si el campo tiene una fecha; el cliente ha decidido cancelar su suscripción y no puede recibir correo sobre el área de interés.";

@XendraField(AD_Column_ID="OptOutDate",IsCentrallyMaintained=true,
AD_Tab_ID="a6fe78ae-88d7-b40c-c602-8d88064dda02",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=70,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8ac3c41c-261f-7755-e168-f83f89d55f99")
public static final String FIELDNAME_InterestArea_Opt_OutDate="8ac3c41c-261f-7755-e168-f83f89d55f99";

@XendraTrl(Identifier="d01504cc-c7b5-13c2-0273-bc22e10eb581")
public static String es_PE_FIELD_Subscriptions_Opt_OutDate_Name="Fecha de Baja";

@XendraTrl(Identifier="d01504cc-c7b5-13c2-0273-bc22e10eb581")
public static String es_PE_FIELD_Subscriptions_Opt_OutDate_Description="Fecha en que el contacto se dio de baja";

@XendraTrl(Identifier="d01504cc-c7b5-13c2-0273-bc22e10eb581")
public static String es_PE_FIELD_Subscriptions_Opt_OutDate_Help="Si el campo tiene una fecha; el cliente ha decidido cancelar su suscripción y no puede recibir correo sobre el área de interés.";

@XendraField(AD_Column_ID="OptOutDate",IsCentrallyMaintained=true,
AD_Tab_ID="5715e30a-1f22-4043-96cf-f797934fa251",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=70,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d01504cc-c7b5-13c2-0273-bc22e10eb581")
public static final String FIELDNAME_Subscriptions_Opt_OutDate="d01504cc-c7b5-13c2-0273-bc22e10eb581";

@XendraTrl(Identifier="09d2910b-3976-c53d-1884-207538933913")
public static String es_PE_COLUMN_OptOutDate_Name="Fecha de Baja";

@XendraColumn(AD_Element_ID="e4c11893-5217-7a6d-9a7a-e6a6c0401fd9",ColumnName="OptOutDate",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="09d2910b-3976-c53d-1884-207538933913",
Synchronized="2019-08-30 22:23:44.0")
/** Column name OptOutDate */
public static final String COLUMNNAME_OptOutDate = "OptOutDate";
/** Set Interest Area.
@param R_InterestArea_ID Interest Area or Topic */
public void setR_InterestArea_ID (int R_InterestArea_ID)
{
if (R_InterestArea_ID < 1) throw new IllegalArgumentException ("R_InterestArea_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_R_InterestArea_ID, Integer.valueOf(R_InterestArea_ID));
}
/** Get Interest Area.
@return Interest Area or Topic */
public int getR_InterestArea_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_R_InterestArea_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="21ffc183-1b8f-a5b9-9c90-52a7a6138291")
public static String es_PE_FIELD_InterestArea_InterestArea_Name="Area de Interés";

@XendraTrl(Identifier="21ffc183-1b8f-a5b9-9c90-52a7a6138291")
public static String es_PE_FIELD_InterestArea_InterestArea_Description="Area de interés o tópico";

@XendraTrl(Identifier="21ffc183-1b8f-a5b9-9c90-52a7a6138291")
public static String es_PE_FIELD_InterestArea_InterestArea_Help="Areas de interés reflejan interés en un tópico por un contacto. Areas de interés pueden ser usadas para campañas de mercadeo";

@XendraField(AD_Column_ID="R_InterestArea_ID",IsCentrallyMaintained=true,
AD_Tab_ID="a6fe78ae-88d7-b40c-c602-8d88064dda02",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="21ffc183-1b8f-a5b9-9c90-52a7a6138291")
public static final String FIELDNAME_InterestArea_InterestArea="21ffc183-1b8f-a5b9-9c90-52a7a6138291";

@XendraTrl(Identifier="9c1dbc2b-546f-2645-6adf-b925279676a4")
public static String es_PE_FIELD_Subscriptions_InterestArea_Name="Area de Interés";

@XendraTrl(Identifier="9c1dbc2b-546f-2645-6adf-b925279676a4")
public static String es_PE_FIELD_Subscriptions_InterestArea_Description="Area de interés o tópico";

@XendraTrl(Identifier="9c1dbc2b-546f-2645-6adf-b925279676a4")
public static String es_PE_FIELD_Subscriptions_InterestArea_Help="Areas de interés reflejan interés en un tópico por un contacto. Areas de interés pueden ser usadas para campañas de mercadeo";

@XendraField(AD_Column_ID="R_InterestArea_ID",IsCentrallyMaintained=true,
AD_Tab_ID="5715e30a-1f22-4043-96cf-f797934fa251",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9c1dbc2b-546f-2645-6adf-b925279676a4")
public static final String FIELDNAME_Subscriptions_InterestArea="9c1dbc2b-546f-2645-6adf-b925279676a4";

@XendraTrl(Identifier="f2a642fe-221e-62b1-bad2-5d92e4fad2d9")
public static String es_PE_COLUMN_R_InterestArea_ID_Name="Area de Interés";

@XendraColumn(AD_Element_ID="dabdec86-c4bc-85ae-f4f8-23ecf76c23c1",ColumnName="R_InterestArea_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=2,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f2a642fe-221e-62b1-bad2-5d92e4fad2d9",
Synchronized="2019-08-30 22:23:44.0")
/** Column name R_InterestArea_ID */
public static final String COLUMNNAME_R_InterestArea_ID = "R_InterestArea_ID";
/** Set Subscribe Date.
@param SubscribeDate Date the contact actively subscribed */
public void setSubscribeDate (Timestamp SubscribeDate)
{
set_ValueNoCheck (COLUMNNAME_SubscribeDate, SubscribeDate);
}
/** Get Subscribe Date.
@return Date the contact actively subscribed */
public Timestamp getSubscribeDate() 
{
return (Timestamp)get_Value(COLUMNNAME_SubscribeDate);
}

@XendraTrl(Identifier="c253f4f5-eb17-892d-b648-c0d772b42c2d")
public static String es_PE_FIELD_InterestArea_SubscribeDate_Name="Fecha de Alta";

@XendraTrl(Identifier="c253f4f5-eb17-892d-b648-c0d772b42c2d")
public static String es_PE_FIELD_InterestArea_SubscribeDate_Description="Fecha en la que el contacto se suscribió";

@XendraTrl(Identifier="c253f4f5-eb17-892d-b648-c0d772b42c2d")
public static String es_PE_FIELD_InterestArea_SubscribeDate_Help="Fecha en la que el contacto se suscribió a un área de interés";

@XendraField(AD_Column_ID="SubscribeDate",IsCentrallyMaintained=true,
AD_Tab_ID="a6fe78ae-88d7-b40c-c602-8d88064dda02",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c253f4f5-eb17-892d-b648-c0d772b42c2d")
public static final String FIELDNAME_InterestArea_SubscribeDate="c253f4f5-eb17-892d-b648-c0d772b42c2d";

@XendraTrl(Identifier="5d54571f-522b-d6ec-efdd-4cabe6b37a89")
public static String es_PE_FIELD_Subscriptions_SubscribeDate_Name="Fecha de Alta";

@XendraTrl(Identifier="5d54571f-522b-d6ec-efdd-4cabe6b37a89")
public static String es_PE_FIELD_Subscriptions_SubscribeDate_Description="Fecha en la que el contacto se suscribió";

@XendraTrl(Identifier="5d54571f-522b-d6ec-efdd-4cabe6b37a89")
public static String es_PE_FIELD_Subscriptions_SubscribeDate_Help="Fecha en la que el contacto se suscribió a un área de interés";

@XendraField(AD_Column_ID="SubscribeDate",IsCentrallyMaintained=true,
AD_Tab_ID="5715e30a-1f22-4043-96cf-f797934fa251",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5d54571f-522b-d6ec-efdd-4cabe6b37a89")
public static final String FIELDNAME_Subscriptions_SubscribeDate="5d54571f-522b-d6ec-efdd-4cabe6b37a89";

@XendraTrl(Identifier="f1e8b816-063b-ab58-d166-0a4d6726b7d4")
public static String es_PE_COLUMN_SubscribeDate_Name="Fecha de Alta";

@XendraColumn(AD_Element_ID="5dd4bc63-aa12-af97-0dd4-dcf0c73d0cc8",ColumnName="SubscribeDate",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f1e8b816-063b-ab58-d166-0a4d6726b7d4",
Synchronized="2019-08-30 22:23:44.0")
/** Column name SubscribeDate */
public static final String COLUMNNAME_SubscribeDate = "SubscribeDate";
}
