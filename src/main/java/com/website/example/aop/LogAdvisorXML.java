/*
 * 	
 *  주제(Subject): Spring Framework 4.2 - AOP 구현하기(XML)
 *  생성일자(Create Date): 2020-10-09
 *  파일명(Filename): LogAdvisorXML.java
 *  저자(Author): Dodo / rabbit.white at daum dot net
 *  비고(Description):
 * 
 */

package com.website.example.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogAdvisorXML implements LogAdvisor{
		
	// around advice
	@Override
	public Object aroundAdvice(ProceedingJoinPoint pjp) throws Throwable{
		
		System.out.println("2단계A?:");
		System.out.println("aroundMethod 호출 1");
		
		// 원래의 메소드를 호출한다.
		Object obj = pjp.proceed();

		System.out.println("2단계B?:");
		System.out.println("aroundMethod 호출 2");
		
		return obj;
	}

	// before advice
	@Override
	public void beforeAdvice() {
		System.out.println("1단계:");
		System.out.println("beforeMethod 호출");
		
	}

	// after
	@Override
	public void afterAdvice() {
		System.out.println("5단계:");
		System.out.println("afterMethod 호출");
		
	}

	// afterThrowing
	@Override
	public void afterThrowing() {
		System.out.println("4단계:");
		System.out.println("afterThrowing 호출");
		
	}

	// afterReturning
	@Override
	public void afterReturning() {
		System.out.println("3단계:");
		System.out.println("afterReturning 호출");
		
	}
	
}
