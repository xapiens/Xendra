package org.xendra.security.api;


public interface XendraKeyStore {
	/**	Directory below XENDRA_HOME	*/
	public static String		KEYSTORE_DIRECTORY = "keystore";
	/** Name of KeyStore				*/
	public static String		KEYSTORE_NAME = "myKeystore";
	/** Certificate Alias				*/
	//public static String		CERTIFICATE_ALIAS = "xendra";	
	public static final String	XENDRA_KEYDIR 			= "XENDRA_KEYDIR";
	public static final String 	XENDRA_ALIAS			= "XENDRA_ALIAS";
	public static final String	XENDRA_KEYSTORE 		= "XENDRA_KEYSTORE";
	public static final String	XENDRA_KEYSTORE_TYPE 	= "XENDRA_KEYSTORE_TYPE";
	public static final String	XENDRA_KEYSTOREPASS		= "XENDRA_KEYSTOREPASS";
	public static final String	XENDRA_CERT_CN			= "XENDRA_CERT_CN";	
	public static final String	XENDRA_CERT_ORG			= "XENDRA_CERT_ORG";
	public static final String	XENDRA_CERT_ORG_UNIT	= "XENDRA_CERT_ORG_UNIT";	
	public static final String	XENDRA_CERT_LOCATION	= "XENDRA_CERT_LOCATION";	
	public static final String	XENDRA_CERT_STATE		= "XENDRA_CERT_STATE";	
	public static final String	XENDRA_CERT_COUNTRY		= "XENDRA_CERT_COUNTRY";
	void signalKeyStore(boolean pass, String alias, String error);	
}
