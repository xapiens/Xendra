package org.xendra.mfe.wizard.newFields;

import java.lang.reflect.Method;
import java.util.List;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;
import net.miginfocom.swing.MigLayout;

import org.columba.core.gui.base.MultiLineLabel;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Column;
import org.compiere.model.persistence.X_AD_Rule;
import org.compiere.model.persistence.X_AD_Table;
import org.compiere.util.Env;
import org.jdom.Element;
import org.xendra.mfe.util.ResourceLoader;
import org.xendra.mfe.wizard.newFields.JCheckBoxTree.CheckChangeEvent;
import org.xendra.model.AbstractFolder;


public class NewFields extends AbstractStep {
	private DataModel data;
	protected JCheckBoxTree tree;
	public NewFields(DataModel data) {
		super(ResourceLoader.getString("dialog", "newfieldwizard", "identity"),
				ResourceLoader.getString("dialog", "newfieldwizard",   "identity_description"));
		this.data = data;		
		setCanGoNext(true);				
	}
	@Override
	protected JComponent createComponent() {
		JComponent component = new JPanel();
		component.setLayout(new BoxLayout(component, BoxLayout.Y_AXIS));
		component.add(new MultiLineLabel(ResourceLoader.getString("dialog", "exportsessionwizard", "pick_text")));
		component.add(Box.createVerticalStrut(40));
		JPanel mainPanel = new JPanel(new MigLayout("fill"));		
		Element xmlgroup = new Element("root");
		xmlgroup.setAttribute("uid", "");
		xmlgroup.setAttribute("name", "root");
		AbstractFolder root = new AbstractFolder(xmlgroup);
		List<X_AD_Table> tables = new Query(Env.getCtx(), X_AD_Table.Table_Name, "IsActive = 'Y' AND IsView = 'N'", null).setOrderBy("TableName").list();		
		for (X_AD_Table table:tables) {
			Element t = new Element("table");
			t.setAttribute("uid", String.valueOf(table.getAD_Table_ID()));
			t.setAttribute("name", table.getName());
			AbstractFolder tbl = new AbstractFolder(t);
			tbl.setName(table.getTableName());
			List<X_AD_Column> columns = new Query(Env.getCtx(), X_AD_Column.Table_Name, "AD_Table_ID = ? AND NOT IsInternal", null)
				.setParameters(table.getAD_Table_ID()).setOrderBy(X_AD_Column.COLUMNNAME_ColumnName).list();
			for (X_AD_Column column:columns) {
				Element c = new Element("column");
				c.setAttribute("uid", String.valueOf(column.getAD_Column_ID()));
				c.setAttribute("name", column.getColumnName());
				AbstractFolder col = new AbstractFolder(c);
				col.setName(column.getColumnName());
				tbl.add(col);
			}
			root.add(tbl);
		}
		DefaultTreeModel model = new DefaultTreeModel(root);
		tree = new JCheckBoxTree();
		tree.setModel(model);				
		((DefaultTreeModel)tree.getModel()).reload();
		mainPanel.add(new JScrollPane(tree), "grow");				
		tree.addCheckChangeEventListener(new JCheckBoxTree.CheckChangeEventListener() {								
			public void checkStateChanged(CheckChangeEvent event) {				
				TreePath[] paths = tree.getCheckedPaths();
//				for (TreePath tp : paths) {
//					for (Object pathPart : tp.getPath()) {
//						AbstractFolder f = (AbstractFolder) pathPart;
//					}                   
//				}
			}
		});	
		Method method = null;
		try {
			method = tree.getClass().getMethod("getCheckedPaths", null);
		} catch (NoSuchMethodException nsme) {}
		data.registerDataLookup(X_AD_Rule.COLUMNNAME_Lockout,new DefaultDataLookup(tree, method, null));        						
		component.add(mainPanel);
		return component;
	}
	public void prepareRendering() {
	}
}
