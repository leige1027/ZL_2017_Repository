package com.zl.lilun;

//@Description("������Ĭ��value��ֵ�ġ����������ϵ�ע��")
public class Child extends Person{

	@Override
	public String name() {
		return null;
	}

	@Override
	@Description("���෽���ϵ�ע��")
	public int age() {
		return 22;
	}

	@Override
	public void sing() {
		System.out.println("sing...");
		
	}

}
