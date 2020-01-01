package org.xendra.ruleeditor.gui.propertysheet;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JComponent;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;

import org.compiere.apps.ConfirmPanel;
import org.compiere.swing.CButton;
import org.compiere.swing.CDialog;
import org.compiere.swing.CLabel;
import org.compiere.swing.CPanel;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.compiere.util.Util;
import org.compiere.util.ValueNamePair;

public class JDocSubTypeChooser extends CDialog {

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
	private CButton		bOK = ConfirmPanel.createOKButton("OK");
	private CButton		bCancel = ConfirmPanel.createCancelButton("Cancel");	
	private boolean m_ok = false;
	private DocBase m_previous;
	
	public JDocSubTypeChooser() {
		this.setModalityType(ModalityType.DOCUMENT_MODAL);
		Initialize();		
	}
	
	public void filldata(DocBase docsubtype) {
		m_previous = docsubtype;
		List<ValueNamePair> vnp = Util.RefList("510701bb-3d4a-4be3-a6ef-074558e57de9");
		ValueNamePair np = (ValueNamePair) docsubtype.getSubtype();
		for (ValueNamePair vn:vnp)
		{
			if (np != null && np.getValue().equals(vn.getValue()))
				yesModel.addElement(vn);
			else
				noModel.addElement(vn);
		}					
	}
	
	public DocBase getDocSubType() {
		DocBase docsubtype = null;
		if (m_ok)
		{
			ListModel linemodel = yesList.getModel();
			for (int i=0; i < linemodel.getSize(); i++)
			{
				ValueNamePair vp = (ValueNamePair) linemodel.getElementAt(i);				
				docsubtype = m_previous;
				docsubtype.setSubtype(vp);
			}			
		}
		else
		{
			docsubtype = m_previous;
		}
		return docsubtype;
	}	
	
	private void Initialize() {
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

		getContentPane().add (comp, BorderLayout.CENTER);
		
		CPanel confirmPanel = new CPanel(new FlowLayout(FlowLayout.RIGHT));
		
		confirmPanel.add(bCancel);
		confirmPanel.add(bOK);
		getContentPane().add (confirmPanel, BorderLayout.SOUTH);
		//
		bCancel.addActionListener(this);
		bOK.addActionListener(this);						
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == bAdd)
		{			
			List<ValueNamePair> xxlist = noList.getSelectedValuesList();
			for (ValueNamePair kp:xxlist)
			{
				noModel.removeElement(kp);
				yesModel.addElement(kp);
				yesList.setSelectedValue(kp, true);
			}
		}
		//	REMOVE  <-
		else if (e.getSource() == bRemove)
		{
			List<ValueNamePair> list = yesList.getSelectedValuesList();
			for (ValueNamePair kp:list)
			{
				yesModel.removeElement(kp);
				noModel.addElement(kp);
			}
		}	
		if(e.getActionCommand().equals(ConfirmPanel.A_CANCEL))
		{
			m_ok = false;
			dispose();
		}
		if(e.getActionCommand().equals(ConfirmPanel.A_OK))
		{
			m_ok = true;
			dispose();
		}
	}

}
