package com.zl.demo;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

import com.zl.demo.Calculate;

public class AnotationTest {

	/*
	 * @Test:��һ����ͨ�������γ�һ�����Է���
	 *   @Test(expected=XX.class):Ԥ���׳�һ���쳣
	 *   @Test(timeout=����):�Է�������ʱ����һ������
	 * @BeforeClass:���з�������ǰִ��һ�Σ�static����
	 * @AfterClass:���з������н���������һ�Σ�static����
	 * @Before:ÿ�����Է���ǰִ��һ��
	 * @After:ÿ�����Է�����ִ��һ��
	 * @Ignore:���εķ����ᱻ�������������ԣ����ᱻִ��
	 * @RunWith:���Ը��Ĳ������������̳�org.junit.runner.Runner
	 * 
	 */
	
	@Test(expected=ArithmeticException.class)
	public void testDivide() {
		assertEquals(3,new Calculate().divide(6, 0));
	}
	
	@Ignore("������Ϣ������Ϊʲô����ִ��")
	@Test(timeout=2000)
	public void testWhile(){
		while(true){
			System.out.println("run forever ...");
		}
	}
	
	@Test(timeout=3000)
	public void testReadFile(){
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}



























