package org.xendra.ruleeditor.wizard.exportsession;

import java.lang.reflect.Method;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

import org.columba.core.gui.base.MultiLineLabel;
import org.compiere.model.persistence.X_AD_Rule;
import org.jdom.Element;
import org.xendra.ruleeditor.folder.AbstractFolder;
import org.xendra.ruleeditor.gui.tree.RuleEditorTreeModel;
import org.xendra.ruleeditor.util.ResourceLoader;
import org.xendra.swing.JCheckBoxTree;
import org.xendra.swing.JCheckBoxTree.CheckChangeEvent;

import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;
import net.miginfocom.swing.MigLayout;

public class ExportSessionPick extends AbstractStep {
	protected DataModel data;
	protected JCheckBoxTree tree;
	protected AbstractFolder f;
	public ExportSessionPick(DataModel data, AbstractFolder f) {		
		super(ResourceLoader.getString("dialog", "exportsessionwizard", "pick"),
				ResourceLoader.getString("dialog", "exportsessionwizard",   "pick_description"));		
		this.data = data;		
		this.f = f;
		setCanGoNext(true);
	}

	@Override
	protected JComponent createComponent() {
		JComponent component = new JPanel();
		component.setLayout(new BoxLayout(component, BoxLayout.Y_AXIS));
		component.add(new MultiLineLabel(ResourceLoader.getString("dialog", "exportsessionwizard", "pick_text")));
		component.add(Box.createVerticalStrut(40));
		JPanel mainPanel = new JPanel(new MigLayout("fill"));						
		AbstractFolder root = new AbstractFolder(new Element("root"));
		root.add(f);
		RuleEditorTreeModel model = new RuleEditorTreeModel(root);
		tree = new JCheckBoxTree();
		tree.setModel(model);				
		((DefaultTreeModel)tree.getModel()).reload();
		mainPanel.add(new JScrollPane(tree), "grow");				
		tree.addCheckChangeEventListener(new JCheckBoxTree.CheckChangeEventListener() {								
			public void checkStateChanged(CheckChangeEvent event) {				
				TreePath[] paths = tree.getCheckedPaths();
				for (TreePath tp : paths) {
					for (Object pathPart : tp.getPath()) {
						System.out.print(pathPart + ",");
					}                   
				}
			}
		});	
		Method method = null;
		try {
			method = tree.getClass().getMethod("getCheckedPaths", null);
		} catch (NoSuchMethodException nsme) {}
		data.registerDataLookup(X_AD_Rule.COLUMNNAME_Lockout,new DefaultDataLookup(tree, method, null));     

		//		X_AD_Plugin plugin = new Query(Env.getCtx(), X_AD_Plugin.Table_Name, "AD_Plugin_ID = ?", null)
		//		.setParameters(m_pluginid).first();
		//		if (plugin != null) {
		//			String type = "plugin";
		//			XmlElement xmlgroup = new XmlElement(type);
		//			xmlgroup.addAttribute("uid", String.valueOf(plugin.getAD_Plugin_ID()));
		//			xmlgroup.addAttribute("name", plugin.getName());
		//			FolderItem item = new FolderItem(xmlgroup);			
		//			Object[] args = { item };
		//			IExtensionHandler handler = null;
		//			try {
		//				handler = PluginManager.getInstance().getExtensionHandler(IExtensionHandlerKeys.ORG_XENDRA_RULEEDITOR_FOLDER);
		//			} catch (PluginHandlerNotFoundException ex) {
		//				ErrorDialog.createDialog(ex.getMessage(),  ex);
		//			}			
		//			AbstractFolder folder = null;			
		//			try {
		//				IExtension extension = handler.getExtension(type);
		//				folder = (AbstractFolder) extension.instanciateExtension(args);				
		//				RuleEditorTreeModel model = new RuleEditorTreeModel(folder);
		//				tree = new JCheckBoxTree();
		//				tree.setModel(model);				
		//				((DefaultTreeModel)tree.getModel()).reload();
		//				mainPanel.add(new JScrollPane(tree), "grow");				
		//			} catch (Exception e) {
		//				e.printStackTrace();
		//			}
		//			tree.addCheckChangeEventListener(new JCheckBoxTree.CheckChangeEventListener() {								
		//				public void checkStateChanged(CheckChangeEvent event) {				
		//					TreePath[] paths = tree.getCheckedPaths();
		//					for (TreePath tp : paths) {
		//						for (Object pathPart : tp.getPath()) {
		//							System.out.print(pathPart + ",");
		//						}                   
		//					}
		//				}
		//			});	
		//			Method method = null;
		//			try {
		//				method = tree.getClass().getMethod("getCheckedPaths", null);
		//			} catch (NoSuchMethodException nsme) {}
		//			data.registerDataLookup(X_AD_Rule.COLUMNNAME_Lockout,new DefaultDataLookup(tree, method, null));        			
		//		}					
		//
		component.add(mainPanel);
		return component;
	}
	public void prepareRendering() {
	}
}
