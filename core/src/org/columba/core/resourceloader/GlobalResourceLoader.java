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

package org.columba.core.resourceloader;

import java.io.File;
import java.io.FileFilter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.StringTokenizer;
import org.columba.core.config.Config;
import org.columba.core.config.DefaultConfigDirectory;
import org.compiere.apps.ADialog;
import org.compiere.util.CLogger;
import org.compiere.util.Language;

/**
 * This is the core class to handle i18n in columba, loading, handling and
 * returning localized strings. It should not be used directly, use
 * MailResourceLoader or AddressbookResourceLoader (or *ResourceLoader) instead.
 *
 * Behaviour: When a resource is needed, getString() or getMnemonics() are
 * called. They look for a resource with that name (in the current locale
 * bundles). If it is not found, they look for the resource in the global
 * resource bundle (for the current locale). If this is not found, "FIXME" is
 * returned.
 *
 * Example of usage: We need to get the text for "my_cool_button" located into
 * "org/columba/modules/mail/i18n/action/something_else_than_action" sPath:
 * org/columba/modules/mail/i18n/action/ => The complete package path. sName:
 * something_else_than_action => the name of the _it_IT.properties file. sID:
 * my_cool_button => the name to be looked for inside sName file. We can call:
 * a) MailResourceLoader.getString("action", "something_else_than_action",
 * "my_cool_button"); b)
 * ResourceLoader.getString("org/columba/modules/mail/i18n/action",
 * "something_else_than_action", "my_cool_button"); They'll both work.
 *
 * We need to gets its mnemonic: a) MailResourceLoader.getMnemonic("action",
 * "something_else_than_action", "my_cool_button"); b)
 * ResourceLoader.getMnemonic("org/columba/modules/mail/i18n/action",
 * "something_else_than_action", "my_cool_button");
 */
public class GlobalResourceLoader {

	private static final CLogger LOG = CLogger.getCLogger("org.columba.core.util");

	protected static ClassLoader classLoader;

	protected static Hashtable htBundles = new Hashtable(80);

	protected static ResourceBundle globalBundle;

	private static final String GLOBAL_BUNDLE_PATH = "org.columba.core.i18n.global.global";
	//private static final String GLOBAL_BUNDLE_PATH = "org.columba.core.i18n.global";

	static {
		initClassLoader();
	}

	/**
	 * Initialize in org.columba.core.main.Main to use user-definable language
	 * pack.
	 */
	public static void loadLanguage() {
		org.columba.core.config.Locale locale = Config.getInstance().getOptions().getLocale();
		//XmlElement locale = Config.getInstance().get("options").getElement("/options/locale");

		// no configuration available, create default config
		if (locale == null) {
			// create new locale xml treenode
			//locale = new XmlElement("locale");
			locale = new org.columba.core.config.Locale();			
			//locale.addAttribute("language", "es");
			locale.setLanguage("es");
			Config.getInstance().getOptions().setLocale(locale);
			//Config.getInstance().get("options").getElement("/options").addElement(locale);
		}

		//String language = locale.getAttribute("language");
		String language = locale.getLanguage();
		//String country = locale.getAttribute("country", "");
		String country = locale.getCountry();
		//String variant = locale.getAttribute("variant", "");
		String variant = locale.getVariant();
		Locale.setDefault(new Locale(language, country, variant));
		initClassLoader();
	}

	public static Locale[] getAvailableLocales() {
		Set locales = new HashSet();
		locales.add(new Locale("en", ""));

		FileFilter langpackFileFilter = new LangPackFileFilter();
		File[] langpacks = DefaultConfigDirectory.getInstance().getCurrentPath().listFiles(langpackFileFilter);

		for (int i = 0; i < langpacks.length; i++) {
			locales.add(extractLocaleFromFilename(langpacks[i].getName()));
		}

		langpacks = new File(".").listFiles(langpackFileFilter);

		for (int i = 0; i < langpacks.length; i++) {
			locales.add(extractLocaleFromFilename(langpacks[i].getName()));
		}

		return (Locale[]) locales.toArray(new Locale[0]);
	}

	private static Locale extractLocaleFromFilename(String name) {
		String language = "";
		String country = "";
		String variant = "";
		name = name.substring(9, name.length() - 4);

		StringTokenizer tokenizer = new StringTokenizer(name, "_");

		if (tokenizer.hasMoreElements()) {
			language = tokenizer.nextToken();

			if (tokenizer.hasMoreElements()) {
				country = tokenizer.nextToken();

				if (tokenizer.hasMoreElements()) {
					variant = tokenizer.nextToken();
				}
			}
		}

		return new Locale(language, country, variant);
	}

	protected static void initClassLoader() {
		// using default english language, shipped with Columba

		// we can't use SystemClassLoader here, because that
		// wouldn't work with java webstart,webswing
		// ResourceBundle uses its own internal classloader
		// if no classloader is given
		//  -> set classloader = null
		/*
		 * classLoader = ClassLoader.getSystemClassLoader();
		 */
		classLoader = null;
		
		try {
			// use ResourceBundle's internal classloader
			if (classLoader == null) {
				globalBundle = ResourceBundle.getBundle(GLOBAL_BUNDLE_PATH,	Locale.getDefault());
			} else {			
				LOG.warning(String.format("global bundle path %s Locale %s classloader %s", GLOBAL_BUNDLE_PATH, Locale.getDefault() , classLoader));
				globalBundle = ResourceBundle.getBundle(GLOBAL_BUNDLE_PATH,	Locale.getDefault(), classLoader);
			}
		} catch (MissingResourceException mre) {
			mre.printStackTrace();
			throw new RuntimeException(
					"Global resource bundle not found, Columba cannot start.");
		}
	}

	/**
	 * Checks whether there is a language pack file corresponding to the given
	 * locale in the specified directory.
	 */
	private static File lookupLanguagePackFile(Locale locale, File directory) {
		File langpack = new File(directory, "langpack_" + locale.toString()	+ ".jar");
		if (!langpack.exists() || !langpack.isFile()) {
			langpack = new File(directory, "langpack_" + locale.getLanguage() + ".jar");
		}
		return langpack.exists() && langpack.isFile() ? langpack : null;
	}

	protected static String generateBundlePath(String sPath, String sName) {
		return sPath + "." + sName;
	}

	/*
	 * This method returns the translation for the given string identifier. If
	 * no translation is found, the default english item is used. Should this
	 * fail too, the sID string will be returned.
	 *
	 * Example usage call: getString("org/columba/modules/mail/i18n/", "dialog",
	 * "close") We'll look for "close" in
	 * "org/columba/modules/mail/i18n/dialog/dialog_locale_LOCALE.properties"
	 * Thus: sPath: "org/columba/modules/mail/i18n/dialog" sName: "dialog" sID:
	 * "close" The bundle name will be:
	 * "org/columba/modules/mail/i18n/dialog/dialog"
	 *
	 * Hypotetically this method should not be available to classes different
	 * from *ResourceLoader (example: MailResourceLoader,
	 * AddressbookResourceLoader); this means that *ResourceLoader classes *do
	 * know* how to call this method.
	 */
	public static String getString(String sPath, String sName, String sID) {
		if ((sID == null) || sID.equals("")) {
			return null;
		}

		ResourceBundle bundle = null;
		String sBundlePath = null;

		if ((sPath != null) && !sPath.equals("")) {
			//Find out if we already loaded the needed ResourceBundle
			//object in the hashtable.
			sBundlePath = generateBundlePath(sPath, sName);
			bundle = (ResourceBundle) htBundles.get(sBundlePath);
		}

		if ((bundle == null) && (sBundlePath != null)) {
			try {
				// use ResourceBundle's internal classloader
				//if (classLoader == null) {
					LOG.warning("GlobalResource sin classloader");					
					bundle = ResourceBundle.getBundle(sBundlePath, Language.getLoginLanguage().getLocale());
				//} 
				//else {
				//	LOG.warning("GlobalResource CON classloader");
				//	URL xx  = classLoader.getResource(sBundlePath);				
					//URL[] urls = {sBundlePath.
				//	bundle = ResourceBundle.getBundle(sBundlePath, Language.getLoginLanguage().getLocale(), classLoader);
				//}

				htBundles.put(sBundlePath, bundle);
			} catch (MissingResourceException mre) {
			}
		}

		if (bundle != null) {
			try {
				return bundle.getString(sID);
			} catch (MissingResourceException mre) {
			}
		}

		try {
			return globalBundle.getString(sID);
		} catch (MissingResourceException mre) {
			LOG.fine("'" + sID + "' in '" + sBundlePath	+ "' could not be found.");
			return sID;
		}
	}

	public static void reload() {
		initClassLoader();
		LOG.fine("Reloading cached resource bundles for locale " + Locale.getDefault().toString());

		try {
			// use ResourceBundle's internal classloader
			if (classLoader == null) {
				globalBundle = ResourceBundle.getBundle(GLOBAL_BUNDLE_PATH,	Locale.getDefault());
			} else {
				globalBundle = ResourceBundle.getBundle(GLOBAL_BUNDLE_PATH,	Locale.getDefault(), classLoader);
			}
		} catch (MissingResourceException mre) {
		}
		//should not occur, otherwise the static initializer should have thrown
		// a RuntimeException

		String bundlePath;
		ResourceBundle bundle;

		for (Enumeration entries = htBundles.keys(); entries.hasMoreElements();) {
			try {
				bundlePath = (String) entries.nextElement();

				//retrieve new bundle
				// use ResourceBundle's internal classloader
				if (classLoader == null) {
					bundle = ResourceBundle.getBundle(bundlePath, Locale.getDefault());
				} else {
					bundle = ResourceBundle.getBundle(bundlePath, Locale.getDefault(), classLoader);
				}

				//overwrite old bundle
				htBundles.put(bundlePath, bundle);
			} catch (MissingResourceException mre) {
			}
			//should not occur, otherwise the bundlePath would not be in the
			// hashtable
		}
	}

	public static class LangPackFileFilter implements FileFilter {
		public boolean accept(File file) {
			String name = file.getName().toLowerCase();

			return file.isFile() && name.startsWith("langpack_") && name.endsWith(".jar");
		}
	}
}