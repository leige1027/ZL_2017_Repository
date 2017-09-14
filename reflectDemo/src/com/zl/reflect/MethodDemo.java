package com.zl.reflect;

import java.lang.reflect.Method;

public class MethodDemo {
	public static void main(String[] args) {
		/*
		 *  要获取print(int,int)方法
		 *  首先获取类的类类型
		 */
		AA a1 =new AA();
		Class c = a1.getClass();
		/*
		 * 获取方法  名称和参数列表决定
		 * getMehod 获取public的方法
		 * getDeclaredMethod自己声明的方法
		 */
		try {
			// c.getMethod("print", new Class[]{int.class,int.class});
			Method m = c.getMethod("print", int.class,int.class);
			/*
			 *  方法的调用:
			 *  a1.print(10,20);
			 *  方法的反射操作:
			 *  方法如果有返回值返回具体返回值，如果没有返回null
			 *  Object o = m.invoke(a1, new Object[]{10,20});
			 */
			Object o = m.invoke(a1, 10,20);
			
			System.out.println("=============-------------=============");
			
			// 获取方法对象print(String,String)
			Method m1 = c.getMethod("print", String.class,String.class);
			// a1.pring("hello","world!")
			// 对方法进行反射操作
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