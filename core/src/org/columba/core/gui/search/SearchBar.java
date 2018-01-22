package org.columba.core.gui.search;

import java.awt.AlphaComposite;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.geom.RoundRectangle2D;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.DefaultListCellRenderer;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JToolBar;
import javax.swing.UIManager;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;

import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.context.ContextResultListenerAdapter;
import org.columba.core.context.api.IContextResultEvent;
import org.columba.core.gui.action.AbstractColumbaAction;
import org.columba.core.gui.base.AscendingIcon;
import org.columba.core.gui.search.api.ICriteriaRenderer;
import org.columba.core.gui.search.api.ISearchPanel;
import org.columba.core.gui.toolbar.ToolBarButtonFactory;
import org.columba.core.resourceloader.IconKeys;
import org.columba.core.resourceloader.ImageLoader;
import org.columba.core.search.ResultListenerAdapter;
import org.columba.core.search.SearchRequest;
import org.columba.core.search.api.IResultEvent;
import org.columba.core.search.api.ISearchCriteria;
import org.columba.core.search.api.ISearchManager;
import org.columba.core.search.api.ISearchProvider;
import org.columba.core.search.api.ISearchRequest;

import com.jgoodies.forms.builder.DefaultFormBuilder;
import com.jgoodies.forms.layout.FormLayout;

public class SearchBar extends JPanel implements PopupMenuListener {

	private IconTextField textField;

	private ImageIcon icon = ImageLoader.getSmallIcon(IconKeys.EDIT_FIND);

	private JButton searchButton;

	private JCheckBox searchInsideCheckBox;

	private ISearchPanel searchPanel;

	private JComboBox providerComboBox;

	private JButton contextButton;

	private ContextSearchAction action;

	private SearchDialog searchDialog;

	private JButton moreButton;

	private IFrameMediator frameMediator;

	public SearchBar(final ISearchPanel searchPanel,
			final IFrameMediator frameMediator) {
		super();

		this.searchPanel = searchPanel;
		this.frameMediator = frameMediator;

		initComponents();

		layoutComponents(false);

		initListeners();
	}

	public void search(Iterator<ICriteriaRenderer> it, boolean matchAll) {

		// create list of search requests
		List<ISearchRequest> list = new Vector<ISearchRequest>();
		while (it.hasNext()) {
			ICriteriaRenderer r = it.next();
			ISearchCriteria c = r.getCriteria();
			String providerName = r.getProvider().getTechnicalName();
			Object value = r.getValue();
			// skip if user didn't specify search term for this criteria
			if (value == null)
				continue;

			String searchTerm = value.toString();

			list.add(new SearchRequest(c.getTechnicalName(), providerName,
					searchTerm));
		}

		// execute search
		searchPanel.searchComplex(list, matchAll, searchInsideCheckBox
				.isSelected());
	}

	public boolean isSelectedSearchInside() {
		return searchInsideCheckBox.isSelected();
	}

	private void toggleButtonStates(boolean enabled) {
		action.setEnabled(enabled);
		contextButton.setEnabled(enabled);
		searchButton.setEnabled(enabled);
		textField.setEnabled(enabled);
		searchInsideCheckBox.setEnabled(enabled);
		try {
			moreButton.setEnabled(enabled);
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
	}

	private void toggleSearchDialogVisibility() {
		if (searchDialog == null)
			searchDialog = new SearchDialog(frameMediator.getContainer()
					.getFrame(), searchPanel.getSearchManager()
					.getAllProviders());

		if (!searchDialog.isVisible()) {
			int x = getLocationOnScreen().x;
			// toolbar container
			Container c2 = getParent().getParent();
			int y = c2.getLocationOnScreen().y + c2.getHeight();
			int maxX = x + getWidth();

			int xx = maxX - searchDialog.getWidth();
			searchDialog.setLocation(xx, y);
			searchDialog.setVisible(true);

			if (searchDialog.isSuccess()) {
				// user pressed "Search" button
				search(searchDialog.getAllCriteriaRenderer(), searchDialog
						.isMatchAll());
			}
		} else {
			searchDialog.setVisible(false);
		}
	}

	private void initListeners() {
		// show search dialog
		moreButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				toggleSearchDialogVisibility();
			}
		});

		// on "RETURN" start seach
		textField.addKeyListener(new MyKeyListener());

		textField.getDocument().addDocumentListener(new MyDocumentListener());

		// update popup menu with search term before its made visible
		// textField.addPopupMenuListener(this);

		// enable/disable search bar during search
		searchPanel.getSearchManager()
				.addResultListener(new MyResultListener());

		// start search
		searchButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				toggleButtonStates(false);
				SearchBar.this.searchPanel.searchAll(textField.getText(),
						searchInsideCheckBox.isSelected());
			}
		});

		// to enable button again after search is finished
		searchPanel.getContextSearchManager().addResultListener(
				new MyContextResultListener());
	}

	class MyDocumentListener implements DocumentListener {

		public void changedUpdate(DocumentEvent e) {
			handleEvent(e);
		}

		public void insertUpdate(DocumentEvent e) {
			handleEvent(e);
		}

		public void removeUpdate(DocumentEvent e) {
			handleEvent(e);
		}

		private void handleEvent(DocumentEvent e) {
			updatePopupMenu(textField.getPopupMenu(), textField.getText());
			//textField.showPopup();
			//textField.requestFocus();
		}

	}

	class MyComboBoxRenderer extends DefaultListCellRenderer {

		@Override
		public Component getListCellRendererComponent(JList list, Object value,
				int index, boolean isSelected, boolean cellHasFocus) {
			super.getListCellRendererComponent(list, value, index, isSelected,
					cellHasFocus);

			// skip "Search All"
			if (value instanceof ISearchProvider) {
				ISearchProvider p = (ISearchProvider) value;
				setText(p.getName());
				setIcon(p.getIcon());
			}

			if (getIcon() == null) {
				setBorder(BorderFactory.createEmptyBorder(0,
						16 + getIconTextGap(), 0, 0));
			} else {
				setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
			}

			return this;
		}

	}

	class CoolButton extends JButton {

		public CoolButton(String text, Icon icon) {
			super(text, icon);
		}

		public void paintComponent(Graphics g) {
			Graphics2D g2d = (Graphics2D) g;

			int w = getWidth();
			int h = getHeight();

			g2d.setBackground(UIManager.getColor("control.background"));
			g2d.setColor(UIManager.getColor("control.text"));

			// create a rounded clip LARGER than the comp
			RoundRectangle2D.Float r2d = new RoundRectangle2D.Float(0, 0,
					w + 30, h - 1, 20, 20);

			// intersect this with the existing clip
			g2d.clip(r2d);

			// fill the clipped area
			// g2d.setPaint(LIGHT_GRADIENT);
			g2d.fillRect(0, 0, w, h);
			// restore original clip

			// paint outer border
			// g2d.setPaint(OUTER);
			g2d.drawRoundRect(0, 0, w + 30, h - 1, 20, 20);

			// paint inner border
			// g2d.setPaint(INNER);
			g2d.drawRoundRect(1, 1, w + 30, h - 3, 18, 18);

			// paint right outside border
			// g2d.setPaint(p1);
			g2d.drawLine(w - 1, 1, w - 1, h);

			// paint right inside border
			// g2d.setPaint(p2);
			g2d.drawLine(w - 2, 2, w - 2, h - 1);
			// make it translucent
			g2d.setComposite(AlphaComposite.getInstance(
					AlphaComposite.SRC_OVER, 0.1f));

			// paint the text and icon
			super.paintComponent(g);

		}
	}

	private void layoutComponents(boolean hasResults) {

		this.removeAll();

		FormLayout layout = new FormLayout(
				"fill:default:grow, 2dlu, pref,1dlu, pref, 2dlu",
				// 2 columns
				"fill:default:grow");

		// create a form builder
		DefaultFormBuilder builder = new DefaultFormBuilder(layout, this);

		// builder.append(contextButton);
		// builder.append(providerComboBox);

		// builder.append(moreButton);
		JLabel label = new JLabel("Search:");
		label.setLabelFor(textField);
		label.setDisplayedMnemonic('s');
		builder.append(label);

		builder.append(textField);

		builder.append(moreButton);

		// if ( hasResults)
		// builder.append(searchInsideCheckBox);

		// builder.append(moreButton);

		// builder.append(searchButton);

	}

	private void initComponents() {
		textField = new IconTextField(icon, 20);

		searchButton = new JButton("Search");
		searchButton.setMnemonic('s');

		searchInsideCheckBox = new JCheckBox("Search Inside");
		searchInsideCheckBox
				.setToolTipText("Search Inside Previous Search Results");
		searchInsideCheckBox.setMnemonic('i');
		searchInsideCheckBox.setSelected(false);
		// searchInsideCheckBox.setEnabled(false);

		action = new ContextSearchAction(frameMediator);

		contextButton = ToolBarButtonFactory.createButton(action);
		contextButton.setEnabled(true);

		moreButton = ToolBarButtonFactory.createButton("", new AscendingIcon(),
				false);
		moreButton.setIcon(new AscendingIcon());
		moreButton.setDisabledIcon(new AscendingIcon());
		moreButton.setMargin(new Insets(1, 1, 1, 1));
		moreButton.setToolTipText("Advanced Search Options...");

		providerComboBox = new JComboBox();
		providerComboBox.setRenderer(new MyComboBoxRenderer());

		providerComboBox.addItem("Search All");
		ISearchManager manager = searchPanel.getSearchManager();
		Iterator<ISearchProvider> it = manager.getAllProviders();
		while (it.hasNext()) {
			final ISearchProvider p = it.next();
			providerComboBox.addItem(p);
		}
	}

	class MyContextResultListener extends ContextResultListenerAdapter {

		@Override
		public void finished(IContextResultEvent event) {
			toggleButtonStates(true);
		}

	}

	class ContextSearchAction extends AbstractColumbaAction {
		ContextSearchAction(IFrameMediator mediator) {
			super(mediator, "What's related");
			putValue(SMALL_ICON, ImageLoader.getSmallIcon("system-search.png"));

			// large icon for toolbar
			putValue(LARGE_ICON, ImageLoader.getIcon("system-search.png"));

			putValue(AbstractColumbaAction.SHORT_DESCRIPTION, "What's related");
			putValue(AbstractColumbaAction.LONG_DESCRIPTION, "What's related");

			putValue(TOOLBAR_NAME, "What's related");

			setShowToolBarText(true);

		}

		public void actionPerformed(ActionEvent e) {
			toggleButtonStates(false);
			searchPanel.searchInContext();
		}

	}

	class MyKeyListener extends KeyAdapter {

		@Override
		public void keyReleased(KeyEvent e) {
			char ch = e.getKeyChar();

			if (ch == KeyEvent.VK_ENTER) {
				if (textField.getText().length() == 0)
					return;

				toggleButtonStates(false);

				// get first provider
//				ISearchProvider provider = searchPanel.getSearchManager()
//						.getAllProviders().next();
//				ISearchCriteria defaultCriteria = null;
//
//				SearchBar.this.searchPanel.searchInCriteria(
//						textField.getText(), provider.getTechnicalName(),
//						provider.getDefaultCriteria(textField.getText())
//								.getTechnicalName(), searchInsideCheckBox
//								.isSelected());

				 searchPanel.searchAll(textField.getText(), searchInsideCheckBox
						.isSelected());
			} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
				if (textField.getText().length() == 0)
					return;
				textField.showPopup();
				textField.getPopupMenu().requestFocus();
				textField.getPopupMenu().getSelectionModel()
						.setSelectedIndex(0);
			}

		}

	}

	public void popupMenuWillBecomeVisible(PopupMenuEvent e) {
		System.out.println("menu will become visible");

		// update popup menu based on searchterm
		updatePopupMenu(textField.getPopupMenu(), textField.getText());
	}

	public void popupMenuWillBecomeInvisible(PopupMenuEvent e) {
	}

	public void popupMenuCanceled(PopupMenuEvent e) {
	}

	private void updatePopupMenu(JPopupMenu menu, String searchTerm) {
		System.out.println("update menu=" + searchTerm);

		menu.removeAll();

		// add menuitem to search across all components
		// JMenuItem m2 = new JMenuItem("Search All");
		// m2.setToolTipText("Search across all components");
		// m2.addActionListener(new ActionListener() {
		// public void actionPerformed(ActionEvent e) {
		// searchPanel.searchAll(textField.getText(), searchInsideCheckBox
		// .isSelected());
		// }
		// });
		// menu.add(m2);
		// menu.addSeparator();

		ISearchManager manager = searchPanel.getSearchManager();
		Iterator<ISearchProvider> it = manager.getAllProviders();
		while (it.hasNext()) {
			final ISearchProvider p = it.next();

			// create a single menu item for all the search criteria
			// of this provider
			// JMenuItem m = new JMenuItem(p.getName());
			// m.setToolTipText(p.getDescription());
			// m.setIcon(p.getIcon());
			// m.addActionListener(new ActionListener() {
			// public void actionPerformed(ActionEvent e) {
			// searchPanel.searchInProvider(textField.getText(), p
			// .getTechnicalName(), searchInsideCheckBox.isSelected());
			// }
			// });
			// menu.add(m);

			JMenuItem m;
			// create all individual search criteria for this provider
			List<ISearchCriteria> v = p.getAllCriteria(searchTerm);
			Iterator<ISearchCriteria> it2 = v.iterator();
			while (it2.hasNext()) {
				final ISearchCriteria c = it2.next();
				if (c == null)
					continue;

				m = new JMenuItem(c.getTitle());
				m.setToolTipText(c.getDescription());
				m.setIcon(p.getIcon());
				m.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						searchPanel.searchInCriteria(textField.getText(), p
								.getTechnicalName(), c.getTechnicalName(),
								searchInsideCheckBox.isSelected());
					}
				});
				menu.add(m);
			}

			if (it.hasNext())
				menu.addSeparator();
		}

		menu.addSeparator();

		JMenuItem m = new JMenuItem("Advanced Search...");
		m.setToolTipText("Advanced Search...");
		m.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				toggleSearchDialogVisibility();
			}
		});
		menu.add(m);

		// create search history

		// Map<String, ISearchProvider> historyMap = SearchHistoryList
		// .getInstance().getHistoryMap();

		// if (historyMap.size() > 0) {
		// Iterator<String> it3 = historyMap.keySet().iterator();
		// while (it3.hasNext()) {
		// String term = it3.next();
		// ISearchProvider p = historyMap.get(term);
		// ISearchCriteria c = p.getAllCriteria(term);
		// if (c == null)
		// continue;
		//
		// JMenuItem m = new JMenuItem(c.getTitle());
		// m.setToolTipText(c.getDescription());
		// m.setIcon(c.getIcon());
		// m.setActionCommand(p.getName());
		// m.addActionListener(listener);
		// menu.add(m);
		// }
		//
		// menu.insert(new JSeparator(), menu.getComponentCount() -
		// historyMap.size());
		// }

		menu.revalidate();
		menu.pack();
	}

	public void install(JMenuBar menubar) {
		if (menubar == null)
			throw new IllegalArgumentException("menubar == null");

		Component box = Box.createHorizontalGlue();
		menubar.add(box);

		menubar.add(this);
	}

	public void install(JToolBar toolbar) {
		if (toolbar == null)
			throw new IllegalArgumentException("toolbar");

		toolbar.add(contextButton);

		JPanel p = new JPanel();
		p.setBorder(BorderFactory.createEmptyBorder(3, 0, 2, 0));
		p.setLayout(new BorderLayout());
		p.add(this, BorderLayout.EAST);

		toolbar.add(p);
	}

	class MyResultListener extends ResultListenerAdapter {

		MyResultListener() {
		}

		@Override
		public void finished(IResultEvent event) {
			// search is finished
			// -> enable search button again
			toggleButtonStates(true);

			// do layout again
			layoutComponents(true);
		}

	}

}
