/*
 * 	
 *  주제(Subject): Spring Framework 4.2 - AOP 구현하기(XML)
 *  생성일자(Create Date): 2020-10-09
 *  파일명(Filename): LogAdvisor.java
 *  저자(Author): Dodo / rabbit.white at daum dot net
 *  비고(Description):
 * 
 */

package com.website.example.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public interface LogAdvisor {

	public void beforeAdvice();
	public void afterAdvice();
	public Object aroundAdvice(ProceedingJoinPoint pjp) throws Throwable;
	public void afterThrowing();
	public void afterReturning();
	
}
