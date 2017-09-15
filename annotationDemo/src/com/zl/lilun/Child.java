package com.zl.lilun;

//@Description("我是用默认value赋值的。。。。类上的注解")
public class Child extends Person{

	@Override
	public String name() {
		return null;
	}

	@Override
	@Description("子类方法上的注解")
	public int age() {
		return 22;
	}

	@Override
	public void sing() {
		System.out.println("sing...");
		
	}

}
