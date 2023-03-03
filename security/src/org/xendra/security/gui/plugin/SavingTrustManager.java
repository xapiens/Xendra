package org.xendra.security.gui.plugin;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

import javax.net.ssl.X509TrustManager;

public class SavingTrustManager implements X509TrustManager {

	public final X509TrustManager tm;
	public X509Certificate[] chain;

	public SavingTrustManager(X509TrustManager tm) {
		this.tm = tm;
	}

	public X509Certificate[] getAcceptedIssuers() {

		/** 
		 * This change has been done due to the following resolution advised for Java 1.7+
	http://infposs.blogspot.kr/2013/06/installcert-and-java-7.html
		 **/ 

		return new X509Certificate[0];	
		//throw new UnsupportedOperationException();
	}

	public void checkClientTrusted(X509Certificate[] chain, String authType)
			throws CertificateException {
		throw new UnsupportedOperationException();
	}

	public void checkServerTrusted(X509Certificate[] chain, String authType)
			throws CertificateException {
		this.chain = chain;
		tm.checkServerTrusted(chain, authType);
	}
}
