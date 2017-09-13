package com.imooc.util;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitFlowTest {
	
	/*
	 * 1.@BeforeClass���εķ����������з���������ǰִ�У�
	 *   ���Ҹ÷����Ǿ�̬�ģ����Ե������౻���غ���žͻ����У�
	 *   ���ڴ���ֻ����һ��ʵ�����Ƚ��ʺϼ��������ļ���
	 * 2.@AfterClass���εķ���ͨ����������Դ��������ر����ݿ�����
	 * 3.@Before��@After����ÿ�����Է���ǰ���ִ��һ��
	 * 
	 */

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("beforeClass");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("afterClass");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("before");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("after");
	}
	 
	@Test
	public void test1(){
		System.out.println("test1=======");
	}

	@Test
	public void test2(){
		System.out.println("test2------");
	}

}
