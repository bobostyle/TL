package com.main.java.rule;

import java.util.List;

import com.main.java.entity.Pocker;
import com.main.java.util.PockersAttribute;

/**
 * OtherRule.java
 * 2016��11��28������7:52:47
 * @author cbb
 * TODO //ɢ��
 */
public class OtherRule implements PockerRule{

	@Override
	public PockersAttribute getAttribute() {
		return PockersAttribute.OTHER;
	}

	@Override
	public boolean judgementAttribute(List<Pocker> pockers) {
		return true;
	}
}
