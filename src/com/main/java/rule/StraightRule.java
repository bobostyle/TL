package com.main.java.rule;

import java.util.List;

import com.main.java.entity.Pocker;
import com.main.java.util.PockersAttribute;
import com.main.java.util.SortPockerUtil;

/**
 * StraightRule.java
 * 2016年11月28日下午7:50:25
 * @author cbb
 * TODO 顺子
 */
public class StraightRule implements PockerRule{

	@Override
	public PockersAttribute getAttribute() {
		return PockersAttribute.STRAIGHTFLUSH;
	}
	
	@Override
	public boolean judgementAttribute(List<Pocker> pockers) {
		SortPockerUtil.sort(pockers);
		if(pockers.get(1).getVlaue() - pockers.get(0).getVlaue() == 1 && pockers.get(2).getVlaue() - pockers.get(1).getVlaue() == 1){
			return true;
		}
		return false;
	}

}
