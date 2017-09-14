package com.zl.reflect;

public class ClassDemo2 {
	public static void main(String[] args) {
		String s ="hello";
		ClassUtil.printMethodMessage(s);
		
		System.out.println("-------------------------------");
		
		Integer n1=1;
		ClassUtil.printMethodMessage(n1);
	}
}
