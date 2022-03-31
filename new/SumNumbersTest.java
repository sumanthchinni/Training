package com.training;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

import com.training.day1.SumNumbers;

class SumNumbersTest {
	private SumNumbers obj=new SumNumbers();
	
	@Test
	public void sumTest1() {
		
		assertEquals(15, obj.sum(9, 6));
	}
	
	@Test
	public void sumTest2() {
		
		assertNotEquals(14, obj.sum(9, 6));
	}
	

	

}
