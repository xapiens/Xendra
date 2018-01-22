package org.columba.core.gui.tagging;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.ResourceBundle;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import org.columba.core.gui.base.MnemonicSetter;
import org.columba.core.gui.base.SingleSideEtchedBorder;

import com.jgoodies.forms.factories.Borders;
import com.jgoodies.forms.factories.FormFactory;
import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.FormSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.Sizes;

public class EditTagDialog extends JDialog implements ActionListener {

	private JPanel dialogPane;

	private JPanel contentPanel;

	private JLabel label1;

	private JTextField textField1;

	private JLabel label2;

	private JButton button1;

	private JPanel buttonBar;

	private JButton okButton;

	private JButton cancelButton;

	private JLabel label3;

	private JScrollPane scrollPane1;

	private JTextArea textArea1;

	private String name;

	private Color color;

	private String description;

	private boolean success = false;

	private ResourceBundle bundle = ResourceBundle
			.getBundle("org.columba.core.i18n.dialog.tagging");

	public EditTagDialog(JFrame parent) {
		super(parent, true);

		setTitle(bundle.getString("EditTagDialog.title"));

		initComponents();

		
		layoutComponents();

		pack();
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public EditTagDialog(JFrame parent, String name, Color color,
			String description) {
		super(parent, true);

		this.name = name;
		this.color = color;
		this.description = description;

		setTitle(bundle.getString("EditTagDialog.title"));

		initComponents();

		layoutComponents();

		pack();
		setLocationRelativeTo(null);
		setVisible(true);
	}

	private void layoutComponents() {
		CellConstraints cc = new CellConstraints();

		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());

		dialogPane.setLayout(new BorderLayout());

		contentPanel.setBorder(Borders.DIALOG_BORDER);
		contentPanel.setLayout(new FormLayout(new ColumnSpec[] {
				new ColumnSpec(ColumnSpec.RIGHT, Sizes.DEFAULT,
						FormSpec.NO_GROW),
				FormFactory.LABEL_COMPONENT_GAP_COLSPEC,
				new ColumnSpec(ColumnSpec.FILL, Sizes.DEFAULT,
						FormSpec.DEFAULT_GROW) },
				new RowSpec[] {
						FormFactory.DEFAULT_ROWSPEC,
						FormFactory.LINE_GAP_ROWSPEC,
						FormFactory.DEFAULT_ROWSPEC,
						FormFactory.LINE_GAP_ROWSPEC,
						new RowSpec(RowSpec.FILL, Sizes.DEFAULT,
								FormSpec.DEFAULT_GROW) }));
		((FormLayout) contentPanel.getLayout()).setRowGroups(new int[][] { { 1,
				3 } });

		contentPanel.add(label1, cc.xy(1, 1));

		textField1.setColumns(10);
		contentPanel.add(textField1, cc.xy(3, 1));

		contentPanel.add(label2, cc.xy(1, 3));
		contentPanel.add(button1, cc.xywh(3, 3, 1, 1, CellConstraints.LEFT,
				CellConstraints.CENTER));

		contentPanel.add(label3, cc.xywh(1, 5, 1, 1, CellConstraints.DEFAULT,
				CellConstraints.TOP));

		textArea1.setColumns(15);
		textArea1.setRows(2);
		scrollPane1.setViewportView(textArea1);

		contentPanel.add(scrollPane1, cc.xy(3, 5));

		dialogPane.add(contentPanel, BorderLayout.CENTER);

		JPanel bottomBar = new JPanel();
		bottomBar.setLayout(new BorderLayout());
		bottomBar.add(buttonBar, BorderLayout.EAST);
		bottomBar.setBorder(new SingleSideEtchedBorder(SwingConstants.TOP));

		buttonBar.setBorder(BorderFactory.createEmptyBorder(12, 12, 12, 12));
		buttonBar.setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.GLUE_COLSPEC, FormFactory.BUTTON_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC, FormFactory.BUTTON_COLSPEC },
				RowSpec.decodeSpecs("pref")));

		buttonBar.add(okButton, cc.xy(2, 1));

		buttonBar.add(cancelButton, cc.xy(4, 1));

		dialogPane.add(bottomBar, BorderLayout.SOUTH);

		contentPane.add(dialogPane, BorderLayout.CENTER);
	}

	private void initComponents() {

		dialogPane = new JPanel();
		contentPanel = new JPanel();
		label1 = new JLabel();
		MnemonicSetter.setTextWithMnemonic(label1, bundle
				.getString("label1.text"));
		textField1 = new JTextField();
		
		label1.setLabelFor(textField1);
		if (name != null)
			textField1.setText(name);
		label2 = new JLabel();
		MnemonicSetter.setTextWithMnemonic(label2, bundle
				.getString("label2.text"));
		button1 = new JButton();
		label2.setLabelFor(button1);
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				color = JColorChooser.showDialog(null, "Choose Tag Color",
						color);
				if (color != null) {
					button1.setIcon(createIcon(color));
					button1.setText("");
				} else
					button1.setText("no Color");
			}
		});

		if (color != null)
			button1.setIcon(createIcon(color));
		else
			button1.setText("no Color");

		label3 = new JLabel();
		MnemonicSetter.setTextWithMnemonic(label3, bundle
				.getString("label3.text"));
		scrollPane1 = new JScrollPane();
		textArea1 = new JTextArea();
		if (description != null)
			textArea1.setText(description);

		label3.setLabelFor(textArea1);

		ResourceBundle globalBundle = ResourceBundle
				.getBundle("org.columba.core.i18n.global.global");

		buttonBar = new JPanel();
		okButton = new JButton();
		okButton.setActionCommand("OK");
		okButton.addActionListener(this);
		MnemonicSetter.setTextWithMnemonic(okButton, globalBundle
				.getString("ok"));
		cancelButton = new JButton();
		cancelButton.setActionCommand("CANCEL");
		cancelButton.addActionListener(this);
		MnemonicSetter.setTextWithMnemonic(cancelButton, globalBundle
				.getString("cancel"));
		
		textField1.getDocument().addDocumentListener(new MyDocumentListener());
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("OK")) {

			success = true;

			name = textField1.getText();
			description = textArea1.getText();

			setVisible(false);
		} else if (e.getActionCommand().equals("CANCEL")) {
			success = false;

			setVisible(false);
		}
	}

	private Icon createIcon(Color color) {
		int width = 16;
		int height = 16;
		BufferedImage image = new BufferedImage(width, height,
				BufferedImage.TYPE_INT_ARGB);

		Graphics2D graphics = (Graphics2D) image.getGraphics();
		graphics.setColor(color.darker());
		graphics.drawRect(1, 1, width - 3, height - 3);
		graphics.setColor(color);
		graphics.fillRect(2, 2, width - 4, height - 4);
		graphics.dispose();

		return new ImageIcon(image);
	}

	public boolean getSuccess() {
		return success;
	}

	public Color getColor() {
		return color;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	class MyDocumentListener implements DocumentListener {

		public void changedUpdate(DocumentEvent e) {
			handleUpdate(e);
		}

		public void insertUpdate(DocumentEvent e) {
			handleUpdate(e);
		}

		public void removeUpdate(DocumentEvent e) {
			handleUpdate(e);
		}

		private void handleUpdate(DocumentEvent e) {
			if ( textField1.getText() == null || textField1.getText().length() == 0 )
				okButton.setEnabled(false);
			else 
				okButton.setEnabled(true);
		}

	}
}
