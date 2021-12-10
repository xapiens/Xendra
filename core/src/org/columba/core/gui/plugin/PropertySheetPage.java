package org.columba.core.gui.plugin;

import java.beans.BeanInfo;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.HashMap;
import java.util.Iterator;

import javax.swing.JPanel;

import org.compiere.model.PO;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Store;
import org.compiere.util.Env;

import net.miginfocom.swing.MigLayout;

import com.l2fprod.common.model.DefaultBeanInfoResolver;
import com.l2fprod.common.propertysheet.Property;
import com.l2fprod.common.propertysheet.PropertySheetPanel;

@SuppressWarnings("serial")
public class PropertySheetPage extends JPanel implements PropertyChangeListener {
	private PropertySheetPanel sheet;
	private HashMap props;
	private X_AD_Store store;
	public PropertySheetPage() {		
		store = new Query(Env.getCtx(), X_AD_Store.Table_Name, "AD_Client_ID = ?", null)
		.setParameters(Env.getAD_Client_ID(Env.getCtx()))
		.first();
		if (store != null) {
			props = store.getProperties();		
			setLayout(new MigLayout("fill"));
			sheet = new PropertySheetPanel();
			loaddata();
			add(sheet,"growx");
			sheet.addPropertySheetChangeListener(this);
		}
	}
	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		Property prop = (Property) evt.getSource();
		String pname = prop.getName().toUpperCase();
		String value = (String) prop.getValue();
		props.put(pname, value);
		store.setProperties(props);
		store.save();
		//StoreBean store = new StoreBean();
		//sheet.writeToObject(store);			
		//Iterator it = sheet.propertyIterator();
		//while (it.hasNext()) {
		//	Property p = (Property) it.next();
		//}		
	}
	public PropertySheetPanel getSheet() {
		return sheet;
	}
	//public void setData(StoreBean data) {
	//	sheet.readFromObject(data);		
	//}
	public void loaddata() {
		X_AD_Store store = new Query(Env.getCtx(), X_AD_Store.Table_Name, "AD_Client_ID = ?", null)
		.setParameters(Env.getAD_Client_ID(Env.getCtx()))
		.first();
		HashMap props = store.getProperties();
		StoreBean data = new StoreBean();
		DefaultBeanInfoResolver resolver = new DefaultBeanInfoResolver();
		BeanInfo beanInfo = resolver.getBeanInfo(data);					
		sheet.setProperties(beanInfo.getPropertyDescriptors());
		String alias = (String) props.get("ALIAS");
		if (alias == null)
			alias = "";		
		data.setAlias(alias);
		String pkcs12 = (String) props.get("PKCS12");
		if (pkcs12 == null)
			pkcs12 = "";
		data.setPkcs12(pkcs12);
		String certificate = (String) props.get("CERTIFICATE");
		if (certificate == null)
			certificate = "";
		data.setCertificate(certificate);
		String publicurl = (String) props.get("PUBLICURL");
		if (publicurl == null)
			publicurl = "";
		data.setPublicurl(publicurl);
		String privateurl = (String) props.get("PRIVATEURL");
		if (privateurl == null)
			privateurl = "";
		data.setPrivateurl(privateurl);
		sheet.readFromObject(data);
	}

}
