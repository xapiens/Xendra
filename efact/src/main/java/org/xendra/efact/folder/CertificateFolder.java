package org.xendra.efact.folder;

import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import org.columba.api.command.IWorkerStatusController;
import org.compiere.model.MBPartner;
import org.compiere.model.persistence.X_C_BPartner_Certificate;
import org.compiere.util.Env;
import org.jdom.Element;

public class CertificateFolder extends EFactTreeNode {
	protected static ImageIcon localIcon = null;
	protected Integer id;
	protected X_C_BPartner_Certificate certificate;
	public CertificateFolder(Element item) {
		super(item);		
		setName(item.getAttributeValue("name"));		
	}
	private void setID(String id) {
		this.id = Integer.valueOf(id);
	}
	private Integer getID() {
		return this.id;
	}	
    public ImageIcon getIcon() {
    	if (localIcon == null)
    	{
    		try {
    			localIcon  = new ImageIcon(ImageIO.read(new File(Env.getResource("org.xendra.efact", "form.png"))));
    		}
    		catch (Exception e) {}
    	}
        return localIcon;
    }
	@Override
	public String getTreePath() {
		// TODO Auto-generated method stub
		return null;
	}    
	public void loadChildren() {
		removeAllChildren();
		
	}
	@Override
	public boolean tryToGetLock(Object locker) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void releaseLock(Object locker) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void createChildren(IWorkerStatusController worker) {
		// TODO Auto-generated method stub
		
	}
}
