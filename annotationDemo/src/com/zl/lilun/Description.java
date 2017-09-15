package com.zl.lilun;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD,ElementType.TYPE}) // ע��������
@Retention(RetentionPolicy.RUNTIME) // ע����������
@Inherited // ��������̳У����ϵ�ע��
@Documented // ��ʶע�⣬����javadocʱ�����ע��
public @interface Description { // ʹ��@interface �ؼ��ֶ���ע��
 
	/*
	 * 1.��Ա����������
	 * 2.�Ϸ����Ͱ���:
	 *   ԭʼ�������͡�String��Class��Annotation��Enumeration
	 * 3.ע��ֻ��һ����Աʱ�����Ա������Ϊvalue()����ʹ��ʱ���Ժ��Գ�Ա���͸�ֵ�ţ�=��
	 * 4.ע�������û�г�Ա��û�г�Ա��ע���Ϊ��ʶע��  
	 * 5.��Ա���޲����쳣��ʽ����
	 * 6.������defaultΪ��Աָ��һ��Ĭ��ֵ
	 */
	String value();
	
//	String desc(); 
//	
//	String author();
//	
//	int age() default 18; 
	
}
