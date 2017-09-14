package com.zl.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassUtil {
	/**
	 * 打印对象的方法函数信息
	 * @param obj 该对象所属类的信息
	 */
	public static void printMethodMessage(Object obj) {
		// 要获取类的信息，首先获取类的类类型，传递的那个子类的对象，c就是该子类的类类型
		Class c = obj.getClass();
		// 获取类的名称
		System.out.println("类的名称是: " + c.getName());
		/*
		 * Method类，方法对象 一个成员变量就是一个Method对象
		 * getMethods()方法获取的是所有的public的函数，包括父类继承而来的
		 * getDeclaredMethods()获取的是所有该类自己生命的方法，不问访问权限
		 */
		Method[] ms = c.getMethods();// c.getDeclaredMethods
		for (int i = 0; i < ms.length; i++) {
			// 得到方法返回值类型的类类型
			Class returnType = ms[i].getReturnType();
			System.out.print(returnType.getName() + " ");
			// 得到方法名
			System.out.print(ms[i].getName() + "(");
			// 获取参数类型-->得到参数列表类型的类类型
			Class[] paramTypes = ms[i].getParameterTypes();
			for (Class class1 : paramTypes) {
				System.out.print(class1.getName() + ",");
			}
			System.out.print(")");
			System.out.println("");
		}
	}

	/**
	 * 打印对象的成员变量信息
	 * @param obj 该对象所属类的信息
	 */
	public static void printFieldMessage(Object obj) {
		// 要获取类的信息，首先获取类的类类型，传递的那个子类的对象，c就是该子类的类类型
		Class c = obj.getClass();
		// 获取类的名称
		System.out.println("类的名称是: " + c.getName());
		/**
		 * 成员变量也是对象 java.lang.reflect.Field 
		 * Field类封装了关于成员变量的操作
		 * getFields()方法获取的是所有public的成员变量信息 
		 * getDeclaredFields获取的是该类自己声明的成员变量的信息
		 */
		Field[] fs = c.getDeclaredFields();
		for (Field field : fs) {
			// 得到成员变量 的类型 的类类型
			Class fieldType = field.getType();
			String typeName = fieldType.getName();
			// 得到成员变量的名称
			String fieldName = field.getName();
			System.out.println(typeName + " " + fieldName);
		}
	}
	
	/**
	 * 打印对象的构造函数信息
	 * @param obj 该对象所属类的信息
	 */
	public static void printConMessage(Object obj){
		Class c = obj.getClass();
		/*
		 * 构造函数也是对象
		 * java.lang.Constructor中封装了构造函数的信息
		 * getConstructor获取所有的public的构造函数
		 * getDeclaredConstructors得到所有构造函数
		 */
		Constructor[] cs =c.getDeclaredConstructors();
		for (Constructor constructor : cs) {
			System.out.print(constructor.getName()+"(");
			// 获取构造函数的参数列表-->得到参数列表的类类型
			Class[] paramType = constructor.getParameterTypes();
			for (Class class1 : paramType) {
				System.out.print(class1.getName()+",");
			}
			System.out.print(")");
			System.out.println("");
		}
	}
	
}

















































