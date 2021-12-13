package org.xendra.pop.wizard;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.columba.core.gui.base.LabelWithMnemonic;
import org.columba.core.gui.base.MultiLineLabel;
import org.columba.core.gui.base.WizardTextField;
import org.compiere.grid.ed.VLookup;
import org.compiere.model.MInvoice;
import org.compiere.model.MLookup;
import org.compiere.model.MLookupFactory;
import org.compiere.model.persistence.X_AD_User;
import org.compiere.model.persistence.X_C_ConversionType;
import org.compiere.model.persistence.X_C_Currency;
import org.compiere.model.persistence.X_C_Invoice;
import org.compiere.model.persistence.X_C_POP;
import org.compiere.model.persistence.X_M_PriceList;
import org.compiere.util.DisplayType;
import org.compiere.util.Env;
import org.compiere.util.Util;
import org.xendra.pop.util.ResourceLoader;

import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;
import net.javaprog.ui.wizard.Step;
import net.javaprog.ui.wizard.StepModelCustomizer;

public class ProfileStep extends AbstractStep {
	protected DataModel data;
	protected JTextField Name;
	protected JTextField Description;
	protected VLookup pickUser;
	protected VLookup pickCurrency;
	protected VLookup pickPriceList;
	protected VLookup pickConversionType;
	protected VLookup pickPriceSales;
	//protected VLookup pickWarehouse;
	private int m_WindowNo = 0;
	public ProfileStep(DataModel data) {
        super(ResourceLoader.getString("dialog", "machinewizard", "identity"),
                ResourceLoader.getString("dialog", "machinewizard",   "identity_description"));
            this.data = data;
            setCanGoNext(true);
	}

	@Override
	public void prepareRendering() {
		
	}

	@Override
	protected JComponent createComponent() {
        JComponent component = new JPanel();
        component.setLayout(new BoxLayout(component, BoxLayout.Y_AXIS));
        component.add(new MultiLineLabel(ResourceLoader.getString("dialog", "machinewizard", "identity_text")));
        component.add(Box.createVerticalStrut(40));

        WizardTextField middlePanel = new WizardTextField();
        // Name
        LabelWithMnemonic nameLabel = new LabelWithMnemonic(ResourceLoader.getString("dialog", "machinewizard", "name"));
        Name = new JTextField(20);
        Method methodname = null;
        try {
        	methodname = Name.getClass().getMethod("getText", null);
        } catch (NoSuchMethodException nsme) {        	
        }
        data.registerDataLookup(X_C_POP.COLUMNNAME_Name, new DefaultDataLookup(Name, methodname, null));
        nameLabel.setLabelFor(Name);
        middlePanel.addLabel(nameLabel);
        middlePanel.addTextField(Name);
        middlePanel.addExample(new JLabel(ResourceLoader.getString("dialog", "machinewizard", "profilename")));
        // Description
        LabelWithMnemonic descriptionLabel = new LabelWithMnemonic(ResourceLoader.getString("dialog", "machinewizard", "description"));
        Description = new JTextField(20);
        Method methoddescription = null;
        try {
        	methoddescription = Description.getClass().getMethod("getText", null);        	
        } catch (NoSuchMethodException nsme) {        	
        }
        data.registerDataLookup(X_C_POP.COLUMNNAME_Description, new DefaultDataLookup(Description, methoddescription, null));
        descriptionLabel.setLabelFor(Description);
        middlePanel.addLabel(descriptionLabel);
        middlePanel.addTextField(Description);
        middlePanel.addExample(new JLabel(ResourceLoader.getString("dialog", "machinewizard", "profiledescription")));
        // User
        LabelWithMnemonic userLabel = new LabelWithMnemonic(ResourceLoader.getString("dialog", "machinewizard", "user"));
		pickUser = VLookup.createUser(m_WindowNo);
		Method methoduser = null;
        try {
            methoduser = pickUser.getClass().getMethod("getValue", null);
        } catch (NoSuchMethodException nsme) {
        }        
        data.registerDataLookup(X_AD_User.COLUMNNAME_AD_User_ID, new DefaultDataLookup(pickUser, methoduser, null));
        userLabel.setLabelFor(pickUser);
        middlePanel.addLabel(userLabel);
        middlePanel.addTextField(pickUser);
        middlePanel.addEmptyExample();                
        // Currency
        LabelWithMnemonic currencyLabel = new LabelWithMnemonic(ResourceLoader.getString("dialog", "machinewizard", "currency"));
		int AD_Column_ID = Util.getColumnID(X_C_POP.Table_ID,X_C_POP.COLUMNNAME_C_Currency_ID);
		MLookup lookupCurrExchange = MLookupFactory.get (Env.getCtx(), m_WindowNo , 0, AD_Column_ID, DisplayType.TableDir);				
		pickCurrency = new VLookup(X_C_Currency.COLUMNNAME_C_Currency_ID, true, false, true, lookupCurrExchange);
		Method methodcurrency = null;
        try {
        	methodcurrency = pickCurrency.getClass().getMethod("getValue", null);
        } catch (NoSuchMethodException nsme) {
        }        
        data.registerDataLookup(X_C_Currency.COLUMNNAME_C_Currency_ID,new DefaultDataLookup(pickCurrency, methodcurrency, null));
        currencyLabel.setLabelFor(pickCurrency);
        middlePanel.addLabel(currencyLabel);
        middlePanel.addTextField(pickCurrency);
        middlePanel.addExample(new JLabel(ResourceLoader.getString("dialog", "machinewizard", "currencyex")));    
        //
        // PriceList
        LabelWithMnemonic SalesPriceLisLabel = new LabelWithMnemonic(ResourceLoader.getString("dialog", "machinewizard", "salespricelist"));
		AD_Column_ID = Util.getColumnID(X_C_POP.Table_ID,X_C_POP.COLUMNNAME_M_PriceSalesList_ID);
		MLookup lookupSalesPriceList = MLookupFactory.get (Env.getCtx(), m_WindowNo , 0, AD_Column_ID, DisplayType.Table);				
		pickPriceSales = new VLookup(X_C_POP.COLUMNNAME_M_PriceSalesList_ID, true, false, true, lookupSalesPriceList);
		Method methodsalespricelist = null;
        try {
        	methodsalespricelist = pickPriceSales.getClass().getMethod("getValue", null);
        } catch (NoSuchMethodException nsme) {
        }        
        data.registerDataLookup(X_C_POP.COLUMNNAME_M_PriceSalesList_ID,new DefaultDataLookup(pickPriceSales, methodsalespricelist, null));
        SalesPriceLisLabel.setLabelFor(pickPriceSales);
        middlePanel.addLabel(SalesPriceLisLabel);
        middlePanel.addTextField(pickPriceSales);    
        middlePanel.addEmptyExample(); 
        // 
        LabelWithMnemonic PriceListConversionType = new LabelWithMnemonic(ResourceLoader.getString("dialog", "machinewizard", "conversiontype"));
		AD_Column_ID = Util.getColumnID(X_C_POP.Table_ID,X_C_POP.COLUMNNAME_C_ConversionType_ID);
		MLookup lookupConversionType = MLookupFactory.get (Env.getCtx(), m_WindowNo , 0, AD_Column_ID, DisplayType.TableDir);				
		pickConversionType = new VLookup(X_C_ConversionType.COLUMNNAME_C_ConversionType_ID, true, false, true, lookupConversionType);
		Method methodconversiontype = null;
        try {
        	methodconversiontype = pickConversionType.getClass().getMethod("getValue", null);
        } catch (NoSuchMethodException nsme) {
        }        
        data.registerDataLookup(X_C_ConversionType.COLUMNNAME_C_ConversionType_ID,new DefaultDataLookup(pickConversionType, methodconversiontype, null));
        PriceListConversionType.setLabelFor(pickConversionType);
        middlePanel.addLabel(PriceListConversionType);
        middlePanel.addTextField(pickConversionType);    
        middlePanel.addEmptyExample();        
        // PriceList
        LabelWithMnemonic PriceListLabel = new LabelWithMnemonic(ResourceLoader.getString("dialog", "machinewizard", "pricelist"));
		AD_Column_ID = Util.getColumnID(X_C_POP.Table_ID,X_C_POP.COLUMNNAME_M_PriceSalesList_ID);
		MLookup lookupPriceList = MLookupFactory.get (Env.getCtx(), m_WindowNo , 0, AD_Column_ID, DisplayType.Table);				
		pickPriceList = new VLookup(X_M_PriceList.COLUMNNAME_M_PriceList_ID, true, false, true, lookupPriceList);
		Method methodpricelist = null;
        try {
            methodpricelist = pickPriceList.getClass().getMethod("getValue", null);
        } catch (NoSuchMethodException nsme) {
        }        
        data.registerDataLookup(X_M_PriceList.COLUMNNAME_M_PriceList_ID,new DefaultDataLookup(pickPriceList, methodpricelist, null));
        PriceListLabel.setLabelFor(pickPriceList);
        middlePanel.addLabel(PriceListLabel);
        middlePanel.addTextField(pickPriceList);    
        middlePanel.addEmptyExample(); 
        component.add(middlePanel);        
        return component;
	}
	
	public Step[] getPendingSteps() {					
		List<Step> steps = new ArrayList<Step>();
		steps.add(new RuleStep(data));
		steps.add(new WarehouseStep(data));
		steps.add(new OptionsStep(data));
		steps.add(new DocTypeStep(data));
		steps.add(new ColumnsPurchaseStep(data));
		//steps.add(new ColumnsBothStep(data));
		steps.add(new ColumnsUpdateStep(data));
		steps.add(new FinishStep());
		Step[] list = new Step[steps.size()];
		steps.toArray(list);
		return list;
	}	
}
