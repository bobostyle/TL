package com.main.java.exception;

 /**
 * NumberFaultException.java
 * 2016��11��13������12:26:12
 * @author cbb
 * TODO ����������������������,��ô�׳��쳣
 */
public class NumberFaultException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NumberFaultException(){
		super();
	}
	
	public NumberFaultException(String s){
		super(s);
	}
	
	public NumberFaultException(String s, Throwable throwable){
		super(s, throwable);
	}
}
