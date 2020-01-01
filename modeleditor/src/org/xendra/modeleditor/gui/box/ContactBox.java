package org.xendra.modeleditor.gui.box;

import java.awt.BorderLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;

import org.xendra.modeleditor.folder.TableFolder;
import org.xendra.modeleditor.gui.tree.ModelEditorTreeModel;
import org.xendra.modeleditor.gui.box.ContactList;
import org.xendra.modeleditor.gui.box.FilteringModel;
import org.columba.api.exception.ServiceNotFoundException;
import org.columba.api.gui.frame.IContainer;
import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.facade.ServiceFacadeRegistry;
import org.columba.core.gui.base.DoubleClickListener;
import org.columba.core.gui.base.IconTextField;
import org.columba.core.gui.dialog.ErrorDialog;
import org.columba.core.gui.frame.FrameManager;
import org.columba.core.gui.frame.api.IComponentBox;
import org.columba.core.resourceloader.IconKeys;
import org.columba.core.resourceloader.ImageLoader;
import org.columba.mail.facade.IDialogFacade;
import org.compiere.model.persistence.X_AD_Table;
import org.compiere.util.CLogMgt;

import com.jgoodies.forms.builder.DefaultFormBuilder;
import com.jgoodies.forms.layout.FormLayout;

//import org.columba.addressbook.gui.dialog.contact.ContactEditorDialog;
//import org.columba.addressbook.model.IContactModel;
//import org.columba.addressbook.model.IContactModelPartial;

public class ContactBox extends JPanel implements IComponentBox {

	private final static ImageIcon icon = ImageLoader.getSmallIcon(IconKeys.EDIT_FIND);
	private ContactList list;
	private IconTextField textField;
	private JLabel label;
	private TableFolder selectedFolder;
	private JPopupMenu contextMenu;

	public ContactBox() {
		setLayout(new BorderLayout());

		label = new JLabel("Quick Find:");
		label.setDisplayedMnemonic('F');
		textField = new IconTextField(icon, 10);
		label.setLabelFor(textField);

		list = new ContactList();
		list.setModel(new FilteringModel());
//		if (selectedFolder != null)
//			list.addAll(selectedFolder.getHeaderItemList());
//
//		FolderListMenu popup = new FolderListMenu(new ActionListener() {
//			public void actionPerformed(ActionEvent event) {
//				String id = event.getActionCommand();
//				ModelEditorTreeModel model = ModelEditorTreeModel.getInstance();
//				selectedFolder = (TableFolder) model.getFolder(id);
//				List<X_AD_Table> contactList = selectedFolder.getHeaderItemList();
//				list.setModel(new FilteringModel());
//				list.addAll(contactList);
//				list.installJTextField(textField);
//				textField.setText(textField.getText());
//			}
//		});
		//textField.setPopupMenu(popup);

		list.installJTextField(textField);

		list.addMouseListener(new DoubleClickListener() {

			@Override
			public void doubleClick(MouseEvent event) {
				X_AD_Table selected = (X_AD_Table) list.getSelectedValue();
				openEditContactDialog(selected);
			}
		});

		list.add(getPopupMenu());
		list.addMouseListener(new MyMouseListener());

		//setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));

		JPanel p = new JPanel();
		p.setBorder(BorderFactory.createEmptyBorder(0, 4, 4, 4));
		FormLayout layout = new FormLayout("pref, 2dlu, fill:default:grow",
		// 2 columns
				"fill:default:grow");

		// create a form builder
		DefaultFormBuilder builder = new DefaultFormBuilder(layout, p);
		builder.append(label);
		builder.append(textField);
		add(p, BorderLayout.NORTH);

		JScrollPane scrollPane = new JScrollPane(list);
		//scrollPane.setBorder(null);
		add(scrollPane, BorderLayout.CENTER);
	}

	private JPopupMenu getPopupMenu() {
		if (contextMenu != null)
			return contextMenu;

		contextMenu = new JPopupMenu();

		JMenuItem item = new JMenuItem("Open..");
		item.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				X_AD_Table selected = (X_AD_Table) list.getSelectedValue();
				openEditContactDialog(selected);
			}
		});
		contextMenu.add(item);

		item = new JMenuItem("Compose Message..");
		item.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				X_AD_Table selected = (X_AD_Table) list.getSelectedValue();
				String address = selected.getName();

				try {
					IDialogFacade facade = (IDialogFacade) ServiceFacadeRegistry
							.getInstance()
							.getService(
									org.columba.mail.facade.IDialogFacade.class);
					facade.openComposer(address);
				} catch (ServiceNotFoundException e) {
					e.printStackTrace();
				}
			}
		});

		contextMenu.add(item);
		return contextMenu;
	}

	/**
	 * *************** IComponentBox implementation
	 * *******************************
	 */

	public String getDescription() {
		return "Contacts";
	}

	public ImageIcon getIcon() {
		return ImageLoader.getSmallIcon(IconKeys.ADDRESSBOOK);
	}

	public String getName() {
		return "Contacts";
	}

	public String getTechnicalName() {
		return "contact_list";
	}

	public JComponent getView() {
		return this;
	}

	private void openEditContactDialog(X_AD_Table selected) {

		ModelEditorTreeModel model = ModelEditorTreeModel.getInstance();
		selectedFolder = (TableFolder) model.getFirstFolder();

		X_AD_Table card = null;
		try {
			//card = (X_AD_Table) selectedFolder.get(selected.getAD_Table_ID());
		} catch (Exception e) {
			if (CLogMgt.DEBUG)
				e.printStackTrace();
			ErrorDialog.createDialog(e.getMessage(), e);
		}

		
		IContainer[] container = FrameManager.getInstance().getOpenFrames();
		if (container == null || container.length == 0)
			throw new RuntimeException("No frames available");

		IFrameMediator frameMediator = container[0].getFrameMediator();

//		ContactEditorDialog dialog = new ContactEditorDialog(frameMediator.getView().getFrame(), card);
//
//		if (dialog.getResult()) {
//
//			try {
//				// modify card properties in folder
//				selectedFolder.modify(selected.getAD_Rule_ID());
//			} catch (Exception e1) {
//				if (Logging.DEBUG)
//					e1.printStackTrace();
//
//				ErrorDialog.createDialog(e1.getMessage(), e1);
//			}
//
//		}
	}

	class MyMouseListener extends MouseAdapter {

		@Override
		public void mouseClicked(MouseEvent e) {
			handleEvent(e);
		}

		@Override
		public void mousePressed(MouseEvent e) {
			handlePopupEvent(e);
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			handlePopupEvent(e);
		}

		/**
		 * @param e
		 */
		private void handlePopupEvent(MouseEvent e) {
			Point p = e.getPoint();
			if (e.isPopupTrigger()) {
				// check if a single entry is selected
				if (list.getSelectedIndices().length <= 1) {
					// select new item
					int index = list.locationToIndex(p);
					list.setSelectedIndex(index);
				}
				// show context menu
				getPopupMenu().show(e.getComponent(), p.x, p.y);
			}
		}

		/**
		 * @param e
		 */
		private void handleEvent(MouseEvent e) {
		}
	}

}
