package org.xendra.efact.model;

import java.util.Iterator;

import org.jdom.Element;

public class Csv {
	String token_type = "";
	String token_url="";	
	String send_type = "";
	String send_url = "";
	String cdr_type = "";
	String cdr_url = "";
	String signed_type = "";
	String signed_url = "";
	String pdf_type = "";
	String pdf_url = "";
	public Csv(Element item) {		
		Iterator itcsv = item.getChildren().listIterator();
		while (itcsv.hasNext()) {
			Element csvchild = (Element) itcsv.next();
			if (csvchild.getName().equals("token")) {
				String type = csvchild.getAttributeValue("type");						
				String url = csvchild.getAttributeValue("url");
				setToken_type(type);
				setToken_url(url);
			} else if (csvchild.getName().equals("send")) {
				String type = csvchild.getAttributeValue("type");
				String url = csvchild.getAttributeValue("url");
				this.setSend_type(type);
				this.setSend_url(url);
			} else if (csvchild.getName().equals("cdr")) {
				String type = csvchild.getAttributeValue("type");
				String url = csvchild.getAttributeValue("url");
				this.setCdr_type(type);
				this.setCdr_url(url);
			} else if (csvchild.getName().equals("signed")) {
				String type = csvchild.getAttributeValue("type");
				String url = csvchild.getAttributeValue("url");
				this.setSigned_type(type);
				this.setSigned_url(url);
			} else if (csvchild.getName().equals("pdf")) {
				String type = csvchild.getAttributeValue("type");
				String url = csvchild.getAttributeValue("url");
				this.setPdf_type(type);
				this.setPdf_url(url);
			}
		}			
	}
	public String getToken_type() {
		return token_type;
	}
	public void setToken_type(String token_type) {
		this.token_type = token_type;
	}
	public String getToken_url() {
		return token_url;
	}
	public void setToken_url(String token_url) {
		this.token_url = token_url;
	}
	public String getSend_type() {
		return send_type;
	}
	public void setSend_type(String send_type) {
		this.send_type = send_type;
	}
	public String getSend_url() {
		return send_url;
	}
	public void setSend_url(String send_url) {
		this.send_url = send_url;
	}
	public String getCdr_type() {
		return cdr_type;
	}
	public void setCdr_type(String cdr_type) {
		this.cdr_type = cdr_type;
	}
	public String getCdr_url() {
		return cdr_url;
	}
	public void setCdr_url(String cdr_url) {
		this.cdr_url = cdr_url;
	}
	public String getSigned_type() {
		return signed_type;
	}
	public void setSigned_type(String signed_type) {
		this.signed_type = signed_type;
	}
	public String getSigned_url() {
		return signed_url;
	}
	public void setSigned_url(String signed_url) {
		this.signed_url = signed_url;
	}
	public String getPdf_type() {
		return pdf_type;
	}
	public void setPdf_type(String pdf_type) {
		this.pdf_type = pdf_type;
	}
	public String getPdf_url() {
		return pdf_url;
	}
	public void setPdf_url(String pdf_url) {
		this.pdf_url = pdf_url;
	}	
}
