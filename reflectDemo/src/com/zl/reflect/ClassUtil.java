package com.zl.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassUtil {
	/**
	 * ��ӡ����ķ���������Ϣ
	 * @param obj �ö������������Ϣ
	 */
	public static void printMethodMessage(Object obj) {
		// Ҫ��ȡ�����Ϣ�����Ȼ�ȡ��������ͣ����ݵ��Ǹ�����Ķ���c���Ǹ������������
		Class c = obj.getClass();
		// ��ȡ�������
		System.out.println("���������: " + c.getName());
		/*
		 * Method�࣬�������� һ����Ա��������һ��Method����
		 * getMethods()������ȡ�������е�public�ĺ�������������̳ж�����
		 * getDeclaredMethods()��ȡ�������и����Լ������ķ��������ʷ���Ȩ��
		 */
		Method[] ms = c.getMethods();// c.getDeclaredMethods
		for (int i = 0; i < ms.length; i++) {
			// �õ���������ֵ���͵�������
			Class returnType = ms[i].getReturnType();
			System.out.print(returnType.getName() + " ");
			// �õ�������
			System.out.print(ms[i].getName() + "(");
			// ��ȡ��������-->�õ������б����͵�������
			Class[] paramTypes = ms[i].getParameterTypes();
			for (Class class1 : paramTypes) {
				System.out.print(class1.getName() + ",");
			}
			System.out.print(")");
			System.out.println("");
		}
	}

	/**
	 * ��ӡ����ĳ�Ա������Ϣ
	 * @param obj �ö������������Ϣ
	 */
	public static void printFieldMessage(Object obj) {
		// Ҫ��ȡ�����Ϣ�����Ȼ�ȡ��������ͣ����ݵ��Ǹ�����Ķ���c���Ǹ������������
		Class c = obj.getClass();
		// ��ȡ�������
		System.out.println("���������: " + c.getName());
		/**
		 * ��Ա����Ҳ�Ƕ��� java.lang.reflect.Field 
		 * Field���װ�˹��ڳ�Ա�����Ĳ���
		 * getFields()������ȡ��������public�ĳ�Ա������Ϣ 
		 * getDeclaredFields��ȡ���Ǹ����Լ������ĳ�Ա��������Ϣ
		 */
		Field[] fs = c.getDeclaredFields();
		for (Field field : fs) {
			// �õ���Ա���� ������ ��������
			Class fieldType = field.getType();
			String typeName = fieldType.getName();
			// �õ���Ա����������
			String fieldName = field.getName();
			System.out.println(typeName + " " + fieldName);
		}
	}
	
	/**
	 * ��ӡ����Ĺ��캯����Ϣ
	 * @param obj �ö������������Ϣ
	 */
	public static void printConMessage(Object obj){
		Class c = obj.getClass();
		/*
		 * ���캯��Ҳ�Ƕ���
		 * java.lang.Constructor�з�װ�˹��캯������Ϣ
		 * getConstructor��ȡ���е�public�Ĺ��캯��
		 * getDeclaredConstructors�õ����й��캯��
		 */
		Constructor[] cs =c.getDeclaredConstructors();
		for (Constructor constructor : cs) {
			System.out.print(constructor.getName()+"(");
			// ��ȡ���캯���Ĳ����б�-->�õ������б��������
			Class[] paramType = constructor.getParameterTypes();
			for (Class class1 : paramType) {
				System.out.print(class1.getName()+",");
			}
			System.out.print(")");
			System.out.println("");
		}
	}
	
}

















































