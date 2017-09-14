package com.zl.reflect;


/*
 * A类 ，也是一个实例对象，Class类的实例对象
 * 任何一个类都是Class的实例对象
 * 该实例对象有3中表示方式
 * 
 */
class A{
	void say(){
		System.out.println("方法被调用了。。。");
	}
}
  
public class ClassDemo1 {
	public static void main(String[] args){
		/*
		 * A的实例对象表示
		 * new创建对象，是静态加载类，
		 * 在编译时刻就需要加载所有可能使用到的类
		 */
		A a1=new A();
		
		// 1、--->任何一个类都有一个隐含的静态成员变量class
		Class c1 = A.class;
		// 2、--->已知该类的对象通过getClass方法
		Class c2 = a1.getClass();
		
		/*
		 *  c1,c2表示A类的类类型（class type）
		 *  万事万物皆对象
		 *  类也是对象，是Class类的实例对象
		 *  这个对象我们成为该类的类类型
		 *  c1,c2都代表了A类的类类型，一个类只能是Class类的一个实例对象
		 */
		System.out.println(c1==c2);
		
		// 3、--->
		Class c3 = null;
		try {
			c3 = Class.forName("com.zl.reflect.A");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(c2==c3);
		
		// 可以通过类（A）的类类型（c1,c2,c3）  创建  该类（A）的对象实例（a1,a2...）
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

  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  