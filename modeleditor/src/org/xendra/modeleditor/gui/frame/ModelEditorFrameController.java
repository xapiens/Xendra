package org.xendra.modeleditor.gui.frame;

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
import org.xendra.modeleditor.folder.AbstractFolder;
import org.xendra.modeleditor.gui.modeleditor.ModelEditor;
import org.xendra.modeleditor.gui.propertysheet.PropertySheetPage;
import org.xendra.modeleditor.gui.tree.TreeController;
import org.xendra.modeleditor.util.ResourceLoader;
import org.xendra.modeleditor.gui.frame.ModelEditorFrameMediator;

import com.mxgraph.swing.mxGraphOutline;

public class ModelEditorFrameController extends DockFrameController implements
	ModelEditorFrameMediator, TreeSelectionListener {
	protected TreeController tree;
	protected PropertySheetPage propertysheet;
	private ModelEditor modeleditor;
	protected mxGraphOutline zoomeditor;
	private IDockable treePanel;
	private IDockable propertysheetPanel;
	private IDockable editorPanel;
	private JSplitPane inner;
	public ModelEditorFrameController(View viewItem) {
		super(viewItem);
		tree = new TreeController(this);
		propertysheet = new PropertySheetPage();
		modeleditor = new ModelEditor();
		modeleditor.setPropertyEditor(propertysheet);
		modeleditor.setTreeController(tree);
		modeleditor.setGraphComponent();
		tree.getView().addTreeSelectionListener(this);
		tree.getView().addTreeSelectionListener(modeleditor);
		tree.getView().addTreeSelectionListener(propertysheet);		
		tree.getView().addMouseListener(new TreeMouseListener());
		JScrollPane treeScrollPane = new JScrollPane(tree.getView());
		treeScrollPane.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));		
		zoomeditor = new mxGraphOutline(modeleditor.getGraphComponent());
		inner = new JSplitPane(JSplitPane.VERTICAL_SPLIT, treeScrollPane, zoomeditor);
		inner.setDividerLocation(320);
		inner.setResizeWeight(1);
		inner.setDividerSize(6);
		inner.setBorder(null);	
		tree.createPopupMenu();
		registerDockables();
	}
	private void registerDockables() {	
		treePanel = registerDockable("modeleditor_foldertree", ResourceLoader.getString("global", "dockable_foldertree"), inner, null);
		editorPanel = registerDockable("modeleditor", ResourceLoader.getString("global", "editor"), modeleditor, null);
		propertysheetPanel = registerDockable("propertysheetpanel", ResourceLoader.getString("global","docable_prop"), propertysheet, null);
	}

	public void loadDefaultPosition() {
		super.dock(editorPanel, IDock.REGION.WEST);
		super.dock(treePanel, IDock.REGION.WEST);		
		//super.dock(treePanel, IDock.REGION.WEST, 0.3f);
		super.dock(propertysheetPanel, IDock.REGION.EAST);
	}

	@Override
	public void valueChanged(TreeSelectionEvent e) {
		TreePath p = e.getPath();
		if (p == null)
			return;
		AbstractFolder selectedFolder = (AbstractFolder) p.getLastPathComponent();
		if (selectedFolder != null) {
			fireTitleChanged(selectedFolder.getName());			
			selectedFolder.loadChildren();
		}
	}
	
	public void extendMenu(IContainer container) {
		try {
			InputStream is = DiskIO.getResourceStream("org/xendra/modeleditor/action/menu.xml");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void extendToolBar(IContainer container) {
		try {
			//MConfig config = MConfig.getbyIdentifier("xendra","modeleditor","main_toolbar");
			MConfig config = MConfig.getbyIdentifier("org.xendra.modeleditor","main_toolbar");
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
	public ModelEditor GetEditor() { 
			return modeleditor; 
	}
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
					tree.getPopupMenu().show(event.getComponent(), event.getX(), event.getY());
					isTreePopupEvent = false;
				}
			});
		}
	}
	public void loadPositions() {		
		super.loadPositions("org.xendra.modeleditor");		
	}
}
