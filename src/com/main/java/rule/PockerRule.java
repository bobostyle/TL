package com.main.java.rule;

import java.util.List;

import com.main.java.entity.Pocker;
import com.main.java.util.PockersAttribute;

/**
 * PockerRule.java
 * 2016��11��28������7:36:51
 * @author cbb
 * TODO �ӿ�
 */
public interface PockerRule {
	
	PockersAttribute getAttribute();
	
	boolean judgementAttribute(List<Pocker> pockers);
	
}
