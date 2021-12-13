package org.xendra.pos.wizard;

import java.lang.reflect.Method;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.ListModel;

import org.columba.core.gui.base.LabelWithMnemonic;
import org.compiere.model.Machine;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_C_DocType;
import org.compiere.model.persistence.X_C_POS;
import org.compiere.util.Env;
import org.xendra.pos.util.ResourceLoader;
import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;
import net.miginfocom.swing.MigLayout;

public class DocTypePrintFormatStep extends AbstractStep {
	
	protected DataModel data;
	private DocTypePrintFormatPanel m_doctypelistpanel = new DocTypePrintFormatPanel();
	private Method method;
	
	public DocTypePrintFormatStep(DataModel data) {
    	super(ResourceLoader.getString("dialog", "machinewizard", "doctypeprintformat"),
    			ResourceLoader.getString("dialog", "machinewizard",   "doctypeprintformat_description"));
    	this.data = data;
    	setCanGoNext(true);
	}
	@Override
	protected JComponent createComponent() {
		JComponent comp = new JPanel(new MigLayout("fill"));
		ListModel pdtmodel = (ListModel) data.getData(X_C_DocType.COLUMNNAME_C_DocType_ID);
		Machine machine = Env.getMachine();
		Integer C_POS_ID = machine.getIntProperty(X_C_POS.COLUMNNAME_C_POS_ID);
		if (C_POS_ID > 0) {
			X_C_POS pos = new Query(Env.getCtx(), X_C_POS.Table_Name, "C_POS_ID = ?", null)
				.setParameters(C_POS_ID).first();
			if (pos == null) {
				C_POS_ID = 0;
			}
		}		
		m_doctypelistpanel.set(pdtmodel, C_POS_ID);
		m_doctypelistpanel.invalidate();		
		comp.add(new LabelWithMnemonic(ResourceLoader.getString("dialog", "machinewizard", "doctypeprintformat_description")),"wrap");
		comp.add(m_doctypelistpanel);		
		try {			
			method = m_doctypelistpanel.getClass().getMethod("getModel", null);
		} catch (NoSuchMethodException nsme) {
		}		
		data.registerDataLookup("DocTypePrintFormat",new DefaultDataLookup(m_doctypelistpanel, method, null));		
		return comp;
	}	
		
	@Override
	public void prepareRendering() {
		Machine machine = Env.getMachine();
		Integer C_POS_ID = machine.getIntProperty(X_C_POS.COLUMNNAME_C_POS_ID);
		if (C_POS_ID > 0) {
			X_C_POS pos = new Query(Env.getCtx(), X_C_POS.Table_Name, "C_POS_ID = ?", null)
				.setParameters(C_POS_ID).first();
			if (pos == null) {
				C_POS_ID = 0;
			}
		}
		ListModel pdtmodel = (ListModel) data.getData(X_C_DocType.COLUMNNAME_C_DocType_ID);
		m_doctypelistpanel.set(pdtmodel, C_POS_ID);		
	}
}
