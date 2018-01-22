package org.columba.core.gui.search;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

import org.columba.core.gui.base.SingleSideEtchedBorder;
import org.columba.core.gui.search.api.ICriteriaRenderer;
import org.columba.core.search.api.ISearchCriteria;
import org.columba.core.search.api.ISearchProvider;

import com.jgoodies.forms.builder.DefaultFormBuilder;
import com.jgoodies.forms.factories.ButtonBarFactory;
import com.jgoodies.forms.layout.FormLayout;

class SearchDialog extends JDialog {

	private JRadioButton rb1;

	private JRadioButton rb2;

	private CriteriaPanel criteriaPanel;

	private JButton searchButton;

	private JButton helpButton;

	private JButton clearButton;

	private JButton closeButton;

	private boolean success = false;

	public SearchDialog(JFrame parent, Iterator<ISearchProvider> it) {
		super(parent, true);

		setUndecorated(true);

		// Border border = BorderFactory.createCompoundBorder(new
		// ShadowBorder(),BorderFactory.createEmptyBorder(10, 10, 10,10));
		// ((JPanel) getContentPane()).setBorder(border);
		((JPanel) getContentPane()).setBorder(BorderFactory.createLineBorder(Color.lightGray));

		initCriteriaPanel(it);
		initComponents();
		layoutComponents();

		pack();

		initListeners();

		getRootPane().setDefaultButton(searchButton);
	}

	private void initListeners() {
		searchButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				success = true;
				setVisible(false);
			}
		});

		clearButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				criteriaPanel.clear();
			}
		});

		closeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
	}

	@Override
	public void setVisible(boolean b) {
		super.setVisible(b);

		if (b)
			success = true;
	}

	private void layoutComponents() {

		setLayout(new BorderLayout());

		JPanel topPanel = new JPanel();
		topPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 0, 10));

		FormLayout layout = new FormLayout(
				"left:default:grow, 12dlu, right:default, 3dlu, right:default",
				"");

		// create a form builder
		DefaultFormBuilder builder = new DefaultFormBuilder(layout, topPanel);

		builder.append(new JLabel());
		builder.append(rb1);
		builder.append(rb2);

		add(topPanel, BorderLayout.NORTH);
		add(criteriaPanel, BorderLayout.CENTER);

		JPanel bottomPanel = ButtonBarFactory.buildHelpBar(helpButton,
				searchButton, clearButton, closeButton);

		bottomPanel.setBorder(BorderFactory.createCompoundBorder(
				new SingleSideEtchedBorder(SwingConstants.TOP), BorderFactory
						.createEmptyBorder(8, 8, 8, 8)));

		add(bottomPanel, BorderLayout.SOUTH);
	}

	private void initCriteriaPanel(Iterator<ISearchProvider> it) {
		criteriaPanel = new CriteriaPanel();
		criteriaPanel.setBorder(BorderFactory.createEmptyBorder(0, 10, 10, 10));

		boolean firstTime = true;
		while (it.hasNext()) {
			ISearchProvider p = it.next();
			System.out.println("provider=" + p.getName());

			JLabel label = new JLabel(p.getName());
			label.setIcon(p.getIcon());
			label.setFont(label.getFont().deriveFont(Font.BOLD));

			if (!firstTime)
				label.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));
			else
				firstTime = false;

			criteriaPanel.addSeparator(label);
			Iterator<ISearchCriteria> it2 = p.getAllCriteria("").listIterator();
			while (it2.hasNext()) {
				ISearchCriteria c = it2.next();
				System.out.println("criteria=" + c.getName());

				ICriteriaRenderer r = p.getCriteriaRenderer(c
						.getTechnicalName());
				if (r != null)
					criteriaPanel.addRenderer(r);
			}

		}
	}

	private void initComponents() {
		rb1 = new JRadioButton("Match All Words");
		rb1.setOpaque(false);
		rb1.setSelected(true);
		rb2 = new JRadioButton("Match Any");
		rb2.setOpaque(false);
		ButtonGroup group = new ButtonGroup();
		group.add(rb1);
		group.add(rb2);

		searchButton = new JButton("Search");
		searchButton.setMnemonic('s');
		searchButton.setDefaultCapable(true);

		helpButton = new JButton("Help");
		helpButton.setMnemonic('h');

		clearButton = new JButton("Clear");
		clearButton.setMnemonic('l');

		closeButton = new JButton("Close");
		closeButton.setMnemonic('c');

	}

	public boolean isSuccess() {
		return success;
	}

	public boolean isMatchAll() {
		return rb1.isSelected();
	}

	public Iterator<ICriteriaRenderer> getAllCriteriaRenderer() {
		return criteriaPanel.getAllRenderers();
	}

	class CriteriaPanel extends JPanel {

		private List<ICriteriaRenderer> list = new Vector<ICriteriaRenderer>();

		private DefaultFormBuilder builder;

		CriteriaPanel() {

			FormLayout layout = new FormLayout(
					"3dlu, right:default, 6dlu, left:default:grow, 12dlu, right:default, 6dlu, left:default:grow",
					"");

			// create a form builder
			builder = new DefaultFormBuilder(layout, this);
			builder.setLeadingColumnOffset(1);
		}

		public void addSeparator(JComponent c) {

			builder.nextLine();
			builder.appendRow("default");
			builder.setLeadingColumnOffset(0);
			builder.append(c, 6);
			builder.nextLine();
			builder.setLeadingColumnOffset(1);

		}

		public void addRenderer(ICriteriaRenderer renderer) {
			if (renderer == null)
				throw new IllegalArgumentException("renderer == null");

			list.add(renderer);

			builder.append(renderer.getLabel());
			builder.append(renderer.getEditor());
		}

		public void removeRenderer(ICriteriaRenderer renderer) {
			list.remove(renderer);
		}

		public void removeRenderer(int index) {
			list.remove(index);
		}

		public Iterator<ICriteriaRenderer> getAllRenderers() {
			return list.listIterator();
		}

		public void clear() {
			Iterator<ICriteriaRenderer> it = getAllRenderers();
			while (it.hasNext()) {
				ICriteriaRenderer r = it.next();
				r.clear();
			}
		}
	}

}
