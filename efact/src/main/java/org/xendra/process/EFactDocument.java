package org.xendra.process;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Enumeration;
import java.util.List;
import java.util.logging.Level;
import java.util.zip.ZipFile;

import javax.net.ssl.SSLContext;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.HttpClient;
//import org.apache.http.client.HttpClient;
//import org.apache.commons.httpclient.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.ssl.SSLContextBuilder;
import org.apache.http.ssl.SSLContexts;
import org.apache.http.util.EntityUtils;
import org.apache.tools.zip.ZipEntry;
import org.compiere.model.MBPartner;
import org.compiere.model.MBPartnerCertificate;
import org.compiere.model.MDocLog;
import org.compiere.model.MDocType;
import org.compiere.model.MErrorCodes;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_S_DocAdvance;
import org.compiere.model.persistence.X_S_DocHeader;
import org.compiere.model.persistence.X_S_DocLegend;
import org.compiere.model.persistence.X_S_DocLine;
import org.compiere.model.persistence.X_S_DocLineOthers;
import org.compiere.util.CLogger;
import org.compiere.util.Env;
import org.xendra.efact.EFactConstants;
import org.xendra.efact.process.GeneralFunctions;
import org.xendra.efact.util.LecturaXML;
import org.xendra.efact.util.Tools;
import org.xendra.efact.xml.HeaderHandlerResolver;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public abstract class EFactDocument {
	/**	Logger							*/	
	protected CLogger			log = CLogger.getCLogger (getClass());
	private String m_SendPath;
	private String m_pathFile;
	protected X509Certificate cert;
	protected MBPartner m_bp;
	protected MBPartnerCertificate m_bp_cert;
	protected X_S_DocHeader items;
	protected PrivateKey privateKey;
	private String accessToken;
	public EFactDocument(X509Certificate cert, MBPartner m_bp, MBPartnerCertificate m_bp_cert, PrivateKey privateKey, X_S_DocHeader items) {
		this.cert = cert;
		this.m_bp = m_bp;
		this.m_bp_cert = m_bp_cert;
		this.items = items;
		this.privateKey = privateKey;
	}
	protected void setFile(String unidadEnvio, String taxid,  String doctaxid, String DocumentNo) {
		m_SendPath = unidadEnvio;
		m_pathFile = String.format("%s%s-%s-%s", unidadEnvio, taxid, doctaxid, DocumentNo);
	}
	protected String getSendPath() {
		return m_SendPath;
	}	
	protected String getFile() {
		return m_pathFile;
	}

	protected String getFile(String extension) {
		String pathFile = "";
		if (extension == null)
			extension = "";
		if (extension.length() == 0)
			pathFile = m_pathFile;					
		else
			pathFile = String.format("%s.%s", m_pathFile, extension);
		return pathFile;
	}

	public String Process() {
		log.log(Level.WARNING, "ejecutando Invoice");		
		String resultado = "";
		// String unidadEnvio;// = Util.getPathZipFilesEnvio();
		String pathXMLFile;
		try {           
			MDocType dt = new Query(Env.getCtx(), MDocType.Table_Name, "C_DocType_ID = ?", null)
					.setParameters(items.getC_DocType_ID()).first();
			//X_C_DocumentTax taxdoc = new Query(Env.getCtx(), X_C_DocumentTax.Table_Name, "C_DocumentTax_ID = ?", null)
			//		.setParameters(dt.getC_DocumentTax_ID()).first();
			//if (taxdoc == null) {
			//	throw new Exception(String.format("Tax Document not defined in Document Type %s %s", dt.getC_DocType_ID(), dt.getName()));
			//}			
			log.info("generarXMLZipiadoFactura - Extraemos datos para preparar XML ");
			System.out.println("generarXMLZipiadoFactura - Extraemos datos para preparar XML ");
			List<X_S_DocLine> detdocelec = new Query(Env.getCtx(), X_S_DocLine.Table_Name, "S_DocHeader_ID = ?", null)
					.setParameters(items.getS_DocHeader_ID()).list();
			List<X_S_DocLineOthers> otrosDetalles = new Query(Env.getCtx(), X_S_DocLineOthers.Table_Name, "S_DocHeader_ID = ?", null)
					.setParameters(items.getS_DocHeader_ID()).list();
			List<X_S_DocAdvance> anticipos = new Query(Env.getCtx(), X_S_DocAdvance.Table_Name, "S_DocHeader_ID = ?", null)
					.setParameters(items.getS_DocHeader_ID()).list();
			List<X_S_DocLegend> leyendas = new Query(Env.getCtx(), X_S_DocLegend.Table_Name, "S_DocHeader_ID = ?", null)
					.setParameters(items.getS_DocHeader_ID()).list();     


			//String[] cdr = " | ".split("\\|", 0);
			//           LecturaXML.guardarProcesoEstado(nrodoc, "P", " | ".split("\\|", 0), "", "", conn);
			//LecturaXML.guardarProcesoEstado(items.getS_DocHeader_ID(), "P", "","");
			MDocLog.setStatus(items.getS_DocHeader_ID(), "P", "", "");
			//           log.info("generarXMLZipiadoFactura - Iniciamos cabecera ");
			log.info("generarXMLZipiadoFactura - Iniciamos cabecera ");         
			System.out.println("generarXMLZipiadoFactura - Iniciamos cabecera ");
			//crear el Xml firmado
			if (detdocelec != null) {
				if (items != null) {
					//unidadEnvio = ;
					setFile(Tools.getPathZipFilesEnvio(m_bp, items.getDateInvoiced()), m_bp.getTaxID(), items.getTaxID(),items.getDocumentNo());
					log.info("generarXMLZipiadoFactura - Ruta de directorios " + getSendPath());
					System.out.println("generarXMLZipiadoFactura - Ruta de directorios " + getSendPath());
					//                    pathXMLFile = unidadEnvio + items.getEmpr_nroruc() + "-" + items.getDocu_tipodocumento() + "-" + items.getDocu_numero() + ".xml";					
					pathXMLFile = getFile("xml");					
					//======================crear XML =======================
					//                    if ("1".equals(items.getFlgXml())) {
					//                        
					//                        resultado = creaXml(items, detdocelec, anticipos, leyendas, otrosDetalles, unidadEnvio, conn);
					//
					//                        //======================guardar Hash Y Barcode PDF417 =======================
					//                        System.out.println("generarXMLZipiadoFactura - Crear Hashcode y CodeBarPDF417");
					//                        
					//                        LecturaXML.guardarHashYBarCodeQR(items.getDocu_tipodocumento(), nrodoc, "DV", pathXMLFile, conn);
					//                        LecturaXML.guardarProcesoEstado(nrodoc, "", " | ".split("\\|", 0), " ", "update cabecera set flg_xml=0 where docu_codigo= " + nrodoc, conn);
					//                    }					
					if (m_bp_cert.getBoolean(EFactConstants.SENDXML)) {

						resultado = creaXml(items, detdocelec, anticipos, leyendas, otrosDetalles);

						//======================guardar Hash Y Barcode PDF417 =======================
						System.out.println("generarXMLZipiadoFactura - Crear Hashcode y CodeBarPDF417");

						//LecturaXML.guardarHashYBarCodeQR(items.getDocu_tipodocumento(), nrodoc, "DV", pathXMLFile, conn);
						LecturaXML.guardarHashYBarCodeQR(items.getTaxID(), items.getS_DocHeader_ID(), "DV", pathXMLFile);						
						//LecturaXML.guardarProcesoEstado(items.getS_DocHeader_ID(), "Y",  " ", "update cabecera set flg_xml=0 where docu_codigo= " + items.getS_DocHeader_ID());
						MDocLog.setStatus(items.getS_DocHeader_ID(), "Y", "", "");
					}
					//
					//                    //====================== Guardar PDF =======================
					//                    if ("1".equals(items.getFlgPdf())) {
					//                        System.out.println("generarXMLZipiadoFactura - Crear PDF");
					//                        resultado = GeneralFunctions.creaPdf(items, unidadEnvio, conn, "FacturaElectronica.jasper");
					//                        LecturaXML.guardarProcesoEstado(nrodoc, "", " | ".split("\\|", 0), " ", "update cabecera set flg_pdf=0 where docu_codigo= " + nrodoc, conn);
					//                    }
					//====================== Guardar PDF =======================
					if (m_bp_cert.getBoolean(EFactConstants.SENDPDF)) {					
						System.out.println("generarXMLZipiadoFactura - Crear PDF");
						resultado = GeneralFunctions.creaPdf(m_bp_cert, items, getFile("pdf"));
						//LecturaXML.guardarProcesoEstado(items.getS_DocHeader_ID(), "Y", " ", "update cabecera set flg_pdf=0 where docu_codigo= " + items.getS_DocHeader_ID());
						MDocLog.setStatus(items.getS_DocHeader_ID(), "Y", "", "");
					} 									
					//====================== SUBIR PDF AL FTP INDICADO =======================
					//                    if ("1".equals(items.getFlgFtp())) {
					//                        resultado = GeneralFunctions.copiaAFtp(items, unidadEnvio, conn);
					//                        LecturaXML.guardarProcesoEstado(nrodoc, "", " | ".split("\\|", 0), " ", "update cabecera set flg_ftp=0 where docu_codigo= " + nrodoc, conn);
					//                    }
					if (m_bp_cert.getBoolean(EFactConstants.SENDFTP)) {					
						resultado = GeneralFunctions.copiaAFtp(m_bp_cert, items, getFile());
					}
					//                    /*======================= EVALUANDO EMPRESA =============*/
					//                    System.out.println("generarXMLZipiadoFactura - Evaluando Empresa para crear Link");
					//                    Externo.creaEmpresa(items.getClie_numero(), items.getClie_nombre(), items.getClie_correo_cpe0(), conn);
					//                    /*======================= ENVIO A SUNAT =============*/
					/*======================= EVALUANDO EMPRESA =============*/
					System.out.println("generarXMLZipiadoFactura - Evaluando Empresa para crear Link");
					// no es necesario porque las empresas ya estan creadas en Xendra
					//Externo.creaEmpresa(items.getClie_numero(), items.getClie_nombre(), items.getClie_correo_cpe0(), conn);
					//                    if (items.getDocu_enviaws().equals("S")) {
					//                        if ("1".equals(items.getFlgSunat())) {
					//                            System.out.println("generarXMLZipiadoFactura - Preparando para enviar a SUNAT");
					//                            LecturaXML.guardarProcesoEstado(nrodoc, "E", " | ".split("\\|", 0), " ", "", conn);
					//                            resultado = enviarASunat(nrodoc, unidadEnvio, items.getEmpr_nroruc() + "-" + items.getDocu_tipodocumento() + "-" + items.getDocu_numero() + ".zip", conn, items.getEmpr_nroruc(), items.getDocu_fecha());
					//                            LecturaXML.guardarProcesoEstado(nrodoc, "", " | ".split("\\|", 0), " ", "update cabecera set flg_sunat=0 where docu_codigo= " + nrodoc, conn);
					//                            //resultado="termino de generar el archivo xml de la factura";
					//                        }
					//                    } else {
					//                        /*este caso de boleta no se envia al sunat*/
					//                        log.info("generarXMLZipiadoBoleta - No se envia a SUNAT");
					//                        System.out.println("generarXMLZipiadoBoleta - No se envia a SUNAT");
					//                        // revisar
					//                        if ("03".equals(items.getDocu_tipodocumento())) {
					//                            resultado = "0|El Comprobante numero " + items.getDocu_numero() + ", ha sido aceptado. - Sin ES";
					//                        } else if ("07-08".contains(items.getDocu_tipodocumento()) && "03".equals(items.getNota_tipodoc())) {
					//                            resultado = "0|El Comprobante numero " + items.getDocu_numero() + ", ha sido aceptado. - Sin ES";
					//                        }
					//                        
					//                        System.out.println("resultado = " + resultado);
					//                    }
					if (m_bp_cert.getBoolean(EFactConstants.SENDOSE)) {
						//if (items.getDocu_enviaws().equals("S")) {
						// if ("1".equals(items.getFlgSunat())) {
						System.out.println("generarXMLZipiadoFactura - Preparando para enviar a SUNAT");
						//LecturaXML.guardarProcesoEstado(nrodoc, "E", " | ".split("\\|", 0), " ", "", conn);
						MDocLog.setStatus(items.getS_DocHeader_ID(), "E", "", "");
						//pathXMLFile = getFile(unidadEnvio, taxdoc,items.getDocumentNo(),   "xml");
						resultado = enviarOSE(items, new File(getFile("xml")), new File(getFile("zip")));
						//private String enviarASunat(X_S_DocHeader items, String unidadEnvio, String zipFileName, String fecha) throws Exception {

						//LecturaXML.guardarProcesoEstado(nrodoc, "", " | ".split("\\|", 0), " ", "update cabecera set flg_sunat=0 where docu_codigo= " + nrodoc, conn);
						MDocLog.setStatus(items.getS_DocHeader_ID(), "X", resultado, "");
						//resultado="termino de generar el archivo xml de la factura";
						//}
					} else {
						/*este caso de boleta no se envia al sunat*/
						log.info("generarXMLZipiadoBoleta - No se envia a SUNAT");
						System.out.println("generarXMLZipiadoBoleta - No se envia a SUNAT");
						// revisar
						if (items.getTaxID().equals("03")) { 
							//if ("03".equals(items.getDocu_tipodocumento())) {
							//resultado = "0|El Comprobante numero " + items.getDocu_numero() + ", ha sido aceptado. - Sin ES";
							resultado = String.format("El Comprobante numero %s ha sido aceptado - Sin ES", items.getDocumentNo()); 
							MDocLog.setStatus(items.getS_DocHeader_ID(), "", "0", resultado);
							//} else if ("07-08".contains(items.getDocu_tipodocumento()) && "03".equals(items.getNota_tipodoc())) {
						} else if ("07-08".contains(items.getTaxID()) && "03".equals(items.getReferenceTaxID().trim())) {
							resultado = String.format("El Comprobante numero %s ha sido aceptado - Sin ES", items.getDocumentNo());
							MDocLog.setStatus(items.getS_DocHeader_ID(), "", "0", resultado);  
						}						
						//
					} 
					//resultado = "0|El Comprobante numero " + items.getDocu_numero() + ", ha sido aceptado. - Sin ES";						
					System.out.println("resultado = " + resultado);				
					/*=======================ENVIO CORREO AL CLIENTE=============*/
					if (m_bp_cert.getBoolean(EFactConstants.SENDEMAIL)) {
						if (items.getCDR().equals("0")) {
							GeneralFunctions.sendEmail(m_bp_cert, items, getFile(),"Comprobante de factura electronica");
						}

					}
					//                    if ("1".equals(items.getFlgEmail())) {
					//                        items = DElectronicoDespachador.cargarDocElectronico(nrodoc, conn);
					//                        if (items.getCdr().equals("0")) {
					//                            //envio normal 
					//                            resultado = GeneralFunctions.enviarEmail(items, unidadEnvio, conn, resultado, " COMPROBANTE DE FACTURA ELECTRONICA ");
					//                            // daet ini
					//                            //Solo rimac
					////                            String rucRimacSalud = "20414955020";
					////                            String rucRimacEPS = "20100041953";
					////                            String urlApiRest = "https://hqiqga3e5a.execute-api.us-east-2.amazonaws.com/felapi/subirfelnube";
					////                            subirFelNube(items, nrodoc, unidadEnvio, pathXMLFile, rucRimacSalud, rucRimacEPS, urlApiRest, conn);
					//                            // daet fin
					//
					//                        }
					//                        LecturaXML.guardarProcesoEstado(nrodoc, "", " | ".split("\\|", 0), " ", "update cabecera set flg_email=0 where docu_codigo=" + nrodoc, conn);
					//                        log.info("generarXMLZipiadoFactura - Proceso envio correo correctamente  " + items.getEmpr_nroruc() + "-" + items.getDocu_tipodocumento() + "-" + items.getDocu_numero());
					//                    }
					//                    
					//                    System.out.println("Guardando estado a O");
					//                    LecturaXML.guardarProcesoEstado(nrodoc, "O", resultado.split("\\|", 0), "", "", conn);
					//
					//                } else {
					//                    resultado = "0004|No existe Cabecera de documento ==>> " + items.getEmpr_nroruc() + "-" + items.getDocu_tipodocumento() + "-" + items.getDocu_numero();
					//                    System.out.println("resultado = " + resultado);
				}
			} else {
				resultado = "0003|No existe detalle de documento ==>> " + m_bp.getTaxID() + "-" + items.getSerial() + "-" + items.getDocumentNo();
				System.out.println("resultado = " + resultado);
			}

		} catch (Exception ex) {
			String error = ex.getMessage();
			items.setErrorMsg(error);
			items.setProcessed(true);
			items.save();			
			//            resultado = "0100|Error al generar el archivo de formato xml de la Factura.";
			//            log.error("generarXMLZipiadoFactura - error  " + ex.toString());
			//            System.out.println("generarXMLZipiadoFactura - error  " + ex.toString());
			//            try {
			//                LecturaXML.guardarProcesoEstado(iddocument, "Q", resultado.split("\\|", 0), ex.getStackTrace()[0].toString(), "", conn);
			//                System.out.println("guardarProcesoEstado a Q");
			//            } catch (SQLException ex1) {
			//                log.error(ex1);
			//            }

		}
		return null;
	}

	public abstract String creaXml(X_S_DocHeader items,
			List<X_S_DocLine> detdocelec,
			List<X_S_DocAdvance> anticipos,
			List<X_S_DocLegend> leyendas,
			List<X_S_DocLineOthers> otrosdetalles);
	
	protected String enviarOSE(X_S_DocHeader items, File xmlFileName, File zipFileName) throws Exception {
		String resultado = "";
		String provider = m_bp_cert.get(EFactConstants.PROVIDER);
		if (provider.equals(EFactConstants.OSE_EFACT)) {
			resultado = enviarEFact(items, xmlFileName, zipFileName);
		} else if (provider.equals(EFactConstants.OSE_SUNAT)) {
			resultado = enviarsunat(items, xmlFileName, zipFileName);
		}
		return resultado;
	}
	
	protected String enviarEFact(X_S_DocHeader items, File xmlFileName, File zipFileName) throws Exception {
		String resultado = "";
		try {
			if (accessToken == null) {
				accessToken = getToken();
			}
			//HttpPost post = new HttpPost("http://ose-gw1.efact.pe:443/api-efact-ose/v1/document");
			HttpPost post = new HttpPost("https://ose-qa-rest.efact.pe/api-efact-ose/v1/document");
			post.setHeader("Authorization", "Bearer " + accessToken);
			MultipartEntityBuilder builder = MultipartEntityBuilder.create();
			builder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);
			byte[] xml = Files.readAllBytes(xmlFileName.toPath());
			builder.addBinaryBody("file", xml, ContentType.create("text/xml"), xmlFileName.getName());			
			HttpEntity entity = builder.build();
			post.setEntity(entity);
			CloseableHttpClient client = HttpClients.createDefault();			
			HttpResponse response = client.execute(post);			
			int status = response.getStatusLine().getStatusCode();
			System.out.println("STATUS CODE:" + status);
			if (status == 200) {
				HttpEntity entity1 = response.getEntity();
				String jsonResponse = entity1 != null ? EntityUtils.toString(entity1) : null;
				String ticket= null;
				// Se transforma el Json y se obtiene el ticket
				ObjectMapper mapper = new ObjectMapper();
				JsonNode rootNodeResponse = mapper.readTree(jsonResponse);
				ticket = rootNodeResponse.path("description").asText();
				System.out.println("TICKET" + ticket);
			}
			
			// 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resultado;
	}
	protected String enviarsunat(X_S_DocHeader items, File xmlFileName, File zipFileName) throws Exception {
		String resultado ="";
		try {
			javax.activation.FileDataSource fileDataSource = new javax.activation.FileDataSource(zipFileName);
			javax.activation.DataHandler dataHandler = new javax.activation.DataHandler(fileDataSource);
			byte[] respuestaSunat = null;
			String var = m_bp_cert.get(EFactConstants.AMBIENTE);
			switch (var) {
			case EFactConstants.BETA:	 
				pe.gob.sunat.servicio.registro.comppago.factura.gem.service_bta.BillService_Service_fe ws1 = 
				new pe.gob.sunat.servicio.registro.comppago.factura.gem.service_bta.BillService_Service_fe();
				HeaderHandlerResolver handlerResolver1 = new HeaderHandlerResolver();
				handlerResolver1.setPartnerCertificate(m_bp_cert);
				handlerResolver1.setVruc("ruc");
				ws1.setHandlerResolver(handlerResolver1);
				pe.gob.sunat.servicio.registro.comppago.factura.gem.service_bta.BillService port1 = ws1.getBillServicePort();
				respuestaSunat = port1.sendBill(zipFileName.getName(), dataHandler);
				break;
			case EFactConstants.QA:
				pe.gob.sunat.servicio.registro.comppago.factura.gem.servicesqa.BillService_Service_sqa ws2 = 
				new pe.gob.sunat.servicio.registro.comppago.factura.gem.servicesqa.BillService_Service_sqa();
				HeaderHandlerResolver handlerResolver2 = new HeaderHandlerResolver();
				handlerResolver2.setVruc("ruc");
				handlerResolver2.setPartnerCertificate(m_bp_cert);
				pe.gob.sunat.servicio.registro.comppago.factura.gem.servicesqa.BillService port2  = ws2.getBillServicePort();
				respuestaSunat = port2.sendBill(zipFileName.getName(), dataHandler);
				break;
			case EFactConstants.PRODUCTION: 
				pe.gob.sunat.servicio.registro.comppago.factura.gem.service.BillService_Service_fe ws3 = 
				new pe.gob.sunat.servicio.registro.comppago.factura.gem.service.BillService_Service_fe();
				HeaderHandlerResolver handlerResolver3 = new HeaderHandlerResolver();
				handlerResolver3.setVruc("ruc");
				handlerResolver3.setPartnerCertificate(m_bp_cert);
				ws3.setHandlerResolver(handlerResolver3);
				pe.gob.sunat.servicio.registro.comppago.factura.gem.service.BillService port3 = ws3.getBillServicePort();
				respuestaSunat = port3.sendBill(zipFileName.getName(), dataHandler);
				break;
			case "p1":
				pe.gob.sunat.serviceOescondatagate.BillServicePortService ws4 = 
				new pe.gob.sunat.serviceOescondatagate.BillServicePortService();
				HeaderHandlerResolver handlerResolver4 = new HeaderHandlerResolver();
				handlerResolver4.setVruc("ruc");
				handlerResolver4.setPartnerCertificate(m_bp_cert);
				ws4.setHandlerResolver(handlerResolver4);
				pe.gob.sunat.serviceOescondatagate.BillServicePort port4 = ws4.getBillServicePortSoap11();
				respuestaSunat = port4.sendBill(zipFileName.getName(), dataHandler, resultado);            
				break;
			case "p2":
				pe.gob.sunat.serviciotci.registro.comppago.factura.gem.service.BillService ws7 = 
				new pe.gob.sunat.serviciotci.registro.comppago.factura.gem.service.BillService();
				HeaderHandlerResolver handlerResolver7 = new HeaderHandlerResolver();
				handlerResolver7.setVruc("ruc");
				ws7.setHandlerResolver(handlerResolver7);
				pe.gob.sunat.serviciotci.registro.comppago.factura.gem.service.BillServicePort port7 = ws7.getBillServicePortSoap11();
				respuestaSunat = port7.sendBill(zipFileName.getName(), dataHandler);
				break;			
			default:
				respuestaSunat = null;
			}
			//======= grabando la respuesta de SUNAT en archivo ZIP
			String pathRecepcion = Tools.getDirectorio(m_bp_cert.get(EFactConstants.RECEIVEFILESPATH), items.getDateInvoiced());
			//String pathRecepcion = String.format("%s%s", m_bp_cert.get(EFactConstants.RECEIVEFILESPATH), fecha);
			// System.out.println("Preparandose para crear el cdr ");
			FileOutputStream fos = new FileOutputStream(pathRecepcion + "R-" +zipFileName.getName());
			fos.write(respuestaSunat);
			fos.close();
			System.out.println("Se creo el cdr y preparandose para abrir el cdr");
			// descomprimiendo el zip de la sunat
			ZipFile archive = new ZipFile(pathRecepcion + "R-" + zipFileName);
			Enumeration e = archive.entries();
			while (e.hasMoreElements()) {
				ZipEntry entry = (ZipEntry) e.nextElement();
				File file = new File(pathRecepcion, entry.getName());
				System.out.println("<<< Quien es:" + file.getName()+">>>>>");
				System.out.println("<<< Directorio: " + file.isDirectory() +">>>>");
				System.out.println("<<< Archivo: " + file.isFile()+">>>>");
				if (!file.isDirectory()) {
					if (entry.isDirectory() && !file.exists()) {
						// file.mkdirs
					} else {
						if (!file.getParentFile().exists()) {
							file.getParentFile().mkdirs();
						}
						InputStream in = archive.getInputStream(entry);
						BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(file));
						byte[] buffer = new byte[8192];
						int read;
						while (-1 != (read = in.read(buffer))) {
							out.write(buffer, 0, read);
						}
						in.close();
						out.close();
					}
				}
			}
			archive.close();
			System.out.println("Leyendo cdr xml");
			// ========== leyendo los resultados de la sunat
			//zipFileName = zipFileName.substring(0, zipFileName.indexOf(".zip"));
			String trans = "codigodoc";
			String pathReception = "/home/xapiens";
			resultado = LecturaXML.getRespuestaSunat(items, trans, pathReception + "R-" +zipFileName.getName() + ".xml");
			System.out.println("====> El envio del zip a sunat fue exitoso");
		} catch (javax.xml.ws.soap.SOAPFaultException ex) {
			ex.printStackTrace();
			String errorCode = ex.getFault().getFaultCodeAsQName().getLocalPart();
			errorCode = errorCode.substring(errorCode.indexOf(".") + 1, errorCode.length());		    
			//resultado = Util.getErrorMesageByCode(errorCode, vruc);
			resultado = MErrorCodes.getCode(errorCode);
			//MDocLog.setStatus(items.getS_DocHeader_ID(), "ECDR", errorCode, resultado);		    
			MDocLog.setStatus(items.getS_DocHeader_ID(), "E", errorCode, resultado);
		}
		return resultado;
	}

	protected String getToken() throws Exception {
		String accessToken = null;
		String keystoreFile = m_bp_cert.get(EFactConstants.CACERTSFILE);
		System.out.println(keystoreFile);
		String pwd = m_bp_cert.get(EFactConstants.CACERTSPASSWORD);
		//String pwd = SecureEngine.decrypt(pwdsecure);
		String oseuser     = m_bp_cert.get(EFactConstants.OSEUSER);
		String osepassword = m_bp_cert.get(EFactConstants.OSEPASSWORD);
		String osetoken = m_bp_cert.get(EFactConstants.OSE_TOKEN); 
		//String pwd = m_bp_cert.get(EFactConstants.PASSWORD);			
		//String pwdsecure = SecureEngine.decrypt(pwd);
		File store = new File(keystoreFile);
		if (store.exists()) {
			SSLContextBuilder SSLBuilder = SSLContexts.custom();
			SSLBuilder = SSLBuilder.loadTrustMaterial(store, pwd.toCharArray());
			SSLContext sslContext = SSLBuilder.build();		
			
			CredentialsProvider credsProvider = new BasicCredentialsProvider();
			credsProvider.setCredentials(
					new AuthScope(AuthScope.ANY_HOST, 443),
					new UsernamePasswordCredentials(oseuser, osepassword));				
			SSLConnectionSocketFactory sslConSocFactory = new SSLConnectionSocketFactory(sslContext, new NoopHostnameVerifier());
			HttpClientBuilder clientbuilder = HttpClients.custom();
			clientbuilder = clientbuilder.setSSLSocketFactory(sslConSocFactory);
			clientbuilder.setDefaultCredentialsProvider(credsProvider);
			CloseableHttpClient httpclient = clientbuilder.build();
			HttpPost httpPost = new HttpPost(osetoken);
			String credentials =
					Base64.getEncoder().encodeToString("client:secret".getBytes("UTF-8"));
			httpPost.setHeader("Authorization", "Basic " + credentials);
			httpPost.setHeader("Content-type", "application/x-www-form-urlencoded");
			List<NameValuePair> params = new ArrayList<>();
			params.add(new BasicNameValuePair("grant_type", "password"));
			params.add(new BasicNameValuePair("username", oseuser));
			// t7Ou7J9y
			// 2c5FKGvEAD
			params.add(new BasicNameValuePair("password", osepassword));
			httpPost.setEntity(new UrlEncodedFormEntity(params));
			//Se envía la petición y se recibe el json con el token
			//httpPost.setHeader("Content-type","text/html;charset=utf-8");
			String json= null;		
			json = httpclient.execute(httpPost, new StringResponseHandler());
			// En caso de enviar datos correcto se obtiene el token de autenticación
			ObjectMapper mapper = new ObjectMapper();
			JsonNode rootNodeToker = mapper.readTree(json);
			accessToken = rootNodeToker.path("access_token").asText();
			System.out.println("TOKEN: " + accessToken);
		}
		return accessToken; 
	}
	
	private static class StringResponseHandler implements ResponseHandler<String> {
		@Override
		public String handleResponse(HttpResponse response) throws IOException {
            ContentType contentType = ContentType.getOrDefault(response.getEntity());
            System.out.println(contentType);
			int status = response.getStatusLine().getStatusCode();
			if (status >= 200 && status < 300) {
				HttpEntity entity = response.getEntity();
				return entity != null ? EntityUtils.toString(entity) : null;
			} else {
				throw new ClientProtocolException("Unexpected response status: " + status);
			}
		}
	}

	
}
