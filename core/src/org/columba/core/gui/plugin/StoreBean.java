package org.columba.core.gui.plugin;

public class StoreBean {
	String alias;
	String pkcs12;
	String certificate;
	String publicurl;
	String privateurl;
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public String getPkcs12() {
		return pkcs12;
	}
	public void setPkcs12(String pkcs12) {
		this.pkcs12 = pkcs12;
	}
	public String getCertificate() {
		return certificate;
	}
	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}
	public String getPublicurl() {
		return publicurl;
	}
	public void setPublicurl(String publicurl) {
		this.publicurl = publicurl;
	}
	public String getPrivateurl() {
		return privateurl;
	}
	public void setPrivateurl(String privateurl) {
		this.privateurl = privateurl;
	}
	
}
