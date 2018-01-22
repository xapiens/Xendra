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
import org.compiere.model.reference.REF_Weekdays;
/** Generated Model for C_PaySchedule
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_PaySchedule extends PO
{
/** Standard Constructor
@param ctx context
@param C_PaySchedule_ID id
@param trxName transaction
*/
public X_C_PaySchedule (Properties ctx, int C_PaySchedule_ID, String trxName)
{
super (ctx, C_PaySchedule_ID, trxName);
/** if (C_PaySchedule_ID == 0)
{
setC_PaymentTerm_ID (0);
setC_PaySchedule_ID (0);
setDiscount (Env.ZERO);
setDiscountDays (0);
setGraceDays (0);
setIsValid (false);	
// N
setNetDays (0);
setPercentage (Env.ZERO);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_PaySchedule (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=548 */
public static int Table_ID=MTable.getTable_ID("C_PaySchedule");

@XendraTrl(Identifier="824512e7-9cba-c09e-7cf0-ef7ac3ee4947")
public static String es_PE_TAB_Schedule_Description="Esquema de Pago";

@XendraTrl(Identifier="824512e7-9cba-c09e-7cf0-ef7ac3ee4947")
public static String es_PE_TAB_Schedule_Name="Esquema";
@XendraTab(Name="Schedule",
Description="Payment Schedule",Help="",AD_Window_ID="176da775-8ea3-bf34-d8a9-178e4ce29d42",
SeqNo=30,TabLevel=1,IsSingleRow=false,IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="",HasTree=false,WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",
AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",
ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="824512e7-9cba-c09e-7cf0-ef7ac3ee4947",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Schedule="824512e7-9cba-c09e-7cf0-ef7ac3ee4947";

@XendraTrl(Identifier="6d33c952-52c9-f795-3e52-25fa725f99db")
public static String es_PE_TABLE_C_PaySchedule_Name="Programa de Pagos";

@XendraTable(Name="Payment Schedule",Description="Payment Schedule Template",Help="",
TableName="C_PaySchedule",AccessLevel="3",AD_Window_ID="176da775-8ea3-bf34-d8a9-178e4ce29d42",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=140,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="6d33c952-52c9-f795-3e52-25fa725f99db",Synchronized="2017-08-16 11:42:11.0")
/** TableName=C_PaySchedule */
public static final String Table_Name="C_PaySchedule";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_PaySchedule");

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
    Table_ID = MTable.getTable_ID("C_PaySchedule");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_PaySchedule[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Payment Term.
@param C_PaymentTerm_ID The terms of Payment (timing, discount) */
public void setC_PaymentTerm_ID (int C_PaymentTerm_ID)
{
if (C_PaymentTerm_ID < 1) throw new IllegalArgumentException ("C_PaymentTerm_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_PaymentTerm_ID, Integer.valueOf(C_PaymentTerm_ID));
}
/** Get Payment Term.
@return The terms of Payment (timing, discount) */
public int getC_PaymentTerm_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_PaymentTerm_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getC_PaymentTerm_ID()));
}

@XendraTrl(Identifier="aa658573-f169-671f-ebb0-0c2ad255b6a0")
public static String es_PE_FIELD_Schedule_PaymentTerm_Description="Condiciones de pago de esta transacción";

@XendraTrl(Identifier="aa658573-f169-671f-ebb0-0c2ad255b6a0")
public static String es_PE_FIELD_Schedule_PaymentTerm_Help="Las condiciones de pago indican el método y tiempo de pago para esta transacción.";

@XendraTrl(Identifier="aa658573-f169-671f-ebb0-0c2ad255b6a0")
public static String es_PE_FIELD_Schedule_PaymentTerm_Name="Término de Pago";

@XendraField(AD_Column_ID="C_PaymentTerm_ID",IsCentrallyMaintained=true,
AD_Tab_ID="824512e7-9cba-c09e-7cf0-ef7ac3ee4947",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="aa658573-f169-671f-ebb0-0c2ad255b6a0")
public static final String FIELDNAME_Schedule_PaymentTerm="aa658573-f169-671f-ebb0-0c2ad255b6a0";

@XendraTrl(Identifier="ab021f32-6ceb-ec37-eb0c-4fc1ef48ec72")
public static String es_PE_COLUMN_C_PaymentTerm_ID_Name="Término de Pago";

@XendraColumn(AD_Element_ID="9b2224b8-8020-a83c-2d1e-ea35741c781a",ColumnName="C_PaymentTerm_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ab021f32-6ceb-ec37-eb0c-4fc1ef48ec72",
Synchronized="2017-08-05 16:54:04.0")
/** Column name C_PaymentTerm_ID */
public static final String COLUMNNAME_C_PaymentTerm_ID = "C_PaymentTerm_ID";
/** Set Payment Schedule.
@param C_PaySchedule_ID Payment Schedule Template */
public void setC_PaySchedule_ID (int C_PaySchedule_ID)
{
if (C_PaySchedule_ID < 1) throw new IllegalArgumentException ("C_PaySchedule_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_PaySchedule_ID, Integer.valueOf(C_PaySchedule_ID));
}
/** Get Payment Schedule.
@return Payment Schedule Template */
public int getC_PaySchedule_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_PaySchedule_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f110ce28-eb74-ad65-85b3-cf4c638ebbe1")
public static String es_PE_FIELD_Schedule_PaymentSchedule_Description="Plantilla de agenda de pagos.";

@XendraTrl(Identifier="f110ce28-eb74-ad65-85b3-cf4c638ebbe1")
public static String es_PE_FIELD_Schedule_PaymentSchedule_Help="Información cuando las partes del pago son debidas.";

@XendraTrl(Identifier="f110ce28-eb74-ad65-85b3-cf4c638ebbe1")
public static String es_PE_FIELD_Schedule_PaymentSchedule_Name="Programa de Pagos";

@XendraField(AD_Column_ID="C_PaySchedule_ID",IsCentrallyMaintained=true,
AD_Tab_ID="824512e7-9cba-c09e-7cf0-ef7ac3ee4947",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f110ce28-eb74-ad65-85b3-cf4c638ebbe1")
public static final String FIELDNAME_Schedule_PaymentSchedule="f110ce28-eb74-ad65-85b3-cf4c638ebbe1";
/** Column name C_PaySchedule_ID */
public static final String COLUMNNAME_C_PaySchedule_ID = "C_PaySchedule_ID";
/** Set Discount %.
@param Discount Discount in percent */
public void setDiscount (BigDecimal Discount)
{
if (Discount == null) throw new IllegalArgumentException ("Discount is mandatory.");
set_Value (COLUMNNAME_Discount, Discount);
}
/** Get Discount %.
@return Discount in percent */
public BigDecimal getDiscount() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Discount);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="c9c38cf2-f469-2cd4-3b3d-1fc697794aee")
public static String es_PE_FIELD_Schedule_Discount_Description="Descuento en porcentaje";

@XendraTrl(Identifier="c9c38cf2-f469-2cd4-3b3d-1fc697794aee")
public static String es_PE_FIELD_Schedule_Discount_Help="El Descuento indica el descuento aplicado o tomado como un porcentaje.";

@XendraTrl(Identifier="c9c38cf2-f469-2cd4-3b3d-1fc697794aee")
public static String es_PE_FIELD_Schedule_Discount_Name="% Descuento";

@XendraField(AD_Column_ID="Discount",IsCentrallyMaintained=true,
AD_Tab_ID="824512e7-9cba-c09e-7cf0-ef7ac3ee4947",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c9c38cf2-f469-2cd4-3b3d-1fc697794aee")
public static final String FIELDNAME_Schedule_Discount="c9c38cf2-f469-2cd4-3b3d-1fc697794aee";

@XendraTrl(Identifier="3915de02-ceb0-0e75-3dea-106eceec80f4")
public static String es_PE_COLUMN_Discount_Name="% Descuento";

@XendraColumn(AD_Element_ID="3d8e2bac-29ff-f758-dd80-f9b4107077e6",ColumnName="Discount",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3915de02-ceb0-0e75-3dea-106eceec80f4",
Synchronized="2017-08-05 16:54:04.0")
/** Column name Discount */
public static final String COLUMNNAME_Discount = "Discount";
/** Set Discount Days.
@param DiscountDays Number of days from invoice date to be eligible for discount */
public void setDiscountDays (int DiscountDays)
{
set_Value (COLUMNNAME_DiscountDays, Integer.valueOf(DiscountDays));
}
/** Get Discount Days.
@return Number of days from invoice date to be eligible for discount */
public int getDiscountDays() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_DiscountDays);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="62ebce82-e775-6f2f-6fc1-1bae8c052147")
public static String es_PE_FIELD_Schedule_DiscountDays_Description="Número de días desde la fecha de la factura hasta la fecha de descuento";

@XendraTrl(Identifier="62ebce82-e775-6f2f-6fc1-1bae8c052147")
public static String es_PE_FIELD_Schedule_DiscountDays_Help="El día de descuento indica el número de días en que el pago debe ser hecho para ser elegible al descuento establecido";

@XendraTrl(Identifier="62ebce82-e775-6f2f-6fc1-1bae8c052147")
public static String es_PE_FIELD_Schedule_DiscountDays_Name="Días de Descuento";

@XendraField(AD_Column_ID="DiscountDays",IsCentrallyMaintained=true,
AD_Tab_ID="824512e7-9cba-c09e-7cf0-ef7ac3ee4947",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="62ebce82-e775-6f2f-6fc1-1bae8c052147")
public static final String FIELDNAME_Schedule_DiscountDays="62ebce82-e775-6f2f-6fc1-1bae8c052147";

@XendraTrl(Identifier="263b7477-17b9-ef95-b7eb-6d401ffb54c4")
public static String es_PE_COLUMN_DiscountDays_Name="Días de Descuento";

@XendraColumn(AD_Element_ID="70c771c5-7b53-d10c-97c3-9285057be132",ColumnName="DiscountDays",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="263b7477-17b9-ef95-b7eb-6d401ffb54c4",
Synchronized="2017-08-05 16:54:04.0")
/** Column name DiscountDays */
public static final String COLUMNNAME_DiscountDays = "DiscountDays";
/** Set Grace Days.
@param GraceDays Days after due date to send first dunning letter */
public void setGraceDays (int GraceDays)
{
set_Value (COLUMNNAME_GraceDays, Integer.valueOf(GraceDays));
}
/** Get Grace Days.
@return Days after due date to send first dunning letter */
public int getGraceDays() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_GraceDays);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="850b5e32-5b68-bfe2-1896-17d4e89b2c3e")
public static String es_PE_FIELD_Schedule_GraceDays_Description="Días después de la fecha de vencimiento para enviar la primera carta de morosidad";

@XendraTrl(Identifier="850b5e32-5b68-bfe2-1896-17d4e89b2c3e")
public static String es_PE_FIELD_Schedule_GraceDays_Help="Días de gracia indica el número de días después de la fecha de vencimiento para enviar la primera carta de morosidad. Este campo se desplegará solamente si el cuadro de verificación enviar cartas de morosidad ha sido seleccionado";

@XendraTrl(Identifier="850b5e32-5b68-bfe2-1896-17d4e89b2c3e")
public static String es_PE_FIELD_Schedule_GraceDays_Name="Días de Gracia";

@XendraField(AD_Column_ID="GraceDays",IsCentrallyMaintained=true,
AD_Tab_ID="824512e7-9cba-c09e-7cf0-ef7ac3ee4947",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="850b5e32-5b68-bfe2-1896-17d4e89b2c3e")
public static final String FIELDNAME_Schedule_GraceDays="850b5e32-5b68-bfe2-1896-17d4e89b2c3e";

@XendraTrl(Identifier="66085624-7edc-79d7-b17e-45d810fc2a0f")
public static String es_PE_COLUMN_GraceDays_Name="Días de Gracia";

@XendraColumn(AD_Element_ID="5db0c6c3-26a5-fde2-9b91-af60517be938",ColumnName="GraceDays",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="66085624-7edc-79d7-b17e-45d810fc2a0f",
Synchronized="2017-08-05 16:54:04.0")
/** Column name GraceDays */
public static final String COLUMNNAME_GraceDays = "GraceDays";
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
@XendraTrl(Identifier="d82278b9-3867-4a8c-9fe7-ed354059a0c7")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d82278b9-3867-4a8c-9fe7-ed354059a0c7",
Synchronized="2017-08-05 16:54:04.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Valid.
@param IsValid Element is valid */
public void setIsValid (boolean IsValid)
{
set_Value (COLUMNNAME_IsValid, Boolean.valueOf(IsValid));
}
/** Get Valid.
@return Element is valid */
public boolean isValid() 
{
Object oo = get_Value(COLUMNNAME_IsValid);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="65578c5d-524c-6c9b-ef61-62a57441313b")
public static String es_PE_FIELD_Schedule_Valid_Description="El elemento es valido";

@XendraTrl(Identifier="65578c5d-524c-6c9b-ef61-62a57441313b")
public static String es_PE_FIELD_Schedule_Valid_Help="El elemento pasado es el cheque de la validación";

@XendraTrl(Identifier="65578c5d-524c-6c9b-ef61-62a57441313b")
public static String es_PE_FIELD_Schedule_Valid_Name="Valido";
@XendraField(AD_Column_ID="IsValid",
IsCentrallyMaintained=true,AD_Tab_ID="824512e7-9cba-c09e-7cf0-ef7ac3ee4947",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=50,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="65578c5d-524c-6c9b-ef61-62a57441313b")
public static final String FIELDNAME_Schedule_Valid="65578c5d-524c-6c9b-ef61-62a57441313b";

@XendraTrl(Identifier="bfc724d4-6cd6-4c49-3497-6f24a702e3fa")
public static String es_PE_COLUMN_IsValid_Name="Valido";

@XendraColumn(AD_Element_ID="394c3099-1638-2f07-2e14-7bd38bb8ad25",ColumnName="IsValid",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bfc724d4-6cd6-4c49-3497-6f24a702e3fa",
Synchronized="2017-08-05 16:54:04.0")
/** Column name IsValid */
public static final String COLUMNNAME_IsValid = "IsValid";

/** NetDay AD_Reference=83e938bc-4a87-77a1-cbb0-83c31065e487 */
public static final int NETDAY_AD_Reference_ID=167;
/** Set Net Day.
@param NetDay Day when payment is due net */
public void setNetDay (String NetDay)
{
if (NetDay == null || NetDay.equals(REF_Weekdays.Sunday) || NetDay.equals(REF_Weekdays.Monday) || NetDay.equals(REF_Weekdays.Tuesday) || NetDay.equals(REF_Weekdays.Wednesday) || NetDay.equals(REF_Weekdays.Thursday) || NetDay.equals(REF_Weekdays.Friday) || NetDay.equals(REF_Weekdays.Saturday));
 else throw new IllegalArgumentException ("NetDay Invalid value - " + NetDay + " - Reference_ID=167 - 7 - 1 - 2 - 3 - 4 - 5 - 6");
if (NetDay != null && NetDay.length() > 1)
{
log.warning("Length > 1 - truncated");
NetDay = NetDay.substring(0,0);
}
set_Value (COLUMNNAME_NetDay, NetDay);
}
/** Get Net Day.
@return Day when payment is due net */
public String getNetDay() 
{
return (String)get_Value(COLUMNNAME_NetDay);
}

@XendraTrl(Identifier="5384065d-839b-014f-2ff7-a1e9265213e8")
public static String es_PE_FIELD_Schedule_NetDay_Description="Día cuando se efectuará el pago";

@XendraTrl(Identifier="5384065d-839b-014f-2ff7-a1e9265213e8")
public static String es_PE_FIELD_Schedule_NetDay_Help="Cuando está definido, sobreescribe el número de los días netos con el número relativo de días el día definido.";

@XendraTrl(Identifier="5384065d-839b-014f-2ff7-a1e9265213e8")
public static String es_PE_FIELD_Schedule_NetDay_Name="Día Neto";

@XendraField(AD_Column_ID="NetDay",IsCentrallyMaintained=true,
AD_Tab_ID="824512e7-9cba-c09e-7cf0-ef7ac3ee4947",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5384065d-839b-014f-2ff7-a1e9265213e8")
public static final String FIELDNAME_Schedule_NetDay="5384065d-839b-014f-2ff7-a1e9265213e8";

@XendraTrl(Identifier="5c44512b-37d0-95d1-c2e3-2475b6789ac0")
public static String es_PE_COLUMN_NetDay_Name="Día Neto";

@XendraColumn(AD_Element_ID="077bc8b4-fcff-dfe2-09c6-0ae658109a32",ColumnName="NetDay",
AD_Reference_ID=17,AD_Reference_Value_ID="83e938bc-4a87-77a1-cbb0-83c31065e487",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="5c44512b-37d0-95d1-c2e3-2475b6789ac0",Synchronized="2017-08-05 16:54:04.0")
/** Column name NetDay */
public static final String COLUMNNAME_NetDay = "NetDay";
/** Set Net Days.
@param NetDays Net Days in which payment is due */
public void setNetDays (int NetDays)
{
set_Value (COLUMNNAME_NetDays, Integer.valueOf(NetDays));
}
/** Get Net Days.
@return Net Days in which payment is due */
public int getNetDays() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_NetDays);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="1eb3b85c-679a-d635-43ac-3b562ec9ee3e")
public static String es_PE_FIELD_Schedule_NetDays_Description="Días netos en los cuales el pago se vence";

@XendraTrl(Identifier="1eb3b85c-679a-d635-43ac-3b562ec9ee3e")
public static String es_PE_FIELD_Schedule_NetDays_Help="Indica el número de días después de la fecha de la factura en que el pago se vence";

@XendraTrl(Identifier="1eb3b85c-679a-d635-43ac-3b562ec9ee3e")
public static String es_PE_FIELD_Schedule_NetDays_Name="Días Neto";

@XendraField(AD_Column_ID="NetDays",IsCentrallyMaintained=true,
AD_Tab_ID="824512e7-9cba-c09e-7cf0-ef7ac3ee4947",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=70,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1eb3b85c-679a-d635-43ac-3b562ec9ee3e")
public static final String FIELDNAME_Schedule_NetDays="1eb3b85c-679a-d635-43ac-3b562ec9ee3e";

@XendraTrl(Identifier="986b2398-3ca8-2d61-761d-336358a38399")
public static String es_PE_COLUMN_NetDays_Name="Días Neto";

@XendraColumn(AD_Element_ID="8c6a9b99-2bf1-0a28-1149-2bfd59b7c622",ColumnName="NetDays",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=2,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="986b2398-3ca8-2d61-761d-336358a38399",
Synchronized="2017-08-05 16:54:04.0")
/** Column name NetDays */
public static final String COLUMNNAME_NetDays = "NetDays";
/** Set Percentage.
@param Percentage Percent of the entire amount */
public void setPercentage (BigDecimal Percentage)
{
if (Percentage == null) throw new IllegalArgumentException ("Percentage is mandatory.");
set_Value (COLUMNNAME_Percentage, Percentage);
}
/** Get Percentage.
@return Percent of the entire amount */
public BigDecimal getPercentage() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Percentage);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="237586e5-b8ca-11a4-f89a-d81df2ebe2d2")
public static String es_PE_FIELD_Schedule_Percentage_Description="Porcentaje sobre la cantidad total";

@XendraTrl(Identifier="237586e5-b8ca-11a4-f89a-d81df2ebe2d2")
public static String es_PE_FIELD_Schedule_Percentage_Help="Porcentaje de una cantidad (hasta 100)";

@XendraTrl(Identifier="237586e5-b8ca-11a4-f89a-d81df2ebe2d2")
public static String es_PE_FIELD_Schedule_Percentage_Name="Porcentaje";

@XendraField(AD_Column_ID="Percentage",IsCentrallyMaintained=true,
AD_Tab_ID="824512e7-9cba-c09e-7cf0-ef7ac3ee4947",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="237586e5-b8ca-11a4-f89a-d81df2ebe2d2")
public static final String FIELDNAME_Schedule_Percentage="237586e5-b8ca-11a4-f89a-d81df2ebe2d2";

@XendraTrl(Identifier="885dee6a-e313-9e81-33c3-b681d68d4df7")
public static String es_PE_COLUMN_Percentage_Name="Porcentaje";

@XendraColumn(AD_Element_ID="83c6b07c-0e8e-a56f-24aa-d4262980060d",ColumnName="Percentage",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=3,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="885dee6a-e313-9e81-33c3-b681d68d4df7",
Synchronized="2017-08-05 16:54:04.0")
/** Column name Percentage */
public static final String COLUMNNAME_Percentage = "Percentage";
}
