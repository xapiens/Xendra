/******************************************************************************
 * Product: Xendra ERP & CRM Smart Business Solution                          *
 * Copyright (C)  dravios       All Rights Reserved.                          *
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
/** Generated Model for S_DocAdvance
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_S_DocAdvance extends PO
{
/** Standard Constructor
@param ctx context
@param S_DocAdvance_ID id
@param trxName transaction
*/
public X_S_DocAdvance (Properties ctx, int S_DocAdvance_ID, String trxName)
{
super (ctx, S_DocAdvance_ID, trxName);
/** if (S_DocAdvance_ID == 0)
{
setS_DocAdvance_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_S_DocAdvance (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000429 */
public static int Table_ID=MTable.getTable_ID("S_DocAdvance");

@XendraTrl(Identifier="bf780937-4ba0-49ce-a01f-c5c1122810ad")
public static String es_PE_TABLE_S_DocAdvance_Name="Doc Adelanto Sunat";

@XendraTable(Name="Doc Adelanto Sunat",AD_Package_ID="2ac04657-d663-47c2-4ec1-927ad71f1e96",
AD_Plugin_ID="",Description="",Help="",TableName="S_DocAdvance",AccessLevel="6",AD_Window_ID="",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=false,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="",
Identifier="bf780937-4ba0-49ce-a01f-c5c1122810ad",Synchronized="2022-09-14 10:12:36.0")
/** TableName=S_DocAdvance */
public static final String Table_Name="S_DocAdvance";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"S_DocAdvance");

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
    Table_ID = MTable.getTable_ID("S_DocAdvance");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_S_DocAdvance[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Amount.
@param Amount Amount in a defined currency */
public void setAmount (BigDecimal Amount)
{
set_Value (COLUMNNAME_Amount, Amount);
}
/** Get Amount.
@return Amount in a defined currency */
public BigDecimal getAmount() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Amount);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="e68fee55-2463-49b1-ae99-d1826a3da5bd")
public static String es_PE_COLUMN_Amount_Name="Amount";

@XendraColumn(AD_Element_ID="d89b3a02-29fd-e2e3-2d01-dbda08fb2454",ColumnName="Amount",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=14,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e68fee55-2463-49b1-ae99-d1826a3da5bd",
Synchronized="2022-08-25 21:59:59.0")
/** Column name Amount */
public static final String COLUMNNAME_Amount = "Amount";
/** Set Currency.
@param C_Currency_ID The Currency for this record */
public void setC_Currency_ID (int C_Currency_ID)
{
if (C_Currency_ID <= 0) set_Value (COLUMNNAME_C_Currency_ID, null);
 else 
set_Value (COLUMNNAME_C_Currency_ID, Integer.valueOf(C_Currency_ID));
}
/** Get Currency.
@return The Currency for this record */
public int getC_Currency_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Currency_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="a6b8735b-05ba-425f-8988-3115379b0dc1")
public static String es_PE_COLUMN_C_Currency_ID_Name="Currency";

@XendraColumn(AD_Element_ID="8daec488-bca2-50fe-f9de-abf0cba2a34a",ColumnName="C_Currency_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a6b8735b-05ba-425f-8988-3115379b0dc1",
Synchronized="2022-08-25 21:59:59.0")
/** Column name C_Currency_ID */
public static final String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
/** Set C_InvoiceAdvance.
@param C_InvoiceAdvance_ID C_InvoiceAdvance */
public void setC_InvoiceAdvance_ID (int C_InvoiceAdvance_ID)
{
if (C_InvoiceAdvance_ID <= 0) set_Value (COLUMNNAME_C_InvoiceAdvance_ID, null);
 else 
set_Value (COLUMNNAME_C_InvoiceAdvance_ID, Integer.valueOf(C_InvoiceAdvance_ID));
}
/** Get C_InvoiceAdvance.
@return C_InvoiceAdvance */
public int getC_InvoiceAdvance_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_InvoiceAdvance_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="b5ee9529-8345-4720-851e-ed7f30603276")
public static String es_PE_COLUMN_C_InvoiceAdvance_ID_Name="C_InvoiceAdvance";

@XendraColumn(AD_Element_ID="73d5858f-7fab-c200-0aa4-6028ec6f6e29",
ColumnName="C_InvoiceAdvance_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="b5ee9529-8345-4720-851e-ed7f30603276",Synchronized="2022-08-25 21:59:59.0")
/** Column name C_InvoiceAdvance_ID */
public static final String COLUMNNAME_C_InvoiceAdvance_ID = "C_InvoiceAdvance_ID";
/** Set Account Date.
@param DateAcct Accounting Date */
public void setDateAcct (Timestamp DateAcct)
{
set_Value (COLUMNNAME_DateAcct, DateAcct);
}
/** Get Account Date.
@return Accounting Date */
public Timestamp getDateAcct() 
{
return (Timestamp)get_Value(COLUMNNAME_DateAcct);
}

@XendraTrl(Identifier="c78d5b91-6750-4cf8-8adf-e3825ec584e7")
public static String es_PE_COLUMN_DateAcct_Name="Account Date";

@XendraColumn(AD_Element_ID="034727d0-e80f-fadf-3d4f-2d8d37b75669",ColumnName="DateAcct",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c78d5b91-6750-4cf8-8adf-e3825ec584e7",
Synchronized="2022-08-25 21:59:59.0")
/** Column name DateAcct */
public static final String COLUMNNAME_DateAcct = "DateAcct";
/** Set docu_anticipo_docu_numero.
@param docu_anticipo_docu_numero docu_anticipo_docu_numero */
public void setdocu_anticipo_docu_numero (String docu_anticipo_docu_numero)
{
if (docu_anticipo_docu_numero != null && docu_anticipo_docu_numero.length() > 45)
{
log.warning("Length > 45 - truncated");
docu_anticipo_docu_numero = docu_anticipo_docu_numero.substring(0,44);
}
set_Value (COLUMNNAME_docu_anticipo_docu_numero, docu_anticipo_docu_numero);
}
/** Get docu_anticipo_docu_numero.
@return docu_anticipo_docu_numero */
public String getdocu_anticipo_docu_numero() 
{
String value = (String)get_Value(COLUMNNAME_docu_anticipo_docu_numero);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="b6b0c918-c531-4afa-8abe-c4086ee6252f")
public static String es_PE_COLUMN_docu_anticipo_docu_numero_Name="docu_anticipo_docu_numero";

@XendraColumn(AD_Element_ID="9e5159aa-8dc1-40b9-aded-2535a41031ba",
ColumnName="docu_anticipo_docu_numero",AD_Reference_ID=10,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=45,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="b6b0c918-c531-4afa-8abe-c4086ee6252f",Synchronized="2022-08-25 21:59:59.0")
/** Column name docu_anticipo_docu_numero */
public static final String COLUMNNAME_docu_anticipo_docu_numero = "docu_anticipo_docu_numero";
/** Set docu_anticipo_docu_tipo.
@param docu_anticipo_docu_tipo docu_anticipo_docu_tipo */
public void setdocu_anticipo_docu_tipo (String docu_anticipo_docu_tipo)
{
if (docu_anticipo_docu_tipo != null && docu_anticipo_docu_tipo.length() > 45)
{
log.warning("Length > 45 - truncated");
docu_anticipo_docu_tipo = docu_anticipo_docu_tipo.substring(0,44);
}
set_Value (COLUMNNAME_docu_anticipo_docu_tipo, docu_anticipo_docu_tipo);
}
/** Get docu_anticipo_docu_tipo.
@return docu_anticipo_docu_tipo */
public String getdocu_anticipo_docu_tipo() 
{
String value = (String)get_Value(COLUMNNAME_docu_anticipo_docu_tipo);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="b13839b2-d185-438f-80f2-bb8f384416c1")
public static String es_PE_COLUMN_docu_anticipo_docu_tipo_Name="docu_anticipo_docu_tipo";

@XendraColumn(AD_Element_ID="f5375435-50c2-4625-b2d1-4305cc5ed16f",
ColumnName="docu_anticipo_docu_tipo",AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=45,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="b13839b2-d185-438f-80f2-bb8f384416c1",Synchronized="2022-08-25 21:59:59.0")
/** Column name docu_anticipo_docu_tipo */
public static final String COLUMNNAME_docu_anticipo_docu_tipo = "docu_anticipo_docu_tipo";
/** Set docu_anticipo_fecha_emi.
@param docu_anticipo_fecha_emi docu_anticipo_fecha_emi */
public void setdocu_anticipo_fecha_emi (String docu_anticipo_fecha_emi)
{
if (docu_anticipo_fecha_emi != null && docu_anticipo_fecha_emi.length() > 45)
{
log.warning("Length > 45 - truncated");
docu_anticipo_fecha_emi = docu_anticipo_fecha_emi.substring(0,44);
}
set_Value (COLUMNNAME_docu_anticipo_fecha_emi, docu_anticipo_fecha_emi);
}
/** Get docu_anticipo_fecha_emi.
@return docu_anticipo_fecha_emi */
public String getdocu_anticipo_fecha_emi() 
{
String value = (String)get_Value(COLUMNNAME_docu_anticipo_fecha_emi);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="7ad0c155-75e8-4a08-8e70-f341249476a3")
public static String es_PE_COLUMN_docu_anticipo_fecha_emi_Name="docu_anticipo_fecha_emi";

@XendraColumn(AD_Element_ID="010cb7e3-c8de-43b3-ab06-a9bac0247c8f",
ColumnName="docu_anticipo_fecha_emi",AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=45,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="7ad0c155-75e8-4a08-8e70-f341249476a3",Synchronized="2022-08-25 21:59:59.0")
/** Column name docu_anticipo_fecha_emi */
public static final String COLUMNNAME_docu_anticipo_fecha_emi = "docu_anticipo_fecha_emi";
/** Set docu_anticipo_hora_emi.
@param docu_anticipo_hora_emi docu_anticipo_hora_emi */
public void setdocu_anticipo_hora_emi (String docu_anticipo_hora_emi)
{
if (docu_anticipo_hora_emi != null && docu_anticipo_hora_emi.length() > 45)
{
log.warning("Length > 45 - truncated");
docu_anticipo_hora_emi = docu_anticipo_hora_emi.substring(0,44);
}
set_Value (COLUMNNAME_docu_anticipo_hora_emi, docu_anticipo_hora_emi);
}
/** Get docu_anticipo_hora_emi.
@return docu_anticipo_hora_emi */
public String getdocu_anticipo_hora_emi() 
{
String value = (String)get_Value(COLUMNNAME_docu_anticipo_hora_emi);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="8b3301ca-3953-483f-92bc-725dc381ebf0")
public static String es_PE_COLUMN_docu_anticipo_hora_emi_Name="docu_anticipo_hora_emi";

@XendraColumn(AD_Element_ID="d4d2ec40-5a36-413e-b789-f632163928eb",
ColumnName="docu_anticipo_hora_emi",AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=45,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="8b3301ca-3953-483f-92bc-725dc381ebf0",Synchronized="2022-08-25 21:59:59.0")
/** Column name docu_anticipo_hora_emi */
public static final String COLUMNNAME_docu_anticipo_hora_emi = "docu_anticipo_hora_emi";
/** Set docu_anticipo_numero_docu_emi.
@param docu_anticipo_numero_docu_emi docu_anticipo_numero_docu_emi */
public void setdocu_anticipo_numero_docu_emi (String docu_anticipo_numero_docu_emi)
{
if (docu_anticipo_numero_docu_emi != null && docu_anticipo_numero_docu_emi.length() > 45)
{
log.warning("Length > 45 - truncated");
docu_anticipo_numero_docu_emi = docu_anticipo_numero_docu_emi.substring(0,44);
}
set_Value (COLUMNNAME_docu_anticipo_numero_docu_emi, docu_anticipo_numero_docu_emi);
}
/** Get docu_anticipo_numero_docu_emi.
@return docu_anticipo_numero_docu_emi */
public String getdocu_anticipo_numero_docu_emi() 
{
String value = (String)get_Value(COLUMNNAME_docu_anticipo_numero_docu_emi);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="6fd5f565-14d6-4d9f-9706-34a1c504471a")
public static String es_PE_COLUMN_docu_anticipo_numero_docu_emi_Name="docu_anticipo_numero_docu_emi";

@XendraColumn(AD_Element_ID="6abb99d6-1beb-4a97-a6ce-6b4fd96fb468",
ColumnName="docu_anticipo_numero_docu_emi",AD_Reference_ID=10,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=45,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="6fd5f565-14d6-4d9f-9706-34a1c504471a",Synchronized="2022-08-25 21:59:59.0")
/** Column name docu_anticipo_numero_docu_emi */
public static final String COLUMNNAME_docu_anticipo_numero_docu_emi = "docu_anticipo_numero_docu_emi";
/** Set docu_anticipo_prepago.
@param docu_anticipo_prepago docu_anticipo_prepago */
public void setdocu_anticipo_prepago (String docu_anticipo_prepago)
{
if (docu_anticipo_prepago != null && docu_anticipo_prepago.length() > 45)
{
log.warning("Length > 45 - truncated");
docu_anticipo_prepago = docu_anticipo_prepago.substring(0,44);
}
set_Value (COLUMNNAME_docu_anticipo_prepago, docu_anticipo_prepago);
}
/** Get docu_anticipo_prepago.
@return docu_anticipo_prepago */
public String getdocu_anticipo_prepago() 
{
String value = (String)get_Value(COLUMNNAME_docu_anticipo_prepago);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="ae6fbd74-1ae5-4572-bbdc-83479be82eff")
public static String es_PE_COLUMN_docu_anticipo_prepago_Name="docu_anticipo_prepago";

@XendraColumn(AD_Element_ID="8435dd86-0885-4d8e-a9cc-3a0870e69c50",
ColumnName="docu_anticipo_prepago",AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=45,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="ae6fbd74-1ae5-4572-bbdc-83479be82eff",Synchronized="2022-08-25 21:59:59.0")
/** Column name docu_anticipo_prepago */
public static final String COLUMNNAME_docu_anticipo_prepago = "docu_anticipo_prepago";
/** Set docu_anticipo_tipo_docu_emi.
@param docu_anticipo_tipo_docu_emi docu_anticipo_tipo_docu_emi */
public void setdocu_anticipo_tipo_docu_emi (String docu_anticipo_tipo_docu_emi)
{
if (docu_anticipo_tipo_docu_emi != null && docu_anticipo_tipo_docu_emi.length() > 45)
{
log.warning("Length > 45 - truncated");
docu_anticipo_tipo_docu_emi = docu_anticipo_tipo_docu_emi.substring(0,44);
}
set_Value (COLUMNNAME_docu_anticipo_tipo_docu_emi, docu_anticipo_tipo_docu_emi);
}
/** Get docu_anticipo_tipo_docu_emi.
@return docu_anticipo_tipo_docu_emi */
public String getdocu_anticipo_tipo_docu_emi() 
{
String value = (String)get_Value(COLUMNNAME_docu_anticipo_tipo_docu_emi);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="89813d72-b10f-4366-be92-b15bdfd0b796")
public static String es_PE_COLUMN_docu_anticipo_tipo_docu_emi_Name="docu_anticipo_tipo_docu_emi";

@XendraColumn(AD_Element_ID="d6fd5586-3186-48a1-98ea-e1160d995f16",
ColumnName="docu_anticipo_tipo_docu_emi",AD_Reference_ID=10,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=45,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="89813d72-b10f-4366-be92-b15bdfd0b796",Synchronized="2022-08-25 21:59:59.0")
/** Column name docu_anticipo_tipo_docu_emi */
public static final String COLUMNNAME_docu_anticipo_tipo_docu_emi = "docu_anticipo_tipo_docu_emi";
/** Set Document No.
@param DocumentNo Document sequence number of the document */
public void setDocumentNo (String DocumentNo)
{
if (DocumentNo != null && DocumentNo.length() > 30)
{
log.warning("Length > 30 - truncated");
DocumentNo = DocumentNo.substring(0,29);
}
set_Value (COLUMNNAME_DocumentNo, DocumentNo);
}
/** Get Document No.
@return Document sequence number of the document */
public String getDocumentNo() 
{
String value = (String)get_Value(COLUMNNAME_DocumentNo);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="dd3414a5-2dd2-4d33-ad4e-a1adc5de97b3")
public static String es_PE_COLUMN_DocumentNo_Name="Document No";

@XendraColumn(AD_Element_ID="e3ca6e28-702a-2722-d941-b2072a0de9cb",ColumnName="DocumentNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="dd3414a5-2dd2-4d33-ad4e-a1adc5de97b3",
Synchronized="2022-08-25 21:59:59.0")
/** Column name DocumentNo */
public static final String COLUMNNAME_DocumentNo = "DocumentNo";
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
@XendraTrl(Identifier="67803ca1-8d83-4a89-b83e-02bc34aeb692")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="67803ca1-8d83-4a89-b83e-02bc34aeb692",
Synchronized="2022-08-25 21:59:59.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set SchemeID.
@param SchemeID SchemeID */
public void setSchemeID (String SchemeID)
{
if (SchemeID != null && SchemeID.length() > 20)
{
log.warning("Length > 20 - truncated");
SchemeID = SchemeID.substring(0,19);
}
set_Value (COLUMNNAME_SchemeID, SchemeID);
}
/** Get SchemeID.
@return SchemeID */
public String getSchemeID() 
{
String value = (String)get_Value(COLUMNNAME_SchemeID);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="0a99cb37-30ab-49c0-b076-df865cbd04c7")
public static String es_PE_COLUMN_SchemeID_Name="schemeid";

@XendraColumn(AD_Element_ID="92b5a8bb-b6c8-4ed1-bbab-e74c2c191517",ColumnName="SchemeID",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0a99cb37-30ab-49c0-b076-df865cbd04c7",
Synchronized="2022-08-25 21:59:59.0")
/** Column name SchemeID */
public static final String COLUMNNAME_SchemeID = "SchemeID";
/** Set Doc Adelanto Sunat.
@param S_DocAdvance_ID Doc Adelanto Sunat */
public void setS_DocAdvance_ID (int S_DocAdvance_ID)
{
if (S_DocAdvance_ID < 1) throw new IllegalArgumentException ("S_DocAdvance_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_S_DocAdvance_ID, Integer.valueOf(S_DocAdvance_ID));
}
/** Get Doc Adelanto Sunat.
@return Doc Adelanto Sunat */
public int getS_DocAdvance_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_S_DocAdvance_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name S_DocAdvance_ID */
public static final String COLUMNNAME_S_DocAdvance_ID = "S_DocAdvance_ID";
/** Set S_DocHeader_ID.
@param S_DocHeader_ID S_DocHeader_ID */
public void setS_DocHeader_ID (int S_DocHeader_ID)
{
if (S_DocHeader_ID <= 0) set_Value (COLUMNNAME_S_DocHeader_ID, null);
 else 
set_Value (COLUMNNAME_S_DocHeader_ID, Integer.valueOf(S_DocHeader_ID));
}
/** Get S_DocHeader_ID.
@return S_DocHeader_ID */
public int getS_DocHeader_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_S_DocHeader_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="cee48d46-56cc-4ad0-ab85-1cbf0ae8d1db")
public static String es_PE_COLUMN_S_DocHeader_ID_Name="S_DocHeader_ID";

@XendraColumn(AD_Element_ID="51cdf354-f5f5-4380-86e3-e1607a818626",ColumnName="S_DocHeader_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cee48d46-56cc-4ad0-ab85-1cbf0ae8d1db",
Synchronized="2022-08-25 22:00:00.0")
/** Column name S_DocHeader_ID */
public static final String COLUMNNAME_S_DocHeader_ID = "S_DocHeader_ID";
}
