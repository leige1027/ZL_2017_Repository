package com.zl.lilun;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedArrayType;
import java.lang.reflect.Method;

public class parseAnnotation {
    public static void main(String[] args) {
    	Class c =null;
    	try {
    		// 1.ʹ���������������
			c =Class.forName("com.zl.jdkzidai.Child");
			// 2.�ҵ����ϵ�ע��
			boolean exist = c.isAnnotationPresent(Description.class);
			if(exist){
				// 3.�õ�ע��ʵ��
				Description d = (Description) c.getAnnotation(Description.class);
				System.out.println(d.value());
			}
    	
    	} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
    	System.out.println("--------------------------------------------------");
    	
    	// 4.�ҵ������ϵ�ע��
    	Method[] ms = c.getMethods();
    	for (Method m : ms) {
    		//1.
    		boolean mExist = m.isAnnotationPresent(Description.class);
    		if(mExist){
    			Description d = m.getAnnotation(Description.class);
    			System.out.println("��һ�ַ���:"+d.value());
    		}
    		
    		// 2.
			Annotation[] an=m.getAnnotations();
			for (Annotation a : an) {
				if(a instanceof Description){
					Description d = (Description) a;
					System.out.println("�ڶ��ַ���:"+d.value());
				}
			}
			
		}
    	
    	
    	
    }
}
