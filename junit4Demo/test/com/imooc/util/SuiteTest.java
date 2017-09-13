package com.imooc.util;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@Suite.SuiteClasses({TaskTest1.class,TaskTest2.class,TaskTest3.class})
public class SuiteTest {
	/*
	 * 1.测试套件就是组织测试类一起运行的
	 * 2.写一个测试套件的入口类，该类不包含任何方法
	 * 3.更改测试运行器Suite.class
	 * 4.将要测试的类作为数组传入Suite.SuiteClasses({})
	 * 
	 */
	
}
