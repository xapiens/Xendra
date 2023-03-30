package org.xendra.process;

import java.io.File;
import java.io.FileInputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;

import org.compiere.model.MBPartner;
import org.compiere.model.MBPartnerCertificate;
import org.compiere.model.MDocHeader;
import org.compiere.model.MDocType;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_C_BPartner_Certificate;
import org.compiere.model.persistence.X_C_DocumentTax;
import org.compiere.util.Env;
import org.compiere.util.SecureEngine;
import org.xendra.api.IEFact;
import org.xendra.api.IEFactDocument;
import org.xendra.efact.EFactConstants;

public class EFact implements IEFact {
	public static EFact m_fact = null;
	private MBPartner m_bp;
	private MBPartnerCertificate m_bp_cert;
	private KeyStore m_ks;
	private PrivateKey privateKey;
	private X509Certificate cert;
	private Boolean isready = false;
	private MDocHeader header;

	public EFact()  {

	}
	public EFact(Integer C_BPartner_ID) {
		m_bp = new Query(Env.getCtx(), MBPartner.Table_Name, "C_BPartner_ID = ?", null)
				.setParameters(C_BPartner_ID).first();
		if (m_bp != null) {
			m_bp_cert = new Query(Env.getCtx(), X_C_BPartner_Certificate.Table_Name, "C_BPartner_ID = ?", null)
					.setParameters(C_BPartner_ID).first();
			if (m_bp_cert != null) {				
				Boolean sendxml = m_bp_cert.getBoolean(EFactConstants.SENDXML);
				if (sendxml) {
					String keystoreFile = m_bp_cert.get(EFactConstants.FILENAME);
					File f = new File(keystoreFile);
					if (f.exists()) {					
						try {
							String pwd = m_bp_cert.get(EFactConstants.PASSWORD);			
							String pwdsecure = SecureEngine.decrypt(pwd);
							String alias = m_bp_cert.get(EFactConstants.ALIASKEY);

							m_ks = KeyStore.getInstance("JKS");
							FileInputStream fis = new FileInputStream(keystoreFile);
							m_ks.load(fis, pwdsecure.toCharArray());
							// obtener la clave privada para firmar
							privateKey = (PrivateKey) m_ks.getKey(alias, pwdsecure.toCharArray());
							if (privateKey == null) {
								throw new RuntimeException("private key is null");
							}				
							// obligatorio
							org.apache.xml.security.Init.init();
							// creacion del certificado
							cert = (X509Certificate) m_ks.getCertificate(alias);
							//log.info("generarXMLZipiadoFactura - RUC " + m_bp.getTaxID());
							System.out.println("generarXMLZipiadoFactura - RUC " + m_bp.getTaxID());					
							isready = true;
						} catch (Exception e) {
							throw new IllegalArgumentException (e.getMessage());
						}
					} else {
						throw new IllegalArgumentException ("No Context");
					}
				} else {
					throw new IllegalArgumentException ("No Context");
				}
			} else {
				throw new IllegalArgumentException ("No Context");
			}
		} else {
			throw new IllegalArgumentException ("No Context");
		}

	}
	@Override
	public X509Certificate getCert() {
		return cert;
	}
	public IEFact getInstance(Integer C_BPartner_ID) {
		if (m_fact == null) {
			m_fact = new EFact(C_BPartner_ID);			
		}
		return m_fact;
	}
	public Boolean IsReady() {
		return isready;
	}
	@Override
	public MBPartner getPartner() {
		return m_bp;
	}
	@Override
	public PrivateKey getPrivateKey() {
		return privateKey;
	}
	@Override
	public MBPartnerCertificate getPartnerCertificate() {
		return m_bp_cert;
	}
	@Override
	public IEFactDocument boleta() {		
		Boleta boleta = new Boleta(getCert(), getPartner(), getPartnerCertificate(), getPrivateKey(), header);
		boleta.Process();		
		return boleta;
	}
	
	@Override
	public IEFactDocument invoice() {
		return null;
	}
	@Override
	public IEFactDocument send(Integer S_DocHeader_ID) {
		String result = "";
		header = new Query(Env.getCtx(), MDocHeader.Table_Name, "S_DocHeader_ID = ?", null)
				.setParameters(S_DocHeader_ID).first();
		MDocType dt = new Query(Env.getCtx(), MDocType.Table_Name, "C_DocType_ID = ?", null)
				.setParameters(header.getC_DocType_ID()).first();
		X_C_DocumentTax taxdoc = new Query(Env.getCtx(), X_C_DocumentTax.Table_Name, "C_DocumentTax_ID = ?", null)
				.setParameters(dt.getC_DocumentTax_ID()).first();
		if (taxdoc.getTaxID().equals("01")) {
			IEFactDocument invoice  = invoice();
			return invoice;
		} else if (taxdoc.getTaxID().equals("03")) {
			IEFactDocument boleta = boleta();
			return boleta;
		}			
		return null;
	}
}
