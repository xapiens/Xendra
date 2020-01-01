package org.xendra.ruleeditor.gui.frame;

import java.awt.BorderLayout;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
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
import org.xendra.ruleeditor.compile.CompileLog;
import org.xendra.ruleeditor.folder.RuleEditorTreeNode;
import org.xendra.ruleeditor.gui.codeeditor.DroolsEditor;
import org.xendra.ruleeditor.gui.propertysheet.PropertySheetPage;
import org.xendra.ruleeditor.gui.tree.TreeController;
import org.xendra.ruleeditor.util.ResourceLoader;

public class RuleEditorFrameController extends DockFrameController implements
	RuleEditorFrameMediator, TreeSelectionListener {
	protected TreeController tree;
	protected PropertySheetPage propertysheet;
	private DroolsEditor droolseditor;
	private CompileLog compilelog; 
	private IDockable treePanel;
	private IDockable propertysheetPanel;
	private IDockable editorPanel;
	private IDockable messagePanel;
	
	public RuleEditorFrameController(View view) {
		super(view);
		tree = new TreeController(this);
		propertysheet = new PropertySheetPage();
		droolseditor = new DroolsEditor(this);
		tree.getView().addTreeSelectionListener(this);
		tree.getView().addTreeSelectionListener(droolseditor);
		tree.getView().addTreeSelectionListener(propertysheet);
		tree.getView().addMouseListener(new TreeMouseListener());
		compilelog = new CompileLog();
		registerDockables();
		tree.createPopupMenu();
	}
	private void registerDockables() {
		JScrollPane treeScrollPane = new JScrollPane(tree.getView());
		treeScrollPane.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
		treePanel = registerDockable("ruleeditor_foldertree", ResourceLoader.getString("global", "dockable_foldertree"), treeScrollPane, null);
		JPanel p = new JPanel();
		p.setLayout(new BorderLayout());
		editorPanel = registerDockable("drooleditor", ResourceLoader.getString("global", "editor"), droolseditor, null);
		propertysheetPanel = registerDockable("propertysheetpanel", ResourceLoader.getString("global","docable_prop"), propertysheet, null);
		messagePanel = registerDockable("compilelog", ResourceLoader.getString("global", "console"), compilelog, null);
	}

	public void loadDefaultPosition() {
		super.dock(editorPanel, IDock.REGION.CENTER);					
		super.dock(treePanel, editorPanel, IDock.REGION.WEST, 0.3f);
		super.dock(propertysheetPanel, IDock.REGION.EAST);
		super.dock(messagePanel, IDock.REGION.SOUTH);
		super.setSplitProportion(messagePanel, 0.90f);
	}

	@Override
	public void valueChanged(TreeSelectionEvent e) {
		RuleEditorTreeNode selectedFolder = (RuleEditorTreeNode) e.getPath().getLastPathComponent();
		if (selectedFolder != null) {
			fireTitleChanged(selectedFolder.getName());
		}
	}
	
	public void extendMenu(IContainer container) {
		try {			
			InputStream is = DiskIO.getResourceStream("org/xendra/ruleeditor/action/menu.xml");			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void extendToolBar(IContainer container) {
		try {
			MConfig config = MConfig.getbyIdentifier("org.xendra.ruleeditor","main_toolbar");
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
	public DroolsEditor GetEditor() { 
			return droolseditor; 
	}
	public CompileLog GetCompileLog() {
		return compilelog;
	}
	public PropertySheetPage getProperties() {
		return propertysheet;
	}
	public void addTreeSelectionListener(TreeSelectionListener listener) {
		getTree().getView().addTreeSelectionListener(listener);
	}
	public String getString(String sPath, String sName, String sID) {
		return ResourceLoader.getString(sPath, sName, sID);
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
		super.loadPositions("org.xendra.ruleeditor");		
	}			
}
