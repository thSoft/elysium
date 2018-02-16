package org.elysium.ui.compiler;

import org.eclipse.core.runtime.jobs.ISchedulingRule;

/**
 * Rule allows only one job for each queue number at a time.
 * This allows to restrict the number of parallel executions to be limited 
 * by creating an according number of queue rules.
 */
public class NumberedQueueSchedulingRule implements ISchedulingRule {
		private long queuenumer;

	public NumberedQueueSchedulingRule(long queuenumer) {
		this.queuenumer = queuenumer;
	}

	public boolean contains(ISchedulingRule rule) {
		return rule == this;
	}

	public boolean isConflicting(ISchedulingRule rule) {
		if (rule instanceof NumberedQueueSchedulingRule) {
			NumberedQueueSchedulingRule otherRule = (NumberedQueueSchedulingRule) rule;
			return otherRule.queuenumer == queuenumer;
		}
		return false;
	}

}