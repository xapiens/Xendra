package org.xendra.process;

import java.io.File;
import java.io.FileOutputStream;
import java.math.BigDecimal;
import java.security.PrivateKey;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;

import org.apache.xml.security.utils.Constants;
import org.apache.xml.security.utils.ElementProxy;
import org.apache.xml.security.signature.XMLSignature;
import org.apache.xml.security.transforms.Transforms;
import org.compiere.model.MBPartner;
import org.compiere.model.MBPartnerCertificate;
import org.compiere.model.MBPartnerLocation;
import org.compiere.model.MCity;
import org.compiere.model.MCountry;
import org.compiere.model.MCurrency;
import org.compiere.model.MDocType;
import org.compiere.model.MLocation;
import org.compiere.model.MOrgInfo;
import org.compiere.model.MProduct;
import org.compiere.model.MRegion;
import org.compiere.model.MTax;
import org.compiere.model.MUOM;
import org.compiere.model.PO;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_C_BP_DocType;
import org.compiere.model.persistence.X_C_City;
import org.compiere.model.persistence.X_C_Country;
import org.compiere.model.persistence.X_C_DocumentTax;
import org.compiere.model.persistence.X_S_DocAdvance;
import org.compiere.model.persistence.X_S_DocHeader;
import org.compiere.model.persistence.X_S_DocLegend;
import org.compiere.model.persistence.X_S_DocLine;
import org.compiere.model.persistence.X_S_DocLineOthers;
import org.compiere.model.persistence.X_c_province;
import org.compiere.model.reference.REF_PriceTypeCode;
import org.compiere.util.Env;
import org.compiere.util.Util;
import org.w3c.dom.CDATASection;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.security.cert.X509Certificate;
import org.xendra.efact.process.GeneralFunctions;

public class Boleta extends EFactDocument {

	private MCity city;
	private MRegion region;
	private X_c_province province;
	private MBPartnerLocation pl;
	private X_C_BP_DocType bpdt;
	private MBPartner p;	
	public static String currencyID = "currencyID";
	public static String schemeID = "schemeID";
	public static String schemeName = "schemeName";
	public static String schemeAgencyName = "schemeAgencyName";
	public static String schemeURI = "schemeURI";
	public static String listURI = "listURI";
	public static String listID = "listID";
	public static String listName = "listName";
	public static String listSchemeURI = "listSchemeURI";
	public static String listAgencyName="listAgencyName";
	public Boleta(X509Certificate cert, MBPartner m_bp, MBPartnerCertificate m_bp_cert, PrivateKey privateKey, X_S_DocHeader items) {
		super(cert, m_bp, m_bp_cert, privateKey, items);
	}

	private void createPartyRegistrationAddress(Document doc, Element PartySupplier) {
		Element PartyLegalEntity 		 = doc.createElementNS("", "cac:PartyLegalEntity");
		Element PartyRegistrationAddress = doc.createElementNS("", "cac:RegistrationAddress");
		Element Ubigeo = doc.createElementNS("", "cbc:ID");
		Ubigeo.appendChild(doc.createTextNode(city.getLocode()));
		PartyRegistrationAddress.appendChild(Ubigeo);//se anade al grupo partyname1

		Element CitySubDivision = doc.createElementNS("", "cbc:CitySubdivisionName");
		CitySubDivision.appendChild(doc.createTextNode(""));
		PartyRegistrationAddress.appendChild(CitySubDivision);

		Element CityName = doc.createElementNS("", "cbc:CityName");
		CityName.appendChild(doc.createTextNode(province.getName()));
		PartyRegistrationAddress.appendChild(CityName);

		Element CountrySubEntity = doc.createElementNS("", "cbc:CountrySubentity");
		CountrySubEntity.appendChild(doc.createTextNode(region.getName()));
		PartyRegistrationAddress.appendChild(CountrySubEntity);

		Element District = doc.createElementNS("", "cbc:District");
		District.appendChild(doc.createTextNode(city.getName()));
		PartyRegistrationAddress.appendChild(District);

		Element AddressLine = doc.createElementNS("", "cac:AddressLine");
		Element Line = doc.createElementNS("", "cbc:Line");
		AddressLine.appendChild(Line);
		Line.appendChild(doc.createTextNode(pl.getName()));

		PartyRegistrationAddress.appendChild(AddressLine);

		Element Country = doc.createElementNS("", "cac:Country");
		PartyRegistrationAddress.appendChild(Country);//se anade al grupo PostalAddress			
		Element IdentificationCode = doc.createElementNS("", "cbc:IdentificationCode");
		IdentificationCode.appendChild(doc.createTextNode("PE"));
		Country.appendChild(IdentificationCode);

		Element AddressTypeCode = doc.createElementNS("", "cbc:AddressTypeCode");
		AddressTypeCode.setAttributeNS(null, listAgencyName, "PE:SUNAT");
		AddressTypeCode.setAttributeNS(null, listName, "Establecimientos anexos");
		AddressTypeCode.appendChild(doc.createTextNode("0000"));
		PartyRegistrationAddress.appendChild(AddressTypeCode);			
		PartyLegalEntity.appendChild(PartyRegistrationAddress);								
		PartySupplier.appendChild(PartyLegalEntity);		
	}


	private void createAccountingCustomerParty(Document doc, Element envelope) {
		Element AccountingCustomerParty = doc.createElementNS("", "cac:AccountingCustomerParty");
		envelope.appendChild(AccountingCustomerParty);
		AccountingCustomerParty.appendChild(doc.createTextNode("\n"));

		Element Party = doc.createElementNS("", "cac:Party");
		AccountingCustomerParty.appendChild(Party);

		Element CustomerPartyIdentification = doc.createElementNS("", "cac:PartyIdentification");
		Party.appendChild(CustomerPartyIdentification);

		Element CustomerID = doc.createElementNS("", "cbc:ID");
		CustomerID.setAttributeNS(null, schemeID, bpdt.getTaxID());
		CustomerID.setAttributeNS(null, schemeName, bpdt.getName());
		CustomerID.setAttributeNS(null, schemeAgencyName, "PE:SUNAT");
		CustomerID.setAttributeNS(null, schemeURI, "urn:pe:gob:sunat:cpe:see:gem:catalogos:catalogo06");
		CustomerID.appendChild(doc.createTextNode(p.getTaxID()));
		// 19 Apellidos y nombres, denominacion o razon social del receptor
		Element PartyLegalIdentity = doc.createElementNS("", "cac:PartyLegalEntity");
		Party.appendChild(PartyLegalIdentity);

		Element RegistrationName = doc.createElementNS("", "cbc:RegistrationName");
		RegistrationName.appendChild(doc.createTextNode(p.getName()));
		PartyLegalIdentity.appendChild(RegistrationName);

		// 20 Direccion completa y detallada del receptor
		Element RegistrationAddress = doc.createElementNS("", "cac:RegistrationAddress");
		Element Ubigeo = doc.createElementNS("", "cbc:ID");
		Ubigeo.appendChild(doc.createTextNode(city.getLocode()));
		RegistrationAddress.appendChild(Ubigeo);//se anade al grupo partyname1

		Element CitySubDivision = doc.createElementNS("", "cbc:CitySubdivisionName");
		CitySubDivision.appendChild(doc.createTextNode(""));
		RegistrationAddress.appendChild(CitySubDivision);

		Element CityName = doc.createElementNS("", "cbc:CityName");
		CityName.appendChild(doc.createTextNode(province.getName()));
		RegistrationAddress.appendChild(CityName);

		Element CountrySubEntity = doc.createElementNS("", "cbc:CountrySubentity");
		CountrySubEntity.appendChild(doc.createTextNode(region.getName()));
		RegistrationAddress.appendChild(CountrySubEntity);

		Element District = doc.createElementNS("", "cbc:District");
		District.appendChild(doc.createTextNode(city.getName()));
		RegistrationAddress.appendChild(District);

		Element AddressLine = doc.createElementNS("", "cac:AddressLine");
		Element Line = doc.createElementNS("", "cbc:Line");
		AddressLine.appendChild(Line);
		Line.appendChild(doc.createTextNode(pl.getName()));

		RegistrationAddress.appendChild(AddressLine);

		Element Country = doc.createElementNS("", "cac:Country");
		RegistrationAddress.appendChild(Country);//se anade al grupo PostalAddress			
		Element IdentificationCode = doc.createElementNS("", "cbc:IdentificationCode");
		IdentificationCode.appendChild(doc.createTextNode("PE"));
		Country.appendChild(IdentificationCode);
		PartyLegalIdentity.appendChild(RegistrationAddress);				
	}


	public String creaXml(X_S_DocHeader items,
			List<X_S_DocLine> detdocelec,
			List<X_S_DocAdvance> anticipos,
			List<X_S_DocLegend> leyendas,
			List<X_S_DocLineOthers> otrosdetalles) {
		String resultado;
		String anticipoCero1001 = "0";
		String anticipoCero1002 = "0";
		String anticipoCero1003 = "0";		
		try {
			ElementProxy.setDefaultPrefix(Constants.SignatureSpecNS, "ds");
			p = new Query(Env.getCtx(), MBPartner.Table_Name, "C_BPartner_ID = ?", null)
					.setParameters(items.getC_BPartner_ID()).first();
			bpdt = new Query(Env.getCtx(), X_C_BP_DocType.Table_Name, "C_BP_DocType_ID = ?", null)
					.setParameters(p.getC_BP_DocType_ID()).first();
			MDocType dt = new Query(Env.getCtx(), MDocType.Table_Name, "C_DocType_ID = ?", null)
					.setParameters(items.getC_DocType_ID()).first();
			X_C_DocumentTax taxdoc = new Query(Env.getCtx(), X_C_DocumentTax.Table_Name, "C_DocumentTax_ID = ?", null)
					.setParameters(dt.getC_DocumentTax_ID()).first();
			pl = new Query(Env.getCtx(), MBPartnerLocation.Table_Name, "C_BPartner_ID = ? AND isbillto = 'Y'", null)
					.setParameters(p.getC_BPartner_ID()).first();			
			MLocation loc = new Query(Env.getCtx(), MLocation.Table_Name, "C_Location_ID = ?", null)
					.setParameters(pl.getC_Location_ID()).first();
			city = new Query(Env.getCtx(), MCity.Table_Name, "C_City_ID = ?", null)
					.setParameters(loc.getC_City_ID()).first();
			region = new Query(Env.getCtx(), MRegion.Table_Name, "C_Region_ID = ?", null)
					.setParameters(city.getC_Region_ID()).first();
			province = new Query(Env.getCtx(), X_c_province.Table_Name, "C_Province_ID = ?", null)
					.setParameters(city.getC_Province_ID()).first();			
			MCountry country = new Query(Env.getCtx(), MCountry.Table_Name, "C_Country_ID = ?", null)
					.setParameters(city.getC_Country_ID()).first();
			MCurrency currency = new Query(Env.getCtx(), MCurrency.Table_Name, "C_Currency_ID = ?", null)
					.setParameters(items.getC_Currency_ID()).first();
			MOrgInfo orginfo = new Query(Env.getCtx(), MOrgInfo.Table_Name,"AD_Org_ID = ?", null)
					.setParameters(items.getAD_Org_ID()).first();			
			X_C_BP_DocType m_bpdt = new Query(Env.getCtx(), X_C_BP_DocType.Table_Name, "C_BP_DocType_ID = ?", null)
					.setParameters(m_bp.getC_BP_DocType_ID()).first();

			String pathXMLFile = getFile("xml");
			File signatureFile = new File(pathXMLFile);
			//
			//////////////////////////////////////////////////
			javax.xml.parsers.DocumentBuilderFactory dbf = javax.xml.parsers.DocumentBuilderFactory.newInstance();
			//Firma XML genera espacio para los nombres o tag
			dbf.setNamespaceAware(true);
			javax.xml.parsers.DocumentBuilder db = dbf.newDocumentBuilder();
			org.w3c.dom.Document doc = db.newDocument();
			////////////////////////////////////////////////// 			
			log.info("generarXMLZipiadoBoleta - cabecera XML");
			Element invoice = doc.createElementNS("", "Invoice");
			invoice.setAttributeNS(Constants.NamespaceSpecNS, "xmlns", "urn:oasis:names:specification:ubl:schema:xsd:Invoice-2");
			invoice.setAttributeNS(Constants.NamespaceSpecNS, "xmlns:cac", "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2");
			invoice.setAttributeNS(Constants.NamespaceSpecNS, "xmlns:cbc", "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2");
			invoice.setAttributeNS(Constants.NamespaceSpecNS, "xmlns:ccts", "urn:un:unece:uncefact:documentation:2");
			invoice.setAttributeNS(Constants.NamespaceSpecNS, "xmlns:ds", "http://www.w3.org/2000/09/xmldsig#");
			invoice.setAttributeNS(Constants.NamespaceSpecNS, "xmlns:ext", "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2");
			invoice.setAttributeNS(Constants.NamespaceSpecNS, "xmlns:qdt", "urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2");
			invoice.setAttributeNS(Constants.NamespaceSpecNS, "xmlns:sac", "urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1");
			invoice.setAttributeNS(Constants.NamespaceSpecNS, "xmlns:udt", "urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2");
			invoice.setAttributeNS(Constants.NamespaceSpecNS, "xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
			invoice.appendChild(doc.createTextNode("\n"));
			//doc.appendChild(doc.createComment(" Preamble "));
			doc.appendChild(invoice);
			//doc.appendChild(doc.createComment(" Postamble "));

			Element UBLExtensions = doc.createElementNS("", "ext:UBLExtensions");
			invoice.appendChild(UBLExtensions);
			Element UBLExtension2 = doc.createElementNS("", "ext:UBLExtension");
			UBLExtension2.appendChild(doc.createTextNode("\n"));
			Element ExtensionContent2 = doc.createElementNS("", "ext:ExtensionContent");
			ExtensionContent2.appendChild(doc.createTextNode("\n"));
			//2do grupo
			Element UBLExtension = doc.createElementNS("", "ext:UBLExtension");
			invoice.appendChild(UBLExtension);
			Element ExtensionContent = doc.createElementNS("", "ext:ExtensionContent");
			invoice.appendChild(ExtensionContent);

			Element AdditionalInformation = doc.createElementNS("", "sac:AdditionalInformation");
			invoice.appendChild(AdditionalInformation);
			AdditionalInformation.appendChild(doc.createTextNode("\n"));
			//agrupa1
			//if (!items.getDocu_gravada().trim().equals("0.00")) {
			if (items.getTaxSAmt().compareTo(BigDecimal.ZERO) > 0) {
				Element AdditionalMonetaryTotal1 = doc.createElementNS("", "sac:AdditionalMonetaryTotal");
				invoice.appendChild(AdditionalMonetaryTotal1);
				AdditionalMonetaryTotal1.appendChild(doc.createTextNode("\n"));

				Element ID1 = doc.createElementNS("", "cbc:ID");
				invoice.appendChild(ID1);
				ID1.appendChild(doc.createTextNode("1001"));

				Element PayableAmount1 = doc.createElementNS("", "cbc:PayableAmount");
				//PayableAmount1.setAttributeNS(null, "currencyID", items.getDocu_moneda().trim());
				PayableAmount1.setAttributeNS(null, currencyID, currency.getISO_Code());
				PayableAmount1.setIdAttributeNS(null, currencyID, true);
				invoice.appendChild(PayableAmount1);
				//PayableAmount1.appendChild(doc.createTextNode(items.getDocu_gravada().trim()));
				PayableAmount1.appendChild(doc.createTextNode(items.getTaxSAmt().toString().trim()));

				AdditionalInformation.appendChild(AdditionalMonetaryTotal1);
				AdditionalMonetaryTotal1.appendChild(ID1);
				AdditionalMonetaryTotal1.appendChild(PayableAmount1);
				anticipoCero1001 = "1";
			}

			//agrupa2
			//if (!items.getDocu_inafecta().trim().equals("0.00")) {
			if (items.getTaxGAmt().compareTo(BigDecimal.ZERO) > 0) {
				Element AdditionalMonetaryTotal2 = doc.createElementNS("", "sac:AdditionalMonetaryTotal");
				invoice.appendChild(AdditionalMonetaryTotal2);
				AdditionalMonetaryTotal2.appendChild(doc.createTextNode("\n"));

				Element ID2 = doc.createElementNS("", "cbc:ID");
				invoice.appendChild(ID2);
				ID2.appendChild(doc.createTextNode("1002"));

				Element PayableAmount2 = doc.createElementNS("", "cbc:PayableAmount");
				//PayableAmount2.setAttributeNS(null, "currencyID", items.getDocu_moneda().trim());
				PayableAmount2.setAttributeNS(null, currencyID, currency.getISO_Code());
				PayableAmount2.setIdAttributeNS(null, currencyID, true);
				invoice.appendChild(PayableAmount2);
				//PayableAmount2.appendChild(doc.createTextNode(items.getDocu_inafecta().trim()));
				PayableAmount2.appendChild(doc.createTextNode(items.getTaxGAmt().toString().trim()));

				AdditionalInformation.appendChild(AdditionalMonetaryTotal2);
				AdditionalMonetaryTotal2.appendChild(ID2);
				AdditionalMonetaryTotal2.appendChild(PayableAmount2);
				anticipoCero1002 = "1";
			}

			//agrupa3
			//if (!items.getDocu_exonerada().trim().equals("0.00")) {
			if (items.getTaxOAmt().compareTo(BigDecimal.ZERO) > 0) {
				Element AdditionalMonetaryTotal3 = doc.createElementNS("", "sac:AdditionalMonetaryTotal");
				invoice.appendChild(AdditionalMonetaryTotal3);
				AdditionalMonetaryTotal3.appendChild(doc.createTextNode("\n"));

				Element ID3 = doc.createElementNS("", "cbc:ID");
				invoice.appendChild(ID3);
				ID3.appendChild(doc.createTextNode("1003"));

				Element PayableAmount3 = doc.createElementNS("", "cbc:PayableAmount");
				//PayableAmount3.setAttributeNS(null, "currencyID", items.getDocu_moneda().trim());
				PayableAmount3.setAttributeNS(null, currencyID, currency.getISO_Code());
				PayableAmount3.setIdAttributeNS(null, currencyID, true);
				invoice.appendChild(PayableAmount3);
				//PayableAmount3.appendChild(doc.createTextNode(items.getDocu_exonerada().trim()));
				PayableAmount3.appendChild(doc.createTextNode(items.getTaxOAmt().toString().trim()));
				AdditionalInformation.appendChild(AdditionalMonetaryTotal3);
				AdditionalMonetaryTotal3.appendChild(ID3);
				AdditionalMonetaryTotal3.appendChild(PayableAmount3);
				anticipoCero1003 = "1";
			}

			// pago cero por anticipos
			//if (!items.getDocu_anticipo_total().equals("0.00") && "0.00".equals(items.getDocu_total().trim())) {
			if (!items.getdoc_anticipo_total().equals(BigDecimal.ZERO) && "0.00".equals(items.getGrandTotal().equals(BigDecimal.ZERO))) {
				if ("000".equals(anticipoCero1001.concat(anticipoCero1002).concat(anticipoCero1003))) {
					Element AdditionalMonetaryTotal1 = doc.createElementNS("", "sac:AdditionalMonetaryTotal");
					invoice.appendChild(AdditionalMonetaryTotal1);
					AdditionalMonetaryTotal1.appendChild(doc.createTextNode("\n"));

					Element ID1 = doc.createElementNS("", "cbc:ID");
					invoice.appendChild(ID1);
					ID1.appendChild(doc.createTextNode("1001"));

					Element PayableAmount1 = doc.createElementNS("", "cbc:PayableAmount");
					//PayableAmount1.setAttributeNS(null, "currencyID", items.getDocu_moneda().trim());
					PayableAmount1.setAttributeNS(null, currencyID, currency.getISO_Code());
					PayableAmount1.setIdAttributeNS(null, currencyID, true);
					invoice.appendChild(PayableAmount1);
					PayableAmount1.appendChild(doc.createTextNode("0.00"));

					AdditionalInformation.appendChild(AdditionalMonetaryTotal1);
					AdditionalMonetaryTotal1.appendChild(ID1);
					AdditionalMonetaryTotal1.appendChild(PayableAmount1);

					Element AdditionalMonetaryTotal2 = doc.createElementNS("", "sac:AdditionalMonetaryTotal");
					invoice.appendChild(AdditionalMonetaryTotal2);
					AdditionalMonetaryTotal2.appendChild(doc.createTextNode("\n"));

					Element ID2 = doc.createElementNS("", "cbc:ID");
					invoice.appendChild(ID2);
					ID2.appendChild(doc.createTextNode("1002"));

					Element PayableAmount2 = doc.createElementNS("", "cbc:PayableAmount");
					//PayableAmount2.setAttributeNS(null, "currencyID", items.getDocu_moneda().trim());
					PayableAmount2.setAttributeNS(null, currencyID, currency.getISO_Code());
					PayableAmount2.setIdAttributeNS(null, currencyID, true);
					invoice.appendChild(PayableAmount2);
					PayableAmount2.appendChild(doc.createTextNode("0.00"));

					AdditionalInformation.appendChild(AdditionalMonetaryTotal2);
					AdditionalMonetaryTotal2.appendChild(ID2);
					AdditionalMonetaryTotal2.appendChild(PayableAmount2);

					Element AdditionalMonetaryTotal3 = doc.createElementNS("", "sac:AdditionalMonetaryTotal");
					invoice.appendChild(AdditionalMonetaryTotal3);
					AdditionalMonetaryTotal3.appendChild(doc.createTextNode("\n"));

					Element ID3 = doc.createElementNS("", "cbc:ID");
					invoice.appendChild(ID3);
					ID3.appendChild(doc.createTextNode("1003"));

					Element PayableAmount3 = doc.createElementNS("", "cbc:PayableAmount");
					//PayableAmount3.setAttributeNS(null, "currencyID", items.getDocu_moneda().trim());
					PayableAmount3.setAttributeNS(null, currencyID, currency.getISO_Code());
					PayableAmount3.setIdAttributeNS(null, currencyID, true);
					invoice.appendChild(PayableAmount3);
					PayableAmount3.appendChild(doc.createTextNode("0.00"));

					AdditionalInformation.appendChild(AdditionalMonetaryTotal3);
					AdditionalMonetaryTotal3.appendChild(ID3);
					AdditionalMonetaryTotal3.appendChild(PayableAmount3);
				}
			}

			//agrupa4
			//if (!items.getDocu_gratuita().trim().equals("0.00")) {
			if (items.getTaxZAmt().compareTo(BigDecimal.ZERO) > 0) {
				Element AdditionalMonetaryTotal4 = doc.createElementNS("", "sac:AdditionalMonetaryTotal");
				invoice.appendChild(AdditionalMonetaryTotal4);
				AdditionalMonetaryTotal4.appendChild(doc.createTextNode("\n"));

				Element ID4 = doc.createElementNS("", "cbc:ID");
				invoice.appendChild(ID4);
				ID4.appendChild(doc.createTextNode("1004"));

				Element PayableAmount4 = doc.createElementNS("", "cbc:PayableAmount");
				//PayableAmount4.setAttributeNS(null, "currencyID", items.getDocu_moneda().trim());
				//PayableAmount4.setAttributeNS(null, "currencyID", items.getDocu_moneda().trim());
				PayableAmount4.setAttributeNS(null, currencyID, currency.getISO_Code());
				PayableAmount4.setIdAttributeNS(null, currencyID, true);
				invoice.appendChild(PayableAmount4);
				PayableAmount4.appendChild(doc.createTextNode(items.getTaxZAmt().toString().trim()));

				AdditionalInformation.appendChild(AdditionalMonetaryTotal4);
				AdditionalMonetaryTotal4.appendChild(ID4);
				AdditionalMonetaryTotal4.appendChild(PayableAmount4);
			}
			//agrupa5
			//if (!items.getDocu_descuento().trim().equals("0.00")) {
			if (items.getDiscount().compareTo(BigDecimal.ZERO) > 0) {
				Element AdditionalMonetaryTotal5 = doc.createElementNS("", "sac:AdditionalMonetaryTotal");
				invoice.appendChild(AdditionalMonetaryTotal5);
				AdditionalMonetaryTotal5.appendChild(doc.createTextNode("\n"));

				Element ID10 = doc.createElementNS("", "cbc:ID");
				invoice.appendChild(ID10);
				ID10.appendChild(doc.createTextNode("2005"));

				Element PayableAmount5 = doc.createElementNS("", "cbc:PayableAmount");
				//PayableAmount5.setAttributeNS(null, "currencyID", items.getDocu_moneda().trim());
				PayableAmount5.setAttributeNS(null, currencyID, currency.getISO_Code());
				PayableAmount5.setIdAttributeNS(null, currencyID, true);
				invoice.appendChild(PayableAmount5);
				//PayableAmount5.appendChild(doc.createTextNode(items.getDocu_descuento().trim()));
				PayableAmount5.appendChild(doc.createTextNode(items.getDiscount().toString().trim()));

				AdditionalInformation.appendChild(AdditionalMonetaryTotal5);
				AdditionalMonetaryTotal5.appendChild(ID10);
				AdditionalMonetaryTotal5.appendChild(PayableAmount5);
			}
			// items.getDocu_tipo_operacion
			if (items.getAdditionalInformation().length() > 0) {
				Element sUNATTransaction = doc.createElementNS("", "sac:SUNATTransaction");
				invoice.appendChild(sUNATTransaction);
				sUNATTransaction.appendChild(doc.createTextNode("\n"));

				Element ID = doc.createElementNS("", "cbc:ID");
				invoice.appendChild(ID);
				ID.appendChild(doc.createTextNode(items.getAdditionalInformation().trim()));

				AdditionalInformation.appendChild(sUNATTransaction);
				sUNATTransaction.appendChild(ID); 
			}

			Element UBLExtensiono = doc.createElementNS("", "ext:UBLExtension");
			invoice.appendChild(UBLExtensiono);
			Element ExtensionContento = doc.createElementNS("", "ext:ExtensionContent");
			invoice.appendChild(ExtensionContento);

			Element DatosAdicionales = doc.createElementNS("", "DatosAdicionales");
			invoice.appendChild(DatosAdicionales);
			DatosAdicionales.appendChild(doc.createTextNode("\n"));

			if (otrosdetalles.size() > 0) {
				//otros detalles
				int counter = 1;
				for (X_S_DocLineOthers detalleotro : otrosdetalles) {
					Element DatoAdicional = doc.createElementNS("", "DatoAdicional");
					invoice.appendChild(DatoAdicional);
					DatoAdicional.appendChild(doc.createTextNode("\n"));

					Element Codigo = doc.createElementNS("", "Codigo");
					invoice.appendChild(Codigo);
					Codigo.appendChild(doc.createTextNode(Util.pad(String.valueOf(counter), 3, null, '0' )));

					Element Valor = doc.createElementNS("", "Valor");
					invoice.appendChild(Valor);
					CDATASection cdata = doc.createCDATASection(detalleotro.getAttributeValue());
					Valor.appendChild(cdata);

					DatosAdicionales.appendChild(DatoAdicional);
					DatoAdicional.appendChild(Codigo);
					DatoAdicional.appendChild(Valor);


					counter++;

				}
			}

			// El baseURI es la URI que se utiliza para anteponer a URIs relativos
			String BaseURI = signatureFile.toURI().toURL().toString();
			// Crea un xml Signature objeto desde el documento, BaseURI and signature algorithm (in this case RSA)
			// XMLSignature sig = new XMLSignature(doc, BaseURI, XMLSignature.ALGO_ID_SIGNATURE_RSA);
			XMLSignature sig = new XMLSignature(doc, BaseURI, XMLSignature.ALGO_ID_SIGNATURE_RSA);

			ExtensionContent.appendChild(sig.getElement());
			UBLExtension.appendChild(ExtensionContent);
			UBLExtensions.appendChild(UBLExtension);
			UBLExtensions.appendChild(UBLExtension2);
			UBLExtension2.appendChild(ExtensionContent2);
			ExtensionContent2.appendChild(AdditionalInformation);
			UBLExtensions.appendChild(UBLExtensiono);
			UBLExtensiono.appendChild(ExtensionContento);
			ExtensionContento.appendChild(DatosAdicionales);

			//bloque1
			Element UBLVersionID = doc.createElementNS("", "cbc:UBLVersionID");
			invoice.appendChild(UBLVersionID);
			UBLVersionID.appendChild(doc.createTextNode("2.1"));

			Element CustomizationID = doc.createElementNS("", "cbc:CustomizationID");
			invoice.appendChild(CustomizationID);
			CustomizationID.appendChild(doc.createTextNode("2.0"));

			Element ID5 = doc.createElementNS("", "cbc:ID");
			invoice.appendChild(ID5);
			//ID5.appendChild(doc.createTextNode(items.getDocu_numero().trim()));
			ID5.appendChild(doc.createTextNode(items.getDocumentNo().trim()));

			Element IssueDate = doc.createElementNS("", "cbc:IssueDate");
			invoice.appendChild(IssueDate);
			String dateFormatted = new SimpleDateFormat("yyyy-MM-dd").format(items.getDateInvoiced());
			//IssueDate.appendChild(doc.createTextNode(items.getDocu_fecha().trim()));
			IssueDate.appendChild(doc.createTextNode(dateFormatted));

			Element InvoiceTypeCode = doc.createElementNS("", "cbc:InvoiceTypeCode");
			InvoiceTypeCode.setAttributeNS(null, listID, items.getInvoiceOperationTypeCode());
			InvoiceTypeCode.setAttributeNS(null, listAgencyName, "PE:SUNAT");
			InvoiceTypeCode.setAttributeNS(null, listName, "Tipo de Documento");
			InvoiceTypeCode.setAttributeNS(null, "name", "Tipo de Operacion");
			InvoiceTypeCode.setAttributeNS(null, listURI, "urn:pe:gob:sunat:cpe:see:gem:catalogos:catalogo01");
			InvoiceTypeCode.setAttributeNS(null, listSchemeURI, "urn:pe:gob:sunat:cpe:see:gem:catalogos:catalogo51");
			invoice.appendChild(InvoiceTypeCode);
			//InvoiceTypeCode.appendChild(doc.createTextNode(items.getDocu_tipodocumento().trim()));//DIFERENCIA ENTRE FAC Y ND Y NC
			InvoiceTypeCode.appendChild(doc.createTextNode(taxdoc.getTaxID()));//DIFERENCIA ENTRE FAC Y ND Y NC

			// Observaciones
			// cbc:Note
			// Leyendas
			// Leyendas
			//leyendas
			for (X_S_DocLegend leyenda : leyendas) {
				Element Legend = doc.createElementNS("", "cbc:Note");
				invoice.appendChild(Legend);
				Legend.setAttributeNS(null, "languageLocaleID", leyenda.getLegend());
				Legend.appendChild(doc.createTextNode("\n"));
				Legend.appendChild(doc.createTextNode(leyenda.gettext().trim()));
				invoice.appendChild(Legend);
			}			

			Element DocumentCurrencyCode = doc.createElementNS("", "cbc:DocumentCurrencyCode");
			invoice.appendChild(DocumentCurrencyCode);
			//DocumentCurrencyCode.appendChild(doc.createTextNode(items.getDocu_moneda().trim()));
			DocumentCurrencyCode.setAttributeNS(null, listID, "ISO 4217 Alpha");
			DocumentCurrencyCode.setAttributeNS(null, listName, "Currency");
			DocumentCurrencyCode.setAttributeNS(null, listAgencyName, "United Nations Economic Commission for Europe");
			DocumentCurrencyCode.appendChild(doc.createTextNode(currency.getISO_Code()));

			//Cantidad de item
			Element LineCount = doc.createElementNS("", "cbc:LineCountNumeric");
			LineCount.appendChild(doc.createTextNode(String.valueOf(detdocelec.size())));
			invoice.appendChild(LineCount);
			//bloque2 cac:Signature--------------------------------------------------------
			Element Signature = doc.createElementNS("", "cac:Signature");
			invoice.appendChild(Signature);
			Signature.appendChild(doc.createTextNode("\n"));
			// ID
			Element ID6 = doc.createElementNS("", "cbc:ID");
			Signature.appendChild(ID6);
			//ID6.appendChild(doc.createTextNode(items.getEmpr_nroruc().trim()));
			ID6.appendChild(doc.createTextNode(p.getTaxID()));

			Element SignatoryParty = doc.createElementNS("", "cac:SignatoryParty");
			Signature.appendChild(SignatoryParty);
			SignatoryParty.appendChild(doc.createTextNode("\n"));

			Element PartyIdentification = doc.createElementNS("", "cac:PartyIdentification");
			SignatoryParty.appendChild(PartyIdentification);
			PartyIdentification.appendChild(doc.createTextNode("\n"));

			//Element ID7 = doc.createElementNS("", "cbc:ID");
			//PartyIdentification.appendChild(ID7);
			//ID7.appendChild(doc.createTextNode(items.getEmpr_nroruc().trim()));
			//ID7.appendChild(doc.createTextNode(p.getTaxID()));

			Element PartyName = doc.createElementNS("", "cac:PartyName");
			SignatoryParty.appendChild(PartyName);
			PartyName.appendChild(doc.createTextNode("\n"));

			//Element Name = doc.createElementNS("", "cbc:Name");
			//PartyName.appendChild(Name);
			//cdata = doc.createCDATASection(items.getEmpr_razonsocial().trim());
			//CDATASection cdata = doc.createCDATASection(p.getName().trim());
			//Name.appendChild(cdata);

			Element DigitalSignatureAttachment = doc.createElementNS("", "cac:DigitalSignatureAttachment");
			Signature.appendChild(DigitalSignatureAttachment);
			DigitalSignatureAttachment.appendChild(doc.createTextNode("\n"));

			Element ExternalReference = doc.createElementNS("", "cac:ExternalReference");
			DigitalSignatureAttachment.appendChild(ExternalReference);
			ExternalReference.appendChild(doc.createTextNode("\n"));

			Element URI = doc.createElementNS("", "cbc:URI");
			ExternalReference.appendChild(URI);
			//URI.appendChild(doc.createTextNode(items.getEmpr_nroruc().trim()));
			//URI.appendChild(doc.createTextNode(p.getTaxID()));
			URI.appendChild(doc.createTextNode("#SignST"));

			//bloque3 cac:AccountingSupplierParty-----------------------------------------

			Element AccountingSupplierParty = doc.createElementNS("", "cac:AccountingSupplierParty");
			invoice.appendChild(AccountingSupplierParty);
			AccountingSupplierParty.appendChild(doc.createTextNode("\n"));

			//Element CustomerAssignedAccountID = doc.createElementNS("", "cbc:CustomerAssignedAccountID");
			//AccountingSupplierParty.appendChild(CustomerAssignedAccountID);
			//CustomerAssignedAccountID.appendChild(doc.createTextNode(items.getEmpr_nroruc().trim()));
			//CustomerAssignedAccountID.appendChild(doc.createTextNode(p.getTaxID().trim()));

			//Element AdditionalAccountID = doc.createElementNS("", "cbc:AdditionalAccountID");
			//AccountingSupplierParty.appendChild(AdditionalAccountID);
			//AdditionalAccountID.appendChild(doc.createTextNode(items.getEmpr_tipodoc().trim()));
			//AdditionalAccountID.appendChild(doc.createTextNode(bpdt.getTaxID()));
			//***********************************************************
			Element Party = doc.createElementNS("", "cac:Party");
			AccountingSupplierParty.appendChild(Party);
			Party.appendChild(doc.createTextNode("\n"));

			Element PartyIdentificationSupplier = doc.createElementNS("", "cac:PartyIdentification");

			Element SupplierId = doc.createElementNS("", "cbc:ID");
			SupplierId.setAttributeNS(null, schemeID, "6");
			SupplierId.setAttributeNS(null, schemeName, "Documento de Identidad");
			SupplierId.setAttributeNS(null, schemeAgencyName, "PE:SUNAT");
			SupplierId.setAttributeNS(null, schemeURI, "urn:pe:gob:sunat:cpe:see:gem:catalogos:catalogo06");
			SupplierId.appendChild(doc.createTextNode(m_bp.getTaxID()));
			PartyIdentificationSupplier.appendChild(SupplierId);
			invoice.appendChild(PartyIdentificationSupplier);

			// Opcional : Nombre comercial del emisor de la boleta  solo en caso de haber sido declarado en la  SUNAT

			//Element	AccountingSupplier = doc.createElementNS("", "cac:AccountingSupplierParty");
			//Element PartySupplier = doc.createElementNS("", "cac:Party");
			//AccountingSupplier.appendChild(PartySupplier);

			Element PartySupplierName = doc.createElementNS("", "cac:PartyName");
			Party.appendChild(PartySupplierName);

			Element SupplierPartyName = doc.createElementNS("", "cbc:Name");
			SupplierPartyName.appendChild(doc.createTextNode("EFACT"));
			PartySupplierName.appendChild(SupplierPartyName);


			invoice.appendChild(AccountingSupplierParty);


			//
			createPartyRegistrationAddress(doc, Party);
			//
			//			Element PartyName1 = doc.createElementNS("", "cac:PartyName");
			//			Party.appendChild(PartyName1);//se anade al grupo party
			//			PartyName1.appendChild(doc.createTextNode("\n"));
			//
			//			Element Name2 = doc.createElementNS("", "cbc:Name");
			//			PartyName1.appendChild(Name2);//se anade al grupo partyname1
			//			//cdata = doc.createCDATASection(items.getEmpr_razonsocial().trim());
			//			CDATASection cdata = doc.createCDATASection(p.getName().trim());
			//			Name2.appendChild(cdata);
			//
			//			Element PostalAddress = doc.createElementNS("", "cac:PostalAddress");
			//			Party.appendChild(PostalAddress);//se anade al grupo party
			//			PostalAddress.appendChild(doc.createTextNode("\n"));
			//
			//			Element ID8 = doc.createElementNS("", "cbc:ID");
			//			PostalAddress.appendChild(ID8);//se anade al grupo PostalAddress
			//			//ID8.appendChild(doc.createTextNode(items.getEmpr_ubigeo().trim()));
			//			ID8.appendChild(doc.createTextNode(city.getLocode().trim()));			
			//
			//			Element StreetName = doc.createElementNS("", "cbc:StreetName");
			//			PostalAddress.appendChild(StreetName);//se anade al grupo PostalAddress
			//			//cdata = doc.createCDATASection(items.getEmpr_direccion().trim());
			//			cdata = doc.createCDATASection(pl.getName().trim());
			//			StreetName.appendChild(cdata);
			//
			//			Element CityName = doc.createElementNS("", "cbc:CityName");
			//			PostalAddress.appendChild(CityName);//se anade al grupo PostalAddress
			//			//cdata = doc.createCDATASection(items.getEmpr_provincia().trim());
			//			cdata = doc.createCDATASection(region.getName().trim());
			//			CityName.appendChild(cdata);
			//
			//			Element CountrySubentity = doc.createElementNS("", "cbc:CountrySubentity");
			//			PostalAddress.appendChild(CountrySubentity);//se anade al grupo PostalAddress
			//			//cdata = doc.createCDATASection(items.getEmpr_departamento().trim());
			//			cdata = doc.createCDATASection(province.getName().trim());
			//			CountrySubentity.appendChild(cdata);
			//
			//			Element District = doc.createElementNS("", "cbc:District");
			//			PostalAddress.appendChild(District);//se anade al grupo PostalAddress
			//			//cdata = doc.createCDATASection(items.getEmpr_distrito().trim());
			//			cdata = doc.createCDATASection(city.getName().trim());
			//			District.appendChild(cdata);
			//
			//			Element Country = doc.createElementNS("", "cac:Country");
			//			PostalAddress.appendChild(Country);//se anade al grupo PostalAddress
			//			Country.appendChild(doc.createTextNode("\n"));
			//
			//			Element IdentificationCode = doc.createElementNS("", "cbc:IdentificationCode");
			//			Country.appendChild(IdentificationCode);//se anade al grupo Country
			//			//cdata = doc.createCDATASection(items.getEmpr_pais().trim());
			//			cdata = doc.createCDATASection(country.getName().trim());
			//			IdentificationCode.appendChild(cdata);
			//
			//			Element PartyLegalEntity = doc.createElementNS("", "cac:PartyLegalEntity");
			//			Party.appendChild(PartyLegalEntity);//se anade al grupo party
			//			PartyLegalEntity.appendChild(doc.createTextNode("\n"));
			//
			//			Element RegistrationName = doc.createElementNS("", "cbc:RegistrationName");
			//			PartyLegalEntity.appendChild(RegistrationName);//se anade al grupo Country
			//			//cdata = doc.createCDATASection(items.getEmpr_razonsocial().trim());
			//			cdata = doc.createCDATASection(p.getName().trim());
			//			RegistrationName.appendChild(cdata);

			createAccountingCustomerParty(doc, invoice);
			// bloque4			

			//			Element RegistrationName = doc.createElementNS("", "cbc:RegistrationName");
			//			RegistrationName.appendChild(doc.createTextNode(p.getName()));
			//			PartyLegalIdentity.appendChild(RegistrationName);
			//			
			//			Element RegistrationAddress = doc.createElementNS("", "cac:RegistrationAddress");
			//			//
			//			Element raCitySubDivision = doc.createElementNS("", "cbc:CitySubdivisionName");
			//			raCitySubDivision.appendChild(doc.createTextNode(""));
			//			PartyRegistrationAddress.appendChild(raCitySubDivision);
			//
			//			//
			//			PartyLegalIdentity.appendChild(RegistrationAddress);
			//
			//			Element CustomerAssignedAccountID1 = doc.createElementNS("", "cbc:CustomerAssignedAccountID");
			//			AccountingCustomerParty.appendChild(CustomerAssignedAccountID1);//se anade al grupo AccountingCustomerParty
			//			//CustomerAssignedAccountID1.appendChild(doc.createTextNode(items.getClie_numero().trim()));
			//			CustomerAssignedAccountID1.appendChild(doc.createTextNode(m_bp.getTaxID().trim()));
			//
			//			Element AdditionalAccountID1 = doc.createElementNS("", "cbc:AdditionalAccountID");
			//			AccountingCustomerParty.appendChild(AdditionalAccountID1);//se anade al grupo AccountingCustomerParty
			//			//AdditionalAccountID1.appendChild(doc.createTextNode(items.getClie_tipodoc().trim()));
			//			AdditionalAccountID1.appendChild(doc.createTextNode(m_bpdt.getTaxID().trim()));
			//			Element Party1 = doc.createElementNS("", "cac:Party");
			//			AccountingCustomerParty.appendChild(Party1);//se anade al grupo AccountingCustomerParty
			//			Party1.appendChild(doc.createTextNode("\n"));
			//
			//			Element PartyLegalEntity1 = doc.createElementNS("", "cac:PartyLegalEntity");
			//			Party1.appendChild(PartyLegalEntity1);//se anade al grupo Party1
			//			PartyLegalEntity1.appendChild(doc.createTextNode("\n"));
			//			Element RegistrationName1 = doc.createElementNS("", "cbc:RegistrationName");
			//			PartyLegalEntity1.appendChild(RegistrationName1);//se anade al grupo PartyLegalEntity1
			//			//cdata = doc.createCDATASection(items.getClie_nombre().trim());
			//			cdata = doc.createCDATASection(m_bp.getName().trim());
			//			RegistrationName1.appendChild(cdata);

			//detalle anticpos			
			//for (DocumentoBean listaAnt : anticipos) {
			for (X_S_DocAdvance listaAnt : anticipos) {
				Element PrepaidPayment = doc.createElementNS("", "cac:PrepaidPayment");
				invoice.appendChild(PrepaidPayment);
				PrepaidPayment.appendChild(doc.createTextNode("\n"));

				Element IDant = doc.createElementNS("", "cbc:ID");
				//IDant.setAttributeNS(null, "schemeID", listaAnt.getDocu_anticipo_docu_tipo().trim());
				IDant.setAttributeNS(null, schemeID, listaAnt.getSchemeID().trim());
				IDant.setIdAttributeNS(null, schemeID, true);
				PrepaidPayment.appendChild(IDant);//se anade al grupo InvoiceLine
				//IDant.appendChild(doc.createTextNode(listaAnt.getDocu_anticipo_docu_numero().trim()));
				IDant.appendChild(doc.createTextNode(listaAnt.getDocumentNo()));

				MCurrency advancecurrency = new Query(Env.getCtx(), MCurrency.Table_Name, "C_Currency_ID = ?", null)
						.setParameters(listaAnt.getC_Currency_ID()).first();

				Element PaidAmount = doc.createElementNS("", "cbc:PaidAmount");
				//PaidAmount.setAttributeNS(null, "currencyID", items.getDocu_moneda().trim());
				PaidAmount.setAttributeNS(null, currencyID, advancecurrency.getISO_Code());
				PaidAmount.setIdAttributeNS(null, currencyID, true);
				PrepaidPayment.appendChild(PaidAmount);
				//PaidAmount.appendChild(doc.createTextNode(listaAnt.getDocu_anticipo_prepago().trim()));
				PaidAmount.appendChild(doc.createTextNode(listaAnt.getAmount().toString().trim()));

				Element InstructionID = doc.createElementNS("", "cbc:InstructionID");
				//InstructionID.setAttributeNS(null, "schemeID", listaAnt.getDocu_anticipo_tipo_docu_emi().trim());
				Calendar cal = Calendar.getInstance();
				cal.setTime(listaAnt.getDateAcct());
				int hour = cal.get(Calendar.HOUR);
				int minute = cal.get(Calendar.MINUTE);
				//InstructionID.setAttributeNS(null, "schemeID", listaAnt.getdocu_anticipo_fecha_emi().trim());
				InstructionID.setAttributeNS(null, schemeID, listaAnt.getDateAcct().toString());
				InstructionID.setIdAttributeNS(null, schemeID, true);
				PrepaidPayment.appendChild(InstructionID);//se anade al grupo InvoiceLine
				//InstructionID.appendChild(doc.createTextNode(listaAnt.getDocu_anticipo_numero_docu_emi().trim()));
				InstructionID.appendChild(doc.createTextNode(String.format("%s:%s", hour, minute)));
			}

			//bloque 5 IGV
			//if (!"0.00".equals(items.getDocu_igv().trim())) {
			if (items.getTaxSAmt().compareTo(BigDecimal.ZERO) > 0) {

				Element TaxTotal = doc.createElementNS("", "cac:TaxTotal");
				invoice.appendChild(TaxTotal);				
				TaxTotal.appendChild(doc.createTextNode("\n"));

				Element TaxAmount = doc.createElementNS("", "cbc:TaxAmount");
				//TaxAmount.setAttributeNS(null, "currencyID", items.getDocu_moneda().trim());
				TaxAmount.setAttributeNS(null, currencyID, currency.getISO_Code());
				TaxAmount.setIdAttributeNS(null, currencyID, true);
				TaxTotal.appendChild(TaxAmount);//se anade al grupo TaxTotal
				//TaxAmount.appendChild(doc.createTextNode(items.getDocu_igv().trim()));
				TaxAmount.appendChild(doc.createTextNode(items.getTaxSAmt().toString()));

				Element TaxSubtotal = doc.createElementNS("", "cac:TaxSubtotal");
				TaxTotal.appendChild(TaxSubtotal);//se anade al grupo TaxTotal
				TaxSubtotal.appendChild(doc.createTextNode("\n"));
				
				Element TaxableAmount = doc.createElementNS("", "cbc:TaxableAmount");
				TaxableAmount.setAttributeNS(null, currencyID, currency.getISO_Code());
				TaxableAmount.appendChild(doc.createTextNode(items.getTaxBaseAmt().toString()));
				TaxSubtotal.appendChild(TaxableAmount);

				Element TaxAmount1 = doc.createElementNS("", "cbc:TaxAmount");
				//TaxAmount1.setAttributeNS(null, "currencyID", items.getDocu_moneda().trim());
				TaxAmount1.setAttributeNS(null, currencyID, currency.getISO_Code());
				TaxAmount1.setIdAttributeNS(null, currencyID, true);
				TaxSubtotal.appendChild(TaxAmount1);//se anade al grupo TaxSubtotal
				//TaxAmount1.appendChild(doc.createTextNode(items.getDocu_igv().trim()));
				TaxAmount1.appendChild(doc.createTextNode(items.getTaxSAmt().toString()));

				Element TaxCategory = doc.createElementNS("", "cac:TaxCategory");
				TaxSubtotal.appendChild(TaxCategory);//se anade al grupo TaxSubtotal
				TaxCategory.appendChild(doc.createTextNode("\n"));

				Element TaxScheme = doc.createElementNS("", "cac:TaxScheme");
				TaxCategory.appendChild(TaxScheme);//se anade al grupo TaxCategory
				TaxScheme.appendChild(doc.createTextNode("\n"));

				Element ID9 = doc.createElementNS("", "cbc:ID");
				ID9.setAttributeNS(null, schemeAgencyName, "PE:SUNAT");
				ID9.setAttributeNS(null, schemeName, "Codigo de tributos");
				ID9.setAttributeNS(null, schemeURI, "urn:pe:gob:sunat:cpe:see:gem:catalogos:catalogo05");
				TaxScheme.appendChild(ID9);//se anade al grupo TaxScheme
				ID9.appendChild(doc.createTextNode("1000")); ///================================faltaba poner 1000

				Element Name3 = doc.createElementNS("", "cbc:Name");
				TaxScheme.appendChild(Name3);//se anade al grupo TaxScheme
				Name3.appendChild(doc.createTextNode("IGV"));

				Element TaxTypeCode = doc.createElementNS("", "cbc:TaxTypeCode");
				TaxScheme.appendChild(TaxTypeCode);//se anade al grupo TaxScheme
				TaxTypeCode.appendChild(doc.createTextNode("VAT"));
			}
			//bloque 6 ISC
			//if (!"0.00".equals(items.getDocu_isc().trim())) {
			if (items.getdocu_isc().compareTo(BigDecimal.ZERO) != 0) {

				Element TaxTotal = doc.createElementNS("", "cac:TaxTotal");
				invoice.appendChild(TaxTotal);
				TaxTotal.appendChild(doc.createTextNode("\n"));

			
				Element TaxAmount = doc.createElementNS("", "cbc:TaxAmount");
				//TaxAmount.setAttributeNS(null, "currencyID", items.getDocu_moneda().trim());
				TaxAmount.setAttributeNS(null, currencyID, currency.getISO_Code());
				TaxAmount.setIdAttributeNS(null, currencyID, true);
				TaxTotal.appendChild(TaxAmount);//se anade al grupo TaxTotal
				TaxAmount.appendChild(doc.createTextNode(items.getdocu_isc().toString().trim()));

				Element TaxSubtotal = doc.createElementNS("", "cac:TaxSubtotal");
				TaxTotal.appendChild(TaxSubtotal);//se anade al grupo TaxTotal
				TaxSubtotal.appendChild(doc.createTextNode("\n"));

				Element TaxableAmount = doc.createElementNS("", "cbc:TaxableAmount");
				TaxableAmount.setAttributeNS(null, currencyID, currency.getISO_Code());
				TaxableAmount.appendChild(doc.createTextNode(items.getdocu_isc().toString()));
				TaxSubtotal.appendChild(TaxableAmount);

				
				Element TaxAmount1 = doc.createElementNS("", "cbc:TaxAmount");
				//TaxAmount1.setAttributeNS(null, "currencyID", items.getDocu_moneda().trim());
				TaxAmount1.setAttributeNS(null, currencyID, currency.getISO_Code());
				TaxAmount1.setIdAttributeNS(null, currencyID, true);
				TaxSubtotal.appendChild(TaxAmount1);//se anade al grupo TaxSubtotal
				TaxAmount1.appendChild(doc.createTextNode(items.getdocu_isc().toString().trim()));

				Element TaxCategory = doc.createElementNS("", "cac:TaxCategory");
				TaxSubtotal.appendChild(TaxCategory);//se anade al grupo TaxSubtotal
				TaxCategory.appendChild(doc.createTextNode("\n"));

				Element TaxScheme = doc.createElementNS("", "cac:TaxScheme");
				TaxCategory.appendChild(TaxScheme);//se anade al grupo TaxCategory
				TaxScheme.appendChild(doc.createTextNode("\n"));

				Element ID9 = doc.createElementNS("", "cbc:ID");
				TaxScheme.appendChild(ID9);//se anade al grupo TaxScheme
				ID9.appendChild(doc.createTextNode("2000")); ///================================faltaba poner 1000

				Element Name3 = doc.createElementNS("", "cbc:Name");
				TaxScheme.appendChild(Name3);//se anade al grupo TaxScheme
				Name3.appendChild(doc.createTextNode("ISC"));

				Element TaxTypeCode = doc.createElementNS("", "cbc:TaxTypeCode");
				TaxScheme.appendChild(TaxTypeCode);//se anade al grupo TaxScheme
				TaxTypeCode.appendChild(doc.createTextNode("EXC"));
			}
			//bloque 7     
			Element LegalMonetaryTotal = doc.createElementNS("", "cac:LegalMonetaryTotal");
			invoice.appendChild(LegalMonetaryTotal);
			LegalMonetaryTotal.appendChild(doc.createTextNode("\n"));

			// Anticipo total
			//if (!items.getDocu_anticipo_total().equals("0.00")) {
			if (items.getTotalAdvanceAmount().compareTo(BigDecimal.ZERO) != 0) {
				Element PrepaidAmount = doc.createElementNS("", "cbc:PrepaidAmount");
				//PrepaidAmount.setAttributeNS(null, "currencyID", items.getDocu_moneda().trim());
				PrepaidAmount.setAttributeNS(null, currencyID, currency.getISO_Code());
				PrepaidAmount.setIdAttributeNS(null, currencyID, true);
				LegalMonetaryTotal.appendChild(PrepaidAmount);
				//PrepaidAmount.appendChild(doc.createTextNode(items.getDocu_anticipo_total().trim()));
				PrepaidAmount.appendChild(doc.createTextNode(items.getTotalAdvanceAmount().toString()));
			}

			//if (!items.getDocu_descuento().equals("0.00")) {
//			if (items.getDiscount().compareTo(BigDecimal.ZERO) != 0) {
//				Element AllowanceTotalAmount = doc.createElementNS("", "cbc:AllowanceTotalAmount");
//				//AllowanceTotalAmount.setAttributeNS(null, "currencyID", items.getDocu_moneda().trim());
//				AllowanceTotalAmount.setAttributeNS(null, currencyID, currency.getISO_Code());
//				AllowanceTotalAmount.setIdAttributeNS(null, currencyID, true);
//				LegalMonetaryTotal.appendChild(AllowanceTotalAmount);//se anade al grupo LegalMonetaryTotal
//				//AllowanceTotalAmount.appendChild(doc.createTextNode(items.getDocu_descuento().trim()));
//				AllowanceTotalAmount.appendChild(doc.createTextNode(items.getDiscount().toString()));
//			}
			// 54. Importe total del comprobante
			Element PayableAmount = doc.createElementNS("", "cbc:PayableAmount");
			//PayableAmount.setAttributeNS(null, "currencyID", items.getDocu_moneda().trim());
			PayableAmount.setAttributeNS(null, currencyID, currency.getISO_Code());
			PayableAmount.setIdAttributeNS(null, currencyID, true);
			LegalMonetaryTotal.appendChild(PayableAmount);//se anade al grupo LegalMonetaryTotal
			//PayableAmount.appendChild(doc.createTextNode(items.getDocu_total().trim()));
			PayableAmount.appendChild(doc.createTextNode(items.getGrandTotal().toString()));
			
			// 55. Total valor de la venta
			Element LineExtensionAmount = doc.createElementNS("", "cbc:LineExtensionAmount");
			LineExtensionAmount.setAttributeNS(null, currencyID, currency.getISO_Code());
			LineExtensionAmount.appendChild(doc.createTextNode(items.getGrandTotal().toString()));
			LegalMonetaryTotal.appendChild(LineExtensionAmount);
			
			// 56. Total precio de venta
			Element TaxInclusiveAmount = doc.createElementNS("", "cbc:TaxInclusiveAmount");
			TaxInclusiveAmount.setAttributeNS(null, currencyID, currency.getISO_Code());
			TaxInclusiveAmount.appendChild(doc.createTextNode(items.getGrandTotal().toString()));
			LegalMonetaryTotal.appendChild(TaxInclusiveAmount);
			
			//detalle factura
			log.info("generarXMLZipiadoBoleta - Iniciamos detalle XML ");
			//for (DocumentoBean listaDet : detdocelec) {
			for (X_S_DocLine listaDet : detdocelec) {
				MTax tax = new Query(Env.getCtx(), MTax.Table_Name, "C_Tax_ID = ?", null)
						.setParameters(listaDet.getC_Tax_ID()).first();
				MProduct product = new Query(Env.getCtx(), MProduct.Table_Name, "M_Product_ID = ?", null)
						.setParameters(listaDet.getM_Product_ID()).first();
				MUOM uom = MUOM.get(Env.getCtx(), listaDet.getC_UOM_ID());				
				Element InvoiceLine = doc.createElementNS("", "cac:InvoiceLine");
				invoice.appendChild(InvoiceLine);
				InvoiceLine.appendChild(doc.createTextNode("\n"));

				Element ID11 = doc.createElementNS("", "cbc:ID");
				InvoiceLine.appendChild(ID11);//se anade al grupo InvoiceLine
				//ID11.appendChild(doc.createTextNode(listaDet.getItem_orden().trim()));
				ID11.appendChild(doc.createTextNode(String.valueOf(listaDet.getSeqNo())));

				Element Note = doc.createElementNS("", "cbc:Note");
				Note.appendChild(doc.createTextNode(uom.getName()));
				InvoiceLine.appendChild(Note);

				Element InvoicedQuantity = doc.createElementNS("", "cbc:InvoicedQuantity");
				//InvoicedQuantity.setAttributeNS(null, "unitCode", listaDet.getItem_unidad().trim());
				InvoicedQuantity.setAttributeNS(null, "unitCode", uom.getUOMSymbol());
				InvoicedQuantity.setIdAttributeNS(null, "unitCode", true);

				InvoiceLine.appendChild(InvoicedQuantity);//se anade al grupo InvoiceLine
				//InvoicedQuantity.appendChild(doc.createTextNode(listaDet.getItem_cantidad().trim()));
				InvoicedQuantity.appendChild(doc.createTextNode(listaDet.getQty().toString()));

				Element LineExtensionAmount1 = doc.createElementNS("", "cbc:LineExtensionAmount");
				//LineExtensionAmount1.setAttributeNS(null, "currencyID", listaDet.getItem_moneda().trim());
				LineExtensionAmount1.setAttributeNS(null, currencyID, currency.getISO_Code());
				LineExtensionAmount1.setIdAttributeNS(null, currencyID, true);

				InvoiceLine.appendChild(LineExtensionAmount1);//se anade al grupo InvoiceLine
				//LineExtensionAmount1.appendChild(doc.createTextNode(listaDet.getItem_ti_subtotal().trim()));
				LineExtensionAmount1.appendChild(doc.createTextNode(listaDet.getsubtotal().toString().trim()));

				Element PricingReference = doc.createElementNS("", "cac:PricingReference");
				InvoiceLine.appendChild(PricingReference);//se anade al grupo InvoiceLine

				PricingReference.appendChild(doc.createTextNode("\n"));

				Element AlternativeConditionPrice = doc.createElementNS("", "cac:AlternativeConditionPrice");
				PricingReference.appendChild(AlternativeConditionPrice);//se anade al grupo PricingReference
				AlternativeConditionPrice.appendChild(doc.createTextNode("\n"));

				Element PriceAmount = doc.createElementNS("", "cbc:PriceAmount");
				//PriceAmount.setAttributeNS(null, "currencyID", listaDet.getItem_moneda().trim());
				PriceAmount.setAttributeNS(null, currencyID, currency.getISO_Code());
				PriceAmount.setIdAttributeNS(null, currencyID, true);
				AlternativeConditionPrice.appendChild(PriceAmount);//se anade al grupo AlternativeConditionPrice
				//PriceAmount.appendChild(doc.createTextNode(listaDet.getItem_pventa().trim())); // el precio unitario de venta de ser con los impuestos y deducciones de descuentos
				PriceAmount.appendChild(doc.createTextNode(listaDet.getTaxBaseAmt().toString())); // el precio unitario de venta de ser con los impuestos y deducciones de descuentos

				Element PriceTypeCode = doc.createElementNS("", "cbc:PriceTypeCode");
				AlternativeConditionPrice.appendChild(PriceTypeCode);//se anade al grupo AlternativeConditionPrice
				AlternativeConditionPrice.setAttributeNS(null, listName, "Tipo de Precio");
				AlternativeConditionPrice.setAttributeNS(null, listAgencyName, "PE:SUNAT");
				AlternativeConditionPrice.setAttributeNS(null, listURI, "urn:pe:gob:sunat:cpe:see:gem:catalogos:catalogo16");
				PriceTypeCode.appendChild(doc.createTextNode("01")); //=================================>Faltaba especificar ite
				//
				// Punto 33
				//          Inicio IGV item
				Element TaxTotal1 = doc.createElementNS("", "cac:TaxTotal");
				InvoiceLine.appendChild(TaxTotal1);//se anade al grupo InvoiceLine
				TaxTotal1.appendChild(doc.createTextNode("\n"));

				log.info("generarXMLZipiadoFactura - IGV ");
				Element TaxAmount2 = doc.createElementNS("", "cbc:TaxAmount");
				//TaxAmount2.setAttributeNS(null, "currencyID", listaDet.getItem_moneda().trim());
				TaxAmount2.setAttributeNS(null, currencyID, currency.getISO_Code());
				TaxAmount2.setIdAttributeNS(null, currencyID, true);
				TaxTotal1.appendChild(TaxAmount2);//se anade al grupo TaxTotal1
				//TaxAmount2.appendChild(doc.createTextNode(listaDet.getItem_ti_igv().trim()));
				TaxAmount2.appendChild(doc.createTextNode(listaDet.gettaxamount().toString()));

				Element TaxSubtotal1 = doc.createElementNS("", "cac:TaxSubtotal");
				TaxTotal1.appendChild(TaxSubtotal1);//se anade al grupo TaxTotal1
				TaxSubtotal1.appendChild(doc.createTextNode("\n"));				
				//if (!listaDet.getItem_pventa_nohonerosa().equals("0.00")) {
				//				if (product.getPriceTypeCode().equals(REF_PriceTypeCode.ValorReferencialUnitarioEnOperacionesNoOnerosas)) {
				//					Element AlternativeConditionPrice02 = doc.createElementNS("", "cac:AlternativeConditionPrice");
				//					PricingReference.appendChild(AlternativeConditionPrice02);//se anade al grupo PricingReference
				//					AlternativeConditionPrice02.appendChild(doc.createTextNode("\n"));
				//
				//					Element PriceAmount02 = doc.createElementNS("", "cbc:PriceAmount");
				//					//PriceAmount02.setAttributeNS(null, "currencyID", listaDet.getItem_moneda().trim());
				//					PriceAmount02.setAttributeNS(null, "currencyID", currency.getISO_Code());
				//					PriceAmount02.setIdAttributeNS(null, "currencyID", true);
				//					AlternativeConditionPrice02.appendChild(PriceAmount02);//se anade al grupo AlternativeConditionPrice
				//					//PriceAmount02.appendChild(doc.createTextNode(listaDet.getItem_pventa_nohonerosa().trim()));
				//					PriceAmount02.appendChild(doc.createTextNode(listaDet.getventa_noonerosa().toString()));
				//
				//					Element PriceTypeCode02 = doc.createElementNS("", "cbc:PriceTypeCode");
				//					AlternativeConditionPrice02.appendChild(PriceTypeCode02);//se anade al grupo AlternativeConditionPrice
				//					PriceTypeCode02.appendChild(doc.createTextNode("02")); //==>Para los casos de gatuito venta no Honerosa
				//				}


				//            log.info("generarXMLZipiadoFactura - sub total ");
				//            Element TaxableAmount = doc.createElementNS("", "cbc:TaxableAmount");
				//            TaxableAmount.setAttributeNS(null, "currencyID", listaDet.getItem_moneda().trim());
				//            TaxableAmount.setIdAttributeNS(null, "currencyID", true);
				//
				//            TaxSubtotal1.appendChild(TaxableAmount);//se anade al grupo TaxSubtotal1
				//            //TaxableAmount.appendChild(doc.createTextNode(listaDet.getItem_ti_igv().trim()));
				//            TaxableAmount.appendChild(doc.createTextNode(listaDet.getItem_ti_subtotal().trim()));// Oswaldo
				//IGV
				//log.info("generarXMLZipiadoFactura - tasa Igv ");
				// 35 Monto ISC del item
				if (product.getPriceTypeCode().equals(REF_PriceTypeCode.ValorReferencialUnitarioEnOperacionesNoOnerosas)) {
					Element TaxableAmount = doc.createElementNS("", "cbc:TaxableAmount");					
					TaxableAmount.setAttributeNS(null, currencyID, currency.getISO_Code()); 
					TaxableAmount.appendChild(doc.createTextNode(listaDet.getTaxBaseAmt().toString()));
					TaxSubtotal1.appendChild(TaxableAmount);

					Element TaxAmount3 = doc.createElementNS("", "cbc:TaxAmount");
					TaxAmount3.setAttributeNS(null, currencyID, currency.getISO_Code()); //================>errror estaba con item..getItem_moneda()
					TaxAmount3.setIdAttributeNS(null, currencyID, true);
					TaxAmount3.appendChild(doc.createTextNode(listaDet.gettaxamount().toString()));
					TaxSubtotal1.appendChild(TaxAmount3);

					Element TaxCategory1 = doc.createElementNS("", "cac:TaxCategory");

					Element Percent = doc.createElementNS("", "cbc:Percent");					
					Percent.appendChild(doc.createTextNode(listaDet.gettaxrate().toString()));
					TaxCategory1.appendChild(Percent);

					Element TierRange = doc.createElementNS("", "cbc:TierRange");
					TierRange.appendChild(doc.createTextNode(orginfo.getTierRange()));
					TaxCategory1.appendChild(TierRange);										

					Element TaxScheme1 = doc.createElementNS("", "cac:TaxScheme");
					TaxCategory1.appendChild(TaxScheme1);//se anade al grupo TaxCategory1
					TaxScheme1.appendChild(doc.createTextNode("\n"));

					Element ID15 = doc.createElementNS("", "cbc:ID");
					ID15.setAttributeNS(null, schemeAgencyName, "PE:SUNAT");
					ID15.setAttributeNS(null, schemeName, "Codigo de tributos");
					ID15.setAttributeNS(null, schemeURI, "urn:pe:gob:sunat:cpe:see:gem:catalogos:catalogo05");
					TaxScheme1.appendChild(ID15);//se anade al grupo TaxCategory1

					Element Name9 = doc.createElementNS("", "cbc:Name");
					TaxScheme1.appendChild(Name9);//se anade al grupo TaxCategory1
					Name9.appendChild(doc.createTextNode("ISC"));

					Element TaxTypeCode = doc.createElementNS("", "cbc:TaxTypeCode");
					TaxScheme1.appendChild(TaxTypeCode);//se anade al grupo TaxScheme
					TaxTypeCode.appendChild(doc.createTextNode("EXC"));


					Element TaxExemptionReasonCode = doc.createElementNS("", "cbc:TaxExemptionReasonCode");
					TaxCategory1.appendChild(TaxExemptionReasonCode);//se anade al grupo TaxCategory1					
					//TaxExemptionReasonCode.appendChild(doc.createTextNode(listaDet.getItem_afectacion().trim()));
					TaxExemptionReasonCode.setAttributeNS(null, listAgencyName, "PE:SUNAT");
					TaxExemptionReasonCode.setAttributeNS(null, listName, "Afectacion del IGV");
					TaxExemptionReasonCode.setAttributeNS(null, listURI, "urn:pe:gob:sunat:cpe:see:gem:catalogos:catalogo07");					
					TaxExemptionReasonCode.appendChild(doc.createTextNode("10"));

					TaxSubtotal1.appendChild(TaxCategory1);//se anade al grupo TaxSubtotal1
					// punto 38 Valor de venta del item
					Element lineextensionamount = doc.createElementNS("", "cbc:LineExtensionAmount");
					lineextensionamount.setAttributeNS(null, currencyID,currency.getISO_Code());
					lineextensionamount.appendChild(doc.createTextNode(listaDet.getLineTotalAmt().toString()));
					InvoiceLine.appendChild(lineextensionamount);
					// punto 40 Monto cargo del item
					if (items.getDiscount().compareTo(BigDecimal.ZERO) > 0) {
						Element allowanceCharge = doc.createElementNS("", "cac:Allowancecharge");
						InvoiceLine.appendChild(allowanceCharge);
						Element chargeindicator = doc.createElementNS("", "cbc:ChargeIndicator");
						chargeindicator.appendChild(doc.createTextNode("true"));
						Element AllowanceChargeReasonCode = doc.createElementNS("", "cbc:AllowanceChargeReasonCode");
						AllowanceChargeReasonCode.setAttributeNS(null, listAgencyName, "PE:SUNAT");
						AllowanceChargeReasonCode.setAttributeNS(null, listName, "Cargo/descuento");
						AllowanceChargeReasonCode.setAttributeNS(null, listURI, "urn:pe:gob:sunat.cpe:see:gem:catalogos:catalogo53");
						// 48 Cargos que no afectan la base imponible del IGV/IVAP
						AllowanceChargeReasonCode.appendChild(doc.createTextNode("48"));
						Element MultiplierFactorNumeric = doc.createElementNS("", "cbc:MultiplierFactorNumeric");
						Element Amount = doc.createElementNS("", "cbc:Amount");
						Element BaseAmount = doc.createElementNS("", "cbc:BaseAmount");
						allowanceCharge.appendChild(chargeindicator);
						allowanceCharge.appendChild(AllowanceChargeReasonCode);
						allowanceCharge.appendChild(MultiplierFactorNumeric);
						allowanceCharge.appendChild(Amount);
						allowanceCharge.appendChild(BaseAmount);
					}

				}
				//1000 
				else if (items.getTaxSAmt().compareTo(BigDecimal.ZERO) > 0) {
					Element TaxableAmount = doc.createElementNS("", "cbc:TaxableAmount");
					TaxableAmount.setAttributeNS(null, "currencyID", currency.getISO_Code()); 
					TaxableAmount.appendChild(doc.createTextNode(listaDet.getTaxBaseAmt().toString()));
					Element TaxAmount3 = doc.createElementNS("", "cbc:TaxAmount");
					//TaxAmount3.setAttributeNS(null, "currencyID", listaDet.getItem_moneda().trim()); //================>errror estaba con item..getItem_moneda()
					TaxAmount3.setAttributeNS(null, currencyID, currency.getISO_Code()); //================>errror estaba con item..getItem_moneda()
					TaxAmount3.setIdAttributeNS(null, currencyID, true);
					TaxSubtotal1.appendChild(TaxableAmount);
					TaxSubtotal1.appendChild(TaxAmount3);//se anade al grupo TaxSubtotal1
					//TaxAmount3.appendChild(doc.createTextNode(listaDet.getItem_ti_igv().trim()));
					TaxAmount3.appendChild(doc.createTextNode(listaDet.gettaxamount().toString()));

					log.info("generarXMLZipiadoFactura - tasa Igv ");
					Element Percent = doc.createElementNS("", "cbc:Percent");
					//TaxSubtotal1.appendChild(Percent);//se anade al grupo TaxSubtotal1
					//Percent.appendChild(doc.createTextNode("0.0"));
					//Percent.appendChild(doc.createTextNode(items.getTasa_igv().trim()));				
					Percent.appendChild(doc.createTextNode(listaDet.gettaxrate().toString()));

					Element TaxCategory1 = doc.createElementNS("", "cac:TaxCategory");
					TaxSubtotal1.appendChild(TaxCategory1);//se anade al grupo TaxSubtotal1
					// punto 38 Valor de venta del item
					Element lineextensionamount = doc.createElementNS("", "cbc:LineExtensionAmount");
					lineextensionamount.setAttributeNS(null, currencyID,currency.getISO_Code());
					lineextensionamount.appendChild(doc.createTextNode(listaDet.getLineTotalAmt().toString()));
					InvoiceLine.appendChild(lineextensionamount);

					TaxCategory1.appendChild(Percent);
					TaxCategory1.appendChild(doc.createTextNode("\n"));

					Element TaxExemptionReasonCode = doc.createElementNS("", "cbc:TaxExemptionReasonCode");
					TaxCategory1.appendChild(TaxExemptionReasonCode);//se anade al grupo TaxCategory1					
					//TaxExemptionReasonCode.appendChild(doc.createTextNode(listaDet.getItem_afectacion().trim()));
					TaxExemptionReasonCode.setAttributeNS(null, listAgencyName, "PE:SUNAT");
					TaxExemptionReasonCode.setAttributeNS(null, listName, "Afectacion del IGV");
					TaxExemptionReasonCode.setAttributeNS(null, listURI, "urn:pe:gob:sunat:cpe:see:gem:catalogos:catalogo07");					
					TaxExemptionReasonCode.appendChild(doc.createTextNode("10"));

					TaxSubtotal1.appendChild(TaxCategory1);//se anade al grupo TaxSubtotal1

					// punto 40 Monto cargo del item
					if (items.getDiscount().compareTo(BigDecimal.ZERO) > 0) {
						Element allowanceCharge = doc.createElementNS("", "cac:Allowancecharge");
						InvoiceLine.appendChild(allowanceCharge);
						Element chargeindicator = doc.createElementNS("", "cbc:ChargeIndicator");
						chargeindicator.appendChild(doc.createTextNode("true"));
						Element AllowanceChargeReasonCode = doc.createElementNS("", "cbc:AllowanceChargeReasonCode");
						AllowanceChargeReasonCode.setAttributeNS(null, listAgencyName, "PE:SUNAT");
						AllowanceChargeReasonCode.setAttributeNS(null, listName, "Cargo/descuento");
						AllowanceChargeReasonCode.setAttributeNS(null, listURI, "urn:pe:gob:sunat.cpe:see:gem:catalogos:catalogo53");
						// 47 Cargos que afectan la base imponible del IGV/IVAP
						AllowanceChargeReasonCode.appendChild(doc.createTextNode("47"));
						Element MultiplierFactorNumeric = doc.createElementNS("", "cbc:MultiplierFactorNumeric");
						Element Amount = doc.createElementNS("", "cbc:Amount");
						Element BaseAmount = doc.createElementNS("", "cbc:BaseAmount");
						allowanceCharge.appendChild(chargeindicator);
						allowanceCharge.appendChild(AllowanceChargeReasonCode);
						allowanceCharge.appendChild(MultiplierFactorNumeric);
						allowanceCharge.appendChild(Amount);
						allowanceCharge.appendChild(BaseAmount);
					}



					//            Element ID12 = doc.createElementNS("", "cbc:ID");
					//            TaxCategory1.appendChild(ID12);//se anade al grupo TaxCategory1
					//            ID12.appendChild(doc.createTextNode("VAT"));
					//log.info("generarXMLZipiadoFactura - afectacion ");					
					Element TaxScheme1 = doc.createElementNS("", "cac:TaxScheme");
					TaxCategory1.appendChild(TaxScheme1);//se anade al grupo TaxCategory1
					TaxScheme1.appendChild(doc.createTextNode("\n"));

					Element ID15 = doc.createElementNS("", "cbc:ID");
					ID15.setAttributeNS(null, schemeAgencyName, "PE:SUNAT");
					ID15.setAttributeNS(null, schemeName, "Codigo de tributos");
					ID15.setAttributeNS(null, schemeURI, "urn:pe:gob:sunat:cpe:see:gem:catalogos:catalogo05");
					ID15.appendChild(doc.createTextNode("1000")); ///================================faltaba poner 1000
					TaxScheme1.appendChild(ID15);//se anade al grupo TaxCategory1


					Element Name9 = doc.createElementNS("", "cbc:Name");
					TaxScheme1.appendChild(Name9);//se anade al grupo TaxCategory1
					Name9.appendChild(doc.createTextNode("IGV"));

					Element TaxTypeCode = doc.createElementNS("", "cbc:TaxTypeCode");
					TaxScheme1.appendChild(TaxTypeCode);//se anade al grupo TaxScheme
					TaxTypeCode.appendChild(doc.createTextNode("VAT"));					
				}
				//9995 - exportacion 
				else if (items.getTaxGAmt().compareTo(BigDecimal.ZERO) > 0) {
					//TaxExemptionReasonCode.appendChild(doc.createTextNode("40"));
				} 
				//9998 - inafecto
				else if (items.getTaxOAmt().compareTo(BigDecimal.ZERO) > 0) {
					//TaxExemptionReasonCode.appendChild(doc.createTextNode("30"));
				}
				//9997 - exonerado
				else if (items.getTaxEAmt().compareTo(BigDecimal.ZERO) > 0) {
					//TaxExemptionReasonCode.appendChild(doc.createTextNode("20"));
				}
				//9996 - gratuito
				else if (items.getTaxZAmt().compareTo(BigDecimal.ZERO) > 0) {
					//TaxExemptionReasonCode.appendChild(doc.createTextNode("17"));
				}
				//9999 - otros tributos
				else if (items.getTaxTAmt().compareTo(BigDecimal.ZERO) != 0) {
					Element TaxableAmount = doc.createElementNS("", "cbc:TaxableAmount");
					TaxableAmount.setAttributeNS(null, currencyID, currency.getISO_Code()); 
					TaxableAmount.appendChild(doc.createTextNode(listaDet.getTaxTBaseAmt().toString()));
					Element TaxAmount3 = doc.createElementNS("", "cbc:TaxAmount");
					//TaxAmount3.setAttributeNS(null, "currencyID", listaDet.getItem_moneda().trim()); //================>errror estaba con item..getItem_moneda()
					TaxAmount3.setAttributeNS(null, currencyID, currency.getISO_Code()); //================>errror estaba con item..getItem_moneda()
					TaxAmount3.setIdAttributeNS(null, currencyID, true);
					TaxSubtotal1.appendChild(TaxableAmount);
					TaxSubtotal1.appendChild(TaxAmount3);//se anade al grupo TaxSubtotal1
					//TaxAmount3.appendChild(doc.createTextNode(listaDet.getItem_ti_igv().trim()));
					TaxAmount3.appendChild(doc.createTextNode(listaDet.getTaxTAmt().toString()));

					log.info("generarXMLZipiadoFactura - tasa Igv ");
					Element Percent = doc.createElementNS("", "cbc:Percent");
					//TaxSubtotal1.appendChild(Percent);//se anade al grupo TaxSubtotal1
					//Percent.appendChild(doc.createTextNode("0.0"));
					//Percent.appendChild(doc.createTextNode(items.getTasa_igv().trim()));				
					Percent.appendChild(doc.createTextNode(listaDet.gettaxrate().toString()));

					Element TaxCategory1 = doc.createElementNS("", "cac:TaxCategory");
					TaxSubtotal1.appendChild(TaxCategory1);//se anade al grupo TaxSubtotal1
					TaxCategory1.appendChild(Percent);
					TaxCategory1.appendChild(doc.createTextNode("\n"));								
					TaxSubtotal1.appendChild(TaxCategory1);//se anade al grupo TaxSubtotal1

					// punto 40 Monto cargo del item
					if (items.getDiscount().compareTo(BigDecimal.ZERO) > 0) {
						Element allowanceCharge = doc.createElementNS("", "cac:Allowancecharge");
						InvoiceLine.appendChild(allowanceCharge);
						Element chargeindicator = doc.createElementNS("", "cbc:ChargeIndicator");
						chargeindicator.appendChild(doc.createTextNode("true"));
						Element AllowanceChargeReasonCode = doc.createElementNS("", "cbc:AllowanceChargeReasonCode");
						AllowanceChargeReasonCode.setAttributeNS(null, listAgencyName, "PE:SUNAT");
						AllowanceChargeReasonCode.setAttributeNS(null, listName, "Cargo/descuento");
						AllowanceChargeReasonCode.setAttributeNS(null, listURI, "urn:pe:gob:sunat.cpe:see:gem:catalogos:catalogo53");
						// 47 Cargos que afectan la base imponible del IGV/IVAP
						AllowanceChargeReasonCode.appendChild(doc.createTextNode("47"));
						Element MultiplierFactorNumeric = doc.createElementNS("", "cbc:MultiplierFactorNumeric");
						Element Amount = doc.createElementNS("", "cbc:Amount");
						Element BaseAmount = doc.createElementNS("", "cbc:BaseAmount");
						allowanceCharge.appendChild(chargeindicator);
						allowanceCharge.appendChild(AllowanceChargeReasonCode);
						allowanceCharge.appendChild(MultiplierFactorNumeric);
						allowanceCharge.appendChild(Amount);
						allowanceCharge.appendChild(BaseAmount);
					}


					Element TaxScheme1 = doc.createElementNS("", "cac:TaxScheme");
					TaxCategory1.appendChild(TaxScheme1);//se anade al grupo TaxCategory1
					TaxScheme1.appendChild(doc.createTextNode("\n"));

					Element ID15 = doc.createElementNS("", "cbc:ID");
					ID15.setAttributeNS(null, schemeAgencyName, "PE:SUNAT");
					ID15.setAttributeNS(null, schemeName, "Codigo de tributos");
					ID15.setAttributeNS(null, schemeURI, "urn:pe:gob:sunat:cpe:see:gem:catalogos:catalogo05");
					ID15.appendChild(doc.createTextNode("9999")); ///================================faltaba poner 1000
					TaxScheme1.appendChild(ID15);//se anade al grupo TaxCategory1

					Element Name9 = doc.createElementNS("", "cbc:Name");
					TaxScheme1.appendChild(Name9);//se anade al grupo TaxCategory1
					Name9.appendChild(doc.createTextNode("OTROS"));

					Element TaxTypeCode = doc.createElementNS("", "cbc:TaxTypeCode");
					TaxScheme1.appendChild(TaxTypeCode);//se anade al grupo TaxScheme
					TaxTypeCode.appendChild(doc.createTextNode("OTH"));

					// punto 38 Valor de venta del item
					Element lineextensionamount = doc.createElementNS("", "cbc:LineExtensionAmount");
					lineextensionamount.setAttributeNS(null, currencyID,currency.getISO_Code());
					lineextensionamount.appendChild(doc.createTextNode(listaDet.getLineTotalAmt().toString()));
					InvoiceLine.appendChild(lineextensionamount);

				}

				//				
				//				
				//				//          Element TierRange = doc.createElementNS("", "cbc:TierRange");
				//				//          TaxCategory1.appendChild(TierRange);//se anade al grupo TaxCategory1
				//				//          TierRange.appendChild(doc.createTextNode("00"));
				//				//1000 
				//				if (items.getTaxSAmt().compareTo(BigDecimal.ZERO) > 0) {					
				//					ID15.appendChild(doc.createTextNode("1000"));
				//					Name9.appendChild(doc.createTextNode("IGV"));					
				//				}
				//				//9995 - exportacion 
				//				if (items.getTaxGAmt().compareTo(BigDecimal.ZERO) > 0) {					
				//					ID15.appendChild(doc.createTextNode("9995"));
				//				} 
				//				//9998 - inafecto
				//				if (items.getTaxOAmt().compareTo(BigDecimal.ZERO) > 0) {					
				//					ID15.appendChild(doc.createTextNode("9998"));
				//				}
				//				//9997 - exonerado
				//				if (items.getTaxEAmt().compareTo(BigDecimal.ZERO) > 0) {					
				//					ID15.appendChild(doc.createTextNode("9997"));
				//				}
				//				//9996 - gratuito
				//				if (items.getTaxZAmt().compareTo(BigDecimal.ZERO) > 0) {
				//					ID15.appendChild(doc.createTextNode("9996"));					
				//				}
				//				//9999 - otros tributos
				//				if (items.getTaxTAmt().compareTo(BigDecimal.ZERO) != 0) {
				//					ID15.appendChild(doc.createTextNode("9999"));
				//				}								
				//				

				Element TaxTypeCode1 = doc.createElementNS("", "cbc:TaxTypeCode");
				//TaxScheme1.appendChild(TaxTypeCode1);//se anade al grupo TaxCategory1
				TaxTypeCode1.appendChild(doc.createTextNode("VAT"));
				//        fin IGV Item
				//---------------
				// 35 Monto ISC del item				
				if (product.getPriceTypeCode().equals(REF_PriceTypeCode.ValorReferencialUnitarioEnOperacionesNoOnerosas)) {
					//					Element AlternativeConditionPrice02 = doc.createElementNS("", "cac:AlternativeConditionPrice");
					//					PricingReference.appendChild(AlternativeConditionPrice02);//se anade al grupo PricingReference
					//					AlternativeConditionPrice02.appendChild(doc.createTextNode("\n"));
					//
					//					Element PriceAmount02 = doc.createElementNS("", "cbc:PriceAmount");
					//					//PriceAmount02.setAttributeNS(null, "currencyID", listaDet.getItem_moneda().trim());
					//					PriceAmount02.setAttributeNS(null, "currencyID", currency.getISO_Code());
					//					PriceAmount02.setIdAttributeNS(null, "currencyID", true);
					//					AlternativeConditionPrice02.appendChild(PriceAmount02);//se anade al grupo AlternativeConditionPrice
					//					//PriceAmount02.appendChild(doc.createTextNode(listaDet.getItem_pventa_nohonerosa().trim()));
					//					PriceAmount02.appendChild(doc.createTextNode(listaDet.getventa_noonerosa().toString()));
					//
					//					Element PriceTypeCode02 = doc.createElementNS("", "cbc:PriceTypeCode");
					//					AlternativeConditionPrice02.appendChild(PriceTypeCode02);//se anade al grupo AlternativeConditionPrice
					//					PriceTypeCode02.appendChild(doc.createTextNode("02")); //==>Para los casos de gatuito venta no Honerosa
				}

				//---------------
				//        Inicio ISC item
				//if (!listaDet.getItem_ti_isc().equals("0.00")) {
				if (listaDet.getitem_ti_isc().compareTo(BigDecimal.ZERO)!= 0) {

					Element TaxTotal2 = doc.createElementNS("", "cac:TaxTotal");
					InvoiceLine.appendChild(TaxTotal2);//se anade al grupo InvoiceLine
					TaxTotal2.appendChild(doc.createTextNode("\n"));

					log.info("generarXMLZipiadoFactura - IGV ");
					Element TaxAmount22 = doc.createElementNS("", "cbc:TaxAmount");
					TaxAmount22.setAttributeNS(null, currencyID, currency.getISO_Code());
					TaxAmount22.setIdAttributeNS(null, currencyID, true);
					TaxTotal2.appendChild(TaxAmount22);//se anade al grupo TaxTotal1
					//TaxAmount22.appendChild(doc.createTextNode(listaDet.getItem_ti_isc().trim()));
					TaxAmount22.appendChild(doc.createTextNode(listaDet.getitem_base_isc().toString()));

					Element TaxSubtotal2 = doc.createElementNS("", "cac:TaxSubtotal");
					TaxTotal2.appendChild(TaxSubtotal2);//se anade al grupo TaxTotal1
					TaxSubtotal2.appendChild(doc.createTextNode("\n"));

					//ISC
					Element TaxAmount32 = doc.createElementNS("", "cbc:TaxAmount");
					TaxAmount32.setAttributeNS(null, currencyID, currency.getISO_Code()); //================>errror estaba con item..getItem_moneda()
					TaxAmount32.setIdAttributeNS(null, currencyID, true);
					TaxSubtotal2.appendChild(TaxAmount32);//se anade al grupo TaxSubtotal1
					//TaxAmount32.appendChild(doc.createTextNode(listaDet.getItem_ti_isc().trim()));
					TaxAmount32.appendChild(doc.createTextNode(listaDet.getitem_ti_isc().toString()));

					Element TaxCategory12 = doc.createElementNS("", "cac:TaxCategory");
					TaxSubtotal2.appendChild(TaxCategory12);//se anade al grupo TaxSubtotal1
					TaxCategory12.appendChild(doc.createTextNode("\n"));

					log.info("generarXMLZipiadoFactura - afectacion ");

					Element TierRange = doc.createElementNS("", "cbc:TierRange");
					TaxCategory12.appendChild(TierRange);//se anade al grupo TaxCategory1
					//TierRange.appendChild(doc.createTextNode(listaDet.getItem_isc_tier().trim()));
					TierRange.appendChild(doc.createTextNode(orginfo.getTierRange()));

					Element TaxScheme12 = doc.createElementNS("", "cac:TaxScheme");
					TaxCategory12.appendChild(TaxScheme12);//se anade al grupo TaxCategory1
					TaxScheme12.appendChild(doc.createTextNode("\n"));

					Element ID152 = doc.createElementNS("", "cbc:ID");
					TaxScheme12.appendChild(ID152);//se anade al grupo TaxCategory1
					ID152.appendChild(doc.createTextNode("2000"));

					Element Name92 = doc.createElementNS("", "cbc:Name");
					TaxScheme12.appendChild(Name92);//se anade al grupo TaxCategory1
					Name92.appendChild(doc.createTextNode("ISC"));

					Element TaxTypeCode12 = doc.createElementNS("", "cbc:TaxTypeCode");
					TaxScheme12.appendChild(TaxTypeCode12);//se anade al grupo TaxCategory1
					TaxTypeCode12.appendChild(doc.createTextNode("EXC"));
					//        fin ISC Item
				}
				//---------------

				Element Item = doc.createElementNS("", "cac:Item");
				InvoiceLine.appendChild(Item);//se anade al grupo InvoiceLine
				Item.appendChild(doc.createTextNode("\n"));

				Element Description = doc.createElementNS("", "cbc:Description");
				Item.appendChild(Description);//se anade al grupo Item
				//cdata = doc.createCDATASection(listaDet.getItem_descripcion().trim());
				CDATASection cdata = doc.createCDATASection(product.getName().trim());
				Description.appendChild(cdata);

				Element SellersItemIdentification = doc.createElementNS("", "cac:SellersItemIdentification");
				Item.appendChild(SellersItemIdentification);//se anade al grupo Item
				SellersItemIdentification.appendChild(doc.createTextNode("\n"));

				Element ID18 = doc.createElementNS("", "cbc:ID");
				SellersItemIdentification.appendChild(ID18);//se anade al grupo Item
				//ID18.appendChild(doc.createTextNode(listaDet.getItem_codproducto().trim()));
				ID18.appendChild(doc.createTextNode(product.getValue().trim()));

				Element Price = doc.createElementNS("", "cac:Price");
				InvoiceLine.appendChild(Price);//se anade al grupo InvoiceLine
				Price.appendChild(doc.createTextNode("\n"));

				Element PriceAmount2 = doc.createElementNS("", "cbc:PriceAmount");
				PriceAmount2.setAttributeNS(null, currencyID, currency.getISO_Code());
				PriceAmount2.setIdAttributeNS(null, currencyID, true);
				Price.appendChild(PriceAmount2);//se anade al grupo Price
				//PriceAmount2.appendChild(doc.createTextNode(listaDet.getItem_pventa().trim()));
				PriceAmount2.appendChild(doc.createTextNode(listaDet.getPriceActual().toString().trim()));
			}
			log.info("generarXMLZipiadoBoleta - Prepara firma digital ");
			//sig.setId(items.getEmpr_nroruc());
			sig.setId(p.getTaxID());
			sig.setId(dateFormatted);
			sig.addKeyInfo(cert);
			{
				Transforms transforms = new Transforms(doc);
				transforms.addTransform(Transforms.TRANSFORM_ENVELOPED_SIGNATURE);
				sig.addDocument("", transforms, Constants.ALGO_ID_DIGEST_SHA1);
			}
			{
				//Firmar el documento
				log.info("generarXMLZipiadoBoleta - firma el XML ");
				sig.sign(privateKey);
			}
			//--------------------fin de construccion del xml---------------------
			///*combinacion de firma y construccion xml////
			FileOutputStream f = new FileOutputStream(signatureFile);
			Transformer tf = TransformerFactory.newInstance().newTransformer();
			tf.setOutputProperty(OutputKeys.ENCODING, "ISO-8859-1");
			//tf.setOutputProperty(OutputKeys.INDENT, "yes");
			tf.setOutputProperty(OutputKeys.STANDALONE, "no");
			//Writer out = new StringWriter();
			StreamResult sr = new StreamResult(f);
			tf.transform(new DOMSource(doc), sr);
			sr.getOutputStream().close();

			log.info("generarXMLZipiadoBoleta - XML creado " + pathXMLFile);
			//====================== CREAR ZIP PARA EL ENVIO A SUNAT =======================
			//resultado = GeneralFunctions.crearZip(items, unidadEnvio, conn, signatureFile);
			resultado = GeneralFunctions.crearZip(m_bp, items, getFile(), signatureFile);
		} catch (Exception ex) {
			ex.printStackTrace();
			resultado = "0002|Error al generar el archivo de formato xml de la boleta.";
			log.log(Level.SEVERE, "generarXMLZipiadoFactura - error " + ex.toString());
			try {
				// LecturaXML.guardarProcesoEstado(iddocument, "Q", resultado.split("\\| 
			} catch (Exception ex1) {
				log.log(Level.SEVERE, ex1.toString());
			}			
		} 
		return resultado;
	}

}
