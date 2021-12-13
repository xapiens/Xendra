/******************************************************************************
 * Product: Xendra ERP & CRM Smart Business Solution                          *
 * Copyright (C) 2007 Dravio SAC. All Rights Reserved.                		  *
 * This program is free software; you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY; without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program; if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 *****************************************************************************/
package org.xendra.pop;

import java.math.BigDecimal;
import java.sql.*;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;

import org.compiere.model.MPOP;
import org.compiere.model.MPriceListVersion;
import org.compiere.model.MSession;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_A_Machine;
import org.compiere.model.persistence.X_C_POP;
import org.compiere.model.persistence.X_C_PrinterFormat;
import org.compiere.model.reference.REF_C_PrinterFormatType;
import org.compiere.util.*;

import org.xendra.pop.wizard.POPWizardLauncher;

/**
 * @author xapiens
 * @version $Id: PopModel.java 7096 2020-01-21 04:26:57Z xapiens $
 */
public class PopModel {
	private Properties ctx = Env.getCtx();
	public MPOP config = null;
	/**
	 * Payment type for the document to be generated.
	 */
	public int payType = 0;
	private String ClientAlias;
	//public int DefaultBPartner = 0;
	public int M_PriceList_ID = 0;
	private int M_Cash_ID = 0;
	private int M_Credit_ID = 0 ;
	private int Order_C_DocType_ID = 0;
	private int InOut_C_DocType_ID = 0;
	private int Invoice_C_DocType_ID = 0;
	private int M_Notify_Role_ID = 0;
	private int SalesRep_ID = 0;
	private int R_RequestType_ID = 0;
	private int AD_PosPrintFormat_ID;
	/**
	 * Logger
	 */
	private static CLogger log = CLogger.getCLogger(PopModel.class);	
	//private static String error = "";
	private static String error;

	public static final int DOCTYPE_BOLETA = 0;
	public static final int DOCTYPE_FACTURA = 1;
	public static final int DOCTYPE_GUIA = 2;
	public static final int PAYTYPE_CASH = 0;
	public static final int PAYTYPE_CCARD = 1;
	public static final int PAYTYPE_CREDIT = 2;
	
	/**
	 * Constructor of the PosModel class. It simply loads some objects which are
	 * called by PopPanel, plus loading the configuration and bailing out if it
	 * couldn't find it.
	 * @throws SecurityException If a suitable configuration for the user could not be found.
	 */
	public PopModel(MPOP conf) {
		this.config = conf;
		if (this.config == null) {
			log.log(Level.SEVERE, "POP Configuration not found!");
			throw new SecurityException("POP configuration not found");
		}
		MPriceListVersion priceListVersion = new MPriceListVersion(ctx, config.getM_PriceList_Version_ID(), null);	
		M_PriceList_ID = priceListVersion.getM_PriceList_ID();
		//DefaultBPartner = config.getDefault_C_BPartner_ID();
		Order_C_DocType_ID = config.getOrder_C_DocType_ID();
		InOut_C_DocType_ID = config.getInOut_C_DocType_ID();
		Invoice_C_DocType_ID = config.getInvoice_C_DocType_ID();
		//M_Cash_ID = config.getCash_C_PaymentTerm_ID();
		//M_Credit_ID = config.getCredit_C_PaymentTerm_ID();
		//M_Notify_Role_ID = config.getNotify_Role_ID();
		//SalesRep_ID = config.getSalesRep_ID();
		//R_RequestType_ID = config.getR_RequestType_ID();		
	}	
	
	public static PopModel get(int m_WindowNo)
	{
		X_A_Machine machine = null;
		MPOP config = null;

		try {
			String macaddress = Util.getLocalMacAddress();		
			if (macaddress.length() > 0)
			{
				String where = "mac_address = ? ";
				machine = new Query(Env.getCtx(), X_A_Machine.Table_Name, where, null)
				.setParameters(macaddress).first();
				if (machine == null)
				{
					POPWizardLauncher nn = new POPWizardLauncher();	
					nn.launchWizard();
					machine = new Query(Env.getCtx(), X_A_Machine.Table_Name, where, null)
					.setParameters(macaddress).first();
					if (machine == null)
						throw new Exception("No se definio la caja asignada");
				}
			}		
			else
			{
				throw new Exception("no tiene mac address por alguna razon");				
			}
			MSession sesion = MSession.get (Env.getCtx(), false);
			config = new Query(Env.getCtx(), X_C_POP.Table_Name, "A_Machine_ID = ?", null).setParameters(machine.getA_Machine_ID()).first();
			if (config == null)
			{
				POPWizardLauncher nn = new POPWizardLauncher();	
				nn.launchWizard();
				config = new Query(Env.getCtx(), X_C_POP.Table_Name, "A_Machine_ID = ?", null).setParameters(machine.getA_Machine_ID()).first();
				if (config == null)
					throw new Exception("No se definio la caja asignada");				
			}
			int AllFormats = 0;
			int AllMandatoryFormats = 1;	        
			List<X_C_PrinterFormat> formats = new Query(Env.getCtx(), X_C_PrinterFormat.Table_Name, "AD_Table_ID = ? AND Record_ID = ?", null)
			.setParameters(X_C_POP.Table_ID, config.getC_POP_ID()).list();
			//for (X_C_PrinterFormat format:formats)
			//{
			//	if (format.getC_PrinterFormatType().equals(REF_C_PrinterFormatType.Collection))
			//		AllFormats ++;
			//}	
			if (AllFormats != AllMandatoryFormats)
			{
				throw new Exception("Los Formatos definidos son insuficientes");
			}					
			Integer M_Warehouse_ID = Env.getContextAsInt(Env.getCtx(), "#M_Warehouse_ID");
			if (M_Warehouse_ID.compareTo(config.getM_Warehouse_ID()) != 0 )
			{			
				Env.setContext(Env.getCtx(), "#M_Warehouse_ID", M_Warehouse_ID);
			}
			PopModel posmodel = new PopModel(config);
			return posmodel;
		}
		catch (Exception e)
		{
			e.printStackTrace();
			error = e.getMessage();
			//return null;						
		}
		return null;				
	}
	
//	public Boolean isModifyDate()		 {		return config.isModifyDate();				}
//	public Boolean isModifyDocNumber()	 {		return config.IsModifyDocNumber();			}
//	public Boolean IsAppServerForced()   {		return config.IsAppServerForced();			}
	public int getR_RequestType_ID()	 {		return R_RequestType_ID;					}
	public int getSalesRep_ID()			 {		return SalesRep_ID;							}
	public int getM_Notify_Role_ID()	 {		return M_Notify_Role_ID;					}
	public int getM_Cash_ID()		 	 {		return M_Cash_ID;							}
	public int getM_Credit_ID()			 {		return M_Credit_ID;							}
	public int getOrder_C_DocType_ID()   {      return Order_C_DocType_ID;					}
	public int getInOut_C_DocType_ID()   {      return InOut_C_DocType_ID;                  }
	public int getInvoice_C_DocType_ID() {      return Invoice_C_DocType_ID;				}
	public int getPriceListVersion()	 {		return config.getM_PriceList_Version_ID();	}
	//public int getC_PrintServer_ID()	 {		return config.getC_PrintServer_ID();		}
	public int getM_PriceList_ID()		 {		return M_PriceList_ID;						}
	//public int getDefaultBPartner()	 {		return DefaultBPartner;						}
	//public String getClientAlias()	 {		return ClientAlias;							}
	

	/**
	 * This function will create the 3 documents needed for a complete purchase. This includes:
	 * <li>Sales Order</li>
	 * <li>Shipment</li>
	 * <li>Invoice</li>
	 * The invoice is paid using either cash journal (for cash payments), bank account (for credit card)
	 * or is not paid at all (for credit).
	 * It will also print the ticket, and rollback the whole transaction if it could not print it for
	 * any reason.
	 * This process is completelly transactional, so no partially-completed process will ever occur.
	 * @param C_BPartner_ID	The business partner for the document.
	 * @param DocType			The type of document to be generated (affected by the payment type). See DOCTYPE_* constants.
	 * @param refNo			The reference number (from the voucher)  for credit cards.
	 * @param rows			The rows of the document (code, description, unit price, quantity, total).
	 * @return A string indicating the error (must be translated) on error, or null on success.
	 */

	/**
	 * Gets the product code and quantity asociated to the specified quick key in the current configuration.
	 * @param id	The key number
	 * @return	An array containing a String with the product code as index 0, and a BigDecimal containing the quantity.
	 */
	public Object[] getQuickProduct(int id) {
		try {
			String sql = "SELECT " +
							"p.Value," +
							"k.Qty " +
						"FROM " +
							"C_PosKey k " +
							"LEFT JOIN M_Product p ON (k.M_Product_ID=p.M_Product_ID)" +
					    "WHERE " +
					    	"k.C_PosKeyLayout_ID=? " +
					    "ORDER BY " +
					 		"k.SeqNo " +
					    "OFFSET ?";
			PreparedStatement pstmt = DB.prepareStatement(sql, null);
			pstmt.setInt(1, config.getC_POSKeyLayout_ID());
			pstmt.setInt(2, id);
			ResultSet rs = pstmt.executeQuery();
			
			if (rs.next()) {
				String value = rs.getString(1);
				BigDecimal qty = rs.getBigDecimal(2);
				rs.close();
				pstmt.close();
				Object[] retval = new Object[2];
				retval[0] = value;
				retval[1] = qty;
				return retval;
			}
			else {
				rs.close();
				pstmt.close();
				return null;
			}
		}
		catch (SQLException e) {
			return null;
		}
	}

	public static String getError() {		
		return error;
	}

}

