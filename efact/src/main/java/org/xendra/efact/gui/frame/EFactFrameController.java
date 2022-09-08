package org.xendra.efact.gui.frame;

import java.awt.BorderLayout;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.Security;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.TreePath;

import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.columba.api.gui.frame.IContainer;
import org.columba.api.gui.frame.IDock;
import org.columba.api.gui.frame.IDockable;
import org.columba.core.config.View;
import org.columba.core.gui.frame.DockFrameController;
import org.columba.core.io.DiskIO;
import org.compiere.model.MConfig;
import org.xendra.core.resourceloader.ResourceLoader;
import org.xendra.efact.folder.EFactTreeNode;
import org.xendra.efact.gui.propertysheet.PropertySheetPage;
import org.xendra.efact.gui.tree.TreeController;
import org.xendra.efact.taxdeclared.TaxDeclaredPanel;

public class EFactFrameController extends DockFrameController implements
	EFactFrameMediator, TreeSelectionListener {
	protected TreeController tree;
	protected TaxDeclaredPanel declared;
	protected PropertySheetPage propertysheet;
	private IDockable treePanel;
	private IDockable propertysheetPanel;
	private IDockable declaredPanel;
	
	public EFactFrameController(View view) {
		super(view);
		tree = new TreeController(this);
		declared = new TaxDeclaredPanel(this);		
		propertysheet = new PropertySheetPage();
		tree.getView().addTreeSelectionListener(this);
		tree.getView().addMouseListener(new TreeMouseListener());
		tree.getView().addTreeSelectionListener(propertysheet);
		Security.addProvider(new BouncyCastleProvider());
		registerDockables();
		tree.createPopupMenu();
	}
	private void registerDockables() {
		JScrollPane treeScrollPane = new JScrollPane(tree.getView());
		treeScrollPane.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
		treePanel = registerDockable("efact_foldertree", ResourceLoader.getString("global", "dockable_foldertree"), treeScrollPane, null);
		declaredPanel = registerDockable("declare", ResourceLoader.getString("global", "declared"), declared, null);
		propertysheetPanel = registerDockable("propertysheetpanel", ResourceLoader.getString("global","docable_prop"), propertysheet, null);
	}

	public void loadDefaultPosition() {
		super.dock(declaredPanel, IDock.REGION.CENTER);
		super.dock(treePanel, declaredPanel, IDock.REGION.WEST, 0.3f);
		super.dock(propertysheetPanel, IDock.REGION.EAST);
	}

	@Override
	public void valueChanged(TreeSelectionEvent e) {
		EFactTreeNode selectedFolder = (EFactTreeNode) e.getPath().getLastPathComponent();
		if (selectedFolder != null) {
			fireTitleChanged(selectedFolder.getName());
		}
	}
	
	public void extendMenu(IContainer container) {
		try {			
			InputStream is = DiskIO.getResourceStream("org/xendra/efact/action/menu.xml");			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void extendToolBar(IContainer container) {
		try {
			MConfig config = MConfig.getbyIdentifier("org.xendra.efact","main_toolbar");
			InputStream is2 = new ByteArrayInputStream(config.getContent().getBytes());
			container.extendToolbar(this, is2);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	public TreeController getTree()   {		
		return tree;	
	}
	public PropertySheetPage getProperties() {
		return propertysheet;
	}	
	public void addTreeSelectionListener(TreeSelectionListener listener) {
		getTree().getView().addTreeSelectionListener(listener);
	}
	public String getString(String sPath, String sName, String sID) {
		//return ResourceLoader.getString(sPath, sName, sID);
		return "";
	}
	class TreeMouseListener extends MouseAdapter {
		private boolean isTreePopupEvent;
		public void mousePressed(MouseEvent event) {
			if (event.isPopupTrigger()) {
				processPopup(event);
			}
		}
		public void mouseReleased(MouseEvent event) {
			if (event.isPopupTrigger()) {
				processPopup(event);
			}
		}
		public void mouseClicked(MouseEvent event) {
			if (event.getClickCount() == 2) {
				
			}
		}
		
		protected void processPopup(final MouseEvent event) {
			isTreePopupEvent = true;
			Point point = event.getPoint();
			TreePath path = tree.getView().getClosestPathForLocation(point.x, point.y);
			tree.getView().setSelectionPath(path);
			SwingUtilities.invokeLater(new Runnable() {
				public void run() {
					tree.getPopupMenu(event.getComponent()).show(event.getComponent(), event.getX(), event.getY());
					isTreePopupEvent = false;
				}
			});
		}
	}
	public void loadPositions() {		
		super.loadPositions("org.xendra.efact");		
	}			
}
