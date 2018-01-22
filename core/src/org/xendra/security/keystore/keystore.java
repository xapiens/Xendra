package org.xendra.security.keystore;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import java.util.Properties;
import org.compiere.Xendra;
import org.compiere.util.Ini;
import org.xendra.security.api.XendraKeyStore;
import sun.security.x509.*;
import java.security.Principal;
import java.security.PrivateKey;

import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;

public class keystore {

	public class KeyStoreLoadException {

	}
	public keystore(XendraKeyStore panel)
	{
		super ();
		p_panel = panel;		
	}
	private XendraKeyStore p_panel;
	protected Properties		p_properties = new Properties();
	/** Default Keysore Password		*/
	//public static final String	KEYSTORE_PASSWORD		= "myPassword";	
	private boolean envLoaded = false;
	//private String m_alias;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		keystore ks = new keystore(null);
		//ks.build();
	}

	public boolean load(HashMap props) {
		//m_alias = alias;
		if (props != null)
			p_properties.putAll(props);
		return true;
	}

	public void setPassword(String password) {
		//updateProperty(KEYSTORE_PASSWORD, password);
		updateProperty(XendraKeyStore.XENDRA_KEYSTOREPASS, password);
	} 
	public String getPassword() {
		//return (String) p_properties.getProperty(KEYSTORE_PASSWORD);
		return (String) p_properties.getProperty(XendraKeyStore.XENDRA_KEYSTOREPASS);
	}	
	public void setKeyStore (String keystore) {
		updateProperty(XendraKeyStore.XENDRA_KEYSTORE, keystore);
	}	//	setKeyStore	
	public String getKeyStore() {
		return (String) p_properties.getProperty(XendraKeyStore.XENDRA_KEYSTORE);
	}
	private void updateProperty(String property, String value) {
		if (value == null) value = "";
		String currentValue = (String)p_properties.get(property);
		if (currentValue == null)
			p_properties.put(property, value);
		else if (!currentValue.equals(value))
			p_properties.put(property, value);
	}

	public boolean test()
	{
		String error = testCertificate();
		if (error != null)
		{
			return false;
		}		
		return true;
	}	//	test

	private String testCertificate() {
		String m_alias = p_properties.getProperty(XendraKeyStore.XENDRA_ALIAS);
		boolean pass = m_alias != null && m_alias.length() > 0;
		String error = "alias not specified";
		if (!pass)
			return error;
		String type = p_properties.getProperty(XendraKeyStore.XENDRA_KEYSTORE_TYPE);
		pass = type != null && type.length() > 0;
		error = "Not found: KeyStore Type";
		if (!pass)
			return error;
		pass = new File(getKeyDir()).exists();
		error = "Not found: XendraHome = " + getKeyDir();
		//	KeyStore
		//String fileName = KeyStoreMgt.getKeystoreFileName(new File(getKeyDir()).getAbsolutePath());
		String fileName = getKeyStore();
		p_properties.setProperty(XendraKeyStore.XENDRA_KEYSTORE, fileName);
		String pw = p_properties.getProperty(XendraKeyStore.XENDRA_KEYSTOREPASS);		
		pass = pw != null && pw.length() > 0;
		error = "Invalid Key Store Password = " + pw;
		p_panel.signalKeyStore(pass, m_alias, error);
		if (!pass)
			return error;
		p_properties.setProperty(XendraKeyStore.XENDRA_KEYSTOREPASS, pw);
		KeyStoreMgt ks = new KeyStoreMgt(type, fileName, pw.toCharArray());
		ks.setCommonName((String)p_properties.getProperty(XendraKeyStore.XENDRA_CERT_CN));
		ks.setOrganization((String)p_properties.getProperty(XendraKeyStore.XENDRA_CERT_ORG));
		ks.setOrganizationUnit((String)p_properties.getProperty(XendraKeyStore.XENDRA_CERT_ORG_UNIT));
		ks.setLocation((String)p_properties.getProperty(XendraKeyStore.XENDRA_CERT_LOCATION));
		ks.setState((String)p_properties.getProperty(XendraKeyStore.XENDRA_CERT_STATE));
		ks.setCountry((String)p_properties.getProperty(XendraKeyStore.XENDRA_CERT_COUNTRY));
		error = ks.verify(m_alias);
		pass = error == null;
		p_panel.signalKeyStore(pass, m_alias, error);
		if (!pass)
			return error;
		return null;
	}

	public Properties getProperties() {
		//	Add
		p_properties.setProperty("XENDRA_MAIN_VERSION", Xendra.MAIN_VERSION);
		p_properties.setProperty("XENDRA_DATE_VERSION", Xendra.DATE_VERSION);
		p_properties.setProperty("XENDRA_DB_VERSION", Xendra.DB_VERSION);
		return p_properties;
	}	//	save

	public String getKeyDir() {
		return (String) p_properties.get(XendraKeyStore.XENDRA_KEYDIR);
	}

	public String getKeyStoreType() {
		return (String) p_properties.get(XendraKeyStore.XENDRA_KEYSTORE_TYPE);
	}

	/**
	 * 	Set Xendra Home
	 *	@param adempiereHome
	 */
	//public void setXendraHome (String xendraHome)
	public void setKeyDir(String xendraHome)
	{
		updateProperty(XendraKeyStore.XENDRA_KEYDIR, xendraHome);
	}	//	setXendraHome

	public void setKeyType(String keytype) {
		updateProperty(XendraKeyStore.XENDRA_KEYSTORE_TYPE, keytype);		
	}	

	public String test2() throws Exception
	{
		String type = (String) p_properties.get(XendraKeyStore.XENDRA_KEYSTORE_TYPE);
		//String fileName = KeyStoreMgt.getKeystoreFileName(new File(getKeyDir()).getAbsolutePath());
		//String fileName = (String) p_properties.get(XendraKeyStore.XENDRA_KEYSTORE);
		String fileName = getKeyStore();
		String pwd = (String) p_properties.get(XendraKeyStore.XENDRA_KEYSTOREPASS);
		KeyStoreMgt ks = new KeyStoreMgt(type, fileName, pwd.toCharArray());		
		String alias = p_properties.getProperty(XendraKeyStore.XENDRA_ALIAS);
		ks.verify(alias);
		Certificate cert = ks.getCertificate("xendra");		
		String fileout = new File(getKeyDir()).getAbsolutePath() + File.separator + "cert.out";
		File file = new File(fileout);
		byte[] buf = cert.getEncoded();
		FileOutputStream os = new FileOutputStream(file);
		Writer wr = new OutputStreamWriter(os, Charset.forName("UTF-8"));
		wr.write(new sun.misc.BASE64Encoder().encode(buf));
		wr.flush();
		return fileName;
	}
	public String export() throws Exception {
		String type = (String) p_properties.get(XendraKeyStore.XENDRA_KEYSTORE_TYPE);
		//String fileName = KeyStoreMgt.getKeystoreFileName(new File(getKeyDir()).getAbsolutePath());
		//String fileName = (String) p_properties.get(XendraKeyStore.XENDRA_KEYSTORE);
		String fileName = getKeyStore();
		String pwd = (String) p_properties.get(XendraKeyStore.XENDRA_KEYSTOREPASS);		
		KeyStoreMgt ks = new KeyStoreMgt(type, fileName, pwd.toCharArray());
		String m_alias = p_properties.getProperty(XendraKeyStore.XENDRA_ALIAS);
		ks.verify(m_alias);
		Certificate cert = ks.getCertificate(m_alias);				
		byte[] buf = cert.getEncoded();		
		String str = new sun.misc.BASE64Encoder().encode(buf);
		return str;
	}

	public void export(File file) throws Exception {
		String type = (String) p_properties.get(XendraKeyStore.XENDRA_KEYSTORE_TYPE);
		//String fileName = KeyStoreMgt.getKeystoreFileName(new File(getKeyDir()).getAbsolutePath());
		//String fileName = (String) p_properties.get(XendraKeyStore.XENDRA_KEYSTORE);
		String fileName = getKeyStore();
		String pwd = (String) p_properties.get(XendraKeyStore.XENDRA_KEYSTOREPASS);
		String m_alias = p_properties.getProperty(XendraKeyStore.XENDRA_ALIAS);
		KeyStoreMgt ks = new KeyStoreMgt(type, fileName, pwd.toCharArray());
		ks.verify(m_alias);
		Certificate cert = ks.getCertificate(m_alias);				
		File fileout = new File(file.getAbsoluteFile() + File.separator + String.format("%s.cert", m_alias));
		byte[] buf = cert.getEncoded();		
		FileOutputStream os = new FileOutputStream(fileout);
		Writer wr = new OutputStreamWriter(os, Charset.forName("UTF-8"));
		wr.write(new sun.misc.BASE64Encoder().encode(buf));
		wr.flush();		
		wr.close();
	}

	public String test3() throws Exception
	{
		String type = (String) p_properties.get(XendraKeyStore.XENDRA_KEYSTORE_TYPE);
		String pwd = (String) p_properties.get(XendraKeyStore.XENDRA_KEYSTOREPASS);
		String m_alias = p_properties.getProperty(XendraKeyStore.XENDRA_ALIAS);
		//String fileName = (String) p_properties.getProperty(XendraKeyStore.XENDRA_KEYSTORE);
		String fileName = getKeyStore();
		//KeyStoreMgt x = new KeyStoreMgt(type, (String) p_properties.getProperty(XendraKeyStore.XENDRA_KEYSTORE), pwd.toCharArray());
		KeyStoreMgt x = new KeyStoreMgt(type, fileName, pwd.toCharArray());		
		KeyStore xx = x.getKeyStore();		
		PrivateKey key = (PrivateKey) xx.getKey(m_alias, pwd.toCharArray());
		//X509Certificate rootCertificate = (X509Certificate) xx.getCertificate(XendraKeyStore.CERTIFICATE_ALIAS);
		X509Certificate rootCertificate = (X509Certificate) xx.getCertificate(m_alias);
		//KeyStoreMgt.getKeyStore();
		CertAndKeyGen gen = new CertAndKeyGen("RSA","SHA1WithRSA");
		gen.generate(1024);


		//Key key=gen.getPrivateKey();

		String dname = x.getDname(x);
		//x.createCertificate("XX");

		X509Certificate client=gen.getSelfCertificate(new X500Name(dname), (long)365*24*3600);	    
		client = createSignedCertificate(client,rootCertificate, key);


		//	    X509Certificate[] chain = new X509Certificate[1];
		//	    chain[0]=cert; 
		//	
		//		String fileName = KeyStoreMgt.getKeystoreFileName(new File(getKeyDir()).getAbsolutePath());		
		//		String pwd = (String) p_properties.get(XendraKeyStore.XENDRA_KEYSTOREPASS);
		//		KeyStoreMgt ks = new KeyStoreMgt(fileName, pwd.toCharArray());
		//		ks.verify();
		//	    key.
		return client.toString();
	}

	private static X509Certificate createSignedCertificate(X509Certificate cetrificate,X509Certificate issuerCertificate,PrivateKey issuerPrivateKey){
		try{
			Principal issuer = issuerCertificate.getSubjectDN();
			String issuerSigAlg = issuerCertificate.getSigAlgName();

			byte[] inCertBytes = cetrificate.getTBSCertificate();
			X509CertInfo info = new X509CertInfo(inCertBytes);
			info.set(X509CertInfo.ISSUER, new CertificateIssuerName((X500Name) issuer));

			//No need to add the BasicContraint for leaf cert
			if(!cetrificate.getSubjectDN().getName().equals("CN=TOP")){
				CertificateExtensions exts=new CertificateExtensions();
				BasicConstraintsExtension bce = new BasicConstraintsExtension(true, -1);
				exts.set(BasicConstraintsExtension.NAME,new BasicConstraintsExtension(false, bce.getExtensionValue()));
				info.set(X509CertInfo.EXTENSIONS, exts);
			}

			X509CertImpl outCert = new X509CertImpl(info);
			outCert.sign(issuerPrivateKey, issuerSigAlg);

			return outCert;
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return null;
	}

	public KeyManager[] buildKeyManagers() throws IOException {
		KeyManager[] keyManagers;
		try {
			String type = getKeyStoreType();			
			String pwd = getPassword();
			String fileName = this.getKeyStore();					
			KeyStoreMgt x = new KeyStoreMgt(type, fileName, pwd.toCharArray());
			KeyStore xx = x.getKeyStore();		

			KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance(KeyManagerFactory
					.getDefaultAlgorithm());			
			//keyManagerFactory.init(keyStore, storePassword);
			keyManagerFactory.init(xx, pwd.toCharArray());
			keyManagers = keyManagerFactory.getKeyManagers();
		}
		catch (Exception exc) {
			throw new IOException("Unable to initialize KeyManager[]", exc);
		}
		return keyManagers;
	}

	public TrustManager[] buildTrustManagers(Object object) throws IOException {
		TrustManager[] trustManagers = null;
		try {
			//if (trustStore == null) {
			String type = getKeyStoreType();			
			String pwd = getPassword();
			String fileName = getKeyStore();
			KeyStoreMgt x = new KeyStoreMgt(type, fileName, pwd.toCharArray());
			KeyStore xx = x.getKeyStore();		

			TrustManagerFactory trustManagerFactory = TrustManagerFactory
					.getInstance(KeyManagerFactory.getDefaultAlgorithm());
			trustManagerFactory.init(xx);
			trustManagers = 	trustManagerFactory.getTrustManagers();
		}
		catch (Exception exc) {
			throw new IOException("Unable to initialize TrustManager[]", exc);
		}
		//}
		//else {
		//	trustManagers = TRUST_ALL_CERTS;
		//}
		return trustManagers;
	}
	public void setAlias(String alias) {			
		updateProperty(XendraKeyStore.XENDRA_ALIAS, alias);
	}
	public String getAlias() {
		return (String) p_properties.getProperty(XendraKeyStore.XENDRA_ALIAS);			
	}
}