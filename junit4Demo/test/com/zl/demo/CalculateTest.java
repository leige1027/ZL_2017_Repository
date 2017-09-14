package com.zl.demo;

import static org.junit.Assert.*;

import org.junit.Test;

import com.zl.demo.Calculate;

public class CalculateTest {
	/*
	 * 1.���Է����ϱ���ʹ��@Test����
	 * 2.���Է�������ʹ��public void ��������,���ܴ�����
	 * 3.�½�һ��Դ����Ŀ¼��������ǵĲ��Դ���
	 * 4.������İ�Ӧ�úͱ������ౣ��һ��
	 * 5.���Ե�Ԫ��ÿ������������Զ������ԣ����Է���֮�䲻��������
	 * 6.���Է���ʹ��Test��Ϊ������׺���Ǳ���
	 * 7.���Է���ʹ��test��Ϊ��������ǰ׺���Ǳ���
	 * 8.Failureһ���ɵ�Ԫ����ʹ�õĶ��Է����ж�ʧ������ģ����ʾ���Ե�
	 *   ���������⣬����������������Ԥ�ڲ�һ��
	 * 9.error�Ǵ����쳣����ģ������Բ����ڲ��Դ��뱾��Ĵ���
	 *   Ҳ�����Ǳ����Դ�����һ�����ص�bug
	 * 10.����������������֤��������ȷ�ģ�����֤����û�д�
	 */

	@Test
	public void testAdd(){
		assertEquals(5, new Calculate().add(3, 3));
	}
	@Test
	public void testSubtract(){
		assertEquals(3, new Calculate().substract(4, 1));
	}
	@Test
	public void testMultiply(){
		assertEquals(4, new Calculate().multiply(2, 2));
	}
	@Test
	public void testDivide(){
		assertEquals(3, new Calculate().divide(6, 0));
	}
}
