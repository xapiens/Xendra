/******************************************************************************
 * Product: Xendra ERP & CRM Smart Business Solution                        *
 * Copyright (C) 1999-2006 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software; you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY; without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program; if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
package org.xendra.security.keystore;

import java.io.*;
import java.net.*;
import java.security.*;
import java.security.cert.Certificate;
import java.util.*;
import java.util.logging.*;
import javax.swing.*;
import org.compiere.*;
import org.compiere.util.*;
import org.xendra.security.api.*;
import sun.security.tools.*;

/**
 *	Class to manage SSL KeyStore
 *	
 *  @author Jorg Janke
 *  @version $Id: KeyStoreMgt.java,v 1.1 2007/06/15 00:16:55 sergioaguayo Exp $
 */
public class KeyStoreMgt
{
	/**
	 * 	Constructor.
	 *	@param fileName key store file name
	 *	@param password - same password for key store and certificate
	 */
	public KeyStoreMgt (String KeyStoreType, String fileName, char[] password)
	{
		m_keystoretype = KeyStoreType;
		log.info(fileName);
		m_file = new File (fileName);
		m_password = password;
	}	//	KeyStoreMgt

	/**	Logger					*/
	private static CLogger		log	= CLogger.getCLogger(KeyStoreMgt.class);
	/**	KeyStore File			*/
	private File 		m_file = null;
	/**	KeyStore Password		*/
	private char[]		m_password = null;
	/** KeyStore				*/
	private KeyStore	m_keyStore = null;
	/** KeyStoreType */
	private String m_keystoretype = null;
	private String organizationUnit;
	private String location;
	private String state;
	private String country;
	private String commonName;
	private String organization;
	



	/**
	 * 	Verify/Create Key Store
	 * 	@param parent frame
	 *	@return null or error message
	 */
	//public String verify (JFrame parent)
	public String verify (String alias)
	{
		KeyStore ks = null;
		try
		{
			ks = getKeyStore();
		}
		catch (Exception e)
		{
			log.log(Level.SEVERE, "get KeyStore", e);
			return e.getMessage();
		}
		//	No KeyStore
		if (ks == null)
		{			
			//createCertificate(XendraKeyStore.CERTIFICATE_ALIAS);
			createCertificate(alias);
			try
			{
				ks = getKeyStore();
			}
			catch (Exception e)
			{
				log.log(Level.SEVERE, "new KeyStore", e);
				return e.getMessage();
			}
		}	//	new key store

		//	No KeyStore
		if (ks == null)
			return "No Key Store";

		//	Verify Certificate
		Certificate cert = null;
		try
		{
			//cert = getCertificate(XendraKeyStore.CERTIFICATE_ALIAS);
			cert = getCertificate(alias);
			if (cert == null) {
				createCertificate(alias);
				cert = getCertificate(alias);
				if (cert == null) {
					ks = getKeyStore();
					cert = getCertificate(alias);
				}
			}			
		}
		catch (Exception e)
		{
			log.log(Level.SEVERE, "certificate", e);
			return e.getMessage();
		}
		if (cert == null) {
			return "No Certificate found";
		}

		return null;	//	OK
	}	//	verify

	/**
	 * 	Get KeyStore
	 *	@return KeyStore or null
	 *	@throws Exception
	 */
	public KeyStore getKeyStore() throws Exception
	{
		try
		{ 
			//m_keyStore = KeyStore.getInstance("JKS");
			if (m_keystoretype == null) {
				m_keystoretype = "JKS";
			}
			m_keyStore = KeyStore.getInstance(m_keystoretype);
		}
		catch (Exception e)
		{
			log.log(Level.SEVERE, "Instance", e);
		}
		//	Load Existing
		if (m_file.exists())
		{
			log.fine(m_file.toString());
			InputStream is = null;
			try
			{
				is = new FileInputStream (m_file);
			}
			catch (Exception e)
			{
				log.log(Level.SEVERE, "load", e);
				return null;
			}
			m_keyStore.load(is, m_password);
		}
		else
			return null;	//	does not exist
		//
		log.fine("Provider=" + m_keyStore.getProvider()
				+ " - Type=" + m_keyStore.getType());
		//
		return m_keyStore;
	}	//	getKeyStore

	/**
	 * 	Get Certificate
	 *	@param alias alias
	 *	@return certificate or null
	 *	@throws Exception
	 */
	public Certificate getCertificate (String alias) throws Exception
	{
		log.config("Alias=" + alias);

		Date date = m_keyStore.getCreationDate(alias);
		if (date == null)	//	no certificate
			return null;
		log.fine("Created=" + date);
		//
		Key key = m_keyStore.getKey(alias, m_password);
		if (CLogMgt.isLevelFinest())
			log.info("Key=" + key);				//	Multiple lines
		else
			log.fine(key.getAlgorithm());
		//
		Certificate cert = m_keyStore.getCertificate(alias);
		if (CLogMgt.isLevelFinest())
			log.info("Certificate = " + cert);	//	Multiple lines
		else
			log.fine(cert.getType());

		//	log.fine("Certificate - Type=" + cert.getType()
		//			+ " - PublicKey=" + cert.getPublicKey());
		return cert;
	}	//	getCertificate


	/**************************************************************************
	 * 	Create Certificate
	 *	@param alias alias
	 * 	@param parent interactive dialog
	 */
	//private void createCertificate (String alias, JFrame parent)
	private void createCertificate (String alias)
	{
		log.info("");
		try
		{
			File dir = m_file.getParentFile();
			if (!dir.exists())
				dir.mkdir();
		}
		catch (Exception e)
		{
			log.log(Level.SEVERE, "directory", e);
		}

		//String dname = getDname(this, parent);
		String dname = getDname(this);
		if (dname == null)
			return;
		//
		try
		{
			genkey (alias, m_password, m_file.getAbsolutePath(), dname);
			selfcert (alias, m_password, m_file.getAbsolutePath(), dname);
		}
		catch (Exception e)
		{
			log.log(Level.SEVERE, "certificate", e);
		}
	}	//	createCertificate

	public void setCommonName(String cn)
	{
		commonName = cn;
	}

	public void setOrganization(String o)
	{
		organization = o; 
	}

	public void setOrganizationUnit(String o)
	{
		organizationUnit = o;
	}

	public void setLocation(String l)
	{
		location = l;
	}

	public void setState(String s)
	{
		state = s;
	}

	public void setCountry(String c)
	{
		country = c;
	}

	/**
	 * 	Get Distinguised Name
	 * 	@param parent interactive dialog
	 *	@return dname or null
	 */
	//public static String getDname(KeyStoreMgt mgt, JFrame parent)
	public static String getDname(KeyStoreMgt mgt)
	{
		String cn = mgt.commonName;
		if (cn == null)
		{
			try
			{
				InetAddress address = InetAddress.getLocalHost();
				cn = address.getCanonicalHostName();
			}
			catch (Exception e)
			{
			}
		}

		String ou = mgt.organization != null
				? mgt.organization
						: System.getProperty("user.name");
		String o = mgt.organizationUnit != null
				? mgt.organizationUnit
						: "XendraUser";
		String l = mgt.location != null
				? mgt.location
						: "MyTown";
		String s = mgt.state != null
				? mgt.state
						: "";
		String c = mgt.country != null
				? mgt.country
						: System.getProperty("user.country");
		//
		//if (parent != null)
		//{
		//KeyStoreDialog skd = new KeyStoreDialog(parent,	cn, ou, o, l, s, c);
		KeyStoreDialog skd = new KeyStoreDialog(cn, ou, o, l, s, c);
		if (!skd.isOK())
			return null;
		cn = skd.getCN();
		ou = skd.getOU();
		o = skd.getO();
		l = skd.getL();
		s = skd.getS();
		c = skd.getC();
		//}

		//
		if (cn == null || cn.length() == 0)
		{
			log.warning("No Common Name (CN)");
			return null;
		}
		if (ou == null || ou.length() == 0)
		{
			log.warning("No Organization Unit (OU)");
			return null;
		}
		if (o == null || o.length() == 0)
		{
			log.warning("No Organization (O)");
			return null;
		}
		if (c == null || c.length() == 0)
		{
			log.warning("No Country (C)");
			return null;
		}

		//	Escape commas
		StringBuffer dname = new StringBuffer();
		dname.append("CN=").append(escapeCommas(cn));		//	common name
		dname.append(", OU=").append(escapeCommas(ou));		//	org unit
		dname.append(", O=").append(escapeCommas(o));		//	org
		if (l != null && l.length() > 0)
			dname.append(", L=").append(escapeCommas(l));	//	locality
		if (s != null && s.length() > 0)
			dname.append(", S=").append(escapeCommas(s));	//	state
		dname.append(", C=").append(escapeCommas(c));		//	country
		return dname.toString();
	}	//	getDname

	/**
	 * 	Escape Commas
	 *	@param in input string
	 *	@return excaped string
	 */
	public static String escapeCommas(String in)
	{
		if (in == null || in.indexOf(',') == -1)
			return in;
		StringBuffer out = new StringBuffer();
		char[] chars = in.toCharArray();
		for (int i = 0; i < chars.length; i++)
		{
			if (chars[i] == ',')
				out.append('\\').append(',');
			else
				out.append(chars[i]);
		}
		return out.toString();
	}	//	escapeCommas

	/**
	 * 	Generate Key
	 *	@param alias xendra
	 *	@param password password
	 *	@param fileName key store file name (may have spaces)
	 *	@param dname distinguished name
	 */
	public static void genkey (String alias, char[] password, String fileName, String dname)
	{
		StringBuffer cmd = new StringBuffer ("-genkey -keyalg rsa");
		cmd.append(" -alias ").append(alias);
		cmd.append(" -dname \"").append(dname).append("\"");
		cmd.append(" -keypass ").append(password).append(" -validity 999");
		if (fileName.indexOf(' ') != -1)
			cmd.append(" -keystore \"").append(fileName).append("\" -storepass ").append(password);
		else
			cmd.append(" -keystore ").append(fileName).append(" -storepass ").append(password);
		keytool (cmd.toString());
	}	//	genkey

	/**
	 * 	Generate Key
	 *	@param alias xendra
	 *	@param password password
	 *	@param fileName key store file name (may have spaces)
	 *	@param dname distinguished name
	 */
	public static void selfcert (String alias, char[] password, String fileName, String dname)
	{
		StringBuffer cmd = new StringBuffer ("-selfcert");
		cmd.append(" -alias ").append(alias);
		cmd.append(" -dname \"").append(dname).append("\"");
		cmd.append(" -keypass ").append(password).append(" -validity 999");
		if (fileName.indexOf(' ') != -1)
			cmd.append(" -keystore \"").append(fileName).append("\" -storepass ").append(password);
		else
			cmd.append(" -keystore ").append(fileName).append(" -storepass ").append(password);
		keytool (cmd.toString());
	}	//	selfcert

	/**
	 * 	Submit Command to Key Tool
	 *	@param cmd command
	 */
	public static void keytool(String cmd)
	{
		log.info("keytool " + cmd);
		ArrayList<String> list = new ArrayList<String>();
		StringTokenizer st = new StringTokenizer(cmd, " ");
		String quoteBuffer = null;
		while (st.hasMoreTokens())
		{
			String token = st.nextToken();
			//	System.out.println("= " + token + " = quoteBuffer=" + quoteBuffer + " - Size=" + list.size() );
			if (quoteBuffer == null)
			{
				if (token.startsWith("\""))
					quoteBuffer = token.substring(1);
				else
					list.add(token);
			}
			else
				quoteBuffer += " " + token;
			if (token.endsWith("\""))
			{
				String str = quoteBuffer.substring(0, quoteBuffer.length()-1); 
				//	System.out.println("  Buffer= " + str );
				list.add(str);
				quoteBuffer = null;
			}
		}	//	all tokens

		//
		String[] args = new String[list.size()];
		list.toArray(args);
		//	System.out.println(" args #" + args.length);
		//vpj-cd add support java 6
		try
		{
			KeyTool.main(args);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}	//	ketyool

	/**
	 * 	Get Keystore File Name
	 *	@param baseDir XENDRA_HOME
	 *	@return file name
	 */
	public static String getKeystoreFileName (String baseDir)
	{
		String fileName = baseDir;
		if (fileName == null)
			fileName = "";
		else if (!fileName.endsWith(File.separator))
			fileName += File.separator;
		fileName += XendraKeyStore.KEYSTORE_DIRECTORY + File.separator + XendraKeyStore.KEYSTORE_NAME;
		return fileName;
	}	//	getKeystoreFileName


	/**************************************************************************
	 * 	Test
	 *	@param args ignored
	 */
	public static void main (String[] args)
	{
		Xendra.startupEnvironment(true);
		System.out.println(new KeyStoreMgt ("C:/Xendra/keystore/myKeystore2","JKS", "myPassword".toCharArray()).verify("alias"));
	}	//	main

}	//	MyKeyStore
