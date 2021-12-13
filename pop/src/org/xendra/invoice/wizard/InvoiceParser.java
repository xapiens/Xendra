package org.xendra.invoice.wizard;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.columba.core.xml.XMLCoreParser;
import org.compiere.model.MBPartner;
import org.compiere.model.MBPartnerLocation;
import org.compiere.model.MCity;
import org.compiere.model.MCurrency;
import org.compiere.model.MLocation;
import org.compiere.model.MOrder;
import org.compiere.model.MProduct;
import org.compiere.model.MProductPO;
import org.compiere.model.MUOM;
import org.compiere.model.Query;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.Namespace;

public class InvoiceParser  extends XMLCoreParser {
	public static HashMap<String, Integer> worddictionary;
	private String DocumentNo;
	private Timestamp issueDate;
	private Timestamp promisedDate;
	private int C_Currency_ID;
	private int C_BPartner_ID;
	private int C_BPartner_Location_ID;
	private HashMap<String, InvoiceLine> lines = new HashMap<String, InvoiceLine>();
	private Document doc;
	private List<Element> elementlines = new ArrayList<Element>();
	private int index = 0;
	private MBPartner partner = null;
	private HashMap<String, Namespace> hnamespaces;
	private static InvoiceParser instance;

	public static InvoiceParser getInstance() {
		if (instance == null)
			instance = new InvoiceParser();
		return instance;
	}

	public InvoiceParser() {
		String sql = "Select Name from m_product";
		List<String> names = new ArrayList<String>();
		PreparedStatement pstmt = DB.prepareStatement(sql, null);
		try {				
			ResultSet rs = pstmt.executeQuery();			
			while (rs.next())
			{
				String name = rs.getString(1);
				names.add(name);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		worddictionary = new HashMap<String, Integer>();
		for (String name:names) {
			StringTokenizer st = new StringTokenizer(name, " ");
			while (st.hasMoreElements()) {
				String word = (String) st.nextElement();
				int count = 1;
				if (worddictionary.containsKey(word)) {
					count = (Integer) worddictionary.get(word);
					count ++;
					worddictionary.put(word,count);
				} else {
					worddictionary.put(word,count);
				}
			}
		}		
	}
	private Comparator<? super Entry<String, Integer>> comparingByValue() {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		org.compiere.Xendra.startup(true);
		Env.setContext(Env.getCtx(), "#AD_Client_ID", 1000038);
		Env.setContext(Env.getCtx(), "#AD_Org_ID", 1000091);
		Env.setContext(Env.getCtx(), "#M_Warehouse_ID", 1000132);

		try
		{
			int no;
			int index = 1;
			String countSql = "SELECT COUNT(*) FROM M_Product where NAME ~?  AND  NAME ~?";
			PreparedStatement pstmt = DB.prepareStatement(countSql, null);
			pstmt.setString(index++, "DISNEY");
			pstmt.setString(index++, "FRAS");
			ResultSet rs = pstmt.executeQuery();
			if (rs.next())
				no = rs.getInt(1);
			rs.close();
			pstmt.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
			//log.log(Level.SEVERE, countSql, e);
			//no = -2;
		}

		//String example = "DOLORAL 100MG SUSPENSIÓN X 60ML";
		InvoiceParser pi = new InvoiceParser();
		pi.load(new File("/home/xapiens/Downloads/F002-00013191.xml"));		
	}

	private MProduct getProduct(String description) {
		description = cleanlatinchars(description);
		List<String> words = getsignificantwords(description);
		List<String> keywords = getkeywords(words);
		List<String> units = getunits(words);
		MProduct p = searchProduct(keywords, units);
		return p;
	}

	private MProduct searchProduct(List<String> keywords, List<String> units) {
		String where = "";
		String gg = "";
		for (String keyword:keywords) {
			if (where.length() > 0) {
				where += " AND ";
			}
			where += String.format("name ~'%s'",keyword);
		}		
		for (String unit:units) {
			if (where.length() > 0) {
				where += " AND ";
			}
			where += String.format("name ~'%s'",unit);
		}
		// first try with keywords and units complete
		MProduct p = new Query(Env.getCtx(), MProduct.Table_Name, where, null).first();
		if (p == null) { // first attempt failed, try second attempt only with the numbers of units
			where = "";
			for (String keyword:keywords) {
				if (where.length() > 0) {
					where += " AND ";
				}
				where += String.format("name ~'%s'",keyword);
			}		
			for (String unit:units) {

				if (where.length() > 0) {
					where += " AND ";
				}
				String patternstr = "([0-9]+)"; // muestra 100 y 60
				Pattern pattern = Pattern.compile(patternstr);
				Matcher matcher = pattern.matcher(unit);			
				if (matcher.find()) {
					where += String.format("name ~'%s'",matcher.group());	
				}				
			}			
			p = new Query(Env.getCtx(), MProduct.Table_Name, where, null).first();
		}
		// third intent -- discard the word more comun
		if (p == null)  {
			where = "";
			Integer morecommon = 0;
			for (String keyword:keywords) {
				try {
					Integer ocurrence = 0;
					if (worddictionary.containsKey(keyword)) {
						ocurrence = worddictionary.get(keyword);
					}					
					if (ocurrence > morecommon) 
						morecommon = ocurrence;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			for (String keyword:keywords) {
				Integer ocurrence = 0;
				if (worddictionary.containsKey(keyword)) {
					ocurrence = worddictionary.get(keyword);
				}
				if (ocurrence.equals(morecommon))
					continue;
				if (where.length() > 0) {
					where += " AND ";
				}
				where += String.format("name ~'%s'",keyword);
			}		
			for (String unit:units) {

				if (where.length() > 0) {
					where += " AND ";
				}
				String patternstr = "([0-9]+)"; // muestra 100 y 60
				Pattern pattern = Pattern.compile(patternstr);
				Matcher matcher = pattern.matcher(unit);			
				if (matcher.find()) {
					where += String.format("name ~'%s'",matcher.group());	
				}				
			}			
			//p = new Query(Env.getCtx(), MProduct.Table_Name, where, null).first();
			//if (p == null) {				
			//	System.out.println("X");
			//}
			//worddictionary
		}
		return p;
	}

	private List<String> getkeywords(List<String> words) {
		List<String> keywords = new ArrayList<String>();
		for (String word:words) {			
			String patternstr = "([0-9]+)"; // muestra 100 y 60
			Pattern pattern = Pattern.compile(patternstr);
			Matcher matcher = pattern.matcher(word);			
			if (!matcher.find()) {
				keywords.add(word);
			}			
		}
		return keywords;
	}

	private List<String> getunits(List<String> words) {
		List<String> units = new ArrayList<String>();
		for (String word:words) {
			String patternstr = "([0-9]+)"; // muestra 100 y 60 de 100MG 60GR
			Pattern pattern = Pattern.compile(patternstr);
			Matcher matcher = pattern.matcher(word);			
			if (matcher.find()) {
				units.add(word);
			}			
		}
		return units;
	}

	private List<String> getsignificantwords(String example) {
		List<String> words = new ArrayList<String>();
		StringTokenizer st = new StringTokenizer(example, " ");
		while (st.hasMoreElements()) {
			String key = (String) st.nextElement();
			if (key.length() > 1) {
				words.add(key);
			}
		}
		return words;
	}

	private String cleanlatinchars(String example) {
		String Patternexpr = "[^\\x00-\\x7F]+";
		Pattern pattern = Pattern.compile(Patternexpr);
		Matcher matcher = pattern.matcher(example);			
		if (matcher.find())  {
			example = example.toUpperCase();
			example = example.replace("Á","A");
			example = example.replace("É","E");
			example = example.replace("Í","I");
			example = example.replace("Ó","O");
			example = example.replace("Ú","U");
		}
		Patternexpr = "&";
		pattern = Pattern.compile(Patternexpr);
		matcher = pattern.matcher(example);
		if (matcher.find())  {
			example = example.toUpperCase();
			example = example.replace("&","");			
		}
		return example;
	}

	public void load(File file) {
		reset();
		BufferedInputStream bufrule = null;
		try {
			bufrule = new BufferedInputStream(new FileInputStream(file));
		} catch (Exception e) {
			String err = e.getMessage();
			if (err == null) {
				err = "nullpointer";
			}			
		}
		createDoc(bufrule);		
	}
	private void reset() {
		DocumentNo = "";
		issueDate = null;
		promisedDate = null;
		C_Currency_ID = 0;
		C_BPartner_ID = 0;
		C_BPartner_Location_ID = 0;
		//lines = new ArrayList<InvoiceLine>();
		lines = new HashMap<String, InvoiceLine>();
		doc = null;
		elementlines = new ArrayList<Element>();
		index = 0;
		partner = null;		
	}

	private void createDoc(InputStream is) {
		doc = retrieveDocument(is);
		Element parent = doc.getRootElement();
		List namespaces = parent.getAdditionalNamespaces();
		hnamespaces= new HashMap<String, Namespace>();
		for (int i = 0; i < namespaces.size(); i ++) {
			Namespace ns = (Namespace) namespaces.get(i);
			hnamespaces.put(ns.getPrefix(), ns);			
		}
		Element eid = parent.getChild("ID", hnamespaces.get("cbc"));
		setDocumentNo(eid.getValue());		
	}

	int getLinesofDoc() {
		return elementlines.size();
	}

	public Boolean existDoc() {
		Boolean exists = false;
		Element parent = doc.getRootElement();		
		MOrder order = new Query(Env.getCtx(), MOrder.Table_Name, "DocumentNo = ?", null)
		.setParameters(getDocumentNo()).first();
		if (order != null) {
			exists = true;
		}
		return exists;		
	}

	public void parseDoc() {
		try {									
			int linecount = 0;
			//setOrder(doc);
			Element parent = doc.getRootElement();
			Iterator iterator = parent.getChildren().listIterator();
			Element extensionXmlElement;
			while (iterator.hasNext()) {
				extensionXmlElement = (Element) iterator.next();
				String value = extensionXmlElement.getValue();
				if (extensionXmlElement.getName().equals("UUID")) {
				} else if (extensionXmlElement.getName().equals("IssueDate")) {
					SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
					Date parsedDate = dateFormat.parse(value);
					Timestamp issuedate = new Timestamp(parsedDate.getTime());
					setDateOrdered(issuedate);
				} else if (extensionXmlElement.getName().equals("DueDate")) {
					SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
					Date parsedDate = dateFormat.parse(value);
					Timestamp duedate = new Timestamp(parsedDate.getTime());
					setDatePromised(duedate);
				} else if (extensionXmlElement.getName().equals("InvoiceTypeCode")) {

				} else if (extensionXmlElement.getName().equals("Note")) {
				} else if (extensionXmlElement.getName().equals("DocumentCurrencyCode")) {
					MCurrency currency = MCurrency.get(value, null);
					setC_Currency_ID(currency.getC_Currency_ID());
				} else if (extensionXmlElement.getName().equals("LineCountNumeric")) {
					linecount = Integer.valueOf(value);	
				} else if (extensionXmlElement.getName().equals("DespatchDocumentReference")) {
				} else if (extensionXmlElement.getName().equals("Signature")) {
				} else if (extensionXmlElement.getName().equals("AccountingSupplierParty")) {
					List supplierpartyelems = extensionXmlElement.getChildren();
					for (int i=0; i<supplierpartyelems.size();i++) {
						Element ss = (Element) supplierpartyelems.get(i);
						if (ss.getName().equals("Party")) {
							String Value = "";
							String name = "";
							String ubigeo = "";
							String addrstype = "";
							String cityname = "";
							String countrysubentity = "";
							String district = "";
							String country = "";
							List<String> addrlines = new ArrayList<String>();
							Iterator it = ss.getChildren().listIterator();
							while (it.hasNext()) {
								Element line = (Element) it.next();
								String partyvalue = line.getValue();

								if (line.getName().equals("PartyIdentification")) {
									Value = partyvalue.trim();
								} else if (line.getName().equals("PartyName")) {
									name = partyvalue.trim();
								} else if (line.getName().equals("PartyTaxScheme")) {

								} else if (line.getName().equals("PartyLegalEntity")) {									
									List xxlegalentity = line.getChildren();
									for (int j=0; j<xxlegalentity.size();j++) {
										Element sslegal = (Element) xxlegalentity.get(j);
										if (sslegal.getName().equals("RegistrationName")) {

										} else if (sslegal.getName().equals("RegistrationAddress")) {
											List xxaddr = sslegal.getChildren();
											for (int k=0; k<xxaddr.size();k++) {
												Element ssaddr = (Element) xxaddr.get(k);
												String addrvalue = ssaddr.getValue();
												if (ssaddr.getName().equals("ID")) {
													if (ssaddr.getAttributeValue("schemeName").equals("Ubigeos")) {
														ubigeo = addrvalue;
													}
												} else if (ssaddr.getName().equals("AddressTypeCode")) {
													addrstype = addrvalue;
												} else if (ssaddr.getName().equals("CityName")) {
													cityname = addrvalue;
												} else if (ssaddr.getName().equals("CountrySubentity")) {
													countrysubentity = addrvalue;
												} else if (ssaddr.getName().equals("District")) {
													district = addrvalue;
												} else if (ssaddr.getName().equals("AddressLine")) {
													List elines = ssaddr.getChildren();
													for (int l=0; l<elines.size();l++) {
														Element eline = (Element) elines.get(i);														
														addrlines.add(eline.getValue());
													}
												} else if (ssaddr.getName().equals("Country")) {
													country = addrvalue;
												}
											}
										}
									}									
								}
							}
							partner = MBPartner.get(Env.getCtx(), Value);	
							if (partner == null) {
								partner = new MBPartner(Env.getCtx(), 0, null);
								partner.setValue(Value);
								partner.setName(name);
								if (partner.save()) {
									createLocation(addrlines, ubigeo, district);
								}
							}
							setC_BPartner_ID(partner.getC_BPartner_ID());
							MBPartnerLocation[] locations = partner.getLocations(false);
							if (locations.length == 0) {
								setC_BPartner_Location_ID(createLocation(addrlines, ubigeo, district));
							} else {							
								Boolean found = false;
								for (MBPartnerLocation location:locations) {
									MLocation loc = MLocation.get(Env.getCtx(), location.getC_Location_ID(), null);
									if (addrlines.size() > 0) {										
										if ( loc.getAddress1().equals(addrlines.get(0))) { 									
											setC_BPartner_Location_ID(location.getC_BPartner_Location_ID());
											found = true;
										}
									}
								}		
								if (!found) {									
									setC_BPartner_Location_ID(locations[0].getC_BPartner_Location_ID());
								}
							}
						}						
					}
				} else if (extensionXmlElement.getName().equals("AccountingCustomerParty")) {
				} else if (extensionXmlElement.getName().equals("TaxTotal")) {					
				} else if (extensionXmlElement.getName().equals("LegalMonetaryTotal")) {

				} else if (extensionXmlElement.getName().equals("InvoiceLine")) { 
					elementlines.add(extensionXmlElement);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}				
	}
	private Integer createLocation(List<String> addrlines, String ubigeo, String district) {
		Integer C_BPartner_Location_ID = 0;
		MLocation loc = new MLocation(Env.getCtx(), 0, null);
		if (addrlines.size() > 0) {										
			loc.setAddress1(addrlines.get(0));
			if (addrlines.size() > 1)
				loc.setAddress2(addrlines.get(1));
			if (addrlines.size() > 2)
				loc.setAddress3(addrlines.get(2));
			if (addrlines.size() > 3)
				loc.setAddress4(addrlines.get(3));

		}
		if (ubigeo.length() > 0) {
			MCity city = new Query(Env.getCtx(), MCity.Table_Name, "locode = ?", null)
			.setParameters(ubigeo).first();
			if (city != null) {
				loc.setC_Country_ID(city.getC_Country_ID());
				loc.setC_Province_ID(city.getC_Province_ID());
				loc.setCity(city);
				//loc.setC_Region_ID(city.getC_Region_ID());																						
			} else {
				String where = "";
				city = new Query(Env.getCtx(), MCity.Table_Name, "name = ?", null)
				.setParameters(district).first();
				if (city != null) {
					city.setLocode(ubigeo);
					loc.setC_Country_ID(city.getC_Country_ID());
					loc.setC_Province_ID(city.getC_Province_ID());
					loc.setCity(city);												
					//loc.setC_Region_ID(city.getC_Region_ID());
				}
			}
		}
		loc.save();
		MBPartnerLocation bloc = new MBPartnerLocation(partner);
		bloc.setC_Location_ID(loc.getC_Location_ID());
		bloc.setIsBillTo(true);
		if (bloc.save()) {
			C_BPartner_Location_ID = bloc.getC_BPartner_Location_ID();
		}		
		return C_BPartner_Location_ID;
	}

	public void resetInvoiceLineCounter() {
		index = 0;		
	}
	public void parseLine() {
		MUOM uom = null;
		Element extensionXmlElement = elementlines.get(index );
		Element eID = extensionXmlElement.getChild("ID", hnamespaces.get("cbc"));
		String lineID = eID.getValue().trim();
		InvoiceLine oline = null;
		if (!lines.containsKey(lineID)) {
			oline = new InvoiceLine();
			//MOrderLine oline = new MOrderLine(order);
			//InvoiceLine oline = new InvoiceLine();
			Iterator it = extensionXmlElement.getChildren().listIterator();					
			while (it.hasNext()) {
				Element line = (Element) it.next();
				String var = line.getValue().trim();
				if (line.getName().equals("ID")) {				
					oline.setID(var);
				} else if (line.getName().equals("InvoicedQuantity")) {
					String uomsymbol = line.getAttributeValue("unitCode");
					uom = MUOM.get(Env.getCtx(), uomsymbol);
					BigDecimal qty = new BigDecimal(var);
					oline.setQty(qty);
				} else if (line.getName().equals("LineExtensionAmount")) {
				} else if (line.getName().equals("PricingReference")) {
				} else if (line.getName().equals("TaxTotal")) {
				} else if (line.getName().equals("Item")) {
					Iterator it2 = line.getChildren().listIterator();
					MProduct p = null;
					String description = "";
					while (it2.hasNext()) { 
						Element itemdetail = (Element) it2.next();
						String vard = itemdetail.getValue().trim();
						if (itemdetail.getName().equals("Description")) {
							description = vard;
							if (p == null) {
								p = getProduct(vard);
							}
						} else if (itemdetail.getName().equals("SellersItemIdentification")) {
							if (p == null) {
								p = new Query(Env.getCtx(), MProductPO.Table_Name, "vendorproductno = ? AND C_BPartner_ID = ?", null)
								.setParameters(vard, partner.getC_BPartner_ID()).first();
							}
							oline.setVendorProductNo(vard);
						}
					}
					oline.setDescription(description);
					if (p != null) 
						oline.setM_Product_ID(p.getM_Product_ID(), uom.getC_UOM_ID());				 										
				} else if (line.getName().equals("Price")) {
					BigDecimal amt = new BigDecimal(var);
					oline.setPriceEntered(amt);							
				}
			}
		} else {
			oline = lines.get(lineID);
			if (oline.getM_Product_ID() == 0) {
				MProduct p = getProduct(oline.getDescription());
				if (p != null) {
					oline.setM_Product_ID(p.getM_Product_ID());
				}
			}
		}
		addLine(lineID, oline);
		index++;
	}

	private void addLine(String key, InvoiceLine oline) {
		lines.put(key, oline);		
	}
	public List<InvoiceLine> getLines() {
		Iterator it = lines.keySet().iterator();
		List<InvoiceLine> ilines = new ArrayList<InvoiceLine>();
		while (it.hasNext()) {
			String key = (String) it.next();
			ilines.add(lines.get(key));
		}
		return ilines;
	}
	public InvoiceParser get() {
		return this;
	}
	private void setDocumentNo(String doc) {
		DocumentNo = doc;
	}
	public String getDocumentNo() {
		return DocumentNo;
	}
	private void setDateOrdered(Timestamp issueDate) {
		this.issueDate = issueDate; 	
	}
	public Timestamp getDateOrdered() {
		return issueDate;
	}
	private void setDatePromised(Timestamp promisedDate) {
		this.promisedDate = promisedDate;
	}
	public Timestamp getDatePromised() {
		Timestamp var = promisedDate; 
		if (var == null)
			var = issueDate;
		return var;
	}
	public void setC_Currency_ID(int C_Currency_ID) {
		this.C_Currency_ID = C_Currency_ID;
	}
	public int getC_Currency_ID() {
		return C_Currency_ID;
	}
	public void setC_BPartner_ID(int C_BPartner_ID) {
		this.C_BPartner_ID = C_BPartner_ID;
	}
	public int getC_BPartner_ID() {
		return this.C_BPartner_ID;
	}
	public void setC_BPartner_Location_ID(int C_BPartner_Location_ID) {
		this.C_BPartner_Location_ID = C_BPartner_Location_ID;
	}
	public int getC_BPartner_Location_ID() {
		return this.C_BPartner_Location_ID;
	}
}