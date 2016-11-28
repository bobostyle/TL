package com.main.java.util;

import java.util.ArrayList;
import java.util.List;

import com.main.java.entity.Colour;
import com.main.java.entity.Pocker;
import com.main.java.exception.NumberFaultException;

/**
 * AttributeJudge.java
 * 2016��11��13������1:07:41
 * @author cbb
 * TODO �ж���������
 */
public enum PockersAttribute {
	
	LEOPARD(5, "Leopard"), //����
	STRAIGHTFLUSH(4, "StraightFl"),  //ͬ��˳ 
	FLUSH(3, "Flush"),  //ͬ��
	STRAIGHT(2, "Straight"),  //˳�� 
	PAIR(1, "Pair"),  //����
	OTHER(0, "Other");  //ɢ��
	private int index;
	private String name;
	/**
	 * @return the index
	 */
	public int getIndex() {
		return index;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @param index the index to set
	 */
	public void setIndex(int index) {
		this.index = index;
	}
	
	private PockersAttribute(int indexValue, String nameValue){
		index = indexValue;
		name = nameValue;
	}
	
	public static PockersAttribute getAttribute(List<Pocker> pockers) throws NumberFaultException{
		OutOfThreeNumbersUtil.handleVaildNumException(pockers);
		if(isLeopard(pockers)){
			return LEOPARD;
		}
		if(isStraightFlush(pockers)){
			return STRAIGHTFLUSH;
		}
		if(isFlush(pockers)){
			return FLUSH;
		}
		if(isStraight(pockers)){
			return STRAIGHT;
		}
		if(isPair(pockers)){
			return PAIR;
		}
		
		return OTHER;
	}
	//�ж��Ƿ��Ǳ���
	private static boolean isLeopard(List<Pocker> pockers){
		if(pockers.get(0).vlaue == pockers.get(1).vlaue &&  pockers.get(1).vlaue == pockers.get(2).vlaue){
			return true;
		}
		return false;
	}
	//�ж��Ƿ��ǽ�
	private static boolean isFlush(List<Pocker> pockers){
		if(pockers.get(0).colour.equals(pockers.get(1).colour) && pockers.get(2).colour.equals(pockers.get(1).colour)){
			return true;
		}
		return false;
	}
	//�ж��Ƿ���˳��
	private static boolean isStraight(List<Pocker> pockers){
		SortPockerUtil.sort(pockers);
		if(pockers.get(1).getVlaue() - pockers.get(0).getVlaue() == 1 && pockers.get(2).getVlaue() - pockers.get(1).getVlaue() == 1){
			return true;
		}
		return false;
	}
	//�ж��Ƿ���ͬ��˳
	private static boolean isStraightFlush(List<Pocker> pockers){
		if(isFlush(pockers) && isStraight(pockers)){
			return true;
		}
		return false;
	}
	//�ж��Ƿ��Ƕ���
	private static boolean isPair(List<Pocker> pockers){
		SortPockerUtil.sort(pockers);
		if(!isLeopard(pockers) && (pockers.get(0).vlaue == pockers.get(1).vlaue || pockers.get(1).vlaue == pockers.get(2).vlaue)){
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		List<Pocker> pockers = new ArrayList<Pocker>();
		Pocker.THREE.setColour(Colour.HEART);
		Pocker.FOUR.setColour(Colour.HEART);
		Pocker.FIVE.setColour(Colour.HEART);
		pockers.add(Pocker.THREE);
		pockers.add(Pocker.FOUR);
		pockers.add(Pocker.FIVE);
		System.out.println(isLeopard(pockers));
		System.out.println(isFlush(pockers));
		System.out.println(isStraight(pockers));
		System.out.println(isStraightFlush(pockers));
		System.out.println(isPair(pockers));
	}
}
