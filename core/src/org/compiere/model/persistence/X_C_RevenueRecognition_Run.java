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
/** Generated Model for C_RevenueRecognition_Run
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_RevenueRecognition_Run extends PO
{
/** Standard Constructor
@param ctx context
@param C_RevenueRecognition_Run_ID id
@param trxName transaction
*/
public X_C_RevenueRecognition_Run (Properties ctx, int C_RevenueRecognition_Run_ID, String trxName)
{
super (ctx, C_RevenueRecognition_Run_ID, trxName);
/** if (C_RevenueRecognition_Run_ID == 0)
{
setC_RevenueRecognition_Plan_ID (0);
setC_RevenueRecognition_Run_ID (0);
setGL_Journal_ID (0);
setRecognizedAmt (Env.ZERO);	
// 0
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_RevenueRecognition_Run (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=444 */
public static int Table_ID=MTable.getTable_ID("C_RevenueRecognition_Run");

@XendraTrl(Identifier="835c4cde-2a80-e54d-b4bd-674ef29f95dd")
public static String es_PE_TAB_RevenueRecognitionRun_Description="Ver Historia de Cálculos de Reconocimiento de Ingresos";

@XendraTrl(Identifier="835c4cde-2a80-e54d-b4bd-674ef29f95dd")
public static String es_PE_TAB_RevenueRecognitionRun_Name="Cálculo de Reconocimiento de Ingresos";

@XendraTab(Name="Revenue Recognition Run",Description="View Revenue Recognition Run History",
Help="",AD_Window_ID="733a8f19-500f-50a8-f39f-40d4949bd162",SeqNo=30,TabLevel=2,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=true,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=false,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="835c4cde-2a80-e54d-b4bd-674ef29f95dd",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_RevenueRecognitionRun="835c4cde-2a80-e54d-b4bd-674ef29f95dd";

@XendraTrl(Identifier="8a171e2d-a414-31ed-aeed-70699df7dc01")
public static String es_PE_TABLE_C_RevenueRecognition_Run_Name="Cálculo de Reconocimiento de Ingresos ";


@XendraTable(Name="Revenue Recognition Run",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",
Description="Revenue Recognition Run or Process",Help="",TableName="C_RevenueRecognition_Run",
AccessLevel="1",AD_Window_ID="733a8f19-500f-50a8-f39f-40d4949bd162",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="8a171e2d-a414-31ed-aeed-70699df7dc01",Synchronized="2020-03-03 21:37:36.0")
/** TableName=C_RevenueRecognition_Run */
public static final String Table_Name="C_RevenueRecognition_Run";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_RevenueRecognition_Run");

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
    Table_ID = MTable.getTable_ID("C_RevenueRecognition_Run");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_RevenueRecognition_Run[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Revenue Recognition Plan.
@param C_RevenueRecognition_Plan_ID Plan for recognizing or recording revenue */
public void setC_RevenueRecognition_Plan_ID (int C_RevenueRecognition_Plan_ID)
{
if (C_RevenueRecognition_Plan_ID < 1) throw new IllegalArgumentException ("C_RevenueRecognition_Plan_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_RevenueRecognition_Plan_ID, Integer.valueOf(C_RevenueRecognition_Plan_ID));
}
/** Get Revenue Recognition Plan.
@return Plan for recognizing or recording revenue */
public int getC_RevenueRecognition_Plan_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_RevenueRecognition_Plan_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getC_RevenueRecognition_Plan_ID()));
}

@XendraTrl(Identifier="3db45729-30b4-2670-8a79-574bf974e2f7")
public static String es_PE_FIELD_RevenueRecognitionRun_RevenueRecognitionPlan_Name="Plan de Reconocimiento de ingresos";

@XendraTrl(Identifier="3db45729-30b4-2670-8a79-574bf974e2f7")
public static String es_PE_FIELD_RevenueRecognitionRun_RevenueRecognitionPlan_Description="Plan para reconocer ó registrar ingresos";

@XendraTrl(Identifier="3db45729-30b4-2670-8a79-574bf974e2f7")
public static String es_PE_FIELD_RevenueRecognitionRun_RevenueRecognitionPlan_Help="El plan de reconocimiento de Ingresos identifica un plan de reconocimiento de Ingresos único.";

@XendraField(AD_Column_ID="C_RevenueRecognition_Plan_ID",IsCentrallyMaintained=true,
AD_Tab_ID="835c4cde-2a80-e54d-b4bd-674ef29f95dd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3db45729-30b4-2670-8a79-574bf974e2f7")
public static final String FIELDNAME_RevenueRecognitionRun_RevenueRecognitionPlan="3db45729-30b4-2670-8a79-574bf974e2f7";

@XendraTrl(Identifier="6654a2ae-65be-9f47-632b-b4cb524902ee")
public static String es_PE_COLUMN_C_RevenueRecognition_Plan_ID_Name="Plan de Reconocimiento de ingresos";

@XendraColumn(AD_Element_ID="586441d3-6d88-48e5-60d3-d0954989d053",
ColumnName="C_RevenueRecognition_Plan_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=true,SeqNo=1,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="6654a2ae-65be-9f47-632b-b4cb524902ee",Synchronized="2019-08-30 22:22:13.0")
/** Column name C_RevenueRecognition_Plan_ID */
public static final String COLUMNNAME_C_RevenueRecognition_Plan_ID = "C_RevenueRecognition_Plan_ID";
/** Set Revenue Recognition Run.
@param C_RevenueRecognition_Run_ID Revenue Recognition Run or Process */
public void setC_RevenueRecognition_Run_ID (int C_RevenueRecognition_Run_ID)
{
if (C_RevenueRecognition_Run_ID < 1) throw new IllegalArgumentException ("C_RevenueRecognition_Run_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_RevenueRecognition_Run_ID, Integer.valueOf(C_RevenueRecognition_Run_ID));
}
/** Get Revenue Recognition Run.
@return Revenue Recognition Run or Process */
public int getC_RevenueRecognition_Run_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_RevenueRecognition_Run_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="abbe5091-67a9-08a2-8c7b-24bfcbffaa84")
public static String es_PE_FIELD_RevenueRecognitionRun_RevenueRecognitionRun_Name="Cálculo de Reconocimiento de Ingresos ";

@XendraTrl(Identifier="abbe5091-67a9-08a2-8c7b-24bfcbffaa84")
public static String es_PE_FIELD_RevenueRecognitionRun_RevenueRecognitionRun_Description="Cálculo o proceso de reconocimiento de ingresos";

@XendraTrl(Identifier="abbe5091-67a9-08a2-8c7b-24bfcbffaa84")
public static String es_PE_FIELD_RevenueRecognitionRun_RevenueRecognitionRun_Help="La Corrida de Reconocimiento de Ingresos identifica una instancia única de proceso de reconocimiento de ingresos";

@XendraField(AD_Column_ID="C_RevenueRecognition_Run_ID",IsCentrallyMaintained=true,
AD_Tab_ID="835c4cde-2a80-e54d-b4bd-674ef29f95dd",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="abbe5091-67a9-08a2-8c7b-24bfcbffaa84")
public static final String FIELDNAME_RevenueRecognitionRun_RevenueRecognitionRun="abbe5091-67a9-08a2-8c7b-24bfcbffaa84";
/** Column name C_RevenueRecognition_Run_ID */
public static final String COLUMNNAME_C_RevenueRecognition_Run_ID = "C_RevenueRecognition_Run_ID";
/** Set Journal.
@param GL_Journal_ID General Ledger Journal */
public void setGL_Journal_ID (int GL_Journal_ID)
{
if (GL_Journal_ID < 1) throw new IllegalArgumentException ("GL_Journal_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_GL_Journal_ID, Integer.valueOf(GL_Journal_ID));
}
/** Get Journal.
@return General Ledger Journal */
public int getGL_Journal_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_GL_Journal_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="0973a627-f90f-08ea-a8fa-f8c6430455d0")
public static String es_PE_FIELD_RevenueRecognitionRun_Journal_Name="Póliza";

@XendraTrl(Identifier="0973a627-f90f-08ea-a8fa-f8c6430455d0")
public static String es_PE_FIELD_RevenueRecognitionRun_Journal_Description="Póliza";

@XendraTrl(Identifier="0973a627-f90f-08ea-a8fa-f8c6430455d0")
public static String es_PE_FIELD_RevenueRecognitionRun_Journal_Help="La póliza de la contabilidad general identifica un grupo de líneas de póliza que representa una transacción lógica del negocio.";

@XendraField(AD_Column_ID="GL_Journal_ID",IsCentrallyMaintained=true,
AD_Tab_ID="835c4cde-2a80-e54d-b4bd-674ef29f95dd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=70,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0973a627-f90f-08ea-a8fa-f8c6430455d0")
public static final String FIELDNAME_RevenueRecognitionRun_Journal="0973a627-f90f-08ea-a8fa-f8c6430455d0";

@XendraTrl(Identifier="4febc161-8560-c0df-7dd2-3c434a742f08")
public static String es_PE_COLUMN_GL_Journal_ID_Name="Póliza";

@XendraColumn(AD_Element_ID="32802681-b859-1049-1622-21ea8c9a2474",ColumnName="GL_Journal_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=2,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4febc161-8560-c0df-7dd2-3c434a742f08",
Synchronized="2019-08-30 22:22:13.0")
/** Column name GL_Journal_ID */
public static final String COLUMNNAME_GL_Journal_ID = "GL_Journal_ID";
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
@XendraTrl(Identifier="38a2320e-7d04-49dd-801e-0b6d546ca9f3")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="38a2320e-7d04-49dd-801e-0b6d546ca9f3",
Synchronized="2019-08-30 22:22:13.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Recognized Amount.
@param RecognizedAmt Recognized Amount */
public void setRecognizedAmt (BigDecimal RecognizedAmt)
{
if (RecognizedAmt == null) throw new IllegalArgumentException ("RecognizedAmt is mandatory.");
set_ValueNoCheck (COLUMNNAME_RecognizedAmt, RecognizedAmt);
}
/** Get Recognized Amount.
@return Recognized Amount */
public BigDecimal getRecognizedAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_RecognizedAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="984dc794-0581-0e7d-3ff1-c1af6d806d2d")
public static String es_PE_FIELD_RevenueRecognitionRun_RecognizedAmount_Name="Total Reconocido";

@XendraField(AD_Column_ID="RecognizedAmt",IsCentrallyMaintained=true,
AD_Tab_ID="835c4cde-2a80-e54d-b4bd-674ef29f95dd",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="984dc794-0581-0e7d-3ff1-c1af6d806d2d")
public static final String FIELDNAME_RevenueRecognitionRun_RecognizedAmount="984dc794-0581-0e7d-3ff1-c1af6d806d2d";

@XendraTrl(Identifier="7b82c10a-d395-a2a5-a9dd-b07cb6416fbf")
public static String es_PE_COLUMN_RecognizedAmt_Name="Total Reconocido";

@XendraColumn(AD_Element_ID="2331627d-3f32-c435-d45a-63fcf72b3cc2",ColumnName="RecognizedAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7b82c10a-d395-a2a5-a9dd-b07cb6416fbf",
Synchronized="2019-08-30 22:22:13.0")
/** Column name RecognizedAmt */
public static final String COLUMNNAME_RecognizedAmt = "RecognizedAmt";
}
