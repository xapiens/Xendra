package org.xendra.efact.gui.propertysheet;

import org.xendra.efact.EFactConstants;
import org.xendra.efact.gui.propertysheet.PropertySheetPage.AmbientEditor;
import org.xendra.efact.gui.propertysheet.PropertySheetPage.OSEEditor;
import org.xendra.efact.gui.propertysheet.PropertySheetPage.PasswordPropertyEditor;

import com.l2fprod.common.beans.BaseBeanInfo;

public class PartnerBeanBeanInfo extends BaseBeanInfo {

	public PartnerBeanBeanInfo() {
		super(PartnerBean.class);		
		addProperty(EFactConstants.ALIASKEY).setCategory("Certificate");
		addProperty(EFactConstants.PASSWORD).setCategory("Certificate").setPropertyEditorClass(PasswordPropertyEditor.class);;		
		addProperty(EFactConstants.FILENAME).setCategory("Certificate");
		addProperty(EFactConstants.PRIVATEPASS).setCategory("Certificate");
		addProperty(EFactConstants.KEYSTORETYPE).setCategory("Certificate");		
		addProperty(EFactConstants.PRIVATEALIAS).setCategory("Certificate");
		addProperty(EFactConstants.CACERTSFILE).setCategory("Certificate");
		addProperty(EFactConstants.CACERTSPASSWORD).setCategory("Certificate");
		addProperty(EFactConstants.SENDFILESPATH).setCategory("Files");
		addProperty(EFactConstants.RECEIVEFILESPATH).setCategory("Files");
		addProperty(EFactConstants.FTPSERVER).setCategory("FTP");
		addProperty(EFactConstants.FTPUSER).setCategory("FTP");
		addProperty(EFactConstants.FTPPASSWORD).setCategory("FTP");
		addProperty(EFactConstants.FTPPORT).setCategory("FTP");
		addProperty(EFactConstants.FTPBASE).setCategory("FTP");
		addProperty(EFactConstants.SENDEMAIL).setCategory("Mail");
		addProperty(EFactConstants.OSEUSER).setCategory("OSE");
		addProperty(EFactConstants.OSEPASSWORD).setCategory("OSE");
		addProperty(EFactConstants.OSE_TOKEN).setCategory("OSE");		
		addProperty(EFactConstants.PROVIDER).setCategory("OSE").setPropertyEditorClass(OSEEditor.class);;
		addProperty(EFactConstants.SENDFTP).setCategory("OSE");
		addProperty(EFactConstants.SENDPDF).setCategory("OSE");
		addProperty(EFactConstants.SENDOSE).setCategory("OSE");
		addProperty(EFactConstants.SENDXML).setCategory("OSE");
		addProperty(EFactConstants.AMBIENTE).setCategory("OSE").setPropertyEditorClass(AmbientEditor.class);		
		addProperty(EFactConstants.PDFREPORT).setCategory("PDF");
		addProperty(EFactConstants.PDFREPORTLOGO).setCategory("PDF");
		addProperty(EFactConstants.MAILHOST).setCategory("Mail");
		addProperty(EFactConstants.MAILPORT).setCategory("Mail");
		addProperty(EFactConstants.MAILSSL).setCategory("Mail");
		addProperty(EFactConstants.MAILAUTH).setCategory("Mail");
		addProperty(EFactConstants.MAILUSER).setCategory("Mail");
		addProperty(EFactConstants.MAILPASSWORD).setCategory("Mail");
		addProperty(EFactConstants.CHECKSTATUS).setCategory("Process");
	}

}
