package com.main.java.servcie;

import java.util.ArrayList;
import java.util.List;

import com.main.java.entity.Colour;
import com.main.java.entity.Pocker;
import com.main.java.exception.NumberFaultException;
import com.main.java.rule.JudgePockerRule;
import com.main.java.util.PockersAttribute;
import com.main.java.util.SortPockerUtil;

/**
 * ComperService.java
 * 2016年11月13日上午12:14:29
 * @author cbb
 * TODO 比较大小的接口
 */
public class ComperService {
	
	private static final int INDEX = 1;
	public static boolean compare(List<Pocker> pockerA, List<Pocker> pockerB) throws NumberFaultException{
		SortPockerUtil.sort(pockerA);
		SortPockerUtil.sort(pockerB);
		
		PockersAttribute attributeOfA = JudgePockerRule.getInstance().getAttribute(pockerA);
		System.out.println(attributeOfA.getName());
		
		PockersAttribute attributeOfB = JudgePockerRule.getInstance().getAttribute(pockerB);
		System.out.println(attributeOfB.getName());
		//对子除外，其他都可以先判断属于哪类，然后比较最大值
		if(attributeOfA.getIndex() == attributeOfB.getIndex()){
			 if(attributeOfB.getIndex() != INDEX){
				 return pockerA.get(2).getVlaue() > pockerB.get(2).getVlaue();
			 }
			 return judgementPair(pockerA, pockerB);
		}
		return attributeOfA.getIndex() > attributeOfB.getIndex();
	}
	
	private static boolean judgementPair(List<Pocker> pockersA, List<Pocker> pockersB){
		if(pockersA.get(1).getVlaue() == pockersB.get(1).getVlaue()){
			return pockersA.get(2).getVlaue() >  pockersB.get(2).getVlaue();
		}
		return pockersA.get(1).getVlaue() > pockersB.get(1).getVlaue();
	}
	
	public static void main(String[] args) {
		List<Pocker> pockera = new ArrayList<Pocker>();
		Pocker.THREE.setColour(Colour.HEART);
		Pocker.FOUR.setColour(Colour.HEART);
		Pocker.FIVE.setColour(Colour.HEART);
		pockera.add(Pocker.THREE);
		pockera.add(Pocker.FOUR);
		pockera.add(Pocker.FIVE);
		
		List<Pocker> pockerb = new ArrayList<Pocker>();
		Pocker.FIVE.setColour(Colour.SPADE);
		Pocker.K.setColour(Colour.HEART);
		Pocker.NINE.setColour(Colour.HEART);
		pockerb.add(Pocker.FIVE);
		pockerb.add(Pocker.K);
		pockerb.add(Pocker.NINE);
		try{
			System.out.println(ComperService.compare(pockerb, pockera));
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
}
//对子的特性是，排序后，中间那张一定是对子中的一个
