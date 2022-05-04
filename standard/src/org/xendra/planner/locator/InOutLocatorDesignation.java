package org.xendra.planner.locator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.compiere.model.MLocator;
import org.compiere.model.MOrderLine;
import org.optaplanner.core.api.domain.solution.PlanningEntityCollectionProperty;
import org.optaplanner.core.api.domain.solution.PlanningSolution;
import org.optaplanner.core.api.domain.solution.Solution;
import org.optaplanner.core.api.domain.valuerange.ValueRangeProvider;
import org.optaplanner.core.api.score.buildin.hardsoft.HardSoftScore;
import org.optaplanner.core.impl.score.buildin.hardsoft.HardSoftScoreDefinition;
import org.optaplanner.persistence.xstream.impl.score.XStreamScoreConverter;

import com.thoughtworks.xstream.annotations.XStreamConverter;

@PlanningSolution
public class InOutLocatorDesignation implements Solution<HardSoftScore> {
	public List<MLocator> LocatorList = new ArrayList<MLocator>();
	private List<MOrderLine> orderlines;
	
	@XStreamConverter(value = XStreamScoreConverter.class, types = {HardSoftScoreDefinition.class})
	private HardSoftScore score;
	
	@PlanningEntityCollectionProperty	
	public List<MLocator> getLocatorList() {
		return LocatorList;
	}	
	@Override
	public Collection<? extends Object> getProblemFacts() {
		List<Object> facts = new ArrayList<Object>();
		facts.addAll(LocatorList);
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
	public void addLocators(List<MLocator> locators) {
		LocatorList = locators;		
	}
	public void addOrderLines(List<MOrderLine> lines) {
		orderlines = lines;
	}	
	@ValueRangeProvider(id = "LocatorRange")
	public List<MOrderLine>  getOrderLines() {
		return orderlines;
	}	
}