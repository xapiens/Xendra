package org.xendra.security.wizard;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.HashMap;

import javax.net.ssl.KeyManagerFactory;

import org.compiere.model.Query;
import org.compiere.model.persistence.X_C_BPartner;
import org.compiere.model.persistence.X_C_BPartner_Certificate;
import org.compiere.model.persistence.X_C_Invoice;
import org.compiere.util.Env;
import org.compiere.util.SecureEngine;
import org.xendra.Constants;
import org.xendra.security.api.SecurityConstants;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.WizardModelEvent;
import net.javaprog.ui.wizard.WizardModelListener;

public class BPartnerCertificateCreator implements WizardModelListener {
	DataModel data;
	public BPartnerCertificateCreator(DataModel data) {
		this.data = data;
	}

	@Override
	public void stepShown(WizardModelEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void wizardCanceled(WizardModelEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void wizardFinished(WizardModelEvent e) {
		Integer C_BPartner_ID = (Integer) data.getData(X_C_Invoice.COLUMNNAME_C_BPartner_ID);
		char[] password = (char[]) data.getData("StorePassword");
		String pwd = String.valueOf(password);
		String pwdsecure = SecureEngine.encrypt(pwd);
		String file = (String) data.getData("KeyStorePath");
		String sendfilepath = (String) data.getData("SendFilePath");
		String aliaskey = (String) data.getData(SecurityConstants.ALIASKEY);
		try {		
			// primero chequear si tiene contenido, luego crear
			KeyStore ks = KeyStore.getInstance(KeyStore.getDefaultType());
			//char[] password = pwd.toCharArray();
			InputStream readStream = new FileInputStream(file);
			ks.load(null, password);
			KeyManagerFactory kmf = KeyManagerFactory.getInstance("SunX509","SunJSSE");
			kmf.init(ks, pwd.toCharArray());
			if (readStream != null) {
				readStream.close();
			} else {
				FileOutputStream fos = new FileOutputStream(file);
				ks.store(fos, password);
				fos.close();				
			}
			// Store away the keystore
		} catch (Exception e1) {		
			e1.printStackTrace();
		}
		X_C_BPartner bp = new Query(Env.getCtx(), X_C_BPartner.Table_Name, "C_BPartner_ID = ?", null)
				.setParameters(C_BPartner_ID).first();
		if (bp != null) {
			X_C_BPartner_Certificate bpc = new Query(Env.getCtx(), X_C_BPartner_Certificate.Table_Name, "C_BPartner_ID = ?", null)
						.setParameters(C_BPartner_ID).first();
			if (bpc == null) {
				bpc = new X_C_BPartner_Certificate(Env.getCtx(), 0, null);
				bpc.setC_BPartner_ID(bp.getC_BPartner_ID());
			}			
			HashMap p = bpc.getProperties();
			p.put(SecurityConstants.FILENAME, file);
			p.put(SecurityConstants.PASSWORD, pwdsecure);
			p.put(SecurityConstants.SENDFILESPATH, sendfilepath);
			p.put(SecurityConstants.ALIASKEY, aliaskey);
			bpc.setProperties(p);
			bpc.save();
		}
	}

	@Override
	public void wizardModelChanged(WizardModelEvent e) {
		// TODO Auto-generated method stub
	}

}
