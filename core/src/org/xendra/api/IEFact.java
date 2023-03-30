package org.xendra.api;

import java.security.PrivateKey;
import java.security.cert.X509Certificate;

import org.compiere.model.MBPartner;
import org.compiere.model.MBPartnerCertificate;

public interface IEFact {

	public X509Certificate getCert();
	public Boolean IsReady();
	public MBPartner getPartner();
	public PrivateKey getPrivateKey();
	public MBPartnerCertificate getPartnerCertificate();
	public IEFact getInstance(Integer c_BPartner_ID);
	public IEFactDocument boleta();
	public IEFactDocument invoice();
	public IEFactDocument send(Integer S_DocHeader_ID);
}
