package org.xendra.pop.wizard;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JComponent;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

import org.compiere.model.MPOP;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_C_POPLine;
import org.compiere.model.persistence.X_C_StorePOPLine;
import org.compiere.model.reference.REF_TypePOPLine;
import org.compiere.swing.CButton;
import org.compiere.swing.CLabel;
import org.compiere.util.CLogger;
import org.compiere.util.Env;
import org.compiere.util.KeyNamePair;
import org.compiere.util.Msg;
import org.xendra.Constants;
import org.xendra.pop.util.ResourceLoader;

import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;

public class ColumnsUpdateStep extends AbstractStep implements ActionListener {
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
	public ColumnsUpdateStep(DataModel data) {
		super(ResourceLoader.getString("dialog", "machinewizard", "columns"),
				ResourceLoader.getString("dialog", "machinewizard",   "columns_description"));
		this.data = data;
	}

	@Override
	public void prepareRendering() {
		if (!initialize)
		{
			List<X_C_StorePOPLine> required = new Query(Env.getCtx(),X_C_StorePOPLine.Table_Name, "IsSelected = 'Y' AND type = 'U'", null)
			.setOrderBy("line")
			.list();			
			MPOP posmodel = (MPOP) data.getData(Constants.Model);
			StringBuilder query = new StringBuilder();			
			List<X_C_StorePOPLine> dtavailable = null;
			if (posmodel != null) {
				query.append(" NOT EXISTS(SELECT 1 FROM C_POPLine pl WHERE pl.sourcemethodname = C_StorePOPLine.sourcemethodname ")
				.append(" and pl.c_pop_id = ? and pl.type = 'U' ) ");
				dtavailable = new Query(Env.getCtx(), X_C_StorePOPLine.Table_Name, query.toString(), null)
				.setParameters(posmodel.getC_POP_ID()).setOrderBy("line").list();
			} else {
				query.append("type = 'U'");
				dtavailable = new Query(Env.getCtx(), X_C_StorePOPLine.Table_Name, query.toString(), null)
				.setOrderBy("line").list();												
			}
			for (X_C_StorePOPLine dt:dtavailable)
			{
				//String trlname = Msg.translate(Env.getCtx(), dt.getName().trim());
				String trlname = String.format("%s(%s)",Msg.translate(Env.getCtx(), dt.getName().trim()), dt.getSourceMethodName());
				//KeyNamePair pp = new KeyNamePair(dt.getC_StorePOPLine_ID(), dt.getName());
				KeyNamePair pp = new KeyNamePair(dt.getC_StorePOPLine_ID(), trlname);
				noModel.addElement(pp);
			}
			if (posmodel != null) {
				List<X_C_POPLine> dtselected = new Query(Env.getCtx(), X_C_POPLine.Table_Name, "C_POP_ID = ? AND IsActive = 'Y' AND type ='U'", null)
				.setParameters(posmodel.getC_POP_ID()).setOrderBy("line").list();
//				if (dtselected.size() > 0)
//					setCanGoNext(true);
//				else
//					setCanGoNext(false);		
				for (X_C_POPLine pdt:dtselected)
				{
					X_C_StorePOPLine spl = new Query(Env.getCtx(), X_C_StorePOPLine.Table_Name, "sourcemethodname = ?", null)
					.setParameters(pdt.getSourceMethodName()).first();
					if (spl != null)
					{
						//String trlname = Msg.translate(Env.getCtx(), spl.getName().trim());
						String trlname = String.format("%s(%s)",Msg.translate(Env.getCtx(), spl.getName().trim()), spl.getSourceMethodName());
						KeyNamePair pp = new KeyNamePair(spl.getC_StorePOPLine_ID(), trlname);
						yesModel.addElement(pp);
					}
				}
			}
			if (required.size() > 0) {
				Iterator it = required.iterator();
				while (it.hasNext()) {
					X_C_StorePOPLine dt = (X_C_StorePOPLine) it.next();
					String trlname = String.format("%s(%s)",Msg.translate(Env.getCtx(), dt.getName().trim()), dt.getSourceMethodName());
					KeyNamePair pp = new KeyNamePair(dt.getC_StorePOPLine_ID(), trlname);
					if (noModel.contains(pp)) {						
						noModel.removeElement(pp);
					}
					if (!yesModel.contains(pp)) {
						yesModel.addElement(pp);
					}													
				}
			}			
			initialize = true;
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
		noList.setFont(Font.decode(Font.MONOSPACED + " " + 10));
		yesList.setFont(Font.decode(Font.MONOSPACED + " " + 10));
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
		Method method = null;
		try {			
			method = yesList.getClass().getMethod("getModel", null);
		} catch (NoSuchMethodException nsme) {
		}		
		data.registerDataLookup(REF_TypePOPLine.UpdatePrice,new DefaultDataLookup(yesList, method, null));
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
		if (yesModel.size() > 0)
			setCanGoNext(true);
		else
			setCanGoNext(false);		
	}
}