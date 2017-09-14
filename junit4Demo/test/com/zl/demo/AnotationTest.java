package com.zl.demo;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

import com.zl.demo.Calculate;

public class AnotationTest {

	/*
	 * @Test:将一个普通方法修饰成一个测试方法
	 *   @Test(expected=XX.class):预期抛出一个异常
	 *   @Test(timeout=毫秒):对方法运行时间做一个限制
	 * @BeforeClass:所有方法运行前执行一次，static修饰
	 * @AfterClass:所有方法运行结束后运行一次，static修饰
	 * @Before:每个测试方法前执行一次
	 * @After:每个测试方法后执行一次
	 * @Ignore:修饰的方法会被测试运行器忽略，不会被执行
	 * @RunWith:可以更改测试运行器，继承org.junit.runner.Runner
	 * 
	 */
	
	@Test(expected=ArithmeticException.class)
	public void testDivide() {
		assertEquals(3,new Calculate().divide(6, 0));
	}
	
	@Ignore("描述信息，比如为什么不被执行")
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



























