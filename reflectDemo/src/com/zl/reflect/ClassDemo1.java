package com.zl.reflect;


/*
 * A�� ��Ҳ��һ��ʵ������Class���ʵ������
 * �κ�һ���඼��Class��ʵ������
 * ��ʵ��������3�б�ʾ��ʽ
 * 
 */
class A{
	void say(){
		System.out.println("�����������ˡ�����");
	}
}
  
public class ClassDemo1 {
	public static void main(String[] args){
		/*
		 * A��ʵ�������ʾ
		 * new���������Ǿ�̬�����࣬
		 * �ڱ���ʱ�̾���Ҫ�������п���ʹ�õ�����
		 */
		A a1=new A();
		
		// 1��--->�κ�һ���඼��һ�������ľ�̬��Ա����class
		Class c1 = A.class;
		// 2��--->��֪����Ķ���ͨ��getClass����
		Class c2 = a1.getClass();
		
		/*
		 *  c1,c2��ʾA��������ͣ�class type��
		 *  ��������Զ���
		 *  ��Ҳ�Ƕ�����Class���ʵ������
		 *  ����������ǳ�Ϊ�����������
		 *  c1,c2��������A��������ͣ�һ����ֻ����Class���һ��ʵ������
		 */
		System.out.println(c1==c2);
		
		// 3��--->
		Class c3 = null;
		try {
			c3 = Class.forName("com.zl.reflect.A");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(c2==c3);
		
		// ����ͨ���ࣨA���������ͣ�c1,c2,c3��  ����  ���ࣨA���Ķ���ʵ����a1,a2...��
		try {
			A a2 = (A) c1.newInstance();
			a2.say();
			
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
	}
}

  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  