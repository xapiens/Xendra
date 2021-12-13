package org.xendra.pfe.gui.frame;

import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.swing.BorderFactory;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.SwingUtilities;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.TreePath;

import org.columba.api.gui.frame.IContainer;
import org.columba.api.gui.frame.IDock;
import org.columba.api.gui.frame.IDockable;
import org.columba.core.config.View;
import org.columba.core.gui.frame.DockFrameController;
import org.columba.core.io.DiskIO;
import org.compiere.model.MConfig;
import org.xendra.model.AbstractFolder;
import org.xendra.pfe.gui.formateditor.NewEditor;
import org.xendra.pfe.gui.propertysheet.PropertySheetPage;
import org.xendra.pfe.gui.tree.TreeController;
import org.xendra.pfe.util.ResourceLoader;

public class PFEFrameController extends DockFrameController implements TreeSelectionListener {
	protected TreeController tree;
	protected PropertySheetPage propertysheet;
	//protected FormatEditor editor;
	protected NewEditor editor;
	private IDockable treePanel;
	private IDockable editorPanel;
	private IDockable propertysheetPanel;
	//private IDockable textpreviewPanel;
	private JSplitPane inner;	
	private JSplitPane inner2;
	public PFEFrameController(View viewItem) {
		super(viewItem);
		tree = new TreeController(this);
		propertysheet = new PropertySheetPage();
		editor = new NewEditor(this);		 
		tree.getView().addTreeSelectionListener(this);
		tree.getView().addTreeSelectionListener(editor);
		tree.getView().addTreeSelectionListener(propertysheet);
		tree.getView().addMouseListener(new TreeMouseListener());
		JScrollPane treeScrollPane = new JScrollPane(tree.getView());
		treeScrollPane.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
		//inner = new JSplitPane(JSplitPane.VERTICAL_SPLIT, treeScrollPane, preview);
		inner = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, treeScrollPane, editor);
		//inner2 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, preview, editor);
		//inner2.setDividerLocation(300);
		//inner = new JSplitPane(JSplitPane.VERTICAL_SPLIT, treeScrollPane, inner2);
		inner.setDividerLocation(320);
		inner.setResizeWeight(1);
		inner.setDividerSize(6);
		inner.setBorder(null);			
		//tree.createPopupMenu();
		registerDockables();		
	}

	private void registerDockables() {	
		//treePanel = registerDockable("pfe_foldertree", ResourceLoader.getString("global", "dockable_foldertree"), tree.getView(), null);
		//textpreviewPanel = registerDockable("preview", ResourceLoader.getString("global", "preview"), preview, null);
		treePanel = registerDockable("pfe_foldertree", ResourceLoader.getString("global",  "dockable_foldertree"), inner, null);
		//editorPanel = registerDockable("pfe_editor", ResourceLoader.getString("global", "dockable_formateditor"), editor, null); 
		propertysheetPanel = registerDockable("propertysheetpanel", ResourceLoader.getString("global","docable_prop"), propertysheet, null);
	}

	public void loadDefaultPosition() {
		//super.dock(textpreviewPanel, IDock.REGION.CENTER);					
		//super.dock(treePanel, editorPanel, IDock.REGION.WEST, 0.3f);
		//super.dock(treePanel, IDock.REGION.WEST, 0.3f);
//		super.dock(treePanel, IDock.REGION.WEST);
		//super.dock(editorPanel, IDock.REGION.EAST);
//		super.dock(propertysheetPanel, IDock.REGION.EAST);
		super.dock(treePanel, IDock.REGION.WEST);
		super.dock(propertysheetPanel , IDock.REGION.EAST);		
		//super.dock(propertysheetPanel, editorPanel, IDock.REGION.WEST, 0.3f);
		//super.setSplitProportion(editorPanel, 0.3f);
		//super.setSplitProportion(propertysheetPanel, 0.3f);

	}

	public void valueChanged(TreeSelectionEvent arg0) {
		AbstractFolder selectedFolder = (AbstractFolder) arg0.getPath().getLastPathComponent();
		if (selectedFolder != null) {
			fireTitleChanged(selectedFolder.getName());
		}
	}	
	public void extendMenu(IContainer container) {
		try {
			InputStream is = DiskIO.getResourceStream("org/xendra/pfe/action/menu.xml");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void extendToolBar(IContainer container) {
		try {
			MConfig config = MConfig.getbyIdentifier("org.xendra.pfe","main_toolbar");
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
	//	public CompileLog GetCompileLog() {
	//		return compilelog;
	//	}
	public void addTreeSelectionListener(TreeSelectionListener listener) {
		getTree().getView().addTreeSelectionListener(listener);
	}
	public String getString(String sPath, String sName, String sID) {
		return ResourceLoader.getString(sPath, sName, sID);
	}

	class TreeMouseListener extends MouseAdapter {
		private boolean isTreePopupEvent;

		/**
		 * @see java.awt.event.MouseAdapter#mousePressed(java.awt.event.MouseEvent)
		 */
		public void mousePressed(MouseEvent event) {
			if (event.isPopupTrigger()) {
				processPopup(event);
			}
		}

		/**
		 * @see java.awt.event.MouseAdapter#mouseReleased(java.awt.event.MouseEvent)
		 */
		public void mouseReleased(MouseEvent event) {
			if (event.isPopupTrigger()) {
				processPopup(event);
			}
		}

		/**
		 * @see java.awt.event.MouseAdapter#mouseClicked(java.awt.event.MouseEvent)
		 */
		public void mouseClicked(MouseEvent event) {
			// if mouse button was pressed twice times
			if (event.getClickCount() == 2) {
				// get selected row

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
		super.loadPositions("org.xendra.pfe");		
	}

	public NewEditor GetEditor() {		
		return editor;
	}
	public PropertySheetPage PropertySheetPage() {
		return propertysheet;
	}
}
