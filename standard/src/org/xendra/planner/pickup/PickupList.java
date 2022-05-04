package org.xendra.planner.pickup;

import org.compiere.model.MOrderLine;
import org.optaplanner.core.api.domain.entity.PlanningEntity;
import org.optaplanner.core.api.domain.variable.PlanningVariable;
import org.xendra.planner.pickup.solver.PickupStrengthComparator;

@PlanningEntity(difficultyComparatorClass = PickupStrengthComparator.class)
public class PickupList  {
	
	private Picker picker;
	private MOrderLine orderline;
	public PickupList() {
		
	}
	public PickupList(MOrderLine line) {
		orderline = line;
	}
	@PlanningVariable(valueRangeProviderRefs = {"PickerRange"}, strengthComparatorClass = PickupStrengthComparator.class)
	public Picker getPicker() {
		return picker;
	}
	public void setPicker(Picker picker) {
		this.picker = picker;
	}	
	public MOrderLine getOrderLine() {
		return orderline;
	}
	public void setOrderLine(MOrderLine orderLine) {
		this.orderline = orderLine;
	}
	

}
