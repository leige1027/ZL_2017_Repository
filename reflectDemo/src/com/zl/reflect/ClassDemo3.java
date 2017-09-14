package com.zl.reflect;

public class ClassDemo3 {
	public static void main(String[] args) {
		String s ="hello";
		ClassUtil.printFieldMessage(s);;
		
		System.out.println("-------------------------------");
		
		Integer n1=1;
		ClassUtil.printFieldMessage(n1);
	}

}
