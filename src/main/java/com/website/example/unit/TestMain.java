/*
 * 	
 *  주제(Subject): Spring Framework 4.2 - AOP 구현하기(XML)
 *  생성일자(Create Date): 2020-10-09
 *  파일명(Filename): TestMain.java
 *  저자(Author): Dodo / rabbit.white at daum dot net
 *  비고(Description):
 * 
 */

package com.website.example.unit;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.website.example.test.ResultAOP;

public class TestMain {

	// 사용방법1
	@Test
	public void sample() {

		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		
		ResultAOP rAOP = (ResultAOP) factory.getBean("resultAOP");

		rAOP.method1();
		
		factory.close();
	}
	

	// 사용방법2
	@Test
	public void sample2() {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		ResultAOP rAOP = ctx.getBean("resultAOP", ResultAOP.class);
		//rAOP.method1();
		
		ctx.close();
	}
	
}
