package org.xendra.rules;

import org.compiere.util.CLogger;
import org.kie.api.event.rule.ObjectDeletedEvent;
import org.kie.api.event.rule.RuleRuntimeEventListener;

public class CustomWorkingMemoryEventListener implements RuleRuntimeEventListener {
	protected transient CLogger	log = CLogger.getCLogger (getClass());
	@Override
	public void objectDeleted(ObjectDeletedEvent e) {
		log.warning("Object deleted:" + e.getFactHandle() + " Knowledge Runtime " + e.getKieRuntime());				
	}
	@Override
	public void objectInserted(org.kie.api.event.rule.ObjectInsertedEvent e) {
		log.warning("Object inserted:" + e.getFactHandle() + " Knowledge Runtime " + e.getKieRuntime());		
	}
	@Override
	public void objectUpdated(org.kie.api.event.rule.ObjectUpdatedEvent e) {
		log.warning("Object updated:" + e.getFactHandle() + " Knowledge Runtime " + e.getKieRuntime());				
	}
}