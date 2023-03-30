package org.xendra.efact.util;


import com.google.zxing.BarcodeFormat;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.FileSystems;
import java.nio.file.Path;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.commons.io.output.ByteArrayOutputStream;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_S_DocHeader;
import org.compiere.model.persistence.X_S_DocLog;
import org.compiere.util.Env;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;



public class LecturaXML {

//	public static void guardarProcesoEstado(int S_DocHeader_ID, String process, String cdr1, String cdr2) {
//		X_S_DocLog log = new Query(Env.getCtx(), X_S_DocLog.Table_Name, "S_DocHeader_ID = ?", null)
//				.setParameters(S_DocHeader_ID).first();
//		if (log == null) {
//			log = new X_S_DocLog(Env.getCtx(), 0, null);
//			log.setS_DocHeader_ID(S_DocHeader_ID);
//		}				
//		log.setTaskStatus(process);
//		log.setcdr_code(cdr1);
//		log.setCDR_Nota(cdr2);
//		log.save();
//	}

	public void guardarHashYBarCodeQR(String taxID, int s_DocHeader_ID, String string, String pathXMLFile) {
		try {
			String hashCode = LecturaXML.obtenerDigestValue(pathXMLFile);
			// Almacenando BarcodePDF417 (Codigo de barra) 
			String infobarcode = taxID.equals("20") ? getInfoToBarCodeOD(pathXMLFile) : getInfoToBarCode(pathXMLFile);
			infobarcode = infobarcode.replaceAll("\n", "");
			System.out.println("==>infoBarcode:"+infobarcode);
			QRCodeWriter qrCodeWriter = new QRCodeWriter();
			BitMatrix bitMatrix = qrCodeWriter.encode(infobarcode, BarcodeFormat.QR_CODE, 350, 350);
			
			Path path = FileSystems.getDefault().getPath(pathXMLFile.replace("xml", "png"));
			MatrixToImageWriter.writeToPath(bitMatrix, "PNG", path);
			//
			ByteArrayOutputStream pngOutputStream = new ByteArrayOutputStream();
			MatrixToImageWriter.writeToStream(bitMatrix, "PNG", pngOutputStream);
			byte[] pngImageData = pngOutputStream.toByteArray();
			
			InputStream is = new ByteArrayInputStream(pngImageData);
			// actualizamos el grafico del barcode
			X_S_DocHeader header = new Query(Env.getCtx(), X_S_DocHeader.Table_Name, "S_DocHeader_ID = ?", null)
						.setParameters(s_DocHeader_ID).first();
			header.setHashCode(hashCode);
			header.setBarCode(pngImageData);
			header.setdocu_link_xml(infobarcode);
			header.save();
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
	

	private static String obtenerDigestValue(String path) {
		String firma = null;
		try {
			DocumentBuilderFactory fabricaCreadorDocumento = DocumentBuilderFactory.newInstance();
			DocumentBuilder creadorDocumento = fabricaCreadorDocumento.newDocumentBuilder();
			Document documento = creadorDocumento.parse(path);
			// Obtener el elemento raiz del documento
			Element raiz = documento.getDocumentElement();
			// Obtener la lista de nodos que tienen etiqueta "ds:Reference"			
			NodeList listaEmpleados = raiz.getElementsByTagName("ds:Reference");
			// Recorrer la lista de empleados
			for (int i = 0; i < listaEmpleados.getLength(); i++) {
				// Obtener de la lista un empleado tras otro
				Node empleado = listaEmpleados.item(i);
				// Obtener la lista de los datos que contiene ese ds:Reference
				NodeList datosEmpleado = empleado.getChildNodes();
				// Recorrer la lista de los datos que contiene el ds:Reference
				for (int j=0; j < datosEmpleado.getLength(); j++) {
					// Obtener de la lista de datos un dato tras otro
					Node dato = datosEmpleado.item(j);
					// Comprobar que el dato se trata de un nodo de tipo Element
					if (dato.getNodeType() == Node.ELEMENT_NODE) {
						// Mostrar el nombre del tipo de dato
						if (dato.getNodeName() == "ds:DigestValue") {
							// El valor esta contenido 	en un hijo del nodo Element
							Node datoContenido = dato.getFirstChild();
							// Mostrar el valor contenido en el nodo que debe ser de tipo Text
							if (datoContenido != null && datoContenido.getNodeType() == Node.TEXT_NODE) {
								// System.out.println(datoContenido.getNodeValue());
								if ( datoContenido.getNodeValue() != null) {
									firma = datoContenido.getNodeValue();
								}
							}
						}
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return firma;
	}
	
	public String getInfoToBarCode(String path) {
		String respuesta = "";
		try {
			String IssueDate = "";
			DocumentBuilderFactory fabricaCreadorDocumento = DocumentBuilderFactory.newInstance();
			DocumentBuilder creadorDocumento = fabricaCreadorDocumento.newDocumentBuilder();
			Document documento = creadorDocumento.parse(path); 
			// Obtener el elemento raiz del documento
			Element raiz = documento.getDocumentElement();
			
			// RUC
			NodeList nodlist = raiz.getElementsByTagName("cac:PartyIdentification");
			respuesta += nodlist.item(0).getTextContent() + "|";
			
			// Invoice Type Code
			NodeList InvoiceTypeCode = raiz.getElementsByTagName("cbc:InvoiceTypeCode").item(0) == null ? raiz.getElementsByTagName("cbc:ResponseCode") : raiz.getElementsByTagName("cbc:InvoiceTypeCode");
			respuesta += InvoiceTypeCode.item(0).getTextContent() + "|";
			// cbc:ID
			nodlist = raiz.getChildNodes();
			for (int i = 0; i < nodlist.getLength(); i++) {
				Node nod = nodlist.item(i);
				if (nod.getNodeName().equals("cbc:ID")) {
					respuesta += nod.getTextContent().replaceAll("-", "|") + "|";					
				}
				if (nod.getNodeName().equals("cbc:IssueDate")) {
					IssueDate = nod.getTextContent();
				}
			}
			// Legal Monetary Total
			nodlist = raiz.getElementsByTagName("cac:LegalMonetaryTotal").item(0) == null ? 
					raiz.getElementsByTagName("cac:RequestedMonetaryTotal").item(0).getChildNodes()  : 
					raiz.getElementsByTagName("cac:LegalMonetaryTotal").item(0).getChildNodes();
			for (int i =0; i < nodlist.getLength(); i ++) {
				Node nod = nodlist.item(i);
				if (nod.getNodeName().equals("cbc:TaxExclusiveAmount")) { // NO EN : ND
					respuesta += nod.getTextContent() + "|";
				}
				if (nod.getNodeName().equals("cbc:PayableAmount")) {
					respuesta += nod.getTextContent() + "|";
				}
			}
			// IssueDate
			respuesta += IssueDate + "|";
			
			// AccountingCustomerParty
			nodlist = raiz.getElementsByTagName("cac:AccountingCustomerParty").item(0).getChildNodes();
			for (int i=0; i < nodlist.getLength(); i++) {
				Node nod = nodlist.item(i);
				if (nod.getNodeName().equals("cbc:AdditionalAccountID")) {
					respuesta += nod.getTextContent() + "|";
				}
			}
			for (int i=0; i < nodlist.getLength(); i++) {
				Node nod = nodlist.item(i);
				if (nod.getNodeName().equals("cbc:CustomerAssignedAccountID")) {
					respuesta += nod.getTextContent() + "|";
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return respuesta;
	}
	
	public String getInfoToBarCodeOD(String path) {
		String respuesta = "";
		try {
			String IssueDate = "";
			DocumentBuilderFactory fabricaCreadorDocumento = DocumentBuilderFactory.newInstance();
			DocumentBuilder creadorDocumento = fabricaCreadorDocumento.newDocumentBuilder();
			Document documento = creadorDocumento.parse(path);
			// Obtener el elemento raiz del documento
			Element raiz = documento.getDocumentElement();
			
			// RUC
			NodeList nodlist = raiz.getElementsByTagName("cac:PartyIdentification");
			respuesta += nodlist.item(0).getTextContent() + "|";
			
			// InvoiceTypeCode
			respuesta += "20" + "|"; // 
			// cbc:ID
			nodlist = raiz.getChildNodes();
			for (int i=0; i < nodlist.getLength(); i++) {
				Node nod = nodlist.item(i);
				// DocumentNo
				if (nod.getNodeName().equals("cbc:ID")) {
					respuesta += nod.getTextContent().replaceAll("-", "|") + "|";					
				}
				if (nod.getNodeName().equals("cbc:IssueDate")) {
					IssueDate = nod.getTextContent();
				}
			}
			// LegalMonetaryTotal
			nodlist = raiz.getElementsByTagName("cbc:TotalInvoiceAmount");
			respuesta += nodlist.item(0).getTextContent() + "|";
			
			nodlist = raiz.getElementsByTagName("sac:SUNATTotalPaid");
			respuesta += nodlist.item(0).getTextContent() + "|";
			// IssueDate
			respuesta += IssueDate + "|";
			
			// AccountingCustomerParty
			nodlist = raiz.getElementsByTagName("cac:ReceiverParty").item(0).getChildNodes();
			for (int i = 0; i < nodlist.getLength(); i++) {
				Node nod = nodlist.item(i);
				if (nod.getNodeName().equals("cac:PartyIdentification")) {
					NodeList noi = nod.getChildNodes();
					for (int x = 0; x < noi.getLength(); x++) {
						Node nodx = noi.item(x);
						if (nodx.getNodeName().equals("cbc:ID")) {
							respuesta += nodx.getAttributes().getNamedItem("schemeID").getTextContent() + "|";
							respuesta += nodx.getTextContent() + "|";
						}
					}
				}
						
			}
			for (int i = 0; i < nodlist.getLength(); i++) {
				Node nod = nodlist.item(i);
				if (nod.getNodeName().equals("cbc:CustomerAssignedAccountID")) {
					respuesta += nod.getTextContent() + "|";
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return respuesta;
	}

	public static String getRespuestaSunat(X_S_DocHeader items, String trans, String path) {
		String respuesta = null;
		String nota = "";
		try {
			System.out.println("LecturaXML.getRespuestaSunat - iniciamos Lectura del contenido del CDR "+ path);
			DocumentBuilderFactory fabricaCreadorDocumento = DocumentBuilderFactory.newInstance();
			DocumentBuilder creadorDocumento = fabricaCreadorDocumento.newDocumentBuilder();
			Document documento = creadorDocumento.parse(path);
			// Obtener el elemento raiz del documento
			Element raiz = documento.getDocumentElement();
			
			// Obtener la lista de nodos que tienen etiqueta "ds:Reference"
			NodeList responsecode = raiz.getElementsByTagName("cbc:ResponseCode");
			for (int i = 0; i < responsecode.getLength(); i++) {
				Node empleado = responsecode.item(i);
				Node datoContenido = empleado.getFirstChild();
				respuesta = datoContenido.getNodeValue();
			}
			NodeList nodesc = raiz.getElementsByTagName("cbc:Description");
			for (int i = 0; i < nodesc.getLength(); i++) {
				Node empleado = nodesc.item(i);
				Node datoContenido = empleado.getFirstChild();
				respuesta = respuesta + "|" + datoContenido.getNodeValue();				
			}
			NodeList note = raiz.getElementsByTagName("cbc:Note");
			for (int i = 0; i < note.getLength(); i++) {
				Node empleado = note.item(i);
				Node datoContenido = empleado.getFirstChild();
				nota = nota + datoContenido.getNodeValue() + "\\n";
			}
			String[] cdr = respuesta.split("\\|", 0);
			items.setdocu_link_cdr(path);
			items.setCDR_Observation(nota);
			items.setCDR(cdr[0]);
			items.setCDR_Nota(cdr[1]);
			items.save();
			System.out.println("resultado del CDR Observacion" + nota);
			System.out.println("resultado del CDR codigo" + cdr[0]);
			System.out.println("resultado del CDR nota" + cdr[1]);
			// guardar el link
			//LecturaXML.guardarProcesoEstado(0, "ECDR", cdr, nota, "");
			
		} catch (org.xml.sax.SAXException ex) {						
			respuesta = "Error al leer el archivo de respuesta";
			ex.printStackTrace();
		} catch (IOException ex) {			
			respuesta = "Error al leer el archivo de respuesta";
			ex.printStackTrace();
		} catch (ParserConfigurationException ex) {
			respuesta = "Error al leer el archivo de respuesta";
			ex.printStackTrace();
		} catch (Exception ex) {
			respuesta = "Error al leer el archivo de respuesta";
			ex.printStackTrace();
		} finally {
			
		}
		return respuesta;
	}
}
