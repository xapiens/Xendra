package org.columba.core.gui.util;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.columba.core.gui.base.ButtonWithMnemonic;
import org.columba.core.gui.base.CheckBoxWithMnemonic;
import org.columba.core.gui.base.LabelWithMnemonic;
import org.columba.core.resourceloader.GlobalResourceLoader;
import org.columba.core.resourceloader.IconKeys;
import org.columba.core.resourceloader.ImageLoader;
import org.columba.core.util.FindReplace;
import org.columba.core.util.IViewableText;
import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;

@SuppressWarnings("serial")
public class FindDialog extends JDialog implements ActionListener{
	private static final String RESOURCE_PATH = "org.columba.core.i18n.dialog";
	
	private LabelWithMnemonic findLabel;
	
	private ButtonWithMnemonic findButton;
	private ButtonWithMnemonic findNextButton;
	private ButtonWithMnemonic closeButton;
	
	private CheckBoxWithMnemonic wholeWordCheckBox;
	private CheckBoxWithMnemonic caseSensCheckBox;
	private CheckBoxWithMnemonic findBackCheckBox;
	
	private JTextField findTextField;
	
	//private JTextPane textpane;
	private IViewableText text;
	
	private FindReplace finder = new FindReplace();


	public FindDialog(IViewableText text) {
		setTitle(GlobalResourceLoader.getString(RESOURCE_PATH,"find","find.title"));
		createComponents();
		initComponents();
		setResizable(false);
		pack();
		this.text = text;
		setVisible(true);
	}
	
	private void createComponents(){
		
		findLabel = new LabelWithMnemonic(GlobalResourceLoader.getString(RESOURCE_PATH,"find","findlabel"));
		
		findTextField = new JTextField(16);

		wholeWordCheckBox = new CheckBoxWithMnemonic(GlobalResourceLoader.getString(RESOURCE_PATH,"find","matchword"));
		caseSensCheckBox = new CheckBoxWithMnemonic(GlobalResourceLoader.getString(RESOURCE_PATH,"find","matchcase"));
		findBackCheckBox = new CheckBoxWithMnemonic(GlobalResourceLoader.getString(RESOURCE_PATH,"find","findbackwards"));

		findButton = new ButtonWithMnemonic(GlobalResourceLoader.getString(RESOURCE_PATH,"find","find"));
		findNextButton = new ButtonWithMnemonic(GlobalResourceLoader.getString(RESOURCE_PATH,"find","findnext"));
		closeButton = new ButtonWithMnemonic(GlobalResourceLoader.getString(RESOURCE_PATH,"find","close"));

	}
	private void initComponents(){
		
		FormLayout layout = new FormLayout("pref, 6dlu, pref", // columns 
        "pref, 3dlu, pref"); // rows
		
		CellConstraints cc = new CellConstraints();
		
		JPanel panelMain = new JPanel(layout);
		panelMain.setBorder(BorderFactory.createEmptyBorder(12,12,12,12));
		

		panelMain.add(createInputPanel(),cc.xy(1,1));
		panelMain.add(createButtonPanel(),cc.xywh(3,1,1,3));
		panelMain.add(createOptionPanel(),cc.xy(1,3));
		
		getContentPane().add(panelMain,BorderLayout.SOUTH);
		getContentPane().add(
				new DialogHeaderPanel(GlobalResourceLoader.getString(RESOURCE_PATH,
						"find", "header_title"), GlobalResourceLoader
						.getString(RESOURCE_PATH, "find", "header_description"),
						ImageLoader.getIcon(IconKeys.SEARCH)),
				BorderLayout.NORTH);
	}
	
	private JPanel createInputPanel(){
		FormLayout layout = new FormLayout("left:pref, 6dlu, pref",
				"pref");
		CellConstraints cc = new CellConstraints();
		JPanel inputPanel = new JPanel(layout);
		
		inputPanel.add(findLabel,cc.xy(1,1));
		findLabel.setLabelFor(findTextField);
		inputPanel.add(findTextField,cc.xy(3,1));
		
		return inputPanel;
	}
	
	private JPanel createOptionPanel(){
		// create a panel with a border and 3 options
		FormLayout layout = new FormLayout("3dlu, left:pref, 30dlu, right:pref, 3dlu", // columns 
        	"pref, 3dlu, pref"); // rows
		
		CellConstraints cc = new CellConstraints();
		
		JPanel optionPanel = new JPanel(layout);
		optionPanel.setBorder(BorderFactory.createTitledBorder(GlobalResourceLoader.getString(RESOURCE_PATH,"findreplace","options")));
	
		optionPanel.add(caseSensCheckBox,cc.xy(2,1));
		optionPanel.add(wholeWordCheckBox,cc.xywh(2,3,3,1));
		optionPanel.add(findBackCheckBox,cc.xy(4,1));
		
		return optionPanel;
	}

	private JPanel createButtonPanel(){
		// create a panel with all 4 buttons of the window
		FormLayout layout = new FormLayout("fill:pref", // columns 
			"pref, 3dlu, pref, 3dlu, pref"); // rows
		CellConstraints cc = new CellConstraints();
		JPanel buttonPanel = new JPanel(layout);
		
		
		findButton.addActionListener(this);
		findButton.setActionCommand("FIND");

		findNextButton.addActionListener(this);
		findNextButton.setActionCommand("FINDNEXT");
		this.getRootPane().setDefaultButton(findNextButton);
		
		closeButton.addActionListener(this);
		closeButton.setActionCommand("CLOSE");

		buttonPanel.add(findButton,cc.xy(1,1));
		buttonPanel.add(findNextButton,cc.xy(1,3));
		buttonPanel.add(closeButton,cc.xy(1,5));
	
		return buttonPanel;
	}
	
	
	public void actionPerformed(ActionEvent e) {
		
		// if some action was performed
		String action = e.getActionCommand();
		String source = new String("");
		try {
			source = text.getText();
		} catch (NullPointerException e1)
		{
			if (!action.equals("CLOSE"))
				return;
		}
		
		// get text where to find pattern
		finder.setPattern(findTextField.getText());
		finder.setSource(source);
		finder.setCaseSensitive(caseSensCheckBox.isSelected());
		finder.setMatchWholeWord(wholeWordCheckBox.isSelected());
		finder.setBackwards(findBackCheckBox.isSelected());		
		
		if (action.equals("FIND")) {
		
			// find pattern
			int position = finder.find();

			if(position>=0) {
				// mark found pattern
				//text.grabFocus();
				mark(position,position + findTextField.getText().length());
			} else
				// delete marks
				{
					mark(0, 0);
					JOptionPane.showMessageDialog(this, "String was not found!");
				}
				
			
		}
		else if (action.equals("FINDNEXT")){
			// get position of the pattern in the text
			int position = finder.findnext();
			
			if(position>=0) {
				// mark found pattern (select)
				//text.grabFocus();				
				mark(position,position + findTextField.getText().length());
			} else
				// delete marks (unselect)
			{
				mark(0, 0);
				JOptionPane.showMessageDialog(this, "String was not found!");
			}
		}
		else if (action.equals("CLOSE")){
			this.dispose();
		}
	}
	
	private void mark(int start, int end) {
		text.setCaretPosition(start);
		text.moveCaretPosition(end);
	}	
}
