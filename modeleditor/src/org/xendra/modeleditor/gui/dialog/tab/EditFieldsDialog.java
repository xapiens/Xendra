package org.xendra.modeleditor.gui.dialog.tab;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;

import org.columba.core.gui.base.ButtonWithMnemonic;
import org.columba.core.gui.base.DoubleClickListener;
import org.columba.core.gui.base.SingleSideEtchedBorder;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Field;
import org.compiere.util.Env;
import org.xendra.modeleditor.folder.AbstractFolder;
import org.xendra.modeleditor.folder.FieldFolder;
import org.xendra.modeleditor.gui.list.FieldDNDListView;
import org.xendra.modeleditor.gui.list.FieldListModel;
import org.xendra.modeleditor.util.ResourceLoader;

import com.jgoodies.forms.builder.DefaultFormBuilder;
import com.jgoodies.forms.builder.PanelBuilder;
import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;

public class EditFieldsDialog extends JDialog implements ActionListener {
	private AbstractFolder parentFolder;
	private boolean result;
	private JLabel nameLabel;
	private JTextField nameTextField;
	private JLabel descriptionLabel;
	private JTextField descriptionTextField;
	private FieldListModel groupMembers;
	private FieldDNDListView parentList;
	private FieldListModel parentMembers;
	private FieldDNDListView groupList;	
	private JButton addButton;
	private JButton removeButton;
	private ButtonWithMnemonic okButton;
	private ButtonWithMnemonic cancelButton;

	public EditFieldsDialog(JFrame frame, AbstractFolder parentFolder) {
		super(frame, true);
		
		this.parentFolder = parentFolder;

		result = false;

		setTitle("test");
		// set title
		initComponents();
		layoutComponents();
		updateComponents(true);
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
	}
	private void initComponents() {
		nameLabel = new JLabel(ResourceLoader.getString("dialog", "editgroupdialog", "name"));
		nameTextField = new JTextField();
		descriptionLabel = new JLabel(ResourceLoader.getString("dialog", "editgroupdialog", "description_2"));
		descriptionTextField = new JTextField();

		groupMembers = new FieldListModel();
		groupList = new FieldDNDListView(groupMembers);
		groupList.setMinimumSize(new Dimension(200,300));
		
		parentMembers = new FieldListModel();		
		parentList = new FieldDNDListView(parentMembers);
		//parentList.setModel(parentMembers);
		parentList.setMinimumSize(new Dimension(200, 300));
		parentList.setAcceptDrop(false);
		parentList.addMouseListener(new DoubleClickListener() {
			public void doubleClick(MouseEvent ev) {
				actionPerformed(new ActionEvent(parentList, 0, "ADD"));
			}
		});		
		List<AbstractFolder> folders= parentFolder.getChildrens();
		for (AbstractFolder folder:folders) {
			if (folder instanceof FieldFolder) {
				String uid = (String) folder.getElement().getAttributeValue("uid");
				X_AD_Field field = new Query(Env.getCtx(), X_AD_Field.Table_Name, "AD_Field_ID = ?", null)
				.setParameters(Integer.valueOf(uid)).first();
				if (!field.isDisplayed())
					parentMembers.addElement(field);
				else
					groupMembers.addElement(field);
			}
		}

		addButton = new JButton("Add"); // $NON-NLS-1S
		addButton.addActionListener(this);
		addButton.setActionCommand("ADD");

		removeButton = new JButton("Remove"); // $NON-NLS-1S
		removeButton.addActionListener(this);
		removeButton.setActionCommand("REMOVE");

		okButton = new ButtonWithMnemonic(ResourceLoader.getString("global", "ok"));
		okButton.setActionCommand("OK");
		okButton.addActionListener(this);

		cancelButton = new ButtonWithMnemonic(ResourceLoader.getString("global", "cancel"));
		cancelButton.setActionCommand("CANCEL");
		cancelButton.addActionListener(this);

		getRootPane().setDefaultButton(okButton);
		getRootPane().registerKeyboardAction(this, "CANCEL", KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_IN_FOCUSED_WINDOW);		
	}

	private void addHeaderItem() {
		Object[] list = parentList.getSelectedValues();
		for (int i = 0; i < list.length; i++) {
			groupMembers.addElement((X_AD_Field) list[i]);			
		}

	}
	
	private void layoutComponents() {
		getContentPane().setLayout(new BorderLayout());

		JPanel mainPanel = new JPanel(new BorderLayout());
		mainPanel.setBorder(BorderFactory.createEmptyBorder(12,12,12,12));

		FormLayout layout = new FormLayout("fill:default:grow", 
				"default, 16px, fill:default:grow");

		CellConstraints cc = new CellConstraints();
		mainPanel.setLayout(layout);

		mainPanel.add(createGroupNamePanel(), cc.xy(1, 1));
		mainPanel.add(createGroupPanel(), cc.xy(1, 3));

		getContentPane().add(mainPanel, BorderLayout.CENTER);

		JPanel bottomPanel = new JPanel(new BorderLayout());
		bottomPanel.setBorder(new SingleSideEtchedBorder(SwingConstants.TOP));

		JPanel buttonPanel = new JPanel(new GridLayout(1, 2, 6, 0));
		buttonPanel.setBorder(BorderFactory.createEmptyBorder(12,12,12,12));

		buttonPanel.add(okButton);
		buttonPanel.add(cancelButton);
		bottomPanel.add(buttonPanel, BorderLayout.EAST);

		getContentPane().add(bottomPanel, BorderLayout.SOUTH);

	}
	
	private void updateComponents(boolean b) {
		if (b) {
			// gettext
//			nameTextField.setText(group.getName());
//			descriptionTextField.setText(group.getDescription());
//			try {			
//				X_AD_Rule[] rules = group.getMembers();
//				for (X_AD_Rule rule:rules) {
//					groupMembers.addElement(rule);
//				}
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//			this.groupList.setModel(groupMembers);
//		} else {
//			// settext
//			group.setName(nameTextField.getText());
//			group.setDescription(descriptionTextField.getText());
//
//			// remove all children
//			group.removeAllMembers();
//
//			// add children
//			for (int i  = 0; i < groupMembers.getSize(); i++) {
//				String id = String.valueOf(groupMembers.get(i).getAD_Rule_ID());
//				group.addMember(id);
//			}		
		}		
	}

	private Component createGroupPanel() {	
		JPanel panel = new JPanel();
		FormLayout layout = new FormLayout(
				"fill:default:grow, 12dlu, fill:default:grow",
				"default, 4px, fill:default:grow, 6px, default");

		PanelBuilder builder = new PanelBuilder(layout, panel);
		CellConstraints cc = new CellConstraints();

		builder.addSeparator(ResourceLoader.getString("dialog", "editgroupdialog", "ruleeditor"), cc.xy(1, 1)); 
		builder.addSeparator(ResourceLoader.getString("dialog", "editgroupdialog", "group_members"), cc.xy(3, 1));
		builder.add(new JScrollPane(parentList), cc.xy(1, 3));
		builder.add(new JScrollPane(groupList), cc.xy(3, 3));

		builder.add(addButton, cc.xy(1, 5));
		builder.add(removeButton, cc.xy(3, 5));

		return  panel;
	}
	
	private Component createGroupNamePanel() {
		JPanel panel = new JPanel();
		FormLayout layout = new FormLayout("12px, right:default, 6px, default:grow", ""); 
		DefaultFormBuilder b = new DefaultFormBuilder(layout, panel);
		b.setRowGroupingEnabled(true);
		b.setLeadingColumnOffset(1);

		b.appendSeparator(ResourceLoader.getString("dialog","editfieldsdialog","description_3"));
		b.append(nameLabel);
		b.append(nameTextField);

		b.append(descriptionLabel);
		b.append(descriptionTextField);

		return panel;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		if (command.equals("CANCEL")) {
			result = false;
			setVisible(false);
		} else if (command.equals("OK")) {
			result = true;
			updateComponents(false);
			setVisible(false);			
		} else if (command.equals("ADD")) {
			addHeaderItem();
			groupList.setModel(groupMembers);
			parentList.removeElement();			
		} else if (command.equals("REMOVE")) {
			Object[] list = groupList.getSelectedValues();
			for (int i = 0; i < list.length; i++) {
				groupMembers.removeElement((X_AD_Field) list[i]);
				parentList.addElement((X_AD_Field) list[i]);
			}
			groupList.setModel(groupMembers);			
		} 		
	}
	public boolean getResult() {
		return false;
	}
}
