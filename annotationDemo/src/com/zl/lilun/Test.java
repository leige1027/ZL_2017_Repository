package com.zl.lilun;

public class Test {
	
	@SuppressWarnings("deprecation")
	public static void sing(){
		Person p= new Child();
		p.sing();
	}
	
	public static void main(String[] args) {
		sing();
	}
}
