package org.xendra.process;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Vector;
import java.util.logging.Level;

import org.compiere.model.MBPartner;
import org.compiere.model.MBPartnerLocation;
import org.compiere.model.MBankAccount;
import org.compiere.model.MCity;
import org.compiere.model.MCountry;
import org.compiere.model.MCurrency;
import org.compiere.model.MDocType;
import org.compiere.model.MInvoice;
import org.compiere.model.MInvoiceLine;
import org.compiere.model.MInvoiceTax;
import org.compiere.model.MLocation;
import org.compiere.model.MProduct;
import org.compiere.model.MRegion;
import org.compiere.model.MTax;
import org.compiere.model.PO;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_C_BP_DocType;
import org.compiere.model.persistence.X_C_BPartner;
import org.compiere.model.persistence.X_C_DocumentTax;
import org.compiere.model.persistence.X_C_InvoiceAdvance;
import org.compiere.model.persistence.X_C_SPOT;
import org.compiere.model.persistence.X_M_Attribute;
import org.compiere.model.persistence.X_M_AttributeInstance;
import org.compiere.model.persistence.X_M_AttributeSetInstance;
import org.compiere.model.persistence.X_M_Product;
import org.compiere.model.persistence.X_S_DocAdvance;
import org.compiere.model.persistence.X_S_DocHeader;
import org.compiere.model.persistence.X_S_DocLegend;
import org.compiere.model.persistence.X_S_DocLine;
import org.compiere.model.persistence.X_S_DocLineOthers;
import org.compiere.model.persistence.X_c_province;
import org.compiere.model.reference.REF_C_BankAccountType;
import org.compiere.model.reference.REF_ECE_5305;
import org.compiere.model.reference.REF_TaxTypeCode;
import org.compiere.process.ProcessInfo;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;
import org.compiere.util.DisplayType;
import org.compiere.util.Env;
import org.compiere.util.Ini;
import org.compiere.util.Language;
import org.compiere.util.Msg;
import org.compiere.util.Util;
import org.xendra.Constants;
import org.xendra.annotations.XendraProcess;
import org.xendra.annotations.XendraProcessParameter;
import org.xendra.annotations.XendraScheduler;
import org.xendra.printdocument.Formatter;

import com.l2fprod.common.propertysheet.PropertySheetTableModel;

import net.sf.jasperreports.engine.xml.JRExpressionFactory.StringExpressionFactory;

// Catálogo No. 01: Código de Tipo de documento 
// cbc:InvoiceTypeCode table C_DocumentTax - taxid
//
// ext:UBLExtensions/ext:UBLExtension/ext:ExtensionContent/sac:AdditionalInformation/sac:SUNATTransaction/cbc:ID
// Catalogo No. 17: Codigos tipo de operacion   AD_Reference: Additional Information Tax
//
// cbc:TaxTypeCode
// Catalogo No. 05 Codigos de tipos de tributos AD_Reference: TaxTypeCode
//
// cbc:TierRange
// Catalogo No. 08 Codigos de tipos de sistema de calculo del ISC AD_Reference: Tier Range
//
// cac:AlternativeConditionPrice cbc:PriceTypeCode
// Catalogo No. 16 Tipo de precio de venta unitario AD_Reference: PriceTypeCode
//
// cbc:ID schemeID="UN/ECE 5305" 
// Tax Category Identifier  AD_Reference ECE_5305
//
// cbc:ID schemeID="UN/ECE 5153" 
// Tax Category Identifier  AD_Reference ECE_5305
//
// cbc:InvoiceTypeCode @listID (tipo de operacion)
// Catalogo No 51 Codigo de tipo de operacion AD_Reference: InvoiceOperationTypeCode




@XendraProcess(value="MigrateEInvoice",
name="MigrateEInvoice",
description="Migrate Invoice to Electronic Invoice",
help="Migrate Invoice to Electronic Invoice",
Identifier="74b1de04-0005-e15d-e7b2-407f732d8947",
classname="org.xendra.process.MigrateEInvoice",
updated="2022-05-19 17:17:12")
@XendraScheduler(frequencytype="M",frequency="2",keeplogdays="7",frequencystartat="", name="MigrateEInvoice",type="A", tag="")
public class MigrateEInvoice  extends SvrProcess {
	@XendraProcessParameter(Name="Business Partner",	
			ColumnName=X_C_BPartner.COLUMNNAME_C_BPartner_ID,
			Description="Identifies a Business Partner",
			Help="A Business Partner is anyone with whom you transact.  This can include Vendor, Customer, Employee or Salesperson",
			AD_Reference_ID=DisplayType.Search,
			SeqNo=60,
			ReferenceValueID="",	
			ValRuleID="",
			FieldLength=10,
			IsMandatory=false,
			IsRange=false,
			DefaultValue="",
			DefaultValue2="",
			vFormat="",
			valueMin="",
			valueMax="",
			DisplayLogic="",
			ReadOnlyLogic="",
			Identifier="05f21be2-4fd4-02d4-bd6d-67123cbc2107")			
	private int			p_C_BPartner_ID = 0;
	private MBPartner m_bp;
	private X_C_SPOT m_spot;

	@Override
	protected void prepare() {
		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++)
		{
			String name = para[i].getParameterName();
			if (para[i].getParameter() == null)
				;
			else if (name.equals(X_C_BPartner.COLUMNNAME_C_BPartner_ID))
				p_C_BPartner_ID = para[i].getParameterAsInt();
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}	
	}

	@Override
	protected String doIt() throws Exception {		
		m_bp = new Query(Env.getCtx(), MBPartner.Table_Name, "C_BPartner_ID = ?", null)
				.setParameters(p_C_BPartner_ID).first();
		X_C_BP_DocType bpdt = new Query(Env.getCtx(), X_C_BP_DocType.Table_Name, "C_BP_DocType_ID = ?", null)
				.setParameters(m_bp.getC_BP_DocType_ID()).first();
		if (bpdt == null) {
			throw new RuntimeException(String.format("tipo de documento tributario para %s no definido", m_bp.getName()));
		}
		String condition = String.format("BankAccountType='%s' AND AD_Client_ID = ?", REF_C_BankAccountType.Detraccion);				
		MBankAccount accountdetraction = new Query(Env.getCtx(), MBankAccount.Table_Name, condition, null)
				.setParameters(m_bp.getAD_Client_ID()).first();
		m_spot = new Query(Env.getCtx(), X_C_SPOT.Table_Name, "", null)
				.setClient_ID()
				.first();
		List<MDocType> dts = new Query(Env.getCtx(), MDocType.Table_Name, "iselectronic = 'Y'", null)
				.list();
		if (dts.size() > 0) {
			for (MDocType dt:dts) {
				X_C_DocumentTax taxdoc = new Query(Env.getCtx(), X_C_DocumentTax.Table_Name, "C_DocumentTax_ID = ?", null)
						.setParameters(dt.getC_DocumentTax_ID()).first();
				if (taxdoc == null) {
					throw new RuntimeException(String.format("documento tributario para %s %s no definido", dt.getC_DocType_ID(), dt.getName()));	
				}
				// debe revisar que ya no existan en s_docheader				
				List<MInvoice> invoices = new Query(Env.getCtx(), MInvoice.Table_Name, "C_DocType_ID = ? AND C_INVOICE_ID NOT IN (SELECT C_INVOICE_ID FROM S_DOCHEADER)", null)
						.setParameters(dt.getC_DocType_ID()).setLimit(1000).list();
				for (MInvoice invoice:invoices) {
					X_S_DocHeader header = new Query(Env.getCtx(), X_S_DocHeader.Table_Name, "C_Invoice_ID = ? AND Processed = 'N' AND Processing = 'N'", null)
							.setParameters(invoice.getC_Invoice_ID()).first();
					if (header == null) {
						header = new X_S_DocHeader(Env.getCtx(), 0, null);
						header.setC_Invoice_ID(invoice.getC_Invoice_ID());
						header.setC_BPartner_ID(invoice.getC_BPartner_ID());						
						header.setInvoiceOperationTypeCode(invoice.getInvoiceOperationTypeCode());					
						header.setC_BPartner_Location_ID(invoice.getC_BPartner_Location_ID());
						//
						MBPartner partner = new Query(Env.getCtx(), MBPartner.Table_Name, "C_BPartner_ID = ?", null)
								.setParameters(invoice.getC_BPartner_ID()).first();
						MBPartnerLocation pl = new Query(Env.getCtx(), MBPartnerLocation.Table_Name, "C_BPartner_ID = ? AND isbillto = 'Y'", null)
								.setParameters(partner.getC_BPartner_ID()).first();
						if (pl == null) {
							throw new RuntimeException(String.format("partner location not defined for %s", partner.getName()));
						}
						MLocation loc = new Query(Env.getCtx(), MLocation.Table_Name, "C_Location_ID = ?", null)
								.setParameters(pl.getC_Location_ID()).first();
						if (loc == null) {
							throw new RuntimeException(String.format("Location not defined for %s ", partner.getName()));
						}
						MCity city = new Query(Env.getCtx(), MCity.Table_Name, "C_City_ID = ?", null)
								.setParameters(loc.getC_City_ID()).first();
						if (city == null) {
							throw new RuntimeException(String.format("City not defined for %s ", partner.getName()));
						}
						MRegion region = new Query(Env.getCtx(), MRegion.Table_Name, "C_Region_ID = ?", null)
								.setParameters(city.getC_Region_ID()).first();
						if (region == null) {
							throw new RuntimeException(String.format("Region not defined for %s ", partner.getName()));
						}
						X_c_province province = new Query(Env.getCtx(), X_c_province.Table_Name, "C_Province_ID = ?", null)
								.setParameters(city.getC_Province_ID()).first();
						if (province == null) {
							throw new RuntimeException(String.format("Province not defined for %s ", partner));
						}
						MCountry country = new Query(Env.getCtx(), MCountry.Table_Name, "C_Country_ID = ?", null)
								.setParameters(city.getC_Country_ID()).first();
						if (country == null) {
							throw new RuntimeException(String.format("Country not defined for %s ", partner.getName()));
						}
						X_C_BP_DocType partnerdt = new Query(Env.getCtx(), X_C_BP_DocType.Table_Name, "C_BP_DocType_ID = ?", null)
								.setParameters(partner.getC_BP_DocType_ID()).first();
						if (partnerdt == null) {
							throw new RuntimeException(String.format("tipo de documento tributario para %s no definido", partner.getName()));
						}
						
						header.setPartnerName(partner.getName());
						header.setPartnerTaxID(partner.getValue());
						//
						header.setC_Currency_ID(invoice.getC_Currency_ID());
						header.setC_DocType_ID(invoice.getC_DocType_ID());
						header.setDateInvoiced(invoice.getDateInvoiced());
						header.setTaxID(taxdoc.getTaxID());
						header.setdoc_descuento(BigDecimal.ZERO);
						header.setdoc_exonerada(BigDecimal.ZERO);
						header.setdoc_exportada(BigDecimal.ZERO);
						header.setdoc_gratuita(BigDecimal.ZERO);
						header.setdoc_gravada(BigDecimal.ZERO);
						header.setdoc_inafecta(BigDecimal.ZERO);
						header.setdoc_otroscargos(BigDecimal.ZERO);
						header.setdoc_otrostributos(BigDecimal.ZERO);
						header.setdoc_percepcion(BigDecimal.ZERO);
						header.setdoc_subtotal(BigDecimal.ZERO);							
						header.setGrandTotal(invoice.getGrandTotal());
						//
						//header.setdoc_tipo_operacion(invoice.getAdditionalInformation());
						header.setAdditionalInformation(invoice.getAdditionalInformation());
						header.setdocu_isc(BigDecimal.ZERO);
						header.setSerial(invoice.getSerial());
						String InvDocumentNo = Util.pad(invoice.getDocumentNo(), 8, Formatter.FIELDALIGNMENTTYPE_TrailingRight, '0');
						String letter = "";
						switch (taxdoc.getTaxID()) {
						case "01":
							letter="F";
							break;
						case "03":
							letter="B";
							break;
						} 
						String DocumentNo = String.format("%s%s-%s", letter,invoice.getSerial(), InvDocumentNo);
						header.setDocumentNo(DocumentNo);						
						//
						BigDecimal totaltax = BigDecimal.ZERO;
						BigDecimal totaltaxbaseamount = BigDecimal.ZERO;
						BigDecimal totaladvance = BigDecimal.ZERO;
						if (invoice.getRef_Invoice_ID() > 0) {
							MInvoice refinvoice = new Query(Env.getCtx(), MInvoice.Table_Name, "C_Invoice_ID = ?", null)
									.setParameters(invoice.getRef_Invoice_ID()).first();
							if (refinvoice != null) {
								MDocType dtref = MDocType.get(Env.getCtx(), refinvoice.getC_DocType_ID());
								if (dtref != null) {
									X_C_DocumentTax taxref = new Query(Env.getCtx(), X_C_DocumentTax.Table_Name, "C_DocumentTax_ID = ?", null)
											.setParameters(dtref.getC_DocumentTax_ID()).first();
									if (taxref != null) {
										header.setReferenceTaxID(taxref.getTaxID());										
									}
								}

							}									
						}
						List<MInvoiceTax> invoicetaxes = new Query(Env.getCtx(), MInvoiceTax.Table_Name, "C_Invoice_ID = ?", null)	
								.setParameters(invoice.getC_Invoice_ID()).list();
						HashMap<String, BigDecimal> taxestotal = new HashMap();
						HashMap<String, BigDecimal> taxbasetotal = new HashMap();
						HashMap<String, MTax> taxes = new HashMap();
						for (MInvoiceTax invoicetax:invoicetaxes) {
							MTax tax = MTax.get(Env.getCtx(), invoicetax.getC_Tax_ID());
							if (tax.getTaxTypeCode() == null) 
								throw new RuntimeException("TaxTypeCode is mandatory");
							if (tax.getECE_5305() == null) 
								throw new RuntimeException("ECE 5305 is mandatory");
							if (tax.getECE_5153() == null)
								throw new RuntimeException("ECE 5153 is mandatory");
							if (!taxes.containsKey(tax.getTaxTypeCode())) {								
								taxes.put(tax.getTaxTypeCode(), tax);
							}
							String alias = tax.getTaxTypeCode();
							if (!taxestotal.containsKey(alias)) {
								taxestotal.put(alias, BigDecimal.ZERO);
							}
							if (!taxbasetotal.containsKey(alias)) {
								taxbasetotal.put(alias, BigDecimal.ZERO);
							}
							BigDecimal amount = taxestotal.get(alias);
							amount = amount.add(invoicetax.getTaxAmt());							
							BigDecimal baseamount = taxbasetotal.get(alias);
							baseamount = baseamount.add(invoicetax.getTaxBaseAmt());
							taxestotal.put(alias, amount);
							taxbasetotal.put(alias, baseamount);
							////header.setC_Tax_ID(tax.getC_Tax_ID());
							totaltax = totaltax.add(invoicetax.getTaxAmt());
							totaltaxbaseamount = totaltaxbaseamount.add(invoicetax.getTaxBaseAmt());

						}						
						Iterator it = taxes.keySet().iterator();
						while (it.hasNext()) {
							String key = (String) it.next();
							//MTax tax = taxes.get(key);
							//String alias = tax.getTaxAlias();
							BigDecimal taxamttotal = taxestotal.get(key);
							BigDecimal taxbaseamttotal = taxbasetotal.get(key);
							switch (key) {							
							case REF_TaxTypeCode.IGV: 
								header.setTaxSAmt(taxamttotal);
								header.setTaxSBaseAmt(taxbaseamttotal);
								break;								
							case REF_TaxTypeCode.EXP: 
								header.setTaxEAmt(taxamttotal);
								header.setTaxEBaseAmt(taxbaseamttotal);
								break;
							case REF_TaxTypeCode.INA: 
								header.setTaxGAmt(taxamttotal);
								header.setTaxGBaseAmt(taxbaseamttotal);
								break;
							case REF_TaxTypeCode.EXO: 
								header.setTaxOAmt(taxamttotal);
								header.setTaxOBaseAmt(taxbaseamttotal);
								break;
							case REF_TaxTypeCode.GRA: 
								header.setTaxZAmt(taxamttotal);
								header.setTaxZBaseAmt(taxbaseamttotal);									
								break;
							case REF_TaxTypeCode.OTR:
								header.setTaxTAmt(taxamttotal);
								header.setTaxTBaseAmt(taxbaseamttotal);
								break;
							}														
						}
						header.setTaxAmt(totaltax);
						header.setTaxBaseAmt(totaltaxbaseamount);
						// detraccion
						// C_Spot
						if (invoice.isDetraction()) {
							if (accountdetraction == null) {
								throw new RuntimeException("detraction is defined but the account not exists");
							}
							if (m_spot == null) {
								throw new RuntimeException("detraction is defined but the spot not defined");
							}
							header.setdocu_codigo_bien_detraccion(invoice.getDocDetraction());
							header.setempr_cta_banco_nacion_detraccion(accountdetraction.getAccountNo());							
						} else {
							header.setdocu_codigo_bien_detraccion("");
							header.setdocu_detraccion(BigDecimal.ZERO);
							header.setdocu_tasa_detraccion("");
							header.setempr_cta_banco_nacion_detraccion("");
						}
						//
						header.setempr_local("");
						//
						header.setrete_regi(BigDecimal.ZERO);
						header.setrete_tasa(BigDecimal.ZERO);
						header.setrete_total_elec(BigDecimal.ZERO);
						header.setrete_total_rete(BigDecimal.ZERO);
						//
						header.settasa_isc(1);
						header.settasa_otrostributos(1);
						BigDecimal discount = BigDecimal.ZERO;
						List<X_C_InvoiceAdvance> lstadvance = new ArrayList<X_C_InvoiceAdvance>();
						if (header.save()) {
							MInvoiceLine[] lines = invoice.getLines();
							for (int i=0; i < lines.length; i++) {
								MProduct p = lines[i].getProduct();
								if (lines[i].getC_InvoiceAdvance_ID() > 0) {
									X_C_InvoiceAdvance advance = new Query(Env.getCtx(), X_C_InvoiceAdvance.Table_Name, "C_InvoiceAdvance_ID = ?", null)
											.setParameters(lines[i].getC_InvoiceAdvance_ID()).first();
									if (advance != null) {
										totaladvance = totaladvance.add(advance.getAmount());
										lstadvance.add(advance);
									}
								}
								if (p.getPriceTypeCode() == null) {
									throw new RuntimeException(String.format("Product %s %s not price type Code defined", p.getValue(), p.getName()));
								}
								X_S_DocLine line = new Query(Env.getCtx(), X_S_DocLine.Table_Name, "C_InvoiceLine_ID = ?", null)
										.setParameters(lines[i].getC_InvoiceLine_ID()).first();
								if (line == null) {
									line = new X_S_DocLine(Env.getCtx(), 0, null);
									line.setC_InvoiceLine_ID(lines[i].getC_InvoiceLine_ID());
									line.setS_DocHeader_ID(header.getS_DocHeader_ID());
								}

								line.setSeqNo(lines[i].getLine());
								line.setC_Currency_ID(header.getC_Currency_ID());
								line.setlinecurrency(header.getC_Currency_ID());
								line.setC_Order_ID(0);
								line.setC_UOM_ID(lines[i].getC_UOM_ID());
								line.setQty(lines[i].getQtyInvoiced());
								line.setM_Product_ID(p.getM_Product_ID());
								line.setproducttaxname(p.getName());
								line.setDescription(lines[i].getDescription());
								line.setitem_afectacion("");
								line.setitem_tipo_precio_venta("");
								line.setPriceActual(lines[i].getPriceActual());
								line.setLineTotalAmt(lines[i].getLineNetAmt());
								line.setventa_noonerosa(BigDecimal.ZERO);
								line.setsubtotal(lines[i].getLineNetAmt());
								line.setC_Tax_ID(lines[i].getC_Tax_ID());								
								line.setTaxBaseAmt(lines[i].getLineNetAmt());	
								BigDecimal taxamt = lines[i].getTaxAmt() ;
								BigDecimal taxbaseamt = lines[i].getLineNetAmt();
								MTax tax = MTax.get(Env.getCtx(), lines[i].getC_Tax_ID());								
								switch (tax.getTaxTypeCode()) {
								case REF_TaxTypeCode.IGV: 
									line.setTaxSAmt(taxamt);
									line.setTaxSBaseAmt(taxbaseamt);
									break;								
								case REF_TaxTypeCode.EXP: 
									line.setTaxEAmt(taxamt);
									line.setTaxEBaseAmt(taxbaseamt);
									break;
								case REF_TaxTypeCode.INA: 
									line.setTaxGAmt(taxamt);
									line.setTaxGBaseAmt(taxbaseamt);
									break;
								case REF_TaxTypeCode.EXO: 
									line.setTaxOAmt(taxamt);
									line.setTaxOBaseAmt(taxbaseamt);
									break;
								case REF_TaxTypeCode.GRA: 
									line.setTaxZAmt(taxamt);
									line.setTaxZBaseAmt(taxbaseamt);									
									break;
								case REF_TaxTypeCode.OTR:
									line.setTaxTAmt(taxamt);
									line.setTaxTBaseAmt(taxbaseamt);
									break;									
								}														
								line.settaxrate(tax.getRate());
								line.settaxamount(lines[i].getTaxAmt());
								line.setitem_isc("");
								line.setitem_base_isc(BigDecimal.ZERO);
								line.setitem_rate_isc(BigDecimal.ZERO);
								line.setitem_ti_isc(BigDecimal.ZERO);
								line.setitem_base_otros_trib(BigDecimal.ZERO);
								line.setitem_rate_otros_trib(BigDecimal.ZERO);
								line.setitem_ti_otros(BigDecimal.ZERO);
								line.setitem_total_tax(lines[i].getTaxAmt());
								line.setitem_tributo("");
								line.setC_Retention_ID(0); // retenciones?
								line.save();
								discount = discount.add(lines[i].getDiscount())
										.add(lines[i].getDiscount1())
										.add(lines[i].getDiscount2())
										.add(lines[i].getDiscount3())
										.add(lines[i].getDiscount4());
								if (lines[i].getM_AttributeSetInstance_ID() > 0 )  {
									X_M_AttributeSetInstance asi = new Query(Env.getCtx(), X_M_AttributeSetInstance.Table_Name, "M_AttributeSetInstance_ID = ?", null)
											.setParameters(lines[i].getM_AttributeSetInstance_ID()).first();
									if (asi.getM_AttributeSet_ID() > 0) {
										List<X_M_AttributeInstance> attributes = 
												new Query(Env.getCtx(), X_M_AttributeInstance.Table_Name, "M_AttributeSetInstance_ID = ? AND M_Attribute_ID = ?", null)
												.setParameters(asi.getM_AttributeSetInstance_ID(), asi.getM_AttributeSet_ID()).list();
										for (X_M_AttributeInstance attribute:attributes) {
											X_M_Attribute attr = new Query(Env.getCtx(), X_M_Attribute.Table_Name, "M_Attribute_ID = ?", null)
													.setParameters(attribute.getM_Attribute_ID()).first();
											X_S_DocLineOthers dlo = new X_S_DocLineOthers(Env.getCtx(), 0, null);
											dlo.setS_DocLine_ID(line.getS_DocLine_ID());
											dlo.setS_DocHeader_ID(header.getS_DocHeader_ID());
											dlo.setAttributeName(attr.getName());
											dlo.setAttributeValue(attribute.getValue());
											dlo.save();
										}
									}
								}

							}
						}						
						header.setDiscount(discount);
						header.setdoc_anticipo_total(totaladvance);
						header.save();
						X_S_DocLegend legend = new Query(Env.getCtx(), X_S_DocLegend.Table_Name, "S_DocHeader_ID = ? AND legend = '1000'", null)
								.setParameters(header.getS_DocHeader_ID()).first();
						if (legend == null) {
							legend = new X_S_DocLegend(Env.getCtx(), 0, null);
							legend.setS_DocHeader_ID(header.getS_DocHeader_ID());
							legend.setLegend("1000");
						}
						MCurrency currency = MCurrency.get(Env.getCtx(), header.getC_Currency_ID());
						String AmountInText = Msg.getAmtInWords(Env.getLanguage(Env.getCtx()), header.getGrandTotal().toString())
								.concat(" ").concat(currency.getDescription());
						legend.settext(AmountInText);												
						legend.save();
						if (lstadvance != null && lstadvance.size() > 0) {
							BigDecimal TotalAmtAdvance = BigDecimal.ZERO;
							Iterator it2 = lstadvance.iterator();
							while (it2.hasNext()) {
								X_C_InvoiceAdvance iad = (X_C_InvoiceAdvance) it2.next();
								MInvoice invoiceref = new Query(Env.getCtx(), MInvoice.Table_Name, "C_Invoice_ID = ?", null)
										.setParameters(iad.getC_Invoice_ID()).first();
								if (invoiceref != null) {
									MDocType doctyperef = new Query(Env.getCtx(), MDocType.Table_Name, "C_DocType_ID = ?", null)
											.setParameters(invoiceref.getC_DocType_ID()).first();
									X_C_DocumentTax taxref = new Query(Env.getCtx(), X_C_DocumentTax.Table_Name, "C_DocumentTax_ID = ?", null)
											.setParameters(doctyperef).first();
									X_S_DocAdvance advance = new Query(Env.getCtx(), X_S_DocAdvance.Table_Name, "C_InvoiceAdvance_ID = ?" , null)
											.setParameters(iad.getC_InvoiceAdvance_ID()).first();
									if (advance == null) {
										advance = new X_S_DocAdvance(Env.getCtx(), 0, null);									
										advance.setC_InvoiceAdvance_ID(iad.getC_InvoiceAdvance_ID());										
									}
									advance.setSchemeID(taxref.getTaxID());
									advance.setC_Currency_ID(invoiceref.getC_Currency_ID());
									advance.setDocumentNo(invoiceref.getDocumentNo());
									advance.setDateAcct(invoiceref.getDateAcct());
									advance.setAmount(iad.getAmount());
									TotalAmtAdvance = TotalAmtAdvance.add(iad.getAmount());
									header.setTotalAdvanceAmount(totaladvance);
									if (advance != null) {
										advance.save();
									}						
								}
							}
						}
					}
				}
			}
		}
		return "";
	}
	public static void main(String[] args) throws Exception {
		if (!org.compiere.Xendra.startup(false))
		{					
			return;
		}
		Env.setContext(Env.getCtx(), "#Date", new Timestamp(System.currentTimeMillis()));
		Optional<String> langName = Optional.ofNullable(Ini.getProperty(Ini.P_LANGUAGE));
		Language language = Language.getLanguage(langName.isPresent()?langName.get():"");
		Env.setContext(Env.getCtx(), Env.LANGUAGE, language.getAD_Language());


		MigrateEInvoice fe = new MigrateEInvoice();
		ProcessInfo pi = new ProcessInfo ("MigrateInvoice", 0 /* Process ID */, /* Table_ID*/ 0, 0 /* record_ID */);
		pi.setAD_User_ID (Env.getAD_User_ID(Env.getCtx()));
		pi.setAD_Client_ID (Env.getAD_Client_ID(Env.getCtx()));			
		Vector<ProcessInfoParameter> tabParams = new Vector<ProcessInfoParameter>();
		//
		//ProcessInfoParameter pip;
		//pip = new ProcessInfoParameter(X_M_Product.COLUMNNAME_M_Product_ID, 1018605 , null, null, null);
		//tabParams.add(pip);		

		//pip = new ProcessInfoParameter("IsCalculateStock", "Y", null, null, null);
		//tabParams.add(pip);

		//pip = new ProcessInfoParameter("IsCalculateCost", "Y", null, null, null);
		//tabParams.add(pip);
		//
		ProcessInfoParameter pip;
		pip = new ProcessInfoParameter(X_C_BPartner.COLUMNNAME_C_BPartner_ID, 2000000 , null, null, null);
		tabParams.add(pip);		
		//			
		pi.setParameter(tabParams.toArray(new ProcessInfoParameter[]{}));			
		fe.startProcess(Env.getCtx(), pi, null);					
	}
}
