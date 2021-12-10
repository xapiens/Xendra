package org.xendra.controls;

import java.util.List;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Column;
import org.compiere.util.Env;
import org.jdom.Element;
import org.xendra.model.AbstractFolder;

public class TableFolder extends AbstractFolder {
	public TableFolder(Element item) {
		super(item);
		this.setName(item.getAttributeValue("name"));
	}

	public void loadChildren() {
		removeAllChildren();			
		List<X_AD_Column> columns = new Query(Env.getCtx(), X_AD_Column.Table_Name, "AD_Table_ID = ? AND (COALESCE(isinternal,'N') = 'N' OR iskey = 'Y')", null)
			.setParameters(Integer.valueOf(getNode().getAttributeValue("uid"))).setOrderBy("columnname").list();
		for (X_AD_Column column:columns) {
			String type = "column";
			Element item = new Element(type);
			item.setAttribute("uid", String.valueOf(column.getAD_Column_ID()));
			item.setAttribute("name", column.getColumnName());
			ColumnFolder col = new ColumnFolder(item);
			add(col);
		}
	}
}
