package org.xendra.planner.pickup;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.optaplanner.core.api.domain.entity.PlanningEntity;
import org.optaplanner.core.api.domain.solution.PlanningEntityCollectionProperty;
import org.optaplanner.core.api.domain.solution.PlanningSolution;
import org.optaplanner.core.api.domain.solution.Solution;
import org.optaplanner.core.api.domain.valuerange.ValueRangeProvider;
import org.optaplanner.core.api.domain.variable.PlanningVariable;
import org.optaplanner.core.api.score.buildin.hardsoft.HardSoftScore;
import org.optaplanner.core.impl.score.buildin.hardsoft.HardSoftScoreDefinition;
import org.optaplanner.persistence.xstream.impl.score.XStreamScoreConverter;

import com.thoughtworks.xstream.annotations.XStreamConverter;


@PlanningSolution
public class PickupDesignation implements Solution<HardSoftScore> {
	private List<Picker> pickerList = new ArrayList<Picker>();	
	private List<PickupList> pickupList;

	@XStreamConverter(value = XStreamScoreConverter.class, types = {HardSoftScoreDefinition.class})
	private HardSoftScore score;

	@PlanningEntityCollectionProperty	
	public List<PickupList> getPickupList() {
		return pickupList;
	}
	public void setPickupList(List<PickupList> pickupList) {
		this.pickupList = pickupList;
	}
	public void addPicker(Picker picker) {
		pickerList.add(picker);
	}		
	@ValueRangeProvider(id = "PickerRange")
	public List<Picker> getPickerList() {
		return pickerList;
	}
	
	@Override
	public Collection<? extends Object> getProblemFacts() {
		List<Object> facts = new ArrayList<Object>();
		facts.addAll(pickerList);
		facts.addAll(pickupList);				
		return facts;
	}
	@Override
	public HardSoftScore getScore() {		
		return score;
	}
	@Override
	public void setScore(HardSoftScore score) {
		this.score = score;		
	}
}
