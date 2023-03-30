package org.xendra.process;

import java.io.File;
import java.io.FileOutputStream;
import java.math.BigDecimal;
import java.security.PrivateKey;
import java.text.DecimalFormat;
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
import org.compiere.model.Query;
import org.compiere.model.persistence.X_C_BP_DocType;
import org.compiere.model.persistence.X_C_DocumentTax;
import org.compiere.model.persistence.X_S_DocAdvance;
import org.compiere.model.persistence.X_S_DocHeader;
import org.compiere.model.persistence.X_S_DocLegend;
import org.compiere.model.persistence.X_S_DocLine;
import org.compiere.model.persistence.X_S_DocLineOthers;
import org.compiere.model.persistence.X_C_Province;
import org.compiere.model.reference.REF_PriceTypeCode;
import org.compiere.util.Env;
import org.compiere.util.Util;
import org.w3c.dom.CDATASection;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.security.cert.X509Certificate;
import org.xendra.efact.process.GeneralFunctions;
import org.xendra.util.Tools;

public class Boleta extends EFactDocument {

	private MCity city;
	private MRegion region;
	private X_C_Province province;
	private MBPartnerLocation pl;
	private X_C_BP_DocType bpdt;
	private MBPartner p;
	private org.w3c.dom.Document doc;
	private DocumentBuilder db;
	private DocumentBuilderFactory dbf;	
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

	private void createPartyRegistrationAddress(Document doc, Element PartySupplier) throws Exception {
		Element PartyLegalEntity 		 = getDoc().createElement("cac:PartyLegalEntity");
		Element PartyRegistrationName 	 = getDoc().createElement("cbc:RegistrationName");
		PartyRegistrationName.appendChild(getDoc().createTextNode("EFACT SAC"));
		Element PartyRegistrationAddress = getDoc().createElement("cac:RegistrationAddress");
		Element Ubigeo = getDoc().createElement("cbc:ID");
		Ubigeo.setAttributeNS(null, schemeName, "Ubigeos");
		Ubigeo.setAttributeNS(null, schemeAgencyName, "PE:INEI");		
		Ubigeo.appendChild(getDoc().createTextNode(city.getLocode()));
		PartyRegistrationAddress.appendChild(Ubigeo);//se anade al grupo partyname1

		Element AddressTypeCode = getDoc().createElement("cbc:AddressTypeCode");
		AddressTypeCode.setAttributeNS(null, listAgencyName, "PE:SUNAT");
		AddressTypeCode.setAttributeNS(null, listName, "Establecimientos anexos");
		AddressTypeCode.appendChild(getDoc().createTextNode("0000"));
		PartyRegistrationAddress.appendChild(AddressTypeCode);
		
		Element CitySubDivision = getDoc().createElement("cbc:CitySubdivisionName");
		CitySubDivision.appendChild(getDoc().createTextNode(""));
		PartyRegistrationAddress.appendChild(CitySubDivision);

		Element CityName = getDoc().createElement("cbc:CityName");
		CityName.appendChild(getDoc().createTextNode(province.getName()));
		PartyRegistrationAddress.appendChild(CityName);

		Element CountrySubEntity = getDoc().createElement("cbc:CountrySubentity");
		CountrySubEntity.appendChild(getDoc().createTextNode(region.getName()));
		PartyRegistrationAddress.appendChild(CountrySubEntity);

		Element District = getDoc().createElement("cbc:District");
		District.appendChild(getDoc().createTextNode(city.getName()));
		PartyRegistrationAddress.appendChild(District);

		Element AddressLine = getDoc().createElement("cac:AddressLine");
		Element Line = getDoc().createElement("cbc:Line");
		AddressLine.appendChild(Line);
		Line.appendChild(getDoc().createTextNode(pl.getName()));

		PartyRegistrationAddress.appendChild(AddressLine);

		Element Country = getDoc().createElement("cac:Country");
		PartyRegistrationAddress.appendChild(Country);//se anade al grupo PostalAddress			
		Element IdentificationCode = getDoc().createElement("cbc:IdentificationCode");
		IdentificationCode.appendChild(getDoc().createTextNode("PE"));
		Country.appendChild(IdentificationCode);

		PartyLegalEntity.appendChild(PartyRegistrationName);
		PartyLegalEntity.appendChild(PartyRegistrationAddress);								
		PartySupplier.appendChild(PartyLegalEntity);		
	}


	private void createAccountingCustomerParty(Document doc, Element envelope) throws Exception {
		Element AccountingCustomerParty = getDoc().createElement("cac:AccountingCustomerParty");
		envelope.appendChild(AccountingCustomerParty);
		//AccountingCustomerParty.appendChild(getDoc().createTextNode("\n"));

		Element Party = getDoc().createElement("cac:Party");
		AccountingCustomerParty.appendChild(Party);

		Element CustomerPartyIdentification = getDoc().createElement("cac:PartyIdentification");
		Party.appendChild(CustomerPartyIdentification);

		Element CustomerID = getDoc().createElement("cbc:ID");
		CustomerID.setAttributeNS(null, schemeID, bpdt.getTaxID());
		CustomerID.setAttributeNS(null, schemeName, bpdt.getName());
		CustomerID.setAttributeNS(null, schemeAgencyName, "PE:SUNAT");
		CustomerID.setAttributeNS(null, schemeURI, "urn:pe:gob:sunat:cpe:see:gem:catalogos:catalogo06");
		CustomerID.appendChild(getDoc().createTextNode(p.getTaxID()));
		CustomerPartyIdentification.appendChild(CustomerID);

		Element PartyName = getDoc().createElement("cac:PartyName");
		Element PartyCBCName = getDoc().createElement("cbc:Name");
		PartyCBCName.appendChild(getDoc().createTextNode(p.getName()));
		PartyName.appendChild(PartyCBCName);
		Party.appendChild(PartyName);
							
		// 19 Apellidos y nombres, denominacion o razon social del receptor
		Element PartyLegalIdentity = getDoc().createElement("cac:PartyLegalEntity");
		Party.appendChild(PartyLegalIdentity);

		Element RegistrationName = getDoc().createElement("cbc:RegistrationName");
		RegistrationName.appendChild(getDoc().createTextNode(p.getName()));
		PartyLegalIdentity.appendChild(RegistrationName);

		// 20 Direccion completa y detallada del receptor
		Element RegistrationAddress = getDoc().createElement("cac:RegistrationAddress");
		Element Ubigeo = getDoc().createElement("cbc:ID");
		Ubigeo.setAttributeNS(null, schemeName, "Ubigeos");
		Ubigeo.setAttributeNS(null, schemeAgencyName, "PE:INEI");		
		Ubigeo.appendChild(getDoc().createTextNode(city.getLocode()));
		RegistrationAddress.appendChild(Ubigeo);//se anade al grupo partyname1

		Element CitySubDivision = getDoc().createElement("cbc:CitySubdivisionName");
		CitySubDivision.appendChild(getDoc().createTextNode(""));
		RegistrationAddress.appendChild(CitySubDivision);

		Element CityName = getDoc().createElement("cbc:CityName");
		CityName.appendChild(getDoc().createTextNode(province.getName()));
		RegistrationAddress.appendChild(CityName);

		Element CountrySubEntity = getDoc().createElement("cbc:CountrySubentity");
		CountrySubEntity.appendChild(getDoc().createTextNode(region.getName()));
		RegistrationAddress.appendChild(CountrySubEntity);

		Element District = getDoc().createElement("cbc:District");
		District.appendChild(getDoc().createTextNode(city.getName()));
		RegistrationAddress.appendChild(District);

		Element AddressLine = getDoc().createElement("cac:AddressLine");
		Element Line = getDoc().createElement("cbc:Line");
		AddressLine.appendChild(Line);
		Line.appendChild(getDoc().createTextNode(pl.getName()));

		RegistrationAddress.appendChild(AddressLine);

		Element Country = getDoc().createElement("cac:Country");
		RegistrationAddress.appendChild(Country);//se anade al grupo PostalAddress			
		Element IdentificationCode = getDoc().createElement("cbc:IdentificationCode");
		IdentificationCode.appendChild(getDoc().createTextNode("PE"));
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
			province = new Query(Env.getCtx(), X_C_Province.Table_Name, "C_Province_ID = ?", null)
					.setParameters(city.getC_Province_ID()).first();			
			MCountry country = new Query(Env.getCtx(), MCountry.Table_Name, "C_Country_ID = ?", null)
					.setParameters(city.getC_Country_ID()).first();
			MCurrency currency = new Query(Env.getCtx(), MCurrency.Table_Name, "C_Currency_ID = ?", null)
					.setParameters(items.getC_Currency_ID()).first();
			MOrgInfo orginfo = new Query(Env.getCtx(), MOrgInfo.Table_Name,"AD_Org_ID = ?", null)
					.setParameters(items.getAD_Org_ID()).first();			
			X_C_BP_DocType m_bpdt = new Query(Env.getCtx(), X_C_BP_DocType.Table_Name, "C_BP_DocType_ID = ?", null)
					.setParameters(m_bp.getC_BP_DocType_ID()).first();

			String pathXMLFile = Tools.getInstance().getFile("xml");
			File signatureFile = new File(pathXMLFile);
			//			
			
			////////////////////////////////////////////////// 			
			log.info("generarXMLZipiadoBoleta - cabecera XML");
			Element invoice = getDoc().createElementNS("urn:oasis:names:specification:ubl:schema:xsd:Invoice-2", "Invoice");
			invoice.setAttributeNS(Constants.NamespaceSpecNS, "xmlns:cac", "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2");
			invoice.setAttributeNS(Constants.NamespaceSpecNS, "xmlns:cbc", "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2");
			invoice.setAttributeNS(Constants.NamespaceSpecNS, "xmlns:ext", "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2");
//			invoice.appendChild(getDoc().createTextNode("\n"));
			getDoc().appendChild(invoice);

			// pago cero por anticipos
			if (!items.getdoc_anticipo_total().equals(BigDecimal.ZERO) && "0.00".equals(items.getGrandTotal().equals(BigDecimal.ZERO))) {
				if ("000".equals(anticipoCero1001.concat(anticipoCero1002).concat(anticipoCero1003))) {
					Element AdditionalMonetaryTotal1 = getDoc().createElement("sac:AdditionalMonetaryTotal");
					invoice.appendChild(AdditionalMonetaryTotal1);
					//AdditionalMonetaryTotal1.appendChild(getDoc().createTextNode("\n"));

					Element ID1 = getDoc().createElement("cbc:ID");
					invoice.appendChild(ID1);
					ID1.appendChild(getDoc().createTextNode("1001"));

					Element PayableAmount1 = getDoc().createElement("cbc:PayableAmount");
					//PayableAmount1.setAttributeNS(null, "currencyID", items.getDocu_moneda().trim());
					PayableAmount1.setAttributeNS(null, currencyID, currency.getISO_Code());
					PayableAmount1.setIdAttributeNS(null, currencyID, true);
					invoice.appendChild(PayableAmount1);
					PayableAmount1.appendChild(getDoc().createTextNode("0.00"));

					//AdditionalInformation.appendChild(AdditionalMonetaryTotal1);
					AdditionalMonetaryTotal1.appendChild(ID1);
					AdditionalMonetaryTotal1.appendChild(PayableAmount1);

					Element AdditionalMonetaryTotal2 = getDoc().createElement("sac:AdditionalMonetaryTotal");
					invoice.appendChild(AdditionalMonetaryTotal2);
					//AdditionalMonetaryTotal2.appendChild(getDoc().createTextNode("\n"));

					Element ID2 = getDoc().createElement("cbc:ID");
					invoice.appendChild(ID2);
					ID2.appendChild(getDoc().createTextNode("1002"));

					Element PayableAmount2 = getDoc().createElement("cbc:PayableAmount");
					PayableAmount2.setAttributeNS(null, currencyID, currency.getISO_Code());
					PayableAmount2.setIdAttributeNS(null, currencyID, true);
					invoice.appendChild(PayableAmount2);
					PayableAmount2.appendChild(getDoc().createTextNode("0.00"));

					Element AdditionalMonetaryTotal3 = getDoc().createElement("sac:AdditionalMonetaryTotal");
					invoice.appendChild(AdditionalMonetaryTotal3);

					Element ID3 = getDoc().createElement("cbc:ID");
					invoice.appendChild(ID3);
					ID3.appendChild(getDoc().createTextNode("1003"));

					Element PayableAmount3 = getDoc().createElement("cbc:PayableAmount");
					PayableAmount3.setAttributeNS(null, currencyID, currency.getISO_Code());
					PayableAmount3.setIdAttributeNS(null, currencyID, true);
					invoice.appendChild(PayableAmount3);
					PayableAmount3.appendChild(getDoc().createTextNode("0.00"));
				}
			}

			if (items.getDiscount().compareTo(BigDecimal.ZERO) > 0) {
				Element AdditionalMonetaryTotal5 = getDoc().createElement("sac:AdditionalMonetaryTotal");
				invoice.appendChild(AdditionalMonetaryTotal5);

				Element ID10 = getDoc().createElement("cbc:ID");
				invoice.appendChild(ID10);
				ID10.appendChild(getDoc().createTextNode("2005"));

				Element PayableAmount5 = getDoc().createElement("cbc:PayableAmount");
				PayableAmount5.setAttributeNS(null, currencyID, currency.getISO_Code());
				PayableAmount5.setIdAttributeNS(null, currencyID, true);
				invoice.appendChild(PayableAmount5);
				PayableAmount5.appendChild(getDoc().createTextNode(items.getDiscount().toString().trim()));
				AdditionalMonetaryTotal5.appendChild(ID10);
				AdditionalMonetaryTotal5.appendChild(PayableAmount5);
			}
			// items.getDocu_tipo_operacion
			if (items.getAdditionalInformation().length() > 0) {
				Element sUNATTransaction = getDoc().createElement("sac:SUNATTransaction");
				invoice.appendChild(sUNATTransaction);
				Element ID = getDoc().createElement("cbc:ID");
				invoice.appendChild(ID);
				ID.appendChild(getDoc().createTextNode(items.getAdditionalInformation().trim()));
				sUNATTransaction.appendChild(ID); 
			}

			if (otrosdetalles.size() > 0) {
				//otros detalles
				int counter = 1;
				for (X_S_DocLineOthers detalleotro : otrosdetalles) {
					Element DatoAdicional = getDoc().createElement("DatoAdicional");
					invoice.appendChild(DatoAdicional);

					Element Codigo = getDoc().createElement("Codigo");
					invoice.appendChild(Codigo);
					Codigo.appendChild(getDoc().createTextNode(Util.pad(String.valueOf(counter), 3, null, '0' )));

					Element Valor = getDoc().createElement("Valor");
					invoice.appendChild(Valor);
					CDATASection cdata = getDoc().createCDATASection(detalleotro.getAttributeValue());
					Valor.appendChild(cdata);
					DatoAdicional.appendChild(Codigo);
					DatoAdicional.appendChild(Valor);
					counter++;
				}
			}

			// El baseURI es la URI que se utiliza para anteponer a URIs relativos
			String BaseURI = signatureFile.toURI().toURL().toString();
			// Crea un xml Signature objeto desde el documento, BaseURI and signature algorithm (in this case RSA)			
			XMLSignature sig = new XMLSignature(doc, BaseURI, XMLSignature.ALGO_ID_SIGNATURE_RSA);

			// 1 Version del UBL 
			versionUBL(invoice);
			
			//  2 version de la estructura del documento
			versionCustomization(invoice);

			// 3 numeracion, conformada por serie y numero correlativo 
			numerationDocument(invoice);

			String dateFormatted = new SimpleDateFormat("yyyy-MM-dd").format(items.getDateInvoiced());
			// 4 fecha de emision
			dateinvoiced(invoice, dateFormatted);
			
			// 5 Tipo de documento y tipo de operacion
			invoicetypecode(invoice, taxdoc.getTaxID());

			// 6 Observaciones
			// cbc:Note
			// 7 Leyendas
			legends(invoice, leyendas);
			// 8 tipo  de moneda
			documentcurrency(invoice, currency.getISO_Code());

			// 9 Cantidad de item
			linecount(invoice, detdocelec.size());
			
			// 10 Numero de la orden de compra (opcional)
			// 11 fecha de vencimiento (opcional)
			
			// 12 Firma digital
			//bloque2 cac:Signature--------------------------------------------------------
			signature(invoice);
			//ID6.appendChild(getDoc().createTextNode(items.getEmpr_nroruc().trim()));
			//ID6.appendChild(getDoc().createTextNode(p.getTaxID()));

			
			//bloque3 cac:AccountingSupplierParty-----------------------------------------
			// III Datos del emisor de la boleta
			// 13 Tipo y numero de RUC del emisor
			Element AccountingSupplierParty = getDoc().createElement("cac:AccountingSupplierParty");
			invoice.appendChild(AccountingSupplierParty);

			
			Element Party = getDoc().createElement("cac:Party");
			AccountingSupplierParty.appendChild(Party);

			Element PartyIdentificationSupplier = getDoc().createElement("cac:PartyIdentification");

			Element SupplierId = getDoc().createElement("cbc:ID");
			SupplierId.setAttributeNS(null, schemeID, "6");
			SupplierId.setAttributeNS(null, schemeName, "Documento de Identidad");
			SupplierId.setAttributeNS(null, schemeAgencyName, "PE:SUNAT");
			SupplierId.setAttributeNS(null, schemeURI, "urn:pe:gob:sunat:cpe:see:gem:catalogos:catalogo06");
			SupplierId.appendChild(getDoc().createTextNode(m_bp.getTaxID()));
			PartyIdentificationSupplier.appendChild(SupplierId);
			Party.appendChild(PartyIdentificationSupplier);

			
			// 14 Nombre comercial emisor

			// Opcional : Nombre comercial del emisor de la boleta  solo en caso de haber sido declarado en la  SUNAT

			Element	AccountingSupplier = getDoc().createElement("cac:AccountingSupplierParty");
			Element PartySupplier = getDoc().createElement("cac:Party");
			AccountingSupplier.appendChild(PartySupplier);

			Element PartySupplierName = getDoc().createElement("cac:PartyName");
			Party.appendChild(PartySupplierName);

			Element SupplierPartyName = getDoc().createElement("cbc:Name");
			SupplierPartyName.appendChild(getDoc().createTextNode("EFACT"));
			PartySupplierName.appendChild(SupplierPartyName);


			invoice.appendChild(AccountingSupplierParty);


			// 15 Apellidos y nombres, denominaciono razon social del emisor
			// 16 Direccion Completa y detallada del emisor
			// 17 Codigo de establecimiento
			createPartyRegistrationAddress(getDoc(), Party);
			
			// 18 Tipo y numero  de documento de identidad del receptor
			// 19 Apellidos y nombres, denominacion o razon social del receptor
			// 20 Direccion completa y detallada del receptor
			createAccountingCustomerParty(getDoc(), invoice);

			//detalle anticpos			
			for (X_S_DocAdvance listaAnt : anticipos) {
				Element PrepaidPayment = getDoc().createElement("cac:PrepaidPayment");
				invoice.appendChild(PrepaidPayment);
				//PrepaidPayment.appendChild(getDoc().createTextNode("\n"));

				Element IDant = getDoc().createElement("cbc:ID");
				IDant.setAttributeNS(null, schemeID, listaAnt.getSchemeID().trim());
				IDant.setIdAttributeNS(null, schemeID, true);
				PrepaidPayment.appendChild(IDant);//se anade al grupo InvoiceLine
				IDant.appendChild(getDoc().createTextNode(listaAnt.getDocumentNo()));

				MCurrency advancecurrency = new Query(Env.getCtx(), MCurrency.Table_Name, "C_Currency_ID = ?", null)
						.setParameters(listaAnt.getC_Currency_ID()).first();

				Element PaidAmount = getDoc().createElement("cbc:PaidAmount");
				PaidAmount.setAttributeNS(null, currencyID, advancecurrency.getISO_Code());
				PaidAmount.setIdAttributeNS(null, currencyID, true);
				PrepaidPayment.appendChild(PaidAmount);
				//PaidAmount.appendChild(getDoc().createTextNode(listaAnt.getDocu_anticipo_prepago().trim()));
				PaidAmount.appendChild(getDoc().createTextNode(listaAnt.getAmount().toString().trim()));

				Element InstructionID = getDoc().createElement("cbc:InstructionID");
				//InstructionID.setAttributeNS(null, "schemeID", listaAnt.getDocu_anticipo_tipo_docu_emi().trim());
				Calendar cal = Calendar.getInstance();
				cal.setTime(listaAnt.getDateAcct());
				int hour = cal.get(Calendar.HOUR);
				int minute = cal.get(Calendar.MINUTE);
				//InstructionID.setAttributeNS(null, "schemeID", listaAnt.getdocu_anticipo_fecha_emi().trim());
				InstructionID.setAttributeNS(null, schemeID, listaAnt.getDateAcct().toString());
				InstructionID.setIdAttributeNS(null, schemeID, true);
				PrepaidPayment.appendChild(InstructionID);//se anade al grupo InvoiceLine
				//InstructionID.appendChild(getDoc().createTextNode(listaAnt.getDocu_anticipo_numero_docu_emi().trim()));
				InstructionID.appendChild(getDoc().createTextNode(String.format("%s:%s", hour, minute)));
			}

			//bloque 5 IGV
			//if (!"0.00".equals(items.getDocu_igv().trim())) {
			if (items.getTaxSAmt().compareTo(BigDecimal.ZERO) > 0) {

				Element TaxTotal = getDoc().createElement("cac:TaxTotal");
				invoice.appendChild(TaxTotal);				

				Element TaxAmount = getDoc().createElement("cbc:TaxAmount");
				TaxAmount.setAttributeNS(null, currencyID, currency.getISO_Code());
				TaxAmount.setIdAttributeNS(null, currencyID, true);
				TaxTotal.appendChild(TaxAmount);//se anade al grupo TaxTotal
				TaxAmount.appendChild(getDoc().createTextNode(items.getTaxSAmt().toString()));

				Element TaxSubtotal = getDoc().createElement("cac:TaxSubtotal");
				TaxTotal.appendChild(TaxSubtotal);//se anade al grupo TaxTotal
				
				Element TaxableAmount = getDoc().createElement("cbc:TaxableAmount");
				TaxableAmount.setAttributeNS(null, currencyID, currency.getISO_Code());
				TaxableAmount.appendChild(getDoc().createTextNode(items.getTaxBaseAmt().setScale(2, BigDecimal.ROUND_HALF_UP).toPlainString()));
				TaxSubtotal.appendChild(TaxableAmount);

				Element TaxAmount1 = getDoc().createElement("cbc:TaxAmount");
				TaxAmount1.setAttributeNS(null, currencyID, currency.getISO_Code());
				TaxAmount1.setIdAttributeNS(null, currencyID, true);
				TaxSubtotal.appendChild(TaxAmount1);//se anade al grupo TaxSubtotal
				//TaxAmount1.appendChild(getDoc().createTextNode(items.getDocu_igv().trim()));
				TaxAmount1.appendChild(getDoc().createTextNode(items.getTaxSAmt().setScale(2, BigDecimal.ROUND_HALF_UP).toPlainString()));

				Element TaxCategory = getDoc().createElement("cac:TaxCategory");
				TaxSubtotal.appendChild(TaxCategory);//se anade al grupo TaxSubtotal

				Element TaxScheme = getDoc().createElement("cac:TaxScheme");
				TaxCategory.appendChild(TaxScheme);//se anade al grupo TaxCategory

				Element ID9 = getDoc().createElement("cbc:ID");
				ID9.setAttributeNS(null, schemeAgencyName, "PE:SUNAT");
				ID9.setAttributeNS(null, schemeName, "Codigo de tributos");
				ID9.setAttributeNS(null, schemeURI, "urn:pe:gob:sunat:cpe:see:gem:catalogos:catalogo05");
				TaxScheme.appendChild(ID9);//se anade al grupo TaxScheme
				ID9.appendChild(getDoc().createTextNode("1000")); ///================================faltaba poner 1000

				Element Name3 = getDoc().createElement("cbc:Name");
				TaxScheme.appendChild(Name3);//se anade al grupo TaxScheme
				Name3.appendChild(getDoc().createTextNode("IGV"));

				Element TaxTypeCode = getDoc().createElement("cbc:TaxTypeCode");
				TaxScheme.appendChild(TaxTypeCode);//se anade al grupo TaxScheme
				TaxTypeCode.appendChild(getDoc().createTextNode("VAT"));
			}
			//bloque 6 ISC
			if (items.getdocu_isc().compareTo(BigDecimal.ZERO) != 0) {

				Element TaxTotal = getDoc().createElement("cac:TaxTotal");
				invoice.appendChild(TaxTotal);

			
				Element TaxAmount = getDoc().createElement("cbc:TaxAmount");
				//TaxAmount.setAttributeNS(null, "currencyID", items.getDocu_moneda().trim());
				TaxAmount.setAttributeNS(null, currencyID, currency.getISO_Code());
				TaxAmount.setIdAttributeNS(null, currencyID, true);
				TaxTotal.appendChild(TaxAmount);//se anade al grupo TaxTotal
				TaxAmount.appendChild(getDoc().createTextNode(items.getdocu_isc().toString().trim()));

				Element TaxSubtotal = getDoc().createElement("cac:TaxSubtotal");
				TaxTotal.appendChild(TaxSubtotal);//se anade al grupo TaxTotal

				Element TaxableAmount = getDoc().createElement("cbc:TaxableAmount");
				TaxableAmount.setAttributeNS(null, currencyID, currency.getISO_Code());
				TaxableAmount.appendChild(getDoc().createTextNode(items.getdocu_isc().toString()));
				TaxSubtotal.appendChild(TaxableAmount);

				
				Element TaxAmount1 = getDoc().createElement("cbc:TaxAmount");
				TaxAmount1.setAttributeNS(null, currencyID, currency.getISO_Code());
				TaxAmount1.setIdAttributeNS(null, currencyID, true);
				TaxSubtotal.appendChild(TaxAmount1);//se anade al grupo TaxSubtotal
				TaxAmount1.appendChild(getDoc().createTextNode(items.getdocu_isc().toString().trim()));

				Element TaxCategory = getDoc().createElement("cac:TaxCategory");
				TaxSubtotal.appendChild(TaxCategory);//se anade al grupo TaxSubtotal

				Element TaxScheme = getDoc().createElement("cac:TaxScheme");
				TaxCategory.appendChild(TaxScheme);//se anade al grupo TaxCategory

				Element ID9 = getDoc().createElement("cbc:ID");
				TaxScheme.appendChild(ID9);//se anade al grupo TaxScheme
				ID9.appendChild(getDoc().createTextNode("2000")); ///================================faltaba poner 1000

				Element Name3 = getDoc().createElement("cbc:Name");
				TaxScheme.appendChild(Name3);//se anade al grupo TaxScheme
				Name3.appendChild(getDoc().createTextNode("ISC"));

				Element TaxTypeCode = getDoc().createElement("cbc:TaxTypeCode");
				TaxScheme.appendChild(TaxTypeCode);//se anade al grupo TaxScheme
				TaxTypeCode.appendChild(getDoc().createTextNode("EXC"));
			}
			//bloque 7     
			Element LegalMonetaryTotal = getDoc().createElement("cac:LegalMonetaryTotal");
			invoice.appendChild(LegalMonetaryTotal);

			// Anticipo total
			//if (!items.getDocu_anticipo_total().equals("0.00")) {
			if (items.getTotalAdvanceAmount().compareTo(BigDecimal.ZERO) != 0) {
				Element PrepaidAmount = getDoc().createElement("cbc:PrepaidAmount");
				//PrepaidAmount.setAttributeNS(null, "currencyID", items.getDocu_moneda().trim());
				PrepaidAmount.setAttributeNS(null, currencyID, currency.getISO_Code());
				PrepaidAmount.setIdAttributeNS(null, currencyID, true);
				LegalMonetaryTotal.appendChild(PrepaidAmount);
				//PrepaidAmount.appendChild(getDoc().createTextNode(items.getDocu_anticipo_total().trim()));
				PrepaidAmount.appendChild(getDoc().createTextNode(items.getTotalAdvanceAmount().toString()));
			}

			// 55. Total valor de la venta
			Element LineExtensionAmount = getDoc().createElement("cbc:LineExtensionAmount");
			LineExtensionAmount.setAttributeNS(null, currencyID, currency.getISO_Code());
			LineExtensionAmount.appendChild(getDoc().createTextNode(items.getGrandTotal()
					.setScale(2, BigDecimal.ROUND_HALF_UP).toPlainString()));
			LegalMonetaryTotal.appendChild(LineExtensionAmount);
			
			// 56. Total precio de venta
			Element TaxInclusiveAmount = getDoc().createElement("cbc:TaxInclusiveAmount");
			TaxInclusiveAmount.setAttributeNS(null, currencyID, currency.getISO_Code());
			TaxInclusiveAmount.appendChild(getDoc().createTextNode(items.getGrandTotal()
					.setScale(2, BigDecimal.ROUND_HALF_UP).toPlainString()));
			LegalMonetaryTotal.appendChild(TaxInclusiveAmount);
			
			// 54. Importe total del comprobante
			Element PayableAmount = getDoc().createElement("cbc:PayableAmount");
			PayableAmount.setAttributeNS(null, currencyID, currency.getISO_Code());
			PayableAmount.setIdAttributeNS(null, currencyID, true);
			LegalMonetaryTotal.appendChild(PayableAmount);//se anade al grupo LegalMonetaryTotal
			PayableAmount.appendChild(getDoc().createTextNode(items.getGrandTotal()
					.setScale(2, BigDecimal.ROUND_HALF_UP).toPlainString()));
						
			// IV Datos del detalle o item de la boleta			
			log.info("generarXMLZipiadoBoleta - Iniciamos detalle XML ");
			int SeqNo = 1;
			for (X_S_DocLine listaDet : detdocelec) {
				MTax tax = new Query(Env.getCtx(), MTax.Table_Name, "C_Tax_ID = ?", null)
						.setParameters(listaDet.getC_Tax_ID()).first();
				MProduct product = new Query(Env.getCtx(), MProduct.Table_Name, "M_Product_ID = ?", null)
						.setParameters(listaDet.getM_Product_ID()).first();
				MUOM uom = MUOM.get(Env.getCtx(), listaDet.getC_UOM_ID());				
				Element InvoiceLine = getDoc().createElement("cac:InvoiceLine");
				invoice.appendChild(InvoiceLine);
				//InvoiceLine.appendChild(getDoc().createTextNode("\n"));
				
				// 24 Numero de orden del item
				Element ID11 = getDoc().createElement("cbc:ID");
				InvoiceLine.appendChild(ID11);//se anade al grupo InvoiceLine
				//ID11.appendChild(getDoc().createTextNode(listaDet.getItem_orden().trim()));
				ID11.appendChild(getDoc().createTextNode(String.valueOf(SeqNo)));

				// 25 Unidad de medida y cantidad del item 
				Element Note = getDoc().createElement("cbc:Note");
				Note.appendChild(getDoc().createTextNode(uom.getName()));
				InvoiceLine.appendChild(Note);

				Element InvoicedQuantity = getDoc().createElement("cbc:InvoicedQuantity");
				InvoicedQuantity.setAttributeNS(null, "unitCode", uom.getX12DE355());
				InvoicedQuantity.setIdAttributeNS(null, "unitCode", true);
				InvoicedQuantity.setAttributeNS(null, "unitCodeListAgencyName","United Nations Economic Commission for Europe");
				InvoicedQuantity.setAttributeNS(null, "unitCodeListID","UN/ECE rec 20");
				InvoiceLine.appendChild(InvoicedQuantity);//se anade al grupo InvoiceLine
				InvoicedQuantity.appendChild(getDoc().createTextNode(listaDet.getQty().setScale(2, BigDecimal.ROUND_HALF_UP).toPlainString()));				
				// 25 end

				// punto 38 Valor de venta del item
				//Element lineextensionamount = getDoc().createElement("cbc:LineExtensionAmount");
				//lineextensionamount.setAttributeNS(null, currencyID,currency.getISO_Code());
				//lineextensionamount.appendChild(getDoc().createTextNode(listaDet.getLineTotalAmt().toString()));
				//InvoiceLine.appendChild(lineextensionamount);
				
				//----
				// 38 Valor de venta del item			
				Element PricingReference = getDoc().createElement("cac:PricingReference");
				InvoiceLine.appendChild(PricingReference);//se anade al grupo InvoiceLine
				Element AlternativeConditionPrice = getDoc().createElement("cac:AlternativeConditionPrice");
				//AlternativeConditionPrice.setAttributeNS(null, listAgencyName, "PE:SUNAT");
				//AlternativeConditionPrice.setAttributeNS(null, listName, "Tipo de Precio");
				//AlternativeConditionPrice.setAttributeNS(null, listURI, "urn:pe:gob:sunat:cpe:see:gem:catalogos:catalogo16");
				Element PriceAmount = getDoc().createElement("cbc:PriceAmount");
				//PriceAmount.setAttributeNS(null, "currencyID", listaDet.getItem_moneda().trim());
				PriceAmount.setAttributeNS(null, currencyID, currency.getISO_Code());
				PriceAmount.setIdAttributeNS(null, currencyID, true);
				AlternativeConditionPrice.appendChild(PriceAmount);//se anade al grupo AlternativeConditionPrice
				//PriceAmount.appendChild(getDoc().createTextNode(listaDet.getItem_pventa().trim())); // el precio unitario de venta de ser con los impuestos y deducciones de descuentos
				PriceAmount.appendChild(getDoc().createTextNode(listaDet.getTaxBaseAmt().toString())); // el precio unitario de venta de ser con los impuestos y deducciones de descuentos
				PricingReference.appendChild(AlternativeConditionPrice);//se anade al grupo PricingReference

				Element PriceTypeCode = getDoc().createElement("cbc:PriceTypeCode");				
				PriceTypeCode.setAttributeNS(null, listName, "Tipo de Precio");
				PriceTypeCode.setAttributeNS(null, listAgencyName, "PE:SUNAT");
				PriceTypeCode.setAttributeNS(null, listURI, "urn:pe:gob:sunat:cpe:see:gem:catalogos:catalogo16");
				PriceTypeCode.appendChild(getDoc().createTextNode("01"));
				AlternativeConditionPrice.appendChild(PriceTypeCode);											
				//
				// Punto 33
				//          Inicio IGV item
				Element TaxTotal1 = getDoc().createElement("cac:TaxTotal");
				InvoiceLine.appendChild(TaxTotal1);//se anade al grupo InvoiceLine
				//TaxTotal1.appendChild(getDoc().createTextNode("\n"));

				log.info("generarXMLZipiadoFactura - IGV ");
				Element TaxAmount2 = getDoc().createElement("cbc:TaxAmount");
				//TaxAmount2.setAttributeNS(null, "currencyID", listaDet.getItem_moneda().trim());
				TaxAmount2.setAttributeNS(null, currencyID, currency.getISO_Code());
				TaxAmount2.setIdAttributeNS(null, currencyID, true);
				TaxTotal1.appendChild(TaxAmount2);//se anade al grupo TaxTotal1
				//TaxAmount2.appendChild(getDoc().createTextNode(listaDet.getItem_ti_igv().trim()));
				TaxAmount2.appendChild(getDoc().createTextNode(listaDet.gettaxamount().toString()));

				Element TaxSubtotal1 = getDoc().createElement("cac:TaxSubtotal");				
				//TaxSubtotal1.appendChild(getDoc().createTextNode("\n"));				
				TaxTotal1.appendChild(TaxSubtotal1);//se anade al grupo TaxTotal1
				
				// 34 Monto del IGV o IVAP del item
				
				// 35 Monto ISC del item
				if (product.getPriceTypeCode().equals(REF_PriceTypeCode.ValorReferencialUnitarioEnOperacionesNoOnerosas)) {
					
					setTaxScheme(InvoiceLine, 
						 TaxSubtotal1, 
						 currency.getISO_Code(), 
						 listaDet.gettaxamount(),
						 listaDet.getLineTotalAmt(),
						 listaDet.gettaxrate(),
						 orginfo.getTierRange(),						 
						 "ISC", // TaxTypeName
						 "EXC", // TextTaxTypeCode
						 "10",  // TextTaxExemptionReasonCode
						 "1000", // TaxCode
						 "48"); // TextAllowanceChargeReasonCode					

				}
				//1000 
				else if (items.getTaxSAmt().compareTo(BigDecimal.ZERO) > 0) {
					setTaxScheme(InvoiceLine, 
							 TaxSubtotal1, 
							 currency.getISO_Code(), 
							 listaDet.gettaxamount(),
							 listaDet.getLineTotalAmt(),
							 listaDet.gettaxrate(),
							 orginfo.getTierRange(),							 
							 "IGV",     // TaxTypeName
							 "VAT",     // TextTaxTypeCode
							 "10",      // TextTaxExemptionReasonCode
							 "1000", 	// TaxCode
							 "47");		// TextAllowanceChargeReasonCode			

				}
				//9995 - exportacion 
				else if (items.getTaxGAmt().compareTo(BigDecimal.ZERO) > 0) {
					//TaxExemptionReasonCode.appendChild(getDoc().createTextNode("40"));
				} 
				//9998 - inafecto
				else if (items.getTaxOAmt().compareTo(BigDecimal.ZERO) > 0) {
					//TaxExemptionReasonCode.appendChild(getDoc().createTextNode("30"));
				}
				//9997 - exonerado
				else if (items.getTaxEAmt().compareTo(BigDecimal.ZERO) > 0) {
					//TaxExemptionReasonCode.appendChild(getDoc().createTextNode("20"));
				}
				//9996 - gratuito
				else if (items.getTaxZAmt().compareTo(BigDecimal.ZERO) > 0) {
					//TaxExemptionReasonCode.appendChild(getDoc().createTextNode("17"));
				}
				//9999 - otros tributos
				else if (items.getTaxTAmt().compareTo(BigDecimal.ZERO) != 0) {
					Element TaxableAmount = getDoc().createElement("cbc:TaxableAmount");
					TaxableAmount.setAttributeNS(null, currencyID, currency.getISO_Code()); 
					TaxableAmount.appendChild(getDoc().createTextNode(listaDet.getTaxTBaseAmt().toString()));
					Element TaxAmount3 = getDoc().createElement("cbc:TaxAmount");
					//TaxAmount3.setAttributeNS(null, "currencyID", listaDet.getItem_moneda().trim()); //================>errror estaba con item..getItem_moneda()
					TaxAmount3.setAttributeNS(null, currencyID, currency.getISO_Code()); //================>errror estaba con item..getItem_moneda()
					TaxAmount3.setIdAttributeNS(null, currencyID, true);
					TaxSubtotal1.appendChild(TaxableAmount);
					TaxSubtotal1.appendChild(TaxAmount3);//se anade al grupo TaxSubtotal1
					//TaxAmount3.appendChild(getDoc().createTextNode(listaDet.getItem_ti_igv().trim()));
					TaxAmount3.appendChild(getDoc().createTextNode(listaDet.getTaxTAmt().toString()));

					log.info("generarXMLZipiadoFactura - tasa Igv ");
					Element Percent = getDoc().createElement("cbc:Percent");
					//TaxSubtotal1.appendChild(Percent);//se anade al grupo TaxSubtotal1
					//Percent.appendChild(getDoc().createTextNode("0.0"));
					//Percent.appendChild(getDoc().createTextNode(items.getTasa_igv().trim()));
					DecimalFormat df = new DecimalFormat("#,###.00");					
					Percent.appendChild(getDoc().createTextNode(df.format(listaDet.gettaxrate())));

					Element TaxCategory1 = getDoc().createElement("cac:TaxCategory");
					TaxSubtotal1.appendChild(TaxCategory1);//se anade al grupo TaxSubtotal1
					TaxCategory1.appendChild(Percent);
					//TaxCategory1.appendChild(getDoc().createTextNode("\n"));								
					TaxSubtotal1.appendChild(TaxCategory1);//se anade al grupo TaxSubtotal1

					// punto 40 Monto cargo del item
					if (items.getDiscount().compareTo(BigDecimal.ZERO) > 0) {
						Element allowanceCharge = getDoc().createElement("cac:Allowancecharge");
						InvoiceLine.appendChild(allowanceCharge);
						Element chargeindicator = getDoc().createElement("cbc:ChargeIndicator");
						chargeindicator.appendChild(getDoc().createTextNode("true"));
						Element AllowanceChargeReasonCode = getDoc().createElement("cbc:AllowanceChargeReasonCode");
						AllowanceChargeReasonCode.setAttributeNS(null, listAgencyName, "PE:SUNAT");
						AllowanceChargeReasonCode.setAttributeNS(null, listName, "Cargo/descuento");
						AllowanceChargeReasonCode.setAttributeNS(null, listURI, "urn:pe:gob:sunat.cpe:see:gem:catalogos:catalogo53");
						// 47 Cargos que afectan la base imponible del IGV/IVAP
						AllowanceChargeReasonCode.appendChild(getDoc().createTextNode("47"));
						Element MultiplierFactorNumeric = getDoc().createElement("cbc:MultiplierFactorNumeric");
						Element Amount = getDoc().createElement("cbc:Amount");
						Element BaseAmount = getDoc().createElement("cbc:BaseAmount");
						allowanceCharge.appendChild(chargeindicator);
						allowanceCharge.appendChild(AllowanceChargeReasonCode);
						allowanceCharge.appendChild(MultiplierFactorNumeric);
						allowanceCharge.appendChild(Amount);
						allowanceCharge.appendChild(BaseAmount);
					}


					Element TaxScheme1 = getDoc().createElement("cac:TaxScheme");
					TaxCategory1.appendChild(TaxScheme1);//se anade al grupo TaxCategory1
					//TaxScheme1.appendChild(getDoc().createTextNode("\n"));

					Element ID15 = getDoc().createElement("cbc:ID");
					ID15.setAttributeNS(null, schemeAgencyName, "PE:SUNAT");
					ID15.setAttributeNS(null, schemeName, "Codigo de tributos");
					ID15.setAttributeNS(null, schemeURI, "urn:pe:gob:sunat:cpe:see:gem:catalogos:catalogo05");
					ID15.appendChild(getDoc().createTextNode("9999")); ///================================faltaba poner 1000
					TaxScheme1.appendChild(ID15);//se anade al grupo TaxCategory1

					Element Name9 = getDoc().createElement("cbc:Name");
					TaxScheme1.appendChild(Name9);//se anade al grupo TaxCategory1
					Name9.appendChild(getDoc().createTextNode("OTROS"));

					Element TaxTypeCode = getDoc().createElement("cbc:TaxTypeCode");
					TaxScheme1.appendChild(TaxTypeCode);//se anade al grupo TaxScheme
					TaxTypeCode.appendChild(getDoc().createTextNode("OTH"));

					

					//PricingReference.appendChild(getDoc().createTextNode("\n"));

					//AlternativeConditionPrice.appendChild(getDoc().createTextNode("\n"));



					Element TaxTypeCode1 = getDoc().createElement("cbc:TaxTypeCode");
					//TaxScheme1.appendChild(TaxTypeCode1);//se anade al grupo TaxCategory1
					TaxTypeCode1.appendChild(getDoc().createTextNode("VAT"));
					//        fin IGV Item
		//------			


				}
				
				//---------------
				// 35 Monto ISC del item				
				if (product.getPriceTypeCode().equals(REF_PriceTypeCode.ValorReferencialUnitarioEnOperacionesNoOnerosas)) {
					//					Element AlternativeConditionPrice02 = getDoc().createElement("cac:AlternativeConditionPrice");
					//					PricingReference.appendChild(AlternativeConditionPrice02);//se anade al grupo PricingReference
					//					AlternativeConditionPrice02.appendChild(getDoc().createTextNode("\n"));
					//
					//					Element PriceAmount02 = getDoc().createElement("cbc:PriceAmount");
					//					//PriceAmount02.setAttributeNS(null, "currencyID", listaDet.getItem_moneda().trim());
					//					PriceAmount02.setAttributeNS(null, "currencyID", currency.getISO_Code());
					//					PriceAmount02.setIdAttributeNS(null, "currencyID", true);
					//					AlternativeConditionPrice02.appendChild(PriceAmount02);//se anade al grupo AlternativeConditionPrice
					//					//PriceAmount02.appendChild(getDoc().createTextNode(listaDet.getItem_pventa_nohonerosa().trim()));
					//					PriceAmount02.appendChild(getDoc().createTextNode(listaDet.getventa_noonerosa().toString()));
					//
					//					Element PriceTypeCode02 = getDoc().createElement("cbc:PriceTypeCode");
					//					AlternativeConditionPrice02.appendChild(PriceTypeCode02);//se anade al grupo AlternativeConditionPrice
					//					PriceTypeCode02.appendChild(getDoc().createTextNode("02")); //==>Para los casos de gatuito venta no Honerosa
				}

				//---------------
				//        Inicio ISC item
				if (listaDet.getitem_ti_isc().compareTo(BigDecimal.ZERO)!= 0) {

					Element TaxTotal2 = getDoc().createElement("cac:TaxTotal");
					InvoiceLine.appendChild(TaxTotal2);//se anade al grupo InvoiceLine
					//TaxTotal2.appendChild(getDoc().createTextNode("\n"));

					log.info("generarXMLZipiadoFactura - IGV ");
					Element TaxAmount22 = getDoc().createElement("cbc:TaxAmount");
					TaxAmount22.setAttributeNS(null, currencyID, currency.getISO_Code());
					TaxAmount22.setIdAttributeNS(null, currencyID, true);
					TaxTotal2.appendChild(TaxAmount22);//se anade al grupo TaxTotal1
					//TaxAmount22.appendChild(getDoc().createTextNode(listaDet.getItem_ti_isc().trim()));
					TaxAmount22.appendChild(getDoc().createTextNode(listaDet.getitem_base_isc().toString()));

					Element TaxSubtotal2 = getDoc().createElement("cac:TaxSubtotal");
					TaxTotal2.appendChild(TaxSubtotal2);//se anade al grupo TaxTotal1
					//TaxSubtotal2.appendChild(getDoc().createTextNode("\n"));

					//ISC
					Element TaxAmount32 = getDoc().createElement("cbc:TaxAmount");
					TaxAmount32.setAttributeNS(null, currencyID, currency.getISO_Code()); //================>errror estaba con item..getItem_moneda()
					TaxAmount32.setIdAttributeNS(null, currencyID, true);
					TaxSubtotal2.appendChild(TaxAmount32);//se anade al grupo TaxSubtotal1
					//TaxAmount32.appendChild(getDoc().createTextNode(listaDet.getItem_ti_isc().trim()));
					TaxAmount32.appendChild(getDoc().createTextNode(listaDet.getitem_ti_isc().toString()));

					Element TaxCategory12 = getDoc().createElement("cac:TaxCategory");
					TaxSubtotal2.appendChild(TaxCategory12);//se anade al grupo TaxSubtotal1
					//TaxCategory12.appendChild(getDoc().createTextNode("\n"));

					log.info("generarXMLZipiadoFactura - afectacion ");

					Element TierRange = getDoc().createElement("cbc:TierRange");
					TaxCategory12.appendChild(TierRange);//se anade al grupo TaxCategory1
					//TierRange.appendChild(getDoc().createTextNode(listaDet.getItem_isc_tier().trim()));
					TierRange.appendChild(getDoc().createTextNode(orginfo.getTierRange()));

					Element TaxScheme12 = getDoc().createElement("cac:TaxScheme");
					TaxCategory12.appendChild(TaxScheme12);//se anade al grupo TaxCategory1
					//TaxScheme12.appendChild(getDoc().createTextNode("\n"));

					Element ID152 = getDoc().createElement("cbc:ID");
					TaxScheme12.appendChild(ID152);//se anade al grupo TaxCategory1
					ID152.appendChild(getDoc().createTextNode("2000"));

					Element Name92 = getDoc().createElement("cbc:Name");
					TaxScheme12.appendChild(Name92);//se anade al grupo TaxCategory1
					Name92.appendChild(getDoc().createTextNode("ISC"));

					Element TaxTypeCode12 = getDoc().createElement("cbc:TaxTypeCode");
					TaxScheme12.appendChild(TaxTypeCode12);//se anade al grupo TaxCategory1
					TaxTypeCode12.appendChild(getDoc().createTextNode("EXC"));
					//        fin ISC Item
				}
				//---------------

				Element Item = getDoc().createElement("cac:Item");
				InvoiceLine.appendChild(Item);//se anade al grupo InvoiceLine
				//Item.appendChild(getDoc().createTextNode("\n"));

				Element Description = getDoc().createElement("cbc:Description");
				Item.appendChild(Description);//se anade al grupo Item
				//cdata = getDoc().createCDATASection(listaDet.getItem_descripcion().trim());
				CDATASection cdata = getDoc().createCDATASection(product.getName().trim());
				Description.appendChild(cdata);

				Element SellersItemIdentification = getDoc().createElement("cac:SellersItemIdentification");
				Item.appendChild(SellersItemIdentification);//se anade al grupo Item
				//SellersItemIdentification.appendChild(getDoc().createTextNode("\n"));

				Element ID18 = getDoc().createElement("cbc:ID");
				SellersItemIdentification.appendChild(ID18);//se anade al grupo Item
				//ID18.appendChild(getDoc().createTextNode(listaDet.getItem_codproducto().trim()));
				ID18.appendChild(getDoc().createTextNode(product.getValue().trim()));

				Element Price = getDoc().createElement("cac:Price");
				InvoiceLine.appendChild(Price);//se anade al grupo InvoiceLine
				//Price.appendChild(getDoc().createTextNode("\n"));

				Element PriceAmount2 = getDoc().createElement("cbc:PriceAmount");
				PriceAmount2.setAttributeNS(null, currencyID, currency.getISO_Code());
				PriceAmount2.setIdAttributeNS(null, currencyID, true);
				Price.appendChild(PriceAmount2);//se anade al grupo Price
				//PriceAmount2.appendChild(getDoc().createTextNode(listaDet.getItem_pventa().trim()));
				PriceAmount2.appendChild(getDoc().createTextNode(listaDet.getPriceActual().toString().trim()));
				SeqNo++;
			}

			log.info("generarXMLZipiadoBoleta - Prepara firma digital ");
			//sig.setId(items.getEmpr_nroruc());
			//sig.setId(p.getTaxID());
			//sig.setId(dateFormatted);
			sig.setId("obInvoiceSing"); 
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
			//Format xx = Format.getPrettyFormat();
			FileOutputStream f = new FileOutputStream(signatureFile);
			Transformer tf = TransformerFactory.newInstance().newTransformer();
			//tf.setOutputProperty(OutputKeys.ENCODING, "ISO-8859-1");
			tf.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
			tf.setOutputProperty(OutputKeys.INDENT, "yes");
			//tf.setOutputProperty(OutputKeys.STANDALONE, "no");
			//Writer out = new StringWriter();
			StreamResult sr = new StreamResult(f);
			//tf.transform(new DOMSource(getDoc()), sr);
			tf.transform(new DOMSource(getDoc()), sr);			
			sr.getOutputStream().close();

			log.info("generarXMLZipiadoBoleta - XML creado " + pathXMLFile);
			//====================== CREAR ZIP PARA EL ENVIO A SUNAT =======================
			resultado = GeneralFunctions.crearZip(m_bp, items, Tools.getInstance().getFile(), signatureFile);
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

	private void signature(Element invoice) {
		Element Signature = getDoc().createElement("cac:Signature");
		invoice.appendChild(Signature);
		//Signature.appendChild(getDoc().createTextNode("\n"));
		// ID
		Element ID6 = getDoc().createElement("cbc:ID");
		Signature.appendChild(ID6);
		ID6.appendChild(getDoc().createTextNode("IDSignKG"));
		// Signatory Party
		Element SignatoryParty = getDoc().createElement("cac:SignatoryParty");
		Signature.appendChild(SignatoryParty);
		//SignatoryParty.appendChild(getDoc().createTextNode("\n"));

		Element PartyIdentification = getDoc().createElement("cac:PartyIdentification");
		SignatoryParty.appendChild(PartyIdentification);
		//PartyIdentification.appendChild(getDoc().createTextNode("\n"));

		Element ID7 = getDoc().createElement("cbc:ID");
		PartyIdentification.appendChild(ID7);
		ID7.appendChild(getDoc().createTextNode(m_bp.getTaxID()));		
		//ID7.appendChild(getDoc().createTextNode(p.getTaxID()));

		Element PartyName = getDoc().createElement("cac:PartyName");
		SignatoryParty.appendChild(PartyName);
		//PartyName.appendChild(getDoc().createTextNode("\n"));

		Element Name = getDoc().createElement("cbc:Name");
		PartyName.appendChild(Name);
		Name.appendChild(getDoc().createTextNode(m_bp.getName()));
		//cdata = getDoc().createCDATASection(items.getEmpr_razonsocial().trim());
		//CDATASection cdata = getDoc().createCDATASection(p.getName().trim());
		//Name.appendChild(cdata);

		Element DigitalSignatureAttachment = getDoc().createElement("cac:DigitalSignatureAttachment");
		Signature.appendChild(DigitalSignatureAttachment);
		//DigitalSignatureAttachment.appendChild(getDoc().createTextNode("\n"));

		Element ExternalReference = getDoc().createElement("cac:ExternalReference");
		DigitalSignatureAttachment.appendChild(ExternalReference);
		//ExternalReference.appendChild(getDoc().createTextNode("\n"));

		Element URI = getDoc().createElement("cbc:URI");
		ExternalReference.appendChild(URI);
		//URI.appendChild(getDoc().createTextNode(items.getEmpr_nroruc().trim()));
		//URI.appendChild(getDoc().createTextNode(p.getTaxID()));
		URI.appendChild(getDoc().createTextNode("#SignST"));     
	}

	private void linecount(Element invoice, int len) {
		Element LineCount = getDoc().createElement("cbc:LineCountNumeric");
		LineCount.appendChild(getDoc().createTextNode(String.valueOf(len)));
		invoice.appendChild(LineCount);		
	}

	private void documentcurrency(Element invoice, String currency) {
		Element DocumentCurrencyCode = getDoc().createElement("cbc:DocumentCurrencyCode");
		invoice.appendChild(DocumentCurrencyCode);
		//DocumentCurrencyCode.appendChild(getDoc().createTextNode(items.getDocu_moneda().trim()));
		DocumentCurrencyCode.setAttributeNS(null, listID, "ISO 4217 Alpha");
		DocumentCurrencyCode.setAttributeNS(null, listName, "Currency");
		DocumentCurrencyCode.setAttributeNS(null, listAgencyName, "United Nations Economic Commission for Europe");
		DocumentCurrencyCode.appendChild(getDoc().createTextNode(currency));		
	}

	private void legends(Element invoice, List<X_S_DocLegend> leyendas) {
		for (X_S_DocLegend leyenda : leyendas) {
			Element Legend = getDoc().createElement("cbc:Note");
			invoice.appendChild(Legend);
			Legend.setAttributeNS(null, "languageLocaleID", leyenda.getLegend());
			//Legend.appendChild(getDoc().createTextNode("\n"));
			Legend.appendChild(getDoc().createTextNode(leyenda.gettext().trim()));
			invoice.appendChild(Legend);
		}				
	}

	private void invoicetypecode(Element invoice, String taxID) {
		Element InvoiceTypeCode = getDoc().createElement("cbc:InvoiceTypeCode");
		InvoiceTypeCode.setAttributeNS(null, listID, items.getInvoiceOperationTypeCode());
		InvoiceTypeCode.setAttributeNS(null, listAgencyName, "PE:SUNAT");
		//InvoiceTypeCode.setAttributeNS(null, listName, "Tipo de Documento");
		InvoiceTypeCode.setAttributeNS(null, "name", "Tipo de Operacion");
		//InvoiceTypeCode.setAttributeNS(null, listURI, "urn:pe:gob:sunat:cpe:see:gem:catalogos:catalogo01");
		InvoiceTypeCode.setAttributeNS(null, listSchemeURI, "urn:pe:gob:sunat:cpe:see:gem:catalogos:catalogo51");
		invoice.appendChild(InvoiceTypeCode);
		//InvoiceTypeCode.appendChild(getDoc().createTextNode(items.getDocu_tipodocumento().trim()));//DIFERENCIA ENTRE FAC Y ND Y NC
		InvoiceTypeCode.appendChild(getDoc().createTextNode(taxID));//DIFERENCIA ENTRE FAC Y ND Y NC		
	}

	private void dateinvoiced(Element invoice, String dateFormatted) {
		Element IssueDate = getDoc().createElement("cbc:IssueDate");
		invoice.appendChild(IssueDate);		
		//IssueDate.appendChild(getDoc().createTextNode(items.getDocu_fecha().trim()));
		IssueDate.appendChild(getDoc().createTextNode(dateFormatted));		
	}

	private void numerationDocument(Element invoice) {
		Element ID5 = getDoc().createElement("cbc:ID");
		invoice.appendChild(ID5);
		//ID5.appendChild(getDoc().createTextNode(items.getDocu_numero().trim()));
		ID5.appendChild(getDoc().createTextNode(items.getDocumentNo().trim()));		
	}

	private void versionCustomization(Element invoice) {
		Element CustomizationID = getDoc().createElement("cbc:CustomizationID");
		invoice.appendChild(CustomizationID);
		CustomizationID.appendChild(getDoc().createTextNode("2.0"));		
	}

	private void versionUBL(Element invoice) {
		Element UBLVersionID = getDoc().createElement("cbc:UBLVersionID");
		invoice.appendChild(UBLVersionID);
		UBLVersionID.appendChild(getDoc().createTextNode("2.1"));		
	}

	private Document getDoc() {
		if (doc == null) {
			try {
			if (dbf == null) {
				dbf = javax.xml.parsers.DocumentBuilderFactory.newInstance();
			//	Firma XML genera espacio para los nombres o tag
				dbf.setNamespaceAware(true);
				db = dbf.newDocumentBuilder();
			}										
			//////////////////////////////////////////////////
			doc = db.newDocument();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return doc;
	}

	private void setTaxScheme(Element InvoiceLine, 
					  Element TaxSubtotal1, 
						String currency, 
						BigDecimal BDAmount, 
						BigDecimal LineTotalAmount,
						BigDecimal BDTaxRate, 
						String TextTierRange, 
						String TaxTypeName, 
						String TextTaxTypeCode,
						String TextTaxExemptionReasonCode,
						String TaxCode,
						String TextAllowanceChargeReasonCode)  {		
		Element TaxableAmount = getTaxableAmount(currency, BDAmount);
		TaxSubtotal1.appendChild(TaxableAmount);
		
		Element TaxAmount = getTaxAmount(currency, BDAmount);
		TaxSubtotal1.appendChild(TaxAmount);
		
		Element TaxCategory1 = getDoc().createElement("cac:TaxCategory");

		Element Percent = getDoc().createElement("cbc:Percent");			
		DecimalFormat df = new DecimalFormat("#,###.00");
		Percent.appendChild(getDoc().createTextNode(df.format(BDTaxRate)));
		TaxCategory1.appendChild(Percent);

		Element TaxExemptionReasonCode = getDoc().createElement("cbc:TaxExemptionReasonCode");
		//TaxExemptionReasonCode.appendChild(getDoc().createTextNode(listaDet.getItem_afectacion().trim()));
		TaxExemptionReasonCode.setAttributeNS(null, listAgencyName, "PE:SUNAT");
		TaxExemptionReasonCode.setAttributeNS(null, listName, "Afectacion del IGV");
		TaxExemptionReasonCode.setAttributeNS(null, listURI, "urn:pe:gob:sunat:cpe:see:gem:catalogos:catalogo07");					
		//TaxExemptionReasonCode.appendChild(getDoc().createTextNode("10"));
		TaxExemptionReasonCode.appendChild(getDoc().createTextNode(TextTaxExemptionReasonCode));		
		TaxCategory1.appendChild(TaxExemptionReasonCode);//se anade al grupo TaxCategory1					
		
		if (TextTierRange != null) {
			Element TierRange = getDoc().createElement("cbc:TierRange");
			TierRange.appendChild(getDoc().createTextNode(TextTierRange));
			TaxCategory1.appendChild(TierRange);
		}

		Element TaxScheme1 = getDoc().createElement("cac:TaxScheme");
		TaxCategory1.appendChild(TaxScheme1);//se anade al grupo TaxCategory1
		//TaxScheme1.appendChild(getDoc().createTextNode("\n"));

		Element ID15 = getDoc().createElement("cbc:ID");
		ID15.setAttributeNS(null, schemeAgencyName, "PE:SUNAT");
		ID15.setAttributeNS(null, schemeName, "Codigo de tributos");
		ID15.setAttributeNS(null, schemeURI, "urn:pe:gob:sunat:cpe:see:gem:catalogos:catalogo05");
		ID15.appendChild(getDoc().createTextNode(TaxCode));
		TaxScheme1.appendChild(ID15);//se anade al grupo TaxCategory1

		Element Name9 = getDoc().createElement("cbc:Name");
		TaxScheme1.appendChild(Name9);//se anade al grupo TaxCategory1
		//Name9.appendChild(getDoc().createTextNode("ISC"));
		Name9.appendChild(getDoc().createTextNode(TaxTypeName));

		Element TaxTypeCode = getDoc().createElement("cbc:TaxTypeCode");
		TaxScheme1.appendChild(TaxTypeCode);//se anade al grupo TaxScheme
		//TaxTypeCode.appendChild(getDoc().createTextNode("EXC"));
		TaxTypeCode.appendChild(getDoc().createTextNode(TextTaxTypeCode));


		TaxSubtotal1.appendChild(TaxCategory1);//se anade al grupo TaxSubtotal1
		
		// punto 38 Valor de venta del item
		Element lineextensionamount = getDoc().createElement("cbc:LineExtensionAmount");
		lineextensionamount.setAttributeNS(null, currencyID, currency);
		//lineextensionamount.appendChild(getDoc().createTextNode(listaDet.getLineTotalAmt().toString()));
		lineextensionamount.appendChild(getDoc().createTextNode(LineTotalAmount.toString()));		
		InvoiceLine.appendChild(lineextensionamount);
		
		// punto 40 Monto cargo del item
		if (items.getDiscount().compareTo(BigDecimal.ZERO) > 0) {
			Element allowanceCharge = getDoc().createElement("cac:Allowancecharge");
			InvoiceLine.appendChild(allowanceCharge);
			Element chargeindicator = getDoc().createElement("cbc:ChargeIndicator");
			chargeindicator.appendChild(getDoc().createTextNode("true"));
			Element AllowanceChargeReasonCode = getDoc().createElement("cbc:AllowanceChargeReasonCode");
			AllowanceChargeReasonCode.setAttributeNS(null, listAgencyName, "PE:SUNAT");
			AllowanceChargeReasonCode.setAttributeNS(null, listName, "Cargo/descuento");
			AllowanceChargeReasonCode.setAttributeNS(null, listURI, "urn:pe:gob:sunat.cpe:see:gem:catalogos:catalogo53");
			// 48 Cargos que no afectan la base imponible del IGV/IVAP
			//AllowanceChargeReasonCode.appendChild(getDoc().createTextNode("48"));
			AllowanceChargeReasonCode.appendChild(getDoc().createTextNode(TextAllowanceChargeReasonCode));
			Element MultiplierFactorNumeric = getDoc().createElement("cbc:MultiplierFactorNumeric");
			Element Amount = getDoc().createElement("cbc:Amount");
			Element BaseAmount = getDoc().createElement("cbc:BaseAmount");
			allowanceCharge.appendChild(chargeindicator);
			allowanceCharge.appendChild(AllowanceChargeReasonCode);
			allowanceCharge.appendChild(MultiplierFactorNumeric);
			allowanceCharge.appendChild(Amount);
			allowanceCharge.appendChild(BaseAmount);
		}		
	}


	private Element getTaxAmount(String currency, BigDecimal taxamount)  {		
		Element TaxAmount = getDoc().createElement("cbc:TaxAmount");
		TaxAmount.setAttributeNS(null, currencyID, currency); //================>errror estaba con item..getItem_moneda()
		TaxAmount.setIdAttributeNS(null, currencyID, true);
		TaxAmount.appendChild(getDoc().createTextNode(taxamount.toString()));		
		return TaxAmount;
	}

	private Element getTaxableAmount(String currency, BigDecimal taxableamount)  {
		Element TaxableAmount = getDoc().createElement("cbc:TaxableAmount");					
		TaxableAmount.setAttributeNS(null, currencyID, currency); 
		TaxableAmount.appendChild(getDoc().createTextNode(taxableamount.setScale(2, BigDecimal.ROUND_HALF_UP).toPlainString()));
		//element.appendChild(TaxableAmount);
		return TaxableAmount;
	}

}
