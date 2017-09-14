package com.zl.reflect;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class FanXingDemo {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		ArrayList<String> list1 = new ArrayList<String>();
		//����1 ��String��������
		list1.add("hello");
//		list1.add(20);�����
		
		Class c1 = list.getClass();
		Class c2 = list1.getClass();
		System.out.println(c1==c2);
		
		/*
		 * c1==c2 �������true,˵������֮�󼯺ϵķ�����ȥ���ͻ���
		 * ����Ĳ������Ǳ���֮��Ĳ���
		 * java�м��ϵķ��ͣ��Ƿ�ֹ��������ģ�ֻ�ڱ�������Ч��
		 * �ƹ������ھ���Ч��
		 * ��֤:ͨ�������ķ���������ƹ�����
		 */
		 try {
			Method m = c2.getMethod("add", Object.class);
			// ����һ��������������,�ƹ�����������ƹ��˷��ͣ�����
			m.invoke(list1, 20);
			// ����2�����ݣ�˵������ɹ�
			System.out.println(list1.size()+"������");
			System.out.println(list1);
			// ���ڲ����������������б��쳣
//			for (String string : list1) {
//				System.out.println(string);
//			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}









































