package com.zl.lilun;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD,ElementType.TYPE}) // 注解作用域
@Retention(RetentionPolicy.RUNTIME) // 注解生命周期
@Inherited // 允许子类继承，类上的注解
@Documented // 标识注解，生成javadoc时会包含注解
public @interface Description { // 使用@interface 关键字定义注解
 
	/*
	 * 1.成员类型受限制
	 * 2.合法类型包括:
	 *   原始数据类型、String、Class、Annotation、Enumeration
	 * 3.注解只有一个成员时，则成员名必须为value()，在使用时可以忽略成员名和赋值号（=）
	 * 4.注解类可以没有成员，没有成员的注解称为标识注解  
	 * 5.成员以无参无异常方式声明
	 * 6.可以用default为成员指定一个默认值
	 */
	String value();
	
//	String desc(); 
//	
//	String author();
//	
//	int age() default 18; 
	
}
