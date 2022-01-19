package org.xendra.security.gui.frame;

import static org.kse.crypto.keystore.KeyStoreType.BKS;
import static org.kse.crypto.keystore.KeyStoreType.BKS_V1;
import static org.kse.crypto.keystore.KeyStoreType.JCEKS;
import static org.kse.crypto.keystore.KeyStoreType.JKS;
import static org.kse.crypto.keystore.KeyStoreType.PKCS12;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DragSource;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;
import javax.swing.ListSelectionModel;
import javax.swing.RowSorter;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.columba.api.gui.frame.IContainer;
import org.columba.api.gui.frame.IDock;
import org.columba.api.gui.frame.IDockable;
import org.columba.core.config.View;
import org.columba.core.gui.action.AbstractColumbaAction;
import org.columba.core.gui.frame.DockFrameController;
import org.compiere.model.MConfig;
import org.kse.ApplicationSettings;
import org.kse.KSE;
import org.kse.crypto.CryptoException;
import org.kse.crypto.Password;
import org.kse.crypto.keystore.KeyStoreType;
import org.kse.crypto.keystore.KeyStoreUtil;
import org.kse.gui.CursorUtil;
import org.kse.gui.JKeyStoreTabbedPane;
import org.kse.gui.JKseTable;
import org.kse.gui.JMenuItemRecentFile;
import org.kse.gui.JMenuRecentFiles;
import org.kse.gui.KeyStoreTab;
import org.kse.gui.KeyStoreTableCellRend;
import org.kse.gui.KeyStoreTableHeadRend;
import org.kse.gui.KeyStoreTableModel;
import org.kse.gui.PlatformUtil;
import org.kse.gui.RecentKeyStoreFileActionListener;
import org.kse.gui.dnd.KeyStoreEntryDragGestureListener;
import org.kse.gui.error.DError;
import org.kse.gui.quickstart.JQuickStartPane;
//import org.kse.gui.statusbar.StatusBarChangeHandler;
import org.kse.utilities.buffer.Buffer;
import org.kse.utilities.history.KeyStoreHistory;
import org.kse.utilities.history.KeyStoreState;
import org.kse.utilities.os.OperatingSystem;
import org.xendra.security.gui.action.AppendToCertificateChainAction;
import org.xendra.security.gui.action.CopyAction;
import org.xendra.security.gui.action.CopyKeyPairAction;
import org.xendra.security.gui.action.CopyTrustedCertificateAction;
import org.xendra.security.gui.action.CutAction;
import org.xendra.security.gui.action.CutKeyPairAction;
import org.xendra.security.gui.action.CutTrustedCertificateAction;
import org.xendra.security.gui.action.DeleteKeyAction;
import org.xendra.security.gui.action.DeleteKeyPairAction;
import org.xendra.security.gui.action.DeleteTrustedCertificateAction;
import org.xendra.security.gui.action.ExportKeyPairAction;
import org.xendra.security.gui.action.ExportKeyPairCertificateChainAction;
import org.xendra.security.gui.action.ExportKeyPairPrivateKeyAction;
import org.xendra.security.gui.action.ExportKeyPairPublicKeyAction;
import org.xendra.security.gui.action.ExportTrustedCertificateAction;
import org.xendra.security.gui.action.ExportTrustedCertificatePublicKeyAction;
import org.xendra.security.gui.action.GenerateCsrAction;
import org.xendra.security.gui.action.GenerateKeyPairAction;
import org.xendra.security.gui.action.ImportCaReplyFromClipboardAction;
import org.xendra.security.gui.action.ImportCaReplyFromFileAction;
import org.xendra.security.gui.action.KeyDetailsAction;
import org.xendra.security.gui.action.KeyPairCertificateChainDetailsAction;
import org.xendra.security.gui.action.KeyPairPrivateKeyDetailsAction;
import org.xendra.security.gui.action.KeyPairPublicKeyDetailsAction;
import org.xendra.security.gui.action.PasteAction;
import org.xendra.security.gui.action.RemoveFromCertificateChainAction;
import org.xendra.security.gui.action.RenameKeyAction;
import org.xendra.security.gui.action.RenameKeyPairAction;
import org.xendra.security.gui.action.RenameTrustedCertificateAction;
import org.xendra.security.gui.action.SetKeyPairPasswordAction;
import org.xendra.security.gui.action.SetKeyPasswordAction;
import org.xendra.security.gui.action.SignCsrAction;
import org.xendra.security.gui.action.SignJarAction;
import org.xendra.security.gui.action.SignMidletAction;
import org.xendra.security.gui.action.SignNewKeyPairAction;
import org.xendra.security.gui.action.TrustedCertificateDetailsAction;
import org.xendra.security.gui.action.TrustedCertificatePublicKeyDetailsAction;
import org.xendra.security.gui.action.UnlockKeyAction;
import org.xendra.security.gui.action.UnlockKeyPairAction;
import org.xendra.security.util.ResourceLoader;

public class SecurityEditorFrameController extends DockFrameController implements ActionListener, SecurityEditorFrameMediator {
    private ApplicationSettings applicationSettings = ApplicationSettings.getInstance();
	private JMenuRecentFiles jmrfRecentFiles;
	private static ResourceBundle res = ResourceBundle.getBundle("org/kse/gui/resources");
	//private static ResourceBundle props = ResourceBundle.getBundle("org/kse/version");
	private IDockable main;
	//private SecurityPanel mainPanel;
	private ArrayList<KeyStoreHistory> histories = new ArrayList<KeyStoreHistory>();
	private ArrayList<JTable> keyStoreTables = new ArrayList<JTable>();
	private JKeyStoreTabbedPane jkstpKeyStores;
	private JQuickStartPane jQuickStart;	
	private JLabel jlStatusBar;
	private JPopupMenu jpmKeyPair;
	private JPopupMenu jpmTrustedCertificate;
	private JMenu jmKeyPairDetails;
	private JPopupMenu jpmKey;
	private JPopupMenu jpmKeyStore;
	private JMenuItem jmiKeyPairCertificateChainDetails;
	private JMenuItem jmiKeyPairPrivateKeyDetails;
	private JMenuItem jmiKeyPairPublicKeyDetails;
	private JMenuItem jmiKeyPairCut;	
	private JMenuItem jmiKeyPairCopy;
	private JMenu jmKeyPairExport;
	private JMenuItem jmiKeyPairExport;
	private JMenuItem jmiKeyPairExportCertificateChain;
	private JMenuItem jmiKeyPairExportPrivateKey;
	private JMenuItem jmiKeyPairExportPublicKey;
	private JMenuItem jmiKeyPairGenerateCsr;
	private JMenu jmKeyPairImportCaReply;
	private JMenuItem jmiKeyPairImportCaReplyFile;
	private JMenuItem jmiKeyPairImportCaReplyClipboard;
	private JMenu jmKeyPairEditCertChain;
	private JMenuItem jmiKeyPairEditCertChainAppendCert;
	private JMenuItem jmiKeyPairEditCertChainRemoveCert;
	private JMenu jmKeyPairSign;
	private JMenuItem jmiKeyPairSignCsr;
	private JMenuItem jmiKeyPairSignJar;
	private JMenuItem jmiKeyPairSignMidlet;
	private JMenuItem jmiKeyPairSignNewKeyPair;
	private JMenuItem jmiKeyPairUnlock;
	private JMenuItem jmiKeyPairSetPassword;
	private JMenuItem jmiKeyPairDelete;
	private JMenuItem jmiKeyPairRename;
	private JMenu jmTrustedCertificateDetails;
	private JMenuItem jmiTrustedCertificateDetails;
	private JMenuItem jmiTrustedCertificatePublicKeyDetails;
	private JMenuItem jmiTrustedCertificateCut;
	private JMenuItem jmiTrustedCertificateCopy;
	private JMenu jmTrustedCertificateExport;
	private JMenuItem jmiTrustedCertificateExport;
	private JMenuItem jmiTrustedCertificateExportPublicKey;
	private JMenuItem jmiTrustedCertificateDelete;
	private JMenuItem jmiTrustedCertificateRename;
	private JMenuItem jmiKeyDetails;
	private JMenuItem jmiKeyUnlock;
	private JMenuItem jmiKeySetPassword;
	private JMenuItem jmiKeyDelete;
	private JMenuItem jmiKeyRename;

	private UnlockKeyAction unlockKeyAction = new UnlockKeyAction(this);
	private GenerateKeyPairAction generateKeyPairAction = new GenerateKeyPairAction(this);	
	private final CutAction cutAction = new CutAction(this);
	private KeyPairCertificateChainDetailsAction keyPairCertificateChainDetailsAction = new KeyPairCertificateChainDetailsAction(this);
	private KeyPairPrivateKeyDetailsAction keyPairPrivateKeyDetailsAction = new KeyPairPrivateKeyDetailsAction(this);
	private KeyPairPublicKeyDetailsAction keyPairPublicKeyDetailsAction = new KeyPairPublicKeyDetailsAction(this);
	private CutKeyPairAction cutKeyPairAction = new CutKeyPairAction(this);
	private CopyKeyPairAction copyKeyPairAction = new CopyKeyPairAction(this);
	private ExportKeyPairAction exportKeyPairAction = new ExportKeyPairAction(this);
	private ExportKeyPairCertificateChainAction exportKeyPairCertificateChainAction = new ExportKeyPairCertificateChainAction(this);
	private ExportKeyPairPrivateKeyAction exportKeyPairPrivateKeyAction = new ExportKeyPairPrivateKeyAction(this);
	private ExportKeyPairPublicKeyAction exportKeyPairPublicKeyAction = new ExportKeyPairPublicKeyAction(this);
	private GenerateCsrAction generateCsrAction = new GenerateCsrAction(this);
	private ImportCaReplyFromFileAction importCaReplyFromFileAction = new ImportCaReplyFromFileAction(this);
	private ImportCaReplyFromClipboardAction importCaReplyFromClipboardAction = new ImportCaReplyFromClipboardAction(this);
	private AppendToCertificateChainAction appendToCertificateChainAction = new AppendToCertificateChainAction(this);
	private RemoveFromCertificateChainAction removeFromCertificateChainAction = new RemoveFromCertificateChainAction(this);
	private SignCsrAction signCsrAction = new SignCsrAction(this);
	private SignJarAction signJarAction = new SignJarAction(this);
	private SignMidletAction signMidletAction = new SignMidletAction(this);
	private SignNewKeyPairAction signNewKeyPairAction = new SignNewKeyPairAction(this);
	private UnlockKeyPairAction unlockKeyPairAction = new UnlockKeyPairAction(this);
	private SetKeyPairPasswordAction setKeyPairPasswordAction = new SetKeyPairPasswordAction(this);
	private DeleteKeyPairAction deleteKeyPairAction = new DeleteKeyPairAction(this);
	private RenameKeyPairAction renameKeyPairAction = new RenameKeyPairAction(this);
	private TrustedCertificateDetailsAction trustedCertificateDetailsAction = new TrustedCertificateDetailsAction(this);
	private TrustedCertificatePublicKeyDetailsAction trustedCertificatePublicKeyDetailsAction = new TrustedCertificatePublicKeyDetailsAction(this);
	private CutTrustedCertificateAction cutTrustedCertificateAction = new CutTrustedCertificateAction(this);
	private CopyTrustedCertificateAction copyTrustedCertificateAction = new CopyTrustedCertificateAction(this);
	private ExportTrustedCertificateAction exportTrustedCertificateAction = new ExportTrustedCertificateAction(this);
	private ExportTrustedCertificatePublicKeyAction exportTrustedCertificatePublicKeyAction = new ExportTrustedCertificatePublicKeyAction(this);
	private DeleteTrustedCertificateAction deleteTrustedCertificateAction = new DeleteTrustedCertificateAction(this);
	private RenameTrustedCertificateAction renameTrustedCertificateAction = new RenameTrustedCertificateAction(this);
	private KeyDetailsAction keyDetailsAction = new KeyDetailsAction(this);
	private SetKeyPasswordAction setKeyPasswordAction = new SetKeyPasswordAction(this);
	private DeleteKeyAction deleteKeyAction = new DeleteKeyAction(this);
	private RenameKeyAction renameKeyAction = new RenameKeyAction(this);
	private CopyAction copyAction = new CopyAction(this);
	private PasteAction pasteAction = new PasteAction(this);
	private JToolBar jtbToolBar;

	public SecurityEditorFrameController(View viewItem) {
		super(viewItem);
		//initKeyStoreTabPopupMenu();
		//initKeyStorePopupMenu();
		initKeyStoreEntryPopupMenus();
		//mainPanel = new SecurityPanel();
		jkstpKeyStores = new JKeyStoreTabbedPane(this);
		Security.addProvider(new BouncyCastleProvider());
		registerDockables();
	}
	private void registerDockables() {	
		//main = registerDockable("modeleditor_foldertree", ResourceLoader.getString("global", "dockable_foldertree"), mainPanel, null);
		main = registerDockable("keystore", ResourceLoader.getString("global", "dockable_foldertree"), jkstpKeyStores, null);
	}

	public void loadDefaultPosition() {
		super.dock(main, IDock.REGION.CENTER);					
	}	
	public void extendToolBar(IContainer container) {
		try {
			MConfig config = MConfig.getbyIdentifier("xendra","security","main_toolbar");
			InputStream is2 = new ByteArrayInputStream(config.getContent().getBytes());
			container.extendToolbar(this, is2);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

//	@Override
//	public SecurityPanel getSecurityPanel() {
//		return mainPanel;
//	}
//
//	@Override
	public void actionPerformed(ActionEvent e) {		
//		mainPanel.actionPerformed(e);
	}
	public void register(AbstractColumbaAction action) {
//		mainPanel.register(action);		
	}
	public void addKeyStore(KeyStore keyStore, String keyStoreName, Password password, Provider explicitProvider) {
		KeyStoreHistory history = new KeyStoreHistory(keyStore, keyStoreName, password, explicitProvider);
		addKeyStoreHistory(history);		
	}

	public void addKeyStore(KeyStore keyStore, File keyStoreFile, Password password) {
		KeyStoreHistory history = new KeyStoreHistory(keyStore, keyStoreFile, password);

		addKeyStoreHistory(history);
	}


	private JScrollPane wrapKeyStoreTableInScrollPane(JTable jtKeyStore) {

		jtKeyStore.setOpaque(true);
		jtKeyStore.setShowGrid(false);
		jtKeyStore.setFillsViewportHeight(true);
		JScrollPane jspKeyStoreTable = PlatformUtil.createScrollPane(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

		jspKeyStoreTable.setViewportView(jtKeyStore);
		jspKeyStoreTable.setBorder(BorderFactory.createEtchedBorder());
		jspKeyStoreTable.setFocusable(false);

		return jspKeyStoreTable;
	}

	private void addKeyStoreHistory(KeyStoreHistory history) {
		histories.add(history);

		JTable jtKeyStore = createEmptyKeyStoreTable();
		keyStoreTables.add(jtKeyStore);

		JScrollPane jspKeyStore = wrapKeyStoreTableInScrollPane(jtKeyStore);

		//KeyStoreTab keyStoreTab = new KeyStoreTab(history.getName(), this, history);
		KeyStoreTab keyStoreTab = new KeyStoreTab(history.getName(), null, history);
		jkstpKeyStores.addTab(null, jspKeyStore);
		jkstpKeyStores.setTabComponentAt(jkstpKeyStores.getTabCount() - 1, keyStoreTab);
		jkstpKeyStores.setSelectedIndex(jkstpKeyStores.getTabCount() - 1);

		updateControls(true);

		// If KeyStore is backed up by a file add it to the recent files menu
		//		if (history.getFile() != null) {
		//			jmrfRecentFiles.add(createRecentFileMenuItem(jmrfRecentFiles, history.getFile()));
		//		}
	}

	/**
	 * Update the frame's controls dependent on the state of its open and active
	 * KeyStores.
	 *
	 * @param keyStoreContentsChanged
	 *            Have the active KeyStore's contents changed?
	 */
	public void updateControls(boolean keyStoreContentsChanged) {
		KeyStoreHistory history = getActiveKeyStoreHistory();

		if (history == null) {
			//updateControlsNoKeyStoresOpen();
			return;
		}

		KeyStoreState currentState = history.getCurrentState();

		// Reload KeyStore in table if it has changed
		if (keyStoreContentsChanged) {
			try {
				String selectedAlias = getSelectedEntryAlias();

				((KeyStoreTableModel) getActiveKeyStoreTable().getModel()).load(history);

				// Loading the model loses the selected entry - preserve it
				if (selectedAlias != null) {
					setSelectedEntryByAlias(selectedAlias);
				}
			} catch (GeneralSecurityException ex) {
				//DError.displayError(frame, ex);
				DError.displayError((JFrame) getContainer(), ex);
			} catch (CryptoException ex) {
				//DError.displayError(frame, ex);
				DError.displayError((JFrame) getContainer(), ex);
			}
		}

		// Can save if active KeyStore has not been saved
		if (!currentState.isSavedState()) {
			//saveAction.setEnabled(true);
		} else {
			//saveAction.setEnabled(false);
		}

		// Can save all if any KeyStore has been changed since saved
		boolean saveAll = false;
		for (int i = 0; i < histories.size(); i++) {
			KeyStoreHistory h = histories.get(i);

			if (!h.getCurrentState().isSavedState()) {
				saveAll = true; // Yes - can Save All
				break;
			}
		}

		//		saveAllAction.setEnabled(saveAll);

		// Can close
		//		closeAction.setEnabled(true);
		//		closeAllAction.setEnabled(true);
		//
		//		// Can close others?
		//		if (jkstpKeyStores.getTabCount() > 1) {
		//			closeOthersAction.setEnabled(true);
		//		} else {
		//			closeOthersAction.setEnabled(false);
		//		}
		//
		KeyStore keyStore = currentState.getKeyStore();
		KeyStoreType type = KeyStoreType.resolveJce(keyStore.getType());
		//
		// Can Save As
		if (type.isFileBased()) {
			//			saveAsAction.setEnabled(true);
		}
		//
		//		// May be able to undo/redo
		//		updateUndoRedoControls(currentState);
		//
		//		// May be able to cut/copy/paste
		//		if (type.isFileBased()) {
		//			updateCutCopyPasteControls();
		//		}
		//
		//		// Can use tools on
		generateKeyPairAction.setEnabled(true);
		//		generateSecretKeyAction.setEnabled(type.supportsKeyEntries());
		//		importTrustedCertificateAction.setEnabled(true);
		//		importKeyPairAction.setEnabled(true);
		//		propertiesAction.setEnabled(true);
		//		if (type.isFileBased()) {
		//			setPasswordAction.setEnabled(true);
		//		}
		//
		//		// Show default status bar display
		setDefaultStatusBarText();
		//
		//		// Passwords, and therefore unlocking, are not relevant for PKCS #12 or KeyStores that are not file-based
		//		if (!type.hasEntryPasswords() || !type.isFileBased()) {
		//			unlockKeyPairAction.setEnabled(false);
		//			setKeyPairPasswordAction.setEnabled(false);
		//			unlockKeyAction.setEnabled(false);
		//			setKeyPasswordAction.setEnabled(false);
		//		} else {
		//			unlockKeyPairAction.setEnabled(true);
		//			setKeyPairPasswordAction.setEnabled(true);
		//			unlockKeyAction.setEnabled(true);
		//			setKeyPasswordAction.setEnabled(true);
		//		}
		//
		//		// Special restrictions for MSCAPI and PKCS#11 type
		//		if (type == KeyStoreType.MS_CAPI_PERSONAL || type == KeyStoreType.PKCS11) {
		//
		//			keyPairPrivateKeyDetailsAction.setEnabled(false);
		//			keyDetailsAction.setEnabled(false);
		//
		//			renameKeyAction.setEnabled(false);
		//			renameKeyPairAction.setEnabled(false);
		//			renameTrustedCertificateAction.setEnabled(false);
		//
		//			exportKeyPairAction.setEnabled(false);
		//			exportKeyPairPrivateKeyAction.setEnabled(false);
		//
		//			jmKeyPairEditCertChain.setEnabled(false);
		//			appendToCertificateChainAction.setEnabled(false);
		//			removeFromCertificateChainAction.setEnabled(false);
		//
		//			// "UnsupportedOperationException" ...
		//			jmKeyPairImportCaReply.setEnabled(false);
		//		} else {
		//			keyPairPrivateKeyDetailsAction.setEnabled(true);
		//			keyDetailsAction.setEnabled(true);
		//
		//			renameKeyAction.setEnabled(true);
		//			renameKeyPairAction.setEnabled(true);
		//			renameTrustedCertificateAction.setEnabled(true);
		//
		//			exportKeyPairAction.setEnabled(true);
		//			exportKeyPairPrivateKeyAction.setEnabled(true);
		//
		//			jmKeyPairEditCertChain.setEnabled(true);
		//			appendToCertificateChainAction.setEnabled(true);
		//			removeFromCertificateChainAction.setEnabled(true);
		//
		//			jmKeyPairImportCaReply.setEnabled(true);
		//		}
		//
		//		// KeyStore type menu items
		//		if (type.isFileBased()) {
		//			jmChangeType.setEnabled(true);
		//
		//			if (type == JKS) {
		//				jrbmiChangeTypeJks.setSelected(true);
		//				jrbmiKeyStoreChangeTypeJks.setSelected(true);
		//			} else if (type == JCEKS) {
		//				jrbmiChangeTypeJceks.setSelected(true);
		//				jrbmiKeyStoreChangeTypeJceks.setSelected(true);
		//			} else if (type == PKCS12) {
		//				jrbmiChangeTypePkcs12.setSelected(true);
		//				jrbmiKeyStoreChangeTypePkcs12.setSelected(true);
		//			} else if (type == BKS_V1) {
		//				jrbmiChangeTypeBksV1.setSelected(true);
		//				jrbmiKeyStoreChangeTypeBksV1.setSelected(true);
		//			} else if (type == BKS) {
		//				jrbmiChangeTypeBks.setSelected(true);
		//				jrbmiKeyStoreChangeTypeBks.setSelected(true);
		//			} else {
		//				jrbmiChangeTypeUber.setSelected(true);
		//				jrbmiKeyStoreChangeTypeUber.setSelected(true);
		//			}
		//		} else {
		//			jmKeyStoreChangeType.setEnabled(false);
		//		}
		//
		//		// Show KeyStores tabbed pane
		//		frame.getContentPane().remove(jQuickStart);
		//		frame.getContentPane().add(jkstpKeyStores, BorderLayout.CENTER);
		//
		//		updateKeyStoreTabsText();
		//		updateApplicationTitle();

		//		frame.repaint();
	}


	private JTable createEmptyKeyStoreTable() {
		KeyStoreTableModel ksModel = new KeyStoreTableModel();
		final JTable jtKeyStore = new JKseTable(ksModel);

		RowSorter<TableModel> sorter = new TableRowSorter<TableModel>(ksModel);
		jtKeyStore.setRowSorter(sorter);

		jtKeyStore.setShowGrid(false);
		jtKeyStore.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		jtKeyStore.getTableHeader().setReorderingAllowed(false);
		jtKeyStore.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		jtKeyStore.setRowHeight(Math.max(18, jtKeyStore.getRowHeight())); // min. height of 18 because of 16x16 icons

		// Register cut, copy and paste actions with the relevant keystrokes
		//jtKeyStore.getInputMap().put((KeyStroke) cutAction.getValue(Action.ACCELERATOR_KEY), CUT_KEY);
		//jtKeyStore.getActionMap().put(CUT_KEY, cutAction);

		//jtKeyStore.getInputMap().put((KeyStroke) copyAction.getValue(Action.ACCELERATOR_KEY), COPY_KEY);
		//jtKeyStore.getActionMap().put(COPY_KEY, copyAction);

		//jtKeyStore.getInputMap().put((KeyStroke) pasteAction.getValue(Action.ACCELERATOR_KEY), PASTE_KEY);
		//jtKeyStore.getActionMap().put(PASTE_KEY, pasteAction);

		// open keystore entry details when user presses enter key
		KeyStroke enter = KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0);
		jtKeyStore.getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT).put(enter, "Enter");
		jtKeyStore.getActionMap().put("Enter", new AbstractAction() {
			private static final long serialVersionUID = 1L;
			@Override
			public void actionPerformed(ActionEvent ae) {
				try {
					int selectedRow = jtKeyStore.getSelectedRow();
					if (selectedRow != -1) {
						//CursorUtil.setCursorBusy(frame);						
						showSelectedEntryDetails(jtKeyStore, selectedRow);
					}
				} finally {
					//CursorUtil.setCursorFree(frame);
				}
			}
		});

		// Add DnD source support to KeyStore
		DragSource ds = DragSource.getDefaultDragSource();
		//ds.createDefaultDragGestureRecognizer(jtKeyStore, DnDConstants.ACTION_MOVE,	new KeyStoreEntryDragGestureListener(this));

		// Add custom renderers for headers and cells
		for (int i = 0; i < jtKeyStore.getColumnCount(); i++) {
			TableColumn column = jtKeyStore.getColumnModel().getColumn(i);
			column.setHeaderRenderer(new KeyStoreTableHeadRend(jtKeyStore.getTableHeader().getDefaultRenderer()));
			column.setCellRenderer(new KeyStoreTableCellRend());
		}

		// Make the first three columns small and not resizable as they hold icons
		TableColumn typeCol = jtKeyStore.getColumnModel().getColumn(0);
		typeCol.setResizable(false);
		typeCol.setMinWidth(28);
		typeCol.setMaxWidth(28);
		typeCol.setPreferredWidth(28);

		TableColumn statusCol = jtKeyStore.getColumnModel().getColumn(1);
		statusCol.setResizable(false);
		statusCol.setMinWidth(28);
		statusCol.setMaxWidth(28);
		statusCol.setPreferredWidth(28);

		TableColumn certExpiredCol = jtKeyStore.getColumnModel().getColumn(2);
		certExpiredCol.setResizable(false);
		certExpiredCol.setMinWidth(28);
		certExpiredCol.setMaxWidth(28);
		certExpiredCol.setPreferredWidth(28);

		jtKeyStore.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent evt) {
				maybeShowSelectedEntryDetails(evt);
			}

			@Override
			public void mousePressed(MouseEvent evt) {
				maybeShowSelectedEntryPopupMenu(evt);
			}

			@Override
			public void mouseReleased(MouseEvent evt) {
				maybeShowSelectedEntryPopupMenu(evt);
			}
		});

		jtKeyStore.addKeyListener(new KeyAdapter() {
			boolean deleteLastPressed = false;

			@Override
			public void keyPressed(KeyEvent evt) {
				// Record delete pressed on non-Macs
				if (!OperatingSystem.isMacOs()) {
					deleteLastPressed = evt.getKeyCode() == KeyEvent.VK_DELETE;
				}
			}

			@Override
			public void keyReleased(KeyEvent evt) {
				// Delete on non-Mac if delete was pressed and is now released
				if (!OperatingSystem.isMacOs() && deleteLastPressed && evt.getKeyCode() == KeyEvent.VK_DELETE) {
					deleteLastPressed = false;
					//handleDeleteSelectedEntry();
				}
			}

			@Override
			public void keyTyped(KeyEvent evt) {
				// Delete on Mac if back space typed
				if (OperatingSystem.isMacOs() && evt.getKeyChar() == 0x08) {
					//handleDeleteSelectedEntry();
				}
			}
		});

		return jtKeyStore;
	}

	private void showSelectedEntryDetails(JTable jtKeyStore, int row) {
		jtKeyStore.setRowSelectionInterval(row, row);
		//updateCutCopyPasteControls(); // Selection changed - update edit controls

		KeyStoreHistory history = getActiveKeyStoreHistory();
		KeyStore keyStore = history.getCurrentState().getKeyStore();
		String alias = getSelectedEntryAlias();

		try {
			if (KeyStoreUtil.isKeyPairEntry(alias, keyStore)) {
				//keyPairCertificateChainDetailsAction.showCertificateSelectedEntry();
			} else if (KeyStoreUtil.isTrustedCertificateEntry(alias, keyStore)) {
				//trustedCertificateDetailsAction.showCertificateSelectedEntry();
			} else if (KeyStoreUtil.isKeyEntry(alias, keyStore)) {
				//keyDetailsAction.showKeySelectedEntry();
			}
		} catch (Exception ex) {
			//DError.displayError(frame, ex);
		}
	}

	/**
	 * Get the active KeyStore.
	 *
	 * @return The KeyStore or null if no KeyStore is active
	 */
	public KeyStore getActiveKeyStore() {
		KeyStoreHistory history = getActiveKeyStoreHistory();
		if (history == null) {
			return null;
		}

		KeyStoreState currentState = history.getCurrentState();
		KeyStore keyStore = currentState.getKeyStore();
		return keyStore;
	}

	/**
	 * Get the active KeyStore history.
	 *
	 * @return The KeyStore history or null if no KeyStore is active
	 */
	public KeyStoreHistory getActiveKeyStoreHistory() {
		if (histories.size() == 0) {
			return null;
		}

		int selected = jkstpKeyStores.getSelectedIndex();
		return histories.get(selected);
	}


	public KeyStoreHistory[] getKeyStoreHistories() {
		return histories.toArray(new KeyStoreHistory[histories.size()]);	
	}

	/**
	 * Get the alias of the entry currently selected in the KeyStore table if
	 * any.
	 *
	 * @return Alias or null if none selected
	 */
	public String getSelectedEntryAlias() {
		JTable jtKeyStore = getActiveKeyStoreTable();
		int row = jtKeyStore.getSelectedRow();

		if (row == -1) {
			return null;
		}

		String alias = (String) jtKeyStore.getValueAt(row, 3);
		return alias;
	}

	private void setSelectedEntryByAlias(String alias) {
		JTable jtKeyStore = getActiveKeyStoreTable();

		for (int i = 0; i < jtKeyStore.getRowCount(); i++) {
			if (alias.equals(jtKeyStore.getValueAt(i, 3))) {
				jtKeyStore.setRowSelectionInterval(i, i);
				break;
			}
		}
	}

	private JTable getActiveKeyStoreTable() {
		if (keyStoreTables.size() == 0) {
			return null;
		}

		int selected = jkstpKeyStores.getSelectedIndex();
		return keyStoreTables.get(selected);
	}

	public void setDefaultStatusBarText() {
		KeyStoreHistory history = getActiveKeyStoreHistory();

		if (history == null) {
			setStatusBarText(res.getString("KseFrame.noKeyStore.statusbar"));
		} else {
			//setStatusBarText(getKeyStoreStatusText(history));
		}
	}

	public void setStatusBarText(String status) {
		jlStatusBar.setText(status);
	}

	private void maybeShowSelectedEntryDetails(MouseEvent evt) {
		// Check if a double click occurred on the KeyStore table. If it has
		// show the relevant details of the entry clicked upon
		if (evt.getClickCount() > 1) {
			JTable jtKeyStore = (JTable) evt.getComponent();

			Point point = new Point(evt.getX(), evt.getY());
			int row = jtKeyStore.rowAtPoint(point);

			if (row != -1) {
				try {					
					CursorUtil.setCursorBusy(getContainer().getFrame());
					showSelectedEntryDetails(jtKeyStore, row);
				} finally {
					CursorUtil.setCursorFree(getContainer().getFrame());
				}
			}
		}
	}

	private void maybeShowSelectedEntryPopupMenu(MouseEvent evt) {

		JTable jtKeyStore = (JTable) evt.getComponent();

		Point point = new Point(evt.getX(), evt.getY());
		int row = jtKeyStore.rowAtPoint(point);

		KeyStoreType type = KeyStoreType.resolveJce(getActiveKeyStoreHistory().getCurrentState().getKeyStore().getType());

		if (evt.isPopupTrigger()) {

			if (row != -1) {

				jtKeyStore.setRowSelectionInterval(row, row);

				if (jtKeyStore.getValueAt(row, 0).equals(KeyStoreTableModel.KEY_PAIR_ENTRY)) {

					// For KeyStore types that support password protected entries...
					if (type.hasEntryPasswords()) {
						// Only allow unlocking from menu if entry is currently locked
						boolean locked = ((Boolean) jtKeyStore.getValueAt(row, 1)).booleanValue();
						//						unlockKeyPairAction.setEnabled(locked);
					}

					jpmKeyPair.show(evt.getComponent(), evt.getX(), evt.getY());

				} else if (jtKeyStore.getValueAt(row, 0).equals(KeyStoreTableModel.TRUST_CERT_ENTRY)) {

					jpmTrustedCertificate.show(evt.getComponent(), evt.getX(), evt.getY());

				} else if (jtKeyStore.getValueAt(row, 0).equals(KeyStoreTableModel.KEY_ENTRY)) {

					// For KeyStore types that support password protected entries...
					if (type.hasEntryPasswords()) {
						// Only allow unlocking from menu if entry is currently locked
						boolean locked = ((Boolean) jtKeyStore.getValueAt(row, 1)).booleanValue();
						unlockKeyAction.setEnabled(locked);
					}

					jpmKey.show(evt.getComponent(), evt.getX(), evt.getY());
				}
			} else {
				jpmKeyStore.show(evt.getComponent(), evt.getX(), evt.getY());
			}
		} else if (evt.getClickCount() > 1 && row == -1) {
			// double click on free space opens generate key pair dialog
			generateKeyPairAction.generateKeyPair();
		}

		// Selection changed - update edit controls
		updateCutCopyPasteControls();
	}

	private void initKeyStoreEntryPopupMenus() {
		jpmKeyPair = new JPopupMenu();

		jmKeyPairDetails = new JMenu(res.getString("KseFrame.jmKeyPairDetails.text"));
		jmKeyPairDetails.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(
				getClass().getResource(res.getString("KseFrame.jmKeyPairDetails.image")))));

		jmiKeyPairCertificateChainDetails = new JMenuItem(keyPairCertificateChainDetailsAction);
		jmiKeyPairCertificateChainDetails.setToolTipText(null);
		//new StatusBarChangeHandler(jmiKeyPairCertificateChainDetails,
		//		(String) keyPairCertificateChainDetailsAction.getValue(Action.LONG_DESCRIPTION), this);

		jmiKeyPairPrivateKeyDetails = new JMenuItem(keyPairPrivateKeyDetailsAction);
		jmiKeyPairPrivateKeyDetails.setToolTipText(null);
		//new StatusBarChangeHandler(jmiKeyPairPrivateKeyDetails,
		//		(String) keyPairPrivateKeyDetailsAction.getValue(Action.LONG_DESCRIPTION), this);

		jmiKeyPairPublicKeyDetails = new JMenuItem(keyPairPublicKeyDetailsAction);
		jmiKeyPairPublicKeyDetails.setToolTipText(null);
		//new StatusBarChangeHandler(jmiKeyPairPublicKeyDetails,
		//		(String) keyPairPublicKeyDetailsAction.getValue(Action.LONG_DESCRIPTION), this);

		jmiKeyPairCut = new JMenuItem(cutKeyPairAction);
		jmiKeyPairCut.setToolTipText(null);
		//new StatusBarChangeHandler(jmiKeyPairCut, (String) cutKeyPairAction.getValue(Action.LONG_DESCRIPTION), this);

		jmiKeyPairCopy = new JMenuItem(copyKeyPairAction);
		jmiKeyPairCopy.setToolTipText(null);
		//new StatusBarChangeHandler(jmiKeyPairCopy, (String) copyKeyPairAction.getValue(Action.LONG_DESCRIPTION), this);

		jmKeyPairExport = new JMenu(res.getString("KseFrame.jmKeyPairExport.text"));
		jmKeyPairExport.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(
				getClass().getResource(res.getString("KseFrame.jmKeyPairExport.image")))));

		jmiKeyPairExport = new JMenuItem(exportKeyPairAction);
		jmiKeyPairExport.setToolTipText(null);
		//new StatusBarChangeHandler(jmiKeyPairExport, (String) exportKeyPairAction.getValue(Action.LONG_DESCRIPTION),
		//		this);

		jmiKeyPairExportCertificateChain = new JMenuItem(exportKeyPairCertificateChainAction);
		jmiKeyPairExportCertificateChain.setToolTipText(null);
		//new StatusBarChangeHandler(jmiKeyPairExportCertificateChain,
		//		(String) exportKeyPairCertificateChainAction.getValue(Action.LONG_DESCRIPTION), this);

		jmiKeyPairExportPrivateKey = new JMenuItem(exportKeyPairPrivateKeyAction);
		jmiKeyPairExportPrivateKey.setToolTipText(null);
		//new StatusBarChangeHandler(jmiKeyPairExportPrivateKey,
		//		(String) exportKeyPairPrivateKeyAction.getValue(Action.LONG_DESCRIPTION), this);

		jmiKeyPairExportPublicKey = new JMenuItem(exportKeyPairPublicKeyAction);
		jmiKeyPairExportPublicKey.setToolTipText(null);
		//new StatusBarChangeHandler(jmiKeyPairExportPublicKey,
		//		(String) exportKeyPairPublicKeyAction.getValue(Action.LONG_DESCRIPTION), this);

		jmiKeyPairGenerateCsr = new JMenuItem(generateCsrAction);
		jmiKeyPairGenerateCsr.setToolTipText(null);
		//new StatusBarChangeHandler(jmiKeyPairGenerateCsr, (String) generateCsrAction.getValue(Action.LONG_DESCRIPTION),
		//		this);

		jmKeyPairImportCaReply = new JMenu(res.getString("KseFrame.jmKeyPairImportCaReply.text"));
		jmKeyPairImportCaReply.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(
				getClass().getResource(res.getString("KseFrame.jmKeyPairImportCaReply.image")))));

		jmiKeyPairImportCaReplyFile = new JMenuItem(importCaReplyFromFileAction);
		jmiKeyPairImportCaReplyFile.setToolTipText(null);
		//new StatusBarChangeHandler(jmiKeyPairImportCaReplyFile,
		//		(String) importCaReplyFromFileAction.getValue(Action.LONG_DESCRIPTION), this);

		jmiKeyPairImportCaReplyClipboard = new JMenuItem(importCaReplyFromClipboardAction);
		jmiKeyPairImportCaReplyClipboard.setToolTipText(null);
		//new StatusBarChangeHandler(jmiKeyPairImportCaReplyClipboard,
		//		(String) importCaReplyFromClipboardAction.getValue(Action.LONG_DESCRIPTION), this);

		jmKeyPairEditCertChain = new JMenu(res.getString("KseFrame.jmKeyPairEditCertChain.text"));
		jmKeyPairEditCertChain.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(
				getClass().getResource(res.getString("KseFrame.jmKeyPairEditCertChain.image")))));

		jmiKeyPairEditCertChainAppendCert = new JMenuItem(appendToCertificateChainAction);
		jmiKeyPairEditCertChainAppendCert.setToolTipText(null);
		//new StatusBarChangeHandler(jmiKeyPairEditCertChainAppendCert,
		//		(String) appendToCertificateChainAction.getValue(Action.LONG_DESCRIPTION), this);

		jmiKeyPairEditCertChainRemoveCert = new JMenuItem(removeFromCertificateChainAction);
		jmiKeyPairEditCertChainRemoveCert.setToolTipText(null);
		//new StatusBarChangeHandler(jmiKeyPairEditCertChainRemoveCert,
		//		(String) removeFromCertificateChainAction.getValue(Action.LONG_DESCRIPTION), this);

		jmKeyPairSign = new JMenu(res.getString("KseFrame.jmKeyPairSign.text"));
		jmKeyPairSign.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(
				getClass().getResource(res.getString("KseFrame.jmKeyPairSign.image")))));

		jmiKeyPairSignCsr = new JMenuItem(signCsrAction);
		jmiKeyPairSignCsr.setToolTipText(null);
		//new StatusBarChangeHandler(jmiKeyPairSignCsr, (String) signCsrAction.getValue(Action.LONG_DESCRIPTION), this);

		jmiKeyPairSignJar = new JMenuItem(signJarAction);
		jmiKeyPairSignJar.setToolTipText(null);
		//new StatusBarChangeHandler(jmiKeyPairSignJar, (String) signJarAction.getValue(Action.LONG_DESCRIPTION), this);

		jmiKeyPairSignMidlet = new JMenuItem(signMidletAction);
		jmiKeyPairSignMidlet.setToolTipText(null);
		//new StatusBarChangeHandler(jmiKeyPairSignMidlet, (String) signMidletAction.getValue(Action.LONG_DESCRIPTION),
		//		this);

		jmiKeyPairSignNewKeyPair = new JMenuItem(signNewKeyPairAction);
		jmiKeyPairSignNewKeyPair.setToolTipText(null);
		//new StatusBarChangeHandler(jmiKeyPairSignNewKeyPair,
		//		(String) signNewKeyPairAction.getValue(Action.LONG_DESCRIPTION), this);

		jmiKeyPairUnlock = new JMenuItem(unlockKeyPairAction);
		jmiKeyPairUnlock.setToolTipText(null);
		//new StatusBarChangeHandler(jmiKeyPairUnlock, (String) unlockKeyPairAction.getValue(Action.LONG_DESCRIPTION),
		//		this);

		jmiKeyPairSetPassword = new JMenuItem(setKeyPairPasswordAction);
		jmiKeyPairSetPassword.setToolTipText(null);
		//new StatusBarChangeHandler(jmiKeyPairSetPassword,
		//		(String) setKeyPairPasswordAction.getValue(Action.LONG_DESCRIPTION), this);

		jmiKeyPairDelete = new JMenuItem(deleteKeyPairAction);
		jmiKeyPairDelete.setToolTipText(null);
		//new StatusBarChangeHandler(jmiKeyPairDelete, (String) deleteKeyPairAction.getValue(Action.LONG_DESCRIPTION),
		//		this);

		jmiKeyPairRename = new JMenuItem(renameKeyPairAction);
		jmiKeyPairRename.setToolTipText(null);
		//new StatusBarChangeHandler(jmiKeyPairRename, (String) renameKeyPairAction.getValue(Action.LONG_DESCRIPTION),
		//		this);

		jpmKeyPair.add(jmKeyPairDetails);
		jmKeyPairDetails.add(jmiKeyPairCertificateChainDetails);
		jmKeyPairDetails.add(jmiKeyPairPrivateKeyDetails);
		jmKeyPairDetails.add(jmiKeyPairPublicKeyDetails);
		jpmKeyPair.addSeparator();
		jpmKeyPair.add(jmiKeyPairCut);
		jpmKeyPair.add(jmiKeyPairCopy);
		jpmKeyPair.addSeparator();
		jpmKeyPair.add(jmKeyPairExport);
		jmKeyPairExport.add(jmiKeyPairExport);
		jmKeyPairExport.add(jmiKeyPairExportCertificateChain);
		jmKeyPairExport.add(jmiKeyPairExportPrivateKey);
		jmKeyPairExport.add(jmiKeyPairExportPublicKey);
		jpmKeyPair.add(jmiKeyPairGenerateCsr);
		jpmKeyPair.add(jmKeyPairImportCaReply);
		jmKeyPairImportCaReply.add(jmiKeyPairImportCaReplyFile);
		jmKeyPairImportCaReply.add(jmiKeyPairImportCaReplyClipboard);
		jpmKeyPair.add(jmKeyPairEditCertChain);
		jmKeyPairEditCertChain.add(jmiKeyPairEditCertChainAppendCert);
		jmKeyPairEditCertChain.add(jmiKeyPairEditCertChainRemoveCert);
		jpmKeyPair.addSeparator();
		jpmKeyPair.add(jmKeyPairSign);
		jmKeyPairSign.add(jmiKeyPairSignNewKeyPair);
		jmKeyPairSign.add(jmiKeyPairSignCsr);
		jmKeyPairSign.add(jmiKeyPairSignJar);
		jmKeyPairSign.add(jmiKeyPairSignMidlet);
		jpmKeyPair.addSeparator();
		jpmKeyPair.add(jmiKeyPairUnlock);
		jpmKeyPair.add(jmiKeyPairSetPassword);
		jpmKeyPair.add(jmiKeyPairDelete);
		jpmKeyPair.add(jmiKeyPairRename);

		jpmTrustedCertificate = new JPopupMenu();

		jmTrustedCertificateDetails = new JMenu(res.getString("KseFrame.jmTrustedCertificateDetails.text"));
		jmTrustedCertificateDetails.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(
				getClass().getResource(res.getString("KseFrame.jmTrustedCertificateDetails.image")))));

		jmiTrustedCertificateDetails = new JMenuItem(trustedCertificateDetailsAction);
		jmiTrustedCertificateDetails.setToolTipText(null);
		//new StatusBarChangeHandler(jmiTrustedCertificateDetails,
		//		(String) trustedCertificateDetailsAction.getValue(Action.LONG_DESCRIPTION), this);

		jmiTrustedCertificatePublicKeyDetails = new JMenuItem(trustedCertificatePublicKeyDetailsAction);
		jmiTrustedCertificatePublicKeyDetails.setToolTipText(null);
		//new StatusBarChangeHandler(jmiTrustedCertificatePublicKeyDetails,
		//		(String) trustedCertificatePublicKeyDetailsAction.getValue(Action.LONG_DESCRIPTION), this);

		jmiTrustedCertificateCut = new JMenuItem(cutTrustedCertificateAction);
		jmiTrustedCertificateCut.setToolTipText(null);
		//new StatusBarChangeHandler(jmiTrustedCertificateCut,
		//		(String) cutTrustedCertificateAction.getValue(Action.LONG_DESCRIPTION), this);

		jmiTrustedCertificateCopy = new JMenuItem(copyTrustedCertificateAction);
		jmiTrustedCertificateCopy.setToolTipText(null);
		//new StatusBarChangeHandler(jmiTrustedCertificateCopy,
		//		(String) copyTrustedCertificateAction.getValue(Action.LONG_DESCRIPTION), this);

		jmTrustedCertificateExport = new JMenu(res.getString("KseFrame.jmTrustedCertificateExport.text"));
		jmTrustedCertificateExport.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(
				getClass().getResource(res.getString("KseFrame.jmTrustedCertificateExport.image")))));

		jmiTrustedCertificateExport = new JMenuItem(exportTrustedCertificateAction);
		jmiTrustedCertificateExport.setToolTipText(null);
		//new StatusBarChangeHandler(jmiTrustedCertificateExport,
		//		(String) exportTrustedCertificateAction.getValue(Action.LONG_DESCRIPTION), this);

		jmiTrustedCertificateExportPublicKey = new JMenuItem(exportTrustedCertificatePublicKeyAction);
		jmiTrustedCertificateExportPublicKey.setToolTipText(null);
		//new StatusBarChangeHandler(jmiTrustedCertificateExportPublicKey,
		//		(String) exportTrustedCertificatePublicKeyAction.getValue(Action.LONG_DESCRIPTION), this);

		jmiTrustedCertificateDelete = new JMenuItem(deleteTrustedCertificateAction);
		jmiTrustedCertificateDelete.setToolTipText(null);
		//new StatusBarChangeHandler(jmiTrustedCertificateDelete,
		//		(String) deleteTrustedCertificateAction.getValue(Action.LONG_DESCRIPTION), this);

		jmiTrustedCertificateRename = new JMenuItem(renameTrustedCertificateAction);
		jmiTrustedCertificateRename.setToolTipText(null);
		//new StatusBarChangeHandler(jmiTrustedCertificateRename,
		//		(String) renameTrustedCertificateAction.getValue(Action.LONG_DESCRIPTION), this);

		jpmTrustedCertificate.add(jmTrustedCertificateDetails);
		jmTrustedCertificateDetails.add(jmiTrustedCertificateDetails);
		jmTrustedCertificateDetails.add(jmiTrustedCertificatePublicKeyDetails);
		jpmTrustedCertificate.addSeparator();
		jpmTrustedCertificate.add(jmiTrustedCertificateCut);
		jpmTrustedCertificate.add(jmiTrustedCertificateCopy);
		jpmTrustedCertificate.addSeparator();
		jpmTrustedCertificate.add(jmTrustedCertificateExport);
		jmTrustedCertificateExport.add(jmiTrustedCertificateExport);
		jmTrustedCertificateExport.add(jmiTrustedCertificateExportPublicKey);
		jpmTrustedCertificate.addSeparator();
		jpmTrustedCertificate.add(jmiTrustedCertificateDelete);
		jpmTrustedCertificate.add(jmiTrustedCertificateRename);

		jpmKey = new JPopupMenu();

		jmiKeyDetails = new JMenuItem(keyDetailsAction);
		jmiKeyDetails.setToolTipText(null);
		//new StatusBarChangeHandler(jmiKeyDetails, (String) keyDetailsAction.getValue(Action.LONG_DESCRIPTION), this);

		jmiKeyUnlock = new JMenuItem(unlockKeyAction);
		jmiKeyUnlock.setToolTipText(null);
		//new StatusBarChangeHandler(jmiKeyUnlock, (String) unlockKeyAction.getValue(Action.LONG_DESCRIPTION), this);

		jmiKeySetPassword = new JMenuItem(setKeyPasswordAction);
		jmiKeySetPassword.setToolTipText(null);
		//new StatusBarChangeHandler(jmiKeySetPassword, (String) setKeyPasswordAction.getValue(Action.LONG_DESCRIPTION), this);

		jmiKeyDelete = new JMenuItem(deleteKeyAction);
		jmiKeyDelete.setToolTipText(null);
		//new StatusBarChangeHandler(jmiKeyDelete, (String) deleteKeyAction.getValue(Action.LONG_DESCRIPTION), this);

		jmiKeyRename = new JMenuItem(renameKeyAction);
		jmiKeyRename.setToolTipText(null);
		//new StatusBarChangeHandler(jmiKeyRename, (String) renameKeyAction.getValue(Action.LONG_DESCRIPTION), this);

		jpmKey.add(jmiKeyDetails);
		jpmKey.addSeparator();
		jpmKey.add(jmiKeyUnlock);
		jpmKey.add(jmiKeySetPassword);
		jpmKey.add(jmiKeyDelete);
		jpmKey.add(jmiKeyRename);
	}

	private void updateCutCopyPasteControls() {
		// Can cut and copy if a KeyStore entry is selected
		boolean cutAndCopyEnabled = getActiveKeyStoreTable().getSelectedRow() != -1;
		cutAction.setEnabled(cutAndCopyEnabled);
		cutKeyPairAction.setEnabled(cutAndCopyEnabled);
		cutTrustedCertificateAction.setEnabled(cutAndCopyEnabled);
		copyAction.setEnabled(cutAndCopyEnabled);
		copyKeyPairAction.setEnabled(cutAndCopyEnabled);
		copyTrustedCertificateAction.setEnabled(cutAndCopyEnabled);

		// Can paste if anything is in buffer
		pasteAction.setEnabled(Buffer.isPopulated());
	}
	public String getApplicationName() {
		//return props.getString("KSE.Name");
		return "x";
	}
	/**
	 * Focus on the supplied KeyStore.
	 *
	 * @param keyStore
	 *            KeyStore
	 */
	public void focusOnKeyStore(KeyStore keyStore) {
		int index = findKeyStoreIndex(keyStore);

		if (index >= 0) {
			jkstpKeyStores.setSelectedIndex(index);
		}
	}

	/**
	 * Find the supplied KeyStore in the set of loaded KeyStores.
	 *
	 * @param keyStore
	 *            KeyStore to find
	 * @return The KeyStore's index
	 */
	public int findKeyStoreIndex(KeyStore keyStore) {
		for (int i = 0; i < histories.size(); i++) {
			if (keyStore.equals(histories.get(i).getCurrentState().getKeyStore())) {
				return i;
			}
		}

		return -1;
	}
	/**
	 * Add a file to the top of the recently opened files.
	 *
	 * @param recentFile
	 *            Recent file
	 */
	public void addRecentFile(File recentFile) {
		jmrfRecentFiles.add(createRecentFileMenuItem(jmrfRecentFiles, recentFile));
	}

	private JMenuItemRecentFile createRecentFileMenuItem(JMenuRecentFiles jmRecentFiles, File recentFile) {
		JMenuItemRecentFile jmirfNew = new JMenuItemRecentFile(jmRecentFiles, recentFile);
		jmirfNew.addActionListener(new RecentKeyStoreFileActionListener(recentFile, this));

		//        new StatusBarChangeHandler(jmirfNew, MessageFormat.format(res.getString("KseFrame.recentfile.statusbar"),
		//                        recentFile), this);
		return jmirfNew;
	}
	/**
	 * Get frame's size and position. Used to get size on exit.
	 *
	 * @param keyStoresClosed
	 *            Were all KeyStores closed on exit?
	 * @return Size and position
	 */
	public Rectangle getSizeAndPosition(boolean keyStoresClosed) {
		Rectangle sizeAndPosition = new Rectangle();

		if (keyStoresClosed) {
			sizeAndPosition.width = jkstpKeyStores.getWidth();
			sizeAndPosition.height = jkstpKeyStores.getHeight();
		} else {
			sizeAndPosition.width = jQuickStart.getWidth();
			sizeAndPosition.height = jQuickStart.getHeight();
		}

		sizeAndPosition.x = getContainer().getFrame().getX();
		sizeAndPosition.y = getContainer().getFrame().getY();

		return sizeAndPosition;
	}
    /**
     * Removed the supplied KeyStore from the set of loaded KeyStores.
     *
     * @param keyStore
     *            KeyStore
     */
    public void removeKeyStore(KeyStore keyStore) {
            int index = findKeyStoreIndex(keyStore);

            if (index >= 0) {
                    keyStoreTables.remove(index);
                    histories.remove(index).nullPasswords();
                    jkstpKeyStores.remove(index);
            }
    }
	
    /**
     * Get recently opened files.
     *
     * @return Recently opened files
     */
    public File[] getRecentFiles() {
            return jmrfRecentFiles.getRecentFiles();
    }
    
    /**
     * If the status bar is currently displayed hide it and vice versa.
     */
    public void showHideStatusBar() {
            Container contentPane = getContainer().getFrame().getContentPane();
            boolean statusBarShown = false;
            for (int i = 0; i < contentPane.getComponentCount(); i++) {
                    if (contentPane.getComponent(i).equals(jlStatusBar)) {
                            statusBarShown = true;
                            break;
                    }
            }

            if (statusBarShown) {
            		getContainer().getFrame().getContentPane().remove(jlStatusBar);
                    applicationSettings.setShowStatusBar(false);
            } else {
            		getContainer().getFrame().getContentPane().add(jlStatusBar, BorderLayout.SOUTH);
                    applicationSettings.setShowStatusBar(true);
            }
    }
    
    /**
     * If the tool bar is currently displayed hide it and vice versa.
     */
    public void showHideToolBar() {
            Container contentPane = getContainer().getFrame().getContentPane();
            boolean toolBarShown = false;
            for (int i = 0; i < contentPane.getComponentCount(); i++) {
                    if (contentPane.getComponent(i).equals(jtbToolBar)) {
                            toolBarShown = true;
                            break;
                    }
            }

            if (toolBarShown) {
            	getContainer().getFrame().getContentPane().remove(jtbToolBar);
            	applicationSettings.setShowToolBar(false);
            } else {
            	getContainer().getFrame().getContentPane().add(jtbToolBar, BorderLayout.NORTH);
            	applicationSettings.setShowToolBar(true);
            }
    }
    /**
     * Set tab layout policy - must be one of JTabbedPane.WRAP_TAB_LAYOUT or
     * JTabbedPane.SCROLL_TAB_LAYOUT to take effect.
     *
     * @param tabLayoutPolicy
     *            Tab layout policy
     */
    public void setKeyStoreTabLayoutPolicy(int tabLayoutPolicy) {
            if (tabLayoutPolicy == JTabbedPane.WRAP_TAB_LAYOUT || tabLayoutPolicy == JTabbedPane.SCROLL_TAB_LAYOUT) {
                    jkstpKeyStores.setTabLayoutPolicy(tabLayoutPolicy);
                    applicationSettings.setTabLayout(tabLayoutPolicy);
            }
    }
}