//The contents of this file are subject to the Mozilla Public License Version 1.1
//(the "License"); you may not use this file except in compliance with the 
//License. You may obtain a copy of the License at http://www.mozilla.org/MPL/
//
//Software distributed under the License is distributed on an "AS IS" basis,
//WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License 
//for the specific language governing rights and
//limitations under the License.
//
//The Original Code is "The Columba Project"
//
//The Initial Developers of the Original Code are Frederik Dietz and Timo Stich.
//Portions created by Frederik Dietz and Timo Stich are Copyright (C) 2003. 
//
//All Rights Reserved.

package org.columba.core.gui.config;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.Locale;
import java.util.Properties;
import java.util.logging.Level;

import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;

import org.columba.api.gui.frame.IContainer;
import org.columba.api.plugin.IExtension;
import org.columba.api.plugin.IExtensionHandler;
import org.columba.api.plugin.IExtensionHandlerKeys;
import org.columba.api.plugin.PluginHandlerNotFoundException;
import org.columba.api.plugin.PluginLoadingFailedException;
import org.columba.core.config.Config;
import org.columba.core.config.Gui;
//import org.columba.core.config.GuiItem;
import org.columba.core.gui.base.ButtonWithMnemonic;
import org.columba.core.gui.base.CheckBoxWithMnemonic;
import org.columba.core.gui.base.LabelWithMnemonic;
import org.columba.core.gui.base.SingleSideEtchedBorder;
import org.columba.core.gui.dialog.FontSelectionDialog;
import org.columba.core.gui.frame.FrameManager;
import org.columba.core.gui.plugin.ConfigurationDialog;
import org.columba.core.gui.themes.ThemeSwitcher;
import org.columba.core.gui.util.DialogHeaderPanel;
import org.columba.core.gui.util.FontProperties;
import org.columba.core.help.HelpManager;
import org.columba.core.plugin.PluginManager;
import org.columba.core.resourceloader.GlobalResourceLoader;
import org.compiere.model.MRole;
import org.compiere.print.CPrinter;
import org.compiere.swing.CCheckBox;
import org.compiere.swing.CComboBox;
import org.compiere.swing.CLabel;
import org.compiere.util.CLogMgt;
import org.compiere.util.Env;
import org.compiere.util.Ini;
import org.compiere.util.Msg;

import com.jgoodies.forms.builder.DefaultFormBuilder;
import com.jgoodies.forms.layout.FormLayout;

/**
 * Shows a dialog for managing general options such as font settings.
 */
public class GeneralOptionsDialog extends JDialog implements ActionListener {
	
	private static final String RESOURCE_PATH = "org.columba.core.i18n.dialog";

	// button panel
	protected JButton okButton;
	protected JButton cancelButton;
	protected JButton helpButton;

	// look and feel
	protected JLabel lfLabel;
	protected JComboBox lfComboBox;
	protected JButton lfButton;
	private String theme = null;
	private IExtensionHandler handler;

	// fonts
	protected JCheckBox overwriteCheckBox;
	protected JLabel mainFontLabel;
	protected JLabel textFontLabel;
	protected JButton mainFontButton;
	protected JButton textFontButton;

	private Font mainFont;
	private Font textFont;

	// toolbar
	protected JLabel toolbarLabel;
	protected JComboBox toolbarComboBox;

	// language
	protected JLabel languageLabel;
	protected JComboBox languageComboBox;
	protected JFrame frame;
	protected IExtensionHandler configHandler;

	// HTTP proxy
	protected JLabel proxyLabel;
	protected JButton proxyButton;
	protected String proxyHost;
	protected int proxyPort;

	// ID of configuration plugin of this theme plugin
	protected String configID;

	// Login
	private CCheckBox autoLogin;
	private CCheckBox storePassword;
	
	// Window
	private CCheckBox showAcct;
	private CCheckBox showTrl;
	private CCheckBox showAdvanced;
	private CCheckBox autoCommit;
	private CCheckBox autoNew;
	private CCheckBox cacheWindow;
	private CCheckBox openWindowMaximized;
	private CCheckBox singleInstancePerWindow;
	
	// Connection
	private CCheckBox validateConnectionOnStartup;
	
	// Trace
	private CComboBox traceLevel;
	private CCheckBox traceFile;
	private CCheckBox debug;

	// Print
	private CLabel lPrinter;
	private CPrinter fPrinter;
	private CCheckBox printPreview;
	
	private boolean restartRequired = false;

	private String oldLookAndFeelName;

	public GeneralOptionsDialog(JFrame frame) {
		super(frame, GlobalResourceLoader.getString(RESOURCE_PATH, "general","dialog_title"), true);
		this.frame = frame;
		try {
			// get theme plugin-handler
			handler = PluginManager.getInstance().getExtensionHandler(IExtensionHandlerKeys.ORG_COLUMBA_CORE_THEME);
		} catch (PluginHandlerNotFoundException ex) {
			ex.printStackTrace();
		}

		try {
			// get config plugin-handler
			configHandler = PluginManager.getInstance().getExtensionHandler(IExtensionHandlerKeys.ORG_COLUMBA_CORE_CONFIG);
		} catch (PluginHandlerNotFoundException ex) {
			ex.printStackTrace();
		}

		initComponents();
		layoutComponents();
		updateComponents(true);

		pack();
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public void updateComponents(boolean b) {

		//@SuppressWarnings("deprecation")
		Gui item = Config.getInstance().getOptions().getGui();
		//GuiItem item = ((Config) Config.getInstance()).getOptionsConfig().getGuiItem();

		if (b) {
			// look and feel
			//theme = item.getString(GuiItem.THEME, GuiItem.NAME);
			theme = item.getTheme().getName();
			oldLookAndFeelName = theme;

			lfComboBox.setSelectedItem(theme);

			// fonts
			//String mainName = item.getStringWithDefault(GuiItem.FONT_MAIN, GuiItem.NAME, "default");
			String mainName = item.getFonts().getMain().getName();
			//int mainSize = item.getIntegerWithDefault(GuiItem.FONT_MAIN, GuiItem.SIZE_INT, 12);
			int mainSize = item.getFonts().getMain().getSize();
			mainFont = new Font(mainName, Font.PLAIN, mainSize);

			//String textName = item.getStringWithDefault(GuiItem.FONT_TEXT, GuiItem.NAME, "default");
			String textName = item.getFonts().getText().getName();
			//int textSize = item.getIntegerWithDefault(GuiItem.FONT_TEXT, GuiItem.SIZE_INT, 12);
			int textSize = item.getFonts().getText().getSize();
			textFont = new Font(textName, Font.PLAIN, textSize);

			mainFontButton.setText(mainName);
			mainFontButton.setFont(mainFont);
			textFontButton.setText(textName);
			textFontButton.setFont(textFont);

			//boolean overwrite = item.getBooleanWithDefault(GuiItem.FONT, GuiItem.OVERWRITE_BOOL, false);
			boolean overwrite = item.getFonts().getOverwrite();

			overwriteCheckBox.setSelected(overwrite);				

			// enable/disable button, too
			textFontButton.setEnabled(overwrite);
			textFontLabel.setEnabled(overwrite);
			mainFontButton.setEnabled(overwrite);
			mainFontLabel.setEnabled(overwrite);

			// language
			Locale[] available = GlobalResourceLoader.getAvailableLocales();
			languageComboBox.setModel(new DefaultComboBoxModel(available));

			// select Locale in ComboBox
			for (int i = 0; i < available.length; i++) {
				if (available[i].equals(Locale.getDefault())) {
					languageComboBox.setSelectedIndex(i);
					break;
				}
			}

			//boolean enableText = item.getBooleanWithDefault(GuiItem.TOOLBAR, GuiItem.ENABLE_TEXT_BOOL, true);
			boolean enableText = item.getToolbar().isEnable_text();

			//boolean alignment = item.getBooleanWithDefault(GuiItem.TOOLBAR, GuiItem.TEXT_POSITION_BOOL, true);
			boolean alignment = item.getToolbar().isText_position();

			if (enableText) {
				toolbarComboBox.setSelectedIndex(alignment ? 1 : 2);
			}

			proxyHost = System.getProperty("http.proxyHost");
			String proxyPortString = System.getProperty("http.proxyPort", "-1");
			proxyPort = Integer.parseInt(proxyPortString);
			updateProxyButtonText();
		} else {
			// fonts
			//item.setString(GuiItem.FONT_MAIN, GuiItem.NAME, getMainFont().getName());
			item.getFonts().getMain().setName(getMainFont().getName());
			//item.setInteger(GuiItem.FONT_MAIN, GuiItem.SIZE_INT, getMainFont().getSize());
			item.getFonts().getMain().setSize(getMainFont().getSize());

			//item.setString(GuiItem.FONT_TEXT, GuiItem.NAME, getTextFont().getName());
			item.getFonts().getText().setName(getTextFont().getName());
			//item.setInteger(GuiItem.FONT_TEXT, GuiItem.SIZE_INT, getTextFont().getSize());
			item.getFonts().getText().setSize(getTextFont().getSize());

			//item.setBoolean(GuiItem.FONT, GuiItem.OVERWRITE_BOOL, overwriteCheckBox.isSelected());
			item.getFonts().setOverwrite(overwriteCheckBox.isSelected());

			// notify all listeners
			// @see org.columba.core.gui.util.FontProperties
			// @see org.columba.mail.gui.message.TextViewer
			// @see org.columba.mail.gui.composer.text.TextEditorController
			//item.getElement("fonts").notifyObservers();
			item.getFonts().notifyObservers();

			// look and feel
			//item.setString(GuiItem.THEME, GuiItem.NAME, (String) lfComboBox.getSelectedItem());
			item.getTheme().setName((String) lfComboBox.getSelectedItem());
			Ini.setProperty(Ini.P_A_COMMIT, (autoCommit.isSelected()));
			Env.setAutoCommit(Env.getCtx(), autoCommit.isSelected());
			Ini.setProperty(Ini.P_A_NEW, (autoNew.isSelected()));
			Env.setAutoNew(Env.getCtx(), autoNew.isSelected());
			//	AutoLogin
			Ini.setProperty(Ini.P_A_LOGIN, (autoLogin.isSelected()));
			//	Save Password
			Ini.setProperty(Ini.P_STORE_PWD, (storePassword.isSelected()));
			//	Show Acct Tab
			Ini.setProperty(Ini.P_SHOW_ACCT, (showAcct.isSelected()));
			Env.setContext(Env.getCtx(), "#ShowAcct", (showAcct.isSelected()));
			//	Show Trl Tab
			Ini.setProperty(Ini.P_SHOW_TRL, (showTrl.isSelected()));
			Env.setContext(Env.getCtx(), "#ShowTrl", (showTrl.isSelected()));
			//	Show Advanced Tab
			Ini.setProperty(Ini.P_SHOW_ADVANCED, (showAdvanced.isSelected()));
			Env.setContext(Env.getCtx(), "#ShowAdvanced", (showAdvanced.isSelected()));
			Ini.setProperty(Ini.P_CACHE_WINDOW, cacheWindow.isSelected());
			//  Print Preview
			Ini.setProperty(Ini.P_PRINTPREVIEW, (printPreview.isSelected()));

			Ini.setProperty(Ini.P_UI_THEME, (String) lfComboBox.getSelectedItem());			
			//  Validate Connection on Startup
			Ini.setProperty(Ini.P_VALIDATE_CONNECTION_ON_STARTUP, (validateConnectionOnStartup.isSelected()));
			//  Single Instance per Window
			Ini.setProperty(Ini.P_SINGLE_INSTANCE_PER_WINDOW, (singleInstancePerWindow.isSelected()));
			//  Open Window Maximized
			Ini.setProperty(Ini.P_OPEN_WINDOW_MAXIMIZED, (openWindowMaximized.isSelected()));
			//	TraceLevel/File
			Level level = (Level)traceLevel.getSelectedItem();
			CLogMgt.setLevel(level);
			CLogMgt.DEBUG = debug.isSelected();
			Ini.setProperty(Ini.P_TRACELEVEL, level.getName());
			Ini.setProperty(Ini.P_TRACEFILE, traceFile.isSelected());
			//  Printer
			String printer = (String)fPrinter.getSelectedItem();
			Env.setContext(Env.getCtx(), "#Printer", printer);
			Ini.setProperty(Ini.P_PRINTER, printer);
			
			Ini.saveProperties(true);
			//Ini.setProperty(Ini.P_UI_LOOK, );

			// remember if Look And Feel has been changed
			if (!oldLookAndFeelName.equals((String) lfComboBox.getSelectedItem()))
				restartRequired = true;

			// get language configuration
			//XmlElement locale = Config.getInstance().get("options").getElement("/options/locale");
			org.columba.core.config.Locale locale = Config.getInstance().getOptions().getLocale();

			// set language config based on selected item
			Locale l = (Locale) languageComboBox.getSelectedItem();
			//locale.addAttribute("language", l.getLanguage());
			locale.setLanguage(l.getLanguage());
			//locale.addAttribute("country", l.getCountry());
			locale.setCountry(l.getCountry());
			//locale.addAttribute("variant", l.getVariant());
			locale.setVariant(l.getVariant());

			int state = toolbarComboBox.getSelectedIndex();
			if (state == 0) {
				//item.setBoolean(GuiItem.TOOLBAR, GuiItem.ENABLE_TEXT_BOOL,	false);
				item.getToolbar().setEnable_text(false);
			} else {
				//item.setBoolean(GuiItem.TOOLBAR, GuiItem.ENABLE_TEXT_BOOL,	true);
				item.getToolbar().setEnable_text(true);
				//item.setBoolean(GuiItem.TOOLBAR, GuiItem.TEXT_POSITION_BOOL, state == 1 ? true : false);
				item.getToolbar().setText_position(state == 1 ? true : false);
			}

			//XmlElement options = Config.getInstance().get("options").getElement("/options");			

			//XmlElement proxy = options.getElement("proxy");
			if (proxyHost != null && proxyPort > 0) {
				System.setProperty("http.proxyHost", proxyHost);
				System.setProperty("http.proxyPort", Integer
						.toString(proxyPort));
				//if (proxy == null) {
				//	proxy = options.addSubElement("proxy");
				//}
				//proxy.addAttribute("host", proxyHost);
				Config.getInstance().getOptions().getProxy().setHost(proxyHost);
				//proxy.addAttribute("port", Integer.toString(proxyPort));
				Config.getInstance().getOptions().getProxy().setPort(String.valueOf(proxyPort));
			} else {
				Properties properties = System.getProperties();
				properties.remove("http.proxyHost");
				properties.remove("http.proxyPort");
				//if (proxy != null) {
				//	options.removeElement(proxy);
				//}
			}
		}
	}

	protected void layoutComponents() {
		JPanel contentPane = new JPanel(new BorderLayout());
		//setContentPane(contentPane);

		// Create a FormLayout instance.
		FormLayout layout = new FormLayout("12dlu, pref, 3dlu, max(40dlu;pref), 3dlu, pref",/* 3 columns*/ "");

		// create a form builder
		DefaultFormBuilder builder = new DefaultFormBuilder(layout);

		// create EmptyBorder between components and dialog-frame
		builder.setDefaultDialogBorder();

		// skip the first column
		builder.setLeadingColumnOffset(1);

		// Add components to the panel:
		builder.appendSeparator(GlobalResourceLoader.getString(RESOURCE_PATH,"general", "general"));
		builder.nextLine();

		builder.append(languageLabel);
		builder.append(languageComboBox, 3);
		builder.nextLine();

		builder.append(lfLabel, lfComboBox, lfButton);
		builder.nextLine();

		builder.append(toolbarLabel);
		builder.append(toolbarComboBox, 3);
		builder.nextLine();

		builder.append(proxyLabel);
		builder.append(proxyButton, 3);
		builder.nextLine();

		builder.appendSeparator(GlobalResourceLoader.getString(RESOURCE_PATH,"general", "fonts"));
		builder.nextLine();

		builder.append(overwriteCheckBox, 5);
		builder.nextLine();

		builder.append(mainFontLabel);
		builder.append(mainFontButton, 3);
		builder.nextLine();

		builder.append(textFontLabel);
		builder.append(textFontButton, 3);
		builder.nextLine();

		// 
		builder.appendSeparator(Msg.getMsg(Env.getCtx(), "Login"));
		builder.nextLine();		
		builder.append(autoLogin);
		builder.append(storePassword);
		builder.nextLine();
		//
		builder.appendSeparator(Msg.getMsg(Env.getCtx(), "Window"));
		builder.nextLine();
		builder.append(showAcct);
		builder.append(showTrl);
		builder.append(showAdvanced);
		builder.nextLine();
		builder.append(autoCommit);		
		builder.append(autoNew);
		builder.append(cacheWindow);
		builder.nextLine();
		builder.append(openWindowMaximized);
		builder.append(singleInstancePerWindow);
		builder.nextLine();
		//
		builder.appendSeparator(Msg.getMsg(Env.getCtx(), "Connection"));
		builder.nextLine();
		builder.append(validateConnectionOnStartup);
		builder.nextLine();
		//
		builder.appendSeparator(Msg.getMsg(Env.getCtx(), "TraceInfo"));
		builder.nextLine();
		builder.append(traceLevel);
		builder.append(traceFile, debug);		
		//
		builder.appendSeparator(Msg.getMsg(Env.getCtx(), "Printing"));
		builder.nextLine();
		builder.append(lPrinter);
		builder.append(fPrinter);
		builder.append(printPreview);
		//
		JScrollPane scrollPane_4 = new JScrollPane();
		   scrollPane_4.setBorder(BorderFactory.createEmptyBorder());
		this.add(scrollPane_4);
		
		scrollPane_4.setViewportView(contentPane);
		   
		contentPane.add(builder.getPanel(), BorderLayout.CENTER);

		// init bottom panel with OK, Cancel buttons
		JPanel bottomPanel = new JPanel(new BorderLayout(0, 0));
		bottomPanel.setBorder(new SingleSideEtchedBorder(SwingConstants.TOP));

		JPanel buttonPanel = new JPanel(new GridLayout(1, 3, 6, 0));
		buttonPanel.setBorder(BorderFactory.createEmptyBorder(12, 12, 12, 12));

		buttonPanel.add(okButton);
		buttonPanel.add(cancelButton);
		buttonPanel.add(helpButton);

		bottomPanel.add(buttonPanel, BorderLayout.EAST);
		contentPane.add(bottomPanel, BorderLayout.SOUTH);

		getRootPane().setDefaultButton(okButton);
		getRootPane().registerKeyboardAction(this, "CANCEL", KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0),	JComponent.WHEN_IN_FOCUSED_WINDOW);

		contentPane.add(new DialogHeaderPanel(GlobalResourceLoader.getString(
				RESOURCE_PATH, "general", "title_header"), GlobalResourceLoader
				.getString(RESOURCE_PATH, "general", "title_description")),
				BorderLayout.NORTH);
	}

	protected void initComponents() {
		lfLabel = new LabelWithMnemonic(GlobalResourceLoader.getString(
				RESOURCE_PATH, "general", "look_feel"));

		String[] plugins = handler.getPluginIdList();
		lfComboBox = new JComboBox(plugins);
		lfComboBox.setRenderer(new ThemeComboBoxRenderer());
		lfComboBox.setActionCommand("THEME");
		lfComboBox.addActionListener(this);
		lfLabel.setLabelFor(lfComboBox);

		lfButton = new ButtonWithMnemonic(GlobalResourceLoader.getString(
				RESOURCE_PATH, "general", "look_feel_options"));
		lfButton.setActionCommand("THEME_OPTIONS");
		lfButton.addActionListener(this);

		overwriteCheckBox = new CheckBoxWithMnemonic(GlobalResourceLoader
				.getString(RESOURCE_PATH, "general", "override_fonts"));
		overwriteCheckBox.addActionListener(this);

		autoLogin = new CCheckBox();
		autoLogin.setText(Msg.getMsg(Env.getCtx(), "AutoLogin", true));
		autoLogin.setToolTipText(Msg.getMsg(Env.getCtx(), "AutoLogin", false));
		autoLogin.setSelected(Ini.isPropertyBool(Ini.P_A_LOGIN));
		
		storePassword = new CCheckBox();
		storePassword.setText(Msg.getMsg(Env.getCtx(), "StorePassword", true));
		storePassword.setToolTipText(Msg.getMsg(Env.getCtx(), "StorePassword", false));
		storePassword.setSelected(Ini.isPropertyBool(Ini.P_STORE_PWD));
		
		showAcct = new CCheckBox();
		showAcct.setText(Msg.getMsg(Env.getCtx(), "ShowAcctTab", true));
		showAcct.setToolTipText(Msg.getMsg(Env.getCtx(), "ShowAcctTab", false));
		if (MRole.getDefault().isShowAcct())
			showAcct.setSelected(Ini.isPropertyBool(Ini.P_SHOW_ACCT));
		else
		{
			showAcct.setSelected(false);
			showAcct.setReadWrite(false);
		}

		showTrl = new CCheckBox();
		showTrl.setText(Msg.getMsg(Env.getCtx(), "ShowTrlTab", true));
		showTrl.setToolTipText(Msg.getMsg(Env.getCtx(), "ShowTrlTab", false));
		showTrl.setSelected(Ini.isPropertyBool(Ini.P_SHOW_TRL));

		showAdvanced = new CCheckBox();
		showAdvanced.setText(Msg.getMsg(Env.getCtx(), "ShowAdvancedTab", true));
		showAdvanced.setToolTipText(Msg.getMsg(Env.getCtx(), "ShowAdvancedTab", false));
		showAdvanced.setSelected(Ini.isPropertyBool(Ini.P_SHOW_ADVANCED));
		
		autoCommit = new CCheckBox();
		autoCommit.setText(Msg.getMsg(Env.getCtx(), "AutoCommit", true));
		autoCommit.setToolTipText(Msg.getMsg(Env.getCtx(), "AutoCommit", false));
		autoCommit.setSelected(Env.isAutoCommit(Env.getCtx()));
		
		autoNew = new CCheckBox();
		autoNew.setText(Msg.getMsg(Env.getCtx(), "AutoNew", true));
		autoNew.setToolTipText(Msg.getMsg(Env.getCtx(), "AutoNew", false));
		autoNew.setSelected(Env.isAutoNew(Env.getCtx()));
		
		cacheWindow = new CCheckBox();
		cacheWindow.setText(Msg.getMsg(Env.getCtx(), "CacheWindow", true));
		cacheWindow.setToolTipText(Msg.getMsg(Env.getCtx(), "CacheWindow", false));
		cacheWindow.setSelected(Ini.isCacheWindow());
		
		openWindowMaximized = new CCheckBox();
		openWindowMaximized.setText(Msg.getMsg(Env.getCtx(), "OpenWindowMaximized", true));
		openWindowMaximized.setToolTipText(Msg.getMsg(Env.getCtx(), "OpenWindowMaximized", false));		
		openWindowMaximized.setSelected(Ini.isPropertyBool(Ini.P_OPEN_WINDOW_MAXIMIZED));
		
		singleInstancePerWindow = new CCheckBox();
		singleInstancePerWindow.setText(Msg.getMsg(Env.getCtx(), "SingleInstancePerWindow", true));
		singleInstancePerWindow.setToolTipText(Msg.getMsg(Env.getCtx(), "SingleInstancePerWindow", false));
		singleInstancePerWindow.setSelected(Ini.isPropertyBool(Ini.P_SINGLE_INSTANCE_PER_WINDOW));
		
		validateConnectionOnStartup = new CCheckBox();
		validateConnectionOnStartup.setText(Msg.getMsg(Env.getCtx(), "ValidateConnectionOnStartup", true));
		validateConnectionOnStartup.setToolTipText(Msg.getMsg(Env.getCtx(), "ValidateConnectionOnStartup", false));
		validateConnectionOnStartup.setSelected(Ini.isPropertyBool(Ini.P_VALIDATE_CONNECTION_ON_STARTUP));
		
		traceLevel = new CComboBox(CLogMgt.LEVELS);
		traceLevel.setSelectedItem(CLogMgt.getLevel());

		traceFile = new CCheckBox();
		traceFile.setText(Msg.getMsg(Env.getCtx(), "TraceFile", true));
		traceFile.setToolTipText(Msg.getMsg(Env.getCtx(), "TraceFile", false));
		traceFile.setSelected(Ini.isPropertyBool(Ini.P_TRACEFILE));
		
		debug = new CCheckBox();
		String debugmsg = Msg.getMsg(Env.getCtx(), "Debug", true); 
		debug.setText(debugmsg);
		debug.setToolTipText(debugmsg);
		debug.setSelected(CLogMgt.DEBUG);

		lPrinter = new CLabel();		
		lPrinter.setText(Msg.getMsg(Env.getCtx(), "Printer"));

		fPrinter= new CPrinter();
		fPrinter.setValue(Env.getContext(Env.getCtx(), "#Printer"));
		
		printPreview = new CCheckBox();
		printPreview.setText(Msg.getMsg(Env.getCtx(), "AlwaysPrintPreview", true));
		printPreview.setToolTipText(Msg.getMsg(Env.getCtx(), "AlwaysPrintPreview", false));
		printPreview.setSelected(Ini.isPropertyBool(Ini.P_PRINTPREVIEW));
		
		mainFontLabel = new LabelWithMnemonic(GlobalResourceLoader.getString(
				RESOURCE_PATH, "general", "main_font"));
		mainFontButton = new JButton("main font");
		mainFontButton.addActionListener(this);
		mainFontLabel.setLabelFor(mainFontButton);

		textFontLabel = new LabelWithMnemonic(GlobalResourceLoader.getString(
				RESOURCE_PATH, "general", "text_font"));
		textFontButton = new JButton("text font");
		textFontButton.addActionListener(this);
		textFontLabel.setLabelFor(textFontButton);

		toolbarLabel = new LabelWithMnemonic(GlobalResourceLoader.getString(
				RESOURCE_PATH, "general", "toolbar"));
		toolbarComboBox = new JComboBox(new String[] {
				GlobalResourceLoader.getString(RESOURCE_PATH, "general", "toolbar_icons"),
				GlobalResourceLoader.getString(RESOURCE_PATH, "general", "toolbar_below"),
				GlobalResourceLoader.getString(RESOURCE_PATH, "general", "toolbar_beside") });
		toolbarLabel.setLabelFor(toolbarComboBox);

		languageLabel = new LabelWithMnemonic(GlobalResourceLoader.getString(RESOURCE_PATH, "general", "locale"));
		languageComboBox = new JComboBox();
		languageLabel.setLabelFor(languageComboBox);
		languageComboBox.setRenderer(new LocaleComboBoxRenderer());

		proxyLabel = new LabelWithMnemonic(GlobalResourceLoader.getString(RESOURCE_PATH, "general", "proxy"));
		proxyButton = new JButton();
		proxyButton.addActionListener(this);
		proxyLabel.setLabelFor(proxyButton);

		// button panel
		okButton = new ButtonWithMnemonic(GlobalResourceLoader.getString("","global", "ok"));
		okButton.setActionCommand("OK");
		okButton.addActionListener(this);

		cancelButton = new ButtonWithMnemonic(GlobalResourceLoader.getString("", "global", "cancel"));
		cancelButton.setActionCommand("CANCEL");
		cancelButton.addActionListener(this);

		helpButton = new ButtonWithMnemonic(GlobalResourceLoader.getString("","global", "help"));

		// associate with JavaHelp
		HelpManager.getInstance().enableHelpOnButton(helpButton, "configuring_columba_8");
		HelpManager.getInstance().enableHelpKey(getRootPane(), "configuring_columba_8");
	}

	public void actionPerformed(ActionEvent event) {
		String action = event.getActionCommand();

		if (action.equals("OK")) {
			updateComponents(false);
			// TODO (@author fdietz): until we can get all the settings update
			// immediately
			// we just open a message box, telling the user to restart
			if (restartRequired) {
				JOptionPane.showMessageDialog(this, "You have to restart Xendra for the changes to take effect!");
				// switch to new theme
				ThemeSwitcher.setTheme();
			}
			setVisible(false);
			// notify frame to update
			IContainer[] m = FrameManager.getInstance().getOpenFrames();
			for (int i = 0; i < m.length; i++) {
				JFrame frame = m[i].getFrame();
				ThemeSwitcher.updateFrame(frame);
			}
			// set fonts
			FontProperties.setFont();
		} else if (action.equals("CANCEL")) {
			setVisible(false);
		} else if (action.equals("THEME")) {
			// theme selection changed
			String theme = (String) lfComboBox.getSelectedItem();
			IExtension extension = handler.getExtension(theme);
			configID = extension.getMetadata().getAttribute("config");
			lfButton.setEnabled(configID != null);
		} else if (action.equals("THEME_OPTIONS")) {
			try {
				ConfigurationDialog dialog = new ConfigurationDialog(configID);
				dialog.setVisible(true);
			} catch (PluginHandlerNotFoundException phnfe) {
			} catch (PluginLoadingFailedException plfe) {
			}
		}

		Object source = event.getSource();
		if (source == mainFontButton) {
			FontSelectionDialog fontDialog = new FontSelectionDialog(this, null);

			if (fontDialog.showDialog() == FontSelectionDialog.APPROVE_OPTION) {
				mainFont = fontDialog.getSelectedFont();
				mainFontButton.setFont(mainFont);
				mainFontButton.setText(mainFont.getFontName());
			}
		} else if (source == textFontButton) {
			FontSelectionDialog fontDialog = new FontSelectionDialog(this, null);

			if (fontDialog.showDialog() == FontSelectionDialog.APPROVE_OPTION) {
				textFont = fontDialog.getSelectedFont();
				textFontButton.setFont(textFont);
				textFontButton.setText(textFont.getFontName());
			}
		} else if (source == overwriteCheckBox) {
			boolean enabled = overwriteCheckBox.isSelected();
			mainFontLabel.setEnabled(enabled);
			mainFontButton.setEnabled(enabled);
			textFontLabel.setEnabled(enabled);
			textFontButton.setEnabled(enabled);
		} else if (source == proxyButton) {
			ProxyConfigurationDialog dialog = new ProxyConfigurationDialog(this);
			dialog.setProxyHost(proxyHost);
			dialog.setProxyPort(proxyPort);
			if (dialog.showDialog() == ProxyConfigurationDialog.APPROVE_OPTION) {
				proxyHost = dialog.getProxyHost();
				proxyPort = dialog.getProxyPort();
				updateProxyButtonText();
			}
		}
	}

	protected void updateProxyButtonText() {
		if (proxyHost != null) {
			proxyButton.setText(proxyHost + ":" + Integer.toString(proxyPort));
		} else {
			proxyButton.setText(GlobalResourceLoader.getString(RESOURCE_PATH,"proxy", "no_proxy"));
		}
	}

	private Font getMainFont() {
		return mainFont;
	}

	private Font getTextFont() {
		return textFont;
	}
}