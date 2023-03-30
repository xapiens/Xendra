package org.xendra.process;


import java.io.FileInputStream;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;
import java.util.Vector;
import java.util.logging.Level;


import org.compiere.model.MBPartner;
import org.compiere.model.MBPartnerCertificate;
import org.compiere.model.MDocType;
import org.compiere.model.Query;
import org.compiere.process.ProcessInfo;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;
import org.compiere.util.DisplayType;
import org.compiere.util.Env;
import org.compiere.util.Ini;
import org.compiere.util.Language;
import org.compiere.util.SecureEngine;
import org.xendra.annotations.XendraProcess;
import org.xendra.annotations.XendraProcessParameter;
import org.xendra.annotations.XendraScheduler;
import org.compiere.model.persistence.X_C_BPartner;
import org.compiere.model.persistence.X_C_BPartner_Certificate;
import org.compiere.model.persistence.X_C_DocumentTax;
import org.compiere.model.persistence.X_S_DocHeader;
import org.xendra.efact.EFactConstants;

@XendraProcess(value="FacturacionElectronica",
name="FacturacionElectronica",
description="FacturacionElectronica",
help="Facturacion Electronica",
Identifier="20d6f5f9-eb7a-1828-d74e-eaa68fb273cf",
classname="org.xendra.process.FacturacionElectronica",
updated="2022-05-13 10:05:12")
@XendraScheduler(frequencytype="M",frequency="2",keeplogdays="7",frequencystartat="", name="FacturacionElectronica",type="A", tag="")
public class FacturacionElectronica extends SvrProcess {

	@XendraProcessParameter(Name="Business Partner",	
			ColumnName=X_C_BPartner.COLUMNNAME_C_BPartner_ID,
			Description="Identifies a Business Partner",
			Help="A Business Partner is anyone with whom you transact.  This can include Vendor, Customer, Employee or Salesperson",
			AD_Reference_ID=DisplayType.Search,
			SeqNo=60,
			ReferenceValueID="",	
			ValRuleID="",
			FieldLength=10,
			IsMandatory=false,
			IsRange=false,
			DefaultValue="",
			DefaultValue2="",
			vFormat="",
			valueMin="",
			valueMax="",
			DisplayLogic="",
			ReadOnlyLogic="",
			Identifier="48237a65-474a-bbbd-7e9b-d76e144b1be4")			
	private int			p_C_BPartner_ID = 0;
	private MBPartner m_bp;
	private MBPartnerCertificate m_bp_cert;
	private KeyStore m_ks;
	private PrivateKey privateKey;
	private X509Certificate cert;

	@Override
	protected void prepare() {		
		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++)
		{
			String name = para[i].getParameterName();
			if (para[i].getParameter() == null)
				;
			else if (name.equals(X_C_BPartner.COLUMNNAME_C_BPartner_ID))
				p_C_BPartner_ID = para[i].getParameterAsInt();
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}
	}

	@Override
	protected String doIt() throws Exception {		
		m_bp = new Query(Env.getCtx(), MBPartner.Table_Name, "C_BPartner_ID = ?", null)
				.setParameters(p_C_BPartner_ID).first();
		m_bp_cert = new Query(Env.getCtx(), X_C_BPartner_Certificate.Table_Name, "C_BPartner_ID = ?", null)
				.setParameters(p_C_BPartner_ID).first();
		if (m_bp_cert.getBoolean(EFactConstants.SENDPDF)) {
			String report = m_bp_cert.get(EFactConstants.PDFREPORT);
			if (report == null) {
				throw new RuntimeException("send PDF is on but not report is defined");
			}
			String logo = m_bp_cert.get(EFactConstants.PDFREPORTLOGO);
			if (logo == null) {
				System.out.println("send PDF is on but not report logo is defined");
			}
		}		
		if (m_bp_cert.getBoolean(EFactConstants.SENDFTP)) {
			String ftpserver = m_bp_cert.get(EFactConstants.FTPSERVER);
			if (ftpserver == null)
				throw new RuntimeException("send FTP is on but not FTP Server is defined");
			String ftpuser = m_bp_cert.get(EFactConstants.FTPUSER);
			if (ftpuser == null)
				throw new RuntimeException("send FTP is on but not FTP user is defined");
			String ftppwd = m_bp_cert.get(EFactConstants.FTPPASSWORD);
			if (ftppwd == null)
				throw new RuntimeException("send FTP is on but not FTP password is defined");			
			String ftpbase = m_bp_cert.get(EFactConstants.FTPBASE);
			if (ftpbase == null)
				throw new RuntimeException("send FTP is on but not FTP base is defined");			
		}
		if (m_bp_cert.getBoolean(EFactConstants.SENDOSE)) {
			String soapuser = m_bp_cert.get(EFactConstants.OSEUSER);
			if (soapuser == null)
				throw new RuntimeException("send SUNAT is on but not SOAP User is defined");
			String soappwd = m_bp_cert.get(EFactConstants.OSEPASSWORD);
			if (soappwd == null)
				throw new RuntimeException("send SUNAT is on but not SOAP Password is defined");
			
		}
		String keystoreFile = m_bp_cert.get(EFactConstants.FILENAME);
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
		log.info("generarXMLZipiadoFactura - RUC " + m_bp.getTaxID());
		System.out.println("generarXMLZipiadoFactura - RUC " + m_bp.getTaxID());		
		List<X_S_DocHeader> headers = new Query(Env.getCtx(), X_S_DocHeader.Table_Name, "Processed = 'N' AND Processing = 'N'", null)
				.setLimit(1000).list();
		for (X_S_DocHeader header:headers) {
			MDocType dt = new Query(Env.getCtx(), MDocType.Table_Name, "C_DocType_ID = ?", null)
					.setParameters(header.getC_DocType_ID()).first();
			X_C_DocumentTax taxdoc = new Query(Env.getCtx(), X_C_DocumentTax.Table_Name, "C_DocumentTax_ID = ?", null)
					.setParameters(dt.getC_DocumentTax_ID()).first();
			if (taxdoc.getTaxID().equals("01")) {
				new Invoice(cert, m_bp,m_bp_cert, privateKey, header).Process();	
			} else if (taxdoc.getTaxID().equals("03")) {
				new Boleta(cert, m_bp, m_bp_cert, privateKey, header).Process();
			}			
			
		}
		return "";
	}


	//private String enviarASunat(X_S_DocHeader items, String zipFileName) throws Exception {

	public static void main(String[] args) throws Exception {
		if (!org.compiere.Xendra.startup(false))
		{					
			return;
		}
		Env.setContext(Env.getCtx(), "#Date", new Timestamp(System.currentTimeMillis()));
		Optional<String> langName = Optional.ofNullable(Ini.getProperty(Ini.P_LANGUAGE));
		Language language = Language.getLanguage(langName.isPresent()?langName.get():"");
		Env.setContext(Env.getCtx(), Env.LANGUAGE, language.getAD_Language());
		//
		FacturacionElectronica fe = new FacturacionElectronica();
		ProcessInfo pi = new ProcessInfo ("FacturacionElectronica", 0 /* Process ID */, /* Table_ID*/ 0, 0 /* record_ID */);
		pi.setAD_User_ID (Env.getAD_User_ID(Env.getCtx()));
		pi.setAD_Client_ID (Env.getAD_Client_ID(Env.getCtx()));			
		Vector<ProcessInfoParameter> tabParams = new Vector<ProcessInfoParameter>();
		//
		ProcessInfoParameter pip;
		pip = new ProcessInfoParameter(X_C_BPartner.COLUMNNAME_C_BPartner_ID, 2000000 , null, null, null);
		tabParams.add(pip);		

		//			
		pi.setParameter(tabParams.toArray(new ProcessInfoParameter[]{}));			
		fe.startProcess(Env.getCtx(), pi, null);							
	}
}

