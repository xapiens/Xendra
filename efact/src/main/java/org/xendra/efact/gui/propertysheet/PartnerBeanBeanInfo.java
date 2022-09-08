package org.xendra.efact.gui.propertysheet;

import org.xendra.efact.EFactConstants;
import org.xendra.efact.gui.propertysheet.PropertySheetPage.AmbientEditor;
import com.l2fprod.common.beans.BaseBeanInfo;

public class PartnerBeanBeanInfo extends BaseBeanInfo {

	public PartnerBeanBeanInfo() {
		super(PartnerBean.class);
		addProperty(EFactConstants.ALIASKEY).setCategory("Certificate");
		addProperty(EFactConstants.PASSWORD).setCategory("Certificate");		
		addProperty(EFactConstants.FILENAME).setCategory("Certificate");
		addProperty(EFactConstants.PRIVATEPASS).setCategory("Certificate");
		addProperty(EFactConstants.KEYSTORETYPE).setCategory("Certificate");		
		addProperty(EFactConstants.PRIVATEALIAS).setCategory("Certificate");		
		addProperty(EFactConstants.SENDFILESPATH).setCategory("Files");
		addProperty(EFactConstants.RECEIVEFILESPATH).setCategory("Files");
		addProperty("FtpServer").setCategory("FTP");
		addProperty("FtpUser").setCategory("FTP");
		addProperty("FtpPassword").setCategory("FTP");
		addProperty(EFactConstants.FTPPORT).setCategory("FTP");
		addProperty("FtpBase").setCategory("FTP");
		addProperty("SendEmail").setCategory("Mail");
		addProperty("SendFTP").setCategory("SUNAT");
		addProperty("SendPDF").setCategory("SUNAT");
		addProperty("SendSUNAT").setCategory("SUNAT");
		addProperty("SendXML").setCategory("SUNAT");
		addProperty(EFactConstants.PDFREPORT).setCategory("PDF");
		addProperty(EFactConstants.PDFREPORTLOGO).setCategory("PDF");
		addProperty(EFactConstants.SOAPUSER).setCategory("SOAP");
		addProperty(EFactConstants.SOAPPASSWORD).setCategory("SOAP");
		addProperty("Ambiente").setCategory("SUNAT").setPropertyEditorClass(AmbientEditor.class);
		addProperty(EFactConstants.MAILHOST).setCategory("Mail");
		addProperty(EFactConstants.MAILPORT).setCategory("Mail");
		addProperty(EFactConstants.MAILSSL).setCategory("Mail");
		addProperty(EFactConstants.MAILAUTH).setCategory("Mail");
		addProperty(EFactConstants.MAILUSER).setCategory("Mail");
		addProperty(EFactConstants.MAILPASSWORD).setCategory("Mail");
	}

}
