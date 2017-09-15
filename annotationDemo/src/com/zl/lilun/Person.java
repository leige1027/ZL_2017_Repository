package com.zl.lilun;


@Description("父类类名上的注解可以被继承。。。")
public abstract class  Person {
	
	@Description("父类方法上的注解不能被继承。。。")
	public String name() {
		return null;
	}
	
	public int age() {
		return 0;
	}
	
	@Deprecated
	public void sing() {
	}
	
}
