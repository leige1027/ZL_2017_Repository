package com.zl.reflect;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class FanXingDemo {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		ArrayList<String> list1 = new ArrayList<String>();
		//插入1 条String类型数据
		list1.add("hello");
//		list1.add(20);错误的
		
		Class c1 = list.getClass();
		Class c2 = list1.getClass();
		System.out.println(c1==c2);
		
		/*
		 * c1==c2 结果返回true,说明编译之后集合的泛型是去泛型化的
		 * 反射的操作都是编译之后的操作
		 * java中集合的泛型，是防止错误输入的，只在编译期有效，
		 * 绕过编译期就无效了
		 * 验证:通过方法的反射操作，绕过编译
		 */
		 try {
			Method m = c2.getMethod("add", Object.class);
			// 插入一条基本类型数据,绕过编译操作就绕过了泛型！！！
			m.invoke(list1, 20);
			// 返回2条数据，说明插入成功
			System.out.println(list1.size()+"条数据");
			System.out.println(list1);
			// 现在不能这样遍历，运行报异常
//			for (String string : list1) {
//				System.out.println(string);
//			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}









































