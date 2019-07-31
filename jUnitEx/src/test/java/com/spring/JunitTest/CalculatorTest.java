package com.spring.JunitTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
	
	@Test
	public void test() {
		Calculator c = new Calculator();
		
		double res = c.sum(10, 20);
		
		assertEquals(30, res, 0);// 예상 값 , 연산 결과 값 , 오차
		
	}
}
