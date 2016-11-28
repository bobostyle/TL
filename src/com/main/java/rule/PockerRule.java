package com.main.java.rule;

import java.util.List;

import com.main.java.entity.Pocker;
import com.main.java.util.PockersAttribute;

/**
 * PockerRule.java
 * 2016年11月28日下午7:36:51
 * @author cbb
 * TODO 接口
 */
public interface PockerRule {
	
	PockersAttribute getAttribute();
	
	boolean judgementAttribute(List<Pocker> pockers);
	
}
