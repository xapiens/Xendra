package org.xendra.security;

//import android.util.Base64;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

import okio.Buffer;

import org.apache.commons.codec.binary.Base64;


import java.io.*;
import java.security.KeyStore;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * A factory for SSLContexts.
 * Builds an SSLContext with custom KeyStore and TrustStore, to work with a client cert signed by a self-signed CA cert.
 */
public class SSLContextFactory {

	private static SSLContextFactory theInstance = null;
	private String m_error = "";

	private SSLContextFactory() {
	}

	public static SSLContextFactory getInstance() {
		if(theInstance == null) {
			theInstance = new SSLContextFactory();
		}
		return theInstance;
	}

	public SSLContext makeContextWithoutCheckIssuers(File fileToStore,char[] keystorePasswordCharArray) {
		try {
			KeyStore ks = KeyStore.getInstance("JKS");
			InputStream readStream = new FileInputStream(fileToStore);			
			ks.load(readStream, keystorePasswordCharArray);
			KeyManagerFactory kmf = KeyManagerFactory.getInstance("SunX509","SunJSSE");
			kmf.init(ks, keystorePasswordCharArray);
			KeyManager[] keyManagers = kmf.getKeyManagers();
			TrustManagerFactory tmf = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
			tmf.init(ks);
			TrustManager[] trustManagers = tmf.getTrustManagers();			

			X509TrustManager trustManager =   (X509TrustManager) trustManagers[0];
			X509Certificate[] acceptedIssuers =    trustManager.getAcceptedIssuers();
			//if (acceptedIssuers.length == 0) {
			//	m_error = "nocertificates";
			//	return null;
			//}
			SSLContext sslContext = SSLContext.getInstance("TLSv1.2");
			sslContext.init(keyManagers, trustManagers, null);
			return sslContext;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;	        
	}
	
	public SSLContext makeContext(File fileToStore,char[] keystorePasswordCharArray) {
		try {
			KeyStore ks = KeyStore.getInstance("JKS");
			InputStream readStream = new FileInputStream(fileToStore);			
			ks.load(readStream, keystorePasswordCharArray);
			KeyManagerFactory kmf = KeyManagerFactory.getInstance("SunX509","SunJSSE");
			kmf.init(ks, keystorePasswordCharArray);
			KeyManager[] keyManagers = kmf.getKeyManagers();
			//TrustManagerFactory tmf = TrustManagerFactory.getInstance("PKIX");
//			List<TrustManager> trustMgrs = new ArrayList<TrustManager>();
//			TrustManagerFactory tmf = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
//			tmf.init((KeyStore) null);			
//			int trustmgrsize = 0;
//			for (int i = 0; i < tmf.getTrustManagers().length; i++) {
//				trustMgrs.add(tmf.getTrustManagers()[i]);
//				X509TrustManager tm = (X509TrustManager) tmf.getTrustManagers()[i];
//				//tm.getAcceptedIssuers().length;
//				trustmgrsize++;
//			}			
			//TrustManager[] coretrustManagers = tmf.getTrustManagers();
			TrustManagerFactory tmf = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
			tmf.init(ks);
			//for (int i = 0; i < tmf.getTrustManagers().length; i++) {
				//trustMgrs.add(tmf.getTrustManagers()[i]);
			//	X509TrustManager tm = (X509TrustManager) tmf.getTrustManagers()[i];
				//trustmgrsize++;
			//}						
			
			//TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
			//trustManagerFactory.init(ks);
			TrustManager[] trustManagers = tmf.getTrustManagers();			

			X509TrustManager trustManager =   (X509TrustManager) trustManagers[0];
			X509Certificate[] acceptedIssuers =    trustManager.getAcceptedIssuers();
			if (acceptedIssuers.length == 0) {
				m_error = "nocertificates";
				return null;
			}
			//TrustManager[] keystoretrustManagers = tmf.getTrustManagers();
			//
			//for (int i = 0; i < coretrustManagers.length; i++) {
			//	trustMgrs.add(coretrustManagers[i]);
			//}
			//for (int i = 0; i < keystoretrustManagers.length; i++) {
			//	trustMgrs.add(keystoretrustManagers[i]);
			//}			
			//TrustManager[] trustManagers = new TrustManager[trustmgrsize];			
			//trustMgrs.toArray(trustManagers); 			
			//X509TrustManager trustManager =   (X509TrustManager) trustManagers[0];
			//X509Certificate[] acceptedIssuers =    trustManager.getAcceptedIssuers();
			SSLContext sslContext = SSLContext.getInstance("TLSv1.2");
			sslContext.init(keyManagers, trustManagers, null);
			return sslContext;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;	        
	}

	public String getError() {
		// TODO Auto-generated method stub
		return m_error;
	}
	
	//	public SSLContext makeContextServer(File fileToStore,char[] keystorePasswordCharArray) {
	//		try {
	//
	//			KeyStore ks = KeyStore.getInstance("JKS");
	//			InputStream readStream = new FileInputStream(fileToStore);			
	//			ks.load(readStream, keystorePasswordCharArray);
	//			KeyManagerFactory kmf = KeyManagerFactory.getInstance("SunX509","SunJSSE");
	//			kmf.init(ks, keystorePasswordCharArray);
	//			KeyManager[] keyManagers = kmf.getKeyManagers();
	//
	//			TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
	//			trustManagerFactory.init(ks);
	//			TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();			
	//			//TrustManager[] trustManagers = {trustManager};
	//	        //SSLContext sslContext = SSLContext.getInstance("TLS");
	//			SSLContext sslContext = SSLContext.getInstance("TLSv1.2");
	//	        sslContext.init(keyManagers, trustManagers, null);
	//	        return sslContext;			
	//		} catch (Exception e) {
	//			e.printStackTrace();
	//		}
	//		return null;
	//	}

	public static InputStream trustedCertificatesInputStreamTest(String certificate) {
		return new Buffer().writeUtf8(certificate).inputStream();
	}

	/**
	 * Creates an SSLContext with the client and server certificates
	 * @param clientCertFile A File containing the client certificate
	 * @param clientCertPassword Password for the client certificate
	 * @param caCertString A String containing the server certificate
	 * @param trustManager 
	 * @return An initialized SSLContext
	 * @throws Exception
	 */
	public SSLContext makeContext(File clientCertFile, char[] clientCertPassword, String caCertString, X509TrustManager trustManager) throws Exception {
		//public SSLContext makeContext(File clientCertFile, String clientCertPassword, String caCertString) throws Exception {
		final KeyStore keyStore = loadPKCS12KeyStore(clientCertFile, clientCertPassword);
		KeyManagerFactory kmf = KeyManagerFactory.getInstance("SunX509","SunJSSE");
		//KeyManagerFactory kmf = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
		kmf.init(keyStore, clientCertPassword);
		KeyManager[] keyManagers = kmf.getKeyManagers();

		final KeyStore trustStore = loadPEMTrustStore(caCertString);
		//TrustManager[] trustManagers = {new CustomTrustManager(trustStore)};
		TrustManager[] trustManagers = {trustManager};
		SSLContext sslContext = SSLContext.getInstance("TLS");                
		//sslContext.init(keyManagers, trustManagers, null);
		sslContext.init(keyManagers, trustManagers, null);

		return sslContext;
	}

	/**
	 * Produces a KeyStore from a String containing a PEM certificate (typically, the server's CA certificate)
	 * @param certificateString A String containing the PEM-encoded certificate
	 * @return a KeyStore (to be used as a trust store) that contains the certificate
	 * @throws Exception
	 */
	private KeyStore loadPEMTrustStoreold(String certificateString) throws Exception {

		byte[] der = loadPemCertificate(new ByteArrayInputStream(certificateString.getBytes()));
		ByteArrayInputStream derInputStream = new ByteArrayInputStream(der);
		CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
		X509Certificate cert = (X509Certificate) certificateFactory.generateCertificate(derInputStream);
		String alias = cert.getSubjectX500Principal().getName();

		KeyStore trustStore = KeyStore.getInstance(KeyStore.getDefaultType());
		trustStore.load(null);
		trustStore.setCertificateEntry(alias, cert);

		return trustStore;
	}

	private KeyStore loadPEMTrustStore(String certificateString) throws Exception {

		byte[] b = certificateString.getBytes();
		//byte[] der = loadPemCertificate(new ByteArrayInputStream(certificateString.getBytes()));
		ByteArrayInputStream derInputStream = new ByteArrayInputStream(b);
		CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");        
		//X509Certificate cert = (X509Certificate) certificateFactory.generateCertificate(derInputStream);
		Collection<X509Certificate> certCollection = new ArrayList<X509Certificate>();
		Collection c = certificateFactory.generateCertificates(derInputStream);
		certCollection.addAll(c);

		KeyStore trustStore = KeyStore.getInstance(KeyStore.getDefaultType());
		trustStore.load(null);

		for (X509Certificate cert:certCollection) {
			String alias = cert.getSubjectX500Principal().getName();
			trustStore.setCertificateEntry(alias, cert);
		}
		//String alias = cert.getSubjectX500Principal().getName();
		//trustStore.setCertificateEntry(alias, cert);        
		return trustStore;
	}

	/**
	 * Produces a KeyStore from a PKCS12 (.p12) certificate file, typically the client certificate
	 * @param certificateFile A file containing the client certificate
	 * @param clientCertPassword Password for the certificate
	 * @return A KeyStore containing the certificate from the certificateFile
	 * @throws Exception
	 */
	private KeyStore loadPKCS12KeyStore(File certificateFile, char[] clientCertPassword) throws Exception {
		KeyStore keyStore = null;
		FileInputStream fis = null;
		try {
			keyStore = KeyStore.getInstance("PKCS12");
			fis = new FileInputStream(certificateFile);
			keyStore.load(fis, clientCertPassword);
		} finally {
			try {
				if(fis != null) {
					fis.close();
				}
			} catch(IOException ex) {
				// ignore
			}
		}
		return keyStore;
	}

	/**
	 * Reads and decodes a base-64 encoded DER certificate (a .pem certificate), typically the server's CA cert.
	 * @param certificateStream an InputStream from which to read the cert
	 * @return a byte[] containing the decoded certificate
	 * @throws IOException
	 */
	byte[] loadPemCertificate(InputStream certificateStream) throws IOException {

		byte[] der = null;
		BufferedReader br = null;

		try {
			StringBuilder buf = new StringBuilder();
			br = new BufferedReader(new InputStreamReader(certificateStream));

			String line = br.readLine();
			while(line != null) {
				if(!line.startsWith("--")){
					buf.append(line);
				}
				line = br.readLine();
			}

			String pem = buf.toString();
			der = Base64.decodeBase64(pem);
			//der = Base64.decode(pem, Base64.DEFAULT);

		} finally {
			if(br != null) {
				br.close();
			}
		}

		return der;
	}
}