package org.xendra.utils;

import java.security.cert.X509Certificate;

public class Cert {
	private X509Certificate m_cert;
	private String host;
	private String hash;
	public Cert(X509Certificate cert) {
		m_cert = cert;
	}
	public String getSubjectDN() {
		return m_cert.getSubjectDN().toString();
	}
	public X509Certificate getCert() {
		return m_cert;
	}
	public String toString()
	{
		StringBuffer sb = new StringBuffer ("Certificate ").append(getSubjectDN()).append("]");
		return sb.toString();
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public void setHashed(String var) {
		this.hash= var;		
	}
	public String getHashed() {
		return hash;
	}
}
