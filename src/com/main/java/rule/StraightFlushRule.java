package com.main.java.rule;

import java.util.List;

import com.main.java.entity.Pocker;
import com.main.java.util.PockersAttribute;

/**
 * StraightFlushRule.java
 * 2016年11月28日下午7:47:30
 * @author cbb
 * TODO 同花顺
 */
public class StraightFlushRule implements PockerRule{

	@Override
	public PockersAttribute getAttribute() {
		return PockersAttribute.STRAIGHTFLUSH;
	}
	
	@Override
	public boolean judgementAttribute(List<Pocker> pockers) {
		StraightRule straightRule = new StraightRule();
		FlushRule flushRule = new FlushRule();
		if(straightRule.judgementAttribute(pockers) && flushRule.judgementAttribute(pockers)){
			return true;
		}
		return false;
	}

}
