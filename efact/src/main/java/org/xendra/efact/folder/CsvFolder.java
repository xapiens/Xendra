package org.xendra.efact.folder;

import java.util.Iterator;

import org.columba.api.command.IWorkerStatusController;
import org.jdom.Element;
import org.xendra.efact.model.Csv;

public class CsvFolder extends EFactTreeNode {
	private Csv csv;
	public CsvFolder(Element item, Csv csv) {
		super(item);
		this.csv = csv;		
		setName(item.getAttributeValue("name"));		
		loadChildren();				
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
	public String getTreePath() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void createChildren(IWorkerStatusController worker) {
		// TODO Auto-generated method stub		
	}
}
