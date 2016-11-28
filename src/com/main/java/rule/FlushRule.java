package com.main.java.rule;

import java.util.List;

import com.main.java.entity.Pocker;
import com.main.java.util.PockersAttribute;

/**
 * FlushRule.java
 * 2016年11月28日下午7:48:40
 * @author cbb
 * TODO 同花
 */
public class FlushRule implements PockerRule{

	@Override
	public PockersAttribute getAttribute() {
		return PockersAttribute.FLUSH;
	}

	@Override
	public boolean judgementAttribute(List<Pocker> pockers) {
		if(pockers.get(0).colour.equals(pockers.get(1).colour) && pockers.get(2).colour.equals(pockers.get(1).colour)){
			return true;
		}
		return false;
	}

}
