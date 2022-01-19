package org.xendra.security.gui.action;

import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import java.text.MessageFormat;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import org.apache.commons.io.IOUtils;
import org.bouncycastle.pkcs.PKCS10CertificationRequest;
import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.resourceloader.IconKeys;
import org.columba.core.resourceloader.ImageLoader;
import org.kse.crypto.CryptoException;
import org.kse.crypto.csr.pkcs10.Pkcs10Util;
import org.kse.crypto.csr.spkac.Spkac;
import org.kse.crypto.filetype.CryptoFileType;
import org.kse.crypto.filetype.CryptoFileUtil;
import org.kse.crypto.x509.X509CertUtil;
import org.kse.gui.CurrentDirectory;
import org.kse.gui.FileChooserFactory;
import org.kse.gui.dialogs.DViewCertificate;
import org.kse.gui.dialogs.DViewCrl;
import org.kse.gui.dialogs.DViewCsr;
import org.kse.gui.error.DError;
import org.kse.gui.error.DProblem;
import org.kse.gui.error.Problem;
import org.xendra.Constants;
import org.xendra.security.gui.frame.SecurityEditorFrameController;
import org.xendra.security.util.ResourceLoader;

public class ExamineFileAction extends SecurityColumbaAction   {
	public ExamineFileAction(IFrameMediator frameMediator) {
		super(frameMediator, ResourceLoader.getString("menu", "mainframe", "ExamineFile"));
		putValue(Constants.ID, "ExamineFile");
		putValue(SHORT_DESCRIPTION, ResourceLoader.getString("menu","mainframe","ExamineFile"));
		putValue(TOOLBAR_NAME, ResourceLoader.getString("menu", "mainframe","ExamineFile"));
		putValue(SMALL_ICON, ImageLoader.getSmallIcon(IconKeys.FOLDER_OPEN));
		putValue(LARGE_ICON, ImageLoader.getIcon(IconKeys.FOLDER_OPEN));		
		((SecurityEditorFrameController) frameMediator).register(this);
	}
	public void actionPerformed(ActionEvent arg0) {	
		File file = chooseFile();
		openFile(file);
	}
	public void openFile(File file) {

		if (file == null) {
			return;
		}

		OpenAction openAction = new OpenAction(getFrameMediator());
		FileInputStream is = null;
		try {

			// detect file type and use the right action class for opening the file
			is = new FileInputStream(file);
			CryptoFileType fileType = CryptoFileUtil.detectFileType(is);

			switch (fileType) {
			case JCEKS_KS:
			case JKS_KS:
			case PKCS12_KS:
			case BKS_KS:
			case BKS_V1_KS:
			case UBER_KS:
				openAction.openKeyStore(file);
				break;
			case CERT:
				openCert(file);
				break;
			case CRL:
				openCrl(file);
				break;
			case PKCS10_CSR:
			case SPKAC_CSR:
				openCsr(file, fileType);
				break;
			case UNKNOWN:
			default:
				JOptionPane.showMessageDialog(getFrameMediator().getContainer().getFrame(),
						MessageFormat.format(res.getString("ExamineFileAction.UnknownFileType.message"), file),
						res.getString("ExamineFileAction.ExamineFile.Title"), JOptionPane.WARNING_MESSAGE);
				break;
			}

		} catch (Exception ex) {
			DError.displayError(getFrameMediator().getContainer().getFrame(), ex);
		} finally {
			IOUtils.closeQuietly(is);
		}
	}

	private void openCert(File file) throws CryptoException {
		X509Certificate[] certs = openCertificate(file);

		if ((certs != null) && (certs.length > 0)) {
			DViewCertificate dViewCertificate = new DViewCertificate(getFrameMediator().getContainer().getFrame(), MessageFormat.format(
					res.getString("ExamineFileAction.CertDetailsFile.Title"), file.getName()),
					certs, getFrameMediator(), DViewCertificate.IMPORT);
			dViewCertificate.setLocationRelativeTo(getFrameMediator().getContainer().getFrame());
			dViewCertificate.setVisible(true);
		}
	}
	private void openCrl(File crlFile) {

		if (crlFile == null) {
			return;
		}

		X509CRL crl = null;
		try {
			crl = X509CertUtil.loadCRL(new FileInputStream(crlFile));
		} catch (FileNotFoundException ex) {
			JOptionPane.showMessageDialog(getFrameMediator().getContainer().getFrame(),
					MessageFormat.format(res.getString("ExamineFileAction.NoReadFile.message"), crlFile),
					res.getString("ExamineFileAction.OpenCrl.Title"), JOptionPane.WARNING_MESSAGE);
		} catch (Exception ex) {
			String problemStr = MessageFormat.format(res.getString("ExamineFileAction.NoOpenCrl.Problem"),
					crlFile.getName());

			String[] causes = new String[] { res.getString("ExamineFileAction.NotCrl.Cause"),
					res.getString("ExamineFileAction.CorruptedCrl.Cause") };

			Problem problem = new Problem(problemStr, causes, ex);

			DProblem dProblem = new DProblem(getFrameMediator().getContainer().getFrame(), res.getString("ExamineFileAction.ProblemOpeningCrl.Title"),
					problem);
			dProblem.setLocationRelativeTo(getFrameMediator().getContainer().getFrame());
			dProblem.setVisible(true);
		}

		if (crl != null) {
			DViewCrl dViewCrl = new DViewCrl(getFrameMediator().getContainer().getFrame(), MessageFormat.format(
					res.getString("ExamineFileAction.CrlDetailsFile.Title"), crlFile.getName()), crl);
			dViewCrl.setLocationRelativeTo(getFrameMediator().getContainer().getFrame());
			dViewCrl.setVisible(true);
		}
	}
	private void openCsr(File csrFile, CryptoFileType fileType) {
		if (csrFile == null) {
			return;
		}

		try {
			PKCS10CertificationRequest pkcs10Csr = null;
			Spkac spkacCsr = null;

			try {
				if (fileType == CryptoFileType.PKCS10_CSR) {
					pkcs10Csr = Pkcs10Util.loadCsr(new FileInputStream(csrFile));
				} else if (fileType == CryptoFileType.SPKAC_CSR) {
					spkacCsr = new Spkac(new FileInputStream(csrFile));
				}
			} catch (FileNotFoundException ex) {
				JOptionPane.showMessageDialog(getFrameMediator().getContainer().getFrame(),
						MessageFormat.format(res.getString("ExamineCsrAction.NotFile.message"), csrFile),
						res.getString("ExamineFileAction.ExamineCsr.Title"), JOptionPane.WARNING_MESSAGE);
				return;
			} catch (Exception ex) {
				String problemStr = MessageFormat.format(res.getString("ExamineFileAction.NoOpenCsr.Problem"),
						csrFile.getName());

				String[] causes = new String[] { res.getString("ExamineFileAction.NotCsr.Cause"),
						res.getString("ExamineFileAction.CorruptedCsr.Cause") };

				Problem problem = new Problem(problemStr, causes, ex);

				DProblem dProblem = new DProblem(getFrameMediator().getContainer().getFrame(), res.getString("ExamineFileAction.ProblemOpeningCsr.Title"),
						problem);
				dProblem.setLocationRelativeTo(getFrameMediator().getContainer().getFrame());
				dProblem.setVisible(true);

				return;
			}

			if (pkcs10Csr != null) {
				DViewCsr dViewCsr = new DViewCsr(getFrameMediator().getContainer().getFrame(), MessageFormat.format(
						res.getString("ExamineFileAction.CsrDetailsFile.Title"), csrFile.getName()), pkcs10Csr);
				dViewCsr.setLocationRelativeTo(getFrameMediator().getContainer().getFrame());
				dViewCsr.setVisible(true);
			} else {
				DViewCsr dViewCsr = new DViewCsr(getFrameMediator().getContainer().getFrame(), MessageFormat.format(
						res.getString("ExamineFileAction.CsrDetailsFile.Title"), csrFile.getName()), spkacCsr);
				dViewCsr.setLocationRelativeTo(getFrameMediator().getContainer().getFrame());
				dViewCsr.setVisible(true);
			}
		} catch (Exception ex) {
			DError.displayError(getFrameMediator().getContainer().getFrame(), ex);
		}
	}

	private File chooseFile() {
		JFileChooser chooser = FileChooserFactory.getCertFileChooser();
		chooser.setCurrentDirectory(CurrentDirectory.get());
		chooser.setDialogTitle(res.getString("ExamineFileAction.ExamineFile.Title"));
		chooser.setMultiSelectionEnabled(false);

		int rtnValue = chooser.showDialog(getFrameMediator().getContainer().getFrame(), res.getString("ExamineFileAction.ExamineFile.button"));
		if (rtnValue == JFileChooser.APPROVE_OPTION) {
			File openFile = chooser.getSelectedFile();
			CurrentDirectory.updateForFile(openFile);
			return openFile;
		}
		return null;
	}
}
