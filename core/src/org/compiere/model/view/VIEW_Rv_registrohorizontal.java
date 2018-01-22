package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_Rv_registrohorizontal 
{
 
@XendraTable(Name="RV_RegistroHorizontal",Description="",Help="",TableName="RV_RegistroHorizontal",
AccessLevel="4",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=0,LoadSeq=0,IsSecurityEnabled=false,
IsDeleteable=false,IsHighVolume=true,IsChangeLog=false,IsView=true,PO_Window_ID="",
ID="org.xendra.standard",Identifier="b8954c0a-f0f9-6d75-1514-35a84775efdb",
Synchronized="2017-08-16 12:38:46.0")
/** TableName=RV_RegistroHorizontal */
public static final String Table_Name="RV_RegistroHorizontal";

@XendraTrl(Identifier="6c8b4cc0-b46c-cb87-f05e-777c768dfcdc")
public static String es_PE_COLUMN_AD_Table_ID_Name="Table";

@XendraColumn(AD_Element_ID="270eeb02-723b-0ecc-7f56-3c67fa71a7f1",ColumnName="AD_Table_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6c8b4cc0-b46c-cb87-f05e-777c768dfcdc",
Synchronized="2017-08-16 12:38:45.0")
/** Column name AD_Table_ID */
public static final String COLUMNNAME_AD_Table_ID = "AD_Table_ID";

@XendraTrl(Identifier="66fe9902-6a29-f5dc-8243-d3b7665ed391")
public static String es_PE_COLUMN_C_AcctSchema_ID_Name="Accounting Schema";

@XendraColumn(AD_Element_ID="561c9a32-9b35-9c1a-fabc-8abf7f2bb4ae",ColumnName="C_AcctSchema_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="66fe9902-6a29-f5dc-8243-d3b7665ed391",
Synchronized="2017-08-16 12:38:45.0")
/** Column name C_AcctSchema_ID */
public static final String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";

@XendraTrl(Identifier="ecdc4089-52f8-e136-c827-104555456b5b")
public static String es_PE_COLUMN_GrandAmtAcct_Name="grandamtacct";

@XendraColumn(AD_Element_ID="cc95153c-af73-6e45-8790-89f9cf124d55",ColumnName="GrandAmtAcct",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ecdc4089-52f8-e136-c827-104555456b5b",
Synchronized="2017-08-16 12:38:45.0")
/** Column name GrandAmtAcct */
public static final String COLUMNNAME_GrandAmtAcct = "GrandAmtAcct";

@XendraTrl(Identifier="a1dd9c1c-86f5-7835-1ab2-e9498aae4817")
public static String es_PE_COLUMN_GrandAmtSource_Name="grandamtsource";

@XendraColumn(AD_Element_ID="3943a81a-ceec-e24a-ecb8-d9996ae4a57a",ColumnName="GrandAmtSource",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a1dd9c1c-86f5-7835-1ab2-e9498aae4817",
Synchronized="2017-08-16 12:38:45.0")
/** Column name GrandAmtSource */
public static final String COLUMNNAME_GrandAmtSource = "GrandAmtSource";

@XendraTrl(Identifier="397c1a38-ad40-ecb5-a301-e532e20b1236")
public static String es_PE_COLUMN_Rate_Name="Rate";

@XendraColumn(AD_Element_ID="3eb861a4-ab06-c590-06e1-f57223b55231",ColumnName="Rate",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="397c1a38-ad40-ecb5-a301-e532e20b1236",
Synchronized="2017-08-16 12:38:46.0")
/** Column name Rate */
public static final String COLUMNNAME_Rate = "Rate";

@XendraTrl(Identifier="3e054370-282d-c769-0114-2166b51df02a")
public static String es_PE_COLUMN_Record_ID_Name="Record ID";

@XendraColumn(AD_Element_ID="86e36e4b-d1dc-2deb-449d-c1f6769e1603",ColumnName="Record_ID",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3e054370-282d-c769-0114-2166b51df02a",
Synchronized="2017-08-16 12:38:46.0")
/** Column name Record_ID */
public static final String COLUMNNAME_Record_ID = "Record_ID";
	@XendraView(Identifier="b8954c0a-f0f9-6d75-1514-35a84775efdb",
Synchronized="2013-07-09 19:02:34.0",
Name="rv_registrohorizontal",
Owner="xendra",
Extension="")
	public static final String Identifier = "b8954c0a-f0f9-6d75-1514-35a84775efdb";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-07-09 19:02:34.0");
	sb.appendln("@Identifier=b8954c0a-f0f9-6d75-1514-35a84775efdb");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT r.c_acctschema_id, r.ad_table_id, r.record_id, sum(r.amtsource) AS grandamtsource, sum(r.amtacct) AS grandamtacct, CASE WHEN (sum(r.amtsource) = sum(r.amtacct)) THEN NULL::numeric ELSE (sum(r.amtacct) / sum(r.amtsource)) END AS rate FROM rv_registrovertical r GROUP BY r.c_acctschema_id, r.ad_table_id, r.record_id;");
	return sb.toString();
}
}
