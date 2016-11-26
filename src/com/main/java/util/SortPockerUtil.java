package com.main.java.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.main.java.entity.Pocker;
import com.main.java.exception.NumberFaultException;

/**
 * SortUtil.java
 * 2016��11��13������12:17:22
 * @author cbb
 * TODO ��һ���ƽ������򣬷�������Ƚ�
 */
public class SortPockerUtil {
	
	private static final int NUMBERS = 3;
	//��С��������
	public static List<Pocker> sort(List<Pocker> pockers) {
		try{
			OutOfThreeNumbersUtil.handleVaildNumException(pockers);
		}catch(NumberFaultException ex){
			ex.printStackTrace();
		}
		Collections.sort(pockers, comparetor);
		return pockers;
	}	
	
	private static final Comparator<Pocker> comparetor = new Comparator<Pocker>(){
			@Override
			public int compare(Pocker pock1, Pocker pock2) {
				if(pock1.vlaue > pock2.vlaue){
					return 1;
				}else{
					return -1;
				}
			} 
	};
	
	public static void main(String[] args) {
		List<Pocker> pockers = new ArrayList<Pocker>();
		pockers.add(Pocker.FOUR);
		pockers.add(Pocker.THREE);
		pockers.add(Pocker.FIVE);
		SortPockerUtil.sort(pockers);
		for(Pocker pocker : pockers){
			System.out.println(pocker.getName());
		}
	}
}
