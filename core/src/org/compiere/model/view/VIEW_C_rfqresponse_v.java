package org.compiere.model.view;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
import org.compiere.model.View;

public class VIEW_C_rfqresponse_v 
{
 
@XendraTable(Name="C_RfQResponse_v",Description="",Help="",TableName="C_RfQResponse_v",
AccessLevel="3",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=0,LoadSeq=150,IsSecurityEnabled=false,
IsDeleteable=false,IsHighVolume=true,IsChangeLog=false,IsView=true,PO_Window_ID="",
ID="org.xendra.commercial",Identifier="ebd38614-57c7-17a7-555d-4c527ecbde54",
Synchronized="2017-08-16 12:37:09.0")
/** TableName=C_RfQResponse_v */
public static final String Table_Name="C_RfQResponse_v";

@XendraTrl(Identifier="ee5b3b7d-63fd-f44d-9129-5a27b7605c69")
public static String es_PE_COLUMN_AD_Language_Name="Lenguaje";

@XendraColumn(AD_Element_ID="d542d9da-4627-0da8-89af-5797f22de434",ColumnName="AD_Language",
AD_Reference_ID=18,AD_Reference_Value_ID="136e26cd-6ffa-f76c-1e63-cce5ed2025b9",AD_Val_Rule_ID="",
FieldLength=5,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="ee5b3b7d-63fd-f44d-9129-5a27b7605c69",Synchronized="2017-08-26 19:41:31.0")
/** Column name AD_Language */
public static final String COLUMNNAME_AD_Language = "AD_Language";

@XendraTrl(Identifier="ef47bc37-79ac-8a8b-8c5e-5a7053b88742")
public static String es_PE_COLUMN_AD_User_ID_Name="Usuario";

@XendraColumn(AD_Element_ID="abdf8dee-d3cd-73ec-c758-683e907797f4",ColumnName="AD_User_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ef47bc37-79ac-8a8b-8c5e-5a7053b88742",
Synchronized="2017-08-26 19:41:31.0")
/** Column name AD_User_ID */
public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";

@XendraTrl(Identifier="b07d5542-cb53-4165-ea79-015af4094e45")
public static String es_PE_COLUMN_BPName_Name="Nombre S. Negocio";

@XendraColumn(AD_Element_ID="72456d7c-10e9-611b-68f6-a672d9560027",ColumnName="BPName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b07d5542-cb53-4165-ea79-015af4094e45",
Synchronized="2017-08-26 19:41:31.0")
/** Column name BPName */
public static final String COLUMNNAME_BPName = "BPName";

@XendraTrl(Identifier="b276973e-f4bf-2cf7-3e35-517a7d2be83b")
public static String es_PE_COLUMN_BPName2_Name="Nombre S. Negocio 2";

@XendraColumn(AD_Element_ID="433349f8-f913-cf6f-28cd-b0aea5339cb0",ColumnName="BPName2",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b276973e-f4bf-2cf7-3e35-517a7d2be83b",
Synchronized="2017-08-26 19:41:31.0")
/** Column name BPName2 */
public static final String COLUMNNAME_BPName2 = "BPName2";

@XendraTrl(Identifier="75e4f36b-225b-bbdb-3d92-21dcf956a5d0")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Socio de Negocio";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="75e4f36b-225b-bbdb-3d92-21dcf956a5d0",
Synchronized="2017-08-26 19:41:31.0")
/** Column name C_BPartner_ID */
public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";

@XendraTrl(Identifier="33064bbd-1aba-5500-0f3c-973c0a9844dd")
public static String es_PE_COLUMN_C_BPartner_Location_ID_Name="Dirección del Socio del Negocio";

@XendraColumn(AD_Element_ID="0dab7dc6-2832-26dc-2462-cba2d40235f2",
ColumnName="C_BPartner_Location_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="33064bbd-1aba-5500-0f3c-973c0a9844dd",Synchronized="2017-08-26 19:41:31.0")
/** Column name C_BPartner_Location_ID */
public static final String COLUMNNAME_C_BPartner_Location_ID = "C_BPartner_Location_ID";

@XendraTrl(Identifier="2d474c01-b653-8298-c7a5-08c9c5494a91")
public static String es_PE_COLUMN_C_Currency_ID_Name="Moneda";

@XendraColumn(AD_Element_ID="8daec488-bca2-50fe-f9de-abf0cba2a34a",ColumnName="C_Currency_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2d474c01-b653-8298-c7a5-08c9c5494a91",
Synchronized="2017-08-26 19:41:31.0")
/** Column name C_Currency_ID */
public static final String COLUMNNAME_C_Currency_ID = "C_Currency_ID";

@XendraTrl(Identifier="c0d4d62b-08b0-39ea-5a0e-ec808b64e949")
public static String es_PE_COLUMN_C_Location_ID_Name="Localización / Dirección";

@XendraColumn(AD_Element_ID="e66e22a8-535b-2af2-6efb-aa600959a885",ColumnName="C_Location_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c0d4d62b-08b0-39ea-5a0e-ec808b64e949",
Synchronized="2017-08-26 19:41:31.0")
/** Column name C_Location_ID */
public static final String COLUMNNAME_C_Location_ID = "C_Location_ID";

@XendraTrl(Identifier="abc617d5-66a9-afee-3a3a-37cc89a7c4d1")
public static String es_PE_COLUMN_ContactName_Name="Nombre del Contacto";

@XendraColumn(AD_Element_ID="09dc9eae-5f2a-936f-d673-7d269b49db5a",ColumnName="ContactName",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="abc617d5-66a9-afee-3a3a-37cc89a7c4d1",
Synchronized="2017-08-26 19:41:31.0")
/** Column name ContactName */
public static final String COLUMNNAME_ContactName = "ContactName";

@XendraTrl(Identifier="f1ea6d44-431b-e5d0-5fe3-f93dd7a2b91d")
public static String es_PE_COLUMN_C_RfQ_ID_Name="SPC (RfQ)";

@XendraColumn(AD_Element_ID="8b6564e2-4b5a-7abd-5fdd-c2ab5ad134a1",ColumnName="C_RfQ_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f1ea6d44-431b-e5d0-5fe3-f93dd7a2b91d",
Synchronized="2017-08-26 19:41:31.0")
/** Column name C_RfQ_ID */
public static final String COLUMNNAME_C_RfQ_ID = "C_RfQ_ID";
/** Column name C_RfQResponse_ID */
public static final String COLUMNNAME_C_RfQResponse_ID = "C_RfQResponse_ID";

@XendraTrl(Identifier="cc9b3eb4-74ed-02df-f495-640b31b04cac")
public static String es_PE_COLUMN_DateResponse_Name="Fecha de Respuesta";

@XendraColumn(AD_Element_ID="d9166ff5-a258-a8dd-e207-99d527a46298",ColumnName="DateResponse",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cc9b3eb4-74ed-02df-f495-640b31b04cac",
Synchronized="2017-08-26 19:41:31.0")
/** Column name DateResponse */
public static final String COLUMNNAME_DateResponse = "DateResponse";

@XendraTrl(Identifier="54c01bc7-b6f3-bd1d-c991-3853ad85c8f4")
public static String es_PE_COLUMN_DateWorkStart_Name="Inicia el Trabajo";

@XendraColumn(AD_Element_ID="eacd3b09-4768-e18d-b651-2ec68cc53f56",ColumnName="DateWorkStart",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="54c01bc7-b6f3-bd1d-c991-3853ad85c8f4",
Synchronized="2017-08-26 19:41:31.0")
/** Column name DateWorkStart */
public static final String COLUMNNAME_DateWorkStart = "DateWorkStart";

@XendraTrl(Identifier="94f0b349-cf58-e7c1-4d46-1e1792699145")
public static String es_PE_COLUMN_DeliveryDays_Name="Días de Entrega";

@XendraColumn(AD_Element_ID="be6b99df-af16-3107-0958-5fe3af220ffc",ColumnName="DeliveryDays",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="94f0b349-cf58-e7c1-4d46-1e1792699145",
Synchronized="2017-08-26 19:41:31.0")
/** Column name DeliveryDays */
public static final String COLUMNNAME_DeliveryDays = "DeliveryDays";

@XendraTrl(Identifier="7231fb17-20d6-e3e0-caf4-bc79c140d30d")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7231fb17-20d6-e3e0-caf4-bc79c140d30d",
Synchronized="2017-08-26 19:41:31.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";

@XendraTrl(Identifier="44cfac83-664f-6b17-dd9c-98298604f837")
public static String es_PE_COLUMN_Help_Name="Ayuda";

@XendraColumn(AD_Element_ID="a6fda582-56f9-6bb7-8436-285ce4f8de3f",ColumnName="Help",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="44cfac83-664f-6b17-dd9c-98298604f837",
Synchronized="2017-08-26 19:41:31.0")
/** Column name Help */
public static final String COLUMNNAME_Help = "Help";

@XendraTrl(Identifier="3411799a-81e3-5b35-ddac-4c7b9cfd894c")
public static String es_PE_COLUMN_ISO_Code_Name="Código ISO";

@XendraColumn(AD_Element_ID="0770c1a3-36f8-0fc9-bd56-a563b64128ee",ColumnName="ISO_Code",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=3,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3411799a-81e3-5b35-ddac-4c7b9cfd894c",
Synchronized="2017-08-26 19:41:31.0")
/** Column name ISO_Code */
public static final String COLUMNNAME_ISO_Code = "ISO_Code";

@XendraTrl(Identifier="12962f16-1522-9426-7a1f-d8128454c8ff")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="12962f16-1522-9426-7a1f-d8128454c8ff",
Synchronized="2017-08-26 19:41:31.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";

@XendraTrl(Identifier="1fe6a733-303a-b41c-cc2c-a305d1b9e2f2")
public static String es_PE_COLUMN_Org_Location_ID_Name="Localización de Org.";

@XendraColumn(AD_Element_ID="e5141e90-40af-c248-1a98-a24a709a1146",ColumnName="Org_Location_ID",
AD_Reference_ID=21,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1fe6a733-303a-b41c-cc2c-a305d1b9e2f2",
Synchronized="2017-08-26 19:41:31.0")
/** Column name Org_Location_ID */
public static final String COLUMNNAME_Org_Location_ID = "Org_Location_ID";

@XendraTrl(Identifier="bceef9d1-6896-888d-da33-6ba9fed9cb03")
public static String es_PE_COLUMN_Phone_Name="Teléfono";

@XendraColumn(AD_Element_ID="4842df23-a82d-d921-7e1e-5869844caceb",ColumnName="Phone",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bceef9d1-6896-888d-da33-6ba9fed9cb03",
Synchronized="2017-08-26 19:41:31.0")
/** Column name Phone */
public static final String COLUMNNAME_Phone = "Phone";

@XendraTrl(Identifier="89654226-fd51-aeb8-22e7-7bddb8694f57")
public static String es_PE_COLUMN_TaxID_Name="RFC";

@XendraColumn(AD_Element_ID="e0a9d0f7-835b-4f80-4c13-bff62213e232",ColumnName="TaxID",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=20,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="89654226-fd51-aeb8-22e7-7bddb8694f57",
Synchronized="2017-08-26 19:41:31.0")
/** Column name TaxID */
public static final String COLUMNNAME_TaxID = "TaxID";

@XendraTrl(Identifier="0427a6fd-1190-0658-6f3d-7268b82f7272")
public static String es_PE_COLUMN_Title_Name="Título";

@XendraColumn(AD_Element_ID="05a7b975-a2e2-1303-e323-2e3fdda7ebd3",ColumnName="Title",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=40,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0427a6fd-1190-0658-6f3d-7268b82f7272",
Synchronized="2017-08-26 19:41:31.0")
/** Column name Title */
public static final String COLUMNNAME_Title = "Title";
	@XendraView(Identifier="ebd38614-57c7-17a7-555d-4c527ecbde54",
Synchronized="2013-07-09 19:02:34.0",
Name="c_rfqresponse_v",
Owner="xendra",
Extension="")
	public static final String Identifier = "ebd38614-57c7-17a7-555d-4c527ecbde54";

	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-07-09 19:02:34.0");
	sb.appendln("@Identifier=ebd38614-57c7-17a7-555d-4c527ecbde54");
	return sb.toString();
}
	public static final String getDefinition() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("SELECT rr.c_rfqresponse_id, rr.c_rfq_id, rr.ad_client_id, rr.ad_org_id, rr.isactive, rr.created, rr.createdby, rr.updated, rr.updatedby, 'en_US'::character varying AS ad_language, oi.c_location_id AS org_location_id, oi.taxid, r.name, r.description, r.help, r.c_currency_id, c.iso_code, r.dateresponse, r.dateworkstart, r.deliverydays, rr.c_bpartner_id, bp.name AS bpname, bp.name2 AS bpname2, rr.c_bpartner_location_id, bpl.c_location_id, rr.ad_user_id, bpc.title, bpc.phone, NULLIF((bpc.name)::text, (bp.name)::text) AS contactname FROM ((((((c_rfqresponse rr JOIN c_rfq r ON ((rr.c_rfq_id = r.c_rfq_id))) JOIN ad_orginfo oi ON ((rr.ad_org_id = oi.ad_org_id))) JOIN c_currency c ON ((r.c_currency_id = c.c_currency_id))) JOIN c_bpartner bp ON ((rr.c_bpartner_id = bp.c_bpartner_id))) JOIN c_bpartner_location bpl ON ((rr.c_bpartner_location_id = bpl.c_bpartner_location_id))) LEFT JOIN ad_user bpc ON ((rr.ad_user_id = bpc.ad_user_id)));");
	return sb.toString();
}
}
