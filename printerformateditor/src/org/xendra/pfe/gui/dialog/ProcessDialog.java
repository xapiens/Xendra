package org.xendra.pfe.gui.dialog;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import org.columba.core.gui.base.ButtonWithMnemonic;
import org.columba.core.gui.base.SingleSideEtchedBorder;
import org.columba.core.resourceloader.GlobalResourceLoader;
import org.columba.core.resourceloader.ImageLoader;
import org.compiere.model.MPrinterDocumentFormat;
import org.compiere.util.Env;
import org.xendra.controls.CompileLog;
import org.xendra.controls.MVELEditor;
import org.xendra.pfe.folder.FormatFolder;
import javax.swing.JToolBar;
import javax.swing.JSplitPane;

public class ProcessDialog extends JDialog implements ActionListener {

	private static final String PICKVALRULE = "PVR";
	private MVELEditor editor;
	private CompileLog compilelog;
	private ButtonWithMnemonic okButton;
	private ButtonWithMnemonic cancelButton;
	private FormatFolder formatfolder;
	private final JPanel toppanel = new JPanel();
	private JButton btnSave;
	private JButton btnCompile;
	private JSplitPane splitPane;
	private JToolBar toolBar;

	public ProcessDialog(FormatFolder ff) {
		this.formatfolder = ff; 
		Components();
		pack();
		setLocationRelativeTo(null);
	}

	private void Components() {
		getContentPane().setLayout(new BorderLayout());
		toolBar = new JToolBar();
		toppanel.add(toolBar);
		try {
			btnSave = new JButton("save");
			btnSave.setActionCommand("save");
			btnSave.addActionListener(this);
			ImageIcon save = new ImageIcon(ImageIO.read(new File(Env.getResource("org.xendra.pfe", "save.png"))));
			btnSave.setIcon(save);

			btnCompile = new JButton("compile");
			btnCompile.setActionCommand("compile");
			btnCompile.addActionListener(this);		
			ImageIcon compile = ImageLoader.getSmallIconFromResource("org.xendra.pfe", "system-run.png");
			btnCompile.setIcon(compile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		toolBar.add(btnSave);
		toolBar.add(btnCompile);
		toppanel.add(toolBar);
		getContentPane().add(toppanel,BorderLayout.NORTH);
		editor = new MVELEditor();
		compilelog = new CompileLog();
		splitPane = new JSplitPane();
		splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		splitPane.setLeftComponent(editor);
		splitPane.setRightComponent(compilelog);
		getContentPane().add(splitPane, BorderLayout.CENTER);

		JPanel bottomPanel = new JPanel();
		bottomPanel.setBorder(new SingleSideEtchedBorder(SwingConstants.TOP));
		getContentPane().add(bottomPanel, BorderLayout.SOUTH);
		bottomPanel.setLayout(new BorderLayout(0, 0));
		JPanel buttonPanel = new JPanel();
		buttonPanel.setBorder(new EmptyBorder(12, 12, 12, 12));		
		buttonPanel.setLayout(new GridLayout(1, 3, 6, 0));
		okButton = new ButtonWithMnemonic(GlobalResourceLoader.getString("org.columba.core.i18n.dialog", "global", "ok")); //$NON-NLS-1$ //$NON-NLS-2$
		okButton.setActionCommand("OK"); //$NON-NLS-1$
		okButton.addActionListener(this);		
		buttonPanel.add(okButton);
		cancelButton = new ButtonWithMnemonic(GlobalResourceLoader.getString("org.columba.core.i18n.dialog", "global", "cancel")); //$NON-NLS-1$ //$NON-NLS-2$
		cancelButton.setActionCommand("CANCEL"); //$NON-NLS-1$
		cancelButton.addActionListener(this);		
		buttonPanel.add(cancelButton);

		getRootPane().registerKeyboardAction(this, "CANCEL", //$NON-NLS-1$
				KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0),
				JComponent.WHEN_IN_FOCUSED_WINDOW);		
		//
		bottomPanel.add(buttonPanel, BorderLayout.EAST);
		this.setPreferredSize(new Dimension(500,300));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("OK")) {			
			setVisible(false);
		} else if (e.getActionCommand().equals("CANCEL")) {
			//valrule = null;
			setVisible(false);
		} else if (e.getActionCommand().equals("save")) {
			PrinterDocumentFormatSave();
		} else if (e.getActionCommand().equals("compile")) {
			PrinterDocumentFormatSave();
			compilelog.compile(formatfolder.getPrinterDocumentFormat(), formatfolder.getPrinterDocumentFormat().getSource());
		}		
	}

	private void PrinterDocumentFormatSave() {
		MPrinterDocumentFormat pf = formatfolder.getPrinterDocumentFormat();
		pf.setSource(editor.getCode());
		pf.save();		
	}

	public void setFormatFolder(FormatFolder ff) {
		this.formatfolder = ff;
		editor.setCode(this.formatfolder.getPrinterDocumentFormat().getSource());
	}

}
