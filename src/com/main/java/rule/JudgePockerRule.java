package com.main.java.rule;

import java.util.ArrayList;
import java.util.List;

import com.main.java.entity.Pocker;
import com.main.java.util.PockersAttribute;

/**
 * JudgePockerRule.java
 * 2016年11月28日下午8:10:22
 * @author cbb
 * TODO 
 */
public class JudgePockerRule {
	private static List<PockerRule> pockerRules = new ArrayList<PockerRule>();
	static
	{
		pockerRules.add(new LeopardRule());
		pockerRules.add(new StraightFlushRule());
		pockerRules.add(new FlushRule());
		pockerRules.add(new StraightRule());
		pockerRules.add(new PairRule());
		pockerRules.add(new OtherRule());
	}
	private static JudgePockerRule instance = new JudgePockerRule();
	private JudgePockerRule(){
	}
	public static JudgePockerRule getInstance(){
		return instance;
	}
	
	public PockersAttribute getAttribute(List<Pocker> pockers){
		for(PockerRule rule : pockerRules){
			if(rule.judgementAttribute(pockers)){
				return rule.getAttribute();
			}
		}
		return null;
	}
}
