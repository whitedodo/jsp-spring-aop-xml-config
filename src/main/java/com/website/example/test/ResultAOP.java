/*
 * 	
 *  주제(Subject): Spring Framework 4.2 - AOP 구현하기(XML)
 *  생성일자(Create Date): 2020-10-09
 *  파일명(Filename): ResultAOP.java
 *  저자(Author): Dodo / rabbit.white at daum dot net
 *  비고(Description):
 * 
 */
package com.website.example.test;

public class ResultAOP {

	public void method1() {
		System.out.println("[중간]:");
		
		// afterThrowing 유발 코드
		//int d = 2/0;
		
		System.out.println("결과: 메서드");
	}
	
}