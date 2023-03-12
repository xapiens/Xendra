package org.xendra.efact.wizard;

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
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

import org.compiere.model.Machine;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_C_DocType;
import org.compiere.model.persistence.X_C_Tax;
import org.compiere.swing.CButton;
import org.compiere.swing.CLabel;
import org.compiere.util.CLogger;
import org.compiere.util.Env;
import org.compiere.util.KeyNamePair;
import org.compiere.util.Msg;
import org.xendra.efact.util.ResourceLoader;

import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;

public class TaxPickStep extends AbstractStep implements ActionListener {
	protected DataModel data;
	private GridBagLayout mainLayout = new GridBagLayout();
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
	private static CLogger log = CLogger.getCLogger(DocTypeStep.class);
	public TaxPickStep(DataModel data) {
		super(ResourceLoader.getString("dialog", "machinewizard", "doctype"),
				ResourceLoader.getString("dialog", "machinewizard",   "doctype_description"));
		this.data = data;
		setCanGoNext(false);
	}

	@Override
	public void prepareRendering() {		
		Machine machine = Env.getMachine();		
		String query =  "NOT TaxTypeCode ISNULL AND NOT TaxID ISNULL AND NOT ECE_5153 ISNULL AND NOT ECE_5305 ISNULL AND IsActive = 'Y'";
		List<X_C_Tax> dtavailable = new Query(Env.getCtx(), X_C_Tax.Table_Name, query, null)
				.list();
		for (X_C_Tax dt:dtavailable)
		{				
			boolean goahead = true;
			KeyNamePair pp = new KeyNamePair(dt.getC_Tax_ID(), dt.getName());
			for (int i = 0; i < noModel.size(); i ++)
			{
				KeyNamePair kp = (KeyNamePair) noModel.get(i);
				if (kp.getKey() == pp.getKey())
				{
					goahead = false;
					break;
				}
			}				
			if (goahead)
				noModel.addElement(pp);
		}
		List<X_C_Tax> dtselected = new Query(Env.getCtx(), X_C_Tax.Table_Name, query, null)
				.list();		
		if (dtselected.size() > 0)
			setCanGoNext(true);
		else
			setCanGoNext(false);			
		for (X_C_Tax pdt:dtselected)
		{
			Boolean goahead =true;
			for (X_C_Tax dt:dtavailable) {
				if (dt.getC_Tax_ID() == pdt.getC_Tax_ID()) {
					goahead = false;
					break;
				}
			}
			if (goahead) {
				X_C_Tax dt = new X_C_Tax(Env.getCtx(), pdt.getC_Tax_ID(), null);
				KeyNamePair pp = new KeyNamePair(dt.getC_Tax_ID(), dt.getName());
				for (int i = 0; i < yesModel.size(); i ++)
				{					
					KeyNamePair kp = (KeyNamePair) yesModel.get(i);
					if (kp.getKey() == pp.getKey())
					{
						goahead = false;
						break;
					}
				}

				yesModel.addElement(pp);
			}
		}
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
		noLabel.setText(Msg.getMsg(Env.getCtx(), "Available"));
		yesLabel.setText(Msg.getMsg(Env.getCtx(), "Select"));		
		Method method = null;
		try {			
			method = yesList.getClass().getMethod("getModel", null);
		} catch (NoSuchMethodException nsme) {
		}		
		data.registerDataLookup(X_C_DocType.COLUMNNAME_C_DocType_ID,new DefaultDataLookup(yesList, method, null));
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
		if (yesModel.size() > 0)
			setCanGoNext(true);
		else
			setCanGoNext(false);		
	}
}
