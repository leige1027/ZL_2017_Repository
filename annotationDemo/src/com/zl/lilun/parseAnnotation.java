package com.zl.lilun;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedArrayType;
import java.lang.reflect.Method;

public class parseAnnotation {
    public static void main(String[] args) {
    	Class c =null;
    	try {
    		// 1.使用类加载器加载类
			c =Class.forName("com.zl.jdkzidai.Child");
			// 2.找到类上的注解
			boolean exist = c.isAnnotationPresent(Description.class);
			if(exist){
				// 3.拿到注解实例
				Description d = (Description) c.getAnnotation(Description.class);
				System.out.println(d.value());
			}
    	
    	} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
    	System.out.println("--------------------------------------------------");
    	
    	// 4.找到方法上的注解
    	Method[] ms = c.getMethods();
    	for (Method m : ms) {
    		//1.
    		boolean mExist = m.isAnnotationPresent(Description.class);
    		if(mExist){
    			Description d = m.getAnnotation(Description.class);
    			System.out.println("第一种方法:"+d.value());
    		}
    		
    		// 2.
			Annotation[] an=m.getAnnotations();
			for (Annotation a : an) {
				if(a instanceof Description){
					Description d = (Description) a;
					System.out.println("第二种方法:"+d.value());
				}
			}
			
		}
    	
    	
    	
    }
}
