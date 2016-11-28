package com.main.java.rule;

import java.util.List;

import com.main.java.entity.Pocker;
import com.main.java.util.PockersAttribute;
import com.main.java.util.SortPockerUtil;

/**
 * PairRule.java
 * 2016��11��28������7:51:33
 * @author cbb
 * TODO ����
 */
public class PairRule implements PockerRule{

	
	@Override
	public PockersAttribute getAttribute() {
		return PockersAttribute.PAIR;
	}

	@Override
	public boolean judgementAttribute(List<Pocker> pockers) {
		SortPockerUtil.sort(pockers);
		LeopardRule leopardRule = new LeopardRule();
		if(!leopardRule.judgementAttribute(pockers) && (pockers.get(0).vlaue == pockers.get(1).vlaue || pockers.get(1).vlaue == pockers.get(2).vlaue)){
			return true;
		}
		return false;
	}
}
