package org.xendra.ruleeditor.gui.propertysheet;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
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

public class JDocBaseTypeChooser extends CDialog {

	private static List<DocBase> m_previous;
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
	
	
	public JDocBaseTypeChooser() 
	{
		this.setModalityType(ModalityType.DOCUMENT_MODAL);
		Initialize();
	}
	
	private void filldata(List<DocBase> docbasetype) {		
		List<ValueNamePair> vnp = Util.RefList("c1999318-834d-4c66-5345-371ffe3c1f06");
		for (ValueNamePair vn:vnp)
		{
			boolean found = false;
			for (DocBase vector:docbasetype)
			{
				if (vector.getType().equals(vn))
				{
					yesModel.addElement(vector);
					found = true;
				}
			}
			if (!found)
			{
				DocBase vector = new DocBase();
				vector.setType(vn);
				noModel.addElement(vector);
			}
		}
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
	    MouseListener mouseListener = new MouseAdapter() {
	        public void mouseClicked(MouseEvent mouseEvent) {
	          JList theList = (JList) mouseEvent.getSource();
	          if (mouseEvent.getClickCount() == 2) {
	            int index = theList.locationToIndex(mouseEvent.getPoint());
	            if (index >= 0) {
	              DocBase o = (DocBase) theList.getModel().getElementAt(index);
	      		  JDocSubTypeChooser choose = new JDocSubTypeChooser();
	    		  choose.filldata(o);
	    		  choose.pack();		
	    		  choose.setLocationRelativeTo(null);
	    		  choose.setVisible(true);	
	    		  DocBase st = (DocBase) choose.getDocSubType();	    		  
	    		  o = st;
	            }
	          }
	        }
	      };
	      yesList.addMouseListener(mouseListener);		
	      yesList.setCellRenderer(new DocBaseTypeRenderer());
		noPane.setPreferredSize(new Dimension(200, 300));
		noList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		noList.setCellRenderer(new DocBaseTypeRenderer());
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

	public static List<DocBase> showDialog(Component editor, String title,List<DocBase> docbasetype) {
		m_previous = docbasetype;
		JDocBaseTypeChooser choose = new JDocBaseTypeChooser();
		choose.filldata(docbasetype);
		choose.pack();		
		choose.setLocationRelativeTo(null);
		choose.setVisible(true);		
		return choose.getDocaseType();
	}
	
	private List<DocBase> getDocaseType() {
		List<DocBase> docbasetype = new ArrayList<DocBase>();
		if (m_ok)
		{		
			ListModel linemodel = yesList.getModel();
			for (int i=0; i < linemodel.getSize(); i++)
			{
				DocBase kp = (DocBase) linemodel.getElementAt(i);				
				docbasetype.add(kp);
			}
		}
		else
		{
			docbasetype = m_previous;
		}
		return docbasetype;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == bAdd)
		{			
			List<DocBase> xxlist = noList.getSelectedValuesList();
			for (DocBase kp:xxlist)
			{
				noModel.removeElement(kp);
				yesModel.addElement(kp);
				yesList.setSelectedValue(kp, true);
			}
		}
		//	REMOVE  <-
		else if (e.getSource() == bRemove)
		{
			List<DocBase> list = yesList.getSelectedValuesList();
			for (DocBase kp:list)
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
