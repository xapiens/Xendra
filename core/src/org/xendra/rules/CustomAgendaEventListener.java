package org.xendra.rules;

import org.compiere.util.CLogger;
import org.kie.api.definition.rule.Rule;
import org.kie.api.event.rule.AfterMatchFiredEvent;
import org.kie.api.event.rule.AgendaEventListener;
import org.kie.api.event.rule.AgendaGroupPoppedEvent;
import org.kie.api.event.rule.AgendaGroupPushedEvent;
import org.kie.api.event.rule.BeforeMatchFiredEvent;
import org.kie.api.event.rule.MatchCancelledEvent;
import org.kie.api.event.rule.MatchCreatedEvent;
import org.kie.api.event.rule.RuleFlowGroupActivatedEvent;
import org.kie.api.event.rule.RuleFlowGroupDeactivatedEvent;
import org.kie.api.runtime.rule.FactHandle;


public class CustomAgendaEventListener implements AgendaEventListener {

	protected transient CLogger	log = CLogger.getCLogger (getClass());

	@Override
	public void afterRuleFlowGroupActivated(RuleFlowGroupActivatedEvent e) {	
		
	}
	@Override
	public void afterRuleFlowGroupDeactivated(RuleFlowGroupDeactivatedEvent arg0) {
		
	}
	@Override
	public void beforeRuleFlowGroupActivated(RuleFlowGroupActivatedEvent arg0) {
		
	}
	@Override
	public void beforeRuleFlowGroupDeactivated(RuleFlowGroupDeactivatedEvent arg0) {
		
	}
	@Override
	public void agendaGroupPopped(AgendaGroupPoppedEvent e) {
		log.warning("agendaGroup Popped " + e.getAgendaGroup().getName());
	}
	@Override
	public void agendaGroupPushed(AgendaGroupPushedEvent e) {
		log.warning("agendaGroup Pushed " + e.getAgendaGroup().getName());
	}
	@Override
	public void beforeMatchFired(BeforeMatchFiredEvent e) {
		//log.warning("facts:");
		//for (FactHandle f:e.getKieRuntime().getFactHandles()) {
		//	log.warning(f.toString());
		//}
		//Rule rule = e.getMatch().getRule();
		//log.warning("before MatchFired "+rule.getName());				
	}
	@Override
	public void matchCancelled(MatchCancelledEvent e) {
		Rule rule = e.getMatch().getRule();
		log.warning("match Cancelled "+rule.getName());		
	}
	@Override
	public void matchCreated(MatchCreatedEvent e) {
		//Rule rule = e.getMatch().getRule();
		//log.warning("matchCreated "+rule.getName());		
	}
	@Override
	public void afterMatchFired(AfterMatchFiredEvent e) {
		Rule rule = e.getMatch().getRule();
		log.warning(rule.getName() + " facts:");
		for (FactHandle f:e.getKieRuntime().getFactHandles()) {
			log.warning(f.toString());
		}		
		log.warning("after Matchfired "+rule.getName());		
	}	
}
