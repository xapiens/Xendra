package org.xendra.pos.wizard;
import java.awt.Dimension;
import java.lang.reflect.Method;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import org.compiere.model.Machine;
import org.compiere.model.persistence.X_C_POS;
import org.compiere.util.Env;
import org.xendra.pos.util.ResourceLoader;
import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;
import net.miginfocom.swing.MigLayout;

public class PrintFormatCollectionStep extends AbstractStep {
	protected DataModel data;
	protected PrintFormatPanel pfp;
	public PrintFormatCollectionStep(DataModel data) {
    	super(ResourceLoader.getString("dialog", "machinewizard", "collection"),
    			ResourceLoader.getString("dialog", "machinewizard",   "collection_description"));		
		this.data = data;
		pfp = new PrintFormatPanel();
		Machine machine = Env.getMachine();			
		pfp.setC_POS_ID(machine.getIntProperty(X_C_POS.COLUMNNAME_C_POS_ID));
		pfp.setFormatType(MachineCreator.Collection);
		pfp.start();
		Method methodformat = null;        
		Method methodprinter = null;
		try {
			methodformat = pfp.getClass().getMethod("getFormat", null);
			methodprinter = pfp.getClass().getMethod("getPrinter", null);
		} catch (NoSuchMethodException nsme) {
		}			
		data.registerDataLookup(MachineCreator.Collection,new DefaultDataLookup(pfp, methodformat, null));
		data.registerDataLookup(String.format("%s_Printer",MachineCreator.Collection), new DefaultDataLookup(pfp, methodprinter, null));
	}
	protected JComponent createComponent() {
		JComponent component = new JPanel(new MigLayout("fill"));
		component.add(pfp, "push");
		return component;
	}
    public void prepareRendering() {
    }
}