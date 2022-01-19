package org.xendra.security.gui.action;

import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.MessageFormat;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.resourceloader.ImageLoader;
import org.kse.crypto.filetype.CryptoFileType;
import org.kse.crypto.filetype.CryptoFileUtil;
import org.kse.gui.CurrentDirectory;
import org.kse.gui.error.DError;
import org.xendra.Constants;
import org.xendra.security.gui.frame.SecurityEditorFrameController;
import org.xendra.security.util.ResourceLoader;

public class DetectFileTypeAction extends SecurityColumbaAction {
	public DetectFileTypeAction(IFrameMediator frameMediator) {
		super(frameMediator, ResourceLoader.getString("menu", "mainframe", "DetectFileType"));
		putValue(Constants.ID, "DetectFileType");
		putValue(SHORT_DESCRIPTION, ResourceLoader.getString("menu","mainframe","DetectFileType"));
		putValue(TOOLBAR_NAME, ResourceLoader.getString("menu", "mainframe","DetectFileType"));
		putValue(SMALL_ICON, ImageLoader.getSmallIconFromResource("org.xendra.security", "addcertificate.png"));
		putValue(LARGE_ICON, ImageLoader.getLargeIconFromResource("org.xendra.security", "addcertificate.png"));		
		((SecurityEditorFrameController) frameMediator).register(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		File detectTypeFile = null;

		try {
			JFileChooser chooser = new JFileChooser();
			chooser.setCurrentDirectory(CurrentDirectory.get());
			chooser.setDialogTitle(res.getString("DetectFileTypeAction.DetectFileType.Title"));
			chooser.setMultiSelectionEnabled(false);

			int rtnValue = chooser.showDialog(getFrameMediator().getContainer().getFrame(), res.getString("DetectFileTypeAction.DetectFileType.button"));

			if (rtnValue == JFileChooser.APPROVE_OPTION) {
				detectTypeFile = chooser.getSelectedFile();
				CurrentDirectory.updateForFile(detectTypeFile);
			}

			if (detectTypeFile == null) {
				return;
			}

			CryptoFileType fileType = CryptoFileUtil.detectFileType(new FileInputStream(detectTypeFile));

			String message = null;

			if (fileType != null) {
				message = MessageFormat.format(res.getString("DetectFileTypeAction.DetectedFileType.message"),
						detectTypeFile.getName(), fileType.friendly());
			} else {
				StringBuffer sbRecognisedTypes = new StringBuffer();

				for (CryptoFileType type : CryptoFileType.values()) {
					sbRecognisedTypes.append(MessageFormat.format("<li>{0}</li>", type.friendly()));
				}

				message = MessageFormat.format(res.getString("DetectFileTypeAction.NoDetectFileType.message"),
						detectTypeFile.getName(), sbRecognisedTypes.toString());
			}

			JOptionPane.showMessageDialog(getFrameMediator().getContainer().getFrame(), message,
					res.getString("DetectFileTypeAction.CryptographicFileType.Title"), JOptionPane.PLAIN_MESSAGE,
                    new ImageIcon(getClass().getResource(res.getString("DetectFileTypeAction.DetectFileType.icon"))));					
		} catch (FileNotFoundException ex) {
			JOptionPane.showMessageDialog(getFrameMediator().getContainer().getFrame(),
					MessageFormat.format(res.getString("DetectFileTypeAction.NoReadFile.message"), detectTypeFile),
					res.getString("DetectFileTypeAction.DetectFileType.Title"), JOptionPane.WARNING_MESSAGE);
		} catch (Exception ex) {
			DError.displayError(getFrameMediator().getContainer().getFrame(), ex);
		}

	}
}
