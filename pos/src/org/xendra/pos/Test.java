package org.xendra.pos;

import java.awt.EventQueue;
import java.util.List;

import org.columba.core.component.ComponentManager;
import org.columba.core.gui.frame.FrameManager;
import org.columba.core.plugin.PluginManager;
import org.compiere.apps.AEnv;
import org.compiere.apps.ALogin;
import org.compiere.model.MCurrency;
import org.compiere.model.MMessageFormat;
import org.compiere.model.MOrder;
import org.compiere.model.MPrinterDocumentFormat;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_MessageFormat;
import org.compiere.model.persistence.X_A_Machine;
import org.compiere.model.persistence.X_C_CampaignBonus;
import org.compiere.model.persistence.X_C_CampaignDiscount;
import org.compiere.model.persistence.X_C_Currency;
import org.compiere.model.persistence.X_C_Order;
import org.compiere.model.persistence.X_C_OrderLine;
import org.compiere.model.persistence.X_C_POS;
import org.compiere.model.persistence.X_C_Tax;
import org.compiere.model.persistence.X_M_AttributeSet;
import org.compiere.model.persistence.X_M_AttributeSetInstance;
import org.compiere.model.persistence.X_M_Product;
import org.compiere.util.Env;
import org.compiere.util.Splash;
import org.compiere.util.Util;
import org.xendra.Constants;
import org.xendra.printdocument.MVELParseFormat;
import org.xendra.printdocument.PrintDocument;
import org.xendra.util.POUtil;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					org.compiere.Xendra.startup(true);
					Splash splash = Splash.getSplash();
					ALogin login = new ALogin(splash);
					if (!login.initLogin())		//	no automatic login
					{
						//	Center the window
						try
						{
							AEnv.showCenterScreen(login);	//	HTML load errors
						}
						catch (Exception ex)
						{
							//log.severe(ex.toString());
							ex.printStackTrace();
						}
						if (!login.isConnected() || !login.isOKpressed())
							AEnv.exit(1);
					}
					
					splash.dispose();
					splash = null;					
					
					int AD_Role_ID = Env.getAD_Role_ID(Env.getCtx());
					
					List<X_A_Machine> machines = new Query(Env.getCtx(), X_A_Machine.Table_Name, "IsActive = 'Y' ", null).list();
					for (X_A_Machine machine:machines)
					{
						
					}
					PluginManager.getInstance().addExtensionHandlers("org/columba/core/plugin/extensionhandler.xml");

					String path = "org/columba/core/plugin/plugin.xml";
					PluginManager.getInstance().addPlugin(path);

					path = "org/xendra/pos/plugin/plugin.xml";
					PluginManager.getInstance().addPlugin(path);
					ComponentManager.getInstance().init();
					//
					MMessageFormat format = new Query(Env.getCtx(), X_AD_MessageFormat.Table_Name, "AD_MessageFormat_ID = ?", null)
					.setParameters(1).first();
					format.getDocument();
					format.startMessage();
					format.AddProperty("item",X_C_OrderLine.COLUMNNAME_M_Product_ID, "1");
					format.AddProperty("item",X_M_Product.COLUMNNAME_M_AttributeSet_ID, "1");
					format.AddProperty("item",X_C_OrderLine.COLUMNNAME_PriceActual, "1");
					format.AddProperty("item",X_C_OrderLine.COLUMNNAME_PriceList, "1");
					format.AddProperty("item",X_C_OrderLine.COLUMNNAME_PriceLimit, "1");
					format.AddProperty("item",X_C_OrderLine.COLUMNNAME_PriceEntered, "1");
					format.AddProperty("item",X_C_OrderLine.COLUMNNAME_QtyOrdered, "1");
					format.AddProperty("item",X_C_OrderLine.COLUMNNAME_QtyEntered, "1");
					format.AddProperty("item",X_C_OrderLine.COLUMNNAME_PriceBase, "1");
					format.AddProperty("item",X_C_OrderLine.COLUMNNAME_Discount, "1");
					format.AddProperty("item",X_C_OrderLine.COLUMNNAME_Discount1, "1");
					format.AddProperty("item",X_C_OrderLine.COLUMNNAME_Discount2, "1");
					format.AddProperty("item",X_C_OrderLine.COLUMNNAME_Discount3, "1");
					format.AddProperty("item",X_C_OrderLine.COLUMNNAME_Discount4, "1");
					format.AddProperty("item",X_C_OrderLine.COLUMNNAME_M_AttributeSetInstance_ID,"1");
					format.AddProperty("item",X_C_OrderLine.COLUMNNAME_IsBonus,"N");
					format.AddProperty("item",X_C_OrderLine.COLUMNNAME_C_Tax_ID,"1");
					format.AddProperty("item",X_C_OrderLine.COLUMNNAME_C_UOM_ID, "1");
					format.AddProperty("item",X_C_OrderLine.COLUMNNAME_C_CampaignBonus_ID,"1");
					format.AddProperty("item",X_C_OrderLine.COLUMNNAME_C_CampaignDiscount_ID,"1");
					format.AddProperty("item",X_C_OrderLine.COLUMNNAME_LineNetAmt, "1");
					format.AddProperty("item",X_M_Product.COLUMNNAME_ShortName,"1");
					format.AddProperty("item",X_C_OrderLine.COLUMNNAME_PriceEntered, "1");
					format.AddProperty("item",X_C_OrderLine.COLUMNNAME_C_OrderLine_ID, Util.getUUID());
					format.ValidateSection("item");				
					format.AddProperty("item",X_C_OrderLine.COLUMNNAME_M_Product_ID, "1");
					format.AddProperty("item",X_M_Product.COLUMNNAME_M_AttributeSet_ID, "1");
					format.AddProperty("item",X_C_OrderLine.COLUMNNAME_PriceActual, "1");
					format.AddProperty("item",X_C_OrderLine.COLUMNNAME_PriceList, "1");
					format.AddProperty("item",X_C_OrderLine.COLUMNNAME_PriceLimit, "1");
					format.AddProperty("item",X_C_OrderLine.COLUMNNAME_PriceEntered, "1");
					format.AddProperty("item",X_C_OrderLine.COLUMNNAME_QtyOrdered, "1");
					format.AddProperty("item",X_C_OrderLine.COLUMNNAME_QtyEntered, "1");
					format.AddProperty("item",X_C_OrderLine.COLUMNNAME_PriceBase, "1");
					format.AddProperty("item",X_C_OrderLine.COLUMNNAME_Discount, "1");
					format.AddProperty("item",X_C_OrderLine.COLUMNNAME_Discount1, "1");
					format.AddProperty("item",X_C_OrderLine.COLUMNNAME_Discount2, "1");
					format.AddProperty("item",X_C_OrderLine.COLUMNNAME_Discount3, "1");
					format.AddProperty("item",X_C_OrderLine.COLUMNNAME_Discount4, "1");
					format.AddProperty("item",X_C_OrderLine.COLUMNNAME_M_AttributeSetInstance_ID,"1");
					format.AddProperty("item",X_C_OrderLine.COLUMNNAME_IsBonus,"N");
					format.AddProperty("item",X_C_OrderLine.COLUMNNAME_C_Tax_ID,"1");
					format.AddProperty("item",X_C_OrderLine.COLUMNNAME_C_UOM_ID, "1");
					format.AddProperty("item",X_C_OrderLine.COLUMNNAME_C_CampaignBonus_ID,"1");
					format.AddProperty("item",X_C_OrderLine.COLUMNNAME_C_CampaignDiscount_ID,"1");
					format.AddProperty("item",X_C_OrderLine.COLUMNNAME_LineNetAmt, "1");
					format.AddProperty("item",X_M_Product.COLUMNNAME_ShortName,"1");
					format.AddProperty("item",X_C_OrderLine.COLUMNNAME_PriceEntered, "1");
					format.AddProperty("item",X_C_OrderLine.COLUMNNAME_C_OrderLine_ID, Util.getUUID());
					format.ValidateSection("item");									
					MCurrency currency = MCurrency.get(Env.getCtx(), getOrder().getC_Currency_ID());
					format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_C_Order_ID, "1");
					format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_M_Warehouse_ID,"1");
					format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_C_BPartner_ID,"1");
					format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_IsSOTrx,"Y");
					format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_IsTaxIncluded,"Y");
					format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_C_BPartner_Location_ID,"1");
					format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_M_PriceList_ID,"1");
					format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_C_DocTypeTarget_ID,"0");
					format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_SalesRep_ID,"1");
					format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_Bill_BPartner_ID,"1");
					format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_Bill_Location_ID,"1");
					format.AddProperty(Constants.HEADER, X_A_Machine.COLUMNNAME_A_Machine_ID,"1");
					format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_PrinterSerial,"1");
					format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_AD_User_ID,"1");
					format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_Bill_User_ID,"1");
					format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_POReference,"1");
					format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_Description,"1");
					format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_IsDiscountPrinted,"Y");
					format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_InvoiceRule,"N");
					format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_DeliveryRule,"N");
					format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_PaymentRule,"N");
					format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_C_PaymentTerm_ID,"N");
					format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_FreightCostRule,"N");
					format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_DeliveryViaRule,"N");
					format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_PriorityRule,"N");
					format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_DifferenceAmt,"0");
					format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_DebtAmt,"1");
					format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_C_BPartner_Points_ID,"0");
					format.AddProperty(Constants.HEADER, X_C_POS.COLUMNNAME_C_POS_ID,"0");
					format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_C_Currency_ID, currency.getIdentifier());
					format.AddProperty(Constants.HEADER, X_C_Order.COLUMNNAME_DateOrdered,"2019/01/01");
					format.ValidateSection(Constants.HEADER);
					format.ValidateMessage();
					MPrinterDocumentFormat pdf = new MPrinterDocumentFormat(Env.getCtx(), 20, null);
					PrintDocument pd = MVELParseFormat.getInstance().parse(pdf);
					//pd.setMessage(format);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			private MOrder getOrder() {
				MOrder order = new MOrder(Env.getCtx(), 0, null);
				order.setC_Currency_ID(308);
				return order;
			}
		}); 		
	}

}
