package org.xendra;

/**
 * 
 * Holds all of our static Constants in our project.
 * @author xapiens
 *
 */
public interface Constants {
	// Print
	public final static String Model = "model";
	// POS Wizard
	public final static String Rule = "rule";
	// Holon Replication
	public final static String Identifier				= "id";
	public final static String XML_ATTRIBUTE_POSTrx 	= "POSTrx";
	public final static String XML_ATTRIBUTE_POS 		= "pos";
	public final static String XML_ATTRIBUTE_POP 		= "pop";
	public final static String XML_ATTRIBUTE_POSITEM 	= "item";
	public final static String XML_ATTRIBUTE_PRICEITEM 	= "priceitem";
	public final static String XML_ATTRIBUTE_PAY 		= "payment";
	public final static String XML_ATTRIBUTE_PAYCASH 	= "paycash";	
	public final static String XML_ATTRIBUTE_PAYCOUPON 	= "paycoupon";
	public final static String XML_ATTRIBUTE_PAYMENT 	= "payment";
	public final static String XML_ATTRIBUTE_PAYCREDIT	= "paycredit";
	public final static String XML_ATTRIBUTE_COUPONS 	= "coupons";
	public final static String XML_ATTRIBUTE_COUPON 	= "coupon";
	public final static String XML_ATTRIBUTE_DOCUMENT 	= "document";
	public final static String XML_ATTRIBUTE_DOC_HEIGHT	= "height";
	public final static String XML_ATTRIBUTE_DOC_WIDTH  = "width";
	public final static String XML_ATTRIBUTE_DOC_X		= "x";
	public final static String XML_ATTRIBUTE_DOC_Y		= "y";
	public final static String XML_ATTRIBUTE_DOC_LENGTH = "length";
	public final static String XML_ATTRIBUTE_DOC_VALUE  = "value";
	public final static String XML_ATTRIBUTE_DOC_FIELD  = "field";
	public final static String XML_ATTRIBUTE_DOC_TYPE   = "type";
	public final static String XML_ATTRIBUTE_DOC_TEXT   = "text";
	public final static String XML_ATTRIBUTE_LOSTSALES  = "lostsales";		
	// Replication
	/** Local */
	public final static String Local = "L";
	/** Remote */
	public final static String Remote = "R";
	public final static String XML_ATTRIBUTE_MovementTrx = "MovTrx";
	public final static String XML_ATTRIBUTE_Movement = "Movement";
	public final static String XML_ATTRIBUTE_MovementLine = "MovementLine";	
	public final static String XML_ATTRIBUTE_MovementConfirm = "MovementConfirm";
	public final static String XML_ATTRIBUTE_MovementConfirmLine = "MovementConfirmLine";
	public final static String Stream = "stream";
	//public final static String Identifier = "id";
	public final static String Movement = "MM";
	public final static String VOID = "void";
	public final static String GenInvoice = "geninvoice";
	public final static String POS = "pos";
	public final static String POP = "pop";
	public final static String CreateMovementConfirm = "CC";
	public final static String MovementID = "MID";
	public final static String MovementLineID = "MLID";
	public final static String MovementConfirmID = "MCID";
	public final static String MovementConfirm = "MC";
	// Compras
	//public static final String PriceAcquisitionConvert = "PriceAcquisitionConvert";
	public final static String XML_ATTRIBUTE_POPTrx = "POPTrx";
	//public final static String XML_ATTRIBUTE_POP = "POP";
	public final static String XML_ATTRIBUTE_POPITEM = "item";
	//
	public final static String Client = "AD_Client_ID";
	public final static String Org = "AD_Org_ID";
	//public static final String SalesMargin = "SalesMargin";
	public static final String SalesPrice = "SalesPrice";
	//public static final String PriceAcquisition2 = "PriceAcquisition2";
	public static final String ChangePrice = "ChangePrice";
	public static final String M_PriceSalesList_ID = "M_PriceSalesList_ID";
	//public static final String M_PriceSalesListVersion_ID = "M_PriceSalesListVersion_ID";
	public static final String Definition = "definition";
	public static final String OrderItem = "OrderItem";
	//public static final String BuyPriceListVersion_ID = "BuyPriceListVersion_ID";
	public static final String Complete = "Complete";												
	//
	public final static byte[] ACK = {0x0};
	
	public final static String MENU_ABOUT = "About";
	public final static String MENU_EDIT = "Edit";

	public final static String MENU_ITEM_DELETE_ALL = "Delete All";
	public final static String MENU_ITEM_ABOUT = "About";

	public final static String USER_ROOT = "root";
	public final static String USER_ADMINISTRATOR = "Administrator";

	public final static int JOB_ID_LENGTH = 8;
	public final static int JOB_NAME_LENGTH = 20;
	public final static int JOB_OWNER_LENGTH = 15;
	public final static int JOB_DATE_LENGTH = 20;
	public final static int JOB_SIZE_LENGTH = 9;
	
	// Property Keys from lpd.properties
	public final static String ACROREAD_PROGRAM = "ACROREAD_PROGRAM";
	public final static String KEY_PRINT_JOB_HANDLER = "PRINT_JOB_HANDLER";
	public final static String TEMP_DIR = "TEMP_DIR";

	// Property Values from lpd.properties
	public final static String VALUE_PRINTER = "PRINTER";
	public final static String VALUE_PRINT = "PRINT";
	public final static String VALUE_FILE = "FILE";
	public final static String VALUE_NETWORK = "NETWORK";
	public final static String VALUE_DATABASE = "DATABASE";
	
	public final static String T_VOID = "voidAction";
	public final static String T_VOIDDOC = "voidDocAction";
	public final static String T_LOAD = "loadAction";
	public final static String T_IMPORT = "ImportAction";
	public final static String T_SAVE = "saveAction";
	public final static String T_PRINT = "printAction";
	public final static String T_USER = "userAction";
	public final static String A_FINISH = "Finish";
	public final static String A_EXIT = "Cancel";	
	public final static String A_SHOWCASE = "showcase";
	public final static String A_PARTIAL = "Partial";
	public static final String A_CASH = "Cash";
	public static final String A_CREDIT = "Credit";
	//public static final String A_CARD = "Card";
	public static final String A_PAY = "Pay";
	public static final String A_PARTNER = "Partner";
	public static final String A_CASHBASED = "Shopping";
	public static final String A_COUPON = "Coupon";	
	public static final String A_BONUS = "Bonus";
	public static final String A_CONFIG = "Config";
	public static final String A_DEBUG = "Debug";
	public static final String A_SHIPPING = "Shipping";
	public static final String A_GLOBALDISCOUNT = "Discount";
	public static final String A_COLLECTION = "Collection";
	public static final String A_RENDITION = "Rendition";
	public static final String A_TOTALNET = "TotalNet";
	public static final String A_TOTALTAX = "TotalTax";
	//public static final String DifferenceAmt = "DifferenceAmt";
	//public static final String DebtAmt = "DebtAmt";
	public static final String WriteOff = "wo";
	public static final String WriteOffName = "WriteOffName";
	public static final String A_TOTALGROSS = "TotalGross";
	public static final String PERCEPTIONBASEAMT = "TotalPerception";
	public static final String A_TOTALDISCOUNT = "TotalDiscount";

	public static final String PRINT = "PRINT";
	public static final String INFO = "INFO";
	public static final String ADD = "ADD";
	public static final String CLOSE = "CLOSE"; 
	public static final String CANCEL = "CANCEL";
	
	//public static final String SALESHOSTMESSENGER = "SalesHostMessenger";	
	//public static final String BUYHOSTMESSENGER = "BuyHostMessenger";
	public static final String QPOSQUEUE = "/queue/pos";
	public static final String QPOPQUEUE = "/queue/pop";
	public static final String QVOIDQUEUE = "/queue/void";
	public static final String QCONFIRMQUEUE = "/queue/confirm";
	public static final String QTRANSFERQUEUE = "/queue/transfer";
	//public static final String QREPLICATIONMERGEQUEUE = "/queue/merge";
	public static final String QUEUEMERGE = "merge";
	public static final String QREPLICATIONREFERENCEQUEUE = "/queue/reference";
	public static final String QDEMAND   = "/queue/demand";	
	public static final String QConnectionFactory = "/ConnectionFactory";

	public static final String COLUMNNAME_AD_Client_ID = "AD_Client_ID";
	public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
	public static final String AD_User_ID = "AD_User_ID";
	
	public static final String RESET = "reset";

	public static final String COLUMNNAME_Created = "Created";
	public static final String COLUMNNAME_Updated = "Updated";
	public static final String COLUMNNAME_CreatedBy = "CreatedBy";
	public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";
	public static final String COLUMNNAME_IsActive = "IsActive";
	public static final String HASH = "Hash";
	public static final String SALESMESSAGE = "SALESMESSAGE";
	public static final String BUYMESSAGE = "BUYMESSAGE";
	public static final String CONFIRMMESSAGE = "CONFIRMMESSAGE";
	public static final String TRANSFERMESSAGE = "TRANSFERMESSAGE";
	public static final String VOIDMESSAGE = "VOIDMESSAGE";	
	
	public static final String Document = "Document";
	public static final String HEADER = "Header";	
	public static final String LINES = "Lines";
	public static final String SubTotal = "SubTotal";
	public static final String PAYMENT = "Payment";
	public static final String COUPON = "Coupon";
	public static final String LOSTSALES = "LostSales";
	public static final String Count = "count";
	public static final String FLOATING = "Floating";
	public static final String ID = "id";
	public static final String Properties = "Properties";
	public static final String Property = "property";
	public static final String Listening = "Listening";

	public static final String FIELDALIGNMENTTYPE_LeadingLeft = "L";
	public static final String FIELDALIGNMENTTYPE_TrailingRight = "T";
	public static final String FIELDALIGNMENTTYPE_Block = "B";
	public static final String FIELDALIGNMENTTYPE_Center = "C";
	public static final String FIELDALIGNMENTTYPE_Default = "D";

	public static final String General = "General";

	public static final int ServerPortNumber = 6666;

	public static final String Language_ID = "Lang";
	public static final String Language_Field = "Lang_Field";
	public static final String Language_Text = "Lang_Text";
	
	public static final String REPORTS = "reports";
	public static final String TRASH = "trash";
	public static final String PLUGINS = "plugins";
	public static final String WEB = "web";
	public static final String XENDRIAN = "xendrian";
	public static final String STORE = "xendrastore";
	public static final String KEYSTORE = "keystore";
	public static final String KEYSTORE_NAME = "myKeystore";
	public static final String REPLICATION = "replication";
	public static final String INSTALLED = "installed";
	public static final String DOWNLOAD = "download";
	
	public static final String MAIL_UPDATED = "mail_updated";
	public static final String MAIL_SERVER = "mail_server";
	public static final String ADMIN_EMAIL = "admin_email";
	public static final String MAIL_USER = "mail_user";
	public static final String MAIL_PASSWORD = "mail_pwd";	
	
	public static final String CORE = "org.columba.core"; //$NON-NLS-1$;
	public static final String XML_ELEMENT_EXTENSION = "extension";
	public static final String XML_ELEMENT_PRINTDOCUMENTFORMAT = "printdocumentformat";
	public static final String XML_ELEMENT_EXTENSIONLIST = "extensionlist";
	public static final String XML_ELEMENT_SERVLETLIST = "servletlist";
	public static final String XML_ELEMENT_SERVLET = "servlet";
	public static final String XML_ELEMENT_GUI = "gui";
	public static final String XML_ELEMENT_MENU = "menu";
	public static final String XML_ELEMENT_MENUITEM = "menuitem";
	public static final String XML_ELEMENT_FORM = "form";
	public static final String XML_ELEMENT_WINDOW = "window";
	public static final String XML_ELEMENT_WEB = "web";
	public static final String XML_ELEMENT_PROPERTIES = "properties";
	public static final String XML_ELEMENT_DIRECTORY = "directory";
	public static final String XML_ELEMENT_LOCATION = "location";
	
	public static final String XML_ATTRIBUTE_DESCRIPTION = "description";
	public static final String XML_ATTRIBUTE_CATEGORY = "category";
	public static final String XML_ATTRIBUTE_SYNCHRONIZED = "synchronized";
	public static final String XML_ATTRIBUTE_VERSION = "version";
	public static final String XML_ATTRIBUTE_VALUE = "value";
	public static final String XML_ATTRIBUTE_NAME = "name";
	public static final String XML_ATTRIBUTE_CONTEXT = "context";
	public static final String XML_ATTRIBUTE_FILE = "file";
	public static final String XML_ATTRIBUTE_FILENAME = "filename";
	//public static final String XML_ATTRIBUTE_FILESIZE = "filesize";
	public static final String XML_ATTRIBUTE_TYPE = "type";
	//public static final String XML_ATTRIBUTE_CLIENT = "client";
	public static final String XML_ELEMENT_HANDLERLIST = "handlerlist";
	public static final String XML_ATTRIBUTE_SINGLETON = "singleton";
	public static final String XML_ATTRIBUTE_ENABLED = "enabled";
	public static final String XML_ATTRIBUTE_INSTALLED = "installed";
	public static final String XML_ATTRIBUTE_CLASS = "class";
	public static final String XML_ATTRIBUTE_MAPPING = "mapping";
	public static final String XML_ATTRIBUTE_PARENT = "parent";
	public static final String XML_ATTRIBUTE_ID = "id";
	public static final String XML_ATTRIBUTE_IDENTIFIER = "Identifier";
	public static final String XML_ATTRIBUTE_ACCESSLEVEL = "accesslevel";
	public static final String XML_ATTRIBUTE_FREQUENCYTYPE = "frequencytype";
	public static final String XML_ATTRIBUTE_FREQUENCY = "frequency";
	public static final String XML_ATTRIBUTE_FREQUENCY_STARTAT = "frequencystartat";
	public static final String XML_ATTRIBUTE_KEEPLOGDAYS = "keeplogdays";
	public static final String XML_ATTRIBUTE_DIR = "dir";	
	// RULE
	public static final String XML_ATTRIBUTE_AGENDA = "agenda";
	public static final String XML_ATTRIBUTE_DEFAULT = "default";
	public static final String XML_ATTRIBUTE_PACKAGE = "package";
	public static final String XML_ATTRIBUTE_ENTRYPOINT = "entrypoint";
	public static final String XML_ATTRIBUTE_SESSIONNAME = "sessionname";
	public static final String XML_ATTRIBUTE_EQUALSBEHAVIOR = "EqualsBehavior";
	public static final String XML_ATTRIBUTE_EVENTPROCESSINGMODE = "EventProcessingMode";
	public static final String XML_ATTRIBUTE_QUEUENAME = "queuename";
	public static final String XML_ATTRIBUTE_RULETYPE = "ruletype";
	public static final String XML_ATTRIBUTE_QUEUELISTENERCLASS = "queuelistenerclass";
	public static final String XML_ATTRIBUTE_DOCBASETYPE = "docbasetype";
	public static final String XML_ATTRIBUTE_DOCSUBTYPE = "docsubtype";
	public static final String XML_ATTRIBUTE_FIELD = "field";
	public static final String XML_ATTRIBUTE_GROUP = "group";
	public static final String XML_ATTRIBUTE_TAG = "Tag";
	public static final String XML_ATTRIBUTE_TAGS = "tags";
	
	public static final String DROOLS_KIEBASE = "kiebase";
	public static final String DROOLS_RULE = "rule";
	public static final String DROOLS_MODEL = "model";
	public static final String DROOLS_CHANNEL = "channel";
	
	public static final String FILENAME_PLUGIN_XML = "plugin.xml";
	public static final String FILENAME_CONFIG_XML = "config.xml";
	public static final String FILENAME_EXTENSIONHANDLER_XML = "extensionhandler.xml";
	///public static final String Transaction = "trx";
	public static final int materialport = 3333;
	public static final String DBPOOLSERVER = "dbpoolserver";
	public static final String DBPOOLCLIENT = "dbpoolclient";
	public static final String PeriodStart = "PeriodStart";
	public static final String PeriodEnd = "PeriodEnd";
	public static final String QtyBonusOrdered = "QtyBonusOrdered";
	public static final String UOMBonus_ID = "UOMBonus_ID";
	public static final String YES = "Y";
	public static final String NO = "N";
	public static final String ERROR = "E";
	public static final int SuperUser = 100;
	public static final String SENDFILESPATH = "sendfilepath";
} 
