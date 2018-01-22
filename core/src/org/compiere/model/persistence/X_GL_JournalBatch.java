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
import org.compiere.model.reference.REF__DocumentAction;
import org.compiere.model.reference.REF__DocumentStatus;
import org.compiere.model.reference.REF__PostingType;
/** Generated Model for GL_JournalBatch
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_GL_JournalBatch extends PO
{
/** Standard Constructor
@param ctx context
@param GL_JournalBatch_ID id
@param trxName transaction
*/
public X_GL_JournalBatch (Properties ctx, int GL_JournalBatch_ID, String trxName)
{
super (ctx, GL_JournalBatch_ID, trxName);
/** if (GL_JournalBatch_ID == 0)
{
setC_DocType_ID (0);
setDescription (null);
setDocAction (null);	
// CO
setDocStatus (null);	
// DR
setDocumentNo (null);
setGL_JournalBatch_ID (0);
setPostingType (null);	
// A
setProcessed (false);	
// N
setProcessing (false);
setTotalCr (Env.ZERO);	
// 0
setTotalDr (Env.ZERO);	
// 0
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_GL_JournalBatch (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=225 */
public static int Table_ID=MTable.getTable_ID("GL_JournalBatch");

@XendraTrl(Identifier="bb6b9bab-fc82-492c-e50b-12cd2268173a")
public static String es_PE_TAB_Batch_Description="Lote de entrada de diarios del libro mayor";

@XendraTrl(Identifier="bb6b9bab-fc82-492c-e50b-12cd2268173a")
public static String es_PE_TAB_Batch_Name="Lote";

@XendraTrl(Identifier="bb6b9bab-fc82-492c-e50b-12cd2268173a")
public static String es_PE_TAB_Batch_Help="La pestaña de lote de entradas de diario del GL define los parámetros de control para un lote de entradas de diario. Un lote consiste en múltiples entradas de diario.";

@XendraTab(Name="Batch",Description="General Ledger Journal Batch",
Help="The GL Journal Batch Tab defines the control parameters for a Journal Batch.  A Batch can consist of multiple Journals. If the Control Amount is not zero, it is compared to the Total Debit Amount. The Control/Debit/Credit Amount is in Source Document Currency.",
AD_Window_ID="d65b9eb7-94f9-c08c-7f56-cfe897065bea",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=true,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="bb6b9bab-fc82-492c-e50b-12cd2268173a",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Batch="bb6b9bab-fc82-492c-e50b-12cd2268173a";

@XendraTrl(Identifier="4454f905-b0ed-265b-3db2-7604696915b7")
public static String es_PE_TABLE_GL_JournalBatch_Name="Lote de Diario CG";

@XendraTable(Name="Journal Batch",Description="General Ledger Journal Batch",Help="",
TableName="GL_JournalBatch",AccessLevel="1",AD_Window_ID="d65b9eb7-94f9-c08c-7f56-cfe897065bea",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=130,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.accounting",
Identifier="4454f905-b0ed-265b-3db2-7604696915b7",Synchronized="2017-08-16 11:42:46.0")
/** TableName=GL_JournalBatch */
public static final String Table_Name="GL_JournalBatch";


@XendraIndex(Name="gl_journalbatch_docno",Identifier="d6cce610-9531-0e17-ba17-703e1cae98aa",
Column_Names="ad_org_id, c_period_id, documentno",IsUnique="true",
TableIdentifier="d6cce610-9531-0e17-ba17-703e1cae98aa",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_gl_journalbatch_docno = "d6cce610-9531-0e17-ba17-703e1cae98aa";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"GL_JournalBatch");

protected BigDecimal accessLevel = BigDecimal.valueOf(1);
/** AccessLevel
@return 1 - Org 
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
    Table_ID = MTable.getTable_ID("GL_JournalBatch");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_GL_JournalBatch[").append(get_ID()).append("]");
return sb.toString();
}
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

@XendraTrl(Identifier="9c026793-7021-1c0b-5d3b-8ac65263aa42")
public static String es_PE_FIELD_Batch_Currency_Description="Moneda para este registro";

@XendraTrl(Identifier="9c026793-7021-1c0b-5d3b-8ac65263aa42")
public static String es_PE_FIELD_Batch_Currency_Help="Indica la moneda a ser usada cuando se procese ó Informe este registro";

@XendraTrl(Identifier="9c026793-7021-1c0b-5d3b-8ac65263aa42")
public static String es_PE_FIELD_Batch_Currency_Name="Moneda";

@XendraField(AD_Column_ID="C_Currency_ID",IsCentrallyMaintained=true,
AD_Tab_ID="bb6b9bab-fc82-492c-e50b-12cd2268173a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9c026793-7021-1c0b-5d3b-8ac65263aa42")
public static final String FIELDNAME_Batch_Currency="9c026793-7021-1c0b-5d3b-8ac65263aa42";

@XendraTrl(Identifier="03e9a1f0-14dd-9524-12f0-b04db8e07844")
public static String es_PE_COLUMN_C_Currency_ID_Name="Moneda";

@XendraColumn(AD_Element_ID="8daec488-bca2-50fe-f9de-abf0cba2a34a",ColumnName="C_Currency_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="@$C_Currency_ID@",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="03e9a1f0-14dd-9524-12f0-b04db8e07844",Synchronized="2017-08-05 16:54:43.0")
/** Column name C_Currency_ID */
public static final String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
/** Set Document Type.
@param C_DocType_ID Document type or rules */
public void setC_DocType_ID (int C_DocType_ID)
{
if (C_DocType_ID < 0) throw new IllegalArgumentException ("C_DocType_ID is mandatory.");
set_Value (COLUMNNAME_C_DocType_ID, Integer.valueOf(C_DocType_ID));
}
/** Get Document Type.
@return Document type or rules */
public int getC_DocType_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_DocType_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="41463e68-c6a9-8e85-3ace-5177f85b896f")
public static String es_PE_FIELD_Batch_DocumentType_Description="Tipo de documento ó reglas";

@XendraTrl(Identifier="41463e68-c6a9-8e85-3ace-5177f85b896f")
public static String es_PE_FIELD_Batch_DocumentType_Help="El tipo de documento determina la secuencia del documento y las reglas de proceso";

@XendraTrl(Identifier="41463e68-c6a9-8e85-3ace-5177f85b896f")
public static String es_PE_FIELD_Batch_DocumentType_Name="Tipo de Documento";

@XendraField(AD_Column_ID="C_DocType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="bb6b9bab-fc82-492c-e50b-12cd2268173a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="41463e68-c6a9-8e85-3ace-5177f85b896f")
public static final String FIELDNAME_Batch_DocumentType="41463e68-c6a9-8e85-3ace-5177f85b896f";

@XendraTrl(Identifier="d13c6348-1428-34a2-e89c-9b2eccd51248")
public static String es_PE_COLUMN_C_DocType_ID_Name="Tipo de Documento";

@XendraColumn(AD_Element_ID="099a4147-1a72-cdd0-81e0-8bdbc8c0b883",ColumnName="C_DocType_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="66c5d74f-1f24-ffa1-2a9d-b301198a14ea",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="d13c6348-1428-34a2-e89c-9b2eccd51248",Synchronized="2017-08-05 16:54:43.0")
/** Column name C_DocType_ID */
public static final String COLUMNNAME_C_DocType_ID = "C_DocType_ID";
/** Set Control Amount.
@param ControlAmt If not zero, the Debit amount of the document must be equal this amount */
public void setControlAmt (BigDecimal ControlAmt)
{
set_Value (COLUMNNAME_ControlAmt, ControlAmt);
}
/** Get Control Amount.
@return If not zero, the Debit amount of the document must be equal this amount */
public BigDecimal getControlAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_ControlAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="bbba04c1-987b-6fdf-80b8-e913751bbaeb")
public static String es_PE_FIELD_Batch_ControlAmount_Description="Si no es cero; el total del débito del documento debe ser igual a este total";

@XendraTrl(Identifier="bbba04c1-987b-6fdf-80b8-e913751bbaeb")
public static String es_PE_FIELD_Batch_ControlAmount_Help="Si el total de control es cero; ninguna verificación es ejecutada";

@XendraTrl(Identifier="bbba04c1-987b-6fdf-80b8-e913751bbaeb")
public static String es_PE_FIELD_Batch_ControlAmount_Name="Cifra de Control";

@XendraField(AD_Column_ID="ControlAmt",IsCentrallyMaintained=true,
AD_Tab_ID="bb6b9bab-fc82-492c-e50b-12cd2268173a",AD_FieldGroup_ID="Status",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bbba04c1-987b-6fdf-80b8-e913751bbaeb")
public static final String FIELDNAME_Batch_ControlAmount="bbba04c1-987b-6fdf-80b8-e913751bbaeb";

@XendraTrl(Identifier="9776fed7-fe9a-4237-1d7d-edd0cf087ab9")
public static String es_PE_COLUMN_ControlAmt_Name="Cifra de Control";

@XendraColumn(AD_Element_ID="d520c7db-ab46-3aab-ca2d-7ffa7ad5b197",ColumnName="ControlAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9776fed7-fe9a-4237-1d7d-edd0cf087ab9",
Synchronized="2017-08-05 16:54:43.0")
/** Column name ControlAmt */
public static final String COLUMNNAME_ControlAmt = "ControlAmt";
/** Set Copy From.
@param CopyFrom Copy From Record */
public void setCopyFrom (String CopyFrom)
{
if (CopyFrom != null && CopyFrom.length() > 1)
{
log.warning("Length > 1 - truncated");
CopyFrom = CopyFrom.substring(0,0);
}
set_Value (COLUMNNAME_CopyFrom, CopyFrom);
}
/** Get Copy From.
@return Copy From Record */
public String getCopyFrom() 
{
return (String)get_Value(COLUMNNAME_CopyFrom);
}

@XendraTrl(Identifier="72c1c898-3abb-b04f-2b12-4024fe115275")
public static String es_PE_FIELD_Batch_CopyDetails_Description="Copia líneas de Poliza de diario de otra poliza de diario";

@XendraTrl(Identifier="72c1c898-3abb-b04f-2b12-4024fe115275")
public static String es_PE_FIELD_Batch_CopyDetails_Name="Copia Detalles";

@XendraField(AD_Column_ID="CopyFrom",IsCentrallyMaintained=true,
AD_Tab_ID="bb6b9bab-fc82-492c-e50b-12cd2268173a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=220,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="72c1c898-3abb-b04f-2b12-4024fe115275")
public static final String FIELDNAME_Batch_CopyDetails="72c1c898-3abb-b04f-2b12-4024fe115275";

@XendraTrl(Identifier="c4b05d0f-4258-fbb4-e755-45826f0cf440")
public static String es_PE_COLUMN_CopyFrom_Name="Copiar Desde";

@XendraColumn(AD_Element_ID="2d763fac-73d8-32e6-3aa1-e987486f2022",ColumnName="CopyFrom",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="72d8842d-9686-8b3a-151b-908e77e81156",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="c4b05d0f-4258-fbb4-e755-45826f0cf440",Synchronized="2017-08-05 16:54:43.0")
/** Column name CopyFrom */
public static final String COLUMNNAME_CopyFrom = "CopyFrom";

/** C_Period_ID AD_Reference=3e0cd06a-1e7b-c866-dabc-c97665ee2f08 */
public static final int C_PERIOD_ID_AD_Reference_ID=275;
/** Set Period.
@param C_Period_ID Period of the Calendar */
public void setC_Period_ID (int C_Period_ID)
{
if (C_Period_ID <= 0) set_Value (COLUMNNAME_C_Period_ID, null);
 else 
set_Value (COLUMNNAME_C_Period_ID, Integer.valueOf(C_Period_ID));
}
/** Get Period.
@return Period of the Calendar */
public int getC_Period_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Period_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="86e31f74-6f50-ec1a-834d-d98a9121f207")
public static String es_PE_FIELD_Batch_Period_Description="Período de Calendario";

@XendraTrl(Identifier="86e31f74-6f50-ec1a-834d-d98a9121f207")
public static String es_PE_FIELD_Batch_Period_Help="El Período indica un rango de fechas exclusivo para un calendario";

@XendraTrl(Identifier="86e31f74-6f50-ec1a-834d-d98a9121f207")
public static String es_PE_FIELD_Batch_Period_Name="Período";

@XendraField(AD_Column_ID="C_Period_ID",IsCentrallyMaintained=true,
AD_Tab_ID="bb6b9bab-fc82-492c-e50b-12cd2268173a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="86e31f74-6f50-ec1a-834d-d98a9121f207")
public static final String FIELDNAME_Batch_Period="86e31f74-6f50-ec1a-834d-d98a9121f207";

@XendraTrl(Identifier="cc1d70da-0e3b-9fc1-8efa-4ed2a80ca39b")
public static String es_PE_COLUMN_C_Period_ID_Name="Período";

@XendraColumn(AD_Element_ID="8f295c04-0eb4-a8f3-829f-cc6a6bd1df1e",ColumnName="C_Period_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="3e0cd06a-1e7b-c866-dabc-c97665ee2f08",
AD_Val_Rule_ID="960b4328-66be-fb14-73d5-68009c22064a",FieldLength=22,DefaultValue="",IsKey=false,
IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="org.compiere.model.CalloutGLJournal.period",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="cc1d70da-0e3b-9fc1-8efa-4ed2a80ca39b",Synchronized="2017-08-05 16:54:43.0")
/** Column name C_Period_ID */
public static final String COLUMNNAME_C_Period_ID = "C_Period_ID";
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

@XendraTrl(Identifier="ed98250b-c2fb-c281-aec5-7782b92d621f")
public static String es_PE_FIELD_Batch_AccountDate_Description="Fecha contable";

@XendraTrl(Identifier="ed98250b-c2fb-c281-aec5-7782b92d621f")
public static String es_PE_FIELD_Batch_AccountDate_Help="La fecha contable indica la fecha a ser usada en las cuentas de contabilidad general generadas desde este documento";

@XendraTrl(Identifier="ed98250b-c2fb-c281-aec5-7782b92d621f")
public static String es_PE_FIELD_Batch_AccountDate_Name="Fecha de Aplicación CG";

@XendraField(AD_Column_ID="DateAcct",IsCentrallyMaintained=true,
AD_Tab_ID="bb6b9bab-fc82-492c-e50b-12cd2268173a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ed98250b-c2fb-c281-aec5-7782b92d621f")
public static final String FIELDNAME_Batch_AccountDate="ed98250b-c2fb-c281-aec5-7782b92d621f";

@XendraTrl(Identifier="a9218c4c-276d-0b70-d9e0-3675ae89bb83")
public static String es_PE_COLUMN_DateAcct_Name="Fecha de Aplicación CG";

@XendraColumn(AD_Element_ID="034727d0-e80f-fadf-3d4f-2d8d37b75669",ColumnName="DateAcct",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="@#Date@",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="org.compiere.model.CalloutGLJournal.period",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="a9218c4c-276d-0b70-d9e0-3675ae89bb83",Synchronized="2017-08-05 16:54:43.0")
/** Column name DateAcct */
public static final String COLUMNNAME_DateAcct = "DateAcct";
/** Set DateDoc.
@param DateDoc Date of the Document */
public void setDateDoc (Timestamp DateDoc)
{
set_Value (COLUMNNAME_DateDoc, DateDoc);
}
/** Get DateDoc.
@return Date of the Document */
public Timestamp getDateDoc() 
{
return (Timestamp)get_Value(COLUMNNAME_DateDoc);
}

@XendraTrl(Identifier="ca8c6096-f07b-3364-384d-0cf11f962691")
public static String es_PE_FIELD_Batch_DateDoc_Description="Fecha del documento";

@XendraTrl(Identifier="ca8c6096-f07b-3364-384d-0cf11f962691")
public static String es_PE_FIELD_Batch_DateDoc_Help="La fecha del documento indica la fecha en que el documento fue generado. Puede ó no ser la misma que la fecha contable. ";

@XendraTrl(Identifier="ca8c6096-f07b-3364-384d-0cf11f962691")
public static String es_PE_FIELD_Batch_DateDoc_Name="F. Documento";

@XendraField(AD_Column_ID="DateDoc",IsCentrallyMaintained=true,
AD_Tab_ID="bb6b9bab-fc82-492c-e50b-12cd2268173a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ca8c6096-f07b-3364-384d-0cf11f962691")
public static final String FIELDNAME_Batch_DateDoc="ca8c6096-f07b-3364-384d-0cf11f962691";

@XendraTrl(Identifier="ad05d0ff-6960-68eb-9e19-cba4676baf61")
public static String es_PE_COLUMN_DateDoc_Name="F. Documento";

@XendraColumn(AD_Element_ID="68f87a38-0b7e-cc52-6990-3b5d2d120d9d",ColumnName="DateDoc",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="@#Date@",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="org.compiere.model.CalloutEngine.dateAcct",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="ad05d0ff-6960-68eb-9e19-cba4676baf61",Synchronized="2017-08-05 16:54:43.0")
/** Column name DateDoc */
public static final String COLUMNNAME_DateDoc = "DateDoc";
/** Set Description.
@param Description Optional short DESCRIPTION of the record */
public void setDescription (String Description)
{
if (Description == null) throw new IllegalArgumentException ("Description is mandatory.");
if (Description.length() > 255)
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

@XendraTrl(Identifier="cd3152ed-2d17-7d3f-63fe-0cea0fb298c6")
public static String es_PE_FIELD_Batch_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="cd3152ed-2d17-7d3f-63fe-0cea0fb298c6")
public static String es_PE_FIELD_Batch_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="cd3152ed-2d17-7d3f-63fe-0cea0fb298c6")
public static String es_PE_FIELD_Batch_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="bb6b9bab-fc82-492c-e50b-12cd2268173a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cd3152ed-2d17-7d3f-63fe-0cea0fb298c6")
public static final String FIELDNAME_Batch_Description="cd3152ed-2d17-7d3f-63fe-0cea0fb298c6";

@XendraTrl(Identifier="9d8dcfb3-0445-ccaa-8809-91a531935a10")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9d8dcfb3-0445-ccaa-8809-91a531935a10",
Synchronized="2017-08-05 16:54:43.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";

/** DocAction AD_Reference=e397c9b0-c643-d1cd-8380-20bee13b2a6e */
public static final int DOCACTION_AD_Reference_ID=135;
/** Set Document Action.
@param DocAction The targeted status of the document */
public void setDocAction (String DocAction)
{
if (DocAction == null) throw new IllegalArgumentException ("DocAction is mandatory");
if (DocAction.equals(REF__DocumentAction.Complete) || DocAction.equals(REF__DocumentAction.Approve) || DocAction.equals(REF__DocumentAction.Reject) || DocAction.equals(REF__DocumentAction.Post) || DocAction.equals(REF__DocumentAction.WaitComplete) || DocAction.equals(REF__DocumentAction.Prepare) || DocAction.equals(REF__DocumentAction.Close) || DocAction.equals(REF__DocumentAction.Placed) || DocAction.equals(REF__DocumentAction.Discount) || DocAction.equals(REF__DocumentAction.Portofolio) || DocAction.equals(REF__DocumentAction.Warranty) || DocAction.equals(REF__DocumentAction.Reverse_Correct) || DocAction.equals(REF__DocumentAction.Reverse_Accrual) || DocAction.equals(REF__DocumentAction.Invalidate) || DocAction.equals(REF__DocumentAction.Re_Activate) || DocAction.equals(REF__DocumentAction.None) || DocAction.equals(REF__DocumentAction.Unlock) || DocAction.equals(REF__DocumentAction.Returned) || DocAction.equals(REF__DocumentAction.Apply) || DocAction.equals(REF__DocumentAction.Collect) || DocAction.equals(REF__DocumentAction.ToCollect) || DocAction.equals(REF__DocumentAction.Restore) || DocAction.equals(REF__DocumentAction.Protested) || DocAction.equals(REF__DocumentAction.Receivables) || DocAction.equals(REF__DocumentAction.Void) || DocAction.equals(REF__DocumentAction.Draft) || DocAction.equals(REF__DocumentAction.InProgress) || DocAction.equals(REF__DocumentAction.WaitingPayment));
 else throw new IllegalArgumentException ("DocAction Invalid value - " + DocAction + " - Reference_ID=135 - CO - AP - RJ - PO - WC - PR - CL - PL - DS - PT - WR - RC - RA - IN - RE - -- - XL - RT - AY - CT - TC - RR - PD - RV - VO - DR - IP - WP");
if (DocAction.length() > 2)
{
log.warning("Length > 2 - truncated");
DocAction = DocAction.substring(0,1);
}
set_Value (COLUMNNAME_DocAction, DocAction);
}
/** Get Document Action.
@return The targeted status of the document */
public String getDocAction() 
{
return (String)get_Value(COLUMNNAME_DocAction);
}

@XendraTrl(Identifier="eec3b998-9ffa-7f8d-7019-72e60845663e")
public static String es_PE_FIELD_Batch_ProcessBatch_Name="Procesar Lote";

@XendraField(AD_Column_ID="DocAction",IsCentrallyMaintained=true,
AD_Tab_ID="bb6b9bab-fc82-492c-e50b-12cd2268173a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=210,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="eec3b998-9ffa-7f8d-7019-72e60845663e")
public static final String FIELDNAME_Batch_ProcessBatch="eec3b998-9ffa-7f8d-7019-72e60845663e";

@XendraTrl(Identifier="4426dfe3-e4f9-4186-f886-216d966b0706")
public static String es_PE_COLUMN_DocAction_Name="Acción en el Documento";

@XendraColumn(AD_Element_ID="d4b9075b-18e5-ebbb-5565-d217a7e531cb",ColumnName="DocAction",
AD_Reference_ID=28,AD_Reference_Value_ID="e397c9b0-c643-d1cd-8380-20bee13b2a6e",AD_Val_Rule_ID="",
FieldLength=2,DefaultValue="CO",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,
AD_Process_ID="bfac6ee9-479a-ed7a-991d-e4c076ea581c",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4426dfe3-e4f9-4186-f886-216d966b0706",
Synchronized="2017-08-05 16:54:43.0")
/** Column name DocAction */
public static final String COLUMNNAME_DocAction = "DocAction";

/** DocStatus AD_Reference=7627125d-fefe-e6bc-bb7d-4a6c772172dc */
public static final int DOCSTATUS_AD_Reference_ID=131;
/** Set Document Status.
@param DocStatus The current status of the document */
public void setDocStatus (String DocStatus)
{
if (DocStatus == null) throw new IllegalArgumentException ("DocStatus is mandatory");
if (DocStatus.equals(REF__DocumentStatus.InProgress) || DocStatus.equals(REF__DocumentStatus.WaitingConfirmation) || DocStatus.equals(REF__DocumentStatus.Drafted) || DocStatus.equals(REF__DocumentStatus.Completed) || DocStatus.equals(REF__DocumentStatus.Approved) || DocStatus.equals(REF__DocumentStatus.WaitingPayment) || DocStatus.equals(REF__DocumentStatus.Placed) || DocStatus.equals(REF__DocumentStatus.Returned) || DocStatus.equals(REF__DocumentStatus.Discount) || DocStatus.equals(REF__DocumentStatus.Protested) || DocStatus.equals(REF__DocumentStatus.NotApproved) || DocStatus.equals(REF__DocumentStatus.Voided) || DocStatus.equals(REF__DocumentStatus.Invalid) || DocStatus.equals(REF__DocumentStatus.Reversed) || DocStatus.equals(REF__DocumentStatus.Closed) || DocStatus.equals(REF__DocumentStatus.Unknown) || DocStatus.equals(REF__DocumentStatus.Portfolio) || DocStatus.equals(REF__DocumentStatus.Warranty) || DocStatus.equals(REF__DocumentStatus.ToCollect) || DocStatus.equals(REF__DocumentStatus.Collect) || DocStatus.equals(REF__DocumentStatus.Receivables) || DocStatus.equals(REF__DocumentStatus.Apply));
 else throw new IllegalArgumentException ("DocStatus Invalid value - " + DocStatus + " - Reference_ID=131 - IP - WC - DR - CO - AP - WP - PL - RT - DS - PD - NA - VO - IN - RE - CL - ?? - PT - WR - TC - CT - RV - AY");
if (DocStatus.length() > 2)
{
log.warning("Length > 2 - truncated");
DocStatus = DocStatus.substring(0,1);
}
set_Value (COLUMNNAME_DocStatus, DocStatus);
}
/** Get Document Status.
@return The current status of the document */
public String getDocStatus() 
{
return (String)get_Value(COLUMNNAME_DocStatus);
}

@XendraTrl(Identifier="728e9dc6-6102-850e-b7f1-841aba85ed33")
public static String es_PE_FIELD_Batch_DocumentStatus_Description="El estado actual del documento";

@XendraTrl(Identifier="728e9dc6-6102-850e-b7f1-841aba85ed33")
public static String es_PE_FIELD_Batch_DocumentStatus_Help="El estado del documento indica el estado del documento en este momento. Si usted quiere cambiar el estado de Documento; use el campo acción de documento";

@XendraTrl(Identifier="728e9dc6-6102-850e-b7f1-841aba85ed33")
public static String es_PE_FIELD_Batch_DocumentStatus_Name="Estado del Documento";

@XendraField(AD_Column_ID="DocStatus",IsCentrallyMaintained=true,
AD_Tab_ID="bb6b9bab-fc82-492c-e50b-12cd2268173a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=200,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="728e9dc6-6102-850e-b7f1-841aba85ed33")
public static final String FIELDNAME_Batch_DocumentStatus="728e9dc6-6102-850e-b7f1-841aba85ed33";

@XendraTrl(Identifier="e7170bd5-bd14-f5d6-0194-4b9adddecc00")
public static String es_PE_COLUMN_DocStatus_Name="Estado del Documento";

@XendraColumn(AD_Element_ID="e73fa537-3438-bd01-dfd4-f0f080a28c55",ColumnName="DocStatus",
AD_Reference_ID=17,AD_Reference_Value_ID="7627125d-fefe-e6bc-bb7d-4a6c772172dc",AD_Val_Rule_ID="",
FieldLength=2,DefaultValue="DR",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="e7170bd5-bd14-f5d6-0194-4b9adddecc00",Synchronized="2017-08-05 16:54:43.0")
/** Column name DocStatus */
public static final String COLUMNNAME_DocStatus = "DocStatus";
/** Set Document No.
@param DocumentNo Document sequence number of the document */
public void setDocumentNo (String DocumentNo)
{
if (DocumentNo == null) throw new IllegalArgumentException ("DocumentNo is mandatory.");
if (DocumentNo.length() > 30)
{
log.warning("Length > 30 - truncated");
DocumentNo = DocumentNo.substring(0,29);
}
set_ValueNoCheck (COLUMNNAME_DocumentNo, DocumentNo);
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
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), getDocumentNo());
}

@XendraTrl(Identifier="def4b57b-59fd-0d8a-eb51-305c7e1eb80d")
public static String es_PE_FIELD_Batch_DocumentNo_Description="Número de secuencia del documento para cada documento";

@XendraTrl(Identifier="def4b57b-59fd-0d8a-eb51-305c7e1eb80d")
public static String es_PE_FIELD_Batch_DocumentNo_Help="El número del documento es usualmente generado en automático por el sistema y determinado por el tipo del documento. Si el documento no se salva; el número preliminar se despliega entre \"<>\"";

@XendraTrl(Identifier="def4b57b-59fd-0d8a-eb51-305c7e1eb80d")
public static String es_PE_FIELD_Batch_DocumentNo_Name="No. del Documento";

@XendraField(AD_Column_ID="DocumentNo",IsCentrallyMaintained=true,
AD_Tab_ID="bb6b9bab-fc82-492c-e50b-12cd2268173a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=70,SortNo=-1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="def4b57b-59fd-0d8a-eb51-305c7e1eb80d")
public static final String FIELDNAME_Batch_DocumentNo="def4b57b-59fd-0d8a-eb51-305c7e1eb80d";

@XendraTrl(Identifier="b6892266-d40b-802f-4e5c-5c60d983c21d")
public static String es_PE_COLUMN_DocumentNo_Name="No. del Documento";

@XendraColumn(AD_Element_ID="e3ca6e28-702a-2722-d941-b2072a0de9cb",ColumnName="DocumentNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b6892266-d40b-802f-4e5c-5c60d983c21d",
Synchronized="2017-08-05 16:54:43.0")
/** Column name DocumentNo */
public static final String COLUMNNAME_DocumentNo = "DocumentNo";
/** Set GL Category.
@param GL_Category_ID General Ledger Category */
public void setGL_Category_ID (int GL_Category_ID)
{
if (GL_Category_ID <= 0) set_Value (COLUMNNAME_GL_Category_ID, null);
 else 
set_Value (COLUMNNAME_GL_Category_ID, Integer.valueOf(GL_Category_ID));
}
/** Get GL Category.
@return General Ledger Category */
public int getGL_Category_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_GL_Category_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="5d73974d-468f-e9eb-2318-72691980be2c")
public static String es_PE_FIELD_Batch_GLCategory_Description="Categoría de Contabilidad General";

@XendraTrl(Identifier="5d73974d-468f-e9eb-2318-72691980be2c")
public static String es_PE_FIELD_Batch_GLCategory_Help="La Categoría de Contabilidad General es un método opcional; definido por el usuario; de agrupación de líneas de las pólizas";

@XendraTrl(Identifier="5d73974d-468f-e9eb-2318-72691980be2c")
public static String es_PE_FIELD_Batch_GLCategory_Name="Categoría CG";

@XendraField(AD_Column_ID="GL_Category_ID",IsCentrallyMaintained=true,
AD_Tab_ID="bb6b9bab-fc82-492c-e50b-12cd2268173a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5d73974d-468f-e9eb-2318-72691980be2c")
public static final String FIELDNAME_Batch_GLCategory="5d73974d-468f-e9eb-2318-72691980be2c";

@XendraTrl(Identifier="39970393-7594-a5e8-7f73-484190528a25")
public static String es_PE_COLUMN_GL_Category_ID_Name="Categoría CG";

@XendraColumn(AD_Element_ID="b3063a1c-d28b-42fc-2d1b-27037b4d6514",ColumnName="GL_Category_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="0b63bfd0-74b1-97e5-5bc9-fe99cc50e4d3",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="39970393-7594-a5e8-7f73-484190528a25",Synchronized="2017-08-05 16:54:43.0")
/** Column name GL_Category_ID */
public static final String COLUMNNAME_GL_Category_ID = "GL_Category_ID";
/** Set Journal Batch.
@param GL_JournalBatch_ID General Ledger Journal Batch */
public void setGL_JournalBatch_ID (int GL_JournalBatch_ID)
{
if (GL_JournalBatch_ID < 1) throw new IllegalArgumentException ("GL_JournalBatch_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_GL_JournalBatch_ID, Integer.valueOf(GL_JournalBatch_ID));
}
/** Get Journal Batch.
@return General Ledger Journal Batch */
public int getGL_JournalBatch_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_GL_JournalBatch_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="08efdae9-9255-e5bc-d928-d7e07b78361b")
public static String es_PE_FIELD_Batch_JournalBatch_Description="Lote de Diario CG";

@XendraTrl(Identifier="08efdae9-9255-e5bc-d928-d7e07b78361b")
public static String es_PE_FIELD_Batch_JournalBatch_Help="El lote de pólizas de la contabilidad general identifica un conjunto de pólizas a ser procesadas como un grupo.";

@XendraTrl(Identifier="08efdae9-9255-e5bc-d928-d7e07b78361b")
public static String es_PE_FIELD_Batch_JournalBatch_Name="Lote de Diario CG";

@XendraField(AD_Column_ID="GL_JournalBatch_ID",IsCentrallyMaintained=true,
AD_Tab_ID="bb6b9bab-fc82-492c-e50b-12cd2268173a",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="08efdae9-9255-e5bc-d928-d7e07b78361b")
public static final String FIELDNAME_Batch_JournalBatch="08efdae9-9255-e5bc-d928-d7e07b78361b";
/** Column name GL_JournalBatch_ID */
public static final String COLUMNNAME_GL_JournalBatch_ID = "GL_JournalBatch_ID";
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
@XendraTrl(Identifier="6bda9377-9fc1-4362-a333-f875e2323f7b")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6bda9377-9fc1-4362-a333-f875e2323f7b",
Synchronized="2017-08-05 16:54:43.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Approved.
@param IsApproved Indicates if this document requires approval */
public void setIsApproved (boolean IsApproved)
{
set_Value (COLUMNNAME_IsApproved, Boolean.valueOf(IsApproved));
}
/** Get Approved.
@return Indicates if this document requires approval */
public boolean isApproved() 
{
Object oo = get_Value(COLUMNNAME_IsApproved);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="af87323c-43ea-298f-a586-2d487d61066f")
public static String es_PE_FIELD_Batch_Approved_Description="Indica si este documento requiere aprobación";

@XendraTrl(Identifier="af87323c-43ea-298f-a586-2d487d61066f")
public static String es_PE_FIELD_Batch_Approved_Help="El Cuadro de Verificación  Aprobado indica si este documento requiere aprobación antes de que pueda ser procesado";

@XendraTrl(Identifier="af87323c-43ea-298f-a586-2d487d61066f")
public static String es_PE_FIELD_Batch_Approved_Name="Aprobación";

@XendraField(AD_Column_ID="IsApproved",IsCentrallyMaintained=true,
AD_Tab_ID="bb6b9bab-fc82-492c-e50b-12cd2268173a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=170,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="af87323c-43ea-298f-a586-2d487d61066f")
public static final String FIELDNAME_Batch_Approved="af87323c-43ea-298f-a586-2d487d61066f";

@XendraTrl(Identifier="7409f743-598d-e42f-0537-bc04e818be4d")
public static String es_PE_COLUMN_IsApproved_Name="Aprobación";

@XendraColumn(AD_Element_ID="44388d99-07b7-b005-9e16-78884800beff",ColumnName="IsApproved",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7409f743-598d-e42f-0537-bc04e818be4d",
Synchronized="2017-08-05 16:54:43.0")
/** Column name IsApproved */
public static final String COLUMNNAME_IsApproved = "IsApproved";

/** PostingType AD_Reference=1ad48d23-2ec9-09d0-cb68-38688c5e6ce0 */
public static final int POSTINGTYPE_AD_Reference_ID=125;
/** Set PostingType.
@param PostingType The type of posted amount for the transaction */
public void setPostingType (String PostingType)
{
if (PostingType == null) throw new IllegalArgumentException ("PostingType is mandatory");
if (PostingType.equals(REF__PostingType.Actual) || PostingType.equals(REF__PostingType.Budget) || PostingType.equals(REF__PostingType.Commitment) || PostingType.equals(REF__PostingType.Statistical) || PostingType.equals(REF__PostingType.Reservation));
 else throw new IllegalArgumentException ("PostingType Invalid value - " + PostingType + " - Reference_ID=125 - A - B - E - S - R");
if (PostingType.length() > 1)
{
log.warning("Length > 1 - truncated");
PostingType = PostingType.substring(0,0);
}
set_Value (COLUMNNAME_PostingType, PostingType);
}
/** Get PostingType.
@return The type of posted amount for the transaction */
public String getPostingType() 
{
return (String)get_Value(COLUMNNAME_PostingType);
}

@XendraTrl(Identifier="9f185112-fe88-07db-ea55-c09f7a654b01")
public static String es_PE_FIELD_Batch_PostingType_Description="El tipo de total que esta póliza actualizó";

@XendraTrl(Identifier="9f185112-fe88-07db-ea55-c09f7a654b01")
public static String es_PE_FIELD_Batch_PostingType_Help="El tipo de aplicación indica el tipo de total (actual; gravamen; presupuesto) que esta póliza actualizó";

@XendraTrl(Identifier="9f185112-fe88-07db-ea55-c09f7a654b01")
public static String es_PE_FIELD_Batch_PostingType_Name="Tipo de Aplicación";

@XendraField(AD_Column_ID="PostingType",IsCentrallyMaintained=true,
AD_Tab_ID="bb6b9bab-fc82-492c-e50b-12cd2268173a",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9f185112-fe88-07db-ea55-c09f7a654b01")
public static final String FIELDNAME_Batch_PostingType="9f185112-fe88-07db-ea55-c09f7a654b01";

@XendraTrl(Identifier="b8ec71d7-6878-5c8a-3214-6e55e215f025")
public static String es_PE_COLUMN_PostingType_Name="Tipo de Aplicación";

@XendraColumn(AD_Element_ID="465cd8dd-d2b8-aa76-fc18-7f8df439b182",ColumnName="PostingType",
AD_Reference_ID=17,AD_Reference_Value_ID="1ad48d23-2ec9-09d0-cb68-38688c5e6ce0",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="A",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="b8ec71d7-6878-5c8a-3214-6e55e215f025",Synchronized="2017-08-05 16:54:43.0")
/** Column name PostingType */
public static final String COLUMNNAME_PostingType = "PostingType";
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

@XendraTrl(Identifier="f08f0ce1-df3a-742b-1594-4009509a2b50")
public static String es_PE_FIELD_Batch_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="f08f0ce1-df3a-742b-1594-4009509a2b50")
public static String es_PE_FIELD_Batch_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraTrl(Identifier="f08f0ce1-df3a-742b-1594-4009509a2b50")
public static String es_PE_FIELD_Batch_Processed_Name="Procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="bb6b9bab-fc82-492c-e50b-12cd2268173a",AD_FieldGroup_ID="Status",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f08f0ce1-df3a-742b-1594-4009509a2b50")
public static final String FIELDNAME_Batch_Processed="f08f0ce1-df3a-742b-1594-4009509a2b50";

@XendraTrl(Identifier="d1cc6a2a-ffe1-581a-ddad-60b4af894685")
public static String es_PE_COLUMN_Processed_Name="Procesado";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d1cc6a2a-ffe1-581a-ddad-60b4af894685",
Synchronized="2017-08-05 16:54:43.0")
/** Column name Processed */
public static final String COLUMNNAME_Processed = "Processed";
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

@XendraTrl(Identifier="871bc7fc-8aac-a51f-f799-9b053a92e14d")
public static String es_PE_FIELD_Batch_ProcessNow_Name="Procesar Ahora";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="bb6b9bab-fc82-492c-e50b-12cd2268173a",AD_FieldGroup_ID="Status",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=30,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="871bc7fc-8aac-a51f-f799-9b053a92e14d")
public static final String FIELDNAME_Batch_ProcessNow="871bc7fc-8aac-a51f-f799-9b053a92e14d";

@XendraTrl(Identifier="9aeea267-06ae-8ff2-61d6-c45185805101")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9aeea267-06ae-8ff2-61d6-c45185805101",
Synchronized="2017-08-05 16:54:43.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
/** Set Total Credit.
@param TotalCr Total Credit in document currency */
public void setTotalCr (BigDecimal TotalCr)
{
if (TotalCr == null) throw new IllegalArgumentException ("TotalCr is mandatory.");
set_ValueNoCheck (COLUMNNAME_TotalCr, TotalCr);
}
/** Get Total Credit.
@return Total Credit in document currency */
public BigDecimal getTotalCr() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_TotalCr);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="c582322a-7ad2-bc9b-ef31-59f1d7243d93")
public static String es_PE_FIELD_Batch_TotalCredit_Description="Total de Créditos en la moneda del negocio";

@XendraTrl(Identifier="c582322a-7ad2-bc9b-ef31-59f1d7243d93")
public static String es_PE_FIELD_Batch_TotalCredit_Help="El Crédito Total indica el total de crédito para una póliza ó lote de pólizas en la moneda fuente";

@XendraTrl(Identifier="c582322a-7ad2-bc9b-ef31-59f1d7243d93")
public static String es_PE_FIELD_Batch_TotalCredit_Name="Total Crédito";

@XendraField(AD_Column_ID="TotalCr",IsCentrallyMaintained=true,
AD_Tab_ID="bb6b9bab-fc82-492c-e50b-12cd2268173a",AD_FieldGroup_ID="Status",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=190,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c582322a-7ad2-bc9b-ef31-59f1d7243d93")
public static final String FIELDNAME_Batch_TotalCredit="c582322a-7ad2-bc9b-ef31-59f1d7243d93";

@XendraTrl(Identifier="514db7fb-2431-a88d-fb43-82faacba4be2")
public static String es_PE_COLUMN_TotalCr_Name="Total Crédito";

@XendraColumn(AD_Element_ID="c4df0a38-3a1d-0a18-ce6c-5458e8897ab4",ColumnName="TotalCr",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="514db7fb-2431-a88d-fb43-82faacba4be2",
Synchronized="2017-08-05 16:54:43.0")
/** Column name TotalCr */
public static final String COLUMNNAME_TotalCr = "TotalCr";
/** Set Total Debit.
@param TotalDr Total debit in document currency */
public void setTotalDr (BigDecimal TotalDr)
{
if (TotalDr == null) throw new IllegalArgumentException ("TotalDr is mandatory.");
set_ValueNoCheck (COLUMNNAME_TotalDr, TotalDr);
}
/** Get Total Debit.
@return Total debit in document currency */
public BigDecimal getTotalDr() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_TotalDr);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="254bc83b-25b6-2750-a866-305fc2b37149")
public static String es_PE_FIELD_Batch_TotalDebit_Description="Total de Débitos en la moneda del negocio";

@XendraTrl(Identifier="254bc83b-25b6-2750-a866-305fc2b37149")
public static String es_PE_FIELD_Batch_TotalDebit_Help="El Débito total indica el total de débito para una póliza ó lote de pólizas en la moneda fuente";

@XendraTrl(Identifier="254bc83b-25b6-2750-a866-305fc2b37149")
public static String es_PE_FIELD_Batch_TotalDebit_Name="Total Débito";

@XendraField(AD_Column_ID="TotalDr",IsCentrallyMaintained=true,
AD_Tab_ID="bb6b9bab-fc82-492c-e50b-12cd2268173a",AD_FieldGroup_ID="Status",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=180,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="254bc83b-25b6-2750-a866-305fc2b37149")
public static final String FIELDNAME_Batch_TotalDebit="254bc83b-25b6-2750-a866-305fc2b37149";

@XendraTrl(Identifier="417265e8-2c93-0ffb-3903-2a2368cc4c05")
public static String es_PE_COLUMN_TotalDr_Name="Total Débito";

@XendraColumn(AD_Element_ID="55b251f6-8ed0-1b6e-5cbd-05019adb48d8",ColumnName="TotalDr",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="417265e8-2c93-0ffb-3903-2a2368cc4c05",
Synchronized="2017-08-05 16:54:43.0")
/** Column name TotalDr */
public static final String COLUMNNAME_TotalDr = "TotalDr";
}
