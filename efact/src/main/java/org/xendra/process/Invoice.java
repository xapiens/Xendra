package org.xendra.process;

import java.io.File;
import java.io.FileOutputStream;
import java.math.BigDecimal;
import java.security.PrivateKey;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import java.security.cert.X509Certificate;

import org.apache.xml.security.signature.XMLSignature;
import org.apache.xml.security.transforms.Transforms;
import org.apache.xml.security.utils.Constants;
import org.apache.xml.security.utils.ElementProxy;
import org.compiere.model.MBPartner;
import org.compiere.model.MBPartnerCertificate;
import org.compiere.model.MBPartnerLocation;
import org.compiere.model.MCurrency;
import org.compiere.model.MDocLog;
import org.compiere.model.MDocType;
import org.compiere.model.MOrgInfo;
import org.compiere.model.MProduct;
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
import org.compiere.model.reference.REF_ECE_5153;
import org.compiere.model.reference.REF_ECE_5305;
import org.compiere.model.reference.REF_PriceTypeCode;
import org.compiere.model.reference.REF_TaxTypeCode;
import org.compiere.util.Env;
import org.w3c.dom.CDATASection;
import org.w3c.dom.Element;
import org.xendra.efact.EFactConstants;
import org.xendra.efact.process.GeneralFunctions;
import org.xendra.efact.util.LecturaXML;
import org.xendra.efact.util.Tools;

public class Invoice extends EFactDocument {

	public Invoice(X509Certificate cert, MBPartner m_bp, MBPartnerCertificate m_bp_cert, PrivateKey privateKey, X_S_DocHeader items) {
		super(cert, m_bp, m_bp_cert, privateKey, items);
	}
	
	public String creaXml(X_S_DocHeader items, 
			List<X_S_DocLine> detdocelec, 
			List<X_S_DocAdvance> anticipos,
			List<X_S_DocLegend> leyendas, 
			List<X_S_DocLineOthers> otrosDetalles) {
		String resultado = "";		
		try {
			ElementProxy.setDefaultPrefix(Constants.SignatureSpecNS, "ds");			
			///
			MBPartner p = new Query(Env.getCtx(), MBPartner.Table_Name, "C_BPartner_ID = ?", null)
					.setParameters(items.getC_BPartner_ID()).first();
			X_C_BP_DocType bpdt = new Query(Env.getCtx(), X_C_BP_DocType.Table_Name, "C_BP_DocType_ID = ?", null)
					.setParameters(p.getC_BP_DocType_ID()).first();			
			MBPartnerLocation pl = new Query(Env.getCtx(), MBPartnerLocation.Table_Name, "C_BPartner_ID = ? AND isbillto = 'Y'", null)
					.setParameters(p.getC_BPartner_ID()).first();			
			MDocType dt = new Query(Env.getCtx(), MDocType.Table_Name, "C_DocType_ID = ?", null)
					.setParameters(items.getC_DocType_ID()).first();
			X_C_DocumentTax taxdoc = new Query(Env.getCtx(), X_C_DocumentTax.Table_Name, "C_DocumentTax_ID = ?", null)
					.setParameters(dt.getC_DocumentTax_ID()).first();
			MCurrency currency = new Query(Env.getCtx(), MCurrency.Table_Name, "C_Currency_ID = ?", null)
					.setParameters(items.getC_Currency_ID()).first();
			MOrgInfo orginfo = new Query(Env.getCtx(), MOrgInfo.Table_Name,"AD_Org_ID = ?", null)
					.setParameters(items.getAD_Org_ID()).first();
			///
			X_C_BP_DocType m_bpdt = new Query(Env.getCtx(), X_C_BP_DocType.Table_Name, "C_BP_DocType_ID = ?", null)
					.setParameters(m_bp.getC_BP_DocType_ID()).first();
			MBPartnerLocation m_p1 = new Query(Env.getCtx(), MBPartnerLocation.Table_Name, "C_BPartner_ID = ? AND isbillto = 'Y'", null)
					.setParameters(m_bp.getC_BPartner_ID()).first();
			
			log.info("generarXMLZipiadoFactura - Lectura de certificado");
			CDATASection cdata;
			log.info("generarXMLZipiadoFactura - Iniciamos la generacion del XML");
			//pathXMLFile = unidadEnvio + m_bp.getTaxID() + "-" + taxdoc.getTaxID() + "-" + items.getDocumentNo() + ".xml";
			//String pathXMLFile = unidadEnvio + m_bp.getTaxID() +"-"+ taxdoc.getTaxID()+ "-" + items.getDocumentNo() + ".xml";
			String pathXMLFile = getFile("xml");
			File signatureFile = new File(pathXMLFile);
			//
			javax.xml.parsers.DocumentBuilderFactory dbf = javax.xml.parsers.DocumentBuilderFactory.newInstance();
			// Firma XML genera espacio para los nombres o tag
			dbf.setNamespaceAware(true);
			javax.xml.parsers.DocumentBuilder db = dbf.newDocumentBuilder();
			org.w3c.dom.Document doc = db.newDocument();
			//
			log.info("generarXMLZipiadoFactura - cabecera XML");
			Element envelope = doc.createElementNS("","Invoice");
			envelope.setAttributeNS(Constants.NamespaceSpecNS, "xmlns", "urn:oasis:names:specification:ubl:schema:xsd:Invoice-2");
			envelope.setAttributeNS(Constants.NamespaceSpecNS, "xmlns:cac","urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2");
			envelope.setAttributeNS(Constants.NamespaceSpecNS, "xmlns:cbc", "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2");
			envelope.setAttributeNS(Constants.NamespaceSpecNS, "xmlns:ccts", "urn:un:unece:uncefact:documentation:2");
			envelope.setAttributeNS(Constants.NamespaceSpecNS, "xmlns:ds", "http://www.w3.org/2000/09/xmldsig#");
			envelope.setAttributeNS(Constants.NamespaceSpecNS, "xmlns:ext", "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2");
			envelope.setAttributeNS(Constants.NamespaceSpecNS, "xmlns:qdt", "urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2");

			envelope.setAttributeNS(Constants.NamespaceSpecNS, "xmlns:udt", "urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2");
			envelope.setAttributeNS(Constants.NamespaceSpecNS, "xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
			envelope.appendChild(doc.createTextNode("\n"));
			//doc.appendChild(doc.createComment(" Preamble "));
			doc.appendChild(envelope);
			//doc.appendChild(doc.createComment(" Postamble "));

			//padre
			//Element UBLExtensions = doc.createElementNS("", "ext:UBLExtensions");
			//envelope.appendChild(UBLExtensions);
			//1 grupo
			//Element UBLExtension = doc.createElementNS("", "ext:UBLExtension");
			//envelope.appendChild(UBLExtension);
			//Element ExtensionContent = doc.createElementNS("", "ext:ExtensionContent");
			//envelope.appendChild(ExtensionContent);


			//El baseURI es la URI que se utiliza para anteponer a URIs relativos
			String BaseURI = signatureFile.toURI().toURL().toString();
			//Crea un XML Signature objeto desde el documento, BaseURI and signature algorithm (in this case RSA)
			//XMLSignature sig = new XMLSignature(doc, BaseURI, XMLSignature.ALGO_ID_SIGNATURE_RSA); Cadena URI que se ajusta a la sintaxis URI y representa el archivo XML de entrada
			XMLSignature sig = new XMLSignature(doc, BaseURI, XMLSignature.ALGO_ID_SIGNATURE_RSA);

			//ExtensionContent.appendChild(sig.getElement());
			//UBLExtension.appendChild(ExtensionContent);
			//UBLExtensions.appendChild(UBLExtension);

			//bloque1
			Element UBLVersionID = doc.createElementNS("", "cbc:UBLVersionID");
			envelope.appendChild(UBLVersionID);
			UBLVersionID.appendChild(doc.createTextNode("2.1"));

			Element CustomizationID = doc.createElementNS("", "cbc:CustomizationID");
			envelope.appendChild(CustomizationID);
			CustomizationID.appendChild(doc.createTextNode("2.0"));

			Element ID5 = doc.createElementNS("", "cbc:ID");
			envelope.appendChild(ID5);
			ID5.appendChild(doc.createTextNode(items.getDocumentNo().trim()));            
			Element IssueDate = doc.createElementNS("", "cbc:IssueDate");
			envelope.appendChild(IssueDate);
			String dateFormatted = new SimpleDateFormat("yyyy-MM-dd").format(items.getDateInvoiced());
			IssueDate.appendChild(doc.createTextNode(dateFormatted));

			//fecha de generacion nuevo
			Element IssueTime = doc.createElementNS("", "cbc:IssueTime");
			envelope.appendChild(IssueTime);
			String timeFormatted = new SimpleDateFormat("HH:mm:ss").format(items.getDateInvoiced());
			IssueTime.appendChild(doc.createTextNode(timeFormatted));
			//fecha de vencimiento
			if (items.getDueDate() != null) {
				Element DueDate = doc.createElementNS("", "cbc:DueDate");
				envelope.appendChild(DueDate);
				String duedate = new SimpleDateFormat("yyyy-MM-dd").format(items.getDueDate());
				DueDate.appendChild(doc.createTextNode(duedate));
			}

			Element InvoiceTypeCode = doc.createElementNS("", "cbc:InvoiceTypeCode");
			envelope.appendChild(InvoiceTypeCode);

			InvoiceTypeCode.setAttribute("listID", items.getAdditionalInformation()); // tipo de Operacion antes catalogo Catalogo 17 (2 digitos) ahora catalogo 51 (4 digtos)
			InvoiceTypeCode.setAttribute("listAgencyName", "PE:SUNAT");
			InvoiceTypeCode.setAttribute("listName", "Tipo de Documento");
			InvoiceTypeCode.setAttribute("name", "Tipo de Operacion");
			InvoiceTypeCode.setAttribute("listURI", "urn:pe:gob:sunat:cpe:see:gem:catalogos:catalogo01");
			InvoiceTypeCode.setAttribute("listSchemeURI", "urn:pe:gob:sunat:cpe:see:gem:catalogos:catalogo51");
			InvoiceTypeCode.appendChild(doc.createTextNode(taxdoc.getTaxID()));
			//---------------------------
			//leyendas
			for (X_S_DocLegend leyenda : leyendas) {

				Element Note = doc.createElementNS("", "cbc:Note");
				envelope.appendChild(Note);

				Note.setAttribute("languageLocaleID", leyenda.getCode().trim());
				Note.appendChild(doc.createTextNode(leyenda.gettext().trim()));//?

			}
			//----     moneda 
			Element DocumentCurrencyCode = doc.createElementNS("", "cbc:DocumentCurrencyCode");
			envelope.appendChild(DocumentCurrencyCode);
			DocumentCurrencyCode.setAttribute("listID", "ISO 4217 Alpha");
			DocumentCurrencyCode.setAttribute("listName", "Currency");
			DocumentCurrencyCode.setAttribute("listAgencyName", "United Nations Economic Commission for Europe");            
			//DocumentCurrencyCode.appendChild(doc.createTextNode(items.getDocu_moneda().trim()));
			DocumentCurrencyCode.appendChild(doc.createTextNode(currency.getISO_Code()));
			// cantidad de Items de venta
			Element LineCountNumeric = doc.createElementNS("", "cbc:LineCountNumeric");
			//duro
			envelope.appendChild(LineCountNumeric);
			LineCountNumeric.appendChild(doc.createTextNode(String.valueOf(detdocelec.size())));
			// pago cero por anticipos
			//if (!items.getDocu_anticipo_total().equals("0.00") && "0.00".equals(items.getDocu_total().trim())) {
			if (!items.getdoc_anticipo_total().equals(BigDecimal.ZERO) && (items.getGrandTotal().equals(BigDecimal.ZERO))) {

				anticipos.forEach((listaAnt) -> {
					Element AdditionalDocumentReferenceAnticipo = doc.createElementNS("", "cac:AdditionalDocumentReference");
					envelope.appendChild(AdditionalDocumentReferenceAnticipo);

					Element IDantf = doc.createElementNS("", "cbc:ID");
					//IDantf.setAttribute("schemeID", items.getDocu_tipodocumento().trim());
					AdditionalDocumentReferenceAnticipo.appendChild(IDantf);                    
					IDantf.appendChild(doc.createTextNode(listaAnt.getdocu_anticipo_docu_numero().trim()));
					// tipo de documento
					Element cbcDocumentTypeCode = doc.createElementNS("", "cbc:DocumentTypeCode");
					AdditionalDocumentReferenceAnticipo.appendChild(cbcDocumentTypeCode);
					cbcDocumentTypeCode.setAttribute("listName", "Documento Relacionado");
					cbcDocumentTypeCode.setAttribute("listAgencyName", "PE:SUNAT");
					cbcDocumentTypeCode.setAttribute("listURI", "urn:pe:gob:sunat:cpe:see:gem:catalogos:catalogo12");
					cbcDocumentTypeCode.appendChild(doc.createTextNode(listaAnt.getdocu_anticipo_docu_tipo().trim()));

					// estado del documento
					Element cbcDocumentStatusCode = doc.createElementNS("", "cbc:DocumentStatusCode");
					AdditionalDocumentReferenceAnticipo.appendChild(cbcDocumentStatusCode);
					cbcDocumentStatusCode.setAttribute("listName", "Anticipo");
					cbcDocumentStatusCode.setAttribute("listAgencyName", "PE:SUNAT");
					cbcDocumentStatusCode.appendChild(doc.createTextNode(listaAnt.getdocu_anticipo_docu_numero().trim()));

					// emisor del anticipo
					Element cacIssuerParty = doc.createElementNS("", "cac:IssuerParty");
					AdditionalDocumentReferenceAnticipo.appendChild(cacIssuerParty);

					Element cacPartyIdentification = doc.createElementNS("", "cac:PartyIdentification");
					cacIssuerParty.appendChild(cacPartyIdentification);
					Element cbdId = doc.createElementNS("", "cbc:ID");
					cacPartyIdentification.appendChild(cbdId);
					cbdId.setAttribute("schemeID", listaAnt.getdocu_anticipo_tipo_docu_emi().trim());
					cbdId.setAttribute("schemeName", "Documento de Identidad");
					cbdId.setAttribute("schemeAgencyName", "PE:SUNAT");
					cbdId.setAttribute("schemeURI", "urn:pe:gob:sunat:cpe:see:gem:catalogos:catalogo06");
					cbdId.appendChild(doc.createTextNode(listaAnt.getdocu_anticipo_numero_docu_emi().trim()));
				});
			}
			//bloque2 cac:Signature--------------------------------------------------------
			Element Signature = doc.createElementNS("", "cac:Signature");
			envelope.appendChild(Signature);
			Signature.appendChild(doc.createTextNode("\n"));

			Element ID6 = doc.createElementNS("", "cbc:ID");
			Signature.appendChild(ID6);
			ID6.appendChild(doc.createTextNode("obInvoiceSign"));

			Element SignatoryParty = doc.createElementNS("", "cac:SignatoryParty");
			Signature.appendChild(SignatoryParty);
			SignatoryParty.appendChild(doc.createTextNode("\n"));

			Element PartyIdentification = doc.createElementNS("", "cac:PartyIdentification");
			SignatoryParty.appendChild(PartyIdentification);
			PartyIdentification.appendChild(doc.createTextNode("\n"));

			Element ID7 = doc.createElementNS("", "cbc:ID");
			PartyIdentification.appendChild(ID7);
			//ID7.appendChild(doc.createTextNode(items.getEmpr_nroruc().trim()));
			ID7.appendChild(doc.createTextNode(p.getTaxID()));

			Element PartyName = doc.createElementNS("", "cac:PartyName");
			SignatoryParty.appendChild(PartyName);
			PartyName.appendChild(doc.createTextNode("\n"));

			Element Name = doc.createElementNS("", "cbc:Name");
			PartyName.appendChild(Name);
			//cdata = doc.createCDATASection(items.getEmpr_razonsocial().trim());
			cdata = doc.createCDATASection(p.getName().trim());
			Name.appendChild(cdata);

			Element DigitalSignatureAttachment = doc.createElementNS("", "cac:DigitalSignatureAttachment");
			Signature.appendChild(DigitalSignatureAttachment);
			DigitalSignatureAttachment.appendChild(doc.createTextNode("\n"));

			Element ExternalReference = doc.createElementNS("", "cac:ExternalReference");
			DigitalSignatureAttachment.appendChild(ExternalReference);
			ExternalReference.appendChild(doc.createTextNode("\n"));

			Element URI = doc.createElementNS("", "cbc:URI");
			ExternalReference.appendChild(URI);
			URI.appendChild(doc.createTextNode("#obInvoiceSign"));
			//bloque3 cac:AccountingSupplierParty emisor -----------------------------------------

			Element AccountingSupplierParty = doc.createElementNS("", "cac:AccountingSupplierParty");
			envelope.appendChild(AccountingSupplierParty);
			AccountingSupplierParty.appendChild(doc.createTextNode("\n"));

			Element Party = doc.createElementNS("", "cac:Party");
			AccountingSupplierParty.appendChild(Party);
			Party.appendChild(doc.createTextNode("\n"));

			Element cacPartyIdentification2 = doc.createElementNS("", "cac:PartyIdentification");

			Party.appendChild(cacPartyIdentification2);
			Element cbdId2 = doc.createElementNS("", "cbc:ID");
			cacPartyIdentification2.appendChild(cbdId2);
			//cbdId2.setAttribute("schemeID", items.getEmpr_tipodoc().trim());			
			//cbdId2.setAttribute("schemeID", items.getAdditionalInformation().trim());
			cbdId2.setAttribute("schemeID", bpdt.getTaxID());
			cbdId2.setAttribute("schemeName", "Documento de Identidad");
			cbdId2.setAttribute("schemeAgencyName", "PE:SUNAT");
			cbdId2.setAttribute("schemeURI", "urn:pe:gob:sunat:cpe:see:gem:catalogos:catalogo06");
			//cbdId2.appendChild(doc.createTextNode(items.getEmpr_nroruc().trim()));
			cbdId2.appendChild(doc.createTextNode(p.getTaxID().trim()));

			Element PartyName1 = doc.createElementNS("", "cac:PartyName");
			Party.appendChild(PartyName1);//se anade al grupo party
			PartyName1.appendChild(doc.createTextNode("\n"));

			Element Name2 = doc.createElementNS("", "cbc:Name");
			PartyName1.appendChild(Name2);//se anade al grupo partyname1
			//cdata = doc.createCDATASection(items.getEmpr_razonsocial().trim());
			cdata = doc.createCDATASection(p.getName().trim());
			Name2.appendChild(cdata);

			Element PartyLegalEntity = doc.createElementNS("", "cac:PartyLegalEntity");
			Party.appendChild(PartyLegalEntity);//se anade al grupo party
			PartyLegalEntity.appendChild(doc.createTextNode("\n"));

			Element RegistrationName = doc.createElementNS("", "cbc:RegistrationName");
			PartyLegalEntity.appendChild(RegistrationName);//se anade al grupo Country
			//cdata = doc.createCDATASection(items.getEmpr_razonsocial().trim());
			cdata = doc.createCDATASection(p.getName().trim());
			RegistrationName.appendChild(cdata);

			Element RegistrationAddress = doc.createElementNS("", "cac:RegistrationAddress");
			PartyLegalEntity.appendChild(RegistrationAddress);

			Element AddressTypeCode = doc.createElementNS("", "cbc:AddressTypeCode");
			RegistrationAddress.appendChild(AddressTypeCode);
			//AddressTypeCode.appendChild(doc.createTextNode(items.getEmpr_local().trim()));
			AddressTypeCode.appendChild(doc.createTextNode(pl.getName()));
			//
			// bloque4 datos del cliente
			//
			Element AccountingCustomerParty = doc.createElementNS("", "cac:AccountingCustomerParty");
			envelope.appendChild(AccountingCustomerParty);
			AccountingCustomerParty.appendChild(doc.createTextNode("\n"));

			Element Party1 = doc.createElementNS("", "cac:Party");
			AccountingCustomerParty.appendChild(Party1);//se anade al grupo AccountingCustomerParty
			Party1.appendChild(doc.createTextNode("\n"));

			//new
			Element cacPartyIdentification3 = doc.createElementNS("", "cac:PartyIdentification");

			Party1.appendChild(cacPartyIdentification3);

			Element cbdId3 = doc.createElementNS("", "cbc:ID");
			cacPartyIdentification3.appendChild(cbdId3);
			//cbdId3.setAttribute("schemeID", items.getClie_tipodoc().trim());
			cbdId3.setAttribute("schemeID", m_bpdt.getTaxID());
			cbdId3.setAttribute("schemeName", "Documento de Identidad");
			cbdId3.setAttribute("schemeAgencyName", "PE:SUNAT");
			cbdId3.setAttribute("schemeURI", "urn:pe:gob:sunat:cpe:see:gem:catalogos:catalogo06");
			//cbdId3.appendChild(doc.createTextNode(items.getClie_numero().trim()));
			cbdId3.appendChild(doc.createTextNode(m_bp.getTaxID().trim()));

			Element PartyLegalEntity1 = doc.createElementNS("", "cac:PartyLegalEntity");
			Party1.appendChild(PartyLegalEntity1);//se anade al grupo Party1
			PartyLegalEntity1.appendChild(doc.createTextNode("\n"));

			Element RegistrationName1 = doc.createElementNS("", "cbc:RegistrationName");
			PartyLegalEntity1.appendChild(RegistrationName1);//se anade al grupo PartyLegalEntity1
			//cdata = doc.createCDATASection(items.getClie_nombre().trim());
			cdata = doc.createCDATASection(m_bp.getName().trim());
			RegistrationName1.appendChild(cdata);

			// detraccion
			if (items.getempr_cta_banco_nacion_detraccion().length() > 0) {
				// cta de la nacion
				Element PaymentMeans = doc.createElementNS("", "cac:PaymentMeans");
				envelope.appendChild(PaymentMeans);

				Element ID = doc.createElementNS("", "cbc:ID");
				PaymentMeans.appendChild(ID);
				ID.appendChild(doc.createTextNode("Detraccion"));


				Element PaymentMeansCode = doc.createElementNS("", "cbc:PaymentMeansCode");
				PaymentMeans.appendChild(PaymentMeansCode);
				PaymentMeansCode.setAttribute("listID", "UN/ECE 4461");
				PaymentMeansCode.appendChild(doc.createTextNode("001"));

				Element PayeeFinancialAccount = doc.createElementNS("", "cac:PayeeFinancialAccount");
				PaymentMeans.appendChild(PayeeFinancialAccount);

				Element PayeeFinancialAccountID = doc.createElementNS("", "cbc:ID");
				PayeeFinancialAccount.appendChild(PayeeFinancialAccountID);
				PayeeFinancialAccountID.appendChild(doc.createTextNode(items.getempr_cta_banco_nacion_detraccion().trim()));

				//importe
				Element PaymentTerms = doc.createElementNS("", "cac:PaymentTerms");
				envelope.appendChild(PaymentTerms);

				Element ID2 = doc.createElementNS("", "cbc:ID");
				PaymentTerms.appendChild(ID2);
				ID2.appendChild(doc.createTextNode("Detraccion"));


				Element PaymentTermsID = doc.createElementNS("", "cbc:PaymentMeansID");
				PaymentTerms.appendChild(PaymentTermsID);
				PaymentTermsID.setAttribute("schemeName", "Codigo de detraccion");
				PaymentTermsID.setAttribute("schemeAgencyName", "PE:SUNAT");
				PaymentTermsID.setAttribute("schemeURI", "urn:pe:gob:sunat:cpe:see:gem:catalogos:catalogo54");
				PaymentTermsID.appendChild(doc.createTextNode(items.getdocu_codigo_bien_detraccion().trim()));

				Element PaymentPercent = doc.createElementNS("", "cbc:PaymentPercent");
				PaymentTerms.appendChild(PaymentPercent);
				PaymentPercent.appendChild(doc.createTextNode(items.getdocu_tasa_detraccion().trim()));
				Element Amount = doc.createElementNS("", "cbc:Amount");
				PaymentTerms.appendChild(Amount);
				Amount.setAttribute("currencyID", "PEN"); // Siempre debe ser PEN                    
				Amount.appendChild(doc.createTextNode(items.getdocu_detraccion().toString().trim()));

			}

			//detalle anticpos
			for (X_S_DocAdvance listaAnt : anticipos) {

				Element PrepaidPayment = doc.createElementNS("", "cac:PrepaidPayment");
				envelope.appendChild(PrepaidPayment);

				Element cbdId4 = doc.createElementNS("", "cbc:ID");
				PrepaidPayment.appendChild(cbdId4);
				cbdId4.setAttribute("schemeName", "Anticipo");
				cbdId4.setAttribute("schemeAgencyName", "PE:SUNAT");
				cbdId4.appendChild(doc.createTextNode(listaAnt.getdocu_anticipo_docu_numero().trim()));

				Element PaidAmount = doc.createElementNS("", "cbc:PaidAmount");
				PrepaidPayment.appendChild(PaidAmount);
				//PaidAmount.setAttribute("currencyID", items.getDocu_moneda().trim());
				PaidAmount.setAttribute("currencyID", currency.getISO_Code());
				PaidAmount.appendChild(doc.createTextNode(listaAnt.getdocu_anticipo_prepago().trim()));

				Element PaidDate = doc.createElementNS("", "cbc:PaidDate");
				PrepaidPayment.appendChild(PaidDate);
				PaidDate.appendChild(doc.createTextNode(listaAnt.getdocu_anticipo_fecha_emi().trim()));

				Element PaidTime = doc.createElementNS("", "cbc:PaidTime");
				PrepaidPayment.appendChild(PaidTime);
				PaidTime.appendChild(doc.createTextNode(listaAnt.getdocu_anticipo_hora_emi().trim()));

			}
			// Tasas del documento            
			Element TaxTotal = doc.createElementNS("", "cac:TaxTotal");
			envelope.appendChild(TaxTotal);
			TaxTotal.appendChild(doc.createTextNode("\n"));

			Element TaxAmount = doc.createElementNS("", "cbc:TaxAmount");
			TaxTotal.appendChild(TaxAmount);
			//TaxAmount.setAttribute("currencyID", items.getDocu_moneda().trim());
			TaxAmount.setAttribute("currencyID", currency.getISO_Code().trim());
			//se anade al grupo TaxTotal
			TaxAmount.appendChild(doc.createTextNode(items.getTaxAmt().toString().trim()));  //va igv?

			//bloque 5 IGV  // gravada
			//if (!"0.00".equals(items.getdocu_igv().trim())) {
			//if (items.getTaxAmt().compareTo(BigDecimal.ZERO)> 0) {
			if (items.getTaxSAmt().compareTo(BigDecimal.ZERO) > 0) {
				Element TaxSubtotal = doc.createElementNS("", "cac:TaxSubtotal");
				TaxTotal.appendChild(TaxSubtotal);//se anade al grupo TaxTotal
				TaxSubtotal.appendChild(doc.createTextNode("\n"));

				//nuevo
				Element TaxableAmount = doc.createElementNS("", "cbc:TaxableAmount");

				TaxSubtotal.appendChild(TaxableAmount);//se anade al grupo TaxSubtotal
				//TaxableAmount.setAttributeNS(null, "currencyID", items.getDocu_moneda().trim());
				TaxableAmount.setAttributeNS(null, "currencyID", currency.getISO_Code());
				TaxableAmount.setIdAttributeNS(null, "currencyID", true);
				//TaxableAmount.appendChild(doc.createTextNode(items.getdoc_gravada().toString()));
				TaxableAmount.appendChild(doc.createTextNode(items.getTaxSBaseAmt().toString()));

				Element TaxAmount1 = doc.createElementNS("", "cbc:TaxAmount");
				TaxSubtotal.appendChild(TaxAmount1);//se anade al grupo TaxSubtotal
				//TaxAmount1.setAttributeNS(null, "currencyID", items.getDocu_moneda().trim());
				TaxAmount1.setAttributeNS(null, "currencyID", currency.getISO_Code());
				TaxAmount1.setIdAttributeNS(null, "currencyID", true);
				//TaxAmount1.appendChild(doc.createTextNode(items.getDocu_igv().trim()));//VER getItem_ti_igv                    
				TaxAmount1.appendChild(doc.createTextNode(items.getTaxSAmt().toString().trim()));//VER getItem_ti_igv


				Element TaxCategory = doc.createElementNS("", "cac:TaxCategory");
				TaxSubtotal.appendChild(TaxCategory);//se anade al grupo TaxSubtotal
				TaxCategory.appendChild(doc.createTextNode("\n"));

				Element cbdId5 = doc.createElementNS("", "cbc:ID");
				TaxCategory.appendChild(cbdId5);
				cbdId5.setAttribute("schemeID", "UN/ECE 5305");
				cbdId5.setAttribute("schemeName", "Tax Category Identifier");
				cbdId5.setAttribute("schemeAgencyName", "United Nations Economic Commission for Europe");
				cbdId5.appendChild(doc.createTextNode(REF_ECE_5305.StandardRate));

				Element TaxScheme = doc.createElementNS("", "cac:TaxScheme");
				TaxCategory.appendChild(TaxScheme);//se anade al grupo TaxCategory
				TaxScheme.appendChild(doc.createTextNode("\n"));

				Element ID9 = doc.createElementNS("", "cbc:ID");
				TaxScheme.appendChild(ID9);//se anade al grupo TaxScheme
				ID9.setAttribute("schemeID", "UN/ECE 5153");
				ID9.setAttribute("schemeAgencyID", "6");
				ID9.appendChild(doc.createTextNode(REF_TaxTypeCode.IGV)); ///================================faltaba poner 1000
				Element Name3 = doc.createElementNS("", "cbc:Name");
				TaxScheme.appendChild(Name3);//se anade al grupo TaxScheme
				Name3.appendChild(doc.createTextNode("IGV"));

				Element TaxTypeCode = doc.createElementNS("", "cbc:TaxTypeCode");
				TaxScheme.appendChild(TaxTypeCode);//se anade al grupo TaxScheme
				TaxTypeCode.appendChild(doc.createTextNode(REF_ECE_5153.ValueAddedTax));				
			}
			//9995 - exportacion
			//if (items.getdoc_exportada().compareTo(BigDecimal.ZERO) != 0) {
			if (items.getTaxGAmt().compareTo(BigDecimal.ZERO) > 0) {
				Element TaxSubtotalx = doc.createElementNS("", "cac:TaxSubtotal");
				TaxTotal.appendChild(TaxSubtotalx);//se anade al grupo TaxTotal
				TaxSubtotalx.appendChild(doc.createTextNode("\n"));

				//nuevo
				Element TaxableAmountx = doc.createElementNS("", "cbc:TaxableAmount");

				TaxSubtotalx.appendChild(TaxableAmountx);//se anade al grupo TaxSubtotal
				//TaxableAmountx.setAttribute("currencyID", items.getDocu_moneda().trim());
				TaxableAmountx.setAttribute("currencyID", currency.getISO_Code());
				//TaxableAmountx.appendChild(doc.createTextNode(items.getdoc_exportada().toString()));
				TaxableAmountx.appendChild(doc.createTextNode(items.getTaxGAmt().toString()));

				Element TaxAmount1x = doc.createElementNS("", "cbc:TaxAmount");
				TaxSubtotalx.appendChild(TaxAmount1x);//se anade al grupo TaxSubtotal
				//TaxAmount1x.setAttribute("currencyID", items.getDocu_moneda().trim());
				TaxAmount1x.setAttribute("currencyID", currency.getISO_Code());
				TaxAmount1x.appendChild(doc.createTextNode("0.00"));//VER getItem_ti_igv

				Element TaxCategoryx = doc.createElementNS("", "cac:TaxCategory");
				TaxSubtotalx.appendChild(TaxCategoryx);//se anade al grupo TaxSubtotal
				TaxCategoryx.appendChild(doc.createTextNode("\n"));

				Element cbdId5x = doc.createElementNS("", "cbc:ID");
				TaxCategoryx.appendChild(cbdId5x);
				cbdId5x.setAttribute("schemeID", "UN/ECE 5305");
				cbdId5x.setAttribute("schemeName", "Tax Category Identifier");
				cbdId5x.setAttribute("schemeAgencyName", "United Nations Economic Commission for Europe");
				cbdId5x.appendChild(doc.createTextNode(REF_ECE_5305.FreeExportItemTaxNotCharged));

				Element TaxSchemex = doc.createElementNS("", "cac:TaxScheme");
				TaxCategoryx.appendChild(TaxSchemex);//se anade al grupo TaxCategory
				TaxSchemex.appendChild(doc.createTextNode("\n"));

				Element ID9x = doc.createElementNS("", "cbc:ID");
				TaxSchemex.appendChild(ID9x);//se anade al grupo TaxScheme
				ID9x.setAttribute("schemeID", "UN/ECE 5153");
				ID9x.setAttribute("schemeAgencyID", "6");
				ID9x.appendChild(doc.createTextNode(REF_TaxTypeCode.EXP)); ///================================faltaba poner 1000
				Element Name3x = doc.createElementNS("", "cbc:Name");
				TaxSchemex.appendChild(Name3x);//se anade al grupo TaxScheme
				Name3x.appendChild(doc.createTextNode("EXP"));

				Element TaxTypeCodex = doc.createElementNS("", "cbc:TaxTypeCode");
				TaxSchemex.appendChild(TaxTypeCodex);//se anade al grupo TaxScheme
				TaxTypeCodex.appendChild(doc.createTextNode(REF_ECE_5153.EXPORTACION));
			}
			//9998 - inafecto
			//if (items.getdoc_inafecta().compareTo(BigDecimal.ZERO) != 0) {
			if (items.getTaxOAmt().compareTo(BigDecimal.ZERO) > 0) {
				Element TaxSubtotalx = doc.createElementNS("", "cac:TaxSubtotal");
				TaxTotal.appendChild(TaxSubtotalx);//se anade al grupo TaxTotal
				TaxSubtotalx.appendChild(doc.createTextNode("\n"));

				//nuevo
				Element TaxableAmountx = doc.createElementNS("", "cbc:TaxableAmount");

				TaxSubtotalx.appendChild(TaxableAmountx);//se anade al grupo TaxSubtotal
				//TaxableAmountx.setAttribute("currencyID", items.getDocu_moneda().trim());
				TaxableAmountx.setAttribute("currencyID", currency.getISO_Code());
				//TaxableAmountx.appendChild(doc.createTextNode(items.getdoc_inafecta().toString()));
				TaxableAmountx.appendChild(doc.createTextNode(items.getTaxOAmt().toString()));

				Element TaxAmount1x = doc.createElementNS("", "cbc:TaxAmount");
				TaxSubtotalx.appendChild(TaxAmount1x);//se anade al grupo TaxSubtotal
				//TaxAmount1x.setAttribute("currencyID", items.getDocu_moneda().trim());
				TaxAmount1x.setAttribute("currencyID", currency.getISO_Code());
				TaxAmount1x.appendChild(doc.createTextNode("0.00"));//VER getItem_ti_igv

				Element TaxCategoryx = doc.createElementNS("", "cac:TaxCategory");
				TaxSubtotalx.appendChild(TaxCategoryx);//se anade al grupo TaxSubtotal
				TaxCategoryx.appendChild(doc.createTextNode("\n"));

				Element cbdId5x = doc.createElementNS("", "cbc:ID");
				TaxCategoryx.appendChild(cbdId5x);
				cbdId5x.setAttribute("schemeID", "UN/ECE 5305");
				cbdId5x.setAttribute("schemeName", "Tax Category Identifier");
				cbdId5x.setAttribute("schemeAgencyName", "United Nations Economic Commission for Europe");
				cbdId5x.appendChild(doc.createTextNode(REF_ECE_5305.ServicesOutsideScopeOfTax));

				Element TaxSchemex = doc.createElementNS("", "cac:TaxScheme");
				TaxCategoryx.appendChild(TaxSchemex);//se anade al grupo TaxCategory
				TaxSchemex.appendChild(doc.createTextNode("\n"));

				Element ID9x = doc.createElementNS("", "cbc:ID");
				TaxSchemex.appendChild(ID9x);//se anade al grupo TaxScheme
				ID9x.setAttribute("schemeID", "UN/ECE 5153");
				ID9x.setAttribute("schemeAgencyID", "6");				
				ID9x.appendChild(doc.createTextNode(REF_TaxTypeCode.INA)); ///================================faltaba poner 1000

				Element Name3x = doc.createElementNS("", "cbc:Name");
				TaxSchemex.appendChild(Name3x);//se anade al grupo TaxScheme
				Name3x.appendChild(doc.createTextNode("INA"));

				Element TaxTypeCodex = doc.createElementNS("", "cbc:TaxTypeCode");
				TaxSchemex.appendChild(TaxTypeCodex);//se anade al grupo TaxScheme
				TaxTypeCodex.appendChild(doc.createTextNode(REF_ECE_5153.EXPORTACION));
			}
			//9997 - exonerado
			//if (items.getdoc_exonerada().compareTo(BigDecimal.ZERO) != 0) {
			if (items.getTaxEAmt().compareTo(BigDecimal.ZERO) > 0) {
				Element TaxSubtotalx = doc.createElementNS("", "cac:TaxSubtotal");
				TaxTotal.appendChild(TaxSubtotalx);//se anade al grupo TaxTotal
				TaxSubtotalx.appendChild(doc.createTextNode("\n"));

				//nuevo
				Element TaxableAmountx = doc.createElementNS("", "cbc:TaxableAmount");

				TaxSubtotalx.appendChild(TaxableAmountx);//se anade al grupo TaxSubtotal
				//TaxableAmountx.setAttribute("currencyID", items.getDocu_moneda().trim());
				TaxableAmountx.setAttribute("currencyID", currency.getISO_Code());
				//TaxableAmountx.appendChild(doc.createTextNode(items.getdoc_exonerada().toString()));
				TaxableAmountx.appendChild(doc.createTextNode(items.getTaxEAmt().toString()));

				Element TaxAmount1x = doc.createElementNS("", "cbc:TaxAmount");
				TaxSubtotalx.appendChild(TaxAmount1x);//se anade al grupo TaxSubtotal
				//TaxAmount1x.setAttribute("currencyID", items.getDocu_moneda().trim());
				TaxAmount1x.setAttribute("currencyID", currency.getISO_Code());
				TaxAmount1x.appendChild(doc.createTextNode("0.00"));//VER getItem_ti_igv

				Element TaxCategoryx = doc.createElementNS("", "cac:TaxCategory");
				TaxSubtotalx.appendChild(TaxCategoryx);//se anade al grupo TaxSubtotal
				TaxCategoryx.appendChild(doc.createTextNode("\n"));

				Element cbdId5x = doc.createElementNS("", "cbc:ID");
				TaxCategoryx.appendChild(cbdId5x);
				cbdId5x.setAttribute("schemeID", "UN/ECE 5305");
				cbdId5x.setAttribute("schemeName", "Tax Category Identifier");
				cbdId5x.setAttribute("schemeAgencyName", "United Nations Economic Commission for Europe");
				cbdId5x.appendChild(doc.createTextNode(REF_ECE_5305.ExemptFromTax));

				Element TaxSchemex = doc.createElementNS("", "cac:TaxScheme");
				TaxCategoryx.appendChild(TaxSchemex);//se anade al grupo TaxCategory
				TaxSchemex.appendChild(doc.createTextNode("\n"));

				Element ID9x = doc.createElementNS("", "cbc:ID");
				TaxSchemex.appendChild(ID9x);//se anade al grupo TaxScheme
				ID9x.setAttribute("schemeID", "UN/ECE 5153");
				ID9x.setAttribute("schemeAgencyID", "6");
				ID9x.appendChild(doc.createTextNode(REF_TaxTypeCode.EXO)); ///================================faltaba poner 1000

				Element Name3x = doc.createElementNS("", "cbc:Name");
				TaxSchemex.appendChild(Name3x);//se anade al grupo TaxScheme
				Name3x.appendChild(doc.createTextNode("EXO"));
				Element TaxTypeCodex = doc.createElementNS("", "cbc:TaxTypeCode");
				TaxSchemex.appendChild(TaxTypeCodex);//se anade al grupo TaxScheme
				TaxTypeCodex.appendChild(doc.createTextNode("VAT"));
			}
			//9996 - gratuito
			//if (items.getdoc_gratuita().compareTo(BigDecimal.ZERO) != 0) {
			if (items.getTaxZAmt().compareTo(BigDecimal.ZERO) > 0) {
				Element TaxSubtotalx = doc.createElementNS("", "cac:TaxSubtotal");
				TaxTotal.appendChild(TaxSubtotalx);//se anade al grupo TaxTotal
				TaxSubtotalx.appendChild(doc.createTextNode("\n"));

				//nuevo
				Element TaxableAmountx = doc.createElementNS("", "cbc:TaxableAmount");

				TaxSubtotalx.appendChild(TaxableAmountx);//se anade al grupo TaxSubtotal
				//TaxableAmountx.setAttribute("currencyID", items.getDocu_moneda().trim());
				TaxableAmountx.setAttribute("currencyID", currency.getISO_Code());
				TaxableAmountx.appendChild(doc.createTextNode(items.getTaxZAmt().toString()));

				Element TaxAmount1x = doc.createElementNS("", "cbc:TaxAmount");
				TaxSubtotalx.appendChild(TaxAmount1x);//se anade al grupo TaxSubtotal
				//TaxAmount1x.setAttribute("currencyID", items.getDocu_moneda().trim());
				TaxAmount1x.setAttribute("currencyID", currency.getISO_Code());
				TaxAmount1x.appendChild(doc.createTextNode("0.00"));//VER getItem_ti_igv

				Element TaxCategoryx = doc.createElementNS("", "cac:TaxCategory");
				TaxSubtotalx.appendChild(TaxCategoryx);//se anade al grupo TaxSubtotal
				TaxCategoryx.appendChild(doc.createTextNode("\n"));

				Element cbdId5x = doc.createElementNS("", "cbc:ID");
				TaxCategoryx.appendChild(cbdId5x);
				cbdId5x.setAttribute("schemeID", "UN/ECE 5305");
				cbdId5x.setAttribute("schemeName", "Tax Category Identifier");
				cbdId5x.setAttribute("schemeAgencyName", "United Nations Economic Commission for Europe");
				cbdId5x.appendChild(doc.createTextNode(REF_ECE_5305.ZeroRatedGoods));

				Element TaxSchemex = doc.createElementNS("", "cac:TaxScheme");
				TaxCategoryx.appendChild(TaxSchemex);//se anade al grupo TaxCategory
				TaxSchemex.appendChild(doc.createTextNode("\n"));

				Element ID9x = doc.createElementNS("", "cbc:ID");
				TaxSchemex.appendChild(ID9x);//se anade al grupo TaxScheme
				ID9x.setAttribute("schemeID", "UN/ECE 5153");
				ID9x.setAttribute("schemeAgencyID", "6");
				ID9x.appendChild(doc.createTextNode(REF_TaxTypeCode.GRA)); ///================================faltaba poner 1000

				Element Name3x = doc.createElementNS("", "cbc:Name");
				TaxSchemex.appendChild(Name3x);//se anade al grupo TaxScheme
				Name3x.appendChild(doc.createTextNode("GRA"));
				Element TaxTypeCodex = doc.createElementNS("", "cbc:TaxTypeCode");
				TaxSchemex.appendChild(TaxTypeCodex);//se anade al grupo TaxScheme
				TaxTypeCodex.appendChild(doc.createTextNode("FRE"));
			}
			//9999 - otros tributos
			if (items.getTaxTAmt().compareTo(BigDecimal.ZERO) != 0) {

				Element TaxSubtotalx = doc.createElementNS("", "cac:TaxSubtotal");
				TaxTotal.appendChild(TaxSubtotalx);//se anade al grupo TaxTotal
				TaxSubtotalx.appendChild(doc.createTextNode("\n"));

				//nuevo
				Element TaxableAmountx = doc.createElementNS("", "cbc:TaxableAmount");

				TaxSubtotalx.appendChild(TaxableAmountx);//se anade al grupo TaxSubtotal
				//TaxableAmountx.setAttribute("currencyID", items.getDocu_moneda().trim());
				TaxableAmountx.setAttribute("currencyID", currency.getISO_Code());
				//TaxableAmountx.appendChild(doc.createTextNode(items.getdoc_gravada().toString()));
				TaxableAmountx.appendChild(doc.createTextNode(items.getTaxTAmt().toString()));

				Element TaxAmount1x = doc.createElementNS("", "cbc:TaxAmount");
				TaxSubtotalx.appendChild(TaxAmount1x);//se anade al grupo TaxSubtotal
				//TaxAmount1x.setAttribute("currencyID", items.getDocu_moneda().trim());
				TaxAmount1x.setAttribute("currencyID", currency.getISO_Code());
				//TaxAmount1x.appendChild(doc.createTextNode(items.getdoc_otrostributos().toString()));//VER getItem_ti_igv
				TaxAmount1x.appendChild(doc.createTextNode(items.getTaxTAmt().toString()));//VER getItem_ti_igv

				Element TaxCategoryx = doc.createElementNS("", "cac:TaxCategory");
				TaxSubtotalx.appendChild(TaxCategoryx);//se anade al grupo TaxSubtotal
				TaxCategoryx.appendChild(doc.createTextNode("\n"));

				Element cbdId5x = doc.createElementNS("", "cbc:ID");
				TaxCategoryx.appendChild(cbdId5x);
				cbdId5x.setAttribute("schemeID", "UN/ECE 5305");
				cbdId5x.setAttribute("schemeName", "Tax Category Identifier");
				cbdId5x.setAttribute("schemeAgencyName", "United Nations Economic Commission for Europe");
				cbdId5x.appendChild(doc.createTextNode(REF_ECE_5305.StandardRate));

				Element TaxSchemex = doc.createElementNS("", "cac:TaxScheme");
				TaxCategoryx.appendChild(TaxSchemex);//se anade al grupo TaxCategory
				TaxSchemex.appendChild(doc.createTextNode("\n"));

				Element ID9x = doc.createElementNS("", "cbc:ID");
				TaxSchemex.appendChild(ID9x);//se anade al grupo TaxScheme
				ID9x.setAttribute("schemeID", "UN/ECE 5153");
				ID9x.setAttribute("schemeAgencyID", "6");
				ID9x.appendChild(doc.createTextNode(REF_TaxTypeCode.OTR)); ///================================faltaba poner 1000

				Element Name3x = doc.createElementNS("", "cbc:Name");
				TaxSchemex.appendChild(Name3x);//se anade al grupo TaxScheme
				Name3x.appendChild(doc.createTextNode("OTROS"));
				Element TaxTypeCodex = doc.createElementNS("", "cbc:TaxTypeCode");
				TaxSchemex.appendChild(TaxTypeCodex);//se anade al grupo TaxScheme				
				TaxTypeCodex.appendChild(doc.createTextNode(REF_ECE_5153.OtherTaxes));
			}
			//bloque 6 ISC
			if (items.getdocu_isc().compareTo(BigDecimal.ZERO) != 0) {
				//                    Element TaxTotalIsc = doc.createElementNS("", "cac:TaxTotal");
				//                    envelope.appendChild(TaxTotalIsc);
				//                    TaxTotalIsc.appendChild(doc.createTextNode("\n"));
				//                    Element TaxAmount1Isc = doc.createElementNS("", "cbc:TaxAmount");
				//                    TaxTotal.appendChild(TaxAmount1Isc);//se anade al grupo TaxTotal
				//                    TaxAmount1Isc.setAttribute( "currencyID", items.getDocu_moneda().trim());
				//                    TaxAmount1Isc.appendChild(doc.createTextNode(items.getDocu_isc().trim()));
				Element TaxSubtotalisc = doc.createElementNS("", "cac:TaxSubtotal");
				TaxTotal.appendChild(TaxSubtotalisc);//se anade al grupo TaxTotal
				TaxSubtotalisc.appendChild(doc.createTextNode("\n"));

				//nuevo
				Element TaxableAmountIsc = doc.createElementNS("", "cbc:TaxableAmount");
				TaxSubtotalisc.appendChild(TaxableAmountIsc);//se anade al grupo TaxSubtotal
				//TaxableAmountIsc.setAttribute("currencyID", items.getDocu_moneda().trim());
				TaxableAmountIsc.setAttribute("currencyID", currency.getISO_Code());
				TaxableAmountIsc.appendChild(doc.createTextNode(items.getdoc_gravada().toString()));

				Element TaxAmountIsc = doc.createElementNS("", "cbc:TaxAmount");
				TaxSubtotalisc.appendChild(TaxAmountIsc);//se anade al grupo TaxSubtotal
				//TaxAmountIsc.setAttribute("currencyID", items.getDocu_moneda().trim());
				TaxAmountIsc.setAttribute("currencyID", currency.getISO_Code());
				TaxAmountIsc.appendChild(doc.createTextNode(items.getdocu_isc().toString()));

				Element TaxCategoryIsc = doc.createElementNS("", "cac:TaxCategory");
				TaxSubtotalisc.appendChild(TaxCategoryIsc);//se anade al grupo TaxSubtotal
				TaxCategoryIsc.appendChild(doc.createTextNode("\n"));

				Element cbdId5Isc = doc.createElementNS("", "cbc:ID");
				TaxCategoryIsc.appendChild(cbdId5Isc);
				cbdId5Isc.setAttribute("schemeID", "UN/ECE 5305");
				cbdId5Isc.setAttribute("schemeName", "Tax Category Identifier");
				cbdId5Isc.setAttribute("schemeAgencyName", "United Nations Economic Commission for Europe");
				cbdId5Isc.appendChild(doc.createTextNode("S"));

				Element TaxSchemeIsc = doc.createElementNS("", "cac:TaxScheme");
				TaxCategoryIsc.appendChild(TaxSchemeIsc);//se anade al grupo TaxCategory
				TaxSchemeIsc.appendChild(doc.createTextNode("\n"));
				Element ID9Isc = doc.createElementNS("", "cbc:ID");
				TaxSchemeIsc.appendChild(ID9Isc);//se anade al grupo TaxScheme
				ID9Isc.setAttribute("schemeID", "UN/ECE 5153");
				ID9Isc.setAttribute("schemeAgencyID", "6");
				ID9Isc.appendChild(doc.createTextNode("2000")); ///================================faltaba poner 1000

				Element Name3Isc = doc.createElementNS("", "cbc:Name");
				TaxSchemeIsc.appendChild(Name3Isc);//se anade al grupo TaxScheme
				Name3Isc.appendChild(doc.createTextNode("ISC"));

				Element TaxTypeCodeIsc = doc.createElementNS("", "cbc:TaxTypeCode");
				TaxSchemeIsc.appendChild(TaxTypeCodeIsc);//se anade al grupo TaxScheme
				TaxTypeCodeIsc.appendChild(doc.createTextNode("EXC"));
			}
			//bloque 7 Pagos     
			Element LegalMonetaryTotal = doc.createElementNS("", "cac:LegalMonetaryTotal");
			envelope.appendChild(LegalMonetaryTotal);
			LegalMonetaryTotal.appendChild(doc.createTextNode("\n"));

			// Anticipo total
			//if (!items.getDocu_anticipo_total().equals("0.00")) {
			if (items.getdoc_anticipo_total().compareTo(BigDecimal.ZERO) != 0) {
				Element PrepaidAmount = doc.createElementNS("", "cbc:PrepaidAmount");
				//PrepaidAmount.setAttributeNS(null, "currencyID", items.getDocu_moneda().trim());
				PrepaidAmount.setAttributeNS(null, "currencyID", currency.getISO_Code());
				PrepaidAmount.setIdAttributeNS(null, "currencyID", true);
				LegalMonetaryTotal.appendChild(PrepaidAmount);
				PrepaidAmount.appendChild(doc.createTextNode(items.getdoc_anticipo_total().toString()));
			}
			//if (!items.getDocu_descuento().equals("0.00")) {
			if (items.getdoc_descuento().compareTo(BigDecimal.ZERO) != 0) {
				Element AllowanceTotalAmount = doc.createElementNS("", "cbc:AllowanceTotalAmount");
				//AllowanceTotalAmount.setAttribute("currencyID", items.getDocu_moneda().trim());
				AllowanceTotalAmount.setAttribute("currencyID", currency.getISO_Code());
				LegalMonetaryTotal.appendChild(AllowanceTotalAmount);//se anade al grupo LegalMonetaryTotal
				AllowanceTotalAmount.appendChild(doc.createTextNode(items.getdoc_descuento().toString()));
			}
			if (items.getdoc_otroscargos().compareTo(BigDecimal.ZERO) != 0) {
				Element ChargeTotalAmount = doc.createElementNS("", "cbc:ChargeTotalAmount");
				//ChargeTotalAmount.setAttributeNS(null, "currencyID", items.getDocu_moneda().trim());
				ChargeTotalAmount.setAttributeNS(null, "currencyID", currency.getISO_Code());
				ChargeTotalAmount.setIdAttributeNS(null, "currencyID", true);
				LegalMonetaryTotal.appendChild(ChargeTotalAmount);//se anade al grupo LegalMonetaryTotal
				ChargeTotalAmount.appendChild(doc.createTextNode(items.getdoc_otroscargos().toString()));
			}

			Element LineExtensionAmount = doc.createElementNS("", "cbc:LineExtensionAmount");
			//LineExtensionAmount.setAttribute("currencyID", items.getDocu_moneda().trim());
			LineExtensionAmount.setAttribute("currencyID", currency.getISO_Code());
			LegalMonetaryTotal.appendChild(LineExtensionAmount);//se anade al grupo LegalMonetaryTotal
			LineExtensionAmount.appendChild(doc.createTextNode(items.getdoc_subtotal().toString()));

			Element TaxInclusiveAmount = doc.createElementNS("", "cbc:TaxInclusiveAmount");
			//TaxInclusiveAmount.setAttribute("currencyID", items.getDocu_moneda().trim());
			TaxInclusiveAmount.setAttribute("currencyID", currency.getISO_Code());
			LegalMonetaryTotal.appendChild(TaxInclusiveAmount);//se anade al grupo LegalMonetaryTotal
			TaxInclusiveAmount.appendChild(doc.createTextNode(items.getGrandTotal().toString()));

			Element PayableAmount = doc.createElementNS("", "cbc:PayableAmount");
			//PayableAmount.setAttribute("currencyID", items.getDocu_moneda().trim());
			PayableAmount.setAttribute("currencyID", currency.getISO_Code());
			LegalMonetaryTotal.appendChild(PayableAmount);//se anade al grupo LegalMonetaryTotal
			PayableAmount.appendChild(doc.createTextNode(items.getGrandTotal().toString()));
			//detalle factura
			log.info("generarXMLZipiadoFactura - Iniciamos detalle XML ");
			for (X_S_DocLine listaDet : detdocelec) {
				MTax tax = new Query(Env.getCtx(), MTax.Table_Name, "C_Tax_ID = ?", null)
						.setParameters(listaDet.getC_Tax_ID()).first();
				MProduct product = new Query(Env.getCtx(), MProduct.Table_Name, "M_Product_ID = ?", null)
						.setParameters(listaDet.getM_Product_ID()).first();
				MUOM uom = MUOM.get(Env.getCtx(), listaDet.getC_UOM_ID());
				Element InvoiceLine = doc.createElementNS("", "cac:InvoiceLine");
				envelope.appendChild(InvoiceLine);
				InvoiceLine.appendChild(doc.createTextNode("\n"));

				log.info("generarXMLZipiadoFactura - Orden ");
				Element ID11 = doc.createElementNS("", "cbc:ID");
				InvoiceLine.appendChild(ID11);//se anade al grupo InvoiceLine
				ID11.appendChild(doc.createTextNode(String.valueOf(listaDet.getSeqNo())));

				log.info("generarXMLZipiadoFactura - Unidad de Medidad ");
				Element InvoicedQuantity = doc.createElementNS("", "cbc:InvoicedQuantity");
				InvoiceLine.appendChild(InvoicedQuantity);//se anade al grupo InvoiceLine
				//InvoicedQuantity.setAttribute("unitCode", listaDet.getItem_cantidad());				
				InvoicedQuantity.setAttribute("unitCode", listaDet.getQty().toString());
				InvoicedQuantity.setAttribute("unitCodeListID", "UN/ECE rec 20");
				InvoicedQuantity.setAttribute("unitCodeListAgencyName", "United Nations Economic Commission for Europe");

				log.info("generarXMLZipiadoFactura - Cantidad ");
				//InvoicedQuantity.appendChild(doc.createTextNode(listaDet.getItem_cantidad().trim()));
				InvoicedQuantity.appendChild(doc.createTextNode(listaDet.getQty().toString()));

				log.info("generarXMLZipiadoFactura - Item Sub total ");
				Element LineExtensionAmount1 = doc.createElementNS("", "cbc:LineExtensionAmount");
				InvoiceLine.appendChild(LineExtensionAmount1);//se anade al grupo InvoiceLine
				//LineExtensionAmount1.setAttribute("currencyID", listaDet.getse);
				LineExtensionAmount1.setAttribute("currencyID", currency.getISO_Code());
				//LineExtensionAmount1.appendChild(doc.createTextNode(listaDet.getItem_ti_subtotal().trim()));
				LineExtensionAmount1.appendChild(doc.createTextNode(listaDet.getsubtotal().toString()));

				Element PricingReference = doc.createElementNS("", "cac:PricingReference");
				InvoiceLine.appendChild(PricingReference);//se anade al grupo InvoiceLine
				PricingReference.appendChild(doc.createTextNode("\n"));
				//if (listaDet.getItem_tipo_precio_venta().equals("01")) {
				if (product.getPriceTypeCode().equals(REF_PriceTypeCode.PrecioUnitarioIncluyeElIGV)) {
					Element AlternativeConditionPrice = doc.createElementNS("", "cac:AlternativeConditionPrice");
					PricingReference.appendChild(AlternativeConditionPrice);//se anade al grupo PricingReference
					AlternativeConditionPrice.appendChild(doc.createTextNode("\n"));

					log.info("generarXMLZipiadoFactura - Item_venta ");
					Element PriceAmount = doc.createElementNS("", "cbc:PriceAmount");
					AlternativeConditionPrice.appendChild(PriceAmount);//se anade al grupo AlternativeConditionPrice
					//PriceAmount.setAttribute("currencyID", listaDet.getItem_moneda().trim());
					PriceAmount.setAttribute("currencyID", currency.getISO_Code());
					//PriceAmount.appendChild(doc.createTextNode(listaDet.getItem_pventa_igv().trim())); // el precio unitario de venta de ser con los impuestos y deducciones de descuentos
					PriceAmount.appendChild(doc.createTextNode(listaDet.getTaxBaseAmt().toString())); // el precio unitario de venta de ser con los impuestos y deducciones de descuentos

					Element PriceTypeCode = doc.createElementNS("", "cbc:PriceTypeCode");
					AlternativeConditionPrice.appendChild(PriceTypeCode);//se anade al grupo AlternativeConditionPrice
					PriceTypeCode.setAttribute("listName", "Tipo de Precio");
					PriceTypeCode.setAttribute("listAgencyName", "PE:SUNAT");
					PriceTypeCode.setAttribute("listURI", "urn:pe:gob:sunat:cpe:see:gem:catalogos:catalogo16");
					//PriceTypeCode.appendChild(doc.createTextNode(listaDet.getItem_tipo_precio_venta().trim())); //=================================>Faltaba especificar ite
					PriceTypeCode.appendChild(doc.createTextNode(REF_PriceTypeCode.PrecioUnitarioIncluyeElIGV));
				}
				//                      
				log.info("generarXMLZipiadoFactura - Onerosa ");
				//if (listaDet.getItem_tipo_precio_venta().equals("02")) {
				if (product.getPriceTypeCode().equals(REF_PriceTypeCode.ValorReferencialUnitarioEnOperacionesNoOnerosas)) {
					Element AlternativeConditionPrice02 = doc.createElementNS("", "cac:AlternativeConditionPrice");
					PricingReference.appendChild(AlternativeConditionPrice02);//se anade al grupo PricingReference
					AlternativeConditionPrice02.appendChild(doc.createTextNode("\n"));

					Element PriceAmount02 = doc.createElementNS("", "cbc:PriceAmount");
					AlternativeConditionPrice02.appendChild(PriceAmount02);//se anade al grupo AlternativeConditionPrice
					//PriceAmount02.setAttribute("currencyID", listaDet.getItem_moneda().trim());
					PriceAmount02.setAttribute("currencyID", currency.getISO_Code());                        
					//PriceAmount02.appendChild(doc.createTextNode(listaDet.getItem_pventa_nohonerosa().trim()));
					PriceAmount02.appendChild(doc.createTextNode(listaDet.getventa_noonerosa().toString()));

					Element PriceTypeCode02 = doc.createElementNS("", "cbc:PriceTypeCode");
					AlternativeConditionPrice02.appendChild(PriceTypeCode02);//se anade al grupo AlternativeConditionPrice
					PriceTypeCode02.setAttribute("listName", "Tipo de Precio");
					PriceTypeCode02.setAttribute("listAgencyName", "PE:SUNAT");
					PriceTypeCode02.setAttribute("listURI", "urn:pe:gob:sunat:cpe:see:gem:catalogos:catalogo16");
					//PriceTypeCode02.appendChild(doc.createTextNode(listaDet.getItem_tipo_precio_venta().trim())); //==>Para los casos de gatuito venta no Honerosa
					PriceTypeCode02.appendChild(doc.createTextNode(REF_PriceTypeCode.ValorReferencialUnitarioEnOperacionesNoOnerosas)); //==>Para los casos de gatuito venta no Honerosa
				}

				Element TaxTotal1 = doc.createElementNS("", "cac:TaxTotal");
				InvoiceLine.appendChild(TaxTotal1);//se anade al grupo InvoiceLine
				TaxTotal1.appendChild(doc.createTextNode("\n"));

				log.info("generarXMLZipiadoFactura - IGV ");
				Element TaxAmount2 = doc.createElementNS("", "cbc:TaxAmount");
				//TaxAmount2.setAttributeNS(null, "currencyID", listaDet.getItem_moneda().trim());
				TaxAmount2.setAttributeNS(null, "currencyID", currency.getISO_Code());
				TaxAmount2.setIdAttributeNS(null, "currencyID", true);
				TaxTotal1.appendChild(TaxAmount2);//se anade al grupo TaxTotal1
				//TaxAmount2.appendChild(doc.createTextNode(listaDet.getItem_total_tax().trim()));
				TaxAmount2.appendChild(doc.createTextNode(listaDet.gettaxamount().toString()));
				//              Inicio IGV item
				//if (!"0.00".equals(listaDet.getItem_ti_igv().trim())) {
				//if (!("1000|9995|9996|9997|9998".indexOf(listaDet.getCodigo_tributo().trim()) == -1)) {
				if (!("1000|9995|9996|9997|9998".indexOf(tax.getTaxTypeCode().trim()) == -1)) {
					Element TaxSubtotal1 = doc.createElementNS("", "cac:TaxSubtotal");
					TaxTotal1.appendChild(TaxSubtotal1);//se anade al grupo TaxTotal1
					TaxSubtotal1.appendChild(doc.createTextNode("\n"));

					log.info("generarXMLZipiadoFactura - sub total ");
					Element TaxableAmount2 = doc.createElementNS("", "cbc:TaxableAmount");
					TaxSubtotal1.appendChild(TaxableAmount2);//se anade al grupo TaxSubtotal1
					//TaxableAmount2.setAttribute("currencyID", listaDet.getItem_moneda().trim());
					TaxableAmount2.setAttribute("currencyID", currency.getISO_Code());

					//TaxableAmount2.appendChild(doc.createTextNode(listaDet.getItem_base_igv().trim()));// Oswaldo
					TaxableAmount2.appendChild(doc.createTextNode(listaDet.getTaxBaseAmt().toString()));// Oswaldo

					Element TaxAmount3 = doc.createElementNS("", "cbc:TaxAmount");
					//TaxAmount3.setAttribute("currencyID", listaDet.getItem_moneda().trim());
					TaxAmount3.setAttribute("currencyID", currency.getISO_Code());
					TaxSubtotal1.appendChild(TaxAmount3);//se anade al grupo TaxSubtotal1
					//TaxAmount3.appendChild(doc.createTextNode(listaDet.getItem_ti_igv().trim()));
					TaxAmount3.appendChild(doc.createTextNode(listaDet.gettaxamount().toString()));

					Element TaxCategory1 = doc.createElementNS("", "cac:TaxCategory");
					TaxSubtotal1.appendChild(TaxCategory1);//se anade al grupo TaxSubtotal1
					TaxCategory1.appendChild(doc.createTextNode("\n"));

					Element ID12 = doc.createElementNS("", "cbc:ID");
					TaxCategory1.appendChild(ID12);//se anade al grupo TaxCategory1
					ID12.setAttribute("schemeID", "UN/ECE 5305");
					ID12.setAttribute("schemeAgencyID", "Tax Category Identifier");
					//ID12.setAttribute("schemeAgencyName", "United Nations Economic Commission for Europe");
					//ID12.appendChild(doc.createTextNode(listaDet.getUn5305()));
					ID12.appendChild(doc.createTextNode(tax.getECE_5305()));

					log.info("generarXMLZipiadoFactura - tasa Igv ");
					Element Percent = doc.createElementNS("", "cbc:Percent");
					TaxCategory1.appendChild(Percent);//se anade al grupo TaxSubtotal1
					//Percent.appendChild(doc.createTextNode(listaDet.getItem_tasa_igv().trim()));                        
					Percent.appendChild(doc.createTextNode(listaDet.gettaxrate().toString().trim()));

					log.info("generarXMLZipiadoFactura - afectacion ");
					Element TaxExemptionReasonCode = doc.createElementNS("", "cbc:TaxExemptionReasonCode");
					TaxCategory1.appendChild(TaxExemptionReasonCode);//se anade al grupo TaxCategory1
					TaxExemptionReasonCode.setAttribute("listAgencyName", "PE:SUNAT");
					TaxExemptionReasonCode.setAttribute("listName", "Afectacion del IGV");
					TaxExemptionReasonCode.setAttribute("listURI", "urn:pe:gob:sunat:cpe:see:gem:catalogos:catalogo07");
					//TaxExemptionReasonCode.appendChild(doc.createTextNode(listaDet.getItem_afectacion().trim()));
					TaxExemptionReasonCode.appendChild(doc.createTextNode(listaDet.getitem_afectacion().trim()));

					Element TaxScheme1 = doc.createElementNS("", "cac:TaxScheme");
					TaxCategory1.appendChild(TaxScheme1);//se anade al grupo TaxCategory1
					TaxScheme1.appendChild(doc.createTextNode("\n"));
					Element ID15 = doc.createElementNS("", "cbc:ID");
					TaxScheme1.appendChild(ID15);//se anade al grupo TaxCategory1
					ID15.setAttribute("schemeID", "UN/ECE 5153");
					ID15.setAttribute("schemeAgencyID", "Tax Scheme Identifier");
					//ID15.setAttribute("schemeAgencyName", "United Nations Economic Commission for Europe");                        
					//ID15.appendChild(doc.createTextNode(listaDet.getcodigo_tributo().trim()));
					ID15.appendChild(doc.createTextNode(tax.getECE_5153()));

					Element Name9 = doc.createElementNS("", "cbc:Name");
					TaxScheme1.appendChild(Name9);//se anade al grupo TaxCategory1
					//Name9.appendChild(doc.createTextNode(listaDet.getDescripcion_corta().trim()));
					Name9.appendChild(doc.createTextNode(tax.getName()));

					Element TaxTypeCode1 = doc.createElementNS("", "cbc:TaxTypeCode");
					TaxScheme1.appendChild(TaxTypeCode1);//se anade al grupo TaxCategory1
					//TaxTypeCode1.appendChild(doc.createTextNode(listaDet.getUn5153()));
					TaxTypeCode1.appendChild(doc.createTextNode(tax.getECE_5153()));
				}
				//}
				//                  fin IGV Item
				//---------------
				//                  Inicio ISC item
				//listaDet.getitem_base_isc()
				//listaDet.getitem_it_isc()
				//if (!listaDet.getItem_ti_isc().equals("0.00")) {
				if (listaDet.getitem_ti_isc().compareTo(BigDecimal.ZERO)!= 0) {
					Element TaxSubtotal2 = doc.createElementNS("", "cac:TaxSubtotal");
					TaxTotal1.appendChild(TaxSubtotal2);//se anade al grupo TaxTotal1
					TaxSubtotal2.appendChild(doc.createTextNode("\n"));

					log.info("generarXMLZipiadoFactura - sub total ");
					Element TaxableAmount2 = doc.createElementNS("", "cbc:TaxableAmount");
					TaxSubtotal2.appendChild(TaxableAmount2);//se anade al grupo TaxSubtotal1
					//TaxableAmount2.setAttribute("currencyID", listaDet.getItem_moneda().trim());
					TaxableAmount2.setAttribute("currencyID", currency.getISO_Code());

					TaxableAmount2.appendChild(doc.createTextNode(listaDet.getitem_base_isc().toString()));// Oswaldo

					//ISC
					Element TaxAmount32 = doc.createElementNS("", "cbc:TaxAmount");
					//TaxAmount32.setAttribute("currencyID", listaDet.getItem_moneda().trim());
					TaxAmount32.setAttribute("currencyID", currency.getISO_Code());
					TaxSubtotal2.appendChild(TaxAmount32);//se anade al grupo TaxSubtotal1
					TaxAmount32.appendChild(doc.createTextNode(listaDet.getitem_ti_isc().toString()));

					Element TaxCategory12 = doc.createElementNS("", "cac:TaxCategory");
					TaxSubtotal2.appendChild(TaxCategory12);//se anade al grupo TaxSubtotal1
					TaxCategory12.appendChild(doc.createTextNode("\n"));
					log.info("generarXMLZipiadoFactura - tasa Igv ");
					Element Percentisc = doc.createElementNS("", "cbc:Percent");
					TaxCategory12.appendChild(Percentisc);//se anade al grupo TaxSubtotal1                        
					//Percentisc.appendChild(doc.createTextNode(listaDet.getitem_tasa_isc().tostring));
					Percentisc.appendChild(doc.createTextNode(listaDet.getitem_rate_isc().toString()));

					log.info("generarXMLZipiadoFactura - afectacion ");

					Element TierRange = doc.createElementNS("", "cbc:TierRange");
					TaxCategory12.appendChild(TierRange);//se anade al grupo TaxCategory1                        
					//TierRange.appendChild(doc.createTextNode(listaDet.getitem_isc_tier().trim()));
					TierRange.appendChild(doc.createTextNode(orginfo.getTierRange()));

					Element TaxScheme12 = doc.createElementNS("", "cac:TaxScheme");
					TaxCategory12.appendChild(TaxScheme12);//se anade al grupo TaxCategory1
					TaxScheme12.appendChild(doc.createTextNode("\n"));

					Element ID152 = doc.createElementNS("", "cbc:ID");
					TaxScheme12.appendChild(ID152);//se anade al grupo TaxCategory1
					ID152.setAttribute("schemeID", "UN/ECE 5153");
					ID152.setAttribute("schemeAgencyID", "Tax Scheme Identifier");
					//ID152.setAttribute("schemeAgencyName", "United Nations Economic Commission for Europe");
					ID152.appendChild(doc.createTextNode("2000"));

					Element Name92 = doc.createElementNS("", "cbc:Name");
					TaxScheme12.appendChild(Name92);//se anade al grupo TaxCategory1
					Name92.appendChild(doc.createTextNode("ISC"));

					Element TaxTypeCode12 = doc.createElementNS("", "cbc:TaxTypeCode");
					TaxScheme12.appendChild(TaxTypeCode12);//se anade al grupo TaxCategory1
					TaxTypeCode12.appendChild(doc.createTextNode("EXC"));
					//}
					//                  fin ISC Item
				}
				//---------------
				//                  Inicio Otros item                                        
				//if (!listaDet.getitem_ti_otros_trib().equals("0.00")) {
				if (listaDet.getitem_base_otros_trib().compareTo(BigDecimal.ZERO) != 0) {
					Element TaxSubtotal2 = doc.createElementNS("", "cac:TaxSubtotal");
					TaxTotal1.appendChild(TaxSubtotal2);//se anade al grupo TaxTotal1
					TaxSubtotal2.appendChild(doc.createTextNode("\n"));

					log.info("generarXMLZipiadoFactura - sub total ");
					Element TaxableAmount2 = doc.createElementNS("", "cbc:TaxableAmount");
					TaxSubtotal2.appendChild(TaxableAmount2);//se anade al grupo TaxSubtotal1
					//TaxableAmount2.setAttribute("currencyID", listaDet.getItem_moneda().trim());
					TaxableAmount2.setAttribute("currencyID", currency.getISO_Code());

					TaxableAmount2.appendChild(doc.createTextNode(listaDet.getitem_base_otros_trib().toString()));// Oswaldo

					//ISC
					Element TaxAmount32 = doc.createElementNS("", "cbc:TaxAmount");
					//TaxAmount32.setAttribute("currencyID", listaDet.getItem_moneda().trim());
					TaxAmount32.setAttribute("currencyID", currency.getISO_Code());                        
					TaxSubtotal2.appendChild(TaxAmount32);//se anade al grupo TaxSubtotal1

					//TaxAmount32.appendChild(doc.createTextNode(listaDet.getitem_ti_otros_trib().trim()));
					TaxAmount32.appendChild(doc.createTextNode(listaDet.getitem_rate_otros_trib().toString()));
					Element TaxCategory12 = doc.createElementNS("", "cac:TaxCategory");
					TaxSubtotal2.appendChild(TaxCategory12);//se anade al grupo TaxSubtotal1
					TaxCategory12.appendChild(doc.createTextNode("\n"));
					log.info("generarXMLZipiadoFactura - tasa Igv ");
					Element Percentisc = doc.createElementNS("", "cbc:Percent");
					TaxCategory12.appendChild(Percentisc);//se anade al grupo TaxSubtotal1

					//Percentisc.appendChild(doc.createTextNode(listaDet.getitem_tasa_otros_trib().trim()));
					Percentisc.appendChild(doc.createTextNode(listaDet.getitem_rate_isc().toString()));
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
					ID152.setAttribute("schemeID", "UN/ECE 5153");
					ID152.setAttribute("schemeAgencyID", "Tax Scheme Identifier");
					//ID152.setAttribute("schemeAgencyName", "United Nations Economic Commission for Europe");
					ID152.appendChild(doc.createTextNode("9999"));

					Element Name92 = doc.createElementNS("", "cbc:Name");
					TaxScheme12.appendChild(Name92);//se anade al grupo TaxCategory1
					Name92.appendChild(doc.createTextNode("OTROS"));

					Element TaxTypeCode12 = doc.createElementNS("", "cbc:TaxTypeCode");
					TaxScheme12.appendChild(TaxTypeCode12);//se anade al grupo TaxCategory1
					TaxTypeCode12.appendChild(doc.createTextNode("OTH"));
					//}
					//                  fin Otros Item
				}
				//---------------
				Element Item = doc.createElementNS("", "cac:Item");
				InvoiceLine.appendChild(Item);//se anade al grupo InvoiceLine
				Item.appendChild(doc.createTextNode("\n"));

				Element Description = doc.createElementNS("", "cbc:Description");
				Item.appendChild(Description);//se anade al grupo Item
				//cdata = doc.createCDATASection(listaDet.getItem_descripcion().trim());
				cdata = doc.createCDATASection(product.getName().trim());
				//Description.appendChild(doc.createTextNode(listaDet.getItem_descripcion().trim()));
				Description.appendChild(cdata);

				//if (!listaDet.getItem_codproducto().equals("-")) {
				if (product.getName().length() > 0) {
					Element SellersItemIdentification = doc.createElementNS("", "cac:SellersItemIdentification");
					Item.appendChild(SellersItemIdentification);//se anade al grupo Item
					SellersItemIdentification.appendChild(doc.createTextNode("\n"));

					log.info("generarXMLZipiadoFactura - codigo Producto ");
					Element ID18 = doc.createElementNS("", "cbc:ID");
					SellersItemIdentification.appendChild(ID18);//se anade al grupo Item
					//ID18.appendChild(doc.createTextNode(listaDet.getItem_codproducto().trim()));
					ID18.appendChild(doc.createTextNode(product.getValue().trim()));
				}
				//-------------
				//if (!listaDet.getItem_codproducto_sunat().equals("-")) {
				if (product.getItemClassificationCode().length() != 0) {                   
					Element CommodityClassification = doc.createElementNS("", "cac:CommodityClassification");
					Item.appendChild(CommodityClassification);//se anade al grupo Item
					CommodityClassification.appendChild(doc.createTextNode("\n"));

					log.info("generarXMLZipiadoFactura - codigo Producto ");
					Element ItemClassificationCode = doc.createElementNS("", "cbc:ItemClassificationCode");
					CommodityClassification.appendChild(ItemClassificationCode);//se anade al grupo Item
					ItemClassificationCode.setAttribute("listID", "UNSPSC");
					ItemClassificationCode.setAttribute("listAgencyName", "GS1 US");
					ItemClassificationCode.setAttribute("listName", "Item Classification");
					//ItemClassificationCode.appendChild(doc.createTextNode(listaDet.getItem_codproducto_sunat().trim()));
					ItemClassificationCode.appendChild(doc.createTextNode(product.getItemClassificationCode().trim()));
				}

				//
				Element Price = doc.createElementNS("", "cac:Price");
				InvoiceLine.appendChild(Price);//se anade al grupo InvoiceLine
				Price.appendChild(doc.createTextNode("\n"));

				log.info("generarXMLZipiadoFactura - precio venta ");
				Element PriceAmount2 = doc.createElementNS("", "cbc:PriceAmount");
				//PriceAmount2.setAttributeNS(null, "currencyID", listaDet.getItem_moneda().trim());
				PriceAmount2.setAttributeNS(null, "currencyID", currency.getISO_Code());
				PriceAmount2.setIdAttributeNS(null, "currencyID", true);
				Price.appendChild(PriceAmount2);//se anade al grupo Price
				//PriceAmount2.appendChild(doc.createTextNode(listaDet.getItem_pventa().trim()));
				PriceAmount2.appendChild(doc.createTextNode(listaDet.getPriceActual().toString().trim()));				
			}
			log.info("generarXMLZipiadoFactura - Prepara firma digital ");
			//sig.setId(items.getEmpr_nroruc());
			sig.setId("obInvoiceSing"); // requerido para OSE EDG
			sig.addKeyInfo(cert);
			{
				Transforms transforms = new Transforms(doc);
				transforms.addTransform(Transforms.TRANSFORM_ENVELOPED_SIGNATURE);
				sig.addDocument("", transforms, Constants.ALGO_ID_DIGEST_SHA1);
			}
			/* 
			 * Add KeyInfo and sign() 
			 */
			{
				//Firmar el documento
				log.info("generarXMLZipiadoFactura - firma el XML ");
				sig.sign(privateKey);
			}
			//--------------------fin de construccion del xml---------------------
			///*combinacion de firma y construccion xml////
			FileOutputStream f = new FileOutputStream(signatureFile);
			Transformer tf = TransformerFactory.newInstance().newTransformer();
			tf.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
			//tf.setOutputProperty(OutputKeys.ENCODING, "ISO-8859-1");
			//tf.setOutputProperty(OutputKeys.INDENT, "yes");
			//tf.setOutputProperty(OutputKeys.STANDALONE, "no");
			//Writer out = new StringWriter();
			StreamResult sr = new StreamResult(f);
			tf.transform(new DOMSource(doc), sr);
			sr.getOutputStream().close();

			log.info("generarXMLZipiadoFactura - XML creado " + pathXMLFile);
			//====================== CREAR ZIP PARA EL ENVIO A SUNAT =======================
			resultado = GeneralFunctions.crearZip(m_bp, items, getFile(), signatureFile);			
		} catch (Exception ex) {
			ex.printStackTrace();
			resultado = "0100|Error al generar el archivo de formato xml de la Factura.";			
			log.log(Level.SEVERE, "generarXMLZipiadoFactura - error  " + ex.toString());
			try {
				//LecturaXML.guardarProcesoEstado(iddocument, "Q", resultado.split("\\|", 0), ex.getStackTrace()[0].toString(), conn);
				//LecturaXML.guardarProcesoEstado(items.getS_DocHeader_ID(), "Q", ex.getStackTrace()[0].toString(), "");
				MDocLog.setStatus(items.getS_DocHeader_ID(), "Q", ex.getStackTrace()[0].toString(), "");
			} catch (Exception ex1) {
				log.log(Level.SEVERE, ex1.toString());
				//log.error(ex1);
			}
		}
		return resultado;
	}

}
