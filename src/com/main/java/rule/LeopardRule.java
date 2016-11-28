package com.main.java.rule;

import java.util.List;

import com.main.java.entity.Pocker;
import com.main.java.util.PockersAttribute;

/**
 * LeopardRule.java
 * 2016��11��28������7:43:48
 * @author cbb 
 * TODO �жϱ���
 */
public class LeopardRule implements PockerRule{

	@Override
	public PockersAttribute getAttribute() {
		return PockersAttribute.LEOPARD;
	}

	@Override
	public boolean judgementAttribute(List<Pocker> pockers) {
		if(pockers.get(0).vlaue == pockers.get(1).vlaue &&  pockers.get(1).vlaue == pockers.get(2).vlaue){
			return true;
		}
		return false;
	}

}
