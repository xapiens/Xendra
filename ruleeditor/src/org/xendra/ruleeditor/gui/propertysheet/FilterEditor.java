package org.xendra.ruleeditor.gui.propertysheet;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import com.l2fprod.common.beans.editor.AbstractPropertyEditor;
import com.l2fprod.common.beans.editor.FixedButton;
import com.l2fprod.common.swing.LookAndFeelTweaks;
import com.l2fprod.common.swing.renderer.DefaultCellRenderer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

import org.compiere.apps.AEnv;
import org.compiere.apps.search.Find;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.model.GridWindow;
import org.compiere.model.GridWindowVO;
import org.compiere.model.MQuery;
import org.compiere.model.MTab;
import org.compiere.model.MWindow;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Table;
import org.compiere.util.Env;
import org.compiere.util.KeyNamePair;
import org.frapuccino.swing.ActiveWindowTracker;




public class FilterEditor extends AbstractPropertyEditor {
	protected JTextField textfield;
	private JButton button;
	private MQuery filter;
	public FilterEditor() {
		editor = new JPanel(new BorderLayout(0, 0));
		((JPanel) editor).add("Center", textfield = new JTextField());
		((JPanel) editor).add("East", button = new FixedButton());
		textfield.setBorder(LookAndFeelTweaks.EMPTY_BORDER);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (filter == null)
					return;
				X_AD_Table table = new Query(Env.getCtx(), X_AD_Table.Table_Name, "TableName = ?", null)
				.setParameters(filter.getTableName()).first();
				if (table != null) {
					List<MTab> mTabs = new Query(Env.getCtx(), MTab.Table_Name, "AD_Table_ID = ?", null)
					.setParameters(table.getAD_Table_ID()).list();
					MWindow window = new Query(Env.getCtx(), MWindow.Table_Name, "AD_Window_ID = ?", null)
					.setParameters(mTabs.get(0).getAD_Window_ID()).first();							
					if (window != null) {								
						int AD_Window_ID = window.getAD_Window_ID();
						Window w = ActiveWindowTracker.findActiveWindow();
						JFrame f = Env.getFrame(w);														
						int m_curWindowNo = Env.getWindowNo(f);												
						GridWindowVO wVO = AEnv.getMWindowVO (m_curWindowNo, AD_Window_ID, 0);
						if (wVO != null)
						{
							GridTab m_mTab = null;
							GridWindow m_mWindow = new GridWindow (wVO);
							int count = m_mWindow.getTabCount();									
							for (int i=0; i < count; i ++) {
								if (m_mTab == null) {
									for (MTab mTab:mTabs) {
										if (mTab.getAD_Tab_ID() == m_mWindow.getTab(i).getAD_Tab_ID()) {
											m_mTab = m_mWindow.getTab(i);
											break;
										}
									}					
								}
							}									 
							String where = "";
							GridField[] findFields = GridField.createFields(Env.getCtx(), m_curWindowNo, 0, m_mTab.getAD_Tab_ID());

							Find find = new Find (f, m_curWindowNo, m_mTab.getName(),
									m_mTab.getAD_Tab_ID(), m_mTab.getAD_Table_ID(), table.getTableName(),
									where, findFields, 10);	//	no query below 10
							MQuery query = find.getQuery();
							//String sqlquery = "";
							if (query != null) {
								//sqlquery = query.getWhereClause();
								//filter = new KeyNamePair(filter.getKey(),sqlquery);
								filter = query;
							}
							find.dispose();
							find = null;												
						}
					}
				}

			}
		});		
	}
	public Object getValue() {
		return filter;
	}
	public void setValue(Object value) {
		if (value != null) {
			//filter = (KeyNamePair) value;
			//textfield.setText(filter.getName());
			filter = (MQuery) value;
			textfield.setText(filter.getWhereClause());
		}
	}
	public static class CellRenderer extends DefaultCellRenderer implements TableCellRenderer
	{
		String filter;
		public void setValue(Object value) {
			if (value != null) {
				MQuery val = (MQuery) value;
				setText(val.getWhereClause());
			}
		}
		public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
			setValue(value);
			return this;
		} 		
	}
}
