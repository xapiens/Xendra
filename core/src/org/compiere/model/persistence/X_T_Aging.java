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
/** Generated Model for T_Aging
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_T_Aging extends PO
{
/** Standard Constructor
@param ctx context
@param T_Aging_ID id
@param trxName transaction
*/
public X_T_Aging (Properties ctx, int T_Aging_ID, String trxName)
{
super (ctx, T_Aging_ID, trxName);
/** if (T_Aging_ID == 0)
{
setAD_PInstance_ID (0);
setC_BPartner_ID (0);
setC_BP_Group_ID (0);
setC_Currency_ID (0);
setDateAcct (new Timestamp(System.currentTimeMillis()));
setDue0 (Env.ZERO);	
// 0
setDue0_30 (Env.ZERO);	
// 0
setDue0_7 (Env.ZERO);	
// 0
setDue1_7 (Env.ZERO);	
// 0
setDue31_60 (Env.ZERO);	
// 0
setDue31_Plus (Env.ZERO);	
// 0
setDue61_90 (Env.ZERO);	
// 0
setDue61_Plus (Env.ZERO);	
// 0
setDue8_30 (Env.ZERO);	
// 0
setDue91_Plus (Env.ZERO);	
// 0
setDueAmt (Env.ZERO);	
// 0
setDueDate (new Timestamp(System.currentTimeMillis()));
setInvoicedAmt (Env.ZERO);	
// 0
setIsListInvoices (false);	
// N
setIsSOTrx (false);	
// N
setOpenAmt (Env.ZERO);	
// 0
setPastDue1_30 (Env.ZERO);	
// 0
setPastDue1_7 (Env.ZERO);	
// 0
setPastDue31_60 (Env.ZERO);	
// 0
setPastDue31_Plus (Env.ZERO);	
// 0
setPastDue61_90 (Env.ZERO);	
// 0
setPastDue61_Plus (Env.ZERO);	
// 0
setPastDue8_30 (Env.ZERO);	
// 0
setPastDue91_Plus (Env.ZERO);	
// 0
setPastDueAmt (Env.ZERO);	
// 0
setStatementDate (new Timestamp(System.currentTimeMillis()));
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_T_Aging (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=631 */
public static int Table_ID=MTable.getTable_ID("T_Aging");

@XendraTrl(Identifier="653b6ab0-5630-80c8-90b3-8486f614085b")
public static String es_PE_TABLE_T_Aging_Name="T_Aging";

@XendraTable(Name="T_Aging",Description="",Help="",TableName="T_Aging",AccessLevel="3",
AD_Window_ID="",AD_Val_Rule_ID="",IsKey=0,LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,
IsHighVolume=true,IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.standard",
Identifier="653b6ab0-5630-80c8-90b3-8486f614085b",Synchronized="2017-08-16 11:44:18.0")
/** TableName=T_Aging */
public static final String Table_Name="T_Aging";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"T_Aging");

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
    Table_ID = MTable.getTable_ID("T_Aging");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_T_Aging[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Process Instance.
@param AD_PInstance_ID Instance of the process */
public void setAD_PInstance_ID (int AD_PInstance_ID)
{
if (AD_PInstance_ID < 1) throw new IllegalArgumentException ("AD_PInstance_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_PInstance_ID, Integer.valueOf(AD_PInstance_ID));
}
/** Get Process Instance.
@return Instance of the process */
public int getAD_PInstance_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_PInstance_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="b7967ac1-225f-2b9b-3184-52cf9ed2b100")
public static String es_PE_COLUMN_AD_PInstance_ID_Name="Instancia del Proceso";

@XendraColumn(AD_Element_ID="a293ee40-db79-24cc-fb47-781657ecb499",ColumnName="AD_PInstance_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b7967ac1-225f-2b9b-3184-52cf9ed2b100",
Synchronized="2017-08-05 16:56:23.0")
/** Column name AD_PInstance_ID */
public static final String COLUMNNAME_AD_PInstance_ID = "AD_PInstance_ID";
/** Set Activity.
@param C_Activity_ID Business Activity */
public void setC_Activity_ID (int C_Activity_ID)
{
if (C_Activity_ID <= 0) set_Value (COLUMNNAME_C_Activity_ID, null);
 else 
set_Value (COLUMNNAME_C_Activity_ID, Integer.valueOf(C_Activity_ID));
}
/** Get Activity.
@return Business Activity */
public int getC_Activity_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Activity_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="61de7395-bc62-067a-4b8c-1871123f235f")
public static String es_PE_COLUMN_C_Activity_ID_Name="Tipo de Gasto";

@XendraColumn(AD_Element_ID="bfeadbb3-d866-26e3-8eee-3e2fdf0ff753",ColumnName="C_Activity_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="61de7395-bc62-067a-4b8c-1871123f235f",
Synchronized="2017-08-05 16:56:23.0")
/** Column name C_Activity_ID */
public static final String COLUMNNAME_C_Activity_ID = "C_Activity_ID";
/** Set Business Partner .
@param C_BPartner_ID Identifies a Business Partner */
public void setC_BPartner_ID (int C_BPartner_ID)
{
if (C_BPartner_ID < 1) throw new IllegalArgumentException ("C_BPartner_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_BPartner_ID, Integer.valueOf(C_BPartner_ID));
}
/** Get Business Partner .
@return Identifies a Business Partner */
public int getC_BPartner_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartner_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="919a8942-147a-6062-3546-5f40c26dce1a")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Socio de Negocio";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="919a8942-147a-6062-3546-5f40c26dce1a",
Synchronized="2017-08-05 16:56:23.0")
/** Column name C_BPartner_ID */
public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
/** Set Business Partner Group.
@param C_BP_Group_ID Business Partner Group */
public void setC_BP_Group_ID (int C_BP_Group_ID)
{
if (C_BP_Group_ID < 1) throw new IllegalArgumentException ("C_BP_Group_ID is mandatory.");
set_Value (COLUMNNAME_C_BP_Group_ID, Integer.valueOf(C_BP_Group_ID));
}
/** Get Business Partner Group.
@return Business Partner Group */
public int getC_BP_Group_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BP_Group_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="59750370-822a-0411-4f09-3d2c5d37c5e1")
public static String es_PE_COLUMN_C_BP_Group_ID_Name="Grupo de Socio de Negocio";

@XendraColumn(AD_Element_ID="e4bea975-0a3a-c828-703f-724f29c7518a",ColumnName="C_BP_Group_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="59750370-822a-0411-4f09-3d2c5d37c5e1",
Synchronized="2017-08-05 16:56:23.0")
/** Column name C_BP_Group_ID */
public static final String COLUMNNAME_C_BP_Group_ID = "C_BP_Group_ID";
/** Set Campaign.
@param C_Campaign_ID Marketing Campaign */
public void setC_Campaign_ID (int C_Campaign_ID)
{
if (C_Campaign_ID <= 0) set_Value (COLUMNNAME_C_Campaign_ID, null);
 else 
set_Value (COLUMNNAME_C_Campaign_ID, Integer.valueOf(C_Campaign_ID));
}
/** Get Campaign.
@return Marketing Campaign */
public int getC_Campaign_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Campaign_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d11da81f-81b2-9579-fbf6-fb3550df9bba")
public static String es_PE_COLUMN_C_Campaign_ID_Name="Campaña";

@XendraColumn(AD_Element_ID="6cf08e31-d355-ee38-9c0b-bee20b3ea5b6",ColumnName="C_Campaign_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d11da81f-81b2-9579-fbf6-fb3550df9bba",
Synchronized="2017-08-05 16:56:23.0")
/** Column name C_Campaign_ID */
public static final String COLUMNNAME_C_Campaign_ID = "C_Campaign_ID";
/** Set Currency.
@param C_Currency_ID The Currency for this record */
public void setC_Currency_ID (int C_Currency_ID)
{
if (C_Currency_ID < 1) throw new IllegalArgumentException ("C_Currency_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_Currency_ID, Integer.valueOf(C_Currency_ID));
}
/** Get Currency.
@return The Currency for this record */
public int getC_Currency_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Currency_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="b802041e-2389-c7c1-7f5a-e45af826530f")
public static String es_PE_COLUMN_C_Currency_ID_Name="Moneda";

@XendraColumn(AD_Element_ID="8daec488-bca2-50fe-f9de-abf0cba2a34a",ColumnName="C_Currency_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b802041e-2389-c7c1-7f5a-e45af826530f",
Synchronized="2017-08-05 16:56:23.0")
/** Column name C_Currency_ID */
public static final String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
/** Set Invoice.
@param C_Invoice_ID Invoice Identifier */
public void setC_Invoice_ID (int C_Invoice_ID)
{
if (C_Invoice_ID <= 0) set_ValueNoCheck (COLUMNNAME_C_Invoice_ID, null);
 else 
set_ValueNoCheck (COLUMNNAME_C_Invoice_ID, Integer.valueOf(C_Invoice_ID));
}
/** Get Invoice.
@return Invoice Identifier */
public int getC_Invoice_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Invoice_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="44e69fe8-9144-9728-0503-878c08607e71")
public static String es_PE_COLUMN_C_Invoice_ID_Name="Factura";

@XendraColumn(AD_Element_ID="e526ea57-1bdf-9871-fd57-0df3c1f9dd42",ColumnName="C_Invoice_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="44e69fe8-9144-9728-0503-878c08607e71",
Synchronized="2017-08-05 16:56:23.0")
/** Column name C_Invoice_ID */
public static final String COLUMNNAME_C_Invoice_ID = "C_Invoice_ID";
/** Set Invoice Payment Schedule.
@param C_InvoicePaySchedule_ID Invoice Payment Schedule */
public void setC_InvoicePaySchedule_ID (int C_InvoicePaySchedule_ID)
{
if (C_InvoicePaySchedule_ID <= 0) set_Value (COLUMNNAME_C_InvoicePaySchedule_ID, null);
 else 
set_Value (COLUMNNAME_C_InvoicePaySchedule_ID, Integer.valueOf(C_InvoicePaySchedule_ID));
}
/** Get Invoice Payment Schedule.
@return Invoice Payment Schedule */
public int getC_InvoicePaySchedule_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_InvoicePaySchedule_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="79a457de-fc40-de3c-a02e-afbfb5f46de8")
public static String es_PE_COLUMN_C_InvoicePaySchedule_ID_Name="Programa de Pagos de Facturas";

@XendraColumn(AD_Element_ID="75a06b5e-4d37-5b6c-21d6-1773968e162f",
ColumnName="C_InvoicePaySchedule_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="0",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="79a457de-fc40-de3c-a02e-afbfb5f46de8",Synchronized="2017-08-05 16:56:23.0")
/** Column name C_InvoicePaySchedule_ID */
public static final String COLUMNNAME_C_InvoicePaySchedule_ID = "C_InvoicePaySchedule_ID";
/** Set Project.
@param C_Project_ID Financial Project */
public void setC_Project_ID (int C_Project_ID)
{
if (C_Project_ID <= 0) set_Value (COLUMNNAME_C_Project_ID, null);
 else 
set_Value (COLUMNNAME_C_Project_ID, Integer.valueOf(C_Project_ID));
}
/** Get Project.
@return Financial Project */
public int getC_Project_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Project_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="38b6982c-5bdb-ceaf-68fa-fa3904626389")
public static String es_PE_COLUMN_C_Project_ID_Name="Proyecto";

@XendraColumn(AD_Element_ID="16ff5dcc-9178-73dd-e618-e88bd79d573b",ColumnName="C_Project_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="38b6982c-5bdb-ceaf-68fa-fa3904626389",
Synchronized="2017-08-05 16:56:23.0")
/** Column name C_Project_ID */
public static final String COLUMNNAME_C_Project_ID = "C_Project_ID";
/** Set Account Date.
@param DateAcct Accounting Date */
public void setDateAcct (Timestamp DateAcct)
{
if (DateAcct == null) throw new IllegalArgumentException ("DateAcct is mandatory.");
set_Value (COLUMNNAME_DateAcct, DateAcct);
}
/** Get Account Date.
@return Accounting Date */
public Timestamp getDateAcct() 
{
return (Timestamp)get_Value(COLUMNNAME_DateAcct);
}

@XendraTrl(Identifier="b7a04efd-1c94-6c81-a3c6-97bffcc95ff0")
public static String es_PE_COLUMN_DateAcct_Name="Fecha de Aplicación CG";

@XendraColumn(AD_Element_ID="034727d0-e80f-fadf-3d4f-2d8d37b75669",ColumnName="DateAcct",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b7a04efd-1c94-6c81-a3c6-97bffcc95ff0",
Synchronized="2017-08-05 16:56:23.0")
/** Column name DateAcct */
public static final String COLUMNNAME_DateAcct = "DateAcct";
/** Set Days due.
@param DaysDue Number of days due (negative: due in number of days) */
public void setDaysDue (int DaysDue)
{
set_Value (COLUMNNAME_DaysDue, Integer.valueOf(DaysDue));
}
/** Get Days due.
@return Number of days due (negative: due in number of days) */
public int getDaysDue() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_DaysDue);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d4c1b16a-6553-48cf-ab19-800bec3ff8f4")
public static String es_PE_COLUMN_DaysDue_Name="Días de Vencimiento";

@XendraColumn(AD_Element_ID="64acd2e4-02d1-dcb5-c65f-a18bd0b91443",ColumnName="DaysDue",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d4c1b16a-6553-48cf-ab19-800bec3ff8f4",
Synchronized="2017-08-05 16:56:23.0")
/** Column name DaysDue */
public static final String COLUMNNAME_DaysDue = "DaysDue";
/** Set Due Today.
@param Due0 Due Today */
public void setDue0 (BigDecimal Due0)
{
if (Due0 == null) throw new IllegalArgumentException ("Due0 is mandatory.");
set_Value (COLUMNNAME_Due0, Due0);
}
/** Get Due Today.
@return Due Today */
public BigDecimal getDue0() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Due0);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="e6d4a830-c1c4-9901-fdc4-30318f848dd7")
public static String es_PE_COLUMN_Due0_Name="Vencimiento al día de hoy";

@XendraColumn(AD_Element_ID="c465eaf7-4d8c-6d4d-e6c6-c428ebf8bff6",ColumnName="Due0",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e6d4a830-c1c4-9901-fdc4-30318f848dd7",
Synchronized="2017-08-05 16:56:23.0")
/** Column name Due0 */
public static final String COLUMNNAME_Due0 = "Due0";
/** Set Due Today-30.
@param Due0_30 Due Today-30 */
public void setDue0_30 (BigDecimal Due0_30)
{
if (Due0_30 == null) throw new IllegalArgumentException ("Due0_30 is mandatory.");
set_Value (COLUMNNAME_Due0_30, Due0_30);
}
/** Get Due Today-30.
@return Due Today-30 */
public BigDecimal getDue0_30() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Due0_30);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="34b4ee0d-0ada-9c39-48e2-574b38210489")
public static String es_PE_COLUMN_Due0_30_Name="Vencimiento al día de hoy-30";

@XendraColumn(AD_Element_ID="12ca0fc1-c7f2-aa22-dc61-33b97a7bc60b",ColumnName="Due0_30",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="34b4ee0d-0ada-9c39-48e2-574b38210489",
Synchronized="2017-08-05 16:56:23.0")
/** Column name Due0_30 */
public static final String COLUMNNAME_Due0_30 = "Due0_30";
/** Set Due Today-7.
@param Due0_7 Due Today-7 */
public void setDue0_7 (BigDecimal Due0_7)
{
if (Due0_7 == null) throw new IllegalArgumentException ("Due0_7 is mandatory.");
set_Value (COLUMNNAME_Due0_7, Due0_7);
}
/** Get Due Today-7.
@return Due Today-7 */
public BigDecimal getDue0_7() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Due0_7);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="0355b7a0-7ca8-d03f-b522-b4cf7275ed65")
public static String es_PE_COLUMN_Due0_7_Name="Vencimiento al día de hoy-7";

@XendraColumn(AD_Element_ID="7dc14397-6ce7-3d12-aa06-575bf072f566",ColumnName="Due0_7",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0355b7a0-7ca8-d03f-b522-b4cf7275ed65",
Synchronized="2017-08-05 16:56:23.0")
/** Column name Due0_7 */
public static final String COLUMNNAME_Due0_7 = "Due0_7";
/** Set Due 1-7.
@param Due1_7 Due 1-7 */
public void setDue1_7 (BigDecimal Due1_7)
{
if (Due1_7 == null) throw new IllegalArgumentException ("Due1_7 is mandatory.");
set_Value (COLUMNNAME_Due1_7, Due1_7);
}
/** Get Due 1-7.
@return Due 1-7 */
public BigDecimal getDue1_7() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Due1_7);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="faec031e-4c61-cd00-547d-52716245a396")
public static String es_PE_COLUMN_Due1_7_Name="Vence 1-7";

@XendraColumn(AD_Element_ID="03fd8f86-ef97-a889-eb0e-15f341bccb33",ColumnName="Due1_7",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="faec031e-4c61-cd00-547d-52716245a396",
Synchronized="2017-08-05 16:56:23.0")
/** Column name Due1_7 */
public static final String COLUMNNAME_Due1_7 = "Due1_7";
/** Set Due 31-60.
@param Due31_60 Due 31-60 */
public void setDue31_60 (BigDecimal Due31_60)
{
if (Due31_60 == null) throw new IllegalArgumentException ("Due31_60 is mandatory.");
set_Value (COLUMNNAME_Due31_60, Due31_60);
}
/** Get Due 31-60.
@return Due 31-60 */
public BigDecimal getDue31_60() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Due31_60);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="89b66db6-b75e-514c-071b-2be65f82f58b")
public static String es_PE_COLUMN_Due31_60_Name="Vence 31-60";

@XendraColumn(AD_Element_ID="ad1c576e-bb3a-4d29-1280-76d964ed4164",ColumnName="Due31_60",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="89b66db6-b75e-514c-071b-2be65f82f58b",
Synchronized="2017-08-05 16:56:23.0")
/** Column name Due31_60 */
public static final String COLUMNNAME_Due31_60 = "Due31_60";
/** Set Due > 31.
@param Due31_Plus Due > 31 */
public void setDue31_Plus (BigDecimal Due31_Plus)
{
if (Due31_Plus == null) throw new IllegalArgumentException ("Due31_Plus is mandatory.");
set_Value (COLUMNNAME_Due31_Plus, Due31_Plus);
}
/** Get Due > 31.
@return Due > 31 */
public BigDecimal getDue31_Plus() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Due31_Plus);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="6763ab95-c0d9-7798-3eba-ed526809f692")
public static String es_PE_COLUMN_Due31_Plus_Name="Vencido > 31";

@XendraColumn(AD_Element_ID="c9cb8383-a228-d2b0-e0da-a21584f02b1f",ColumnName="Due31_Plus",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6763ab95-c0d9-7798-3eba-ed526809f692",
Synchronized="2017-08-05 16:56:23.0")
/** Column name Due31_Plus */
public static final String COLUMNNAME_Due31_Plus = "Due31_Plus";
/** Set Due 61-90.
@param Due61_90 Due 61-90 */
public void setDue61_90 (BigDecimal Due61_90)
{
if (Due61_90 == null) throw new IllegalArgumentException ("Due61_90 is mandatory.");
set_Value (COLUMNNAME_Due61_90, Due61_90);
}
/** Get Due 61-90.
@return Due 61-90 */
public BigDecimal getDue61_90() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Due61_90);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="f8c81522-8017-48d5-ab74-30c75c827e57")
public static String es_PE_COLUMN_Due61_90_Name="Vence 61-90";

@XendraColumn(AD_Element_ID="1245635b-70fc-9a11-c3f4-36b11cab10d2",ColumnName="Due61_90",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f8c81522-8017-48d5-ab74-30c75c827e57",
Synchronized="2017-08-05 16:56:23.0")
/** Column name Due61_90 */
public static final String COLUMNNAME_Due61_90 = "Due61_90";
/** Set Due > 61.
@param Due61_Plus Due > 61 */
public void setDue61_Plus (BigDecimal Due61_Plus)
{
if (Due61_Plus == null) throw new IllegalArgumentException ("Due61_Plus is mandatory.");
set_Value (COLUMNNAME_Due61_Plus, Due61_Plus);
}
/** Get Due > 61.
@return Due > 61 */
public BigDecimal getDue61_Plus() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Due61_Plus);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="92c65289-cdcd-1d7d-718c-fd19780f19b6")
public static String es_PE_COLUMN_Due61_Plus_Name="Vencido > 61";

@XendraColumn(AD_Element_ID="1bae8bd4-e282-f23c-1b6d-04d05fabfb74",ColumnName="Due61_Plus",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="92c65289-cdcd-1d7d-718c-fd19780f19b6",
Synchronized="2017-08-05 16:56:23.0")
/** Column name Due61_Plus */
public static final String COLUMNNAME_Due61_Plus = "Due61_Plus";
/** Set Due 8-30.
@param Due8_30 Due 8-30 */
public void setDue8_30 (BigDecimal Due8_30)
{
if (Due8_30 == null) throw new IllegalArgumentException ("Due8_30 is mandatory.");
set_Value (COLUMNNAME_Due8_30, Due8_30);
}
/** Get Due 8-30.
@return Due 8-30 */
public BigDecimal getDue8_30() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Due8_30);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="68c4d3a2-8b35-b398-7cd9-32d6864add40")
public static String es_PE_COLUMN_Due8_30_Name="Vence 8-30";

@XendraColumn(AD_Element_ID="ae4a2d39-6ca5-90cd-70a9-dd84ed787539",ColumnName="Due8_30",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="68c4d3a2-8b35-b398-7cd9-32d6864add40",
Synchronized="2017-08-05 16:56:23.0")
/** Column name Due8_30 */
public static final String COLUMNNAME_Due8_30 = "Due8_30";
/** Set Due > 91.
@param Due91_Plus Due > 91 */
public void setDue91_Plus (BigDecimal Due91_Plus)
{
if (Due91_Plus == null) throw new IllegalArgumentException ("Due91_Plus is mandatory.");
set_Value (COLUMNNAME_Due91_Plus, Due91_Plus);
}
/** Get Due > 91.
@return Due > 91 */
public BigDecimal getDue91_Plus() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Due91_Plus);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="ed4f0444-9f6b-046a-a617-e50797c1500b")
public static String es_PE_COLUMN_Due91_Plus_Name="Vencido > 91";

@XendraColumn(AD_Element_ID="e1a16957-221c-065c-0877-d0664160890c",ColumnName="Due91_Plus",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ed4f0444-9f6b-046a-a617-e50797c1500b",
Synchronized="2017-08-05 16:56:23.0")
/** Column name Due91_Plus */
public static final String COLUMNNAME_Due91_Plus = "Due91_Plus";
/** Set Amount due.
@param DueAmt Amount of the payment due */
public void setDueAmt (BigDecimal DueAmt)
{
if (DueAmt == null) throw new IllegalArgumentException ("DueAmt is mandatory.");
set_Value (COLUMNNAME_DueAmt, DueAmt);
}
/** Get Amount due.
@return Amount of the payment due */
public BigDecimal getDueAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_DueAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="159950fa-4b6d-f9dd-575c-71a2f512c9d5")
public static String es_PE_COLUMN_DueAmt_Name="Total Debido";

@XendraColumn(AD_Element_ID="4d3398a4-aa51-f41a-0b8c-b6b3d7e029b5",ColumnName="DueAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="159950fa-4b6d-f9dd-575c-71a2f512c9d5",
Synchronized="2017-08-05 16:56:23.0")
/** Column name DueAmt */
public static final String COLUMNNAME_DueAmt = "DueAmt";
/** Set Due Date.
@param DueDate Date when the payment is due */
public void setDueDate (Timestamp DueDate)
{
if (DueDate == null) throw new IllegalArgumentException ("DueDate is mandatory.");
set_Value (COLUMNNAME_DueDate, DueDate);
}
/** Get Due Date.
@return Date when the payment is due */
public Timestamp getDueDate() 
{
return (Timestamp)get_Value(COLUMNNAME_DueDate);
}

@XendraTrl(Identifier="8857973f-7f23-756a-e12e-5b68ac3260cf")
public static String es_PE_COLUMN_DueDate_Name="Fecha de Vencimiento";

@XendraColumn(AD_Element_ID="37bdf028-bb21-2699-2840-6730e99633c6",ColumnName="DueDate",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8857973f-7f23-756a-e12e-5b68ac3260cf",
Synchronized="2017-08-05 16:56:23.0")
/** Column name DueDate */
public static final String COLUMNNAME_DueDate = "DueDate";
/** Set Accounting Fact ID (per document).
@param Fact_ID This ID is guaranteed to be unique per client per year per document (in the fact table). */
public void setFact_ID (String Fact_ID)
{
if (Fact_ID != null && Fact_ID.length() > 20)
{
log.warning("Length > 20 - truncated");
Fact_ID = Fact_ID.substring(0,19);
}
set_Value (COLUMNNAME_Fact_ID, Fact_ID);
}
/** Get Accounting Fact ID (per document).
@return This ID is guaranteed to be unique per client per year per document (in the fact table). */
public String getFact_ID() 
{
String value = (String)get_Value(COLUMNNAME_Fact_ID);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="c4c0a8b0-9f1c-1b24-f85a-c0baeb8a7d38")
public static String es_PE_COLUMN_Fact_ID_Name="ID Asiento Contable (por documento)";

@XendraColumn(AD_Element_ID="20f6c8ee-0151-735b-7a03-2006e09d8eb0",ColumnName="Fact_ID",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c4c0a8b0-9f1c-1b24-f85a-c0baeb8a7d38",
Synchronized="2017-08-05 16:56:23.0")
/** Column name Fact_ID */
public static final String COLUMNNAME_Fact_ID = "Fact_ID";
/** Set Invoiced Amount.
@param InvoicedAmt The amount invoiced */
public void setInvoicedAmt (BigDecimal InvoicedAmt)
{
if (InvoicedAmt == null) throw new IllegalArgumentException ("InvoicedAmt is mandatory.");
set_Value (COLUMNNAME_InvoicedAmt, InvoicedAmt);
}
/** Get Invoiced Amount.
@return The amount invoiced */
public BigDecimal getInvoicedAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_InvoicedAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="5d79b210-b7f5-9c40-8de8-f621f11292ea")
public static String es_PE_COLUMN_InvoicedAmt_Name="Cuenta Facturada";

@XendraColumn(AD_Element_ID="e31ccacf-d322-b66d-1d03-702dced2cbb8",ColumnName="InvoicedAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5d79b210-b7f5-9c40-8de8-f621f11292ea",
Synchronized="2017-08-05 16:56:23.0")
/** Column name InvoicedAmt */
public static final String COLUMNNAME_InvoicedAmt = "InvoicedAmt";
/** Set List Invoices.
@param IsListInvoices Include List of Invoices */
public void setIsListInvoices (boolean IsListInvoices)
{
set_Value (COLUMNNAME_IsListInvoices, Boolean.valueOf(IsListInvoices));
}
/** Get List Invoices.
@return Include List of Invoices */
public boolean isListInvoices() 
{
Object oo = get_Value(COLUMNNAME_IsListInvoices);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="2b27beb6-15a6-5aff-a137-7f43bc34df7c")
public static String es_PE_COLUMN_IsListInvoices_Name="Lista de Facturas";

@XendraColumn(AD_Element_ID="6bfae454-8ec2-3fc3-7d51-addb24a21e97",ColumnName="IsListInvoices",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2b27beb6-15a6-5aff-a137-7f43bc34df7c",
Synchronized="2017-08-05 16:56:23.0")
/** Column name IsListInvoices */
public static final String COLUMNNAME_IsListInvoices = "IsListInvoices";
/** Set Sales Transaction.
@param IsSOTrx This is a Sales Transaction */
public void setIsSOTrx (boolean IsSOTrx)
{
set_Value (COLUMNNAME_IsSOTrx, Boolean.valueOf(IsSOTrx));
}
/** Get Sales Transaction.
@return This is a Sales Transaction */
public boolean isSOTrx() 
{
Object oo = get_Value(COLUMNNAME_IsSOTrx);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="e1e379ff-e524-5ff4-bc03-0507b321d2f9")
public static String es_PE_COLUMN_IsSOTrx_Name="Transacción de Ventas";

@XendraColumn(AD_Element_ID="4084b69f-a51d-5676-4d8c-395a13e6b2df",ColumnName="IsSOTrx",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e1e379ff-e524-5ff4-bc03-0507b321d2f9",
Synchronized="2017-08-05 16:56:23.0")
/** Column name IsSOTrx */
public static final String COLUMNNAME_IsSOTrx = "IsSOTrx";
/** Set Open Amount.
@param OpenAmt Open item amount */
public void setOpenAmt (BigDecimal OpenAmt)
{
if (OpenAmt == null) throw new IllegalArgumentException ("OpenAmt is mandatory.");
set_Value (COLUMNNAME_OpenAmt, OpenAmt);
}
/** Get Open Amount.
@return Open item amount */
public BigDecimal getOpenAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_OpenAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="84773c11-d24f-0674-f945-0f9de5888da2")
public static String es_PE_COLUMN_OpenAmt_Name="Total Abierto";

@XendraColumn(AD_Element_ID="89a287e4-b72d-e4d4-2a42-90bcfde3d1ae",ColumnName="OpenAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="84773c11-d24f-0674-f945-0f9de5888da2",
Synchronized="2017-08-05 16:56:23.0")
/** Column name OpenAmt */
public static final String COLUMNNAME_OpenAmt = "OpenAmt";
/** Set Past Due 1-30.
@param PastDue1_30 Past Due 1-30 */
public void setPastDue1_30 (BigDecimal PastDue1_30)
{
if (PastDue1_30 == null) throw new IllegalArgumentException ("PastDue1_30 is mandatory.");
set_Value (COLUMNNAME_PastDue1_30, PastDue1_30);
}
/** Get Past Due 1-30.
@return Past Due 1-30 */
public BigDecimal getPastDue1_30() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PastDue1_30);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="0222c3c1-d6b4-2c62-eee8-15721e1449a7")
public static String es_PE_COLUMN_PastDue1_30_Name="Despues de Vencimiento 1-30";

@XendraColumn(AD_Element_ID="0fba19d8-8dcb-8e62-4d93-50d39fe2857a",ColumnName="PastDue1_30",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0222c3c1-d6b4-2c62-eee8-15721e1449a7",
Synchronized="2017-08-05 16:56:23.0")
/** Column name PastDue1_30 */
public static final String COLUMNNAME_PastDue1_30 = "PastDue1_30";
/** Set Past Due 1-7.
@param PastDue1_7 Past Due 1-7 */
public void setPastDue1_7 (BigDecimal PastDue1_7)
{
if (PastDue1_7 == null) throw new IllegalArgumentException ("PastDue1_7 is mandatory.");
set_Value (COLUMNNAME_PastDue1_7, PastDue1_7);
}
/** Get Past Due 1-7.
@return Past Due 1-7 */
public BigDecimal getPastDue1_7() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PastDue1_7);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="9ea0a739-323a-ee14-df4d-da0be9288e61")
public static String es_PE_COLUMN_PastDue1_7_Name="Despues de Vencimiento 1-7";

@XendraColumn(AD_Element_ID="2e6a3556-4c8a-7891-b27e-7c7d08dbcf8c",ColumnName="PastDue1_7",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9ea0a739-323a-ee14-df4d-da0be9288e61",
Synchronized="2017-08-05 16:56:23.0")
/** Column name PastDue1_7 */
public static final String COLUMNNAME_PastDue1_7 = "PastDue1_7";
/** Set Past Due 31-60.
@param PastDue31_60 Past Due 31-60 */
public void setPastDue31_60 (BigDecimal PastDue31_60)
{
if (PastDue31_60 == null) throw new IllegalArgumentException ("PastDue31_60 is mandatory.");
set_Value (COLUMNNAME_PastDue31_60, PastDue31_60);
}
/** Get Past Due 31-60.
@return Past Due 31-60 */
public BigDecimal getPastDue31_60() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PastDue31_60);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="b784c92f-7878-d3fe-9156-ff962dc31d0d")
public static String es_PE_COLUMN_PastDue31_60_Name="Despues de Vencimiento 31-60";

@XendraColumn(AD_Element_ID="257728f5-8253-2da1-7078-6c713e3b4bbe",ColumnName="PastDue31_60",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b784c92f-7878-d3fe-9156-ff962dc31d0d",
Synchronized="2017-08-05 16:56:23.0")
/** Column name PastDue31_60 */
public static final String COLUMNNAME_PastDue31_60 = "PastDue31_60";
/** Set Past Due > 31.
@param PastDue31_Plus Past Due > 31 */
public void setPastDue31_Plus (BigDecimal PastDue31_Plus)
{
if (PastDue31_Plus == null) throw new IllegalArgumentException ("PastDue31_Plus is mandatory.");
set_Value (COLUMNNAME_PastDue31_Plus, PastDue31_Plus);
}
/** Get Past Due > 31.
@return Past Due > 31 */
public BigDecimal getPastDue31_Plus() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PastDue31_Plus);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="19846e1f-33c6-bbad-b491-db78ab1e1ee8")
public static String es_PE_COLUMN_PastDue31_Plus_Name="Despues de Vencimiento > 31";

@XendraColumn(AD_Element_ID="67f1febd-cd40-fec2-8f76-50c6dbfb6a34",ColumnName="PastDue31_Plus",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="19846e1f-33c6-bbad-b491-db78ab1e1ee8",
Synchronized="2017-08-05 16:56:23.0")
/** Column name PastDue31_Plus */
public static final String COLUMNNAME_PastDue31_Plus = "PastDue31_Plus";
/** Set Past Due 61-90.
@param PastDue61_90 Past Due 61-90 */
public void setPastDue61_90 (BigDecimal PastDue61_90)
{
if (PastDue61_90 == null) throw new IllegalArgumentException ("PastDue61_90 is mandatory.");
set_Value (COLUMNNAME_PastDue61_90, PastDue61_90);
}
/** Get Past Due 61-90.
@return Past Due 61-90 */
public BigDecimal getPastDue61_90() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PastDue61_90);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="a0f8e38d-23fb-c725-4473-7dcd21121e38")
public static String es_PE_COLUMN_PastDue61_90_Name="Despues de Vencimiento 61-90";

@XendraColumn(AD_Element_ID="4fdf74e5-2994-ebdb-a92c-b69e467bcd51",ColumnName="PastDue61_90",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a0f8e38d-23fb-c725-4473-7dcd21121e38",
Synchronized="2017-08-05 16:56:23.0")
/** Column name PastDue61_90 */
public static final String COLUMNNAME_PastDue61_90 = "PastDue61_90";
/** Set Past Due > 61.
@param PastDue61_Plus Past Due > 61 */
public void setPastDue61_Plus (BigDecimal PastDue61_Plus)
{
if (PastDue61_Plus == null) throw new IllegalArgumentException ("PastDue61_Plus is mandatory.");
set_Value (COLUMNNAME_PastDue61_Plus, PastDue61_Plus);
}
/** Get Past Due > 61.
@return Past Due > 61 */
public BigDecimal getPastDue61_Plus() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PastDue61_Plus);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="4984ad61-9f7e-b1fd-4b5e-48ff0c71135e")
public static String es_PE_COLUMN_PastDue61_Plus_Name="Despues de Vencimiento > 61";

@XendraColumn(AD_Element_ID="4abcbffd-c7c2-41fa-1468-077703ed70a3",ColumnName="PastDue61_Plus",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4984ad61-9f7e-b1fd-4b5e-48ff0c71135e",
Synchronized="2017-08-05 16:56:23.0")
/** Column name PastDue61_Plus */
public static final String COLUMNNAME_PastDue61_Plus = "PastDue61_Plus";
/** Set Past Due 8-30.
@param PastDue8_30 Past Due 8-30 */
public void setPastDue8_30 (BigDecimal PastDue8_30)
{
if (PastDue8_30 == null) throw new IllegalArgumentException ("PastDue8_30 is mandatory.");
set_Value (COLUMNNAME_PastDue8_30, PastDue8_30);
}
/** Get Past Due 8-30.
@return Past Due 8-30 */
public BigDecimal getPastDue8_30() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PastDue8_30);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="a8b016cc-01e0-28ce-7fea-62f08302f362")
public static String es_PE_COLUMN_PastDue8_30_Name="Despues de Vencimiento 8-30";

@XendraColumn(AD_Element_ID="a6613981-f42c-d30a-43dc-1e85b771d2ee",ColumnName="PastDue8_30",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a8b016cc-01e0-28ce-7fea-62f08302f362",
Synchronized="2017-08-05 16:56:23.0")
/** Column name PastDue8_30 */
public static final String COLUMNNAME_PastDue8_30 = "PastDue8_30";
/** Set Past Due > 91.
@param PastDue91_Plus Past Due > 91 */
public void setPastDue91_Plus (BigDecimal PastDue91_Plus)
{
if (PastDue91_Plus == null) throw new IllegalArgumentException ("PastDue91_Plus is mandatory.");
set_Value (COLUMNNAME_PastDue91_Plus, PastDue91_Plus);
}
/** Get Past Due > 91.
@return Past Due > 91 */
public BigDecimal getPastDue91_Plus() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PastDue91_Plus);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="8f7e0dae-64b1-c652-2760-d4074908fa26")
public static String es_PE_COLUMN_PastDue91_Plus_Name="Despues de Vencimiento > 91";

@XendraColumn(AD_Element_ID="38f83381-7e84-a9b1-d5da-4387ef8611ca",ColumnName="PastDue91_Plus",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8f7e0dae-64b1-c652-2760-d4074908fa26",
Synchronized="2017-08-05 16:56:23.0")
/** Column name PastDue91_Plus */
public static final String COLUMNNAME_PastDue91_Plus = "PastDue91_Plus";
/** Set Past Due.
@param PastDueAmt Past Due */
public void setPastDueAmt (BigDecimal PastDueAmt)
{
if (PastDueAmt == null) throw new IllegalArgumentException ("PastDueAmt is mandatory.");
set_Value (COLUMNNAME_PastDueAmt, PastDueAmt);
}
/** Get Past Due.
@return Past Due */
public BigDecimal getPastDueAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PastDueAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="4d498887-7ad7-100c-47c5-037e8b3d9357")
public static String es_PE_COLUMN_PastDueAmt_Name="Despues de Vencimiento";

@XendraColumn(AD_Element_ID="8b4cef56-ab98-135a-a9db-6e6a015c415e",ColumnName="PastDueAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4d498887-7ad7-100c-47c5-037e8b3d9357",
Synchronized="2017-08-05 16:56:23.0")
/** Column name PastDueAmt */
public static final String COLUMNNAME_PastDueAmt = "PastDueAmt";

/** SalesRep_ID AD_Reference=15251147-a1b6-4a83-a3a5-2d3ae7db69d9 */
public static final int SALESREP_ID_AD_Reference_ID=190;
/** Set Sales Representative.
@param SalesRep_ID Sales Representative or Company Agent */
public void setSalesRep_ID (int SalesRep_ID)
{
if (SalesRep_ID <= 0) set_Value (COLUMNNAME_SalesRep_ID, null);
 else 
set_Value (COLUMNNAME_SalesRep_ID, Integer.valueOf(SalesRep_ID));
}
/** Get Sales Representative.
@return Sales Representative or Company Agent */
public int getSalesRep_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_SalesRep_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="916336e0-4301-3549-3730-d3a8e42cc071")
public static String es_PE_COLUMN_SalesRep_ID_Name="Sales Representative";

@XendraColumn(AD_Element_ID="197a9c3a-ff10-c291-d65f-5e05a36d3710",ColumnName="SalesRep_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="15251147-a1b6-4a83-a3a5-2d3ae7db69d9",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="916336e0-4301-3549-3730-d3a8e42cc071",Synchronized="2017-08-05 16:56:23.0")
/** Column name SalesRep_ID */
public static final String COLUMNNAME_SalesRep_ID = "SalesRep_ID";
/** Set Statement date.
@param StatementDate Date of the statement */
public void setStatementDate (Timestamp StatementDate)
{
if (StatementDate == null) throw new IllegalArgumentException ("StatementDate is mandatory.");
set_Value (COLUMNNAME_StatementDate, StatementDate);
}
/** Get Statement date.
@return Date of the statement */
public Timestamp getStatementDate() 
{
return (Timestamp)get_Value(COLUMNNAME_StatementDate);
}

@XendraTrl(Identifier="832b8a04-af1f-452d-8525-c885141750d1")
public static String es_PE_COLUMN_StatementDate_Name="Fecha de Estado de Cuenta";

@XendraColumn(AD_Element_ID="99499740-aa9e-199a-8ae3-28cd928e33d1",ColumnName="StatementDate",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="832b8a04-af1f-452d-8525-c885141750d1",
Synchronized="2017-08-05 16:56:23.0")
/** Column name StatementDate */
public static final String COLUMNNAME_StatementDate = "StatementDate";
}
