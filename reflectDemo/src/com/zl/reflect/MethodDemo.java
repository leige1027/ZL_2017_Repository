package com.zl.reflect;

import java.lang.reflect.Method;

public class MethodDemo {
	public static void main(String[] args) {
		/*
		 *  Ҫ��ȡprint(int,int)����
		 *  ���Ȼ�ȡ���������
		 */
		AA a1 =new AA();
		Class c = a1.getClass();
		/*
		 * ��ȡ����  ���ƺͲ����б����
		 * getMehod ��ȡpublic�ķ���
		 * getDeclaredMethod�Լ������ķ���
		 */
		try {
			// c.getMethod("print", new Class[]{int.class,int.class});
			Method m = c.getMethod("print", int.class,int.class);
			/*
			 *  �����ĵ���:
			 *  a1.print(10,20);
			 *  �����ķ������:
			 *  ��������з���ֵ���ؾ��巵��ֵ�����û�з���null
			 *  Object o = m.invoke(a1, new Object[]{10,20});
			 */
			Object o = m.invoke(a1, 10,20);
			
			System.out.println("=============-------------=============");
			
			// ��ȡ��������print(String,String)
			Method m1 = c.getMethod("print", String.class,String.class);
			// a1.pring("hello","world!")
			// �Է������з������
			o = m1.invoke(a1, "hello","world!");
			
			System.out.println("==============--------------============");
			
			//Method m2 =c.getMethod("print", new Class[]{});
			Method m2 = c.getMethod("print");
			//m2.invoke(a1,new Object[]{})
			m2.invoke(a1);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class AA{
	
	public void print(){
		System.out.println("hahahah...");
	}
	
	
	public void print(int a,int b){
		System.out.println(a+b);
	}
	
	
	public void print(String a,String b){
		System.out.println(a.toUpperCase()+"..."+b.toLowerCase());
	}
}