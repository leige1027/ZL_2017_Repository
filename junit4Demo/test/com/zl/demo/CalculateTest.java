package com.zl.demo;

import static org.junit.Assert.*;

import org.junit.Test;

import com.zl.demo.Calculate;

public class CalculateTest {
	/*
	 * 1.测试方法上必须使用@Test修饰
	 * 2.测试方法必须使用public void 进行修饰,不能带参数
	 * 3.新建一个源代码目录来存放我们的测试代码
	 * 4.测试类的包应该和被测试类保持一致
	 * 5.测试单元中每个方法必须可以独立测试，测试方法之间不能有依赖
	 * 6.测试方法使用Test作为类名后缀，非必须
	 * 7.测试方法使用test作为方法名的前缀，非必须
	 * 8.Failure一般由单元测试使用的断言方法判断失败引起的，这表示测试点
	 *   发现了问题，程序输出结果跟我们预期不一致
	 * 9.error是代码异常引起的，它可以产生于测试代码本身的错误，
	 *   也可以是被测试代码中一个隐藏的bug
	 * 10.测试用例不是用来证明你是正确的，而是证明你没有错
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
