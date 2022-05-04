package org.xendra.planner.locator.solver;

import java.math.BigDecimal;

import org.compiere.model.MLocator;
import org.optaplanner.core.api.score.buildin.hardsoft.HardSoftScore;
import org.optaplanner.core.impl.score.director.easy.EasyScoreCalculator;
import org.xendra.planner.locator.InOutLocatorDesignation;


public class LocatorEasyScoreCalculator implements EasyScoreCalculator<InOutLocatorDesignation> {
	
    /**
     * A very simple implementation. The double loop can easily be removed by using Maps as shown in
     * {@link CloudBalancingMapBasedEasyScoreCalculator#calculateScore(CloudBalance)}.
     */
	public HardSoftScore calculateScore(InOutLocatorDesignation locators) {
        int hardScore = 0;
        int softScore = 0;        
        int LocatorMoreAvailable = 0;
        BigDecimal LocatorAvailableSpace = BigDecimal.ZERO;
        for (MLocator locator: locators.getLocators()) {
        	if (locator.getAvailable().compareTo(LocatorAvailableSpace) > 0) {
        		hardScore ++;
        	} else {
        		hardScore --;        	
        	}
        }
        return HardSoftScore.valueOf(hardScore, softScore);
	}
}
