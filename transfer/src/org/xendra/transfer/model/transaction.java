package org.xendra.transfer.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.*;
import org.compiere.model.MMovement;
import org.compiere.model.MMovementLine;
import org.compiere.util.Env;
import org.xendra.transfer.Row;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "transaction")	
public class transaction {
	@XmlElement(name = "Movement", required = true)
    protected MMovement movement;

	@XmlElement (name = "MovementLine", required = true)
    private MMovementLine[] lines;	
    public void setMovementLine(List<Row> rows) {
    	List<MMovementLine> mlines = new ArrayList<MMovementLine>();
    	for (Row row:rows)
    	{
    		MMovementLine ml = new MMovementLine(Env.getCtx(), 0, null);
    		ml.setM_Product_ID(row.getM_Product_ID());    		
    		ml.setM_Locator_ID(row.getM_Locator_ID());
    		ml.setM_LocatorTo_ID(row.getM_LocatorTo_ID());
    		ml.setQtyEntered(row.getQtyEntered());
    		mlines.add(ml);    		
    	}
    	lines = new MMovementLine[mlines.size()];
		mlines.toArray(lines);    	
    }
	public void setMovemen(MMovement movement) {
		this.movement = movement;				
	}
}


//MMovement mm = getMovement();