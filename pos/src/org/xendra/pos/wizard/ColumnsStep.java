package org.xendra.pos.wizard;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Method;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import org.compiere.model.MPOS;
import org.compiere.model.Machine;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_C_POS;
import org.compiere.model.persistence.X_C_POSLine;
import org.compiere.model.persistence.X_C_StorePOSLine;
import org.compiere.swing.CButton;
import org.compiere.swing.CLabel;
import org.compiere.util.CLogger;
import org.compiere.util.Env;
import org.compiere.util.KeyNamePair;
import org.compiere.util.Msg;
import org.xendra.pos.util.ResourceLoader;
import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;

public class ColumnsStep extends AbstractStep implements ActionListener {
	protected DataModel data;
	private GridBagLayout mainLayout = new GridBagLayout();
	private CLabel noLabel = new CLabel();
	private CLabel yesLabel = new CLabel();
	private CButton bAdd = new CButton();
	private CButton bRemove = new CButton();
	private CButton bUp = new CButton();
	private CButton bDown = new CButton();
	private DefaultListModel noModel = new DefaultListModel();
	private DefaultListModel yesModel = new DefaultListModel();
	private JList noList = new JList(noModel);
	private JList yesList = new JList(yesModel);
	private JScrollPane noPane = new JScrollPane(noList);
	private JScrollPane yesPane = new JScrollPane(yesList);
	private static CLogger log = CLogger.getCLogger(DocTypeStep.class);
	private boolean initialize = false;
	private JLabel warninglabel = new JLabel("");
	public ColumnsStep(DataModel data) {
		super(ResourceLoader.getString("dialog", "machinewizard", "columns"),
				ResourceLoader.getString("dialog", "machinewizard",   "columns_description"));
		this.data = data;
	}

	@Override
	public void prepareRendering() {
		if (!initialize)
		{
			MPOS posmodel = null;
			Machine machine = Env.getMachine();
			Integer C_POS_ID = machine.getIntProperty(X_C_POS.COLUMNNAME_C_POS_ID);
			if (C_POS_ID > 0) {
				posmodel = new Query(Env.getCtx(), X_C_POS.Table_Name, "C_POS_ID = ?", null).setParameters(C_POS_ID).first();
				if (posmodel != null) {

				}
			}
			StringBuilder query = new StringBuilder();
			List<X_C_StorePOSLine> dtavailable = null;
			if (posmodel != null) {
				query.append(" NOT EXISTS(SELECT 1 FROM C_POSLine pl WHERE pl.C_StorePOSLine_ID = C_StorePOSLine.C_StorePOSLine_ID ")
				.append(" and pl.c_pos_id = ?) ");				
				dtavailable = new Query(Env.getCtx(), X_C_StorePOSLine.Table_Name, query.toString(), null)
				.setParameters(posmodel.getC_POS_ID()).list();
			} else {
				query.append("IsActive = 'Y'");
				dtavailable = new Query(Env.getCtx(), X_C_StorePOSLine.Table_Name, query.toString(), null)
				.setOrderBy("line").list();								
			}
			for (X_C_StorePOSLine dt:dtavailable)
			{
				KeyNamePair pp = new KeyNamePair(dt.getC_StorePOSLine_ID(), gettrlname(dt));
				noModel.addElement(pp);
			}
			if (posmodel != null) {
				List<X_C_POSLine> dtselected = new Query(Env.getCtx(), X_C_POSLine.Table_Name, "C_POS_ID = ? AND IsActive = 'Y'", null)
				.setParameters(posmodel.getC_POS_ID()).setOrderBy("line").list();
				for (X_C_POSLine pdt:dtselected)
				{
					X_C_StorePOSLine spl = new Query(Env.getCtx(), X_C_StorePOSLine.Table_Name, "sourcemethodname = ?", null)
					.setParameters(pdt.getSourceMethodName()).first();
					if (spl != null)
					{
						KeyNamePair pp = new KeyNamePair(spl.getC_StorePOSLine_ID(), gettrlname(spl));
						yesModel.addElement(pp);
					}
				}
			}
			validatefields();
			initialize = true;
		}
	}

	private void validatefields() {
		String mIsKey = "";
		String mIsDescription = "";
		String mNextLine = "";
		String mDefault = "";
		for (int i = 0; i  < yesModel.getSize(); i++) {
			KeyNamePair kp = (KeyNamePair) yesModel.get(i);
			int x = kp.getKey();
			X_C_StorePOSLine pps = new Query(Env.getCtx(), X_C_StorePOSLine.Table_Name, "C_STorePOSLine_ID = ?", null)
			.setParameters(x).first();
			if (pps.isKey()) 
				mIsKey = pps.getName();
			if (pps.isDescription()) 
				mIsDescription = pps.getName();				
			if (pps.isNextLine())
				mNextLine = pps.getName();
			if (pps.isDefault())
				mDefault = pps.getName();			
		}
		String fields = "";			
		fields = String.format("(%s=>%s) (%s=>%s) (%s=>%s) (%s=>%s)", 
				Msg.translate(Env.getCtx(), "IsKey"), mIsKey,
				Msg.translate(Env.getCtx(), "IsDescription"), mIsDescription,
				Msg.translate(Env.getCtx(), "NextLine"), mNextLine,
				Msg.translate(Env.getCtx(), "Default"), mDefault);
		warninglabel.setText(fields);
		if (yesModel.size() > 0 && mIsKey.length() > 0 && mIsDescription.length() > 0 && mNextLine.length() > 0 && mDefault.length() > 0)		
			setCanGoNext(true);
		else {

			setCanGoNext(false);
		}					
	}

	protected String gettrlname(X_C_StorePOSLine dt) {
		String trlname = String.format("%s(%s)",Msg.translate(Env.getCtx(), dt.getName().trim()), dt.getSourceMethodName());
		if (dt.isDefault())
			trlname += "[Default]";
		if (dt.isDescription())
			trlname += "[Description]";
		if (dt.isKey())
			trlname +="[Key]";
		if (dt.isNextLine())
			trlname +="[NewLine]";
		return trlname;
	}

	@Override
	protected JComponent createComponent() {
		JComponent comp = new JPanel();        
		comp.setLayout(mainLayout);
		//
		noLabel.setText("No");
		yesLabel.setText("Yes");
		//
		bAdd.setIcon(Env.getImageIcon("Detail24.gif"));
		bAdd.setMargin(new Insets(2, 2, 2, 2));
		bAdd.addActionListener(this);
		bRemove.setIcon(Env.getImageIcon("Parent24.gif"));
		bRemove.setMargin(new Insets(2, 2, 2, 2));
		bRemove.addActionListener(this);
		bUp.setIcon(Env.getImageIcon("Previous24.gif"));
		bUp.setMargin(new Insets(2, 2, 2, 2));
		bUp.addActionListener(this);
		bDown.setIcon(Env.getImageIcon("Next24.gif"));
		bDown.setMargin(new Insets(2, 2, 2, 2));
		bDown.addActionListener(this);		
		//
		yesPane.setPreferredSize(new Dimension(200, 300));
		yesList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		noPane.setPreferredSize(new Dimension(200, 300));
		noList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		//
		comp.add(noLabel, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0 ,GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
		comp.add(yesLabel,new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0 ,GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
		comp.add(noPane,  new GridBagConstraints(0, 1, 1, 3, 0.0, 0.0 ,GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(4, 4, 4, 4), 0, 0));
		comp.add(yesPane, new GridBagConstraints(2, 1, 1, 3, 0.0, 0.0 ,GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(4, 4, 4, 4), 0, 0));
		comp.add(bRemove, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0 ,GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(4, 4, 4, 4), 0, 0));
		comp.add(bAdd,    new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0 ,GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(4, 4, 4, 4), 0, 0));
		comp.add(bUp,  	  new GridBagConstraints(3, 1, 1, 1, 0.0, 0.0 ,GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(4, 4, 4, 4), 0, 0));
		comp.add(bDown,   new GridBagConstraints(3, 2, 1, 1, 0.0, 0.0 ,GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(4, 4, 4, 4), 0, 0));
		noLabel.setText(Msg.getMsg(Env.getCtx(), "Available"));
		yesLabel.setText(Msg.getMsg(Env.getCtx(), "Select"));		
		comp.add(warninglabel,    new GridBagConstraints(0, 4, 3, 1, 0.0, 0.0 ,GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(4, 4, 4, 4), 0, 0));
		Method method = null;
		try {			
			method = yesList.getClass().getMethod("getModel", null);
		} catch (NoSuchMethodException nsme) {
		}		
		data.registerDataLookup(X_C_POSLine.COLUMNNAME_C_POSLine_ID,new DefaultDataLookup(yesList, method, null));
		return comp;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == bAdd)
		{			
			List<KeyNamePair> xxlist = noList.getSelectedValuesList();
			for (KeyNamePair kp:xxlist)
			{
				noModel.removeElement(kp);
				log.config("Add=" + kp);
				yesModel.addElement(kp);
				yesList.setSelectedValue(kp, true);
			}
		}
		//	REMOVE  <-
		else if (e.getSource() == bRemove)
		{
			List<KeyNamePair> list = yesList.getSelectedValuesList();
			for (KeyNamePair kp:list)
			{
				yesModel.removeElement(kp);
				log.config("Remove=" + kp);
				noModel.addElement(kp);
			}
		}	
		else if (e.getSource() == bUp)
		{
			int indexes[] = yesList.getSelectedIndices();
			for (int i = 0; i < indexes.length; i++)
			{
				if (indexes[i] > 0)
				{
					KeyNamePair kp = (KeyNamePair) yesList.getSelectedValue();
					if (yesModel.removeElement(kp))
						yesModel.insertElementAt(kp, indexes[i]-1);
					indexes[i]--;
				}
			}
			yesList.setSelectedIndices(indexes);
		}
		//	DOWN    
		else if (e.getSource() == bDown)
		{
			int indexes[] = yesList.getSelectedIndices();
			for (int i = 0; i < indexes.length; i++)
			{
				if (indexes[i] != -1 && indexes[i] < yesModel.size()-1)
				{
					KeyNamePair kp = (KeyNamePair) yesList.getSelectedValue();
					if (yesModel.removeElement(kp))
						yesModel.insertElementAt(kp, indexes[i]+1);
					indexes[i]++;
				}
			}
			yesList.setSelectedIndices(indexes);
		}
		validatefields();
	}
}