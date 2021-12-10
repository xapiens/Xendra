package org.xendra.cost;

import java.awt.Dimension;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Method;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

import javax.swing.DefaultListModel;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Table;
import org.compiere.model.persistence.X_M_MaterialPolicy;
import org.compiere.model.reference.REF_M_TransactionTransactionType;
import org.compiere.swing.CButton;
import org.compiere.swing.CLabel;
import org.compiere.util.CLogger;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.compiere.util.KeyNamePair;
import org.compiere.util.Msg;
import org.compiere.util.ValueNamePair;
import org.xendra.core.resourceloader.ResourceLoader;

import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;
import net.miginfocom.swing.MigLayout;


public class PolicyTablesStep extends AbstractStep implements ActionListener {
	private DataModel data;
	private CLabel noLabel = new CLabel();
	private CLabel yesLabel = new CLabel();
	private CButton bAdd = new CButton();
	private CButton bRemove = new CButton();
	private DefaultListModel noModel = new DefaultListModel();
	private DefaultListModel yesModel = new DefaultListModel();
	private JList noList = new JList(noModel);
	private JList yesList = new JList(yesModel);
	private JScrollPane noPane = new JScrollPane(noList);
	private JScrollPane yesPane = new JScrollPane(yesList);
	private boolean isRender = false;
	private static CLogger log = CLogger.getCLogger(PolicyTablesStep.class);
	public PolicyTablesStep(DataModel data) {
		super(ResourceLoader.getString("materialpolicywizard", "tables"),
				ResourceLoader.getString("materialpolicywizard", "tables_description"));
		this.data = data;		
		setCanGoNext(true);
	}

	@Override
	public void prepareRendering() {
		if (!isRender) {
			StringBuilder sb = new StringBuilder("SELECT ad_table_id, tablename from ad_table where ad_table_id not in ")		
			.append("(SELECT ad_table_id from ad_column where isparent = 'Y' ")
			.append(" AND ad_table_id in (select ad_table_id from ad_column where columnname = 'IsCosted'))") 
			.append(" AND ad_table_id in (select ad_table_id from ad_column where columnname = 'IsCosted')") 
			.append(" AND isview = 'N'");
			try {
				PreparedStatement pstmt = DB.prepareStatement(sb.toString(), null);
				ResultSet rs = pstmt.executeQuery();
				while (rs.next())
				{
					KeyNamePair pp = new KeyNamePair(rs.getInt(1), Msg.translate(Env.getCtx(), rs.getString(2)));
					noModel.addElement(pp);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			isRender = true;
		}
	}

	@Override
	protected JComponent createComponent() {
		JComponent comp = new JPanel();                
		comp.setLayout(new MigLayout("center", "[][][]", "[][][][grow]"));        
		noLabel.setText("No");
		yesLabel.setText("Yes");
		//
		bAdd.setIcon(Env.getImageIcon("Detail24.gif"));
		bAdd.setMargin(new Insets(2, 2, 2, 2));
		bAdd.addActionListener(this);
		bRemove.setIcon(Env.getImageIcon("Parent24.gif"));
		bRemove.setMargin(new Insets(2, 2, 2, 2));
		bRemove.addActionListener(this);
		//
		yesPane.setPreferredSize(new Dimension(200, 500));
		yesList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		noPane.setPreferredSize(new Dimension(200, 500));
		noList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		//
		comp.add(noLabel, "cell 0 0,span 1 1,push 0 0, align center, gap 0 0 0 0");		
		comp.add(yesLabel,"cell 2 0,span 1 1,push 0 0, align center, gap 0 0 0 0");
		comp.add(noPane,  "cell 0 1,span 1 5,push 0 0, align center, gap 4 4 4 4");
		comp.add(yesPane, "cell 2 1,span 1 5,push 0 0, align center, gap 4 4 4 4");
		comp.add(bRemove, "cell 1 2,span 1 1,push 0 0, align center, gap 4 4 4 4");
		comp.add(bAdd,    "cell 1 1,span 1 1,push 0 0, align center, gap 4 4 4 4");			
		noLabel.setText(Msg.getMsg(Env.getCtx(), "Available"));
		yesLabel.setText(Msg.getMsg(Env.getCtx(), "Select"));		
		Method method = null;
		try {			
			method = yesList.getClass().getMethod("getModel", null);
		} catch (NoSuchMethodException nsme) {
		}		
		//
		String PolicyID = (String) data.getData(X_M_MaterialPolicy.COLUMNNAME_M_MaterialPolicy_ID);
		if (Integer.valueOf(PolicyID) > 0) {
			X_M_MaterialPolicy p = new Query(Env.getCtx(), X_M_MaterialPolicy.Table_Name, "M_MaterialPolicy_ID = ?", null)
				.setParameters(Integer.valueOf(PolicyID)).first();
			String tables = (String) p.getProperties().get("tables");
			StringTokenizer st = new StringTokenizer(tables, ",");
			while (st.hasMoreElements()) {
				String tk = (String) st.nextElement();				
				X_AD_Table t = new Query(Env.getCtx(), X_AD_Table.Table_Name, "TableName = ?", null)
					.setParameters(tk).first();
				KeyNamePair kp = new KeyNamePair(t.getAD_Table_ID(), t.getTableName());
				noModel.removeElement(kp);
				yesModel.addElement(kp);
			}
		}
		//
		data.registerDataLookup(X_AD_Table.COLUMNNAME_AD_Table_ID,new DefaultDataLookup(yesList, method, null));
		JComponent policy = new JPanel(new MigLayout());
		policy.add(new JLabel(ResourceLoader.getString("materialpolicywizard", "tables_description")),"wrap");
		policy.add(comp);
		return policy;		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == bAdd) {
			List<KeyNamePair> xxlist = noList.getSelectedValuesList();
			for (KeyNamePair kp:xxlist)
			{
				noModel.removeElement(kp);
				log.config("Add=" + kp);
				yesModel.addElement(kp);
				yesList.setSelectedValue(kp, true);
			}			
		} else if (e.getSource() == bRemove) {
			List<KeyNamePair> list = yesList.getSelectedValuesList();
			for (KeyNamePair kp:list)
			{
				yesModel.removeElement(kp);
				log.config("Remove=" + kp);
				noModel.addElement(kp);
			}			
		}
		if (yesModel.size() > 0)
			setCanGoNext(true);
		else
			setCanGoNext(false);				
	}
}
