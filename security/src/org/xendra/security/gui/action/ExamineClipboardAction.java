package org.xendra.security.gui.action;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.ActionEvent;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;

import javax.swing.JOptionPane;

import org.bouncycastle.pkcs.PKCS10CertificationRequest;
import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.resourceloader.ImageLoader;
import org.kse.crypto.CryptoException;
import org.kse.crypto.csr.pkcs10.Pkcs10Util;
import org.kse.crypto.csr.spkac.Spkac;
import org.kse.crypto.filetype.CryptoFileType;
import org.kse.crypto.filetype.CryptoFileUtil;
import org.kse.crypto.x509.X509CertUtil;
import org.kse.gui.dialogs.DViewCertificate;
import org.kse.gui.dialogs.DViewCrl;
import org.kse.gui.dialogs.DViewCsr;
import org.kse.gui.error.DError;
import org.kse.gui.error.DProblem;
import org.kse.gui.error.Problem;
import org.xendra.Constants;
import org.xendra.security.gui.frame.SecurityEditorFrameController;
import org.xendra.security.util.ResourceLoader;


public class ExamineClipboardAction extends SecurityColumbaAction {
	public ExamineClipboardAction(IFrameMediator frameMediator) {
		super(frameMediator, ResourceLoader.getString("menu", "mainframe", "ExamineClipboard"));
		putValue(Constants.ID, "ExamineClipboard");
		putValue(SHORT_DESCRIPTION, ResourceLoader.getString("menu","mainframe","ExamineClipboard"));
		putValue(TOOLBAR_NAME, ResourceLoader.getString("menu", "mainframe","ExamineClipboard"));
		putValue(SMALL_ICON, ImageLoader.getSmallIconFromResource("org.xendra.security", "addcertificate.png"));
		putValue(LARGE_ICON, ImageLoader.getLargeIconFromResource("org.xendra.security", "addcertificate.png"));		
		((SecurityEditorFrameController) frameMediator).register(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();

		// get clipboard contents, but only string types, not files
		Transferable t = clipboard.getContents(null);
		try {
			if (t.isDataFlavorSupported(DataFlavor.stringFlavor)) {
				String data;
				data = (String) t.getTransferData(DataFlavor.stringFlavor);
				show(data);
			}

			// TODO handle other flavor types

		} catch (UnsupportedFlavorException ex) {
			// ignore
		} catch (IOException ex1) {
			ex1.printStackTrace();
		}		
	}
	/**
	 * Show clipboard content
	 *
	 * @param data
	 */
	public void show(String data) {

		if (data == null) {
			return;
		}

		try {

			CryptoFileType fileType = CryptoFileUtil.detectFileType(new ByteArrayInputStream(data.getBytes()));

			switch (fileType) {
			case CERT:
				showCert(new ByteArrayInputStream(data.getBytes()));
				break;
			case CRL:
				showCrl(new ByteArrayInputStream(data.getBytes()));
				break;
			case PKCS10_CSR:
			case SPKAC_CSR:
				showCsr(new ByteArrayInputStream(data.getBytes()), fileType);
				break;
			case JCEKS_KS:
			case JKS_KS:
			case PKCS12_KS:
			case BKS_KS:
			case BKS_V1_KS:
			case UBER_KS:
			case UNKNOWN:
			default:
				JOptionPane.showMessageDialog(getFrameMediator().getContainer().getFrame(),
						res.getString("ExamineClipboardAction.UnknownType.message"),
						res.getString("ExamineClipboardAction.ExamineClipboard.Title"), JOptionPane.WARNING_MESSAGE);
				break;
			}

		} catch (Exception ex) {
			DError.displayError(getFrameMediator().getContainer().getFrame(), ex);
		}
	}

	private void showCert(InputStream is) throws CryptoException {

		X509Certificate[] certs = null;
		try {
			certs = X509CertUtil.loadCertificates(is);

			if (certs.length == 0) {
				JOptionPane.showMessageDialog(getFrameMediator().getContainer().getFrame(),
						res.getString("ExamineClipboardAction.NoCertsFound.message"),
						res.getString("ExamineClipboardAction.OpenCertificate.Title"), JOptionPane.WARNING_MESSAGE);
			}
		} catch (Exception ex) {
			String problemStr = res.getString("ExamineClipboardAction.NoOpenCert.Problem");

			String[] causes = new String[] { res.getString("ExamineClipboardAction.NotCert.Cause"),
					res.getString("ExamineClipboardAction.CorruptedCert.Cause") };

			Problem problem = new Problem(problemStr, causes, ex);

			DProblem dProblem = new DProblem(getFrameMediator().getContainer().getFrame(), res.getString("ExamineClipboardAction.ProblemOpeningCert.Title"),
					problem);
			dProblem.setLocationRelativeTo(getFrameMediator().getContainer().getFrame());
			dProblem.setVisible(true);
		}

		if (certs != null && certs.length > 0) {
			DViewCertificate dViewCertificate = new DViewCertificate(getFrameMediator().getContainer().getFrame(),
					res.getString("ExamineClipboardAction.CertDetails.Title"), certs, getFrameMediator(), DViewCertificate.IMPORT);
			dViewCertificate.setLocationRelativeTo(getFrameMediator().getContainer().getFrame());
			dViewCertificate.setVisible(true);
		}
	}
	private void showCrl(InputStream is) {
		if (is == null) {
			return;
		}

		X509CRL crl = null;
		try {
			crl = X509CertUtil.loadCRL(is);
		} catch (Exception ex) {
			String problemStr = res.getString("ExamineClipboardAction.NoOpenCrl.Problem");

			String[] causes = new String[] { res.getString("ExamineClipboardAction.NotCrl.Cause"),
					res.getString("ExamineClipboardAction.CorruptedCrl.Cause") };

			Problem problem = new Problem(problemStr, causes, ex);

			DProblem dProblem = new DProblem(getFrameMediator().getContainer().getFrame(), res.getString("ExamineClipboardAction.ProblemOpeningCrl.Title"),
					problem);
			dProblem.setLocationRelativeTo(getFrameMediator().getContainer().getFrame());
			dProblem.setVisible(true);
		}

		if (crl != null) {
			DViewCrl dViewCrl = new DViewCrl(getFrameMediator().getContainer().getFrame(), res.getString("ExamineClipboardAction.CrlDetails.Title"), crl);
			dViewCrl.setLocationRelativeTo(getFrameMediator().getContainer().getFrame());
			dViewCrl.setVisible(true);
		}
	}

	private void showCsr(InputStream is, CryptoFileType fileType) {
		if (is == null) {
			return;
		}

		try {
			PKCS10CertificationRequest pkcs10Csr = null;
			Spkac spkacCsr = null;

			try {
				if (fileType == CryptoFileType.PKCS10_CSR) {
					pkcs10Csr = Pkcs10Util.loadCsr(is);
				} else if (fileType == CryptoFileType.SPKAC_CSR) {
					spkacCsr = new Spkac(is);
				}
			} catch (Exception ex) {
				String problemStr = res.getString("ExamineClipboardAction.NoOpenCsr.Problem");

				String[] causes = new String[] { res.getString("ExamineClipboardAction.NotCsr.Cause"),
						res.getString("ExamineClipboardAction.CorruptedCsr.Cause") };

				Problem problem = new Problem(problemStr, causes, ex);

				DProblem dProblem = new DProblem(getFrameMediator().getContainer().getFrame(), res.getString("ExamineClipboardAction.ProblemOpeningCsr.Title"),
						problem);
				dProblem.setLocationRelativeTo(getFrameMediator().getContainer().getFrame());
				dProblem.setVisible(true);

				return;
			}

			if (pkcs10Csr != null) {
				DViewCsr dViewCsr = new DViewCsr(getFrameMediator().getContainer().getFrame(), res.getString("ExamineClipboardAction.CsrDetails.Title"),
						pkcs10Csr);
				dViewCsr.setLocationRelativeTo(getFrameMediator().getContainer().getFrame());
				dViewCsr.setVisible(true);
			} else {
				DViewCsr dViewCsr = new DViewCsr(getFrameMediator().getContainer().getFrame(), res.getString("ExamineClipboardAction.CsrDetails.Title"),
						spkacCsr);
				dViewCsr.setLocationRelativeTo(getFrameMediator().getContainer().getFrame());
				dViewCsr.setVisible(true);
			}
		} catch (Exception ex) {
			DError.displayError(getFrameMediator().getContainer().getFrame(), ex);
		}
	}

}
