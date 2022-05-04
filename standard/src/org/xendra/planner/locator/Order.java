package org.xendra.planner.locator;

import org.compiere.model.MLocator;
import org.optaplanner.core.api.domain.entity.PlanningEntity;
import org.optaplanner.core.api.domain.variable.PlanningVariable;
import org.xendra.planner.locator.solver.LocatorStrengthComparator;

@PlanningEntity(difficultyComparatorClass = LocatorStrengthComparator.class)
public class Order {
	private MLocator locator;
	@PlanningVariable(valueRangeProviderRefs = {"LocatorRange"}, strengthComparatorClass = LocatorStrengthComparator.class)
	public MLocator getLocator() {
		return locator;
	}
	public void setLocator(MLocator loc) {
		this.locator = loc;
	}
}
