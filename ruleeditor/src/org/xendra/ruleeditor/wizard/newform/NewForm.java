package org.xendra.ruleeditor.wizard.newform;

import java.awt.Dimension;
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
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Form;
import org.compiere.swing.CButton;
import org.compiere.swing.CLabel;
import org.compiere.util.CLogger;
import org.compiere.util.Env;
import org.compiere.util.KeyNamePair;
import org.compiere.util.Msg;
import org.xendra.ruleeditor.util.ResourceLoader;

import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;
import net.miginfocom.swing.MigLayout;

public class NewForm extends AbstractStep implements ActionListener {
	protected DataModel data;
	protected Integer parent_id;
    protected JTextField formName;
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
	private static CLogger log = CLogger.getCLogger(NewForm.class);
	
    public NewForm(DataModel data, Integer m_parentid) {
		super(ResourceLoader.getString("dialog", "newformwizard", "identity"),
			  ResourceLoader.getString("dialog", "newformwizard",  "identity_description"));
		this.data = data;		
		this.parent_id = m_parentid;
		setCanGoNext(true);    	
    }
	@Override
	protected JComponent createComponent() {
		JComponent comp = new JPanel();		
		comp.setLayout(new MigLayout("center", "[][][]", "[][][][grow]"));
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
		data.registerDataLookup(X_AD_Form.COLUMNNAME_AD_Form_ID,new DefaultDataLookup(yesList, method, null));
		return comp;				
	}


	@Override
	public void prepareRendering() {
		if (!isRender) {
			List<X_AD_Form> forms = new Query(Env.getCtx(), X_AD_Form.Table_Name, " IsActive = 'Y' ", null)
			.list();
			for (X_AD_Form form:forms) {
				KeyNamePair kp = new KeyNamePair(form.getAD_Form_ID(), form.getName());
				if (form.getAD_Plugin_ID() == parent_id)
					yesModel.addElement(kp);
				else
					noModel.addElement(kp);
			}
			isRender  = true;
		}	
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
		
	}    
}
