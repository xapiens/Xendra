package org.xendra.planner.pickup.solver;

import java.util.List;
import org.compiere.model.MOrderLine;
import org.compiere.model.MProduct;
import org.compiere.util.Env;
import org.optaplanner.core.api.score.buildin.hardsoft.HardSoftScore;
import org.optaplanner.core.impl.score.director.easy.EasyScoreCalculator;
import org.xendra.planner.pickup.Picker;
import org.xendra.planner.pickup.PickupDesignation;
import org.xendra.planner.pickup.PickupList;
public class PickupEasyScoreCalculator implements EasyScoreCalculator<PickupDesignation> {

    /**
     * A very simple implementation. The double loop can easily be removed by using Maps as shown in
     * {@link CloudBalancingMapBasedEasyScoreCalculator#calculateScore(CloudBalance)}.
     */
    public HardSoftScore calculateScore(PickupDesignation pickup) {
        int hardScore = 0;
        int softScore = 0;
        for (Picker picker: pickup.getPickerList())
        {
        	List<Integer> pblist = picker.getProductbrandList();
        	for (PickupList pickuplist : pickup.getPickupList())
        	{
        		if (picker.equals(pickuplist.getPicker())) {
        			MOrderLine ol = pickuplist.getOrderLine();
        			for (Integer pb:pblist)
        			{
        				MProduct product = MProduct.get(Env.getCtx(), ol.getM_Product_ID(), null);
        				if (product.getM_Product_Brand_ID() == pb)
        					hardScore ++;
        				else
        					hardScore --;
        			}
        		}
        	}
        	
        }
        return HardSoftScore.valueOf(hardScore, softScore);
    }

}